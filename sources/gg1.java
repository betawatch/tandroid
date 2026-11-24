// default package

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class gg1 implements c39 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ gg1(kg1 kg1Var, Context context, long j, wjb wjbVar, uxa uxaVar) {
        this.d = kg1Var;
        this.c = context;
        this.b = j;
        this.e = wjbVar;
        this.f = uxaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cf, code lost:
    
        if (r14.user_id < 0) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    @Override // c39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, View view) {
        long j;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLObject tLObject = null;
        switch (this.a) {
            case 0:
                kg1 kg1Var = (kg1) this.d;
                Context context = this.c;
                long j2 = this.b;
                wjb wjbVar = (wjb) this.e;
                uxa uxaVar = (uxa) this.f;
                if (view instanceof uv4) {
                    uv4 uv4Var = (uv4) view;
                    TL_stories.Boost boost = uv4Var.getBoost();
                    boolean z = boost.giveaway;
                    if (!z || boost.stars <= 0) {
                        boolean z2 = boost.gift;
                        if (z2 || z) {
                            j = -1;
                            break;
                        } else {
                            j = -1;
                        }
                        if (!boost.unclaimed) {
                            if (z && boost.user_id == j) {
                                t11 t11Var = new t11(uxaVar.getParentActivity(), uxaVar.getResourceProvider());
                                t11Var.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                t11Var.b.setText(k96.M0(2131753300, null));
                                t11Var.b.setSingleLine(false);
                                t11Var.b.setMaxLines(2);
                                m21.g(uxaVar, t11Var, 2750).j();
                            } else if (!z2 && !z) {
                                uxaVar.presentFragment(ProfileActivity.P2(uv4Var.getDialogId()));
                            }
                        }
                        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                        tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                        tL_payments_checkedGiftCode.to_id = boost.user_id;
                        tL_payments_checkedGiftCode.from_id = na7.q1(y6c.t0).w1(-kg1Var.J.id);
                        int i2 = boost.date;
                        tL_payments_checkedGiftCode.date = i2;
                        tL_payments_checkedGiftCode.via_giveaway = boost.giveaway;
                        int i3 = boost.expires - i2;
                        tL_payments_checkedGiftCode.days = i3 / 86400;
                        tL_payments_checkedGiftCode.months = (i3 / 30) / 86400;
                        if (boost.unclaimed) {
                            tL_payments_checkedGiftCode.to_id = j;
                            tL_payments_checkedGiftCode.flags = -1;
                        } else {
                            tL_payments_checkedGiftCode.boost = boost;
                        }
                        new pt4(uxaVar, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                    } else {
                        jva.h1(context, kg1Var.b, j2, boost, wjbVar);
                    }
                }
                if (view instanceof wgb) {
                    dn0.D0(uxaVar, wjbVar, j2, null);
                }
                if (view instanceof xv4) {
                    dn0.D0(uxaVar, wjbVar, j2, ((xv4) view).getPrepaidGiveaway());
                }
                if (((jg1) kg1Var.y.get(i)).a == 9) {
                    kg1Var.c(Boolean.valueOf(kg1Var.E == 1));
                    break;
                }
                break;
            default:
                jr5 jr5Var = (jr5) this.d;
                long j3 = this.b;
                d dVar = (d) this.e;
                vf6 vf6Var = (vf6) this.f;
                Context context2 = this.c;
                w39 adapter = jr5Var.n1.getAdapter();
                fr5 fr5Var = jr5Var.Q1;
                if (adapter == fr5Var) {
                    int size = fr5Var.c.size();
                    int size2 = jr5Var.Q1.e.e.size();
                    int size3 = jr5Var.Q1.e.d.size();
                    int i4 = i - 1;
                    if (i4 >= 0 && i4 < size) {
                        tLObject = (TLObject) jr5Var.Q1.c.get(i4);
                    } else if (i4 >= size && i4 < size3 + size) {
                        tLObject = (TLObject) jr5Var.Q1.e.d.get(i4 - size);
                    } else if (i4 > size + size3 && i4 <= size2 + size + size3) {
                        tLObject = (TLObject) jr5Var.Q1.e.e.get(((i4 - size) - size3) - 1);
                    }
                    if (jr5Var.g2 != null) {
                        gl.t1(jr5Var.v1.K);
                    }
                } else if (i == jr5Var.R1) {
                    TLRPC.Chat K0 = na7.q1(jr5Var.a).K0(Long.valueOf(j3));
                    TLRPC.ChatFull L0 = na7.q1(jr5Var.a).L0(j3);
                    if (K0 != null) {
                        String K = hc2.K(K0, false);
                        if (!TextUtils.isEmpty(K)) {
                            str = ls6.o(na7.q1(jr5Var.a).N2, "/", K, new StringBuilder("https://"));
                            if (str == null) {
                                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                                jr5Var.dismiss();
                                u21.j(dVar).j();
                            }
                        }
                    }
                    if (L0 == null || (tL_chatInviteExported = L0.exported_invite) == null) {
                        if (!jr5Var.s2) {
                            jr5Var.s2 = true;
                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                            tL_messages_exportChatInvite.peer = na7.q1(jr5Var.a).h1(-jr5Var.p2);
                            ConnectionsManager.getInstance(jr5Var.a).sendRequest(tL_messages_exportChatInvite, new n35(jr5Var, (byte) 4));
                        }
                        str = null;
                    } else {
                        str = tL_chatInviteExported.link;
                    }
                    if (str == null) {
                    }
                } else if (i >= jr5Var.S1 && i < jr5Var.T1) {
                    tLObject = ((dr5) jr5Var.p1).E(i);
                }
                if (tLObject != null) {
                    long j4 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
                    if (vf6Var == null || vf6Var.h(j4) < 0) {
                        if (j4 != 0) {
                            if (jr5Var.Z1.h(j4) >= 0) {
                                ya5 ya5Var = (ya5) jr5Var.Z1.f(j4);
                                jr5Var.Z1.l(j4);
                                jr5Var.O1.b(ya5Var);
                            } else {
                                ya5 ya5Var2 = new ya5(context2, tLObject);
                                ya5Var2.setOnClickListener(jr5Var.l2);
                                jr5Var.Z1.k(ya5Var2, j4);
                                jr5Var.O1.a(ya5Var2, true);
                            }
                        }
                        jr5Var.N0(true);
                        gl.W3(jr5Var.n1);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ gg1(jr5 jr5Var, long j, d dVar, vf6 vf6Var, Context context) {
        this.d = jr5Var;
        this.b = j;
        this.e = dVar;
        this.f = vf6Var;
        this.c = context;
    }
}
