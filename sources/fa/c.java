package fa;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.d0;
import androidx.biometric.f0;
import androidx.fragment.app.u;
import androidx.lifecycle.a0;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import c3.h;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d3.j;
import e2.d;
import e9.z;
import f2.a1;
import f2.g1;
import f2.q1;
import f2.t1;
import f2.v1;
import f2.z0;
import f7.d7;
import g.q;
import gh.k5;
import ih.i4;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import kh.n0;
import kh.o6;
import kh.r6;
import l3.e;
import m.w3;
import m.y0;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.k61;
import org.telegram.ui.z51;
import r0.j0;
import r0.m1;
import r4.f;
import tf.m;
import x5.l;
import yf.b2;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class c implements f, a0, o, v0, y2.b, d, v1, r0.o, gp0, z51, m, h61, e, SuccessContinuation, y0 {
    public static volatile c c;
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ c(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    public static p D(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override // org.telegram.ui.Components.gp0
    public /* synthetic */ void A() {
        int i9 = this.a;
    }

    @Override // f2.v1
    public int B(View view) {
        return z0.y(view) + ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).rightMargin;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        if (r3 == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0049, code lost:
    
        if (r3 == 3) goto L23;
     */
    @Override // androidx.lifecycle.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void E(Object obj) {
        Integer num = (Integer) obj;
        f0 f0Var = (f0) this.b;
        Handler handler = f0Var.w0;
        i iVar = f0Var.x0;
        handler.removeCallbacks(iVar);
        int intValue = num.intValue();
        if (f0Var.B0 != null && Build.VERSION.SDK_INT >= 23) {
            int i9 = f0Var.y0.y;
            Context n10 = f0Var.n();
            Drawable drawable = null;
            if (n10 == null) {
                Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            } else {
                int i10 = R.drawable.fingerprint_dialog_fp_icon;
                if (i9 != 0 || intValue != 1) {
                    if (i9 == 1 && intValue == 2) {
                        i10 = R.drawable.fingerprint_dialog_error;
                    } else {
                        if (i9 == 2) {
                        }
                        if (i9 == 1) {
                        }
                    }
                }
                drawable = n10.getDrawable(i10);
            }
            if (drawable != null) {
                f0Var.B0.setImageDrawable(drawable);
                if ((i9 != 0 || intValue != 1) && ((i9 == 1 && intValue == 2) || (i9 == 2 && intValue == 1))) {
                    d0.a(drawable);
                }
                f0Var.y0.y = intValue;
            }
        }
        int intValue2 = num.intValue();
        TextView textView = f0Var.C0;
        if (textView != null) {
            textView.setTextColor(intValue2 == 2 ? f0Var.z0 : f0Var.A0);
        }
        handler.postDelayed(iVar, 2000L);
    }

    public Set I() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.b);
        }
        return unmodifiableSet;
    }

    public void J() {
        ((u) this.b).d.R();
    }

    public void K(h hVar, Thread thread, Throwable th) {
        e9.o oVar = (e9.o) this.b;
        synchronized (oVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    z.a(oVar.e.R(new e9.l(oVar, System.currentTimeMillis(), th, thread, hVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    public void L(q1 q1Var, d5.p pVar, d5.p pVar2) {
        boolean z10;
        q1 T;
        int i9;
        RecyclerView recyclerView = (RecyclerView) this.b;
        recyclerView.b.k(q1Var);
        recyclerView.h(q1Var);
        q1Var.q(false);
        t1 t1Var = (t1) recyclerView.V;
        t1Var.getClass();
        int i10 = pVar.a;
        int i11 = pVar.b;
        View view = q1Var.a;
        int left = pVar2 == null ? view.getLeft() : pVar2.a;
        int top = pVar2 == null ? view.getTop() : pVar2.b;
        if (q1Var.j() || (i10 == left && i11 == top)) {
            int i12 = q1Var.h;
            int i13 = -1;
            if (i12 != -1) {
                for (int i14 = 0; i14 < recyclerView.getChildCount(); i14++) {
                    View childAt = recyclerView.getChildAt(i14);
                    if (childAt != null && (T = recyclerView.T(childAt)) != null && !T.j() && (i9 = T.h) >= 0 && i9 < i12 && i9 > i13) {
                        i13 = i9;
                    }
                }
            }
            q1Var.i = (q1Var.h - i13) + (i13 * MediaDataController.MAX_STYLE_RUNS_COUNT);
            t1Var.s(q1Var, pVar);
            z10 = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z10 = t1Var.r(q1Var, pVar, i10, i11, left, top);
        }
        if (z10) {
            recyclerView.l0();
        }
    }

    @Override // r0.o
    public m1 L0(View view, m1 m1Var) {
        boolean z10;
        boolean z11;
        int d = m1Var.d();
        q qVar = (q) this.b;
        Context context = qVar.e;
        int d9 = m1Var.d();
        ActionBarContextView actionBarContextView = qVar.y;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z10 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.y.getLayoutParams();
            if (qVar.y.isShown()) {
                if (qVar.h0 == null) {
                    qVar.h0 = new Rect();
                    qVar.i0 = new Rect();
                }
                Rect rect = qVar.h0;
                Rect rect2 = qVar.i0;
                rect.set(m1Var.b(), m1Var.d(), m1Var.c(), m1Var.a());
                ViewGroup viewGroup = qVar.F;
                Method method = w3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i9 = rect.top;
                int i10 = rect.left;
                int i11 = rect.right;
                m1 f10 = j0.f(qVar.F);
                int b10 = f10 == null ? 0 : f10.b();
                int c10 = f10 == null ? 0 : f10.c();
                if (marginLayoutParams.topMargin == i9 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i9;
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    z11 = true;
                }
                if (i9 <= 0 || qVar.H != null) {
                    View view2 = qVar.H;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i12 = marginLayoutParams2.height;
                        int i13 = marginLayoutParams.topMargin;
                        if (i12 != i13 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c10) {
                            marginLayoutParams2.height = i13;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c10;
                            qVar.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    qVar.H = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c10;
                    qVar.F.addView(qVar.H, -1, layoutParams);
                }
                View view4 = qVar.H;
                r9 = view4 != null;
                if (r9 && view4.getVisibility() != 0) {
                    View view5 = qVar.H;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? f0.e.c(context, R.color.abc_decor_view_status_guard_light) : f0.e.c(context, R.color.abc_decor_view_status_guard));
                }
                if (!qVar.M && r9) {
                    d9 = 0;
                }
                z10 = r9;
                r9 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                r9 = false;
            }
            if (r9) {
                qVar.y.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = qVar.H;
        if (view6 != null) {
            view6.setVisibility(z10 ? 0 : 8);
        }
        return j0.h(view, d != d9 ? m1Var.f(m1Var.b(), d9, m1Var.c(), m1Var.a()) : m1Var);
    }

    public void M(q1 q1Var) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        z0 z0Var = recyclerView.x;
        View view = q1Var.a;
        g1 g1Var = recyclerView.b;
        a5.m mVar = z0Var.a;
        k5.i iVar = (k5.i) mVar.b;
        int indexOfChild = ((RecyclerView) iVar.b).indexOfChild(view);
        if (indexOfChild >= 0) {
            if (((f2.d) mVar.c).K(indexOfChild)) {
                mVar.B(view);
            }
            iVar.O(indexOfChild);
        }
        g1Var.g(view);
    }

    @Override // l3.e
    public UUID a() {
        return h3.h.a;
    }

    @Override // r4.f
    public int b(long j10) {
        return j10 < 0 ? 0 : -1;
    }

    @Override // f2.v1
    public int c(View view) {
        return z0.x(view) - ((ViewGroup.MarginLayoutParams) ((a1) view.getLayoutParams())).leftMargin;
    }

    @Override // l3.e
    public boolean d() {
        return false;
    }

    @Override // e2.d
    public void e() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // e2.d
    public void g(int i9, Object obj) {
        String str;
        switch (i9) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i9 == 6 || i9 == 7 || i9 == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i9);
    }

    @Override // nc.a
    public Object get() {
        return new j((Context) ((nc.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(j.d).intValue());
    }

    @Override // r4.f
    public long h(int i9) {
        d5.a.f(i9 == 0);
        return 0L;
    }

    @Override // org.telegram.ui.Components.gp0
    public void h0() {
        switch (this.a) {
            case 19:
                gc k10 = ((k5) this.b).getBulletinFactory().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                i4.j0((i4) this.b);
                break;
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void i(Object obj) {
        ((q7.c) obj).onLocationAvailability((LocationAvailability) this.b);
    }

    @Override // l3.e
    public int j() {
        return 1;
    }

    @Override // f2.v1
    public int l() {
        return ((z0) this.b).D();
    }

    @Override // r4.f
    public List m(long j10) {
        return j10 >= 0 ? (List) this.b : Collections.EMPTY_LIST;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void n(int i9) {
        u5.a aVar;
        x xVar = (x) this.b;
        Lock lock = xVar.o;
        lock.lock();
        try {
            if (!xVar.n && (aVar = xVar.m) != null && aVar.c()) {
                xVar.n = true;
                xVar.e.onConnectionSuspended(i9);
                lock.unlock();
            }
            xVar.n = false;
            x.k(xVar, i9);
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ void onRenderedFirstFrame(i3.a aVar) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onStateChanged(boolean z10, int i9) {
        r6 r6Var = (r6) this.b;
        o6 o6Var = r6Var.I;
        k61 k61Var = r6Var.x;
        if (k61Var == null) {
            return;
        }
        if (k61Var.z()) {
            AndroidUtilities.runOnUIThread(o6Var);
        } else {
            AndroidUtilities.cancelRunOnUIThread(o6Var);
        }
    }

    @Override // org.telegram.ui.Components.h61
    public /* synthetic */ boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override // org.telegram.ui.Components.h61
    public void onVideoSizeChanged(int i9, int i10, int i11, float f10) {
        r6 r6Var = (r6) this.b;
        r6Var.getClass();
        r6Var.getClass();
        b2 b2Var = r6Var.w;
        if (b2Var != null) {
            float f11 = i9 / i10;
            if (Math.abs(b2Var.u0 - f11) >= 1.0E-4f) {
                b2Var.u0 = f11;
                b2Var.requestLayout();
            }
        }
    }

    @Override // tf.m
    public void q() {
        ((n0) this.b).e.invalidate();
    }

    @Override // r4.f
    public int r() {
        return 1;
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void s(Bundle bundle) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            Bundle bundle2 = xVar.k;
            if (bundle2 == null) {
                xVar.k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.l = u5.a.e;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // com.google.android.gms.common.api.internal.v0
    public void t(u5.a aVar) {
        x xVar = (x) this.b;
        xVar.o.lock();
        try {
            xVar.l = aVar;
            x.l(xVar);
        } finally {
            xVar.o.unlock();
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        h hVar = (h) this.b;
        d7 d7Var = (d7) hVar.f;
        l9.c cVar = (l9.c) hVar.b;
        String str = d7Var.a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = d7.b(cVar);
            a5.m mVar = new a5.m(str, b10);
            mVar.x("User-Agent", "Crashlytics Android SDK/18.6.0");
            mVar.x("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            d7.a(mVar, cVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = d7Var.c(mVar.k());
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e10);
            jSONObject = null;
        }
        if (jSONObject != null) {
            l9.a N = ((k5.i) hVar.c).N(jSONObject);
            android.support.v4.media.c cVar2 = (android.support.v4.media.c) hVar.e;
            long j10 = N.c;
            cVar2.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) cVar2.b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e11) {
                        e = e11;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        e9.h.c(fileWriter, "Failed to close settings writer.");
                        h.f("Loaded settings: ", jSONObject);
                        String str4 = cVar.f;
                        SharedPreferences.Editor edit = ((Context) hVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) hVar.h).set(N);
                        ((TaskCompletionSource) ((AtomicReference) hVar.i).get()).trySetResult(N);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileWriter2 = fileWriter;
                    e9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e12) {
                e = e12;
                fileWriter = null;
            } catch (Throwable th2) {
                th = th2;
                e9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            e9.h.c(fileWriter, "Failed to close settings writer.");
            h.f("Loaded settings: ", jSONObject);
            String str42 = cVar.f;
            SharedPreferences.Editor edit2 = ((Context) hVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) hVar.h).set(N);
            ((TaskCompletionSource) ((AtomicReference) hVar.i).get()).trySetResult(N);
        }
        return Tasks.forResult(null);
    }

    @Override // f2.v1
    public int u() {
        z0 z0Var = (z0) this.b;
        return z0Var.m - z0Var.E();
    }

    @Override // l3.e
    public boolean w(String str) {
        return false;
    }

    @Override // l3.e
    public l3.d x() {
        return (l3.d) this.b;
    }

    @Override // l3.e
    public k3.b y() {
        return null;
    }

    @Override // f2.v1
    public View z(int i9) {
        return ((z0) this.b).q(i9);
    }

    public c(ArrayList arrayList) {
        this.a = 1;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override // org.telegram.ui.Components.h61
    public void onRenderedFirstFrame() {
    }

    public c(int i9) {
        this.a = i9;
        switch (i9) {
            case 8:
                this.b = Collections.newSetFromMap(new WeakHashMap());
                break;
            case 16:
                break;
            default:
                this.b = new HashSet();
                break;
        }
    }

    private final /* synthetic */ void G() {
    }

    private final /* synthetic */ void H() {
    }

    @Override // tf.m
    public void F() {
    }

    @Override // tf.m
    public void C(boolean z10) {
    }

    @Override // m.y0
    public void f(int i9) {
    }

    @Override // l3.e
    public void k(a6.a aVar) {
    }

    @Override // m.y0
    public void o(int i9) {
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

    @Override // l3.e
    public void p(a6.a aVar) {
    }

    @Override // tf.m
    public void v(boolean z10) {
    }

    @Override // org.telegram.ui.Components.h61
    public void onError(k61 k61Var, Exception exc) {
    }
}
