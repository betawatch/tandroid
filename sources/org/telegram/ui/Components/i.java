package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
        pf pfVar;
        switch (this.a) {
            case 0:
                return e0.X((e0) this.b, (org.telegram.ui.ActionBar.u6) this.c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.u6 u6Var = chatActivityEnterView.W3;
                if (messageObject.isMediaEmpty() || (pfVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(pfVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.pi0 pi0Var = new org.telegram.ui.pi0(chatActivityEnterView.getContext(), u6Var);
                pi0Var.g0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    int i11 = 0;
                    while (i11 < groupedMessages.messages.size()) {
                        arrayList.add(chatActivityEnterView.c0(groupedMessages.messages.get(i11), i11 == 0));
                        i11++;
                    }
                } else {
                    arrayList.add(chatActivityEnterView.c0(messageObject, true));
                }
                pi0Var.p(arrayList);
                l80 F = l80.F(chatActivityEnterView.m1, u6Var, chatActivityEnterView.F1);
                nc0 nc0Var = new nc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                nc0Var.a(!chatActivityEnterView.R4, false);
                nc0Var.setOnClickListener(new di.c4(chatActivityEnterView, arrayList, nc0Var, pi0Var, 10));
                F.q(nc0Var);
                F.Y();
                pi0Var.o(F);
                pi0Var.q(chatActivityEnterView.F1, false, new di.c4(chatActivityEnterView, groupedMessages, messageObject, pi0Var, 11));
                pi0Var.show();
                return true;
        }
    }
}
