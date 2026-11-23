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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb implements org.telegram.ui.Components.qj0 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ mb(sb sbVar, Context context, long j3, org.telegram.ui.ActionBar.i6 i6Var, b51 b51Var) {
        this.d = sbVar;
        this.c = context;
        this.b = j3;
        this.e = i6Var;
        this.f = b51Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d8, code lost:
    
        if (r14.user_id < 0) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    @Override // org.telegram.ui.Components.qj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i7, View view) {
        b51 b51Var;
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
                b51 b51Var2 = (b51) this.f;
                if (view instanceof bh.b) {
                    bh.b bVar = (bh.b) view;
                    TL_stories.Boost boost = bVar.getBoost();
                    boolean z10 = boost.giveaway;
                    if (!z10 || boost.stars <= 0) {
                        b51Var = b51Var2;
                        boolean z11 = boost.gift;
                        if (z11 || z10) {
                            j3 = -1;
                            break;
                        } else {
                            j3 = -1;
                        }
                        if (!boost.unclaimed) {
                            if (z10 && boost.user_id == j3) {
                                org.telegram.ui.Components.nb nbVar = new org.telegram.ui.Components.nb(b51Var.getParentActivity(), b51Var.getResourceProvider());
                                nbVar.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                nbVar.b.setText(org.telegram.messenger.gd.N0(2131753300, null));
                                nbVar.b.setSingleLine(false);
                                nbVar.b.setMaxLines(2);
                                org.telegram.ui.Components.fc.g(b51Var, nbVar, 2750).j();
                            } else if (!z11 && !z10) {
                                b51Var.presentFragment(ProfileActivity.D4(bVar.getDialogId()));
                            }
                        }
                        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                        tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                        tL_payments_checkedGiftCode.to_id = boost.user_id;
                        tL_payments_checkedGiftCode.from_id = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).B1(-sbVar.J.id);
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
                        new wg.b0(b51Var, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                    } else {
                        b51Var = b51Var2;
                        di.pb.i1(context, sbVar.b, j10, boost, i6Var);
                    }
                } else {
                    b51Var = b51Var2;
                }
                if (view instanceof org.telegram.ui.Cells.m8) {
                    wg.l.J0(b51Var, i6Var, j10, null);
                }
                if (view instanceof bh.c) {
                    wg.l.J0(b51Var, i6Var, j10, ((bh.c) view).getPrepaidGiveaway());
                }
                if (((rb) sbVar.y.get(i7)).a == 9) {
                    sbVar.c(Boolean.valueOf(sbVar.E == 1));
                    break;
                }
                break;
            default:
                org.telegram.ui.Components.i60 i60Var = (org.telegram.ui.Components.i60) this.d;
                long j11 = this.b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.e;
                a0.h hVar = (a0.h) this.f;
                Context context2 = this.c;
                v4.i0 adapter = i60Var.o1.getAdapter();
                org.telegram.ui.Components.d60 d60Var = i60Var.R1;
                if (adapter == d60Var) {
                    int size = d60Var.c.size();
                    int size2 = i60Var.R1.e.e.size();
                    int size3 = i60Var.R1.e.d.size();
                    int i12 = i7 - 1;
                    if (i12 >= 0 && i12 < size) {
                        tLObject = (TLObject) i60Var.R1.c.get(i12);
                    } else if (i12 >= size && i12 < size3 + size) {
                        tLObject = (TLObject) i60Var.R1.e.d.get(i12 - size);
                    } else if (i12 > size + size3 && i12 <= size2 + size + size3) {
                        tLObject = (TLObject) i60Var.R1.e.e.get(((i12 - size) - size3) - 1);
                    }
                    if (i60Var.h2 != null) {
                        org.telegram.messenger.g0.v1(i60Var.w1.K);
                    }
                } else if (i7 == i60Var.S1) {
                    TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i60Var.a).O0(Long.valueOf(j11));
                    TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i60Var.a).P0(j11);
                    if (O0 != null) {
                        String K = org.telegram.messenger.v3.K(O0, false);
                        if (!TextUtils.isEmpty(K)) {
                            str = p5.c.m(org.telegram.messenger.mp.u1(i60Var.a).X2, "/", K, new StringBuilder("https://"));
                            if (str == null) {
                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                                i60Var.dismiss();
                                org.telegram.ui.Components.kc.j(g2Var).j();
                            }
                        }
                    }
                    if (P0 == null || (tL_chatInviteExported = P0.exported_invite) == null) {
                        if (!i60Var.t2) {
                            i60Var.t2 = true;
                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                            tL_messages_exportChatInvite.peer = org.telegram.messenger.mp.u1(i60Var.a).l1(-i60Var.q2);
                            ConnectionsManager.getInstance(i60Var.a).sendRequest(tL_messages_exportChatInvite, new org.telegram.ui.Components.e2(i60Var, 6));
                        }
                        str = null;
                    } else {
                        str = tL_chatInviteExported.link;
                    }
                    if (str == null) {
                    }
                } else if (i7 >= i60Var.T1 && i7 < i60Var.U1) {
                    tLObject = ((org.telegram.ui.Components.b60) i60Var.q1).E(i7);
                }
                if (tLObject != null) {
                    long j12 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
                    if (hVar == null || hVar.h(j12) < 0) {
                        if (j12 != 0) {
                            if (i60Var.a2.h(j12) >= 0) {
                                org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) i60Var.a2.f(j12);
                                i60Var.a2.l(j12);
                                i60Var.P1.b(n20Var);
                            } else {
                                org.telegram.ui.Components.n20 n20Var2 = new org.telegram.ui.Components.n20(context2, tLObject);
                                n20Var2.setOnClickListener(i60Var.m2);
                                i60Var.a2.k(n20Var2, j12);
                                i60Var.P1.a(n20Var2, true);
                            }
                        }
                        i60Var.T0(true);
                        org.telegram.messenger.g0.Z3(i60Var.o1);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ mb(org.telegram.ui.Components.i60 i60Var, long j3, org.telegram.ui.ActionBar.g2 g2Var, a0.h hVar, Context context) {
        this.d = i60Var;
        this.b = j3;
        this.e = g2Var;
        this.f = hVar;
        this.c = context;
    }
}
