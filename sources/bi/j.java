package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.m10;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.jx;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.qn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements w10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.messenger.w10
    public final void a(Object obj) {
        fi.a6 a6Var;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.ChatFull P0;
        int i7 = this.a;
        int i10 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (i7) {
            case 0:
                y yVar = (y) obj4;
                yVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new e(yVar.getContext(), (org.telegram.ui.ActionBar.i6) obj2, yVar.h2, (List) obj).show();
                break;
            case 1:
                m0 m0Var = (m0) obj4;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                List list = (List) obj;
                m0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (m0Var.i2 != null) {
                    new e(m0Var.getContext(), i6Var, m0Var.i2, list).show();
                    m0Var.dismiss();
                    break;
                }
                break;
            case 2:
                a5.s((TL_stars.TL_starGiftUnique) obj4, gd.a0(null, null, !((Boolean) obj).booleanValue() ? 2131749619 : ((Boolean) obj3).booleanValue() ? 2131749616 : 2131749617, (String) obj2));
                break;
            case 3:
                di.f6 f6Var = (di.f6) obj4;
                vf.b bVar = (vf.b) obj;
                bVar.d();
                f6Var.w1(((Long) obj3).longValue(), new j(f6Var, bVar, (f2[]) obj2, 5));
                break;
            case 4:
                di.f6 f6Var2 = (di.f6) obj4;
                f2 f2Var = (f2) obj2;
                String str = (String) obj;
                ((vf.b) obj3).b();
                if (!org.telegram.ui.Wallet.v0.L(str)) {
                    if (str == null) {
                        if (f2Var != null) {
                            f2Var.dismiss();
                        }
                        f6Var2.dismiss();
                        org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                        if (T instanceof org.telegram.ui.Wallet.o6) {
                            ((org.telegram.ui.Wallet.o6) T).T0();
                            break;
                        }
                    } else {
                        (f2Var != null ? new kc(f2Var.c, f6Var2.J0) : f6Var2.k()).f0(str, false);
                        break;
                    }
                }
                break;
            case 5:
                di.f6 f6Var3 = (di.f6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((vf.b) obj3).b();
                ((f2[]) obj2)[0].dismiss();
                if (tL_error == null) {
                    f6Var3.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.g3(new di.f2(3, f6Var3, tL_error));
                    break;
                }
            case 6:
                fi.g3 g3Var = (fi.g3) obj4;
                g3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                bv bvVar = new bv(((fi.f9) obj3).f, g3Var.getContext(), (org.telegram.ui.ActionBar.i6) obj2, arrayList2);
                fi.s3 s3Var = g3Var.A0.A1;
                if (s3Var != null) {
                    ((fi.w8) s3Var).h(bvVar);
                    break;
                }
                break;
            case 7:
                fi.r3 r3Var = (fi.r3) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                w10 w10Var = (w10) obj;
                fi.z3 z3Var = r3Var.x;
                if ((storyItem instanceof fi.z5) && (a6Var = ((fi.z5) storyItem).a) != null) {
                    di.a8 a8Var = new di.a8(a6Var, storyItem2, w10Var, 4);
                    if (a6Var.F != 0) {
                        ConnectionsManager.getInstance(a6Var.c).cancelRequest(a6Var.F, true);
                        a6Var.F = 0;
                    }
                    a6Var.C = false;
                    a6Var.D = false;
                    a6Var.H(a8Var);
                    break;
                } else {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.peer = mp.u1(z3Var.m2).l1(storyItem.dialogId);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    ConnectionsManager.getInstance(z3Var.m2).sendRequest(tL_stories_getStoriesByID, new q1(r3Var, storyItem, w10Var, 8));
                    break;
                }
                break;
            case 8:
                fi.i6 i6Var2 = (fi.i6) obj;
                fi.z3 z3Var2 = ((fi.r3) obj4).x;
                z3Var2.C1.c(i6Var2.a, z3Var2.l1, (TL_stories.StoryItem) obj3);
                m10.u(gd.a0(null, null, 2131744490, i6Var2.b), new kc(z3Var2.M0, (org.telegram.ui.ActionBar.i6) obj2), R.raw.contact_check, 36);
                break;
            case 9:
                hi.t6 t6Var = (hi.t6) obj4;
                mp mpVar = (mp) obj3;
                String str2 = (String) obj2;
                Long l10 = (Long) obj;
                if (l10 != null) {
                    TLObject g22 = mpVar.g2(l10.longValue());
                    if (!(g22 instanceof TLRPC.User)) {
                        if (g22 instanceof TLRPC.Chat) {
                            t6Var.a(new hi.v6(str2, (TLRPC.Chat) g22));
                            break;
                        }
                    } else {
                        t6Var.a(new hi.u6(str2, (TLRPC.User) g22));
                        break;
                    }
                } else {
                    t6Var.a(null);
                    break;
                }
                break;
            case 10:
                w10 w10Var2 = (w10) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.t1) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && w10Var2 != null) {
                    w10Var2.a(inputPeer);
                    break;
                }
                break;
            case 11:
                org.telegram.ui.Components.e8 e8Var = (org.telegram.ui.Components.e8) obj4;
                org.telegram.ui.ActionBar.t1 t1Var = (org.telegram.ui.ActionBar.t1) obj3;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile != null) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia.peer = mp.u1(e8Var.a).l1(i10.i(e8Var.a).e());
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                    tL_inputMediaUploadedDocument.file = inputFile;
                    tL_inputMediaUploadedDocument.mime_type = document.mime_type;
                    tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
                    ConnectionsManager.getInstance(e8Var.a).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.v7(12, e8Var, t1Var));
                    break;
                } else {
                    t1Var.dismiss();
                    break;
                }
            case 12:
                qn qnVar = (qn) obj4;
                bn bnVar = (bn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l11 = (Long) obj;
                if (!bnVar.c()) {
                    qnVar.k0.c(tL_messageMediaToDo, null, null, null, true, 0, l11.longValue());
                    qnVar.b.a(true);
                    break;
                } else {
                    org.telegram.ui.Components.b5.I(bnVar.getParentActivity(), bnVar.a(), new a3.h(qnVar, tL_messageMediaToDo, l11, 29));
                    break;
                }
            case 13:
                ox oxVar = (ox) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                int size = arrayList4.size();
                while (i10 < size) {
                    Object obj5 = arrayList4.get(i10);
                    i10++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj5;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet n02 = ri.d0(oxVar.a.G.d1).n0(ri.b0(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = n02 != null ? n02.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new jx(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                break;
            case 14:
                org.telegram.ui.ActionBar.t1 t1Var2 = (org.telegram.ui.ActionBar.t1) obj3;
                mw0 mw0Var = (mw0) obj2;
                ((org.telegram.ui.ActionBar.t1) obj4).dismiss();
                if (!((Boolean) obj).booleanValue()) {
                    mw0Var.setErrorText(".");
                    org.telegram.messenger.g0.E3(-6.0f, mw0Var, null);
                    org.telegram.messenger.q2.E.a();
                    org.telegram.messenger.g0.I3(mw0Var);
                    break;
                } else {
                    t1Var2.dismiss();
                    break;
                }
            case 15:
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj4;
                String str3 = (String) obj3;
                fi.f7 f7Var = (fi.f7) obj2;
                Boolean bool = (Boolean) obj;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool.booleanValue() ? TextUtils.isEmpty(str3) ? "removed" : "updated" : "failed");
                    v0Var.x(f7Var, "biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                ug.k0 k0Var = (ug.k0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((m80) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    k0Var.X1.boosts++;
                    if (k0Var.d2 == 32 && (P0 = mp.u1(k0Var.a).P0(-k0Var.W1)) != null) {
                        P0.boosts_applied++;
                    }
                    k0Var.u1();
                    k0Var.A1(tL_premium_boostsStatus, k0Var.a2);
                    org.telegram.messenger.g3 g3Var2 = k0Var.Y1;
                    g3Var2.m = k0Var.X1.next_level_boosts <= 0;
                    g3Var2.l = true;
                    g3Var2.a(tL_premium_myBoosts);
                    k0Var.w1();
                    break;
                }
                break;
        }
    }
}
