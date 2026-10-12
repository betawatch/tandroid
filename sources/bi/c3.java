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
import di.fc;
import di.kc;
import di.uc;
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
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.y31;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fo;
import org.telegram.ui.hd;
import org.telegram.ui.lc;
import org.telegram.ui.n60;
import org.telegram.ui.np;
import org.telegram.ui.qn;
import org.telegram.ui.sd;
import org.telegram.ui.tq;
import org.telegram.ui.xr;
import org.telegram.ui.xt;
import org.telegram.ui.yr;
import org.telegram.ui.yy;
import org.telegram.ui.zo;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class c3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c3(q5 q5Var, Runnable runnable, TLRPC.TL_error tL_error, TL_stories.StoryItem storyItem, di.ca caVar) {
        this.a = 1;
        this.c = q5Var;
        this.b = runnable;
        this.d = tL_error;
        this.e = storyItem;
        this.f = caVar;
    }

    private final void a() {
        n60.D((n60) this.c, (org.telegram.ui.ActionBar.a2) this.d, (TLObject) this.e, (TL_phone.exportGroupCallInvite) this.f, (TLRPC.TL_error) this.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0a22  */
    /* JADX WARN: Type inference failed for: r7v36, types: [java.lang.Integer] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        ArrayList arrayList;
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Document document;
        long j10;
        q5 q5Var;
        rb rbVar;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i12;
        int i13;
        String str;
        int i14 = 2;
        int i15 = 4;
        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = null;
        int i16 = 1;
        int i17 = 0;
        switch (this.a) {
            case 0:
                u uVar = (u) this.c;
                v vVar = (v) this.d;
                Long l4 = (Long) this.e;
                kc kcVar = (kc) this.f;
                Runnable runnable = (Runnable) this.b;
                if (uVar == null) {
                    uVar = vVar.e(l4.longValue());
                }
                kcVar.X(fc.c(uVar));
                runnable.run();
                break;
            case 1:
                q5 q5Var2 = (q5) this.c;
                Runnable runnable2 = (Runnable) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.e;
                di.ca caVar = (di.ca) this.f;
                org.telegram.ui.ActionBar.c6 c6Var2 = q5Var2.B0;
                o4 o4Var = q5Var2.c1;
                if (runnable2 != null) {
                    runnable2.run();
                }
                if (tL_error == null || "STORY_NOT_MODIFIED".equals(tL_error.text)) {
                    storyItem.parsedPrivacy = caVar;
                    ArrayList arrayList2 = caVar.b;
                    int i18 = caVar.a;
                    ArrayList arrayList3 = caVar.c;
                    ArrayList<TLRPC.PrivacyRule> arrayList4 = new ArrayList<>();
                    while (i17 < arrayList2.size()) {
                        TLRPC.InputPrivacyRule inputPrivacyRule = (TLRPC.InputPrivacyRule) arrayList2.get(i17);
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
                                int i19 = 0;
                                while (i19 < tL_inputPrivacyValueDisallowUsers.users.size()) {
                                    i19 = com.google.android.gms.internal.play_billing.k3.h(tL_inputPrivacyValueDisallowUsers.users.get(i19).user_id, tL_privacyValueDisallowUsers.users, i19, 1);
                                    i17 = i17;
                                    arrayList2 = arrayList2;
                                }
                                arrayList = arrayList2;
                                i10 = i17;
                                arrayList4.add(tL_privacyValueDisallowUsers);
                            } else {
                                arrayList = arrayList2;
                                i10 = i17;
                                if (inputPrivacyRule instanceof TLRPC.TL_inputPrivacyValueAllowUsers) {
                                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = (TLRPC.TL_inputPrivacyValueAllowUsers) inputPrivacyRule;
                                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = new TLRPC.TL_privacyValueAllowUsers();
                                    for (int i20 = 0; i20 < tL_inputPrivacyValueAllowUsers.users.size(); i20 = com.google.android.gms.internal.play_billing.k3.h(tL_inputPrivacyValueAllowUsers.users.get(i20).user_id, tL_privacyValueAllowUsers.users, i20, 1)) {
                                    }
                                    i11 = 1;
                                    arrayList4.add(tL_privacyValueAllowUsers);
                                    i17 = i10 + 1;
                                    i16 = i11;
                                    arrayList2 = arrayList;
                                }
                            }
                            i11 = 1;
                            i17 = i10 + 1;
                            i16 = i11;
                            arrayList2 = arrayList;
                        }
                        arrayList = arrayList2;
                        i11 = i16;
                        i10 = i17;
                        i17 = i10 + 1;
                        i16 = i11;
                        arrayList2 = arrayList;
                    }
                    int i21 = i16;
                    storyItem.privacy = arrayList4;
                    storyItem.close_friends = i18 == i21;
                    storyItem.contacts = i18 == 2;
                    storyItem.selected_contacts = i18 == 3;
                    MessagesController.getInstance(q5Var2.C2).getStoriesController().p0(storyItem.dialogId, storyItem, true);
                    q5Var2.b4 = true;
                    if (i18 == 4) {
                        new zc(o4Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToEveryone")).j();
                    } else if (i18 == 1) {
                        new zc(o4Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToCloseFriends")).j();
                    } else if (i18 == 2) {
                        if (arrayList3.isEmpty()) {
                            new zc(o4Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.getString("StorySharedToAllContacts")).j();
                        } else {
                            new zc(o4Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToAllContactsExcluded", arrayList3.size(), new Object[0])).j();
                        }
                    } else if (i18 == 3) {
                        HashSet hashSet = new HashSet();
                        hashSet.addAll(arrayList3);
                        Iterator it = caVar.d.values().iterator();
                        while (it.hasNext()) {
                            hashSet.addAll((ArrayList) it.next());
                        }
                        z10 = false;
                        new zc(o4Var, c6Var2).Q(R.raw.contact_check, 36, LocaleController.formatPluralString("StorySharedToContacts", hashSet.size(), new Object[0])).j();
                    }
                    z10 = false;
                } else {
                    org.telegram.messenger.q.r(R.string.UnknownError, new zc(o4Var, c6Var2), R.raw.error, 36);
                    z10 = false;
                }
                q5Var2.f1(z10);
                break;
            case 2:
                h5 h5Var = (h5) this.c;
                Activity activity = (Activity) this.d;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.e;
                sb sbVar = (sb) this.f;
                n5 n5Var = (n5) this.b;
                kc D = kc.D(activity, h5Var.l.C2);
                p5 p5Var = h5Var.l.M2;
                long j11 = (p5Var == null || (rbVar = (rb) p5Var.c) == null) ? 0L : rbVar.currentPosition;
                di.k8 n10 = di.k8.n(h5Var.l.O1.h(), h5Var.l.O1.a);
                q5 q5Var3 = h5Var.l;
                n10.e = q5Var3.B1;
                TL_stories.StoryItem storyItem3 = q5Var3.O1.a;
                if (storyItem3 != null && (messageMedia = storyItem3.media) != null && (document = messageMedia.document) != null) {
                    int i22 = 0;
                    while (true) {
                        if (i22 < document.attributes.size()) {
                            if (document.attributes.get(i22) instanceof TLRPC.TL_documentAttributeVideo) {
                                tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) document.attributes.get(i22);
                            } else {
                                i22++;
                            }
                        }
                    }
                    if (tL_documentAttributeVideo != null) {
                        j10 = (long) (tL_documentAttributeVideo.video_start_ts * 1000.0d);
                        n10.e0 = j10;
                        di.k8 g10 = n10.g();
                        g10.b0 = true;
                        q5Var = h5Var.l;
                        TL_stories.StoryItem storyItem4 = q5Var.O1.a;
                        g10.c0 = storyItem4.media.document;
                        g10.d0 = new q4(h5Var, storyItem4, storyItem2, i16);
                        if (q5Var.I0()) {
                            q5 q5Var4 = h5Var.l;
                            g10.J0 = q5Var4.B1;
                            g10.L0 = MessagesController.toInputMedia(q5Var4.O1.a.media);
                            o8 o8Var = sbVar.O0;
                            if (o8Var instanceof f8) {
                                g10.K0 = ((f8) o8Var).E;
                            }
                        }
                        D.R(fc.d(sbVar), g10, j11);
                        D.Q = new z4(h5Var, i14);
                        D.R = new c5(h5Var, n5Var, i17);
                        break;
                    }
                }
                j10 = 0;
                n10.e0 = j10;
                di.k8 g102 = n10.g();
                g102.b0 = true;
                q5Var = h5Var.l;
                TL_stories.StoryItem storyItem42 = q5Var.O1.a;
                g102.c0 = storyItem42.media.document;
                g102.d0 = new q4(h5Var, storyItem42, storyItem2, i16);
                if (q5Var.I0()) {
                }
                D.R(fc.d(sbVar), g102, j11);
                D.Q = new z4(h5Var, i14);
                D.R = new c5(h5Var, n5Var, i17);
                break;
            case 3:
                e6 e6Var = (e6) this.c;
                TLRPC.User user = (TLRPC.User) this.d;
                String str2 = (String) this.e;
                org.telegram.ui.Cells.o6 o6Var = (org.telegram.ui.Cells.o6) this.f;
                TL_stories.StoryView storyView = (TL_stories.StoryView) this.b;
                ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                arrayList5.add(user);
                w6 w6Var = e6Var.b;
                ContactsController.getInstance(w6Var.v).deleteContact(arrayList5, false);
                i2.d.q(R.string.DeletedFromYourContacts, new Object[]{str2}, new zc(w6Var, w6Var.s), R.raw.ic_ban, 36);
                o6Var.a(w6Var.d(storyView) ? 1.0f : 0.5f, true);
                break;
            case 4:
                di.x9 x9Var = (di.x9) this.c;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) this.d;
                TLObject tLObject = (TLObject) this.e;
                TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl = (TL_phone.getGroupCallStreamRtmpUrl) this.f;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                di.ea eaVar = x9Var.W;
                a2Var.dismiss();
                if (tLObject instanceof TL_phone.groupCallStreamRtmpUrl) {
                    as[] asVarArr = new as[1];
                    Context context = x9Var.getContext();
                    i12 = ((org.telegram.ui.ActionBar.e3) eaVar).currentAccount;
                    as asVar = new as(context, i12, getgroupcallstreamrtmpurl, (TL_phone.groupCallStreamRtmpUrl) tLObject, eaVar.L ? null : new v2(6, x9Var, asVarArr), new b());
                    asVarArr[0] = asVar;
                    asVar.show();
                    break;
                } else if (tL_error2 != null) {
                    org.telegram.ui.ActionBar.c3 c3Var = eaVar.container;
                    c6Var = ((org.telegram.ui.ActionBar.e3) eaVar).resourcesProvider;
                    new zc(c3Var, c6Var).f0(tL_error2, true);
                    break;
                }
                break;
            case 5:
                uc.a((uc) this.c, (ViewGroup) this.d, (org.telegram.ui.ActionBar.c6) this.e, (org.telegram.ui.Components.la) this.f, (View) this.b);
                break;
            case 6:
                hg.c2 c2Var = (hg.c2) this.c;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = (TLRPC.TL_messages_getStickers) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                ArrayList arrayList6 = (ArrayList) this.f;
                LongSparseArray longSparseArray = (LongSparseArray) this.b;
                c2Var.getClass();
                String str3 = tL_messages_getStickers.emoticon;
                hg.e2 e2Var = c2Var.a;
                if (str3.equals(e2Var.R)) {
                    e2Var.O = 0;
                    if (tLObject2 instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject2;
                        int size = arrayList6.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        while (i17 < size2) {
                            TLRPC.Document document2 = tL_messages_stickers.stickers.get(i17);
                            if (longSparseArray.indexOfKey(document2.id) < 0) {
                                arrayList6.add(document2);
                            }
                            i17++;
                        }
                        if (size != arrayList6.size()) {
                            e2Var.I.put(arrayList6, e2Var.R);
                            if (size == 0) {
                                e2Var.J.add(arrayList6);
                            }
                            e2Var.l();
                            break;
                        }
                    }
                }
                break;
            case 7:
                ig.b2 b2Var = (ig.b2) this.c;
                ArrayList<TLRPC.User> arrayList7 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = (ArrayList) this.f;
                Runnable runnable3 = (Runnable) this.b;
                b2Var.e = false;
                int i23 = b2Var.a;
                MessagesController.getInstance(i23).putUsers(arrayList7, true);
                MessagesController.getInstance(i23).putChats(arrayList8, true);
                ArrayList arrayList10 = b2Var.b;
                arrayList10.clear();
                arrayList10.addAll(arrayList9);
                if (runnable3 != null) {
                    runnable3.run();
                } else {
                    b2Var.i(null, false);
                }
                NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 8:
                ig.b2 b2Var2 = (ig.b2) this.c;
                ArrayList<TLRPC.User> arrayList11 = (ArrayList) this.d;
                ArrayList<TLRPC.Chat> arrayList12 = (ArrayList) this.e;
                ig.a2 a2Var2 = (ig.a2) this.f;
                MessageObject messageObject = (MessageObject) this.b;
                int i24 = b2Var2.a;
                MessagesController.getInstance(i24).putUsers(arrayList11, true);
                MessagesController.getInstance(i24).putChats(arrayList12, true);
                a2Var2.e = messageObject;
                if (messageObject != null) {
                    messageObject.applyQuickReply(a2Var2.b, a2Var2.a);
                }
                b2Var2.l();
                NotificationCenter.getInstance(i24).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                break;
            case 9:
                ig.b2 b2Var3 = (ig.b2) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                ArrayList<Integer> arrayList13 = (ArrayList) this.e;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.f;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.b;
                b2Var3.getClass();
                if (tLObject3 instanceof TLRPC.TL_messages_messages) {
                    ArrayList<TLRPC.Message> arrayList14 = ((TLRPC.TL_messages_messages) tLObject3).messages;
                    arrayList13.clear();
                    int size3 = arrayList14.size();
                    int i25 = 0;
                    while (i25 < size3) {
                        TLRPC.Message message = arrayList14.get(i25);
                        i25++;
                        arrayList13.add(Integer.valueOf(message.id));
                    }
                    tL_messages_sendQuickReplyMessages.id = arrayList13;
                    while (i17 < arrayList13.size()) {
                        tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i17++;
                    }
                    ConnectionsManager.getInstance(b2Var3.a).sendRequest(tL_messages_sendQuickReplyMessages, null);
                    break;
                } else {
                    FileLog.e("received " + tLObject3 + " " + tL_error3 + " on getQuickReplyMessages when trying to send quick reply");
                    break;
                }
            case 10:
                ((m4.h) this.d).run().a(new androidx.car.app.utils.b((qi.e) this.c, (AtomicBoolean) this.e, (m4.i) this.f, (AtomicBoolean) this.b, 20), j9.r.a);
                break;
            case 11:
                ((CameraController) this.c).lambda$open$10((CameraSession) this.d, (Runnable) this.b, (SurfaceTexture) this.e, (Runnable) this.f);
                break;
            case 12:
                org.telegram.ui.w7 w7Var = (org.telegram.ui.w7) this.c;
                ai.b bVar = (ai.b) this.d;
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = (TLRPC.TL_documentAttributeAudio) this.e;
                String str4 = (String) this.f;
                String str5 = (String) this.b;
                w7Var.getClass();
                bVar.e.a = false;
                tL_documentAttributeAudio.title = str4;
                tL_documentAttributeAudio.performer = str5;
                k91 k91Var = w7Var.h;
                for (int i26 = 0; i26 < k91Var.getViewPages().length; i26++) {
                    mm0 mm0Var = (mm0) k91Var.getViewPages()[i26];
                    if (mm0Var != null && ((org.telegram.ui.j7) mm0Var.getAdapter()).d == 3) {
                        org.telegram.ui.j7 j7Var = (org.telegram.ui.j7) mm0Var.getAdapter();
                        int i27 = 0;
                        while (true) {
                            if (i27 >= j7Var.e.size()) {
                                break;
                            } else if (((org.telegram.ui.q7) j7Var.e.get(i27)).d == bVar) {
                                j7Var.m(i27);
                            } else {
                                i27++;
                            }
                        }
                    }
                }
                break;
            case 13:
                org.telegram.ui.va vaVar = (org.telegram.ui.va) this.c;
                String str6 = (String) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                TLObject tLObject4 = (TLObject) this.f;
                TL_account.checkUsername checkusername = (TL_account.checkUsername) this.b;
                vaVar.e = 0;
                String str7 = vaVar.f;
                if (str7 != null && str7.equals(str6)) {
                    if (tL_error4 != null || !(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                        if (vaVar.G != null) {
                            if (tL_error4 != null && "USERNAME_INVALID".equals(tL_error4.text) && checkusername.username.length() == 4) {
                                vaVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                                org.telegram.ui.Cells.y1 y1Var = vaVar.G;
                                int i28 = org.telegram.ui.ActionBar.g6.p7;
                                y1Var.setTag(Integer.valueOf(i28));
                                vaVar.G.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i28, false));
                            } else if (tL_error4 == null || !"USERNAME_PURCHASE_AVAILABLE".equals(tL_error4.text)) {
                                vaVar.G.setText(LocaleController.getString(R.string.UsernameInUse));
                                org.telegram.ui.Cells.y1 y1Var2 = vaVar.G;
                                int i29 = org.telegram.ui.ActionBar.g6.p7;
                                y1Var2.setTag(Integer.valueOf(i29));
                                vaVar.G.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i29, false));
                            } else {
                                if (checkusername.username.length() == 4) {
                                    vaVar.G.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                                } else {
                                    vaVar.G.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                                }
                                org.telegram.ui.Cells.y1 y1Var3 = vaVar.G;
                                int i30 = org.telegram.ui.ActionBar.g6.F6;
                                y1Var3.setTag(Integer.valueOf(i30));
                                vaVar.G.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i30, false));
                            }
                            org.telegram.ui.ua uaVar = vaVar.F;
                            if (uaVar != null) {
                                org.telegram.ui.ua.a(uaVar);
                                break;
                            }
                        }
                    } else {
                        org.telegram.ui.Cells.y1 y1Var4 = vaVar.G;
                        if (y1Var4 != null) {
                            y1Var4.setText(LocaleController.formatString("UsernameAvailable", R.string.UsernameAvailable, str6));
                            org.telegram.ui.Cells.y1 y1Var5 = vaVar.G;
                            int i31 = org.telegram.ui.ActionBar.g6.w6;
                            y1Var5.setTag(Integer.valueOf(i31));
                            vaVar.G.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i31, false));
                            org.telegram.ui.ua uaVar2 = vaVar.F;
                            if (uaVar2 != null) {
                                org.telegram.ui.ua.a(uaVar2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 14:
                org.telegram.ui.ub ubVar = (org.telegram.ui.ub) this.c;
                TLRPC.TL_chatInviteExported tL_chatInviteExported = (TLRPC.TL_chatInviteExported) this.d;
                TLRPC.TL_messages_exportedChatInvite tL_messages_exportedChatInvite = (TLRPC.TL_messages_exportedChatInvite) this.e;
                boolean[] zArr = (boolean[]) this.f;
                org.telegram.ui.ActionBar.a2 a2Var3 = (org.telegram.ui.ActionBar.a2) this.b;
                org.telegram.ui.ac acVar = ubVar.a.n;
                acVar.A0 = false;
                acVar.y0.put(tL_chatInviteExported.link, tL_messages_exportedChatInvite == null ? 0 : tL_messages_exportedChatInvite);
                if (!zArr[0]) {
                    a2Var3.dismiss();
                    if (tL_messages_exportedChatInvite != null) {
                        org.telegram.ui.ac.A0(acVar, tL_messages_exportedChatInvite, acVar.z0);
                        break;
                    } else {
                        org.telegram.messenger.q.r(R.string.LinkHashExpired, zc.a0(acVar), R.raw.linkbroken, 36);
                        break;
                    }
                }
                break;
            case 15:
                hd hdVar = (hd) this.c;
                boolean[] zArr2 = (boolean[]) this.d;
                int[] iArr = (int[]) this.e;
                int[] iArr2 = (int[]) this.f;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.b;
                if (!zArr2[0] && (i13 = iArr[0]) < iArr2[0]) {
                    if (tL_error5 != null) {
                        zArr2[0] = true;
                        if ("BOOSTS_REQUIRED".equals(tL_error5.text)) {
                            hdVar.getMessagesController().getBoostsController().userCanBoostChannel(hdVar.a, hdVar.c, new lc(hdVar, i16));
                            break;
                        } else {
                            hdVar.P.setLoading(false);
                            i2.d.q(R.string.UnknownErrorCode, new Object[]{tL_error5.text}, zc.a0(hdVar), R.raw.error, 36);
                            break;
                        }
                    } else {
                        int i32 = i13 + 1;
                        iArr[0] = i32;
                        if (i32 == iArr2[0]) {
                            hdVar.finishFragment();
                            org.telegram.ui.ActionBar.m2 m2Var = hdVar.l0;
                            if (m2Var != null) {
                                if (m2Var instanceof zo) {
                                    ((zo) m2Var).o0();
                                }
                                org.telegram.messenger.q.r(hdVar.d ? R.string.GroupAppearanceUpdated : R.string.ChannelAppearanceUpdated, zc.a0(hdVar.l0), R.raw.contact_check, 36);
                                hdVar.l0 = null;
                            }
                            hdVar.P.setLoading(false);
                            break;
                        }
                    }
                }
                break;
            case 16:
                sd sdVar = (sd) this.c;
                String str8 = (String) this.d;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) this.e;
                TLObject tLObject5 = (TLObject) this.f;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername = (TLRPC.TL_channels_checkUsername) this.b;
                sdVar.W = 0;
                String str9 = sdVar.X;
                if (str9 != null && str9.equals(str8)) {
                    if (tL_error6 != null || !(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error6 != null && "USERNAME_INVALID".equals(tL_error6.text) && tL_channels_checkUsername.username.length() == 4) {
                            sdVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                            sdVar.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p7, false));
                        } else if (tL_error6 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error6.text)) {
                            if (tL_channels_checkUsername.username.length() == 4) {
                                sdVar.U.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                            } else {
                                sdVar.U.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                            }
                            sdVar.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.F6, false));
                        } else if (tL_error6 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error6.text)) {
                            sdVar.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p7, false));
                            sdVar.U.setText(LocaleController.getString(R.string.LinkInUse));
                        } else {
                            sdVar.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p7, false));
                            sdVar.j0 = false;
                            sdVar.f0();
                        }
                        sdVar.Z = false;
                        break;
                    } else {
                        sdVar.U.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str8));
                        org.telegram.ui.Cells.y1 y1Var6 = sdVar.U;
                        int i33 = org.telegram.ui.ActionBar.g6.w6;
                        y1Var6.setTag(Integer.valueOf(i33));
                        sdVar.U.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i33, false));
                        sdVar.Z = true;
                        break;
                    }
                }
                break;
            case 17:
                fo foVar = (fo) this.c;
                boolean[] zArr3 = (boolean[]) this.d;
                boolean[] zArr4 = (boolean[]) this.e;
                ImageView imageView = (ImageView) this.f;
                ImageView imageView2 = (ImageView) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    long[] jArr = {-1};
                    org.telegram.ui.p6 p6Var = new org.telegram.ui.p6((Object) jArr, zArr4, (Object) imageView, (Object) imageView2, 6);
                    TLRPC.TL_messages_rateTranscribedAudio tL_messages_rateTranscribedAudio = new TLRPC.TL_messages_rateTranscribedAudio();
                    tL_messages_rateTranscribedAudio.msg_id = foVar.d5.getId();
                    tL_messages_rateTranscribedAudio.peer = foVar.getMessagesController().getInputPeer(foVar.d5.messageOwner.peer_id);
                    tL_messages_rateTranscribedAudio.transcription_id = foVar.d5.messageOwner.voiceTranscriptionId;
                    tL_messages_rateTranscribedAudio.good = zArr4[0];
                    foVar.getConnectionsManager().sendRequest(tL_messages_rateTranscribedAudio, new org.telegram.ui.fa(foVar, p6Var, jArr, i15));
                    AndroidUtilities.runOnUIThread(p6Var, 150L);
                    break;
                }
                break;
            case 18:
                qn qnVar = (qn) this.c;
                TLRPC.Message message2 = (TLRPC.Message) this.d;
                org.telegram.ui.ActionBar.a2[] a2VarArr = (org.telegram.ui.ActionBar.a2[]) this.e;
                MessageObject messageObject2 = (MessageObject) this.f;
                org.telegram.ui.v5 v5Var = (org.telegram.ui.v5) this.b;
                fo foVar2 = qnVar.a;
                if (message2.suggested_post.schedule_date == 0) {
                    a2VarArr[0].setOnDismissListener(null);
                    org.telegram.ui.ActionBar.e3 e3Var = org.telegram.ui.Components.g5.S(foVar2.getParentActivity(), 0L, new m4.z0(16, qnVar, messageObject2), foVar2.getResourceProvider(), 1).a;
                    e3Var.show();
                    e3Var.setOnDismissListener(v5Var);
                    break;
                } else {
                    foVar2.getMessagesController().approveSuggestedMessage(DialogObject.getPeerDialogId(messageObject2.messageOwner.peer_id), messageObject2.messageOwner.id, 0);
                    break;
                }
            case 19:
                np npVar = (np) this.c;
                String str10 = (String) this.d;
                TLRPC.TL_error tL_error7 = (TLRPC.TL_error) this.e;
                TLObject tLObject6 = (TLObject) this.f;
                TLRPC.TL_channels_checkUsername tL_channels_checkUsername2 = (TLRPC.TL_channels_checkUsername) this.b;
                npVar.h0 = 0;
                String str11 = npVar.i0;
                if (str11 != null && str11.equals(str10)) {
                    if (tL_error7 != null || !(tLObject6 instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error7 != null && "USERNAME_INVALID".equals(tL_error7.text) && tL_channels_checkUsername2.username.length() == 4) {
                            npVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShort));
                            npVar.f.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.p7, false));
                        } else if (tL_error7 != null && "USERNAME_PURCHASE_AVAILABLE".equals(tL_error7.text)) {
                            if (tL_channels_checkUsername2.username.length() == 4) {
                                npVar.f.setText(LocaleController.getString(R.string.UsernameInvalidShortPurchase));
                            } else {
                                npVar.f.setText(LocaleController.getString(R.string.UsernameInUsePurchase));
                            }
                            npVar.f.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.F6, false));
                        } else if (tL_error7 == null || !"CHANNELS_ADMIN_PUBLIC_TOO_MUCH".equals(tL_error7.text)) {
                            npVar.f.setText(LocaleController.getString(R.string.LinkInUse));
                            npVar.f.setTextColorByKey(org.telegram.ui.ActionBar.g6.p7);
                        } else {
                            npVar.c0 = false;
                            npVar.Z();
                        }
                        npVar.k0 = false;
                        break;
                    } else {
                        npVar.f.setText(LocaleController.formatString("LinkAvailable", R.string.LinkAvailable, str10));
                        npVar.f.setTextColorByKey(org.telegram.ui.ActionBar.g6.w6);
                        npVar.k0 = true;
                        break;
                    }
                }
                break;
            case 20:
                tq.Y((tq) this.c, (TLRPC.TL_error) this.d, (TLRPC.InputCheckPasswordSRP) this.e, (TwoStepVerificationActivity) this.f, (TLRPC.TL_channels_editCreator) this.b);
                break;
            case 21:
                xr xrVar = (xr) this.c;
                ArrayList arrayList15 = (ArrayList) this.d;
                a0.h hVar = (a0.h) this.e;
                ArrayList arrayList16 = (ArrayList) this.f;
                ArrayList arrayList17 = (ArrayList) this.b;
                hg.a2 a2Var4 = xrVar.h;
                yr yrVar = xrVar.y;
                if (yrVar.o1) {
                    xrVar.s = false;
                    xrVar.d = arrayList15;
                    xrVar.e = hVar;
                    xrVar.f = arrayList16;
                    a2Var4.f(arrayList15, null);
                    if (!ChatObject.isChannel(yrVar.r)) {
                        ArrayList arrayList18 = a2Var4.g;
                        arrayList18.clear();
                        arrayList18.addAll(arrayList17);
                    }
                    int i34 = xrVar.r;
                    xrVar.l();
                    if (xrVar.r > i34) {
                        yrVar.y0(i34);
                    }
                    if (!a2Var4.e() && xrVar.r == 0) {
                        yrVar.b.e(false, true);
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
                ty0 ty0Var = (ty0) this.c;
                String str12 = (String) this.d;
                TLRPC.TL_error tL_error8 = (TLRPC.TL_error) this.e;
                TLObject tLObject7 = (TLObject) this.f;
                TextView textView = (TextView) this.b;
                ty0Var.p0 = 0;
                String str13 = ty0Var.o0;
                if (str13 != null && str13.equals(str12)) {
                    if (tL_error8 != null || !(tLObject7 instanceof TLRPC.TL_boolTrue)) {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkTaken));
                        textView.setTextColor(ty0Var.getThemedColor(org.telegram.ui.ActionBar.g6.p7));
                        ty0Var.q0 = false;
                        break;
                    } else {
                        textView.setText(LocaleController.getString(R.string.ImportStickersLinkAvailable));
                        textView.setTextColor(ty0Var.getThemedColor(org.telegram.ui.ActionBar.g6.w6));
                        ty0Var.q0 = true;
                        break;
                    }
                }
                break;
            case 24:
                ez0 ez0Var = (ez0) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) this.f;
                TLRPC.TL_error tL_error9 = (TLRPC.TL_error) this.b;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    if (tLObject8 instanceof TLRPC.TL_boolTrue) {
                        sc M = zc.a0(U).M(LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo), R.raw.gift);
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
                            MessagesStorage.getInstance(ez0Var.a).updateUserInfo(userFull, false);
                        }
                        if (tL_error9 != null && (str = tL_error9.text) != null && str.startsWith("FLOOD_WAIT_")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ez0Var.b.getContext());
                            alertDialog$Builder.a.R = LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle);
                            alertDialog$Builder.a.T = LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage);
                            org.telegram.messenger.q.A(R.string.OK, alertDialog$Builder, null);
                            break;
                        } else {
                            org.telegram.messenger.q.r(R.string.UnknownError, zc.a0(U), R.raw.error, 36);
                            break;
                        }
                    }
                }
                break;
            case 25:
                y31 y31Var = (y31) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.e;
                m80 m80Var = (m80) this.f;
                m80 m80Var2 = (m80) this.b;
                fo foVar3 = y31Var.h;
                if (messagesController.isDialogMuted(y31Var.c, tL_forumTopic.id)) {
                    m80Var.u();
                    NotificationsController.getInstance(y31Var.b).muteDialog(y31Var.c, tL_forumTopic.id, false);
                    if (zc.a(foVar3)) {
                        zc.z(foVar3, 4, 0, y31Var.d).j();
                        break;
                    }
                } else {
                    m80Var.K(m80Var2);
                    break;
                }
                break;
            case 26:
                xt xtVar = (xt) this.c;
                TLRPC.TL_error tL_error10 = (TLRPC.TL_error) this.d;
                TLObject tLObject9 = (TLObject) this.e;
                ArrayList arrayList19 = (ArrayList) this.f;
                TLRPC.TL_messages_getMyStickers tL_messages_getMyStickers = (TLRPC.TL_messages_getMyStickers) this.b;
                if (tL_error10 == null && (tLObject9 instanceof TLRPC.TL_messages_myStickers)) {
                    TLRPC.TL_messages_myStickers tL_messages_myStickers = (TLRPC.TL_messages_myStickers) tLObject9;
                    ArrayList<TLRPC.StickerSetCovered> arrayList20 = tL_messages_myStickers.sets;
                    int size4 = arrayList20.size();
                    while (i17 < size4) {
                        TLRPC.StickerSetCovered stickerSetCovered = arrayList20.get(i17);
                        i17++;
                        TLRPC.StickerSetCovered stickerSetCovered2 = stickerSetCovered;
                        TLRPC.StickerSet stickerSet = stickerSetCovered2.set;
                        if (!stickerSet.emojis && !stickerSet.masks) {
                            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                            tL_inputStickerSetID.id = stickerSetCovered2.set.id;
                            TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(xtVar.r).getStickerSet((TLRPC.InputStickerSet) tL_inputStickerSetID, true);
                            if (stickerSet2 == null || stickerSet2.documents.size() < 120) {
                                arrayList19.add(stickerSetCovered2);
                            }
                        }
                    }
                    if (tL_messages_myStickers.sets.size() == tL_messages_getMyStickers.limit) {
                        tL_messages_getMyStickers.offset_id = ((TLRPC.StickerSetCovered) i2.d.g(1, tL_messages_myStickers.sets)).set.id;
                        ConnectionsManager.getInstance(xtVar.r).sendRequest(tL_messages_getMyStickers, new org.telegram.ui.fa(xtVar, arrayList19, tL_messages_getMyStickers, 7));
                        break;
                    }
                }
                break;
            case 27:
                yy.F0((yy) this.c, (TLObject) this.d, (TLRPC.UserFull) this.e, (TL_account.TL_birthday) this.f, (TLRPC.TL_error) this.b);
                break;
            case 28:
                a();
                break;
            default:
                n60.z((n60) this.c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f, (String) this.b);
                break;
        }
    }

    public /* synthetic */ c3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = obj5;
    }

    public /* synthetic */ c3(CameraController cameraController, CameraSession cameraSession, Runnable runnable, SurfaceTexture surfaceTexture, Runnable runnable2) {
        this.a = 11;
        this.c = cameraController;
        this.d = cameraSession;
        this.b = runnable;
        this.e = surfaceTexture;
        this.f = runnable2;
    }
}
