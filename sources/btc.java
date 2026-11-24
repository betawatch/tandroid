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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class btc {
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
            arrayList.add(new wsc(rectF, matrix));
        }
        serializedData.cleanup();
        return arrayList;
    }

    public static File b(mi5 mi5Var) {
        File file = b;
        if (file == null) {
            file = new File(a.b.getCacheDir(), "wallpaper/mask");
            b = file;
            Pattern pattern = usc.a;
            SharedPreferences d1 = oc7.d1();
            if (d1.getInt("wallpaperFilesCleanup", 0) < 1) {
                Utilities.e.c(new cpc(d1, (byte) 7));
            }
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, mi5Var.a());
    }

    public static osc c() {
        Point point = gm.q;
        return e(new mi5("r-default_pattern", Math.min(1440, Math.min(point.x, point.y))), new rjb((byte) 25));
    }

    public static osc d(String str) {
        osc g;
        Object putIfAbsent;
        if ("fqv01SQemVIBAAAApND8LDRUhRU".equals(str)) {
            return c();
        }
        mi5 c = mi5.c(str);
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

    public static osc e(mi5 mi5Var, atc atcVar) {
        Object putIfAbsent;
        String a2 = mi5Var.a();
        ConcurrentHashMap concurrentHashMap = a;
        Object obj = concurrentHashMap.get(a2);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a2, (obj = new Object()))) != null) {
            obj = putIfAbsent;
        }
        synchronized (obj) {
            File b2 = b(mi5Var);
            osc g = g(b2);
            if (g != null) {
                return g;
            }
            osc f = f(mi5Var, atcVar);
            if (f != null) {
                i(b2, f);
            }
            return f;
        }
    }

    public static osc f(mi5 mi5Var, atc atcVar) {
        keb kebVar;
        Bitmap extractAlpha;
        try {
            InputStream a2 = atcVar.a();
            if (a2 != null) {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(a2, 65536);
                    byte[] bArr = new byte[4];
                    bufferedInputStream.mark(4);
                    int read = bufferedInputStream.read(bArr);
                    bufferedInputStream.reset();
                    if (read >= 4) {
                        boolean z = false;
                        byte b2 = bArr[0];
                        boolean z2 = b2 == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71;
                        if (b2 == -1 && bArr[1] == -40) {
                            z = true;
                        }
                        if (z2 || z) {
                            int i = mi5Var.b;
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
                            osc oscVar = extractAlpha != null ? new osc(extractAlpha, 1, null) : null;
                            a2.close();
                            return oscVar;
                        }
                    }
                    int i2 = mi5Var.b;
                    double[] dArr = neb.a;
                    try {
                        XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
                        kebVar = new keb(i2, i2, null, false, 1.0f, 2);
                        kebVar.F = true;
                        xMLReader.setContentHandler(kebVar);
                        xMLReader.parse(new InputSource(bufferedInputStream));
                    } catch (Exception e) {
                        fc4.g(e, true);
                        kebVar = null;
                    }
                    Bitmap bitmap = kebVar != null ? kebVar.b : null;
                    if (bitmap != null) {
                        osc oscVar2 = new osc(bitmap, 1, kebVar.K);
                        a2.close();
                        return oscVar2;
                    }
                    a2.close();
                } finally {
                }
            } else if (a2 != null) {
                a2.close();
                return null;
            }
            return null;
        } catch (Throwable th) {
            fc4.g(th, true);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static osc g(File file) {
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
                                bitmap = lse.d(gZIPInputStream, arrayList2);
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
                    fc4.g(th, true);
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
                fc4.g(th, true);
                if (bitmap != null) {
                }
                file.delete();
                if (bitmap != null) {
                }
                return null;
            }
            if (bitmap != null) {
                return new osc(bitmap, 1, arrayList);
            }
        }
        return null;
    }

    public static String h(List list) {
        SerializedData serializedData = new SerializedData(list.size() * 52);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            wsc wscVar = (wsc) list.get(i);
            RectF rectF = wscVar.a;
            serializedData.writeFloat(rectF.left);
            serializedData.writeFloat(rectF.top);
            serializedData.writeFloat(rectF.width());
            serializedData.writeFloat(rectF.height());
            float[] fArr = new float[9];
            wscVar.b.getValues(fArr);
            for (int i2 = 0; i2 < 9; i2++) {
                serializedData.writeFloat(fArr[i2]);
            }
        }
        String f = Utilities.f(serializedData.toByteArray());
        serializedData.cleanup();
        return f;
    }

    public static void i(File file, osc oscVar) {
        Bitmap bitmap;
        FileOutputStream fileOutputStream;
        Bitmap bitmap2 = oscVar.a;
        File file2 = new File(file.getParentFile(), file.getName() + ".tmp");
        Bitmap bitmap3 = null;
        r3 = null;
        List singletonList = null;
        try {
            List list = oscVar.b;
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
                        fc4.g(th, true);
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
            lse.e(bitmap2, gZIPOutputStream, singletonList);
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
