package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                Context context = (Context) obj;
                if (!g0Var.e2) {
                    if (g0Var.g2 != null) {
                        if (g0Var.l1() == null) {
                        }
                    } else if (g0Var.f2 == null || g0Var.m1() == null) {
                    }
                    boolean z9 = g0Var.d2 == org.telegram.messenger.p10.i(g0Var.a).e();
                    k60 F = k60.F(g0Var.c, f6Var, g0Var.x2);
                    F.l(R.drawable.input_notify_off, org.telegram.messenger.hd.M0(2131745584, null), new a(g0Var, 4), !z9);
                    F.c(R.drawable.msg_calendar2, org.telegram.messenger.hd.M0(z9 ? 2131745515 : 2131745860, null), new l2.z0(g0Var, context, f6Var, 25), false);
                    F.Z();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj2;
                org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) obj;
                org.telegram.ui.ActionBar.f6 f6Var2 = chatActivityEnterView.W3;
                if (!ijVar.G3() && (xeVar = chatActivityEnterView.E0) != null && !TextUtils.isEmpty(xeVar.getTextToUse())) {
                    if (djVar == null || (djVar.c && !djVar.i)) {
                        int i10 = ijVar.D;
                        if (i10 == 1 || i10 == 3 || i10 == 8) {
                            org.telegram.ui.bg0 bg0Var = new org.telegram.ui.bg0(chatActivityEnterView.getContext(), f6Var2);
                            bg0Var.g0 = true;
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
                            bg0Var.p(arrayList);
                            k60 F2 = k60.F(chatActivityEnterView.m1, f6Var2, chatActivityEnterView.F1);
                            ha0 ha0Var = new ha0(chatActivityEnterView.getContext(), R.raw.position_below, org.telegram.messenger.hd.M0(2131752560, null), R.raw.position_above, org.telegram.messenger.hd.M0(2131752559, null), chatActivityEnterView.W3);
                            ha0Var.a(!chatActivityEnterView.R4, false);
                            ha0Var.setOnClickListener(new di.u3(chatActivityEnterView, arrayList, ha0Var, bg0Var, 10));
                            F2.q(ha0Var);
                            F2.Y();
                            bg0Var.o(F2);
                            bg0Var.q(chatActivityEnterView.F1, false, new di.u3(chatActivityEnterView, djVar, ijVar, bg0Var, 11));
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
