package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v5 implements qe.f, te.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public v5(View view) {
        this.a = view;
    }

    @Override // te.a
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // qe.f
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof v5)) {
            return false;
        }
        return this.a.equals(((v5) obj).a);
    }

    @Override // qe.f
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // qe.f
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
