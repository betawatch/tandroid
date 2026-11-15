package org.telegram.ui.Components;

import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.camera.CameraController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class rl extends wl {
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ChatAttachAlertPhotoLayout c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, boolean z10) {
        super(chatAttachAlertPhotoLayout);
        this.c = chatAttachAlertPhotoLayout;
        this.b = z10;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        chatAttachAlertPhotoLayout.p0();
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void G() {
        ql qlVar = this.c.F;
        int childCount = qlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = qlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) childAt;
                q5Var.a.getImageReceiver().O0(true, true);
                q5Var.g(true);
            }
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
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

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean T() {
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        this.c.n0();
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean g() {
        return this.c.b.Q3 != 1;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.messenger.ic j(int i7) {
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void n() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        TextView textView = chatAttachAlertPhotoLayout.q0;
        chatAttachAlertPhotoLayout.u0 = false;
        if (ChatAttachAlertPhotoLayout.r1) {
            ki kiVar = chatAttachAlertPhotoLayout.b;
            kiVar.X3.y1(0, true, true, 0, 0, 0L, kiVar.f1(), false, 0L);
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

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        ki kiVar = this.c.b;
        ArrayList arrayList = ChatAttachAlertPhotoLayout.s1;
        if (arrayList.isEmpty() || kiVar.Q1) {
            return;
        }
        if (g20Var != null && i7 >= 0 && i7 < arrayList.size()) {
            ((org.telegram.messenger.ff) arrayList.get(i7)).s = g20Var;
        }
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.a2;
        if (!(e2Var instanceof org.telegram.ui.an) || !((org.telegram.ui.an) e2Var).z()) {
            int size = arrayList.size();
            for (int i12 = 0; i12 < size; i12++) {
                org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ChatAttachAlertPhotoLayout.s1.get(i12);
                if (ffVar.x <= 0) {
                    org.telegram.messenger.g0.e(ffVar.I);
                }
            }
        }
        kiVar.M0();
        PhotoViewer.p1();
        PhotoViewer.p1().P = false;
        PhotoViewer.p1().v2 = false;
        t4.X(kiVar.H3, kiVar.X0() + ChatAttachAlertPhotoLayout.t1.size(), kiVar.b1(), new ml(this, z11, z10, i10));
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean u() {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.c;
        if (chatAttachAlertPhotoLayout.c0 && chatAttachAlertPhotoLayout.Q != null) {
            org.telegram.messenger.g0.i3(new dg(this, 27), 1000L);
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
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) ChatAttachAlertPhotoLayout.s1.get(i7);
                    new File(ffVar.I).delete();
                    if (ffVar.h != null) {
                        new File(ffVar.h).delete();
                    }
                    if (ffVar.c != null) {
                        new File(ffVar.c).delete();
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

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean z() {
        ki kiVar = this.c.b;
        return (kiVar.A1 || kiVar.C1) ? false : true;
    }
}
