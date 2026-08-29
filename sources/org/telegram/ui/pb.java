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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb implements org.telegram.ui.Components.zk0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ pb(wb wbVar, Context context, long j10, org.telegram.ui.ActionBar.c6 c6Var, t91 t91Var) {
        this.d = wbVar;
        this.c = context;
        this.b = j10;
        this.e = c6Var;
        this.f = t91Var;
    }

    @Override // org.telegram.ui.Components.zk0
    public final void c(int i10, View view) {
        switch (this.a) {
            case 0:
                wb wbVar = (wb) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                t91 t91Var = (t91) this.f;
                boolean z10 = view instanceof jg.b;
                long j10 = this.b;
                if (z10) {
                    jg.b bVar = (jg.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z11 = boost.giveaway;
                    if (!z11 || boost.stars <= 0) {
                        boolean z12 = boost.gift;
                        if (((z12 || z11) && boost.user_id >= 0) || boost.unclaimed) {
                            TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                            tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                            tL_payments_checkedGiftCode.to_id = boost.user_id;
                            tL_payments_checkedGiftCode.from_id = MessagesController.getInstance(UserConfig.selectedAccount).getPeer(-wbVar.F.id);
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
                            new eg.f1(t91Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                        } else if (z11 && boost.user_id == -1) {
                            org.telegram.ui.Components.ub ubVar = new org.telegram.ui.Components.ub(t91Var.getParentActivity(), t91Var.getResourceProvider());
                            ubVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                            ubVar.b.setText(LocaleController.getString(R.string.BoostingRecipientWillBeSelected));
                            ubVar.b.setSingleLine(false);
                            ubVar.b.setMaxLines(2);
                            org.telegram.ui.Components.mc.g(t91Var, ubVar, 2750).j();
                        } else if (!z12 && !z11) {
                            t91Var.presentFragment(ProfileActivity.m4(bVar.getDialogId()));
                        }
                    } else {
                        jh.ia.e1(this.c, wbVar.b, j10, boost, c6Var);
                    }
                }
                if (view instanceof org.telegram.ui.Cells.m8) {
                    eg.y.m(t91Var, c6Var, j10, null);
                }
                if (view instanceof jg.c) {
                    eg.y.m(t91Var, c6Var, j10, ((jg.c) view).getPrepaidGiveaway());
                }
                if (((vb) wbVar.x.get(i10)).a == 9) {
                    wbVar.c(Boolean.valueOf(wbVar.y == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.x60.L((org.telegram.ui.Components.x60) this.d, this.b, (org.telegram.ui.ActionBar.o2) this.e, (a0.h) this.f, this.c, i10);
                break;
        }
    }

    public /* synthetic */ pb(org.telegram.ui.Components.x60 x60Var, long j10, org.telegram.ui.ActionBar.o2 o2Var, a0.h hVar, Context context) {
        this.d = x60Var;
        this.b = j10;
        this.e = o2Var;
        this.f = hVar;
        this.c = context;
    }
}
