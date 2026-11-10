package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        we weVar;
        int i7 = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i7) {
            case 0:
                f0 f0Var = (f0) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj2;
                Context context = (Context) obj;
                if (!f0Var.h2) {
                    if (f0Var.j2 != null) {
                        if (f0Var.l1() == null) {
                        }
                    } else if (f0Var.i2 == null || f0Var.m1() == null) {
                    }
                    boolean z9 = f0Var.g2 == org.telegram.messenger.p10.i(f0Var.a).e();
                    k60 F = k60.F(f0Var.c, h6Var, f0Var.A2);
                    F.l(R.drawable.input_notify_off, org.telegram.messenger.id.M0(2131745583, null), new a(f0Var, 4), !z9);
                    F.c(R.drawable.msg_calendar2, org.telegram.messenger.id.M0(z9 ? 2131745514 : 2131745859, null), new l2.z0(f0Var, context, h6Var, 25), false);
                    F.Z();
                    break;
                }
                break;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                org.telegram.messenger.ij ijVar = (org.telegram.messenger.ij) obj2;
                org.telegram.messenger.dj djVar = (org.telegram.messenger.dj) obj;
                org.telegram.ui.ActionBar.h6 h6Var2 = chatActivityEnterView.W3;
                if (!ijVar.F3() && (weVar = chatActivityEnterView.E0) != null && !TextUtils.isEmpty(weVar.getTextToUse())) {
                    if (djVar == null || (djVar.c && !djVar.i)) {
                        int i10 = ijVar.D;
                        if (i10 == 1 || i10 == 3 || i10 == 8) {
                            org.telegram.ui.eg0 eg0Var = new org.telegram.ui.eg0(chatActivityEnterView.getContext(), h6Var2);
                            eg0Var.g0 = true;
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
                            eg0Var.p(arrayList);
                            k60 F2 = k60.F(chatActivityEnterView.m1, h6Var2, chatActivityEnterView.F1);
                            ha0 ha0Var = new ha0(chatActivityEnterView.getContext(), R.raw.position_below, org.telegram.messenger.id.M0(2131752560, null), R.raw.position_above, org.telegram.messenger.id.M0(2131752559, null), chatActivityEnterView.W3);
                            ha0Var.a(!chatActivityEnterView.R4, false);
                            ha0Var.setOnClickListener(new di.v3(chatActivityEnterView, arrayList, ha0Var, eg0Var, 10));
                            F2.q(ha0Var);
                            F2.Y();
                            eg0Var.o(F2);
                            eg0Var.q(chatActivityEnterView.F1, false, new di.v3(chatActivityEnterView, djVar, ijVar, eg0Var, 11));
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
