package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class tc extends FrameLayout {
    public bi.g2 a;
    public rc b;
    public boolean c;

    public final void a(rc rcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = rcVar;
            rcVar.setVisibility(8);
            addView(rcVar, layoutParams);
        }
    }

    public final void b(bi.g2 g2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = g2Var;
            addView(g2Var, layoutParams);
        }
    }

    public rc getEditView() {
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
