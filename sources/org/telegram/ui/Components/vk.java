package org.telegram.ui.Components;

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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vk implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vk(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        ArrayList<TLRPC.Document> arrayList;
        TLRPC.Document document;
        f2.l1 K;
        int i10 = this.a;
        int i11 = 3;
        int i12 = 2;
        int i13 = 1;
        int i14 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                al alVar = ((xk) obj3).b;
                alVar.u0.d(((zk) obj2).c, alVar.v0, true, 0, ((Long) obj).longValue());
                alVar.b.dismiss(true);
                break;
            case 1:
                jv jvVar = (jv) obj3;
                boolean[] zArr = (boolean[]) obj2;
                if (((TLRPC.TL_messages_stickerSet) obj) == null && !zArr[0]) {
                    zArr[0] = true;
                    AndroidUtilities.runOnUIThread(new iv(jvVar, i13));
                    break;
                }
                break;
            case 2:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj3;
                il ilVar = (il) obj2;
                TLRPC.TL_emojiList tL_emojiList = (TLRPC.TL_emojiList) obj;
                if (tL_emojiList != null) {
                    linkedHashSet.addAll(tL_emojiList.document_id);
                }
                ilVar.run();
                break;
            case 3:
                iy iyVar = (iy) obj3;
                jy jyVar = iyVar.a;
                kz kzVar = jyVar.C;
                MediaDataController.getInstance(kzVar.Z0).getEmojiSuggestions(kzVar.T0, jyVar.v, false, new androidx.car.app.utils.a(23, iyVar, (Runnable) obj, (String) obj2), null, SharedConfig.suggestAnimatedEmoji || UserConfig.getInstance(kzVar.Z0).isPremium(), false, true, 25);
                break;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj2;
                Runnable runnable = (Runnable) obj;
                jy jyVar2 = ((iy) obj3).a;
                if (ConnectionsManager.getInstance(jyVar2.C.Z0).getConnectionState() != 3) {
                    runnable.run();
                    break;
                } else {
                    jy.E(jyVar2, runnable, arrayList2, false);
                    break;
                }
            case 5:
                dz dzVar = (dz) obj3;
                Runnable runnable2 = (Runnable) obj2;
                ArrayList arrayList3 = (ArrayList) obj;
                int size = arrayList3.size();
                while (i14 < size) {
                    Object obj4 = arrayList3.get(i14);
                    i14++;
                    TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) obj4;
                    if (stickerSetCovered instanceof TLRPC.TL_stickerSetFullCovered) {
                        arrayList = ((TLRPC.TL_stickerSetFullCovered) stickerSetCovered).documents;
                    } else if (stickerSetCovered instanceof TLRPC.TL_stickerSetNoCovered) {
                        TLRPC.TL_messages_stickerSet stickerSet = MediaDataController.getInstance(dzVar.w.N.Z0).getStickerSet(MediaDataController.getInputStickerSet(stickerSetCovered.set), Integer.valueOf(stickerSetCovered.set.hash), true);
                        arrayList = stickerSet != null ? stickerSet.documents : null;
                    } else {
                        arrayList = stickerSetCovered.covers;
                    }
                    if (arrayList != null && !arrayList.isEmpty()) {
                        dzVar.n.add(new ay(stickerSetCovered, arrayList));
                    }
                }
                runnable2.run();
                break;
            case 6:
                c10 c10Var = (c10) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (c10Var.X != null || (c10Var.W instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready)) {
                    ic M = qc.a0(p2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkUpdatedTitle, c10Var.c0)), arrayList4.size() <= 0 ? LocaleController.formatPluralString("FolderLinkUpdatedSubtitle", c10Var.e0.size(), new Object[0]) : LocaleController.formatPluralString("FolderLinkUpdatedJoinedSubtitle", arrayList4.size(), new Object[0]), R.raw.folder_in);
                    M.j = 5000;
                    M.j();
                    break;
                } else {
                    ic M2 = qc.a0(p2Var).M(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FolderLinkAddedTitle, c10Var.c0)), LocaleController.formatPluralString("FolderLinkAddedSubtitle", arrayList4.size(), new Object[0]), R.raw.contact_check);
                    M2.j = 5000;
                    M2.j();
                    break;
                }
            case 7:
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
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? 0.04f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? -0.04f : -0.07f);
                Bitmap applyColorMatrix = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix);
                applyColorMatrix.setHasAlpha(false);
                ColorMatrix colorMatrix2 = new ColorMatrix();
                colorMatrix2.setSaturation(org.telegram.ui.ActionBar.j6.I.q() ? 2.0f : 3.0f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix2, org.telegram.ui.ActionBar.j6.I.q() ? -0.2f : -0.07f);
                Bitmap applyColorMatrix2 = AndroidUtilities.applyColorMatrix(bitmap, colorMatrix2);
                applyColorMatrix2.setHasAlpha(false);
                bitmap.recycle();
                dVar.run(applyColorMatrix, applyColorMatrix2);
                break;
            case 8:
                MessagesController messagesController = (MessagesController) obj3;
                hr0 hr0Var = (hr0) obj2;
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (((Boolean) obj).booleanValue()) {
                    messagesController.setContentSettings(true);
                    if (U != null) {
                        qc.a0(U).P(R.raw.chats_infotip, AndroidUtilities.replaceArrows(AndroidUtilities.premiumText(LocaleController.getString(R.string.SensitiveContentSettingsToast), new jd(i12, U)), true)).k(true);
                    }
                    hr0Var.run(Boolean.TRUE);
                    break;
                } else if (U != null) {
                    qc.a0(U).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
                break;
            case 9:
                yu0.j((yu0) obj3, (TL_stories.StoryItem) obj2, (nh.m6) obj);
                break;
            case 10:
                org.telegram.ui.pt ptVar = (org.telegram.ui.pt) obj3;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                Long l10 = (Long) obj;
                ptVar.getClass();
                Bundle bundle = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle.putLong("user_id", l10.longValue());
                } else {
                    bundle.putLong("chat_id", -l10.longValue());
                }
                p2Var2.presentFragment(new ProfileActivity(bundle, null));
                ptVar.p();
                break;
            case 11:
                org.telegram.ui.lt ltVar = (org.telegram.ui.lt) obj3;
                Boolean bool = (Boolean) obj;
                ltVar.getClass();
                ((Utilities.Callback) obj2).run(bool);
                if (bool.booleanValue()) {
                    ltVar.a.p();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.oy oyVar = (org.telegram.ui.oy) obj3;
                Activity activity = (Activity) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    oyVar.showDialog(new org.telegram.ui.vj0(activity, !ge0.c(), new org.telegram.ui.bw(activity, 0)));
                    break;
                }
                break;
            case 13:
                org.telegram.ui.ep0 ep0Var = (org.telegram.ui.ep0) obj2;
                Integer num = (Integer) obj;
                org.telegram.ui.b10 b10Var = ((org.telegram.ui.y00) obj3).e;
                if (b10Var.getUserConfig().isPremium()) {
                    int intValue = num.intValue();
                    b10Var.B = intValue;
                    ep0Var.a(intValue, true);
                    org.telegram.ui.p00 p00Var = b10Var.F;
                    if (p00Var != null) {
                        p00Var.d(!b10Var.getUserConfig().isPremium() ? -1 : b10Var.B, true);
                    }
                    b10Var.i0(true);
                    break;
                } else {
                    b10Var.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) b10Var, 35, true));
                    break;
                }
            case 14:
                org.telegram.ui.m50 m50Var = (org.telegram.ui.m50) obj3;
                eg.h0 h0Var = (eg.h0) obj2;
                Bitmap bitmap2 = (Bitmap) obj;
                if (h0Var != null) {
                    m50Var.getClass();
                    h0Var.setVisibility(0);
                }
                m50Var.c = bitmap2;
                Paint paint = new Paint(1);
                m50Var.d = paint;
                Bitmap bitmap3 = m50Var.c;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap3, tileMode, tileMode);
                m50Var.e = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix3 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix3, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                m50Var.d.setColorFilter(new ColorMatrixColorFilter(colorMatrix3));
                break;
            case 15:
                org.telegram.ui.wb0 wb0Var = (org.telegram.ui.wb0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                wb0Var.a();
                if (user != null) {
                    long j10 = userArr[0].id;
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", user.id);
                    wb0Var.n(new org.telegram.ui.vb0(bundle2, user, userArr, j10), false);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.hj0 hj0Var = (org.telegram.ui.hj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList5 = hj0Var.c0;
                arrayList5.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && hj0Var.R(user2)) {
                            arrayList5.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool2 = hj0Var.o0;
                if (bool2 == null || !bool2.booleanValue()) {
                    hj0Var.U(true, true);
                    break;
                } else {
                    vk vkVar = new vk(17, hj0Var, hashSet);
                    MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str == null || str.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new ef.e(vkVar, 11));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i14 = connectionsManager.sendRequest(tL_contacts_search, new dg.d3(i12, messagesController2, vkVar));
                    }
                    hj0Var.j0 = i14;
                    break;
                }
                break;
            case 17:
                org.telegram.ui.hj0 hj0Var2 = (org.telegram.ui.hj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && hj0Var2.R(user3)) {
                            hj0Var2.c0.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                hj0Var2.U(true, true);
                break;
            case 18:
                org.telegram.ui.sj0 sj0Var = (org.telegram.ui.sj0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    sj0Var.O.setImageDrawable(null);
                    sj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new org.telegram.ui.fe0(13, sj0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = sj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(sj0Var.getThemedColor(org.telegram.ui.ActionBar.j6.v6), PorterDuff.Mode.SRC_IN));
                    sj0Var.O.setImageDrawable(mutate);
                    if (user4.contact) {
                        sj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new org.telegram.ui.fe0(14, sj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        sj0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                sj0Var.w(false);
                break;
            case 19:
                ArrayList arrayList6 = (ArrayList) obj3;
                p9[] p9VarArr = (p9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i15 = 0; i15 < arrayList6.size(); i15++) {
                        String str3 = (String) arrayList6.get(i15);
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
                            p9VarArr[i15].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 20:
                ((String[]) obj3)[0] = (String) obj;
                ((org.telegram.ui.vk0) obj2).run();
                break;
            case 21:
                org.telegram.ui.gp0 gp0Var = (org.telegram.ui.gp0) obj3;
                gp0Var.n = false;
                ((org.telegram.ui.bp0) obj2).f.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    gp0Var.v0();
                    gp0Var.finishFragment();
                    gp0Var.y0();
                    break;
                }
                break;
            case 22:
                org.telegram.ui.rv0 rv0Var = (org.telegram.ui.rv0) obj3;
                org.telegram.ui.ActionBar.p2 p2Var3 = (org.telegram.ui.ActionBar.p2) obj2;
                Long l11 = (Long) obj;
                rv0Var.getClass();
                Bundle bundle3 = new Bundle();
                if (l11.longValue() >= 0) {
                    bundle3.putLong("user_id", l11.longValue());
                } else {
                    bundle3.putLong("chat_id", -l11.longValue());
                }
                p2Var3.presentFragment(new ProfileActivity(bundle3, null));
                rv0Var.c(false);
                break;
            case 23:
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new org.telegram.ui.rr0(profileActivity, userFull, tL_birthday2, i11), 1024);
                break;
            case 24:
                org.telegram.ui.v01 v01Var = (org.telegram.ui.v01) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = org.telegram.ui.q61.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder t6 = android.support.v4.media.a.t("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = org.telegram.ui.y01.s;
                    FileLog.e(t6.toString());
                    break;
                } else {
                    org.telegram.ui.x01 x01Var = new org.telegram.ui.x01();
                    v01Var.c = x01Var;
                    v01Var.e.add(x01Var);
                    int f10 = org.telegram.ui.bz.f();
                    v01Var.c.setAutoRepeat(0);
                    org.telegram.ui.x01 x01Var2 = v01Var.c;
                    String str5 = f10 + "_" + f10 + "_precache";
                    org.telegram.ui.vy0 vy0Var = new org.telegram.ui.vy0(v01Var, 5);
                    x01Var2.getClass();
                    x01Var2.setDelegate(new org.telegram.ui.w01(new Runnable[]{vy0Var}));
                    x01Var2.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                    v01Var.c.onAttachedToWindow();
                    v01Var.g[1] = true;
                    v01Var.a();
                    break;
                }
            case 25:
                ((gg.h) obj3).run((HashSet) obj2);
                break;
            case 26:
                org.telegram.ui.p41 p41Var = (org.telegram.ui.p41) obj3;
                View view2 = (View) obj2;
                Bitmap bitmap4 = (Bitmap) obj;
                if (view2 != null) {
                    p41Var.getClass();
                    view2.setVisibility(0);
                }
                p41Var.f = bitmap4;
                Paint paint2 = new Paint(1);
                p41Var.n = paint2;
                Bitmap bitmap5 = p41Var.f;
                Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader2 = new BitmapShader(bitmap5, tileMode2, tileMode2);
                p41Var.h = bitmapShader2;
                paint2.setShader(bitmapShader2);
                ColorMatrix colorMatrix4 = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix4, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix4, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                p41Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix4));
                p41Var.r = new Matrix();
                break;
            case 27:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.K0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    sl0 sl0Var = themeActivity.b;
                    if (sl0Var != null && sl0Var.D && (K = sl0Var.K(themeActivity.J)) != null) {
                        themeActivity.a.v(K, themeActivity.J);
                        break;
                    }
                }
                break;
            case 28:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                org.telegram.ui.l01 l01Var = (org.telegram.ui.l01) obj2;
                if (((Boolean) obj).booleanValue()) {
                    l01Var.run();
                    break;
                } else {
                    qc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj3;
                String str6 = (String) obj2;
                Boolean bool3 = (Boolean) obj;
                a1Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool3.booleanValue() ? TextUtils.isEmpty(str6) ? "removed" : "updated" : "failed");
                    a1Var.v("biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                }
        }
    }
}
