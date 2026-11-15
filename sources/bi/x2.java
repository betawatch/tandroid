package bi;

import a8.r7;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import di.m8;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.pr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.l8;
import org.telegram.ui.Cells.ma;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.d31;
import org.telegram.ui.Components.e30;
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.hh0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.qk;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.Components.zw;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.an;
import org.telegram.ui.dd;
import org.telegram.ui.id;
import org.telegram.ui.je0;
import org.telegram.ui.k60;
import org.telegram.ui.l01;
import org.telegram.ui.n01;
import org.telegram.ui.n11;
import org.telegram.ui.nd;
import org.telegram.ui.s01;
import org.telegram.ui.vc1;
import org.telegram.ui.xd;
import org.telegram.ui.yw;
import org.telegram.ui.yy0;
import org.telegram.ui.z41;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x2(int i7, View view, AtomicReference atomicReference) {
        this.a = 24;
        this.b = i7;
        this.c = view;
        this.d = atomicReference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.messenger.f0 f0Var;
        Integer num;
        View view2;
        int R;
        int i7 = this.a;
        int i10 = 5;
        int i11 = 4;
        int i12 = 2;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                m8 m8Var = (m8) obj2;
                Runnable runnable = (Runnable) obj;
                m8Var.getClass();
                if ((i15 & 15) != 0) {
                    i13 = 15;
                } else if ((i15 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(m8Var.g & i13, i15, !TLObject.hasFlag(r0, i15));
                if (flag == 0) {
                    flag = (~i15) & i13;
                }
                int i16 = m8Var.g;
                int i17 = flag | ((~i13) & i16);
                if (i16 != i17) {
                    m8Var.g = i17;
                    m8Var.j(true);
                }
                runnable.run();
                break;
            case 1:
                wp0 wp0Var = (wp0) obj2;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj;
                fp fpVar = wp0Var.G;
                fpVar.a(!fpVar.a.q, true);
                boolean z11 = fpVar.a.q;
                cc.a0(e2Var).P(z11 ? R.raw.silent_unmute : R.raw.silent_mute, hd.M0(z11 ? 2131750256 : 2131750255, null)).j();
                wp0Var.d.h = Boolean.valueOf(z11);
                if (wp0Var.I >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(wp0Var.I, true);
                    wp0Var.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = np.s1(i15).j1(wp0Var.c);
                togglechatstargiftnotifications.enabled = z11;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new v2(i13, wp0Var, e2Var));
                break;
            case 2:
                vf.c.t((Context) obj2, "https://" + np.s1(i15).V2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 3:
                org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) obj;
                org.telegram.ui.ActionBar.w4 w4Var = ((org.telegram.ui.ActionBar.c5) obj2).a;
                if (!d5Var.t()) {
                    if (!d5Var.B0) {
                        org.telegram.ui.ActionBar.j jVar = w4Var.W;
                        if (jVar != null) {
                            jVar.b(i15);
                            break;
                        }
                    } else {
                        w4Var.y(true, true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = w4Var.W;
                    if (jVar2 == null || jVar2.a()) {
                        d5Var.V(null, null);
                        break;
                    }
                }
                break;
            case 4:
                ma maVar = (ma) obj2;
                maVar.e.a(true, true);
                np.s1(i15).U1().f(false, (ArrayList) obj, new ai.x1(maVar, i15, i11));
                break;
            case 5:
                ((ta) obj2).a(i15, ((sa) obj).h);
                break;
            case 6:
                xd xdVar = (xd) obj2;
                z41 z41Var = (z41) obj;
                nd ndVar = xdVar.H0;
                if (view.isEnabled() && !ndVar.R && !xdVar.B0.R) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (xdVar.C0 <= currentTime) {
                        if (xdVar.O0 >= np.s1(i15).S5) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            org.telegram.ui.hd hdVar = new org.telegram.ui.hd(xdVar, twoStepVerificationActivity, i12);
                            twoStepVerificationActivity.a0 = 1;
                            twoStepVerificationActivity.c0 = hdVar;
                            ndVar.setLoading(true);
                            twoStepVerificationActivity.x0(new id(xdVar, z41Var, twoStepVerificationActivity, i12));
                            break;
                        } else {
                            cc.a0(z41Var).M(xdVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), org.telegram.messenger.g0.U2(hd.G((int) np.s1(i15).S5, "BotStarsWithdrawMinLimit", new Object[0]), new dd(xdVar, i15, i14))).j();
                            break;
                        }
                    } else {
                        xdVar.Q0 = cc.a0(z41Var).Q(R.raw.timer_3, 36, org.telegram.messenger.g0.X2(hd.a0(null, null, 2131752952, di.t.w0(xdVar.C0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 7:
                an anVar = (an) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (anVar.m1 != null && anVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    break;
                }
                break;
            case 8:
                an anVar2 = (an) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (anVar2.u5 != null && i15 < arrayList.size()) {
                    anVar2.db(((Integer) arrayList.get(i15)).intValue());
                    break;
                }
                break;
            case 9:
                ((ib0) obj2).setValue(i15);
                ((org.telegram.ui.Components.o2) obj).run();
                break;
            case 10:
                ((x0) obj2).c(new org.telegram.ui.Components.a2((ji.g) obj, i15, i10));
                break;
            case 11:
                qk qkVar = (qk) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                m60 F = m60.F(qkVar, e6Var, qkVar.y);
                F.Q = true;
                F.c(R.drawable.msg_addbot, hd.M0(2131743137, null), new org.telegram.ui.f0(qkVar, i15, e6Var, 7), false);
                F.c(R.drawable.menu_comments, hd.M0(2131743205, null), new kk(qkVar, i13), false);
                F.s = 0;
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                break;
            case 12:
                rr rrVar = (rr) obj2;
                p41 p41Var = (p41) obj;
                if (!rrVar.e1()) {
                    boolean z12 = i15 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = rrVar.s2;
                    boolean z13 = !z12;
                    tL_chatBannedRights.send_media = z13;
                    tL_chatBannedRights.send_photos = z13;
                    tL_chatBannedRights.send_videos = z13;
                    tL_chatBannedRights.send_stickers = z13;
                    tL_chatBannedRights.send_gifs = z13;
                    tL_chatBannedRights.send_inline = z13;
                    tL_chatBannedRights.send_games = z13;
                    tL_chatBannedRights.send_audios = z13;
                    tL_chatBannedRights.send_docs = z13;
                    tL_chatBannedRights.send_voices = z13;
                    tL_chatBannedRights.send_roundvideos = z13;
                    tL_chatBannedRights.embed_links = z13;
                    tL_chatBannedRights.send_polls = z13;
                    tL_chatBannedRights.send_reactions = z13;
                    rrVar.h1();
                    p41Var.O(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rrVar.getContext());
                    String M0 = hd.M0(2131743719, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = M0;
                    t1Var.U = hd.M0(2131743718, null);
                    alertDialog$Builder.k(hd.M0(2131747831, null), null);
                    t1Var.show();
                    break;
                }
            case 13:
                e30 e30Var = (e30) obj2;
                e30Var.n = i15;
                e30Var.b.e(false, view.getLeft());
                e30Var.c.e(false, view.getRight());
                ((pr) obj).a(i15);
                e30Var.invalidate();
                break;
            case 14:
                bd0 bd0Var = (bd0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = bd0Var.H1;
                org.telegram.ui.ActionBar.e2 e2Var2 = bd0Var.t1;
                int i18 = bd0Var.A1;
                if (i15 < i18 || i15 >= bd0Var.B1) {
                    int i19 = bd0Var.C1;
                    f0Var = (i15 < i19 || i15 >= bd0Var.D1) ? null : (org.telegram.messenger.f0) bd0Var.G1.get(i15 - i19);
                } else {
                    f0Var = (org.telegram.messenger.f0) arrayList2.get(i15 - i18);
                }
                if (f0Var != null) {
                    if (!bd0Var.E1) {
                        f0Var.d = !f0Var.d;
                        if (i15 >= bd0Var.A1 && i15 < bd0Var.B1) {
                            int i20 = 0;
                            while (true) {
                                if (i20 < arrayList2.size()) {
                                    if (((org.telegram.messenger.f0) arrayList2.get(i20)).d) {
                                        z10 = true;
                                    } else {
                                        i20++;
                                    }
                                }
                            }
                            bd0Var.s1.setEnabled(z10);
                            bd0Var.I0();
                        }
                        ((zc0) viewGroup).setChecked(f0Var.d);
                        break;
                    } else {
                        int i21 = f0Var.c;
                        if (i21 != 0) {
                            if (i21 != 1) {
                                if (i21 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(e2Var2.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{hd.M0(2131751767, null)}, new og.j(i10, bd0Var, f0Var));
                                    alertDialog$Builder2.p();
                                    break;
                                } else {
                                    String c10 = f0Var.c(false);
                                    if (!c10.startsWith("http")) {
                                        c10 = "http://".concat(c10);
                                    }
                                    vf.c.t(e2Var2.getParentActivity(), c10);
                                    break;
                                }
                            } else {
                                vf.c.t(e2Var2.getParentActivity(), "mailto:" + f0Var.c(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + f0Var.c(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                e2Var2.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                return;
                            }
                        }
                    }
                }
                break;
            case 15:
                kr0 kr0Var = (kr0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ys0 ys0Var = kr0Var.f;
                org.telegram.ui.ActionBar.e2 e2Var3 = ys0Var.y1;
                e2Var3.finishPreviewFragment();
                chat.left = false;
                kr0Var.E(false);
                kr0Var.s(i15);
                if (kr0Var.d.isEmpty()) {
                    ys0Var.P1(true);
                    ys0Var.N();
                }
                e2Var3.getNotificationCenter().k(ns.f3, Long.valueOf(-ys0Var.m1));
                e2Var3.getMessagesController().n(chat.id, e2Var3.getUserConfig().f(), null, e2Var3, new hh0(10, kr0Var, chat));
                break;
            case 16:
                ((d31) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 17:
                yw.t0((yw) obj2, i15, (m60) obj);
                break;
            case 18:
                je0.d0((je0) obj2, i15, (m60) obj);
                break;
            case 19:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj;
                zArr[0] = i15 == 1;
                int i22 = 0;
                while (i22 < 2) {
                    i6VarArr[i22].c.a(zArr[0] == (i22 == 1), true);
                    i22++;
                }
                break;
            case 20:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((yy0) saveToGallerySettingsActivity.s.get(i15)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 21:
                zw zwVar = (zw) obj;
                n11 n11Var = ((n01) obj2).c;
                if (!zwVar.e && !m10.i(n11Var.W).q()) {
                    org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.x0(n11Var.d1, n11Var.getContext(), n11Var.W, 11, false));
                        break;
                    }
                } else {
                    int i23 = 0;
                    while (true) {
                        l01 l01Var = n11Var.i0;
                        if (i23 >= l01Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((l01Var.getChildAt(i23) instanceof s01) && (R = RecyclerView.R((view2 = l01Var.getChildAt(i23)))) >= 0 && n11Var.z0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i23++;
                        }
                    }
                    if (num != null) {
                        n11Var.i(num.intValue(), view2);
                    }
                    wu.J0(null, zwVar.b, false, null, null);
                    n11Var.C0.add(Long.valueOf(zwVar.b.id));
                    n11Var.B(true, true, true);
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.t5) obj2).setSelected(i15);
                break;
            case 23:
                hi.d dVar = (hi.d) obj2;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                if (!dVar.R) {
                    r7 r7Var = vc1.d;
                    if (r7Var != null && ((byte[]) r7Var.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i24 = this.b;
                        ConnectionsManager.getInstance(i24).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(i14), new k60(dVar, u2Var, i24, view, r7Var));
                        break;
                    } else {
                        a8.b("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 24:
                gz.p0 = i15;
                SharedPreferences.Editor edit = np.e1().edit();
                edit.putInt("searchEngineType", gz.p0);
                edit.apply();
                ((l8) ((View) obj2)).w(org.telegram.ui.web.d1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            default:
                tg.h1 h1Var = (tg.h1) obj2;
                h1Var.a(i15);
                h1Var.b.x().i(i15 - 1, true);
                h1Var.b.w((sg.h) obj);
                break;
        }
    }

    public /* synthetic */ x2(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ x2(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
