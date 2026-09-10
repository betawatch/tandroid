package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class gw implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ gw(TLObject tLObject, Context context, org.telegram.ui.Components.bq0 bq0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.wc wcVar, org.telegram.messenger.video.d dVar) {
        this.b = tLObject;
        this.d = context;
        this.e = bq0Var;
        this.c = j3;
        this.f = bArr;
        this.h = aVar;
        this.n = wcVar;
        this.r = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wy.n0((wy) this.d, (org.telegram.ui.ActionBar.d2) this.e, this.b, (TLRPC.User) this.f, (TLRPC.Chat) this.h, this.c, (TLRPC.TL_error) this.n, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            case 1:
                Context context = (Context) this.d;
                org.telegram.ui.Components.bq0 bq0Var = (org.telegram.ui.Components.bq0) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.h;
                org.telegram.ui.Components.wc wcVar = (org.telegram.ui.Components.wc) this.n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.b;
                h41 h41Var = new h41(context, bq0Var, this.c, bArr);
                h41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                h41Var.s = new a41(aVar, wcVar, context, bq0Var, dVar);
                h41Var.show();
                break;
            default:
                xh.x3.C0((xh.x3) this.d, (nf.e) this.f, (org.telegram.ui.ActionBar.d2) this.e, this.b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.n, this.c, (CharSequence) this.r);
                break;
        }
    }

    public /* synthetic */ gw(wy wyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = wyVar;
        this.e = d2Var;
        this.b = tLObject;
        this.f = user;
        this.h = chat;
        this.c = j3;
        this.n = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ gw(xh.x3 x3Var, nf.e eVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = x3Var;
        this.f = eVar;
        this.e = d2Var;
        this.b = tLObject;
        this.h = tL_starGiftUnique;
        this.n = tL_error;
        this.c = j3;
        this.r = charSequence;
    }
}
