package org.telegram.ui;

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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class oj0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ oj0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Document document;
        s4.c1 K;
        int i10 = this.a;
        int i11 = 4;
        int i12 = 2;
        int i13 = 0;
        int i14 = 1;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                tj0 tj0Var = (tj0) obj3;
                HashSet hashSet = (HashSet) obj2;
                List<TLRPC.User> list = (List) obj;
                if (list != null) {
                    for (TLRPC.User user : list) {
                        if (user != null && !hashSet.contains(Long.valueOf(user.id)) && tj0Var.R(user)) {
                            tj0Var.f0.add(user);
                            hashSet.add(Long.valueOf(user.id));
                        }
                    }
                }
                tj0Var.U(true, true);
                break;
            case 1:
                ek0 ek0Var = (ek0) obj3;
                String str = (String) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (user2 == null) {
                    ek0Var.R.setImageDrawable(null);
                    ek0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new ej0(i14, ek0Var, str)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = ek0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(ek0Var.getThemedColor(org.telegram.ui.ActionBar.j6.v6), PorterDuff.Mode.SRC_IN));
                    ek0Var.R.setImageDrawable(mutate);
                    if (user2.contact) {
                        ek0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new ej0(i12, ek0Var, user2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        ek0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                ek0Var.w(false);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.ui.Components.x9[] x9VarArr = (org.telegram.ui.Components.x9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        String str2 = (String) arrayList.get(i15);
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
                            x9VarArr[i15].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str2), null);
                        }
                    }
                    break;
                }
                break;
            case 3:
                ((String[]) obj3)[0] = (String) obj;
                ((jl0) obj2).run();
                break;
            case 4:
                lw0 lw0Var = (lw0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                lw0Var.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                n2Var.presentFragment(new ProfileActivity(bundle, null));
                lw0Var.c(false);
                break;
            case 5:
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new ms0(profileActivity, userFull, tL_birthday2, 3), 1024);
                break;
            case 6:
                p11 p11Var = (p11) obj3;
                String str3 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = j71.k(str3, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder v = a4.a.v("couldn't find ", str3, " sticker in EmojiAnimations");
                    String[] strArr = s11.s;
                    FileLog.e(v.toString());
                    break;
                } else {
                    r11 r11Var = new r11();
                    p11Var.c = r11Var;
                    p11Var.e.add(r11Var);
                    int f7 = gz.f();
                    p11Var.c.setAutoRepeat(0);
                    r11 r11Var2 = p11Var.c;
                    String str4 = f7 + "_" + f7 + "_precache";
                    f01 f01Var = new f01(p11Var, i11);
                    r11Var2.getClass();
                    r11Var2.setDelegate(new q11(new Runnable[]{f01Var}));
                    r11Var2.setImage(ImageLocation.getForDocument(k10), str4, null, null, tL_messages_stickerSet2, 0);
                    p11Var.c.onAttachedToWindow();
                    p11Var.g[1] = true;
                    p11Var.a();
                    break;
                }
            case 7:
                ((org.telegram.ui.ActionBar.j3) obj3).run((HashSet) obj2);
                break;
            case 8:
                k51 k51Var = (k51) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    k51Var.getClass();
                    view.setVisibility(0);
                }
                k51Var.f = bitmap;
                Paint paint = new Paint(1);
                k51Var.n = paint;
                Bitmap bitmap2 = k51Var.f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                k51Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.j6.I.q() ? -0.02f : -0.04f);
                k51Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                k51Var.r = new Matrix();
                break;
            case 9:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.N0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.ll0 ll0Var = themeActivity.b;
                    if (ll0Var != null && ll0Var.G && (K = ll0Var.K(themeActivity.M)) != null) {
                        themeActivity.a.v(K, themeActivity.M);
                        break;
                    }
                }
                break;
            case 10:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                w81 w81Var = (w81) obj2;
                if (((Boolean) obj).booleanValue()) {
                    w81Var.run();
                    break;
                } else {
                    org.telegram.ui.Components.yc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 11:
                org.telegram.ui.web.a2 a2Var = (org.telegram.ui.web.a2) obj3;
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                a2Var.getClass();
                ((org.telegram.ui.web.i1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = a2Var.e;
                if (callback != null) {
                    a2Var.finishFragment();
                    callback.run(e1Var);
                    break;
                } else {
                    of.f.s(a2Var.getParentActivity(), e1Var.c);
                    break;
                }
            case 12:
                org.telegram.ui.web.j2 j2Var = (org.telegram.ui.web.j2) obj3;
                j2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.er0(j2Var, (org.telegram.ui.web.i2) obj2, (Bitmap) obj, 20));
                break;
            case 13:
                yh.p1 p1Var = (yh.p1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                p1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool);
                }
                if (bool.booleanValue()) {
                    p1Var.skipDismissAnimation();
                }
                p1Var.dismiss();
                break;
            case 14:
                org.telegram.messenger.voip.f fVar = (org.telegram.messenger.voip.f) obj2;
                if (((Object[]) obj)[1] == ((zh.j5) obj3)) {
                    fVar.run();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                zh.i5 i5Var = nr0Var.e;
                int i18 = tL_starGiftCollection.collection_id;
                i5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i19 = i5Var.a;
                updatestargiftcollection.peer = MessagesController.getInstance(i19).getInputPeer(i5Var.b);
                updatestargiftcollection.collection_id = i18;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i19).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                nr0Var.f(true);
                break;
            case 16:
                yh.x4 x4Var = (yh.x4) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                long j3 = x4Var.Z;
                Runnable runnable = x4Var.g0;
                if (runnable != null) {
                    runnable.run();
                }
                x4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new yh.o4(i13, user3), 250L);
                MessagesController.getInstance(x4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                break;
            case 17:
                zh.w3 w3Var = (zh.w3) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                zh.t3 t3Var = w3Var.e0;
                fi.l[] lVarArr = w3Var.s0;
                di.d dVar = w3Var.j0;
                if (stargiftupgradepreview != null) {
                    t3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    w3Var.q2(1, false, null);
                    t3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    lVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    lVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    lVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    w3Var.u0.setVisibility(8);
                    w3Var.t0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new zh.u0(w3Var, i11));
                    w3Var.show();
                    break;
                }
                break;
            case 18:
                zh.w3.n0((zh.w3) obj3, (org.telegram.ui.ActionBar.b2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 19:
                zh.x2 x2Var = (zh.x2) obj3;
                x2Var.getClass();
                ((zh.v2) obj2).a((TL_stars.StarGift) obj, true);
                x2Var.d(true);
                break;
            case 20:
                zh.c3 c3Var = (zh.c3) obj3;
                zf.b bVar = (zf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                of.e eVar = c3Var.n;
                if (eVar != null && bVar == c3Var.q) {
                    eVar.c(false);
                }
                c3Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    c3Var.o.put(bVar, new zh.a3(bVar, tL_payments_paymentFormStarGift));
                    c3Var.a(true);
                    break;
                }
                break;
            default:
                ((Utilities.Callback2) obj3).run((zf.a) obj, new zh.m2((zh.i0[]) obj2, 7));
                break;
        }
    }
}
