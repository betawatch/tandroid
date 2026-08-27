package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk implements j81, x4, rk0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ vk(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.x4
    public void I(int i10, int i11, boolean z10) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                gi giVar = chatAttachAlertPhotoLayout.b;
                giVar.Y0();
                giVar.V1.n0(7, false, z10, i10, 0, 0L, giVar.s1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.m1;
                gi giVar2 = chatAttachAlertPhotoLayout.b;
                giVar2.Y0();
                giVar2.V1.n0(4, true, z10, i10, 0, 0L, giVar2.s1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.rk0
    public boolean a(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        gi giVar = chatAttachAlertPhotoLayout.b;
        if (!giVar.P0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                ei eiVar = giVar.V1;
                if (eiVar != null) {
                    eiVar.n0(0, false, true, 0, 0, 0L, giVar.s1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.q5) {
                bl0 bl0Var = chatAttachAlertPhotoLayout.E;
                boolean z11 = !((org.telegram.ui.Cells.q5) view).a();
                chatAttachAlertPhotoLayout.G = z11;
                bl0Var.d(view, i10, z11);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.j81
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ql qlVar = chatAttachAlertPhotoLayout.L;
        if (qlVar != null) {
            chatAttachAlertPhotoLayout.x0 = f10;
            qlVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }
}
