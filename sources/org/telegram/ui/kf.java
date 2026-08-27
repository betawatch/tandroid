package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rn b;

    public /* synthetic */ kf(rn rnVar, int i10) {
        this.a = i10;
        this.b = rnVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                rn rnVar = this.b;
                MessageObject messageObject3 = rnVar.Z4;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(rnVar.getParentActivity()), rnVar.aa).k(false).j();
                }
                return true;
            case 1:
                return rn.R0(this.b);
            default:
                rn rnVar2 = this.b;
                int i10 = rnVar2.kb;
                if (i10 == 1 && (messageObject2 = rnVar2.l5) != null) {
                    rnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (rnVar2.b5 == null || i10 != 2 || (messageObject = rnVar2.j5) == null) {
                    return false;
                }
                rnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
