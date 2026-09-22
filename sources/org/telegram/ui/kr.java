package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kr implements q0.a {
    public final /* synthetic */ int a;

    public /* synthetic */ kr(int i10) {
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
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.c(t5Var.getPhotoEntry() != null && t5Var.getPhotoEntry().hasSpoiler, Float.valueOf(250.0f));
                    t5Var.setHighQuality(t5Var.getPhotoEntry() != null && t5Var.getPhotoEntry().isHighQuality());
                    t5Var.f(t5Var.getPhotoEntry() != null ? t5Var.getPhotoEntry().starsAmount : 0L, ChatAttachAlertPhotoLayout.s1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.gn0) {
                    ((org.telegram.ui.Components.gn0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.gn0) {
                    ((org.telegram.ui.Components.gn0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
