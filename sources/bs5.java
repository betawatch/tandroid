// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class bs5 extends q59 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ es5 n;

    public bs5(es5 es5Var, Context context) {
        this.n = es5Var;
        this.c = context;
    }

    @Override // y59
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof jt5) {
            ((jt5) view).a.getImageReceiver().c();
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f != 2;
    }

    public final void E(String str) {
        byte b = 1;
        try {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            f();
        } else {
            Timer timer2 = new Timer();
            this.f = timer2;
            timer2.schedule(new yy2(this, str, b), 200L, 300L);
        }
    }

    @Override // y59
    public final int b() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // y59
    public final int d(int i) {
        if (this.h) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        return i == 1 ? 2 : 0;
    }

    @Override // y59
    public final void f() {
        super.f();
        es5 es5Var = this.n;
        bs5 bs5Var = es5Var.s;
        if (bs5Var == null || es5Var.y) {
            return;
        }
        es5Var.r.setVisibility(bs5Var.b() == 2 ? 0 : 4);
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        yv2 yv2Var;
        CharSequence charSequence;
        if (u69Var.f == 0) {
            jt5 jt5Var = (jt5) u69Var.a;
            boolean z = this.h;
            es5 es5Var = this.n;
            if (z) {
                yv2Var = (yv2) this.d.get(i);
                charSequence = (CharSequence) this.e.get(i);
            } else {
                yv2Var = (yv2) es5Var.w.get(i - 2);
                charSequence = null;
            }
            jt5Var.a(yv2Var, charSequence);
            boolean containsKey = es5Var.E.containsKey(yv2Var.b);
            jh2 jh2Var = jt5Var.e;
            if (jh2Var != null) {
                jh2Var.a(containsKey, false);
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.c;
        if (i == 1) {
            xib xibVar = new xib(context);
            int i2 = cmb.F6;
            xibVar.g(i2, i2);
            xibVar.u(jb6.M0(2131745161, null), "", false, R.drawable.msg_shareout, false);
            view = xibVar;
        } else {
            view = i == 2 ? new bba(context, (hg9) null) : new jt5(context, true);
        }
        return new b59(view);
    }
}
