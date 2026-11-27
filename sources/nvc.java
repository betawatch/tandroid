// default package

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.xml.parsers.SAXParserFactory;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.SerializedData;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class nvc {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static volatile File b;

    public static ArrayList a(String str) {
        byte[] v = Utilities.v(str);
        int length = v.length / 52;
        SerializedData serializedData = new SerializedData(v);
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            float readFloat = serializedData.readFloat(true);
            float readFloat2 = serializedData.readFloat(true);
            float readFloat3 = serializedData.readFloat(true);
            float readFloat4 = serializedData.readFloat(true);
            float[] fArr = {serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true), serializedData.readFloat(true)};
            RectF rectF = new RectF(readFloat, readFloat2, readFloat3 + readFloat, readFloat4 + readFloat2);
            Matrix matrix = new Matrix();
            matrix.setValues(fArr);
            arrayList.add(new ivc(rectF, matrix));
        }
        serializedData.cleanup();
        return arrayList;
    }

    public static File b(pi5 pi5Var) {
        File file = b;
        if (file == null) {
            file = new File(a.b.getCacheDir(), "wallpaper/mask");
            b = file;
            Pattern pattern = gvc.a;
            SharedPreferences e1 = uc7.e1();
            if (e1.getInt("wallpaperFilesCleanup", 0) < 1) {
                Utilities.e.c(new olc(e1, (byte) 16));
            }
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, pi5Var.a());
    }

    public static avc c() {
        Point point = hl.q;
        return e(new pi5("r-default_pattern", Math.min(1440, Math.min(point.x, point.y))), new grb((byte) 28));
    }

    public static avc d(String str) {
        avc g;
        Object putIfAbsent;
        if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(str)) {
            return c();
        }
        pi5 c = pi5.c(str);
        String a2 = c.a();
        ConcurrentHashMap concurrentHashMap = a;
        Object obj = concurrentHashMap.get(a2);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a2, (obj = new Object()))) != null) {
            obj = putIfAbsent;
        }
        synchronized (obj) {
            g = g(b(c));
        }
        return g;
    }

    public static avc e(pi5 pi5Var, mvc mvcVar) {
        Object putIfAbsent;
        String a2 = pi5Var.a();
        ConcurrentHashMap concurrentHashMap = a;
        Object obj = concurrentHashMap.get(a2);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a2, (obj = new Object()))) != null) {
            obj = putIfAbsent;
        }
        synchronized (obj) {
            File b2 = b(pi5Var);
            avc g = g(b2);
            if (g != null) {
                return g;
            }
            avc f = f(pi5Var, mvcVar);
            if (f != null) {
                i(b2, f);
            }
            return f;
        }
    }

    public static avc f(pi5 pi5Var, mvc mvcVar) {
        egb egbVar;
        Bitmap extractAlpha;
        try {
            InputStream b2 = mvcVar.b();
            if (b2 != null) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(b2, 65536);
                    byte[] bArr = new byte[4];
                    bufferedInputStream.mark(4);
                    int read = bufferedInputStream.read(bArr);
                    bufferedInputStream.reset();
                    if (read >= 4) {
                        boolean z = false;
                        byte b3 = bArr[0];
                        boolean z2 = b3 == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71;
                        if (b3 == -1 && bArr[1] == -40) {
                            z = true;
                        }
                        if (z2 || z) {
                            int i = pi5Var.b;
                            Bitmap decodeStream = BitmapFactory.decodeStream(bufferedInputStream);
                            if (decodeStream == null) {
                                extractAlpha = null;
                            } else {
                                if (decodeStream.getWidth() != i) {
                                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeStream, i, Math.max(1, Math.round((i / decodeStream.getWidth()) * decodeStream.getHeight())), true);
                                    if (createScaledBitmap != decodeStream) {
                                        decodeStream.recycle();
                                        decodeStream = createScaledBitmap;
                                    }
                                }
                                extractAlpha = decodeStream.extractAlpha();
                                decodeStream.recycle();
                            }
                            avc avcVar = extractAlpha != null ? new avc(extractAlpha, 1, null) : null;
                            b2.close();
                            return avcVar;
                        }
                    }
                    int i2 = pi5Var.b;
                    double[] dArr = hgb.a;
                    try {
                        XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                        egbVar = new egb(i2, i2, null, false, 1.0f, 2);
                        egbVar.F = true;
                        xMLReader.setContentHandler(egbVar);
                        xMLReader.parse(new InputSource(bufferedInputStream));
                    } catch (Exception e) {
                        cc4.g(e, true);
                        egbVar = null;
                    }
                    Bitmap bitmap = egbVar != null ? egbVar.b : null;
                    if (bitmap != null) {
                        avc avcVar2 = new avc(bitmap, 1, egbVar.K);
                        b2.close();
                        return avcVar2;
                    }
                    b2.close();
                } finally {
                }
            } else if (b2 != null) {
                b2.close();
                return null;
            }
            return null;
        } catch (Throwable th) {
            cc4.g(th, true);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static avc g(File file) {
        Bitmap bitmap;
        ArrayList arrayList;
        if (file.exists()) {
            try {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        try {
                            GZIPInputStream gZIPInputStream = new GZIPInputStream(fileInputStream, 65536);
                            try {
                                ArrayList arrayList2 = new ArrayList(1);
                                bitmap = cve.d(gZIPInputStream, arrayList2);
                                do {
                                    try {
                                    } catch (Throwable th) {
                                        th = th;
                                        arrayList = null;
                                    }
                                } while (gZIPInputStream.read() != -1);
                                int size = arrayList2.size();
                                arrayList = null;
                                for (int i = 0; i < size; i++) {
                                    try {
                                        String str = (String) arrayList2.get(i);
                                        if (str.startsWith("patterns = ")) {
                                            arrayList = a(str.substring(11));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            gZIPInputStream.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                        throw th;
                                    }
                                }
                                gZIPInputStream.close();
                                fileInputStream.close();
                            } catch (Throwable th4) {
                                th = th4;
                                bitmap = null;
                                arrayList = null;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bitmap = null;
                            arrayList = null;
                            try {
                                fileInputStream.close();
                            } catch (Throwable th6) {
                                th.addSuppressed(th6);
                            }
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        fileInputStream.close();
                        throw th;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    cc4.g(th, true);
                    if (bitmap != null) {
                        bitmap.recycle();
                        bitmap = null;
                    }
                    file.delete();
                    if (bitmap != null) {
                    }
                    return null;
                }
            } catch (Throwable th9) {
                th = th9;
                bitmap = null;
                arrayList = null;
                cc4.g(th, true);
                if (bitmap != null) {
                }
                file.delete();
                if (bitmap != null) {
                }
                return null;
            }
            if (bitmap != null) {
                return new avc(bitmap, 1, arrayList);
            }
        }
        return null;
    }

    public static String h(List list) {
        SerializedData serializedData = new SerializedData(list.size() * 52);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ivc ivcVar = (ivc) list.get(i);
            RectF rectF = ivcVar.a;
            serializedData.writeFloat(rectF.left);
            serializedData.writeFloat(rectF.top);
            serializedData.writeFloat(rectF.width());
            serializedData.writeFloat(rectF.height());
            float[] fArr = new float[9];
            ivcVar.b.getValues(fArr);
            for (int i2 = 0; i2 < 9; i2++) {
                serializedData.writeFloat(fArr[i2]);
            }
        }
        String f = Utilities.f(serializedData.toByteArray());
        serializedData.cleanup();
        return f;
    }

    public static void i(File file, avc avcVar) {
        Bitmap bitmap;
        FileOutputStream fileOutputStream;
        Bitmap bitmap2 = avcVar.a;
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
        Bitmap bitmap3 = null;
        r3 = null;
        List singletonList = null;
        try {
            List list = avcVar.b;
            if (bitmap2.getConfig() == Bitmap.Config.ALPHA_8) {
                bitmap = null;
            } else {
                bitmap2 = bitmap2.extractAlpha();
                bitmap = bitmap2;
            }
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        singletonList = Collections.singletonList("patterns = ".concat(h(list)));
                    }
                } catch (Throwable th) {
                    th = th;
                    bitmap3 = bitmap;
                    try {
                        cc4.g(th, true);
                    } finally {
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                        }
                        file2.delete();
                    }
                }
            }
            fileOutputStream = new FileOutputStream(file2);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new BufferedOutputStream(fileOutputStream, 65536));
            cve.e(bitmap2, gZIPOutputStream, singletonList);
            gZIPOutputStream.finish();
            gZIPOutputStream.flush();
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            boolean renameTo = file2.renameTo(file);
            if (bitmap != null) {
                bitmap.recycle();
            }
            if (renameTo) {
            }
        } finally {
        }
    }
}
