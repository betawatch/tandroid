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
import java.util.LinkedHashSet;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ThemeActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oy implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oy(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        s4.e1 K;
        int i10 = this.a;
        int i11 = 2;
        int i12 = 3;
        int i13 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                so soVar = (so) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                soVar.run();
                return;
            case 1:
                ry ryVar = (ry) obj3;
                sy syVar = ryVar.a;
                sz szVar = syVar.F;
                MediaDataController.getInstance(szVar.c1).getEmojiSuggestions(szVar.W0, syVar.v, false, new qy(ryVar, (String) obj2, (Runnable) obj, i13), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(szVar.c1).isPremium(), false, true, 25);
                return;
            case 2:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                sy syVar2 = ((ry) obj3).a;
                if (ConnectionsManager.getInstance(syVar2.F.c1).getConnectionState() != 3) {
                    runnable.run();
                    return;
                } else {
                    sy.E(syVar2, runnable, arrayList2, false);
                    return;
                }
            case 3:
                lz lzVar = (lz) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i13 < size) {
                    Object obj4 = arrayList3.get(i13);
                    i13++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(lzVar.w.Q.c1).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        lzVar.n.add(new jy(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                return;
            case 4:
                n10 n10Var = (n10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                if (n10Var.a0 != null || (n10Var.Z instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    qc M = wc.b0(r2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, n10Var.f0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", n10Var.h0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    M.j = 5000;
                    M.j();
                    return;
                } else {
                    qc M2 = wc.b0(r2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, n10Var.f0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M2.j = 5000;
                    M2.j();
                    return;
                }
            case 5:
                View view = (View) obj3;
                d dVar = (d) obj2;
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
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.y6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.y6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.y6.I.q() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.y6.I.q() ? -0.2f : -0.07f);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                return;
            case 6:
                bw0.g((bw0) obj3, (TL_stories.StoryItem) obj2, (di.a7) obj);
                return;
            case 7:
                MessagesController messagesController = (MessagesController) obj3;
                qs0 qs0Var = (qs0) obj2;
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (!((Boolean) obj).booleanValue()) {
                    if (U != null) {
                        wc.b0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                        return;
                    }
                    return;
                } else {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        wc.b0(U).Q(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new ud(i11, U)), true)).k(true);
                    }
                    qs0Var.run(Boolean.TRUE);
                    return;
                }
            case 8:
                org.telegram.ui.ht htVar = (org.telegram.ui.ht) obj3;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj2;
                Long l4 = (Long) obj;
                htVar.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                r2Var2.presentFragment(new ProfileActivity(bundle, null));
                htVar.n();
                return;
            case 9:
                org.telegram.ui.dt dtVar = (org.telegram.ui.dt) obj3;
                Boolean bool = (Boolean) obj;
                dtVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    dtVar.a.n();
                    return;
                }
                return;
            case 10:
                org.telegram.ui.ey eyVar = (org.telegram.ui.ey) obj3;
                Activity activity = (Activity) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                eyVar.showDialog(new org.telegram.ui.ck0(activity, !ye0.a(), new org.telegram.ui.sv(activity, 0)));
                return;
            case 11:
                org.telegram.ui.qp0 qp0Var = (org.telegram.ui.qp0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.q00 q00Var = ((org.telegram.ui.n00) obj3).e;
                if (!q00Var.getUserConfig().isPremium()) {
                    q00Var.showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) q00Var, 35, true));
                    return;
                }
                int intValue = num.intValue();
                q00Var.E = intValue;
                qp0Var.a(intValue, true);
                org.telegram.ui.e00 e00Var = q00Var.I;
                if (e00Var != null) {
                    e00Var.d(!q00Var.getUserConfig().isPremium() ? -1 : q00Var.E, true);
                }
                q00Var.k0(true);
                return;
            case 12:
                org.telegram.ui.g50 g50Var = (org.telegram.ui.g50) obj3;
                org.telegram.ui.b20 b20Var = (org.telegram.ui.b20) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (b20Var != null) {
                    g50Var.getClass();
                    b20Var.setVisibility(0);
                }
                g50Var.c = bitmap2;
                Paint paint = new Paint(1);
                g50Var.d = paint;
                Bitmap bitmap3 = g50Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                g50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.y6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.y6.I.q() ? -0.02f : -0.04f);
                g50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                return;
            case 13:
                org.telegram.ui.ob0 ob0Var = (org.telegram.ui.ob0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
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
            case 14:
                org.telegram.ui.ej0 ej0Var = (org.telegram.ui.ej0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = ej0Var.f0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && ej0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = ej0Var.r0;
                if (bool2 == null || !bool2.booleanValue()) {
                    ej0Var.U(true, true);
                    return;
                }
                oy oyVar = new oy(15, ej0Var, hashSet);
                MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                if (str == null || str.isEmpty()) {
                    AndroidUtilities.runOnUIThread(new ti.g(oyVar, 8));
                } else {
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    tL_contacts_search.limit = 50;
                    i13 = connectionsManager.sendRequest(tL_contacts_search, new org.telegram.ui.n71(12, messagesController2, oyVar));
                }
                ej0Var.m0 = i13;
                return;
            case 15:
                org.telegram.ui.ej0 ej0Var2 = (org.telegram.ui.ej0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && ej0Var2.R(user3)) {
                            ej0Var2.f0.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                ej0Var2.U(true, true);
                return;
            case 16:
                org.telegram.ui.qj0.o((org.telegram.ui.qj0) obj3, (String) obj2, (TLRPC.User) obj);
                return;
            case 17:
                ArrayList arrayList6 = (ArrayList) obj3;
                y9[] y9VarArr = (y9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet == null || tL_messages_stickerSet.set == null) {
                    return;
                }
                for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                    String str2 = (String) arrayList6.get(i14);
                    int i15 = 0;
                    while (true) {
                        if (i15 < tL_messages_stickerSet.packs.size()) {
                            if (tL_messages_stickerSet.packs.get(i15).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i15).emoticon, str2)) {
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
                        y9VarArr[i14].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str2), null);
                    }
                }
                return;
            case 18:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.cl0) obj2).run();
                return;
            case 19:
                org.telegram.ui.zv0 zv0Var = (org.telegram.ui.zv0) obj3;
                org.telegram.ui.ActionBar.r2 r2Var3 = (org.telegram.ui.ActionBar.r2) obj2;
                Long l10 = (Long) obj;
                zv0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle3.putLong("user_id", l10.longValue());
                } else {
                    bundle3.putLong("chat_id", -l10.longValue());
                }
                r2Var3.presentFragment(new ProfileActivity(bundle3, null));
                zv0Var.c(false);
                return;
            case 20:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                TLRPC.UserFull userFull = (TLRPC.UserFull) obj2;
                TL_account.TL_birthday tL_birthday = (TL_account.TL_birthday) obj;
                int i17 = ProfileActivity.R6;
                TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
                updatebirthday.flags |= 1;
                updatebirthday.birthday = tL_birthday;
                TL_account.TL_birthday tL_birthday2 = userFull.birthday;
                userFull.flags2 |= 32;
                userFull.birthday = tL_birthday;
                profileActivity.getMessagesController().invalidateContentSettings();
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.cs0(profileActivity, userFull, tL_birthday2, i12), 1024);
                return;
            case 21:
                ProfileActivity profileActivity2 = (ProfileActivity) obj3;
                int i18 = ProfileActivity.R6;
                ((org.telegram.ui.ActionBar.e2) obj2).dismiss();
                if (((Boolean) obj).booleanValue()) {
                    fi.sb D = fi.sb.D(profileActivity2.getParentActivity(), profileActivity2.getCurrentAccount());
                    long a2 = profileActivity2.a();
                    D.N = a2;
                    fi.ib ibVar = D.c1;
                    if (ibVar != null) {
                        ibVar.setDialogId(a2);
                    }
                    D.Q(null);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.a11 a11Var = (org.telegram.ui.a11) obj3;
                String str3 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.f61.k(str3, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a1.g.v("couldn't find ", str3, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.d11.s;
                    FileLog.e(v.toString());
                    return;
                }
                org.telegram.ui.c11 c11Var = new org.telegram.ui.c11();
                a11Var.c = c11Var;
                a11Var.e.add(c11Var);
                int f7 = org.telegram.ui.qy.f();
                a11Var.c.setAutoRepeat(0);
                org.telegram.ui.c11 c11Var2 = a11Var.c;
                String str4 = f7 + "_" + f7 + "_precache";
                org.telegram.ui.oy0 oy0Var = new org.telegram.ui.oy0(a11Var, 7);
                c11Var2.getClass();
                c11Var2.setDelegate(new org.telegram.ui.b11(new Runnable[]{oy0Var}));
                c11Var2.setImage(ImageLocation.getForDocument(k10), str4, null, null, tL_messages_stickerSet2, 0);
                a11Var.c.onAttachedToWindow();
                a11Var.g[1] = true;
                a11Var.a();
                return;
            case 23:
                ((di.e) obj3).run((HashSet) obj2);
                return;
            case 24:
                org.telegram.ui.f41 f41Var = (org.telegram.ui.f41) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    f41Var.getClass();
                    view2.setVisibility(0);
                }
                f41Var.f = bitmap4;
                Paint paint2 = new Paint(1);
                f41Var.n = paint2;
                Bitmap bitmap5 = f41Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                f41Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix4, org.telegram.ui.ActionBar.y6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix4, org.telegram.ui.ActionBar.y6.I.q() ? -0.02f : -0.04f);
                f41Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                f41Var.r = new Matrix();
                return;
            case 25:
                org.telegram.ui.f81.Y((org.telegram.ui.f81) obj3, (TLRPC.TL_attachMenuBot) obj2);
                return;
            case 26:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (((Boolean) obj).booleanValue()) {
                    return;
                }
                SharedConfig.recordViaSco = false;
                SharedConfig.saveConfig();
                themeActivity.N0 = true;
                ((Dialog) atomicReference.get()).dismiss();
                nm0 nm0Var = themeActivity.b;
                if (nm0Var == null || !nm0Var.G || (K = nm0Var.K(themeActivity.M)) == null) {
                    return;
                }
                themeActivity.a.v(K, themeActivity.M);
                return;
            case 27:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                org.telegram.ui.by0 by0Var = (org.telegram.ui.by0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    by0Var.run();
                    return;
                } else {
                    wc.b0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    return;
                }
            case 28:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj3;
                org.telegram.ui.Wallet.d8 d8Var = (org.telegram.ui.Wallet.d8) obj2;
                String str5 = (String) obj;
                if (str5 != null) {
                    org.telegram.ui.Wallet.l0.j("disableBackupWithoutUpdatingPhrase: ".concat(str5));
                    d8Var.run(str5);
                    return;
                } else {
                    org.telegram.ui.Wallet.l0.H("sending disableBackup to server");
                    org.telegram.ui.Wallet.r2.a(l0Var.a, new ai.d0(11), null, null, null, new di.c0(i12, l0Var, d8Var), true, true, new ag.b1((Object) null, 2));
                    return;
                }
            default:
                org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj3;
                try {
                    ((Utilities.Callback) obj2).run((String) obj);
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
        }
    }
}
