// default package

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class lp6 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lp6(hs6 hs6Var, boolean z, int i, ArrayList arrayList) {
        this.b = hs6Var;
        this.c = z;
        this.e = i;
        this.d = arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0100, code lost:
    
        if (r2 == null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        char c;
        int i;
        int i2;
        Bitmap G;
        TLRPC.PhotoSize T;
        RandomAccessFile randomAccessFile;
        boolean z;
        boolean z2;
        yh7 yh7Var;
        yh7 i3;
        byte b = this.a;
        boolean z3 = this.c;
        byte b2 = this.e;
        ArrayList arrayList = this.d;
        Object obj = this.b;
        boolean z4 = false;
        switch (b) {
            case 0:
                hs6 hs6Var = (hs6) obj;
                SharedPreferences.Editor edit = oc7.r1(hs6Var.currentAccount).Y3.edit();
                if (z3) {
                    hs6Var.k0 = false;
                    hs6Var.l0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    hs6Var.h0[b2] = false;
                    hs6Var.i0[b2] = true;
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
                        hs6Var.j0 = arrayList;
                    } else {
                        hs6Var.g0[b2] = arrayList;
                    }
                    if (b2 == 3) {
                        hs6Var.o1();
                    }
                    hs6Var.getNotificationCenter().k(87, Boolean.valueOf(z3), Integer.valueOf(b2));
                    break;
                }
                break;
            case 1:
                hs6 hs6Var2 = (hs6) obj;
                if (z3) {
                    hs6Var2.j0 = arrayList;
                    hs6Var2.k0 = false;
                    c = 1;
                    hs6Var2.l0 = true;
                } else {
                    c = 1;
                    hs6Var2.g0[b2] = arrayList;
                    hs6Var2.h0[b2] = false;
                    hs6Var2.i0[b2] = true;
                }
                if (b2 == 3) {
                    hs6Var2.o1();
                }
                nm7 notificationCenter = hs6Var2.getNotificationCenter();
                Boolean valueOf = Boolean.valueOf(z3);
                Integer valueOf2 = Integer.valueOf(b2);
                Object[] objArr = new Object[2];
                objArr[0] = valueOf;
                objArr[c] = valueOf2;
                notificationCenter.k(87, objArr);
                hs6Var2.X0(z3, false, false, b2);
                break;
            default:
                xz7 xz7Var = (xz7) obj;
                byte b3 = xz7Var.T0;
                i = 4;
                int min = Math.min((b3 == 0 || b3 == 4) ? 20 : 1, arrayList.size());
                i2 = 0;
                boolean z5 = false;
                while (i2 < min) {
                    z5a z5aVar = (z5a) arrayList.get(i2);
                    G = fn5.G(z5aVar.c, z5aVar.a, 2048.0f, 2048.0f, z4);
                    if (G != null && (T = fn5.T(G, 2048.0f, 2048.0f, 89, nm7.q5, nm7.q5)) != null) {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        tL_secureFile.dc_id = (int) T.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        ez7 ez7Var = xz7Var.C1;
                        ez7Var.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(bc4.z(i));
                        sb.append("/");
                        sb.append(tL_secureFile.dc_id);
                        sb.append("_");
                        String q = kt6.q(sb, tL_secureFile.id, ".jpg");
                        xz7 xz7Var2 = ez7Var.d;
                        byte[] bArr = new byte[(int) new File(q).length()];
                        try {
                            randomAccessFile = new RandomAccessFile(q, "rws");
                            try {
                                randomAccessFile.readFully(bArr);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            randomAccessFile = null;
                        }
                        sm2 d1 = xz7Var2.d1(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) d1.d);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        xw9 xw9Var = new xw9((yw9) d1.f, tL_secureFile, q, (byte[]) d1.e, (byte[]) d1.b);
                        xw9Var.i = b2;
                        gm.c3(new ob4((Object) xz7Var, (Object) xw9Var, (int) b2, (byte) 13));
                        if (z3 && !z5) {
                            try {
                                z2 = xz7Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense;
                                if (!z2 || (yh7Var = MrzRecognizer.i(G)) == null) {
                                    try {
                                        yh7Var = MrzRecognizer.j(G);
                                        break;
                                    } catch (Exception unused4) {
                                        break;
                                    }
                                }
                                if (yh7Var == null) {
                                    try {
                                        gm.c3(new bl7(xz7Var, yh7Var, (byte) 22));
                                        z5 = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        z = true;
                                        z5 = true;
                                        fc4.g(th, z);
                                        i2++;
                                        i = 4;
                                        z4 = false;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                z = true;
                            }
                        }
                    }
                    i2++;
                    i = 4;
                    z4 = false;
                }
                gda.x();
                break;
        }
        return;
        yh7Var = (z2 || (i3 = MrzRecognizer.i(G)) == null) ? null : i3;
        if (yh7Var == null) {
        }
        i2++;
        i = 4;
        z4 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lp6(hs6 hs6Var, boolean z, ArrayList arrayList, int i) {
        this.b = hs6Var;
        this.c = z;
        this.d = arrayList;
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ lp6(xz7 xz7Var, ArrayList arrayList, int i, boolean z) {
        this.b = xz7Var;
        this.d = arrayList;
        this.e = i;
        this.c = z;
    }
}
