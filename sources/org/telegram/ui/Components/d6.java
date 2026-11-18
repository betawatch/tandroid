package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class d6 implements te.f, we.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public d6(View view) {
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
        if (!(obj instanceof d6)) {
            return false;
        }
        return this.a.equals(((d6) obj).a);
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
