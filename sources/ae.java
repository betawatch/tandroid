// default package

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.SaveToGallerySettingsActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ae implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ae(int i, View view, AtomicReference atomicReference) {
        this.a = (byte) 23;
        this.b = i;
        this.c = view;
        this.d = atomicReference;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        gl glVar;
        int i;
        int i2;
        Integer num;
        View view2;
        int S;
        byte b = this.a;
        byte b2 = 4;
        byte b3 = 2;
        boolean z = false;
        byte b4 = 1;
        int i3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((hq7) obj2).setValue(i3);
                ((xd) obj).run();
                break;
            case 1:
                ij1 ij1Var = (ij1) obj2;
                w1b w1bVar = (w1b) obj;
                xi1 xi1Var = ij1Var.G0;
                if (view.isEnabled() && !xi1Var.R && !ij1Var.A0.R) {
                    int currentTime = ConnectionsManager.getInstance(i3).getCurrentTime();
                    if (ij1Var.B0 <= currentTime) {
                        if (ij1Var.N0 >= uc7.s1(i3).k4.y2.f()) {
                            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                            pi1 pi1Var = new pi1(ij1Var, twoStepVerificationActivity, b3);
                            twoStepVerificationActivity.a0 = (byte) 1;
                            twoStepVerificationActivity.c0 = pi1Var;
                            xi1Var.setLoading(true);
                            twoStepVerificationActivity.x0(new qi1(ij1Var, w1bVar, twoStepVerificationActivity, b3));
                            break;
                        } else {
                            d31.b0(w1bVar).M(ij1Var.getContext().getResources().getDrawable(R.drawable.star_small_inner).mutate(), hl.N2(ob6.G((int) uc7.s1(i3).k4.y2.f(), "BotStarsWithdrawMinLimit", new Object[0]), -1, 0, new oi1(ij1Var, i3, b4), null)).j();
                            break;
                        }
                    } else {
                        ij1Var.P0 = d31.b0(w1bVar).Q(R.raw.timer_3, 36, hl.S2(ob6.a0(null, null, 2131752933, at0.x0(ij1Var.B0 - currentTime)))).j();
                        break;
                    }
                }
                break;
            case 2:
                zu1 zu1Var = (zu1) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) obj;
                if (zu1Var.m1 != null && zu1Var.getParentActivity() != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(i3);
                    break;
                }
                break;
            case 3:
                zu1 zu1Var2 = (zu1) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (zu1Var2.v5 != null && i3 < arrayList.size()) {
                    zu1Var2.Ua(((Integer) arrayList.get(i3)).intValue());
                    break;
                }
                break;
            case 4:
                ((zv4) obj2).c(new zd(obj, i3, (byte) 23));
                break;
            case 5:
                h42 h42Var = (h42) obj2;
                vnb vnbVar = (vnb) obj;
                fu5 G = fu5.G(h42Var, vnbVar, h42Var.y);
                G.W = true;
                G.b(R.drawable.msg_addbot, ob6.M0(2131742788, null), new ze7((Object) h42Var, i3, (Object) vnbVar, (byte) 15), false);
                G.b(R.drawable.menu_comments, ob6.M0(2131742856, null), new a42(h42Var, r6), false);
                G.s = (short) 0;
                G.b0(0.0f, -hl.L(48.0f));
                G.a0();
                break;
            case 6:
                me3 me3Var = (me3) obj2;
                l9c l9cVar = (l9c) obj;
                if (!me3Var.Z0()) {
                    r6 = i3 <= 0 ? (byte) 1 : (byte) 0;
                    TLRPC.TL_chatBannedRights tL_chatBannedRights = me3Var.r2;
                    boolean z2 = r6 ^ 1;
                    tL_chatBannedRights.send_media = z2;
                    tL_chatBannedRights.send_photos = z2;
                    tL_chatBannedRights.send_videos = z2;
                    tL_chatBannedRights.send_stickers = z2;
                    tL_chatBannedRights.send_gifs = z2;
                    tL_chatBannedRights.send_inline = z2;
                    tL_chatBannedRights.send_games = z2;
                    tL_chatBannedRights.send_audios = z2;
                    tL_chatBannedRights.send_docs = z2;
                    tL_chatBannedRights.send_voices = z2;
                    tL_chatBannedRights.send_roundvideos = z2;
                    tL_chatBannedRights.embed_links = z2;
                    tL_chatBannedRights.send_polls = z2;
                    tL_chatBannedRights.send_reactions = z2;
                    me3Var.d1();
                    l9cVar.O(true);
                    break;
                } else {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(me3Var.getContext());
                    String M0 = ob6.M0(2131743374, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131743373, null);
                    alertDialog$Builder.j(ob6.M0(2131747558, null), null);
                    idVar.show();
                    break;
                }
            case 7:
                ((uj3) obj2).V3(i3, (fu5) obj);
                break;
            case 8:
                zh5 zh5Var = (zh5) obj2;
                zh5Var.n = i3;
                zh5Var.b.e(false, view.getLeft());
                zh5Var.c.e(false, view.getRight());
                ((df7) obj).a(i3);
                zh5Var.invalidate();
                break;
            case 9:
                ((fj6) obj2).n0(i3, (fu5) obj);
                break;
            case 10:
                boolean[] zArr = (boolean[]) obj2;
                j29[] j29VarArr = (j29[]) obj;
                zArr[0] = i3 == 1;
                int i4 = 0;
                while (i4 < 2) {
                    j29VarArr[i4].c.a(zArr[0] == (i4 == 1), true);
                    i4++;
                }
                break;
            case 11:
                rv7 rv7Var = (rv7) obj2;
                rv7Var.a(i3);
                rv7Var.b.w().i(i3 - 1, true);
                rv7Var.b.s((v01) obj);
                break;
            case 12:
                r78 r78Var = (r78) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ArrayList arrayList2 = r78Var.G1;
                e eVar = r78Var.s1;
                int i5 = r78Var.z1;
                if (i3 < i5 || i3 >= r78Var.A1) {
                    int i6 = r78Var.B1;
                    glVar = (i3 < i6 || i3 >= r78Var.C1) ? null : (gl) r78Var.F1.get(i3 - i6);
                } else {
                    glVar = (gl) arrayList2.get(i3 - i5);
                }
                if (glVar != null) {
                    if (!r78Var.D1) {
                        glVar.d = !glVar.d;
                        if (i3 >= r78Var.z1 && i3 < r78Var.A1) {
                            int i7 = 0;
                            while (true) {
                                if (i7 < arrayList2.size()) {
                                    if (((gl) arrayList2.get(i7)).d) {
                                        z = true;
                                    } else {
                                        i7++;
                                    }
                                }
                            }
                            r78Var.r1.setEnabled(z);
                            r78Var.E0();
                        }
                        ((p78) viewGroup).setChecked(glVar.d);
                        break;
                    } else {
                        int i8 = glVar.c;
                        if (i8 != 0) {
                            if (i8 != 1) {
                                if (i8 != 3) {
                                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(eVar.getParentActivity());
                                    alertDialog$Builder2.e(new CharSequence[]{ob6.M0(2131751732, null)}, new oh((Object) r78Var, (Object) glVar, (byte) 8));
                                    alertDialog$Builder2.o();
                                    break;
                                } else {
                                    String c = glVar.c(false);
                                    if (!c.startsWith("http")) {
                                        c = "http://".concat(c);
                                    }
                                    m01.u(eVar.getParentActivity(), c);
                                    break;
                                }
                            } else {
                                m01.u(eVar.getParentActivity(), "mailto:" + glVar.c(false));
                                break;
                            }
                        } else {
                            try {
                                Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + glVar.c(false)));
                                intent.addFlags(TLObject.FLAG_28);
                                eVar.getParentActivity().startActivityForResult(intent, 500);
                                break;
                            } catch (Exception e) {
                                cc4.g(e, true);
                                return;
                            }
                        }
                    }
                }
                break;
            case 13:
                cga cgaVar = (cga) obj2;
                e eVar2 = (e) obj;
                og2 og2Var = cgaVar.G;
                og2Var.a(!og2Var.a.q, true);
                boolean z3 = og2Var.a.q;
                d31 b0 = d31.b0(eVar2);
                if (z3) {
                    i = R.raw.silent_unmute;
                    i2 = 2131750215;
                } else {
                    i = R.raw.silent_mute;
                    i2 = 2131750214;
                }
                b0.P(i, ob6.M0(i2, null)).j();
                cgaVar.d.h = Boolean.valueOf(z3);
                if (cgaVar.I >= 0) {
                    ConnectionsManager.getInstance(i3).cancelRequest(cgaVar.I, true);
                    cgaVar.I = -1;
                }
                TL_stars.toggleChatStarGiftNotifications togglechatstargiftnotifications = new TL_stars.toggleChatStarGiftNotifications();
                togglechatstargiftnotifications.peer = uc7.s1(i3).j1(cgaVar.c);
                togglechatstargiftnotifications.enabled = z3;
                ConnectionsManager.getInstance(i3).sendRequest(togglechatstargiftnotifications, new ol7(cgaVar, eVar2, (byte) 16));
                break;
            case 14:
                SaveToGallerySettingsActivity saveToGallerySettingsActivity = (SaveToGallerySettingsActivity) obj2;
                ((n8) obj).d(true);
                Bundle bundle = new Bundle();
                bundle.putLong("dialog_id", ((gt9) saveToGallerySettingsActivity.s.get(i3)).c.d);
                bundle.putInt(TeXSymbolParser.TYPE_ATTR, saveToGallerySettingsActivity.a);
                saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle));
                break;
            case 15:
                c14 c14Var = (c14) obj;
                n1a n1aVar = ((m0a) obj2).c;
                if (!c14Var.e && !yac.h(n1aVar.W).p()) {
                    e Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new xk8(n1aVar.d1, n1aVar.getContext(), n1aVar.W, 11, false));
                        break;
                    }
                } else {
                    int i9 = 0;
                    while (true) {
                        k0a k0aVar = n1aVar.i0;
                        if (i9 >= k0aVar.getChildCount()) {
                            num = null;
                            view2 = null;
                        } else if ((k0aVar.getChildAt(i9) instanceof r0a) && (S = RecyclerView.S((view2 = k0aVar.getChildAt(i9)))) >= 0 && n1aVar.z0.get(S) == i3) {
                            num = Integer.valueOf(S);
                        } else {
                            i9++;
                        }
                    }
                    if (num != null) {
                        n1aVar.h(num.intValue(), view2);
                    }
                    ly3.F0(null, c14Var.b, false, null, null);
                    n1aVar.C0.add(Long.valueOf(c14Var.b.id));
                    n1aVar.B(true, true, true);
                    break;
                }
                break;
            case 16:
                qha qhaVar = (qha) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                eja ejaVar = qhaVar.f;
                e eVar3 = ejaVar.y1;
                eVar3.finishPreviewFragment();
                chat.left = false;
                qhaVar.E(false);
                qhaVar.s(i3);
                if (qhaVar.d.isEmpty()) {
                    ejaVar.N1(true);
                    ejaVar.y();
                }
                eVar3.getNotificationCenter().k(jn7.h3, Long.valueOf(-ejaVar.m1));
                eVar3.getMessagesController().k(chat.id, eVar3.getUserConfig().f(), null, eVar3, false, new ida(qhaVar, chat, b2), null);
                break;
            case 17:
                m01.u((Context) obj2, "https://" + uc7.s1(i3).N2 + "/nft/" + ((TL_stars.TL_starGiftUnique) obj).slug);
                break;
            case 18:
                ((x35) obj2).run();
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) obj).getSwipeBack().e(i3);
                break;
            case 19:
                w8c w8cVar = (w8c) obj2;
                w8cVar.e.a(true, true);
                uc7.s1(i3).R1().f(false, (ArrayList) obj, new jq0(w8cVar, i3, (byte) 5));
                break;
            case 20:
                ((sh9) obj).a(Integer.valueOf(i3));
                ((pqc) obj2).setSelected(i3);
                break;
            case 21:
                ((evc) obj2).a(i3, ((dvc) obj).h);
                break;
            case 22:
                c51 c51Var = (c51) obj2;
                nx0 nx0Var = (nx0) obj;
                if (!c51Var.R) {
                    am2 am2Var = nwc.d;
                    if (am2Var != null && ((byte[]) am2Var.f) != null) {
                        c51Var.setLoading(true);
                        TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                        tL_messages_requestUrlAuth.flags |= 4;
                        tL_messages_requestUrlAuth.url = "https://web.telegram.org/";
                        int i10 = this.b;
                        ConnectionsManager.getInstance(i10).sendRequestTyped(tL_messages_requestUrlAuth, new ic(r6), new g45(c51Var, nx0Var, i10, view, am2Var));
                        break;
                    } else {
                        cc4.b("wear-auth: login pressed with no session/key");
                        break;
                    }
                }
                break;
            default:
                xea.m0 = i3;
                SharedPreferences.Editor edit = uc7.e1().edit();
                edit.putInt("searchEngineType", xea.m0);
                edit.apply();
                ((skb) ((View) obj2)).w(bw9.a().a, true);
                ((Dialog) ((AtomicReference) obj).get()).dismiss();
                break;
        }
    }

    public /* synthetic */ ae(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ ae(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
