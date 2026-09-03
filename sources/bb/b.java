package bb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.b0;
import androidx.fragment.app.f0;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import dg.q3;
import dg.s2;
import f0.f;
import f2.p1;
import f2.w0;
import g.q;
import g5.h0;
import g5.m0;
import gg.y1;
import i5.p;
import j3.g0;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import k1.d0;
import k1.g;
import l.i;
import l.k;
import l.w;
import l3.n0;
import l3.t;
import l8.m;
import m.h;
import m.v3;
import m8.e0;
import nh.e9;
import nh.f9;
import nh.g4;
import nh.k3;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Stories.ProfileStoriesView;
import org.telegram.ui.a01;
import org.telegram.ui.fz0;
import r0.j0;
import r0.m1;
import r4.d;
import wc.c;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b implements a0, androidx.activity.result.b, k0, v0, s2, p1, o, r0.o, h0, p, t, OnCompleteListener, w, i, g, e9 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    public static boolean O(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String R(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    @Override // dg.s2
    public void A(float f10) {
        ((q3) this.b).setOutlineWidth(f10);
    }

    @Override // f2.p1
    public View B(int i10) {
        return ((f2.v0) this.b).q(i10);
    }

    @Override // k1.g
    public Object C(dd.p pVar, c cVar) {
        return ((d0) this.b).C(new n1.c(pVar, null, 0), cVar);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public boolean D() {
        return true;
    }

    @Override // f2.p1
    public int E(View view) {
        return f2.v0.v(view) + ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).bottomMargin;
    }

    @Override // l3.t
    public void F() {
        g0 g0Var = ((n0) this.b).c1;
        if (g0Var != null) {
            g0Var.a.n.d(2);
        }
    }

    @Override // androidx.lifecycle.a0
    public void G(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.h0 h0Var = (androidx.biometric.h0) this.b;
        Handler handler = h0Var.x0;
        androidx.activity.i iVar = h0Var.y0;
        handler.removeCallbacks(iVar);
        TextView textView = h0Var.D0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public e H(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public boolean I(String str) {
        String N = N(str);
        return "1".equals(N) || Boolean.parseBoolean(N);
    }

    public Integer J(String str) {
        String N = N(str);
        if (TextUtils.isEmpty(N)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(N));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + R(str) + "(" + N + ") into an int");
            return null;
        }
    }

    public JSONArray K(String str) {
        String N = N(str);
        if (TextUtils.isEmpty(N)) {
            return null;
        }
        try {
            return new JSONArray(N);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + R(str) + ": " + N + ", falling back to default");
            return null;
        }
    }

    public PackageInfo L(int i10, String str) {
        return ((Context) this.b).getPackageManager().getPackageInfo(str, i10);
    }

    public String M(Resources resources, String str, String str2) {
        String[] strArr;
        String N = N(str2);
        if (!TextUtils.isEmpty(N)) {
            return N;
        }
        String N2 = N(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(N2)) {
            return null;
        }
        int identifier = resources.getIdentifier(N2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", R(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray K = K(str2.concat("_loc_args"));
        if (K == null) {
            strArr = null;
        } else {
            int length = K.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = K.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + R(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override // r0.o
    public m1 M0(View view, m1 m1Var) {
        boolean z4;
        boolean z10;
        int d = m1Var.d();
        q qVar = (q) this.b;
        Context context = qVar.e;
        int d10 = m1Var.d();
        ActionBarContextView actionBarContextView = qVar.y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z4 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.y.getLayoutParams();
            if (qVar.y.isShown()) {
                if (qVar.i0 == null) {
                    qVar.i0 = new Rect();
                    qVar.j0 = new Rect();
                }
                Rect rect = qVar.i0;
                Rect rect2 = qVar.j0;
                rect.set(m1Var.b(), m1Var.d(), m1Var.c(), m1Var.a());
                ViewGroup viewGroup = qVar.G;
                Method method = v3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                m1 f10 = j0.f(qVar.G);
                int b10 = f10 == null ? 0 : f10.b();
                int c3 = f10 == null ? 0 : f10.c();
                if (marginLayoutParams.topMargin == i10 && marginLayoutParams.leftMargin == i11 && marginLayoutParams.rightMargin == i12) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i10;
                    marginLayoutParams.leftMargin = i11;
                    marginLayoutParams.rightMargin = i12;
                    z10 = true;
                }
                if (i10 <= 0 || qVar.I != null) {
                    View view2 = qVar.I;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c3) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c3;
                            qVar.I.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    qVar.I = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c3;
                    qVar.G.addView(qVar.I, -1, layoutParams);
                }
                View view4 = qVar.I;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = qVar.I;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? f.c(context, R.color.abc_decor_view_status_guard_light) : f.c(context, R.color.abc_decor_view_status_guard));
                }
                if (!qVar.N && r9) {
                    d10 = 0;
                }
                z4 = r9;
                r9 = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z4 = false;
            } else {
                z4 = false;
                r9 = false;
            }
            if (r9) {
                qVar.y.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = qVar.I;
        if (view6 != null) {
            view6.setVisibility(z4 ? 0 : 8);
        }
        return j0.h(view, d != d10 ? m1Var.f(m1Var.b(), d10, m1Var.c(), m1Var.a()) : m1Var);
    }

    public String N(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public Bundle P() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public void Q(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override // nh.e9
    public boolean V0(long j10, int i10, int i11, int i12, f9 f9Var) {
        ImageReceiver imageReceiver;
        g4 g4Var;
        g4 g4Var2;
        f9Var.b = null;
        f9Var.c = null;
        fz0 fz0Var = (fz0) this.b;
        a01 a01Var = fz0Var.h;
        ArrayList arrayList = fz0Var.w;
        if (fz0Var.K < 0.2f) {
            f9Var.b = a01Var.getImageReceiver();
            f9Var.c = null;
            f9Var.a = a01Var;
            f9Var.h = 0.0f;
            f9Var.i = AndroidUtilities.displaySize.y;
            f9Var.g = (View) fz0Var.getParent();
            f9Var.d = fz0Var.y;
            f9Var.n = true;
            return true;
        }
        int i13 = 0;
        while (true) {
            if (i13 >= arrayList.size()) {
                imageReceiver = null;
                g4Var = null;
                g4Var2 = null;
                break;
            }
            g4 g4Var3 = (g4) arrayList.get(i13);
            if (g4Var3.e >= 1.0f && g4Var3.a == i11) {
                int i14 = i13 - 1;
                int i15 = i13 - 2;
                g4 d = ProfileStoriesView.d(i14 >= 0 ? (g4) arrayList.get(i14) : null, i15 >= 0 ? (g4) arrayList.get(i15) : null, g4Var3);
                imageReceiver = g4Var3.b;
                g4Var2 = d;
                g4Var = g4Var3;
            }
            i13++;
        }
        if (imageReceiver == null) {
            return false;
        }
        f9Var.c = imageReceiver;
        f9Var.b = null;
        f9Var.a = fz0Var;
        f9Var.h = 0.0f;
        f9Var.i = AndroidUtilities.displaySize.y;
        f9Var.g = (View) fz0Var.getParent();
        if (g4Var == null || g4Var2 == null) {
            f9Var.f = null;
            return true;
        }
        f9Var.f = new f1.a(this, new RectF(g4Var.m), g4Var, new RectF(g4Var2.m), g4Var2);
        return true;
    }

    @Override // g5.h0
    public c4.e X(g5.j0 j0Var, IOException iOException, int i10) {
        r4.g gVar = ((d) this.b).a;
        h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return m0.e;
    }

    @Override // l3.t
    public void a(long j10) {
        f7.b bVar = ((n0) this.b).S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new y1(bVar, j10, 1));
        }
    }

    @Override // l.w
    public void c(k kVar, boolean z4) {
        if (kVar instanceof l.d0) {
            ((l.d0) kVar).z.k().c(false);
        }
        w wVar = ((h) this.b).e;
        if (wVar != null) {
            wVar.c(kVar, z4);
        }
    }

    @Override // l3.t
    public void e() {
        g0 g0Var = ((n0) this.b).c1;
        if (g0Var != null) {
            g0Var.a.T = true;
        }
    }

    @Override // f2.p1
    public int f(View view) {
        return f2.v0.z(view) - ((ViewGroup.MarginLayoutParams) ((w0) view.getLayoutParams())).topMargin;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void g(Object obj) {
        ((u7.c) obj).onLocationResult((LocationResult) this.b);
    }

    @Override // dg.s2
    public float get() {
        return ((q3) this.b).C;
    }

    @Override // k1.g
    public od.b getData() {
        return ((d0) this.b).c;
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void h() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.b;
        m0Var.a.lock();
        try {
            m0Var.m = new com.google.android.gms.common.api.internal.g0(m0Var, m0Var.j, m0Var.k, m0Var.d, m0Var.l, m0Var.a, m0Var.c);
            m0Var.m.w();
            m0Var.b.signalAll();
        } finally {
            m0Var.a.unlock();
        }
    }

    @Override // l.i
    public void i(k kVar) {
        Toolbar toolbar = (Toolbar) this.b;
        h hVar = toolbar.a.G;
        if (hVar == null || !hVar.g()) {
            Iterator it = ((CopyOnWriteArrayList) toolbar.T.c).iterator();
            while (it.hasNext()) {
                ((b0) it.next()).a.t();
            }
        }
    }

    @Override // f2.p1
    public int j() {
        return ((f2.v0) this.b).G();
    }

    @Override // g5.h0
    public void k1(g5.j0 j0Var, long j10, long j11) {
        boolean z4;
        d dVar = (d) this.b;
        synchronized (h5.a.i) {
            z4 = h5.a.j;
        }
        if (z4) {
            dVar.a();
            return;
        }
        IOException iOException = new IOException(new ConcurrentModificationException());
        r4.g gVar = dVar.a;
        h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
    }

    @Override // i5.p
    public void l(gg.f fVar) {
        fVar.a(((WindowManager) this.b).getDefaultDisplay());
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void m(int i10) {
        x xVar = (x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (xVar.n) {
                xVar.n = false;
                x.k(xVar, i10);
            } else {
                xVar.n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override // l3.t
    public void n(int i10, long j10, long j11) {
        f7.b bVar = ((n0) this.b).S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new g5.d(bVar, i10, j10, j11, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void o(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = y5.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.b;
        if (task.isSuccessful()) {
            m.K0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            m.K0(e0Var, false, null);
        }
    }

    @Override // l3.t
    public void onSkipSilenceEnabledChanged(boolean z4) {
        f7.b bVar = ((n0) this.b).S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new jh.f(1, bVar, z4));
        }
    }

    @Override // l.w
    public boolean p(k kVar) {
        h hVar = (h) this.b;
        if (kVar == hVar.c) {
            return false;
        }
        ((l.d0) kVar).A.getClass();
        hVar.getClass();
        w wVar = hVar.e;
        if (wVar != null) {
            return wVar.p(kVar);
        }
        return false;
    }

    @Override // l.i
    public boolean q(k kVar, MenuItem menuItem) {
        ((Toolbar) this.b).getClass();
        return false;
    }

    @Override // l3.t
    public void r() {
        f5.p pVar;
        n0 n0Var = (n0) this.b;
        synchronized (n0Var.a) {
            pVar = n0Var.y;
        }
        if (pVar != null) {
            pVar.i();
        }
    }

    @Override // f2.p1
    public int s() {
        f2.v0 v0Var = (f2.v0) this.b;
        return v0Var.n - v0Var.C();
    }

    public String toString() {
        switch (this.a) {
            case 9:
                de.b bVar = de.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((da.a) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // l3.t
    public void u(Exception exc) {
        h5.a.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        f7.b bVar = ((n0) this.b).S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new l3.o(bVar, exc, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void v(y5.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.m = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void w() {
        com.google.android.gms.common.api.internal.m0 m0Var = (com.google.android.gms.common.api.internal.m0) this.b;
        Iterator it = m0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).disconnect();
        }
        m0Var.o.C = Collections.EMPTY_SET;
    }

    @Override // androidx.activity.result.b
    public void x(Object obj) {
        Map map = (Map) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.b;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
        }
        f0 f0Var = (f0) j0Var.F.pollFirst();
        if (f0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = f0Var.a;
            if (j0Var.c.r(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    @Override // l3.t
    public void y() {
        ((n0) this.b).a1 = true;
    }

    @Override // nh.e9
    public void z0(long j10, int i10, k3 k3Var) {
        fz0 fz0Var = (fz0) this.b;
        int i11 = ProfileStoriesView.p0;
        fz0Var.f(true, false);
        k3Var.run();
    }

    public /* synthetic */ b(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public b(Set set) {
        this.a = 0;
        this.b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            HashMap hashMap = (HashMap) this.b;
            aVar.getClass();
            hashMap.put(androidx.activity.result.c.class, aVar.a);
        }
    }

    public b() {
        this.a = 3;
        this.b = new LinkedHashMap(0, 0.75f, true);
    }

    public b(Bundle bundle) {
        this.a = 8;
        this.b = new Bundle(bundle);
    }

    @Override // i5.p
    public void z() {
    }

    @Override // nh.e9
    public /* synthetic */ void b(boolean z4) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void d(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void t(int i10) {
    }

    @Override // com.google.android.gms.common.api.internal.k0
    public void k(y5.a aVar, com.google.android.gms.common.api.e eVar, boolean z4) {
    }

    @Override // g5.h0
    public void x0(g5.j0 j0Var, long j10, long j11, boolean z4) {
    }
}
