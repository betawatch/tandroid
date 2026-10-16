package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ag implements View.OnLongClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo b;

    public /* synthetic */ ag(fo foVar, int i10) {
        this.a = i10;
        this.b = foVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.a) {
            case 0:
                fo foVar = this.b;
                MessageObject messageObject3 = foVar.d5;
                if (messageObject3 == null) {
                    return false;
                }
                if (AndroidUtilities.addToClipboard(messageObject3.sponsoredUrl)) {
                    new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(foVar.getParentActivity()), foVar.ea).k(false).j();
                }
                return true;
            case 1:
                return fo.W(this.b);
            default:
                fo foVar2 = this.b;
                int i10 = foVar2.ob;
                if (i10 == 1 && (messageObject2 = foVar2.p5) != null) {
                    foVar2.j(messageObject2.getId(), 0, true, 0, true, 0);
                    return true;
                }
                if (foVar2.f5 == null || i10 != 2 || (messageObject = foVar2.n5) == null) {
                    return false;
                }
                foVar2.j(messageObject.getId(), 0, true, 0, true, 0);
                return true;
        }
    }
}
