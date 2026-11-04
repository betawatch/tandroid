package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class ol extends org.telegram.ui.eq0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int H() {
        return ChatAttachAlertPhotoLayout.t1.size();
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean O() {
        bi biVar = this.a.b;
        return biVar != null && biVar.a2;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int S(int i3) {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        org.telegram.messenger.ye e02 = this.a.e0(i3);
        if (e02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(e02.C));
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.u1;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final int k(int i3, org.telegram.messenger.b20 b20Var) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        il ilVar = chatAttachAlertPhotoLayout.r;
        il ilVar2 = chatAttachAlertPhotoLayout.F;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (biVar.N3 < 0 || ChatAttachAlertPhotoLayout.t1.size() < biVar.N3 || x(i3)) {
            boolean z11 = ChatAttachAlertPhotoLayout.r1;
            org.telegram.messenger.ye e02 = chatAttachAlertPhotoLayout.e0(i3);
            if (e02 != null && !chatAttachAlertPhotoLayout.a0(e02)) {
                if (ChatAttachAlertPhotoLayout.t1.size() + 1 <= ChatAttachAlertPhotoLayout.Q(chatAttachAlertPhotoLayout)) {
                    int S = chatAttachAlertPhotoLayout.S(e02, -1);
                    if (S == -1) {
                        S = ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(e02.C));
                        z10 = true;
                    } else {
                        e02.s = null;
                        z10 = false;
                    }
                    e02.s = b20Var;
                    int childCount = ilVar2.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        }
                        View childAt = ilVar2.getChildAt(i10);
                        if (!(childAt instanceof org.telegram.ui.Cells.q5) || ((Integer) childAt.getTag()).intValue() != i3) {
                            i10++;
                        } else if ((biVar.X1 instanceof org.telegram.ui.wm) && biVar.O3) {
                            ((org.telegram.ui.Cells.q5) childAt).b(S, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.q5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = ilVar.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount2) {
                            break;
                        }
                        View childAt2 = ilVar.getChildAt(i11);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.q5) || ((Integer) childAt2.getTag()).intValue() != i3) {
                            i11++;
                        } else if ((biVar.X1 instanceof org.telegram.ui.wm) && biVar.O3) {
                            ((org.telegram.ui.Cells.q5) childAt2).b(S, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.q5) childAt2).b(-1, z10, false);
                        }
                    }
                    biVar.K1(z10 ? 1 : 2);
                    return S;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        this.a.y0();
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean x(int i3) {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        org.telegram.messenger.ye e02 = this.a.e0(i3);
        return e02 != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(e02.C));
    }
}
