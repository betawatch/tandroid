package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.q;
import xa.n;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends a implements l.j {
    public Context c;
    public ActionBarContextView d;
    public q e;
    public WeakReference f;
    public boolean h;
    public l.l n;

    @Override // k.a
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.B(this);
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
        return this.n;
    }

    @Override // k.a
    public final h e() {
        return new h(this.d.getContext());
    }

    @Override // k.a
    public final CharSequence f() {
        return this.d.getSubtitle();
    }

    @Override // k.a
    public final CharSequence g() {
        return this.d.getTitle();
    }

    @Override // k.a
    public final void h() {
        this.e.C(this, this.n);
    }

    @Override // k.a
    public final boolean i() {
        return this.d.I;
    }

    @Override // k.a
    public final void l(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // k.a
    public final void m(int i10) {
        n(this.c.getString(i10));
    }

    @Override // k.a
    public final void n(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void o(int i10) {
        q(this.c.getString(i10));
    }

    @Override // l.j
    public final void p(l.l lVar) {
        h();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override // k.a
    public final void q(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // k.a
    public final void r(boolean z10) {
        this.a = z10;
        this.d.setTitleOptional(z10);
    }

    @Override // l.j
    public final boolean u(l.l lVar, MenuItem menuItem) {
        return ((n) this.e.a).R(this, menuItem);
    }
}
