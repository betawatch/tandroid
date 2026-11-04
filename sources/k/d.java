package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class d extends a implements l.i {
    public Context c;
    public ActionBarContextView d;
    public tf.b e;
    public WeakReference f;
    public boolean h;
    public l.k n;

    @Override // l.i
    public final boolean U0(l.k kVar, MenuItem menuItem) {
        return ((ui.f) this.e.a).A(this, menuItem);
    }

    @Override // l.i
    public final void b(l.k kVar) {
        i();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override // k.a
    public final void c() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.v(this);
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
        return this.n;
    }

    @Override // k.a
    public final h f() {
        return new h(this.d.getContext());
    }

    @Override // k.a
    public final CharSequence g() {
        return this.d.getSubtitle();
    }

    @Override // k.a
    public final CharSequence h() {
        return this.d.getTitle();
    }

    @Override // k.a
    public final void i() {
        this.e.w(this, this.n);
    }

    @Override // k.a
    public final boolean j() {
        return this.d.J;
    }

    @Override // k.a
    public final void m(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // k.a
    public final void n(int i3) {
        o(this.c.getString(i3));
    }

    @Override // k.a
    public final void o(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void p(int i3) {
        q(this.c.getString(i3));
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
}
