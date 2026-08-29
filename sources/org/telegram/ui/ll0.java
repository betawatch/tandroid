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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ll0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x0465  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        FrameLayout frameLayout;
        String str;
        org.telegram.ui.Components.tc a02;
        int i10;
        int i11 = this.a;
        int i12 = 3;
        int i13 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                vm0.X((vm0) obj2, (SecureDocument) obj, i13);
                break;
            case 1:
                bo0 bo0Var = (bo0) obj2;
                Intent intent = (Intent) obj;
                if (i13 != -1) {
                    z10 = true;
                    if (i13 == 1) {
                        int i14 = h8.a.c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.b : "");
                        FileLog.e(sb2.toString());
                    }
                    bo0Var.H0(z10, false);
                    bo0Var.D0(false);
                    frameLayout = bo0Var.L;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<h8.i> creator = h8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    h8.i iVar = (h8.i) (byteArrayExtra != null ? com.google.android.gms.internal.play_billing.r1.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (bo0Var.G0 == null && bo0Var.I0 == null) {
                                androidx.biometric.e a2 = h7.l7.a(string);
                                bo0Var.s0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a2.c, (String) a2.b);
                                ec.a aVar = (ec.a) a2.d;
                                bo0Var.t0 = aVar.a() + " *" + aVar.b();
                                bo0Var.t0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            bo0Var.F0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            bo0Var.F0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                bo0Var.t0 = "Android Pay";
                            } else {
                                bo0Var.t0 = optString;
                            }
                            bo0Var.t0();
                        } catch (JSONException e10) {
                            FileLog.e(e10);
                        }
                    }
                }
                z10 = true;
                bo0Var.H0(z10, false);
                bo0Var.D0(false);
                frameLayout = bo0Var.L;
                if (frameLayout == null) {
                }
                break;
            case 2:
                qt0 qt0Var = (qt0) obj2;
                Uri uri = (Uri) obj;
                qt0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i15 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.c6 c6Var = new org.telegram.ui.Components.c6(file, true, 0L, 0, null, null, null, 0L, i15, false, point.x, point.y, null, 0, true);
                    Bitmap q6 = c6Var.q(0L, false);
                    c6Var.u();
                    AndroidUtilities.runOnUIThread(new ll0(qt0Var, i13, q6, i12));
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new vk0(qt0Var, 23));
                    return;
                }
            case 3:
                qt0 qt0Var2 = (qt0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i13 == qt0Var2.a) {
                    qt0Var2.setImageBitmap(bitmap);
                    qt0Var2.c = true;
                    qt0Var2.b = false;
                    break;
                }
                break;
            case 4:
                iv0 iv0Var = (iv0) obj2;
                ((qe) obj).run(Integer.valueOf(i13));
                iv0Var.c(i13 == 1 || i13 == 13);
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                AndroidUtilities.addToClipboard((String) obj);
                if (i13 == profileActivity.S2) {
                    a02 = org.telegram.ui.Components.tc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.tc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                b.n(i10, a02);
                break;
            case 6:
                vz0 vz0Var = (vz0) obj2;
                f2.n1 n1Var = (f2.n1) obj;
                vz0Var.getClass();
                if (n1Var.b() == i13 && vz0Var.e.Q2 == i13 && n1Var.f == 2) {
                    vz0Var.v(n1Var, i13);
                    break;
                }
                break;
            case 7:
                org.telegram.ui.Components.tc.a0((org.telegram.ui.ActionBar.o2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i13).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.ii0) obj);
                break;
            case 8:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.tc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i13).disableAds(false);
                break;
            case 9:
                fd1 fd1Var = (fd1) obj2;
                ((qe) obj).run(Integer.valueOf(i13));
                fd1Var.c(i13 == 1 || i13 == 13);
                break;
            case 10:
                ci1 ci1Var = (ci1) obj2;
                TLObject tLObject = (TLObject) obj;
                HashMap hashMap = ci1Var.e;
                WallpapersListActivity wallpapersListActivity = ci1Var.A;
                ArrayList arrayList = ci1Var.d;
                if (i13 == ci1Var.v) {
                    ci1Var.s = 0;
                    int size = arrayList.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        ci1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i16);
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
                                    int i17 = 0;
                                    while (true) {
                                        if (i17 < botInlineResult.content.attributes.size()) {
                                            TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i17);
                                            if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                searchImage.width = documentAttribute.w;
                                                searchImage.height = documentAttribute.h;
                                            } else {
                                                i17++;
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
                        ci1Var.f = size == arrayList.size() || ci1Var.r == null;
                    }
                    if (size != arrayList.size()) {
                        int i18 = size % wallpapersListActivity.N;
                        float f9 = size;
                        int ceil = (int) Math.ceil(f9 / r0);
                        if (i18 != 0) {
                            ci1Var.m(((int) Math.ceil(f9 / wallpapersListActivity.N)) - 1);
                        }
                        wallpapersListActivity.F.s(ceil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.N)) - ceil);
                    }
                    wallpapersListActivity.J.c();
                    break;
                }
                break;
            case 11:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) obj2;
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj;
                SendMessagesHelper.getInstance(z0Var.I).sendMessage(SendMessagesHelper.SendMessageParams.of(UserConfig.getInstance(z0Var.I).getCurrentUser(), z0Var.Q.id, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                try {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("status", "sent");
                    org.telegram.ui.web.z0.u(i13, w0Var, "phone_requested", jSONObject3);
                    break;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return;
                }
            case 12:
                int[] iArr = (int[]) obj2;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) obj;
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i13).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i13).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    break;
                }
                break;
            case 13:
                ph.n3 n3Var = (ph.n3) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ph.i3 i3Var = n3Var.n;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    n3Var.x = tL_webViewResultUrl.query_id;
                    if (tL_webViewResultUrl.same_origin) {
                        i3Var.setTrustedOrigin(tL_webViewResultUrl.url);
                    }
                    i3Var.r(i13, tL_webViewResultUrl.url);
                    AndroidUtilities.runOnUIThread(n3Var.Q);
                    break;
                }
                break;
            case 14:
                rf.a0 a0Var = (rf.a0) obj2;
                String str2 = (String) obj;
                int i19 = a0Var.o0;
                a0Var.r = null;
                if (i13 == a0Var.Z) {
                    if (a0Var.n >= 0) {
                        ConnectionsManager.getInstance(i19).cancelRequest(a0Var.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    a0Var.n = ConnectionsManager.getInstance(i19).sendRequest(tL_channels_searchPosts, new eg.m0(a0Var, i13, str2, 10));
                    break;
                }
                break;
            case 15:
                sf.u uVar = (sf.u) obj2;
                uVar.b.add(i13, (TL_account.TL_businessChatLink) obj);
                NotificationCenter.getInstance(uVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 16:
                th.j5 m10 = ((th.g5) obj2).getGrid().m((TL_iv.pageTableCell) obj);
                if (m10 != null) {
                    th.d1 d1Var = m10.a;
                    d1Var.r();
                    d1Var.setSelection(Math.max(0, Math.min(i13, d1Var.length())));
                    break;
                }
                break;
            case 17:
                th.a aVar2 = (th.a) obj;
                th.t5 t5Var = ((th.o5) obj2).a;
                if (t5Var.y != null) {
                    th.t5.f(aVar2.b, "");
                    ((th.y2) t5Var.y).c(aVar2, i13);
                    break;
                }
                break;
            default:
                ((View) obj).postOnAnimation(new sf.p1((yg.a) obj2, i13, 4));
                break;
        }
    }

    public /* synthetic */ ll0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
