package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oz implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ o00 b;

    public /* synthetic */ oz(o00 o00Var, int i10) {
        this.a = i10;
        this.b = o00Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                this.b.o0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            default:
                this.b.n0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
        }
    }
}
