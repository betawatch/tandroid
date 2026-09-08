package bi;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import di.kc;
import di.pc;
import di.zc;
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
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.i81;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.bd;
import org.telegram.ui.co;
import org.telegram.ui.gc;
import org.telegram.ui.j60;
import org.telegram.ui.lp;
import org.telegram.ui.md;
import org.telegram.ui.on;
import org.telegram.ui.qq;
import org.telegram.ui.st;
import org.telegram.ui.ur;
import org.telegram.ui.uy;
import org.telegram.ui.vr;
import org.telegram.ui.xo;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final /* synthetic */ class z2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z2(o5 o5Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, di.ga gaVar) {
        this.a = 1;
        this.c = o5Var;
        this.b = runnable;
        this.d = tL_error;
        this.e = storyItem;
        this.f = gaVar;
    }

    private final void a() {
        j60.B((j60) this.c, (org.telegram.ui.ActionBar.b2) this.d, (TLObject) this.e, (TL_phone.exportGroupCallInvite) this.f, (TLRPC.TL_error) this.b);
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
        o5 o5Var;
        ob obVar;
        org.telegram.ui.ActionBar.f6 f6Var;
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
                u uVar = (u) this.c;
                v vVar = (v) this.d;
                Long l4 = (Long) this.e;
                pc pcVar = (pc) this.f;
                Runnable runnable = (Runnable) this.b;
                if (uVar == null) {
                    uVar = vVar.e(l4.longValue());
                }
                pcVar.Y(kc.c(uVar));
                runnable.run();
                break;
            case 1:
                o5 o5Var2 = (o5) this.c;
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                di.ga gaVar = (di.ga) this.f;
                org.telegram.ui.ActionBar.f6 f6Var2 = o5Var2.B0;
                l4 l4Var = o5Var2.c1;
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
                    MessagesController.getInstance(o5Var2.C2).getStoriesController().p0(storyItem.dialogId, storyItem, true);
                    o5Var2.b4 = true;
                    if (i17 == 4) {
                        new yc(l4Var, f6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i17 == 1) {
                        new yc(l4Var, f6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else if (i17 != 2) {
                        if (i17 == 3) {
                            HashSet hashSet = new HashSet();
                            hashSet.addAll(arrayList3);
                            Iterator it = gaVar.d.values().iterator();
                            while (it.hasNext()) {
                                hashSet.addAll((ArrayList) it.next());
                            }
                            z10 = false;
                            new yc(l4Var, f6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                            o5Var2.f1(z10);
                            break;
                        }
                    } else if (arrayList3.isEmpty()) {
                        new yc(l4Var, f6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                    } else {
                        new yc(l4Var, f6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList3.size(), new Object[0])).j();
                    }
                } else {
                    org.telegram.messenger.w1.o(R.string.UnknownError, new yc(l4Var, f6Var2), R.raw.error, 36);
                }
                z10 = false;
                o5Var2.f1(z10);
                break;
            case 2:
                f5 f5Var = (f5) this.c;
                Activity activity = (Activity) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                pb pbVar = (pb) this.f;
                l5 l5Var = (l5) this.b;
                pc E = pc.E(activity, f5Var.l.C2);
                n5 n5Var = f5Var.l.M2;
                long j10 = (n5Var == null || (obVar = (ob) n5Var.c) == null) ? 0L : obVar.currentPosition;
                di.o8 n10 = di.o8.n(f5Var.l.O1.h(), f5Var.l.O1.a);
                o5 o5Var3 = f5Var.l;
                n10.e = o5Var3.B1;
                TL_stories.StoryItem storyItem3 = o5Var3.O1.a;
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
                        di.o8 g10 = n10.g();
                        g10.b0 = true;
                        o5Var = f5Var.l;
                        TL_stories.StoryItem storyItem4 = o5Var.O1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new o4(f5Var, storyItem4, storyItem2, i15);
                        if (o5Var.I0()) {
                            o5 o5Var4 = f5Var.l;
                            g10.J0 = o5Var4.B1;
                            g10.L0 = MessagesController.toInputMedia(o5Var4.O1.a.media);
                            l8 l8Var = pbVar.O0;
                            if (l8Var instanceof b8) {
                                g10.K0 = ((b8) l8Var).E;
                            }
                        }
                        E.S(kc.d(pbVar), g10, j10);
                        E.Q = new x4(f5Var, i13);
                        E.R = new a5(f5Var, l5Var, i16);
                        break;
                    }
                }
                j3 = 0;
                n10.e0 = j3;
                di.o8 g102 = n10.g();
                g102.b0 = true;
                o5Var = f5Var.l;
                TL_stories.StoryItem storyItem42 = o5Var.O1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new o4(f5Var, storyItem42, storyItem2, i15);
                if (o5Var.I0()) {
                }
                E.S(kc.d(pbVar), g102, j10);
                E.Q = new x4(f5Var, i13);
                E.R = new a5(f5Var, l5Var, i16);
                break;
            case 3:
                b6 b6Var = (b6) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) this.f;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.b;
                ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                arrayList5.add(user);
                s6 s6Var = b6Var.b;
                ContactsController.getInstance(s6Var.v).deleteContact(arrayList5, false);
                i2.g.s(R.string.DeletedFromYourContacts, new Object[]{str2}, new yc(s6Var, s6Var.s), R.raw.ic_ban, 36);
                n6Var.a(s6Var.d(storyView) ? 1.0f : 0.5f, true);
                break;
            case 4:
                di.ba baVar = (di.ba) this.c;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.d;
                TLObject tLObject = (TLObject) this.e;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                di.ia iaVar = baVar.W;
                b2Var.dismiss();
                if (tLObject instanceof TL_phone.groupCallStreamRtmpUrl) {
                    lr[] lrVarArr = new lr[1];
                    Context context = baVar.getContext();
                    i11 = ((org.telegram.ui.ActionBar.f3) iaVar).currentAccount;
                    lr lrVar = new lr(context, i11, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject, iaVar.L ? null : new di.m2(5, baVar, lrVarArr), new b());
                    lrVarArr[0] = lrVar;
                    lrVar.show();
                    break;
                } else if (tL_error2 != null) {
                    org.telegram.ui.ActionBar.d3 d3Var = iaVar.container;
                    f6Var = ((org.telegram.ui.ActionBar.f3) iaVar).resourcesProvider;
                    new yc(d3Var, f6Var).d0(tL_error2, true);
                    break;
                }
                break;
            case 5:
                zc.a((zc) this.c, (ViewGroup) this.d, (org.telegram.ui.ActionBar.f6) this.e, (org.telegram.ui.Components.ja) this.f, (View) this.b);
                break;
            case 6:
                hg.d2 d2Var = (hg.d2) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                LongSparseArray longSparseArray = (LongSparseArray) this.b;
                d2Var.getClass();
                String str3 = tL_messages_getStickers.emoticon;
                hg.f2 f2Var = d2Var.a;
                if (str3.equals(f2Var.R)) {
                    f2Var.O = 0;
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
                            f2Var.I.put(arrayList6, f2Var.R);
                            if (size == 0) {
                                f2Var.J.add(arrayList6);
                            }
                            f2Var.l();
                            break;
                        }
                    }
                }
                break;
            case 7:
                ig.b2 b2Var2 = (ig.b2) this.c;
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
                ig.b2 b2Var3 = (ig.b2) this.c;
                ArrayList<TLRPC.User> arrayList11 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList12 = (ArrayList) this.e;
                ig.a2 a2Var = (ig.a2) this.f;
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
                ig.b2 b2Var4 = (ig.b2) this.c;
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
                ((m4.d) this.d).run().a(new androidx.car.app.utils.b((fg.f) this.c, (AtomicBoolean) this.e, (m4.e) this.f, (AtomicBoolean) this.b, 21), i9.q.a);
                break;
            case 11:
                ((CameraController) this.c).lambda$open$10((CameraSession) this.d, (Runnable) this.b, (SurfaceTexture) this.e, (Runnable) this.f);
                break;
            case 12:
                org.telegram.ui.s7 s7Var = (org.telegram.ui.s7) this.c;
                ai.b bVar = (ai.b) this.d;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.e;
                String str4 = (String) this.f;
                String str5 = (String) this.b;
                s7Var.getClass();
                bVar.e.b = false;
                tL_documentAttributeAudio.title = str4;
                tL_documentAttributeAudio.performer = str5;
                i81 i81Var = s7Var.h;
                for (int i24 = 0; i24 < i81Var.getViewPages().length; i24++) {
                    ll0 ll0Var = (ll0) i81Var.getViewPages()[i24];
                    if (ll0Var != null && ((org.telegram.ui.f7) ll0Var.getAdapter()).d == 3) {
                        org.telegram.ui.f7 f7Var = (org.telegram.ui.f7) ll0Var.getAdapter();
                        int i25 = 0;
                        while (true) {
                            if (i25 >= f7Var.e.size()) {
                                break;
                            } else if (((org.telegram.ui.m7) f7Var.e.get(i25)).d == bVar) {
                                f7Var.m(i25);
                            } else {
                                i25++;
                            }
                        }
                    }
                }
                break;
            case 13:
                org.telegram.ui.qa qaVar = (org.telegram.ui.qa) this.c;
                String str6 = (String) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                TLObject tLObject4 = (TLObject) this.f;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.b;
                qaVar.e = 0;
                String str7 = qaVar.f;
                if (str7 != null && str7.equals(str6)) {
                    if (tL_error4 != null || !(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                        if (qaVar.G != null) {
                            if (tL_error4 != null && "USERNAME_INVALID".equals(tL_error4.text) && checkusername.username.length() == 4) {
                                qaVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                                org.telegram.ui.Cells.x1 x1Var = qaVar.G;
                                int i26 = org.telegram.ui.ActionBar.j6.p7;
                                x1Var.setTag(Integer.valueOf(i26));
                                qaVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i26, false));
                            } else if (tL_error4 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error4.text)) {
                                qaVar.G.setText(LocaleController.getString(R.string.UsernameInUse));
                                org.telegram.ui.Cells.x1 x1Var2 = qaVar.G;
                                int i27 = org.telegram.ui.ActionBar.j6.p7;
                                x1Var2.setTag(Integer.valueOf(i27));
                                qaVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i27, false));
                            } else {
                                if (checkusername.username.length() == 4) {
                                    qaVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                                } else {
                                    qaVar.G.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                                }
                                org.telegram.ui.Cells.x1 x1Var3 = qaVar.G;
                                int i28 = org.telegram.ui.ActionBar.j6.F6;
                                x1Var3.setTag(Integer.valueOf(i28));
                                qaVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i28, false));
                            }
                            org.telegram.ui.pa paVar = qaVar.F;
                            if (paVar != null) {
                                org.telegram.ui.pa.a(paVar);
                                break;
                            }
                        }
                    } else {
                        org.telegram.ui.Cells.x1 x1Var4 = qaVar.G;
                        if (x1Var4 != null) {
                            x1Var4.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str6));
                            org.telegram.ui.Cells.x1 x1Var5 = qaVar.G;
                            int i29 = org.telegram.ui.ActionBar.j6.w6;
                            x1Var5.setTag(Integer.valueOf(i29));
                            qaVar.G.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i29, false));
                            org.telegram.ui.pa paVar2 = qaVar.F;
                            if (paVar2 != null) {
                                org.telegram.ui.pa.a(paVar2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 14:
                org.telegram.ui.ob obVar2 = (org.telegram.ui.ob) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.e;
                boolean[] zArr = (boolean[]) this.f;
                org.telegram.ui.ActionBar.b2 b2Var5 = (org.telegram.ui.ActionBar.b2) this.b;
                org.telegram.ui.ub ubVar = obVar2.a.n;
                ubVar.E0 = false;
                ubVar.C0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (!zArr[0]) {
                    b2Var5.dismiss();
                    if (tL_messages_exportedChatInvite != null) {
                        org.telegram.ui.ub.A0(ubVar, tL_messages_exportedChatInvite, ubVar.D0);
                        break;
                    } else {
                        org.telegram.messenger.w1.o(R.string.LinkHashExpired, yc.a0(ubVar), R.raw.linkbroken, 36);
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
                            bdVar.getMessagesController().getBoostsController().userCanBoostChannel(bdVar.a, bdVar.c, new gc(bdVar, i16));
                            break;
                        } else {
                            bdVar.P.setLoading(false);
                            i2.g.s(R.string.UnknownErrorCode, new Object[]{tL_error5.text}, yc.a0(bdVar), R.raw.error, 36);
                            break;
                        }
                    } else {
                        int i30 = i12 + 1;
                        iArr[0] = i30;
                        if (i30 == iArr2[0]) {
                            bdVar.finishFragment();
                            org.telegram.ui.ActionBar.n2 n2Var = bdVar.l0;
                            if (n2Var != null) {
                                if (n2Var instanceof xo) {
                                    ((xo) n2Var).o0();
                                }
                                org.telegram.messenger.w1.o(bdVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, yc.a0(bdVar.l0), R.raw.contact_check, 36);
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
                        org.telegram.ui.Cells.x1 x1Var6 = mdVar.U;
                        int i31 = org.telegram.ui.ActionBar.j6.w6;
                        x1Var6.setTag(Integer.valueOf(i31));
                        mdVar.U.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i31, false));
                        mdVar.Z = true;
                        break;
                    }
                }
                break;
            case 17:
                co coVar = (co) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                ImageView imageView = (ImageView) this.f;
                ImageView imageView2 = (ImageView) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    long[] jArr = {-1};
                    org.telegram.ui.ActionBar.n5 n5Var2 = new org.telegram.ui.ActionBar.n5(jArr, zArr4, imageView, imageView2, 7);
                    TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                    tL_messages_rateTranscribedAudio.msg_id = coVar.d5.getId();
                    tL_messages_rateTranscribedAudio.peer = coVar.getMessagesController().getInputPeer(coVar.d5.messageOwner.peer_id);
                    tL_messages_rateTranscribedAudio.transcription_id = coVar.d5.messageOwner.voiceTranscriptionId;
                    tL_messages_rateTranscribedAudio.good = zArr4[0];
                    coVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.aa(coVar, n5Var2, jArr, i14));
                    AndroidUtilities.runOnUIThread(n5Var2, 150L);
                    break;
                }
                break;
            case 18:
                on onVar = (on) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                org.telegram.ui.ActionBar.b2[] b2VarArr = (org.telegram.ui.ActionBar.b2[]) this.e;
                MessageObject messageObject2 = (MessageObject) this.f;
                org.telegram.ui.r5 r5Var = (org.telegram.ui.r5) this.b;
                co coVar2 = onVar.a;
                if (message2.suggested_post.schedule_date == 0) {
                    b2VarArr[0].setOnDismissListener(null);
                    org.telegram.ui.ActionBar.f3 f3Var = org.telegram.ui.Components.e5.T(coVar2.getParentActivity(), 0L, new org.telegram.ui.m4(11, onVar, messageObject2), coVar2.getResourceProvider(), 1).a;
                    f3Var.show();
                    f3Var.setOnDismissListener(r5Var);
                    break;
                } else {
                    coVar2.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject2.messageOwner.peer_id), messageObject2.messageOwner.id, 0);
                    break;
                }
            case 19:
                lp lpVar = (lp) this.c;
                String str10 = (String) this.d;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.e;
                TLObject tLObject6 = (TLObject) this.f;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername2 = (TLRPC.TL_channels_checkUsername) this.b;
                lpVar.h0 = 0;
                String str11 = lpVar.i0;
                if (str11 != null && str11.equals(str10)) {
                    if (tL_error7 != null || !(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error7 != null && "USERNAME_INVALID".equals(tL_error7.text) && tL_channels_checkUsername2.username.length() == 4) {
                            lpVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                            lpVar.f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.p7, false));
                        } else if (tL_error7 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error7.text)) {
                            if (tL_channels_checkUsername2.username.length() == 4) {
                                lpVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                            } else {
                                lpVar.f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                            }
                            lpVar.f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.F6, false));
                        } else if (tL_error7 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error7.text)) {
                            lpVar.f.setText(LocaleController.getString(R.string.LinkInUse));
                            lpVar.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.p7);
                        } else {
                            lpVar.c0 = false;
                            lpVar.Z();
                        }
                        lpVar.k0 = false;
                        break;
                    } else {
                        lpVar.f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str10));
                        lpVar.f.setTextColorByKey(org.telegram.ui.ActionBar.j6.w6);
                        lpVar.k0 = true;
                        break;
                    }
                }
                break;
            case 20:
                qq.Y((qq) this.c, (TLRPC.TL_error) this.d, (TLRPC.InputCheckPasswordSRP) this.e, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.b);
                break;
            case 21:
                ur urVar = (ur) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                a0.i iVar = (a0.i) this.e;
                ArrayList arrayList16 = (ArrayList) this.f;
                ArrayList arrayList17 = (ArrayList) this.b;
                hg.b2 b2Var6 = urVar.h;
                vr vrVar = urVar.y;
                if (vrVar.o1) {
                    urVar.s = false;
                    urVar.d = arrayList15;
                    urVar.e = iVar;
                    urVar.f = arrayList16;
                    b2Var6.f(arrayList15, null);
                    if (!ChatObject.isChannel(vrVar.r)) {
                        ArrayList arrayList18 = b2Var6.g;
                        arrayList18.clear();
                        arrayList18.addAll(arrayList17);
                    }
                    int i32 = urVar.r;
                    urVar.l();
                    if (urVar.r > i32) {
                        vrVar.y0(i32);
                    }
                    if (!b2Var6.e() && urVar.r == 0) {
                        vrVar.b.e(false, true);
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
                ux0 ux0Var = (ux0) this.c;
                String str12 = (String) this.d;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.e;
                TLObject tLObject7 = (TLObject) this.f;
                TextView textView = (TextView) this.b;
                ux0Var.p0 = 0;
                String str13 = ux0Var.o0;
                if (str13 != null && str13.equals(str12)) {
                    if (tL_error8 != null || !(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
                        textView.setTextColor(ux0Var.getThemedColor(org.telegram.ui.ActionBar.j6.p7));
                        ux0Var.q0 = false;
                        break;
                    } else {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                        textView.setTextColor(ux0Var.getThemedColor(org.telegram.ui.ActionBar.j6.w6));
                        ux0Var.q0 = true;
                        break;
                    }
                }
                break;
            case 24:
                gy0 gy0Var = (gy0) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                        qc M = yc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
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
                            MessagesStorage.getInstance(gy0Var.a).updateUserInfo(userFull, false);
                        }
                        if (tL_error9 != null && (str = tL_error9.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(gy0Var.b.getContext());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            i2.g.B(R.string.OK, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.w1.o(R.string.UnknownError, yc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 25:
                w21 w21Var = (w21) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                n70 n70Var = (n70) this.f;
                n70 n70Var2 = (n70) this.b;
                co coVar3 = w21Var.h;
                if (messagesController.isDialogMuted(w21Var.c, tL_forumTopic.id)) {
                    n70Var.u();
                    NotificationsController.getInstance(w21Var.b).muteDialog(w21Var.c, tL_forumTopic.id, false);
                    if (yc.a(coVar3)) {
                        yc.z(coVar3, 4, 0, w21Var.d).j();
                        break;
                    }
                } else {
                    n70Var.K(n70Var2);
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
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i2.g.h(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(stVar.r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.aa(stVar, arrayList19, tL_messages_getMyStickers, 7));
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
                j60.x((j60) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (String) this.b);
                break;
        }
    }

    public /* synthetic */ z2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public /* synthetic */ z2(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.a = 11;
        this.c = cameraController;
        this.d = cameraSession;
        this.b = runnable;
        this.e = surfaceTexture;
        this.f = runnable2;
    }
}
