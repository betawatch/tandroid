// default package

import android.app.Activity;
import android.graphics.Typeface;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class d31 implements Runnable {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d31(e31 e31Var, k39 k39Var, boolean z, int i, int i2) {
        this.e = e31Var;
        this.f = k39Var;
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
                e31 e31Var = (e31) obj2;
                k39 k39Var = (k39) obj;
                d Q = LaunchActivity.Q();
                long j = k39Var.g;
                int i3 = z8c.t0;
                if (j == 0) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(i3).r.get(k39Var.f);
                    if (tL_availableReaction != null) {
                        e = tL_availableReaction.activate_animation;
                    }
                } else {
                    e = vm.e(i3, j);
                }
                if (e != null && Q != null) {
                    c41.b0(Q).y(e31Var.a.h, e, z ? new cu(i2, i, Q, b2) : null).k(true);
                    break;
                }
                break;
            case 1:
                yv1 yv1Var = (yv1) obj2;
                v29 v29Var = (v29) obj;
                m8 m8Var = yv1Var.g9;
                if (m8Var != null && yv1Var.fragmentView != null && !m8Var.isShowing()) {
                    Activity parentActivity = yv1Var.getParentActivity();
                    Typeface typeface = gm.a;
                    if (parentActivity != null && !parentActivity.isDestroyed() && !parentActivity.isFinishing()) {
                        yv1Var.g9.showAtLocation(yv1Var.A0, 51, i2, i);
                        yv1Var.m8(yv1Var.g9);
                        if (z && v29Var != null) {
                            v29Var.p(true);
                        }
                        gm.d3(new en1(yv1Var, (byte) 18), 420L);
                        break;
                    }
                }
                break;
            case 2:
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
                    TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
                    oc7.r1(i2).d4(tL_payments_uniqueStarGift.users, false);
                    oc7.r1(i2).X3(tL_payments_uniqueStarGift.chats, false);
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
                        jva.v(i2, false).a0(tL_starGiftUnique);
                        jva.v(i2, false).M(z8c.h(i2).e());
                        break;
                    }
                }
                int i4 = i + 1;
                if (i4 < 8) {
                    gm.d3(new ep1(i2, i4, str, z), fs7.b[i4]);
                    break;
                }
                break;
            default:
                a6a a6aVar = (a6a) obj2;
                TLRPC.Message message = (TLRPC.Message) obj;
                a6aVar.getMediaDataController().x0(message.dialog_id);
                a6aVar.getNotificationCenter().k(21, Integer.valueOf(i2), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i), Boolean.valueOf(z));
                a6aVar.getNotificationCenter().k(22, Integer.valueOf(i2), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i), Boolean.valueOf(z));
                a6aVar.c0(i2);
                a6aVar.h0(i2, z);
                break;
        }
    }

    public /* synthetic */ d31(yv1 yv1Var, int i, int i2, boolean z, v29 v29Var) {
        this.e = yv1Var;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.f = v29Var;
    }

    public /* synthetic */ d31(a6a a6aVar, TLRPC.Message message, int i, int i2, boolean z) {
        this.e = a6aVar;
        this.f = message;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public /* synthetic */ d31(TLObject tLObject, int i, boolean z, int i2, String str) {
        this.e = tLObject;
        this.b = i;
        this.d = z;
        this.c = i2;
        this.f = str;
    }
}
