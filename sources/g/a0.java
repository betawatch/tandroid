package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a0 extends k.a implements l.j {
    public final Context c;
    public final l.l d;
    public n4.q e;
    public WeakReference f;
    public final /* synthetic */ b0 h;

    public a0(b0 b0Var, Context context, n4.q qVar) {
        this.h = b0Var;
        this.c = context;
        this.e = qVar;
        l.l lVar = new l.l(context);
        lVar.l = 1;
        this.d = lVar;
        lVar.e = this;
    }

    @Override // k.a
    public final void b() {
        b0 b0Var = this.h;
        if (b0Var.i != this) {
            return;
        }
        if (b0Var.p) {
            b0Var.j = this;
            b0Var.k = this.e;
        } else {
            this.e.B(this);
        }
        this.e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f;
        if (actionBarContextView.w == null) {
            actionBarContextView.e();
        }
        b0Var.c.setHideOnContentScrollEnabled(b0Var.t);
        b0Var.i = null;
    }

    @Override // k.a
    public final View c() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.a
    public final l.l d() {
        return this.d;
    }

    @Override // k.a
    public final k.h e() {
        return new k.h(this.c);
    }

    @Override // k.a
    public final CharSequence f() {
        return this.h.f.getSubtitle();
    }

    @Override // k.a
    public final CharSequence g() {
        return this.h.f.getTitle();
    }

    @Override // k.a
    public final void h() {
        if (this.h.i != this) {
            return;
        }
        l.l lVar = this.d;
        lVar.w();
        try {
            this.e.C(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // k.a
    public final boolean i() {
        return this.h.f.I;
    }

    @Override // k.a
    public final void l(View view) {
        this.h.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // k.a
    public final void m(int i10) {
        n(this.h.a.getResources().getString(i10));
    }

    @Override // k.a
    public final void n(CharSequence charSequence) {
        this.h.f.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void o(int i10) {
        q(this.h.a.getResources().getString(i10));
    }

    @Override // l.j
    public final void p(l.l lVar) {
        if (this.e == null) {
            return;
        }
        h();
        m.h hVar = this.h.f.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override // k.a
    public final void q(CharSequence charSequence) {
        this.h.f.setTitle(charSequence);
    }

    @Override // k.a
    public final void r(boolean z10) {
        this.a = z10;
        this.h.f.setTitleOptional(z10);
    }

    @Override // l.j
    public final boolean u(l.l lVar, MenuItem menuItem) {
        n4.q qVar = this.e;
        if (qVar != null) {
            return ((xa.n) qVar.a).R(this, menuItem);
        }
        return false;
    }
}
