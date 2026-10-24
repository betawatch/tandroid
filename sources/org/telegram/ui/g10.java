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
import org.telegram.ui.g10;
import org.telegram.ui.i10;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class g10 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ i10 d;

    public g10(i10 i10Var, Context context) {
        this.d = i10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        i10 i10Var = this.d;
        if (i10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / i10Var.s)) + (!i10Var.N ? 1 : 0);
    }

    @Override // s4.g0
    public final int j(int i10) {
        i10 i10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) i10Var.f.size()) / ((float) i10Var.s)))) ? 0 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        i10 i10Var = this.d;
        a10 a10Var = i10Var.S;
        ArrayList arrayList = i10Var.f;
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / i10Var.s);
                    int i12 = i10Var.s;
                    ((org.telegram.ui.Components.b10) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.q2 q2Var = (org.telegram.ui.Cells.q2) view;
            q2Var.s2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = q2Var.getMessage() != null && q2Var.getMessage().getId() == messageObject.getId();
            q2Var.O = i10Var.p0;
            q2Var.V(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!i10Var.o0.g()) {
                q2Var.U(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            a10Var.a = messageObject.getDialogId();
            a10Var.b = id2;
            q2Var.U(i10Var.o0.b(a10Var), z10);
            return;
        }
        org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) view;
        t7Var.setItemsCount(i10Var.s);
        t7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = i10Var.s;
            if (i13 >= i14) {
                t7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                t7Var.c(messageObject2, i13, arrayList.indexOf(messageObject2));
                if (i10Var.o0.g()) {
                    int id3 = messageObject2.getId();
                    a10Var.a = messageObject2.getDialogId();
                    a10Var.b = id3;
                    t7Var.b(i13, i10Var.o0.b(a10Var), true);
                } else {
                    t7Var.b(i13, false, true);
                }
            } else {
                t7Var.c(null, i13, i15);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.b10, org.telegram.ui.v00] */
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
            paint.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Lh, false));
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
                        org.telegram.ui.f fVar = (org.telegram.ui.f) q7Var;
                        i10 i10Var = ((g10) fVar.b).d;
                        if (!i10Var.o0.g()) {
                            i10.a(i10Var, messageObject, t7Var2, intValue);
                            return true;
                        }
                        i10 i10Var2 = ((g10) fVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = i10.s0;
                        i10Var2.f(i12, t7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            t7Var.setDelegate(new f(this, 17));
            frameLayout = t7Var;
        } else {
            if (i10 != 2) {
                r62 = new v00(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return com.google.android.gms.internal.play_billing.k3.l(r62, r62, -1, -2);
            }
            FrameLayout u3Var = new org.telegram.ui.Cells.u3(context, null);
            u3Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.e7, false) & (-218103809));
            frameLayout = u3Var;
        }
        r62 = frameLayout;
        return com.google.android.gms.internal.play_billing.k3.l(r62, r62, -1, -2);
    }
}
