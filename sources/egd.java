// default package

import android.content.Context;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class egd implements tq2, bde, us3 {
    public final /* synthetic */ byte a;

    public /* synthetic */ egd(byte b) {
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
                                        if ((((i6 + jn7.w1) + (i2 << 28)) >> 30) == 0) {
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
                                i2 = ylf.a(bArr, i4, i);
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
                            i2 = ylf.a(bArr, i4, i);
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

    @Override // us3
    public final rc0 a(Context context, String str, ts3 ts3Var) {
        rc0 rc0Var = new rc0();
        rc0Var.a = ts3Var.b(context, str);
        int i = 1;
        int a = ts3Var.a(context, str, true);
        rc0Var.b = a;
        int i2 = rc0Var.a;
        if (i2 == 0) {
            i2 = 0;
            if (a == 0) {
                i = 0;
                rc0Var.c = i;
                return rc0Var;
            }
        }
        if (a < i2) {
            i = -1;
        }
        rc0Var.c = i;
        return rc0Var;
    }

    @Override // tq2
    public final Object b0(am2 am2Var) {
        switch (this.a) {
            case 0:
                return new mg7();
            default:
                pi2 pi2Var = new pi2();
                tv tvVar = new tv((byte) 15);
                ReferenceQueue referenceQueue = pi2Var.a;
                Set set = pi2Var.b;
                set.add(new zrd(pi2Var, referenceQueue, set, tvVar));
                Thread thread = new Thread(new iqd(referenceQueue, set, (byte) 16), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return pi2Var;
        }
    }

    @Override // bde
    public final lfe zzb(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // bde
    public final boolean zzc(Class cls) {
        return false;
    }
}
