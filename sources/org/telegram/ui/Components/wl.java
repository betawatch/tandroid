package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class wl extends org.telegram.ui.mq0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public wl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int H() {
        return ChatAttachAlertPhotoLayout.t1.size();
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean O() {
        ki kiVar = this.a.b;
        return kiVar != null && kiVar.d2;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int S(int i7) {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        org.telegram.messenger.ff e02 = this.a.e0(i7);
        if (e02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(e02.C));
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.u1;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final int k(int i7, org.telegram.messenger.g20 g20Var) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        ql qlVar = chatAttachAlertPhotoLayout.r;
        ql qlVar2 = chatAttachAlertPhotoLayout.F;
        ki kiVar = chatAttachAlertPhotoLayout.b;
        if (kiVar.Q3 < 0 || ChatAttachAlertPhotoLayout.t1.size() < kiVar.Q3 || x(i7)) {
            boolean z11 = ChatAttachAlertPhotoLayout.r1;
            org.telegram.messenger.ff e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null && !chatAttachAlertPhotoLayout.a0(e02)) {
                if (ChatAttachAlertPhotoLayout.t1.size() + 1 <= ChatAttachAlertPhotoLayout.R(chatAttachAlertPhotoLayout)) {
                    int T = chatAttachAlertPhotoLayout.T(e02, -1);
                    if (T == -1) {
                        T = ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(e02.C));
                        z10 = true;
                    } else {
                        e02.s = null;
                        z10 = false;
                    }
                    e02.s = g20Var;
                    int childCount = qlVar2.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        }
                        View childAt = qlVar2.getChildAt(i10);
                        if (!(childAt instanceof org.telegram.ui.Cells.q5) || ((Integer) childAt.getTag()).intValue() != i7) {
                            i10++;
                        } else if ((kiVar.a2 instanceof org.telegram.ui.an) && kiVar.R3) {
                            ((org.telegram.ui.Cells.q5) childAt).b(T, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.q5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = qlVar.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount2) {
                            break;
                        }
                        View childAt2 = qlVar.getChildAt(i11);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.q5) || ((Integer) childAt2.getTag()).intValue() != i7) {
                            i11++;
                        } else if ((kiVar.a2 instanceof org.telegram.ui.an) && kiVar.R3) {
                            ((org.telegram.ui.Cells.q5) childAt2).b(T, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.q5) childAt2).b(-1, z10, false);
                        }
                    }
                    kiVar.K1(z10 ? 1 : 2);
                    return T;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        this.a.y0();
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean x(int i7) {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        org.telegram.messenger.ff e02 = this.a.e0(i7);
        return e02 != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(e02.C));
    }
}
