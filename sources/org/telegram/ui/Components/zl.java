package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zl implements ia1, f5, gm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ zl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.f5
    public void J(int i10, int i11, boolean z10) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                yi yiVar = chatAttachAlertPhotoLayout.b;
                yiVar.a1();
                yiVar.c2.I1(7, false, z10, i10, 0, 0L, yiVar.u1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                yi yiVar2 = chatAttachAlertPhotoLayout.b;
                yiVar2.a1();
                yiVar2.c2.I1(4, true, z10, i10, 0, 0L, yiVar2.u1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ia1
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        um umVar = chatAttachAlertPhotoLayout.P;
        if (umVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            umVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override // org.telegram.ui.Components.gm0
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        yi yiVar = chatAttachAlertPhotoLayout.b;
        if (!yiVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                wi wiVar = yiVar.c2;
                if (wiVar != null) {
                    wiVar.I1(0, false, true, 0, 0, 0L, yiVar.u1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.t5) {
                sm0 sm0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                sm0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
