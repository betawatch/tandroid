package ai;

import android.text.TextUtils;
import ei.i9;
import ei.p7;
import ei.r9;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.an;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.dx;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.xw;
import org.telegram.ui.Components.z7;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        ei.k6 k6Var;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.ChatFull N0;
        int i3 = this.a;
        int i10 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (i3) {
            case 0:
                e0 e0Var = (e0) obj4;
                e0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                new g(e0Var.getContext(), (org.telegram.ui.ActionBar.e6) obj2, e0Var.e2, (List) obj).show();
                break;
            case 1:
                s0 s0Var = (s0) obj4;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                List list = (List) obj;
                s0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (s0Var.f2 != null) {
                    new g(s0Var.getContext(), e6Var, s0Var.f2, list).show();
                    s0Var.dismiss();
                    break;
                }
                break;
            case 2:
                ci.l6 l6Var = (ci.l6) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((sf.b) obj3).b();
                ((xg.e1[]) obj2)[0].dismiss();
                if (tL_error == null) {
                    l6Var.dismiss();
                    break;
                } else {
                    org.telegram.messenger.g0.h3(new ci.e0(7, l6Var, tL_error));
                    break;
                }
            case 3:
                ei.q3 q3Var = (ei.q3) obj4;
                q3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                pu puVar = new pu(((r9) obj3).f, q3Var.getContext(), (org.telegram.ui.ActionBar.e6) obj2, arrayList2);
                ei.c4 c4Var = q3Var.A0.A1;
                if (c4Var != null) {
                    ((i9) c4Var).h(puVar);
                    break;
                }
                break;
            case 4:
                ei.b4 b4Var = (ei.b4) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                u10 u10Var = (u10) obj;
                ei.j4 j4Var = b4Var.x;
                if ((storyItem instanceof ei.j6) && (k6Var = ((ei.j6) storyItem).a) != null) {
                    k3 k3Var = new k3(k6Var, storyItem2, u10Var, 26);
                    if (k6Var.F != 0) {
                        ConnectionsManager.getInstance(k6Var.c).cancelRequest(k6Var.F, true);
                        k6Var.F = 0;
                    }
                    k6Var.C = false;
                    k6Var.D = false;
                    k6Var.H(k3Var);
                    break;
                } else {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.peer = hp.s1(j4Var.m2).j1(storyItem.dialogId);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    ConnectionsManager.getInstance(j4Var.m2).sendRequest(tL_stories_getStoriesByID, new r6(b4Var, storyItem, u10Var, 6));
                    break;
                }
                break;
            case 5:
                ei.s6 s6Var = (ei.s6) obj;
                ei.j4 j4Var2 = ((ei.b4) obj4).x;
                j4Var2.C1.c(s6Var.a, j4Var2.l1, (TL_stories.StoryItem) obj3);
                org.telegram.messenger.camera.q.s(bd.a0(null, null, 2131744741, s6Var.b), new fc(j4Var2.M0, (org.telegram.ui.ActionBar.e6) obj2), R.raw.contact_check, 36);
                break;
            case 6:
                gi.n6 n6Var = (gi.n6) obj4;
                hp hpVar = (hp) obj3;
                String str = (String) obj2;
                Long l10 = (Long) obj;
                if (l10 != null) {
                    TLObject e22 = hpVar.e2(l10.longValue());
                    if (!(e22 instanceof TLRPC.User)) {
                        if (e22 instanceof TLRPC.Chat) {
                            n6Var.a(new gi.p6(str, (TLRPC.Chat) e22));
                            break;
                        }
                    } else {
                        n6Var.a(new gi.o6(str, (TLRPC.User) e22));
                        break;
                    }
                } else {
                    n6Var.a(null);
                    break;
                }
                break;
            case 7:
                u10 u10Var2 = (u10) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.s1) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && u10Var2 != null) {
                    u10Var2.a(inputPeer);
                    break;
                }
                break;
            case 8:
                z7 z7Var = (z7) obj4;
                org.telegram.ui.ActionBar.s1 s1Var = (org.telegram.ui.ActionBar.s1) obj3;
                TLRPC.Document document = (TLRPC.Document) obj2;
                TLRPC.InputFile inputFile = (TLRPC.InputFile) obj;
                if (inputFile != null) {
                    TLRPC.TL_messages_uploadMedia tL_messages_uploadMedia = new TLRPC.TL_messages_uploadMedia();
                    tL_messages_uploadMedia.peer = hp.s1(z7Var.a).j1(h10.i(z7Var.a).e());
                    TLRPC.TL_inputMediaUploadedDocument tL_inputMediaUploadedDocument = new TLRPC.TL_inputMediaUploadedDocument();
                    tL_messages_uploadMedia.media = tL_inputMediaUploadedDocument;
                    tL_inputMediaUploadedDocument.file = inputFile;
                    tL_inputMediaUploadedDocument.mime_type = document.mime_type;
                    tL_inputMediaUploadedDocument.attributes.addAll(document.attributes);
                    ConnectionsManager.getInstance(z7Var.a).sendRequest(tL_messages_uploadMedia, new org.telegram.ui.ActionBar.h6(13, z7Var, s1Var));
                    break;
                } else {
                    s1Var.dismiss();
                    break;
                }
            case 9:
                an anVar = (an) obj4;
                wm wmVar = (wm) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l11 = (Long) obj;
                if (!wmVar.c()) {
                    anVar.k0.c(tL_messageMediaToDo, null, null, null, true, 0, l11.longValue());
                    anVar.b.a(true);
                    break;
                } else {
                    org.telegram.ui.Components.t4.K(wmVar.getParentActivity(), wmVar.a(), new aa.a(anVar, tL_messageMediaToDo, l11, 28));
                    break;
                }
            case 10:
                dx dxVar = (dx) obj4;
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
                        TLRPC.TL_messages_stickerSet l02 = li.b0(dxVar.a.G.d1).l0(li.Z(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true, false, null);
                        arrayList = l02 != null ? l02.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new xw(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                break;
            case 11:
                org.telegram.ui.ActionBar.s1 s1Var2 = (org.telegram.ui.ActionBar.s1) obj3;
                aw0 aw0Var = (aw0) obj2;
                ((org.telegram.ui.ActionBar.s1) obj4).dismiss();
                if (!((Boolean) obj).booleanValue()) {
                    aw0Var.setErrorText(".");
                    org.telegram.messenger.g0.G3(-6.0f, aw0Var, null);
                    org.telegram.messenger.p2.E.a();
                    org.telegram.messenger.g0.K3(aw0Var);
                    break;
                } else {
                    s1Var2.dismiss();
                    break;
                }
            case 12:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj4;
                String str2 = (String) obj3;
                p7 p7Var = (p7) obj2;
                Boolean bool = (Boolean) obj;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool.booleanValue() ? TextUtils.isEmpty(str2) ? "removed" : "updated" : "failed");
                    w0Var.x(p7Var, "biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            default:
                vg.i0 i0Var = (vg.i0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                ((v70) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    i0Var.U1.boosts++;
                    if (i0Var.a2 == 32 && (N0 = hp.s1(i0Var.a).N0(-i0Var.T1)) != null) {
                        N0.boosts_applied++;
                    }
                    i0Var.t1();
                    i0Var.z1(tL_premium_boostsStatus, i0Var.X1);
                    org.telegram.messenger.e3 e3Var = i0Var.V1;
                    e3Var.m = i0Var.U1.next_level_boosts <= 0;
                    e3Var.l = true;
                    e3Var.a(tL_premium_myBoosts);
                    i0Var.v1();
                    break;
                }
                break;
        }
    }
}
