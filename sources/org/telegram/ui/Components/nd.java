package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class nd extends FrameLayout {
    public bi.ld a;
    public ld b;
    public boolean c;

    public final void a(ld ldVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = ldVar;
            ldVar.setVisibility(8);
            addView(ldVar, layoutParams);
        }
    }

    public final void b(bi.ld ldVar, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = ldVar;
            addView(ldVar, layoutParams);
        }
    }

    public ld getEditView() {
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
