package bi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
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
import org.telegram.ui.co;
import org.telegram.ui.ef;
import org.telegram.ui.em;
import org.telegram.ui.fh;
import org.telegram.ui.ke;
import org.telegram.ui.zc;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
                    MessagesController.getInstance(t1Var.e).processUpdates(updates, false);
                    break;
                }
                break;
            case 1:
                f5 f5Var = (f5) this.b;
                di.ia iaVar = (di.ia) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(f5Var.l.C2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new b5(iaVar, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a3.j0((b8) this.b, tLObject, (Runnable) this.c, 9));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((f8) this.b, tLObject, (Utilities.Callback) this.c, tL_error, 3));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.j0((yb) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 11));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.j0((di.d2) this.b, (String) this.c, tLObject, 13));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.j0((di.w3) this.b, tLObject, (MessagesController) this.c, 16));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.j0((di.ba) this.b, tLObject, (MessagesController) this.c, 19));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new a3.j0((boolean[]) this.b, tLObject, (fi.v1) this.c, 25));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.j0((fi.e4) this.b, tLObject, (org.telegram.ui.ActionBar.b2) this.c, 28));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((hg.c) this.b, tL_error, (String) this.c, tLObject, 13));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new hg.t((hg.k1) this.b, (String) this.c, tLObject, 1));
                break;
            case 12:
                hg.d2 d2Var = (hg.d2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new hg.t(d2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 4));
                    break;
                }
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new hg.t((ig.y) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 9));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new fi.j4(13, (ig.k0) this.b, (org.telegram.ui.Components.m8) this.c));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new hg.t((ig.f2) this.b, tLObject, (SharedPreferences) this.c, 14));
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
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i10 = 0;
                    ArrayList arrayList4 = null;
                    while (true) {
                        boolean z10 = true;
                        if (i10 >= size) {
                            AndroidUtilities.runOnUIThread(new di.y0(e6Var, arrayList4, z10, 10));
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
                                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) arrayList3.get(i11);
                                        if (h6Var.o.equals(tL_wallPaper.slug)) {
                                            if (bool == null) {
                                                bool = Boolean.valueOf(pathToAttach.exists());
                                            }
                                            if (bitmap != null || bool.booleanValue()) {
                                                arrayList2 = arrayList3;
                                                bitmap = org.telegram.ui.ActionBar.e6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, h6Var);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(h6Var);
                                            } else {
                                                String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                                if (e6Var.b == null) {
                                                    e6Var.b = new HashMap();
                                                }
                                                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) e6Var.b.get(attachFileName);
                                                if (d6Var == null) {
                                                    d6Var = new org.telegram.ui.ActionBar.d6();
                                                    arrayList2 = arrayList3;
                                                    d6Var.b = new ArrayList();
                                                    d6Var.a = tL_wallPaper;
                                                    e6Var.b.put(attachFileName, d6Var);
                                                } else {
                                                    arrayList2 = arrayList3;
                                                }
                                                d6Var.b.add(h6Var);
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
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p((org.telegram.ui.ActionBar.i6) this.b, tLObject, (org.telegram.ui.ActionBar.i6) this.c, 3));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5(this.b, (Object) tL_error, tLObject, this.c, 3));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((zc) this.b, tLObject, (org.telegram.ui.ActionBar.i6) this.c, 10));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((ke) this.b, tLObject, (Context) this.c, 12));
                break;
            case 25:
                co coVar = (co) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    AndroidUtilities.runOnUIThread(new ef(coVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 5));
                    break;
                }
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((co) this.b, tLObject, (TLRPC.User) this.c, 20));
                break;
            case 27:
                co coVar2 = (co) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new fh(5, coVar2, tL_error));
                        break;
                    }
                } else {
                    coVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new fh(4, coVar2, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.n5((org.telegram.ui.ActionBar.n2) this.b, tLObject, (TLObject) tL_error, this.c, 9));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((em) this.b, tLObject, (MessageObject) this.c, 23));
                break;
        }
    }
}
