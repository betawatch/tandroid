package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tl implements ea1, d5, cm0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.d5
    public void C(int i10, int i11, boolean z10) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                ti tiVar = chatAttachAlertPhotoLayout.b;
                tiVar.d1();
                tiVar.c2.b0(7, false, z10, i10, 0, 0L, tiVar.x1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.q1;
                ti tiVar2 = chatAttachAlertPhotoLayout.b;
                tiVar2.d1();
                tiVar2.c2.b0(4, true, z10, i10, 0, 0L, tiVar2.x1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ea1
    public void a(float f7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        om omVar = chatAttachAlertPhotoLayout.P;
        if (omVar != null) {
            chatAttachAlertPhotoLayout.B0 = f7;
            omVar.setZoom(f7);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (!tiVar.W0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ri riVar = tiVar.c2;
                if (riVar != null) {
                    riVar.b0(0, false, true, 0, 0, 0L, tiVar.x1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.s5) {
                om0 om0Var = chatAttachAlertPhotoLayout.I;
                boolean z11 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.K = z11;
                om0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
