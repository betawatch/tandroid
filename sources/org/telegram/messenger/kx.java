package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class kx implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ ez b;
    public final /* synthetic */ TLRPC.InputMedia c;
    public final /* synthetic */ qy d;

    public /* synthetic */ kx(ez ezVar, TLRPC.InputMedia inputMedia, qy qyVar, int i7) {
        this.a = i7;
        this.b = ezVar;
        this.c = inputMedia;
        this.d = qyVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 0;
                final ez ezVar = this.b;
                final TLRPC.InputMedia inputMedia = this.c;
                final qy qyVar = this.d;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.tx
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        TLRPC.PhotoSize photoSize;
                        gj gjVar;
                        g20 g20Var;
                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument;
                        TLRPC.InputDocument inputDocument;
                        int i10 = i7;
                        TLRPC.InputMedia inputMedia2 = inputMedia;
                        TLObject tLObject2 = tLObject;
                        switch (i10) {
                            case 0:
                                ez ezVar2 = ezVar;
                                ezVar2.getClass();
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaPhoto;
                                qy qyVar2 = qyVar;
                                if (!z10) {
                                    qyVar2.c();
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
                                    TLRPC.InputMedia inputMedia3 = qyVar2.t;
                                    if (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                        inputMedia3.flags |= 64;
                                        inputMedia3.video_cover = tL_inputPhoto;
                                    }
                                    if (!qyVar2.p || inputMedia2.thumb != null || (photoSize = qyVar2.g) == null || photoSize.location == null || ((gjVar = qyVar2.m) != null && (g20Var = gjVar.r0) != null && g20Var.N)) {
                                        ezVar2.N(qyVar2.c, qyVar2.m, qyVar2.f, qyVar2, qyVar2.K, null, qyVar2.H);
                                        break;
                                    } else {
                                        ezVar2.M(qyVar2, -1);
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
                                        boolean z11 = r2.a;
                                        a8.b("set uploaded photo");
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
                                        boolean z12 = r2.a;
                                        a8.b("set uploaded document");
                                        tL_inputMediaDocument = tL_inputMediaDocument2;
                                    }
                                    qy qyVar3 = qyVar;
                                    if (tL_inputMediaDocument != null) {
                                        qyVar3.c();
                                        break;
                                    } else {
                                        int i11 = inputMedia2.ttl_seconds;
                                        if (i11 != 0) {
                                            tL_inputMediaDocument.ttl_seconds = i11;
                                            tL_inputMediaDocument.flags = 1 | tL_inputMediaDocument.flags;
                                        }
                                        TLObject tLObject3 = qyVar3.c;
                                        if (tLObject3 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject3;
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < tL_messages_sendMultiMedia.multi_media.size()) {
                                                    if (tL_messages_sendMultiMedia.multi_media.get(i12).media == inputMedia2) {
                                                        tL_messages_sendMultiMedia.multi_media.get(i12).media = tL_inputMediaDocument;
                                                    } else {
                                                        i12++;
                                                    }
                                                }
                                            }
                                        } else {
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_sendMedia;
                                            if (z13) {
                                                TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                                                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                                                    int i13 = 0;
                                                    while (true) {
                                                        if (i13 < tL_inputMediaPaidMedia.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia.extended_media.get(i13) == inputMedia2) {
                                                                tL_inputMediaPaidMedia.extended_media.set(i13, tL_inputMediaDocument);
                                                            } else {
                                                                i13++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (z13) {
                                                TLRPC.InputMedia inputMedia5 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                                                if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll = (TLRPC.TL_inputMediaPoll) inputMedia5;
                                                    sh.d.k(tL_inputMediaPoll, sh.d.a(tL_inputMediaPoll, inputMedia2), tL_inputMediaDocument);
                                                }
                                            }
                                            boolean z14 = tLObject3 instanceof TL_ephemeral.TL_sendMessage;
                                            if (z14) {
                                                TLRPC.InputMedia inputMedia6 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                                                if (inputMedia6 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia6;
                                                    int i14 = 0;
                                                    while (true) {
                                                        if (i14 < tL_inputMediaPaidMedia2.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia2.extended_media.get(i14) == inputMedia2) {
                                                                tL_inputMediaPaidMedia2.extended_media.set(i14, tL_inputMediaDocument);
                                                            } else {
                                                                i14++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (z14) {
                                                TLRPC.InputMedia inputMedia7 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                                                if (inputMedia7 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll2 = (TLRPC.TL_inputMediaPoll) inputMedia7;
                                                    sh.d.k(tL_inputMediaPoll2, sh.d.a(tL_inputMediaPoll2, inputMedia2), tL_inputMediaDocument);
                                                }
                                            }
                                        }
                                        ezVar.t0(qyVar3, false);
                                        break;
                                    }
                                }
                                tL_inputMediaDocument = null;
                                qy qyVar32 = qyVar;
                                if (tL_inputMediaDocument != null) {
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 1;
                final ez ezVar2 = this.b;
                final TLRPC.InputMedia inputMedia2 = this.c;
                final qy qyVar2 = this.d;
                g0.h3(new Runnable() { // from class: org.telegram.messenger.tx
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        TLRPC.PhotoSize photoSize;
                        gj gjVar;
                        g20 g20Var;
                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument;
                        TLRPC.InputDocument inputDocument;
                        int i102 = i10;
                        TLRPC.InputMedia inputMedia22 = inputMedia2;
                        TLObject tLObject2 = tLObject;
                        switch (i102) {
                            case 0:
                                ez ezVar22 = ezVar2;
                                ezVar22.getClass();
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaPhoto;
                                qy qyVar22 = qyVar2;
                                if (!z10) {
                                    qyVar22.c();
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
                                    TLRPC.InputMedia inputMedia3 = qyVar22.t;
                                    if (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                        inputMedia3.flags |= 64;
                                        inputMedia3.video_cover = tL_inputPhoto;
                                    }
                                    if (!qyVar22.p || inputMedia22.thumb != null || (photoSize = qyVar22.g) == null || photoSize.location == null || ((gjVar = qyVar22.m) != null && (g20Var = gjVar.r0) != null && g20Var.N)) {
                                        ezVar22.N(qyVar22.c, qyVar22.m, qyVar22.f, qyVar22, qyVar22.K, null, qyVar22.H);
                                        break;
                                    } else {
                                        ezVar22.M(qyVar22, -1);
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
                                        boolean z11 = r2.a;
                                        a8.b("set uploaded photo");
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
                                        boolean z12 = r2.a;
                                        a8.b("set uploaded document");
                                        tL_inputMediaDocument = tL_inputMediaDocument2;
                                    }
                                    qy qyVar32 = qyVar2;
                                    if (tL_inputMediaDocument != null) {
                                        qyVar32.c();
                                        break;
                                    } else {
                                        int i11 = inputMedia22.ttl_seconds;
                                        if (i11 != 0) {
                                            tL_inputMediaDocument.ttl_seconds = i11;
                                            tL_inputMediaDocument.flags = 1 | tL_inputMediaDocument.flags;
                                        }
                                        TLObject tLObject3 = qyVar32.c;
                                        if (tLObject3 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject3;
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 < tL_messages_sendMultiMedia.multi_media.size()) {
                                                    if (tL_messages_sendMultiMedia.multi_media.get(i12).media == inputMedia22) {
                                                        tL_messages_sendMultiMedia.multi_media.get(i12).media = tL_inputMediaDocument;
                                                    } else {
                                                        i12++;
                                                    }
                                                }
                                            }
                                        } else {
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_sendMedia;
                                            if (z13) {
                                                TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                                                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                                                    int i13 = 0;
                                                    while (true) {
                                                        if (i13 < tL_inputMediaPaidMedia.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia.extended_media.get(i13) == inputMedia22) {
                                                                tL_inputMediaPaidMedia.extended_media.set(i13, tL_inputMediaDocument);
                                                            } else {
                                                                i13++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (z13) {
                                                TLRPC.InputMedia inputMedia5 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                                                if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll = (TLRPC.TL_inputMediaPoll) inputMedia5;
                                                    sh.d.k(tL_inputMediaPoll, sh.d.a(tL_inputMediaPoll, inputMedia22), tL_inputMediaDocument);
                                                }
                                            }
                                            boolean z14 = tLObject3 instanceof TL_ephemeral.TL_sendMessage;
                                            if (z14) {
                                                TLRPC.InputMedia inputMedia6 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                                                if (inputMedia6 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia6;
                                                    int i14 = 0;
                                                    while (true) {
                                                        if (i14 < tL_inputMediaPaidMedia2.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia2.extended_media.get(i14) == inputMedia22) {
                                                                tL_inputMediaPaidMedia2.extended_media.set(i14, tL_inputMediaDocument);
                                                            } else {
                                                                i14++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (z14) {
                                                TLRPC.InputMedia inputMedia7 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                                                if (inputMedia7 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll2 = (TLRPC.TL_inputMediaPoll) inputMedia7;
                                                    sh.d.k(tL_inputMediaPoll2, sh.d.a(tL_inputMediaPoll2, inputMedia22), tL_inputMediaDocument);
                                                }
                                            }
                                        }
                                        ezVar2.t0(qyVar32, false);
                                        break;
                                    }
                                }
                                tL_inputMediaDocument = null;
                                qy qyVar322 = qyVar2;
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
