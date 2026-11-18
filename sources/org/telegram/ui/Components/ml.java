package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml implements z4, qj0, b81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.a = i7;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.z4
    public void O(int i7, int i10, boolean z10) {
        int i11 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i11) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                si siVar = chatAttachAlertPhotoLayout.b;
                siVar.N0();
                siVar.X3.y1(7, false, z10, i7, 0, 0L, siVar.g1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                si siVar2 = chatAttachAlertPhotoLayout.b;
                siVar2.N0();
                siVar2.X3.y1(4, true, z10, i7, 0, 0L, siVar2.g1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.b81
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        em emVar = chatAttachAlertPhotoLayout.Q;
        if (emVar != null) {
            chatAttachAlertPhotoLayout.C0 = f10;
            emVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override // org.telegram.ui.Components.qj0
    public boolean c(int i7, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        si siVar = chatAttachAlertPhotoLayout.b;
        if (!siVar.R2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                qi qiVar = siVar.X3;
                if (qiVar != null) {
                    qiVar.y1(0, false, true, 0, 0, 0L, siVar.g1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.s5) {
                gk0 gk0Var = chatAttachAlertPhotoLayout.J;
                boolean z11 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.L = z11;
                gk0Var.d(i7, view, z11);
            }
        }
        return false;
    }
}
