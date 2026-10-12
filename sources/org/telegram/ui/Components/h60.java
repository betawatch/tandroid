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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class h60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x006b, code lost:
    
        if (((org.telegram.ui.Components.i60) r22.b).X == 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        x50 x50Var;
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
                    if ((!((i60) this.b).W || ((i60) this.b).D0) && ((i60) this.b).y0.getRecordingState() != 1) {
                        try {
                            ((i60) this.b).y0.stop();
                        } catch (Exception unused) {
                            z10 = true;
                        }
                        break;
                    }
                    boolean z12 = z10;
                    if (((i60) this.b).z0.isEmpty()) {
                        try {
                            x50Var = new x50();
                        } catch (OutOfMemoryError unused2) {
                            System.gc();
                            x50Var = new x50();
                        }
                    } else {
                        x50Var = (x50) ((i60) this.b).z0.poll();
                    }
                    x50 x50Var2 = x50Var;
                    x50Var2.e = 0;
                    x50Var2.d = 10;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 10) {
                            long j14 = 1000;
                            if (j13 == j12 && !z11) {
                                j13 = System.nanoTime() / 1000;
                            }
                            ByteBuffer byteBuffer = x50Var2.a[i10];
                            byteBuffer.rewind();
                            int read = ((i60) this.b).y0.read(byteBuffer, 2048);
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
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.g60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                i60 i60Var = (i60) h60.this.b;
                                                NotificationCenter.getInstance(i60Var.H0.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordProgressChanged, Integer.valueOf(i60Var.H0.V), Double.valueOf(sqrt));
                                            }
                                        });
                                        byteBuffer.position(0);
                                    }
                                }
                            }
                            if (read <= 0) {
                                x50Var2.d = i10;
                                if (!((i60) this.b).W) {
                                    x50Var2.f = true;
                                }
                            } else {
                                if (z11) {
                                    try {
                                        ((i60) this.b).y0.getTimestamp(audioTimestamp, 0);
                                        j11 = j13;
                                        j13 = audioTimestamp.nanoTime / j10;
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                        j13 = System.nanoTime() / j10;
                                        z11 = false;
                                    }
                                    x50Var2.b[i10] = j13;
                                    x50Var2.c[i10] = read;
                                    int i12 = ((read * MediaController.VIDEO_BITRATE_480) / 48000) / 2;
                                    if (z11) {
                                        j11 += i12;
                                    }
                                    j13 = j11;
                                    i10++;
                                    j12 = -1;
                                }
                                j11 = j13;
                                x50Var2.b[i10] = j13;
                                x50Var2.c[i10] = read;
                                int i122 = ((read * MediaController.VIDEO_BITRATE_480) / 48000) / 2;
                                if (z11) {
                                }
                                j13 = j11;
                                i10++;
                                j12 = -1;
                            }
                        }
                    }
                    if (x50Var2.d >= 0 || x50Var2.f) {
                        if (!((i60) this.b).W && x50Var2.d < 10) {
                            z12 = true;
                        }
                        ((i60) this.b).T.sendMessage(((i60) this.b).T.obtainMessage(3, x50Var2));
                    } else if (((i60) this.b).W) {
                        try {
                            ((i60) this.b).z0.put(x50Var2);
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
                    ((i60) this.b).y0.release();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (!((i60) this.b).D0) {
                    ((i60) this.b).T.sendMessage(((i60) this.b).T.obtainMessage(1, ((i60) this.b).X, 0, ((i60) this.b).Y));
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                org.telegram.ui.Wallet.k5 k5Var = (org.telegram.ui.Wallet.k5) this.b;
                WeakHashMap weakHashMap = k5Var.e;
                Collection.-EL.removeIf(weakHashMap.entrySet(), new org.telegram.ui.t8(uptimeMillis, 3));
                if (!weakHashMap.isEmpty()) {
                    k5Var.d.postDelayed(this, 250L);
                    break;
                } else {
                    k5Var.a();
                    break;
                }
        }
    }
}
