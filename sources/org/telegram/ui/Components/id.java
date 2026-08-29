package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class id extends FrameLayout {
    public bg.x2 a;
    public gd b;
    public boolean c;

    public final void a(gd gdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = gdVar;
            gdVar.setVisibility(8);
            addView(gdVar, layoutParams);
        }
    }

    public final void b(bg.x2 x2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = x2Var;
            addView(x2Var, layoutParams);
        }
    }

    public gd getEditView() {
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
