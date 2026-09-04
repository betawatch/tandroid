package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a0 extends k.a implements l.j {
    public final Context c;
    public final l.l d;
    public n4.y e;
    public WeakReference f;
    public final /* synthetic */ b0 h;

    public a0(b0 b0Var, Context context, n4.y yVar) {
        this.h = b0Var;
        this.c = context;
        this.e = yVar;
        l.l lVar = new l.l(context);
        lVar.l = 1;
        this.d = lVar;
        lVar.e = this;
    }

    @Override // k.a
    public final void a() {
        b0 b0Var = this.h;
        if (b0Var.i != this) {
            return;
        }
        if (b0Var.p) {
            b0Var.j = this;
            b0Var.k = this.e;
        } else {
            this.e.I(this);
        }
        this.e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        b0Var.c.setHideOnContentScrollEnabled(b0Var.t);
        b0Var.i = null;
    }

    @Override // k.a
    public final View b() {
        WeakReference weakReference = this.f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.a
    public final l.l c() {
        return this.d;
    }

    @Override // k.a
    public final k.h d() {
        return new k.h(this.c);
    }

    @Override // k.a
    public final CharSequence e() {
        return this.h.f.getSubtitle();
    }

    @Override // k.a
    public final CharSequence f() {
        return this.h.f.getTitle();
    }

    @Override // k.a
    public final void g() {
        if (this.h.i != this) {
            return;
        }
        l.l lVar = this.d;
        lVar.w();
        try {
            this.e.J(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // k.a
    public final boolean h() {
        return this.h.f.I;
    }

    @Override // k.a
    public final void i(View view) {
        this.h.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // k.a
    public final void j(int i10) {
        k(this.h.a.getResources().getString(i10));
    }

    @Override // k.a
    public final void k(CharSequence charSequence) {
        this.h.f.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void l(int i10) {
        m(this.h.a.getResources().getString(i10));
    }

    @Override // k.a
    public final void m(CharSequence charSequence) {
        this.h.f.setTitle(charSequence);
    }

    @Override // l.j
    public final void n(l.l lVar) {
        if (this.e == null) {
            return;
        }
        g();
        m.h hVar = this.h.f.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override // k.a
    public final void o(boolean z10) {
        this.b = z10;
        this.h.f.setTitleOptional(z10);
    }

    @Override // l.j
    public final boolean s(l.l lVar, MenuItem menuItem) {
        n4.y yVar = this.e;
        if (yVar != null) {
            return ((fg.f) yVar.b).H(this, menuItem);
        }
        return false;
    }
}
