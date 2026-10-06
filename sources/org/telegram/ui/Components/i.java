package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        rf rfVar;
        switch (this.a) {
            case 0:
                return e0.W((e0) this.b, (org.telegram.ui.ActionBar.d6) this.c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = chatActivityEnterView.W3;
                if (messageObject.isMediaEmpty() || (rfVar = chatActivityEnterView.E0) == null || TextUtils.isEmpty(rfVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.zi0 zi0Var = new org.telegram.ui.zi0(chatActivityEnterView.getContext(), d6Var);
                zi0Var.h0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    int i11 = 0;
                    while (i11 < groupedMessages.messages.size()) {
                        arrayList.add(chatActivityEnterView.g0(groupedMessages.messages.get(i11), i11 == 0));
                        i11++;
                    }
                } else {
                    arrayList.add(chatActivityEnterView.g0(messageObject, true));
                }
                zi0Var.q(arrayList);
                b80 F = b80.F(chatActivityEnterView.m1, d6Var, chatActivityEnterView.F1);
                hc0 hc0Var = new hc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                hc0Var.a(!chatActivityEnterView.R4, false);
                hc0Var.setOnClickListener(new ai.o5(chatActivityEnterView, arrayList, hc0Var, zi0Var, 10));
                F.q(hc0Var);
                F.Y();
                zi0Var.p(F);
                zi0Var.r(chatActivityEnterView.F1, false, new ai.o5(chatActivityEnterView, groupedMessages, messageObject, zi0Var, 11));
                zi0Var.show();
                return true;
        }
    }
}
