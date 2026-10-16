package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                return e0.Y((e0) this.b, (org.telegram.ui.ActionBar.c6) this.c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = chatActivityEnterView.W3;
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
                org.telegram.ui.gj0 gj0Var = new org.telegram.ui.gj0(chatActivityEnterView.getContext(), c6Var);
                gj0Var.h0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    int i11 = 0;
                    while (i11 < groupedMessages.messages.size()) {
                        arrayList.add(chatActivityEnterView.e0(groupedMessages.messages.get(i11), i11 == 0));
                        i11++;
                    }
                } else {
                    arrayList.add(chatActivityEnterView.e0(messageObject, true));
                }
                gj0Var.q(arrayList);
                l80 F = l80.F(chatActivityEnterView.m1, c6Var, chatActivityEnterView.F1);
                uc0 uc0Var = new uc0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.W3);
                uc0Var.a(!chatActivityEnterView.R4, false);
                uc0Var.setOnClickListener(new bi.b5(chatActivityEnterView, arrayList, uc0Var, gj0Var, 10));
                F.q(uc0Var);
                F.Y();
                gj0Var.p(F);
                gj0Var.r(chatActivityEnterView.F1, false, new bi.b5(chatActivityEnterView, groupedMessages, messageObject, gj0Var, 11));
                gj0Var.show();
                return true;
        }
    }
}
