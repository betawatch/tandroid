// default package

import android.media.MediaDrmException;
import android.text.Editable;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.io.FileInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class cff implements a5a, aq2, l8e, d30, hw2, i54, kt8, v02, cr8, sab, fcc {
    public static cff b;
    public final /* synthetic */ byte a;
    public static final cff c = new cff(1);
    public static final cff d = new cff(2);
    public static final t5a e = new t5a(null, null, null, null, null);
    public static final /* synthetic */ cff f = new cff(3);
    public static final cff h = new cff(4);
    public static final cff n = new cff(5);
    public static final cff r = new cff(6);
    public static final cff s = new cff(7);
    public static final cff w = new cff(8);
    public static final cff x = new cff(9);
    public static final cff y = new cff(10);
    public static final cff E = new cff(11);
    public static final cff F = new cff(12);

    public /* synthetic */ cff(byte b2) {
        this.a = b2;
    }

    public static t56 G(w59 w59Var) {
        km5 listIterator = w59Var.listIterator(0);
        while (listIterator.hasNext()) {
            if (((br6) listIterator.next()).b == null) {
                return jie.b(new UnsupportedOperationException());
            }
        }
        return jie.c(w59Var);
    }

    public static synchronized void R() {
        synchronized (cff.class) {
            if (b == null) {
                b = new cff((byte) 0);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(6:30|31|32|33|(1:35)|28)|24|25|26))|43|6|7|(0)(0)|24|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0084, code lost:
    
        if (r7 != r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008d, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
    
        android.util.Log.w("FirebaseSessions", "Error getting Firebase installation id .", r7);
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x006b, code lost:
    
        r7 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(rg4 rg4Var, gw2 gw2Var) {
        jo5 jo5Var;
        int i;
        rg4 rg4Var2;
        ?? r8;
        if (gw2Var instanceof jo5) {
            jo5Var = (jo5) gw2Var;
            int i2 = jo5Var.d;
            if ((i2 & TLObject.FLAG_31) != 0) {
                jo5Var.d = i2 - TLObject.FLAG_31;
                Object obj = jo5Var.b;
                i = jo5Var.d;
                String str = "";
                bx2 bx2Var = bx2.a;
                if (i != 0) {
                    qse.b(obj);
                    qg4 qg4Var = (qg4) rg4Var;
                    Task f2 = qg4Var.f();
                    try {
                        f2.getClass();
                        jo5Var.a = qg4Var;
                        jo5Var.d = 1;
                        Object a = eve.a(f2, jo5Var);
                        if (a != bx2Var) {
                            rg4Var = qg4Var;
                            obj = a;
                        }
                    } catch (Exception e2) {
                        rg4Var = qg4Var;
                        e = e2;
                        Log.w("FirebaseSessions", "Error getting authentication token.", e);
                        rg4Var2 = rg4Var;
                        r8 = "";
                        Task e3 = ((qg4) rg4Var2).e();
                        e3.getClass();
                        jo5Var.a = r8;
                        jo5Var.d = 2;
                        obj = eve.a(e3, jo5Var);
                        rg4Var = r8;
                    }
                    return bx2Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ?? r82 = (String) jo5Var.a;
                    qse.b(obj);
                    rg4Var = r82;
                    String str2 = (String) obj;
                    ?? r83 = rg4Var;
                    if (str2 != null) {
                        str = str2;
                        r83 = rg4Var;
                    }
                    return new ko5(str, r83);
                }
                rg4 rg4Var3 = (rg4) jo5Var.a;
                qse.b(obj);
                rg4Var = rg4Var3;
                String str3 = ((x90) obj).a;
                str3.getClass();
                rg4 rg4Var4 = rg4Var;
                r8 = str3;
                rg4Var2 = rg4Var4;
                Task e32 = ((qg4) rg4Var2).e();
                e32.getClass();
                jo5Var.a = r8;
                jo5Var.d = 2;
                obj = eve.a(e32, jo5Var);
                rg4Var = r8;
            }
        }
        jo5Var = new jo5(this, gw2Var);
        Object obj2 = jo5Var.b;
        i = jo5Var.d;
        String str4 = "";
        bx2 bx2Var2 = bx2.a;
        if (i != 0) {
        }
        String str32 = ((x90) obj2).a;
        str32.getClass();
        rg4 rg4Var42 = rg4Var;
        r8 = str32;
        rg4Var2 = rg4Var42;
        Task e322 = ((qg4) rg4Var2).e();
        e322.getClass();
        jo5Var.a = r8;
        jo5Var.d = 2;
        obj2 = eve.a(e322, jo5Var);
        rg4Var = r8;
    }

    @Override // v02
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        byte b2 = this.a;
    }

    @Override // v02
    public final void I0() {
        byte b2 = this.a;
    }

    @Override // aq2
    public final Object L(gl2 gl2Var) {
        return new cx5((d6e) gl2Var.a(d6e.class), (u44) gl2Var.a(u44.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0081 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0084 -> B:13:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object O(List list, y63 y63Var, gw2 gw2Var) {
        d63 d63Var;
        int i;
        List list2;
        Iterator it;
        c59 c59Var;
        Throwable th;
        if (gw2Var instanceof d63) {
            d63Var = (d63) gw2Var;
            int i2 = d63Var.e;
            if ((i2 & TLObject.FLAG_31) != 0) {
                d63Var.e = i2 - TLObject.FLAG_31;
                Object obj = d63Var.c;
                i = d63Var.e;
                Object obj2 = bx2.a;
                if (i != 0) {
                    qse.b(obj);
                    ArrayList arrayList = new ArrayList();
                    f63 f63Var = new f63(list, arrayList, null);
                    d63Var.a = arrayList;
                    d63Var.e = 1;
                    if (y63Var.a(f63Var, d63Var) != obj2) {
                        list2 = arrayList;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    it = d63Var.b;
                    c59Var = (c59) d63Var.a;
                    try {
                        qse.b(obj);
                    } catch (Throwable th2) {
                        Object obj3 = c59Var.a;
                        if (obj3 == null) {
                            c59Var.a = th2;
                        } else {
                            tfe.a((Throwable) obj3, th2);
                        }
                    }
                    while (it.hasNext()) {
                        qp4 qp4Var = (qp4) it.next();
                        d63Var.a = c59Var;
                        d63Var.b = it;
                        d63Var.e = 2;
                        if (qp4Var.invoke(d63Var) == obj2) {
                            return obj2;
                        }
                    }
                    th = (Throwable) c59Var.a;
                    if (th == null) {
                        return g5c.a;
                    }
                    throw th;
                }
                list2 = (List) d63Var.a;
                qse.b(obj);
                c59 c59Var2 = new c59();
                it = list2.iterator();
                c59Var = c59Var2;
                while (it.hasNext()) {
                }
                th = (Throwable) c59Var.a;
                if (th == null) {
                }
            }
        }
        d63Var = new d63(this, gw2Var);
        Object obj4 = d63Var.c;
        i = d63Var.e;
        Object obj22 = bx2.a;
        if (i != 0) {
        }
        c59 c59Var22 = new c59();
        it = list2.iterator();
        c59Var = c59Var22;
        while (it.hasNext()) {
        }
        th = (Throwable) c59Var.a;
        if (th == null) {
        }
    }

    @Override // v02
    public final void P0(Object obj) {
        byte b2 = this.a;
    }

    @Override // v02
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        byte b2 = this.a;
    }

    @Override // v02
    public final boolean V1() {
        byte b2 = this.a;
        return false;
    }

    @Override // i54
    public final Map b(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // i54
    public final h54 c() {
        throw new IllegalStateException();
    }

    @Override // d30
    public final void d(String str) {
        if (w01.a) {
            fa4.b("AudioRecorderV2 ".concat(str));
        }
    }

    @Override // a5a
    public final Object e() {
        return e;
    }

    @Override // i54
    public final kp4 g(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // v02
    public final boolean g0() {
        byte b2 = this.a;
        return false;
    }

    @Override // v02
    public final void g1(TLRPC.User user) {
        byte b2 = this.a;
    }

    @Override // lt8
    public final Object get() {
        return snb.a;
    }

    @Override // sab
    public final boolean h(fm4 fm4Var) {
        return false;
    }

    @Override // a5a
    public final void i(Object obj, p4c p4cVar) {
        byte[] bytes = lu5.d.b(t5a.Companion.serializer(), (t5a) obj).getBytes(bk1.a);
        bytes.getClass();
        p4cVar.a.write(bytes);
    }

    @Override // i54
    public final byte[] j() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // i54
    public final void k(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // a5a
    public final Object m(FileInputStream fileInputStream) {
        try {
            lu5 lu5Var = lu5.d;
            String str = new String(cqd.b(fileInputStream), bk1.a);
            cff cffVar = lu5Var.b;
            return (t5a) lu5Var.a(t5a.Companion.serializer(), str);
        } catch (Exception e2) {
            throw new fx2("Cannot parse session configs", e2);
        }
    }

    @Override // d30
    public final void o(String str, Throwable th) {
        fa4.e("AudioRecorderV2 ".concat(str), th);
    }

    @Override // i54
    public final byte[] p(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // sab
    public final uab r(fm4 fm4Var) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override // i54
    public final void s(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // i54
    public final g54 t(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override // i54
    public final int v() {
        return 1;
    }

    @Override // i54
    public final boolean x(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // sab
    public final int y(fm4 fm4Var) {
        return 1;
    }

    public final void z(r24 r24Var) {
        r24Var.a(r5f.class, pge.a);
        r24Var.a(bdf.class, fye.a);
        r24Var.a(u5f.class, sge.a);
        r24Var.a(b6f.class, ehe.a);
        r24Var.a(w5f.class, yge.a);
        r24Var.a(z5f.class, ihe.a);
        r24Var.a(w0e.class, k9e.a);
        r24Var.a(s1f.class, f9e.a);
        r24Var.a(a4f.class, nee.a);
        r24Var.a(zbf.class, xve.a);
        r24Var.a(q1f.class, z8e.a);
        r24Var.a(o1f.class, u8e.a);
        r24Var.a(l8f.class, joe.a);
        r24Var.a(fef.class, dde.a);
        r24Var.a(p3f.class, pde.a);
        r24Var.a(h3f.class, xce.a);
        r24Var.a(m8f.class, poe.a);
        r24Var.a(wbf.class, jve.a);
        r24Var.a(xbf.class, ove.a);
        r24Var.a(ubf.class, fve.a);
        r24Var.a(k6f.class, vie.a);
        r24Var.a(def.class, u4e.a);
        r24Var.a(l6f.class, zie.a);
        r24Var.a(z8f.class, dqe.a);
        r24Var.a(o9f.class, nqe.a);
        r24Var.a(c9f.class, kqe.a);
        r24Var.a(b9f.class, hqe.a);
        r24Var.a(baf.class, nse.a);
        r24Var.a(daf.class, sse.a);
        r24Var.a(gaf.class, zse.a);
        r24Var.a(eaf.class, use.a);
        r24Var.a(j6f.class, rie.a);
        r24Var.a(iaf.class, fte.a);
        r24Var.a(kaf.class, hte.a);
        r24Var.a(laf.class, lte.a);
        r24Var.a(naf.class, qte.a);
        r24Var.a(taf.class, cue.a);
        r24Var.a(raf.class, gue.a);
        r24Var.a(aaf.class, mre.a);
        r24Var.a(i4f.class, mfe.a);
        r24Var.a(x9f.class, wre.a);
        r24Var.a(v9f.class, qre.a);
        r24Var.a(y9f.class, jse.a);
        r24Var.a(ybf.class, sve.a);
        r24Var.a(kdf.class, aze.a);
        r24Var.a(n0f.class, m6e.a);
        r24Var.a(mad.class, n5e.a);
        r24Var.a(tze.class, f5e.a);
        r24Var.a(l0f.class, s5e.a);
        r24Var.a(t0f.class, z6e.a);
        r24Var.a(p0f.class, t6e.a);
        r24Var.a(v0f.class, f7e.a);
        r24Var.a(y0f.class, l7e.a);
        r24Var.a(a1f.class, q7e.a);
        r24Var.a(c1f.class, x7e.a);
        r24Var.a(e1f.class, b8e.a);
        r24Var.a(xtd.class, y3e.a);
        r24Var.a(kud.class, k4e.a);
        r24Var.a(dud.class, f4e.a);
        r24Var.a(e4f.class, cfe.a);
        r24Var.a(w1f.class, q9e.a);
        r24Var.a(lkd.class, tud.a);
        r24Var.a(fkd.class, yud.a);
        r24Var.a(d3f.class, zbe.a);
        r24Var.a(ukd.class, evd.a);
        r24Var.a(qkd.class, jvd.a);
        r24Var.a(und.class, jxd.a);
        r24Var.a(xmd.class, mxd.a);
        r24Var.a(fld.class, nvd.a);
        r24Var.a(zkd.class, svd.a);
        r24Var.a(zod.class, nyd.a);
        r24Var.a(wod.class, czd.a);
        r24Var.a(wpd.class, yzd.a);
        r24Var.a(ppd.class, d0e.a);
        r24Var.a(rtd.class, m3e.a);
        r24Var.a(zsd.class, s3e.a);
        r24Var.a(iqd.class, j0e.a);
        r24Var.a(cqd.class, p0e.a);
        r24Var.a(tqd.class, u0e.a);
        r24Var.a(mqd.class, b2e.a);
        r24Var.a(vdf.class, gwe.a);
        r24Var.a(mdf.class, v9e.a);
        r24Var.a(rdf.class, lie.a);
        r24Var.a(qdf.class, eie.a);
        r24Var.a(odf.class, hde.a);
        r24Var.a(udf.class, ewe.a);
        r24Var.a(sdf.class, cwe.a);
        r24Var.a(wdf.class, rwe.a);
        r24Var.a(pdf.class, tee.a);
        r24Var.a(cef.class, hze.a);
        r24Var.a(aef.class, lze.a);
        r24Var.a(ydf.class, dze.a);
        r24Var.a(bcf.class, wwe.a);
        r24Var.a(c4f.class, yee.a);
        r24Var.a(k4f.class, rfe.a);
        r24Var.a(sze.class, z4e.a);
        r24Var.a(q3f.class, ude.a);
        r24Var.a(g4f.class, gfe.a);
        r24Var.a(b1f.class, qce.a);
        r24Var.a(b2f.class, iae.a);
        r24Var.a(d2f.class, oae.a);
        r24Var.a(y1f.class, dae.a);
        r24Var.a(g2f.class, uae.a);
        r24Var.a(g6f.class, bie.a);
        r24Var.a(e6f.class, mhe.a);
        r24Var.a(zjd.class, pud.a);
        r24Var.a(fdf.class, pye.a);
        r24Var.a(idf.class, vye.a);
        r24Var.a(gdf.class, sye.a);
        r24Var.a(pze.class, p4e.a);
        r24Var.a(m1f.class, q8e.a);
        r24Var.a(j1f.class, k8e.a);
        r24Var.a(h1f.class, f8e.a);
        r24Var.a(g8f.class, une.a);
        r24Var.a(j8f.class, doe.a);
        r24Var.a(i8f.class, aoe.a);
        r24Var.a(smd.class, ywd.a);
        r24Var.a(mmd.class, fxd.a);
        r24Var.a(o8f.class, soe.a);
        r24Var.a(s8f.class, ipe.a);
        r24Var.a(p8f.class, yoe.a);
        r24Var.a(r8f.class, epe.a);
        r24Var.a(fod.class, rxd.a);
        r24Var.a(aod.class, xxd.a);
        r24Var.a(hcf.class, nxe.a);
        r24Var.a(gcf.class, lxe.a);
        r24Var.a(cdf.class, iye.a);
        r24Var.a(ddf.class, mye.a);
        r24Var.a(p9f.class, uqe.a);
        r24Var.a(u9f.class, ire.a);
        r24Var.a(r9f.class, yqe.a);
        r24Var.a(s9f.class, cre.a);
        r24Var.a(u3f.class, hee.a);
        r24Var.a(ipd.class, jzd.a);
        r24Var.a(dpd.class, pzd.a);
        r24Var.a(s3f.class, bee.a);
        r24Var.a(j3f.class, lde.a);
        r24Var.a(u8f.class, npe.a);
        r24Var.a(y8f.class, ype.a);
        r24Var.a(w8f.class, upe.a);
        r24Var.a(sod.class, ayd.a);
        r24Var.a(nod.class, hyd.a);
        r24Var.a(r7f.class, ole.a);
        r24Var.a(t7f.class, sle.a);
        r24Var.a(u7f.class, wle.a);
        r24Var.a(xld.class, gwd.a);
        r24Var.a(u9.class, lwd.a);
        r24Var.a(c7f.class, zke.a);
        r24Var.a(d7f.class, ele.a);
        r24Var.a(q7f.class, kle.a);
        r24Var.a(nld.class, wvd.a);
        r24Var.a(ild.class, bwd.a);
        r24Var.a(w7f.class, bme.a);
        r24Var.a(x7f.class, dme.a);
        r24Var.a(z7f.class, hme.a);
        r24Var.a(a8f.class, kme.a);
        r24Var.a(hmd.class, pwd.a);
        r24Var.a(bmd.class, uwd.a);
        r24Var.a(dcf.class, cxe.a);
        r24Var.a(ccf.class, exe.a);
        r24Var.a(m4f.class, wfe.a);
        r24Var.a(r4f.class, gge.a);
        r24Var.a(o4f.class, bge.a);
        r24Var.a(t4f.class, kge.a);
        r24Var.a(uaf.class, kue.a);
        r24Var.a(waf.class, pue.a);
        r24Var.a(zk2.class, r2e.a);
        r24Var.a(krd.class, v2e.a);
        r24Var.a(icf.class, rxe.a);
        r24Var.a(oaf.class, tte.a);
        r24Var.a(qaf.class, xte.a);
        r24Var.a(erd.class, g2e.a);
        r24Var.a(xqd.class, k2e.a);
        r24Var.a(ecf.class, hxe.a);
        r24Var.a(a7f.class, jje.a);
        r24Var.a(z6f.class, uke.a);
        r24Var.a(u6f.class, ike.a);
        r24Var.a(t6f.class, cke.a);
        r24Var.a(w6f.class, lke.a);
        r24Var.a(x6f.class, qke.a);
        r24Var.a(s6f.class, yje.a);
        r24Var.a(n6f.class, eje.a);
        r24Var.a(q6f.class, uje.a);
        r24Var.a(p6f.class, pje.a);
        r24Var.a(d8f.class, mne.a);
        r24Var.a(p2f.class, obe.a);
        r24Var.a(c8f.class, ene.a);
        r24Var.a(f8f.class, pne.a);
        r24Var.a(m2f.class, kbe.a);
        r24Var.a(s2f.class, tbe.a);
        r24Var.a(acf.class, twe.a);
        r24Var.a(yaf.class, tue.a);
        r24Var.a(ocf.class, cye.a);
        r24Var.a(mbf.class, cve.a);
        r24Var.a(jbf.class, xue.a);
        r24Var.a(lcf.class, vxe.a);
        r24Var.a(ssd.class, z2e.a);
        r24Var.a(isd.class, g3e.a);
        r24Var.a(mcf.class, yxe.a);
        r24Var.a(k2f.class, abe.a);
    }

    @Override // v02
    public final void z0() {
        byte b2 = this.a;
    }

    @Override // v02
    public final void z2(vq0 vq0Var) {
        byte b2 = this.a;
        vq0Var.run();
    }

    @Override // l8e
    public final vae zzb(Class cls) {
        if (!c2e.class.isAssignableFrom(cls)) {
            w26.j("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (vae) c2e.h(cls.asSubclass(c2e.class)).d(3);
        } catch (Exception e2) {
            fyb.j("Unable to get message info for ".concat(cls.getName()), e2);
            return null;
        }
    }

    @Override // l8e
    public final boolean zzc(Class cls) {
        return c2e.class.isAssignableFrom(cls);
    }

    private final void H() {
    }

    private final void I() {
    }

    private final void M() {
    }

    private final void N() {
    }

    @Override // cr8
    public final void C() {
    }

    @Override // fcc
    public final void onFirstFrameRendered() {
    }

    @Override // fcc
    public final void q() {
    }

    @Override // i54
    public final void release() {
    }

    @Override // fcc
    public final void u() {
    }

    private final void E(TLRPC.User user) {
    }

    private final void F(TLRPC.User user) {
    }

    private final void J(Object obj) {
    }

    private final void K(Object obj) {
    }

    @Override // fcc
    public final void a(icc iccVar) {
    }

    @Override // i54
    public final void l(byte[] bArr) {
    }

    @Override // i54
    public final void n(lj9 lj9Var) {
    }

    @Override // cr8
    public final void f(int i, Serializable serializable) {
    }

    @Override // i54
    public final void w(byte[] bArr, uc8 uc8Var) {
    }

    private final void P(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    private final void Q(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    private final void B(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }

    private final void D(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
