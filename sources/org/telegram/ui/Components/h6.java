package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class h6 implements me.h, pe.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public h6(View view) {
        this.a = view;
    }

    @Override // pe.a
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // me.h
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h6)) {
            return false;
        }
        return this.a.equals(((h6) obj).a);
    }

    @Override // me.h
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // me.h
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
