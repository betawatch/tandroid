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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPPreNotificationService;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.eo;
import org.telegram.ui.fm;
import org.telegram.ui.gf;
import org.telegram.ui.qh;
import org.telegram.ui.qo;
import org.telegram.ui.rq;
import org.telegram.ui.yo;
import org.telegram.ui.yp;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class o2 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o2(int i10, Object obj, Object obj2) {
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
                AndroidUtilities.runOnUIThread(new a3.k0((p2) this.b, (String) this.c, tLObject, 4));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new a3.k0((o4) this.b, tLObject, (MessagesController) this.c, 7));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new a3.k0((kb) this.b, tLObject, (MessagesController) this.c, 10));
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new a3.k0((boolean[]) this.b, tLObject, (di.y1) this.c, 15));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new a3.k0((di.h4) this.b, tLObject, (org.telegram.ui.ActionBar.d2) this.c, 18));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((fg.c) this.b, tL_error, (String) this.c, tLObject, 8));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new a3.k0((fg.l1) this.b, (String) this.c, tLObject, 23));
                break;
            case 7:
                fg.f2 f2Var = (fg.f2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                if (tLObject instanceof TLRPC.TL_messages_foundStickerSets) {
                    AndroidUtilities.runOnUIThread(new a3.k0(f2Var, tL_messages_searchStickerSets, (TLRPC.TL_messages_foundStickerSets) tLObject, 26));
                    break;
                }
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new a3.k0((gg.b0) this.b, tLObject, (TL_account.TL_businessChatLink) this.c, 29));
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new fg.s1(3, (gg.p0) this.b, (org.telegram.ui.Components.zd) this.c));
                break;
            case 10:
                AndroidUtilities.runOnUIThread(new gg.a0((gg.o2) this.b, tLObject, (SharedPreferences) this.c, 4));
                break;
            case 11:
                VoIPPreNotificationService.lambda$acknowledge$3((Context) this.b, (Runnable) this.c, tLObject, tL_error);
                break;
            case 12:
                ((VoIPService) this.b).lambda$startGroupCheckShortpoll$64((TL_phone.checkGroupCall) this.c, tLObject, tL_error);
                break;
            case 13:
                ((VoIPService) this.b).lambda$startOutgoingCall$10((byte[]) this.c, tLObject, tL_error);
                break;
            case 14:
                ((VoIPService) this.b).lambda$startConferenceGroupCall$32((AccountInstance) this.c, tLObject, tL_error);
                break;
            case 15:
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
                            AndroidUtilities.runOnUIThread(new c1(e6Var, arrayList4, z10, 10));
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
            case 16:
                AndroidUtilities.runOnUIThread(new gg.a0((org.telegram.ui.ActionBar.i6) this.b, tLObject, (org.telegram.ui.ActionBar.i6) this.c, 25));
                break;
            case 17:
                AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b((org.telegram.ui.h8) this.b, tL_error, tLObject, (Calendar) this.c, 29));
                break;
            case 18:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((org.telegram.ui.ad) this.b, tLObject, (org.telegram.ui.ActionBar.i6) this.c, 10));
                break;
            case 19:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((org.telegram.ui.le) this.b, tLObject, (Context) this.c, 12));
                break;
            case 20:
                eo eoVar = (eo) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    AndroidUtilities.runOnUIThread(new gf(eoVar, !messages_messages.messages.isEmpty() ? ((TLRPC.messages_Messages) tLObject2).offset_id_offset - messages_messages.offset_id_offset : ((TLRPC.messages_Messages) tLObject2).offset_id_offset, 5));
                    break;
                }
                break;
            case 21:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((eo) this.b, tLObject, (TLRPC.User) this.c, 20));
                break;
            case 22:
                eo eoVar2 = (eo) this.b;
                TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = (TLRPC.TL_messages_sendScheduledMessages) this.c;
                if (tL_error != null) {
                    if (tL_error.text != null) {
                        AndroidUtilities.runOnUIThread(new qh(2, eoVar2, tL_error));
                        break;
                    }
                } else {
                    eoVar2.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(new qh(1, eoVar2, tL_messages_sendScheduledMessages));
                    break;
                }
                break;
            case 23:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((eo) this.b, tLObject, tL_error, (MessagesStorage) this.c, 5));
                break;
            case 24:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.s1((fm) this.b, tLObject, (MessageObject) this.c, 23));
                break;
            case 25:
                yo yoVar = (yo) this.b;
                TL_bots.setBotInfo setbotinfo = (TL_bots.setBotInfo) this.c;
                TLRPC.UserFull userFull = yoVar.E0;
                if (userFull != null) {
                    userFull.about = setbotinfo.about;
                    yoVar.getMessagesStorage().updateUserInfo(yoVar.E0, false);
                }
                AndroidUtilities.runOnUIThread(new qo(yoVar, 2));
                break;
            case 26:
                AndroidUtilities.runOnUIThread(new qh(14, (yp) this.b, (org.telegram.ui.ActionBar.d2[]) this.c));
                break;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.da((rq) this.b, tL_error, tLObject, (TwoStepVerificationActivity) this.c, false, 8));
                break;
            case 28:
                org.telegram.ui.Components.l5 l5Var = (org.telegram.ui.Components.l5) this.b;
                NotificationCenter.getInstance(l5Var.e).doOnIdle(new org.telegram.ui.Components.k5(l5Var, (ArrayList) this.c, tLObject, 0));
                break;
            default:
                AndroidUtilities.runOnUIThread(new gg.a0((org.telegram.ui.Components.j8) this.b, (org.telegram.ui.ActionBar.d2) this.c, tLObject, 29));
                break;
        }
    }
}
