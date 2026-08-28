package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class z5 implements td.f, wd.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public z5(View view) {
        this.a = view;
    }

    @Override // wd.a
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // td.f
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z5)) {
            return false;
        }
        return this.a.equals(((z5) obj).a);
    }

    @Override // td.f
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // td.f
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
