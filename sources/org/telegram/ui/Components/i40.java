package org.telegram.ui.Components;

import android.media.AudioTimestamp;
import android.os.SystemClock;
import j$.util.Collection;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class i40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i40(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x006b, code lost:
    
        if (((org.telegram.ui.Components.j40) r22.b).Y == 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        a40 a40Var;
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
                    if ((!((j40) this.b).X || ((j40) this.b).E0) && ((j40) this.b).z0.getRecordingState() != 1) {
                        try {
                            ((j40) this.b).z0.stop();
                        } catch (Exception unused) {
                            z10 = true;
                        }
                        break;
                    }
                    boolean z12 = z10;
                    if (((j40) this.b).A0.isEmpty()) {
                        try {
                            a40Var = new a40();
                        } catch (OutOfMemoryError unused2) {
                            System.gc();
                            a40Var = new a40();
                        }
                    } else {
                        a40Var = (a40) ((j40) this.b).A0.poll();
                    }
                    a40 a40Var2 = a40Var;
                    a40Var2.e = 0;
                    int i7 = 10;
                    a40Var2.d = 10;
                    int i10 = 0;
                    while (true) {
                        if (i10 < i7) {
                            long j13 = 1000;
                            if (j12 == j11 && !z11) {
                                j12 = System.nanoTime() / 1000;
                            }
                            ByteBuffer byteBuffer = a40Var2.a[i10];
                            byteBuffer.rewind();
                            int read = ((j40) this.b).z0.read(byteBuffer, 2048);
                            if (read <= 0 || i10 % 2 != 0) {
                                j3 = 1000;
                            } else {
                                byteBuffer.limit(read);
                                double d = 0.0d;
                                int i11 = 0;
                                while (true) {
                                    j3 = j13;
                                    if (i11 < read / 2) {
                                        short s5 = byteBuffer.getShort();
                                        d += s5 * s5;
                                        i11++;
                                        j13 = j3;
                                    } else {
                                        org.telegram.messenger.g0.h3(new org.telegram.messenger.se(this, Math.sqrt((d / read) / 2.0d), 1));
                                        byteBuffer.position(0);
                                    }
                                }
                            }
                            if (read <= 0) {
                                a40Var2.d = i10;
                                if (!((j40) this.b).X) {
                                    a40Var2.f = true;
                                }
                            } else {
                                if (z11) {
                                    try {
                                        ((j40) this.b).z0.getTimestamp(audioTimestamp, 0);
                                        j10 = j12;
                                        j12 = audioTimestamp.nanoTime / j3;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        j12 = System.nanoTime() / j3;
                                        z11 = false;
                                    }
                                    a40Var2.b[i10] = j12;
                                    a40Var2.c[i10] = read;
                                    int i12 = ((read * 1000000) / 48000) / 2;
                                    if (z11) {
                                        j10 += i12;
                                    }
                                    j12 = j10;
                                    i10++;
                                    j11 = -1;
                                    i7 = 10;
                                }
                                j10 = j12;
                                a40Var2.b[i10] = j12;
                                a40Var2.c[i10] = read;
                                int i122 = ((read * 1000000) / 48000) / 2;
                                if (z11) {
                                }
                                j12 = j10;
                                i10++;
                                j11 = -1;
                                i7 = 10;
                            }
                        }
                    }
                    if (a40Var2.d >= 0 || a40Var2.f) {
                        if (!((j40) this.b).X && a40Var2.d < 10) {
                            z12 = true;
                        }
                        ((j40) this.b).U.sendMessage(((j40) this.b).U.obtainMessage(3, a40Var2));
                    } else if (((j40) this.b).X) {
                        try {
                            ((j40) this.b).A0.put(a40Var2);
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
                    ((j40) this.b).z0.release();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (!((j40) this.b).E0) {
                    ((j40) this.b).U.sendMessage(((j40) this.b).U.obtainMessage(1, ((j40) this.b).Y, 0, ((j40) this.b).Z));
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                org.telegram.ui.Wallet.i6 i6Var = (org.telegram.ui.Wallet.i6) this.b;
                WeakHashMap weakHashMap = i6Var.e;
                Collection.-EL.removeIf(weakHashMap.entrySet(), new org.telegram.ui.p8(uptimeMillis, 3));
                if (!weakHashMap.isEmpty()) {
                    i6Var.d.postDelayed(this, 250L);
                    break;
                } else {
                    i6Var.a();
                    break;
                }
        }
    }
}
