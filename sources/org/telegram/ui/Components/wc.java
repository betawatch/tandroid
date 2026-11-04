package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class wc extends FrameLayout {
    public ai.o2 a;
    public uc b;
    public boolean c;

    public final void a(uc ucVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = ucVar;
            ucVar.setVisibility(8);
            addView(ucVar, layoutParams);
        }
    }

    public final void b(ai.o2 o2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = o2Var;
            addView(o2Var, layoutParams);
        }
    }

    public uc getEditView() {
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
