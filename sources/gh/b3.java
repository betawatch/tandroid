package gh;

import android.content.Context;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oc;
import org.telegram.ui.dy;
import org.telegram.ui.q21;
import org.telegram.ui.y21;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class b3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;

    public /* synthetic */ b3(k5 k5Var, ve.d dVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        this.f = k5Var;
        this.h = dVar;
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
                k5.A0((k5) this.f, (ve.d) this.h, (org.telegram.ui.ActionBar.c2) this.b, this.c, (TL_stars.TL_starGiftUnique) this.n, (TLRPC.TL_error) this.e, this.d, (CharSequence) this.r);
                break;
            case 1:
                dy.l0((dy) this.f, (org.telegram.ui.ActionBar.c2) this.b, this.c, (TLRPC.User) this.h, (TLRPC.Chat) this.n, this.d, (TLRPC.TL_error) this.e, (TLRPC.TL_messages_checkHistoryImportPeer) this.r);
                break;
            default:
                Context context = (Context) this.f;
                ih.j0 j0Var = (ih.j0) this.h;
                byte[] bArr = (byte[]) this.b;
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.n;
                oc ocVar = (oc) this.e;
                org.telegram.messenger.video.d dVar = (org.telegram.messenger.video.d) this.r;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.c;
                y21 y21Var = new y21(context, j0Var, this.d, bArr);
                y21Var.N(tL_channels_sponsoredMessageReportResultChooseOption);
                y21Var.s = new q21(aVar, ocVar, context, j0Var, dVar);
                y21Var.show();
                break;
        }
    }

    public /* synthetic */ b3(TLObject tLObject, Context context, ih.j0 j0Var, long j10, byte[] bArr, org.telegram.messenger.video.a aVar, oc ocVar, org.telegram.messenger.video.d dVar) {
        this.c = tLObject;
        this.f = context;
        this.h = j0Var;
        this.d = j10;
        this.b = bArr;
        this.n = aVar;
        this.e = ocVar;
        this.r = dVar;
    }

    public /* synthetic */ b3(dy dyVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, long j10, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        this.f = dyVar;
        this.b = c2Var;
        this.c = tLObject;
        this.h = user;
        this.n = chat;
        this.d = j10;
        this.e = tL_error;
        this.r = tL_messages_checkHistoryImportPeer;
    }
}
