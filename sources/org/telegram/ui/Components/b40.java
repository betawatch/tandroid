package org.telegram.ui.Components;

import android.media.AudioTimestamp;
import android.os.SystemClock;
import j$.util.Collection;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b40(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x006b, code lost:
    
        if (((org.telegram.ui.Components.c40) r22.b).Y == 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        t30 t30Var;
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
                    if ((!((c40) this.b).X || ((c40) this.b).E0) && ((c40) this.b).z0.getRecordingState() != 1) {
                        try {
                            ((c40) this.b).z0.stop();
                        } catch (Exception unused) {
                            z10 = true;
                        }
                        break;
                    }
                    boolean z12 = z10;
                    if (((c40) this.b).A0.isEmpty()) {
                        try {
                            t30Var = new t30();
                        } catch (OutOfMemoryError unused2) {
                            System.gc();
                            t30Var = new t30();
                        }
                    } else {
                        t30Var = (t30) ((c40) this.b).A0.poll();
                    }
                    t30 t30Var2 = t30Var;
                    t30Var2.e = 0;
                    int i3 = 10;
                    t30Var2.d = 10;
                    int i10 = 0;
                    while (true) {
                        if (i10 < i3) {
                            long j14 = 1000;
                            if (j13 == j12 && !z11) {
                                j13 = System.nanoTime() / 1000;
                            }
                            ByteBuffer byteBuffer = t30Var2.a[i10];
                            byteBuffer.rewind();
                            int read = ((c40) this.b).z0.read(byteBuffer, 2048);
                            if (read <= 0 || i10 % 2 != 0) {
                                j10 = 1000;
                            } else {
                                byteBuffer.limit(read);
                                double d = 0.0d;
                                int i11 = 0;
                                while (true) {
                                    j10 = j14;
                                    if (i11 < read / 2) {
                                        short s6 = byteBuffer.getShort();
                                        d += s6 * s6;
                                        i11++;
                                        j14 = j10;
                                    } else {
                                        org.telegram.messenger.g0.h3(new org.telegram.messenger.me(this, Math.sqrt((d / read) / 2.0d), 1));
                                        byteBuffer.position(0);
                                    }
                                }
                            }
                            if (read <= 0) {
                                t30Var2.d = i10;
                                if (!((c40) this.b).X) {
                                    t30Var2.f = true;
                                }
                            } else {
                                if (z11) {
                                    try {
                                        ((c40) this.b).z0.getTimestamp(audioTimestamp, 0);
                                        j11 = j13;
                                        j13 = audioTimestamp.nanoTime / j10;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        j13 = System.nanoTime() / j10;
                                        z11 = false;
                                    }
                                    t30Var2.b[i10] = j13;
                                    t30Var2.c[i10] = read;
                                    int i12 = ((read * 1000000) / 48000) / 2;
                                    if (z11) {
                                        j11 += i12;
                                    }
                                    j13 = j11;
                                    i10++;
                                    j12 = -1;
                                    i3 = 10;
                                }
                                j11 = j13;
                                t30Var2.b[i10] = j13;
                                t30Var2.c[i10] = read;
                                int i122 = ((read * 1000000) / 48000) / 2;
                                if (z11) {
                                }
                                j13 = j11;
                                i10++;
                                j12 = -1;
                                i3 = 10;
                            }
                        }
                    }
                    if (t30Var2.d >= 0 || t30Var2.f) {
                        if (!((c40) this.b).X && t30Var2.d < 10) {
                            z12 = true;
                        }
                        ((c40) this.b).U.sendMessage(((c40) this.b).U.obtainMessage(3, t30Var2));
                    } else if (((c40) this.b).X) {
                        try {
                            ((c40) this.b).A0.put(t30Var2);
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
                    ((c40) this.b).z0.release();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (!((c40) this.b).E0) {
                    ((c40) this.b).U.sendMessage(((c40) this.b).U.obtainMessage(1, ((c40) this.b).Y, 0, ((c40) this.b).Z));
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                org.telegram.ui.Wallet.g6 g6Var = (org.telegram.ui.Wallet.g6) this.b;
                WeakHashMap weakHashMap = g6Var.e;
                Collection.-EL.removeIf(weakHashMap.entrySet(), new org.telegram.ui.p8(uptimeMillis, 3));
                if (!weakHashMap.isEmpty()) {
                    g6Var.d.postDelayed(this, 250L);
                    break;
                } else {
                    g6Var.a();
                    break;
                }
        }
    }
}
