package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.gi0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class u0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ u0(int i10, bi.d dVar, org.telegram.ui.ActionBar.h3 h3Var, long j3) {
        this.a = 3;
        this.b = i10;
        this.d = dVar;
        this.e = h3Var;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                ((ChatMessagesMetadataController) this.d).lambda$loadStoriesForMessages$2(this.b, (MessageObject) this.e, this.c, tLObject, tL_error);
                break;
            case 1:
                ((MediaDataController) this.d).lambda$loadStickers$101(this.b, (Utilities.Callback) this.e, this.c, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.d).lambda$checkPromoInfoInternal$167(this.b, (TLRPC.TL_help_promoData) this.e, this.c, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new di.s3(tLObject, this.b, (bi.d) this.d, (org.telegram.ui.ActionBar.h3) this.e, this.c, tL_error));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new di.s3((gi0) this.d, tL_error, tLObject, this.c, this.b, (TLRPC.Chat) this.e, 4));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new k0((xh.p) this.d, (xh.o) this.e, this.b, tLObject, this.c, 10));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new p7((bi.d) this.d, (org.telegram.ui.ActionBar.h3[]) this.e, this.b, this.c, 14));
                break;
            default:
                AndroidUtilities.runOnUIThread(new k0((zh.i5) this.d, tLObject, this.b, (String) this.e, this.c, 12));
                break;
        }
    }

    public /* synthetic */ u0(Object obj, int i10, Object obj2, long j3, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = i10;
        this.e = obj2;
        this.c = j3;
    }

    public /* synthetic */ u0(Object obj, Object obj2, int i10, long j3, int i11) {
        this.a = i11;
        this.d = obj;
        this.e = obj2;
        this.b = i10;
        this.c = j3;
    }

    public /* synthetic */ u0(gi0 gi0Var, long j3, int i10, TLRPC.Chat chat) {
        this.a = 4;
        this.d = gi0Var;
        this.c = j3;
        this.b = i10;
        this.e = chat;
    }
}
