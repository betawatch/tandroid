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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb implements org.telegram.ui.Components.oj0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mb(sb sbVar, Context context, long j3, org.telegram.ui.ActionBar.i6 i6Var, c51 c51Var) {
        this.d = sbVar;
        this.c = context;
        this.b = j3;
        this.e = i6Var;
        this.f = c51Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d8, code lost:
    
        if (r14.user_id < 0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    @Override // org.telegram.ui.Components.oj0
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
                sb sbVar = (sb) this.d;
                Context context = this.c;
                long j10 = this.b;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) this.e;
                c51 c51Var2 = (c51) this.f;
                if (view instanceof bh.b) {
                    bh.b bVar = (bh.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z10 = boost.giveaway;
                    if (!z10 || boost.stars <= 0) {
                        c51Var = c51Var2;
                        boolean z11 = boost.gift;
                        if (z11 || z10) {
                            j3 = -1;
                            break;
                        } else {
                            j3 = -1;
                        }
                        if (!boost.unclaimed) {
                            if (z10 && boost.user_id == j3) {
                                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(c51Var.getParentActivity(), c51Var.getResourceProvider());
                                obVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                obVar.b.setText(org.telegram.messenger.gd.M0(2131753301, null));
                                obVar.b.setSingleLine(false);
                                obVar.b.setMaxLines(2);
                                org.telegram.ui.Components.gc.g(c51Var, obVar, 2750).j();
                            } else if (!z11 && !z10) {
                                c51Var.presentFragment(ProfileActivity.D4(bVar.getDialogId()));
                            }
                        }
                        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                        tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                        tL_payments_checkedGiftCode.to_id = boost.user_id;
                        tL_payments_checkedGiftCode.from_id = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).B1(-sbVar.J.id);
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
                        di.pb.i1(context, sbVar.b, j10, boost, i6Var);
                    }
                } else {
                    c51Var = c51Var2;
                }
                if (view instanceof org.telegram.ui.Cells.n8) {
                    wg.l.J0(c51Var, i6Var, j10, null);
                }
                if (view instanceof bh.c) {
                    wg.l.J0(c51Var, i6Var, j10, ((bh.c) view).getPrepaidGiveaway());
                }
                if (((rb) sbVar.y.get(i7)).a == 9) {
                    sbVar.c(Boolean.valueOf(sbVar.E == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.j60 j60Var = (org.telegram.ui.Components.j60) this.d;
                long j11 = this.b;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.e;
                a0.h hVar = (a0.h) this.f;
                Context context2 = this.c;
                v4.i0 adapter = j60Var.o1.getAdapter();
                org.telegram.ui.Components.d60 d60Var = j60Var.R1;
                if (adapter == d60Var) {
                    int size = d60Var.c.size();
                    int size2 = j60Var.R1.e.e.size();
                    int size3 = j60Var.R1.e.d.size();
                    int i12 = i7 - 1;
                    if (i12 >= 0 && i12 < size) {
                        tLObject = (TLObject) j60Var.R1.c.get(i12);
                    } else if (i12 >= size && i12 < size3 + size) {
                        tLObject = (TLObject) j60Var.R1.e.d.get(i12 - size);
                    } else if (i12 > size + size3 && i12 <= size2 + size + size3) {
                        tLObject = (TLObject) j60Var.R1.e.e.get(((i12 - size) - size3) - 1);
                    }
                    if (j60Var.h2 != null) {
                        org.telegram.messenger.g0.v1(j60Var.w1.K);
                    }
                } else if (i7 == j60Var.S1) {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(j60Var.a).O0(Long.valueOf(j11));
                    TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(j60Var.a).P0(j11);
                    if (O0 != null) {
                        String K = org.telegram.messenger.v3.K(O0, false);
                        if (!TextUtils.isEmpty(K)) {
                            str = p5.c.m(org.telegram.messenger.mp.u1(j60Var.a).X2, "/", K, new StringBuilder("https://"));
                            if (str == null) {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                                j60Var.dismiss();
                                org.telegram.ui.Components.lc.j(h2Var).j();
                            }
                        }
                    }
                    if (P0 == null || (tL_chatInviteExported = P0.exported_invite) == null) {
                        if (!j60Var.t2) {
                            j60Var.t2 = true;
                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                            tL_messages_exportChatInvite.peer = org.telegram.messenger.mp.u1(j60Var.a).l1(-j60Var.q2);
                            ConnectionsManager.getInstance(j60Var.a).sendRequest(tL_messages_exportChatInvite, new org.telegram.ui.Components.e2(j60Var, 6));
                        }
                        str = null;
                    } else {
                        str = tL_chatInviteExported.link;
                    }
                    if (str == null) {
                    }
                } else if (i7 >= j60Var.T1 && i7 < j60Var.U1) {
                    tLObject = ((org.telegram.ui.Components.b60) j60Var.q1).E(i7);
                }
                if (tLObject != null) {
                    long j12 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
                    if (hVar == null || hVar.h(j12) < 0) {
                        if (j12 != 0) {
                            if (j60Var.a2.h(j12) >= 0) {
                                org.telegram.ui.Components.m20 m20Var = (org.telegram.ui.Components.m20) j60Var.a2.f(j12);
                                j60Var.a2.l(j12);
                                j60Var.P1.b(m20Var);
                            } else {
                                org.telegram.ui.Components.m20 m20Var2 = new org.telegram.ui.Components.m20(context2, tLObject);
                                m20Var2.setOnClickListener(j60Var.m2);
                                j60Var.a2.k(m20Var2, j12);
                                j60Var.P1.a(m20Var2, true);
                            }
                        }
                        j60Var.T0(true);
                        org.telegram.messenger.g0.Z3(j60Var.o1);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ mb(org.telegram.ui.Components.j60 j60Var, long j3, org.telegram.ui.ActionBar.h2 h2Var, a0.h hVar, Context context) {
        this.d = j60Var;
        this.b = j3;
        this.e = h2Var;
        this.f = hVar;
        this.c = context;
    }
}
