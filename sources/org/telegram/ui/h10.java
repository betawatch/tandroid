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
import org.telegram.ui.h10;
import org.telegram.ui.j10;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h10 extends org.telegram.ui.Components.mm0 {
    public final Context c;
    public final /* synthetic */ j10 d;

    public h10(j10 j10Var, Context context) {
        this.d = j10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        j10 j10Var = this.d;
        if (j10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / j10Var.s)) + (!j10Var.N ? 1 : 0);
    }

    @Override // s4.h0
    public final int j(int i10) {
        j10 j10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) j10Var.f.size()) / ((float) j10Var.s)))) ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        j10 j10Var = this.d;
        b10 b10Var = j10Var.S;
        ArrayList arrayList = j10Var.f;
        int i11 = e1Var.f;
        View view = e1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / j10Var.s);
                    int i12 = j10Var.s;
                    ((org.telegram.ui.Components.c10) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            p2Var.s2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = p2Var.getMessage() != null && p2Var.getMessage().getId() == messageObject.getId();
            p2Var.O = j10Var.p0;
            p2Var.V(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!j10Var.o0.g()) {
                p2Var.U(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            b10Var.a = messageObject.getDialogId();
            b10Var.b = id2;
            p2Var.U(j10Var.o0.c(b10Var), z10);
            return;
        }
        org.telegram.ui.Cells.x7 x7Var = (org.telegram.ui.Cells.x7) view;
        x7Var.setItemsCount(j10Var.s);
        x7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = j10Var.s;
            if (i13 >= i14) {
                x7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                x7Var.c(messageObject2, i13, arrayList.indexOf(messageObject2));
                if (j10Var.o0.g()) {
                    int id3 = messageObject2.getId();
                    b10Var.a = messageObject2.getDialogId();
                    b10Var.b = id3;
                    x7Var.b(i13, j10Var.o0.c(b10Var), true);
                } else {
                    x7Var.b(i13, false, true);
                }
            } else {
                x7Var.c(null, i13, i15);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.c10, org.telegram.ui.w00] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r6;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.x7 x7Var = new org.telegram.ui.Cells.x7(context);
            Paint paint = new Paint();
            x7Var.n = paint;
            x7Var.s = UserConfig.selectedAccount;
            x7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Lh, false));
            x7Var.b = new MessageObject[6];
            x7Var.a = new org.telegram.ui.Cells.t7[6];
            x7Var.c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                x7Var.a[i11] = new org.telegram.ui.Cells.t7(x7Var, context);
                x7Var.addView(x7Var.a[i11]);
                x7Var.a[i11].setVisibility(4);
                x7Var.a[i11].setTag(Integer.valueOf(i11));
                x7Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(x7Var, 10));
                x7Var.a[i11].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.s7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        x7 x7Var2 = x7.this;
                        if (x7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        u7 u7Var = x7Var2.d;
                        int i12 = x7Var2.c[intValue];
                        MessageObject messageObject = x7Var2.b[intValue];
                        org.telegram.ui.f fVar = (org.telegram.ui.f) u7Var;
                        j10 j10Var = ((h10) fVar.b).d;
                        if (!j10Var.o0.g()) {
                            j10.a(j10Var, messageObject, x7Var2, intValue);
                            return true;
                        }
                        j10 j10Var2 = ((h10) fVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = j10.s0;
                        j10Var2.f(i12, x7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            x7Var.setDelegate(new f(this, 17));
            frameLayout = x7Var;
        } else {
            if (i10 != 2) {
                r6 = new w00(this, context, 1);
                r6.setIsSingleCell(true);
                r6.setViewType(2);
                return ic.a.n(r6, r6, -1, -2);
            }
            FrameLayout z3Var = new org.telegram.ui.Cells.z3(context, null);
            z3Var.setBackgroundColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.e7, false) & (-218103809));
            frameLayout = z3Var;
        }
        r6 = frameLayout;
        return ic.a.n(r6, r6, -1, -2);
    }
}
