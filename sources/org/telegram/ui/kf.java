package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ qn b;

    public /* synthetic */ kf(qn qnVar, int i9) {
        this.a = i9;
        this.b = qnVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                qn qnVar = this.b;
                MessageObject messageObject3 = qnVar.Z4;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(qnVar.getParentActivity()), qnVar.aa).k(false).j();
                }
                return true;
            case 1:
                return qn.R0(this.b);
            default:
                qn qnVar2 = this.b;
                int i9 = qnVar2.kb;
                if (i9 == 1 && (messageObject2 = qnVar2.l5) != null) {
                    qnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (qnVar2.b5 == null || i9 != 2 || (messageObject = qnVar2.j5) == null) {
                    return false;
                }
                qnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
