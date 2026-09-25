package org.telegram.messenger.voip;

import ai.o1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import ci.e4;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.z5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ar;
import org.telegram.ui.br;
import org.telegram.ui.kq;
import org.telegram.ui.pr;
import org.telegram.ui.rs0;
import org.telegram.ui.tu0;
import org.telegram.ui.wn;
import xh.r1;
import xh.s1;
import xh.w0;
import yh.k5;
import yh.l7;
import yh.o8;
import yh.q5;
import yh.r5;
import yh.s5;
import yh.x7;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ f(Object obj, long j3, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j3;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0557, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.qs(r2, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0560, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0554, code lost:
    
        if (r5 == null) goto L163;
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
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.b, (TLObject) this.c, (TLRPC.TL_error) this.e, (Runnable) this.f);
                return;
            case 1:
                pr prVar = (pr) this.d;
                long j3 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str3 = (String) this.f;
                TLObject tLObject = (TLObject) this.c;
                kq kqVar = new kq(j3, prVar.N, null, prVar.E, tL_chatBannedRights, str3, 1, true, false, null);
                kqVar.X0 = new ar(prVar, tLObject);
                prVar.presentFragment(kqVar);
                return;
            case 2:
                pr prVar2 = (pr) this.d;
                long j10 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str4 = (String) this.f;
                TLObject tLObject2 = (TLObject) this.c;
                kq kqVar2 = new kq(j10, prVar2.N, tL_chatAdminRights, null, null, str4, 0, true, false, null);
                kqVar2.X0 = new br(prVar2, tLObject2);
                prVar2.presentFragment(kqVar2);
                return;
            case 3:
                rs rsVar = (rs) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.c;
                ArrayList arrayList = (ArrayList) this.e;
                long j11 = this.b;
                String str5 = (String) this.f;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    try {
                        database.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, ((Long) arrayList.get(i14)).longValue());
                            sQLitePreparedStatement.bindLong(2, j11);
                            sQLitePreparedStatement.bindString(3, str5);
                            sQLitePreparedStatement.bindInteger(4, i14);
                            sQLitePreparedStatement.step();
                        }
                        break;
                    } catch (Exception e) {
                        FileLog.e(e);
                        break;
                    }
                } finally {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                }
            case 4:
                rs rsVar2 = (rs) this.d;
                ArrayList<TLRPC.User> arrayList2 = (ArrayList) this.c;
                long j12 = this.b;
                String str6 = (String) this.e;
                qs qsVar = (qs) this.f;
                MessagesController.getInstance(rsVar2.a).putUsers(arrayList2, true);
                rsVar2.h.addAll(arrayList2);
                rsVar2.f = j12;
                rsVar2.g = str6;
                rsVar2.e = TextUtils.isEmpty(str6);
                rsVar2.d = true;
                qsVar.run();
                return;
            case 5:
                a2 a2Var = (a2) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                long j13 = this.b;
                AccountInstance accountInstance = (AccountInstance) this.e;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.f;
                try {
                    a2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject3 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject3;
                    h80.G = joinaspeers.peers;
                    h80.I = j13;
                    h80.H = SystemClock.elapsedRealtime();
                    h80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    booleanCallback.run(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.c;
                long j14 = this.b;
                String str7 = (String) this.e;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (photoEntry.coverPath != null) {
                    try {
                        new File(photoEntry.coverPath).delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                photoEntry.coverSavedPosition = j14;
                photoEntry.coverPath = str7;
                photoEntry.coverPhoto = null;
                photoEntry.coverPhotoParentObject = null;
                photoViewer.q5.b.setLoading(false);
                tu0 tu0Var = photoViewer.d;
                if (tu0Var != null) {
                    tu0Var.W(photoViewer.P4);
                }
                rs0 rs0Var = photoViewer.g1;
                if (rs0Var != null) {
                    rs0Var.setImage(bitmap);
                }
                photoViewer.d3(0);
                CheckBox checkBox = photoViewer.N0;
                if (checkBox.x) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.c;
                ArrayList arrayList3 = (ArrayList) this.e;
                boolean[] zArr2 = (boolean[]) this.f;
                long j15 = this.b;
                zArr[0] = true;
                AndroidUtilities.cancelRunOnUIThread(profileActivity.x5);
                for (int i15 = 0; i15 < arrayList3.size(); i15++) {
                    ((TL_stories.StoryItem) arrayList3.get(i15)).pinned = zArr2[i15];
                }
                profileActivity.getMessagesController().getStoriesController().n0(j15, arrayList3, false);
                return;
            case 8:
                r1 r1Var = (r1) this.d;
                k5 k5Var = (k5) this.c;
                long j16 = this.b;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                Context context = (Context) this.f;
                w0 w0Var = r1Var.l0;
                int i16 = 0;
                while (i16 < i11) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i16 == i12) {
                        formatString = LocaleController.getString(R.string.Gift2StarsCollectibleInfo);
                    } else {
                        int i17 = R.string.Gift2StarsInfo;
                        Object[] objArr = new Object[i12];
                        objArr[i13] = r1Var.e0;
                        formatString = LocaleController.formatString(i17, objArr);
                    }
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(formatString));
                    String str8 = " ";
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    while (i13 < k5Var.l.size() && hashSet.size() < i10) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) k5Var.l.get(i13);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            str = str8;
                        } else {
                            str = str8;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i13++;
                        str8 = str;
                        i10 = 3;
                    }
                    String str9 = str8;
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatString(R.string.Gift2StarsInfoProfileLink, DialogObject.getShortName(j16)).replaceAll(str9, " "));
                        spannableStringBuilder2.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document2 = (TLRPC.Document) it.next();
                            spannableStringBuilder2.append((CharSequence) "\u2060e");
                            spannableStringBuilder2.setSpan(new z5(document2, w0Var.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new xh.p0(r1Var, callback, j16, 0)), true));
                    } else {
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new di.a(context, 5)), true));
                    }
                    TextView textView = i16 == 0 ? w0Var : r1Var.m0;
                    textView.setText(spannableStringBuilder);
                    textView.setMaxWidth(e4.a(textView.getText(), textView.getPaint()));
                    i16++;
                    i10 = 3;
                    i11 = 2;
                    i12 = 1;
                    i13 = 0;
                }
                return;
            case 9:
                yh.o oVar = (yh.o) this.d;
                a2 a2Var2 = (a2) this.e;
                TLObject tLObject4 = (TLObject) this.c;
                long j17 = this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f;
                oVar.getClass();
                a2Var2.dismiss();
                if (tLObject4 instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject4;
                    MessagesController.getInstance(oVar.a).putUsers(connectedstarrefbots.users, false);
                    while (i13 < connectedstarrefbots.connected_bots.size()) {
                        if (connectedstarrefbots.connected_bots.get(i13).bot_id == j17 && !connectedstarrefbots.connected_bots.get(i13).revoked) {
                            callback2.run(connectedstarrefbots.connected_bots.get(i13));
                            return;
                        }
                        i13++;
                    }
                }
                callback2.run(null);
                return;
            case 10:
                s5 s5Var = (s5) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                MessageObject messageObject = (MessageObject) this.e;
                long j18 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i18 = s5Var.a;
                if (!(tLObject5 instanceof TLRPC.TL_messages_messages)) {
                    runnable.run();
                    return;
                }
                TLRPC.TL_messages_messages tL_messages_messages = (TLRPC.TL_messages_messages) tLObject5;
                MessagesController.getInstance(i18).putUsers(tL_messages_messages.users, false);
                MessagesController.getInstance(i18).putChats(tL_messages_messages.chats, false);
                if (tL_messages_messages.messages.size() != 1 || !(tL_messages_messages.messages.get(0) instanceof TLRPC.TL_message) || !(tL_messages_messages.messages.get(0).media instanceof TLRPC.TL_messageMediaPaidMedia)) {
                    runnable.run();
                    return;
                } else {
                    messageObject.messageOwner = tL_messages_messages.messages.get(0);
                    s5Var.l0(messageObject, j18, runnable, true);
                    return;
                }
            case 11:
                s5 s5Var2 = (s5) this.d;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.e;
                long j19 = this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (s5Var2.e) {
                    s5Var2.g(j19, tLObject6, tL_textWithEntities, callback22);
                    return;
                } else {
                    s5.e("NO_BALANCE");
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
            case 12:
                s5 s5Var3 = (s5) this.d;
                Utilities.Callback2 callback23 = (Utilities.Callback2) this.c;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.e;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f;
                long j20 = this.b;
                if (s5Var3.e) {
                    s5Var3.h(tL_payments_paymentFormStarGift, starGift2, j20, null, true, callback23);
                    return;
                } else {
                    s5.e("NO_BALANCE");
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.c;
                CharSequence charSequence = (CharSequence) this.e;
                long j21 = this.b;
                String str10 = (String) this.f;
                AndroidUtilities.runOnUIThread(new s1(profileActivity2, i11), 200L);
                xc a02 = xc.a0(profileActivity2);
                TLRPC.Document document3 = starGift3.sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j21, str10));
                }
                a02.s(document3, string, charSequence).k(false);
                return;
            case 14:
                r5 r5Var = (r5) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                long j22 = this.b;
                r5Var.getClass();
                if (tLObject7 != null) {
                    Utilities.stageQueue.postRunnable(new u2.p0(29, messagesController, tLObject7));
                    return;
                }
                if (tL_error != null) {
                    r5Var.b.addPaidReactions((int) (-r5Var.h), r5Var.g, r5Var.c());
                    NotificationCenter.getInstance(r5Var.q.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(r5Var.b.getDialogId()), Integer.valueOf(r5Var.b.getId()), r5Var.b.messageOwner.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (r5Var.a.a >= 0) {
                            str2 = UserObject.getForcedFirstName(r5Var.c.getMessagesController().getUser(Long.valueOf(r5Var.a.a)));
                        } else {
                            TLRPC.Chat chat = r5Var.c.getMessagesController().getChat(Long.valueOf(-r5Var.a.a));
                            str2 = chat == null ? "" : chat.title;
                        }
                        String str11 = str2;
                        Context parentActivity = r5Var.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.G1;
                        }
                        if (parentActivity == null) {
                            parentActivity = ApplicationLoader.applicationContext;
                        }
                        new l7(parentActivity, r5Var.c.getResourceProvider(), j22, 5, str11, new q5(r5Var, j22, i12), 0L).show();
                    }
                    r5Var.q.T(false);
                    r5Var.q.P();
                    return;
                }
                return;
            default:
                o8 o8Var = (o8) this.d;
                long j23 = this.b;
                s5 s5Var4 = (s5) this.c;
                MessageObject messageObject2 = (MessageObject) this.e;
                wn wnVar = (wn) this.f;
                a1.c cVar = o8Var.P;
                if (cVar == null) {
                    r5 d02 = s5Var4.d0(messageObject2, wnVar, j23, false, true, Long.valueOf(o8Var.E));
                    if (d02 == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new yh.z5(i12, o8Var, d02));
                    return;
                }
                int intValue = o1.a((o1) cVar.b, Long.valueOf(j23)).intValue();
                o8Var.O = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    o8Var.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new x7(o8Var, i13));
                    return;
                }
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, long j3, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.b = j3;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, long j3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.b = j3;
        this.f = obj4;
    }

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, long j3, int i10) {
        this.a = i10;
        this.d = obj;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = j3;
    }

    public /* synthetic */ f(pr prVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.a = i10;
        this.d = prVar;
        this.b = j3;
        this.e = tLObject;
        this.f = str;
        this.c = tLObject2;
    }

    public /* synthetic */ f(yh.o oVar, a2 a2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.a = 9;
        this.d = oVar;
        this.e = a2Var;
        this.c = tLObject;
        this.b = j3;
        this.f = callback;
    }

    public /* synthetic */ f(r5 r5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.a = 14;
        this.d = r5Var;
        this.c = tLObject;
        this.f = messagesController;
        this.e = tL_error;
        this.b = j3;
    }

    public /* synthetic */ f(s5 s5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = 11;
        this.d = s5Var;
        this.e = callback2;
        this.b = j3;
        this.c = tLObject;
        this.f = tL_textWithEntities;
    }
}
