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
import org.telegram.ui.d10;
import org.telegram.ui.f10;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class d10 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public final /* synthetic */ f10 d;

    public d10(f10 f10Var, Context context) {
        this.d = f10Var;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        f10 f10Var = this.d;
        if (f10Var.f.isEmpty()) {
            return 0;
        }
        return ((int) Math.ceil(r1.size() / f10Var.s)) + (!f10Var.J ? 1 : 0);
    }

    @Override // f2.r0
    public final int j(int i9) {
        f10 f10Var = this.d;
        return i9 < ((int) Math.ceil((double) (((float) f10Var.f.size()) / ((float) f10Var.s)))) ? 0 : 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        f10 f10Var = this.d;
        x00 x00Var = f10Var.O;
        ArrayList arrayList = f10Var.f;
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 != 0) {
            if (i10 != 3) {
                if (i10 == 1) {
                    int ceil = (int) Math.ceil(arrayList.size() / f10Var.s);
                    int i11 = f10Var.s;
                    ((org.telegram.ui.Components.e00) view).v = i11 - ((ceil * i11) - arrayList.size());
                    return;
                }
                return;
            }
            org.telegram.ui.Cells.r2 r2Var = (org.telegram.ui.Cells.r2) view;
            r2Var.o2 = i9 != h() - 1;
            MessageObject messageObject = (MessageObject) arrayList.get(i9);
            boolean z10 = r2Var.getMessage() != null && r2Var.getMessage().getId() == messageObject.getId();
            r2Var.K = f10Var.l0;
            r2Var.V(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
            if (!f10Var.k0.f()) {
                r2Var.U(false, z10);
                return;
            }
            int id2 = messageObject.getId();
            x00Var.a = messageObject.getDialogId();
            x00Var.b = id2;
            r2Var.U(f10Var.k0.b(x00Var), z10);
            return;
        }
        org.telegram.ui.Cells.s7 s7Var = (org.telegram.ui.Cells.s7) view;
        s7Var.setItemsCount(f10Var.s);
        s7Var.setIsFirst(i9 == 0);
        int i12 = 0;
        while (true) {
            int i13 = f10Var.s;
            if (i12 >= i13) {
                s7Var.requestLayout();
                return;
            }
            int i14 = (i13 * i9) + i12;
            if (i14 < arrayList.size()) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(i14);
                s7Var.c(i12, arrayList.indexOf(messageObject2), messageObject2);
                if (f10Var.k0.f()) {
                    int id3 = messageObject2.getId();
                    x00Var.a = messageObject2.getDialogId();
                    x00Var.b = id3;
                    s7Var.b(i12, f10Var.k0.b(x00Var));
                } else {
                    s7Var.b(i12, false);
                }
            } else {
                s7Var.c(i12, i14, null);
            }
            i12++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [org.telegram.ui.Components.e00, org.telegram.ui.t00] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.view.View] */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        ?? r62;
        Context context = this.c;
        if (i9 == 0) {
            final org.telegram.ui.Cells.s7 s7Var = new org.telegram.ui.Cells.s7(context);
            Paint paint = new Paint();
            s7Var.n = paint;
            s7Var.s = UserConfig.selectedAccount;
            s7Var.r = 1;
            paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Lh, false));
            s7Var.b = new MessageObject[6];
            s7Var.a = new org.telegram.ui.Cells.o7[6];
            s7Var.c = new int[6];
            for (int i10 = 0; i10 < 6; i10++) {
                s7Var.a[i10] = new org.telegram.ui.Cells.o7(s7Var, context);
                s7Var.addView(s7Var.a[i10]);
                s7Var.a[i10].setVisibility(4);
                s7Var.a[i10].setTag(Integer.valueOf(i10));
                s7Var.a[i10].setOnClickListener(new org.telegram.ui.Cells.a(s7Var, 10));
                s7Var.a[i10].setOnLongClickListener(new View.OnLongClickListener() { // from class: org.telegram.ui.Cells.n7
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        s7 s7Var2 = s7.this;
                        if (s7Var2.d == null) {
                            return false;
                        }
                        int intValue = ((Integer) view.getTag()).intValue();
                        p7 p7Var = s7Var2.d;
                        int i11 = s7Var2.c[intValue];
                        MessageObject messageObject = s7Var2.b[intValue];
                        org.telegram.ui.g gVar = (org.telegram.ui.g) p7Var;
                        f10 f10Var = ((d10) gVar.b).d;
                        if (!f10Var.k0.f()) {
                            f10.a(f10Var, messageObject, s7Var2, intValue);
                            return true;
                        }
                        f10 f10Var2 = ((d10) gVar.b).d;
                        SpannableStringBuilder[] spannableStringBuilderArr = f10.o0;
                        f10Var2.f(i11, s7Var2, messageObject, intValue);
                        return true;
                    }
                });
            }
            s7Var.setDelegate(new g(this, 17));
            frameLayout = s7Var;
        } else {
            if (i9 != 2) {
                r62 = new t00(this, context, 1);
                r62.setIsSingleCell(true);
                r62.setViewType(2);
                return j3.r0.s(r62, r62, -1, -2);
            }
            FrameLayout v3Var = new org.telegram.ui.Cells.v3(context, null);
            v3Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.e7, false) & (-218103809));
            frameLayout = v3Var;
        }
        r62 = frameLayout;
        return j3.r0.s(r62, r62, -1, -2);
    }
}
