package m4;

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
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import di.oc;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.g3;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.bn0;
import org.telegram.ui.hn0;
import org.telegram.ui.l31;
import org.telegram.ui.m5;
import org.telegram.ui.m7;
import org.telegram.ui.nv;
import org.telegram.ui.ov;
import org.telegram.ui.un0;
import org.telegram.ui.w6;
import org.telegram.ui.yk0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public class c implements e2.d, ne.f, c6, fp0, lu, oc, m7, hn0, gh.a, n5.b, y2.n {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ c(int i10, byte b10) {
        this.a = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList A() {
        ?? arrayList;
        ArrayList arrayList2 = new ArrayList();
        l2.f fVar = (l2.f) this.c;
        Context context = (Context) this.b;
        Class cls = (Class) fVar.b;
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
        s4.g1 g1Var = (s4.g1) this.c;
        s4.h1 h1Var = (s4.h1) this.b;
        int D = h1Var.D();
        int b02 = h1Var.b0();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View D0 = h1Var.D0(i10);
            int q6 = h1Var.q(D0);
            int L0 = h1Var.L0(D0);
            g1Var.b = D;
            g1Var.c = b02;
            g1Var.d = q6;
            g1Var.e = L0;
            if (i12 != 0) {
                g1Var.a = i12;
                if (g1Var.a()) {
                    return D0;
                }
            }
            if (i13 != 0) {
                g1Var.a = i13;
                if (g1Var.a()) {
                    view = D0;
                }
            }
            i10 += i14;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory D(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e7) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e7);
            return null;
        } catch (InstantiationException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        }
    }

    public boolean F(n4.v vVar, String str) {
        Context context = (Context) this.b;
        int i10 = vVar.b;
        return i10 < 0 ? context.getPackageManager().checkPermission(str, vVar.a) == 0 : context.checkPermission(str, i10, vVar.c) == 0;
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int F0(int i10) {
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
                return c6Var == null ? g6.x0(null, i10, false) : c6Var.F0(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.c6
    public Paint G(String str) {
        switch (this.a) {
            case 9:
                return g6.T0(str);
            case 16:
                return g6.T0(str);
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.T0(str) : c6Var.G(str);
        }
    }

    public boolean H(View view) {
        s4.g1 g1Var = (s4.g1) this.c;
        s4.h1 h1Var = (s4.h1) this.b;
        int D = h1Var.D();
        int b02 = h1Var.b0();
        int q6 = h1Var.q(view);
        int L0 = h1Var.L0(view);
        g1Var.b = D;
        g1Var.c = b02;
        g1Var.d = q6;
        g1Var.e = L0;
        g1Var.a = 24579;
        return g1Var.a();
    }

    @Override // di.oc
    public void I(float f7, boolean z10) {
        yc0 yc0Var = (yc0) this.b;
        jg0 jg0Var = (jg0) this.c;
        h81 h81Var = jg0Var.d;
        if (h81Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long p5 = (long) ((((f7 / (1.0f - max)) * max) + f7) * h81Var.p());
        jg0Var.e = p5;
        jg0Var.d.L(p5, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(yc0Var);
        AndroidUtilities.runOnUIThread(yc0Var, 120L);
    }

    public int L(Context context, com.google.android.gms.common.api.c cVar) {
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
    public void N0(int i10, int i11) {
        switch (this.a) {
            case 9:
            case 16:
                break;
            default:
                c6 c6Var = (c6) this.c;
                if (c6Var != null) {
                    c6Var.N0(i10, i11);
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
                return F0(i10);
            case 16:
                return F0(i10);
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.x0(null, i10, false) : c6Var.b0(i10);
        }
    }

    @Override // ne.f
    public void c() {
        ((ne.k) this.b).c();
    }

    @Override // e2.d
    public j9.y d(b2.s0 s0Var) {
        Uri uri;
        byte[] bArr;
        li.k kVar = (li.k) this.c;
        if (kVar != null && (((uri = (Uri) kVar.c) != null && uri.equals(s0Var.n)) || ((bArr = (byte[]) kVar.b) != null && Arrays.equals(bArr, s0Var.k)))) {
            j9.y yVar = (j9.y) ((li.k) this.c).d;
            yVar.getClass();
            return yVar;
        }
        j9.y d = ((e2.d) this.b).d(s0Var);
        if (d == null) {
            return null;
        }
        this.c = new li.k(s0Var, d);
        return d;
    }

    @Override // y2.n
    public Object d2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.b).d2(uri, kVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (t2.a) aVar.a(list);
    }

    @Override // org.telegram.ui.m7
    public void dismiss() {
        ((ov) this.c).dismiss();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public int g1(int i10) {
        switch (this.a) {
            case 9:
                return ((SparseIntArray) this.b).get(i10);
            case 16:
                return F0(i10);
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.x0(null, i10, false) : c6Var.g1(i10);
        }
    }

    @Override // hd.a
    public Object get() {
        int i10 = 24;
        rb.b bVar = new rb.b(i10);
        pb.a aVar = new pb.a(i10);
        Object obj = ((hd.a) this.b).get();
        hd.a aVar2 = (hd.a) this.c;
        return new s5.g(bVar, aVar, s5.a.f, (s5.i) obj, aVar2);
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
    public boolean h() {
        return false;
    }

    @Override // ne.f
    public boolean i(float f7) {
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
            zy0[] zy0VarArr = ovVar.b0;
            a2[] a2VarArr = ovVar.c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                zy0 zy0Var = zy0VarArr[0];
                boolean z11 = cVar.m;
                zy0Var.c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                zy0 zy0Var2 = zy0VarArr[1];
                boolean z12 = cVar.n;
                zy0Var2.c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                zy0 zy0Var3 = zy0VarArr[2];
                boolean z13 = cVar.o;
                zy0Var3.c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                zy0 zy0Var4 = zy0VarArr[3];
                boolean z14 = cVar.p;
                zy0Var4.c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                zy0 zy0Var5 = zy0VarArr[4];
                boolean z15 = cVar.q;
                zy0Var5.c = z15;
                a2Var5.c(z15, true);
            }
            ovVar.a0.a(nvVar.d(), true);
            nvVar.c(true);
        }
    }

    @Override // gh.a
    public dh.d k() {
        if (Build.VERSION.SDK_INT < 29) {
            return new dh.f(this);
        }
        dh.e eVar = new dh.e(this);
        ((PhotoViewer) this.c).Z.add(eVar);
        return eVar;
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

    @Override // org.telegram.ui.hn0
    public void o(String str, String str2) {
        un0 un0Var = ((bn0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            un0Var.N1(true, str2, (yk0) this.b, this, un0Var.B1);
        } else {
            un0Var.M1(true, false);
        }
    }

    @Override // org.telegram.ui.Components.lu
    public void p() {
        g3 g3Var = (g3) this.c;
        ((nu) this.b).getText();
        g3Var.b();
    }

    @Override // e2.d
    public j9.y q(byte[] bArr) {
        byte[] bArr2;
        li.k kVar = (li.k) this.c;
        if (kVar == null || (bArr2 = (byte[]) kVar.b) == null || !Arrays.equals(bArr2, bArr)) {
            j9.y q6 = ((e2.d) this.b).q(bArr);
            this.c = new li.k(bArr, q6);
            return q6;
        }
        j9.y yVar = (j9.y) ((li.k) this.c).d;
        yVar.getClass();
        return yVar;
    }

    @Override // ne.f
    public void t() {
        ((ne.k) this.b).e((ne.l) this.c);
    }

    public String toString() {
        switch (this.a) {
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

    public void u(Object obj, String str) {
        ((ArrayList) this.b).add(a1.g.D(str, "=", String.valueOf(obj)));
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
    public ColorFilter x() {
        switch (this.a) {
            case 9:
                return g6.v3;
            case 16:
                return g6.v3;
            default:
                c6 c6Var = (c6) this.c;
                return c6Var == null ? g6.v3 : c6Var.x();
        }
    }

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ c(Context context, int i10) {
        this.a = i10;
        this.c = null;
        this.b = context;
    }

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ c(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ c(Object obj) {
        this.a = 5;
        this.c = obj;
        this.b = new ArrayList();
    }

    public c(k6.e eVar) {
        this.a = 6;
        this.b = new SparseIntArray();
        n6.l.h(eVar);
        this.c = eVar;
    }

    public c(c6 c6Var) {
        this.a = 17;
        this.b = new SparseIntArray();
        this.c = c6Var;
        w();
    }

    public c(jg0 jg0Var) {
        this.a = 12;
        this.c = jg0Var;
        this.b = new yc0(this, 10);
    }

    public c(String str, String str2) {
        this.a = 26;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public c(s4.h1 h1Var) {
        this.a = 22;
        this.b = h1Var;
        s4.g1 g1Var = new s4.g1();
        g1Var.a = 0;
        this.c = g1Var;
    }

    @Override // gh.a
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.m7
    public void clear() {
    }

    @Override // di.oc
    public /* synthetic */ void f0() {
    }

    @Override // org.telegram.ui.m7
    public void i1() {
    }

    @Override // ne.f
    public void m() {
    }

    @Override // di.oc
    public /* synthetic */ void r() {
    }

    public void w() {
    }

    @Override // org.telegram.ui.Components.fp0
    public void z() {
    }

    public c(int i10) {
        this.a = 28;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    @Override // di.oc
    public /* synthetic */ void E(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void P(long j10) {
    }

    @Override // di.oc
    public /* synthetic */ void R(boolean z10) {
    }

    @Override // di.oc
    public /* synthetic */ void V(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void a0(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void e(int i10) {
    }

    @Override // di.oc
    public /* synthetic */ void e0(float f7) {
    }

    @Override // ne.f
    public void f(boolean z10) {
    }

    @Override // di.oc
    public /* synthetic */ void g(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void j(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void l0(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void q0(long j10) {
    }

    @Override // di.oc
    public /* synthetic */ void s(float f7) {
    }

    @Override // di.oc
    public /* synthetic */ void y(boolean z10) {
    }

    public c(EditText editText) {
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

    private final /* synthetic */ void J(int i10, int i11) {
    }

    private final /* synthetic */ void K(int i10, int i11) {
    }

    @Override // di.oc
    public /* synthetic */ void B(float f7, int i10) {
    }

    @Override // di.oc
    public /* synthetic */ void T(float f7, int i10) {
    }

    @Override // di.oc
    public /* synthetic */ void d0(float f7, int i10) {
    }

    @Override // di.oc
    public /* synthetic */ void n(long j10, boolean z10) {
    }

    @Override // di.oc
    public /* synthetic */ void n0(int i10, long j10) {
    }

    public c(l31 l31Var) {
        this.a = 16;
        this.c = l31Var;
    }

    public c(PhotoViewer photoViewer) {
        this.a = 15;
        this.c = photoViewer;
        this.b = new pa(photoViewer.b0, photoViewer.e0, 0, false);
    }
}
