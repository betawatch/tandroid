// default package

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class j4a implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a6a b;
    public final /* synthetic */ TLRPC.InputMedia c;
    public final /* synthetic */ m5a d;

    public /* synthetic */ j4a(a6a a6aVar, TLRPC.InputMedia inputMedia, m5a m5aVar, byte b) {
        this.a = b;
        this.b = a6aVar;
        this.c = inputMedia;
        this.d = m5aVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final byte b = 0;
                final a6a a6aVar = this.b;
                final TLRPC.InputMedia inputMedia = this.c;
                final m5a m5aVar = this.d;
                gm.c3(new Runnable() { // from class: r4a
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        TLRPC.PhotoSize photoSize;
                        k47 k47Var;
                        rcc rccVar;
                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument;
                        TLRPC.InputDocument inputDocument;
                        byte b2 = b;
                        TLRPC.InputMedia inputMedia2 = inputMedia;
                        TLObject tLObject2 = tLObject;
                        switch (b2) {
                            case 0:
                                boolean z = tLObject2 instanceof TLRPC.TL_messageMediaPhoto;
                                m5a m5aVar2 = m5aVar;
                                if (!z) {
                                    m5aVar2.c();
                                    break;
                                } else {
                                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = photo.id;
                                    tL_inputPhoto.access_hash = photo.access_hash;
                                    tL_inputPhoto.file_reference = photo.file_reference;
                                    if (inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                        inputMedia2.flags |= 64;
                                        inputMedia2.video_cover = tL_inputPhoto;
                                    } else if (inputMedia2 instanceof TLRPC.TL_inputMediaDocument) {
                                        inputMedia2.flags |= 8;
                                        inputMedia2.video_cover = tL_inputPhoto;
                                    }
                                    TLRPC.InputMedia inputMedia3 = m5aVar2.t;
                                    if (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                        inputMedia3.flags |= 64;
                                        inputMedia3.video_cover = tL_inputPhoto;
                                    }
                                    boolean z2 = m5aVar2.p;
                                    a6a a6aVar2 = a6aVar;
                                    if (!z2 || inputMedia2.thumb != null || (photoSize = m5aVar2.g) == null || photoSize.location == null || ((k47Var = m5aVar2.m) != null && (rccVar = k47Var.r0) != null && rccVar.N)) {
                                        a6aVar2.M(m5aVar2.c, m5aVar2.m, m5aVar2.f, m5aVar2, m5aVar2.K, null, m5aVar2.H);
                                        break;
                                    } else {
                                        a6aVar2.L(m5aVar2, -1);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (tLObject2 != null) {
                                    TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) tLObject2;
                                    if ((inputMedia2 instanceof TLRPC.TL_inputMediaUploadedPhoto) && (messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                                        TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = (TLRPC.TL_inputMediaUploadedPhoto) inputMedia2;
                                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                                        TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                                        tL_inputMediaPhoto.id = tL_inputPhoto2;
                                        TLRPC.Photo photo2 = messageMedia.photo;
                                        tL_inputPhoto2.id = photo2.id;
                                        tL_inputPhoto2.access_hash = photo2.access_hash;
                                        tL_inputPhoto2.file_reference = photo2.file_reference;
                                        tL_inputMediaPhoto.spoiler = inputMedia2.spoiler;
                                        if (tL_inputMediaUploadedPhoto.live_photo && (inputDocument = tL_inputMediaUploadedPhoto.video) != null) {
                                            tL_inputMediaPhoto.live_photo = true;
                                            tL_inputMediaPhoto.video = inputDocument;
                                        }
                                        boolean z3 = e21.a;
                                        fc4.b("set uploaded photo");
                                        tL_inputMediaDocument = tL_inputMediaPhoto;
                                    } else if ((inputMedia2 instanceof TLRPC.TL_inputMediaUploadedDocument) && (messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = new TLRPC.TL_inputMediaDocument();
                                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                                        tL_inputMediaDocument2.id = tL_inputDocument;
                                        TLRPC.Document document = messageMedia.document;
                                        tL_inputDocument.id = document.id;
                                        tL_inputDocument.access_hash = document.access_hash;
                                        tL_inputDocument.file_reference = document.file_reference;
                                        tL_inputMediaDocument2.spoiler = inputMedia2.spoiler;
                                        TLRPC.Photo photo3 = messageMedia.video_cover;
                                        if (photo3 != null) {
                                            TLRPC.TL_inputPhoto tL_inputPhoto3 = new TLRPC.TL_inputPhoto();
                                            tL_inputPhoto3.id = photo3.id;
                                            tL_inputPhoto3.access_hash = photo3.access_hash;
                                            tL_inputPhoto3.file_reference = photo3.file_reference;
                                            tL_inputMediaDocument2.flags |= 8;
                                            tL_inputMediaDocument2.video_cover = tL_inputPhoto3;
                                        }
                                        boolean z4 = e21.a;
                                        fc4.b("set uploaded document");
                                        tL_inputMediaDocument = tL_inputMediaDocument2;
                                    }
                                    m5a m5aVar3 = m5aVar;
                                    if (tL_inputMediaDocument != null) {
                                        m5aVar3.c();
                                        break;
                                    } else {
                                        int i = inputMedia2.ttl_seconds;
                                        if (i != 0) {
                                            tL_inputMediaDocument.ttl_seconds = i;
                                            tL_inputMediaDocument.flags |= 1;
                                        }
                                        TLObject tLObject3 = m5aVar3.c;
                                        if (tLObject3 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject3;
                                            int i2 = 0;
                                            while (true) {
                                                if (i2 < tL_messages_sendMultiMedia.multi_media.size()) {
                                                    if (tL_messages_sendMultiMedia.multi_media.get(i2).media == inputMedia2) {
                                                        tL_messages_sendMultiMedia.multi_media.get(i2).media = tL_inputMediaDocument;
                                                    } else {
                                                        i2++;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                                                TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                                                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                                                    int i3 = 0;
                                                    while (true) {
                                                        if (i3 < tL_inputMediaPaidMedia.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia.extended_media.get(i3) == inputMedia2) {
                                                                tL_inputMediaPaidMedia.extended_media.set(i3, tL_inputMediaDocument);
                                                            } else {
                                                                i3++;
                                                            }
                                                        }
                                                    }
                                                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll = (TLRPC.TL_inputMediaPoll) inputMedia4;
                                                    wf8.k(tL_inputMediaPoll, wf8.a(tL_inputMediaPoll, inputMedia2), tL_inputMediaDocument);
                                                }
                                            }
                                            if (tLObject3 instanceof TL_ephemeral.TL_sendMessage) {
                                                TLRPC.InputMedia inputMedia5 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                                                if (inputMedia5 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia5;
                                                    int i4 = 0;
                                                    while (true) {
                                                        if (i4 < tL_inputMediaPaidMedia2.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia2.extended_media.get(i4) == inputMedia2) {
                                                                tL_inputMediaPaidMedia2.extended_media.set(i4, tL_inputMediaDocument);
                                                            } else {
                                                                i4++;
                                                            }
                                                        }
                                                    }
                                                } else if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll2 = (TLRPC.TL_inputMediaPoll) inputMedia5;
                                                    wf8.k(tL_inputMediaPoll2, wf8.a(tL_inputMediaPoll2, inputMedia2), tL_inputMediaDocument);
                                                }
                                            }
                                        }
                                        a6aVar.s0(m5aVar3, false);
                                        break;
                                    }
                                }
                                tL_inputMediaDocument = null;
                                m5a m5aVar32 = m5aVar;
                                if (tL_inputMediaDocument != null) {
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b2 = 1;
                final a6a a6aVar2 = this.b;
                final TLRPC.InputMedia inputMedia2 = this.c;
                final m5a m5aVar2 = this.d;
                gm.c3(new Runnable() { // from class: r4a
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x0145  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        TLRPC.PhotoSize photoSize;
                        k47 k47Var;
                        rcc rccVar;
                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument;
                        TLRPC.InputDocument inputDocument;
                        byte b22 = b2;
                        TLRPC.InputMedia inputMedia22 = inputMedia2;
                        TLObject tLObject2 = tLObject;
                        switch (b22) {
                            case 0:
                                boolean z = tLObject2 instanceof TLRPC.TL_messageMediaPhoto;
                                m5a m5aVar22 = m5aVar2;
                                if (!z) {
                                    m5aVar22.c();
                                    break;
                                } else {
                                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.id = photo.id;
                                    tL_inputPhoto.access_hash = photo.access_hash;
                                    tL_inputPhoto.file_reference = photo.file_reference;
                                    if (inputMedia22 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                        inputMedia22.flags |= 64;
                                        inputMedia22.video_cover = tL_inputPhoto;
                                    } else if (inputMedia22 instanceof TLRPC.TL_inputMediaDocument) {
                                        inputMedia22.flags |= 8;
                                        inputMedia22.video_cover = tL_inputPhoto;
                                    }
                                    TLRPC.InputMedia inputMedia3 = m5aVar22.t;
                                    if (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                        inputMedia3.flags |= 64;
                                        inputMedia3.video_cover = tL_inputPhoto;
                                    }
                                    boolean z2 = m5aVar22.p;
                                    a6a a6aVar22 = a6aVar2;
                                    if (!z2 || inputMedia22.thumb != null || (photoSize = m5aVar22.g) == null || photoSize.location == null || ((k47Var = m5aVar22.m) != null && (rccVar = k47Var.r0) != null && rccVar.N)) {
                                        a6aVar22.M(m5aVar22.c, m5aVar22.m, m5aVar22.f, m5aVar22, m5aVar22.K, null, m5aVar22.H);
                                        break;
                                    } else {
                                        a6aVar22.L(m5aVar22, -1);
                                        break;
                                    }
                                }
                                break;
                            default:
                                if (tLObject2 != null) {
                                    TLRPC.MessageMedia messageMedia = (TLRPC.MessageMedia) tLObject2;
                                    if ((inputMedia22 instanceof TLRPC.TL_inputMediaUploadedPhoto) && (messageMedia instanceof TLRPC.TL_messageMediaPhoto)) {
                                        TLRPC.TL_inputMediaUploadedPhoto tL_inputMediaUploadedPhoto = (TLRPC.TL_inputMediaUploadedPhoto) inputMedia22;
                                        TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                                        TLRPC.TL_inputPhoto tL_inputPhoto2 = new TLRPC.TL_inputPhoto();
                                        tL_inputMediaPhoto.id = tL_inputPhoto2;
                                        TLRPC.Photo photo2 = messageMedia.photo;
                                        tL_inputPhoto2.id = photo2.id;
                                        tL_inputPhoto2.access_hash = photo2.access_hash;
                                        tL_inputPhoto2.file_reference = photo2.file_reference;
                                        tL_inputMediaPhoto.spoiler = inputMedia22.spoiler;
                                        if (tL_inputMediaUploadedPhoto.live_photo && (inputDocument = tL_inputMediaUploadedPhoto.video) != null) {
                                            tL_inputMediaPhoto.live_photo = true;
                                            tL_inputMediaPhoto.video = inputDocument;
                                        }
                                        boolean z3 = e21.a;
                                        fc4.b("set uploaded photo");
                                        tL_inputMediaDocument = tL_inputMediaPhoto;
                                    } else if ((inputMedia22 instanceof TLRPC.TL_inputMediaUploadedDocument) && (messageMedia instanceof TLRPC.TL_messageMediaDocument)) {
                                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument2 = new TLRPC.TL_inputMediaDocument();
                                        TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                                        tL_inputMediaDocument2.id = tL_inputDocument;
                                        TLRPC.Document document = messageMedia.document;
                                        tL_inputDocument.id = document.id;
                                        tL_inputDocument.access_hash = document.access_hash;
                                        tL_inputDocument.file_reference = document.file_reference;
                                        tL_inputMediaDocument2.spoiler = inputMedia22.spoiler;
                                        TLRPC.Photo photo3 = messageMedia.video_cover;
                                        if (photo3 != null) {
                                            TLRPC.TL_inputPhoto tL_inputPhoto3 = new TLRPC.TL_inputPhoto();
                                            tL_inputPhoto3.id = photo3.id;
                                            tL_inputPhoto3.access_hash = photo3.access_hash;
                                            tL_inputPhoto3.file_reference = photo3.file_reference;
                                            tL_inputMediaDocument2.flags |= 8;
                                            tL_inputMediaDocument2.video_cover = tL_inputPhoto3;
                                        }
                                        boolean z4 = e21.a;
                                        fc4.b("set uploaded document");
                                        tL_inputMediaDocument = tL_inputMediaDocument2;
                                    }
                                    m5a m5aVar32 = m5aVar2;
                                    if (tL_inputMediaDocument != null) {
                                        m5aVar32.c();
                                        break;
                                    } else {
                                        int i = inputMedia22.ttl_seconds;
                                        if (i != 0) {
                                            tL_inputMediaDocument.ttl_seconds = i;
                                            tL_inputMediaDocument.flags |= 1;
                                        }
                                        TLObject tLObject3 = m5aVar32.c;
                                        if (tLObject3 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject3;
                                            int i2 = 0;
                                            while (true) {
                                                if (i2 < tL_messages_sendMultiMedia.multi_media.size()) {
                                                    if (tL_messages_sendMultiMedia.multi_media.get(i2).media == inputMedia22) {
                                                        tL_messages_sendMultiMedia.multi_media.get(i2).media = tL_inputMediaDocument;
                                                    } else {
                                                        i2++;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (tLObject3 instanceof TLRPC.TL_messages_sendMedia) {
                                                TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                                                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                                                    int i3 = 0;
                                                    while (true) {
                                                        if (i3 < tL_inputMediaPaidMedia.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia.extended_media.get(i3) == inputMedia22) {
                                                                tL_inputMediaPaidMedia.extended_media.set(i3, tL_inputMediaDocument);
                                                            } else {
                                                                i3++;
                                                            }
                                                        }
                                                    }
                                                } else if (inputMedia4 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll = (TLRPC.TL_inputMediaPoll) inputMedia4;
                                                    wf8.k(tL_inputMediaPoll, wf8.a(tL_inputMediaPoll, inputMedia22), tL_inputMediaDocument);
                                                }
                                            }
                                            if (tLObject3 instanceof TL_ephemeral.TL_sendMessage) {
                                                TLRPC.InputMedia inputMedia5 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                                                if (inputMedia5 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia5;
                                                    int i4 = 0;
                                                    while (true) {
                                                        if (i4 < tL_inputMediaPaidMedia2.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia2.extended_media.get(i4) == inputMedia22) {
                                                                tL_inputMediaPaidMedia2.extended_media.set(i4, tL_inputMediaDocument);
                                                            } else {
                                                                i4++;
                                                            }
                                                        }
                                                    }
                                                } else if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll2 = (TLRPC.TL_inputMediaPoll) inputMedia5;
                                                    wf8.k(tL_inputMediaPoll2, wf8.a(tL_inputMediaPoll2, inputMedia22), tL_inputMediaDocument);
                                                }
                                            }
                                        }
                                        a6aVar2.s0(m5aVar32, false);
                                        break;
                                    }
                                }
                                tL_inputMediaDocument = null;
                                m5a m5aVar322 = m5aVar2;
                                if (tL_inputMediaDocument != null) {
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
