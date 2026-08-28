package org.telegram.messenger.voip;

import gh.m8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i0(int i9, String str, VoIPService voIPService, boolean z10) {
        this.a = 0;
        this.d = voIPService;
        this.b = i9;
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
                AndroidUtilities.runOnUIThread(new m8((hs) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 2));
                break;
            default:
                AndroidUtilities.runOnUIThread(new m8((js) this.d, this.b, (TLRPC.TL_messages_searchGlobal) this.e, this.c, tLObject, 3));
                break;
        }
    }

    public /* synthetic */ i0(z41 z41Var, int i9, TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal, boolean z10, int i10) {
        this.a = i10;
        this.d = z41Var;
        this.b = i9;
        this.e = tL_messages_searchGlobal;
        this.c = z10;
    }
}
