package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class f6 implements le.i, oe.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public f6(View view) {
        this.a = view;
    }

    @Override // oe.a
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // le.i
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f6)) {
            return false;
        }
        return this.a.equals(((f6) obj).a);
    }

    @Override // le.i
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // le.i
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
