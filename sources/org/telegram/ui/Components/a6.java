package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a6 implements xd.f, ae.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public a6(View view) {
        this.a = view;
    }

    @Override // ae.a
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // xd.f
    public final /* synthetic */ int b(boolean z4) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a6)) {
            return false;
        }
        return this.a.equals(((a6) obj).a);
    }

    @Override // xd.f
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // xd.f
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
