package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vl implements ea1, f5, cm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ vl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
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
                vi viVar = chatAttachAlertPhotoLayout.b;
                viVar.a1();
                viVar.c2.b0(7, false, z10, i10, 0, 0L, viVar.u1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                vi viVar2 = chatAttachAlertPhotoLayout.b;
                viVar2.a1();
                viVar2.c2.b0(4, true, z10, i10, 0, 0L, viVar2.u1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean a(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        vi viVar = chatAttachAlertPhotoLayout.b;
        if (!viVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ti tiVar = viVar.c2;
                if (tiVar != null) {
                    tiVar.b0(0, false, true, 0, 0, 0L, viVar.u1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.t5) {
                om0 om0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                om0Var.d(view, i10, z11);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.ea1
    public void b(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        qm qmVar = chatAttachAlertPhotoLayout.P;
        if (qmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            qmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }
}
