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
import org.telegram.ui.Components.m51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class MediaController implements AudioManager.OnAudioFocusChangeListener, cs, SensorEventListener {
    public static final String[] W1;
    public static final String[] X1;
    public static final ConcurrentHashMap Y1;
    public static Runnable Z1;
    public static pe a2;
    public static pe b2;
    public static ArrayList c2;
    public static ArrayList d2;
    public static ai.d3 e2;
    public static volatile MediaController f2;
    public static long g2;
    public static boolean h2;
    public boolean B0;
    public boolean C0;
    public int C1;
    public g2.b0 D0;
    public boolean D1;
    public int E;
    public of.a E0;
    public int E1;
    public int F;
    public m51 F0;
    public boolean F1;
    public int G;
    public boolean G0;
    public e0.g G1;
    public long H;
    public TextureView H0;
    public ei.d1 H1;
    public PipRoundVideoView I0;
    public boolean I1;
    public boolean J;
    public int J0;
    public boolean J1;
    public boolean K;
    public LaunchActivity K0;
    public boolean K1;
    public View L0;
    public vi.f L1;
    public boolean M;
    public org.telegram.ui.l4 M0;
    public pd M1;
    public boolean N;
    public boolean N0;
    public final p5 N1;
    public boolean O;
    public FrameLayout O0;
    public final p5 O1;
    public boolean P;
    public float P0;
    public boolean Q;
    public boolean Q0;
    public float Q1;
    public float R;
    public bp R0;
    public ValueAnimator R1;
    public androidx.emoji2.text.j T1;
    public boolean U1;
    public int V;
    public int V0;
    public af V1;
    public boolean W;
    public boolean W0;
    public boolean X;
    public boolean Y0;
    public boolean Z;
    public long Z0;
    public int a1;
    public cf b0;
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
    public ej q1;
    public boolean r;
    public zi r1;
    public org.telegram.ui.wm s;
    public zi s1;
    public TL_stories.StoryItem t1;
    public float u0;
    public zv u1;
    public zi v0;
    public boolean w;
    public zi w0;
    public long w1;
    public long x;
    public we x0;
    public int y;
    public boolean y0;
    public final ByteBuffer z1;
    public final nd a = new AudioManager.OnAudioFocusChangeListener() { // from class: org.telegram.messenger.nd
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i3) {
            MediaController mediaController = MediaController.this;
            if (i3 != 1) {
                mediaController.W = false;
            } else {
                String[] strArr = MediaController.W1;
                mediaController.getClass();
            }
        }
    };
    public final Object b = new Object();
    public long I = 0;
    public float L = -100.0f;
    public final float[] S = new float[3];
    public final float[] T = new float[3];
    public final float[] U = new float[3];
    public int Y = 0;
    public final ArrayList a0 = new ArrayList();
    public final ArrayList c0 = new ArrayList();
    public final HashMap d0 = new HashMap();
    public boolean h0 = false;
    public boolean i0 = false;
    public m51 j0 = null;
    public m51 k0 = null;
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
    public final le d1 = new le(this);
    public int h1 = -1;
    public short[] v1 = new short[1024];
    public final Object x1 = new Object();
    public final ArrayList y1 = new ArrayList();
    public int A1 = 1280;
    public int B1 = 48000;
    public final mi.b0 P1 = new mi.b0(this, 5);
    public final ei.n4 S1 = new ei.n4(this, 6);

    static {
        int i3 = Build.VERSION.SDK_INT;
        W1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i3 > 28 ? "date_modified" : "datetaken", "orientation", "width", "height", "_size"};
        X1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i3 > 28 ? "date_modified" : "datetaken", "duration", "width", "height", "_size"};
        Y1 = new ConcurrentHashMap();
        c2 = new ArrayList();
        d2 = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.telegram.messenger.nd] */
    public MediaController() {
        p5 p5Var = new p5("recordQueue");
        this.N1 = p5Var;
        p5Var.setPriority(10);
        p5 p5Var2 = new p5("fileEncodingQueue");
        this.O1 = p5Var2;
        p5Var2.setPriority(10);
        p5Var.c(new od(this, 0));
        Utilities.e.c(new od(this, 1));
        this.z1 = ByteBuffer.allocateDirect(1920);
        g0.h3(new od(this, 2));
        ContentResolver contentResolver = t0.b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.e2(null, 1));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.e2(null, 2));
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.e2(null, 1));
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.e2(null, 2));
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
        MediaController mediaController2 = f2;
        if (mediaController2 != null) {
            return mediaController2;
        }
        synchronized (MediaController.class) {
            try {
                mediaController = f2;
                if (mediaController == null) {
                    mediaController = new MediaController();
                    f2 = mediaController;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaController;
    }

    public static int E(String str) {
        int i3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e10) {
            a8.g(e10, true);
            i3 = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            a8.g(th2, true);
        }
        return i3;
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
        String e10 = t4.c.e(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = e10.getBytes("UTF-8");
        int length = bytes.length + bytes2.length + 2;
        if (length > 65535) {
            throw new IOException(k2.p1.i(length, "XMP segment too large: "));
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read();
            int read2 = fileInputStream.read();
            if (read != 255 || read2 != 216) {
                throw new IOException("Not a JPEG: " + file);
            }
            outputStream.write(hs.e4);
            outputStream.write(hs.t3);
            outputStream.write(hs.e4);
            outputStream.write(hs.C3);
            outputStream.write((length >> 8) & hs.e4);
            outputStream.write(length & hs.e4);
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

    public static void O(int i3) {
        Thread thread = new Thread(new ii.i2(i3, 2));
        thread.setPriority(1);
        thread.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int Q(int i3, int i10, int i11, int i12, int i13) {
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
                int min = (int) (((int) (i11 / Math.min(i3 / i12, i10 / i13))) * f11);
                int C = (int) (((int) com.google.android.recaptcha.internal.a.C(f10, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i13 * i12)));
                return i11 >= C ? min : min > i14 ? i14 : Math.max(min, C);
            }
            i14 = 2600000;
        }
        f10 = 1.0f;
        int min2 = (int) (((int) (i11 / Math.min(i3 / i12, i10 / i13))) * f11);
        int C2 = (int) (((int) com.google.android.recaptcha.internal.a.C(f10, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i13 * i12)));
        if (i11 >= C2) {
        }
    }

    public static /* synthetic */ void a(MediaController mediaController, boolean z10) {
        mediaController.stopRecord();
        TLRPC.TL_document tL_document = mediaController.g1;
        File N = mediaController.N(mediaController.j1, mediaController.k1, tL_document);
        if (tL_document == null || N == null) {
            return;
        }
        g0.h3(new ci.u8(mediaController, N, z10, tL_document, 13));
    }

    public static void b(final MediaController mediaController, final int i3, final int i10, long j10, long j11, ej ejVar, zi ziVar, zi ziVar2, TL_stories.StoryItem storyItem, zv zvVar) {
        String absolutePath;
        final int i11 = 0;
        if (mediaController.f1 != null) {
            g0.h3(new Runnable(mediaController) { // from class: org.telegram.messenger.vd
                public final /* synthetic */ MediaController b;

                {
                    this.b = mediaController;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i12 = i11;
                    int i13 = i10;
                    int i14 = i3;
                    MediaController mediaController2 = this.b;
                    switch (i12) {
                        case 0:
                            mediaController2.M1 = null;
                            hs.f(i14).k(hs.m2, Integer.valueOf(i13));
                            break;
                        case 1:
                            mediaController2.M1 = null;
                            hs.f(i14).k(hs.m2, Integer.valueOf(i13));
                            break;
                        case 2:
                            mediaController2.M1 = null;
                            hs.f(i14).k(hs.m2, Integer.valueOf(i13));
                            break;
                        default:
                            mediaController2.M1 = null;
                            hs.f(i14).k(hs.l2, Integer.valueOf(i13), Boolean.TRUE);
                            break;
                    }
                }
            });
            return;
        }
        final int i12 = 1;
        j0(true);
        mediaController.C1 = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        mediaController.g1 = tL_document;
        mediaController.h1 = i10;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = TLObject.FLAG_31;
        tL_document.id = az.p();
        mediaController.g1.user_id = h10.i(i3).e();
        TLRPC.TL_document tL_document2 = mediaController.g1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        az.y();
        mediaController.k1 = new ke(w7.z(1), System.currentTimeMillis() + "_" + w7.r(null, mediaController.g1));
        w7.z(4).mkdirs();
        if (r2.a) {
            a8.b("start recording internal " + mediaController.k1.getPath() + " " + mediaController.k1.exists());
        }
        File file = mediaController.k1;
        Set set = z0.a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            z0.a.add(absolutePath);
        }
        try {
            if (mediaController.startRecord(mediaController.k1.getPath(), mediaController.B1) == 0) {
                g0.h3(new Runnable(mediaController) { // from class: org.telegram.messenger.vd
                    public final /* synthetic */ MediaController b;

                    {
                        this.b = mediaController;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i122 = i12;
                        int i13 = i10;
                        int i14 = i3;
                        MediaController mediaController2 = this.b;
                        switch (i122) {
                            case 0:
                                mediaController2.M1 = null;
                                hs.f(i14).k(hs.m2, Integer.valueOf(i13));
                                break;
                            case 1:
                                mediaController2.M1 = null;
                                hs.f(i14).k(hs.m2, Integer.valueOf(i13));
                                break;
                            case 2:
                                mediaController2.M1 = null;
                                hs.f(i14).k(hs.m2, Integer.valueOf(i13));
                                break;
                            default:
                                mediaController2.M1 = null;
                                hs.f(i14).k(hs.l2, Integer.valueOf(i13), Boolean.TRUE);
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
            mediaController.e1 = false;
            mediaController.f1 = new AudioRecord(0, mediaController.B1, 16, 2, mediaController.A1);
            System.currentTimeMillis();
            long j12 = 0;
            mediaController.l1 = 0L;
            mediaController.m1 = 0;
            mediaController.w1 = 0L;
            mediaController.n1 = j10;
            mediaController.p1 = j11;
            mediaController.q1 = ejVar;
            if (ziVar != null) {
                j12 = zi.c2(mediaController.i1, ziVar.k, false, false);
            }
            mediaController.o1 = j12;
            mediaController.i1 = i3;
            mediaController.r1 = ziVar2;
            mediaController.s1 = ziVar;
            mediaController.t1 = storyItem;
            mediaController.u1 = zvVar;
            mediaController.z1.rewind();
            mediaController.f1.startRecording();
            mediaController.N1.c(mediaController.P1);
            final int i13 = 3;
            g0.h3(new Runnable(mediaController) { // from class: org.telegram.messenger.vd
                public final /* synthetic */ MediaController b;

                {
                    this.b = mediaController;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i13;
                    int i132 = i10;
                    int i14 = i3;
                    MediaController mediaController2 = this.b;
                    switch (i122) {
                        case 0:
                            mediaController2.M1 = null;
                            hs.f(i14).k(hs.m2, Integer.valueOf(i132));
                            break;
                        case 1:
                            mediaController2.M1 = null;
                            hs.f(i14).k(hs.m2, Integer.valueOf(i132));
                            break;
                        case 2:
                            mediaController2.M1 = null;
                            hs.f(i14).k(hs.m2, Integer.valueOf(i132));
                            break;
                        default:
                            mediaController2.M1 = null;
                            hs.f(i14).k(hs.l2, Integer.valueOf(i132), Boolean.TRUE);
                            break;
                    }
                }
            });
        } catch (Exception e10) {
            a8.g(e10, true);
            mediaController.g1 = null;
            mediaController.stopRecord();
            z0.b(mediaController.k1);
            mediaController.k1.delete();
            mediaController.k1 = null;
            File file2 = mediaController.j1;
            if (file2 != null) {
                file2.delete();
                mediaController.j1 = null;
            }
            try {
                mediaController.f1.release();
                mediaController.f1 = null;
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            j0(false);
            final int i14 = 2;
            g0.h3(new Runnable(mediaController) { // from class: org.telegram.messenger.vd
                public final /* synthetic */ MediaController b;

                {
                    this.b = mediaController;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i14;
                    int i132 = i10;
                    int i142 = i3;
                    MediaController mediaController2 = this.b;
                    switch (i122) {
                        case 0:
                            mediaController2.M1 = null;
                            hs.f(i142).k(hs.m2, Integer.valueOf(i132));
                            break;
                        case 1:
                            mediaController2.M1 = null;
                            hs.f(i142).k(hs.m2, Integer.valueOf(i132));
                            break;
                        case 2:
                            mediaController2.M1 = null;
                            hs.f(i142).k(hs.m2, Integer.valueOf(i132));
                            break;
                        default:
                            mediaController2.M1 = null;
                            hs.f(i142).k(hs.l2, Integer.valueOf(i132), Boolean.TRUE);
                            break;
                    }
                }
            });
        }
    }

    public static /* synthetic */ void c(final MediaController mediaController, File file, File file2, final TLRPC.TL_document tL_document, final int i3, final boolean z10, final int i10, final boolean z11) {
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
        g0.h3(new Runnable() { // from class: org.telegram.messenger.be
            @Override // java.lang.Runnable
            public final void run() {
                boolean z12;
                char c10;
                int i11;
                String[] strArr = MediaController.W1;
                boolean z13 = r2.a;
                MediaController mediaController2 = MediaController.this;
                File file3 = N;
                if (z13) {
                    StringBuilder sb2 = new StringBuilder("stop recording internal ");
                    sb2.append(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.m1);
                    a8.b(sb2.toString());
                }
                if (!file3.exists()) {
                    a8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.l1 + " writedFrames" + mediaController2.m1), true);
                }
                li.b0(mediaController2.i1).B1(mediaController2.n1, mediaController2.o1, null);
                int currentTime = ConnectionsManager.getInstance(mediaController2.i1).getCurrentTime();
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
                long j10 = mediaController2.l1;
                tL_documentAttributeAudio.duration = j10 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                if (j10 > 700) {
                    int i12 = i3;
                    if (i12 == 1) {
                        c10 = 1;
                        i11 = 2;
                        wy f10 = wy.f(tL_document2, null, file3.getAbsolutePath(), mediaController2.n1, mediaController2.r1, mediaController2.s1, null, null, null, null, z10, i10, 0, z11 ? Integer.MAX_VALUE : 0, null, null, false);
                        f10.R = mediaController2.p1;
                        f10.T = mediaController2.q1;
                        f10.H = mediaController2.t1;
                        f10.K = mediaController2.u1;
                        f10.Q = 0L;
                        yy.C(mediaController2.i1).r0(f10);
                    } else {
                        c10 = 1;
                        i11 = 2;
                    }
                    hs f11 = hs.f(mediaController2.i1);
                    Integer valueOf = Integer.valueOf(mediaController2.h1);
                    if (i12 != i11) {
                        tL_document2 = null;
                    }
                    String absolutePath = i12 == i11 ? file3.getAbsolutePath() : null;
                    Object[] objArr = new Object[3];
                    z12 = false;
                    objArr[0] = valueOf;
                    objArr[c10] = tL_document2;
                    objArr[i11] = absolutePath;
                    f11.k(hs.s2, objArr);
                } else {
                    z12 = false;
                    hs.f(mediaController2.i1).k(hs.t2, Integer.valueOf(mediaController2.h1), Boolean.FALSE, Integer.valueOf((int) j10));
                    z0.b(file3);
                    file3.delete();
                }
                mediaController2.Y(z12);
            }
        });
    }

    public static native boolean cropOpusFile(String str, String str2, long j10, long j11);

    public static void d(MediaController mediaController) {
        mediaController.j1 = mediaController.k1;
        je jeVar = new je(1, w7.z(1), System.currentTimeMillis() + "_" + w7.r(null, mediaController.g1));
        mediaController.k1 = jeVar;
        if (mediaController.startRecord(jeVar.getPath(), mediaController.B1) != 0) {
            g0.h3(new od(mediaController, 8));
            return;
        }
        g0.h3(new od(mediaController, 7));
        if (r2.a) {
            a8.b("cant resume audio encoder");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d0(String str, Context context, int i3, String str2, String str3, u10 u10Var) {
        File file;
        org.telegram.ui.ActionBar.s1 s1Var;
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
                    if (i3 != 0) {
                        try {
                            org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(2, context, null);
                            s1Var2.n(bd.M0(2131748787, null));
                            s1Var2.setCanceledOnTouchOutside(false);
                            s1Var2.setCancelable(true);
                            s1Var2.setOnCancelListener(new wd(zArr, i10));
                            g0.i3(new xd(zArr2, s1Var2, i10), 250L);
                            s1Var = s1Var2;
                        } catch (Exception e10) {
                            a8.g(e10, true);
                        }
                        new Thread(new yd(i3, file, str2, s1Var, zArr, str3, u10Var, zArr2)).start();
                        return;
                    }
                    s1Var = null;
                    new Thread(new yd(i3, file, str2, s1Var, zArr, str3, u10Var, zArr2)).start();
                    return;
                }
                return;
            }
        }
        file = null;
        if (file != null) {
        }
    }

    public static void e0(String str, String str2, Context context, u10 u10Var) {
        org.telegram.ui.ActionBar.s1 s1Var;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            return;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists() || !file2.exists()) {
            d0(str, context, 0, null, null, u10Var);
            return;
        }
        if (g0.I1(Uri.fromFile(file), 0) || g0.I1(Uri.fromFile(file2), 0)) {
            return;
        }
        int i3 = 1;
        boolean[] zArr = {false};
        boolean[] zArr2 = new boolean[1];
        try {
            org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(2, context, null);
            s1Var2.n(bd.M0(2131748787, null));
            s1Var2.setCanceledOnTouchOutside(false);
            s1Var2.setCancelable(true);
            s1Var2.setOnCancelListener(new wd(zArr, i3));
            g0.i3(new xd(zArr2, s1Var2, i3), 250L);
            s1Var = s1Var2;
        } catch (Exception e10) {
            a8.g(e10, true);
            s1Var = null;
        }
        new Thread(new pj(file, file2, zArr, u10Var, s1Var, zArr2)).start();
    }

    public static void f(MediaController mediaController, zi ziVar, int[] iArr, boolean z10, boolean z11, int i3) {
        zi ziVar2;
        le leVar = mediaController.d1;
        if (mediaController.F0 == null) {
            return;
        }
        if (i3 == 4 || i3 == 1) {
            try {
                mediaController.K0.getWindow().clearFlags(128);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        } else {
            try {
                mediaController.K0.getWindow().addFlags(128);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        if (i3 == 3) {
            mediaController.G0 = true;
            zi ziVar3 = mediaController.v0;
            if (ziVar3 != null && (zi.M4(ziVar3.k) || mediaController.v0.i4())) {
                g0.r(leVar);
                w7.G(ziVar.I1).a0(mediaController.v0.F0(), true, false);
            }
            mediaController.Q0 = true;
            return;
        }
        if (i3 == 2) {
            if (!z11 || (ziVar2 = mediaController.v0) == null) {
                return;
            }
            if (zi.M4(ziVar2.k) || mediaController.v0.i4()) {
                if (mediaController.G0) {
                    leVar.run();
                    return;
                } else {
                    g0.i3(leVar, 1000L);
                    return;
                }
            }
            return;
        }
        if (mediaController.F0.d0() && i3 == 4) {
            zi ziVar4 = mediaController.v0;
            if (ziVar4 == null || !zi.M4(ziVar4.k) || z10 || (iArr != null && iArr[0] >= 4)) {
                if (mediaController.a0()) {
                    return;
                }
                mediaController.q(true, mediaController.F(), true, false);
            } else {
                mediaController.F0.p0(0L);
                if (iArr != null) {
                    iArr[0] = iArr[0] + 1;
                }
            }
        }
    }

    public static Uri f0(int i3, File file, String str) {
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String D = w7.D(file);
            String mimeTypeFromExtension = D != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(D) : null;
            if ((i3 == 0 || i3 == 1) && mimeTypeFromExtension != null) {
                if (mimeTypeFromExtension.startsWith("image")) {
                    i3 = 0;
                }
                if (mimeTypeFromExtension.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    i3 = 1;
                }
            }
            if (i3 == 0) {
                if (str == null) {
                    str = g0.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", mimeTypeFromExtension);
            } else if (i3 == 1) {
                if (str == null) {
                    str = g0.p0(1, D);
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MOVIES, "Telegram") + File.separator);
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else if (i3 == 2) {
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

    public static void g0(Context context, c cVar, ArrayList arrayList, kr krVar) {
        if (arrayList.isEmpty()) {
            return;
        }
        ve veVar = new ve();
        veVar.d = new HashMap();
        veVar.a = cVar;
        veVar.c = arrayList;
        veVar.s = krVar;
        veVar.w = ((zi) arrayList.get(0)).J3();
        int i3 = cVar.a;
        hs.f(i3).b(veVar, hs.Y1);
        hs.f(i3).b(veVar, hs.X1);
        hs.f(i3).b(veVar, hs.Z1);
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(2, context, PhotoViewer.v1().U1() ? new ei.b() : null);
        veVar.b = s1Var;
        s1Var.n(bd.M0(2131748787, null));
        s1Var.setCancelable(true);
        s1Var.I = true;
        s1Var.setOnCancelListener(new wd(veVar, 3));
        g0.i3(new ue(veVar, 1), 250L);
        new Thread(new ue(veVar, 2)).start();
    }

    public static native byte[] getWaveform(String str);

    public static native int isOpusFile(String str);

    public static void j0(boolean z10) {
        AudioManager audioManager = (AudioManager) t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (az.u0 && !b8.nf.d("android.permission.BLUETOOTH_CONNECT")) {
            az.u0 = false;
            az.y();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && az.u0) && z10) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
                if (defaultAdapter.getProfileConnectionState(1) != 2) {
                }
                if (!z10 && !audioManager.isBluetoothScoOn()) {
                    audioManager.startBluetoothSco();
                    return;
                } else if (z10 && audioManager.isBluetoothScoOn()) {
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
        if (z10) {
            return;
        }
        if (!z10) {
        }
        if (z10) {
        }
    }

    public static native boolean joinOpusFiles(String str, String str2, String str3);

    public static boolean s0(int i3) {
        xi.a aVar = xi.e.b;
        aVar.a();
        if (!aVar.c) {
            return !((h0) hp.s1(i3).x7.f0.b).c;
        }
        aVar.a();
        return aVar.d;
    }

    private native int startRecord(String str, int i3);

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
    public static String t(long j10, Uri uri, String str) {
        InputStream inputStream;
        File file;
        FileOutputStream fileOutputStream;
        Throwable th2;
        File file2;
        int i3;
        String absolutePath;
        int i10 = 0;
        try {
            String q10 = w7.q(A(uri));
            if (q10 == null) {
                int p10 = az.p();
                az.y();
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
                                    if (j10 > 0) {
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
                                i3 = 0;
                                while (true) {
                                    try {
                                        int read = inputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                        i3 += read;
                                        if (j10 > 0) {
                                            long j11 = i3;
                                            if (j11 > j10) {
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
                                                if (j10 > 0) {
                                                }
                                            }
                                        }
                                    } catch (Exception e13) {
                                        e = e13;
                                        i10 = i3;
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
                                        if (j10 > 0) {
                                        }
                                        return null;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        i10 = i3;
                                        if (inputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        if (j10 <= 0) {
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
                            if (j10 <= 0) {
                                throw th2;
                            }
                            if (i10 <= j10) {
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
                        if (j10 <= 0) {
                        }
                    }
                } else if (j10 > 0 && 0 > j10) {
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
        if (j10 > 0 && i3 > j10) {
            file.delete();
        }
        return absolutePath;
        try {
            fileOutputStream.close();
        } catch (Exception e22) {
            a8.g(e22, true);
        }
        if (j10 > 0) {
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
            int i3 = 0;
            do {
                File g13 = g0.g1();
                if (i3 == 0) {
                    file = new File(g13, str);
                } else {
                    int lastIndexOf = str.lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        file = new File(g13, str.substring(0, lastIndexOf) + " (" + i3 + ")" + str.substring(lastIndexOf));
                    } else {
                        file = new File(g13, str + " (" + i3 + ")");
                    }
                }
                i3++;
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
    public static int v(int i3, int i10, int i11, boolean z10) {
        MediaCodec createEncoderByType;
        String str = i3 + "" + i10 + "" + i11;
        ConcurrentHashMap concurrentHashMap = Y1;
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        if (z10) {
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
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i3, i10);
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
        MediaFormat createVideoFormat2 = MediaFormat.createVideoFormat("video/avc", i3, i10);
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

    public static int w(MediaExtractor mediaExtractor, boolean z10) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i3 = 0; i3 < trackCount; i3++) {
            String string = mediaExtractor.getTrackFormat(i3).getString("mime");
            if (z10) {
                if (string.startsWith("audio/")) {
                    return i3;
                }
            } else {
                if (string.startsWith("video/")) {
                    return i3;
                }
            }
        }
        return -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int writeFrame(ByteBuffer byteBuffer, int i3);

    public static boolean y() {
        try {
            for (AudioDeviceInfo audioDeviceInfo : us.p0.getDevices(2)) {
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

    public final void A0(org.telegram.ui.wm wmVar, boolean z10, boolean z11) {
        if (this.P) {
            this.P = false;
            return;
        }
        if (z11) {
            if (this.g1 == null || K()) {
                B0(z10 ? 2 : 0, 0, false, false);
            } else {
                D0(false);
            }
        }
        if (!this.Q || this.P) {
            return;
        }
        if ((this.f == null && this.n == null) || this.e == null || this.s != wmVar) {
            return;
        }
        this.s = null;
        this.Q = false;
        this.w = false;
        this.J = false;
        this.r = false;
        this.M = false;
        Utilities.e.c(new od(this, 5));
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.d.release();
    }

    public final void B0(final int i3, final int i10, final boolean z10, final boolean z11) {
        e0.g gVar;
        if (!this.I1) {
            pd pdVar = this.M1;
            p5 p5Var = this.N1;
            if (pdVar != null) {
                p5Var.a(pdVar);
                this.M1 = null;
            }
            p5Var.c(new Runnable() { // from class: org.telegram.messenger.ee
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController mediaController = MediaController.this;
                    int i11 = mediaController.C1;
                    int i12 = i3;
                    boolean z12 = z10;
                    int i13 = i10;
                    boolean z13 = z11;
                    if (i11 == 3) {
                        mediaController.C1 = 0;
                        mediaController.C0(i12, i13, z12, z13);
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
                        mediaController.C1 = i12;
                        mediaController.D1 = z12;
                        mediaController.E1 = i13;
                        mediaController.F1 = z13;
                        audioRecord.stop();
                        MediaController.j0(false);
                    } catch (Exception e10) {
                        a8.g(e10, true);
                        if (mediaController.k1 != null) {
                            if (r2.a) {
                                a8.d("delete voice file");
                            }
                            mediaController.k1.delete();
                        }
                    }
                    if (i12 == 0) {
                        mediaController.C0(0, 0, false, false);
                    }
                    try {
                        mediaController.L0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    g0.h3(new sd(mediaController, i12, 0));
                }
            });
            return;
        }
        vi.f fVar = this.L1;
        if (fVar != null) {
            this.L1 = null;
            if (i3 == 0) {
                x(false);
                return;
            }
            this.C1 = i3;
            this.D1 = z10;
            this.E1 = i10;
            this.F1 = z11;
            s(fVar);
            return;
        }
        if (this.J1) {
            if (this.C1 == 3) {
                this.C1 = i3;
                this.D1 = z10;
                this.E1 = i10;
                this.F1 = z11;
                if (i3 == 0) {
                    e0.g gVar2 = this.G1;
                    if (gVar2 != null) {
                        gVar2.b = false;
                        ((vi.j) gVar2.e).b();
                    }
                    x(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 2 && (gVar = this.G1) != null && gVar.e()) {
            this.y0 = false;
            this.r = false;
            this.P = false;
            return;
        }
        ei.d1 d1Var = this.H1;
        if (d1Var != null) {
            g0.r(d1Var);
            this.H1 = null;
        }
        this.J1 = true;
        this.C1 = i3;
        this.D1 = z10;
        this.E1 = i10;
        this.F1 = z11;
        e0.g gVar3 = this.G1;
        if (gVar3 == null) {
            x(false);
        } else {
            vi.j jVar = (vi.j) gVar3.e;
            if (i3 == 0) {
                gVar3.b = false;
                jVar.b();
                x(false);
            } else {
                gVar3.b = true;
                jVar.getClass();
                vi.j.q();
                int i11 = jVar.e().a;
                if (gVar3.b && (i11 == 3 || i11 == 5)) {
                    gVar3.b = false;
                    jVar.h();
                }
            }
        }
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        final int i12 = this.i1;
        final int i13 = this.h1;
        g0.h3(new Runnable() { // from class: org.telegram.messenger.td
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = MediaController.W1;
                hs.f(i12).k(hs.n2, Integer.valueOf(i13), Integer.valueOf(i3 == 2 ? 1 : 0));
            }
        });
    }

    public final float C(boolean z10) {
        return z10 ? this.r0 : this.q0;
    }

    public final void C0(int i3, int i10, boolean z10, boolean z11) {
        MediaController mediaController;
        File file;
        if (i3 == 0 || (file = this.k1) == null) {
            mediaController = this;
            z0.b(mediaController.k1);
            File file2 = mediaController.k1;
            if (file2 != null) {
                file2.delete();
            }
            Y(false);
        } else {
            TLRPC.TL_document tL_document = this.g1;
            File file3 = this.j1;
            if (r2.a) {
                a8.b("stop recording internal filename " + this.k1.getPath());
            }
            mediaController = this;
            mediaController.O1.c(new gi.y8(mediaController, file3, file, tL_document, i3, z10, i10, z11));
        }
        try {
            AudioRecord audioRecord = mediaController.f1;
            if (audioRecord != null) {
                audioRecord.release();
                mediaController.f1 = null;
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        mediaController.g1 = null;
        mediaController.j1 = null;
        mediaController.k1 = null;
        mediaController.y0 = false;
        mediaController.r = false;
        mediaController.P = false;
    }

    public final long D(zi ziVar) {
        zi ziVar2 = this.v0;
        if ((this.j0 != null || this.F0 != null) && ziVar != null && ziVar2 != null && L(ziVar)) {
            try {
                m51 m51Var = this.j0;
                if (m51Var != null) {
                    return m51Var.S();
                }
                m51 m51Var2 = this.F0;
                if (m51Var2 != null) {
                    return m51Var2.S();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void D0(boolean z10) {
        if (!this.I1) {
            this.N1.c(new qd(this, z10, 0));
            return;
        }
        this.K1 = z10;
        e0.g gVar = this.G1;
        if (gVar != null) {
            if (gVar.e()) {
                Y(true);
                j0(true);
            }
            e0.g gVar2 = this.G1;
            vi.j jVar = (vi.j) gVar2.e;
            jVar.getClass();
            vi.j.q();
            int i3 = jVar.e().a;
            if (i3 == 3) {
                ((vi.j) gVar2.e).n();
                return;
            }
            if (i3 == 5) {
                vi.j jVar2 = (vi.j) gVar2.e;
                jVar2.getClass();
                vi.j.q();
                if (jVar2.G != 5) {
                    return;
                }
                jVar2.h.b("resume requested: trim=" + jVar2.r + ".." + jVar2.s + ", sourceDurationMs=" + jVar2.j());
                jVar2.p();
                jVar2.s(6);
                vi.i iVar = jVar2.z;
                if (iVar == null) {
                    jVar2.g(new IllegalStateException("Output generation is missing"));
                    return;
                }
                long j10 = jVar2.r;
                long j11 = jVar2.s;
                boolean z11 = j11 >= vi.j.r(jVar2.p);
                jVar2.k(1);
                long j12 = ((j11 - j10) * 48000) / 1000;
                jVar2.p = j12;
                jVar2.r = 0L;
                jVar2.s = vi.j.r(j12);
                jVar2.d();
                jVar2.h.b("resume prefix selected: source=" + iVar.b.getName() + ", trim=" + j10 + ".." + j11);
                File file = iVar.b;
                if (z11) {
                    j11 = -1;
                }
                jVar2.u(j10, j11, file);
            }
        }
    }

    public final boolean E0(int i3, ArrayList arrayList) {
        zi ziVar;
        int i10;
        zi ziVar2;
        int i11 = this.V0;
        boolean z10 = ConnectionsManager.getInstance(h10.t0).getConnectionState() == 2;
        this.V0 += i3;
        if (z10) {
            while (this.V0 < arrayList.size() && (i10 = this.V0) >= 0 && ((ziVar2 = (zi) arrayList.get(i10)) == null || !ziVar2.x0)) {
                this.V0 += i3;
            }
        }
        if (this.V0 < arrayList.size() && this.V0 >= 0) {
            return false;
        }
        this.V0 = this.V0 >= arrayList.size() ? 0 : arrayList.size() - 1;
        if (z10) {
            while (true) {
                int i12 = this.V0;
                if (i12 < 0 || i12 >= arrayList.size()) {
                    break;
                }
                int i13 = this.V0;
                if (i3 > 0) {
                    if (i13 > i11) {
                        break;
                    }
                    ziVar = (zi) arrayList.get(this.V0);
                    if (ziVar == null && ziVar.x0) {
                        break;
                    }
                    this.V0 += i3;
                } else {
                    if (i13 < i11) {
                        break;
                    }
                    ziVar = (zi) arrayList.get(this.V0);
                    if (ziVar == null) {
                    }
                    this.V0 += i3;
                }
            }
            if (this.V0 >= arrayList.size() || this.V0 < 0) {
                this.V0 = this.V0 < arrayList.size() ? arrayList.size() - 1 : 0;
            }
        }
        return true;
    }

    public final boolean F() {
        ArrayList arrayList;
        zi ziVar = this.v0;
        return ziVar == null || !(zi.S4(ziVar.k) || this.v0.i4()) || (arrayList = this.f0) == null || arrayList.size() <= 1 || !this.f0.contains(this.v0) || this.f0.indexOf(this.v0) >= this.f0.size() - 1;
    }

    public final void F0() {
        zi ziVar = this.v0;
        if (ziVar != null && H() && this.i0 && (zi.S4(ziVar.k) || ziVar.J3())) {
            S(ziVar);
        }
        this.i0 = false;
    }

    public final void G0(File file, long j10, byte[] bArr) {
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
        tL_documentAttributeAudio.duration = j10 / 1000.0d;
        this.g1.attributes.clear();
        this.g1.attributes.add(tL_documentAttributeAudio);
    }

    public final boolean H() {
        return this.h0 || this.B0;
    }

    public final boolean I(zi ziVar) {
        zi ziVar2;
        boolean z10;
        if (ziVar != null && ziVar.h2) {
            return false;
        }
        if ((this.j0 == null && this.F0 == null) || ziVar == null || (ziVar2 = this.v0) == null) {
            return false;
        }
        long j10 = ziVar2.T;
        if (j10 != 0 && j10 == ziVar.T) {
            z10 = this.B0;
        } else {
            if (!L(ziVar)) {
                return false;
            }
            z10 = this.B0;
        }
        return !z10;
    }

    public final boolean J() {
        return (this.M1 == null && this.H1 == null && this.g1 == null) ? false : true;
    }

    public final boolean K() {
        if (!this.I1) {
            return this.e1;
        }
        e0.g gVar = this.G1;
        return gVar != null && gVar.e();
    }

    public final boolean L(zi ziVar) {
        zi ziVar2 = this.v0;
        if (ziVar2 != null && zi.B0(ziVar2.k) == zi.B0(ziVar.k) && this.v0.f1() == ziVar.f1()) {
            if ((this.v0.T == 0) == (ziVar.T == 0)) {
                return true;
            }
        }
        return false;
    }

    public final File N(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            ie ieVar = new ie(w7.z(1), System.currentTimeMillis() + "_" + w7.r(null, tL_document));
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), ieVar.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.k1) {
                    this.k1 = ieVar;
                }
                file2 = ieVar;
            }
            file.delete();
            if (file == this.j1) {
                this.j1 = null;
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
        zi ziVar;
        int i3;
        long j10;
        long j11;
        long j12;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
        bp bpVar = this.R0;
        if (bpVar != null) {
            bpVar.b();
            return;
        }
        if (this.Y0 || (ziVar = this.v0) == null || ziVar.p1 || m5.C(zi.B0(ziVar.k)) || (i3 = this.a1) == 0) {
            return;
        }
        g2.b0 b0Var = this.D0;
        if (b0Var == null) {
            boolean[] zArr = this.X0;
            boolean z10 = zArr[0];
            int[] iArr = this.c1;
            if (!z10) {
                this.Y0 = true;
                li.b0(c.a(this.v0.I1).a).N0(zi.B0(this.v0.k), 50, iArr[0], 0, 4, this.b1, 1, this.a1, 0, null, null);
                return;
            } else {
                if (this.Z0 == 0 || zArr[1]) {
                    return;
                }
                this.Y0 = true;
                li.b0(c.a(this.v0.I1).a).N0(this.Z0, 50, iArr[0], 0, 4, 0L, 1, this.a1, 0, null, null);
                return;
            }
        }
        if (b0Var.e) {
            return;
        }
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty()) {
            return;
        }
        int i10 = ((zi) arrayList.get(0)).I1;
        if (this.D0.a != 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            g2.b0 b0Var2 = this.D0;
            tL_messages_search.q = (String) b0Var2.h;
            tL_messages_search.limit = 20;
            kg.l0 l0Var = (kg.l0) b0Var2.i;
            tL_messages_search.filter = l0Var == null ? new TLRPC.TL_inputMessagesFilterEmpty() : l0Var.e;
            tL_messages_search.peer = hp.s1(c.a(i10).a).j1(this.D0.a);
            tL_messages_search.offset_id = ((zi) k2.p1.h(1, arrayList)).f1();
            g2.b0 b0Var3 = this.D0;
            long j13 = b0Var3.b;
            if (j13 > 0) {
                tL_messages_search.min_date = (int) (j13 / 1000);
            }
            long j14 = b0Var3.c;
            tL_messages_searchGlobal = tL_messages_search;
            if (j14 > 0) {
                tL_messages_search.min_date = (int) (j14 / 1000);
                tL_messages_searchGlobal = tL_messages_search;
            }
        } else {
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal2.limit = 20;
            g2.b0 b0Var4 = this.D0;
            tL_messages_searchGlobal2.q = (String) b0Var4.h;
            tL_messages_searchGlobal2.filter = ((kg.l0) b0Var4.i).e;
            zi ziVar2 = (zi) k2.p1.h(1, arrayList);
            tL_messages_searchGlobal2.offset_id = ziVar2.f1();
            g2.b0 b0Var5 = this.D0;
            tL_messages_searchGlobal2.offset_rate = b0Var5.f;
            tL_messages_searchGlobal2.flags |= 1;
            tL_messages_searchGlobal2.folder_id = b0Var5.g;
            TLRPC.Peer peer = ziVar2.k.peer_id;
            long j15 = peer.channel_id;
            if (j15 == 0) {
                j15 = peer.chat_id;
                if (j15 == 0) {
                    j10 = peer.user_id;
                    tL_messages_searchGlobal2.offset_peer = hp.s1(i10).j1(j10);
                    g2.b0 b0Var6 = this.D0;
                    j11 = b0Var6.b;
                    if (j11 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j11 / 1000);
                    }
                    j12 = b0Var6.c;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    if (j12 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j12 / 1000);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
            }
            j10 = -j15;
            tL_messages_searchGlobal2.offset_peer = hp.s1(i10).j1(j10);
            g2.b0 b0Var62 = this.D0;
            j11 = b0Var62.b;
            if (j11 > 0) {
            }
            j12 = b0Var62.c;
            tL_messages_searchGlobal = tL_messages_searchGlobal2;
            if (j12 > 0) {
            }
        }
        this.Y0 = true;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_searchGlobal, new zd(this, i3, i10, 0));
    }

    public final boolean R(zi ziVar, boolean z10) {
        if ((this.j0 != null || this.F0 != null) && ziVar != null && this.v0 != null && L(ziVar)) {
            z0();
            try {
                if (this.j0 == null) {
                    m51 m51Var = this.F0;
                    if (m51Var != null) {
                        m51Var.g0();
                    }
                } else if (!z10 || d1.f.u() || zi.S4(this.v0.k) || this.v0.L0() * (1.0f - this.v0.b0) <= 1.0d || !LaunchActivity.I1) {
                    this.j0.g0();
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
                    this.R1.addListener(new ii.v3(this, 6));
                    this.R1.start();
                }
                this.h0 = true;
                hs.f(this.v0.I1).k(hs.g2, Integer.valueOf(this.v0.f1()));
                try {
                    d1.f.b(1);
                    if (!this.U1) {
                        if (tf.b.t().u()) {
                            tf.b.t().z(z());
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
                this.h0 = false;
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
    
        if (r40.V1 != null) goto L43;
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
    /* JADX WARN: Type inference failed for: r5v25, types: [org.telegram.messenger.zi, org.telegram.ui.Components.m51] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S(final zi ziVar) {
        boolean z10;
        boolean z11;
        File file;
        final File N;
        File file2;
        boolean z12;
        File N2;
        boolean z13;
        org.telegram.ui.l4 l4Var;
        boolean M4;
        String str;
        boolean z14;
        PipRoundVideoView pipRoundVideoView;
        m51 m51Var;
        PowerManager.WakeLock wakeLock;
        ?? r5;
        we weVar;
        boolean z15;
        int i3 = hs.g2;
        int i10 = hs.e2;
        if (ziVar == null) {
            return false;
        }
        m();
        if (!(this.j0 == null && this.F0 == null) && L(ziVar)) {
            if (this.h0) {
                b0(ziVar);
            }
            if (az.k(true)) {
                return true;
            }
            w0(this.s);
            return true;
        }
        if (!ziVar.O3() && ziVar.k.media_unread) {
            hp.s1(ziVar.I1).r3(ziVar);
        }
        boolean z16 = !this.C0;
        zi ziVar2 = this.v0;
        if (ziVar2 != null) {
            if ((ziVar2.J3() && zi.S4(ziVar.k)) || ziVar.i4() || zi.M4(ziVar.k)) {
                zi ziVar3 = this.v0;
                if (ziVar3 != null && ziVar3.J3() && !this.S0.isEmpty()) {
                    this.V1 = new af(this.v0);
                }
                z15 = true;
                if (!this.C0) {
                    this.v0.H5();
                    hs.f(this.v0.I1).k(i10, Integer.valueOf(this.v0.f1()), 0);
                }
                z10 = z15;
                z16 = false;
            }
            z15 = false;
            if (!this.C0) {
            }
            z10 = z15;
            z16 = false;
        } else {
            z10 = false;
        }
        q(z16, false, false, false);
        this.o0 = null;
        this.p0 = 0L;
        this.C0 = false;
        this.u0 = 0.0f;
        String str2 = ziVar.k.attachPath;
        if (str2 == null || str2.length() <= 0) {
            z11 = false;
        } else {
            file = new File(ziVar.k.attachPath);
            z11 = file.exists();
        }
        file = null;
        if (file != null) {
            N = file;
        } else {
            w7.G(ziVar.I1);
            N = w7.N(ziVar.k, false, true);
        }
        boolean z17 = az.B0 && !((!ziVar.J3() && !ziVar.i4() && (!zi.M4(ziVar.k) || !ziVar.B())) || zi.S5(ziVar.k) || m5.C(zi.B0(ziVar.k)));
        if (N != file && !(z11 = N.exists()) && !z17) {
            w7.G(ziVar.I1).X(ziVar.F0(), ziVar, 0, zi.S5(ziVar.k) ? 2 : 0);
            this.B0 = true;
            this.h0 = false;
            this.E0 = null;
            this.v0 = ziVar;
            if (h()) {
                try {
                    t0.b.startService(new Intent(t0.b, (Class<?>) MusicPlayerService.class));
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            } else {
                t0.b.stopService(new Intent(t0.b, (Class<?>) MusicPlayerService.class));
            }
            hs.f(this.v0.I1).k(i3, Integer.valueOf(this.v0.f1()));
            return true;
        }
        boolean z18 = z11;
        this.B0 = false;
        if (ziVar.J3()) {
            l(ziVar.I1);
        } else {
            int i11 = ziVar.I1;
            ArrayList arrayList = this.f0;
            if (arrayList != null && arrayList.size() >= 2) {
                zi ziVar4 = (zi) this.f0.get(1);
                String str3 = ziVar4.k.attachPath;
                if (str3 != null && str3.length() > 0) {
                    file2 = new File(ziVar4.k.attachPath);
                }
                file2 = null;
                if (file2 != null) {
                    z12 = z10;
                    N2 = file2;
                } else {
                    w7.G(i11);
                    z12 = z10;
                    N2 = w7.N(ziVar4.k, false, true);
                }
                N2.exists();
                if (N2 == file2 || N2.exists()) {
                    z13 = false;
                } else {
                    z13 = false;
                    w7.G(i11).X(ziVar4.F0(), ziVar4, 0, zi.S5(ziVar4.k) ? 2 : 0);
                }
                l4Var = this.M0;
                if (l4Var != null) {
                    this.N0 = z13;
                    l4Var.setDrawingReady(z13);
                }
                M4 = zi.M4(ziVar.k);
                if (!ziVar.i4() || M4) {
                    File file3 = file;
                    w7.G(ziVar.I1).d0(ziVar.F0(), true);
                    this.G0 = false;
                    if (M4) {
                        str = "tg://";
                    } else {
                        str = "tg://";
                        if (ziVar.k.peer_id.channel_id != 0 || ziVar.b0 > 0.1f) {
                            z14 = false;
                            int[] iArr = (M4 || ziVar.L0() > 30.0d) ? null : new int[]{1};
                            if (!z12) {
                                r();
                            }
                            m51 m51Var2 = new m51();
                            this.F0 = m51Var2;
                            m51Var2.s0(false);
                            int i12 = this.n0 + 1;
                            this.n0 = i12;
                            String str4 = str;
                            this.F0.K = new g2.x(this, i12, ziVar, iArr, z14);
                            this.Q0 = false;
                            if (this.I0 == null) {
                                hp s12 = hp.s1(ziVar.I1);
                                if ((ziVar.p1 ? s12.z0 : s12.y0).contains(Long.valueOf(ziVar.A0()))) {
                                    TextureView textureView = this.H0;
                                    if (textureView != null) {
                                        this.F0.A0(textureView);
                                    }
                                    if (z18) {
                                        try {
                                            int F = w7.G(ziVar.I1).F(ziVar);
                                            TLRPC.Document F0 = ziVar.F0();
                                            StringBuilder sb2 = new StringBuilder("?account=");
                                            sb2.append(ziVar.I1);
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
                                            this.F0.j0(Uri.parse(str4 + ziVar.S0() + sb2.toString()), "other");
                                        } catch (Exception e10) {
                                            a8.f(e10);
                                        }
                                    } else {
                                        if (!ziVar.x0 && N != file3) {
                                            final int i13 = 0;
                                            g0.h3(new Runnable() { // from class: org.telegram.messenger.de
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i14 = i13;
                                                    File file4 = N;
                                                    zi ziVar5 = ziVar;
                                                    switch (i14) {
                                                        case 0:
                                                            String[] strArr = MediaController.W1;
                                                            hs.f(ziVar5.I1).k(hs.Y1, w7.r(null, ziVar5.F0()), file4);
                                                            break;
                                                        default:
                                                            String[] strArr2 = MediaController.W1;
                                                            hs.f(ziVar5.I1).k(hs.Y1, w7.r(null, ziVar5.F0()), file4);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        this.F0.j0(Uri.fromFile(N), "other");
                                    }
                                    if (ziVar.i4()) {
                                        this.F0.x0(3);
                                    } else {
                                        this.F0.x0(this.M ? 0 : 3);
                                        if (Math.abs(this.q0 - 1.0f) > 0.001f) {
                                            this.F0.v0(Math.round(this.q0 * 10.0f) / 10.0f);
                                        }
                                        float f10 = ziVar.c0;
                                        if (f10 >= 0.0f) {
                                            this.u0 = f10;
                                            ziVar.b0 = f10;
                                            ziVar.c0 = -1.0f;
                                        }
                                    }
                                }
                            }
                            if (this.I0 == null) {
                                try {
                                    PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                                    this.I0 = pipRoundVideoView2;
                                    pipRoundVideoView2.d(this.K0, new od(this, 9));
                                } catch (Exception unused) {
                                    this.I0 = null;
                                }
                            }
                            pipRoundVideoView = this.I0;
                            if (pipRoundVideoView != null) {
                                this.F0.A0(pipRoundVideoView.c);
                            }
                            if (z18) {
                            }
                            if (ziVar.i4()) {
                            }
                        }
                    }
                    z14 = true;
                    if (M4) {
                    }
                    if (!z12) {
                    }
                    m51 m51Var22 = new m51();
                    this.F0 = m51Var22;
                    m51Var22.s0(false);
                    int i122 = this.n0 + 1;
                    this.n0 = i122;
                    String str42 = str;
                    this.F0.K = new g2.x(this, i122, ziVar, iArr, z14);
                    this.Q0 = false;
                    if (this.I0 == null) {
                    }
                    if (this.I0 == null) {
                    }
                    pipRoundVideoView = this.I0;
                    if (pipRoundVideoView != null) {
                    }
                    if (z18) {
                    }
                    if (ziVar.i4()) {
                    }
                } else {
                    PipRoundVideoView pipRoundVideoView3 = this.I0;
                    if (pipRoundVideoView3 != null) {
                        pipRoundVideoView3.a(true);
                        this.I0 = null;
                    }
                    try {
                        m51 m51Var3 = new m51();
                        this.j0 = m51Var3;
                        int i14 = this.n0 + 1;
                        this.n0 = i14;
                        m51Var3.K = new fe(this, i14, ziVar, 0);
                        m51Var3.L = new nb.a(17);
                        if (z18) {
                            if (!ziVar.x0 && N != file) {
                                final int i15 = 1;
                                g0.h3(new Runnable() { // from class: org.telegram.messenger.de
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i142 = i15;
                                        File file4 = N;
                                        zi ziVar5 = ziVar;
                                        switch (i142) {
                                            case 0:
                                                String[] strArr = MediaController.W1;
                                                hs.f(ziVar5.I1).k(hs.Y1, w7.r(null, ziVar5.F0()), file4);
                                                break;
                                            default:
                                                String[] strArr2 = MediaController.W1;
                                                hs.f(ziVar5.I1).k(hs.Y1, w7.r(null, ziVar5.F0()), file4);
                                                break;
                                        }
                                    }
                                });
                            }
                            this.j0.j0(Uri.fromFile(N), "other");
                            this.m0 = false;
                        } else {
                            int F2 = w7.G(ziVar.I1).F(ziVar);
                            TLRPC.Document F02 = ziVar.F0();
                            StringBuilder sb3 = new StringBuilder("?account=");
                            sb3.append(ziVar.I1);
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
                            this.j0.j0(Uri.parse("tg://" + ziVar.S0() + sb3.toString()), "other");
                            this.m0 = true;
                        }
                        if (zi.S4(ziVar.k)) {
                            String S0 = ziVar.S0();
                            if (S0 != null && ziVar.L0() >= 300.0d) {
                                float f11 = t0.b.getSharedPreferences("media_saved_pos", 0).getFloat(S0, -1.0f);
                                if (f11 > 0.0f && f11 < 0.99f) {
                                    this.u0 = f11;
                                    ziVar.b0 = f11;
                                }
                                this.o0 = S0;
                            }
                            if (Math.abs(this.q0 - 1.0f) > 0.001f) {
                                this.j0.v0(Math.round(this.q0 * 10.0f) / 10.0f);
                            }
                            this.E0 = null;
                            if (!z12) {
                                r();
                            }
                        } else {
                            try {
                                this.E0 = of.a.a(N);
                            } catch (Exception e11) {
                                a8.g(e11, true);
                            }
                            String S02 = ziVar.S0();
                            if (!TextUtils.isEmpty(S02) && ziVar.L0() >= 600.0d) {
                                float f12 = t0.b.getSharedPreferences("media_saved_pos", 0).getFloat(S02, -1.0f);
                                if (f12 > 0.0f && f12 < 0.999f) {
                                    this.u0 = f12;
                                    ziVar.b0 = f12;
                                }
                                this.o0 = S02;
                                if (Math.abs(this.r0 - 1.0f) > 0.001f) {
                                    this.j0.v0(Math.round(this.r0 * 10.0f) / 10.0f);
                                }
                            }
                        }
                        float f13 = ziVar.c0;
                        if (f13 >= 0.0f) {
                            this.u0 = f13;
                            ziVar.b0 = f13;
                            ziVar.c0 = -1.0f;
                        }
                        if (!ziVar.J3() || ziVar.F0() == null || m5.C(zi.B0(ziVar.k))) {
                            we weVar2 = this.x0;
                            if (weVar2 != null) {
                                weVar2.b();
                                this.x0 = null;
                            }
                        } else {
                            we weVar3 = this.x0;
                            if (weVar3 == null || weVar3.a != ziVar.I1) {
                                if (weVar3 != null) {
                                    weVar3.b();
                                }
                                this.x0 = new we(ziVar.I1);
                            }
                            TLRPC.Document F03 = ziVar.F0();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = F03.id;
                            tL_inputDocument.access_hash = F03.access_hash;
                            byte[] bArr3 = F03.file_reference;
                            tL_inputDocument.file_reference = bArr3;
                            if (bArr3 == null) {
                                tL_inputDocument.file_reference = new byte[0];
                            }
                            we weVar4 = this.x0;
                            g0.r(weVar4.e);
                            if (tL_inputDocument.id == 0) {
                                tL_inputDocument = null;
                            }
                            weVar4.b = tL_inputDocument;
                            weVar4.c = -9223372036854775807L;
                            weVar4.d.clear();
                        }
                        k2.i0 i0Var = this.j0.d;
                        if (i0Var != null && (weVar = this.x0) != null) {
                            i0Var.m.a(new o4.c0(weVar, i0Var));
                        }
                        this.j0.x0(this.M ? 0 : 3);
                        this.j0.h0();
                        if (ziVar.Q4()) {
                            this.Q1 = 1.0f;
                            n0();
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
                    } catch (Exception e12) {
                        a8.f(e12);
                        hs f14 = hs.f(ziVar.I1);
                        zi ziVar5 = this.v0;
                        f14.k(i3, Integer.valueOf(ziVar5 != null ? ziVar5.f1() : 0));
                        if (this.j0 == null) {
                            return false;
                        }
                        we weVar5 = this.x0;
                        if (weVar5 != null) {
                            weVar5.b();
                            r5 = 0;
                            this.x0 = null;
                        } else {
                            r5 = 0;
                        }
                        this.j0.m0();
                        this.j0 = r5;
                        org.telegram.ui.ActionBar.k6.N1(this.v0);
                        this.h0 = false;
                        this.v0 = r5;
                        this.B0 = false;
                        return false;
                    }
                }
                j(ziVar);
                n0();
                this.h0 = false;
                this.v0 = ziVar;
                if (!az.k(true)) {
                    w0(this.s);
                }
                if (!t0.x && (wakeLock = this.d) != null && !wakeLock.isHeld() && !this.v0.Q4()) {
                    this.v0.i4();
                }
                v0(this.v0);
                hs.f(ziVar.I1).k(hs.h2, ziVar, ziVar2);
                m51Var = this.F0;
                if (m51Var == null) {
                    try {
                        if (this.v0.b0 != 0.0f) {
                            long U = m51Var.U();
                            if (U == -9223372036854775807L) {
                                U = ((long) this.v0.L0()) * 1000;
                            }
                            zi ziVar6 = this.v0;
                            int i16 = (int) (U * ziVar6.b0);
                            int i17 = ziVar6.d0;
                            if (i17 != 0) {
                                ziVar6.d0 = 0;
                                i16 = i17;
                            }
                            this.F0.p0(i16);
                        }
                    } catch (Exception e13) {
                        zi ziVar7 = this.v0;
                        ziVar7.b0 = 0.0f;
                        ziVar7.g0 = 0;
                        hs.f(ziVar.I1).k(i10, Integer.valueOf(this.v0.f1()), 0);
                        a8.f(e13);
                    }
                    this.F0.h0();
                } else {
                    m51 m51Var4 = this.j0;
                    if (m51Var4 != null) {
                        try {
                            if (this.v0.b0 != 0.0f) {
                                long U2 = m51Var4.U();
                                if (U2 == -9223372036854775807L) {
                                    U2 = ((long) this.v0.L0()) * 1000;
                                }
                                long j10 = (int) (U2 * this.v0.b0);
                                this.j0.p0(j10);
                                if (!this.U1) {
                                    d1.f.v(j10);
                                }
                            }
                        } catch (Exception e14) {
                            this.v0.H5();
                            hs.f(ziVar.I1).k(i10, Integer.valueOf(this.v0.f1()), 0);
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
                if (!this.U1) {
                    if (tf.b.t().u()) {
                        tf.b.t().z(z());
                    }
                    d1.f.x(true);
                }
                return true;
            }
        }
        z12 = z10;
        z13 = false;
        l4Var = this.M0;
        if (l4Var != null) {
        }
        M4 = zi.M4(ziVar.k);
        if (ziVar.i4()) {
        }
        File file32 = file;
        w7.G(ziVar.I1).d0(ziVar.F0(), true);
        this.G0 = false;
        if (M4) {
        }
        z14 = true;
        if (M4) {
        }
        if (!z12) {
        }
        m51 m51Var222 = new m51();
        this.F0 = m51Var222;
        m51Var222.s0(false);
        int i1222 = this.n0 + 1;
        this.n0 = i1222;
        String str422 = str;
        this.F0.K = new g2.x(this, i1222, ziVar, iArr, z14);
        this.Q0 = false;
        if (this.I0 == null) {
        }
        if (this.I0 == null) {
        }
        pipRoundVideoView = this.I0;
        if (pipRoundVideoView != null) {
        }
        if (z18) {
        }
        if (ziVar.i4()) {
        }
        j(ziVar);
        n0();
        this.h0 = false;
        this.v0 = ziVar;
        if (!az.k(true)) {
        }
        if (!t0.x) {
            this.v0.i4();
        }
        v0(this.v0);
        hs.f(ziVar.I1).k(hs.h2, ziVar, ziVar2);
        m51Var = this.F0;
        if (m51Var == null) {
        }
        if (h()) {
        }
        d1.f.b(1);
        if (!this.U1) {
        }
        return true;
    }

    public final void T(int i3) {
        int i10 = this.V0;
        if (i10 >= 0) {
            ArrayList arrayList = this.S0;
            if (i10 >= arrayList.size()) {
                return;
            }
            this.V0 = i3;
            this.C0 = true;
            zi ziVar = (zi) arrayList.get(i3);
            if (this.v0 != null && !L(ziVar)) {
                this.v0.H5();
            }
            S(ziVar);
        }
    }

    public final void U(boolean z10) {
        int i3;
        ArrayList arrayList = az.N0 ? this.U0 : this.S0;
        if (z10 && (((i3 = az.S0) == 2 || (i3 == 1 && arrayList.size() == 1)) && !this.W0)) {
            q(false, false, false, false);
            int i10 = this.V0;
            if (i10 < 0 || i10 >= arrayList.size()) {
                return;
            }
            zi ziVar = (zi) arrayList.get(this.V0);
            ziVar.b0 = 0.0f;
            ziVar.g0 = 0;
            S(ziVar);
            return;
        }
        if (!E0(this.R0 != null ? !az.O0 : az.O0 ? 1 : -1, arrayList) || !z10 || az.S0 != 0 || this.W0) {
            int i11 = this.V0;
            if (i11 < 0 || i11 >= arrayList.size()) {
                return;
            }
            zi ziVar2 = this.v0;
            if (ziVar2 != null) {
                ziVar2.H5();
            }
            this.C0 = true;
            S((zi) arrayList.get(this.V0));
            return;
        }
        m51 m51Var = this.j0;
        if (m51Var == null && this.F0 == null) {
            return;
        }
        if (m51Var != null) {
            we weVar = this.x0;
            if (weVar != null) {
                weVar.b();
                this.x0 = null;
            }
            try {
                this.j0.m0();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            this.j0 = null;
            org.telegram.ui.ActionBar.k6.N1(this.v0);
        } else {
            this.M0 = null;
            this.O0 = null;
            this.Q0 = false;
            this.H0 = null;
            this.F0.m0();
            this.F0 = null;
            try {
                this.K0.getWindow().clearFlags(128);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
            g0.r(this.d1);
            w7.G(this.v0.I1).a0(this.v0.F0(), true, false);
        }
        z0();
        this.h0 = true;
        zi ziVar3 = this.v0;
        ziVar3.b0 = 0.0f;
        ziVar3.g0 = 0;
        hs.f(ziVar3.I1).k(hs.e2, Integer.valueOf(this.v0.f1()), 0);
        hs.f(this.v0.I1).k(hs.g2, Integer.valueOf(this.v0.f1()));
    }

    public final void V() {
        int i3;
        ArrayList arrayList = az.N0 ? this.U0 : this.S0;
        if (arrayList.isEmpty() || (i3 = this.V0) < 0 || i3 >= arrayList.size()) {
            return;
        }
        zi ziVar = (zi) arrayList.get(this.V0);
        if (ziVar.g0 > 10) {
            i0(ziVar, 0.0f);
            return;
        }
        E0(this.R0 != null ? !az.O0 : az.O0 ? -1 : 1, arrayList);
        if (this.V0 >= arrayList.size()) {
            return;
        }
        this.C0 = true;
        S((zi) arrayList.get(this.V0));
    }

    public final void W(boolean z10) {
        if (this.g1 != null) {
            D0(false);
            return;
        }
        if (!z10) {
            B0(2, 0, false, false);
            return;
        }
        int currentAccount = this.s.getCurrentAccount();
        long a10 = this.s.a();
        org.telegram.ui.wm wmVar = this.s;
        zi ziVar = wmVar.m4;
        int classGuid = wmVar.getClassGuid();
        org.telegram.ui.wm wmVar2 = this.s;
        zv W8 = wmVar2 != null ? wmVar2.W8() : null;
        org.telegram.ui.wm wmVar3 = this.s;
        long h92 = wmVar3 != null ? wmVar3.h9() : 0L;
        org.telegram.ui.wm wmVar4 = this.s;
        x0(currentAccount, a10, null, ziVar, null, classGuid, false, W8, h92, wmVar4 != null ? wmVar4.x5 : null);
    }

    public final boolean X() {
        vi.f fVar = this.L1;
        if (fVar != null) {
            File file = (File) fVar.b;
            z0.b(file);
            file.delete();
            Z();
            return true;
        }
        e0.g gVar = this.G1;
        if (gVar == null || !gVar.e()) {
            return false;
        }
        this.G1 = null;
        if (!gVar.c()) {
            ((vi.j) gVar.e).o();
            gVar.c = true;
        }
        Z();
        return true;
    }

    public final void Y(boolean z10) {
        nd ndVar = this.a;
        if (!z10) {
            if (this.W) {
                us.p0.abandonAudioFocus(ndVar);
                this.W = false;
                return;
            }
            return;
        }
        if (!this.W && az.F0 && us.p0.requestAudioFocus(ndVar, 3, 2) == 1) {
            this.W = true;
        }
    }

    public final void Z() {
        this.g1 = null;
        this.j1 = null;
        this.k1 = null;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.L1 = null;
        this.C1 = 0;
    }

    public final boolean a0() {
        int i3;
        zi ziVar;
        af afVar = this.V1;
        if (afVar != null) {
            zi ziVar2 = afVar.a;
            this.V1 = null;
            ArrayList arrayList = az.N0 ? this.U0 : this.S0;
            if (arrayList != null && (i3 = this.V0) >= 0 && i3 < arrayList.size() && (ziVar = (zi) arrayList.get(this.V0)) != null && zi.B0(ziVar.k) == zi.B0(ziVar2.k) && ziVar.f1() == ziVar2.f1()) {
                this.C0 = false;
                float f10 = afVar.b;
                ziVar.c0 = f10;
                ziVar.b0 = f10;
                ziVar.d0 = afVar.c;
                ziVar.g0 = afVar.d;
                S(ziVar);
                R(ziVar, false);
                return true;
            }
        }
        return false;
    }

    public final void b0(zi ziVar) {
        if ((this.j0 == null && this.F0 == null) || ziVar == null || this.v0 == null || !L(ziVar)) {
            return;
        }
        try {
            v0(this.v0);
            ValueAnimator valueAnimator = this.R1;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.R1.cancel();
            }
            if (zi.S4(ziVar.k) || ziVar.i4()) {
                this.Q1 = 1.0f;
                n0();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 1.0f);
                this.R1 = ofFloat;
                ofFloat.addUpdateListener(this.S1);
                this.R1.setDuration(300L);
                this.R1.start();
            }
            m51 m51Var = this.j0;
            if (m51Var != null) {
                m51Var.h0();
            } else {
                m51 m51Var2 = this.F0;
                if (m51Var2 != null) {
                    m51Var2.h0();
                }
            }
            j(ziVar);
            this.h0 = false;
            hs.f(this.v0.I1).k(hs.g2, Integer.valueOf(this.v0.f1()));
            try {
                d1.f.b(1);
                if (this.U1) {
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
        zi ziVar;
        m51 m51Var = this.j0;
        if (m51Var == null || (ziVar = this.v0) == null || this.h0) {
            return;
        }
        if (m51Var.d == null || m51Var.M != 2) {
            m51Var.h0();
        } else {
            q(false, false, false, false);
            S(ziVar);
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        bp bpVar;
        zi ziVar;
        ArrayList arrayList;
        int indexOf;
        int i11 = 0;
        if (i3 == hs.Y1 || i3 == hs.R1) {
            String str = (String) objArr[0];
            zi ziVar2 = this.v0;
            if (ziVar2 != null && ziVar2.I1 == i10 && w7.r(null, ziVar2.F0()).equals(str)) {
                if (this.B0) {
                    this.C0 = true;
                    S(this.v0);
                    return;
                } else {
                    if (this.E0 == null) {
                        try {
                            w7.G(h10.t0);
                            this.E0 = of.a.a(w7.N(this.v0.k, false, true));
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
        if (i3 == hs.w) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            ArrayList arrayList2 = (ArrayList) objArr[0];
            zi ziVar3 = this.v0;
            if (ziVar3 != null && longValue == ziVar3.k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(ziVar3.f1()))) {
                q(true, true, false, false);
            }
            ArrayList arrayList3 = this.f0;
            if (arrayList3 == null || arrayList3.isEmpty() || longValue != ((zi) this.f0.get(0)).k.peer_id.channel_id) {
                return;
            }
            while (i11 < arrayList2.size()) {
                Integer num = (Integer) arrayList2.get(i11);
                zi ziVar4 = (zi) this.g0.get(num.intValue());
                this.g0.remove(num.intValue());
                if (ziVar4 != null) {
                    this.f0.remove(ziVar4);
                }
                i11++;
            }
            return;
        }
        if (i3 == hs.e0) {
            long longValue2 = ((Long) objArr[0]).longValue();
            zi ziVar5 = this.v0;
            if (ziVar5 == null || zi.B0(ziVar5.k) != longValue2) {
                return;
            }
            q(false, true, false, false);
            return;
        }
        int i12 = hs.K0;
        int[] iArr = this.c1;
        HashMap hashMap = this.T0;
        ArrayList arrayList4 = this.S0;
        if (i3 == i12) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            zi ziVar6 = this.v0;
            if (ziVar6 != null && ziVar6.J3() && zi.B0(this.v0.k) == longValue3 && this.b1 == longValue4 && !this.v0.p1) {
                ArrayList arrayList5 = (ArrayList) objArr[1];
                ArrayList arrayList6 = (ArrayList) objArr[2];
                arrayList4.addAll(0, arrayList5);
                arrayList4.addAll(arrayList6);
                int size = arrayList4.size();
                for (int i13 = 0; i13 < size; i13++) {
                    zi ziVar7 = (zi) arrayList4.get(i13);
                    hashMap.put(Integer.valueOf(ziVar7.f1()), ziVar7);
                    iArr[0] = Math.min(iArr[0], ziVar7.f1());
                }
                t0();
                if (az.N0) {
                    g();
                } else {
                    zi ziVar8 = this.v0;
                    if (ziVar8 != null && (indexOf = arrayList4.indexOf(ziVar8)) >= 0) {
                        this.V0 = indexOf;
                    }
                }
                this.a1 = ConnectionsManager.generateClassGuid();
                return;
            }
            return;
        }
        int i14 = hs.V;
        int i15 = hs.L0;
        if (i3 == i14) {
            if (((Integer) objArr[3]).intValue() != this.a1 || this.v0 == null) {
                return;
            }
            long longValue5 = ((Long) objArr[0]).longValue();
            ((Integer) objArr[4]).getClass();
            ArrayList arrayList7 = (ArrayList) objArr[2];
            char c10 = longValue5 == this.Z0 ? (char) 1 : (char) 0;
            if (!arrayList7.isEmpty()) {
                this.X0[c10] = ((Boolean) objArr[5]).booleanValue();
            }
            int i16 = 0;
            for (int i17 = 0; i17 < arrayList7.size(); i17++) {
                zi ziVar9 = (zi) arrayList7.get(i17);
                if (!ziVar9.T4() && !hashMap.containsKey(Integer.valueOf(ziVar9.f1()))) {
                    i16++;
                    arrayList4.add(0, ziVar9);
                    hashMap.put(Integer.valueOf(ziVar9.f1()), ziVar9);
                    iArr[c10] = Math.min(iArr[c10], ziVar9.f1());
                }
            }
            t0();
            int indexOf2 = arrayList4.indexOf(this.v0);
            if (indexOf2 >= 0) {
                this.V0 = indexOf2;
            }
            this.Y0 = false;
            if (az.N0) {
                g();
            }
            if (i16 != 0) {
                hs.f(this.v0.I1).k(i15, Integer.valueOf(i16));
                return;
            }
            return;
        }
        if (i3 == 1) {
            if (((Boolean) objArr[2]).booleanValue() || (arrayList = this.f0) == null || arrayList.isEmpty() || ((Long) objArr[0]).longValue() != zi.B0(((zi) this.f0.get(0)).k)) {
                return;
            }
            ArrayList arrayList8 = (ArrayList) objArr[1];
            while (i11 < arrayList8.size()) {
                zi ziVar10 = (zi) arrayList8.get(i11);
                if ((zi.S4(ziVar10.k) || ziVar10.i4()) && !ziVar10.T4() && !ziVar10.h4() && (!this.e0 || (ziVar10.k.media_unread && !ziVar10.O3()))) {
                    this.f0.add(ziVar10);
                    this.g0.put(ziVar10.f1(), ziVar10);
                }
                i11++;
            }
            return;
        }
        if (i3 == hs.H4) {
            m51 m51Var = (m51) objArr[0];
            if (this.F0 == m51Var || this.j0 == m51Var) {
                return;
            }
            zi ziVar11 = this.v0;
            if (ziVar11 != null && I(ziVar11) && !H() && (ziVar11.J3() || zi.S4(ziVar11.k))) {
                this.i0 = true;
            }
            R(ziVar11, true);
            return;
        }
        if (i3 == hs.T3 && (bpVar = this.R0) != null && objArr[0] == bpVar) {
            int size2 = bpVar.c.size() - arrayList4.size();
            arrayList4.clear();
            arrayList4.addAll(this.R0.c);
            t0();
            if (az.N0) {
                g();
            } else {
                zi ziVar12 = this.v0;
                if (ziVar12 != null) {
                    int indexOf3 = arrayList4.indexOf(ziVar12);
                    if (indexOf3 >= 0) {
                        this.V0 = indexOf3;
                    } else {
                        int i18 = this.V0;
                        if (i18 < 0 || i18 >= arrayList4.size()) {
                            this.V0 = 0;
                        }
                        if (arrayList4.size() == 0) {
                            o();
                        } else {
                            S((zi) arrayList4.get(0));
                        }
                    }
                }
            }
            if (size2 == 0 || (ziVar = this.v0) == null) {
                return;
            }
            hs.f(ziVar.I1).k(i15, Integer.valueOf(size2));
        }
    }

    public final void g() {
        zi ziVar;
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.U0;
        arrayList3.clear();
        int i3 = this.V0;
        if (i3 < 0 || i3 >= arrayList.size()) {
            ziVar = null;
        } else {
            ziVar = (zi) arrayList.get(this.V0);
            arrayList2.remove(this.V0);
        }
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            int nextInt = Utilities.b.nextInt(arrayList2.size());
            arrayList3.add((zi) arrayList2.get(nextInt));
            arrayList2.remove(nextInt);
        }
        if (ziVar != null) {
            arrayList3.add(ziVar);
            this.V0 = arrayList3.size() - 1;
        }
    }

    public native byte[] getWaveform2(short[] sArr, int i3);

    public final boolean h() {
        zi ziVar = this.v0;
        if (ziVar != null) {
            return ((!ziVar.J3() && !zi.S4(this.v0.k) && !this.v0.i4()) || this.v0.T4() || this.v0.h4()) ? false : true;
        }
        return false;
    }

    public final boolean h0(zi ziVar, boolean z10, boolean z11, boolean z12) {
        b20 b20Var = ziVar != null ? ziVar.p0 : null;
        if (ziVar != null && b20Var != null) {
            ArrayList arrayList = this.c0;
            if (!z10 || arrayList.isEmpty()) {
                if (z10) {
                    new File(ziVar.k.attachPath).delete();
                }
                cf cfVar = new cf();
                cfVar.a = ziVar;
                cfVar.c = ziVar.I1;
                cfVar.b = b20Var;
                cfVar.d = z12;
                arrayList.add(cfVar);
                if (z11) {
                    this.a0.add(cfVar);
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

    public final void i(zi ziVar) {
        if (ziVar == null || this.c0.isEmpty()) {
            return;
        }
        for (int i3 = 0; i3 < this.c0.size(); i3++) {
            cf cfVar = (cf) this.c0.get(i3);
            zi ziVar2 = cfVar.a;
            if (ziVar2.T(ziVar) && ziVar2.I1 == ziVar.I1) {
                if (i3 == 0) {
                    synchronized (this.b) {
                        cfVar.b.W = true;
                    }
                    return;
                } else {
                    this.a0.remove((cf) this.c0.remove(i3));
                    k(true);
                    return;
                }
            }
        }
    }

    public final void i0(zi ziVar, float f10) {
        zi ziVar2 = this.v0;
        if ((this.j0 == null && this.F0 == null) || ziVar == null || ziVar2 == null || !L(ziVar)) {
            return;
        }
        try {
            m51 m51Var = this.j0;
            if (m51Var != null) {
                long U = m51Var.U();
                if (U == -9223372036854775807L) {
                    this.u0 = f10;
                } else {
                    ziVar2.b0 = f10;
                    long j10 = (int) (U * f10);
                    this.j0.q0(j10, false);
                    if (!this.U1) {
                        d1.f.v(j10);
                    }
                }
            } else {
                m51 m51Var2 = this.F0;
                if (m51Var2 != null) {
                    m51Var2.p0((long) (m51Var2.U() * f10));
                    if (!this.U1) {
                        d1.f.v((long) (this.F0.U() * f10));
                    }
                }
            }
            hs.f(ziVar.I1).k(hs.i2, Integer.valueOf(ziVar2.f1()), Float.valueOf(f10));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void j(zi ziVar) {
        int requestAudioFocus;
        int i3 = (zi.S4(ziVar.k) || ziVar.i4()) ? this.M ? 3 : 2 : 1;
        if (this.V != i3) {
            this.V = i3;
            if (i3 == 3) {
                requestAudioFocus = us.p0.requestAudioFocus(this, 0, 1);
            } else {
                requestAudioFocus = us.p0.requestAudioFocus(this, 3, (i3 != 2 || az.G0) ? 1 : 3);
            }
            if (requestAudioFocus == 1) {
                this.Y = 2;
            }
        }
    }

    public final void k(boolean z10) {
        if (this.a0.isEmpty()) {
            this.b0 = null;
        } else {
            this.b0 = (cf) this.a0.get(0);
        }
        if (this.b0 != null || z10) {
            if (VideoEncodingService.e == null) {
                try {
                    t0.b.startService(new Intent(t0.b, (Class<?>) VideoEncodingService.class));
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            }
            if (z10) {
                cf cfVar = B().b0;
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService.b != cfVar) {
                    if (cfVar != null) {
                        videoEncodingService.a(cfVar);
                    } else {
                        videoEncodingService.stopSelf();
                    }
                }
            }
        }
    }

    public final void k0(boolean z10) {
        org.telegram.ui.l4 l4Var = this.M0;
        if (l4Var == null) {
            return;
        }
        if (z10) {
            PipRoundVideoView pipRoundVideoView = this.I0;
            if (pipRoundVideoView != null) {
                this.J0 = 2;
                pipRoundVideoView.a(true);
                this.I0 = null;
                return;
            } else {
                if (l4Var.getParent() == null) {
                    this.O0.addView(this.M0);
                }
                this.F0.A0(this.H0);
                return;
            }
        }
        if (l4Var.getParent() != null) {
            this.J0 = 1;
            this.O0.removeView(this.M0);
            return;
        }
        if (this.I0 == null) {
            try {
                PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                this.I0 = pipRoundVideoView2;
                pipRoundVideoView2.d(this.K0, new od(this, 4));
            } catch (Exception unused) {
                this.I0 = null;
            }
        }
        PipRoundVideoView pipRoundVideoView3 = this.I0;
        if (pipRoundVideoView3 != null) {
            this.F0.A0(pipRoundVideoView3.c);
        }
    }

    public final void l(int i3) {
        int i10;
        File N;
        z5 q10 = z5.q(i3);
        int e10 = t0.e();
        if (e10 == 1) {
            if (!q10.O.g || !q10.p().d) {
                return;
            }
        } else if (e10 == 2) {
            if (!q10.P.g || !q10.o().d) {
                return;
            }
        } else if (!q10.N.g || !q10.n().d) {
            return;
        }
        ArrayList arrayList = az.N0 ? this.U0 : this.S0;
        if (arrayList == null || arrayList.size() < 2) {
            return;
        }
        if (this.R0 != null ? !az.O0 : az.O0) {
            i10 = this.V0 + 1;
            if (i10 >= arrayList.size()) {
                i10 = 0;
            }
        } else {
            i10 = this.V0 - 1;
            if (i10 < 0) {
                i10 = arrayList.size() - 1;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        zi ziVar = (zi) arrayList.get(i10);
        File file = null;
        if (!TextUtils.isEmpty(ziVar.k.attachPath)) {
            File file2 = new File(ziVar.k.attachPath);
            if (file2.exists()) {
                file = file2;
            }
        }
        if (file != null) {
            N = file;
        } else {
            w7.G(i3);
            N = w7.N(ziVar.k, false, true);
        }
        N.exists();
        if (N == file || N.exists() || !ziVar.J3()) {
            return;
        }
        w7.G(i3).X(ziVar.F0(), ziVar, 0, zi.S5(ziVar.k) ? 2 : 0);
    }

    public final void l0(int i3) {
        boolean z10 = az.N0;
        if (i3 == 2) {
            az.N0 = true;
            az.O0 = false;
        } else if (i3 == 1) {
            az.O0 = true;
            az.N0 = false;
        } else {
            az.O0 = false;
            az.N0 = false;
        }
        MediaController B = B();
        zi ziVar = B.v0;
        if (ziVar != null && ziVar.J3()) {
            B.l(B.v0.I1);
        }
        SharedPreferences.Editor edit = hp.e1().edit();
        edit.putBoolean("shuffleMusic", az.N0);
        edit.putBoolean("playOrderReversed", az.O0);
        edit.apply();
        boolean z11 = az.N0;
        if (z10 != z11) {
            if (z11) {
                g();
                return;
            }
            zi ziVar2 = this.v0;
            if (ziVar2 != null) {
                int indexOf = this.S0.indexOf(ziVar2);
                this.V0 = indexOf;
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
            if (Math.abs(currentTimeMillis - g2) < 5000) {
                return;
            }
            AudioManager audioManager = (AudioManager) t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            int i3 = this.M ? 0 : 3;
            int streamVolume = audioManager.getStreamVolume(i3);
            if (streamVolume == 0) {
                audioManager.adjustStreamVolume(i3, streamVolume, 1);
                g2 = currentTimeMillis;
            }
        } catch (Exception unused) {
        }
    }

    public final void m0(boolean z10, float f10) {
        if (z10) {
            if (this.r0 >= 6.0f && f10 == 1.0f && this.v0 != null) {
                this.j0.g0();
                zi ziVar = this.v0;
                g0.i3(new ce(this, ziVar, ziVar.b0, 0), 50L);
            }
            this.r0 = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.t0 = f10;
            }
        } else {
            this.q0 = f10;
            if (Math.abs(f10 - 1.0f) > 0.001f) {
                this.s0 = f10;
            }
        }
        m51 m51Var = this.j0;
        if (m51Var != null) {
            m51Var.v0(Math.round(f10 * 10.0f) / 10.0f);
        } else {
            m51 m51Var2 = this.F0;
            if (m51Var2 != null) {
                m51Var2.v0(Math.round(f10 * 10.0f) / 10.0f);
            }
        }
        hp.e1().edit().putFloat(z10 ? "musicPlaybackSpeed" : "playbackSpeed", f10).putFloat(z10 ? "fastMusicPlaybackSpeed" : "fastPlaybackSpeed", z10 ? this.t0 : this.s0).commit();
        hs.e().k(hs.J4, new Object[0]);
        if (this.U1) {
            return;
        }
        d1.f.z(f10);
    }

    public final void n(boolean z10) {
        File file;
        File file2;
        File file3;
        e0.g gVar;
        e0.g gVar2;
        if (this.I1) {
            ei.d1 d1Var = this.H1;
            if (d1Var != null) {
                g0.r(d1Var);
                this.H1 = null;
            }
            boolean c10 = (z10 || (gVar2 = this.G1) == null) ? false : gVar2.c();
            if (!c10 && (gVar = this.G1) != null) {
                gVar.b = false;
                ((vi.j) gVar.e).b();
            }
            if (c10 && (file3 = this.k1) != null) {
                z0.b(file3);
            }
            x(!z10);
            return;
        }
        this.g1 = null;
        z0.b(this.k1);
        if (z10 && (file2 = this.k1) != null) {
            try {
                file2.delete();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        this.k1 = null;
        if (z10 && (file = this.j1) != null) {
            file.delete();
        }
        this.j1 = null;
        this.y0 = false;
        this.r = false;
        this.P = false;
    }

    public final void n0() {
        try {
            float f10 = this.Y != 1 ? 1.0f : 0.2f;
            m51 m51Var = this.j0;
            float f11 = 0.0f;
            if (m51Var != null) {
                if (!d1.f.u()) {
                    f11 = this.Q1 * f10;
                }
                m51Var.B0(f11);
            } else {
                m51 m51Var2 = this.F0;
                if (m51Var2 != null) {
                    if (d1.f.u()) {
                        f10 = 0.0f;
                    }
                    m51Var2.B0(f10);
                }
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void o() {
        q(true, true, false, false);
        this.E0 = null;
        this.C0 = false;
        for (int i3 = 0; i3 < 4; i3++) {
            z5 q10 = z5.q(i3);
            q10.b.clear();
            q10.c.clear();
            q10.d.clear();
            q10.e.clear();
            q10.f.clear();
            q10.h.clear();
            q10.G.b();
        }
        this.c0.clear();
        this.d0.clear();
        this.V1 = null;
        this.f0 = null;
        this.g0 = null;
        r();
    }

    public final boolean o0(ArrayList arrayList, zi ziVar, long j10, boolean z10, g2.b0 b0Var, long j11) {
        HashMap hashMap;
        zi ziVar2 = this.v0;
        ArrayList arrayList2 = this.S0;
        if (ziVar2 == ziVar) {
            int indexOf = arrayList2.indexOf(ziVar);
            if (indexOf >= 0) {
                this.V0 = indexOf;
            }
            return S(ziVar);
        }
        this.W0 = !z10;
        this.Z0 = j10;
        this.C0 = !arrayList2.isEmpty();
        r();
        this.D0 = b0Var;
        this.b1 = j11;
        boolean z11 = false;
        if (!arrayList.isEmpty() && m5.C(zi.B0(((zi) arrayList.get(0)).k))) {
            z11 = true;
        }
        int size = arrayList.size() - 1;
        int i3 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i10 = TLObject.FLAG_31;
        while (true) {
            hashMap = this.T0;
            if (size < 0) {
                break;
            }
            zi ziVar3 = (zi) arrayList.get(size);
            if (ziVar3.J3()) {
                int f12 = ziVar3.f1();
                if (f12 > 0 || z11) {
                    i3 = Math.min(i3, f12);
                    i10 = Math.max(i10, f12);
                }
                arrayList2.add(ziVar3);
                hashMap.put(Integer.valueOf(f12), ziVar3);
            }
            size--;
        }
        t0();
        int indexOf2 = arrayList2.indexOf(ziVar);
        this.V0 = indexOf2;
        if (indexOf2 == -1) {
            r();
            this.V0 = arrayList2.size();
            arrayList2.add(ziVar);
            hashMap.put(Integer.valueOf(ziVar.f1()), ziVar);
        }
        if (ziVar.J3() && !ziVar.p1) {
            if (az.N0) {
                g();
            }
            if (z10) {
                if (this.D0 == null) {
                    final li b02 = li.b0(ziVar.I1);
                    final long B0 = zi.B0(ziVar.k);
                    final long j12 = this.b1;
                    final long j13 = i3;
                    final long j14 = i10;
                    b02.getMessagesStorage().a.c(new Runnable() { // from class: org.telegram.messenger.mh
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
                            boolean z12;
                            SQLiteCursor sQLiteCursor2;
                            mh mhVar = this;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            int i11 = 0;
                            while (true) {
                                li liVar = li.this;
                                long j15 = j12;
                                long j16 = B0;
                                if (i11 >= 2) {
                                    break;
                                }
                                ArrayList arrayList6 = i11 == 0 ? arrayList4 : arrayList5;
                                long j17 = j13;
                                long j18 = j14;
                                int i12 = i11;
                                if (j15 != 0) {
                                    try {
                                        SQLiteDatabase sQLiteDatabase = liVar.getMessagesStorage().b;
                                        Locale locale = Locale.US;
                                        String str = i12 == 0 ? "<" : ">";
                                        if (i12 != 0) {
                                            j17 = j18;
                                        }
                                        arrayList3 = arrayList4;
                                        sQLiteCursor2 = sQLiteDatabase.queryFinalized("SELECT data, mid FROM media_topics WHERE uid = " + j16 + " AND topic_id = " + j15 + " AND mid " + str + " " + j17 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                    } catch (Exception e10) {
                                        e = e10;
                                        arrayList3 = arrayList4;
                                        a8.g(e, true);
                                        g0.h3(new f9(liVar, j16, arrayList3, arrayList5, j15));
                                    }
                                } else {
                                    arrayList3 = arrayList4;
                                    if (i12 == 0) {
                                        if (m5.C(j16)) {
                                            SQLiteDatabase sQLiteDatabase2 = liVar.getMessagesStorage().b;
                                            Locale locale2 = Locale.US;
                                            sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j16 + " AND mid > " + j17 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        } else {
                                            SQLiteDatabase sQLiteDatabase3 = liVar.getMessagesStorage().b;
                                            Locale locale3 = Locale.US;
                                            sQLiteCursor2 = sQLiteDatabase3.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j16 + " AND mid < " + j17 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        }
                                    } else if (m5.C(j16)) {
                                        SQLiteDatabase sQLiteDatabase4 = liVar.getMessagesStorage().b;
                                        Locale locale4 = Locale.US;
                                        r12 = 0;
                                        sQLiteCursor = sQLiteDatabase4.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j16 + " AND mid < " + j18 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        while (sQLiteCursor.next()) {
                                            try {
                                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(r12);
                                                if (byteBufferValue != 0) {
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r12), r12);
                                                    TLdeserialize.readAttachPath(byteBufferValue, liVar.getUserConfig().n);
                                                    byteBufferValue.reuse();
                                                    if (zi.L3(TLdeserialize)) {
                                                        TLdeserialize.id = sQLiteCursor.intValue(1);
                                                        TLdeserialize.dialog_id = j16;
                                                        z12 = false;
                                                        arrayList6.add(0, new zi(liVar.currentAccount, TLdeserialize, false, true));
                                                    } else {
                                                        z12 = false;
                                                    }
                                                } else {
                                                    z12 = r12;
                                                }
                                                r12 = z12;
                                            } catch (Exception e11) {
                                                e = e11;
                                                a8.g(e, true);
                                                g0.h3(new f9(liVar, j16, arrayList3, arrayList5, j15));
                                            }
                                        }
                                        sQLiteCursor.dispose();
                                        i11 = i12 + 1;
                                        mhVar = this;
                                        arrayList4 = arrayList3;
                                    } else {
                                        SQLiteDatabase sQLiteDatabase5 = liVar.getMessagesStorage().b;
                                        Locale locale5 = Locale.US;
                                        sQLiteCursor2 = sQLiteDatabase5.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j16 + " AND mid > " + j18 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                    }
                                }
                                r12 = 0;
                                sQLiteCursor = sQLiteCursor2;
                                while (sQLiteCursor.next()) {
                                }
                                sQLiteCursor.dispose();
                                i11 = i12 + 1;
                                mhVar = this;
                                arrayList4 = arrayList3;
                                g0.h3(new f9(liVar, j16, arrayList3, arrayList5, j15));
                            }
                            arrayList3 = arrayList4;
                            g0.h3(new f9(liVar, j16, arrayList3, arrayList5, j15));
                        }
                    });
                } else {
                    this.a1 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return S(ziVar);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i3) {
        g0.h3(new sd(this, i3, 1));
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
        long j10;
        int i3;
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        ArrayList arrayList;
        zi ziVar;
        if (this.Q && VoIPService.getSharedInstance() == null) {
            if (sensorEvent.sensor.getType() == 8) {
                if (r2.a) {
                    a8.b("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f10 = this.L;
                float f11 = sensorEvent.values[0];
                if (f10 != f11) {
                    this.K = true;
                }
                this.L = f11;
                if (this.K) {
                    this.J = f11 < 5.0f && f11 != this.e.getMaximumRange();
                }
                j10 = 0;
                z10 = 1;
                i3 = 2;
            } else {
                Sensor sensor = sensorEvent.sensor;
                if (sensor == this.f) {
                    double d = this.I == 0 ? 0.9800000190734863d : 1.0d / (((sensorEvent.timestamp - r2) / 1.0E9d) + 1.0d);
                    this.I = sensorEvent.timestamp;
                    float[] fArr = this.S;
                    double d10 = 1.0d - d;
                    float[] fArr2 = sensorEvent.values;
                    j10 = 0;
                    float f12 = (float) ((fArr2[0] * d10) + (fArr[0] * d));
                    fArr[0] = f12;
                    z10 = 1;
                    i3 = 2;
                    float f13 = (float) ((fArr2[1] * d10) + (fArr[1] * d));
                    fArr[1] = f13;
                    float f14 = (float) ((d10 * fArr2[2]) + (d * fArr[2]));
                    fArr[2] = f14;
                    float[] fArr3 = this.T;
                    fArr3[0] = (fArr2[0] * 0.19999999f) + (f12 * 0.8f);
                    fArr3[1] = (fArr2[1] * 0.19999999f) + (f13 * 0.8f);
                    fArr3[2] = (fArr2[2] * 0.19999999f) + (f14 * 0.8f);
                    float[] fArr4 = this.U;
                    fArr4[0] = fArr2[0] - fArr[0];
                    fArr4[1] = fArr2[1] - fArr[1];
                    fArr4[2] = fArr2[2] - fArr[2];
                } else {
                    j10 = 0;
                    boolean z13 = true;
                    i3 = 2;
                    if (sensor == this.h) {
                        float[] fArr5 = this.U;
                        float[] fArr6 = sensorEvent.values;
                        fArr5[0] = fArr6[0];
                        fArr5[1] = fArr6[1];
                        fArr5[2] = fArr6[2];
                        z10 = z13;
                    } else {
                        z10 = z13;
                        if (sensor == this.n) {
                            float[] fArr7 = this.T;
                            float[] fArr8 = this.S;
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
                            z10 = z13;
                        }
                    }
                }
            }
            Sensor sensor2 = sensorEvent.sensor;
            if (sensor2 == this.h || sensor2 == this.n || sensor2 == this.f) {
                float[] fArr10 = this.S;
                float f18 = fArr10[0];
                float[] fArr11 = this.U;
                float f19 = (fArr10[i3] * fArr11[i3]) + (fArr10[z10] * fArr11[z10]) + (f18 * fArr11[0]);
                int i11 = this.F;
                if (i11 != 6 && ((f19 > 0.0f && this.R > 0.0f) || (f19 < 0.0f && this.R < 0.0f))) {
                    if (f19 > 0.0f) {
                        z11 = f19 > 15.0f ? z10 : false;
                        i10 = z10;
                    } else {
                        z11 = f19 < -15.0f ? z10 : false;
                        i10 = i3;
                    }
                    int i12 = this.E;
                    if (i12 != 0 && i12 != i10) {
                        int i13 = this.y;
                        if (i13 != 6 || !z11) {
                            if (!z11) {
                                this.G++;
                            }
                            if (this.G == 10 || i13 != 6 || i11 != 0) {
                                this.y = 0;
                                this.E = 0;
                                this.F = 0;
                                this.G = 0;
                            }
                        } else if (i11 < 6) {
                            int i14 = i11 + 1;
                            this.F = i14;
                            if (i14 == 6) {
                                this.y = 0;
                                this.E = 0;
                                this.G = 0;
                                this.H = System.currentTimeMillis();
                                boolean z14 = r2.a;
                            }
                        }
                    } else if (z11 && i11 == 0 && (i12 == 0 || i12 == i10)) {
                        int i15 = this.y;
                        if (i15 < 6 && !this.J) {
                            this.E = i10;
                            int i16 = i15 + 1;
                            this.y = i16;
                            if (i16 == 6) {
                                this.G = 0;
                            }
                        }
                    } else {
                        if (!z11) {
                            this.G++;
                        }
                        if (i12 != i10 || this.G == 10 || this.y != 6 || i11 != 0) {
                            this.F = 0;
                            this.y = 0;
                            this.E = 0;
                            this.G = 0;
                        }
                    }
                }
                this.R = f19;
                float[] fArr12 = this.T;
                this.w = (fArr12[z10] <= 2.5f || Math.abs(fArr12[i3]) >= 4.0f || Math.abs(this.T[0]) <= 1.5f) ? false : z10;
            }
            if (this.F == 6 || this.w) {
                this.x = System.currentTimeMillis();
            }
            boolean z15 = (this.y0 || this.v0 != null || !az.k(z10) || !t0.w || this.N || !this.O || this.s == null || this.X) ? false : z10;
            boolean z16 = (az.k(false) && (ziVar = this.v0) != null && (zi.S4(ziVar.k) || this.v0.i4())) ? z10 : false;
            boolean z17 = this.J;
            boolean z18 = (this.F == 6 || this.w || System.currentTimeMillis() - this.x < 60) ? z10 : false;
            boolean z19 = (this.M || this.r) ? z10 : false;
            boolean z20 = ((z18 || z19) && !y() && !VoIPService.isAnyKindOfCallActive() && (z15 || z16) && !PhotoViewer.v1().U1()) ? z10 : false;
            PowerManager.WakeLock wakeLock = this.d;
            if (wakeLock != null) {
                boolean isHeld = wakeLock.isHeld();
                if (isHeld && !z20) {
                    if (r2.a) {
                        a8.b("wake lock releasing (proximityDetected=" + z17 + ", accelerometerDetected=" + z18 + ", alreadyPlaying=" + z19 + ")");
                    }
                    this.d.release();
                } else if (!isHeld && z20) {
                    if (r2.a) {
                        a8.b("wake lock acquiring (proximityDetected=" + z17 + ", accelerometerDetected=" + z18 + ", alreadyPlaying=" + z19 + ")");
                    }
                    this.d.acquire();
                }
            }
            boolean z21 = this.J;
            if (z21 && z20) {
                if (z15 && this.M1 == null) {
                    if (!this.r) {
                        if (r2.a) {
                            a8.b("start record");
                        }
                        this.M = z10;
                        if (this.g1 == null) {
                            org.telegram.ui.wm wmVar = this.s;
                            ArrayList arrayList2 = wmVar.L6;
                            org.telegram.ui.mj mjVar = wmVar.a0;
                            if (mjVar == null || !mjVar.u0()) {
                                int size = arrayList2.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        zi ziVar2 = (zi) arrayList2.get(size);
                                        if ((zi.S4(ziVar2.k) || ziVar2.i4()) && ziVar2.k.media_unread && !ziVar2.O3()) {
                                            MediaController B = B();
                                            if (B().S(ziVar2)) {
                                                z12 = true;
                                                arrayList = wmVar.g8(ziVar2, true);
                                            } else {
                                                z12 = true;
                                                arrayList = null;
                                            }
                                            B.r0(arrayList, z12);
                                        } else {
                                            size--;
                                        }
                                    } else if (wmVar.getParentActivity() != null && wmVar.getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                        wmVar.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                                    }
                                }
                            }
                            if (this.M) {
                                q0();
                            }
                        }
                        this.r = true;
                        this.M = false;
                        W(true);
                        if (this.M) {
                        }
                    }
                } else if (z16 && !this.M) {
                    if (r2.a) {
                        a8.b("start listen");
                    }
                    q0();
                    u0(false);
                }
                this.F = 0;
                this.y = 0;
                this.E = 0;
                this.G = 0;
            } else if (z21 && ((this.f == null || this.h == null) && this.n == null && !VoIPService.isAnyKindOfCallActive())) {
                if (this.v0 != null && !t0.x && z16 && !this.M && !this.y0 && !y()) {
                    if (r2.a) {
                        a8.b("start listen by proximity only");
                    }
                    q0();
                    u0(false);
                }
            } else if (!this.J && !this.y0) {
                if (this.r) {
                    if (r2.a) {
                        a8.b("stop record");
                    }
                    W(false);
                    this.r = false;
                    this.P = false;
                } else if (this.M) {
                    if (r2.a) {
                        a8.b("stop listen");
                    }
                    this.M = false;
                    u0(true);
                    this.P = false;
                }
            }
            if (this.H == j10 || this.F != 6 || Math.abs(System.currentTimeMillis() - this.H) <= 1000) {
                return;
            }
            this.F = 0;
            this.y = 0;
            this.E = 0;
            this.G = 0;
            this.H = j10;
        }
    }

    public final void p(boolean z10, boolean z11) {
        q(z10, z11, false, false);
    }

    public final void p0(TextureView textureView, org.telegram.ui.l4 l4Var, FrameLayout frameLayout, boolean z10) {
        if (textureView == null) {
            return;
        }
        if (!z10 && this.H0 == textureView) {
            this.J0 = 1;
            this.H0 = null;
            this.M0 = null;
            this.O0 = null;
            return;
        }
        m51 m51Var = this.F0;
        if (m51Var == null || textureView == this.H0) {
            return;
        }
        this.N0 = l4Var != null && l4Var.d;
        this.H0 = textureView;
        PipRoundVideoView pipRoundVideoView = this.I0;
        if (pipRoundVideoView != null) {
            m51Var.A0(pipRoundVideoView.c);
        } else {
            m51Var.A0(textureView);
        }
        this.M0 = l4Var;
        this.O0 = frameLayout;
        if (!this.Q0 || l4Var == null) {
            return;
        }
        l4Var.a(this.P0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0255  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        PipRoundVideoView pipRoundVideoView;
        zi ziVar;
        int i3 = hs.j2;
        if (z11 && a0()) {
            return;
        }
        int i10 = 1;
        boolean z15 = false;
        if (this.j0 != null) {
            we weVar = this.x0;
            if (weVar != null) {
                weVar.b();
                this.x0 = null;
            }
            ValueAnimator valueAnimator = this.R1;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.R1.cancel();
            }
            if (d1.f.u() || !this.j0.d0() || (ziVar = this.v0) == null || zi.S4(ziVar.k)) {
                try {
                    this.j0.m0();
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            } else {
                m51 m51Var = this.j0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 0.0f);
                ofFloat.addUpdateListener(new q(i10, this, m51Var));
                ofFloat.addListener(new ii.v3(m51Var, 7));
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
            this.j0 = null;
            org.telegram.ui.ActionBar.k6.N1(this.v0);
        } else {
            m51 m51Var2 = this.F0;
            if (m51Var2 != null) {
                this.M0 = null;
                this.O0 = null;
                this.Q0 = false;
                this.N0 = false;
                this.H0 = null;
                this.w0 = null;
                if (z13) {
                    PhotoViewer.v1().T2 = this.F0;
                    zi ziVar2 = this.v0;
                    this.w0 = ziVar2;
                    hs.f(ziVar2.I1).k(i3, this.v0, Boolean.TRUE);
                } else {
                    long S = m51Var2.S();
                    zi ziVar3 = this.v0;
                    if (ziVar3 != null && zi.M4(ziVar3.k) && S > 0) {
                        zi ziVar4 = this.v0;
                        ziVar4.d0 = (int) S;
                        hs.f(ziVar4.I1).k(i3, this.v0, Boolean.FALSE);
                    }
                    this.F0.m0();
                    this.F0 = null;
                }
                try {
                    this.K0.getWindow().clearFlags(128);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                if (this.v0 != null && !z13) {
                    g0.r(this.d1);
                    w7.G(this.v0.I1).a0(this.v0.F0(), true, false);
                }
            }
        }
        z0();
        this.h0 = false;
        zi ziVar5 = this.v0;
        if (ziVar5 != null) {
            if (this.B0) {
                w7.G(ziVar5.I1).f(this.v0.F0());
            }
            zi ziVar6 = this.v0;
            if (z10) {
                ziVar6.H5();
                hs.f(ziVar6.I1).k(hs.e2, Integer.valueOf(this.v0.f1()), 0);
            }
            this.v0 = null;
            this.B0 = false;
            if (z10) {
                us.p0.abandonAudioFocus(this);
                this.V = 0;
                ArrayList arrayList = this.f0;
                int i11 = -1;
                if (arrayList != null) {
                    if (!z12 || (i11 = arrayList.indexOf(ziVar6)) < 0) {
                        this.f0 = null;
                        this.g0 = null;
                    } else {
                        this.f0.remove(i11);
                        this.g0.remove(ziVar6.f1());
                        if (this.f0.isEmpty()) {
                            this.f0 = null;
                            this.g0 = null;
                        }
                    }
                }
                ArrayList arrayList2 = this.f0;
                if (arrayList2 == null || i11 >= arrayList2.size()) {
                    if ((zi.S4(ziVar6.k) || ziVar6.i4()) && ziVar6.f1() != 0 && this.M && this.s != null && this.O && az.k(true)) {
                        this.r = true;
                        int currentAccount = this.s.getCurrentAccount();
                        long a10 = this.s.a();
                        org.telegram.ui.wm wmVar = this.s;
                        zi ziVar7 = wmVar.m4;
                        int classGuid = wmVar.getClassGuid();
                        org.telegram.ui.wm wmVar2 = this.s;
                        zv W8 = wmVar2 != null ? wmVar2.W8() : null;
                        org.telegram.ui.wm wmVar3 = this.s;
                        long h92 = wmVar3 != null ? wmVar3.h9() : 0L;
                        org.telegram.ui.wm wmVar4 = this.s;
                        x0(currentAccount, a10, null, ziVar7, null, classGuid, false, W8, h92, wmVar4 != null ? wmVar4.x5 : null);
                        this.P = true;
                    }
                    z14 = false;
                    hs.f(ziVar6.I1).k(hs.f2, Integer.valueOf(ziVar6.f1()), Boolean.valueOf(z11));
                    this.J0 = 0;
                    PipRoundVideoView pipRoundVideoView2 = this.I0;
                    if (pipRoundVideoView2 != null) {
                        pipRoundVideoView2.a(true);
                        this.I0 = null;
                    }
                } else {
                    zi ziVar8 = (zi) this.f0.get(i11);
                    S(ziVar8);
                    if (!ziVar8.i4() && (pipRoundVideoView = this.I0) != null) {
                        pipRoundVideoView.a(true);
                        this.I0 = null;
                    }
                    z14 = false;
                    z15 = true;
                    if (z11) {
                        t0.b.stopService(new Intent(t0.b, (Class<?>) MusicPlayerService.class));
                    }
                }
            } else {
                z14 = false;
            }
            z15 = z14;
            if (z11) {
            }
        } else {
            z14 = false;
        }
        if (!z15 && z12 && !az.k(true)) {
            org.telegram.ui.wm wmVar5 = this.s;
            A0(wmVar5, z14, z14);
            this.s = wmVar5;
        }
        if (!z11 || d1.f.f() == null) {
            return;
        }
        try {
            f6.a c10 = f6.a.c(d1.f.f());
            if (c10 == null) {
                return;
            }
            c10.b().b(true);
        } catch (Exception e12) {
            a8.g(e12, true);
        }
    }

    public final void q0() {
        this.M = true;
        AudioManager audioManager = us.p0;
        audioManager.setBluetoothScoOn(false);
        audioManager.setSpeakerphoneOn(false);
    }

    public final void r() {
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

    public final void r0(ArrayList arrayList, boolean z10) {
        ArrayList arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
        this.f0 = arrayList2;
        if (arrayList2 != null) {
            this.e0 = z10;
            this.g0 = new SparseArray();
            for (int i3 = 0; i3 < this.f0.size(); i3++) {
                zi ziVar = (zi) this.f0.get(i3);
                this.g0.put(ziVar.f1(), ziVar);
            }
        }
    }

    public final void s(vi.f fVar) {
        File file = (File) fVar.b;
        this.k1 = file;
        long j10 = fVar.a;
        this.l1 = j10;
        byte[] bArr = (byte[]) fVar.c;
        G0(file, j10, bArr == null ? null : (byte[]) bArr.clone());
        if (this.C1 == 3) {
            this.L1 = fVar;
            e0.g gVar = this.G1;
            if (gVar != null) {
                ((vi.j) gVar.e).o();
                gVar.c = true;
                this.G1 = null;
            }
            Y(false);
            j0(false);
            return;
        }
        li.b0(this.i1).B1(this.n1, this.o1, null);
        if (this.C1 == 1) {
            wy f10 = wy.f(this.g1, null, file.getAbsolutePath(), this.n1, this.r1, this.s1, null, null, null, null, this.D1, this.E1, 0, this.F1 ? Integer.MAX_VALUE : 0, null, null, false);
            f10.R = this.p1;
            f10.T = this.q1;
            f10.H = this.t1;
            f10.K = this.u1;
            f10.Q = 0L;
            yy.C(this.i1).r0(f10);
        }
        hs f11 = hs.f(this.i1);
        Integer valueOf = Integer.valueOf(this.h1);
        int i3 = this.C1;
        f11.k(hs.s2, valueOf, i3 == 2 ? this.g1 : null, i3 == 2 ? file.getAbsolutePath() : null);
        x(true);
    }

    public final void t0() {
        Collections.sort(this.S0, new o0.a(7));
    }

    public final void u0(boolean z10) {
        zi ziVar = this.v0;
        if (ziVar == null) {
            return;
        }
        hs.f(ziVar.I1).k(hs.u2, Boolean.valueOf(this.M));
        m51 m51Var = this.F0;
        if (m51Var != null) {
            m51Var.x0(this.M ? 0 : 3);
            if (z10) {
                R(this.v0, true);
                return;
            }
            if (this.F0.S() < 1000) {
                this.F0.p0(0L);
            }
            this.F0.h0();
            return;
        }
        m51 m51Var2 = this.j0;
        boolean z11 = m51Var2 != null;
        zi ziVar2 = this.v0;
        float f10 = ziVar2.b0;
        int i3 = ziVar2.h0;
        if (z10 || m51Var2 == null || !m51Var2.d0() || i3 * f10 > 1.0f) {
            ziVar2.b0 = f10;
        } else {
            ziVar2.b0 = 0.0f;
        }
        q(false, true, false, false);
        S(ziVar2);
        if (z10) {
            if (z11) {
                g0.i3(new y4(21, this, ziVar2), 100L);
            } else {
                R(ziVar2, true);
            }
        }
    }

    public final void v0(zi ziVar) {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
            ziVar.S0();
            Timer timer2 = new Timer();
            this.z0 = timer2;
            timer2.schedule(new kg.m1(1, this, ziVar), 0L, 17L);
        }
    }

    public final void w0(org.telegram.ui.wm wmVar) {
        if (wmVar != null) {
            if ((this.f == null && this.n == null) || this.e == null) {
                return;
            }
            if (!az.k(false)) {
                zi ziVar = this.v0;
                if (ziVar == null) {
                    return;
                }
                if (!zi.S4(ziVar.k) && !this.v0.i4()) {
                    return;
                }
            }
            this.s = wmVar;
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
            this.E = 0;
            this.G = 0;
            this.F = 0;
            Utilities.e.c(new od(this, 3));
            this.Q = true;
        }
    }

    public final void x(boolean z10) {
        File file;
        Y(false);
        j0(false);
        e0.g gVar = this.G1;
        if (gVar != null) {
            ((vi.j) gVar.e).o();
            gVar.c = true;
            this.G1 = null;
        }
        if (!z10 && (file = this.k1) != null) {
            z0.b(file);
            this.k1.delete();
        }
        Z();
        this.y0 = false;
        this.r = false;
        this.P = false;
    }

    public final void x0(int i3, long j10, zi ziVar, zi ziVar2, TL_stories.StoryItem storyItem, int i10, boolean z10, zv zvVar, long j11, ej ejVar) {
        zi ziVar3 = this.v0;
        boolean z11 = (ziVar3 == null || !I(ziVar3) || H()) ? false : true;
        this.y0 = z10;
        Y(true);
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.I1 && !X()) {
            g0.h3(new rd(i3, i10, 0));
            return;
        }
        if (!s0(i3)) {
            if (r2.a) {
                a8.b("AudioRecorder legacy selected: account=" + i3 + ", dialog=" + j10 + ", guid=" + i10);
            }
            pd pdVar = new pd(this, i3, i10, j10, j11, ejVar, ziVar2, ziVar, storyItem, zvVar);
            this.M1 = pdVar;
            this.N1.e(pdVar, z11 ? 500L : 50L);
            return;
        }
        this.I1 = true;
        this.J1 = false;
        this.K1 = false;
        this.i1 = i3;
        this.h1 = i10;
        this.n1 = j10;
        this.p1 = j11;
        this.q1 = ejVar;
        this.o1 = ziVar2 == null ? 0L : zi.c2(i3, ziVar2.k, false, false);
        this.r1 = ziVar;
        this.s1 = ziVar2;
        this.t1 = storyItem;
        this.u1 = zvVar;
        this.j1 = null;
        this.k1 = null;
        this.l1 = 0L;
        this.m1 = 0;
        this.w1 = 0L;
        this.C1 = 0;
        ei.d1 d1Var = new ei.d1(i3, i10, 1, j10, this);
        this.H1 = d1Var;
        g0.i3(d1Var, z11 ? 500L : 50L);
    }

    public final void y0() {
        if (this.c0.isEmpty()) {
            return;
        }
        cf cfVar = (cf) this.c0.get(0);
        b20 b20Var = cfVar.b;
        synchronized (this.b) {
            if (b20Var != null) {
                try {
                    b20Var.W = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        new Thread(new a(cfVar, 19)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final mi.z3 z() {
        FileOutputStream fileOutputStream;
        p7.d dVar;
        tf.d dVar2;
        zi ziVar = this.v0;
        FileOutputStream fileOutputStream2 = null;
        String str = null;
        if (ziVar != null) {
            String z12 = ziVar.z1(true);
            String x12 = this.v0.x1(true);
            TLRPC.Document F0 = this.v0.F0();
            if (this.v0.i4() || zi.M4(this.v0.k) || this.v0.J3()) {
                zi ziVar2 = this.v0;
                File file = (!ziVar2.w0 || ziVar2.k == null) ? null : new File(this.v0.k.attachPath);
                if (file == null || !file.exists()) {
                    w7.G(this.v0.I1);
                    file = w7.N(this.v0.k, false, true);
                }
                if (file != null && file.exists()) {
                    String u12 = this.v0.u1();
                    Uri parse = Uri.parse("file://" + file.getAbsolutePath());
                    e6.l lVar = new e6.l(0);
                    of.a aVar = this.E0;
                    if (aVar != null) {
                        if (!TextUtils.isEmpty(aVar.c)) {
                            lVar.b("com.google.android.gms.cast.metadata.TITLE", this.E0.c);
                        }
                        if (!TextUtils.isEmpty(this.E0.d)) {
                            lVar.b("com.google.android.gms.cast.metadata.ARTIST", this.E0.d);
                        }
                        if (!TextUtils.isEmpty(this.E0.f)) {
                            lVar.b("com.google.android.gms.cast.metadata.ALBUM_TITLE", this.E0.f);
                        }
                        if (!TextUtils.isEmpty(this.E0.e)) {
                            lVar.b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", this.E0.e);
                        }
                        if (!TextUtils.isEmpty(this.E0.m)) {
                            lVar.b("com.google.android.gms.cast.metadata.COMPOSER", this.E0.m);
                        }
                        short s6 = this.E0.k;
                        Bundle bundle = lVar.b;
                        if (s6 != 0) {
                            e6.l.c(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", s6);
                        }
                        short s10 = this.E0.j;
                        if (s10 != 0) {
                            e6.l.c(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", s10);
                        }
                        of.a aVar2 = this.E0;
                        if (aVar2.o != null) {
                            File file2 = aVar2.q;
                            if (file2 == null || !file2.exists()) {
                                file2 = gi.f7.w(h10.t0, "jpg");
                                try {
                                    Bitmap bitmap = this.E0.o;
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
                                            this.E0.q = file2;
                                            if (file2 != null) {
                                                dVar = (p7.d) tf.b.t().a;
                                                dVar2 = (tf.d) dVar.b;
                                                if (dVar2 != null) {
                                                }
                                                str = "/file" + Utilities.c.nextLong();
                                                if (((tf.d) dVar.b) == null) {
                                                }
                                                ((tf.d) dVar.b).l(file2, str);
                                                lVar.a.add(new o6.a(Uri.parse(tf.d.j(tf.d.i(), str)), 0, 0));
                                            }
                                            tf.e eVar = new tf.e(parse, u12, "/player_" + this.v0.f1());
                                            eVar.e = z12;
                                            eVar.f = x12;
                                            eVar.h = lVar;
                                            return new mi.z3(new tf.f(eVar));
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
                                this.E0.q = file2;
                            }
                            if (file2 != null && file2.exists()) {
                                dVar = (p7.d) tf.b.t().a;
                                dVar2 = (tf.d) dVar.b;
                                if (dVar2 != null) {
                                    Pair pair = dVar2.i;
                                    if ((pair == null ? null : (File) pair.second) != null) {
                                        if (TextUtils.equals((pair == null ? null : (File) pair.second).getAbsolutePath(), file2.getAbsolutePath())) {
                                            Pair pair2 = ((tf.d) dVar.b).i;
                                            if (pair2 != null) {
                                                str = (String) pair2.first;
                                            }
                                            lVar.a.add(new o6.a(Uri.parse(tf.d.j(tf.d.i(), str)), 0, 0));
                                        }
                                    }
                                }
                                str = "/file" + Utilities.c.nextLong();
                                if (((tf.d) dVar.b) == null) {
                                    dVar.b = new tf.d();
                                }
                                ((tf.d) dVar.b).l(file2, str);
                                lVar.a.add(new o6.a(Uri.parse(tf.d.j(tf.d.i(), str)), 0, 0));
                            }
                        }
                    }
                    tf.e eVar2 = new tf.e(parse, u12, "/player_" + this.v0.f1());
                    eVar2.e = z12;
                    eVar2.f = x12;
                    eVar2.h = lVar;
                    return new mi.z3(new tf.f(eVar2));
                }
            }
            m51 m51Var = this.F0;
            if (m51Var != null) {
                return m51Var.Q(a1.g.r(new StringBuilder(), F0 != null ? F0.id : this.v0.f1(), ""), z12, x12);
            }
            m51 m51Var2 = this.j0;
            if (m51Var2 != null) {
                return m51Var2.Q(a1.g.r(new StringBuilder(), F0 != null ? F0.id : this.v0.f1(), ""), z12, x12);
            }
        }
        return null;
    }

    public final void z0() {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i3) {
    }
}
