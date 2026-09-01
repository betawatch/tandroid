package ja;

import ag.n;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Parcel;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.biometric.i0;
import androidx.fragment.app.f0;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.internal.j0;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eg.o3;
import eg.q2;
import f0.e;
import f2.q1;
import f2.w0;
import g.q;
import g5.h0;
import g5.m0;
import hg.y1;
import i5.p;
import j$.util.DesugarCollections;
import j3.g0;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import l3.n0;
import l3.t;
import l8.m;
import lh.c3;
import m.u3;
import m.x0;
import m8.e0;
import ng.q0;
import ng.v;
import o7.d;
import o7.f;
import oh.f4;
import oh.z8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ko0;
import org.telegram.ui.Components.m6;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.tu0;
import r0.m1;
import r4.g;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class c implements ko0, a0, androidx.activity.result.b, q2, q1, o, r0.o, h0, p, t, OnCompleteListener, x0, qk0, s, tu0 {
    public static volatile c b;
    public Object a;

    public /* synthetic */ c(Object obj) {
        this.a = obj;
    }

    public Set B() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.a)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.a);
        }
        return unmodifiableSet;
    }

    public boolean C() {
        com.google.android.gms.common.api.internal.x0 x0Var = ((j0) this.a).d;
        return x0Var != null && x0Var.b();
    }

    public void D(int i10) {
        RecyclerView recyclerView = (RecyclerView) this.a;
        View childAt = recyclerView.getChildAt(i10);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i10);
    }

    @Override // org.telegram.ui.tu0
    public void G(MessageObject messageObject) {
        ((z8) ((f4) this.a).N1).f(false);
    }

    @Override // eg.q2
    public void H(float f10) {
        ((o3) this.a).setOutlineWidth(f10);
    }

    @Override // f2.q1
    public View I(int i10) {
        return ((w0) this.a).q(i10);
    }

    @Override // f2.q1
    public int J(View view) {
        return w0.v(view) + ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).bottomMargin;
    }

    @Override // r0.o
    public m1 M0(View view, m1 m1Var) {
        boolean z4;
        boolean z10;
        int d = m1Var.d();
        q qVar = (q) this.a;
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
                Method method = u3.a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e6) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e6);
                    }
                }
                int i10 = rect.top;
                int i11 = rect.left;
                int i12 = rect.right;
                m1 f10 = r0.j0.f(qVar.G);
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
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? e.c(context, R.color.abc_decor_view_status_guard_light) : e.c(context, R.color.abc_decor_view_status_guard));
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
        return r0.j0.h(view, d != d10 ? m1Var.f(m1Var.b(), d10, m1Var.c(), m1Var.a()) : m1Var);
    }

    @Override // androidx.lifecycle.a0
    public void W(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        i0 i0Var = (i0) this.a;
        Handler handler = i0Var.x0;
        i iVar = i0Var.y0;
        handler.removeCallbacks(iVar);
        TextView textView = i0Var.D0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override // org.telegram.ui.Components.ko0
    public void X(float f10, boolean z4) {
        n nVar = (n) this.a;
        float f11 = nVar.b;
        float w10 = e2.c.w(nVar.c, f11, f10, f11);
        nVar.d = w10;
        if (z4) {
            m6 m6Var = nVar.e;
            m6Var.getClass();
            m6Var.b(null, w10);
        }
        nVar.invalidate();
    }

    @Override // l3.t
    public void a(long j10) {
        f7.b bVar = ((n0) this.a).S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new y1(bVar, j10, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.s
    public void accept(Object obj, Object obj2) {
        z7.a aVar = (z7.a) this.a;
        d dVar = new d(0, (TaskCompletionSource) obj2);
        o7.c cVar = (o7.c) ((f) obj).u();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        int i10 = o7.a.a;
        obtain.writeStrongBinder(dVar);
        obtain.writeInt(1);
        aVar.writeToParcel(obtain, 0);
        cVar.E0(obtain, 2);
    }

    @Override // l3.t
    public void b() {
        g0 g0Var = ((n0) this.a).c1;
        if (g0Var != null) {
            g0Var.a.T = true;
        }
    }

    @Override // f2.q1
    public int d(View view) {
        return w0.z(view) - ((ViewGroup.MarginLayoutParams) ((f2.x0) view.getLayoutParams())).topMargin;
    }

    @Override // l3.t
    public void e(int i10, long j10, long j11) {
        f7.b bVar = ((n0) this.a).S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new g5.d(bVar, i10, j10, j11, 1));
        }
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void f(Object obj) {
        ((u7.c) obj).onLocationResult((LocationResult) this.a);
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean g() {
        return true;
    }

    @Override // eg.q2
    public float get() {
        return ((o3) this.a).C;
    }

    @Override // org.telegram.ui.Components.ko0
    public CharSequence getContentDescription() {
        n nVar = (n) this.a;
        float f10 = nVar.b;
        return String.valueOf(Math.round((nVar.a.getProgress() * (nVar.c - f10)) + f10));
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.tu0
    public /* synthetic */ TextureView h0() {
        return null;
    }

    @Override // l3.t
    public void i() {
        f5.p pVar;
        n0 n0Var = (n0) this.a;
        synchronized (n0Var.a) {
            pVar = n0Var.y;
        }
        if (pVar != null) {
            pVar.i();
        }
    }

    @Override // androidx.activity.result.b
    public void k(Object obj) {
        Map map = (Map) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.a;
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
    public void l(Exception exc) {
        h5.a.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        f7.b bVar = ((n0) this.a).S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new l3.o(bVar, exc, 1));
        }
    }

    @Override // org.telegram.ui.Components.ko0
    public /* synthetic */ int m0() {
        return 0;
    }

    @Override // f2.q1
    public int n() {
        return ((w0) this.a).G();
    }

    @Override // org.telegram.ui.Components.qk0
    public void o(View view, q0 q0Var, boolean z4, boolean z10) {
        v vVar = (v) this.a;
        vVar.a.ab(null, vVar.e, vVar.b, view, 0.0f, 0.0f, q0Var, false, z4, z10, false);
        AndroidUtilities.runOnUIThread(new c3(this, 19));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        e0 e0Var = (e0) this.a;
        if (task.isSuccessful()) {
            m.K0(e0Var, true, (byte[]) task.getResult());
        } else {
            Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
            m.K0(e0Var, false, null);
        }
    }

    @Override // l3.t
    public void onSkipSilenceEnabledChanged(boolean z4) {
        f7.b bVar = ((n0) this.a).S0;
        Handler handler = (Handler) bVar.b;
        if (handler != null) {
            handler.post(new kh.f(1, bVar, z4));
        }
    }

    @Override // l3.t
    public void p() {
        ((n0) this.a).a1 = true;
    }

    @Override // g5.h0
    public c4.e q(g5.j0 j0Var, IOException iOException, int i10) {
        g gVar = ((r4.d) this.a).a;
        h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return m0.e;
    }

    @Override // i5.p
    public void r(hg.f fVar) {
        fVar.a(((WindowManager) this.a).getDefaultDisplay());
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ boolean t() {
        return false;
    }

    @Override // f2.q1
    public int v() {
        w0 w0Var = (w0) this.a;
        return w0Var.n - w0Var.C();
    }

    @Override // g5.h0
    public void x(g5.j0 j0Var, long j10, long j11) {
        boolean z4;
        r4.d dVar = (r4.d) this.a;
        synchronized (h5.a.i) {
            z4 = h5.a.j;
        }
        if (z4) {
            dVar.a();
            return;
        }
        IOException iOException = new IOException(new ConcurrentModificationException());
        g gVar = dVar.a;
        h5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
    }

    @Override // l3.t
    public void y() {
        g0 g0Var = ((n0) this.a).c1;
        if (g0Var != null) {
            g0Var.a.n.d(2);
        }
    }

    @Override // org.telegram.ui.tu0
    public void y0(MessageObject messageObject) {
        ((z8) ((f4) this.a).N1).f(true);
    }

    public synchronized void z() {
        ((SharedPreferences) this.a).edit().clear().commit();
    }

    public c(int i10) {
        switch (i10) {
            case 4:
                this.a = new LinkedHashMap(0, 0.75f, true);
                break;
            case 24:
                this.a = new f7.b[mf.b.values().length];
                break;
            default:
                this.a = new HashSet();
                break;
        }
    }

    public c(Context context) {
        boolean isEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.a = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                z();
            }
        } catch (IOException e6) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e6.getMessage());
            }
        }
    }

    @Override // org.telegram.ui.Components.ko0
    public void A() {
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void m() {
    }

    @Override // i5.p
    public void s() {
    }

    @Override // m.x0
    public void c(int i10) {
    }

    @Override // m.x0
    public void w(int i10) {
    }

    @Override // g5.h0
    public void u(g5.j0 j0Var, long j10, long j11, boolean z4) {
    }

    @Override // org.telegram.ui.Components.qk0
    public /* synthetic */ void j(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z4) {
    }
}
