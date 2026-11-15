package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class lr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rr b;

    public /* synthetic */ lr(rr rrVar, int i7) {
        this.a = i7;
        this.b = rrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        boolean z10;
        CharSequence charSequence;
        int i7 = this.a;
        rr rrVar = this.b;
        boolean z11 = false;
        switch (i7) {
            case 0:
                rrVar.i1(false);
                break;
            default:
                Context context2 = rrVar.getContext();
                org.telegram.ui.ActionBar.e6 e6Var = rrVar.J0;
                int i10 = rrVar.a;
                long j3 = rrVar.m2;
                ArrayList<Long> arrayList = rrVar.n2.joined_chat_ids;
                mr mrVar = new mr(rrVar, 5);
                Pattern pattern = t4.a;
                LinearLayout f10 = org.telegram.messenger.k5.f(context2, 1);
                org.telegram.ui.ActionBar.t1[] t1VarArr = new org.telegram.ui.ActionBar.t1[1];
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, e6Var);
                Object obj = null;
                String M0 = org.telegram.messenger.hd.M0(2131751959, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(arrayList.size(), "CommunityBanWillRemoveFromChats", org.telegram.messenger.m5.s(i10, j3)));
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.o(f10);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Long l10 = arrayList.get(i11);
                    i11++;
                    Long l11 = l10;
                    long longValue = l11.longValue();
                    TLRPC.Chat M02 = org.telegram.messenger.np.s1(i10).M0(l11);
                    TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i10).N0(longValue);
                    if (M02 == null) {
                        obj = null;
                    } else {
                        org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
                        di.e1 e1Var = new di.e1(context2, e6Var, z11);
                        ((TextView) e1Var.b).setText(org.telegram.messenger.m5.m(M02));
                        TextView textView = (TextView) e1Var.d;
                        if (N0 != null) {
                            context = context2;
                            z10 = false;
                            charSequence = org.telegram.messenger.hd.G(N0.participants_count, "Members", new Object[0]);
                        } else {
                            context = context2;
                            z10 = false;
                            charSequence = null;
                        }
                        textView.setText(charSequence);
                        ((i9) e1Var.c).f(M02, new t8(M02));
                        e1Var.setBackground(org.telegram.ui.ActionBar.j6.N0(z10));
                        e1Var.setOnClickListener(new di.v2(t1VarArr, mrVar, longValue, 3));
                        f10.addView(e1Var, c8.ja.o(-1, -2));
                        z11 = z10;
                        obj = null;
                        t1Var = t1Var2;
                        context2 = context;
                    }
                }
                org.telegram.ui.ActionBar.t1 t1Var3 = t1Var;
                t1VarArr[z11 ? 1 : 0] = t1Var3;
                t1Var3.show();
                break;
        }
    }
}
