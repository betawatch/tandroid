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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class dt implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dt(int i10, Object obj, Object obj2) {
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
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                pt ptVar = (pt) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                ptVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                n2Var.presentFragment(new ProfileActivity(bundle, null));
                ptVar.p();
                break;
            case 1:
                lt ltVar = (lt) obj3;
                Boolean bool = (Boolean) obj;
                ltVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    ltVar.a.p();
                    break;
                }
                break;
            case 2:
                ry ryVar = (ry) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    ryVar.showDialog(new zj0(activity, !org.telegram.ui.Components.de0.c(), new dw(activity, 0)));
                    break;
                }
                break;
            case 3:
                rp0 rp0Var = (rp0) obj2;
                Integer num = (Integer) obj;
                c10 c10Var = ((z00) obj3).e;
                if (c10Var.getUserConfig().isPremium()) {
                    int intValue = num.intValue();
                    c10Var.E = intValue;
                    rp0Var.a(intValue, true);
                    q00 q00Var = c10Var.I;
                    if (q00Var != null) {
                        q00Var.d(!c10Var.getUserConfig().isPremium() ? -1 : c10Var.E, true);
                    }
                    c10Var.i0(true);
                    break;
                } else {
                    c10Var.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) c10Var, 35, true));
                    break;
                }
            case 4:
                o50 o50Var = (o50) obj3;
                p50 p50Var = (p50) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (p50Var != null) {
                    o50Var.getClass();
                    p50Var.setVisibility(0);
                }
                o50Var.c = bitmap;
                Paint paint = new Paint(1);
                o50Var.d = paint;
                Bitmap bitmap2 = o50Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                o50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.h6.I.q() ? -0.02f : -0.04f);
                o50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                break;
            case 5:
                ac0 ac0Var = (ac0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ac0Var.a();
                if (user != null) {
                    long j3 = userArr[0].id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.id);
                    ac0Var.n(new zb0(bundle2, user, userArr, j3), false);
                    break;
                }
                break;
            case 6:
                lj0 lj0Var = (lj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = lj0Var.f0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && lj0Var.R(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = lj0Var.r0;
                if (bool2 == null || !bool2.booleanValue()) {
                    lj0Var.U(true, true);
                    break;
                } else {
                    dt dtVar = new dt(7, lj0Var, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str == null || str.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new rg.w1(dtVar, 5));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i13 = connectionsManager.sendRequest(tL_contacts_search, new ui1(i11, messagesController, dtVar));
                    }
                    lj0Var.m0 = i13;
                    break;
                }
                break;
            case 7:
                lj0 lj0Var2 = (lj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && lj0Var2.R(user3)) {
                            lj0Var2.f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                lj0Var2.U(true, true);
                break;
            case 8:
                wj0 wj0Var = (wj0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    wj0Var.R.setImageDrawable(null);
                    wj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new ia0(25, wj0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = wj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(wj0Var.getThemedColor(org.telegram.ui.ActionBar.h6.v6), PorterDuff.Mode.SRC_IN));
                    wj0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        wj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new ia0(26, wj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
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
                    for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                        String str3 = (String) arrayList2.get(i14);
                        int i15 = 0;
                        while (true) {
                            if (i15 < tL_messages_stickerSet.packs.size()) {
                                if (tL_messages_stickerSet.packs.get(i15).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i15).emoticon, str3)) {
                                    i15++;
                                } else {
                                    long longValue = tL_messages_stickerSet.packs.get(i15).documents.get(0).longValue();
                                    for (int i16 = 0; i16 < tL_messages_stickerSet.documents.size(); i16++) {
                                        if (tL_messages_stickerSet.documents.get(i16).id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i16);
                                        }
                                    }
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            w9VarArr[i14].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
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
                fw0 fw0Var = (fw0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                Long l10 = (Long) obj;
                fw0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                n2Var2.presentFragment(new ProfileActivity(bundle3, null));
                fw0Var.c(false);
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new gs0(profileActivity, userFull, tL_birthday2, i11), 1024);
                break;
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                ((org.telegram.ui.ActionBar.b2) obj2).dismiss();
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
                g11 g11Var = (g11) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = z61.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder w10 = a4.a.w("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = j11.s;
                    FileLog.e(w10.toString());
                    break;
                } else {
                    i11 i11Var = new i11();
                    g11Var.c = i11Var;
                    g11Var.e.add(i11Var);
                    int f7 = dz.f();
                    g11Var.c.setAutoRepeat(0);
                    i11 i11Var2 = g11Var.c;
                    String str5 = f7 + "_" + f7 + "_precache";
                    xz0 xz0Var = new xz0(g11Var, i12);
                    i11Var2.getClass();
                    i11Var2.setDelegate(new h11(new Runnable[]{xz0Var}));
                    i11Var2.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                    g11Var.c.onAttachedToWindow();
                    g11Var.g[1] = true;
                    g11Var.a();
                    break;
                }
            case 15:
                ((ai.i) obj3).run((HashSet) obj2);
                break;
            case 16:
                a51 a51Var = (a51) obj3;
                View view = (View) obj2;
                Bitmap bitmap3 = (Bitmap) obj;
                if (view != null) {
                    a51Var.getClass();
                    view.setVisibility(0);
                }
                a51Var.f = bitmap3;
                Paint paint2 = new Paint(1);
                a51Var.n = paint2;
                Bitmap bitmap4 = a51Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                a51Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.h6.I.q() ? -0.02f : -0.04f);
                a51Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                a51Var.r = new Matrix();
                break;
            case 17:
                x81.X((x81) obj3, (TLRPC.TL_attachMenuBot) obj2);
                break;
            case 18:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.ml0 ml0Var = themeActivity.b;
                    if (ml0Var != null && ml0Var.G && (K = ml0Var.K(themeActivity.M)) != null) {
                        themeActivity.a.v(K, themeActivity.M);
                        break;
                    }
                }
                break;
            case 19:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                by0 by0Var = (by0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    by0Var.run();
                    break;
                } else {
                    org.telegram.ui.Components.xc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 20:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) obj3;
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                y1Var.getClass();
                ((org.telegram.ui.web.g1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = y1Var.e;
                if (callback != null) {
                    y1Var.finishFragment();
                    callback.run(c1Var);
                    break;
                } else {
                    nf.f.s(y1Var.getParentActivity(), c1Var.c);
                    break;
                }
            case 21:
                org.telegram.ui.web.h2 h2Var = (org.telegram.ui.web.h2) obj3;
                h2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fr0(h2Var, (org.telegram.ui.web.g2) obj2, (Bitmap) obj, 20));
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
                if (((Object[]) obj)[1] == ((yh.l5) obj3)) {
                    fVar.run();
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str6 = (String) obj;
                yh.k5 k5Var = nr0Var.e;
                int i17 = tL_starGiftCollection.collection_id;
                k5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i18 = k5Var.a;
                updatestargiftcollection.peer = MessagesController.getInstance(i18).getInputPeer(k5Var.b);
                updatestargiftcollection.collection_id = i17;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str6;
                ConnectionsManager.getInstance(i18).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str6;
                nr0Var.f(true);
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
                yh.y3 y3Var = (yh.y3) obj3;
                String str7 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                yh.v3 v3Var = y3Var.e0;
                ei.k[] kVarArr = y3Var.s0;
                ci.d dVar = y3Var.j0;
                if (stargiftupgradepreview != null) {
                    v3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    y3Var.q2(1, false, null);
                    v3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str7), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    y3Var.u0.setVisibility(8);
                    y3Var.t0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new yh.u0(y3Var, i12));
                    y3Var.show();
                    break;
                }
                break;
            case 27:
                yh.y3.m0((yh.y3) obj3, (org.telegram.ui.ActionBar.b2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 28:
                yh.y2 y2Var = (yh.y2) obj3;
                y2Var.getClass();
                ((yh.v2) obj2).a((TL_stars.StarGift) obj, true);
                y2Var.d(true);
                break;
            default:
                yh.d3 d3Var = (yh.d3) obj3;
                zf.b bVar = (zf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                nf.e eVar = d3Var.n;
                if (eVar != null && bVar == d3Var.q) {
                    eVar.c(false);
                }
                d3Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    d3Var.o.put(bVar, new yh.b3(bVar, tL_payments_paymentFormStarGift));
                    d3Var.a(true);
                    break;
                }
                break;
        }
    }
}
