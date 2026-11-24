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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oh1 implements f59 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ KeyEvent.Callback d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oh1(sh1 sh1Var, Context context, long j, ylb ylbVar, xza xzaVar) {
        this.d = sh1Var;
        this.c = context;
        this.b = j;
        this.e = ylbVar;
        this.f = xzaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cf, code lost:
    
        if (r14.user_id < 0) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    @Override // f59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(int i, View view) {
        long j;
        String str;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        TLObject tLObject = null;
        switch (this.a) {
            case 0:
                sh1 sh1Var = (sh1) this.d;
                Context context = this.c;
                long j2 = this.b;
                ylb ylbVar = (ylb) this.e;
                xza xzaVar = (xza) this.f;
                if (view instanceof vx4) {
                    vx4 vx4Var = (vx4) view;
                    TL_stories.Boost boost = vx4Var.getBoost();
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
                                b31 b31Var = new b31(xzaVar.getParentActivity(), xzaVar.getResourceProvider());
                                b31Var.c(R.raw.chats_infotip, 36, 36, new String[0]);
                                b31Var.b.setText(jb6.M0(2131753268, null));
                                b31Var.b.setSingleLine(false);
                                b31Var.b.setMaxLines(2);
                                u31.g(xzaVar, b31Var, 2750).j();
                            } else if (!z2 && !z) {
                                xzaVar.presentFragment(ProfileActivity.S2(vx4Var.getDialogId()));
                            }
                        }
                        TLRPC.TL_payments_checkedGiftCode tL_payments_checkedGiftCode = new TLRPC.TL_payments_checkedGiftCode();
                        tL_payments_checkedGiftCode.giveaway_msg_id = boost.giveaway_msg_id;
                        tL_payments_checkedGiftCode.to_id = boost.user_id;
                        tL_payments_checkedGiftCode.from_id = oc7.r1(z8c.t0).x1(-sh1Var.J.id);
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
                        new rv4(xzaVar, tL_payments_checkedGiftCode, boost.used_gift_slug).show();
                    } else {
                        nxa.i1(context, sh1Var.b, j2, boost, ylbVar);
                    }
                }
                if (view instanceof xib) {
                    do0.D0(xzaVar, ylbVar, j2, null);
                }
                if (view instanceof zx4) {
                    do0.D0(xzaVar, ylbVar, j2, ((zx4) view).getPrepaidGiveaway());
                }
                if (((rh1) sh1Var.y.get(i)).a == 9) {
                    sh1Var.c(Boolean.valueOf(sh1Var.E == 1));
                    break;
                }
                break;
            default:
                it5 it5Var = (it5) this.d;
                long j3 = this.b;
                d dVar = (d) this.e;
                vh6 vh6Var = (vh6) this.f;
                Context context2 = this.c;
                y59 adapter = it5Var.n1.getAdapter();
                et5 et5Var = it5Var.Q1;
                if (adapter == et5Var) {
                    int size = et5Var.c.size();
                    int size2 = it5Var.Q1.e.e.size();
                    int size3 = it5Var.Q1.e.d.size();
                    int i4 = i - 1;
                    if (i4 >= 0 && i4 < size) {
                        tLObject = (TLObject) it5Var.Q1.c.get(i4);
                    } else if (i4 >= size && i4 < size3 + size) {
                        tLObject = (TLObject) it5Var.Q1.e.d.get(i4 - size);
                    } else if (i4 > size + size3 && i4 <= size2 + size + size3) {
                        tLObject = (TLObject) it5Var.Q1.e.e.get(((i4 - size) - size3) - 1);
                    }
                    if (it5Var.g2 != null) {
                        gm.t1(it5Var.v1.K);
                    }
                } else if (i == it5Var.R1) {
                    TLRPC.Chat L0 = oc7.r1(it5Var.a).L0(Long.valueOf(j3));
                    TLRPC.ChatFull M0 = oc7.r1(it5Var.a).M0(j3);
                    if (L0 != null) {
                        String K = sd2.K(L0, false);
                        if (!TextUtils.isEmpty(K)) {
                            str = kt6.p(oc7.r1(it5Var.a).N2, "/", K, new StringBuilder("https://"));
                            if (str == null) {
                                ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", str));
                                it5Var.dismiss();
                                c41.j(dVar).j();
                            }
                        }
                    }
                    if (M0 == null || (tL_chatInviteExported = M0.exported_invite) == null) {
                        if (!it5Var.s2) {
                            it5Var.s2 = true;
                            TLRPC.TL_messages_exportChatInvite tL_messages_exportChatInvite = new TLRPC.TL_messages_exportChatInvite();
                            tL_messages_exportChatInvite.legacy_revoke_permanent = true;
                            tL_messages_exportChatInvite.peer = oc7.r1(it5Var.a).i1(-it5Var.p2);
                            ConnectionsManager.getInstance(it5Var.a).sendRequest(tL_messages_exportChatInvite, new r15(it5Var, (byte) 5));
                        }
                        str = null;
                    } else {
                        str = tL_chatInviteExported.link;
                    }
                    if (str == null) {
                    }
                } else if (i >= it5Var.S1 && i < it5Var.T1) {
                    tLObject = ((bt5) it5Var.p1).E(i);
                }
                if (tLObject != null) {
                    long j4 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
                    if (vh6Var == null || vh6Var.h(j4) < 0) {
                        if (j4 != 0) {
                            if (it5Var.Z1.h(j4) >= 0) {
                                wc5 wc5Var = (wc5) it5Var.Z1.f(j4);
                                it5Var.Z1.l(j4);
                                it5Var.O1.b(wc5Var);
                            } else {
                                wc5 wc5Var2 = new wc5(context2, tLObject);
                                wc5Var2.setOnClickListener(it5Var.l2);
                                it5Var.Z1.k(wc5Var2, j4);
                                it5Var.O1.a(wc5Var2, true);
                            }
                        }
                        it5Var.N0(true);
                        gm.V3(it5Var.n1);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ oh1(it5 it5Var, long j, d dVar, vh6 vh6Var, Context context) {
        this.d = it5Var;
        this.b = j;
        this.e = dVar;
        this.f = vh6Var;
        this.c = context;
    }
}
