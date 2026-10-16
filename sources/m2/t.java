package m2;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import b2.s0;
import di.oc;
import j9.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ji.w4;
import m.h3;
import n4.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an0;
import org.telegram.ui.gn0;
import org.telegram.ui.l31;
import org.telegram.ui.m5;
import org.telegram.ui.m7;
import org.telegram.ui.nv;
import org.telegram.ui.ov;
import org.telegram.ui.sn0;
import org.telegram.ui.w6;
import org.telegram.ui.xk0;
import s4.g1;
import s4.h1;
import v7.q8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public class t implements e2.d, n5.b, ne.f, c6, fp0, lu, oc, m7, gn0, gh.a, y2.n {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ t(int i10, byte b10) {
        this.a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    public ArrayList A() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        gb.e eVar = (gb.e) this.c;
        Context context = (Context) this.b;
        Class cls = eVar.a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) cls), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", cls + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new r9.c((String) it.next(), 0));
        }
        return arrayList2;
    }

    public View C(int i10, int i11, int i12, int i13) {
        g1 g1Var = (g1) this.c;
        h1 h1Var = (h1) this.b;
        int D = h1Var.D();
        int U = h1Var.U();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View J0 = h1Var.J0(i10);
            int l4 = h1Var.l(J0);
            int M0 = h1Var.M0(J0);
            g1Var.b = D;
            g1Var.c = U;
            g1Var.d = l4;
            g1Var.e = M0;
            if (i12 != 0) {
                g1Var.a = i12;
                if (g1Var.a()) {
                    return J0;
                }
            }
            if (i13 != 0) {
                g1Var.a = i13;
                if (g1Var.a()) {
                    view = J0;
                }
            }
            i10 += i14;
        }
        return view;
    }

    @Override // di.oc
    public void E(float f7, boolean z10) {
        yc0 yc0Var = (yc0) this.b;
        kg0 kg0Var = (kg0) this.c;
        i81 i81Var = kg0Var.d;
        if (i81Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long p5 = (long) ((((f7 / (1.0f - max)) * max) + f7) * i81Var.p());
        kg0Var.e = p5;
        kg0Var.d.L(p5, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(yc0Var);
        AndroidUtilities.runOnUIThread(yc0Var, 120L);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int E0(int i10) {
        switch (this.a) {
            case 9:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : g6.x0(null, i10, false);
            case 16:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                return sparseIntArray2 != null ? sparseIntArray2.get(i10) : g6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray3 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray3.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray3.valueAt(indexOfKey2);
                }
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.x0(null, i10, false) : c6Var.E0(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint F(String str) {
        switch (this.a) {
            case 9:
                return g6.T0(str);
            case 16:
                return g6.T0(str);
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.T0(str) : c6Var.F(str);
        }
    }

    public boolean G(v vVar, String str) {
        Context context = (Context) this.b;
        int i10 = vVar.b;
        return i10 < 0 ? context.getPackageManager().checkPermission(str, vVar.a) == 0 : context.checkPermission(str, i10, vVar.c) == 0;
    }

    public boolean H(View view) {
        g1 g1Var = (g1) this.c;
        h1 h1Var = (h1) this.b;
        int D = h1Var.D();
        int U = h1Var.U();
        int l4 = h1Var.l(view);
        int M0 = h1Var.M0(view);
        g1Var.b = D;
        g1Var.c = U;
        g1Var.d = l4;
        g1Var.e = M0;
        g1Var.a = 24579;
        return g1Var.a();
    }

    public int K(Context context, com.google.android.gms.common.api.c cVar) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        n6.l.h(context);
        n6.l.h(cVar);
        int i10 = 0;
        if (!cVar.k()) {
            return 0;
        }
        int l4 = cVar.l();
        int i11 = sparseIntArray.get(l4, -1);
        if (i11 != -1) {
            return i11;
        }
        int i12 = 0;
        while (true) {
            if (i12 >= sparseIntArray.size()) {
                i10 = -1;
                break;
            }
            int keyAt = sparseIntArray.keyAt(i12);
            if (keyAt > l4 && sparseIntArray.get(keyAt) == 0) {
                break;
            }
            i12++;
        }
        if (i10 == -1) {
            i10 = ((k6.e) this.c).d(context, l4);
        }
        sparseIntArray.put(l4, i10);
        return i10;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void M0(int i10, int i11) {
        switch (this.a) {
            case 9:
            case 16:
                break;
            default:
                c6 c6Var = (c6) this.c;
                if (c6Var != null) {
                    c6Var.M0(i10, i11);
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.fp0
    public void X(float f7, boolean z10) {
        ((TextView) this.b).setText("Alpha " + m5.e);
        m5.e = f7;
        ((m5) this.c).b.M();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.c6
    public boolean a() {
        switch (this.a) {
        }
        return g6.I.q();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int b0(int i10) {
        switch (this.a) {
            case 9:
                return E0(i10);
            case 16:
                return E0(i10);
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.x0(null, i10, false) : c6Var.b0(i10);
        }
    }

    @Override // ne.f
    public void c() {
        ((ne.k) this.b).c();
    }

    @Override // org.telegram.ui.gn0
    public void d(String str, String str2) {
        sn0 sn0Var = ((an0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            sn0Var.N1(true, str2, (xk0) this.b, this, sn0Var.B1);
        } else {
            sn0Var.M1(true, false);
        }
    }

    @Override // org.telegram.ui.m7
    public void dismiss() {
        ((ov) this.c).dismiss();
    }

    @Override // gh.a
    public dh.d f() {
        if (Build.VERSION.SDK_INT < 29) {
            return new dh.f(this);
        }
        dh.e eVar = new dh.e(this);
        ((PhotoViewer) this.c).Z.add(eVar);
        return eVar;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int f1(int i10) {
        switch (this.a) {
            case 9:
                return ((SparseIntArray) this.b).get(i10);
            case 16:
                return E0(i10);
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.x0(null, i10, false) : c6Var.f1(i10);
        }
    }

    @Override // y2.n
    public Object g2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.b).g2(uri, kVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (t2.a) aVar.a(list);
    }

    @Override // hd.a
    public Object get() {
        switch (this.a) {
            case 2:
                return new m5.d((Context) ((a9.r) this.b).a, (h3) ((w4) this.c).get());
            default:
                int i10 = 24;
                rb.b bVar = new rb.b(i10);
                pb.a aVar = new pb.a(i10);
                Object obj = ((hd.a) this.b).get();
                hd.a aVar2 = (hd.a) this.c;
                return new s5.g(bVar, aVar, s5.a.f, (s5.i) obj, aVar2);
        }
    }

    @Override // org.telegram.ui.Components.fp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Drawable getDrawable(String str) {
        switch (this.a) {
            case 9:
                return null;
            case 16:
                return null;
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.P0(str) : c6Var.getDrawable(str);
        }
    }

    @Override // ne.f
    public boolean i() {
        return false;
    }

    @Override // ne.f
    public boolean j(float f7) {
        return false;
    }

    @Override // org.telegram.ui.m7
    public void j1(w6 w6Var, ai.b bVar, boolean z10) {
        ov ovVar = (ov) this.c;
        nv nvVar = ovVar.X;
        if (bVar != null) {
            ((ai.c) this.b).i(bVar);
            ovVar.e0.d();
            ai.c cVar = ovVar.g0;
            az0[] az0VarArr = ovVar.b0;
            a2[] a2VarArr = ovVar.c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                az0 az0Var = az0VarArr[0];
                boolean z11 = cVar.m;
                az0Var.c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                az0 az0Var2 = az0VarArr[1];
                boolean z12 = cVar.n;
                az0Var2.c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                az0 az0Var3 = az0VarArr[2];
                boolean z13 = cVar.o;
                az0Var3.c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                az0 az0Var4 = az0VarArr[3];
                boolean z14 = cVar.p;
                az0Var4.c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                az0 az0Var5 = az0VarArr[4];
                boolean z15 = cVar.q;
                az0Var5.c = z15;
                a2Var5.c(z15, true);
            }
            ovVar.a0.a(nvVar.d(), true);
            nvVar.c(true);
        }
    }

    @Override // org.telegram.ui.Components.fp0
    public /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public void l(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 9:
                g6.q(f7, f10, i10, i11);
                break;
            case 16:
                g6.q(f7, f10, i10, i11);
                break;
            default:
                c6 c6Var = (c6) this.c;
                if (c6Var != null) {
                    c6Var.l(f7, f10, i10, i11);
                    break;
                } else {
                    g6.q(f7, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public boolean m0() {
        switch (this.a) {
            case 9:
                return false;
            case 16:
                return false;
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.b1() : c6Var.m0();
        }
    }

    @Override // e2.d
    public y o(s0 s0Var) {
        y o10 = ((e2.d) this.b).o(s0Var);
        if (o10 == null) {
            return null;
        }
        return q8.c(o10, new ji.m5(this, 8));
    }

    @Override // org.telegram.ui.Components.lu
    public void p() {
        g3 g3Var = (g3) this.c;
        ((nu) this.b).getText();
        g3Var.b();
    }

    public void q(Object obj, String str) {
        ((ArrayList) this.b).add(a1.g.D(str, "=", String.valueOf(obj)));
    }

    @Override // ne.f
    public void t() {
        ((ne.k) this.b).e((ne.l) this.c);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return ((String) this.b) + ", " + ((String) this.c);
            case 5:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case 20:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // e2.d
    public y u(byte[] bArr) {
        return q8.c(((e2.d) this.b).u(bArr), new ji.m5(this, 8));
    }

    @Override // gh.a
    public void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.c).T0(canvas, (pa) this.b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public ColorFilter w() {
        switch (this.a) {
            case 9:
                return g6.v3;
            case 16:
                return g6.v3;
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.v3 : c6Var.w();
        }
    }

    public /* synthetic */ t(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ t(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ t(Object obj) {
        this.a = 5;
        this.c = obj;
        this.b = new ArrayList();
    }

    public t(k6.e eVar) {
        this.a = 6;
        this.b = new SparseIntArray();
        n6.l.h(eVar);
        this.c = eVar;
    }

    public t(c6 c6Var) {
        this.a = 17;
        this.b = new SparseIntArray();
        this.c = c6Var;
        x();
    }

    public t(Context context) {
        this.a = 25;
        this.b = context;
        this.c = null;
    }

    public t(byte[] bArr) {
        this.a = 3;
        this.b = bArr;
    }

    public t(kg0 kg0Var) {
        this.a = 12;
        this.c = kg0Var;
        this.b = new yc0(this, 10);
    }

    public t(String str, String str2) {
        this.a = 26;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public t(h1 h1Var) {
        this.a = 22;
        this.b = h1Var;
        g1 g1Var = new g1();
        g1Var.a = 0;
        this.c = g1Var;
    }

    @Override // gh.a
    public /* synthetic */ void b() {
    }

    @Override // di.oc
    public /* synthetic */ void c0() {
    }

    @Override // org.telegram.ui.m7
    public void clear() {
    }

    @Override // org.telegram.ui.m7
    public void h1() {
    }

    @Override // ne.f
    public void m() {
    }

    @Override // di.oc
    public /* synthetic */ void r() {
    }

    public void x() {
    }

    @Override // org.telegram.ui.Components.fp0
    public void z() {
    }

    public t(int i10) {
        this.a = 28;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override // di.oc
    public /* synthetic */ void D(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void M(long j10) {
    }

    @Override // di.oc
    public /* synthetic */ void N(boolean z10) {
    }

    @Override // di.oc
    public /* synthetic */ void P(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void S(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void Z(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void e(int i10) {
    }

    @Override // di.oc
    public /* synthetic */ void e0(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void g(float f7) {
    }

    @Override // ne.f
    public void h(boolean z10) {
    }

    @Override // di.oc
    public /* synthetic */ void k(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void l0(long j10) {
    }

    @Override // di.oc
    public /* synthetic */ void s(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void y(boolean z10) {
    }

    public t(EditText editText) {
        this.a = 18;
        this.b = editText;
        q1.i iVar = new q1.i(editText);
        this.c = iVar;
        editText.addTextChangedListener(iVar);
        if (q1.a.b == null) {
            synchronized (q1.a.a) {
                try {
                    if (q1.a.b == null) {
                        q1.a aVar = new q1.a();
                        try {
                            q1.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, q1.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        q1.a.b = aVar;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(q1.a.b);
    }

    private final /* synthetic */ void I(int i10, int i11) {
    }

    private final /* synthetic */ void J(int i10, int i11) {
    }

    @Override // di.oc
    public /* synthetic */ void B(float f7, int i10) {
    }

    @Override // di.oc
    public /* synthetic */ void O(float f7, int i10) {
    }

    @Override // di.oc
    public /* synthetic */ void Y(float f7, int i10) {
    }

    @Override // di.oc
    public /* synthetic */ void f0(int i10, long j10) {
    }

    @Override // di.oc
    public /* synthetic */ void n(long j10, boolean z10) {
    }

    public t(l31 l31Var) {
        this.a = 16;
        this.c = l31Var;
    }

    public t(PhotoViewer photoViewer) {
        this.a = 15;
        this.c = photoViewer;
        this.b = new pa(photoViewer.b0, photoViewer.e0, 0, false);
    }
}
