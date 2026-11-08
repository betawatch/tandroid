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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nb implements org.telegram.ui.Components.bj0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nb(tb tbVar, Context context, long j3, org.telegram.ui.ActionBar.f6 f6Var, c51 c51Var) {
        this.d = tbVar;
        this.c = context;
        this.b = j3;
        this.e = f6Var;
        this.f = c51Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d8, code lost:
    
        if (r14.user_id < 0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    @Override // org.telegram.ui.Components.bj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i7, View view) {
        c51 c51Var;
        long j3;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLObject tLObject = null;
        switch (this.a) {
            case 0:
                tb tbVar = (tb) this.d;
                Context context = this.c;
                long j10 = this.b;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) this.e;
                c51 c51Var2 = (c51) this.f;
                if (view instanceof bh.b) {
                    bh.b bVar = (bh.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z9 = boost.giveaway;
                    if (!z9 || boost.stars <= 0) {
                        c51Var = c51Var2;
                        boolean z10 = boost.gift;
                        if (z10 || z9) {
                            j3 = -1;
                            break;
                        } else {
                            j3 = -1;
                        }
                        if (!boost.unclaimed) {
                            if (z9 && boost.user_id == j3) {
                                org.telegram.ui.Components.kb kbVar = new org.telegram.ui.Components.kb(c51Var.getParentActivity(), c51Var.getResourceProvider());
                                kbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                kbVar.b.setText(org.telegram.messenger.id.M0(2131753303, null));
                                kbVar.b.setSingleLine(false);
                                kbVar.b.setMaxLines(2);
                                org.telegram.ui.Components.cc.g(c51Var, kbVar, 2750).j();
                            } else if (!z10 && !z9) {
                                c51Var.presentFragment(ProfileActivity.A4(bVar.getDialogId()));
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
                        new wg.c0(c51Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                    } else {
                        c51Var = c51Var2;
                        bi.dd.h1(context, tbVar.b, j10, boost, f6Var);
                    }
                } else {
                    c51Var = c51Var2;
                }
                if (view instanceof org.telegram.ui.Cells.m8) {
                    wg.l.I0(c51Var, f6Var, j10, null);
                }
                if (view instanceof bh.c) {
                    wg.l.I0(c51Var, f6Var, j10, ((bh.c) view).getPrepaidGiveaway());
                }
                if (((sb) tbVar.y.get(i7)).a == 9) {
                    tbVar.c(Boolean.valueOf(tbVar.D == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.x50 x50Var = (org.telegram.ui.Components.x50) this.d;
                long j11 = this.b;
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.e;
                a0.h hVar = (a0.h) this.f;
                Context context2 = this.c;
                v4.g0 adapter = x50Var.k1.getAdapter();
                org.telegram.ui.Components.s50 s50Var = x50Var.N1;
                if (adapter == s50Var) {
                    int size = s50Var.c.size();
                    int size2 = x50Var.N1.e.e.size();
                    int size3 = x50Var.N1.e.d.size();
                    int i12 = i7 - 1;
                    if (i12 >= 0 && i12 < size) {
                        tLObject = (TLObject) x50Var.N1.c.get(i12);
                    } else if (i12 >= size && i12 < size3 + size) {
                        tLObject = (TLObject) x50Var.N1.e.d.get(i12 - size);
                    } else if (i12 > size + size3 && i12 <= size2 + size + size3) {
                        tLObject = (TLObject) x50Var.N1.e.e.get(((i12 - size) - size3) - 1);
                    }
                    if (x50Var.d2 != null) {
                        org.telegram.messenger.g0.v1(x50Var.s1.J);
                    }
                } else if (i7 == x50Var.O1) {
                    TLRPC.Chat M0 = org.telegram.messenger.qp.s1(x50Var.a).M0(Long.valueOf(j11));
                    TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(x50Var.a).N0(j11);
                    if (M0 != null) {
                        String K = org.telegram.messenger.t3.K(M0, false);
                        if (!TextUtils.isEmpty(K)) {
                            str = org.telegram.ui.Cells.f1.n(org.telegram.messenger.qp.s1(x50Var.a).U2, "/", K, new StringBuilder("https://"));
                            if (str == null) {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                                x50Var.dismiss();
                                org.telegram.ui.Components.hc.j(f2Var).j();
                            }
                        }
                    }
                    if (N0 == null || (tL_chatInviteExported = N0.exported_invite) == null) {
                        if (!x50Var.p2) {
                            x50Var.p2 = true;
                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                            tL_messages_exportChatInvite.peer = org.telegram.messenger.qp.s1(x50Var.a).j1(-x50Var.m2);
                            ConnectionsManager.getInstance(x50Var.a).sendRequest(tL_messages_exportChatInvite, new org.telegram.ui.Components.x1(x50Var, 6));
                        }
                        str = null;
                    } else {
                        str = tL_chatInviteExported.link;
                    }
                    if (str == null) {
                    }
                } else if (i7 >= x50Var.P1 && i7 < x50Var.Q1) {
                    tLObject = ((org.telegram.ui.Components.q50) x50Var.m1).E(i7);
                }
                if (tLObject != null) {
                    long j12 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
                    if (hVar == null || hVar.h(j12) < 0) {
                        if (j12 != 0) {
                            if (x50Var.W1.h(j12) >= 0) {
                                org.telegram.ui.Components.c20 c20Var = (org.telegram.ui.Components.c20) x50Var.W1.f(j12);
                                x50Var.W1.l(j12);
                                x50Var.L1.b(c20Var);
                            } else {
                                org.telegram.ui.Components.c20 c20Var2 = new org.telegram.ui.Components.c20(context2, tLObject);
                                c20Var2.setOnClickListener(x50Var.i2);
                                x50Var.W1.k(c20Var2, j12);
                                x50Var.L1.a(c20Var2, true);
                            }
                        }
                        x50Var.S0(true);
                        org.telegram.messenger.g0.b4(x50Var.k1);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ nb(org.telegram.ui.Components.x50 x50Var, long j3, org.telegram.ui.ActionBar.f2 f2Var, a0.h hVar, Context context) {
        this.d = x50Var;
        this.b = j3;
        this.e = f2Var;
        this.f = hVar;
        this.c = context;
    }
}
