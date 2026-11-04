package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jl extends ol {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z10;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void G() {
        il ilVar = this.c.F;
        int childCount = ilVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = ilVar.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                q5Var.a.getImageReceiver().O0(true, true);
                q5Var.g(true);
            }
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean K() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (!chatAttachAlertPhotoLayout.b.N1) {
            int i3 = Settings.System.getInt(chatAttachAlertPhotoLayout.getContext().getContentResolver(), "accelerometer_rotation", 0);
            if (this.b || i3 == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        this.c.n0();
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean g() {
        return this.c.b.N3 != 1;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.messenger.cc j(int i3) {
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        chatAttachAlertPhotoLayout.u0 = false;
        if (ChatAttachAlertPhotoLayout.r1) {
            bi biVar = chatAttachAlertPhotoLayout.b;
            biVar.U3.o1(0, true, true, 0, 0, 0L, biVar.f1(), false, 0L);
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

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        bi biVar = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
        if (arrayList.isEmpty() || biVar.N1) {
            return;
        }
        if (b20Var != null && i3 >= 0 && i3 < arrayList.size()) {
            ((org.telegram.messenger.ye) arrayList.get(i3)).s = b20Var;
        }
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        if (!(d2Var instanceof org.telegram.ui.wm) || !((org.telegram.ui.wm) d2Var).z()) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) ChatAttachAlertPhotoLayout.s1.get(i12);
                if (yeVar.x <= 0) {
                    org.telegram.messenger.g0.e(yeVar.I);
                }
            }
        }
        biVar.M0();
        PhotoViewer.v1();
        PhotoViewer.v1().P = false;
        PhotoViewer.v1().v2 = false;
        t4.Z(biVar.E3, biVar.X0() + ChatAttachAlertPhotoLayout.t1.size(), biVar.b1(), new el(this, z11, z10, i10));
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (chatAttachAlertPhotoLayout.c0 && chatAttachAlertPhotoLayout.Q != null) {
            org.telegram.messenger.g0.i3(new vf(this, 25), 1000L);
            chatAttachAlertPhotoLayout.m0.b(false, 0.0f);
            chatAttachAlertPhotoLayout.C0 = 0.0f;
            chatAttachAlertPhotoLayout.Q.setZoom(0.0f);
            CameraController.getInstance().startPreview(chatAttachAlertPhotoLayout.Q.getCameraSession());
        }
        if (chatAttachAlertPhotoLayout.u0) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
            if (arrayList.size() == 1) {
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) ChatAttachAlertPhotoLayout.s1.get(i3);
                    new File(yeVar.I).delete();
                    if (yeVar.h != null) {
                        new File(yeVar.h).delete();
                    }
                    if (yeVar.c != null) {
                        new File(yeVar.c).delete();
                    }
                }
                ChatAttachAlertPhotoLayout.s1.clear();
                ChatAttachAlertPhotoLayout.u1.clear();
                ChatAttachAlertPhotoLayout.t1.clear();
                chatAttachAlertPhotoLayout.q0.setVisibility(4);
                chatAttachAlertPhotoLayout.r.setVisibility(8);
                chatAttachAlertPhotoLayout.H.f();
                chatAttachAlertPhotoLayout.w.f();
                chatAttachAlertPhotoLayout.b.K1(0);
            }
        }
        return true;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean z() {
        bi biVar = this.c.b;
        return (biVar.x1 || biVar.z1) ? false : true;
    }
}
