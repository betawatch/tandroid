package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class a0 extends k.a implements l.i {
    public final Context c;
    public final l.k d;
    public n4.y e;
    public WeakReference f;
    public final /* synthetic */ b0 h;

    public a0(b0 b0Var, Context context, n4.y yVar) {
        this.h = b0Var;
        this.c = context;
        this.e = yVar;
        l.k kVar = new l.k(context);
        kVar.l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override // l.i
    public final boolean A(l.k kVar, MenuItem menuItem) {
        n4.y yVar = this.e;
        if (yVar != null) {
            return ((ni.f) yVar.b).G(this, menuItem);
        }
        return false;
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
            this.e.T(this);
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
    public final l.k c() {
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
        l.k kVar = this.d;
        kVar.w();
        try {
            this.e.U(this, kVar);
        } finally {
            kVar.v();
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

    @Override // k.a
    public final void n(boolean z10) {
        this.b = z10;
        this.h.f.setTitleOptional(z10);
    }

    @Override // l.i
    public final void t(l.k kVar) {
        if (this.e == null) {
            return;
        }
        g();
        m.h hVar = this.h.f.d;
        if (hVar != null) {
            hVar.l();
        }
    }
}
