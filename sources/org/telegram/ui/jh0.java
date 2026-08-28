package org.telegram.ui;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jh0(Object obj, int i9, Object obj2, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:156:0x0409  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        FrameLayout frameLayout;
        String str;
        org.telegram.ui.Components.oc a02;
        int i9;
        int i10 = this.a;
        int i11 = 1;
        int i12 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i10) {
            case 0:
                ai aiVar = (ai) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    aiVar.a = (TLRPC.User) tLObject;
                    MessagesController.getInstance(i12).putUser(aiVar.a, false);
                }
                org.telegram.ui.Components.e00 e00Var = aiVar.c;
                org.telegram.ui.Components.l80 l80Var = aiVar.b;
                aiVar.setEnabled(aiVar.a != null);
                TLRPC.User user = aiVar.a;
                if (user != null) {
                    l80Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new bg.i2(aiVar, user.id, 28)));
                }
                l80Var.animate().alpha(1.0f).setDuration(220L).start();
                e00Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.u9(e00Var)).start();
                break;
            case 1:
                wm0.W((wm0) obj2, (SecureDocument) obj, i12);
                break;
            case 2:
                co0 co0Var = (co0) obj2;
                Intent intent = (Intent) obj;
                if (i12 != -1) {
                    z10 = true;
                    if (i12 == 1) {
                        int i13 = f8.a.c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.b : "");
                        FileLog.e(sb2.toString());
                    }
                    co0Var.G0(z10, false);
                    co0Var.C0(false);
                    frameLayout = co0Var.L;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<f8.i> creator = f8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    f8.i iVar = (f8.i) (byteArrayExtra != null ? g7.q8.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (co0Var.G0 == null && co0Var.I0 == null) {
                                a5.m a2 = f7.u6.a(string);
                                co0Var.s0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a2.c, (String) a2.b);
                                cc.a aVar = (cc.a) a2.d;
                                co0Var.t0 = aVar.a() + " *" + aVar.b();
                                co0Var.s0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            co0Var.F0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            co0Var.F0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                co0Var.t0 = "Android Pay";
                            } else {
                                co0Var.t0 = optString;
                            }
                            co0Var.s0();
                        } catch (JSONException e10) {
                            FileLog.e(e10);
                        }
                    }
                }
                z10 = true;
                co0Var.G0(z10, false);
                co0Var.C0(false);
                frameLayout = co0Var.L;
                if (frameLayout == null) {
                }
                break;
            case 3:
                st0 st0Var = (st0) obj2;
                Uri uri = (Uri) obj;
                st0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i14 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.x5 x5Var = new org.telegram.ui.Components.x5(file, true, 0L, 0, null, null, null, 0L, i14, false, point.x, point.y, null, 0, true);
                    Bitmap q10 = x5Var.q(0L, false);
                    x5Var.u();
                    AndroidUtilities.runOnUIThread(new jh0(st0Var, i12, q10, 4));
                    break;
                } catch (Throwable th) {
                    FileLog.e(th);
                    AndroidUtilities.runOnUIThread(new zk0(st0Var, 23));
                    return;
                }
            case 4:
                st0 st0Var2 = (st0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i12 == st0Var2.a) {
                    st0Var2.setImageBitmap(bitmap);
                    st0Var2.c = true;
                    st0Var2.b = false;
                    break;
                }
                break;
            case 5:
                iv0 iv0Var = (iv0) obj2;
                ((se) obj).run(Integer.valueOf(i12));
                iv0Var.c(i12 == 1 || i12 == 13);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                AndroidUtilities.addToClipboard((String) obj);
                if (i12 == profileActivity.S2) {
                    a02 = org.telegram.ui.Components.oc.a0(profileActivity);
                    i9 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.oc.a0(profileActivity);
                    i9 = R.string.TextCopied;
                }
                org.telegram.messenger.ll.o(i9, a02);
                break;
            case 7:
                vz0 vz0Var = (vz0) obj2;
                f2.q1 q1Var = (f2.q1) obj;
                vz0Var.getClass();
                if (q1Var.b() == i12 && vz0Var.e.Q2 == i12 && q1Var.f == 2) {
                    vz0Var.v(q1Var, i12);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.oc.a0((org.telegram.ui.ActionBar.o2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.jg0) obj);
                break;
            case 9:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.oc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                break;
            case 10:
                dd1 dd1Var = (dd1) obj2;
                ((se) obj).run(Integer.valueOf(i12));
                dd1Var.c(i12 == 1 || i12 == 13);
                break;
            case 11:
                bi1 bi1Var = (bi1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                HashMap hashMap = bi1Var.e;
                WallpapersListActivity wallpapersListActivity = bi1Var.A;
                ArrayList arrayList = bi1Var.d;
                if (i12 == bi1Var.v) {
                    bi1Var.s = 0;
                    int size = arrayList.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        bi1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i15 = 0; i15 < size2; i15++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i15);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(botInlineResult.photo.sizes, 320);
                                    if (closestPhotoSizeWithSize != null) {
                                        searchImage.width = closestPhotoSizeWithSize.w;
                                        searchImage.height = closestPhotoSizeWithSize.h;
                                        searchImage.photoSize = closestPhotoSizeWithSize;
                                        searchImage.photo = botInlineResult.photo;
                                        searchImage.size = closestPhotoSizeWithSize.size;
                                        searchImage.thumbPhotoSize = closestPhotoSizeWithSize2;
                                        searchImage.id = botInlineResult.id;
                                        searchImage.type = 0;
                                        arrayList.add(searchImage);
                                        hashMap.put(searchImage.id, searchImage);
                                    }
                                } else if (botInlineResult.content != null) {
                                    int i16 = 0;
                                    while (true) {
                                        if (i16 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i16);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.w;
                                                searchImage.height = documentAttribute.h;
                                            } else {
                                                i16++;
                                            }
                                        }
                                    }
                                    TLRPC.WebDocument webDocument = botInlineResult.thumb;
                                    if (webDocument != null) {
                                        searchImage.thumbUrl = webDocument.url;
                                    } else {
                                        searchImage.thumbUrl = null;
                                    }
                                    TLRPC.WebDocument webDocument2 = botInlineResult.content;
                                    searchImage.imageUrl = webDocument2.url;
                                    searchImage.size = webDocument2.size;
                                    searchImage.id = botInlineResult.id;
                                    searchImage.type = 0;
                                    arrayList.add(searchImage);
                                    hashMap.put(searchImage.id, searchImage);
                                }
                            }
                        }
                        bi1Var.f = size == arrayList.size() || bi1Var.r == null;
                    }
                    if (size != arrayList.size()) {
                        int i17 = size % wallpapersListActivity.N;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / r0);
                        if (i17 != 0) {
                            bi1Var.m(((int) Math.ceil(f10 / wallpapersListActivity.N)) - 1);
                        }
                        wallpapersListActivity.F.s(ceil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.N)) - ceil);
                    }
                    wallpapersListActivity.J.c();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj2;
                org.telegram.ui.web.v0 v0Var = (org.telegram.ui.web.v0) obj;
                SendMessagesHelper.getInstance(y0Var.I).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(y0Var.I).getCurrentUser(), y0Var.Q.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("status", "sent");
                    org.telegram.ui.web.y0.u(i12, v0Var, "phone_requested", jSONObject3);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 13:
                pf.u uVar = (pf.u) obj2;
                uVar.b.add(i12, (TL_account.TL_businessChatLink) obj);
                NotificationCenter.getInstance(uVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 14:
                qh.i5 m10 = ((qh.f5) obj2).getGrid().m((TL_iv.pageTableCell) obj);
                if (m10 != null) {
                    qh.d1 d1Var = m10.a;
                    d1Var.r();
                    d1Var.setSelection(Math.max(0, Math.min(i12, d1Var.length())));
                    break;
                }
                break;
            case 15:
                qh.a aVar2 = (qh.a) obj;
                qh.s5 s5Var = ((qh.n5) obj2).a;
                if (s5Var.y != null) {
                    qh.s5.f(aVar2.b, "");
                    ((qh.x2) s5Var.y).c(aVar2, i12);
                    break;
                }
                break;
            case 16:
                ((View) obj).postOnAnimation(new ve.a((vg.a) obj2, i12, i11));
                break;
            case 17:
                xf.q0 q0Var = (xf.q0) obj2;
                q0Var.e((xf.f1) obj, i12, q0Var.h);
                q0Var.h = null;
                break;
            default:
                yf.l0 l0Var = (yf.l0) obj2;
                xf.l lVar = (xf.l) obj;
                if (l0Var.S0.getCurrentBrush() instanceof xf.l) {
                    l0Var.g1 = true;
                }
                l0Var.n(lVar);
                yf.r1 r1Var = l0Var.p1;
                int i18 = r1Var.d + 1;
                r1Var.a(i18);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.a[i18], i12);
                r1Var.e = true;
                break;
        }
    }

    public /* synthetic */ jh0(Object obj, Object obj2, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = i9;
    }
}
