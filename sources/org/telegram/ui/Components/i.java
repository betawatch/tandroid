package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                return e0.X((e0) this.b, (org.telegram.ui.ActionBar.d6) this.c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = chatActivityEnterView.V3;
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
                org.telegram.ui.wi0 wi0Var = new org.telegram.ui.wi0(chatActivityEnterView.getContext(), d6Var);
                wi0Var.h0 = true;
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
                wi0Var.q(arrayList);
                o70 F = o70.F(chatActivityEnterView.l1, d6Var, chatActivityEnterView.E1);
                tb0 tb0Var = new tb0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.V3);
                tb0Var.a(!chatActivityEnterView.R4, false);
                tb0Var.setOnClickListener(new ai.o5(chatActivityEnterView, arrayList, tb0Var, wi0Var, 10));
                F.q(tb0Var);
                F.Y();
                wi0Var.p(F);
                wi0Var.r(chatActivityEnterView.E1, false, new ai.o5(chatActivityEnterView, groupedMessages, messageObject, wi0Var, 11));
                wi0Var.show();
                return true;
        }
    }
}
