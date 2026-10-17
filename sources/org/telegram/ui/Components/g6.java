package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class g6 implements ne.h, qe.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public g6(View view) {
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
        if (!(obj instanceof g6)) {
            return false;
        }
        return this.a.equals(((g6) obj).a);
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
