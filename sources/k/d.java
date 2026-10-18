package k;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import n4.s;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
        this.e.B(this);
    }

    @Override // l.i
    public final void b(l.k kVar) {
        h();
        m.i iVar = this.d.d;
        if (iVar != null) {
            iVar.l();
        }
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
        this.e.D(this, this.n);
    }

    @Override // k.a
    public final boolean i() {
        return this.d.I;
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
    public final boolean p(l.k kVar, MenuItem menuItem) {
        return ((qi.e) this.e.b).A(this, menuItem);
    }
}
