package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SecureDocument;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_toncenter;
import org.telegram.tgnet.tl.TL_wallet;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ bi0(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.k0 k0Var) {
        this.a = 12;
        this.b = i10;
        this.c = callback;
        this.d = k0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:211:0x0656  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        FrameLayout frameLayout;
        String str;
        org.telegram.ui.Components.ad a02;
        int i10;
        boolean z11;
        int i11 = this.a;
        int i12 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                mi miVar = (mi) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    miVar.a = (TLRPC.User) tLObject;
                    MessagesController.getInstance(i12).putUser(miVar.a, false);
                }
                org.telegram.ui.Components.j10 j10Var = miVar.c;
                org.telegram.ui.Components.ea0 ea0Var = miVar.b;
                miVar.setEnabled(miVar.a != null);
                TLRPC.User user = miVar.a;
                if (user != null) {
                    ea0Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new ai.j(miVar, user.id, 28)));
                }
                ea0Var.animate().alpha(1.0f).setDuration(220L).start();
                j10Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.Components.fa(j10Var)).start();
                break;
            case 1:
                nn0.X((nn0) obj2, (SecureDocument) obj, i12);
                break;
            case 2:
                vo0 vo0Var = (vo0) obj2;
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
                    vo0Var.H0(z10, false);
                    vo0Var.D0(false);
                    frameLayout = vo0Var.P;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<v8.i> creator = v8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    v8.i iVar = (v8.i) (byteArrayExtra != null ? w7.e0.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (vo0Var.K0 == null && vo0Var.M0 == null) {
                                v7.k a2 = w7.e8.a(string);
                                vo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a2.c, (String) a2.b);
                                vc.a aVar = (vc.a) a2.d;
                                vo0Var.x0 = aVar.a() + " *" + aVar.b();
                                vo0Var.t0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            vo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            vo0Var.J0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                vo0Var.x0 = "Android Pay";
                            } else {
                                vo0Var.x0 = optString;
                            }
                            vo0Var.t0();
                        } catch (JSONException e7) {
                            FileLog.e(e7);
                        }
                    }
                }
                z10 = true;
                vo0Var.H0(z10, false);
                vo0Var.D0(false);
                frameLayout = vo0Var.P;
                if (frameLayout == null) {
                }
                break;
            case 3:
                vu0 vu0Var = (vu0) obj2;
                Uri uri = (Uri) obj;
                vu0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i14 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(file, true, 0L, 0, null, null, null, 0L, i14, false, point.x, point.y, null, 0, true);
                    Bitmap q6 = f6Var.q(0L, false);
                    f6Var.u();
                    AndroidUtilities.runOnUIThread(new bi0(vu0Var, i12, q6, 4));
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new tk0(vu0Var, 23));
                    return;
                }
            case 4:
                vu0 vu0Var2 = (vu0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i12 == vu0Var2.a) {
                    vu0Var2.setImageBitmap(bitmap);
                    vu0Var2.c = true;
                    vu0Var2.b = false;
                    break;
                }
                break;
            case 5:
                mw0 mw0Var = (mw0) obj2;
                ((cf) obj).run(Integer.valueOf(i12));
                mw0Var.c(i12 == 1 || i12 == 13);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                AndroidUtilities.addToClipboard((String) obj);
                if (i12 == profileActivity.W2) {
                    a02 = org.telegram.ui.Components.ad.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.ad.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                org.telegram.messenger.bi.p(i10, a02);
                break;
            case 7:
                y01 y01Var = (y01) obj2;
                s4.d1 d1Var = (s4.d1) obj;
                y01Var.getClass();
                if (d1Var.b() == i12 && y01Var.e.U2 == i12 && d1Var.f == 2) {
                    y01Var.v(d1Var, i12);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.ad.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.ci0) obj);
                break;
            case 9:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.ad) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                break;
            case 10:
                me1 me1Var = (me1) obj2;
                ((cf) obj).run(Integer.valueOf(i12));
                me1Var.c(i12 == 1 || i12 == 13);
                break;
            case 11:
                org.telegram.ui.Wallet.z0 z0Var = ((org.telegram.ui.Wallet.y0) obj2).c;
                if (z0Var.c((sc.u) obj, i12)) {
                    z0Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 12:
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new org.telegram.messenger.a(), new org.telegram.ui.Wallet.i((Utilities.Callback) obj2, (org.telegram.ui.Wallet.k0) obj, connectionsManager));
                break;
            case 13:
                Context context = (Context) obj2;
                String str2 = ((TL_wallet.walletTransaction[]) obj)[0].tx_hash;
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = MessagesController.getInstance(i12).tonBlockchainExplorerUrl;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "https://tonviewer.com/";
                    } else if (!str3.endsWith("/")) {
                        str3 = str3.concat("/");
                    }
                    StringBuilder j3 = sc.v.j(str3, "transaction/");
                    j3.append(Uri.encode(str2));
                    of.f.u(context, j3.toString());
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Wallet.h9 h9Var = (org.telegram.ui.Wallet.h9) obj;
                int i15 = i12 + 1;
                ArrayList arrayList = ((org.telegram.ui.Wallet.a7) obj2).v;
                if (i15 >= arrayList.size()) {
                    AndroidUtilities.hideKeyboard(h9Var);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.h9) arrayList.get(i15)).a.requestFocus();
                    break;
                }
            case 15:
                org.telegram.ui.Wallet.h9 h9Var2 = (org.telegram.ui.Wallet.h9) obj;
                int i16 = i12 + 1;
                ArrayList arrayList2 = ((org.telegram.ui.Wallet.z8) obj2).d;
                if (i16 >= arrayList2.size()) {
                    AndroidUtilities.hideKeyboard(h9Var2);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.h9) arrayList2.get(i16)).a.requestFocus();
                    break;
                }
            case 16:
                lj1 lj1Var = (lj1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                HashMap hashMap = lj1Var.e;
                WallpapersListActivity wallpapersListActivity = lj1Var.E;
                ArrayList arrayList3 = lj1Var.d;
                if (i12 == lj1Var.v) {
                    lj1Var.s = 0;
                    int size = arrayList3.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        lj1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i17);
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
                                        int i18 = 0;
                                        while (true) {
                                            if (i18 < botInlineResult.content.attributes.size()) {
                                                TLRPC.DocumentAttribute documentAttribute = botInlineResult.content.attributes.get(i18);
                                                if (documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) {
                                                    searchImage.width = documentAttribute.w;
                                                    searchImage.height = documentAttribute.h;
                                                } else {
                                                    i18++;
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
                            i17++;
                            r8 = z11;
                        }
                        lj1Var.f = (size == arrayList3.size() || lj1Var.r == null) ? r8 : false;
                    }
                    if (size != arrayList3.size()) {
                        int i19 = size % wallpapersListActivity.R;
                        float f7 = size;
                        int ceil = (int) Math.ceil(f7 / r0);
                        if (i19 != 0) {
                            lj1Var.m(((int) Math.ceil(f7 / wallpapersListActivity.R)) - 1);
                        }
                        wallpapersListActivity.J.s(ceil, ((int) Math.ceil(arrayList3.size() / wallpapersListActivity.R)) - ceil);
                    }
                    wallpapersListActivity.N.c();
                    break;
                }
                break;
            case 17:
                pg.s0 s0Var = (pg.s0) obj2;
                s0Var.e((pg.h1) obj, i12, s0Var.h);
                s0Var.h = null;
                break;
            case 18:
                qg.m0 m0Var = (qg.m0) obj2;
                pg.l lVar = (pg.l) obj;
                if (m0Var.W0.getCurrentBrush() instanceof pg.l) {
                    m0Var.k1 = true;
                }
                m0Var.b(lVar);
                qg.r1 r1Var = m0Var.t1;
                int i20 = r1Var.d + 1;
                r1Var.a(i20);
                AndroidUtilities.updateImageViewImageAnimated(r1Var.a[i20], i12);
                r1Var.e = true;
                break;
            case 19:
                ((r4.c) ((p4.s0) obj2).c).J(i12, obj);
                break;
            case 20:
                org.telegram.ui.Components.rs0 rs0Var = (org.telegram.ui.Components.rs0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                yh.d5 d5Var = rs0Var.e;
                if (i12 != -1) {
                    int i21 = tL_starGiftCollection.collection_id;
                    int i22 = d5Var.a;
                    int f10 = d5Var.f(i21);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) d5Var.e.remove(f10);
                        d5Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i22).getInputPeer(d5Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i22).sendRequest(deletestargiftcollection, null);
                    }
                    rs0Var.f(true);
                    org.telegram.ui.Components.n91 n91Var = rs0Var.n;
                    if (i12 < d5Var.d().size()) {
                        i12++;
                    }
                    n91Var.d(-1, i12);
                    rs0Var.n();
                    break;
                }
                break;
            case 21:
                yh.t2 t2Var = (yh.t2) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int[] iArr = t2Var.V;
                yh.p2 p2Var = t2Var.f;
                yh.m2 m2Var = t2Var.h;
                if (starGift == null) {
                    FrameLayout frameLayout2 = new FrameLayout(t2Var.getContext());
                    org.telegram.ui.Components.fk0 fk0Var = new org.telegram.ui.Components.fk0(t2Var.getContext());
                    fk0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout2.addView(fk0Var, w7.x5.e(32, 32, 17));
                    fk0Var.setScaleX(0.5f);
                    fk0Var.setScaleY(0.5f);
                    fk0Var.setAlpha(0.0f);
                    fk0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    t2Var.l0 = fk0Var;
                    frameLayout2.setBackground(new yh.g3(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.i6.m1(0.075f, -1)));
                    m2Var.a[i12].setVisibility(8);
                    frameLayout2.setRotation(180.0f);
                    m2Var.f(i12, frameLayout2);
                    t2Var.F.a(iArr[2], iArr[3]);
                    yh.s2 s2Var = t2Var.b;
                    int[] iArr2 = t2Var.U;
                    s2Var.a(iArr2[2], iArr2[3]);
                    p2Var.a(iArr[3], iArr[2]);
                    break;
                } else {
                    yh.r2 r2Var = new yh.r2(t2Var.getContext());
                    r2Var.a(starGift, false);
                    r2Var.setRotation(180.0f);
                    m2Var.f(i12, r2Var);
                    r2Var.setScaleX(0.5f);
                    r2Var.setScaleY(0.5f);
                    r2Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = r2Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    org.telegram.ui.Components.hs hsVar = org.telegram.ui.Components.hs.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(hsVar);
                    interpolator.setUpdateListener(new org.telegram.ui.Components.voip.r0(t2Var, 21));
                    interpolator.start();
                    m2Var.a[i12].setVisibility(8);
                    p2Var.setVisibility(0);
                    p2Var.setAlpha(0.0f);
                    p2Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(hsVar).start();
                    break;
                }
            case 22:
                ((Utilities.Callback3) obj).run(LocaleController.formatString(R.string.Gift2RarityHint, ei.l.H0(i12)), (yh.j3) obj2, Boolean.FALSE);
                break;
            case 23:
                yh.m5 m5Var = (yh.m5) obj2;
                TLObject tLObject3 = (TLObject) obj;
                boolean[] zArr = m5Var.r;
                ArrayList[] arrayListArr = m5Var.q;
                int i23 = m5Var.a;
                m5Var.t[i12] = false;
                if (tLObject3 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject3;
                    MessagesController.getInstance(i23).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i23).putChats(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    zArr[i12] = !arrayListArr[i12].isEmpty() || zArr[i12];
                    boolean[] zArr2 = m5Var.u;
                    r8 = (starsStatus.flags & 1) == 0;
                    zArr2[i12] = r8;
                    m5Var.s[i12] = r8 ? null : starsStatus.next_offset;
                    m5Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i23).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    break;
                }
                break;
            case 24:
                of.f.s((Context) obj2, "https://" + MessagesController.getInstance(i12).linkPrefix + "/nft/" + ((String) obj));
                break;
            default:
                zg.q qVar = (zg.q) obj2;
                org.telegram.ui.Components.b6 b6Var = (org.telegram.ui.Components.b6) obj;
                Editable text = qVar.n.getText();
                int spanStart = text.getSpanStart(b6Var);
                int spanEnd = text.getSpanEnd(b6Var);
                int i24 = spanEnd - spanStart;
                if (spanStart != -1 && spanEnd != -1) {
                    qVar.n.getText().delete(spanStart, spanEnd);
                    zg.o oVar = qVar.n;
                    oVar.setSelection(Math.min(i12 - i24, oVar.getText().length()));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bi0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ bi0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
