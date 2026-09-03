package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        ff ffVar;
        switch (this.a) {
            case 0:
                return f0.X((f0) this.b, (org.telegram.ui.ActionBar.g6) this.c, (Context) this.d);
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.b;
                MessageObject messageObject = (MessageObject) this.c;
                MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = chatActivityEnterView.S3;
                if (messageObject.isMediaEmpty() || (ffVar = chatActivityEnterView.B0) == null || TextUtils.isEmpty(ffVar.getTextToUse())) {
                    return false;
                }
                if (groupedMessages != null && (!groupedMessages.hasCaption || groupedMessages.isDocuments)) {
                    return false;
                }
                int i10 = messageObject.type;
                if (i10 != 1 && i10 != 3 && i10 != 8) {
                    return false;
                }
                org.telegram.ui.ti0 ti0Var = new org.telegram.ui.ti0(chatActivityEnterView.getContext(), g6Var);
                ti0Var.e0 = true;
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
                ti0Var.q(arrayList);
                q70 F = q70.F(chatActivityEnterView.i1, g6Var, chatActivityEnterView.B1);
                xb0 xb0Var = new xb0(chatActivityEnterView.getContext(), R.raw.position_below, LocaleController.getString(R.string.CaptionAbove), R.raw.position_above, LocaleController.getString(R.string.CaptionBelow), chatActivityEnterView.S3);
                xb0Var.a(!chatActivityEnterView.N4, false);
                xb0Var.setOnClickListener(new lh.u3(chatActivityEnterView, arrayList, xb0Var, ti0Var, 8));
                F.q(xb0Var);
                F.Y();
                ti0Var.p(F);
                ti0Var.r(chatActivityEnterView.B1, false, new lh.u3(chatActivityEnterView, groupedMessages, messageObject, ti0Var, 9));
                ti0Var.show();
                return true;
        }
    }
}
