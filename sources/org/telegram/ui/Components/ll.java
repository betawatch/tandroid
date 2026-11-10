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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ll extends ol {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean A() {
        ci ciVar = this.b.b;
        return ciVar != null && ciVar.W1;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void D() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.i3(new wf(this, 24), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.s1.size());
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final org.telegram.ui.zq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        ps psVar;
        org.telegram.ui.zq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ci ciVar = chatAttachAlertPhotoLayout.b;
        if (z10 && (psVar = ciVar.O2) != null && (closeIntoObject = ((i30) psVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i7);
        if (O == null) {
            return null;
        }
        int[] iArr = new int[2];
        O.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - ciVar.S();
        }
        org.telegram.ui.zq0 zq0Var = new org.telegram.ui.zq0();
        zq0Var.b = iArr[0];
        zq0Var.c = iArr[1];
        zq0Var.d = chatAttachAlertPhotoLayout.E;
        ImageReceiver imageReceiver = O.getImageView().getImageReceiver();
        zq0Var.a = imageReceiver;
        zq0Var.e = imageReceiver.p();
        zq0Var.k = O.getScale();
        zq0Var.i = (int) ciVar.Z0();
        O.g(false);
        return zq0Var;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void F(boolean z9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ci ciVar = chatAttachAlertPhotoLayout.b;
        if (ciVar == null || ciVar.W1 == z9) {
            return;
        }
        ciVar.v1(z9, true);
        chatAttachAlertPhotoLayout.d1.a(!chatAttachAlertPhotoLayout.b.W1, true);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void G() {
        il ilVar = this.b.E;
        int childCount = ilVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = ilVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void X(int i7) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i7);
        if (O != null) {
            O.getImageView().r();
            org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 == null) {
                return;
            }
            int i10 = e02.C;
            String str = e02.I;
            if (e02.g != null) {
                O.getImageView().h(e02.g, null, org.telegram.ui.ActionBar.m6.R4);
                return;
            }
            if (e02.c != null) {
                O.getImageView().h(e02.c, null, org.telegram.ui.ActionBar.m6.R4);
                return;
            }
            if (str == null) {
                O.getImageView().setImageDrawable(org.telegram.ui.ActionBar.m6.R4);
                return;
            }
            O.getImageView().s(e02.J, e02.K, true);
            if (e02.b) {
                O.getImageView().h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.m6.R4);
                return;
            }
            O.getImageView().h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.m6.R4);
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final long a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.b.b.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            return ((org.telegram.ui.cn) f2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void a0(int i7) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.b, i7);
        if (O != null) {
            O.g(true);
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void d() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.t1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.gf) {
                    org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                    charSequence2 = gfVar.a;
                    arrayList = gfVar.n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.kf) {
                    org.telegram.messenger.kf kfVar = (org.telegram.messenger.kf) obj;
                    charSequence2 = kfVar.I;
                    arrayList = kfVar.n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    CharSequence spannableStringBuilder = !(charSequence2 instanceof Spannable) ? new SpannableStringBuilder(charSequence2) : charSequence2;
                    org.telegram.messenger.ij.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.b.b.a1().setText(q5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void i() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.b, i7);
        if (O != null) {
            return O.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean l() {
        ci ciVar = this.b.b;
        return ciVar != null && (ciVar.Z1 instanceof org.telegram.ui.cn);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        ci ciVar = chatAttachAlertPhotoLayout.b;
        ciVar.s4 = true;
        boolean z11 = ChatAttachAlertPhotoLayout.q1;
        org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.s = j20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.S(e02, -1);
        }
        if (ciVar.O0(ciVar.a1().getText())) {
            return;
        }
        ciVar.M0();
        if (PhotoViewer.p1().o7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.t1;
            if (!hashMap.isEmpty()) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Object obj = hashMap.get(arrayList.get(i12));
                    if (obj instanceof org.telegram.messenger.gf) {
                        org.telegram.messenger.gf gfVar = (org.telegram.messenger.gf) obj;
                        if (i12 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.p1().p7};
                            gfVar.n = org.telegram.messenger.ui.b0(org.telegram.messenger.p10.s0).W(charSequenceArr, false, true);
                            CharSequence charSequence = charSequenceArr[0];
                            gfVar.a = charSequence;
                            if (ciVar.O0(charSequence)) {
                                return;
                            }
                        } else {
                            gfVar.a = null;
                        }
                    }
                }
            }
        }
        if (ciVar != null) {
            ciVar.F3 = false;
        }
        PhotoViewer.p1();
        PhotoViewer.p1().O = false;
        PhotoViewer.p1().u2 = false;
        u4.X(ciVar.G3, ciVar.X0() + ChatAttachAlertPhotoLayout.s1.size(), ciVar.b1(), new el(this, z9, i10, z10));
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean q() {
        ci ciVar = this.b.b;
        return (ciVar == null || ciVar.E3 == null) ? false : true;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void s() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        this.b.s0(-1, false);
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean w() {
        org.telegram.messenger.ij ijVar;
        ci ciVar = this.b.b;
        return (ciVar == null || (ijVar = ciVar.E3) == null || !ijVar.p5()) ? false : true;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean z() {
        ci ciVar = this.b.b;
        return (ciVar.z1 || ciVar.B1) ? false : true;
    }
}
