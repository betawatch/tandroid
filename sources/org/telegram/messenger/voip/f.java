package org.telegram.messenger.voip;

import ai.o1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.widget.TextView;
import ci.f4;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.qs;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.x5;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bo;
import org.telegram.ui.bt0;
import org.telegram.ui.dv0;
import org.telegram.ui.fr;
import org.telegram.ui.gr;
import org.telegram.ui.pq;
import org.telegram.ui.ur;
import xh.q1;
import xh.r1;
import yh.n5;
import yh.n7;
import yh.q8;
import yh.t5;
import yh.u5;
import yh.v5;
import yh.z7;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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

    /* JADX WARN: Code restructure failed: missing block: B:184:0x0559, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ps(r2, 1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0562, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0556, code lost:
    
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
                ur urVar = (ur) this.d;
                long j3 = this.b;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str3 = (String) this.f;
                TLObject tLObject = (TLObject) this.c;
                pq pqVar = new pq(j3, urVar.N, null, urVar.E, tL_chatBannedRights, str3, 1, true, false, null);
                pqVar.X0 = new fr(urVar, tLObject);
                urVar.presentFragment(pqVar);
                return;
            case 2:
                ur urVar2 = (ur) this.d;
                long j10 = this.b;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str4 = (String) this.f;
                TLObject tLObject2 = (TLObject) this.c;
                pq pqVar2 = new pq(j10, urVar2.N, tL_chatAdminRights, null, null, str4, 0, true, false, null);
                pqVar2.X0 = new gr(urVar2, tLObject2);
                urVar2.presentFragment(pqVar2);
                return;
            case 3:
                qs qsVar = (qs) this.d;
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
                qs qsVar2 = (qs) this.d;
                ArrayList<TLRPC.User> arrayList2 = (ArrayList) this.c;
                long j12 = this.b;
                String str6 = (String) this.e;
                ps psVar = (ps) this.f;
                MessagesController.getInstance(qsVar2.a).putUsers(arrayList2, true);
                qsVar2.h.addAll(arrayList2);
                qsVar2.f = j12;
                qsVar2.g = str6;
                qsVar2.e = TextUtils.isEmpty(str6);
                qsVar2.d = true;
                psVar.run();
                return;
            case 5:
                c2 c2Var = (c2) this.d;
                TLObject tLObject3 = (TLObject) this.c;
                long j13 = this.b;
                AccountInstance accountInstance = (AccountInstance) this.e;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.f;
                try {
                    c2Var.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject3 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject3;
                    w70.G = joinaspeers.peers;
                    w70.I = j13;
                    w70.H = SystemClock.elapsedRealtime();
                    w70.J = accountInstance.getCurrentAccount();
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
                dv0 dv0Var = photoViewer.d;
                if (dv0Var != null) {
                    dv0Var.W(photoViewer.P4);
                }
                bt0 bt0Var = photoViewer.g1;
                if (bt0Var != null) {
                    bt0Var.setImage(bitmap);
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
                q1 q1Var = (q1) this.d;
                n5 n5Var = (n5) this.c;
                long j16 = this.b;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                Context context = (Context) this.f;
                xh.v0 v0Var = q1Var.l0;
                int i16 = 0;
                while (i16 < i11) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i16 == i12) {
                        formatString = LocaleController.getString(R.string.Gift2StarsCollectibleInfo);
                    } else {
                        int i17 = R.string.Gift2StarsInfo;
                        Object[] objArr = new Object[i12];
                        objArr[i13] = q1Var.e0;
                        formatString = LocaleController.formatString(i17, objArr);
                    }
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(formatString));
                    String str8 = " ";
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    while (i13 < n5Var.l.size() && hashSet.size() < i10) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) n5Var.l.get(i13);
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
                            spannableStringBuilder2.setSpan(new x5(document2, v0Var.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new xh.o0(q1Var, callback, j16, 0)), true));
                    } else {
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new di.a(context, 5)), true));
                    }
                    TextView textView = i16 == 0 ? v0Var : q1Var.m0;
                    textView.setText(spannableStringBuilder);
                    textView.setMaxWidth(f4.a(textView.getText(), textView.getPaint()));
                    i16++;
                    i10 = 3;
                    i11 = 2;
                    i12 = 1;
                    i13 = 0;
                }
                return;
            case 9:
                yh.o oVar = (yh.o) this.d;
                c2 c2Var2 = (c2) this.e;
                TLObject tLObject4 = (TLObject) this.c;
                long j17 = this.b;
                Utilities.Callback callback2 = (Utilities.Callback) this.f;
                oVar.getClass();
                c2Var2.dismiss();
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
                v5 v5Var = (v5) this.d;
                TLObject tLObject5 = (TLObject) this.c;
                MessageObject messageObject = (MessageObject) this.e;
                long j18 = this.b;
                Runnable runnable = (Runnable) this.f;
                int i18 = v5Var.a;
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
                    v5Var.l0(messageObject, j18, runnable, true);
                    return;
                }
            case 11:
                v5 v5Var2 = (v5) this.d;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.e;
                long j19 = this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (v5Var2.e) {
                    v5Var2.g(j19, tLObject6, tL_textWithEntities, callback22);
                    return;
                } else {
                    v5.e("NO_BALANCE");
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
            case 12:
                v5 v5Var3 = (v5) this.d;
                Utilities.Callback2 callback23 = (Utilities.Callback2) this.c;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.e;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f;
                long j20 = this.b;
                if (v5Var3.e) {
                    v5Var3.h(tL_payments_paymentFormStarGift, starGift2, j20, null, true, callback23);
                    return;
                } else {
                    v5.e("NO_BALANCE");
                    callback23.run(Boolean.FALSE, null);
                    return;
                }
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.c;
                CharSequence charSequence = (CharSequence) this.e;
                long j21 = this.b;
                String str10 = (String) this.f;
                AndroidUtilities.runOnUIThread(new r1(profileActivity2, i11), 200L);
                vc a02 = vc.a0(profileActivity2);
                TLRPC.Document document3 = starGift3.sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j21, str10));
                }
                a02.s(document3, string, charSequence).k(false);
                return;
            case 14:
                u5 u5Var = (u5) this.d;
                TLObject tLObject7 = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.f;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                long j22 = this.b;
                u5Var.getClass();
                if (tLObject7 != null) {
                    Utilities.stageQueue.postRunnable(new uh.i(24, messagesController, tLObject7));
                    return;
                }
                if (tL_error != null) {
                    u5Var.b.addPaidReactions((int) (-u5Var.h), u5Var.g, u5Var.c());
                    NotificationCenter.getInstance(u5Var.q.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(u5Var.b.getDialogId()), Integer.valueOf(u5Var.b.getId()), u5Var.b.messageOwner.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (u5Var.a.a >= 0) {
                            str2 = UserObject.getForcedFirstName(u5Var.c.getMessagesController().getUser(Long.valueOf(u5Var.a.a)));
                        } else {
                            TLRPC.Chat chat = u5Var.c.getMessagesController().getChat(Long.valueOf(-u5Var.a.a));
                            str2 = chat == null ? "" : chat.title;
                        }
                        String str11 = str2;
                        Context parentActivity = u5Var.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.G1;
                        }
                        if (parentActivity == null) {
                            parentActivity = ApplicationLoader.applicationContext;
                        }
                        new n7(parentActivity, u5Var.c.getResourceProvider(), j22, 5, str11, new t5(u5Var, j22, i12), 0L).show();
                    }
                    u5Var.q.T(false);
                    u5Var.q.P();
                    return;
                }
                return;
            default:
                q8 q8Var = (q8) this.d;
                long j23 = this.b;
                v5 v5Var4 = (v5) this.c;
                MessageObject messageObject2 = (MessageObject) this.e;
                bo boVar = (bo) this.f;
                a1.c cVar = q8Var.P;
                if (cVar == null) {
                    u5 d02 = v5Var4.d0(messageObject2, boVar, j23, false, true, Long.valueOf(q8Var.E));
                    if (d02 == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new uh.i(26, q8Var, d02));
                    return;
                }
                int intValue = o1.a((o1) cVar.b, Long.valueOf(j23)).intValue();
                q8Var.O = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    q8Var.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new z7(q8Var, i13));
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

    public /* synthetic */ f(ur urVar, long j3, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.a = i10;
        this.d = urVar;
        this.b = j3;
        this.e = tLObject;
        this.f = str;
        this.c = tLObject2;
    }

    public /* synthetic */ f(yh.o oVar, c2 c2Var, TLObject tLObject, long j3, Utilities.Callback callback) {
        this.a = 9;
        this.d = oVar;
        this.e = c2Var;
        this.c = tLObject;
        this.b = j3;
        this.f = callback;
    }

    public /* synthetic */ f(u5 u5Var, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j3) {
        this.a = 14;
        this.d = u5Var;
        this.c = tLObject;
        this.f = messagesController;
        this.e = tL_error;
        this.b = j3;
    }

    public /* synthetic */ f(v5 v5Var, Utilities.Callback2 callback2, long j3, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.a = 11;
        this.d = v5Var;
        this.e = callback2;
        this.b = j3;
        this.c = tLObject;
        this.f = tL_textWithEntities;
    }
}
