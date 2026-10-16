package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ed;
import org.telegram.ui.fo;
import org.telegram.ui.hm;
import org.telegram.ui.jd;
import org.telegram.ui.of;
import org.telegram.ui.qe;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                t1 t1Var = (t1) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(t1Var.e).lambda$processUpdates$377(updates, false);
                    break;
                }
                break;
            case 1:
                h5 h5Var = (h5) this.b;
                di.ea eaVar = (di.ea) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(h5Var.l.C2).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new d5(eaVar, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a3.l0((f8) this.b, tLObject, (Runnable) this.c, 9));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((i8) this.b, tLObject, (Utilities.Callback) this.c, tL_error, 3));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.l0((bc) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 11));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.l0((di.c2) this.b, (String) this.c, tLObject, 13));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.l0((di.u3) this.b, tLObject, (MessagesController) this.c, 16));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.l0((di.x9) this.b, tLObject, (MessagesController) this.c, 19));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new a3.l0((boolean[]) this.b, tLObject, (fi.u1) this.c, 25));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.l0((fi.f4) this.b, tLObject, (org.telegram.ui.ActionBar.a2) this.c, 28));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((hg.c) this.b, tL_error, (String) this.c, tLObject, 12));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new hg.t((hg.j1) this.b, (String) this.c, tLObject, 1));
                break;
            case 12:
                hg.c2 c2Var = (hg.c2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new hg.t(c2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 4));
                    break;
                }
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new hg.t((ig.y) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 10));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new fi.q3(15, (ig.k0) this.b, (org.telegram.ui.Components.o8) this.c));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new hg.t((ig.f2) this.b, tLObject, (SharedPreferences) this.c, 15));
                break;
            case 16:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.b, (Runnable) this.c, tLObject, tL_error);
                break;
            case 17:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.c, tLObject, tL_error);
                break;
            case 18:
                ((VoIPService) this.b).lambda$startOutgoingCall$10((byte[]) this.c, tLObject, tL_error);
                break;
            case 19:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$32((AccountInstance) this.c, tLObject, tL_error);
                break;
            case 20:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i10 = 0;
                    ArrayList arrayList4 = null;
                    while (true) {
                        boolean z10 = true;
                        if (i10 >= size) {
                            AndroidUtilities.runOnUIThread(new di.x0(b6Var, arrayList4, z10, 10));
                            break;
                        } else {
                            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i10);
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (tL_wallPaper.pattern) {
                                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                                    int size2 = arrayList3.size();
                                    int i11 = 0;
                                    Bitmap bitmap = null;
                                    Boolean bool = null;
                                    while (i11 < size2) {
                                        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) arrayList3.get(i11);
                                        if (e6Var.o.equals(tL_wallPaper.slug)) {
                                            if (bool == null) {
                                                bool = Boolean.valueOf(pathToAttach.exists());
                                            }
                                            if (bitmap != null || bool.booleanValue()) {
                                                arrayList2 = arrayList3;
                                                bitmap = org.telegram.ui.ActionBar.b6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, e6Var);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(e6Var);
                                            } else {
                                                String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                                if (b6Var.b == null) {
                                                    b6Var.b = new HashMap();
                                                }
                                                org.telegram.ui.ActionBar.a6 a6Var = (org.telegram.ui.ActionBar.a6) b6Var.b.get(attachFileName);
                                                if (a6Var == null) {
                                                    a6Var = new org.telegram.ui.ActionBar.a6();
                                                    arrayList2 = arrayList3;
                                                    a6Var.b = new ArrayList();
                                                    a6Var.a = tL_wallPaper;
                                                    b6Var.b.put(attachFileName, a6Var);
                                                } else {
                                                    arrayList2 = arrayList3;
                                                }
                                                a6Var.b.add(e6Var);
                                            }
                                        } else {
                                            arrayList2 = arrayList3;
                                        }
                                        i11++;
                                        arrayList3 = arrayList2;
                                    }
                                    arrayList = arrayList3;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                    }
                                    i10++;
                                    arrayList3 = arrayList;
                                }
                            }
                            arrayList = arrayList3;
                            i10++;
                            arrayList3 = arrayList;
                        }
                    }
                }
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.f((org.telegram.ui.ActionBar.f6) this.b, tLObject, (org.telegram.ui.ActionBar.f6) this.c, 7));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6((org.telegram.ui.l8) this.b, tL_error, tLObject, (Calendar) this.c, 1));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.t1((ed) this.b, tLObject, (org.telegram.ui.ActionBar.f6) this.c, 10));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.t1((qe) this.b, tLObject, (Context) this.c, 12));
                break;
            case 25:
                fo foVar = (fo) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    AndroidUtilities.runOnUIThread(new of(foVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 5));
                    break;
                }
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.t1((fo) this.b, tLObject, (TLRPC.User) this.c, 21));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.p6((fo) this.b, tLObject, tL_error, (MessagesStorage) this.c, 7));
                break;
            case 28:
                fo foVar2 = (fo) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new jd(13, foVar2, tL_error));
                        break;
                    }
                } else {
                    foVar2.getMessagesController().lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new jd(12, foVar2, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.t1((hm) this.b, tLObject, (MessageObject) this.c, 23));
                break;
        }
    }
}
