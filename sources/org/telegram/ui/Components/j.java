package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        se seVar;
        int i10 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                g0 g0Var = (g0) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                Context context = (Context) obj;
                if (!g0Var.e2) {
                    if (g0Var.g2 != null) {
                        if (g0Var.l1() == null) {
                        }
                    } else if (g0Var.f2 == null || g0Var.m1() == null) {
                    }
                    boolean z10 = g0Var.d2 == org.telegram.messenger.d20.i(g0Var.a).e();
                    z60 F = z60.F(g0Var.c, p6Var, g0Var.x2);
                    F.l(R.drawable.input_notify_off, org.telegram.messenger.cd.L0(2131745600, null), new a(g0Var, 4), !z10);
                    F.c(R.drawable.msg_calendar2, org.telegram.messenger.cd.L0(z10 ? 2131745531 : 2131745876, null), new li.s(g0Var, context, p6Var, 25), false);
                    F.Z();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) obj2;
                org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) obj;
                org.telegram.ui.ActionBar.p6 p6Var2 = chatActivityEnterView.W3;
                if (!jjVar.F3() && (seVar = chatActivityEnterView.E0) != null && !TextUtils.isEmpty(seVar.getTextToUse())) {
                    if (ejVar == null || (ejVar.c && !ejVar.i)) {
                        int i11 = jjVar.D;
                        if (i11 == 1 || i11 == 3 || i11 == 8) {
                            org.telegram.ui.kh0 kh0Var = new org.telegram.ui.kh0(chatActivityEnterView.getContext(), p6Var2);
                            kh0Var.g0 = true;
                            ArrayList arrayList = new ArrayList();
                            if (ejVar != null) {
                                ArrayList arrayList2 = ejVar.d;
                                int i12 = 0;
                                while (i12 < arrayList2.size()) {
                                    arrayList.add(chatActivityEnterView.c0((org.telegram.messenger.jj) arrayList2.get(i12), i12 == 0));
                                    i12++;
                                }
                            } else {
                                arrayList.add(chatActivityEnterView.c0(jjVar, true));
                            }
                            kh0Var.p(arrayList);
                            z60 F2 = z60.F(chatActivityEnterView.m1, p6Var2, chatActivityEnterView.F1);
                            za0 za0Var = new za0(chatActivityEnterView.getContext(), R.raw.position_below, org.telegram.messenger.cd.L0(2131752560, null), R.raw.position_above, org.telegram.messenger.cd.L0(2131752559, null), chatActivityEnterView.W3);
                            za0Var.a(!chatActivityEnterView.R4, false);
                            za0Var.setOnClickListener(new org.telegram.messenger.video.h(chatActivityEnterView, arrayList, za0Var, kh0Var, 6));
                            F2.q(za0Var);
                            F2.Y();
                            kh0Var.o(F2);
                            kh0Var.q(chatActivityEnterView.F1, false, new org.telegram.messenger.video.h(chatActivityEnterView, ejVar, jjVar, kh0Var, 7));
                            kh0Var.show();
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }
}
