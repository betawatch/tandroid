package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ir implements q0.a {
    public final /* synthetic */ int a;

    public /* synthetic */ ir(int i10) {
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
                if (view instanceof org.telegram.ui.Cells.u5) {
                    org.telegram.ui.Cells.u5 u5Var = (org.telegram.ui.Cells.u5) view;
                    u5Var.c(u5Var.getPhotoEntry() != null && u5Var.getPhotoEntry().hasSpoiler, Float.valueOf(250.0f));
                    u5Var.setHighQuality(u5Var.getPhotoEntry() != null && u5Var.getPhotoEntry().isHighQuality());
                    u5Var.f(u5Var.getPhotoEntry() != null ? u5Var.getPhotoEntry().starsAmount : 0L, ChatAttachAlertPhotoLayout.s1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.vn0) {
                    ((org.telegram.ui.Components.vn0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.vn0) {
                    ((org.telegram.ui.Components.vn0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
