package kh;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import lh.p6;
import nh.i9;
import nh.j7;
import nh.m6;
import nh.z8;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.ay;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.lv;
import org.telegram.ui.Components.pn;
import org.telegram.ui.Components.qc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        nh.d6 d6Var;
        ArrayList<TLRPC.Document> arrayList;
        int i10 = this.a;
        int i11 = 0;
        int i12 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (i10) {
            case 0:
                s sVar = (s) obj4;
                sVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new d(sVar.getContext(), (f6) obj2, sVar.i0, (List) obj).show();
                break;
            case 1:
                f0 f0Var = (f0) obj4;
                f6 f6Var = (f6) obj2;
                List list = (List) obj;
                f0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (f0Var.j0 != null) {
                    new d(f0Var.getContext(), f6Var, f0Var.j0, list).show();
                    f0Var.dismiss();
                    break;
                }
                break;
            case 2:
                lh.g5 g5Var = (lh.g5) obj4;
                ze.c cVar = (ze.c) obj;
                cVar.d();
                g5Var.v1(((Long) obj3).longValue(), new h(g5Var, cVar, (gg.v2[]) obj2, 3));
                break;
            case 3:
                lh.g5 g5Var2 = (lh.g5) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((ze.c) obj3).b();
                ((gg.v2[]) obj2)[0].dismiss();
                if (tL_error == null) {
                    g5Var2.dismiss();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new lh.n2(i12, g5Var2, tL_error));
                    break;
                }
            case 4:
                nh.m3 m3Var = (nh.m3) obj4;
                m3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                lv lvVar = new lv(((i9) obj3).f, m3Var.getContext(), (f6) obj2, arrayList2);
                nh.x3 x3Var = m3Var.w0.N1;
                if (x3Var != null) {
                    ((z8) x3Var).h(lvVar);
                    break;
                }
                break;
            case 5:
                nh.w3 w3Var = (nh.w3) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                nh.d4 d4Var = w3Var.l;
                if ((storyItem instanceof nh.c6) && (d6Var = ((nh.c6) storyItem).a) != null) {
                    p6 p6Var = new p6(d6Var, storyItem2, callback, 4);
                    if (d6Var.F != 0) {
                        ConnectionsManager.getInstance(d6Var.c).cancelRequest(d6Var.F, true);
                        d6Var.F = 0;
                    }
                    d6Var.C = false;
                    d6Var.D = false;
                    d6Var.H(p6Var);
                    break;
                } else {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.peer = MessagesController.getInstance(d4Var.z2).getInputPeer(storyItem.dialogId);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    ConnectionsManager.getInstance(d4Var.z2).sendRequest(tL_stories_getStoriesByID, new gg.y(w3Var, storyItem, callback));
                    break;
                }
                break;
            case 6:
                m6 m6Var = (m6) obj;
                nh.d4 d4Var2 = ((nh.w3) obj4).l;
                d4Var2.P1.c(m6Var.a, d4Var2.y1, (TL_stories.StoryItem) obj3);
                new qc(d4Var2.Z0, (f6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, m6Var.b))).j();
                break;
            case 7:
                c8.J((c8) obj4, (org.telegram.ui.ActionBar.d2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                break;
            case 8:
                pn pnVar = (pn) obj4;
                zn znVar = (zn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (!znVar.c()) {
                    pnVar.g0.c(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                    pnVar.b.dismiss(true);
                    break;
                } else {
                    org.telegram.ui.Components.z4.L(znVar.getParentActivity(), znVar.a(), new androidx.car.app.utils.a(pnVar, tL_messageMediaToDo, l10, 21));
                    break;
                }
            case 9:
                iy iyVar = (iy) obj4;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(iyVar.a.C.Z0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new ay(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                break;
            case 10:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj3;
                by0 by0Var = (by0) obj2;
                ((org.telegram.ui.ActionBar.d2) obj4).dismiss();
                if (!((Boolean) obj).booleanValue()) {
                    by0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(by0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(by0Var);
                    break;
                } else {
                    d2Var.dismiss();
                    break;
                }
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj4;
                String str = (String) obj3;
                j7 j7Var = (j7) obj2;
                Boolean bool = (Boolean) obj;
                c1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool.booleanValue() ? TextUtils.isEmpty(str) ? "removed" : "updated" : "failed");
                    c1Var.z(j7Var, "biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
        }
    }
}
