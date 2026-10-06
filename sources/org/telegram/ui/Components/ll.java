package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll implements ba1, d5, ol0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.d5
    public void K(int i10, int i11, boolean z10) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                xi xiVar = chatAttachAlertPhotoLayout.b;
                xiVar.Z0();
                xiVar.Z1.B1(7, false, z10, i10, 0, 0L, xiVar.r1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                xi xiVar2 = chatAttachAlertPhotoLayout.b;
                xiVar2.Z0();
                xiVar2.Z1.B1(4, true, z10, i10, 0, 0L, xiVar2.r1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ba1
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        gm gmVar = chatAttachAlertPhotoLayout.P;
        if (gmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            gmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        xi xiVar = chatAttachAlertPhotoLayout.b;
        if (!xiVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                vi viVar = xiVar.Z1;
                if (viVar != null) {
                    viVar.B1(0, false, true, 0, 0, 0L, xiVar.r1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.t5) {
                dm0 dm0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                dm0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
