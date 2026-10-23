package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class d10 extends org.telegram.ui.Components.im0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ i10 v;

    public d10(i10 i10Var, Context context, int i10) {
        this.v = i10Var;
        this.r = context;
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.ul0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.ul0
    public final void G(org.telegram.ui.Components.mm0 mm0Var, float f7, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.im0
    public final int M(int i10) {
        i10 i10Var = this.v;
        if (i10 < i10Var.n.size()) {
            return ((ArrayList) i10Var.r.get(i10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.im0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.im0
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

    @Override // org.telegram.ui.Components.im0
    public final int R() {
        i10 i10Var = this.v;
        int i10 = 0;
        if (i10Var.n.isEmpty()) {
            return 0;
        }
        int size = i10Var.n.size();
        if (!i10Var.n.isEmpty() && !i10Var.N) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.im0
    public final View T(int i10, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.u3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
        }
        if (i10 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i10 < this.v.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) r1.r.get((String) r1.n.get(i10))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean V(int i10, int i11, s4.b1 b1Var) {
        return i10 == 0 || i11 != 0;
    }

    @Override // org.telegram.ui.Components.im0
    public final void W(int i10, int i11, s4.b1 b1Var) {
        boolean z10;
        i10 i10Var = this.v;
        ArrayList arrayList = i10Var.n;
        int i12 = b1Var.f;
        View view = b1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) i10Var.r.get((String) arrayList.get(i10));
            int i13 = b1Var.f;
            boolean z11 = false;
            if (i13 == 0) {
                ((org.telegram.ui.Cells.u3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            boolean z12 = true;
            if (i13 != 1) {
                if (i13 != 3) {
                    return;
                }
                if (i10 != 0) {
                    i11--;
                }
                org.telegram.ui.Cells.j7 j7Var = (org.telegram.ui.Cells.j7) view;
                MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                boolean z13 = j7Var.getMessage() != null && j7Var.getMessage().getId() == messageObject.getId();
                if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && i10Var.M)) {
                    z11 = true;
                }
                j7Var.f(messageObject, z11);
                j7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, j7Var, messageObject, z13, 3));
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.k7 k7Var = (org.telegram.ui.Cells.k7) view;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
            if (k7Var.getMessage() == null || k7Var.getMessage().getId() != messageObject2.getId()) {
                z10 = false;
            } else {
                z10 = false;
                z11 = true;
            }
            if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !i10Var.M)) {
                z12 = z10;
            }
            k7Var.c(messageObject2, z12);
            k7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.lk(this, k7Var, messageObject2, z11, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.r;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.u3(context, null);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.k7(context, 2, null);
        } else {
            if (i10 != 2) {
                frameLayout2 = new c10(this, context);
                return com.google.android.gms.internal.play_billing.k3.l(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(context, null);
            int i11 = this.s;
            if (i11 == 2 || i11 == 4) {
                b10Var.setViewType(4);
            } else {
                b10Var.setViewType(3);
            }
            b10Var.setIsSingleCell(true);
            frameLayout = b10Var;
        }
        frameLayout2 = frameLayout;
        return com.google.android.gms.internal.play_billing.k3.l(frameLayout2, frameLayout2, -1, -2);
    }
}
