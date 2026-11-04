package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cq implements q0.a {
    public final /* synthetic */ int a;

    public /* synthetic */ cq(int i3) {
        this.a = i3;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    q5Var.c(q5Var.getPhotoEntry() != null && q5Var.getPhotoEntry().M, Float.valueOf(250.0f));
                    q5Var.setHighQuality(q5Var.getPhotoEntry() != null && q5Var.getPhotoEntry().c());
                    q5Var.f(q5Var.getPhotoEntry() != null ? q5Var.getPhotoEntry().N : 0L, ChatAttachAlertPhotoLayout.t1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.sl0) {
                    ((org.telegram.ui.Components.sl0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.sl0) {
                    ((org.telegram.ui.Components.sl0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
