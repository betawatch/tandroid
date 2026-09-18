package ai;

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
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.cy;
import org.telegram.ui.Components.iy;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.un;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class d5 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d5(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        t8 t8Var;
        ArrayList<TLRPC.Document> arrayList;
        int i10 = this.a;
        int i11 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                h5 h5Var = (h5) obj4;
                h5Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                sv svVar = new sv(((jc) obj3).f, h5Var.getContext(), (org.telegram.ui.ActionBar.f6) obj2, arrayList2);
                y5 y5Var = h5Var.z0.Q1;
                if (y5Var != null) {
                    ((ac) y5Var).h(svVar);
                    break;
                }
                break;
            case 1:
                w5 w5Var = (w5) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                f6 f6Var = w5Var.l;
                if ((storyItem instanceof s8) && (t8Var = ((s8) storyItem).a) != null) {
                    a3.k0 k0Var = new a3.k0(t8Var, storyItem2, callback, 3);
                    if (t8Var.F != 0) {
                        ConnectionsManager.getInstance(t8Var.c).cancelRequest(t8Var.F, true);
                        t8Var.F = 0;
                    }
                    t8Var.C = false;
                    t8Var.D = false;
                    t8Var.H(k0Var);
                    break;
                } else {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.peer = MessagesController.getInstance(f6Var.C2).getInputPeer(storyItem.dialogId);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    ConnectionsManager.getInstance(f6Var.C2).sendRequest(tL_stories_getStoriesByID, new t5(w5Var, storyItem, callback, i11));
                    break;
                }
                break;
            case 2:
                e9 e9Var = (e9) obj;
                f6 f6Var2 = ((w5) obj4).l;
                f6Var2.S1.c(e9Var.a, f6Var2.B1, (TL_stories.StoryItem) obj3);
                new vc(f6Var2.c1, (org.telegram.ui.ActionBar.f6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, e9Var.b))).j();
                break;
            case 3:
                org.telegram.ui.Components.h8.K((org.telegram.ui.Components.h8) obj4, (org.telegram.ui.ActionBar.c2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                break;
            case 4:
                un unVar = (un) obj4;
                bo boVar = (bo) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l4 = (Long) obj;
                if (!boVar.c()) {
                    unVar.j0.e(tL_messageMediaToDo, null, null, null, true, 0, l4.longValue());
                    unVar.b.dismiss(true);
                    break;
                } else {
                    org.telegram.ui.Components.c5.L(boVar.getParentActivity(), boVar.a(), new r5(unVar, tL_messageMediaToDo, l4, 26));
                    break;
                }
            case 5:
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(iyVar.a.F.c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new cy(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                break;
            case 6:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                ay0 ay0Var = (ay0) obj2;
                ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
                if (!((Boolean) obj).booleanValue()) {
                    ay0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(ay0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(ay0Var);
                    break;
                } else {
                    c2Var.dismiss();
                    break;
                }
            case 7:
                org.telegram.ui.web.d1 d1Var = (org.telegram.ui.web.d1) obj4;
                String str = (String) obj3;
                da daVar = (da) obj2;
                Boolean bool = (Boolean) obj;
                d1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool.booleanValue() ? TextUtils.isEmpty(str) ? "removed" : "updated" : "failed");
                    d1Var.y(daVar, "biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                xh.m mVar = (xh.m) obj4;
                mVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new xh.c(mVar.getContext(), (org.telegram.ui.ActionBar.f6) obj2, mVar.l0, (List) obj).show();
                break;
            case 9:
                xh.v vVar = (xh.v) obj4;
                org.telegram.ui.ActionBar.f6 f6Var3 = (org.telegram.ui.ActionBar.f6) obj2;
                List list = (List) obj;
                vVar.getClass();
                ((boolean[]) obj3)[0] = false;
                if (vVar.m0 != null) {
                    new xh.c(vVar.getContext(), f6Var3, vVar.m0, list).show();
                    vVar.dismiss();
                    break;
                }
                break;
            case 10:
                yh.a4 a4Var = (yh.a4) obj4;
                nf.e eVar = (nf.e) obj;
                eVar.d();
                a4Var.v1(((Long) obj3).longValue(), new d5(a4Var, eVar, (tg.n1[]) obj2, 11));
                break;
            default:
                yh.a4 a4Var2 = (yh.a4) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((nf.e) obj3).b();
                ((tg.n1[]) obj2)[0].dismiss();
                if (tL_error == null) {
                    a4Var2.dismiss();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new uh.i(12, a4Var2, tL_error));
                    break;
                }
        }
    }
}
