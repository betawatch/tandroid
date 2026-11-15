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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb implements org.telegram.ui.Components.gj0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mb(sb sbVar, Context context, long j3, org.telegram.ui.ActionBar.e6 e6Var, z41 z41Var) {
        this.d = sbVar;
        this.c = context;
        this.b = j3;
        this.e = e6Var;
        this.f = z41Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d8, code lost:
    
        if (r14.user_id < 0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    @Override // org.telegram.ui.Components.gj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7, View view) {
        z41 z41Var;
        long j3;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLObject tLObject = null;
        switch (this.a) {
            case 0:
                sb sbVar = (sb) this.d;
                Context context = this.c;
                long j10 = this.b;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.e;
                z41 z41Var2 = (z41) this.f;
                if (view instanceof bh.b) {
                    bh.b bVar = (bh.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z10 = boost.giveaway;
                    if (!z10 || boost.stars <= 0) {
                        z41Var = z41Var2;
                        boolean z11 = boost.gift;
                        if (z11 || z10) {
                            j3 = -1;
                            break;
                        } else {
                            j3 = -1;
                        }
                        if (!boost.unclaimed) {
                            if (z10 && boost.user_id == j3) {
                                org.telegram.ui.Components.fb fbVar = new org.telegram.ui.Components.fb(z41Var.getParentActivity(), z41Var.getResourceProvider());
                                fbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                fbVar.b.setText(org.telegram.messenger.hd.M0(2131753303, null));
                                fbVar.b.setSingleLine(false);
                                fbVar.b.setMaxLines(2);
                                org.telegram.ui.Components.xb.g(z41Var, fbVar, 2750).j();
                            } else if (!z11 && !z10) {
                                z41Var.presentFragment(ProfileActivity.C4(bVar.getDialogId()));
                            }
                        }
                        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                        tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                        tL_payments_checkedGiftCode.to_id = boost.user_id;
                        tL_payments_checkedGiftCode.from_id = org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).z1(-sbVar.J.id);
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
                        new wg.a0(z41Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                    } else {
                        z41Var = z41Var2;
                        di.lb.h1(context, sbVar.b, j10, boost, e6Var);
                    }
                } else {
                    z41Var = z41Var2;
                }
                if (view instanceof org.telegram.ui.Cells.l8) {
                    wg.l.I0(z41Var, e6Var, j10, null);
                }
                if (view instanceof bh.c) {
                    wg.l.I0(z41Var, e6Var, j10, ((bh.c) view).getPrepaidGiveaway());
                }
                if (((rb) sbVar.y.get(i7)).a == 9) {
                    sbVar.c(Boolean.valueOf(sbVar.E == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.a60 a60Var = (org.telegram.ui.Components.a60) this.d;
                long j11 = this.b;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.e;
                a0.h hVar = (a0.h) this.f;
                Context context2 = this.c;
                v4.h0 adapter = a60Var.o1.getAdapter();
                org.telegram.ui.Components.v50 v50Var = a60Var.R1;
                if (adapter == v50Var) {
                    int size = v50Var.c.size();
                    int size2 = a60Var.R1.e.e.size();
                    int size3 = a60Var.R1.e.d.size();
                    int i12 = i7 - 1;
                    if (i12 >= 0 && i12 < size) {
                        tLObject = (TLObject) a60Var.R1.c.get(i12);
                    } else if (i12 >= size && i12 < size3 + size) {
                        tLObject = (TLObject) a60Var.R1.e.d.get(i12 - size);
                    } else if (i12 > size + size3 && i12 <= size2 + size + size3) {
                        tLObject = (TLObject) a60Var.R1.e.e.get(((i12 - size) - size3) - 1);
                    }
                    if (a60Var.h2 != null) {
                        org.telegram.messenger.g0.v1(a60Var.w1.K);
                    }
                } else if (i7 == a60Var.S1) {
                    TLRPC.Chat M0 = org.telegram.messenger.np.s1(a60Var.a).M0(Long.valueOf(j11));
                    TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(a60Var.a).N0(j11);
                    if (M0 != null) {
                        String K = org.telegram.messenger.t3.K(M0, false);
                        if (!TextUtils.isEmpty(K)) {
                            str = org.telegram.ui.Cells.y0.m(org.telegram.messenger.np.s1(a60Var.a).V2, "/", K, new StringBuilder("https://"));
                            if (str == null) {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                                a60Var.dismiss();
                                org.telegram.ui.Components.cc.j(e2Var).j();
                            }
                        }
                    }
                    if (N0 == null || (tL_chatInviteExported = N0.exported_invite) == null) {
                        if (!a60Var.t2) {
                            a60Var.t2 = true;
                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                            tL_messages_exportChatInvite.peer = org.telegram.messenger.np.s1(a60Var.a).j1(-a60Var.q2);
                            ConnectionsManager.getInstance(a60Var.a).sendRequest(tL_messages_exportChatInvite, new org.telegram.ui.Components.v1(a60Var, 6));
                        }
                        str = null;
                    } else {
                        str = tL_chatInviteExported.link;
                    }
                    if (str == null) {
                    }
                } else if (i7 >= a60Var.T1 && i7 < a60Var.U1) {
                    tLObject = ((org.telegram.ui.Components.t50) a60Var.q1).E(i7);
                }
                if (tLObject != null) {
                    long j12 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
                    if (hVar == null || hVar.h(j12) < 0) {
                        if (j12 != 0) {
                            if (a60Var.a2.h(j12) >= 0) {
                                org.telegram.ui.Components.f20 f20Var = (org.telegram.ui.Components.f20) a60Var.a2.f(j12);
                                a60Var.a2.l(j12);
                                a60Var.P1.b(f20Var);
                            } else {
                                org.telegram.ui.Components.f20 f20Var2 = new org.telegram.ui.Components.f20(context2, tLObject);
                                f20Var2.setOnClickListener(a60Var.m2);
                                a60Var.a2.k(f20Var2, j12);
                                a60Var.P1.a(f20Var2, true);
                            }
                        }
                        a60Var.S0(true);
                        org.telegram.messenger.g0.a4(a60Var.o1);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ mb(org.telegram.ui.Components.a60 a60Var, long j3, org.telegram.ui.ActionBar.e2 e2Var, a0.h hVar, Context context) {
        this.d = a60Var;
        this.b = j3;
        this.e = e2Var;
        this.f = hVar;
        this.c = context;
    }
}
