package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wn b;

    public /* synthetic */ mf(wn wnVar, int i10) {
        this.a = i10;
        this.b = wnVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                wn wnVar = this.b;
                MessageObject messageObject3 = wnVar.t5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.ua).k(false).j();
                }
                return true;
            case 1:
                return wn.a0(this.b);
            default:
                wn wnVar2 = this.b;
                int i10 = wnVar2.Ob;
                if (i10 == 1 && (messageObject2 = wnVar2.F5) != null) {
                    wnVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (wnVar2.v5 == null || i10 != 2 || (messageObject = wnVar2.D5) == null) {
                    return false;
                }
                wnVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
