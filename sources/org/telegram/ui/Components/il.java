package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class il implements c91, d5, bl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.d5
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                vi viVar = chatAttachAlertPhotoLayout.b;
                viVar.Y0();
                viVar.Z1.l0(7, false, z10, i10, 0, 0L, viVar.s1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                vi viVar2 = chatAttachAlertPhotoLayout.b;
                viVar2.Y0();
                viVar2.Z1.l0(4, true, z10, i10, 0, 0L, viVar2.s1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean a(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (!viVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ti tiVar = viVar.Z1;
                if (tiVar != null) {
                    tiVar.l0(0, false, true, 0, 0, 0L, viVar.s1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.s5) {
                nl0 nl0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                nl0Var.d(view, i10, z11);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.c91
    public void b(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        dm dmVar = chatAttachAlertPhotoLayout.P;
        if (dmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            dmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }
}
