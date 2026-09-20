package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class il implements q91, c5, ll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ il(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.c5
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                vi viVar = chatAttachAlertPhotoLayout.b;
                viVar.Y0();
                viVar.Z1.C1(7, false, z10, i10, 0, 0L, viVar.s1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                vi viVar2 = chatAttachAlertPhotoLayout.b;
                viVar2.Y0();
                viVar2.Z1.C1(4, true, z10, i10, 0, 0L, viVar2.s1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.q91
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        dm dmVar = chatAttachAlertPhotoLayout.P;
        if (dmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            dmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (!viVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ti tiVar = viVar.Z1;
                if (tiVar != null) {
                    tiVar.C1(0, false, true, 0, 0, 0L, viVar.s1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.u5) {
                xl0 xl0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.u5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                xl0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
