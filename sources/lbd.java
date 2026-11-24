// default package

import android.content.Context;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class lbd implements aq2, l8e, cs3 {
    public final /* synthetic */ byte a;

    public /* synthetic */ lbd(byte b) {
        this.a = b;
    }

    public static boolean b(int i, byte[] bArr) {
        int i2;
        int i3 = 0;
        while (true) {
            if (i3 >= i) {
                break;
            }
            if (bArr[i3] >= 0) {
                i3++;
            } else {
                while (i3 < i) {
                    int i4 = i3 + 1;
                    i2 = bArr[i3];
                    if (i2 < 0) {
                        if (i2 >= -32) {
                            if (i2 >= -16) {
                                if (i4 < i - 2) {
                                    int i5 = i3 + 2;
                                    int i6 = bArr[i4];
                                    if (i6 <= -65) {
                                        if ((((i6 + kk7.w1) + (i2 << 28)) >> 30) == 0) {
                                            int i7 = i3 + 3;
                                            if (bArr[i5] <= 65471) {
                                                i3 += 4;
                                                if (bArr[i7] > 65471) {
                                                }
                                            }
                                        }
                                    }
                                    i2 = -1;
                                    break;
                                }
                                i2 = ihf.a(bArr, i4, i);
                                break;
                            }
                            if (i4 < i - 1) {
                                int i8 = i3 + 2;
                                char c = bArr[i4];
                                if (c <= 65471 && ((i2 != -32 || c >= 65440) && (i2 != -19 || c < 65440))) {
                                    i3 += 3;
                                    if (bArr[i8] > 65471) {
                                    }
                                }
                                i2 = -1;
                                break;
                            }
                            i2 = ihf.a(bArr, i4, i);
                            break;
                        }
                        if (i4 < i) {
                            if (i2 >= -62) {
                                i3 += 2;
                                if (bArr[i4] > 65471) {
                                }
                            }
                            i2 = -1;
                            break;
                        }
                        break;
                    }
                    i3 = i4;
                }
            }
        }
        i2 = 0;
        return i2 == 0;
    }

    @Override // aq2
    public final Object L(gl2 gl2Var) {
        switch (this.a) {
            case 0:
                return new ce7();
            default:
                th2 th2Var = new th2();
                sv svVar = new sv((byte) 15);
                ReferenceQueue referenceQueue = th2Var.a;
                Set set = th2Var.b;
                set.add(new ind(th2Var, referenceQueue, set, svVar));
                Thread thread = new Thread(new rld(referenceQueue, set, (byte) 16), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return th2Var;
        }
    }

    @Override // cs3
    public final pc0 a(Context context, String str, bs3 bs3Var) {
        pc0 pc0Var = new pc0();
        pc0Var.a = bs3Var.b(context, str);
        int i = 1;
        int a = bs3Var.a(context, str, true);
        pc0Var.b = a;
        int i2 = pc0Var.a;
        if (i2 == 0) {
            i2 = 0;
            if (a == 0) {
                i = 0;
                pc0Var.c = i;
                return pc0Var;
            }
        }
        if (a < i2) {
            i = -1;
        }
        pc0Var.c = i;
        return pc0Var;
    }

    @Override // l8e
    public final vae zzb(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // l8e
    public final boolean zzc(Class cls) {
        return false;
    }
}
