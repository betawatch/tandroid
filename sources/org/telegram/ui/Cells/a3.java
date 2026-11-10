package org.telegram.ui.Cells;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                fi.d dVar = (fi.d) this.b;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) this.c;
                if (dVar.I <= 0) {
                    w2Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.G3(3.0f, dVar, null);
                    org.telegram.messenger.p2.D.a();
                    break;
                }
        }
    }
}
