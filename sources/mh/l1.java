package mh;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import g7.e6;
import java.io.File;
import kh.b8;
import kh.r6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l1 extends sa {
    public final int T;
    public final String U;
    public z41 V;
    public final i1 W;
    public boolean X;
    public boolean Y;
    public final bg.y0 Z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x037e  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.graphics.drawable.Drawable, org.telegram.ui.ActionBar.b5] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l1(Context context, int i9, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, b6 b6Var, org.telegram.ui.web.t tVar, bg.y0 y0Var) {
        super(context, null, false, false, false, 1, b6Var);
        ?? r92;
        ?? r12;
        int i10;
        k1 O;
        String str;
        String absolutePath;
        char c10;
        TLRPC.TL_photo tL_photo;
        TLRPC.TL_photo tL_photo2;
        TLRPC.TL_document tL_document;
        this.X = false;
        this.Y = false;
        this.T = i9;
        this.U = UserObject.getUserName(MessagesController.getInstance(i9).getUser(Long.valueOf(j10)));
        this.Z = y0Var;
        J();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-10.0f);
        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
        if (file != null && file.exists() && webPage == null) {
            str = botInlineResult.type;
            absolutePath = file.getAbsolutePath();
            str.getClass();
            switch (str) {
                case "sticker":
                case "gif":
                case "file":
                case "audio":
                case "video":
                case "voice":
                    TLRPC.TL_document tL_document2 = new TLRPC.TL_document();
                    tL_document2.id = 0L;
                    tL_document2.size = 0L;
                    tL_document2.dc_id = 0;
                    tL_document2.mime_type = botInlineResult.content.mime_type;
                    tL_document2.file_reference = new byte[0];
                    tL_document2.date = ConnectionsManager.getInstance(i9).getCurrentTime();
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_document2.attributes.add(tL_documentAttributeFilename);
                    switch (str.hashCode()) {
                        case -1890252483:
                            if (str.equals("sticker")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 102340:
                            if (str.equals("gif")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 3143036:
                            if (str.equals("file")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 93166550:
                            if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 112202875:
                            if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 112386354:
                            if (str.equals("voice")) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                            tL_documentAttributeSticker.alt = "";
                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_document2.attributes.add(tL_documentAttributeSticker);
                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                            int[] inlineResultWidthAndHeight = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                            tL_documentAttributeImageSize.w = inlineResultWidthAndHeight[0];
                            tL_documentAttributeImageSize.h = inlineResultWidthAndHeight[1];
                            tL_document2.attributes.add(tL_documentAttributeImageSize);
                            tL_documentAttributeFilename.file_name = "sticker.webp";
                            try {
                                if (botInlineResult.thumb != null) {
                                    tL_photo = null;
                                    try {
                                        Bitmap loadBitmap = ImageLoader.loadBitmap(new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.thumb.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                        if (loadBitmap != null) {
                                            TLRPC.PhotoSize scaleAndSaveImage = ImageLoader.scaleAndSaveImage(loadBitmap, 90.0f, 90.0f, 55, false);
                                            if (scaleAndSaveImage != null) {
                                                tL_document2.thumbs.add(scaleAndSaveImage);
                                                tL_document2.flags |= 1;
                                            }
                                            loadBitmap.recycle();
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        FileLog.e(th);
                                        if (tL_documentAttributeFilename.file_name == null) {
                                        }
                                        if (tL_document2.mime_type == null) {
                                        }
                                        if (!tL_document2.thumbs.isEmpty()) {
                                        }
                                        tL_photo2 = tL_photo;
                                        tL_document = tL_document2;
                                        i10 = i9;
                                        r92 = tL_photo;
                                        r12 = 1;
                                        O = O(i10, j10, botInlineResult, tL_photo2, tL_document, null);
                                        k1 k1Var = O;
                                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context, b6Var, false);
                                        w0Var.setDelegate(new f1());
                                        w0Var.setCustomText(LocaleController.getString(R.string.BotShareMessagePreview));
                                        g1 g1Var = new g1(context, i10);
                                        g1Var.setDelegate(new h1());
                                        g1Var.X3(k1Var, null, false, false, false, false);
                                        LinearLayout f10 = ll.f(context, r12);
                                        f10.addView(w0Var, e6.n(-1, -2));
                                        f10.addView(g1Var, e6.n(-1, -2));
                                        i1 i1Var = new i1(context, r92);
                                        this.W = i1Var;
                                        i1Var.V(r6.e(r92, i10, j10, f6.I.q()));
                                        i1Var.addView(f10, e6.d(-1, -1.0f, 119, 4.0f, 8.0f, 4.0f, 8.0f));
                                        FrameLayout frameLayout = new FrameLayout(context);
                                        kh.d i11 = ll.i(24, context, b6Var, r12);
                                        i11.g(LocaleController.getString(R.string.BotShareMessageShare), false, r12);
                                        i11.setOnClickListener(new gh.q0(this, tL_messages_preparedInlineMessage, y0Var, i10, j10, tVar));
                                        frameLayout.addView(i11, e6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
                                        ViewGroup viewGroup = this.containerView;
                                        int i12 = this.backgroundPaddingLeft;
                                        viewGroup.addView(frameLayout, e6.f(-2.0f, 87, i12, 0, i12, 0));
                                        wk0 wk0Var = this.d;
                                        int i13 = this.backgroundPaddingLeft;
                                        wk0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(68.0f) + r12);
                                        this.d.p1();
                                        int i14 = f6.a7;
                                        setBackgroundColor(getThemedColor(i14));
                                        fixNavigationBar(getThemedColor(i14));
                                        this.V.N(false);
                                    }
                                }
                                tL_photo = null;
                            } catch (Throwable th2) {
                                th = th2;
                                tL_photo = null;
                            }
                            break;
                        case 1:
                            tL_documentAttributeFilename.file_name = "animation.gif";
                            if (absolutePath.endsWith("mp4")) {
                                tL_document2.mime_type = "video/mp4";
                                tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                            } else {
                                tL_document2.mime_type = "image/gif";
                            }
                            tL_photo = null;
                            break;
                        case 2:
                            int lastIndexOf = botInlineResult.content.mime_type.lastIndexOf(47);
                            if (lastIndexOf != -1) {
                                tL_documentAttributeFilename.file_name = "file." + botInlineResult.content.mime_type.substring(lastIndexOf + 1);
                            } else {
                                tL_documentAttributeFilename.file_name = "file";
                            }
                            tL_photo = null;
                            break;
                        case 3:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio.duration = MessageObject.getInlineResultDuration(botInlineResult);
                            tL_documentAttributeAudio.title = botInlineResult.title;
                            int i15 = tL_documentAttributeAudio.flags;
                            tL_documentAttributeAudio.flags = i15 | 1;
                            String str2 = botInlineResult.description;
                            if (str2 != null) {
                                tL_documentAttributeAudio.performer = str2;
                                tL_documentAttributeAudio.flags = i15 | 3;
                            }
                            tL_documentAttributeFilename.file_name = "audio.mp3";
                            tL_document2.attributes.add(tL_documentAttributeAudio);
                            tL_photo = null;
                            break;
                        case 4:
                            tL_documentAttributeFilename.file_name = "video.mp4";
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                            int[] inlineResultWidthAndHeight2 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                            tL_documentAttributeVideo.w = inlineResultWidthAndHeight2[0];
                            tL_documentAttributeVideo.h = inlineResultWidthAndHeight2[1];
                            tL_documentAttributeVideo.duration = MessageObject.getInlineResultDuration(botInlineResult);
                            tL_documentAttributeVideo.supports_streaming = true;
                            tL_document2.attributes.add(tL_documentAttributeVideo);
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap loadBitmap2 = ImageLoader.loadBitmap(new File(FileLoader.getDirectory(4), Utilities.MD5(botInlineResult.thumb.url) + "." + ImageLoader.getHttpUrlExtension(botInlineResult.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (loadBitmap2 != null) {
                                        TLRPC.PhotoSize scaleAndSaveImage2 = ImageLoader.scaleAndSaveImage(loadBitmap2, 90.0f, 90.0f, 55, false);
                                        if (scaleAndSaveImage2 != null) {
                                            tL_document2.thumbs.add(scaleAndSaveImage2);
                                            tL_document2.flags |= 1;
                                        }
                                        loadBitmap2.recycle();
                                    }
                                }
                            } catch (Throwable th3) {
                                FileLog.e(th3);
                            }
                            tL_photo = null;
                            break;
                        case 5:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio2.duration = MessageObject.getInlineResultDuration(botInlineResult);
                            tL_documentAttributeAudio2.voice = true;
                            tL_documentAttributeFilename.file_name = "audio.ogg";
                            tL_document2.attributes.add(tL_documentAttributeAudio2);
                            tL_photo = null;
                            break;
                        default:
                            tL_photo = null;
                            break;
                    }
                    if (tL_documentAttributeFilename.file_name == null) {
                        tL_documentAttributeFilename.file_name = "file";
                    }
                    if (tL_document2.mime_type == null) {
                        tL_document2.mime_type = "application/octet-stream";
                    }
                    if (!tL_document2.thumbs.isEmpty()) {
                        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                        int[] inlineResultWidthAndHeight3 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                        tL_photoSize.w = inlineResultWidthAndHeight3[0];
                        tL_photoSize.h = inlineResultWidthAndHeight3[1];
                        tL_photoSize.size = 0;
                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize.type = "x";
                        tL_document2.thumbs.add(tL_photoSize);
                        tL_document2.flags |= 1;
                    }
                    tL_photo2 = tL_photo;
                    tL_document = tL_document2;
                case "photo":
                    TLRPC.TL_photo generatePhotoSizes = file.exists() ? SendMessagesHelper.getInstance(i9).generatePhotoSizes(absolutePath, null) : null;
                    if (generatePhotoSizes == null) {
                        generatePhotoSizes = new TLRPC.TL_photo();
                        generatePhotoSizes.date = ConnectionsManager.getInstance(i9).getCurrentTime();
                        generatePhotoSizes.file_reference = new byte[0];
                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                        int[] inlineResultWidthAndHeight4 = MessageObject.getInlineResultWidthAndHeight(botInlineResult);
                        tL_photoSize2.w = inlineResultWidthAndHeight4[0];
                        tL_photoSize2.h = inlineResultWidthAndHeight4[1];
                        tL_photoSize2.size = 1;
                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize2.type = "x";
                        generatePhotoSizes.sizes.add(tL_photoSize2);
                    }
                    tL_photo2 = generatePhotoSizes;
                    tL_photo = null;
                    tL_document = null;
                    break;
                default:
                    tL_photo = null;
                    tL_photo2 = null;
                    tL_document = null;
                    break;
            }
            i10 = i9;
            r92 = tL_photo;
            r12 = 1;
            O = O(i10, j10, botInlineResult, tL_photo2, tL_document, null);
        } else {
            r92 = 0;
            r12 = 1;
            i10 = i9;
            O = O(i10, j10, botInlineResult, null, null, webPage);
        }
        k1 k1Var2 = O;
        org.telegram.ui.Cells.w0 w0Var2 = new org.telegram.ui.Cells.w0(context, b6Var, false);
        w0Var2.setDelegate(new f1());
        w0Var2.setCustomText(LocaleController.getString(R.string.BotShareMessagePreview));
        g1 g1Var2 = new g1(context, i10);
        g1Var2.setDelegate(new h1());
        g1Var2.X3(k1Var2, null, false, false, false, false);
        LinearLayout f102 = ll.f(context, r12);
        f102.addView(w0Var2, e6.n(-1, -2));
        f102.addView(g1Var2, e6.n(-1, -2));
        i1 i1Var2 = new i1(context, r92);
        this.W = i1Var2;
        i1Var2.V(r6.e(r92, i10, j10, f6.I.q()));
        i1Var2.addView(f102, e6.d(-1, -1.0f, 119, 4.0f, 8.0f, 4.0f, 8.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        kh.d i112 = ll.i(24, context, b6Var, r12);
        i112.g(LocaleController.getString(R.string.BotShareMessageShare), false, r12);
        i112.setOnClickListener(new gh.q0(this, tL_messages_preparedInlineMessage, y0Var, i10, j10, tVar));
        frameLayout2.addView(i112, e6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ViewGroup viewGroup2 = this.containerView;
        int i122 = this.backgroundPaddingLeft;
        viewGroup2.addView(frameLayout2, e6.f(-2.0f, 87, i122, 0, i122, 0));
        wk0 wk0Var2 = this.d;
        int i132 = this.backgroundPaddingLeft;
        wk0Var2.setPadding(i132, 0, i132, AndroidUtilities.dp(68.0f) + r12);
        this.d.p1();
        int i142 = f6.a7;
        setBackgroundColor(getThemedColor(i142));
        fixNavigationBar(getThemedColor(i142));
        this.V.N(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v12, types: [org.telegram.tgnet.TLRPC$Photo] */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.telegram.tgnet.TLRPC$TL_document] */
    /* JADX WARN: Type inference failed for: r9v1, types: [org.telegram.tgnet.TLRPC$Document] */
    /* JADX WARN: Type inference failed for: r9v2, types: [org.telegram.tgnet.TLRPC$Document] */
    public static k1 O(int i9, long j10, TLRPC.BotInlineResult botInlineResult, TLRPC.TL_photo tL_photo, TLRPC.TL_document tL_document, TLRPC.WebPage webPage) {
        TLRPC.ReplyMarkup replyMarkup;
        TLRPC.TL_photo tL_photo2 = tL_photo;
        if (tL_photo == null) {
            tL_photo2 = botInlineResult.photo;
        }
        if (tL_document == 0) {
            tL_document = botInlineResult.document;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.out = false;
        tL_message.flags |= 2048;
        tL_message.via_bot_id = j10;
        tL_message.date = ConnectionsManager.getInstance(i9).getCurrentTime();
        tL_message.peer_id = MessagesController.getInstance(i9).getPeer(UserConfig.getInstance(i9).getClientUserId());
        tL_message.from_id = MessagesController.getInstance(i9).getPeer(UserConfig.getInstance(i9).getClientUserId());
        TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
        if (botInlineMessage != null) {
            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageText) {
                TLRPC.TL_botInlineMessageText tL_botInlineMessageText = (TLRPC.TL_botInlineMessageText) botInlineMessage;
                tL_message.message = tL_botInlineMessageText.message;
                tL_message.entities = tL_botInlineMessageText.entities;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaContact) {
                TLRPC.TL_botInlineMessageMediaContact tL_botInlineMessageMediaContact = (TLRPC.TL_botInlineMessageMediaContact) botInlineMessage;
                TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                tL_messageMediaContact.phone_number = tL_botInlineMessageMediaContact.phone_number;
                tL_messageMediaContact.first_name = tL_botInlineMessageMediaContact.first_name;
                tL_messageMediaContact.last_name = tL_botInlineMessageMediaContact.last_name;
                tL_messageMediaContact.vcard = tL_botInlineMessageMediaContact.vcard;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaContact;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaGeo) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                tL_messageMediaGeo.geo = ((TLRPC.TL_botInlineMessageMediaGeo) botInlineMessage).geo;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaGeo;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.venue_type;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaVenue;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaAuto) {
                TLRPC.TL_botInlineMessageMediaAuto tL_botInlineMessageMediaAuto = (TLRPC.TL_botInlineMessageMediaAuto) botInlineMessage;
                tL_message.message = tL_botInlineMessageMediaAuto.message;
                if (TLObject.hasFlag(tL_botInlineMessageMediaAuto.flags, 2)) {
                    tL_message.flags |= 128;
                    tL_message.entities = tL_botInlineMessageMediaAuto.entities;
                }
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                TLRPC.TL_botInlineMessageMediaInvoice tL_botInlineMessageMediaInvoice = (TLRPC.TL_botInlineMessageMediaInvoice) botInlineMessage;
                TLRPC.TL_messageMediaInvoice tL_messageMediaInvoice = new TLRPC.TL_messageMediaInvoice();
                tL_messageMediaInvoice.shipping_address_requested = tL_botInlineMessageMediaInvoice.shipping_address_requested;
                tL_messageMediaInvoice.test = tL_botInlineMessageMediaInvoice.test;
                tL_messageMediaInvoice.title = tL_botInlineMessageMediaInvoice.title;
                tL_messageMediaInvoice.description = tL_botInlineMessageMediaInvoice.description;
                if (TLObject.hasFlag(tL_botInlineMessageMediaInvoice.flags, 1)) {
                    tL_messageMediaInvoice.flags |= 128;
                    tL_messageMediaInvoice.webPhoto = tL_botInlineMessageMediaInvoice.photo;
                }
                tL_messageMediaInvoice.currency = tL_botInlineMessageMediaInvoice.currency;
                tL_messageMediaInvoice.total_amount = tL_botInlineMessageMediaInvoice.total_amount;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaInvoice;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaWebPage) {
                TLRPC.TL_botInlineMessageMediaWebPage tL_botInlineMessageMediaWebPage = (TLRPC.TL_botInlineMessageMediaWebPage) botInlineMessage;
                TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                tL_messageMediaWebPage.force_large_media = tL_botInlineMessageMediaWebPage.force_large_media;
                tL_messageMediaWebPage.force_small_media = tL_botInlineMessageMediaWebPage.force_small_media;
                tL_messageMediaWebPage.manual = tL_botInlineMessageMediaWebPage.manual;
                tL_messageMediaWebPage.safe = tL_botInlineMessageMediaWebPage.safe;
                tL_message.invert_media = tL_botInlineMessageMediaWebPage.invert_media;
                tL_message.message = tL_botInlineMessageMediaWebPage.message;
                if (webPage != null) {
                    tL_messageMediaWebPage.webpage = webPage;
                } else {
                    TLRPC.TL_webPage tL_webPage = new TLRPC.TL_webPage();
                    if (TLObject.hasFlag(tL_botInlineMessageMediaWebPage.flags, 2)) {
                        tL_message.flags |= 128;
                        tL_message.entities = tL_botInlineMessageMediaWebPage.entities;
                    }
                    String str = tL_botInlineMessageMediaWebPage.url;
                    tL_webPage.display_url = str;
                    tL_webPage.url = str;
                    tL_messageMediaWebPage.webpage = tL_webPage;
                }
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaWebPage;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageRichMessage) {
                tL_message.flags2 |= 8192;
                tL_message.rich_message = ((TLRPC.TL_botInlineMessageRichMessage) botInlineMessage).rich_message;
            }
        }
        if (tL_photo2 != null) {
            TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
            tL_messageMediaPhoto.photo = tL_photo2;
            tL_message.flags |= 512;
            tL_message.media = tL_messageMediaPhoto;
        } else if (tL_document != 0) {
            TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
            tL_messageMediaDocument.flags |= 1;
            tL_messageMediaDocument.voice = "voice".equalsIgnoreCase(botInlineResult.type);
            tL_messageMediaDocument.round = "round".equalsIgnoreCase(botInlineResult.type);
            tL_messageMediaDocument.document = tL_document;
            tL_message.flags |= 512;
            tL_message.media = tL_messageMediaDocument;
        }
        TLRPC.BotInlineMessage botInlineMessage2 = botInlineResult.send_message;
        if (botInlineMessage2 != null && (replyMarkup = botInlineMessage2.reply_markup) != null) {
            tL_message.flags |= 64;
            tL_message.reply_markup = replyMarkup;
        }
        return new k1(i9, tL_message, true, true);
    }

    public static void P(Context context, int i9, long j10, String str, b6 b6Var, org.telegram.ui.web.t tVar, bg.y0 y0Var) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(context, 3, null);
        c2Var.q(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = MessagesController.getInstance(i9).getInputUser(j10);
        tL_messages_getPreparedInlineMessage.id = str;
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getPreparedInlineMessage, new z0(i9, c2Var, context, j10, b6Var, tVar, y0Var));
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.k2
    public final void dismiss() {
        super.dismiss();
        if (this.X || this.Y) {
            return;
        }
        this.Y = true;
        bg.y0 y0Var = this.Z;
        if (y0Var != null) {
            y0Var.run("USER_DECLINED", null);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        wk0 wk0Var = this.d;
        wk0Var.u0(Math.max((wk0Var.getAdapter() == null ? 0 : wk0Var.getAdapter().h()) - 1, 0));
    }

    @Override // org.telegram.ui.Components.sa
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(wk0Var, getContext(), this.T, 0, true, new b8(this, 8), this.resourcesProvider);
        this.V = z41Var;
        return z41Var;
    }

    @Override // org.telegram.ui.Components.sa
    public final CharSequence y() {
        return LocaleController.getString(R.string.BotShareMessage);
    }
}
