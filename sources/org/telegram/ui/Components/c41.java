package org.telegram.ui.Components;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
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
import org.telegram.messenger.MessageObject;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.ci1;
import org.telegram.ui.ed1;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c41 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c41(int i10, Utilities.Callback callback, org.telegram.ui.Wallet.l0 l0Var) {
        this.a = 17;
        this.b = i10;
        this.c = callback;
        this.d = l0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0498  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        FrameLayout frameLayout;
        String str;
        xc a02;
        int i10;
        boolean z11;
        int i11 = this.a;
        boolean z12 = true;
        Object[] objArr = 0;
        int i12 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i11) {
            case 0:
                MessageObject messageObject = (MessageObject) obj2;
                org.telegram.ui.Cells.k1 k1Var = (org.telegram.ui.Cells.k1) obj;
                HashMap hashMap = e41.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(e41.o(messageObject)));
                }
                if (k1Var != null) {
                    k1Var.d0(3);
                }
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.voiceTranscriptionUpdate, messageObject);
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateTranscriptionLock, new Object[0]);
                break;
            case 1:
                TLRPC.Dialog dialog = (TLRPC.Dialog) obj;
                org.telegram.ui.ey eyVar = ((org.telegram.ui.ix) obj2).j0;
                ArrayList arrayList = eyVar.R1;
                if (arrayList != null && i12 >= 0 && i12 < arrayList.size()) {
                    eyVar.R1.add(i12, dialog);
                    eyVar.e0[0].q(true);
                    break;
                }
                break;
            case 2:
                org.telegram.ui.cy cyVar = (org.telegram.ui.cy) obj2;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) obj;
                org.telegram.ui.dy dyVar = cyVar.g;
                org.telegram.ui.ey eyVar2 = cyVar.h;
                eyVar2.S1 = true;
                eyVar2.getMessagesController().addDialogToFolder(dialog2.id, 0, this.b, 0L);
                eyVar2.S1 = false;
                ArrayList<TLRPC.Dialog> dialogs = eyVar2.getMessagesController().getDialogs(0);
                int indexOf = dialogs.indexOf(dialog2);
                if (indexOf < 0) {
                    dyVar.q(false);
                    break;
                } else {
                    ArrayList<TLRPC.Dialog> dialogs2 = eyVar2.getMessagesController().getDialogs(1);
                    if (!dialogs2.isEmpty() || indexOf != 1) {
                        eyVar2.y4(true, true);
                        dyVar.x.D();
                        dyVar.q(true);
                        eyVar2.m3();
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
                            eyVar2.y4(true, true);
                            dyVar.q(true);
                            eyVar2.m3();
                            break;
                        }
                    }
                }
                break;
            case 3:
                org.telegram.ui.u50 u50Var = (org.telegram.ui.u50) obj2;
                org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) obj;
                org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
                if (c2Var != null) {
                    c2Var.setOnCancelListener(new ai.e0(u50Var, i12, 6));
                    c2VarArr[0].show();
                    break;
                }
                break;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) obj;
                Pattern pattern = LaunchActivity.E1;
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
            case 5:
                org.telegram.ui.di diVar = (org.telegram.ui.di) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    diVar.a = (TLRPC.User) tLObject;
                    MessagesController.getInstance(i12).putUser(diVar.a, false);
                }
                b10 b10Var = diVar.c;
                y90 y90Var = diVar.b;
                diVar.setEnabled(diVar.a != null);
                TLRPC.User user = diVar.a;
                if (user != null) {
                    y90Var.setText(AndroidUtilities.premiumText(LocaleController.formatString(R.string.MessageAuthorSentBy, UserObject.getUserName(user)), new org.telegram.ui.oh0(diVar, user.id, objArr == true ? 1 : 0)));
                }
                y90Var.animate().alpha(1.0f).setDuration(220L).start();
                b10Var.animate().alpha(0.0f).setDuration(220L).setListener(new org.telegram.ui.ho(b10Var)).start();
                break;
            case 6:
                org.telegram.ui.an0.X((org.telegram.ui.an0) obj2, (SecureDocument) obj, i12);
                break;
            case 7:
                org.telegram.ui.io0 io0Var = (org.telegram.ui.io0) obj2;
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
                    io0Var.H0(z10, false);
                    io0Var.D0(false);
                    frameLayout = io0Var.P;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z10);
                        break;
                    }
                } else {
                    Parcelable.Creator<v8.i> creator = v8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    v8.i iVar = (v8.i) (byteArrayExtra != null ? w7.g0.a(byteArrayExtra, creator) : null);
                    if (iVar != null && (str = iVar.h) != null) {
                        try {
                            JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                            JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                            jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                            String string = jSONObject2.getString("token");
                            if (io0Var.K0 == null && io0Var.M0 == null) {
                                u2.c a2 = w7.q8.a(string);
                                io0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a2.c, (String) a2.b);
                                wc.a aVar = (wc.a) a2.d;
                                io0Var.x0 = aVar.a() + " *" + aVar.b();
                                io0Var.t0();
                            }
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            io0Var.J0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            io0Var.J0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                io0Var.x0 = "Android Pay";
                            } else {
                                io0Var.x0 = optString;
                            }
                            io0Var.t0();
                        } catch (JSONException e) {
                            FileLog.e(e);
                        }
                    }
                }
                z10 = true;
                io0Var.H0(z10, false);
                io0Var.D0(false);
                frameLayout = io0Var.P;
                if (frameLayout == null) {
                }
                break;
            case 8:
                org.telegram.ui.du0 du0Var = (org.telegram.ui.du0) obj2;
                Uri uri = (Uri) obj;
                du0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i14 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    e6 e6Var = new e6(file, true, 0L, 0, null, null, null, 0L, i14, false, point.x, point.y, null, 0, true);
                    Bitmap q6 = e6Var.q(0L, false);
                    e6Var.u();
                    AndroidUtilities.runOnUIThread(new c41(du0Var, i12, q6, 9));
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.oj0(du0Var, 24));
                    return;
                }
            case 9:
                org.telegram.ui.du0 du0Var2 = (org.telegram.ui.du0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (i12 == du0Var2.a) {
                    du0Var2.setImageBitmap(bitmap);
                    du0Var2.c = true;
                    du0Var2.b = false;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.uv0 uv0Var = (org.telegram.ui.uv0) obj2;
                ((org.telegram.ui.xe) obj).run(Integer.valueOf(i12));
                uv0Var.c(i12 == 1 || i12 == 13);
                break;
            case 11:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                AndroidUtilities.addToClipboard((String) obj);
                if (i12 == profileActivity.X2) {
                    a02 = xc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = xc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                org.telegram.messenger.sl.p(i10, a02);
                break;
            case 12:
                org.telegram.ui.f01 f01Var = (org.telegram.ui.f01) obj2;
                s4.b1 b1Var = (s4.b1) obj;
                f01Var.getClass();
                if (b1Var.b() == i12 && f01Var.e.V2 == i12 && b1Var.f == 2) {
                    f01Var.v(b1Var, i12);
                    break;
                }
                break;
            case 13:
                xc.a0((org.telegram.ui.ActionBar.o2) obj2).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                AndroidUtilities.runOnUIThread((ko0) obj);
                break;
            case 14:
                ((org.telegram.messenger.video.a) obj2).run();
                ((xc) obj).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(i12).disableAds(false);
                break;
            case 15:
                ed1 ed1Var = (ed1) obj2;
                ((org.telegram.ui.xe) obj).run(Integer.valueOf(i12));
                ed1Var.c(i12 == 1 || i12 == 13);
                break;
            case 16:
                org.telegram.ui.Wallet.z0 z0Var = ((org.telegram.ui.Wallet.y0) obj2).c;
                if (z0Var.c((tc.u) obj, i12)) {
                    z0Var.f("invalid streaming JSON");
                    break;
                }
                break;
            case 17:
                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i12);
                connectionsManager.sendRequestTyped(new TL_toncenter.getOnrampProviders(), new org.telegram.messenger.a(), new org.telegram.ui.Wallet.j((Utilities.Callback) obj2, (org.telegram.ui.Wallet.l0) obj, connectionsManager));
                break;
            case 18:
                Context context = (Context) obj2;
                String str2 = ((TL_wallet.walletTransaction[]) obj)[0].tx_hash;
                if (!TextUtils.isEmpty(str2)) {
                    String str3 = MessagesController.getInstance(i12).tonBlockchainExplorerUrl;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "https://tonviewer.com/";
                    } else if (!str3.endsWith("/")) {
                        str3 = str3.concat("/");
                    }
                    StringBuilder i15 = si.o0.i(str3, "transaction/");
                    i15.append(Uri.encode(str2));
                    pf.d.t(context, i15.toString());
                    break;
                }
                break;
            case 19:
                org.telegram.ui.Wallet.p5 p5Var = (org.telegram.ui.Wallet.p5) obj2;
                Bitmap[] bitmapArr = (Bitmap[]) obj;
                if (p5Var.f0 == i12) {
                    p5Var.f(bitmapArr);
                    p5Var.a.run();
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Wallet.ia iaVar = (org.telegram.ui.Wallet.ia) obj;
                int i16 = i12 + 1;
                ArrayList arrayList2 = ((org.telegram.ui.Wallet.w7) obj2).v;
                if (i16 >= arrayList2.size()) {
                    AndroidUtilities.hideKeyboard(iaVar);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.ia) arrayList2.get(i16)).a.requestFocus();
                    break;
                }
            case 21:
                org.telegram.ui.Wallet.ia iaVar2 = (org.telegram.ui.Wallet.ia) obj;
                int i17 = i12 + 1;
                ArrayList arrayList3 = ((org.telegram.ui.Wallet.aa) obj2).d;
                if (i17 >= arrayList3.size()) {
                    AndroidUtilities.hideKeyboard(iaVar2);
                    break;
                } else {
                    ((org.telegram.ui.Wallet.ia) arrayList3.get(i17)).a.requestFocus();
                    break;
                }
            case 22:
                ci1 ci1Var = (ci1) obj2;
                TLObject tLObject2 = (TLObject) obj;
                HashMap hashMap2 = ci1Var.e;
                WallpapersListActivity wallpapersListActivity = ci1Var.E;
                ArrayList arrayList4 = ci1Var.d;
                if (i12 == ci1Var.v) {
                    ci1Var.s = 0;
                    int size = arrayList4.size();
                    if (tLObject2 != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject2;
                        ci1Var.r = messages_botresults.next_offset;
                        int size2 = messages_botresults.results.size();
                        int i18 = 0;
                        while (i18 < size2) {
                            TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i18);
                            if ("photo".equals(botInlineResult.type) && !hashMap2.containsKey(botInlineResult.id)) {
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
                                        hashMap2.put(searchImage.id, searchImage);
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
                                        hashMap2.put(searchImage.id, searchImage);
                                    }
                                }
                            } else {
                                z11 = z12;
                            }
                            i18++;
                            z12 = z11;
                        }
                        ci1Var.f = (size == arrayList4.size() || ci1Var.r == null) ? z12 : false;
                    }
                    if (size != arrayList4.size()) {
                        int i20 = size % wallpapersListActivity.R;
                        float f7 = size;
                        int ceil = (int) Math.ceil(f7 / r0);
                        if (i20 != 0) {
                            ci1Var.m(((int) Math.ceil(f7 / wallpapersListActivity.R)) - 1);
                        }
                        wallpapersListActivity.J.s(ceil, ((int) Math.ceil(arrayList4.size() / wallpapersListActivity.R)) - ceil);
                    }
                    wallpapersListActivity.N.c();
                    break;
                }
                break;
            case 23:
                qg.s0 s0Var = (qg.s0) obj2;
                s0Var.e((qg.h1) obj, i12, s0Var.h);
                s0Var.h = null;
                break;
            case 24:
                ((r4.c) ((p4.s0) obj2).c).x(i12, obj);
                break;
            case 25:
                rg.m0 m0Var = (rg.m0) obj2;
                qg.l lVar = (qg.l) obj;
                if (m0Var.W0.getCurrentBrush() instanceof qg.l) {
                    m0Var.k1 = true;
                }
                m0Var.n(lVar);
                rg.s1 s1Var = m0Var.t1;
                int i21 = s1Var.d + 1;
                s1Var.a(i21);
                AndroidUtilities.updateImageViewImageAnimated(s1Var.a[i21], i12);
                s1Var.e = true;
                break;
            case 26:
                ns0 ns0Var = (ns0) obj2;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                ai.v9 v9Var = ns0Var.e;
                if (i12 != -1) {
                    int i22 = tL_starGiftCollection.collection_id;
                    int i23 = v9Var.a;
                    int f10 = v9Var.f(i22);
                    if (f10 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) v9Var.e.remove(f10);
                        v9Var.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = MessagesController.getInstance(i23).getInputPeer(v9Var.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i23).sendRequest(deletestargiftcollection, null);
                    }
                    ns0Var.f(true);
                    k91 k91Var = ns0Var.n;
                    if (i12 < v9Var.d().size()) {
                        i12++;
                    }
                    k91Var.d(-1, i12);
                    ns0Var.n();
                    break;
                }
                break;
            default:
                zh.b0.p((org.telegram.ui.ActionBar.o2) obj2, i12 + 1, (zh.x) obj);
                break;
        }
    }

    public /* synthetic */ c41(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ c41(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
