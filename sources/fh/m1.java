package fh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import gh.ea;
import gh.jb;
import gh.n7;
import gh.pa;
import gh.t7;
import gh.u7;
import gh.v7;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.ConferenceCall;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.fs;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.oc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bq;
import org.telegram.ui.jr;
import org.telegram.ui.qn;
import org.telegram.ui.rq;
import org.telegram.ui.sq;
import org.telegram.ui.wr0;
import org.telegram.ui.zt0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class m1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m1(gh.c0 c0Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j10, Utilities.Callback callback) {
        this.a = 1;
        this.d = c0Var;
        this.e = c2Var;
        this.f = tLObject;
        this.b = j10;
        this.c = callback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x017e, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fs(r2, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017b, code lost:
    
        if (r5 == null) goto L55;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String formatString;
        String str;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        String str2;
        int i9 = 3;
        int i10 = 2;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i11 = 1;
        int i12 = 0;
        switch (this.a) {
            case 0:
                p2 p2Var = (p2) this.d;
                n7 n7Var = (n7) this.e;
                long j10 = this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                Context context = (Context) this.f;
                s1 s1Var = p2Var.h0;
                int i13 = 0;
                while (i13 < i10) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i13 == i11) {
                        formatString = LocaleController.getString(R.string.Gift2StarsCollectibleInfo);
                    } else {
                        int i14 = R.string.Gift2StarsInfo;
                        Object[] objArr = new Object[i11];
                        objArr[i12] = p2Var.a0;
                        formatString = LocaleController.formatString(i14, objArr);
                    }
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(formatString));
                    String str3 = " ";
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    while (i12 < n7Var.l.size() && hashSet.size() < i9) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) n7Var.l.get(i12);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            str = str3;
                        } else {
                            str = str3;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i12++;
                        str3 = str;
                        i9 = 3;
                    }
                    String str4 = str3;
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatString(R.string.Gift2StarsInfoProfileLink, DialogObject.getShortName(j10)).replaceAll(str4, " "));
                        spannableStringBuilder2.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document2 = (TLRPC.Document) it.next();
                            spannableStringBuilder2.append((CharSequence) "\u2060e");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(document2, s1Var.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new e5.w(p2Var, callback, j10, 1)), true));
                    } else {
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new e2.f(context, 3)), true));
                    }
                    TextView textView = i13 == 0 ? s1Var : p2Var.i0;
                    textView.setText(spannableStringBuilder);
                    textView.setMaxWidth(kh.x3.a(textView.getText(), textView.getPaint()));
                    i13++;
                    i9 = 3;
                    i10 = 2;
                    i11 = 1;
                    i12 = 0;
                }
                return;
            case 1:
                gh.c0 c0Var = (gh.c0) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j11 = this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                c0Var.getClass();
                c2Var.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(c0Var.a).putUsers(connectedstarrefbots.users, false);
                    while (i12 < connectedstarrefbots.connected_bots.size()) {
                        if (connectedstarrefbots.connected_bots.get(i12).bot_id == j11 && !connectedstarrefbots.connected_bots.get(i12).revoked) {
                            callback2.run(connectedstarrefbots.connected_bots.get(i12));
                            return;
                        }
                        i12++;
                    }
                }
                callback2.run(null);
                return;
            case 2:
                v7 v7Var = (v7) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                MessageObject messageObject = (MessageObject) this.c;
                long j12 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i15 = v7Var.a;
                if (!(tLObject2 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject2;
                MessagesController.getInstance(i15).putUsers(tL_messages_messages.users, false);
                MessagesController.getInstance(i15).putChats(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    messageObject.messageOwner = tL_messages_messages.messages.get(0);
                    v7Var.l0(messageObject, j12, runnable, true);
                    return;
                }
            case 3:
                v7 v7Var2 = (v7) this.d;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.e;
                long j13 = this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (v7Var2.e) {
                    v7Var2.g(j13, tLObject3, tL_textWithEntities, callback22);
                    return;
                } else {
                    v7.e("NO_BALANCE");
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
            case 4:
                v7 v7Var3 = (v7) this.d;
                Utilities.Callback2 callback23 = (Utilities.Callback2) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.c;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f;
                long j14 = this.b;
                if (v7Var3.e) {
                    v7Var3.h(tL_payments_paymentFormStarGift, starGift2, j14, null, true, callback23);
                    return;
                } else {
                    v7.e("NO_BALANCE");
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.e;
                CharSequence charSequence = (CharSequence) this.c;
                long j15 = this.b;
                String str5 = (String) this.f;
                AndroidUtilities.runOnUIThread(new q2(profileActivity, i10), 200L);
                oc a02 = oc.a0(profileActivity);
                TLRPC.Document document3 = starGift3.sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j15, str5));
                }
                a02.s(document3, string, charSequence).k(false);
                return;
            case 6:
                u7 u7Var = (u7) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                MessagesController messagesController = (MessagesController) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                long j16 = this.b;
                u7Var.getClass();
                if (tLObject4 != null) {
                    Utilities.stageQueue.postRunnable(new e5.u(25, messagesController, tLObject4));
                    return;
                }
                if (tL_error != null) {
                    u7Var.b.addPaidReactions((int) (-u7Var.h), u7Var.g, u7Var.c());
                    NotificationCenter.getInstance(u7Var.q.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(u7Var.b.getDialogId()), Integer.valueOf(u7Var.b.getId()), u7Var.b.messageOwner.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (u7Var.a.a >= 0) {
                            str2 = UserObject.getForcedFirstName(u7Var.c.getMessagesController().getUser(Long.valueOf(u7Var.a.a)));
                        } else {
                            TLRPC.Chat chat = u7Var.c.getMessagesController().getChat(Long.valueOf(-u7Var.a.a));
                            str2 = chat == null ? "" : chat.title;
                        }
                        String str6 = str2;
                        Context parentActivity = u7Var.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.C1;
                        }
                        if (parentActivity == null) {
                            parentActivity = ApplicationLoader.applicationContext;
                        }
                        new ea(parentActivity, u7Var.c.getResourceProvider(), j16, 5, str6, new t7(u7Var, j16, i11), 0L).show();
                    }
                    u7Var.q.T(false);
                    u7Var.q.P();
                    return;
                }
                return;
            case 7:
                jb jbVar = (jb) this.d;
                long j17 = this.b;
                v7 v7Var4 = (v7) this.e;
                MessageObject messageObject2 = (MessageObject) this.c;
                qn qnVar = (qn) this.f;
                gh.i3 i3Var = jbVar.L;
                if (i3Var == null) {
                    u7 d02 = v7Var4.d0(messageObject2, qnVar, j17, false, true, Long.valueOf(jbVar.A));
                    if (d02 == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new e5.u(27, jbVar, d02));
                    return;
                }
                int intValue = ih.w0.a((ih.w0) i3Var.b, Long.valueOf(j17)).intValue();
                jbVar.K = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    jbVar.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new pa(jbVar, i12));
                    return;
                }
            case 8:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.b, (TLObject) this.e, (TLRPC.TL_error) this.c, (Runnable) this.f);
                return;
            case 9:
                jr jrVar = (jr) this.d;
                long j18 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str7 = (String) this.c;
                TLObject tLObject5 = (TLObject) this.f;
                bq bqVar = new bq(j18, jrVar.J, null, jrVar.A, tL_chatBannedRights, str7, 1, true, false, null);
                bqVar.T0 = new rq(jrVar, tLObject5);
                jrVar.presentFragment(bqVar);
                return;
            case 10:
                jr jrVar2 = (jr) this.d;
                long j19 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str8 = (String) this.c;
                TLObject tLObject6 = (TLObject) this.f;
                bq bqVar2 = new bq(j19, jrVar2.J, tL_chatAdminRights, null, null, str8, 0, true, false, null);
                bqVar2.T0 = new sq(jrVar2, tLObject6);
                jrVar2.presentFragment(bqVar2);
                return;
            case 11:
                gs gsVar = (gs) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                ArrayList arrayList = (ArrayList) this.c;
                long j20 = this.b;
                String str9 = (String) this.f;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    try {
                        database.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        while (i12 < arrayList.size()) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, ((Long) arrayList.get(i12)).longValue());
                            sQLitePreparedStatement.bindLong(2, j20);
                            sQLitePreparedStatement.bindString(3, str9);
                            sQLitePreparedStatement.bindInteger(4, i12);
                            sQLitePreparedStatement.step();
                            i12++;
                        }
                        break;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        break;
                    }
                } finally {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                }
            case 12:
                gs gsVar2 = (gs) this.d;
                ArrayList<TLRPC.User> arrayList2 = (ArrayList) this.e;
                long j21 = this.b;
                String str10 = (String) this.c;
                fs fsVar = (fs) this.f;
                MessagesController.getInstance(gsVar2.a).putUsers(arrayList2, true);
                gsVar2.h.addAll(arrayList2);
                gsVar2.f = j21;
                gsVar2.g = str10;
                gsVar2.e = TextUtils.isEmpty(str10);
                gsVar2.d = true;
                fsVar.run();
                return;
            case 13:
                org.telegram.ui.ActionBar.c2 c2Var2 = (org.telegram.ui.ActionBar.c2) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                long j22 = this.b;
                AccountInstance accountInstance = (AccountInstance) this.c;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.f;
                try {
                    c2Var2.dismiss();
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                if (tLObject7 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject7;
                    g70.C = joinaspeers.peers;
                    g70.E = j22;
                    g70.D = SystemClock.elapsedRealtime();
                    g70.F = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    booleanCallback.run(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.e;
                long j23 = this.b;
                String str11 = (String) this.c;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (photoEntry.coverPath != null) {
                    try {
                        new File(photoEntry.coverPath).delete();
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                }
                photoEntry.coverSavedPosition = j23;
                photoEntry.coverPath = str11;
                photoEntry.coverPhoto = null;
                photoEntry.coverPhotoParentObject = null;
                photoViewer.m5.b.setLoading(false);
                zt0 zt0Var = photoViewer.d;
                if (zt0Var != null) {
                    zt0Var.W(photoViewer.L4);
                }
                wr0 wr0Var = photoViewer.c1;
                if (wr0Var != null) {
                    wr0Var.setImage(bitmap);
                }
                photoViewer.e3(0);
                CheckBox checkBox = photoViewer.J0;
                if (checkBox.x) {
                    return;
                }
                checkBox.callOnClick();
                return;
            default:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ArrayList arrayList3 = (ArrayList) this.c;
                boolean[] zArr2 = (boolean[]) this.f;
                long j24 = this.b;
                zArr[0] = true;
                AndroidUtilities.cancelRunOnUIThread(profileActivity2.t5);
                for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                    ((TL_stories.StoryItem) arrayList3.get(i16)).pinned = zArr2[i16];
                }
                profileActivity2.getMessagesController().getStoriesController().n0(j24, arrayList3, false);
                return;
        }
    }

    public /* synthetic */ m1(Object obj, long j10, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = j10;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ m1(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ m1(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i9) {
        this.a = i9;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = j10;
        this.f = obj4;
    }

    public /* synthetic */ m1(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i9) {
        this.a = i9;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = j10;
    }
}
