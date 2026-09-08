package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class pd extends FrameLayout {
    public ah.y a;
    public nd b;
    public boolean c;

    public final void a(nd ndVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = ndVar;
            ndVar.setVisibility(8);
            addView(ndVar, layoutParams);
        }
    }

    public final void b(ah.y yVar, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = yVar;
            addView(yVar, layoutParams);
        }
    }

    public nd getEditView() {
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
