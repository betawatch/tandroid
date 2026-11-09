package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class yk implements t4, ej0, r71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ yk(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.a = i7;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.t4
    public void L(int i7, int i10, boolean z9) {
        int i11 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i11) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                di diVar = chatAttachAlertPhotoLayout.b;
                diVar.M0();
                diVar.T3.o1(7, false, z9, i7, 0, 0L, diVar.f1(), false, 0L);
                break;
            default:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                di diVar2 = chatAttachAlertPhotoLayout.b;
                diVar2.M0();
                diVar2.T3.o1(4, true, z9, i7, 0, 0L, diVar2.f1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.r71
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ql qlVar = chatAttachAlertPhotoLayout.P;
        if (qlVar != null) {
            chatAttachAlertPhotoLayout.B0 = f10;
            qlVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override // org.telegram.ui.Components.ej0
    public boolean c(int i7, View view) {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        di diVar = chatAttachAlertPhotoLayout.b;
        if (!diVar.N2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                bi biVar = diVar.T3;
                if (biVar != null) {
                    biVar.o1(0, false, true, 0, 0, 0L, diVar.f1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.q5) {
                uj0 uj0Var = chatAttachAlertPhotoLayout.I;
                boolean z10 = !((org.telegram.ui.Cells.q5) view).a();
                chatAttachAlertPhotoLayout.K = z10;
                uj0Var.d(i7, view, z10);
            }
        }
        return false;
    }
}
