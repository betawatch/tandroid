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
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.sr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.uw;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.w80;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.z21;
import org.telegram.ui.Components.zc0;
import org.telegram.ui.Components.zs0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.cn;
import org.telegram.ui.d51;
import org.telegram.ui.dz0;
import org.telegram.ui.le0;
import org.telegram.ui.n60;
import org.telegram.ui.o41;
import org.telegram.ui.q01;
import org.telegram.ui.s01;
import org.telegram.ui.s11;
import org.telegram.ui.x01;
import org.telegram.ui.yc1;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class la implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ la(int i7, View view, AtomicReference atomicReference) {
        this.a = 21;
        this.b = i7;
        this.c = view;
        this.d = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.messenger.f0 f0Var;
        Integer num;
        View view2;
        int R;
        int i7 = this.a;
        int i10 = 3;
        int i11 = 4;
        int i12 = 2;
        int i13 = 0;
        boolean z9 = false;
        int i14 = 1;
        int i15 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i7) {
            case 0:
                vf.c.t((Context) obj2, "https://" + qp.s1(i15).U2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 1:
                org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) obj;
                org.telegram.ui.ActionBar.y4 y4Var = ((org.telegram.ui.ActionBar.e5) obj2).a;
                if (!f5Var.s()) {
                    if (!f5Var.A0) {
                        org.telegram.ui.ActionBar.j jVar = y4Var.V;
                        if (jVar != null) {
                            jVar.b(i15);
                            break;
                        }
                    } else {
                        y4Var.w(true, true);
                        break;
                    }
                } else {
                    org.telegram.ui.ActionBar.j jVar2 = y4Var.V;
                    if (jVar2 == null || jVar2.a()) {
                        f5Var.U(null, null);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Cells.ma maVar = (org.telegram.ui.Cells.ma) obj2;
                maVar.e.a(true, true);
                qp.s1(i15).U1().f(false, (ArrayList) obj, new fi.t3(maVar, i15, i10));
                break;
            case 3:
                ((org.telegram.ui.Cells.ua) obj2).a(i15, ((org.telegram.ui.Cells.ta) obj).h);
                break;
            case 4:
                org.telegram.ui.zd zdVar = (org.telegram.ui.zd) obj2;
                d51 d51Var = (d51) obj;
                org.telegram.ui.pd pdVar = zdVar.G0;
                if (view.isEnabled() && !pdVar.Q && !zdVar.A0.Q) {
                    int currentTime = ConnectionsManager.getInstance(i15).getCurrentTime();
                    if (zdVar.B0 <= currentTime) {
                        if (zdVar.N0 >= qp.s1(i15).R5) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            org.telegram.ui.id idVar = new org.telegram.ui.id(zdVar, twoStepVerificationActivity, i12);
                            twoStepVerificationActivity.Z = 1;
                            twoStepVerificationActivity.b0 = idVar;
                            pdVar.setLoading(true);
                            twoStepVerificationActivity.x0(new org.telegram.ui.jd(zdVar, d51Var, twoStepVerificationActivity, i12));
                            break;
                        } else {
                            org.telegram.ui.Components.hc.a0(d51Var).M(zdVar.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), org.telegram.messenger.g0.U2(org.telegram.messenger.id.G((int) qp.s1(i15).R5, "BotStarsWithdrawMinLimit", new Object[0]), new org.telegram.ui.ed(zdVar, i15, i14))).j();
                            break;
                        }
                    } else {
                        zdVar.P0 = org.telegram.ui.Components.hc.a0(d51Var).Q(R.raw.timer_3, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0(null, null, 2131752952, z.w0(zdVar.B0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 5:
                cn cnVar = (cn) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (cnVar.l1 != null && cnVar.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i15);
                    break;
                }
                break;
            case 6:
                cn cnVar2 = (cn) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (cnVar2.t5 != null && i15 < arrayList.size()) {
                    cnVar2.cb(((Integer) arrayList.get(i15)).intValue());
                    break;
                }
                break;
            case 7:
                ((ib0) obj2).setValue(i15);
                ((org.telegram.ui.Components.p2) obj).run();
                break;
            case 8:
                ik ikVar = (ik) obj2;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj;
                l60 F = l60.F(ikVar, g6Var, ikVar.y);
                F.Q = true;
                F.c(R.drawable.msg_addbot, org.telegram.messenger.id.M0(2131743137, null), new org.telegram.ui.q8(ikVar, i15, g6Var, i11), false);
                F.c(R.drawable.menu_comments, org.telegram.messenger.id.M0(2131743205, null), new ck(ikVar, r6), false);
                F.s = 0;
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                break;
            case 9:
                lr lrVar = (lr) obj2;
                m41 m41Var = (m41) obj;
                if (!lrVar.e1()) {
                    r6 = i15 <= 0 ? 1 : 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = lrVar.o2;
                    boolean z10 = r6 ^ 1;
                    tL_chatBannedRights.send_media = z10;
                    tL_chatBannedRights.send_photos = z10;
                    tL_chatBannedRights.send_videos = z10;
                    tL_chatBannedRights.send_stickers = z10;
                    tL_chatBannedRights.send_gifs = z10;
                    tL_chatBannedRights.send_inline = z10;
                    tL_chatBannedRights.send_games = z10;
                    tL_chatBannedRights.send_audios = z10;
                    tL_chatBannedRights.send_docs = z10;
                    tL_chatBannedRights.send_voices = z10;
                    tL_chatBannedRights.send_roundvideos = z10;
                    tL_chatBannedRights.embed_links = z10;
                    tL_chatBannedRights.send_polls = z10;
                    tL_chatBannedRights.send_reactions = z10;
                    lrVar.h1();
                    m41Var.O(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(lrVar.getContext());
                    String M0 = org.telegram.messenger.id.M0(2131743719, null);
                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                    u1Var.R = M0;
                    u1Var.T = org.telegram.messenger.id.M0(2131743718, null);
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131747831, null), null);
                    u1Var.show();
                    break;
                }
            case 10:
                c30 c30Var = (c30) obj2;
                c30Var.n = i15;
                c30Var.b.e(false, view.getLeft());
                c30Var.c.e(false, view.getRight());
                ((sr) obj).a(i15);
                c30Var.invalidate();
                break;
            case 11:
                bd0 bd0Var = (bd0) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = bd0Var.D1;
                org.telegram.ui.ActionBar.f2 f2Var = bd0Var.p1;
                int i16 = bd0Var.w1;
                if (i15 < i16 || i15 >= bd0Var.x1) {
                    int i17 = bd0Var.y1;
                    f0Var = (i15 < i17 || i15 >= bd0Var.z1) ? null : (org.telegram.messenger.f0) bd0Var.C1.get(i15 - i17);
                } else {
                    f0Var = (org.telegram.messenger.f0) arrayList2.get(i15 - i16);
                }
                if (f0Var != null) {
                    if (!bd0Var.A1) {
                        f0Var.d = !f0Var.d;
                        if (i15 >= bd0Var.w1 && i15 < bd0Var.x1) {
                            int i18 = 0;
                            while (true) {
                                if (i18 < arrayList2.size()) {
                                    if (((org.telegram.messenger.f0) arrayList2.get(i18)).d) {
                                        z9 = true;
                                    } else {
                                        i18++;
                                    }
                                }
                            }
                            bd0Var.o1.setEnabled(z9);
                            bd0Var.I0();
                        }
                        ((zc0) viewGroup).setChecked(f0Var.d);
                        break;
                    } else {
                        int i19 = f0Var.c;
                        if (i19 != 0) {
                            if (i19 != 1) {
                                if (i19 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(f2Var.getParentActivity());
                                    alertDialog$Builder2.f(new CharSequence[]{org.telegram.messenger.id.M0(2131751767, null)}, new og.j(5, bd0Var, f0Var));
                                    alertDialog$Builder2.p();
                                    break;
                                } else {
                                    String c10 = f0Var.c(false);
                                    if (!c10.startsWith("http")) {
                                        c10 = "http://".concat(c10);
                                    }
                                    vf.c.t(f2Var.getParentActivity(), c10);
                                    break;
                                }
                            } else {
                                vf.c.t(f2Var.getParentActivity(), "mailto:" + f0Var.c(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + f0Var.c(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                f2Var.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, true);
                                return;
                            }
                        }
                    }
                }
                break;
            case 12:
                lr0 lr0Var = (lr0) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                zs0 zs0Var = lr0Var.f;
                org.telegram.ui.ActionBar.f2 f2Var2 = zs0Var.x1;
                f2Var2.finishPreviewFragment();
                chat.left = false;
                lr0Var.E(false);
                lr0Var.s(i15);
                if (lr0Var.d.isEmpty()) {
                    zs0Var.P1(true);
                    zs0Var.N();
                }
                f2Var2.getNotificationCenter().k(qs.f3, Long.valueOf(-zs0Var.l1));
                f2Var2.getMessagesController().n(chat.id, f2Var2.getUserConfig().f(), null, f2Var2, new w80(16, lr0Var, chat));
                break;
            case 13:
                ((z21) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i15);
                break;
            case 14:
                yw.t0((yw) obj2, i15, (l60) obj);
                break;
            case 15:
                le0.d0((le0) obj2, i15, (l60) obj);
                break;
            case 16:
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.Cells.j6[] j6VarArr = (org.telegram.ui.Cells.j6[]) obj;
                zArr[0] = i15 == 1;
                int i20 = 0;
                while (i20 < 2) {
                    j6VarArr[i20].c.a(zArr[0] == (i20 == 1), true);
                    i20++;
                }
                break;
            case 17:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                saveToGallerySettingsActivity.getClass();
                ((org.telegram.ui.ActionBar.g1) obj).dismiss();
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((dz0) saveToGallerySettingsActivity.s.get(i15)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 18:
                uw uwVar = (uw) obj;
                s11 s11Var = ((s01) obj2).c;
                if (!uwVar.e && !p10.i(s11Var.V).q()) {
                    org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.w0(s11Var.c1, s11Var.getContext(), s11Var.V, 11, false));
                        break;
                    }
                } else {
                    int i21 = 0;
                    while (true) {
                        q01 q01Var = s11Var.h0;
                        if (i21 >= q01Var.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((q01Var.getChildAt(i21) instanceof x01) && (R = RecyclerView.R((view2 = q01Var.getChildAt(i21)))) >= 0 && s11Var.y0.get(R) == i15) {
                            num = Integer.valueOf(R);
                        } else {
                            i21++;
                        }
                    }
                    if (num != null) {
                        s11Var.i(num.intValue(), view2);
                    }
                    ru.J0(null, uwVar.b, false, null, null);
                    s11Var.B0.add(Long.valueOf(uwVar.b.id));
                    s11Var.B(true, true, true);
                    break;
                }
                break;
            case 19:
                ((org.telegram.ui.Wallet.k) obj).a(Integer.valueOf(i15));
                ((org.telegram.ui.Wallet.r5) obj2).setSelected(i15);
                break;
            case 20:
                fi.d dVar = (fi.d) obj2;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj;
                if (!dVar.Q) {
                    a8.r7 r7Var = yc1.d;
                    if (r7Var != null && ((byte[]) r7Var.e) != null) {
                        dVar.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i22 = this.b;
                        ConnectionsManager.getInstance(i22).sendRequestTyped(tL_messages_requestUrlAuth, new d3.b(i14), new n60(dVar, v2Var, i22, view, r7Var));
                        break;
                    } else {
                        org.telegram.messenger.a8.b("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            case 21:
                iz.p0 = i15;
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.putInt("searchEngineType", iz.p0);
                edit.apply();
                ((org.telegram.ui.Cells.m8) ((View) obj2)).w(org.telegram.ui.web.f1.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
            case 22:
                tg.h1 h1Var = (tg.h1) obj2;
                h1Var.a(i15);
                h1Var.b.x().i(i15 - 1, true);
                h1Var.b.w((sg.h) obj);
                break;
            case 23:
                v9 v9Var = (v9) obj2;
                Runnable runnable = (Runnable) obj;
                v9Var.getClass();
                if ((i15 & 15) != 0) {
                    i13 = 15;
                } else if ((i15 & 768) != 0) {
                    i13 = 768;
                }
                int flag = TLObject.setFlag(v9Var.g & i13, i15, !TLObject.hasFlag(r0, i15));
                if (flag == 0) {
                    flag = (~i15) & i13;
                }
                int i23 = v9Var.g;
                int i24 = flag | ((~i13) & i23);
                if (i23 != i24) {
                    v9Var.g = i24;
                    v9Var.j(true);
                }
                runnable.run();
                break;
            default:
                vp0 vp0Var = (vp0) obj2;
                org.telegram.ui.ActionBar.f2 f2Var3 = (org.telegram.ui.ActionBar.f2) obj;
                wo woVar = vp0Var.F;
                woVar.a(!woVar.a.q, true);
                boolean z11 = woVar.a.q;
                org.telegram.ui.Components.hc.a0(f2Var3).P(z11 ? R.raw.silent_unmute : R.raw.silent_mute, org.telegram.messenger.id.M0(z11 ? 2131750256 : 2131750255, null)).j();
                vp0Var.d.h = Boolean.valueOf(z11);
                if (vp0Var.H >= 0) {
                    ConnectionsManager.getInstance(i15).cancelRequest(vp0Var.H, true);
                    vp0Var.H = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = qp.s1(i15).j1(vp0Var.c);
                togglechatstargiftnotifications.enabled = z11;
                ConnectionsManager.getInstance(i15).sendRequest(togglechatstargiftnotifications, new o41(10, vp0Var, f2Var3));
                break;
        }
    }

    public /* synthetic */ la(Object obj, int i7, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
        this.d = obj2;
    }

    public /* synthetic */ la(Object obj, Object obj2, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i7;
    }
}
