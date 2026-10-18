package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ pf(sn snVar, int i10) {
        this.a = i10;
        this.b = snVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                sn snVar = this.b;
                MessageObject messageObject3 = snVar.d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.ea).k(false).j();
                }
                return true;
            case 1:
                return sn.W(this.b);
            default:
                sn snVar2 = this.b;
                int i10 = snVar2.ob;
                if (i10 == 1 && (messageObject2 = snVar2.p5) != null) {
                    snVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (snVar2.f5 == null || i10 != 2 || (messageObject = snVar2.n5) == null) {
                    return false;
                }
                snVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
