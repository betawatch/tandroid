// default package

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class kw1 extends FrameLayout {
    public yd a;
    public iw1 b;
    public boolean c;

    public final void a(iw1 iw1Var, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = iw1Var;
            iw1Var.setVisibility(8);
            addView(iw1Var, layoutParams);
        }
    }

    public final void b(yd ydVar, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = ydVar;
            addView(ydVar, layoutParams);
        }
    }

    public iw1 getEditView() {
        return this.b;
    }

    public View getReplyView() {
        return this.a;
    }

    public void setEditMode(boolean z) {
        this.c = z;
        this.a.setVisibility(z ? 8 : 0);
        this.b.setVisibility(z ? 0 : 8);
    }

    public void setEditSuggestionMode(boolean z) {
        setEditMode(z);
        if (z) {
            this.a.setVisibility(0);
        }
        this.b.a[0].setOnlyIconMode(z);
        this.b.a[1].setOnlyIconMode(z);
    }
}
