package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import q4.q;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d extends a implements l.i {
    public Context c;
    public ActionBarContextView d;
    public q e;
    public WeakReference f;
    public boolean h;
    public l.k n;

    @Override // l.i
    public final boolean F0(l.k kVar, MenuItem menuItem) {
        return ((ui.e) this.e.b).N(this, menuItem);
    }

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

    @Override // k.a
    public final boolean i() {
        return this.d.I;
    }

    @Override // l.i
    public final void j0(l.k kVar) {
        h();
        m.i iVar = this.d.d;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override // k.a
    public final void l(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // k.a
    public final void m(int i7) {
        n(this.c.getString(i7));
    }

    @Override // k.a
    public final void n(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void o(int i7) {
        p(this.c.getString(i7));
    }

    @Override // k.a
    public final void p(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // k.a
    public final void q(boolean z9) {
        this.a = z9;
        this.d.setTitleOptional(z9);
    }
}
