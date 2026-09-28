package org.telegram.messenger.voip;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.vs;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
                AndroidUtilities.runOnUIThread(new m4.e0((ts) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new m4.e0((vs) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 3));
                break;
        }
    }

    public /* synthetic */ k0(l61 l61Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = l61Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
