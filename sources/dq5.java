// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class dq5 extends n39 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ gq5 n;

    public dq5(gq5 gq5Var, Context context) {
        this.n = gq5Var;
        this.c = context;
    }

    @Override // w39
    public final void A(s49 s49Var) {
        View view = s49Var.a;
        if (view instanceof kr5) {
            ((kr5) view).a.getImageReceiver().c();
        }
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return s49Var.f != 2;
    }

    public final void E(String str) {
        byte b = 1;
        try {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            f();
        } else {
            Timer timer2 = new Timer();
            this.f = timer2;
            timer2.schedule(new ox2(this, str, b), 200L, 300L);
        }
    }

    @Override // w39
    public final int b() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // w39
    public final int d(int i) {
        if (this.h) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        return i == 1 ? 2 : 0;
    }

    @Override // w39
    public final void f() {
        super.f();
        gq5 gq5Var = this.n;
        dq5 dq5Var = gq5Var.s;
        if (dq5Var == null || gq5Var.y) {
            return;
        }
        gq5Var.r.setVisibility(dq5Var.b() == 2 ? 0 : 4);
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        nu2 nu2Var;
        CharSequence charSequence;
        if (s49Var.f == 0) {
            kr5 kr5Var = (kr5) s49Var.a;
            boolean z = this.h;
            gq5 gq5Var = this.n;
            if (z) {
                nu2Var = (nu2) this.d.get(i);
                charSequence = (CharSequence) this.e.get(i);
            } else {
                nu2Var = (nu2) gq5Var.w.get(i - 2);
                charSequence = null;
            }
            kr5Var.a(nu2Var, charSequence);
            boolean containsKey = gq5Var.E.containsKey(nu2Var.b);
            wf2 wf2Var = kr5Var.e;
            if (wf2Var != null) {
                wf2Var.a(containsKey, false);
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.c;
        if (i == 1) {
            wgb wgbVar = new wgb(context);
            int i2 = bkb.F6;
            wgbVar.g(i2, i2);
            wgbVar.u(k96.M0(2131745235, null), "", false, R.drawable.msg_shareout, false);
            view = wgbVar;
        } else {
            view = i == 2 ? new b9a(context, (de9) null) : new kr5(context, true);
        }
        return new y29(view);
    }
}
