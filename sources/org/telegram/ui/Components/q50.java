package org.telegram.ui.Components;

import android.media.AudioTimestamp;
import java.nio.ByteBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q50 implements Runnable {
    public final /* synthetic */ r50 a;

    public q50(r50 r50Var) {
        this.a = r50Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0034, code lost:
    
        if (r22.a.T == 0) goto L79;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        h50 h50Var;
        long j10;
        long j11;
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        long j12 = -1;
        long j13 = -1;
        boolean z10 = false;
        boolean z11 = true;
        while (!z10) {
            if ((!this.a.S || this.a.z0) && this.a.u0.getRecordingState() != 1) {
                try {
                    this.a.u0.stop();
                } catch (Exception unused) {
                    z10 = true;
                }
            }
            boolean z12 = z10;
            if (this.a.v0.isEmpty()) {
                try {
                    h50Var = new h50();
                } catch (OutOfMemoryError unused2) {
                    System.gc();
                    h50Var = new h50();
                }
            } else {
                h50Var = (h50) this.a.v0.poll();
            }
            h50 h50Var2 = h50Var;
            h50Var2.e = 0;
            h50Var2.d = 10;
            int i10 = 0;
            while (true) {
                if (i10 >= 10) {
                    break;
                }
                long j14 = 1000;
                if (j13 == j12 && !z11) {
                    j13 = System.nanoTime() / 1000;
                }
                ByteBuffer byteBuffer = h50Var2.a[i10];
                byteBuffer.rewind();
                int read = this.a.u0.read(byteBuffer, 2048);
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
                        short s10 = byteBuffer.getShort();
                        d += s10 * s10;
                        i11++;
                        j14 = j10;
                    }
                    final double sqrt = Math.sqrt((d / read) / 2.0d);
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.p50
                        @Override // java.lang.Runnable
                        public final void run() {
                            r50 r50Var = q50.this.a;
                            NotificationCenter.getInstance(r50Var.D0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordProgressChanged, Integer.valueOf(r50Var.D0.M), Double.valueOf(sqrt));
                        }
                    });
                    byteBuffer.position(0);
                }
                if (read <= 0) {
                    h50Var2.d = i10;
                    if (!this.a.S) {
                        h50Var2.f = true;
                    }
                } else {
                    if (z11) {
                        try {
                            this.a.u0.getTimestamp(audioTimestamp, 0);
                            j11 = j13;
                            j13 = audioTimestamp.nanoTime / j10;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            j13 = System.nanoTime() / j10;
                            j11 = j13;
                            z11 = false;
                        }
                    } else {
                        j11 = j13;
                    }
                    h50Var2.b[i10] = j13;
                    h50Var2.c[i10] = read;
                    int i12 = ((read * MediaController.VIDEO_BITRATE_480) / 48000) / 2;
                    if (!z11) {
                        j11 += i12;
                    }
                    j13 = j11;
                    i10++;
                    j12 = -1;
                }
            }
            if (h50Var2.d >= 0 || h50Var2.f) {
                if (!this.a.S && h50Var2.d < 10) {
                    z12 = true;
                }
                this.a.P.sendMessage(this.a.P.obtainMessage(3, h50Var2));
            } else if (this.a.S) {
                try {
                    this.a.v0.put(h50Var2);
                } catch (Exception unused3) {
                }
            } else {
                z10 = true;
                j12 = -1;
            }
            z10 = z12;
            j12 = -1;
        }
        try {
            this.a.u0.release();
        } catch (Exception e11) {
            FileLog.e(e11);
        }
        if (this.a.z0) {
            return;
        }
        this.a.P.sendMessage(this.a.P.obtainMessage(1, this.a.T, 0, this.a.U));
    }
}
