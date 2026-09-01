package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class el implements h91, y4, ll0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ el(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.y4
    public void I(int i10, int i11, boolean z4) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.n1;
                mi miVar = chatAttachAlertPhotoLayout.b;
                miVar.Y0();
                miVar.W1.I1(7, false, z4, i10, 0, 0L, miVar.s1(), false, 0L);
                break;
            default:
                boolean z11 = ChatAttachAlertPhotoLayout.n1;
                mi miVar2 = chatAttachAlertPhotoLayout.b;
                miVar2.Y0();
                miVar2.W1.I1(4, true, z4, i10, 0, 0L, miVar2.s1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.h91
    public void a(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        bm bmVar = chatAttachAlertPhotoLayout.M;
        if (bmVar != null) {
            chatAttachAlertPhotoLayout.y0 = f10;
            bmVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override // org.telegram.ui.Components.ll0
    public boolean f(int i10, View view) {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        mi miVar = chatAttachAlertPhotoLayout.b;
        if (!miVar.Q0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                ki kiVar = miVar.W1;
                if (kiVar != null) {
                    kiVar.I1(0, false, true, 0, 0, 0L, miVar.s1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.t5) {
                wl0 wl0Var = chatAttachAlertPhotoLayout.F;
                boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.H = z10;
                wl0Var.d(view, i10, z10);
            }
        }
        return false;
    }
}
