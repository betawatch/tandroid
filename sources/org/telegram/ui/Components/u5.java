package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u5 implements fe.i, ie.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public u5(View view) {
        this.a = view;
    }

    @Override // ie.a
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // fe.i
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u5)) {
            return false;
        }
        return this.a.equals(((u5) obj).a);
    }

    @Override // fe.i
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // fe.i
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
