package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class i6 implements oe.h, re.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public i6(View view) {
        this.a = view;
    }

    @Override // re.a
    public final void a() {
        if (!this.b) {
            this.a.setVisibility(8);
        }
        this.c = false;
    }

    @Override // oe.h
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i6)) {
            return false;
        }
        return this.a.equals(((i6) obj).a);
    }

    @Override // oe.h
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // oe.h
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
