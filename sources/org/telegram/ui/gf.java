package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn b;

    public /* synthetic */ gf(tn tnVar, int i10) {
        this.a = i10;
        this.b = tnVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                tn tnVar = this.b;
                MessageObject messageObject3 = tnVar.Z4;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(tnVar.getParentActivity()), tnVar.aa).k(false).j();
                }
                return true;
            case 1:
                return tn.R0(this.b);
            default:
                tn tnVar2 = this.b;
                int i10 = tnVar2.kb;
                if (i10 == 1 && (messageObject2 = tnVar2.l5) != null) {
                    tnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (tnVar2.b5 == null || i10 != 2 || (messageObject = tnVar2.j5) == null) {
                    return false;
                }
                tnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
