package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ nf(qn qnVar, int i10) {
        this.a = i10;
        this.b = qnVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                MessageObject messageObject3 = qnVar.d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qnVar.getParentActivity()), qnVar.ea).k(false).j();
                }
                return true;
            case 1:
                return qn.W(this.b);
            default:
                qn qnVar2 = this.b;
                int i10 = qnVar2.ob;
                if (i10 == 1 && (messageObject2 = qnVar2.p5) != null) {
                    qnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (qnVar2.f5 == null || i10 != 2 || (messageObject = qnVar2.n5) == null) {
                    return false;
                }
                qnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
