package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class er implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr b;

    public /* synthetic */ er(lr lrVar, int i7) {
        this.a = i7;
        this.b = lrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        boolean z9;
        CharSequence charSequence;
        int i7 = this.a;
        lr lrVar = this.b;
        boolean z10 = false;
        switch (i7) {
            case 0:
                lrVar.i1(false);
                break;
            default:
                Context context2 = lrVar.getContext();
                org.telegram.ui.ActionBar.f6 f6Var = lrVar.I0;
                int i10 = lrVar.a;
                long j3 = lrVar.i2;
                ArrayList<Long> arrayList = lrVar.j2.joined_chat_ids;
                fr frVar = new fr(lrVar, 5);
                Pattern pattern = v4.a;
                LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, f6Var);
                Object obj = null;
                String M0 = org.telegram.messenger.id.M0(2131751959, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(arrayList.size(), "CommunityBanWillRemoveFromChats", org.telegram.messenger.m5.s(i10, j3)));
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747832, null), null);
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.o(f10);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Long l10 = arrayList.get(i11);
                    i11++;
                    Long l11 = l10;
                    long longValue = l11.longValue();
                    TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i10).M0(l11);
                    TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i10).N0(longValue);
                    if (M02 == null) {
                        obj = null;
                    } else {
                        org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
                        bi.s1 s1Var = new bi.s1(context2, f6Var, z10);
                        ((TextView) s1Var.b).setText(org.telegram.messenger.m5.m(M02));
                        TextView textView = (TextView) s1Var.d;
                        if (N0 != null) {
                            context = context2;
                            z9 = false;
                            charSequence = org.telegram.messenger.id.G(N0.participants_count, "Members", new Object[0]);
                        } else {
                            context = context2;
                            z9 = false;
                            charSequence = null;
                        }
                        textView.setText(charSequence);
                        ((l9) s1Var.c).e(M02, new w8(M02));
                        s1Var.setBackground(org.telegram.ui.ActionBar.k6.N0(z9));
                        s1Var.setOnClickListener(new bi.p3(u1VarArr, frVar, longValue, 3));
                        f10.addView(s1Var, c8.ha.o(-1, -2));
                        z10 = z9;
                        obj = null;
                        u1Var = u1Var2;
                        context2 = context;
                    }
                }
                org.telegram.ui.ActionBar.u1 u1Var3 = u1Var;
                u1VarArr[z10 ? 1 : 0] = u1Var3;
                u1Var3.show();
                break;
        }
    }
}
