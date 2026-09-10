package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class e6 implements le.h, oe.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public e6(View view) {
        this.a = view;
    }

    @Override // oe.a
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // le.h
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e6)) {
            return false;
        }
        return this.a.equals(((e6) obj).a);
    }

    @Override // le.h
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // le.h
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
