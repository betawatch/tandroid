package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class kl implements r91, d5, ol0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ kl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                wi wiVar = chatAttachAlertPhotoLayout.b;
                wiVar.Y0();
                wiVar.Z1.B1(7, false, z10, i10, 0, 0L, wiVar.s1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                wi wiVar2 = chatAttachAlertPhotoLayout.b;
                wiVar2.Y0();
                wiVar2.Z1.B1(4, true, z10, i10, 0, 0L, wiVar2.s1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.r91
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        fm fmVar = chatAttachAlertPhotoLayout.P;
        if (fmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            fmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        wi wiVar = chatAttachAlertPhotoLayout.b;
        if (!wiVar.T0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ui uiVar = wiVar.Z1;
                if (uiVar != null) {
                    uiVar.B1(0, false, true, 0, 0, 0L, wiVar.s1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.t5) {
                am0 am0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                am0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
