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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class d54 {
    public static final String[] E;
    public static final int[] F;
    public static final byte[] G;
    public static final a54 H;
    public static final a54[][] I;
    public static final a54[] J;
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
        a54[] a54VarArr = {new a54("NewSubfileType", kk7.c4, 4), new a54("SubfileType", kk7.d4, 4), new a54(256, 3, 4, "ImageWidth"), new a54(kk7.f4, 3, 4, "ImageLength"), new a54("BitsPerSample", kk7.g4, 3), new a54("Compression", kk7.h4, 3), new a54("PhotometricInterpretation", kk7.k4, 3), new a54("ImageDescription", kk7.s4, 2), new a54("Make", kk7.t4, 2), new a54("Model", kk7.u4, 2), new a54(kk7.v4, 3, 4, "StripOffsets"), new a54("Orientation", kk7.w4, 3), new a54("SamplesPerPixel", kk7.z4, 3), new a54(kk7.A4, 3, 4, "RowsPerStrip"), new a54(kk7.B4, 3, 4, "StripByteCounts"), new a54("XResolution", kk7.E4, 5), new a54("YResolution", kk7.F4, 5), new a54("PlanarConfiguration", kk7.G4, 3), new a54("ResolutionUnit", kk7.S4, 3), new a54("TransferFunction", kk7.X4, 3), new a54("Software", kk7.b5, 2), new a54("DateTime", kk7.c5, 2), new a54("Artist", kk7.l5, 2), new a54("WhitePoint", kk7.o5, 5), new a54("PrimaryChromaticities", kk7.p5, 5), new a54("SubIFDPointer", kk7.A5, 4), new a54("JPEGInterchangeFormat", 513, 4), new a54("JPEGInterchangeFormatLength", 514, 4), new a54("YCbCrCoefficients", 529, 5), new a54("YCbCrSubSampling", 530, 3), new a54("YCbCrPositioning", 531, 3), new a54("ReferenceBlackWhite", 532, 5), new a54("Copyright", 33432, 2), new a54("ExifIFDPointer", 34665, 4), new a54("GPSInfoIFDPointer", 34853, 4), new a54("SensorTopBorder", 4, 4), new a54("SensorLeftBorder", 5, 4), new a54("SensorBottomBorder", 6, 4), new a54("SensorRightBorder", 7, 4), new a54("ISO", 23, 3), new a54("JpgFromRaw", 46, 7), new a54("Xmp", 700, 1)};
        a54[] a54VarArr2 = {new a54("ExposureTime", 33434, 5), new a54("FNumber", 33437, 5), new a54("ExposureProgram", 34850, 3), new a54("SpectralSensitivity", 34852, 2), new a54("PhotographicSensitivity", 34855, 3), new a54("OECF", 34856, 7), new a54("SensitivityType", 34864, 3), new a54("StandardOutputSensitivity", 34865, 4), new a54("RecommendedExposureIndex", 34866, 4), new a54("ISOSpeed", 34867, 4), new a54("ISOSpeedLatitudeyyy", 34868, 4), new a54("ISOSpeedLatitudezzz", 34869, 4), new a54("ExifVersion", 36864, 2), new a54("DateTimeOriginal", 36867, 2), new a54("DateTimeDigitized", 36868, 2), new a54("OffsetTime", 36880, 2), new a54("OffsetTimeOriginal", 36881, 2), new a54("OffsetTimeDigitized", 36882, 2), new a54("ComponentsConfiguration", 37121, 7), new a54("CompressedBitsPerPixel", 37122, 5), new a54("ShutterSpeedValue", 37377, 10), new a54("ApertureValue", 37378, 5), new a54("BrightnessValue", 37379, 10), new a54("ExposureBiasValue", 37380, 10), new a54("MaxApertureValue", 37381, 5), new a54("SubjectDistance", 37382, 5), new a54("MeteringMode", 37383, 3), new a54("LightSource", 37384, 3), new a54("Flash", 37385, 3), new a54("FocalLength", 37386, 5), new a54("SubjectArea", 37396, 3), new a54("MakerNote", 37500, 7), new a54("UserComment", 37510, 7), new a54("SubSecTime", 37520, 2), new a54("SubSecTimeOriginal", 37521, 2), new a54("SubSecTimeDigitized", 37522, 2), new a54("FlashpixVersion", 40960, 7), new a54("ColorSpace", 40961, 3), new a54(40962, 3, 4, "PixelXDimension"), new a54(40963, 3, 4, "PixelYDimension"), new a54("RelatedSoundFile", 40964, 2), new a54("InteroperabilityIFDPointer", 40965, 4), new a54("FlashEnergy", 41483, 5), new a54("SpatialFrequencyResponse", 41484, 7), new a54("FocalPlaneXResolution", 41486, 5), new a54("FocalPlaneYResolution", 41487, 5), new a54("FocalPlaneResolutionUnit", 41488, 3), new a54("SubjectLocation", 41492, 3), new a54("ExposureIndex", 41493, 5), new a54("SensingMethod", 41495, 3), new a54("FileSource", 41728, 7), new a54("SceneType", 41729, 7), new a54("CFAPattern", 41730, 7), new a54("CustomRendered", 41985, 3), new a54("ExposureMode", 41986, 3), new a54("WhiteBalance", 41987, 3), new a54("DigitalZoomRatio", 41988, 5), new a54("FocalLengthIn35mmFilm", 41989, 3), new a54("SceneCaptureType", 41990, 3), new a54("GainControl", 41991, 3), new a54("Contrast", 41992, 3), new a54("Saturation", 41993, 3), new a54("Sharpness", 41994, 3), new a54("DeviceSettingDescription", 41995, 7), new a54("SubjectDistanceRange", 41996, 3), new a54("ImageUniqueID", 42016, 2), new a54("CameraOwnerName", 42032, 2), new a54("BodySerialNumber", 42033, 2), new a54("LensSpecification", 42034, 5), new a54("LensMake", 42035, 2), new a54("LensModel", 42036, 2), new a54("Gamma", 42240, 5), new a54("DNGVersion", 50706, 1), new a54(50720, 3, 4, "DefaultCropSize")};
        a54[] a54VarArr3 = {new a54("GPSVersionID", 0, 1), new a54("GPSLatitudeRef", 1, 2), new a54(2, 5, 10, "GPSLatitude"), new a54("GPSLongitudeRef", 3, 2), new a54(4, 5, 10, "GPSLongitude"), new a54("GPSAltitudeRef", 5, 1), new a54("GPSAltitude", 6, 5), new a54("GPSTimeStamp", 7, 5), new a54("GPSSatellites", 8, 2), new a54("GPSStatus", 9, 2), new a54("GPSMeasureMode", 10, 2), new a54("GPSDOP", 11, 5), new a54("GPSSpeedRef", 12, 2), new a54("GPSSpeed", 13, 5), new a54("GPSTrackRef", 14, 2), new a54("GPSTrack", 15, 5), new a54("GPSImgDirectionRef", 16, 2), new a54("GPSImgDirection", 17, 5), new a54("GPSMapDatum", 18, 2), new a54("GPSDestLatitudeRef", 19, 2), new a54("GPSDestLatitude", 20, 5), new a54("GPSDestLongitudeRef", 21, 2), new a54("GPSDestLongitude", 22, 5), new a54("GPSDestBearingRef", 23, 2), new a54("GPSDestBearing", 24, 5), new a54("GPSDestDistanceRef", 25, 2), new a54("GPSDestDistance", 26, 5), new a54("GPSProcessingMethod", 27, 7), new a54("GPSAreaInformation", 28, 7), new a54("GPSDateStamp", 29, 2), new a54("GPSDifferential", 30, 3), new a54("GPSHPositioningError", 31, 5)};
        a54[] a54VarArr4 = {new a54("InteroperabilityIndex", 1, 2)};
        a54[] a54VarArr5 = {new a54("NewSubfileType", kk7.c4, 4), new a54("SubfileType", kk7.d4, 4), new a54(256, 3, 4, "ThumbnailImageWidth"), new a54(kk7.f4, 3, 4, "ThumbnailImageLength"), new a54("BitsPerSample", kk7.g4, 3), new a54("Compression", kk7.h4, 3), new a54("PhotometricInterpretation", kk7.k4, 3), new a54("ImageDescription", kk7.s4, 2), new a54("Make", kk7.t4, 2), new a54("Model", kk7.u4, 2), new a54(kk7.v4, 3, 4, "StripOffsets"), new a54("ThumbnailOrientation", kk7.w4, 3), new a54("SamplesPerPixel", kk7.z4, 3), new a54(kk7.A4, 3, 4, "RowsPerStrip"), new a54(kk7.B4, 3, 4, "StripByteCounts"), new a54("XResolution", kk7.E4, 5), new a54("YResolution", kk7.F4, 5), new a54("PlanarConfiguration", kk7.G4, 3), new a54("ResolutionUnit", kk7.S4, 3), new a54("TransferFunction", kk7.X4, 3), new a54("Software", kk7.b5, 2), new a54("DateTime", kk7.c5, 2), new a54("Artist", kk7.l5, 2), new a54("WhitePoint", kk7.o5, 5), new a54("PrimaryChromaticities", kk7.p5, 5), new a54("SubIFDPointer", kk7.A5, 4), new a54("JPEGInterchangeFormat", 513, 4), new a54("JPEGInterchangeFormatLength", 514, 4), new a54("YCbCrCoefficients", 529, 5), new a54("YCbCrSubSampling", 530, 3), new a54("YCbCrPositioning", 531, 3), new a54("ReferenceBlackWhite", 532, 5), new a54("Copyright", 33432, 2), new a54("ExifIFDPointer", 34665, 4), new a54("GPSInfoIFDPointer", 34853, 4), new a54("DNGVersion", 50706, 1), new a54(50720, 3, 4, "DefaultCropSize")};
        H = new a54("StripOffsets", kk7.v4, 3);
        I = new a54[][]{a54VarArr, a54VarArr2, a54VarArr3, a54VarArr4, a54VarArr5, a54VarArr, new a54[]{new a54("ThumbnailImage", 256, 7), new a54("CameraSettingsIFDPointer", 8224, 4), new a54("ImageProcessingIFDPointer", 8256, 4)}, new a54[]{new a54("PreviewImageStart", kk7.f4, 4), new a54("PreviewImageLength", kk7.g4, 4)}, new a54[]{new a54("AspectFrame", 4371, 3)}, new a54[]{new a54("ColorSpace", 55, 3)}};
        J = new a54[]{new a54("SubIFDPointer", kk7.A5, 4), new a54("ExifIFDPointer", 34665, 4), new a54("GPSInfoIFDPointer", 34853, 4), new a54("InteroperabilityIFDPointer", 40965, 4), new a54("CameraSettingsIFDPointer", 8224, 1), new a54("ImageProcessingIFDPointer", 8256, 1)};
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
            a54[][] a54VarArr6 = I;
            if (i >= a54VarArr6.length) {
                HashMap hashMap = N;
                a54[] a54VarArr7 = J;
                hashMap.put(Integer.valueOf(a54VarArr7[0].a), 5);
                hashMap.put(Integer.valueOf(a54VarArr7[1].a), 1);
                hashMap.put(Integer.valueOf(a54VarArr7[2].a), 2);
                hashMap.put(Integer.valueOf(a54VarArr7[3].a), 3);
                hashMap.put(Integer.valueOf(a54VarArr7[4].a), 7);
                hashMap.put(Integer.valueOf(a54VarArr7[5].a), 8);
                Pattern.compile(".*[1-9].*");
                Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            K[i] = new HashMap();
            L[i] = new HashMap();
            for (a54 a54Var : a54VarArr6[i]) {
                K[i].put(Integer.valueOf(a54Var.a), a54Var);
                L[i].put(a54Var.b, a54Var);
            }
            i++;
        }
    }

    public d54(InputStream inputStream) {
        a54[][] a54VarArr = I;
        this.e = new HashMap[a54VarArr.length];
        this.f = new HashSet(a54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            fvc.f("inputStream cannot be null");
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
                    e54.c(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
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

    public static ByteOrder t(y44 y44Var) {
        short readShort = y44Var.readShort();
        boolean z2 = m;
        if (readShort == 18761) {
            if (z2) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort != 19789) {
            w44.e(Integer.toHexString(readShort), "Invalid byte order: ");
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
        z44 z44Var = (z44) hashMapArr[1].get("PixelXDimension");
        z44 z44Var2 = (z44) hashMapArr[1].get("PixelYDimension");
        if (z44Var != null && z44Var2 != null) {
            hashMapArr[0].put("ImageWidth", z44Var);
            hashMapArr[0].put("ImageLength", z44Var2);
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
            hashMap.put("DateTime", new z44(2, bytes.length, bytes));
        }
        if (b("ImageWidth") == null) {
            hashMapArr[0].put("ImageWidth", z44.a(0L, this.g));
        }
        if (b("ImageLength") == null) {
            hashMapArr[0].put("ImageLength", z44.a(0L, this.g));
        }
        if (b("Orientation") == null) {
            hashMapArr[0].put("Orientation", z44.a(0L, this.g));
        }
        if (b("LightSource") == null) {
            hashMapArr[1].put("LightSource", z44.a(0L, this.g));
        }
    }

    public final String b(String str) {
        z44 d = d(str);
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
                b54[] b54VarArr = (b54[]) d.g(this.g);
                if (b54VarArr == null || b54VarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(b54VarArr));
                    return null;
                }
                b54 b54Var = b54VarArr[0];
                Integer valueOf = Integer.valueOf((int) (b54Var.a / b54Var.b));
                b54 b54Var2 = b54VarArr[1];
                Integer valueOf2 = Integer.valueOf((int) (b54Var2.a / b54Var2.b));
                b54 b54Var3 = b54VarArr[2];
                return String.format("%02d:%02d:%02d", valueOf, valueOf2, Integer.valueOf((int) (b54Var3.a / b54Var3.b)));
            }
            try {
                return Double.toString(d.d(this.g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int c() {
        z44 d = d("Orientation");
        if (d == null) {
            return 1;
        }
        try {
            return d.e(this.g);
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    public final z44 d(String str) {
        if ("ISOSpeedRatings".equals(str)) {
            if (m) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i = 0; i < I.length; i++) {
            z44 z44Var = (z44) this.e[i].get(str);
            if (z44Var != null) {
                return z44Var;
            }
        }
        return null;
    }

    public final void e(c54 c54Var) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            fyb.i("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                f54.a(mediaMetadataRetriever, new x44(c54Var));
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
                    hashMapArr[0].put("ImageWidth", z44.c(Integer.parseInt(str), this.g));
                }
                if (str2 != null) {
                    hashMapArr[0].put("ImageLength", z44.c(Integer.parseInt(str2), this.g));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    hashMapArr[0].put("Orientation", z44.c(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.g));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c54Var.b(parseInt2);
                    byte[] bArr = new byte[6];
                    if (c54Var.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i = parseInt2 + 6;
                    int i2 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, P)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i2];
                    if (c54Var.read(bArr2) != i2) {
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
    public final void f(y44 y44Var, int i, int i2) {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + y44Var);
        }
        y44Var.b = ByteOrder.BIG_ENDIAN;
        byte readByte = y44Var.readByte();
        byte b = -1;
        if (readByte != -1) {
            w44.e(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        if (y44Var.readByte() != -40) {
            w44.e(Integer.toHexString(readByte & 255), "Invalid marker: ");
            return;
        }
        int i3 = 2;
        int i4 = 2;
        while (true) {
            byte readByte2 = y44Var.readByte();
            if (readByte2 != b) {
                w44.e(Integer.toHexString(readByte2 & 255), "Invalid marker:");
                return;
            }
            byte readByte3 = y44Var.readByte();
            if (z2) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(readByte3 & 255));
            }
            if (readByte3 != -39 && readByte3 != -38) {
                int readUnsignedShort = y44Var.readUnsignedShort();
                int i5 = readUnsignedShort - 2;
                int i6 = i4 + 4;
                if (z2) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(readByte3 & 255) + " (length: " + readUnsignedShort + ")");
                }
                if (i5 < 0) {
                    k93.f("Invalid length");
                    return;
                }
                int i7 = 0;
                HashMap[] hashMapArr = this.e;
                if (readByte3 == -31) {
                    byte[] bArr = new byte[i5];
                    y44Var.readFully(bArr);
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
                        x(new y44(copyOfRange));
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
                                    hashMapArr[i7].put("Xmp", new z44(length, copyOfRange2, 1, copyOfRange2.length));
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
                                            y44Var.a(1);
                                            hashMapArr[i2].put(i2 != 4 ? "ImageLength" : "ThumbnailImageLength", z44.a(y44Var.readUnsignedShort(), this.g));
                                            hashMapArr[i2].put(i2 != 4 ? "ImageWidth" : "ThumbnailImageWidth", z44.a(y44Var.readUnsignedShort(), this.g));
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
                    if (y44Var.read(bArr4) != i5) {
                        k93.f("Invalid exif");
                        return;
                    }
                    if (b("UserComment") == null) {
                        HashMap hashMap = hashMapArr[1];
                        Charset charset = O;
                        byte[] bytes = new String(bArr4, charset).concat(WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(charset);
                        hashMap.put("UserComment", new z44(i3, bytes.length, bytes));
                    }
                    i5 = 0;
                }
                if (i5 < 0) {
                    k93.f("Invalid length");
                    return;
                }
                y44Var.a(i5);
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
        y44 y44Var;
        int i2;
        int i3;
        y44 y44Var2;
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
                        y44 y44Var3 = null;
                        try {
                            y44Var = new y44(bArr2);
                            try {
                                try {
                                    readInt = y44Var.readInt();
                                    bArr = new byte[4];
                                    y44Var.read(bArr);
                                } catch (Exception e) {
                                    e = e;
                                    i = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                y44Var3 = y44Var;
                                if (y44Var3 != null) {
                                    y44Var3.close();
                                }
                                throw th;
                            }
                        } catch (Exception e2) {
                            e = e2;
                            i = 0;
                            y44Var = null;
                        } catch (Throwable th2) {
                            th = th2;
                            if (y44Var3 != null) {
                            }
                            throw th;
                        }
                        if (Arrays.equals(bArr, s)) {
                            if (readInt == 1) {
                                readInt = y44Var.readLong();
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
                                        if (y44Var.read(bArr4) != 4) {
                                            break;
                                        }
                                        if (j3 != 1) {
                                            if (Arrays.equals(bArr4, t)) {
                                                z2 = true;
                                            } else if (Arrays.equals(bArr4, u)) {
                                                z3 = true;
                                            }
                                            if (z2 && z3) {
                                                y44Var.close();
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
                                y44Var.close();
                                y44 y44Var4 = new y44(bArr2);
                                ByteOrder t2 = t(y44Var4);
                                this.g = t2;
                                y44Var4.b = t2;
                                short readShort = y44Var4.readShort();
                                i2 = (readShort != 20306 || readShort == 21330) ? 1 : i;
                                y44Var4.close();
                                if (i2 != 0) {
                                    return 7;
                                }
                                try {
                                    y44Var2 = new y44(bArr2);
                                } catch (Exception unused) {
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                try {
                                    ByteOrder t3 = t(y44Var2);
                                    this.g = t3;
                                    y44Var2.b = t3;
                                    i3 = y44Var2.readShort() != 85 ? i : 1;
                                    y44Var2.close();
                                } catch (Exception unused2) {
                                    y44Var3 = y44Var2;
                                    if (y44Var3 != null) {
                                        y44Var3.close();
                                    }
                                    i3 = i;
                                    if (i3 == 0) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    y44Var3 = y44Var2;
                                    if (y44Var3 != null) {
                                        y44Var3.close();
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
                        y44Var.close();
                        i = 0;
                        y44 y44Var42 = new y44(bArr2);
                        ByteOrder t22 = t(y44Var42);
                        this.g = t22;
                        y44Var42.b = t22;
                        short readShort2 = y44Var42.readShort();
                        if (readShort2 != 20306) {
                        }
                        y44Var42.close();
                        if (i2 != 0) {
                        }
                    }
                }
                return 9;
            }
            i4++;
        }
    }

    public final void h(c54 c54Var) {
        int i;
        int i2;
        k(c54Var);
        HashMap[] hashMapArr = this.e;
        z44 z44Var = (z44) hashMapArr[1].get("MakerNote");
        if (z44Var != null) {
            c54 c54Var2 = new c54(z44Var.d);
            c54Var2.b = this.g;
            byte[] bArr = v;
            byte[] bArr2 = new byte[bArr.length];
            c54Var2.readFully(bArr2);
            c54Var2.b(0L);
            byte[] bArr3 = w;
            byte[] bArr4 = new byte[bArr3.length];
            c54Var2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c54Var2.b(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c54Var2.b(12L);
            }
            v(c54Var2, 6);
            z44 z44Var2 = (z44) hashMapArr[7].get("PreviewImageStart");
            z44 z44Var3 = (z44) hashMapArr[7].get("PreviewImageLength");
            if (z44Var2 != null && z44Var3 != null) {
                hashMapArr[5].put("JPEGInterchangeFormat", z44Var2);
                hashMapArr[5].put("JPEGInterchangeFormatLength", z44Var3);
            }
            z44 z44Var4 = (z44) hashMapArr[8].get("AspectFrame");
            if (z44Var4 != null) {
                int[] iArr = (int[]) z44Var4.g(this.g);
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
                z44 c = z44.c(i5, this.g);
                z44 c2 = z44.c(i6, this.g);
                hashMapArr[0].put("ImageWidth", c);
                hashMapArr[0].put("ImageLength", c2);
            }
        }
    }

    public final void i(y44 y44Var) {
        if (m) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + y44Var);
        }
        y44Var.b = ByteOrder.BIG_ENDIAN;
        byte[] bArr = x;
        y44Var.a(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int readInt = y44Var.readInt();
                byte[] bArr2 = new byte[4];
                if (y44Var.read(bArr2) != 4) {
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
                    if (y44Var.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ufe.a(bArr2));
                    }
                    int readInt2 = y44Var.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.i = i;
                        u(0, bArr3);
                        A();
                        x(new y44(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i2 = readInt + 4;
                y44Var.a(i2);
                length = i + i2;
            } catch (EOFException unused) {
                k93.f("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    public final void j(y44 y44Var) {
        boolean z2 = m;
        if (z2) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + y44Var);
        }
        y44Var.a(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        y44Var.read(bArr);
        y44Var.read(bArr2);
        y44Var.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        y44Var.a(i - y44Var.c);
        y44Var.read(bArr4);
        f(new y44(bArr4), i, 5);
        y44Var.a(i3 - y44Var.c);
        y44Var.b = ByteOrder.BIG_ENDIAN;
        int readInt = y44Var.readInt();
        if (z2) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i4 = 0; i4 < readInt; i4++) {
            int readUnsignedShort = y44Var.readUnsignedShort();
            int readUnsignedShort2 = y44Var.readUnsignedShort();
            if (readUnsignedShort == H.a) {
                short readShort = y44Var.readShort();
                short readShort2 = y44Var.readShort();
                z44 c = z44.c(readShort, this.g);
                z44 c2 = z44.c(readShort2, this.g);
                HashMap[] hashMapArr = this.e;
                hashMapArr[0].put("ImageLength", c);
                hashMapArr[0].put("ImageWidth", c2);
                if (z2) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            y44Var.a(readUnsignedShort2);
        }
    }

    public final void k(c54 c54Var) {
        r(c54Var);
        v(c54Var, 0);
        z(c54Var, 0);
        z(c54Var, 5);
        z(c54Var, 4);
        A();
        if (this.d == 8) {
            HashMap[] hashMapArr = this.e;
            z44 z44Var = (z44) hashMapArr[1].get("MakerNote");
            if (z44Var != null) {
                c54 c54Var2 = new c54(z44Var.d);
                c54Var2.b = this.g;
                c54Var2.a(6);
                v(c54Var2, 9);
                z44 z44Var2 = (z44) hashMapArr[9].get("ColorSpace");
                if (z44Var2 != null) {
                    hashMapArr[1].put("ColorSpace", z44Var2);
                }
            }
        }
    }

    public final void l(c54 c54Var) {
        if (m) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + c54Var);
        }
        k(c54Var);
        HashMap[] hashMapArr = this.e;
        z44 z44Var = (z44) hashMapArr[0].get("JpgFromRaw");
        if (z44Var != null) {
            f(new y44(z44Var.d), (int) z44Var.c, 5);
        }
        z44 z44Var2 = (z44) hashMapArr[0].get("ISO");
        z44 z44Var3 = (z44) hashMapArr[1].get("PhotographicSensitivity");
        if (z44Var2 == null || z44Var3 != null) {
            return;
        }
        hashMapArr[1].put("PhotographicSensitivity", z44Var2);
    }

    public final void m(y44 y44Var) {
        if (m) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + y44Var);
        }
        y44Var.b = ByteOrder.LITTLE_ENDIAN;
        y44Var.a(B.length);
        int readInt = y44Var.readInt() + 8;
        byte[] bArr = C;
        y44Var.a(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (y44Var.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = y44Var.readInt();
                int i = length + 8;
                if (Arrays.equals(D, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (y44Var.read(bArr3) == readInt2) {
                        this.i = i;
                        u(0, bArr3);
                        x(new y44(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + ufe.a(bArr2));
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
                y44Var.a(readInt2);
            } catch (EOFException unused) {
                k93.f("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    public final void n(y44 y44Var, HashMap hashMap) {
        z44 z44Var = (z44) hashMap.get("JPEGInterchangeFormat");
        z44 z44Var2 = (z44) hashMap.get("JPEGInterchangeFormatLength");
        if (z44Var == null || z44Var2 == null) {
            return;
        }
        int e = z44Var.e(this.g);
        int e2 = z44Var2.e(this.g);
        if (this.d == 7) {
            e += this.j;
        }
        if (e > 0 && e2 > 0 && this.a == null && this.c == null && this.b == null) {
            y44Var.skip(e);
            y44Var.read(new byte[e2]);
        }
        if (m) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + e + ", length: " + e2);
        }
    }

    public final void o(String str) {
        boolean z2;
        if (str == null) {
            fvc.f("filename cannot be null");
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
                        e54.c(fileInputStream2.getFD(), 0L, OsConstants.SEEK_CUR);
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
        z44 z44Var = (z44) hashMap.get("ImageLength");
        z44 z44Var2 = (z44) hashMap.get("ImageWidth");
        if (z44Var == null || z44Var2 == null) {
            return false;
        }
        return z44Var.e(this.g) <= 512 && z44Var2.e(this.g) <= 512;
    }

    public final void q(InputStream inputStream) {
        boolean z2 = m;
        if (inputStream == null) {
            fvc.f("inputstream shouldn't be null");
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
            y44 y44Var = new y44(bufferedInputStream);
            int i2 = this.d;
            if (i2 == 4) {
                f(y44Var, 0, 0);
            } else if (i2 == 13) {
                i(y44Var);
            } else if (i2 == 9) {
                j(y44Var);
            } else if (i2 == 14) {
                m(y44Var);
            }
        } else {
            c54 c54Var = new c54(bufferedInputStream);
            int i3 = this.d;
            if (i3 == 12) {
                e(c54Var);
            } else if (i3 == 7) {
                h(c54Var);
            } else if (i3 == 10) {
                l(c54Var);
            } else {
                k(c54Var);
            }
            c54Var.b(this.i);
            x(c54Var);
        }
    }

    public final void r(c54 c54Var) {
        ByteOrder t2 = t(c54Var);
        this.g = t2;
        c54Var.b = t2;
        int readUnsignedShort = c54Var.readUnsignedShort();
        int i = this.d;
        if (i != 7 && i != 10 && readUnsignedShort != 42) {
            w44.e(Integer.toHexString(readUnsignedShort), "Invalid start code: ");
            return;
        }
        int readInt = c54Var.readInt();
        if (readInt < 8) {
            k93.f(de9.k(readInt, "Invalid first Ifd offset: "));
            return;
        }
        int i2 = readInt - 8;
        if (i2 > 0) {
            c54Var.a(i2);
        }
    }

    public final void s() {
        int i = 0;
        while (true) {
            HashMap[] hashMapArr = this.e;
            if (i >= hashMapArr.length) {
                return;
            }
            StringBuilder m2 = de9.m(i, "The size of tag group[", "]: ");
            m2.append(hashMapArr[i].size());
            Log.d("ExifInterface", m2.toString());
            for (Map.Entry entry : hashMapArr[i].entrySet()) {
                z44 z44Var = (z44) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + z44Var.toString() + ", tagValue: '" + z44Var.f(this.g) + "'");
            }
            i++;
        }
    }

    public final void u(int i, byte[] bArr) {
        c54 c54Var = new c54(bArr);
        r(c54Var);
        v(c54Var, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x029a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(c54 c54Var, int i) {
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
        Integer valueOf = Integer.valueOf(c54Var.c);
        HashSet hashSet = this.f;
        hashSet.add(valueOf);
        short readShort = c54Var.readShort();
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
                int readUnsignedShort2 = c54Var.readUnsignedShort();
                int readUnsignedShort3 = c54Var.readUnsignedShort();
                int readInt = c54Var.readInt();
                long j5 = c54Var.c + 4;
                a54 a54Var = (a54) K[i8].get(Integer.valueOf(readUnsignedShort2));
                if (z4) {
                    i2 = 3;
                    Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i8), Integer.valueOf(readUnsignedShort2), a54Var != null ? a54Var.b : null, Integer.valueOf(readUnsignedShort3), Integer.valueOf(readInt)));
                } else {
                    i2 = 3;
                }
                if (a54Var == null) {
                    if (z4) {
                        Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + readUnsignedShort2);
                    }
                    s2 = readShort;
                    z2 = z4;
                } else {
                    if (readUnsignedShort3 > 0) {
                        if (readUnsignedShort3 < F.length) {
                            i4 = a54Var.c;
                            s2 = readShort;
                            if (i4 == 7 || readUnsignedShort3 == 7 || i4 == readUnsignedShort3 || (i5 = a54Var.d) == readUnsignedShort3) {
                                z2 = z4;
                            } else {
                                z2 = z4;
                                if (((i4 != 4 && i5 != 4) || readUnsignedShort3 != i2) && (((i4 != 9 && i5 != 9) || readUnsignedShort3 != 8) && ((i4 != 12 && i5 != 12) || readUnsignedShort3 != 11))) {
                                    if (z2) {
                                        StringBuilder sb = new StringBuilder("Skip the tag entry since data format (");
                                        sb.append(E[readUnsignedShort3]);
                                        sb.append(") is unexpected for tag: ");
                                        ir2.x(sb, a54Var.b, "ExifInterface");
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
                                    int readInt2 = c54Var.readInt();
                                    hashMapArr2 = hashMapArr;
                                    if (z2) {
                                        i7 = readUnsignedShort2;
                                        Log.d("ExifInterface", "seek to data offset: " + readInt2);
                                    } else {
                                        i7 = readUnsignedShort2;
                                    }
                                    if (this.d == 7) {
                                        if ("MakerNote".equals(a54Var.b)) {
                                            this.j = readInt2;
                                        } else if (i8 == 6 && "ThumbnailImage".equals(a54Var.b)) {
                                            this.k = readInt2;
                                            this.l = i3;
                                            z44 c = z44.c(6, this.g);
                                            i6 = i3;
                                            z44 a = z44.a(this.k, this.g);
                                            j3 = j5;
                                            z44 a2 = z44.a(this.l, this.g);
                                            hashMapArr2[4].put("Compression", c);
                                            hashMapArr2[4].put("JPEGInterchangeFormat", a);
                                            hashMapArr2[4].put("JPEGInterchangeFormatLength", a2);
                                            c54Var.b(readInt2);
                                        }
                                    }
                                    i6 = i3;
                                    j3 = j5;
                                    c54Var.b(readInt2);
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
                                            j4 = c54Var.readInt() & 4294967295L;
                                        } else if (i4 == 8) {
                                            readUnsignedShort = c54Var.readShort();
                                        } else if (i4 == 9 || i4 == 13) {
                                            readUnsignedShort = c54Var.readInt();
                                        } else {
                                            j4 = -1;
                                        }
                                        if (z2) {
                                            Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j4), a54Var.b));
                                        }
                                        if (j4 <= 0) {
                                            if (!hashSet.contains(Integer.valueOf((int) j4))) {
                                                c54Var.b(j4);
                                                v(c54Var, num.intValue());
                                            } else if (z2) {
                                                StringBuilder sb2 = new StringBuilder("Skip jump into the IFD since it has already been read: IfdType ");
                                                sb2.append(num);
                                                sb2.append(" (at ");
                                                sb2.append(j4);
                                                ir2.x(sb2, ")", "ExifInterface");
                                            }
                                        } else if (z2) {
                                            Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j4);
                                        }
                                        c54Var.b(j3);
                                    } else {
                                        readUnsignedShort = c54Var.readUnsignedShort();
                                    }
                                    j4 = readUnsignedShort;
                                    if (z2) {
                                    }
                                    if (j4 <= 0) {
                                    }
                                    c54Var.b(j3);
                                } else {
                                    long j6 = j3;
                                    int i9 = c54Var.c + this.i;
                                    byte[] bArr = new byte[(int) j];
                                    c54Var.readFully(bArr);
                                    z44 z44Var = new z44(i9, bArr, i4, i6);
                                    HashMap hashMap = hashMapArr2[i];
                                    String str = a54Var.b;
                                    hashMap.put(str, z44Var);
                                    if ("DNGVersion".equals(str)) {
                                        this.d = 3;
                                    }
                                    if ((("Make".equals(str) || "Model".equals(str)) && z44Var.f(this.g).contains("PENTAX")) || ("Compression".equals(str) && z44Var.e(this.g) == 65535)) {
                                        this.d = 8;
                                    }
                                    if (c54Var.c != j6) {
                                        c54Var.b(j6);
                                    }
                                }
                            } else {
                                c54Var.b(j5);
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
            int readInt3 = c54Var.readInt();
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
            c54Var.b(j7);
            if (hashMapArr[4].isEmpty()) {
                v(c54Var, 4);
            } else if (hashMapArr[5].isEmpty()) {
                v(c54Var, 5);
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

    public final void x(y44 y44Var) {
        z44 z44Var;
        int e;
        HashMap hashMap = this.e[4];
        z44 z44Var2 = (z44) hashMap.get("Compression");
        if (z44Var2 == null) {
            n(y44Var, hashMap);
            return;
        }
        int e2 = z44Var2.e(this.g);
        if (e2 != 1) {
            if (e2 == 6) {
                n(y44Var, hashMap);
                return;
            } else if (e2 != 7) {
                return;
            }
        }
        z44 z44Var3 = (z44) hashMap.get("BitsPerSample");
        if (z44Var3 != null) {
            int[] iArr = (int[]) z44Var3.g(this.g);
            int[] iArr2 = p;
            if (Arrays.equals(iArr2, iArr) || (this.d == 3 && (z44Var = (z44) hashMap.get("PhotometricInterpretation")) != null && (((e = z44Var.e(this.g)) == 1 && Arrays.equals(iArr, q)) || (e == 6 && Arrays.equals(iArr, iArr2))))) {
                z44 z44Var4 = (z44) hashMap.get("StripOffsets");
                z44 z44Var5 = (z44) hashMap.get("StripByteCounts");
                if (z44Var4 == null || z44Var5 == null) {
                    return;
                }
                long[] b = ufe.b(z44Var4.g(this.g));
                long[] b2 = ufe.b(z44Var5.g(this.g));
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
                    if (y44Var.skip(j3) != j3) {
                        Log.d("ExifInterface", "Failed to skip " + i6 + " bytes.");
                        return;
                    }
                    int i7 = i + i6;
                    byte[] bArr2 = new byte[i5];
                    if (y44Var.read(bArr2) != i5) {
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
        z44 z44Var = (z44) hashMapArr[i].get("ImageLength");
        z44 z44Var2 = (z44) hashMapArr[i].get("ImageWidth");
        z44 z44Var3 = (z44) hashMapArr[i2].get("ImageLength");
        z44 z44Var4 = (z44) hashMapArr[i2].get("ImageWidth");
        if (z44Var == null || z44Var2 == null) {
            if (z2) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (z44Var3 == null || z44Var4 == null) {
            if (z2) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int e = z44Var.e(this.g);
        int e2 = z44Var2.e(this.g);
        int e3 = z44Var3.e(this.g);
        int e4 = z44Var4.e(this.g);
        if (e >= e3 || e2 >= e4) {
            return;
        }
        HashMap hashMap = hashMapArr[i];
        hashMapArr[i] = hashMapArr[i2];
        hashMapArr[i2] = hashMap;
    }

    public final void z(c54 c54Var, int i) {
        z44 c;
        z44 c2;
        HashMap[] hashMapArr = this.e;
        z44 z44Var = (z44) hashMapArr[i].get("DefaultCropSize");
        z44 z44Var2 = (z44) hashMapArr[i].get("SensorTopBorder");
        z44 z44Var3 = (z44) hashMapArr[i].get("SensorLeftBorder");
        z44 z44Var4 = (z44) hashMapArr[i].get("SensorBottomBorder");
        z44 z44Var5 = (z44) hashMapArr[i].get("SensorRightBorder");
        if (z44Var != null) {
            int i2 = z44Var.a;
            ByteOrder byteOrder = this.g;
            if (i2 == 5) {
                b54[] b54VarArr = (b54[]) z44Var.g(byteOrder);
                if (b54VarArr == null || b54VarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(b54VarArr));
                    return;
                }
                c = z44.b(b54VarArr[0], this.g);
                c2 = z44.b(b54VarArr[1], this.g);
            } else {
                int[] iArr = (int[]) z44Var.g(byteOrder);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                c = z44.c(iArr[0], this.g);
                c2 = z44.c(iArr[1], this.g);
            }
            hashMapArr[i].put("ImageWidth", c);
            hashMapArr[i].put("ImageLength", c2);
            return;
        }
        if (z44Var2 != null && z44Var3 != null && z44Var4 != null && z44Var5 != null) {
            int e = z44Var2.e(this.g);
            int e2 = z44Var4.e(this.g);
            int e3 = z44Var5.e(this.g);
            int e4 = z44Var3.e(this.g);
            if (e2 <= e || e3 <= e4) {
                return;
            }
            z44 c3 = z44.c(e2 - e, this.g);
            z44 c4 = z44.c(e3 - e4, this.g);
            hashMapArr[i].put("ImageLength", c3);
            hashMapArr[i].put("ImageWidth", c4);
            return;
        }
        z44 z44Var6 = (z44) hashMapArr[i].get("ImageLength");
        z44 z44Var7 = (z44) hashMapArr[i].get("ImageWidth");
        if (z44Var6 == null || z44Var7 == null) {
            z44 z44Var8 = (z44) hashMapArr[i].get("JPEGInterchangeFormat");
            z44 z44Var9 = (z44) hashMapArr[i].get("JPEGInterchangeFormatLength");
            if (z44Var8 == null || z44Var9 == null) {
                return;
            }
            int e5 = z44Var8.e(this.g);
            int e6 = z44Var8.e(this.g);
            c54Var.b(e5);
            byte[] bArr = new byte[e6];
            c54Var.read(bArr);
            f(new y44(bArr), e5, i);
        }
    }

    public d54(String str) {
        a54[][] a54VarArr = I;
        this.e = new HashMap[a54VarArr.length];
        this.f = new HashSet(a54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            o(str);
        } else {
            fvc.f("filename cannot be null");
            throw null;
        }
    }

    public d54(File file) {
        a54[][] a54VarArr = I;
        this.e = new HashMap[a54VarArr.length];
        this.f = new HashSet(a54VarArr.length);
        this.g = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            o(file.getAbsolutePath());
        } else {
            fvc.f("file cannot be null");
            throw null;
        }
    }
}
