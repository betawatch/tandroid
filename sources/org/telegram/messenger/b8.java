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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b8 extends f1 {
    public static Pattern I;
    public static volatile r5 J = new r5("fileUploadQueue");
    public static SparseArray K = null;
    public static final b8[] L = new b8[4];
    public static final v7 M = new v7();
    public final HashMap D;
    public rb E;
    public int F;
    public final ConcurrentHashMap G;
    public final w7 H;
    public int a;
    public final bg.h[] b;
    public final bg.h[] c;
    public final k8 d;
    public final LinkedList e;
    public final LinkedList f;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap n;
    public int r;
    public int s;
    public final ConcurrentHashMap w;
    public final ConcurrentHashMap x;
    public final HashMap y;

    public b8(int i10) {
        super(i10);
        this.b = new bg.h[5];
        this.c = new bg.h[5];
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
        this.H = new w7(this, 0);
        this.d = new k8(i10);
        int i11 = 0;
        while (true) {
            bg.h[] hVarArr = this.b;
            if (i11 >= hVarArr.length) {
                break;
            }
            hVarArr[i11] = new bg.h(i10, 0, J);
            this.c[i11] = new bg.h(i10, 1, J);
            i11++;
        }
        if (v2.a) {
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
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
            }
            str3 = str;
        }
        String q6 = q(str3);
        return q6 != null ? q6 : "";
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

    public static j8 E(Object obj) {
        if (!(obj instanceof String)) {
            if (!(obj instanceof jj)) {
                if (!(obj instanceof TL_stories.StoryItem)) {
                    return null;
                }
                j8 j8Var = new j8();
                j8Var.a = ((TL_stories.StoryItem) obj).dialogId;
                j8Var.c = 23;
                return j8Var;
            }
            jj jjVar = (jj) obj;
            j8 j8Var2 = new j8();
            j8Var2.b = jjVar.f1();
            j8Var2.a = jj.B0(jjVar.k);
            j8Var2.c = jjVar.D;
            j8Var2.d = jjVar.T1();
            return j8Var2;
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
            j8 j8Var3 = new j8();
            j8Var3.b = Integer.parseInt(matcher.group(1));
            j8Var3.a = Long.parseLong(matcher.group(2));
            j8Var3.c = Integer.parseInt(matcher.group(3));
            j8Var3.d = Long.parseLong(matcher.group(4));
            return j8Var3;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static b8 G(int i10) {
        b8 b8Var;
        b8[] b8VarArr = L;
        b8 b8Var2 = b8VarArr[i10];
        if (b8Var2 != null) {
            return b8Var2;
        }
        synchronized (b8.class) {
            try {
                b8Var = b8VarArr[i10];
                if (b8Var == null) {
                    b8Var = new b8(i10);
                    b8VarArr[i10] = b8Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b8Var;
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
        int i10;
        int i11;
        long j10;
        long j11;
        int i12;
        File z13;
        long j12;
        int i13;
        int i14;
        String f7;
        int i15 = 0;
        if (!z10) {
            if (tLObject instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) tLObject;
                if (!TextUtils.isEmpty(document.localPath)) {
                    return new File(document.localPath);
                }
                int i16 = document.key == null ? jj.Q4(document) ? 1 : jj.K4(document) ? 2 : 3 : 4;
                j10 = document.id;
                i10 = document.dc_id;
                z12 = z(i16);
                i11 = i16;
            } else {
                if (tLObject instanceof TLRPC.Photo) {
                    return K(w(((TLRPC.Photo) tLObject).sizes, i0.Z0(true), false, null, false), str, false, z11);
                }
                if (tLObject instanceof TLRPC.PhotoSize) {
                    TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
                    if ((photoSize instanceof TLRPC.TL_photoStrippedSize) || (photoSize instanceof TLRPC.TL_photoPathSize)) {
                        z13 = null;
                    } else {
                        TLRPC.FileLocation fileLocation = photoSize.location;
                        if (fileLocation == null || fileLocation.key != null || ((fileLocation.volume_id == -2147483648L && fileLocation.local_id < 0) || photoSize.size < 0)) {
                            i15 = 4;
                            z13 = z(4);
                        } else {
                            z13 = z(0);
                        }
                    }
                    TLRPC.FileLocation fileLocation2 = photoSize.location;
                    j12 = fileLocation2.volume_id;
                    i13 = fileLocation2.dc_id;
                    i14 = fileLocation2.local_id;
                } else if (tLObject instanceof TLRPC.TL_videoSize) {
                    TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
                    TLRPC.FileLocation fileLocation3 = tL_videoSize.location;
                    if (fileLocation3 == null || fileLocation3.key != null || ((fileLocation3.volume_id == -2147483648L && fileLocation3.local_id < 0) || tL_videoSize.size < 0)) {
                        i15 = 4;
                        z13 = z(4);
                    } else {
                        z13 = z(0);
                    }
                    TLRPC.FileLocation fileLocation4 = tL_videoSize.location;
                    j12 = fileLocation4.volume_id;
                    i13 = fileLocation4.dc_id;
                    i14 = fileLocation4.local_id;
                } else if (tLObject instanceof TLRPC.FileLocation) {
                    TLRPC.FileLocation fileLocation5 = (TLRPC.FileLocation) tLObject;
                    if (fileLocation5.key == null) {
                        j11 = fileLocation5.volume_id;
                        if (j11 != -2147483648L || fileLocation5.local_id >= 0) {
                            i12 = fileLocation5.dc_id + (fileLocation5.local_id << 16);
                            z12 = z(0);
                            j10 = j11;
                            i10 = i12;
                            i11 = i15;
                        }
                    }
                    z12 = z(4);
                    j11 = 0;
                    i12 = 0;
                    j10 = j11;
                    i10 = i12;
                    i11 = i15;
                } else if ((tLObject instanceof TLRPC.UserProfilePhoto) || (tLObject instanceof TLRPC.ChatPhoto)) {
                    z12 = "s".equals("s") ? z(4) : z(0);
                } else if (tLObject instanceof b30) {
                    b30 b30Var = (b30) tLObject;
                    z12 = b30Var.e.startsWith("image/") ? z(0) : b30Var.e.startsWith("audio/") ? z(1) : b30Var.e.startsWith("video/") ? z(2) : z(3);
                } else if ((tLObject instanceof TLRPC.TL_secureFile) || (tLObject instanceof pw)) {
                    z12 = z(4);
                } else {
                    i10 = 0;
                    i11 = 0;
                    z12 = null;
                    j10 = 0;
                }
                int i17 = (i14 << 16) + i13;
                j10 = j12;
                i10 = i17;
                z12 = z13;
                i11 = i15;
            }
            return z12 != null ? new File("") : (j10 == 0 || (f7 = G(d20.s0).d.f(i10, i11, j10, z11)) == null) ? new File(z12, r(str, tLObject)) : new File(f7);
        }
        z12 = z(4);
        j10 = 0;
        i10 = 0;
        i11 = 0;
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
        TLRPC.PhotoSize w9;
        TLRPC.PhotoSize w10;
        TLRPC.PhotoSize w11;
        if (message == null) {
            return new File("");
        }
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (w11 = w(arrayList, i0.Z0(false), false, null, false)) != null) {
                    return K(w11, null, z10, z11);
                }
            }
        } else {
            if (jj.o1(message) instanceof TLRPC.TL_messageMediaDocument) {
                return K(jj.o1(message).document, null, z10 || jj.o1(message).ttl_seconds != 0, z11);
            }
            if (jj.o1(message) instanceof TLRPC.TL_messageMediaPhoto) {
                ArrayList<TLRPC.PhotoSize> arrayList2 = jj.o1(message).photo.sizes;
                if (arrayList2.size() > 0 && (w10 = w(arrayList2, i0.Z0(true), false, null, true)) != null) {
                    return K(w10, null, z10 || jj.o1(message).ttl_seconds != 0, z11);
                }
            } else if (jj.o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
                if (jj.o1(message).webpage.document != null) {
                    return K(jj.o1(message).webpage.document, null, z10, z11);
                }
                if (jj.o1(message).webpage.photo != null) {
                    ArrayList<TLRPC.PhotoSize> arrayList3 = jj.o1(message).webpage.photo.sizes;
                    if (arrayList3.size() > 0 && (w9 = w(arrayList3, i0.Z0(false), false, null, false)) != null) {
                        return K(w9, null, z10, z11);
                    }
                }
            } else if (jj.o1(message) instanceof TLRPC.TL_messageMediaInvoice) {
                return K(((TLRPC.TL_messageMediaInvoice) jj.o1(message)).photo, null, true, z11);
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i10);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.VideoSize S(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i10 = 0; i10 < photo.video_sizes.size(); i10++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i10);
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
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.FileLocation fileLocation = photo.sizes.get(i10).location;
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
        } catch (Exception e) {
            f8.g(e, false);
            if (z10) {
                a(countDownLatch, false);
            }
        }
    }

    public static File j(int i10) {
        return (File) K.get(i10);
    }

    public static boolean m(int i10, long j10) {
        boolean q6 = d20.i(c.a(i10).a).q();
        if (j10 >= 2097152000) {
            return j10 < 4194304000L && q6;
        }
        return true;
    }

    public static void o(GZIPInputStream gZIPInputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[TLObject.FLAG_12];
        int i10 = 0;
        do {
            int read = gZIPInputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, read);
            i10 += read;
        } while (i10 < 2097152);
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
    }

    public static void p(int i10, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        J.c(new a1(arrayList, i10, 1));
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
                return a1.g.q(sb2, document.id, substring);
            }
            return document.dc_id + "_" + document.id;
        }
        if (tLObject instanceof pw) {
            TLRPC.TL_secureFile tL_secureFile = ((pw) tLObject).b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_secureFile.dc_id);
            sb3.append("_");
            return a1.g.q(sb3, tL_secureFile.id, ".jpg");
        }
        if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(tL_secureFile2.dc_id);
            sb4.append("_");
            return a1.g.q(sb4, tL_secureFile2.id, ".jpg");
        }
        if (tLObject instanceof b30) {
            b30 b30Var = (b30) tLObject;
            return Utilities.a(b30Var.a) + "." + hc.B(b30Var.a, H(b30Var.e));
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

    public static TLRPC.PhotoSize u(int i10, ArrayList arrayList) {
        return w(arrayList, i10, false, null, false);
    }

    public static TLRPC.PhotoSize v(int i10, ArrayList arrayList, boolean z10) {
        return w(arrayList, i10, z10, null, false);
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
    public static TLRPC.PhotoSize w(ArrayList arrayList, int i10, boolean z10, TLRPC.PhotoSize photoSize, boolean z11) {
        int max;
        TLRPC.PhotoSize photoSize2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.PhotoSize photoSize3 = (TLRPC.PhotoSize) arrayList.get(i12);
                if (photoSize3 != null && photoSize3 != photoSize && !(photoSize3 instanceof TLRPC.TL_photoSizeEmpty) && !(photoSize3 instanceof TLRPC.TL_photoPathSize) && (!z11 || !(photoSize3 instanceof TLRPC.TL_photoStrippedSize))) {
                    if (z10) {
                        max = Math.min(photoSize3.h, photoSize3.w);
                        if (photoSize2 != null) {
                            if (i10 > 100) {
                                TLRPC.FileLocation fileLocation = photoSize2.location;
                                if (fileLocation != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (i10 > i11) {
                                    if (i11 >= max) {
                                    }
                                }
                            }
                        }
                        photoSize2 = photoSize3;
                        i11 = max;
                    } else {
                        max = Math.max(photoSize3.w, photoSize3.h);
                        if (photoSize2 != null) {
                            if (i10 > 100) {
                                TLRPC.FileLocation fileLocation2 = photoSize2.location;
                                if (fileLocation2 != null) {
                                }
                            }
                            if (!(photoSize3 instanceof TLRPC.TL_photoCachedSize)) {
                                if (max <= i10) {
                                    if (i11 >= max) {
                                    }
                                }
                            }
                        }
                        photoSize2 = photoSize3;
                        i11 = max;
                    }
                }
            }
        }
        return photoSize2;
    }

    public static TLRPC.VideoSize x(int i10, ArrayList arrayList) {
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.VideoSize videoSize2 = (TLRPC.VideoSize) arrayList.get(i12);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    int max = Math.max(videoSize2.w, videoSize2.h);
                    if (videoSize == null || ((i10 > 100 && (fileLocation = videoSize.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (max <= i10 && i11 < max))) {
                        videoSize = videoSize2;
                        i11 = max;
                    }
                }
            }
        }
        return videoSize;
    }

    public static File z(int i10) {
        File file = (File) K.get(i10);
        if (file == null && i10 != 4) {
            file = (File) K.get(4);
        }
        if (v2.b && file != null) {
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
        int i10 = this.F;
        this.F = i10 + 1;
        this.G.put(Integer.valueOf(i10), obj);
        return i10;
    }

    public final int P(int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        if (i10 == 3) {
            i11 = this.a;
            this.a = i11 + 1;
            i12 = 1048577;
        } else {
            if (i10 != 2) {
                return i10 == 1 ? 65536 : 0;
            }
            i11 = this.a;
            this.a = i11 + 1;
            i12 = 65537;
        }
        return i11 + i12;
    }

    public final void Q(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().H);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((jj) arrayList.get(i10)).Q = true;
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
        return this.D.containsKey(sb2.toString());
    }

    public final void W(ic icVar, Object obj, String str, int i10, int i11) {
        if (icVar == null) {
            return;
        }
        Y(icVar.i, icVar.h, icVar.v, icVar.f, icVar, obj, str, icVar.r(), i10, (i11 != 0 || (icVar.c == null && (icVar.k == null || icVar.r() != 0))) ? i11 : 1);
    }

    public final void X(TLRPC.Document document, Object obj, int i10, int i11) {
        if (document == null) {
            return;
        }
        Y(document, null, null, null, null, obj, null, 0L, i10, (i11 != 0 || document.key == null) ? i11 : 1);
    }

    public final void Y(TLRPC.Document document, pw pwVar, b30 b30Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ic icVar, Object obj, String str, long j10, int i10, int i11) {
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
            } else if (b30Var != null) {
                str3 = r(null, b30Var);
            }
        }
        String str4 = str3;
        u7 u7Var = new u7(this, document, pwVar, b30Var, tL_fileLocationToBeDeprecated, icVar, obj, str2, j10, i10, i11);
        if (i11 != 10 && !TextUtils.isEmpty(str4) && !str4.contains("-2147483648")) {
            a8 a8Var = new a8();
            a8Var.a = u7Var;
            this.x.put(str4, a8Var);
        }
        J.c(u7Var);
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
    public final m7 Z(TLRPC.Document document, pw pwVar, b30 b30Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ic icVar, Object obj, String str, long j10, int i10, n7 n7Var, long j11, boolean z10, int i11) {
        int i12;
        int i13;
        String str2;
        int i14;
        Object obj2;
        int i15;
        int i16;
        m7 m7Var;
        long j12;
        m7 m7Var2;
        int i17;
        long j13;
        ?? r12;
        int i18;
        long j14;
        File z11;
        String str3;
        File file;
        String str4;
        boolean z12;
        j8 E;
        File file2;
        jj jjVar;
        File file3;
        boolean z13;
        boolean z14;
        boolean z15;
        ConcurrentHashMap concurrentHashMap = this.w;
        String r10 = tL_fileLocationToBeDeprecated != null ? r(str, tL_fileLocationToBeDeprecated) : pwVar != null ? r(null, pwVar) : document != null ? r(null, document) : b30Var != null ? r(null, b30Var) : null;
        if (r10 == null || r10.contains("-2147483648")) {
            return null;
        }
        if (r10.startsWith("0_0")) {
            f8.g(new RuntimeException("cant get hash from " + document), true);
            return null;
        }
        if (i11 == 10 || TextUtils.isEmpty(r10) || r10.contains("-2147483648")) {
            i12 = 1;
        } else {
            i12 = 1;
            this.x.put(r10, new a8());
        }
        if (document != null && (obj instanceof jj)) {
            jj jjVar2 = (jj) obj;
            if (jjVar2.P && !jjVar2.M2()) {
                b6 downloadController = getDownloadController();
                downloadController.getClass();
                TLRPC.Document F0 = jjVar2.F0();
                if (F0 != null) {
                    i0.g3(new w5(downloadController, F0, jjVar2, 1));
                }
            }
        }
        m7 m7Var3 = (m7) concurrentHashMap.get(r10);
        int P = P(i10);
        if (m7Var3 != null) {
            if (i11 != 10 && m7Var3.y) {
                m7Var3.q(false);
            }
            m7Var3.V0 = P > 0 ? i12 : 0;
            m7Var3.b = n7Var;
            m7Var3.d = j11;
            m7Var3.c = z10;
            Utilities.d.c(new i7(m7Var3, n7Var, 1));
            if (m7Var3.W0 != P) {
                m7Var3.W0 = P;
            } else {
                i12 = 0;
            }
            m7Var3.e1.a(m7Var3);
            z7 z7Var = m7Var3.g0;
            if (z7Var != null) {
                long j15 = m7Var3.a0;
                long j16 = m7Var3.b0;
                if (j15 != j16 && j16 > 0) {
                    z7Var.a(m7Var3, j15, j16);
                }
            }
            if (i12 != 0) {
                m7Var3.e1.b(false);
            }
            return m7Var3;
        }
        File z16 = z(4);
        int i19 = 3;
        if (pwVar != null) {
            m7Var = new m7(pwVar);
            i13 = P;
            r12 = 0;
            i16 = 0;
            str2 = r10;
            i14 = 4;
            j12 = 0;
            i15 = 3;
            obj2 = obj;
        } else if (tL_fileLocationToBeDeprecated != null) {
            long j17 = tL_fileLocationToBeDeprecated.volume_id;
            i13 = P;
            r12 = 0;
            str2 = r10;
            i14 = 4;
            obj2 = obj;
            i16 = tL_fileLocationToBeDeprecated.dc_id + (tL_fileLocationToBeDeprecated.local_id << 16);
            m7Var = new m7(icVar, obj2, str, j10);
            j12 = j17;
            i15 = 0;
        } else {
            i13 = P;
            boolean z17 = false;
            str2 = r10;
            i14 = 4;
            obj2 = obj;
            if (document != null) {
                m7Var2 = new m7(obj2, document);
                if (jj.Q4(document)) {
                    i17 = 0;
                    i19 = i12;
                    j13 = 0;
                } else if (jj.K4(document)) {
                    long j18 = document.id;
                    i17 = document.dc_id;
                    j13 = j18;
                    i19 = 2;
                } else {
                    long j19 = document.id;
                    i17 = document.dc_id;
                    j13 = j19;
                }
                if (!jj.i4(document)) {
                    m7Var = m7Var2;
                    i16 = i17;
                    j12 = j13;
                    i15 = i19;
                    r12 = z17;
                }
            } else {
                if (b30Var != null) {
                    m7Var2 = new m7(this.currentAccount, b30Var);
                    if (b30Var.b != null) {
                        i15 = 4;
                        m7Var = m7Var2;
                        i16 = 0;
                    } else if (b30Var.e.equals("audio/ogg")) {
                        m7Var = m7Var2;
                        i16 = 0;
                        i15 = i12;
                    } else if (b30Var.e.startsWith("video/")) {
                        m7Var = m7Var2;
                        i16 = 0;
                        j12 = 0;
                        i15 = 2;
                        r12 = z17;
                    } else if (!jj.r3(b30Var) && b30Var.e.startsWith("image/")) {
                        m7Var = m7Var2;
                        i15 = 0;
                        i16 = 0;
                    }
                } else {
                    i15 = 4;
                    i16 = 0;
                    m7Var = m7Var3;
                }
                j12 = 0;
                r12 = z17;
            }
            m7Var = m7Var2;
            i16 = 0;
            j12 = 0;
            i15 = i19;
            r12 = z17;
        }
        int j20 = Utilities.j(m7Var.U - 1, i14, r12);
        boolean z18 = obj2 instanceof TL_stories.StoryItem;
        bg.h hVar = (m7Var.b0 > 20971520 || z18) ? this.c[j20] : this.b[j20];
        if (i11 != 0 && i11 != 10 && !z18) {
            if (i11 == 2) {
                m7Var.n0 = i12;
                m7Var.o0 = r12;
            }
            z11 = z16;
            i18 = i15;
            str3 = str2;
            j14 = j12;
        } else if (j12 != 0) {
            int i20 = i15;
            String f7 = this.d.f(i16, i20, j12, true);
            int i21 = i16;
            i18 = i20;
            j14 = j12;
            if (f7 != null) {
                File file4 = new File(f7);
                if (file4.exists()) {
                    String name = file4.getName();
                    file = file4.getParentFile();
                    str4 = name;
                    z12 = true;
                    if (z12) {
                        File z19 = z(i18);
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
                            if ((i18 != 0 && i18 != 2) || v2.b || (E = E(obj2)) == null) {
                                file2 = z19;
                            } else {
                                file2 = z19;
                                long j21 = E.a;
                                if (!getMessagesController().z2(j21) && !o5.C(j21)) {
                                    if (obj2 instanceof jj) {
                                        jj jjVar3 = (jj) obj2;
                                        if (!jjVar3.h4() && !jj.R4(jjVar3.k) && !jjVar3.M2() && !jjVar3.k.noforwards) {
                                            jjVar = jjVar3;
                                            if (js.l(j21 < 0 ? 1 : w3.V(getMessagesController().L0(Long.valueOf(-j21))) ? 4 : 2, E, jjVar, this.currentAccount)) {
                                                File z21 = i18 == 0 ? z(100) : z(101);
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
                                        int i22 = E.c;
                                        if (i22 != 5 && i22 != 13 && i22 != 2) {
                                            jjVar = null;
                                            if (js.l(j21 < 0 ? 1 : w3.V(getMessagesController().L0(Long.valueOf(-j21))) ? 4 : 2, E, jjVar, this.currentAccount)) {
                                            }
                                        }
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(B(document)) && (obj2 instanceof jj)) {
                                jj jjVar4 = (jj) obj2;
                                if (jjVar4.U2() && !jjVar4.h4() && !jj.R4(jjVar4.k)) {
                                    str3 = B(document);
                                    File z22 = z(5);
                                    if (z22 != null) {
                                        file = z22;
                                        z13 = true;
                                        if (z13) {
                                            m7Var.c1 = new j4.w(j14, i21, i18);
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
            i18 = i15;
            j14 = j12;
            z11 = z(i18);
            str3 = str2;
        }
        int i23 = this.currentAccount;
        m7Var.T0 = z11;
        m7Var.U0 = z16;
        m7Var.R = i23;
        String str5 = str2;
        m7Var.r = str5;
        m7Var.s = str3;
        m7Var.e1 = hVar;
        if (i11 == 10) {
            m7Var.q(true);
            z15 = true;
        } else {
            z15 = true;
        }
        m7Var.g0 = new z7(this, obj2, document, str5, i18);
        concurrentHashMap.put(str5, m7Var);
        int i24 = i13;
        m7Var.W0 = i24;
        n7 n7Var2 = n7Var == null ? (n7) x8.H.get(Long.valueOf(j14)) : n7Var;
        if (n7Var2 != null) {
            m7Var.b = n7Var2;
            m7Var.d = j11;
            m7Var.c = z10;
            Utilities.d.c(new i7(m7Var, n7Var2, 1));
        }
        hVar.a(m7Var);
        hVar.b((!m7Var.j || i24 < 1048576) ? false : z15);
        if (v2.a) {
            StringBuilder u10 = a1.g.u("create load operation fileName=", str5, " documentName=");
            u10.append(B(document));
            u10.append(" size=");
            u10.append(i0.i0(m7Var.b0, false, false));
            u10.append(" position in queue ");
            u10.append(((ArrayList) m7Var.e1.d).indexOf(m7Var));
            u10.append(" account=");
            i0.a.t(u10, this.currentAccount, " cacheType=", i11, " priority=");
            u10.append(m7Var.W0);
            u10.append(" stream=");
            u10.append(n7Var2);
            f8.b(u10.toString());
        }
        return m7Var;
    }

    public final void a0(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            i0.g3(new x7(this, document, z10, 1));
        } else {
            b0(document, z10);
        }
    }

    public final void b(String str, boolean z10) {
        if (str == null) {
            return;
        }
        J.c(new wf(this, z10, str, 4));
    }

    public final void b0(TLRPC.Document document, boolean z10) {
        String r10 = r(null, document);
        StringBuilder t10 = a1.g.t(r10);
        t10.append(z10 ? "p" : "");
        if (this.D.remove(t10.toString()) != null) {
            getNotificationCenter().k(zs.h1, r10);
        }
    }

    public final void c() {
        for (String str : this.x.keySet()) {
            a8 a8Var = (a8) this.x.get(str);
            u7 u7Var = a8Var != null ? a8Var.a : null;
            if (u7Var != null) {
                J.a(u7Var);
            }
            J.c(new s7(this, str, 0));
        }
    }

    public final void c0(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            i0.g3(new x7(this, document, z10, 0));
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
        String r10 = r(null, document);
        StringBuilder t10 = a1.g.t(r10);
        t10.append(z10 ? "" : "p");
        String sb2 = t10.toString();
        HashMap hashMap = this.D;
        if (hashMap.containsKey(sb2)) {
            StringBuilder t11 = a1.g.t(r10);
            t11.append(z10 ? "p" : "");
            hashMap.put(t11.toString(), Boolean.TRUE);
            getNotificationCenter().k(zs.h1, r10);
        }
    }

    public final void e(TLRPC.Document document, pw pwVar, b30 b30Var, TLRPC.FileLocation fileLocation, String str, String str2) {
        if (fileLocation == null && document == null && b30Var == null && pwVar == null && TextUtils.isEmpty(str2)) {
            return;
        }
        if (fileLocation != null) {
            str2 = r(str, fileLocation);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (pwVar != null) {
            str2 = r(null, pwVar);
        } else if (b30Var != null) {
            str2 = r(null, b30Var);
        }
        a8 a8Var = (a8) this.x.remove(str2);
        u7 u7Var = a8Var != null ? a8Var.a : null;
        boolean z10 = a8Var != null;
        if (u7Var != null) {
            J.a(u7Var);
        }
        J.c(new s7(this, str2, 1));
        if (!z10 || document == null) {
            return;
        }
        i0.g3(new w7(this, 1));
    }

    public final void e0(TLRPC.Document document, boolean z10) {
        String r10 = r(null, document);
        StringBuilder t10 = a1.g.t(r10);
        t10.append(z10 ? "p" : "");
        this.D.put(t10.toString(), Boolean.TRUE);
        getNotificationCenter().k(zs.h1, r10);
    }

    public final void f(TLRPC.Document document) {
        e(document, null, null, null, null, null);
    }

    public final void f0(String str, TLObject tLObject) {
        boolean z10 = tLObject instanceof TLRPC.Document;
        k8 k8Var = this.d;
        if (z10) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            int i10 = document.key == null ? jj.Q4(document) ? 1 : jj.K4(document) ? 2 : 3 : 4;
            long j10 = document.id;
            int i11 = document.dc_id;
            k8Var.getClass();
            k8Var.h(new i8(k8Var, j10, i11, i10, str, 1));
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
            int i12 = fileLocation.dc_id + (fileLocation.local_id << 16);
            k8Var.getClass();
            k8Var.h(new i8(k8Var, j11, i12, r1, str, 1));
        }
    }

    public final void g(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(null, null, null, null, null, (String) arrayList.get(i10));
        }
    }

    public final void g0(final String str, final q20 q20Var) {
        final t6 t6Var = new t6(5, this, r0);
        us[] usVarArr = {new us() { // from class: org.telegram.messenger.r7
            @Override // org.telegram.messenger.us
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                int i12 = zs.U1;
                String str2 = str;
                q20 q20Var2 = q20Var;
                t6 t6Var2 = t6Var;
                if (i10 == i12) {
                    if (objArr[0] == str2) {
                        q20Var2.a((TLRPC.InputFile) objArr[1]);
                        t6Var2.run();
                        return;
                    }
                    return;
                }
                if (i10 == zs.V1 && objArr[0] == str2) {
                    q20Var2.a(null);
                    t6Var2.run();
                }
            }
        }};
        getNotificationCenter().b(usVarArr[0], zs.U1);
        getNotificationCenter().b(usVarArr[0], zs.V1);
        i0(false, 67108864, str, false);
    }

    public final void h(int i10, TLRPC.Document document, pw pwVar, b30 b30Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, String str) {
        String str2 = null;
        if (tL_fileLocationToBeDeprecated == null && document == null && b30Var == null && pwVar == null && TextUtils.isEmpty(null)) {
            return;
        }
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = r(str, tL_fileLocationToBeDeprecated);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (pwVar != null) {
            str2 = r(null, pwVar);
        } else if (b30Var != null) {
            str2 = r(null, b30Var);
        }
        J.c(new o7(this, str2, i10, 0));
    }

    public final void h0(final String str, final boolean z10, final boolean z11, final long j10, final int i10, final boolean z12) {
        if (str == null) {
            return;
        }
        J.c(new Runnable() { // from class: org.telegram.messenger.p7
            @Override // java.lang.Runnable
            public final void run() {
                long j11;
                b8 b8Var = b8.this;
                HashMap hashMap = b8Var.y;
                ConcurrentHashMap concurrentHashMap = b8Var.h;
                ConcurrentHashMap concurrentHashMap2 = b8Var.n;
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
                d9 d9Var = new d9(b8Var.currentAccount, i10, j11, str3, z13);
                rb rbVar = b8Var.E;
                if (rbVar != null && j12 != 0) {
                    rbVar.a(d9Var, str3, 0L, j12, z13);
                    d9Var = d9Var;
                    str3 = str3;
                    z13 = z13;
                }
                if (z13) {
                    concurrentHashMap2.put(str3, d9Var);
                } else {
                    concurrentHashMap.put(str3, d9Var);
                }
                if (z12) {
                    d9Var.E = true;
                }
                boolean z14 = z11;
                d9Var.o = new y7(b8Var, z13, str3, z14);
                if (z14) {
                    int i11 = b8Var.s;
                    if (i11 >= 1) {
                        b8Var.f.add(d9Var);
                        return;
                    } else {
                        b8Var.s = i11 + 1;
                        d9Var.c();
                        return;
                    }
                }
                int i12 = b8Var.r;
                if (i12 >= 1) {
                    b8Var.e.add(d9Var);
                } else {
                    b8Var.r = i12 + 1;
                    d9Var.c();
                }
            }
        });
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().H);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((jj) arrayList2.get(i10)).K(true);
            if (((jj) arrayList2.get(i10)).x0) {
                arrayList.add((jj) arrayList2.get(i10));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        i0.g3(new t6(6, this, arrayList));
    }

    public final void i0(boolean z10, int i10, String str, boolean z11) {
        h0(str, z10, z11, 0L, i10, false);
    }

    public final boolean k(String str) {
        m7 m7Var;
        if (str == null || (m7Var = (m7) this.w.get(str)) == null || !m7Var.l) {
            return false;
        }
        m7Var.l = false;
        return true;
    }

    public final void l(ArrayList arrayList) {
        k8 k8Var = this.d;
        k8Var.getClass();
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        long currentTimeMillis = System.currentTimeMillis();
        long[] jArr = new long[1];
        ul ulVar = new ul(k8Var, arrayList2, jArr, countDownLatch, 6);
        k8Var.d();
        r5 r5Var = k8Var.a;
        Handler handler = r5Var.a;
        if (handler != null) {
            handler.postAtFrontOfQueue(ulVar);
        } else {
            synchronized (r5Var.b) {
                try {
                    ArrayList arrayList3 = r5Var.c;
                    if (arrayList3 != null) {
                        arrayList3.add(new q5(1, 0L, ulVar));
                    } else {
                        r5Var.a.postAtFrontOfQueue(ulVar);
                    }
                } finally {
                }
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            f8.g(e, true);
        }
        StringBuilder sb2 = new StringBuilder("checkMediaExistance size=");
        sb2.append(arrayList.size());
        sb2.append(" time=");
        sb2.append(System.currentTimeMillis() - currentTimeMillis);
        sb2.append(" thread_time=");
        i0.a.q(jArr[0], sb2);
        boolean z10 = v2.a;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            f8.g(new Exception("warning, not allowed in main thread"), true);
        }
    }

    public final void n(String str, boolean z10, long j10, long j11, Float f7) {
        J.c(new q7(this, z10, str, j10, j11, f7));
    }

    public final float t(String str, float f7) {
        m7 m7Var;
        if (!TextUtils.isEmpty(str) && (m7Var = (m7) this.w.get(str)) != null) {
            ArrayList arrayList = m7Var.N;
            if (m7Var.b0 != 0 && arrayList != null) {
                return (m7Var.h((int) (r5 * f7), r5, arrayList) / m7Var.b0) + f7;
            }
        }
        return 0.0f;
    }

    public final void y(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().G);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((jj) arrayList.get(i10)).Q = true;
        }
    }
}
