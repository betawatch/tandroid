package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_ephemeral;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class yx implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ rz b;
    public final /* synthetic */ TLRPC.InputMedia c;
    public final /* synthetic */ dz d;

    public /* synthetic */ yx(rz rzVar, TLRPC.InputMedia inputMedia, dz dzVar, int i10) {
        this.a = i10;
        this.b = rzVar;
        this.c = inputMedia;
        this.d = dzVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 0;
                final rz rzVar = this.b;
                final TLRPC.InputMedia inputMedia = this.c;
                final dz dzVar = this.d;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.iy
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        TLRPC.PhotoSize photoSize;
                        kj kjVar;
                        y20 y20Var;
                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument;
                        TLRPC.InputDocument inputDocument;
                        int i11 = i10;
                        TLRPC.InputMedia inputMedia2 = inputMedia;
                        TLObject tLObject2 = tLObject;
                        switch (i11) {
                            case 0:
                                rz rzVar2 = rzVar;
                                rzVar2.getClass();
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaPhoto;
                                dz dzVar2 = dzVar;
                                if (!z10) {
                                    dzVar2.c();
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
                                    TLRPC.InputMedia inputMedia3 = dzVar2.t;
                                    if (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                        inputMedia3.flags |= 64;
                                        inputMedia3.video_cover = tL_inputPhoto;
                                    }
                                    if (!dzVar2.p || inputMedia2.thumb != null || (photoSize = dzVar2.g) == null || photoSize.location == null || ((kjVar = dzVar2.m) != null && (y20Var = kjVar.p0) != null && y20Var.N)) {
                                        rzVar2.N(dzVar2.c, dzVar2.m, dzVar2.f, dzVar2, dzVar2.K, null, dzVar2.H);
                                        break;
                                    } else {
                                        rzVar2.M(dzVar2, -1);
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
                                        boolean z11 = v2.a;
                                        f8.b("set uploaded photo");
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
                                        boolean z12 = v2.a;
                                        f8.b("set uploaded document");
                                        tL_inputMediaDocument = tL_inputMediaDocument2;
                                    }
                                    dz dzVar3 = dzVar;
                                    if (tL_inputMediaDocument != null) {
                                        dzVar3.c();
                                        break;
                                    } else {
                                        int i12 = inputMedia2.ttl_seconds;
                                        if (i12 != 0) {
                                            tL_inputMediaDocument.ttl_seconds = i12;
                                            tL_inputMediaDocument.flags = 1 | tL_inputMediaDocument.flags;
                                        }
                                        TLObject tLObject3 = dzVar3.c;
                                        if (tLObject3 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject3;
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 < tL_messages_sendMultiMedia.multi_media.size()) {
                                                    if (tL_messages_sendMultiMedia.multi_media.get(i13).media == inputMedia2) {
                                                        tL_messages_sendMultiMedia.multi_media.get(i13).media = tL_inputMediaDocument;
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            }
                                        } else {
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_sendMedia;
                                            if (z13) {
                                                TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                                                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                                                    int i14 = 0;
                                                    while (true) {
                                                        if (i14 < tL_inputMediaPaidMedia.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia.extended_media.get(i14) == inputMedia2) {
                                                                tL_inputMediaPaidMedia.extended_media.set(i14, tL_inputMediaDocument);
                                                            } else {
                                                                i14++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (z13) {
                                                TLRPC.InputMedia inputMedia5 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                                                if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll = (TLRPC.TL_inputMediaPoll) inputMedia5;
                                                    ih.g.k(tL_inputMediaPoll, ih.g.a(tL_inputMediaPoll, inputMedia2), tL_inputMediaDocument);
                                                }
                                            }
                                            boolean z14 = tLObject3 instanceof TL_ephemeral.TL_sendMessage;
                                            if (z14) {
                                                TLRPC.InputMedia inputMedia6 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                                                if (inputMedia6 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia6;
                                                    int i15 = 0;
                                                    while (true) {
                                                        if (i15 < tL_inputMediaPaidMedia2.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia2.extended_media.get(i15) == inputMedia2) {
                                                                tL_inputMediaPaidMedia2.extended_media.set(i15, tL_inputMediaDocument);
                                                            } else {
                                                                i15++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (z14) {
                                                TLRPC.InputMedia inputMedia7 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                                                if (inputMedia7 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll2 = (TLRPC.TL_inputMediaPoll) inputMedia7;
                                                    ih.g.k(tL_inputMediaPoll2, ih.g.a(tL_inputMediaPoll2, inputMedia2), tL_inputMediaDocument);
                                                }
                                            }
                                        }
                                        rzVar.t0(dzVar3, false);
                                        break;
                                    }
                                }
                                tL_inputMediaDocument = null;
                                dz dzVar32 = dzVar;
                                if (tL_inputMediaDocument != null) {
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 1;
                final rz rzVar2 = this.b;
                final TLRPC.InputMedia inputMedia2 = this.c;
                final dz dzVar2 = this.d;
                i0.g3(new Runnable() { // from class: org.telegram.messenger.iy
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
                    /* JADX WARN: Removed duplicated region for block: B:68:0x0153  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void run() {
                        TLRPC.PhotoSize photoSize;
                        kj kjVar;
                        y20 y20Var;
                        TLRPC.TL_inputMediaDocument tL_inputMediaDocument;
                        TLRPC.InputDocument inputDocument;
                        int i112 = i11;
                        TLRPC.InputMedia inputMedia22 = inputMedia2;
                        TLObject tLObject2 = tLObject;
                        switch (i112) {
                            case 0:
                                rz rzVar22 = rzVar2;
                                rzVar22.getClass();
                                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaPhoto;
                                dz dzVar22 = dzVar2;
                                if (!z10) {
                                    dzVar22.c();
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
                                    TLRPC.InputMedia inputMedia3 = dzVar22.t;
                                    if (inputMedia3 instanceof TLRPC.TL_inputMediaUploadedDocument) {
                                        inputMedia3.flags |= 64;
                                        inputMedia3.video_cover = tL_inputPhoto;
                                    }
                                    if (!dzVar22.p || inputMedia22.thumb != null || (photoSize = dzVar22.g) == null || photoSize.location == null || ((kjVar = dzVar22.m) != null && (y20Var = kjVar.p0) != null && y20Var.N)) {
                                        rzVar22.N(dzVar22.c, dzVar22.m, dzVar22.f, dzVar22, dzVar22.K, null, dzVar22.H);
                                        break;
                                    } else {
                                        rzVar22.M(dzVar22, -1);
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
                                        boolean z11 = v2.a;
                                        f8.b("set uploaded photo");
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
                                        boolean z12 = v2.a;
                                        f8.b("set uploaded document");
                                        tL_inputMediaDocument = tL_inputMediaDocument2;
                                    }
                                    dz dzVar32 = dzVar2;
                                    if (tL_inputMediaDocument != null) {
                                        dzVar32.c();
                                        break;
                                    } else {
                                        int i12 = inputMedia22.ttl_seconds;
                                        if (i12 != 0) {
                                            tL_inputMediaDocument.ttl_seconds = i12;
                                            tL_inputMediaDocument.flags = 1 | tL_inputMediaDocument.flags;
                                        }
                                        TLObject tLObject3 = dzVar32.c;
                                        if (tLObject3 instanceof TLRPC.TL_messages_sendMultiMedia) {
                                            TLRPC.TL_messages_sendMultiMedia tL_messages_sendMultiMedia = (TLRPC.TL_messages_sendMultiMedia) tLObject3;
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 < tL_messages_sendMultiMedia.multi_media.size()) {
                                                    if (tL_messages_sendMultiMedia.multi_media.get(i13).media == inputMedia22) {
                                                        tL_messages_sendMultiMedia.multi_media.get(i13).media = tL_inputMediaDocument;
                                                    } else {
                                                        i13++;
                                                    }
                                                }
                                            }
                                        } else {
                                            boolean z13 = tLObject3 instanceof TLRPC.TL_messages_sendMedia;
                                            if (z13) {
                                                TLRPC.InputMedia inputMedia4 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                                                if (inputMedia4 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia = (TLRPC.TL_inputMediaPaidMedia) inputMedia4;
                                                    int i14 = 0;
                                                    while (true) {
                                                        if (i14 < tL_inputMediaPaidMedia.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia.extended_media.get(i14) == inputMedia22) {
                                                                tL_inputMediaPaidMedia.extended_media.set(i14, tL_inputMediaDocument);
                                                            } else {
                                                                i14++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (z13) {
                                                TLRPC.InputMedia inputMedia5 = ((TLRPC.TL_messages_sendMedia) tLObject3).media;
                                                if (inputMedia5 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll = (TLRPC.TL_inputMediaPoll) inputMedia5;
                                                    ih.g.k(tL_inputMediaPoll, ih.g.a(tL_inputMediaPoll, inputMedia22), tL_inputMediaDocument);
                                                }
                                            }
                                            boolean z14 = tLObject3 instanceof TL_ephemeral.TL_sendMessage;
                                            if (z14) {
                                                TLRPC.InputMedia inputMedia6 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                                                if (inputMedia6 instanceof TLRPC.TL_inputMediaPaidMedia) {
                                                    TLRPC.TL_inputMediaPaidMedia tL_inputMediaPaidMedia2 = (TLRPC.TL_inputMediaPaidMedia) inputMedia6;
                                                    int i15 = 0;
                                                    while (true) {
                                                        if (i15 < tL_inputMediaPaidMedia2.extended_media.size()) {
                                                            if (tL_inputMediaPaidMedia2.extended_media.get(i15) == inputMedia22) {
                                                                tL_inputMediaPaidMedia2.extended_media.set(i15, tL_inputMediaDocument);
                                                            } else {
                                                                i15++;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            if (z14) {
                                                TLRPC.InputMedia inputMedia7 = ((TL_ephemeral.TL_sendMessage) tLObject3).media;
                                                if (inputMedia7 instanceof TLRPC.TL_inputMediaPoll) {
                                                    TLRPC.TL_inputMediaPoll tL_inputMediaPoll2 = (TLRPC.TL_inputMediaPoll) inputMedia7;
                                                    ih.g.k(tL_inputMediaPoll2, ih.g.a(tL_inputMediaPoll2, inputMedia22), tL_inputMediaDocument);
                                                }
                                            }
                                        }
                                        rzVar2.t0(dzVar32, false);
                                        break;
                                    }
                                }
                                tL_inputMediaDocument = null;
                                dz dzVar322 = dzVar2;
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
