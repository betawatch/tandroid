package org.telegram.ui;

import android.view.View;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                if (view instanceof org.telegram.ui.Cells.s5) {
                    org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) view;
                    s5Var.c(s5Var.getPhotoEntry() != null && s5Var.getPhotoEntry().M, Float.valueOf(250.0f));
                    s5Var.setHighQuality(s5Var.getPhotoEntry() != null && s5Var.getPhotoEntry().c());
                    s5Var.f(s5Var.getPhotoEntry() != null ? s5Var.getPhotoEntry().N : 0L, ChatAttachAlertPhotoLayout.t1.size() > 1);
                    break;
                }
                break;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof org.telegram.ui.Components.dm0) {
                    ((org.telegram.ui.Components.dm0) view2).a(false, true);
                    break;
                }
                break;
            default:
                View view3 = (View) obj;
                if (view3 instanceof org.telegram.ui.Components.dm0) {
                    ((org.telegram.ui.Components.dm0) view3).a(false, true);
                    break;
                }
                break;
        }
    }
}
