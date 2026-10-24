package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
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
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qy implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qy(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        s4.b1 K;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 3;
        Object obj2 = null;
        int i13 = 0;
        int i14 = 1;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i10) {
            case 0:
                ArrayList arrayList2 = (ArrayList) obj3;
                Runnable runnable = (Runnable) obj;
                ty tyVar = ((sy) obj4).a;
                if (ConnectionsManager.getInstance(tyVar.F.c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    ty.E(tyVar, runnable, arrayList2, false);
                    return;
                }
            case 1:
                mz mzVar = (mz) obj4;
                Runnable runnable2 = (Runnable) obj3;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj5 = arrayList3.get(i13);
                    i13++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj5;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(mzVar.w.Q.c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        mzVar.n.add(new ky(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 2:
                k10 k10Var = (k10) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (k10Var.a0 != null || (k10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    qc M = xc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, k10Var.f0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", k10Var.h0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    M.j = 5000;
                    M.j();
                    return;
                } else {
                    qc M2 = xc.a0(o2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, k10Var.f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M2.j = 5000;
                    M2.j();
                    return;
                }
            case 3:
                View view = (View) obj4;
                d dVar = (d) obj3;
                Bitmap bitmap = (Bitmap) obj;
                if (view.getWidth() > 0 && view.getHeight() > 0) {
                    view.getLocationOnScreen(new int[2]);
                    int clamp = Utilities.clamp((int) ((r2[0] / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth(), 0);
                    int clamp2 = Utilities.clamp((int) ((r2[1] / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight(), 0);
                    int clamp3 = Utilities.clamp((int) ((view.getWidth() / AndroidUtilities.displaySize.x) * bitmap.getWidth()), bitmap.getWidth() - clamp, 0);
                    int clamp4 = Utilities.clamp((int) ((view.getHeight() / ((AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight) + AndroidUtilities.navigationBarHeight)) * bitmap.getHeight()), bitmap.getHeight() - clamp2, 0);
                    if ((clamp != 0 || clamp2 != 0 || clamp3 != bitmap.getWidth() || clamp4 != bitmap.getHeight()) && clamp3 > 0 && clamp4 > 0) {
                        bitmap = Bitmap.createBitmap(bitmap, clamp, clamp2, clamp3, clamp4);
                    }
                }
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.k6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.k6.I.q() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.k6.I.q() ? -0.2f : -0.07f);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 4:
                MessagesController messagesController = (MessagesController) obj4;
                gs0 gs0Var = (gs0) obj3;
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (!((Boolean) obj).booleanValue()) {
                    if (U != null) {
                        xc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                        return;
                    }
                    return;
                } else {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        xc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new sd(i11, U)), true)).k(true);
                    }
                    gs0Var.run(Boolean.TRUE);
                    return;
                }
            case 5:
                xv0.j((xv0) obj4, (TL_stories.StoryItem) obj3, (ci.a7) obj);
                return;
            case 6:
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) obj4;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj3;
                Long l4 = (Long) obj;
                htVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                o2Var2.presentFragment(new ProfileActivity(bundle, null));
                htVar.n();
                return;
            case 7:
                org.telegram.ui.dt dtVar = (org.telegram.ui.dt) obj4;
                Boolean bool = (Boolean) obj;
                dtVar.getClass();
                ((Utilities.Callback) obj3).run(bool);
                if (bool.booleanValue()) {
                    dtVar.a.n();
                    return;
                }
                return;
            case 8:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj4;
                Activity activity = (Activity) obj3;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                eyVar.showDialog(new org.telegram.ui.uj0(activity, !af0.a(), new org.telegram.ui.sv(activity, 0)));
                return;
            case 9:
                org.telegram.ui.ip0 ip0Var = (org.telegram.ui.ip0) obj3;
                Integer num = (Integer) obj;
                org.telegram.ui.q00 q00Var = ((org.telegram.ui.n00) obj4).e;
                if (!q00Var.getUserConfig().isPremium()) {
                    q00Var.showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) q00Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                q00Var.E = intValue;
                ip0Var.a(intValue, true);
                org.telegram.ui.e00 e00Var = q00Var.I;
                if (e00Var != null) {
                    e00Var.d(!q00Var.getUserConfig().isPremium() ? -1 : q00Var.E, true);
                }
                q00Var.i0(true);
                return;
            case 10:
                org.telegram.ui.d50 d50Var = (org.telegram.ui.d50) obj4;
                org.telegram.ui.e50 e50Var = (org.telegram.ui.e50) obj3;
                Bitmap bitmap2 = (Bitmap) obj;
                if (e50Var != null) {
                    d50Var.getClass();
                    e50Var.setVisibility(0);
                }
                d50Var.c = bitmap2;
                Paint paint = new Paint(1);
                d50Var.d = paint;
                Bitmap bitmap3 = d50Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                d50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                d50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 11:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj4;
                TLRPC.User[] userArr = (TLRPC.User[]) obj3;
                TLRPC.User user = (TLRPC.User) obj;
                ob0Var.c();
                if (user == null) {
                    return;
                }
                long j10 = userArr[0].id;
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user.id);
                ob0Var.u(new org.telegram.ui.nb0(bundle2, user, userArr, j10), false);
                return;
            case 12:
                org.telegram.ui.fj0 fj0Var = (org.telegram.ui.fj0) obj4;
                String str = (String) obj3;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = fj0Var.f0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && fj0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = fj0Var.r0;
                if (bool2 == null || !bool2.booleanValue()) {
                    fj0Var.U(true, true);
                    return;
                }
                qy qyVar = new qy(13, fj0Var, hashSet);
                MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                if (str == null || str.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new tg.p(qyVar, 5));
                } else {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    i13 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.q71(10, messagesController2, qyVar));
                }
                fj0Var.m0 = i13;
                return;
            case 13:
                org.telegram.ui.fj0 fj0Var2 = (org.telegram.ui.fj0) obj4;
                HashSet hashSet2 = (HashSet) obj3;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && fj0Var2.R(user3)) {
                            fj0Var2.f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                fj0Var2.U(true, true);
                return;
            case 14:
                org.telegram.ui.rj0.p((org.telegram.ui.rj0) obj4, (String) obj3, (TLRPC.User) obj);
                return;
            case 15:
                ArrayList arrayList6 = (ArrayList) obj3;
                w9[] w9VarArr = (w9[]) obj4;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                    return;
                }
                for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                    String str2 = (String) arrayList6.get(i15);
                    int i16 = 0;
                    while (true) {
                        if (i16 < tL_messages_stickerSet.packs.size()) {
                            if (tL_messages_stickerSet.packs.get(i16).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i16).emoticon, str2)) {
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
                        w9VarArr[i15].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str2), null);
                    }
                }
                return;
            case 16:
                ((String[]) obj4)[0] = (String) obj;
                ((org.telegram.ui.uk0) obj3).run();
                return;
            case 17:
                org.telegram.ui.uv0 uv0Var = (org.telegram.ui.uv0) obj4;
                org.telegram.ui.ActionBar.o2 o2Var3 = (org.telegram.ui.ActionBar.o2) obj3;
                Long l10 = (Long) obj;
                uv0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                o2Var3.presentFragment(new ProfileActivity(bundle3, null));
                uv0Var.c(false);
                return;
            case 18:
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.wr0(profileActivity, userFull, tL_birthday2, i12), 1024);
                return;
            case 19:
                ProfileActivity profileActivity2 = (ProfileActivity) obj4;
                ((org.telegram.ui.ActionBar.c2) obj3).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    ei.vb D = ei.vb.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    ei.lb lbVar = D.c1;
                    if (lbVar != null) {
                        lbVar.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 20:
                org.telegram.ui.u01 u01Var = (org.telegram.ui.u01) obj4;
                String str3 = (String) obj3;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.b61.k(str3, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a1.g.v("couldn't find ", str3, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.x01.s;
                    FileLog.e(v.toString());
                    return;
                }
                org.telegram.ui.w01 w01Var = new org.telegram.ui.w01();
                u01Var.c = w01Var;
                u01Var.e.add(w01Var);
                int f7 = org.telegram.ui.qy.f();
                u01Var.c.setAutoRepeat(0);
                org.telegram.ui.w01 w01Var2 = u01Var.c;
                String str4 = f7 + "_" + f7 + "_precache";
                org.telegram.ui.my0 my0Var = new org.telegram.ui.my0(u01Var, 6);
                w01Var2.getClass();
                w01Var2.setDelegate(new org.telegram.ui.v01(new Runnable[]{my0Var}));
                w01Var2.setImage(ImageLocation.getForDocument(k10), str4, null, null, tL_messages_stickerSet2, 0);
                u01Var.c.onAttachedToWindow();
                u01Var.g[1] = true;
                u01Var.a();
                return;
            case 21:
                ((ci.e) obj4).run((HashSet) obj3);
                return;
            case 22:
                org.telegram.ui.b41 b41Var = (org.telegram.ui.b41) obj4;
                View view2 = (View) obj3;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    b41Var.getClass();
                    view2.setVisibility(0);
                }
                b41Var.f = bitmap4;
                Paint paint2 = new Paint(1);
                b41Var.n = paint2;
                Bitmap bitmap5 = b41Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                b41Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix4, org.telegram.ui.ActionBar.k6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix4, org.telegram.ui.ActionBar.k6.I.q() ? -0.02f : -0.04f);
                b41Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                b41Var.r = new Matrix();
                return;
            case 23:
                org.telegram.ui.c81.X((org.telegram.ui.c81) obj4, (TLRPC.TL_attachMenuBot) obj3);
                return;
            case 24:
                ThemeActivity themeActivity = (ThemeActivity) obj4;
                AtomicReference atomicReference = (AtomicReference) obj3;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                SharedConfig.recordViaSco = false;
                SharedConfig.saveConfig();
                themeActivity.N0 = true;
                ((Dialog) atomicReference.get()).dismiss();
                mm0 mm0Var = themeActivity.b;
                if (mm0Var == null || !mm0Var.G || (K = mm0Var.K(themeActivity.M)) == null) {
                    return;
                }
                themeActivity.a.v(K, themeActivity.M);
                return;
            case 25:
                ThemeActivity themeActivity2 = (ThemeActivity) obj4;
                org.telegram.ui.o71 o71Var = (org.telegram.ui.o71) obj3;
                if (((Boolean) obj).booleanValue()) {
                    o71Var.run();
                    return;
                } else {
                    xc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 26:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj4;
                org.telegram.ui.Wallet.d8 d8Var = (org.telegram.ui.Wallet.d8) obj3;
                String str5 = (String) obj;
                if (str5 != null) {
                    org.telegram.ui.Wallet.l0.i("disableBackupWithoutUpdatingPhrase: ".concat(str5));
                    d8Var.run(str5);
                    return;
                } else {
                    org.telegram.ui.Wallet.l0.F("sending disableBackup to server");
                    org.telegram.ui.Wallet.r2.a(l0Var.a, new gi.c(7), null, null, null, new ci.c0(i12, l0Var, d8Var), true, true, new org.telegram.ui.ta0(obj2, i14));
                    return;
                }
            case 27:
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj4;
                try {
                    ((Utilities.Callback) obj3).run((String) obj);
                    if (i0Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (i0Var != null) {
                        i0Var.close();
                    }
                }
            case 28:
                ((org.telegram.ui.Wallet.i0) obj4).close();
                ((org.telegram.ui.Wallet.x7) obj3).run((String) obj);
                return;
            default:
                ((org.telegram.ui.Wallet.l0) obj4).q.put((TL_wallet.walletTransaction) obj, (ai.k4) obj3);
                return;
        }
    }

    public /* synthetic */ qy(ArrayList arrayList, w9[] w9VarArr) {
        this.a = 15;
        this.c = arrayList;
        this.b = w9VarArr;
    }
}
