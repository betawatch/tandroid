package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn b;

    public /* synthetic */ nf(sn snVar, int i10) {
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
                MessageObject messageObject3 = snVar.p5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.qa).k(false).j();
                }
                return true;
            case 1:
                return sn.W(this.b);
            default:
                sn snVar2 = this.b;
                int i10 = snVar2.Bb;
                if (i10 == 1 && (messageObject2 = snVar2.B5) != null) {
                    snVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (snVar2.r5 == null || i10 != 2 || (messageObject = snVar2.z5) == null) {
                    return false;
                }
                snVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
