package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a0 extends k.a implements l.i {
    public final Context c;
    public final l.k d;
    public tf.b e;
    public WeakReference f;
    public final /* synthetic */ b0 h;

    public a0(b0 b0Var, Context context, tf.b bVar) {
        this.h = b0Var;
        this.c = context;
        this.e = bVar;
        l.k kVar = new l.k(context);
        kVar.l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override // l.i
    public final boolean U0(l.k kVar, MenuItem menuItem) {
        tf.b bVar = this.e;
        if (bVar != null) {
            return ((ui.f) bVar.a).A(this, menuItem);
        }
        return false;
    }

    @Override // l.i
    public final void b(l.k kVar) {
        if (this.e == null) {
            return;
        }
        i();
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
            this.e.v(this);
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

    @Override // k.a
    public final CharSequence h() {
        return this.h.f.getTitle();
    }

    @Override // k.a
    public final void i() {
        if (this.h.i != this) {
            return;
        }
        l.k kVar = this.d;
        kVar.w();
        try {
            this.e.w(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override // k.a
    public final boolean j() {
        return this.h.f.J;
    }

    @Override // k.a
    public final void m(View view) {
        this.h.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // k.a
    public final void n(int i3) {
        o(this.h.a.getResources().getString(i3));
    }

    @Override // k.a
    public final void o(CharSequence charSequence) {
        this.h.f.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void p(int i3) {
        q(this.h.a.getResources().getString(i3));
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
}
