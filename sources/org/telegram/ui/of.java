package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class of implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ xn b;

    public /* synthetic */ of(xn xnVar, int i10) {
        this.a = i10;
        this.b = xnVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                xn xnVar = this.b;
                MessageObject messageObject3 = xnVar.a5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.ba).k(false).j();
                }
                return true;
            case 1:
                return xn.R0(this.b);
            default:
                xn xnVar2 = this.b;
                int i10 = xnVar2.lb;
                if (i10 == 1 && (messageObject2 = xnVar2.m5) != null) {
                    xnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (xnVar2.c5 == null || i10 != 2 || (messageObject = xnVar2.k5) == null) {
                    return false;
                }
                xnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
