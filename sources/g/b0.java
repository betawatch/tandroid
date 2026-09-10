package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class b0 extends k.a implements l.j {
    public final Context c;
    public final l.l d;
    public of.b e;
    public WeakReference f;
    public final /* synthetic */ c0 h;

    public b0(c0 c0Var, Context context, of.b bVar) {
        this.h = c0Var;
        this.c = context;
        this.e = bVar;
        l.l lVar = new l.l(context);
        lVar.l = 1;
        this.d = lVar;
        lVar.e = this;
    }

    @Override // l.j
    public final boolean B(l.l lVar, MenuItem menuItem) {
        of.b bVar = this.e;
        if (bVar != null) {
            return ((com.google.firebase.messaging.s) bVar.b).g(this, menuItem);
        }
        return false;
    }

    @Override // k.a
    public final void a() {
        c0 c0Var = this.h;
        if (c0Var.i != this) {
            return;
        }
        if (c0Var.p) {
            c0Var.j = this;
            c0Var.k = this.e;
        } else {
            this.e.j0(this);
        }
        this.e = null;
        c0Var.a(false);
        ActionBarContextView actionBarContextView = c0Var.f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        c0Var.c.setHideOnContentScrollEnabled(c0Var.t);
        c0Var.i = null;
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
            this.e.k0(this, lVar);
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

    @Override // k.a
    public final void n(boolean z10) {
        this.b = z10;
        this.h.f.setTitleOptional(z10);
    }

    @Override // l.j
    public final void o(l.l lVar) {
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
