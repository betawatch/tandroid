package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eq implements q0.a {
    public final /* synthetic */ int a;

    public /* synthetic */ eq(int i7) {
        this.a = i7;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                View view = (View) obj;
                boolean z9 = ChatAttachAlertPhotoLayout.q1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    q5Var.c(q5Var.getPhotoEntry() != null && q5Var.getPhotoEntry().M, Float.valueOf(250.0f));
                    q5Var.setHighQuality(q5Var.getPhotoEntry() != null && q5Var.getPhotoEntry().c());
                    q5Var.f(q5Var.getPhotoEntry() != null ? q5Var.getPhotoEntry().N : 0L, ChatAttachAlertPhotoLayout.s1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.pl0) {
                    ((org.telegram.ui.Components.pl0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.pl0) {
                    ((org.telegram.ui.Components.pl0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
