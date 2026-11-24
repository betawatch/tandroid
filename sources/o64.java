// default package

import android.content.res.AssetManager;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import j$.util.DesugarTimeZone;
import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class o64 {
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final l64 H;
    public static final l64[][] I;
    public static final l64[] J;
    public static final HashMap[] K;
    public static final HashMap[] L;
    public static final HashSet M;
    public static final HashMap N;
    public static final Charset O;
    public static final byte[] P;
    public static final byte[] Q;
    public String a;
    public FileDescriptor b;
    public AssetManager.AssetInputStream c;
    public int d;
    public final HashMap[] e;
    public final HashSet f;
    public ByteOrder g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public int l;
    public static final boolean m = Log.isLoggable("ExifInterface", 3);
    public static final List n = Arrays.asList(1, 6, 3, 8);
    public static final List o = Arrays.asList(2, 7, 4, 5);
    public static final int[] p = {8, 8, 8};
    public static final int[] q = {8};
    public static final byte[] r = {-1, -40, -1};
    public static final byte[] s = {102, 116, 121, 112};
    public static final byte[] t = {109, 105, 102, 49};
    public static final byte[] u = {104, 101, 105, 99};
    public static final byte[] v = {79, 76, 89, 77, 80, 0};
    public static final byte[] w = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] x = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] y = {101, 88, 73, 102};
    public static final byte[] z = {73, 72, 68, 82};
    public static final byte[] A = {73, 69, 78, 68};
    public static final byte[] B = {82, 73, 70, 70};
    public static final byte[] C = {87, 69, 66, 80};
    public static final byte[] D = {69, 88, 73, 70};

    static {
        "VP8X".getBytes(Charset.defaultCharset());
        "VP8L".getBytes(Charset.defaultCharset());
        "VP8 ".getBytes(Charset.defaultCharset());
        "ANIM".getBytes(Charset.defaultCharset());
        "ANMF".getBytes(Charset.defaultCharset());
        E = new String[]{"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
        F = new int[]{0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
        G = new byte[]{65, 83, 67, 73, 73, 0, 0, 0};
        l64[] l64VarArr = {new l64("NewSubfileType", nm7.c4, 4), new l64("SubfileType", nm7.d4, 4), new l64(256, 3, 4, "ImageWidth"), new l64(nm7.f4, 3, 4, "ImageLength"), new l64("BitsPerSample", nm7.g4, 3), new l64("Compression", nm7.h4, 3), new l64("PhotometricInterpretation", nm7.k4, 3), new l64("ImageDescription", nm7.s4, 2), new l64("Make", nm7.t4, 2), new l64("Model", nm7.u4, 2), new l64(nm7.v4, 3, 4, "StripOffsets"), new l64("Orientation", nm7.w4, 3), new l64("SamplesPerPixel", nm7.z4, 3), new l64(nm7.A4, 3, 4, "RowsPerStrip"), new l64(nm7.B4, 3, 4, "StripByteCounts"), new l64("XResolution", nm7.E4, 5), new l64("YResolution", nm7.F4, 5), new l64("PlanarConfiguration", nm7.G4, 3), new l64("ResolutionUnit", nm7.S4, 3), new l64("TransferFunction", nm7.X4, 3), new l64("Software", nm7.b5, 2), new l64("DateTime", nm7.c5, 2), new l64("Artist", nm7.l5, 2), new l64("WhitePoint", nm7.o5, 5), new l64("PrimaryChromaticities", nm7.p5, 5), new l64("SubIFDPointer", nm7.A5, 4), new l64("JPEGInterchangeFormat", 513, 4), new l64("JPEGInterchangeFormatLength", 514, 4), new l64("YCbCrCoefficients", 529, 5), new l64("YCbCrSubSampling", 530, 3), new l64("YCbCrPositioning", 531, 3), new l64("ReferenceBlackWhite", 532, 5), new l64("Copyright", 33432, 2), new l64("ExifIFDPointer", 34665, 4), new l64("GPSInfoIFDPointer", 34853, 4), new l64("SensorTopBorder", 4, 4), new l64("SensorLeftBorder", 5, 4), new l64("SensorBottomBorder", 6, 4), new l64("SensorRightBorder", 7, 4), new l64("ISO", 23, 3), new l64("JpgFromRaw", 46, 7), new l64("Xmp", 700, 1)};
        l64[] l64VarArr2 = {new l64("ExposureTime", 33434, 5), new l64("FNumber", 33437, 5), new l64("ExposureProgram", 34850, 3), new l64("SpectralSensitivity", 34852, 2), new l64("PhotographicSensitivity", 34855, 3), new l64("OECF", 34856, 7), new l64("SensitivityType", 34864, 3), new l64("StandardOutputSensitivity", 34865, 4), new l64("RecommendedExposureIndex", 34866, 4), new l64("ISOSpeed", 34867, 4), new l64("ISOSpeedLatitudeyyy", 34868, 4), new l64("ISOSpeedLatitudezzz", 34869, 4), new l64("ExifVersion", 36864, 2), new l64("DateTimeOriginal", 36867, 2), new l64("DateTimeDigitized", 36868, 2), new l64("OffsetTime", 36880, 2), new l64("OffsetTimeOriginal", 36881, 2), new l64("OffsetTimeDigitized", 36882, 2), new l64("ComponentsConfiguration", 37121, 7), new l64("CompressedBitsPerPixel", 37122, 5), new l64("ShutterSpeedValue", 37377, 10), new l64("ApertureValue", 37378, 5), new l64("BrightnessValue", 37379, 10), new l64("ExposureBiasValue", 37380, 10), new l64("MaxApertureValue", 37381, 5), new l64("SubjectDistance", 37382, 5), new l64("MeteringMode", 37383, 3), new l64("LightSource", 37384, 3), new l64("Flash", 37385, 3), new l64("FocalLength", 37386, 5), new l64("SubjectArea", 37396, 3), new l64("MakerNote", 37500, 7), new l64("UserComment", 37510, 7), new l64("SubSecTime", 37520, 2), new l64("SubSecTimeOriginal", 37521, 2), new l64("SubSecTimeDigitized", 37522, 2), new l64("FlashpixVersion", 40960, 7), new l64("ColorSpace", 40961, 3), new l64(40962, 3, 4, "PixelXDimension"), new l64(40963, 3, 4, "PixelYDimension"), new l64("RelatedSoundFile", 40964, 2), new l64("InteroperabilityIFDPointer", 40965, 4), new l64("FlashEnergy", 41483, 5), new l64("SpatialFrequencyResponse", 41484, 7), new l64("FocalPlaneXResolution", 41486, 5), new l64("FocalPlaneYResolution", 41487, 5), new l64("FocalPlaneResolutionUnit", 41488, 3), new l64("SubjectLocation", 41492, 3), new l64("ExposureIndex", 41493, 5), new l64("SensingMethod", 41495, 3), new l64("FileSource", 41728, 7), new l64("SceneType", 41729, 7), new l64("CFAPattern", 41730, 7), new l64("CustomRendered", 41985, 3), new l64("ExposureMode", 41986, 3), new l64("WhiteBalance", 41987, 3), new l64("DigitalZoomRatio", 41988, 5), new l64("FocalLengthIn35mmFilm", 41989, 3), new l64("SceneCaptureType", 41990, 3), new l64("GainControl", 41991, 3), new l64("Contrast", 41992, 3), new l64("Saturation", 41993, 3), new l64("Sharpness", 41994, 3), new l64("DeviceSettingDescription", 41995, 7), new l64("SubjectDistanceRange", 41996, 3), new l64("ImageUniqueID", 42016, 2), new l64("CameraOwnerName", 42032, 2), new l64("BodySerialNumber", 42033, 2), new l64("LensSpecification", 42034, 5), new l64("LensMake", 42035, 2), new l64("LensModel", 42036, 2), new l64("Gamma", 42240, 5), new l64("DNGVersion", 50706, 1), new l64(50720, 3, 4, "DefaultCropSize")};
        l64[] l64VarArr3 = {new l64("GPSVersionID", 0, 1), new l64("GPSLatitudeRef", 1, 2), new l64(2, 5, 10, "GPSLatitude"), new l64("GPSLongitudeRef", 3, 2), new l64(4, 5, 10, "GPSLongitude"), new l64("GPSAltitudeRef", 5, 1), new l64("GPSAltitude", 6, 5), new l64("GPSTimeStamp", 7, 5), new l64("GPSSatellites", 8, 2), new l64("GPSStatus", 9, 2), new l64("GPSMeasureMode", 10, 2), new l64("GPSDOP", 11, 5), new l64("GPSSpeedRef", 12, 2), new l64("GPSSpeed", 13, 5), new l64("GPSTrackRef", 14, 2), new l64("GPSTrack", 15, 5), new l64("GPSImgDirectionRef", 16, 2), new l64("GPSImgDirection", 17, 5), new l64("GPSMapDatum", 18, 2), new l64("GPSDestLatitudeRef", 19, 2), new l64("GPSDestLatitude", 20, 5), new l64("GPSDestLongitudeRef", 21, 2), new l64("GPSDestLongitude", 22, 5), new l64("GPSDestBearingRef", 23, 2), new l64("GPSDestBearing", 24, 5), new l64("GPSDestDistanceRef", 25, 2), new l64("GPSDestDistance", 26, 5), new l64("GPSProcessingMethod", 27, 7), new l64("GPSAreaInformation", 28, 7), new l64("GPSDateStamp", 29, 2), new l64("GPSDifferential", 30, 3), new l64("GPSHPositioningError", 31, 5)};
        l64[] l64VarArr4 = {new l64("InteroperabilityIndex", 1, 2)};
        l64[] l64VarArr5 = {new l64("NewSubfileType", nm7.c4, 4), new l64("SubfileType", nm7.d4, 4), new l64(256, 3, 4, "ThumbnailImageWidth"), new l64(nm7.f4, 3, 4, "ThumbnailImageLength"), new l64("BitsPerSample", nm7.g4, 3), new l64("Compression", nm7.h4, 3), new l64("PhotometricInterpretation", nm7.k4, 3), new l64("ImageDescription", nm7.s4, 2), new l64("Make", nm7.t4, 2), new l64("Model", nm7.u4, 2), new l64(nm7.v4, 3, 4, "StripOffsets"), new l64("ThumbnailOrientation", nm7.w4, 3), new l64("SamplesPerPixel", nm7.z4, 3), new l64(nm7.A4, 3, 4, "RowsPerStrip"), new l64(nm7.B4, 3, 4, "StripByteCounts"), new l64("XResolution", nm7.E4, 5), new l64("YResolution", nm7.F4, 5), new l64("PlanarConfiguration", nm7.G4, 3), new l64("ResolutionUnit", nm7.S4, 3), new l64("TransferFunction", nm7.X4, 3), new l64("Software", nm7.b5, 2), new l64("DateTime", nm7.c5, 2), new l64("Artist", nm7.l5, 2), new l64("WhitePoint", nm7.o5, 5), new l64("PrimaryChromaticities", nm7.p5, 5), new l64("SubIFDPointer", nm7.A5, 4), new l64("JPEGInterchangeFormat", 513, 4), new l64("JPEGInterchangeFormatLength", 514, 4), new l64("YCbCrCoefficients", 529, 5), new l64("YCbCrSubSampling", 530, 3), new l64("YCbCrPositioning", 531, 3), new l64("ReferenceBlackWhite", 532, 5), new l64("Copyright", 33432, 2), new l64("ExifIFDPointer", 34665, 4), new l64("GPSInfoIFDPointer", 34853, 4), new l64("DNGVersion", 50706, 1), new l64(50720, 3, 4, "DefaultCropSize")};
        H = new l64("StripOffsets", nm7.v4, 3);
        I = new l64[][]{l64VarArr, l64VarArr2, l64VarArr3, l64VarArr4, l64VarArr5, l64VarArr, new l64[]{new l64("ThumbnailImage", 256, 7), new l64("CameraSettingsIFDPointer", 8224, 4), new l64("ImageProcessingIFDPointer", 8256, 4)}, new l64[]{new l64("PreviewImageStart", nm7.f4, 4), new l64("PreviewImageLength", nm7.g4, 4)}, new l64[]{new l64("AspectFrame", 4371, 3)}, new l64[]{new l64("ColorSpace", 55, 3)}};
        J = new l64[]{new l64("SubIFDPointer", nm7.A5, 4), new l64("ExifIFDPointer", 34665, 4), new l64("GPSInfoIFDPointer", 34853, 4), new l64("InteroperabilityIFDPointer", 40965, 4), new l64("CameraSettingsIFDPointer", 8224, 1), new l64("ImageProcessingIFDPointer", 8256, 1)};
        K = new HashMap[10];
        L = new HashMap[10];
        M = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        N = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        O = forName;
        P = "Exif\u0000\u0000".getBytes(forName);
        Q = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            l64[][] l64VarArr6 = I;
            if (i >= l64VarArr6.length) {
                HashMap hashMap = N;
                l64[] l64VarArr7 = J;
                hashMap.put(Integer.valueOf(l64VarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(l64VarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(l64VarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(l64VarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(l64VarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(l64VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            K[i] = new HashMap();
            L[i] = new HashMap();
            for (l64 l64Var : l64VarArr6[i]) {
                K[i].put(Integer.valueOf(l64Var.a), l64Var);
                L[i].put(l64Var.b, l64Var);
            }
            i++;
        }
    }

    public o64(InputStream inputStream) {
        l64[][] l64VarArr = I;
        this.e = new HashMap[l64VarArr.length];
        this.f = new HashSet(l64VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            gxc.d("inputStream cannot be null");
            throw null;
        }
        this.a = null;
        if (inputStream instanceof AssetManager.AssetInputStream) {
            this.c = (AssetManager.AssetInputStream) inputStream;
            this.b = null;
        } else {
            if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    p64.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.c = null;
                    this.b = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (m) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            }
            this.c = null;
            this.b = null;
        }
        q(inputStream);
    }

    public static ByteOrder t(j64 j64Var) {
        short readShort = j64Var.readShort();
        boolean z2 = m;
        if (readShort == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort != 19789) {
            h64.b(Integer.toHexString(readShort), "Invalid byte order: ");
            return null;
        }
        if (z2) {
            Log.d("ExifInterface", "readExifSegment: Byte Align MM");
        }
        return ByteOrder.BIG_ENDIAN;
    }

    public final void A() {
        y(0, 5);
        y(0, 4);
        y(5, 4);
        HashMap[] hashMapArr = this.e;
        k64 k64Var = (k64) hashMapArr[1].get("PixelXDimension");
        k64 k64Var2 = (k64) hashMapArr[1].get("PixelYDimension");
        if (k64Var != null && k64Var2 != null) {
            hashMapArr[0].put("ImageWidth", k64Var);
            hashMapArr[0].put("ImageLength", k64Var2);
        }
        if (hashMapArr[4].isEmpty() && p(hashMapArr[5])) {
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!p(hashMapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        w(0, "ThumbnailOrientation", "Orientation");
        w(0, "ThumbnailImageLength", "ImageLength");
        w(0, "ThumbnailImageWidth", "ImageWidth");
        w(5, "ThumbnailOrientation", "Orientation");
        w(5, "ThumbnailImageLength", "ImageLength");
        w(5, "ThumbnailImageWidth", "ImageWidth");
        w(4, "Orientation", "ThumbnailOrientation");
        w(4, "ImageLength", "ThumbnailImageLength");
        w(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void a() {
        String b = b("DateTimeOriginal");
        HashMap[] hashMapArr = this.e;
        if (b != null && b("DateTime") == null) {
            HashMap hashMap = hashMapArr[0];
            byte[] bytes = b.concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(O);
            hashMap.put("DateTime", new k64(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", k64.a(0L, this.g));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", k64.a(0L, this.g));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", k64.a(0L, this.g));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", k64.a(0L, this.g));
        }
    }

    public final String b(String str) {
        k64 d = d(str);
        if (d != null) {
            int i = d.a;
            if (!M.contains(str)) {
                return d.f(this.g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i != 5 && i != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i);
                    return null;
                }
                m64[] m64VarArr = (m64[]) d.g(this.g);
                if (m64VarArr == null || m64VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(m64VarArr));
                    return null;
                }
                m64 m64Var = m64VarArr[0];
                Integer valueOf = Integer.valueOf((int) (m64Var.a / m64Var.b));
                m64 m64Var2 = m64VarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (m64Var2.a / m64Var2.b));
                m64 m64Var3 = m64VarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (m64Var3.a / m64Var3.b)));
            }
            try {
                return Double.toString(d.d(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        k64 d = d("Orientation");
        if (d == null) {
            return 1;
        }
        try {
            return d.e(this.g);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final k64 d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < I.length; i++) {
            k64 k64Var = (k64) this.e[i].get(str);
            if (k64Var != null) {
                return k64Var;
            }
        }
        return null;
    }

    public final void e(n64 n64Var) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            rjb.j("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                q64.a(mediaMetadataRetriever, new i64(n64Var));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                HashMap[] hashMapArr = this.e;
                if (str != null) {
                    hashMapArr[0].put("ImageWidth", k64.c(Integer.parseInt(str), this.g));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", k64.c(Integer.parseInt(str2), this.g));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", k64.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    n64Var.b(parseInt2);
                    byte[] bArr = new byte[6];
                    if (n64Var.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i = parseInt2 + 6;
                    int i2 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i2];
                    if (n64Var.read(bArr2) != i2) {
                        throw new IOException("Can't read exif");
                    }
                    this.i = i;
                    u(0, bArr2);
                }
                if (m) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0194, code lost:
    
        r23.b = r22.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0198, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00aa A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(j64 j64Var, int i, int i2) {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + j64Var);
        }
        j64Var.b = ByteOrder.BIG_ENDIAN;
        byte readByte = j64Var.readByte();
        byte b = -1;
        if (readByte != -1) {
            h64.b(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        if (j64Var.readByte() != -40) {
            h64.b(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        int i3 = 2;
        int i4 = 2;
        while (true) {
            byte readByte2 = j64Var.readByte();
            if (readByte2 != b) {
                h64.b(Integer.toHexString(readByte2 & 255), "Invalid marker:");
                return;
            }
            byte readByte3 = j64Var.readByte();
            if (z2) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = j64Var.readUnsignedShort();
                int i5 = readUnsignedShort - 2;
                int i6 = i4 + 4;
                if (z2) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i5 < 0) {
                    wa3.d("Invalid length");
                    return;
                }
                int i7 = 0;
                HashMap[] hashMapArr = this.e;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i5];
                    j64Var.readFully(bArr);
                    int i8 = i6 + i5;
                    byte[] bArr2 = P;
                    if (bArr2 != null && i5 >= bArr2.length) {
                        int i9 = 0;
                        while (i9 < bArr2.length) {
                            if (bArr[i9] == bArr2[i9]) {
                                i9++;
                                i7 = 0;
                            }
                        }
                        byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i5);
                        this.i = i + i6 + bArr2.length;
                        u(i2, copyOfRange);
                        x(new j64(copyOfRange));
                        i6 = i8;
                        i5 = 0;
                    }
                    byte[] bArr3 = Q;
                    if (bArr3 != null && i5 >= bArr3.length) {
                        int i10 = i7;
                        while (true) {
                            if (i10 >= bArr3.length) {
                                int length = i6 + bArr3.length;
                                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i5);
                                if (b("Xmp") == null) {
                                    hashMapArr[i7].put("Xmp", new k64(length, copyOfRange2, 1, copyOfRange2.length));
                                }
                            } else if (bArr[i10] == bArr3[i10]) {
                                i10++;
                            }
                        }
                    }
                    i6 = i8;
                    i5 = 0;
                } else if (readByte3 != -2) {
                    switch (readByte3) {
                        default:
                            switch (readByte3) {
                                default:
                                    switch (readByte3) {
                                        default:
                                            switch (readByte3) {
                                            }
                                        case -55:
                                        case -54:
                                        case -53:
                                            j64Var.a(1);
                                            hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", k64.a(j64Var.readUnsignedShort(), this.g));
                                            hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", k64.a(j64Var.readUnsignedShort(), this.g));
                                            i5 = readUnsignedShort - 7;
                                            break;
                                    }
                                case -59:
                                case -58:
                                case -57:
                                    break;
                            }
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                    }
                } else {
                    byte[] bArr4 = new byte[i5];
                    if (j64Var.read(bArr4) != i5) {
                        wa3.d("Invalid exif");
                        return;
                    }
                    if (b("UserComment") == null) {
                        HashMap hashMap = hashMapArr[1];
                        Charset charset = O;
                        byte[] bytes = new String(bArr4, charset).concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(charset);
                        hashMap.put("UserComment", new k64(i3, bytes.length, bytes));
                    }
                    i5 = 0;
                }
                if (i5 < 0) {
                    wa3.d("Invalid length");
                    return;
                }
                j64Var.a(i5);
                i4 = i6 + i5;
                i3 = 2;
                b = -1;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:14|15|(4:16|17|18|19)|(6:21|(2:23|24)(1:145)|26|(1:28)|29|(11:31|(3:32|33|(4:35|36|37|(3:39|(1:56)(3:41|(1:43)(2:53|(1:55))|(3:46|47|48))|51)(1:57))(2:142|143))|58|59|60|61|62|63|(1:121)(1:67)|68|(1:70)(8:71|72|74|75|76|(1:78)|79|(1:81)(2:82|(2:83|(2:85|(4:88|89|(2:90|(2:92|(1:94)(1:95))(3:97|98|(2:99|(2:101|(1:104)(1:103))(2:105|106))))|96)(1:87))(2:107|108))))))|146|59|60|61|62|63|(1:65)|121|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x00f8, code lost:
    
        if (r3 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00fa, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00fd, code lost:
    
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x00ed, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x00ee, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x00f1, code lost:
    
        if (r4 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x00f3, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x00f6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x00f7, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x00f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x00c9, code lost:
    
        if (r7 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        if (r8 < 16) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0103 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0136  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int g(BufferedInputStream bufferedInputStream) {
        int i;
        j64 j64Var;
        int i2;
        int i3;
        j64 j64Var2;
        long readInt;
        byte[] bArr;
        long j;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i4 = 0;
        while (true) {
            byte[] bArr3 = r;
            if (i4 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i4] != bArr3[i4]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i5 = 0; i5 < bytes.length; i5++) {
                    if (bArr2[i5] != bytes[i5]) {
                        j64 j64Var3 = null;
                        try {
                            j64Var = new j64(bArr2);
                            try {
                                try {
                                    readInt = j64Var.readInt();
                                    bArr = new byte[4];
                                    j64Var.read(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                j64Var3 = j64Var;
                                if (j64Var3 != null) {
                                    j64Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            j64Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (j64Var3 != null) {
                            }
                            throw th;
                        }
                        if (Arrays.equals(bArr, s)) {
                            if (readInt == 1) {
                                readInt = j64Var.readLong();
                                j = 16;
                            } else {
                                j = 8;
                            }
                            if (readInt > 5000) {
                                readInt = 5000;
                            }
                            long j2 = readInt - j;
                            if (j2 >= 8) {
                                byte[] bArr4 = new byte[4];
                                long j3 = 0;
                                boolean z2 = false;
                                boolean z3 = false;
                                while (true) {
                                    if (j3 >= j2 / 4) {
                                        i = 0;
                                        break;
                                    }
                                    i = 0;
                                    try {
                                        if (j64Var.read(bArr4) != 4) {
                                            break;
                                        }
                                        if (j3 != 1) {
                                            if (Arrays.equals(bArr4, t)) {
                                                z2 = true;
                                            } else if (Arrays.equals(bArr4, u)) {
                                                z3 = true;
                                            }
                                            if (z2 && z3) {
                                                j64Var.close();
                                                return 12;
                                            }
                                        }
                                        j3++;
                                    } catch (Exception e3) {
                                        e = e3;
                                        if (m) {
                                            Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                        }
                                    }
                                }
                                j64Var.close();
                                j64 j64Var4 = new j64(bArr2);
                                ByteOrder t2 = t(j64Var4);
                                this.g = t2;
                                j64Var4.b = t2;
                                short readShort = j64Var4.readShort();
                                i2 = (readShort != 20306 || readShort == 21330) ? 1 : i;
                                j64Var4.close();
                                if (i2 != 0) {
                                    return 7;
                                }
                                try {
                                    j64Var2 = new j64(bArr2);
                                } catch (Exception unused) {
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                try {
                                    ByteOrder t3 = t(j64Var2);
                                    this.g = t3;
                                    j64Var2.b = t3;
                                    i3 = j64Var2.readShort() != 85 ? i : 1;
                                    j64Var2.close();
                                } catch (Exception unused2) {
                                    j64Var3 = j64Var2;
                                    if (j64Var3 != null) {
                                        j64Var3.close();
                                    }
                                    i3 = i;
                                    if (i3 == 0) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    j64Var3 = j64Var2;
                                    if (j64Var3 != null) {
                                        j64Var3.close();
                                    }
                                    throw th;
                                }
                                if (i3 == 0) {
                                    return 10;
                                }
                                int i6 = i;
                                while (true) {
                                    byte[] bArr5 = x;
                                    if (i6 >= bArr5.length) {
                                        return 13;
                                    }
                                    if (bArr2[i6] != bArr5[i6]) {
                                        int i7 = i;
                                        while (true) {
                                            byte[] bArr6 = B;
                                            if (i7 >= bArr6.length) {
                                                int i8 = i;
                                                while (true) {
                                                    byte[] bArr7 = C;
                                                    if (i8 >= bArr7.length) {
                                                        return 14;
                                                    }
                                                    if (bArr2[bArr6.length + i8 + 4] != bArr7[i8]) {
                                                        break;
                                                    }
                                                    i8++;
                                                }
                                            } else {
                                                if (bArr2[i7] != bArr6[i7]) {
                                                    break;
                                                }
                                                i7++;
                                            }
                                        }
                                        return i;
                                    }
                                    i6++;
                                }
                            }
                        }
                        j64Var.close();
                        i = 0;
                        j64 j64Var42 = new j64(bArr2);
                        ByteOrder t22 = t(j64Var42);
                        this.g = t22;
                        j64Var42.b = t22;
                        short readShort2 = j64Var42.readShort();
                        if (readShort2 != 20306) {
                        }
                        j64Var42.close();
                        if (i2 != 0) {
                        }
                    }
                }
                return 9;
            }
            i4++;
        }
    }

    public final void h(n64 n64Var) {
        int i;
        int i2;
        k(n64Var);
        HashMap[] hashMapArr = this.e;
        k64 k64Var = (k64) hashMapArr[1].get("MakerNote");
        if (k64Var != null) {
            n64 n64Var2 = new n64(k64Var.d);
            n64Var2.b = this.g;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            n64Var2.readFully(bArr2);
            n64Var2.b(0L);
            byte[] bArr3 = w;
            byte[] bArr4 = new byte[bArr3.length];
            n64Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                n64Var2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                n64Var2.b(12L);
            }
            v(n64Var2, 6);
            k64 k64Var2 = (k64) hashMapArr[7].get("PreviewImageStart");
            k64 k64Var3 = (k64) hashMapArr[7].get("PreviewImageLength");
            if (k64Var2 != null && k64Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", k64Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", k64Var3);
            }
            k64 k64Var4 = (k64) hashMapArr[8].get("AspectFrame");
            if (k64Var4 != null) {
                int[] iArr = (int[]) k64Var4.g(this.g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                k64 c = k64.c(i5, this.g);
                k64 c2 = k64.c(i6, this.g);
                hashMapArr[0].put("ImageWidth", c);
                hashMapArr[0].put("ImageLength", c2);
            }
        }
    }

    public final void i(j64 j64Var) {
        if (m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + j64Var);
        }
        j64Var.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = x;
        j64Var.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = j64Var.readInt();
                byte[] bArr2 = new byte[4];
                if (j64Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i = length + 8;
                if (i == 16 && !Arrays.equals(bArr2, z)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, A)) {
                    return;
                }
                if (Arrays.equals(bArr2, y)) {
                    byte[] bArr3 = new byte[readInt];
                    if (j64Var.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + vhe.a(bArr2));
                    }
                    int readInt2 = j64Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.i = i;
                        u(0, bArr3);
                        A();
                        x(new j64(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i2 = readInt + 4;
                j64Var.a(i2);
                length = i + i2;
            } catch (EOFException unused) {
                wa3.d("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void j(j64 j64Var) {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + j64Var);
        }
        j64Var.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        j64Var.read(bArr);
        j64Var.read(bArr2);
        j64Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        j64Var.a(i - j64Var.c);
        j64Var.read(bArr4);
        f(new j64(bArr4), i, 5);
        j64Var.a(i3 - j64Var.c);
        j64Var.b = ByteOrder.BIG_ENDIAN;
        int readInt = j64Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = j64Var.readUnsignedShort();
            int readUnsignedShort2 = j64Var.readUnsignedShort();
            if (readUnsignedShort == H.a) {
                short readShort = j64Var.readShort();
                short readShort2 = j64Var.readShort();
                k64 c = k64.c(readShort, this.g);
                k64 c2 = k64.c(readShort2, this.g);
                HashMap[] hashMapArr = this.e;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            j64Var.a(readUnsignedShort2);
        }
    }

    public final void k(n64 n64Var) {
        r(n64Var);
        v(n64Var, 0);
        z(n64Var, 0);
        z(n64Var, 5);
        z(n64Var, 4);
        A();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.e;
            k64 k64Var = (k64) hashMapArr[1].get("MakerNote");
            if (k64Var != null) {
                n64 n64Var2 = new n64(k64Var.d);
                n64Var2.b = this.g;
                n64Var2.a(6);
                v(n64Var2, 9);
                k64 k64Var2 = (k64) hashMapArr[9].get("ColorSpace");
                if (k64Var2 != null) {
                    hashMapArr[1].put("ColorSpace", k64Var2);
                }
            }
        }
    }

    public final void l(n64 n64Var) {
        if (m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + n64Var);
        }
        k(n64Var);
        HashMap[] hashMapArr = this.e;
        k64 k64Var = (k64) hashMapArr[0].get("JpgFromRaw");
        if (k64Var != null) {
            f(new j64(k64Var.d), (int) k64Var.c, 5);
        }
        k64 k64Var2 = (k64) hashMapArr[0].get("ISO");
        k64 k64Var3 = (k64) hashMapArr[1].get("PhotographicSensitivity");
        if (k64Var2 == null || k64Var3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", k64Var2);
    }

    public final void m(j64 j64Var) {
        if (m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + j64Var);
        }
        j64Var.b = ByteOrder.LITTLE_ENDIAN;
        j64Var.a(B.length);
        int readInt = j64Var.readInt() + 8;
        byte[] bArr = C;
        j64Var.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (j64Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = j64Var.readInt();
                int i = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (j64Var.read(bArr3) == readInt2) {
                        this.i = i;
                        u(0, bArr3);
                        x(new j64(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + vhe.a(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                j64Var.a(readInt2);
            } catch (EOFException unused) {
                wa3.d("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void n(j64 j64Var, HashMap hashMap) {
        k64 k64Var = (k64) hashMap.get("JPEGInterchangeFormat");
        k64 k64Var2 = (k64) hashMap.get("JPEGInterchangeFormatLength");
        if (k64Var == null || k64Var2 == null) {
            return;
        }
        int e = k64Var.e(this.g);
        int e2 = k64Var2.e(this.g);
        if (this.d == 7) {
            e += this.j;
        }
        if (e > 0 && e2 > 0 && this.a == null && this.c == null && this.b == null) {
            j64Var.skip(e);
            j64Var.read(new byte[e2]);
        }
        if (m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
        }
    }

    public final void o(String str) {
        boolean z2;
        if (str == null) {
            gxc.d("filename cannot be null");
            return;
        }
        FileInputStream fileInputStream = null;
        this.c = null;
        this.a = str;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    try {
                        p64.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
                        z2 = true;
                    } catch (Exception unused) {
                        if (m) {
                            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                        }
                        z2 = false;
                    }
                    if (z2) {
                        this.b = fileInputStream2.getFD();
                    } else {
                        this.b = null;
                    }
                    q(fileInputStream2);
                    try {
                        fileInputStream2.close();
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Exception unused3) {
                        }
                    }
                    throw th;
                }
            } catch (RuntimeException e) {
                throw e;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final boolean p(HashMap hashMap) {
        k64 k64Var = (k64) hashMap.get("ImageLength");
        k64 k64Var2 = (k64) hashMap.get("ImageWidth");
        if (k64Var == null || k64Var2 == null) {
            return false;
        }
        return k64Var.e(this.g) <= 512 && k64Var2.e(this.g) <= 512;
    }

    public final void q(InputStream inputStream) {
        boolean z2 = m;
        if (inputStream == null) {
            gxc.d("inputstream shouldn't be null");
            return;
        }
        for (int i = 0; i < I.length; i++) {
            try {
                try {
                    this.e[i] = new HashMap();
                } finally {
                    a();
                    if (z2) {
                        s();
                    }
                }
            } catch (IOException | UnsupportedOperationException e) {
                if (z2) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z2) {
                    s();
                    return;
                }
                return;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int g = g(bufferedInputStream);
        this.d = g;
        if (g == 4 || g == 9 || g == 13 || g == 14) {
            j64 j64Var = new j64(bufferedInputStream);
            int i2 = this.d;
            if (i2 == 4) {
                f(j64Var, 0, 0);
            } else if (i2 == 13) {
                i(j64Var);
            } else if (i2 == 9) {
                j(j64Var);
            } else if (i2 == 14) {
                m(j64Var);
            }
        } else {
            n64 n64Var = new n64(bufferedInputStream);
            int i3 = this.d;
            if (i3 == 12) {
                e(n64Var);
            } else if (i3 == 7) {
                h(n64Var);
            } else if (i3 == 10) {
                l(n64Var);
            } else {
                k(n64Var);
            }
            n64Var.b(this.i);
            x(n64Var);
        }
    }

    public final void r(n64 n64Var) {
        ByteOrder t2 = t(n64Var);
        this.g = t2;
        n64Var.b = t2;
        int readUnsignedShort = n64Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            h64.b(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = n64Var.readInt();
        if (readInt < 8) {
            wa3.d(hg9.j(readInt, "Invalid first Ifd offset: "));
            return;
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            n64Var.a(i2);
        }
    }

    public final void s() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.e;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder l = hg9.l(i, "The size of tag group[", "]: ");
            l.append(hashMapArr[i].size());
            Log.d("ExifInterface", l.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                k64 k64Var = (k64) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + k64Var.toString() + ", tagValue: '" + k64Var.f(this.g) + "'");
            }
            i++;
        }
    }

    public final void u(int i, byte[] bArr) {
        n64 n64Var = new n64(bArr);
        r(n64Var);
        v(n64Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(n64 n64Var, int i) {
        HashMap[] hashMapArr;
        int i2;
        short s2;
        boolean z2;
        int i3;
        int i4;
        long j;
        long j2;
        boolean z3;
        int i5;
        short s3;
        int i6;
        long j3;
        HashMap[] hashMapArr2;
        int i7;
        int readUnsignedShort;
        long j4;
        int i8 = i;
        Integer valueOf = Integer.valueOf(n64Var.c);
        HashSet hashSet = this.f;
        hashSet.add(valueOf);
        short readShort = n64Var.readShort();
        boolean z4 = m;
        if (z4) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) readShort));
        }
        if (readShort > 0) {
            short s4 = 0;
            while (true) {
                hashMapArr = this.e;
                if (s4 >= readShort) {
                    break;
                }
                int readUnsignedShort2 = n64Var.readUnsignedShort();
                int readUnsignedShort3 = n64Var.readUnsignedShort();
                int readInt = n64Var.readInt();
                long j5 = n64Var.c + 4;
                l64 l64Var = (l64) K[i8].get(Integer.valueOf(readUnsignedShort2));
                if (z4) {
                    i2 = 3;
                    Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i8), Integer.valueOf(readUnsignedShort2), l64Var != null ? l64Var.b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
                } else {
                    i2 = 3;
                }
                if (l64Var == null) {
                    if (z4) {
                        Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                    }
                    s2 = readShort;
                    z2 = z4;
                } else {
                    if (readUnsignedShort3 > 0) {
                        if (readUnsignedShort3 < F.length) {
                            i4 = l64Var.c;
                            s2 = readShort;
                            if (i4 == 7 || readUnsignedShort3 == 7 || i4 == readUnsignedShort3 || (i5 = l64Var.d) == readUnsignedShort3) {
                                z2 = z4;
                            } else {
                                z2 = z4;
                                if (((i4 != 4 && i5 != 4) || readUnsignedShort3 != i2) && (((i4 != 9 && i5 != 9) || readUnsignedShort3 != 8) && ((i4 != 12 && i5 != 12) || readUnsignedShort3 != 11))) {
                                    if (z2) {
                                        StringBuilder sb = new StringBuilder("Skip the tag entry since data format (");
                                        sb.append(E[readUnsignedShort3]);
                                        sb.append(") is unexpected for tag: ");
                                        ts2.w(sb, l64Var.b, "ExifInterface");
                                    }
                                }
                            }
                            if (readUnsignedShort3 != 7) {
                                i4 = readUnsignedShort3;
                            }
                            i3 = readInt;
                            j = r9[i4] * i3;
                            if (j < 0 || j > 2147483647L) {
                                if (z2) {
                                    j2 = j;
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i3);
                                } else {
                                    j2 = j;
                                }
                                z3 = false;
                                j = j2;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                s3 = s4;
                                if (j > 4) {
                                    int readInt2 = n64Var.readInt();
                                    hashMapArr2 = hashMapArr;
                                    if (z2) {
                                        i7 = readUnsignedShort2;
                                        Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                    } else {
                                        i7 = readUnsignedShort2;
                                    }
                                    if (this.d == 7) {
                                        if ("MakerNote".equals(l64Var.b)) {
                                            this.j = readInt2;
                                        } else if (i8 == 6 && "ThumbnailImage".equals(l64Var.b)) {
                                            this.k = readInt2;
                                            this.l = i3;
                                            k64 c = k64.c(6, this.g);
                                            i6 = i3;
                                            k64 a = k64.a(this.k, this.g);
                                            j3 = j5;
                                            k64 a2 = k64.a(this.l, this.g);
                                            hashMapArr2[4].put("Compression", c);
                                            hashMapArr2[4].put("JPEGInterchangeFormat", a);
                                            hashMapArr2[4].put("JPEGInterchangeFormatLength", a2);
                                            n64Var.b(readInt2);
                                        }
                                    }
                                    i6 = i3;
                                    j3 = j5;
                                    n64Var.b(readInt2);
                                } else {
                                    i6 = i3;
                                    j3 = j5;
                                    hashMapArr2 = hashMapArr;
                                    i7 = readUnsignedShort2;
                                }
                                Integer num = (Integer) N.get(Integer.valueOf(i7));
                                if (z2) {
                                    Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j);
                                }
                                if (num != null) {
                                    if (i4 != 3) {
                                        if (i4 == 4) {
                                            j4 = n64Var.readInt() & 4294967295L;
                                        } else if (i4 == 8) {
                                            readUnsignedShort = n64Var.readShort();
                                        } else if (i4 == 9 || i4 == 13) {
                                            readUnsignedShort = n64Var.readInt();
                                        } else {
                                            j4 = -1;
                                        }
                                        if (z2) {
                                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), l64Var.b));
                                        }
                                        if (j4 <= 0) {
                                            if (!hashSet.contains(Integer.valueOf((int) j4))) {
                                                n64Var.b(j4);
                                                v(n64Var, num.intValue());
                                            } else if (z2) {
                                                StringBuilder sb2 = new StringBuilder("Skip jump into the IFD since it has already been read: IfdType ");
                                                sb2.append(num);
                                                sb2.append(" (at ");
                                                sb2.append(j4);
                                                ts2.w(sb2, ")", "ExifInterface");
                                            }
                                        } else if (z2) {
                                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                                        }
                                        n64Var.b(j3);
                                    } else {
                                        readUnsignedShort = n64Var.readUnsignedShort();
                                    }
                                    j4 = readUnsignedShort;
                                    if (z2) {
                                    }
                                    if (j4 <= 0) {
                                    }
                                    n64Var.b(j3);
                                } else {
                                    long j6 = j3;
                                    int i9 = n64Var.c + this.i;
                                    byte[] bArr = new byte[(int) j];
                                    n64Var.readFully(bArr);
                                    k64 k64Var = new k64(i9, bArr, i4, i6);
                                    HashMap hashMap = hashMapArr2[i];
                                    String str = l64Var.b;
                                    hashMap.put(str, k64Var);
                                    if ("DNGVersion".equals(str)) {
                                        this.d = 3;
                                    }
                                    if ((("Make".equals(str) || "Model".equals(str)) && k64Var.f(this.g).contains("PENTAX")) || ("Compression".equals(str) && k64Var.e(this.g) == 65535)) {
                                        this.d = 8;
                                    }
                                    if (n64Var.c != j6) {
                                        n64Var.b(j6);
                                    }
                                }
                            } else {
                                n64Var.b(j5);
                                s3 = s4;
                            }
                            s4 = (short) (s3 + 1);
                            i8 = i;
                            readShort = s2;
                            z4 = z2;
                        }
                    }
                    s2 = readShort;
                    z2 = z4;
                    i3 = readInt;
                    if (z2) {
                        Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + readUnsignedShort3);
                    }
                    i4 = readUnsignedShort3;
                    z3 = false;
                    j = 0;
                    if (z3) {
                    }
                    s4 = (short) (s3 + 1);
                    i8 = i;
                    readShort = s2;
                    z4 = z2;
                }
                i3 = readInt;
                i4 = readUnsignedShort3;
                z3 = false;
                j = 0;
                if (z3) {
                }
                s4 = (short) (s3 + 1);
                i8 = i;
                readShort = s2;
                z4 = z2;
            }
            boolean z5 = z4;
            int readInt3 = n64Var.readInt();
            if (z5) {
                Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(readInt3)));
            }
            long j7 = readInt3;
            if (j7 <= 0) {
                if (z5) {
                    Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + readInt3);
                    return;
                }
                return;
            }
            if (hashSet.contains(Integer.valueOf(readInt3))) {
                if (z5) {
                    Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + readInt3);
                    return;
                }
                return;
            }
            n64Var.b(j7);
            if (hashMapArr[4].isEmpty()) {
                v(n64Var, 4);
            } else if (hashMapArr[5].isEmpty()) {
                v(n64Var, 5);
            }
        }
    }

    public final void w(int i, String str, String str2) {
        HashMap[] hashMapArr = this.e;
        if (hashMapArr[i].isEmpty() || hashMapArr[i].get(str) == null) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMap.put(str2, hashMap.get(str));
        hashMapArr[i].remove(str);
    }

    public final void x(j64 j64Var) {
        k64 k64Var;
        int e;
        HashMap hashMap = this.e[4];
        k64 k64Var2 = (k64) hashMap.get("Compression");
        if (k64Var2 == null) {
            n(j64Var, hashMap);
            return;
        }
        int e2 = k64Var2.e(this.g);
        if (e2 != 1) {
            if (e2 == 6) {
                n(j64Var, hashMap);
                return;
            } else if (e2 != 7) {
                return;
            }
        }
        k64 k64Var3 = (k64) hashMap.get("BitsPerSample");
        if (k64Var3 != null) {
            int[] iArr = (int[]) k64Var3.g(this.g);
            int[] iArr2 = p;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (k64Var = (k64) hashMap.get("PhotometricInterpretation")) != null && (((e = k64Var.e(this.g)) == 1 && Arrays.equals(iArr, q)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                k64 k64Var4 = (k64) hashMap.get("StripOffsets");
                k64 k64Var5 = (k64) hashMap.get("StripByteCounts");
                if (k64Var4 == null || k64Var5 == null) {
                    return;
                }
                long[] b = vhe.b(k64Var4.g(this.g));
                long[] b2 = vhe.b(k64Var5.g(this.g));
                if (b == null || b.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (b2 == null || b2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (b.length != b2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j = 0;
                for (long j2 : b2) {
                    j += j2;
                }
                byte[] bArr = new byte[(int) j];
                this.h = true;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < b.length; i3++) {
                    int i4 = (int) b[i3];
                    int i5 = (int) b2[i3];
                    if (i3 < b.length - 1 && i4 + i5 != b[i3 + 1]) {
                        this.h = false;
                    }
                    int i6 = i4 - i;
                    if (i6 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j3 = i6;
                    if (j64Var.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (j64Var.read(bArr2) != i5) {
                        Log.d("ExifInterface", "Failed to read " + i5 + " bytes.");
                        return;
                    }
                    i = i7 + i5;
                    System.arraycopy(bArr2, 0, bArr, i2, i5);
                    i2 += i5;
                }
                if (this.h) {
                    long j4 = b[0];
                    return;
                }
                return;
            }
        }
        if (m) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void y(int i, int i2) {
        HashMap[] hashMapArr = this.e;
        boolean isEmpty = hashMapArr[i].isEmpty();
        boolean z2 = m;
        if (isEmpty || hashMapArr[i2].isEmpty()) {
            if (z2) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        k64 k64Var = (k64) hashMapArr[i].get("ImageLength");
        k64 k64Var2 = (k64) hashMapArr[i].get("ImageWidth");
        k64 k64Var3 = (k64) hashMapArr[i2].get("ImageLength");
        k64 k64Var4 = (k64) hashMapArr[i2].get("ImageWidth");
        if (k64Var == null || k64Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (k64Var3 == null || k64Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e = k64Var.e(this.g);
        int e2 = k64Var2.e(this.g);
        int e3 = k64Var3.e(this.g);
        int e4 = k64Var4.e(this.g);
        if (e >= e3 || e2 >= e4) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void z(n64 n64Var, int i) {
        k64 c;
        k64 c2;
        HashMap[] hashMapArr = this.e;
        k64 k64Var = (k64) hashMapArr[i].get("DefaultCropSize");
        k64 k64Var2 = (k64) hashMapArr[i].get("SensorTopBorder");
        k64 k64Var3 = (k64) hashMapArr[i].get("SensorLeftBorder");
        k64 k64Var4 = (k64) hashMapArr[i].get("SensorBottomBorder");
        k64 k64Var5 = (k64) hashMapArr[i].get("SensorRightBorder");
        if (k64Var != null) {
            int i2 = k64Var.a;
            ByteOrder byteOrder = this.g;
            if (i2 == 5) {
                m64[] m64VarArr = (m64[]) k64Var.g(byteOrder);
                if (m64VarArr == null || m64VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(m64VarArr));
                    return;
                }
                c = k64.b(m64VarArr[0], this.g);
                c2 = k64.b(m64VarArr[1], this.g);
            } else {
                int[] iArr = (int[]) k64Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c = k64.c(iArr[0], this.g);
                c2 = k64.c(iArr[1], this.g);
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
            return;
        }
        if (k64Var2 != null && k64Var3 != null && k64Var4 != null && k64Var5 != null) {
            int e = k64Var2.e(this.g);
            int e2 = k64Var4.e(this.g);
            int e3 = k64Var5.e(this.g);
            int e4 = k64Var3.e(this.g);
            if (e2 <= e || e3 <= e4) {
                return;
            }
            k64 c3 = k64.c(e2 - e, this.g);
            k64 c4 = k64.c(e3 - e4, this.g);
            hashMapArr[i].put("ImageLength", c3);
            hashMapArr[i].put("ImageWidth", c4);
            return;
        }
        k64 k64Var6 = (k64) hashMapArr[i].get("ImageLength");
        k64 k64Var7 = (k64) hashMapArr[i].get("ImageWidth");
        if (k64Var6 == null || k64Var7 == null) {
            k64 k64Var8 = (k64) hashMapArr[i].get("JPEGInterchangeFormat");
            k64 k64Var9 = (k64) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (k64Var8 == null || k64Var9 == null) {
                return;
            }
            int e5 = k64Var8.e(this.g);
            int e6 = k64Var8.e(this.g);
            n64Var.b(e5);
            byte[] bArr = new byte[e6];
            n64Var.read(bArr);
            f(new j64(bArr), e5, i);
        }
    }

    public o64(String str) {
        l64[][] l64VarArr = I;
        this.e = new HashMap[l64VarArr.length];
        this.f = new HashSet(l64VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            o(str);
        } else {
            gxc.d("filename cannot be null");
            throw null;
        }
    }

    public o64(File file) {
        l64[][] l64VarArr = I;
        this.e = new HashMap[l64VarArr.length];
        this.f = new HashSet(l64VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            o(file.getAbsolutePath());
        } else {
            gxc.d("file cannot be null");
            throw null;
        }
    }
}
