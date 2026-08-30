package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fr implements q0.a {
    public final /* synthetic */ int a;

    public /* synthetic */ fr(int i10) {
        this.a = i10;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                View view = (View) obj;
                boolean z4 = ChatAttachAlertPhotoLayout.n1;
                if (view instanceof org.telegram.ui.Cells.t5) {
                    org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) view;
                    t5Var.c(t5Var.getPhotoEntry() != null && t5Var.getPhotoEntry().hasSpoiler, Float.valueOf(250.0f));
                    t5Var.setHighQuality(t5Var.getPhotoEntry() != null && t5Var.getPhotoEntry().isHighQuality());
                    t5Var.f(t5Var.getPhotoEntry() != null ? t5Var.getPhotoEntry().starsAmount : 0L, ChatAttachAlertPhotoLayout.p1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.nn0) {
                    ((org.telegram.ui.Components.nn0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.nn0) {
                    ((org.telegram.ui.Components.nn0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
