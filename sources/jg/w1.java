package jg;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.bs;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.ActionBar.o5;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Cells.n6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.ek;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.ix;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.td0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.vr;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.Wallet.v5;
import org.telegram.ui.ay;
import org.telegram.ui.be;
import org.telegram.ui.g21;
import org.telegram.ui.i21;
import org.telegram.ui.i31;
import org.telegram.ui.j70;
import org.telegram.ui.le;
import org.telegram.ui.n21;
import org.telegram.ui.nd;
import org.telegram.ui.o01;
import org.telegram.ui.pf0;
import org.telegram.ui.rd;
import org.telegram.ui.sd;
import org.telegram.ui.se1;
import org.telegram.ui.u61;
import org.telegram.ui.ul0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ w1(int i10, View view, AtomicReference atomicReference) {
        this.a = 21;
        this.b = i10;
        this.c = view;
        this.d = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.messenger.h0 h0Var;
        Integer num;
        View view2;
        int R;
        int i10 = this.a;
        int i11 = 21;
        int i12 = 2;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                y1 y1Var = (y1) obj2;
                y1Var.a(i15);
                y1Var.b.v().i(i15 - 1, true);
                y1Var.b.z((ig.h) obj);
                break;
            case 1:
                p5 p5Var = (p5) obj;
                i5 i5Var = ((o5) obj2).a;
                if (!p5Var.s()) {
                    if (!p5Var.A0) {
                        org.telegram.ui.ActionBar.k kVar = i5Var.V;
                        if (kVar != null) {
                            kVar.b(i15);
                            break;
                        }
                    } else {
                        i5Var.w(true, true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.k kVar2 = i5Var.V;
                    if (kVar2 == null || kVar2.a()) {
                        p5Var.U(null, null);
                        break;
                    }
                }
                break;
            case 2:
                ma maVar = (ma) obj2;
                maVar.e.a(true, true);
                vp.r1(i15).T1().f(false, (ArrayList) obj, new ag.s2(maVar, i15, i14));
                break;
            case 3:
                ((ua) obj2).a(i15, ((ta) obj).h);
                break;
            case 4:
                le leVar = (le) obj2;
                u61 u61Var = (u61) obj;
                be beVar = leVar.G0;
                if (view.isEnabled() && !beVar.Q && !leVar.A0.Q) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (leVar.B0 <= currentTime) {
                        if (leVar.N0 >= vp.r1(i15).S5) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            rd rdVar = new rd(leVar, twoStepVerificationActivity, i12);
                            twoStepVerificationActivity.Z = 1;
                            twoStepVerificationActivity.b0 = rdVar;
                            beVar.setLoading(true);
                            twoStepVerificationActivity.w0(new sd(leVar, u61Var, twoStepVerificationActivity, i12));
                            break;
                        } else {
                            cc.a0(u61Var).M(leVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), org.telegram.messenger.i0.T2(cd.G((int) vp.r1(i15).S5, "BotStarsWithdrawMinLimit", new Object[0]), new nd(leVar, i15, i14))).j();
                            break;
                        }
                    } else {
                        leVar.P0 = cc.a0(u61Var).Q(R.raw.timer_3, 36, org.telegram.messenger.i0.W2(cd.a0(null, null, 2131752952, rh.i.v0(leVar.B0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 5:
                un unVar = (un) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (unVar.l1 != null && unVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    break;
                }
                break;
            case 6:
                un unVar2 = (un) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (unVar2.t5 != null && i15 < arrayList.size()) {
                    unVar2.Qa(((Integer) arrayList.get(i15)).intValue());
                    break;
                }
                break;
            case 7:
                ((ac0) obj2).setValue(i15);
                ((org.telegram.ui.Components.p2) obj).run();
                break;
            case 8:
                kk kkVar = (kk) obj2;
                p6 p6Var = (p6) obj;
                z60 F = z60.F(kkVar, p6Var, kkVar.y);
                F.Q = true;
                F.c(R.drawable.msg_addbot, cd.L0(2131743163, null), new ag.o0(kkVar, i15, p6Var, i11), false);
                F.c(R.drawable.menu_comments, cd.L0(2131743231, null), new ek(kkVar, r5), false);
                F.s = 0;
                F.a0(0.0f, -org.telegram.messenger.i0.L(48.0f));
                F.Z();
                break;
            case 9:
                vr vrVar = (vr) obj2;
                p51 p51Var = (p51) obj;
                if (!vrVar.e1()) {
                    r5 = i15 <= 0 ? 1 : 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = vrVar.o2;
                    boolean z11 = r5 ^ 1;
                    tL_chatBannedRights.send_media = z11;
                    tL_chatBannedRights.send_photos = z11;
                    tL_chatBannedRights.send_videos = z11;
                    tL_chatBannedRights.send_stickers = z11;
                    tL_chatBannedRights.send_gifs = z11;
                    tL_chatBannedRights.send_inline = z11;
                    tL_chatBannedRights.send_games = z11;
                    tL_chatBannedRights.send_audios = z11;
                    tL_chatBannedRights.send_docs = z11;
                    tL_chatBannedRights.send_voices = z11;
                    tL_chatBannedRights.send_roundvideos = z11;
                    tL_chatBannedRights.embed_links = z11;
                    tL_chatBannedRights.send_polls = z11;
                    tL_chatBannedRights.send_reactions = z11;
                    vrVar.h1();
                    p51Var.O(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vrVar.getContext());
                    String L0 = cd.L0(2131743745, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L0;
                    x1Var.T = cd.L0(2131743744, null);
                    alertDialog$Builder.k(cd.L0(2131747847, null), null);
                    x1Var.show();
                    break;
                }
            case 10:
                t30 t30Var = (t30) obj2;
                t30Var.n = i15;
                t30Var.b.e(false, view.getLeft());
                t30Var.c.e(false, view.getRight());
                ((bs) obj).a(i15);
                t30Var.invalidate();
                break;
            case 11:
                vd0 vd0Var = (vd0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = vd0Var.D1;
                org.telegram.ui.ActionBar.k2 k2Var = vd0Var.p1;
                int i16 = vd0Var.w1;
                if (i15 < i16 || i15 >= vd0Var.x1) {
                    int i17 = vd0Var.y1;
                    h0Var = (i15 < i17 || i15 >= vd0Var.z1) ? null : (org.telegram.messenger.h0) vd0Var.C1.get(i15 - i17);
                } else {
                    h0Var = (org.telegram.messenger.h0) arrayList2.get(i15 - i16);
                }
                if (h0Var != null) {
                    if (!vd0Var.A1) {
                        h0Var.d = !h0Var.d;
                        if (i15 >= vd0Var.w1 && i15 < vd0Var.x1) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < arrayList2.size()) {
                                    if (((org.telegram.messenger.h0) arrayList2.get(i18)).d) {
                                        z10 = true;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                            vd0Var.o1.setEnabled(z10);
                            vd0Var.I0();
                        }
                        ((td0) viewGroup).setChecked(h0Var.d);
                        break;
                    } else {
                        int i19 = h0Var.c;
                        if (i19 != 0) {
                            if (i19 != 1) {
                                if (i19 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{cd.L0(2131751767, null)}, new eg.j(6, vd0Var, h0Var));
                                    alertDialog$Builder2.p();
                                    break;
                                } else {
                                    String c10 = h0Var.c(false);
                                    if (!c10.startsWith("http")) {
                                        c10 = "http://".concat(c10);
                                    }
                                    gf.f.r(k2Var.getParentActivity(), c10);
                                    break;
                                }
                            } else {
                                gf.f.r(k2Var.getParentActivity(), "mailto:" + h0Var.c(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + h0Var.c(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                k2Var.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e) {
                                f8.g(e, true);
                                return;
                            }
                        }
                    }
                }
                break;
            case 12:
                js0 js0Var = (js0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                zt0 zt0Var = js0Var.f;
                org.telegram.ui.ActionBar.k2 k2Var2 = zt0Var.x1;
                k2Var2.finishPreviewFragment();
                chat.left = false;
                js0Var.E(false);
                js0Var.s(i15);
                if (js0Var.d.isEmpty()) {
                    zt0Var.K1(true);
                    zt0Var.M();
                }
                k2Var2.getNotificationCenter().k(zs.f3, Long.valueOf(-zt0Var.l1));
                k2Var2.getMessagesController().n(chat.id, k2Var2.getUserConfig().f(), null, k2Var2, new gi0(10, js0Var, chat));
                break;
            case 13:
                ((b41) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 14:
                ay.s0((ay) obj2, i15, (z60) obj);
                break;
            case 15:
                pf0.f0((pf0) obj2, i15, (z60) obj);
                break;
            case 16:
                boolean[] zArr = (boolean[]) obj2;
                n6[] n6VarArr = (n6[]) obj;
                zArr[0] = i15 == 1;
                int i20 = 0;
                while (i20 < 2) {
                    n6VarArr[i20].c.a(zArr[0] == (i20 == 1), true);
                    i20++;
                }
                break;
            case 17:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.k1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((o01) saveToGallerySettingsActivity.s.get(i15)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 18:
                ix ixVar = (ix) obj;
                i31 i31Var = ((i21) obj2).c;
                if (!ixVar.e && !d20.i(i31Var.V).q()) {
                    org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new kg.i1(i31Var.c1, i31Var.getContext(), i31Var.V, 11, false));
                        break;
                    }
                } else {
                    int i21 = 0;
                    while (true) {
                        g21 g21Var = i31Var.h0;
                        if (i21 >= g21Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((g21Var.getChildAt(i21) instanceof n21) && (R = RecyclerView.R((view2 = g21Var.getChildAt(i21)))) >= 0 && i31Var.y0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i21++;
                        }
                    }
                    if (num != null) {
                        i31Var.i(num.intValue(), view2);
                    }
                    cv.J0(null, ixVar.b, false, null, null);
                    i31Var.B0.add(Long.valueOf(ixVar.b.id));
                    i31Var.B(true, true, true);
                    break;
                }
                break;
            case 19:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i15));
                ((v5) obj2).setSelected(i15);
                break;
            case 20:
                vh.d dVar = (vh.d) obj2;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) obj;
                if (!dVar.Q) {
                    bh.d dVar2 = se1.d;
                    if (dVar2 != null && ((byte[]) dVar2.d) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new a3.b(i14), new j70(dVar, z2Var, i22, view, dVar2));
                        break;
                    } else {
                        f8.b("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 21:
                tz.p0 = i15;
                SharedPreferences.Editor edit = vp.d1().edit();
                edit.putInt("searchEngineType", tz.p0);
                edit.apply();
                ((p8) ((View) obj2)).w(org.telegram.ui.web.g1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            case 22:
                rh.v5 v5Var = (rh.v5) obj2;
                Runnable runnable = (Runnable) obj;
                v5Var.getClass();
                if ((i15 & 15) != 0) {
                    i13 = 15;
                } else if ((i15 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(v5Var.g & i13, i15, !TLObject.hasFlag(r0, i15));
                if (flag == 0) {
                    flag = (~i15) & i13;
                }
                int i23 = v5Var.g;
                int i24 = flag | ((~i13) & i23);
                if (i23 != i24) {
                    v5Var.g = i24;
                    v5Var.j(true);
                }
                runnable.run();
                break;
            case 23:
                vq0 vq0Var = (vq0) obj2;
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) obj;
                ep epVar = vq0Var.F;
                epVar.a(!epVar.a.q, true);
                boolean z12 = epVar.a.q;
                cc.a0(k2Var3).P(z12 ? R.raw.silent_unmute : R.raw.silent_mute, cd.L0(z12 ? 2131750265 : 2131750264, null)).j();
                vq0Var.d.h = Boolean.valueOf(z12);
                if (vq0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(vq0Var.H, true);
                    vq0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = vp.r1(i15).i1(vq0Var.c);
                togglechatstargiftnotifications.enabled = z12;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new ul0(i11, vq0Var, k2Var3));
                break;
            default:
                gf.f.r((Context) obj2, "https://" + vp.r1(i15).U2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
        }
    }

    public /* synthetic */ w1(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ w1(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
