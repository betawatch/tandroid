package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class c90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c90(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.j0 j0Var) {
        this.a = 13;
        this.b = i10;
        this.c = callback;
        this.d = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:204:0x0621  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        FrameLayout frameLayout;
        String str;
        org.telegram.ui.Components.zc a02;
        int i10;
        boolean z11;
        int i11 = this.a;
        Object obj = this.d;
        int i12 = this.b;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) obj;
                Pattern pattern = LaunchActivity.B1;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
                if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
                    if (tL_help_appUpdate.can_not_skip) {
                        launchActivity.I0(i12, tL_help_appUpdate, false);
                    } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                        ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i12);
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                    break;
                }
                break;
            case 1:
                qi qiVar = (qi) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    qiVar.a = (TLRPC.User) tLObject;
                    MessagesController.getInstance(i12).putUser(qiVar.a, false);
                }
                org.telegram.ui.Components.f10 f10Var = qiVar.c;
                org.telegram.ui.Components.da0 da0Var = qiVar.b;
                qiVar.setEnabled(qiVar.a != null);
                TLRPC.User user = qiVar.a;
                if (user != null) {
                    da0Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new bi.g(qiVar, user.id, 28)));
                }
                da0Var.animate().alpha(1.0f).setDuration(220L).start();
                f10Var.animate().alpha(0.0f).setDuration(220L).setListener(new vo(f10Var)).start();
                break;
            case 2:
                un0.X((un0) obj2, (SecureDocument) obj, i12);
                break;
            case 3:
                cp0 cp0Var = (cp0) obj2;
                Intent intent = (Intent) obj;
                if (i12 != -1) {
                    z10 = true;
                    if (i12 == 1) {
                        int i13 = v8.a.c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.b : "");
                        FileLog.e(sb2.toString());
                    }
                    cp0Var.H0(z10, false);
                    cp0Var.D0(false);
                    frameLayout = cp0Var.P;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<v8.i> creator = v8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    v8.i iVar = (v8.i) (byteArrayExtra != null ? w7.h0.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (cp0Var.K0 == null && cp0Var.M0 == null) {
                                u2.c a2 = w7.q8.a(string);
                                cp0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a2.c, (String) a2.b);
                                wc.a aVar = (wc.a) a2.d;
                                cp0Var.x0 = aVar.a() + " *" + aVar.b();
                                cp0Var.t0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            cp0Var.J0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            cp0Var.J0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                cp0Var.x0 = "Android Pay";
                            } else {
                                cp0Var.x0 = optString;
                            }
                            cp0Var.t0();
                        } catch (JSONException e) {
                            FileLog.e(e);
                        }
                    }
                }
                z10 = true;
                cp0Var.H0(z10, false);
                cp0Var.D0(false);
                frameLayout = cp0Var.P;
                if (frameLayout == null) {
                }
                break;
            case 4:
                bv0 bv0Var = (bv0) obj2;
                Uri uri = (Uri) obj;
                bv0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i14 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(file, true, 0L, 0, null, null, null, 0L, i14, false, point.x, point.y, null, 0, true);
                    Bitmap q6 = f6Var.q(0L, false);
                    f6Var.u();
                    AndroidUtilities.runOnUIThread(new c90(bv0Var, i12, q6, 5));
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new yk0(bv0Var, 23));
                    return;
                }
            case 5:
                bv0 bv0Var2 = (bv0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i12 == bv0Var2.a) {
                    bv0Var2.setImageBitmap(bitmap);
                    bv0Var2.c = true;
                    bv0Var2.b = false;
                    break;
                }
                break;
            case 6:
                sw0 sw0Var = (sw0) obj2;
                ((jf) obj).run(Integer.valueOf(i12));
                sw0Var.c(i12 == 1 || i12 == 13);
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                AndroidUtilities.addToClipboard((String) obj);
                if (i12 == profileActivity.W2) {
                    a02 = org.telegram.ui.Components.zc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.zc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                org.telegram.messenger.yh.o(i10, a02);
                break;
            case 8:
                f11 f11Var = (f11) obj2;
                s4.b1 b1Var = (s4.b1) obj;
                f11Var.getClass();
                if (b1Var.b() == i12 && f11Var.e.U2 == i12 && b1Var.f == 2) {
                    f11Var.v(b1Var, i12);
                    break;
                }
                break;
            case 9:
                org.telegram.ui.Components.zc.a0((org.telegram.ui.ActionBar.m2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.f60) obj);
                break;
            case 10:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.zc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                break;
            case 11:
                se1 se1Var = (se1) obj2;
                ((jf) obj).run(Integer.valueOf(i12));
                se1Var.c(i12 == 1 || i12 == 13);
                break;
            case 12:
                org.telegram.ui.Wallet.y0 y0Var = ((org.telegram.ui.Wallet.x0) obj2).c;
                if (y0Var.c((tc.u) obj, i12)) {
                    y0Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 13:
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new org.telegram.messenger.a(), new org.telegram.ui.Wallet.i((Utilities.Callback) obj2, (org.telegram.ui.Wallet.j0) obj, connectionsManager));
                break;
            case 14:
                Context context = (Context) obj2;
                String str2 = ((TL_wallet.walletTransaction[]) obj)[0].tx_hash;
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = MessagesController.getInstance(i12).tonBlockchainExplorerUrl;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "https://tonviewer.com/";
                    } else if (!str3.endsWith("/")) {
                        str3 = str3.concat("/");
                    }
                    StringBuilder i15 = t8.b.i(str3, "transaction/");
                    i15.append(Uri.encode(str2));
                    pf.d.u(context, i15.toString());
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) obj;
                int i16 = i12 + 1;
                ArrayList arrayList = ((org.telegram.ui.Wallet.z6) obj2).v;
                if (i16 >= arrayList.size()) {
                    AndroidUtilities.hideKeyboard(h9Var);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.h9) arrayList.get(i16)).a.requestFocus();
                    break;
                }
            case 16:
                org.telegram.ui.Wallet.h9 h9Var2 = (org.telegram.ui.Wallet.h9) obj;
                int i17 = i12 + 1;
                ArrayList arrayList2 = ((org.telegram.ui.Wallet.z8) obj2).d;
                if (i17 >= arrayList2.size()) {
                    AndroidUtilities.hideKeyboard(h9Var2);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.h9) arrayList2.get(i17)).a.requestFocus();
                    break;
                }
            case 17:
                sj1 sj1Var = (sj1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                HashMap hashMap = sj1Var.e;
                WallpapersListActivity wallpapersListActivity = sj1Var.E;
                ArrayList arrayList3 = sj1Var.d;
                if (i12 == sj1Var.v) {
                    sj1Var.s = 0;
                    int size = arrayList3.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        sj1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i18);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    z11 = r8;
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
                                        arrayList3.add(searchImage);
                                        hashMap.put(searchImage.id, searchImage);
                                    }
                                } else {
                                    z11 = r8;
                                    if (botInlineResult.content != null) {
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i19);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    searchImage.width = documentAttribute.w;
                                                    searchImage.height = documentAttribute.h;
                                                } else {
                                                    i19++;
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
                                        arrayList3.add(searchImage);
                                        hashMap.put(searchImage.id, searchImage);
                                    }
                                }
                            } else {
                                z11 = r8;
                            }
                            i18++;
                            r8 = z11;
                        }
                        sj1Var.f = (size == arrayList3.size() || sj1Var.r == null) ? r8 : false;
                    }
                    if (size != arrayList3.size()) {
                        int i20 = size % wallpapersListActivity.R;
                        float f7 = size;
                        int ceil = (int) Math.ceil(f7 / r0);
                        if (i20 != 0) {
                            sj1Var.m(((int) Math.ceil(f7 / wallpapersListActivity.R)) - 1);
                        }
                        wallpapersListActivity.J.s(ceil, ((int) Math.ceil(arrayList3.size() / wallpapersListActivity.R)) - ceil);
                    }
                    wallpapersListActivity.N.c();
                    break;
                }
                break;
            case 18:
                qg.q0 q0Var = (qg.q0) obj2;
                q0Var.e((qg.f1) obj, i12, q0Var.h);
                q0Var.h = null;
                break;
            case 19:
                ((r4.c) ((p4.t0) obj2).c).G(i12, obj);
                break;
            case 20:
                rg.o0 o0Var = (rg.o0) obj2;
                qg.l lVar = (qg.l) obj;
                if (o0Var.W0.getCurrentBrush() instanceof qg.l) {
                    o0Var.k1 = true;
                }
                o0Var.o(lVar);
                rg.t1 t1Var = o0Var.t1;
                int i21 = t1Var.d + 1;
                t1Var.a(i21);
                AndroidUtilities.updateImageViewImageAnimated(t1Var.a[i21], i12);
                t1Var.e = true;
                break;
            case 21:
                org.telegram.ui.Components.ns0 ns0Var = (org.telegram.ui.Components.ns0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                zh.e5 e5Var = ns0Var.e;
                if (i12 != -1) {
                    int i22 = tL_starGiftCollection.collection_id;
                    int i23 = e5Var.a;
                    int f10 = e5Var.f(i22);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) e5Var.e.remove(f10);
                        e5Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i23).getInputPeer(e5Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i23).sendRequest(deletestargiftcollection, null);
                    }
                    ns0Var.f(true);
                    org.telegram.ui.Components.j91 j91Var = ns0Var.n;
                    if (i12 < e5Var.d().size()) {
                        i12++;
                    }
                    j91Var.d(-1, i12);
                    ns0Var.n();
                    break;
                }
                break;
            case 22:
                zh.s2 s2Var = (zh.s2) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int[] iArr = s2Var.V;
                zh.o2 o2Var = s2Var.f;
                zh.l2 l2Var = s2Var.h;
                if (starGift == null) {
                    FrameLayout frameLayout2 = new FrameLayout(s2Var.getContext());
                    org.telegram.ui.Components.bk0 bk0Var = new org.telegram.ui.Components.bk0(s2Var.getContext());
                    bk0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout2.addView(bk0Var, w7.a6.e(32, 32, 17));
                    bk0Var.setScaleX(0.5f);
                    bk0Var.setScaleY(0.5f);
                    bk0Var.setAlpha(0.0f);
                    bk0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    s2Var.l0 = bk0Var;
                    frameLayout2.setBackground(new zh.f3(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.g6.m1(0.075f, -1)));
                    l2Var.a[i12].setVisibility(8);
                    frameLayout2.setRotation(180.0f);
                    l2Var.f(i12, frameLayout2);
                    s2Var.F.a(iArr[2], iArr[3]);
                    zh.r2 r2Var = s2Var.b;
                    int[] iArr2 = s2Var.U;
                    r2Var.a(iArr2[2], iArr2[3]);
                    o2Var.a(iArr[3], iArr[2]);
                    break;
                } else {
                    zh.q2 q2Var = new zh.q2(s2Var.getContext());
                    q2Var.a(starGift, false);
                    q2Var.setRotation(180.0f);
                    l2Var.f(i12, q2Var);
                    q2Var.setScaleX(0.5f);
                    q2Var.setScaleY(0.5f);
                    q2Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = q2Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    org.telegram.ui.Components.es esVar = org.telegram.ui.Components.es.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(esVar);
                    interpolator.setUpdateListener(new ki.a(s2Var, 22));
                    interpolator.start();
                    l2Var.a[i12].setVisibility(8);
                    o2Var.setVisibility(0);
                    o2Var.setAlpha(0.0f);
                    o2Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(esVar).start();
                    break;
                }
            case 23:
                ((Utilities.Callback3) obj).run(LocaleController.formatString(R.string.Gift2RarityHint, fi.l.H0(i12)), (zh.i3) obj2, Boolean.FALSE);
                break;
            case 24:
                zh.n5 n5Var = (zh.n5) obj2;
                TLObject tLObject3 = (TLObject) obj;
                boolean[] zArr = n5Var.r;
                ArrayList[] arrayListArr = n5Var.q;
                int i24 = n5Var.a;
                n5Var.t[i12] = false;
                if (tLObject3 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject3;
                    MessagesController.getInstance(i24).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i24).putChats(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    zArr[i12] = !arrayListArr[i12].isEmpty() || zArr[i12];
                    boolean[] zArr2 = n5Var.u;
                    r8 = (starsStatus.flags & 1) == 0;
                    zArr2[i12] = r8;
                    n5Var.s[i12] = r8 ? null : starsStatus.next_offset;
                    n5Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i24).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    break;
                }
                break;
            default:
                pf.d.s((Context) obj2, "https://" + MessagesController.getInstance(i12).linkPrefix + "/nft/" + ((String) obj));
                break;
        }
    }

    public /* synthetic */ c90(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ c90(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
