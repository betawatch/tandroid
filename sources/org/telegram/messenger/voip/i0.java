package org.telegram.messenger.voip;

import ci.ka;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.xr;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i0(int i3, String str, VoIPService voIPService, boolean z10) {
        this.a = 0;
        this.d = voIPService;
        this.b = i3;
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
                org.telegram.messenger.g0.h3(new ka((vr) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 4));
                break;
            default:
                org.telegram.messenger.g0.h3(new ka((xr) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 5));
                break;
        }
    }

    public /* synthetic */ i0(f41 f41Var, int i3, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.a = i10;
        this.d = f41Var;
        this.b = i3;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
