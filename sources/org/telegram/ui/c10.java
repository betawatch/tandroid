package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c10 extends org.telegram.ui.Components.fl0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ h10 v;

    public c10(h10 h10Var, Context context, int i10) {
        this.v = h10Var;
        this.r = context;
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.tk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.tk0
    public final void G(org.telegram.ui.Components.jl0 jl0Var, float f9, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.fl0
    public final int M(int i10) {
        h10 h10Var = this.v;
        if (i10 < h10Var.n.size()) {
            return ((ArrayList) h10Var.r.get(h10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.fl0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.fl0
    public final int P(int i10, int i11) {
        if (i10 >= this.v.n.size()) {
            return 2;
        }
        if (i10 != 0 && i11 == 0) {
            return 0;
        }
        int i12 = this.s;
        return (i12 == 2 || i12 == 4) ? 3 : 1;
    }

    @Override // org.telegram.ui.Components.fl0
    public final int R() {
        h10 h10Var = this.v;
        int i10 = 0;
        if (h10Var.n.isEmpty()) {
            return 0;
        }
        int size = h10Var.n.size();
        if (!h10Var.n.isEmpty() && !h10Var.J) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.fl0
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.s3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < this.v.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) r1.r.get((String) r1.n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.fl0
    public final boolean V(int i10, int i11, f2.n1 n1Var) {
        return i10 == 0 || i11 != 0;
    }

    @Override // org.telegram.ui.Components.fl0
    public final void W(int i10, int i11, f2.n1 n1Var) {
        h10 h10Var = this.v;
        ArrayList arrayList = h10Var.n;
        int i12 = n1Var.f;
        View view = n1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) h10Var.r.get((String) arrayList.get(i10));
            int i13 = n1Var.f;
            boolean z10 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.s3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            boolean z11 = true;
            if (i13 != 1) {
                if (i13 != 3) {
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
                MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                boolean z12 = f7Var.getMessage() != null && f7Var.getMessage().getId() == messageObject.getId();
                if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && h10Var.I)) {
                    z10 = true;
                }
                f7Var.f(messageObject, z10);
                f7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.hk(this, f7Var, messageObject, z12, 3));
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.g7 g7Var = (org.telegram.ui.Cells.g7) view;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
            if (g7Var.getMessage() != null && g7Var.getMessage().getId() == messageObject2.getId()) {
                z10 = true;
            }
            if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !h10Var.I)) {
                z11 = false;
            }
            g7Var.c(messageObject2, z11);
            g7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.hk(this, g7Var, messageObject2, z10, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.r;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.s3(context, null);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.g7(context, 2, null);
        } else {
            if (i10 != 2) {
                frameLayout2 = new b10(this, context);
                return th.m(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(context, null);
            int i11 = this.s;
            if (i11 == 2 || i11 == 4) {
                p00Var.setViewType(4);
            } else {
                p00Var.setViewType(3);
            }
            p00Var.setIsSingleCell(true);
            frameLayout = p00Var;
        }
        frameLayout2 = frameLayout;
        return th.m(frameLayout2, frameLayout2, -1, -2);
    }
}
