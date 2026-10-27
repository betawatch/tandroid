package bi;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
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
                AndroidUtilities.runOnUIThread(new a3.l0((y) this.b, tLObject, (Context) this.c, 6));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new ai.e0((x) this.b, tLObject, (String) this.c, tL_error, 3));
                break;
            case 2:
                h7.W((h7) this.b, (org.telegram.ui.ActionBar.e2) this.c, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.e0((h7) this.b, tLObject, (a3.l0) this.c, tL_error, 7));
                break;
            case 4:
                h7.S((h7) this.b, (TL_stars.InputSavedStarGift) this.c, tLObject, tL_error);
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.l0(tLObject, (v0) this.b, (String) this.c, 15));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.l0((ca) this.b, tLObject, tL_error, (Utilities.Callback) this.c, 16));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.l0((ca) this.b, tLObject, (Runnable) this.c, 17));
                break;
            case 8:
                di.h1 h1Var = (di.h1) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(h1Var.e).lambda$processUpdates$379(updates, false);
                    break;
                }
                break;
            case 9:
                di.h4 h4Var = (di.h4) this.b;
                fi.n9 n9Var = (fi.n9) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(h4Var.l.r2).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new di.e4(n9Var, 0));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new a3.l0((di.s6) this.b, tLObject, (Runnable) this.c, 26));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new ai.e0((di.v6) this.b, tLObject, (Utilities.Callback) this.c, tL_error));
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new a3.l0((di.ha) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 28));
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new e2.m0((fi.y1) this.b, (String) this.c, tLObject, 1));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new e2.m0((fi.n3) this.b, tLObject, (MessagesController) this.c, 4));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new e2.m0((fi.g9) this.b, tLObject, (MessagesController) this.c, 7));
                break;
            case 16:
                AndroidUtilities.runOnUIThread(new e2.m0((boolean[]) this.b, tLObject, (hi.y1) this.c, 11));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new e2.m0((hi.d4) this.b, tLObject, (org.telegram.ui.ActionBar.e2) this.c, 14));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new ai.e0((ig.c) this.b, tL_error, (String) this.c, tLObject, 21));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new e2.m0((ig.j1) this.b, (String) this.c, tLObject, 20));
                break;
            case 20:
                ig.b2 b2Var = (ig.b2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new e2.m0(b2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 23));
                    break;
                }
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new e2.m0((jg.z) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 26));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new hi.u2(21, (jg.k0) this.b, (org.telegram.ui.Components.h2) this.c));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new jg.f1(this.b, tLObject, this.c, 1));
                break;
            case 24:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.c, (Runnable) this.b, tLObject, tL_error);
                break;
            case 25:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.c, tLObject, tL_error);
                break;
            case 26:
                ((VoIPService) this.b).lambda$startOutgoingCall$10((byte[]) this.c, tLObject, tL_error);
                break;
            case 27:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$32((AccountInstance) this.c, tLObject, tL_error);
                break;
            case 28:
                org.telegram.ui.ActionBar.t6 t6Var = (org.telegram.ui.ActionBar.t6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    int i10 = 0;
                    ArrayList arrayList4 = null;
                    while (true) {
                        boolean z10 = true;
                        if (i10 >= size) {
                            AndroidUtilities.runOnUIThread(new u7(t6Var, arrayList4, z10, 13));
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
                                        org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) arrayList3.get(i11);
                                        if (w6Var.o.equals(tL_wallPaper.slug)) {
                                            if (bool == null) {
                                                bool = Boolean.valueOf(pathToAttach.exists());
                                            }
                                            if (bitmap != null || bool.booleanValue()) {
                                                arrayList2 = arrayList3;
                                                bitmap = org.telegram.ui.ActionBar.t6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, w6Var);
                                                if (arrayList4 == null) {
                                                    arrayList4 = new ArrayList();
                                                }
                                                arrayList4.add(w6Var);
                                            } else {
                                                String attachFileName = FileLoader.getAttachFileName(tL_wallPaper.document);
                                                if (t6Var.b == null) {
                                                    t6Var.b = new HashMap();
                                                }
                                                org.telegram.ui.ActionBar.s6 s6Var = (org.telegram.ui.ActionBar.s6) t6Var.b.get(attachFileName);
                                                if (s6Var == null) {
                                                    s6Var = new org.telegram.ui.ActionBar.s6();
                                                    arrayList2 = arrayList3;
                                                    s6Var.b = new ArrayList();
                                                    s6Var.a = tL_wallPaper;
                                                    t6Var.b.put(attachFileName, s6Var);
                                                } else {
                                                    arrayList2 = arrayList3;
                                                }
                                                s6Var.b.add(w6Var);
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
            default:
                AndroidUtilities.runOnUIThread(new jg.f1(this.b, tLObject, this.c, 23));
                break;
        }
    }

    public /* synthetic */ j(Context context, Runnable runnable) {
        this.a = 24;
        this.c = context;
        this.b = runnable;
    }
}
