package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ n00 b;

    public /* synthetic */ oz(n00 n00Var, int i9) {
        this.a = i9;
        this.b = n00Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                this.b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            default:
                this.b.k0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
        }
    }
}
