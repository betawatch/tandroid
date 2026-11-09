package org.telegram.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb implements org.telegram.ui.Components.cj0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nb(tb tbVar, Context context, long j3, org.telegram.ui.ActionBar.g6 g6Var, d51 d51Var) {
        this.d = tbVar;
        this.c = context;
        this.b = j3;
        this.e = g6Var;
        this.f = d51Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d8, code lost:
    
        if (r14.user_id < 0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    @Override // org.telegram.ui.Components.cj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i7, View view) {
        d51 d51Var;
        long j3;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLObject tLObject = null;
        switch (this.a) {
            case 0:
                tb tbVar = (tb) this.d;
                Context context = this.c;
                long j10 = this.b;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                d51 d51Var2 = (d51) this.f;
                if (view instanceof bh.b) {
                    bh.b bVar = (bh.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z9 = boost.giveaway;
                    if (!z9 || boost.stars <= 0) {
                        d51Var = d51Var2;
                        boolean z10 = boost.gift;
                        if (z10 || z9) {
                            j3 = -1;
                            break;
                        } else {
                            j3 = -1;
                        }
                        if (!boost.unclaimed) {
                            if (z9 && boost.user_id == j3) {
                                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(d51Var.getParentActivity(), d51Var.getResourceProvider());
                                kbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                kbVar.b.setText(org.telegram.messenger.id.M0(2131753303, null));
                                kbVar.b.setSingleLine(false);
                                kbVar.b.setMaxLines(2);
                                org.telegram.ui.Components.cc.g(d51Var, kbVar, 2750).j();
                            } else if (!z10 && !z9) {
                                d51Var.presentFragment(ProfileActivity.D4(bVar.getDialogId()));
                            }
                        }
                        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                        tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                        tL_payments_checkedGiftCode.to_id = boost.user_id;
                        tL_payments_checkedGiftCode.from_id = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).z1(-tbVar.I.id);
                        int i10 = boost.date;
                        tL_payments_checkedGiftCode.date = i10;
                        tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                        int i11 = boost.expires - i10;
                        tL_payments_checkedGiftCode.days = i11 / 86400;
                        tL_payments_checkedGiftCode.months = (i11 / 30) / 86400;
                        if (boost.unclaimed) {
                            tL_payments_checkedGiftCode.to_id = j3;
                            tL_payments_checkedGiftCode.flags = -1;
                        } else {
                            tL_payments_checkedGiftCode.boost = boost;
                        }
                        new wg.c0(d51Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                    } else {
                        d51Var = d51Var2;
                        bi.dd.h1(context, tbVar.b, j10, boost, g6Var);
                    }
                } else {
                    d51Var = d51Var2;
                }
                if (view instanceof org.telegram.ui.Cells.m8) {
                    wg.l.I0(d51Var, g6Var, j10, null);
                }
                if (view instanceof bh.c) {
                    wg.l.I0(d51Var, g6Var, j10, ((bh.c) view).getPrepaidGiveaway());
                }
                if (((sb) tbVar.y.get(i7)).a == 9) {
                    tbVar.c(Boolean.valueOf(tbVar.D == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.y50 y50Var = (org.telegram.ui.Components.y50) this.d;
                long j11 = this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.e;
                a0.h hVar = (a0.h) this.f;
                Context context2 = this.c;
                v4.g0 adapter = y50Var.k1.getAdapter();
                org.telegram.ui.Components.t50 t50Var = y50Var.N1;
                if (adapter == t50Var) {
                    int size = t50Var.c.size();
                    int size2 = y50Var.N1.e.e.size();
                    int size3 = y50Var.N1.e.d.size();
                    int i12 = i7 - 1;
                    if (i12 >= 0 && i12 < size) {
                        tLObject = (TLObject) y50Var.N1.c.get(i12);
                    } else if (i12 >= size && i12 < size3 + size) {
                        tLObject = (TLObject) y50Var.N1.e.d.get(i12 - size);
                    } else if (i12 > size + size3 && i12 <= size2 + size + size3) {
                        tLObject = (TLObject) y50Var.N1.e.e.get(((i12 - size) - size3) - 1);
                    }
                    if (y50Var.d2 != null) {
                        org.telegram.messenger.g0.v1(y50Var.s1.J);
                    }
                } else if (i7 == y50Var.O1) {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(y50Var.a).M0(Long.valueOf(j11));
                    TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(y50Var.a).N0(j11);
                    if (M0 != null) {
                        String K = org.telegram.messenger.t3.K(M0, false);
                        if (!TextUtils.isEmpty(K)) {
                            str = org.telegram.ui.Cells.f1.n(org.telegram.messenger.qp.s1(y50Var.a).U2, "/", K, new StringBuilder("https://"));
                            if (str == null) {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                                y50Var.dismiss();
                                org.telegram.ui.Components.hc.j(f2Var).j();
                            }
                        }
                    }
                    if (N0 == null || (tL_chatInviteExported = N0.exported_invite) == null) {
                        if (!y50Var.p2) {
                            y50Var.p2 = true;
                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                            tL_messages_exportChatInvite.peer = org.telegram.messenger.qp.s1(y50Var.a).j1(-y50Var.m2);
                            ConnectionsManager.getInstance(y50Var.a).sendRequest(tL_messages_exportChatInvite, new org.telegram.ui.Components.x1(y50Var, 6));
                        }
                        str = null;
                    } else {
                        str = tL_chatInviteExported.link;
                    }
                    if (str == null) {
                    }
                } else if (i7 >= y50Var.P1 && i7 < y50Var.Q1) {
                    tLObject = ((org.telegram.ui.Components.r50) y50Var.m1).E(i7);
                }
                if (tLObject != null) {
                    long j12 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
                    if (hVar == null || hVar.h(j12) < 0) {
                        if (j12 != 0) {
                            if (y50Var.W1.h(j12) >= 0) {
                                org.telegram.ui.Components.d20 d20Var = (org.telegram.ui.Components.d20) y50Var.W1.f(j12);
                                y50Var.W1.l(j12);
                                y50Var.L1.b(d20Var);
                            } else {
                                org.telegram.ui.Components.d20 d20Var2 = new org.telegram.ui.Components.d20(context2, tLObject);
                                d20Var2.setOnClickListener(y50Var.i2);
                                y50Var.W1.k(d20Var2, j12);
                                y50Var.L1.a(d20Var2, true);
                            }
                        }
                        y50Var.S0(true);
                        org.telegram.messenger.g0.b4(y50Var.k1);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ nb(org.telegram.ui.Components.y50 y50Var, long j3, org.telegram.ui.ActionBar.f2 f2Var, a0.h hVar, Context context) {
        this.d = y50Var;
        this.b = j3;
        this.e = f2Var;
        this.f = hVar;
        this.c = context;
    }
}
