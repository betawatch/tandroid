package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public abstract class fm extends org.telegram.ui.oq0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public fm(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int H() {
        return ChatAttachAlertPhotoLayout.t1.size();
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean O() {
        ui uiVar = this.a.b;
        return uiVar != null && uiVar.d2;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int S(int i7) {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        org.telegram.messenger.ff e02 = this.a.e0(i7);
        if (e02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(e02.C));
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.u1;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final int k(int i7, org.telegram.messenger.f20 f20Var) {
        boolean z10;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        zl zlVar = chatAttachAlertPhotoLayout.r;
        zl zlVar2 = chatAttachAlertPhotoLayout.F;
        ui uiVar = chatAttachAlertPhotoLayout.b;
        if (uiVar.Q3 < 0 || ChatAttachAlertPhotoLayout.t1.size() < uiVar.Q3 || x(i7)) {
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
                    e02.s = f20Var;
                    int childCount = zlVar2.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        }
                        View childAt = zlVar2.getChildAt(i10);
                        if (!(childAt instanceof org.telegram.ui.Cells.s5) || ((Integer) childAt.getTag()).intValue() != i7) {
                            i10++;
                        } else if ((uiVar.a2 instanceof org.telegram.ui.bn) && uiVar.R3) {
                            ((org.telegram.ui.Cells.s5) childAt).b(T, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.s5) childAt).b(-1, z10, false);
                        }
                    }
                    int childCount2 = zlVar.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount2) {
                            break;
                        }
                        View childAt2 = zlVar.getChildAt(i11);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.s5) || ((Integer) childAt2.getTag()).intValue() != i7) {
                            i11++;
                        } else if ((uiVar.a2 instanceof org.telegram.ui.bn) && uiVar.R3) {
                            ((org.telegram.ui.Cells.s5) childAt2).b(T, z10, false);
                        } else {
                            ((org.telegram.ui.Cells.s5) childAt2).b(-1, z10, false);
                        }
                    }
                    uiVar.L1(z10 ? 1 : 2);
                    return T;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void m() {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        this.a.y0();
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean x(int i7) {
        boolean z10 = ChatAttachAlertPhotoLayout.r1;
        org.telegram.messenger.ff e02 = this.a.e0(i7);
        return e02 != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(e02.C));
    }
}
