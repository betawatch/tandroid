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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g10 extends org.telegram.ui.Components.yk0 {
    public final Context c;
    public final /* synthetic */ i10 d;

    public g10(i10 i10Var, Context context) {
        this.d = i10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override // f2.q0
    public final int h() {
        i10 i10Var = this.d;
        if (i10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / i10Var.s)) + (!i10Var.J ? 1 : 0);
    }

    @Override // f2.q0
    public final int j(int i10) {
        i10 i10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) i10Var.f.size()) / ((float) i10Var.s)))) ? 0 : 1;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        i10 i10Var = this.d;
        a10 a10Var = i10Var.O;
        ArrayList arrayList = i10Var.f;
        int i11 = o1Var.f;
        View view = o1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / i10Var.s);
                    int i12 = i10Var.s;
                    ((org.telegram.ui.Components.h00) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            p2Var.o2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = p2Var.getMessage() != null && p2Var.getMessage().getId() == messageObject.getId();
            p2Var.K = i10Var.l0;
            p2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!i10Var.k0.f()) {
                p2Var.V(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            a10Var.a = messageObject.getDialogId();
            a10Var.b = id2;
            p2Var.V(i10Var.k0.b(a10Var), z10);
            return;
        }
        org.telegram.ui.Cells.p7 p7Var = (org.telegram.ui.Cells.p7) view;
        p7Var.setItemsCount(i10Var.s);
        p7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = i10Var.s;
            if (i13 >= i14) {
                p7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                p7Var.c(i13, arrayList.indexOf(messageObject2), messageObject2);
                if (i10Var.k0.f()) {
                    int id3 = messageObject2.getId();
                    a10Var.a = messageObject2.getDialogId();
                    a10Var.b = id3;
                    p7Var.b(i13, i10Var.k0.b(a10Var));
                } else {
                    p7Var.b(i13, false);
                }
            } else {
                p7Var.c(i13, i15, null);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.h00, org.telegram.ui.w00] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.p7 p7Var = new org.telegram.ui.Cells.p7(context);
            Paint paint = new Paint();
            p7Var.n = paint;
            p7Var.s = UserConfig.selectedAccount;
            p7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lh, false));
            p7Var.b = new MessageObject[6];
            p7Var.a = new org.telegram.ui.Cells.l7[6];
            p7Var.c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                p7Var.a[i11] = new org.telegram.ui.Cells.l7(p7Var, context);
                p7Var.addView(p7Var.a[i11]);
                p7Var.a[i11].setVisibility(4);
                p7Var.a[i11].setTag(Integer.valueOf(i11));
                p7Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(p7Var, 10));
                p7Var.a[i11].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.k7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        p7 p7Var2 = p7.this;
                        if (p7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        m7 m7Var = p7Var2.d;
                        int i12 = p7Var2.c[intValue];
                        MessageObject messageObject = p7Var2.b[intValue];
                        org.telegram.ui.g gVar = (org.telegram.ui.g) m7Var;
                        i10 i10Var = ((g10) gVar.b).d;
                        if (!i10Var.k0.f()) {
                            i10.a(i10Var, messageObject, p7Var2, intValue);
                            return true;
                        }
                        i10 i10Var2 = ((g10) gVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = i10.o0;
                        i10Var2.f(i12, p7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            p7Var.setDelegate(new g(this, 17));
            frameLayout = p7Var;
        } else {
            if (i10 != 2) {
                r62 = new w00(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return org.telegram.ui.Cells.pa.l(r62, r62, -1, -2);
            }
            FrameLayout s3Var = new org.telegram.ui.Cells.s3(context, null);
            s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.e7, false) & (-218103809));
            frameLayout = s3Var;
        }
        r62 = frameLayout;
        return org.telegram.ui.Cells.pa.l(r62, r62, -1, -2);
    }
}
