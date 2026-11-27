// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class es5 extends c79 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public Timer f;
    public boolean h;
    public final /* synthetic */ hs5 n;

    public es5(hs5 hs5Var, Context context) {
        this.n = hs5Var;
        this.c = context;
    }

    @Override // j79
    public final void A(f89 f89Var) {
        View view = f89Var.a;
        if (view instanceof mt5) {
            ((mt5) view).a.getImageReceiver().c();
        }
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return f89Var.f != 2;
    }

    public final void E(String str) {
        byte b = 1;
        try {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        if (str == null) {
            this.d.clear();
            this.e.clear();
            f();
        } else {
            Timer timer2 = new Timer();
            this.f = timer2;
            timer2.schedule(new iy2(this, str, b), 200L, 300L);
        }
    }

    @Override // j79
    public final int b() {
        return this.h ? this.d.size() : this.n.w.size() + 2;
    }

    @Override // j79
    public final int d(int i) {
        if (this.h) {
            return 0;
        }
        if (i == 0) {
            return 1;
        }
        return i == 1 ? 2 : 0;
    }

    @Override // j79
    public final void f() {
        super.f();
        hs5 hs5Var = this.n;
        es5 es5Var = hs5Var.s;
        if (es5Var == null || hs5Var.y) {
            return;
        }
        hs5Var.r.setVisibility(es5Var.b() == 2 ? 0 : 4);
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        iv2 iv2Var;
        CharSequence charSequence;
        if (f89Var.f == 0) {
            mt5 mt5Var = (mt5) f89Var.a;
            boolean z = this.h;
            hs5 hs5Var = this.n;
            if (z) {
                iv2Var = (iv2) this.d.get(i);
                charSequence = (CharSequence) this.e.get(i);
            } else {
                iv2Var = (iv2) hs5Var.w.get(i - 2);
                charSequence = null;
            }
            mt5Var.a(iv2Var, charSequence);
            boolean containsKey = hs5Var.E.containsKey(iv2Var.b);
            og2 og2Var = mt5Var.e;
            if (og2Var != null) {
                og2Var.a(containsKey, false);
            }
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = this.c;
        if (i == 1) {
            skb skbVar = new skb(context);
            int i2 = aob.G6;
            skbVar.g(i2, i2);
            skbVar.u(ob6.M0(2131745155, null), "", false, R.drawable.msg_shareout, false);
            view = skbVar;
        } else {
            view = i == 2 ? new rca(context, (uh9) null) : new mt5(context, true);
        }
        return new n69(view);
    }
}
