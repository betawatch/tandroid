package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class kl extends pl {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z9) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z9;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void D() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.s1.size());
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void G() {
        jl jlVar = this.c.E;
        int childCount = jlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = jlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                q5Var.a.getImageReceiver().O0(true, true);
                q5Var.g(true);
            }
        }
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (!chatAttachAlertPhotoLayout.b.M1) {
            int i7 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.b || i7 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void d() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        this.c.n0();
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean g() {
        return this.c.b.M3 != 1;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void i() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final org.telegram.messenger.jc j(int i7) {
        return null;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.p0;
        chatAttachAlertPhotoLayout.t0 = false;
        if (ChatAttachAlertPhotoLayout.q1) {
            di diVar = chatAttachAlertPhotoLayout.b;
            diVar.T3.o1(0, true, true, 0, 0, 0L, diVar.f1(), false, 0L);
            return;
        }
        if (!chatAttachAlertPhotoLayout.b0) {
            chatAttachAlertPhotoLayout.k0(false);
        }
        textView.setVisibility(0);
        chatAttachAlertPhotoLayout.r.setVisibility(0);
        textView.setAlpha(1.0f);
        chatAttachAlertPhotoLayout.B0(false);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        di diVar = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.r1;
        if (arrayList.isEmpty() || diVar.M1) {
            return;
        }
        if (j20Var != null && i7 >= 0 && i7 < arrayList.size()) {
            ((org.telegram.messenger.gf) arrayList.get(i7)).s = j20Var;
        }
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        if (!(f2Var instanceof org.telegram.ui.an) || !((org.telegram.ui.an) f2Var).z()) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) ChatAttachAlertPhotoLayout.r1.get(i12);
                if (gfVar.x <= 0) {
                    org.telegram.messenger.g0.e(gfVar.I);
                }
            }
        }
        diVar.M0();
        PhotoViewer.p1();
        PhotoViewer.p1().O = false;
        PhotoViewer.p1().u2 = false;
        v4.X(diVar.D3, diVar.X0() + ChatAttachAlertPhotoLayout.s1.size(), diVar.b1(), new fl(this, z10, z9, i10));
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (chatAttachAlertPhotoLayout.b0 && chatAttachAlertPhotoLayout.P != null) {
            org.telegram.messenger.g0.i3(new xf(this, 25), 1000L);
            chatAttachAlertPhotoLayout.l0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.B0 = 0.0f;
            chatAttachAlertPhotoLayout.P.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.P.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.t0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.r1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i7 = 0; i7 < size; i7++) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) ChatAttachAlertPhotoLayout.r1.get(i7);
                    new File(gfVar.I).delete();
                    if (gfVar.h != null) {
                        new File(gfVar.h).delete();
                    }
                    if (gfVar.c != null) {
                        new File(gfVar.c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.r1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                ChatAttachAlertPhotoLayout.s1.clear();
                chatAttachAlertPhotoLayout.p0.setVisibility(4);
                chatAttachAlertPhotoLayout.r.setVisibility(8);
                chatAttachAlertPhotoLayout.G.f();
                chatAttachAlertPhotoLayout.w.f();
                chatAttachAlertPhotoLayout.b.K1(0);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean z() {
        di diVar = this.c.b;
        return (diVar.w1 || diVar.y1) ? false : true;
    }
}
