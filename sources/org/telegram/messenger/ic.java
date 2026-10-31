package org.telegram.messenger;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ic {
    public int a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public long e;
    public TLRPC.TL_fileLocationToBeDeprecated f;
    public String g;
    public pw h;
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
    public b30 v;

    public static ic a(int i10, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat == null || (chatPhoto = chat.photo) == null) {
            return null;
        }
        if (i10 == 2) {
            if (chatPhoto.stripped_thumb == null) {
                return null;
            }
            ic icVar = new ic();
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
            icVar.k = tL_photoStrippedSize;
            tL_photoStrippedSize.type = "s";
            tL_photoStrippedSize.bytes = chat.photo.stripped_thumb;
            return icVar;
        }
        TLRPC.FileLocation fileLocation = i10 == 0 ? chatPhoto.photo_big : chatPhoto.photo_small;
        if (fileLocation == null) {
            return null;
        }
        if (!w3.T(chat)) {
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
        int i11 = chat.photo.dc_id;
        if (i11 == 0) {
            i11 = fileLocation.dc_id;
        }
        ic h = h(fileLocation, 0, null, null, inputPeer, i10, i11, null, null);
        h.s = chat.photo.photo_id;
        return h;
    }

    public static ic b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        ic icVar = new ic();
        icVar.i = document;
        icVar.c = document.key;
        icVar.d = document.iv;
        icVar.r = document.size;
        return icVar;
    }

    public static ic c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            ic icVar = new ic();
            icVar.k = photoSize;
            return icVar;
        }
        if (photoSize == null || document == null) {
            return null;
        }
        return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
    }

    public static ic d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize == null || document == null) {
            return null;
        }
        ic h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
        if ("f".equals(videoSize.type)) {
            h.p = 1;
            return h;
        }
        h.p = 2;
        return h;
    }

    public static ic e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        ic icVar = new ic();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        icVar.f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return icVar;
    }

    public static ic f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
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
        ic icVar = new ic();
        icVar.k = photoSize;
        return icVar;
    }

    public static ic g(String str) {
        if (str == null) {
            return null;
        }
        ic icVar = new ic();
        icVar.g = str;
        return icVar;
    }

    public static ic h(TLRPC.FileLocation fileLocation, int i10, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i11, int i12, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation == null) {
            return null;
        }
        if (photo == null && inputPeer == null && inputStickerSet == null && document == null) {
            return null;
        }
        ic icVar = new ic();
        icVar.a = i12;
        icVar.l = photo;
        icVar.r = i10;
        icVar.n = inputPeer;
        icVar.m = i11;
        icVar.o = inputStickerSet;
        if (!(fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated)) {
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            icVar.f = tL_fileLocationToBeDeprecated;
            tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
            tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
            tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
            icVar.a = fileLocation.dc_id;
            icVar.b = fileLocation.file_reference;
            icVar.c = fileLocation.key;
            icVar.d = fileLocation.iv;
            icVar.e = fileLocation.secret;
            return icVar;
        }
        icVar.f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
        if (photo != null) {
            icVar.b = photo.file_reference;
            icVar.e = photo.access_hash;
            icVar.s = photo.id;
            icVar.u = str;
            return icVar;
        }
        if (document != null) {
            icVar.b = document.file_reference;
            icVar.e = document.access_hash;
            icVar.t = document.id;
            icVar.u = str;
        }
        return icVar;
    }

    public static ic i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            ic icVar = new ic();
            icVar.k = photoSize;
            return icVar;
        }
        if (photoSize == null || photo == null) {
            return null;
        }
        int i10 = photo.dc_id;
        if (i10 == 0) {
            i10 = photoSize.location.dc_id;
        }
        return h(photoSize.location, photoSize.size, photo, null, null, 1, i10, null, photoSize.type);
    }

    public static ic j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize == null || photo == null) {
            return null;
        }
        ic h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
        h.p = 2;
        if ((videoSize.flags & 1) != 0) {
            h.j = (int) (videoSize.video_start_ts * 1000.0d);
        }
        return h;
    }

    public static ic k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i10) {
        TLRPC.InputStickerSet inputStickerSet;
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            ic icVar = new ic();
            icVar.k = photoSize;
            return icVar;
        }
        if (photoSize == null || document == null) {
            return null;
        }
        Pattern pattern = ui.R1;
        int i11 = 0;
        while (true) {
            if (i11 >= document.attributes.size()) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                TLRPC.InputStickerSet inputStickerSet2 = documentAttribute.stickerset;
                if (!(inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                    inputStickerSet = inputStickerSet2;
                }
            } else {
                i11++;
            }
        }
        inputStickerSet = null;
        if (inputStickerSet == null) {
            return null;
        }
        ic h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
        if (photoSize.type.equalsIgnoreCase("a")) {
            h.p = 1;
        } else if (photoSize.type.equalsIgnoreCase("v")) {
            h.p = 2;
        }
        h.q = i10;
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ic l(int i10, int i11, TLRPC.User user) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList;
        ArrayList<TLRPC.VideoSize> arrayList2;
        ArrayList<TLRPC.VideoSize> arrayList3;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.VideoSize> arrayList4;
        TLRPC.InputPeer tL_inputPeerUser;
        if (user != null && (userProfilePhoto = user.photo) != null) {
            if (i11 == 4 || i11 == 3) {
                vp.r1(i10);
                if (vp.A2(user) && user.photo.has_video) {
                    TLRPC.UserFull a2 = vp.r1(i10).a2(user.id);
                    if (a2 != null) {
                        if (!user.photo.personal || (photo2 = a2.personal_photo) == null || (arrayList4 = photo2.video_sizes) == null || arrayList4.isEmpty()) {
                            TLRPC.Photo photo3 = a2.profile_photo;
                            if (photo3 == null || photo3.id != user.photo.photo_id || (arrayList3 = photo3.video_sizes) == null || arrayList3.isEmpty()) {
                                TLRPC.Photo photo4 = a2.fallback_photo;
                                if (photo4 == null || photo4.id != user.photo.photo_id || (arrayList2 = photo4.video_sizes) == null || arrayList2.isEmpty()) {
                                    TLRPC.Photo photo5 = a2.profile_photo;
                                    if (photo5 != null && (arrayList = photo5.video_sizes) != null && !arrayList.isEmpty()) {
                                        photo = a2.profile_photo;
                                    }
                                } else {
                                    photo = a2.fallback_photo;
                                }
                            } else {
                                photo = a2.profile_photo;
                            }
                        } else {
                            photo = a2.personal_photo;
                        }
                        if (photo != null) {
                            if (i11 == 4) {
                                return j(b8.x(1000, photo.video_sizes), photo);
                            }
                            TLRPC.VideoSize x10 = b8.x(100, photo.video_sizes);
                            int i12 = 0;
                            while (true) {
                                if (i12 >= photo.video_sizes.size()) {
                                    break;
                                }
                                if ("p".equals(photo.video_sizes.get(i12).type)) {
                                    x10 = photo.video_sizes.get(i12);
                                    break;
                                }
                                i12++;
                            }
                            return j(x10, photo);
                        }
                    }
                    photo = null;
                    if (photo != null) {
                    }
                }
            } else if (i11 != 2) {
                TLRPC.FileLocation fileLocation = i11 == 0 ? userProfilePhoto.photo_big : userProfilePhoto.photo_small;
                if (fileLocation != null) {
                    if (user.access_hash != 0) {
                        tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_inputPeerUser.user_id = user.id;
                        tL_inputPeerUser.access_hash = user.access_hash;
                    } else if (user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
                        tL_inputPeerUser = new TLRPC.TL_inputPeerUserFromMessage();
                        tL_inputPeerUser.user_id = user.id;
                        tL_inputPeerUser.peer = vp.r1(i10).i1(user.fromMessageDialogId);
                        tL_inputPeerUser.msg_id = user.fromMessageId;
                    }
                    TLRPC.InputPeer inputPeer = tL_inputPeerUser;
                    int i13 = user.photo.dc_id;
                    if (i13 == 0) {
                        i13 = fileLocation.dc_id;
                    }
                    ic h = h(fileLocation, 0, null, null, inputPeer, i11, i13, null, null);
                    h.s = user.photo.photo_id;
                    return h;
                }
            } else if (userProfilePhoto.stripped_thumb != null) {
                ic icVar = new ic();
                TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                icVar.k = tL_photoStrippedSize;
                tL_photoStrippedSize.type = "s";
                tL_photoStrippedSize.bytes = user.photo.stripped_thumb;
                return icVar;
            }
        }
        return null;
    }

    public static ic m(int i10, int i11, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i10, i11, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i11, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static ic n(TLRPC.User user) {
        return m(d20.s0, 2, user);
    }

    public static ic o(String str) {
        if (str == null) {
            return null;
        }
        ic icVar = new ic();
        icVar.g = str;
        icVar.p = 2;
        return icVar;
    }

    public static ic p(b30 b30Var) {
        if (b30Var == null) {
            return null;
        }
        ic icVar = new ic();
        if (b30Var.f) {
            icVar.g = b30Var.a;
            return icVar;
        }
        icVar.v = b30Var;
        icVar.r = b30Var.d;
        return icVar;
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
        ic icVar;
        TLRPC.Message message;
        if (!(obj instanceof TLRPC.WebPage)) {
            if (obj instanceof jj) {
                jj jjVar = (jj) obj;
                if (jjVar.D != 29) {
                    TLRPC.Message message2 = jjVar.k;
                    if (message2 != null) {
                    }
                }
            }
            str = "stripped" + w8.o(obj);
            if (v2.a && (obj instanceof jj) && (message = ((jj) obj).k) != null && message.rich_message != null) {
                StringBuilder u10 = a1.g.u("[richmedia] strippedKey=", str, " fullObject=");
                u10.append(obj2 != null ? "null" : obj2.getClass().getSimpleName());
                u10.append(" stripped=");
                a1.g.z(obj3 != null ? obj3.getClass().getSimpleName() : "null", u10);
            }
            return str;
        }
        if (!(obj2 instanceof ic) || ((obj4 = (icVar = (ic) obj2).i) == null && (obj4 = icVar.k) == null && (obj4 = icVar.l) == null)) {
            obj4 = obj2;
        }
        if (obj4 == null) {
            str = "stripped" + w8.o(obj) + "_" + obj3;
        } else if (obj4 instanceof TLRPC.Document) {
            str = "stripped" + w8.o(obj) + "_" + ((TLRPC.Document) obj4).id;
        } else if (obj4 instanceof TLRPC.Photo) {
            str = "stripped" + w8.o(obj) + "_" + ((TLRPC.Photo) obj4).id;
        } else if (obj4 instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
            if (photoSize.location != null) {
                str = "stripped" + w8.o(obj) + "_" + photoSize.location.local_id + "_" + photoSize.location.volume_id;
            } else {
                str = "stripped" + w8.o(obj);
            }
        } else {
            if (obj4 instanceof TLRPC.FileLocation) {
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) obj4;
                str = "stripped" + w8.o(obj) + "_" + fileLocation.local_id + "_" + fileLocation.volume_id;
            }
            str = "stripped" + w8.o(obj);
        }
        if (v2.a) {
            StringBuilder u102 = a1.g.u("[richmedia] strippedKey=", str, " fullObject=");
            u102.append(obj2 != null ? "null" : obj2.getClass().getSimpleName());
            u102.append(" stripped=");
            a1.g.z(obj3 != null ? obj3.getClass().getSimpleName() : "null", u102);
        }
        return str;
    }

    public final String q(Object obj, ic icVar, boolean z10) {
        if (this.h != null) {
            return this.h.b.dc_id + "_" + this.h.b.id;
        }
        TLRPC.PhotoSize photoSize = this.k;
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize.bytes.length <= 0) {
                return null;
            }
            if (icVar == null) {
                icVar = this;
            }
            return s(obj, icVar, photoSize);
        }
        if (this.f != null) {
            return this.f.volume_id + "_" + this.f.local_id;
        }
        b30 b30Var = this.v;
        if (b30Var != null) {
            return Utilities.a(b30Var.a);
        }
        TLRPC.Document document = this.i;
        if (document == null) {
            String str = this.g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        }
        if (z10 || !(document instanceof u5)) {
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
        TLRPC.ThemeSettings themeSettings = ((u5) document).a;
        sb2.append(org.telegram.ui.ActionBar.t6.r0(themeSettings));
        sb2.append("_");
        sb2.append(themeSettings.accent_color);
        sb2.append("_");
        sb2.append(themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() : 0);
        sb2.append("_");
        sb2.append(themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() : 0);
        return sb2.toString();
    }

    public final long r() {
        int i10;
        TLRPC.PhotoSize photoSize = this.k;
        if (photoSize == null) {
            pw pwVar = this.h;
            if (pwVar != null) {
                TLRPC.TL_secureFile tL_secureFile = pwVar.b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.i;
                if (document != null) {
                    return document.size;
                }
                b30 b30Var = this.v;
                if (b30Var != null) {
                    i10 = b30Var.d;
                }
            }
            return this.r;
        }
        i10 = photoSize.size;
        return i10;
    }
}
