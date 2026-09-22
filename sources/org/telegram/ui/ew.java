package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ew implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ ew(TLObject tLObject, Context context, ai.a1 a1Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.vc vcVar, org.telegram.messenger.video.d dVar) {
        this.b = tLObject;
        this.d = context;
        this.e = a1Var;
        this.c = j3;
        this.f = bArr;
        this.h = aVar;
        this.n = vcVar;
        this.r = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uy.n0((uy) this.d, (org.telegram.ui.ActionBar.b2) this.e, this.b, (TLRPC.User) this.f, (TLRPC.Chat) this.h, this.c, (TLRPC.TL_error) this.n, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            case 1:
                Context context = (Context) this.d;
                ai.a1 a1Var = (ai.a1) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.h;
                org.telegram.ui.Components.vc vcVar = (org.telegram.ui.Components.vc) this.n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.b;
                c41 c41Var = new c41(context, a1Var, this.c, bArr);
                c41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                c41Var.s = new v31(aVar, vcVar, context, a1Var, dVar);
                c41Var.show();
                break;
            default:
                yh.z3.C0((yh.z3) this.d, (nf.e) this.f, (org.telegram.ui.ActionBar.b2) this.e, this.b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.n, this.c, (CharSequence) this.r);
                break;
        }
    }

    public /* synthetic */ ew(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.e = b2Var;
        this.b = tLObject;
        this.f = user;
        this.h = chat;
        this.c = j3;
        this.n = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ ew(yh.z3 z3Var, nf.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = z3Var;
        this.f = eVar;
        this.e = b2Var;
        this.b = tLObject;
        this.h = tL_starGiftUnique;
        this.n = tL_error;
        this.c = j3;
        this.r = charSequence;
    }
}
