// default package

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class e21 implements Runnable {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ e21(f21 f21Var, w49 w49Var, boolean z, int i, int i2) {
        this.e = f21Var;
        this.f = w49Var;
        this.d = z;
        this.b = i;
        this.c = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e4, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Document e;
        byte b = this.a;
        r2 = null;
        TL_stars.TL_starGiftUnique tL_starGiftUnique = null;
        boolean z = this.d;
        int i = this.c;
        int i2 = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        byte b2 = 1;
        switch (b) {
            case 0:
                f21 f21Var = (f21) obj2;
                w49 w49Var = (w49) obj;
                e Q = LaunchActivity.Q();
                long j = w49Var.g;
                int i3 = yac.t0;
                if (j == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(i3).r.get(w49Var.f);
                    if (tL_availableReaction != null) {
                        e = tL_availableReaction.activate_animation;
                    }
                } else {
                    e = wl.e(i3, j);
                }
                if (e != null && Q != null) {
                    d31.b0(Q).y(f21Var.a.h, e, z ? new bt(i2, i, Q, b2) : null).k(true);
                    break;
                }
                break;
            case 1:
                zu1 zu1Var = (zu1) obj2;
                i49 i49Var = (i49) obj;
                n8 n8Var = zu1Var.g9;
                if (n8Var != null && zu1Var.fragmentView != null && !n8Var.isShowing()) {
                    Activity parentActivity = zu1Var.getParentActivity();
                    Typeface typeface = hl.a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        zu1Var.g9.showAtLocation(zu1Var.A0, 51, i2, i);
                        zu1Var.n8(zu1Var.g9);
                        if (z && i49Var != null) {
                            i49Var.p(true);
                        }
                        hl.d3(new gn1(zu1Var, (byte) 16), 420L);
                        break;
                    }
                }
                break;
            case 2:
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    uc7.s1(i2).j4(tL_payments_uniqueStarGift.users, false);
                    uc7.s1(i2).c4(tL_payments_uniqueStarGift.chats, false);
                    TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    }
                }
                if (tL_starGiftUnique != null) {
                    String str2 = tL_starGiftUnique.owner_address;
                    if (!z) {
                        break;
                    } else if (c.b(str2, c.C(i2).x())) {
                        c.C(i2).A().i(tL_starGiftUnique);
                        jxa.v(i2, false).b0(tL_starGiftUnique);
                        jxa.v(i2, false).M(yac.h(i2).e());
                        break;
                    }
                }
                int i4 = i + 1;
                if (i4 < it7.c.length) {
                    hl.d3(new no1(i2, i4, str, z), r0[i4]);
                    break;
                }
                break;
            default:
                r7a r7aVar = (r7a) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                r7aVar.getMediaDataController().x0(message.dialog_id);
                r7aVar.getNotificationCenter().k(21, Integer.valueOf(i2), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i), Boolean.valueOf(z));
                r7aVar.getNotificationCenter().k(22, Integer.valueOf(i2), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i), Boolean.valueOf(z));
                r7aVar.c0(i2);
                r7aVar.h0(i2, z);
                break;
        }
    }

    public /* synthetic */ e21(zu1 zu1Var, int i, int i2, boolean z, i49 i49Var) {
        this.e = zu1Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.f = i49Var;
    }

    public /* synthetic */ e21(r7a r7aVar, TLRPC.Message message, int i, int i2, boolean z) {
        this.e = r7aVar;
        this.f = message;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public /* synthetic */ e21(TLObject tLObject, int i, boolean z, int i2, String str) {
        this.e = tLObject;
        this.b = i;
        this.d = z;
        this.c = i2;
        this.f = str;
    }
}
