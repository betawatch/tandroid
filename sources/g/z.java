package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class z extends k.a implements l.i {
    public final Context c;
    public final l.k d;
    public n4.s e;
    public WeakReference f;
    public final /* synthetic */ a0 h;

    public z(a0 a0Var, Context context, n4.s sVar) {
        this.h = a0Var;
        this.c = context;
        this.e = sVar;
        l.k kVar = new l.k(context);
        kVar.l = 1;
        this.d = kVar;
        kVar.e = this;
    }

    @Override // k.a
    public final void a() {
        a0 a0Var = this.h;
        if (a0Var.i != this) {
            return;
        }
        if (a0Var.p) {
            a0Var.j = this;
            a0Var.k = this.e;
        } else {
            this.e.B(this);
        }
        this.e = null;
        a0Var.a(false);
        ActionBarContextView actionBarContextView = a0Var.f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        a0Var.c.setHideOnContentScrollEnabled(a0Var.t);
        a0Var.i = null;
    }

    @Override // l.i
    public final void b(l.k kVar) {
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
            this.e.D(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override // k.a
    public final boolean i() {
        return this.h.f.I;
    }

    @Override // k.a
    public final void j(View view) {
        this.h.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // k.a
    public final void k(int i10) {
        l(this.h.a.getResources().getString(i10));
    }

    @Override // k.a
    public final void l(CharSequence charSequence) {
        this.h.f.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void m(int i10) {
        n(this.h.a.getResources().getString(i10));
    }

    @Override // k.a
    public final void n(CharSequence charSequence) {
        this.h.f.setTitle(charSequence);
    }

    @Override // k.a
    public final void o(boolean z10) {
        this.b = z10;
        this.h.f.setTitleOptional(z10);
    }

    @Override // l.i
    public final boolean p(l.k kVar, MenuItem menuItem) {
        n4.s sVar = this.e;
        if (sVar != null) {
            return ((qi.e) sVar.b).A(this, menuItem);
        }
        return false;
    }
}
