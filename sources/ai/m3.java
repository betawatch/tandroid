package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import ci.zc;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.iy0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.n31;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.z81;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bd;
import org.telegram.ui.i60;
import org.telegram.ui.ip;
import org.telegram.ui.ln;
import org.telegram.ui.md;
import org.telegram.ui.nq;
import org.telegram.ui.rr;
import org.telegram.ui.sr;
import org.telegram.ui.st;
import org.telegram.ui.uo;
import org.telegram.ui.uy;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m3(f6 f6Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, ci.ga gaVar) {
        this.a = 1;
        this.c = f6Var;
        this.b = runnable;
        this.d = tL_error;
        this.e = storyItem;
        this.f = gaVar;
    }

    private final void a() {
        i60.A((i60) this.c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.e, (TL_phone.exportGroupCallInvite) this.f, (TLRPC.TL_error) this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0a23  */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Integer] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        ArrayList arrayList;
        int i10;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        long j3;
        f6 f6Var;
        ic icVar;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i11;
        int i12;
        String str;
        int i13 = 2;
        int i14 = 4;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        int i15 = 1;
        int i16 = 0;
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.c;
                b0 b0Var = (b0) this.d;
                Long l4 = (Long) this.e;
                ci.oc ocVar = (ci.oc) this.f;
                Runnable runnable = (Runnable) this.b;
                if (a0Var == null) {
                    a0Var = b0Var.e(l4.longValue());
                }
                ocVar.Y(ci.jc.c(a0Var));
                runnable.run();
                break;
            case 1:
                f6 f6Var3 = (f6) this.c;
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                ci.ga gaVar = (ci.ga) this.f;
                org.telegram.ui.ActionBar.f6 f6Var4 = f6Var3.B0;
                a5 a5Var = f6Var3.c1;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error == null || "STORY_NOT_MODIFIED".equals(tL_error.text)) {
                    storyItem.parsedPrivacy = gaVar;
                    ArrayList arrayList2 = gaVar.b;
                    int i17 = gaVar.a;
                    ArrayList arrayList3 = gaVar.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList4 = new ArrayList<>();
                    while (i16 < arrayList2.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(i16);
                        if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowAll) {
                            arrayList4.add(new TLRPC.TL_privacyValueAllowAll());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowCloseFriends) {
                            arrayList4.add(new TLRPC.TL_privacyValueAllowCloseFriends());
                        } else if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowContacts) {
                            arrayList4.add(new TLRPC.TL_privacyValueAllowContacts());
                        } else {
                            if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueDisallowUsers) {
                                TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = (TLRPC.TL_inputPrivacyValueDisallowUsers) inputPrivacyRule;
                                TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = new TLRPC.TL_privacyValueDisallowUsers();
                                int i18 = 0;
                                while (i18 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i18 = com.google.android.gms.internal.vision.e2.g(tL_inputPrivacyValueDisallowUsers.users.get(i18).user_id, tL_privacyValueDisallowUsers.users, i18, 1);
                                    i16 = i16;
                                    arrayList2 = arrayList2;
                                }
                                arrayList = arrayList2;
                                i10 = i16;
                                arrayList4.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList2;
                                i10 = i16;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i19 = 0; i19 < tL_inputPrivacyValueAllowUsers.users.size(); i19 = com.google.android.gms.internal.vision.e2.g(tL_inputPrivacyValueAllowUsers.users.get(i19).user_id, tL_privacyValueAllowUsers.users, i19, 1)) {
                                    }
                                    arrayList4.add(tL_privacyValueAllowUsers);
                                    i16 = i10 + 1;
                                    arrayList2 = arrayList;
                                }
                            }
                            i16 = i10 + 1;
                            arrayList2 = arrayList;
                        }
                        arrayList = arrayList2;
                        i10 = i16;
                        i16 = i10 + 1;
                        arrayList2 = arrayList;
                    }
                    storyItem.privacy = arrayList4;
                    storyItem.close_friends = i17 == 1;
                    storyItem.contacts = i17 == 2;
                    storyItem.selected_contacts = i17 == 3;
                    MessagesController.getInstance(f6Var3.C2).getStoriesController().p0(storyItem.dialogId, storyItem, true);
                    f6Var3.b4 = true;
                    if (i17 == 4) {
                        new xc(a5Var, f6Var4).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i17 == 1) {
                        new xc(a5Var, f6Var4).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else if (i17 != 2) {
                        if (i17 == 3) {
                            HashSet hashSet = new HashSet();
                            hashSet.addAll(arrayList3);
                            Iterator it = gaVar.d.values().iterator();
                            while (it.hasNext()) {
                                hashSet.addAll((ArrayList) it.next());
                            }
                            z10 = false;
                            new xc(a5Var, f6Var4).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                            f6Var3.f1(z10);
                            break;
                        }
                    } else if (arrayList3.isEmpty()) {
                        new xc(a5Var, f6Var4).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                    } else {
                        new xc(a5Var, f6Var4).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList3.size(), new Object[0])).j();
                    }
                } else {
                    org.telegram.messenger.l0.o(R.string.UnknownError, new xc(a5Var, f6Var4), R.raw.error, 36);
                }
                z10 = false;
                f6Var3.f1(z10);
                break;
            case 2:
                w5 w5Var = (w5) this.c;
                Activity activity = (Activity) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                jc jcVar = (jc) this.f;
                c6 c6Var = (c6) this.b;
                ci.oc E = ci.oc.E(activity, w5Var.l.C2);
                e6 e6Var = w5Var.l.M2;
                long j10 = (e6Var == null || (icVar = (ic) e6Var.c) == null) ? 0L : icVar.currentPosition;
                ci.o8 n10 = ci.o8.n(w5Var.l.O1.h(), w5Var.l.O1.a);
                f6 f6Var5 = w5Var.l;
                n10.e = f6Var5.B1;
                TL_stories.StoryItem storyItem3 = f6Var5.O1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i20 = 0;
                    while (true) {
                        if (i20 < document.attributes.size()) {
                            if (document.attributes.get(i20) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i20);
                            } else {
                                i20++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j3 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j3;
                        ci.o8 g10 = n10.g();
                        g10.b0 = true;
                        f6Var = w5Var.l;
                        TL_stories.StoryItem storyItem4 = f6Var.O1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new d5(w5Var, storyItem4, storyItem2, i15);
                        if (f6Var.I0()) {
                            f6 f6Var6 = w5Var.l;
                            g10.J0 = f6Var6.B1;
                            g10.L0 = MessagesController.toInputMedia(f6Var6.O1.a.media);
                            d9 d9Var = jcVar.O0;
                            if (d9Var instanceof t8) {
                                g10.K0 = ((t8) d9Var).E;
                            }
                        }
                        E.S(ci.jc.d(jcVar), g10, j10);
                        E.Q = new n5(w5Var, i13);
                        E.R = new q5(w5Var, c6Var, i16);
                        break;
                    }
                }
                j3 = 0;
                n10.e0 = j3;
                ci.o8 g102 = n10.g();
                g102.b0 = true;
                f6Var = w5Var.l;
                TL_stories.StoryItem storyItem42 = f6Var.O1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new d5(w5Var, storyItem42, storyItem2, i15);
                if (f6Var.I0()) {
                }
                E.S(ci.jc.d(jcVar), g102, j10);
                E.Q = new n5(w5Var, i13);
                E.R = new q5(w5Var, c6Var, i16);
                break;
            case 3:
                s6 s6Var = (s6) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                org.telegram.ui.Cells.p6 p6Var = (org.telegram.ui.Cells.p6) this.f;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.b;
                ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                arrayList5.add(user);
                j7 j7Var = s6Var.b;
                ContactsController.getInstance(j7Var.v).deleteContact(arrayList5, false);
                hg.k0.q(R.string.DeletedFromYourContacts, new Object[]{str2}, new xc(j7Var, j7Var.s), R.raw.ic_ban, 36);
                p6Var.a(j7Var.d(storyView) ? 1.0f : 0.5f, true);
                break;
            case 4:
                ci.ba baVar = (ci.ba) this.c;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
                TLObject tLObject = (TLObject) this.e;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                ci.ia iaVar = baVar.W;
                b2Var.dismiss();
                if (tLObject instanceof TL_phone.groupCallStreamRtmpUrl) {
                    mr[] mrVarArr = new mr[1];
                    Context context = baVar.getContext();
                    i11 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                    mr mrVar = new mr(context, i11, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject, iaVar.L ? null : new ci.m2(5, baVar, mrVarArr), new d());
                    mrVarArr[0] = mrVar;
                    mrVar.show();
                    break;
                } else if (tL_error2 != null) {
                    org.telegram.ui.ActionBar.d3 d3Var = iaVar.container;
                    f6Var2 = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
                    new xc(d3Var, f6Var2).d0(tL_error2, true);
                    break;
                }
                break;
            case 5:
                zc.a((zc) this.c, (ViewGroup) this.d, (org.telegram.ui.ActionBar.f6) this.e, (org.telegram.ui.Components.ia) this.f, (View) this.b);
                break;
            case 6:
                gg.e2 e2Var = (gg.e2) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                LongSparseArray longSparseArray = (LongSparseArray) this.b;
                e2Var.getClass();
                String str3 = tL_messages_getStickers.emoticon;
                gg.g2 g2Var = e2Var.a;
                if (str3.equals(g2Var.R)) {
                    g2Var.O = 0;
                    if (tLObject2 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject2;
                        int size = arrayList6.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        while (i16 < size2) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i16);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList6.add(document2);
                            }
                            i16++;
                        }
                        if (size != arrayList6.size()) {
                            g2Var.I.put(arrayList6, g2Var.R);
                            if (size == 0) {
                                g2Var.J.add(arrayList6);
                            }
                            g2Var.l();
                            break;
                        }
                    }
                }
                break;
            case 7:
                hg.b2 b2Var2 = (hg.b2) this.c;
                ArrayList<TLRPC.User> arrayList7 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f;
                Runnable runnable3 = (Runnable) this.b;
                b2Var2.e = false;
                int i21 = b2Var2.a;
                MessagesController.getInstance(i21).putUsers(arrayList7, true);
                MessagesController.getInstance(i21).putChats(arrayList8, true);
                ArrayList arrayList10 = b2Var2.b;
                arrayList10.clear();
                arrayList10.addAll(arrayList9);
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    b2Var2.i(null, false);
                }
                NotificationCenter.getInstance(i21).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 8:
                hg.b2 b2Var3 = (hg.b2) this.c;
                ArrayList<TLRPC.User> arrayList11 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList12 = (ArrayList) this.e;
                hg.a2 a2Var = (hg.a2) this.f;
                MessageObject messageObject = (MessageObject) this.b;
                int i22 = b2Var3.a;
                MessagesController.getInstance(i22).putUsers(arrayList11, true);
                MessagesController.getInstance(i22).putChats(arrayList12, true);
                a2Var.e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(a2Var.b, a2Var.a);
                }
                b2Var3.l();
                NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 9:
                hg.b2 b2Var4 = (hg.b2) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                ArrayList<Integer> arrayList13 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                b2Var4.getClass();
                if (tLObject3 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList14 = ((TLRPC.TL_messages_messages) tLObject3).messages;
                    arrayList13.clear();
                    int size3 = arrayList14.size();
                    int i23 = 0;
                    while (i23 < size3) {
                        TLRPC.Message message = arrayList14.get(i23);
                        i23++;
                        arrayList13.add(Integer.valueOf(message.id));
                    }
                    tL_messages_sendQuickReplyMessages.id = arrayList13;
                    while (i16 < arrayList13.size()) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i16++;
                    }
                    ConnectionsManager.getInstance(b2Var4.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    break;
                } else {
                    FileLog.e("received " + tLObject3 + " " + tL_error3 + " on getQuickReplyMessages when trying to send quick reply");
                    break;
                }
            case 10:
                ((m4.d) this.d).run().a(new i5((oi.f) this.c, (AtomicBoolean) this.e, (m4.e) this.f, (AtomicBoolean) this.b, 20), i9.q.a);
                break;
            case 11:
                ((CameraController) this.c).lambda$open$10((CameraSession) this.d, (Runnable) this.b, (SurfaceTexture) this.e, (Runnable) this.f);
                break;
            case 12:
                org.telegram.ui.t7 t7Var = (org.telegram.ui.t7) this.c;
                zh.a aVar = (zh.a) this.d;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.e;
                String str4 = (String) this.f;
                String str5 = (String) this.b;
                t7Var.getClass();
                aVar.e.b = false;
                tL_documentAttributeAudio.title = str4;
                tL_documentAttributeAudio.performer = str5;
                z81 z81Var = t7Var.h;
                for (int i24 = 0; i24 < z81Var.getViewPages().length; i24++) {
                    yl0 yl0Var = (yl0) z81Var.getViewPages()[i24];
                    if (yl0Var != null && ((org.telegram.ui.g7) yl0Var.getAdapter()).d == 3) {
                        org.telegram.ui.g7 g7Var = (org.telegram.ui.g7) yl0Var.getAdapter();
                        int i25 = 0;
                        while (true) {
                            if (i25 >= g7Var.e.size()) {
                                break;
                            } else if (((org.telegram.ui.n7) g7Var.e.get(i25)).d == aVar) {
                                g7Var.m(i25);
                            } else {
                                i25++;
                            }
                        }
                    }
                }
                break;
            case 13:
                org.telegram.ui.ra raVar = (org.telegram.ui.ra) this.c;
                String str6 = (String) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                TLObject tLObject4 = (TLObject) this.f;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.b;
                raVar.e = 0;
                String str7 = raVar.f;
                if (str7 != null && str7.equals(str6)) {
                    if (tL_error4 != null || !(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                        if (raVar.G != null) {
                            if (tL_error4 != null && "USERNAME_INVALID".equals(tL_error4.text) && checkusername.username.length() == 4) {
                                raVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                                org.telegram.ui.Cells.y1 y1Var = raVar.G;
                                int i26 = org.telegram.ui.ActionBar.j6.p7;
                                y1Var.setTag(Integer.valueOf(i26));
                                raVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i26, false));
                            } else if (tL_error4 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error4.text)) {
                                raVar.G.setText(LocaleController.getString(R.string.UsernameInUse));
                                org.telegram.ui.Cells.y1 y1Var2 = raVar.G;
                                int i27 = org.telegram.ui.ActionBar.j6.p7;
                                y1Var2.setTag(Integer.valueOf(i27));
                                raVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i27, false));
                            } else {
                                if (checkusername.username.length() == 4) {
                                    raVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                                } else {
                                    raVar.G.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                                }
                                org.telegram.ui.Cells.y1 y1Var3 = raVar.G;
                                int i28 = org.telegram.ui.ActionBar.j6.F6;
                                y1Var3.setTag(Integer.valueOf(i28));
                                raVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i28, false));
                            }
                            org.telegram.ui.qa qaVar = raVar.F;
                            if (qaVar != null) {
                                org.telegram.ui.qa.a(qaVar);
                                break;
                            }
                        }
                    } else {
                        org.telegram.ui.Cells.y1 y1Var4 = raVar.G;
                        if (y1Var4 != null) {
                            y1Var4.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str6));
                            org.telegram.ui.Cells.y1 y1Var5 = raVar.G;
                            int i29 = org.telegram.ui.ActionBar.j6.w6;
                            y1Var5.setTag(Integer.valueOf(i29));
                            raVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i29, false));
                            org.telegram.ui.qa qaVar2 = raVar.F;
                            if (qaVar2 != null) {
                                org.telegram.ui.qa.a(qaVar2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 14:
                org.telegram.ui.pb pbVar = (org.telegram.ui.pb) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.e;
                boolean[] zArr = (boolean[]) this.f;
                org.telegram.ui.ActionBar.b2 b2Var5 = (org.telegram.ui.ActionBar.b2) this.b;
                org.telegram.ui.vb vbVar = pbVar.a.n;
                vbVar.A0 = false;
                vbVar.y0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (!zArr[0]) {
                    b2Var5.dismiss();
                    if (tL_messages_exportedChatInvite != null) {
                        org.telegram.ui.vb.A0(vbVar, tL_messages_exportedChatInvite, vbVar.z0);
                        break;
                    } else {
                        org.telegram.messenger.l0.o(R.string.LinkHashExpired, xc.a0(vbVar), R.raw.linkbroken, 36);
                        break;
                    }
                }
                break;
            case 15:
                bd bdVar = (bd) this.c;
                boolean[] zArr2 = (boolean[]) this.d;
                int[] iArr = (int[]) this.e;
                int[] iArr2 = (int[]) this.f;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                if (!zArr2[0] && (i12 = iArr[0]) < iArr2[0]) {
                    if (tL_error5 != null) {
                        zArr2[0] = true;
                        if ("BOOSTS_REQUIRED".equals(tL_error5.text)) {
                            bdVar.getMessagesController().getBoostsController().userCanBoostChannel(bdVar.a, bdVar.c, new org.telegram.ui.hc(bdVar, i16));
                            break;
                        } else {
                            bdVar.P.setLoading(false);
                            hg.k0.q(R.string.UnknownErrorCode, new Object[]{tL_error5.text}, xc.a0(bdVar), R.raw.error, 36);
                            break;
                        }
                    } else {
                        int i30 = i12 + 1;
                        iArr[0] = i30;
                        if (i30 == iArr2[0]) {
                            bdVar.finishFragment();
                            org.telegram.ui.ActionBar.n2 n2Var = bdVar.l0;
                            if (n2Var != null) {
                                if (n2Var instanceof uo) {
                                    ((uo) n2Var).o0();
                                }
                                org.telegram.messenger.l0.o(bdVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, xc.a0(bdVar.l0), R.raw.contact_check, 36);
                                bdVar.l0 = null;
                            }
                            bdVar.P.setLoading(false);
                            break;
                        }
                    }
                }
                break;
            case 16:
                md mdVar = (md) this.c;
                String str8 = (String) this.d;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.f;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.b;
                mdVar.W = 0;
                String str9 = mdVar.X;
                if (str9 != null && str9.equals(str8)) {
                    if (tL_error6 != null || !(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error6 != null && "USERNAME_INVALID".equals(tL_error6.text) && tL_channels_checkUsername.username.length() == 4) {
                            mdVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                            mdVar.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                        } else if (tL_error6 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error6.text)) {
                            if (tL_channels_checkUsername.username.length() == 4) {
                                mdVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                            } else {
                                mdVar.U.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                            }
                            mdVar.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F6, false));
                        } else if (tL_error6 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error6.text)) {
                            mdVar.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                            mdVar.U.setText(LocaleController.getString(R.string.LinkInUse));
                        } else {
                            mdVar.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                            mdVar.j0 = false;
                            mdVar.f0();
                        }
                        mdVar.Z = false;
                        break;
                    } else {
                        mdVar.U.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str8));
                        org.telegram.ui.Cells.y1 y1Var6 = mdVar.U;
                        int i31 = org.telegram.ui.ActionBar.j6.w6;
                        y1Var6.setTag(Integer.valueOf(i31));
                        mdVar.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i31, false));
                        mdVar.Z = true;
                        break;
                    }
                }
                break;
            case 17:
                zn znVar = (zn) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                ImageView imageView = (ImageView) this.f;
                ImageView imageView2 = (ImageView) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    long[] jArr = {-1};
                    org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(jArr, zArr4, imageView, imageView2, 7);
                    TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                    tL_messages_rateTranscribedAudio.msg_id = znVar.d5.getId();
                    tL_messages_rateTranscribedAudio.peer = znVar.getMessagesController().getInputPeer(znVar.d5.messageOwner.peer_id);
                    tL_messages_rateTranscribedAudio.transcription_id = znVar.d5.messageOwner.voiceTranscriptionId;
                    tL_messages_rateTranscribedAudio.good = zArr4[0];
                    znVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.ba(znVar, n5Var, jArr, i14));
                    AndroidUtilities.runOnUIThread(n5Var, 150L);
                    break;
                }
                break;
            case 18:
                ln lnVar = (ln) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.e;
                MessageObject messageObject2 = (MessageObject) this.f;
                org.telegram.ui.r5 r5Var = (org.telegram.ui.r5) this.b;
                zn znVar2 = lnVar.a;
                if (message2.suggested_post.schedule_date == 0) {
                    b2VarArr[0].setOnDismissListener(null);
                    org.telegram.ui.ActionBar.f3 f3Var = org.telegram.ui.Components.d5.T(znVar2.getParentActivity(), 0L, new org.telegram.ui.l4(11, lnVar, messageObject2), znVar2.getResourceProvider(), 1).a;
                    f3Var.show();
                    f3Var.setOnDismissListener(r5Var);
                    break;
                } else {
                    znVar2.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject2.messageOwner.peer_id), messageObject2.messageOwner.id, 0);
                    break;
                }
            case 19:
                ip ipVar = (ip) this.c;
                String str10 = (String) this.d;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.e;
                TLObject tLObject6 = (TLObject) this.f;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername2 = (TLRPC.TL_channels_checkUsername) this.b;
                ipVar.h0 = 0;
                String str11 = ipVar.i0;
                if (str11 != null && str11.equals(str10)) {
                    if (tL_error7 != null || !(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error7 != null && "USERNAME_INVALID".equals(tL_error7.text) && tL_channels_checkUsername2.username.length() == 4) {
                            ipVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                            ipVar.f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                        } else if (tL_error7 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error7.text)) {
                            if (tL_channels_checkUsername2.username.length() == 4) {
                                ipVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                            } else {
                                ipVar.f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                            }
                            ipVar.f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F6, false));
                        } else if (tL_error7 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error7.text)) {
                            ipVar.f.setText(LocaleController.getString(R.string.LinkInUse));
                            ipVar.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.p7);
                        } else {
                            ipVar.c0 = false;
                            ipVar.Z();
                        }
                        ipVar.k0 = false;
                        break;
                    } else {
                        ipVar.f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str10));
                        ipVar.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.w6);
                        ipVar.k0 = true;
                        break;
                    }
                }
                break;
            case 20:
                nq.Y((nq) this.c, (TLRPC.TL_error) this.d, (TLRPC.InputCheckPasswordSRP) this.e, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.b);
                break;
            case 21:
                rr rrVar = (rr) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                a0.i iVar = (a0.i) this.e;
                ArrayList arrayList16 = (ArrayList) this.f;
                ArrayList arrayList17 = (ArrayList) this.b;
                gg.c2 c2Var = rrVar.h;
                sr srVar = rrVar.y;
                if (srVar.o1) {
                    rrVar.s = false;
                    rrVar.d = arrayList15;
                    rrVar.e = iVar;
                    rrVar.f = arrayList16;
                    c2Var.f(arrayList15, null);
                    if (!ChatObject.isChannel(srVar.r)) {
                        ArrayList arrayList18 = c2Var.g;
                        arrayList18.clear();
                        arrayList18.addAll(arrayList17);
                    }
                    int i32 = rrVar.r;
                    rrVar.l();
                    if (rrVar.r > i32) {
                        srVar.y0(i32);
                    }
                    if (!c2Var.e() && rrVar.r == 0) {
                        srVar.b.e(false, true);
                        break;
                    }
                }
                break;
            case 22:
                View view = (View) this.c;
                View view2 = (View) this.d;
                WindowManager windowManager = (WindowManager) this.e;
                View view3 = (View) this.f;
                View view4 = (View) this.b;
                view.setVisibility(8);
                view2.setVisibility(8);
                windowManager.removeView(view);
                windowManager.removeView(view2);
                windowManager.removeView(view3);
                windowManager.removeView(view4);
                break;
            case 23:
                iy0 iy0Var = (iy0) this.c;
                String str12 = (String) this.d;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.e;
                TLObject tLObject7 = (TLObject) this.f;
                TextView textView = (TextView) this.b;
                iy0Var.p0 = 0;
                String str13 = iy0Var.o0;
                if (str13 != null && str13.equals(str12)) {
                    if (tL_error8 != null || !(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
                        textView.setTextColor(iy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                        iy0Var.q0 = false;
                        break;
                    } else {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                        textView.setTextColor(iy0Var.getThemedColor(org.telegram.ui.ActionBar.j6.w6));
                        iy0Var.q0 = true;
                        break;
                    }
                }
                break;
            case 24:
                uy0 uy0Var = (uy0) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                        org.telegram.ui.Components.pc M = xc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
                        M.j = 5000;
                        M.j();
                        break;
                    } else {
                        if (userFull != null) {
                            if (tL_birthday == null) {
                                userFull.flags2 &= -33;
                            } else {
                                userFull.flags2 |= 32;
                            }
                            userFull.birthday = tL_birthday;
                            MessagesStorage.getInstance(uy0Var.a).updateUserInfo(userFull, false);
                        }
                        if (tL_error9 != null && (str = tL_error9.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(uy0Var.b.getContext());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            org.telegram.messenger.l0.n(R.string.OK, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.l0.o(R.string.UnknownError, xc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 25:
                n31 n31Var = (n31) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                y70 y70Var = (y70) this.f;
                y70 y70Var2 = (y70) this.b;
                zn znVar3 = n31Var.h;
                if (messagesController.isDialogMuted(n31Var.c, tL_forumTopic.id)) {
                    y70Var.u();
                    NotificationsController.getInstance(n31Var.b).muteDialog(n31Var.c, tL_forumTopic.id, false);
                    if (xc.a(znVar3)) {
                        xc.z(znVar3, 4, 0, n31Var.d).j();
                        break;
                    }
                } else {
                    y70Var.K(y70Var2);
                    break;
                }
                break;
            case 26:
                st stVar = (st) this.c;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                ArrayList arrayList19 = (ArrayList) this.f;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) this.b;
                if (tL_error10 == null && (tLObject9 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject9;
                    ArrayList<TLRPC.StickerSetCovered> arrayList20 = tL_messages_myStickers.sets;
                    int size4 = arrayList20.size();
                    while (i16 < size4) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList20.get(i16);
                        i16++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(stVar.r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList19.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) hg.k0.g(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(stVar.r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.ba(stVar, arrayList19, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 27:
                uy.I0((uy) this.c, (TLObject) this.d, (TLRPC.UserFull) this.e, (TL_account.TL_birthday) this.f, (TLRPC.TL_error) this.b);
                break;
            case 28:
                a();
                break;
            default:
                i60.x((i60) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (String) this.b);
                break;
        }
    }

    public /* synthetic */ m3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public /* synthetic */ m3(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.a = 11;
        this.c = cameraController;
        this.d = cameraSession;
        this.b = runnable;
        this.e = surfaceTexture;
        this.f = runnable2;
    }
}
