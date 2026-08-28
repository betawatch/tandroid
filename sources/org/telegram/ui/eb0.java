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
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eb0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Document document;
        f2.q1 K;
        qh.r a2;
        int i9 = this.a;
        int i10 = 1;
        int i11 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i9) {
            case 0:
                kb0 kb0Var = (kb0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                kb0Var.a();
                if (user != null) {
                    long j10 = userArr[0].id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    kb0Var.n(new jb0(bundle, user, userArr, j10), false);
                    break;
                }
                break;
            case 1:
                bj0 bj0Var = (bj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = bj0Var.b0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && bj0Var.Q(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool = bj0Var.n0;
                if (bool == null || !bool.booleanValue()) {
                    bj0Var.T(true, true);
                    break;
                } else {
                    eb0 eb0Var = new eb0(2, bj0Var, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str == null || str.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new af.e(eb0Var, 10));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i11 = connectionsManager.sendRequest(tL_contacts_search, new bg.j0(i10, messagesController, eb0Var));
                    }
                    bj0Var.i0 = i11;
                    break;
                }
            case 2:
                bj0 bj0Var2 = (bj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && bj0Var2.Q(user3)) {
                            bj0Var2.b0.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                bj0Var2.T(true, true);
                break;
            case 3:
                nj0 nj0Var = (nj0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    nj0Var.N.setImageDrawable(null);
                    nj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new cf0(7, nj0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = nj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(nj0Var.getThemedColor(org.telegram.ui.ActionBar.f6.v6), PorterDuff.Mode.SRC_IN));
                    nj0Var.N.setImageDrawable(mutate);
                    if (user4.contact) {
                        nj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new cf0(8, nj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        nj0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                nj0Var.w(false);
                break;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj3;
                org.telegram.ui.Components.o9[] o9VarArr = (org.telegram.ui.Components.o9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                        String str3 = (String) arrayList2.get(i12);
                        int i13 = 0;
                        while (true) {
                            if (i13 < tL_messages_stickerSet.packs.size()) {
                                if (tL_messages_stickerSet.packs.get(i13).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i13).emoticon, str3)) {
                                    i13++;
                                } else {
                                    long longValue = tL_messages_stickerSet.packs.get(i13).documents.get(0).longValue();
                                    for (int i14 = 0; i14 < tL_messages_stickerSet.documents.size(); i14++) {
                                        if (tL_messages_stickerSet.documents.get(i14).id == longValue) {
                                            document = tL_messages_stickerSet.documents.get(i14);
                                        }
                                    }
                                }
                            }
                        }
                        document = null;
                        if (document != null) {
                            o9VarArr[i12].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
                        }
                    }
                    break;
                }
                break;
            case 5:
                ((String[]) obj3)[0] = (String) obj;
                ((rk0) obj2).run();
                break;
            case 6:
                zo0 zo0Var = (zo0) obj3;
                zo0Var.n = false;
                ((uo0) obj2).f.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    zo0Var.u0();
                    zo0Var.finishFragment();
                    zo0Var.x0();
                    break;
                }
                break;
            case 7:
                iv0 iv0Var = (iv0) obj3;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj2;
                Long l10 = (Long) obj;
                iv0Var.getClass();
                Bundle bundle2 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle2.putLong("user_id", l10.longValue());
                } else {
                    bundle2.putLong("chat_id", -l10.longValue());
                }
                o2Var.presentFragment(new ProfileActivity(bundle2, null));
                iv0Var.c(false);
                break;
            case 8:
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new kr0(profileActivity, userFull, tL_birthday2, 3), 1024);
                break;
            case 9:
                j01 j01Var = (j01) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = b61.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder t10 = aa.d.t("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = m01.s;
                    FileLog.e(t10.toString());
                    break;
                } else {
                    l01 l01Var = new l01();
                    j01Var.c = l01Var;
                    j01Var.e.add(l01Var);
                    int f10 = py.f();
                    j01Var.c.setAutoRepeat(0);
                    l01 l01Var2 = j01Var.c;
                    String str5 = f10 + "_" + f10 + "_precache";
                    ky0 ky0Var = new ky0(j01Var, 5);
                    l01Var2.getClass();
                    l01Var2.setDelegate(new k01(new Runnable[]{ky0Var}));
                    l01Var2.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                    j01Var.c.onAttachedToWindow();
                    j01Var.g[1] = true;
                    j01Var.a();
                    break;
                }
            case 10:
                ((bg.k) obj3).run((HashSet) obj2);
                break;
            case 11:
                d41 d41Var = (d41) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    d41Var.getClass();
                    view.setVisibility(0);
                }
                d41Var.f = bitmap;
                Paint paint = new Paint(1);
                d41Var.n = paint;
                Bitmap bitmap2 = d41Var.f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                d41Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.f6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.f6.I.q() ? -0.02f : -0.04f);
                d41Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                d41Var.r = new Matrix();
                break;
            case 12:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.J0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.wk0 wk0Var = themeActivity.b;
                    if (wk0Var != null && wk0Var.C && (K = wk0Var.K(themeActivity.I)) != null) {
                        themeActivity.a.v(K, themeActivity.I);
                        break;
                    }
                }
                break;
            case 13:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                n21 n21Var = (n21) obj2;
                if (((Boolean) obj).booleanValue()) {
                    n21Var.run();
                    break;
                } else {
                    org.telegram.ui.Components.oc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 14:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj3;
                String str6 = (String) obj2;
                Boolean bool2 = (Boolean) obj;
                y0Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool2.booleanValue() ? TextUtils.isEmpty(str6) ? "removed" : "updated" : "failed");
                    y0Var.v("biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 15:
                org.telegram.ui.web.u1 u1Var = (org.telegram.ui.web.u1) obj3;
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj;
                u1Var.getClass();
                ((org.telegram.ui.web.c1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = u1Var.e;
                if (callback != null) {
                    u1Var.finishFragment();
                    callback.run(z0Var);
                    break;
                } else {
                    ve.e.s(u1Var.getParentActivity(), z0Var.c);
                    break;
                }
            case 16:
                org.telegram.ui.web.d2 d2Var = (org.telegram.ui.web.d2) obj3;
                d2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ue0(d2Var, (org.telegram.ui.web.c2) obj2, (Bitmap) obj, 26));
                break;
            case 17:
                View view2 = (View) obj3;
                pf.o oVar = (pf.o) obj2;
                Runnable runnable = (Runnable) obj;
                if (view2 != null) {
                    view2.requestFocus();
                }
                AndroidUtilities.hideKeyboard(oVar);
                AndroidUtilities.runOnUIThread(runnable, 80L);
                break;
            case 18:
                pf.q1 q1Var = (pf.q1) obj2;
                pf.r1 f11 = pf.r1.f(UserConfig.selectedAccount);
                org.telegram.ui.Components.ki kiVar = ((pf.e0) obj3).b;
                long n12 = kiVar.n1();
                int i15 = f11.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i15).getInputPeer(n12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = q1Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i15);
                    messagesStorage.getStorageQueue().postRunnable(new ir0(f11, messagesStorage, q1Var, tL_messages_sendQuickReplyMessages, 22));
                }
                kiVar.dismiss();
                break;
            case 19:
                pf.y0.V((pf.y0) obj3, (View) obj2, (String) obj);
                break;
            case 20:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str7 = (String) obj;
                qh.o3 o3Var = ((qh.p) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str7;
                    o3Var.U2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str7;
                    o3Var.R1(pageblockmath2);
                    break;
                }
            case 21:
                qh.d1 d1Var = (qh.d1) obj3;
                qh.r rVar = (qh.r) obj2;
                String str8 = (String) obj;
                d1Var.getClass();
                if (!TextUtils.isEmpty(str8)) {
                    Editable text = d1Var.getText();
                    int spanStart = text.getSpanStart(rVar);
                    int spanEnd = text.getSpanEnd(rVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = qh.r.a(str8, d1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
                        boolean z10 = d1Var.v;
                        if (z10) {
                            d1Var.setLocked(false);
                        }
                        SpannableString spannableString = new SpannableString(" ");
                        spannableString.setSpan(a2, 0, 1, 33);
                        int max = Math.max(0, Math.min(spanStart, d1Var.length()));
                        text.replace(max, Math.max(max, Math.min(spanEnd, d1Var.length())), spannableString);
                        d1Var.setSelection(Math.min(max + 1, d1Var.length()));
                        if (z10) {
                            d1Var.setLocked(true);
                            break;
                        }
                    }
                }
                break;
            case 22:
                qh.x1 x1Var = (qh.x1) obj3;
                TL_iv.pageBlockMath pageblockmath3 = (TL_iv.pageBlockMath) obj2;
                String str9 = (String) obj;
                x1Var.getClass();
                if (pageblockmath3 != null) {
                    pageblockmath3.source = str9;
                    x1Var.L.U2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath4 = new TL_iv.pageBlockMath();
                    pageblockmath4.source = str9;
                    x1Var.L.R1(pageblockmath4);
                    break;
                }
            default:
                qh.o3 o3Var2 = (qh.o3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str10 = (String) obj;
                o3Var2.getClass();
                if (!TextUtils.equals(str10, pageblockmath5.source)) {
                    qh.b2 b2Var = o3Var2.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    pageblockmath5.source = str10;
                    o3Var2.U2.N(false);
                    qh.b2 b2Var2 = o3Var2.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    o3Var2.d3.onContentChanged();
                    break;
                }
                break;
        }
    }
}
