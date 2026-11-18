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
import org.telegram.messenger.bz;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.nr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.oa;
import org.telegram.ui.Cells.ua;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.hn0;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ld0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.rk;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.yr;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bn;
import org.telegram.ui.c51;
import org.telegram.ui.cx;
import org.telegram.ui.cz0;
import org.telegram.ui.dd;
import org.telegram.ui.hd;
import org.telegram.ui.id;
import org.telegram.ui.ii;
import org.telegram.ui.m60;
import org.telegram.ui.me0;
import org.telegram.ui.nd;
import org.telegram.ui.p01;
import org.telegram.ui.r01;
import org.telegram.ui.r11;
import org.telegram.ui.w01;
import org.telegram.ui.xd;
import org.telegram.ui.yc1;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class e5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e5(int i7, View view, AtomicReference atomicReference) {
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
        int i11 = 2;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 1;
        int i14 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                di.o8 o8Var = (di.o8) obj2;
                Runnable runnable = (Runnable) obj;
                o8Var.getClass();
                if ((i14 & 15) != 0) {
                    i12 = 15;
                } else if ((i14 & 768) != 0) {
                    i12 = 768;
                }
                int flag = TLObject.setFlag(o8Var.g & i12, i14, !TLObject.hasFlag(r0, i14));
                if (flag == 0) {
                    flag = (~i14) & i12;
                }
                int i15 = o8Var.g;
                int i16 = flag | ((~i12) & i15);
                if (i15 != i16) {
                    o8Var.g = i16;
                    o8Var.k(true);
                }
                runnable.run();
                break;
            case 1:
                eq0 eq0Var = (eq0) obj2;
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj;
                mp mpVar = eq0Var.G;
                mpVar.a(!mpVar.a.q, true);
                boolean z11 = mpVar.a.q;
                lc.b0(h2Var).P(z11 ? R.raw.silent_unmute : R.raw.silent_mute, gd.M0(z11 ? 2131750240 : 2131750239, null)).j();
                eq0Var.d.h = Boolean.valueOf(z11);
                if (eq0Var.I >= 0) {
                    ConnectionsManager.getInstance(i14).cancelRequest(eq0Var.I, true);
                    eq0Var.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = org.telegram.messenger.mp.u1(i14).l1(eq0Var.c);
                togglechatstargiftnotifications.enabled = z11;
                ConnectionsManager.getInstance(i14).sendRequest(togglechatstargiftnotifications, new k1(i13, eq0Var, h2Var));
                break;
            case 2:
                vf.c.t((Context) obj2, "https://" + org.telegram.messenger.mp.u1(i14).X2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 3:
                org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) obj;
                org.telegram.ui.ActionBar.a5 a5Var = ((org.telegram.ui.ActionBar.g5) obj2).a;
                if (!h5Var.t()) {
                    if (!h5Var.B0) {
                        org.telegram.ui.ActionBar.j jVar = a5Var.W;
                        if (jVar != null) {
                            jVar.b(i14);
                            break;
                        }
                    } else {
                        a5Var.B(true, true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = a5Var.W;
                    if (jVar2 == null || jVar2.a()) {
                        h5Var.V(null, null);
                        break;
                    }
                }
                break;
            case 4:
                oa oaVar = (oa) obj2;
                oaVar.e.a(true, true);
                org.telegram.messenger.mp.u1(i14).W1().f(false, (ArrayList) obj, new ai.y1(oaVar, i14, i10));
                break;
            case 5:
                ((va) obj2).a(i14, ((ua) obj).h);
                break;
            case 6:
                xd xdVar = (xd) obj2;
                c51 c51Var = (c51) obj;
                nd ndVar = xdVar.H0;
                if (view.isEnabled() && !ndVar.R && !xdVar.B0.R) {
                    int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
                    if (xdVar.C0 <= currentTime) {
                        if (xdVar.O0 >= org.telegram.messenger.mp.u1(i14).U5) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            hd hdVar = new hd(xdVar, twoStepVerificationActivity, i11);
                            twoStepVerificationActivity.a0 = 1;
                            twoStepVerificationActivity.c0 = hdVar;
                            ndVar.setLoading(true);
                            twoStepVerificationActivity.x0(new id(xdVar, c51Var, twoStepVerificationActivity, i11));
                            break;
                        } else {
                            lc.b0(c51Var).M(xdVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), org.telegram.messenger.g0.T2(gd.G((int) org.telegram.messenger.mp.u1(i14).U5, "BotStarsWithdrawMinLimit", new Object[0]), new dd(xdVar, i14, i13))).j();
                            break;
                        }
                    } else {
                        xdVar.Q0 = lc.b0(c51Var).Q(R.raw.timer_3, 36, org.telegram.messenger.g0.W2(gd.a0(null, null, 2131752941, di.t.x0(xdVar.C0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 7:
                bn bnVar = (bn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (bnVar.m1 != null && bnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i14);
                    break;
                }
                break;
            case 8:
                bn bnVar2 = (bn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (bnVar2.v5 != null && i14 < arrayList.size()) {
                    bnVar2.db(((Integer) arrayList.get(i14)).intValue());
                    break;
                }
                break;
            case 9:
                ((sb0) obj2).setValue(i14);
                ((org.telegram.ui.Components.w2) obj).run();
                break;
            case 10:
                ((x0) obj2).c(new ii((ji.g) obj, i14, 9));
                break;
            case 11:
                xk xkVar = (xk) obj2;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                y60 G = y60.G(xkVar, i6Var, xkVar.y);
                G.T = true;
                G.c(R.drawable.msg_addbot, gd.M0(2131742899, null), new org.telegram.ui.b0(xkVar, i14, i6Var, 8), false);
                G.c(R.drawable.menu_comments, gd.M0(2131742967, null), new rk(xkVar, i12), false);
                G.s = 0;
                G.b0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                G.a0();
                break;
            case 12:
                yr yrVar = (yr) obj2;
                z41 z41Var = (z41) obj;
                if (!yrVar.f1()) {
                    boolean z12 = i14 <= 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = yrVar.s2;
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
                    yrVar.i1();
                    z41Var.O(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yrVar.getContext());
                    String M0 = gd.M0(2131743482, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.S = M0;
                    u1Var.U = gd.M0(2131743481, null);
                    alertDialog$Builder.k(gd.M0(2131747638, null), null);
                    u1Var.show();
                    break;
                }
            case 13:
                m30 m30Var = (m30) obj2;
                m30Var.n = i14;
                m30Var.b.e(false, view.getLeft());
                m30Var.c.e(false, view.getRight());
                ((nr) obj).a(i14);
                m30Var.invalidate();
                break;
            case 14:
                ld0 ld0Var = (ld0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = ld0Var.H1;
                org.telegram.ui.ActionBar.h2 h2Var2 = ld0Var.t1;
                int i17 = ld0Var.A1;
                if (i14 < i17 || i14 >= ld0Var.B1) {
                    int i18 = ld0Var.C1;
                    f0Var = (i14 < i18 || i14 >= ld0Var.D1) ? null : (org.telegram.messenger.f0) ld0Var.G1.get(i14 - i18);
                } else {
                    f0Var = (org.telegram.messenger.f0) arrayList2.get(i14 - i17);
                }
                if (f0Var != null) {
                    if (!ld0Var.E1) {
                        f0Var.d = !f0Var.d;
                        if (i14 >= ld0Var.A1 && i14 < ld0Var.B1) {
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList2.size()) {
                                    if (((org.telegram.messenger.f0) arrayList2.get(i19)).d) {
                                        z10 = true;
                                    } else {
                                        i19++;
                                    }
                                }
                            }
                            ld0Var.s1.setEnabled(z10);
                            ld0Var.J0();
                        }
                        ((jd0) viewGroup).setChecked(f0Var.d);
                        break;
                    } else {
                        int i20 = f0Var.c;
                        if (i20 != 0) {
                            if (i20 != 1) {
                                if (i20 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h2Var2.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{gd.M0(2131751756, null)}, new og.j(i10, ld0Var, f0Var));
                                    alertDialog$Builder2.p();
                                    break;
                                } else {
                                    String c10 = f0Var.c(false);
                                    if (!c10.startsWith("http")) {
                                        c10 = "http://".concat(c10);
                                    }
                                    vf.c.t(h2Var2.getParentActivity(), c10);
                                    break;
                                }
                            } else {
                                vf.c.t(h2Var2.getParentActivity(), "mailto:" + f0Var.c(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + f0Var.c(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                h2Var2.getParentActivity().startActivityForResult(intent, 500);
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
                sr0 sr0Var = (sr0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                gt0 gt0Var = sr0Var.f;
                org.telegram.ui.ActionBar.h2 h2Var3 = gt0Var.y1;
                h2Var3.finishPreviewFragment();
                chat.left = false;
                sr0Var.E(false);
                sr0Var.s(i14);
                if (sr0Var.d.isEmpty()) {
                    gt0Var.P1(true);
                    gt0Var.N();
                }
                h2Var3.getNotificationCenter().k(203, Long.valueOf(-gt0Var.m1));
                h2Var3.getMessagesController().n(chat.id, h2Var3.getUserConfig().f(), null, h2Var3, new hn0(6, sr0Var, chat));
                break;
            case 16:
                ((n31) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i14);
                break;
            case 17:
                cx.w0((cx) obj2, i14, (y60) obj);
                break;
            case 18:
                me0.g0((me0) obj2, i14, (y60) obj);
                break;
            case 19:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.k6[] k6VarArr = (org.telegram.ui.Cells.k6[]) obj;
                zArr[0] = i14 == 1;
                int i21 = 0;
                while (i21 < 2) {
                    k6VarArr[i21].c.a(zArr[0] == (i21 == 1), true);
                    i21++;
                }
                break;
            case 20:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.h1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((cz0) saveToGallerySettingsActivity.s.get(i14)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 21:
                fx fxVar = (fx) obj;
                r11 r11Var = ((r01) obj2).c;
                if (!fxVar.e && !j10.i(r11Var.W).q()) {
                    org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.z0(r11Var.d1, r11Var.getContext(), r11Var.W, 11, false));
                        break;
                    }
                } else {
                    int i22 = 0;
                    while (true) {
                        p01 p01Var = r11Var.i0;
                        if (i22 >= p01Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((p01Var.getChildAt(i22) instanceof w01) && (R = RecyclerView.R((view2 = p01Var.getChildAt(i22)))) >= 0 && r11Var.z0.get(R) == i14) {
                            num = Integer.valueOf(R);
                        } else {
                            i22++;
                        }
                    }
                    if (num != null) {
                        r11Var.i(num.intValue(), view2);
                    }
                    bv.K0(null, fxVar.b, false, null, null);
                    r11Var.C0.add(Long.valueOf(fxVar.b.id));
                    r11Var.B(true, true, true);
                    break;
                }
                break;
            case 22:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i14));
                ((org.telegram.ui.Wallet.i6) obj2).setSelected(i14);
                break;
            case 23:
                hi.d dVar = (hi.d) obj2;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj;
                if (!dVar.R) {
                    a8.r7 r7Var = yc1.d;
                    if (r7Var != null && ((byte[]) r7Var.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i23 = this.b;
                        ConnectionsManager.getInstance(i23).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(i13), new m60(dVar, x2Var, i23, view, r7Var));
                        break;
                    } else {
                        org.telegram.messenger.a8.b("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 24:
                bz.p0 = i14;
                SharedPreferences.Editor edit = org.telegram.messenger.mp.g1().edit();
                edit.putInt("searchEngineType", bz.p0);
                edit.apply();
                ((org.telegram.ui.Cells.n8) ((View) obj2)).w(org.telegram.ui.web.e1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            default:
                tg.h1 h1Var = (tg.h1) obj2;
                h1Var.a(i14);
                h1Var.b.x().i(i14 - 1, true);
                h1Var.b.w((sg.h) obj);
                break;
        }
    }

    public /* synthetic */ e5(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ e5(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
