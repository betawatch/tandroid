package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a3(FrameLayout frameLayout, Object obj, int i7) {
        this.a = i7;
        this.b = frameLayout;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                b3 b3Var = (b3) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                if (b3Var.getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            default:
                hi.d dVar = (hi.d) this.b;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) this.c;
                if (dVar.J <= 0) {
                    u2Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.F3(3.0f, dVar, null);
                    org.telegram.messenger.p2.E.a();
                    break;
                }
        }
    }
}
