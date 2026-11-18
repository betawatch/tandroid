package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq implements q0.a {
    public final /* synthetic */ int a;

    public /* synthetic */ hq(int i7) {
        this.a = i7;
    }

    @Override // q0.a
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                View view = (View) obj;
                boolean z10 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof org.telegram.ui.Cells.r5) {
                    org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) view;
                    r5Var.c(r5Var.getPhotoEntry() != null && r5Var.getPhotoEntry().M, Float.valueOf(250.0f));
                    r5Var.setHighQuality(r5Var.getPhotoEntry() != null && r5Var.getPhotoEntry().c());
                    r5Var.f(r5Var.getPhotoEntry() != null ? r5Var.getPhotoEntry().N : 0L, ChatAttachAlertPhotoLayout.t1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.bm0) {
                    ((org.telegram.ui.Components.bm0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.bm0) {
                    ((org.telegram.ui.Components.bm0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
