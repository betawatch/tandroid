package mi;

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
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ei.zb;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import n4.v;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.f3;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.dg0;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.iu;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.x71;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ek0;
import org.telegram.ui.gm0;
import org.telegram.ui.l31;
import org.telegram.ui.l7;
import org.telegram.ui.lv0;
import org.telegram.ui.mm0;
import org.telegram.ui.n5;
import org.telegram.ui.o4;
import org.telegram.ui.v6;
import org.telegram.ui.wu;
import org.telegram.ui.xm0;
import org.telegram.ui.xu;
import s4.g1;
import s4.h1;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public class q implements ne.f, d6, bp0, gu, zb, l7, mm0, gh.a, x71, n5.b, y2.n, SuccessContinuation {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ q(int i10, byte b10) {
        this.a = i10;
    }

    @Override // ei.zb
    public void A(float f7, boolean z10) {
        rc0 rc0Var = (rc0) this.b;
        dg0 dg0Var = (dg0) this.c;
        a81 a81Var = dg0Var.d;
        if (a81Var == null) {
            return;
        }
        float max = 2.8f / Math.max(60L, r2);
        long p5 = (long) ((((f7 / (1.0f - max)) * max) + f7) * a81Var.p());
        dg0Var.e = p5;
        dg0Var.d.L(p5, !z10);
        if (z10) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(rc0Var);
        AndroidUtilities.runOnUIThread(rc0Var, 120L);
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void B(int i10, int i11) {
        switch (this.a) {
            case 7:
                break;
            default:
                d6 d6Var = (d6) this.c;
                if (d6Var != null) {
                    d6Var.B(i10, i11);
                    break;
                }
                break;
        }
    }

    @Override // ne.f
    public void D() {
        ((ne.k) this.b).e((ne.l) this.c);
    }

    @Override // org.telegram.ui.Components.gu
    public void F() {
        f3 f3Var = (f3) this.c;
        ((iu) this.b).getText();
        f3Var.b();
    }

    public void H(Object obj, String str) {
        ((ArrayList) this.b).add(a1.g.C(str, "=", String.valueOf(obj)));
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int I(int i10) {
        switch (this.a) {
            case 7:
                return ((SparseIntArray) this.b).get(i10);
            default:
                d6 d6Var = (d6) this.c;
                return d6Var == null ? h6.x0(null, i10, false) : d6Var.I(i10);
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public void L(float f7, boolean z10) {
        ((TextView) this.b).setText("Alpha " + n5.e);
        n5.e = f7;
        ((n5) this.c).b.M();
    }

    public void O() {
        String str = (String) this.b;
        try {
            ca.c cVar = (ca.c) this.c;
            cVar.getClass();
            new File(cVar.b, str).createNewFile();
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.List] */
    public ArrayList R() {
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

    public View U(int i10, int i11, int i12, int i13) {
        g1 g1Var = (g1) this.c;
        h1 h1Var = (h1) this.b;
        int k10 = h1Var.k();
        int z10 = h1Var.z();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View L = h1Var.L(i10);
            int d = h1Var.d(L);
            int X = h1Var.X(L);
            g1Var.b = k10;
            g1Var.c = z10;
            g1Var.d = d;
            g1Var.e = X;
            if (i12 != 0) {
                g1Var.a = i12;
                if (g1Var.a()) {
                    return L;
                }
            }
            if (i13 != 0) {
                g1Var.a = i13;
                if (g1Var.a()) {
                    view = L;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public boolean V(v vVar, String str) {
        Context context = (Context) this.b;
        int i10 = vVar.b;
        return i10 < 0 ? context.getPackageManager().checkPermission(str, vVar.a) == 0 : context.checkPermission(str, i10, vVar.c) == 0;
    }

    public boolean X(View view) {
        g1 g1Var = (g1) this.c;
        h1 h1Var = (h1) this.b;
        int k10 = h1Var.k();
        int z10 = h1Var.z();
        int d = h1Var.d(view);
        int X = h1Var.X(view);
        g1Var.b = k10;
        g1Var.c = z10;
        g1Var.d = d;
        g1Var.e = X;
        g1Var.a = 24579;
        return g1Var.a();
    }

    @Override // org.telegram.ui.Components.bp0
    public /* synthetic */ int Y() {
        return 0;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // org.telegram.ui.ActionBar.d6
    public boolean a() {
        switch (this.a) {
        }
        return h6.I.q();
    }

    public int a0(Context context, com.google.android.gms.common.api.c cVar) {
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

    @Override // ne.f
    public void c() {
        ((ne.k) this.b).c();
    }

    @Override // org.telegram.ui.ActionBar.d6
    public void d(float f7, float f10, int i10, int i11) {
        switch (this.a) {
            case 7:
                h6.q(f7, f10, i10, i11);
                break;
            default:
                d6 d6Var = (d6) this.c;
                if (d6Var != null) {
                    d6Var.d(f7, f10, i10, i11);
                    break;
                } else {
                    h6.q(f7, f10, i10, i11);
                    break;
                }
        }
    }

    @Override // y2.n
    public Object d2(Uri uri, g2.k kVar) {
        t2.a aVar = (t2.a) ((y2.n) this.b).d2(uri, kVar);
        List list = (List) this.c;
        return (list == null || list.isEmpty()) ? aVar : (t2.a) aVar.a(list);
    }

    @Override // org.telegram.ui.l7
    public void dismiss() {
        ((xu) this.c).dismiss();
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

    @Override // hd.a
    public Object get() {
        int i10 = 24;
        rb.b bVar = new rb.b(i10);
        pb.a aVar = new pb.a(i10);
        Object obj = ((hd.a) this.b).get();
        hd.a aVar2 = (hd.a) this.c;
        return new s5.g(bVar, aVar, s5.a.f, (s5.i) obj, aVar2);
    }

    @Override // org.telegram.ui.Components.bp0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Drawable getDrawable(String str) {
        switch (this.a) {
            case 7:
                return null;
            default:
                d6 d6Var = (d6) this.c;
                return d6Var == null ? h6.P0(str) : d6Var.getDrawable(str);
        }
    }

    @Override // ne.f
    public boolean i() {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public ColorFilter j() {
        switch (this.a) {
            case 7:
                return h6.v3;
            default:
                d6 d6Var = (d6) this.c;
                return d6Var == null ? h6.v3 : d6Var.j();
        }
    }

    @Override // ne.f
    public boolean k(float f7) {
        return false;
    }

    @Override // org.telegram.ui.ActionBar.d6
    public Paint n(String str) {
        switch (this.a) {
            case 7:
                return h6.T0(str);
            default:
                d6 d6Var = (d6) this.c;
                return d6Var == null ? h6.T0(str) : d6Var.n(str);
        }
    }

    @Override // org.telegram.ui.Components.x71
    public void onError(a81 a81Var, Exception exc) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        int i10 = secretMediaViewer.b0;
        if (i10 <= 0) {
            FileLog.e(exc);
            return;
        }
        secretMediaViewer.b0 = i10 - 1;
        AndroidUtilities.runOnUIThread(new lv0(28, this, (File) this.b), 100L);
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.x71
    public void onStateChanged(boolean z10, int i10) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        l31 l31Var = secretMediaViewer.i1;
        if (secretMediaViewer.y == null || secretMediaViewer.h0 == null) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(l31Var);
        AndroidUtilities.runOnUIThread(l31Var);
        if (i10 == 4 || i10 == 1) {
            try {
                secretMediaViewer.b.getWindow().clearFlags(128);
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            try {
                secretMediaViewer.b.getWindow().addFlags(128);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        if (i10 == 3 && secretMediaViewer.w.getVisibility() != 0) {
            secretMediaViewer.w.setVisibility(0);
        }
        if (secretMediaViewer.y.y() && i10 != 4) {
            if (secretMediaViewer.E) {
                return;
            }
            secretMediaViewer.E = true;
        } else if (secretMediaViewer.E) {
            secretMediaViewer.E = false;
            if (i10 == 4) {
                secretMediaViewer.H = true;
                if (secretMediaViewer.I) {
                    secretMediaViewer.e(true, !secretMediaViewer.q1);
                } else {
                    secretMediaViewer.y.L(0L, false);
                    secretMediaViewer.y.C();
                }
            }
        }
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.x71
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        o4 o4Var = ((SecretMediaViewer) this.c).w;
        if (o4Var != null) {
            o4Var.a(i11 == 0 ? 1.0f : (i10 * f7) / i11, 0);
        }
    }

    @Override // org.telegram.ui.mm0
    public void p(String str, String str2) {
        xm0 xm0Var = ((gm0) this.c).a;
        if ("PHONE_VERIFICATION_NEEDED".equals(str)) {
            xm0Var.N1(true, str2, (ek0) this.b, this, xm0Var.B1);
        } else {
            xm0Var.M1(true, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int r(int i10) {
        switch (this.a) {
            case 7:
                return u(i10);
            default:
                d6 d6Var = (d6) this.c;
                return d6Var == null ? h6.x0(null, i10, false) : d6Var.r(i10);
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public boolean s() {
        switch (this.a) {
            case 7:
                return false;
            default:
                d6 d6Var = (d6) this.c;
                return d6Var == null ? h6.b1() : d6Var.s();
        }
    }

    @Override // org.telegram.ui.l7
    public void s0(v6 v6Var, bi.b bVar, boolean z10) {
        xu xuVar = (xu) this.c;
        wu wuVar = xuVar.X;
        if (bVar != null) {
            ((bi.c) this.b).i(bVar);
            xuVar.e0.d();
            bi.c cVar = xuVar.g0;
            uy0[] uy0VarArr = xuVar.b0;
            a2[] a2VarArr = xuVar.c0;
            a2 a2Var = a2VarArr[0];
            if (a2Var != null) {
                uy0 uy0Var = uy0VarArr[0];
                boolean z11 = cVar.m;
                uy0Var.c = z11;
                a2Var.c(z11, true);
            }
            a2 a2Var2 = a2VarArr[1];
            if (a2Var2 != null) {
                uy0 uy0Var2 = uy0VarArr[1];
                boolean z12 = cVar.n;
                uy0Var2.c = z12;
                a2Var2.c(z12, true);
            }
            a2 a2Var3 = a2VarArr[2];
            if (a2Var3 != null) {
                uy0 uy0Var3 = uy0VarArr[2];
                boolean z13 = cVar.o;
                uy0Var3.c = z13;
                a2Var3.c(z13, true);
            }
            a2 a2Var4 = a2VarArr[3];
            if (a2Var4 != null) {
                uy0 uy0Var4 = uy0VarArr[3];
                boolean z14 = cVar.p;
                uy0Var4.c = z14;
                a2Var4.c(z14, true);
            }
            a2 a2Var5 = a2VarArr[4];
            if (a2Var5 != null) {
                uy0 uy0Var5 = uy0VarArr[4];
                boolean z15 = cVar.q;
                uy0Var5.c = z15;
                a2Var5.c(z15, true);
            }
            xuVar.a0.a(wuVar.d(), true);
            wuVar.c(true);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ea.a aVar = (ea.a) obj;
        u4.f fVar = (u4.f) this.c;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        n2.e eVar = (n2.e) fVar.c;
        n2.e eVar2 = (n2.e) fVar.c;
        x9.m.b((x9.m) eVar.c);
        ((x9.m) eVar2.c).m.D((Executor) this.b, null);
        ((x9.m) eVar2.c).q.trySetResult(null);
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.a) {
            case 3:
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
            case 18:
                return "Bounds{lower=" + ((i0.b) this.b) + " upper=" + ((i0.b) this.c) + "}";
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.ActionBar.d6
    public int u(int i10) {
        switch (this.a) {
            case 7:
                SparseIntArray sparseIntArray = (SparseIntArray) this.b;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : h6.x0(null, i10, false);
            default:
                SparseIntArray sparseIntArray2 = (SparseIntArray) this.b;
                int indexOfKey2 = sparseIntArray2.indexOfKey(i10);
                if (indexOfKey2 >= 0) {
                    return sparseIntArray2.valueAt(indexOfKey2);
                }
                d6 d6Var = (d6) this.c;
                return d6Var == null ? h6.x0(null, i10, false) : d6Var.u(i10);
        }
    }

    @Override // gh.a
    public void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.save();
        canvas.clipRect(f7, f10, f11, f12);
        ((PhotoViewer) this.c).U0(canvas, (na) this.b, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    public /* synthetic */ q(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.ui.Components.x71
    public void onRenderedFirstFrame() {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.c;
        if (secretMediaViewer.c0) {
            return;
        }
        secretMediaViewer.c0 = true;
        secretMediaViewer.e.invalidate();
    }

    public /* synthetic */ q(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ q(Object obj) {
        this.a = 3;
        this.c = obj;
        this.b = new ArrayList();
    }

    public q(k6.e eVar) {
        this.a = 4;
        this.b = new SparseIntArray();
        n6.l.h(eVar);
        this.c = eVar;
    }

    public q(d6 d6Var) {
        this.a = 15;
        this.b = new SparseIntArray();
        this.c = d6Var;
        J();
    }

    public q(Context context) {
        this.a = 23;
        this.b = context;
        this.c = null;
    }

    public q(byte[] bArr) {
        this.a = 1;
        this.b = bArr;
    }

    public q(dg0 dg0Var) {
        this.a = 10;
        this.c = dg0Var;
        this.b = new rc0(this, 9);
    }

    public q(String str, String str2) {
        this.a = 24;
        this.b = str;
        this.c = str2;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("userId should not be empty");
        }
    }

    public q(h1 h1Var) {
        this.a = 20;
        this.b = h1Var;
        g1 g1Var = new g1();
        g1Var.a = 0;
        this.c = g1Var;
    }

    public q(int i10) {
        this.a = 26;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public q(EditText editText) {
        this.a = 16;
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

    public q(PhotoViewer photoViewer) {
        this.a = 13;
        this.c = photoViewer;
        this.b = new na(photoViewer.b0, photoViewer.e0, 0, false);
    }

    @Override // ei.zb
    public /* synthetic */ void C(long j10) {
    }

    @Override // ei.zb
    public /* synthetic */ void E(boolean z10) {
    }

    public void J() {
    }

    @Override // ei.zb
    public /* synthetic */ void K(float f7) {
    }

    @Override // ei.zb
    public /* synthetic */ void M(float f7) {
    }

    @Override // ei.zb
    public /* synthetic */ void P(float f7) {
    }

    @Override // ei.zb
    public /* synthetic */ void Q() {
    }

    @Override // ei.zb
    public /* synthetic */ void S(float f7) {
    }

    @Override // ei.zb
    public /* synthetic */ void W(long j10) {
    }

    @Override // org.telegram.ui.l7
    public void W0() {
    }

    @Override // gh.a
    public /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.l7
    public void clear() {
    }

    @Override // ei.zb
    public /* synthetic */ void e(int i10) {
    }

    @Override // ei.zb
    public /* synthetic */ void g(float f7) {
    }

    @Override // ne.f
    public void h(boolean z10) {
    }

    @Override // ei.zb
    public /* synthetic */ void l(float f7) {
    }

    @Override // ne.f
    public void m() {
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSeekFinished(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSeekStarted(j2.a aVar) {
    }

    @Override // org.telegram.ui.Components.x71
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // ei.zb
    public /* synthetic */ void q() {
    }

    @Override // ei.zb
    public /* synthetic */ void t(float f7) {
    }

    @Override // org.telegram.ui.Components.bp0
    public void v() {
    }

    @Override // ei.zb
    public /* synthetic */ void w(boolean z10) {
    }

    @Override // ei.zb
    public /* synthetic */ void z(float f7) {
    }

    private final /* synthetic */ void Z(int i10, int i11) {
    }

    @Override // ei.zb
    public /* synthetic */ void G(float f7, int i10) {
    }

    @Override // ei.zb
    public /* synthetic */ void N(float f7, int i10) {
    }

    @Override // ei.zb
    public /* synthetic */ void T(int i10, long j10) {
    }

    @Override // ei.zb
    public /* synthetic */ void o(long j10, boolean z10) {
    }

    @Override // ei.zb
    public /* synthetic */ void x(float f7, int i10) {
    }
}
