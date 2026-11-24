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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class MediaController implements AudioManager.OnAudioFocusChangeListener, jm7, SensorEventListener {
    public static final String[] W1;
    public static final String[] X1;
    public static final ConcurrentHashMap Y1;
    public static Runnable Z1;
    public static yn6 a2;
    public static yn6 b2;
    public static ArrayList c2;
    public static ArrayList d2;
    public static qu e2;
    public static volatile MediaController f2;
    public static long g2;
    public static boolean h2;
    public boolean B0;
    public boolean C0;
    public byte C1;
    public ko6 D0;
    public boolean D1;
    public byte E;
    public g10 E0;
    public int E1;
    public int F;
    public ndc F0;
    public boolean F1;
    public int G;
    public boolean G0;
    public u30 G1;
    public long H;
    public TextureView H0;
    public dn6 H1;
    public PipRoundVideoView I0;
    public boolean I1;
    public boolean J;
    public byte J0;
    public boolean J1;
    public boolean K;
    public LaunchActivity K0;
    public boolean K1;
    public ViewGroup L0;
    public m30 L1;
    public boolean M;
    public jy M0;
    public an6 M1;
    public boolean N;
    public boolean N0;
    public final mp3 N1;
    public boolean O;
    public FrameLayout O0;
    public final mp3 O1;
    public boolean P;
    public float P0;
    public boolean Q;
    public boolean Q0;
    public float Q1;
    public float R;
    public jc7 R0;
    public ValueAnimator R1;
    public sw T1;
    public boolean U1;
    public byte V;
    public int V0;
    public mo6 V1;
    public boolean W;
    public boolean W0;
    public boolean X;
    public boolean Y0;
    public boolean Z;
    public long Z0;
    public final z00 a;
    public int a1;
    public oo6 b0;
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
    public v67 q1;
    public boolean r;
    public k47 r1;
    public yv1 s;
    public k47 s1;
    public TL_stories.StoryItem t1;
    public float u0;
    public l3a u1;
    public k47 v0;
    public boolean w;
    public k47 w0;
    public long w1;
    public long x;
    public ho6 x0;
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
    public ndc j0 = null;
    public ndc k0 = null;
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
    public final tn6 d1 = new tn6(this);
    public int h1 = -1;
    public short[] v1 = new short[1024];
    public final Object x1 = new Object();
    public final ArrayList y1 = new ArrayList();
    public int A1 = 1280;
    public char B1 = 48000;
    public final o04 P1 = new o04(this, 24);
    public final af0 S1 = new af0(this, 8);

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
        this.a = new z00(this, b);
        Handler handler = null;
        byte b3 = 2;
        mp3 mp3Var = new mp3("recordQueue");
        this.N1 = mp3Var;
        mp3Var.setPriority(10);
        mp3 mp3Var2 = new mp3("fileEncodingQueue");
        this.O1 = mp3Var2;
        mp3Var2.setPriority(10);
        mp3Var.c(new zm6(this, (byte) 0));
        Utilities.e.c(new zm6(this, b));
        this.z1 = ByteBuffer.allocateDirect(1920);
        gm.c3(new zm6(this, b3));
        ContentResolver contentResolver = a.b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new pe1(handler, b));
        } catch (Exception e) {
            fc4.g(e, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new pe1(handler, b3));
        } catch (Exception e3) {
            fc4.g(e3, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new pe1(handler, b));
        } catch (Exception e4) {
            fc4.g(e4, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new pe1(handler, b3));
        } catch (Exception e5) {
            fc4.g(e5, true);
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
                                fc4.g(e, true);
                                return true;
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                fc4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    fc4.g(e5, true);
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
                                    fc4.g(e, true);
                                    return true;
                                }
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                fc4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    fc4.g(e5, true);
                }
            }
            throw th;
        }
    }

    public static void H0(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String n = wi8.n(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = n.getBytes("UTF-8");
        int length = bytes.length + bytes2.length + 2;
        if (length > 65535) {
            wa3.d(hg9.j(length, "XMP segment too large: "));
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read();
            int read2 = fileInputStream.read();
            if (read != 255 || read2 != 216) {
                throw new IOException("Not a JPEG: " + file);
            }
            outputStream.write(nm7.d4);
            outputStream.write(nm7.s3);
            outputStream.write(nm7.d4);
            outputStream.write(nm7.B3);
            outputStream.write((length >> 8) & nm7.d4);
            outputStream.write(length & nm7.d4);
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
        Thread thread = new Thread(new fx0(i, (byte) 6));
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
                int C = (int) (((int) mlb.C(f, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i5 * i4)));
                return i3 >= C ? min : min > i6 ? i6 : Math.max(min, C);
            }
            i6 = 2600000;
        }
        f = 1.0f;
        int min2 = (int) (((int) (i3 / Math.min(i / i4, i2 / i5))) * f3);
        int C2 = (int) (((int) mlb.C(f, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i5 * i4)));
        if (i3 >= C2) {
        }
    }

    public static void c0(String str, String str2, Context context, qac qacVar) {
        he heVar;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            return;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists() || !file2.exists()) {
            d0(str, context, 0, null, null, qacVar);
            return;
        }
        if (gm.G1(Uri.fromFile(file), 0) || gm.G1(Uri.fromFile(file2), 0)) {
            return;
        }
        byte b = 1;
        boolean[] zArr = {false};
        boolean[] zArr2 = new boolean[1];
        try {
            he heVar2 = new he(2, null, context);
            heVar2.m(jb6.M0(2131748536, null));
            heVar2.setCanceledOnTouchOutside(false);
            heVar2.setCancelable(true);
            heVar2.setOnCancelListener(new wo1(zArr, (byte) 3));
            gm.d3(new gn6(zArr2, heVar2, b), 250L);
            heVar = heVar2;
        } catch (Exception e) {
            fc4.g(e, true);
            heVar = null;
        }
        new Thread(new e77(file, file2, zArr, qacVar, heVar, zArr2)).start();
    }

    public static native boolean cropOpusFile(String str, String str2, long j, long j2);

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d0(String str, Context context, int i, String str2, String str3, qac qacVar) {
        File file;
        he heVar;
        if (str == null || context == null) {
            return;
        }
        byte b = 0;
        if (!TextUtils.isEmpty(str)) {
            File file2 = new File(str);
            if (file2.exists() && !gm.G1(Uri.fromFile(file2), 0)) {
                file = file2;
                if (file == null) {
                    boolean[] zArr = {false};
                    if (file.exists()) {
                        boolean[] zArr2 = new boolean[1];
                        if (i != 0) {
                            try {
                                he heVar2 = new he(2, null, context);
                                heVar2.m(jb6.M0(2131748536, null));
                                heVar2.setCanceledOnTouchOutside(false);
                                heVar2.setCancelable(true);
                                heVar2.setOnCancelListener(new wo1(zArr, (byte) 2));
                                gm.d3(new gn6(zArr2, heVar2, b), 250L);
                                heVar = heVar2;
                            } catch (Exception e) {
                                fc4.g(e, true);
                            }
                            new Thread(new bz1(i, file, str2, heVar, zArr, str3, qacVar, zArr2)).start();
                            return;
                        }
                        heVar = null;
                        new Thread(new bz1(i, file, str2, heVar, zArr, str3, qacVar, zArr2)).start();
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
            String D = bc4.D(file);
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
                    str = gm.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", mimeTypeFromExtension);
            } else if (i == 1) {
                if (str == null) {
                    str = gm.p0(1, D);
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
                gm.D(fileInputStream, a.b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static void f0(Context context, j5 j5Var, ArrayList arrayList, we7 we7Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        fo6 fo6Var = new fo6();
        fo6Var.d = new HashMap();
        fo6Var.a = j5Var;
        fo6Var.c = arrayList;
        fo6Var.s = we7Var;
        fo6Var.w = ((k47) arrayList.get(0)).I3();
        int i = j5Var.a;
        nm7.f(i).a(fo6Var, nm7.Y1);
        nm7.f(i).a(fo6Var, nm7.X1);
        nm7.f(i).a(fo6Var, nm7.Z1);
        he heVar = new he(2, PhotoViewer.r0().V0() ? new r63() : null, context);
        fo6Var.b = heVar;
        heVar.m(jb6.M0(2131748536, null));
        heVar.setCancelable(true);
        heVar.I = true;
        heVar.setOnCancelListener(new ct0(fo6Var, (byte) 12));
        gm.d3(new eo6(fo6Var, (byte) 1), 250L);
        new Thread(new eo6(fo6Var, (byte) 2)).start();
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
        if (gda.r0 && !use.d("android.permission.BLUETOOTH_CONNECT")) {
            gda.r0 = false;
            gda.x();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && gda.r0) && z) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
            } catch (SecurityException unused) {
                return;
            } catch (Throwable th) {
                fc4.g(th, true);
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
    
        fc4.g(r0, true);
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
                String q = bc4.q(v(uri));
                if (q == null) {
                    int p = gda.p();
                    gda.x();
                    Locale locale = Locale.US;
                    q = p + "." + str;
                }
                file = gm.f1();
                try {
                    file.mkdirs();
                    if (!gm.G1(Uri.fromFile(file), 0)) {
                        int i3 = 0;
                        do {
                            File f1 = gm.f1();
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
                                    if (gm.G1(null, ((Integer) r8.invoke(fileInputStream.getFD(), null)).intValue())) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                        if (j > 0) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    fc4.g(th2, true);
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
                                                    fc4.g(e3, true);
                                                }
                                                try {
                                                    r8.close();
                                                } catch (Exception e4) {
                                                    fc4.g(e4, true);
                                                }
                                                if (j > 0) {
                                                }
                                            }
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        i2 = i;
                                        fc4.g(e, true);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception e6) {
                                                fc4.g(e6, true);
                                            }
                                        }
                                        if (r8 != 0) {
                                            try {
                                                r8.close();
                                            } catch (Exception e7) {
                                                fc4.g(e7, true);
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
                                                fc4.g(e8, true);
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Exception e9) {
                                                fc4.g(e9, true);
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
            fc4.g(e14, true);
        }
        if (j > 0) {
            file.delete();
        }
        return absolutePath;
    }

    public static File p(String str) {
        File file;
        try {
            File f1 = gm.f1();
            f1.mkdirs();
            if (gm.G1(Uri.fromFile(f1), 0)) {
                return null;
            }
            int i = 0;
            do {
                File f12 = gm.f1();
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
            fc4.g(e, true);
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
        in0 in0Var = yed.b;
        in0Var.a();
        if (!in0Var.c) {
            return !oc7.r1(i).l4.k0.f;
        }
        in0Var.a();
        return in0Var.d;
    }

    private native int startRecord(String str, int i);

    private native void stopRecord();

    public static boolean t() {
        try {
            for (AudioDeviceInfo audioDeviceInfo : lo7.p0.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            fc4.g(e, true);
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
                    fc4.g(e, true);
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
            fc4.g(e4, true);
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
            fc4.g(e, true);
            i = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            fc4.g(th, true);
        }
        return i;
    }

    public final boolean A() {
        ArrayList arrayList;
        k47 k47Var = this.v0;
        return k47Var == null || !(k47.Q4(k47Var.k) || this.v0.g4()) || (arrayList = this.f0) == null || arrayList.size() <= 1 || !this.f0.contains(this.v0) || this.f0.indexOf(this.v0) >= this.f0.size() - 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0(final int i, final int i2, final boolean z, final boolean z2) {
        u30 u30Var;
        if (!this.I1) {
            an6 an6Var = this.M1;
            mp3 mp3Var = this.N1;
            if (an6Var != null) {
                mp3Var.a(an6Var);
                this.M1 = null;
            }
            mp3Var.c(new Runnable() { // from class: mn6
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
                        fc4.g(e, true);
                        if (mediaController.k1 != null) {
                            if (e21.a) {
                                fc4.d("delete voice file");
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
                    gm.c3(new ex1(mediaController, b3, (byte) 4));
                }
            });
            return;
        }
        m30 m30Var = this.L1;
        if (m30Var != null) {
            this.L1 = null;
            if (i == 0) {
                s(false);
                return;
            }
            this.C1 = i;
            this.D1 = z;
            this.E1 = i2;
            this.F1 = z2;
            n(m30Var);
            return;
        }
        if (this.J1) {
            if (this.C1 == 3) {
                this.C1 = i;
                this.D1 = z;
                this.E1 = i2;
                this.F1 = z2;
                if (i == 0) {
                    u30 u30Var2 = this.G1;
                    if (u30Var2 != null) {
                        u30Var2.a = false;
                        ((h40) u30Var2.e).b();
                    }
                    s(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2 && (u30Var = this.G1) != null && u30Var.e()) {
            this.y0 = false;
            this.r = false;
            this.P = false;
            return;
        }
        dn6 dn6Var = this.H1;
        if (dn6Var != null) {
            gm.r(dn6Var);
            this.H1 = null;
        }
        this.J1 = true;
        this.C1 = i;
        this.D1 = z;
        this.E1 = i2;
        this.F1 = z2;
        u30 u30Var3 = this.G1;
        if (u30Var3 == null) {
            s(false);
        } else {
            h40 h40Var = (h40) u30Var3.e;
            if (i == 0) {
                u30Var3.a = false;
                h40Var.b();
                s(false);
            } else {
                u30Var3.a = true;
                h40Var.getClass();
                h40.q();
                int i3 = h40Var.e().a;
                if (u30Var3.a && (i3 == 3 || i3 == 5)) {
                    u30Var3.a = false;
                    h40Var.h();
                }
            }
        }
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        final int i4 = this.i1;
        final int i5 = this.h1;
        gm.c3(new Runnable() { // from class: cn6
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = MediaController.W1;
                nm7.f(i4).k(nm7.n2, Integer.valueOf(i5), Integer.valueOf(i == 2 ? 1 : 0));
            }
        });
    }

    public final void B0(final int i, final int i2, final boolean z, final boolean z2) {
        final MediaController mediaController;
        final File file;
        if (i == 0 || (file = this.k1) == null) {
            mediaController = this;
            s70.b(mediaController.k1);
            File file2 = mediaController.k1;
            if (file2 != null) {
                file2.delete();
            }
            mediaController.X(false);
        } else {
            final TLRPC.TL_document tL_document = this.g1;
            final File file3 = this.j1;
            if (e21.a) {
                fc4.b("stop recording internal filename " + this.k1.getPath());
            }
            mediaController = this;
            mediaController.O1.c(new Runnable() { // from class: in6
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
            fc4.g(e, true);
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
            this.N1.c(new bn6(this, z, r1));
            return;
        }
        this.K1 = z;
        u30 u30Var = this.G1;
        if (u30Var != null) {
            if (u30Var.e()) {
                X(true);
                i0(true);
            }
            u30 u30Var2 = this.G1;
            h40 h40Var = (h40) u30Var2.e;
            h40Var.getClass();
            h40.q();
            int i = h40Var.e().a;
            if (i == 3) {
                ((h40) u30Var2.e).n();
                return;
            }
            if (i == 5) {
                h40 h40Var2 = (h40) u30Var2.e;
                h40Var2.getClass();
                h40.q();
                if (h40Var2.G == 5) {
                    h40Var2.h.b("resume requested: trim=" + h40Var2.r + ".." + h40Var2.s + ", sourceDurationMs=" + h40Var2.j());
                    h40Var2.p();
                    h40Var2.s(6);
                    f40 f40Var = h40Var2.z;
                    if (f40Var == null) {
                        h40Var2.g(new IllegalStateException("Output generation is missing"));
                        return;
                    }
                    long j = h40Var2.r;
                    long j2 = h40Var2.s;
                    r1 = j2 >= h40.r(h40Var2.p) ? (byte) 1 : (byte) 0;
                    h40Var2.k(1);
                    long j3 = ((j2 - j) * 48000) / 1000;
                    h40Var2.p = j3;
                    h40Var2.r = 0L;
                    h40Var2.s = h40.r(j3);
                    h40Var2.d();
                    h40Var2.h.b("resume prefix selected: source=" + f40Var.b.getName() + ", trim=" + j + ".." + j2);
                    File file = f40Var.b;
                    if (r1 != 0) {
                        j2 = -1;
                    }
                    h40Var2.u(j, j2, file);
                }
            }
        }
    }

    public final boolean D(k47 k47Var) {
        k47 k47Var2;
        boolean z;
        if (k47Var != null && k47Var.j2) {
            return false;
        }
        if ((this.j0 == null && this.F0 == null) || k47Var == null || (k47Var2 = this.v0) == null) {
            return false;
        }
        long j = k47Var2.T;
        if (j != 0 && j == k47Var.T) {
            z = this.B0;
        } else {
            if (!G(k47Var)) {
                return false;
            }
            z = this.B0;
        }
        return !z;
    }

    public final boolean D0(int i, ArrayList arrayList) {
        k47 k47Var;
        int i2;
        k47 k47Var2;
        int i3 = this.V0;
        boolean z = ConnectionsManager.getInstance(z8c.t0).getConnectionState() == 2;
        this.V0 += i;
        if (z) {
            while (this.V0 < arrayList.size() && (i2 = this.V0) >= 0 && ((k47Var2 = (k47) arrayList.get(i2)) == null || !k47Var2.z0)) {
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
                    k47Var = (k47) arrayList.get(i5);
                    if (k47Var == null && k47Var.z0) {
                        break;
                    }
                    this.V0 += i;
                } else {
                    if (i5 < i3) {
                        break;
                    }
                    k47Var = (k47) arrayList.get(i5);
                    if (k47Var == null) {
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
        k47 k47Var = this.v0;
        if (k47Var != null && C() && this.i0 && (k47.Q4(k47Var.k) || k47Var.I3())) {
            R(k47Var);
        }
        this.i0 = false;
    }

    public final boolean F() {
        if (!this.I1) {
            return this.e1;
        }
        u30 u30Var = this.G1;
        return u30Var != null && u30Var.e();
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

    public final boolean G(k47 k47Var) {
        k47 k47Var2 = this.v0;
        if (k47Var2 != null && k47.B0(k47Var2.k) == k47.B0(k47Var.k) && this.v0.e1() == k47Var.e1()) {
            if ((this.v0.T == 0) == (k47Var.T == 0)) {
                return true;
            }
        }
        return false;
    }

    public final void G0(k47 k47Var, int[] iArr, boolean z, boolean z2, int i) {
        k47 k47Var2;
        if (this.F0 != null) {
            if (i == 4 || i == 1) {
                try {
                    this.K0.getWindow().clearFlags(128);
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } else {
                try {
                    this.K0.getWindow().addFlags(128);
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
            }
            tn6 tn6Var = this.d1;
            if (i == 3) {
                this.G0 = true;
                k47 k47Var3 = this.v0;
                if (k47Var3 != null && (k47.K4(k47Var3.k) || this.v0.g4())) {
                    gm.r(tn6Var);
                    bc4.G(k47Var.K1).Z(this.v0.F0(), true, false);
                }
                this.Q0 = true;
                return;
            }
            if (i == 2) {
                if (!z2 || (k47Var2 = this.v0) == null) {
                    return;
                }
                if (k47.K4(k47Var2.k) || this.v0.g4()) {
                    if (this.G0) {
                        tn6Var.run();
                        return;
                    } else {
                        gm.d3(tn6Var, 1000L);
                        return;
                    }
                }
                return;
            }
            if (this.F0.c0() && i == 4) {
                k47 k47Var4 = this.v0;
                if (k47Var4 == null || !k47.K4(k47Var4.k) || z || (iArr != null && iArr[0] >= 4)) {
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
            qn6 qn6Var = new qn6(bc4.z(1), System.currentTimeMillis() + "_" + bc4.r(null, tL_document));
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), qn6Var.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.k1) {
                    this.k1 = qn6Var;
                }
                file2 = qn6Var;
            }
            file.delete();
            if (file == this.j1) {
                this.j1 = null;
            }
        }
        return file2;
    }

    public final void J(final int i, final int i2, long j, long j2, v67 v67Var, k47 k47Var, k47 k47Var2, TL_stories.StoryItem storyItem, l3a l3aVar) {
        String absolutePath;
        final byte b = 0;
        if (this.f1 != null) {
            gm.c3(new Runnable(this) { // from class: fn6
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
                            nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                            break;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                            break;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                            break;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(nm7.l2, Integer.valueOf(i3), Boolean.TRUE);
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
        tL_document.id = gda.p();
        this.g1.user_id = z8c.h(i).e();
        TLRPC.TL_document tL_document2 = this.g1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        gda.x();
        this.k1 = new sn6(bc4.z(1), System.currentTimeMillis() + "_" + bc4.r(null, this.g1));
        bc4.z(4).mkdirs();
        if (e21.a) {
            fc4.b("start recording internal " + this.k1.getPath() + " " + this.k1.exists());
        }
        File file = this.k1;
        Set set = s70.a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            s70.a.add(absolutePath);
        }
        try {
            if (startRecord(this.k1.getPath(), this.B1) == 0) {
                gm.c3(new Runnable(this) { // from class: fn6
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
                                nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                                break;
                            case 1:
                                String[] strArr2 = MediaController.W1;
                                mediaController.M1 = null;
                                nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                                break;
                            case 2:
                                String[] strArr3 = MediaController.W1;
                                mediaController.M1 = null;
                                nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                                break;
                            default:
                                String[] strArr4 = MediaController.W1;
                                mediaController.M1 = null;
                                nm7.f(i4).k(nm7.l2, Integer.valueOf(i3), Boolean.TRUE);
                                break;
                        }
                    }
                });
                if (e21.a) {
                    fc4.b("cant init encoder");
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
            this.q1 = v67Var;
            this.o1 = k47Var != null ? k47.b2(this.i1, k47Var.k, false, false) : 0L;
            this.i1 = i;
            this.r1 = k47Var2;
            this.s1 = k47Var;
            this.t1 = storyItem;
            this.u1 = l3aVar;
            this.z1.rewind();
            this.f1.startRecording();
            this.N1.c(this.P1);
            final byte b4 = 3;
            gm.c3(new Runnable(this) { // from class: fn6
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
                            nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                            break;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                            break;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                            break;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(nm7.l2, Integer.valueOf(i3), Boolean.TRUE);
                            break;
                    }
                }
            });
        } catch (Exception e) {
            fc4.g(e, true);
            this.g1 = null;
            stopRecord();
            s70.b(this.k1);
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
                fc4.g(e3, true);
            }
            i0(false);
            final byte b5 = 2;
            gm.c3(new Runnable(this) { // from class: fn6
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
                            nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                            break;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                            break;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(nm7.m2, Integer.valueOf(i3));
                            break;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            nm7.f(i4).k(nm7.l2, Integer.valueOf(i3), Boolean.TRUE);
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
            if (e21.a) {
                fc4.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (e21.a) {
            fc4.b("stop recording internal in queue " + I.exists() + " " + I.length());
        }
        gm.c3(new Runnable() { // from class: kn6
            @Override // java.lang.Runnable
            public final void run() {
                boolean z3;
                char c;
                byte b;
                String str;
                String[] strArr = MediaController.W1;
                MediaController mediaController = MediaController.this;
                mediaController.getClass();
                boolean z4 = e21.a;
                File file3 = I;
                if (z4) {
                    fc4.b("stop recording internal ".concat(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1));
                }
                if (!file3.exists()) {
                    fc4.g(new RuntimeException("file not found :( recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1), true);
                }
                hs6.d0(mediaController.i1).D1(mediaController.n1, mediaController.o1, null);
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
                        y5a f = y5a.f(tL_document2, null, file3.getAbsolutePath(), mediaController.n1, mediaController.r1, mediaController.s1, null, null, null, null, z, i2, 0, z2 ? Integer.MAX_VALUE : 0, null, null, false);
                        f.R = mediaController.p1;
                        f.T = mediaController.q1;
                        f.H = mediaController.t1;
                        f.K = mediaController.u1;
                        f.Q = 0L;
                        a6a.B(mediaController.i1).q0(f);
                    } else {
                        c = 1;
                        b = 2;
                        z3 = false;
                    }
                    nm7 f3 = nm7.f(mediaController.i1);
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
                    f3.k(nm7.s2, objArr);
                } else {
                    z3 = false;
                    nm7.f(mediaController.i1).k(nm7.t2, Integer.valueOf(mediaController.h1), Boolean.FALSE, Integer.valueOf((int) j));
                    s70.b(file3);
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
        gm.c3(new rh((Object) this, (Object) I, z, (Object) tL_document, (byte) 24));
    }

    public final void M() {
        this.j1 = this.k1;
        rn6 rn6Var = new rn6(bc4.z(1), System.currentTimeMillis() + "_" + bc4.r(null, this.g1), (byte) 1);
        this.k1 = rn6Var;
        if (startRecord(rn6Var.getPath(), this.B1) != 0) {
            gm.c3(new zm6(this, (byte) 8));
            return;
        }
        gm.c3(new zm6(this, (byte) 7));
        if (e21.a) {
            fc4.b("cant resume audio encoder");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        k47 k47Var;
        int i;
        long j;
        long j2;
        long j3;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
        jc7 jc7Var = this.R0;
        if (jc7Var != null) {
            jc7Var.b();
            return;
        }
        if (this.Y0 || (k47Var = this.v0) == null || k47Var.r1 || pg3.B(k47.B0(k47Var.k)) || (i = this.a1) == 0) {
            return;
        }
        ko6 ko6Var = this.D0;
        byte b = 0;
        if (ko6Var == null) {
            boolean[] zArr = this.X0;
            boolean z = zArr[0];
            int[] iArr = this.c1;
            if (!z) {
                this.Y0 = true;
                hs6.d0(j5.a(this.v0.K1).a).P0(k47.B0(this.v0.k), 50, iArr[0], 0, 4, this.b1, 1, this.a1, 0, null, null);
                return;
            } else {
                if (this.Z0 == 0 || zArr[1]) {
                    return;
                }
                this.Y0 = true;
                hs6.d0(j5.a(this.v0.K1).a).P0(this.Z0, 50, iArr[0], 0, 4, 0L, 1, this.a1, 0, null, null);
                return;
            }
        }
        if (ko6Var.g) {
            return;
        }
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty()) {
            return;
        }
        int i2 = ((k47) arrayList.get(0)).K1;
        if (this.D0.c != 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            ko6 ko6Var2 = this.D0;
            tL_messages_search.q = ko6Var2.a;
            tL_messages_search.limit = 20;
            sh4 sh4Var = ko6Var2.b;
            tL_messages_search.filter = sh4Var == null ? new TLRPC.TL_inputMessagesFilterEmpty() : sh4Var.e;
            tL_messages_search.peer = oc7.r1(j5.a(i2).a).i1(this.D0.c);
            tL_messages_search.offset_id = ((k47) b10.f(1, arrayList)).e1();
            ko6 ko6Var3 = this.D0;
            long j4 = ko6Var3.d;
            if (j4 > 0) {
                tL_messages_search.min_date = (int) (j4 / 1000);
            }
            long j5 = ko6Var3.e;
            tL_messages_searchGlobal = tL_messages_search;
            if (j5 > 0) {
                tL_messages_search.min_date = (int) (j5 / 1000);
                tL_messages_searchGlobal = tL_messages_search;
            }
        } else {
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal2.limit = 20;
            ko6 ko6Var4 = this.D0;
            tL_messages_searchGlobal2.q = ko6Var4.a;
            tL_messages_searchGlobal2.filter = ko6Var4.b.e;
            k47 k47Var2 = (k47) b10.f(1, arrayList);
            tL_messages_searchGlobal2.offset_id = k47Var2.e1();
            ko6 ko6Var5 = this.D0;
            tL_messages_searchGlobal2.offset_rate = ko6Var5.h;
            tL_messages_searchGlobal2.flags |= 1;
            tL_messages_searchGlobal2.folder_id = ko6Var5.i ? 1 : 0;
            TLRPC.Peer peer = k47Var2.k.peer_id;
            long j6 = peer.channel_id;
            if (j6 == 0) {
                j6 = peer.chat_id;
                if (j6 == 0) {
                    j = peer.user_id;
                    tL_messages_searchGlobal2.offset_peer = oc7.r1(i2).i1(j);
                    ko6 ko6Var6 = this.D0;
                    j2 = ko6Var6.d;
                    if (j2 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j2 / 1000);
                    }
                    j3 = ko6Var6.e;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    if (j3 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j3 / 1000);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
            }
            j = -j6;
            tL_messages_searchGlobal2.offset_peer = oc7.r1(i2).i1(j);
            ko6 ko6Var62 = this.D0;
            j2 = ko6Var62.d;
            if (j2 > 0) {
            }
            j3 = ko6Var62.e;
            tL_messages_searchGlobal = tL_messages_searchGlobal2;
            if (j3 > 0) {
            }
        }
        this.Y0 = true;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_searchGlobal, new hn6(this, i, i2, b));
    }

    public final boolean Q(k47 k47Var, boolean z) {
        if ((this.j0 != null || this.F0 != null) && k47Var != null && this.v0 != null && G(k47Var)) {
            y0();
            try {
                if (this.j0 == null) {
                    ndc ndcVar = this.F0;
                    if (ndcVar != null) {
                        ndcVar.f0();
                    }
                } else if (!z || fp.w() || k47.Q4(this.v0.k) || this.v0.L0() * (1.0f - this.v0.b0) <= 1.0d || !LaunchActivity.G1) {
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
                    this.R1.addListener(new v85(this, (byte) 17));
                    this.R1.start();
                }
                this.h0 = true;
                nm7.f(this.v0.K1).k(nm7.g2, Integer.valueOf(this.v0.e1()));
                try {
                    fp.b(1);
                    if (!this.U1) {
                        if (hi2.v().D()) {
                            hi2.v().Q(u());
                        }
                        fp.z(false);
                    }
                    return true;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return true;
                }
            } catch (Exception e3) {
                fc4.g(e3, true);
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
    
        fc4.f(r0);
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
    /* JADX WARN: Type inference failed for: r5v28, types: [k47, ndc] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean R(final k47 k47Var) {
        boolean z;
        boolean z2;
        File file;
        final File M;
        File file2;
        boolean z3;
        File M2;
        boolean z4;
        jy jyVar;
        boolean K4;
        String str;
        boolean z5;
        PipRoundVideoView pipRoundVideoView;
        boolean g4;
        ndc ndcVar;
        PowerManager.WakeLock wakeLock;
        ?? r5;
        ho6 ho6Var;
        TLRPC.TL_inputDocument tL_inputDocument;
        byte[] bArr;
        boolean z6;
        int i = nm7.g2;
        int i2 = nm7.e2;
        if (k47Var == null) {
            return false;
        }
        h();
        if (!(this.j0 == null && this.F0 == null) && G(k47Var)) {
            if (this.h0) {
                a0(k47Var);
            }
            if (gda.k(true)) {
                return true;
            }
            v0(this.s);
            return true;
        }
        if (!k47Var.N3() && k47Var.k.media_unread) {
            oc7.r1(k47Var.K1).v3(k47Var);
        }
        boolean z7 = !this.C0;
        k47 k47Var2 = this.v0;
        if (k47Var2 != null) {
            if ((k47Var2.I3() && k47.Q4(k47Var.k)) || k47Var.g4() || k47.K4(k47Var.k)) {
                k47 k47Var3 = this.v0;
                if (k47Var3 != null && k47Var3.I3() && !this.S0.isEmpty()) {
                    this.V1 = new mo6(this.v0);
                }
                z6 = true;
                if (!this.C0) {
                    this.v0.F5();
                    nm7.f(this.v0.K1).k(i2, Integer.valueOf(this.v0.e1()), 0);
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
        String str2 = k47Var.k.attachPath;
        if (str2 == null || str2.length() <= 0) {
            z2 = false;
        } else {
            file = new File(k47Var.k.attachPath);
            z2 = file.exists();
        }
        file = null;
        if (file != null) {
            M = file;
        } else {
            bc4.G(k47Var.K1);
            M = bc4.M(k47Var.k, false, true);
        }
        boolean z8 = gda.x0 && !((!k47Var.I3() && !k47Var.g4() && (!k47.K4(k47Var.k) || !k47Var.B())) || k47.Q5(k47Var.k) || pg3.B(k47.B0(k47Var.k)));
        if (M != file && !(z2 = M.exists()) && !z8) {
            bc4.G(k47Var.K1).X(k47Var.F0(), k47Var, 0, k47.Q5(k47Var.k) ? 2 : 0);
            this.B0 = true;
            this.h0 = false;
            this.E0 = null;
            this.v0 = k47Var;
            if (c()) {
                try {
                    a.b.startService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
            } else {
                a.b.stopService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
            }
            nm7.f(this.v0.K1).k(i, Integer.valueOf(this.v0.e1()));
            return true;
        }
        boolean z9 = z2;
        this.B0 = false;
        boolean I3 = k47Var.I3();
        int i3 = k47Var.K1;
        if (I3) {
            g(i3);
        } else {
            ArrayList arrayList = this.f0;
            if (arrayList != null && arrayList.size() >= 2) {
                k47 k47Var4 = (k47) this.f0.get(1);
                String str3 = k47Var4.k.attachPath;
                if (str3 != null && str3.length() > 0) {
                    file2 = new File(k47Var4.k.attachPath);
                }
                file2 = null;
                if (file2 != null) {
                    z3 = z;
                    M2 = file2;
                } else {
                    bc4.G(i3);
                    z3 = z;
                    M2 = bc4.M(k47Var4.k, false, true);
                }
                M2.exists();
                if (M2 == file2 || M2.exists()) {
                    z4 = false;
                } else {
                    bc4 G = bc4.G(i3);
                    z4 = false;
                    G.X(k47Var4.F0(), k47Var4, 0, k47.Q5(k47Var4.k) ? 2 : 0);
                }
                jyVar = this.M0;
                if (jyVar != null) {
                    this.N0 = z4;
                    jyVar.setDrawingReady(z4);
                }
                K4 = k47.K4(k47Var.k);
                if (!k47Var.g4() || K4) {
                    File file3 = file;
                    bc4.G(k47Var.K1).c0(k47Var.F0(), true);
                    this.G0 = false;
                    if (K4) {
                        str = "tg://";
                    } else {
                        str = "tg://";
                        if (k47Var.k.peer_id.channel_id != 0 || k47Var.b0 > 0.1f) {
                            z5 = false;
                            int[] iArr = (K4 || k47Var.L0() > 30.0d) ? null : new int[]{1};
                            if (!z3) {
                                m();
                            }
                            ndc ndcVar2 = new ndc();
                            this.F0 = ndcVar2;
                            ndcVar2.r0(false);
                            int i4 = this.n0 + 1;
                            this.n0 = i4;
                            String str4 = str;
                            this.F0.K = new xn6(this, i4, k47Var, iArr, z5);
                            this.Q0 = false;
                            if (this.I0 == null) {
                                oc7 r1 = oc7.r1(k47Var.K1);
                                if ((k47Var.r1 ? r1.p0 : r1.o0).contains(Long.valueOf(k47.B0(k47Var.k)))) {
                                    TextureView textureView = this.H0;
                                    if (textureView != null) {
                                        this.F0.z0(textureView);
                                    }
                                    if (z9) {
                                        try {
                                            int F = bc4.G(k47Var.K1).F(k47Var);
                                            TLRPC.Document F0 = k47Var.F0();
                                            StringBuilder sb = new StringBuilder("?account=");
                                            sb.append(k47Var.K1);
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
                                            sb.append(URLEncoder.encode(bc4.B(F0), "UTF-8"));
                                            sb.append("&reference=");
                                            byte[] bArr2 = F0.file_reference;
                                            if (bArr2 == null) {
                                                bArr2 = new byte[0];
                                            }
                                            sb.append(Utilities.f(bArr2));
                                            this.F0.i0(Uri.parse(str4 + k47Var.S0() + sb.toString()), "other");
                                        } catch (Exception e) {
                                            fc4.g(e, true);
                                        }
                                    } else {
                                        if (!k47Var.z0 && M != file3) {
                                            final byte b = 0;
                                            gm.c3(new Runnable() { // from class: ln6
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    byte b3 = b;
                                                    File file4 = M;
                                                    k47 k47Var5 = k47Var;
                                                    switch (b3) {
                                                        case 0:
                                                            String[] strArr = MediaController.W1;
                                                            nm7.f(k47Var5.K1).k(nm7.Y1, bc4.r(null, k47Var5.F0()), file4);
                                                            break;
                                                        default:
                                                            String[] strArr2 = MediaController.W1;
                                                            nm7.f(k47Var5.K1).k(nm7.Y1, bc4.r(null, k47Var5.F0()), file4);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        this.F0.i0(Uri.fromFile(M), "other");
                                    }
                                    g4 = k47Var.g4();
                                    ndc ndcVar3 = this.F0;
                                    if (g4) {
                                        ndcVar3.w0(3);
                                    } else {
                                        ndcVar3.w0(this.M ? 0 : 3);
                                        if (Math.abs(this.q0 - 1.0f) > 0.001f) {
                                            this.F0.u0(Math.round(this.q0 * 10.0f) / 10.0f);
                                        }
                                        float f = k47Var.c0;
                                        if (f >= 0.0f) {
                                            this.u0 = f;
                                            k47Var.b0 = f;
                                            k47Var.c0 = -1.0f;
                                        }
                                    }
                                }
                            }
                            if (this.I0 == null) {
                                try {
                                    PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                                    this.I0 = pipRoundVideoView2;
                                    pipRoundVideoView2.d(this.K0, new zm6(this, (byte) 9));
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
                            g4 = k47Var.g4();
                            ndc ndcVar32 = this.F0;
                            if (g4) {
                            }
                        }
                    }
                    z5 = true;
                    if (K4) {
                    }
                    if (!z3) {
                    }
                    ndc ndcVar22 = new ndc();
                    this.F0 = ndcVar22;
                    ndcVar22.r0(false);
                    int i42 = this.n0 + 1;
                    this.n0 = i42;
                    String str42 = str;
                    this.F0.K = new xn6(this, i42, k47Var, iArr, z5);
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
                    g4 = k47Var.g4();
                    ndc ndcVar322 = this.F0;
                    if (g4) {
                    }
                } else {
                    PipRoundVideoView pipRoundVideoView3 = this.I0;
                    if (pipRoundVideoView3 != null) {
                        pipRoundVideoView3.a(true);
                        this.I0 = null;
                    }
                    try {
                        ndc ndcVar4 = new ndc();
                        this.j0 = ndcVar4;
                        int i5 = this.n0 + 1;
                        this.n0 = i5;
                        ndcVar4.K = new nn6(this, i5, k47Var, (byte) 0);
                        ndcVar4.L = new fgf((byte) 21);
                        if (z9) {
                            if (!k47Var.z0 && M != file) {
                                final byte b3 = 1;
                                gm.c3(new Runnable() { // from class: ln6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b32 = b3;
                                        File file4 = M;
                                        k47 k47Var5 = k47Var;
                                        switch (b32) {
                                            case 0:
                                                String[] strArr = MediaController.W1;
                                                nm7.f(k47Var5.K1).k(nm7.Y1, bc4.r(null, k47Var5.F0()), file4);
                                                break;
                                            default:
                                                String[] strArr2 = MediaController.W1;
                                                nm7.f(k47Var5.K1).k(nm7.Y1, bc4.r(null, k47Var5.F0()), file4);
                                                break;
                                        }
                                    }
                                });
                            }
                            this.j0.i0(Uri.fromFile(M), "other");
                            this.m0 = false;
                        } else {
                            int F2 = bc4.G(k47Var.K1).F(k47Var);
                            TLRPC.Document F02 = k47Var.F0();
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(k47Var.K1);
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
                            sb2.append(URLEncoder.encode(bc4.B(F02), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr3 = F02.file_reference;
                            if (bArr3 == null) {
                                bArr3 = new byte[0];
                            }
                            sb2.append(Utilities.f(bArr3));
                            this.j0.i0(Uri.parse("tg://" + k47Var.S0() + sb2.toString()), "other");
                            this.m0 = true;
                        }
                        if (k47.Q4(k47Var.k)) {
                            String S0 = k47Var.S0();
                            if (S0 != null && k47Var.L0() >= 300.0d) {
                                float f3 = a.b.getSharedPreferences("media_saved_pos", 0).getFloat(S0, -1.0f);
                                if (f3 > 0.0f && f3 < 0.99f) {
                                    this.u0 = f3;
                                    k47Var.b0 = f3;
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
                                this.E0 = g10.a(M);
                            } catch (Exception e3) {
                                fc4.g(e3, true);
                            }
                            String S02 = k47Var.S0();
                            if (!TextUtils.isEmpty(S02) && k47Var.L0() >= 600.0d) {
                                float f4 = a.b.getSharedPreferences("media_saved_pos", 0).getFloat(S02, -1.0f);
                                if (f4 > 0.0f && f4 < 0.999f) {
                                    this.u0 = f4;
                                    k47Var.b0 = f4;
                                }
                                this.o0 = S02;
                                if (Math.abs(this.r0 - 1.0f) > 0.001f) {
                                    this.j0.u0(Math.round(this.r0 * 10.0f) / 10.0f);
                                }
                            }
                        }
                        float f5 = k47Var.c0;
                        if (f5 >= 0.0f) {
                            this.u0 = f5;
                            k47Var.b0 = f5;
                            k47Var.c0 = -1.0f;
                        }
                        if (!k47Var.I3() || k47Var.F0() == null || pg3.B(k47.B0(k47Var.k))) {
                            ho6 ho6Var2 = this.x0;
                            if (ho6Var2 != null) {
                                ho6Var2.a();
                                this.x0 = null;
                            }
                        } else {
                            ho6 ho6Var3 = this.x0;
                            if (ho6Var3 != null) {
                                if (ho6Var3.a != k47Var.K1) {
                                    ho6Var3.a();
                                }
                                TLRPC.Document F03 = k47Var.F0();
                                tL_inputDocument = new TLRPC.TL_inputDocument();
                                tL_inputDocument.id = F03.id;
                                tL_inputDocument.access_hash = F03.access_hash;
                                bArr = F03.file_reference;
                                tL_inputDocument.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputDocument.file_reference = new byte[0];
                                }
                                ho6 ho6Var4 = this.x0;
                                gm.r(ho6Var4.e);
                                if (tL_inputDocument.id == 0) {
                                    tL_inputDocument = null;
                                }
                                ho6Var4.b = tL_inputDocument;
                                ho6Var4.c = -9223372036854775807L;
                                ho6Var4.d.clear();
                            }
                            this.x0 = new ho6(k47Var.K1);
                            TLRPC.Document F032 = k47Var.F0();
                            tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = F032.id;
                            tL_inputDocument.access_hash = F032.access_hash;
                            bArr = F032.file_reference;
                            tL_inputDocument.file_reference = bArr;
                            if (bArr == null) {
                            }
                            ho6 ho6Var42 = this.x0;
                            gm.r(ho6Var42.e);
                            if (tL_inputDocument.id == 0) {
                            }
                            ho6Var42.b = tL_inputDocument;
                            ho6Var42.c = -9223372036854775807L;
                            ho6Var42.d.clear();
                        }
                        h74 h74Var = this.j0.d;
                        if (h74Var != null && (ho6Var = this.x0) != null) {
                            h74Var.m.a(new go6(ho6Var, h74Var));
                        }
                        this.j0.w0(this.M ? 0 : 3);
                        this.j0.g0();
                        if (k47.Q4(k47Var.k)) {
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
                        fc4.g(e4, true);
                        nm7 f6 = nm7.f(k47Var.K1);
                        k47 k47Var5 = this.v0;
                        f6.k(i, Integer.valueOf(k47Var5 != null ? k47Var5.e1() : 0));
                        if (this.j0 == null) {
                            return false;
                        }
                        ho6 ho6Var5 = this.x0;
                        if (ho6Var5 != null) {
                            ho6Var5.a();
                            r5 = 0;
                            this.x0 = null;
                        } else {
                            r5 = 0;
                        }
                        this.j0.l0();
                        this.j0 = r5;
                        cmb.L1(this.v0);
                        this.h0 = false;
                        this.v0 = r5;
                        this.B0 = false;
                        return false;
                    }
                }
                e(k47Var);
                m0();
                this.h0 = false;
                this.v0 = k47Var;
                if (!gda.k(true)) {
                    v0(this.s);
                }
                if (!a.x && (wakeLock = this.d) != null && !wakeLock.isHeld() && !k47.Q4(this.v0.k)) {
                    this.v0.g4();
                }
                u0(this.v0);
                nm7.f(k47Var.K1).k(nm7.h2, k47Var, k47Var2);
                ndcVar = this.F0;
                if (ndcVar == null) {
                    try {
                        if (this.v0.b0 != 0.0f) {
                            long U = ndcVar.U();
                            if (U == -9223372036854775807L) {
                                U = ((long) this.v0.L0()) * 1000;
                            }
                            k47 k47Var6 = this.v0;
                            int i6 = (int) (U * k47Var6.b0);
                            int i7 = k47Var6.d0;
                            if (i7 != 0) {
                                k47Var6.d0 = 0;
                                i6 = i7;
                            }
                            this.F0.o0(i6);
                        }
                    } catch (Exception e5) {
                        k47 k47Var7 = this.v0;
                        k47Var7.b0 = 0.0f;
                        k47Var7.i0 = 0;
                        nm7.f(k47Var.K1).k(i2, Integer.valueOf(this.v0.e1()), 0);
                        fc4.g(e5, true);
                    }
                    this.F0.g0();
                } else {
                    ndc ndcVar5 = this.j0;
                    if (ndcVar5 != null) {
                        try {
                            if (this.v0.b0 != 0.0f) {
                                long U2 = ndcVar5.U();
                                if (U2 == -9223372036854775807L) {
                                    U2 = ((long) this.v0.L0()) * 1000;
                                }
                                long j = (int) (U2 * this.v0.b0);
                                this.j0.p0(j, false);
                                if (!this.U1) {
                                    fp.x(j);
                                }
                            }
                        } catch (Exception e6) {
                            this.v0.F5();
                            nm7.f(k47Var.K1).k(i2, Integer.valueOf(this.v0.e1()), 0);
                            fc4.g(e6, true);
                        }
                    }
                }
                if (c()) {
                    a.b.stopService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
                } else {
                    try {
                        a.b.startService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
                    } catch (Throwable th2) {
                        fc4.f(th2);
                    }
                }
                fp.b(1);
                if (!this.U1) {
                    if (hi2.v().D()) {
                        hi2.v().Q(u());
                    }
                    fp.z(true);
                }
                return true;
            }
        }
        z3 = z;
        z4 = false;
        jyVar = this.M0;
        if (jyVar != null) {
        }
        K4 = k47.K4(k47Var.k);
        if (k47Var.g4()) {
        }
        File file32 = file;
        bc4.G(k47Var.K1).c0(k47Var.F0(), true);
        this.G0 = false;
        if (K4) {
        }
        z5 = true;
        if (K4) {
        }
        if (!z3) {
        }
        ndc ndcVar222 = new ndc();
        this.F0 = ndcVar222;
        ndcVar222.r0(false);
        int i422 = this.n0 + 1;
        this.n0 = i422;
        String str422 = str;
        this.F0.K = new xn6(this, i422, k47Var, iArr, z5);
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
        g4 = k47Var.g4();
        ndc ndcVar3222 = this.F0;
        if (g4) {
        }
        e(k47Var);
        m0();
        this.h0 = false;
        this.v0 = k47Var;
        if (!gda.k(true)) {
        }
        if (!a.x) {
            this.v0.g4();
        }
        u0(this.v0);
        nm7.f(k47Var.K1).k(nm7.h2, k47Var, k47Var2);
        ndcVar = this.F0;
        if (ndcVar == null) {
        }
        if (c()) {
        }
        fp.b(1);
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
                k47 k47Var = (k47) arrayList.get(i);
                if (this.v0 != null && !G(k47Var)) {
                    this.v0.F5();
                }
                R(k47Var);
            }
        }
    }

    public final void T(boolean z) {
        int i;
        ArrayList arrayList = gda.J0 ? this.U0 : this.S0;
        if (z && (((i = gda.O0) == 2 || (i == 1 && arrayList.size() == 1)) && !this.W0)) {
            l(false, false, false, false);
            int i2 = this.V0;
            if (i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            k47 k47Var = (k47) arrayList.get(this.V0);
            k47Var.b0 = 0.0f;
            k47Var.i0 = 0;
            R(k47Var);
            return;
        }
        if (!D0(this.R0 != null ? !gda.K0 : gda.K0 ? 1 : -1, arrayList) || !z || gda.O0 != 0 || this.W0) {
            int i3 = this.V0;
            if (i3 < 0 || i3 >= arrayList.size()) {
                return;
            }
            k47 k47Var2 = this.v0;
            if (k47Var2 != null) {
                k47Var2.F5();
            }
            this.C0 = true;
            R((k47) arrayList.get(this.V0));
            return;
        }
        if (this.j0 == null) {
            ndc ndcVar = this.F0;
            if (ndcVar == null) {
                return;
            }
            this.M0 = null;
            this.O0 = null;
            this.Q0 = false;
            this.H0 = null;
            ndcVar.l0();
            this.F0 = null;
            try {
                this.K0.getWindow().clearFlags(128);
            } catch (Exception e) {
                fc4.g(e, true);
            }
            gm.r(this.d1);
            bc4.G(this.v0.K1).Z(this.v0.F0(), true, false);
        } else {
            ho6 ho6Var = this.x0;
            if (ho6Var != null) {
                ho6Var.a();
                this.x0 = null;
            }
            try {
                this.j0.l0();
            } catch (Exception e3) {
                fc4.g(e3, true);
            }
            this.j0 = null;
            cmb.L1(this.v0);
        }
        y0();
        this.h0 = true;
        k47 k47Var3 = this.v0;
        k47Var3.b0 = 0.0f;
        k47Var3.i0 = 0;
        nm7.f(k47Var3.K1).k(nm7.e2, Integer.valueOf(this.v0.e1()), 0);
        nm7.f(this.v0.K1).k(nm7.g2, Integer.valueOf(this.v0.e1()));
    }

    public final void U() {
        int i;
        ArrayList arrayList = gda.J0 ? this.U0 : this.S0;
        if (arrayList.isEmpty() || (i = this.V0) < 0 || i >= arrayList.size()) {
            return;
        }
        k47 k47Var = (k47) arrayList.get(this.V0);
        if (k47Var.i0 > 10) {
            h0(k47Var, 0.0f);
            return;
        }
        D0(this.R0 != null ? !gda.K0 : gda.K0 ? -1 : 1, arrayList);
        if (this.V0 < arrayList.size()) {
            this.C0 = true;
            R((k47) arrayList.get(this.V0));
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
        yv1 yv1Var = this.s;
        k47 k47Var = yv1Var.m4;
        int classGuid = yv1Var.getClassGuid();
        yv1 yv1Var2 = this.s;
        l3a X6 = yv1Var2 != null ? yv1Var2.X6() : null;
        yv1 yv1Var3 = this.s;
        long k7 = yv1Var3 != null ? yv1Var3.k7() : 0L;
        yv1 yv1Var4 = this.s;
        w0(currentAccount, a, null, k47Var, null, classGuid, false, X6, k7, yv1Var4 != null ? yv1Var4.y5 : null);
    }

    public final boolean W() {
        m30 m30Var = this.L1;
        if (m30Var != null) {
            File file = (File) m30Var.b;
            s70.b(file);
            file.delete();
            Y();
            return true;
        }
        u30 u30Var = this.G1;
        if (u30Var == null || !u30Var.e()) {
            return false;
        }
        this.G1 = null;
        if (!u30Var.c()) {
            ((h40) u30Var.e).o();
            u30Var.c = true;
        }
        Y();
        return true;
    }

    public final void X(boolean z) {
        boolean z2 = this.W;
        z00 z00Var = this.a;
        if (!z) {
            if (z2) {
                lo7.p0.abandonAudioFocus(z00Var);
                this.W = false;
                return;
            }
            return;
        }
        if (!z2 && gda.B0 && lo7.p0.requestAudioFocus(z00Var, 3, 2) == 1) {
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
        k47 k47Var;
        mo6 mo6Var = this.V1;
        if (mo6Var != null) {
            k47 k47Var2 = mo6Var.a;
            this.V1 = null;
            ArrayList arrayList = gda.J0 ? this.U0 : this.S0;
            if (arrayList != null && (i = this.V0) >= 0 && i < arrayList.size() && (k47Var = (k47) arrayList.get(this.V0)) != null && k47.B0(k47Var.k) == k47.B0(k47Var2.k) && k47Var.e1() == k47Var2.e1()) {
                this.C0 = false;
                float f = mo6Var.b;
                k47Var.c0 = f;
                k47Var.b0 = f;
                k47Var.d0 = mo6Var.c;
                k47Var.i0 = mo6Var.d;
                R(k47Var);
                Q(k47Var, false);
                return true;
            }
        }
        return false;
    }

    public final void a0(k47 k47Var) {
        if ((this.j0 == null && this.F0 == null) || k47Var == null || this.v0 == null || !G(k47Var)) {
            return;
        }
        try {
            u0(this.v0);
            ValueAnimator valueAnimator = this.R1;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.R1.cancel();
            }
            if (k47.Q4(k47Var.k) || k47Var.g4()) {
                this.Q1 = 1.0f;
                m0();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 1.0f);
                this.R1 = ofFloat;
                ofFloat.addUpdateListener(this.S1);
                this.R1.setDuration(300L);
                this.R1.start();
            }
            ndc ndcVar = this.j0;
            if (ndcVar != null) {
                ndcVar.g0();
            } else {
                ndc ndcVar2 = this.F0;
                if (ndcVar2 != null) {
                    ndcVar2.g0();
                }
            }
            e(k47Var);
            this.h0 = false;
            nm7.f(this.v0.K1).k(nm7.g2, Integer.valueOf(this.v0.e1()));
            try {
                fp.b(1);
                if (this.U1) {
                    return;
                }
                fp.z(true);
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } catch (Exception e3) {
            fc4.g(e3, true);
        }
    }

    public final void b() {
        k47 k47Var;
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.U0;
        arrayList3.clear();
        int i = this.V0;
        if (i < 0 || i >= arrayList.size()) {
            k47Var = null;
        } else {
            k47Var = (k47) arrayList.get(this.V0);
            arrayList2.remove(this.V0);
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            int nextInt = Utilities.b.nextInt(arrayList2.size());
            arrayList3.add((k47) arrayList2.get(nextInt));
            arrayList2.remove(nextInt);
        }
        if (k47Var != null) {
            arrayList3.add(k47Var);
            this.V0 = arrayList3.size() - 1;
        }
    }

    public final void b0() {
        k47 k47Var;
        ndc ndcVar = this.j0;
        if (ndcVar == null || (k47Var = this.v0) == null || this.h0) {
            return;
        }
        if (ndcVar.d == null || ndcVar.M != 2) {
            ndcVar.g0();
        } else {
            l(false, false, false, false);
            R(k47Var);
        }
    }

    public final boolean c() {
        k47 k47Var = this.v0;
        if (k47Var != null) {
            return ((!k47Var.I3() && !k47.Q4(this.v0.k) && !this.v0.g4()) || this.v0.R4() || this.v0.f4()) ? false : true;
        }
        return false;
    }

    public final void d(k47 k47Var) {
        if (k47Var == null || this.c0.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.c0.size(); i++) {
            oo6 oo6Var = (oo6) this.c0.get(i);
            k47 k47Var2 = oo6Var.a;
            if (k47Var2.T(k47Var) && k47Var2.K1 == k47Var.K1) {
                if (i == 0) {
                    synchronized (this.b) {
                        oo6Var.b.V = true;
                    }
                    return;
                } else {
                    this.a0.remove((oo6) this.c0.remove(i));
                    f(true);
                    return;
                }
            }
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        jc7 jc7Var;
        k47 k47Var;
        ArrayList arrayList;
        int indexOf;
        int i3 = 0;
        if (i == nm7.Y1 || i == nm7.R1) {
            String str = (String) objArr[0];
            k47 k47Var2 = this.v0;
            if (k47Var2 != null && k47Var2.K1 == i2 && bc4.r(null, k47Var2.F0()).equals(str)) {
                if (this.B0) {
                    this.C0 = true;
                    R(this.v0);
                    return;
                } else {
                    if (this.E0 == null) {
                        try {
                            bc4.G(z8c.t0);
                            this.E0 = g10.a(bc4.M(this.v0.k, false, true));
                            return;
                        } catch (Exception e) {
                            fc4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        if (i == nm7.v) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            ArrayList arrayList2 = (ArrayList) objArr[0];
            k47 k47Var3 = this.v0;
            if (k47Var3 != null && longValue == k47Var3.k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(k47Var3.e1()))) {
                l(true, true, false, false);
            }
            ArrayList arrayList3 = this.f0;
            if (arrayList3 == null || arrayList3.isEmpty() || longValue != ((k47) this.f0.get(0)).k.peer_id.channel_id) {
                return;
            }
            while (i3 < arrayList2.size()) {
                Integer num = (Integer) arrayList2.get(i3);
                k47 k47Var4 = (k47) this.g0.get(num.intValue());
                this.g0.remove(num.intValue());
                if (k47Var4 != null) {
                    this.f0.remove(k47Var4);
                }
                i3++;
            }
            return;
        }
        if (i == nm7.e0) {
            long longValue2 = ((Long) objArr[0]).longValue();
            k47 k47Var5 = this.v0;
            if (k47Var5 == null || k47.B0(k47Var5.k) != longValue2) {
                return;
            }
            l(false, true, false, false);
            return;
        }
        int i4 = nm7.K0;
        int[] iArr = this.c1;
        HashMap hashMap = this.T0;
        ArrayList arrayList4 = this.S0;
        if (i == i4) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            k47 k47Var6 = this.v0;
            if (k47Var6 != null && k47Var6.I3() && k47.B0(this.v0.k) == longValue3 && this.b1 == longValue4 && !this.v0.r1) {
                ArrayList arrayList5 = (ArrayList) objArr[1];
                ArrayList arrayList6 = (ArrayList) objArr[2];
                arrayList4.addAll(0, arrayList5);
                arrayList4.addAll(arrayList6);
                int size = arrayList4.size();
                for (int i5 = 0; i5 < size; i5++) {
                    k47 k47Var7 = (k47) arrayList4.get(i5);
                    hashMap.put(Integer.valueOf(k47Var7.e1()), k47Var7);
                    iArr[0] = Math.min(iArr[0], k47Var7.e1());
                }
                s0();
                if (gda.J0) {
                    b();
                } else {
                    k47 k47Var8 = this.v0;
                    if (k47Var8 != null && (indexOf = arrayList4.indexOf(k47Var8)) >= 0) {
                        this.V0 = indexOf;
                    }
                }
                this.a1 = ConnectionsManager.generateClassGuid();
                return;
            }
            return;
        }
        int i6 = nm7.V;
        int i7 = nm7.L0;
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
                k47 k47Var9 = (k47) arrayList7.get(i9);
                if (!k47Var9.R4() && !hashMap.containsKey(Integer.valueOf(k47Var9.e1()))) {
                    i8++;
                    arrayList4.add(0, k47Var9);
                    hashMap.put(Integer.valueOf(k47Var9.e1()), k47Var9);
                    iArr[c] = Math.min(iArr[c], k47Var9.e1());
                }
            }
            s0();
            int indexOf2 = arrayList4.indexOf(this.v0);
            if (indexOf2 >= 0) {
                this.V0 = indexOf2;
            }
            this.Y0 = false;
            if (gda.J0) {
                b();
            }
            if (i8 != 0) {
                nm7.f(this.v0.K1).k(i7, Integer.valueOf(i8));
                return;
            }
            return;
        }
        if (i == 1) {
            if (((Boolean) objArr[2]).booleanValue() || (arrayList = this.f0) == null || arrayList.isEmpty() || ((Long) objArr[0]).longValue() != k47.B0(((k47) this.f0.get(0)).k)) {
                return;
            }
            ArrayList arrayList8 = (ArrayList) objArr[1];
            while (i3 < arrayList8.size()) {
                k47 k47Var10 = (k47) arrayList8.get(i3);
                if ((k47.Q4(k47Var10.k) || k47Var10.g4()) && !k47Var10.R4() && !k47Var10.f4() && (!this.e0 || (k47Var10.k.media_unread && !k47Var10.N3()))) {
                    this.f0.add(k47Var10);
                    this.g0.put(k47Var10.e1(), k47Var10);
                }
                i3++;
            }
            return;
        }
        if (i == nm7.L4) {
            ndc ndcVar = (ndc) objArr[0];
            if (this.F0 == ndcVar || this.j0 == ndcVar) {
                return;
            }
            k47 k47Var11 = this.v0;
            if (k47Var11 != null && D(k47Var11) && !C() && (k47Var11.I3() || k47.Q4(k47Var11.k))) {
                this.i0 = true;
            }
            Q(k47Var11, true);
            return;
        }
        if (i == nm7.W3 && (jc7Var = this.R0) != null && objArr[0] == jc7Var) {
            int size2 = jc7Var.c.size() - arrayList4.size();
            arrayList4.clear();
            arrayList4.addAll(this.R0.c);
            s0();
            if (gda.J0) {
                b();
            } else {
                k47 k47Var12 = this.v0;
                if (k47Var12 != null) {
                    int indexOf3 = arrayList4.indexOf(k47Var12);
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
                            R((k47) arrayList4.get(0));
                        }
                    }
                }
            }
            if (size2 == 0 || (k47Var = this.v0) == null) {
                return;
            }
            nm7.f(k47Var.K1).k(i7, Integer.valueOf(size2));
        }
    }

    public final void e(k47 k47Var) {
        int requestAudioFocus;
        byte b = (k47.Q4(k47Var.k) || k47Var.g4()) ? this.M ? (byte) 3 : (byte) 2 : (byte) 1;
        if (this.V != b) {
            this.V = b;
            if (b == 3) {
                requestAudioFocus = lo7.p0.requestAudioFocus(this, 0, 1);
            } else {
                requestAudioFocus = lo7.p0.requestAudioFocus(this, 3, (b != 2 || gda.C0) ? 1 : 3);
            }
            if (requestAudioFocus == 1) {
                this.Y = (byte) 2;
            }
        }
    }

    public final void f(boolean z) {
        oo6 oo6Var;
        if (this.a0.isEmpty()) {
            oo6Var = null;
            this.b0 = null;
        } else {
            oo6Var = (oo6) this.a0.get(0);
            this.b0 = oo6Var;
        }
        if (oo6Var != null || z) {
            if (VideoEncodingService.e == null) {
                try {
                    a.b.startService(new Intent(a.b, (Class<?>) VideoEncodingService.class));
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            }
            if (z) {
                oo6 oo6Var2 = w().b0;
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService.b != oo6Var2) {
                    if (oo6Var2 != null) {
                        videoEncodingService.a(oo6Var2);
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
        er3 q = er3.q(i);
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
        ArrayList arrayList = gda.J0 ? this.U0 : this.S0;
        if (arrayList == null || arrayList.size() < 2) {
            return;
        }
        boolean z = this.R0 != null ? !gda.K0 : gda.K0;
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
        k47 k47Var = (k47) arrayList.get(i2);
        File file = null;
        if (!TextUtils.isEmpty(k47Var.k.attachPath)) {
            File file2 = new File(k47Var.k.attachPath);
            if (file2.exists()) {
                file = file2;
            }
        }
        if (file != null) {
            M = file;
        } else {
            bc4.G(i);
            M = bc4.M(k47Var.k, false, true);
        }
        M.exists();
        if (M == file || M.exists() || !k47Var.I3()) {
            return;
        }
        bc4.G(i).X(k47Var.F0(), k47Var, 0, k47.Q5(k47Var.k) ? 2 : 0);
    }

    public final boolean g0(k47 k47Var, boolean z, boolean z2, boolean z3) {
        rcc rccVar = k47Var != null ? k47Var.r0 : null;
        if (k47Var != null && rccVar != null) {
            ArrayList arrayList = this.c0;
            if (z) {
                if (arrayList.isEmpty()) {
                    new File(k47Var.k.attachPath).delete();
                }
            }
            oo6 oo6Var = new oo6();
            oo6Var.a = k47Var;
            oo6Var.c = k47Var.K1;
            oo6Var.b = rccVar;
            oo6Var.d = z3;
            arrayList.add(oo6Var);
            if (z2) {
                this.a0.add(oo6Var);
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

    public final void h0(k47 k47Var, float f) {
        k47 k47Var2 = this.v0;
        if ((this.j0 == null && this.F0 == null) || k47Var == null || k47Var2 == null || !G(k47Var)) {
            return;
        }
        try {
            ndc ndcVar = this.j0;
            if (ndcVar != null) {
                long U = ndcVar.U();
                if (U == -9223372036854775807L) {
                    this.u0 = f;
                } else {
                    k47Var2.b0 = f;
                    long j = (int) (U * f);
                    this.j0.p0(j, false);
                    k47Var2.e0 = j;
                    if (!this.U1) {
                        fp.x(j);
                    }
                }
            } else {
                ndc ndcVar2 = this.F0;
                if (ndcVar2 != null) {
                    ndcVar2.o0((long) (ndcVar2.U() * f));
                    if (!this.U1) {
                        fp.x((long) (this.F0.U() * f));
                    }
                }
            }
            nm7.f(k47Var.K1).k(nm7.i2, Integer.valueOf(k47Var2.e1()), Float.valueOf(f));
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void i(boolean z) {
        File file;
        File file2;
        File file3;
        u30 u30Var;
        u30 u30Var2;
        if (this.I1) {
            dn6 dn6Var = this.H1;
            if (dn6Var != null) {
                gm.r(dn6Var);
                this.H1 = null;
            }
            boolean c = (z || (u30Var2 = this.G1) == null) ? false : u30Var2.c();
            if (!c && (u30Var = this.G1) != null) {
                u30Var.a = false;
                ((h40) u30Var.e).b();
            }
            if (c && (file3 = this.k1) != null) {
                s70.b(file3);
            }
            s(!z);
            return;
        }
        this.g1 = null;
        s70.b(this.k1);
        if (z && (file2 = this.k1) != null) {
            try {
                file2.delete();
            } catch (Exception e) {
                fc4.g(e, true);
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
            er3 q = er3.q(i);
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
        jy jyVar = this.M0;
        if (jyVar != null) {
            if (z) {
                PipRoundVideoView pipRoundVideoView = this.I0;
                if (pipRoundVideoView != null) {
                    this.J0 = (byte) 2;
                    pipRoundVideoView.a(true);
                    this.I0 = null;
                    return;
                } else {
                    if (jyVar.getParent() == null) {
                        this.O0.addView(this.M0);
                    }
                    this.F0.z0(this.H0);
                    return;
                }
            }
            if (jyVar.getParent() != null) {
                this.J0 = (byte) 1;
                this.O0.removeView(this.M0);
                return;
            }
            if (this.I0 == null) {
                try {
                    PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                    this.I0 = pipRoundVideoView2;
                    pipRoundVideoView2.d(this.K0, new zm6(this, (byte) 4));
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
        boolean z = gda.J0;
        if (i == 2) {
            gda.J0 = true;
            gda.K0 = false;
        } else if (i == 1) {
            gda.K0 = true;
            gda.J0 = false;
        } else {
            gda.K0 = false;
            gda.J0 = false;
        }
        MediaController w = w();
        k47 k47Var = w.v0;
        if (k47Var != null && k47Var.I3()) {
            w.g(w.v0.K1);
        }
        SharedPreferences.Editor edit = oc7.d1().edit();
        edit.putBoolean("shuffleMusic", gda.J0);
        edit.putBoolean("playOrderReversed", gda.K0);
        edit.apply();
        boolean z2 = gda.J0;
        if (z != z2) {
            if (z2) {
                b();
                return;
            }
            k47 k47Var2 = this.v0;
            if (k47Var2 != null) {
                int indexOf = this.S0.indexOf(k47Var2);
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
        k47 k47Var;
        int i = nm7.j2;
        if (z2 && Z()) {
            return;
        }
        boolean z6 = false;
        if (this.j0 != null) {
            ho6 ho6Var = this.x0;
            if (ho6Var != null) {
                ho6Var.a();
                this.x0 = null;
            }
            ValueAnimator valueAnimator = this.R1;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.R1.cancel();
            }
            if (fp.w() || !this.j0.c0() || (k47Var = this.v0) == null || k47.Q4(k47Var.k)) {
                try {
                    this.j0.l0();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            } else {
                ndc ndcVar = this.j0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 0.0f);
                ofFloat.addUpdateListener(new pl(this, ndcVar, (byte) 17));
                ofFloat.addListener(new v85(ndcVar, (byte) 18));
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
            this.j0 = null;
            cmb.L1(this.v0);
        } else {
            ndc ndcVar2 = this.F0;
            if (ndcVar2 != null) {
                this.M0 = null;
                this.O0 = null;
                this.Q0 = false;
                this.N0 = false;
                this.H0 = null;
                this.w0 = null;
                if (z4) {
                    PhotoViewer.r0().S2 = this.F0;
                    k47 k47Var2 = this.v0;
                    this.w0 = k47Var2;
                    nm7.f(k47Var2.K1).k(i, this.v0, Boolean.TRUE);
                } else {
                    long S = ndcVar2.S();
                    k47 k47Var3 = this.v0;
                    if (k47Var3 != null && k47.K4(k47Var3.k) && S > 0) {
                        k47 k47Var4 = this.v0;
                        k47Var4.d0 = (int) S;
                        nm7.f(k47Var4.K1).k(i, this.v0, Boolean.FALSE);
                    }
                    this.F0.l0();
                    this.F0 = null;
                }
                try {
                    this.K0.getWindow().clearFlags(128);
                } catch (Exception e3) {
                    fc4.g(e3, true);
                }
                if (this.v0 != null && !z4) {
                    gm.r(this.d1);
                    bc4.G(this.v0.K1).Z(this.v0.F0(), true, false);
                }
            }
        }
        y0();
        this.h0 = false;
        k47 k47Var5 = this.v0;
        if (k47Var5 != null) {
            if (this.B0) {
                bc4.G(k47Var5.K1).f(this.v0.F0());
            }
            k47 k47Var6 = this.v0;
            if (z) {
                k47Var6.F5();
                nm7.f(k47Var6.K1).k(nm7.e2, Integer.valueOf(this.v0.e1()), 0);
            }
            this.v0 = null;
            this.B0 = false;
            if (z) {
                lo7.p0.abandonAudioFocus(this);
                this.V = (byte) 0;
                ArrayList arrayList = this.f0;
                int i2 = -1;
                if (arrayList != null) {
                    if (!z3 || (i2 = arrayList.indexOf(k47Var6)) < 0) {
                        this.f0 = null;
                        this.g0 = null;
                    } else {
                        this.f0.remove(i2);
                        this.g0.remove(k47Var6.e1());
                        if (this.f0.isEmpty()) {
                            this.f0 = null;
                            this.g0 = null;
                        }
                    }
                }
                ArrayList arrayList2 = this.f0;
                if (arrayList2 == null || i2 >= arrayList2.size()) {
                    if ((k47.Q4(k47Var6.k) || k47Var6.g4()) && k47Var6.e1() != 0 && this.M && this.s != null && this.O && gda.k(true)) {
                        this.r = true;
                        int currentAccount = this.s.getCurrentAccount();
                        long a = this.s.a();
                        yv1 yv1Var = this.s;
                        k47 k47Var7 = yv1Var.m4;
                        int classGuid = yv1Var.getClassGuid();
                        yv1 yv1Var2 = this.s;
                        l3a X6 = yv1Var2 != null ? yv1Var2.X6() : null;
                        yv1 yv1Var3 = this.s;
                        long k7 = yv1Var3 != null ? yv1Var3.k7() : 0L;
                        yv1 yv1Var4 = this.s;
                        w0(currentAccount, a, null, k47Var7, null, classGuid, false, X6, k7, yv1Var4 != null ? yv1Var4.y5 : null);
                        this.P = true;
                    }
                    z5 = false;
                    nm7.f(k47Var6.K1).k(nm7.f2, Integer.valueOf(k47Var6.e1()), Boolean.valueOf(z2));
                    this.J0 = (byte) 0;
                    PipRoundVideoView pipRoundVideoView2 = this.I0;
                    if (pipRoundVideoView2 != null) {
                        pipRoundVideoView2.a(true);
                        this.I0 = null;
                    }
                } else {
                    k47 k47Var8 = (k47) this.f0.get(i2);
                    R(k47Var8);
                    if (!k47Var8.g4() && (pipRoundVideoView = this.I0) != null) {
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
        if (!z6 && z3 && !gda.k(true)) {
            yv1 yv1Var5 = this.s;
            z0(yv1Var5, z5, z5);
            this.s = yv1Var5;
        }
        if (!z2 || fp.f() == null) {
            return;
        }
        try {
            ie1 c = ie1.c(fp.f());
            if (c != null) {
                c.b().b(true);
            }
        } catch (Exception e4) {
            fc4.g(e4, true);
        }
    }

    public final void l0(boolean z, float f) {
        float f3;
        String str;
        if (z) {
            if (this.r0 >= 6.0f && f == 1.0f && this.v0 != null) {
                this.j0.f0();
                k47 k47Var = this.v0;
                gm.d3(new eu(this, k47Var, k47Var.b0, (byte) 1), 50L);
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
        ndc ndcVar = this.j0;
        if (ndcVar != null) {
            ndcVar.u0(Math.round(f * 10.0f) / 10.0f);
        } else {
            ndc ndcVar2 = this.F0;
            if (ndcVar2 != null) {
                ndcVar2.u0(Math.round(f * 10.0f) / 10.0f);
            }
        }
        SharedPreferences.Editor putFloat = oc7.d1().edit().putFloat(z ? "musicPlaybackSpeed" : "playbackSpeed", f);
        if (z) {
            f3 = this.t0;
            str = "fastMusicPlaybackSpeed";
        } else {
            f3 = this.s0;
            str = "fastPlaybackSpeed";
        }
        putFloat.putFloat(str, f3).commit();
        nm7.e().k(nm7.N4, new Object[0]);
        if (this.U1) {
            return;
        }
        fp.B(f);
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
            ndc ndcVar = this.j0;
            if (ndcVar != null) {
                ndcVar.A0(fp.w() ? 0.0f : f * this.Q1);
                return;
            }
            ndc ndcVar2 = this.F0;
            if (ndcVar2 != null) {
                if (fp.w()) {
                    f = 0.0f;
                }
                ndcVar2.A0(f);
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public final void n(m30 m30Var) {
        TLRPC.TL_document tL_document;
        File file = (File) m30Var.b;
        this.k1 = file;
        long j = m30Var.a;
        this.l1 = j;
        byte[] bArr = (byte[]) m30Var.c;
        String str = null;
        F0(file, j, bArr == null ? null : (byte[]) bArr.clone());
        if (this.C1 == 3) {
            this.L1 = m30Var;
            u30 u30Var = this.G1;
            if (u30Var != null) {
                ((h40) u30Var.e).o();
                u30Var.c = true;
                this.G1 = null;
            }
            X(false);
            i0(false);
            return;
        }
        hs6.d0(this.i1).D1(this.n1, this.o1, null);
        if (this.C1 == 1) {
            y5a f = y5a.f(this.g1, null, file.getAbsolutePath(), this.n1, this.r1, this.s1, null, null, null, null, this.D1, this.E1, 0, this.F1 ? Integer.MAX_VALUE : 0, null, null, false);
            f.R = this.p1;
            f.T = this.q1;
            f.H = this.t1;
            f.K = this.u1;
            f.Q = 0L;
            a6a.B(this.i1).q0(f);
        }
        nm7 f3 = nm7.f(this.i1);
        Integer valueOf = Integer.valueOf(this.h1);
        if (this.C1 == 2) {
            TLRPC.TL_document tL_document2 = this.g1;
            str = file.getAbsolutePath();
            tL_document = tL_document2;
        } else {
            tL_document = null;
        }
        f3.k(nm7.s2, valueOf, tL_document, str);
        s(true);
    }

    public final boolean n0(ArrayList arrayList, k47 k47Var, long j, boolean z, ko6 ko6Var, long j2) {
        HashMap hashMap;
        k47 k47Var2 = this.v0;
        ArrayList arrayList2 = this.S0;
        if (k47Var2 == k47Var) {
            int indexOf = arrayList2.indexOf(k47Var);
            if (indexOf >= 0) {
                this.V0 = indexOf;
            }
            return R(k47Var);
        }
        this.W0 = !z;
        this.Z0 = j;
        this.C0 = !arrayList2.isEmpty();
        m();
        this.D0 = ko6Var;
        this.b1 = j2;
        boolean z2 = false;
        if (!arrayList.isEmpty() && pg3.B(k47.B0(((k47) arrayList.get(0)).k))) {
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
            k47 k47Var3 = (k47) arrayList.get(size);
            if (k47Var3.I3()) {
                int e1 = k47Var3.e1();
                if (e1 > 0 || z2) {
                    i = Math.min(i, e1);
                    i2 = Math.max(i2, e1);
                }
                arrayList2.add(k47Var3);
                hashMap.put(Integer.valueOf(e1), k47Var3);
            }
            size--;
        }
        s0();
        int indexOf2 = arrayList2.indexOf(k47Var);
        this.V0 = indexOf2;
        if (indexOf2 == -1) {
            m();
            this.V0 = arrayList2.size();
            arrayList2.add(k47Var);
            hashMap.put(Integer.valueOf(k47Var.e1()), k47Var);
        }
        if (k47Var.I3() && !k47Var.r1) {
            if (gda.J0) {
                b();
            }
            if (z) {
                if (this.D0 == null) {
                    final hs6 d0 = hs6.d0(k47Var.K1);
                    final long B0 = k47.B0(k47Var.k);
                    final long j3 = this.b1;
                    final long j4 = i;
                    final long j5 = i2;
                    d0.getMessagesStorage().a.c(new Runnable() { // from class: ir6
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
                            ir6 ir6Var = this;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            int i3 = 0;
                            while (true) {
                                hs6 hs6Var = hs6.this;
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
                                        SQLiteDatabase sQLiteDatabase = hs6Var.getMessagesStorage().b;
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
                                        fc4.g(e, true);
                                        gm.c3(new ev4(hs6Var, j7, arrayList3, arrayList5, j6));
                                    }
                                } else {
                                    arrayList3 = arrayList4;
                                    if (i4 == 0) {
                                        if (pg3.B(j7)) {
                                            SQLiteDatabase sQLiteDatabase2 = hs6Var.getMessagesStorage().b;
                                            Locale locale2 = Locale.US;
                                            sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j7 + " AND mid > " + j8 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        } else {
                                            SQLiteDatabase sQLiteDatabase3 = hs6Var.getMessagesStorage().b;
                                            Locale locale3 = Locale.US;
                                            sQLiteCursor2 = sQLiteDatabase3.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j7 + " AND mid < " + j8 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        }
                                    } else if (pg3.B(j7)) {
                                        SQLiteDatabase sQLiteDatabase4 = hs6Var.getMessagesStorage().b;
                                        Locale locale4 = Locale.US;
                                        r1 = 0;
                                        sQLiteCursor = sQLiteDatabase4.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j7 + " AND mid < " + j9 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        while (sQLiteCursor.next()) {
                                            try {
                                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(r1);
                                                if (byteBufferValue != 0) {
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r1), r1);
                                                    TLdeserialize.readAttachPath(byteBufferValue, hs6Var.getUserConfig().n);
                                                    byteBufferValue.reuse();
                                                    if (k47.K3(TLdeserialize)) {
                                                        TLdeserialize.id = sQLiteCursor.intValue(1);
                                                        TLdeserialize.dialog_id = j7;
                                                        z3 = false;
                                                        arrayList6.add(0, new k47(hs6Var.currentAccount, TLdeserialize, false, true));
                                                    } else {
                                                        z3 = false;
                                                    }
                                                } else {
                                                    z3 = r1;
                                                }
                                                r1 = z3;
                                            } catch (Exception e3) {
                                                e = e3;
                                                fc4.g(e, true);
                                                gm.c3(new ev4(hs6Var, j7, arrayList3, arrayList5, j6));
                                            }
                                        }
                                        sQLiteCursor.dispose();
                                        i3 = i4 + 1;
                                        ir6Var = this;
                                        arrayList4 = arrayList3;
                                    } else {
                                        SQLiteDatabase sQLiteDatabase5 = hs6Var.getMessagesStorage().b;
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
                                ir6Var = this;
                                arrayList4 = arrayList3;
                                gm.c3(new ev4(hs6Var, j7, arrayList3, arrayList5, j6));
                            }
                            arrayList3 = arrayList4;
                            gm.c3(new ev4(hs6Var, j7, arrayList3, arrayList5, j6));
                        }
                    });
                } else {
                    this.a1 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return R(k47Var);
    }

    public final void o0(TextureView textureView, jy jyVar, FrameLayout frameLayout, boolean z) {
        if (textureView != null) {
            if (!z && this.H0 == textureView) {
                this.J0 = (byte) 1;
                this.H0 = null;
                this.M0 = null;
                this.O0 = null;
                return;
            }
            ndc ndcVar = this.F0;
            if (ndcVar == null || textureView == this.H0) {
                return;
            }
            this.N0 = jyVar != null && jyVar.d;
            this.H0 = textureView;
            PipRoundVideoView pipRoundVideoView = this.I0;
            if (pipRoundVideoView != null) {
                ndcVar.z0(pipRoundVideoView.c);
            } else {
                ndcVar.z0(textureView);
            }
            this.M0 = jyVar;
            this.O0 = frameLayout;
            if (!this.Q0 || jyVar == null) {
                return;
            }
            jyVar.a(this.P0, 0);
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        gm.c3(new bm3((Object) this, i, (byte) 20));
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
        k47 k47Var;
        if (this.Q && VoIPService.getSharedInstance() == null) {
            if (sensorEvent.sensor.getType() == 8) {
                if (e21.a) {
                    fc4.b("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
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
                                boolean z5 = e21.a;
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
            boolean z6 = (this.y0 || this.v0 != null || !gda.k(z) || !a.w || this.N || !this.O || this.s == null || this.X) ? false : z;
            boolean z7 = (gda.k(false) && (k47Var = this.v0) != null && (k47.Q4(k47Var.k) || this.v0.g4())) ? z : false;
            boolean z8 = this.J;
            boolean z9 = (this.F == 6 || this.w || System.currentTimeMillis() - this.x < 60) ? z : false;
            boolean z10 = (this.M || this.r) ? z : false;
            boolean z11 = ((z9 || z10) && !t() && !VoIPService.isAnyKindOfCallActive() && (z6 || z7) && !PhotoViewer.r0().V0()) ? z : false;
            PowerManager.WakeLock wakeLock = this.d;
            if (wakeLock != null) {
                if (wakeLock.isHeld()) {
                    if (!z11) {
                        if (e21.a) {
                            fc4.b("wake lock releasing (proximityDetected=" + z8 + ", accelerometerDetected=" + z9 + ", alreadyPlaying=" + z10 + ")");
                        }
                        this.d.release();
                    }
                } else if (z11) {
                    if (e21.a) {
                        fc4.b("wake lock acquiring (proximityDetected=" + z8 + ", accelerometerDetected=" + z9 + ", alreadyPlaying=" + z10 + ")");
                    }
                    this.d.acquire();
                }
            }
            if (this.J) {
                if (z11) {
                    if (z6 && this.M1 == null) {
                        if (!this.r) {
                            if (e21.a) {
                                fc4.b("start record");
                            }
                            this.M = z;
                            if (this.g1 == null) {
                                yv1 yv1Var = this.s;
                                ArrayList arrayList2 = yv1Var.M6;
                                ms1 ms1Var = yv1Var.a0;
                                if (ms1Var == null || !ms1Var.U0()) {
                                    int size = arrayList2.size() - 1;
                                    while (true) {
                                        if (size >= 0) {
                                            k47 k47Var2 = (k47) arrayList2.get(size);
                                            if ((k47.Q4(k47Var2.k) || k47Var2.g4()) && k47Var2.k.media_unread && !k47Var2.N3()) {
                                                MediaController w = w();
                                                if (w().R(k47Var2)) {
                                                    z3 = true;
                                                    arrayList = yv1Var.j6(k47Var2, true);
                                                } else {
                                                    z3 = true;
                                                    arrayList = null;
                                                }
                                                w.q0(arrayList, z3);
                                            } else {
                                                size--;
                                            }
                                        } else if (yv1Var.getParentActivity() != null && yv1Var.getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                            yv1Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
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
                        if (e21.a) {
                            fc4.b("start listen");
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
                        if (e21.a) {
                            fc4.b("start listen by proximity only");
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
                    if (e21.a) {
                        fc4.b("stop record");
                    }
                    V(false);
                    this.r = false;
                    this.P = false;
                } else if (this.M) {
                    if (e21.a) {
                        fc4.b("stop listen");
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
        AudioManager audioManager = lo7.p0;
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
                k47 k47Var = (k47) this.f0.get(i);
                this.g0.put(k47Var.e1(), k47Var);
            }
        }
    }

    public final void s(boolean z) {
        File file;
        X(false);
        i0(false);
        u30 u30Var = this.G1;
        if (u30Var != null) {
            ((h40) u30Var.e).o();
            u30Var.c = true;
            this.G1 = null;
        }
        if (!z && (file = this.k1) != null) {
            s70.b(file);
            this.k1.delete();
        }
        Y();
        this.y0 = false;
        this.r = false;
        this.P = false;
    }

    public final void s0() {
        Collections.sort(this.S0, new tk6((byte) 2));
    }

    public final void t0(boolean z) {
        k47 k47Var = this.v0;
        if (k47Var != null) {
            nm7.f(k47Var.K1).k(nm7.u2, Boolean.valueOf(this.M));
            ndc ndcVar = this.F0;
            byte b = 3;
            if (ndcVar != null) {
                ndcVar.w0(this.M ? 0 : 3);
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
            ndc ndcVar2 = this.j0;
            boolean z2 = ndcVar2 != null;
            k47 k47Var2 = this.v0;
            float f = k47Var2.b0;
            int i = k47Var2.j0;
            if (z || ndcVar2 == null || !ndcVar2.c0() || i * f > 1.0f) {
                k47Var2.b0 = f;
            } else {
                k47Var2.b0 = 0.0f;
            }
            l(false, true, false, false);
            R(k47Var2);
            if (z) {
                if (z2) {
                    gm.d3(new lj6(this, k47Var2, b), 100L);
                } else {
                    Q(k47Var2, true);
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
    /* JADX WARN: Type inference failed for: r2v4, types: [g10] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mi2 u() {
        FileOutputStream fileOutputStream;
        ji2 ji2Var;
        ji2 ji2Var2;
        ?? r11;
        k47 k47Var = this.v0;
        FileOutputStream fileOutputStream2 = null;
        String str = null;
        if (k47Var != null) {
            ?? r2 = 1;
            r2 = 1;
            String y1 = k47Var.y1(true);
            String w1 = this.v0.w1(true);
            TLRPC.Document F0 = this.v0.F0();
            if (this.v0.g4() || k47.K4(this.v0.k) || this.v0.I3()) {
                k47 k47Var2 = this.v0;
                File file = (!k47Var2.y0 || k47Var2.k == null) ? null : new File(this.v0.k.attachPath);
                if (file == null || !file.exists()) {
                    bc4.G(this.v0.K1);
                    file = bc4.M(this.v0.k, false, true);
                }
                if (file != null && file.exists()) {
                    String t1 = this.v0.t1();
                    Uri parse = Uri.parse("file://" + file.getAbsolutePath());
                    it6 it6Var = new it6(0);
                    g10 g10Var = this.E0;
                    if (g10Var != null) {
                        if (!TextUtils.isEmpty(g10Var.c)) {
                            it6Var.b("com.google.android.gms.cast.metadata.TITLE", this.E0.c);
                        }
                        if (!TextUtils.isEmpty(this.E0.d)) {
                            it6Var.b("com.google.android.gms.cast.metadata.ARTIST", this.E0.d);
                        }
                        if (!TextUtils.isEmpty(this.E0.f)) {
                            it6Var.b("com.google.android.gms.cast.metadata.ALBUM_TITLE", this.E0.f);
                        }
                        if (!TextUtils.isEmpty(this.E0.e)) {
                            it6Var.b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", this.E0.e);
                        }
                        if (!TextUtils.isEmpty(this.E0.m)) {
                            it6Var.b("com.google.android.gms.cast.metadata.COMPOSER", this.E0.m);
                        }
                        short s = this.E0.k;
                        Bundle bundle = it6Var.b;
                        if (s != 0) {
                            r11 = "com.google.android.gms.cast.metadata.DISC_NUMBER";
                            it6.c(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", s);
                        }
                        short s2 = this.E0.j;
                        FileOutputStream fileOutputStream3 = r11;
                        if (s2 != 0) {
                            it6.c(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", s2);
                            fileOutputStream3 = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
                        }
                        g10 g10Var2 = this.E0;
                        if (g10Var2.o != null) {
                            File file2 = g10Var2.q;
                            if (file2 == null || !file2.exists()) {
                                file2 = g6b.w(z8c.t0, "jpg");
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
                                                fc4.g(e, true);
                                                fileOutputStream3 = fileOutputStream;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            fc4.g(e, true);
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception e4) {
                                                    fc4.g(e4, true);
                                                }
                                            }
                                            file2 = null;
                                            fileOutputStream3 = fileOutputStream;
                                            r2 = this.E0;
                                            r2.q = file2;
                                            if (file2 != null) {
                                                mx6 mx6Var = (mx6) hi2.v().b;
                                                ji2Var = (ji2) mx6Var.b;
                                                if (ji2Var != null) {
                                                }
                                                str = "/file" + Utilities.c.nextLong();
                                                ji2Var2 = (ji2) mx6Var.b;
                                                if (ji2Var2 == null) {
                                                }
                                                ji2Var2.k(file2, str);
                                                it6Var.a.add(new wuc(Uri.parse(ji2.i(ji2.h(), str)), 0, 0));
                                            }
                                            ki2 ki2Var = new ki2(t1, parse, "/player_" + this.v0.e1());
                                            ki2Var.e = y1;
                                            ki2Var.f = w1;
                                            ki2Var.h = it6Var;
                                            return new mi2(new li2(ki2Var));
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream2 = fileOutputStream3;
                                        if (fileOutputStream2 != null) {
                                            try {
                                                fileOutputStream2.close();
                                            } catch (Exception e5) {
                                                fc4.g(e5, r2);
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
                                mx6 mx6Var2 = (mx6) hi2.v().b;
                                ji2Var = (ji2) mx6Var2.b;
                                if (ji2Var != null) {
                                    Pair pair = ji2Var.i;
                                    if ((pair == null ? null : (File) pair.second) != null) {
                                        if (TextUtils.equals((pair == null ? null : (File) pair.second).getAbsolutePath(), file2.getAbsolutePath())) {
                                            Pair pair2 = ((ji2) mx6Var2.b).i;
                                            if (pair2 != null) {
                                                str = (String) pair2.first;
                                            }
                                            it6Var.a.add(new wuc(Uri.parse(ji2.i(ji2.h(), str)), 0, 0));
                                        }
                                    }
                                }
                                str = "/file" + Utilities.c.nextLong();
                                ji2Var2 = (ji2) mx6Var2.b;
                                if (ji2Var2 == null) {
                                    ji2Var2 = new ji2();
                                    mx6Var2.b = ji2Var2;
                                }
                                ji2Var2.k(file2, str);
                                it6Var.a.add(new wuc(Uri.parse(ji2.i(ji2.h(), str)), 0, 0));
                            }
                        }
                    }
                    ki2 ki2Var2 = new ki2(t1, parse, "/player_" + this.v0.e1());
                    ki2Var2.e = y1;
                    ki2Var2.f = w1;
                    ki2Var2.h = it6Var;
                    return new mi2(new li2(ki2Var2));
                }
            }
            ndc ndcVar = this.F0;
            if (ndcVar != null) {
                return ndcVar.Q(kt6.q(new StringBuilder(), F0 != null ? F0.id : this.v0.e1(), ""), y1, w1);
            }
            ndc ndcVar2 = this.j0;
            if (ndcVar2 != null) {
                return ndcVar2.Q(kt6.q(new StringBuilder(), F0 != null ? F0.id : this.v0.e1(), ""), y1, w1);
            }
        }
        return null;
    }

    public final void u0(k47 k47Var) {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e) {
                    fc4.g(e, true);
                }
            }
            k47Var.S0();
            Timer timer2 = new Timer();
            this.z0 = timer2;
            timer2.schedule(new yy2(this, k47Var, (byte) 2), 0L, 17L);
        }
    }

    public final void v0(yv1 yv1Var) {
        if (yv1Var != null) {
            if ((this.f == null && this.n == null) || this.e == null) {
                return;
            }
            if (!gda.k(false)) {
                k47 k47Var = this.v0;
                if (k47Var == null) {
                    return;
                }
                if (!k47.Q4(k47Var.k) && !this.v0.g4()) {
                    return;
                }
            }
            this.s = yv1Var;
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
            Utilities.e.c(new zm6(this, (byte) 3));
            this.Q = true;
        }
    }

    public final void w0(int i, long j, k47 k47Var, k47 k47Var2, TL_stories.StoryItem storyItem, int i2, boolean z, l3a l3aVar, long j2, v67 v67Var) {
        k47 k47Var3 = this.v0;
        boolean z2 = (k47Var3 == null || !D(k47Var3) || C()) ? false : true;
        this.y0 = z;
        X(true);
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.I1 && !W()) {
            gm.c3(new rt2(i, i2, (byte) 5));
            return;
        }
        if (!r0(i)) {
            if (e21.a) {
                fc4.b("AudioRecorder legacy selected: account=" + i + ", dialog=" + j + ", guid=" + i2);
            }
            an6 an6Var = new an6(this, i, i2, j, j2, v67Var, k47Var2, k47Var, storyItem, l3aVar);
            this.M1 = an6Var;
            this.N1.d(an6Var, z2 ? 500L : 50L);
            return;
        }
        this.I1 = true;
        this.J1 = false;
        this.K1 = false;
        this.i1 = i;
        this.h1 = i2;
        this.n1 = j;
        this.p1 = j2;
        this.q1 = v67Var;
        this.o1 = k47Var2 == null ? 0L : k47.b2(i, k47Var2.k, false, false);
        this.r1 = k47Var;
        this.s1 = k47Var2;
        this.t1 = storyItem;
        this.u1 = l3aVar;
        this.j1 = null;
        this.k1 = null;
        this.l1 = 0L;
        this.m1 = 0;
        this.w1 = 0L;
        this.C1 = (byte) 0;
        dn6 dn6Var = new dn6(this, i, j, i2, (byte) 0);
        this.H1 = dn6Var;
        gm.d3(dn6Var, z2 ? 500L : 50L);
    }

    public final float x(boolean z) {
        return z ? this.r0 : this.q0;
    }

    public final void x0() {
        if (this.c0.isEmpty()) {
            return;
        }
        oo6 oo6Var = (oo6) this.c0.get(0);
        rcc rccVar = oo6Var.b;
        synchronized (this.b) {
            if (rccVar != null) {
                rccVar.V = false;
            }
        }
        new Thread(new pg6(oo6Var, (byte) 10)).start();
    }

    public final long y(k47 k47Var) {
        k47 k47Var2 = this.v0;
        if ((this.j0 != null || this.F0 != null) && k47Var != null && k47Var2 != null && G(k47Var)) {
            try {
                ndc ndcVar = this.j0;
                if (ndcVar != null) {
                    return ndcVar.S();
                }
                ndc ndcVar2 = this.F0;
                if (ndcVar2 != null) {
                    return ndcVar2.S();
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
                    fc4.g(e, true);
                }
            }
        }
    }

    public final void z0(yv1 yv1Var, boolean z, boolean z2) {
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
        if ((this.f == null && this.n == null) || this.e == null || this.s != yv1Var) {
            return;
        }
        this.s = null;
        this.Q = false;
        this.w = false;
        this.J = false;
        this.r = false;
        this.M = false;
        Utilities.e.c(new zm6(this, (byte) 5));
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
