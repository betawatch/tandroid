package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ar implements q0.a {
    public final /* synthetic */ int a;

    public /* synthetic */ ar(int i10) {
        this.a = i10;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.m1;
                if (view instanceof org.telegram.ui.Cells.q5) {
                    org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) view;
                    q5Var.c(q5Var.getPhotoEntry() != null && q5Var.getPhotoEntry().hasSpoiler, Float.valueOf(250.0f));
                    q5Var.setHighQuality(q5Var.getPhotoEntry() != null && q5Var.getPhotoEntry().isHighQuality());
                    q5Var.f(q5Var.getPhotoEntry() != null ? q5Var.getPhotoEntry().starsAmount : 0L, ChatAttachAlertPhotoLayout.o1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.tm0) {
                    ((org.telegram.ui.Components.tm0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.tm0) {
                    ((org.telegram.ui.Components.tm0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
