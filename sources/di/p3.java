package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class p3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ p3(f6 f6Var, int i7) {
        this.a = i7;
        this.b = f6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int i7;
        TLRPC.Message message;
        TLRPC.Message message2;
        int i10 = this.a;
        int i11 = 0;
        f6 f6Var = this.b;
        switch (i10) {
            case 0:
                f6Var.W1();
                break;
            case 1:
                TL_stars.TL_starGiftUnique M1 = f6Var.M1();
                if (bi.v4.u(M1)) {
                    if (!f6Var.t1()) {
                        bi.v4.q(f6Var.getContext(), f6Var.a, f6Var.J0, f6Var.k(), "STARGIFT_ONCHAIN_SALE_DISABLED", Boolean.valueOf(M1.fixed_sale));
                        break;
                    } else if (!bi.v4.m(M1)) {
                        f6Var.f2();
                        break;
                    } else {
                        f6Var.g2();
                        break;
                    }
                } else if (view.getAlpha() < 0.99f) {
                    f6Var.u1();
                    break;
                } else {
                    TL_stars.TL_starGiftUnique M12 = f6Var.M1();
                    if (M12 != null) {
                        if (M12.resell_amount != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f6Var.getContext(), f6Var.J0);
                            String a02 = gd.a0(null, null, 2131749870, f6Var.E1());
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.S = a02;
                            u1Var.U = gd.M0(2131749871, null);
                            alertDialog$Builder.k(gd.M0(2131750416, null), new s3(f6Var, M12, i11));
                            alertDialog$Builder.h(gd.M0(2131752578, null), new ci.v(2));
                            alertDialog$Builder.p();
                            break;
                        } else {
                            fj fjVar = f6Var.D2;
                            if (fjVar != null && (message2 = fjVar.k) != null) {
                                TLRPC.MessageAction messageAction = message2.action;
                                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                    i7 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
                                    if (i7 > ConnectionsManager.getInstance(f6Var.a).getCurrentTime()) {
                                        pb.j1(f6Var.getContext(), f6Var.a, null, new t3(f6Var, M12, i11), f6Var.J0);
                                        break;
                                    } else {
                                        Context context = f6Var.getContext();
                                        fj fjVar2 = f6Var.D2;
                                        if (fjVar2 != null && (message = fjVar2.k) != null) {
                                            TLRPC.MessageAction messageAction2 = message.action;
                                            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                                                i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
                                                f6Var.D2(i11 - ConnectionsManager.getInstance(f6Var.a).getCurrentTime(), context, true);
                                                break;
                                            }
                                        }
                                        TL_stars.SavedStarGift savedStarGift = f6Var.B2;
                                        if (savedStarGift != null) {
                                            i11 = savedStarGift.can_resell_at;
                                        }
                                        f6Var.D2(i11 - ConnectionsManager.getInstance(f6Var.a).getCurrentTime(), context, true);
                                    }
                                }
                            }
                            TL_stars.SavedStarGift savedStarGift2 = f6Var.B2;
                            i7 = savedStarGift2 != null ? savedStarGift2.can_resell_at : 0;
                            if (i7 > ConnectionsManager.getInstance(f6Var.a).getCurrentTime()) {
                            }
                        }
                    }
                }
                break;
            case 2:
                f6Var.Z1();
                break;
            case 3:
                f6Var.U2 = true;
                f6Var.I2(false);
                break;
            case 4:
                f6Var.c2(false);
                break;
            default:
                f6Var.o2();
                break;
        }
    }
}
