package org.telegram.ui.Components;

import android.media.AudioTimestamp;
import java.nio.ByteBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w50 implements Runnable {
    public final /* synthetic */ x50 a;

    public w50(x50 x50Var) {
        this.a = x50Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0034, code lost:
    
        if (r22.a.U == 0) goto L79;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        n50 n50Var;
        long j10;
        long j11;
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        long j12 = -1;
        long j13 = -1;
        boolean z4 = false;
        boolean z10 = true;
        while (!z4) {
            if ((!this.a.T || this.a.A0) && this.a.v0.getRecordingState() != 1) {
                try {
                    this.a.v0.stop();
                } catch (Exception unused) {
                    z4 = true;
                }
            }
            boolean z11 = z4;
            if (this.a.w0.isEmpty()) {
                try {
                    n50Var = new n50();
                } catch (OutOfMemoryError unused2) {
                    System.gc();
                    n50Var = new n50();
                }
            } else {
                n50Var = (n50) this.a.w0.poll();
            }
            n50 n50Var2 = n50Var;
            n50Var2.e = 0;
            n50Var2.d = 10;
            int i10 = 0;
            while (true) {
                if (i10 >= 10) {
                    break;
                }
                long j14 = 1000;
                if (j13 == j12 && !z10) {
                    j13 = System.nanoTime() / 1000;
                }
                ByteBuffer byteBuffer = n50Var2.a[i10];
                byteBuffer.rewind();
                int read = this.a.v0.read(byteBuffer, 2048);
                if (read <= 0 || i10 % 2 != 0) {
                    j10 = 1000;
                } else {
                    byteBuffer.limit(read);
                    double d = 0.0d;
                    int i11 = 0;
                    while (true) {
                        j10 = j14;
                        if (i11 >= read / 2) {
                            break;
                        }
                        short s6 = byteBuffer.getShort();
                        d += s6 * s6;
                        i11++;
                        j14 = j10;
                    }
                    final double sqrt = Math.sqrt((d / read) / 2.0d);
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.v50
                        @Override // java.lang.Runnable
                        public final void run() {
                            x50 x50Var = w50.this.a;
                            NotificationCenter.getInstance(x50Var.E0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordProgressChanged, Integer.valueOf(x50Var.E0.N), Double.valueOf(sqrt));
                        }
                    });
                    byteBuffer.position(0);
                }
                if (read <= 0) {
                    n50Var2.d = i10;
                    if (!this.a.T) {
                        n50Var2.f = true;
                    }
                } else {
                    if (z10) {
                        try {
                            this.a.v0.getTimestamp(audioTimestamp, 0);
                            j11 = j13;
                            j13 = audioTimestamp.nanoTime / j10;
                        } catch (Exception e) {
                            FileLog.e(e);
                            j13 = System.nanoTime() / j10;
                            j11 = j13;
                            z10 = false;
                        }
                    } else {
                        j11 = j13;
                    }
                    n50Var2.b[i10] = j13;
                    n50Var2.c[i10] = read;
                    int i12 = ((read * MediaController.VIDEO_BITRATE_480) / 48000) / 2;
                    if (!z10) {
                        j11 += i12;
                    }
                    j13 = j11;
                    i10++;
                    j12 = -1;
                }
            }
            if (n50Var2.d >= 0 || n50Var2.f) {
                if (!this.a.T && n50Var2.d < 10) {
                    z11 = true;
                }
                this.a.Q.sendMessage(this.a.Q.obtainMessage(3, n50Var2));
            } else if (this.a.T) {
                try {
                    this.a.w0.put(n50Var2);
                } catch (Exception unused3) {
                }
            } else {
                z4 = true;
                j12 = -1;
            }
            z4 = z11;
            j12 = -1;
        }
        try {
            this.a.v0.release();
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (this.a.A0) {
            return;
        }
        this.a.Q.sendMessage(this.a.Q.obtainMessage(1, this.a.U, 0, this.a.V));
    }
}
