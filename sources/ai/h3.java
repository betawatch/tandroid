package ai;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b8.ke;
import ci.v8;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.kr;
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
import org.telegram.ui.Components.bk;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hk;
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.sw;
import org.telegram.ui.Components.t21;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.x20;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dd;
import org.telegram.ui.e01;
import org.telegram.ui.ee0;
import org.telegram.ui.g01;
import org.telegram.ui.g11;
import org.telegram.ui.hd;
import org.telegram.ui.id;
import org.telegram.ui.l01;
import org.telegram.ui.nd;
import org.telegram.ui.qc1;
import org.telegram.ui.qy0;
import org.telegram.ui.r41;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
import org.telegram.ui.xd;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h3 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h3(int i3, View view, AtomicReference atomicReference) {
        this.a = 23;
        this.b = i3;
        this.c = view;
        this.d = atomicReference;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.messenger.f0 f0Var;
        Integer num;
        View view2;
        int R;
        int i3 = this.a;
        int i10 = 3;
        int i11 = 4;
        int i12 = 2;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                v8 v8Var = (v8) obj2;
                Runnable runnable = (Runnable) obj;
                v8Var.getClass();
                if ((i15 & 15) != 0) {
                    i13 = 15;
                } else if ((i15 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(v8Var.g & i13, i15, !TLObject.hasFlag(r0, i15));
                if (flag == 0) {
                    flag = (~i15) & i13;
                }
                int i16 = v8Var.g;
                int i17 = flag | ((~i13) & i16);
                if (i16 != i17) {
                    v8Var.g = i17;
                    v8Var.j(true);
                }
                runnable.run();
                break;
            case 1:
                vp0 vp0Var = (vp0) obj2;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                wo woVar = vp0Var.G;
                woVar.a(!woVar.a.q, true);
                boolean z11 = woVar.a.q;
                fc.a0(d2Var).P(z11 ? R.raw.silent_unmute : R.raw.silent_mute, bd.M0(z11 ? 2131750264 : 2131750263, null)).j();
                vp0Var.d.h = Boolean.valueOf(z11);
                if (vp0Var.I >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(vp0Var.I, true);
                    vp0Var.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = hp.s1(i15).j1(vp0Var.c);
                togglechatstargiftnotifications.enabled = z11;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new f3(i13, vp0Var, d2Var));
                break;
            case 2:
                sf.c.t((Context) obj2, "https://" + hp.s1(i15).V2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 3:
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) obj;
                org.telegram.ui.ActionBar.y4 y4Var = ((org.telegram.ui.ActionBar.e5) obj2).a;
                if (!f5Var.s()) {
                    if (!f5Var.B0) {
                        org.telegram.ui.ActionBar.j jVar = y4Var.W;
                        if (jVar != null) {
                            jVar.b(i15);
                            break;
                        }
                    } else {
                        y4Var.v(true, true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = y4Var.W;
                    if (jVar2 == null || jVar2.a()) {
                        f5Var.U(null, null);
                        break;
                    }
                }
                break;
            case 4:
                ma maVar = (ma) obj2;
                maVar.e.a(true, true);
                hp.s1(i15).U1().f(false, (ArrayList) obj, new gi.s3(maVar, i15, i10));
                break;
            case 5:
                ((ta) obj2).a(i15, ((sa) obj).h);
                break;
            case 6:
                xd xdVar = (xd) obj2;
                r41 r41Var = (r41) obj;
                nd ndVar = xdVar.H0;
                if (view.isEnabled() && !ndVar.R && !xdVar.B0.R) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (xdVar.C0 <= currentTime) {
                        if (xdVar.O0 >= hp.s1(i15).R5) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            hd hdVar = new hd(xdVar, twoStepVerificationActivity, i12);
                            twoStepVerificationActivity.a0 = 1;
                            twoStepVerificationActivity.c0 = hdVar;
                            ndVar.setLoading(true);
                            twoStepVerificationActivity.x0(new id(xdVar, r41Var, twoStepVerificationActivity, i12));
                            break;
                        } else {
                            fc.a0(r41Var).M(xdVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), org.telegram.messenger.g0.U2(bd.G((int) hp.s1(i15).R5, "BotStarsWithdrawMinLimit", new Object[0]), new dd(xdVar, i15, i14))).j();
                            break;
                        }
                    } else {
                        xdVar.Q0 = fc.a0(r41Var).Q(R.raw.timer_3, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131752952, ci.v.w0(xdVar.C0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 7:
                wm wmVar = (wm) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (wmVar.m1 != null && wmVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    break;
                }
                break;
            case 8:
                wm wmVar2 = (wm) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (wmVar2.u5 != null && i15 < arrayList.size()) {
                    wmVar2.ab(((Integer) arrayList.get(i15)).intValue());
                    break;
                }
                break;
            case 9:
                ((cb0) obj2).setValue(i15);
                ((org.telegram.ui.Components.m2) obj).run();
                break;
            case 10:
                hk hkVar = (hk) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                f60 F = f60.F(hkVar, e6Var, hkVar.y);
                F.Q = true;
                F.c(R.drawable.msg_addbot, bd.M0(2131743147, null), new org.telegram.ui.f4(hkVar, i15, e6Var, 5), false);
                F.c(R.drawable.menu_comments, bd.M0(2131743215, null), new bk(hkVar, i13), false);
                F.s = 0;
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                break;
            case 11:
                lr lrVar = (lr) obj2;
                f41 f41Var = (f41) obj;
                if (!lrVar.e1()) {
                    boolean z12 = i15 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.p2;
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
                    lrVar.h1();
                    f41Var.O(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lrVar.getContext());
                    String M0 = bd.M0(2131743729, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                    s1Var.S = M0;
                    s1Var.U = bd.M0(2131743728, null);
                    alertDialog$Builder.k(bd.M0(2131747839, null), null);
                    s1Var.show();
                    break;
                }
            case 12:
                x20 x20Var = (x20) obj2;
                x20Var.n = i15;
                x20Var.b.e(false, view.getLeft());
                x20Var.c.e(false, view.getRight());
                ((kr) obj).a(i15);
                x20Var.invalidate();
                break;
            case 13:
                vc0 vc0Var = (vc0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = vc0Var.E1;
                org.telegram.ui.ActionBar.d2 d2Var2 = vc0Var.q1;
                int i18 = vc0Var.x1;
                if (i15 < i18 || i15 >= vc0Var.y1) {
                    int i19 = vc0Var.z1;
                    f0Var = (i15 < i19 || i15 >= vc0Var.A1) ? null : (org.telegram.messenger.f0) vc0Var.D1.get(i15 - i19);
                } else {
                    f0Var = (org.telegram.messenger.f0) arrayList2.get(i15 - i18);
                }
                if (f0Var != null) {
                    if (!vc0Var.B1) {
                        f0Var.d = !f0Var.d;
                        if (i15 >= vc0Var.x1 && i15 < vc0Var.y1) {
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
                            vc0Var.p1.setEnabled(z10);
                            vc0Var.I0();
                        }
                        ((tc0) viewGroup).setChecked(f0Var.d);
                        break;
                    } else {
                        int i21 = f0Var.c;
                        if (i21 != 0) {
                            if (i21 != 1) {
                                if (i21 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(d2Var2.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{bd.M0(2131751767, null)}, new org.telegram.ui.u(i11, vc0Var, f0Var));
                                    alertDialog$Builder2.p();
                                    break;
                                } else {
                                    String c2 = f0Var.c(false);
                                    if (!c2.startsWith("http")) {
                                        c2 = "http://".concat(c2);
                                    }
                                    sf.c.t(d2Var2.getParentActivity(), c2);
                                    break;
                                }
                            } else {
                                sf.c.t(d2Var2.getParentActivity(), "mailto:" + f0Var.c(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + f0Var.c(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                d2Var2.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                return;
                            }
                        }
                    }
                }
                break;
            case 14:
                ir0 ir0Var = (ir0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                ws0 ws0Var = ir0Var.f;
                org.telegram.ui.ActionBar.d2 d2Var3 = ws0Var.y1;
                d2Var3.finishPreviewFragment();
                chat.left = false;
                ir0Var.E(false);
                ir0Var.s(i15);
                if (ir0Var.d.isEmpty()) {
                    ws0Var.N1(true);
                    ws0Var.N();
                }
                d2Var3.getNotificationCenter().k(hs.f3, Long.valueOf(-ws0Var.m1));
                d2Var3.getMessagesController().n(chat.id, d2Var3.getUserConfig().f(), null, d2Var3, new j50(21, ir0Var, chat));
                break;
            case 15:
                ((t21) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 16:
                uw.t0((uw) obj2, i15, (f60) obj);
                break;
            case 17:
                ee0.d0((ee0) obj2, i15, (f60) obj);
                break;
            case 18:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.i6[] i6VarArr = (org.telegram.ui.Cells.i6[]) obj;
                zArr[0] = i15 == 1;
                int i22 = 0;
                while (i22 < 2) {
                    i6VarArr[i22].c.a(zArr[0] == (i22 == 1), true);
                    i22++;
                }
                break;
            case 19:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.f1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((qy0) saveToGallerySettingsActivity.s.get(i15)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 20:
                sw swVar = (sw) obj;
                g11 g11Var = ((g01) obj2).c;
                if (!swVar.e && !h10.i(g11Var.W).q()) {
                    org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new vg.v0(g11Var.d1, g11Var.getContext(), g11Var.W, 11, false));
                        break;
                    }
                } else {
                    int i23 = 0;
                    while (true) {
                        e01 e01Var = g11Var.i0;
                        if (i23 >= e01Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((e01Var.getChildAt(i23) instanceof l01) && (R = RecyclerView.R((view2 = e01Var.getChildAt(i23)))) >= 0 && g11Var.z0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i23++;
                        }
                    }
                    if (num != null) {
                        g11Var.i(num.intValue(), view2);
                    }
                    pu.J0(null, swVar.b, false, null, null);
                    g11Var.C0.add(Long.valueOf(swVar.b.id));
                    g11Var.B(true, true, true);
                    break;
                }
                break;
            case 21:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.r5) obj2).setSelected(i15);
                break;
            case 22:
                gi.d dVar = (gi.d) obj2;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj;
                if (!dVar.R) {
                    ke keVar = qc1.d;
                    if (keVar != null && ((byte[]) keVar.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i24 = this.b;
                        ConnectionsManager.getInstance(i24).sendRequestTyped(tL_messages_requestUrlAuth, new c3.b(i14), new org.telegram.ui.f60(dVar, t2Var, i24, view, keVar));
                        break;
                    } else {
                        a8.b("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 23:
                az.p0 = i15;
                SharedPreferences.Editor edit = hp.e1().edit();
                edit.putInt("searchEngineType", az.p0);
                edit.apply();
                ((l8) ((View) obj2)).w(org.telegram.ui.web.d1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            default:
                ug.g1 g1Var = (ug.g1) obj2;
                g1Var.a(i15);
                g1Var.b.w().i(i15 - 1, true);
                g1Var.b.C((tg.h) obj);
                break;
        }
    }

    public /* synthetic */ h3(Object obj, int i3, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
        this.d = obj2;
    }

    public /* synthetic */ h3(Object obj, Object obj2, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i3;
    }
}
