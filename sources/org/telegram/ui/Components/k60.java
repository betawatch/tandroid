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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class k60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x006b, code lost:
    
        if (((org.telegram.ui.Components.l60) r22.b).X == 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        b60 b60Var;
        long j3;
        long j10;
        switch (this.a) {
            case 0:
                AudioTimestamp audioTimestamp = new AudioTimestamp();
                long j11 = -1;
                long j12 = -1;
                boolean z10 = false;
                boolean z11 = true;
                while (!z10) {
                    if ((!((l60) this.b).W || ((l60) this.b).D0) && ((l60) this.b).y0.getRecordingState() != 1) {
                        try {
                            ((l60) this.b).y0.stop();
                        } catch (Exception unused) {
                            z10 = true;
                        }
                        break;
                    }
                    boolean z12 = z10;
                    if (((l60) this.b).z0.isEmpty()) {
                        try {
                            b60Var = new b60();
                        } catch (OutOfMemoryError unused2) {
                            System.gc();
                            b60Var = new b60();
                        }
                    } else {
                        b60Var = (b60) ((l60) this.b).z0.poll();
                    }
                    b60 b60Var2 = b60Var;
                    b60Var2.e = 0;
                    b60Var2.d = 10;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 10) {
                            long j13 = 1000;
                            if (j12 == j11 && !z11) {
                                j12 = System.nanoTime() / 1000;
                            }
                            ByteBuffer byteBuffer = b60Var2.a[i10];
                            byteBuffer.rewind();
                            int read = ((l60) this.b).y0.read(byteBuffer, 2048);
                            if (read <= 0 || i10 % 2 != 0) {
                                j3 = 1000;
                            } else {
                                byteBuffer.limit(read);
                                double d = 0.0d;
                                int i11 = 0;
                                while (true) {
                                    j3 = j13;
                                    if (i11 < read / 2) {
                                        short s10 = byteBuffer.getShort();
                                        d += s10 * s10;
                                        i11++;
                                        j13 = j3;
                                    } else {
                                        final double sqrt = Math.sqrt((d / read) / 2.0d);
                                        AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.Components.j60
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                l60 l60Var = (l60) k60.this.b;
                                                NotificationCenter.getInstance(l60Var.H0.f).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordProgressChanged, Integer.valueOf(l60Var.H0.V), Double.valueOf(sqrt));
                                            }
                                        });
                                        byteBuffer.position(0);
                                    }
                                }
                            }
                            if (read <= 0) {
                                b60Var2.d = i10;
                                if (!((l60) this.b).W) {
                                    b60Var2.f = true;
                                }
                            } else {
                                if (z11) {
                                    try {
                                        ((l60) this.b).y0.getTimestamp(audioTimestamp, 0);
                                        j10 = j12;
                                        j12 = audioTimestamp.nanoTime / j3;
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                        j12 = System.nanoTime() / j3;
                                        z11 = false;
                                    }
                                    b60Var2.b[i10] = j12;
                                    b60Var2.c[i10] = read;
                                    int i12 = ((read * MediaController.VIDEO_BITRATE_480) / 48000) / 2;
                                    if (z11) {
                                        j10 += i12;
                                    }
                                    j12 = j10;
                                    i10++;
                                    j11 = -1;
                                }
                                j10 = j12;
                                b60Var2.b[i10] = j12;
                                b60Var2.c[i10] = read;
                                int i122 = ((read * MediaController.VIDEO_BITRATE_480) / 48000) / 2;
                                if (z11) {
                                }
                                j12 = j10;
                                i10++;
                                j11 = -1;
                            }
                        }
                    }
                    if (b60Var2.d >= 0 || b60Var2.f) {
                        if (!((l60) this.b).W && b60Var2.d < 10) {
                            z12 = true;
                        }
                        ((l60) this.b).T.sendMessage(((l60) this.b).T.obtainMessage(3, b60Var2));
                    } else if (((l60) this.b).W) {
                        try {
                            ((l60) this.b).z0.put(b60Var2);
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
                    ((l60) this.b).y0.release();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (!((l60) this.b).D0) {
                    ((l60) this.b).T.sendMessage(((l60) this.b).T.obtainMessage(1, ((l60) this.b).X, 0, ((l60) this.b).Y));
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                org.telegram.ui.Wallet.l5 l5Var = (org.telegram.ui.Wallet.l5) this.b;
                WeakHashMap weakHashMap = l5Var.e;
                Collection.-EL.removeIf(weakHashMap.entrySet(), new org.telegram.ui.p8(uptimeMillis, 3));
                if (!weakHashMap.isEmpty()) {
                    l5Var.d.postDelayed(this, 250L);
                    break;
                } else {
                    l5Var.a();
                    break;
                }
        }
    }
}
