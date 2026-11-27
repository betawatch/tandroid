// default package

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public abstract class lv1 extends FrameLayout {
    public zc a;
    public jv1 b;
    public boolean c;

    public final void a(jv1 jv1Var, FrameLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = jv1Var;
            jv1Var.setVisibility(8);
            addView(jv1Var, layoutParams);
        }
    }

    public final void b(zc zcVar, FrameLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = zcVar;
            addView(zcVar, layoutParams);
        }
    }

    public jv1 getEditView() {
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
