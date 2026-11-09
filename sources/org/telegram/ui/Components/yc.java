package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class yc extends FrameLayout {
    public bi.e5 a;
    public wc b;
    public boolean c;

    public final void a(wc wcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = wcVar;
            wcVar.setVisibility(8);
            addView(wcVar, layoutParams);
        }
    }

    public final void b(bi.e5 e5Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = e5Var;
            addView(e5Var, layoutParams);
        }
    }

    public wc getEditView() {
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
