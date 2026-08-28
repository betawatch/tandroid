package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.firebase.messaging.t;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d extends a implements l.i {
    public Context c;
    public ActionBarContextView d;
    public we.b e;
    public WeakReference f;
    public boolean h;
    public l.k n;

    @Override // k.a
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.H(this);
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
        this.e.I(this, this.n);
    }

    @Override // k.a
    public final boolean h() {
        return this.d.E;
    }

    @Override // k.a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f = view != null ? new WeakReference(view) : null;
    }

    @Override // k.a
    public final void j(int i9) {
        k(this.c.getString(i9));
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
    public final void m(int i9) {
        n(this.c.getString(i9));
    }

    @Override // k.a
    public final void n(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // k.a
    public final void o(boolean z10) {
        this.b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override // l.i
    public final boolean r(l.k kVar, MenuItem menuItem) {
        return ((t) this.e.b).F(this, menuItem);
    }
}
