package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a10 extends org.telegram.ui.Components.sk0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ f10 v;

    public a10(f10 f10Var, Context context, int i9) {
        this.v = f10Var;
        this.r = context;
        this.s = i9;
    }

    @Override // org.telegram.ui.Components.gk0
    public final String F(int i9) {
        return null;
    }

    @Override // org.telegram.ui.Components.gk0
    public final void G(org.telegram.ui.Components.wk0 wk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int M(int i9) {
        f10 f10Var = this.v;
        if (i9 < f10Var.n.size()) {
            return ((ArrayList) f10Var.r.get(f10Var.n.get(i9))).size() + (i9 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.sk0
    public final Object O(int i9, int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int P(int i9, int i10) {
        if (i9 >= this.v.n.size()) {
            return 2;
        }
        if (i9 != 0 && i10 == 0) {
            return 0;
        }
        int i11 = this.s;
        return (i11 == 2 || i11 == 4) ? 3 : 1;
    }

    @Override // org.telegram.ui.Components.sk0
    public final int R() {
        f10 f10Var = this.v;
        int i9 = 0;
        if (f10Var.n.isEmpty()) {
            return 0;
        }
        int size = f10Var.n.size();
        if (!f10Var.n.isEmpty() && !f10Var.J) {
            i9 = 1;
        }
        return size + i9;
    }

    @Override // org.telegram.ui.Components.sk0
    public final View T(int i9, View view) {
        if (view == null) {
            view = new org.telegram.ui.Cells.v3(this.r, null);
            view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.e7, false) & (-218103809));
        }
        if (i9 == 0) {
            view.setAlpha(0.0f);
            return view;
        }
        if (i9 < this.v.n.size()) {
            view.setAlpha(1.0f);
            ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) ((ArrayList) r1.r.get((String) r1.n.get(i9))).get(0)).messageOwner.date));
        }
        return view;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean V(int i9, int i10, f2.q1 q1Var) {
        return i9 == 0 || i10 != 0;
    }

    @Override // org.telegram.ui.Components.sk0
    public final void W(int i9, int i10, f2.q1 q1Var) {
        f10 f10Var = this.v;
        ArrayList arrayList = f10Var.n;
        int i11 = q1Var.f;
        View view = q1Var.a;
        if (i11 != 2) {
            ArrayList arrayList2 = (ArrayList) f10Var.r.get((String) arrayList.get(i9));
            int i12 = q1Var.f;
            boolean z10 = false;
            if (i12 == 0) {
                ((org.telegram.ui.Cells.v3) view).setText(LocaleController.formatSectionDate(((MessageObject) arrayList2.get(0)).messageOwner.date));
                return;
            }
            boolean z11 = true;
            if (i12 != 1) {
                if (i12 != 3) {
                    return;
                }
                if (i9 != 0) {
                    i10--;
                }
                org.telegram.ui.Cells.h7 h7Var = (org.telegram.ui.Cells.h7) view;
                MessageObject messageObject = (MessageObject) arrayList2.get(i10);
                boolean z12 = h7Var.getMessage() != null && h7Var.getMessage().getId() == messageObject.getId();
                if (i10 != arrayList2.size() - 1 || (i9 == arrayList.size() - 1 && f10Var.I)) {
                    z10 = true;
                }
                h7Var.f(messageObject, z10);
                h7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.dk(this, h7Var, messageObject, z12, 3));
                return;
            }
            if (i9 != 0) {
                i10--;
            }
            org.telegram.ui.Cells.i7 i7Var = (org.telegram.ui.Cells.i7) view;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i10);
            if (i7Var.getMessage() != null && i7Var.getMessage().getId() == messageObject2.getId()) {
                z10 = true;
            }
            if (i10 == arrayList2.size() - 1 && (i9 != arrayList.size() - 1 || !f10Var.I)) {
                z11 = false;
            }
            i7Var.c(messageObject2, z11);
            i7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.dk(this, i7Var, messageObject2, z10, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.r;
        if (i9 == 0) {
            frameLayout = new org.telegram.ui.Cells.v3(context, null);
        } else if (i9 == 1) {
            frameLayout = new org.telegram.ui.Cells.i7(context, 2, null);
        } else {
            if (i9 != 2) {
                frameLayout2 = new z00(this, context);
                return j3.r0.s(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(context, null);
            int i10 = this.s;
            if (i10 == 2 || i10 == 4) {
                e00Var.setViewType(4);
            } else {
                e00Var.setViewType(3);
            }
            e00Var.setIsSingleCell(true);
            frameLayout = e00Var;
        }
        frameLayout2 = frameLayout;
        return j3.r0.s(frameLayout2, frameLayout2, -1, -2);
    }
}
