package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i7) {
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
                g0 g0Var = (g0) obj3;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                Context context = (Context) obj;
                if (!g0Var.e2) {
                    if (g0Var.g2 != null) {
                        if (g0Var.l1() == null) {
                        }
                    } else if (g0Var.f2 == null || g0Var.m1() == null) {
                    }
                    boolean z9 = g0Var.d2 == org.telegram.messenger.p10.i(g0Var.a).e();
                    l60 F = l60.F(g0Var.c, g6Var, g0Var.x2);
                    F.l(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745583, null), new a(g0Var, 4), !z9);
                    F.c(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(z9 ? 2131745514 : 2131745859, null), new l2.z0(g0Var, context, g6Var, 25), false);
                    F.Z();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj2;
                org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) obj;
                org.telegram.ui.ActionBar.g6 g6Var2 = chatActivityEnterView.W3;
                if (!ijVar.F3() && (xeVar = chatActivityEnterView.E0) != null && !TextUtils.isEmpty(xeVar.getTextToUse())) {
                    if (djVar == null || (djVar.c && !djVar.i)) {
                        int i10 = ijVar.D;
                        if (i10 == 1 || i10 == 3 || i10 == 8) {
                            org.telegram.ui.dg0 dg0Var = new org.telegram.ui.dg0(chatActivityEnterView.getContext(), g6Var2);
                            dg0Var.g0 = true;
                            ArrayList arrayList = new ArrayList();
                            if (djVar != null) {
                                ArrayList arrayList2 = djVar.d;
                                int i11 = 0;
                                while (i11 < arrayList2.size()) {
                                    arrayList.add(chatActivityEnterView.d0((org.telegram.messenger.ij) arrayList2.get(i11), i11 == 0));
                                    i11++;
                                }
                            } else {
                                arrayList.add(chatActivityEnterView.d0(ijVar, true));
                            }
                            dg0Var.p(arrayList);
                            l60 F2 = l60.F(chatActivityEnterView.m1, g6Var2, chatActivityEnterView.F1);
                            ia0 ia0Var = new ia0(chatActivityEnterView.getContext(), R.raw.position_below, org.telegram.messenger.id.M0(2131752560, null), R.raw.position_above, org.telegram.messenger.id.M0(2131752559, null), chatActivityEnterView.W3);
                            ia0Var.a(!chatActivityEnterView.R4, false);
                            ia0Var.setOnClickListener(new di.v3(chatActivityEnterView, arrayList, ia0Var, dg0Var, 10));
                            F2.q(ia0Var);
                            F2.Y();
                            dg0Var.o(F2);
                            dg0Var.q(chatActivityEnterView.F1, false, new di.v3(chatActivityEnterView, djVar, ijVar, dg0Var, 11));
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
