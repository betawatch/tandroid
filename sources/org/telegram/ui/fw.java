package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class fw implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ TLObject b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ fw(TLObject tLObject, Context context, bi.s0 s0Var, long j3, byte[] bArr, org.telegram.messenger.video.a aVar, org.telegram.ui.Components.yc ycVar, org.telegram.messenger.video.d dVar) {
        this.b = tLObject;
        this.d = context;
        this.e = s0Var;
        this.c = j3;
        this.f = bArr;
        this.h = aVar;
        this.n = ycVar;
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
                bi.s0 s0Var = (bi.s0) this.e;
                byte[] bArr = (byte[]) this.f;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.h;
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.n;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.b;
                e41 e41Var = new e41(context, s0Var, this.c, bArr);
                e41Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                e41Var.s = new x31(aVar, ycVar, context, s0Var, dVar);
                e41Var.show();
                break;
            default:
                zh.w3.C0((zh.w3) this.d, (of.e) this.f, (org.telegram.ui.ActionBar.b2) this.e, this.b, (TL_stars.TL_starGiftUnique) this.h, (TLRPC.TL_error) this.n, this.c, (CharSequence) this.r);
                break;
        }
    }

    public /* synthetic */ fw(uy uyVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j3, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.d = uyVar;
        this.e = b2Var;
        this.b = tLObject;
        this.f = user;
        this.h = chat;
        this.c = j3;
        this.n = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }

    public /* synthetic */ fw(zh.w3 w3Var, of.e eVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j3, CharSequence charSequence) {
        this.d = w3Var;
        this.f = eVar;
        this.e = b2Var;
        this.b = tLObject;
        this.h = tL_starGiftUnique;
        this.n = tL_error;
        this.c = j3;
        this.r = charSequence;
    }
}
