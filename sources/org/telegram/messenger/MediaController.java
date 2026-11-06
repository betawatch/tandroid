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
import android.view.View;
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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.t51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hy0;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public class MediaController implements AudioManager.OnAudioFocusChangeListener, ls, SensorEventListener {
    public static final String[] V1;
    public static final String[] W1;
    public static final ConcurrentHashMap X1;
    public static Runnable Y1;
    public static we Z1;
    public static we a2;
    public static ArrayList b2;
    public static ArrayList c2;
    public static jg.c1 d2;
    public static volatile MediaController e2;
    public static long f2;
    public static boolean g2;
    public boolean A0;
    public boolean B0;
    public int B1;
    public h2.a0 C0;
    public boolean C1;
    public int D;
    public rf.a D0;
    public int D1;
    public int E;
    public t51 E0;
    public boolean E1;
    public int F;
    public boolean F0;
    public e0.g F1;
    public long G;
    public TextureView G0;
    public di.d1 G1;
    public PipRoundVideoView H0;
    public boolean H1;
    public boolean I;
    public int I0;
    public boolean I1;
    public boolean J;
    public LaunchActivity J0;
    public boolean J1;
    public View K0;
    public ac.e K1;
    public boolean L;
    public org.telegram.ui.j4 L0;
    public wd L1;
    public boolean M;
    public boolean M0;
    public final p5 M1;
    public boolean N;
    public FrameLayout N0;
    public final p5 N1;
    public boolean O;
    public float O0;
    public final m.f3 O1;
    public boolean P;
    public boolean P0;
    public float P1;
    public float Q;
    public kp Q0;
    public ValueAnimator Q1;
    public final di.m4 R1;
    public androidx.emoji2.text.j S1;
    public boolean T1;
    public int U;
    public int U0;
    public jf U1;
    public boolean V;
    public boolean V0;
    public boolean W;
    public boolean X0;
    public boolean Y;
    public long Y0;
    public int Z0;
    public lf a0;
    public long a1;
    public SensorManager c;
    public PowerManager.WakeLock d;
    public boolean d0;
    public boolean d1;
    public Sensor e;
    public ArrayList e0;
    public AudioRecord e1;
    public Sensor f;
    public SparseArray f0;
    public TLRPC.TL_document f1;
    public Sensor h;
    public int h1;
    public File i1;
    public File j1;
    public long k1;
    public boolean l0;
    public int l1;
    public int m0;
    public long m1;
    public Sensor n;
    public String n0;
    public long n1;
    public long o0;
    public long o1;
    public nj p1;
    public ij q1;
    public boolean r;
    public ij r1;
    public org.telegram.ui.an s;
    public TL_stories.StoryItem s1;
    public float t0;
    public hw t1;
    public ij u0;
    public ij v0;
    public long v1;
    public boolean w;
    public ef w0;
    public long x;
    public boolean x0;
    public int y;
    public final ByteBuffer y1;
    public final ud a = new AudioManager.OnAudioFocusChangeListener() { // from class: org.telegram.messenger.ud
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i7) {
            MediaController mediaController = MediaController.this;
            if (i7 != 1) {
                mediaController.V = false;
            } else {
                String[] strArr = MediaController.V1;
                mediaController.getClass();
            }
        }
    };
    public final Object b = new Object();
    public long H = 0;
    public float K = -100.0f;
    public final float[] R = new float[3];
    public final float[] S = new float[3];
    public final float[] T = new float[3];
    public int X = 0;
    public final ArrayList Z = new ArrayList();
    public final ArrayList b0 = new ArrayList();
    public final HashMap c0 = new HashMap();
    public boolean g0 = false;
    public boolean h0 = false;
    public t51 i0 = null;
    public t51 j0 = null;
    public int k0 = 0;
    public float p0 = 1.0f;
    public float q0 = 1.0f;
    public float r0 = 1.0f;
    public float s0 = 1.0f;
    public Timer y0 = null;
    public final Object z0 = new Object();
    public final ArrayList R0 = new ArrayList();
    public final HashMap S0 = new HashMap();
    public final ArrayList T0 = new ArrayList();
    public final boolean[] W0 = {false, false};
    public final int[] b1 = {ConnectionsManager.DEFAULT_DATACENTER_ID, ConnectionsManager.DEFAULT_DATACENTER_ID};
    public final se c1 = new se(this);
    public int g1 = -1;
    public short[] u1 = new short[1024];
    public final Object w1 = new Object();
    public final ArrayList x1 = new ArrayList();
    public int z1 = 1280;
    public int A1 = 48000;

    static {
        int i7 = Build.VERSION.SDK_INT;
        V1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i7 > 28 ? "date_modified" : "datetaken", "orientation", "width", "height", "_size"};
        W1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i7 > 28 ? "date_modified" : "datetaken", "duration", "width", "height", "_size"};
        X1 = new ConcurrentHashMap();
        b2 = new ArrayList();
        c2 = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.telegram.messenger.ud] */
    public MediaController() {
        Handler handler = null;
        int i7 = 2;
        int i10 = 6;
        this.O1 = new m.f3(this, i10);
        this.R1 = new di.m4(this, i10);
        p5 p5Var = new p5("recordQueue");
        this.M1 = p5Var;
        p5Var.setPriority(10);
        p5 p5Var2 = new p5("fileEncodingQueue");
        this.N1 = p5Var2;
        p5Var2.setPriority(10);
        p5Var.c(new vd(this, 0));
        int i11 = 1;
        Utilities.e.c(new vd(this, i11));
        this.y1 = ByteBuffer.allocateDirect(1920);
        g0.h3(new vd(this, i7));
        ContentResolver contentResolver = t0.b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.f2(handler, i11));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.f2(handler, i7));
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.f2(handler, i11));
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.f2(handler, i7));
        } catch (Exception e13) {
            a8.g(e13, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[Catch: Exception -> 0x0053, TryCatch #4 {Exception -> 0x0053, blocks: (B:7:0x0008, B:12:0x0059, B:14:0x0066, B:44:0x004f), top: B:6:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String A(Uri uri) {
        Uri uri2;
        if (uri == null) {
            return "";
        }
        try {
            String str = null;
            if (uri.getScheme().equals("content")) {
                try {
                    uri2 = uri;
                    try {
                        Cursor query = t0.b.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                        try {
                            if (query.moveToFirst()) {
                                str = query.getString(query.getColumnIndex("_display_name"));
                            }
                            query.close();
                        } finally {
                        }
                    } catch (Exception e10) {
                        e = e10;
                        a8.g(e, true);
                        if (str == null) {
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    uri2 = uri;
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
        } catch (Exception e12) {
            a8.g(e12, true);
            return "";
        }
    }

    public static MediaController B() {
        MediaController mediaController;
        MediaController mediaController2 = e2;
        if (mediaController2 != null) {
            return mediaController2;
        }
        synchronized (MediaController.class) {
            try {
                mediaController = e2;
                if (mediaController == null) {
                    mediaController = new MediaController();
                    e2 = mediaController;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaController;
    }

    public static int E(String str) {
        int i7;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i7 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e10) {
            a8.g(e10, true);
            i7 = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        return i7;
    }

    public static boolean G(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = t0.b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[3];
                    if (inputStream.read(bArr, 0, 3) == 3) {
                        if (new String(bArr).equalsIgnoreCase("gif")) {
                            try {
                                inputStream.close();
                                return true;
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                return true;
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e12) {
                a8.g(e12, true);
                return false;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
            }
            throw th2;
        }
    }

    public static void H0(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String h = rf.b.h(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = h.getBytes("UTF-8");
        int length = bytes.length + bytes2.length + 2;
        if (length > 65535) {
            throw new IOException(jg.g.j(length, "XMP segment too large: "));
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read();
            int read2 = fileInputStream.read();
            if (read != 255 || read2 != 216) {
                throw new IOException("Not a JPEG: " + file);
            }
            outputStream.write(qs.e4);
            outputStream.write(qs.t3);
            outputStream.write(qs.e4);
            outputStream.write(qs.C3);
            outputStream.write((length >> 8) & qs.e4);
            outputStream.write(length & qs.e4);
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
                            if (read4 <= 0) {
                                fileInputStream.close();
                                return;
                            } else {
                                if (zArr != null && zArr[0]) {
                                    fileInputStream.close();
                                    return;
                                }
                                outputStream.write(bArr2, 0, read4);
                            }
                        }
                    } finally {
                    }
                } else {
                    if (zArr != null && zArr[0]) {
                        fileInputStream.close();
                        return;
                    }
                    outputStream.write(bArr, 0, read3);
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0042 -> B:25:0x004e). Please report as a decompilation issue!!! */
    public static boolean M(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = t0.b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[12];
                    if (inputStream.read(bArr, 0, 12) == 12) {
                        String lowerCase = new String(bArr).toLowerCase();
                        if (lowerCase.startsWith("riff")) {
                            if (lowerCase.endsWith("webp")) {
                                try {
                                    inputStream.close();
                                    return true;
                                } catch (Exception e10) {
                                    a8.g(e10, true);
                                    return true;
                                }
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e12) {
                        a8.g(e12, true);
                    }
                }
                throw th2;
            }
        } catch (Exception e13) {
            a8.g(e13, true);
        }
    }

    public static void O(int i7) {
        Thread thread = new Thread(new hi.j2(i7, 2));
        thread.setPriority(1);
        thread.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int Q(int i7, int i10, int i11, int i12, int i13) {
        int i14;
        float f10;
        float f11 = 1.0f;
        if (Math.min(i12, i13) >= 1080) {
            i14 = 6800000;
        } else {
            if (Math.min(i12, i13) < 720) {
                if (Math.min(i12, i13) >= 480) {
                    i14 = 1000000;
                    f11 = 0.75f;
                    f10 = 0.9f;
                } else {
                    i14 = 750000;
                    f11 = 0.6f;
                    f10 = 0.7f;
                }
                int min = (int) (((int) (i11 / Math.min(i7 / i12, i10 / i13))) * f11);
                int D = (int) (((int) com.google.android.recaptcha.internal.a.D(f10, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i13 * i12)));
                return i11 >= D ? min : min > i14 ? i14 : Math.max(min, D);
            }
            i14 = 2600000;
        }
        f10 = 1.0f;
        int min2 = (int) (((int) (i11 / Math.min(i7 / i12, i10 / i13))) * f11);
        int D2 = (int) (((int) com.google.android.recaptcha.internal.a.D(f10, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i13 * i12)));
        if (i11 >= D2) {
        }
    }

    public static /* synthetic */ void a(MediaController mediaController, boolean z9) {
        mediaController.stopRecord();
        TLRPC.TL_document tL_document = mediaController.f1;
        File N = mediaController.N(mediaController.i1, mediaController.j1, tL_document);
        if (tL_document == null || N == null) {
            return;
        }
        g0.h3(new aa.d0(mediaController, N, z9, tL_document, 13));
    }

    public static void b(final MediaController mediaController, final int i7, final int i10, long j3, long j10, nj njVar, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem, hw hwVar) {
        String absolutePath;
        final int i11 = 0;
        if (mediaController.e1 != null) {
            g0.h3(new Runnable(mediaController) { // from class: org.telegram.messenger.be
                public final /* synthetic */ MediaController b;

                {
                    this.b = mediaController;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i11;
                    int i13 = i10;
                    int i14 = i7;
                    MediaController mediaController2 = this.b;
                    switch (i12) {
                        case 0:
                            mediaController2.L1 = null;
                            qs.f(i14).k(qs.m2, Integer.valueOf(i13));
                            break;
                        case 1:
                            mediaController2.L1 = null;
                            qs.f(i14).k(qs.m2, Integer.valueOf(i13));
                            break;
                        case 2:
                            mediaController2.L1 = null;
                            qs.f(i14).k(qs.m2, Integer.valueOf(i13));
                            break;
                        default:
                            mediaController2.L1 = null;
                            qs.f(i14).k(qs.l2, Integer.valueOf(i13), Boolean.TRUE);
                            break;
                    }
                }
            });
            return;
        }
        final int i12 = 1;
        j0(true);
        mediaController.B1 = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        mediaController.f1 = tL_document;
        mediaController.g1 = i10;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = TLObject.FLAG_31;
        tL_document.id = iz.p();
        mediaController.f1.user_id = p10.i(i7).e();
        TLRPC.TL_document tL_document2 = mediaController.f1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        iz.y();
        mediaController.j1 = new qe(w7.z(1), System.currentTimeMillis() + "_" + w7.r(null, mediaController.f1));
        w7.z(4).mkdirs();
        if (r2.a) {
            a8.b("start recording internal " + mediaController.j1.getPath() + " " + mediaController.j1.exists());
        }
        File file = mediaController.j1;
        Set set = z0.a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            z0.a.add(absolutePath);
        }
        try {
            if (mediaController.startRecord(mediaController.j1.getPath(), mediaController.A1) == 0) {
                g0.h3(new Runnable(mediaController) { // from class: org.telegram.messenger.be
                    public final /* synthetic */ MediaController b;

                    {
                        this.b = mediaController;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i12;
                        int i13 = i10;
                        int i14 = i7;
                        MediaController mediaController2 = this.b;
                        switch (i122) {
                            case 0:
                                mediaController2.L1 = null;
                                qs.f(i14).k(qs.m2, Integer.valueOf(i13));
                                break;
                            case 1:
                                mediaController2.L1 = null;
                                qs.f(i14).k(qs.m2, Integer.valueOf(i13));
                                break;
                            case 2:
                                mediaController2.L1 = null;
                                qs.f(i14).k(qs.m2, Integer.valueOf(i13));
                                break;
                            default:
                                mediaController2.L1 = null;
                                qs.f(i14).k(qs.l2, Integer.valueOf(i13), Boolean.TRUE);
                                break;
                        }
                    }
                });
                if (r2.a) {
                    a8.b("cant init encoder");
                    return;
                }
                return;
            }
            mediaController.d1 = false;
            mediaController.e1 = new AudioRecord(0, mediaController.A1, 16, 2, mediaController.z1);
            System.currentTimeMillis();
            long j11 = 0;
            mediaController.k1 = 0L;
            mediaController.l1 = 0;
            mediaController.v1 = 0L;
            mediaController.m1 = j3;
            mediaController.o1 = j10;
            mediaController.p1 = njVar;
            if (ijVar != null) {
                j11 = ij.c2(mediaController.h1, ijVar.k, false, false);
            }
            mediaController.n1 = j11;
            mediaController.h1 = i7;
            mediaController.q1 = ijVar2;
            mediaController.r1 = ijVar;
            mediaController.s1 = storyItem;
            mediaController.t1 = hwVar;
            mediaController.y1.rewind();
            mediaController.e1.startRecording();
            mediaController.M1.c(mediaController.O1);
            final int i13 = 3;
            g0.h3(new Runnable(mediaController) { // from class: org.telegram.messenger.be
                public final /* synthetic */ MediaController b;

                {
                    this.b = mediaController;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i13;
                    int i132 = i10;
                    int i14 = i7;
                    MediaController mediaController2 = this.b;
                    switch (i122) {
                        case 0:
                            mediaController2.L1 = null;
                            qs.f(i14).k(qs.m2, Integer.valueOf(i132));
                            break;
                        case 1:
                            mediaController2.L1 = null;
                            qs.f(i14).k(qs.m2, Integer.valueOf(i132));
                            break;
                        case 2:
                            mediaController2.L1 = null;
                            qs.f(i14).k(qs.m2, Integer.valueOf(i132));
                            break;
                        default:
                            mediaController2.L1 = null;
                            qs.f(i14).k(qs.l2, Integer.valueOf(i132), Boolean.TRUE);
                            break;
                    }
                }
            });
        } catch (Exception e10) {
            a8.g(e10, true);
            mediaController.f1 = null;
            mediaController.stopRecord();
            z0.b(mediaController.j1);
            mediaController.j1.delete();
            mediaController.j1 = null;
            File file2 = mediaController.i1;
            if (file2 != null) {
                file2.delete();
                mediaController.i1 = null;
            }
            try {
                mediaController.e1.release();
                mediaController.e1 = null;
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            j0(false);
            final int i14 = 2;
            g0.h3(new Runnable(mediaController) { // from class: org.telegram.messenger.be
                public final /* synthetic */ MediaController b;

                {
                    this.b = mediaController;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i14;
                    int i132 = i10;
                    int i142 = i7;
                    MediaController mediaController2 = this.b;
                    switch (i122) {
                        case 0:
                            mediaController2.L1 = null;
                            qs.f(i142).k(qs.m2, Integer.valueOf(i132));
                            break;
                        case 1:
                            mediaController2.L1 = null;
                            qs.f(i142).k(qs.m2, Integer.valueOf(i132));
                            break;
                        case 2:
                            mediaController2.L1 = null;
                            qs.f(i142).k(qs.m2, Integer.valueOf(i132));
                            break;
                        default:
                            mediaController2.L1 = null;
                            qs.f(i142).k(qs.l2, Integer.valueOf(i132), Boolean.TRUE);
                            break;
                    }
                }
            });
        }
    }

    public static /* synthetic */ void c(final MediaController mediaController, File file, File file2, final TLRPC.TL_document tL_document, final int i7, final boolean z9, final int i10, final boolean z10) {
        mediaController.stopRecord();
        final File N = mediaController.N(file, file2, tL_document);
        if (N == null) {
            if (r2.a) {
                a8.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (r2.a) {
            a8.b("stop recording internal in queue " + N.exists() + " " + N.length());
        }
        g0.h3(new Runnable() { // from class: org.telegram.messenger.he
            @Override // java.lang.Runnable
            public final void run() {
                boolean z11;
                char c10;
                int i11;
                String[] strArr = MediaController.V1;
                boolean z12 = r2.a;
                MediaController mediaController2 = MediaController.this;
                File file3 = N;
                if (z12) {
                    StringBuilder sb2 = new StringBuilder("stop recording internal ");
                    sb2.append(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController2.k1 + " writedFrames" + mediaController2.l1);
                    a8.b(sb2.toString());
                }
                if (!file3.exists()) {
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.k1 + " writedFrames" + mediaController2.l1), true);
                }
                ui.b0(mediaController2.h1).B1(mediaController2.m1, mediaController2.n1, null);
                int currentTime = ConnectionsManager.getInstance(mediaController2.h1).getCurrentTime();
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
                long j3 = mediaController2.k1;
                tL_documentAttributeAudio.duration = j3 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                if (j3 > 700) {
                    int i12 = i7;
                    if (i12 == 1) {
                        c10 = 1;
                        i11 = 2;
                        ez f10 = ez.f(tL_document2, null, file3.getAbsolutePath(), mediaController2.m1, mediaController2.q1, mediaController2.r1, null, null, null, null, z9, i10, 0, z10 ? Integer.MAX_VALUE : 0, null, null, false);
                        f10.R = mediaController2.o1;
                        f10.T = mediaController2.p1;
                        f10.H = mediaController2.s1;
                        f10.K = mediaController2.t1;
                        f10.Q = 0L;
                        gz.C(mediaController2.h1).r0(f10);
                    } else {
                        c10 = 1;
                        i11 = 2;
                    }
                    qs f11 = qs.f(mediaController2.h1);
                    Integer valueOf = Integer.valueOf(mediaController2.g1);
                    if (i12 != i11) {
                        tL_document2 = null;
                    }
                    String absolutePath = i12 == i11 ? file3.getAbsolutePath() : null;
                    Object[] objArr = new Object[3];
                    z11 = false;
                    objArr[0] = valueOf;
                    objArr[c10] = tL_document2;
                    objArr[i11] = absolutePath;
                    f11.k(qs.s2, objArr);
                } else {
                    z11 = false;
                    qs.f(mediaController2.h1).k(qs.t2, Integer.valueOf(mediaController2.g1), Boolean.FALSE, Integer.valueOf((int) j3));
                    z0.b(file3);
                    file3.delete();
                }
                mediaController2.Y(z11);
            }
        });
    }

    public static native boolean cropOpusFile(String str, String str2, long j3, long j10);

    public static void d(MediaController mediaController) {
        mediaController.i1 = mediaController.j1;
        pe peVar = new pe(1, w7.z(1), System.currentTimeMillis() + "_" + w7.r(null, mediaController.f1));
        mediaController.j1 = peVar;
        if (mediaController.startRecord(peVar.getPath(), mediaController.A1) != 0) {
            g0.h3(new vd(mediaController, 8));
            return;
        }
        g0.h3(new vd(mediaController, 7));
        if (r2.a) {
            a8.b("cant resume audio encoder");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d0(String str, Context context, int i7, String str2, String str3, c20 c20Var) {
        File file;
        org.telegram.ui.ActionBar.u1 u1Var;
        if (str == null || context == null) {
            return;
        }
        int i10 = 0;
        if (!TextUtils.isEmpty(str)) {
            File file2 = new File(str);
            if (file2.exists() && !g0.I1(Uri.fromFile(file2), 0)) {
                file = file2;
                if (file != null) {
                    return;
                }
                boolean[] zArr = {false};
                if (file.exists()) {
                    boolean[] zArr2 = new boolean[1];
                    if (i7 != 0) {
                        try {
                            org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(2, context, null);
                            u1Var2.n(hd.M0(2131748778, null));
                            u1Var2.setCanceledOnTouchOutside(false);
                            u1Var2.setCancelable(true);
                            u1Var2.setOnCancelListener(new ce(zArr, i10));
                            g0.i3(new de(zArr2, u1Var2, i10), 250L);
                            u1Var = u1Var2;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        new Thread(new ee(i7, file, str2, u1Var, zArr, str3, c20Var, zArr2)).start();
                        return;
                    }
                    u1Var = null;
                    new Thread(new ee(i7, file, str2, u1Var, zArr, str3, c20Var, zArr2)).start();
                    return;
                }
                return;
            }
        }
        file = null;
        if (file != null) {
        }
    }

    public static void e0(String str, String str2, Context context, c20 c20Var) {
        org.telegram.ui.ActionBar.u1 u1Var;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            return;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists() || !file2.exists()) {
            d0(str, context, 0, null, null, c20Var);
            return;
        }
        if (g0.I1(Uri.fromFile(file), 0) || g0.I1(Uri.fromFile(file2), 0)) {
            return;
        }
        int i7 = 1;
        boolean[] zArr = {false};
        boolean[] zArr2 = new boolean[1];
        try {
            org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(2, context, null);
            u1Var2.n(hd.M0(2131748778, null));
            u1Var2.setCanceledOnTouchOutside(false);
            u1Var2.setCancelable(true);
            u1Var2.setOnCancelListener(new ce(zArr, i7));
            g0.i3(new de(zArr2, u1Var2, i7), 250L);
            u1Var = u1Var2;
        } catch (Exception e10) {
            a8.g(e10, true);
            u1Var = null;
        }
        new Thread(new zj(file, file2, zArr, c20Var, u1Var, zArr2)).start();
    }

    public static void f(MediaController mediaController, ij ijVar, int[] iArr, boolean z9, boolean z10, int i7) {
        ij ijVar2;
        se seVar = mediaController.c1;
        if (mediaController.E0 == null) {
            return;
        }
        if (i7 == 4 || i7 == 1) {
            try {
                mediaController.J0.getWindow().clearFlags(128);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        } else {
            try {
                mediaController.J0.getWindow().addFlags(128);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        if (i7 == 3) {
            mediaController.F0 = true;
            ij ijVar3 = mediaController.u0;
            if (ijVar3 != null && (ij.M4(ijVar3.k) || mediaController.u0.i4())) {
                g0.r(seVar);
                w7.G(ijVar.I1).Z(mediaController.u0.F0(), true, false);
            }
            mediaController.P0 = true;
            return;
        }
        if (i7 == 2) {
            if (!z10 || (ijVar2 = mediaController.u0) == null) {
                return;
            }
            if (ij.M4(ijVar2.k) || mediaController.u0.i4()) {
                if (mediaController.F0) {
                    seVar.run();
                    return;
                } else {
                    g0.i3(seVar, 1000L);
                    return;
                }
            }
            return;
        }
        if (mediaController.E0.d0() && i7 == 4) {
            ij ijVar4 = mediaController.u0;
            if (ijVar4 == null || !ij.M4(ijVar4.k) || z9 || (iArr != null && iArr[0] >= 4)) {
                if (mediaController.a0()) {
                    return;
                }
                mediaController.q(true, mediaController.F(), true, false);
            } else {
                mediaController.E0.p0(0L);
                if (iArr != null) {
                    iArr[0] = iArr[0] + 1;
                }
            }
        }
    }

    public static Uri f0(int i7, File file, String str) {
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String D = w7.D(file);
            String mimeTypeFromExtension = D != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(D) : null;
            if ((i7 == 0 || i7 == 1) && mimeTypeFromExtension != null) {
                if (mimeTypeFromExtension.startsWith("image")) {
                    i7 = 0;
                }
                if (mimeTypeFromExtension.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    i7 = 1;
                }
            }
            if (i7 == 0) {
                if (str == null) {
                    str = g0.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", mimeTypeFromExtension);
            } else if (i7 == 1) {
                if (str == null) {
                    str = g0.p0(1, D);
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MOVIES, "Telegram") + File.separator);
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else if (i7 == 2) {
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
            Uri insert = t0.b.getContentResolver().insert(contentUri, contentValues);
            if (insert != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                g0.D(fileInputStream, t0.b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static void g0(Context context, c cVar, ArrayList arrayList, sr srVar) {
        if (arrayList.isEmpty()) {
            return;
        }
        cf cfVar = new cf();
        cfVar.d = new HashMap();
        cfVar.a = cVar;
        cfVar.c = arrayList;
        cfVar.s = srVar;
        cfVar.w = ((ij) arrayList.get(0)).J3();
        int i7 = cVar.a;
        qs.f(i7).b(cfVar, qs.Y1);
        qs.f(i7).b(cfVar, qs.X1);
        qs.f(i7).b(cfVar, qs.Z1);
        org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(2, context, PhotoViewer.p1().P1() ? new di.b() : null);
        cfVar.b = u1Var;
        u1Var.n(hd.M0(2131748778, null));
        u1Var.setCancelable(true);
        u1Var.H = true;
        u1Var.setOnCancelListener(new ce(cfVar, 3));
        g0.i3(new bf(cfVar, 1), 250L);
        new Thread(new bf(cfVar, 2)).start();
    }

    public static native byte[] getWaveform(String str);

    public static native int isOpusFile(String str);

    public static void j0(boolean z9) {
        AudioManager audioManager = (AudioManager) t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (iz.u0 && !c8.ia.d("android.permission.BLUETOOTH_CONNECT")) {
            iz.u0 = false;
            iz.y();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && iz.u0) && z9) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                if (defaultAdapter.getProfileConnectionState(1) != 2) {
                }
                if (!z9 && !audioManager.isBluetoothScoOn()) {
                    audioManager.startBluetoothSco();
                    return;
                } else if (z9 && audioManager.isBluetoothScoOn()) {
                    audioManager.stopBluetoothSco();
                    return;
                }
            } catch (SecurityException unused) {
                return;
            } catch (Throwable th2) {
                a8.g(th2, true);
                return;
            }
        }
        if (z9) {
            return;
        }
        if (!z9) {
        }
        if (z9) {
        }
    }

    public static native boolean joinOpusFiles(String str, String str2, String str3);

    public static boolean s0(int i7) {
        xi.a aVar = xi.e.b;
        aVar.a();
        if (!aVar.c) {
            return !((h0) qp.s1(i7).x7.f0.b).c;
        }
        aVar.a();
        return aVar.d;
    }

    private native int startRecord(String str, int i7);

    private native void stopRecord();

    /* JADX WARN: Code restructure failed: missing block: B:106:0x019b, code lost:
    
        if (r5 > r15) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0105, code lost:
    
        if (0 > r15) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0107, code lost:
    
        r7.delete();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
    
        if (r11 > r15) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0153, code lost:
    
        r4 = r7.getAbsolutePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0157, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x015c, code lost:
    
        org.telegram.messenger.a8.g(r0, true);
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ac A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String t(long j3, Uri uri, String str) {
        InputStream inputStream;
        File file;
        FileOutputStream fileOutputStream;
        Throwable th2;
        File file2;
        int i7;
        String absolutePath;
        int i10 = 0;
        try {
            String q10 = w7.q(A(uri));
            if (q10 == null) {
                int p10 = iz.p();
                iz.y();
                Locale locale = Locale.US;
                q10 = p10 + "." + str;
            }
            file = g0.g1();
            try {
                file.mkdirs();
                if (!g0.I1(Uri.fromFile(file), 0)) {
                    int i11 = 0;
                    do {
                        File g12 = g0.g1();
                        if (i11 == 0) {
                            file2 = new File(g12, q10);
                        } else {
                            int lastIndexOf = q10.lastIndexOf(".");
                            if (lastIndexOf > 0) {
                                file = new File(g12, q10.substring(0, lastIndexOf) + " (" + i11 + ")" + q10.substring(lastIndexOf));
                                i11++;
                            } else {
                                file2 = new File(g12, q10 + " (" + i11 + ")");
                            }
                        }
                        file = file2;
                        i11++;
                    } while (file.exists());
                    inputStream = t0.b.getContentResolver().openInputStream(uri);
                    try {
                        if (inputStream instanceof FileInputStream) {
                            try {
                                if (g0.I1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(((FileInputStream) inputStream).getFD(), null)).intValue())) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                    if (j3 > 0) {
                                    }
                                }
                            } catch (Throwable th3) {
                                a8.g(th3, true);
                            }
                        }
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            try {
                                byte[] bArr = new byte[20480];
                                i7 = 0;
                                while (true) {
                                    try {
                                        int read = inputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                        i7 += read;
                                        if (j3 > 0) {
                                            long j10 = i7;
                                            if (j10 > j3) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception e11) {
                                                    a8.g(e11, true);
                                                }
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception e12) {
                                                    a8.g(e12, true);
                                                }
                                                if (j3 > 0) {
                                                }
                                            }
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        i10 = i7;
                                        a8.g(e, true);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception e14) {
                                                a8.g(e14, true);
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Exception e15) {
                                                a8.g(e15, true);
                                            }
                                        }
                                        if (j3 > 0) {
                                        }
                                        return null;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        i10 = i7;
                                        if (inputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        if (j3 <= 0) {
                                        }
                                    }
                                }
                            } catch (Exception e16) {
                                e = e16;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception e17) {
                                    a8.g(e17, true);
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e18) {
                                    a8.g(e18, true);
                                }
                            }
                            if (j3 <= 0) {
                                throw th2;
                            }
                            if (i10 <= j3) {
                                throw th2;
                            }
                            file.delete();
                            throw th2;
                        }
                    } catch (Exception e19) {
                        e = e19;
                        fileOutputStream = null;
                    } catch (Throwable th6) {
                        th = th6;
                        fileOutputStream = null;
                        th2 = th;
                        if (inputStream != null) {
                        }
                        if (fileOutputStream != null) {
                        }
                        if (j3 <= 0) {
                        }
                    }
                } else if (j3 > 0 && 0 > j3) {
                    file.delete();
                    return null;
                }
            } catch (Exception e20) {
                e = e20;
                inputStream = null;
                fileOutputStream = null;
            } catch (Throwable th7) {
                th = th7;
                inputStream = null;
                fileOutputStream = null;
            }
        } catch (Exception e21) {
            e = e21;
            inputStream = null;
            file = null;
            fileOutputStream = null;
        } catch (Throwable th8) {
            th = th8;
            inputStream = null;
            file = null;
            fileOutputStream = null;
        }
        return null;
        if (j3 > 0 && i7 > j3) {
            file.delete();
        }
        return absolutePath;
        try {
            fileOutputStream.close();
        } catch (Exception e22) {
            a8.g(e22, true);
        }
        if (j3 > 0) {
            file.delete();
        }
        return absolutePath;
    }

    public static File u(String str) {
        File file;
        try {
            File g12 = g0.g1();
            g12.mkdirs();
            if (g0.I1(Uri.fromFile(g12), 0)) {
                return null;
            }
            int i7 = 0;
            do {
                File g13 = g0.g1();
                if (i7 == 0) {
                    file = new File(g13, str);
                } else {
                    int lastIndexOf = str.lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        file = new File(g13, str.substring(0, lastIndexOf) + " (" + i7 + ")" + str.substring(lastIndexOf));
                    } else {
                        file = new File(g13, str + " (" + i7 + ")");
                    }
                }
                i7++;
            } while (file.exists());
            return file;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int v(int i7, int i10, int i11, boolean z9) {
        MediaCodec createEncoderByType;
        String str = i7 + "" + i10 + "" + i11;
        ConcurrentHashMap concurrentHashMap = X1;
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        if (z9) {
            try {
                createEncoderByType = MediaCodec.createEncoderByType("video/hevc");
            } catch (Exception unused) {
            }
            if (createEncoderByType == null) {
                try {
                    createEncoderByType = MediaCodec.createEncoderByType("video/avc");
                } catch (Exception unused2) {
                    return i11;
                }
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i7, i10);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("max-bitrate", i11);
            createVideoFormat.setInteger("bitrate", i11);
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
        MediaFormat createVideoFormat2 = MediaFormat.createVideoFormat("video/avc", i7, i10);
        createVideoFormat2.setInteger("color-format", 2130708361);
        createVideoFormat2.setInteger("max-bitrate", i11);
        createVideoFormat2.setInteger("bitrate", i11);
        createVideoFormat2.setInteger("frame-rate", 30);
        createVideoFormat2.setInteger("i-frame-interval", 1);
        createEncoderByType.configure(createVideoFormat2, (Surface) null, (MediaCrypto) null, 1);
        int integer2 = createEncoderByType.getOutputFormat().getInteger("bitrate");
        concurrentHashMap.put(str, Integer.valueOf(integer2));
        createEncoderByType.release();
        return integer2;
    }

    public static int w(MediaExtractor mediaExtractor, boolean z9) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i7 = 0; i7 < trackCount; i7++) {
            String string = mediaExtractor.getTrackFormat(i7).getString("mime");
            if (z9) {
                if (string.startsWith("audio/")) {
                    return i7;
                }
            } else {
                if (string.startsWith("video/")) {
                    return i7;
                }
            }
        }
        return -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int writeFrame(ByteBuffer byteBuffer, int i7);

    public static boolean y() {
        try {
            for (AudioDeviceInfo audioDeviceInfo : dt.o0.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            a8.g(e10, true);
            return false;
        }
    }

    public final void A0(org.telegram.ui.an anVar, boolean z9, boolean z10) {
        if (this.O) {
            this.O = false;
            return;
        }
        if (z10) {
            if (this.f1 == null || K()) {
                B0(z9 ? 2 : 0, 0, false, false);
            } else {
                D0(false);
            }
        }
        if (!this.P || this.O) {
            return;
        }
        if ((this.f == null && this.n == null) || this.e == null || this.s != anVar) {
            return;
        }
        this.s = null;
        this.P = false;
        this.w = false;
        this.I = false;
        this.r = false;
        this.L = false;
        Utilities.e.c(new vd(this, 5));
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.d.release();
    }

    public final void B0(final int i7, final int i10, final boolean z9, final boolean z10) {
        e0.g gVar;
        if (!this.H1) {
            wd wdVar = this.L1;
            p5 p5Var = this.M1;
            if (wdVar != null) {
                p5Var.a(wdVar);
                this.L1 = null;
            }
            p5Var.c(new Runnable() { // from class: org.telegram.messenger.ke
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController mediaController = MediaController.this;
                    int i11 = mediaController.B1;
                    int i12 = i7;
                    boolean z11 = z9;
                    int i13 = i10;
                    boolean z12 = z10;
                    if (i11 == 3) {
                        mediaController.B1 = 0;
                        mediaController.C0(i12, i13, z11, z12);
                        return;
                    }
                    AudioRecord audioRecord = mediaController.e1;
                    if (audioRecord == null) {
                        mediaController.f1 = null;
                        mediaController.x0 = false;
                        mediaController.r = false;
                        mediaController.O = false;
                        return;
                    }
                    try {
                        mediaController.B1 = i12;
                        mediaController.C1 = z11;
                        mediaController.D1 = i13;
                        mediaController.E1 = z12;
                        audioRecord.stop();
                        MediaController.j0(false);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        if (mediaController.j1 != null) {
                            if (r2.a) {
                                a8.d("delete voice file");
                            }
                            mediaController.j1.delete();
                        }
                    }
                    if (i12 == 0) {
                        mediaController.C0(0, 0, false, false);
                    }
                    try {
                        mediaController.K0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g0.h3(new yd(mediaController, i12, 0));
                }
            });
            return;
        }
        ac.e eVar = this.K1;
        if (eVar != null) {
            this.K1 = null;
            if (i7 == 0) {
                x(false);
                return;
            }
            this.B1 = i7;
            this.C1 = z9;
            this.D1 = i10;
            this.E1 = z10;
            s(eVar);
            return;
        }
        if (this.I1) {
            if (this.B1 == 3) {
                this.B1 = i7;
                this.C1 = z9;
                this.D1 = i10;
                this.E1 = z10;
                if (i7 == 0) {
                    e0.g gVar2 = this.F1;
                    if (gVar2 != null) {
                        gVar2.b = false;
                        ((vi.h) gVar2.e).b();
                    }
                    x(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i7 == 2 && (gVar = this.F1) != null && gVar.e()) {
            this.x0 = false;
            this.r = false;
            this.O = false;
            return;
        }
        di.d1 d1Var = this.G1;
        if (d1Var != null) {
            g0.r(d1Var);
            this.G1 = null;
        }
        this.I1 = true;
        this.B1 = i7;
        this.C1 = z9;
        this.D1 = i10;
        this.E1 = z10;
        e0.g gVar3 = this.F1;
        if (gVar3 == null) {
            x(false);
        } else {
            vi.h hVar = (vi.h) gVar3.e;
            if (i7 == 0) {
                gVar3.b = false;
                hVar.b();
                x(false);
            } else {
                gVar3.b = true;
                hVar.getClass();
                vi.h.q();
                int i11 = hVar.e().a;
                if (gVar3.b && (i11 == 3 || i11 == 5)) {
                    gVar3.b = false;
                    hVar.h();
                }
            }
        }
        try {
            this.K0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        final int i12 = this.h1;
        final int i13 = this.g1;
        g0.h3(new Runnable() { // from class: org.telegram.messenger.zd
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = MediaController.V1;
                qs.f(i12).k(qs.n2, Integer.valueOf(i13), Integer.valueOf(i7 == 2 ? 1 : 0));
            }
        });
    }

    public final float C(boolean z9) {
        return z9 ? this.q0 : this.p0;
    }

    public final void C0(int i7, int i10, boolean z9, boolean z10) {
        MediaController mediaController;
        File file;
        if (i7 == 0 || (file = this.j1) == null) {
            mediaController = this;
            z0.b(mediaController.j1);
            File file2 = mediaController.j1;
            if (file2 != null) {
                file2.delete();
            }
            Y(false);
        } else {
            TLRPC.TL_document tL_document = this.f1;
            File file3 = this.i1;
            if (r2.a) {
                a8.b("stop recording internal filename " + this.j1.getPath());
            }
            mediaController = this;
            mediaController.N1.c(new fi.x8(mediaController, file3, file, tL_document, i7, z9, i10, z10));
        }
        try {
            AudioRecord audioRecord = mediaController.e1;
            if (audioRecord != null) {
                audioRecord.release();
                mediaController.e1 = null;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        mediaController.f1 = null;
        mediaController.i1 = null;
        mediaController.j1 = null;
        mediaController.x0 = false;
        mediaController.r = false;
        mediaController.O = false;
    }

    public final long D(ij ijVar) {
        ij ijVar2 = this.u0;
        if ((this.i0 != null || this.E0 != null) && ijVar != null && ijVar2 != null && L(ijVar)) {
            try {
                t51 t51Var = this.i0;
                if (t51Var != null) {
                    return t51Var.S();
                }
                t51 t51Var2 = this.E0;
                if (t51Var2 != null) {
                    return t51Var2.S();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void D0(boolean z9) {
        if (!this.H1) {
            this.M1.c(new xd(this, z9, 0));
            return;
        }
        this.J1 = z9;
        e0.g gVar = this.F1;
        if (gVar != null) {
            if (gVar.e()) {
                Y(true);
                j0(true);
            }
            e0.g gVar2 = this.F1;
            vi.h hVar = (vi.h) gVar2.e;
            hVar.getClass();
            vi.h.q();
            int i7 = hVar.e().a;
            if (i7 == 3) {
                ((vi.h) gVar2.e).n();
                return;
            }
            if (i7 == 5) {
                vi.h hVar2 = (vi.h) gVar2.e;
                hVar2.getClass();
                vi.h.q();
                if (hVar2.G != 5) {
                    return;
                }
                hVar2.h.b("resume requested: trim=" + hVar2.r + ".." + hVar2.s + ", sourceDurationMs=" + hVar2.j());
                hVar2.p();
                hVar2.s(6);
                vi.g gVar3 = hVar2.z;
                if (gVar3 == null) {
                    hVar2.g(new IllegalStateException("Output generation is missing"));
                    return;
                }
                long j3 = hVar2.r;
                long j10 = hVar2.s;
                boolean z10 = j10 >= vi.h.r(hVar2.p);
                hVar2.k(1);
                long j11 = ((j10 - j3) * 48000) / 1000;
                hVar2.p = j11;
                hVar2.r = 0L;
                hVar2.s = vi.h.r(j11);
                hVar2.d();
                hVar2.h.b("resume prefix selected: source=" + gVar3.b.getName() + ", trim=" + j3 + ".." + j10);
                File file = gVar3.b;
                if (z10) {
                    j10 = -1;
                }
                hVar2.u(j3, j10, file);
            }
        }
    }

    public final boolean E0(int i7, ArrayList arrayList) {
        ij ijVar;
        int i10;
        ij ijVar2;
        int i11 = this.U0;
        boolean z9 = ConnectionsManager.getInstance(p10.s0).getConnectionState() == 2;
        this.U0 += i7;
        if (z9) {
            while (this.U0 < arrayList.size() && (i10 = this.U0) >= 0 && ((ijVar2 = (ij) arrayList.get(i10)) == null || !ijVar2.x0)) {
                this.U0 += i7;
            }
        }
        if (this.U0 < arrayList.size() && this.U0 >= 0) {
            return false;
        }
        this.U0 = this.U0 >= arrayList.size() ? 0 : arrayList.size() - 1;
        if (z9) {
            while (true) {
                int i12 = this.U0;
                if (i12 < 0 || i12 >= arrayList.size()) {
                    break;
                }
                int i13 = this.U0;
                if (i7 > 0) {
                    if (i13 > i11) {
                        break;
                    }
                    ijVar = (ij) arrayList.get(this.U0);
                    if (ijVar == null && ijVar.x0) {
                        break;
                    }
                    this.U0 += i7;
                } else {
                    if (i13 < i11) {
                        break;
                    }
                    ijVar = (ij) arrayList.get(this.U0);
                    if (ijVar == null) {
                    }
                    this.U0 += i7;
                }
            }
            if (this.U0 >= arrayList.size() || this.U0 < 0) {
                this.U0 = this.U0 < arrayList.size() ? arrayList.size() - 1 : 0;
            }
        }
        return true;
    }

    public final boolean F() {
        ArrayList arrayList;
        ij ijVar = this.u0;
        return ijVar == null || !(ij.S4(ijVar.k) || this.u0.i4()) || (arrayList = this.e0) == null || arrayList.size() <= 1 || !this.e0.contains(this.u0) || this.e0.indexOf(this.u0) >= this.e0.size() - 1;
    }

    public final void F0() {
        ij ijVar = this.u0;
        if (ijVar != null && H() && this.h0 && (ij.S4(ijVar.k) || ijVar.J3())) {
            S(ijVar);
        }
        this.h0 = false;
    }

    public final void G0(File file, long j3, byte[] bArr) {
        TLRPC.TL_document tL_document = this.f1;
        if (tL_document == null) {
            return;
        }
        tL_document.date = ConnectionsManager.getInstance(this.h1).getCurrentTime();
        this.f1.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        tL_documentAttributeAudio.waveform = bArr;
        if (bArr != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = j3 / 1000.0d;
        this.f1.attributes.clear();
        this.f1.attributes.add(tL_documentAttributeAudio);
    }

    public final boolean H() {
        return this.g0 || this.A0;
    }

    public final boolean I(ij ijVar) {
        ij ijVar2;
        boolean z9;
        if (ijVar != null && ijVar.h2) {
            return false;
        }
        if ((this.i0 == null && this.E0 == null) || ijVar == null || (ijVar2 = this.u0) == null) {
            return false;
        }
        long j3 = ijVar2.T;
        if (j3 != 0 && j3 == ijVar.T) {
            z9 = this.A0;
        } else {
            if (!L(ijVar)) {
                return false;
            }
            z9 = this.A0;
        }
        return !z9;
    }

    public final boolean J() {
        return (this.L1 == null && this.G1 == null && this.f1 == null) ? false : true;
    }

    public final boolean K() {
        if (!this.H1) {
            return this.d1;
        }
        e0.g gVar = this.F1;
        return gVar != null && gVar.e();
    }

    public final boolean L(ij ijVar) {
        ij ijVar2 = this.u0;
        if (ijVar2 != null && ij.B0(ijVar2.k) == ij.B0(ijVar.k) && this.u0.f1() == ijVar.f1()) {
            if ((this.u0.T == 0) == (ijVar.T == 0)) {
                return true;
            }
        }
        return false;
    }

    public final File N(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            oe oeVar = new oe(w7.z(1), System.currentTimeMillis() + "_" + w7.r(null, tL_document));
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), oeVar.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.j1) {
                    this.j1 = oeVar;
                }
                file2 = oeVar;
            }
            file.delete();
            if (file == this.i1) {
                this.i1 = null;
            }
        }
        return file2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void P() {
        ij ijVar;
        int i7;
        long j3;
        long j10;
        long j11;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
        kp kpVar = this.Q0;
        if (kpVar != null) {
            kpVar.b();
            return;
        }
        if (this.X0 || (ijVar = this.u0) == null || ijVar.p1 || m5.C(ij.B0(ijVar.k)) || (i7 = this.Z0) == 0) {
            return;
        }
        h2.a0 a0Var = this.C0;
        if (a0Var == null) {
            boolean[] zArr = this.W0;
            boolean z9 = zArr[0];
            int[] iArr = this.b1;
            if (!z9) {
                this.X0 = true;
                ui.b0(c.a(this.u0.I1).a).N0(ij.B0(this.u0.k), 50, iArr[0], 0, 4, this.a1, 1, this.Z0, 0, null, null);
                return;
            } else {
                if (this.Y0 == 0 || zArr[1]) {
                    return;
                }
                this.X0 = true;
                ui.b0(c.a(this.u0.I1).a).N0(this.Y0, 50, iArr[0], 0, 4, 0L, 1, this.Z0, 0, null, null);
                return;
            }
        }
        if (a0Var.e) {
            return;
        }
        ArrayList arrayList = this.R0;
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = ((ij) arrayList.get(0)).I1;
        if (this.C0.a != 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            h2.a0 a0Var2 = this.C0;
            tL_messages_search.q = (String) a0Var2.h;
            tL_messages_search.limit = 20;
            jg.o0 o0Var = (jg.o0) a0Var2.i;
            tL_messages_search.filter = o0Var == null ? new TLRPC.TL_inputMessagesFilterEmpty() : o0Var.e;
            tL_messages_search.peer = qp.s1(c.a(i10).a).j1(this.C0.a);
            tL_messages_search.offset_id = ((ij) jg.g.i(1, arrayList)).f1();
            h2.a0 a0Var3 = this.C0;
            long j12 = a0Var3.b;
            if (j12 > 0) {
                tL_messages_search.min_date = (int) (j12 / 1000);
            }
            long j13 = a0Var3.c;
            tL_messages_searchGlobal = tL_messages_search;
            if (j13 > 0) {
                tL_messages_search.min_date = (int) (j13 / 1000);
                tL_messages_searchGlobal = tL_messages_search;
            }
        } else {
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal2.limit = 20;
            h2.a0 a0Var4 = this.C0;
            tL_messages_searchGlobal2.q = (String) a0Var4.h;
            tL_messages_searchGlobal2.filter = ((jg.o0) a0Var4.i).e;
            ij ijVar2 = (ij) jg.g.i(1, arrayList);
            tL_messages_searchGlobal2.offset_id = ijVar2.f1();
            h2.a0 a0Var5 = this.C0;
            tL_messages_searchGlobal2.offset_rate = a0Var5.f;
            tL_messages_searchGlobal2.flags |= 1;
            tL_messages_searchGlobal2.folder_id = a0Var5.g;
            TLRPC.Peer peer = ijVar2.k.peer_id;
            long j14 = peer.channel_id;
            if (j14 == 0) {
                j14 = peer.chat_id;
                if (j14 == 0) {
                    j3 = peer.user_id;
                    tL_messages_searchGlobal2.offset_peer = qp.s1(i10).j1(j3);
                    h2.a0 a0Var6 = this.C0;
                    j10 = a0Var6.b;
                    if (j10 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j10 / 1000);
                    }
                    j11 = a0Var6.c;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    if (j11 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j11 / 1000);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
            }
            j3 = -j14;
            tL_messages_searchGlobal2.offset_peer = qp.s1(i10).j1(j3);
            h2.a0 a0Var62 = this.C0;
            j10 = a0Var62.b;
            if (j10 > 0) {
            }
            j11 = a0Var62.c;
            tL_messages_searchGlobal = tL_messages_searchGlobal2;
            if (j11 > 0) {
            }
        }
        this.X0 = true;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_searchGlobal, new fe(this, i7, i10, 0));
    }

    public final boolean R(ij ijVar, boolean z9) {
        if ((this.i0 != null || this.E0 != null) && ijVar != null && this.u0 != null && L(ijVar)) {
            z0();
            try {
                if (this.i0 == null) {
                    t51 t51Var = this.E0;
                    if (t51Var != null) {
                        t51Var.g0();
                    }
                } else if (!z9 || d1.f.u() || ij.S4(this.u0.k) || this.u0.L0() * (1.0f - this.u0.b0) <= 1.0d || !LaunchActivity.F1) {
                    this.i0.g0();
                } else {
                    ValueAnimator valueAnimator = this.Q1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        this.Q1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    this.Q1 = ofFloat;
                    ofFloat.addUpdateListener(this.R1);
                    this.Q1.setDuration(300L);
                    this.Q1.addListener(new m.a(this, 5));
                    this.Q1.start();
                }
                this.g0 = true;
                qs.f(this.u0.I1).k(qs.g2, Integer.valueOf(this.u0.f1()));
                try {
                    d1.f.b(1);
                    if (!this.T1) {
                        if (wf.b.Z().d0()) {
                            wf.b.Z().h0(z());
                        }
                        d1.f.x(false);
                    }
                    return true;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return true;
                }
            } catch (Exception e11) {
                a8.g(e11, true);
                this.g0 = false;
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:78|(1:80)(2:330|(23:334|(1:338)|354|(1:341)(1:353)|342|(1:352)(4:346|(1:348)(1:351)|349|350)|82|(1:84)|85|(16:265|266|(2:268|(12:328|(1:327)(1:276)|(1:278)|279|(4:281|(1:283)(1:317)|284|(5:286|(1:288)|(3:290|(1:293)|294)(4:308|309|(1:311)(1:314)|312)|295|(6:297|(1:299)(1:306)|300|(1:302)|303|(1:305))(1:307)))|318|(2:323|324)|320|(1:322)|(0)(0)|295|(0)(0)))(1:329)|272|(1:274)|327|(0)|279|(0)|318|(0)|320|(0)|(0)(0)|295|(0)(0))(18:88|(1:90)|91|92|(3:94|(1:97)|98)(3:245|(1:247)(1:249)|248)|99|100|(6:102|(3:106|(1:110)|111)|112|(1:114)|115|(1:117))(4:227|228|229|(4:233|(1:237)|238|(1:240)))|118|(1:120)|121|(2:224|(1:226))(7:127|(2:(1:222)|223)|131|(1:133)|134|(1:136)|137)|138|(1:142)|143|(1:145)(1:220)|146|(3:148|(1:150)|151)(1:219))|152|(1:154)|155|(1:163)|164|(4:204|205|(5:207|(1:209)|210|(1:212)|213)|215)(2:166|(3:191|192|(4:194|(1:196)|197|(1:199))))|168|(3:170|171|172)(1:190)|173|174|175|(4:177|(1:179)|180|181)|183))|81|82|(0)|85|(0)|265|266|(0)(0)|272|(0)|327|(0)|279|(0)|318|(0)|320|(0)|(0)(0)|295|(0)(0)|152|(0)|155|(4:157|159|161|163)|164|(0)(0)|168|(0)(0)|173|174|175|(0)|183) */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0875, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x087d, code lost:
    
        org.telegram.messenger.a8.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x01e2, code lost:
    
        if (r11.exists() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0096, code lost:
    
        if (r40.U1 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e9, code lost:
    
        if (r5 == false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x085d A[Catch: Exception -> 0x0875, TryCatch #8 {Exception -> 0x0875, blocks: (B:175:0x0856, B:177:0x085d, B:179:0x0867, B:181:0x0877), top: B:174:0x0856 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0762 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:268:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0575  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x05c6  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x06d0  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0631 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x05f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0571  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0220  */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25, types: [org.telegram.messenger.ij, org.telegram.ui.Components.t51] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S(final ij ijVar) {
        boolean z9;
        boolean z10;
        File file;
        final File M;
        File file2;
        boolean z11;
        File M2;
        boolean z12;
        org.telegram.ui.j4 j4Var;
        boolean M4;
        String str;
        boolean z13;
        PipRoundVideoView pipRoundVideoView;
        t51 t51Var;
        PowerManager.WakeLock wakeLock;
        ?? r52;
        ef efVar;
        boolean z14;
        int i7 = qs.g2;
        int i10 = qs.e2;
        if (ijVar == null) {
            return false;
        }
        m();
        if (!(this.i0 == null && this.E0 == null) && L(ijVar)) {
            if (this.g0) {
                b0(ijVar);
            }
            if (iz.k(true)) {
                return true;
            }
            w0(this.s);
            return true;
        }
        if (!ijVar.O3() && ijVar.k.media_unread) {
            qp.s1(ijVar.I1).r3(ijVar);
        }
        boolean z15 = !this.B0;
        ij ijVar2 = this.u0;
        if (ijVar2 != null) {
            if ((ijVar2.J3() && ij.S4(ijVar.k)) || ijVar.i4() || ij.M4(ijVar.k)) {
                ij ijVar3 = this.u0;
                if (ijVar3 != null && ijVar3.J3() && !this.R0.isEmpty()) {
                    this.U1 = new jf(this.u0);
                }
                z14 = true;
                if (!this.B0) {
                    this.u0.H5();
                    qs.f(this.u0.I1).k(i10, Integer.valueOf(this.u0.f1()), 0);
                }
                z9 = z14;
                z15 = false;
            }
            z14 = false;
            if (!this.B0) {
            }
            z9 = z14;
            z15 = false;
        } else {
            z9 = false;
        }
        q(z15, false, false, false);
        this.n0 = null;
        this.o0 = 0L;
        this.B0 = false;
        this.t0 = 0.0f;
        String str2 = ijVar.k.attachPath;
        if (str2 == null || str2.length() <= 0) {
            z10 = false;
        } else {
            file = new File(ijVar.k.attachPath);
            z10 = file.exists();
        }
        file = null;
        if (file != null) {
            M = file;
        } else {
            w7.G(ijVar.I1);
            M = w7.M(ijVar.k, false, true);
        }
        boolean z16 = iz.B0 && !((!ijVar.J3() && !ijVar.i4() && (!ij.M4(ijVar.k) || !ijVar.B())) || ij.S5(ijVar.k) || m5.C(ij.B0(ijVar.k)));
        if (M != file && !(z10 = M.exists()) && !z16) {
            w7.G(ijVar.I1).W(ijVar.F0(), ijVar, 0, ij.S5(ijVar.k) ? 2 : 0);
            this.A0 = true;
            this.g0 = false;
            this.D0 = null;
            this.u0 = ijVar;
            if (h()) {
                try {
                    t0.b.startService(new Intent(t0.b, (Class<?>) MusicPlayerService.class));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            } else {
                t0.b.stopService(new Intent(t0.b, (Class<?>) MusicPlayerService.class));
            }
            qs.f(this.u0.I1).k(i7, Integer.valueOf(this.u0.f1()));
            return true;
        }
        boolean z17 = z10;
        this.A0 = false;
        if (ijVar.J3()) {
            l(ijVar.I1);
        } else {
            int i11 = ijVar.I1;
            ArrayList arrayList = this.e0;
            if (arrayList != null && arrayList.size() >= 2) {
                ij ijVar4 = (ij) this.e0.get(1);
                String str3 = ijVar4.k.attachPath;
                if (str3 != null && str3.length() > 0) {
                    file2 = new File(ijVar4.k.attachPath);
                }
                file2 = null;
                if (file2 != null) {
                    z11 = z9;
                    M2 = file2;
                } else {
                    w7.G(i11);
                    z11 = z9;
                    M2 = w7.M(ijVar4.k, false, true);
                }
                M2.exists();
                if (M2 == file2 || M2.exists()) {
                    z12 = false;
                } else {
                    z12 = false;
                    w7.G(i11).W(ijVar4.F0(), ijVar4, 0, ij.S5(ijVar4.k) ? 2 : 0);
                }
                j4Var = this.L0;
                if (j4Var != null) {
                    this.M0 = z12;
                    j4Var.setDrawingReady(z12);
                }
                M4 = ij.M4(ijVar.k);
                if (!ijVar.i4() || M4) {
                    File file3 = file;
                    w7.G(ijVar.I1).c0(ijVar.F0(), true);
                    this.F0 = false;
                    if (M4) {
                        str = "tg://";
                    } else {
                        str = "tg://";
                        if (ijVar.k.peer_id.channel_id != 0 || ijVar.b0 > 0.1f) {
                            z13 = false;
                            int[] iArr = (M4 || ijVar.L0() > 30.0d) ? null : new int[]{1};
                            if (!z11) {
                                r();
                            }
                            t51 t51Var2 = new t51();
                            this.E0 = t51Var2;
                            t51Var2.s0(false);
                            int i12 = this.m0 + 1;
                            this.m0 = i12;
                            String str4 = str;
                            this.E0.J = new h2.w(this, i12, ijVar, iArr, z13);
                            this.P0 = false;
                            if (this.H0 == null) {
                                qp s12 = qp.s1(ijVar.I1);
                                if ((ijVar.p1 ? s12.y0 : s12.x0).contains(Long.valueOf(ijVar.A0()))) {
                                    TextureView textureView = this.G0;
                                    if (textureView != null) {
                                        this.E0.A0(textureView);
                                    }
                                    if (z17) {
                                        try {
                                            int F = w7.G(ijVar.I1).F(ijVar);
                                            TLRPC.Document F0 = ijVar.F0();
                                            StringBuilder sb2 = new StringBuilder("?account=");
                                            sb2.append(ijVar.I1);
                                            sb2.append("&id=");
                                            sb2.append(F0.id);
                                            sb2.append("&hash=");
                                            sb2.append(F0.access_hash);
                                            sb2.append("&dc=");
                                            sb2.append(F0.dc_id);
                                            sb2.append("&size=");
                                            sb2.append(F0.size);
                                            sb2.append("&mime=");
                                            sb2.append(URLEncoder.encode(F0.mime_type, "UTF-8"));
                                            sb2.append("&rid=");
                                            sb2.append(F);
                                            sb2.append("&name=");
                                            sb2.append(URLEncoder.encode(w7.B(F0), "UTF-8"));
                                            sb2.append("&reference=");
                                            byte[] bArr = F0.file_reference;
                                            if (bArr == null) {
                                                bArr = new byte[0];
                                            }
                                            sb2.append(Utilities.f(bArr));
                                            this.E0.j0(Uri.parse(str4 + ijVar.S0() + sb2.toString()), "other");
                                        } catch (Exception e10) {
                                            a8.f(e10);
                                        }
                                    } else {
                                        if (!ijVar.x0 && M != file3) {
                                            final int i13 = 0;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.je
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i14 = i13;
                                                    File file4 = M;
                                                    ij ijVar5 = ijVar;
                                                    switch (i14) {
                                                        case 0:
                                                            String[] strArr = MediaController.V1;
                                                            qs.f(ijVar5.I1).k(qs.Y1, w7.r(null, ijVar5.F0()), file4);
                                                            break;
                                                        default:
                                                            String[] strArr2 = MediaController.V1;
                                                            qs.f(ijVar5.I1).k(qs.Y1, w7.r(null, ijVar5.F0()), file4);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        this.E0.j0(Uri.fromFile(M), "other");
                                    }
                                    if (ijVar.i4()) {
                                        this.E0.x0(3);
                                    } else {
                                        this.E0.x0(this.L ? 0 : 3);
                                        if (Math.abs(this.p0 - 1.0f) > 0.001f) {
                                            this.E0.v0(Math.round(this.p0 * 10.0f) / 10.0f);
                                        }
                                        float f10 = ijVar.c0;
                                        if (f10 >= 0.0f) {
                                            this.t0 = f10;
                                            ijVar.b0 = f10;
                                            ijVar.c0 = -1.0f;
                                        }
                                    }
                                }
                            }
                            if (this.H0 == null) {
                                try {
                                    PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                                    this.H0 = pipRoundVideoView2;
                                    pipRoundVideoView2.d(this.J0, new vd(this, 9));
                                } catch (Exception unused) {
                                    this.H0 = null;
                                }
                            }
                            pipRoundVideoView = this.H0;
                            if (pipRoundVideoView != null) {
                                this.E0.A0(pipRoundVideoView.c);
                            }
                            if (z17) {
                            }
                            if (ijVar.i4()) {
                            }
                        }
                    }
                    z13 = true;
                    if (M4) {
                    }
                    if (!z11) {
                    }
                    t51 t51Var22 = new t51();
                    this.E0 = t51Var22;
                    t51Var22.s0(false);
                    int i122 = this.m0 + 1;
                    this.m0 = i122;
                    String str42 = str;
                    this.E0.J = new h2.w(this, i122, ijVar, iArr, z13);
                    this.P0 = false;
                    if (this.H0 == null) {
                    }
                    if (this.H0 == null) {
                    }
                    pipRoundVideoView = this.H0;
                    if (pipRoundVideoView != null) {
                    }
                    if (z17) {
                    }
                    if (ijVar.i4()) {
                    }
                } else {
                    PipRoundVideoView pipRoundVideoView3 = this.H0;
                    if (pipRoundVideoView3 != null) {
                        pipRoundVideoView3.a(true);
                        this.H0 = null;
                    }
                    try {
                        t51 t51Var3 = new t51();
                        this.i0 = t51Var3;
                        int i14 = this.m0 + 1;
                        this.m0 = i14;
                        t51Var3.J = new le(this, i14, ijVar, 0);
                        t51Var3.K = new pb.b(17);
                        if (z17) {
                            if (!ijVar.x0 && M != file) {
                                final int i15 = 1;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.je
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i142 = i15;
                                        File file4 = M;
                                        ij ijVar5 = ijVar;
                                        switch (i142) {
                                            case 0:
                                                String[] strArr = MediaController.V1;
                                                qs.f(ijVar5.I1).k(qs.Y1, w7.r(null, ijVar5.F0()), file4);
                                                break;
                                            default:
                                                String[] strArr2 = MediaController.V1;
                                                qs.f(ijVar5.I1).k(qs.Y1, w7.r(null, ijVar5.F0()), file4);
                                                break;
                                        }
                                    }
                                });
                            }
                            this.i0.j0(Uri.fromFile(M), "other");
                            this.l0 = false;
                        } else {
                            int F2 = w7.G(ijVar.I1).F(ijVar);
                            TLRPC.Document F02 = ijVar.F0();
                            StringBuilder sb3 = new StringBuilder("?account=");
                            sb3.append(ijVar.I1);
                            sb3.append("&id=");
                            sb3.append(F02.id);
                            sb3.append("&hash=");
                            sb3.append(F02.access_hash);
                            sb3.append("&dc=");
                            sb3.append(F02.dc_id);
                            sb3.append("&size=");
                            sb3.append(F02.size);
                            sb3.append("&mime=");
                            sb3.append(URLEncoder.encode(F02.mime_type, "UTF-8"));
                            sb3.append("&rid=");
                            sb3.append(F2);
                            sb3.append("&name=");
                            sb3.append(URLEncoder.encode(w7.B(F02), "UTF-8"));
                            sb3.append("&reference=");
                            byte[] bArr2 = F02.file_reference;
                            if (bArr2 == null) {
                                bArr2 = new byte[0];
                            }
                            sb3.append(Utilities.f(bArr2));
                            this.i0.j0(Uri.parse("tg://" + ijVar.S0() + sb3.toString()), "other");
                            this.l0 = true;
                        }
                        if (ij.S4(ijVar.k)) {
                            String S0 = ijVar.S0();
                            if (S0 != null && ijVar.L0() >= 300.0d) {
                                float f11 = t0.b.getSharedPreferences("media_saved_pos", 0).getFloat(S0, -1.0f);
                                if (f11 > 0.0f && f11 < 0.99f) {
                                    this.t0 = f11;
                                    ijVar.b0 = f11;
                                }
                                this.n0 = S0;
                            }
                            if (Math.abs(this.p0 - 1.0f) > 0.001f) {
                                this.i0.v0(Math.round(this.p0 * 10.0f) / 10.0f);
                            }
                            this.D0 = null;
                            if (!z11) {
                                r();
                            }
                        } else {
                            try {
                                this.D0 = rf.a.a(M);
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            String S02 = ijVar.S0();
                            if (!TextUtils.isEmpty(S02) && ijVar.L0() >= 600.0d) {
                                float f12 = t0.b.getSharedPreferences("media_saved_pos", 0).getFloat(S02, -1.0f);
                                if (f12 > 0.0f && f12 < 0.999f) {
                                    this.t0 = f12;
                                    ijVar.b0 = f12;
                                }
                                this.n0 = S02;
                                if (Math.abs(this.q0 - 1.0f) > 0.001f) {
                                    this.i0.v0(Math.round(this.q0 * 10.0f) / 10.0f);
                                }
                            }
                        }
                        float f13 = ijVar.c0;
                        if (f13 >= 0.0f) {
                            this.t0 = f13;
                            ijVar.b0 = f13;
                            ijVar.c0 = -1.0f;
                        }
                        if (!ijVar.J3() || ijVar.F0() == null || m5.C(ij.B0(ijVar.k))) {
                            ef efVar2 = this.w0;
                            if (efVar2 != null) {
                                efVar2.b();
                                this.w0 = null;
                            }
                        } else {
                            ef efVar3 = this.w0;
                            if (efVar3 == null || efVar3.a != ijVar.I1) {
                                if (efVar3 != null) {
                                    efVar3.b();
                                }
                                this.w0 = new ef(ijVar.I1);
                            }
                            TLRPC.Document F03 = ijVar.F0();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = F03.id;
                            tL_inputDocument.access_hash = F03.access_hash;
                            byte[] bArr3 = F03.file_reference;
                            tL_inputDocument.file_reference = bArr3;
                            if (bArr3 == null) {
                                tL_inputDocument.file_reference = new byte[0];
                            }
                            ef efVar4 = this.w0;
                            g0.r(efVar4.e);
                            if (tL_inputDocument.id == 0) {
                                tL_inputDocument = null;
                            }
                            efVar4.b = tL_inputDocument;
                            efVar4.c = -9223372036854775807L;
                            efVar4.d.clear();
                        }
                        l2.i0 i0Var = this.i0.d;
                        if (i0Var != null && (efVar = this.w0) != null) {
                            i0Var.m.a(new df(efVar, i0Var));
                        }
                        this.i0.x0(this.L ? 0 : 3);
                        this.i0.h0();
                        if (ijVar.Q4()) {
                            this.P1 = 1.0f;
                            n0();
                        } else {
                            ValueAnimator valueAnimator = this.Q1;
                            if (valueAnimator != null) {
                                valueAnimator.removeAllListeners();
                                this.Q1.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.P1, 1.0f);
                            this.Q1 = ofFloat;
                            ofFloat.addUpdateListener(this.R1);
                            this.Q1.setDuration(300L);
                            this.Q1.start();
                        }
                    } catch (Exception e12) {
                        a8.f(e12);
                        qs f14 = qs.f(ijVar.I1);
                        ij ijVar5 = this.u0;
                        f14.k(i7, Integer.valueOf(ijVar5 != null ? ijVar5.f1() : 0));
                        if (this.i0 == null) {
                            return false;
                        }
                        ef efVar5 = this.w0;
                        if (efVar5 != null) {
                            efVar5.b();
                            r52 = 0;
                            this.w0 = null;
                        } else {
                            r52 = 0;
                        }
                        this.i0.m0();
                        this.i0 = r52;
                        org.telegram.ui.ActionBar.k6.N1(this.u0);
                        this.g0 = false;
                        this.u0 = r52;
                        this.A0 = false;
                        return false;
                    }
                }
                j(ijVar);
                n0();
                this.g0 = false;
                this.u0 = ijVar;
                if (!iz.k(true)) {
                    w0(this.s);
                }
                if (!t0.x && (wakeLock = this.d) != null && !wakeLock.isHeld() && !this.u0.Q4()) {
                    this.u0.i4();
                }
                v0(this.u0);
                qs.f(ijVar.I1).k(qs.h2, ijVar, ijVar2);
                t51Var = this.E0;
                if (t51Var == null) {
                    try {
                        if (this.u0.b0 != 0.0f) {
                            long U = t51Var.U();
                            if (U == -9223372036854775807L) {
                                U = ((long) this.u0.L0()) * 1000;
                            }
                            ij ijVar6 = this.u0;
                            int i16 = (int) (U * ijVar6.b0);
                            int i17 = ijVar6.d0;
                            if (i17 != 0) {
                                ijVar6.d0 = 0;
                                i16 = i17;
                            }
                            this.E0.p0(i16);
                        }
                    } catch (Exception e13) {
                        ij ijVar7 = this.u0;
                        ijVar7.b0 = 0.0f;
                        ijVar7.g0 = 0;
                        qs.f(ijVar.I1).k(i10, Integer.valueOf(this.u0.f1()), 0);
                        a8.f(e13);
                    }
                    this.E0.h0();
                } else {
                    t51 t51Var4 = this.i0;
                    if (t51Var4 != null) {
                        try {
                            if (this.u0.b0 != 0.0f) {
                                long U2 = t51Var4.U();
                                if (U2 == -9223372036854775807L) {
                                    U2 = ((long) this.u0.L0()) * 1000;
                                }
                                long j3 = (int) (U2 * this.u0.b0);
                                this.i0.p0(j3);
                                if (!this.T1) {
                                    d1.f.v(j3);
                                }
                            }
                        } catch (Exception e14) {
                            this.u0.H5();
                            qs.f(ijVar.I1).k(i10, Integer.valueOf(this.u0.f1()), 0);
                            a8.f(e14);
                        }
                    }
                }
                if (h()) {
                    t0.b.stopService(new Intent(t0.b, (Class<?>) MusicPlayerService.class));
                } else {
                    try {
                        t0.b.startService(new Intent(t0.b, (Class<?>) MusicPlayerService.class));
                    } catch (Throwable th3) {
                        a8.f(th3);
                    }
                }
                d1.f.b(1);
                if (!this.T1) {
                    if (wf.b.Z().d0()) {
                        wf.b.Z().h0(z());
                    }
                    d1.f.x(true);
                }
                return true;
            }
        }
        z11 = z9;
        z12 = false;
        j4Var = this.L0;
        if (j4Var != null) {
        }
        M4 = ij.M4(ijVar.k);
        if (ijVar.i4()) {
        }
        File file32 = file;
        w7.G(ijVar.I1).c0(ijVar.F0(), true);
        this.F0 = false;
        if (M4) {
        }
        z13 = true;
        if (M4) {
        }
        if (!z11) {
        }
        t51 t51Var222 = new t51();
        this.E0 = t51Var222;
        t51Var222.s0(false);
        int i1222 = this.m0 + 1;
        this.m0 = i1222;
        String str422 = str;
        this.E0.J = new h2.w(this, i1222, ijVar, iArr, z13);
        this.P0 = false;
        if (this.H0 == null) {
        }
        if (this.H0 == null) {
        }
        pipRoundVideoView = this.H0;
        if (pipRoundVideoView != null) {
        }
        if (z17) {
        }
        if (ijVar.i4()) {
        }
        j(ijVar);
        n0();
        this.g0 = false;
        this.u0 = ijVar;
        if (!iz.k(true)) {
        }
        if (!t0.x) {
            this.u0.i4();
        }
        v0(this.u0);
        qs.f(ijVar.I1).k(qs.h2, ijVar, ijVar2);
        t51Var = this.E0;
        if (t51Var == null) {
        }
        if (h()) {
        }
        d1.f.b(1);
        if (!this.T1) {
        }
        return true;
    }

    public final void T(int i7) {
        int i10 = this.U0;
        if (i10 >= 0) {
            ArrayList arrayList = this.R0;
            if (i10 >= arrayList.size()) {
                return;
            }
            this.U0 = i7;
            this.B0 = true;
            ij ijVar = (ij) arrayList.get(i7);
            if (this.u0 != null && !L(ijVar)) {
                this.u0.H5();
            }
            S(ijVar);
        }
    }

    public final void U(boolean z9) {
        int i7;
        ArrayList arrayList = iz.N0 ? this.T0 : this.R0;
        if (z9 && (((i7 = iz.S0) == 2 || (i7 == 1 && arrayList.size() == 1)) && !this.V0)) {
            q(false, false, false, false);
            int i10 = this.U0;
            if (i10 < 0 || i10 >= arrayList.size()) {
                return;
            }
            ij ijVar = (ij) arrayList.get(this.U0);
            ijVar.b0 = 0.0f;
            ijVar.g0 = 0;
            S(ijVar);
            return;
        }
        if (!E0(this.Q0 != null ? !iz.O0 : iz.O0 ? 1 : -1, arrayList) || !z9 || iz.S0 != 0 || this.V0) {
            int i11 = this.U0;
            if (i11 < 0 || i11 >= arrayList.size()) {
                return;
            }
            ij ijVar2 = this.u0;
            if (ijVar2 != null) {
                ijVar2.H5();
            }
            this.B0 = true;
            S((ij) arrayList.get(this.U0));
            return;
        }
        t51 t51Var = this.i0;
        if (t51Var == null && this.E0 == null) {
            return;
        }
        if (t51Var != null) {
            ef efVar = this.w0;
            if (efVar != null) {
                efVar.b();
                this.w0 = null;
            }
            try {
                this.i0.m0();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            this.i0 = null;
            org.telegram.ui.ActionBar.k6.N1(this.u0);
        } else {
            this.L0 = null;
            this.N0 = null;
            this.P0 = false;
            this.G0 = null;
            this.E0.m0();
            this.E0 = null;
            try {
                this.J0.getWindow().clearFlags(128);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            g0.r(this.c1);
            w7.G(this.u0.I1).Z(this.u0.F0(), true, false);
        }
        z0();
        this.g0 = true;
        ij ijVar3 = this.u0;
        ijVar3.b0 = 0.0f;
        ijVar3.g0 = 0;
        qs.f(ijVar3.I1).k(qs.e2, Integer.valueOf(this.u0.f1()), 0);
        qs.f(this.u0.I1).k(qs.g2, Integer.valueOf(this.u0.f1()));
    }

    public final void V() {
        int i7;
        ArrayList arrayList = iz.N0 ? this.T0 : this.R0;
        if (arrayList.isEmpty() || (i7 = this.U0) < 0 || i7 >= arrayList.size()) {
            return;
        }
        ij ijVar = (ij) arrayList.get(this.U0);
        if (ijVar.g0 > 10) {
            i0(ijVar, 0.0f);
            return;
        }
        E0(this.Q0 != null ? !iz.O0 : iz.O0 ? -1 : 1, arrayList);
        if (this.U0 >= arrayList.size()) {
            return;
        }
        this.B0 = true;
        S((ij) arrayList.get(this.U0));
    }

    public final void W(boolean z9) {
        if (this.f1 != null) {
            D0(false);
            return;
        }
        if (!z9) {
            B0(2, 0, false, false);
            return;
        }
        int currentAccount = this.s.getCurrentAccount();
        long a10 = this.s.a();
        org.telegram.ui.an anVar = this.s;
        ij ijVar = anVar.l4;
        int classGuid = anVar.getClassGuid();
        org.telegram.ui.an anVar2 = this.s;
        hw W8 = anVar2 != null ? anVar2.W8() : null;
        org.telegram.ui.an anVar3 = this.s;
        long h92 = anVar3 != null ? anVar3.h9() : 0L;
        org.telegram.ui.an anVar4 = this.s;
        x0(currentAccount, a10, null, ijVar, null, classGuid, false, W8, h92, anVar4 != null ? anVar4.w5 : null);
    }

    public final boolean X() {
        ac.e eVar = this.K1;
        if (eVar != null) {
            File file = (File) eVar.b;
            z0.b(file);
            file.delete();
            Z();
            return true;
        }
        e0.g gVar = this.F1;
        if (gVar == null || !gVar.e()) {
            return false;
        }
        this.F1 = null;
        if (!gVar.c()) {
            ((vi.h) gVar.e).o();
            gVar.c = true;
        }
        Z();
        return true;
    }

    public final void Y(boolean z9) {
        ud udVar = this.a;
        if (!z9) {
            if (this.V) {
                dt.o0.abandonAudioFocus(udVar);
                this.V = false;
                return;
            }
            return;
        }
        if (!this.V && iz.F0 && dt.o0.requestAudioFocus(udVar, 3, 2) == 1) {
            this.V = true;
        }
    }

    public final void Z() {
        this.f1 = null;
        this.i1 = null;
        this.j1 = null;
        this.H1 = false;
        this.I1 = false;
        this.J1 = false;
        this.K1 = null;
        this.B1 = 0;
    }

    public final boolean a0() {
        int i7;
        ij ijVar;
        jf jfVar = this.U1;
        if (jfVar != null) {
            ij ijVar2 = jfVar.a;
            this.U1 = null;
            ArrayList arrayList = iz.N0 ? this.T0 : this.R0;
            if (arrayList != null && (i7 = this.U0) >= 0 && i7 < arrayList.size() && (ijVar = (ij) arrayList.get(this.U0)) != null && ij.B0(ijVar.k) == ij.B0(ijVar2.k) && ijVar.f1() == ijVar2.f1()) {
                this.B0 = false;
                float f10 = jfVar.b;
                ijVar.c0 = f10;
                ijVar.b0 = f10;
                ijVar.d0 = jfVar.c;
                ijVar.g0 = jfVar.d;
                S(ijVar);
                R(ijVar, false);
                return true;
            }
        }
        return false;
    }

    public final void b0(ij ijVar) {
        if ((this.i0 == null && this.E0 == null) || ijVar == null || this.u0 == null || !L(ijVar)) {
            return;
        }
        try {
            v0(this.u0);
            ValueAnimator valueAnimator = this.Q1;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Q1.cancel();
            }
            if (ij.S4(ijVar.k) || ijVar.i4()) {
                this.P1 = 1.0f;
                n0();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.P1, 1.0f);
                this.Q1 = ofFloat;
                ofFloat.addUpdateListener(this.R1);
                this.Q1.setDuration(300L);
                this.Q1.start();
            }
            t51 t51Var = this.i0;
            if (t51Var != null) {
                t51Var.h0();
            } else {
                t51 t51Var2 = this.E0;
                if (t51Var2 != null) {
                    t51Var2.h0();
                }
            }
            j(ijVar);
            this.g0 = false;
            qs.f(this.u0.I1).k(qs.g2, Integer.valueOf(this.u0.f1()));
            try {
                d1.f.b(1);
                if (this.T1) {
                    return;
                }
                d1.f.x(true);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
    }

    public final void c0() {
        ij ijVar;
        t51 t51Var = this.i0;
        if (t51Var == null || (ijVar = this.u0) == null || this.g0) {
            return;
        }
        if (t51Var.d == null || t51Var.L != 2) {
            t51Var.h0();
        } else {
            q(false, false, false, false);
            S(ijVar);
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        kp kpVar;
        ij ijVar;
        ArrayList arrayList;
        int indexOf;
        int i11 = 0;
        if (i7 == qs.Y1 || i7 == qs.R1) {
            String str = (String) objArr[0];
            ij ijVar2 = this.u0;
            if (ijVar2 != null && ijVar2.I1 == i10 && w7.r(null, ijVar2.F0()).equals(str)) {
                if (this.A0) {
                    this.B0 = true;
                    S(this.u0);
                    return;
                } else {
                    if (this.D0 == null) {
                        try {
                            w7.G(p10.s0);
                            this.D0 = rf.a.a(w7.M(this.u0.k, false, true));
                            return;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        if (i7 == qs.w) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            ArrayList arrayList2 = (ArrayList) objArr[0];
            ij ijVar3 = this.u0;
            if (ijVar3 != null && longValue == ijVar3.k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(ijVar3.f1()))) {
                q(true, true, false, false);
            }
            ArrayList arrayList3 = this.e0;
            if (arrayList3 == null || arrayList3.isEmpty() || longValue != ((ij) this.e0.get(0)).k.peer_id.channel_id) {
                return;
            }
            while (i11 < arrayList2.size()) {
                Integer num = (Integer) arrayList2.get(i11);
                ij ijVar4 = (ij) this.f0.get(num.intValue());
                this.f0.remove(num.intValue());
                if (ijVar4 != null) {
                    this.e0.remove(ijVar4);
                }
                i11++;
            }
            return;
        }
        if (i7 == qs.e0) {
            long longValue2 = ((Long) objArr[0]).longValue();
            ij ijVar5 = this.u0;
            if (ijVar5 == null || ij.B0(ijVar5.k) != longValue2) {
                return;
            }
            q(false, true, false, false);
            return;
        }
        int i12 = qs.K0;
        int[] iArr = this.b1;
        HashMap hashMap = this.S0;
        ArrayList arrayList4 = this.R0;
        if (i7 == i12) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            ij ijVar6 = this.u0;
            if (ijVar6 != null && ijVar6.J3() && ij.B0(this.u0.k) == longValue3 && this.a1 == longValue4 && !this.u0.p1) {
                ArrayList arrayList5 = (ArrayList) objArr[1];
                ArrayList arrayList6 = (ArrayList) objArr[2];
                arrayList4.addAll(0, arrayList5);
                arrayList4.addAll(arrayList6);
                int size = arrayList4.size();
                for (int i13 = 0; i13 < size; i13++) {
                    ij ijVar7 = (ij) arrayList4.get(i13);
                    hashMap.put(Integer.valueOf(ijVar7.f1()), ijVar7);
                    iArr[0] = Math.min(iArr[0], ijVar7.f1());
                }
                t0();
                if (iz.N0) {
                    g();
                } else {
                    ij ijVar8 = this.u0;
                    if (ijVar8 != null && (indexOf = arrayList4.indexOf(ijVar8)) >= 0) {
                        this.U0 = indexOf;
                    }
                }
                this.Z0 = ConnectionsManager.generateClassGuid();
                return;
            }
            return;
        }
        int i14 = qs.V;
        int i15 = qs.L0;
        if (i7 == i14) {
            if (((Integer) objArr[3]).intValue() != this.Z0 || this.u0 == null) {
                return;
            }
            long longValue5 = ((Long) objArr[0]).longValue();
            ((Integer) objArr[4]).getClass();
            ArrayList arrayList7 = (ArrayList) objArr[2];
            char c10 = longValue5 == this.Y0 ? (char) 1 : (char) 0;
            if (!arrayList7.isEmpty()) {
                this.W0[c10] = ((Boolean) objArr[5]).booleanValue();
            }
            int i16 = 0;
            for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                ij ijVar9 = (ij) arrayList7.get(i17);
                if (!ijVar9.T4() && !hashMap.containsKey(Integer.valueOf(ijVar9.f1()))) {
                    i16++;
                    arrayList4.add(0, ijVar9);
                    hashMap.put(Integer.valueOf(ijVar9.f1()), ijVar9);
                    iArr[c10] = Math.min(iArr[c10], ijVar9.f1());
                }
            }
            t0();
            int indexOf2 = arrayList4.indexOf(this.u0);
            if (indexOf2 >= 0) {
                this.U0 = indexOf2;
            }
            this.X0 = false;
            if (iz.N0) {
                g();
            }
            if (i16 != 0) {
                qs.f(this.u0.I1).k(i15, Integer.valueOf(i16));
                return;
            }
            return;
        }
        if (i7 == 1) {
            if (((Boolean) objArr[2]).booleanValue() || (arrayList = this.e0) == null || arrayList.isEmpty() || ((Long) objArr[0]).longValue() != ij.B0(((ij) this.e0.get(0)).k)) {
                return;
            }
            ArrayList arrayList8 = (ArrayList) objArr[1];
            while (i11 < arrayList8.size()) {
                ij ijVar10 = (ij) arrayList8.get(i11);
                if ((ij.S4(ijVar10.k) || ijVar10.i4()) && !ijVar10.T4() && !ijVar10.h4() && (!this.d0 || (ijVar10.k.media_unread && !ijVar10.O3()))) {
                    this.e0.add(ijVar10);
                    this.f0.put(ijVar10.f1(), ijVar10);
                }
                i11++;
            }
            return;
        }
        if (i7 == qs.H4) {
            t51 t51Var = (t51) objArr[0];
            if (this.E0 == t51Var || this.i0 == t51Var) {
                return;
            }
            ij ijVar11 = this.u0;
            if (ijVar11 != null && I(ijVar11) && !H() && (ijVar11.J3() || ij.S4(ijVar11.k))) {
                this.h0 = true;
            }
            R(ijVar11, true);
            return;
        }
        if (i7 == qs.T3 && (kpVar = this.Q0) != null && objArr[0] == kpVar) {
            int size2 = kpVar.c.size() - arrayList4.size();
            arrayList4.clear();
            arrayList4.addAll(this.Q0.c);
            t0();
            if (iz.N0) {
                g();
            } else {
                ij ijVar12 = this.u0;
                if (ijVar12 != null) {
                    int indexOf3 = arrayList4.indexOf(ijVar12);
                    if (indexOf3 >= 0) {
                        this.U0 = indexOf3;
                    } else {
                        int i18 = this.U0;
                        if (i18 < 0 || i18 >= arrayList4.size()) {
                            this.U0 = 0;
                        }
                        if (arrayList4.size() == 0) {
                            o();
                        } else {
                            S((ij) arrayList4.get(0));
                        }
                    }
                }
            }
            if (size2 == 0 || (ijVar = this.u0) == null) {
                return;
            }
            qs.f(ijVar.I1).k(i15, Integer.valueOf(size2));
        }
    }

    public final void g() {
        ij ijVar;
        ArrayList arrayList = this.R0;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.T0;
        arrayList3.clear();
        int i7 = this.U0;
        if (i7 < 0 || i7 >= arrayList.size()) {
            ijVar = null;
        } else {
            ijVar = (ij) arrayList.get(this.U0);
            arrayList2.remove(this.U0);
        }
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            int nextInt = Utilities.b.nextInt(arrayList2.size());
            arrayList3.add((ij) arrayList2.get(nextInt));
            arrayList2.remove(nextInt);
        }
        if (ijVar != null) {
            arrayList3.add(ijVar);
            this.U0 = arrayList3.size() - 1;
        }
    }

    public native byte[] getWaveform2(short[] sArr, int i7);

    public final boolean h() {
        ij ijVar = this.u0;
        if (ijVar != null) {
            return ((!ijVar.J3() && !ij.S4(this.u0.k) && !this.u0.i4()) || this.u0.T4() || this.u0.h4()) ? false : true;
        }
        return false;
    }

    public final boolean h0(ij ijVar, boolean z9, boolean z10, boolean z11) {
        j20 j20Var = ijVar != null ? ijVar.p0 : null;
        if (ijVar != null && j20Var != null) {
            ArrayList arrayList = this.b0;
            if (!z9 || arrayList.isEmpty()) {
                if (z9) {
                    new File(ijVar.k.attachPath).delete();
                }
                lf lfVar = new lf();
                lfVar.a = ijVar;
                lfVar.c = ijVar.I1;
                lfVar.b = j20Var;
                lfVar.d = z11;
                arrayList.add(lfVar);
                if (z10) {
                    this.Z.add(lfVar);
                    k(false);
                }
                if (arrayList.size() == 1) {
                    y0();
                }
                return true;
            }
        }
        return false;
    }

    public final void i(ij ijVar) {
        if (ijVar == null || this.b0.isEmpty()) {
            return;
        }
        for (int i7 = 0; i7 < this.b0.size(); i7++) {
            lf lfVar = (lf) this.b0.get(i7);
            ij ijVar2 = lfVar.a;
            if (ijVar2.T(ijVar) && ijVar2.I1 == ijVar.I1) {
                if (i7 == 0) {
                    synchronized (this.b) {
                        lfVar.b.W = true;
                    }
                    return;
                } else {
                    this.Z.remove((lf) this.b0.remove(i7));
                    k(true);
                    return;
                }
            }
        }
    }

    public final void i0(ij ijVar, float f10) {
        ij ijVar2 = this.u0;
        if ((this.i0 == null && this.E0 == null) || ijVar == null || ijVar2 == null || !L(ijVar)) {
            return;
        }
        try {
            t51 t51Var = this.i0;
            if (t51Var != null) {
                long U = t51Var.U();
                if (U == -9223372036854775807L) {
                    this.t0 = f10;
                } else {
                    ijVar2.b0 = f10;
                    long j3 = (int) (U * f10);
                    this.i0.q0(j3, false);
                    if (!this.T1) {
                        d1.f.v(j3);
                    }
                }
            } else {
                t51 t51Var2 = this.E0;
                if (t51Var2 != null) {
                    t51Var2.p0((long) (t51Var2.U() * f10));
                    if (!this.T1) {
                        d1.f.v((long) (this.E0.U() * f10));
                    }
                }
            }
            qs.f(ijVar.I1).k(qs.i2, Integer.valueOf(ijVar2.f1()), Float.valueOf(f10));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void j(ij ijVar) {
        int requestAudioFocus;
        int i7 = (ij.S4(ijVar.k) || ijVar.i4()) ? this.L ? 3 : 2 : 1;
        if (this.U != i7) {
            this.U = i7;
            if (i7 == 3) {
                requestAudioFocus = dt.o0.requestAudioFocus(this, 0, 1);
            } else {
                requestAudioFocus = dt.o0.requestAudioFocus(this, 3, (i7 != 2 || iz.G0) ? 1 : 3);
            }
            if (requestAudioFocus == 1) {
                this.X = 2;
            }
        }
    }

    public final void k(boolean z9) {
        if (this.Z.isEmpty()) {
            this.a0 = null;
        } else {
            this.a0 = (lf) this.Z.get(0);
        }
        if (this.a0 != null || z9) {
            if (VideoEncodingService.e == null) {
                try {
                    t0.b.startService(new Intent(t0.b, (Class<?>) VideoEncodingService.class));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            }
            if (z9) {
                lf lfVar = B().a0;
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService.b != lfVar) {
                    if (lfVar != null) {
                        videoEncodingService.a(lfVar);
                    } else {
                        videoEncodingService.stopSelf();
                    }
                }
            }
        }
    }

    public final void k0(boolean z9) {
        org.telegram.ui.j4 j4Var = this.L0;
        if (j4Var == null) {
            return;
        }
        if (z9) {
            PipRoundVideoView pipRoundVideoView = this.H0;
            if (pipRoundVideoView != null) {
                this.I0 = 2;
                pipRoundVideoView.a(true);
                this.H0 = null;
                return;
            } else {
                if (j4Var.getParent() == null) {
                    this.N0.addView(this.L0);
                }
                this.E0.A0(this.G0);
                return;
            }
        }
        if (j4Var.getParent() != null) {
            this.I0 = 1;
            this.N0.removeView(this.L0);
            return;
        }
        if (this.H0 == null) {
            try {
                PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                this.H0 = pipRoundVideoView2;
                pipRoundVideoView2.d(this.J0, new vd(this, 4));
            } catch (Exception unused) {
                this.H0 = null;
            }
        }
        PipRoundVideoView pipRoundVideoView3 = this.H0;
        if (pipRoundVideoView3 != null) {
            this.E0.A0(pipRoundVideoView3.c);
        }
    }

    public final void l(int i7) {
        int i10;
        File M;
        z5 q10 = z5.q(i7);
        int e10 = t0.e();
        if (e10 == 1) {
            if (!q10.N.g || !q10.p().d) {
                return;
            }
        } else if (e10 == 2) {
            if (!q10.O.g || !q10.o().d) {
                return;
            }
        } else if (!q10.M.g || !q10.n().d) {
            return;
        }
        ArrayList arrayList = iz.N0 ? this.T0 : this.R0;
        if (arrayList == null || arrayList.size() < 2) {
            return;
        }
        if (this.Q0 != null ? !iz.O0 : iz.O0) {
            i10 = this.U0 + 1;
            if (i10 >= arrayList.size()) {
                i10 = 0;
            }
        } else {
            i10 = this.U0 - 1;
            if (i10 < 0) {
                i10 = arrayList.size() - 1;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        ij ijVar = (ij) arrayList.get(i10);
        File file = null;
        if (!TextUtils.isEmpty(ijVar.k.attachPath)) {
            File file2 = new File(ijVar.k.attachPath);
            if (file2.exists()) {
                file = file2;
            }
        }
        if (file != null) {
            M = file;
        } else {
            w7.G(i7);
            M = w7.M(ijVar.k, false, true);
        }
        M.exists();
        if (M == file || M.exists() || !ijVar.J3()) {
            return;
        }
        w7.G(i7).W(ijVar.F0(), ijVar, 0, ij.S5(ijVar.k) ? 2 : 0);
    }

    public final void l0(int i7) {
        boolean z9 = iz.N0;
        if (i7 == 2) {
            iz.N0 = true;
            iz.O0 = false;
        } else if (i7 == 1) {
            iz.O0 = true;
            iz.N0 = false;
        } else {
            iz.O0 = false;
            iz.N0 = false;
        }
        MediaController B = B();
        ij ijVar = B.u0;
        if (ijVar != null && ijVar.J3()) {
            B.l(B.u0.I1);
        }
        SharedPreferences.Editor edit = qp.e1().edit();
        edit.putBoolean("shuffleMusic", iz.N0);
        edit.putBoolean("playOrderReversed", iz.O0);
        edit.apply();
        boolean z10 = iz.N0;
        if (z9 != z10) {
            if (z10) {
                g();
                return;
            }
            ij ijVar2 = this.u0;
            if (ijVar2 != null) {
                int indexOf = this.R0.indexOf(ijVar2);
                this.U0 = indexOf;
                if (indexOf == -1) {
                    r();
                    q(true, true, false, false);
                }
            }
        }
    }

    public final void m() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (Math.abs(currentTimeMillis - f2) < 5000) {
                return;
            }
            AudioManager audioManager = (AudioManager) t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            int i7 = this.L ? 0 : 3;
            int streamVolume = audioManager.getStreamVolume(i7);
            if (streamVolume == 0) {
                audioManager.adjustStreamVolume(i7, streamVolume, 1);
                f2 = currentTimeMillis;
            }
        } catch (Exception unused) {
        }
    }

    public final void m0(boolean z9, float f10) {
        if (z9) {
            if (this.q0 >= 6.0f && f10 == 1.0f && this.u0 != null) {
                this.i0.g0();
                ij ijVar = this.u0;
                g0.i3(new ie(this, ijVar, ijVar.b0, 0), 50L);
            }
            this.q0 = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.s0 = f10;
            }
        } else {
            this.p0 = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.r0 = f10;
            }
        }
        t51 t51Var = this.i0;
        if (t51Var != null) {
            t51Var.v0(Math.round(f10 * 10.0f) / 10.0f);
        } else {
            t51 t51Var2 = this.E0;
            if (t51Var2 != null) {
                t51Var2.v0(Math.round(f10 * 10.0f) / 10.0f);
            }
        }
        qp.e1().edit().putFloat(z9 ? "musicPlaybackSpeed" : "playbackSpeed", f10).putFloat(z9 ? "fastMusicPlaybackSpeed" : "fastPlaybackSpeed", z9 ? this.s0 : this.r0).commit();
        qs.e().k(qs.J4, new Object[0]);
        if (this.T1) {
            return;
        }
        d1.f.z(f10);
    }

    public final void n(boolean z9) {
        File file;
        File file2;
        File file3;
        e0.g gVar;
        e0.g gVar2;
        if (this.H1) {
            di.d1 d1Var = this.G1;
            if (d1Var != null) {
                g0.r(d1Var);
                this.G1 = null;
            }
            boolean c10 = (z9 || (gVar2 = this.F1) == null) ? false : gVar2.c();
            if (!c10 && (gVar = this.F1) != null) {
                gVar.b = false;
                ((vi.h) gVar.e).b();
            }
            if (c10 && (file3 = this.j1) != null) {
                z0.b(file3);
            }
            x(!z9);
            return;
        }
        this.f1 = null;
        z0.b(this.j1);
        if (z9 && (file2 = this.j1) != null) {
            try {
                file2.delete();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        this.j1 = null;
        if (z9 && (file = this.i1) != null) {
            file.delete();
        }
        this.i1 = null;
        this.x0 = false;
        this.r = false;
        this.O = false;
    }

    public final void n0() {
        try {
            float f10 = this.X != 1 ? 1.0f : 0.2f;
            t51 t51Var = this.i0;
            float f11 = 0.0f;
            if (t51Var != null) {
                if (!d1.f.u()) {
                    f11 = this.P1 * f10;
                }
                t51Var.B0(f11);
            } else {
                t51 t51Var2 = this.E0;
                if (t51Var2 != null) {
                    if (d1.f.u()) {
                        f10 = 0.0f;
                    }
                    t51Var2.B0(f10);
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void o() {
        q(true, true, false, false);
        this.D0 = null;
        this.B0 = false;
        for (int i7 = 0; i7 < 4; i7++) {
            z5 q10 = z5.q(i7);
            q10.b.clear();
            q10.c.clear();
            q10.d.clear();
            q10.e.clear();
            q10.f.clear();
            q10.h.clear();
            q10.F.b();
        }
        this.b0.clear();
        this.c0.clear();
        this.U1 = null;
        this.e0 = null;
        this.f0 = null;
        r();
    }

    public final boolean o0(ArrayList arrayList, ij ijVar, long j3, boolean z9, h2.a0 a0Var, long j10) {
        HashMap hashMap;
        ij ijVar2 = this.u0;
        ArrayList arrayList2 = this.R0;
        if (ijVar2 == ijVar) {
            int indexOf = arrayList2.indexOf(ijVar);
            if (indexOf >= 0) {
                this.U0 = indexOf;
            }
            return S(ijVar);
        }
        this.V0 = !z9;
        this.Y0 = j3;
        this.B0 = !arrayList2.isEmpty();
        r();
        this.C0 = a0Var;
        this.a1 = j10;
        boolean z10 = false;
        if (!arrayList.isEmpty() && m5.C(ij.B0(((ij) arrayList.get(0)).k))) {
            z10 = true;
        }
        int size = arrayList.size() - 1;
        int i7 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = TLObject.FLAG_31;
        while (true) {
            hashMap = this.S0;
            if (size < 0) {
                break;
            }
            ij ijVar3 = (ij) arrayList.get(size);
            if (ijVar3.J3()) {
                int f12 = ijVar3.f1();
                if (f12 > 0 || z10) {
                    i7 = Math.min(i7, f12);
                    i10 = Math.max(i10, f12);
                }
                arrayList2.add(ijVar3);
                hashMap.put(Integer.valueOf(f12), ijVar3);
            }
            size--;
        }
        t0();
        int indexOf2 = arrayList2.indexOf(ijVar);
        this.U0 = indexOf2;
        if (indexOf2 == -1) {
            r();
            this.U0 = arrayList2.size();
            arrayList2.add(ijVar);
            hashMap.put(Integer.valueOf(ijVar.f1()), ijVar);
        }
        if (ijVar.J3() && !ijVar.p1) {
            if (iz.N0) {
                g();
            }
            if (z9) {
                if (this.C0 == null) {
                    final ui b02 = ui.b0(ijVar.I1);
                    final long B0 = ij.B0(ijVar.k);
                    final long j11 = this.a1;
                    final long j12 = i7;
                    final long j13 = i10;
                    b02.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.vh
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                        /* JADX WARN: Type inference failed for: r1v12 */
                        /* JADX WARN: Type inference failed for: r1v13 */
                        /* JADX WARN: Type inference failed for: r1v5 */
                        /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
                        /* JADX WARN: Type inference failed for: r1v8 */
                        @Override // java.lang.Runnable
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void run() {
                            ArrayList arrayList3;
                            ?? r12;
                            SQLiteCursor sQLiteCursor;
                            boolean z11;
                            SQLiteCursor sQLiteCursor2;
                            vh vhVar = this;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            int i11 = 0;
                            while (true) {
                                ui uiVar = ui.this;
                                long j14 = j11;
                                long j15 = B0;
                                if (i11 >= 2) {
                                    break;
                                }
                                ArrayList arrayList6 = i11 == 0 ? arrayList4 : arrayList5;
                                long j16 = j12;
                                long j17 = j13;
                                int i12 = i11;
                                if (j14 != 0) {
                                    try {
                                        SQLiteDatabase sQLiteDatabase = uiVar.getMessagesStorage().b;
                                        Locale locale = Locale.US;
                                        String str = i12 == 0 ? "<" : ">";
                                        if (i12 != 0) {
                                            j16 = j17;
                                        }
                                        arrayList3 = arrayList4;
                                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_topics WHERE uid = " + j15 + " AND topic_id = " + j14 + " AND mid " + str + " " + j16 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                    } catch (Exception e10) {
                                        e = e10;
                                        arrayList3 = arrayList4;
                                        a8.g(e, true);
                                        g0.h3(new l9(uiVar, j15, arrayList3, arrayList5, j14));
                                    }
                                } else {
                                    arrayList3 = arrayList4;
                                    if (i12 == 0) {
                                        if (m5.C(j15)) {
                                            SQLiteDatabase sQLiteDatabase2 = uiVar.getMessagesStorage().b;
                                            Locale locale2 = Locale.US;
                                            sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j15 + " AND mid > " + j16 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        } else {
                                            SQLiteDatabase sQLiteDatabase3 = uiVar.getMessagesStorage().b;
                                            Locale locale3 = Locale.US;
                                            sQLiteCursor2 = sQLiteDatabase3.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j15 + " AND mid < " + j16 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        }
                                    } else if (m5.C(j15)) {
                                        SQLiteDatabase sQLiteDatabase4 = uiVar.getMessagesStorage().b;
                                        Locale locale4 = Locale.US;
                                        r12 = 0;
                                        sQLiteCursor = sQLiteDatabase4.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j15 + " AND mid < " + j17 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        while (sQLiteCursor.next()) {
                                            try {
                                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(r12);
                                                if (byteBufferValue != 0) {
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r12), r12);
                                                    TLdeserialize.readAttachPath(byteBufferValue, uiVar.getUserConfig().n);
                                                    byteBufferValue.reuse();
                                                    if (ij.L3(TLdeserialize)) {
                                                        TLdeserialize.id = sQLiteCursor.intValue(1);
                                                        TLdeserialize.dialog_id = j15;
                                                        z11 = false;
                                                        arrayList6.add(0, new ij(uiVar.currentAccount, TLdeserialize, false, true));
                                                    } else {
                                                        z11 = false;
                                                    }
                                                } else {
                                                    z11 = r12;
                                                }
                                                r12 = z11;
                                            } catch (Exception e11) {
                                                e = e11;
                                                a8.g(e, true);
                                                g0.h3(new l9(uiVar, j15, arrayList3, arrayList5, j14));
                                            }
                                        }
                                        sQLiteCursor.dispose();
                                        i11 = i12 + 1;
                                        vhVar = this;
                                        arrayList4 = arrayList3;
                                    } else {
                                        SQLiteDatabase sQLiteDatabase5 = uiVar.getMessagesStorage().b;
                                        Locale locale5 = Locale.US;
                                        sQLiteCursor2 = sQLiteDatabase5.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j15 + " AND mid > " + j17 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                    }
                                }
                                r12 = 0;
                                sQLiteCursor = sQLiteCursor2;
                                while (sQLiteCursor.next()) {
                                }
                                sQLiteCursor.dispose();
                                i11 = i12 + 1;
                                vhVar = this;
                                arrayList4 = arrayList3;
                                g0.h3(new l9(uiVar, j15, arrayList3, arrayList5, j14));
                            }
                            arrayList3 = arrayList4;
                            g0.h3(new l9(uiVar, j15, arrayList3, arrayList5, j14));
                        }
                    });
                } else {
                    this.Z0 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return S(ijVar);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i7) {
        g0.h3(new yd(this, i7, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x03d2  */
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
        long j3;
        int i7;
        boolean z9;
        boolean z10;
        int i10;
        boolean z11;
        ArrayList arrayList;
        ij ijVar;
        if (this.P && VoIPService.getSharedInstance() == null) {
            if (sensorEvent.sensor.getType() == 8) {
                if (r2.a) {
                    a8.b("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f10 = this.K;
                float f11 = sensorEvent.values[0];
                if (f10 != f11) {
                    this.J = true;
                }
                this.K = f11;
                if (this.J) {
                    this.I = f11 < 5.0f && f11 != this.e.getMaximumRange();
                }
                j3 = 0;
                z9 = 1;
                i7 = 2;
            } else {
                Sensor sensor = sensorEvent.sensor;
                if (sensor == this.f) {
                    double d = this.H == 0 ? 0.9800000190734863d : 1.0d / (((sensorEvent.timestamp - r2) / 1.0E9d) + 1.0d);
                    this.H = sensorEvent.timestamp;
                    float[] fArr = this.R;
                    double d10 = 1.0d - d;
                    float[] fArr2 = sensorEvent.values;
                    j3 = 0;
                    float f12 = (float) ((fArr2[0] * d10) + (fArr[0] * d));
                    fArr[0] = f12;
                    z9 = 1;
                    i7 = 2;
                    float f13 = (float) ((fArr2[1] * d10) + (fArr[1] * d));
                    fArr[1] = f13;
                    float f14 = (float) ((d10 * fArr2[2]) + (d * fArr[2]));
                    fArr[2] = f14;
                    float[] fArr3 = this.S;
                    fArr3[0] = (fArr2[0] * 0.19999999f) + (f12 * 0.8f);
                    fArr3[1] = (fArr2[1] * 0.19999999f) + (f13 * 0.8f);
                    fArr3[2] = (fArr2[2] * 0.19999999f) + (f14 * 0.8f);
                    float[] fArr4 = this.T;
                    fArr4[0] = fArr2[0] - fArr[0];
                    fArr4[1] = fArr2[1] - fArr[1];
                    fArr4[2] = fArr2[2] - fArr[2];
                } else {
                    j3 = 0;
                    boolean z12 = true;
                    i7 = 2;
                    if (sensor == this.h) {
                        float[] fArr5 = this.T;
                        float[] fArr6 = sensorEvent.values;
                        fArr5[0] = fArr6[0];
                        fArr5[1] = fArr6[1];
                        fArr5[2] = fArr6[2];
                        z9 = z12;
                    } else {
                        z9 = z12;
                        if (sensor == this.n) {
                            float[] fArr7 = this.S;
                            float[] fArr8 = this.R;
                            float[] fArr9 = sensorEvent.values;
                            float f15 = fArr9[0];
                            fArr8[0] = f15;
                            fArr7[0] = f15;
                            float f16 = fArr9[1];
                            fArr8[1] = f16;
                            fArr7[1] = f16;
                            float f17 = fArr9[2];
                            fArr8[2] = f17;
                            fArr7[2] = f17;
                            z9 = z12;
                        }
                    }
                }
            }
            Sensor sensor2 = sensorEvent.sensor;
            if (sensor2 == this.h || sensor2 == this.n || sensor2 == this.f) {
                float[] fArr10 = this.R;
                float f18 = fArr10[0];
                float[] fArr11 = this.T;
                float f19 = (fArr10[i7] * fArr11[i7]) + (fArr10[z9] * fArr11[z9]) + (f18 * fArr11[0]);
                int i11 = this.E;
                if (i11 != 6 && ((f19 > 0.0f && this.Q > 0.0f) || (f19 < 0.0f && this.Q < 0.0f))) {
                    if (f19 > 0.0f) {
                        z10 = f19 > 15.0f ? z9 : false;
                        i10 = z9;
                    } else {
                        z10 = f19 < -15.0f ? z9 : false;
                        i10 = i7;
                    }
                    int i12 = this.D;
                    if (i12 != 0 && i12 != i10) {
                        int i13 = this.y;
                        if (i13 != 6 || !z10) {
                            if (!z10) {
                                this.F++;
                            }
                            if (this.F == 10 || i13 != 6 || i11 != 0) {
                                this.y = 0;
                                this.D = 0;
                                this.E = 0;
                                this.F = 0;
                            }
                        } else if (i11 < 6) {
                            int i14 = i11 + 1;
                            this.E = i14;
                            if (i14 == 6) {
                                this.y = 0;
                                this.D = 0;
                                this.F = 0;
                                this.G = System.currentTimeMillis();
                                boolean z13 = r2.a;
                            }
                        }
                    } else if (z10 && i11 == 0 && (i12 == 0 || i12 == i10)) {
                        int i15 = this.y;
                        if (i15 < 6 && !this.I) {
                            this.D = i10;
                            int i16 = i15 + 1;
                            this.y = i16;
                            if (i16 == 6) {
                                this.F = 0;
                            }
                        }
                    } else {
                        if (!z10) {
                            this.F++;
                        }
                        if (i12 != i10 || this.F == 10 || this.y != 6 || i11 != 0) {
                            this.E = 0;
                            this.y = 0;
                            this.D = 0;
                            this.F = 0;
                        }
                    }
                }
                this.Q = f19;
                float[] fArr12 = this.S;
                this.w = (fArr12[z9] <= 2.5f || Math.abs(fArr12[i7]) >= 4.0f || Math.abs(this.S[0]) <= 1.5f) ? false : z9;
            }
            if (this.E == 6 || this.w) {
                this.x = System.currentTimeMillis();
            }
            boolean z14 = (this.x0 || this.u0 != null || !iz.k(z9) || !t0.w || this.M || !this.N || this.s == null || this.W) ? false : z9;
            boolean z15 = (iz.k(false) && (ijVar = this.u0) != null && (ij.S4(ijVar.k) || this.u0.i4())) ? z9 : false;
            boolean z16 = this.I;
            boolean z17 = (this.E == 6 || this.w || System.currentTimeMillis() - this.x < 60) ? z9 : false;
            boolean z18 = (this.L || this.r) ? z9 : false;
            boolean z19 = ((z17 || z18) && !y() && !VoIPService.isAnyKindOfCallActive() && (z14 || z15) && !PhotoViewer.p1().P1()) ? z9 : false;
            PowerManager.WakeLock wakeLock = this.d;
            if (wakeLock != null) {
                boolean isHeld = wakeLock.isHeld();
                if (isHeld && !z19) {
                    if (r2.a) {
                        a8.b("wake lock releasing (proximityDetected=" + z16 + ", accelerometerDetected=" + z17 + ", alreadyPlaying=" + z18 + ")");
                    }
                    this.d.release();
                } else if (!isHeld && z19) {
                    if (r2.a) {
                        a8.b("wake lock acquiring (proximityDetected=" + z16 + ", accelerometerDetected=" + z17 + ", alreadyPlaying=" + z18 + ")");
                    }
                    this.d.acquire();
                }
            }
            boolean z20 = this.I;
            if (z20 && z19) {
                if (z14 && this.L1 == null) {
                    if (!this.r) {
                        if (r2.a) {
                            a8.b("start record");
                        }
                        this.L = z9;
                        if (this.f1 == null) {
                            org.telegram.ui.an anVar = this.s;
                            ArrayList arrayList2 = anVar.K6;
                            org.telegram.ui.qj qjVar = anVar.Z;
                            if (qjVar == null || !qjVar.v0()) {
                                int size = arrayList2.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        ij ijVar2 = (ij) arrayList2.get(size);
                                        if ((ij.S4(ijVar2.k) || ijVar2.i4()) && ijVar2.k.media_unread && !ijVar2.O3()) {
                                            MediaController B = B();
                                            if (B().S(ijVar2)) {
                                                z11 = true;
                                                arrayList = anVar.g8(ijVar2, true);
                                            } else {
                                                z11 = true;
                                                arrayList = null;
                                            }
                                            B.r0(arrayList, z11);
                                        } else {
                                            size--;
                                        }
                                    } else if (anVar.getParentActivity() != null && anVar.getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                        anVar.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                                    }
                                }
                            }
                            if (this.L) {
                                q0();
                            }
                        }
                        this.r = true;
                        this.L = false;
                        W(true);
                        if (this.L) {
                        }
                    }
                } else if (z15 && !this.L) {
                    if (r2.a) {
                        a8.b("start listen");
                    }
                    q0();
                    u0(false);
                }
                this.E = 0;
                this.y = 0;
                this.D = 0;
                this.F = 0;
            } else if (z20 && ((this.f == null || this.h == null) && this.n == null && !VoIPService.isAnyKindOfCallActive())) {
                if (this.u0 != null && !t0.x && z15 && !this.L && !this.x0 && !y()) {
                    if (r2.a) {
                        a8.b("start listen by proximity only");
                    }
                    q0();
                    u0(false);
                }
            } else if (!this.I && !this.x0) {
                if (this.r) {
                    if (r2.a) {
                        a8.b("stop record");
                    }
                    W(false);
                    this.r = false;
                    this.O = false;
                } else if (this.L) {
                    if (r2.a) {
                        a8.b("stop listen");
                    }
                    this.L = false;
                    u0(true);
                    this.O = false;
                }
            }
            if (this.G == j3 || this.E != 6 || Math.abs(System.currentTimeMillis() - this.G) <= 1000) {
                return;
            }
            this.E = 0;
            this.y = 0;
            this.D = 0;
            this.F = 0;
            this.G = j3;
        }
    }

    public final void p(boolean z9, boolean z10) {
        q(z9, z10, false, false);
    }

    public final void p0(TextureView textureView, org.telegram.ui.j4 j4Var, FrameLayout frameLayout, boolean z9) {
        if (textureView == null) {
            return;
        }
        if (!z9 && this.G0 == textureView) {
            this.I0 = 1;
            this.G0 = null;
            this.L0 = null;
            this.N0 = null;
            return;
        }
        t51 t51Var = this.E0;
        if (t51Var == null || textureView == this.G0) {
            return;
        }
        this.M0 = j4Var != null && j4Var.d;
        this.G0 = textureView;
        PipRoundVideoView pipRoundVideoView = this.H0;
        if (pipRoundVideoView != null) {
            t51Var.A0(pipRoundVideoView.c);
        } else {
            t51Var.A0(textureView);
        }
        this.L0 = j4Var;
        this.N0 = frameLayout;
        if (!this.P0 || j4Var == null) {
            return;
        }
        j4Var.a(this.O0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z9, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        PipRoundVideoView pipRoundVideoView;
        ij ijVar;
        int i7 = qs.j2;
        if (z10 && a0()) {
            return;
        }
        int i10 = 1;
        boolean z14 = false;
        if (this.i0 != null) {
            ef efVar = this.w0;
            if (efVar != null) {
                efVar.b();
                this.w0 = null;
            }
            ValueAnimator valueAnimator = this.Q1;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.Q1.cancel();
            }
            if (d1.f.u() || !this.i0.d0() || (ijVar = this.u0) == null || ij.S4(ijVar.k)) {
                try {
                    this.i0.m0();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else {
                t51 t51Var = this.i0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.P1, 0.0f);
                ofFloat.addUpdateListener(new q(i10, this, t51Var));
                ofFloat.addListener(new m.a(t51Var, 6));
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
            this.i0 = null;
            org.telegram.ui.ActionBar.k6.N1(this.u0);
        } else {
            t51 t51Var2 = this.E0;
            if (t51Var2 != null) {
                this.L0 = null;
                this.N0 = null;
                this.P0 = false;
                this.M0 = false;
                this.G0 = null;
                this.v0 = null;
                if (z12) {
                    PhotoViewer.p1().R2 = this.E0;
                    ij ijVar2 = this.u0;
                    this.v0 = ijVar2;
                    qs.f(ijVar2.I1).k(i7, this.u0, Boolean.TRUE);
                } else {
                    long S = t51Var2.S();
                    ij ijVar3 = this.u0;
                    if (ijVar3 != null && ij.M4(ijVar3.k) && S > 0) {
                        ij ijVar4 = this.u0;
                        ijVar4.d0 = (int) S;
                        qs.f(ijVar4.I1).k(i7, this.u0, Boolean.FALSE);
                    }
                    this.E0.m0();
                    this.E0 = null;
                }
                try {
                    this.J0.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                if (this.u0 != null && !z12) {
                    g0.r(this.c1);
                    w7.G(this.u0.I1).Z(this.u0.F0(), true, false);
                }
            }
        }
        z0();
        this.g0 = false;
        ij ijVar5 = this.u0;
        if (ijVar5 != null) {
            if (this.A0) {
                w7.G(ijVar5.I1).f(this.u0.F0());
            }
            ij ijVar6 = this.u0;
            if (z9) {
                ijVar6.H5();
                qs.f(ijVar6.I1).k(qs.e2, Integer.valueOf(this.u0.f1()), 0);
            }
            this.u0 = null;
            this.A0 = false;
            if (z9) {
                dt.o0.abandonAudioFocus(this);
                this.U = 0;
                ArrayList arrayList = this.e0;
                int i11 = -1;
                if (arrayList != null) {
                    if (!z11 || (i11 = arrayList.indexOf(ijVar6)) < 0) {
                        this.e0 = null;
                        this.f0 = null;
                    } else {
                        this.e0.remove(i11);
                        this.f0.remove(ijVar6.f1());
                        if (this.e0.isEmpty()) {
                            this.e0 = null;
                            this.f0 = null;
                        }
                    }
                }
                ArrayList arrayList2 = this.e0;
                if (arrayList2 == null || i11 >= arrayList2.size()) {
                    if ((ij.S4(ijVar6.k) || ijVar6.i4()) && ijVar6.f1() != 0 && this.L && this.s != null && this.N && iz.k(true)) {
                        this.r = true;
                        int currentAccount = this.s.getCurrentAccount();
                        long a10 = this.s.a();
                        org.telegram.ui.an anVar = this.s;
                        ij ijVar7 = anVar.l4;
                        int classGuid = anVar.getClassGuid();
                        org.telegram.ui.an anVar2 = this.s;
                        hw W8 = anVar2 != null ? anVar2.W8() : null;
                        org.telegram.ui.an anVar3 = this.s;
                        long h92 = anVar3 != null ? anVar3.h9() : 0L;
                        org.telegram.ui.an anVar4 = this.s;
                        x0(currentAccount, a10, null, ijVar7, null, classGuid, false, W8, h92, anVar4 != null ? anVar4.w5 : null);
                        this.O = true;
                    }
                    z13 = false;
                    qs.f(ijVar6.I1).k(qs.f2, Integer.valueOf(ijVar6.f1()), Boolean.valueOf(z10));
                    this.I0 = 0;
                    PipRoundVideoView pipRoundVideoView2 = this.H0;
                    if (pipRoundVideoView2 != null) {
                        pipRoundVideoView2.a(true);
                        this.H0 = null;
                    }
                } else {
                    ij ijVar8 = (ij) this.e0.get(i11);
                    S(ijVar8);
                    if (!ijVar8.i4() && (pipRoundVideoView = this.H0) != null) {
                        pipRoundVideoView.a(true);
                        this.H0 = null;
                    }
                    z13 = false;
                    z14 = true;
                    if (z10) {
                        t0.b.stopService(new Intent(t0.b, (Class<?>) MusicPlayerService.class));
                    }
                }
            } else {
                z13 = false;
            }
            z14 = z13;
            if (z10) {
            }
        } else {
            z13 = false;
        }
        if (!z14 && z11 && !iz.k(true)) {
            org.telegram.ui.an anVar5 = this.s;
            A0(anVar5, z13, z13);
            this.s = anVar5;
        }
        if (!z10 || d1.f.f() == null) {
            return;
        }
        try {
            g6.a c10 = g6.a.c(d1.f.f());
            if (c10 == null) {
                return;
            }
            c10.b().b(true);
        } catch (Exception e12) {
            a8.g(e12, true);
        }
    }

    public final void q0() {
        this.L = true;
        AudioManager audioManager = dt.o0;
        audioManager.setBluetoothScoOn(false);
        audioManager.setSpeakerphoneOn(false);
    }

    public final void r() {
        this.Q0 = null;
        this.R0.clear();
        this.S0.clear();
        this.T0.clear();
        this.Z0 = 0;
        boolean[] zArr = this.W0;
        zArr[1] = false;
        zArr[0] = false;
        this.Y0 = 0L;
        this.a1 = 0L;
        int[] iArr = this.b1;
        iArr[1] = Integer.MAX_VALUE;
        iArr[0] = Integer.MAX_VALUE;
        this.X0 = false;
        this.C0 = null;
        this.U1 = null;
    }

    public final void r0(ArrayList arrayList, boolean z9) {
        ArrayList arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
        this.e0 = arrayList2;
        if (arrayList2 != null) {
            this.d0 = z9;
            this.f0 = new SparseArray();
            for (int i7 = 0; i7 < this.e0.size(); i7++) {
                ij ijVar = (ij) this.e0.get(i7);
                this.f0.put(ijVar.f1(), ijVar);
            }
        }
    }

    public final void s(ac.e eVar) {
        File file = (File) eVar.b;
        this.j1 = file;
        long j3 = eVar.a;
        this.k1 = j3;
        byte[] bArr = (byte[]) eVar.c;
        G0(file, j3, bArr == null ? null : (byte[]) bArr.clone());
        if (this.B1 == 3) {
            this.K1 = eVar;
            e0.g gVar = this.F1;
            if (gVar != null) {
                ((vi.h) gVar.e).o();
                gVar.c = true;
                this.F1 = null;
            }
            Y(false);
            j0(false);
            return;
        }
        ui.b0(this.h1).B1(this.m1, this.n1, null);
        if (this.B1 == 1) {
            ez f10 = ez.f(this.f1, null, file.getAbsolutePath(), this.m1, this.q1, this.r1, null, null, null, null, this.C1, this.D1, 0, this.E1 ? Integer.MAX_VALUE : 0, null, null, false);
            f10.R = this.o1;
            f10.T = this.p1;
            f10.H = this.s1;
            f10.K = this.t1;
            f10.Q = 0L;
            gz.C(this.h1).r0(f10);
        }
        qs f11 = qs.f(this.h1);
        Integer valueOf = Integer.valueOf(this.g1);
        int i7 = this.B1;
        f11.k(qs.s2, valueOf, i7 == 2 ? this.f1 : null, i7 == 2 ? file.getAbsolutePath() : null);
        x(true);
    }

    public final void t0() {
        Collections.sort(this.R0, new jg.x(17));
    }

    public final void u0(boolean z9) {
        ij ijVar = this.u0;
        if (ijVar == null) {
            return;
        }
        qs.f(ijVar.I1).k(qs.u2, Boolean.valueOf(this.L));
        t51 t51Var = this.E0;
        if (t51Var != null) {
            t51Var.x0(this.L ? 0 : 3);
            if (z9) {
                R(this.u0, true);
                return;
            }
            if (this.E0.S() < 1000) {
                this.E0.p0(0L);
            }
            this.E0.h0();
            return;
        }
        t51 t51Var2 = this.i0;
        boolean z10 = t51Var2 != null;
        ij ijVar2 = this.u0;
        float f10 = ijVar2.b0;
        int i7 = ijVar2.h0;
        if (z9 || t51Var2 == null || !t51Var2.d0() || i7 * f10 > 1.0f) {
            ijVar2.b0 = f10;
        } else {
            ijVar2.b0 = 0.0f;
        }
        q(false, true, false, false);
        S(ijVar2);
        if (z9) {
            if (z10) {
                g0.i3(new y4(21, this, ijVar2), 100L);
            } else {
                R(ijVar2, true);
            }
        }
    }

    public final void v0(ij ijVar) {
        synchronized (this.z0) {
            Timer timer = this.y0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.y0 = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            ijVar.S0();
            Timer timer2 = new Timer();
            this.y0 = timer2;
            timer2.schedule(new jg.q1(1, this, ijVar), 0L, 17L);
        }
    }

    public final void w0(org.telegram.ui.an anVar) {
        if (anVar != null) {
            if ((this.f == null && this.n == null) || this.e == null) {
                return;
            }
            if (!iz.k(false)) {
                ij ijVar = this.u0;
                if (ijVar == null) {
                    return;
                }
                if (!ij.S4(ijVar.k) && !this.u0.i4()) {
                    return;
                }
            }
            this.s = anVar;
            if (this.P) {
                return;
            }
            float[] fArr = this.R;
            fArr[2] = 0.0f;
            fArr[1] = 0.0f;
            fArr[0] = 0.0f;
            float[] fArr2 = this.T;
            fArr2[2] = 0.0f;
            fArr2[1] = 0.0f;
            fArr2[0] = 0.0f;
            float[] fArr3 = this.S;
            fArr3[2] = 0.0f;
            fArr3[1] = 0.0f;
            fArr3[0] = 0.0f;
            this.H = 0L;
            this.Q = 0.0f;
            this.y = 0;
            this.D = 0;
            this.F = 0;
            this.E = 0;
            Utilities.e.c(new vd(this, 3));
            this.P = true;
        }
    }

    public final void x(boolean z9) {
        File file;
        Y(false);
        j0(false);
        e0.g gVar = this.F1;
        if (gVar != null) {
            ((vi.h) gVar.e).o();
            gVar.c = true;
            this.F1 = null;
        }
        if (!z9 && (file = this.j1) != null) {
            z0.b(file);
            this.j1.delete();
        }
        Z();
        this.x0 = false;
        this.r = false;
        this.O = false;
    }

    public final void x0(int i7, long j3, ij ijVar, ij ijVar2, TL_stories.StoryItem storyItem, int i10, boolean z9, hw hwVar, long j10, nj njVar) {
        ij ijVar3 = this.u0;
        boolean z10 = (ijVar3 == null || !I(ijVar3) || H()) ? false : true;
        this.x0 = z9;
        Y(true);
        try {
            this.K0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.H1 && !X()) {
            g0.h3(new g9(i7, i10, 2));
            return;
        }
        if (!s0(i7)) {
            if (r2.a) {
                a8.b("AudioRecorder legacy selected: account=" + i7 + ", dialog=" + j3 + ", guid=" + i10);
            }
            wd wdVar = new wd(this, i7, i10, j3, j10, njVar, ijVar2, ijVar, storyItem, hwVar);
            this.L1 = wdVar;
            this.M1.d(wdVar, z10 ? 500L : 50L);
            return;
        }
        this.H1 = true;
        this.I1 = false;
        this.J1 = false;
        this.h1 = i7;
        this.g1 = i10;
        this.m1 = j3;
        this.o1 = j10;
        this.p1 = njVar;
        this.n1 = ijVar2 == null ? 0L : ij.c2(i7, ijVar2.k, false, false);
        this.q1 = ijVar;
        this.r1 = ijVar2;
        this.s1 = storyItem;
        this.t1 = hwVar;
        this.i1 = null;
        this.j1 = null;
        this.k1 = 0L;
        this.l1 = 0;
        this.v1 = 0L;
        this.B1 = 0;
        di.d1 d1Var = new di.d1(i7, i10, 1, j3, this);
        this.G1 = d1Var;
        g0.i3(d1Var, z10 ? 500L : 50L);
    }

    public final void y0() {
        if (this.b0.isEmpty()) {
            return;
        }
        lf lfVar = (lf) this.b0.get(0);
        j20 j20Var = lfVar.b;
        synchronized (this.b) {
            if (j20Var != null) {
                try {
                    j20Var.W = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        new Thread(new a(lfVar, 20)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final g7.c z() {
        FileOutputStream fileOutputStream;
        hy0 hy0Var;
        wf.d dVar;
        ij ijVar = this.u0;
        FileOutputStream fileOutputStream2 = null;
        String str = null;
        if (ijVar != null) {
            String z12 = ijVar.z1(true);
            String x12 = this.u0.x1(true);
            TLRPC.Document F0 = this.u0.F0();
            if (this.u0.i4() || ij.M4(this.u0.k) || this.u0.J3()) {
                ij ijVar2 = this.u0;
                File file = (!ijVar2.w0 || ijVar2.k == null) ? null : new File(this.u0.k.attachPath);
                if (file == null || !file.exists()) {
                    w7.G(this.u0.I1);
                    file = w7.M(this.u0.k, false, true);
                }
                if (file != null && file.exists()) {
                    String u12 = this.u0.u1();
                    Uri parse = Uri.parse("file://" + file.getAbsolutePath());
                    f6.l lVar = new f6.l(0);
                    rf.a aVar = this.D0;
                    if (aVar != null) {
                        if (!TextUtils.isEmpty(aVar.c)) {
                            lVar.b("com.google.android.gms.cast.metadata.TITLE", this.D0.c);
                        }
                        if (!TextUtils.isEmpty(this.D0.d)) {
                            lVar.b("com.google.android.gms.cast.metadata.ARTIST", this.D0.d);
                        }
                        if (!TextUtils.isEmpty(this.D0.f)) {
                            lVar.b("com.google.android.gms.cast.metadata.ALBUM_TITLE", this.D0.f);
                        }
                        if (!TextUtils.isEmpty(this.D0.e)) {
                            lVar.b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", this.D0.e);
                        }
                        if (!TextUtils.isEmpty(this.D0.m)) {
                            lVar.b("com.google.android.gms.cast.metadata.COMPOSER", this.D0.m);
                        }
                        short s5 = this.D0.k;
                        Bundle bundle = lVar.b;
                        if (s5 != 0) {
                            f6.l.c(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", s5);
                        }
                        short s9 = this.D0.j;
                        if (s9 != 0) {
                            f6.l.c(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", s9);
                        }
                        rf.a aVar2 = this.D0;
                        if (aVar2.o != null) {
                            File file2 = aVar2.q;
                            if (file2 == null || !file2.exists()) {
                                file2 = fi.e7.w(p10.s0, "jpg");
                                try {
                                    Bitmap bitmap = this.D0.o;
                                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                                    fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        try {
                                            bitmap.compress(compressFormat, 80, fileOutputStream);
                                            try {
                                                fileOutputStream.close();
                                            } catch (Exception e10) {
                                                a8.g(e10, true);
                                            }
                                        } catch (Exception e11) {
                                            e = e11;
                                            a8.g(e, true);
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception e12) {
                                                    a8.g(e12, true);
                                                }
                                            }
                                            file2 = null;
                                            this.D0.q = file2;
                                            if (file2 != null) {
                                                hy0Var = (hy0) wf.b.Z().b;
                                                dVar = (wf.d) hy0Var.b;
                                                if (dVar != null) {
                                                }
                                                str = "/file" + Utilities.c.nextLong();
                                                if (((wf.d) hy0Var.b) == null) {
                                                }
                                                ((wf.d) hy0Var.b).l(file2, str);
                                                lVar.a.add(new p6.a(Uri.parse(wf.d.j(wf.d.i(), str)), 0, 0));
                                            }
                                            v4.v0 v0Var = new v4.v0(parse, u12, "/player_" + this.u0.f1());
                                            v0Var.g = z12;
                                            v0Var.h = x12;
                                            v0Var.f = lVar;
                                            return new g7.c(new wf.e(v0Var));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream2 = fileOutputStream;
                                        if (fileOutputStream2 != null) {
                                            try {
                                                fileOutputStream2.close();
                                            } catch (Exception e13) {
                                                a8.g(e13, true);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception e14) {
                                    e = e14;
                                    fileOutputStream = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (fileOutputStream2 != null) {
                                    }
                                    throw th;
                                }
                                this.D0.q = file2;
                            }
                            if (file2 != null && file2.exists()) {
                                hy0Var = (hy0) wf.b.Z().b;
                                dVar = (wf.d) hy0Var.b;
                                if (dVar != null) {
                                    Pair pair = dVar.i;
                                    if ((pair == null ? null : (File) pair.second) != null) {
                                        if (TextUtils.equals((pair == null ? null : (File) pair.second).getAbsolutePath(), file2.getAbsolutePath())) {
                                            Pair pair2 = ((wf.d) hy0Var.b).i;
                                            if (pair2 != null) {
                                                str = (String) pair2.first;
                                            }
                                            lVar.a.add(new p6.a(Uri.parse(wf.d.j(wf.d.i(), str)), 0, 0));
                                        }
                                    }
                                }
                                str = "/file" + Utilities.c.nextLong();
                                if (((wf.d) hy0Var.b) == null) {
                                    hy0Var.b = new wf.d();
                                }
                                ((wf.d) hy0Var.b).l(file2, str);
                                lVar.a.add(new p6.a(Uri.parse(wf.d.j(wf.d.i(), str)), 0, 0));
                            }
                        }
                    }
                    v4.v0 v0Var2 = new v4.v0(parse, u12, "/player_" + this.u0.f1());
                    v0Var2.g = z12;
                    v0Var2.h = x12;
                    v0Var2.f = lVar;
                    return new g7.c(new wf.e(v0Var2));
                }
            }
            t51 t51Var = this.E0;
            if (t51Var != null) {
                return t51Var.Q(a8.p0.r(new StringBuilder(), F0 != null ? F0.id : this.u0.f1(), ""), z12, x12);
            }
            t51 t51Var2 = this.i0;
            if (t51Var2 != null) {
                return t51Var2.Q(a8.p0.r(new StringBuilder(), F0 != null ? F0.id : this.u0.f1(), ""), z12, x12);
            }
        }
        return null;
    }

    public final void z0() {
        synchronized (this.z0) {
            Timer timer = this.y0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.y0 = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i7) {
    }
}
