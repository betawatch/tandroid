package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.fo;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.sy;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class a4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a4(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ci.s6 s6Var;
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.ChatFull x12;
        int i10 = this.a;
        int i11 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                l7 l7Var = (l7) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((pf.c) obj3).b();
                ((ug.l1[]) obj2)[0].dismiss();
                if (tL_error == null) {
                    l7Var.dismiss();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new a1.f(20, l7Var, tL_error));
                    break;
                }
            case 1:
                ci.u3 u3Var = (ci.u3) obj4;
                u3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                aw awVar = new aw(((ci.z9) obj3).f, u3Var.getContext(), (org.telegram.ui.ActionBar.g6) obj2, arrayList2);
                ci.i4 i4Var = u3Var.z0.Q1;
                if (i4Var != null) {
                    ((ci.q9) i4Var).h(awVar);
                    break;
                }
                break;
            case 2:
                ci.g4 g4Var = (ci.g4) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ci.p4 p4Var = g4Var.l;
                if ((storyItem instanceof ci.r6) && (s6Var = ((ci.r6) storyItem).a) != null) {
                    a3.l0 l0Var = new a3.l0(s6Var, storyItem2, callback, 21);
                    if (s6Var.F != 0) {
                        ConnectionsManager.getInstance(s6Var.c).cancelRequest(s6Var.F, true);
                        s6Var.F = 0;
                    }
                    s6Var.C = false;
                    s6Var.D = false;
                    s6Var.H(l0Var);
                    break;
                } else {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.peer = MessagesController.getInstance(p4Var.C2).getInputPeer(storyItem.dialogId);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    ConnectionsManager.getInstance(p4Var.C2).sendRequest(tL_stories_getStoriesByID, new j2(g4Var, storyItem, callback, 5));
                    break;
                }
                break;
            case 3:
                ci.a7 a7Var = (ci.a7) obj;
                ci.p4 p4Var2 = ((ci.g4) obj4).l;
                p4Var2.S1.c(a7Var.a, p4Var2.B1, (TL_stories.StoryItem) obj3);
                new org.telegram.ui.Components.xc(p4Var2.c1, (org.telegram.ui.ActionBar.g6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, a7Var.b))).j();
                break;
            case 4:
                ei.f7 f7Var = (ei.f7) obj4;
                MessagesController messagesController = (MessagesController) obj3;
                String str = (String) obj2;
                Long l4 = (Long) obj;
                if (l4 != null) {
                    TLObject userOrChat = messagesController.getUserOrChat(l4.longValue());
                    if (!(userOrChat instanceof TLRPC.User)) {
                        if (userOrChat instanceof TLRPC.Chat) {
                            f7Var.run(new ei.h7(str, (TLRPC.Chat) userOrChat));
                            break;
                        }
                    } else {
                        f7Var.run(new ei.g7(str, (TLRPC.User) userOrChat));
                        break;
                    }
                } else {
                    f7Var.run(null);
                    break;
                }
                break;
            case 5:
                Utilities.Callback callback2 = (Utilities.Callback) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
                if (((Boolean) obj).booleanValue() && callback2 != null) {
                    callback2.run(inputPeer);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.k8.L((org.telegram.ui.Components.k8) obj4, (org.telegram.ui.ActionBar.c2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                break;
            case 7:
                fo foVar = (fo) obj4;
                sn snVar = (sn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (!snVar.c()) {
                    foVar.j0.c(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                    foVar.b.dismiss(true);
                    break;
                } else {
                    org.telegram.ui.Components.f5.L(snVar.getParentActivity(), snVar.a(), new u2(foVar, tL_messageMediaToDo, l10, 28));
                    break;
                }
            case 8:
                sy syVar = (sy) obj4;
                ArrayList arrayList3 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj2;
                ArrayList arrayList4 = (ArrayList) obj;
                int size = arrayList4.size();
                while (i11 < size) {
                    Object obj5 = arrayList4.get(i11);
                    i11++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj5;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(syVar.a.F.c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new ky(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                break;
            case 9:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                wy0 wy0Var = (wy0) obj2;
                ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
                if (!((Boolean) obj).booleanValue()) {
                    wy0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(wy0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(wy0Var);
                    break;
                } else {
                    c2Var.dismiss();
                    break;
                }
            case 10:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj4;
                String str2 = (String) obj3;
                ci.y7 y7Var = (ci.y7) obj2;
                Boolean bool = (Boolean) obj;
                b1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool.booleanValue() ? TextUtils.isEmpty(str2) ? "removed" : "updated" : "failed");
                    b1Var.x(y7Var, "biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 11:
                sg.j0 j0Var = (sg.j0) obj4;
                TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                j0Var.getClass();
                ((ba0) obj3).setLoading(false);
                if (tL_premium_boostsStatus != null) {
                    j0Var.b0.boosts++;
                    if (j0Var.h0 == 32 && (x12 = j0Var.x1()) != null) {
                        x12.boosts_applied++;
                    }
                    j0Var.D1();
                    j0Var.J1(tL_premium_boostsStatus, j0Var.e0);
                    ChannelBoostsController.CanApplyBoost canApplyBoost = j0Var.c0;
                    canApplyBoost.isMaxLvl = j0Var.b0.next_level_boosts <= 0;
                    canApplyBoost.boostedNow = true;
                    canApplyBoost.setMyBoosts(tL_premium_myBoosts);
                    j0Var.F1();
                    break;
                }
                break;
            case 12:
                yh.m mVar = (yh.m) obj4;
                mVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new yh.c(mVar.getContext(), (org.telegram.ui.ActionBar.g6) obj2, mVar.l0, (List) obj).show();
                break;
            default:
                yh.v vVar = (yh.v) obj4;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj2;
                List list = (List) obj;
                vVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (vVar.m0 != null) {
                    new yh.c(vVar.getContext(), g6Var, vVar.m0, list).show();
                    vVar.dismiss();
                    break;
                }
                break;
        }
    }
}
