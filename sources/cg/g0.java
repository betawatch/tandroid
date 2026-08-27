package cg;

import android.content.Context;
import android.graphics.Bitmap;
import gh.i5;
import hh.t5;
import hh.u7;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import jh.b6;
import jh.f6;
import jh.r9;
import jh.u3;
import jh.x3;
import lh.k9;
import lh.o3;
import lh.q9;
import nh.s3;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i3;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.fe;
import org.telegram.ui.h8;
import org.telegram.ui.ib0;
import org.telegram.ui.rn;
import org.telegram.ui.vc;
import org.telegram.ui.ve;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g0(int i10, Object obj, Object obj2) {
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
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a(tLObject, (MessagesController) this.b, (f2) this.c, 5));
                break;
            case 1:
                MessagesController messagesController = (MessagesController) this.b;
                ib0 ib0Var = (ib0) this.c;
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
                    AndroidUtilities.runOnUIThread(new a1.e(22, ib0Var, arrayList3));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((wq0) this.b, tL_error, (org.telegram.ui.ActionBar.n2) this.c, 12));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((i5) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 15));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((hh.r) this.b, tLObject, (Context) this.c, 17));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((hh.i5) this.b, tLObject, (androidx.car.app.utils.a) this.c, tL_error, 6));
                break;
            case 6:
                hh.i5.f1((hh.i5) this.b, (TL_stars.InputSavedStarGift) this.c, tLObject, tL_error);
                break;
            case 7:
                hh.i5.V0((hh.i5) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, tL_error);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((u7) this.b, tLObject, tL_error, (Utilities.Callback) this.c, 26));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a((u7) this.b, tLObject, (Runnable) this.c, 27));
                break;
            case 10:
                jh.d1 d1Var = (jh.d1) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(d1Var.e).processUpdates(updates, false);
                    break;
                }
                break;
            case 11:
                x3 x3Var = (x3) this.b;
                q9 q9Var = (q9) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(x3Var.l.y2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new u3(q9Var, 0));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new j3.m((b6) this.b, tLObject, (Runnable) this.c, 7));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((f6) this.b, tLObject, (Utilities.Callback) this.c, tL_error, 13));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new j3.m((r9) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 9));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new j3.m((lh.y1) this.b, (String) this.c, tLObject, 10));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new j3.m((o3) this.c, tLObject, (MessagesController) this.b, 13));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new j3.m((k9) this.c, tLObject, (MessagesController) this.b, 16));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new j3.m((boolean[]) this.b, tLObject, (nh.q1) this.c, 20));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new j3.m((s3) this.b, tLObject, (org.telegram.ui.ActionBar.b2) this.c, 23));
                break;
            case 20:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.b, (Runnable) this.c, tLObject, tL_error);
                break;
            case 21:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.c, tLObject, tL_error);
                break;
            case 22:
                ((VoIPService) this.b).lambda$startOutgoingCall$10((byte[]) this.c, tLObject, tL_error);
                break;
            case 23:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$32((AccountInstance) this.c, tLObject, tL_error);
                break;
            case 24:
                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i11 = 0;
                    ArrayList arrayList5 = null;
                    while (true) {
                        boolean z10 = true;
                        if (i11 >= size) {
                            AndroidUtilities.runOnUIThread(new t5(b6Var, arrayList5, z10, 8));
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
                                        e6 e6Var = (e6) arrayList4.get(i12);
                                        if (e6Var.o.equals(tL_wallPaper.slug)) {
                                            if (bool == null) {
                                                bool = Boolean.valueOf(pathToAttach.exists());
                                            }
                                            if (bitmap != null || bool.booleanValue()) {
                                                arrayList2 = arrayList4;
                                                bitmap = org.telegram.ui.ActionBar.b6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, e6Var);
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                }
                                                arrayList5.add(e6Var);
                                            } else {
                                                String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                                if (b6Var.b == null) {
                                                    b6Var.b = new HashMap();
                                                }
                                                a6 a6Var = (a6) b6Var.b.get(attachFileName);
                                                if (a6Var == null) {
                                                    a6Var = new a6();
                                                    arrayList2 = arrayList4;
                                                    a6Var.b = new ArrayList();
                                                    a6Var.a = tL_wallPaper;
                                                    b6Var.b.put(attachFileName, a6Var);
                                                } else {
                                                    arrayList2 = arrayList4;
                                                }
                                                a6Var.b.add(e6Var);
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
            case 25:
                AndroidUtilities.runOnUIThread(new i3((org.telegram.ui.ActionBar.f6) this.b, tLObject, (org.telegram.ui.ActionBar.f6) this.c, 2));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((h8) this.b, tL_error, tLObject, (Calendar) this.c, 28));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.u1((vc) this.b, tLObject, (org.telegram.ui.ActionBar.f6) this.c, 10));
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.u1((fe) this.b, tLObject, (Context) this.c, 12));
                break;
            default:
                rn rnVar = (rn) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    AndroidUtilities.runOnUIThread(new ve(rnVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 5));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ g0(Object obj, MessagesController messagesController, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = messagesController;
    }
}
