package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl implements v91, e5, yl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.e5
    public void C(int i10, int i11, boolean z10) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                tiVar.a1();
                tiVar.c2.b0(7, false, z10, i10, 0, 0L, tiVar.u1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                ti tiVar2 = chatAttachAlertPhotoLayout.b;
                tiVar2.a1();
                tiVar2.c2.b0(4, true, z10, i10, 0, 0L, tiVar2.u1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (!tiVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ri riVar = tiVar.c2;
                if (riVar != null) {
                    riVar.b0(0, false, true, 0, 0, 0L, tiVar.u1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.s5) {
                km0 km0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                km0Var.d(view, i10, z11);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.v91
    public void b(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        om omVar = chatAttachAlertPhotoLayout.P;
        if (omVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            omVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }
}
