package org.telegram.ui.Components;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class tl extends wl {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean A() {
        ki kiVar = this.b.b;
        return kiVar != null && kiVar.X1;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.i3(new dg(this, 26), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.ui.uq0 E(org.telegram.messenger.gj gjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        xs xsVar;
        org.telegram.ui.uq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (xsVar = kiVar.P2) != null && (closeIntoObject = ((l30) xsVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.q5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P == null) {
            return null;
        }
        int[] iArr = new int[2];
        P.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - kiVar.T();
        }
        org.telegram.ui.uq0 uq0Var = new org.telegram.ui.uq0();
        uq0Var.b = iArr[0];
        uq0Var.c = iArr[1];
        uq0Var.d = chatAttachAlertPhotoLayout.F;
        ImageReceiver imageReceiver = P.getImageView().getImageReceiver();
        uq0Var.a = imageReceiver;
        uq0Var.e = imageReceiver.p();
        uq0Var.k = P.getScale();
        uq0Var.i = (int) kiVar.Z0();
        P.g(false);
        return uq0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (kiVar == null || kiVar.X1 == z10) {
            return;
        }
        kiVar.v1(z10, true);
        chatAttachAlertPhotoLayout.e1.a(!chatAttachAlertPhotoLayout.b.X1, true);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void G() {
        ql qlVar = this.b.F;
        int childCount = qlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = qlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void X(int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.q5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            P.getImageView().r();
            org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 == null) {
                return;
            }
            int i10 = e02.C;
            String str = e02.I;
            if (e02.g != null) {
                P.getImageView().h(e02.g, null, org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            if (e02.c != null) {
                P.getImageView().h(e02.c, null, org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            if (str == null) {
                P.getImageView().setImageDrawable(org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            P.getImageView().s(e02.J, e02.K, true);
            if (e02.b) {
                P.getImageView().h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.j6.R4);
                return;
            }
            P.getImageView().h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.j6.R4);
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final long a() {
        org.telegram.ui.ActionBar.e2 e2Var = this.b.b.a2;
        if (e2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) e2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void a0(int i7) {
        org.telegram.ui.Cells.q5 P = ChatAttachAlertPhotoLayout.P(this.b, i7);
        if (P != null) {
            P.g(true);
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.ff) {
                    org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                    charSequence2 = ffVar.a;
                    arrayList = ffVar.n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.jf) {
                    org.telegram.messenger.jf jfVar = (org.telegram.messenger.jf) obj;
                    charSequence2 = jfVar.I;
                    arrayList = jfVar.n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    CharSequence spannableStringBuilder = !(charSequence2 instanceof Spannable) ? new SpannableStringBuilder(charSequence2) : charSequence2;
                    org.telegram.messenger.gj.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.b.b.a1().setText(p5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.messenger.ic j(int i7) {
        org.telegram.ui.Cells.q5 P = ChatAttachAlertPhotoLayout.P(this.b, i7);
        if (P != null) {
            return P.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean l() {
        ki kiVar = this.b.b;
        return kiVar != null && (kiVar.a2 instanceof org.telegram.ui.an);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        kiVar.t4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.r1;
        org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.s = g20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.T(e02, -1);
        }
        if (kiVar.O0(kiVar.a1().getText())) {
            return;
        }
        kiVar.M0();
        if (PhotoViewer.p1().p7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
            if (!hashMap.isEmpty()) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Object obj = hashMap.get(arrayList.get(i12));
                    if (obj instanceof org.telegram.messenger.ff) {
                        org.telegram.messenger.ff ffVar = (org.telegram.messenger.ff) obj;
                        if (i12 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.p1().q7};
                            ffVar.n = org.telegram.messenger.si.b0(org.telegram.messenger.m10.t0).W(charSequenceArr, false, true);
                            CharSequence charSequence = charSequenceArr[0];
                            ffVar.a = charSequence;
                            if (kiVar.O0(charSequence)) {
                                return;
                            }
                        } else {
                            ffVar.a = null;
                        }
                    }
                }
            }
        }
        if (kiVar != null) {
            kiVar.G3 = false;
        }
        PhotoViewer.p1();
        PhotoViewer.p1().P = false;
        PhotoViewer.p1().v2 = false;
        t4.X(kiVar.H3, kiVar.X0() + ChatAttachAlertPhotoLayout.t1.size(), kiVar.b1(), new ml(this, z10, i10, z11));
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean q() {
        ki kiVar = this.b.b;
        return (kiVar == null || kiVar.F3 == null) ? false : true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        this.b.s0(-1, false);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean w() {
        org.telegram.messenger.gj gjVar;
        ki kiVar = this.b.b;
        return (kiVar == null || (gjVar = kiVar.F3) == null || !gjVar.p5()) ? false : true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean z() {
        ki kiVar = this.b.b;
        return (kiVar.A1 || kiVar.C1) ? false : true;
    }
}
