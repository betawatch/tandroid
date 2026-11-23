package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b3(FrameLayout frameLayout, Object obj, int i7) {
        this.a = i7;
        this.b = frameLayout;
        this.c = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                c3 c3Var = (c3) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                if (c3Var.getAlpha() > 0.5f && onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            default:
                hi.e eVar = (hi.e) this.b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.c;
                if (eVar.J <= 0) {
                    w2Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.E3(3.0f, eVar, null);
                    org.telegram.messenger.q2.E.a();
                    break;
                }
        }
    }
}
