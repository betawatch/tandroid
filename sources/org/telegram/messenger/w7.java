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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class w7 extends c1 {
    public static Pattern I;
    public static volatile p5 J = new p5("fileUploadQueue");
    public static SparseArray K = null;
    public static final w7[] L = new w7[4];
    public static final q7 M = new q7();
    public final HashMap D;
    public qb E;
    public int F;
    public final ConcurrentHashMap G;
    public final r7 H;
    public int a;
    public final lg.f[] b;
    public final lg.f[] c;
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

    public w7(int i7) {
        super(i7);
        this.b = new lg.f[5];
        this.c = new lg.f[5];
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.h = new ConcurrentHashMap();
        this.n = new ConcurrentHashMap();
        this.r = 0;
        this.s = 0;
        this.w = new ConcurrentHashMap();
        this.x = new ConcurrentHashMap(10, 1.0f, 2);
        this.y = new HashMap();
        this.D = new HashMap();
        this.E = null;
        this.G = new ConcurrentHashMap();
        this.H = new r7(this, 0);
        this.d = new f8(i7);
        int i10 = 0;
        while (true) {
            lg.f[] fVarArr = this.b;
            if (i10 >= fVarArr.length) {
                break;
            }
            fVarArr[i10] = new lg.f(i7, 0, J);
            this.c[i10] = new lg.f(i7, 1, J);
            i10++;
        }
        if (r2.a) {
            J.a(this.H);
            J.d(this.H, 10000L);
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
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
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
            if (!(obj instanceof ij)) {
                if (!(obj instanceof TL_stories.StoryItem)) {
                    return null;
                }
                e8 e8Var = new e8();
                e8Var.a = ((TL_stories.StoryItem) obj).dialogId;
                e8Var.c = 23;
                return e8Var;
            }
            ij ijVar = (ij) obj;
            e8 e8Var2 = new e8();
            e8Var2.b = ijVar.f1();
            e8Var2.a = ij.B0(ijVar.k);
            e8Var2.c = ijVar.D;
            e8Var2.d = ijVar.T1();
            return e8Var2;
        }
        String str = (String) obj;
        if (!str.startsWith("sent_")) {
            return null;
        }
        if (I == null) {
            I = Pattern.compile("sent_.*_([0-9]+)_([0-9]+)_([0-9]+)_([0-9]+)");
        }
        try {
            Matcher matcher = I.matcher(str);
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

    public static w7 G(int i7) {
        w7 w7Var;
        w7[] w7VarArr = L;
        w7 w7Var2 = w7VarArr[i7];
        if (w7Var2 != null) {
            return w7Var2;
        }
        synchronized (w7.class) {
            try {
                w7Var = w7VarArr[i7];
                if (w7Var == null) {
                    w7Var = new w7(i7);
                    w7VarArr[i7] = w7Var;
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
        return J(tLObject, null, false, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0182  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File J(TLObject tLObject, String str, boolean z9, boolean z10) {
        File z11;
        int i7;
        int i10;
        long j3;
        long j10;
        int i11;
        File z12;
        long j11;
        int i12;
        int i13;
        String f10;
        int i14 = 0;
        if (!z9) {
            if (tLObject instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) tLObject;
                if (!TextUtils.isEmpty(document.localPath)) {
                    return new File(document.localPath);
                }
                int i15 = document.key == null ? ij.R4(document) ? 1 : ij.L4(document) ? 2 : 3 : 4;
                j3 = document.id;
                i7 = document.dc_id;
                z11 = z(i15);
                i10 = i15;
            } else {
                if (tLObject instanceof TLRPC.Photo) {
                    return J(w(((TLRPC.Photo) tLObject).sizes, g0.Z0(true), false, null, false), str, false, z10);
                }
                if (tLObject instanceof TLRPC.PhotoSize) {
                    TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                        z12 = null;
                    } else {
                        TLRPC.FileLocation fileLocation = photoSize.location;
                        if (fileLocation == null || fileLocation.key != null || ((fileLocation.volume_id == -2147483648L && fileLocation.local_id < 0) || photoSize.size < 0)) {
                            i14 = 4;
                            z12 = z(4);
                        } else {
                            z12 = z(0);
                        }
                    }
                    TLRPC.FileLocation fileLocation2 = photoSize.location;
                    j11 = fileLocation2.volume_id;
                    i12 = fileLocation2.dc_id;
                    i13 = fileLocation2.local_id;
                } else if (tLObject instanceof TLRPC.TL_videoSize) {
                    TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
                    TLRPC.FileLocation fileLocation3 = tL_videoSize.location;
                    if (fileLocation3 == null || fileLocation3.key != null || ((fileLocation3.volume_id == -2147483648L && fileLocation3.local_id < 0) || tL_videoSize.size < 0)) {
                        i14 = 4;
                        z12 = z(4);
                    } else {
                        z12 = z(0);
                    }
                    TLRPC.FileLocation fileLocation4 = tL_videoSize.location;
                    j11 = fileLocation4.volume_id;
                    i12 = fileLocation4.dc_id;
                    i13 = fileLocation4.local_id;
                } else if (tLObject instanceof TLRPC.FileLocation) {
                    TLRPC.FileLocation fileLocation5 = (TLRPC.FileLocation) tLObject;
                    if (fileLocation5.key == null) {
                        j10 = fileLocation5.volume_id;
                        if (j10 != -2147483648L || fileLocation5.local_id >= 0) {
                            i11 = fileLocation5.dc_id + (fileLocation5.local_id << 16);
                            z11 = z(0);
                            j3 = j10;
                            i7 = i11;
                            i10 = i14;
                        }
                    }
                    z11 = z(4);
                    j10 = 0;
                    i11 = 0;
                    j3 = j10;
                    i7 = i11;
                    i10 = i14;
                } else if ((tLObject instanceof TLRPC.UserProfilePhoto) || (tLObject instanceof TLRPC.ChatPhoto)) {
                    z11 = "s".equals("s") ? z(4) : z(0);
                } else if (tLObject instanceof m20) {
                    m20 m20Var = (m20) tLObject;
                    z11 = m20Var.e.startsWith("image/") ? z(0) : m20Var.e.startsWith("audio/") ? z(1) : m20Var.e.startsWith("video/") ? z(2) : z(3);
                } else if ((tLObject instanceof TLRPC.TL_secureFile) || (tLObject instanceof ew)) {
                    z11 = z(4);
                } else {
                    i7 = 0;
                    i10 = 0;
                    z11 = null;
                    j3 = 0;
                }
                int i16 = (i13 << 16) + i12;
                j3 = j11;
                i7 = i16;
                z11 = z12;
                i10 = i14;
            }
            return z11 != null ? new File("") : (j3 == 0 || (f10 = G(p10.s0).d.f(i7, i10, j3, z10)) == null) ? new File(z11, r(str, tLObject)) : new File(f10);
        }
        z11 = z(4);
        j3 = 0;
        i7 = 0;
        i10 = 0;
        if (z11 != null) {
        }
    }

    public static File K(TLObject tLObject, boolean z9) {
        return J(tLObject, null, z9, true);
    }

    public static File L(TLRPC.Message message) {
        return M(message, false, true);
    }

    public static File M(TLRPC.Message message, boolean z9, boolean z10) {
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
                    return J(w12, null, z9, z10);
                }
            }
        } else {
            if (ij.o1(message) instanceof TLRPC.TL_messageMediaDocument) {
                return J(ij.o1(message).document, null, z9 || ij.o1(message).ttl_seconds != 0, z10);
            }
            if (ij.o1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = ij.o1(message).photo.sizes;
                if (arrayList2.size() > 0 && (w11 = w(arrayList2, g0.Z0(true), false, null, true)) != null) {
                    return J(w11, null, z9 || ij.o1(message).ttl_seconds != 0, z10);
                }
            } else if (ij.o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (ij.o1(message).webpage.document != null) {
                    return J(ij.o1(message).webpage.document, null, z9, z10);
                }
                if (ij.o1(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = ij.o1(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (w10 = w(arrayList3, g0.Z0(false), false, null, false)) != null) {
                        return J(w10, null, z9, z10);
                    }
                }
            } else if (ij.o1(message) instanceof TLRPC.TL_messageMediaInvoice) {
                return J(((TLRPC.TL_messageMediaInvoice) ij.o1(message)).photo, null, true, z10);
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
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i7);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.VideoSize R(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i7 = 0; i7 < photo.video_sizes.size(); i7++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i7);
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
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.FileLocation fileLocation = photo.sizes.get(i7).location;
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

    public static void a(CountDownLatch countDownLatch, boolean z9) {
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, false);
            if (z9) {
                a(countDownLatch, false);
            }
        }
    }

    public static File j(int i7) {
        return (File) K.get(i7);
    }

    public static boolean m(int i7, long j3) {
        boolean q10 = p10.i(c.a(i7).a).q();
        if (j3 >= 2097152000) {
            return j3 < 4194304000L && q10;
        }
        return true;
    }

    public static void o(GZIPInputStream gZIPInputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[TLObject.FLAG_12];
        int i7 = 0;
        do {
            int read = gZIPInputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, read);
            i7 += read;
        } while (i7 < 2097152);
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
    }

    public static void p(int i7, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        J.c(new x0(arrayList, i7, 1));
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
                return a8.p0.r(sb2, document.id, substring);
            }
            return document.dc_id + "_" + document.id;
        }
        if (tLObject instanceof ew) {
            TLRPC.TL_secureFile tL_secureFile = ((ew) tLObject).b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_secureFile.dc_id);
            sb3.append("_");
            return a8.p0.r(sb3, tL_secureFile.id, ".jpg");
        }
        if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(tL_secureFile2.dc_id);
            sb4.append("_");
            return a8.p0.r(sb4, tL_secureFile2.id, ".jpg");
        }
        if (tLObject instanceof m20) {
            m20 m20Var = (m20) tLObject;
            return Utilities.a(m20Var.a) + "." + gc.B(m20Var.a, H(m20Var.e));
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

    public static TLRPC.PhotoSize u(int i7, ArrayList arrayList) {
        return w(arrayList, i7, false, null, false);
    }

    public static TLRPC.PhotoSize v(int i7, ArrayList arrayList, boolean z9) {
        return w(arrayList, i7, z9, null, false);
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
    public static TLRPC.PhotoSize w(ArrayList arrayList, int i7, boolean z9, TLRPC.PhotoSize photoSize, boolean z10) {
        int max;
        TLRPC.PhotoSize photoSize2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) arrayList.get(i11);
                if (photoSize3 != null && photoSize3 != photoSize && !(photoSize3 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (!z10 || !(photoSize3 instanceof TLRPC.TL_photoStrippedSize))) {
                    if (z9) {
                        max = Math.min(photoSize3.h, photoSize3.w);
                        if (photoSize2 != null) {
                            if (i7 > 100) {
                                TLRPC.FileLocation fileLocation = photoSize2.location;
                                if (fileLocation != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (i7 > i10) {
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
                            if (i7 > 100) {
                                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                                if (fileLocation2 != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (max <= i7) {
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

    public static TLRPC.VideoSize x(int i7, ArrayList arrayList) {
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.VideoSize videoSize2 = (TLRPC.VideoSize) arrayList.get(i11);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    int max = Math.max(videoSize2.w, videoSize2.h);
                    if (videoSize == null || ((i7 > 100 && (fileLocation = videoSize.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (max <= i7 && i10 < max))) {
                        videoSize = videoSize2;
                        i10 = max;
                    }
                }
            }
        }
        return videoSize;
    }

    public static File z(int i7) {
        File file = (File) K.get(i7);
        if (file == null && i7 != 4) {
            file = (File) K.get(4);
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
        int i7 = this.F;
        this.F = i7 + 1;
        this.G.put(Integer.valueOf(i7), obj);
        return i7;
    }

    public final int O(int i7) {
        int i10;
        int i11;
        if (i7 == 4) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i7 == 3) {
            i10 = this.a;
            this.a = i10 + 1;
            i11 = 1048577;
        } else {
            if (i7 != 2) {
                return i7 == 1 ? 65536 : 0;
            }
            i10 = this.a;
            this.a = i10 + 1;
            i11 = 65537;
        }
        return i10 + i11;
    }

    public final void P(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().H);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((ij) arrayList.get(i7)).Q = true;
        }
    }

    public final boolean S(String str) {
        return str != null && this.x.containsKey(str);
    }

    public final boolean T(TLRPC.Document document, boolean z9) {
        if (document == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(r(null, document));
        sb2.append(z9 ? "p" : "");
        return this.D.containsKey(sb2.toString());
    }

    public final void V(hc hcVar, Object obj, String str, int i7, int i10) {
        if (hcVar == null) {
            return;
        }
        X(hcVar.i, hcVar.h, hcVar.v, hcVar.f, hcVar, obj, str, hcVar.r(), i7, (i10 != 0 || (hcVar.c == null && (hcVar.k == null || hcVar.r() != 0))) ? i10 : 1);
    }

    public final void W(TLRPC.Document document, Object obj, int i7, int i10) {
        if (document == null) {
            return;
        }
        X(document, null, null, null, null, obj, null, 0L, i7, (i10 != 0 || document.key == null) ? i10 : 1);
    }

    public final void X(TLRPC.Document document, ew ewVar, m20 m20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, hc hcVar, Object obj, String str, long j3, int i7, int i10) {
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
            } else if (m20Var != null) {
                str3 = r(null, m20Var);
            }
        }
        String str4 = str3;
        p7 p7Var = new p7(this, document, ewVar, m20Var, tL_fileLocationToBeDeprecated, hcVar, obj, str2, j3, i7, i10);
        if (i10 != 10 && !TextUtils.isEmpty(str4) && !str4.contains("-2147483648")) {
            v7 v7Var = new v7();
            v7Var.a = p7Var;
            this.x.put(str4, v7Var);
        }
        J.c(p7Var);
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
    public final i7 Y(TLRPC.Document document, ew ewVar, m20 m20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, hc hcVar, Object obj, String str, long j3, int i7, j7 j7Var, long j10, boolean z9, int i10) {
        int i11;
        int i12;
        String str2;
        int i13;
        Object obj2;
        int i14;
        int i15;
        i7 i7Var;
        long j11;
        i7 i7Var2;
        int i16;
        long j12;
        ?? r12;
        int i17;
        long j13;
        File z10;
        String str3;
        File file;
        String str4;
        boolean z11;
        e8 E;
        File file2;
        ij ijVar;
        File file3;
        boolean z12;
        boolean z13;
        boolean z14;
        ConcurrentHashMap concurrentHashMap = this.w;
        String r10 = tL_fileLocationToBeDeprecated != null ? r(str, tL_fileLocationToBeDeprecated) : ewVar != null ? r(null, ewVar) : document != null ? r(null, document) : m20Var != null ? r(null, m20Var) : null;
        if (r10 == null || r10.contains("-2147483648")) {
            return null;
        }
        if (r10.startsWith("0_0")) {
            a8.g(new RuntimeException("cant get hash from " + document), true);
            return null;
        }
        if (i10 == 10 || TextUtils.isEmpty(r10) || r10.contains("-2147483648")) {
            i11 = 1;
        } else {
            i11 = 1;
            this.x.put(r10, new v7());
        }
        if (document != null && (obj instanceof ij)) {
            ij ijVar2 = (ij) obj;
            if (ijVar2.P && !ijVar2.N2()) {
                z5 downloadController = getDownloadController();
                downloadController.getClass();
                TLRPC.Document F0 = ijVar2.F0();
                if (F0 != null) {
                    g0.h3(new u5(downloadController, F0, ijVar2, 1));
                }
            }
        }
        i7 i7Var3 = (i7) concurrentHashMap.get(r10);
        int O = O(i7);
        if (i7Var3 != null) {
            if (i10 != 10 && i7Var3.y) {
                i7Var3.q(false);
            }
            i7Var3.V0 = O > 0 ? i11 : 0;
            i7Var3.b = j7Var;
            i7Var3.d = j10;
            i7Var3.c = z9;
            Utilities.d.c(new e7(i7Var3, j7Var, 1));
            if (i7Var3.W0 != O) {
                i7Var3.W0 = O;
            } else {
                i11 = 0;
            }
            i7Var3.e1.a(i7Var3);
            u7 u7Var = i7Var3.g0;
            if (u7Var != null) {
                long j14 = i7Var3.a0;
                long j15 = i7Var3.b0;
                if (j14 != j15 && j15 > 0) {
                    u7Var.a(i7Var3, j14, j15);
                }
            }
            if (i11 != 0) {
                i7Var3.e1.b(false);
            }
            return i7Var3;
        }
        File z15 = z(4);
        int i18 = 3;
        if (ewVar != null) {
            i7Var = new i7(ewVar);
            i12 = O;
            r12 = 0;
            i15 = 0;
            str2 = r10;
            i13 = 4;
            j11 = 0;
            i14 = 3;
            obj2 = obj;
        } else if (tL_fileLocationToBeDeprecated != null) {
            long j16 = tL_fileLocationToBeDeprecated.volume_id;
            i12 = O;
            r12 = 0;
            str2 = r10;
            i13 = 4;
            obj2 = obj;
            i15 = tL_fileLocationToBeDeprecated.dc_id + (tL_fileLocationToBeDeprecated.local_id << 16);
            i7Var = new i7(hcVar, obj2, str, j3);
            j11 = j16;
            i14 = 0;
        } else {
            i12 = O;
            boolean z16 = false;
            str2 = r10;
            i13 = 4;
            obj2 = obj;
            if (document != null) {
                i7Var2 = new i7(obj2, document);
                if (ij.R4(document)) {
                    i16 = 0;
                    i18 = i11;
                    j12 = 0;
                } else if (ij.L4(document)) {
                    long j17 = document.id;
                    i16 = document.dc_id;
                    j12 = j17;
                    i18 = 2;
                } else {
                    long j18 = document.id;
                    i16 = document.dc_id;
                    j12 = j18;
                }
                if (!ij.j4(document)) {
                    i7Var = i7Var2;
                    i15 = i16;
                    j11 = j12;
                    i14 = i18;
                    r12 = z16;
                }
            } else {
                if (m20Var != null) {
                    i7Var2 = new i7(this.currentAccount, m20Var);
                    if (m20Var.b != null) {
                        i14 = 4;
                        i7Var = i7Var2;
                        i15 = 0;
                    } else if (m20Var.e.equals("audio/ogg")) {
                        i7Var = i7Var2;
                        i15 = 0;
                        i14 = i11;
                    } else if (m20Var.e.startsWith("video/")) {
                        i7Var = i7Var2;
                        i15 = 0;
                        j11 = 0;
                        i14 = 2;
                        r12 = z16;
                    } else if (!ij.s3(m20Var) && m20Var.e.startsWith("image/")) {
                        i7Var = i7Var2;
                        i14 = 0;
                        i15 = 0;
                    }
                } else {
                    i14 = 4;
                    i15 = 0;
                    i7Var = i7Var3;
                }
                j11 = 0;
                r12 = z16;
            }
            i7Var = i7Var2;
            i15 = 0;
            j11 = 0;
            i14 = i18;
            r12 = z16;
        }
        int j19 = Utilities.j(i7Var.U - 1, i13, r12);
        boolean z17 = obj2 instanceof TL_stories.StoryItem;
        lg.f fVar = (i7Var.b0 > 20971520 || z17) ? this.c[j19] : this.b[j19];
        if (i10 != 0 && i10 != 10 && !z17) {
            if (i10 == 2) {
                i7Var.n0 = i11;
                i7Var.o0 = r12;
            }
            z10 = z15;
            i17 = i14;
            str3 = str2;
            j13 = j11;
        } else if (j11 != 0) {
            int i19 = i14;
            String f10 = this.d.f(i15, i19, j11, true);
            int i20 = i15;
            i17 = i19;
            j13 = j11;
            if (f10 != null) {
                File file4 = new File(f10);
                if (file4.exists()) {
                    String name = file4.getName();
                    file = file4.getParentFile();
                    str4 = name;
                    z11 = true;
                    if (z11) {
                        File z18 = z(i17);
                        if (z17) {
                            File z19 = z(6);
                            if (z19 != null) {
                                z18 = z19;
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            file = z18;
                            z12 = z13;
                        } else {
                            if ((i17 != 0 && i17 != 2) || r2.b || (E = E(obj2)) == null) {
                                file2 = z18;
                            } else {
                                file2 = z18;
                                long j20 = E.a;
                                if (!getMessagesController().A2(j20) && !m5.C(j20)) {
                                    if (obj2 instanceof ij) {
                                        ij ijVar3 = (ij) obj2;
                                        if (!ijVar3.i4() && !ij.S4(ijVar3.k) && !ijVar3.N2() && !ijVar3.k.noforwards) {
                                            ijVar = ijVar3;
                                            if (b6.k(j20 < 0 ? 1 : t3.V(getMessagesController().M0(Long.valueOf(-j20))) ? 4 : 2, E, ijVar, this.currentAccount)) {
                                                File z20 = i17 == 0 ? z(100) : z(101);
                                                if (z20 != null) {
                                                    file3 = z20;
                                                    z12 = true;
                                                } else {
                                                    file3 = file2;
                                                    z12 = false;
                                                }
                                                file = file3;
                                            }
                                        }
                                    } else {
                                        int i21 = E.c;
                                        if (i21 != 5 && i21 != 13 && i21 != 2) {
                                            ijVar = null;
                                            if (b6.k(j20 < 0 ? 1 : t3.V(getMessagesController().M0(Long.valueOf(-j20))) ? 4 : 2, E, ijVar, this.currentAccount)) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(B(document)) && (obj2 instanceof ij)) {
                                ij ijVar4 = (ij) obj2;
                                if (ijVar4.V2() && !ijVar4.i4() && !ij.S4(ijVar4.k)) {
                                    str3 = B(document);
                                    File z21 = z(5);
                                    if (z21 != null) {
                                        file = z21;
                                        z12 = true;
                                        if (z12) {
                                            i7Var.c1 = new di.s6(j13, i20, i17);
                                        }
                                    } else {
                                        file = file2;
                                        z12 = false;
                                        if (z12) {
                                        }
                                    }
                                }
                            }
                            file = file2;
                            str3 = str2;
                            z12 = false;
                            if (z12) {
                            }
                        }
                        str3 = str2;
                        if (z12) {
                        }
                    } else {
                        str3 = str4;
                    }
                    z10 = file;
                }
            }
            file = z15;
            str4 = str2;
            z11 = false;
            if (z11) {
            }
            z10 = file;
        } else {
            i17 = i14;
            j13 = j11;
            z10 = z(i17);
            str3 = str2;
        }
        int i22 = this.currentAccount;
        i7Var.T0 = z10;
        i7Var.U0 = z15;
        i7Var.R = i22;
        String str5 = str2;
        i7Var.r = str5;
        i7Var.s = str3;
        i7Var.e1 = fVar;
        if (i10 == 10) {
            i7Var.q(true);
            z14 = true;
        } else {
            z14 = true;
        }
        i7Var.g0 = new u7(this, obj2, document, str5, i17);
        concurrentHashMap.put(str5, i7Var);
        int i23 = i12;
        i7Var.W0 = i23;
        j7 j7Var2 = j7Var == null ? (j7) s8.H.get(Long.valueOf(j13)) : j7Var;
        if (j7Var2 != null) {
            i7Var.b = j7Var2;
            i7Var.d = j10;
            i7Var.c = z9;
            Utilities.d.c(new e7(i7Var, j7Var2, 1));
        }
        fVar.a(i7Var);
        fVar.b((!i7Var.j || i23 < 1048576) ? false : z14);
        if (r2.a) {
            StringBuilder u10 = a8.p0.u("create load operation fileName=", str5, " documentName=");
            u10.append(B(document));
            u10.append(" size=");
            u10.append(g0.i0(i7Var.b0, false, false));
            u10.append(" position in queue ");
            u10.append(((ArrayList) i7Var.e1.d).indexOf(i7Var));
            u10.append(" account=");
            jg.g.x(u10, this.currentAccount, " cacheType=", i10, " priority=");
            u10.append(i7Var.W0);
            u10.append(" stream=");
            u10.append(j7Var2);
            a8.b(u10.toString());
        }
        return i7Var;
    }

    public final void Z(TLRPC.Document document, boolean z9, boolean z10) {
        if (document == null) {
            return;
        }
        if (z10) {
            g0.h3(new s7(this, document, z9, 1));
        } else {
            a0(document, z9);
        }
    }

    public final void a0(TLRPC.Document document, boolean z9) {
        String r10 = r(null, document);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(r10);
        m10.append(z9 ? "p" : "");
        if (this.D.remove(m10.toString()) != null) {
            getNotificationCenter().k(qs.h1, r10);
        }
    }

    public final void b(String str, boolean z9) {
        if (str == null) {
            return;
        }
        J.c(new yf(this, z9, str, 4));
    }

    public final void b0(TLRPC.Document document, boolean z9, boolean z10) {
        if (document == null) {
            return;
        }
        if (z10) {
            g0.h3(new s7(this, document, z9, 0));
        } else {
            d0(document, z9);
        }
    }

    public final void c() {
        for (String str : this.x.keySet()) {
            v7 v7Var = (v7) this.x.get(str);
            p7 p7Var = v7Var != null ? v7Var.a : null;
            if (p7Var != null) {
                J.a(p7Var);
            }
            J.c(new n7(this, str, 0));
        }
    }

    public final void c0(TLRPC.Document document, boolean z9) {
        if (document == null) {
            return;
        }
        String r10 = r(null, document);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(r10);
        m10.append(z9 ? "" : "p");
        String sb2 = m10.toString();
        HashMap hashMap = this.D;
        if (hashMap.containsKey(sb2)) {
            StringBuilder m11 = com.google.android.recaptcha.internal.a.m(r10);
            m11.append(z9 ? "p" : "");
            hashMap.put(m11.toString(), Boolean.TRUE);
            getNotificationCenter().k(qs.h1, r10);
        }
    }

    public final void d(TLRPC.Document document) {
        f(document);
    }

    public final void d0(TLRPC.Document document, boolean z9) {
        String r10 = r(null, document);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(r10);
        m10.append(z9 ? "p" : "");
        this.D.put(m10.toString(), Boolean.TRUE);
        getNotificationCenter().k(qs.h1, r10);
    }

    public final void e(TLRPC.Document document, ew ewVar, m20 m20Var, TLRPC.FileLocation fileLocation, String str, String str2) {
        if (fileLocation == null && document == null && m20Var == null && ewVar == null && TextUtils.isEmpty(str2)) {
            return;
        }
        if (fileLocation != null) {
            str2 = r(str, fileLocation);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (ewVar != null) {
            str2 = r(null, ewVar);
        } else if (m20Var != null) {
            str2 = r(null, m20Var);
        }
        v7 v7Var = (v7) this.x.remove(str2);
        p7 p7Var = v7Var != null ? v7Var.a : null;
        boolean z9 = v7Var != null;
        if (p7Var != null) {
            J.a(p7Var);
        }
        J.c(new n7(this, str2, 1));
        if (!z9 || document == null) {
            return;
        }
        g0.h3(new r7(this, 1));
    }

    public final void e0(String str, TLObject tLObject) {
        boolean z9 = tLObject instanceof TLRPC.Document;
        f8 f8Var = this.d;
        if (z9) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            int i7 = document.key == null ? ij.R4(document) ? 1 : ij.L4(document) ? 2 : 3 : 4;
            long j3 = document.id;
            int i10 = document.dc_id;
            f8Var.getClass();
            f8Var.h(new d8(f8Var, j3, i10, i7, str, 1));
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
            long j10 = fileLocation.volume_id;
            int i11 = fileLocation.dc_id + (fileLocation.local_id << 16);
            f8Var.getClass();
            f8Var.h(new d8(f8Var, j10, i11, r1, str, 1));
        }
    }

    public final void f(TLRPC.Document document) {
        e(document, null, null, null, null, null);
    }

    public final void f0(final String str, final c20 c20Var) {
        final y4 y4Var = new y4(7, this, r0);
        ls[] lsVarArr = {new ls() { // from class: org.telegram.messenger.m7
            @Override // org.telegram.messenger.ls
            public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
                int i11 = qs.U1;
                String str2 = str;
                c20 c20Var2 = c20Var;
                y4 y4Var2 = y4Var;
                if (i7 == i11) {
                    if (objArr[0] == str2) {
                        c20Var2.a((TLRPC.InputFile) objArr[1]);
                        y4Var2.run();
                        return;
                    }
                    return;
                }
                if (i7 == qs.V1 && objArr[0] == str2) {
                    c20Var2.a(null);
                    y4Var2.run();
                }
            }
        }};
        getNotificationCenter().b(lsVarArr[0], qs.U1);
        getNotificationCenter().b(lsVarArr[0], qs.V1);
        h0(false, 67108864, str, false);
    }

    public final void g(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            e(null, null, null, null, null, (String) arrayList.get(i7));
        }
    }

    public final void g0(final String str, final boolean z9, final boolean z10, final long j3, final int i7, final boolean z11) {
        if (str == null) {
            return;
        }
        J.c(new Runnable() { // from class: org.telegram.messenger.l7
            @Override // java.lang.Runnable
            public final void run() {
                long j10;
                w7 w7Var = w7.this;
                HashMap hashMap = w7Var.y;
                ConcurrentHashMap concurrentHashMap = w7Var.h;
                ConcurrentHashMap concurrentHashMap2 = w7Var.n;
                boolean z12 = z9;
                String str2 = str;
                if (z12) {
                    if (concurrentHashMap2.containsKey(str2)) {
                        return;
                    }
                } else if (concurrentHashMap.containsKey(str2)) {
                    return;
                }
                long j11 = j3;
                if (j11 == 0 || ((Long) hashMap.get(str2)) == null) {
                    j10 = j11;
                } else {
                    hashMap.remove(str2);
                    j10 = 0;
                }
                String str3 = str2;
                y8 y8Var = new y8(w7Var.currentAccount, i7, j10, str3, z12);
                qb qbVar = w7Var.E;
                if (qbVar != null && j11 != 0) {
                    qbVar.a(y8Var, str3, 0L, j11, z12);
                    y8Var = y8Var;
                    str3 = str3;
                    z12 = z12;
                }
                if (z12) {
                    concurrentHashMap2.put(str3, y8Var);
                } else {
                    concurrentHashMap.put(str3, y8Var);
                }
                if (z11) {
                    y8Var.E = true;
                }
                boolean z13 = z10;
                y8Var.o = new t7(w7Var, z12, str3, z13);
                if (z13) {
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

    public final void h(int i7, TLRPC.Document document, ew ewVar, m20 m20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, String str) {
        String str2 = null;
        if (tL_fileLocationToBeDeprecated == null && document == null && m20Var == null && ewVar == null && TextUtils.isEmpty(null)) {
            return;
        }
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = r(str, tL_fileLocationToBeDeprecated);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (ewVar != null) {
            str2 = r(null, ewVar);
        } else if (m20Var != null) {
            str2 = r(null, m20Var);
        }
        J.c(new k7(this, str2, i7, 0));
    }

    public final void h0(boolean z9, int i7, String str, boolean z10) {
        g0(str, z9, z10, 0L, i7, false);
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().H);
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            ((ij) arrayList2.get(i7)).K(true);
            if (((ij) arrayList2.get(i7)).x0) {
                arrayList.add((ij) arrayList2.get(i7));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        g0.h3(new y4(8, this, arrayList));
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
        em emVar = new em(f8Var, arrayList2, jArr, countDownLatch, 6);
        f8Var.d();
        p5 p5Var = f8Var.a;
        Handler handler = p5Var.a;
        if (handler != null) {
            handler.postAtFrontOfQueue(emVar);
        } else {
            synchronized (p5Var.b) {
                try {
                    ArrayList arrayList3 = p5Var.c;
                    if (arrayList3 != null) {
                        arrayList3.add(new o5(1, 0L, emVar));
                    } else {
                        p5Var.a.postAtFrontOfQueue(emVar);
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
        jg.g.u(jArr[0], sb2);
        boolean z9 = r2.a;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a8.g(new Exception("warning, not allowed in main thread"), true);
        }
    }

    public final void n(String str, boolean z9, long j3, long j10, Float f10) {
        J.c(new di.d6(this, z9, str, j3, j10, f10));
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
        arrayList.addAll(getDownloadController().G);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((ij) arrayList.get(i7)).Q = true;
        }
    }
}
