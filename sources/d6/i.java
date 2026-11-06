package d6;

import a8.ia;
import a8.l8;
import a8.ra;
import ai.h0;
import ai.l1;
import ai.s0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.i0;
import androidx.fragment.app.o;
import androidx.fragment.app.r;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import bi.ab;
import bi.dd;
import bi.ec;
import ch.o0;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.e0;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import di.i4;
import e5.n;
import f6.d0;
import fi.e7;
import fi.j0;
import fi.j5;
import fi.ja;
import fi.la;
import fi.va;
import fi.x9;
import fi.y5;
import fi.za;
import gb.l0;
import j6.w;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.MissingFormatArgumentException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.co0;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.t51;
import org.telegram.ui.n00;
import q4.q;
import sg.v0;
import tg.r1;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class i implements SuccessContinuation, h0, a0, androidx.activity.result.b, et0, ce.c, hi0, e0, c4.d, p, co0, n, og.n, v0, za, OnSuccessListener, ib.b {
    public static i c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ i(int i7, boolean z9) {
        this.a = i7;
    }

    public static boolean l0(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static String n0(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static synchronized i o0(Context context) {
        i q02;
        synchronized (i.class) {
            q02 = q0(context.getApplicationContext());
        }
        return q02;
    }

    public static synchronized i q0(Context context) {
        synchronized (i.class) {
            i iVar = c;
            if (iVar != null) {
                return iVar;
            }
            i iVar2 = new i(context);
            c = iVar2;
            return iVar2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r7v4, types: [kd.j, rd.p] */
    @Override // ce.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(ce.d dVar, kd.c cVar) {
        ce.a aVar;
        int i7;
        Throwable th2;
        de.h hVar;
        if (cVar instanceof ce.a) {
            aVar = (ce.a) cVar;
            int i10 = aVar.d;
            if ((i10 & TLObject.FLAG_31) != 0) {
                aVar.d = i10 - TLObject.FLAG_31;
                Object obj = aVar.b;
                jd.a aVar2 = jd.a.a;
                i7 = aVar.d;
                gd.k kVar = gd.k.a;
                if (i7 != 0) {
                    af.b.c(obj);
                    de.h hVar2 = new de.h(dVar, aVar.getContext());
                    try {
                        aVar.a = hVar2;
                        aVar.d = 1;
                        Object invoke = ((kd.j) this.b).invoke(hVar2, aVar);
                        if (invoke != aVar2) {
                            invoke = kVar;
                        }
                        if (invoke == aVar2) {
                            return aVar2;
                        }
                        hVar = hVar2;
                    } catch (Throwable th3) {
                        th2 = th3;
                        hVar = hVar2;
                        hVar.releaseIntercepted();
                        throw th2;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = aVar.a;
                    try {
                        af.b.c(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        hVar.releaseIntercepted();
                        throw th2;
                    }
                }
                hVar.releaseIntercepted();
                return kVar;
            }
        }
        aVar = new ce.a(this, cVar);
        Object obj2 = aVar.b;
        jd.a aVar22 = jd.a.a;
        i7 = aVar.d;
        gd.k kVar2 = gd.k.a;
        if (i7 != 0) {
        }
        hVar.releaseIntercepted();
        return kVar2;
    }

    @Override // fi.za
    public void C(float f10, int i7) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null || (arrayList = e7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((e7) y5Var.d.T.get(i7)).P = f10;
    }

    @Override // org.telegram.ui.Components.co0
    public void C0() {
        i4.h0((i4) this.b);
    }

    @Override // e5.n
    public String[] D() {
        return ((WebViewProviderFactoryBoundaryInterface) this.b).getSupportedFeatures();
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean E() {
        return false;
    }

    @Override // org.telegram.ui.Components.et0
    public void F(boolean z9) {
        dd ddVar = (dd) this.b;
        te.a aVar = ddVar.Y;
        if (aVar != null) {
            aVar.a(z9, true);
        }
        n00 n00Var = ddVar.s;
        if (n00Var != null) {
            n00Var.invalidate();
        }
    }

    @Override // fi.za
    public void G(float f10) {
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.P = f10;
        y5Var.c();
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public boolean I() {
        return true;
    }

    @Override // fi.za
    public void J(long j3) {
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.r0 = j3;
        e7Var.j = true;
        y5Var.y(true);
    }

    @Override // fi.za
    public void K(boolean z9) {
        r1 r1Var;
        va vaVar = ((ja) ((y5) this.b)).C0;
        x9 x9Var = vaVar.v1;
        if (x9Var == null) {
            return;
        }
        r1 r1Var2 = null;
        if (!z9 && (x9Var.getSelectedEntity() instanceof r1)) {
            vaVar.v1.A0(null, true);
            return;
        }
        if (!z9 || (vaVar.v1.getSelectedEntity() instanceof r1)) {
            return;
        }
        j5 j5Var = vaVar.v1.A0;
        int i7 = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= j5Var.getChildCount()) {
                r1Var = null;
                break;
            }
            View childAt = j5Var.getChildAt(i10);
            if (childAt instanceof r1) {
                r1Var = (r1) childAt;
                break;
            }
            i10++;
        }
        if (r1Var != null) {
            x9 x9Var2 = vaVar.v1;
            j5 j5Var2 = x9Var2.A0;
            while (true) {
                if (i7 >= j5Var2.getChildCount()) {
                    break;
                }
                View childAt2 = j5Var2.getChildAt(i7);
                if (childAt2 instanceof r1) {
                    r1Var2 = (r1) childAt2;
                    break;
                }
                i7++;
            }
            x9Var2.A0(r1Var2, true);
        }
    }

    @Override // fi.za
    public void N(float f10, int i7) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null || (arrayList = e7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((e7) y5Var.d.T.get(i7)).V = f10;
    }

    @Override // fi.za
    public void O(float f10) {
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.F = f10;
        e7Var.j = true;
        y5Var.w(true);
    }

    @Override // fi.za
    public void Q(float f10) {
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.E = f10;
        e7Var.j = true;
        y5Var.w(true);
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void R() {
        g0 g0Var = (g0) this.b;
        Iterator it = g0Var.f.values().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.common.api.c) it.next()).a();
        }
        g0Var.o.F = Collections.EMPTY_SET;
    }

    @Override // fi.za
    public void S(float f10, int i7) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null || (arrayList = e7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((e7) y5Var.d.T.get(i7)).W = f10;
    }

    @Override // fi.za
    public void T(float f10) {
        e7 e7Var = ((y5) this.b).d;
        if (e7Var == null) {
            return;
        }
        e7Var.a0 = f10;
        e7Var.j = true;
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean U() {
        return false;
    }

    @Override // fi.za
    public void V() {
        ((y5) this.b).q(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x006c, code lost:
    
        if (r3 == 1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        if (r3 == 3) goto L31;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void X(Object obj) {
        switch (this.a) {
            case 6:
                Integer num = (Integer) obj;
                androidx.biometric.g0 g0Var = (androidx.biometric.g0) this.b;
                Handler handler = g0Var.A0;
                ra raVar = g0Var.B0;
                handler.removeCallbacks(raVar);
                int intValue = num.intValue();
                if (g0Var.F0 != null) {
                    int i7 = g0Var.C0.y;
                    Context n10 = g0Var.n();
                    Drawable drawable = null;
                    if (n10 == null) {
                        Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
                    } else {
                        int i10 = R.drawable.fingerprint_dialog_fp_icon;
                        if (i7 != 0 || intValue != 1) {
                            if (i7 != 1 || intValue != 2) {
                                if (i7 == 2) {
                                }
                                if (i7 == 1) {
                                    break;
                                }
                            } else {
                                i10 = R.drawable.fingerprint_dialog_error;
                            }
                        }
                        drawable = n10.getDrawable(i10);
                    }
                    if (drawable != null) {
                        g0Var.F0.setImageDrawable(drawable);
                        if ((i7 != 0 || intValue != 1) && ((i7 == 1 && intValue == 2) || (i7 == 2 && intValue == 1))) {
                            androidx.biometric.e0.a(drawable);
                        }
                        g0Var.C0.y = intValue;
                    }
                }
                int intValue2 = num.intValue();
                TextView textView = g0Var.G0;
                if (textView != null) {
                    textView.setTextColor(intValue2 == 2 ? g0Var.D0 : g0Var.E0);
                }
                handler.postDelayed(raVar, 2000L);
                return;
            default:
                t tVar = (t) obj;
                o oVar = (o) this.b;
                if (tVar == null || !oVar.r0) {
                    return;
                }
                oVar.getClass();
                throw new IllegalStateException("Fragment " + oVar + " did not return a View from onCreateView() or this was called before onCreateView().");
        }
    }

    @Override // sg.v0
    public void Y() {
        x9 x9Var = (x9) this.b;
        x9Var.m0.a.f();
        x9Var.M0.setViewHidden(false);
    }

    @Override // org.telegram.ui.Components.et0
    public float Y0() {
        return jg.g.e(9.66f, oi.a.d(((dd) this.b).b0), 0);
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void a() {
        g0 g0Var = (g0) this.b;
        Lock lock = g0Var.a;
        lock.lock();
        try {
            g0Var.m = new b0(g0Var, g0Var.j, g0Var.k, g0Var.d, g0Var.l, lock, g0Var.c);
            g0Var.m.R();
            g0Var.b.signalAll();
        } finally {
            g0Var.a.unlock();
        }
    }

    @Override // fi.za
    public void a0(float f10) {
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.t0 = f10;
        e7Var.j = true;
        y5Var.y(true);
    }

    @Override // com.google.android.gms.common.api.internal.p
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 17:
                o8.c cVar = (o8.c) this.b;
                d8.d dVar = new d8.d(1, (TaskCompletionSource) obj2);
                d8.c cVar2 = (d8.c) ((d8.f) obj).n();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i7 = d8.a.a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                cVar.writeToParcel(obtain, 0);
                cVar2.H0(obtain, 1);
                break;
            default:
                w wVar = (w) obj;
                j6.f fVar = (j6.f) wVar.n();
                d0 d0Var = ((f6.e0) this.b).l;
                Parcel P0 = fVar.P0();
                com.google.android.gms.internal.cast.t.d(P0, d0Var);
                fVar.U0(P0, 18);
                j6.f fVar2 = (j6.f) wVar.n();
                fVar2.U0(fVar2.P0(), 17);
                ((TaskCompletionSource) obj2).setResult(null);
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public com.google.android.gms.common.api.internal.d b(com.google.android.gms.common.api.internal.d dVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // fi.za
    public void b0(int i7, long j3) {
        ArrayList arrayList;
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null || (arrayList = e7Var.T) == null || i7 < 0 || i7 >= arrayList.size()) {
            return;
        }
        ((e7) y5Var.d.T.get(i7)).X = j3;
    }

    @Override // e5.n
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) af.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).createWebView(webView));
    }

    @Override // c4.d
    public int d(long j3) {
        return j3 < 0 ? 0 : -1;
    }

    @Override // sg.v0
    public void d0() {
        x9 x9Var = (x9) this.b;
        if (x9Var.s0 != null) {
            x9Var.A0(null, true);
        }
        x9Var.M0.setViewHidden(true);
    }

    @Override // fi.za
    public void e(int i7) {
        fi.e0 e0Var = ((y5) this.b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                fi.d0 d0Var = (fi.d0) obj;
                if (d0Var.a == i7) {
                    d0Var.b.e(true, 1.0f);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override // fi.za
    public void e0(long j3) {
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.D = j3;
        e7Var.j = true;
        y5Var.w(true);
    }

    @Override // org.telegram.ui.Components.et0
    public int e1() {
        return ((dd) this.b).c0;
    }

    @Override // androidx.activity.result.b
    public void f(Object obj) {
        switch (this.a) {
            case 8:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                i0 i0Var = (i0) this.b;
                androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollLast();
                if (e0Var != null) {
                    String str = e0Var.a;
                    int i7 = e0Var.b;
                    r o4 = i0Var.c.o(str);
                    if (o4 != null) {
                        o4.x(i7, aVar.a, aVar.b);
                        break;
                    } else {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                        break;
                    }
                } else {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                }
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.b;
                int i10 = u.e("ProxyBillingActivityV2", intent).a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    resultReceiver.send(i10, intent == null ? null : intent.getExtras());
                }
                int i11 = aVar2.a;
                if (i11 != -1 || i10 != 0) {
                    u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
                }
                proxyBillingActivityV2.finish();
                break;
        }
    }

    public SparseIntArray f0(long j3) {
        return (SparseIntArray) ((a0.h) this.b).f(j3);
    }

    @Override // fi.za
    public void g(float f10) {
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.u0 = f10;
        e7Var.j = true;
        y5Var.c();
    }

    public boolean g0(String str) {
        String k02 = k0(str);
        return "1".equals(k02) || Boolean.parseBoolean(k02);
    }

    @Override // fd.a
    public Object get() {
        return new l0((gb.v0) ((ib.c) this.b).get());
    }

    @Override // e5.n
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) af.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.b).getStatics());
    }

    @Override // fi.za
    public void h(float f10) {
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.G = f10;
        e7Var.j = true;
        y5Var.c();
    }

    public Integer h0(String str) {
        String k02 = k0(str);
        if (TextUtils.isEmpty(k02)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(k02));
        } catch (NumberFormatException unused) {
            Log.w("NotificationParams", "Couldn't parse value of " + n0(str) + "(" + k02 + ") into an int");
            return null;
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public void i(View view, o0 o0Var, boolean z9, boolean z10) {
        ch.r rVar = (ch.r) this.b;
        rVar.a.Ab(null, rVar.e, rVar.b, view, 0.0f, 0.0f, o0Var, false, z9, z10, false);
        org.telegram.messenger.g0.h3(new ab(this, 8));
    }

    public JSONArray i0(String str) {
        String k02 = k0(str);
        if (TextUtils.isEmpty(k02)) {
            return null;
        }
        try {
            return new JSONArray(k02);
        } catch (JSONException unused) {
            Log.w("NotificationParams", "Malformed JSON for key " + n0(str) + ": " + k02 + ", falling back to default");
            return null;
        }
    }

    @Override // fi.za
    public void j(long j3, boolean z9) {
        y5 y5Var = (y5) this.b;
        if (!z9) {
            y5Var.m(j3);
            return;
        }
        t51 t51Var = y5Var.e;
        if (t51Var != null) {
            t51Var.q0(j3, true);
            return;
        }
        if (y5Var.j()) {
            y5Var.E.m(j3, true);
            return;
        }
        t51 t51Var2 = y5Var.D;
        if (t51Var2 != null) {
            t51Var2.q0(j3, false);
        }
    }

    public String j0(Resources resources, String str, String str2) {
        String[] strArr;
        String k02 = k0(str2);
        if (!TextUtils.isEmpty(k02)) {
            return k02;
        }
        String k03 = k0(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(k03)) {
            return null;
        }
        int identifier = resources.getIdentifier(k03, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", n0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray i02 = i0(str2.concat("_loc_args"));
        if (i02 == null) {
            strArr = null;
        } else {
            int length = i02.length();
            strArr = new String[length];
            for (int i7 = 0; i7 < length; i7++) {
                strArr[i7] = i02.optString(i7);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e10) {
            Log.w("NotificationParams", "Missing format argument for " + n0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e10);
            return null;
        }
    }

    @Override // c4.d
    public long k(int i7) {
        ia.f(i7 == 0);
        return 0L;
    }

    public String k0(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String replace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    @Override // ai.h0
    public void l(ai.i0 i0Var) {
        s0 s0Var = (s0) this.b;
        FrameLayout frameLayout = s0Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(i0Var);
        }
        if (s0Var.F == i0Var) {
            s0Var.F = null;
        }
        l1 l1Var = s0Var.d;
        if (l1Var != null) {
            l1Var.setScanHidden(false);
        }
    }

    @Override // ai.h0
    public void m(String str) {
        s0 s0Var = (s0) this.b;
        if (s0Var.getParentActivity() != null) {
            vf.c.t(s0Var.getParentActivity(), str);
        }
    }

    public Bundle m0() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override // sg.v0
    public void o() {
        ec ecVar = ((x9) this.b).y0;
        if (ecVar != null) {
            ecVar.invalidate();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        ((g6.a) this.b).getClass();
        l8.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override // sg.v0
    public void p() {
        x9 x9Var = (x9) this.b;
        if (x9Var.L0) {
            x9Var.L0 = false;
        } else {
            x9Var.T0.b(1);
            x9Var.w((sg.h) sg.h.a.get(0));
        }
    }

    public synchronized void p0() {
        synchronized (this) {
            try {
                b bVar = (b) this.b;
                ReentrantLock reentrantLock = bVar.a;
                reentrantLock.lock();
                try {
                    bVar.b.edit().clear().apply();
                } finally {
                    reentrantLock.unlock();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // fi.za
    public void r() {
        y5 y5Var = (y5) this.b;
        y5Var.s(null, null, true);
        va vaVar = ((ja) y5Var).C0;
        ja jaVar = vaVar.X0;
        if (jaVar != null) {
            jaVar.s(null, null, true);
        }
        x9 x9Var = vaVar.v1;
        if (x9Var != null) {
            x9Var.n0();
        }
        la laVar = vaVar.c1;
        if (laVar != null) {
            laVar.setHasRoundVideo(false);
        }
        e7 e7Var = vaVar.K1;
        if (e7Var != null) {
            File file = e7Var.o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                vaVar.K1.o0 = null;
            }
            if (vaVar.K1.p0 != null) {
                try {
                    new File(vaVar.K1.p0).delete();
                } catch (Exception unused2) {
                }
                vaVar.K1.p0 = null;
            }
        }
    }

    @Override // c4.d
    public List s(long j3) {
        return j3 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // fi.za
    public void t(boolean z9, float f10) {
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.Z = f10;
        e7Var.j = true;
        t51 t51Var = y5Var.e;
        if (t51Var == null || t51Var.U() == -9223372036854775807L) {
            return;
        }
        y5Var.m((long) (f10 * y5Var.e.U()));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ia.b bVar = (ia.b) obj;
        q qVar = (q) this.b;
        if (bVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.forResult(null);
        }
        aa.q qVar2 = (aa.q) qVar.c;
        aa.q qVar3 = (aa.q) qVar.c;
        aa.q.b(qVar2);
        qVar3.m.h(null, qVar3.e.a);
        qVar3.q.trySetResult(null);
        return Tasks.forResult(null);
    }

    @Override // fi.za
    public void u(float f10) {
        y5 y5Var = (y5) this.b;
        e7 e7Var = y5Var.d;
        if (e7Var == null) {
            return;
        }
        e7Var.s0 = f10;
        e7Var.j = true;
        y5Var.y(true);
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean v() {
        return true;
    }

    @Override // og.n
    public void w() {
        ((j0) this.b).d.invalidate();
    }

    @Override // fi.za
    public void x(boolean z9) {
        y5 y5Var = (y5) this.b;
        if (y5Var.j()) {
            y5Var.E.getClass();
        }
        y5Var.x(-4, z9);
    }

    @Override // c4.d
    public int y() {
        return 1;
    }

    @Override // sg.v0
    public boolean z() {
        x9 x9Var = (x9) this.b;
        boolean z9 = x9Var.s0 == null;
        if (!z9) {
            x9Var.A0(null, true);
        }
        return z9;
    }

    public /* synthetic */ i(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    public i(Context context) {
        String e10;
        this.a = 0;
        b a10 = b.a(context);
        this.b = a10;
        a10.b();
        String e11 = a10.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e11) || (e10 = a10.e(b.f("googleSignInOptions", e11))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e10);
        } catch (JSONException unused) {
        }
    }

    public i(int i7) {
        this.a = i7;
        switch (i7) {
            case 10:
                this.b = new a0.h();
                break;
            default:
                this.b = new LinkedHashMap(0, 0.75f, true);
                break;
        }
    }

    public i(Bundle bundle) {
        this.a = 3;
        this.b = new Bundle(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(rd.p pVar) {
        this.a = 12;
        this.b = (kd.j) pVar;
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.co0
    public /* synthetic */ void W() {
    }

    @Override // og.n
    public void c0() {
    }

    @Override // sg.v0
    public void n() {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void A(int i7) {
    }

    @Override // og.n
    public void H(boolean z9) {
    }

    @Override // og.n
    public void Z(boolean z9) {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void c(Bundle bundle) {
    }

    @Override // com.google.android.gms.common.api.internal.e0
    public void q(n6.a aVar, com.google.android.gms.common.api.e eVar, boolean z9) {
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
