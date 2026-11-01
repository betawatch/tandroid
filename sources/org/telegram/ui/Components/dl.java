package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl implements q4, jk0, s81 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ dl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.q4
    public void K(int i10, int i11, boolean z10) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                bi biVar = chatAttachAlertPhotoLayout.b;
                biVar.M0();
                biVar.T3.H0(7, false, z10, i10, 0, 0L, biVar.e1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                bi biVar2 = chatAttachAlertPhotoLayout.b;
                biVar2.M0();
                biVar2.T3.H0(4, true, z10, i10, 0, 0L, biVar2.e1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.s81
    public void c(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        yl ylVar = chatAttachAlertPhotoLayout.P;
        if (ylVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            ylVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.u0(true);
    }

    @Override // org.telegram.ui.Components.jk0
    public boolean f(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (!biVar.N2) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ai aiVar = biVar.T3;
                if (aiVar != null) {
                    aiVar.H0(0, false, true, 0, 0, 0L, biVar.e1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.v5) {
                yk0 yk0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.v5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                yk0Var.d(i10, view, z11);
            }
        }
        return false;
    }
}
