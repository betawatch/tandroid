package ai;

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
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Components.zs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bq;
import org.telegram.ui.fs0;
import org.telegram.ui.hr;
import org.telegram.ui.hu0;
import org.telegram.ui.qn;
import org.telegram.ui.sq;
import org.telegram.ui.tq;
import org.telegram.ui.yb0;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes4.dex */
public final /* synthetic */ class z implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ z(long j10, Runnable runnable, ConferenceCall conferenceCall, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 8;
        this.d = conferenceCall;
        this.c = j10;
        this.b = tLObject;
        this.e = tL_error;
        this.f = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02dc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02d0, code lost:
    
        if (r5 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02d3, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ys(r2, 1));
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        String formatString;
        String str2;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        int i10 = 3;
        int i11 = 2;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        int i12 = 1;
        int i13 = 0;
        switch (this.a) {
            case 0:
                k0 k0Var = (k0) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                TLObject tLObject = (TLObject) this.b;
                long j10 = this.c;
                Utilities.Callback callback = (Utilities.Callback) this.f;
                k0Var.getClass();
                b2Var.dismiss();
                if (tLObject instanceof TL_payments.connectedStarRefBots) {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    MessagesController.getInstance(k0Var.a).putUsers(connectedstarrefbots.users, false);
                    for (int i14 = 0; i14 < connectedstarrefbots.connected_bots.size(); i14++) {
                        if (connectedstarrefbots.connected_bots.get(i14).bot_id == j10 && !connectedstarrefbots.connected_bots.get(i14).revoked) {
                            callback.run(connectedstarrefbots.connected_bots.get(i14));
                            return;
                        }
                    }
                }
                callback.run(null);
                return;
            case 1:
                l7.n1((l7) this.d, (pf.c) this.e, (TLObject) this.b, this.c, (TLRPC.TL_error) this.f);
                return;
            case 2:
                ga gaVar = (ga) this.d;
                TLObject tLObject2 = (TLObject) this.b;
                MessageObject messageObject = (MessageObject) this.e;
                long j11 = this.c;
                Runnable runnable = (Runnable) this.f;
                int i15 = gaVar.a;
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
                    gaVar.l0(messageObject, j11, runnable, true);
                    return;
                }
            case 3:
                ga gaVar2 = (ga) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                long j12 = this.c;
                TLObject tLObject3 = (TLObject) this.b;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.f;
                if (gaVar2.e) {
                    gaVar2.g(j12, tLObject3, tL_textWithEntities, callback2);
                    return;
                } else {
                    ga.e("NO_BALANCE");
                    callback2.run(Boolean.FALSE, null);
                    return;
                }
            case 4:
                ga gaVar3 = (ga) this.d;
                Utilities.Callback2 callback22 = (Utilities.Callback2) this.e;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.b;
                TL_stars.StarGift starGift2 = (TL_stars.StarGift) this.f;
                long j13 = this.c;
                if (gaVar3.e) {
                    gaVar3.h(tL_payments_paymentFormStarGift, starGift2, j13, null, true, callback22);
                    return;
                } else {
                    ga.e("NO_BALANCE");
                    callback22.run(Boolean.FALSE, null);
                    return;
                }
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.d;
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) this.e;
                CharSequence charSequence = (CharSequence) this.b;
                long j14 = this.c;
                String str3 = (String) this.f;
                AndroidUtilities.runOnUIThread(new t8(profileActivity, 0), 200L);
                org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(profileActivity);
                TLRPC.Document document2 = starGift3.sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                if (charSequence == null) {
                    charSequence = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedChannelText", (int) j14, str3));
                }
                a02.s(document2, string, charSequence).k(false);
                return;
            case 6:
                fa faVar = (fa) this.d;
                TLObject tLObject4 = (TLObject) this.b;
                MessagesController messagesController = (MessagesController) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.f;
                long j15 = this.c;
                faVar.getClass();
                if (tLObject4 != null) {
                    Utilities.stageQueue.postRunnable(new a1.f(29, messagesController, tLObject4));
                    return;
                }
                if (tL_error != null) {
                    faVar.b.addPaidReactions((int) (-faVar.h), faVar.g, faVar.c());
                    NotificationCenter.getInstance(faVar.q.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.didUpdateReactions, Long.valueOf(faVar.b.getDialogId()), Integer.valueOf(faVar.b.getId()), faVar.b.messageOwner.reactions);
                    if ("BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (faVar.a.a >= 0) {
                            str = UserObject.getForcedFirstName(faVar.c.getMessagesController().getUser(Long.valueOf(faVar.a.a)));
                        } else {
                            TLRPC.Chat chat = faVar.c.getMessagesController().getChat(Long.valueOf(-faVar.a.a));
                            str = chat == null ? "" : chat.title;
                        }
                        String str4 = str;
                        Context parentActivity = faVar.c.getParentActivity();
                        if (parentActivity == null) {
                            parentActivity = LaunchActivity.H1;
                        }
                        if (parentActivity == null) {
                            parentActivity = ApplicationLoader.applicationContext;
                        }
                        new cd(parentActivity, faVar.c.getResourceProvider(), j15, 5, str4, new ea(faVar, j15, 1), 0L).show();
                    }
                    faVar.q.T(false);
                    faVar.q.P();
                    return;
                }
                return;
            case 7:
                le leVar = (le) this.d;
                long j16 = this.c;
                ga gaVar4 = (ga) this.e;
                MessageObject messageObject2 = (MessageObject) this.b;
                qn qnVar = (qn) this.f;
                a1.c cVar = leVar.Q;
                if (cVar == null) {
                    fa d02 = gaVar4.d0(messageObject2, qnVar, j16, false, true, Long.valueOf(leVar.E));
                    if (d02 == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new pa(1, leVar, d02));
                    return;
                }
                int intValue = ci.x0.a((ci.x0) cVar.b, Long.valueOf(j16)).intValue();
                leVar.P = intValue;
                if (intValue == Integer.MIN_VALUE) {
                    leVar.dismiss();
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new nd(leVar, 0));
                    return;
                }
            case 8:
                ((ConferenceCall) this.d).lambda$requestLastBlock$2(this.c, (TLObject) this.b, (TLRPC.TL_error) this.e, (Runnable) this.f);
                return;
            case 9:
                hr hrVar = (hr) this.d;
                long j17 = this.c;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = (TLRPC.TL_chatBannedRights) this.e;
                String str5 = (String) this.f;
                TLObject tLObject5 = (TLObject) this.b;
                bq bqVar = new bq(j17, hrVar.N, null, hrVar.E, tL_chatBannedRights, str5, 1, true, false, null);
                bqVar.X0 = new sq(hrVar, tLObject5);
                hrVar.presentFragment(bqVar);
                return;
            case 10:
                hr hrVar2 = (hr) this.d;
                long j18 = this.c;
                TLRPC.TL_chatAdminRights tL_chatAdminRights = (TLRPC.TL_chatAdminRights) this.e;
                String str6 = (String) this.f;
                TLObject tLObject6 = (TLObject) this.b;
                bq bqVar2 = new bq(j18, hrVar2.N, tL_chatAdminRights, null, null, str6, 0, true, false, null);
                bqVar2.X0 = new tq(hrVar2, tLObject6);
                hrVar2.presentFragment(bqVar2);
                return;
            case 11:
                zs zsVar = (zs) this.d;
                MessagesStorage messagesStorage = (MessagesStorage) this.e;
                ArrayList arrayList = (ArrayList) this.b;
                long j19 = this.c;
                String str7 = (String) this.f;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    try {
                        database.executeFast("DELETE FROM popular_bots").stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO popular_bots VALUES(?, ?, ?, ?)");
                        for (int i16 = 0; i16 < arrayList.size(); i16++) {
                            sQLitePreparedStatement.requery();
                            sQLitePreparedStatement.bindLong(1, ((Long) arrayList.get(i16)).longValue());
                            sQLitePreparedStatement.bindLong(2, j19);
                            sQLitePreparedStatement.bindString(3, str7);
                            sQLitePreparedStatement.bindInteger(4, i16);
                            sQLitePreparedStatement.step();
                        }
                        break;
                    } finally {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    break;
                }
            case 12:
                zs zsVar2 = (zs) this.d;
                ArrayList<TLRPC.User> arrayList2 = (ArrayList) this.e;
                long j20 = this.c;
                String str8 = (String) this.b;
                ys ysVar = (ys) this.f;
                MessagesController.getInstance(zsVar2.a).putUsers(arrayList2, true);
                zsVar2.h.addAll(arrayList2);
                zsVar2.f = j20;
                zsVar2.g = str8;
                zsVar2.e = TextUtils.isEmpty(str8);
                zsVar2.d = true;
                ysVar.run();
                return;
            case 13:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                TLObject tLObject7 = (TLObject) this.b;
                long j21 = this.c;
                AccountInstance accountInstance = (AccountInstance) this.d;
                MessagesStorage.BooleanCallback booleanCallback = (MessagesStorage.BooleanCallback) this.f;
                try {
                    b2Var2.dismiss();
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (tLObject7 != null) {
                    TL_phone.joinAsPeers joinaspeers = (TL_phone.joinAsPeers) tLObject7;
                    r80.G = joinaspeers.peers;
                    r80.I = j21;
                    r80.H = SystemClock.elapsedRealtime();
                    r80.J = accountInstance.getCurrentAccount();
                    accountInstance.getMessagesController().putChats(joinaspeers.chats, false);
                    accountInstance.getMessagesController().putUsers(joinaspeers.users, false);
                    booleanCallback.run(joinaspeers.peers.size() == 1);
                    return;
                }
                return;
            case 14:
                PhotoViewer photoViewer = (PhotoViewer) this.d;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.e;
                long j22 = this.c;
                String str9 = (String) this.b;
                Bitmap bitmap = (Bitmap) this.f;
                Drawable[] drawableArr = PhotoViewer.U8;
                if (photoEntry.coverPath != null) {
                    try {
                        new File(photoEntry.coverPath).delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                photoEntry.coverSavedPosition = j22;
                photoEntry.coverPath = str9;
                photoEntry.coverPhoto = null;
                photoEntry.coverPhotoParentObject = null;
                photoViewer.q5.b.setLoading(false);
                hu0 hu0Var = photoViewer.d;
                if (hu0Var != null) {
                    hu0Var.X(photoViewer.P4);
                }
                fs0 fs0Var = photoViewer.g1;
                if (fs0Var != null) {
                    fs0Var.setImage(bitmap);
                }
                photoViewer.e3(0);
                CheckBox checkBox = photoViewer.N0;
                if (checkBox.x) {
                    return;
                }
                checkBox.callOnClick();
                return;
            case 15:
                ProfileActivity profileActivity2 = (ProfileActivity) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ArrayList arrayList3 = (ArrayList) this.b;
                boolean[] zArr2 = (boolean[]) this.f;
                long j23 = this.c;
                zArr[0] = true;
                AndroidUtilities.cancelRunOnUIThread(profileActivity2.z5);
                for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                    ((TL_stories.StoryItem) arrayList3.get(i17)).pinned = zArr2[i17];
                }
                profileActivity2.getMessagesController().getStoriesController().n0(j23, arrayList3, false);
                return;
            default:
                yh.o1 o1Var = (yh.o1) this.d;
                y9 y9Var = (y9) this.e;
                long j24 = this.c;
                Utilities.Callback callback3 = (Utilities.Callback) this.f;
                Context context = (Context) this.b;
                yh.u0 u0Var = o1Var.l0;
                int i18 = 0;
                while (i18 < i11) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    if (i18 == i12) {
                        formatString = LocaleController.getString(R.string.Gift2StarsCollectibleInfo);
                    } else {
                        int i19 = R.string.Gift2StarsInfo;
                        Object[] objArr = new Object[i12];
                        objArr[i13] = o1Var.e0;
                        formatString = LocaleController.formatString(i19, objArr);
                    }
                    spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(formatString));
                    String str10 = " ";
                    spannableStringBuilder.append((CharSequence) " ");
                    HashSet hashSet = new HashSet();
                    HashSet hashSet2 = new HashSet();
                    int i20 = i13;
                    while (i13 < y9Var.l.size() && hashSet.size() < i10) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) y9Var.l.get(i13);
                        if (savedStarGift == null || (starGift = savedStarGift.gift) == null || (document = starGift.getDocument()) == null) {
                            str2 = str10;
                        } else {
                            str2 = str10;
                            if (!hashSet.contains(Long.valueOf(document.id))) {
                                hashSet2.add(document);
                                hashSet.add(Long.valueOf(document.id));
                            }
                        }
                        i13++;
                        str10 = str2;
                        i10 = 3;
                    }
                    String str11 = str10;
                    if (hashSet2.size() > 0) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                        int i21 = R.string.Gift2StarsInfoProfileLink;
                        Object[] objArr2 = new Object[1];
                        objArr2[i20] = DialogObject.getShortName(j24);
                        spannableStringBuilder2.append((CharSequence) LocaleController.formatString(i21, objArr2).replaceAll(str11, " "));
                        spannableStringBuilder2.append((CharSequence) " ");
                        Iterator it = hashSet2.iterator();
                        while (it.hasNext()) {
                            TLRPC.Document document3 = (TLRPC.Document) it.next();
                            spannableStringBuilder2.append((CharSequence) "\u2060e");
                            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.a6(document3, u0Var.getPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                        }
                        spannableStringBuilder2.append((CharSequence) " >");
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(spannableStringBuilder2, new yb0(o1Var, callback3, j24, 5)), true));
                    } else {
                        spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2StarsInfoLink), new ra(context, 12)), true));
                    }
                    TextView textView = i18 == 0 ? u0Var : o1Var.m0;
                    textView.setText(spannableStringBuilder);
                    textView.setMaxWidth(ei.x3.a(textView.getText(), textView.getPaint()));
                    i18++;
                    i13 = i20;
                    i10 = 3;
                    i11 = 2;
                    i12 = 1;
                }
                return;
        }
    }

    public /* synthetic */ z(fa faVar, TLObject tLObject, MessagesController messagesController, TLRPC.TL_error tL_error, long j10) {
        this.a = 6;
        this.d = faVar;
        this.b = tLObject;
        this.e = messagesController;
        this.f = tL_error;
        this.c = j10;
    }

    public /* synthetic */ z(ga gaVar, TLObject tLObject, MessageObject messageObject, long j10, Runnable runnable) {
        this.a = 2;
        this.d = gaVar;
        this.b = tLObject;
        this.e = messageObject;
        this.c = j10;
        this.f = runnable;
    }

    public /* synthetic */ z(le leVar, long j10, ga gaVar, MessageObject messageObject, qn qnVar) {
        this.a = 7;
        this.d = leVar;
        this.c = j10;
        this.e = gaVar;
        this.b = messageObject;
        this.f = qnVar;
    }

    public /* synthetic */ z(Object obj, Object obj2, long j10, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.c = j10;
        this.b = obj3;
        this.f = obj4;
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, long j10, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = j10;
        this.f = obj4;
    }

    public /* synthetic */ z(Object obj, Object obj2, Object obj3, Object obj4, long j10, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.f = obj4;
        this.c = j10;
    }

    public /* synthetic */ z(org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.a = 13;
        this.e = b2Var;
        this.b = tLObject;
        this.c = j10;
        this.d = accountInstance;
        this.f = booleanCallback;
    }

    public /* synthetic */ z(hr hrVar, long j10, TLObject tLObject, String str, TLObject tLObject2, int i10) {
        this.a = i10;
        this.d = hrVar;
        this.c = j10;
        this.e = tLObject;
        this.f = str;
        this.b = tLObject2;
    }

    public /* synthetic */ z(yh.o1 o1Var, y9 y9Var, long j10, Utilities.Callback callback, Context context) {
        this.a = 16;
        this.d = o1Var;
        this.e = y9Var;
        this.c = j10;
        this.f = callback;
        this.b = context;
    }
}
