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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        int i11 = 7;
        int i12 = 3;
        Object obj2 = null;
        int i13 = 1;
        int i14 = 0;
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
                yyVar.showDialog(new lk0(activity, !org.telegram.ui.Components.cf0.a(), new lw(activity, 0)));
                return;
            case 3:
                dq0 dq0Var = (dq0) obj3;
                Integer num = (Integer) obj;
                l10 l10Var = ((i10) obj4).e;
                if (!l10Var.getUserConfig().isPremium()) {
                    l10Var.showDialog(new sg.y0((org.telegram.ui.ActionBar.m2) l10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                l10Var.E = intValue;
                dq0Var.a(intValue, true);
                z00 z00Var = l10Var.I;
                if (z00Var != null) {
                    z00Var.d(!l10Var.getUserConfig().isPremium() ? -1 : l10Var.E, true);
                }
                l10Var.i0(true);
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
                jc0 jc0Var = (jc0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                jc0Var.c();
                if (user == null) {
                    return;
                }
                long j10 = userArr[0].id;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                jc0Var.u(new ic0(bundle2, user, userArr, j10), false);
                return;
            case 6:
                xj0 xj0Var = (xj0) obj4;
                String str = (String) obj3;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = xj0Var.f0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && xj0Var.S(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = xj0Var.r0;
                if (bool2 == null || !bool2.booleanValue()) {
                    xj0Var.V(true, true);
                    return;
                }
                mt mtVar = new mt(i11, xj0Var, hashSet);
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                if (str == null || str.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new rh.j(mtVar, 15));
                } else {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    i14 = connectionsManager.sendRequest(tL_contacts_search, new lj1(i12, messagesController, mtVar));
                }
                xj0Var.m0 = i14;
                return;
            case 7:
                xj0 xj0Var2 = (xj0) obj4;
                HashSet hashSet2 = (HashSet) obj3;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && xj0Var2.S(user3)) {
                            xj0Var2.f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                xj0Var2.V(true, true);
                return;
            case 8:
                ik0 ik0Var = (ik0) obj4;
                String str2 = (String) obj3;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    ik0Var.R.setImageDrawable(null);
                    ik0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new wc0(19, ik0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = ik0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(ik0Var.getThemedColor(org.telegram.ui.ActionBar.g6.v6), PorterDuff.Mode.SRC_IN));
                    ik0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        ik0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new wc0(20, ik0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        ik0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                ik0Var.y(false);
                return;
            case 9:
                ArrayList arrayList2 = (ArrayList) obj4;
                org.telegram.ui.Components.z9[] z9VarArr = (org.telegram.ui.Components.z9[]) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                    return;
                }
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
                        z9VarArr[i15].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                    }
                }
                return;
            case 10:
                ((String[]) obj4)[0] = (String) obj;
                ((ol0) obj3).run();
                return;
            case 11:
                sw0 sw0Var = (sw0) obj4;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj3;
                Long l10 = (Long) obj;
                sw0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                m2Var2.presentFragment(new ProfileActivity(bundle3, null));
                sw0Var.c(false);
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new us0(profileActivity, userFull, tL_birthday2, i12), 1024);
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
                uz0 uz0Var = new uz0(t11Var, 5);
                v11Var2.getClass();
                v11Var2.setDelegate(new u11(new Runnable[]{uz0Var}));
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
                hz0 hz0Var = (hz0) obj3;
                if (((Boolean) obj).booleanValue()) {
                    hz0Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.zc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 20:
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) obj4;
                org.telegram.ui.Wallet.g7 g7Var = (org.telegram.ui.Wallet.g7) obj3;
                String str6 = (String) obj;
                if (str6 != null) {
                    org.telegram.ui.Wallet.j0.i("disableBackupWithoutUpdatingPhrase: ".concat(str6));
                    g7Var.run(str6);
                    return;
                } else {
                    org.telegram.ui.Wallet.j0.E("sending disableBackup to server");
                    org.telegram.ui.Wallet.q2.a(j0Var.a, new fi.c(9), null, null, null, new bi.j0(i12, j0Var, g7Var), true, true, new nb0(obj2, i13));
                    return;
                }
            case 21:
                org.telegram.ui.Wallet.g0 g0Var = (org.telegram.ui.Wallet.g0) obj4;
                try {
                    ((Utilities.Callback) obj3).run((String) obj);
                    if (g0Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (g0Var != null) {
                        g0Var.close();
                    }
                }
            case 22:
                ((org.telegram.ui.Wallet.g0) obj4).close();
                ((org.telegram.ui.Wallet.a7) obj3).run((String) obj);
                return;
            case 23:
                org.telegram.ui.Wallet.e0 e0Var = (org.telegram.ui.Wallet.e0) obj4;
                org.telegram.ui.Wallet.c7 c7Var = (org.telegram.ui.Wallet.c7) obj3;
                String str7 = (String) obj;
                if (str7 == null) {
                    org.telegram.ui.Wallet.j0.E("prepare disable backup: done!");
                    c7Var.run(e0Var, null);
                    return;
                } else {
                    e0Var.close();
                    org.telegram.ui.Wallet.j0.i("prepare disable backup, failed to save secret phrase to local storage: ".concat(str7));
                    c7Var.run(null, str7);
                    return;
                }
            case 24:
                ((org.telegram.ui.Wallet.d2) obj4).h = false;
                ((org.telegram.messenger.mh) obj3).run(null, (String) obj);
                return;
            case 25:
                ((org.telegram.ui.Wallet.g0) obj4).close();
                ((org.telegram.ui.Wallet.o) obj3).run((String) obj);
                return;
            case 26:
                ((org.telegram.ui.Wallet.g0) obj4).close();
                ((org.telegram.ui.Wallet.o) obj3).run((String) obj);
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.k(7, (org.telegram.ui.Wallet.y1) obj4, (org.telegram.ui.Wallet.j) obj3, (String) obj));
                return;
            case 28:
                ((org.telegram.ui.Wallet.g0) obj4).close();
                ((mt) obj3).run((String) obj);
                return;
            default:
                org.telegram.ui.Wallet.z4 z4Var = (org.telegram.ui.Wallet.z4) obj4;
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) obj3;
                String str8 = (String) obj;
                z4Var.y0.setLoading(false);
                if ("NO_LOCAL_BACKUP".equalsIgnoreCase(str8)) {
                    org.telegram.ui.Wallet.z6 z6Var = new org.telegram.ui.Wallet.z6();
                    z6Var.s = j0Var2.w();
                    z4Var.presentFragment(z6Var);
                    return;
                } else if (str8 != null) {
                    org.telegram.ui.Components.zc.a0(z4Var).e0(str8, false);
                    return;
                } else {
                    z4Var.presentFragment(new org.telegram.ui.Wallet.r8());
                    return;
                }
        }
    }

    public /* synthetic */ mt(org.telegram.ui.Wallet.j0 j0Var, org.telegram.ui.Wallet.e0 e0Var, org.telegram.ui.Wallet.c7 c7Var) {
        this.a = 23;
        this.b = e0Var;
        this.c = c7Var;
    }
}
