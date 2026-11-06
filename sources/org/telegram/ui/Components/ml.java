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

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class ml extends pl {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean A() {
        di diVar = this.b.b;
        return diVar != null && diVar.T1;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void D() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.i3(new xf(this, 24), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.s1.size());
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final org.telegram.ui.vq0 E(org.telegram.messenger.ij ijVar, TLRPC.FileLocation fileLocation, int i7, boolean z9, boolean z10) {
        qs qsVar;
        org.telegram.ui.vq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        di diVar = chatAttachAlertPhotoLayout.b;
        if (z10 && (qsVar = diVar.L2) != null && (closeIntoObject = ((i30) qsVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i7);
        if (O == null) {
            return null;
        }
        int[] iArr = new int[2];
        O.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - diVar.S();
        }
        org.telegram.ui.vq0 vq0Var = new org.telegram.ui.vq0();
        vq0Var.b = iArr[0];
        vq0Var.c = iArr[1];
        vq0Var.d = chatAttachAlertPhotoLayout.E;
        ImageReceiver imageReceiver = O.getImageView().getImageReceiver();
        vq0Var.a = imageReceiver;
        vq0Var.e = imageReceiver.p();
        vq0Var.k = O.getScale();
        vq0Var.i = (int) diVar.Z0();
        O.g(false);
        return vq0Var;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void F(boolean z9) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        di diVar = chatAttachAlertPhotoLayout.b;
        if (diVar == null || diVar.T1 == z9) {
            return;
        }
        diVar.v1(z9, true);
        chatAttachAlertPhotoLayout.d1.a(!chatAttachAlertPhotoLayout.b.T1, true);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void G() {
        jl jlVar = this.b.E;
        int childCount = jlVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = jlVar.getChildAt(i7);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
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
                O.getImageView().h(e02.g, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            if (e02.c != null) {
                O.getImageView().h(e02.c, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            if (str == null) {
                O.getImageView().setImageDrawable(org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            O.getImageView().s(e02.J, e02.K, true);
            if (e02.b) {
                O.getImageView().h("vthumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
                return;
            }
            O.getImageView().h("thumb://" + i10 + ":" + str, null, org.telegram.ui.ActionBar.k6.R4);
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final long a() {
        org.telegram.ui.ActionBar.f2 f2Var = this.b.b.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            return ((org.telegram.ui.an) f2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void a0(int i7) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.b, i7);
        if (O != null) {
            O.g(true);
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void d() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
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
                this.b.b.a1().setText(r5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void i() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final org.telegram.messenger.jc j(int i7) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.b, i7);
        if (O != null) {
            return O.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean l() {
        di diVar = this.b.b;
        return diVar != null && (diVar.W1 instanceof org.telegram.ui.an);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        di diVar = chatAttachAlertPhotoLayout.b;
        diVar.p4 = true;
        boolean z11 = ChatAttachAlertPhotoLayout.q1;
        org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
        if (e02 != null) {
            e02.s = j20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.s1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.S(e02, -1);
        }
        if (diVar.O0(diVar.a1().getText())) {
            return;
        }
        diVar.M0();
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
                            if (diVar.O0(charSequence)) {
                                return;
                            }
                        } else {
                            gfVar.a = null;
                        }
                    }
                }
            }
        }
        if (diVar != null) {
            diVar.C3 = false;
        }
        PhotoViewer.p1();
        PhotoViewer.p1().O = false;
        PhotoViewer.p1().u2 = false;
        v4.X(diVar.D3, diVar.X0() + ChatAttachAlertPhotoLayout.s1.size(), diVar.b1(), new fl(this, z9, i10, z10));
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean q() {
        di diVar = this.b.b;
        return (diVar == null || diVar.B3 == null) ? false : true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void s() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        this.b.s0(-1, false);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean w() {
        org.telegram.messenger.ij ijVar;
        di diVar = this.b.b;
        return (diVar == null || (ijVar = diVar.B3) == null || !ijVar.q5()) ? false : true;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean z() {
        di diVar = this.b.b;
        return (diVar.w1 || diVar.y1) ? false : true;
    }
}
