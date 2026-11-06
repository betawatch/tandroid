package org.telegram.ui.Components;

import android.media.AudioTimestamp;
import android.os.SystemClock;
import j$.util.Collection;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class f40 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f40(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x006b, code lost:
    
        if (((org.telegram.ui.Components.g40) r22.b).X == 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        x30 x30Var;
        long j3;
        long j10;
        switch (this.a) {
            case 0:
                AudioTimestamp audioTimestamp = new AudioTimestamp();
                long j11 = -1;
                long j12 = -1;
                boolean z9 = false;
                boolean z10 = true;
                while (!z9) {
                    if ((!((g40) this.b).W || ((g40) this.b).D0) && ((g40) this.b).y0.getRecordingState() != 1) {
                        try {
                            ((g40) this.b).y0.stop();
                        } catch (Exception unused) {
                            z9 = true;
                        }
                        break;
                    }
                    boolean z11 = z9;
                    if (((g40) this.b).z0.isEmpty()) {
                        try {
                            x30Var = new x30();
                        } catch (OutOfMemoryError unused2) {
                            System.gc();
                            x30Var = new x30();
                        }
                    } else {
                        x30Var = (x30) ((g40) this.b).z0.poll();
                    }
                    x30 x30Var2 = x30Var;
                    x30Var2.e = 0;
                    int i7 = 10;
                    x30Var2.d = 10;
                    int i10 = 0;
                    while (true) {
                        if (i10 < i7) {
                            long j13 = 1000;
                            if (j12 == j11 && !z10) {
                                j12 = System.nanoTime() / 1000;
                            }
                            ByteBuffer byteBuffer = x30Var2.a[i10];
                            byteBuffer.rewind();
                            int read = ((g40) this.b).y0.read(byteBuffer, 2048);
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
                                        org.telegram.messenger.g0.h3(new org.telegram.messenger.te(this, Math.sqrt((d / read) / 2.0d), 1));
                                        byteBuffer.position(0);
                                    }
                                }
                            }
                            if (read <= 0) {
                                x30Var2.d = i10;
                                if (!((g40) this.b).W) {
                                    x30Var2.f = true;
                                }
                            } else {
                                if (z10) {
                                    try {
                                        ((g40) this.b).y0.getTimestamp(audioTimestamp, 0);
                                        j10 = j12;
                                        j12 = audioTimestamp.nanoTime / j3;
                                    } catch (Exception e10) {
                                        org.telegram.messenger.a8.g(e10, true);
                                        j12 = System.nanoTime() / j3;
                                        z10 = false;
                                    }
                                    x30Var2.b[i10] = j12;
                                    x30Var2.c[i10] = read;
                                    int i12 = ((read * 1000000) / 48000) / 2;
                                    if (z10) {
                                        j10 += i12;
                                    }
                                    j12 = j10;
                                    i10++;
                                    j11 = -1;
                                    i7 = 10;
                                }
                                j10 = j12;
                                x30Var2.b[i10] = j12;
                                x30Var2.c[i10] = read;
                                int i122 = ((read * 1000000) / 48000) / 2;
                                if (z10) {
                                }
                                j12 = j10;
                                i10++;
                                j11 = -1;
                                i7 = 10;
                            }
                        }
                    }
                    if (x30Var2.d >= 0 || x30Var2.f) {
                        if (!((g40) this.b).W && x30Var2.d < 10) {
                            z11 = true;
                        }
                        ((g40) this.b).T.sendMessage(((g40) this.b).T.obtainMessage(3, x30Var2));
                    } else if (((g40) this.b).W) {
                        try {
                            ((g40) this.b).z0.put(x30Var2);
                        } catch (Exception unused3) {
                        }
                    } else {
                        z9 = true;
                        j11 = -1;
                    }
                    z9 = z11;
                    j11 = -1;
                }
                try {
                    ((g40) this.b).y0.release();
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
                if (!((g40) this.b).D0) {
                    ((g40) this.b).T.sendMessage(((g40) this.b).T.obtainMessage(1, ((g40) this.b).X, 0, ((g40) this.b).Y));
                    break;
                }
                break;
            default:
                long uptimeMillis = SystemClock.uptimeMillis();
                org.telegram.ui.Wallet.i6 i6Var = (org.telegram.ui.Wallet.i6) this.b;
                WeakHashMap weakHashMap = i6Var.e;
                Collection.-EL.removeIf(weakHashMap.entrySet(), new org.telegram.ui.o8(uptimeMillis, 3));
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
