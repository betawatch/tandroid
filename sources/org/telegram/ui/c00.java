package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_chatlists;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c00 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ b10 b;

    public /* synthetic */ c00(b10 b10Var, int i10) {
        this.a = i10;
        this.b = b10Var;
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
