package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class a0 extends k.a implements l.i {
    public final Context c;
    public final l.k d;
    public q4.q e;
    public WeakReference f;
    public final /* synthetic */ b0 h;

    public a0(b0 b0Var, Context context, q4.q qVar) {
        this.h = b0Var;
        this.c = context;
        this.e = qVar;
        l.k kVar = new l.k(context);
        kVar.l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override // l.i
    public final boolean F0(l.k kVar, MenuItem menuItem) {
        q4.q qVar = this.e;
        if (qVar != null) {
            return ((ui.e) qVar.b).N(this, menuItem);
        }
        return false;
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
            this.e.c(this);
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
    public final l.k d() {
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
        l.k kVar = this.d;
        kVar.w();
        try {
            this.e.d(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override // k.a
    public final boolean i() {
        return this.h.f.I;
    }

    @Override // l.i
    public final void j0(l.k kVar) {
        if (this.e == null) {
            return;
        }
        h();
        m.i iVar = this.h.f.d;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override // k.a
    public final void l(View view) {
        this.h.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // k.a
    public final void m(int i7) {
        n(this.h.a.getResources().getString(i7));
    }

    @Override // k.a
    public final void n(CharSequence charSequence) {
        this.h.f.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void o(int i7) {
        p(this.h.a.getResources().getString(i7));
    }

    @Override // k.a
    public final void p(CharSequence charSequence) {
        this.h.f.setTitle(charSequence);
    }

    @Override // k.a
    public final void q(boolean z9) {
        this.a = z9;
        this.h.f.setTitleOptional(z9);
    }
}
