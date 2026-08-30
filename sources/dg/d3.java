package dg;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import kh.b5;
import lh.g5;
import lh.p6;
import lh.r5;
import lh.t7;
import nh.d6;
import nh.h6;
import nh.r9;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.vk;
import org.telegram.ui.af;
import org.telegram.ui.am;
import org.telegram.ui.ih;
import org.telegram.ui.j8;
import org.telegram.ui.ke;
import org.telegram.ui.xn;
import org.telegram.ui.yb;
import org.telegram.ui.zc;
import ph.f8;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d3 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d3(int i10, Object obj, Object obj2) {
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
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((q3) this.b, tLObject, (o3) this.c, tL_error, 3));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (MessagesController) this.b, (gg.c2) this.c, 6));
                break;
            case 2:
                MessagesController messagesController = (MessagesController) this.b;
                vk vkVar = (vk) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i10 = 0; i10 < tL_contacts_found.users.size(); i10++) {
                        TLRPC.User user = tL_contacts_found.users.get(i10);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            arrayList3.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new gf.c(5, vkVar, arrayList3));
                    break;
                }
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((or0) this.b, tL_error, (org.telegram.ui.ActionBar.p2) this.c, 14));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((b5) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 17));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((lh.q) this.b, tLObject, (Context) this.c, 19));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((g5) this.b, tLObject, (androidx.car.app.utils.b) this.c, tL_error, 8));
                break;
            case 7:
                g5.f1((g5) this.b, (TL_stars.InputSavedStarGift) this.c, tLObject, tL_error);
                break;
            case 8:
                g5.V0((g5) this.b, (org.telegram.ui.ActionBar.d2) this.c, tLObject, tL_error);
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((t7) this.b, tLObject, tL_error, (Utilities.Callback) this.c, 28));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((t7) this.b, tLObject, (Runnable) this.c, 29));
                break;
            case 11:
                nh.e1 e1Var = (nh.e1) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(e1Var.e).processUpdates(updates, false);
                    break;
                }
                break;
            case 12:
                nh.w3 w3Var = (nh.w3) this.b;
                f8 f8Var = (f8) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(w3Var.l.z2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new nh.t3(f8Var, 0));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new p6((d6) this.b, tLObject, (Runnable) this.c, 7));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((h6) this.b, tLObject, (Utilities.Callback) this.c, tL_error, 14));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new p6((r9) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 9));
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
                e6 e6Var = (e6) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i11 = 0;
                    ArrayList arrayList5 = null;
                    while (true) {
                        boolean z4 = true;
                        if (i11 >= size) {
                            AndroidUtilities.runOnUIThread(new r5(e6Var, arrayList5, z4, 6));
                            break;
                        } else {
                            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i11);
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (tL_wallPaper.pattern) {
                                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                                    int size2 = arrayList4.size();
                                    int i12 = 0;
                                    Bitmap bitmap = null;
                                    Boolean bool = null;
                                    while (i12 < size2) {
                                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) arrayList4.get(i12);
                                        if (h6Var.o.equals(tL_wallPaper.slug)) {
                                            if (bool == null) {
                                                bool = Boolean.valueOf(pathToAttach.exists());
                                            }
                                            if (bitmap != null || bool.booleanValue()) {
                                                arrayList2 = arrayList4;
                                                bitmap = e6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, h6Var);
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                }
                                                arrayList5.add(h6Var);
                                            } else {
                                                String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                                if (e6Var.b == null) {
                                                    e6Var.b = new HashMap();
                                                }
                                                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) e6Var.b.get(attachFileName);
                                                if (d6Var == null) {
                                                    d6Var = new org.telegram.ui.ActionBar.d6();
                                                    arrayList2 = arrayList4;
                                                    d6Var.b = new ArrayList();
                                                    d6Var.a = tL_wallPaper;
                                                    e6Var.b.put(attachFileName, d6Var);
                                                } else {
                                                    arrayList2 = arrayList4;
                                                }
                                                d6Var.b.add(h6Var);
                                            }
                                        } else {
                                            arrayList2 = arrayList4;
                                        }
                                        i12++;
                                        arrayList4 = arrayList2;
                                    }
                                    arrayList = arrayList4;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                    }
                                    i11++;
                                    arrayList4 = arrayList;
                                }
                            }
                            arrayList = arrayList4;
                            i11++;
                            arrayList4 = arrayList;
                        }
                    }
                }
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new p6((i6) this.b, tLObject, (i6) this.c, 20));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((j8) this.b, tL_error, tLObject, (Calendar) this.c, 24));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((zc) this.b, tLObject, (i6) this.c, 10));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((ke) this.b, tLObject, (Context) this.c, 12));
                break;
            case 25:
                xn xnVar = (xn) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    AndroidUtilities.runOnUIThread(new af(xnVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 5));
                    break;
                }
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((xn) this.b, tLObject, (TLRPC.User) this.c, 20));
                break;
            case 27:
                xn xnVar2 = (xn) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error == null) {
                    xnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new yb(16, xnVar2, tL_messages_sendScheduledMessages));
                    break;
                } else if (tL_error.text != null) {
                    AndroidUtilities.runOnUIThread(new yb(17, xnVar2, tL_error));
                    break;
                }
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new ih(this.b, (Object) tLObject, (Object) tL_error, this.c, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((am) this.b, tLObject, (MessageObject) this.c, 23));
                break;
        }
    }
}
