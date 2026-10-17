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
import org.telegram.ui.e10;
import org.telegram.ui.g10;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class e10 extends org.telegram.ui.Components.hm0 {
    public final Context c;
    public final /* synthetic */ g10 d;

    public e10(g10 g10Var, Context context) {
        this.d = g10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        g10 g10Var = this.d;
        if (g10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / g10Var.s)) + (!g10Var.N ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        g10 g10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) g10Var.f.size()) / ((float) g10Var.s)))) ? 0 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        g10 g10Var = this.d;
        y00 y00Var = g10Var.S;
        ArrayList arrayList = g10Var.f;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / g10Var.s);
                    int i12 = g10Var.s;
                    ((org.telegram.ui.Components.b10) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            r2Var.s2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId();
            r2Var.O = g10Var.p0;
            r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!g10Var.o0.g()) {
                r2Var.V(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            y00Var.a = messageObject.getDialogId();
            y00Var.b = id2;
            r2Var.V(g10Var.o0.b(y00Var), z10);
            return;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.setItemsCount(g10Var.s);
        t7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = g10Var.s;
            if (i13 >= i14) {
                t7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                t7Var.c(messageObject2, i13, arrayList.indexOf(messageObject2));
                if (g10Var.o0.g()) {
                    int id3 = messageObject2.getId();
                    y00Var.a = messageObject2.getDialogId();
                    y00Var.b = id3;
                    t7Var.b(i13, g10Var.o0.b(y00Var));
                } else {
                    t7Var.b(i13, false);
                }
            } else {
                t7Var.c(null, i13, i15);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.b10, org.telegram.ui.u00] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.t7 t7Var = new org.telegram.ui.Cells.t7(context);
            Paint paint = new Paint();
            t7Var.n = paint;
            t7Var.s = UserConfig.selectedAccount;
            t7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Lh, false));
            t7Var.b = new MessageObject[6];
            t7Var.a = new org.telegram.ui.Cells.p7[6];
            t7Var.c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                t7Var.a[i11] = new org.telegram.ui.Cells.p7(t7Var, context);
                t7Var.addView(t7Var.a[i11]);
                t7Var.a[i11].setVisibility(4);
                t7Var.a[i11].setTag(Integer.valueOf(i11));
                t7Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(t7Var, 10));
                t7Var.a[i11].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.o7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        t7 t7Var2 = t7.this;
                        if (t7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        q7 q7Var = t7Var2.d;
                        int i12 = t7Var2.c[intValue];
                        MessageObject messageObject = t7Var2.b[intValue];
                        org.telegram.ui.g gVar = (org.telegram.ui.g) q7Var;
                        g10 g10Var = ((e10) gVar.b).d;
                        if (!g10Var.o0.g()) {
                            g10.a(g10Var, messageObject, t7Var2, intValue);
                            return true;
                        }
                        g10 g10Var2 = ((e10) gVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = g10.s0;
                        g10Var2.f(i12, t7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            t7Var.setDelegate(new g(this, 17));
            frameLayout = t7Var;
        } else {
            if (i10 != 2) {
                r62 = new u00(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return com.google.android.gms.internal.cast.a6.l(r62, r62, -1, -2);
            }
            FrameLayout u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.e7, false) & (-218103809));
            frameLayout = u3Var;
        }
        r62 = frameLayout;
        return com.google.android.gms.internal.cast.a6.l(r62, r62, -1, -2);
    }
}
