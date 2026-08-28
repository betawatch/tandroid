package bg;

import android.content.Context;
import android.graphics.Bitmap;
import fh.p5;
import gh.k5;
import gh.u5;
import gh.v7;
import ih.b4;
import ih.f6;
import ih.h3;
import ih.j6;
import ih.v9;
import ih.y3;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import kh.n9;
import kh.p3;
import kh.t9;
import mh.u3;
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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.eb0;
import org.telegram.ui.g8;
import org.telegram.ui.k6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        ArrayList arrayList;
        ArrayList arrayList2;
        switch (this.a) {
            case 0:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(tLObject, (MessagesController) this.b, (m2) this.c, 5));
                break;
            case 1:
                MessagesController messagesController = (MessagesController) this.b;
                eb0 eb0Var = (eb0) this.c;
                if (tLObject instanceof TLRPC.TL_contacts_found) {
                    TLRPC.TL_contacts_found tL_contacts_found = (TLRPC.TL_contacts_found) tLObject;
                    messagesController.putUsers(tL_contacts_found.users, false);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i9 = 0; i9 < tL_contacts_found.users.size(); i9++) {
                        TLRPC.User user = tL_contacts_found.users.get(i9);
                        if (!user.self && !UserObject.isDeleted(user) && !UserObject.isService(user.id)) {
                            arrayList3.add(user);
                        }
                    }
                    AndroidUtilities.runOnUIThread(new a1.e(12, eb0Var, arrayList3));
                    break;
                }
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((vq0) this.b, tL_error, (org.telegram.ui.ActionBar.o2) this.c, 12));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((p5) this.b, tLObject, (TL_stars.getResaleStarGifts) this.c, 15));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((gh.r) this.b, tLObject, (Context) this.c, 16));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((k5) this.b, tLObject, (androidx.car.app.utils.b) this.c, tL_error, 6));
                break;
            case 6:
                k5.f1((k5) this.b, (TL_stars.InputSavedStarGift) this.c, tLObject, tL_error);
                break;
            case 7:
                k5.V0((k5) this.b, (org.telegram.ui.ActionBar.c2) this.c, tLObject, tL_error);
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((v7) this.b, tLObject, tL_error, (Utilities.Callback) this.c, 25));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((v7) this.b, tLObject, (Runnable) this.c, 26));
                break;
            case 10:
                ih.f1 f1Var = (ih.f1) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(f1Var.e).processUpdates(updates, false);
                    break;
                }
                break;
            case 11:
                b4 b4Var = (b4) this.b;
                t9 t9Var = (t9) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(b4Var.l.y2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new y3(t9Var, 0));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new h3((f6) this.b, tLObject, (Runnable) this.c, 5));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((j6) this.b, tLObject, (Utilities.Callback) this.c, tL_error, 12));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new h3((v9) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 7));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new h3((kh.a2) this.b, (String) this.c, tLObject, 10));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new h3((p3) this.c, tLObject, (MessagesController) this.b, 13));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new h3((n9) this.c, tLObject, (MessagesController) this.b, 16));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new h3((boolean[]) this.b, tLObject, (mh.r1) this.c, 20));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new h3((u3) this.b, tLObject, (org.telegram.ui.ActionBar.c2) this.c, 23));
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c((of.c) this.b, tL_error, (String) this.c, tLObject, 22));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new h3((of.f1) this.b, (String) this.c, tLObject, 26));
                break;
            case 22:
                of.w1 w1Var = (of.w1) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new h3(w1Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 29));
                    break;
                }
                break;
            case 23:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.b, (Runnable) this.c, tLObject, tL_error);
                break;
            case 24:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.c, tLObject, tL_error);
                break;
            case 25:
                ((VoIPService) this.b).lambda$startOutgoingCall$10((byte[]) this.c, tLObject, tL_error);
                break;
            case 26:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$32((AccountInstance) this.c, tLObject, tL_error);
                break;
            case 27:
                a6 a6Var = (a6) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i10 = 0;
                    ArrayList arrayList5 = null;
                    while (true) {
                        boolean z10 = true;
                        if (i10 >= size) {
                            AndroidUtilities.runOnUIThread(new u5(a6Var, arrayList5, z10, 8));
                            break;
                        } else {
                            TLRPC.WallPaper wallPaper = (TLRPC.WallPaper) vector.objects.get(i10);
                            if (wallPaper instanceof TLRPC.TL_wallPaper) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) wallPaper;
                                if (tL_wallPaper.pattern) {
                                    File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                                    int size2 = arrayList4.size();
                                    int i11 = 0;
                                    Bitmap bitmap = null;
                                    Boolean bool = null;
                                    while (i11 < size2) {
                                        d6 d6Var = (d6) arrayList4.get(i11);
                                        if (d6Var.o.equals(tL_wallPaper.slug)) {
                                            if (bool == null) {
                                                bool = Boolean.valueOf(pathToAttach.exists());
                                            }
                                            if (bitmap != null || bool.booleanValue()) {
                                                arrayList2 = arrayList4;
                                                bitmap = a6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, d6Var);
                                                if (arrayList5 == null) {
                                                    arrayList5 = new ArrayList();
                                                }
                                                arrayList5.add(d6Var);
                                            } else {
                                                String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                                if (a6Var.b == null) {
                                                    a6Var.b = new HashMap();
                                                }
                                                z5 z5Var = (z5) a6Var.b.get(attachFileName);
                                                if (z5Var == null) {
                                                    z5Var = new z5();
                                                    arrayList2 = arrayList4;
                                                    z5Var.b = new ArrayList();
                                                    z5Var.a = tL_wallPaper;
                                                    a6Var.b.put(attachFileName, z5Var);
                                                } else {
                                                    arrayList2 = arrayList4;
                                                }
                                                z5Var.b.add(d6Var);
                                            }
                                        } else {
                                            arrayList2 = arrayList4;
                                        }
                                        i11++;
                                        arrayList4 = arrayList2;
                                    }
                                    arrayList = arrayList4;
                                    if (bitmap != null) {
                                        bitmap.recycle();
                                    }
                                    i10++;
                                    arrayList4 = arrayList;
                                }
                            }
                            arrayList = arrayList4;
                            i10++;
                            arrayList4 = arrayList;
                        }
                    }
                }
                break;
            case 28:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.e((e6) this.b, tLObject, (e6) this.c, 8));
                break;
            default:
                AndroidUtilities.runOnUIThread(new k6((g8) this.b, tL_error, tLObject, (Calendar) this.c, 2));
                break;
        }
    }

    public /* synthetic */ j0(Object obj, MessagesController messagesController, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = messagesController;
    }
}
