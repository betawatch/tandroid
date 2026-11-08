package org.telegram.messenger;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class hc {
    public int a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public long e;
    public TLRPC.TL_fileLocationToBeDeprecated f;
    public String g;
    public ew h;
    public TLRPC.Document i;
    public long j;
    public TLRPC.PhotoSize k;
    public TLRPC.Photo l;
    public int m;
    public TLRPC.InputPeer n;
    public TLRPC.InputStickerSet o;
    public int p;
    public int q;
    public long r;
    public long s;
    public long t;
    public String u;
    public m20 v;

    public static hc a(int i7, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat == null || (chatPhoto = chat.photo) == null) {
            return null;
        }
        if (i7 == 2) {
            if (chatPhoto.stripped_thumb == null) {
                return null;
            }
            hc hcVar = new hc();
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
            hcVar.k = tL_photoStrippedSize;
            tL_photoStrippedSize.type = "s";
            tL_photoStrippedSize.bytes = chat.photo.stripped_thumb;
            return hcVar;
        }
        TLRPC.FileLocation fileLocation = i7 == 0 ? chatPhoto.photo_big : chatPhoto.photo_small;
        if (fileLocation == null) {
            return null;
        }
        if (!t3.T(chat)) {
            tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
            tL_inputPeerChat.chat_id = chat.id;
        } else {
            if (chat.access_hash == 0) {
                return null;
            }
            tL_inputPeerChat = new TLRPC.TL_inputPeerChannel();
            tL_inputPeerChat.channel_id = chat.id;
            tL_inputPeerChat.access_hash = chat.access_hash;
        }
        TLRPC.InputPeer inputPeer = tL_inputPeerChat;
        int i10 = chat.photo.dc_id;
        if (i10 == 0) {
            i10 = fileLocation.dc_id;
        }
        hc h = h(fileLocation, 0, null, null, inputPeer, i7, i10, null, null);
        h.s = chat.photo.photo_id;
        return h;
    }

    public static hc b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        hc hcVar = new hc();
        hcVar.i = document;
        hcVar.c = document.key;
        hcVar.d = document.iv;
        hcVar.r = document.size;
        return hcVar;
    }

    public static hc c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            hc hcVar = new hc();
            hcVar.k = photoSize;
            return hcVar;
        }
        if (photoSize == null || document == null) {
            return null;
        }
        return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
    }

    public static hc d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize == null || document == null) {
            return null;
        }
        hc h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
        if ("f".equals(videoSize.type)) {
            h.p = 1;
            return h;
        }
        h.p = 2;
        return h;
    }

    public static hc e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        hc hcVar = new hc();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        hcVar.f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return hcVar;
    }

    public static hc f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Photo) {
            return i(photoSize, (TLRPC.Photo) tLObject);
        }
        if (tLObject instanceof TLRPC.Document) {
            return c(photoSize, (TLRPC.Document) tLObject);
        }
        if (!(tLObject instanceof TLRPC.Message)) {
            return null;
        }
        if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
            return null;
        }
        hc hcVar = new hc();
        hcVar.k = photoSize;
        return hcVar;
    }

    public static hc g(String str) {
        if (str == null) {
            return null;
        }
        hc hcVar = new hc();
        hcVar.g = str;
        return hcVar;
    }

    public static hc h(TLRPC.FileLocation fileLocation, int i7, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i10, int i11, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation == null) {
            return null;
        }
        if (photo == null && inputPeer == null && inputStickerSet == null && document == null) {
            return null;
        }
        hc hcVar = new hc();
        hcVar.a = i11;
        hcVar.l = photo;
        hcVar.r = i7;
        hcVar.n = inputPeer;
        hcVar.m = i10;
        hcVar.o = inputStickerSet;
        if (!(fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated)) {
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            hcVar.f = tL_fileLocationToBeDeprecated;
            tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
            tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
            tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
            hcVar.a = fileLocation.dc_id;
            hcVar.b = fileLocation.file_reference;
            hcVar.c = fileLocation.key;
            hcVar.d = fileLocation.iv;
            hcVar.e = fileLocation.secret;
            return hcVar;
        }
        hcVar.f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
        if (photo != null) {
            hcVar.b = photo.file_reference;
            hcVar.e = photo.access_hash;
            hcVar.s = photo.id;
            hcVar.u = str;
            return hcVar;
        }
        if (document != null) {
            hcVar.b = document.file_reference;
            hcVar.e = document.access_hash;
            hcVar.t = document.id;
            hcVar.u = str;
        }
        return hcVar;
    }

    public static hc i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            hc hcVar = new hc();
            hcVar.k = photoSize;
            return hcVar;
        }
        if (photoSize == null || photo == null) {
            return null;
        }
        int i7 = photo.dc_id;
        if (i7 == 0) {
            i7 = photoSize.location.dc_id;
        }
        return h(photoSize.location, photoSize.size, photo, null, null, 1, i7, null, photoSize.type);
    }

    public static hc j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize == null || photo == null) {
            return null;
        }
        hc h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
        h.p = 2;
        if ((videoSize.flags & 1) != 0) {
            h.j = (int) (videoSize.video_start_ts * 1000.0d);
        }
        return h;
    }

    public static hc k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i7) {
        TLRPC.InputStickerSet inputStickerSet;
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            hc hcVar = new hc();
            hcVar.k = photoSize;
            return hcVar;
        }
        if (photoSize == null || document == null) {
            return null;
        }
        Pattern pattern = ui.R1;
        int i10 = 0;
        while (true) {
            if (i10 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.InputStickerSet inputStickerSet2 = documentAttribute.stickerset;
                if (!(inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    inputStickerSet = inputStickerSet2;
                }
            } else {
                i10++;
            }
        }
        inputStickerSet = null;
        if (inputStickerSet == null) {
            return null;
        }
        hc h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
        if (photoSize.type.equalsIgnoreCase("a")) {
            h.p = 1;
        } else if (photoSize.type.equalsIgnoreCase("v")) {
            h.p = 2;
        }
        h.q = i7;
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static hc l(int i7, int i10, TLRPC.User user) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList;
        ArrayList<TLRPC.VideoSize> arrayList2;
        ArrayList<TLRPC.VideoSize> arrayList3;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.VideoSize> arrayList4;
        TLRPC.InputPeer tL_inputPeerUser;
        if (user != null && (userProfilePhoto = user.photo) != null) {
            if (i10 == 4 || i10 == 3) {
                qp.s1(i7);
                if (qp.B2(user) && user.photo.has_video) {
                    TLRPC.UserFull b22 = qp.s1(i7).b2(user.id);
                    if (b22 != null) {
                        if (!user.photo.personal || (photo2 = b22.personal_photo) == null || (arrayList4 = photo2.video_sizes) == null || arrayList4.isEmpty()) {
                            TLRPC.Photo photo3 = b22.profile_photo;
                            if (photo3 == null || photo3.id != user.photo.photo_id || (arrayList3 = photo3.video_sizes) == null || arrayList3.isEmpty()) {
                                TLRPC.Photo photo4 = b22.fallback_photo;
                                if (photo4 == null || photo4.id != user.photo.photo_id || (arrayList2 = photo4.video_sizes) == null || arrayList2.isEmpty()) {
                                    TLRPC.Photo photo5 = b22.profile_photo;
                                    if (photo5 != null && (arrayList = photo5.video_sizes) != null && !arrayList.isEmpty()) {
                                        photo = b22.profile_photo;
                                    }
                                } else {
                                    photo = b22.fallback_photo;
                                }
                            } else {
                                photo = b22.profile_photo;
                            }
                        } else {
                            photo = b22.personal_photo;
                        }
                        if (photo != null) {
                            if (i10 == 4) {
                                return j(w7.x(1000, photo.video_sizes), photo);
                            }
                            TLRPC.VideoSize x10 = w7.x(100, photo.video_sizes);
                            int i11 = 0;
                            while (true) {
                                if (i11 >= photo.video_sizes.size()) {
                                    break;
                                }
                                if ("p".equals(photo.video_sizes.get(i11).type)) {
                                    x10 = photo.video_sizes.get(i11);
                                    break;
                                }
                                i11++;
                            }
                            return j(x10, photo);
                        }
                    }
                    photo = null;
                    if (photo != null) {
                    }
                }
            } else if (i10 != 2) {
                TLRPC.FileLocation fileLocation = i10 == 0 ? userProfilePhoto.photo_big : userProfilePhoto.photo_small;
                if (fileLocation != null) {
                    if (user.access_hash != 0) {
                        tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_inputPeerUser.user_id = user.id;
                        tL_inputPeerUser.access_hash = user.access_hash;
                    } else if (user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
                        tL_inputPeerUser = new TLRPC.TL_inputPeerUserFromMessage();
                        tL_inputPeerUser.user_id = user.id;
                        tL_inputPeerUser.peer = qp.s1(i7).j1(user.fromMessageDialogId);
                        tL_inputPeerUser.msg_id = user.fromMessageId;
                    }
                    TLRPC.InputPeer inputPeer = tL_inputPeerUser;
                    int i12 = user.photo.dc_id;
                    if (i12 == 0) {
                        i12 = fileLocation.dc_id;
                    }
                    hc h = h(fileLocation, 0, null, null, inputPeer, i10, i12, null, null);
                    h.s = user.photo.photo_id;
                    return h;
                }
            } else if (userProfilePhoto.stripped_thumb != null) {
                hc hcVar = new hc();
                TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                hcVar.k = tL_photoStrippedSize;
                tL_photoStrippedSize.type = "s";
                tL_photoStrippedSize.bytes = user.photo.stripped_thumb;
                return hcVar;
            }
        }
        return null;
    }

    public static hc m(int i7, int i10, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i7, i10, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i10, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static hc n(TLRPC.User user) {
        return m(p10.s0, 2, user);
    }

    public static hc o(String str) {
        if (str == null) {
            return null;
        }
        hc hcVar = new hc();
        hcVar.g = str;
        hcVar.p = 2;
        return hcVar;
    }

    public static hc p(m20 m20Var) {
        if (m20Var == null) {
            return null;
        }
        hc hcVar = new hc();
        if (m20Var.f) {
            hcVar.g = m20Var.a;
            return hcVar;
        }
        hcVar.v = m20Var;
        hcVar.r = m20Var.d;
        return hcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r0.rich_message == null) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String s(Object obj, Object obj2, Object obj3) {
        Object obj4;
        String str;
        hc hcVar;
        TLRPC.Message message;
        if (!(obj instanceof TLRPC.WebPage)) {
            if (obj instanceof ij) {
                ij ijVar = (ij) obj;
                if (ijVar.D != 29) {
                    TLRPC.Message message2 = ijVar.k;
                    if (message2 != null) {
                    }
                }
            }
            str = "stripped" + r8.o(obj);
            if (r2.a && (obj instanceof ij) && (message = ((ij) obj).k) != null && message.rich_message != null) {
                StringBuilder u10 = a8.p0.u("[richmedia] strippedKey=", str, " fullObject=");
                u10.append(obj2 != null ? "null" : obj2.getClass().getSimpleName());
                u10.append(" stripped=");
                org.telegram.ui.Cells.f1.u(obj3 != null ? obj3.getClass().getSimpleName() : "null", u10);
            }
            return str;
        }
        if (!(obj2 instanceof hc) || ((obj4 = (hcVar = (hc) obj2).i) == null && (obj4 = hcVar.k) == null && (obj4 = hcVar.l) == null)) {
            obj4 = obj2;
        }
        if (obj4 == null) {
            str = "stripped" + r8.o(obj) + "_" + obj3;
        } else if (obj4 instanceof TLRPC.Document) {
            str = "stripped" + r8.o(obj) + "_" + ((TLRPC.Document) obj4).id;
        } else if (obj4 instanceof TLRPC.Photo) {
            str = "stripped" + r8.o(obj) + "_" + ((TLRPC.Photo) obj4).id;
        } else if (obj4 instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
            if (photoSize.location != null) {
                str = "stripped" + r8.o(obj) + "_" + photoSize.location.local_id + "_" + photoSize.location.volume_id;
            } else {
                str = "stripped" + r8.o(obj);
            }
        } else {
            if (obj4 instanceof TLRPC.FileLocation) {
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) obj4;
                str = "stripped" + r8.o(obj) + "_" + fileLocation.local_id + "_" + fileLocation.volume_id;
            }
            str = "stripped" + r8.o(obj);
        }
        if (r2.a) {
            StringBuilder u102 = a8.p0.u("[richmedia] strippedKey=", str, " fullObject=");
            u102.append(obj2 != null ? "null" : obj2.getClass().getSimpleName());
            u102.append(" stripped=");
            org.telegram.ui.Cells.f1.u(obj3 != null ? obj3.getClass().getSimpleName() : "null", u102);
        }
        return str;
    }

    public final String q(Object obj, hc hcVar, boolean z9) {
        if (this.h != null) {
            return this.h.b.dc_id + "_" + this.h.b.id;
        }
        TLRPC.PhotoSize photoSize = this.k;
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize.bytes.length <= 0) {
                return null;
            }
            if (hcVar == null) {
                hcVar = this;
            }
            return s(obj, hcVar, photoSize);
        }
        if (this.f != null) {
            return this.f.volume_id + "_" + this.f.local_id;
        }
        m20 m20Var = this.v;
        if (m20Var != null) {
            return Utilities.a(m20Var.a);
        }
        TLRPC.Document document = this.i;
        if (document == null) {
            String str = this.g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        }
        if (z9 || !(document instanceof s5)) {
            if (document.id == 0 || document.dc_id == 0) {
                return null;
            }
            return this.i.dc_id + "_" + this.i.id;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.i.dc_id);
        sb2.append("_");
        sb2.append(this.i.id);
        sb2.append("_");
        TLRPC.ThemeSettings themeSettings = ((s5) document).a;
        sb2.append(org.telegram.ui.ActionBar.k6.r0(themeSettings));
        sb2.append("_");
        sb2.append(themeSettings.accent_color);
        sb2.append("_");
        sb2.append(themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() : 0);
        sb2.append("_");
        sb2.append(themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() : 0);
        return sb2.toString();
    }

    public final long r() {
        int i7;
        TLRPC.PhotoSize photoSize = this.k;
        if (photoSize == null) {
            ew ewVar = this.h;
            if (ewVar != null) {
                TLRPC.TL_secureFile tL_secureFile = ewVar.b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.i;
                if (document != null) {
                    return document.size;
                }
                m20 m20Var = this.v;
                if (m20Var != null) {
                    i7 = m20Var.d;
                }
            }
            return this.r;
        }
        i7 = photoSize.size;
        return i7;
    }
}
