package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class e6 implements te.f, we.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public e6(View view) {
        this.a = view;
    }

    @Override // we.a
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // te.f
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e6)) {
            return false;
        }
        return this.a.equals(((e6) obj).a);
    }

    @Override // te.f
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // te.f
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
