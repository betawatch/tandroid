package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class xl extends org.telegram.ui.yr0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public xl(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int H() {
        return ChatAttachAlertPhotoLayout.s1.size();
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean O() {
        bi biVar = this.a.b;
        return biVar != null && biVar.Z1;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int S(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        org.telegram.messenger.ef c02 = this.a.c0(i10);
        if (c02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(c02.C));
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final int k(int i10, org.telegram.messenger.x20 x20Var) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        pl plVar = chatAttachAlertPhotoLayout.r;
        pl plVar2 = chatAttachAlertPhotoLayout.E;
        bi biVar = chatAttachAlertPhotoLayout.b;
        if (biVar.M3 < 0 || ChatAttachAlertPhotoLayout.s1.size() < biVar.M3 || x(i10)) {
            boolean z11 = ChatAttachAlertPhotoLayout.q1;
            org.telegram.messenger.ef c02 = chatAttachAlertPhotoLayout.c0(i10);
            if (c02 != null && !chatAttachAlertPhotoLayout.Y(c02)) {
                if (ChatAttachAlertPhotoLayout.s1.size() + 1 <= ChatAttachAlertPhotoLayout.P(chatAttachAlertPhotoLayout)) {
                    int R = chatAttachAlertPhotoLayout.R(c02, -1);
                    if (R == -1) {
                        R = ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(c02.C));
                        z10 = true;
                    } else {
                        c02.s = null;
                        z10 = false;
                    }
                    c02.s = x20Var;
                    int childCount = plVar2.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount) {
                            break;
                        }
                        View childAt = plVar2.getChildAt(i11);
                        if (!(childAt instanceof org.telegram.ui.Cells.v5) || ((Integer) childAt.getTag()).intValue() != i10) {
                            i11++;
                        } else if ((biVar.W1 instanceof org.telegram.ui.un) && biVar.N3) {
                            ((org.telegram.ui.Cells.v5) childAt).b(R, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.v5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = plVar.getChildCount();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= childCount2) {
                            break;
                        }
                        View childAt2 = plVar.getChildAt(i12);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.v5) || ((Integer) childAt2.getTag()).intValue() != i10) {
                            i12++;
                        } else if ((biVar.W1 instanceof org.telegram.ui.un) && biVar.N3) {
                            ((org.telegram.ui.Cells.v5) childAt2).b(R, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.v5) childAt2).b(-1, z10, false);
                        }
                    }
                    biVar.J1(z10 ? 1 : 2);
                    return R;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        this.a.w0();
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.s1;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean x(int i10) {
        boolean z10 = ChatAttachAlertPhotoLayout.q1;
        org.telegram.messenger.ef c02 = this.a.c0(i10);
        return c02 != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(c02.C));
    }
}
