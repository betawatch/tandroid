package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.a20;
import org.telegram.ui.c20;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class a20 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ c20 d;

    public a20(c20 c20Var, Context context) {
        this.d = c20Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        c20 c20Var = this.d;
        if (c20Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / c20Var.s)) + (!c20Var.N ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        c20 c20Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) c20Var.f.size()) / ((float) c20Var.s)))) ? 0 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        c20 c20Var = this.d;
        u10 u10Var = c20Var.S;
        ArrayList arrayList = c20Var.f;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / c20Var.s);
                    int i12 = c20Var.s;
                    ((org.telegram.ui.Components.f10) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.s2 s2Var = (org.telegram.ui.Cells.s2) view;
            s2Var.s2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = s2Var.getMessage() != null && s2Var.getMessage().getId() == messageObject.getId();
            s2Var.O = c20Var.p0;
            s2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!c20Var.o0.g()) {
                s2Var.V(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            u10Var.a = messageObject.getDialogId();
            u10Var.b = id2;
            s2Var.V(c20Var.o0.b(u10Var), z10);
            return;
        }
        org.telegram.ui.Cells.u7 u7Var = (org.telegram.ui.Cells.u7) view;
        u7Var.setItemsCount(c20Var.s);
        u7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = c20Var.s;
            if (i13 >= i14) {
                u7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                u7Var.c(i13, arrayList.indexOf(messageObject2), messageObject2);
                if (c20Var.o0.g()) {
                    int id3 = messageObject2.getId();
                    u10Var.a = messageObject2.getDialogId();
                    u10Var.b = id3;
                    u7Var.b(i13, c20Var.o0.b(u10Var));
                } else {
                    u7Var.b(i13, false);
                }
            } else {
                u7Var.c(i13, i15, null);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.f10, org.telegram.ui.q10] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.u7 u7Var = new org.telegram.ui.Cells.u7(context);
            Paint paint = new Paint();
            u7Var.n = paint;
            u7Var.s = UserConfig.selectedAccount;
            u7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Lh, false));
            u7Var.b = new MessageObject[6];
            u7Var.a = new org.telegram.ui.Cells.q7[6];
            u7Var.c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                u7Var.a[i11] = new org.telegram.ui.Cells.q7(u7Var, context);
                u7Var.addView(u7Var.a[i11]);
                u7Var.a[i11].setVisibility(4);
                u7Var.a[i11].setTag(Integer.valueOf(i11));
                u7Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(u7Var, 10));
                u7Var.a[i11].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.p7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        u7 u7Var2 = u7.this;
                        if (u7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        r7 r7Var = u7Var2.d;
                        int i12 = u7Var2.c[intValue];
                        MessageObject messageObject = u7Var2.b[intValue];
                        org.telegram.ui.g gVar = (org.telegram.ui.g) r7Var;
                        c20 c20Var = ((a20) gVar.b).d;
                        if (!c20Var.o0.g()) {
                            c20.a(c20Var, messageObject, u7Var2, intValue);
                            return true;
                        }
                        c20 c20Var2 = ((a20) gVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = c20.s0;
                        c20Var2.f(i12, u7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            u7Var.setDelegate(new g(this, 17));
            frameLayout = u7Var;
        } else {
            if (i10 != 2) {
                r62 = new q10(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return com.google.android.gms.internal.play_billing.k3.l(r62, r62, -1, -2);
            }
            FrameLayout v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.e7, false) & (-218103809));
            frameLayout = v3Var;
        }
        r62 = frameLayout;
        return com.google.android.gms.internal.play_billing.k3.l(r62, r62, -1, -2);
    }
}
