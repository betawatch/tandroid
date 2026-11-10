package org.telegram.ui.Components;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class ol extends org.telegram.ui.qq0 {
    public final /* synthetic */ ChatAttachAlertPhotoLayout a;

    public ol(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int H() {
        return ChatAttachAlertPhotoLayout.s1.size();
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean O() {
        ci ciVar = this.a.b;
        return ciVar != null && ciVar.c2;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int S(int i7) {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        org.telegram.messenger.gf e02 = this.a.e0(i7);
        if (e02 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.t1.indexOf(Integer.valueOf(e02.C));
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final ArrayList c() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final int k(int i7, org.telegram.messenger.j20 j20Var) {
        boolean z9;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        il ilVar = chatAttachAlertPhotoLayout.r;
        il ilVar2 = chatAttachAlertPhotoLayout.E;
        ci ciVar = chatAttachAlertPhotoLayout.b;
        if (ciVar.P3 < 0 || ChatAttachAlertPhotoLayout.s1.size() < ciVar.P3 || x(i7)) {
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
                    int childCount = ilVar2.getChildCount();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= childCount) {
                            break;
                        }
                        View childAt = ilVar2.getChildAt(i10);
                        if (!(childAt instanceof org.telegram.ui.Cells.q5) || ((Integer) childAt.getTag()).intValue() != i7) {
                            i10++;
                        } else if ((ciVar.Z1 instanceof org.telegram.ui.cn) && ciVar.Q3) {
                            ((org.telegram.ui.Cells.q5) childAt).b(S, z9, false);
                        } else {
                            ((org.telegram.ui.Cells.q5) childAt).b(-1, z9, false);
                        }
                    }
                    int childCount2 = ilVar.getChildCount();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= childCount2) {
                            break;
                        }
                        View childAt2 = ilVar.getChildAt(i11);
                        if (!(childAt2 instanceof org.telegram.ui.Cells.q5) || ((Integer) childAt2.getTag()).intValue() != i7) {
                            i11++;
                        } else if ((ciVar.Z1 instanceof org.telegram.ui.cn) && ciVar.Q3) {
                            ((org.telegram.ui.Cells.q5) childAt2).b(S, z9, false);
                        } else {
                            ((org.telegram.ui.Cells.q5) childAt2).b(-1, z9, false);
                        }
                    }
                    ciVar.K1(z9 ? 1 : 2);
                    return S;
                }
            }
        }
        return -1;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void m() {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        this.a.y0();
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final HashMap v() {
        return ChatAttachAlertPhotoLayout.s1;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean x(int i7) {
        boolean z9 = ChatAttachAlertPhotoLayout.q1;
        org.telegram.messenger.gf e02 = this.a.e0(i7);
        return e02 != null && ChatAttachAlertPhotoLayout.s1.containsKey(Integer.valueOf(e02.C));
    }
}
