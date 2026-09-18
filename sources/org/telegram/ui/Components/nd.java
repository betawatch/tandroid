package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class nd extends FrameLayout {
    public ai.f0 a;
    public ld b;
    public boolean c;

    public final void a(ld ldVar, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = ldVar;
            ldVar.setVisibility(8);
            addView(ldVar, layoutParams);
        }
    }

    public final void b(ai.f0 f0Var, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = f0Var;
            addView(f0Var, layoutParams);
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
