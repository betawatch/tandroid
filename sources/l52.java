// default package

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class l52 extends q52 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        super(chatAttachAlertPhotoLayout);
        this.b = chatAttachAlertPhotoLayout;
    }

    @Override // yc8, ed8
    public final void C() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.o0();
        hl.d3(new go1(this, (byte) 22), 150L);
        chatAttachAlertPhotoLayout.E(ChatAttachAlertPhotoLayout.t1.size());
    }

    @Override // yc8, ed8
    public final void E(boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        if (n12Var == null || n12Var.W1 == z) {
            return;
        }
        n12Var.r1(z, true);
        chatAttachAlertPhotoLayout.e1.a(!n12Var.W1, true);
    }

    @Override // yc8, ed8
    public final void F() {
        i52 i52Var = this.b.F;
        int childCount = i52Var.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = i52Var.getChildAt(i);
            if (childAt instanceof d88) {
                ((d88) childAt).g(true);
            }
        }
    }

    @Override // yc8, ed8
    public final void L(int i, oec oecVar, boolean z, int i2, int i3, boolean z2) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        n12Var.s4 = true;
        boolean z3 = ChatAttachAlertPhotoLayout.r1;
        no6 c0 = chatAttachAlertPhotoLayout.c0(i);
        if (c0 != null) {
            c0.s = oecVar;
        }
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.isEmpty() && c0 != null) {
            chatAttachAlertPhotoLayout.Q(c0, -1);
        }
        if (n12Var.H0(n12Var.V0().getText())) {
            return;
        }
        n12Var.F0();
        if (PhotoViewer.q0().u7) {
            ArrayList arrayList = ChatAttachAlertPhotoLayout.u1;
            if (!hashMap.isEmpty()) {
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    Object obj = hashMap.get(arrayList.get(i4));
                    if (obj instanceof no6) {
                        no6 no6Var = (no6) obj;
                        if (i4 == 0) {
                            CharSequence[] charSequenceArr = {PhotoViewer.q0().v7};
                            no6Var.n = ls6.d0(yac.t0).Y(charSequenceArr, false, true);
                            CharSequence charSequence = charSequenceArr[0];
                            no6Var.a = charSequence;
                            if (n12Var.H0(charSequence)) {
                                return;
                            }
                        } else {
                            no6Var.a = null;
                        }
                    }
                }
            }
        }
        if (n12Var != null) {
            n12Var.F3 = false;
        }
        PhotoViewer.q0();
        PhotoViewer.q0().P = false;
        PhotoViewer.q0().v2 = false;
        jj.X(n12Var.G3, n12Var.W0(), n12Var.S0() + ChatAttachAlertPhotoLayout.t1.size(), new d52(this, z, i2, z2));
    }

    @Override // yc8, ed8
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        yf0 yf0Var;
        fd8 closeIntoObject;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        if (z2 && (yf0Var = n12Var.O2) != null && (closeIntoObject = ((yn5) yf0Var.b).getCloseIntoObject()) != null) {
            return closeIntoObject;
        }
        boolean z3 = ChatAttachAlertPhotoLayout.r1;
        d88 b0 = chatAttachAlertPhotoLayout.b0(i);
        if (b0 == null) {
            return null;
        }
        int[] iArr = new int[2];
        b0.getImageView().getLocationInWindow(iArr);
        if (Build.VERSION.SDK_INT < 26) {
            iArr[0] = iArr[0] - n12Var.Q();
        }
        fd8 fd8Var = new fd8();
        fd8Var.b = iArr[0];
        fd8Var.c = iArr[1];
        fd8Var.d = chatAttachAlertPhotoLayout.F;
        ImageReceiver imageReceiver = b0.getImageView().getImageReceiver();
        fd8Var.a = imageReceiver;
        fd8Var.e = imageReceiver.p();
        fd8Var.k = b0.getScale();
        fd8Var.i = (int) n12Var.U0();
        b0.g(false);
        return fd8Var;
    }

    @Override // yc8, ed8
    public final void X(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        d88 b0 = chatAttachAlertPhotoLayout.b0(i);
        if (b0 != null) {
            b0.getImageView().q();
            no6 c0 = chatAttachAlertPhotoLayout.c0(i);
            if (c0 != null) {
                int i2 = c0.C;
                String str = c0.I;
                if (c0.g != null) {
                    b0.getImageView().o(c0.g, null, aob.R4);
                    return;
                }
                if (c0.c != null) {
                    b0.getImageView().o(c0.c, null, aob.R4);
                    return;
                }
                if (str == null) {
                    b0.getImageView().setImageDrawable(aob.R4);
                    return;
                }
                b0.getImageView().r(c0.J, c0.K, true);
                if (c0.b) {
                    b0.getImageView().o(dze.d("vthumb://", i2, ":", str), null, aob.R4);
                } else {
                    b0.getImageView().o(dze.d("thumb://", i2, ":", str), null, aob.R4);
                }
            }
        }
    }

    @Override // yc8, ed8
    public final long a() {
        e eVar = this.b.b.Z1;
        if (eVar instanceof zu1) {
            return ((zu1) eVar).a();
        }
        return 0L;
    }

    @Override // yc8, ed8
    public final void b0(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        d88 b0 = this.b.b0(i);
        if (b0 != null) {
            b0.g(true);
        }
    }

    @Override // yc8, ed8
    public final void e() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.b;
        chatAttachAlertPhotoLayout.m0();
        chatAttachAlertPhotoLayout.r0(-1, true);
    }

    @Override // yc8, ed8
    public final void f(CharSequence charSequence) {
        CharSequence charSequence2;
        ArrayList arrayList;
        HashMap hashMap = ChatAttachAlertPhotoLayout.t1;
        if (hashMap.size() > 0) {
            ArrayList arrayList2 = ChatAttachAlertPhotoLayout.u1;
            if (arrayList2.size() > 0) {
                Object obj = hashMap.get(arrayList2.get(0));
                if (obj instanceof no6) {
                    no6 no6Var = (no6) obj;
                    charSequence2 = no6Var.a;
                    arrayList = no6Var.n;
                } else {
                    charSequence2 = null;
                    arrayList = null;
                }
                if (obj instanceof ro6) {
                    ro6 ro6Var = (ro6) obj;
                    charSequence2 = ro6Var.I;
                    arrayList = ro6Var.n;
                }
                ArrayList arrayList3 = arrayList;
                if (charSequence2 != null && arrayList3 != null) {
                    CharSequence spannableStringBuilder = !(charSequence2 instanceof Spannable) ? new SpannableStringBuilder(charSequence2) : charSequence2;
                    r47.b(spannableStringBuilder, arrayList3, false, false, false, false, 0);
                    charSequence2 = spannableStringBuilder;
                }
                this.b.b.V0().setText(hm.cloneSpans(charSequence2, 3));
            }
        }
    }

    @Override // yc8, ed8
    public final void j() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
    }

    @Override // yc8, ed8
    public final mn5 k(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        d88 b0 = this.b.b0(i);
        if (b0 != null) {
            return b0.getImageView().getImageReceiver().p();
        }
        return null;
    }

    @Override // yc8, ed8
    public final boolean l() {
        n12 n12Var = this.b.b;
        return n12Var != null && (n12Var.Z1 instanceof zu1);
    }

    @Override // yc8, ed8
    public final boolean p() {
        n12 n12Var = this.b.b;
        return (n12Var == null || n12Var.E3 == null) ? false : true;
    }

    @Override // yc8, ed8
    public final void r() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        this.b.r0(-1, false);
    }

    @Override // yc8, ed8
    public final boolean v() {
        r47 r47Var;
        n12 n12Var = this.b.b;
        return (n12Var == null || (r47Var = n12Var.E3) == null || !r47Var.o5()) ? false : true;
    }

    @Override // yc8, ed8
    public final boolean y() {
        n12 n12Var = this.b.b;
        return (n12Var.z1 || n12Var.B1) ? false : true;
    }

    @Override // yc8, ed8
    public final boolean z() {
        n12 n12Var = this.b.b;
        return n12Var != null && n12Var.W1;
    }
}
