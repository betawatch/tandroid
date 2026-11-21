package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class am extends fm {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z10;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void G() {
        zl zlVar = this.c.F;
        int childCount = zlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = zlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.s5) {
                org.telegram.ui.Cells.s5 s5Var = (org.telegram.ui.Cells.s5) childAt;
                s5Var.a.getImageReceiver().O0(true, true);
                s5Var.g(true);
            }
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (!chatAttachAlertPhotoLayout.b.Q1) {
            int i7 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.b || i7 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        this.c.n0();
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean g() {
        return this.c.b.Q3 != 1;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.messenger.hc j(int i7) {
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        chatAttachAlertPhotoLayout.u0 = false;
        if (ChatAttachAlertPhotoLayout.r1) {
            ui uiVar = chatAttachAlertPhotoLayout.b;
            uiVar.X3.y1(0, true, true, 0, 0, 0L, uiVar.g1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.c0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        ui uiVar = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
        if (arrayList.isEmpty() || uiVar.Q1) {
            return;
        }
        if (e20Var != null && i7 >= 0 && i7 < arrayList.size()) {
            ((org.telegram.messenger.ef) arrayList.get(i7)).s = e20Var;
        }
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.a2;
        if (!(g2Var instanceof org.telegram.ui.bn) || !((org.telegram.ui.bn) g2Var).z()) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.s1.get(i12);
                if (efVar.x <= 0) {
                    org.telegram.messenger.g0.e(efVar.I);
                }
            }
        }
        uiVar.N0();
        PhotoViewer.p1();
        PhotoViewer.p1().P = false;
        PhotoViewer.p1().v2 = false;
        c5.X(uiVar.H3, uiVar.Y0() + ChatAttachAlertPhotoLayout.t1.size(), uiVar.c1(), new vl(this, z11, z10, i10));
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (chatAttachAlertPhotoLayout.c0 && chatAttachAlertPhotoLayout.Q != null) {
            org.telegram.messenger.g0.h3(new og(this, 27), 1000L);
            chatAttachAlertPhotoLayout.m0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.C0 = 0.0f;
            chatAttachAlertPhotoLayout.Q.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.Q.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.u0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.s1.get(i7);
                    new File(efVar.I).delete();
                    if (efVar.h != null) {
                        new File(efVar.h).delete();
                    }
                    if (efVar.c != null) {
                        new File(efVar.c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                chatAttachAlertPhotoLayout.q0.setVisibility(4);
                chatAttachAlertPhotoLayout.r.setVisibility(8);
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.w.f();
                chatAttachAlertPhotoLayout.b.L1(0);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean z() {
        ui uiVar = this.c.b;
        return (uiVar.A1 || uiVar.C1) ? false : true;
    }
}
