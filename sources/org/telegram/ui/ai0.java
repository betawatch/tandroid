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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class ai0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ai0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0572  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        FrameLayout frameLayout;
        String str;
        org.telegram.ui.Components.yc a02;
        int i10;
        int i11 = this.a;
        int i12 = 22;
        Object obj = this.d;
        int i13 = this.b;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                mi miVar = (mi) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    miVar.a = (TLRPC.User) tLObject;
                    MessagesController.getInstance(i13).putUser(miVar.a, false);
                }
                org.telegram.ui.Components.t00 t00Var = miVar.c;
                org.telegram.ui.Components.d90 d90Var = miVar.b;
                miVar.setEnabled(miVar.a != null);
                TLRPC.User user = miVar.a;
                if (user != null) {
                    d90Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new bi.g(miVar, user.id, 26)));
                }
                d90Var.animate().alpha(1.0f).setDuration(220L).start();
                t00Var.animate().alpha(0.0f).setDuration(220L).setListener(new to(t00Var)).start();
                break;
            case 1:
                pn0.X((pn0) obj2, (SecureDocument) obj, i13);
                break;
            case 2:
                xo0 xo0Var = (xo0) obj2;
                Intent intent = (Intent) obj;
                if (i13 != -1) {
                    z10 = true;
                    if (i13 == 1) {
                        int i14 = v8.a.c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.b : "");
                        FileLog.e(sb2.toString());
                    }
                    xo0Var.H0(z10, false);
                    xo0Var.D0(false);
                    frameLayout = xo0Var.P;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<v8.i> creator = v8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    v8.i iVar = (v8.i) (byteArrayExtra != null ? w7.f0.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (xo0Var.K0 == null && xo0Var.M0 == null) {
                                m2.t a2 = w7.y7.a(string);
                                xo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a2.c, (String) a2.b);
                                uc.a aVar = (uc.a) a2.d;
                                xo0Var.x0 = aVar.a() + " *" + aVar.b();
                                xo0Var.t0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            xo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            xo0Var.J0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                xo0Var.x0 = "Android Pay";
                            } else {
                                xo0Var.x0 = optString;
                            }
                            xo0Var.t0();
                        } catch (JSONException e7) {
                            FileLog.e(e7);
                        }
                    }
                }
                z10 = true;
                xo0Var.H0(z10, false);
                xo0Var.D0(false);
                frameLayout = xo0Var.P;
                if (frameLayout == null) {
                }
                break;
            case 3:
                tu0 tu0Var = (tu0) obj2;
                Uri uri = (Uri) obj;
                tu0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i15 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.d6 d6Var = new org.telegram.ui.Components.d6(file, true, 0L, 0, null, null, null, 0L, i15, false, point.x, point.y, null, 0, true);
                    Bitmap q6 = d6Var.q(0L, false);
                    d6Var.u();
                    AndroidUtilities.runOnUIThread(new ai0(tu0Var, i13, q6, 4));
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new rl0(tu0Var, i12));
                    return;
                }
            case 4:
                tu0 tu0Var2 = (tu0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i13 == tu0Var2.a) {
                    tu0Var2.setImageBitmap(bitmap);
                    tu0Var2.c = true;
                    tu0Var2.b = false;
                    break;
                }
                break;
            case 5:
                lw0 lw0Var = (lw0) obj2;
                ((bf) obj).run(Integer.valueOf(i13));
                lw0Var.c(i13 == 1 || i13 == 13);
                break;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                AndroidUtilities.addToClipboard((String) obj);
                if (i13 == profileActivity.W2) {
                    a02 = org.telegram.ui.Components.yc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.yc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                org.telegram.messenger.vl.o(i10, a02);
                break;
            case 7:
                a11 a11Var = (a11) obj2;
                s4.c1 c1Var = (s4.c1) obj;
                a11Var.getClass();
                if (c1Var.b() == i13 && a11Var.e.U2 == i13 && c1Var.f == 2) {
                    a11Var.v(c1Var, i13);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.yc.a0((org.telegram.ui.ActionBar.n2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i13).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.jn0) obj);
                break;
            case 9:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.yc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i13).disableAds(false);
                break;
            case 10:
                le1 le1Var = (le1) obj2;
                ((bf) obj).run(Integer.valueOf(i13));
                le1Var.c(i13 == 1 || i13 == 13);
                break;
            case 11:
                jj1 jj1Var = (jj1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                HashMap hashMap = jj1Var.e;
                WallpapersListActivity wallpapersListActivity = jj1Var.E;
                ArrayList arrayList = jj1Var.d;
                if (i13 == jj1Var.v) {
                    jj1Var.s = 0;
                    int size = arrayList.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        jj1Var.r = messages_botresults.next_offset;
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
                        jj1Var.f = size == arrayList.size() || jj1Var.r == null;
                    }
                    if (size != arrayList.size()) {
                        int i18 = size % wallpapersListActivity.R;
                        float f7 = size;
                        int ceil = (int) Math.ceil(f7 / r0);
                        if (i18 != 0) {
                            jj1Var.m(((int) Math.ceil(f7 / wallpapersListActivity.R)) - 1);
                        }
                        wallpapersListActivity.J.s(ceil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.R)) - ceil);
                    }
                    wallpapersListActivity.N.c();
                    break;
                }
                break;
            case 12:
                qg.q0 q0Var = (qg.q0) obj2;
                q0Var.e((qg.f1) obj, i13, q0Var.h);
                q0Var.h = null;
                break;
            case 13:
                ((r4.c) ((p4.s0) obj2).c).x(i13, obj);
                break;
            case 14:
                rg.o0 o0Var = (rg.o0) obj2;
                qg.l lVar = (qg.l) obj;
                if (o0Var.W0.getCurrentBrush() instanceof qg.l) {
                    o0Var.k1 = true;
                }
                o0Var.o(lVar);
                rg.t1 t1Var = o0Var.t1;
                int i19 = t1Var.d + 1;
                t1Var.a(i19);
                AndroidUtilities.updateImageViewImageAnimated(t1Var.a[i19], i13);
                t1Var.e = true;
                break;
            case 15:
                org.telegram.ui.Components.nr0 nr0Var = (org.telegram.ui.Components.nr0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                zh.i5 i5Var = nr0Var.e;
                if (i13 != -1) {
                    int i20 = tL_starGiftCollection.collection_id;
                    int i21 = i5Var.a;
                    int f10 = i5Var.f(i20);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) i5Var.e.remove(f10);
                        i5Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i21).getInputPeer(i5Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i21).sendRequest(deletestargiftcollection, null);
                    }
                    nr0Var.f(true);
                    org.telegram.ui.Components.h81 h81Var = nr0Var.n;
                    if (i13 < i5Var.d().size()) {
                        i13++;
                    }
                    h81Var.d(-1, i13);
                    nr0Var.n();
                    break;
                }
                break;
            case 16:
                zh.x2 x2Var = (zh.x2) obj2;
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                int[] iArr = x2Var.V;
                zh.t2 t2Var = x2Var.f;
                zh.q2 q2Var = x2Var.h;
                if (starGift != null) {
                    zh.v2 v2Var = new zh.v2(x2Var.getContext());
                    v2Var.a(starGift, false);
                    v2Var.setRotation(180.0f);
                    q2Var.f(i13, v2Var);
                    v2Var.setScaleX(0.5f);
                    v2Var.setScaleY(0.5f);
                    v2Var.setAlpha(0.0f);
                    ViewPropertyAnimator duration = v2Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(prVar);
                    interpolator.setUpdateListener(new ki.a(x2Var, i12));
                    interpolator.start();
                    q2Var.a[i13].setVisibility(8);
                    t2Var.setVisibility(0);
                    t2Var.setAlpha(0.0f);
                    t2Var.animate().alpha(0.5f).setDuration(820L).setInterpolator(prVar).start();
                    break;
                } else {
                    FrameLayout frameLayout2 = new FrameLayout(x2Var.getContext());
                    org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(x2Var.getContext());
                    aj0Var.f(R.raw.gift_broken, 32, 32, null);
                    frameLayout2.addView(aj0Var, w7.x5.e(32, 32, 17));
                    aj0Var.setScaleX(0.5f);
                    aj0Var.setScaleY(0.5f);
                    aj0Var.setAlpha(0.0f);
                    aj0Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    x2Var.l0 = aj0Var;
                    frameLayout2.setBackground(new zh.k3(AndroidUtilities.dp(12.0f), org.telegram.ui.ActionBar.j6.l1(0.075f, -1)));
                    q2Var.a[i13].setVisibility(8);
                    frameLayout2.setRotation(180.0f);
                    q2Var.f(i13, frameLayout2);
                    x2Var.F.a(iArr[2], iArr[3]);
                    zh.w2 w2Var = x2Var.b;
                    int[] iArr2 = x2Var.U;
                    w2Var.a(iArr2[2], iArr2[3]);
                    t2Var.a(iArr[3], iArr[2]);
                    break;
                }
            case 17:
                ((Utilities.Callback3) obj).run(LocaleController.formatString(R.string.Gift2RarityHint, fi.m.G0(i13)), (zh.n3) obj2, Boolean.FALSE);
                break;
            case 18:
                zh.s5 s5Var = (zh.s5) obj2;
                TLObject tLObject3 = (TLObject) obj;
                boolean[] zArr = s5Var.r;
                ArrayList[] arrayListArr = s5Var.q;
                int i22 = s5Var.a;
                s5Var.t[i13] = false;
                if (tLObject3 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject3;
                    MessagesController.getInstance(i22).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i22).putChats(starsStatus.chats, false);
                    arrayListArr[i13].addAll(starsStatus.history);
                    zArr[i13] = !arrayListArr[i13].isEmpty() || zArr[i13];
                    boolean[] zArr2 = s5Var.u;
                    boolean z11 = (starsStatus.flags & 1) == 0;
                    zArr2[i13] = z11;
                    s5Var.s[i13] = z11 ? null : starsStatus.next_offset;
                    s5Var.k0(starsStatus.balance);
                    NotificationCenter.getInstance(i22).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starTransactionsLoaded, new Object[0]);
                    break;
                }
                break;
            default:
                of.f.s((Context) obj2, "https://" + MessagesController.getInstance(i13).linkPrefix + "/nft/" + ((String) obj));
                break;
        }
    }

    public /* synthetic */ ai0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
