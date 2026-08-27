package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z5 implements ud.f, xd.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public z5(View view) {
        this.a = view;
    }

    @Override // xd.a
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // ud.f
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof z5)) {
            return false;
        }
        return this.a.equals(((z5) obj).a);
    }

    @Override // ud.f
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // ud.f
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
