package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ve veVar;
        int i3 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i3) {
            case 0:
                e0 e0Var = (e0) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                Context context = (Context) obj;
                if (!e0Var.f2) {
                    if (e0Var.h2 != null) {
                        if (e0Var.l1() == null) {
                        }
                    } else if (e0Var.g2 == null || e0Var.m1() == null) {
                    }
                    boolean z10 = e0Var.e2 == org.telegram.messenger.h10.i(e0Var.a).e();
                    f60 F = f60.F(e0Var.c, e6Var, e0Var.y2);
                    F.l(R.drawable.input_notify_off, org.telegram.messenger.bd.M0(2131745593, null), new a(e0Var, 4), !z10);
                    F.c(R.drawable.msg_calendar2, org.telegram.messenger.bd.M0(z10 ? 2131745524 : 2131745869, null), new lg.y(e0Var, context, e6Var, 29), false);
                    F.Z();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) obj2;
                org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) obj;
                org.telegram.ui.ActionBar.e6 e6Var2 = chatActivityEnterView.X3;
                if (!ziVar.G3() && (veVar = chatActivityEnterView.F0) != null && !TextUtils.isEmpty(veVar.getTextToUse())) {
                    if (uiVar == null || (uiVar.c && !uiVar.i)) {
                        int i10 = ziVar.D;
                        if (i10 == 1 || i10 == 3 || i10 == 8) {
                            org.telegram.ui.vf0 vf0Var = new org.telegram.ui.vf0(chatActivityEnterView.getContext(), e6Var2);
                            vf0Var.h0 = true;
                            ArrayList arrayList = new ArrayList();
                            if (uiVar != null) {
                                ArrayList arrayList2 = uiVar.d;
                                int i11 = 0;
                                while (i11 < arrayList2.size()) {
                                    arrayList.add(chatActivityEnterView.d0((org.telegram.messenger.zi) arrayList2.get(i11), i11 == 0));
                                    i11++;
                                }
                            } else {
                                arrayList.add(chatActivityEnterView.d0(ziVar, true));
                            }
                            vf0Var.p(arrayList);
                            f60 F2 = f60.F(chatActivityEnterView.n1, e6Var2, chatActivityEnterView.G1);
                            ca0 ca0Var = new ca0(chatActivityEnterView.getContext(), R.raw.position_below, org.telegram.messenger.bd.M0(2131752560, null), R.raw.position_above, org.telegram.messenger.bd.M0(2131752559, null), chatActivityEnterView.X3);
                            ca0Var.a(!chatActivityEnterView.S4, false);
                            ca0Var.setOnClickListener(new ai.r4(chatActivityEnterView, arrayList, ca0Var, vf0Var, 11));
                            F2.q(ca0Var);
                            F2.Y();
                            vf0Var.o(F2);
                            vf0Var.q(chatActivityEnterView.G1, false, new ai.r4(chatActivityEnterView, uiVar, ziVar, vf0Var, 12));
                            vf0Var.show();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
