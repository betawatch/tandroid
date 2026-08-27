package g;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class a0 extends k.a implements l.j {
    public final Context c;
    public final l.l d;
    public xe.b e;
    public WeakReference f;
    public final /* synthetic */ b0 h;

    public a0(b0 b0Var, Context context, xe.b bVar) {
        this.h = b0Var;
        this.c = context;
        this.e = bVar;
        l.l lVar = new l.l(context);
        lVar.l = 1;
        this.d = lVar;
        lVar.e = this;
    }

    @Override // k.a
    public final void a() {
        b0 b0Var = this.h;
        if (b0Var.i != this) {
            return;
        }
        if (b0Var.p) {
            b0Var.j = this;
            b0Var.k = this.e;
        } else {
            this.e.J(this);
        }
        this.e = null;
        b0Var.a(false);
        ActionBarContextView actionBarContextView = b0Var.f;
        if (actionBarContextView.v == null) {
            actionBarContextView.e();
        }
        b0Var.c.setHideOnContentScrollEnabled(b0Var.t);
        b0Var.i = null;
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
        return this.d;
    }

    @Override // k.a
    public final k.h d() {
        return new k.h(this.c);
    }

    @Override // k.a
    public final CharSequence e() {
        return this.h.f.getSubtitle();
    }

    @Override // k.a
    public final CharSequence f() {
        return this.h.f.getTitle();
    }

    @Override // k.a
    public final void g() {
        if (this.h.i != this) {
            return;
        }
        l.l lVar = this.d;
        lVar.w();
        try {
            this.e.K(this, lVar);
        } finally {
            lVar.v();
        }
    }

    @Override // k.a
    public final boolean h() {
        return this.h.f.E;
    }

    @Override // k.a
    public final void i(View view) {
        this.h.f.setCustomView(view);
        this.f = new WeakReference(view);
    }

    @Override // k.a
    public final void j(int i10) {
        l(this.h.a.getResources().getString(i10));
    }

    @Override // l.j
    public final void k(l.l lVar) {
        if (this.e == null) {
            return;
        }
        g();
        m.i iVar = this.h.f.d;
        if (iVar != null) {
            iVar.l();
        }
    }

    @Override // k.a
    public final void l(CharSequence charSequence) {
        this.h.f.setSubtitle(charSequence);
    }

    @Override // k.a
    public final void m(int i10) {
        n(this.h.a.getResources().getString(i10));
    }

    @Override // k.a
    public final void n(CharSequence charSequence) {
        this.h.f.setTitle(charSequence);
    }

    @Override // k.a
    public final void o(boolean z10) {
        this.b = z10;
        this.h.f.setTitleOptional(z10);
    }

    @Override // l.j
    public final boolean t(l.l lVar, MenuItem menuItem) {
        xe.b bVar = this.e;
        if (bVar != null) {
            return ((com.google.firebase.messaging.t) bVar.b).F(this, menuItem);
        }
        return false;
    }
}
