package org.telegram.ui.Components;

import android.media.AudioTimestamp;
import android.os.SystemClock;
import j$.util.Collection;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w40(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x006b, code lost:
    
        if (((org.telegram.ui.Components.x40) r22.b).X == 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        o40 o40Var;
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
                    if ((!((x40) this.b).W || ((x40) this.b).D0) && ((x40) this.b).y0.getRecordingState() != 1) {
                        try {
                            ((x40) this.b).y0.stop();
                        } catch (Exception unused) {
                            z10 = true;
                        }
                        break;
                    }
                    boolean z12 = z10;
                    if (((x40) this.b).z0.isEmpty()) {
                        try {
                            o40Var = new o40();
                        } catch (OutOfMemoryError unused2) {
                            System.gc();
                            o40Var = new o40();
                        }
                    } else {
                        o40Var = (o40) ((x40) this.b).z0.poll();
                    }
                    o40 o40Var2 = o40Var;
                    o40Var2.e = 0;
                    int i10 = 10;
                    o40Var2.d = 10;
                    int i11 = 0;
                    while (true) {
                        if (i11 < i10) {
                            long j14 = 1000;
                            if (j13 == j12 && !z11) {
                                j13 = System.nanoTime() / 1000;
                            }
                            ByteBuffer byteBuffer = o40Var2.a[i11];
                            byteBuffer.rewind();
                            int read = ((x40) this.b).y0.read(byteBuffer, 2048);
                            if (read <= 0 || i11 % 2 != 0) {
                                j10 = 1000;
                            } else {
                                byteBuffer.limit(read);
                                double d = 0.0d;
                                int i12 = 0;
                                while (true) {
                                    j10 = j14;
                                    if (i12 < read / 2) {
                                        short s10 = byteBuffer.getShort();
                                        d += s10 * s10;
                                        i12++;
                                        j14 = j10;
                                    } else {
                                        org.telegram.messenger.i0.g3(new org.telegram.messenger.se(this, Math.sqrt((d / read) / 2.0d), 1));
                                        byteBuffer.position(0);
                                    }
                                }
                            }
                            if (read <= 0) {
                                o40Var2.d = i11;
                                if (!((x40) this.b).W) {
                                    o40Var2.f = true;
                                }
                            } else {
                                if (z11) {
                                    try {
                                        ((x40) this.b).y0.getTimestamp(audioTimestamp, 0);
                                        j11 = j13;
                                        j13 = audioTimestamp.nanoTime / j10;
                                    } catch (Exception e) {
                                        org.telegram.messenger.f8.g(e, true);
                                        j13 = System.nanoTime() / j10;
                                        z11 = false;
                                    }
                                    o40Var2.b[i11] = j13;
                                    o40Var2.c[i11] = read;
                                    int i13 = ((read * 1000000) / 48000) / 2;
                                    if (z11) {
                                        j11 += i13;
                                    }
                                    j13 = j11;
                                    i11++;
                                    j12 = -1;
                                    i10 = 10;
                                }
                                j11 = j13;
                                o40Var2.b[i11] = j13;
                                o40Var2.c[i11] = read;
                                int i132 = ((read * 1000000) / 48000) / 2;
                                if (z11) {
                                }
                                j13 = j11;
                                i11++;
                                j12 = -1;
                                i10 = 10;
                            }
                        }
                    }
                    if (o40Var2.d >= 0 || o40Var2.f) {
                        if (!((x40) this.b).W && o40Var2.d < 10) {
                            z12 = true;
                        }
                        ((x40) this.b).T.sendMessage(((x40) this.b).T.obtainMessage(3, o40Var2));
                    } else if (((x40) this.b).W) {
                        try {
                            ((x40) this.b).z0.put(o40Var2);
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
                    ((x40) this.b).y0.release();
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
                if (!((x40) this.b).D0) {
                    ((x40) this.b).T.sendMessage(((x40) this.b).T.obtainMessage(1, ((x40) this.b).X, 0, ((x40) this.b).Y));
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                org.telegram.ui.Wallet.m6 m6Var = (org.telegram.ui.Wallet.m6) this.b;
                WeakHashMap weakHashMap = m6Var.e;
                Collection.-EL.removeIf(weakHashMap.entrySet(), new org.telegram.ui.o8(uptimeMillis, 3));
                if (!weakHashMap.isEmpty()) {
                    m6Var.d.postDelayed(this, 250L);
                    break;
                } else {
                    m6Var.a();
                    break;
                }
        }
    }
}
