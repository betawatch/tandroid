package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class z extends k.a implements l.j {
    public final Context c;
    public final l.l d;
    public f7.b e;
    public WeakReference f;
    public final /* synthetic */ a0 h;

    public z(a0 a0Var, Context context, f7.b bVar) {
        this.h = a0Var;
        this.c = context;
        this.e = bVar;
        l.l lVar = new l.l(context);
        lVar.l = 1;
        this.d = lVar;
        lVar.e = this;
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
            this.e.t(this);
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
            this.e.u(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // k.a
    public final boolean h() {
        return this.h.f.F;
    }

    @Override // k.a
    public final void i(View view) {
        this.h.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // l.j
    public final void j(l.l lVar) {
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
    public final void o(boolean z4) {
        this.b = z4;
        this.h.f.setTitleOptional(z4);
    }

    @Override // l.j
    public final boolean s(l.l lVar, MenuItem menuItem) {
        f7.b bVar = this.e;
        if (bVar != null) {
            return ((sf.f) bVar.b).A(this, menuItem);
        }
        return false;
    }
}
