package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Base64;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.MediaDataController;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
final class WidgetSandboxBackend implements qb1, ua1 {
    private static final long MEMORY_BUDGET = 33554432;
    private long imageBytes;
    private int nextFont;
    private final dc1 owner;
    private ic1 text;
    private final HashMap<Integer, Paint> fonts = new HashMap<>();
    private final HashMap<Integer, Paint> deviceFonts = new HashMap<>();
    private final HashMap<Integer, Bitmap> images = new HashMap<>();
    private final HashMap<Integer, va1> canvases = new HashMap<>();
    private final HashMap<Integer, JSONArray> pendingLayers = new HashMap<>();
    private HashMap<Long, lb1> layerContents = new HashMap<>();
    private final rb1 painter = new rb1();
    private final Rect bounds = new Rect();

    public WidgetSandboxBackend(dc1 dc1Var) {
        this.owner = dc1Var;
    }

    private static void assertWorker() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException("Native layout and recording must run off UI");
        }
    }

    private void checkCanvasSize(int i10, int i11, int i12) {
        long j10 = i11 * i12;
        if (j10 > 4194304) {
            throw new IllegalArgumentException("Canvas dimensions");
        }
        long j11 = (j10 * 8) + this.imageBytes;
        for (Map.Entry<Integer, va1> entry : this.canvases.entrySet()) {
            if (entry.getKey().intValue() != i10) {
                j11 += entry.getValue().m == null ? 0L : r4.getWidth() * r3.m.getHeight() * 8;
            }
        }
        if (j11 > MEMORY_BUDGET) {
            throw new IllegalArgumentException("Canvas memory budget");
        }
    }

    public static String featureSettings(String str) {
        if (str.isEmpty()) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (str2.indexOf(61) == 4) {
                String substring = str2.substring(0, 4);
                String substring2 = str2.substring(5);
                if (substring.matches("[\\x20-\\x7e]{4}") && substring.indexOf(34) < 0 && substring2.matches("\\d{1,5}")) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append('\"');
                    sb2.append(substring);
                    sb2.append("\" ");
                    sb2.append(substring2);
                }
            }
        }
        if (sb2.length() == 0) {
            return null;
        }
        return sb2.toString();
    }

    private bc1[] layers(JSONObject jSONObject, float f7) {
        int i10;
        JSONArray jSONArray;
        float[] fArr;
        float[] fArr2;
        int i11;
        db1 cb1Var;
        float f10 = f7;
        JSONArray optJSONArray = jSONObject.optJSONArray("l");
        int i12 = 0;
        int length = optJSONArray == null ? 0 : optJSONArray.length();
        HashMap<Long, lb1> hashMap = new HashMap<>();
        bc1[] bc1VarArr = new bc1[length];
        int i13 = 0;
        int i14 = 0;
        while (i13 < length) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i13);
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("id");
                long optLong2 = optJSONObject.optLong("cv");
                JSONArray optJSONArray2 = optJSONObject.optJSONArray("b");
                if (optJSONArray2 != null) {
                    double optDouble = optJSONArray2.optDouble(i12);
                    i10 = length;
                    double d = f10;
                    int floor = (int) Math.floor(optDouble * d);
                    jSONArray = optJSONArray;
                    int floor2 = (int) Math.floor(optJSONArray2.optDouble(1) * d);
                    int ceil = (int) Math.ceil((optJSONArray2.optDouble(2) + optJSONArray2.optDouble(0)) * d);
                    int ceil2 = (int) Math.ceil((optJSONArray2.optDouble(3) + optJSONArray2.optDouble(1)) * d);
                    lb1 lb1Var = this.layerContents.get(Long.valueOf(optLong));
                    JSONArray jSONArray2 = this.pendingLayers.get(Integer.valueOf(i13));
                    if (jSONArray2 != null) {
                        if (Build.VERSION.SDK_INT >= 29) {
                            db1 bb1Var = new bb1("widget-sandbox-layer", floor, floor2, ceil, ceil2);
                            i11 = floor2;
                            cb1Var = bb1Var;
                        } else {
                            i11 = floor2;
                            cb1Var = new cb1(floor, i11, ceil, ceil2);
                        }
                        Canvas a2 = cb1Var.a();
                        try {
                            a2.translate(-floor, -i11);
                            a2.scale(f10, f10);
                            rb1 rb1Var = this.painter;
                            rb1Var.getClass();
                            rb1Var.e(a2, jSONArray2, jSONArray2.length(), this, f10, true);
                            cb1Var.e();
                            lb1Var = new lb1(cb1Var, (int) optLong2);
                        } catch (Throwable th2) {
                            cb1Var.e();
                            throw th2;
                        }
                    } else {
                        if (lb1Var != null) {
                            if (lb1Var.b != ((int) optLong2)) {
                            }
                        }
                        i13++;
                        f10 = f7;
                        length = i10;
                        optJSONArray = jSONArray;
                        i12 = 0;
                    }
                    hashMap.put(Long.valueOf(optLong), lb1Var);
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("l");
                    float[] fArr3 = null;
                    if (optJSONArray3 != null) {
                        float[] fArr4 = new float[4];
                        rb1.c(optJSONArray3, fArr4, 4, new float[0]);
                        JSONArray optJSONArray4 = optJSONObject.optJSONArray("q");
                        if (optJSONArray4 != null) {
                            fArr3 = new float[8];
                            rb1.c(optJSONArray4, fArr3, 8, new float[0]);
                        }
                        fArr2 = fArr3;
                        fArr = fArr4;
                    } else {
                        fArr = null;
                        fArr2 = null;
                    }
                    JSONArray optJSONArray5 = optJSONObject.optJSONArray("k");
                    int length2 = optJSONArray5 == null ? 0 : (optJSONArray5.length() / 8) * 8;
                    float[] fArr5 = new float[length2];
                    rb1.c(optJSONArray5, fArr5, length2, new float[0]);
                    int i15 = i14 + 1;
                    bc1VarArr[i14] = new bc1(lb1Var.a, fArr, fArr2, optJSONObject.optDouble("ts"), optJSONObject.optDouble("td"), optJSONObject.optInt("tr") != 0, fArr5);
                    i14 = i15;
                    i13++;
                    f10 = f7;
                    length = i10;
                    optJSONArray = jSONArray;
                    i12 = 0;
                }
            }
            jSONArray = optJSONArray;
            i10 = length;
            i13++;
            f10 = f7;
            length = i10;
            optJSONArray = jSONArray;
            i12 = 0;
        }
        int i16 = length;
        this.layerContents = hashMap;
        if (i14 == i16) {
            return bc1VarArr;
        }
        bc1[] bc1VarArr2 = new bc1[i14];
        System.arraycopy(bc1VarArr, 0, bc1VarArr2, 0, i14);
        return bc1VarArr2;
    }

    private static String text(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0167, code lost:
    
        r0 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static Typeface typeface(String str, int i10, boolean z10) {
        Typeface typeface;
        Typeface typeface2 = Typeface.SANS_SERIF;
        String[] split = str.split(",");
        int length = split.length;
        int i11 = 0;
        while (true) {
            if (i11 < length) {
                String lowerCase = split[i11].trim().replace("\"", "").replace("'", "").toLowerCase(Locale.ROOT);
                if (!lowerCase.isEmpty()) {
                    switch (lowerCase) {
                        case "sans-serif":
                        case "roboto":
                        case "ui-sans-serif":
                        case "blinkmacsystemfont":
                        case "helvetica neue":
                        case "arial":
                        case "inter":
                        case "segoe ui":
                        case "system-ui":
                        case "helvetica":
                        case "-apple-system":
                            typeface = Typeface.SANS_SERIF;
                            break;
                        case "monospace":
                        case "consolas":
                        case "courier new":
                        case "menlo":
                        case "ui-monospace":
                        case "sf mono":
                            typeface = Typeface.MONOSPACE;
                            break;
                        case "times new roman":
                        case "georgia":
                        case "serif":
                        case "times":
                        case "ui-serif":
                            typeface = Typeface.SERIF;
                            break;
                        default:
                            typeface2 = Typeface.create(lowerCase, 0);
                            if (typeface2 != Typeface.DEFAULT) {
                                break;
                            } else {
                                break;
                            }
                    }
                }
                i11++;
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(typeface2, Math.max(1, Math.min(MediaDataController.MAX_STYLE_RUNS_COUNT, i10)), z10);
        }
        return Typeface.create(typeface2, (i10 < 600 ? 0 : 1) | (z10 ? 2 : 0));
    }

    @Override // org.telegram.ui.Components.qb1
    public Bitmap canvas(int i10) {
        Bitmap bitmap;
        va1 va1Var = this.canvases.get(Integer.valueOf(i10));
        if (va1Var == null || (bitmap = va1Var.m) == null) {
            return null;
        }
        if (va1Var.q != va1Var.p || va1Var.n == null) {
            va1Var.n = bitmap.copy(Bitmap.Config.ARGB_8888, false);
            va1Var.q = va1Var.p;
        }
        return va1Var.n;
    }

    @Override // org.telegram.ui.Components.ua1
    public Bitmap canvasBitmap(int i10) {
        va1 va1Var = this.canvases.get(Integer.valueOf(i10));
        if (va1Var == null) {
            return null;
        }
        return va1Var.m;
    }

    public byte[] canvasRead(int i10, int i11, int i12, int i13, int i14) {
        int i15 = i11;
        assertWorker();
        if (i13 <= 0 || i14 <= 0 || i13 * i14 > 4194304) {
            return null;
        }
        va1 va1Var = this.canvases.get(Integer.valueOf(i10));
        if (va1Var == null) {
            return new byte[i13 * i14 * 4];
        }
        byte[] bArr = new byte[Math.max(i14, 0) * Math.max(i13, 0) * 4];
        if (va1Var.m != null) {
            int max = Math.max(0, i15);
            int max2 = Math.max(0, i12);
            int min = Math.min(va1Var.m.getWidth(), i15 + i13);
            int min2 = Math.min(va1Var.m.getHeight(), i14 + i12);
            if (min > max && min2 > max2) {
                int i16 = min - max;
                int i17 = min2 - max2;
                int[] iArr = new int[i16 * i17];
                va1Var.m.getPixels(iArr, 0, i16, max, max2, i16, i17);
                int i18 = max2;
                while (i18 < min2) {
                    int i19 = max;
                    while (i19 < min) {
                        int i20 = iArr[(i19 - max) + ((i18 - max2) * i16)];
                        int i21 = ((i19 - i15) + ((i18 - i12) * i13)) * 4;
                        bArr[i21] = (byte) Color.red(i20);
                        bArr[i21 + 1] = (byte) Color.green(i20);
                        bArr[i21 + 2] = (byte) Color.blue(i20);
                        bArr[i21 + 3] = (byte) Color.alpha(i20);
                        i19++;
                        i15 = i11;
                    }
                    i18++;
                    i15 = i11;
                }
            }
        }
        return bArr;
    }

    public void canvasRelease(int i10) {
        assertWorker();
        va1 remove = this.canvases.remove(Integer.valueOf(i10));
        if (remove != null) {
            Bitmap bitmap = remove.m;
            if (bitmap != null) {
                bitmap.recycle();
            }
            remove.m = null;
            remove.o = null;
            remove.n = null;
        }
    }

    public void canvasRun(int i10, int i11, int i12, byte[] bArr) {
        int i13;
        int i14;
        JSONArray jSONArray;
        int i15;
        assertWorker();
        if (i11 <= 0 || i12 <= 0) {
            canvasRelease(i10);
            return;
        }
        checkCanvasSize(i10, i11, i12);
        va1 va1Var = this.canvases.get(Integer.valueOf(i10));
        if (va1Var == null) {
            va1Var = new va1(i10);
            this.canvases.put(Integer.valueOf(i10), va1Var);
        }
        JSONArray jSONArray2 = new JSONArray(text(bArr));
        Bitmap bitmap = va1Var.m;
        if (bitmap == null || bitmap.getWidth() != i11 || va1Var.m.getHeight() != i12) {
            Bitmap bitmap2 = va1Var.m;
            if (bitmap2 != null) {
                bitmap2.recycle();
            }
            va1Var.m = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
            va1Var.o = new Canvas(va1Var.m);
        }
        int i16 = 0;
        int i17 = 0;
        while (i17 < jSONArray2.length()) {
            JSONObject optJSONObject = jSONArray2.optJSONObject(i17);
            if (optJSONObject != null) {
                Paint paint = va1Var.b;
                int optInt = optJSONObject.optInt("k");
                if (optInt == 0) {
                    va1Var.m.eraseColor(i16);
                } else {
                    if (optInt == 6) {
                        int optInt2 = optJSONObject.optInt("w");
                        int optInt3 = optJSONObject.optInt("h");
                        try {
                            byte[] decode = Base64.decode(optJSONObject.optString("px"), i16);
                            if (optInt2 > 0 && optInt3 > 0 && decode.length == optInt2 * optInt3 * 4) {
                                int optDouble = (int) optJSONObject.optDouble("x");
                                int optDouble2 = (int) optJSONObject.optDouble("y");
                                int max = Math.max(i16, optDouble);
                                int max2 = Math.max(i16, optDouble2);
                                int min = Math.min(va1Var.m.getWidth(), optDouble + optInt2);
                                int min2 = Math.min(va1Var.m.getHeight(), optInt3 + optDouble2);
                                if (min > max && min2 > max2) {
                                    int i18 = min - max;
                                    int i19 = min2 - max2;
                                    int[] iArr = new int[i18 * i19];
                                    i15 = i16;
                                    int i20 = max2;
                                    while (i20 < min2) {
                                        int i21 = max;
                                        while (i21 < min) {
                                            int i22 = ((i21 - optDouble) + ((i20 - optDouble2) * optInt2)) * 4;
                                            iArr[(i21 - max) + ((i20 - max2) * i18)] = Color.argb(decode[i22 + 3] & 255, decode[i22] & 255, decode[i22 + 1] & 255, decode[i22 + 2] & 255);
                                            i21++;
                                            i20 = i20;
                                            i17 = i17;
                                            optDouble2 = optDouble2;
                                            jSONArray2 = jSONArray2;
                                        }
                                        i20++;
                                    }
                                    i14 = i17;
                                    jSONArray = jSONArray2;
                                    va1Var.m.setPixels(iArr, 0, i18, max, max2, i18, i19);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        i15 = i16;
                        i14 = i17;
                        jSONArray = jSONArray2;
                    } else {
                        i15 = i16;
                        i14 = i17;
                        jSONArray = jSONArray2;
                        va1Var.o.save();
                        JSONArray optJSONArray = optJSONObject.optJSONArray("cl");
                        if (optJSONArray != null) {
                            for (int i23 = i15; i23 < optJSONArray.length(); i23++) {
                                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i23);
                                if (optJSONObject2 != null) {
                                    Canvas canvas = va1Var.o;
                                    Path path = va1Var.e;
                                    rb1.h(optJSONObject2, path);
                                    canvas.clipPath(path);
                                }
                            }
                        }
                        if (optInt == 3) {
                            Canvas canvas2 = va1Var.o;
                            Path path2 = va1Var.d;
                            rb1.h(optJSONObject, path2);
                            canvas2.drawPath(path2, va1Var.c);
                            va1Var.o.restore();
                        } else {
                            float max3 = Math.max(0.0f, Math.min(1.0f, (float) optJSONObject.optDouble("a", 1.0d)));
                            int optInt4 = optJSONObject.optInt("cm");
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("sh");
                            if (optJSONArray2 == null || !optJSONObject.has("shc")) {
                                i13 = i15;
                                if (max3 < 1.0f || optInt4 != 0) {
                                    paint.reset();
                                    paint.setAlpha(Math.round(max3 * 255.0f));
                                    va1.b(paint, optInt4);
                                    va1Var.o.saveLayer(null, paint);
                                    va1Var.c(va1Var.o, optJSONObject, this);
                                    va1Var.o.restore();
                                } else {
                                    va1Var.c(va1Var.o, optJSONObject, this);
                                }
                            } else {
                                Bitmap createBitmap = Bitmap.createBitmap(va1Var.m.getWidth(), va1Var.m.getHeight(), Bitmap.Config.ARGB_8888);
                                va1Var.c(new Canvas(createBitmap), optJSONObject, this);
                                Paint paint2 = new Paint(1);
                                float optDouble3 = ((float) optJSONArray2.optDouble(2)) / 2.0f;
                                if (optDouble3 > 0.5f) {
                                    paint2.setMaskFilter(new BlurMaskFilter((optDouble3 - 0.5f) / 0.57735f, BlurMaskFilter.Blur.NORMAL));
                                }
                                Bitmap extractAlpha = createBitmap.extractAlpha(paint2, new int[2]);
                                paint.reset();
                                paint.setAlpha(Math.round(max3 * 255.0f));
                                va1.b(paint, optInt4);
                                va1Var.o.saveLayer(null, paint);
                                Paint paint3 = new Paint(1);
                                paint3.setColor((int) optJSONObject.optLong("shc"));
                                i13 = i15;
                                va1Var.o.drawBitmap(extractAlpha, r4[i15] + ((float) optJSONArray2.optDouble(i13)), r4[1] + ((float) optJSONArray2.optDouble(1)), paint3);
                                va1Var.o.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
                                va1Var.o.restore();
                                extractAlpha.recycle();
                                createBitmap.recycle();
                            }
                            va1Var.o.restore();
                            i17 = i14 + 1;
                            i16 = i13;
                            jSONArray2 = jSONArray;
                        }
                    }
                    i13 = i15;
                    i17 = i14 + 1;
                    i16 = i13;
                    jSONArray2 = jSONArray;
                }
            }
            i13 = i16;
            i14 = i17;
            jSONArray = jSONArray2;
            i17 = i14 + 1;
            i16 = i13;
            jSONArray2 = jSONArray;
        }
        va1Var.p++;
    }

    public float[] createFont(byte[] bArr, float f7, int i10, boolean z10, byte[] bArr2) {
        assertWorker();
        Paint paint = new Paint(129);
        paint.setTextSize(f7);
        paint.setTypeface(typeface(text(bArr), i10, z10));
        String featureSettings = featureSettings(text(bArr2));
        if (featureSettings != null) {
            paint.setFontFeatureSettings(featureSettings);
        }
        float f10 = this.owner.i;
        Paint paint2 = new Paint(paint);
        paint2.setTextSize(f7 * f10);
        Paint.FontMetrics fontMetrics = paint2.getFontMetrics();
        int i11 = this.nextFont + 1;
        this.nextFont = i11;
        this.fonts.put(Integer.valueOf(i11), paint);
        this.deviceFonts.put(Integer.valueOf(i11), paint2);
        paint2.getTextBounds("x", 0, 1, this.bounds);
        float f11 = fontMetrics.ascent;
        float f12 = fontMetrics.descent;
        return new float[]{i11, (-f11) / f10, f12 / f10, ((f12 - f11) + fontMetrics.leading) / f10, this.bounds.height() / f10, paint2.measureText("0") / f10};
    }

    public void deleteFont(int i10) {
        this.fonts.remove(Integer.valueOf(i10));
        this.deviceFonts.remove(Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.Components.qb1
    public Paint deviceFont(int i10) {
        return this.deviceFonts.get(Integer.valueOf(i10));
    }

    @Override // org.telegram.ui.Components.ua1
    public Paint font(int i10) {
        return this.fonts.get(Integer.valueOf(i10));
    }

    public byte[] formatIntl(byte[] bArr) {
        return mb1.b(text(bArr)).getBytes(StandardCharsets.UTF_8);
    }

    @Override // org.telegram.ui.Components.qb1, org.telegram.ui.Components.ua1
    public Bitmap image(int i10) {
        return this.images.get(Integer.valueOf(i10));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0161 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a3 A[Catch: all -> 0x01bd, TryCatch #2 {all -> 0x01bd, blocks: (B:76:0x0198, B:78:0x01a3, B:80:0x01af, B:83:0x01b7, B:84:0x01c1, B:85:0x01ca, B:87:0x01d0, B:91:0x01d8, B:93:0x01de, B:126:0x01f0, B:129:0x01fe, B:131:0x0214, B:133:0x021e, B:135:0x0227, B:155:0x0262, B:157:0x0270, B:159:0x0276), top: B:75:0x0198 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float[] loadImage(int i10, byte[] bArr) {
        int i11;
        BitmapFactory.Options options;
        Bitmap bitmap;
        int i12;
        int i13;
        long j10;
        ByteArrayOutputStream byteArrayOutputStream;
        int i14;
        ByteArrayOutputStream byteArrayOutputStream2;
        byte[] bArr2;
        long j11;
        long j12;
        int d;
        int i15;
        int i16;
        byte[] bArr3;
        boolean z10;
        boolean z11;
        int i17;
        long d10;
        int i18;
        String text = text(bArr);
        int indexOf = text.indexOf(44);
        if (!text.startsWith("data:") || indexOf < 0 || text.length() > 2097152) {
            return null;
        }
        String substring = text.substring(5, indexOf);
        if (substring.contains("svg")) {
            return null;
        }
        try {
            String substring2 = text.substring(indexOf + 1);
            byte[] decode = substring.contains(";base64") ? Base64.decode(substring2, 0) : URLDecoder.decode(substring2, "UTF-8").getBytes(StandardCharsets.ISO_8859_1);
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(decode, 0, decode.length, options2);
            int i19 = options2.outWidth;
            if (i19 <= 0 || (i11 = options2.outHeight) <= 0 || i19 * i11 > 4194304) {
                return null;
            }
            if (this.imageBytes + (i19 * i11 * 4) > MEMORY_BUDGET) {
                return null;
            }
            options2.inJustDecodeBounds = false;
            int length = decode.length;
            if (length >= 33) {
                int i20 = 0;
                while (true) {
                    byte[] bArr4 = kb1.a;
                    if (i20 < 8) {
                        if (decode[i20] != bArr4[i20]) {
                            break;
                        }
                        i20++;
                    } else if (kb1.W(12, "IHDR", decode) && kb1.d(8, decode) >= 13) {
                        long d11 = kb1.d(16, decode);
                        long d12 = kb1.d(20, decode);
                        int i21 = decode[24] & 255;
                        int i22 = decode[25] & 255;
                        int i23 = decode[28] & 255;
                        if (i22 != 0) {
                            i12 = 3;
                            if (i22 != 3) {
                                if (i22 != 2) {
                                    i12 = i22 == 4 ? 2 : i22 == 6 ? 4 : 0;
                                }
                                if (i12 != 0 && i23 == 0 && d11 > 0 && d12 > 0 && d11 * d12 <= 4194304) {
                                    CRC32 crc32 = new CRC32();
                                    i13 = 8;
                                    while (true) {
                                        options = options2;
                                        if (i13 + 12 <= length) {
                                            j10 = d12;
                                            break;
                                        }
                                        d10 = kb1.d(i13, decode);
                                        i18 = i13;
                                        j10 = d12;
                                        if (d10 <= (length - i13) - 12) {
                                            int i24 = i18 + 4;
                                            if (kb1.W(i24, "IEND", decode)) {
                                                break;
                                            }
                                            if (kb1.W(i24, "IDAT", decode)) {
                                                crc32.reset();
                                                int i25 = (int) d10;
                                                crc32.update(decode, i24, i25 + 4);
                                                if (crc32.getValue() != kb1.d(i18 + 8 + i25, decode)) {
                                                    break;
                                                }
                                            }
                                            i13 = ((int) d10) + 12 + i18;
                                            options2 = options;
                                            d12 = j10;
                                        } else {
                                            break;
                                        }
                                    }
                                    int i26 = (int) (((((i12 * d11) * i21) + 7) / 8) + 1);
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                                    Inflater inflater = new Inflater(true);
                                    byte[] bArr5 = new byte[16384];
                                    long j13 = 0;
                                    i14 = 8;
                                    boolean z12 = true;
                                    while (i14 + 12 <= length && j13 < j10) {
                                        bArr2 = bArr4;
                                        j11 = d11;
                                        try {
                                            d = (int) kb1.d(i14, decode);
                                            if (d > (length - i14) - 12) {
                                                int i27 = i14 + 4;
                                                if (!kb1.W(i27, "IEND", decode)) {
                                                    if (kb1.W(i27, "IDAT", decode)) {
                                                        int min = z12 ? Math.min(2, d) : 0;
                                                        inflater.setInput(decode, i14 + 8 + min, d - min);
                                                        boolean z13 = false;
                                                        while (!inflater.needsInput() && !inflater.finished() && !z13) {
                                                            try {
                                                                int inflate = inflater.inflate(bArr5);
                                                                if (inflate == 0 && inflater.needsDictionary()) {
                                                                    break;
                                                                }
                                                                i15 = length;
                                                                byteArrayOutputStream.write(bArr5, 0, inflate);
                                                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                                                while (true) {
                                                                    if (j13 >= j10) {
                                                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                                                        i16 = d;
                                                                        z11 = z13;
                                                                        i17 = inflate;
                                                                        bArr3 = bArr5;
                                                                        break;
                                                                    }
                                                                    i16 = d;
                                                                    z11 = z13;
                                                                    long j14 = i26;
                                                                    long j15 = j13 * j14;
                                                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                                                    i17 = inflate;
                                                                    bArr3 = bArr5;
                                                                    if (j15 >= byteArray.length) {
                                                                        break;
                                                                    }
                                                                    if ((byteArray[(int) j15] & 255) > 4) {
                                                                        z13 = true;
                                                                        break;
                                                                    }
                                                                    if (j15 + j14 > byteArray.length) {
                                                                        break;
                                                                    }
                                                                    j13++;
                                                                    z13 = z11;
                                                                    d = i16;
                                                                    byteArrayOutputStream = byteArrayOutputStream2;
                                                                    bArr5 = bArr3;
                                                                    inflate = i17;
                                                                }
                                                                z13 = z11;
                                                                if (i17 == 0) {
                                                                    z10 = z13;
                                                                    break;
                                                                }
                                                                length = i15;
                                                                d = i16;
                                                                byteArrayOutputStream = byteArrayOutputStream2;
                                                                bArr5 = bArr3;
                                                            } catch (DataFormatException unused) {
                                                                byteArrayOutputStream2 = byteArrayOutputStream;
                                                                i15 = length;
                                                                i16 = d;
                                                                bArr3 = bArr5;
                                                                z10 = true;
                                                            }
                                                        }
                                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                                        i15 = length;
                                                        i16 = d;
                                                        bArr3 = bArr5;
                                                        z10 = z13;
                                                        if (z10) {
                                                            break;
                                                        }
                                                        z12 = false;
                                                    } else {
                                                        byteArrayOutputStream2 = byteArrayOutputStream;
                                                        i15 = length;
                                                        i16 = d;
                                                        bArr3 = bArr5;
                                                        if (byteArrayOutputStream2.size() == 0 && !kb1.W(i27, "IHDR", decode)) {
                                                            byteArrayOutputStream3.write(decode, i14, i16 + 12);
                                                        }
                                                    }
                                                    i14 += i16 + 12;
                                                    bArr4 = bArr2;
                                                    length = i15;
                                                    d11 = j11;
                                                    byteArrayOutputStream = byteArrayOutputStream2;
                                                    bArr5 = bArr3;
                                                }
                                            }
                                            byteArrayOutputStream2 = byteArrayOutputStream;
                                            break;
                                        } catch (Throwable th2) {
                                            inflater.end();
                                            throw th2;
                                        }
                                    }
                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                    bArr2 = bArr4;
                                    j11 = d11;
                                    j12 = j13;
                                    inflater.end();
                                    if (j12 < j10) {
                                        bitmap = Bitmap.createBitmap((int) j11, (int) j10, Bitmap.Config.ARGB_8888);
                                        if (j12 != 0) {
                                            int i28 = (int) (i26 * j12);
                                            byte[] bArr6 = new byte[i28];
                                            System.arraycopy(byteArrayOutputStream2.toByteArray(), 0, bArr6, 0, i28);
                                            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                            byteArrayOutputStream4.write(bArr2, 0, 8);
                                            byte[] bArr7 = new byte[13];
                                            System.arraycopy(decode, 16, bArr7, 0, 13);
                                            kb1.R(bArr7, 4, j12);
                                            kb1.X(byteArrayOutputStream4, "IHDR", bArr7, crc32);
                                            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                                            byteArrayOutputStream4.write(byteArray2, 0, byteArray2.length);
                                            Deflater deflater = new Deflater();
                                            deflater.setInput(bArr6);
                                            deflater.finish();
                                            ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                            byte[] bArr8 = new byte[8192];
                                            while (!deflater.finished()) {
                                                byteArrayOutputStream5.write(bArr8, 0, deflater.deflate(bArr8));
                                            }
                                            deflater.end();
                                            kb1.X(byteArrayOutputStream4, "IDAT", byteArrayOutputStream5.toByteArray(), crc32);
                                            kb1.X(byteArrayOutputStream4, "IEND", new byte[0], crc32);
                                            byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray3, 0, byteArray3.length);
                                            if (decodeByteArray != null) {
                                                new Canvas(bitmap).drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
                                                decodeByteArray.recycle();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        i12 = 1;
                        if (i12 != 0) {
                            CRC32 crc322 = new CRC32();
                            i13 = 8;
                            while (true) {
                                options = options2;
                                if (i13 + 12 <= length) {
                                }
                                i13 = ((int) d10) + 12 + i18;
                                options2 = options;
                                d12 = j10;
                            }
                            int i262 = (int) (((((i12 * d11) * i21) + 7) / 8) + 1);
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            ByteArrayOutputStream byteArrayOutputStream32 = new ByteArrayOutputStream();
                            Inflater inflater2 = new Inflater(true);
                            byte[] bArr52 = new byte[16384];
                            long j132 = 0;
                            i14 = 8;
                            boolean z122 = true;
                            while (i14 + 12 <= length) {
                                bArr2 = bArr4;
                                j11 = d11;
                                d = (int) kb1.d(i14, decode);
                                if (d > (length - i14) - 12) {
                                }
                                byteArrayOutputStream2 = byteArrayOutputStream;
                            }
                            byteArrayOutputStream2 = byteArrayOutputStream;
                            bArr2 = bArr4;
                            j11 = d11;
                            j12 = j132;
                            inflater2.end();
                            if (j12 < j10) {
                            }
                        }
                    }
                }
            }
            options = options2;
            bitmap = null;
            if (bitmap == null) {
                bitmap = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
            }
            if (bitmap == null) {
                return null;
            }
            Bitmap put = this.images.put(Integer.valueOf(i10), bitmap);
            long allocationByteCount = this.imageBytes + bitmap.getAllocationByteCount();
            this.imageBytes = allocationByteCount;
            if (put != null) {
                this.imageBytes = allocationByteCount - put.getAllocationByteCount();
            }
            return new float[]{bitmap.getWidth(), bitmap.getHeight()};
        } catch (Exception unused2) {
            return null;
        }
    }

    public void record(byte[] bArr, byte[] bArr2, double d, int i10, int i11, float f7, float f10, int i12, int i13) {
        db1 cb1Var;
        int i14;
        assertWorker();
        this.owner.getClass();
        this.owner.getClass();
        Trace.beginSection("WidgetSandbox:Record");
        double nanoTime = d - (System.nanoTime() / 1.0E9d);
        if (Build.VERSION.SDK_INT >= 29) {
            cb1Var = new bb1("widget-sandbox-content", 0, 0, i10, i11);
            i14 = i11;
        } else {
            i14 = i11;
            cb1Var = new cb1(0, 0, i10, i14);
        }
        db1 db1Var = cb1Var;
        try {
            try {
                JSONArray jSONArray = new JSONArray(text(bArr));
                Canvas a2 = db1Var.a();
                try {
                    a2.scale(f7, f7);
                    rb1 rb1Var = this.painter;
                    rb1Var.getClass();
                    rb1Var.e(a2, jSONArray, jSONArray.length(), this, f7, true);
                    db1Var.e();
                    this.owner.c(db1Var, layers(new JSONObject(text(bArr2)), f7), nanoTime, i10, i14, f10, (System.nanoTime() - r7) / 1000000.0f, i12, i13, jSONArray.length(), this.text);
                } catch (Throwable th2) {
                    db1Var.e();
                    throw th2;
                }
            } finally {
                this.pendingLayers.clear();
                Trace.endSection();
            }
        } catch (Exception e) {
            db1Var.c();
            throw e;
        }
    }

    public void recordLayer(int i10, int i11, byte[] bArr) {
        assertWorker();
        this.pendingLayers.put(Integer.valueOf(i10), new JSONArray(text(bArr)));
    }

    public void selectableText(byte[] bArr) {
        assertWorker();
        try {
            String text = text(bArr);
            HashMap<Integer, Paint> hashMap = this.deviceFonts;
            Objects.requireNonNull(hashMap);
            this.text = ic1.a(text, new x81(hashMap), this.owner.i);
        } catch (Exception unused) {
            this.text = null;
        }
    }

    public void signal(int i10, byte[] bArr) {
        final dc1 dc1Var = this.owner;
        final String text = text(bArr);
        if (i10 == 8) {
            final int i11 = 0;
            dc1Var.a.post(new Runnable() { // from class: org.telegram.ui.Components.yb1
                @Override // java.lang.Runnable
                public final void run() {
                    cc1 cc1Var;
                    cc1 cc1Var2;
                    switch (i11) {
                        case 0:
                            dc1 dc1Var2 = dc1Var;
                            String str = text;
                            if (dc1Var2.L != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                    cc1 cc1Var3 = dc1Var2.L;
                                    String optString = jSONObject.optString("area");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    cc1Var3.j(optString, optJSONObject);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                        case 1:
                            dc1 dc1Var3 = dc1Var;
                            String str2 = text;
                            if (!dc1Var3.t && (cc1Var = dc1Var3.I) != null) {
                                cc1Var.c(str2);
                                break;
                            }
                            break;
                        default:
                            dc1 dc1Var4 = dc1Var;
                            String str3 = text;
                            if (!dc1Var4.t && (cc1Var2 = dc1Var4.I) != null) {
                                try {
                                    cc1Var2.g(new JSONObject(str3));
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 10) {
            b3 b3Var = dc1Var.K;
            if (b3Var != null) {
                b3Var.run(text);
                return;
            }
            return;
        }
        if (dc1Var.t) {
            return;
        }
        if (i10 == 12 || i10 == 13 || i10 == 14) {
            dc1Var.a.post(new org.telegram.ui.g4(dc1Var, i10, text, 29));
            return;
        }
        if (i10 == 11) {
            final int i12 = 1;
            dc1Var.a.post(new Runnable() { // from class: org.telegram.ui.Components.yb1
                @Override // java.lang.Runnable
                public final void run() {
                    cc1 cc1Var;
                    cc1 cc1Var2;
                    switch (i12) {
                        case 0:
                            dc1 dc1Var2 = dc1Var;
                            String str = text;
                            if (dc1Var2.L != null) {
                                try {
                                    JSONObject jSONObject = new JSONObject(str);
                                    JSONObject optJSONObject = jSONObject.optJSONObject("values");
                                    cc1 cc1Var3 = dc1Var2.L;
                                    String optString = jSONObject.optString("area");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    cc1Var3.j(optString, optJSONObject);
                                    break;
                                } catch (Exception unused) {
                                    return;
                                }
                            }
                            break;
                        case 1:
                            dc1 dc1Var3 = dc1Var;
                            String str2 = text;
                            if (!dc1Var3.t && (cc1Var = dc1Var3.I) != null) {
                                cc1Var.c(str2);
                                break;
                            }
                            break;
                        default:
                            dc1 dc1Var4 = dc1Var;
                            String str3 = text;
                            if (!dc1Var4.t && (cc1Var2 = dc1Var4.I) != null) {
                                try {
                                    cc1Var2.g(new JSONObject(str3));
                                    break;
                                } catch (Exception unused2) {
                                    return;
                                }
                            }
                            break;
                    }
                }
            });
            return;
        }
        if (i10 == 9) {
            b3 b3Var2 = dc1Var.J;
            if (b3Var2 != null) {
                dc1Var.a.post(new ai.j1(b3Var2, text));
                return;
            }
            return;
        }
        if (i10 == 6) {
            dc1Var.l.set(false);
            dc1Var.a.post(dc1Var.O);
            return;
        }
        if (i10 == 1 || i10 == 2) {
            if (i10 == 1) {
                dc1Var.m.set(true);
            } else {
                dc1Var.k.set(true);
            }
            dc1Var.a.removeCallbacks(dc1Var.O);
            dc1Var.a.post(dc1Var.O);
            return;
        }
        try {
            if (i10 == 3) {
                JSONObject jSONObject = new JSONObject(text);
                dc1Var.a.post(new c00(dc1Var, jSONObject.optBoolean("x"), jSONObject.optBoolean("y"), jSONObject.optBoolean("hold"), 1));
                return;
            }
            if (i10 != 4) {
                if (i10 == 5) {
                    final int i13 = 2;
                    dc1Var.a.post(new Runnable() { // from class: org.telegram.ui.Components.yb1
                        @Override // java.lang.Runnable
                        public final void run() {
                            cc1 cc1Var;
                            cc1 cc1Var2;
                            switch (i13) {
                                case 0:
                                    dc1 dc1Var2 = dc1Var;
                                    String str = text;
                                    if (dc1Var2.L != null) {
                                        try {
                                            JSONObject jSONObject2 = new JSONObject(str);
                                            JSONObject optJSONObject = jSONObject2.optJSONObject("values");
                                            cc1 cc1Var3 = dc1Var2.L;
                                            String optString = jSONObject2.optString("area");
                                            if (optJSONObject == null) {
                                                optJSONObject = new JSONObject();
                                            }
                                            cc1Var3.j(optString, optJSONObject);
                                            break;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    break;
                                case 1:
                                    dc1 dc1Var3 = dc1Var;
                                    String str2 = text;
                                    if (!dc1Var3.t && (cc1Var = dc1Var3.I) != null) {
                                        cc1Var.c(str2);
                                        break;
                                    }
                                    break;
                                default:
                                    dc1 dc1Var4 = dc1Var;
                                    String str3 = text;
                                    if (!dc1Var4.t && (cc1Var2 = dc1Var4.I) != null) {
                                        try {
                                            cc1Var2.g(new JSONObject(str3));
                                            break;
                                        } catch (Exception unused2) {
                                            return;
                                        }
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                } else {
                    if (i10 == 7) {
                        float parseFloat = Float.parseFloat(text);
                        dc1Var.n.set(parseFloat == 0.0f);
                        dc1Var.a.post(new org.telegram.ui.b0(dc1Var, parseFloat, 2));
                        return;
                    }
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject(text);
            if (jSONObject2.optBoolean("loaded")) {
                dc1Var.u = true;
            }
            dc1Var.x = "bottom".equals(jSONObject2.optString("resizeAnchor"));
            if (jSONObject2.optBoolean("rendered") && !dc1Var.v) {
                double optDouble = jSONObject2.optDouble("height", -1.0d);
                double min = Math.min(600.0f, Math.max(50.0f, dc1Var.q / dc1Var.i));
                if (dc1Var.r && optDouble > 0.0d && Math.abs(min - optDouble) <= 1.0d) {
                    dc1Var.w = true;
                }
                dc1Var.v = true;
            }
            synchronized (dc1Var.p) {
                try {
                    if (dc1Var.t) {
                        return;
                    }
                    dc1Var.G = jSONObject2;
                    if (!dc1Var.H) {
                        dc1Var.H = true;
                        dc1Var.a.post(dc1Var.N);
                    }
                } finally {
                }
            }
        } catch (NumberFormatException | Exception unused) {
        }
    }

    public float textWidth(int i10, byte[] bArr) {
        Paint paint = this.deviceFonts.get(Integer.valueOf(i10));
        if (paint == null) {
            return 0.0f;
        }
        return paint.measureText(text(bArr)) / this.owner.i;
    }
}
