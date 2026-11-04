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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ll extends ol {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ll(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean A() {
        bi biVar = this.b.b;
        return biVar != null && biVar.U1;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void D() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.p0();
        org.telegram.messenger.g0.i3(new vf(this, 24), 150L);
        chatAttachAlertPhotoLayout.D(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.ui.mq0 E(org.telegram.messenger.zi ziVar, TLRPC.FileLocation fileLocation, int i3, boolean z10, boolean z11) {
        qs qsVar;
        org.telegram.ui.mq0 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (z11 && (qsVar = biVar.M2) != null && (closeIntoObject = ((e30) qsVar.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i3);
        if (O == null) {
            return null;
        }
        int[] iArr = new int[2];
        O.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - biVar.S();
        }
        org.telegram.ui.mq0 mq0Var = new org.telegram.ui.mq0();
        mq0Var.b = iArr[0];
        mq0Var.c = iArr[1];
        mq0Var.d = chatAttachAlertPhotoLayout.F;
        ImageReceiver imageReceiver = O.getImageView().getImageReceiver();
        mq0Var.a = imageReceiver;
        mq0Var.e = imageReceiver.p();
        mq0Var.k = O.getScale();
        mq0Var.i = (int) biVar.Z0();
        O.g(false);
        return mq0Var;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void F(boolean z10) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (biVar == null || biVar.U1 == z10) {
            return;
        }
        biVar.v1(z10, true);
        chatAttachAlertPhotoLayout.e1.a(!chatAttachAlertPhotoLayout.b.U1, true);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void G() {
        il ilVar = this.b.F;
        int childCount = ilVar.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = ilVar.getChildAt(i3);
            if (childAt instanceof org.telegram.ui.Cells.q5) {
                ((org.telegram.ui.Cells.q5) childAt).g(true);
            }
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void X(int i3) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(chatAttachAlertPhotoLayout, i3);
        if (O != null) {
            O.getImageView().r();
            org.telegram.messenger.ye e02 = chatAttachAlertPhotoLayout.e0(i3);
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

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final long a() {
        org.telegram.ui.ActionBar.d2 d2Var = this.b.b.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            return ((org.telegram.ui.wm) d2Var).a();
        }
        return 0L;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void a0(int i3) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.b, i3);
        if (O != null) {
            O.g(true);
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void d() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.n0();
        chatAttachAlertPhotoLayout.s0(-1, true);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void e(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof org.telegram.messenger.ye) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                    charSequence2 = yeVar.a;
                    arrayList = yeVar.n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof org.telegram.messenger.bf) {
                    org.telegram.messenger.bf bfVar = (org.telegram.messenger.bf) obj;
                    charSequence2 = bfVar.I;
                    arrayList = bfVar.n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    CharSequence spannableStringBuilder = !(charSequence2 instanceof Spannable) ? new SpannableStringBuilder(charSequence2) : charSequence2;
                    org.telegram.messenger.zi.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.b.b.a1().setText(p5.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void i() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final org.telegram.messenger.cc j(int i3) {
        org.telegram.ui.Cells.q5 O = ChatAttachAlertPhotoLayout.O(this.b, i3);
        if (O != null) {
            return O.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean l() {
        bi biVar = this.b.b;
        return biVar != null && (biVar.X1 instanceof org.telegram.ui.wm);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        bi biVar = chatAttachAlertPhotoLayout.b;
        biVar.q4 = true;
        boolean z12 = ChatAttachAlertPhotoLayout.r1;
        org.telegram.messenger.ye e02 = chatAttachAlertPhotoLayout.e0(i3);
        if (e02 != null) {
            e02.s = b20Var;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.isEmpty() && e02 != null) {
            chatAttachAlertPhotoLayout.S(e02, -1);
        }
        if (biVar.O0(biVar.a1().getText())) {
            return;
        }
        biVar.M0();
        if (PhotoViewer.v1().q7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
            if (!hashMap.isEmpty()) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    Object obj = hashMap.get(arrayList.get(i12));
                    if (obj instanceof org.telegram.messenger.ye) {
                        org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                        if (i12 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.v1().r7};
                            yeVar.n = org.telegram.messenger.li.b0(org.telegram.messenger.h10.t0).W(charSequenceArr, false, true);
                            CharSequence charSequence = charSequenceArr[0];
                            yeVar.a = charSequence;
                            if (biVar.O0(charSequence)) {
                                return;
                            }
                        } else {
                            yeVar.a = null;
                        }
                    }
                }
            }
        }
        if (biVar != null) {
            biVar.D3 = false;
        }
        PhotoViewer.v1();
        PhotoViewer.v1().P = false;
        PhotoViewer.v1().v2 = false;
        t4.Z(biVar.E3, biVar.X0() + ChatAttachAlertPhotoLayout.t1.size(), biVar.b1(), new el(this, z10, i10, z11));
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean q() {
        bi biVar = this.b.b;
        return (biVar == null || biVar.C3 == null) ? false : true;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void s() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        this.b.s0(-1, false);
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean w() {
        org.telegram.messenger.zi ziVar;
        bi biVar = this.b.b;
        return (biVar == null || (ziVar = biVar.C3) == null || !ziVar.q5()) ? false : true;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean z() {
        bi biVar = this.b.b;
        return (biVar.x1 || biVar.z1) ? false : true;
    }
}
