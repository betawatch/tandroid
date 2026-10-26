package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ul implements ec1, e5, bm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ ul(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.e5
    public void G(int i10, int i11, boolean z10) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                tiVar.e1();
                tiVar.c2.p0(7, false, z10, i10, 0, 0L, tiVar.w1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                ti tiVar2 = chatAttachAlertPhotoLayout.b;
                tiVar2.e1();
                tiVar2.c2.p0(4, true, z10, i10, 0, 0L, tiVar2.w1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ec1
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        pm pmVar = chatAttachAlertPhotoLayout.P;
        if (pmVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            pmVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override // org.telegram.ui.Components.bm0
    public boolean c(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (!tiVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ri riVar = tiVar.c2;
                if (riVar != null) {
                    riVar.p0(0, false, true, 0, 0, 0L, tiVar.w1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.x5) {
                qm0 qm0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.x5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                qm0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
