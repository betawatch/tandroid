package mh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.qc;
import org.telegram.ui.j31;
import org.telegram.ui.py;
import org.telegram.ui.q31;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ z2(g5 g5Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f = g5Var;
        this.h = fVar;
        this.b = d2Var;
        this.c = tLObject;
        this.n = tL_starGiftUnique;
        this.e = tL_error;
        this.d = j10;
        this.r = charSequence;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                g5.B0((g5) this.f, (af.f) this.h, (org.telegram.ui.ActionBar.d2) this.b, this.c, (TL_stars.TL_starGiftUnique) this.n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.r);
                break;
            case 1:
                py.m0((py) this.f, (org.telegram.ui.ActionBar.d2) this.b, this.c, (TLRPC.User) this.h, (TLRPC.Chat) this.n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            default:
                Context context = (Context) this.f;
                oh.h0 h0Var = (oh.h0) this.h;
                byte[] bArr = (byte[]) this.b;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.n;
                qc qcVar = (qc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.c;
                q31 q31Var = new q31(context, h0Var, this.d, bArr);
                q31Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                q31Var.s = new j31(aVar, qcVar, context, h0Var, dVar);
                q31Var.show();
                break;
        }
    }

    public /* synthetic */ z2(TLObject tLObject, Context context, oh.h0 h0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, qc qcVar, org.telegram.messenger.video.d dVar) {
        this.c = tLObject;
        this.f = context;
        this.h = h0Var;
        this.d = j10;
        this.b = bArr;
        this.n = aVar;
        this.e = qcVar;
        this.r = dVar;
    }

    public /* synthetic */ z2(py pyVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f = pyVar;
        this.b = d2Var;
        this.c = tLObject;
        this.h = user;
        this.n = chat;
        this.d = j10;
        this.e = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }
}
