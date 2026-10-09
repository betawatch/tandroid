package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.sa0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class s8 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ sa0 b;
    public final /* synthetic */ m9 c;

    public s8(m9 m9Var, long j3, sa0 sa0Var) {
        this.c = m9Var;
        this.a = j3;
        this.b = sa0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new r8(this, tLObject, this.a, this.b, 1));
    }
}
