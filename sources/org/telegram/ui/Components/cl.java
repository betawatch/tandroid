package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cl implements g91, y4, jl0 {
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
                liVar.W1.G1(7, false, z4, i10, 0, 0L, liVar.s1(), false, 0L);
                break;
            default:
                boolean z11 = ChatAttachAlertPhotoLayout.n1;
                li liVar2 = chatAttachAlertPhotoLayout.b;
                liVar2.Y0();
                liVar2.W1.G1(4, true, z4, i10, 0, 0L, liVar2.s1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.g91
    public void a(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        zl zlVar = chatAttachAlertPhotoLayout.M;
        if (zlVar != null) {
            chatAttachAlertPhotoLayout.y0 = f10;
            zlVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        boolean z4 = ChatAttachAlertPhotoLayout.n1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        li liVar = chatAttachAlertPhotoLayout.b;
        if (!liVar.Q0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.Q0 == chatAttachAlertPhotoLayout.R0) {
                ji jiVar = liVar.W1;
                if (jiVar != null) {
                    jiVar.G1(0, false, true, 0, 0, 0L, liVar.s1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.s5) {
                ul0 ul0Var = chatAttachAlertPhotoLayout.F;
                boolean z10 = !((org.telegram.ui.Cells.s5) view).a();
                chatAttachAlertPhotoLayout.H = z10;
                ul0Var.d(view, i10, z10);
            }
        }
        return false;
    }
}
