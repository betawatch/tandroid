package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class xc extends FrameLayout {
    public bi.e5 a;
    public vc b;
    public boolean c;

    public final void a(vc vcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = vcVar;
            vcVar.setVisibility(8);
            addView(vcVar, layoutParams);
        }
    }

    public final void b(bi.e5 e5Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = e5Var;
            addView(e5Var, layoutParams);
        }
    }

    public vc getEditView() {
        return this.b;
    }

    public View getReplyView() {
        return this.a;
    }

    public void setEditMode(boolean z9) {
        this.c = z9;
        this.a.setVisibility(z9 ? 8 : 0);
        this.b.setVisibility(z9 ? 0 : 8);
    }

    public void setEditSuggestionMode(boolean z9) {
        setEditMode(z9);
        if (z9) {
            this.a.setVisibility(0);
        }
        this.b.a[0].setOnlyIconMode(z9);
        this.b.a[1].setOnlyIconMode(z9);
    }
}
