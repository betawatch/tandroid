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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.u61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class MediaController implements AudioManager.OnAudioFocusChangeListener, us, SensorEventListener {
    public static final String[] U1;
    public static final String[] V1;
    public static final ConcurrentHashMap W1;
    public static Runnable X1;
    public static we Y1;
    public static we Z1;
    public static ArrayList a2;
    public static ArrayList b2;
    public static fe c2;
    public static volatile MediaController d2;
    public static long e2;
    public static boolean f2;
    public boolean A0;
    public int A1;
    public boolean B0;
    public boolean B1;
    public e2.a0 C0;
    public int C1;
    public int D;
    public cf.a D0;
    public boolean D1;
    public int E;
    public u61 E0;
    public e0.h E1;
    public int F;
    public boolean F0;
    public xd F1;
    public long G;
    public TextureView G0;
    public boolean G1;
    public PipRoundVideoView H0;
    public boolean H1;
    public boolean I;
    public int I0;
    public boolean I1;
    public boolean J;
    public LaunchActivity J0;
    public ki.g J1;
    public View K0;
    public rd K1;
    public boolean L;
    public org.telegram.ui.k4 L0;
    public final r5 L1;
    public boolean M;
    public boolean M0;
    public final r5 M1;
    public boolean N;
    public FrameLayout N0;
    public final mg.c2 N1;
    public boolean O;
    public float O0;
    public float O1;
    public boolean P;
    public boolean P0;
    public ValueAnimator P1;
    public float Q;
    public pp Q0;
    public final bg.o Q1;
    public androidx.emoji2.text.j R1;
    public boolean S1;
    public gf T1;
    public int U;
    public int U0;
    public boolean V;
    public boolean V0;
    public boolean W;
    public boolean X0;
    public boolean Y;
    public long Y0;
    public int Z0;
    public jf a0;
    public SensorManager c;
    public boolean c1;
    public PowerManager.WakeLock d;
    public boolean d0;
    public AudioRecord d1;
    public Sensor e;
    public ArrayList e0;
    public TLRPC.TL_document e1;
    public Sensor f;
    public SparseArray f0;
    public int g1;
    public Sensor h;
    public File h1;
    public File i1;
    public long j1;
    public int k1;
    public boolean l0;
    public long l1;
    public int m0;
    public long m1;
    public Sensor n;
    public String n0;
    public long n1;
    public long o0;
    public oj o1;
    public jj p1;
    public jj q1;
    public boolean r;
    public TL_stories.StoryItem r1;
    public org.telegram.ui.un s;
    public sw s1;
    public float t0;
    public jj u0;
    public long u1;
    public jj v0;
    public boolean w;
    public df w0;
    public long x;
    public boolean x0;
    public final ByteBuffer x1;
    public int y;
    public final pd a = new AudioManager.OnAudioFocusChangeListener() { // from class: org.telegram.messenger.pd
        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public final void onAudioFocusChange(int i10) {
            MediaController mediaController = MediaController.this;
            if (i10 != 1) {
                mediaController.V = false;
            } else {
                String[] strArr = MediaController.U1;
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
    public u61 i0 = null;
    public u61 j0 = null;
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
    public final int[] a1 = {ConnectionsManager.DEFAULT_DATACENTER_ID, ConnectionsManager.DEFAULT_DATACENTER_ID};
    public final re b1 = new re(this);
    public int f1 = -1;
    public short[] t1 = new short[1024];
    public final Object v1 = new Object();
    public final ArrayList w1 = new ArrayList();
    public int y1 = 1280;
    public int z1 = 48000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        U1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i10 > 28 ? "date_modified" : "datetaken", "orientation", "width", "height", "_size"};
        V1 = new String[]{"_id", "bucket_id", "bucket_display_name", "_data", i10 > 28 ? "date_modified" : "datetaken", "duration", "width", "height", "_size"};
        W1 = new ConcurrentHashMap();
        a2 = new ArrayList();
        b2 = new ArrayList();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [org.telegram.messenger.pd] */
    public MediaController() {
        int i10 = 4;
        this.N1 = new mg.c2(this, i10);
        this.Q1 = new bg.o(this, i10);
        r5 r5Var = new r5("recordQueue");
        this.L1 = r5Var;
        r5Var.setPriority(10);
        r5 r5Var2 = new r5("fileEncodingQueue");
        this.M1 = r5Var2;
        r5Var2.setPriority(10);
        r5Var.c(new qd(this, 0));
        Utilities.e.c(new qd(this, 1));
        this.x1 = ByteBuffer.allocateDirect(1920);
        i0.g3(new qd(this, 2));
        ContentResolver contentResolver = w0.b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.g2(null, 1));
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.g2(null, 2));
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.g2(null, 1));
        } catch (Exception e10) {
            f8.g(e10, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new com.google.android.gms.internal.clearcut.g2(null, 2));
        } catch (Exception e11) {
            f8.g(e11, true);
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
                        Cursor query = w0.b.getContentResolver().query(uri2, new String[]{"_display_name"}, null, null, null);
                        try {
                            if (query.moveToFirst()) {
                                str = query.getString(query.getColumnIndex("_display_name"));
                            }
                            query.close();
                        } finally {
                        }
                    } catch (Exception e) {
                        e = e;
                        f8.g(e, true);
                        if (str == null) {
                        }
                    }
                } catch (Exception e7) {
                    e = e7;
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
        } catch (Exception e10) {
            f8.g(e10, true);
            return "";
        }
    }

    public static MediaController B() {
        MediaController mediaController;
        MediaController mediaController2 = d2;
        if (mediaController2 != null) {
            return mediaController2;
        }
        synchronized (MediaController.class) {
            try {
                mediaController = d2;
                if (mediaController == null) {
                    mediaController = new MediaController();
                    d2 = mediaController;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaController;
    }

    public static int E(String str) {
        int i10;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i10 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e) {
            f8.g(e, true);
            i10 = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
        return i10;
    }

    public static boolean G(Uri uri) {
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = w0.b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[3];
                    if (inputStream.read(bArr, 0, 3) == 3) {
                        if (new String(bArr).equalsIgnoreCase("gif")) {
                            try {
                                inputStream.close();
                                return true;
                            } catch (Exception e) {
                                f8.g(e, true);
                                return true;
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e10) {
                f8.g(e10, true);
                return false;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
            }
            throw th2;
        }
    }

    public static void H0(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String n10 = org.telegram.ui.Cells.f1.n(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = n10.getBytes("UTF-8");
        int length = bytes.length + bytes2.length + 2;
        if (length > 65535) {
            throw new IOException(i0.a.i(length, "XMP segment too large: "));
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read();
            int read2 = fileInputStream.read();
            if (read != 255 || read2 != 216) {
                throw new IOException("Not a JPEG: " + file);
            }
            outputStream.write(zs.e4);
            outputStream.write(zs.t3);
            outputStream.write(zs.e4);
            outputStream.write(zs.C3);
            outputStream.write((length >> 8) & zs.e4);
            outputStream.write(length & zs.e4);
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
                    inputStream = w0.b.getContentResolver().openInputStream(uri);
                    byte[] bArr = new byte[12];
                    if (inputStream.read(bArr, 0, 12) == 12) {
                        String lowerCase = new String(bArr).toLowerCase();
                        if (lowerCase.startsWith("riff")) {
                            if (lowerCase.endsWith("webp")) {
                                try {
                                    inputStream.close();
                                    return true;
                                } catch (Exception e) {
                                    f8.g(e, true);
                                    return true;
                                }
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Throwable th2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception e10) {
                        f8.g(e10, true);
                    }
                }
                throw th2;
            }
        } catch (Exception e11) {
            f8.g(e11, true);
        }
    }

    public static void O(int i10) {
        Thread thread = new Thread(new wd(i10, 0));
        thread.setPriority(1);
        thread.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int Q(int i10, int i11, int i12, int i13, int i14) {
        int i15;
        float f7;
        float f10 = 1.0f;
        if (Math.min(i13, i14) >= 1080) {
            i15 = 6800000;
        } else {
            if (Math.min(i13, i14) < 720) {
                if (Math.min(i13, i14) >= 480) {
                    i15 = 1000000;
                    f10 = 0.75f;
                    f7 = 0.9f;
                } else {
                    i15 = 750000;
                    f10 = 0.6f;
                    f7 = 0.7f;
                }
                int min = (int) (((int) (i12 / Math.min(i10 / i13, i11 / i14))) * f10);
                int E = (int) (((int) c3.i0.E(f7, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i14 * i13)));
                return i12 >= E ? min : min > i15 ? i15 : Math.max(min, E);
            }
            i15 = 2600000;
        }
        f7 = 1.0f;
        int min2 = (int) (((int) (i12 / Math.min(i10 / i13, i11 / i14))) * f10);
        int E2 = (int) (((int) c3.i0.E(f7, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i14 * i13)));
        if (i12 >= E2) {
        }
    }

    public static /* synthetic */ void a(MediaController mediaController, boolean z10) {
        mediaController.stopRecord();
        TLRPC.TL_document tL_document = mediaController.e1;
        File N = mediaController.N(mediaController.h1, mediaController.i1, tL_document);
        if (tL_document == null || N == null) {
            return;
        }
        i0.g3(new bi.n4(mediaController, N, z10, tL_document, 11));
    }

    public static void b(final MediaController mediaController, final int i10, final int i11, long j10, long j11, oj ojVar, jj jjVar, jj jjVar2, TL_stories.StoryItem storyItem, sw swVar) {
        String absolutePath;
        final int i12 = 0;
        if (mediaController.d1 != null) {
            i0.g3(new Runnable(mediaController) { // from class: org.telegram.messenger.zd
                public final /* synthetic */ MediaController b;

                {
                    this.b = mediaController;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i13 = i12;
                    int i14 = i11;
                    int i15 = i10;
                    MediaController mediaController2 = this.b;
                    switch (i13) {
                        case 0:
                            mediaController2.K1 = null;
                            zs.f(i15).k(zs.m2, Integer.valueOf(i14));
                            break;
                        case 1:
                            mediaController2.K1 = null;
                            zs.f(i15).k(zs.m2, Integer.valueOf(i14));
                            break;
                        case 2:
                            mediaController2.K1 = null;
                            zs.f(i15).k(zs.m2, Integer.valueOf(i14));
                            break;
                        default:
                            mediaController2.K1 = null;
                            zs.f(i15).k(zs.l2, Integer.valueOf(i14), Boolean.TRUE);
                            break;
                    }
                }
            });
            return;
        }
        final int i13 = 1;
        j0(true);
        mediaController.A1 = 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        mediaController.e1 = tL_document;
        mediaController.f1 = i11;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = TLObject.FLAG_31;
        tL_document.id = tz.p();
        mediaController.e1.user_id = d20.i(i10).e();
        TLRPC.TL_document tL_document2 = mediaController.e1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        tz.y();
        mediaController.i1 = new qe(b8.z(1), System.currentTimeMillis() + "_" + b8.r(null, mediaController.e1));
        b8.z(4).mkdirs();
        if (v2.a) {
            f8.b("start recording internal " + mediaController.i1.getPath() + " " + mediaController.i1.exists());
        }
        File file = mediaController.i1;
        Set set = c1.a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            c1.a.add(absolutePath);
        }
        try {
            if (mediaController.startRecord(mediaController.i1.getPath(), mediaController.z1) == 0) {
                i0.g3(new Runnable(mediaController) { // from class: org.telegram.messenger.zd
                    public final /* synthetic */ MediaController b;

                    {
                        this.b = mediaController;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i132 = i13;
                        int i14 = i11;
                        int i15 = i10;
                        MediaController mediaController2 = this.b;
                        switch (i132) {
                            case 0:
                                mediaController2.K1 = null;
                                zs.f(i15).k(zs.m2, Integer.valueOf(i14));
                                break;
                            case 1:
                                mediaController2.K1 = null;
                                zs.f(i15).k(zs.m2, Integer.valueOf(i14));
                                break;
                            case 2:
                                mediaController2.K1 = null;
                                zs.f(i15).k(zs.m2, Integer.valueOf(i14));
                                break;
                            default:
                                mediaController2.K1 = null;
                                zs.f(i15).k(zs.l2, Integer.valueOf(i14), Boolean.TRUE);
                                break;
                        }
                    }
                });
                if (v2.a) {
                    f8.b("cant init encoder");
                    return;
                }
                return;
            }
            mediaController.c1 = false;
            mediaController.d1 = new AudioRecord(0, mediaController.z1, 16, 2, mediaController.y1);
            System.currentTimeMillis();
            long j12 = 0;
            mediaController.j1 = 0L;
            mediaController.k1 = 0;
            mediaController.u1 = 0L;
            mediaController.l1 = j10;
            mediaController.n1 = j11;
            mediaController.o1 = ojVar;
            if (jjVar != null) {
                j12 = jj.c2(mediaController.g1, jjVar.k, false, false);
            }
            mediaController.m1 = j12;
            mediaController.g1 = i10;
            mediaController.p1 = jjVar2;
            mediaController.q1 = jjVar;
            mediaController.r1 = storyItem;
            mediaController.s1 = swVar;
            mediaController.x1.rewind();
            mediaController.d1.startRecording();
            mediaController.L1.c(mediaController.N1);
            final int i14 = 3;
            i0.g3(new Runnable(mediaController) { // from class: org.telegram.messenger.zd
                public final /* synthetic */ MediaController b;

                {
                    this.b = mediaController;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i132 = i14;
                    int i142 = i11;
                    int i15 = i10;
                    MediaController mediaController2 = this.b;
                    switch (i132) {
                        case 0:
                            mediaController2.K1 = null;
                            zs.f(i15).k(zs.m2, Integer.valueOf(i142));
                            break;
                        case 1:
                            mediaController2.K1 = null;
                            zs.f(i15).k(zs.m2, Integer.valueOf(i142));
                            break;
                        case 2:
                            mediaController2.K1 = null;
                            zs.f(i15).k(zs.m2, Integer.valueOf(i142));
                            break;
                        default:
                            mediaController2.K1 = null;
                            zs.f(i15).k(zs.l2, Integer.valueOf(i142), Boolean.TRUE);
                            break;
                    }
                }
            });
        } catch (Exception e) {
            f8.g(e, true);
            mediaController.e1 = null;
            mediaController.stopRecord();
            c1.b(mediaController.i1);
            mediaController.i1.delete();
            mediaController.i1 = null;
            File file2 = mediaController.h1;
            if (file2 != null) {
                file2.delete();
                mediaController.h1 = null;
            }
            try {
                mediaController.d1.release();
                mediaController.d1 = null;
            } catch (Exception e7) {
                f8.g(e7, true);
            }
            j0(false);
            final int i15 = 2;
            i0.g3(new Runnable(mediaController) { // from class: org.telegram.messenger.zd
                public final /* synthetic */ MediaController b;

                {
                    this.b = mediaController;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    int i132 = i15;
                    int i142 = i11;
                    int i152 = i10;
                    MediaController mediaController2 = this.b;
                    switch (i132) {
                        case 0:
                            mediaController2.K1 = null;
                            zs.f(i152).k(zs.m2, Integer.valueOf(i142));
                            break;
                        case 1:
                            mediaController2.K1 = null;
                            zs.f(i152).k(zs.m2, Integer.valueOf(i142));
                            break;
                        case 2:
                            mediaController2.K1 = null;
                            zs.f(i152).k(zs.m2, Integer.valueOf(i142));
                            break;
                        default:
                            mediaController2.K1 = null;
                            zs.f(i152).k(zs.l2, Integer.valueOf(i142), Boolean.TRUE);
                            break;
                    }
                }
            });
        }
    }

    public static /* synthetic */ void c(final MediaController mediaController, File file, File file2, final TLRPC.TL_document tL_document, final int i10, final boolean z10, final int i11, final boolean z11) {
        mediaController.stopRecord();
        final File N = mediaController.N(file, file2, tL_document);
        if (N == null) {
            if (v2.a) {
                f8.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (v2.a) {
            f8.b("stop recording internal in queue " + N.exists() + " " + N.length());
        }
        i0.g3(new Runnable() { // from class: org.telegram.messenger.he
            @Override // java.lang.Runnable
            public final void run() {
                boolean z12;
                char c10;
                int i12;
                String[] strArr = MediaController.U1;
                boolean z13 = v2.a;
                MediaController mediaController2 = MediaController.this;
                File file3 = N;
                if (z13) {
                    StringBuilder sb2 = new StringBuilder("stop recording internal ");
                    sb2.append(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController2.j1 + " writedFrames" + mediaController2.k1);
                    f8.b(sb2.toString());
                }
                if (!file3.exists()) {
                    f8.g(new RuntimeException("file not found :( recordTimeCount " + mediaController2.j1 + " writedFrames" + mediaController2.k1), true);
                }
                ui.b0(mediaController2.g1).B1(mediaController2.l1, mediaController2.m1, null);
                int currentTime = ConnectionsManager.getInstance(mediaController2.g1).getCurrentTime();
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
                long j10 = mediaController2.j1;
                tL_documentAttributeAudio.duration = j10 / 1000.0d;
                tL_document2.attributes.clear();
                tL_document2.attributes.add(tL_documentAttributeAudio);
                if (j10 > 700) {
                    int i13 = i10;
                    if (i13 == 1) {
                        c10 = 1;
                        i12 = 2;
                        oz f7 = oz.f(tL_document2, null, file3.getAbsolutePath(), mediaController2.l1, mediaController2.p1, mediaController2.q1, null, null, null, null, z10, i11, 0, z11 ? Integer.MAX_VALUE : 0, null, null, false);
                        f7.R = mediaController2.n1;
                        f7.T = mediaController2.o1;
                        f7.H = mediaController2.r1;
                        f7.K = mediaController2.s1;
                        f7.Q = 0L;
                        qz.C(mediaController2.g1).r0(f7);
                    } else {
                        c10 = 1;
                        i12 = 2;
                    }
                    zs f10 = zs.f(mediaController2.g1);
                    Integer valueOf = Integer.valueOf(mediaController2.f1);
                    if (i13 != i12) {
                        tL_document2 = null;
                    }
                    String absolutePath = i13 == i12 ? file3.getAbsolutePath() : null;
                    Object[] objArr = new Object[3];
                    z12 = false;
                    objArr[0] = valueOf;
                    objArr[c10] = tL_document2;
                    objArr[i12] = absolutePath;
                    f10.k(zs.s2, objArr);
                } else {
                    z12 = false;
                    zs.f(mediaController2.g1).k(zs.t2, Integer.valueOf(mediaController2.f1), Boolean.FALSE, Integer.valueOf((int) j10));
                    c1.b(file3);
                    file3.delete();
                }
                mediaController2.Y(z12);
            }
        });
    }

    public static native boolean cropOpusFile(String str, String str2, long j10, long j11);

    public static void d(MediaController mediaController) {
        mediaController.h1 = mediaController.i1;
        pe peVar = new pe(1, b8.z(1), System.currentTimeMillis() + "_" + b8.r(null, mediaController.e1));
        mediaController.i1 = peVar;
        if (mediaController.startRecord(peVar.getPath(), mediaController.z1) != 0) {
            i0.g3(new qd(mediaController, 8));
            return;
        }
        i0.g3(new qd(mediaController, 7));
        if (v2.a) {
            f8.b("cant resume audio encoder");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void d0(String str, Context context, int i10, String str2, String str3, q20 q20Var) {
        File file;
        org.telegram.ui.ActionBar.x1 x1Var;
        if (str == null || context == null) {
            return;
        }
        int i11 = 0;
        if (!TextUtils.isEmpty(str)) {
            File file2 = new File(str);
            if (file2.exists() && !i0.I1(Uri.fromFile(file2), 0)) {
                file = file2;
                if (file != null) {
                    return;
                }
                boolean[] zArr = {false};
                if (file.exists()) {
                    boolean[] zArr2 = new boolean[1];
                    if (i10 != 0) {
                        try {
                            org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(2, context, null);
                            x1Var2.n(cd.L0(2131748789, null));
                            x1Var2.setCanceledOnTouchOutside(false);
                            x1Var2.setCancelable(true);
                            x1Var2.setOnCancelListener(new ae(zArr, i11));
                            i0.h3(new be(zArr2, x1Var2, i11), 250L);
                            x1Var = x1Var2;
                        } catch (Exception e) {
                            f8.g(e, true);
                        }
                        new Thread(new ce(i10, file, str2, x1Var, zArr, str3, q20Var, zArr2)).start();
                        return;
                    }
                    x1Var = null;
                    new Thread(new ce(i10, file, str2, x1Var, zArr, str3, q20Var, zArr2)).start();
                    return;
                }
                return;
            }
        }
        file = null;
        if (file != null) {
        }
    }

    public static void e0(String str, String str2, Context context, q20 q20Var) {
        org.telegram.ui.ActionBar.x1 x1Var;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            return;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists() || !file2.exists()) {
            d0(str, context, 0, null, null, q20Var);
            return;
        }
        if (i0.I1(Uri.fromFile(file), 0) || i0.I1(Uri.fromFile(file2), 0)) {
            return;
        }
        int i10 = 1;
        boolean[] zArr = {false};
        boolean[] zArr2 = new boolean[1];
        try {
            org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(2, context, null);
            x1Var2.n(cd.L0(2131748789, null));
            x1Var2.setCanceledOnTouchOutside(false);
            x1Var2.setCancelable(true);
            x1Var2.setOnCancelListener(new ae(zArr, i10));
            i0.h3(new be(zArr2, x1Var2, i10), 250L);
            x1Var = x1Var2;
        } catch (Exception e) {
            f8.g(e, true);
            x1Var = null;
        }
        new Thread(new ek(file, file2, zArr, q20Var, x1Var, zArr2)).start();
    }

    public static void f(MediaController mediaController, jj jjVar, int[] iArr, boolean z10, boolean z11, int i10) {
        jj jjVar2;
        re reVar = mediaController.b1;
        if (mediaController.E0 == null) {
            return;
        }
        if (i10 == 4 || i10 == 1) {
            try {
                mediaController.J0.getWindow().clearFlags(128);
            } catch (Exception e) {
                f8.g(e, true);
            }
        } else {
            try {
                mediaController.J0.getWindow().addFlags(128);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
        }
        if (i10 == 3) {
            mediaController.F0 = true;
            jj jjVar3 = mediaController.u0;
            if (jjVar3 != null && (jj.L4(jjVar3.k) || mediaController.u0.h4())) {
                i0.r(reVar);
                b8.G(jjVar.I1).a0(mediaController.u0.F0(), true, false);
            }
            mediaController.P0 = true;
            return;
        }
        if (i10 == 2) {
            if (!z11 || (jjVar2 = mediaController.u0) == null) {
                return;
            }
            if (jj.L4(jjVar2.k) || mediaController.u0.h4()) {
                if (mediaController.F0) {
                    reVar.run();
                    return;
                } else {
                    i0.h3(reVar, 1000L);
                    return;
                }
            }
            return;
        }
        if (mediaController.E0.d0() && i10 == 4) {
            jj jjVar4 = mediaController.u0;
            if (jjVar4 == null || !jj.L4(jjVar4.k) || z10 || (iArr != null && iArr[0] >= 4)) {
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

    public static Uri f0(int i10, File file, String str) {
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String D = b8.D(file);
            String mimeTypeFromExtension = D != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(D) : null;
            if ((i10 == 0 || i10 == 1) && mimeTypeFromExtension != null) {
                if (mimeTypeFromExtension.startsWith("image")) {
                    i10 = 0;
                }
                if (mimeTypeFromExtension.startsWith(MediaStreamTrack.VIDEO_TRACK_KIND)) {
                    i10 = 1;
                }
            }
            if (i10 == 0) {
                if (str == null) {
                    str = i0.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", mimeTypeFromExtension);
            } else if (i10 == 1) {
                if (str == null) {
                    str = i0.p0(1, D);
                }
                contentValues.put("relative_path", new File(Environment.DIRECTORY_MOVIES, "Telegram") + File.separator);
                contentUri = MediaStore.Video.Media.getContentUri("external_primary");
                contentValues.put("_display_name", str);
            } else if (i10 == 2) {
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
            Uri insert = w0.b.getContentResolver().insert(contentUri, contentValues);
            if (insert != null) {
                FileInputStream fileInputStream = new FileInputStream(file);
                i0.D(fileInputStream, w0.b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static void g0(Context context, c cVar, ArrayList arrayList, bs bsVar) {
        if (arrayList.isEmpty()) {
            return;
        }
        cf cfVar = new cf();
        cfVar.d = new HashMap();
        cfVar.a = cVar;
        cfVar.c = arrayList;
        cfVar.s = bsVar;
        cfVar.w = ((jj) arrayList.get(0)).I3();
        int i10 = cVar.a;
        zs.f(i10).b(cfVar, zs.Y1);
        zs.f(i10).b(cfVar, zs.X1);
        zs.f(i10).b(cfVar, zs.Z1);
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(2, context, PhotoViewer.v1().U1() ? new th.b() : null);
        cfVar.b = x1Var;
        x1Var.n(cd.L0(2131748789, null));
        x1Var.setCancelable(true);
        x1Var.H = true;
        x1Var.setOnCancelListener(new ae(cfVar, 3));
        i0.h3(new bf(cfVar, 1), 250L);
        new Thread(new bf(cfVar, 2)).start();
    }

    public static native byte[] getWaveform(String str);

    public static native int isOpusFile(String str);

    public static void j0(boolean z10) {
        AudioManager audioManager = (AudioManager) w0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (tz.u0 && !w7.c6.d("android.permission.BLUETOOTH_CONNECT")) {
            tz.u0 = false;
            tz.y();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && tz.u0) && z10) {
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
                f8.g(th2, true);
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

    public static boolean s0(int i10) {
        mi.a aVar = mi.e.b;
        aVar.a();
        if (!aVar.c) {
            return !((j0) vp.r1(i10).y7.f0.b).c;
        }
        aVar.a();
        return aVar.d;
    }

    private native int startRecord(String str, int i10);

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
    
        org.telegram.messenger.f8.g(r0, true);
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
        int i10;
        String absolutePath;
        int i11 = 0;
        try {
            String q6 = b8.q(A(uri));
            if (q6 == null) {
                int p5 = tz.p();
                tz.y();
                Locale locale = Locale.US;
                q6 = p5 + "." + str;
            }
            file = i0.g1();
            try {
                file.mkdirs();
                if (!i0.I1(Uri.fromFile(file), 0)) {
                    int i12 = 0;
                    do {
                        File g12 = i0.g1();
                        if (i12 == 0) {
                            file2 = new File(g12, q6);
                        } else {
                            int lastIndexOf = q6.lastIndexOf(".");
                            if (lastIndexOf > 0) {
                                file = new File(g12, q6.substring(0, lastIndexOf) + " (" + i12 + ")" + q6.substring(lastIndexOf));
                                i12++;
                            } else {
                                file2 = new File(g12, q6 + " (" + i12 + ")");
                            }
                        }
                        file = file2;
                        i12++;
                    } while (file.exists());
                    inputStream = w0.b.getContentResolver().openInputStream(uri);
                    try {
                        if (inputStream instanceof FileInputStream) {
                            try {
                                if (i0.I1(null, ((Integer) FileDescriptor.class.getDeclaredMethod("getInt$", null).invoke(((FileInputStream) inputStream).getFD(), null)).intValue())) {
                                    try {
                                        inputStream.close();
                                    } catch (Exception e) {
                                        f8.g(e, true);
                                    }
                                    if (j10 > 0) {
                                    }
                                }
                            } catch (Throwable th3) {
                                f8.g(th3, true);
                            }
                        }
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            try {
                                byte[] bArr = new byte[20480];
                                i10 = 0;
                                while (true) {
                                    try {
                                        int read = inputStream.read(bArr);
                                        if (read == -1) {
                                            break;
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                        i10 += read;
                                        if (j10 > 0) {
                                            long j11 = i10;
                                            if (j11 > j10) {
                                                try {
                                                    inputStream.close();
                                                } catch (Exception e7) {
                                                    f8.g(e7, true);
                                                }
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception e10) {
                                                    f8.g(e10, true);
                                                }
                                                if (j10 > 0) {
                                                }
                                            }
                                        }
                                    } catch (Exception e11) {
                                        e = e11;
                                        i11 = i10;
                                        f8.g(e, true);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception e12) {
                                                f8.g(e12, true);
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Exception e13) {
                                                f8.g(e13, true);
                                            }
                                        }
                                        if (j10 > 0) {
                                        }
                                        return null;
                                    } catch (Throwable th4) {
                                        th2 = th4;
                                        i11 = i10;
                                        if (inputStream != null) {
                                        }
                                        if (fileOutputStream != null) {
                                        }
                                        if (j10 <= 0) {
                                        }
                                    }
                                }
                            } catch (Exception e14) {
                                e = e14;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            th2 = th;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (Exception e15) {
                                    f8.g(e15, true);
                                }
                            }
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (Exception e16) {
                                    f8.g(e16, true);
                                }
                            }
                            if (j10 <= 0) {
                                throw th2;
                            }
                            if (i11 <= j10) {
                                throw th2;
                            }
                            file.delete();
                            throw th2;
                        }
                    } catch (Exception e17) {
                        e = e17;
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
            } catch (Exception e18) {
                e = e18;
                inputStream = null;
                fileOutputStream = null;
            } catch (Throwable th7) {
                th = th7;
                inputStream = null;
                fileOutputStream = null;
            }
        } catch (Exception e19) {
            e = e19;
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
        if (j10 > 0 && i10 > j10) {
            file.delete();
        }
        return absolutePath;
        try {
            fileOutputStream.close();
        } catch (Exception e20) {
            f8.g(e20, true);
        }
        if (j10 > 0) {
            file.delete();
        }
        return absolutePath;
    }

    public static File u(String str) {
        File file;
        try {
            File g12 = i0.g1();
            g12.mkdirs();
            if (i0.I1(Uri.fromFile(g12), 0)) {
                return null;
            }
            int i10 = 0;
            do {
                File g13 = i0.g1();
                if (i10 == 0) {
                    file = new File(g13, str);
                } else {
                    int lastIndexOf = str.lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        file = new File(g13, str.substring(0, lastIndexOf) + " (" + i10 + ")" + str.substring(lastIndexOf));
                    } else {
                        file = new File(g13, str + " (" + i10 + ")");
                    }
                }
                i10++;
            } while (file.exists());
            return file;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int v(int i10, int i11, int i12, boolean z10) {
        MediaCodec createEncoderByType;
        String str = i10 + "" + i11 + "" + i12;
        ConcurrentHashMap concurrentHashMap = W1;
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
                    return i12;
                }
            }
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", i10, i11);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("max-bitrate", i12);
            createVideoFormat.setInteger("bitrate", i12);
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
        MediaFormat createVideoFormat2 = MediaFormat.createVideoFormat("video/avc", i10, i11);
        createVideoFormat2.setInteger("color-format", 2130708361);
        createVideoFormat2.setInteger("max-bitrate", i12);
        createVideoFormat2.setInteger("bitrate", i12);
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
        for (int i10 = 0; i10 < trackCount; i10++) {
            String string = mediaExtractor.getTrackFormat(i10).getString("mime");
            if (z10) {
                if (string.startsWith("audio/")) {
                    return i10;
                }
            } else {
                if (string.startsWith("video/")) {
                    return i10;
                }
            }
        }
        return -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int writeFrame(ByteBuffer byteBuffer, int i10);

    public static boolean y() {
        try {
            for (AudioDeviceInfo audioDeviceInfo : ot.o0.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            f8.g(e, true);
            return false;
        }
    }

    public final void A0(org.telegram.ui.un unVar, boolean z10, boolean z11) {
        if (this.O) {
            this.O = false;
            return;
        }
        if (z11) {
            if (this.e1 == null || K()) {
                B0(z10 ? 2 : 0, 0, false, false);
            } else {
                D0(false);
            }
        }
        if (!this.P || this.O) {
            return;
        }
        if ((this.f == null && this.n == null) || this.e == null || this.s != unVar) {
            return;
        }
        this.s = null;
        this.P = false;
        this.w = false;
        this.I = false;
        this.r = false;
        this.L = false;
        Utilities.e.c(new qd(this, 5));
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.d.release();
    }

    public final void B0(final int i10, final int i11, final boolean z10, final boolean z11) {
        e0.h hVar;
        if (!this.G1) {
            rd rdVar = this.K1;
            r5 r5Var = this.L1;
            if (rdVar != null) {
                r5Var.a(rdVar);
                this.K1 = null;
            }
            r5Var.c(new Runnable() { // from class: org.telegram.messenger.ke
                @Override // java.lang.Runnable
                public final void run() {
                    MediaController mediaController = MediaController.this;
                    int i12 = mediaController.A1;
                    int i13 = i10;
                    boolean z12 = z10;
                    int i14 = i11;
                    boolean z13 = z11;
                    if (i12 == 3) {
                        mediaController.A1 = 0;
                        mediaController.C0(i13, i14, z12, z13);
                        return;
                    }
                    AudioRecord audioRecord = mediaController.d1;
                    if (audioRecord == null) {
                        mediaController.e1 = null;
                        mediaController.x0 = false;
                        mediaController.r = false;
                        mediaController.O = false;
                        return;
                    }
                    try {
                        mediaController.A1 = i13;
                        mediaController.B1 = z12;
                        mediaController.C1 = i14;
                        mediaController.D1 = z13;
                        audioRecord.stop();
                        MediaController.j0(false);
                    } catch (Exception e) {
                        f8.g(e, true);
                        if (mediaController.i1 != null) {
                            if (v2.a) {
                                f8.d("delete voice file");
                            }
                            mediaController.i1.delete();
                        }
                    }
                    if (i13 == 0) {
                        mediaController.C0(0, 0, false, false);
                    }
                    try {
                        mediaController.K0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    i0.g3(new ud(mediaController, i13, 0));
                }
            });
            return;
        }
        ki.g gVar = this.J1;
        if (gVar != null) {
            this.J1 = null;
            if (i10 == 0) {
                x(false);
                return;
            }
            this.A1 = i10;
            this.B1 = z10;
            this.C1 = i11;
            this.D1 = z11;
            s(gVar);
            return;
        }
        if (this.H1) {
            if (this.A1 == 3) {
                this.A1 = i10;
                this.B1 = z10;
                this.C1 = i11;
                this.D1 = z11;
                if (i10 == 0) {
                    e0.h hVar2 = this.E1;
                    if (hVar2 != null) {
                        hVar2.b = false;
                        ((ki.k) hVar2.e).b();
                    }
                    x(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 2 && (hVar = this.E1) != null && hVar.e()) {
            this.x0 = false;
            this.r = false;
            this.O = false;
            return;
        }
        xd xdVar = this.F1;
        if (xdVar != null) {
            i0.r(xdVar);
            this.F1 = null;
        }
        this.H1 = true;
        this.A1 = i10;
        this.B1 = z10;
        this.C1 = i11;
        this.D1 = z11;
        e0.h hVar3 = this.E1;
        if (hVar3 == null) {
            x(false);
        } else {
            ki.k kVar = (ki.k) hVar3.e;
            if (i10 == 0) {
                hVar3.b = false;
                kVar.b();
                x(false);
            } else {
                hVar3.b = true;
                kVar.getClass();
                ki.k.q();
                int i12 = kVar.e().a;
                if (hVar3.b && (i12 == 3 || i12 == 5)) {
                    hVar3.b = false;
                    kVar.h();
                }
            }
        }
        try {
            this.K0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        final int i13 = this.g1;
        final int i14 = this.f1;
        i0.g3(new Runnable() { // from class: org.telegram.messenger.vd
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = MediaController.U1;
                zs.f(i13).k(zs.n2, Integer.valueOf(i14), Integer.valueOf(i10 == 2 ? 1 : 0));
            }
        });
    }

    public final float C(boolean z10) {
        return z10 ? this.q0 : this.p0;
    }

    public final void C0(int i10, int i11, boolean z10, boolean z11) {
        MediaController mediaController;
        File file;
        if (i10 == 0 || (file = this.i1) == null) {
            mediaController = this;
            c1.b(mediaController.i1);
            File file2 = mediaController.i1;
            if (file2 != null) {
                file2.delete();
            }
            Y(false);
        } else {
            TLRPC.TL_document tL_document = this.e1;
            File file3 = this.h1;
            if (v2.a) {
                f8.b("stop recording internal filename " + this.i1.getPath());
            }
            mediaController = this;
            mediaController.M1.c(new ee(mediaController, file3, file, tL_document, i10, z10, i11, z11));
        }
        try {
            AudioRecord audioRecord = mediaController.d1;
            if (audioRecord != null) {
                audioRecord.release();
                mediaController.d1 = null;
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        mediaController.e1 = null;
        mediaController.h1 = null;
        mediaController.i1 = null;
        mediaController.x0 = false;
        mediaController.r = false;
        mediaController.O = false;
    }

    public final long D(jj jjVar) {
        jj jjVar2 = this.u0;
        if ((this.i0 != null || this.E0 != null) && jjVar != null && jjVar2 != null && L(jjVar)) {
            try {
                u61 u61Var = this.i0;
                if (u61Var != null) {
                    return u61Var.S();
                }
                u61 u61Var2 = this.E0;
                if (u61Var2 != null) {
                    return u61Var2.S();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void D0(boolean z10) {
        if (!this.G1) {
            this.L1.c(new sd(this, z10, 0));
            return;
        }
        this.I1 = z10;
        e0.h hVar = this.E1;
        if (hVar != null) {
            if (hVar.e()) {
                Y(true);
                j0(true);
            }
            e0.h hVar2 = this.E1;
            ki.k kVar = (ki.k) hVar2.e;
            kVar.getClass();
            ki.k.q();
            int i10 = kVar.e().a;
            if (i10 == 3) {
                ((ki.k) hVar2.e).n();
                return;
            }
            if (i10 == 5) {
                ki.k kVar2 = (ki.k) hVar2.e;
                kVar2.getClass();
                ki.k.q();
                if (kVar2.G != 5) {
                    return;
                }
                kVar2.h.b("resume requested: trim=" + kVar2.r + ".." + kVar2.s + ", sourceDurationMs=" + kVar2.j());
                kVar2.p();
                kVar2.s(6);
                ki.j jVar = kVar2.z;
                if (jVar == null) {
                    kVar2.g(new IllegalStateException("Output generation is missing"));
                    return;
                }
                long j10 = kVar2.r;
                long j11 = kVar2.s;
                boolean z11 = j11 >= ki.k.r(kVar2.p);
                kVar2.k(1);
                long j12 = ((j11 - j10) * 48000) / 1000;
                kVar2.p = j12;
                kVar2.r = 0L;
                kVar2.s = ki.k.r(j12);
                kVar2.d();
                kVar2.h.b("resume prefix selected: source=" + jVar.b.getName() + ", trim=" + j10 + ".." + j11);
                File file = jVar.b;
                if (z11) {
                    j11 = -1;
                }
                kVar2.u(j10, j11, file);
            }
        }
    }

    public final boolean E0(int i10, ArrayList arrayList) {
        jj jjVar;
        int i11;
        jj jjVar2;
        int i12 = this.U0;
        boolean z10 = ConnectionsManager.getInstance(d20.s0).getConnectionState() == 2;
        this.U0 += i10;
        if (z10) {
            while (this.U0 < arrayList.size() && (i11 = this.U0) >= 0 && ((jjVar2 = (jj) arrayList.get(i11)) == null || !jjVar2.x0)) {
                this.U0 += i10;
            }
        }
        if (this.U0 < arrayList.size() && this.U0 >= 0) {
            return false;
        }
        this.U0 = this.U0 >= arrayList.size() ? 0 : arrayList.size() - 1;
        if (z10) {
            while (true) {
                int i13 = this.U0;
                if (i13 < 0 || i13 >= arrayList.size()) {
                    break;
                }
                int i14 = this.U0;
                if (i10 > 0) {
                    if (i14 > i12) {
                        break;
                    }
                    jjVar = (jj) arrayList.get(this.U0);
                    if (jjVar == null && jjVar.x0) {
                        break;
                    }
                    this.U0 += i10;
                } else {
                    if (i14 < i12) {
                        break;
                    }
                    jjVar = (jj) arrayList.get(this.U0);
                    if (jjVar == null) {
                    }
                    this.U0 += i10;
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
        jj jjVar = this.u0;
        return jjVar == null || !(jj.R4(jjVar.k) || this.u0.h4()) || (arrayList = this.e0) == null || arrayList.size() <= 1 || !this.e0.contains(this.u0) || this.e0.indexOf(this.u0) >= this.e0.size() - 1;
    }

    public final void F0() {
        jj jjVar = this.u0;
        if (jjVar != null && H() && this.h0 && (jj.R4(jjVar.k) || jjVar.I3())) {
            S(jjVar);
        }
        this.h0 = false;
    }

    public final void G0(File file, long j10, byte[] bArr) {
        TLRPC.TL_document tL_document = this.e1;
        if (tL_document == null) {
            return;
        }
        tL_document.date = ConnectionsManager.getInstance(this.g1).getCurrentTime();
        this.e1.size = (int) file.length();
        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
        tL_documentAttributeAudio.voice = true;
        tL_documentAttributeAudio.waveform = bArr;
        if (bArr != null) {
            tL_documentAttributeAudio.flags |= 4;
        }
        tL_documentAttributeAudio.duration = j10 / 1000.0d;
        this.e1.attributes.clear();
        this.e1.attributes.add(tL_documentAttributeAudio);
    }

    public final boolean H() {
        return this.g0 || this.A0;
    }

    public final boolean I(jj jjVar) {
        jj jjVar2;
        boolean z10;
        if (jjVar != null && jjVar.h2) {
            return false;
        }
        if ((this.i0 == null && this.E0 == null) || jjVar == null || (jjVar2 = this.u0) == null) {
            return false;
        }
        long j10 = jjVar2.T;
        if (j10 != 0 && j10 == jjVar.T) {
            z10 = this.A0;
        } else {
            if (!L(jjVar)) {
                return false;
            }
            z10 = this.A0;
        }
        return !z10;
    }

    public final boolean J() {
        return (this.K1 == null && this.F1 == null && this.e1 == null) ? false : true;
    }

    public final boolean K() {
        if (!this.G1) {
            return this.c1;
        }
        e0.h hVar = this.E1;
        return hVar != null && hVar.e();
    }

    public final boolean L(jj jjVar) {
        jj jjVar2 = this.u0;
        if (jjVar2 != null && jj.B0(jjVar2.k) == jj.B0(jjVar.k) && this.u0.f1() == jjVar.f1()) {
            if ((this.u0.T == 0) == (jjVar.T == 0)) {
                return true;
            }
        }
        return false;
    }

    public final File N(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            oe oeVar = new oe(b8.z(1), System.currentTimeMillis() + "_" + b8.r(null, tL_document));
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), oeVar.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.i1) {
                    this.i1 = oeVar;
                }
                file2 = oeVar;
            }
            file.delete();
            if (file == this.h1) {
                this.h1 = null;
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
        jj jjVar;
        int i10;
        long j10;
        long j11;
        long j12;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
        pp ppVar = this.Q0;
        if (ppVar != null) {
            ppVar.b();
            return;
        }
        if (this.X0 || (jjVar = this.u0) == null || jjVar.p1 || o5.C(jj.B0(jjVar.k)) || (i10 = this.Z0) == 0) {
            return;
        }
        e2.a0 a0Var = this.C0;
        if (a0Var == null) {
            boolean[] zArr = this.W0;
            boolean z10 = zArr[0];
            int[] iArr = this.a1;
            if (!z10) {
                this.X0 = true;
                ui.b0(c.a(this.u0.I1).a).N0(jj.B0(this.u0.k), 50, iArr[0], 0, 4, 0L, 1, this.Z0, 0, null, null);
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
        int i11 = ((jj) arrayList.get(0)).I1;
        if (this.C0.a != 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            e2.a0 a0Var2 = this.C0;
            tL_messages_search.q = (String) a0Var2.h;
            tL_messages_search.limit = 20;
            zf.e0 e0Var = (zf.e0) a0Var2.i;
            tL_messages_search.filter = e0Var == null ? new TLRPC.TL_inputMessagesFilterEmpty() : e0Var.e;
            tL_messages_search.peer = vp.r1(c.a(i11).a).i1(this.C0.a);
            tL_messages_search.offset_id = ((jj) i0.a.g(1, arrayList)).f1();
            e2.a0 a0Var3 = this.C0;
            long j13 = a0Var3.b;
            if (j13 > 0) {
                tL_messages_search.min_date = (int) (j13 / 1000);
            }
            long j14 = a0Var3.c;
            tL_messages_searchGlobal = tL_messages_search;
            if (j14 > 0) {
                tL_messages_search.min_date = (int) (j14 / 1000);
                tL_messages_searchGlobal = tL_messages_search;
            }
        } else {
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal2.limit = 20;
            e2.a0 a0Var4 = this.C0;
            tL_messages_searchGlobal2.q = (String) a0Var4.h;
            tL_messages_searchGlobal2.filter = ((zf.e0) a0Var4.i).e;
            jj jjVar2 = (jj) i0.a.g(1, arrayList);
            tL_messages_searchGlobal2.offset_id = jjVar2.f1();
            e2.a0 a0Var5 = this.C0;
            tL_messages_searchGlobal2.offset_rate = a0Var5.f;
            tL_messages_searchGlobal2.flags |= 1;
            tL_messages_searchGlobal2.folder_id = a0Var5.g;
            TLRPC.Peer peer = jjVar2.k.peer_id;
            long j15 = peer.channel_id;
            if (j15 == 0) {
                j15 = peer.chat_id;
                if (j15 == 0) {
                    j10 = peer.user_id;
                    tL_messages_searchGlobal2.offset_peer = vp.r1(i11).i1(j10);
                    e2.a0 a0Var6 = this.C0;
                    j11 = a0Var6.b;
                    if (j11 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j11 / 1000);
                    }
                    j12 = a0Var6.c;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    if (j12 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j12 / 1000);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
            }
            j10 = -j15;
            tL_messages_searchGlobal2.offset_peer = vp.r1(i11).i1(j10);
            e2.a0 a0Var62 = this.C0;
            j11 = a0Var62.b;
            if (j11 > 0) {
            }
            j12 = a0Var62.c;
            tL_messages_searchGlobal = tL_messages_searchGlobal2;
            if (j12 > 0) {
            }
        }
        this.X0 = true;
        ConnectionsManager.getInstance(i11).sendRequest(tL_messages_searchGlobal, new de(this, i10, i11, 0));
    }

    public final boolean R(jj jjVar, boolean z10) {
        if ((this.i0 != null || this.E0 != null) && jjVar != null && this.u0 != null && L(jjVar)) {
            z0();
            try {
                if (this.i0 == null) {
                    u61 u61Var = this.E0;
                    if (u61Var != null) {
                        u61Var.g0();
                    }
                } else if (!z10 || b5.d.u() || jj.R4(this.u0.k) || this.u0.L0() * (1.0f - this.u0.b0) <= 1.0d || !LaunchActivity.G1) {
                    this.i0.g0();
                } else {
                    ValueAnimator valueAnimator = this.P1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllUpdateListeners();
                        this.P1.cancel();
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
                    this.P1 = ofFloat;
                    ofFloat.addUpdateListener(this.Q1);
                    this.P1.setDuration(300L);
                    this.P1.addListener(new bg.e(this, 16));
                    this.P1.start();
                }
                this.g0 = true;
                zs.f(this.u0.I1).k(zs.g2, Integer.valueOf(this.u0.f1()));
                try {
                    b5.d.b(1);
                    if (!this.S1) {
                        if (hf.b.e0().h0()) {
                            hf.b.e0().l0(z());
                        }
                        b5.d.x(false);
                    }
                    return true;
                } catch (Exception e) {
                    f8.g(e, true);
                    return true;
                }
            } catch (Exception e7) {
                f8.g(e7, true);
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
    
        org.telegram.messenger.f8.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x01e2, code lost:
    
        if (r11.exists() == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0096, code lost:
    
        if (r40.T1 != null) goto L43;
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
    /* JADX WARN: Type inference failed for: r5v25, types: [org.telegram.messenger.jj, org.telegram.ui.Components.u61] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean S(final jj jjVar) {
        boolean z10;
        boolean z11;
        File file;
        final File N;
        File file2;
        boolean z12;
        File N2;
        boolean z13;
        org.telegram.ui.k4 k4Var;
        boolean L4;
        String str;
        boolean z14;
        PipRoundVideoView pipRoundVideoView;
        u61 u61Var;
        PowerManager.WakeLock wakeLock;
        ?? r52;
        df dfVar;
        boolean z15;
        int i10 = zs.g2;
        int i11 = zs.e2;
        if (jjVar == null) {
            return false;
        }
        m();
        if (!(this.i0 == null && this.E0 == null) && L(jjVar)) {
            if (this.g0) {
                b0(jjVar);
            }
            if (tz.k(true)) {
                return true;
            }
            w0(this.s);
            return true;
        }
        if (!jjVar.N3() && jjVar.k.media_unread) {
            vp.r1(jjVar.I1).o3(jjVar);
        }
        boolean z16 = !this.B0;
        jj jjVar2 = this.u0;
        if (jjVar2 != null) {
            if ((jjVar2.I3() && jj.R4(jjVar.k)) || jjVar.h4() || jj.L4(jjVar.k)) {
                jj jjVar3 = this.u0;
                if (jjVar3 != null && jjVar3.I3() && !this.R0.isEmpty()) {
                    this.T1 = new gf(this.u0);
                }
                z15 = true;
                if (!this.B0) {
                    this.u0.F5();
                    zs.f(this.u0.I1).k(i11, Integer.valueOf(this.u0.f1()), 0);
                }
                z10 = z15;
                z16 = false;
            }
            z15 = false;
            if (!this.B0) {
            }
            z10 = z15;
            z16 = false;
        } else {
            z10 = false;
        }
        q(z16, false, false, false);
        this.n0 = null;
        this.o0 = 0L;
        this.B0 = false;
        this.t0 = 0.0f;
        String str2 = jjVar.k.attachPath;
        if (str2 == null || str2.length() <= 0) {
            z11 = false;
        } else {
            file = new File(jjVar.k.attachPath);
            z11 = file.exists();
        }
        file = null;
        if (file != null) {
            N = file;
        } else {
            b8.G(jjVar.I1);
            N = b8.N(jjVar.k, false, true);
        }
        boolean z17 = tz.B0 && !((!jjVar.I3() && !jjVar.h4() && (!jj.L4(jjVar.k) || !jjVar.B())) || jj.Q5(jjVar.k) || o5.C(jj.B0(jjVar.k)));
        if (N != file && !(z11 = N.exists()) && !z17) {
            b8.G(jjVar.I1).X(jjVar.F0(), jjVar, 0, jj.Q5(jjVar.k) ? 2 : 0);
            this.A0 = true;
            this.g0 = false;
            this.D0 = null;
            this.u0 = jjVar;
            if (h()) {
                try {
                    w0.b.startService(new Intent(w0.b, (Class<?>) MusicPlayerService.class));
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            } else {
                w0.b.stopService(new Intent(w0.b, (Class<?>) MusicPlayerService.class));
            }
            zs.f(this.u0.I1).k(i10, Integer.valueOf(this.u0.f1()));
            return true;
        }
        boolean z18 = z11;
        this.A0 = false;
        if (jjVar.I3()) {
            l(jjVar.I1);
        } else {
            int i12 = jjVar.I1;
            ArrayList arrayList = this.e0;
            if (arrayList != null && arrayList.size() >= 2) {
                jj jjVar4 = (jj) this.e0.get(1);
                String str3 = jjVar4.k.attachPath;
                if (str3 != null && str3.length() > 0) {
                    file2 = new File(jjVar4.k.attachPath);
                }
                file2 = null;
                if (file2 != null) {
                    z12 = z10;
                    N2 = file2;
                } else {
                    b8.G(i12);
                    z12 = z10;
                    N2 = b8.N(jjVar4.k, false, true);
                }
                N2.exists();
                if (N2 == file2 || N2.exists()) {
                    z13 = false;
                } else {
                    z13 = false;
                    b8.G(i12).X(jjVar4.F0(), jjVar4, 0, jj.Q5(jjVar4.k) ? 2 : 0);
                }
                k4Var = this.L0;
                if (k4Var != null) {
                    this.M0 = z13;
                    k4Var.setDrawingReady(z13);
                }
                L4 = jj.L4(jjVar.k);
                if (!jjVar.h4() || L4) {
                    File file3 = file;
                    b8.G(jjVar.I1).d0(jjVar.F0(), true);
                    this.F0 = false;
                    if (L4) {
                        str = "tg://";
                    } else {
                        str = "tg://";
                        if (jjVar.k.peer_id.channel_id != 0 || jjVar.b0 > 0.1f) {
                            z14 = false;
                            int[] iArr = (L4 || jjVar.L0() > 30.0d) ? null : new int[]{1};
                            if (!z12) {
                                r();
                            }
                            u61 u61Var2 = new u61();
                            this.E0 = u61Var2;
                            u61Var2.s0(false);
                            int i13 = this.m0 + 1;
                            this.m0 = i13;
                            String str4 = str;
                            this.E0.J = new e2.w(this, i13, jjVar, iArr, z14);
                            this.P0 = false;
                            if (this.H0 == null) {
                                vp r12 = vp.r1(jjVar.I1);
                                if ((jjVar.p1 ? r12.y0 : r12.x0).contains(Long.valueOf(jjVar.A0()))) {
                                    TextureView textureView = this.G0;
                                    if (textureView != null) {
                                        this.E0.A0(textureView);
                                    }
                                    if (z18) {
                                        try {
                                            int F = b8.G(jjVar.I1).F(jjVar);
                                            TLRPC.Document F0 = jjVar.F0();
                                            StringBuilder sb2 = new StringBuilder("?account=");
                                            sb2.append(jjVar.I1);
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
                                            sb2.append(URLEncoder.encode(b8.B(F0), "UTF-8"));
                                            sb2.append("&reference=");
                                            byte[] bArr = F0.file_reference;
                                            if (bArr == null) {
                                                bArr = new byte[0];
                                            }
                                            sb2.append(Utilities.f(bArr));
                                            this.E0.j0(Uri.parse(str4 + jjVar.S0() + sb2.toString()), "other");
                                        } catch (Exception e) {
                                            f8.f(e);
                                        }
                                    } else {
                                        if (!jjVar.x0 && N != file3) {
                                            final int i14 = 0;
                                            i0.g3(new Runnable() { // from class: org.telegram.messenger.je
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    int i15 = i14;
                                                    File file4 = N;
                                                    jj jjVar5 = jjVar;
                                                    switch (i15) {
                                                        case 0:
                                                            String[] strArr = MediaController.U1;
                                                            zs.f(jjVar5.I1).k(zs.Y1, b8.r(null, jjVar5.F0()), file4);
                                                            break;
                                                        default:
                                                            String[] strArr2 = MediaController.U1;
                                                            zs.f(jjVar5.I1).k(zs.Y1, b8.r(null, jjVar5.F0()), file4);
                                                            break;
                                                    }
                                                }
                                            });
                                        }
                                        this.E0.j0(Uri.fromFile(N), "other");
                                    }
                                    if (jjVar.h4()) {
                                        this.E0.x0(3);
                                    } else {
                                        this.E0.x0(this.L ? 0 : 3);
                                        if (Math.abs(this.p0 - 1.0f) > 0.001f) {
                                            this.E0.v0(Math.round(this.p0 * 10.0f) / 10.0f);
                                        }
                                        float f7 = jjVar.c0;
                                        if (f7 >= 0.0f) {
                                            this.t0 = f7;
                                            jjVar.b0 = f7;
                                            jjVar.c0 = -1.0f;
                                        }
                                    }
                                }
                            }
                            if (this.H0 == null) {
                                try {
                                    PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                                    this.H0 = pipRoundVideoView2;
                                    pipRoundVideoView2.d(this.J0, new qd(this, 9));
                                } catch (Exception unused) {
                                    this.H0 = null;
                                }
                            }
                            pipRoundVideoView = this.H0;
                            if (pipRoundVideoView != null) {
                                this.E0.A0(pipRoundVideoView.c);
                            }
                            if (z18) {
                            }
                            if (jjVar.h4()) {
                            }
                        }
                    }
                    z14 = true;
                    if (L4) {
                    }
                    if (!z12) {
                    }
                    u61 u61Var22 = new u61();
                    this.E0 = u61Var22;
                    u61Var22.s0(false);
                    int i132 = this.m0 + 1;
                    this.m0 = i132;
                    String str42 = str;
                    this.E0.J = new e2.w(this, i132, jjVar, iArr, z14);
                    this.P0 = false;
                    if (this.H0 == null) {
                    }
                    if (this.H0 == null) {
                    }
                    pipRoundVideoView = this.H0;
                    if (pipRoundVideoView != null) {
                    }
                    if (z18) {
                    }
                    if (jjVar.h4()) {
                    }
                } else {
                    PipRoundVideoView pipRoundVideoView3 = this.H0;
                    if (pipRoundVideoView3 != null) {
                        pipRoundVideoView3.a(true);
                        this.H0 = null;
                    }
                    try {
                        u61 u61Var3 = new u61();
                        this.i0 = u61Var3;
                        int i15 = this.m0 + 1;
                        this.m0 = i15;
                        u61Var3.J = new le(this, i15, jjVar, 0);
                        u61Var3.K = new hb.a(14);
                        if (z18) {
                            if (!jjVar.x0 && N != file) {
                                final int i16 = 1;
                                i0.g3(new Runnable() { // from class: org.telegram.messenger.je
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        int i152 = i16;
                                        File file4 = N;
                                        jj jjVar5 = jjVar;
                                        switch (i152) {
                                            case 0:
                                                String[] strArr = MediaController.U1;
                                                zs.f(jjVar5.I1).k(zs.Y1, b8.r(null, jjVar5.F0()), file4);
                                                break;
                                            default:
                                                String[] strArr2 = MediaController.U1;
                                                zs.f(jjVar5.I1).k(zs.Y1, b8.r(null, jjVar5.F0()), file4);
                                                break;
                                        }
                                    }
                                });
                            }
                            this.i0.j0(Uri.fromFile(N), "other");
                            this.l0 = false;
                        } else {
                            int F2 = b8.G(jjVar.I1).F(jjVar);
                            TLRPC.Document F02 = jjVar.F0();
                            StringBuilder sb3 = new StringBuilder("?account=");
                            sb3.append(jjVar.I1);
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
                            sb3.append(URLEncoder.encode(b8.B(F02), "UTF-8"));
                            sb3.append("&reference=");
                            byte[] bArr2 = F02.file_reference;
                            if (bArr2 == null) {
                                bArr2 = new byte[0];
                            }
                            sb3.append(Utilities.f(bArr2));
                            this.i0.j0(Uri.parse("tg://" + jjVar.S0() + sb3.toString()), "other");
                            this.l0 = true;
                        }
                        if (jj.R4(jjVar.k)) {
                            String S0 = jjVar.S0();
                            if (S0 != null && jjVar.L0() >= 300.0d) {
                                float f10 = w0.b.getSharedPreferences("media_saved_pos", 0).getFloat(S0, -1.0f);
                                if (f10 > 0.0f && f10 < 0.99f) {
                                    this.t0 = f10;
                                    jjVar.b0 = f10;
                                }
                                this.n0 = S0;
                            }
                            if (Math.abs(this.p0 - 1.0f) > 0.001f) {
                                this.i0.v0(Math.round(this.p0 * 10.0f) / 10.0f);
                            }
                            this.D0 = null;
                            if (!z12) {
                                r();
                            }
                        } else {
                            try {
                                this.D0 = cf.a.a(N);
                            } catch (Exception e7) {
                                f8.g(e7, true);
                            }
                            String S02 = jjVar.S0();
                            if (!TextUtils.isEmpty(S02) && jjVar.L0() >= 600.0d) {
                                float f11 = w0.b.getSharedPreferences("media_saved_pos", 0).getFloat(S02, -1.0f);
                                if (f11 > 0.0f && f11 < 0.999f) {
                                    this.t0 = f11;
                                    jjVar.b0 = f11;
                                }
                                this.n0 = S02;
                                if (Math.abs(this.q0 - 1.0f) > 0.001f) {
                                    this.i0.v0(Math.round(this.q0 * 10.0f) / 10.0f);
                                }
                            }
                        }
                        float f12 = jjVar.c0;
                        if (f12 >= 0.0f) {
                            this.t0 = f12;
                            jjVar.b0 = f12;
                            jjVar.c0 = -1.0f;
                        }
                        if (!jjVar.I3() || jjVar.F0() == null || o5.C(jj.B0(jjVar.k))) {
                            df dfVar2 = this.w0;
                            if (dfVar2 != null) {
                                dfVar2.b();
                                this.w0 = null;
                            }
                        } else {
                            df dfVar3 = this.w0;
                            if (dfVar3 == null || dfVar3.a != jjVar.I1) {
                                if (dfVar3 != null) {
                                    dfVar3.b();
                                }
                                this.w0 = new df(jjVar.I1);
                            }
                            TLRPC.Document F03 = jjVar.F0();
                            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = F03.id;
                            tL_inputDocument.access_hash = F03.access_hash;
                            byte[] bArr3 = F03.file_reference;
                            tL_inputDocument.file_reference = bArr3;
                            if (bArr3 == null) {
                                tL_inputDocument.file_reference = new byte[0];
                            }
                            df dfVar4 = this.w0;
                            i0.r(dfVar4.e);
                            if (tL_inputDocument.id == 0) {
                                tL_inputDocument = null;
                            }
                            dfVar4.b = tL_inputDocument;
                            dfVar4.c = -9223372036854775807L;
                            dfVar4.d.clear();
                        }
                        i2.i0 i0Var = this.i0.d;
                        if (i0Var != null && (dfVar = this.w0) != null) {
                            i0Var.m.a(new m4.d0(dfVar, i0Var));
                        }
                        this.i0.x0(this.L ? 0 : 3);
                        this.i0.h0();
                        if (jjVar.P4()) {
                            this.O1 = 1.0f;
                            n0();
                        } else {
                            ValueAnimator valueAnimator = this.P1;
                            if (valueAnimator != null) {
                                valueAnimator.removeAllListeners();
                                this.P1.cancel();
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O1, 1.0f);
                            this.P1 = ofFloat;
                            ofFloat.addUpdateListener(this.Q1);
                            this.P1.setDuration(300L);
                            this.P1.start();
                        }
                    } catch (Exception e10) {
                        f8.f(e10);
                        zs f13 = zs.f(jjVar.I1);
                        jj jjVar5 = this.u0;
                        f13.k(i10, Integer.valueOf(jjVar5 != null ? jjVar5.f1() : 0));
                        if (this.i0 == null) {
                            return false;
                        }
                        df dfVar5 = this.w0;
                        if (dfVar5 != null) {
                            dfVar5.b();
                            r52 = 0;
                            this.w0 = null;
                        } else {
                            r52 = 0;
                        }
                        this.i0.m0();
                        this.i0 = r52;
                        org.telegram.ui.ActionBar.t6.N1(this.u0);
                        this.g0 = false;
                        this.u0 = r52;
                        this.A0 = false;
                        return false;
                    }
                }
                j(jjVar);
                n0();
                this.g0 = false;
                this.u0 = jjVar;
                if (!tz.k(true)) {
                    w0(this.s);
                }
                if (!w0.x && (wakeLock = this.d) != null && !wakeLock.isHeld() && !this.u0.P4()) {
                    this.u0.h4();
                }
                v0(this.u0);
                zs.f(jjVar.I1).k(zs.h2, jjVar, jjVar2);
                u61Var = this.E0;
                if (u61Var == null) {
                    try {
                        if (this.u0.b0 != 0.0f) {
                            long U = u61Var.U();
                            if (U == -9223372036854775807L) {
                                U = ((long) this.u0.L0()) * 1000;
                            }
                            jj jjVar6 = this.u0;
                            int i17 = (int) (U * jjVar6.b0);
                            int i18 = jjVar6.d0;
                            if (i18 != 0) {
                                jjVar6.d0 = 0;
                                i17 = i18;
                            }
                            this.E0.p0(i17);
                        }
                    } catch (Exception e11) {
                        jj jjVar7 = this.u0;
                        jjVar7.b0 = 0.0f;
                        jjVar7.g0 = 0;
                        zs.f(jjVar.I1).k(i11, Integer.valueOf(this.u0.f1()), 0);
                        f8.f(e11);
                    }
                    this.E0.h0();
                } else {
                    u61 u61Var4 = this.i0;
                    if (u61Var4 != null) {
                        try {
                            if (this.u0.b0 != 0.0f) {
                                long U2 = u61Var4.U();
                                if (U2 == -9223372036854775807L) {
                                    U2 = ((long) this.u0.L0()) * 1000;
                                }
                                long j10 = (int) (U2 * this.u0.b0);
                                this.i0.p0(j10);
                                if (!this.S1) {
                                    b5.d.v(j10);
                                }
                            }
                        } catch (Exception e12) {
                            this.u0.F5();
                            zs.f(jjVar.I1).k(i11, Integer.valueOf(this.u0.f1()), 0);
                            f8.f(e12);
                        }
                    }
                }
                if (h()) {
                    w0.b.stopService(new Intent(w0.b, (Class<?>) MusicPlayerService.class));
                } else {
                    try {
                        w0.b.startService(new Intent(w0.b, (Class<?>) MusicPlayerService.class));
                    } catch (Throwable th3) {
                        f8.f(th3);
                    }
                }
                b5.d.b(1);
                if (!this.S1) {
                    if (hf.b.e0().h0()) {
                        hf.b.e0().l0(z());
                    }
                    b5.d.x(true);
                }
                return true;
            }
        }
        z12 = z10;
        z13 = false;
        k4Var = this.L0;
        if (k4Var != null) {
        }
        L4 = jj.L4(jjVar.k);
        if (jjVar.h4()) {
        }
        File file32 = file;
        b8.G(jjVar.I1).d0(jjVar.F0(), true);
        this.F0 = false;
        if (L4) {
        }
        z14 = true;
        if (L4) {
        }
        if (!z12) {
        }
        u61 u61Var222 = new u61();
        this.E0 = u61Var222;
        u61Var222.s0(false);
        int i1322 = this.m0 + 1;
        this.m0 = i1322;
        String str422 = str;
        this.E0.J = new e2.w(this, i1322, jjVar, iArr, z14);
        this.P0 = false;
        if (this.H0 == null) {
        }
        if (this.H0 == null) {
        }
        pipRoundVideoView = this.H0;
        if (pipRoundVideoView != null) {
        }
        if (z18) {
        }
        if (jjVar.h4()) {
        }
        j(jjVar);
        n0();
        this.g0 = false;
        this.u0 = jjVar;
        if (!tz.k(true)) {
        }
        if (!w0.x) {
            this.u0.h4();
        }
        v0(this.u0);
        zs.f(jjVar.I1).k(zs.h2, jjVar, jjVar2);
        u61Var = this.E0;
        if (u61Var == null) {
        }
        if (h()) {
        }
        b5.d.b(1);
        if (!this.S1) {
        }
        return true;
    }

    public final void T(int i10) {
        int i11 = this.U0;
        if (i11 >= 0) {
            ArrayList arrayList = this.R0;
            if (i11 >= arrayList.size()) {
                return;
            }
            this.U0 = i10;
            this.B0 = true;
            jj jjVar = (jj) arrayList.get(i10);
            if (this.u0 != null && !L(jjVar)) {
                this.u0.F5();
            }
            S(jjVar);
        }
    }

    public final void U(boolean z10) {
        int i10;
        ArrayList arrayList = tz.N0 ? this.T0 : this.R0;
        if (z10 && (((i10 = tz.S0) == 2 || (i10 == 1 && arrayList.size() == 1)) && !this.V0)) {
            q(false, false, false, false);
            int i11 = this.U0;
            if (i11 < 0 || i11 >= arrayList.size()) {
                return;
            }
            jj jjVar = (jj) arrayList.get(this.U0);
            jjVar.b0 = 0.0f;
            jjVar.g0 = 0;
            S(jjVar);
            return;
        }
        if (!E0(tz.O0 ? 1 : -1, arrayList) || !z10 || tz.S0 != 0 || this.V0) {
            int i12 = this.U0;
            if (i12 < 0 || i12 >= arrayList.size()) {
                return;
            }
            jj jjVar2 = this.u0;
            if (jjVar2 != null) {
                jjVar2.F5();
            }
            this.B0 = true;
            S((jj) arrayList.get(this.U0));
            return;
        }
        u61 u61Var = this.i0;
        if (u61Var == null && this.E0 == null) {
            return;
        }
        if (u61Var != null) {
            df dfVar = this.w0;
            if (dfVar != null) {
                dfVar.b();
                this.w0 = null;
            }
            try {
                this.i0.m0();
            } catch (Exception e) {
                f8.g(e, true);
            }
            this.i0 = null;
            org.telegram.ui.ActionBar.t6.N1(this.u0);
        } else {
            this.L0 = null;
            this.N0 = null;
            this.P0 = false;
            this.G0 = null;
            this.E0.m0();
            this.E0 = null;
            try {
                this.J0.getWindow().clearFlags(128);
            } catch (Exception e7) {
                f8.g(e7, true);
            }
            i0.r(this.b1);
            b8.G(this.u0.I1).a0(this.u0.F0(), true, false);
        }
        z0();
        this.g0 = true;
        jj jjVar3 = this.u0;
        jjVar3.b0 = 0.0f;
        jjVar3.g0 = 0;
        zs.f(jjVar3.I1).k(zs.e2, Integer.valueOf(this.u0.f1()), 0);
        zs.f(this.u0.I1).k(zs.g2, Integer.valueOf(this.u0.f1()));
    }

    public final void V() {
        int i10;
        ArrayList arrayList = tz.N0 ? this.T0 : this.R0;
        if (arrayList.isEmpty() || (i10 = this.U0) < 0 || i10 >= arrayList.size()) {
            return;
        }
        jj jjVar = (jj) arrayList.get(this.U0);
        if (jjVar.g0 > 10) {
            i0(jjVar, 0.0f);
            return;
        }
        E0(tz.O0 ? -1 : 1, arrayList);
        if (this.U0 >= arrayList.size()) {
            return;
        }
        this.B0 = true;
        S((jj) arrayList.get(this.U0));
    }

    public final void W(boolean z10) {
        if (this.e1 != null) {
            D0(false);
            return;
        }
        if (!z10) {
            B0(2, 0, false, false);
            return;
        }
        int currentAccount = this.s.getCurrentAccount();
        long a10 = this.s.a();
        org.telegram.ui.un unVar = this.s;
        jj jjVar = unVar.l4;
        int classGuid = unVar.getClassGuid();
        org.telegram.ui.un unVar2 = this.s;
        sw P8 = unVar2 != null ? unVar2.P8() : null;
        org.telegram.ui.un unVar3 = this.s;
        long a92 = unVar3 != null ? unVar3.a9() : 0L;
        org.telegram.ui.un unVar4 = this.s;
        x0(currentAccount, a10, null, jjVar, null, classGuid, false, P8, a92, unVar4 != null ? unVar4.w5 : null);
    }

    public final boolean X() {
        ki.g gVar = this.J1;
        if (gVar != null) {
            File file = (File) gVar.b;
            c1.b(file);
            file.delete();
            Z();
            return true;
        }
        e0.h hVar = this.E1;
        if (hVar == null || !hVar.e()) {
            return false;
        }
        this.E1 = null;
        if (!hVar.c()) {
            ((ki.k) hVar.e).o();
            hVar.c = true;
        }
        Z();
        return true;
    }

    public final void Y(boolean z10) {
        pd pdVar = this.a;
        if (!z10) {
            if (this.V) {
                ot.o0.abandonAudioFocus(pdVar);
                this.V = false;
                return;
            }
            return;
        }
        if (!this.V && tz.F0 && ot.o0.requestAudioFocus(pdVar, 3, 2) == 1) {
            this.V = true;
        }
    }

    public final void Z() {
        this.e1 = null;
        this.h1 = null;
        this.i1 = null;
        this.G1 = false;
        this.H1 = false;
        this.I1 = false;
        this.J1 = null;
        this.A1 = 0;
    }

    public final boolean a0() {
        int i10;
        jj jjVar;
        gf gfVar = this.T1;
        if (gfVar != null) {
            jj jjVar2 = gfVar.a;
            this.T1 = null;
            ArrayList arrayList = tz.N0 ? this.T0 : this.R0;
            if (arrayList != null && (i10 = this.U0) >= 0 && i10 < arrayList.size() && (jjVar = (jj) arrayList.get(this.U0)) != null && jj.B0(jjVar.k) == jj.B0(jjVar2.k) && jjVar.f1() == jjVar2.f1()) {
                this.B0 = false;
                float f7 = gfVar.b;
                jjVar.c0 = f7;
                jjVar.b0 = f7;
                jjVar.d0 = gfVar.c;
                jjVar.g0 = gfVar.d;
                S(jjVar);
                R(jjVar, false);
                return true;
            }
        }
        return false;
    }

    public final void b0(jj jjVar) {
        if ((this.i0 == null && this.E0 == null) || jjVar == null || this.u0 == null || !L(jjVar)) {
            return;
        }
        try {
            v0(this.u0);
            ValueAnimator valueAnimator = this.P1;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.P1.cancel();
            }
            if (jj.R4(jjVar.k) || jjVar.h4()) {
                this.O1 = 1.0f;
                n0();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O1, 1.0f);
                this.P1 = ofFloat;
                ofFloat.addUpdateListener(this.Q1);
                this.P1.setDuration(300L);
                this.P1.start();
            }
            u61 u61Var = this.i0;
            if (u61Var != null) {
                u61Var.h0();
            } else {
                u61 u61Var2 = this.E0;
                if (u61Var2 != null) {
                    u61Var2.h0();
                }
            }
            j(jjVar);
            this.g0 = false;
            zs.f(this.u0.I1).k(zs.g2, Integer.valueOf(this.u0.f1()));
            try {
                b5.d.b(1);
                if (this.S1) {
                    return;
                }
                b5.d.x(true);
            } catch (Exception e) {
                f8.g(e, true);
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
    }

    public final void c0() {
        jj jjVar;
        u61 u61Var = this.i0;
        if (u61Var == null || (jjVar = this.u0) == null || this.g0) {
            return;
        }
        if (u61Var.d == null || u61Var.L != 2) {
            u61Var.h0();
        } else {
            q(false, false, false, false);
            S(jjVar);
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        pp ppVar;
        jj jjVar;
        ArrayList arrayList;
        int indexOf;
        int i12 = 0;
        if (i10 == zs.Y1 || i10 == zs.R1) {
            String str = (String) objArr[0];
            jj jjVar2 = this.u0;
            if (jjVar2 != null && jjVar2.I1 == i11 && b8.r(null, jjVar2.F0()).equals(str)) {
                if (this.A0) {
                    this.B0 = true;
                    S(this.u0);
                    return;
                } else {
                    if (this.D0 == null) {
                        try {
                            b8.G(d20.s0);
                            this.D0 = cf.a.a(b8.N(this.u0.k, false, true));
                            return;
                        } catch (Exception e) {
                            f8.g(e, true);
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        if (i10 == zs.w) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            ArrayList arrayList2 = (ArrayList) objArr[0];
            jj jjVar3 = this.u0;
            if (jjVar3 != null && longValue == jjVar3.k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(jjVar3.f1()))) {
                q(true, true, false, false);
            }
            ArrayList arrayList3 = this.e0;
            if (arrayList3 == null || arrayList3.isEmpty() || longValue != ((jj) this.e0.get(0)).k.peer_id.channel_id) {
                return;
            }
            while (i12 < arrayList2.size()) {
                Integer num = (Integer) arrayList2.get(i12);
                jj jjVar4 = (jj) this.f0.get(num.intValue());
                this.f0.remove(num.intValue());
                if (jjVar4 != null) {
                    this.e0.remove(jjVar4);
                }
                i12++;
            }
            return;
        }
        if (i10 == zs.e0) {
            long longValue2 = ((Long) objArr[0]).longValue();
            jj jjVar5 = this.u0;
            if (jjVar5 == null || jj.B0(jjVar5.k) != longValue2) {
                return;
            }
            q(false, true, false, false);
            return;
        }
        int i13 = zs.K0;
        int[] iArr = this.a1;
        HashMap hashMap = this.S0;
        ArrayList arrayList4 = this.R0;
        if (i10 == i13) {
            long longValue3 = ((Long) objArr[0]).longValue();
            jj jjVar6 = this.u0;
            if (jjVar6 == null || !jjVar6.I3() || jj.B0(this.u0.k) != longValue3 || this.u0.p1) {
                return;
            }
            ArrayList arrayList5 = (ArrayList) objArr[1];
            ArrayList arrayList6 = (ArrayList) objArr[2];
            arrayList4.addAll(0, arrayList5);
            arrayList4.addAll(arrayList6);
            int size = arrayList4.size();
            for (int i14 = 0; i14 < size; i14++) {
                jj jjVar7 = (jj) arrayList4.get(i14);
                hashMap.put(Integer.valueOf(jjVar7.f1()), jjVar7);
                iArr[0] = Math.min(iArr[0], jjVar7.f1());
            }
            t0();
            if (tz.N0) {
                g();
            } else {
                jj jjVar8 = this.u0;
                if (jjVar8 != null && (indexOf = arrayList4.indexOf(jjVar8)) >= 0) {
                    this.U0 = indexOf;
                }
            }
            this.Z0 = ConnectionsManager.generateClassGuid();
            return;
        }
        int i15 = zs.V;
        int i16 = zs.L0;
        if (i10 == i15) {
            if (((Integer) objArr[3]).intValue() != this.Z0 || this.u0 == null) {
                return;
            }
            long longValue4 = ((Long) objArr[0]).longValue();
            ((Integer) objArr[4]).getClass();
            ArrayList arrayList7 = (ArrayList) objArr[2];
            char c10 = longValue4 == this.Y0 ? (char) 1 : (char) 0;
            if (!arrayList7.isEmpty()) {
                this.W0[c10] = ((Boolean) objArr[5]).booleanValue();
            }
            int i17 = 0;
            for (int i18 = 0; i18 < arrayList7.size(); i18++) {
                jj jjVar9 = (jj) arrayList7.get(i18);
                if (!jjVar9.S4() && !hashMap.containsKey(Integer.valueOf(jjVar9.f1()))) {
                    i17++;
                    arrayList4.add(0, jjVar9);
                    hashMap.put(Integer.valueOf(jjVar9.f1()), jjVar9);
                    iArr[c10] = Math.min(iArr[c10], jjVar9.f1());
                }
            }
            t0();
            int indexOf2 = arrayList4.indexOf(this.u0);
            if (indexOf2 >= 0) {
                this.U0 = indexOf2;
            }
            this.X0 = false;
            if (tz.N0) {
                g();
            }
            if (i17 != 0) {
                zs.f(this.u0.I1).k(i16, Integer.valueOf(i17));
                return;
            }
            return;
        }
        if (i10 == 1) {
            if (((Boolean) objArr[2]).booleanValue() || (arrayList = this.e0) == null || arrayList.isEmpty() || ((Long) objArr[0]).longValue() != jj.B0(((jj) this.e0.get(0)).k)) {
                return;
            }
            ArrayList arrayList8 = (ArrayList) objArr[1];
            while (i12 < arrayList8.size()) {
                jj jjVar10 = (jj) arrayList8.get(i12);
                if ((jj.R4(jjVar10.k) || jjVar10.h4()) && !jjVar10.S4() && !jjVar10.g4() && (!this.d0 || (jjVar10.k.media_unread && !jjVar10.N3()))) {
                    this.e0.add(jjVar10);
                    this.f0.put(jjVar10.f1(), jjVar10);
                }
                i12++;
            }
            return;
        }
        if (i10 == zs.H4) {
            u61 u61Var = (u61) objArr[0];
            if (this.E0 == u61Var || this.i0 == u61Var) {
                return;
            }
            jj jjVar11 = this.u0;
            if (jjVar11 != null && I(jjVar11) && !H() && (jjVar11.I3() || jj.R4(jjVar11.k))) {
                this.h0 = true;
            }
            R(jjVar11, true);
            return;
        }
        if (i10 == zs.T3 && (ppVar = this.Q0) != null && objArr[0] == ppVar) {
            int size2 = ppVar.c.size() - arrayList4.size();
            arrayList4.clear();
            arrayList4.addAll(this.Q0.c);
            t0();
            if (tz.N0) {
                g();
            } else {
                jj jjVar12 = this.u0;
                if (jjVar12 != null) {
                    int indexOf3 = arrayList4.indexOf(jjVar12);
                    if (indexOf3 >= 0) {
                        this.U0 = indexOf3;
                    } else {
                        int i19 = this.U0;
                        if (i19 < 0 || i19 >= arrayList4.size()) {
                            this.U0 = 0;
                        }
                        if (arrayList4.size() == 0) {
                            o();
                        } else {
                            S((jj) arrayList4.get(0));
                        }
                    }
                }
            }
            if (size2 == 0 || (jjVar = this.u0) == null) {
                return;
            }
            zs.f(jjVar.I1).k(i16, Integer.valueOf(size2));
        }
    }

    public final void g() {
        jj jjVar;
        ArrayList arrayList = this.R0;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.T0;
        arrayList3.clear();
        int i10 = this.U0;
        if (i10 < 0 || i10 >= arrayList.size()) {
            jjVar = null;
        } else {
            jjVar = (jj) arrayList.get(this.U0);
            arrayList2.remove(this.U0);
        }
        int size = arrayList2.size();
        for (int i11 = 0; i11 < size; i11++) {
            int nextInt = Utilities.b.nextInt(arrayList2.size());
            arrayList3.add((jj) arrayList2.get(nextInt));
            arrayList2.remove(nextInt);
        }
        if (jjVar != null) {
            arrayList3.add(jjVar);
            this.U0 = arrayList3.size() - 1;
        }
    }

    public native byte[] getWaveform2(short[] sArr, int i10);

    public final boolean h() {
        jj jjVar = this.u0;
        if (jjVar != null) {
            return ((!jjVar.I3() && !jj.R4(this.u0.k) && !this.u0.h4()) || this.u0.S4() || this.u0.g4()) ? false : true;
        }
        return false;
    }

    public final boolean h0(jj jjVar, boolean z10, boolean z11, boolean z12) {
        x20 x20Var = jjVar != null ? jjVar.p0 : null;
        if (jjVar != null && x20Var != null) {
            ArrayList arrayList = this.b0;
            if (!z10 || arrayList.isEmpty()) {
                if (z10) {
                    new File(jjVar.k.attachPath).delete();
                }
                jf jfVar = new jf();
                jfVar.a = jjVar;
                jfVar.c = jjVar.I1;
                jfVar.b = x20Var;
                jfVar.d = z12;
                arrayList.add(jfVar);
                if (z11) {
                    this.Z.add(jfVar);
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

    public final void i(jj jjVar) {
        if (jjVar == null || this.b0.isEmpty()) {
            return;
        }
        for (int i10 = 0; i10 < this.b0.size(); i10++) {
            jf jfVar = (jf) this.b0.get(i10);
            jj jjVar2 = jfVar.a;
            if (jjVar2.T(jjVar) && jjVar2.I1 == jjVar.I1) {
                if (i10 == 0) {
                    synchronized (this.b) {
                        jfVar.b.W = true;
                    }
                    return;
                } else {
                    this.Z.remove((jf) this.b0.remove(i10));
                    k(true);
                    return;
                }
            }
        }
    }

    public final void i0(jj jjVar, float f7) {
        jj jjVar2 = this.u0;
        if ((this.i0 == null && this.E0 == null) || jjVar == null || jjVar2 == null || !L(jjVar)) {
            return;
        }
        try {
            u61 u61Var = this.i0;
            if (u61Var != null) {
                long U = u61Var.U();
                if (U == -9223372036854775807L) {
                    this.t0 = f7;
                } else {
                    jjVar2.b0 = f7;
                    long j10 = (int) (U * f7);
                    this.i0.q0(j10, false);
                    if (!this.S1) {
                        b5.d.v(j10);
                    }
                }
            } else {
                u61 u61Var2 = this.E0;
                if (u61Var2 != null) {
                    u61Var2.p0((long) (u61Var2.U() * f7));
                    if (!this.S1) {
                        b5.d.v((long) (this.E0.U() * f7));
                    }
                }
            }
            zs.f(jjVar.I1).k(zs.i2, Integer.valueOf(jjVar2.f1()), Float.valueOf(f7));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void j(jj jjVar) {
        int requestAudioFocus;
        int i10 = (jj.R4(jjVar.k) || jjVar.h4()) ? this.L ? 3 : 2 : 1;
        if (this.U != i10) {
            this.U = i10;
            if (i10 == 3) {
                requestAudioFocus = ot.o0.requestAudioFocus(this, 0, 1);
            } else {
                requestAudioFocus = ot.o0.requestAudioFocus(this, 3, (i10 != 2 || tz.G0) ? 1 : 3);
            }
            if (requestAudioFocus == 1) {
                this.X = 2;
            }
        }
    }

    public final void k(boolean z10) {
        if (this.Z.isEmpty()) {
            this.a0 = null;
        } else {
            this.a0 = (jf) this.Z.get(0);
        }
        if (this.a0 != null || z10) {
            if (VideoEncodingService.e == null) {
                try {
                    w0.b.startService(new Intent(w0.b, (Class<?>) VideoEncodingService.class));
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            }
            if (z10) {
                jf jfVar = B().a0;
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService.b != jfVar) {
                    if (jfVar != null) {
                        videoEncodingService.a(jfVar);
                    } else {
                        videoEncodingService.stopSelf();
                    }
                }
            }
        }
    }

    public final void k0(boolean z10) {
        org.telegram.ui.k4 k4Var = this.L0;
        if (k4Var == null) {
            return;
        }
        if (z10) {
            PipRoundVideoView pipRoundVideoView = this.H0;
            if (pipRoundVideoView != null) {
                this.I0 = 2;
                pipRoundVideoView.a(true);
                this.H0 = null;
                return;
            } else {
                if (k4Var.getParent() == null) {
                    this.N0.addView(this.L0);
                }
                this.E0.A0(this.G0);
                return;
            }
        }
        if (k4Var.getParent() != null) {
            this.I0 = 1;
            this.N0.removeView(this.L0);
            return;
        }
        if (this.H0 == null) {
            try {
                PipRoundVideoView pipRoundVideoView2 = new PipRoundVideoView();
                this.H0 = pipRoundVideoView2;
                pipRoundVideoView2.d(this.J0, new qd(this, 4));
            } catch (Exception unused) {
                this.H0 = null;
            }
        }
        PipRoundVideoView pipRoundVideoView3 = this.H0;
        if (pipRoundVideoView3 != null) {
            this.E0.A0(pipRoundVideoView3.c);
        }
    }

    public final void l(int i10) {
        int i11;
        File N;
        b6 q6 = b6.q(i10);
        int e = w0.e();
        if (e == 1) {
            if (!q6.N.g || !q6.p().d) {
                return;
            }
        } else if (e == 2) {
            if (!q6.O.g || !q6.o().d) {
                return;
            }
        } else if (!q6.M.g || !q6.n().d) {
            return;
        }
        ArrayList arrayList = tz.N0 ? this.T0 : this.R0;
        if (arrayList == null || arrayList.size() < 2) {
            return;
        }
        if (tz.O0) {
            i11 = this.U0 + 1;
            if (i11 >= arrayList.size()) {
                i11 = 0;
            }
        } else {
            i11 = this.U0 - 1;
            if (i11 < 0) {
                i11 = arrayList.size() - 1;
            }
        }
        if (i11 < 0 || i11 >= arrayList.size()) {
            return;
        }
        jj jjVar = (jj) arrayList.get(i11);
        File file = null;
        if (!TextUtils.isEmpty(jjVar.k.attachPath)) {
            File file2 = new File(jjVar.k.attachPath);
            if (file2.exists()) {
                file = file2;
            }
        }
        if (file != null) {
            N = file;
        } else {
            b8.G(i10);
            N = b8.N(jjVar.k, false, true);
        }
        N.exists();
        if (N == file || N.exists() || !jjVar.I3()) {
            return;
        }
        b8.G(i10).X(jjVar.F0(), jjVar, 0, jj.Q5(jjVar.k) ? 2 : 0);
    }

    public final void l0(int i10) {
        boolean z10 = tz.N0;
        if (i10 == 2) {
            tz.N0 = true;
            tz.O0 = false;
        } else if (i10 == 1) {
            tz.O0 = true;
            tz.N0 = false;
        } else {
            tz.O0 = false;
            tz.N0 = false;
        }
        MediaController B = B();
        jj jjVar = B.u0;
        if (jjVar != null && jjVar.I3()) {
            B.l(B.u0.I1);
        }
        SharedPreferences.Editor edit = vp.d1().edit();
        edit.putBoolean("shuffleMusic", tz.N0);
        edit.putBoolean("playOrderReversed", tz.O0);
        edit.apply();
        boolean z11 = tz.N0;
        if (z10 != z11) {
            if (z11) {
                g();
                return;
            }
            jj jjVar2 = this.u0;
            if (jjVar2 != null) {
                int indexOf = this.R0.indexOf(jjVar2);
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
            if (Math.abs(currentTimeMillis - e2) < 5000) {
                return;
            }
            AudioManager audioManager = (AudioManager) w0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            int i10 = this.L ? 0 : 3;
            int streamVolume = audioManager.getStreamVolume(i10);
            if (streamVolume == 0) {
                audioManager.adjustStreamVolume(i10, streamVolume, 1);
                e2 = currentTimeMillis;
            }
        } catch (Exception unused) {
        }
    }

    public final void m0(boolean z10, float f7) {
        if (z10) {
            if (this.q0 >= 6.0f && f7 == 1.0f && this.u0 != null) {
                this.i0.g0();
                jj jjVar = this.u0;
                i0.h3(new ie(this, jjVar, jjVar.b0, 0), 50L);
            }
            this.q0 = f7;
            if (Math.abs(f7 - 1.0f) > 0.001f) {
                this.s0 = f7;
            }
        } else {
            this.p0 = f7;
            if (Math.abs(f7 - 1.0f) > 0.001f) {
                this.r0 = f7;
            }
        }
        u61 u61Var = this.i0;
        if (u61Var != null) {
            u61Var.v0(Math.round(f7 * 10.0f) / 10.0f);
        } else {
            u61 u61Var2 = this.E0;
            if (u61Var2 != null) {
                u61Var2.v0(Math.round(f7 * 10.0f) / 10.0f);
            }
        }
        vp.d1().edit().putFloat(z10 ? "musicPlaybackSpeed" : "playbackSpeed", f7).putFloat(z10 ? "fastMusicPlaybackSpeed" : "fastPlaybackSpeed", z10 ? this.s0 : this.r0).commit();
        zs.e().k(zs.J4, new Object[0]);
        if (this.S1) {
            return;
        }
        b5.d.z(f7);
    }

    public final void n(boolean z10) {
        File file;
        File file2;
        File file3;
        e0.h hVar;
        e0.h hVar2;
        if (this.G1) {
            xd xdVar = this.F1;
            if (xdVar != null) {
                i0.r(xdVar);
                this.F1 = null;
            }
            boolean c10 = (z10 || (hVar2 = this.E1) == null) ? false : hVar2.c();
            if (!c10 && (hVar = this.E1) != null) {
                hVar.b = false;
                ((ki.k) hVar.e).b();
            }
            if (c10 && (file3 = this.i1) != null) {
                c1.b(file3);
            }
            x(!z10);
            return;
        }
        this.e1 = null;
        c1.b(this.i1);
        if (z10 && (file2 = this.i1) != null) {
            try {
                file2.delete();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        this.i1 = null;
        if (z10 && (file = this.h1) != null) {
            file.delete();
        }
        this.h1 = null;
        this.x0 = false;
        this.r = false;
        this.O = false;
    }

    public final void n0() {
        try {
            float f7 = this.X != 1 ? 1.0f : 0.2f;
            u61 u61Var = this.i0;
            float f10 = 0.0f;
            if (u61Var != null) {
                if (!b5.d.u()) {
                    f10 = this.O1 * f7;
                }
                u61Var.B0(f10);
            } else {
                u61 u61Var2 = this.E0;
                if (u61Var2 != null) {
                    if (b5.d.u()) {
                        f7 = 0.0f;
                    }
                    u61Var2.B0(f7);
                }
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void o() {
        q(true, true, false, false);
        this.D0 = null;
        this.B0 = false;
        for (int i10 = 0; i10 < 4; i10++) {
            b6 q6 = b6.q(i10);
            q6.b.clear();
            q6.c.clear();
            q6.d.clear();
            q6.e.clear();
            q6.f.clear();
            q6.h.clear();
            q6.F.b();
        }
        this.b0.clear();
        this.c0.clear();
        this.T1 = null;
        this.e0 = null;
        this.f0 = null;
        r();
    }

    public final boolean o0(ArrayList arrayList, jj jjVar, long j10, boolean z10, e2.a0 a0Var) {
        HashMap hashMap;
        jj jjVar2 = this.u0;
        ArrayList arrayList2 = this.R0;
        if (jjVar2 == jjVar) {
            int indexOf = arrayList2.indexOf(jjVar);
            if (indexOf >= 0) {
                this.U0 = indexOf;
            }
            return S(jjVar);
        }
        this.V0 = !z10;
        this.Y0 = j10;
        this.B0 = !arrayList2.isEmpty();
        r();
        this.C0 = a0Var;
        boolean z11 = false;
        if (!arrayList.isEmpty() && o5.C(jj.B0(((jj) arrayList.get(0)).k))) {
            z11 = true;
        }
        int size = arrayList.size() - 1;
        int i10 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        int i11 = TLObject.FLAG_31;
        while (true) {
            hashMap = this.S0;
            if (size < 0) {
                break;
            }
            jj jjVar3 = (jj) arrayList.get(size);
            if (jjVar3.I3()) {
                int f12 = jjVar3.f1();
                if (f12 > 0 || z11) {
                    i10 = Math.min(i10, f12);
                    i11 = Math.max(i11, f12);
                }
                arrayList2.add(jjVar3);
                hashMap.put(Integer.valueOf(f12), jjVar3);
            }
            size--;
        }
        t0();
        int indexOf2 = arrayList2.indexOf(jjVar);
        this.U0 = indexOf2;
        if (indexOf2 == -1) {
            r();
            this.U0 = arrayList2.size();
            arrayList2.add(jjVar);
            hashMap.put(Integer.valueOf(jjVar.f1()), jjVar);
        }
        if (jjVar.I3() && !jjVar.p1) {
            if (tz.N0) {
                g();
            }
            if (z10) {
                if (this.C0 == null) {
                    ui b02 = ui.b0(jjVar.I1);
                    b02.getMessagesStorage().a.c(new m2(b02, jj.B0(jjVar.k), i10, i11, 1));
                } else {
                    this.Z0 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return S(jjVar);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        i0.g3(new ud(this, i10, 1));
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
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        ArrayList arrayList;
        jj jjVar;
        if (this.P && VoIPService.getSharedInstance() == null) {
            if (sensorEvent.sensor.getType() == 8) {
                if (v2.a) {
                    f8.b("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
                }
                float f7 = this.K;
                float f10 = sensorEvent.values[0];
                if (f7 != f10) {
                    this.J = true;
                }
                this.K = f10;
                if (this.J) {
                    this.I = f10 < 5.0f && f10 != this.e.getMaximumRange();
                }
                j10 = 0;
                z10 = 1;
                i10 = 2;
            } else {
                Sensor sensor = sensorEvent.sensor;
                if (sensor == this.f) {
                    double d = this.H == 0 ? 0.9800000190734863d : 1.0d / (((sensorEvent.timestamp - r2) / 1.0E9d) + 1.0d);
                    this.H = sensorEvent.timestamp;
                    float[] fArr = this.R;
                    double d10 = 1.0d - d;
                    float[] fArr2 = sensorEvent.values;
                    j10 = 0;
                    float f11 = (float) ((fArr2[0] * d10) + (fArr[0] * d));
                    fArr[0] = f11;
                    z10 = 1;
                    i10 = 2;
                    float f12 = (float) ((fArr2[1] * d10) + (fArr[1] * d));
                    fArr[1] = f12;
                    float f13 = (float) ((d10 * fArr2[2]) + (d * fArr[2]));
                    fArr[2] = f13;
                    float[] fArr3 = this.S;
                    fArr3[0] = (fArr2[0] * 0.19999999f) + (f11 * 0.8f);
                    fArr3[1] = (fArr2[1] * 0.19999999f) + (f12 * 0.8f);
                    fArr3[2] = (fArr2[2] * 0.19999999f) + (f13 * 0.8f);
                    float[] fArr4 = this.T;
                    fArr4[0] = fArr2[0] - fArr[0];
                    fArr4[1] = fArr2[1] - fArr[1];
                    fArr4[2] = fArr2[2] - fArr[2];
                } else {
                    j10 = 0;
                    boolean z13 = true;
                    i10 = 2;
                    if (sensor == this.h) {
                        float[] fArr5 = this.T;
                        float[] fArr6 = sensorEvent.values;
                        fArr5[0] = fArr6[0];
                        fArr5[1] = fArr6[1];
                        fArr5[2] = fArr6[2];
                        z10 = z13;
                    } else {
                        z10 = z13;
                        if (sensor == this.n) {
                            float[] fArr7 = this.S;
                            float[] fArr8 = this.R;
                            float[] fArr9 = sensorEvent.values;
                            float f14 = fArr9[0];
                            fArr8[0] = f14;
                            fArr7[0] = f14;
                            float f15 = fArr9[1];
                            fArr8[1] = f15;
                            fArr7[1] = f15;
                            float f16 = fArr9[2];
                            fArr8[2] = f16;
                            fArr7[2] = f16;
                            z10 = z13;
                        }
                    }
                }
            }
            Sensor sensor2 = sensorEvent.sensor;
            if (sensor2 == this.h || sensor2 == this.n || sensor2 == this.f) {
                float[] fArr10 = this.R;
                float f17 = fArr10[0];
                float[] fArr11 = this.T;
                float f18 = (fArr10[i10] * fArr11[i10]) + (fArr10[z10] * fArr11[z10]) + (f17 * fArr11[0]);
                int i12 = this.E;
                if (i12 != 6 && ((f18 > 0.0f && this.Q > 0.0f) || (f18 < 0.0f && this.Q < 0.0f))) {
                    if (f18 > 0.0f) {
                        z11 = f18 > 15.0f ? z10 : false;
                        i11 = z10;
                    } else {
                        z11 = f18 < -15.0f ? z10 : false;
                        i11 = i10;
                    }
                    int i13 = this.D;
                    if (i13 != 0 && i13 != i11) {
                        int i14 = this.y;
                        if (i14 != 6 || !z11) {
                            if (!z11) {
                                this.F++;
                            }
                            if (this.F == 10 || i14 != 6 || i12 != 0) {
                                this.y = 0;
                                this.D = 0;
                                this.E = 0;
                                this.F = 0;
                            }
                        } else if (i12 < 6) {
                            int i15 = i12 + 1;
                            this.E = i15;
                            if (i15 == 6) {
                                this.y = 0;
                                this.D = 0;
                                this.F = 0;
                                this.G = System.currentTimeMillis();
                                boolean z14 = v2.a;
                            }
                        }
                    } else if (z11 && i12 == 0 && (i13 == 0 || i13 == i11)) {
                        int i16 = this.y;
                        if (i16 < 6 && !this.I) {
                            this.D = i11;
                            int i17 = i16 + 1;
                            this.y = i17;
                            if (i17 == 6) {
                                this.F = 0;
                            }
                        }
                    } else {
                        if (!z11) {
                            this.F++;
                        }
                        if (i13 != i11 || this.F == 10 || this.y != 6 || i12 != 0) {
                            this.E = 0;
                            this.y = 0;
                            this.D = 0;
                            this.F = 0;
                        }
                    }
                }
                this.Q = f18;
                float[] fArr12 = this.S;
                this.w = (fArr12[z10] <= 2.5f || Math.abs(fArr12[i10]) >= 4.0f || Math.abs(this.S[0]) <= 1.5f) ? false : z10;
            }
            if (this.E == 6 || this.w) {
                this.x = System.currentTimeMillis();
            }
            boolean z15 = (this.x0 || this.u0 != null || !tz.k(z10) || !w0.w || this.M || !this.N || this.s == null || this.W) ? false : z10;
            boolean z16 = (tz.k(false) && (jjVar = this.u0) != null && (jj.R4(jjVar.k) || this.u0.h4())) ? z10 : false;
            boolean z17 = this.I;
            boolean z18 = (this.E == 6 || this.w || System.currentTimeMillis() - this.x < 60) ? z10 : false;
            boolean z19 = (this.L || this.r) ? z10 : false;
            boolean z20 = ((z18 || z19) && !y() && !VoIPService.isAnyKindOfCallActive() && (z15 || z16) && !PhotoViewer.v1().U1()) ? z10 : false;
            PowerManager.WakeLock wakeLock = this.d;
            if (wakeLock != null) {
                boolean isHeld = wakeLock.isHeld();
                if (isHeld && !z20) {
                    if (v2.a) {
                        f8.b("wake lock releasing (proximityDetected=" + z17 + ", accelerometerDetected=" + z18 + ", alreadyPlaying=" + z19 + ")");
                    }
                    this.d.release();
                } else if (!isHeld && z20) {
                    if (v2.a) {
                        f8.b("wake lock acquiring (proximityDetected=" + z17 + ", accelerometerDetected=" + z18 + ", alreadyPlaying=" + z19 + ")");
                    }
                    this.d.acquire();
                }
            }
            boolean z21 = this.I;
            if (z21 && z20) {
                if (z15 && this.K1 == null) {
                    if (!this.r) {
                        if (v2.a) {
                            f8.b("start record");
                        }
                        this.L = z10;
                        if (this.e1 == null) {
                            org.telegram.ui.un unVar = this.s;
                            ArrayList arrayList2 = unVar.K6;
                            org.telegram.ui.mk mkVar = unVar.Z;
                            if (mkVar == null || !mkVar.t0()) {
                                int size = arrayList2.size() - 1;
                                while (true) {
                                    if (size >= 0) {
                                        jj jjVar2 = (jj) arrayList2.get(size);
                                        if ((jj.R4(jjVar2.k) || jjVar2.h4()) && jjVar2.k.media_unread && !jjVar2.N3()) {
                                            MediaController B = B();
                                            if (B().S(jjVar2)) {
                                                z12 = true;
                                                arrayList = unVar.Z7(jjVar2, true);
                                            } else {
                                                z12 = true;
                                                arrayList = null;
                                            }
                                            B.r0(arrayList, z12);
                                        } else {
                                            size--;
                                        }
                                    } else if (unVar.getParentActivity() != null && unVar.getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                        unVar.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
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
                } else if (z16 && !this.L) {
                    if (v2.a) {
                        f8.b("start listen");
                    }
                    q0();
                    u0(false);
                }
                this.E = 0;
                this.y = 0;
                this.D = 0;
                this.F = 0;
            } else if (z21 && ((this.f == null || this.h == null) && this.n == null && !VoIPService.isAnyKindOfCallActive())) {
                if (this.u0 != null && !w0.x && z16 && !this.L && !this.x0 && !y()) {
                    if (v2.a) {
                        f8.b("start listen by proximity only");
                    }
                    q0();
                    u0(false);
                }
            } else if (!this.I && !this.x0) {
                if (this.r) {
                    if (v2.a) {
                        f8.b("stop record");
                    }
                    W(false);
                    this.r = false;
                    this.O = false;
                } else if (this.L) {
                    if (v2.a) {
                        f8.b("stop listen");
                    }
                    this.L = false;
                    u0(true);
                    this.O = false;
                }
            }
            if (this.G == j10 || this.E != 6 || Math.abs(System.currentTimeMillis() - this.G) <= 1000) {
                return;
            }
            this.E = 0;
            this.y = 0;
            this.D = 0;
            this.F = 0;
            this.G = j10;
        }
    }

    public final void p(boolean z10, boolean z11) {
        q(z10, z11, false, false);
    }

    public final void p0(TextureView textureView, org.telegram.ui.k4 k4Var, FrameLayout frameLayout, boolean z10) {
        if (textureView == null) {
            return;
        }
        if (!z10 && this.G0 == textureView) {
            this.I0 = 1;
            this.G0 = null;
            this.L0 = null;
            this.N0 = null;
            return;
        }
        u61 u61Var = this.E0;
        if (u61Var == null || textureView == this.G0) {
            return;
        }
        this.M0 = k4Var != null && k4Var.d;
        this.G0 = textureView;
        PipRoundVideoView pipRoundVideoView = this.H0;
        if (pipRoundVideoView != null) {
            u61Var.A0(pipRoundVideoView.c);
        } else {
            u61Var.A0(textureView);
        }
        this.L0 = k4Var;
        this.N0 = frameLayout;
        if (!this.P0 || k4Var == null) {
            return;
        }
        k4Var.a(this.O0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        PipRoundVideoView pipRoundVideoView;
        jj jjVar;
        int i10 = zs.j2;
        if (z11 && a0()) {
            return;
        }
        int i11 = 1;
        boolean z15 = false;
        if (this.i0 != null) {
            df dfVar = this.w0;
            if (dfVar != null) {
                dfVar.b();
                this.w0 = null;
            }
            ValueAnimator valueAnimator = this.P1;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.P1.cancel();
            }
            if (b5.d.u() || !this.i0.d0() || (jjVar = this.u0) == null || jj.R4(jjVar.k)) {
                try {
                    this.i0.m0();
                } catch (Exception e) {
                    f8.g(e, true);
                }
            } else {
                u61 u61Var = this.i0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.O1, 0.0f);
                ofFloat.addUpdateListener(new r(i11, this, u61Var));
                ofFloat.addListener(new bg.e(u61Var, 17));
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
            this.i0 = null;
            org.telegram.ui.ActionBar.t6.N1(this.u0);
        } else {
            u61 u61Var2 = this.E0;
            if (u61Var2 != null) {
                this.L0 = null;
                this.N0 = null;
                this.P0 = false;
                this.M0 = false;
                this.G0 = null;
                this.v0 = null;
                if (z13) {
                    PhotoViewer.v1().S2 = this.E0;
                    jj jjVar2 = this.u0;
                    this.v0 = jjVar2;
                    zs.f(jjVar2.I1).k(i10, this.u0, Boolean.TRUE);
                } else {
                    long S = u61Var2.S();
                    jj jjVar3 = this.u0;
                    if (jjVar3 != null && jj.L4(jjVar3.k) && S > 0) {
                        jj jjVar4 = this.u0;
                        jjVar4.d0 = (int) S;
                        zs.f(jjVar4.I1).k(i10, this.u0, Boolean.FALSE);
                    }
                    this.E0.m0();
                    this.E0 = null;
                }
                try {
                    this.J0.getWindow().clearFlags(128);
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                if (this.u0 != null && !z13) {
                    i0.r(this.b1);
                    b8.G(this.u0.I1).a0(this.u0.F0(), true, false);
                }
            }
        }
        z0();
        this.g0 = false;
        jj jjVar5 = this.u0;
        if (jjVar5 != null) {
            if (this.A0) {
                b8.G(jjVar5.I1).f(this.u0.F0());
            }
            jj jjVar6 = this.u0;
            if (z10) {
                jjVar6.F5();
                zs.f(jjVar6.I1).k(zs.e2, Integer.valueOf(this.u0.f1()), 0);
            }
            this.u0 = null;
            this.A0 = false;
            if (z10) {
                ot.o0.abandonAudioFocus(this);
                this.U = 0;
                ArrayList arrayList = this.e0;
                int i12 = -1;
                if (arrayList != null) {
                    if (!z12 || (i12 = arrayList.indexOf(jjVar6)) < 0) {
                        this.e0 = null;
                        this.f0 = null;
                    } else {
                        this.e0.remove(i12);
                        this.f0.remove(jjVar6.f1());
                        if (this.e0.isEmpty()) {
                            this.e0 = null;
                            this.f0 = null;
                        }
                    }
                }
                ArrayList arrayList2 = this.e0;
                if (arrayList2 == null || i12 >= arrayList2.size()) {
                    if ((jj.R4(jjVar6.k) || jjVar6.h4()) && jjVar6.f1() != 0 && this.L && this.s != null && this.N && tz.k(true)) {
                        this.r = true;
                        int currentAccount = this.s.getCurrentAccount();
                        long a10 = this.s.a();
                        org.telegram.ui.un unVar = this.s;
                        jj jjVar7 = unVar.l4;
                        int classGuid = unVar.getClassGuid();
                        org.telegram.ui.un unVar2 = this.s;
                        sw P8 = unVar2 != null ? unVar2.P8() : null;
                        org.telegram.ui.un unVar3 = this.s;
                        long a92 = unVar3 != null ? unVar3.a9() : 0L;
                        org.telegram.ui.un unVar4 = this.s;
                        x0(currentAccount, a10, null, jjVar7, null, classGuid, false, P8, a92, unVar4 != null ? unVar4.w5 : null);
                        this.O = true;
                    }
                    z14 = false;
                    zs.f(jjVar6.I1).k(zs.f2, Integer.valueOf(jjVar6.f1()), Boolean.valueOf(z11));
                    this.I0 = 0;
                    PipRoundVideoView pipRoundVideoView2 = this.H0;
                    if (pipRoundVideoView2 != null) {
                        pipRoundVideoView2.a(true);
                        this.H0 = null;
                    }
                } else {
                    jj jjVar8 = (jj) this.e0.get(i12);
                    S(jjVar8);
                    if (!jjVar8.h4() && (pipRoundVideoView = this.H0) != null) {
                        pipRoundVideoView.a(true);
                        this.H0 = null;
                    }
                    z14 = false;
                    z15 = true;
                    if (z11) {
                        w0.b.stopService(new Intent(w0.b, (Class<?>) MusicPlayerService.class));
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
        if (!z15 && z12 && !tz.k(true)) {
            org.telegram.ui.un unVar5 = this.s;
            A0(unVar5, z14, z14);
            this.s = unVar5;
        }
        if (!z11 || b5.d.f() == null) {
            return;
        }
        try {
            d6.a c10 = d6.a.c(b5.d.f());
            if (c10 == null) {
                return;
            }
            c10.b().b(true);
        } catch (Exception e10) {
            f8.g(e10, true);
        }
    }

    public final void q0() {
        this.L = true;
        AudioManager audioManager = ot.o0;
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
        int[] iArr = this.a1;
        iArr[1] = Integer.MAX_VALUE;
        iArr[0] = Integer.MAX_VALUE;
        this.X0 = false;
        this.C0 = null;
        this.T1 = null;
    }

    public final void r0(ArrayList arrayList, boolean z10) {
        ArrayList arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
        this.e0 = arrayList2;
        if (arrayList2 != null) {
            this.d0 = z10;
            this.f0 = new SparseArray();
            for (int i10 = 0; i10 < this.e0.size(); i10++) {
                jj jjVar = (jj) this.e0.get(i10);
                this.f0.put(jjVar.f1(), jjVar);
            }
        }
    }

    public final void s(ki.g gVar) {
        File file = (File) gVar.b;
        this.i1 = file;
        long j10 = gVar.a;
        this.j1 = j10;
        byte[] bArr = (byte[]) gVar.c;
        G0(file, j10, bArr == null ? null : (byte[]) bArr.clone());
        if (this.A1 == 3) {
            this.J1 = gVar;
            e0.h hVar = this.E1;
            if (hVar != null) {
                ((ki.k) hVar.e).o();
                hVar.c = true;
                this.E1 = null;
            }
            Y(false);
            j0(false);
            return;
        }
        ui.b0(this.g1).B1(this.l1, this.m1, null);
        if (this.A1 == 1) {
            oz f7 = oz.f(this.e1, null, file.getAbsolutePath(), this.l1, this.p1, this.q1, null, null, null, null, this.B1, this.C1, 0, this.D1 ? Integer.MAX_VALUE : 0, null, null, false);
            f7.R = this.n1;
            f7.T = this.o1;
            f7.H = this.r1;
            f7.K = this.s1;
            f7.Q = 0L;
            qz.C(this.g1).r0(f7);
        }
        zs f10 = zs.f(this.g1);
        Integer valueOf = Integer.valueOf(this.f1);
        int i10 = this.A1;
        f10.k(zs.s2, valueOf, i10 == 2 ? this.e1 : null, i10 == 2 ? file.getAbsolutePath() : null);
        x(true);
    }

    public final void t0() {
        Collections.sort(this.R0, new a4.d(19));
    }

    public final void u0(boolean z10) {
        jj jjVar = this.u0;
        if (jjVar == null) {
            return;
        }
        zs.f(jjVar.I1).k(zs.u2, Boolean.valueOf(this.L));
        u61 u61Var = this.E0;
        if (u61Var != null) {
            u61Var.x0(this.L ? 0 : 3);
            if (z10) {
                R(this.u0, true);
                return;
            }
            if (this.E0.S() < 1000) {
                this.E0.p0(0L);
            }
            this.E0.h0();
            return;
        }
        u61 u61Var2 = this.i0;
        boolean z11 = u61Var2 != null;
        jj jjVar2 = this.u0;
        float f7 = jjVar2.b0;
        int i10 = jjVar2.h0;
        if (z10 || u61Var2 == null || !u61Var2.d0() || i10 * f7 > 1.0f) {
            jjVar2.b0 = f7;
        } else {
            jjVar2.b0 = 0.0f;
        }
        q(false, true, false, false);
        S(jjVar2);
        if (z10) {
            if (z11) {
                i0.h3(new t6(19, this, jjVar2), 100L);
            } else {
                R(jjVar2, true);
            }
        }
    }

    public final void v0(jj jjVar) {
        synchronized (this.z0) {
            Timer timer = this.y0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.y0 = null;
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
            jjVar.S0();
            Timer timer2 = new Timer();
            this.y0 = timer2;
            timer2.schedule(new ve(0, this, jjVar), 0L, 17L);
        }
    }

    public final void w0(org.telegram.ui.un unVar) {
        if (unVar != null) {
            if ((this.f == null && this.n == null) || this.e == null) {
                return;
            }
            if (!tz.k(false)) {
                jj jjVar = this.u0;
                if (jjVar == null) {
                    return;
                }
                if (!jj.R4(jjVar.k) && !this.u0.h4()) {
                    return;
                }
            }
            this.s = unVar;
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
            Utilities.e.c(new qd(this, 3));
            this.P = true;
        }
    }

    public final void x(boolean z10) {
        File file;
        Y(false);
        j0(false);
        e0.h hVar = this.E1;
        if (hVar != null) {
            ((ki.k) hVar.e).o();
            hVar.c = true;
            this.E1 = null;
        }
        if (!z10 && (file = this.i1) != null) {
            c1.b(file);
            this.i1.delete();
        }
        Z();
        this.x0 = false;
        this.r = false;
        this.O = false;
    }

    public final void x0(int i10, long j10, jj jjVar, jj jjVar2, TL_stories.StoryItem storyItem, int i11, boolean z10, sw swVar, long j11, oj ojVar) {
        jj jjVar3 = this.u0;
        boolean z11 = (jjVar3 == null || !I(jjVar3) || H()) ? false : true;
        this.x0 = z10;
        Y(true);
        try {
            this.K0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.G1 && !X()) {
            i0.g3(new td(i10, i11, 0));
            return;
        }
        if (!s0(i10)) {
            if (v2.a) {
                f8.b("AudioRecorder legacy selected: account=" + i10 + ", dialog=" + j10 + ", guid=" + i11);
            }
            rd rdVar = new rd(this, i10, i11, j10, j11, ojVar, jjVar2, jjVar, storyItem, swVar);
            this.K1 = rdVar;
            this.L1.d(rdVar, z11 ? 500L : 50L);
            return;
        }
        this.G1 = true;
        this.H1 = false;
        this.I1 = false;
        this.g1 = i10;
        this.f1 = i11;
        this.l1 = j10;
        this.n1 = j11;
        this.o1 = ojVar;
        this.m1 = jjVar2 == null ? 0L : jj.c2(i10, jjVar2.k, false, false);
        this.p1 = jjVar;
        this.q1 = jjVar2;
        this.r1 = storyItem;
        this.s1 = swVar;
        this.h1 = null;
        this.i1 = null;
        this.j1 = 0L;
        this.k1 = 0;
        this.u1 = 0L;
        this.A1 = 0;
        xd xdVar = new xd(i10, i11, 0, j10, this);
        this.F1 = xdVar;
        i0.h3(xdVar, z11 ? 500L : 50L);
    }

    public final void y0() {
        if (this.b0.isEmpty()) {
            return;
        }
        jf jfVar = (jf) this.b0.get(0);
        x20 x20Var = jfVar.b;
        synchronized (this.b) {
            if (x20Var != null) {
                try {
                    x20Var.W = false;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        new Thread(new a(jfVar, 19)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bi.j4 z() {
        FileOutputStream fileOutputStream;
        android.support.v4.media.session.a0 a0Var;
        hf.d dVar;
        jj jjVar = this.u0;
        FileOutputStream fileOutputStream2 = null;
        String str = null;
        if (jjVar != null) {
            String z12 = jjVar.z1(true);
            String x12 = this.u0.x1(true);
            TLRPC.Document F0 = this.u0.F0();
            if (this.u0.h4() || jj.L4(this.u0.k) || this.u0.I3()) {
                jj jjVar2 = this.u0;
                File file = (!jjVar2.w0 || jjVar2.k == null) ? null : new File(this.u0.k.attachPath);
                if (file == null || !file.exists()) {
                    b8.G(this.u0.I1);
                    file = b8.N(this.u0.k, false, true);
                }
                if (file != null && file.exists()) {
                    String u12 = this.u0.u1();
                    Uri parse = Uri.parse("file://" + file.getAbsolutePath());
                    c6.l lVar = new c6.l(0);
                    cf.a aVar = this.D0;
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
                        short s10 = this.D0.k;
                        Bundle bundle = lVar.b;
                        if (s10 != 0) {
                            c6.l.c(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", s10);
                        }
                        short s11 = this.D0.j;
                        if (s11 != 0) {
                            c6.l.c(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", s11);
                        }
                        cf.a aVar2 = this.D0;
                        if (aVar2.o != null) {
                            File file2 = aVar2.q;
                            if (file2 == null || !file2.exists()) {
                                file2 = vh.n5.w(d20.s0, "jpg");
                                try {
                                    Bitmap bitmap = this.D0.o;
                                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                                    fileOutputStream = new FileOutputStream(file2);
                                    try {
                                        try {
                                            bitmap.compress(compressFormat, 80, fileOutputStream);
                                            try {
                                                fileOutputStream.close();
                                            } catch (Exception e) {
                                                f8.g(e, true);
                                            }
                                        } catch (Exception e7) {
                                            e = e7;
                                            f8.g(e, true);
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception e10) {
                                                    f8.g(e10, true);
                                                }
                                            }
                                            file2 = null;
                                            this.D0.q = file2;
                                            if (file2 != null) {
                                                a0Var = (android.support.v4.media.session.a0) hf.b.e0().b;
                                                dVar = (hf.d) a0Var.b;
                                                if (dVar != null) {
                                                }
                                                str = "/file" + Utilities.c.nextLong();
                                                if (((hf.d) a0Var.b) == null) {
                                                }
                                                ((hf.d) a0Var.b).l(file2, str);
                                                lVar.a.add(new m6.a(Uri.parse(hf.d.j(hf.d.i(), str)), 0, 0));
                                            }
                                            hf.e eVar = new hf.e(parse, u12, "/player_" + this.u0.f1());
                                            eVar.e = z12;
                                            eVar.f = x12;
                                            eVar.h = lVar;
                                            return new bi.j4(new hf.f(eVar));
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        fileOutputStream2 = fileOutputStream;
                                        if (fileOutputStream2 != null) {
                                            try {
                                                fileOutputStream2.close();
                                            } catch (Exception e11) {
                                                f8.g(e11, true);
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Exception e12) {
                                    e = e12;
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
                                a0Var = (android.support.v4.media.session.a0) hf.b.e0().b;
                                dVar = (hf.d) a0Var.b;
                                if (dVar != null) {
                                    Pair pair = dVar.i;
                                    if ((pair == null ? null : (File) pair.second) != null) {
                                        if (TextUtils.equals((pair == null ? null : (File) pair.second).getAbsolutePath(), file2.getAbsolutePath())) {
                                            Pair pair2 = ((hf.d) a0Var.b).i;
                                            if (pair2 != null) {
                                                str = (String) pair2.first;
                                            }
                                            lVar.a.add(new m6.a(Uri.parse(hf.d.j(hf.d.i(), str)), 0, 0));
                                        }
                                    }
                                }
                                str = "/file" + Utilities.c.nextLong();
                                if (((hf.d) a0Var.b) == null) {
                                    a0Var.b = new hf.d();
                                }
                                ((hf.d) a0Var.b).l(file2, str);
                                lVar.a.add(new m6.a(Uri.parse(hf.d.j(hf.d.i(), str)), 0, 0));
                            }
                        }
                    }
                    hf.e eVar2 = new hf.e(parse, u12, "/player_" + this.u0.f1());
                    eVar2.e = z12;
                    eVar2.f = x12;
                    eVar2.h = lVar;
                    return new bi.j4(new hf.f(eVar2));
                }
            }
            u61 u61Var = this.E0;
            if (u61Var != null) {
                return u61Var.Q(a1.g.q(new StringBuilder(), F0 != null ? F0.id : this.u0.f1(), ""), z12, x12);
            }
            u61 u61Var2 = this.i0;
            if (u61Var2 != null) {
                return u61Var2.Q(a1.g.q(new StringBuilder(), F0 != null ? F0.id : this.u0.f1(), ""), z12, x12);
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
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
