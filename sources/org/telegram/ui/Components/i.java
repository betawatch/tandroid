package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        of ofVar;
        switch (this.a) {
            case 0:
                return e0.X((e0) this.b, (org.telegram.ui.ActionBar.e6) this.c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = chatActivityEnterView.V3;
                if (messageObject.isMediaEmpty() || (ofVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(ofVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.bj0 bj0Var = new org.telegram.ui.bj0(chatActivityEnterView.getContext(), e6Var);
                bj0Var.h0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    int i11 = 0;
                    while (i11 < groupedMessages.messages.size()) {
                        arrayList.add(chatActivityEnterView.h0(groupedMessages.messages.get(i11), i11 == 0));
                        i11++;
                    }
                } else {
                    arrayList.add(chatActivityEnterView.h0(messageObject, true));
                }
                bj0Var.q(arrayList);
                n70 F = n70.F(chatActivityEnterView.l1, e6Var, chatActivityEnterView.E1);
                ub0 ub0Var = new ub0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.V3);
                ub0Var.a(!chatActivityEnterView.R4, false);
                ub0Var.setOnClickListener(new ai.p5(chatActivityEnterView, arrayList, ub0Var, bj0Var, 10));
                F.q(ub0Var);
                F.Y();
                bj0Var.p(F);
                bj0Var.r(chatActivityEnterView.E1, false, new ai.p5(chatActivityEnterView, groupedMessages, messageObject, bj0Var, 11));
                bj0Var.show();
                return true;
        }
    }
}
