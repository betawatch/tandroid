package org.telegram.ui.Components;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk implements h81, x4, ok0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    public /* synthetic */ zk(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, int i9) {
        this.a = i9;
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.Components.x4
    public void B(int i9, int i10, boolean z10) {
        int i11 = this.a;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        switch (i11) {
            case 1:
                boolean z11 = ChatAttachAlertPhotoLayout.m1;
                ki kiVar = chatAttachAlertPhotoLayout.b;
                kiVar.Y0();
                kiVar.V1.L(7, false, z10, i9, 0, 0L, kiVar.s1(), false, 0L);
                break;
            default:
                boolean z12 = ChatAttachAlertPhotoLayout.m1;
                ki kiVar2 = chatAttachAlertPhotoLayout.b;
                kiVar2.Y0();
                kiVar2.V1.L(4, true, z10, i9, 0, 0L, kiVar2.s1(), false, 0L);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        boolean z10 = ChatAttachAlertPhotoLayout.m1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (!kiVar.P0) {
            if (i9 == 0 && chatAttachAlertPhotoLayout.P0 == chatAttachAlertPhotoLayout.Q0) {
                ii iiVar = kiVar.V1;
                if (iiVar != null) {
                    iiVar.L(0, false, true, 0, 0, 0L, kiVar.s1(), false, 0L);
                }
                return true;
            }
            if (view instanceof org.telegram.ui.Cells.t5) {
                yk0 yk0Var = chatAttachAlertPhotoLayout.E;
                boolean z11 = !((org.telegram.ui.Cells.t5) view).a();
                chatAttachAlertPhotoLayout.G = z11;
                yk0Var.d(view, i9, z11);
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.h81
    public void b(float f10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ul ulVar = chatAttachAlertPhotoLayout.L;
        if (ulVar != null) {
            chatAttachAlertPhotoLayout.x0 = f10;
            ulVar.setZoom(f10);
        }
        chatAttachAlertPhotoLayout.s0(true);
    }
}
