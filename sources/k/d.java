package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import com.google.firebase.messaging.s;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d extends a implements l.i {
    public Context c;
    public ActionBarContextView d;
    public ze.b e;
    public WeakReference f;
    public boolean h;
    public l.k n;

    @Override // k.a
    public final void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.O(this);
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
        this.e.P(this, this.n);
    }

    @Override // k.a
    public final boolean h() {
        return this.d.E;
    }

    @Override // l.i
    public final void i(l.k kVar) {
        g();
        m.i iVar = this.d.d;
        if (iVar != null) {
            iVar.l();
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
    public final void o(boolean z10) {
        this.b = z10;
        this.d.setTitleOptional(z10);
    }

    @Override // l.i
    public final boolean q(l.k kVar, MenuItem menuItem) {
        return ((s) this.e.a).F(this, menuItem);
    }
}
