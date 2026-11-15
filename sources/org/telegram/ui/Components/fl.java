package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class fl implements r4, ij0, r71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ fl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.a = i7;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i7, int i10, boolean z10) {
        int i11 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i11) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                ki kiVar = chatAttachAlertPhotoLayout.b;
                kiVar.M0();
                kiVar.X3.y1(7, false, z10, i7, 0, 0L, kiVar.f1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                ki kiVar2 = chatAttachAlertPhotoLayout.b;
                kiVar2.M0();
                kiVar2.X3.y1(4, true, z10, i7, 0, 0L, kiVar2.f1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ij0
    public boolean b(int i7, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (!kiVar.R2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                ii iiVar = kiVar.X3;
                if (iiVar != null) {
                    iiVar.y1(0, false, true, 0, 0, 0L, kiVar.f1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.q5) {
                yj0 yj0Var = chatAttachAlertPhotoLayout.J;
                boolean z11 = !((org.telegram.ui.Cells.q5) view).a();
                chatAttachAlertPhotoLayout.L = z11;
                yj0Var.d(i7, view, z11);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.r71
    public void c(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        xl xlVar = chatAttachAlertPhotoLayout.Q;
        if (xlVar != null) {
            chatAttachAlertPhotoLayout.C0 = f10;
            xlVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }
}
