package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl implements p91, c5, ll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ nl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.c5
    public void I(int i10, int i11, boolean z10) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                yi yiVar = chatAttachAlertPhotoLayout.b;
                yiVar.Y0();
                yiVar.Z1.A1(7, false, z10, i10, 0, 0L, yiVar.s1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                yi yiVar2 = chatAttachAlertPhotoLayout.b;
                yiVar2.Y0();
                yiVar2.Z1.A1(4, true, z10, i10, 0, 0L, yiVar2.s1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.p91
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        im imVar = chatAttachAlertPhotoLayout.P;
        if (imVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            imVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (!yiVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                wi wiVar = yiVar.Z1;
                if (wiVar != null) {
                    wiVar.A1(0, false, true, 0, 0, 0L, yiVar.s1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.t5) {
                xl0 xl0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                xl0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
