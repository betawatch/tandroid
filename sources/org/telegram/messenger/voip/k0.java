package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k0(int i10, String str, VoIPService voIPService, boolean z10) {
        this.a = 0;
        this.d = voIPService;
        this.b = i10;
        this.c = z10;
        this.e = str;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$54(this.b, this.c, (String) this.e, tLObject, tL_error);
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new m4.e0((rs) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((ts) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 3));
                break;
        }
    }

    public /* synthetic */ k0(w51 w51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = w51Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
