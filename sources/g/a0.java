package g;

import ab.c0;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
    public final void b(l.k kVar) {
        if (this.e == null) {
            return;
        }
        j();
        m.h hVar = this.h.f.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override // k.a
    public final void c() {
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
    public final View d() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.a
    public final l.k e() {
        return this.d;
    }

    @Override // k.a
    public final k.h f() {
        return new k.h(this.c);
    }

    @Override // k.a
    public final CharSequence g() {
        return this.h.f.getSubtitle();
    }

    @Override // l.i
    public final boolean h(l.k kVar, MenuItem menuItem) {
        q4.q qVar = this.e;
        if (qVar != null) {
            return ((c0) qVar.b).G(this, menuItem);
        }
        return false;
    }

    @Override // k.a
    public final CharSequence i() {
        return this.h.f.getTitle();
    }

    @Override // k.a
    public final void j() {
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
    public final boolean k() {
        return this.h.f.J;
    }

    @Override // k.a
    public final void n(View view) {
        this.h.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // k.a
    public final void o(int i7) {
        p(this.h.a.getResources().getString(i7));
    }

    @Override // k.a
    public final void p(CharSequence charSequence) {
        this.h.f.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void q(int i7) {
        r(this.h.a.getResources().getString(i7));
    }

    @Override // k.a
    public final void r(CharSequence charSequence) {
        this.h.f.setTitle(charSequence);
    }

    @Override // k.a
    public final void s(boolean z10) {
        this.a = z10;
        this.h.f.setTitleOptional(z10);
    }
}
