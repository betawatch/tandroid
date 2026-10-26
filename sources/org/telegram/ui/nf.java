package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nf implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ un b;

    public /* synthetic */ nf(un unVar, int i10) {
        this.a = i10;
        this.b = unVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                un unVar = this.b;
                MessageObject messageObject3 = unVar.p5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(unVar.getParentActivity()), unVar.qa).k(false).j();
                }
                return true;
            case 1:
                return un.g1(this.b);
            default:
                un unVar2 = this.b;
                int i10 = unVar2.Kb;
                if (i10 == 1 && (messageObject2 = unVar2.B5) != null) {
                    unVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (unVar2.r5 == null || i10 != 2 || (messageObject = unVar2.z5) == null) {
                    return false;
                }
                unVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
