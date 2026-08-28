package fh;

import ih.d9;
import ih.m9;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.c8;
import org.telegram.ui.Components.dv;
import org.telegram.ui.Components.gx0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ox;
import org.telegram.ui.Components.ux;
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ih.f6 f6Var;
        ArrayList<TLRPC.Document> arrayList;
        int i9 = this.a;
        int i10 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        Object obj4 = this.d;
        switch (i9) {
            case 0:
                x xVar = (x) obj4;
                xVar.getClass();
                ((boolean[]) obj3)[0] = false;
                new d(xVar.getContext(), (org.telegram.ui.ActionBar.b6) obj2, xVar.h0, (List) obj).show();
                break;
            case 1:
                k0 k0Var = (k0) obj4;
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) obj2;
                List list = (List) obj;
                k0Var.getClass();
                ((boolean[]) obj3)[0] = false;
                if (k0Var.i0 != null) {
                    new d(k0Var.getContext(), b6Var, k0Var.i0, list).show();
                    k0Var.dismiss();
                    break;
                }
                break;
            case 2:
                gh.k5 k5Var = (gh.k5) obj4;
                ve.d dVar = (ve.d) obj;
                dVar.d();
                k5Var.v1(((Long) obj3).longValue(), new i(k5Var, dVar, (bg.g3[]) obj2, 3));
                break;
            case 3:
                gh.k5 k5Var2 = (gh.k5) obj4;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                ((ve.d) obj3).b();
                ((bg.g3[]) obj2)[0].dismiss();
                if (tL_error == null) {
                    k5Var2.dismiss();
                    break;
                } else {
                    AndroidUtilities.runOnUIThread(new e5.u(13, k5Var2, tL_error));
                    break;
                }
            case 4:
                ih.p3 p3Var = (ih.p3) obj4;
                p3Var.getClass();
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add((TLRPC.InputStickerSet) obj);
                dv dvVar = new dv(((m9) obj3).f, p3Var.getContext(), (org.telegram.ui.ActionBar.b6) obj2, arrayList2);
                ih.c4 c4Var = p3Var.v0.M1;
                if (c4Var != null) {
                    ((d9) c4Var).h(dvVar);
                    break;
                }
                break;
            case 5:
                ih.b4 b4Var = (ih.b4) obj4;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj3;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                ih.i4 i4Var = b4Var.l;
                if ((storyItem instanceof ih.e6) && (f6Var = ((ih.e6) storyItem).a) != null) {
                    ih.h3 h3Var = new ih.h3(f6Var, storyItem2, callback, 2);
                    if (f6Var.F != 0) {
                        ConnectionsManager.getInstance(f6Var.c).cancelRequest(f6Var.F, true);
                        f6Var.F = 0;
                    }
                    f6Var.C = false;
                    f6Var.D = false;
                    f6Var.H(h3Var);
                    break;
                } else {
                    TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
                    tL_stories_getStoriesByID.peer = MessagesController.getInstance(i4Var.y2).getInputPeer(storyItem.dialogId);
                    tL_stories_getStoriesByID.id.add(Integer.valueOf(storyItem.id));
                    ConnectionsManager.getInstance(i4Var.y2).sendRequest(tL_stories_getStoriesByID, new bg.b0(b4Var, storyItem, callback));
                    break;
                }
                break;
            case 6:
                ih.o6 o6Var = (ih.o6) obj;
                ih.i4 i4Var2 = ((ih.b4) obj4).l;
                i4Var2.O1.c(o6Var.a, i4Var2.x1, (TL_stories.StoryItem) obj3);
                new oc(i4Var2.Y0, (org.telegram.ui.ActionBar.b6) obj2).Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StoryAddedToAlbumX, o6Var.b))).j();
                break;
            case 7:
                c8.J((c8) obj4, (org.telegram.ui.ActionBar.c2) obj3, (TLRPC.Document) obj2, (TLRPC.InputFile) obj);
                break;
            case 8:
                jn jnVar = (jn) obj4;
                qn qnVar = (qn) obj3;
                TLRPC.TL_messageMediaToDo tL_messageMediaToDo = (TLRPC.TL_messageMediaToDo) obj2;
                Long l10 = (Long) obj;
                if (!qnVar.c()) {
                    jnVar.f0.e(tL_messageMediaToDo, null, null, null, true, 0, l10.longValue());
                    jnVar.b.dismiss(true);
                    break;
                } else {
                    org.telegram.ui.Components.y4.L(qnVar.getParentActivity(), qnVar.a(), new androidx.car.app.utils.a(jnVar, tL_messageMediaToDo, l10, 25));
                    break;
                }
            case 9:
                ux uxVar = (ux) obj4;
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
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(uxVar.a.B.Y0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        arrayList3.add(new ox(stickerSetCovered, arrayList));
                    }
                }
                runnable.run();
                break;
            case 10:
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj3;
                gx0 gx0Var = (gx0) obj2;
                ((org.telegram.ui.ActionBar.c2) obj4).dismiss();
                if (!((Boolean) obj).booleanValue()) {
                    gx0Var.setErrorText(".");
                    AndroidUtilities.shakeViewSpring(gx0Var, -6.0f);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    AndroidUtilities.showKeyboard(gx0Var);
                    break;
                } else {
                    c2Var.dismiss();
                    break;
                }
            case 11:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj4;
                String str = (String) obj3;
                TL_keyboard.TL_buttonTypeRequestPeer tL_buttonTypeRequestPeer = (TL_keyboard.TL_buttonTypeRequestPeer) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                if (user != null) {
                    TLRPC.TL_messages_sendBotRequestedPeer tL_messages_sendBotRequestedPeer = new TLRPC.TL_messages_sendBotRequestedPeer();
                    tL_messages_sendBotRequestedPeer.peer = MessagesController.getInputPeer(y0Var.Q);
                    tL_messages_sendBotRequestedPeer.webapp_req_id = str;
                    tL_messages_sendBotRequestedPeer.button_id = tL_buttonTypeRequestPeer.button_id;
                    tL_messages_sendBotRequestedPeer.requested_peers.add(MessagesController.getInputPeer(user));
                    ConnectionsManager.getInstance(y0Var.I).sendRequestTyped(tL_messages_sendBotRequestedPeer, new org.telegram.messenger.a(), new f0(y0Var, str, user, 8));
                    y0Var.v("requested_chat_sent", org.telegram.ui.web.y0.x(str, "req_id"));
                    break;
                } else {
                    y0Var.v("requested_chat_failed", org.telegram.ui.web.y0.x(str, "req_id"));
                    break;
                }
            default:
                org.telegram.ui.web.y0 y0Var2 = (org.telegram.ui.web.y0) obj4;
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    y0Var2.v("file_download_requested", org.telegram.ui.web.y0.x("cancelled", "status"));
                    break;
                } else {
                    y0Var2.h0.b(str2, str3);
                    y0Var2.v("file_download_requested", org.telegram.ui.web.y0.x("downloading", "status"));
                    break;
                }
        }
    }
}
