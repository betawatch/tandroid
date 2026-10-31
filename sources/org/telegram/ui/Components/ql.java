package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ql extends xl {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ql(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z10;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.s1.size());
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void G() {
        pl plVar = this.c.E;
        int childCount = plVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = plVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                org.telegram.ui.Cells.v5 v5Var = (org.telegram.ui.Cells.v5) childAt;
                v5Var.a.getImageReceiver().O0(true, true);
                v5Var.g(true);
            }
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (!chatAttachAlertPhotoLayout.b.M1) {
            int i10 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.b || i10 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.c.l0();
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean g() {
        return this.c.b.M3 != 1;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.messenger.kc j(int i10) {
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        chatAttachAlertPhotoLayout.t0 = false;
        if (ChatAttachAlertPhotoLayout.q1) {
            bi biVar = chatAttachAlertPhotoLayout.b;
            biVar.T3.H0(0, true, true, 0, 0, 0L, biVar.e1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.b0) {
            chatAttachAlertPhotoLayout.i0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.z0(false);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        bi biVar = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.r1;
        if (arrayList.isEmpty() || biVar.M1) {
            return;
        }
        if (x20Var != null && i10 >= 0 && i10 < arrayList.size()) {
            ((org.telegram.messenger.ef) arrayList.get(i10)).s = x20Var;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (!(k2Var instanceof org.telegram.ui.un) || !((org.telegram.ui.un) k2Var).z()) {
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.r1.get(i13);
                if (efVar.x <= 0) {
                    org.telegram.messenger.i0.e(efVar.I);
                }
            }
        }
        biVar.M0();
        PhotoViewer.v1();
        PhotoViewer.v1().O = false;
        PhotoViewer.v1().u2 = false;
        s4.Z(biVar.D3, biVar.W0() + ChatAttachAlertPhotoLayout.s1.size(), biVar.a1(), new kl(this, z11, z10, i11));
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (chatAttachAlertPhotoLayout.b0 && chatAttachAlertPhotoLayout.P != null) {
            org.telegram.messenger.i0.h3(new tf(this, 26), 1000L);
            chatAttachAlertPhotoLayout.l0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) ChatAttachAlertPhotoLayout.r1.get(i10);
                    new File(efVar.I).delete();
                    if (efVar.h != null) {
                        new File(efVar.h).delete();
                    }
                    if (efVar.c != null) {
                        new File(efVar.c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                chatAttachAlertPhotoLayout.p0.setVisibility(4);
                chatAttachAlertPhotoLayout.r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.w.f();
                chatAttachAlertPhotoLayout.b.J1(0);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean z() {
        bi biVar = this.c.b;
        return (biVar.w1 || biVar.y1) ? false : true;
    }
}
