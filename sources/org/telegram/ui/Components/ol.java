package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ol implements a5, sj0, e81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.a = i7;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.a5
    public void O(int i7, int i10, boolean z10) {
        int i11 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i11) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                ui uiVar = chatAttachAlertPhotoLayout.b;
                uiVar.N0();
                uiVar.X3.y1(7, false, z10, i7, 0, 0L, uiVar.g1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                ui uiVar2 = chatAttachAlertPhotoLayout.b;
                uiVar2.N0();
                uiVar2.X3.y1(4, true, z10, i7, 0, 0L, uiVar2.g1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.e81
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        gm gmVar = chatAttachAlertPhotoLayout.Q;
        if (gmVar != null) {
            chatAttachAlertPhotoLayout.C0 = f10;
            gmVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean c(int i7, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ui uiVar = chatAttachAlertPhotoLayout.b;
        if (!uiVar.R2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                si siVar = uiVar.X3;
                if (siVar != null) {
                    siVar.y1(0, false, true, 0, 0, 0L, uiVar.g1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.s5) {
                ik0 ik0Var = chatAttachAlertPhotoLayout.J;
                boolean z11 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.L = z11;
                ik0Var.d(i7, view, z11);
            }
        }
        return false;
    }
}
