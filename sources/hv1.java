// default package

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public abstract class hv1 extends FrameLayout {
    public final gv1 a;
    public final wk5 b;
    public View c;
    public int d;
    public boolean e;

    public hv1(Context context, wk5 wk5Var, Bundle bundle) {
        super(context);
        this.e = true;
        this.b = wk5Var;
        gv1 gv1Var = new gv1(this, bundle);
        this.a = gv1Var;
        gv1Var.mb = true;
    }

    public void a() {
        int i;
        gv1 gv1Var = this.a;
        if (gv1Var.onFragmentCreate()) {
            this.c = gv1Var.fragmentView;
            gv1Var.setParentLayout(this.b);
            View view = this.c;
            if (view == null) {
                this.c = gv1Var.createView(getContext());
            } else {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != null) {
                    gv1Var.onRemoveFromParent();
                    viewGroup.removeView(this.c);
                }
            }
            wq1 wq1Var = gv1Var.A0;
            if (wq1Var != null && (i = this.d) != 0) {
                wq1Var.setPadding(0, i, 0, 0);
            }
            gv1Var.Ha();
            addView(this.c, tre.c(-1.0f, -1));
            if (this.e) {
                gv1Var.onResume();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setTopPadding(int i) {
        this.d = i;
    }

    public void b(boolean z) {
    }
}
