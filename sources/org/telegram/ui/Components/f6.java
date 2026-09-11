package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class f6 implements le.h, oe.a {
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

    @Override // le.h
    public final /* synthetic */ int b(boolean z10) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f6)) {
            return false;
        }
        return this.a.equals(((f6) obj).a);
    }

    @Override // le.h
    public final int getHeight() {
        return this.a.getMeasuredHeight();
    }

    @Override // le.h
    public final int getWidth() {
        return this.a.getMeasuredWidth();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
