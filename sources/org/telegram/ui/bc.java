package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bc implements org.telegram.ui.Components.am0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ bc(ic icVar, Context context, long j10, org.telegram.ui.ActionBar.c6 c6Var, hb1 hb1Var) {
        this.d = icVar;
        this.c = context;
        this.b = j10;
        this.e = c6Var;
        this.f = hb1Var;
    }

    @Override // org.telegram.ui.Components.am0
    public final void a(int i10, View view) {
        switch (this.a) {
            case 0:
                ic icVar = (ic) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                hb1 hb1Var = (hb1) this.f;
                boolean z10 = view instanceof zg.b;
                long j10 = this.b;
                if (z10) {
                    zg.b bVar = (zg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z11 = boost.giveaway;
                    if (!z11 || boost.stars <= 0) {
                        boolean z12 = boost.gift;
                        if (((z12 || z11) && boost.user_id >= 0) || boost.unclaimed) {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-icVar.J.id);
                            int i11 = boost.date;
                            tL_payments_checkedGiftCode.date = i11;
                            tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                            int i12 = boost.expires - i11;
                            tL_payments_checkedGiftCode.days = i12 / 86400;
                            tL_payments_checkedGiftCode.months = (i12 / 30) / 86400;
                            if (boost.unclaimed) {
                                tL_payments_checkedGiftCode.to_id = -1L;
                                tL_payments_checkedGiftCode.flags = -1;
                            } else {
                                tL_payments_checkedGiftCode.boost = boost;
                            }
                            new ug.c0(hb1Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.ac acVar = new org.telegram.ui.Components.ac(hb1Var.getParentActivity(), hb1Var.getResourceProvider());
                            acVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            acVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            acVar.b.setSingleLine(false);
                            acVar.b.setMaxLines(2);
                            org.telegram.ui.Components.sc.g(hb1Var, acVar, 2750).j();
                        } else if (!z12 && !z11) {
                            hb1Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        zh.p7.f1(this.c, icVar.b, j10, boost, c6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.r8) {
                    ug.n.n(hb1Var, c6Var, j10, null);
                }
                if (view instanceof zg.c) {
                    ug.n.n(hb1Var, c6Var, j10, ((zg.c) view).getPrepaidGiveaway());
                }
                if (((hc) icVar.x.get(i10)).a == 9) {
                    icVar.c(Boolean.valueOf(icVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.a80.N((org.telegram.ui.Components.a80) this.d, this.b, (org.telegram.ui.ActionBar.m2) this.e, (a0.h) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ bc(org.telegram.ui.Components.a80 a80Var, long j10, org.telegram.ui.ActionBar.m2 m2Var, a0.h hVar, Context context) {
        this.d = a80Var;
        this.b = j10;
        this.e = m2Var;
        this.f = hVar;
        this.c = context;
    }
}
