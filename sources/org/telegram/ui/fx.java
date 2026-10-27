package org.telegram.ui;

import android.content.Context;
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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fx implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fx(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.l0 l0Var) {
        this.a = 16;
        this.c = i10;
        this.d = callback;
        this.b = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x049f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        FrameLayout frameLayout;
        String str;
        org.telegram.ui.Components.wc b02;
        int i10;
        boolean z11;
        int i11 = this.a;
        boolean z12 = true;
        Object[] objArr = 0;
        int i12 = this.c;
        Object obj = this.b;
        Object obj2 = this.d;
        switch (i11) {
            case 0:
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                ey eyVar = ((gx) obj2).j0;
                ArrayList arrayList = eyVar.R1;
                if (arrayList != null && i12 >= 0 && i12 < arrayList.size()) {
                    eyVar.R1.add(i12, dialog);
                    eyVar.e0[0].q(true);
                    break;
                }
                break;
            case 1:
                cy cyVar = (cy) obj2;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) obj;
                dy dyVar = cyVar.g;
                ey eyVar2 = cyVar.h;
                eyVar2.S1 = true;
                eyVar2.getMessagesController().addDialogToFolder(dialog2.id, 0, this.c, 0L);
                eyVar2.S1 = false;
                ArrayList<TLRPC.Dialog> dialogs = eyVar2.getMessagesController().getDialogs(0);
                int indexOf = dialogs.indexOf(dialog2);
                if (indexOf < 0) {
                    dyVar.q(false);
                    break;
                } else {
                    ArrayList<TLRPC.Dialog> dialogs2 = eyVar2.getMessagesController().getDialogs(1);
                    if (!dialogs2.isEmpty() || indexOf != 1) {
                        eyVar2.I4(true, true);
                        dyVar.x.D();
                        dyVar.q(true);
                        eyVar2.w3();
                    }
                    if (dialogs2.isEmpty()) {
                        dialogs.remove(0);
                        if (indexOf != 1) {
                            if (!eyVar2.R1.isEmpty()) {
                                eyVar2.R1.remove(0);
                            }
                            dyVar.x.D();
                            dyVar.q(true);
                            break;
                        } else {
                            eyVar2.I4(true, true);
                            dyVar.q(true);
                            eyVar2.w3();
                            break;
                        }
                    }
                }
                break;
            case 2:
                x50 x50Var = (x50) obj2;
                org.telegram.ui.ActionBar.e2[] e2VarArr = (org.telegram.ui.ActionBar.e2[]) obj;
                org.telegram.ui.ActionBar.e2 e2Var = e2VarArr[0];
                if (e2Var != null) {
                    e2Var.setOnCancelListener(new bi.f0(x50Var, i12, 6));
                    e2VarArr[0].show();
                    break;
                }
                break;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) obj;
                Pattern pattern = LaunchActivity.D1;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
                if ((tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) && SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate)) {
                    if (tL_help_appUpdate.can_not_skip) {
                        launchActivity.N0(i12, tL_help_appUpdate, false);
                    } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                        ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(launchActivity, tL_help_appUpdate, i12);
                    }
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
                    break;
                }
                break;
            case 4:
                hi hiVar = (hi) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    hiVar.a = (TLRPC.User) tLObject;
                    MessagesController.getInstance(i12).putUser(hiVar.a, false);
                }
                org.telegram.ui.Components.c10 c10Var = hiVar.c;
                org.telegram.ui.Components.aa0 aa0Var = hiVar.b;
                hiVar.setEnabled(hiVar.a != null);
                TLRPC.User user = hiVar.a;
                if (user != null) {
                    aa0Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new nh0(hiVar, user.id, objArr == true ? 1 : 0)));
                }
                aa0Var.animate().alpha(1.0f).setDuration(220L).start();
                c10Var.animate().alpha(0.0f).setDuration(220L).setListener(new lo(c10Var)).start();
                break;
            case 5:
                kn0.Y((kn0) obj2, (SecureDocument) obj, i12);
                break;
            case 6:
                ro0 ro0Var = (ro0) obj2;
                Intent intent = (Intent) obj;
                if (i12 != -1) {
                    z10 = true;
                    if (i12 == 1) {
                        int i13 = w8.a.c;
                        Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                        StringBuilder sb2 = new StringBuilder("android pay error ");
                        sb2.append(status != null ? status.b : "");
                        FileLog.e(sb2.toString());
                    }
                    ro0Var.I0(z10, false);
                    ro0Var.E0(false);
                    frameLayout = ro0Var.P;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<w8.i> creator = w8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    w8.i iVar = (w8.i) (byteArrayExtra != null ? a8.hf.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (ro0Var.K0 == null && ro0Var.M0 == null) {
                                s4.d a2 = w7.l5.a(string);
                                ro0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a2.c, (String) a2.b);
                                xc.a aVar = (xc.a) a2.d;
                                ro0Var.x0 = aVar.a() + " *" + aVar.b();
                                ro0Var.u0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            ro0Var.J0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            ro0Var.J0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                ro0Var.x0 = "Android Pay";
                            } else {
                                ro0Var.x0 = optString;
                            }
                            ro0Var.u0();
                        } catch (JSONException e) {
                            FileLog.e(e);
                        }
                    }
                }
                z10 = true;
                ro0Var.I0(z10, false);
                ro0Var.E0(false);
                frameLayout = ro0Var.P;
                if (frameLayout == null) {
                }
                break;
            case 7:
                ju0 ju0Var = (ju0) obj2;
                Uri uri = (Uri) obj;
                ju0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i14 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(file, true, 0L, 0, null, null, null, 0L, i14, false, point.x, point.y, null, 0, true);
                    Bitmap q5 = g6Var.q(0L, false);
                    g6Var.u();
                    AndroidUtilities.runOnUIThread(new fx(ju0Var, i12, q5, 8));
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new nj0(ju0Var, 25));
                    return;
                }
            case 8:
                ju0 ju0Var2 = (ju0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i12 == ju0Var2.a) {
                    ju0Var2.setImageBitmap(bitmap);
                    ju0Var2.c = true;
                    ju0Var2.b = false;
                    break;
                }
                break;
            case 9:
                zv0 zv0Var = (zv0) obj2;
                ((ye) obj).run(Integer.valueOf(i12));
                zv0Var.c(i12 == 1 || i12 == 13);
                break;
            case 10:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                int i15 = ProfileActivity.R6;
                AndroidUtilities.addToClipboard((String) obj);
                if (i12 == profileActivity.W2) {
                    b02 = org.telegram.ui.Components.wc.b0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    b02 = org.telegram.ui.Components.wc.b0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                org.telegram.messenger.wh.m(i10, b02);
                break;
            case 11:
                l01 l01Var = (l01) obj2;
                s4.e1 e1Var = (s4.e1) obj;
                l01Var.getClass();
                if (e1Var.b() == i12 && l01Var.e.U2 == i12 && e1Var.f == 2) {
                    l01Var.v(e1Var, i12);
                    break;
                }
                break;
            case 12:
                org.telegram.ui.Components.wc.b0((org.telegram.ui.ActionBar.r2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                AndroidUtilities.runOnUIThread((org.telegram.ui.Components.u90) obj);
                break;
            case 13:
                ((org.telegram.messenger.video.a) obj2).run();
                ((org.telegram.ui.Components.wc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                break;
            case 14:
                kd1 kd1Var = (kd1) obj2;
                ((ye) obj).run(Integer.valueOf(i12));
                kd1Var.c(i12 == 1 || i12 == 13);
                break;
            case 15:
                org.telegram.ui.Wallet.z0 z0Var = ((org.telegram.ui.Wallet.y0) obj2).c;
                if (z0Var.c((uc.u) obj, i12)) {
                    z0Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 16:
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new org.telegram.messenger.a(), new org.telegram.ui.Wallet.j((Utilities.Callback) obj2, (org.telegram.ui.Wallet.l0) obj, connectionsManager));
                break;
            case 17:
                Context context = (Context) obj2;
                String str2 = ((TL_wallet.walletTransaction[]) obj)[0].tx_hash;
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = MessagesController.getInstance(i12).tonBlockchainExplorerUrl;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "https://tonviewer.com/";
                    } else if (!str3.endsWith("/")) {
                        str3 = str3.concat("/");
                    }
                    StringBuilder l4 = org.telegram.ui.Components.b10.l(str3, "transaction/");
                    l4.append(Uri.encode(str2));
                    qf.d.t(context, l4.toString());
                    break;
                }
                break;
            case 18:
                org.telegram.ui.Wallet.n5 n5Var = (org.telegram.ui.Wallet.n5) obj2;
                Bitmap[] bitmapArr = (Bitmap[]) obj;
                if (n5Var.f0 == i12) {
                    n5Var.f(bitmapArr);
                    n5Var.a.run();
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Wallet.ha haVar = (org.telegram.ui.Wallet.ha) obj;
                int i16 = i12 + 1;
                ArrayList arrayList2 = ((org.telegram.ui.Wallet.w7) obj2).v;
                if (i16 >= arrayList2.size()) {
                    AndroidUtilities.hideKeyboard(haVar);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.ha) arrayList2.get(i16)).a.requestFocus();
                    break;
                }
            case 20:
                org.telegram.ui.Wallet.ha haVar2 = (org.telegram.ui.Wallet.ha) obj;
                int i17 = i12 + 1;
                ArrayList arrayList3 = ((org.telegram.ui.Wallet.z9) obj2).d;
                if (i17 >= arrayList3.size()) {
                    AndroidUtilities.hideKeyboard(haVar2);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.ha) arrayList3.get(i17)).a.requestFocus();
                    break;
                }
            case 21:
                gi1 gi1Var = (gi1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                HashMap hashMap = gi1Var.e;
                WallpapersListActivity wallpapersListActivity = gi1Var.E;
                ArrayList arrayList4 = gi1Var.d;
                if (i12 == gi1Var.v) {
                    gi1Var.s = 0;
                    int size = arrayList4.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        gi1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i18);
                            if ("photo".equals(botInlineResult.type) && !hashMap.containsKey(botInlineResult.id)) {
                                MediaController.SearchImage searchImage = new MediaController.SearchImage();
                                TLRPC.Photo photo = botInlineResult.photo;
                                if (photo != null) {
                                    TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, AndroidUtilities.getPhotoSize());
                                    z11 = z12;
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
                                        arrayList4.add(searchImage);
                                        hashMap.put(searchImage.id, searchImage);
                                    }
                                } else {
                                    z11 = z12;
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
                                        arrayList4.add(searchImage);
                                        hashMap.put(searchImage.id, searchImage);
                                    }
                                }
                            } else {
                                z11 = z12;
                            }
                            i18++;
                            z12 = z11;
                        }
                        gi1Var.f = (size == arrayList4.size() || gi1Var.r == null) ? z12 : false;
                    }
                    if (size != arrayList4.size()) {
                        int i20 = size % wallpapersListActivity.N;
                        float f7 = size;
                        int ceil = (int) Math.ceil(f7 / r0);
                        if (i20 != 0) {
                            gi1Var.m(((int) Math.ceil(f7 / wallpapersListActivity.N)) - 1);
                        }
                        wallpapersListActivity.H.s(ceil, ((int) Math.ceil(arrayList4.size() / wallpapersListActivity.N)) - ceil);
                    }
                    wallpapersListActivity.K.c();
                    break;
                }
                break;
            case 22:
                ((View) obj).postOnAnimation(new yg1((ph.a) obj2, i12, 7));
                break;
            case 23:
                ((r4.c) ((p4.s0) obj2).c).Y(i12, obj);
                break;
            case 24:
                rg.q0 q0Var = (rg.q0) obj2;
                q0Var.e((rg.f1) obj, i12, q0Var.h);
                q0Var.h = null;
                break;
            case 25:
                sg.m0 m0Var = (sg.m0) obj2;
                rg.l lVar = (rg.l) obj;
                if (m0Var.L0.getCurrentBrush() instanceof rg.l) {
                    m0Var.Z0 = true;
                }
                m0Var.i(lVar);
                sg.s1 s1Var = m0Var.i1;
                int i21 = s1Var.d + 1;
                s1Var.a(i21);
                AndroidUtilities.updateImageViewImageAnimated(s1Var.a[i21], i12);
                s1Var.e = true;
                break;
            default:
                org.telegram.ui.Components.ws0 ws0Var = (org.telegram.ui.Components.ws0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                bi.q9 q9Var = ws0Var.e;
                if (i12 != -1) {
                    int i22 = tL_starGiftCollection.collection_id;
                    int i23 = q9Var.a;
                    int f10 = q9Var.f(i22);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) q9Var.e.remove(f10);
                        q9Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i23).getInputPeer(q9Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i23).sendRequest(deletestargiftcollection, null);
                    }
                    ws0Var.f(true);
                    org.telegram.ui.Components.u91 u91Var = ws0Var.n;
                    if (i12 < q9Var.d().size()) {
                        i12++;
                    }
                    u91Var.d(-1, i12);
                    ws0Var.o();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ fx(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.d = obj;
        this.c = i10;
        this.b = obj2;
    }

    public /* synthetic */ fx(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.d = obj;
        this.b = obj2;
        this.c = i10;
    }
}
