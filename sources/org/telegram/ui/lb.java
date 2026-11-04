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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lb implements org.telegram.ui.Components.fj0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ lb(rb rbVar, Context context, long j10, org.telegram.ui.ActionBar.e6 e6Var, r41 r41Var) {
        this.d = rbVar;
        this.c = context;
        this.b = j10;
        this.e = e6Var;
        this.f = r41Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d8, code lost:
    
        if (r14.user_id < 0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    @Override // org.telegram.ui.Components.fj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i3, View view) {
        r41 r41Var;
        long j10;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLObject tLObject = null;
        switch (this.a) {
            case 0:
                rb rbVar = (rb) this.d;
                Context context = this.c;
                long j11 = this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                r41 r41Var2 = (r41) this.f;
                if (view instanceof ch.b) {
                    ch.b bVar = (ch.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z10 = boost.giveaway;
                    if (!z10 || boost.stars <= 0) {
                        r41Var = r41Var2;
                        boolean z11 = boost.gift;
                        if (z11 || z10) {
                            j10 = -1;
                            break;
                        } else {
                            j10 = -1;
                        }
                        if (!boost.unclaimed) {
                            if (z10 && boost.user_id == j10) {
                                org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(r41Var.getParentActivity(), r41Var.getResourceProvider());
                                ibVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                ibVar.b.setText(org.telegram.messenger.bd.M0(2131753303, null));
                                ibVar.b.setSingleLine(false);
                                ibVar.b.setMaxLines(2);
                                org.telegram.ui.Components.ac.g(r41Var, ibVar, 2750).j();
                            } else if (!z11 && !z10) {
                                r41Var.presentFragment(ProfileActivity.A4(bVar.getDialogId()));
                            }
                        }
                        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                        tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                        tL_payments_checkedGiftCode.to_id = boost.user_id;
                        tL_payments_checkedGiftCode.from_id = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).z1(-rbVar.J.id);
                        int i10 = boost.date;
                        tL_payments_checkedGiftCode.date = i10;
                        tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                        int i11 = boost.expires - i10;
                        tL_payments_checkedGiftCode.days = i11 / 86400;
                        tL_payments_checkedGiftCode.months = (i11 / 30) / 86400;
                        if (boost.unclaimed) {
                            tL_payments_checkedGiftCode.to_id = j10;
                            tL_payments_checkedGiftCode.flags = -1;
                        } else {
                            tL_payments_checkedGiftCode.boost = boost;
                        }
                        new xg.c0(r41Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                    } else {
                        r41Var = r41Var2;
                        ci.wb.h1(context, rbVar.b, j11, boost, e6Var);
                    }
                } else {
                    r41Var = r41Var2;
                }
                if (view instanceof org.telegram.ui.Cells.l8) {
                    xg.n.I0(r41Var, e6Var, j11, null);
                }
                if (view instanceof ch.c) {
                    xg.n.I0(r41Var, e6Var, j11, ((ch.c) view).getPrepaidGiveaway());
                }
                if (((qb) rbVar.y.get(i3)).a == 9) {
                    rbVar.c(Boolean.valueOf(rbVar.E == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.t50 t50Var = (org.telegram.ui.Components.t50) this.d;
                long j12 = this.b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.e;
                a0.h hVar = (a0.h) this.f;
                Context context2 = this.c;
                u4.h0 adapter = t50Var.l1.getAdapter();
                org.telegram.ui.Components.p50 p50Var = t50Var.O1;
                if (adapter == p50Var) {
                    int size = p50Var.c.size();
                    int size2 = t50Var.O1.e.e.size();
                    int size3 = t50Var.O1.e.d.size();
                    int i12 = i3 - 1;
                    if (i12 >= 0 && i12 < size) {
                        tLObject = (TLObject) t50Var.O1.c.get(i12);
                    } else if (i12 >= size && i12 < size3 + size) {
                        tLObject = (TLObject) t50Var.O1.e.d.get(i12 - size);
                    } else if (i12 > size + size3 && i12 <= size2 + size + size3) {
                        tLObject = (TLObject) t50Var.O1.e.e.get(((i12 - size) - size3) - 1);
                    }
                    if (t50Var.e2 != null) {
                        org.telegram.messenger.g0.v1(t50Var.t1.K);
                    }
                } else if (i3 == t50Var.P1) {
                    TLRPC.Chat M0 = org.telegram.messenger.hp.s1(t50Var.a).M0(Long.valueOf(j12));
                    TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(t50Var.a).N0(j12);
                    if (M0 != null) {
                        String K = org.telegram.messenger.t3.K(M0, false);
                        if (!TextUtils.isEmpty(K)) {
                            str = org.telegram.ui.Cells.f1.r(org.telegram.messenger.hp.s1(t50Var.a).V2, "/", K, new StringBuilder("https://"));
                            if (str == null) {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                                t50Var.dismiss();
                                org.telegram.ui.Components.fc.j(d2Var).j();
                            }
                        }
                    }
                    if (N0 == null || (tL_chatInviteExported = N0.exported_invite) == null) {
                        if (!t50Var.q2) {
                            t50Var.q2 = true;
                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                            tL_messages_exportChatInvite.peer = org.telegram.messenger.hp.s1(t50Var.a).j1(-t50Var.n2);
                            ConnectionsManager.getInstance(t50Var.a).sendRequest(tL_messages_exportChatInvite, new org.telegram.ui.Components.w1(t50Var, 6));
                        }
                        str = null;
                    } else {
                        str = tL_chatInviteExported.link;
                    }
                    if (str == null) {
                    }
                } else if (i3 >= t50Var.Q1 && i3 < t50Var.R1) {
                    tLObject = ((org.telegram.ui.Components.n50) t50Var.n1).E(i3);
                }
                if (tLObject != null) {
                    long j13 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
                    if (hVar == null || hVar.h(j13) < 0) {
                        if (j13 != 0) {
                            if (t50Var.X1.h(j13) >= 0) {
                                org.telegram.ui.Components.y10 y10Var = (org.telegram.ui.Components.y10) t50Var.X1.f(j13);
                                t50Var.X1.l(j13);
                                t50Var.M1.b(y10Var);
                            } else {
                                org.telegram.ui.Components.y10 y10Var2 = new org.telegram.ui.Components.y10(context2, tLObject);
                                y10Var2.setOnClickListener(t50Var.j2);
                                t50Var.X1.k(y10Var2, j13);
                                t50Var.M1.a(y10Var2, true);
                            }
                        }
                        t50Var.S0(true);
                        org.telegram.messenger.g0.b4(t50Var.l1);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ lb(org.telegram.ui.Components.t50 t50Var, long j10, org.telegram.ui.ActionBar.d2 d2Var, a0.h hVar, Context context) {
        this.d = t50Var;
        this.b = j10;
        this.e = d2Var;
        this.f = hVar;
        this.c = context;
    }
}
