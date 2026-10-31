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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class sl extends xl {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean A() {
        bi biVar = this.b.b;
        return biVar != null && biVar.T1;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.n0();
        org.telegram.messenger.i0.h3(new tf(this, 25), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.s1.size());
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.ui.gs0 E(org.telegram.messenger.jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        ct ctVar;
        org.telegram.ui.gs0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (ctVar = biVar.L2) != null && (closeIntoObject = ((a40) ctVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N == null) {
            return null;
        }
        int[] iArr = new int[2];
        N.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - biVar.T();
        }
        org.telegram.ui.gs0 gs0Var = new org.telegram.ui.gs0();
        gs0Var.b = iArr[0];
        gs0Var.c = iArr[1];
        gs0Var.d = chatAttachAlertPhotoLayout.E;
        ImageReceiver imageReceiver = N.getImageView().getImageReceiver();
        gs0Var.a = imageReceiver;
        gs0Var.e = imageReceiver.p();
        gs0Var.k = N.getScale();
        gs0Var.i = (int) biVar.Y0();
        N.g(false);
        return gs0Var;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (biVar == null || biVar.T1 == z10) {
            return;
        }
        biVar.u1(z10, true);
        chatAttachAlertPhotoLayout.d1.a(!chatAttachAlertPhotoLayout.b.T1, true);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void G() {
        pl plVar = this.b.E;
        int childCount = plVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = plVar.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.v5) {
                ((org.telegram.ui.Cells.v5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void X(int i10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(chatAttachAlertPhotoLayout, i10);
        if (N != null) {
            N.getImageView().r();
            org.telegram.messenger.ef c02 = chatAttachAlertPhotoLayout.c0(i10);
            if (c02 == null) {
                return;
            }
            int i11 = c02.C;
            String str = c02.I;
            if (c02.g != null) {
                N.getImageView().h(c02.g, null, org.telegram.ui.ActionBar.t6.R4);
                return;
            }
            if (c02.c != null) {
                N.getImageView().h(c02.c, null, org.telegram.ui.ActionBar.t6.R4);
                return;
            }
            if (str == null) {
                N.getImageView().setImageDrawable(org.telegram.ui.ActionBar.t6.R4);
                return;
            }
            N.getImageView().s(c02.J, c02.K, true);
            if (c02.b) {
                N.getImageView().h("vthumb://" + i11 + ":" + str, null, org.telegram.ui.ActionBar.t6.R4);
                return;
            }
            N.getImageView().h("thumb://" + i11 + ":" + str, null, org.telegram.ui.ActionBar.t6.R4);
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final long a() {
        org.telegram.ui.ActionBar.k2 k2Var = this.b.b.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            return ((org.telegram.ui.un) k2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void a0(int i10) {
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(this.b, i10);
        if (N != null) {
            N.g(true);
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.l0();
        chatAttachAlertPhotoLayout.q0(-1, true);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
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
                    org.telegram.messenger.jj.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.b.b.Z0().setText(o5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final org.telegram.messenger.kc j(int i10) {
        org.telegram.ui.Cells.v5 N = ChatAttachAlertPhotoLayout.N(this.b, i10);
        if (N != null) {
            return N.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean l() {
        bi biVar = this.b.b;
        return biVar != null && (biVar.W1 instanceof org.telegram.ui.un);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        bi biVar = chatAttachAlertPhotoLayout.b;
        biVar.p4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.q1;
        org.telegram.messenger.ef c02 = chatAttachAlertPhotoLayout.c0(i10);
        if (c02 != null) {
            c02.s = x20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (hashMap.isEmpty() && c02 != null) {
            chatAttachAlertPhotoLayout.R(c02, -1);
        }
        if (biVar.O0(biVar.Z0().getText())) {
            return;
        }
        biVar.M0();
        if (PhotoViewer.v1().p7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
            if (!hashMap.isEmpty()) {
                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                    Object obj = hashMap.get(arrayList.get(i13));
                    if (obj instanceof org.telegram.messenger.ef) {
                        org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                        if (i13 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.v1().q7};
                            efVar.n = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.s0).W(charSequenceArr, false, true);
                            CharSequence charSequence = charSequenceArr[0];
                            efVar.a = charSequence;
                            if (biVar.O0(charSequence)) {
                                return;
                            }
                        } else {
                            efVar.a = null;
                        }
                    }
                }
            }
        }
        if (biVar != null) {
            biVar.C3 = false;
        }
        PhotoViewer.v1();
        PhotoViewer.v1().O = false;
        PhotoViewer.v1().u2 = false;
        s4.Z(biVar.D3, biVar.W0() + ChatAttachAlertPhotoLayout.s1.size(), biVar.a1(), new kl(this, z10, i11, z11));
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean q() {
        bi biVar = this.b.b;
        return (biVar == null || biVar.B3 == null) ? false : true;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.b.q0(-1, false);
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean w() {
        org.telegram.messenger.jj jjVar;
        bi biVar = this.b.b;
        return (biVar == null || (jjVar = biVar.B3) == null || !jjVar.p5()) ? false : true;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean z() {
        bi biVar = this.b.b;
        return (biVar.w1 || biVar.y1) ? false : true;
    }
}
