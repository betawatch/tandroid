package k;

import ab.c0;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q4.q;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class d extends a implements l.i {
    public Context c;
    public ActionBarContextView d;
    public q e;
    public WeakReference f;
    public boolean h;
    public l.k n;

    @Override // l.i
    public final void b(l.k kVar) {
        j();
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
        this.e.c(this);
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

    @Override // l.i
    public final boolean h(l.k kVar, MenuItem menuItem) {
        return ((c0) this.e.b).G(this, menuItem);
    }

    @Override // k.a
    public final CharSequence i() {
        return this.d.getTitle();
    }

    @Override // k.a
    public final void j() {
        this.e.d(this, this.n);
    }

    @Override // k.a
    public final boolean k() {
        return this.d.J;
    }

    @Override // k.a
    public final void n(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // k.a
    public final void o(int i7) {
        p(this.c.getString(i7));
    }

    @Override // k.a
    public final void p(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void q(int i7) {
        r(this.c.getString(i7));
    }

    @Override // k.a
    public final void r(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // k.a
    public final void s(boolean z10) {
        this.a = z10;
        this.d.setTitleOptional(z10);
    }
}
