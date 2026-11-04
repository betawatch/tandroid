package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wk implements r4, hj0, i71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ wk(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i3) {
        this.a = i3;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.r4
    public void L(int i3, int i10, boolean z10) {
        int i11 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i11) {
            case 0:
                boolean z11 = ChatAttachAlertPhotoLayout.r1;
                bi biVar = chatAttachAlertPhotoLayout.b;
                biVar.M0();
                biVar.U3.o1(7, false, z10, i3, 0, 0L, biVar.f1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.r1;
                bi biVar2 = chatAttachAlertPhotoLayout.b;
                biVar2.M0();
                biVar2.U3.o1(4, true, z10, i3, 0, 0L, biVar2.f1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.i71
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        pl plVar = chatAttachAlertPhotoLayout.Q;
        if (plVar != null) {
            chatAttachAlertPhotoLayout.C0 = f10;
            plVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override // org.telegram.ui.Components.hj0
    public boolean f(int i3, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (!biVar.O2) {
            if (i3 == 0 && chatAttachAlertPhotoLayout.U0 == chatAttachAlertPhotoLayout.V0) {
                zh zhVar = biVar.U3;
                if (zhVar != null) {
                    zhVar.o1(0, false, true, 0, 0, 0L, biVar.f1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.q5) {
                xj0 xj0Var = chatAttachAlertPhotoLayout.J;
                boolean z11 = !((org.telegram.ui.Cells.q5) view).a();
                chatAttachAlertPhotoLayout.L = z11;
                xj0Var.d(i3, view, z11);
            }
        }
        return false;
    }
}
