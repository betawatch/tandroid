package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl implements g91, y4, kl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ cl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.y4
    public void J(int i10, int i11, boolean z4) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z10 = ChatAttachAlertPhotoLayout.n1;
                li liVar = chatAttachAlertPhotoLayout.b;
                liVar.Y0();
                liVar.W1.H(7, false, z4, i10, 0, 0L, liVar.s1(), false, 0L);
                break;
            default:
                boolean z11 = ChatAttachAlertPhotoLayout.n1;
                li liVar2 = chatAttachAlertPhotoLayout.b;
                liVar2.Y0();
                liVar2.W1.H(4, true, z4, i10, 0, 0L, liVar2.s1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g91
    public void a(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        am amVar = chatAttachAlertPhotoLayout.M;
        if (amVar != null) {
            chatAttachAlertPhotoLayout.y0 = f10;
            amVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        li liVar = chatAttachAlertPhotoLayout.b;
        if (!liVar.Q0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                ji jiVar = liVar.W1;
                if (jiVar != null) {
                    jiVar.H(0, false, true, 0, 0, 0L, liVar.s1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.t5) {
                vl0 vl0Var = chatAttachAlertPhotoLayout.F;
                boolean z10 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.H = z10;
                vl0Var.d(view, i10, z10);
            }
        }
        return false;
    }
}
