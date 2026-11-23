package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml implements z4, sj0, f81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.a = i7;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.z4
    public void I(int i7, int i10, boolean z10) {
        int i11 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i11) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                tiVar.N0();
                tiVar.X3.y1(7, false, z10, i7, 0, 0L, tiVar.g1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                ti tiVar2 = chatAttachAlertPhotoLayout.b;
                tiVar2.N0();
                tiVar2.X3.y1(4, true, z10, i7, 0, 0L, tiVar2.g1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.sj0
    public boolean b(int i7, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (!tiVar.R2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                ri riVar = tiVar.X3;
                if (riVar != null) {
                    riVar.y1(0, false, true, 0, 0, 0L, tiVar.g1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.r5) {
                ik0 ik0Var = chatAttachAlertPhotoLayout.J;
                boolean z11 = !((org.telegram.ui.Cells.r5) view).a();
                chatAttachAlertPhotoLayout.L = z11;
                ik0Var.d(i7, view, z11);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.f81
    public void c(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        em emVar = chatAttachAlertPhotoLayout.Q;
        if (emVar != null) {
            chatAttachAlertPhotoLayout.C0 = f10;
            emVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }
}
