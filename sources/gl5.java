// default package

import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class gl5 {
    public int a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public long e;
    public TLRPC.TL_fileLocationToBeDeprecated f;
    public String g;
    public uu9 h;
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
    public usc v;

    public static gl5 a(int i, TLRPC.Chat chat) {
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.InputPeer tL_inputPeerChat;
        if (chat == null || (chatPhoto = chat.photo) == null) {
            return null;
        }
        if (i == 2) {
            if (chatPhoto.stripped_thumb == null) {
                return null;
            }
            gl5 gl5Var = new gl5();
            TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
            gl5Var.k = tL_photoStrippedSize;
            tL_photoStrippedSize.type = "s";
            tL_photoStrippedSize.bytes = chat.photo.stripped_thumb;
            return gl5Var;
        }
        TLRPC.FileLocation fileLocation = i == 0 ? chatPhoto.photo_big : chatPhoto.photo_small;
        if (fileLocation == null) {
            return null;
        }
        if (!hc2.T(chat)) {
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
        gl5 h = h(fileLocation, 0, null, null, inputPeer, i, i2, null, null);
        h.s = chat.photo.photo_id;
        return h;
    }

    public static gl5 b(TLRPC.Document document) {
        if (document == null) {
            return null;
        }
        gl5 gl5Var = new gl5();
        gl5Var.i = document;
        gl5Var.c = document.key;
        gl5Var.d = document.iv;
        gl5Var.r = document.size;
        return gl5Var;
    }

    public static gl5 c(TLRPC.PhotoSize photoSize, TLRPC.Document document) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            gl5 gl5Var = new gl5();
            gl5Var.k = photoSize;
            return gl5Var;
        }
        if (photoSize == null || document == null) {
            return null;
        }
        return h(photoSize.location, photoSize.size, null, document, null, 1, document.dc_id, null, photoSize.type);
    }

    public static gl5 d(TLRPC.VideoSize videoSize, TLRPC.Document document) {
        if (videoSize == null || document == null) {
            return null;
        }
        gl5 h = h(videoSize.location, videoSize.size, null, document, null, 1, document.dc_id, null, videoSize.type);
        if ("f".equals(videoSize.type)) {
            h.p = (byte) 1;
            return h;
        }
        h.p = (byte) 2;
        return h;
    }

    public static gl5 e(TLRPC.FileLocation fileLocation) {
        if (fileLocation == null) {
            return null;
        }
        gl5 gl5Var = new gl5();
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        gl5Var.f = tL_fileLocationToBeDeprecated;
        tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
        tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
        tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
        tL_fileLocationToBeDeprecated.dc_id = fileLocation.dc_id;
        return gl5Var;
    }

    public static gl5 f(TLRPC.PhotoSize photoSize, TLObject tLObject) {
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
        gl5 gl5Var = new gl5();
        gl5Var.k = photoSize;
        return gl5Var;
    }

    public static gl5 g(String str) {
        if (str == null) {
            return null;
        }
        gl5 gl5Var = new gl5();
        gl5Var.g = str;
        return gl5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gl5 h(TLRPC.FileLocation fileLocation, int i, TLRPC.Photo photo, TLRPC.Document document, TLRPC.InputPeer inputPeer, int i2, int i3, TLRPC.InputStickerSet inputStickerSet, String str) {
        if (fileLocation == null) {
            return null;
        }
        if (photo == null && inputPeer == null && inputStickerSet == null && document == null) {
            return null;
        }
        gl5 gl5Var = new gl5();
        gl5Var.a = i3;
        gl5Var.l = photo;
        gl5Var.r = i;
        gl5Var.n = inputPeer;
        gl5Var.m = i2;
        gl5Var.o = inputStickerSet;
        if (!(fileLocation instanceof TLRPC.TL_fileLocationToBeDeprecated)) {
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            gl5Var.f = tL_fileLocationToBeDeprecated;
            tL_fileLocationToBeDeprecated.local_id = fileLocation.local_id;
            tL_fileLocationToBeDeprecated.volume_id = fileLocation.volume_id;
            tL_fileLocationToBeDeprecated.secret = fileLocation.secret;
            gl5Var.a = fileLocation.dc_id;
            gl5Var.b = fileLocation.file_reference;
            gl5Var.c = fileLocation.key;
            gl5Var.d = fileLocation.iv;
            gl5Var.e = fileLocation.secret;
            return gl5Var;
        }
        gl5Var.f = (TLRPC.TL_fileLocationToBeDeprecated) fileLocation;
        if (photo != null) {
            gl5Var.b = photo.file_reference;
            gl5Var.e = photo.access_hash;
            gl5Var.s = photo.id;
            gl5Var.u = str;
            return gl5Var;
        }
        if (document != null) {
            gl5Var.b = document.file_reference;
            gl5Var.e = document.access_hash;
            gl5Var.t = document.id;
            gl5Var.u = str;
        }
        return gl5Var;
    }

    public static gl5 i(TLRPC.PhotoSize photoSize, TLRPC.Photo photo) {
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            gl5 gl5Var = new gl5();
            gl5Var.k = photoSize;
            return gl5Var;
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

    public static gl5 j(TLRPC.VideoSize videoSize, TLRPC.Photo photo) {
        if (videoSize == null || photo == null) {
            return null;
        }
        gl5 h = h(videoSize.location, videoSize.size, photo, null, null, 1, photo.dc_id, null, videoSize.type);
        h.p = (byte) 2;
        if ((videoSize.flags & 1) != 0) {
            h.j = (int) (videoSize.video_start_ts * 1000.0d);
        }
        return h;
    }

    public static gl5 k(TLRPC.PhotoSize photoSize, TLRPC.Document document, int i) {
        TLRPC.InputStickerSet inputStickerSet;
        if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
            gl5 gl5Var = new gl5();
            gl5Var.k = photoSize;
            return gl5Var;
        }
        if (photoSize != null && document != null) {
            Pattern pattern = hq6.U1;
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
                gl5 h = h(photoSize.location, photoSize.size, null, null, null, 1, document.dc_id, inputStickerSet, photoSize.type);
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
    public static gl5 l(int i, int i2, TLRPC.User user) {
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
                na7.q1(i);
                if (na7.A2(user) && user.photo.has_video) {
                    TLRPC.UserFull W1 = na7.q1(i).W1(user.id);
                    if (W1 != null) {
                        if (!user.photo.personal || (photo2 = W1.personal_photo) == null || (arrayList4 = photo2.video_sizes) == null || arrayList4.isEmpty()) {
                            TLRPC.Photo photo3 = W1.profile_photo;
                            if (photo3 == null || photo3.id != user.photo.photo_id || (arrayList3 = photo3.video_sizes) == null || arrayList3.isEmpty()) {
                                TLRPC.Photo photo4 = W1.fallback_photo;
                                if (photo4 == null || photo4.id != user.photo.photo_id || (arrayList2 = photo4.video_sizes) == null || arrayList2.isEmpty()) {
                                    TLRPC.Photo photo5 = W1.profile_photo;
                                    if (photo5 != null && (arrayList = photo5.video_sizes) != null && !arrayList.isEmpty()) {
                                        photo = W1.profile_photo;
                                    }
                                } else {
                                    photo = W1.fallback_photo;
                                }
                            } else {
                                photo = W1.profile_photo;
                            }
                        } else {
                            photo = W1.personal_photo;
                        }
                        if (photo != null) {
                            ArrayList<TLRPC.VideoSize> arrayList5 = photo.video_sizes;
                            if (i2 == 4) {
                                return j(ba4.x(1000, arrayList5), photo);
                            }
                            TLRPC.VideoSize x = ba4.x(100, arrayList5);
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
                        tL_inputPeerUser.peer = na7.q1(i).h1(user.fromMessageDialogId);
                        tL_inputPeerUser.msg_id = user.fromMessageId;
                    }
                    TLRPC.InputPeer inputPeer = tL_inputPeerUser;
                    int i4 = user.photo.dc_id;
                    if (i4 == 0) {
                        i4 = fileLocation.dc_id;
                    }
                    gl5 h = h(fileLocation, 0, null, null, inputPeer, i2, i4, null, null);
                    h.s = user.photo.photo_id;
                    return h;
                }
            } else if (userProfilePhoto.stripped_thumb != null) {
                gl5 gl5Var = new gl5();
                TLRPC.TL_photoStrippedSize tL_photoStrippedSize = new TLRPC.TL_photoStrippedSize();
                gl5Var.k = tL_photoStrippedSize;
                tL_photoStrippedSize.type = "s";
                tL_photoStrippedSize.bytes = user.photo.stripped_thumb;
                return gl5Var;
            }
        }
        return null;
    }

    public static gl5 m(int i, int i2, TLObject tLObject) {
        if (tLObject instanceof TLRPC.User) {
            return l(i, i2, (TLRPC.User) tLObject);
        }
        if (tLObject instanceof TLRPC.Chat) {
            return a(i2, (TLRPC.Chat) tLObject);
        }
        return null;
    }

    public static gl5 n(TLRPC.User user) {
        return m(y6c.t0, 2, user);
    }

    public static gl5 o(String str) {
        if (str == null) {
            return null;
        }
        gl5 gl5Var = new gl5();
        gl5Var.g = str;
        gl5Var.p = (byte) 2;
        return gl5Var;
    }

    public static gl5 p(usc uscVar) {
        if (uscVar == null) {
            return null;
        }
        gl5 gl5Var = new gl5();
        if (uscVar.f) {
            gl5Var.g = uscVar.a;
            return gl5Var;
        }
        gl5Var.v = uscVar;
        gl5Var.r = uscVar.d;
        return gl5Var;
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
        gl5 gl5Var;
        TLRPC.Message message;
        if (!(obj instanceof TLRPC.WebPage)) {
            if (obj instanceof k27) {
                k27 k27Var = (k27) obj;
                if (k27Var.D != 29) {
                    TLRPC.Message message2 = k27Var.k;
                    if (message2 != null) {
                    }
                }
            }
            str = "stripped" + ab4.o(obj);
            if (w01.a && (obj instanceof k27) && (message = ((k27) obj).k) != null && message.rich_message != null) {
                StringBuilder p = ug8.p("[richmedia] strippedKey=", str, " fullObject=");
                p.append(obj2 != null ? "null" : obj2.getClass().getSimpleName());
                p.append(" stripped=");
                de9.s(obj3 != null ? obj3.getClass().getSimpleName() : "null", p);
            }
            return str;
        }
        if (!(obj2 instanceof gl5) || ((obj4 = (gl5Var = (gl5) obj2).i) == null && (obj4 = gl5Var.k) == null && (obj4 = gl5Var.l) == null)) {
            obj4 = obj2;
        }
        if (obj4 == null) {
            str = "stripped" + ab4.o(obj) + "_" + obj3;
        } else if (obj4 instanceof TLRPC.Document) {
            str = "stripped" + ab4.o(obj) + "_" + ((TLRPC.Document) obj4).id;
        } else if (obj4 instanceof TLRPC.Photo) {
            str = "stripped" + ab4.o(obj) + "_" + ((TLRPC.Photo) obj4).id;
        } else if (obj4 instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) obj4;
            if (photoSize.location != null) {
                str = "stripped" + ab4.o(obj) + "_" + photoSize.location.local_id + "_" + photoSize.location.volume_id;
            } else {
                str = "stripped" + ab4.o(obj);
            }
        } else {
            if (obj4 instanceof TLRPC.FileLocation) {
                TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) obj4;
                str = "stripped" + ab4.o(obj) + "_" + fileLocation.local_id + "_" + fileLocation.volume_id;
            }
            str = "stripped" + ab4.o(obj);
        }
        if (w01.a) {
            StringBuilder p2 = ug8.p("[richmedia] strippedKey=", str, " fullObject=");
            p2.append(obj2 != null ? "null" : obj2.getClass().getSimpleName());
            p2.append(" stripped=");
            de9.s(obj3 != null ? obj3.getClass().getSimpleName() : "null", p2);
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
        usc uscVar = this.v;
        if (uscVar != null) {
            return Utilities.a(uscVar.a);
        }
        TLRPC.Document document = this.i;
        if (document == null) {
            String str = this.g;
            if (str != null) {
                return Utilities.a(str);
            }
            return null;
        }
        if (z || !(document instanceof to3)) {
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
        TLRPC.ThemeSettings themeSettings = ((to3) document).a;
        sb.append(bkb.q0(themeSettings));
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
            uu9 uu9Var = this.h;
            if (uu9Var != null) {
                TLRPC.TL_secureFile tL_secureFile = uu9Var.b;
                if (tL_secureFile != null) {
                    return tL_secureFile.size;
                }
            } else {
                TLRPC.Document document = this.i;
                if (document != null) {
                    return document.size;
                }
                usc uscVar = this.v;
                if (uscVar != null) {
                    i = uscVar.d;
                }
            }
            return this.r;
        }
        i = photoSize.size;
        return i;
    }
}
