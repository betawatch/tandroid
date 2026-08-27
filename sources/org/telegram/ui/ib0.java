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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ib0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ib0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        TLRPC.Document document;
        f2.o1 K;
        rh.r a2;
        int i10 = this.a;
        int i11 = 1;
        int i12 = 0;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i10) {
            case 0:
                ob0 ob0Var = (ob0) obj3;
                TLRPC.User[] userArr = (TLRPC.User[]) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ob0Var.a();
                if (user != null) {
                    long j10 = userArr[0].id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.id);
                    ob0Var.n(new nb0(bundle, user, userArr, j10), false);
                    break;
                }
                break;
            case 1:
                dj0 dj0Var = (dj0) obj3;
                String str = (String) obj2;
                List<TLRPC.User> list = (List) obj;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = dj0Var.b0;
                arrayList.clear();
                if (list != null) {
                    for (TLRPC.User user2 : list) {
                        if (user2 != null && !hashSet.contains(Long.valueOf(user2.id)) && dj0Var.R(user2)) {
                            arrayList.add(user2);
                            hashSet.add(Long.valueOf(user2.id));
                        }
                    }
                }
                Boolean bool = dj0Var.n0;
                if (bool == null || !bool.booleanValue()) {
                    dj0Var.U(true, true);
                    break;
                } else {
                    ib0 ib0Var = new ib0(2, dj0Var, hashSet);
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    if (str == null || str.isEmpty()) {
                        AndroidUtilities.runOnUIThread(new af.e(ib0Var, 22));
                    } else {
                        TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                        tL_contacts_search.q = str;
                        tL_contacts_search.limit = 50;
                        i12 = connectionsManager.sendRequest(tL_contacts_search, new cg.g0(i11, messagesController, ib0Var));
                    }
                    dj0Var.i0 = i12;
                    break;
                }
            case 2:
                dj0 dj0Var2 = (dj0) obj3;
                HashSet hashSet2 = (HashSet) obj2;
                List<TLRPC.User> list2 = (List) obj;
                if (list2 != null) {
                    for (TLRPC.User user3 : list2) {
                        if (user3 != null && !hashSet2.contains(Long.valueOf(user3.id)) && dj0Var2.R(user3)) {
                            dj0Var2.b0.add(user3);
                            hashSet2.add(Long.valueOf(user3.id));
                        }
                    }
                }
                dj0Var2.U(true, true);
                break;
            case 3:
                oj0 oj0Var = (oj0) obj3;
                String str2 = (String) obj2;
                TLRPC.User user4 = (TLRPC.User) obj;
                if (user4 == null) {
                    oj0Var.N.setImageDrawable(null);
                    oj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is not on Telegram. **Invite >**", new ff0(7, oj0Var, str2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                } else {
                    Drawable mutate = oj0Var.getContext().getResources().getDrawable(R.drawable.msg_text_check).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(oj0Var.getThemedColor(org.telegram.ui.ActionBar.g6.v6), PorterDuff.Mode.SRC_IN));
                    oj0Var.N.setImageDrawable(mutate);
                    if (user4.contact) {
                        oj0Var.v.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("This phone number is already in your contacts. **View >**", new ff0(8, oj0Var, user4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
                    } else {
                        oj0Var.v.setText("This phone number is on Telegram.");
                    }
                }
                oj0Var.x(false);
                break;
            case 4:
                ArrayList arrayList2 = (ArrayList) obj3;
                org.telegram.ui.Components.n9[] n9VarArr = (org.telegram.ui.Components.n9[]) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                if (tL_messages_stickerSet != null && tL_messages_stickerSet.set != null) {
                    for (int i13 = 0; i13 < arrayList2.size(); i13++) {
                        String str3 = (String) arrayList2.get(i13);
                        int i14 = 0;
                        while (true) {
                            if (i14 < tL_messages_stickerSet.packs.size()) {
                                if (tL_messages_stickerSet.packs.get(i14).documents.isEmpty() || !TextUtils.equals(tL_messages_stickerSet.packs.get(i14).emoticon, str3)) {
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
                            n9VarArr[i13].l(ImageLocation.getForDocument(document), "40_40", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 40), document), "40_40", Emoji.getEmojiBigDrawable(str3), null);
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
                ap0 ap0Var = (ap0) obj3;
                ap0Var.n = false;
                ((vo0) obj2).f.setLoading(false);
                if (((Boolean) obj).booleanValue()) {
                    ap0Var.v0();
                    ap0Var.finishFragment();
                    ap0Var.y0();
                    break;
                }
                break;
            case 7:
                jv0 jv0Var = (jv0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj2;
                Long l10 = (Long) obj;
                jv0Var.getClass();
                Bundle bundle2 = new Bundle();
                if (l10.longValue() >= 0) {
                    bundle2.putLong("user_id", l10.longValue());
                } else {
                    bundle2.putLong("chat_id", -l10.longValue());
                }
                n2Var.presentFragment(new ProfileActivity(bundle2, null));
                jv0Var.c(false);
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
                profileActivity.getConnectionsManager().sendRequest(updatebirthday, new lr0(profileActivity, userFull, tL_birthday2, 3), 1024);
                break;
            case 9:
                k01 k01Var = (k01) obj3;
                String str4 = (String) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                TLRPC.Document k10 = a61.k(str4, tL_messages_stickerSet2);
                if (k10 == null) {
                    StringBuilder r10 = a9.p.r("couldn't find ", str4, " sticker in EmojiAnimations");
                    String[] strArr = n01.s;
                    FileLog.e(r10.toString());
                    break;
                } else {
                    m01 m01Var = new m01();
                    k01Var.c = m01Var;
                    k01Var.e.add(m01Var);
                    int f10 = sy.f();
                    k01Var.c.setAutoRepeat(0);
                    m01 m01Var2 = k01Var.c;
                    String str5 = f10 + "_" + f10 + "_precache";
                    ky0 ky0Var = new ky0(k01Var, 5);
                    m01Var2.getClass();
                    m01Var2.setDelegate(new l01(new Runnable[]{ky0Var}));
                    m01Var2.setImage(ImageLocation.getForDocument(k10), str5, null, null, tL_messages_stickerSet2, 0);
                    k01Var.c.onAttachedToWindow();
                    k01Var.g[1] = true;
                    k01Var.a();
                    break;
                }
            case 10:
                ((cg.h) obj3).run((HashSet) obj2);
                break;
            case 11:
                c41 c41Var = (c41) obj3;
                View view = (View) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (view != null) {
                    c41Var.getClass();
                    view.setVisibility(0);
                }
                c41Var.f = bitmap;
                Paint paint = new Paint(1);
                c41Var.n = paint;
                Bitmap bitmap2 = c41Var.f;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                c41Var.h = bitmapShader;
                paint.setShader(bitmapShader);
                ColorMatrix colorMatrix = new ColorMatrix();
                AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? 0.05f : 0.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, org.telegram.ui.ActionBar.g6.I.q() ? -0.02f : -0.04f);
                c41Var.n.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
                c41Var.r = new Matrix();
                break;
            case 12:
                ThemeActivity themeActivity = (ThemeActivity) obj3;
                AtomicReference atomicReference = (AtomicReference) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    SharedConfig.recordViaSco = false;
                    SharedConfig.saveConfig();
                    themeActivity.J0 = true;
                    ((Dialog) atomicReference.get()).dismiss();
                    org.telegram.ui.Components.zk0 zk0Var = themeActivity.b;
                    if (zk0Var != null && zk0Var.C && (K = zk0Var.K(themeActivity.I)) != null) {
                        themeActivity.a.v(K, themeActivity.I);
                        break;
                    }
                }
                break;
            case 13:
                ThemeActivity themeActivity2 = (ThemeActivity) obj3;
                m21 m21Var = (m21) obj2;
                if (((Boolean) obj).booleanValue()) {
                    m21Var.run();
                    break;
                } else {
                    org.telegram.ui.Components.mc.a0(themeActivity2).M(LocaleController.getString(R.string.AgeVerificationFailedTitle), LocaleController.getString(R.string.AgeVerificationFailedText), R.raw.error).j();
                    break;
                }
            case 14:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj3;
                String str6 = (String) obj2;
                Boolean bool2 = (Boolean) obj;
                z0Var.getClass();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("status", bool2.booleanValue() ? TextUtils.isEmpty(str6) ? "removed" : "updated" : "failed");
                    z0Var.v("biometry_token_updated", jSONObject);
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 15:
                org.telegram.ui.web.v1 v1Var = (org.telegram.ui.web.v1) obj3;
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                v1Var.getClass();
                ((org.telegram.ui.web.d1[]) obj2)[0].finishFragment();
                Utilities.Callback callback = v1Var.e;
                if (callback != null) {
                    v1Var.finishFragment();
                    callback.run(a1Var);
                    break;
                } else {
                    we.e.s(v1Var.getParentActivity(), a1Var.c);
                    break;
                }
            case 16:
                org.telegram.ui.web.e2 e2Var = (org.telegram.ui.web.e2) obj3;
                e2Var.getClass();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.gs0(e2Var, (org.telegram.ui.web.d2) obj2, (Bitmap) obj, 20));
                break;
            case 17:
                View view2 = (View) obj3;
                qf.p pVar = (qf.p) obj2;
                Runnable runnable = (Runnable) obj;
                if (view2 != null) {
                    view2.requestFocus();
                }
                AndroidUtilities.hideKeyboard(pVar);
                AndroidUtilities.runOnUIThread(runnable, 80L);
                break;
            case 18:
                qf.p1 p1Var = (qf.p1) obj2;
                qf.q1 f11 = qf.q1.f(UserConfig.selectedAccount);
                org.telegram.ui.Components.gi giVar = ((qf.e0) obj3).b;
                long n12 = giVar.n1();
                int i16 = f11.a;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = new TLRPC.TL_messages_sendQuickReplyMessages();
                TLRPC.InputPeer inputPeer = MessagesController.getInstance(i16).getInputPeer(n12);
                tL_messages_sendQuickReplyMessages.peer = inputPeer;
                if (inputPeer != null) {
                    tL_messages_sendQuickReplyMessages.shortcut_id = p1Var.a;
                    MessagesStorage messagesStorage = MessagesStorage.getInstance(i16);
                    messagesStorage.getStorageQueue().postRunnable(new ex0(f11, messagesStorage, p1Var, tL_messages_sendQuickReplyMessages, 22));
                }
                giVar.dismiss();
                break;
            case 19:
                qf.y0.W((qf.y0) obj3, (View) obj2, (String) obj);
                break;
            case 20:
                TL_iv.pageBlockMath pageblockmath = (TL_iv.pageBlockMath) obj2;
                String str7 = (String) obj;
                rh.p3 p3Var = ((rh.p) obj3).r;
                if (pageblockmath != null) {
                    pageblockmath.source = str7;
                    p3Var.U2.N(false);
                    break;
                } else {
                    TL_iv.pageBlockMath pageblockmath2 = new TL_iv.pageBlockMath();
                    pageblockmath2.source = str7;
                    p3Var.R1(pageblockmath2);
                    break;
                }
            case 21:
                rh.d1 d1Var = (rh.d1) obj3;
                rh.r rVar = (rh.r) obj2;
                String str8 = (String) obj;
                d1Var.getClass();
                if (!TextUtils.isEmpty(str8)) {
                    Editable text = d1Var.getText();
                    int spanStart = text.getSpanStart(rVar);
                    int spanEnd = text.getSpanEnd(rVar);
                    if (spanStart >= 0 && spanEnd >= 0 && (a2 = rh.r.a(str8, d1Var.getCurrentTextColor(), AndroidUtilities.dp(SharedConfig.fontSize + 4))) != null) {
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
                rh.x1 x1Var = (rh.x1) obj3;
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
                rh.p3 p3Var2 = (rh.p3) obj3;
                TL_iv.pageBlockMath pageblockmath5 = (TL_iv.pageBlockMath) obj2;
                String str10 = (String) obj;
                p3Var2.getClass();
                if (!TextUtils.equals(str10, pageblockmath5.source)) {
                    rh.b2 b2Var = p3Var2.F3;
                    if (b2Var != null) {
                        b2Var.d();
                    }
                    pageblockmath5.source = str10;
                    p3Var2.U2.N(false);
                    rh.b2 b2Var2 = p3Var2.F3;
                    if (b2Var2 != null) {
                        b2Var2.h();
                    }
                    p3Var2.d3.onContentChanged();
                    break;
                }
                break;
        }
    }
}
