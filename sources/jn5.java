// default package

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class jn5 {
    public int a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public long e;
    public TLRPC.TL_fileLocationToBeDeprecated f;
    public String g;
    public oy9 h;
    public TLRPC.Document i;
    public long j;
    public TLRPC.PhotoSize k;
    public TLRPC.Photo l;
    public byte m;
    public TLRPC.InputPeer n;
    public TLRPC.InputStickerSet o;
    public byte p;
    public int q;
    public long r;
    public long s;
    public long t;
    public String u;
    public jxc v;

    public static jn5 a(int i, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat == null || (chatPhoto = chat.photo) == null) {
            return null;
        }
        if (i == 2) {
            if (chatPhoto.stripped_thumb == null) {
                return null;
            }
            jn5 jn5Var = new jn5();
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
            jn5Var.k = tL_photoStrippedSize;
            tL_photoStrippedSize.type = "s";
            tL_photoStrippedSize.bytes = chat.photo.stripped_thumb;
            return jn5Var;
        }
        TLRPC.FileLocation fileLocation = i == 0 ? chatPhoto.photo_big : chatPhoto.photo_small;
        if (fileLocation == null) {
            return null;
        }
        if (!xc2.T(chat)) {
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
        int i2 = chat.photo.dc_id;
        if (i2 == 0) {
            i2 = fileLocation.dc_id;
        }
        jn5 h = h(fileLocation, 0, null, null, inputPeer, i, i2, null, null);
        h.s = chat.photo.photo_id;
        return h;
    }

    public static jn5 b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        jn5 jn5Var = new jn5();
        jn5Var.i = document;
        jn5Var.c = document.key;
        jn5Var.d = document.iv;
        jn5Var.r = document.size;
        return jn5Var;
    }

    public static jn5 c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            jn5 jn5Var = new jn5();
            jn5Var.k = photoSize;
            return jn5Var;
        }
        if (photoSize == null || document == null) {
            return null;
        }
        return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
    }

    public static jn5 d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize == null || document == null) {
            return null;
        }
        jn5 h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
        if ("f".equals(videoSize.type)) {
            h.p = (byte) 1;
            return h;
        }
        h.p = (byte) 2;
        return h;
    }

    public static jn5 e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        jn5 jn5Var = new jn5();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        jn5Var.f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return jn5Var;
    }

    public static jn5 f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
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
        jn5 jn5Var = new jn5();
        jn5Var.k = photoSize;
        return jn5Var;
    }

    public static jn5 g(String str) {
        if (str == null) {
            return null;
        }
        jn5 jn5Var = new jn5();
        jn5Var.g = str;
        return jn5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jn5 h(TLRPC.FileLocation fileLocation, int i, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i2, int i3, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation == null) {
            return null;
        }
        if (photo == null && inputPeer == null && inputStickerSet == null && document == null) {
            return null;
        }
        jn5 jn5Var = new jn5();
        jn5Var.a = i3;
        jn5Var.l = photo;
        jn5Var.r = i;
        jn5Var.n = inputPeer;
        jn5Var.m = i2;
        jn5Var.o = inputStickerSet;
        if (!(fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated)) {
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            jn5Var.f = tL_fileLocationToBeDeprecated;
            tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
            tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
            tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
            jn5Var.a = fileLocation.dc_id;
            jn5Var.b = fileLocation.file_reference;
            jn5Var.c = fileLocation.key;
            jn5Var.d = fileLocation.iv;
            jn5Var.e = fileLocation.secret;
            return jn5Var;
        }
        jn5Var.f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
        if (photo != null) {
            jn5Var.b = photo.file_reference;
            jn5Var.e = photo.access_hash;
            jn5Var.s = photo.id;
            jn5Var.u = str;
            return jn5Var;
        }
        if (document != null) {
            jn5Var.b = document.file_reference;
            jn5Var.e = document.access_hash;
            jn5Var.t = document.id;
            jn5Var.u = str;
        }
        return jn5Var;
    }

    public static jn5 i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            jn5 jn5Var = new jn5();
            jn5Var.k = photoSize;
            return jn5Var;
        }
        if (photoSize == null || photo == null) {
            return null;
        }
        int i = photo.dc_id;
        if (i == 0) {
            i = photoSize.location.dc_id;
        }
        return h(photoSize.location, photoSize.size, photo, null, null, 1, i, null, photoSize.type);
    }

    public static jn5 j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize == null || photo == null) {
            return null;
        }
        jn5 h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
        h.p = (byte) 2;
        if ((videoSize.flags & 1) != 0) {
            h.j = (int) (videoSize.video_start_ts * 1000.0d);
        }
        return h;
    }

    public static jn5 k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i) {
        TLRPC.InputStickerSet inputStickerSet;
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            jn5 jn5Var = new jn5();
            jn5Var.k = photoSize;
            return jn5Var;
        }
        if (photoSize != null && document != null) {
            Pattern pattern = ls6.U1;
            int i2 = 0;
            while (true) {
                if (i2 >= document.attributes.size()) {
                    break;
                }
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                    TLRPC.InputStickerSet inputStickerSet2 = documentAttribute.stickerset;
                    if (!(inputStickerSet2 instanceof TLRPC.TL_inputStickerSetEmpty)) {
                        inputStickerSet = inputStickerSet2;
                    }
                } else {
                    i2++;
                }
            }
            inputStickerSet = null;
            if (inputStickerSet != null) {
                jn5 h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
                if (photoSize.type.equalsIgnoreCase("a")) {
                    h.p = (byte) 1;
                } else if (photoSize.type.equalsIgnoreCase("v")) {
                    h.p = (byte) 2;
                }
                h.q = i;
                return h;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jn5 l(int i, int i2, TLRPC.User user) {
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.Photo photo;
        ArrayList<TLRPC.VideoSize> arrayList;
        ArrayList<TLRPC.VideoSize> arrayList2;
        ArrayList<TLRPC.VideoSize> arrayList3;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.VideoSize> arrayList4;
        TLRPC.InputPeer tL_inputPeerUser;
        if (user != null && (userProfilePhoto = user.photo) != null) {
            if (i2 == 4 || i2 == 3) {
                uc7.s1(i);
                if (uc7.F2(user) && user.photo.has_video) {
                    TLRPC.UserFull Y1 = uc7.s1(i).Y1(user.id);
                    if (Y1 != null) {
                        if (!user.photo.personal || (photo2 = Y1.personal_photo) == null || (arrayList4 = photo2.video_sizes) == null || arrayList4.isEmpty()) {
                            TLRPC.Photo photo3 = Y1.profile_photo;
                            if (photo3 == null || photo3.id != user.photo.photo_id || (arrayList3 = photo3.video_sizes) == null || arrayList3.isEmpty()) {
                                TLRPC.Photo photo4 = Y1.fallback_photo;
                                if (photo4 == null || photo4.id != user.photo.photo_id || (arrayList2 = photo4.video_sizes) == null || arrayList2.isEmpty()) {
                                    TLRPC.Photo photo5 = Y1.profile_photo;
                                    if (photo5 != null && (arrayList = photo5.video_sizes) != null && !arrayList.isEmpty()) {
                                        photo = Y1.profile_photo;
                                    }
                                } else {
                                    photo = Y1.fallback_photo;
                                }
                            } else {
                                photo = Y1.profile_photo;
                            }
                        } else {
                            photo = Y1.personal_photo;
                        }
                        if (photo != null) {
                            ArrayList<TLRPC.VideoSize> arrayList5 = photo.video_sizes;
                            if (i2 == 4) {
                                return j(xb4.x(1000, arrayList5), photo);
                            }
                            TLRPC.VideoSize x = xb4.x(100, arrayList5);
                            int i3 = 0;
                            while (true) {
                                if (i3 >= photo.video_sizes.size()) {
                                    break;
                                }
                                if ("p".equals(photo.video_sizes.get(i3).type)) {
                                    x = photo.video_sizes.get(i3);
                                    break;
                                }
                                i3++;
                            }
                            return j(x, photo);
                        }
                    }
                    photo = null;
                    if (photo != null) {
                    }
                }
            } else if (i2 != 2) {
                TLRPC.FileLocation fileLocation = i2 == 0 ? userProfilePhoto.photo_big : userProfilePhoto.photo_small;
                if (fileLocation != null) {
                    if (user.access_hash != 0) {
                        tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                        tL_inputPeerUser.user_id = user.id;
                        tL_inputPeerUser.access_hash = user.access_hash;
                    } else if (user.fromMessageDialogId != 0 && user.fromMessageId != 0) {
                        tL_inputPeerUser = new TLRPC.TL_inputPeerUserFromMessage();
                        tL_inputPeerUser.user_id = user.id;
                        tL_inputPeerUser.peer = uc7.s1(i).j1(user.fromMessageDialogId);
                        tL_inputPeerUser.msg_id = user.fromMessageId;
                    }
                    TLRPC.InputPeer inputPeer = tL_inputPeerUser;
                    int i4 = user.photo.dc_id;
                    if (i4 == 0) {
                        i4 = fileLocation.dc_id;
                    }
                    jn5 h = h(fileLocation, 0, null, null, inputPeer, i2, i4, null, null);
                    h.s = user.photo.photo_id;
                    return h;
                }
            } else if (userProfilePhoto.stripped_thumb != null) {
                jn5 jn5Var = new jn5();
                TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                jn5Var.k = tL_photoStrippedSize;
                tL_photoStrippedSize.type = "s";
                tL_photoStrippedSize.bytes = user.photo.stripped_thumb;
                return jn5Var;
            }
        }
        return null;
    }

    public static jn5 m(int i, int i2, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i, i2, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i2, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static jn5 n(TLRPC.User user) {
        return m(yac.t0, 2, user);
    }

    public static jn5 o(String str) {
        if (str == null) {
            return null;
        }
        jn5 jn5Var = new jn5();
        jn5Var.g = str;
        jn5Var.p = (byte) 2;
        return jn5Var;
    }

    public static jn5 p(jxc jxcVar) {
        if (jxcVar == null) {
            return null;
        }
        jn5 jn5Var = new jn5();
        if (jxcVar.f) {
            jn5Var.g = jxcVar.a;
            return jn5Var;
        }
        jn5Var.v = jxcVar;
        jn5Var.r = jxcVar.d;
        return jn5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r0.rich_message == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0122  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String s(Object obj, Object obj2, Object obj3) {
        Object obj4;
        String str;
        jn5 jn5Var;
        TLRPC.Message message;
        if (!(obj instanceof TLRPC.WebPage)) {
            if (obj instanceof r47) {
                r47 r47Var = (r47) obj;
                if (r47Var.D != 29) {
                    TLRPC.Message message2 = r47Var.k;
                    if (message2 != null) {
                    }
                }
            }
            str = "stripped" + xc4.o(obj);
            if (f11.a && (obj instanceof r47) && (message = ((r47) obj).k) != null && message.rich_message != null) {
                StringBuilder p = ik8.p("[richmedia] strippedKey=", str, " fullObject=");
                p.append(obj2 != null ? "null" : obj2.getClass().getSimpleName());
                p.append(" stripped=");
                uh9.s(obj3 != null ? obj3.getClass().getSimpleName() : "null", p);
            }
            return str;
        }
        if (!(obj2 instanceof jn5) || ((obj4 = (jn5Var = (jn5) obj2).i) == null && (obj4 = jn5Var.k) == null && (obj4 = jn5Var.l) == null)) {
            obj4 = obj2;
        }
        if (obj4 == null) {
            str = "stripped" + xc4.o(obj) + "_" + obj3;
        } else if (obj4 instanceof TLRPC.Document) {
            str = "stripped" + xc4.o(obj) + "_" + ((TLRPC.Document) obj4).id;
        } else if (obj4 instanceof TLRPC.Photo) {
            str = "stripped" + xc4.o(obj) + "_" + ((TLRPC.Photo) obj4).id;
        } else if (obj4 instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
            if (photoSize.location != null) {
                str = "stripped" + xc4.o(obj) + "_" + photoSize.location.local_id + "_" + photoSize.location.volume_id;
            } else {
                str = "stripped" + xc4.o(obj);
            }
        } else {
            if (obj4 instanceof TLRPC.FileLocation) {
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) obj4;
                str = "stripped" + xc4.o(obj) + "_" + fileLocation.local_id + "_" + fileLocation.volume_id;
            }
            str = "stripped" + xc4.o(obj);
        }
        if (f11.a) {
            StringBuilder p2 = ik8.p("[richmedia] strippedKey=", str, " fullObject=");
            p2.append(obj2 != null ? "null" : obj2.getClass().getSimpleName());
            p2.append(" stripped=");
            uh9.s(obj3 != null ? obj3.getClass().getSimpleName() : "null", p2);
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String q(Object obj, Object obj2, boolean z) {
        if (this.h != null) {
            return this.h.b.dc_id + "_" + this.h.b.id;
        }
        TLRPC.PhotoSize photoSize = this.k;
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            if (photoSize.bytes.length <= 0) {
                return null;
            }
            if (obj2 != 0) {
                this = obj2;
            }
            return s(obj, this, photoSize);
        }
        if (this.f != null) {
            return this.f.volume_id + "_" + this.f.local_id;
        }
        jxc jxcVar = this.v;
        if (jxcVar != null) {
            return Utilities.a(jxcVar.a);
        }
        TLRPC.Document document = this.i;
        if (document == null) {
            String str = this.g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        }
        if (z || !(document instanceof kp3)) {
            if (document.id == 0 || document.dc_id == 0) {
                return null;
            }
            return this.i.dc_id + "_" + this.i.id;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.i.dc_id);
        sb.append("_");
        sb.append(this.i.id);
        sb.append("_");
        TLRPC.ThemeSettings themeSettings = ((kp3) document).a;
        sb.append(aob.q0(themeSettings));
        sb.append("_");
        sb.append(themeSettings.accent_color);
        sb.append("_");
        sb.append(themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() : 0);
        sb.append("_");
        sb.append(themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() : 0);
        return sb.toString();
    }

    public final long r() {
        int i;
        TLRPC.PhotoSize photoSize = this.k;
        if (photoSize == null) {
            oy9 oy9Var = this.h;
            if (oy9Var != null) {
                TLRPC.TL_secureFile tL_secureFile = oy9Var.b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.i;
                if (document != null) {
                    return document.size;
                }
                jxc jxcVar = this.v;
                if (jxcVar != null) {
                    i = jxcVar.d;
                }
            }
            return this.r;
        }
        i = photoSize.size;
        return i;
    }
}
