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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mj0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mj0(int i10, Object obj, Object obj2) {
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
        int i12 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                rj0 rj0Var = (rj0) obj3;
                HashSet hashSet = (HashSet) obj2;
                List<TLRPC.User> list = (List) obj;
                if (list != null) {
                    for (TLRPC.User user : list) {
                        if (user != null && !hashSet.contains(Long.valueOf(user.id)) && rj0Var.R(user)) {
                            rj0Var.f0.add(user);
                            hashSet.add(Long.valueOf(user.id));
                        }
                    }
                }
                rj0Var.U(true, true);
                break;
            case 1:
                ck0 ck0Var = (ck0) obj3;
                String str = (String) obj2;
                TLRPC.User user2 = (TLRPC.User) obj;
                if (user2 == null) {
                    ck0Var.R.setImageDrawable(null);
                    ck0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new ma0(25, ck0Var, str)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = ck0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(ck0Var.getThemedColor(org.telegram.ui.ActionBar.i6.v6), PorterDuff.Mode.SRC_IN));
                    ck0Var.R.setImageDrawable(mutate);
                    if (user2.contact) {
                        ck0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new ma0(26, ck0Var, user2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        ck0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                ck0Var.w(false);
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj3;
                org.telegram.ui.Components.u9[] u9VarArr = (org.telegram.ui.Components.u9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        String str2 = (String) arrayList.get(i13);
                        int i14 = 0;
                        while (true) {
                            if (i14 < tL_messages_stickerSet.packs.size()) {
                                if (tL_messages_stickerSet.packs.get(i14).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i14).emoticon, str2)) {
                                    i14++;
                                } else {
                                    long longValue = tL_messages_stickerSet.packs.get(i14).documents.get(0).longValue();
                                    for (int i15 = 0; i15 < tL_messages_stickerSet.documents.size(); i15++) {
                                        if (tL_messages_stickerSet.documents.get(i15).id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i15);
                                        }
                                    }
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            u9VarArr[i13].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str2), null);
                        }
                    }
                    break;
                }
                break;
            case 3:
                ((String[]) obj3)[0] = (String) obj;
                ((gl0) obj2).run();
                break;
            case 4:
                mw0 mw0Var = (mw0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l4 = (Long) obj;
                mw0Var.getClass();
                Bundle bundle = new Bundle();
                if (l4.longValue() >= 0) {
                    bundle.putLong("user_id", l4.longValue());
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                n2Var.presentFragment(new ProfileActivity(bundle, null));
                mw0Var.c(false);
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new ns0(profileActivity, userFull, tL_birthday2, 3), 1024);
                break;
            case 6:
                o11 o11Var = (o11) obj3;
                String str3 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = h71.k(str3, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder w10 = a4.a.w("couldn't find ", str3, " sticker in EmojiAnimations");
                    String[] strArr = r11.s;
                    FileLog.e(w10.toString());
                    break;
                } else {
                    q11 q11Var = new q11();
                    o11Var.c = q11Var;
                    o11Var.e.add(q11Var);
                    int f7 = gz.f();
                    o11Var.c.setAutoRepeat(0);
                    q11 q11Var2 = o11Var.c;
                    String str4 = f7 + "_" + f7 + "_precache";
                    f01 f01Var = new f01(o11Var, i11);
                    q11Var2.getClass();
                    q11Var2.setDelegate(new p11(new Runnable[]{f01Var}));
                    q11Var2.setImage(ImageLocation.getForDocument(k10), str4, null, null, tL_messages_stickerSet2, 0);
                    o11Var.c.onAttachedToWindow();
                    o11Var.g[1] = true;
                    o11Var.a();
                    break;
                }
            case 7:
                ((org.telegram.ui.ActionBar.j3) obj3).run((HashSet) obj2);
                break;
            case 8:
                i51 i51Var = (i51) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    i51Var.getClass();
                    view.setVisibility(0);
                }
                i51Var.f = bitmap;
                Paint paint = new Paint(1);
                i51Var.n = paint;
                Bitmap bitmap2 = i51Var.f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                i51Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.i6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.i6.I.q() ? -0.02f : -0.04f);
                i51Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                i51Var.r = new Matrix();
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
                iy0 iy0Var = (iy0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    iy0Var.run();
                    break;
                } else {
                    org.telegram.ui.Components.vc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 11:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) obj3;
                org.telegram.ui.web.e1 e1Var = (org.telegram.ui.web.e1) obj;
                z1Var.getClass();
                ((org.telegram.ui.web.h1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = z1Var.e;
                if (callback != null) {
                    z1Var.finishFragment();
                    callback.run(e1Var);
                    break;
                } else {
                    nf.f.s(z1Var.getParentActivity(), e1Var.c);
                    break;
                }
            case 12:
                org.telegram.ui.web.i2 i2Var = (org.telegram.ui.web.i2) obj3;
                i2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fr0(i2Var, (org.telegram.ui.web.h2) obj2, (Bitmap) obj, 20));
                break;
            case 13:
                xh.q1 q1Var = (xh.q1) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                Boolean bool = (Boolean) obj;
                q1Var.getClass();
                if (callback2 != null) {
                    callback2.run(bool);
                }
                if (bool.booleanValue()) {
                    q1Var.skipDismissAnimation();
                }
                q1Var.dismiss();
                break;
            case 14:
                org.telegram.messenger.voip.f fVar = (org.telegram.messenger.voip.f) obj2;
                if (((Object[]) obj)[1] == ((yh.m5) obj3)) {
                    fVar.run();
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) obj3;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj2;
                String str5 = (String) obj;
                yh.l5 l5Var = nr0Var.e;
                int i16 = tL_starGiftCollection.collection_id;
                l5Var.getClass();
                TL_stars.updateStarGiftCollection updatestargiftcollection = new TL_stars.updateStarGiftCollection();
                int i17 = l5Var.a;
                updatestargiftcollection.peer = MessagesController.getInstance(i17).getInputPeer(l5Var.b);
                updatestargiftcollection.collection_id = i16;
                updatestargiftcollection.flags |= 1;
                updatestargiftcollection.title = str5;
                ConnectionsManager.getInstance(i17).sendRequest(updatestargiftcollection, null);
                tL_starGiftCollection.title = str5;
                nr0Var.f(true);
                break;
            case 16:
                xh.y4 y4Var = (xh.y4) obj3;
                TLRPC.User user3 = (TLRPC.User) obj2;
                long j3 = y4Var.Z;
                Runnable runnable = y4Var.g0;
                if (runnable != null) {
                    runnable.run();
                }
                y4Var.dismiss();
                NotificationCenter.getInstance(UserConfig.selectedAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.giftsToUserSent, new Object[0]);
                AndroidUtilities.runOnUIThread(new xh.p4(i12, user3), 250L);
                MessagesController.getInstance(y4Var.Y).getMainSettings().edit().putBoolean("show_gift_for_" + j3, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j3, true).apply();
                break;
            case 17:
                yh.z3 z3Var = (yh.z3) obj3;
                String str6 = (String) obj2;
                TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) obj;
                yh.w3 w3Var = z3Var.e0;
                ei.k[] kVarArr = z3Var.s0;
                ci.d dVar = z3Var.j0;
                if (stargiftupgradepreview != null) {
                    w3Var.setPreviewingAttributes(stargiftupgradepreview.sample_attributes);
                    z3Var.q2(1, false, null);
                    w3Var.i(1, LocaleController.getString(R.string.Gift2LearnMoreTitle), LocaleController.formatString(R.string.Gift2LearnMoreText, str6), null);
                    kVarArr[0].setText(LocaleController.getString(R.string.Gift2UpgradeFeature1TextLearn));
                    kVarArr[1].setText(LocaleController.getString(R.string.Gift2UpgradeFeature2TextLearn));
                    kVarArr[2].setText(LocaleController.getString(R.string.Gift2UpgradeFeature3TextLearn));
                    z3Var.u0.setVisibility(8);
                    z3Var.t0.setVisibility(8);
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), false, true);
                    dVar.f(null, false);
                    dVar.setOnClickListener(new yh.u0(z3Var, i11));
                    z3Var.show();
                    break;
                }
                break;
            case 18:
                yh.z3.n0((yh.z3) obj3, (org.telegram.ui.ActionBar.b2) obj2, (TL_stars.SavedStarGift) obj);
                break;
            case 19:
                yh.z2 z2Var = (yh.z2) obj3;
                z2Var.getClass();
                ((yh.w2) obj2).a((TL_stars.StarGift) obj, true);
                z2Var.d(true);
                break;
            case 20:
                yh.e3 e3Var = (yh.e3) obj3;
                zf.b bVar = (zf.b) obj2;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) obj;
                nf.e eVar = e3Var.n;
                if (eVar != null && bVar == e3Var.q) {
                    eVar.c(false);
                }
                e3Var.p.remove(bVar);
                if (tL_payments_paymentFormStarGift != null) {
                    e3Var.o.put(bVar, new yh.c3(bVar, tL_payments_paymentFormStarGift));
                    e3Var.a(true);
                    break;
                }
                break;
            default:
                ((Utilities.Callback2) obj3).run((zf.a) obj, new yh.x2((yh.i0[]) obj2, i11));
                break;
        }
    }
}
