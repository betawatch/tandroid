package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class h6 implements ne.h, qe.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public h6(View view) {
        this.a = view;
    }

    @Override // qe.a
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // ne.h
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h6)) {
            return false;
        }
        return this.a.equals(((h6) obj).a);
    }

    @Override // ne.h
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // ne.h
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
