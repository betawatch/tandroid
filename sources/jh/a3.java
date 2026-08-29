package jh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.tc;
import org.telegram.ui.fy;
import org.telegram.ui.q21;
import org.telegram.ui.y21;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ a3(h5 h5Var, ye.c cVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f = h5Var;
        this.h = cVar;
        this.b = c2Var;
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
                h5.B0((h5) this.f, (ye.c) this.h, (org.telegram.ui.ActionBar.c2) this.b, this.c, (TL_stars.TL_starGiftUnique) this.n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.r);
                break;
            case 1:
                fy.m0((fy) this.f, (org.telegram.ui.ActionBar.c2) this.b, this.c, (TLRPC.User) this.h, (TLRPC.Chat) this.n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            default:
                Context context = (Context) this.f;
                lh.h0 h0Var = (lh.h0) this.h;
                byte[] bArr = (byte[]) this.b;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.n;
                tc tcVar = (tc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.c;
                y21 y21Var = new y21(context, h0Var, this.d, bArr);
                y21Var.O(tL_channels_sponsoredMessageReportResultChooseOption);
                y21Var.s = new q21(aVar, tcVar, context, h0Var, dVar);
                y21Var.show();
                break;
        }
    }

    public /* synthetic */ a3(TLObject tLObject, Context context, lh.h0 h0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, tc tcVar, org.telegram.messenger.video.d dVar) {
        this.c = tLObject;
        this.f = context;
        this.h = h0Var;
        this.d = j10;
        this.b = bArr;
        this.n = aVar;
        this.e = tcVar;
        this.r = dVar;
    }

    public /* synthetic */ a3(fy fyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f = fyVar;
        this.b = c2Var;
        this.c = tLObject;
        this.h = user;
        this.n = chat;
        this.d = j10;
        this.e = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }
}
