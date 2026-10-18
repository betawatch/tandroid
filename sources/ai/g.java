package ai;

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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
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
                AndroidUtilities.runOnUIThread(new a3.l0((x) this.b, tLObject, (Context) this.c, 1));
                break;
            case 1:
                k7.O0((k7) this.b, (org.telegram.ui.ActionBar.b2) this.c, tLObject, tL_error);
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new y0(this.b, tLObject, this.c, tL_error, 2));
                break;
            case 3:
                k7.b1((k7) this.b, (TL_stars.InputSavedStarGift) this.c, tLObject, tL_error);
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.l0(tLObject, (u0) this.b, (String) this.c, 11));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.l0((ga) this.b, tLObject, tL_error, (Utilities.Callback) this.c, 12));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.l0((ga) this.b, tLObject, (Runnable) this.c, 13));
                break;
            case 7:
                ci.h1 h1Var = (ci.h1) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(h1Var.e).lambda$processUpdates$377(updates, false);
                    break;
                }
                break;
            case 8:
                ci.g4 g4Var = (ci.g4) this.b;
                ei.r9 r9Var = (ei.r9) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(g4Var.l.C2).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new ci.d4(r9Var, 0));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.l0((ci.s6) this.b, tLObject, (Runnable) this.c, 24));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new y0(this.b, tLObject, this.c, tL_error, 9));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new a3.l0((ci.ia) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 26));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new ei.z1((ei.a2) this.b, (String) this.c, tLObject, 0));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new ei.z1((ei.p3) this.b, tLObject, (MessagesController) this.c, false, 3));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new ei.z1((ei.k9) this.b, tLObject, (MessagesController) this.c, false, 6));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new ei.z1((boolean[]) this.b, tLObject, (gi.r1) this.c, false, 10));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new ei.z1((gi.u3) this.b, tLObject, (org.telegram.ui.ActionBar.b2) this.c, false, 13));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new y0((hg.c) this.b, tL_error, (String) this.c, tLObject, 18));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ei.z1((hg.j1) this.b, (String) this.c, tLObject, 16));
                break;
            case 19:
                hg.c2 c2Var = (hg.c2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new ei.z1(c2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 19));
                    break;
                }
                break;
            case 20:
                AndroidUtilities.runOnUIThread(new ei.z1((ig.y) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, false, 25));
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new hi.t(4, (ig.k0) this.b, (org.telegram.ui.Components.e2) this.c));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new ig.e2((ig.f2) this.b, tLObject, (SharedPreferences) this.c, 0));
                break;
            case 23:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.c, (Runnable) this.b, tLObject, tL_error);
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
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i10 = 0;
                    ArrayList arrayList4 = null;
                    while (true) {
                        boolean z10 = true;
                        if (i10 >= size) {
                            AndroidUtilities.runOnUIThread(new x7(c6Var, arrayList4, z10, 13));
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
                                        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) arrayList3.get(i11);
                                        if (f6Var.o.equals(tL_wallPaper.slug)) {
                                            if (bool == null) {
                                                bool = Boolean.valueOf(pathToAttach.exists());
                                            }
                                            if (bitmap != null || bool.booleanValue()) {
                                                arrayList2 = arrayList3;
                                                bitmap = org.telegram.ui.ActionBar.c6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, f6Var);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(f6Var);
                                            } else {
                                                String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                                if (c6Var.b == null) {
                                                    c6Var.b = new HashMap();
                                                }
                                                org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) c6Var.b.get(attachFileName);
                                                if (b6Var == null) {
                                                    b6Var = new org.telegram.ui.ActionBar.b6();
                                                    arrayList2 = arrayList3;
                                                    b6Var.b = new ArrayList();
                                                    b6Var.a = tL_wallPaper;
                                                    c6Var.b.put(attachFileName, b6Var);
                                                } else {
                                                    arrayList2 = arrayList3;
                                                }
                                                b6Var.b.add(f6Var);
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
            case 28:
                AndroidUtilities.runOnUIThread(new ig.e2((org.telegram.ui.ActionBar.g6) this.b, tLObject, (org.telegram.ui.ActionBar.g6) this.c, 22));
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i((org.telegram.ui.k8) this.b, tL_error, tLObject, (Calendar) this.c, 7));
                break;
        }
    }

    public /* synthetic */ g(Context context, Runnable runnable) {
        this.a = 23;
        this.c = context;
        this.b = runnable;
    }
}
