package org.telegram.ui.Components;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr b;

    public /* synthetic */ sr(yr yrVar, int i7) {
        this.a = i7;
        this.b = yrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        boolean z10;
        CharSequence charSequence;
        int i7 = this.a;
        yr yrVar = this.b;
        boolean z11 = false;
        switch (i7) {
            case 0:
                yrVar.j1(false);
                break;
            default:
                Context context2 = yrVar.getContext();
                org.telegram.ui.ActionBar.i6 i6Var = yrVar.J0;
                int i10 = yrVar.a;
                long j3 = yrVar.m2;
                ArrayList<Long> arrayList = yrVar.n2.joined_chat_ids;
                tr trVar = new tr(yrVar, 5);
                Pattern pattern = b5.a;
                LinearLayout g10 = org.telegram.messenger.f3.g(context2, 1);
                org.telegram.ui.ActionBar.u1[] u1VarArr = new org.telegram.ui.ActionBar.u1[1];
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context2, i6Var);
                Object obj = null;
                String M0 = org.telegram.messenger.gd.M0(2131751948, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.S = M0;
                u1Var.U = org.telegram.messenger.g0.W2(org.telegram.messenger.gd.G(arrayList.size(), "CommunityBanWillRemoveFromChats", org.telegram.messenger.n5.s(i10, j3)));
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131747638, null), null);
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                alertDialog$Builder.o(g10);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Long l10 = arrayList.get(i11);
                    i11++;
                    Long l11 = l10;
                    long longValue = l11.longValue();
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i10).O0(l11);
                    TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i10).P0(longValue);
                    if (O0 == null) {
                        obj = null;
                    } else {
                        org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
                        di.d1 d1Var = new di.d1(context2, i6Var, z11);
                        ((TextView) d1Var.b).setText(org.telegram.messenger.n5.m(O0));
                        TextView textView = (TextView) d1Var.d;
                        if (P0 != null) {
                            context = context2;
                            z10 = false;
                            charSequence = org.telegram.messenger.gd.G(P0.participants_count, "Members", new Object[0]);
                        } else {
                            context = context2;
                            z10 = false;
                            charSequence = null;
                        }
                        textView.setText(charSequence);
                        ((q9) d1Var.c).f(O0, new b9(O0));
                        d1Var.setBackground(org.telegram.ui.ActionBar.n6.N0(z10));
                        d1Var.setOnClickListener(new di.d3(u1VarArr, trVar, longValue, 3));
                        g10.addView(d1Var, c8.ma.o(-1, -2));
                        z11 = z10;
                        obj = null;
                        u1Var = u1Var2;
                        context2 = context;
                    }
                }
                org.telegram.ui.ActionBar.u1 u1Var3 = u1Var;
                u1VarArr[z11 ? 1 : 0] = u1Var3;
                u1Var3.show();
                break;
        }
    }
}
