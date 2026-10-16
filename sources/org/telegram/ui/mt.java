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
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mt implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mt(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Document document;
        s4.b1 K;
        int i10 = this.a;
        int i11 = 15;
        int i12 = 7;
        int i13 = 3;
        Object obj2 = null;
        int i14 = 1;
        int i15 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                xt xtVar = (xt) obj4;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj3;
                Long l4 = (Long) obj;
                xtVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                m2Var.presentFragment(new ProfileActivity(bundle, null));
                xtVar.p();
                return;
            case 1:
                tt ttVar = (tt) obj4;
                Boolean bool = (Boolean) obj;
                ttVar.getClass();
                ((Utilities.Callback) obj3).run(bool);
                if (bool.booleanValue()) {
                    ttVar.a.p();
                    return;
                }
                return;
            case 2:
                yy yyVar = (yy) obj4;
                Activity activity = (Activity) obj3;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                yyVar.showDialog(new kk0(activity, !org.telegram.ui.Components.df0.a(), new kw(activity, 0)));
                return;
            case 3:
                bq0 bq0Var = (bq0) obj3;
                Integer num = (Integer) obj;
                k10 k10Var = ((h10) obj4).e;
                if (!k10Var.getUserConfig().isPremium()) {
                    k10Var.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) k10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                k10Var.E = intValue;
                bq0Var.a(intValue, true);
                y00 y00Var = k10Var.I;
                if (y00Var != null) {
                    y00Var.d(!k10Var.getUserConfig().isPremium() ? -1 : k10Var.E, true);
                }
                k10Var.i0(true);
                return;
            case 4:
                w50 w50Var = (w50) obj4;
                x50 x50Var = (x50) obj3;
                Bitmap bitmap = (Bitmap) obj;
                if (x50Var != null) {
                    w50Var.getClass();
                    x50Var.setVisibility(0);
                }
                w50Var.c = bitmap;
                Paint paint = new Paint(1);
                w50Var.d = paint;
                Bitmap bitmap2 = w50Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                w50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                w50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 5:
                ic0 ic0Var = (ic0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                ic0Var.c();
                if (user == null) {
                    return;
                }
                long j10 = userArr[0].id;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                ic0Var.u(new hc0(bundle2, user, userArr, j10), false);
                return;
            case 6:
                wj0 wj0Var = (wj0) obj4;
                String str = (String) obj3;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = wj0Var.f0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && wj0Var.S(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = wj0Var.r0;
                if (bool2 == null || !bool2.booleanValue()) {
                    wj0Var.V(true, true);
                    return;
                }
                mt mtVar = new mt(i12, wj0Var, hashSet);
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                if (str == null || str.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new ri.h0(mtVar, 15));
                } else {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    i15 = connectionsManager.sendRequest(tL_contacts_search, new kj1(i13, messagesController, mtVar));
                }
                wj0Var.m0 = i15;
                return;
            case 7:
                wj0 wj0Var2 = (wj0) obj4;
                HashSet hashSet2 = (HashSet) obj3;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && wj0Var2.S(user3)) {
                            wj0Var2.f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                wj0Var2.V(true, true);
                return;
            case 8:
                hk0 hk0Var = (hk0) obj4;
                String str2 = (String) obj3;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    hk0Var.R.setImageDrawable(null);
                    hk0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new se0(14, hk0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = hk0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(hk0Var.getThemedColor(org.telegram.ui.ActionBar.g6.v6), PorterDuff.Mode.SRC_IN));
                    hk0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        hk0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new se0(i11, hk0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        hk0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                hk0Var.y(false);
                return;
            case 9:
                ArrayList arrayList2 = (ArrayList) obj4;
                org.telegram.ui.Components.z9[] z9VarArr = (org.telegram.ui.Components.z9[]) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                    return;
                }
                for (int i16 = 0; i16 < arrayList2.size(); i16++) {
                    String str3 = (String) arrayList2.get(i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 < tL_messages_stickerSet.packs.size()) {
                            if (tL_messages_stickerSet.packs.get(i17).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i17).emoticon, str3)) {
                                i17++;
                            } else {
                                long longValue = tL_messages_stickerSet.packs.get(i17).documents.get(0).longValue();
                                for (int i18 = 0; i18 < tL_messages_stickerSet.documents.size(); i18++) {
                                    if (tL_messages_stickerSet.documents.get(i18).id == longValue) {
                                        document = tL_messages_stickerSet.documents.get(i18);
                                    }
                                }
                            }
                        }
                    }
                    document = null;
                    if (document != null) {
                        z9VarArr[i16].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                    }
                }
                return;
            case 10:
                ((String[]) obj4)[0] = (String) obj;
                ((nl0) obj3).run();
                return;
            case 11:
                rw0 rw0Var = (rw0) obj4;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj3;
                Long l10 = (Long) obj;
                rw0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                m2Var2.presentFragment(new ProfileActivity(bundle3, null));
                rw0Var.c(false);
                return;
            case 12:
                ProfileActivity profileActivity = (ProfileActivity) obj4;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj3;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().invalidateContentSettings();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new ts0(profileActivity, userFull, tL_birthday2, i13), 1024);
                return;
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                ((org.telegram.ui.ActionBar.a2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    di.kc D = di.kc.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    di.ac acVar = D.c1;
                    if (acVar != null) {
                        acVar.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 14:
                t11 t11Var = (t11) obj4;
                String str4 = (String) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = r71.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a1.g.v("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = w11.s;
                    FileLog.e(v.toString());
                    return;
                }
                v11 v11Var = new v11();
                t11Var.c = v11Var;
                t11Var.e.add(v11Var);
                int f7 = kz.f();
                t11Var.c.setAutoRepeat(0);
                v11 v11Var2 = t11Var.c;
                String str5 = f7 + "_" + f7 + "_precache";
                tz0 tz0Var = new tz0(t11Var, 5);
                v11Var2.getClass();
                v11Var2.setDelegate(new u11(new Runnable[]{tz0Var}));
                v11Var2.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                t11Var.c.onAttachedToWindow();
                t11Var.g[1] = true;
                t11Var.a();
                return;
            case 15:
                ((bi.f) obj4).run((HashSet) obj3);
                return;
            case 16:
                r51 r51Var = (r51) obj4;
                View view = (View) obj3;
                Bitmap bitmap3 = (Bitmap) obj;
                if (view != null) {
                    r51Var.getClass();
                    view.setVisibility(0);
                }
                r51Var.f = bitmap3;
                Paint paint2 = new Paint(1);
                r51Var.n = paint2;
                Bitmap bitmap4 = r51Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                r51Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                r51Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                r51Var.r = new Matrix();
                return;
            case 17:
                o91.X((o91) obj4, (TLRPC.TL_attachMenuBot) obj3);
                return;
            case 18:
                ThemeActivity themeActivity = (ThemeActivity) obj4;
                AtomicReference atomicReference = (AtomicReference) obj3;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                SharedConfig.recordViaSco = false;
                SharedConfig.saveConfig();
                themeActivity.N0 = true;
                ((Dialog) atomicReference.get()).dismiss();
                org.telegram.ui.Components.mm0 mm0Var = themeActivity.b;
                if (mm0Var == null || !mm0Var.G || (K = mm0Var.K(themeActivity.M)) == null) {
                    return;
                }
                themeActivity.a.v(K, themeActivity.M);
                return;
            case 19:
                ThemeActivity themeActivity2 = (ThemeActivity) obj4;
                i11 i11Var = (i11) obj3;
                if (((Boolean) obj).booleanValue()) {
                    i11Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.zc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 20:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj4;
                org.telegram.ui.Wallet.h7 h7Var = (org.telegram.ui.Wallet.h7) obj3;
                String str6 = (String) obj;
                if (str6 != null) {
                    org.telegram.ui.Wallet.k0.i("disableBackupWithoutUpdatingPhrase: ".concat(str6));
                    h7Var.run(str6);
                    return;
                } else {
                    org.telegram.ui.Wallet.k0.E("sending disableBackup to server");
                    org.telegram.ui.Wallet.r2.a(k0Var.a, new fi.c(9), null, null, null, new bi.j0(i13, k0Var, h7Var), true, true, new mb0(obj2, i14));
                    return;
                }
            case 21:
                org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj4;
                try {
                    ((Utilities.Callback) obj3).run((String) obj);
                    if (h0Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (h0Var != null) {
                        h0Var.close();
                    }
                }
            case 22:
                ((org.telegram.ui.Wallet.h0) obj4).close();
                ((org.telegram.ui.Wallet.b7) obj3).run((String) obj);
                return;
            case 23:
                org.telegram.ui.Wallet.f0 f0Var = (org.telegram.ui.Wallet.f0) obj4;
                org.telegram.ui.Wallet.d7 d7Var = (org.telegram.ui.Wallet.d7) obj3;
                String str7 = (String) obj;
                if (str7 == null) {
                    org.telegram.ui.Wallet.k0.E("prepare disable backup: done!");
                    d7Var.run(f0Var, null);
                    return;
                } else {
                    f0Var.close();
                    org.telegram.ui.Wallet.k0.i("prepare disable backup, failed to save secret phrase to local storage: ".concat(str7));
                    d7Var.run(null, str7);
                    return;
                }
            case 24:
                ((org.telegram.ui.Wallet.e2) obj4).h = false;
                ((org.telegram.messenger.mh) obj3).run(null, (String) obj);
                return;
            case 25:
                ((org.telegram.ui.Wallet.h0) obj4).close();
                ((org.telegram.ui.Wallet.p) obj3).run((String) obj);
                return;
            case 26:
                ((org.telegram.ui.Wallet.h0) obj4).close();
                ((org.telegram.ui.Wallet.p) obj3).run((String) obj);
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.l(7, (org.telegram.ui.Wallet.z1) obj4, (org.telegram.ui.Wallet.k) obj3, (String) obj));
                return;
            case 28:
                ((org.telegram.ui.Wallet.h0) obj4).close();
                ((mt) obj3).run((String) obj);
                return;
            default:
                org.telegram.ui.Wallet.a5 a5Var = (org.telegram.ui.Wallet.a5) obj4;
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) obj3;
                String str8 = (String) obj;
                a5Var.y0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str8)) {
                    org.telegram.ui.Wallet.a7 a7Var = new org.telegram.ui.Wallet.a7();
                    a7Var.s = k0Var2.w();
                    a5Var.presentFragment(a7Var);
                    return;
                } else if (str8 != null) {
                    org.telegram.ui.Components.zc.a0(a5Var).e0(str8, false);
                    return;
                } else {
                    a5Var.presentFragment(new org.telegram.ui.Wallet.s8());
                    return;
                }
        }
    }

    public /* synthetic */ mt(org.telegram.ui.Wallet.k0 k0Var, org.telegram.ui.Wallet.f0 f0Var, org.telegram.ui.Wallet.d7 d7Var) {
        this.a = 23;
        this.b = f0Var;
        this.c = d7Var;
    }
}
