package n5;

import android.content.ContentProviderClient;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.cast.i4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.t6;
import g7.y5;
import j4.c1;
import j4.i1;
import j4.j1;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import mh.l4;
import of.u1;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Cells.b9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l6;
import org.telegram.ui.Components.np0;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.qf0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.Components.vj0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.j9;
import org.telegram.ui.li0;
import org.telegram.ui.qr0;
import org.telegram.ui.r9;
import org.telegram.ui.sa1;
import org.telegram.ui.web.y0;
import org.telegram.ui.xs0;
import qh.b2;
import qh.d1;
import qh.f5;
import qh.o3;
import qh.v2;
import qh.x1;
import xf.q1;
import yf.v1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements OnSuccessListener, na.n, o0.a, c1, la.n, on0, td.d, tf.m, h61, u1, r9, com.google.android.gms.common.api.internal.s, x4, qh.c1, OnCompleteListener, s0, v1 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ a0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // qh.c1
    public /* synthetic */ boolean A(d1 d1Var) {
        return false;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        switch (this.a) {
            case 13:
                ((qh.p) this.b).H(i9, z10, i10, false, 0L);
                qh.p pVar = (qh.p) this.b;
                li0 li0Var = pVar.K;
                if (li0Var != null) {
                    li0Var.i();
                    pVar.K = null;
                    break;
                }
                break;
            default:
                ((x1) this.b).r0(i9, i10, z10);
                break;
        }
    }

    @Override // qh.c1
    public void B1(Editable editable) {
        f5 f5Var = (f5) this.b;
        qh.a aVar = f5Var.a;
        if (aVar != null) {
            aVar.s = true;
            aVar.r = f5Var.r.A;
        }
        f5Var.u();
        v2 v2Var = f5Var.A;
        if (v2Var == null || f5Var.a == null) {
            return;
        }
        v2Var.a();
    }

    @Override // tf.m
    public void C(boolean z10) {
        be0 be0Var = (be0) this.b;
        be0Var.getClass();
        ae0 ae0Var = be0Var.a;
        if (ae0Var != null) {
            ((qr0) ae0Var).a(z10);
        }
    }

    @Override // org.telegram.ui.r9
    public String C0() {
        return ((y0) this.b).e0;
    }

    @Override // qh.c1
    public void E(int i9, int i10) {
        b2 b2Var;
        f5 f5Var = (f5) this.b;
        v2 v2Var = f5Var.A;
        if (v2Var == null || f5Var.a == null || (b2Var = v2Var.a.F3) == null) {
            return;
        }
        b2Var.f(i9, i10);
    }

    @Override // tf.m
    public void F() {
        ae0 ae0Var = ((be0) this.b).a;
        if (ae0Var != null) {
            PhotoViewer photoViewer = ((qr0) ae0Var).a;
            if (photoViewer.Y1 == 1) {
                photoViewer.D2 = true;
                photoViewer.q3();
            }
        }
    }

    @Override // td.d
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // td.d
    public /* synthetic */ boolean I(float f10) {
        return false;
    }

    @Override // org.telegram.ui.r9
    public void K(String str) {
        y0 y0Var = (y0) this.b;
        try {
            y0Var.L = System.currentTimeMillis();
            y0Var.v("qr_text_received", new JSONObject().put("data", str));
        } catch (JSONException e10) {
            FileLog.e(e10);
        }
    }

    @Override // of.u1
    public /* synthetic */ a0.h O() {
        return null;
    }

    @Override // org.telegram.ui.Components.on0
    public void Q(float f10, boolean z10) {
        switch (this.a) {
            case 5:
                sa1 sa1Var = (sa1) ((k0) this.b);
                int i9 = (int) (f6.q * 100.0f);
                int i10 = (int) (f10 * 100.0f);
                f6.q = f10;
                if (i9 != i10) {
                    ThemeActivity themeActivity = sa1Var.e.e;
                    ik0 ik0Var = (ik0) themeActivity.b.K(themeActivity.b0);
                    if (ik0Var != null) {
                        ((b9) ik0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (f6.q * 100.0f))));
                    }
                    f6.E(true);
                    break;
                }
                break;
            default:
                uf.g gVar = (uf.g) this.b;
                float f11 = gVar.b;
                float z11 = e2.c.z(gVar.c, f11, f10, f11);
                gVar.d = z11;
                if (z10) {
                    l6 l6Var = gVar.e;
                    l6Var.getClass();
                    l6Var.b(null, z11);
                }
                gVar.invalidate();
                break;
        }
    }

    @Override // qh.c1
    public /* synthetic */ boolean T1(boolean z10) {
        return false;
    }

    @Override // qh.c1
    public /* synthetic */ boolean U1(d1 d1Var) {
        return false;
    }

    @Override // na.n
    public Object Y1() {
        Constructor constructor = (Constructor) this.b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            t6 t6Var = qa.c.a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + qa.c.b(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + qa.c.b(constructor) + "' with no args", e12.getCause());
        }
    }

    @Override // androidx.lifecycle.s0
    public p0 a(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        q5.r rVar = new q5.r(0, (TaskCompletionSource) obj2);
        q5.i iVar = (q5.i) ((q5.t) obj).u();
        String[] strArr = (String[]) this.b;
        Parcel M0 = iVar.M0();
        com.google.android.gms.internal.cast.u.d(M0, rVar);
        M0.writeStringArray(strArr);
        iVar.R0(M0, 5);
    }

    @Override // j4.c1
    public void c(j4.d1 d1Var) {
        o4.l lVar = (o4.l) this.b;
        lVar.C.c(lVar);
    }

    @Override // org.telegram.ui.Components.on0
    public /* synthetic */ int c0() {
        switch (this.a) {
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o0.a
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient != 0) {
            if (contentProviderClient instanceof AutoCloseable) {
                contentProviderClient.close();
            } else if (contentProviderClient instanceof ExecutorService) {
                i4.f((ExecutorService) contentProviderClient);
            } else {
                contentProviderClient.release();
            }
        }
    }

    @Override // qh.c1
    public void d(d1 d1Var) {
        v2 v2Var = ((f5) this.b).A;
        if (v2Var != null) {
            o3 o3Var = v2Var.a;
            o3.M1(o3Var, d1Var);
            o3Var.d3.f1(d1Var, true);
        }
    }

    @Override // of.u1
    public void e(int i9) {
        np0 np0Var = (np0) this.b;
        rp0 rp0Var = np0Var.G;
        np0Var.s = i9;
        if (np0Var.v != i9) {
            np0Var.d.clear();
        }
        int i10 = np0Var.F;
        if (np0Var.h() != 0 || np0Var.e.e() || np0Var.E) {
            rp0Var.t0.b(i10);
        } else {
            rp0Var.M.e(false, true);
        }
        np0Var.l();
        int i11 = rp0.W0;
        rp0Var.K0(true);
    }

    public void g() {
        o4.l lVar = (o4.l) this.b;
        int i9 = lVar.D - 1;
        lVar.D = i9;
        if (i9 > 0) {
            return;
        }
        int i10 = 0;
        for (o4.r rVar : lVar.F) {
            rVar.f();
            i10 += rVar.U.a;
        }
        i1[] i1VarArr = new i1[i10];
        int i11 = 0;
        for (o4.r rVar2 : lVar.F) {
            rVar2.f();
            int i12 = rVar2.U.a;
            int i13 = 0;
            while (i13 < i12) {
                rVar2.f();
                i1VarArr[i11] = rVar2.U.a(i13);
                i13++;
                i11++;
            }
        }
        lVar.E = new j1(i1VarArr);
        lVar.C.f(lVar);
    }

    @Override // yf.v1
    public void g0(float f10) {
        xs0 xs0Var = (xs0) this.b;
        xf.s0.e(xs0Var.L1).k(String.valueOf(xf.m.a.indexOf(xs0Var.S0.getCurrentBrush())), f10);
        q1 q1Var = xs0Var.G1;
        q1Var.c = f10;
        xs0Var.s0(q1Var, null);
    }

    @Override // yf.v1
    public float get() {
        xs0 xs0Var = (xs0) this.b;
        int i9 = xs0Var.L1;
        xf.m currentBrush = xs0Var.S0.getCurrentBrush();
        return currentBrush == null ? xf.s0.e(i9).i : xf.s0.e(i9).f(String.valueOf(xf.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override // org.telegram.ui.Components.on0
    public CharSequence getContentDescription() {
        switch (this.a) {
            case 5:
                return " ";
            default:
                uf.g gVar = (uf.g) this.b;
                float f10 = gVar.b;
                return String.valueOf(Math.round((gVar.a.getProgress() * (gVar.c - f10)) + f10));
        }
    }

    @Override // qh.c1
    public void h1(CharSequence charSequence) {
        v2 v2Var = ((f5) this.b).A;
        if (v2Var == null || charSequence == null || charSequence.length() <= 0) {
            return;
        }
        v2Var.a.t4(charSequence.toString());
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ boolean i1(String str, j9 j9Var) {
        return false;
    }

    public la.i j(Object obj) {
        la.g gVar = ((oa.a0) this.b).b;
        gVar.getClass();
        if (obj == null) {
            return la.k.a;
        }
        Class<?> cls = obj.getClass();
        oa.n nVar = new oa.n();
        gVar.f(obj, cls, nVar);
        return nVar.u();
    }

    public void k() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + m());
    }

    @Override // qh.c1
    public void k1(d1 d1Var, int i9, int i10) {
        v2 v2Var;
        n9 textSelectionHelper;
        f5 f5Var = (f5) this.b;
        if (f5Var.C || i9 == i10 || (v2Var = f5Var.A) == null || (textSelectionHelper = v2Var.a.getTextSelectionHelper()) == null) {
            return;
        }
        if (textSelectionHelper.y() && textSelectionHelper.W == f5Var) {
            return;
        }
        f5Var.post(new l4(this, d1Var, i10, textSelectionHelper, i9, 6));
    }

    public void l(long j10) {
        long m10 = m();
        if (m10 != j10) {
            if (m10 != -1) {
                if (m10 != -2) {
                    return;
                } else {
                    m10 = -2;
                }
            }
            StringBuilder s10 = aa.d.s(j10, "expected non-string scope or scope ", " but found ");
            s10.append(m10);
            throw new IOException(s10.toString());
        }
    }

    public long m() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // org.telegram.ui.Components.on0
    public void n() {
        int i9 = this.a;
    }

    @Override // td.d
    public void n1() {
        ((e9) this.b).a.invalidate();
    }

    @Override // androidx.lifecycle.s0
    public p0 o(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.b) {
            if (cVar.a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        hd.m mVar = (hd.m) this.b;
        Exception exception = task.getException();
        if (exception != null) {
            mVar.resumeWith(y5.a(exception));
        } else if (task.isCanceled()) {
            mVar.n(null);
        } else {
            mVar.resumeWith(task.getResult());
        }
    }

    @Override // org.telegram.ui.r9
    public void onDismiss() {
        y0 y0Var = (y0) this.b;
        y0Var.v("scan_qr_popup_closed", null);
        y0Var.d0 = false;
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onStateChanged(boolean z10, int i9) {
        vj0 vj0Var = (vj0) this.b;
        if (z10 && vj0Var.n.o() >= 0) {
            vj0Var.w = true;
        }
        qf0 qf0Var = vj0Var.f;
        ib0 ib0Var = vj0Var.x;
        qf0Var.a(z10, true);
        AndroidUtilities.cancelRunOnUIThread(ib0Var);
        if (z10) {
            AndroidUtilities.runOnUIThread(ib0Var, 16L);
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        d2 d2Var;
        com.google.android.gms.internal.cast.d1 b10;
        a aVar = (a) this.b;
        Bundle bundle = (Bundle) obj;
        if (com.google.android.gms.internal.cast.p0.j) {
            Context context = aVar.a;
            q5.s sVar = aVar.f;
            com.google.android.gms.internal.cast.p0 p0Var = new com.google.android.gms.internal.cast.p0(context, sVar, aVar.c, aVar.j, aVar.g);
            int i9 = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
            boolean z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
            if (i9 == 0) {
                if (!z10) {
                    return;
                }
                i9 = 0;
                z10 = true;
            }
            String packageName = context.getPackageName();
            Locale locale = Locale.ROOT;
            String j10 = ta.b.j(packageName, ".client_cast_analytics_data");
            p0Var.h = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
            w2.q.b(context);
            p0Var.g = w2.q.a().c(u2.a.e).a("CAST_SENDER_SDK", new t2.c("proto"), com.google.android.gms.internal.cast.a0.a);
            if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
                p0Var.e = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
            }
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(j10, 0);
            if (i9 != 0) {
                com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                b11.c = new n2.p(sVar, new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"});
                b11.d = new u5.c[]{m5.y.c};
                b11.b = false;
                b11.a = 8426;
                Task e10 = sVar.e(0, b11.b());
                d5.w wVar = new d5.w();
                wVar.b = p0Var;
                wVar.c = packageName;
                wVar.a = i9;
                wVar.d = sharedPreferences;
                e10.addOnSuccessListener(wVar);
            }
            if (z10) {
                x5.l.h(sharedPreferences);
                q5.b bVar = d2.i;
                synchronized (d2.class) {
                    try {
                        if (d2.k == null) {
                            d2.k = new d2(sharedPreferences, p0Var, packageName);
                        }
                        d2Var = d2.k;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                String str = d2Var.c;
                SharedPreferences sharedPreferences2 = d2Var.b;
                HashSet hashSet = d2Var.f;
                String string = sharedPreferences2.getString("feature_usage_sdk_version", null);
                String string2 = sharedPreferences2.getString("feature_usage_package_name", null);
                hashSet.clear();
                HashSet hashSet2 = d2Var.g;
                hashSet2.clear();
                d2Var.h = 0L;
                String str2 = d2.j;
                if (str2.equals(string) && str.equals(string2)) {
                    d2Var.h = sharedPreferences2.getLong("feature_usage_last_report_time", 0L);
                    long currentTimeMillis = System.currentTimeMillis();
                    HashSet hashSet3 = new HashSet();
                    for (String str3 : sharedPreferences2.getAll().keySet()) {
                        if (str3.startsWith("feature_usage_timestamp_")) {
                            long j11 = sharedPreferences2.getLong(str3, 0L);
                            if (j11 != 0 && currentTimeMillis - j11 > 1209600000) {
                                hashSet3.add(str3);
                            } else if (str3.startsWith("feature_usage_timestamp_reported_feature_")) {
                                com.google.android.gms.internal.cast.d1 b12 = d2.b(str3.substring(41));
                                if (b12 != null) {
                                    hashSet2.add(b12);
                                    hashSet.add(b12);
                                }
                            } else if (str3.startsWith("feature_usage_timestamp_detected_feature_") && (b10 = d2.b(str3.substring(41))) != null) {
                                hashSet.add(b10);
                            }
                        }
                    }
                    d2Var.c(hashSet3);
                    x5.l.h(d2Var.e);
                    x5.l.h(d2Var.d);
                    d2Var.e.post(d2Var.d);
                } else {
                    HashSet hashSet4 = new HashSet();
                    for (String str4 : sharedPreferences2.getAll().keySet()) {
                        if (str4.startsWith("feature_usage_timestamp_")) {
                            hashSet4.add(str4);
                        }
                    }
                    hashSet4.add("feature_usage_last_report_time");
                    d2Var.c(hashSet4);
                    sharedPreferences2.edit().putString("feature_usage_sdk_version", str2).putString("feature_usage_package_name", str).apply();
                }
                d2.a(com.google.android.gms.internal.cast.d1.h);
            }
        }
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // qh.c1
    public boolean p() {
        f5 f5Var = (f5) this.b;
        v2 v2Var = f5Var.A;
        if (v2Var == null || f5Var.a == null) {
            return false;
        }
        return v2Var.a.S4();
    }

    @Override // of.u1
    public boolean p0(int i9) {
        return i9 == ((np0) this.b).r;
    }

    @Override // tf.m
    public void q() {
        ae0 ae0Var = ((be0) this.b).a;
        if (ae0Var != null) {
            ((qr0) ae0Var).a.a0.invalidate();
        }
    }

    @Override // o0.a
    public Cursor s(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e10) {
            Log.w("FontsProvider", "Unable to query the content provider", e10);
            return null;
        }
    }

    @Override // tf.m
    public void v(boolean z10) {
        ((be0) this.b).c.setAspectLock(z10);
    }

    @Override // of.u1
    public /* synthetic */ a0.h y() {
        return null;
    }

    public /* synthetic */ a0(q5.s sVar, String[] strArr) {
        this.a = 12;
        this.b = strArr;
    }

    @Override // org.telegram.ui.Components.h61
    public void onRenderedFirstFrame() {
    }

    public a0(int i9) {
        this.a = i9;
        switch (i9) {
            case 20:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    public a0(v1.c[] initializers) {
        this.a = 19;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.b = initializers;
    }

    public a0(Context context, Uri uri) {
        this.a = 2;
        this.b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private final void h() {
    }

    private final void i() {
    }

    @Override // qh.c1
    public /* synthetic */ void J0() {
    }

    @Override // td.d
    public /* synthetic */ void L() {
    }

    @Override // td.d
    public /* synthetic */ void b() {
    }

    @Override // td.d
    public /* synthetic */ void D(boolean z10) {
    }

    @Override // of.u1
    public /* synthetic */ void H0(ArrayList arrayList) {
    }

    @Override // qh.c1
    public /* synthetic */ void L0(d1 d1Var) {
    }

    @Override // org.telegram.ui.r9
    public /* synthetic */ void T0(MrzRecognizer.Result result) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSeekFinished(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSeekStarted(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onError(k61 k61Var, Exception exc) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
    }
}
