package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        gf gfVar;
        int i7;
        int i10 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                n0 n0Var = (n0) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                Context context = (Context) obj;
                if (n0Var.i2 || (n0Var.k2 == null ? n0Var.j2 == null || n0Var.p1() == null : n0Var.o1() == null)) {
                    break;
                } else {
                    boolean z10 = n0Var.h2 == org.telegram.messenger.k10.i(n0Var.a).e();
                    a70 G = a70.G(n0Var.c, h6Var, n0Var.D2);
                    G.l(R.drawable.input_notify_off, org.telegram.messenger.hd.N0(2131745387, null), new a(n0Var, 4), !z10);
                    G.c(R.drawable.msg_calendar2, org.telegram.messenger.hd.N0(z10 ? 2131745318 : 2131745663, null), new g(n0Var, context, h6Var, 0), false);
                    G.a0();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.gj gjVar = (org.telegram.messenger.gj) obj2;
                org.telegram.messenger.bj bjVar = (org.telegram.messenger.bj) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = chatActivityEnterView.M4;
                if (!gjVar.F3() && (gfVar = chatActivityEnterView.F0) != null && !TextUtils.isEmpty(gfVar.getTextToUse()) && ((bjVar == null || (bjVar.c && !bjVar.i)) && ((i7 = gjVar.D) == 1 || i7 == 3 || i7 == 8))) {
                    org.telegram.ui.eg0 eg0Var = new org.telegram.ui.eg0(chatActivityEnterView.getContext(), h6Var2);
                    eg0Var.h0 = true;
                    ArrayList arrayList = new ArrayList();
                    if (bjVar != null) {
                        ArrayList arrayList2 = bjVar.d;
                        int i11 = 0;
                        while (i11 < arrayList2.size()) {
                            arrayList.add(chatActivityEnterView.y0((org.telegram.messenger.gj) arrayList2.get(i11), i11 == 0));
                            i11++;
                        }
                    } else {
                        arrayList.add(chatActivityEnterView.y0(gjVar, true));
                    }
                    eg0Var.r(arrayList);
                    a70 G2 = a70.G(chatActivityEnterView.c2, h6Var2, chatActivityEnterView.v2);
                    va0 va0Var = new va0(chatActivityEnterView.getContext(), R.raw.position_below, org.telegram.messenger.hd.N0(2131752548, null), R.raw.position_above, org.telegram.messenger.hd.N0(2131752547, null), chatActivityEnterView.M4);
                    va0Var.a(!chatActivityEnterView.O6, false);
                    va0Var.setOnClickListener(new bi.p6(chatActivityEnterView, arrayList, va0Var, eg0Var, 11));
                    G2.q(va0Var);
                    G2.Z();
                    eg0Var.q(G2);
                    eg0Var.s(chatActivityEnterView.v2, false, new bi.p6(chatActivityEnterView, bjVar, gjVar, eg0Var, 12));
                    eg0Var.show();
                    break;
                } else {
                    break;
                }
        }
        return false;
    }
}
