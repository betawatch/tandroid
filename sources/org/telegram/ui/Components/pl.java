package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class pl extends org.telegram.ui.nq0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public pl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int H() {
        return ChatAttachAlertPhotoLayout.s1.size();
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean O() {
        di diVar = this.a.b;
        return diVar != null && diVar.Z1;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int S(int i7) {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        org.telegram.messenger.gf e02 = this.a.e0(i7);
        if (e02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(e02.C));
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        boolean z9;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        jl jlVar = chatAttachAlertPhotoLayout.r;
        jl jlVar2 = chatAttachAlertPhotoLayout.E;
        di diVar = chatAttachAlertPhotoLayout.b;
        if (diVar.M3 < 0 || ChatAttachAlertPhotoLayout.s1.size() < diVar.M3 || x(i7)) {
            boolean z10 = ChatAttachAlertPhotoLayout.q1;
            org.telegram.messenger.gf e02 = chatAttachAlertPhotoLayout.e0(i7);
            if (e02 != null && !chatAttachAlertPhotoLayout.a0(e02)) {
                if (ChatAttachAlertPhotoLayout.s1.size() + 1 <= ChatAttachAlertPhotoLayout.Q(chatAttachAlertPhotoLayout)) {
                    int S = chatAttachAlertPhotoLayout.S(e02, -1);
                    if (S == -1) {
                        S = ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(e02.C));
                        z9 = true;
                    } else {
                        e02.s = null;
                        z9 = false;
                    }
                    e02.s = j20Var;
                    int childCount = jlVar2.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        }
                        View childAt = jlVar2.getChildAt(i10);
                        if (!(childAt instanceof org.telegram.ui.Cells.q5) || ((Integer) childAt.getTag()).intValue() != i7) {
                            i10++;
                        } else if ((diVar.W1 instanceof org.telegram.ui.an) && diVar.N3) {
                            ((org.telegram.ui.Cells.q5) childAt).b(S, z9, false);
                        } else {
                            ((org.telegram.ui.Cells.q5) childAt).b(-1, z9, false);
                        }
                    }
                    int childCount2 = jlVar.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount2) {
                            break;
                        }
                        View childAt2 = jlVar.getChildAt(i11);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.q5) || ((Integer) childAt2.getTag()).intValue() != i7) {
                            i11++;
                        } else if ((diVar.W1 instanceof org.telegram.ui.an) && diVar.N3) {
                            ((org.telegram.ui.Cells.q5) childAt2).b(S, z9, false);
                        } else {
                            ((org.telegram.ui.Cells.q5) childAt2).b(-1, z9, false);
                        }
                    }
                    diVar.K1(z9 ? 1 : 2);
                    return S;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void m() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        this.a.y0();
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.s1;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final boolean x(int i7) {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        org.telegram.messenger.gf e02 = this.a.e0(i7);
        return e02 != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(e02.C));
    }
}
