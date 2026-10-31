package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c3(FrameLayout frameLayout, Object obj, int i10) {
        this.a = i10;
        this.b = frameLayout;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                d3 d3Var = (d3) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                if (d3Var.getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            default:
                vh.d dVar = (vh.d) this.b;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.c;
                if (dVar.I <= 0) {
                    z2Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.i0.F3(3.0f, dVar, null);
                    org.telegram.messenger.t2.D.a();
                    break;
                }
        }
    }
}
