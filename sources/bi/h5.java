package bi;

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
import org.telegram.messenger.cz;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.np;
import org.telegram.messenger.or;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.oa;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.hx;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.p31;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.tk;
import org.telegram.ui.Components.ur0;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.cx;
import org.telegram.ui.cz0;
import org.telegram.ui.dd;
import org.telegram.ui.id;
import org.telegram.ui.ii;
import org.telegram.ui.me0;
import org.telegram.ui.n60;
import org.telegram.ui.nd;
import org.telegram.ui.q01;
import org.telegram.ui.s01;
import org.telegram.ui.s11;
import org.telegram.ui.x01;
import org.telegram.ui.xd;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class h5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h5(int i7, View view, AtomicReference atomicReference) {
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
        int i11 = 8;
        int i12 = 2;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                di.p8 p8Var = (di.p8) obj2;
                Runnable runnable = (Runnable) obj;
                p8Var.getClass();
                if ((i15 & 15) != 0) {
                    i13 = 15;
                } else if ((i15 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(p8Var.g & i13, i15, !TLObject.hasFlag(r0, i15));
                if (flag == 0) {
                    flag = (~i15) & i13;
                }
                int i16 = p8Var.g;
                int i17 = flag | ((~i13) & i16);
                if (i16 != i17) {
                    p8Var.g = i17;
                    p8Var.k(true);
                }
                runnable.run();
                break;
            case 1:
                gq0 gq0Var = (gq0) obj2;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj;
                op opVar = gq0Var.G;
                opVar.a(!opVar.a.q, true);
                boolean z11 = opVar.a.q;
                lc.b0(g2Var).P(z11 ? R.raw.silent_unmute : R.raw.silent_mute, hd.N0(z11 ? 2131750239 : 2131750238, null)).j();
                gq0Var.d.h = Boolean.valueOf(z11);
                if (gq0Var.I >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(gq0Var.I, true);
                    gq0Var.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = np.u1(i15).l1(gq0Var.c);
                togglechatstargiftnotifications.enabled = z11;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new o1(i14, gq0Var, g2Var));
                break;
            case 2:
                vf.c.t((Context) obj2, "https://" + np.u1(i15).X2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 3:
                org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) obj;
                org.telegram.ui.ActionBar.z4 z4Var = ((org.telegram.ui.ActionBar.f5) obj2).a;
                if (!g5Var.t()) {
                    if (!g5Var.B0) {
                        org.telegram.ui.ActionBar.j jVar = z4Var.W;
                        if (jVar != null) {
                            jVar.b(i15);
                            break;
                        }
                    } else {
                        z4Var.B(true, true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = z4Var.W;
                    if (jVar2 == null || jVar2.a()) {
                        g5Var.V(null, null);
                        break;
                    }
                }
                break;
            case 4:
                oa oaVar = (oa) obj2;
                oaVar.e.a(true, true);
                np.u1(i15).W1().f(false, (ArrayList) obj, new ai.b2(oaVar, i15, i10));
                break;
            case 5:
                ((va) obj2).a(i15, ((ua) obj).h);
                break;
            case 6:
                xd xdVar = (xd) obj2;
                c51 c51Var = (c51) obj;
                nd ndVar = xdVar.H0;
                if (view.isEnabled() && !ndVar.R && !xdVar.B0.R) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (xdVar.C0 <= currentTime) {
                        if (xdVar.O0 >= np.u1(i15).U5) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            org.telegram.ui.hd hdVar = new org.telegram.ui.hd(xdVar, twoStepVerificationActivity, i12);
                            twoStepVerificationActivity.a0 = 1;
                            twoStepVerificationActivity.c0 = hdVar;
                            ndVar.setLoading(true);
                            twoStepVerificationActivity.x0(new id(xdVar, c51Var, twoStepVerificationActivity, i12));
                            break;
                        } else {
                            lc.b0(c51Var).M(xdVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), org.telegram.messenger.g0.T2(hd.G((int) np.u1(i15).U5, "BotStarsWithdrawMinLimit", new Object[0]), new dd(xdVar, i15, i14))).j();
                            break;
                        }
                    } else {
                        xdVar.Q0 = lc.b0(c51Var).Q(R.raw.timer_3, 36, org.telegram.messenger.g0.W2(hd.a0(null, null, 2131752940, di.t.x0(xdVar.C0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 7:
                bn bnVar = (bn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (bnVar.m1 != null && bnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    break;
                }
                break;
            case 8:
                bn bnVar2 = (bn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (bnVar2.v5 != null && i15 < arrayList.size()) {
                    bnVar2.db(((Integer) arrayList.get(i15)).intValue());
                    break;
                }
                break;
            case 9:
                ((tb0) obj2).setValue(i15);
                ((org.telegram.ui.Components.x2) obj).run();
                break;
            case 10:
                ((b1) obj2).c(new ii((ji.f) obj, i15, i11));
                break;
            case 11:
                zk zkVar = (zk) obj2;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                a70 G = a70.G(zkVar, h6Var, zkVar.y);
                G.T = true;
                G.c(R.drawable.msg_addbot, hd.N0(2131742891, null), new org.telegram.ui.f0(zkVar, i15, h6Var, 7), false);
                G.c(R.drawable.menu_comments, hd.N0(2131742959, null), new tk(zkVar, i13), false);
                G.s = 0;
                G.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                G.a0();
                break;
            case 12:
                as asVar = (as) obj2;
                org.telegram.ui.Components.c51 c51Var2 = (org.telegram.ui.Components.c51) obj;
                if (!asVar.f1()) {
                    boolean z12 = i15 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = asVar.s2;
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
                    asVar.i1();
                    c51Var2.O(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(asVar.getContext());
                    String N0 = hd.N0(2131743474, null);
                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                    t1Var.S = N0;
                    t1Var.U = hd.N0(2131743473, null);
                    alertDialog$Builder.k(hd.N0(2131747637, null), null);
                    t1Var.show();
                    break;
                }
            case 13:
                p30 p30Var = (p30) obj2;
                p30Var.n = i15;
                p30Var.b.e(false, view.getLeft());
                p30Var.c.e(false, view.getRight());
                ((or) obj).a(i15);
                p30Var.invalidate();
                break;
            case 14:
                md0 md0Var = (md0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = md0Var.H1;
                org.telegram.ui.ActionBar.g2 g2Var2 = md0Var.t1;
                int i18 = md0Var.A1;
                if (i15 < i18 || i15 >= md0Var.B1) {
                    int i19 = md0Var.C1;
                    f0Var = (i15 < i19 || i15 >= md0Var.D1) ? null : (org.telegram.messenger.f0) md0Var.G1.get(i15 - i19);
                } else {
                    f0Var = (org.telegram.messenger.f0) arrayList2.get(i15 - i18);
                }
                if (f0Var != null) {
                    if (!md0Var.E1) {
                        f0Var.d = !f0Var.d;
                        if (i15 >= md0Var.A1 && i15 < md0Var.B1) {
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
                            md0Var.s1.setEnabled(z10);
                            md0Var.J0();
                        }
                        ((kd0) viewGroup).setChecked(f0Var.d);
                        break;
                    } else {
                        int i21 = f0Var.c;
                        if (i21 != 0) {
                            if (i21 != 1) {
                                if (i21 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(g2Var2.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{hd.N0(2131751755, null)}, new og.j(i10, md0Var, f0Var));
                                    alertDialog$Builder2.p();
                                    break;
                                } else {
                                    String c10 = f0Var.c(false);
                                    if (!c10.startsWith("http")) {
                                        c10 = "http://".concat(c10);
                                    }
                                    vf.c.t(g2Var2.getParentActivity(), c10);
                                    break;
                                }
                            } else {
                                vf.c.t(g2Var2.getParentActivity(), "mailto:" + f0Var.c(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + f0Var.c(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                g2Var2.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    }
                }
                break;
            case 15:
                ur0 ur0Var = (ur0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                jt0 jt0Var = ur0Var.f;
                org.telegram.ui.ActionBar.g2 g2Var3 = jt0Var.y1;
                g2Var3.finishPreviewFragment();
                chat.left = false;
                ur0Var.E(false);
                ur0Var.s(i15);
                if (ur0Var.d.isEmpty()) {
                    jt0Var.P1(true);
                    jt0Var.N();
                }
                g2Var3.getNotificationCenter().k(203, Long.valueOf(-jt0Var.m1));
                g2Var3.getMessagesController().n(chat.id, g2Var3.getUserConfig().f(), null, g2Var3, new fm0(i11, ur0Var, chat));
                break;
            case 16:
                ((p31) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 17:
                cx.w0((cx) obj2, i15, (a70) obj);
                break;
            case 18:
                me0.g0((me0) obj2, i15, (a70) obj);
                break;
            case 19:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.k6[] k6VarArr = (org.telegram.ui.Cells.k6[]) obj;
                zArr[0] = i15 == 1;
                int i22 = 0;
                while (i22 < 2) {
                    k6VarArr[i22].c.a(zArr[0] == (i22 == 1), true);
                    i22++;
                }
                break;
            case 20:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((cz0) saveToGallerySettingsActivity.s.get(i15)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 21:
                hx hxVar = (hx) obj;
                s11 s11Var = ((s01) obj2).c;
                if (!hxVar.e && !k10.i(s11Var.W).q()) {
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.y0(s11Var.d1, s11Var.getContext(), s11Var.W, 11, false));
                        break;
                    }
                } else {
                    int i23 = 0;
                    while (true) {
                        q01 q01Var = s11Var.i0;
                        if (i23 >= q01Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((q01Var.getChildAt(i23) instanceof x01) && (R = RecyclerView.R((view2 = q01Var.getChildAt(i23)))) >= 0 && s11Var.z0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i23++;
                        }
                    }
                    if (num != null) {
                        s11Var.i(num.intValue(), view2);
                    }
                    ev.K0(null, hxVar.b, false, null, null);
                    s11Var.C0.add(Long.valueOf(hxVar.b.id));
                    s11Var.B(true, true, true);
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.i6) obj2).setSelected(i15);
                break;
            case 23:
                hi.e eVar = (hi.e) obj2;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                if (!eVar.R) {
                    a8.r7 r7Var = yc1.d;
                    if (r7Var != null && ((byte[]) r7Var.e) != null) {
                        eVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i24 = this.b;
                        ConnectionsManager.getInstance(i24).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(i14), new n60(eVar, w2Var, i24, view, r7Var));
                        break;
                    } else {
                        org.telegram.messenger.a8.b("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 24:
                cz.p0 = i15;
                SharedPreferences.Editor edit = np.g1().edit();
                edit.putInt("searchEngineType", cz.p0);
                edit.apply();
                ((org.telegram.ui.Cells.n8) ((View) obj2)).w(org.telegram.ui.web.e1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            default:
                tg.i1 i1Var = (tg.i1) obj2;
                i1Var.a(i15);
                i1Var.b.x().i(i15 - 1, true);
                i1Var.b.w((sg.h) obj);
                break;
        }
    }

    public /* synthetic */ h5(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ h5(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
