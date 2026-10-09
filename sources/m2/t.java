package m2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.a0;
import n4.w;
import n4.x;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.o91;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.cc1;
import p4.u;
import p4.v;
import pg.s1;
import pg.u0;
import qg.v1;
import yh.f0;
import za.c0;
import zg.n0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class t implements l2.i, k1.f, jp0, me.f, ah.j, m91, v1, com.google.android.gms.common.api.internal.o, n5.b, w2.d, Continuation, jl0 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ t(int i10, boolean z10) {
        this.a = i10;
    }

    public boolean A(int i10) {
        f91 f91Var = ((o91) this.b).L;
        if (f91Var == null) {
            return false;
        }
        return f91Var.c(i10);
    }

    public void B(c0 c0Var) {
        ((l5.q) ((i5.f) ((pa.b) this.b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new za.k(this)).a(new i5.a(null, c0Var, i5.d.a, null), new j2.e(16));
    }

    @Override // ah.j
    public void B0(ah.a aVar) {
        aVar.a(((mr0) this.b).getThemedColor(i6.d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    public void C(aa.a aVar) {
        h8.j jVar = (h8.j) this.b;
        jVar.a = aVar;
        Iterator it = jVar.c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.c.clear();
        jVar.b = null;
    }

    public void D(float f7) {
        o91 o91Var = (o91) this.b;
        if (f7 == 1.0f) {
            View[] viewArr = o91Var.e;
            View[] viewArr2 = o91Var.e;
            if (viewArr[1] != null) {
                o91Var.F();
                o91Var.h.put(o91Var.f[1], viewArr2[1]);
                o91Var.removeView(viewArr2[1]);
                o91Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            o91Var.z(o91Var.b);
            return;
        }
        View[] viewArr3 = o91Var.e;
        View[] viewArr4 = o91Var.e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (o91Var.y) {
            o91Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            o91Var.E(viewArr4[0], (-r1.getMeasuredWidth()) * f7);
        } else {
            o91Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            o91Var.E(viewArr4[0], r1.getMeasuredWidth() * f7);
        }
        o91Var.w(false);
    }

    public void E(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.b;
        if (pVar != eVar.y || mVar == null) {
            if (pVar == eVar.e) {
                if (mVar != null) {
                    eVar.n(eVar.d, mVar);
                }
                eVar.d.n(collection);
                return;
            }
            return;
        }
        u uVar = eVar.x.a;
        String d = mVar.d();
        v vVar = new v(uVar, d, eVar.b(uVar, d), false);
        vVar.i(mVar);
        if (eVar.d == vVar) {
            return;
        }
        eVar.h(eVar, vVar, eVar.y, 3, eVar.x, collection);
        eVar.x = null;
        eVar.y = null;
    }

    public void F() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        throw new IOException("data item not completed, stackSize: " + arrayDeque.size() + " scope: " + H());
    }

    public void G(long j3) {
        long H = H();
        if (H != j3) {
            if (H != -1) {
                if (H != -2) {
                    return;
                } else {
                    H = -2;
                }
            }
            StringBuilder u10 = a1.g.u(j3, "expected non-string scope or scope ", " but found ");
            u10.append(H);
            throw new IOException(u10.toString());
        }
    }

    public long H() {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override // org.telegram.ui.Components.jp0
    public void X(float f7, boolean z10) {
        cc1 cc1Var = (cc1) ((k0) this.b);
        int i10 = (int) (i6.q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        i6.q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = cc1Var.e.e;
            am0 am0Var = (am0) themeActivity.b.K(themeActivity.f0);
            if (am0Var != null) {
                ((e9) am0Var.a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (i6.q * 100.0f))));
            }
            i6.E(true);
        }
    }

    @Override // l2.i
    public long b(long j3) {
        return 0L;
    }

    @Override // k1.f
    public Object c(sd.p pVar, ld.c cVar) {
        return ((a0) this.b).c(new n1.c(pVar, null, 0), cVar);
    }

    @Override // l2.i
    public long f(long j3, long j10) {
        return 0L;
    }

    @Override // me.f
    public /* synthetic */ boolean g() {
        return false;
    }

    @Override // gd.a
    public Object get() {
        return new s5.i((Context) ((gd.a) this.b).get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override // org.telegram.ui.Components.jp0
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override // k1.f
    public de.b getData() {
        return ((a0) this.b).c;
    }

    @Override // me.f
    public /* synthetic */ boolean h(float f7) {
        return false;
    }

    @Override // l2.i
    public long i(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // org.telegram.ui.Components.jp0
    public /* synthetic */ int i0() {
        return 0;
    }

    @Override // l2.i
    public j k(long j3) {
        return (j) this.b;
    }

    @Override // ah.j
    public void l(Canvas canvas) {
        mr0 mr0Var = (mr0) this.b;
        canvas.drawColor(mr0Var.getThemedColor(i6.d6));
        if (SharedConfig.chatBlurEnabled()) {
            mr0Var.O0.b(canvas, -2);
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public void m(View view, n0 n0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.b;
        tVar.a.eb(null, tVar.e, tVar.b, view, 0.0f, 0.0f, n0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new f0(this, 13));
    }

    @Override // l2.i
    public long n(long j3, long j10) {
        return 0L;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean o() {
        return true;
    }

    @Override // me.f
    public void p() {
        ((o9) this.b).a.invalidate();
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean q() {
        return false;
    }

    @Override // qg.v1
    public void q0(float f7) {
        bu0 bu0Var = (bu0) this.b;
        u0.e(bu0Var.P1).k(String.valueOf(pg.m.a.indexOf(bu0Var.W0.getCurrentBrush())), f7);
        s1 s1Var = bu0Var.K1;
        s1Var.c = f7;
        bu0Var.t0(s1Var, null);
    }

    @Override // l2.i
    public boolean t() {
        return true;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((Callable) this.b).call();
    }

    public String toString() {
        switch (this.a) {
            case 17:
                se.b bVar = se.b.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override // l2.i
    public long u() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean v() {
        return false;
    }

    @Override // l2.i
    public long w(long j3) {
        return 1L;
    }

    @Override // com.google.android.gms.common.api.internal.o
    public /* synthetic */ void x(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.b);
    }

    @Override // l2.i
    public long y(long j3, long j10) {
        return 1L;
    }

    public /* synthetic */ t(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    public t(int i10) {
        this.a = i10;
        switch (i10) {
            case 20:
                this.b = new ob.a(28);
                break;
            case 23:
                this.b = new CopyOnWriteArrayList();
                break;
            default:
                this.b = new ArrayDeque(16);
                break;
        }
    }

    @Override // qg.v1
    public float get() {
        bu0 bu0Var = (bu0) this.b;
        int i10 = bu0Var.P1;
        pg.m currentBrush = bu0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).i;
        }
        return u0.e(i10).f(String.valueOf(pg.m.a.indexOf(currentBrush)), currentBrush.d());
    }

    public t(EditText editText) {
        this.a = 12;
        this.b = new n6.t(editText);
    }

    public t(Context context, x xVar) {
        this.a = 2;
        w wVar = ((n4.r) xVar.b).c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.b = new n4.k(context, wVar);
        } else {
            this.b = new n4.j(context, wVar);
        }
    }

    @Override // me.f
    public /* synthetic */ void a() {
    }

    @Override // me.f
    public /* synthetic */ void j() {
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.jp0
    public void z() {
    }

    @Override // me.f
    public /* synthetic */ void e(boolean z10) {
    }

    @Override // l2.i
    public long d(long j3, long j10) {
        return j10;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
