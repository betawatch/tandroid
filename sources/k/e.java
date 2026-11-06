package k;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import l.a0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class e extends ActionMode {
    public final Context a;
    public final a b;

    public e(Context context, a aVar) {
        this.a = context;
        this.b = aVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.b();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.c();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new a0(this.a, this.b.d());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.e();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.f();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.b;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.a;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.h();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.l(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.b = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.p(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z9) {
        this.b.q(z9);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i7) {
        this.b.m(i7);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i7) {
        this.b.o(i7);
    }
}
