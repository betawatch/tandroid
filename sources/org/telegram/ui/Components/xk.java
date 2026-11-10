package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk implements s4, dj0, q71 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ xk(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i7) {
        this.a = i7;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.s4
    public void L(int i7, int i10, boolean z9) {
        int i11 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i11) {
            case 0:
                boolean z10 = ChatAttachAlertPhotoLayout.q1;
                ci ciVar = chatAttachAlertPhotoLayout.b;
                ciVar.M0();
                ciVar.W3.o1(7, false, z9, i7, 0, 0L, ciVar.f1(), false, 0L);
                break;
            default:
                boolean z11 = ChatAttachAlertPhotoLayout.q1;
                ci ciVar2 = chatAttachAlertPhotoLayout.b;
                ciVar2.M0();
                ciVar2.W3.o1(4, true, z9, i7, 0, 0L, ciVar2.f1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.q71
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        pl plVar = chatAttachAlertPhotoLayout.P;
        if (plVar != null) {
            chatAttachAlertPhotoLayout.B0 = f10;
            plVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.w0(true);
    }

    @Override // org.telegram.ui.Components.dj0
    public boolean c(int i7, View view) {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ci ciVar = chatAttachAlertPhotoLayout.b;
        if (!ciVar.Q2) {
            if (i7 == 0 && chatAttachAlertPhotoLayout.T0 == chatAttachAlertPhotoLayout.U0) {
                ai aiVar = ciVar.W3;
                if (aiVar != null) {
                    aiVar.o1(0, false, true, 0, 0, 0L, ciVar.f1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.q5) {
                tj0 tj0Var = chatAttachAlertPhotoLayout.I;
                boolean z10 = !((org.telegram.ui.Cells.q5) view).a();
                chatAttachAlertPhotoLayout.K = z10;
                tj0Var.d(i7, view, z10);
            }
        }
        return false;
    }
}
