package org.telegram.ui.Components;

import android.media.AudioTimestamp;
import java.nio.ByteBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class d60 implements Runnable {
    public final /* synthetic */ e60 a;

    public d60(e60 e60Var) {
        this.a = e60Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0034, code lost:
    
        if (r22.a.X == 0) goto L79;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        u50 u50Var;
        long j3;
        long j10;
        AudioTimestamp audioTimestamp = new AudioTimestamp();
        long j11 = -1;
        long j12 = -1;
        boolean z10 = false;
        boolean z11 = true;
        while (!z10) {
            if ((!this.a.W || this.a.D0) && this.a.y0.getRecordingState() != 1) {
                try {
                    this.a.y0.stop();
                } catch (Exception unused) {
                    z10 = true;
                }
            }
            boolean z12 = z10;
            if (this.a.z0.isEmpty()) {
                try {
                    u50Var = new u50();
                } catch (OutOfMemoryError unused2) {
                    System.gc();
                    u50Var = new u50();
                }
            } else {
                u50Var = (u50) this.a.z0.poll();
            }
            u50 u50Var2 = u50Var;
            u50Var2.e = 0;
            u50Var2.d = 10;
            int i10 = 0;
            while (true) {
                if (i10 >= 10) {
                    break;
                }
                long j13 = 1000;
                if (j12 == j11 && !z11) {
                    j12 = System.nanoTime() / 1000;
                }
                ByteBuffer byteBuffer = u50Var2.a[i10];
                byteBuffer.rewind();
                int read = this.a.y0.read(byteBuffer, 2048);
                if (read <= 0 || i10 % 2 != 0) {
                    j3 = 1000;
                } else {
                    byteBuffer.limit(read);
                    double d = 0.0d;
                    int i11 = 0;
                    while (true) {
                        j3 = j13;
                        if (i11 >= read / 2) {
                            break;
                        }
                        short s10 = byteBuffer.getShort();
                        d += s10 * s10;
                        i11++;
                        j13 = j3;
                    }
                    final double sqrt = Math.sqrt((d / read) / 2.0d);
                    AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.c60
                        @Override // java.lang.Runnable
                        public final void run() {
                            e60 e60Var = d60.this.a;
                            NotificationCenter.getInstance(e60Var.H0.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordProgressChanged, Integer.valueOf(e60Var.H0.Q), Double.valueOf(sqrt));
                        }
                    });
                    byteBuffer.position(0);
                }
                if (read <= 0) {
                    u50Var2.d = i10;
                    if (!this.a.W) {
                        u50Var2.f = true;
                    }
                } else {
                    if (z11) {
                        try {
                            this.a.y0.getTimestamp(audioTimestamp, 0);
                            j10 = j12;
                            j12 = audioTimestamp.nanoTime / j3;
                        } catch (Exception e) {
                            FileLog.e(e);
                            j12 = System.nanoTime() / j3;
                            j10 = j12;
                            z11 = false;
                        }
                    } else {
                        j10 = j12;
                    }
                    u50Var2.b[i10] = j12;
                    u50Var2.c[i10] = read;
                    int i12 = ((read * MediaController.VIDEO_BITRATE_480) / 48000) / 2;
                    if (!z11) {
                        j10 += i12;
                    }
                    j12 = j10;
                    i10++;
                    j11 = -1;
                }
            }
            if (u50Var2.d >= 0 || u50Var2.f) {
                if (!this.a.W && u50Var2.d < 10) {
                    z12 = true;
                }
                this.a.T.sendMessage(this.a.T.obtainMessage(3, u50Var2));
            } else if (this.a.W) {
                try {
                    this.a.z0.put(u50Var2);
                } catch (Exception unused3) {
                }
            } else {
                z10 = true;
                j11 = -1;
            }
            z10 = z12;
            j11 = -1;
        }
        try {
            this.a.y0.release();
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (this.a.D0) {
            return;
        }
        this.a.T.sendMessage(this.a.T.obtainMessage(1, this.a.X, 0, this.a.Y));
    }
}
