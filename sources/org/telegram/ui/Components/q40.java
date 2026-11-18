package org.telegram.ui.Components;

import android.media.AudioTimestamp;
import android.os.SystemClock;
import j$.util.Collection;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class q40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q40(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x006b, code lost:
    
        if (((org.telegram.ui.Components.r40) r22.b).Y == 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        i40 i40Var;
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
                    if ((!((r40) this.b).X || ((r40) this.b).E0) && ((r40) this.b).z0.getRecordingState() != 1) {
                        try {
                            ((r40) this.b).z0.stop();
                        } catch (Exception unused) {
                            z10 = true;
                        }
                        break;
                    }
                    boolean z12 = z10;
                    if (((r40) this.b).A0.isEmpty()) {
                        try {
                            i40Var = new i40();
                        } catch (OutOfMemoryError unused2) {
                            System.gc();
                            i40Var = new i40();
                        }
                    } else {
                        i40Var = (i40) ((r40) this.b).A0.poll();
                    }
                    i40 i40Var2 = i40Var;
                    i40Var2.e = 0;
                    int i7 = 10;
                    i40Var2.d = 10;
                    int i10 = 0;
                    while (true) {
                        if (i10 < i7) {
                            long j13 = 1000;
                            if (j12 == j11 && !z11) {
                                j12 = System.nanoTime() / 1000;
                            }
                            ByteBuffer byteBuffer = i40Var2.a[i10];
                            byteBuffer.rewind();
                            int read = ((r40) this.b).z0.read(byteBuffer, 2048);
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
                                        org.telegram.messenger.g0.g3(new org.telegram.messenger.re(this, Math.sqrt((d / read) / 2.0d), 1));
                                        byteBuffer.position(0);
                                    }
                                }
                            }
                            if (read <= 0) {
                                i40Var2.d = i10;
                                if (!((r40) this.b).X) {
                                    i40Var2.f = true;
                                }
                            } else {
                                if (z11) {
                                    try {
                                        ((r40) this.b).z0.getTimestamp(audioTimestamp, 0);
                                        j10 = j12;
                                        j12 = audioTimestamp.nanoTime / j3;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        j12 = System.nanoTime() / j3;
                                        z11 = false;
                                    }
                                    i40Var2.b[i10] = j12;
                                    i40Var2.c[i10] = read;
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
                                i40Var2.b[i10] = j12;
                                i40Var2.c[i10] = read;
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
                    if (i40Var2.d >= 0 || i40Var2.f) {
                        if (!((r40) this.b).X && i40Var2.d < 10) {
                            z12 = true;
                        }
                        ((r40) this.b).U.sendMessage(((r40) this.b).U.obtainMessage(3, i40Var2));
                    } else if (((r40) this.b).X) {
                        try {
                            ((r40) this.b).A0.put(i40Var2);
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
                    ((r40) this.b).z0.release();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (!((r40) this.b).E0) {
                    ((r40) this.b).U.sendMessage(((r40) this.b).U.obtainMessage(1, ((r40) this.b).Y, 0, ((r40) this.b).Z));
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                org.telegram.ui.Wallet.y6 y6Var = (org.telegram.ui.Wallet.y6) this.b;
                WeakHashMap weakHashMap = y6Var.e;
                Collection.-EL.removeIf(weakHashMap.entrySet(), new org.telegram.ui.p8(uptimeMillis, 3));
                if (!weakHashMap.isEmpty()) {
                    y6Var.d.postDelayed(this, 250L);
                    break;
                } else {
                    y6Var.a();
                    break;
                }
        }
    }
}
