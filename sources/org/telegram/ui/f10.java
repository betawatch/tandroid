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
import org.telegram.ui.f10;
import org.telegram.ui.h10;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f10 extends org.telegram.ui.Components.il0 {
    public final Context c;
    public final /* synthetic */ h10 d;

    public f10(h10 h10Var, Context context) {
        this.d = h10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        h10 h10Var = this.d;
        if (h10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / h10Var.s)) + (!h10Var.J ? 1 : 0);
    }

    @Override // f2.p0
    public final int j(int i10) {
        h10 h10Var = this.d;
        return i10 < ((int) Math.ceil((double) (((float) h10Var.f.size()) / ((float) h10Var.s)))) ? 0 : 1;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        h10 h10Var = this.d;
        z00 z00Var = h10Var.O;
        ArrayList arrayList = h10Var.f;
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 != 0) {
            if (i11 != 3) {
                if (i11 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / h10Var.s);
                    int i12 = h10Var.s;
                    ((org.telegram.ui.Components.p00) view).v = i12 - ((ceil * i12) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.p2 p2Var = (org.telegram.ui.Cells.p2) view;
            p2Var.o2 = i10 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            boolean z10 = p2Var.getMessage() != null && p2Var.getMessage().getId() == messageObject.getId();
            p2Var.K = h10Var.l0;
            p2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!h10Var.k0.f()) {
                p2Var.V(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            z00Var.a = messageObject.getDialogId();
            z00Var.b = id2;
            p2Var.V(h10Var.k0.b(z00Var), z10);
            return;
        }
        org.telegram.ui.Cells.q7 q7Var = (org.telegram.ui.Cells.q7) view;
        q7Var.setItemsCount(h10Var.s);
        q7Var.setIsFirst(i10 == 0);
        int i13 = 0;
        while (true) {
            int i14 = h10Var.s;
            if (i13 >= i14) {
                q7Var.requestLayout();
                return;
            }
            int i15 = (i14 * i10) + i13;
            if (i15 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i15);
                q7Var.c(i13, arrayList.indexOf(messageObject2), messageObject2);
                if (h10Var.k0.f()) {
                    int id3 = messageObject2.getId();
                    z00Var.a = messageObject2.getDialogId();
                    z00Var.b = id3;
                    q7Var.b(i13, h10Var.k0.b(z00Var));
                } else {
                    q7Var.b(i13, false);
                }
            } else {
                q7Var.c(i13, i15, null);
            }
            i13++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.p00, org.telegram.ui.v00] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ?? r6;
        Context context = this.c;
        if (i10 == 0) {
            final org.telegram.ui.Cells.q7 q7Var = new org.telegram.ui.Cells.q7(context);
            Paint paint = new Paint();
            q7Var.n = paint;
            q7Var.s = UserConfig.selectedAccount;
            q7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Lh, false));
            q7Var.b = new MessageObject[6];
            q7Var.a = new org.telegram.ui.Cells.m7[6];
            q7Var.c = new int[6];
            for (int i11 = 0; i11 < 6; i11++) {
                q7Var.a[i11] = new org.telegram.ui.Cells.m7(q7Var, context);
                q7Var.addView(q7Var.a[i11]);
                q7Var.a[i11].setVisibility(4);
                q7Var.a[i11].setTag(Integer.valueOf(i11));
                q7Var.a[i11].setOnClickListener(new org.telegram.ui.Cells.a(q7Var, 10));
                q7Var.a[i11].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.l7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        q7 q7Var2 = q7.this;
                        if (q7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        n7 n7Var = q7Var2.d;
                        int i12 = q7Var2.c[intValue];
                        MessageObject messageObject = q7Var2.b[intValue];
                        org.telegram.ui.h hVar = (org.telegram.ui.h) n7Var;
                        h10 h10Var = ((f10) hVar.b).d;
                        if (!h10Var.k0.f()) {
                            h10.a(h10Var, messageObject, q7Var2, intValue);
                            return true;
                        }
                        h10 h10Var2 = ((f10) hVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = h10.o0;
                        h10Var2.f(i12, q7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            q7Var.setDelegate(new h(this, 17));
            frameLayout = q7Var;
        } else {
            if (i10 != 2) {
                r6 = new v00(this, context, 1);
                r6.setIsSingleCell(true);
                r6.setViewType(2);
                return th.m(r6, r6, -1, -2);
            }
            FrameLayout s3Var = new org.telegram.ui.Cells.s3(context, null);
            s3Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.e7, false) & (-218103809));
            frameLayout = s3Var;
        }
        r6 = frameLayout;
        return th.m(r6, r6, -1, -2);
    }
}
