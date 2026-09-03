package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d extends a implements l.i {
    public Context c;
    public ActionBarContextView d;
    public f7.b e;
    public WeakReference f;
    public boolean h;
    public l.k n;

    @Override // k.a
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.u(this);
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
        return this.d.F;
    }

    @Override // l.i
    public final void i(l.k kVar) {
        g();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override // k.a
    public final void j(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // k.a
    public final void k(int i10) {
        l(this.c.getString(i10));
    }

    @Override // k.a
    public final void l(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void m(int i10) {
        n(this.c.getString(i10));
    }

    @Override // k.a
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // k.a
    public final void o(boolean z4) {
        this.b = z4;
        this.d.setTitleOptional(z4);
    }

    @Override // l.i
    public final boolean q(l.k kVar, MenuItem menuItem) {
        return ((rf.f) this.e.b).A(this, menuItem);
    }
}
