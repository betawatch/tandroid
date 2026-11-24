// default package

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class lt0 extends mz0 {
    public final int S1;
    public final String T1;
    public l7c U1;
    public final it0 V1;
    public boolean W1;
    public boolean X1;
    public final p Y1;
    public int Z1;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    public lt0(Context context, int i, long j, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, File file, TLRPC.WebPage webPage, ylb ylbVar, bv0 bv0Var, p pVar) {
        super(context, null, false, false, ylbVar);
        ?? r11;
        int i2;
        kt0 Y0;
        String str;
        String absolutePath;
        boolean z;
        char c;
        TLRPC.TL_document tL_document;
        TLRPC.TL_photo tL_photo;
        int i3;
        TLRPC.TL_photo tL_photo2;
        this.W1 = false;
        this.X1 = false;
        this.S1 = i;
        this.T1 = m9c.r(oc7.r1(i).W1(Long.valueOf(j)));
        this.Y1 = pVar;
        T0();
        this.C1 = gm.L(4.0f);
        this.D1 = gm.L(-10.0f);
        TLRPC.BotInlineResult botInlineResult = tL_messages_preparedInlineMessage.result;
        if (file != null && file.exists() && webPage == null) {
            str = botInlineResult.type;
            absolutePath = file.getAbsolutePath();
            str.getClass();
            z = true;
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
                    tL_document2.date = ConnectionsManager.getInstance(i).getCurrentTime();
                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                    tL_document2.attributes.add(tL_documentAttributeFilename);
                    switch (str.hashCode()) {
                        case -1890252483:
                            if (str.equals("sticker")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 102340:
                            if (str.equals("gif")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case 3143036:
                            if (str.equals("file")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 93166550:
                            if (str.equals(MediaStreamTrack.AUDIO_TRACK_KIND)) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 112202875:
                            if (str.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 112386354:
                            if (str.equals("voice")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            TLRPC.TL_documentAttributeSticker tL_documentAttributeSticker = new TLRPC.TL_documentAttributeSticker();
                            tL_documentAttributeSticker.alt = "";
                            tL_documentAttributeSticker.stickerset = new TLRPC.TL_inputStickerSetEmpty();
                            tL_document2.attributes.add(tL_documentAttributeSticker);
                            TLRPC.TL_documentAttributeImageSize tL_documentAttributeImageSize = new TLRPC.TL_documentAttributeImageSize();
                            int[] g1 = k47.g1(botInlineResult);
                            tL_documentAttributeImageSize.w = g1[0];
                            tL_documentAttributeImageSize.h = g1[1];
                            tL_document2.attributes.add(tL_documentAttributeImageSize);
                            tL_documentAttributeFilename.file_name = "sticker.webp";
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap G = fn5.G(new File(bc4.z(4), Utilities.a(botInlineResult.thumb.url) + "." + fn5.x(botInlineResult.thumb.url, "webp")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (G != null) {
                                        TLRPC.PhotoSize U = fn5.U(G, 90.0f, 90.0f, 55, false);
                                        if (U != null) {
                                            tL_document2.thumbs.add(U);
                                            tL_document2.flags |= 1;
                                        }
                                        G.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th) {
                                fc4.g(th, true);
                                break;
                            }
                            break;
                        case 1:
                            tL_documentAttributeFilename.file_name = "animation.gif";
                            if (!absolutePath.endsWith("mp4")) {
                                tL_document2.mime_type = "image/gif";
                                break;
                            } else {
                                tL_document2.mime_type = "video/mp4";
                                tL_document2.attributes.add(new TLRPC.TL_documentAttributeAnimated());
                                break;
                            }
                        case 2:
                            int lastIndexOf = botInlineResult.content.mime_type.lastIndexOf(47);
                            if (lastIndexOf == -1) {
                                tL_documentAttributeFilename.file_name = "file";
                                break;
                            } else {
                                tL_documentAttributeFilename.file_name = "file.".concat(botInlineResult.content.mime_type.substring(lastIndexOf + 1));
                                break;
                            }
                        case 3:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio.duration = k47.f1(botInlineResult);
                            tL_documentAttributeAudio.title = botInlineResult.title;
                            int i4 = tL_documentAttributeAudio.flags;
                            tL_documentAttributeAudio.flags = i4 | 1;
                            String str2 = botInlineResult.description;
                            if (str2 != null) {
                                tL_documentAttributeAudio.performer = str2;
                                tL_documentAttributeAudio.flags = i4 | 3;
                            }
                            tL_documentAttributeFilename.file_name = "audio.mp3";
                            tL_document2.attributes.add(tL_documentAttributeAudio);
                            break;
                        case 4:
                            tL_documentAttributeFilename.file_name = "video.mp4";
                            TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = new TLRPC.TL_documentAttributeVideo();
                            int[] g12 = k47.g1(botInlineResult);
                            tL_documentAttributeVideo.w = g12[0];
                            tL_documentAttributeVideo.h = g12[1];
                            tL_documentAttributeVideo.duration = k47.f1(botInlineResult);
                            tL_documentAttributeVideo.supports_streaming = true;
                            tL_document2.attributes.add(tL_documentAttributeVideo);
                            try {
                                if (botInlineResult.thumb != null) {
                                    Bitmap G2 = fn5.G(new File(bc4.z(4), Utilities.a(botInlineResult.thumb.url) + "." + fn5.x(botInlineResult.thumb.url, "jpg")).getAbsolutePath(), null, 90.0f, 90.0f, true);
                                    if (G2 != null) {
                                        TLRPC.PhotoSize U2 = fn5.U(G2, 90.0f, 90.0f, 55, false);
                                        if (U2 != null) {
                                            tL_document2.thumbs.add(U2);
                                            tL_document2.flags |= 1;
                                        }
                                        G2.recycle();
                                        break;
                                    }
                                }
                            } catch (Throwable th2) {
                                fc4.g(th2, true);
                                break;
                            }
                            break;
                        case 5:
                            TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio2 = new TLRPC.TL_documentAttributeAudio();
                            tL_documentAttributeAudio2.duration = k47.f1(botInlineResult);
                            tL_documentAttributeAudio2.voice = true;
                            tL_documentAttributeFilename.file_name = "audio.ogg";
                            tL_document2.attributes.add(tL_documentAttributeAudio2);
                            break;
                    }
                    if (tL_documentAttributeFilename.file_name == null) {
                        tL_documentAttributeFilename.file_name = "file";
                    }
                    if (tL_document2.mime_type == null) {
                        tL_document2.mime_type = "application/octet-stream";
                    }
                    if (tL_document2.thumbs.isEmpty()) {
                        TLRPC.TL_photoSize tL_photoSize = new TLRPC.TL_photoSize();
                        int[] g13 = k47.g1(botInlineResult);
                        tL_photoSize.w = g13[0];
                        z = true;
                        tL_photoSize.h = g13[1];
                        tL_photoSize.size = 0;
                        tL_photoSize.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize.type = "x";
                        tL_document2.thumbs.add(tL_photoSize);
                        tL_document2.flags |= 1;
                    } else {
                        z = true;
                    }
                    tL_document = tL_document2;
                    tL_photo = null;
                    break;
                case "photo":
                    if (file.exists()) {
                        i3 = 0;
                        tL_photo2 = a6a.B(i).z(absolutePath, null, false);
                    } else {
                        i3 = 0;
                        tL_photo2 = null;
                    }
                    if (tL_photo2 == null) {
                        tL_photo2 = new TLRPC.TL_photo();
                        tL_photo2.date = ConnectionsManager.getInstance(i).getCurrentTime();
                        tL_photo2.file_reference = new byte[i3];
                        TLRPC.TL_photoSize tL_photoSize2 = new TLRPC.TL_photoSize();
                        int[] g14 = k47.g1(botInlineResult);
                        tL_photoSize2.w = g14[i3];
                        tL_photoSize2.h = g14[1];
                        tL_photoSize2.size = 1;
                        tL_photoSize2.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_photoSize2.type = "x";
                        tL_photo2.sizes.add(tL_photoSize2);
                    }
                    tL_photo = tL_photo2;
                    tL_document = null;
                    z = true;
                    break;
                default:
                    tL_photo = null;
                    tL_document = null;
                    break;
            }
            i2 = i;
            r11 = z;
            Y0 = Y0(i2, j, botInlineResult, tL_photo, tL_document, null);
        } else {
            r11 = 1;
            i2 = i;
            Y0 = Y0(i2, j, botInlineResult, null, null, webPage);
        }
        kt0 kt0Var = Y0;
        cm1 cm1Var = new cm1(ylbVar, context, false);
        cm1Var.setDelegate(new ft0());
        cm1Var.setCustomText(jb6.M0(2131752932, null));
        gt0 gt0Var = new gt0(context, i2);
        gt0Var.setDelegate(new ht0());
        gt0Var.z3(kt0Var, null, false, false, false, false);
        LinearLayout i5 = hg9.i(context, r11);
        i5.addView(cm1Var, qoe.o(-1, -2));
        i5.addView(gt0Var, qoe.o(-1, -2));
        it0 it0Var = new it0(context, null);
        this.V1 = it0Var;
        it0Var.U(cl8.d(null, i2, j, cmb.I.o()));
        it0Var.addView(i5, qoe.d(-1, -1.0f, nm7.D1, 4.0f, 8.0f, 4.0f, 8.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        b61 i6 = mlb.i(24, ylbVar, context, r11);
        i6.i(jb6.M0(2131752931, null), false, r11);
        i6.setOnClickListener(new ys0(this, tL_messages_preparedInlineMessage, pVar, i2, j, bv0Var));
        frameLayout.addView(i6, qoe.d(-1, 48.0f, nm7.D1, 10.0f, 10.0f, 10.0f, 10.0f));
        ViewGroup viewGroup = this.b;
        int i7 = this.u0;
        viewGroup.addView(frameLayout, qoe.f(-2.0f, -1, 87, i7, 0, i7, 0));
        r59 r59Var = this.n1;
        int i8 = this.u0;
        r59Var.setPadding(i8, 0, i8, gm.L(68.0f) + r11);
        this.n1.r1();
        int i9 = cmb.Z6;
        s0(cmb.v0(i9, this.J0));
        L(i9);
        this.U1.O(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [org.telegram.tgnet.TLRPC$Photo] */
    /* JADX WARN: Type inference failed for: r9v0, types: [org.telegram.tgnet.TLRPC$TL_document] */
    /* JADX WARN: Type inference failed for: r9v1, types: [org.telegram.tgnet.TLRPC$Document] */
    /* JADX WARN: Type inference failed for: r9v2, types: [org.telegram.tgnet.TLRPC$Document] */
    public static kt0 Y0(int i, long j, TLRPC.BotInlineResult botInlineResult, TLRPC.TL_photo tL_photo, TLRPC.TL_document tL_document, TLRPC.WebPage webPage) {
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
        tL_message.via_bot_id = j;
        tL_message.date = ConnectionsManager.getInstance(i).getCurrentTime();
        tL_message.peer_id = oc7.r1(i).x1(z8c.h(i).e());
        tL_message.from_id = oc7.r1(i).x1(z8c.h(i).e());
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
                tL_message.flags2 |= TLObject.FLAG_13;
                tL_message.rich_message = ((TLRPC.TL_botInlineMessageRichMessage) botInlineMessage).rich_message;
            } else if (botInlineMessage instanceof TLRPC.TL_botInlineMessageWidget) {
                TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineMessage;
                TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
                tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
                tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
                tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
                tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
                tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
                tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
                tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
                tL_message.message = tL_botInlineMessageWidget.message;
                tL_message.entities = tL_botInlineMessageWidget.entities;
                tL_message.invert_media = tL_botInlineMessageWidget.invert_media;
                tL_message.flags |= 512;
                tL_message.media = tL_messageMediaWidget;
            }
        }
        boolean z = botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageWidget;
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
        return new kt0(i, tL_message, z, botInlineResult);
    }

    public static void Z0(Context context, int i, long j, String str, ylb ylbVar, bv0 bv0Var, p pVar) {
        he heVar = new he(3, null, context);
        heVar.q(500L);
        TLRPC.TL_messages_getPreparedInlineMessage tL_messages_getPreparedInlineMessage = new TLRPC.TL_messages_getPreparedInlineMessage();
        tL_messages_getPreparedInlineMessage.bot = oc7.r1(i).n1(j);
        tL_messages_getPreparedInlineMessage.id = str;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getPreparedInlineMessage, new xs0(i, heVar, context, j, ylbVar, bv0Var, pVar));
    }

    @Override // mz0
    public final q59 G0(r59 r59Var) {
        l7c l7cVar = new l7c(r59Var, getContext(), this.S1, 0, true, new f(this, (byte) 17), this.J0);
        this.U1 = l7cVar;
        return l7cVar;
    }

    @Override // mz0
    public final CharSequence J0() {
        return jb6.M0(2131752934, null);
    }

    @Override // my0, android.app.Dialog, android.content.DialogInterface, ah0
    public final void dismiss() {
        super.dismiss();
        if (this.W1 || this.X1) {
            return;
        }
        this.X1 = true;
        p pVar = this.Y1;
        if (pVar != null) {
            pVar.a("USER_DECLINED", null);
        }
    }

    @Override // my0, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        r59 r59Var = this.n1;
        r59Var.w0(Math.max((r59Var.getAdapter() == null ? 0 : r59Var.getAdapter().b()) - 1, 0));
    }

    @Override // my0
    public final void p0() {
        try {
            super.p0();
            int v0 = cmb.v0(cmb.Z6, this.J0);
            if (v0 != this.Z1) {
                this.Z1 = v0;
                s0(v0);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
