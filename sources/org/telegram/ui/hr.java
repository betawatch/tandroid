package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hr implements q0.a {
    public final /* synthetic */ int a;

    public /* synthetic */ hr(int i10) {
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
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.c(s5Var.getPhotoEntry() != null && s5Var.getPhotoEntry().hasSpoiler, Float.valueOf(250.0f));
                    s5Var.setHighQuality(s5Var.getPhotoEntry() != null && s5Var.getPhotoEntry().isHighQuality());
                    s5Var.f(s5Var.getPhotoEntry() != null ? s5Var.getPhotoEntry().starsAmount : 0L, ChatAttachAlertPhotoLayout.p1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.mn0) {
                    ((org.telegram.ui.Components.mn0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.mn0) {
                    ((org.telegram.ui.Components.mn0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
