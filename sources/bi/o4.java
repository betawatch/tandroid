package bi;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
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
import org.telegram.ui.Components.dy;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.rv;
import org.telegram.ui.Components.tn;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class o4 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o4(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        b8 b8Var;
        ArrayList<TLRPC.Document> arrayList;
        int i10 = this.a;
        int i11 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                s4 s4Var = (s4) obj4;
                s4Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                rv rvVar = new rv(((pb) obj3).f, s4Var.getContext(), (org.telegram.ui.ActionBar.f6) obj2, arrayList2);
                h5 h5Var = s4Var.z0.Q1;
                if (h5Var != null) {
                    ((gb) h5Var).h(rvVar);
                    break;
                }
                break;
            case 1:
                f5 f5Var = (f5) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                o5 o5Var = f5Var.l;
                if ((storyItem instanceof a8) && (b8Var = ((a8) storyItem).a) != null) {
                    a3.j0 j0Var = new a3.j0(b8Var, storyItem2, callback, 6);
                    if (b8Var.F != 0) {
                        ConnectionsManager.getInstance(b8Var.c).cancelRequest(b8Var.F, true);
                        b8Var.F = 0;
                    }
                    b8Var.C = false;
                    b8Var.D = false;
                    b8Var.H(j0Var);
                    break;
                } else {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.peer = MessagesController.getInstance(o5Var.C2).getInputPeer(storyItem.dialogId);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    ConnectionsManager.getInstance(o5Var.C2).sendRequest(tL_stories_getStoriesByID, new c5(f5Var, storyItem, callback, i11));
                    break;
                }
                break;
            case 2:
                m8 m8Var = (m8) obj;
                o5 o5Var2 = ((f5) obj4).l;
                o5Var2.S1.c(m8Var.a, o5Var2.B1, (TL_stories.StoryItem) obj3);
                new yc(o5Var2.c1, (org.telegram.ui.ActionBar.f6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, m8Var.b))).j();
                break;
            case 3:
                org.telegram.ui.Components.k8.K((org.telegram.ui.Components.k8) obj4, (org.telegram.ui.ActionBar.b2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                break;
            case 4:
                tn tnVar = (tn) obj4;
                co coVar = (co) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l4 = (Long) obj;
                if (!coVar.c()) {
                    tnVar.j0.d(tL_messageMediaToDo, null, null, null, true, 0, l4.longValue());
                    tnVar.b.dismiss(true);
                    break;
                } else {
                    org.telegram.ui.Components.e5.L(coVar.getParentActivity(), coVar.a(), new androidx.car.app.utils.a(tnVar, tL_messageMediaToDo, l4, 26));
                    break;
                }
            case 5:
                jy jyVar = (jy) obj4;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(jyVar.a.F.c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new dy(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                break;
            case 6:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj3;
                yx0 yx0Var = (yx0) obj2;
                ((org.telegram.ui.ActionBar.b2) obj4).dismiss();
                if (!((Boolean) obj).booleanValue()) {
                    yx0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(yx0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(yx0Var);
                    break;
                } else {
                    b2Var.dismiss();
                    break;
                }
            case 7:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj4;
                String str = (String) obj3;
                k9 k9Var = (k9) obj2;
                Boolean bool = (Boolean) obj;
                d1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool.booleanValue() ? TextUtils.isEmpty(str) ? "removed" : "updated" : "failed");
                    d1Var.y(k9Var, "biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 8:
                yh.m mVar = (yh.m) obj4;
                mVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new yh.c(mVar.getContext(), (org.telegram.ui.ActionBar.f6) obj2, mVar.l0, (List) obj).show();
                break;
            case 9:
                yh.v vVar = (yh.v) obj4;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj2;
                List list = (List) obj;
                vVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (vVar.m0 != null) {
                    new yh.c(vVar.getContext(), f6Var, vVar.m0, list).show();
                    vVar.dismiss();
                    break;
                }
                break;
            case 10:
                zh.w3 w3Var = (zh.w3) obj4;
                of.e eVar = (of.e) obj;
                eVar.d();
                w3Var.v1(((Long) obj3).longValue(), new o4(w3Var, eVar, (ug.n1[]) obj2, 11));
                break;
            default:
                zh.w3 w3Var2 = (zh.w3) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((of.e) obj3).b();
                ((ug.n1[]) obj2)[0].dismiss();
                if (tL_error == null) {
                    w3Var2.dismiss();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new ug.r(18, w3Var2, tL_error));
                    break;
                }
        }
    }
}
