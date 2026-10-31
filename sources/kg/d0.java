package kg;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.h3;
import org.telegram.messenger.q20;
import org.telegram.messenger.t2;
import org.telegram.messenger.ui;
import org.telegram.messenger.vp;
import org.telegram.messenger.z20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.fx0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.nx;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.tx;
import org.telegram.ui.Components.w7;
import org.telegram.ui.un;
import rh.e4;
import rh.l5;
import th.f7;
import th.o7;
import th.p4;
import th.q4;
import th.u2;
import th.v2;
import th.y4;
import th.z2;
import vh.w4;
import vh.x4;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        TLRPC.ChatFull M0;
        ArrayList<TLRPC.Document> arrayList;
        q4 q4Var;
        int i10 = this.a;
        int i11 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                q0 q0Var = (q0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((s80) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    q0Var.T1.boosts++;
                    if (q0Var.Z1 == 32 && (M0 = vp.r1(q0Var.a).M0(-q0Var.S1)) != null) {
                        M0.boosts_applied++;
                    }
                    q0Var.t1();
                    q0Var.z1(tL_premium_boostsStatus, q0Var.W1);
                    h3 h3Var = q0Var.U1;
                    h3Var.m = q0Var.T1.next_level_boosts <= 0;
                    h3Var.l = true;
                    h3Var.a(tL_premium_myBoosts);
                    q0Var.v1();
                    break;
                }
                break;
            case 1:
                w7 w7Var = (w7) obj4;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) obj3;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile != null) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia.peer = vp.r1(w7Var.a).i1(d20.i(w7Var.a).e());
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                    tL_inputMediaUploadedDocument.file = inputFile;
                    tL_inputMediaUploadedDocument.mime_type = document.mime_type;
                    tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
                    ConnectionsManager.getInstance(w7Var.a).sendRequest(tL_messages_uploadMedia, new ag.k0(24, w7Var, x1Var));
                    break;
                } else {
                    x1Var.dismiss();
                    break;
                }
            case 2:
                jn jnVar = (jn) obj4;
                un unVar = (un) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l4 = (Long) obj;
                if (!unVar.c()) {
                    jnVar.j0.e(tL_messageMediaToDo, null, null, null, true, 0, l4.longValue());
                    jnVar.b.a(true);
                    break;
                } else {
                    s4.K(unVar.getParentActivity(), unVar.a(), new androidx.car.app.utils.a(jnVar, tL_messageMediaToDo, l4, 20));
                    break;
                }
            case 3:
                tx txVar = (tx) obj4;
                ArrayList arrayList2 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i11 < size) {
                    Object obj5 = arrayList3.get(i11);
                    i11++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj5;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet l02 = ui.b0(txVar.a.F.c1).l0(ui.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = l02 != null ? l02.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList2.add(new nx(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                break;
            case 4:
                org.telegram.ui.ActionBar.x1 x1Var2 = (org.telegram.ui.ActionBar.x1) obj3;
                fx0 fx0Var = (fx0) obj2;
                ((org.telegram.ui.ActionBar.x1) obj4).dismiss();
                if (!((Boolean) obj).booleanValue()) {
                    fx0Var.setErrorText(".");
                    org.telegram.messenger.i0.F3(-6.0f, fx0Var, null);
                    t2.D.a();
                    org.telegram.messenger.i0.J3(fx0Var);
                    break;
                } else {
                    x1Var2.dismiss();
                    break;
                }
            case 5:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj4;
                String str = (String) obj3;
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj2;
                Boolean bool = (Boolean) obj;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool.booleanValue() ? TextUtils.isEmpty(str) ? "removed" : "updated" : "failed");
                    z0Var.y(x0Var, "biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            case 6:
                ph.m mVar = (ph.m) obj4;
                mVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new ph.c(mVar.getContext(), (p6) obj2, mVar.d2, (List) obj).show();
                break;
            case 7:
                ph.w wVar = (ph.w) obj4;
                p6 p6Var = (p6) obj2;
                List list = (List) obj;
                wVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (wVar.e2 != null) {
                    new ph.c(wVar.getContext(), p6Var, wVar.e2, list).show();
                    wVar.dismiss();
                    break;
                }
                break;
            case 8:
                e4 e4Var = (e4) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((gf.e) obj3).b();
                ((mg.i2[]) obj2)[0].dismiss();
                if (tL_error == null) {
                    e4Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.i0.g3(new rh.o(6, e4Var, tL_error));
                    break;
                }
            case 9:
                th.k2 k2Var = (th.k2) obj4;
                k2Var.getClass();
                ArrayList arrayList4 = new ArrayList(1);
                arrayList4.add((TLRPC.InputStickerSet) obj);
                cv cvVar = new cv(((o7) obj3).f, k2Var.getContext(), (p6) obj2, arrayList4);
                v2 v2Var = k2Var.z0.z1;
                if (v2Var != null) {
                    ((f7) v2Var).h(cvVar);
                    break;
                }
                break;
            case 10:
                u2 u2Var = (u2) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                q20 q20Var = (q20) obj;
                z2 z2Var = u2Var.x;
                if ((storyItem instanceof p4) && (q4Var = ((p4) storyItem).a) != null) {
                    l5 l5Var = new l5(q4Var, storyItem2, q20Var, 5);
                    if (q4Var.F != 0) {
                        ConnectionsManager.getInstance(q4Var.c).cancelRequest(q4Var.F, true);
                        q4Var.F = 0;
                    }
                    q4Var.C = false;
                    q4Var.D = false;
                    q4Var.H(l5Var);
                    break;
                } else {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.peer = vp.r1(z2Var.l2).i1(storyItem.dialogId);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    ConnectionsManager.getInstance(z2Var.l2).sendRequest(tL_stories_getStoriesByID, new ag.p0(u2Var, storyItem, q20Var, 23));
                    break;
                }
                break;
            case 11:
                y4 y4Var = (y4) obj;
                z2 z2Var2 = ((u2) obj4).x;
                z2Var2.B1.c(y4Var.a, z2Var2.k1, (TL_stories.StoryItem) obj3);
                z20.s(cd.a0(null, null, 2131744749, y4Var.b), new cc(z2Var2.L0, (p6) obj2), R.raw.contact_check, 36);
                break;
            case 12:
                w4 w4Var = (w4) obj4;
                vp vpVar = (vp) obj3;
                String str2 = (String) obj2;
                Long l10 = (Long) obj;
                if (l10 != null) {
                    TLObject d22 = vpVar.d2(l10.longValue());
                    if (!(d22 instanceof TLRPC.User)) {
                        if (d22 instanceof TLRPC.Chat) {
                            w4Var.a(new vh.y4(str2, (TLRPC.Chat) d22));
                            break;
                        }
                    } else {
                        w4Var.a(new x4(str2, (TLRPC.User) d22));
                        break;
                    }
                } else {
                    w4Var.a(null);
                    break;
                }
                break;
            default:
                q20 q20Var2 = (q20) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.x1) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && q20Var2 != null) {
                    q20Var2.a(inputPeer);
                    break;
                }
                break;
        }
    }
}
