// default package

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class kn6 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ byte e;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kn6(hq6 hq6Var, boolean z, int i, ArrayList arrayList) {
        this.b = hq6Var;
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
        vf7 vf7Var;
        vf7 i3;
        byte b = this.a;
        boolean z3 = this.c;
        byte b2 = this.e;
        ArrayList arrayList = this.d;
        Object obj = this.b;
        boolean z4 = false;
        switch (b) {
            case 0:
                hq6 hq6Var = (hq6) obj;
                SharedPreferences.Editor edit = na7.q1(hq6Var.currentAccount).Y3.edit();
                if (z3) {
                    hq6Var.k0 = false;
                    hq6Var.l0 = true;
                    edit.putLong("lastGifLoadTime", System.currentTimeMillis()).apply();
                } else {
                    hq6Var.h0[b2] = false;
                    hq6Var.i0[b2] = true;
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
                        hq6Var.j0 = arrayList;
                    } else {
                        hq6Var.g0[b2] = arrayList;
                    }
                    if (b2 == 3) {
                        hq6Var.o1();
                    }
                    hq6Var.getNotificationCenter().k(86, Boolean.valueOf(z3), Integer.valueOf(b2));
                    break;
                }
                break;
            case 1:
                hq6 hq6Var2 = (hq6) obj;
                if (z3) {
                    hq6Var2.j0 = arrayList;
                    hq6Var2.k0 = false;
                    c = 1;
                    hq6Var2.l0 = true;
                } else {
                    c = 1;
                    hq6Var2.g0[b2] = arrayList;
                    hq6Var2.h0[b2] = false;
                    hq6Var2.i0[b2] = true;
                }
                if (b2 == 3) {
                    hq6Var2.o1();
                }
                kk7 notificationCenter = hq6Var2.getNotificationCenter();
                Boolean valueOf = Boolean.valueOf(z3);
                Integer valueOf2 = Integer.valueOf(b2);
                Object[] objArr = new Object[2];
                objArr[0] = valueOf;
                objArr[c] = valueOf2;
                notificationCenter.k(86, objArr);
                hq6Var2.X0(z3, false, false, b2);
                break;
            default:
                vx7 vx7Var = (vx7) obj;
                byte b3 = vx7Var.T0;
                i = 4;
                int min = Math.min((b3 == 0 || b3 == 4) ? 20 : 1, arrayList.size());
                i2 = 0;
                boolean z5 = false;
                while (i2 < min) {
                    y3a y3aVar = (y3a) arrayList.get(i2);
                    G = fl5.G(y3aVar.c, y3aVar.a, 2048.0f, 2048.0f, z4);
                    if (G != null && (T = fl5.T(G, 2048.0f, 2048.0f, 89, kk7.q5, kk7.q5)) != null) {
                        TLRPC.TL_secureFile tL_secureFile = new TLRPC.TL_secureFile();
                        tL_secureFile.dc_id = (int) T.location.volume_id;
                        tL_secureFile.id = r0.local_id;
                        tL_secureFile.date = (int) (System.currentTimeMillis() / 1000);
                        bx7 bx7Var = vx7Var.C1;
                        bx7Var.getClass();
                        StringBuilder sb = new StringBuilder();
                        sb.append(ba4.z(i));
                        sb.append("/");
                        sb.append(tL_secureFile.dc_id);
                        sb.append("_");
                        String p = ls6.p(sb, tL_secureFile.id, ".jpg");
                        vx7 vx7Var2 = bx7Var.d;
                        byte[] bArr = new byte[(int) new File(p).length()];
                        try {
                            randomAccessFile = new RandomAccessFile(p, "rws");
                            try {
                                randomAccessFile.readFully(bArr);
                            } catch (Exception unused) {
                            }
                        } catch (Exception unused2) {
                            randomAccessFile = null;
                        }
                        gl2 c1 = vx7Var2.c1(bArr);
                        try {
                            randomAccessFile.seek(0L);
                            randomAccessFile.write((byte[]) c1.d);
                            randomAccessFile.close();
                        } catch (Exception unused3) {
                        }
                        uu9 uu9Var = new uu9((vu9) c1.f, tL_secureFile, p, (byte[]) c1.e, (byte[]) c1.b);
                        uu9Var.i = b2;
                        gl.c3(new o94((Object) vx7Var, (Object) uu9Var, (int) b2, (byte) 13));
                        if (z3 && !z5) {
                            try {
                                z2 = vx7Var.G.type instanceof TLRPC.TL_secureValueTypeDriverLicense;
                                if (!z2 || (vf7Var = MrzRecognizer.i(G)) == null) {
                                    try {
                                        vf7Var = MrzRecognizer.j(G);
                                        break;
                                    } catch (Exception unused4) {
                                        break;
                                    }
                                }
                                if (vf7Var == null) {
                                    try {
                                        gl.c3(new bj7(vx7Var, vf7Var, (byte) 21));
                                        z5 = true;
                                    } catch (Throwable th) {
                                        th = th;
                                        z = true;
                                        z5 = true;
                                        fa4.g(th, z);
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
                gba.x();
                break;
        }
        return;
        vf7Var = (z2 || (i3 = MrzRecognizer.i(G)) == null) ? null : i3;
        if (vf7Var == null) {
        }
        i2++;
        i = 4;
        z4 = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kn6(hq6 hq6Var, boolean z, ArrayList arrayList, int i) {
        this.b = hq6Var;
        this.c = z;
        this.d = arrayList;
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ kn6(vx7 vx7Var, ArrayList arrayList, int i, boolean z) {
        this.b = vx7Var;
        this.d = arrayList;
        this.e = i;
        this.c = z;
    }
}
