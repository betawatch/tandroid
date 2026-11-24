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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ba4 extends pf0 {
    public static Pattern J;
    public static volatile co3 K = new co3("fileUploadQueue");
    public static SparseArray L = null;
    public static final ba4[] M = new ba4[4];
    public static final v94 N = new v94();
    public final HashMap E;
    public pk5 F;
    public int G;
    public final ConcurrentHashMap H;
    public final w94 I;
    public int a;
    public final u20[] b;
    public final u20[] c;
    public final la4 d;
    public final LinkedList e;
    public final LinkedList f;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap n;
    public int r;
    public int s;
    public final ConcurrentHashMap w;
    public final ConcurrentHashMap x;
    public final HashMap y;

    public ba4(int i) {
        super(i);
        this.b = new u20[5];
        this.c = new u20[5];
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
        this.I = new w94(this, (byte) 0);
        this.d = new la4(i);
        int i2 = 0;
        while (true) {
            u20[] u20VarArr = this.b;
            if (i2 >= u20VarArr.length) {
                break;
            }
            u20VarArr[i2] = new u20(i, 0, K);
            this.c[i2] = new u20(i, 1, K);
            i2++;
        }
        if (w01.a) {
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

    public static ka4 E(Object obj) {
        if (!(obj instanceof String)) {
            if (!(obj instanceof k27)) {
                if (!(obj instanceof TL_stories.StoryItem)) {
                    return null;
                }
                ka4 ka4Var = new ka4();
                ka4Var.a = ((TL_stories.StoryItem) obj).dialogId;
                ka4Var.c = 23;
                return ka4Var;
            }
            k27 k27Var = (k27) obj;
            ka4 ka4Var2 = new ka4();
            ka4Var2.b = k27Var.e1();
            ka4Var2.a = k27.B0(k27Var.k);
            ka4Var2.c = k27Var.D;
            ka4Var2.d = k27Var.S1();
            return ka4Var2;
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
            ka4 ka4Var3 = new ka4();
            ka4Var3.b = Integer.parseInt(matcher.group(1));
            ka4Var3.a = Long.parseLong(matcher.group(2));
            ka4Var3.c = Integer.parseInt(matcher.group(3));
            ka4Var3.d = Long.parseLong(matcher.group(4));
            return ka4Var3;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static ba4 G(int i) {
        ba4 ba4Var;
        ba4[] ba4VarArr = M;
        ba4 ba4Var2 = ba4VarArr[i];
        if (ba4Var2 != null) {
            return ba4Var2;
        }
        synchronized (ba4.class) {
            ba4Var = ba4VarArr[i];
            if (ba4Var == null) {
                ba4Var = new ba4(i);
                ba4VarArr[i] = ba4Var;
            }
        }
        return ba4Var;
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
                int i7 = document.key == null ? k27.P4(document) ? 1 : k27.J4(document) ? 2 : 3 : 4;
                j = document.id;
                i = document.dc_id;
                z3 = z(i7);
                i2 = i7;
            } else {
                if (tLObject instanceof TLRPC.Photo) {
                    return J(w(((TLRPC.Photo) tLObject).sizes, gl.Y0(true), false, null, false), str, false, z2);
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
                } else if (tLObject instanceof usc) {
                    usc uscVar = (usc) tLObject;
                    z3 = uscVar.e.startsWith("image/") ? z(0) : uscVar.e.startsWith("audio/") ? z(1) : uscVar.e.startsWith("video/") ? z(2) : z(3);
                } else if ((tLObject instanceof TLRPC.TL_secureFile) || (tLObject instanceof uu9)) {
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
            return z3 != null ? new File("") : (j == 0 || (f = G(y6c.t0).d.f(i, i2, j, z2)) == null) ? new File(z3, r(str, tLObject)) : new File(f);
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
                if (arrayList.size() > 0 && (w3 = w(arrayList, gl.Y0(false), false, null, false)) != null) {
                    return J(w3, null, z, z2);
                }
            }
        } else {
            if (k27.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
                return J(k27.n1(message).document, null, z || k27.n1(message).ttl_seconds != 0, z2);
            }
            if (k27.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = k27.n1(message).photo.sizes;
                if (arrayList2.size() > 0 && (w2 = w(arrayList2, gl.Y0(true), false, null, true)) != null) {
                    return J(w2, null, z || k27.n1(message).ttl_seconds != 0, z2);
                }
            } else if (k27.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (k27.n1(message).webpage.document != null) {
                    return J(k27.n1(message).webpage.document, null, z, z2);
                }
                if (k27.n1(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = k27.n1(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (w = w(arrayList3, gl.Y0(false), false, null, false)) != null) {
                        return J(w, null, z, z2);
                    }
                }
            } else if (k27.n1(message) instanceof TLRPC.TL_messageMediaInvoice) {
                return J(((TLRPC.TL_messageMediaInvoice) k27.n1(message)).photo, null, true, z2);
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
            fa4.g(e, false);
            if (z) {
                a(countDownLatch, false);
            }
        }
    }

    public static File j(int i) {
        return (File) L.get(i);
    }

    public static boolean m(int i, long j) {
        boolean p = y6c.h(j5.a(i).a).p();
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
        K.c(new s94(arrayList, i));
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
                return ls6.p(sb, document.id, substring);
            }
            return i + "_" + document.id;
        }
        if (tLObject instanceof uu9) {
            TLRPC.TL_secureFile tL_secureFile = ((uu9) tLObject).b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_secureFile.dc_id);
            sb2.append("_");
            return ls6.p(sb2, tL_secureFile.id, ".jpg");
        }
        if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_secureFile2.dc_id);
            sb3.append("_");
            return ls6.p(sb3, tL_secureFile2.id, ".jpg");
        }
        if (tLObject instanceof usc) {
            usc uscVar = (usc) tLObject;
            return Utilities.a(uscVar.a) + "." + fl5.x(uscVar.a, H(uscVar.e));
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
        if (w01.b && file != null) {
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
            ((k27) arrayList.get(i)).Q = true;
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

    public final void V(gl5 gl5Var, Object obj, String str, int i, int i2) {
        if (gl5Var == null) {
            return;
        }
        W(gl5Var.i, gl5Var.h, gl5Var.v, gl5Var.f, gl5Var, obj, str, gl5Var.r(), i, (i2 != 0 || (gl5Var.c == null && (gl5Var.k == null || gl5Var.r() != 0))) ? i2 : 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Runnable, u94] */
    public final void W(final TLRPC.Document document, final uu9 uu9Var, final usc uscVar, final TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, final gl5 gl5Var, final Object obj, final String str, final long j, final int i, final int i2) {
        String str2;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = r(str, tL_fileLocationToBeDeprecated);
        } else {
            str2 = null;
            if (document != null) {
                str2 = r(null, document);
            } else if (uscVar != null) {
                str2 = r(null, uscVar);
            }
        }
        String str3 = str2;
        ?? r0 = new Runnable() { // from class: u94
            @Override // java.lang.Runnable
            public final void run() {
                ba4.this.Y(document, uu9Var, uscVar, tL_fileLocationToBeDeprecated, gl5Var, obj, str, j, i, null, 0L, false, i2);
            }
        };
        if (i2 != 10 && !TextUtils.isEmpty(str3) && !str3.contains("-2147483648")) {
            aa4 aa4Var = new aa4();
            aa4Var.a = r0;
            this.x.put(str3, aa4Var);
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
    public final l94 Y(TLRPC.Document document, uu9 uu9Var, usc uscVar, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, gl5 gl5Var, Object obj, String str, long j, int i, m94 m94Var, long j2, boolean z, int i2) {
        int i3;
        String str2;
        int i4;
        Object obj2;
        int i5;
        int i6;
        l94 l94Var;
        long j3;
        l94 l94Var2;
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
        ka4 E;
        File file2;
        k27 k27Var;
        File file3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        ConcurrentHashMap concurrentHashMap = this.w;
        String r = tL_fileLocationToBeDeprecated != null ? r(str, tL_fileLocationToBeDeprecated) : uu9Var != null ? r(null, uu9Var) : document != null ? r(null, document) : uscVar != null ? r(null, uscVar) : null;
        if (r == null || r.contains("-2147483648")) {
            return null;
        }
        if (r.startsWith("0_0")) {
            fa4.g(new RuntimeException("cant get hash from " + document), true);
            return null;
        }
        if (i2 != 10 && !TextUtils.isEmpty(r) && !r.contains("-2147483648")) {
            this.x.put(r, new aa4());
        }
        if (document != null && (obj instanceof k27)) {
            k27 k27Var2 = (k27) obj;
            if (k27Var2.P && !k27Var2.M2()) {
                up3 downloadController = getDownloadController();
                downloadController.getClass();
                TLRPC.Document F0 = k27Var2.F0();
                if (F0 != null) {
                    gl.c3(new pp3(downloadController, F0, k27Var2, (byte) 1));
                }
            }
        }
        l94 l94Var3 = (l94) concurrentHashMap.get(r);
        int O = O(i);
        if (l94Var3 != null) {
            if (i2 != 10 && l94Var3.y) {
                l94Var3.o(false);
            }
            l94Var3.V0 = O > 0;
            l94Var3.b = m94Var;
            l94Var3.d = j2;
            l94Var3.c = z;
            Utilities.d.c(new h94(l94Var3, m94Var, (byte) 1));
            if (l94Var3.W0 != O) {
                l94Var3.W0 = O;
                z7 = true;
            } else {
                z7 = false;
            }
            l94Var3.e1.a(l94Var3);
            z94 z94Var = l94Var3.g0;
            if (z94Var != null) {
                long j6 = l94Var3.a0;
                long j7 = l94Var3.b0;
                if (j6 != j7 && j7 > 0) {
                    z94Var.a(l94Var3, j6, j7);
                }
            }
            if (z7) {
                l94Var3.e1.b(false);
            }
            return l94Var3;
        }
        File z8 = z(4);
        int i9 = 3;
        if (uu9Var != null) {
            l94Var = new l94(uu9Var);
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
            l94Var = new l94(gl5Var, obj2, str, j);
            j3 = j8;
            i5 = 0;
        } else {
            i3 = O;
            boolean z9 = false;
            str2 = r;
            i4 = 4;
            obj2 = obj;
            if (document != null) {
                l94Var2 = new l94(obj2, document);
                if (k27.P4(document)) {
                    i7 = 0;
                    j4 = 0;
                    i9 = 1;
                } else {
                    boolean J4 = k27.J4(document);
                    long j9 = document.id;
                    i7 = document.dc_id;
                    j4 = j9;
                    if (J4) {
                        i9 = 2;
                    }
                }
                if (!k27.h4(document)) {
                    l94Var = l94Var2;
                    i6 = i7;
                    j3 = j4;
                    i5 = i9;
                    r12 = z9;
                }
            } else {
                if (uscVar != null) {
                    l94Var2 = new l94(this.currentAccount, uscVar);
                    if (uscVar.b != null) {
                        i5 = 4;
                        l94Var = l94Var2;
                        i6 = 0;
                    } else if (uscVar.e.equals("audio/ogg")) {
                        l94Var = l94Var2;
                        i6 = 0;
                        j3 = 0;
                        i5 = 1;
                        r12 = z9;
                    } else if (uscVar.e.startsWith("video/")) {
                        l94Var = l94Var2;
                        i6 = 0;
                        j3 = 0;
                        i5 = 2;
                        r12 = z9;
                    } else if (!k27.r3(uscVar) && uscVar.e.startsWith("image/")) {
                        l94Var = l94Var2;
                        i5 = 0;
                        i6 = 0;
                    }
                } else {
                    i5 = 4;
                    i6 = 0;
                    l94Var = l94Var3;
                }
                j3 = 0;
                r12 = z9;
            }
            l94Var = l94Var2;
            i6 = 0;
            j3 = 0;
            i5 = i9;
            r12 = z9;
        }
        int j10 = Utilities.j(l94Var.U - 1, i4, r12);
        boolean z10 = obj2 instanceof TL_stories.StoryItem;
        u20 u20Var = (l94Var.b0 > 20971520 || z10) ? this.c[j10] : this.b[j10];
        if (i2 != 0 && i2 != 10 && !z10) {
            if (i2 == 2) {
                l94Var.n0 = true;
                l94Var.o0 = r12;
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
                            if ((i8 != 0 && i8 != 2) || w01.b || (E = E(obj2)) == null) {
                                file2 = z11;
                            } else {
                                file2 = z11;
                                long j11 = E.a;
                                if (!getMessagesController().z2(j11) && !cf3.B(j11)) {
                                    if (obj2 instanceof k27) {
                                        k27 k27Var3 = (k27) obj2;
                                        if (!k27Var3.g4() && !k27.Q4(k27Var3.k) && !k27Var3.M2() && !k27Var3.k.noforwards) {
                                            k27Var = k27Var3;
                                            if (mte.d(j11 < 0 ? 1 : hc2.V(getMessagesController().K0(Long.valueOf(-j11))) ? 4 : 2, E, k27Var, this.currentAccount)) {
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
                                            k27Var = null;
                                            if (mte.d(j11 < 0 ? 1 : hc2.V(getMessagesController().K0(Long.valueOf(-j11))) ? 4 : 2, E, k27Var, this.currentAccount)) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(B(document)) && (obj2 instanceof k27)) {
                                k27 k27Var4 = (k27) obj2;
                                if (k27Var4.U2() && !k27Var4.g4() && !k27.Q4(k27Var4.k)) {
                                    str3 = B(document);
                                    File z14 = z(5);
                                    if (z14 != null) {
                                        file = z14;
                                        z4 = true;
                                        if (z4) {
                                            l94Var.c1 = new wx(j5, i11, i8);
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
        l94Var.T0 = z2;
        l94Var.U0 = z8;
        l94Var.R = i13;
        String str5 = str2;
        l94Var.r = str5;
        l94Var.s = str3;
        l94Var.e1 = u20Var;
        if (i2 == 10) {
            l94Var.o(true);
            z6 = true;
        } else {
            z6 = true;
        }
        boolean z15 = z6;
        l94Var.g0 = new z94(this, obj2, document, str5, i8);
        concurrentHashMap.put(str5, l94Var);
        int i14 = i3;
        l94Var.W0 = i14;
        m94 m94Var2 = m94Var == null ? (m94) kb4.I.get(Long.valueOf(j5)) : m94Var;
        if (m94Var2 != null) {
            l94Var.b = m94Var2;
            l94Var.d = j2;
            l94Var.c = z;
            Utilities.d.c(new h94(l94Var, m94Var2, z15 ? (byte) 1 : (byte) 0));
        }
        u20Var.a(l94Var);
        if (!l94Var.j || i14 < 1048576) {
            z15 = false;
        }
        u20Var.b(z15);
        if (w01.a) {
            StringBuilder p = ug8.p("create load operation fileName=", str5, " documentName=");
            p.append(B(document));
            p.append(" size=");
            p.append(gl.i0(l94Var.b0, false, false));
            p.append(" position in queue ");
            p.append(((ArrayList) l94Var.e1.d).indexOf(l94Var));
            p.append(" account=");
            ir2.w(p, this.currentAccount, " cacheType=", i2, " priority=");
            p.append(l94Var.W0);
            p.append(" stream=");
            p.append(m94Var2);
            fa4.b(p.toString());
        }
        return l94Var;
    }

    public final void Z(TLRPC.Document document, boolean z, boolean z2) {
        if (document == null) {
            return;
        }
        if (z2) {
            gl.c3(new x94(this, document, z, (byte) 1));
        } else {
            a0(document, z);
        }
    }

    public final void a0(TLRPC.Document document, boolean z) {
        String r = r(null, document);
        StringBuilder r2 = tb4.r(r);
        r2.append(z ? "p" : "");
        if (this.E.remove(r2.toString()) != null) {
            getNotificationCenter().k(kk7.g1, r);
        }
    }

    public final void b(String str, boolean z) {
        if (str == null) {
            return;
        }
        K.c(new mn6((Object) this, z, (Object) str, (byte) 20));
    }

    public final void b0(TLRPC.Document document, boolean z, boolean z2) {
        if (document == null) {
            return;
        }
        if (z2) {
            gl.c3(new x94(this, document, z, (byte) 0));
        } else {
            d0(document, z);
        }
    }

    public final void c() {
        for (String str : this.x.keySet()) {
            aa4 aa4Var = (aa4) this.x.get(str);
            u94 u94Var = aa4Var != null ? aa4Var.a : null;
            if (u94Var != null) {
                K.a(u94Var);
            }
            K.c(new t94(this, str, (byte) 0));
        }
    }

    public final void c0(TLRPC.Document document, boolean z) {
        if (document != null) {
            String r = r(null, document);
            StringBuilder r2 = tb4.r(r);
            r2.append(z ? "" : "p");
            String sb = r2.toString();
            HashMap hashMap = this.E;
            if (hashMap.containsKey(sb)) {
                StringBuilder r3 = tb4.r(r);
                r3.append(z ? "p" : "");
                hashMap.put(r3.toString(), Boolean.TRUE);
                getNotificationCenter().k(kk7.g1, r);
            }
        }
    }

    public final void d(TLRPC.Document document) {
        f(document);
    }

    public final void d0(TLRPC.Document document, boolean z) {
        String r = r(null, document);
        StringBuilder r2 = tb4.r(r);
        r2.append(z ? "p" : "");
        this.E.put(r2.toString(), Boolean.TRUE);
        getNotificationCenter().k(kk7.g1, r);
    }

    public final void e(TLRPC.Document document, uu9 uu9Var, usc uscVar, TLRPC.FileLocation fileLocation, String str, String str2) {
        boolean z;
        if (fileLocation == null && document == null && uscVar == null && uu9Var == null && TextUtils.isEmpty(str2)) {
            return;
        }
        u94 u94Var = null;
        if (fileLocation != null) {
            str2 = r(str, fileLocation);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (uu9Var != null) {
            str2 = r(null, uu9Var);
        } else if (uscVar != null) {
            str2 = r(null, uscVar);
        }
        aa4 aa4Var = (aa4) this.x.remove(str2);
        byte b = 1;
        if (aa4Var != null) {
            u94Var = aa4Var.a;
            z = true;
        } else {
            z = false;
        }
        if (u94Var != null) {
            K.a(u94Var);
        }
        K.c(new t94(this, str2, b));
        if (!z || document == null) {
            return;
        }
        gl.c3(new w94(this, b));
    }

    public final void e0(String str, TLObject tLObject) {
        boolean z = tLObject instanceof TLRPC.Document;
        la4 la4Var = this.d;
        if (z) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            int i = document.key == null ? k27.P4(document) ? 1 : k27.J4(document) ? 2 : 3 : 4;
            long j = document.id;
            int i2 = document.dc_id;
            la4Var.getClass();
            la4Var.h(new ja4(la4Var, j, i2, i, str, 1));
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
            la4Var.getClass();
            la4Var.h(new ja4(la4Var, j2, i3, r9, str, 1));
        }
    }

    public final void f(TLRPC.Document document) {
        e(document, null, null, null, null, null);
    }

    public final void f0(final p8c p8cVar, final String str) {
        final eu3 eu3Var = new eu3(this, r0, (byte) 20);
        gk7[] gk7VarArr = {new gk7() { // from class: r94
            @Override // gk7
            public final void didReceivedNotification(int i, int i2, Object[] objArr) {
                int i3 = kk7.T1;
                String str2 = str;
                p8c p8cVar2 = p8cVar;
                eu3 eu3Var2 = eu3Var;
                if (i == i3) {
                    if (objArr[0] == str2) {
                        p8cVar2.a((TLRPC.InputFile) objArr[1]);
                        eu3Var2.run();
                        return;
                    }
                    return;
                }
                if (i == kk7.U1 && objArr[0] == str2) {
                    p8cVar2.a(null);
                    eu3Var2.run();
                }
            }
        }};
        getNotificationCenter().a(gk7VarArr[0], kk7.T1);
        getNotificationCenter().a(gk7VarArr[0], kk7.U1);
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
        K.c(new Runnable() { // from class: p94
            @Override // java.lang.Runnable
            public final void run() {
                long j2;
                ba4 ba4Var = ba4.this;
                HashMap hashMap = ba4Var.y;
                ConcurrentHashMap concurrentHashMap = ba4Var.h;
                ConcurrentHashMap concurrentHashMap2 = ba4Var.n;
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
                qb4 qb4Var = new qb4(ba4Var.currentAccount, i, j2, str3, z4);
                pk5 pk5Var = ba4Var.F;
                if (pk5Var != null && j3 != 0) {
                    pk5Var.a(qb4Var, str3, 0L, j3, z4);
                    qb4Var = qb4Var;
                    str3 = str3;
                    z4 = z4;
                }
                if (z4) {
                    concurrentHashMap2.put(str3, qb4Var);
                } else {
                    concurrentHashMap.put(str3, qb4Var);
                }
                if (z3) {
                    qb4Var.E = true;
                }
                boolean z5 = z2;
                qb4Var.o = new y94(ba4Var, z4, str3, z5);
                if (z5) {
                    int i2 = ba4Var.s;
                    if (i2 >= 1) {
                        ba4Var.f.add(qb4Var);
                        return;
                    } else {
                        ba4Var.s = i2 + 1;
                        qb4Var.c();
                        return;
                    }
                }
                int i3 = ba4Var.r;
                if (i3 >= 1) {
                    ba4Var.e.add(qb4Var);
                } else {
                    ba4Var.r = i3 + 1;
                    qb4Var.c();
                }
            }
        });
    }

    public final void h(int i, TLRPC.Document document, uu9 uu9Var, usc uscVar, TLRPC.FileLocation fileLocation, String str) {
        if (fileLocation == null && document == null && uscVar == null && uu9Var == null) {
            return;
        }
        K.c(new o94((Object) this, (Object) (fileLocation != null ? r(str, fileLocation) : document != null ? r(null, document) : uu9Var != null ? r(null, uu9Var) : uscVar != null ? r(null, uscVar) : null), i, (byte) 0));
    }

    public final void h0(boolean z, int i, String str, boolean z2) {
        g0(str, z, z2, 0L, i, false);
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().I);
        for (int i = 0; i < arrayList2.size(); i++) {
            ((k27) arrayList2.get(i)).K(true);
            if (((k27) arrayList2.get(i)).z0) {
                arrayList.add((k27) arrayList2.get(i));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        gl.c3(new eu3(this, arrayList, (byte) 21));
    }

    public final boolean k(String str) {
        l94 l94Var;
        if (str == null || (l94Var = (l94) this.w.get(str)) == null || !l94Var.l) {
            return false;
        }
        l94Var.l = false;
        return true;
    }

    public final void l(ArrayList arrayList) {
        la4 la4Var = this.d;
        la4Var.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        long currentTimeMillis = System.currentTimeMillis();
        long[] jArr = new long[1];
        hn1 hn1Var = new hn1(la4Var, arrayList2, jArr, countDownLatch, (byte) 17);
        la4Var.d();
        co3 co3Var = la4Var.a;
        Handler handler = co3Var.a;
        if (handler != null) {
            handler.postAtFrontOfQueue(hn1Var);
        } else {
            synchronized (co3Var.b) {
                ArrayList arrayList3 = co3Var.c;
                if (arrayList3 != null) {
                    arrayList3.add(new bo3(1, 0L, hn1Var));
                } else {
                    co3Var.a.postAtFrontOfQueue(hn1Var);
                }
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            fa4.g(e, true);
        }
        StringBuilder sb = new StringBuilder("checkMediaExistance size=");
        sb.append(arrayList.size());
        sb.append(" time=");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" thread_time=");
        ug8.q(jArr[0], sb);
        boolean z = w01.a;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            fa4.g(new Exception("warning, not allowed in main thread"), true);
        }
    }

    public final void n(String str, boolean z, long j, long j2, Float f) {
        K.c(new q94(this, z, str, j, j2, f));
    }

    public final float t(String str, float f) {
        l94 l94Var;
        if (!TextUtils.isEmpty(str) && (l94Var = (l94) this.w.get(str)) != null) {
            ArrayList arrayList = l94Var.N;
            if (l94Var.b0 != 0 && arrayList != null) {
                return (l94Var.f((int) (r5 * f), r5, arrayList) / l94Var.b0) + f;
            }
        }
        return 0.0f;
    }

    public final void y(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().H);
        for (int i = 0; i < arrayList.size(); i++) {
            ((k27) arrayList.get(i)).Q = true;
        }
    }
}
