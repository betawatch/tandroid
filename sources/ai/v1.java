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
import org.telegram.ui.Components.ld;
import org.telegram.ui.df;
import org.telegram.ui.fh;
import org.telegram.ui.je;
import org.telegram.ui.wn;
import org.telegram.ui.yc;
import org.telegram.ui.zl;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v1 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v1(int i10, Object obj, Object obj2) {
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
                d2 d2Var = (d2) this.b;
                TLRPC.Updates updates = (TLRPC.Updates) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(d2Var.e).processUpdates(updates, false);
                    break;
                }
                break;
            case 1:
                v5 v5Var = (v5) this.b;
                ci.fa faVar = (ci.fa) this.c;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(v5Var.l.C2).processUpdates((TLRPC.Updates) tLObject, false);
                }
                AndroidUtilities.runOnUIThread(new r5(faVar, 0));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a3.k0((u8) this.b, tLObject, (Runnable) this.c, 6));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new h5((x8) this.b, tLObject, (Utilities.Callback) this.c, tL_error));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.k0((sc) this.b, tLObject, (TL_stories.TL_stories_getStoriesViews) this.c, 8));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.d2) this.b, (String) this.c, tLObject, 12));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.v3) this.b, tLObject, (MessagesController) this.c, 15));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new a3.k0((ci.y9) this.b, tLObject, (MessagesController) this.c, 18));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new a3.k0((boolean[]) this.b, tLObject, (ei.v1) this.c, 25));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new a3.k0((ei.e4) this.b, tLObject, (org.telegram.ui.ActionBar.a2) this.c, 28));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new h5((gg.c) this.b, tL_error, (String) this.c, tLObject));
                break;
            case 11:
                AndroidUtilities.runOnUIThread(new gg.t((gg.k1) this.b, (String) this.c, tLObject, 1));
                break;
            case 12:
                gg.e2 e2Var = (gg.e2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new gg.t(e2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 4));
                    break;
                }
                break;
            case 13:
                AndroidUtilities.runOnUIThread(new gg.t((hg.a0) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 7));
                break;
            case 14:
                AndroidUtilities.runOnUIThread(new gg.x1(3, (hg.m0) this.b, (ld) this.c));
                break;
            case 15:
                AndroidUtilities.runOnUIThread(new gg.t((hg.g2) this.b, tLObject, (SharedPreferences) this.c, 12));
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
                            AndroidUtilities.runOnUIThread(new ci.y0(c6Var, arrayList4, z10, 11));
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
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.o((org.telegram.ui.ActionBar.g6) this.b, tLObject, (org.telegram.ui.ActionBar.g6) this.c, 6));
                break;
            case 22:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((org.telegram.ui.h8) this.b, tL_error, tLObject, (Calendar) this.c, 4));
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((yc) this.b, tLObject, (org.telegram.ui.ActionBar.g6) this.c, 10));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((je) this.b, tLObject, (Context) this.c, 12));
                break;
            case 25:
                wn wnVar = (wn) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    AndroidUtilities.runOnUIThread(new df(wnVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 5));
                    break;
                }
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((wn) this.b, tLObject, (TLRPC.User) this.c, 20));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5((wn) this.b, tLObject, tL_error, (MessagesStorage) this.c, 10));
                break;
            case 28:
                wn wnVar2 = (wn) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new fh(4, wnVar2, tL_error));
                        break;
                    }
                } else {
                    wnVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new fh(3, wnVar2, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.r1((zl) this.b, tLObject, (MessageObject) this.c, 23));
                break;
        }
    }
}
