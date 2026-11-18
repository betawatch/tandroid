package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
        gf gfVar;
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
                    boolean z10 = m0Var.h2 == org.telegram.messenger.j10.i(m0Var.a).e();
                    y60 G = y60.G(m0Var.c, i6Var, m0Var.D2);
                    G.l(R.drawable.input_notify_off, org.telegram.messenger.gd.M0(2131745388, null), new a(m0Var, 4), !z10);
                    G.c(R.drawable.msg_calendar2, org.telegram.messenger.gd.M0(z10 ? 2131745319 : 2131745664, null), new kg.i0(m0Var, context, i6Var, 29), false);
                    G.a0();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.fj fjVar = (org.telegram.messenger.fj) obj2;
                org.telegram.messenger.aj ajVar = (org.telegram.messenger.aj) obj;
                org.telegram.ui.ActionBar.i6 i6Var2 = chatActivityEnterView.K4;
                if (!fjVar.F3() && (gfVar = chatActivityEnterView.F0) != null && !TextUtils.isEmpty(gfVar.getTextToUse())) {
                    if (ajVar == null || (ajVar.c && !ajVar.i)) {
                        int i10 = fjVar.D;
                        if (i10 == 1 || i10 == 3 || i10 == 8) {
                            org.telegram.ui.eg0 eg0Var = new org.telegram.ui.eg0(chatActivityEnterView.getContext(), i6Var2);
                            eg0Var.h0 = true;
                            ArrayList arrayList = new ArrayList();
                            if (ajVar != null) {
                                ArrayList arrayList2 = ajVar.d;
                                int i11 = 0;
                                while (i11 < arrayList2.size()) {
                                    arrayList.add(chatActivityEnterView.u0((org.telegram.messenger.fj) arrayList2.get(i11), i11 == 0));
                                    i11++;
                                }
                            } else {
                                arrayList.add(chatActivityEnterView.u0(fjVar, true));
                            }
                            eg0Var.r(arrayList);
                            y60 G2 = y60.G(chatActivityEnterView.a2, i6Var2, chatActivityEnterView.t2);
                            ta0 ta0Var = new ta0(chatActivityEnterView.getContext(), R.raw.position_below, org.telegram.messenger.gd.M0(2131752549, null), R.raw.position_above, org.telegram.messenger.gd.M0(2131752548, null), chatActivityEnterView.K4);
                            ta0Var.a(!chatActivityEnterView.M6, false);
                            ta0Var.setOnClickListener(new bi.n6(chatActivityEnterView, arrayList, ta0Var, eg0Var, 11));
                            G2.q(ta0Var);
                            G2.Z();
                            eg0Var.q(G2);
                            eg0Var.s(chatActivityEnterView.t2, false, new bi.n6(chatActivityEnterView, ajVar, fjVar, eg0Var, 12));
                            eg0Var.show();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
