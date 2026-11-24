// default package

import android.content.Context;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ndd implements lr2, mae, mt3 {
    public final /* synthetic */ byte a;

    public /* synthetic */ ndd(byte b) {
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
                                        if ((((i6 + nm7.w1) + (i2 << 28)) >> 30) == 0) {
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
                                i2 = jjf.a(bArr, i4, i);
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
                            i2 = jjf.a(bArr, i4, i);
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

    @Override // lr2
    public final Object X(sm2 sm2Var) {
        switch (this.a) {
            case 0:
                return new eg7();
            default:
                hj2 hj2Var = new hj2();
                sw swVar = new sw((byte) 15);
                ReferenceQueue referenceQueue = hj2Var.a;
                Set set = hj2Var.b;
                set.add(new lpd(hj2Var, referenceQueue, set, swVar));
                Thread thread = new Thread(new tnd(referenceQueue, set, (byte) 16), "MlKitCleaner");
                thread.setDaemon(true);
                thread.start();
                return hj2Var;
        }
    }

    @Override // mt3
    public final pd0 a(Context context, String str, lt3 lt3Var) {
        pd0 pd0Var = new pd0();
        pd0Var.a = lt3Var.b(context, str);
        int i = 1;
        int a = lt3Var.a(context, str, true);
        pd0Var.b = a;
        int i2 = pd0Var.a;
        if (i2 == 0) {
            i2 = 0;
            if (a == 0) {
                i = 0;
                pd0Var.c = i;
                return pd0Var;
            }
        }
        if (a < i2) {
            i = -1;
        }
        pd0Var.c = i;
        return pd0Var;
    }

    @Override // mae
    public final wce zzb(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // mae
    public final boolean zzc(Class cls) {
        return false;
    }
}
