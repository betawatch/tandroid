package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dl implements t81, b5, bl0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ dl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i10) {
        this.a = i10;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.b5
    public void I(int i10, int i11, boolean z10) {
        int i12 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i12) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                ni niVar = chatAttachAlertPhotoLayout.b;
                niVar.Y0();
                niVar.V1.B1(7, false, z10, i10, 0, 0L, niVar.s1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.m1;
                ni niVar2 = chatAttachAlertPhotoLayout.b;
                niVar2.Y0();
                niVar2.V1.B1(4, true, z10, i10, 0, 0L, niVar2.s1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.t81
    public void a(float f9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        yl ylVar = chatAttachAlertPhotoLayout.L;
        if (ylVar != null) {
            chatAttachAlertPhotoLayout.x0 = f9;
            ylVar.setZoom(f9);
        }
        chatAttachAlertPhotoLayout.t0(true);
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ni niVar = chatAttachAlertPhotoLayout.b;
        if (!niVar.P0) {
            if (i10 == 0 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                li liVar = niVar.V1;
                if (liVar != null) {
                    liVar.B1(0, false, true, 0, 0, 0L, niVar.s1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.r5) {
                ll0 ll0Var = chatAttachAlertPhotoLayout.E;
                boolean z11 = !((org.telegram.ui.Cells.r5) view).a();
                chatAttachAlertPhotoLayout.G = z11;
                ll0Var.d(view, i10, z11);
            }
        }
        return false;
    }
}
