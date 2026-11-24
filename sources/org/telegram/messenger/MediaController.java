package org.telegram.messenger;

import android.animation.ValueAnimator;
import android.bluetooth.BluetoothAdapter;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.PowerManager;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class MediaController implements AudioManager.OnAudioFocusChangeListener, gk7, SensorEventListener {
    public static final String[] W1;
    public static final String[] X1;
    public static final ConcurrentHashMap Y1;
    public static Runnable Z1;
    public static xl6 a2;
    public static xl6 b2;
    public static ArrayList c2;
    public static ArrayList d2;
    public static qt e2;
    public static volatile MediaController f2;
    public static long g2;
    public static boolean h2;
    public boolean B0;
    public boolean C0;
    public byte C1;
    public km6 D0;
    public boolean D1;
    public byte E;
    public g00 E0;
    public int E1;
    public int F;
    public lbc F0;
    public boolean F1;
    public int G;
    public boolean G0;
    public u20 G1;
    public long H;
    public TextureView H0;
    public al6 H1;
    public PipRoundVideoView I0;
    public boolean I1;
    public boolean J;
    public byte J0;
    public boolean J1;
    public boolean K;
    public LaunchActivity K0;
    public boolean K1;
    public ViewGroup L0;
    public m20 L1;
    public boolean M;
    public ix M0;
    public xk6 M1;
    public boolean N;
    public boolean N0;
    public final co3 N1;
    public boolean O;
    public FrameLayout O0;
    public final co3 O1;
    public boolean P;
    public float P0;
    public boolean Q;
    public boolean Q0;
    public float Q1;
    public float R;
    public ia7 R0;
    public ValueAnimator R1;
    public sv T1;
    public boolean U1;
    public byte V;
    public int V0;
    public mm6 V1;
    public boolean W;
    public boolean W0;
    public boolean X;
    public boolean Y0;
    public boolean Z;
    public long Z0;
    public final zz a;
    public int a1;
    public om6 b0;
    public long b1;
    public SensorManager c;
    public PowerManager.WakeLock d;
    public Sensor e;
    public boolean e0;
    public boolean e1;
    public Sensor f;
    public ArrayList f0;
    public AudioRecord f1;
    public SparseArray g0;
    public TLRPC.TL_document g1;
    public Sensor h;
    public int i1;
    public File j1;
    public File k1;
    public long l1;
    public boolean m0;
    public int m1;
    public Sensor n;
    public int n0;
    public long n1;
    public String o0;
    public long o1;
    public long p0;
    public long p1;
    public u47 q1;
    public boolean r;
    public k27 r1;
    public mu1 s;
    public k27 s1;
    public TL_stories.StoryItem t1;
    public float u0;
    public j1a u1;
    public k27 v0;
    public boolean w;
    public k27 w0;
    public long w1;
    public long x;
    public gm6 x0;
    public int y;
    public boolean y0;
    public final ByteBuffer z1;
    public final Object b = new Object();
    public long I = 0;
    public float L = -100.0f;
    public final float[] S = new float[3];
    public final float[] T = new float[3];
    public final float[] U = new float[3];
    public byte Y = 0;
    public final ArrayList a0 = new ArrayList();
    public final ArrayList c0 = new ArrayList();
    public final HashMap d0 = new HashMap();
    public boolean h0 = false;
    public boolean i0 = false;
    public lbc j0 = null;
    public lbc k0 = null;
    public int l0 = 0;
    public float q0 = 1.0f;
    public float r0 = 1.0f;
    public float s0 = 1.0f;
    public float t0 = 1.0f;
    public Timer z0 = null;
    public final Object A0 = new Object();
    public final ArrayList S0 = new ArrayList();
    public final HashMap T0 = new HashMap();
    public final ArrayList U0 = new ArrayList();
    public final boolean[] X0 = {false, false};
    public final int[] c1 = {ConnectionsManager.DEFAULT_DATACENTER_ID, ConnectionsManager.DEFAULT_DATACENTER_ID};
    public final rl6 d1 = new rl6(this);
    public int h1 = -1;
    public short[] v1 = new short[1024];
    public final Object x1 = new Object();
    public final ArrayList y1 = new ArrayList();
    public int A1 = 1280;
    public char B1 = 48000;
    public final ez3 P1 = new ez3(this, 24);
    public final ae0 S1 = new ae0(this, 8);

    static {
        int i = Build.VERSION.SDK_INT;
        W1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i > 28 ? "date_modified" : "datetaken", "orientation", "width", "height", "_size"};
        X1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i > 28 ? "date_modified" : "datetaken", "duration", "width", "height", "_size"};
        Y1 = new ConcurrentHashMap();
        c2 = new ArrayList();
        d2 = new ArrayList();
    }

    public MediaController() {
        byte b = 1;
        this.a = new zz(this, b);
        Handler handler = null;
        byte b3 = 2;
        co3 co3Var = new co3("recordQueue");
        this.N1 = co3Var;
        co3Var.setPriority(10);
        co3 co3Var2 = new co3("fileEncodingQueue");
        this.O1 = co3Var2;
        co3Var2.setPriority(10);
        co3Var.c(new wk6(this, (byte) 0));
        Utilities.e.c(new wk6(this, b));
        this.z1 = ByteBuffer.allocateDirect(1920);
        gl.c3(new wk6(this, b3));
        ContentResolver contentResolver = a.b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new hd1(handler, b));
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new hd1(handler, b3));
        } catch (Exception e3) {
            fa4.g(e3, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new hd1(handler, b));
        } catch (Exception e4) {
            fa4.g(e4, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new hd1(handler, b3));
        } catch (Exception e5) {
            fa4.g(e5, true);
        }
    }

    public static boolean B(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = a.b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[3];
                    if (inputStream.read(bArr, 0, 3) == 3) {
                        if (new String(bArr).equalsIgnoreCase("gif")) {
                            try {
                                inputStream.close();
                                return true;
                            } catch (Exception e) {
                                fa4.g(e, true);
                                return true;
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                fa4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    fa4.g(e5, true);
                }
            }
            throw th;
        }
    }

    public static boolean H(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = a.b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[12];
                    if (inputStream.read(bArr, 0, 12) == 12) {
                        String lowerCase = new String(bArr).toLowerCase();
                        if (lowerCase.startsWith("riff")) {
                            if (lowerCase.endsWith("webp")) {
                                try {
                                    inputStream.close();
                                    return true;
                                } catch (Exception e) {
                                    fa4.g(e, true);
                                    return true;
                                }
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                fa4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    fa4.g(e5, true);
                }
            }
            throw th;
        }
    }

    public static void H0(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String n = ug8.n(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = n.getBytes("UTF-8");
        int length = bytes.length + bytes2.length + 2;
        if (length > 65535) {
            k93.f(de9.k(length, "XMP segment too large: "));
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read();
            int read2 = fileInputStream.read();
            if (read != 255 || read2 != 216) {
                throw new IOException("Not a JPEG: " + file);
            }
            outputStream.write(kk7.d4);
            outputStream.write(kk7.s3);
            outputStream.write(kk7.d4);
            outputStream.write(kk7.B3);
            outputStream.write((length >> 8) & kk7.d4);
            outputStream.write(length & kk7.d4);
            outputStream.write(bytes);
            outputStream.write(bytes2);
            byte[] bArr = new byte[65536];
            while (true) {
                int read3 = fileInputStream.read(bArr);
                if (read3 <= 0) {
                    fileInputStream.close();
                    fileInputStream = new FileInputStream(file2);
                    try {
                        byte[] bArr2 = new byte[65536];
                        while (true) {
                            int read4 = fileInputStream.read(bArr2);
                            if (read4 <= 0 || (zArr != null && zArr[0])) {
                                break;
                            } else {
                                outputStream.write(bArr2, 0, read4);
                            }
                        }
                        fileInputStream.close();
                        return;
                    } finally {
                    }
                }
                if (zArr != null && zArr[0]) {
                    fileInputStream.close();
                    return;
                }
                outputStream.write(bArr, 0, read3);
            }
        } finally {
        }
    }

    public static void N(int i) {
        Thread thread = new Thread(new xv0(i, (byte) 6));
        thread.setPriority(1);
        thread.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int P(int i, int i2, int i3, int i4, int i5) {
        int i6;
        float f;
        float f3 = 1.0f;
        if (Math.min(i4, i5) >= 1080) {
            i6 = 6800000;
        } else {
            if (Math.min(i4, i5) < 720) {
                if (Math.min(i4, i5) >= 480) {
                    i6 = 1000000;
                    f3 = 0.75f;
                    f = 0.9f;
                } else {
                    i6 = 750000;
                    f3 = 0.6f;
                    f = 0.7f;
                }
                int min = (int) (((int) (i3 / Math.min(i / i4, i2 / i5))) * f3);
                int C = (int) (((int) yjb.C(f, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i5 * i4)));
                return i3 >= C ? min : min > i6 ? i6 : Math.max(min, C);
            }
            i6 = 2600000;
        }
        f = 1.0f;
        int min2 = (int) (((int) (i3 / Math.min(i / i4, i2 / i5))) * f3);
        int C2 = (int) (((int) yjb.C(f, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i5 * i4)));
        if (i3 >= C2) {
        }
    }

    public static void c0(String str, String str2, Context context, p8c p8cVar) {
        hd hdVar;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            return;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists() || !file2.exists()) {
            d0(str, context, 0, null, null, p8cVar);
            return;
        }
        if (gl.G1(Uri.fromFile(file), 0) || gl.G1(Uri.fromFile(file2), 0)) {
            return;
        }
        byte b = 1;
        boolean[] zArr = {false};
        boolean[] zArr2 = new boolean[1];
        try {
            hd hdVar2 = new hd(2, null, context);
            hdVar2.m(k96.M0(2131748587, null));
            hdVar2.setCanceledOnTouchOutside(false);
            hdVar2.setCancelable(true);
            hdVar2.setOnCancelListener(new gn1(zArr, (byte) 3));
            gl.d3(new dl6(zArr2, hdVar2, b), 250L);
            hdVar = hdVar2;
        } catch (Exception e) {
            fa4.g(e, true);
            hdVar = null;
        }
        new Thread(new e57(file, file2, zArr, p8cVar, hdVar, zArr2)).start();
    }

    public static native boolean cropOpusFile(String str, String str2, long j, long j2);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d0(String str, Context context, int i, String str2, String str3, p8c p8cVar) {
        File file;
        hd hdVar;
        if (str == null || context == null) {
            return;
        }
        byte b = 0;
        if (!TextUtils.isEmpty(str)) {
            File file2 = new File(str);
            if (file2.exists() && !gl.G1(Uri.fromFile(file2), 0)) {
                file = file2;
                if (file == null) {
                    boolean[] zArr = {false};
                    if (file.exists()) {
                        boolean[] zArr2 = new boolean[1];
                        if (i != 0) {
                            try {
                                hd hdVar2 = new hd(2, null, context);
                                hdVar2.m(k96.M0(2131748587, null));
                                hdVar2.setCanceledOnTouchOutside(false);
                                hdVar2.setCancelable(true);
                                hdVar2.setOnCancelListener(new gn1(zArr, (byte) 2));
                                gl.d3(new dl6(zArr2, hdVar2, b), 250L);
                                hdVar = hdVar2;
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                            new Thread(new ox1(i, file, str2, hdVar, zArr, str3, p8cVar, zArr2)).start();
                            return;
                        }
                        hdVar = null;
                        new Thread(new ox1(i, file, str2, hdVar, zArr, str3, p8cVar, zArr2)).start();
                        return;
                    }
                    return;
                }
                return;
            }
        }
        file = null;
        if (file == null) {
        }
    }

    public static Uri e0(int i, File file, String str) {
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String D = ba4.D(file);
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(D);
            if ((i == 0 || i == 1) && mimeTypeFromExtension != null) {
                if (mimeTypeFromExtension.startsWith("image")) {
                    i = 0;
                }
                if (mimeTypeFromExtension.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    i = 1;
                }
            }
            if (i == 0) {
                if (str == null) {
                    str = gl.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", mimeTypeFromExtension);
            } else if (i == 1) {
                if (str == null) {
                    str = gl.p0(1, D);
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MOVIES, "Telegram") + File.separator);
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else if (i == 2) {
                if (str == null) {
                    str = file.getName();
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_DOWNLOADS, "Telegram") + File.separator);
                contentUri = MediaStore.Downloads.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else {
                if (str == null) {
                    str = file.getName();
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MUSIC, "Telegram") + File.separator);
                contentUri = MediaStore.Audio.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            }
            contentValues.put("mime_type", mimeTypeFromExtension);
            Uri insert = a.b.getContentResolver().insert(contentUri, contentValues);
            if (insert != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                gl.D(fileInputStream, a.b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    public static void f0(Context context, j5 j5Var, ArrayList arrayList, uc7 uc7Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        em6 em6Var = new em6();
        em6Var.d = new HashMap();
        em6Var.a = j5Var;
        em6Var.c = arrayList;
        em6Var.s = uc7Var;
        em6Var.w = ((k27) arrayList.get(0)).I3();
        int i = j5Var.a;
        kk7.f(i).a(em6Var, kk7.X1);
        kk7.f(i).a(em6Var, kk7.W1);
        kk7.f(i).a(em6Var, kk7.Y1);
        hd hdVar = new hd(2, PhotoViewer.r0().V0() ? new f53() : null, context);
        em6Var.b = hdVar;
        hdVar.m(k96.M0(2131748587, null));
        hdVar.setCancelable(true);
        hdVar.I = true;
        hdVar.setOnCancelListener(new ur0(em6Var, (byte) 12));
        gl.d3(new dm6(em6Var, (byte) 1), 250L);
        new Thread(new dm6(em6Var, (byte) 2)).start();
    }

    public static native byte[] getWaveform(String str);

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        if (r1.getProfileConnectionState(1) != 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i0(boolean z) {
        AudioManager audioManager = (AudioManager) a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (gba.r0 && !rqe.d("android.permission.BLUETOOTH_CONNECT")) {
            gba.r0 = false;
            gba.x();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && gba.r0) && z) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
            } catch (SecurityException unused) {
                return;
            } catch (Throwable th) {
                fa4.g(th, true);
                return;
            }
        }
        if (z) {
            return;
        }
        if (z) {
            if (audioManager.isBluetoothScoOn()) {
                return;
            }
            audioManager.startBluetoothSco();
        } else if (audioManager.isBluetoothScoOn()) {
            audioManager.stopBluetoothSco();
        }
    }

    public static native int isOpusFile(String str);

    public static native boolean joinOpusFiles(String str, String str2, String str3);

    /* JADX WARN: Code restructure failed: missing block: B:107:0x018f, code lost:
    
        if (r5 > r15) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f5, code lost:
    
        if (0 > r15) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0191, code lost:
    
        r7.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012d, code lost:
    
        if (r11 > r15) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0131, code lost:
    
        r4 = r7.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0135, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0139, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x013a, code lost:
    
        fa4.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String o(long j, Uri uri, String str) {
        InputStream inputStream;
        File file;
        ?? r8;
        Throwable th;
        FileOutputStream fileOutputStream;
        File file2;
        int i;
        String absolutePath;
        int i2 = 0;
        try {
            try {
                String q = ba4.q(v(uri));
                if (q == null) {
                    int p = gba.p();
                    gba.x();
                    Locale locale = Locale.US;
                    q = p + "." + str;
                }
                file = gl.f1();
                try {
                    file.mkdirs();
                    if (!gl.G1(Uri.fromFile(file), 0)) {
                        int i3 = 0;
                        do {
                            File f1 = gl.f1();
                            if (i3 == 0) {
                                file2 = new File(f1, q);
                            } else {
                                int lastIndexOf = q.lastIndexOf(".");
                                if (lastIndexOf > 0) {
                                    file = new File(f1, q.substring(0, lastIndexOf) + " (" + i3 + ")" + q.substring(lastIndexOf));
                                    i3++;
                                } else {
                                    file2 = new File(f1, q + " (" + i3 + ")");
                                }
                            }
                            file = file2;
                            i3++;
                        } while (file.exists());
                        inputStream = a.b.getContentResolver().openInputStream(uri);
                        try {
                            if (inputStream instanceof FileInputStream) {
                                FileInputStream fileInputStream = (FileInputStream) inputStream;
                                try {
                                    r8 = FileDescriptor.class.getDeclaredMethod("getInt$", null);
                                    if (gl.G1(null, ((Integer) r8.invoke(fileInputStream.getFD(), null)).intValue())) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                        if (j > 0) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    fa4.g(th2, true);
                                }
                            }
                            r8 = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[20480];
                                i = 0;
                                while (true) {
                                    try {
                                        int read = inputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        r8.write(bArr, 0, read);
                                        i += read;
                                        if (j > 0) {
                                            long j2 = i;
                                            if (j2 > j) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception e3) {
                                                    fa4.g(e3, true);
                                                }
                                                try {
                                                    r8.close();
                                                } catch (Exception e4) {
                                                    fa4.g(e4, true);
                                                }
                                                if (j > 0) {
                                                }
                                            }
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        i2 = i;
                                        fa4.g(e, true);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception e6) {
                                                fa4.g(e6, true);
                                            }
                                        }
                                        if (r8 != 0) {
                                            try {
                                                r8.close();
                                            } catch (Exception e7) {
                                                fa4.g(e7, true);
                                            }
                                        }
                                        if (j > 0) {
                                        }
                                        return null;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i2 = i;
                                        fileOutputStream = r8;
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception e8) {
                                                fa4.g(e8, true);
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Exception e9) {
                                                fa4.g(e9, true);
                                            }
                                        }
                                        if (j > 0) {
                                            throw th;
                                        }
                                        if (i2 <= j) {
                                            throw th;
                                        }
                                        file.delete();
                                        throw th;
                                    }
                                }
                            } catch (Exception e10) {
                                e = e10;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            r8 = 0;
                        } catch (Throwable th4) {
                            th = th4;
                            r8 = 0;
                            th = th;
                            fileOutputStream = r8;
                            if (inputStream != null) {
                            }
                            if (fileOutputStream != null) {
                            }
                            if (j > 0) {
                            }
                        }
                    } else if (j > 0 && 0 > j) {
                        file.delete();
                        return null;
                    }
                } catch (Exception e12) {
                    e = e12;
                    inputStream = null;
                    r8 = 0;
                } catch (Throwable th5) {
                    th = th5;
                    inputStream = null;
                    r8 = 0;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Exception e13) {
            e = e13;
            inputStream = null;
            file = null;
            r8 = 0;
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
            file = null;
            r8 = 0;
        }
        return null;
        if (j > 0 && i > j) {
            file.delete();
        }
        return absolutePath;
        try {
            r8.close();
        } catch (Exception e14) {
            fa4.g(e14, true);
        }
        if (j > 0) {
            file.delete();
        }
        return absolutePath;
    }

    public static File p(String str) {
        File file;
        try {
            File f1 = gl.f1();
            f1.mkdirs();
            if (gl.G1(Uri.fromFile(f1), 0)) {
                return null;
            }
            int i = 0;
            do {
                File f12 = gl.f1();
                if (i == 0) {
                    file = new File(f12, str);
                } else {
                    int lastIndexOf = str.lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        file = new File(f12, str.substring(0, lastIndexOf) + " (" + i + ")" + str.substring(lastIndexOf));
                    } else {
                        file = new File(f12, str + " (" + i + ")");
                    }
                }
                i++;
            } while (file.exists());
            return file;
        } catch (Exception e) {
            fa4.g(e, true);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int q(int i, int i2, int i3, boolean z) {
        MediaCodec createEncoderByType;
        String str = i + "" + i2 + "" + i3;
        ConcurrentHashMap concurrentHashMap = Y1;
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        if (z) {
            try {
                createEncoderByType = MediaCodec.createEncoderByType("video/hevc");
            } catch (Exception unused) {
            }
            if (createEncoderByType == null) {
                try {
                    createEncoderByType = MediaCodec.createEncoderByType("video/avc");
                } catch (Exception unused2) {
                    return i3;
                }
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i, i2);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("max-bitrate", i3);
            createVideoFormat.setInteger("bitrate", i3);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            createEncoderByType.configure(createVideoFormat, (Surface) null, (MediaCrypto) null, 1);
            int integer = createEncoderByType.getOutputFormat().getInteger("bitrate");
            concurrentHashMap.put(str, Integer.valueOf(integer));
            createEncoderByType.release();
            return integer;
        }
        createEncoderByType = null;
        if (createEncoderByType == null) {
        }
        MediaFormat createVideoFormat2 = MediaFormat.createVideoFormat("video/avc", i, i2);
        createVideoFormat2.setInteger("color-format", 2130708361);
        createVideoFormat2.setInteger("max-bitrate", i3);
        createVideoFormat2.setInteger("bitrate", i3);
        createVideoFormat2.setInteger("frame-rate", 30);
        createVideoFormat2.setInteger("i-frame-interval", 1);
        createEncoderByType.configure(createVideoFormat2, (Surface) null, (MediaCrypto) null, 1);
        int integer2 = createEncoderByType.getOutputFormat().getInteger("bitrate");
        concurrentHashMap.put(str, Integer.valueOf(integer2));
        createEncoderByType.release();
        return integer2;
    }

    public static int r(MediaExtractor mediaExtractor, boolean z) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            String string = mediaExtractor.getTrackFormat(i).getString("mime");
            if (z) {
                if (string.startsWith("audio/")) {
                    return i;
                }
            } else {
                if (string.startsWith("video/")) {
                    return i;
                }
            }
        }
        return -5;
    }

    public static boolean r0(int i) {
        im0 im0Var = wcd.b;
        im0Var.a();
        if (!im0Var.c) {
            return !na7.q1(i).k4.k0.f;
        }
        im0Var.a();
        return im0Var.d;
    }

    private native int startRecord(String str, int i);

    private native void stopRecord();

    public static boolean t() {
        try {
            for (AudioDeviceInfo audioDeviceInfo : im7.p0.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            fa4.g(e, true);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[Catch: Exception -> 0x0067, TryCatch #4 {Exception -> 0x0067, blocks: (B:7:0x0008, B:12:0x0054, B:14:0x0061, B:44:0x004d), top: B:6:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String v(Uri uri) {
        Uri uri2;
        if (uri == null) {
            return "";
        }
        try {
            String str = null;
            if (uri.getScheme().equals("content")) {
                try {
                    uri2 = uri;
                } catch (Exception e) {
                    e = e;
                    uri2 = uri;
                }
                try {
                    Cursor query = a.b.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                    try {
                        if (query.moveToFirst()) {
                            str = query.getString(query.getColumnIndex("_display_name"));
                        }
                        query.close();
                    } finally {
                    }
                } catch (Exception e3) {
                    e = e3;
                    fa4.g(e, true);
                    if (str == null) {
                    }
                }
            } else {
                uri2 = uri;
            }
            if (str == null) {
                return str;
            }
            String path = uri2.getPath();
            int lastIndexOf = path.lastIndexOf(47);
            return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
        } catch (Exception e4) {
            fa4.g(e4, true);
            return "";
        }
    }

    public static MediaController w() {
        MediaController mediaController;
        MediaController mediaController2 = f2;
        if (mediaController2 != null) {
            return mediaController2;
        }
        synchronized (MediaController.class) {
            mediaController = f2;
            if (mediaController == null) {
                mediaController = new MediaController();
                f2 = mediaController;
            }
        }
        return mediaController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int writeFrame(ByteBuffer byteBuffer, int i);

    public static int z(String str) {
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e) {
            fa4.g(e, true);
            i = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            fa4.g(th, true);
        }
        return i;
    }

    public final boolean A() {
        ArrayList arrayList;
        k27 k27Var = this.v0;
        return k27Var == null || !(k27.Q4(k27Var.k) || this.v0.g4()) || (arrayList = this.f0) == null || arrayList.size() <= 1 || !this.f0.contains(this.v0) || this.f0.indexOf(this.v0) >= this.f0.size() - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0(final int i, final int i2, final boolean z, final boolean z2) {
        u20 u20Var;
        if (!this.I1) {
            xk6 xk6Var = this.M1;
            co3 co3Var = this.N1;
            if (xk6Var != null) {
                co3Var.a(xk6Var);
                this.M1 = null;
            }
            co3Var.c(new Runnable() { // from class: kl6
                @Override // java.lang.Runnable
                public final void run() {
                    String[] strArr = MediaController.W1;
                    MediaController mediaController = MediaController.this;
                    byte b = mediaController.C1;
                    byte b3 = i;
                    boolean z3 = z;
                    int i3 = i2;
                    boolean z4 = z2;
                    if (b == 3) {
                        mediaController.C1 = (byte) 0;
                        mediaController.B0(b3, i3, z3, z4);
                        return;
                    }
                    AudioRecord audioRecord = mediaController.f1;
                    if (audioRecord == null) {
                        mediaController.g1 = null;
                        mediaController.y0 = false;
                        mediaController.r = false;
                        mediaController.P = false;
                        return;
                    }
                    try {
                        mediaController.C1 = b3;
                        mediaController.D1 = z3;
                        mediaController.E1 = i3;
                        mediaController.F1 = z4;
                        audioRecord.stop();
                        MediaController.i0(false);
                    } catch (Exception e) {
                        fa4.g(e, true);
                        if (mediaController.k1 != null) {
                            if (w01.a) {
                                fa4.d("delete voice file");
                            }
                            mediaController.k1.delete();
                        }
                    }
                    if (b3 == 0) {
                        mediaController.B0(0, 0, false, false);
                    }
                    try {
                        mediaController.L0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    gl.c3(new sv1(mediaController, b3, (byte) 4));
                }
            });
            return;
        }
        m20 m20Var = this.L1;
        if (m20Var != null) {
            this.L1 = null;
            if (i == 0) {
                s(false);
                return;
            }
            this.C1 = i;
            this.D1 = z;
            this.E1 = i2;
            this.F1 = z2;
            n(m20Var);
            return;
        }
        if (this.J1) {
            if (this.C1 == 3) {
                this.C1 = i;
                this.D1 = z;
                this.E1 = i2;
                this.F1 = z2;
                if (i == 0) {
                    u20 u20Var2 = this.G1;
                    if (u20Var2 != null) {
                        u20Var2.a = false;
                        ((h30) u20Var2.e).b();
                    }
                    s(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2 && (u20Var = this.G1) != null && u20Var.e()) {
            this.y0 = false;
            this.r = false;
            this.P = false;
            return;
        }
        al6 al6Var = this.H1;
        if (al6Var != null) {
            gl.r(al6Var);
            this.H1 = null;
        }
        this.J1 = true;
        this.C1 = i;
        this.D1 = z;
        this.E1 = i2;
        this.F1 = z2;
        u20 u20Var3 = this.G1;
        if (u20Var3 == null) {
            s(false);
        } else {
            h30 h30Var = (h30) u20Var3.e;
            if (i == 0) {
                u20Var3.a = false;
                h30Var.b();
                s(false);
            } else {
                u20Var3.a = true;
                h30Var.getClass();
                h30.q();
                int i3 = h30Var.e().a;
                if (u20Var3.a && (i3 == 3 || i3 == 5)) {
                    u20Var3.a = false;
                    h30Var.h();
                }
            }
        }
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        final int i4 = this.i1;
        final int i5 = this.h1;
        gl.c3(new Runnable() { // from class: zk6
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = MediaController.W1;
                kk7.f(i4).k(kk7.m2, Integer.valueOf(i5), Integer.valueOf(i == 2 ? 1 : 0));
            }
        });
    }

    public final void B0(final int i, final int i2, final boolean z, final boolean z2) {
        final MediaController mediaController;
        final File file;
        if (i == 0 || (file = this.k1) == null) {
            mediaController = this;
            s60.b(mediaController.k1);
            File file2 = mediaController.k1;
            if (file2 != null) {
                file2.delete();
            }
            mediaController.X(false);
        } else {
            final TLRPC.TL_document tL_document = this.g1;
            final File file3 = this.j1;
            if (w01.a) {
                fa4.b("stop recording internal filename " + this.k1.getPath());
            }
            mediaController = this;
            mediaController.O1.c(new Runnable() { // from class: gl6
                @Override // java.lang.Runnable
                public final void run() {
                    String[] strArr = MediaController.W1;
                    MediaController.this.K(file3, file, tL_document, i, z, i2, z2);
                }
            });
        }
        try {
            AudioRecord audioRecord = mediaController.f1;
            if (audioRecord != null) {
                audioRecord.release();
                mediaController.f1 = null;
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
        mediaController.g1 = null;
        mediaController.j1 = null;
        mediaController.k1 = null;
        mediaController.y0 = false;
        mediaController.r = false;
        mediaController.P = false;
    }

    public final boolean C() {
        return this.h0 || this.B0;
    }

    public final void C0(boolean z) {
        if (!this.I1) {
            this.N1.c(new yk6(this, z, r1));
            return;
        }
        this.K1 = z;
        u20 u20Var = this.G1;
        if (u20Var != null) {
            if (u20Var.e()) {
                X(true);
                i0(true);
            }
            u20 u20Var2 = this.G1;
            h30 h30Var = (h30) u20Var2.e;
            h30Var.getClass();
            h30.q();
            int i = h30Var.e().a;
            if (i == 3) {
                ((h30) u20Var2.e).n();
                return;
            }
            if (i == 5) {
                h30 h30Var2 = (h30) u20Var2.e;
                h30Var2.getClass();
                h30.q();
                if (h30Var2.G == 5) {
                    h30Var2.h.b("resume requested: trim=" + h30Var2.r + ".." + h30Var2.s + ", sourceDurationMs=" + h30Var2.j());
                    h30Var2.p();
                    h30Var2.s(6);
                    f30 f30Var = h30Var2.z;
                    if (f30Var == null) {
                        h30Var2.g(new IllegalStateException("Output generation is missing"));
                        return;
                    }
                    long j = h30Var2.r;
                    long j2 = h30Var2.s;
                    r1 = j2 >= h30.r(h30Var2.p) ? (byte) 1 : (byte) 0;
                    h30Var2.k(1);
                    long j3 = ((j2 - j) * 48000) / 1000;
                    h30Var2.p = j3;
                    h30Var2.r = 0L;
                    h30Var2.s = h30.r(j3);
                    h30Var2.d();
                    h30Var2.h.b("resume prefix selected: source=" + f30Var.b.getName() + ", trim=" + j + ".." + j2);
                    File file = f30Var.b;
                    if (r1 != 0) {
                        j2 = -1;
                    }
                    h30Var2.u(j, j2, file);
                }
            }
        }
    }

    public final boolean D(k27 k27Var) {
        k27 k27Var2;
        boolean z;
        if (k27Var != null && k27Var.j2) {
            return false;
        }
        if ((this.j0 == null && this.F0 == null) || k27Var == null || (k27Var2 = this.v0) == null) {
            return false;
        }
        long j = k27Var2.T;
        if (j != 0 && j == k27Var.T) {
            z = this.B0;
        } else {
            if (!G(k27Var)) {
                return false;
            }
            z = this.B0;
        }
        return !z;
    }

    public final boolean D0(int i, ArrayList arrayList) {
        k27 k27Var;
        int i2;
        k27 k27Var2;
        int i3 = this.V0;
        boolean z = ConnectionsManager.getInstance(y6c.t0).getConnectionState() == 2;
        this.V0 += i;
        if (z) {
            while (this.V0 < arrayList.size() && (i2 = this.V0) >= 0 && ((k27Var2 = (k27) arrayList.get(i2)) == null || !k27Var2.z0)) {
                this.V0 += i;
            }
        }
        if (this.V0 < arrayList.size() && this.V0 >= 0) {
            return false;
        }
        this.V0 = this.V0 >= arrayList.size() ? 0 : arrayList.size() - 1;
        if (z) {
            while (true) {
                int i4 = this.V0;
                if (i4 < 0 || i4 >= arrayList.size()) {
                    break;
                }
                int i5 = this.V0;
                if (i > 0) {
                    if (i5 > i3) {
                        break;
                    }
                    k27Var = (k27) arrayList.get(i5);
                    if (k27Var == null && k27Var.z0) {
                        break;
                    }
                    this.V0 += i;
                } else {
                    if (i5 < i3) {
                        break;
                    }
                    k27Var = (k27) arrayList.get(i5);
                    if (k27Var == null) {
                    }
                    this.V0 += i;
                }
            }
            if (this.V0 >= arrayList.size() || this.V0 < 0) {
                this.V0 = this.V0 < arrayList.size() ? arrayList.size() - 1 : 0;
            }
        }
        return true;
    }

    public final boolean E() {
        return (this.M1 == null && this.H1 == null && this.g1 == null) ? false : true;
    }

    public final void E0() {
        k27 k27Var = this.v0;
        if (k27Var != null && C() && this.i0 && (k27.Q4(k27Var.k) || k27Var.I3())) {
            R(k27Var);
        }
        this.i0 = false;
    }

    public final boolean F() {
        if (!this.I1) {
            return this.e1;
        }
        u20 u20Var = this.G1;
        return u20Var != null && u20Var.e();
    }

    public final void F0(File file, long j, byte[] bArr) {
        TLRPC.TL_document tL_document = this.g1;
        if (tL_document == null) {
            return;
        }
        tL_document.date = ConnectionsManager.getInstance(this.i1).getCurrentTime();
        this.g1.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        tL_documentAttributeAudio.waveform = bArr;
        if (bArr != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = j / 1000.0d;
        this.g1.attributes.clear();
        this.g1.attributes.add(tL_documentAttributeAudio);
    }

    public final boolean G(k27 k27Var) {
        k27 k27Var2 = this.v0;
        if (k27Var2 != null && k27.B0(k27Var2.k) == k27.B0(k27Var.k) && this.v0.e1() == k27Var.e1()) {
            if ((this.v0.T == 0) == (k27Var.T == 0)) {
                return true;
            }
        }
        return false;
    }

    public final void G0(k27 k27Var, int[] iArr, boolean z, boolean z2, int i) {
        k27 k27Var2;
        if (this.F0 != null) {
            if (i == 4 || i == 1) {
                try {
                    this.K0.getWindow().clearFlags(128);
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else {
                try {
                    this.K0.getWindow().addFlags(128);
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
            }
            rl6 rl6Var = this.d1;
            if (i == 3) {
                this.G0 = true;
                k27 k27Var3 = this.v0;
                if (k27Var3 != null && (k27.K4(k27Var3.k) || this.v0.g4())) {
                    gl.r(rl6Var);
                    ba4.G(k27Var.K1).Z(this.v0.F0(), true, false);
                }
                this.Q0 = true;
                return;
            }
            if (i == 2) {
                if (!z2 || (k27Var2 = this.v0) == null) {
                    return;
                }
                if (k27.K4(k27Var2.k) || this.v0.g4()) {
                    if (this.G0) {
                        rl6Var.run();
                        return;
                    } else {
                        gl.d3(rl6Var, 1000L);
                        return;
                    }
                }
                return;
            }
            if (this.F0.c0() && i == 4) {
                k27 k27Var4 = this.v0;
                if (k27Var4 == null || !k27.K4(k27Var4.k) || z || (iArr != null && iArr[0] >= 4)) {
                    if (Z()) {
                        return;
                    }
                    l(true, A(), true, false);
                } else {
                    this.F0.o0(0L);
                    if (iArr != null) {
                        iArr[0] = iArr[0] + 1;
                    }
                }
            }
        }
    }

    public final File I(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            ol6 ol6Var = new ol6(ba4.z(1), System.currentTimeMillis() + "_" + ba4.r(null, tL_document));
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), ol6Var.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.k1) {
                    this.k1 = ol6Var;
                }
                file2 = ol6Var;
            }
            file.delete();
            if (file == this.j1) {
                this.j1 = null;
            }
        }
        return file2;
    }

    public final void J(final int i, final int i2, long j, long j2, u47 u47Var, k27 k27Var, k27 k27Var2, TL_stories.StoryItem storyItem, j1a j1aVar) {
        String absolutePath;
        final byte b = 0;
        if (this.f1 != null) {
            gl.c3(new Runnable(this) { // from class: cl6
                public final /* synthetic */ MediaController b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    int i3 = i2;
                    int i4 = i;
                    MediaController mediaController = this.b;
                    switch (b3) {
                        case 0:
                            String[] strArr = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                            break;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                            break;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                            break;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.k2, Integer.valueOf(i3), Boolean.TRUE);
                            break;
                    }
                }
            });
            return;
        }
        final byte b3 = 1;
        i0(true);
        this.C1 = (byte) 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.g1 = tL_document;
        this.h1 = i2;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = TLObject.FLAG_31;
        tL_document.id = gba.p();
        this.g1.user_id = y6c.h(i).e();
        TLRPC.TL_document tL_document2 = this.g1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        gba.x();
        this.k1 = new ql6(ba4.z(1), System.currentTimeMillis() + "_" + ba4.r(null, this.g1));
        ba4.z(4).mkdirs();
        if (w01.a) {
            fa4.b("start recording internal " + this.k1.getPath() + " " + this.k1.exists());
        }
        File file = this.k1;
        Set set = s60.a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            s60.a.add(absolutePath);
        }
        try {
            if (startRecord(this.k1.getPath(), this.B1) == 0) {
                gl.c3(new Runnable(this) { // from class: cl6
                    public final /* synthetic */ MediaController b;

                    {
                        this.b = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b32 = b3;
                        int i3 = i2;
                        int i4 = i;
                        MediaController mediaController = this.b;
                        switch (b32) {
                            case 0:
                                String[] strArr = MediaController.W1;
                                mediaController.M1 = null;
                                kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                                break;
                            case 1:
                                String[] strArr2 = MediaController.W1;
                                mediaController.M1 = null;
                                kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                                break;
                            case 2:
                                String[] strArr3 = MediaController.W1;
                                mediaController.M1 = null;
                                kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                                break;
                            default:
                                String[] strArr4 = MediaController.W1;
                                mediaController.M1 = null;
                                kk7.f(i4).k(kk7.k2, Integer.valueOf(i3), Boolean.TRUE);
                                break;
                        }
                    }
                });
                if (w01.a) {
                    fa4.b("cant init encoder");
                    return;
                }
                return;
            }
            this.e1 = false;
            this.f1 = new AudioRecord(0, this.B1, 16, 2, this.A1);
            System.currentTimeMillis();
            this.l1 = 0L;
            this.m1 = 0;
            this.w1 = 0L;
            this.n1 = j;
            this.p1 = j2;
            this.q1 = u47Var;
            this.o1 = k27Var != null ? k27.b2(this.i1, k27Var.k, false, false) : 0L;
            this.i1 = i;
            this.r1 = k27Var2;
            this.s1 = k27Var;
            this.t1 = storyItem;
            this.u1 = j1aVar;
            this.z1.rewind();
            this.f1.startRecording();
            this.N1.c(this.P1);
            final byte b4 = 3;
            gl.c3(new Runnable(this) { // from class: cl6
                public final /* synthetic */ MediaController b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b32 = b4;
                    int i3 = i2;
                    int i4 = i;
                    MediaController mediaController = this.b;
                    switch (b32) {
                        case 0:
                            String[] strArr = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                            break;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                            break;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                            break;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.k2, Integer.valueOf(i3), Boolean.TRUE);
                            break;
                    }
                }
            });
        } catch (Exception e) {
            fa4.g(e, true);
            this.g1 = null;
            stopRecord();
            s60.b(this.k1);
            this.k1.delete();
            this.k1 = null;
            File file2 = this.j1;
            if (file2 != null) {
                file2.delete();
                this.j1 = null;
            }
            try {
                this.f1.release();
                this.f1 = null;
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
            i0(false);
            final byte b5 = 2;
            gl.c3(new Runnable(this) { // from class: cl6
                public final /* synthetic */ MediaController b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b32 = b5;
                    int i3 = i2;
                    int i4 = i;
                    MediaController mediaController = this.b;
                    switch (b32) {
                        case 0:
                            String[] strArr = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                            break;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                            break;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.l2, Integer.valueOf(i3));
                            break;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            kk7.f(i4).k(kk7.k2, Integer.valueOf(i3), Boolean.TRUE);
                            break;
                    }
                }
            });
        }
    }

    public final /* synthetic */ void K(File file, File file2, final TLRPC.TL_document tL_document, final int i, final boolean z, final int i2, final boolean z2) {
        stopRecord();
        final File I = I(file, file2, tL_document);
        if (I == null) {
            if (w01.a) {
                fa4.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (w01.a) {
            fa4.b("stop recording internal in queue " + I.exists() + " " + I.length());
        }
        gl.c3(new Runnable() { // from class: il6
            @Override // java.lang.Runnable
            public final void run() {
                boolean z3;
                char c;
                byte b;
                String str;
                String[] strArr = MediaController.W1;
                MediaController mediaController = MediaController.this;
                mediaController.getClass();
                boolean z4 = w01.a;
                File file3 = I;
                if (z4) {
                    fa4.b("stop recording internal ".concat(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1));
                }
                if (!file3.exists()) {
                    fa4.g(new RuntimeException("file not found :( recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1), true);
                }
                hq6.d0(mediaController.i1).D1(mediaController.n1, mediaController.o1, null);
                int currentTime = ConnectionsManager.getInstance(mediaController.i1).getCurrentTime();
                TLRPC.TL_document tL_document2 = tL_document;
                tL_document2.date = currentTime;
                tL_document2.size = (int) file3.length();
                TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                tL_documentAttributeAudio.voice = true;
                byte[] waveform = MediaController.getWaveform(file3.getAbsolutePath());
                tL_documentAttributeAudio.waveform = waveform;
                if (waveform != null) {
                    tL_documentAttributeAudio.flags |= 4;
                }
                long j = mediaController.l1;
                tL_documentAttributeAudio.duration = j / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                if (j > 700) {
                    byte b3 = i;
                    if (b3 == 1) {
                        c = 1;
                        b = 2;
                        z3 = false;
                        x3a f = x3a.f(tL_document2, null, file3.getAbsolutePath(), mediaController.n1, mediaController.r1, mediaController.s1, null, null, null, null, z, i2, 0, z2 ? Integer.MAX_VALUE : 0, null, null, false);
                        f.R = mediaController.p1;
                        f.T = mediaController.q1;
                        f.H = mediaController.t1;
                        f.K = mediaController.u1;
                        f.Q = 0L;
                        z3a.B(mediaController.i1).q0(f);
                    } else {
                        c = 1;
                        b = 2;
                        z3 = false;
                    }
                    kk7 f3 = kk7.f(mediaController.i1);
                    Integer valueOf = Integer.valueOf(mediaController.h1);
                    if (b3 == b) {
                        str = file3.getAbsolutePath();
                    } else {
                        tL_document2 = null;
                        str = null;
                    }
                    Object[] objArr = new Object[3];
                    objArr[z3 ? 1 : 0] = valueOf;
                    objArr[c] = tL_document2;
                    objArr[b] = str;
                    f3.k(kk7.r2, objArr);
                } else {
                    z3 = false;
                    kk7.f(mediaController.i1).k(kk7.s2, Integer.valueOf(mediaController.h1), Boolean.FALSE, Integer.valueOf((int) j));
                    s60.b(file3);
                    file3.delete();
                }
                mediaController.X(z3);
            }
        });
    }

    public final /* synthetic */ void L(boolean z) {
        stopRecord();
        TLRPC.TL_document tL_document = this.g1;
        File I = I(this.j1, this.k1, tL_document);
        if (tL_document == null || I == null) {
            return;
        }
        gl.c3(new rg((Object) this, (Object) I, z, (Object) tL_document, (byte) 24));
    }

    public final void M() {
        this.j1 = this.k1;
        pl6 pl6Var = new pl6(ba4.z(1), System.currentTimeMillis() + "_" + ba4.r(null, this.g1), (byte) 1);
        this.k1 = pl6Var;
        if (startRecord(pl6Var.getPath(), this.B1) != 0) {
            gl.c3(new wk6(this, (byte) 8));
            return;
        }
        gl.c3(new wk6(this, (byte) 7));
        if (w01.a) {
            fa4.b("cant resume audio encoder");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        k27 k27Var;
        int i;
        long j;
        long j2;
        long j3;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
        ia7 ia7Var = this.R0;
        if (ia7Var != null) {
            ia7Var.b();
            return;
        }
        if (this.Y0 || (k27Var = this.v0) == null || k27Var.r1 || cf3.B(k27.B0(k27Var.k)) || (i = this.a1) == 0) {
            return;
        }
        km6 km6Var = this.D0;
        byte b = 0;
        if (km6Var == null) {
            boolean[] zArr = this.X0;
            boolean z = zArr[0];
            int[] iArr = this.c1;
            if (!z) {
                this.Y0 = true;
                hq6.d0(j5.a(this.v0.K1).a).P0(k27.B0(this.v0.k), 50, iArr[0], 0, 4, this.b1, 1, this.a1, 0, null, null);
                return;
            } else {
                if (this.Z0 == 0 || zArr[1]) {
                    return;
                }
                this.Y0 = true;
                hq6.d0(j5.a(this.v0.K1).a).P0(this.Z0, 50, iArr[0], 0, 4, 0L, 1, this.a1, 0, null, null);
                return;
            }
        }
        if (km6Var.g) {
            return;
        }
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty()) {
            return;
        }
        int i2 = ((k27) arrayList.get(0)).K1;
        if (this.D0.c != 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            km6 km6Var2 = this.D0;
            tL_messages_search.q = km6Var2.a;
            tL_messages_search.limit = 20;
            rf4 rf4Var = km6Var2.b;
            tL_messages_search.filter = rf4Var == null ? new TLRPC.TL_inputMessagesFilterEmpty() : rf4Var.e;
            tL_messages_search.peer = na7.q1(j5.a(i2).a).h1(this.D0.c);
            tL_messages_search.offset_id = ((k27) b00.f(1, arrayList)).e1();
            km6 km6Var3 = this.D0;
            long j4 = km6Var3.d;
            if (j4 > 0) {
                tL_messages_search.min_date = (int) (j4 / 1000);
            }
            long j5 = km6Var3.e;
            tL_messages_searchGlobal = tL_messages_search;
            if (j5 > 0) {
                tL_messages_search.min_date = (int) (j5 / 1000);
                tL_messages_searchGlobal = tL_messages_search;
            }
        } else {
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal2.limit = 20;
            km6 km6Var4 = this.D0;
            tL_messages_searchGlobal2.q = km6Var4.a;
            tL_messages_searchGlobal2.filter = km6Var4.b.e;
            k27 k27Var2 = (k27) b00.f(1, arrayList);
            tL_messages_searchGlobal2.offset_id = k27Var2.e1();
            km6 km6Var5 = this.D0;
            tL_messages_searchGlobal2.offset_rate = km6Var5.h;
            tL_messages_searchGlobal2.flags |= 1;
            tL_messages_searchGlobal2.folder_id = km6Var5.i ? 1 : 0;
            TLRPC.Peer peer = k27Var2.k.peer_id;
            long j6 = peer.channel_id;
            if (j6 == 0) {
                j6 = peer.chat_id;
                if (j6 == 0) {
                    j = peer.user_id;
                    tL_messages_searchGlobal2.offset_peer = na7.q1(i2).h1(j);
                    km6 km6Var6 = this.D0;
                    j2 = km6Var6.d;
                    if (j2 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j2 / 1000);
                    }
                    j3 = km6Var6.e;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    if (j3 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j3 / 1000);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
            }
            j = -j6;
            tL_messages_searchGlobal2.offset_peer = na7.q1(i2).h1(j);
            km6 km6Var62 = this.D0;
            j2 = km6Var62.d;
            if (j2 > 0) {
            }
            j3 = km6Var62.e;
            tL_messages_searchGlobal = tL_messages_searchGlobal2;
            if (j3 > 0) {
            }
        }
        this.Y0 = true;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_searchGlobal, new fl6(this, i, i2, b));
    }

    public final boolean Q(k27 k27Var, boolean z) {
        if ((this.j0 != null || this.F0 != null) && k27Var != null && this.v0 != null && G(k27Var)) {
            y0();
            try {
                if (this.j0 == null) {
                    lbc lbcVar = this.F0;
                    if (lbcVar != null) {
                        lbcVar.f0();
                    }
                } else if (!z || fo.w() || k27.Q4(this.v0.k) || this.v0.L0() * (1.0f - this.v0.b0) <= 1.0d || !LaunchActivity.G1) {
                    this.j0.f0();
                } else {
                    ValueAnimator valueAnimator = this.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        this.R1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    this.R1 = ofFloat;
                    ofFloat.addUpdateListener(this.S1);
                    this.R1.setDuration(300L);
                    this.R1.addListener(new v85(this, (byte) 15));
                    this.R1.start();
                }
                this.h0 = true;
                kk7.f(this.v0.K1).k(kk7.f2, Integer.valueOf(this.v0.e1()));
                try {
                    fo.b(1);
                    if (!this.U1) {
                        if (tg2.N().O()) {
                            tg2.N().Y(u());
                        }
                        fo.z(false);
                    }
                    return true;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return true;
                }
            } catch (Exception e3) {
                fa4.g(e3, true);
                this.h0 = false;
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:78|(1:80)(2:322|(23:326|(1:330)|346|(1:333)(1:345)|334|(1:344)(4:338|(1:340)(1:343)|341|342)|82|(1:84)|85|(15:259|(2:261|(12:320|(1:319)(1:269)|(1:271)|272|(4:274|(1:276)(1:309)|277|(5:279|(1:281)|(3:283|(1:286)|287)(4:301|302|(1:304)|305)|288|(6:290|(1:292)(1:299)|293|(1:295)|296|(1:298))(1:300)))|310|(2:315|316)|312|(1:314)|(0)(0)|288|(0)(0)))(1:321)|265|(1:267)|319|(0)|272|(0)|310|(0)|312|(0)|(0)(0)|288|(0)(0))(18:88|(1:90)|91|92|(3:94|(1:97)|98)(3:240|(1:242)|243)|99|100|(6:102|(3:106|(1:110)|111)|112|(1:114)|115|(1:117))(4:222|223|224|(4:228|(1:232)|233|(1:235)))|118|(1:120)|121|(2:219|(1:221))(8:127|(7:129|(1:131)|132|(1:134)|135|(1:137)|138)|218|132|(0)|135|(0)|138)|139|(1:143)|144|(1:146)(1:217)|147|(3:149|(1:151)|152)(1:216))|153|(1:155)|156|(1:164)|165|(4:202|203|(5:205|(1:207)|208|(1:210)|211)|213)(2:167|(3:190|191|(4:193|(1:195)|196|(1:198))))|169|(3:171|172|173)(1:189)|174|175|176|(3:178|(1:180)|181)|183))|81|82|(0)|85|(0)|259|(0)(0)|265|(0)|319|(0)|272|(0)|310|(0)|312|(0)|(0)(0)|288|(0)(0)|153|(0)|156|(4:158|160|162|164)|165|(0)(0)|169|(0)(0)|174|175|176|(0)|183) */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0868, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0869, code lost:
    
        fa4.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x01da, code lost:
    
        if (r11.exists() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0093, code lost:
    
        if (r40.V1 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e6, code lost:
    
        if (r5 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0450 A[Catch: Exception -> 0x04e6, TryCatch #6 {Exception -> 0x04e6, blocks: (B:92:0x0269, B:94:0x028f, B:97:0x0295, B:98:0x029e, B:99:0x0340, B:102:0x034a, B:104:0x0350, B:106:0x035d, B:110:0x0375, B:111:0x0379, B:112:0x037b, B:114:0x0387, B:115:0x0397, B:117:0x039c, B:118:0x03fd, B:120:0x0403, B:121:0x040b, B:123:0x0411, B:125:0x0417, B:127:0x0423, B:129:0x0427, B:131:0x042d, B:132:0x0439, B:134:0x0450, B:135:0x0455, B:138:0x0463, B:139:0x047c, B:141:0x0482, B:143:0x0486, B:144:0x0490, B:147:0x0499, B:149:0x04a9, B:151:0x04ad, B:152:0x04b5, B:216:0x04db, B:218:0x0430, B:219:0x0472, B:221:0x0476, B:224:0x03ac, B:226:0x03b6, B:228:0x03c3, B:232:0x03db, B:233:0x03df, B:235:0x03ed, B:239:0x03a9, B:240:0x02ac, B:242:0x0311, B:243:0x0314, B:223:0x03a0), top: B:91:0x0269, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x07b8  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x081f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x084b A[Catch: Exception -> 0x0868, TryCatch #3 {Exception -> 0x0868, blocks: (B:176:0x0844, B:178:0x084b, B:180:0x0855, B:181:0x0860), top: B:175:0x0844 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0755 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0625 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0218  */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28, types: [k27, lbc] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R(final k27 k27Var) {
        boolean z;
        boolean z2;
        File file;
        final File M;
        File file2;
        boolean z3;
        File M2;
        boolean z4;
        ix ixVar;
        boolean K4;
        String str;
        boolean z5;
        PipRoundVideoView pipRoundVideoView;
        boolean g4;
        lbc lbcVar;
        PowerManager.WakeLock wakeLock;
        ?? r5;
        gm6 gm6Var;
        TLRPC.TL_inputDocument tL_inputDocument;
        byte[] bArr;
        boolean z6;
        int i = kk7.f2;
        int i2 = kk7.d2;
        if (k27Var == null) {
            return false;
        }
        h();
        if (!(this.j0 == null && this.F0 == null) && G(k27Var)) {
            if (this.h0) {
                a0(k27Var);
            }
            if (gba.k(true)) {
                return true;
            }
            v0(this.s);
            return true;
        }
        if (!k27Var.N3() && k27Var.k.media_unread) {
            na7.q1(k27Var.K1).t3(k27Var);
        }
        boolean z7 = !this.C0;
        k27 k27Var2 = this.v0;
        if (k27Var2 != null) {
            if ((k27Var2.I3() && k27.Q4(k27Var.k)) || k27Var.g4() || k27.K4(k27Var.k)) {
                k27 k27Var3 = this.v0;
                if (k27Var3 != null && k27Var3.I3() && !this.S0.isEmpty()) {
                    this.V1 = new mm6(this.v0);
                }
                z6 = true;
                if (!this.C0) {
                    this.v0.F5();
                    kk7.f(this.v0.K1).k(i2, Integer.valueOf(this.v0.e1()), 0);
                }
                z = z6;
                z7 = false;
            }
            z6 = false;
            if (!this.C0) {
            }
            z = z6;
            z7 = false;
        } else {
            z = false;
        }
        l(z7, false, false, false);
        this.o0 = null;
        this.p0 = 0L;
        this.C0 = false;
        this.u0 = 0.0f;
        String str2 = k27Var.k.attachPath;
        if (str2 == null || str2.length() <= 0) {
            z2 = false;
        } else {
            file = new File(k27Var.k.attachPath);
            z2 = file.exists();
        }
        file = null;
        if (file != null) {
            M = file;
        } else {
            ba4.G(k27Var.K1);
            M = ba4.M(k27Var.k, false, true);
        }
        boolean z8 = gba.x0 && !((!k27Var.I3() && !k27Var.g4() && (!k27.K4(k27Var.k) || !k27Var.B())) || k27.Q5(k27Var.k) || cf3.B(k27.B0(k27Var.k)));
        if (M != file && !(z2 = M.exists()) && !z8) {
            ba4.G(k27Var.K1).X(k27Var.F0(), k27Var, 0, k27.Q5(k27Var.k) ? 2 : 0);
            this.B0 = true;
            this.h0 = false;
            this.E0 = null;
            this.v0 = k27Var;
            if (c()) {
                try {
                    a.b.startService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
                } catch (Throwable th) {
                    fa4.g(th, true);
                }
            } else {
                a.b.stopService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
            }
            kk7.f(this.v0.K1).k(i, Integer.valueOf(this.v0.e1()));
            return true;
        }
        boolean z9 = z2;
        this.B0 = false;
        boolean I3 = k27Var.I3();
        int i3 = k27Var.K1;
        if (I3) {
            g(i3);
        } else {
            ArrayList arrayList = this.f0;
            if (arrayList != null && arrayList.size() >= 2) {
                k27 k27Var4 = (k27) this.f0.get(1);
                String str3 = k27Var4.k.attachPath;
                if (str3 != null && str3.length() > 0) {
                    file2 = new File(k27Var4.k.attachPath);
                }
                file2 = null;
                if (file2 != null) {
                    z3 = z;
                    M2 = file2;
                } else {
                    ba4.G(i3);
                    z3 = z;
                    M2 = ba4.M(k27Var4.k, false, true);
                }
                M2.exists();
                if (M2 == file2 || M2.exists()) {
                    z4 = false;
                } else {
                    ba4 G = ba4.G(i3);
                    z4 = false;
                    G.X(k27Var4.F0(), k27Var4, 0, k27.Q5(k27Var4.k) ? 2 : 0);
                }
                ixVar = this.M0;
                if (ixVar != null) {
                    this.N0 = z4;
                    ixVar.setDrawingReady(z4);
                }
                K4 = k27.K4(k27Var.k);
                if (!k27Var.g4() || K4) {
                    File file3 = file;
                    ba4.G(k27Var.K1).c0(k27Var.F0(), true);
                    this.G0 = false;
                    if (K4) {
                        str = "tg://";
                    } else {
                        str = "tg://";
                        if (k27Var.k.peer_id.channel_id != 0 || k27Var.b0 > 0.1f) {
                            z5 = false;
                            int[] iArr = (K4 || k27Var.L0() > 30.0d) ? null : new int[]{1};
                            if (!z3) {
                                m();
                            }
                            lbc lbcVar2 = new lbc();
                            this.F0 = lbcVar2;
                            lbcVar2.r0(false);
                            int i4 = this.n0 + 1;
                            this.n0 = i4;
                            String str4 = str;
                            this.F0.K = new wl6(this, i4, k27Var, iArr, z5);
                            this.Q0 = false;
                            if (this.I0 == null) {
                                na7 q1 = na7.q1(k27Var.K1);
                                if ((k27Var.r1 ? q1.p0 : q1.o0).contains(Long.valueOf(k27.B0(k27Var.k)))) {
                                    TextureView textureView = this.H0;
                                    if (textureView != null) {
                                        this.F0.z0(textureView);
                                    }
                                    if (z9) {
                                        try {
                                            int F = ba4.G(k27Var.K1).F(k27Var);
                                            TLRPC.Document F0 = k27Var.F0();
                                            StringBuilder sb = new StringBuilder("?account=");
                                            sb.append(k27Var.K1);
                                            sb.append("&id=");
                                            sb.append(F0.id);
                                            sb.append("&hash=");
                                            sb.append(F0.access_hash);
                                            sb.append("&dc=");
                                            sb.append(F0.dc_id);
                                            sb.append("&size=");
                                            sb.append(F0.size);
                                            sb.append("&mime=");
                                            sb.append(URLEncoder.encode(F0.mime_type, "UTF-8"));
                                            sb.append("&rid=");
                                            sb.append(F);
                                            sb.append("&name=");
                                            sb.append(URLEncoder.encode(ba4.B(F0), "UTF-8"));
                                            sb.append("&reference=");
                                            byte[] bArr2 = F0.file_reference;
                                            if (bArr2 == null) {
                                                bArr2 = new byte[0];
                                            }
                                            sb.append(Utilities.f(bArr2));
                                            this.F0.i0(Uri.parse(str4 + k27Var.S0() + sb.toString()), "other");
                                        } catch (Exception e) {
                                            fa4.g(e, true);
                                        }
                                    } else {
                                        if (!k27Var.z0 && M != file3) {
                                            final byte b = 0;
                                            gl.c3(new Runnable() { // from class: jl6
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b3 = b;
                                                    File file4 = M;
                                                    k27 k27Var5 = k27Var;
                                                    switch (b3) {
                                                        case 0:
                                                            String[] strArr = MediaController.W1;
                                                            kk7.f(k27Var5.K1).k(kk7.X1, ba4.r(null, k27Var5.F0()), file4);
                                                            break;
                                                        default:
                                                            String[] strArr2 = MediaController.W1;
                                                            kk7.f(k27Var5.K1).k(kk7.X1, ba4.r(null, k27Var5.F0()), file4);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        this.F0.i0(Uri.fromFile(M), "other");
                                    }
                                    g4 = k27Var.g4();
                                    lbc lbcVar3 = this.F0;
                                    if (g4) {
                                        lbcVar3.w0(3);
                                    } else {
                                        lbcVar3.w0(this.M ? 0 : 3);
                                        if (Math.abs(this.q0 - 1.0f) > 0.001f) {
                                            this.F0.u0(Math.round(this.q0 * 10.0f) / 10.0f);
                                        }
                                        float f = k27Var.c0;
                                        if (f >= 0.0f) {
                                            this.u0 = f;
                                            k27Var.b0 = f;
                                            k27Var.c0 = -1.0f;
                                        }
                                    }
                                }
                            }
                            if (this.I0 == null) {
                                try {
                                    PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                                    this.I0 = pipRoundVideoView2;
                                    pipRoundVideoView2.d(this.K0, new wk6(this, (byte) 9));
                                } catch (Exception unused) {
                                    this.I0 = null;
                                }
                            }
                            pipRoundVideoView = this.I0;
                            if (pipRoundVideoView != null) {
                                this.F0.z0(pipRoundVideoView.c);
                            }
                            if (z9) {
                            }
                            g4 = k27Var.g4();
                            lbc lbcVar32 = this.F0;
                            if (g4) {
                            }
                        }
                    }
                    z5 = true;
                    if (K4) {
                    }
                    if (!z3) {
                    }
                    lbc lbcVar22 = new lbc();
                    this.F0 = lbcVar22;
                    lbcVar22.r0(false);
                    int i42 = this.n0 + 1;
                    this.n0 = i42;
                    String str42 = str;
                    this.F0.K = new wl6(this, i42, k27Var, iArr, z5);
                    this.Q0 = false;
                    if (this.I0 == null) {
                    }
                    if (this.I0 == null) {
                    }
                    pipRoundVideoView = this.I0;
                    if (pipRoundVideoView != null) {
                    }
                    if (z9) {
                    }
                    g4 = k27Var.g4();
                    lbc lbcVar322 = this.F0;
                    if (g4) {
                    }
                } else {
                    PipRoundVideoView pipRoundVideoView3 = this.I0;
                    if (pipRoundVideoView3 != null) {
                        pipRoundVideoView3.a(true);
                        this.I0 = null;
                    }
                    try {
                        lbc lbcVar4 = new lbc();
                        this.j0 = lbcVar4;
                        int i5 = this.n0 + 1;
                        this.n0 = i5;
                        lbcVar4.K = new ll6(this, i5, k27Var, (byte) 0);
                        lbcVar4.L = new eef((byte) 21);
                        if (z9) {
                            if (!k27Var.z0 && M != file) {
                                final byte b3 = 1;
                                gl.c3(new Runnable() { // from class: jl6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b3;
                                        File file4 = M;
                                        k27 k27Var5 = k27Var;
                                        switch (b32) {
                                            case 0:
                                                String[] strArr = MediaController.W1;
                                                kk7.f(k27Var5.K1).k(kk7.X1, ba4.r(null, k27Var5.F0()), file4);
                                                break;
                                            default:
                                                String[] strArr2 = MediaController.W1;
                                                kk7.f(k27Var5.K1).k(kk7.X1, ba4.r(null, k27Var5.F0()), file4);
                                                break;
                                        }
                                    }
                                });
                            }
                            this.j0.i0(Uri.fromFile(M), "other");
                            this.m0 = false;
                        } else {
                            int F2 = ba4.G(k27Var.K1).F(k27Var);
                            TLRPC.Document F02 = k27Var.F0();
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(k27Var.K1);
                            sb2.append("&id=");
                            sb2.append(F02.id);
                            sb2.append("&hash=");
                            sb2.append(F02.access_hash);
                            sb2.append("&dc=");
                            sb2.append(F02.dc_id);
                            sb2.append("&size=");
                            sb2.append(F02.size);
                            sb2.append("&mime=");
                            sb2.append(URLEncoder.encode(F02.mime_type, "UTF-8"));
                            sb2.append("&rid=");
                            sb2.append(F2);
                            sb2.append("&name=");
                            sb2.append(URLEncoder.encode(ba4.B(F02), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr3 = F02.file_reference;
                            if (bArr3 == null) {
                                bArr3 = new byte[0];
                            }
                            sb2.append(Utilities.f(bArr3));
                            this.j0.i0(Uri.parse("tg://" + k27Var.S0() + sb2.toString()), "other");
                            this.m0 = true;
                        }
                        if (k27.Q4(k27Var.k)) {
                            String S0 = k27Var.S0();
                            if (S0 != null && k27Var.L0() >= 300.0d) {
                                float f3 = a.b.getSharedPreferences("media_saved_pos", 0).getFloat(S0, -1.0f);
                                if (f3 > 0.0f && f3 < 0.99f) {
                                    this.u0 = f3;
                                    k27Var.b0 = f3;
                                }
                                this.o0 = S0;
                            }
                            if (Math.abs(this.q0 - 1.0f) > 0.001f) {
                                this.j0.u0(Math.round(this.q0 * 10.0f) / 10.0f);
                            }
                            this.E0 = null;
                            if (!z3) {
                                m();
                            }
                        } else {
                            try {
                                this.E0 = g00.a(M);
                            } catch (Exception e3) {
                                fa4.g(e3, true);
                            }
                            String S02 = k27Var.S0();
                            if (!TextUtils.isEmpty(S02) && k27Var.L0() >= 600.0d) {
                                float f4 = a.b.getSharedPreferences("media_saved_pos", 0).getFloat(S02, -1.0f);
                                if (f4 > 0.0f && f4 < 0.999f) {
                                    this.u0 = f4;
                                    k27Var.b0 = f4;
                                }
                                this.o0 = S02;
                                if (Math.abs(this.r0 - 1.0f) > 0.001f) {
                                    this.j0.u0(Math.round(this.r0 * 10.0f) / 10.0f);
                                }
                            }
                        }
                        float f5 = k27Var.c0;
                        if (f5 >= 0.0f) {
                            this.u0 = f5;
                            k27Var.b0 = f5;
                            k27Var.c0 = -1.0f;
                        }
                        if (!k27Var.I3() || k27Var.F0() == null || cf3.B(k27.B0(k27Var.k))) {
                            gm6 gm6Var2 = this.x0;
                            if (gm6Var2 != null) {
                                gm6Var2.a();
                                this.x0 = null;
                            }
                        } else {
                            gm6 gm6Var3 = this.x0;
                            if (gm6Var3 != null) {
                                if (gm6Var3.a != k27Var.K1) {
                                    gm6Var3.a();
                                }
                                TLRPC.Document F03 = k27Var.F0();
                                tL_inputDocument = new TLRPC.TL_inputDocument();
                                tL_inputDocument.id = F03.id;
                                tL_inputDocument.access_hash = F03.access_hash;
                                bArr = F03.file_reference;
                                tL_inputDocument.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputDocument.file_reference = new byte[0];
                                }
                                gm6 gm6Var4 = this.x0;
                                gl.r(gm6Var4.e);
                                if (tL_inputDocument.id == 0) {
                                    tL_inputDocument = null;
                                }
                                gm6Var4.b = tL_inputDocument;
                                gm6Var4.c = -9223372036854775807L;
                                gm6Var4.d.clear();
                            }
                            this.x0 = new gm6(k27Var.K1);
                            TLRPC.Document F032 = k27Var.F0();
                            tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = F032.id;
                            tL_inputDocument.access_hash = F032.access_hash;
                            bArr = F032.file_reference;
                            tL_inputDocument.file_reference = bArr;
                            if (bArr == null) {
                            }
                            gm6 gm6Var42 = this.x0;
                            gl.r(gm6Var42.e);
                            if (tL_inputDocument.id == 0) {
                            }
                            gm6Var42.b = tL_inputDocument;
                            gm6Var42.c = -9223372036854775807L;
                            gm6Var42.d.clear();
                        }
                        y54 y54Var = this.j0.d;
                        if (y54Var != null && (gm6Var = this.x0) != null) {
                            y54Var.m.a(new fm6(gm6Var, y54Var));
                        }
                        this.j0.w0(this.M ? 0 : 3);
                        this.j0.g0();
                        if (k27.Q4(k27Var.k)) {
                            this.Q1 = 1.0f;
                            m0();
                        } else {
                            ValueAnimator valueAnimator = this.R1;
                            if (valueAnimator != null) {
                                valueAnimator.removeAllListeners();
                                this.R1.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 1.0f);
                            this.R1 = ofFloat;
                            ofFloat.addUpdateListener(this.S1);
                            this.R1.setDuration(300L);
                            this.R1.start();
                        }
                    } catch (Exception e4) {
                        fa4.g(e4, true);
                        kk7 f6 = kk7.f(k27Var.K1);
                        k27 k27Var5 = this.v0;
                        f6.k(i, Integer.valueOf(k27Var5 != null ? k27Var5.e1() : 0));
                        if (this.j0 == null) {
                            return false;
                        }
                        gm6 gm6Var5 = this.x0;
                        if (gm6Var5 != null) {
                            gm6Var5.a();
                            r5 = 0;
                            this.x0 = null;
                        } else {
                            r5 = 0;
                        }
                        this.j0.l0();
                        this.j0 = r5;
                        bkb.L1(this.v0);
                        this.h0 = false;
                        this.v0 = r5;
                        this.B0 = false;
                        return false;
                    }
                }
                e(k27Var);
                m0();
                this.h0 = false;
                this.v0 = k27Var;
                if (!gba.k(true)) {
                    v0(this.s);
                }
                if (!a.x && (wakeLock = this.d) != null && !wakeLock.isHeld() && !k27.Q4(this.v0.k)) {
                    this.v0.g4();
                }
                u0(this.v0);
                kk7.f(k27Var.K1).k(kk7.g2, k27Var, k27Var2);
                lbcVar = this.F0;
                if (lbcVar == null) {
                    try {
                        if (this.v0.b0 != 0.0f) {
                            long U = lbcVar.U();
                            if (U == -9223372036854775807L) {
                                U = ((long) this.v0.L0()) * 1000;
                            }
                            k27 k27Var6 = this.v0;
                            int i6 = (int) (U * k27Var6.b0);
                            int i7 = k27Var6.d0;
                            if (i7 != 0) {
                                k27Var6.d0 = 0;
                                i6 = i7;
                            }
                            this.F0.o0(i6);
                        }
                    } catch (Exception e5) {
                        k27 k27Var7 = this.v0;
                        k27Var7.b0 = 0.0f;
                        k27Var7.i0 = 0;
                        kk7.f(k27Var.K1).k(i2, Integer.valueOf(this.v0.e1()), 0);
                        fa4.g(e5, true);
                    }
                    this.F0.g0();
                } else {
                    lbc lbcVar5 = this.j0;
                    if (lbcVar5 != null) {
                        try {
                            if (this.v0.b0 != 0.0f) {
                                long U2 = lbcVar5.U();
                                if (U2 == -9223372036854775807L) {
                                    U2 = ((long) this.v0.L0()) * 1000;
                                }
                                long j = (int) (U2 * this.v0.b0);
                                this.j0.p0(j, false);
                                if (!this.U1) {
                                    fo.x(j);
                                }
                            }
                        } catch (Exception e6) {
                            this.v0.F5();
                            kk7.f(k27Var.K1).k(i2, Integer.valueOf(this.v0.e1()), 0);
                            fa4.g(e6, true);
                        }
                    }
                }
                if (c()) {
                    a.b.stopService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
                } else {
                    try {
                        a.b.startService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
                    } catch (Throwable th2) {
                        fa4.f(th2);
                    }
                }
                fo.b(1);
                if (!this.U1) {
                    if (tg2.N().O()) {
                        tg2.N().Y(u());
                    }
                    fo.z(true);
                }
                return true;
            }
        }
        z3 = z;
        z4 = false;
        ixVar = this.M0;
        if (ixVar != null) {
        }
        K4 = k27.K4(k27Var.k);
        if (k27Var.g4()) {
        }
        File file32 = file;
        ba4.G(k27Var.K1).c0(k27Var.F0(), true);
        this.G0 = false;
        if (K4) {
        }
        z5 = true;
        if (K4) {
        }
        if (!z3) {
        }
        lbc lbcVar222 = new lbc();
        this.F0 = lbcVar222;
        lbcVar222.r0(false);
        int i422 = this.n0 + 1;
        this.n0 = i422;
        String str422 = str;
        this.F0.K = new wl6(this, i422, k27Var, iArr, z5);
        this.Q0 = false;
        if (this.I0 == null) {
        }
        if (this.I0 == null) {
        }
        pipRoundVideoView = this.I0;
        if (pipRoundVideoView != null) {
        }
        if (z9) {
        }
        g4 = k27Var.g4();
        lbc lbcVar3222 = this.F0;
        if (g4) {
        }
        e(k27Var);
        m0();
        this.h0 = false;
        this.v0 = k27Var;
        if (!gba.k(true)) {
        }
        if (!a.x) {
            this.v0.g4();
        }
        u0(this.v0);
        kk7.f(k27Var.K1).k(kk7.g2, k27Var, k27Var2);
        lbcVar = this.F0;
        if (lbcVar == null) {
        }
        if (c()) {
        }
        fo.b(1);
        if (!this.U1) {
        }
        return true;
    }

    public final void S(int i) {
        int i2 = this.V0;
        if (i2 >= 0) {
            ArrayList arrayList = this.S0;
            if (i2 < arrayList.size()) {
                this.V0 = i;
                this.C0 = true;
                k27 k27Var = (k27) arrayList.get(i);
                if (this.v0 != null && !G(k27Var)) {
                    this.v0.F5();
                }
                R(k27Var);
            }
        }
    }

    public final void T(boolean z) {
        int i;
        ArrayList arrayList = gba.J0 ? this.U0 : this.S0;
        if (z && (((i = gba.O0) == 2 || (i == 1 && arrayList.size() == 1)) && !this.W0)) {
            l(false, false, false, false);
            int i2 = this.V0;
            if (i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            k27 k27Var = (k27) arrayList.get(this.V0);
            k27Var.b0 = 0.0f;
            k27Var.i0 = 0;
            R(k27Var);
            return;
        }
        if (!D0(this.R0 != null ? !gba.K0 : gba.K0 ? 1 : -1, arrayList) || !z || gba.O0 != 0 || this.W0) {
            int i3 = this.V0;
            if (i3 < 0 || i3 >= arrayList.size()) {
                return;
            }
            k27 k27Var2 = this.v0;
            if (k27Var2 != null) {
                k27Var2.F5();
            }
            this.C0 = true;
            R((k27) arrayList.get(this.V0));
            return;
        }
        if (this.j0 == null) {
            lbc lbcVar = this.F0;
            if (lbcVar == null) {
                return;
            }
            this.M0 = null;
            this.O0 = null;
            this.Q0 = false;
            this.H0 = null;
            lbcVar.l0();
            this.F0 = null;
            try {
                this.K0.getWindow().clearFlags(128);
            } catch (Exception e) {
                fa4.g(e, true);
            }
            gl.r(this.d1);
            ba4.G(this.v0.K1).Z(this.v0.F0(), true, false);
        } else {
            gm6 gm6Var = this.x0;
            if (gm6Var != null) {
                gm6Var.a();
                this.x0 = null;
            }
            try {
                this.j0.l0();
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
            this.j0 = null;
            bkb.L1(this.v0);
        }
        y0();
        this.h0 = true;
        k27 k27Var3 = this.v0;
        k27Var3.b0 = 0.0f;
        k27Var3.i0 = 0;
        kk7.f(k27Var3.K1).k(kk7.d2, Integer.valueOf(this.v0.e1()), 0);
        kk7.f(this.v0.K1).k(kk7.f2, Integer.valueOf(this.v0.e1()));
    }

    public final void U() {
        int i;
        ArrayList arrayList = gba.J0 ? this.U0 : this.S0;
        if (arrayList.isEmpty() || (i = this.V0) < 0 || i >= arrayList.size()) {
            return;
        }
        k27 k27Var = (k27) arrayList.get(this.V0);
        if (k27Var.i0 > 10) {
            h0(k27Var, 0.0f);
            return;
        }
        D0(this.R0 != null ? !gba.K0 : gba.K0 ? -1 : 1, arrayList);
        if (this.V0 < arrayList.size()) {
            this.C0 = true;
            R((k27) arrayList.get(this.V0));
        }
    }

    public final void V(boolean z) {
        if (this.g1 != null) {
            C0(false);
            return;
        }
        if (!z) {
            A0(2, 0, false, false);
            return;
        }
        int currentAccount = this.s.getCurrentAccount();
        long a = this.s.a();
        mu1 mu1Var = this.s;
        k27 k27Var = mu1Var.m4;
        int classGuid = mu1Var.getClassGuid();
        mu1 mu1Var2 = this.s;
        j1a Q6 = mu1Var2 != null ? mu1Var2.Q6() : null;
        mu1 mu1Var3 = this.s;
        long c7 = mu1Var3 != null ? mu1Var3.c7() : 0L;
        mu1 mu1Var4 = this.s;
        w0(currentAccount, a, null, k27Var, null, classGuid, false, Q6, c7, mu1Var4 != null ? mu1Var4.y5 : null);
    }

    public final boolean W() {
        m20 m20Var = this.L1;
        if (m20Var != null) {
            File file = (File) m20Var.b;
            s60.b(file);
            file.delete();
            Y();
            return true;
        }
        u20 u20Var = this.G1;
        if (u20Var == null || !u20Var.e()) {
            return false;
        }
        this.G1 = null;
        if (!u20Var.c()) {
            ((h30) u20Var.e).o();
            u20Var.c = true;
        }
        Y();
        return true;
    }

    public final void X(boolean z) {
        boolean z2 = this.W;
        zz zzVar = this.a;
        if (!z) {
            if (z2) {
                im7.p0.abandonAudioFocus(zzVar);
                this.W = false;
                return;
            }
            return;
        }
        if (!z2 && gba.B0 && im7.p0.requestAudioFocus(zzVar, 3, 2) == 1) {
            this.W = true;
        }
    }

    public final void Y() {
        this.g1 = null;
        this.j1 = null;
        this.k1 = null;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.L1 = null;
        this.C1 = (byte) 0;
    }

    public final boolean Z() {
        int i;
        k27 k27Var;
        mm6 mm6Var = this.V1;
        if (mm6Var != null) {
            k27 k27Var2 = mm6Var.a;
            this.V1 = null;
            ArrayList arrayList = gba.J0 ? this.U0 : this.S0;
            if (arrayList != null && (i = this.V0) >= 0 && i < arrayList.size() && (k27Var = (k27) arrayList.get(this.V0)) != null && k27.B0(k27Var.k) == k27.B0(k27Var2.k) && k27Var.e1() == k27Var2.e1()) {
                this.C0 = false;
                float f = mm6Var.b;
                k27Var.c0 = f;
                k27Var.b0 = f;
                k27Var.d0 = mm6Var.c;
                k27Var.i0 = mm6Var.d;
                R(k27Var);
                Q(k27Var, false);
                return true;
            }
        }
        return false;
    }

    public final void a0(k27 k27Var) {
        if ((this.j0 == null && this.F0 == null) || k27Var == null || this.v0 == null || !G(k27Var)) {
            return;
        }
        try {
            u0(this.v0);
            ValueAnimator valueAnimator = this.R1;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.R1.cancel();
            }
            if (k27.Q4(k27Var.k) || k27Var.g4()) {
                this.Q1 = 1.0f;
                m0();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 1.0f);
                this.R1 = ofFloat;
                ofFloat.addUpdateListener(this.S1);
                this.R1.setDuration(300L);
                this.R1.start();
            }
            lbc lbcVar = this.j0;
            if (lbcVar != null) {
                lbcVar.g0();
            } else {
                lbc lbcVar2 = this.F0;
                if (lbcVar2 != null) {
                    lbcVar2.g0();
                }
            }
            e(k27Var);
            this.h0 = false;
            kk7.f(this.v0.K1).k(kk7.f2, Integer.valueOf(this.v0.e1()));
            try {
                fo.b(1);
                if (this.U1) {
                    return;
                }
                fo.z(true);
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } catch (Exception e3) {
            fa4.g(e3, true);
        }
    }

    public final void b() {
        k27 k27Var;
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.U0;
        arrayList3.clear();
        int i = this.V0;
        if (i < 0 || i >= arrayList.size()) {
            k27Var = null;
        } else {
            k27Var = (k27) arrayList.get(this.V0);
            arrayList2.remove(this.V0);
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            int nextInt = Utilities.b.nextInt(arrayList2.size());
            arrayList3.add((k27) arrayList2.get(nextInt));
            arrayList2.remove(nextInt);
        }
        if (k27Var != null) {
            arrayList3.add(k27Var);
            this.V0 = arrayList3.size() - 1;
        }
    }

    public final void b0() {
        k27 k27Var;
        lbc lbcVar = this.j0;
        if (lbcVar == null || (k27Var = this.v0) == null || this.h0) {
            return;
        }
        if (lbcVar.d == null || lbcVar.M != 2) {
            lbcVar.g0();
        } else {
            l(false, false, false, false);
            R(k27Var);
        }
    }

    public final boolean c() {
        k27 k27Var = this.v0;
        if (k27Var != null) {
            return ((!k27Var.I3() && !k27.Q4(this.v0.k) && !this.v0.g4()) || this.v0.R4() || this.v0.f4()) ? false : true;
        }
        return false;
    }

    public final void d(k27 k27Var) {
        if (k27Var == null || this.c0.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.c0.size(); i++) {
            om6 om6Var = (om6) this.c0.get(i);
            k27 k27Var2 = om6Var.a;
            if (k27Var2.T(k27Var) && k27Var2.K1 == k27Var.K1) {
                if (i == 0) {
                    synchronized (this.b) {
                        om6Var.b.V = true;
                    }
                    return;
                } else {
                    this.a0.remove((om6) this.c0.remove(i));
                    f(true);
                    return;
                }
            }
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ia7 ia7Var;
        k27 k27Var;
        ArrayList arrayList;
        int indexOf;
        int i3 = 0;
        if (i == kk7.X1 || i == kk7.Q1) {
            String str = (String) objArr[0];
            k27 k27Var2 = this.v0;
            if (k27Var2 != null && k27Var2.K1 == i2 && ba4.r(null, k27Var2.F0()).equals(str)) {
                if (this.B0) {
                    this.C0 = true;
                    R(this.v0);
                    return;
                } else {
                    if (this.E0 == null) {
                        try {
                            ba4.G(y6c.t0);
                            this.E0 = g00.a(ba4.M(this.v0.k, false, true));
                            return;
                        } catch (Exception e) {
                            fa4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        if (i == kk7.v) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            ArrayList arrayList2 = (ArrayList) objArr[0];
            k27 k27Var3 = this.v0;
            if (k27Var3 != null && longValue == k27Var3.k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(k27Var3.e1()))) {
                l(true, true, false, false);
            }
            ArrayList arrayList3 = this.f0;
            if (arrayList3 == null || arrayList3.isEmpty() || longValue != ((k27) this.f0.get(0)).k.peer_id.channel_id) {
                return;
            }
            while (i3 < arrayList2.size()) {
                Integer num = (Integer) arrayList2.get(i3);
                k27 k27Var4 = (k27) this.g0.get(num.intValue());
                this.g0.remove(num.intValue());
                if (k27Var4 != null) {
                    this.f0.remove(k27Var4);
                }
                i3++;
            }
            return;
        }
        if (i == kk7.d0) {
            long longValue2 = ((Long) objArr[0]).longValue();
            k27 k27Var5 = this.v0;
            if (k27Var5 == null || k27.B0(k27Var5.k) != longValue2) {
                return;
            }
            l(false, true, false, false);
            return;
        }
        int i4 = kk7.J0;
        int[] iArr = this.c1;
        HashMap hashMap = this.T0;
        ArrayList arrayList4 = this.S0;
        if (i == i4) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            k27 k27Var6 = this.v0;
            if (k27Var6 != null && k27Var6.I3() && k27.B0(this.v0.k) == longValue3 && this.b1 == longValue4 && !this.v0.r1) {
                ArrayList arrayList5 = (ArrayList) objArr[1];
                ArrayList arrayList6 = (ArrayList) objArr[2];
                arrayList4.addAll(0, arrayList5);
                arrayList4.addAll(arrayList6);
                int size = arrayList4.size();
                for (int i5 = 0; i5 < size; i5++) {
                    k27 k27Var7 = (k27) arrayList4.get(i5);
                    hashMap.put(Integer.valueOf(k27Var7.e1()), k27Var7);
                    iArr[0] = Math.min(iArr[0], k27Var7.e1());
                }
                s0();
                if (gba.J0) {
                    b();
                } else {
                    k27 k27Var8 = this.v0;
                    if (k27Var8 != null && (indexOf = arrayList4.indexOf(k27Var8)) >= 0) {
                        this.V0 = indexOf;
                    }
                }
                this.a1 = ConnectionsManager.generateClassGuid();
                return;
            }
            return;
        }
        int i6 = kk7.U;
        int i7 = kk7.K0;
        if (i == i6) {
            if (((Integer) objArr[3]).intValue() != this.a1 || this.v0 == null) {
                return;
            }
            long longValue5 = ((Long) objArr[0]).longValue();
            ((Integer) objArr[4]).getClass();
            ArrayList arrayList7 = (ArrayList) objArr[2];
            char c = longValue5 == this.Z0 ? (char) 1 : (char) 0;
            if (!arrayList7.isEmpty()) {
                this.X0[c] = ((Boolean) objArr[5]).booleanValue();
            }
            int i8 = 0;
            for (int i9 = 0; i9 < arrayList7.size(); i9++) {
                k27 k27Var9 = (k27) arrayList7.get(i9);
                if (!k27Var9.R4() && !hashMap.containsKey(Integer.valueOf(k27Var9.e1()))) {
                    i8++;
                    arrayList4.add(0, k27Var9);
                    hashMap.put(Integer.valueOf(k27Var9.e1()), k27Var9);
                    iArr[c] = Math.min(iArr[c], k27Var9.e1());
                }
            }
            s0();
            int indexOf2 = arrayList4.indexOf(this.v0);
            if (indexOf2 >= 0) {
                this.V0 = indexOf2;
            }
            this.Y0 = false;
            if (gba.J0) {
                b();
            }
            if (i8 != 0) {
                kk7.f(this.v0.K1).k(i7, Integer.valueOf(i8));
                return;
            }
            return;
        }
        if (i == 1) {
            if (((Boolean) objArr[2]).booleanValue() || (arrayList = this.f0) == null || arrayList.isEmpty() || ((Long) objArr[0]).longValue() != k27.B0(((k27) this.f0.get(0)).k)) {
                return;
            }
            ArrayList arrayList8 = (ArrayList) objArr[1];
            while (i3 < arrayList8.size()) {
                k27 k27Var10 = (k27) arrayList8.get(i3);
                if ((k27.Q4(k27Var10.k) || k27Var10.g4()) && !k27Var10.R4() && !k27Var10.f4() && (!this.e0 || (k27Var10.k.media_unread && !k27Var10.N3()))) {
                    this.f0.add(k27Var10);
                    this.g0.put(k27Var10.e1(), k27Var10);
                }
                i3++;
            }
            return;
        }
        if (i == kk7.J4) {
            lbc lbcVar = (lbc) objArr[0];
            if (this.F0 == lbcVar || this.j0 == lbcVar) {
                return;
            }
            k27 k27Var11 = this.v0;
            if (k27Var11 != null && D(k27Var11) && !C() && (k27Var11.I3() || k27.Q4(k27Var11.k))) {
                this.i0 = true;
            }
            Q(k27Var11, true);
            return;
        }
        if (i == kk7.V3 && (ia7Var = this.R0) != null && objArr[0] == ia7Var) {
            int size2 = ia7Var.c.size() - arrayList4.size();
            arrayList4.clear();
            arrayList4.addAll(this.R0.c);
            s0();
            if (gba.J0) {
                b();
            } else {
                k27 k27Var12 = this.v0;
                if (k27Var12 != null) {
                    int indexOf3 = arrayList4.indexOf(k27Var12);
                    if (indexOf3 >= 0) {
                        this.V0 = indexOf3;
                    } else {
                        int i10 = this.V0;
                        if (i10 < 0 || i10 >= arrayList4.size()) {
                            this.V0 = 0;
                        }
                        if (arrayList4.size() == 0) {
                            j();
                        } else {
                            R((k27) arrayList4.get(0));
                        }
                    }
                }
            }
            if (size2 == 0 || (k27Var = this.v0) == null) {
                return;
            }
            kk7.f(k27Var.K1).k(i7, Integer.valueOf(size2));
        }
    }

    public final void e(k27 k27Var) {
        int requestAudioFocus;
        byte b = (k27.Q4(k27Var.k) || k27Var.g4()) ? this.M ? (byte) 3 : (byte) 2 : (byte) 1;
        if (this.V != b) {
            this.V = b;
            if (b == 3) {
                requestAudioFocus = im7.p0.requestAudioFocus(this, 0, 1);
            } else {
                requestAudioFocus = im7.p0.requestAudioFocus(this, 3, (b != 2 || gba.C0) ? 1 : 3);
            }
            if (requestAudioFocus == 1) {
                this.Y = (byte) 2;
            }
        }
    }

    public final void f(boolean z) {
        om6 om6Var;
        if (this.a0.isEmpty()) {
            om6Var = null;
            this.b0 = null;
        } else {
            om6Var = (om6) this.a0.get(0);
            this.b0 = om6Var;
        }
        if (om6Var != null || z) {
            if (VideoEncodingService.e == null) {
                try {
                    a.b.startService(new Intent(a.b, (Class<?>) VideoEncodingService.class));
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            }
            if (z) {
                om6 om6Var2 = w().b0;
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService.b != om6Var2) {
                    if (om6Var2 != null) {
                        videoEncodingService.a(om6Var2);
                    } else {
                        videoEncodingService.stopSelf();
                    }
                }
            }
        }
    }

    public final void g(int i) {
        int i2;
        File M;
        up3 q = up3.q(i);
        int e = a.e();
        if (e == 1) {
            if (!q.O.g || !q.p().d) {
                return;
            }
        } else if (e == 2) {
            if (!q.P.g || !q.o().d) {
                return;
            }
        } else if (!q.N.g || !q.n().d) {
            return;
        }
        ArrayList arrayList = gba.J0 ? this.U0 : this.S0;
        if (arrayList == null || arrayList.size() < 2) {
            return;
        }
        boolean z = this.R0 != null ? !gba.K0 : gba.K0;
        int i3 = this.V0;
        if (z) {
            i2 = i3 + 1;
            if (i2 >= arrayList.size()) {
                i2 = 0;
            }
        } else {
            i2 = i3 - 1;
            if (i2 < 0) {
                i2 = arrayList.size() - 1;
            }
        }
        if (i2 < 0 || i2 >= arrayList.size()) {
            return;
        }
        k27 k27Var = (k27) arrayList.get(i2);
        File file = null;
        if (!TextUtils.isEmpty(k27Var.k.attachPath)) {
            File file2 = new File(k27Var.k.attachPath);
            if (file2.exists()) {
                file = file2;
            }
        }
        if (file != null) {
            M = file;
        } else {
            ba4.G(i);
            M = ba4.M(k27Var.k, false, true);
        }
        M.exists();
        if (M == file || M.exists() || !k27Var.I3()) {
            return;
        }
        ba4.G(i).X(k27Var.F0(), k27Var, 0, k27.Q5(k27Var.k) ? 2 : 0);
    }

    public final boolean g0(k27 k27Var, boolean z, boolean z2, boolean z3) {
        oac oacVar = k27Var != null ? k27Var.r0 : null;
        if (k27Var != null && oacVar != null) {
            ArrayList arrayList = this.c0;
            if (z) {
                if (arrayList.isEmpty()) {
                    new File(k27Var.k.attachPath).delete();
                }
            }
            om6 om6Var = new om6();
            om6Var.a = k27Var;
            om6Var.c = k27Var.K1;
            om6Var.b = oacVar;
            om6Var.d = z3;
            arrayList.add(om6Var);
            if (z2) {
                this.a0.add(om6Var);
                f(false);
            }
            if (arrayList.size() == 1) {
                x0();
            }
            return true;
        }
        return false;
    }

    public native byte[] getWaveform2(short[] sArr, int i);

    public final void h() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - g2) >= 5000) {
                AudioManager audioManager = (AudioManager) a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                int i = this.M ? 0 : 3;
                int streamVolume = audioManager.getStreamVolume(i);
                if (streamVolume == 0) {
                    audioManager.adjustStreamVolume(i, streamVolume, 1);
                    g2 = currentTimeMillis;
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void h0(k27 k27Var, float f) {
        k27 k27Var2 = this.v0;
        if ((this.j0 == null && this.F0 == null) || k27Var == null || k27Var2 == null || !G(k27Var)) {
            return;
        }
        try {
            lbc lbcVar = this.j0;
            if (lbcVar != null) {
                long U = lbcVar.U();
                if (U == -9223372036854775807L) {
                    this.u0 = f;
                } else {
                    k27Var2.b0 = f;
                    long j = (int) (U * f);
                    this.j0.p0(j, false);
                    k27Var2.e0 = j;
                    if (!this.U1) {
                        fo.x(j);
                    }
                }
            } else {
                lbc lbcVar2 = this.F0;
                if (lbcVar2 != null) {
                    lbcVar2.o0((long) (lbcVar2.U() * f));
                    if (!this.U1) {
                        fo.x((long) (this.F0.U() * f));
                    }
                }
            }
            kk7.f(k27Var.K1).k(kk7.h2, Integer.valueOf(k27Var2.e1()), Float.valueOf(f));
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void i(boolean z) {
        File file;
        File file2;
        File file3;
        u20 u20Var;
        u20 u20Var2;
        if (this.I1) {
            al6 al6Var = this.H1;
            if (al6Var != null) {
                gl.r(al6Var);
                this.H1 = null;
            }
            boolean c = (z || (u20Var2 = this.G1) == null) ? false : u20Var2.c();
            if (!c && (u20Var = this.G1) != null) {
                u20Var.a = false;
                ((h30) u20Var.e).b();
            }
            if (c && (file3 = this.k1) != null) {
                s60.b(file3);
            }
            s(!z);
            return;
        }
        this.g1 = null;
        s60.b(this.k1);
        if (z && (file2 = this.k1) != null) {
            try {
                file2.delete();
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        this.k1 = null;
        if (z && (file = this.j1) != null) {
            file.delete();
        }
        this.j1 = null;
        this.y0 = false;
        this.r = false;
        this.P = false;
    }

    public final void j() {
        l(true, true, false, false);
        this.E0 = null;
        this.C0 = false;
        for (int i = 0; i < 4; i++) {
            up3 q = up3.q(i);
            q.b.clear();
            q.c.clear();
            q.d.clear();
            q.e.clear();
            q.f.clear();
            q.h.clear();
            q.G.b();
        }
        this.c0.clear();
        this.d0.clear();
        this.V1 = null;
        this.f0 = null;
        this.g0 = null;
        m();
    }

    public final void j0(boolean z) {
        ix ixVar = this.M0;
        if (ixVar != null) {
            if (z) {
                PipRoundVideoView pipRoundVideoView = this.I0;
                if (pipRoundVideoView != null) {
                    this.J0 = (byte) 2;
                    pipRoundVideoView.a(true);
                    this.I0 = null;
                    return;
                } else {
                    if (ixVar.getParent() == null) {
                        this.O0.addView(this.M0);
                    }
                    this.F0.z0(this.H0);
                    return;
                }
            }
            if (ixVar.getParent() != null) {
                this.J0 = (byte) 1;
                this.O0.removeView(this.M0);
                return;
            }
            if (this.I0 == null) {
                try {
                    PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                    this.I0 = pipRoundVideoView2;
                    pipRoundVideoView2.d(this.K0, new wk6(this, (byte) 4));
                } catch (Exception unused) {
                    this.I0 = null;
                }
            }
            PipRoundVideoView pipRoundVideoView3 = this.I0;
            if (pipRoundVideoView3 != null) {
                this.F0.z0(pipRoundVideoView3.c);
            }
        }
    }

    public final void k(boolean z, boolean z2) {
        l(z, z2, false, false);
    }

    public final void k0(int i) {
        boolean z = gba.J0;
        if (i == 2) {
            gba.J0 = true;
            gba.K0 = false;
        } else if (i == 1) {
            gba.K0 = true;
            gba.J0 = false;
        } else {
            gba.K0 = false;
            gba.J0 = false;
        }
        MediaController w = w();
        k27 k27Var = w.v0;
        if (k27Var != null && k27Var.I3()) {
            w.g(w.v0.K1);
        }
        SharedPreferences.Editor edit = na7.c1().edit();
        edit.putBoolean("shuffleMusic", gba.J0);
        edit.putBoolean("playOrderReversed", gba.K0);
        edit.apply();
        boolean z2 = gba.J0;
        if (z != z2) {
            if (z2) {
                b();
                return;
            }
            k27 k27Var2 = this.v0;
            if (k27Var2 != null) {
                int indexOf = this.S0.indexOf(k27Var2);
                this.V0 = indexOf;
                if (indexOf == -1) {
                    m();
                    l(true, true, false, false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        PipRoundVideoView pipRoundVideoView;
        k27 k27Var;
        int i = kk7.i2;
        if (z2 && Z()) {
            return;
        }
        boolean z6 = false;
        if (this.j0 != null) {
            gm6 gm6Var = this.x0;
            if (gm6Var != null) {
                gm6Var.a();
                this.x0 = null;
            }
            ValueAnimator valueAnimator = this.R1;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.R1.cancel();
            }
            if (fo.w() || !this.j0.c0() || (k27Var = this.v0) == null || k27.Q4(k27Var.k)) {
                try {
                    this.j0.l0();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            } else {
                lbc lbcVar = this.j0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 0.0f);
                ofFloat.addUpdateListener(new pk(this, lbcVar, (byte) 17));
                ofFloat.addListener(new v85(lbcVar, (byte) 16));
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
            this.j0 = null;
            bkb.L1(this.v0);
        } else {
            lbc lbcVar2 = this.F0;
            if (lbcVar2 != null) {
                this.M0 = null;
                this.O0 = null;
                this.Q0 = false;
                this.N0 = false;
                this.H0 = null;
                this.w0 = null;
                if (z4) {
                    PhotoViewer.r0().S2 = this.F0;
                    k27 k27Var2 = this.v0;
                    this.w0 = k27Var2;
                    kk7.f(k27Var2.K1).k(i, this.v0, Boolean.TRUE);
                } else {
                    long S = lbcVar2.S();
                    k27 k27Var3 = this.v0;
                    if (k27Var3 != null && k27.K4(k27Var3.k) && S > 0) {
                        k27 k27Var4 = this.v0;
                        k27Var4.d0 = (int) S;
                        kk7.f(k27Var4.K1).k(i, this.v0, Boolean.FALSE);
                    }
                    this.F0.l0();
                    this.F0 = null;
                }
                try {
                    this.K0.getWindow().clearFlags(128);
                } catch (Exception e3) {
                    fa4.g(e3, true);
                }
                if (this.v0 != null && !z4) {
                    gl.r(this.d1);
                    ba4.G(this.v0.K1).Z(this.v0.F0(), true, false);
                }
            }
        }
        y0();
        this.h0 = false;
        k27 k27Var5 = this.v0;
        if (k27Var5 != null) {
            if (this.B0) {
                ba4.G(k27Var5.K1).f(this.v0.F0());
            }
            k27 k27Var6 = this.v0;
            if (z) {
                k27Var6.F5();
                kk7.f(k27Var6.K1).k(kk7.d2, Integer.valueOf(this.v0.e1()), 0);
            }
            this.v0 = null;
            this.B0 = false;
            if (z) {
                im7.p0.abandonAudioFocus(this);
                this.V = (byte) 0;
                ArrayList arrayList = this.f0;
                int i2 = -1;
                if (arrayList != null) {
                    if (!z3 || (i2 = arrayList.indexOf(k27Var6)) < 0) {
                        this.f0 = null;
                        this.g0 = null;
                    } else {
                        this.f0.remove(i2);
                        this.g0.remove(k27Var6.e1());
                        if (this.f0.isEmpty()) {
                            this.f0 = null;
                            this.g0 = null;
                        }
                    }
                }
                ArrayList arrayList2 = this.f0;
                if (arrayList2 == null || i2 >= arrayList2.size()) {
                    if ((k27.Q4(k27Var6.k) || k27Var6.g4()) && k27Var6.e1() != 0 && this.M && this.s != null && this.O && gba.k(true)) {
                        this.r = true;
                        int currentAccount = this.s.getCurrentAccount();
                        long a = this.s.a();
                        mu1 mu1Var = this.s;
                        k27 k27Var7 = mu1Var.m4;
                        int classGuid = mu1Var.getClassGuid();
                        mu1 mu1Var2 = this.s;
                        j1a Q6 = mu1Var2 != null ? mu1Var2.Q6() : null;
                        mu1 mu1Var3 = this.s;
                        long c7 = mu1Var3 != null ? mu1Var3.c7() : 0L;
                        mu1 mu1Var4 = this.s;
                        w0(currentAccount, a, null, k27Var7, null, classGuid, false, Q6, c7, mu1Var4 != null ? mu1Var4.y5 : null);
                        this.P = true;
                    }
                    z5 = false;
                    kk7.f(k27Var6.K1).k(kk7.e2, Integer.valueOf(k27Var6.e1()), Boolean.valueOf(z2));
                    this.J0 = (byte) 0;
                    PipRoundVideoView pipRoundVideoView2 = this.I0;
                    if (pipRoundVideoView2 != null) {
                        pipRoundVideoView2.a(true);
                        this.I0 = null;
                    }
                } else {
                    k27 k27Var8 = (k27) this.f0.get(i2);
                    R(k27Var8);
                    if (!k27Var8.g4() && (pipRoundVideoView = this.I0) != null) {
                        pipRoundVideoView.a(true);
                        this.I0 = null;
                    }
                    z5 = false;
                    z6 = true;
                    if (z2) {
                        a.b.stopService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
                    }
                }
            } else {
                z5 = false;
            }
            z6 = z5;
            if (z2) {
            }
        } else {
            z5 = false;
        }
        if (!z6 && z3 && !gba.k(true)) {
            mu1 mu1Var5 = this.s;
            z0(mu1Var5, z5, z5);
            this.s = mu1Var5;
        }
        if (!z2 || fo.f() == null) {
            return;
        }
        try {
            ad1 c = ad1.c(fo.f());
            if (c != null) {
                c.b().b(true);
            }
        } catch (Exception e4) {
            fa4.g(e4, true);
        }
    }

    public final void l0(boolean z, float f) {
        float f3;
        String str;
        if (z) {
            if (this.r0 >= 6.0f && f == 1.0f && this.v0 != null) {
                this.j0.f0();
                k27 k27Var = this.v0;
                gl.d3(new dt(this, k27Var, k27Var.b0, (byte) 1), 50L);
            }
            this.r0 = f;
            if (Math.abs(f - 1.0f) > 0.001f) {
                this.t0 = f;
            }
        } else {
            this.q0 = f;
            if (Math.abs(f - 1.0f) > 0.001f) {
                this.s0 = f;
            }
        }
        lbc lbcVar = this.j0;
        if (lbcVar != null) {
            lbcVar.u0(Math.round(f * 10.0f) / 10.0f);
        } else {
            lbc lbcVar2 = this.F0;
            if (lbcVar2 != null) {
                lbcVar2.u0(Math.round(f * 10.0f) / 10.0f);
            }
        }
        SharedPreferences.Editor putFloat = na7.c1().edit().putFloat(z ? "musicPlaybackSpeed" : "playbackSpeed", f);
        if (z) {
            f3 = this.t0;
            str = "fastMusicPlaybackSpeed";
        } else {
            f3 = this.s0;
            str = "fastPlaybackSpeed";
        }
        putFloat.putFloat(str, f3).commit();
        kk7.e().k(kk7.L4, new Object[0]);
        if (this.U1) {
            return;
        }
        fo.B(f);
    }

    public final void m() {
        this.R0 = null;
        this.S0.clear();
        this.T0.clear();
        this.U0.clear();
        this.a1 = 0;
        boolean[] zArr = this.X0;
        zArr[1] = false;
        zArr[0] = false;
        this.Z0 = 0L;
        this.b1 = 0L;
        int[] iArr = this.c1;
        iArr[1] = Integer.MAX_VALUE;
        iArr[0] = Integer.MAX_VALUE;
        this.Y0 = false;
        this.D0 = null;
        this.V1 = null;
    }

    public final void m0() {
        try {
            float f = this.Y != 1 ? 1.0f : 0.2f;
            lbc lbcVar = this.j0;
            if (lbcVar != null) {
                lbcVar.A0(fo.w() ? 0.0f : f * this.Q1);
                return;
            }
            lbc lbcVar2 = this.F0;
            if (lbcVar2 != null) {
                if (fo.w()) {
                    f = 0.0f;
                }
                lbcVar2.A0(f);
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void n(m20 m20Var) {
        TLRPC.TL_document tL_document;
        File file = (File) m20Var.b;
        this.k1 = file;
        long j = m20Var.a;
        this.l1 = j;
        byte[] bArr = (byte[]) m20Var.c;
        String str = null;
        F0(file, j, bArr == null ? null : (byte[]) bArr.clone());
        if (this.C1 == 3) {
            this.L1 = m20Var;
            u20 u20Var = this.G1;
            if (u20Var != null) {
                ((h30) u20Var.e).o();
                u20Var.c = true;
                this.G1 = null;
            }
            X(false);
            i0(false);
            return;
        }
        hq6.d0(this.i1).D1(this.n1, this.o1, null);
        if (this.C1 == 1) {
            x3a f = x3a.f(this.g1, null, file.getAbsolutePath(), this.n1, this.r1, this.s1, null, null, null, null, this.D1, this.E1, 0, this.F1 ? Integer.MAX_VALUE : 0, null, null, false);
            f.R = this.p1;
            f.T = this.q1;
            f.H = this.t1;
            f.K = this.u1;
            f.Q = 0L;
            z3a.B(this.i1).q0(f);
        }
        kk7 f3 = kk7.f(this.i1);
        Integer valueOf = Integer.valueOf(this.h1);
        if (this.C1 == 2) {
            TLRPC.TL_document tL_document2 = this.g1;
            str = file.getAbsolutePath();
            tL_document = tL_document2;
        } else {
            tL_document = null;
        }
        f3.k(kk7.r2, valueOf, tL_document, str);
        s(true);
    }

    public final boolean n0(ArrayList arrayList, k27 k27Var, long j, boolean z, km6 km6Var, long j2) {
        HashMap hashMap;
        k27 k27Var2 = this.v0;
        ArrayList arrayList2 = this.S0;
        if (k27Var2 == k27Var) {
            int indexOf = arrayList2.indexOf(k27Var);
            if (indexOf >= 0) {
                this.V0 = indexOf;
            }
            return R(k27Var);
        }
        this.W0 = !z;
        this.Z0 = j;
        this.C0 = !arrayList2.isEmpty();
        m();
        this.D0 = km6Var;
        this.b1 = j2;
        boolean z2 = false;
        if (!arrayList.isEmpty() && cf3.B(k27.B0(((k27) arrayList.get(0)).k))) {
            z2 = true;
        }
        int size = arrayList.size() - 1;
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i2 = TLObject.FLAG_31;
        while (true) {
            hashMap = this.T0;
            if (size < 0) {
                break;
            }
            k27 k27Var3 = (k27) arrayList.get(size);
            if (k27Var3.I3()) {
                int e1 = k27Var3.e1();
                if (e1 > 0 || z2) {
                    i = Math.min(i, e1);
                    i2 = Math.max(i2, e1);
                }
                arrayList2.add(k27Var3);
                hashMap.put(Integer.valueOf(e1), k27Var3);
            }
            size--;
        }
        s0();
        int indexOf2 = arrayList2.indexOf(k27Var);
        this.V0 = indexOf2;
        if (indexOf2 == -1) {
            m();
            this.V0 = arrayList2.size();
            arrayList2.add(k27Var);
            hashMap.put(Integer.valueOf(k27Var.e1()), k27Var);
        }
        if (k27Var.I3() && !k27Var.r1) {
            if (gba.J0) {
                b();
            }
            if (z) {
                if (this.D0 == null) {
                    final hq6 d0 = hq6.d0(k27Var.K1);
                    final long B0 = k27.B0(k27Var.k);
                    final long j3 = this.b1;
                    final long j4 = i;
                    final long j5 = i2;
                    d0.getMessagesStorage().a.c(new Runnable() { // from class: ip6
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x015d A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Type inference failed for: r1v10 */
                        /* JADX WARN: Type inference failed for: r1v11 */
                        /* JADX WARN: Type inference failed for: r1v4 */
                        /* JADX WARN: Type inference failed for: r1v5, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r1v6 */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            ArrayList arrayList3;
                            String str;
                            ?? r1;
                            SQLiteCursor sQLiteCursor;
                            boolean z3;
                            SQLiteCursor sQLiteCursor2;
                            ip6 ip6Var = this;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            int i3 = 0;
                            while (true) {
                                hq6 hq6Var = hq6.this;
                                long j6 = j3;
                                long j7 = B0;
                                if (i3 >= 2) {
                                    break;
                                }
                                ArrayList arrayList6 = i3 == 0 ? arrayList4 : arrayList5;
                                long j8 = j4;
                                long j9 = j5;
                                int i4 = i3;
                                if (j6 != 0) {
                                    try {
                                        SQLiteDatabase sQLiteDatabase = hq6Var.getMessagesStorage().b;
                                        Locale locale = Locale.US;
                                        if (i4 == 0) {
                                            str = "<";
                                        } else {
                                            str = ">";
                                            j8 = j9;
                                        }
                                        arrayList3 = arrayList4;
                                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_topics WHERE uid = " + j7 + " AND topic_id = " + j6 + " AND mid " + str + " " + j8 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                    } catch (Exception e) {
                                        e = e;
                                        arrayList3 = arrayList4;
                                        fa4.g(e, true);
                                        gl.c3(new dt4(hq6Var, j7, arrayList3, arrayList5, j6));
                                    }
                                } else {
                                    arrayList3 = arrayList4;
                                    if (i4 == 0) {
                                        if (cf3.B(j7)) {
                                            SQLiteDatabase sQLiteDatabase2 = hq6Var.getMessagesStorage().b;
                                            Locale locale2 = Locale.US;
                                            sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j7 + " AND mid > " + j8 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        } else {
                                            SQLiteDatabase sQLiteDatabase3 = hq6Var.getMessagesStorage().b;
                                            Locale locale3 = Locale.US;
                                            sQLiteCursor2 = sQLiteDatabase3.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j7 + " AND mid < " + j8 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        }
                                    } else if (cf3.B(j7)) {
                                        SQLiteDatabase sQLiteDatabase4 = hq6Var.getMessagesStorage().b;
                                        Locale locale4 = Locale.US;
                                        r1 = 0;
                                        sQLiteCursor = sQLiteDatabase4.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j7 + " AND mid < " + j9 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        while (sQLiteCursor.next()) {
                                            try {
                                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(r1);
                                                if (byteBufferValue != 0) {
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r1), r1);
                                                    TLdeserialize.readAttachPath(byteBufferValue, hq6Var.getUserConfig().n);
                                                    byteBufferValue.reuse();
                                                    if (k27.K3(TLdeserialize)) {
                                                        TLdeserialize.id = sQLiteCursor.intValue(1);
                                                        TLdeserialize.dialog_id = j7;
                                                        z3 = false;
                                                        arrayList6.add(0, new k27(hq6Var.currentAccount, TLdeserialize, false, true));
                                                    } else {
                                                        z3 = false;
                                                    }
                                                } else {
                                                    z3 = r1;
                                                }
                                                r1 = z3;
                                            } catch (Exception e3) {
                                                e = e3;
                                                fa4.g(e, true);
                                                gl.c3(new dt4(hq6Var, j7, arrayList3, arrayList5, j6));
                                            }
                                        }
                                        sQLiteCursor.dispose();
                                        i3 = i4 + 1;
                                        ip6Var = this;
                                        arrayList4 = arrayList3;
                                    } else {
                                        SQLiteDatabase sQLiteDatabase5 = hq6Var.getMessagesStorage().b;
                                        Locale locale5 = Locale.US;
                                        sQLiteCursor2 = sQLiteDatabase5.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j7 + " AND mid > " + j9 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                    }
                                }
                                r1 = 0;
                                sQLiteCursor = sQLiteCursor2;
                                while (sQLiteCursor.next()) {
                                }
                                sQLiteCursor.dispose();
                                i3 = i4 + 1;
                                ip6Var = this;
                                arrayList4 = arrayList3;
                                gl.c3(new dt4(hq6Var, j7, arrayList3, arrayList5, j6));
                            }
                            arrayList3 = arrayList4;
                            gl.c3(new dt4(hq6Var, j7, arrayList3, arrayList5, j6));
                        }
                    });
                } else {
                    this.a1 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return R(k27Var);
    }

    public final void o0(TextureView textureView, ix ixVar, FrameLayout frameLayout, boolean z) {
        if (textureView != null) {
            if (!z && this.H0 == textureView) {
                this.J0 = (byte) 1;
                this.H0 = null;
                this.M0 = null;
                this.O0 = null;
                return;
            }
            lbc lbcVar = this.F0;
            if (lbcVar == null || textureView == this.H0) {
                return;
            }
            this.N0 = ixVar != null && ixVar.d;
            this.H0 = textureView;
            PipRoundVideoView pipRoundVideoView = this.I0;
            if (pipRoundVideoView != null) {
                lbcVar.z0(pipRoundVideoView.c);
            } else {
                lbcVar.z0(textureView);
            }
            this.M0 = ixVar;
            this.O0 = frameLayout;
            if (!this.Q0 || ixVar == null) {
                return;
            }
            ixVar.a(this.P0, 0);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        gl.c3(new sm3((Object) this, i, (byte) 18));
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x03ca  */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSensorChanged(SensorEvent sensorEvent) {
        long j;
        byte b;
        boolean z;
        boolean z2;
        byte b3;
        boolean z3;
        ArrayList arrayList;
        k27 k27Var;
        if (this.Q && VoIPService.getSharedInstance() == null) {
            if (sensorEvent.sensor.getType() == 8) {
                if (w01.a) {
                    fa4.b("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f = this.L;
                float f3 = sensorEvent.values[0];
                if (f != f3) {
                    this.K = true;
                }
                this.L = f3;
                if (this.K) {
                    this.J = f3 < 5.0f && f3 != this.e.getMaximumRange();
                }
                j = 0;
                z = 1;
                b = 2;
            } else {
                Sensor sensor = sensorEvent.sensor;
                if (sensor == this.f) {
                    double d = this.I == 0 ? 0.9800000190734863d : 1.0d / (((sensorEvent.timestamp - r2) / 1.0E9d) + 1.0d);
                    this.I = sensorEvent.timestamp;
                    float[] fArr = this.S;
                    double d3 = 1.0d - d;
                    float[] fArr2 = sensorEvent.values;
                    j = 0;
                    float f4 = (float) ((fArr2[0] * d3) + (fArr[0] * d));
                    fArr[0] = f4;
                    z = 1;
                    b = 2;
                    float f5 = (float) ((fArr2[1] * d3) + (fArr[1] * d));
                    fArr[1] = f5;
                    float f6 = (float) ((d3 * fArr2[2]) + (d * fArr[2]));
                    fArr[2] = f6;
                    float[] fArr3 = this.T;
                    fArr3[0] = (fArr2[0] * 0.19999999f) + (f4 * 0.8f);
                    fArr3[1] = (fArr2[1] * 0.19999999f) + (f5 * 0.8f);
                    fArr3[2] = (fArr2[2] * 0.19999999f) + (f6 * 0.8f);
                    float[] fArr4 = this.U;
                    fArr4[0] = fArr2[0] - fArr[0];
                    fArr4[1] = fArr2[1] - fArr[1];
                    fArr4[2] = fArr2[2] - fArr[2];
                } else {
                    j = 0;
                    boolean z4 = true;
                    b = 2;
                    if (sensor == this.h) {
                        float[] fArr5 = this.U;
                        float[] fArr6 = sensorEvent.values;
                        fArr5[0] = fArr6[0];
                        fArr5[1] = fArr6[1];
                        fArr5[2] = fArr6[2];
                        z = z4;
                    } else {
                        z = z4;
                        if (sensor == this.n) {
                            float[] fArr7 = this.T;
                            float[] fArr8 = this.S;
                            float[] fArr9 = sensorEvent.values;
                            float f7 = fArr9[0];
                            fArr8[0] = f7;
                            fArr7[0] = f7;
                            float f8 = fArr9[1];
                            fArr8[1] = f8;
                            fArr7[1] = f8;
                            float f9 = fArr9[2];
                            fArr8[2] = f9;
                            fArr7[2] = f9;
                            z = z4;
                        }
                    }
                }
            }
            Sensor sensor2 = sensorEvent.sensor;
            if (sensor2 == this.h || sensor2 == this.n || sensor2 == this.f) {
                float[] fArr10 = this.S;
                float f10 = fArr10[0];
                float[] fArr11 = this.U;
                float f11 = (fArr10[b] * fArr11[b]) + (fArr10[z] * fArr11[z]) + (f10 * fArr11[0]);
                int i = this.F;
                if (i != 6 && ((f11 > 0.0f && this.R > 0.0f) || (f11 < 0.0f && this.R < 0.0f))) {
                    if (f11 > 0.0f) {
                        z2 = f11 > 15.0f ? z : false;
                        b3 = z;
                    } else {
                        z2 = f11 < -15.0f ? z : false;
                        b3 = b;
                    }
                    byte b4 = this.E;
                    if (b4 != 0 && b4 != b3) {
                        int i2 = this.y;
                        if (i2 != 6 || !z2) {
                            if (!z2) {
                                this.G++;
                            }
                            if (this.G == 10 || i2 != 6 || i != 0) {
                                this.y = 0;
                                this.E = (byte) 0;
                                this.F = 0;
                                this.G = 0;
                            }
                        } else if (i < 6) {
                            int i3 = i + 1;
                            this.F = i3;
                            if (i3 == 6) {
                                this.y = 0;
                                this.E = (byte) 0;
                                this.G = 0;
                                this.H = System.currentTimeMillis();
                                boolean z5 = w01.a;
                            }
                        }
                    } else if (z2 && i == 0 && (b4 == 0 || b4 == b3)) {
                        int i4 = this.y;
                        if (i4 < 6 && !this.J) {
                            this.E = b3;
                            int i5 = i4 + 1;
                            this.y = i5;
                            if (i5 == 6) {
                                this.G = 0;
                            }
                        }
                    } else {
                        if (!z2) {
                            this.G++;
                        }
                        if (b4 != b3 || this.G == 10 || this.y != 6 || i != 0) {
                            this.F = 0;
                            this.y = 0;
                            this.E = (byte) 0;
                            this.G = 0;
                        }
                    }
                }
                this.R = f11;
                float[] fArr12 = this.T;
                this.w = (fArr12[z] <= 2.5f || Math.abs(fArr12[b]) >= 4.0f || Math.abs(this.T[0]) <= 1.5f) ? false : z;
            }
            if (this.F == 6 || this.w) {
                this.x = System.currentTimeMillis();
            }
            boolean z6 = (this.y0 || this.v0 != null || !gba.k(z) || !a.w || this.N || !this.O || this.s == null || this.X) ? false : z;
            boolean z7 = (gba.k(false) && (k27Var = this.v0) != null && (k27.Q4(k27Var.k) || this.v0.g4())) ? z : false;
            boolean z8 = this.J;
            boolean z9 = (this.F == 6 || this.w || System.currentTimeMillis() - this.x < 60) ? z : false;
            boolean z10 = (this.M || this.r) ? z : false;
            boolean z11 = ((z9 || z10) && !t() && !VoIPService.isAnyKindOfCallActive() && (z6 || z7) && !PhotoViewer.r0().V0()) ? z : false;
            PowerManager.WakeLock wakeLock = this.d;
            if (wakeLock != null) {
                if (wakeLock.isHeld()) {
                    if (!z11) {
                        if (w01.a) {
                            fa4.b("wake lock releasing (proximityDetected=" + z8 + ", accelerometerDetected=" + z9 + ", alreadyPlaying=" + z10 + ")");
                        }
                        this.d.release();
                    }
                } else if (z11) {
                    if (w01.a) {
                        fa4.b("wake lock acquiring (proximityDetected=" + z8 + ", accelerometerDetected=" + z9 + ", alreadyPlaying=" + z10 + ")");
                    }
                    this.d.acquire();
                }
            }
            if (this.J) {
                if (z11) {
                    if (z6 && this.M1 == null) {
                        if (!this.r) {
                            if (w01.a) {
                                fa4.b("start record");
                            }
                            this.M = z;
                            if (this.g1 == null) {
                                mu1 mu1Var = this.s;
                                ArrayList arrayList2 = mu1Var.M6;
                                ar1 ar1Var = mu1Var.a0;
                                if (ar1Var == null || !ar1Var.T0()) {
                                    int size = arrayList2.size() - 1;
                                    while (true) {
                                        if (size >= 0) {
                                            k27 k27Var2 = (k27) arrayList2.get(size);
                                            if ((k27.Q4(k27Var2.k) || k27Var2.g4()) && k27Var2.k.media_unread && !k27Var2.N3()) {
                                                MediaController w = w();
                                                if (w().R(k27Var2)) {
                                                    z3 = true;
                                                    arrayList = mu1Var.c6(k27Var2, true);
                                                } else {
                                                    z3 = true;
                                                    arrayList = null;
                                                }
                                                w.q0(arrayList, z3);
                                            } else {
                                                size--;
                                            }
                                        } else if (mu1Var.getParentActivity() != null && mu1Var.getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                            mu1Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                                        }
                                    }
                                }
                                if (this.M) {
                                    p0();
                                }
                            }
                            this.r = true;
                            this.M = false;
                            V(true);
                            if (this.M) {
                            }
                        }
                    } else if (z7 && !this.M) {
                        if (w01.a) {
                            fa4.b("start listen");
                        }
                        p0();
                        t0(false);
                    }
                    this.F = 0;
                    this.y = 0;
                    this.E = (byte) 0;
                    this.G = 0;
                } else if ((this.f == null || this.h == null) && this.n == null && !VoIPService.isAnyKindOfCallActive()) {
                    if (this.v0 != null && !a.x && z7 && !this.M && !this.y0 && !t()) {
                        if (w01.a) {
                            fa4.b("start listen by proximity only");
                        }
                        p0();
                        t0(false);
                    }
                }
                if (this.H == j && this.F == 6 && Math.abs(System.currentTimeMillis() - this.H) > 1000) {
                    this.F = 0;
                    this.y = 0;
                    this.E = (byte) 0;
                    this.G = 0;
                    this.H = j;
                    return;
                }
                return;
            }
            if (!this.J && !this.y0) {
                if (this.r) {
                    if (w01.a) {
                        fa4.b("stop record");
                    }
                    V(false);
                    this.r = false;
                    this.P = false;
                } else if (this.M) {
                    if (w01.a) {
                        fa4.b("stop listen");
                    }
                    this.M = false;
                    t0(true);
                    this.P = false;
                }
            }
            if (this.H == j) {
            }
        }
    }

    public final void p0() {
        this.M = true;
        AudioManager audioManager = im7.p0;
        audioManager.setBluetoothScoOn(false);
        audioManager.setSpeakerphoneOn(false);
    }

    public final void q0(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
        this.f0 = arrayList2;
        if (arrayList2 != null) {
            this.e0 = z;
            this.g0 = new SparseArray();
            for (int i = 0; i < this.f0.size(); i++) {
                k27 k27Var = (k27) this.f0.get(i);
                this.g0.put(k27Var.e1(), k27Var);
            }
        }
    }

    public final void s(boolean z) {
        File file;
        X(false);
        i0(false);
        u20 u20Var = this.G1;
        if (u20Var != null) {
            ((h30) u20Var.e).o();
            u20Var.c = true;
            this.G1 = null;
        }
        if (!z && (file = this.k1) != null) {
            s60.b(file);
            this.k1.delete();
        }
        Y();
        this.y0 = false;
        this.r = false;
        this.P = false;
    }

    public final void s0() {
        Collections.sort(this.S0, new el6((byte) 1));
    }

    public final void t0(boolean z) {
        k27 k27Var = this.v0;
        if (k27Var != null) {
            kk7.f(k27Var.K1).k(kk7.t2, Boolean.valueOf(this.M));
            lbc lbcVar = this.F0;
            if (lbcVar != null) {
                lbcVar.w0(this.M ? 0 : 3);
                if (z) {
                    Q(this.v0, true);
                    return;
                }
                if (this.F0.S() < 1000) {
                    this.F0.o0(0L);
                }
                this.F0.g0();
                return;
            }
            lbc lbcVar2 = this.j0;
            boolean z2 = lbcVar2 != null;
            k27 k27Var2 = this.v0;
            float f = k27Var2.b0;
            int i = k27Var2.j0;
            if (z || lbcVar2 == null || !lbcVar2.c0() || i * f > 1.0f) {
                k27Var2.b0 = f;
            } else {
                k27Var2.b0 = 0.0f;
            }
            l(false, true, false, false);
            R(k27Var2);
            if (z) {
                if (z2) {
                    gl.d3(new oh6((Object) this, (Object) k27Var2, (byte) 2), 100L);
                } else {
                    Q(k27Var2, true);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b1  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [g00] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final yg2 u() {
        FileOutputStream fileOutputStream;
        vg2 vg2Var;
        vg2 vg2Var2;
        ?? r11;
        k27 k27Var = this.v0;
        FileOutputStream fileOutputStream2 = null;
        String str = null;
        if (k27Var != null) {
            ?? r2 = 1;
            r2 = 1;
            String y1 = k27Var.y1(true);
            String w1 = this.v0.w1(true);
            TLRPC.Document F0 = this.v0.F0();
            if (this.v0.g4() || k27.K4(this.v0.k) || this.v0.I3()) {
                k27 k27Var2 = this.v0;
                File file = (!k27Var2.y0 || k27Var2.k == null) ? null : new File(this.v0.k.attachPath);
                if (file == null || !file.exists()) {
                    ba4.G(this.v0.K1);
                    file = ba4.M(this.v0.k, false, true);
                }
                if (file != null && file.exists()) {
                    String t1 = this.v0.t1();
                    Uri parse = Uri.parse("file://" + file.getAbsolutePath());
                    ir6 ir6Var = new ir6(0);
                    g00 g00Var = this.E0;
                    if (g00Var != null) {
                        if (!TextUtils.isEmpty(g00Var.c)) {
                            ir6Var.b("com.google.android.gms.cast.metadata.TITLE", this.E0.c);
                        }
                        if (!TextUtils.isEmpty(this.E0.d)) {
                            ir6Var.b("com.google.android.gms.cast.metadata.ARTIST", this.E0.d);
                        }
                        if (!TextUtils.isEmpty(this.E0.f)) {
                            ir6Var.b("com.google.android.gms.cast.metadata.ALBUM_TITLE", this.E0.f);
                        }
                        if (!TextUtils.isEmpty(this.E0.e)) {
                            ir6Var.b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", this.E0.e);
                        }
                        if (!TextUtils.isEmpty(this.E0.m)) {
                            ir6Var.b("com.google.android.gms.cast.metadata.COMPOSER", this.E0.m);
                        }
                        short s = this.E0.k;
                        Bundle bundle = ir6Var.b;
                        if (s != 0) {
                            r11 = "com.google.android.gms.cast.metadata.DISC_NUMBER";
                            ir6.c(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", s);
                        }
                        short s2 = this.E0.j;
                        FileOutputStream fileOutputStream3 = r11;
                        if (s2 != 0) {
                            ir6.c(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", s2);
                            fileOutputStream3 = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
                        }
                        g00 g00Var2 = this.E0;
                        if (g00Var2.o != null) {
                            File file2 = g00Var2.q;
                            if (file2 == null || !file2.exists()) {
                                file2 = f4b.w(y6c.t0, "jpg");
                                try {
                                    try {
                                        Bitmap bitmap = this.E0.o;
                                        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                                        fileOutputStream = new FileOutputStream(file2);
                                        try {
                                            bitmap.compress(compressFormat, 80, fileOutputStream);
                                            try {
                                                fileOutputStream.close();
                                                fileOutputStream3 = fileOutputStream;
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                fileOutputStream3 = fileOutputStream;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            fa4.g(e, true);
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception e4) {
                                                    fa4.g(e4, true);
                                                }
                                            }
                                            file2 = null;
                                            fileOutputStream3 = fileOutputStream;
                                            r2 = this.E0;
                                            r2.q = file2;
                                            if (file2 != null) {
                                                mv6 mv6Var = (mv6) tg2.N().b;
                                                vg2Var = (vg2) mv6Var.b;
                                                if (vg2Var != null) {
                                                }
                                                str = "/file" + Utilities.c.nextLong();
                                                vg2Var2 = (vg2) mv6Var.b;
                                                if (vg2Var2 == null) {
                                                }
                                                vg2Var2.k(file2, str);
                                                ir6Var.a.add(new vsc(Uri.parse(vg2.i(vg2.h(), str)), 0, 0));
                                            }
                                            wg2 wg2Var = new wg2(t1, parse, "/player_" + this.v0.e1());
                                            wg2Var.e = y1;
                                            wg2Var.f = w1;
                                            wg2Var.h = ir6Var;
                                            return new yg2(new xg2(wg2Var));
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream2 = fileOutputStream3;
                                        if (fileOutputStream2 != null) {
                                            try {
                                                fileOutputStream2.close();
                                            } catch (Exception e5) {
                                                fa4.g(e5, r2);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    fileOutputStream = null;
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (fileOutputStream2 != null) {
                                    }
                                    throw th;
                                }
                                r2 = this.E0;
                                r2.q = file2;
                            }
                            if (file2 != null && file2.exists()) {
                                mv6 mv6Var2 = (mv6) tg2.N().b;
                                vg2Var = (vg2) mv6Var2.b;
                                if (vg2Var != null) {
                                    Pair pair = vg2Var.i;
                                    if ((pair == null ? null : (File) pair.second) != null) {
                                        if (TextUtils.equals((pair == null ? null : (File) pair.second).getAbsolutePath(), file2.getAbsolutePath())) {
                                            Pair pair2 = ((vg2) mv6Var2.b).i;
                                            if (pair2 != null) {
                                                str = (String) pair2.first;
                                            }
                                            ir6Var.a.add(new vsc(Uri.parse(vg2.i(vg2.h(), str)), 0, 0));
                                        }
                                    }
                                }
                                str = "/file" + Utilities.c.nextLong();
                                vg2Var2 = (vg2) mv6Var2.b;
                                if (vg2Var2 == null) {
                                    vg2Var2 = new vg2();
                                    mv6Var2.b = vg2Var2;
                                }
                                vg2Var2.k(file2, str);
                                ir6Var.a.add(new vsc(Uri.parse(vg2.i(vg2.h(), str)), 0, 0));
                            }
                        }
                    }
                    wg2 wg2Var2 = new wg2(t1, parse, "/player_" + this.v0.e1());
                    wg2Var2.e = y1;
                    wg2Var2.f = w1;
                    wg2Var2.h = ir6Var;
                    return new yg2(new xg2(wg2Var2));
                }
            }
            lbc lbcVar = this.F0;
            if (lbcVar != null) {
                return lbcVar.Q(ls6.p(new StringBuilder(), F0 != null ? F0.id : this.v0.e1(), ""), y1, w1);
            }
            lbc lbcVar2 = this.j0;
            if (lbcVar2 != null) {
                return lbcVar2.Q(ls6.p(new StringBuilder(), F0 != null ? F0.id : this.v0.e1(), ""), y1, w1);
            }
        }
        return null;
    }

    public final void u0(k27 k27Var) {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
            k27Var.S0();
            Timer timer2 = new Timer();
            this.z0 = timer2;
            timer2.schedule(new ox2(this, k27Var, (byte) 2), 0L, 17L);
        }
    }

    public final void v0(mu1 mu1Var) {
        if (mu1Var != null) {
            if ((this.f == null && this.n == null) || this.e == null) {
                return;
            }
            if (!gba.k(false)) {
                k27 k27Var = this.v0;
                if (k27Var == null) {
                    return;
                }
                if (!k27.Q4(k27Var.k) && !this.v0.g4()) {
                    return;
                }
            }
            this.s = mu1Var;
            if (this.Q) {
                return;
            }
            float[] fArr = this.S;
            fArr[2] = 0.0f;
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
            float[] fArr2 = this.U;
            fArr2[2] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[0] = 0.0f;
            float[] fArr3 = this.T;
            fArr3[2] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[0] = 0.0f;
            this.I = 0L;
            this.R = 0.0f;
            this.y = 0;
            this.E = (byte) 0;
            this.G = 0;
            this.F = 0;
            Utilities.e.c(new wk6(this, (byte) 3));
            this.Q = true;
        }
    }

    public final void w0(int i, long j, k27 k27Var, k27 k27Var2, TL_stories.StoryItem storyItem, int i2, boolean z, j1a j1aVar, long j2, u47 u47Var) {
        k27 k27Var3 = this.v0;
        boolean z2 = (k27Var3 == null || !D(k27Var3) || C()) ? false : true;
        this.y0 = z;
        X(true);
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.I1 && !W()) {
            gl.c3(new gs2(i, i2, (byte) 5));
            return;
        }
        if (!r0(i)) {
            if (w01.a) {
                fa4.b("AudioRecorder legacy selected: account=" + i + ", dialog=" + j + ", guid=" + i2);
            }
            xk6 xk6Var = new xk6(this, i, i2, j, j2, u47Var, k27Var2, k27Var, storyItem, j1aVar);
            this.M1 = xk6Var;
            this.N1.d(xk6Var, z2 ? 500L : 50L);
            return;
        }
        this.I1 = true;
        this.J1 = false;
        this.K1 = false;
        this.i1 = i;
        this.h1 = i2;
        this.n1 = j;
        this.p1 = j2;
        this.q1 = u47Var;
        this.o1 = k27Var2 == null ? 0L : k27.b2(i, k27Var2.k, false, false);
        this.r1 = k27Var;
        this.s1 = k27Var2;
        this.t1 = storyItem;
        this.u1 = j1aVar;
        this.j1 = null;
        this.k1 = null;
        this.l1 = 0L;
        this.m1 = 0;
        this.w1 = 0L;
        this.C1 = (byte) 0;
        al6 al6Var = new al6(this, i, j, i2, (byte) 0);
        this.H1 = al6Var;
        gl.d3(al6Var, z2 ? 500L : 50L);
    }

    public final float x(boolean z) {
        return z ? this.r0 : this.q0;
    }

    public final void x0() {
        if (this.c0.isEmpty()) {
            return;
        }
        om6 om6Var = (om6) this.c0.get(0);
        oac oacVar = om6Var.b;
        synchronized (this.b) {
            if (oacVar != null) {
                oacVar.V = false;
            }
        }
        new Thread(new vl6(om6Var, (byte) 3)).start();
    }

    public final long y(k27 k27Var) {
        k27 k27Var2 = this.v0;
        if ((this.j0 != null || this.F0 != null) && k27Var != null && k27Var2 != null && G(k27Var)) {
            try {
                lbc lbcVar = this.j0;
                if (lbcVar != null) {
                    return lbcVar.S();
                }
                lbc lbcVar2 = this.F0;
                if (lbcVar2 != null) {
                    return lbcVar2.S();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void y0() {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e) {
                    fa4.g(e, true);
                }
            }
        }
    }

    public final void z0(mu1 mu1Var, boolean z, boolean z2) {
        if (this.P) {
            this.P = false;
            return;
        }
        if (z2) {
            if (this.g1 == null || F()) {
                A0(z ? 2 : 0, 0, false, false);
            } else {
                C0(false);
            }
        }
        if (!this.Q || this.P) {
            return;
        }
        if ((this.f == null && this.n == null) || this.e == null || this.s != mu1Var) {
            return;
        }
        this.s = null;
        this.Q = false;
        this.w = false;
        this.J = false;
        this.r = false;
        this.M = false;
        Utilities.e.c(new wk6(this, (byte) 5));
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.d.release();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
