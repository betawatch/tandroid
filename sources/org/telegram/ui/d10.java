package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class d10 extends org.telegram.ui.Components.vk0 {
    public final Context r;
    public final int s;
    public final /* synthetic */ i10 v;

    public d10(i10 i10Var, Context context, int i10) {
        this.v = i10Var;
        this.r = context;
        this.s = i10;
    }

    @Override // org.telegram.ui.Components.jk0
    public final String F(int i10) {
        return null;
    }

    @Override // org.telegram.ui.Components.jk0
    public final void G(org.telegram.ui.Components.zk0 zk0Var, float f10, int[] iArr) {
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // org.telegram.ui.Components.vk0
    public final int M(int i10) {
        i10 i10Var = this.v;
        if (i10 < i10Var.n.size()) {
            return ((ArrayList) i10Var.r.get(i10Var.n.get(i10))).size() + (i10 == 0 ? 0 : 1);
        }
        return 1;
    }

    @Override // org.telegram.ui.Components.vk0
    public final Object O(int i10, int i11) {
        return null;
    }

    @Override // org.telegram.ui.Components.vk0
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

    @Override // org.telegram.ui.Components.vk0
    public final int R() {
        i10 i10Var = this.v;
        int i10 = 0;
        if (i10Var.n.isEmpty()) {
            return 0;
        }
        int size = i10Var.n.size();
        if (!i10Var.n.isEmpty() && !i10Var.J) {
            i10 = 1;
        }
        return size + i10;
    }

    @Override // org.telegram.ui.Components.vk0
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

    @Override // org.telegram.ui.Components.vk0
    public final boolean V(int i10, int i11, f2.o1 o1Var) {
        return i10 == 0 || i11 != 0;
    }

    @Override // org.telegram.ui.Components.vk0
    public final void W(int i10, int i11, f2.o1 o1Var) {
        i10 i10Var = this.v;
        ArrayList arrayList = i10Var.n;
        int i12 = o1Var.f;
        View view = o1Var.a;
        if (i12 != 2) {
            ArrayList arrayList2 = (ArrayList) i10Var.r.get((String) arrayList.get(i10));
            int i13 = o1Var.f;
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
                org.telegram.ui.Cells.e7 e7Var = (org.telegram.ui.Cells.e7) view;
                MessageObject messageObject = (MessageObject) arrayList2.get(i11);
                boolean z12 = e7Var.getMessage() != null && e7Var.getMessage().getId() == messageObject.getId();
                if (i11 != arrayList2.size() - 1 || (i10 == arrayList.size() - 1 && i10Var.I)) {
                    z10 = true;
                }
                e7Var.f(messageObject, z10);
                e7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.zj(this, e7Var, messageObject, z12, 3));
                return;
            }
            if (i10 != 0) {
                i11--;
            }
            org.telegram.ui.Cells.f7 f7Var = (org.telegram.ui.Cells.f7) view;
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
            if (f7Var.getMessage() != null && f7Var.getMessage().getId() == messageObject2.getId()) {
                z10 = true;
            }
            if (i11 == arrayList2.size() - 1 && (i10 != arrayList.size() - 1 || !i10Var.I)) {
                z11 = false;
            }
            f7Var.c(messageObject2, z11);
            f7Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.Components.zj(this, f7Var, messageObject2, z10, 2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.r;
        if (i10 == 0) {
            frameLayout = new org.telegram.ui.Cells.s3(context, null);
        } else if (i10 == 1) {
            frameLayout = new org.telegram.ui.Cells.f7(context, 2, null);
        } else {
            if (i10 != 2) {
                frameLayout2 = new c10(this, context);
                return org.telegram.ui.Cells.pa.l(frameLayout2, frameLayout2, -1, -2);
            }
            org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(context, null);
            int i11 = this.s;
            if (i11 == 2 || i11 == 4) {
                h00Var.setViewType(4);
            } else {
                h00Var.setViewType(3);
            }
            h00Var.setIsSingleCell(true);
            frameLayout = h00Var;
        }
        frameLayout2 = frameLayout;
        return org.telegram.ui.Cells.pa.l(frameLayout2, frameLayout2, -1, -2);
    }
}
