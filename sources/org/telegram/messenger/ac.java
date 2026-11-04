package org.telegram.messenger;

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class ac {
    public int a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public long e;
    public TLRPC.TL_fileLocationToBeDeprecated f;
    public String g;
    public wv h;
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
    public e20 v;

    public static ac a(int i3, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat == null || (chatPhoto = chat.photo) == null) {
            return null;
        }
        if (i3 == 2) {
            if (chatPhoto.stripped_thumb == null) {
                return null;
            }
            ac acVar = new ac();
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
            acVar.k = tL_photoStrippedSize;
            tL_photoStrippedSize.type = "s";
            tL_photoStrippedSize.bytes = chat.photo.stripped_thumb;
            return acVar;
        }
        TLRPC.FileLocation fileLocation = i3 == 0 ? chatPhoto.photo_big : chatPhoto.photo_small;
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
        ac h = h(fileLocation, 0, null, null, inputPeer, i3, i10, null, null);
        h.s = chat.photo.photo_id;
        return h;
    }

    public static ac b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        ac acVar = new ac();
        acVar.i = document;
        acVar.c = document.key;
        acVar.d = document.iv;
        acVar.r = document.size;
        return acVar;
    }

    public static ac c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            ac acVar = new ac();
            acVar.k = photoSize;
            return acVar;
        }
        if (photoSize == null || document == null) {
            return null;
        }
        return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
    }

    public static ac d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize == null || document == null) {
            return null;
        }
        ac h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
        if ("f".equals(videoSize.type)) {
            h.p = 1;
            return h;
        }
        h.p = 2;
        return h;
    }

    public static ac e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        ac acVar = new ac();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        acVar.f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return acVar;
    }

    public static ac f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
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
        ac acVar = new ac();
        acVar.k = photoSize;
        return acVar;
    }

    public static ac g(String str) {
        if (str == null) {
            return null;
        }
        ac acVar = new ac();
        acVar.g = str;
        return acVar;
    }

    public static ac h(TLRPC.FileLocation fileLocation, int i3, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i10, int i11, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation == null) {
            return null;
        }
        if (photo == null && inputPeer == null && inputStickerSet == null && document == null) {
            return null;
        }
        ac acVar = new ac();
        acVar.a = i11;
        acVar.l = photo;
        acVar.r = i3;
        acVar.n = inputPeer;
        acVar.m = i10;
        acVar.o = inputStickerSet;
        if (!(fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated)) {
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            acVar.f = tL_fileLocationToBeDeprecated;
            tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
            tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
            tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
            acVar.a = fileLocation.dc_id;
            acVar.b = fileLocation.file_reference;
            acVar.c = fileLocation.key;
            acVar.d = fileLocation.iv;
            acVar.e = fileLocation.secret;
            return acVar;
        }
        acVar.f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
        if (photo != null) {
            acVar.b = photo.file_reference;
            acVar.e = photo.access_hash;
            acVar.s = photo.id;
            acVar.u = str;
            return acVar;
        }
        if (document != null) {
            acVar.b = document.file_reference;
            acVar.e = document.access_hash;
            acVar.t = document.id;
            acVar.u = str;
        }
        return acVar;
    }

    public static ac i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            ac acVar = new ac();
            acVar.k = photoSize;
            return acVar;
        }
        if (photoSize == null || photo == null) {
            return null;
        }
        int i3 = photo.dc_id;
        if (i3 == 0) {
            i3 = photoSize.location.dc_id;
        }
        return h(photoSize.location, photoSize.size, photo, null, null, 1, i3, null, photoSize.type);
    }

    public static ac j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize == null || photo == null) {
            return null;
        }
        ac h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
        h.p = 2;
        if ((videoSize.flags & 1) != 0) {
            h.j = (int) (videoSize.video_start_ts * 1000.0d);
        }
        return h;
    }

    public static ac k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i3) {
        TLRPC.InputStickerSet inputStickerSet;
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            ac acVar = new ac();
            acVar.k = photoSize;
            return acVar;
        }
        if (photoSize == null || document == null) {
            return null;
        }
        Pattern pattern = li.S1;
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
        ac h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
        if (photoSize.type.equalsIgnoreCase("a")) {
            h.p = 1;
        } else if (photoSize.type.equalsIgnoreCase("v")) {
            h.p = 2;
        }
        h.q = i3;
        return h;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ac l(int i3, int i10, TLRPC.User user) {
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
                hp.s1(i3);
                if (hp.B2(user) && user.photo.has_video) {
                    TLRPC.UserFull b22 = hp.s1(i3).b2(user.id);
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
                        tL_inputPeerUser.peer = hp.s1(i3).j1(user.fromMessageDialogId);
                        tL_inputPeerUser.msg_id = user.fromMessageId;
                    }
                    TLRPC.InputPeer inputPeer = tL_inputPeerUser;
                    int i12 = user.photo.dc_id;
                    if (i12 == 0) {
                        i12 = fileLocation.dc_id;
                    }
                    ac h = h(fileLocation, 0, null, null, inputPeer, i10, i12, null, null);
                    h.s = user.photo.photo_id;
                    return h;
                }
            } else if (userProfilePhoto.stripped_thumb != null) {
                ac acVar = new ac();
                TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                acVar.k = tL_photoStrippedSize;
                tL_photoStrippedSize.type = "s";
                tL_photoStrippedSize.bytes = user.photo.stripped_thumb;
                return acVar;
            }
        }
        return null;
    }

    public static ac m(int i3, int i10, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i3, i10, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i10, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static ac n(TLRPC.User user) {
        return m(h10.t0, 2, user);
    }

    public static ac o(String str) {
        if (str == null) {
            return null;
        }
        ac acVar = new ac();
        acVar.g = str;
        acVar.p = 2;
        return acVar;
    }

    public static ac p(e20 e20Var) {
        if (e20Var == null) {
            return null;
        }
        ac acVar = new ac();
        if (e20Var.f) {
            acVar.g = e20Var.a;
            return acVar;
        }
        acVar.v = e20Var;
        acVar.r = e20Var.d;
        return acVar;
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
        ac acVar;
        TLRPC.Message message;
        if (!(obj instanceof TLRPC.WebPage)) {
            if (obj instanceof zi) {
                zi ziVar = (zi) obj;
                if (ziVar.D != 29) {
                    TLRPC.Message message2 = ziVar.k;
                    if (message2 != null) {
                    }
                }
            }
            str = "stripped" + r8.o(obj);
            if (r2.a && (obj instanceof zi) && (message = ((zi) obj).k) != null && message.rich_message != null) {
                StringBuilder u10 = a1.g.u("[richmedia] strippedKey=", str, " fullObject=");
                u10.append(obj2 != null ? "null" : obj2.getClass().getSimpleName());
                u10.append(" stripped=");
                k2.p1.w(obj3 != null ? obj3.getClass().getSimpleName() : "null", u10);
            }
            return str;
        }
        if (!(obj2 instanceof ac) || ((obj4 = (acVar = (ac) obj2).i) == null && (obj4 = acVar.k) == null && (obj4 = acVar.l) == null)) {
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
            StringBuilder u102 = a1.g.u("[richmedia] strippedKey=", str, " fullObject=");
            u102.append(obj2 != null ? "null" : obj2.getClass().getSimpleName());
            u102.append(" stripped=");
            k2.p1.w(obj3 != null ? obj3.getClass().getSimpleName() : "null", u102);
        }
        return str;
    }

    public final String q(Object obj, ac acVar, boolean z10) {
        if (this.h != null) {
            return this.h.b.dc_id + "_" + this.h.b.id;
        }
        TLRPC.PhotoSize photoSize = this.k;
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize.bytes.length <= 0) {
                return null;
            }
            if (acVar == null) {
                acVar = this;
            }
            return s(obj, acVar, photoSize);
        }
        if (this.f != null) {
            return this.f.volume_id + "_" + this.f.local_id;
        }
        e20 e20Var = this.v;
        if (e20Var != null) {
            return Utilities.a(e20Var.a);
        }
        TLRPC.Document document = this.i;
        if (document == null) {
            String str = this.g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        }
        if (z10 || !(document instanceof s5)) {
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
        int i3;
        TLRPC.PhotoSize photoSize = this.k;
        if (photoSize == null) {
            wv wvVar = this.h;
            if (wvVar != null) {
                TLRPC.TL_secureFile tL_secureFile = wvVar.b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.i;
                if (document != null) {
                    return document.size;
                }
                e20 e20Var = this.v;
                if (e20Var != null) {
                    i3 = e20Var.d;
                }
            }
            return this.r;
        }
        i3 = photoSize.size;
        return i3;
    }
}
