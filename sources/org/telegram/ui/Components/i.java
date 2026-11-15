package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        xe xeVar;
        int i7 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                d0 d0Var = (d0) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                Context context = (Context) obj;
                if (!d0Var.i2) {
                    if (d0Var.k2 != null) {
                        if (d0Var.l1() == null) {
                        }
                    } else if (d0Var.j2 == null || d0Var.m1() == null) {
                    }
                    boolean z10 = d0Var.h2 == org.telegram.messenger.m10.i(d0Var.a).e();
                    m60 F = m60.F(d0Var.c, e6Var, d0Var.B2);
                    F.l(R.drawable.input_notify_off, org.telegram.messenger.hd.M0(2131745583, null), new a(d0Var, 4), !z10);
                    F.c(R.drawable.msg_calendar2, org.telegram.messenger.hd.M0(z10 ? 2131745514 : 2131745859, null), new ki.n(d0Var, context, e6Var, 26), false);
                    F.Z();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj2;
                org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = chatActivityEnterView.E4;
                if (!gjVar.F3() && (xeVar = chatActivityEnterView.F0) != null && !TextUtils.isEmpty(xeVar.getTextToUse())) {
                    if (bjVar == null || (bjVar.c && !bjVar.i)) {
                        int i10 = gjVar.D;
                        if (i10 == 1 || i10 == 3 || i10 == 8) {
                            org.telegram.ui.bg0 bg0Var = new org.telegram.ui.bg0(chatActivityEnterView.getContext(), e6Var2);
                            bg0Var.h0 = true;
                            ArrayList arrayList = new ArrayList();
                            if (bjVar != null) {
                                ArrayList arrayList2 = bjVar.d;
                                int i11 = 0;
                                while (i11 < arrayList2.size()) {
                                    arrayList.add(chatActivityEnterView.n0((org.telegram.messenger.gj) arrayList2.get(i11), i11 == 0));
                                    i11++;
                                }
                            } else {
                                arrayList.add(chatActivityEnterView.n0(gjVar, true));
                            }
                            bg0Var.r(arrayList);
                            m60 F2 = m60.F(chatActivityEnterView.U1, e6Var2, chatActivityEnterView.n2);
                            ia0 ia0Var = new ia0(chatActivityEnterView.getContext(), R.raw.position_below, org.telegram.messenger.hd.M0(2131752560, null), R.raw.position_above, org.telegram.messenger.hd.M0(2131752559, null), chatActivityEnterView.E4);
                            ia0Var.a(!chatActivityEnterView.m6, false);
                            ia0Var.setOnClickListener(new bi.f4(chatActivityEnterView, arrayList, ia0Var, bg0Var, 11));
                            F2.q(ia0Var);
                            F2.Y();
                            bg0Var.q(F2);
                            bg0Var.s(chatActivityEnterView.n2, false, new bi.f4(chatActivityEnterView, bjVar, gjVar, bg0Var, 12));
                            bg0Var.show();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
