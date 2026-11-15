package k;

import ab.c0;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q4.q;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class d extends a implements l.i {
    public Context c;
    public ActionBarContextView d;
    public q e;
    public WeakReference f;
    public boolean h;
    public l.k n;

    @Override // k.a
    public final void b() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.c(this);
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
        this.e.d(this, this.n);
    }

    @Override // l.i
    public final void i(l.k kVar) {
        h();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
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
    public final void n(int i7) {
        p(this.c.getString(i7));
    }

    @Override // l.i
    public final boolean o(l.k kVar, MenuItem menuItem) {
        return ((c0) this.e.b).D(this, menuItem);
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
