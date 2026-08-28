package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        ff ffVar;
        switch (this.a) {
            case 0:
                return e0.W((e0) this.b, (org.telegram.ui.ActionBar.b6) this.c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = chatActivityEnterView.R3;
                if (messageObject.isMediaEmpty() || (ffVar = chatActivityEnterView.A0) == null || TextUtils.isEmpty(ffVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i9 = messageObject.type;
                if (i9 != 1 && i9 != 3 && i9 != 8) {
                    return false;
                }
                org.telegram.ui.li0 li0Var = new org.telegram.ui.li0(chatActivityEnterView.getContext(), b6Var);
                li0Var.d0 = true;
                ArrayList arrayList = new ArrayList();
                if (groupedMessages != null) {
                    int i10 = 0;
                    while (i10 < groupedMessages.messages.size()) {
                        arrayList.add(chatActivityEnterView.f0(groupedMessages.messages.get(i10), i10 == 0));
                        i10++;
                    }
                } else {
                    arrayList.add(chatActivityEnterView.f0(messageObject, true));
                }
                li0Var.q(arrayList);
                x60 F = x60.F(chatActivityEnterView.h1, b6Var, chatActivityEnterView.A1);
                bb0 bb0Var = new bb0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.R3);
                bb0Var.a(!chatActivityEnterView.M4, false);
                bb0Var.setOnClickListener(new fh.g4(chatActivityEnterView, arrayList, bb0Var, li0Var, 11));
                F.q(bb0Var);
                F.Y();
                li0Var.p(F);
                li0Var.r(chatActivityEnterView.A1, false, new fh.g4(chatActivityEnterView, groupedMessages, messageObject, li0Var, 12));
                li0Var.show();
                return true;
        }
    }
}
