package org.telegram.messenger;

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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w7 extends c1 {
    public static Pattern J;
    public static volatile p5 K = new p5("fileUploadQueue");
    public static SparseArray L = null;
    public static final w7[] M = new w7[4];
    public static final q7 N = new q7();
    public final HashMap E;
    public jb F;
    public int G;
    public final ConcurrentHashMap H;
    public final r7 I;
    public int a;
    public final mg.f[] b;
    public final mg.f[] c;
    public final f8 d;
    public final LinkedList e;
    public final LinkedList f;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap n;
    public int r;
    public int s;
    public final ConcurrentHashMap w;
    public final ConcurrentHashMap x;
    public final HashMap y;

    public w7(int i3) {
        super(i3);
        this.b = new mg.f[5];
        this.c = new mg.f[5];
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
        this.I = new r7(this, 0);
        this.d = new f8(i3);
        int i10 = 0;
        while (true) {
            mg.f[] fVarArr = this.b;
            if (i10 >= fVarArr.length) {
                break;
            }
            fVarArr[i10] = new mg.f(i3, 0, K);
            this.c[i10] = new mg.f(i3, 1, K);
            i10++;
        }
        if (r2.a) {
            K.a(this.I);
            K.e(this.I, 10000L);
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
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
            }
            str3 = str;
        }
        String q10 = q(str3);
        return q10 != null ? q10 : "";
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

    public static e8 E(Object obj) {
        if (!(obj instanceof String)) {
            if (!(obj instanceof zi)) {
                if (!(obj instanceof TL_stories.StoryItem)) {
                    return null;
                }
                e8 e8Var = new e8();
                e8Var.a = ((TL_stories.StoryItem) obj).dialogId;
                e8Var.c = 23;
                return e8Var;
            }
            zi ziVar = (zi) obj;
            e8 e8Var2 = new e8();
            e8Var2.b = ziVar.f1();
            e8Var2.a = zi.B0(ziVar.k);
            e8Var2.c = ziVar.D;
            e8Var2.d = ziVar.T1();
            return e8Var2;
        }
        String str = (String) obj;
        if (!str.startsWith("sent_")) {
            return null;
        }
        if (J == null) {
            J = Pattern.compile("sent_.*_([0-9]+)_([0-9]+)_([0-9]+)_([0-9]+)");
        }
        try {
            Matcher matcher = J.matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            e8 e8Var3 = new e8();
            e8Var3.b = Integer.parseInt(matcher.group(1));
            e8Var3.a = Long.parseLong(matcher.group(2));
            e8Var3.c = Integer.parseInt(matcher.group(3));
            e8Var3.d = Long.parseLong(matcher.group(4));
            return e8Var3;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static w7 G(int i3) {
        w7 w7Var;
        w7[] w7VarArr = M;
        w7 w7Var2 = w7VarArr[i3];
        if (w7Var2 != null) {
            return w7Var2;
        }
        synchronized (w7.class) {
            try {
                w7Var = w7VarArr[i3];
                if (w7Var == null) {
                    w7Var = new w7(i3);
                    w7VarArr[i3] = w7Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w7Var;
    }

    public static String H(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        return lastIndexOf != -1 ? str.substring(lastIndexOf + 1) : "";
    }

    public static File I(TLObject tLObject) {
        return K(tLObject, null, false, true);
    }

    public static File J(TLObject tLObject, String str, boolean z10) {
        return K(tLObject, str, false, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File K(TLObject tLObject, String str, boolean z10, boolean z11) {
        File z12;
        int i3;
        int i10;
        long j10;
        long j11;
        int i11;
        File z13;
        long j12;
        int i12;
        int i13;
        String f10;
        int i14 = 0;
        if (!z10) {
            if (tLObject instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) tLObject;
                if (!TextUtils.isEmpty(document.localPath)) {
                    return new File(document.localPath);
                }
                int i15 = document.key == null ? zi.R4(document) ? 1 : zi.L4(document) ? 2 : 3 : 4;
                j10 = document.id;
                i3 = document.dc_id;
                z12 = z(i15);
                i10 = i15;
            } else {
                if (tLObject instanceof TLRPC.Photo) {
                    return K(w(((TLRPC.Photo) tLObject).sizes, g0.Z0(true), false, null, false), str, false, z11);
                }
                if (tLObject instanceof TLRPC.PhotoSize) {
                    TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                        z13 = null;
                    } else {
                        TLRPC.FileLocation fileLocation = photoSize.location;
                        if (fileLocation == null || fileLocation.key != null || ((fileLocation.volume_id == -2147483648L && fileLocation.local_id < 0) || photoSize.size < 0)) {
                            i14 = 4;
                            z13 = z(4);
                        } else {
                            z13 = z(0);
                        }
                    }
                    TLRPC.FileLocation fileLocation2 = photoSize.location;
                    j12 = fileLocation2.volume_id;
                    i12 = fileLocation2.dc_id;
                    i13 = fileLocation2.local_id;
                } else if (tLObject instanceof TLRPC.TL_videoSize) {
                    TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
                    TLRPC.FileLocation fileLocation3 = tL_videoSize.location;
                    if (fileLocation3 == null || fileLocation3.key != null || ((fileLocation3.volume_id == -2147483648L && fileLocation3.local_id < 0) || tL_videoSize.size < 0)) {
                        i14 = 4;
                        z13 = z(4);
                    } else {
                        z13 = z(0);
                    }
                    TLRPC.FileLocation fileLocation4 = tL_videoSize.location;
                    j12 = fileLocation4.volume_id;
                    i12 = fileLocation4.dc_id;
                    i13 = fileLocation4.local_id;
                } else if (tLObject instanceof TLRPC.FileLocation) {
                    TLRPC.FileLocation fileLocation5 = (TLRPC.FileLocation) tLObject;
                    if (fileLocation5.key == null) {
                        j11 = fileLocation5.volume_id;
                        if (j11 != -2147483648L || fileLocation5.local_id >= 0) {
                            i11 = fileLocation5.dc_id + (fileLocation5.local_id << 16);
                            z12 = z(0);
                            j10 = j11;
                            i3 = i11;
                            i10 = i14;
                        }
                    }
                    z12 = z(4);
                    j11 = 0;
                    i11 = 0;
                    j10 = j11;
                    i3 = i11;
                    i10 = i14;
                } else if ((tLObject instanceof TLRPC.UserProfilePhoto) || (tLObject instanceof TLRPC.ChatPhoto)) {
                    z12 = "s".equals("s") ? z(4) : z(0);
                } else if (tLObject instanceof e20) {
                    e20 e20Var = (e20) tLObject;
                    z12 = e20Var.e.startsWith("image/") ? z(0) : e20Var.e.startsWith("audio/") ? z(1) : e20Var.e.startsWith("video/") ? z(2) : z(3);
                } else if ((tLObject instanceof TLRPC.TL_secureFile) || (tLObject instanceof wv)) {
                    z12 = z(4);
                } else {
                    i3 = 0;
                    i10 = 0;
                    z12 = null;
                    j10 = 0;
                }
                int i16 = (i13 << 16) + i12;
                j10 = j12;
                i3 = i16;
                z12 = z13;
                i10 = i14;
            }
            return z12 != null ? new File("") : (j10 == 0 || (f10 = G(h10.t0).d.f(i3, i10, j10, z11)) == null) ? new File(z12, r(str, tLObject)) : new File(f10);
        }
        z12 = z(4);
        j10 = 0;
        i3 = 0;
        i10 = 0;
        if (z12 != null) {
        }
    }

    public static File L(TLObject tLObject, boolean z10) {
        return K(tLObject, null, z10, true);
    }

    public static File M(TLRPC.Message message) {
        return N(message, false, true);
    }

    public static File N(TLRPC.Message message, boolean z10, boolean z11) {
        TLRPC.PhotoSize w10;
        TLRPC.PhotoSize w11;
        TLRPC.PhotoSize w12;
        if (message == null) {
            return new File("");
        }
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (w12 = w(arrayList, g0.Z0(false), false, null, false)) != null) {
                    return K(w12, null, z10, z11);
                }
            }
        } else {
            if (zi.o1(message) instanceof TLRPC.TL_messageMediaDocument) {
                return K(zi.o1(message).document, null, z10 || zi.o1(message).ttl_seconds != 0, z11);
            }
            if (zi.o1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = zi.o1(message).photo.sizes;
                if (arrayList2.size() > 0 && (w11 = w(arrayList2, g0.Z0(true), false, null, true)) != null) {
                    return K(w11, null, z10 || zi.o1(message).ttl_seconds != 0, z11);
                }
            } else if (zi.o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (zi.o1(message).webpage.document != null) {
                    return K(zi.o1(message).webpage.document, null, z10, z11);
                }
                if (zi.o1(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = zi.o1(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (w10 = w(arrayList3, g0.Z0(false), false, null, false)) != null) {
                        return K(w10, null, z10, z11);
                    }
                }
            } else if (zi.o1(message) instanceof TLRPC.TL_messageMediaInvoice) {
                return K(((TLRPC.TL_messageMediaInvoice) zi.o1(message)).photo, null, true, z11);
            }
        }
        return new File("");
    }

    public static File O(TLRPC.Message message) {
        return N(message, false, true);
    }

    public static TLRPC.TL_photoStrippedSize R(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i3);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.VideoSize S(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i3 = 0; i3 < photo.video_sizes.size(); i3++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i3);
                if ((videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    return videoSize;
                }
            }
        }
        return null;
    }

    public static boolean V(TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, TLRPC.Photo photo) {
        if (tL_fileLocationToBeDeprecated != null && (photo instanceof TLRPC.TL_photo)) {
            int size = photo.sizes.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.FileLocation fileLocation = photo.sizes.get(i3).location;
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

    public static void a(CountDownLatch countDownLatch, boolean z10) {
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, false);
            if (z10) {
                a(countDownLatch, false);
            }
        }
    }

    public static File j(int i3) {
        return (File) L.get(i3);
    }

    public static boolean m(int i3, long j10) {
        boolean q10 = h10.i(c.a(i3).a).q();
        if (j10 >= 2097152000) {
            return j10 < 4194304000L && q10;
        }
        return true;
    }

    public static void o(GZIPInputStream gZIPInputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[TLObject.FLAG_12];
        int i3 = 0;
        do {
            int read = gZIPInputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, read);
            i3 += read;
        } while (i3 < 2097152);
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
    }

    public static void p(int i3, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        K.c(new x0(arrayList, i3, 1));
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
            if (substring.length() > 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(document.dc_id);
                sb2.append("_");
                return a1.g.r(sb2, document.id, substring);
            }
            return document.dc_id + "_" + document.id;
        }
        if (tLObject instanceof wv) {
            TLRPC.TL_secureFile tL_secureFile = ((wv) tLObject).b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_secureFile.dc_id);
            sb3.append("_");
            return a1.g.r(sb3, tL_secureFile.id, ".jpg");
        }
        if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(tL_secureFile2.dc_id);
            sb4.append("_");
            return a1.g.r(sb4, tL_secureFile2.id, ".jpg");
        }
        if (tLObject instanceof e20) {
            e20 e20Var = (e20) tLObject;
            return Utilities.a(e20Var.a) + "." + zb.B(e20Var.a, H(e20Var.e));
        }
        if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation != null && !(fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(photoSize.location.volume_id);
                sb5.append("_");
                sb5.append(photoSize.location.local_id);
                sb5.append(".");
                if (str == null) {
                    str = "jpg";
                }
                sb5.append(str);
                return sb5.toString();
            }
        } else if (tLObject instanceof TLRPC.TL_videoSize) {
            TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
            TLRPC.FileLocation fileLocation2 = tL_videoSize.location;
            if (fileLocation2 != null && !(fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(tL_videoSize.location.volume_id);
                sb6.append("_");
                sb6.append(tL_videoSize.location.local_id);
                sb6.append(".");
                if (str == null) {
                    str = "mp4";
                }
                sb6.append(str);
                return sb6.toString();
            }
        } else {
            if (tLObject instanceof TLRPC.FileLocation) {
                if (tLObject instanceof TLRPC.TL_fileLocationUnavailable) {
                    return "";
                }
                TLRPC.FileLocation fileLocation3 = (TLRPC.FileLocation) tLObject;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(fileLocation3.volume_id);
                sb7.append("_");
                sb7.append(fileLocation3.local_id);
                sb7.append(".");
                if (str == null) {
                    str = "jpg";
                }
                sb7.append(str);
                return sb7.toString();
            }
            if (tLObject instanceof TLRPC.UserProfilePhoto) {
                TLRPC.UserProfilePhoto userProfilePhoto = (TLRPC.UserProfilePhoto) tLObject;
                if (userProfilePhoto.photo_small != null) {
                    return "s".equals("s") ? r(str, userProfilePhoto.photo_small) : r(str, userProfilePhoto.photo_big);
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append(userProfilePhoto.photo_id);
                sb8.append("_");
                sb8.append("s");
                sb8.append(".");
                if (str == null) {
                    str = "jpg";
                }
                sb8.append(str);
                return sb8.toString();
            }
            if (tLObject instanceof TLRPC.ChatPhoto) {
                TLRPC.ChatPhoto chatPhoto = (TLRPC.ChatPhoto) tLObject;
                if (chatPhoto.photo_small != null) {
                    return "s".equals(null) ? r(str, chatPhoto.photo_small) : r(str, chatPhoto.photo_big);
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(chatPhoto.photo_id);
                sb9.append("_null.");
                if (str == null) {
                    str = "jpg";
                }
                sb9.append(str);
                return sb9.toString();
            }
        }
        return "";
    }

    public static String s(TLObject tLObject) {
        return r(null, tLObject);
    }

    public static TLRPC.PhotoSize u(int i3, ArrayList arrayList) {
        return w(arrayList, i3, false, null, false);
    }

    public static TLRPC.PhotoSize v(int i3, ArrayList arrayList, boolean z10) {
        return w(arrayList, i3, z10, null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0044, code lost:
    
        if (r5.dc_id != Integer.MIN_VALUE) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0061, code lost:
    
        if (r5.dc_id != Integer.MIN_VALUE) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.PhotoSize w(ArrayList arrayList, int i3, boolean z10, TLRPC.PhotoSize photoSize, boolean z11) {
        int max;
        TLRPC.PhotoSize photoSize2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) arrayList.get(i11);
                if (photoSize3 != null && photoSize3 != photoSize && !(photoSize3 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (!z11 || !(photoSize3 instanceof TLRPC.TL_photoStrippedSize))) {
                    if (z10) {
                        max = Math.min(photoSize3.h, photoSize3.w);
                        if (photoSize2 != null) {
                            if (i3 > 100) {
                                TLRPC.FileLocation fileLocation = photoSize2.location;
                                if (fileLocation != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (i3 > i10) {
                                    if (i10 >= max) {
                                    }
                                }
                            }
                        }
                        photoSize2 = photoSize3;
                        i10 = max;
                    } else {
                        max = Math.max(photoSize3.w, photoSize3.h);
                        if (photoSize2 != null) {
                            if (i3 > 100) {
                                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                                if (fileLocation2 != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (max <= i3) {
                                    if (i10 >= max) {
                                    }
                                }
                            }
                        }
                        photoSize2 = photoSize3;
                        i10 = max;
                    }
                }
            }
        }
        return photoSize2;
    }

    public static TLRPC.VideoSize x(int i3, ArrayList arrayList) {
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.VideoSize videoSize2 = (TLRPC.VideoSize) arrayList.get(i11);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    int max = Math.max(videoSize2.w, videoSize2.h);
                    if (videoSize == null || ((i3 > 100 && (fileLocation = videoSize.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (max <= i3 && i10 < max))) {
                        videoSize = videoSize2;
                        i10 = max;
                    }
                }
            }
        }
        return videoSize;
    }

    public static File z(int i3) {
        File file = (File) L.get(i3);
        if (file == null && i3 != 4) {
            file = (File) L.get(4);
        }
        if (r2.b && file != null) {
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
        int i3 = this.G;
        this.G = i3 + 1;
        this.H.put(Integer.valueOf(i3), obj);
        return i3;
    }

    public final int P(int i3) {
        int i10;
        int i11;
        if (i3 == 4) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i3 == 3) {
            i10 = this.a;
            this.a = i10 + 1;
            i11 = 1048577;
        } else {
            if (i3 != 2) {
                return i3 == 1 ? 65536 : 0;
            }
            i10 = this.a;
            this.a = i10 + 1;
            i11 = 65537;
        }
        return i10 + i11;
    }

    public final void Q(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().I);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((zi) arrayList.get(i3)).Q = true;
        }
    }

    public final boolean T(String str) {
        return str != null && this.x.containsKey(str);
    }

    public final boolean U(TLRPC.Document document, boolean z10) {
        if (document == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r(null, document));
        sb2.append(z10 ? "p" : "");
        return this.E.containsKey(sb2.toString());
    }

    public final void W(ac acVar, Object obj, String str, int i3, int i10) {
        if (acVar == null) {
            return;
        }
        Y(acVar.i, acVar.h, acVar.v, acVar.f, acVar, obj, str, acVar.r(), i3, (i10 != 0 || (acVar.c == null && (acVar.k == null || acVar.r() != 0))) ? i10 : 1);
    }

    public final void X(TLRPC.Document document, Object obj, int i3, int i10) {
        if (document == null) {
            return;
        }
        Y(document, null, null, null, null, obj, null, 0L, i3, (i10 != 0 || document.key == null) ? i10 : 1);
    }

    public final void Y(TLRPC.Document document, wv wvVar, e20 e20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ac acVar, Object obj, String str, long j10, int i3, int i10) {
        String str2;
        String str3;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = str;
            str3 = r(str2, tL_fileLocationToBeDeprecated);
        } else {
            str2 = str;
            str3 = null;
            if (document != null) {
                str3 = r(null, document);
            } else if (e20Var != null) {
                str3 = r(null, e20Var);
            }
        }
        String str4 = str3;
        p7 p7Var = new p7(this, document, wvVar, e20Var, tL_fileLocationToBeDeprecated, acVar, obj, str2, j10, i3, i10);
        if (i10 != 10 && !TextUtils.isEmpty(str4) && !str4.contains("-2147483648")) {
            v7 v7Var = new v7();
            v7Var.a = p7Var;
            this.x.put(str4, v7Var);
        }
        K.c(p7Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0269  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final i7 Z(TLRPC.Document document, wv wvVar, e20 e20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ac acVar, Object obj, String str, long j10, int i3, j7 j7Var, long j11, boolean z10, int i10) {
        int i11;
        int i12;
        String str2;
        int i13;
        Object obj2;
        int i14;
        int i15;
        i7 i7Var;
        long j12;
        i7 i7Var2;
        int i16;
        long j13;
        ?? r12;
        int i17;
        long j14;
        File z11;
        String str3;
        File file;
        String str4;
        boolean z12;
        e8 E;
        File file2;
        zi ziVar;
        File file3;
        boolean z13;
        boolean z14;
        boolean z15;
        ConcurrentHashMap concurrentHashMap = this.w;
        String r5 = tL_fileLocationToBeDeprecated != null ? r(str, tL_fileLocationToBeDeprecated) : wvVar != null ? r(null, wvVar) : document != null ? r(null, document) : e20Var != null ? r(null, e20Var) : null;
        if (r5 == null || r5.contains("-2147483648")) {
            return null;
        }
        if (r5.startsWith("0_0")) {
            a8.g(new RuntimeException("cant get hash from " + document), true);
            return null;
        }
        if (i10 == 10 || TextUtils.isEmpty(r5) || r5.contains("-2147483648")) {
            i11 = 1;
        } else {
            i11 = 1;
            this.x.put(r5, new v7());
        }
        if (document != null && (obj instanceof zi)) {
            zi ziVar2 = (zi) obj;
            if (ziVar2.P && !ziVar2.N2()) {
                z5 downloadController = getDownloadController();
                downloadController.getClass();
                TLRPC.Document F0 = ziVar2.F0();
                if (F0 != null) {
                    g0.h3(new u5(downloadController, F0, ziVar2, 1));
                }
            }
        }
        i7 i7Var3 = (i7) concurrentHashMap.get(r5);
        int P = P(i3);
        if (i7Var3 != null) {
            if (i10 != 10 && i7Var3.y) {
                i7Var3.q(false);
            }
            i7Var3.V0 = P > 0 ? i11 : 0;
            i7Var3.b = j7Var;
            i7Var3.d = j11;
            i7Var3.c = z10;
            Utilities.d.c(new e7(i7Var3, j7Var, 1));
            if (i7Var3.W0 != P) {
                i7Var3.W0 = P;
            } else {
                i11 = 0;
            }
            i7Var3.e1.a(i7Var3);
            u7 u7Var = i7Var3.g0;
            if (u7Var != null) {
                long j15 = i7Var3.a0;
                long j16 = i7Var3.b0;
                if (j15 != j16 && j16 > 0) {
                    u7Var.a(i7Var3, j15, j16);
                }
            }
            if (i11 != 0) {
                i7Var3.e1.b(false);
            }
            return i7Var3;
        }
        File z16 = z(4);
        int i18 = 3;
        if (wvVar != null) {
            i7Var = new i7(wvVar);
            i12 = P;
            r12 = 0;
            i15 = 0;
            str2 = r5;
            i13 = 4;
            j12 = 0;
            i14 = 3;
            obj2 = obj;
        } else if (tL_fileLocationToBeDeprecated != null) {
            long j17 = tL_fileLocationToBeDeprecated.volume_id;
            i12 = P;
            r12 = 0;
            str2 = r5;
            i13 = 4;
            obj2 = obj;
            i15 = tL_fileLocationToBeDeprecated.dc_id + (tL_fileLocationToBeDeprecated.local_id << 16);
            i7Var = new i7(acVar, obj2, str, j10);
            j12 = j17;
            i14 = 0;
        } else {
            i12 = P;
            boolean z17 = false;
            str2 = r5;
            i13 = 4;
            obj2 = obj;
            if (document != null) {
                i7Var2 = new i7(obj2, document);
                if (zi.R4(document)) {
                    i16 = 0;
                    i18 = i11;
                    j13 = 0;
                } else if (zi.L4(document)) {
                    long j18 = document.id;
                    i16 = document.dc_id;
                    j13 = j18;
                    i18 = 2;
                } else {
                    long j19 = document.id;
                    i16 = document.dc_id;
                    j13 = j19;
                }
                if (!zi.j4(document)) {
                    i7Var = i7Var2;
                    i15 = i16;
                    j12 = j13;
                    i14 = i18;
                    r12 = z17;
                }
            } else {
                if (e20Var != null) {
                    i7Var2 = new i7(this.currentAccount, e20Var);
                    if (e20Var.b != null) {
                        i14 = 4;
                        i7Var = i7Var2;
                        i15 = 0;
                    } else if (e20Var.e.equals("audio/ogg")) {
                        i7Var = i7Var2;
                        i15 = 0;
                        i14 = i11;
                    } else if (e20Var.e.startsWith("video/")) {
                        i7Var = i7Var2;
                        i15 = 0;
                        j12 = 0;
                        i14 = 2;
                        r12 = z17;
                    } else if (!zi.s3(e20Var) && e20Var.e.startsWith("image/")) {
                        i7Var = i7Var2;
                        i14 = 0;
                        i15 = 0;
                    }
                } else {
                    i14 = 4;
                    i15 = 0;
                    i7Var = i7Var3;
                }
                j12 = 0;
                r12 = z17;
            }
            i7Var = i7Var2;
            i15 = 0;
            j12 = 0;
            i14 = i18;
            r12 = z17;
        }
        int j20 = Utilities.j(i7Var.U - 1, i13, r12);
        boolean z18 = obj2 instanceof TL_stories.StoryItem;
        mg.f fVar = (i7Var.b0 > 20971520 || z18) ? this.c[j20] : this.b[j20];
        if (i10 != 0 && i10 != 10 && !z18) {
            if (i10 == 2) {
                i7Var.n0 = i11;
                i7Var.o0 = r12;
            }
            z11 = z16;
            i17 = i14;
            str3 = str2;
            j14 = j12;
        } else if (j12 != 0) {
            int i19 = i14;
            String f10 = this.d.f(i15, i19, j12, true);
            int i20 = i15;
            i17 = i19;
            j14 = j12;
            if (f10 != null) {
                File file4 = new File(f10);
                if (file4.exists()) {
                    String name = file4.getName();
                    file = file4.getParentFile();
                    str4 = name;
                    z12 = true;
                    if (z12) {
                        File z19 = z(i17);
                        if (z18) {
                            File z20 = z(6);
                            if (z20 != null) {
                                z19 = z20;
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            file = z19;
                            z13 = z14;
                        } else {
                            if ((i17 != 0 && i17 != 2) || r2.b || (E = E(obj2)) == null) {
                                file2 = z19;
                            } else {
                                file2 = z19;
                                long j21 = E.a;
                                if (!getMessagesController().A2(j21) && !m5.C(j21)) {
                                    if (obj2 instanceof zi) {
                                        zi ziVar3 = (zi) obj2;
                                        if (!ziVar3.i4() && !zi.S4(ziVar3.k) && !ziVar3.N2() && !ziVar3.k.noforwards) {
                                            ziVar = ziVar3;
                                            if (b6.k(j21 < 0 ? 1 : t3.V(getMessagesController().M0(Long.valueOf(-j21))) ? 4 : 2, E, ziVar, this.currentAccount)) {
                                                File z21 = i17 == 0 ? z(100) : z(101);
                                                if (z21 != null) {
                                                    file3 = z21;
                                                    z13 = true;
                                                } else {
                                                    file3 = file2;
                                                    z13 = false;
                                                }
                                                file = file3;
                                            }
                                        }
                                    } else {
                                        int i21 = E.c;
                                        if (i21 != 5 && i21 != 13 && i21 != 2) {
                                            ziVar = null;
                                            if (b6.k(j21 < 0 ? 1 : t3.V(getMessagesController().M0(Long.valueOf(-j21))) ? 4 : 2, E, ziVar, this.currentAccount)) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(B(document)) && (obj2 instanceof zi)) {
                                zi ziVar4 = (zi) obj2;
                                if (ziVar4.V2() && !ziVar4.i4() && !zi.S4(ziVar4.k)) {
                                    str3 = B(document);
                                    File z22 = z(5);
                                    if (z22 != null) {
                                        file = z22;
                                        z13 = true;
                                        if (z13) {
                                            i7Var.c1 = new ei.t6(j14, i20, i17);
                                        }
                                    } else {
                                        file = file2;
                                        z13 = false;
                                        if (z13) {
                                        }
                                    }
                                }
                            }
                            file = file2;
                            str3 = str2;
                            z13 = false;
                            if (z13) {
                            }
                        }
                        str3 = str2;
                        if (z13) {
                        }
                    } else {
                        str3 = str4;
                    }
                    z11 = file;
                }
            }
            file = z16;
            str4 = str2;
            z12 = false;
            if (z12) {
            }
            z11 = file;
        } else {
            i17 = i14;
            j14 = j12;
            z11 = z(i17);
            str3 = str2;
        }
        int i22 = this.currentAccount;
        i7Var.T0 = z11;
        i7Var.U0 = z16;
        i7Var.R = i22;
        String str5 = str2;
        i7Var.r = str5;
        i7Var.s = str3;
        i7Var.e1 = fVar;
        if (i10 == 10) {
            i7Var.q(true);
            z15 = true;
        } else {
            z15 = true;
        }
        i7Var.g0 = new u7(this, obj2, document, str5, i17);
        concurrentHashMap.put(str5, i7Var);
        int i23 = i12;
        i7Var.W0 = i23;
        j7 j7Var2 = j7Var == null ? (j7) s8.I.get(Long.valueOf(j14)) : j7Var;
        if (j7Var2 != null) {
            i7Var.b = j7Var2;
            i7Var.d = j11;
            i7Var.c = z10;
            Utilities.d.c(new e7(i7Var, j7Var2, 1));
        }
        fVar.a(i7Var);
        fVar.b((!i7Var.j || i23 < 1048576) ? false : z15);
        if (r2.a) {
            StringBuilder u10 = a1.g.u("create load operation fileName=", str5, " documentName=");
            u10.append(B(document));
            u10.append(" size=");
            u10.append(g0.i0(i7Var.b0, false, false));
            u10.append(" position in queue ");
            u10.append(((ArrayList) i7Var.e1.d).indexOf(i7Var));
            u10.append(" account=");
            com.google.android.recaptcha.internal.a.r(u10, this.currentAccount, " cacheType=", i10, " priority=");
            u10.append(i7Var.W0);
            u10.append(" stream=");
            u10.append(j7Var2);
            a8.b(u10.toString());
        }
        return i7Var;
    }

    public final void a0(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            g0.h3(new s7(this, document, z10, 1));
        } else {
            b0(document, z10);
        }
    }

    public final void b(String str, boolean z10) {
        if (str == null) {
            return;
        }
        K.c(new qf(this, z10, str, 4));
    }

    public final void b0(TLRPC.Document document, boolean z10) {
        String r5 = r(null, document);
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(r5);
        l10.append(z10 ? "p" : "");
        if (this.E.remove(l10.toString()) != null) {
            getNotificationCenter().k(hs.h1, r5);
        }
    }

    public final void c() {
        for (String str : this.x.keySet()) {
            v7 v7Var = (v7) this.x.get(str);
            p7 p7Var = v7Var != null ? v7Var.a : null;
            if (p7Var != null) {
                K.a(p7Var);
            }
            K.c(new n7(this, str, 0));
        }
    }

    public final void c0(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            g0.h3(new s7(this, document, z10, 0));
        } else {
            e0(document, z10);
        }
    }

    public final void d(TLRPC.Document document) {
        f(document);
    }

    public final void d0(TLRPC.Document document, boolean z10) {
        if (document == null) {
            return;
        }
        String r5 = r(null, document);
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(r5);
        l10.append(z10 ? "" : "p");
        String sb2 = l10.toString();
        HashMap hashMap = this.E;
        if (hashMap.containsKey(sb2)) {
            StringBuilder l11 = com.google.android.recaptcha.internal.a.l(r5);
            l11.append(z10 ? "p" : "");
            hashMap.put(l11.toString(), Boolean.TRUE);
            getNotificationCenter().k(hs.h1, r5);
        }
    }

    public final void e(TLRPC.Document document, wv wvVar, e20 e20Var, TLRPC.FileLocation fileLocation, String str, String str2) {
        if (fileLocation == null && document == null && e20Var == null && wvVar == null && TextUtils.isEmpty(str2)) {
            return;
        }
        if (fileLocation != null) {
            str2 = r(str, fileLocation);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (wvVar != null) {
            str2 = r(null, wvVar);
        } else if (e20Var != null) {
            str2 = r(null, e20Var);
        }
        v7 v7Var = (v7) this.x.remove(str2);
        p7 p7Var = v7Var != null ? v7Var.a : null;
        boolean z10 = v7Var != null;
        if (p7Var != null) {
            K.a(p7Var);
        }
        K.c(new n7(this, str2, 1));
        if (!z10 || document == null) {
            return;
        }
        g0.h3(new r7(this, 1));
    }

    public final void e0(TLRPC.Document document, boolean z10) {
        String r5 = r(null, document);
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(r5);
        l10.append(z10 ? "p" : "");
        this.E.put(l10.toString(), Boolean.TRUE);
        getNotificationCenter().k(hs.h1, r5);
    }

    public final void f(TLRPC.Document document) {
        e(document, null, null, null, null, null);
    }

    public final void f0(String str, TLObject tLObject) {
        boolean z10 = tLObject instanceof TLRPC.Document;
        f8 f8Var = this.d;
        if (z10) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            int i3 = document.key == null ? zi.R4(document) ? 1 : zi.L4(document) ? 2 : 3 : 4;
            long j10 = document.id;
            int i10 = document.dc_id;
            f8Var.getClass();
            f8Var.h(new d8(f8Var, j10, i10, i3, str, 1));
            return;
        }
        if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                return;
            }
            TLRPC.FileLocation fileLocation = photoSize.location;
            if (fileLocation != null && fileLocation.key == null && ((fileLocation.volume_id != -2147483648L || fileLocation.local_id >= 0) && photoSize.size >= 0)) {
                r1 = 0;
            }
            long j11 = fileLocation.volume_id;
            int i11 = fileLocation.dc_id + (fileLocation.local_id << 16);
            f8Var.getClass();
            f8Var.h(new d8(f8Var, j11, i11, r1, str, 1));
        }
    }

    public final void g(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            e(null, null, null, null, null, (String) arrayList.get(i3));
        }
    }

    public final void g0(final String str, final u10 u10Var) {
        final y4 y4Var = new y4(7, this, r0);
        cs[] csVarArr = {new cs() { // from class: org.telegram.messenger.m7
            @Override // org.telegram.messenger.cs
            public final void didReceivedNotification(int i3, int i10, Object[] objArr) {
                int i11 = hs.U1;
                String str2 = str;
                u10 u10Var2 = u10Var;
                y4 y4Var2 = y4Var;
                if (i3 == i11) {
                    if (objArr[0] == str2) {
                        u10Var2.a((TLRPC.InputFile) objArr[1]);
                        y4Var2.run();
                        return;
                    }
                    return;
                }
                if (i3 == hs.V1 && objArr[0] == str2) {
                    u10Var2.a(null);
                    y4Var2.run();
                }
            }
        }};
        getNotificationCenter().b(csVarArr[0], hs.U1);
        getNotificationCenter().b(csVarArr[0], hs.V1);
        i0(false, 67108864, str, false);
    }

    public final void h(int i3, TLRPC.Document document, wv wvVar, e20 e20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, String str) {
        String str2 = null;
        if (tL_fileLocationToBeDeprecated == null && document == null && e20Var == null && wvVar == null && TextUtils.isEmpty(null)) {
            return;
        }
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = r(str, tL_fileLocationToBeDeprecated);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (wvVar != null) {
            str2 = r(null, wvVar);
        } else if (e20Var != null) {
            str2 = r(null, e20Var);
        }
        K.c(new k7(this, str2, i3, 0));
    }

    public final void h0(final String str, final boolean z10, final boolean z11, final long j10, final int i3, final boolean z12) {
        if (str == null) {
            return;
        }
        K.c(new Runnable() { // from class: org.telegram.messenger.l7
            @Override // java.lang.Runnable
            public final void run() {
                long j11;
                w7 w7Var = w7.this;
                HashMap hashMap = w7Var.y;
                ConcurrentHashMap concurrentHashMap = w7Var.h;
                ConcurrentHashMap concurrentHashMap2 = w7Var.n;
                boolean z13 = z10;
                String str2 = str;
                if (z13) {
                    if (concurrentHashMap2.containsKey(str2)) {
                        return;
                    }
                } else if (concurrentHashMap.containsKey(str2)) {
                    return;
                }
                long j12 = j10;
                if (j12 == 0 || ((Long) hashMap.get(str2)) == null) {
                    j11 = j12;
                } else {
                    hashMap.remove(str2);
                    j11 = 0;
                }
                String str3 = str2;
                y8 y8Var = new y8(w7Var.currentAccount, i3, j11, str3, z13);
                jb jbVar = w7Var.F;
                if (jbVar != null && j12 != 0) {
                    jbVar.a(y8Var, str3, 0L, j12, z13);
                    y8Var = y8Var;
                    str3 = str3;
                    z13 = z13;
                }
                if (z13) {
                    concurrentHashMap2.put(str3, y8Var);
                } else {
                    concurrentHashMap.put(str3, y8Var);
                }
                if (z12) {
                    y8Var.E = true;
                }
                boolean z14 = z11;
                y8Var.o = new t7(w7Var, z13, str3, z14);
                if (z14) {
                    int i10 = w7Var.s;
                    if (i10 >= 1) {
                        w7Var.f.add(y8Var);
                        return;
                    } else {
                        w7Var.s = i10 + 1;
                        y8Var.c();
                        return;
                    }
                }
                int i11 = w7Var.r;
                if (i11 >= 1) {
                    w7Var.e.add(y8Var);
                } else {
                    w7Var.r = i11 + 1;
                    y8Var.c();
                }
            }
        });
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().I);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ((zi) arrayList2.get(i3)).K(true);
            if (((zi) arrayList2.get(i3)).x0) {
                arrayList.add((zi) arrayList2.get(i3));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        g0.h3(new y4(8, this, arrayList));
    }

    public final void i0(boolean z10, int i3, String str, boolean z11) {
        h0(str, z10, z11, 0L, i3, false);
    }

    public final boolean k(String str) {
        i7 i7Var;
        if (str == null || (i7Var = (i7) this.w.get(str)) == null || !i7Var.l) {
            return false;
        }
        i7Var.l = false;
        return true;
    }

    public final void l(ArrayList arrayList) {
        f8 f8Var = this.d;
        f8Var.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        long currentTimeMillis = System.currentTimeMillis();
        long[] jArr = new long[1];
        ul ulVar = new ul(f8Var, arrayList2, jArr, countDownLatch, 6);
        f8Var.d();
        p5 p5Var = f8Var.a;
        Handler handler = p5Var.a;
        if (handler != null) {
            handler.postAtFrontOfQueue(ulVar);
        } else {
            synchronized (p5Var.b) {
                try {
                    ArrayList arrayList3 = p5Var.c;
                    if (arrayList3 != null) {
                        arrayList3.add(new o5(1, 0L, ulVar));
                    } else {
                        p5Var.a.postAtFrontOfQueue(ulVar);
                    }
                } finally {
                }
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e10) {
            a8.g(e10, true);
        }
        StringBuilder sb2 = new StringBuilder("checkMediaExistance size=");
        sb2.append(arrayList.size());
        sb2.append(" time=");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(" thread_time=");
        k2.p1.r(jArr[0], sb2);
        boolean z10 = r2.a;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a8.g(new Exception("warning, not allowed in main thread"), true);
        }
    }

    public final void n(String str, boolean z10, long j10, long j11, Float f10) {
        K.c(new ei.e6(this, z10, str, j10, j11, f10));
    }

    public final float t(String str, float f10) {
        i7 i7Var;
        if (!TextUtils.isEmpty(str) && (i7Var = (i7) this.w.get(str)) != null) {
            ArrayList arrayList = i7Var.N;
            if (i7Var.b0 != 0 && arrayList != null) {
                return (i7Var.h((int) (r5 * f10), r5, arrayList) / i7Var.b0) + f10;
            }
        }
        return 0.0f;
    }

    public final void y(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().H);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((zi) arrayList.get(i3)).Q = true;
        }
    }
}
