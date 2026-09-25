package org.telegram.ui;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bt implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bt(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Document document;
        s4.c1 K;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 4;
        int i13 = 0;
        int i14 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                nt ntVar = (nt) obj3;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj2;
                Long l4 = (Long) obj;
                ntVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                m2Var.presentFragment(new ProfileActivity(bundle, null));
                ntVar.p();
                break;
            case 1:
                jt jtVar = (jt) obj3;
                Boolean bool = (Boolean) obj;
                jtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    jtVar.a.p();
                    break;
                }
                break;
            case 2:
                qy qyVar = (qy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    qyVar.showDialog(new zj0(activity, !org.telegram.ui.Components.ne0.c(), new cw(activity, 0)));
                    break;
                }
                break;
            case 3:
                qp0 qp0Var = (qp0) obj2;
                Integer num = (Integer) obj;
                b10 b10Var = ((y00) obj3).e;
                if (b10Var.getUserConfig().isPremium()) {
                    int intValue = num.intValue();
                    b10Var.E = intValue;
                    qp0Var.a(intValue, true);
                    p00 p00Var = b10Var.I;
                    if (p00Var != null) {
                        p00Var.d(!b10Var.getUserConfig().isPremium() ? -1 : b10Var.E, true);
                    }
                    b10Var.i0(true);
                    break;
                } else {
                    b10Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) b10Var, 35, true));
                    break;
                }
            case 4:
                m50 m50Var = (m50) obj3;
                n50 n50Var = (n50) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (n50Var != null) {
                    m50Var.getClass();
                    n50Var.setVisibility(0);
                }
                m50Var.c = bitmap;
                Paint paint = new Paint(1);
                m50Var.d = paint;
                Bitmap bitmap2 = m50Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                m50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? -0.02f : -0.04f);
                m50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 5:
                zb0 zb0Var = (zb0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                zb0Var.a();
                if (user != null) {
                    long j3 = userArr[0].id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.id);
                    zb0Var.n(new yb0(bundle2, user, userArr, j3), false);
                    break;
                }
                break;
            case 6:
                kj0 kj0Var = (kj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = kj0Var.f0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && kj0Var.R(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = kj0Var.r0;
                if (bool2 == null || !bool2.booleanValue()) {
                    kj0Var.U(true, true);
                    break;
                } else {
                    bt btVar = new bt(7, kj0Var, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str == null || str.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new rg.q1(btVar, 6));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i13 = connectionsManager.sendRequest(tL_contacts_search, new ui1(i11, messagesController, btVar));
                    }
                    kj0Var.m0 = i13;
                    break;
                }
                break;
            case 7:
                kj0 kj0Var2 = (kj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && kj0Var2.R(user3)) {
                            kj0Var2.f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                kj0Var2.U(true, true);
                break;
            case 8:
                wj0 wj0Var = (wj0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    wj0Var.R.setImageDrawable(null);
                    wj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new sj0(i13, wj0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = wj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(wj0Var.getThemedColor(org.telegram.ui.ActionBar.h6.v6), PorterDuff.Mode.SRC_IN));
                    wj0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        wj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new sj0(i14, wj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        wj0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                wj0Var.w(false);
                break;
            case 9:
                ArrayList arrayList2 = (ArrayList) obj3;
                org.telegram.ui.Components.w9[] w9VarArr = (org.telegram.ui.Components.w9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                        String str3 = (String) arrayList2.get(i15);
                        int i16 = 0;
                        while (true) {
                            if (i16 < tL_messages_stickerSet.packs.size()) {
                                if (tL_messages_stickerSet.packs.get(i16).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i16).emoticon, str3)) {
                                    i16++;
                                } else {
                                    long longValue = tL_messages_stickerSet.packs.get(i16).documents.get(0).longValue();
                                    for (int i17 = 0; i17 < tL_messages_stickerSet.documents.size(); i17++) {
                                        if (tL_messages_stickerSet.documents.get(i17).id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i17);
                                        }
                                    }
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            w9VarArr[i15].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 10:
                ((String[]) obj3)[0] = (String) obj;
                ((al0) obj2).run();
                break;
            case 11:
                dw0 dw0Var = (dw0) obj3;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                Long l10 = (Long) obj;
                dw0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                m2Var2.presentFragment(new ProfileActivity(bundle3, null));
                dw0Var.c(false);
                break;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().invalidateContentSettings();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new fs0(profileActivity, userFull, tL_birthday2, i11), 1024);
                break;
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                ((org.telegram.ui.ActionBar.a2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.lc E = ci.lc.E(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    E.N = a2;
                    ci.bc bcVar = E.c1;
                    if (bcVar != null) {
                        bcVar.setDialogId(a2);
                    }
                    E.R(null);
                    break;
                }
                break;
            case 14:
                e11 e11Var = (e11) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = a71.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder w10 = a4.a.w("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = h11.s;
                    FileLog.e(w10.toString());
                    break;
                } else {
                    g11 g11Var = new g11();
                    e11Var.c = g11Var;
                    e11Var.e.add(g11Var);
                    int f7 = cz.f();
                    e11Var.c.setAutoRepeat(0);
                    g11 g11Var2 = e11Var.c;
                    String str5 = f7 + "_" + f7 + "_precache";
                    vz0 vz0Var = new vz0(e11Var, i12);
                    g11Var2.getClass();
                    g11Var2.setDelegate(new f11(new Runnable[]{vz0Var}));
                    g11Var2.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                    e11Var.c.onAttachedToWindow();
                    e11Var.g[1] = true;
                    e11Var.a();
                    break;
                }
            case 15:
                ((ai.i) obj3).run((HashSet) obj2);
                break;
            case 16:
                b51 b51Var = (b51) obj3;
                View view = (View) obj2;
                Bitmap bitmap3 = (Bitmap) obj;
                if (view != null) {
                    b51Var.getClass();
                    view.setVisibility(0);
                }
                b51Var.f = bitmap3;
                Paint paint2 = new Paint(1);
                b51Var.n = paint2;
                Bitmap bitmap4 = b51Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                b51Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? -0.02f : -0.04f);
                b51Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                b51Var.r = new Matrix();
                break;
            case 17:
                z81.X((z81) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
            case 18:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.wl0 wl0Var = themeActivity.b;
                    if (wl0Var != null && wl0Var.G && (K = wl0Var.K(themeActivity.M)) != null) {
                        themeActivity.a.v(K, themeActivity.M);
                        break;
                    }
                }
                break;
            case 19:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                p81 p81Var = (p81) obj2;
                if (((Boolean) obj).booleanValue()) {
                    p81Var.run();
                    break;
                } else {
                    org.telegram.ui.Components.xc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 20:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj3;
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                z1Var.getClass();
                ((org.telegram.ui.web.g1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = z1Var.e;
                if (callback != null) {
                    z1Var.finishFragment();
                    callback.run(c1Var);
                    break;
                } else {
                    nf.f.s(z1Var.getParentActivity(), c1Var.c);
                    break;
                }
            case 21:
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) obj3;
                i2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.cn0(i2Var, (org.telegram.ui.web.h2) obj2, (Bitmap) obj, 23));
                break;
            case 22:
                xh.r1 r1Var = (xh.r1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Boolean bool3 = (Boolean) obj;
                r1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool3);
                }
                if (bool3.booleanValue()) {
                    r1Var.skipDismissAnimation();
                }
                r1Var.dismiss();
                break;
            case 23:
                org.telegram.messenger.voip.f fVar = (org.telegram.messenger.voip.f) obj2;
                if (((Object[]) obj)[1] == ((yh.k5) obj3)) {
                    fVar.run();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.zr0 zr0Var = (org.telegram.ui.Components.zr0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str6 = (String) obj;
                yh.j5 j5Var = zr0Var.e;
                int i18 = tL_starGiftCollection.collection_id;
                j5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i19 = j5Var.a;
                updatestargiftcollection.peer = MessagesController.getInstance(i19).getInputPeer(j5Var.b);
                updatestargiftcollection.collection_id = i18;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str6;
                ConnectionsManager.getInstance(i19).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str6;
                zr0Var.f(true);
                break;
            case 25:
                xh.z4 z4Var = (xh.z4) obj3;
                TLRPC.User user5 = (TLRPC.User) obj2;
                long j10 = z4Var.Z;
                Runnable runnable = z4Var.g0;
                if (runnable != null) {
                    runnable.run();
                }
                z4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new xh.q4(i13, user5), 250L);
                MessagesController.getInstance(z4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                break;
            case 26:
                yh.x3 x3Var = (yh.x3) obj3;
                String str7 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                yh.u3 u3Var = x3Var.e0;
                ei.k[] kVarArr = x3Var.s0;
                ci.d dVar = x3Var.j0;
                if (stargiftupgradepreview != null) {
                    u3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    x3Var.q2(1, false, null);
                    u3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str7), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    x3Var.u0.setVisibility(8);
                    x3Var.t0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new yh.u0(x3Var, i12));
                    x3Var.show();
                    break;
                }
                break;
            case 27:
                yh.x3.m0((yh.x3) obj3, (org.telegram.ui.ActionBar.a2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 28:
                yh.x2 x2Var = (yh.x2) obj3;
                x2Var.getClass();
                ((yh.v2) obj2).a((TL_stars.StarGift) obj, true);
                x2Var.d(true);
                break;
            default:
                yh.c3 c3Var = (yh.c3) obj3;
                zf.b bVar = (zf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                nf.e eVar = c3Var.n;
                if (eVar != null && bVar == c3Var.q) {
                    eVar.c(false);
                }
                c3Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    c3Var.o.put(bVar, new yh.a3(bVar, tL_payments_paymentFormStarGift));
                    c3Var.a(true);
                    break;
                }
                break;
        }
    }
}
