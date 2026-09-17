package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f00 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ f10 b;

    public /* synthetic */ f00(f10 f10Var, int i10) {
        this.a = i10;
        this.b = f10Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                this.b.m0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
            default:
                this.b.l0((TL_chatlists.TL_exportedChatlistInvite) obj);
                break;
        }
    }
}
