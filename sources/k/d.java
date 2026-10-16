package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.s;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class d extends a implements l.i {
    public Context c;
    public ActionBarContextView d;
    public s e;
    public WeakReference f;
    public boolean h;
    public l.k n;

    @Override // k.a
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.t(this);
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
        return this.n;
    }

    @Override // k.a
    public final h d() {
        return new h(this.d.getContext());
    }

    @Override // k.a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // k.a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // k.a
    public final void g() {
        this.e.v(this, this.n);
    }

    @Override // k.a
    public final boolean h() {
        return this.d.I;
    }

    @Override // k.a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // k.a
    public final void j(int i10) {
        k(this.c.getString(i10));
    }

    @Override // k.a
    public final void k(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // l.i
    public final void l(l.k kVar) {
        g();
        m.i iVar = this.d.d;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override // k.a
    public final void m(int i10) {
        n(this.c.getString(i10));
    }

    @Override // k.a
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // l.i
    public final boolean o(l.k kVar, MenuItem menuItem) {
        return ((pi.e) this.e.b).y(this, menuItem);
    }

    @Override // k.a
    public final void p(boolean z10) {
        this.b = z10;
        this.d.setTitleOptional(z10);
    }
}
