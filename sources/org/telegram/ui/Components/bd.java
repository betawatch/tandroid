package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class bd extends FrameLayout {
    public ag.p1 a;
    public zc b;
    public boolean c;

    public final void a(zc zcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = zcVar;
            zcVar.setVisibility(8);
            addView(zcVar, layoutParams);
        }
    }

    public final void b(ag.p1 p1Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = p1Var;
            addView(p1Var, layoutParams);
        }
    }

    public zc getEditView() {
        return this.b;
    }

    public View getReplyView() {
        return this.a;
    }

    public void setEditMode(boolean z10) {
        this.c = z10;
        this.a.setVisibility(z10 ? 8 : 0);
        this.b.setVisibility(z10 ? 0 : 8);
    }

    public void setEditSuggestionMode(boolean z10) {
        setEditMode(z10);
        if (z10) {
            this.a.setVisibility(0);
        }
        this.b.a[0].setOnlyIconMode(z10);
        this.b.a[1].setOnlyIconMode(z10);
    }
}
