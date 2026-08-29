package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class z extends k.a implements l.i {
    public final Context c;
    public final l.k d;
    public ze.b e;
    public WeakReference f;
    public final /* synthetic */ a0 h;

    public z(a0 a0Var, Context context, ze.b bVar) {
        this.h = a0Var;
        this.c = context;
        this.e = bVar;
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
            this.e.O(this);
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
            this.e.P(this, kVar);
        } finally {
            kVar.v();
        }
    }

    @Override // k.a
    public final boolean h() {
        return this.h.f.E;
    }

    @Override // l.i
    public final void i(l.k kVar) {
        if (this.e == null) {
            return;
        }
        g();
        m.i iVar = this.h.f.d;
        if (iVar != null) {
            iVar.l();
        }
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
    public final boolean q(l.k kVar, MenuItem menuItem) {
        ze.b bVar = this.e;
        if (bVar != null) {
            return ((com.google.firebase.messaging.s) bVar.a).F(this, menuItem);
        }
        return false;
    }
}
