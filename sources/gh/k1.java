package gh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import hh.ea;
import hh.jb;
import hh.m7;
import hh.pa;
import hh.s7;
import hh.t7;
import hh.u7;
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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.k70;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au0;
import org.telegram.ui.dq;
import org.telegram.ui.lr;
import org.telegram.ui.rn;
import org.telegram.ui.tq;
import org.telegram.ui.uq;
import org.telegram.ui.xr0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class k1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ k1(hh.c0 c0Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, Utilities.Callback callback) {
        this.a = 1;
        this.d = c0Var;
        this.e = b2Var;
        this.f = tLObject;
        this.b = j10;
        this.c = callback;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x017e, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ds(r2, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0186, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x017b, code lost:
    
        if (r6 == null) goto L55;
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
        int i10 = 4;
        int i11 = 3;
        int i12 = 2;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i13 = 1;
        int i14 = 0;
        switch (this.a) {
            case 0:
                k2 k2Var = (k2) this.d;
                m7 m7Var = (m7) this.e;
                long j10 = this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                Context context = (Context) this.f;
                p1 p1Var = k2Var.h0;
                int i15 = 0;
                while (i15 < i12) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i15 == i13) {
                        formatString = LocaleController.getString(R.string.Gift2StarsCollectibleInfo);
                    } else {
                        int i16 = R.string.Gift2StarsInfo;
                        Object[] objArr = new Object[i13];
                        objArr[i14] = k2Var.a0;
                        formatString = LocaleController.formatString(i16, objArr);
                    }
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(formatString));
                    String str3 = " ";
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    while (i14 < m7Var.l.size() && hashSet.size() < i11) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) m7Var.l.get(i14);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            str = str3;
                        } else {
                            str = str3;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i14++;
                        str3 = str;
                        i11 = 3;
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
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(document2, p1Var.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new e5.u(k2Var, callback, j10, 1)), true));
                    } else {
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new e2.e(context, 3)), true));
                    }
                    TextView textView = i15 == 0 ? p1Var : k2Var.i0;
                    textView.setText(spannableStringBuilder);
                    textView.setMaxWidth(lh.w3.a(textView.getText(), textView.getPaint()));
                    i15++;
                    i11 = 3;
                    i12 = 2;
                    i13 = 1;
                    i14 = 0;
                }
                return;
            case 1:
                hh.c0 c0Var = (hh.c0) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j11 = this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                c0Var.getClass();
                b2Var.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(c0Var.a).putUsers(connectedstarrefbots.users, false);
                    while (i14 < connectedstarrefbots.connected_bots.size()) {
                        if (connectedstarrefbots.connected_bots.get(i14).bot_id == j11 && !connectedstarrefbots.connected_bots.get(i14).revoked) {
                            callback2.run(connectedstarrefbots.connected_bots.get(i14));
                            return;
                        }
                        i14++;
                    }
                }
                callback2.run(null);
                return;
            case 2:
                u7 u7Var = (u7) this.d;
                TLObject tLObject2 = (TLObject) this.e;
                MessageObject messageObject = (MessageObject) this.c;
                long j12 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i17 = u7Var.a;
                if (!(tLObject2 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject2;
                MessagesController.getInstance(i17).putUsers(tL_messages_messages.users, false);
                MessagesController.getInstance(i17).putChats(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    messageObject.messageOwner = tL_messages_messages.messages.get(0);
                    u7Var.l0(messageObject, j12, runnable, true);
                    return;
                }
            case 3:
                u7 u7Var2 = (u7) this.d;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.e;
                long j13 = this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (u7Var2.e) {
                    u7Var2.g(j13, tLObject3, tL_textWithEntities, callback22);
                    return;
                } else {
                    u7.e("NO_BALANCE");
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
            case 4:
                u7 u7Var3 = (u7) this.d;
                Utilities.Callback2 callback23 = (Utilities.Callback2) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.c;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f;
                long j14 = this.b;
                if (u7Var3.e) {
                    u7Var3.h(tL_payments_paymentFormStarGift, starGift2, j14, null, true, callback23);
                    return;
                } else {
                    u7.e("NO_BALANCE");
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.e;
                CharSequence charSequence = (CharSequence) this.c;
                long j15 = this.b;
                String str5 = (String) this.f;
                AndroidUtilities.runOnUIThread(new l2(profileActivity, i12), 200L);
                mc a02 = mc.a0(profileActivity);
                TLRPC.Document document3 = starGift3.sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j15, str5));
                }
                a02.s(document3, string, charSequence).k(false);
                return;
            case 6:
                t7 t7Var = (t7) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                MessagesController messagesController = (MessagesController) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                long j16 = this.b;
                t7Var.getClass();
                if (tLObject4 != null) {
                    Utilities.stageQueue.postRunnable(new hh.m5(i10, messagesController, tLObject4));
                    return;
                }
                if (tL_error != null) {
                    t7Var.b.addPaidReactions((int) (-t7Var.h), t7Var.g, t7Var.c());
                    NotificationCenter.getInstance(t7Var.q.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(t7Var.b.getDialogId()), Integer.valueOf(t7Var.b.getId()), t7Var.b.messageOwner.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (t7Var.a.a >= 0) {
                            str2 = UserObject.getForcedFirstName(t7Var.c.getMessagesController().getUser(Long.valueOf(t7Var.a.a)));
                        } else {
                            TLRPC.Chat chat = t7Var.c.getMessagesController().getChat(Long.valueOf(-t7Var.a.a));
                            str2 = chat == null ? "" : chat.title;
                        }
                        String str6 = str2;
                        Context parentActivity = t7Var.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.C1;
                        }
                        if (parentActivity == null) {
                            parentActivity = ApplicationLoader.applicationContext;
                        }
                        new ea(parentActivity, t7Var.c.getResourceProvider(), j16, 5, str6, new s7(t7Var, j16, i13), 0L).show();
                    }
                    t7Var.q.T(false);
                    t7Var.q.P();
                    return;
                }
                return;
            case 7:
                jb jbVar = (jb) this.d;
                long j17 = this.b;
                u7 u7Var4 = (u7) this.e;
                MessageObject messageObject2 = (MessageObject) this.c;
                rn rnVar = (rn) this.f;
                h3.x xVar = jbVar.L;
                if (xVar == null) {
                    t7 d02 = u7Var4.d0(messageObject2, rnVar, j17, false, true, Long.valueOf(jbVar.A));
                    if (d02 == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new hh.m5(6, jbVar, d02));
                    return;
                }
                int intValue = jh.u0.a((jh.u0) xVar.b, Long.valueOf(j17)).intValue();
                jbVar.K = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    jbVar.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new pa(jbVar, i14));
                    return;
                }
            case 8:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.b, (TLObject) this.e, (TLRPC.TL_error) this.c, (Runnable) this.f);
                return;
            case 9:
                lr lrVar = (lr) this.d;
                long j18 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str7 = (String) this.c;
                TLObject tLObject5 = (TLObject) this.f;
                dq dqVar = new dq(j18, lrVar.J, null, lrVar.A, tL_chatBannedRights, str7, 1, true, false, null);
                dqVar.T0 = new tq(lrVar, tLObject5);
                lrVar.presentFragment(dqVar);
                return;
            case 10:
                lr lrVar2 = (lr) this.d;
                long j19 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str8 = (String) this.c;
                TLObject tLObject6 = (TLObject) this.f;
                dq dqVar2 = new dq(j19, lrVar2.J, tL_chatAdminRights, null, null, str8, 0, true, false, null);
                dqVar2.T0 = new uq(lrVar2, tLObject6);
                lrVar2.presentFragment(dqVar2);
                return;
            case 11:
                es esVar = (es) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                ArrayList arrayList = (ArrayList) this.c;
                long j20 = this.b;
                String str9 = (String) this.f;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    try {
                        database.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        while (i14 < arrayList.size()) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, ((Long) arrayList.get(i14)).longValue());
                            sQLitePreparedStatement.bindLong(2, j20);
                            sQLitePreparedStatement.bindString(3, str9);
                            sQLitePreparedStatement.bindInteger(4, i14);
                            sQLitePreparedStatement.step();
                            i14++;
                        }
                        break;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        break;
                    }
                } finally {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                }
            case 12:
                es esVar2 = (es) this.d;
                ArrayList<TLRPC.User> arrayList2 = (ArrayList) this.e;
                long j21 = this.b;
                String str10 = (String) this.c;
                ds dsVar = (ds) this.f;
                MessagesController.getInstance(esVar2.a).putUsers(arrayList2, true);
                esVar2.h.addAll(arrayList2);
                esVar2.f = j21;
                esVar2.g = str10;
                esVar2.e = TextUtils.isEmpty(str10);
                esVar2.d = true;
                dsVar.run();
                return;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                long j22 = this.b;
                AccountInstance accountInstance = (AccountInstance) this.c;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.f;
                try {
                    b2Var2.dismiss();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                if (tLObject7 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject7;
                    k70.C = joinaspeers.peers;
                    k70.E = j22;
                    k70.D = SystemClock.elapsedRealtime();
                    k70.F = accountInstance.getCurrentAccount();
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
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                }
                photoEntry.coverSavedPosition = j23;
                photoEntry.coverPath = str11;
                photoEntry.coverPhoto = null;
                photoEntry.coverPhotoParentObject = null;
                photoViewer.m5.b.setLoading(false);
                au0 au0Var = photoViewer.d;
                if (au0Var != null) {
                    au0Var.W(photoViewer.L4);
                }
                xr0 xr0Var = photoViewer.c1;
                if (xr0Var != null) {
                    xr0Var.setImage(bitmap);
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
                for (int i18 = 0; i18 < arrayList3.size(); i18++) {
                    ((TL_stories.StoryItem) arrayList3.get(i18)).pinned = zArr2[i18];
                }
                profileActivity2.getMessagesController().getStoriesController().n0(j24, arrayList3, false);
                return;
        }
    }

    public /* synthetic */ k1(Object obj, long j10, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ k1(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = j10;
        this.c = obj3;
        this.f = obj4;
    }

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.b = j10;
        this.f = obj4;
    }

    public /* synthetic */ k1(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = obj3;
        this.f = obj4;
        this.b = j10;
    }
}
