// default package

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bc4 extends pg0 {
    public static Pattern J;
    public static volatile mp3 K = new mp3("fileUploadQueue");
    public static SparseArray L = null;
    public static final bc4[] M = new bc4[4];
    public static final vb4 N = new vb4();
    public final HashMap E;
    public pm5 F;
    public int G;
    public final ConcurrentHashMap H;
    public final wb4 I;
    public int a;
    public final u30[] b;
    public final u30[] c;
    public final lc4 d;
    public final LinkedList e;
    public final LinkedList f;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap n;
    public int r;
    public int s;
    public final ConcurrentHashMap w;
    public final ConcurrentHashMap x;
    public final HashMap y;

    public bc4(int i) {
        super(i);
        this.b = new u30[5];
        this.c = new u30[5];
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.h = new ConcurrentHashMap();
        this.n = new ConcurrentHashMap();
        this.r = 0;
        this.s = 0;
        this.w = new ConcurrentHashMap();
        this.x = new ConcurrentHashMap(10, 1.0f, 2);
        this.y = new HashMap();
        this.E = new HashMap();
        this.F = null;
        this.H = new ConcurrentHashMap();
        this.I = new wb4(this, (byte) 0);
        this.d = new lc4(i);
        int i2 = 0;
        while (true) {
            u30[] u30VarArr = this.b;
            if (i2 >= u30VarArr.length) {
                break;
            }
            u30VarArr[i2] = new u30(i, 0, K);
            this.c[i2] = new u30(i, 1, K);
            i2++;
        }
        if (e21.a) {
            K.a(this.I);
            K.d(this.I, 10000L);
        }
    }

    public static String A(TLRPC.Document document) {
        String B = B(document);
        int lastIndexOf = B.lastIndexOf(46);
        String substring = lastIndexOf != -1 ? B.substring(lastIndexOf + 1) : null;
        if (substring == null || substring.length() == 0) {
            substring = document.mime_type;
        }
        if (substring == null) {
            substring = "";
        }
        return substring.toUpperCase();
    }

    public static String B(TLRPC.Document document) {
        String str = null;
        if (document == null) {
            return null;
        }
        String str2 = document.file_name_fixed;
        if (str2 != null) {
            return str2;
        }
        String str3 = document.file_name;
        if (str3 == null) {
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
            }
            str3 = str;
        }
        String q = q(str3);
        return q != null ? q : "";
    }

    public static String C(String str) {
        if (str == null) {
            return "";
        }
        switch (str) {
            case "audio/ogg":
                return ".ogg";
            case "video/mp4":
                return ".mp4";
            case "video/x-matroska":
                return ".mkv";
            default:
                return "";
        }
    }

    public static String D(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(46) + 1);
        } catch (Exception unused) {
            return "";
        }
    }

    public static kc4 E(Object obj) {
        if (!(obj instanceof String)) {
            if (!(obj instanceof k47)) {
                if (!(obj instanceof TL_stories.StoryItem)) {
                    return null;
                }
                kc4 kc4Var = new kc4();
                kc4Var.a = ((TL_stories.StoryItem) obj).dialogId;
                kc4Var.c = 23;
                return kc4Var;
            }
            k47 k47Var = (k47) obj;
            kc4 kc4Var2 = new kc4();
            kc4Var2.b = k47Var.e1();
            kc4Var2.a = k47.B0(k47Var.k);
            kc4Var2.c = k47Var.D;
            kc4Var2.d = k47Var.S1();
            return kc4Var2;
        }
        String str = (String) obj;
        if (!str.startsWith("sent_")) {
            return null;
        }
        Pattern pattern = J;
        if (pattern == null) {
            pattern = Pattern.compile("sent_.*_([0-9]+)_([0-9]+)_([0-9]+)_([0-9]+)");
            J = pattern;
        }
        try {
            Matcher matcher = pattern.matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            kc4 kc4Var3 = new kc4();
            kc4Var3.b = Integer.parseInt(matcher.group(1));
            kc4Var3.a = Long.parseLong(matcher.group(2));
            kc4Var3.c = Integer.parseInt(matcher.group(3));
            kc4Var3.d = Long.parseLong(matcher.group(4));
            return kc4Var3;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static bc4 G(int i) {
        bc4 bc4Var;
        bc4[] bc4VarArr = M;
        bc4 bc4Var2 = bc4VarArr[i];
        if (bc4Var2 != null) {
            return bc4Var2;
        }
        synchronized (bc4.class) {
            bc4Var = bc4VarArr[i];
            if (bc4Var == null) {
                bc4Var = new bc4(i);
                bc4VarArr[i] = bc4Var;
            }
        }
        return bc4Var;
    }

    public static String H(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : "";
    }

    public static File I(TLObject tLObject) {
        return J(tLObject, null, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File J(TLObject tLObject, String str, boolean z, boolean z2) {
        File z3;
        int i;
        int i2;
        long j;
        long j2;
        int i3;
        File z4;
        long j3;
        int i4;
        int i5;
        String f;
        int i6 = 0;
        if (!z) {
            if (tLObject instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) tLObject;
                if (!TextUtils.isEmpty(document.localPath)) {
                    return new File(document.localPath);
                }
                int i7 = document.key == null ? k47.P4(document) ? 1 : k47.J4(document) ? 2 : 3 : 4;
                j = document.id;
                i = document.dc_id;
                z3 = z(i7);
                i2 = i7;
            } else {
                if (tLObject instanceof TLRPC.Photo) {
                    return J(w(((TLRPC.Photo) tLObject).sizes, gm.Y0(true), false, null, false), str, false, z2);
                }
                if (tLObject instanceof TLRPC.PhotoSize) {
                    TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                        z4 = null;
                    } else {
                        TLRPC.FileLocation fileLocation = photoSize.location;
                        if (fileLocation == null || fileLocation.key != null || ((fileLocation.volume_id == -2147483648L && fileLocation.local_id < 0) || photoSize.size < 0)) {
                            i6 = 4;
                            z4 = z(4);
                        } else {
                            z4 = z(0);
                        }
                    }
                    TLRPC.FileLocation fileLocation2 = photoSize.location;
                    j3 = fileLocation2.volume_id;
                    i4 = fileLocation2.dc_id;
                    i5 = fileLocation2.local_id;
                } else if (tLObject instanceof TLRPC.TL_videoSize) {
                    TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
                    TLRPC.FileLocation fileLocation3 = tL_videoSize.location;
                    if (fileLocation3 == null || fileLocation3.key != null || ((fileLocation3.volume_id == -2147483648L && fileLocation3.local_id < 0) || tL_videoSize.size < 0)) {
                        i6 = 4;
                        z4 = z(4);
                    } else {
                        z4 = z(0);
                    }
                    TLRPC.FileLocation fileLocation4 = tL_videoSize.location;
                    j3 = fileLocation4.volume_id;
                    i4 = fileLocation4.dc_id;
                    i5 = fileLocation4.local_id;
                } else if (tLObject instanceof TLRPC.FileLocation) {
                    TLRPC.FileLocation fileLocation5 = (TLRPC.FileLocation) tLObject;
                    if (fileLocation5.key == null) {
                        j2 = fileLocation5.volume_id;
                        if (j2 != -2147483648L || fileLocation5.local_id >= 0) {
                            i3 = fileLocation5.dc_id + (fileLocation5.local_id << 16);
                            z3 = z(0);
                            j = j2;
                            i = i3;
                            i2 = i6;
                        }
                    }
                    z3 = z(4);
                    j2 = 0;
                    i3 = 0;
                    j = j2;
                    i = i3;
                    i2 = i6;
                } else if ((tLObject instanceof TLRPC.UserProfilePhoto) || (tLObject instanceof TLRPC.ChatPhoto)) {
                    z3 = "s".equals("s") ? z(4) : z(0);
                } else if (tLObject instanceof vuc) {
                    vuc vucVar = (vuc) tLObject;
                    z3 = vucVar.e.startsWith("image/") ? z(0) : vucVar.e.startsWith("audio/") ? z(1) : vucVar.e.startsWith("video/") ? z(2) : z(3);
                } else if ((tLObject instanceof TLRPC.TL_secureFile) || (tLObject instanceof xw9)) {
                    z3 = z(4);
                } else {
                    i = 0;
                    i2 = 0;
                    z3 = null;
                    j = 0;
                }
                int i8 = (i5 << 16) + i4;
                j = j3;
                i = i8;
                z3 = z4;
                i2 = i6;
            }
            return z3 != null ? new File("") : (j == 0 || (f = G(z8c.t0).d.f(i, i2, j, z2)) == null) ? new File(z3, r(str, tLObject)) : new File(f);
        }
        z3 = z(4);
        j = 0;
        i = 0;
        i2 = 0;
        if (z3 != null) {
        }
    }

    public static File K(TLObject tLObject, boolean z) {
        return J(tLObject, null, z, true);
    }

    public static File L(TLRPC.Message message) {
        return M(message, false, true);
    }

    public static File M(TLRPC.Message message, boolean z, boolean z2) {
        TLRPC.PhotoSize w;
        TLRPC.PhotoSize w2;
        TLRPC.PhotoSize w3;
        if (message == null) {
            return new File("");
        }
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (w3 = w(arrayList, gm.Y0(false), false, null, false)) != null) {
                    return J(w3, null, z, z2);
                }
            }
        } else {
            if (k47.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                return J(k47.n1(message).document, null, z || k47.n1(message).ttl_seconds != 0, z2);
            }
            if (k47.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = k47.n1(message).photo.sizes;
                if (arrayList2.size() > 0 && (w2 = w(arrayList2, gm.Y0(true), false, null, true)) != null) {
                    return J(w2, null, z || k47.n1(message).ttl_seconds != 0, z2);
                }
            } else if (k47.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (k47.n1(message).webpage.document != null) {
                    return J(k47.n1(message).webpage.document, null, z, z2);
                }
                if (k47.n1(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = k47.n1(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (w = w(arrayList3, gm.Y0(false), false, null, false)) != null) {
                        return J(w, null, z, z2);
                    }
                }
            } else if (k47.n1(message) instanceof TLRPC.TL_messageMediaInvoice) {
                return J(((TLRPC.TL_messageMediaInvoice) k47.n1(message)).photo, null, true, z2);
            }
        }
        return new File("");
    }

    public static File N(TLRPC.Message message) {
        return M(message, false, true);
    }

    public static TLRPC.TL_photoStrippedSize Q(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.VideoSize R(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i = 0; i < photo.video_sizes.size(); i++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i);
                if ((videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    return videoSize;
                }
            }
        }
        return null;
    }

    public static boolean U(TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, TLRPC.Photo photo) {
        if (tL_fileLocationToBeDeprecated != null && (photo instanceof TLRPC.TL_photo)) {
            int size = photo.sizes.size();
            for (int i = 0; i < size; i++) {
                TLRPC.FileLocation fileLocation = photo.sizes.get(i).location;
                if (fileLocation != null && fileLocation.local_id == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                    return true;
                }
            }
            if ((-tL_fileLocationToBeDeprecated.volume_id) == photo.id) {
                return true;
            }
        }
        return false;
    }

    public static void a(CountDownLatch countDownLatch, boolean z) {
        try {
            countDownLatch.await();
        } catch (Exception e) {
            fc4.g(e, false);
            if (z) {
                a(countDownLatch, false);
            }
        }
    }

    public static File j(int i) {
        return (File) L.get(i);
    }

    public static boolean m(int i, long j) {
        boolean p = z8c.h(j5.a(i).a).p();
        if (j >= 2097152000) {
            return j < 4194304000L && p;
        }
        return true;
    }

    public static void o(GZIPInputStream gZIPInputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[TLObject.FLAG_12];
        int i = 0;
        do {
            int read = gZIPInputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, read);
            i += read;
        } while (i < 2097152);
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
    }

    public static void p(int i, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        K.c(new sb4(arrayList, i));
    }

    public static String q(String str) {
        return str != null ? str.replaceAll("[\u0001-\u001f<>\u202e:\"/\\\\|?*\u007f]+", "").trim() : str;
    }

    public static String r(String str, TLObject tLObject) {
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            String B = B(document);
            int lastIndexOf = B.lastIndexOf(46);
            String substring = lastIndexOf != -1 ? B.substring(lastIndexOf) : "";
            if (substring.length() <= 1) {
                substring = C(document.mime_type);
            }
            int length = substring.length();
            int i = document.dc_id;
            if (length > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("_");
                return kt6.q(sb, document.id, substring);
            }
            return i + "_" + document.id;
        }
        if (tLObject instanceof xw9) {
            TLRPC.TL_secureFile tL_secureFile = ((xw9) tLObject).b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_secureFile.dc_id);
            sb2.append("_");
            return kt6.q(sb2, tL_secureFile.id, ".jpg");
        }
        if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_secureFile2.dc_id);
            sb3.append("_");
            return kt6.q(sb3, tL_secureFile2.id, ".jpg");
        }
        if (tLObject instanceof vuc) {
            vuc vucVar = (vuc) tLObject;
            return Utilities.a(vucVar.a) + "." + fn5.x(vucVar.a, H(vucVar.e));
        }
        if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation != null && !(fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(photoSize.location.volume_id);
                sb4.append("_");
                sb4.append(photoSize.location.local_id);
                sb4.append(".");
                if (str == null) {
                    str = "jpg";
                }
                sb4.append(str);
                return sb4.toString();
            }
        } else if (tLObject instanceof TLRPC.TL_videoSize) {
            TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
            TLRPC.FileLocation fileLocation2 = tL_videoSize.location;
            if (fileLocation2 != null && !(fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(tL_videoSize.location.volume_id);
                sb5.append("_");
                sb5.append(tL_videoSize.location.local_id);
                sb5.append(".");
                if (str == null) {
                    str = "mp4";
                }
                sb5.append(str);
                return sb5.toString();
            }
        } else if (tLObject instanceof TLRPC.FileLocation) {
            if (!(tLObject instanceof TLRPC.TL_fileLocationUnavailable)) {
                TLRPC.FileLocation fileLocation3 = (TLRPC.FileLocation) tLObject;
                StringBuilder sb6 = new StringBuilder();
                sb6.append(fileLocation3.volume_id);
                sb6.append("_");
                sb6.append(fileLocation3.local_id);
                sb6.append(".");
                if (str == null) {
                    str = "jpg";
                }
                sb6.append(str);
                return sb6.toString();
            }
        } else {
            if (tLObject instanceof TLRPC.UserProfilePhoto) {
                TLRPC.UserProfilePhoto userProfilePhoto = (TLRPC.UserProfilePhoto) tLObject;
                if (userProfilePhoto.photo_small != null) {
                    return "s".equals("s") ? r(str, userProfilePhoto.photo_small) : r(str, userProfilePhoto.photo_big);
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(userProfilePhoto.photo_id);
                sb7.append("_s.");
                if (str == null) {
                    str = "jpg";
                }
                sb7.append(str);
                return sb7.toString();
            }
            if (tLObject instanceof TLRPC.ChatPhoto) {
                TLRPC.ChatPhoto chatPhoto = (TLRPC.ChatPhoto) tLObject;
                if (chatPhoto.photo_small != null) {
                    return "s".equals(null) ? r(str, chatPhoto.photo_small) : r(str, chatPhoto.photo_big);
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append(chatPhoto.photo_id);
                sb8.append("_null.");
                if (str == null) {
                    str = "jpg";
                }
                sb8.append(str);
                return sb8.toString();
            }
        }
        return "";
    }

    public static String s(TLObject tLObject) {
        return r(null, tLObject);
    }

    public static TLRPC.PhotoSize u(int i, ArrayList arrayList) {
        return w(arrayList, i, false, null, false);
    }

    public static TLRPC.PhotoSize v(int i, ArrayList arrayList, boolean z) {
        return w(arrayList, i, z, null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        if (r5.dc_id != Integer.MIN_VALUE) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x005e, code lost:
    
        if (r5.dc_id != Integer.MIN_VALUE) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.PhotoSize w(ArrayList arrayList, int i, boolean z, TLRPC.PhotoSize photoSize, boolean z2) {
        int max;
        TLRPC.PhotoSize photoSize2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) arrayList.get(i3);
                if (photoSize3 != null && photoSize3 != photoSize && !(photoSize3 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (!z2 || !(photoSize3 instanceof TLRPC.TL_photoStrippedSize))) {
                    if (z) {
                        max = Math.min(photoSize3.h, photoSize3.w);
                        if (photoSize2 != null) {
                            if (i > 100) {
                                TLRPC.FileLocation fileLocation = photoSize2.location;
                                if (fileLocation != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (i > i2) {
                                    if (i2 >= max) {
                                    }
                                }
                            }
                        }
                        photoSize2 = photoSize3;
                        i2 = max;
                    } else {
                        max = Math.max(photoSize3.w, photoSize3.h);
                        if (photoSize2 != null) {
                            if (i > 100) {
                                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                                if (fileLocation2 != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (max <= i) {
                                    if (i2 >= max) {
                                    }
                                }
                            }
                        }
                        photoSize2 = photoSize3;
                        i2 = max;
                    }
                }
            }
        }
        return photoSize2;
    }

    public static TLRPC.VideoSize x(int i, ArrayList arrayList) {
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.VideoSize videoSize2 = (TLRPC.VideoSize) arrayList.get(i3);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    int max = Math.max(videoSize2.w, videoSize2.h);
                    if (videoSize == null || ((i > 100 && (fileLocation = videoSize.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (max <= i && i2 < max))) {
                        videoSize = videoSize2;
                        i2 = max;
                    }
                }
            }
        }
        return videoSize;
    }

    public static File z(int i) {
        File file = (File) L.get(i);
        if (file == null && i != 4) {
            file = (File) L.get(4);
        }
        if (e21.b && file != null) {
            try {
                if (!file.isDirectory()) {
                    file.mkdirs();
                }
            } catch (Exception unused) {
            }
        }
        return file;
    }

    public final int F(Object obj) {
        int i = this.G;
        this.G = i + 1;
        this.H.put(Integer.valueOf(i), obj);
        return i;
    }

    public final int O(int i) {
        int i2;
        int i3;
        if (i == 4) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i == 3) {
            i2 = this.a;
            this.a = i2 + 1;
            i3 = 1048577;
        } else {
            if (i != 2) {
                return i == 1 ? 65536 : 0;
            }
            i2 = this.a;
            this.a = i2 + 1;
            i3 = 65537;
        }
        return i2 + i3;
    }

    public final void P(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().I);
        for (int i = 0; i < arrayList.size(); i++) {
            ((k47) arrayList.get(i)).Q = true;
        }
    }

    public final boolean S(String str) {
        return str != null && this.x.containsKey(str);
    }

    public final boolean T(TLRPC.Document document, boolean z) {
        if (document == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r(null, document));
        sb.append(z ? "p" : "");
        return this.E.containsKey(sb.toString());
    }

    public final void V(gn5 gn5Var, Object obj, String str, int i, int i2) {
        if (gn5Var == null) {
            return;
        }
        W(gn5Var.i, gn5Var.h, gn5Var.v, gn5Var.f, gn5Var, obj, str, gn5Var.r(), i, (i2 != 0 || (gn5Var.c == null && (gn5Var.k == null || gn5Var.r() != 0))) ? i2 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Runnable, ub4] */
    public final void W(final TLRPC.Document document, final xw9 xw9Var, final vuc vucVar, final TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, final gn5 gn5Var, final Object obj, final String str, final long j, final int i, final int i2) {
        String str2;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = r(str, tL_fileLocationToBeDeprecated);
        } else {
            str2 = null;
            if (document != null) {
                str2 = r(null, document);
            } else if (vucVar != null) {
                str2 = r(null, vucVar);
            }
        }
        String str3 = str2;
        ?? r0 = new Runnable() { // from class: ub4
            @Override // java.lang.Runnable
            public final void run() {
                bc4.this.Y(document, xw9Var, vucVar, tL_fileLocationToBeDeprecated, gn5Var, obj, str, j, i, null, 0L, false, i2);
            }
        };
        if (i2 != 10 && !TextUtils.isEmpty(str3) && !str3.contains("-2147483648")) {
            ac4 ac4Var = new ac4();
            ac4Var.a = r0;
            this.x.put(str3, ac4Var);
        }
        K.c(r0);
    }

    public final void X(TLRPC.Document document, Object obj, int i, int i2) {
        if (document == null) {
            return;
        }
        W(document, null, null, null, null, obj, null, 0L, i, (i2 != 0 || document.key == null) ? i2 : 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0256  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final lb4 Y(TLRPC.Document document, xw9 xw9Var, vuc vucVar, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, gn5 gn5Var, Object obj, String str, long j, int i, mb4 mb4Var, long j2, boolean z, int i2) {
        int i3;
        String str2;
        int i4;
        Object obj2;
        int i5;
        int i6;
        lb4 lb4Var;
        long j3;
        lb4 lb4Var2;
        int i7;
        long j4;
        ?? r12;
        int i8;
        long j5;
        File z2;
        String str3;
        File file;
        String str4;
        boolean z3;
        kc4 E;
        File file2;
        k47 k47Var;
        File file3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ConcurrentHashMap concurrentHashMap = this.w;
        String r = tL_fileLocationToBeDeprecated != null ? r(str, tL_fileLocationToBeDeprecated) : xw9Var != null ? r(null, xw9Var) : document != null ? r(null, document) : vucVar != null ? r(null, vucVar) : null;
        if (r == null || r.contains("-2147483648")) {
            return null;
        }
        if (r.startsWith("0_0")) {
            fc4.g(new RuntimeException("cant get hash from " + document), true);
            return null;
        }
        if (i2 != 10 && !TextUtils.isEmpty(r) && !r.contains("-2147483648")) {
            this.x.put(r, new ac4());
        }
        if (document != null && (obj instanceof k47)) {
            k47 k47Var2 = (k47) obj;
            if (k47Var2.P && !k47Var2.M2()) {
                er3 downloadController = getDownloadController();
                downloadController.getClass();
                TLRPC.Document F0 = k47Var2.F0();
                if (F0 != null) {
                    gm.c3(new zq3(downloadController, F0, k47Var2, (byte) 1));
                }
            }
        }
        lb4 lb4Var3 = (lb4) concurrentHashMap.get(r);
        int O = O(i);
        if (lb4Var3 != null) {
            if (i2 != 10 && lb4Var3.y) {
                lb4Var3.o(false);
            }
            lb4Var3.V0 = O > 0;
            lb4Var3.b = mb4Var;
            lb4Var3.d = j2;
            lb4Var3.c = z;
            Utilities.d.c(new hb4(lb4Var3, mb4Var, (byte) 1));
            if (lb4Var3.W0 != O) {
                lb4Var3.W0 = O;
                z7 = true;
            } else {
                z7 = false;
            }
            lb4Var3.e1.a(lb4Var3);
            zb4 zb4Var = lb4Var3.g0;
            if (zb4Var != null) {
                long j6 = lb4Var3.a0;
                long j7 = lb4Var3.b0;
                if (j6 != j7 && j7 > 0) {
                    zb4Var.a(lb4Var3, j6, j7);
                }
            }
            if (z7) {
                lb4Var3.e1.b(false);
            }
            return lb4Var3;
        }
        File z8 = z(4);
        int i9 = 3;
        if (xw9Var != null) {
            lb4Var = new lb4(xw9Var);
            i3 = O;
            r12 = 0;
            i6 = 0;
            str2 = r;
            i4 = 4;
            j3 = 0;
            i5 = 3;
            obj2 = obj;
        } else if (tL_fileLocationToBeDeprecated != null) {
            long j8 = tL_fileLocationToBeDeprecated.volume_id;
            i3 = O;
            r12 = 0;
            str2 = r;
            i4 = 4;
            obj2 = obj;
            i6 = tL_fileLocationToBeDeprecated.dc_id + (tL_fileLocationToBeDeprecated.local_id << 16);
            lb4Var = new lb4(gn5Var, obj2, str, j);
            j3 = j8;
            i5 = 0;
        } else {
            i3 = O;
            boolean z9 = false;
            str2 = r;
            i4 = 4;
            obj2 = obj;
            if (document != null) {
                lb4Var2 = new lb4(obj2, document);
                if (k47.P4(document)) {
                    i7 = 0;
                    j4 = 0;
                    i9 = 1;
                } else {
                    boolean J4 = k47.J4(document);
                    long j9 = document.id;
                    i7 = document.dc_id;
                    j4 = j9;
                    if (J4) {
                        i9 = 2;
                    }
                }
                if (!k47.h4(document)) {
                    lb4Var = lb4Var2;
                    i6 = i7;
                    j3 = j4;
                    i5 = i9;
                    r12 = z9;
                }
            } else {
                if (vucVar != null) {
                    lb4Var2 = new lb4(this.currentAccount, vucVar);
                    if (vucVar.b != null) {
                        i5 = 4;
                        lb4Var = lb4Var2;
                        i6 = 0;
                    } else if (vucVar.e.equals("audio/ogg")) {
                        lb4Var = lb4Var2;
                        i6 = 0;
                        j3 = 0;
                        i5 = 1;
                        r12 = z9;
                    } else if (vucVar.e.startsWith("video/")) {
                        lb4Var = lb4Var2;
                        i6 = 0;
                        j3 = 0;
                        i5 = 2;
                        r12 = z9;
                    } else if (!k47.r3(vucVar) && vucVar.e.startsWith("image/")) {
                        lb4Var = lb4Var2;
                        i5 = 0;
                        i6 = 0;
                    }
                } else {
                    i5 = 4;
                    i6 = 0;
                    lb4Var = lb4Var3;
                }
                j3 = 0;
                r12 = z9;
            }
            lb4Var = lb4Var2;
            i6 = 0;
            j3 = 0;
            i5 = i9;
            r12 = z9;
        }
        int j10 = Utilities.j(lb4Var.U - 1, i4, r12);
        boolean z10 = obj2 instanceof TL_stories.StoryItem;
        u30 u30Var = (lb4Var.b0 > 20971520 || z10) ? this.c[j10] : this.b[j10];
        if (i2 != 0 && i2 != 10 && !z10) {
            if (i2 == 2) {
                lb4Var.n0 = true;
                lb4Var.o0 = r12;
            }
            z2 = z8;
            i8 = i5;
            str3 = str2;
            j5 = j3;
        } else if (j3 != 0) {
            int i10 = i5;
            String f = this.d.f(i6, i10, j3, true);
            int i11 = i6;
            i8 = i10;
            j5 = j3;
            if (f != null) {
                File file4 = new File(f);
                if (file4.exists()) {
                    String name = file4.getName();
                    file = file4.getParentFile();
                    str4 = name;
                    z3 = true;
                    if (z3) {
                        File z11 = z(i8);
                        if (z10) {
                            File z12 = z(6);
                            if (z12 != null) {
                                z11 = z12;
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            file = z11;
                            z4 = z5;
                        } else {
                            if ((i8 != 0 && i8 != 2) || e21.b || (E = E(obj2)) == null) {
                                file2 = z11;
                            } else {
                                file2 = z11;
                                long j11 = E.a;
                                if (!getMessagesController().B2(j11) && !pg3.B(j11)) {
                                    if (obj2 instanceof k47) {
                                        k47 k47Var3 = (k47) obj2;
                                        if (!k47Var3.g4() && !k47.Q4(k47Var3.k) && !k47Var3.M2() && !k47Var3.k.noforwards) {
                                            k47Var = k47Var3;
                                            if (pve.d(j11 < 0 ? 1 : sd2.V(getMessagesController().L0(Long.valueOf(-j11))) ? 4 : 2, E, k47Var, this.currentAccount)) {
                                                File z13 = i8 == 0 ? z(100) : z(101);
                                                if (z13 != null) {
                                                    file3 = z13;
                                                    z4 = true;
                                                } else {
                                                    file3 = file2;
                                                    z4 = false;
                                                }
                                                file = file3;
                                            }
                                        }
                                    } else {
                                        int i12 = E.c;
                                        if (i12 != 5 && i12 != 13 && i12 != 2) {
                                            k47Var = null;
                                            if (pve.d(j11 < 0 ? 1 : sd2.V(getMessagesController().L0(Long.valueOf(-j11))) ? 4 : 2, E, k47Var, this.currentAccount)) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(B(document)) && (obj2 instanceof k47)) {
                                k47 k47Var4 = (k47) obj2;
                                if (k47Var4.U2() && !k47Var4.g4() && !k47.Q4(k47Var4.k)) {
                                    str3 = B(document);
                                    File z14 = z(5);
                                    if (z14 != null) {
                                        file = z14;
                                        z4 = true;
                                        if (z4) {
                                            lb4Var.c1 = new xy(j5, i11, i8);
                                        }
                                    } else {
                                        file = file2;
                                        z4 = false;
                                        if (z4) {
                                        }
                                    }
                                }
                            }
                            file = file2;
                            str3 = str2;
                            z4 = false;
                            if (z4) {
                            }
                        }
                        str3 = str2;
                        if (z4) {
                        }
                    } else {
                        str3 = str4;
                    }
                    z2 = file;
                }
            }
            file = z8;
            str4 = str2;
            z3 = false;
            if (z3) {
            }
            z2 = file;
        } else {
            i8 = i5;
            j5 = j3;
            z2 = z(i8);
            str3 = str2;
        }
        int i13 = this.currentAccount;
        lb4Var.T0 = z2;
        lb4Var.U0 = z8;
        lb4Var.R = i13;
        String str5 = str2;
        lb4Var.r = str5;
        lb4Var.s = str3;
        lb4Var.e1 = u30Var;
        if (i2 == 10) {
            lb4Var.o(true);
            z6 = true;
        } else {
            z6 = true;
        }
        boolean z15 = z6;
        lb4Var.g0 = new zb4(this, obj2, document, str5, i8);
        concurrentHashMap.put(str5, lb4Var);
        int i14 = i3;
        lb4Var.W0 = i14;
        mb4 mb4Var2 = mb4Var == null ? (mb4) kd4.I.get(Long.valueOf(j5)) : mb4Var;
        if (mb4Var2 != null) {
            lb4Var.b = mb4Var2;
            lb4Var.d = j2;
            lb4Var.c = z;
            Utilities.d.c(new hb4(lb4Var, mb4Var2, z15 ? (byte) 1 : (byte) 0));
        }
        u30Var.a(lb4Var);
        if (!lb4Var.j || i14 < 1048576) {
            z15 = false;
        }
        u30Var.b(z15);
        if (e21.a) {
            StringBuilder p = wi8.p("create load operation fileName=", str5, " documentName=");
            p.append(B(document));
            p.append(" size=");
            p.append(gm.i0(lb4Var.b0, false, false));
            p.append(" position in queue ");
            p.append(((ArrayList) lb4Var.e1.d).indexOf(lb4Var));
            p.append(" account=");
            ts2.v(p, this.currentAccount, " cacheType=", i2, " priority=");
            p.append(lb4Var.W0);
            p.append(" stream=");
            p.append(mb4Var2);
            fc4.b(p.toString());
        }
        return lb4Var;
    }

    public final void Z(TLRPC.Document document, boolean z, boolean z2) {
        if (document == null) {
            return;
        }
        if (z2) {
            gm.c3(new xb4(this, document, z, (byte) 1));
        } else {
            a0(document, z);
        }
    }

    public final void a0(TLRPC.Document document, boolean z) {
        String r = r(null, document);
        StringBuilder s = td4.s(r);
        s.append(z ? "p" : "");
        if (this.E.remove(s.toString()) != null) {
            getNotificationCenter().k(nm7.h1, r);
        }
    }

    public final void b(String str, boolean z) {
        if (str == null) {
            return;
        }
        K.c(new np6((Object) this, z, (Object) str, (byte) 20));
    }

    public final void b0(TLRPC.Document document, boolean z, boolean z2) {
        if (document == null) {
            return;
        }
        if (z2) {
            gm.c3(new xb4(this, document, z, (byte) 0));
        } else {
            d0(document, z);
        }
    }

    public final void c() {
        for (String str : this.x.keySet()) {
            ac4 ac4Var = (ac4) this.x.get(str);
            ub4 ub4Var = ac4Var != null ? ac4Var.a : null;
            if (ub4Var != null) {
                K.a(ub4Var);
            }
            K.c(new tb4(this, str, (byte) 0));
        }
    }

    public final void c0(TLRPC.Document document, boolean z) {
        if (document != null) {
            String r = r(null, document);
            StringBuilder s = td4.s(r);
            s.append(z ? "" : "p");
            String sb = s.toString();
            HashMap hashMap = this.E;
            if (hashMap.containsKey(sb)) {
                StringBuilder s2 = td4.s(r);
                s2.append(z ? "p" : "");
                hashMap.put(s2.toString(), Boolean.TRUE);
                getNotificationCenter().k(nm7.h1, r);
            }
        }
    }

    public final void d(TLRPC.Document document) {
        f(document);
    }

    public final void d0(TLRPC.Document document, boolean z) {
        String r = r(null, document);
        StringBuilder s = td4.s(r);
        s.append(z ? "p" : "");
        this.E.put(s.toString(), Boolean.TRUE);
        getNotificationCenter().k(nm7.h1, r);
    }

    public final void e(TLRPC.Document document, xw9 xw9Var, vuc vucVar, TLRPC.FileLocation fileLocation, String str, String str2) {
        boolean z;
        if (fileLocation == null && document == null && vucVar == null && xw9Var == null && TextUtils.isEmpty(str2)) {
            return;
        }
        ub4 ub4Var = null;
        if (fileLocation != null) {
            str2 = r(str, fileLocation);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (xw9Var != null) {
            str2 = r(null, xw9Var);
        } else if (vucVar != null) {
            str2 = r(null, vucVar);
        }
        ac4 ac4Var = (ac4) this.x.remove(str2);
        byte b = 1;
        if (ac4Var != null) {
            ub4Var = ac4Var.a;
            z = true;
        } else {
            z = false;
        }
        if (ub4Var != null) {
            K.a(ub4Var);
        }
        K.c(new tb4(this, str2, b));
        if (!z || document == null) {
            return;
        }
        gm.c3(new wb4(this, b));
    }

    public final void e0(String str, TLObject tLObject) {
        boolean z = tLObject instanceof TLRPC.Document;
        lc4 lc4Var = this.d;
        if (z) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            int i = document.key == null ? k47.P4(document) ? 1 : k47.J4(document) ? 2 : 3 : 4;
            long j = document.id;
            int i2 = document.dc_id;
            lc4Var.getClass();
            lc4Var.h(new jc4(lc4Var, j, i2, i, str, 1));
            return;
        }
        if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                return;
            }
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation != null && fileLocation.key == null && ((fileLocation.volume_id != -2147483648L || fileLocation.local_id >= 0) && photoSize.size >= 0)) {
                r9 = 0;
            }
            long j2 = fileLocation.volume_id;
            int i3 = fileLocation.dc_id + (fileLocation.local_id << 16);
            lc4Var.getClass();
            lc4Var.h(new jc4(lc4Var, j2, i3, r9, str, 1));
        }
    }

    public final void f(TLRPC.Document document) {
        e(document, null, null, null, null, null);
    }

    public final void f0(final qac qacVar, final String str) {
        final pv3 pv3Var = new pv3(this, r0, (byte) 21);
        jm7[] jm7VarArr = {new jm7() { // from class: rb4
            @Override // jm7
            public final void didReceivedNotification(int i, int i2, Object[] objArr) {
                int i3 = nm7.U1;
                String str2 = str;
                qac qacVar2 = qacVar;
                pv3 pv3Var2 = pv3Var;
                if (i == i3) {
                    if (objArr[0] == str2) {
                        qacVar2.a((TLRPC.InputFile) objArr[1]);
                        pv3Var2.run();
                        return;
                    }
                    return;
                }
                if (i == nm7.V1 && objArr[0] == str2) {
                    qacVar2.a(null);
                    pv3Var2.run();
                }
            }
        }};
        getNotificationCenter().a(jm7VarArr[0], nm7.U1);
        getNotificationCenter().a(jm7VarArr[0], nm7.V1);
        h0(false, 67108864, str, false);
    }

    public final void g(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e(null, null, null, null, null, (String) arrayList.get(i));
        }
    }

    public final void g0(final String str, final boolean z, final boolean z2, final long j, final int i, final boolean z3) {
        if (str == null) {
            return;
        }
        K.c(new Runnable() { // from class: pb4
            @Override // java.lang.Runnable
            public final void run() {
                long j2;
                bc4 bc4Var = bc4.this;
                HashMap hashMap = bc4Var.y;
                ConcurrentHashMap concurrentHashMap = bc4Var.h;
                ConcurrentHashMap concurrentHashMap2 = bc4Var.n;
                boolean z4 = z;
                String str2 = str;
                if (z4) {
                    if (concurrentHashMap2.containsKey(str2)) {
                        return;
                    }
                } else if (concurrentHashMap.containsKey(str2)) {
                    return;
                }
                long j3 = j;
                if (j3 == 0 || ((Long) hashMap.get(str2)) == null) {
                    j2 = j3;
                } else {
                    hashMap.remove(str2);
                    j2 = 0;
                }
                String str3 = str2;
                qd4 qd4Var = new qd4(bc4Var.currentAccount, i, j2, str3, z4);
                pm5 pm5Var = bc4Var.F;
                if (pm5Var != null && j3 != 0) {
                    pm5Var.a(qd4Var, str3, 0L, j3, z4);
                    qd4Var = qd4Var;
                    str3 = str3;
                    z4 = z4;
                }
                if (z4) {
                    concurrentHashMap2.put(str3, qd4Var);
                } else {
                    concurrentHashMap.put(str3, qd4Var);
                }
                if (z3) {
                    qd4Var.E = true;
                }
                boolean z5 = z2;
                qd4Var.o = new yb4(bc4Var, z4, str3, z5);
                if (z5) {
                    int i2 = bc4Var.s;
                    if (i2 >= 1) {
                        bc4Var.f.add(qd4Var);
                        return;
                    } else {
                        bc4Var.s = i2 + 1;
                        qd4Var.c();
                        return;
                    }
                }
                int i3 = bc4Var.r;
                if (i3 >= 1) {
                    bc4Var.e.add(qd4Var);
                } else {
                    bc4Var.r = i3 + 1;
                    qd4Var.c();
                }
            }
        });
    }

    public final void h(int i, TLRPC.Document document, xw9 xw9Var, vuc vucVar, TLRPC.FileLocation fileLocation, String str) {
        if (fileLocation == null && document == null && vucVar == null && xw9Var == null) {
            return;
        }
        K.c(new ob4((Object) this, (Object) (fileLocation != null ? r(str, fileLocation) : document != null ? r(null, document) : xw9Var != null ? r(null, xw9Var) : vucVar != null ? r(null, vucVar) : null), i, (byte) 0));
    }

    public final void h0(boolean z, int i, String str, boolean z2) {
        g0(str, z, z2, 0L, i, false);
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().I);
        for (int i = 0; i < arrayList2.size(); i++) {
            ((k47) arrayList2.get(i)).K(true);
            if (((k47) arrayList2.get(i)).z0) {
                arrayList.add((k47) arrayList2.get(i));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        gm.c3(new pv3(this, arrayList, (byte) 22));
    }

    public final boolean k(String str) {
        lb4 lb4Var;
        if (str == null || (lb4Var = (lb4) this.w.get(str)) == null || !lb4Var.l) {
            return false;
        }
        lb4Var.l = false;
        return true;
    }

    public final void l(ArrayList arrayList) {
        lc4 lc4Var = this.d;
        lc4Var.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        long currentTimeMillis = System.currentTimeMillis();
        long[] jArr = new long[1];
        xo1 xo1Var = new xo1(lc4Var, arrayList2, jArr, countDownLatch, (byte) 17);
        lc4Var.d();
        mp3 mp3Var = lc4Var.a;
        Handler handler = mp3Var.a;
        if (handler != null) {
            handler.postAtFrontOfQueue(xo1Var);
        } else {
            synchronized (mp3Var.b) {
                ArrayList arrayList3 = mp3Var.c;
                if (arrayList3 != null) {
                    arrayList3.add(new lp3(1, 0L, xo1Var));
                } else {
                    mp3Var.a.postAtFrontOfQueue(xo1Var);
                }
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            fc4.g(e, true);
        }
        StringBuilder sb = new StringBuilder("checkMediaExistance size=");
        sb.append(arrayList.size());
        sb.append(" time=");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" thread_time=");
        wi8.q(jArr[0], sb);
        boolean z = e21.a;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            fc4.g(new Exception("warning, not allowed in main thread"), true);
        }
    }

    public final void n(String str, boolean z, long j, long j2, Float f) {
        K.c(new qb4(this, z, str, j, j2, f));
    }

    public final float t(String str, float f) {
        lb4 lb4Var;
        if (!TextUtils.isEmpty(str) && (lb4Var = (lb4) this.w.get(str)) != null) {
            ArrayList arrayList = lb4Var.N;
            if (lb4Var.b0 != 0 && arrayList != null) {
                return (lb4Var.f((int) (r5 * f), r5, arrayList) / lb4Var.b0) + f;
            }
        }
        return 0.0f;
    }

    public final void y(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().H);
        for (int i = 0; i < arrayList.size(); i++) {
            ((k47) arrayList.get(i)).Q = true;
        }
    }
}
