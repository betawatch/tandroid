package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.y;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class d extends a implements l.j {
    public Context c;
    public ActionBarContextView d;
    public y e;
    public WeakReference f;
    public boolean h;
    public l.l n;

    @Override // k.a
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.S(this);
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
        this.e.T(this, this.n);
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

    @Override // k.a
    public final void l(int i10) {
        m(this.c.getString(i10));
    }

    @Override // k.a
    public final void m(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // k.a
    public final void n(boolean z10) {
        this.b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override // l.j
    public final void r(l.l lVar) {
        g();
        m.h hVar = this.d.d;
        if (hVar != null) {
            hVar.l();
        }
    }

    @Override // l.j
    public final boolean w(l.l lVar, MenuItem menuItem) {
        return ((oi.f) this.e.a).G(this, menuItem);
    }
}
