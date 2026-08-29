package ih;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import jh.db;
import jh.ja;
import jh.k7;
import jh.q7;
import jh.r7;
import jh.s7;
import jh.y9;
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
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dq;
import org.telegram.ui.jr;
import org.telegram.ui.tn;
import org.telegram.ui.tq;
import org.telegram.ui.uq;
import org.telegram.ui.vr0;
import org.telegram.ui.xt0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h1(Object obj, long j10, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x017e, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.js(r2, 1));
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
        int i10 = 3;
        int i11 = 2;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i12 = 1;
        int i13 = 0;
        switch (this.a) {
            case 0:
                h2 h2Var = (h2) this.d;
                k7 k7Var = (k7) this.e;
                long j10 = this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                Context context = (Context) this.f;
                m1 m1Var = h2Var.h0;
                int i14 = 0;
                while (i14 < i11) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i14 == i12) {
                        formatString = LocaleController.getString(R.string.Gift2StarsCollectibleInfo);
                    } else {
                        int i15 = R.string.Gift2StarsInfo;
                        Object[] objArr = new Object[i12];
                        objArr[i13] = h2Var.a0;
                        formatString = LocaleController.formatString(i15, objArr);
                    }
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(formatString));
                    String str3 = " ";
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    while (i13 < k7Var.l.size() && hashSet.size() < i10) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) k7Var.l.get(i13);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            str = str3;
                        } else {
                            str = str3;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i13++;
                        str3 = str;
                        i10 = 3;
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
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(document2, m1Var.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new g5.v(h2Var, callback, j10, 1)), true));
                    } else {
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new e2.e(context, 3)), true));
                    }
                    TextView textView = i14 == 0 ? m1Var : h2Var.i0;
                    textView.setText(spannableStringBuilder);
                    textView.setMaxWidth(nh.t3.a(textView.getText(), textView.getPaint()));
                    i14++;
                    i10 = 3;
                    i11 = 2;
                    i12 = 1;
                    i13 = 0;
                }
                return;
            case 1:
                jh.b0 b0Var = (jh.b0) this.d;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j11 = this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                b0Var.getClass();
                c2Var.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(b0Var.a).putUsers(connectedstarrefbots.users, false);
                    while (i13 < connectedstarrefbots.connected_bots.size()) {
                        if (connectedstarrefbots.connected_bots.get(i13).bot_id == j11 && !connectedstarrefbots.connected_bots.get(i13).revoked) {
                            callback2.run(connectedstarrefbots.connected_bots.get(i13));
                            return;
                        }
                        i13++;
                    }
                }
                callback2.run(null);
                return;
            case 2:
                s7 s7Var = (s7) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                MessageObject messageObject = (MessageObject) this.c;
                long j12 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i16 = s7Var.a;
                if (!(tLObject2 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject2;
                MessagesController.getInstance(i16).putUsers(tL_messages_messages.users, false);
                MessagesController.getInstance(i16).putChats(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    messageObject.messageOwner = tL_messages_messages.messages.get(0);
                    s7Var.l0(messageObject, j12, runnable, true);
                    return;
                }
            case 3:
                s7 s7Var2 = (s7) this.d;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.e;
                long j13 = this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (s7Var2.e) {
                    s7Var2.g(j13, tLObject3, tL_textWithEntities, callback22);
                    return;
                } else {
                    s7.e("NO_BALANCE");
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
            case 4:
                s7 s7Var3 = (s7) this.d;
                Utilities.Callback2 callback23 = (Utilities.Callback2) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.c;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f;
                long j14 = this.b;
                if (s7Var3.e) {
                    s7Var3.h(tL_payments_paymentFormStarGift, starGift2, j14, null, true, callback23);
                    return;
                } else {
                    s7.e("NO_BALANCE");
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.e;
                CharSequence charSequence = (CharSequence) this.c;
                long j15 = this.b;
                String str5 = (String) this.f;
                AndroidUtilities.runOnUIThread(new i2(profileActivity, i11), 200L);
                tc a02 = tc.a0(profileActivity);
                TLRPC.Document document3 = starGift3.sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j15, str5));
                }
                a02.s(document3, string, charSequence).k(false);
                return;
            case 6:
                r7 r7Var = (r7) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                MessagesController messagesController = (MessagesController) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                long j16 = this.b;
                r7Var.getClass();
                if (tLObject4 != null) {
                    Utilities.stageQueue.postRunnable(new jh.w2(11, messagesController, tLObject4));
                    return;
                }
                if (tL_error != null) {
                    r7Var.b.addPaidReactions((int) (-r7Var.h), r7Var.g, r7Var.c());
                    NotificationCenter.getInstance(r7Var.q.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(r7Var.b.getDialogId()), Integer.valueOf(r7Var.b.getId()), r7Var.b.messageOwner.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (r7Var.a.a >= 0) {
                            str2 = UserObject.getForcedFirstName(r7Var.c.getMessagesController().getUser(Long.valueOf(r7Var.a.a)));
                        } else {
                            TLRPC.Chat chat = r7Var.c.getMessagesController().getChat(Long.valueOf(-r7Var.a.a));
                            str2 = chat == null ? "" : chat.title;
                        }
                        String str6 = str2;
                        Context parentActivity = r7Var.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.C1;
                        }
                        if (parentActivity == null) {
                            parentActivity = ApplicationLoader.applicationContext;
                        }
                        new y9(parentActivity, r7Var.c.getResourceProvider(), j16, 5, str6, new q7(r7Var, j16, i12), 0L).show();
                    }
                    r7Var.q.T(false);
                    r7Var.q.P();
                    return;
                }
                return;
            case 7:
                db dbVar = (db) this.d;
                long j17 = this.b;
                s7 s7Var4 = (s7) this.e;
                MessageObject messageObject2 = (MessageObject) this.c;
                tn tnVar = (tn) this.f;
                l4.s0 s0Var = dbVar.L;
                if (s0Var == null) {
                    r7 d02 = s7Var4.d0(messageObject2, tnVar, j17, false, true, Long.valueOf(dbVar.A));
                    if (d02 == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new jh.w2(13, dbVar, d02));
                    return;
                }
                int intValue = lh.u0.a((lh.u0) s0Var.b, Long.valueOf(j17)).intValue();
                dbVar.K = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    dbVar.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new ja(dbVar, i13));
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
                dq dqVar = new dq(j18, jrVar.J, null, jrVar.A, tL_chatBannedRights, str7, 1, true, false, null);
                dqVar.T0 = new tq(jrVar, tLObject5);
                jrVar.presentFragment(dqVar);
                return;
            case 10:
                jr jrVar2 = (jr) this.d;
                long j19 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str8 = (String) this.c;
                TLObject tLObject6 = (TLObject) this.f;
                dq dqVar2 = new dq(j19, jrVar2.J, tL_chatAdminRights, null, null, str8, 0, true, false, null);
                dqVar2.T0 = new uq(jrVar2, tLObject6);
                jrVar2.presentFragment(dqVar2);
                return;
            case 11:
                ks ksVar = (ks) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                ArrayList arrayList = (ArrayList) this.c;
                long j20 = this.b;
                String str9 = (String) this.f;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    try {
                        database.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        while (i13 < arrayList.size()) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, ((Long) arrayList.get(i13)).longValue());
                            sQLitePreparedStatement.bindLong(2, j20);
                            sQLitePreparedStatement.bindString(3, str9);
                            sQLitePreparedStatement.bindInteger(4, i13);
                            sQLitePreparedStatement.step();
                            i13++;
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
                ks ksVar2 = (ks) this.d;
                ArrayList<TLRPC.User> arrayList2 = (ArrayList) this.e;
                long j21 = this.b;
                String str10 = (String) this.c;
                js jsVar = (js) this.f;
                MessagesController.getInstance(ksVar2.a).putUsers(arrayList2, true);
                ksVar2.h.addAll(arrayList2);
                ksVar2.f = j21;
                ksVar2.g = str10;
                ksVar2.e = TextUtils.isEmpty(str10);
                ksVar2.d = true;
                jsVar.run();
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
                    t70.C = joinaspeers.peers;
                    t70.E = j22;
                    t70.D = SystemClock.elapsedRealtime();
                    t70.F = accountInstance.getCurrentAccount();
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
                xt0 xt0Var = photoViewer.d;
                if (xt0Var != null) {
                    xt0Var.W(photoViewer.L4);
                }
                vr0 vr0Var = photoViewer.c1;
                if (vr0Var != null) {
                    vr0Var.setImage(bitmap);
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
                for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                    ((TL_stories.StoryItem) arrayList3.get(i17)).pinned = zArr2[i17];
                }
                profileActivity2.getMessagesController().getStoriesController().n0(j24, arrayList3, false);
                return;
        }
    }

    public /* synthetic */ h1(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = j10;
        this.f = obj4;
    }

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = j10;
    }

    public /* synthetic */ h1(jh.b0 b0Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j10, Utilities.Callback callback) {
        this.a = 1;
        this.d = b0Var;
        this.e = c2Var;
        this.f = tLObject;
        this.b = j10;
        this.c = callback;
    }
}
