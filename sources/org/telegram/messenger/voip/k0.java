package org.telegram.messenger.voip;

import di.z9;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.p41;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k0(int i7, String str, VoIPService voIPService, boolean z10) {
        this.a = 0;
        this.d = voIPService;
        this.b = i7;
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
                org.telegram.messenger.g0.h3(new z9((bs) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 3));
                break;
            default:
                org.telegram.messenger.g0.h3(new z9((ds) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 4));
                break;
        }
    }

    public /* synthetic */ k0(p41 p41Var, int i7, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.a = i10;
        this.d = p41Var;
        this.b = i7;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
