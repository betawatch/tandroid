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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qb implements org.telegram.ui.Components.mk0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ qb(xb xbVar, Context context, long j10, org.telegram.ui.ActionBar.b6 b6Var, s91 s91Var) {
        this.d = xbVar;
        this.c = context;
        this.b = j10;
        this.e = b6Var;
        this.f = s91Var;
    }

    @Override // org.telegram.ui.Components.mk0
    public final void a(int i9, View view) {
        switch (this.a) {
            case 0:
                xb xbVar = (xb) this.d;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.e;
                s91 s91Var = (s91) this.f;
                boolean z10 = view instanceof gg.b;
                long j10 = this.b;
                if (z10) {
                    gg.b bVar = (gg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z11 = boost.giveaway;
                    if (!z11 || boost.stars <= 0) {
                        boolean z12 = boost.gift;
                        if (((z12 || z11) && boost.user_id >= 0) || boost.unclaimed) {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-xbVar.F.id);
                            int i10 = boost.date;
                            tL_payments_checkedGiftCode.date = i10;
                            tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                            int i11 = boost.expires - i10;
                            tL_payments_checkedGiftCode.days = i11 / 86400;
                            tL_payments_checkedGiftCode.months = (i11 / 30) / 86400;
                            if (boost.unclaimed) {
                                tL_payments_checkedGiftCode.to_id = -1L;
                                tL_payments_checkedGiftCode.flags = -1;
                            } else {
                                tL_payments_checkedGiftCode.boost = boost;
                            }
                            new bg.l1(s91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(s91Var.getParentActivity(), s91Var.getResourceProvider());
                            obVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            obVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            obVar.b.setSingleLine(false);
                            obVar.b.setMaxLines(2);
                            org.telegram.ui.Components.gc.g(s91Var, obVar, 2750).j();
                        } else if (!z12 && !z11) {
                            s91Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        gh.oa.e1(this.c, xbVar.b, j10, boost, b6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.p8) {
                    bg.a0.m(s91Var, b6Var, j10, null);
                }
                if (view instanceof gg.c) {
                    bg.a0.m(s91Var, b6Var, j10, ((gg.c) view).getPrepaidGiveaway());
                }
                if (((wb) xbVar.x.get(i9)).a == 9) {
                    xbVar.c(Boolean.valueOf(xbVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.k60.L((org.telegram.ui.Components.k60) this.d, this.b, (org.telegram.ui.ActionBar.o2) this.e, (a0.h) this.f, this.c, i9);
                break;
        }
    }

    public /* synthetic */ qb(org.telegram.ui.Components.k60 k60Var, long j10, org.telegram.ui.ActionBar.o2 o2Var, a0.h hVar, Context context) {
        this.d = k60Var;
        this.b = j10;
        this.e = o2Var;
        this.f = hVar;
        this.c = context;
    }
}
