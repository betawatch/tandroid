package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v5 implements te.f, we.a {
    public final View a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    public v5(View view) {
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
        if (!(obj instanceof v5)) {
            return false;
        }
        return this.a.equals(((v5) obj).a);
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
