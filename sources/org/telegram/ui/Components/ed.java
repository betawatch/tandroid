package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class ed extends FrameLayout {
    public fh.d2 a;
    public cd b;
    public boolean c;

    public final void a(cd cdVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = cdVar;
            cdVar.setVisibility(8);
            addView(cdVar, layoutParams);
        }
    }

    public final void b(fh.d2 d2Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = d2Var;
            addView(d2Var, layoutParams);
        }
    }

    public cd getEditView() {
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
