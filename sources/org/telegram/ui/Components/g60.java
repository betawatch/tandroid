package org.telegram.ui.Components;

import android.media.AudioTimestamp;
import android.os.SystemClock;
import j$.util.Collection;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x006b, code lost:
    
        if (((org.telegram.ui.Components.h60) r22.b).X == 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        w50 w50Var;
        long j10;
        long j11;
        switch (this.a) {
            case 0:
                AudioTimestamp audioTimestamp = new AudioTimestamp();
                long j12 = -1;
                long j13 = -1;
                boolean z10 = false;
                boolean z11 = true;
                while (!z10) {
                    if ((!((h60) this.b).W || ((h60) this.b).D0) && ((h60) this.b).y0.getRecordingState() != 1) {
                        try {
                            ((h60) this.b).y0.stop();
                        } catch (Exception unused) {
                            z10 = true;
                        }
                        break;
                    }
                    boolean z12 = z10;
                    if (((h60) this.b).z0.isEmpty()) {
                        try {
                            w50Var = new w50();
                        } catch (OutOfMemoryError unused2) {
                            System.gc();
                            w50Var = new w50();
                        }
                    } else {
                        w50Var = (w50) ((h60) this.b).z0.poll();
                    }
                    w50 w50Var2 = w50Var;
                    w50Var2.e = 0;
                    w50Var2.d = 10;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 10) {
                            long j14 = 1000;
                            if (j13 == j12 && !z11) {
                                j13 = System.nanoTime() / 1000;
                            }
                            ByteBuffer byteBuffer = w50Var2.a[i10];
                            byteBuffer.rewind();
                            int read = ((h60) this.b).y0.read(byteBuffer, 2048);
                            if (read <= 0 || i10 % 2 != 0) {
                                j10 = 1000;
                            } else {
                                byteBuffer.limit(read);
                                double d = 0.0d;
                                int i11 = 0;
                                while (true) {
                                    j10 = j14;
                                    if (i11 < read / 2) {
                                        short s10 = byteBuffer.getShort();
                                        d += s10 * s10;
                                        i11++;
                                        j14 = j10;
                                    } else {
                                        final double sqrt = Math.sqrt((d / read) / 2.0d);
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.f60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                h60 h60Var = (h60) g60.this.b;
                                                NotificationCenter.getInstance(h60Var.H0.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordProgressChanged, Integer.valueOf(h60Var.H0.V), Double.valueOf(sqrt));
                                            }
                                        });
                                        byteBuffer.position(0);
                                    }
                                }
                            }
                            if (read <= 0) {
                                w50Var2.d = i10;
                                if (!((h60) this.b).W) {
                                    w50Var2.f = true;
                                }
                            } else {
                                if (z11) {
                                    try {
                                        ((h60) this.b).y0.getTimestamp(audioTimestamp, 0);
                                        j11 = j13;
                                        j13 = audioTimestamp.nanoTime / j10;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        j13 = System.nanoTime() / j10;
                                        z11 = false;
                                    }
                                    w50Var2.b[i10] = j13;
                                    w50Var2.c[i10] = read;
                                    int i12 = ((read * MediaController.VIDEO_BITRATE_480) / 48000) / 2;
                                    if (z11) {
                                        j11 += i12;
                                    }
                                    j13 = j11;
                                    i10++;
                                    j12 = -1;
                                }
                                j11 = j13;
                                w50Var2.b[i10] = j13;
                                w50Var2.c[i10] = read;
                                int i122 = ((read * MediaController.VIDEO_BITRATE_480) / 48000) / 2;
                                if (z11) {
                                }
                                j13 = j11;
                                i10++;
                                j12 = -1;
                            }
                        }
                    }
                    if (w50Var2.d >= 0 || w50Var2.f) {
                        if (!((h60) this.b).W && w50Var2.d < 10) {
                            z12 = true;
                        }
                        ((h60) this.b).T.sendMessage(((h60) this.b).T.obtainMessage(3, w50Var2));
                    } else if (((h60) this.b).W) {
                        try {
                            ((h60) this.b).z0.put(w50Var2);
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
                    ((h60) this.b).y0.release();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (!((h60) this.b).D0) {
                    ((h60) this.b).T.sendMessage(((h60) this.b).T.obtainMessage(1, ((h60) this.b).X, 0, ((h60) this.b).Y));
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.b;
                WeakHashMap weakHashMap = x5Var.e;
                Collection.-EL.removeIf(weakHashMap.entrySet(), new org.telegram.ui.u8(uptimeMillis, 2));
                if (!weakHashMap.isEmpty()) {
                    x5Var.d.postDelayed(this, 250L);
                    break;
                } else {
                    x5Var.a();
                    break;
                }
        }
    }
}
