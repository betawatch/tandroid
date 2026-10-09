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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ft implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ft(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Document document;
        s4.d1 K;
        int i10 = this.a;
        int i11 = 7;
        int i12 = 3;
        int i13 = 9;
        Object obj2 = null;
        int i14 = 1;
        int i15 = 0;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                rt rtVar = (rt) obj4;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj3;
                Long l4 = (Long) obj;
                rtVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                n2Var.presentFragment(new ProfileActivity(bundle, null));
                rtVar.p();
                return;
            case 1:
                nt ntVar = (nt) obj4;
                Boolean bool = (Boolean) obj;
                ntVar.getClass();
                ((Utilities.Callback) obj3).run(bool);
                if (bool.booleanValue()) {
                    ntVar.a.p();
                    return;
                }
                return;
            case 2:
                ty tyVar = (ty) obj4;
                Activity activity = (Activity) obj3;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                tyVar.showDialog(new gk0(activity, !org.telegram.ui.Components.ef0.a(), new fw(activity, 0)));
                return;
            case 3:
                xp0 xp0Var = (xp0) obj3;
                Integer num = (Integer) obj;
                f10 f10Var = ((c10) obj4).e;
                if (!f10Var.getUserConfig().isPremium()) {
                    f10Var.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) f10Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                f10Var.E = intValue;
                xp0Var.a(intValue, true);
                t00 t00Var = f10Var.I;
                if (t00Var != null) {
                    t00Var.d(!f10Var.getUserConfig().isPremium() ? -1 : f10Var.E, true);
                }
                f10Var.i0(true);
                return;
            case 4:
                p50 p50Var = (p50) obj4;
                q50 q50Var = (q50) obj3;
                Bitmap bitmap = (Bitmap) obj;
                if (q50Var != null) {
                    p50Var.getClass();
                    q50Var.setVisibility(0);
                }
                p50Var.c = bitmap;
                Paint paint = new Paint(1);
                p50Var.d = paint;
                Bitmap bitmap2 = p50Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                p50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.i6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.i6.I.q() ? -0.02f : -0.04f);
                p50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                return;
            case 5:
                ec0 ec0Var = (ec0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                ec0Var.c();
                if (user == null) {
                    return;
                }
                long j3 = userArr[0].id;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                ec0Var.u(new dc0(bundle2, user, userArr, j3), false);
                return;
            case 6:
                sj0 sj0Var = (sj0) obj4;
                String str = (String) obj3;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = sj0Var.f0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && sj0Var.S(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = sj0Var.r0;
                if (bool2 == null || !bool2.booleanValue()) {
                    sj0Var.V(true, true);
                    return;
                }
                ft ftVar = new ft(i11, sj0Var, hashSet);
                MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                if (str == null || str.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new rg.x1(ftVar, 9));
                } else {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    i15 = connectionsManager.sendRequest(tL_contacts_search, new ej1(i12, messagesController, ftVar));
                }
                sj0Var.m0 = i15;
                return;
            case 7:
                sj0 sj0Var2 = (sj0) obj4;
                HashSet hashSet2 = (HashSet) obj3;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && sj0Var2.S(user3)) {
                            sj0Var2.f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                sj0Var2.V(true, true);
                return;
            case 8:
                dk0 dk0Var = (dk0) obj4;
                String str2 = (String) obj3;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    dk0Var.R.setImageDrawable(null);
                    dk0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new tf0(8, dk0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = dk0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(dk0Var.getThemedColor(org.telegram.ui.ActionBar.i6.v6), PorterDuff.Mode.SRC_IN));
                    dk0Var.R.setImageDrawable(mutate);
                    if (user4.contact) {
                        dk0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new tf0(i13, dk0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        dk0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                dk0Var.y(false);
                return;
            case 9:
                ArrayList arrayList2 = (ArrayList) obj4;
                org.telegram.ui.Components.y9[] y9VarArr = (org.telegram.ui.Components.y9[]) obj3;
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
                        y9VarArr[i16].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                    }
                }
                return;
            case 10:
                ((String[]) obj4)[0] = (String) obj;
                ((jl0) obj3).run();
                return;
            case 11:
                mw0 mw0Var = (mw0) obj4;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj3;
                Long l10 = (Long) obj;
                mw0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                n2Var2.presentFragment(new ProfileActivity(bundle3, null));
                mw0Var.c(false);
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new ns0(profileActivity, userFull, tL_birthday2, i12), 1024);
                return;
            case 13:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                ((org.telegram.ui.ActionBar.b2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ci.lc D = ci.lc.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    ci.bc bcVar = D.c1;
                    if (bcVar != null) {
                        bcVar.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 14:
                m11 m11Var = (m11) obj4;
                String str4 = (String) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = k71.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder w10 = a1.g.w("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = p11.s;
                    FileLog.e(w10.toString());
                    return;
                }
                o11 o11Var = new o11();
                m11Var.c = o11Var;
                m11Var.e.add(o11Var);
                int f7 = fz.f();
                m11Var.c.setAutoRepeat(0);
                o11 o11Var2 = m11Var.c;
                String str5 = f7 + "_" + f7 + "_precache";
                nz0 nz0Var = new nz0(m11Var, 5);
                o11Var2.getClass();
                o11Var2.setDelegate(new n11(new Runnable[]{nz0Var}));
                o11Var2.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                m11Var.c.onAttachedToWindow();
                m11Var.g[1] = true;
                m11Var.a();
                return;
            case 15:
                ((ai.i) obj4).run((HashSet) obj3);
                return;
            case 16:
                k51 k51Var = (k51) obj4;
                View view = (View) obj3;
                Bitmap bitmap3 = (Bitmap) obj;
                if (view != null) {
                    k51Var.getClass();
                    view.setVisibility(0);
                }
                k51Var.f = bitmap3;
                Paint paint2 = new Paint(1);
                k51Var.n = paint2;
                Bitmap bitmap4 = k51Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap4, tileMode2, tileMode2);
                k51Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.i6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.i6.I.q() ? -0.02f : -0.04f);
                k51Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix2));
                k51Var.r = new Matrix();
                return;
            case 17:
                i91.X((i91) obj4, (TLRPC.TL_attachMenuBot) obj3);
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
                org.telegram.ui.Components.qm0 qm0Var = themeActivity.b;
                if (qm0Var == null || !qm0Var.G || (K = qm0Var.K(themeActivity.M)) == null) {
                    return;
                }
                themeActivity.a.v(K, themeActivity.M);
                return;
            case 19:
                ThemeActivity themeActivity2 = (ThemeActivity) obj4;
                n31 n31Var = (n31) obj3;
                if (((Boolean) obj).booleanValue()) {
                    n31Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.ad.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
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
                    org.telegram.ui.Wallet.q2.a(k0Var.a, new ei.c(i13), null, null, null, new ai.q0(i12, k0Var, h7Var), true, true, new ib0(obj2, i14));
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
                ((org.telegram.ui.Wallet.d2) obj4).h = false;
                ((org.telegram.messenger.jh) obj3).run(null, (String) obj);
                return;
            case 25:
                ((org.telegram.ui.Wallet.h0) obj4).close();
                ((org.telegram.ui.Wallet.o) obj3).run((String) obj);
                return;
            case 26:
                ((org.telegram.ui.Wallet.h0) obj4).close();
                ((org.telegram.ui.Wallet.o) obj3).run((String) obj);
                return;
            case 27:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Wallet.k(7, (org.telegram.ui.Wallet.y1) obj4, (org.telegram.ui.Wallet.j) obj3, (String) obj));
                return;
            case 28:
                ((org.telegram.ui.Wallet.h0) obj4).close();
                ((ft) obj3).run((String) obj);
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
                    org.telegram.ui.Components.ad.a0(a5Var).e0(str8, false);
                    return;
                } else {
                    a5Var.presentFragment(new org.telegram.ui.Wallet.s8());
                    return;
                }
        }
    }

    public /* synthetic */ ft(org.telegram.ui.Wallet.k0 k0Var, org.telegram.ui.Wallet.f0 f0Var, org.telegram.ui.Wallet.d7 d7Var) {
        this.a = 23;
        this.b = f0Var;
        this.c = d7Var;
    }
}
