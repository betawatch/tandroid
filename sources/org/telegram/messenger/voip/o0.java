package org.telegram.messenger.voip;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ o0(int i10, String str, VoIPService voIPService, boolean z10) {
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
                org.telegram.messenger.i0.g3(new ig.o0((gs) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 3));
                break;
            default:
                org.telegram.messenger.i0.g3(new ig.o0((is) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 4));
                break;
        }
    }

    public /* synthetic */ o0(q51 q51Var, int i10, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i11) {
        this.a = i11;
        this.d = q51Var;
        this.b = i10;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
