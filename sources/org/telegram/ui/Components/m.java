package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        hf hfVar;
        int i7 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                m0 m0Var = (m0) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                Context context = (Context) obj;
                if (!m0Var.i2) {
                    if (m0Var.k2 != null) {
                        if (m0Var.o1() == null) {
                        }
                    } else if (m0Var.j2 == null || m0Var.p1() == null) {
                    }
                    boolean z10 = m0Var.h2 == org.telegram.messenger.i10.i(m0Var.a).e();
                    x60 G = x60.G(m0Var.c, i6Var, m0Var.D2);
                    G.l(R.drawable.input_notify_off, org.telegram.messenger.gd.N0(2131745387, null), new a(m0Var, 4), !z10);
                    G.c(R.drawable.msg_calendar2, org.telegram.messenger.gd.N0(z10 ? 2131745318 : 2131745663, null), new org.telegram.ui.Cells.fa(m0Var, context, i6Var, 1), false);
                    G.a0();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj2;
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = chatActivityEnterView.M4;
                if (!fjVar.F3() && (hfVar = chatActivityEnterView.F0) != null && !TextUtils.isEmpty(hfVar.getTextToUse())) {
                    if (ajVar == null || (ajVar.c && !ajVar.i)) {
                        int i10 = fjVar.D;
                        if (i10 == 1 || i10 == 3 || i10 == 8) {
                            org.telegram.ui.dg0 dg0Var = new org.telegram.ui.dg0(chatActivityEnterView.getContext(), i6Var2);
                            dg0Var.h0 = true;
                            ArrayList arrayList = new ArrayList();
                            if (ajVar != null) {
                                ArrayList arrayList2 = ajVar.d;
                                int i11 = 0;
                                while (i11 < arrayList2.size()) {
                                    arrayList.add(chatActivityEnterView.y0((org.telegram.messenger.fj) arrayList2.get(i11), i11 == 0));
                                    i11++;
                                }
                            } else {
                                arrayList.add(chatActivityEnterView.y0(fjVar, true));
                            }
                            dg0Var.r(arrayList);
                            x60 G2 = x60.G(chatActivityEnterView.c2, i6Var2, chatActivityEnterView.v2);
                            sa0 sa0Var = new sa0(chatActivityEnterView.getContext(), R.raw.position_below, org.telegram.messenger.gd.N0(2131752548, null), R.raw.position_above, org.telegram.messenger.gd.N0(2131752547, null), chatActivityEnterView.M4);
                            sa0Var.a(!chatActivityEnterView.O6, false);
                            sa0Var.setOnClickListener(new bi.s6(chatActivityEnterView, arrayList, sa0Var, dg0Var, 11));
                            G2.q(sa0Var);
                            G2.Z();
                            dg0Var.q(G2);
                            dg0Var.s(chatActivityEnterView.v2, false, new bi.s6(chatActivityEnterView, ajVar, fjVar, dg0Var, 12));
                            dg0Var.show();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
