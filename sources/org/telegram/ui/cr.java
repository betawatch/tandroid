package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cr implements q0.a {
    public final /* synthetic */ int a;

    public /* synthetic */ cr(int i10) {
        this.a = i10;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.x5) {
                    org.telegram.ui.Cells.x5 x5Var = (org.telegram.ui.Cells.x5) view;
                    x5Var.c(x5Var.getPhotoEntry() != null && x5Var.getPhotoEntry().hasSpoiler, Float.valueOf(250.0f));
                    x5Var.setHighQuality(x5Var.getPhotoEntry() != null && x5Var.getPhotoEntry().isHighQuality());
                    x5Var.f(x5Var.getPhotoEntry() != null ? x5Var.getPhotoEntry().starsAmount : 0L, ChatAttachAlertPhotoLayout.s1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.oo0) {
                    ((org.telegram.ui.Components.oo0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.oo0) {
                    ((org.telegram.ui.Components.oo0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
