package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
