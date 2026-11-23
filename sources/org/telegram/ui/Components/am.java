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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class am extends dm {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean A() {
        ti tiVar = this.b.b;
        return tiVar != null && tiVar.X1;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.h3(new ng(this, 26), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.ui.wq0 E(org.telegram.messenger.fj fjVar, TLRPC.FileLocation fileLocation, int i7, boolean z10, boolean z11) {
        dt dtVar;
        org.telegram.ui.wq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (dtVar = tiVar.P2) != null && (closeIntoObject = ((t30) dtVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P == null) {
            return null;
        }
        int[] iArr = new int[2];
        P.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - tiVar.T();
        }
        org.telegram.ui.wq0 wq0Var = new org.telegram.ui.wq0();
        wq0Var.b = iArr[0];
        wq0Var.c = iArr[1];
        wq0Var.d = chatAttachAlertPhotoLayout.F;
        ImageReceiver imageReceiver = P.getImageView().getImageReceiver();
        wq0Var.a = imageReceiver;
        wq0Var.e = imageReceiver.p();
        wq0Var.k = P.getScale();
        wq0Var.i = (int) tiVar.a1();
        P.g(false);
        return wq0Var;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        if (tiVar == null || tiVar.X1 == z10) {
            return;
        }
        tiVar.w1(z10, true);
        chatAttachAlertPhotoLayout.e1.a(!chatAttachAlertPhotoLayout.b.X1, true);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void G() {
        xl xlVar = this.b.F;
        int childCount = xlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = xlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.r5) {
                ((org.telegram.ui.Cells.r5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void X(int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout, i7);
        if (P != null) {
            P.getImageView().r();
            org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 == null) {
                return;
            }
            int i10 = e02.C;
            String str = e02.I;
            if (e02.g != null) {
                P.getImageView().h(e02.g, null, org.telegram.ui.ActionBar.n6.R4);
                return;
            }
            if (e02.c != null) {
                P.getImageView().h(e02.c, null, org.telegram.ui.ActionBar.n6.R4);
                return;
            }
            if (str == null) {
                P.getImageView().setImageDrawable(org.telegram.ui.ActionBar.n6.R4);
                return;
            }
            P.getImageView().s(e02.J, e02.K, true);
            if (e02.b) {
                P.getImageView().h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
                return;
            }
            P.getImageView().h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.n6.R4);
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final long a() {
        org.telegram.ui.ActionBar.g2 g2Var = this.b.b.a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            return ((org.telegram.ui.bn) g2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void a0(int i7) {
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(this.b, i7);
        if (P != null) {
            P.g(true);
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.ef) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                    charSequence2 = efVar.a;
                    arrayList = efVar.n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.hf) {
                    org.telegram.messenger.hf hfVar = (org.telegram.messenger.hf) obj;
                    charSequence2 = hfVar.I;
                    arrayList = hfVar.n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    CharSequence spannableStringBuilder = !(charSequence2 instanceof Spannable) ? new SpannableStringBuilder(charSequence2) : charSequence2;
                    org.telegram.messenger.fj.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.b.b.b1().setText(x5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.messenger.hc j(int i7) {
        org.telegram.ui.Cells.r5 P = ChatAttachAlertPhotoLayout.P(this.b, i7);
        if (P != null) {
            return P.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean l() {
        ti tiVar = this.b.b;
        return tiVar != null && (tiVar.a2 instanceof org.telegram.ui.bn);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ti tiVar = chatAttachAlertPhotoLayout.b;
        tiVar.t4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.r1;
        org.telegram.messenger.ef e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.s = d20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.T(e02, -1);
        }
        if (tiVar.P0(tiVar.b1().getText())) {
            return;
        }
        tiVar.N0();
        if (PhotoViewer.p1().v7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
            if (!hashMap.isEmpty()) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Object obj = hashMap.get(arrayList.get(i12));
                    if (obj instanceof org.telegram.messenger.ef) {
                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                        if (i12 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.p1().w7};
                            efVar.n = org.telegram.messenger.ri.d0(org.telegram.messenger.i10.t0).Y(charSequenceArr, false, true);
                            CharSequence charSequence = charSequenceArr[0];
                            efVar.a = charSequence;
                            if (tiVar.P0(charSequence)) {
                                return;
                            }
                        } else {
                            efVar.a = null;
                        }
                    }
                }
            }
        }
        if (tiVar != null) {
            tiVar.G3 = false;
        }
        PhotoViewer.p1();
        PhotoViewer.p1().P = false;
        PhotoViewer.p1().v2 = false;
        b5.X(tiVar.H3, tiVar.Y0() + ChatAttachAlertPhotoLayout.t1.size(), tiVar.c1(), new tl(this, z10, i10, z11));
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean q() {
        ti tiVar = this.b.b;
        return (tiVar == null || tiVar.F3 == null) ? false : true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        this.b.s0(-1, false);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean w() {
        org.telegram.messenger.fj fjVar;
        ti tiVar = this.b.b;
        return (tiVar == null || (fjVar = tiVar.F3) == null || !fjVar.p5()) ? false : true;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean z() {
        ti tiVar = this.b.b;
        return (tiVar.A1 || tiVar.C1) ? false : true;
    }
}
