// default package

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final /* synthetic */ class cs6 implements Runnable {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cs6(ls6 ls6Var, boolean z, int i, ArrayList arrayList) {
        this.b = ls6Var;
        this.c = z;
        this.e = i;
        this.d = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0106, code lost:
    
        if (r2 != null) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x012d A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c;
        int i;
        int min;
        int i2;
        Bitmap G;
        int i3;
        int i4;
        TLRPC.PhotoSize T;
        fi7 fi7Var;
        RandomAccessFile randomAccessFile;
        boolean z;
        boolean z2;
        fi7 i5;
        fi7 j;
        byte b = this.a;
        boolean z3 = this.c;
        byte b2 = this.e;
        ArrayList arrayList = this.d;
        Object obj = this.b;
        boolean z4 = false;
        switch (b) {
            case 0:
                ls6 ls6Var = (ls6) obj;
                SharedPreferences.Editor edit = uc7.s1(ls6Var.currentAccount).Z3.edit();
                if (z3) {
                    ls6Var.k0 = false;
                    ls6Var.l0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    ls6Var.h0[b2] = false;
                    ls6Var.i0[b2] = true;
                    if (b2 == 0) {
                        edit.putLong("lastStickersLoadTime", System.currentTimeMillis()).apply();
                    } else if (b2 == 1) {
                        edit.putLong("lastStickersLoadTimeMask", System.currentTimeMillis()).apply();
                    } else if (b2 == 3) {
                        edit.putLong("lastStickersLoadTimeGreet", System.currentTimeMillis()).apply();
                    } else if (b2 == 5) {
                        edit.putLong("lastStickersLoadTimeEmojiPacks", System.currentTimeMillis()).apply();
                    } else if (b2 == 7) {
                        edit.putLong("lastStickersLoadTimePremiumStickers", System.currentTimeMillis()).apply();
                    } else {
                        edit.putLong("lastStickersLoadTimeFavs", System.currentTimeMillis()).apply();
                    }
                }
                if (arrayList != null) {
                    if (z3) {
                        ls6Var.j0 = arrayList;
                    } else {
                        ls6Var.g0[b2] = arrayList;
                    }
                    if (b2 == 3) {
                        ls6Var.o1();
                    }
                    ls6Var.getNotificationCenter().k(87, Boolean.valueOf(z3), Integer.valueOf(b2));
                    break;
                }
                break;
            case 1:
                ls6 ls6Var2 = (ls6) obj;
                if (z3) {
                    ls6Var2.j0 = arrayList;
                    ls6Var2.k0 = false;
                    c = 1;
                    ls6Var2.l0 = true;
                } else {
                    c = 1;
                    ls6Var2.g0[b2] = arrayList;
                    ls6Var2.h0[b2] = false;
                    ls6Var2.i0[b2] = true;
                }
                if (b2 == 3) {
                    ls6Var2.o1();
                }
                jn7 notificationCenter = ls6Var2.getNotificationCenter();
                Boolean valueOf = Boolean.valueOf(z3);
                Integer valueOf2 = Integer.valueOf(b2);
                Object[] objArr = new Object[2];
                objArr[0] = valueOf;
                objArr[c] = valueOf2;
                notificationCenter.k(87, objArr);
                ls6Var2.X0(z3, false, false, b2);
                break;
            default:
                b18 b18Var = (b18) obj;
                byte b3 = b18Var.T0;
                i = 4;
                min = Math.min((b3 == 0 || b3 == 4) ? 20 : 1, arrayList.size());
                i2 = 0;
                boolean z5 = false;
                while (i2 < min) {
                    q7a q7aVar = (q7a) arrayList.get(i2);
                    G = in5.G(q7aVar.c, q7aVar.a, 2048.0f, 2048.0f, z4);
                    if (G == null || (T = in5.T(G, 2048.0f, 2048.0f, 89, jn7.q5, jn7.q5)) == null) {
                        i3 = i;
                        i4 = min;
                    } else {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        i3 = i;
                        i4 = min;
                        tL_secureFile.dc_id = (int) T.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        j08 j08Var = b18Var.C1;
                        j08Var.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(xb4.z(i3));
                        sb.append("/");
                        sb.append(tL_secureFile.dc_id);
                        sb.append("_");
                        String p = qu6.p(sb, tL_secureFile.id, ".jpg");
                        b18 b18Var2 = j08Var.d;
                        byte[] bArr = new byte[(int) new File(p).length()];
                        fi7Var = null;
                        try {
                            randomAccessFile = new RandomAccessFile(p, "rws");
                            try {
                                randomAccessFile.readFully(bArr);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            randomAccessFile = null;
                        }
                        am2 d1 = b18Var2.d1(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) d1.d);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        oy9 oy9Var = new oy9((py9) d1.f, tL_secureFile, p, (byte[]) d1.e, (byte[]) d1.b);
                        oy9Var.i = b2;
                        hl.c3(new sb4((Object) b18Var, (Object) oy9Var, (int) b2, (byte) 13));
                        if (z3 && !z5) {
                            try {
                                z2 = b18Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense;
                                if (!z2 || (j = MrzRecognizer.i(G)) == null) {
                                    try {
                                        j = MrzRecognizer.j(G);
                                        break;
                                    } catch (Exception unused4) {
                                        break;
                                    }
                                }
                                fi7Var = j;
                                if (fi7Var == null) {
                                    try {
                                        hl.c3(new ql7(b18Var, fi7Var, (byte) 20));
                                        z5 = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        z = true;
                                        z5 = true;
                                        cc4.g(th, z);
                                        i2++;
                                        z4 = false;
                                        i = i3;
                                        min = i4;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z = true;
                            }
                        }
                    }
                    i2++;
                    z4 = false;
                    i = i3;
                    min = i4;
                }
                xea.x();
                break;
        }
        return;
        if (!z2 && (i5 = MrzRecognizer.i(G)) != null) {
            fi7Var = i5;
        }
        if (fi7Var == null) {
        }
        i2++;
        z4 = false;
        i = i3;
        min = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cs6(ls6 ls6Var, boolean z, ArrayList arrayList, int i) {
        this.b = ls6Var;
        this.c = z;
        this.d = arrayList;
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ cs6(b18 b18Var, ArrayList arrayList, int i, boolean z) {
        this.b = b18Var;
        this.d = arrayList;
        this.e = i;
        this.c = z;
    }
}
