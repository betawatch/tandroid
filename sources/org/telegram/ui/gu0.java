package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.net.Uri;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gu0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.b = obj;
        this.c = i10;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.qc a02;
        int i10;
        switch (this.a) {
            case 0:
                hu0 hu0Var = (hu0) this.b;
                Uri uri = (Uri) this.d;
                int i11 = this.c;
                hu0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i12 = UserConfig.selectedAccount;
                    Point point = AndroidUtilities.displaySize;
                    org.telegram.ui.Components.y5 y5Var = new org.telegram.ui.Components.y5(file, true, 0L, 0, null, null, null, 0L, i12, false, point.x, point.y, null, 0, true);
                    Bitmap q10 = y5Var.q(0L, false);
                    y5Var.u();
                    AndroidUtilities.runOnUIThread(new gu0(hu0Var, i11, q10, 1));
                    break;
                } catch (Throwable th2) {
                    FileLog.e(th2);
                    AndroidUtilities.runOnUIThread(new gl0(hu0Var, 22));
                    return;
                }
            case 1:
                hu0 hu0Var2 = (hu0) this.b;
                Bitmap bitmap = (Bitmap) this.d;
                if (this.c == hu0Var2.a) {
                    hu0Var2.setImageBitmap(bitmap);
                    hu0Var2.c = true;
                    hu0Var2.b = false;
                    break;
                }
                break;
            case 2:
                yv0 yv0Var = (yv0) this.b;
                ze zeVar = (ze) this.d;
                int i13 = this.c;
                zeVar.run(Integer.valueOf(i13));
                boolean z4 = true;
                if (i13 != 1 && i13 != 13) {
                    z4 = false;
                }
                yv0Var.c(z4);
                break;
            case 3:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                AndroidUtilities.addToClipboard((String) this.d);
                if (this.c == profileActivity.T2) {
                    a02 = org.telegram.ui.Components.qc.a0(profileActivity);
                    i10 = R.string.BioCopied;
                } else {
                    a02 = org.telegram.ui.Components.qc.a0(profileActivity);
                    i10 = R.string.TextCopied;
                }
                b.m(i10, a02);
                break;
            case 4:
                n01 n01Var = (n01) this.b;
                f2.l1 l1Var = (f2.l1) this.d;
                n01Var.getClass();
                int b10 = l1Var.b();
                int i14 = this.c;
                if (b10 == i14 && n01Var.e.R2 == i14 && l1Var.f == 2) {
                    n01Var.v(l1Var, i14);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.b;
                org.telegram.ui.Components.z80 z80Var = (org.telegram.ui.Components.z80) this.d;
                org.telegram.ui.Components.qc.a0(p2Var).c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                AndroidUtilities.runOnUIThread(z80Var);
                break;
            case 6:
                org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.b;
                org.telegram.ui.Components.qc qcVar = (org.telegram.ui.Components.qc) this.d;
                aVar.run();
                qcVar.c(LocaleController.getString(R.string.AdHidden)).j();
                MessagesController.getInstance(this.c).disableAds(false);
                break;
            case 7:
                yd1 yd1Var = (yd1) this.b;
                ze zeVar2 = (ze) this.d;
                int i15 = this.c;
                zeVar2.run(Integer.valueOf(i15));
                boolean z10 = true;
                if (i15 != 1 && i15 != 13) {
                    z10 = false;
                }
                yd1Var.c(z10);
                break;
            case 8:
                xi1 xi1Var = (xi1) this.b;
                TLObject tLObject = (TLObject) this.d;
                HashMap hashMap = xi1Var.e;
                WallpapersListActivity wallpapersListActivity = xi1Var.B;
                ArrayList arrayList = xi1Var.d;
                if (this.c == xi1Var.v) {
                    xi1Var.s = 0;
                    int size = arrayList.size();
                    if (tLObject != null) {
                        TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                        xi1Var.r = messages_botresults.next_offset;
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
                        xi1Var.f = size == arrayList.size() || xi1Var.r == null;
                    }
                    if (size != arrayList.size()) {
                        int i18 = size % wallpapersListActivity.O;
                        float f10 = size;
                        int ceil = (int) Math.ceil(f10 / r2);
                        if (i18 != 0) {
                            xi1Var.m(((int) Math.ceil(f10 / wallpapersListActivity.O)) - 1);
                        }
                        wallpapersListActivity.G.s(ceil, ((int) Math.ceil(arrayList.size() / wallpapersListActivity.O)) - ceil);
                    }
                    wallpapersListActivity.K.c();
                    break;
                }
                break;
            case 9:
                ((FfmpegAudioWaveformLoader) this.b).lambda$new$0((String) this.d, this.c);
                break;
            case 10:
                ((FfmpegAudioWaveformLoader) this.b).lambda$receiveChunk$1((short[]) this.d, this.c);
                break;
            case 11:
                ph.c5 c5Var = (ph.c5) this.b;
                cg.l lVar = (cg.l) this.d;
                if (c5Var.L0.getCurrentBrush() instanceof cg.l) {
                    c5Var.Z0 = true;
                }
                c5Var.x(lVar);
                dg.o2 o2Var = c5Var.h1;
                int i19 = o2Var.d + 1;
                o2Var.a(i19);
                AndroidUtilities.updateImageViewImageAnimated(o2Var.a[i19], this.c);
                o2Var.e = true;
                break;
            case 12:
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.dw(this.c, ((MessagesStorage) this.b).getUsers(new ArrayList<>((HashSet) this.d))));
                break;
            case 13:
                ((ph.ha) this.b).b((short[]) this.d, this.c);
                break;
            case 14:
                int[] iArr = (int[]) this.b;
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = (NotificationCenter.NotificationCenterDelegate[]) this.d;
                int i20 = iArr[0];
                int i21 = this.c;
                if (i20 >= 0) {
                    ConnectionsManager.getInstance(i21).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                }
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(i21).addObserver(notificationCenterDelegateArr[0], NotificationCenter.didReceivedWebpagesInUpdates);
                    notificationCenterDelegateArr[0] = null;
                    break;
                }
                break;
            case 15:
                rh.n3 n3Var = (rh.n3) this.b;
                TLObject tLObject2 = (TLObject) this.d;
                if (tLObject2 instanceof TLRPC.TL_webViewResultUrl) {
                    TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject2;
                    n3Var.x = tL_webViewResultUrl.query_id;
                    n3Var.n.u(this.c, tL_webViewResultUrl.url, tL_webViewResultUrl.same_origin);
                    AndroidUtilities.runOnUIThread(n3Var.R);
                    break;
                }
                break;
            case 16:
                tf.z zVar = (tf.z) this.b;
                String str = (String) this.d;
                int i22 = zVar.p0;
                zVar.r = null;
                int i23 = zVar.a0;
                int i24 = this.c;
                if (i24 == i23) {
                    if (zVar.n >= 0) {
                        ConnectionsManager.getInstance(i22).cancelRequest(zVar.n, true);
                    }
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags = 1 | tL_channels_searchPosts.flags;
                    tL_channels_searchPosts.hashtag = str;
                    tL_channels_searchPosts.limit = 3;
                    tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    zVar.n = ConnectionsManager.getInstance(i22).sendRequest(tL_channels_searchPosts, new gg.l0(zVar, i24, str, 9));
                    break;
                }
                break;
            case 17:
                uf.t tVar = (uf.t) this.b;
                tVar.b.add(this.c, (TL_account.TL_businessChatLink) this.d);
                NotificationCenter.getInstance(tVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                break;
            case 18:
                vh.m5 m9 = ((vh.j5) this.b).getGrid().m((TL_iv.pageTableCell) this.d);
                if (m9 != null) {
                    vh.e1 e1Var = m9.a;
                    e1Var.r();
                    e1Var.setSelection(Math.max(0, Math.min(this.c, e1Var.length())));
                    break;
                }
                break;
            default:
                vh.r5 r5Var = (vh.r5) this.b;
                vh.a aVar2 = (vh.a) this.d;
                vh.w5 w5Var = r5Var.a;
                if (w5Var.y != null) {
                    vh.w5.f(aVar2.b, "");
                    ((vh.b3) w5Var.y).c(aVar2, this.c);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ gu0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.b = obj;
        this.d = obj2;
        this.c = i10;
    }
}
