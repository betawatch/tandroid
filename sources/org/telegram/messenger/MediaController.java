package org.telegram.messenger;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import android.util.Property;
import android.util.SparseArray;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.FrameLayout;
import android.widget.ImageView;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class MediaController implements AudioManager.OnAudioFocusChangeListener, fn7, SensorEventListener {
    public static final String[] W1;
    public static final String[] X1;
    public static final ConcurrentHashMap Y1;
    public static Runnable Z1;
    public static do6 a2;
    public static do6 b2;
    public static ArrayList c2;
    public static ArrayList d2;
    public static st e2;
    public static volatile MediaController f2;
    public static long g2;
    public static boolean h2;
    public boolean B0;
    public boolean C0;
    public byte C1;
    public oo6 D0;
    public boolean D1;
    public byte E;
    public h00 E0;
    public int E1;
    public int F;
    public kfc F0;
    public boolean F1;
    public int G;
    public boolean G0;
    public v20 G1;
    public long H;
    public TextureView H0;
    public gn6 H1;
    public io9 I0;
    public boolean I1;
    public boolean J;
    public ImageView J0;
    public boolean J1;
    public boolean K;
    public LaunchActivity K0;
    public boolean K1;
    public ViewGroup L0;
    public n20 L1;
    public boolean M;
    public jx M0;
    public en6 M1;
    public boolean N;
    public boolean N0;
    public final to3 N1;
    public boolean O;
    public FrameLayout O0;
    public final to3 O1;
    public boolean P;
    public float P0;
    public boolean Q;
    public boolean Q0;
    public float Q1;
    public float R;
    public pc7 R0;
    public ValueAnimator R1;
    public tv T1;
    public boolean U1;
    public byte V;
    public int V0;
    public qo6 V1;
    public boolean W;
    public boolean W0;
    public boolean X;
    public boolean Y0;
    public boolean Z;
    public long Z0;
    public final a00 a;
    public int a1;
    public so6 b0;
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
    public b77 q1;
    public boolean r;
    public r47 r1;
    public zu1 s;
    public r47 s1;
    public TL_stories.StoryItem t1;
    public float u0;
    public c5a u1;
    public r47 v0;
    public boolean w;
    public r47 w0;
    public long w1;
    public long x;
    public lo6 x0;
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
    public kfc j0 = null;
    public kfc k0 = null;
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
    public final xn6 d1 = new xn6(this);
    public int h1 = -1;
    public short[] v1 = new short[1024];
    public final Object x1 = new Object();
    public final ArrayList y1 = new ArrayList();
    public int A1 = 1280;
    public char B1 = 48000;
    public final zz3 P1 = new zz3(this, 24);
    public final ce0 S1 = new ce0(this, 8);

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
        this.a = new a00(this, b);
        Handler handler = null;
        byte b3 = 2;
        to3 to3Var = new to3("recordQueue");
        this.N1 = to3Var;
        to3Var.setPriority(10);
        to3 to3Var2 = new to3("fileEncodingQueue");
        this.O1 = to3Var2;
        to3Var2.setPriority(10);
        to3Var.c(new cn6(this, (byte) 0));
        Utilities.e.c(new cn6(this, b));
        this.z1 = ByteBuffer.allocateDirect(1920);
        hl.c3(new cn6(this, b3));
        ContentResolver contentResolver = a.b.getContentResolver();
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, new pd1(handler, b));
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Images.Media.INTERNAL_CONTENT_URI, true, new pd1(handler, b3));
        } catch (Exception e3) {
            cc4.g(e3, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, true, new pd1(handler, b));
        } catch (Exception e4) {
            cc4.g(e4, true);
        }
        try {
            contentResolver.registerContentObserver(MediaStore.Video.Media.INTERNAL_CONTENT_URI, true, new pd1(handler, b3));
        } catch (Exception e5) {
            cc4.g(e5, true);
        }
    }

    public static int C(String str) {
        int i;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            i = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
        } catch (Exception e) {
            cc4.g(e, true);
            i = 0;
        }
        try {
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            cc4.g(th, true);
        }
        return i;
    }

    public static boolean F(Uri uri) {
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
                                cc4.g(e, true);
                                return true;
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                cc4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    cc4.g(e5, true);
                }
            }
            throw th;
        }
    }

    public static boolean L(Uri uri) {
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
                                    cc4.g(e, true);
                                    return true;
                                }
                            }
                        }
                    }
                    inputStream.close();
                    return false;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    return false;
                }
            } catch (Exception e4) {
                cc4.g(e4, true);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception e5) {
                    cc4.g(e5, true);
                }
            }
            throw th;
        }
    }

    public static void M0(File file, File file2, OutputStream outputStream, boolean[] zArr) {
        String n = ik8.n(file2.length(), "<?xpacket begin=\"\ufeff\" id=\"W5M0MpCehiHzreSzNTczkc9d\"?><x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"\" xmlns:GCamera=\"http://ns.google.com/photos/1.0/camera/\" xmlns:Container=\"http://ns.google.com/photos/1.0/container/\" xmlns:Item=\"http://ns.google.com/photos/1.0/container/item/\" GCamera:MotionPhoto=\"1\" GCamera:MotionPhotoVersion=\"1\" GCamera:MotionPhotoPresentationTimestampUs=\"0\"><Container:Directory><rdf:Seq><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"image/jpeg\" Item:Semantic=\"Primary\" Item:Length=\"0\" Item:Padding=\"0\"/></rdf:li><rdf:li rdf:parseType=\"Resource\"><Container:Item Item:Mime=\"video/mp4\" Item:Semantic=\"MotionPhoto\" Item:Length=\"", "\" Item:Padding=\"0\"/></rdf:li></rdf:Seq></Container:Directory></rdf:Description></rdf:RDF></x:xmpmeta><?xpacket end=\"w\"?>");
        byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes("UTF-8");
        byte[] bytes2 = n.getBytes("UTF-8");
        int length = bytes.length + bytes2.length + 2;
        if (length > 65535) {
            su3.e(uh9.k(length, "XMP segment too large: "));
            return;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read();
            int read2 = fileInputStream.read();
            if (read != 255 || read2 != 216) {
                throw new IOException("Not a JPEG: " + file);
            }
            outputStream.write(jn7.d4);
            outputStream.write(jn7.s3);
            outputStream.write(jn7.d4);
            outputStream.write(jn7.B3);
            outputStream.write((length >> 8) & jn7.d4);
            outputStream.write(length & jn7.d4);
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

    public static void R(int i) {
        Thread thread = new Thread(new gw0(i, (byte) 6));
        thread.setPriority(1);
        thread.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int T(int i, int i2, int i3, int i4, int i5) {
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
                int C = (int) (((int) xnb.C(f, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i5 * i4)));
                return i3 >= C ? min : min > i6 ? i6 : Math.max(min, C);
            }
            i6 = 2600000;
        }
        f = 1.0f;
        int min2 = (int) (((int) (i3 / Math.min(i / i4, i2 / i5))) * f3);
        int C2 = (int) (((int) xnb.C(f, 2000.0f, 1000.0f, 1.13f)) / (921600.0f / (i5 * i4)));
        if (i3 >= C2) {
        }
    }

    public static native boolean cropOpusFile(String str, String str2, long j, long j2);

    public static void f0(String str, String str2, Context context, pcc pccVar) {
        id idVar;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || context == null) {
            return;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists() || !file2.exists()) {
            g0(str, context, 0, null, null, pccVar);
            return;
        }
        if (hl.G1(Uri.fromFile(file), 0) || hl.G1(Uri.fromFile(file2), 0)) {
            return;
        }
        byte b = 1;
        boolean[] zArr = {false};
        boolean[] zArr2 = new boolean[1];
        try {
            id idVar2 = new id(2, null, context);
            idVar2.m(ob6.M0(2131748533, null));
            idVar2.setCanceledOnTouchOutside(false);
            idVar2.setCancelable(true);
            idVar2.setOnCancelListener(new zn1(zArr, (byte) 3));
            hl.d3(new in6(zArr2, idVar2, b), 250L);
            idVar = idVar2;
        } catch (Exception e) {
            cc4.g(e, true);
            idVar = null;
        }
        new Thread(new z87(file, file2, zArr, pccVar, idVar, zArr2)).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void g0(String str, Context context, int i, String str2, String str3, pcc pccVar) {
        File file;
        id idVar;
        if (str == null || context == null) {
            return;
        }
        byte b = 0;
        if (!TextUtils.isEmpty(str)) {
            File file2 = new File(str);
            if (file2.exists() && !hl.G1(Uri.fromFile(file2), 0)) {
                file = file2;
                if (file == null) {
                    boolean[] zArr = {false};
                    if (file.exists()) {
                        boolean[] zArr2 = new boolean[1];
                        if (i != 0) {
                            try {
                                id idVar2 = new id(2, null, context);
                                idVar2.m(ob6.M0(2131748533, null));
                                idVar2.setCanceledOnTouchOutside(false);
                                idVar2.setCancelable(true);
                                idVar2.setOnCancelListener(new zn1(zArr, (byte) 2));
                                hl.d3(new in6(zArr2, idVar2, b), 250L);
                                idVar = idVar2;
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                            new Thread(new a84(i, file, str2, idVar, zArr, str3, pccVar, zArr2)).start();
                            return;
                        }
                        idVar = null;
                        new Thread(new a84(i, file, str2, idVar, zArr, str3, pccVar, zArr2)).start();
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

    public static native byte[] getWaveform(String str);

    public static Uri h0(int i, File file, String str) {
        Uri contentUri;
        try {
            ContentValues contentValues = new ContentValues();
            String D = xb4.D(file);
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
                    str = hl.p0(0, D);
                }
                contentUri = MediaStore.Images.Media.getContentUri("external_primary");
                contentValues.put("relative_path", new File(Environment.DIRECTORY_PICTURES, "Telegram") + File.separator);
                contentValues.put("_display_name", str);
                contentValues.put("mime_type", mimeTypeFromExtension);
            } else if (i == 1) {
                if (str == null) {
                    str = hl.p0(1, D);
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
                hl.D(fileInputStream, a.b.getContentResolver().openOutputStream(insert));
                fileInputStream.close();
            }
            return insert;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public static void i0(Context context, k5 k5Var, ArrayList arrayList, df7 df7Var) {
        if (arrayList.isEmpty()) {
            return;
        }
        jo6 jo6Var = new jo6();
        jo6Var.d = new HashMap();
        jo6Var.a = k5Var;
        jo6Var.c = arrayList;
        jo6Var.s = df7Var;
        jo6Var.w = ((r47) arrayList.get(0)).I3();
        int i = k5Var.a;
        jn7.f(i).a(jo6Var, jn7.Y1);
        jn7.f(i).a(jo6Var, jn7.X1);
        jn7.f(i).a(jo6Var, jn7.Z1);
        id idVar = new id(2, PhotoViewer.q0().V0() ? new x53() : null, context);
        jo6Var.b = idVar;
        idVar.m(ob6.M0(2131748533, null));
        idVar.setCancelable(true);
        idVar.I = true;
        idVar.setOnCancelListener(new cs0(jo6Var, (byte) 12));
        hl.d3(new io6(jo6Var, (byte) 1), 250L);
        new Thread(new io6(jo6Var, (byte) 2)).start();
    }

    public static native int isOpusFile(String str);

    public static native boolean joinOpusFiles(String str, String str2, String str3);

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        if (r1.getProfileConnectionState(1) != 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void l0(boolean z) {
        AudioManager audioManager = (AudioManager) a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        if (xea.r0 && !jve.d("android.permission.BLUETOOTH_CONNECT")) {
            xea.r0 = false;
            xea.x();
        }
        if (!(audioManager.isBluetoothScoAvailableOffCall() && xea.r0) && z) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            try {
            } catch (SecurityException unused) {
                return;
            } catch (Throwable th) {
                cc4.g(th, true);
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
    
        cc4.g(r0, true);
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
    public static String q(long j, Uri uri, String str) {
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
                String q = xb4.q(y(uri));
                if (q == null) {
                    int p = xea.p();
                    xea.x();
                    Locale locale = Locale.US;
                    q = p + "." + str;
                }
                file = hl.f1();
                try {
                    file.mkdirs();
                    if (!hl.G1(Uri.fromFile(file), 0)) {
                        int i3 = 0;
                        do {
                            File f1 = hl.f1();
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
                                    if (hl.G1(null, ((Integer) r8.invoke(fileInputStream.getFD(), null)).intValue())) {
                                        try {
                                            inputStream.close();
                                        } catch (Exception e) {
                                            cc4.g(e, true);
                                        }
                                        if (j > 0) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                    cc4.g(th2, true);
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
                                                    cc4.g(e3, true);
                                                }
                                                try {
                                                    r8.close();
                                                } catch (Exception e4) {
                                                    cc4.g(e4, true);
                                                }
                                                if (j > 0) {
                                                }
                                            }
                                        }
                                    } catch (Exception e5) {
                                        e = e5;
                                        i2 = i;
                                        cc4.g(e, true);
                                        if (inputStream != null) {
                                            try {
                                                inputStream.close();
                                            } catch (Exception e6) {
                                                cc4.g(e6, true);
                                            }
                                        }
                                        if (r8 != 0) {
                                            try {
                                                r8.close();
                                            } catch (Exception e7) {
                                                cc4.g(e7, true);
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
                                                cc4.g(e8, true);
                                            }
                                        }
                                        if (fileOutputStream != null) {
                                            try {
                                                fileOutputStream.close();
                                            } catch (Exception e9) {
                                                cc4.g(e9, true);
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
            cc4.g(e14, true);
        }
        if (j > 0) {
            file.delete();
        }
        return absolutePath;
    }

    public static File r(String str) {
        File file;
        try {
            File f1 = hl.f1();
            f1.mkdirs();
            if (hl.G1(Uri.fromFile(f1), 0)) {
                return null;
            }
            int i = 0;
            do {
                File f12 = hl.f1();
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
            cc4.g(e, true);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int s(int i, int i2, int i3, boolean z) {
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

    private native int startRecord(String str, int i);

    private native void stopRecord();

    public static int t(MediaExtractor mediaExtractor, boolean z) {
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

    public static boolean v() {
        try {
            for (AudioDeviceInfo audioDeviceInfo : ip7.p0.getDevices(2)) {
                int type = audioDeviceInfo.getType();
                if ((type == 8 || type == 7 || type == 26 || type == 27 || type == 4 || type == 3) && audioDeviceInfo.isSink()) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            cc4.g(e, true);
            return false;
        }
    }

    public static boolean v0(int i) {
        im0 im0Var = phd.b;
        im0Var.a();
        if (!im0Var.c) {
            return !uc7.s1(i).k4.s0.f;
        }
        im0Var.a();
        return im0Var.d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native int writeFrame(ByteBuffer byteBuffer, int i);

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054 A[Catch: Exception -> 0x0067, TryCatch #4 {Exception -> 0x0067, blocks: (B:7:0x0008, B:12:0x0054, B:14:0x0061, B:44:0x004d), top: B:6:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String y(Uri uri) {
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
                    cc4.g(e, true);
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
            cc4.g(e4, true);
            return "";
        }
    }

    public static MediaController z() {
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

    public final float A(boolean z) {
        return z ? this.r0 : this.q0;
    }

    public final void A0(zu1 zu1Var) {
        if (zu1Var != null) {
            if ((this.f == null && this.n == null) || this.e == null) {
                return;
            }
            if (!xea.k(false)) {
                r47 r47Var = this.v0;
                if (r47Var == null) {
                    return;
                }
                if (!r47.Q4(r47Var.k) && !this.v0.g4()) {
                    return;
                }
            }
            this.s = zu1Var;
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
            Utilities.e.c(new cn6(this, (byte) 4));
            this.Q = true;
        }
    }

    public final long B(r47 r47Var) {
        r47 r47Var2 = this.v0;
        if ((this.j0 != null || this.F0 != null) && r47Var != null && r47Var2 != null && K(r47Var)) {
            try {
                kfc kfcVar = this.j0;
                if (kfcVar != null) {
                    return kfcVar.S();
                }
                kfc kfcVar2 = this.F0;
                if (kfcVar2 != null) {
                    return kfcVar2.S();
                }
            } catch (Exception unused) {
            }
        }
        return -1L;
    }

    public final void B0(int i, long j, r47 r47Var, r47 r47Var2, TL_stories.StoryItem storyItem, int i2, boolean z, c5a c5aVar, long j2, b77 b77Var) {
        r47 r47Var3 = this.v0;
        boolean z2 = (r47Var3 == null || !H(r47Var3) || G()) ? false : true;
        this.y0 = z;
        b0(true);
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (this.I1 && !a0()) {
            hl.c3(new zs2(i, i2, (byte) 5));
            return;
        }
        if (!v0(i)) {
            if (f11.a) {
                cc4.b("AudioRecorder legacy selected: account=" + i + ", dialog=" + j + ", guid=" + i2);
            }
            en6 en6Var = new en6(this, i, i2, j, j2, b77Var, r47Var2, r47Var, storyItem, c5aVar);
            this.M1 = en6Var;
            this.N1.d(en6Var, z2 ? 500L : 50L);
            return;
        }
        this.I1 = true;
        this.J1 = false;
        this.K1 = false;
        this.i1 = i;
        this.h1 = i2;
        this.n1 = j;
        this.p1 = j2;
        this.q1 = b77Var;
        this.o1 = r47Var2 == null ? 0L : r47.b2(i, r47Var2.k, false, false);
        this.r1 = r47Var;
        this.s1 = r47Var2;
        this.t1 = storyItem;
        this.u1 = c5aVar;
        this.j1 = null;
        this.k1 = null;
        this.l1 = 0L;
        this.m1 = 0;
        this.w1 = 0L;
        this.C1 = (byte) 0;
        gn6 gn6Var = new gn6(this, i, j, i2, (byte) 0);
        this.H1 = gn6Var;
        hl.d3(gn6Var, z2 ? 500L : 50L);
    }

    public final void C0() {
        if (this.c0.isEmpty()) {
            return;
        }
        so6 so6Var = (so6) this.c0.get(0);
        oec oecVar = so6Var.b;
        synchronized (this.b) {
            if (oecVar != null) {
                oecVar.V = false;
            }
        }
        new Thread(new z96(so6Var, (byte) 16)).start();
    }

    public final boolean D() {
        ArrayList arrayList;
        r47 r47Var = this.v0;
        return r47Var == null || !(r47.Q4(r47Var.k) || this.v0.g4()) || (arrayList = this.f0) == null || arrayList.size() <= 1 || !this.f0.contains(this.v0) || this.f0.indexOf(this.v0) >= this.f0.size() - 1;
    }

    public final void D0() {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    public final void E() {
        ImageView imageView = this.J0;
        if (imageView != null) {
            hl.B2(imageView);
            this.J0.setImageDrawable(null);
            this.J0 = null;
        }
    }

    public final void E0(zu1 zu1Var, boolean z, boolean z2) {
        if (this.P) {
            this.P = false;
            return;
        }
        if (z2) {
            if (this.g1 == null || J()) {
                F0(z ? 2 : 0, 0, false, false);
            } else {
                H0(false);
            }
        }
        if (!this.Q || this.P) {
            return;
        }
        if ((this.f == null && this.n == null) || this.e == null || this.s != zu1Var) {
            return;
        }
        this.s = null;
        this.Q = false;
        this.w = false;
        this.J = false;
        this.r = false;
        this.M = false;
        Utilities.e.c(new cn6(this, (byte) 3));
        PowerManager.WakeLock wakeLock = this.d;
        if (wakeLock == null || !wakeLock.isHeld()) {
            return;
        }
        this.d.release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F0(final int i, final int i2, final boolean z, final boolean z2) {
        v20 v20Var;
        if (!this.I1) {
            en6 en6Var = this.M1;
            to3 to3Var = this.N1;
            if (en6Var != null) {
                to3Var.a(en6Var);
                this.M1 = null;
            }
            to3Var.c(new Runnable() { // from class: qn6
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
                        mediaController.G0(b3, i3, z3, z4);
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
                        MediaController.l0(false);
                    } catch (Exception e) {
                        cc4.g(e, true);
                        if (mediaController.k1 != null) {
                            if (f11.a) {
                                cc4.d("delete voice file");
                            }
                            mediaController.k1.delete();
                        }
                    }
                    if (b3 == 0) {
                        mediaController.G0(0, 0, false, false);
                    }
                    try {
                        mediaController.L0.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    hl.c3(new gw1(mediaController, b3, (byte) 4));
                }
            });
            return;
        }
        n20 n20Var = this.L1;
        if (n20Var != null) {
            this.L1 = null;
            if (i == 0) {
                u(false);
                return;
            }
            this.C1 = i;
            this.D1 = z;
            this.E1 = i2;
            this.F1 = z2;
            p(n20Var);
            return;
        }
        if (this.J1) {
            if (this.C1 == 3) {
                this.C1 = i;
                this.D1 = z;
                this.E1 = i2;
                this.F1 = z2;
                if (i == 0) {
                    v20 v20Var2 = this.G1;
                    if (v20Var2 != null) {
                        v20Var2.g = false;
                        v20Var2.b.b();
                    }
                    u(false);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2 && (v20Var = this.G1) != null && v20Var.b()) {
            this.y0 = false;
            this.r = false;
            this.P = false;
            return;
        }
        gn6 gn6Var = this.H1;
        if (gn6Var != null) {
            hl.r(gn6Var);
            this.H1 = null;
        }
        this.J1 = true;
        this.C1 = i;
        this.D1 = z;
        this.E1 = i2;
        this.F1 = z2;
        v20 v20Var3 = this.G1;
        if (v20Var3 == null) {
            u(false);
        } else {
            i30 i30Var = v20Var3.b;
            if (i == 0) {
                v20Var3.g = false;
                i30Var.b();
                u(false);
            } else {
                v20Var3.g = true;
                i30Var.getClass();
                i30.q();
                int i3 = i30Var.e().a;
                if (v20Var3.g && (i3 == 3 || i3 == 5)) {
                    v20Var3.g = false;
                    i30Var.h();
                }
            }
        }
        try {
            this.L0.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        final int i4 = this.i1;
        final int i5 = this.h1;
        hl.c3(new Runnable() { // from class: fn6
            @Override // java.lang.Runnable
            public final void run() {
                String[] strArr = MediaController.W1;
                jn7.f(i4).k(jn7.n2, Integer.valueOf(i5), Integer.valueOf(i == 2 ? 1 : 0));
            }
        });
    }

    public final boolean G() {
        return this.h0 || this.B0;
    }

    public final void G0(final int i, final int i2, final boolean z, final boolean z2) {
        final MediaController mediaController;
        final File file;
        if (i == 0 || (file = this.k1) == null) {
            mediaController = this;
            u60.b(mediaController.k1);
            File file2 = mediaController.k1;
            if (file2 != null) {
                file2.delete();
            }
            mediaController.b0(false);
        } else {
            final TLRPC.TL_document tL_document = this.g1;
            final File file3 = this.j1;
            if (f11.a) {
                cc4.b("stop recording internal filename " + this.k1.getPath());
            }
            mediaController = this;
            mediaController.O1.c(new Runnable() { // from class: jn6
                @Override // java.lang.Runnable
                public final void run() {
                    String[] strArr = MediaController.W1;
                    MediaController.this.O(file3, file, tL_document, i, z, i2, z2);
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
            cc4.g(e, true);
        }
        mediaController.g1 = null;
        mediaController.j1 = null;
        mediaController.k1 = null;
        mediaController.y0 = false;
        mediaController.r = false;
        mediaController.P = false;
    }

    public final boolean H(r47 r47Var) {
        r47 r47Var2;
        boolean z;
        if (r47Var != null && r47Var.j2) {
            return false;
        }
        if ((this.j0 == null && this.F0 == null) || r47Var == null || (r47Var2 = this.v0) == null) {
            return false;
        }
        long j = r47Var2.T;
        if (j != 0 && j == r47Var.T) {
            z = this.B0;
        } else {
            if (!K(r47Var)) {
                return false;
            }
            z = this.B0;
        }
        return !z;
    }

    public final void H0(boolean z) {
        if (!this.I1) {
            this.N1.c(new dn6(this, z, r1));
            return;
        }
        this.K1 = z;
        v20 v20Var = this.G1;
        if (v20Var != null) {
            if (v20Var.b()) {
                b0(true);
                l0(true);
            }
            v20 v20Var2 = this.G1;
            i30 i30Var = v20Var2.b;
            i30Var.getClass();
            i30.q();
            int i = i30Var.e().a;
            if (i == 6) {
                v20Var2.i = !v20Var2.i;
                return;
            }
            v20Var2.i = false;
            if (i == 3) {
                v20Var2.b.n();
                return;
            }
            if (i == 5) {
                i30 i30Var2 = v20Var2.b;
                i30Var2.getClass();
                i30.q();
                if (i30Var2.G == 5) {
                    i30Var2.h.b("resume requested: trim=" + i30Var2.r + ".." + i30Var2.s + ", sourceDurationMs=" + i30Var2.j());
                    i30Var2.p();
                    i30Var2.s(6);
                    g30 g30Var = i30Var2.z;
                    if (g30Var == null) {
                        i30Var2.g(new IllegalStateException("Output generation is missing"));
                        return;
                    }
                    long j = i30Var2.r;
                    long j2 = i30Var2.s;
                    r1 = j2 >= i30.r(i30Var2.p) ? (byte) 1 : (byte) 0;
                    i30Var2.k(1);
                    long j3 = ((j2 - j) * 48000) / 1000;
                    i30Var2.p = j3;
                    i30Var2.r = 0L;
                    i30Var2.s = i30.r(j3);
                    i30Var2.d();
                    i30Var2.h.b("resume prefix selected: source=" + g30Var.b.getName() + ", trim=" + j + ".." + j2);
                    File file = g30Var.b;
                    if (r1 != 0) {
                        j2 = -1;
                    }
                    i30Var2.u(j, j2, file);
                }
            }
        }
    }

    public final boolean I() {
        return (this.M1 == null && this.H1 == null && this.g1 == null) ? false : true;
    }

    public final boolean I0(int i, ArrayList arrayList) {
        r47 r47Var;
        int i2;
        r47 r47Var2;
        int i3 = this.V0;
        boolean z = ConnectionsManager.getInstance(yac.t0).getConnectionState() == 2;
        this.V0 += i;
        if (z) {
            while (this.V0 < arrayList.size() && (i2 = this.V0) >= 0 && ((r47Var2 = (r47) arrayList.get(i2)) == null || !r47Var2.z0)) {
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
                    r47Var = (r47) arrayList.get(i5);
                    if (r47Var == null && r47Var.z0) {
                        break;
                    }
                    this.V0 += i;
                } else {
                    if (i5 < i3) {
                        break;
                    }
                    r47Var = (r47) arrayList.get(i5);
                    if (r47Var == null) {
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

    public final boolean J() {
        if (!this.I1) {
            return this.e1;
        }
        v20 v20Var = this.G1;
        return v20Var != null && v20Var.b();
    }

    public final void J0() {
        r47 r47Var = this.v0;
        if (r47Var != null && G() && this.i0 && (r47.Q4(r47Var.k) || r47Var.I3())) {
            V(r47Var);
        }
        this.i0 = false;
    }

    public final boolean K(r47 r47Var) {
        r47 r47Var2 = this.v0;
        if (r47Var2 != null && r47.B0(r47Var2.k) == r47.B0(r47Var.k) && this.v0.e1() == r47Var.e1()) {
            if ((this.v0.T == 0) == (r47Var.T == 0)) {
                return true;
            }
        }
        return false;
    }

    public final void K0(File file, long j, byte[] bArr) {
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

    public final void L0(r47 r47Var, int[] iArr, boolean z, boolean z2, int i) {
        r47 r47Var2;
        if (this.F0 != null) {
            if (i == 4 || i == 1) {
                try {
                    this.K0.getWindow().clearFlags(128);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            } else {
                try {
                    this.K0.getWindow().addFlags(128);
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
            }
            xn6 xn6Var = this.d1;
            if (i == 3) {
                this.G0 = true;
                r47 r47Var3 = this.v0;
                if (r47Var3 != null && (r47.K4(r47Var3.k) || this.v0.g4())) {
                    hl.r(xn6Var);
                    xb4.G(r47Var.K1).Z(this.v0.F0(), true, false);
                }
                this.Q0 = true;
                return;
            }
            if (i == 2) {
                if (!z2 || (r47Var2 = this.v0) == null) {
                    return;
                }
                if (r47.K4(r47Var2.k) || this.v0.g4()) {
                    if (this.G0) {
                        xn6Var.run();
                        return;
                    } else {
                        hl.d3(xn6Var, 1000L);
                        return;
                    }
                }
                return;
            }
            if (this.F0.c0() && i == 4) {
                r47 r47Var4 = this.v0;
                if (r47Var4 == null || !r47.K4(r47Var4.k) || z || (iArr != null && iArr[0] >= 4)) {
                    if (d0()) {
                        return;
                    }
                    m(true, D(), true, false);
                } else {
                    this.F0.o0(0L);
                    if (iArr != null) {
                        iArr[0] = iArr[0] + 1;
                    }
                }
            }
        }
    }

    public final File M(File file, File file2, TLRPC.TL_document tL_document) {
        if (file != null && file2 != null) {
            un6 un6Var = new un6(xb4.z(1), System.currentTimeMillis() + "_" + xb4.r(null, tL_document));
            if (joinOpusFiles(file.getAbsolutePath(), file2.getAbsolutePath(), un6Var.getAbsolutePath())) {
                file2.delete();
                if (file2 == this.k1) {
                    this.k1 = un6Var;
                }
                file2 = un6Var;
            }
            file.delete();
            if (file == this.j1) {
                this.j1 = null;
            }
        }
        return file2;
    }

    public final void N(final int i, final int i2, long j, long j2, b77 b77Var, r47 r47Var, r47 r47Var2, TL_stories.StoryItem storyItem, c5a c5aVar) {
        String absolutePath;
        final byte b = 0;
        if (this.f1 != null) {
            hl.c3(new Runnable(this) { // from class: hn6
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
                            jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                            break;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                            break;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                            break;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(jn7.l2, Integer.valueOf(i3), Boolean.TRUE);
                            break;
                    }
                }
            });
            return;
        }
        final byte b3 = 1;
        l0(true);
        this.C1 = (byte) 0;
        TLRPC.TL_document tL_document = new TLRPC.TL_document();
        this.g1 = tL_document;
        this.h1 = i2;
        tL_document.file_reference = new byte[0];
        tL_document.dc_id = TLObject.FLAG_31;
        tL_document.id = xea.p();
        this.g1.user_id = yac.h(i).e();
        TLRPC.TL_document tL_document2 = this.g1;
        tL_document2.mime_type = "audio/ogg";
        tL_document2.file_reference = new byte[0];
        xea.x();
        this.k1 = new wn6(xb4.z(1), System.currentTimeMillis() + "_" + xb4.r(null, this.g1));
        xb4.z(4).mkdirs();
        if (f11.a) {
            cc4.b("start recording internal " + this.k1.getPath() + " " + this.k1.exists());
        }
        File file = this.k1;
        Set set = u60.a;
        if (file != null && (absolutePath = file.getAbsolutePath()) != null) {
            u60.a.add(absolutePath);
        }
        try {
            if (startRecord(this.k1.getPath(), this.B1) == 0) {
                hl.c3(new Runnable(this) { // from class: hn6
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
                                jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                                break;
                            case 1:
                                String[] strArr2 = MediaController.W1;
                                mediaController.M1 = null;
                                jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                                break;
                            case 2:
                                String[] strArr3 = MediaController.W1;
                                mediaController.M1 = null;
                                jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                                break;
                            default:
                                String[] strArr4 = MediaController.W1;
                                mediaController.M1 = null;
                                jn7.f(i4).k(jn7.l2, Integer.valueOf(i3), Boolean.TRUE);
                                break;
                        }
                    }
                });
                if (f11.a) {
                    cc4.b("cant init encoder");
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
            this.q1 = b77Var;
            this.o1 = r47Var != null ? r47.b2(this.i1, r47Var.k, false, false) : 0L;
            this.i1 = i;
            this.r1 = r47Var2;
            this.s1 = r47Var;
            this.t1 = storyItem;
            this.u1 = c5aVar;
            this.z1.rewind();
            this.f1.startRecording();
            this.N1.c(this.P1);
            final byte b4 = 3;
            hl.c3(new Runnable(this) { // from class: hn6
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
                            jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                            break;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                            break;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                            break;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(jn7.l2, Integer.valueOf(i3), Boolean.TRUE);
                            break;
                    }
                }
            });
        } catch (Exception e) {
            cc4.g(e, true);
            this.g1 = null;
            stopRecord();
            u60.b(this.k1);
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
                cc4.g(e3, true);
            }
            l0(false);
            final byte b5 = 2;
            hl.c3(new Runnable(this) { // from class: hn6
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
                            jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                            break;
                        case 1:
                            String[] strArr2 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                            break;
                        case 2:
                            String[] strArr3 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(jn7.m2, Integer.valueOf(i3));
                            break;
                        default:
                            String[] strArr4 = MediaController.W1;
                            mediaController.M1 = null;
                            jn7.f(i4).k(jn7.l2, Integer.valueOf(i3), Boolean.TRUE);
                            break;
                    }
                }
            });
        }
    }

    public final /* synthetic */ void O(File file, File file2, final TLRPC.TL_document tL_document, final int i, final boolean z, final int i2, final boolean z2) {
        stopRecord();
        final File M = M(file, file2, tL_document);
        if (M == null) {
            if (f11.a) {
                cc4.b("stop recording recordingAudioFileToSend == null in queue");
                return;
            }
            return;
        }
        if (f11.a) {
            cc4.b("stop recording internal in queue " + M.exists() + " " + M.length());
        }
        hl.c3(new Runnable() { // from class: on6
            @Override // java.lang.Runnable
            public final void run() {
                boolean z3;
                char c;
                byte b;
                String str;
                String[] strArr = MediaController.W1;
                MediaController mediaController = MediaController.this;
                mediaController.getClass();
                boolean z4 = f11.a;
                File file3 = M;
                if (z4) {
                    cc4.b("stop recording internal ".concat(file3.exists() + " " + file3.length() + "  recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1));
                }
                if (!file3.exists()) {
                    cc4.g(new RuntimeException("file not found :( recordTimeCount " + mediaController.l1 + " writedFrames" + mediaController.m1), true);
                }
                ls6.d0(mediaController.i1).D1(mediaController.n1, mediaController.o1, null);
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
                        p7a f = p7a.f(tL_document2, null, file3.getAbsolutePath(), mediaController.n1, mediaController.r1, mediaController.s1, null, null, null, null, z, i2, 0, z2 ? Integer.MAX_VALUE : 0, null, null, false);
                        f.R = mediaController.p1;
                        f.T = mediaController.q1;
                        f.H = mediaController.t1;
                        f.K = mediaController.u1;
                        f.Q = 0L;
                        r7a.B(mediaController.i1).q0(f);
                    } else {
                        c = 1;
                        b = 2;
                        z3 = false;
                    }
                    jn7 f3 = jn7.f(mediaController.i1);
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
                    f3.k(jn7.s2, objArr);
                } else {
                    z3 = false;
                    jn7.f(mediaController.i1).k(jn7.t2, Integer.valueOf(mediaController.h1), Boolean.FALSE, Integer.valueOf((int) j));
                    u60.b(file3);
                    file3.delete();
                }
                mediaController.b0(z3);
            }
        });
    }

    public final /* synthetic */ void P(boolean z) {
        stopRecord();
        TLRPC.TL_document tL_document = this.g1;
        File M = M(this.j1, this.k1, tL_document);
        if (tL_document == null || M == null) {
            return;
        }
        hl.c3(new lg((Object) this, (Object) M, z, (Object) tL_document, (byte) 24));
    }

    public final void Q() {
        this.j1 = this.k1;
        vn6 vn6Var = new vn6(xb4.z(1), System.currentTimeMillis() + "_" + xb4.r(null, this.g1), (byte) 1);
        this.k1 = vn6Var;
        if (startRecord(vn6Var.getPath(), this.B1) != 0) {
            hl.c3(new cn6(this, (byte) 7));
            return;
        }
        hl.c3(new cn6(this, (byte) 6));
        if (f11.a) {
            cc4.b("cant resume audio encoder");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S() {
        r47 r47Var;
        int i;
        long j;
        long j2;
        long j3;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
        pc7 pc7Var = this.R0;
        if (pc7Var != null) {
            pc7Var.b();
            return;
        }
        if (this.Y0 || (r47Var = this.v0) == null || r47Var.r1 || wf3.B(r47.B0(r47Var.k)) || (i = this.a1) == 0) {
            return;
        }
        oo6 oo6Var = this.D0;
        byte b = 0;
        if (oo6Var == null) {
            boolean[] zArr = this.X0;
            boolean z = zArr[0];
            int[] iArr = this.c1;
            if (!z) {
                this.Y0 = true;
                ls6.d0(k5.a(this.v0.K1).a).P0(r47.B0(this.v0.k), 50, iArr[0], 0, 4, this.b1, 1, this.a1, 0, null, null);
                return;
            } else {
                if (this.Z0 == 0 || zArr[1]) {
                    return;
                }
                this.Y0 = true;
                ls6.d0(k5.a(this.v0.K1).a).P0(this.Z0, 50, iArr[0], 0, 4, 0L, 1, this.a1, 0, null, null);
                return;
            }
        }
        if (oo6Var.g) {
            return;
        }
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty()) {
            return;
        }
        int i2 = ((r47) arrayList.get(0)).K1;
        if (this.D0.c != 0) {
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            oo6 oo6Var2 = this.D0;
            tL_messages_search.q = oo6Var2.a;
            tL_messages_search.limit = 20;
            ph4 ph4Var = oo6Var2.b;
            tL_messages_search.filter = ph4Var == null ? new TLRPC.TL_inputMessagesFilterEmpty() : ph4Var.e;
            tL_messages_search.peer = uc7.s1(k5.a(i2).a).j1(this.D0.c);
            tL_messages_search.offset_id = ((r47) c00.g(1, arrayList)).e1();
            oo6 oo6Var3 = this.D0;
            long j4 = oo6Var3.d;
            if (j4 > 0) {
                tL_messages_search.min_date = (int) (j4 / 1000);
            }
            long j5 = oo6Var3.e;
            tL_messages_searchGlobal = tL_messages_search;
            if (j5 > 0) {
                tL_messages_search.min_date = (int) (j5 / 1000);
                tL_messages_searchGlobal = tL_messages_search;
            }
        } else {
            TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal2 = new TLRPC.TL_messages_searchGlobal();
            tL_messages_searchGlobal2.limit = 20;
            oo6 oo6Var4 = this.D0;
            tL_messages_searchGlobal2.q = oo6Var4.a;
            tL_messages_searchGlobal2.filter = oo6Var4.b.e;
            r47 r47Var2 = (r47) c00.g(1, arrayList);
            tL_messages_searchGlobal2.offset_id = r47Var2.e1();
            oo6 oo6Var5 = this.D0;
            tL_messages_searchGlobal2.offset_rate = oo6Var5.h;
            tL_messages_searchGlobal2.flags |= 1;
            tL_messages_searchGlobal2.folder_id = oo6Var5.i ? 1 : 0;
            TLRPC.Peer peer = r47Var2.k.peer_id;
            long j6 = peer.channel_id;
            if (j6 == 0) {
                j6 = peer.chat_id;
                if (j6 == 0) {
                    j = peer.user_id;
                    tL_messages_searchGlobal2.offset_peer = uc7.s1(i2).j1(j);
                    oo6 oo6Var6 = this.D0;
                    j2 = oo6Var6.d;
                    if (j2 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j2 / 1000);
                    }
                    j3 = oo6Var6.e;
                    tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    if (j3 > 0) {
                        tL_messages_searchGlobal2.min_date = (int) (j3 / 1000);
                        tL_messages_searchGlobal = tL_messages_searchGlobal2;
                    }
                }
            }
            j = -j6;
            tL_messages_searchGlobal2.offset_peer = uc7.s1(i2).j1(j);
            oo6 oo6Var62 = this.D0;
            j2 = oo6Var62.d;
            if (j2 > 0) {
            }
            j3 = oo6Var62.e;
            tL_messages_searchGlobal = tL_messages_searchGlobal2;
            if (j3 > 0) {
            }
        }
        this.Y0 = true;
        ConnectionsManager.getInstance(i2).sendRequest(tL_messages_searchGlobal, new ln6(this, i, i2, b));
    }

    public final boolean U(r47 r47Var, boolean z) {
        if ((this.j0 != null || this.F0 != null) && r47Var != null && this.v0 != null && K(r47Var)) {
            D0();
            try {
                if (this.j0 == null) {
                    kfc kfcVar = this.F0;
                    if (kfcVar != null) {
                        kfcVar.f0();
                    }
                } else if (!z || go.w() || r47.Q4(this.v0.k) || this.v0.L0() * (1.0f - this.v0.b0) <= 1.0d || !LaunchActivity.G1) {
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
                    this.R1.addListener(new ad5(this, (byte) 14));
                    this.R1.start();
                }
                this.h0 = true;
                jn7.f(this.v0.K1).k(jn7.g2, Integer.valueOf(this.v0.e1()));
                try {
                    go.b(1);
                    if (!this.U1) {
                        if (lh2.t().w()) {
                            lh2.t().T(x());
                        }
                        go.z(false);
                    }
                    return true;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return true;
                }
            } catch (Exception e3) {
                cc4.g(e3, true);
                this.h0 = false;
            }
        }
        return false;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(45:10|(1:14)|15|(6:17|(6:21|(1:310)(1:27)|28|29|(1:31)|32)|312|29|(0)|32)(1:317)|33|(1:309)(1:37)|39|(1:41)(1:308)|42|(4:44|(1:306)(2:48|(1:50))|52|(4:56|57|58|(19:77|(1:79)(1:304)|80|(1:82)|83|(12:253|(2:255|(8:302|(1:301)(1:263)|(1:265)|266|(1:300)(2:270|(1:272))|(3:274|(1:277)|278)(4:292|293|(1:295)|296)|279|(6:281|(1:283)(1:290)|284|(1:286)|287|(1:289))(1:291)))(1:303)|259|(1:261)|301|(0)|266|(1:268)|300|(0)(0)|279|(0)(0))(17:86|87|88|(3:90|(1:93)|94)(3:235|(1:237)|238)|95|96|(6:98|(3:102|(1:106)|107)|108|(1:110)|111|(1:113))(4:218|219|220|(4:224|(1:228)|229|(1:231)))|114|(1:116)|117|(2:215|(1:217))(8:123|(7:125|(1:127)|128|(1:130)|131|(1:133)|134)|214|128|(0)|131|(0)|134)|135|(1:139)|140|(1:142)(1:213)|143|(3:145|(1:147)|148)(1:212))|149|(1:151)|152|(1:160)|161|(4:198|199|(5:201|(1:203)|204|(1:206)|207)|209)(2:163|(3:186|187|(4:189|(1:191)|192|(1:194))))|165|(3:167|168|169)(1:185)|170|171|172|(3:174|(1:176)|177)|179)(6:63|(1:65)|66|(3:68|69|70)(1:76)|71|72)))(1:307)|305|57|58|(1:60)|77|(0)(0)|80|(0)|83|(0)|253|(0)(0)|259|(0)|301|(0)|266|(0)|300|(0)(0)|279|(0)(0)|149|(0)|152|(4:154|156|158|160)|161|(0)(0)|165|(0)(0)|170|171|172|(0)|179) */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0853, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0854, code lost:
    
        cc4.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0128, code lost:
    
        if (r43.V1 == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x017d, code lost:
    
        if (r4 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01b2, code lost:
    
        if (r44.B() != false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0475 A[Catch: Exception -> 0x0505, TryCatch #6 {Exception -> 0x0505, blocks: (B:88:0x0292, B:90:0x02b8, B:93:0x02be, B:94:0x02c8, B:95:0x036a, B:98:0x0372, B:100:0x0378, B:102:0x0385, B:106:0x039d, B:107:0x03a1, B:108:0x03a3, B:110:0x03af, B:111:0x03bf, B:113:0x03c4, B:114:0x0424, B:116:0x042a, B:117:0x0432, B:119:0x0438, B:121:0x043e, B:123:0x0448, B:125:0x044c, B:127:0x0452, B:128:0x045e, B:130:0x0475, B:131:0x047a, B:134:0x0488, B:135:0x04a1, B:137:0x04a7, B:139:0x04ab, B:140:0x04b3, B:143:0x04bc, B:145:0x04ca, B:147:0x04ce, B:148:0x04d6, B:212:0x04fc, B:214:0x0455, B:215:0x0497, B:217:0x049b, B:220:0x03d3, B:222:0x03dd, B:224:0x03ea, B:228:0x0402, B:229:0x0406, B:231:0x0414, B:234:0x03d0, B:235:0x02d6, B:237:0x033b, B:238:0x033e, B:219:0x03c8), top: B:87:0x0292, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x080a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0836 A[Catch: Exception -> 0x0853, TryCatch #8 {Exception -> 0x0853, blocks: (B:172:0x082f, B:174:0x0836, B:176:0x0840, B:177:0x084b), top: B:171:0x082f }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x073f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0610 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024b  */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50, types: [kfc, r47] */
    /* JADX WARN: Type inference failed for: r2v51 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean V(final r47 r47Var) {
        boolean z;
        long j;
        boolean z2;
        File file;
        final File M;
        float f;
        boolean z3;
        boolean z4;
        boolean I3;
        jx jxVar;
        boolean G4;
        boolean z5;
        String str;
        File file2;
        boolean z6;
        boolean g4;
        kfc kfcVar;
        PowerManager.WakeLock wakeLock;
        ?? r2;
        lo6 lo6Var;
        TLRPC.TL_inputDocument tL_inputDocument;
        byte[] bArr;
        boolean z7;
        int i = jn7.e2;
        int i2 = jn7.g2;
        if (r47Var == null) {
            return false;
        }
        i();
        final byte b = 1;
        if (!(this.j0 == null && this.F0 == null) && K(r47Var)) {
            if (this.h0 && ((this.j0 != null || this.F0 != null) && this.v0 != null && K(r47Var))) {
                try {
                    z0(this.v0);
                    ValueAnimator valueAnimator = this.R1;
                    if (valueAnimator != null) {
                        valueAnimator.removeAllListeners();
                        this.R1.cancel();
                    }
                    if (r47.Q4(r47Var.k) || r47Var.g4()) {
                        this.Q1 = 1.0f;
                        p0();
                    } else {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 1.0f);
                        this.R1 = ofFloat;
                        ofFloat.addUpdateListener(this.S1);
                        this.R1.setDuration(300L);
                        this.R1.start();
                    }
                    kfc kfcVar2 = this.j0;
                    if (kfcVar2 != null) {
                        kfcVar2.g0();
                    } else {
                        kfc kfcVar3 = this.F0;
                        if (kfcVar3 != null) {
                            kfcVar3.g0();
                        }
                    }
                    e(r47Var);
                    this.h0 = false;
                    jn7.f(this.v0.K1).k(i2, Integer.valueOf(this.v0.e1()));
                    try {
                        go.b(1);
                        if (!this.U1) {
                            go.z(true);
                        }
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
            }
            if (!xea.k(true)) {
                A0(this.s);
            }
            return true;
        }
        if (!r47Var.N3() && r47Var.k.media_unread) {
            uc7.s1(r47Var.K1).z3(r47Var);
        }
        boolean z8 = !this.C0;
        r47 r47Var2 = this.v0;
        if (r47Var2 != null) {
            if ((r47Var2.I3() && r47.Q4(r47Var.k)) || r47Var.g4() || r47.K4(r47Var.k)) {
                r47 r47Var3 = this.v0;
                if (r47Var3 != null && r47Var3.I3() && !this.S0.isEmpty()) {
                    this.V1 = new qo6(this.v0);
                }
                z7 = true;
                if (!this.C0) {
                    this.v0.F5();
                    jn7.f(this.v0.K1).k(i, Integer.valueOf(this.v0.e1()), 0);
                }
                z = z7;
                z8 = false;
            }
            z7 = false;
            if (!this.C0) {
            }
            z = z7;
            z8 = false;
        } else {
            z = false;
        }
        m(z8, false, false, false);
        this.o0 = null;
        this.p0 = 0L;
        this.C0 = false;
        this.u0 = 0.0f;
        String str2 = r47Var.k.attachPath;
        if (str2 == null || str2.length() <= 0) {
            j = 0;
            z2 = false;
        } else {
            j = 0;
            file = new File(r47Var.k.attachPath);
            z2 = file.exists();
        }
        file = null;
        if (file != null) {
            M = file;
        } else {
            xb4.G(r47Var.K1);
            M = xb4.M(r47Var.k, false, true);
        }
        if (xea.x0) {
            if (r47Var.I3() || r47Var.g4()) {
                f = 0.0f;
            } else {
                f = 0.0f;
                if (r47.K4(r47Var.k)) {
                }
            }
            if (!r47Var.P5() && !wf3.B(r47Var.A0())) {
                z3 = true;
                if (M == file && !(z2 = M.exists()) && !z3) {
                    xb4.G(r47Var.K1).X(r47Var.F0(), r47Var, 0, r47Var.P5() ? 2 : 0);
                    this.B0 = true;
                    this.h0 = false;
                    this.E0 = null;
                    this.v0 = r47Var;
                    if (c()) {
                        try {
                            a.b.startService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
                        } catch (Throwable th) {
                            cc4.f(th);
                        }
                    } else {
                        a.b.stopService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
                    }
                    jn7.f(this.v0.K1).k(i2, Integer.valueOf(this.v0.e1()));
                    return true;
                }
                z4 = z2;
                this.B0 = false;
                I3 = r47Var.I3();
                int i3 = r47Var.K1;
                if (I3) {
                    h(i3);
                } else {
                    g(i3);
                }
                jxVar = this.M0;
                if (jxVar != null) {
                    this.N0 = false;
                    jxVar.setDrawingReady(false);
                }
                G4 = r47Var.G4();
                z5 = z;
                if (!r47Var.g4() || G4) {
                    File file3 = file;
                    xb4.G(r47Var.K1).c0(r47Var.F0(), true);
                    this.G0 = false;
                    if (G4) {
                        str = "tg://";
                        file2 = M;
                    } else {
                        str = "tg://";
                        file2 = M;
                        if (r47Var.k.peer_id.channel_id != j || r47Var.b0 > 0.1f) {
                            z6 = false;
                            int[] iArr = (G4 || r47Var.L0() > 30.0d) ? null : new int[]{1};
                            if (!z5) {
                                n();
                            }
                            kfc kfcVar4 = new kfc();
                            this.F0 = kfcVar4;
                            kfcVar4.r0(false);
                            int i4 = this.n0 + 1;
                            this.n0 = i4;
                            final File file4 = file2;
                            String str3 = str;
                            this.F0.K = new co6(this, i4, r47Var, iArr, z6);
                            this.Q0 = false;
                            if (this.I0 == null || !uc7.s1(r47Var.K1).t2(r47Var.A0(), r47Var.r1)) {
                                w0(null);
                            } else {
                                TextureView textureView = this.H0;
                                if (textureView != null) {
                                    this.F0.z0(textureView);
                                }
                            }
                            if (z4) {
                                if (!r47Var.z0 && file4 != file3) {
                                    final byte b3 = 0;
                                    hl.c3(new Runnable() { // from class: pn6
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            byte b4 = b3;
                                            File file5 = file4;
                                            r47 r47Var4 = r47Var;
                                            switch (b4) {
                                                case 0:
                                                    String[] strArr = MediaController.W1;
                                                    jn7.f(r47Var4.K1).k(jn7.Y1, xb4.r(null, r47Var4.F0()), file5);
                                                    break;
                                                default:
                                                    String[] strArr2 = MediaController.W1;
                                                    jn7.f(r47Var4.K1).k(jn7.Y1, xb4.r(null, r47Var4.F0()), file5);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                this.F0.i0(Uri.fromFile(file4), "other");
                            } else {
                                try {
                                    int F = xb4.G(r47Var.K1).F(r47Var);
                                    TLRPC.Document F0 = r47Var.F0();
                                    StringBuilder sb = new StringBuilder("?account=");
                                    sb.append(r47Var.K1);
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
                                    sb.append(URLEncoder.encode(xb4.B(F0), "UTF-8"));
                                    sb.append("&reference=");
                                    byte[] bArr2 = F0.file_reference;
                                    if (bArr2 == null) {
                                        bArr2 = new byte[0];
                                    }
                                    sb.append(Utilities.f(bArr2));
                                    this.F0.i0(Uri.parse(str3 + r47Var.S0() + sb.toString()), "other");
                                } catch (Exception e4) {
                                    cc4.f(e4);
                                }
                            }
                            g4 = r47Var.g4();
                            kfc kfcVar5 = this.F0;
                            if (g4) {
                                kfcVar5.w0(this.M ? 0 : 3);
                                if (Math.abs(this.q0 - 1.0f) > 0.001f) {
                                    this.F0.u0(Math.round(this.q0 * 10.0f) / 10.0f);
                                }
                                float f3 = r47Var.c0;
                                if (f3 >= f) {
                                    this.u0 = f3;
                                    r47Var.b0 = f3;
                                    r47Var.c0 = -1.0f;
                                }
                            } else {
                                kfcVar5.w0(3);
                            }
                        }
                    }
                    z6 = true;
                    if (G4) {
                    }
                    if (!z5) {
                    }
                    kfc kfcVar42 = new kfc();
                    this.F0 = kfcVar42;
                    kfcVar42.r0(false);
                    int i42 = this.n0 + 1;
                    this.n0 = i42;
                    final File file42 = file2;
                    String str32 = str;
                    this.F0.K = new co6(this, i42, r47Var, iArr, z6);
                    this.Q0 = false;
                    if (this.I0 == null) {
                    }
                    w0(null);
                    if (z4) {
                    }
                    g4 = r47Var.g4();
                    kfc kfcVar52 = this.F0;
                    if (g4) {
                    }
                } else {
                    o();
                    try {
                        kfc kfcVar6 = new kfc();
                        this.j0 = kfcVar6;
                        int i5 = this.n0 + 1;
                        this.n0 = i5;
                        kfcVar6.K = new rn6(this, i5, r47Var, (byte) 0);
                        kfcVar6.L = new uif((byte) 21);
                        if (z4) {
                            if (!r47Var.z0 && M != file) {
                                hl.c3(new Runnable() { // from class: pn6
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        byte b4 = b;
                                        File file5 = M;
                                        r47 r47Var4 = r47Var;
                                        switch (b4) {
                                            case 0:
                                                String[] strArr = MediaController.W1;
                                                jn7.f(r47Var4.K1).k(jn7.Y1, xb4.r(null, r47Var4.F0()), file5);
                                                break;
                                            default:
                                                String[] strArr2 = MediaController.W1;
                                                jn7.f(r47Var4.K1).k(jn7.Y1, xb4.r(null, r47Var4.F0()), file5);
                                                break;
                                        }
                                    }
                                });
                            }
                            this.j0.i0(Uri.fromFile(M), "other");
                            this.m0 = false;
                        } else {
                            int F2 = xb4.G(r47Var.K1).F(r47Var);
                            TLRPC.Document F02 = r47Var.F0();
                            StringBuilder sb2 = new StringBuilder("?account=");
                            sb2.append(r47Var.K1);
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
                            sb2.append(URLEncoder.encode(xb4.B(F02), "UTF-8"));
                            sb2.append("&reference=");
                            byte[] bArr3 = F02.file_reference;
                            if (bArr3 == null) {
                                bArr3 = new byte[0];
                            }
                            sb2.append(Utilities.f(bArr3));
                            this.j0.i0(Uri.parse("tg://" + r47Var.S0() + sb2.toString()), "other");
                            this.m0 = true;
                        }
                        if (r47Var.O4()) {
                            String S0 = r47Var.S0();
                            if (S0 != null && r47Var.L0() >= 300.0d) {
                                float f4 = a.b.getSharedPreferences("media_saved_pos", 0).getFloat(S0, -1.0f);
                                if (f4 > f && f4 < 0.99f) {
                                    this.u0 = f4;
                                    r47Var.b0 = f4;
                                }
                                this.o0 = S0;
                            }
                            if (Math.abs(this.q0 - 1.0f) > 0.001f) {
                                this.j0.u0(Math.round(this.q0 * 10.0f) / 10.0f);
                            }
                            this.E0 = null;
                            if (!z5) {
                                n();
                            }
                        } else {
                            try {
                                this.E0 = h00.a(M);
                            } catch (Exception e5) {
                                cc4.f(e5);
                            }
                            String S02 = r47Var.S0();
                            if (!TextUtils.isEmpty(S02) && r47Var.L0() >= 600.0d) {
                                float f5 = a.b.getSharedPreferences("media_saved_pos", 0).getFloat(S02, -1.0f);
                                if (f5 > f && f5 < 0.999f) {
                                    this.u0 = f5;
                                    r47Var.b0 = f5;
                                }
                                this.o0 = S02;
                                if (Math.abs(this.r0 - 1.0f) > 0.001f) {
                                    this.j0.u0(Math.round(this.r0 * 10.0f) / 10.0f);
                                }
                            }
                        }
                        float f6 = r47Var.c0;
                        if (f6 >= f) {
                            this.u0 = f6;
                            r47Var.b0 = f6;
                            r47Var.c0 = -1.0f;
                        }
                        if (!r47Var.I3() || r47Var.F0() == null || wf3.B(r47Var.A0())) {
                            lo6 lo6Var2 = this.x0;
                            if (lo6Var2 != null) {
                                lo6Var2.a();
                                this.x0 = null;
                            }
                        } else {
                            lo6 lo6Var3 = this.x0;
                            if (lo6Var3 != null) {
                                if (lo6Var3.a != r47Var.K1) {
                                    lo6Var3.a();
                                }
                                TLRPC.Document F03 = r47Var.F0();
                                tL_inputDocument = new TLRPC.TL_inputDocument();
                                tL_inputDocument.id = F03.id;
                                tL_inputDocument.access_hash = F03.access_hash;
                                bArr = F03.file_reference;
                                tL_inputDocument.file_reference = bArr;
                                if (bArr == null) {
                                    tL_inputDocument.file_reference = new byte[0];
                                }
                                lo6 lo6Var4 = this.x0;
                                hl.r(lo6Var4.e);
                                if (tL_inputDocument.id == j) {
                                    tL_inputDocument = null;
                                }
                                lo6Var4.b = tL_inputDocument;
                                lo6Var4.c = -9223372036854775807L;
                                lo6Var4.d.clear();
                            }
                            this.x0 = new lo6(r47Var.K1);
                            TLRPC.Document F032 = r47Var.F0();
                            tL_inputDocument = new TLRPC.TL_inputDocument();
                            tL_inputDocument.id = F032.id;
                            tL_inputDocument.access_hash = F032.access_hash;
                            bArr = F032.file_reference;
                            tL_inputDocument.file_reference = bArr;
                            if (bArr == null) {
                            }
                            lo6 lo6Var42 = this.x0;
                            hl.r(lo6Var42.e);
                            if (tL_inputDocument.id == j) {
                            }
                            lo6Var42.b = tL_inputDocument;
                            lo6Var42.c = -9223372036854775807L;
                            lo6Var42.d.clear();
                        }
                        s64 s64Var = this.j0.d;
                        if (s64Var != null && (lo6Var = this.x0) != null) {
                            s64Var.y(new ko6(lo6Var, s64Var));
                        }
                        this.j0.w0(this.M ? 0 : 3);
                        this.j0.g0();
                        if (r47Var.O4()) {
                            this.Q1 = 1.0f;
                            p0();
                        } else {
                            ValueAnimator valueAnimator2 = this.R1;
                            if (valueAnimator2 != null) {
                                valueAnimator2.removeAllListeners();
                                this.R1.cancel();
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.Q1, 1.0f);
                            this.R1 = ofFloat2;
                            ofFloat2.addUpdateListener(this.S1);
                            this.R1.setDuration(300L);
                            this.R1.start();
                        }
                    } catch (Exception e6) {
                        cc4.f(e6);
                        jn7 f7 = jn7.f(r47Var.K1);
                        r47 r47Var4 = this.v0;
                        f7.k(i2, Integer.valueOf(r47Var4 != null ? r47Var4.e1() : 0));
                        if (this.j0 == null) {
                            return false;
                        }
                        lo6 lo6Var5 = this.x0;
                        if (lo6Var5 != null) {
                            lo6Var5.a();
                            r2 = 0;
                            this.x0 = null;
                        } else {
                            r2 = 0;
                        }
                        this.j0.l0();
                        this.j0 = r2;
                        aob.L1(this.v0);
                        this.h0 = false;
                        this.v0 = r2;
                        this.B0 = false;
                        return false;
                    }
                }
                e(r47Var);
                p0();
                this.h0 = false;
                this.v0 = r47Var;
                if (!xea.k(true)) {
                    A0(this.s);
                }
                if (!a.x && (wakeLock = this.d) != null && !wakeLock.isHeld() && !this.v0.O4()) {
                    this.v0.g4();
                }
                z0(this.v0);
                jn7.f(r47Var.K1).k(jn7.h2, r47Var, r47Var2);
                kfcVar = this.F0;
                if (kfcVar == null) {
                    try {
                        if (this.v0.b0 != f) {
                            long U = kfcVar.U();
                            if (U == -9223372036854775807L) {
                                U = ((long) this.v0.L0()) * 1000;
                            }
                            r47 r47Var5 = this.v0;
                            int i6 = (int) (U * r47Var5.b0);
                            int i7 = r47Var5.d0;
                            if (i7 != 0) {
                                r47Var5.d0 = 0;
                                i6 = i7;
                            }
                            this.F0.o0(i6);
                        }
                    } catch (Exception e7) {
                        r47 r47Var6 = this.v0;
                        r47Var6.b0 = f;
                        r47Var6.i0 = 0;
                        jn7.f(r47Var.K1).k(i, Integer.valueOf(this.v0.e1()), 0);
                        cc4.f(e7);
                    }
                    this.F0.g0();
                } else {
                    kfc kfcVar7 = this.j0;
                    if (kfcVar7 != null) {
                        try {
                            if (this.v0.b0 != 0.0f) {
                                long U2 = kfcVar7.U();
                                if (U2 == -9223372036854775807L) {
                                    U2 = ((long) this.v0.L0()) * 1000;
                                }
                                long j2 = (int) (U2 * this.v0.b0);
                                this.j0.o0(j2);
                                if (!this.U1) {
                                    go.x(j2);
                                }
                            }
                        } catch (Exception e8) {
                            this.v0.F5();
                            jn7.f(r47Var.K1).k(i, Integer.valueOf(this.v0.e1()), 0);
                            cc4.f(e8);
                        }
                    }
                }
                if (c()) {
                    a.b.stopService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
                } else {
                    try {
                        a.b.startService(new Intent(a.b, (Class<?>) MusicPlayerService.class));
                    } catch (Throwable th2) {
                        cc4.f(th2);
                    }
                }
                go.b(1);
                if (!this.U1) {
                    if (lh2.t().w()) {
                        lh2.t().T(x());
                    }
                    go.z(true);
                }
                return true;
            }
        } else {
            f = 0.0f;
        }
        z3 = false;
        if (M == file) {
        }
        z4 = z2;
        this.B0 = false;
        I3 = r47Var.I3();
        int i32 = r47Var.K1;
        if (I3) {
        }
        jxVar = this.M0;
        if (jxVar != null) {
        }
        G4 = r47Var.G4();
        z5 = z;
        if (r47Var.g4()) {
        }
        File file32 = file;
        xb4.G(r47Var.K1).c0(r47Var.F0(), true);
        this.G0 = false;
        if (G4) {
        }
        z6 = true;
        if (G4) {
        }
        if (!z5) {
        }
        kfc kfcVar422 = new kfc();
        this.F0 = kfcVar422;
        kfcVar422.r0(false);
        int i422 = this.n0 + 1;
        this.n0 = i422;
        final File file422 = file2;
        String str322 = str;
        this.F0.K = new co6(this, i422, r47Var, iArr, z6);
        this.Q0 = false;
        if (this.I0 == null) {
        }
        w0(null);
        if (z4) {
        }
        g4 = r47Var.g4();
        kfc kfcVar522 = this.F0;
        if (g4) {
        }
        e(r47Var);
        p0();
        this.h0 = false;
        this.v0 = r47Var;
        if (!xea.k(true)) {
        }
        if (!a.x) {
            this.v0.g4();
        }
        z0(this.v0);
        jn7.f(r47Var.K1).k(jn7.h2, r47Var, r47Var2);
        kfcVar = this.F0;
        if (kfcVar == null) {
        }
        if (c()) {
        }
        go.b(1);
        if (!this.U1) {
        }
        return true;
    }

    public final void W(int i) {
        int i2 = this.V0;
        if (i2 >= 0) {
            ArrayList arrayList = this.S0;
            if (i2 < arrayList.size()) {
                this.V0 = i;
                this.C0 = true;
                r47 r47Var = (r47) arrayList.get(i);
                if (this.v0 != null && !K(r47Var)) {
                    this.v0.F5();
                }
                V(r47Var);
            }
        }
    }

    public final void X(boolean z) {
        int i;
        ArrayList arrayList = xea.J0 ? this.U0 : this.S0;
        if (z && (((i = xea.O0) == 2 || (i == 1 && arrayList.size() == 1)) && !this.W0)) {
            m(false, false, false, false);
            int i2 = this.V0;
            if (i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            r47 r47Var = (r47) arrayList.get(this.V0);
            r47Var.b0 = 0.0f;
            r47Var.i0 = 0;
            V(r47Var);
            return;
        }
        if (!I0(this.R0 != null ? !xea.K0 : xea.K0 ? 1 : -1, arrayList) || !z || xea.O0 != 0 || this.W0) {
            int i3 = this.V0;
            if (i3 < 0 || i3 >= arrayList.size()) {
                return;
            }
            r47 r47Var2 = this.v0;
            if (r47Var2 != null) {
                r47Var2.F5();
            }
            this.C0 = true;
            V((r47) arrayList.get(this.V0));
            return;
        }
        if (this.j0 != null) {
            lo6 lo6Var = this.x0;
            if (lo6Var != null) {
                lo6Var.a();
                this.x0 = null;
            }
            try {
                this.j0.l0();
            } catch (Exception e) {
                cc4.g(e, true);
            }
            this.j0 = null;
            aob.L1(this.v0);
        } else {
            if (this.F0 == null) {
                return;
            }
            E();
            this.M0 = null;
            this.O0 = null;
            this.Q0 = false;
            this.H0 = null;
            this.F0.l0();
            this.F0 = null;
            try {
                this.K0.getWindow().clearFlags(128);
            } catch (Exception e3) {
                cc4.g(e3, true);
            }
            hl.r(this.d1);
            xb4.G(this.v0.K1).Z(this.v0.F0(), true, false);
        }
        D0();
        this.h0 = true;
        r47 r47Var3 = this.v0;
        r47Var3.b0 = 0.0f;
        r47Var3.i0 = 0;
        jn7.f(r47Var3.K1).k(jn7.e2, Integer.valueOf(this.v0.e1()), 0);
        jn7.f(this.v0.K1).k(jn7.g2, Integer.valueOf(this.v0.e1()));
    }

    public final void Y() {
        int i;
        ArrayList arrayList = xea.J0 ? this.U0 : this.S0;
        if (arrayList.isEmpty() || (i = this.V0) < 0 || i >= arrayList.size()) {
            return;
        }
        r47 r47Var = (r47) arrayList.get(this.V0);
        if (r47Var.i0 > 10) {
            k0(r47Var, 0.0f);
            return;
        }
        I0(this.R0 != null ? !xea.K0 : xea.K0 ? -1 : 1, arrayList);
        if (this.V0 < arrayList.size()) {
            this.C0 = true;
            V((r47) arrayList.get(this.V0));
        }
    }

    public final void Z(boolean z) {
        if (this.g1 != null) {
            H0(false);
            return;
        }
        if (!z) {
            F0(2, 0, false, false);
            return;
        }
        int currentAccount = this.s.getCurrentAccount();
        long a = this.s.a();
        zu1 zu1Var = this.s;
        r47 r47Var = zu1Var.m4;
        int classGuid = zu1Var.getClassGuid();
        zu1 zu1Var2 = this.s;
        c5a X6 = zu1Var2 != null ? zu1Var2.X6() : null;
        zu1 zu1Var3 = this.s;
        long k7 = zu1Var3 != null ? zu1Var3.k7() : 0L;
        zu1 zu1Var4 = this.s;
        B0(currentAccount, a, null, r47Var, null, classGuid, false, X6, k7, zu1Var4 != null ? zu1Var4.y5 : null);
    }

    public final boolean a0() {
        n20 n20Var = this.L1;
        if (n20Var != null) {
            File file = (File) n20Var.b;
            u60.b(file);
            file.delete();
            c0();
            return true;
        }
        v20 v20Var = this.G1;
        if (v20Var == null || !v20Var.b()) {
            return false;
        }
        this.G1 = null;
        if (!v20Var.a()) {
            v20Var.b.o();
            v20Var.h = true;
        }
        c0();
        return true;
    }

    public final void b() {
        r47 r47Var;
        ArrayList arrayList = this.S0;
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ArrayList arrayList3 = this.U0;
        arrayList3.clear();
        int i = this.V0;
        if (i < 0 || i >= arrayList.size()) {
            r47Var = null;
        } else {
            r47Var = (r47) arrayList.get(this.V0);
            arrayList2.remove(this.V0);
        }
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            int nextInt = Utilities.b.nextInt(arrayList2.size());
            arrayList3.add((r47) arrayList2.get(nextInt));
            arrayList2.remove(nextInt);
        }
        if (r47Var != null) {
            arrayList3.add(r47Var);
            this.V0 = arrayList3.size() - 1;
        }
    }

    public final void b0(boolean z) {
        boolean z2 = this.W;
        a00 a00Var = this.a;
        if (!z) {
            if (z2) {
                ip7.p0.abandonAudioFocus(a00Var);
                this.W = false;
                return;
            }
            return;
        }
        if (!z2 && xea.B0 && ip7.p0.requestAudioFocus(a00Var, 3, 2) == 1) {
            this.W = true;
        }
    }

    public final boolean c() {
        r47 r47Var = this.v0;
        if (r47Var != null) {
            return ((!r47Var.I3() && !r47.Q4(this.v0.k) && !this.v0.g4()) || this.v0.R4() || this.v0.f4()) ? false : true;
        }
        return false;
    }

    public final void c0() {
        this.g1 = null;
        this.j1 = null;
        this.k1 = null;
        this.I1 = false;
        this.J1 = false;
        this.K1 = false;
        this.L1 = null;
        this.C1 = (byte) 0;
    }

    public final void d(r47 r47Var) {
        if (r47Var == null || this.c0.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.c0.size(); i++) {
            so6 so6Var = (so6) this.c0.get(i);
            r47 r47Var2 = so6Var.a;
            if (r47Var2.T(r47Var) && r47Var2.K1 == r47Var.K1) {
                if (i == 0) {
                    synchronized (this.b) {
                        so6Var.b.V = true;
                    }
                    return;
                } else {
                    this.a0.remove((so6) this.c0.remove(i));
                    f(true);
                    return;
                }
            }
        }
    }

    public final boolean d0() {
        int i;
        r47 r47Var;
        qo6 qo6Var = this.V1;
        if (qo6Var != null) {
            r47 r47Var2 = qo6Var.a;
            this.V1 = null;
            ArrayList arrayList = xea.J0 ? this.U0 : this.S0;
            if (arrayList != null && (i = this.V0) >= 0 && i < arrayList.size() && (r47Var = (r47) arrayList.get(this.V0)) != null && r47.B0(r47Var.k) == r47.B0(r47Var2.k) && r47Var.e1() == r47Var2.e1()) {
                this.C0 = false;
                float f = qo6Var.b;
                r47Var.c0 = f;
                r47Var.b0 = f;
                r47Var.d0 = qo6Var.c;
                r47Var.i0 = qo6Var.d;
                V(r47Var);
                U(r47Var, false);
                return true;
            }
        }
        return false;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        pc7 pc7Var;
        r47 r47Var;
        ArrayList arrayList;
        int indexOf;
        int i3 = 0;
        if (i == jn7.Y1 || i == jn7.R1) {
            String str = (String) objArr[0];
            r47 r47Var2 = this.v0;
            if (r47Var2 != null && r47Var2.K1 == i2 && xb4.r(null, r47Var2.F0()).equals(str)) {
                if (this.B0) {
                    this.C0 = true;
                    V(this.v0);
                    return;
                } else {
                    if (this.E0 == null) {
                        try {
                            xb4.G(yac.t0);
                            this.E0 = h00.a(xb4.M(this.v0.k, false, true));
                            return;
                        } catch (Exception e) {
                            cc4.g(e, true);
                            return;
                        }
                    }
                    return;
                }
            }
            return;
        }
        if (i == jn7.v) {
            if (((Boolean) objArr[2]).booleanValue()) {
                return;
            }
            long longValue = ((Long) objArr[1]).longValue();
            ArrayList arrayList2 = (ArrayList) objArr[0];
            r47 r47Var3 = this.v0;
            if (r47Var3 != null && longValue == r47Var3.k.peer_id.channel_id && arrayList2.contains(Integer.valueOf(r47Var3.e1()))) {
                m(true, true, false, false);
            }
            ArrayList arrayList3 = this.f0;
            if (arrayList3 == null || arrayList3.isEmpty() || longValue != ((r47) this.f0.get(0)).k.peer_id.channel_id) {
                return;
            }
            while (i3 < arrayList2.size()) {
                Integer num = (Integer) arrayList2.get(i3);
                r47 r47Var4 = (r47) this.g0.get(num.intValue());
                this.g0.remove(num.intValue());
                if (r47Var4 != null) {
                    this.f0.remove(r47Var4);
                }
                i3++;
            }
            return;
        }
        if (i == jn7.e0) {
            long longValue2 = ((Long) objArr[0]).longValue();
            r47 r47Var5 = this.v0;
            if (r47Var5 == null || r47.B0(r47Var5.k) != longValue2) {
                return;
            }
            m(false, true, false, false);
            return;
        }
        int i4 = jn7.K0;
        int[] iArr = this.c1;
        HashMap hashMap = this.T0;
        ArrayList arrayList4 = this.S0;
        if (i == i4) {
            long longValue3 = ((Long) objArr[0]).longValue();
            long longValue4 = ((Long) objArr[3]).longValue();
            r47 r47Var6 = this.v0;
            if (r47Var6 != null && r47Var6.I3() && r47.B0(this.v0.k) == longValue3 && this.b1 == longValue4 && !this.v0.r1) {
                ArrayList arrayList5 = (ArrayList) objArr[1];
                ArrayList arrayList6 = (ArrayList) objArr[2];
                arrayList4.addAll(0, arrayList5);
                arrayList4.addAll(arrayList6);
                int size = arrayList4.size();
                for (int i5 = 0; i5 < size; i5++) {
                    r47 r47Var7 = (r47) arrayList4.get(i5);
                    hashMap.put(Integer.valueOf(r47Var7.e1()), r47Var7);
                    iArr[0] = Math.min(iArr[0], r47Var7.e1());
                }
                x0();
                if (xea.J0) {
                    b();
                } else {
                    r47 r47Var8 = this.v0;
                    if (r47Var8 != null && (indexOf = arrayList4.indexOf(r47Var8)) >= 0) {
                        this.V0 = indexOf;
                    }
                }
                this.a1 = ConnectionsManager.generateClassGuid();
                return;
            }
            return;
        }
        int i6 = jn7.V;
        int i7 = jn7.L0;
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
                r47 r47Var9 = (r47) arrayList7.get(i9);
                if (!r47Var9.R4() && !hashMap.containsKey(Integer.valueOf(r47Var9.e1()))) {
                    i8++;
                    arrayList4.add(0, r47Var9);
                    hashMap.put(Integer.valueOf(r47Var9.e1()), r47Var9);
                    iArr[c] = Math.min(iArr[c], r47Var9.e1());
                }
            }
            x0();
            int indexOf2 = arrayList4.indexOf(this.v0);
            if (indexOf2 >= 0) {
                this.V0 = indexOf2;
            }
            this.Y0 = false;
            if (xea.J0) {
                b();
            }
            if (i8 != 0) {
                jn7.f(this.v0.K1).k(i7, Integer.valueOf(i8));
                return;
            }
            return;
        }
        if (i == 1) {
            if (((Boolean) objArr[2]).booleanValue() || (arrayList = this.f0) == null || arrayList.isEmpty() || ((Long) objArr[0]).longValue() != r47.B0(((r47) this.f0.get(0)).k)) {
                return;
            }
            ArrayList arrayList8 = (ArrayList) objArr[1];
            while (i3 < arrayList8.size()) {
                r47 r47Var10 = (r47) arrayList8.get(i3);
                if ((r47.Q4(r47Var10.k) || r47Var10.g4()) && !r47Var10.R4() && !r47Var10.f4() && (!this.e0 || (r47Var10.k.media_unread && !r47Var10.N3()))) {
                    this.f0.add(r47Var10);
                    this.g0.put(r47Var10.e1(), r47Var10);
                }
                i3++;
            }
            return;
        }
        if (i == jn7.K4) {
            kfc kfcVar = (kfc) objArr[0];
            if (this.F0 == kfcVar || this.j0 == kfcVar) {
                return;
            }
            r47 r47Var11 = this.v0;
            if (r47Var11 != null && H(r47Var11) && !G() && (r47Var11.I3() || r47.Q4(r47Var11.k))) {
                this.i0 = true;
            }
            U(r47Var11, true);
            return;
        }
        if (i == jn7.W3 && (pc7Var = this.R0) != null && objArr[0] == pc7Var) {
            int size2 = pc7Var.c.size() - arrayList4.size();
            arrayList4.clear();
            arrayList4.addAll(this.R0.c);
            x0();
            if (xea.J0) {
                b();
            } else {
                r47 r47Var12 = this.v0;
                if (r47Var12 != null) {
                    int indexOf3 = arrayList4.indexOf(r47Var12);
                    if (indexOf3 >= 0) {
                        this.V0 = indexOf3;
                    } else {
                        int i10 = this.V0;
                        if (i10 < 0 || i10 >= arrayList4.size()) {
                            this.V0 = 0;
                        }
                        if (arrayList4.size() == 0) {
                            k();
                        } else {
                            V((r47) arrayList4.get(0));
                        }
                    }
                }
            }
            if (size2 == 0 || (r47Var = this.v0) == null) {
                return;
            }
            jn7.f(r47Var.K1).k(i7, Integer.valueOf(size2));
        }
    }

    public final void e(r47 r47Var) {
        int requestAudioFocus;
        byte b = (r47.Q4(r47Var.k) || r47Var.g4()) ? this.M ? (byte) 3 : (byte) 2 : (byte) 1;
        if (this.V != b) {
            this.V = b;
            if (b == 3) {
                requestAudioFocus = ip7.p0.requestAudioFocus(this, 0, 1);
            } else {
                requestAudioFocus = ip7.p0.requestAudioFocus(this, 3, (b != 2 || xea.C0) ? 1 : 3);
            }
            if (requestAudioFocus == 1) {
                this.Y = (byte) 2;
            }
        }
    }

    public final void e0() {
        r47 r47Var;
        kfc kfcVar = this.j0;
        if (kfcVar == null || (r47Var = this.v0) == null || this.h0) {
            return;
        }
        if (kfcVar.d == null || kfcVar.M != 2) {
            kfcVar.g0();
        } else {
            m(false, false, false, false);
            V(r47Var);
        }
    }

    public final void f(boolean z) {
        so6 so6Var;
        if (this.a0.isEmpty()) {
            so6Var = null;
            this.b0 = null;
        } else {
            so6Var = (so6) this.a0.get(0);
            this.b0 = so6Var;
        }
        if (so6Var != null || z) {
            if (VideoEncodingService.e == null) {
                try {
                    a.b.startService(new Intent(a.b, (Class<?>) VideoEncodingService.class));
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            }
            if (z) {
                so6 so6Var2 = z().b0;
                VideoEncodingService videoEncodingService = VideoEncodingService.e;
                if (videoEncodingService.b != so6Var2) {
                    if (so6Var2 != null) {
                        videoEncodingService.a(so6Var2);
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
        lq3 q = lq3.q(i);
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
        ArrayList arrayList = xea.J0 ? this.U0 : this.S0;
        if (arrayList == null || arrayList.size() < 2) {
            return;
        }
        boolean z = this.R0 != null ? !xea.K0 : xea.K0;
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
        r47 r47Var = (r47) arrayList.get(i2);
        File file = null;
        if (!TextUtils.isEmpty(r47Var.k.attachPath)) {
            File file2 = new File(r47Var.k.attachPath);
            if (file2.exists()) {
                file = file2;
            }
        }
        if (file != null) {
            M = file;
        } else {
            xb4.G(i);
            M = xb4.M(r47Var.k, false, true);
        }
        M.exists();
        if (M == file || M.exists() || !r47Var.I3()) {
            return;
        }
        xb4.G(i).X(r47Var.F0(), r47Var, 0, r47.Q5(r47Var.k) ? 2 : 0);
    }

    public native byte[] getWaveform2(short[] sArr, int i);

    public final void h(int i) {
        File M;
        ArrayList arrayList = this.f0;
        if (arrayList != null) {
            if (arrayList.size() >= 2) {
                r47 r47Var = (r47) this.f0.get(1);
                String str = r47Var.k.attachPath;
                File file = null;
                if (str != null && str.length() > 0) {
                    File file2 = new File(r47Var.k.attachPath);
                    if (file2.exists()) {
                        file = file2;
                    }
                }
                if (file != null) {
                    M = file;
                } else {
                    xb4.G(i);
                    M = xb4.M(r47Var.k, false, true);
                }
                M.exists();
                if (M == file || M.exists()) {
                    return;
                }
                xb4.G(i).X(r47Var.F0(), r47Var, 0, r47.Q5(r47Var.k) ? 2 : 0);
            }
        }
    }

    public final void i() {
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

    public final void j(boolean z) {
        File file;
        File file2;
        File file3;
        v20 v20Var;
        v20 v20Var2;
        if (this.I1) {
            gn6 gn6Var = this.H1;
            if (gn6Var != null) {
                hl.r(gn6Var);
                this.H1 = null;
            }
            boolean a = (z || (v20Var2 = this.G1) == null) ? false : v20Var2.a();
            if (!a && (v20Var = this.G1) != null) {
                v20Var.g = false;
                v20Var.b.b();
            }
            if (a && (file3 = this.k1) != null) {
                u60.b(file3);
            }
            u(!z);
            return;
        }
        this.g1 = null;
        u60.b(this.k1);
        if (z && (file2 = this.k1) != null) {
            try {
                file2.delete();
            } catch (Exception e) {
                cc4.g(e, true);
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

    public final boolean j0(r47 r47Var, boolean z, boolean z2, boolean z3) {
        oec oecVar = r47Var != null ? r47Var.r0 : null;
        if (r47Var != null && oecVar != null) {
            ArrayList arrayList = this.c0;
            if (z) {
                if (arrayList.isEmpty()) {
                    new File(r47Var.k.attachPath).delete();
                }
            }
            so6 so6Var = new so6();
            so6Var.a = r47Var;
            so6Var.c = r47Var.K1;
            so6Var.b = oecVar;
            so6Var.d = z3;
            arrayList.add(so6Var);
            if (z2) {
                this.a0.add(so6Var);
                f(false);
            }
            if (arrayList.size() == 1) {
                C0();
            }
            return true;
        }
        return false;
    }

    public final void k() {
        m(true, true, false, false);
        this.E0 = null;
        this.C0 = false;
        for (int i = 0; i < 4; i++) {
            lq3 q = lq3.q(i);
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
        n();
    }

    public final void k0(r47 r47Var, float f) {
        r47 r47Var2 = this.v0;
        if ((this.j0 == null && this.F0 == null) || r47Var == null || r47Var2 == null || !K(r47Var)) {
            return;
        }
        try {
            kfc kfcVar = this.j0;
            if (kfcVar != null) {
                long U = kfcVar.U();
                if (U == -9223372036854775807L) {
                    this.u0 = f;
                } else {
                    r47Var2.b0 = f;
                    long j = (int) (U * f);
                    this.j0.p0(j, false);
                    r47Var2.e0 = j;
                    if (!this.U1) {
                        go.x(j);
                    }
                }
            } else {
                kfc kfcVar2 = this.F0;
                if (kfcVar2 != null) {
                    kfcVar2.o0((long) (kfcVar2.U() * f));
                    if (!this.U1) {
                        go.x((long) (this.F0.U() * f));
                    }
                }
            }
            jn7.f(r47Var.K1).k(jn7.i2, Integer.valueOf(r47Var2.e1()), Float.valueOf(f));
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void l(boolean z, boolean z2) {
        m(z, z2, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0242  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        r47 r47Var;
        int i = jn7.j2;
        if (z2 && d0()) {
            return;
        }
        boolean z6 = false;
        if (this.j0 != null) {
            lo6 lo6Var = this.x0;
            if (lo6Var != null) {
                lo6Var.a();
                this.x0 = null;
            }
            ValueAnimator valueAnimator = this.R1;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
                this.R1.cancel();
            }
            if (go.w() || !this.j0.c0() || (r47Var = this.v0) == null || r47.Q4(r47Var.k)) {
                try {
                    this.j0.l0();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            } else {
                kfc kfcVar = this.j0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.Q1, 0.0f);
                ofFloat.addUpdateListener(new lk(this, kfcVar, (byte) 17));
                ofFloat.addListener(new ad5(kfcVar, (byte) 15));
                ofFloat.setDuration(300L);
                ofFloat.start();
            }
            this.j0 = null;
            aob.L1(this.v0);
        } else if (this.F0 != null) {
            E();
            this.M0 = null;
            this.O0 = null;
            this.Q0 = false;
            this.N0 = false;
            this.H0 = null;
            this.w0 = null;
            if (z4) {
                PhotoViewer.q0().S2 = this.F0;
                r47 r47Var2 = this.v0;
                this.w0 = r47Var2;
                jn7.f(r47Var2.K1).k(i, this.v0, Boolean.TRUE);
            } else {
                long S = this.F0.S();
                r47 r47Var3 = this.v0;
                if (r47Var3 != null && r47.K4(r47Var3.k) && S > 0) {
                    r47 r47Var4 = this.v0;
                    r47Var4.d0 = (int) S;
                    jn7.f(r47Var4.K1).k(i, this.v0, Boolean.FALSE);
                }
                this.F0.l0();
                this.F0 = null;
            }
            try {
                this.K0.getWindow().clearFlags(128);
            } catch (Exception e3) {
                cc4.g(e3, true);
            }
            if (this.v0 != null && !z4) {
                hl.r(this.d1);
                xb4.G(this.v0.K1).Z(this.v0.F0(), true, false);
            }
        }
        D0();
        this.h0 = false;
        r47 r47Var5 = this.v0;
        if (r47Var5 != null) {
            if (this.B0) {
                xb4.G(r47Var5.K1).f(this.v0.F0());
            }
            r47 r47Var6 = this.v0;
            if (z) {
                r47Var6.F5();
                jn7.f(r47Var6.K1).k(jn7.e2, Integer.valueOf(this.v0.e1()), 0);
            }
            this.v0 = null;
            this.B0 = false;
            if (z) {
                ip7.p0.abandonAudioFocus(this);
                this.V = (byte) 0;
                ArrayList arrayList = this.f0;
                int i2 = -1;
                if (arrayList != null) {
                    if (!z3 || (i2 = arrayList.indexOf(r47Var6)) < 0) {
                        this.f0 = null;
                        this.g0 = null;
                    } else {
                        this.f0.remove(i2);
                        this.g0.remove(r47Var6.e1());
                        if (this.f0.isEmpty()) {
                            this.f0 = null;
                            this.g0 = null;
                        }
                    }
                }
                ArrayList arrayList2 = this.f0;
                if (arrayList2 == null || i2 >= arrayList2.size()) {
                    if ((r47.Q4(r47Var6.k) || r47Var6.g4()) && r47Var6.e1() != 0 && this.M && this.s != null && this.O && xea.k(true)) {
                        this.r = true;
                        int currentAccount = this.s.getCurrentAccount();
                        long a = this.s.a();
                        zu1 zu1Var = this.s;
                        b77 b77Var = null;
                        r47 r47Var7 = zu1Var.m4;
                        int classGuid = zu1Var.getClassGuid();
                        zu1 zu1Var2 = this.s;
                        c5a X6 = zu1Var2 != null ? zu1Var2.X6() : null;
                        zu1 zu1Var3 = this.s;
                        long k7 = zu1Var3 != null ? zu1Var3.k7() : 0L;
                        zu1 zu1Var4 = this.s;
                        if (zu1Var4 != null) {
                            b77Var = zu1Var4.y5;
                        }
                        B0(currentAccount, a, null, r47Var7, null, classGuid, false, X6, k7, b77Var);
                        this.P = true;
                    }
                    z5 = false;
                    jn7.f(r47Var6.K1).k(jn7.f2, Integer.valueOf(r47Var6.e1()), Boolean.valueOf(z2));
                    o();
                } else {
                    r47 r47Var8 = (r47) this.f0.get(i2);
                    V(r47Var8);
                    if (!r47Var8.g4()) {
                        o();
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
        if (!z6 && z3 && !xea.k(true)) {
            zu1 zu1Var5 = this.s;
            E0(zu1Var5, z5, z5);
            this.s = zu1Var5;
        }
        if (!z2 || go.f() == null) {
            return;
        }
        try {
            id1 c = id1.c(go.f());
            if (c != null) {
                c.b().b(true);
            }
        } catch (Exception e4) {
            cc4.g(e4, true);
        }
    }

    public final void m0(boolean z) {
        if (this.M0 == null || this.F0 == null) {
            return;
        }
        io9 io9Var = this.I0;
        if (!z) {
            if (io9Var == null) {
                w0(w());
            }
            if (this.I0 == null || this.M0.getParent() == null) {
                return;
            }
            E();
            this.O0.removeView(this.M0);
            return;
        }
        Bitmap d = io9Var != null ? io9Var.a.d() : null;
        boolean z2 = this.I0 != null;
        if (this.M0.getParent() == null) {
            this.O0.addView(this.M0);
        }
        if (this.N0) {
            this.M0.setDrawingReady(true);
        }
        this.F0.z0(this.H0);
        if (z2) {
            E();
            if (d != null && this.M0 != null) {
                ImageView imageView = new ImageView(this.M0.getContext());
                this.J0 = imageView;
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                this.J0.setImageBitmap(d);
                this.M0.addView(this.J0, tre.c(-1.0f, -1));
            }
            o();
        }
    }

    public final void n() {
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

    public final void n0(int i) {
        boolean z = xea.J0;
        if (i == 2) {
            xea.J0 = true;
            xea.K0 = false;
        } else if (i == 1) {
            xea.K0 = true;
            xea.J0 = false;
        } else {
            xea.K0 = false;
            xea.J0 = false;
        }
        MediaController z2 = z();
        r47 r47Var = z2.v0;
        if (r47Var != null && r47Var.I3()) {
            z2.g(z2.v0.K1);
        }
        SharedPreferences.Editor edit = uc7.e1().edit();
        edit.putBoolean("shuffleMusic", xea.J0);
        edit.putBoolean("playOrderReversed", xea.K0);
        edit.apply();
        boolean z3 = xea.J0;
        if (z != z3) {
            if (z3) {
                b();
                return;
            }
            r47 r47Var2 = this.v0;
            if (r47Var2 != null) {
                int indexOf = this.S0.indexOf(r47Var2);
                this.V0 = indexOf;
                if (indexOf == -1) {
                    n();
                    m(true, true, false, false);
                }
            }
        }
    }

    public final void o() {
        io9 io9Var = this.I0;
        if (io9Var != null) {
            this.I0 = null;
            io9Var.a();
        }
    }

    public final void o0(boolean z, float f) {
        float f3;
        String str;
        if (z) {
            if (this.r0 >= 6.0f && f == 1.0f && this.v0 != null) {
                this.j0.f0();
                r47 r47Var = this.v0;
                hl.d3(new dt(this, r47Var, r47Var.b0, (byte) 1), 50L);
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
        kfc kfcVar = this.j0;
        if (kfcVar != null) {
            kfcVar.u0(Math.round(f * 10.0f) / 10.0f);
        } else {
            kfc kfcVar2 = this.F0;
            if (kfcVar2 != null) {
                kfcVar2.u0(Math.round(f * 10.0f) / 10.0f);
            }
        }
        SharedPreferences.Editor putFloat = uc7.e1().edit().putFloat(z ? "musicPlaybackSpeed" : "playbackSpeed", f);
        if (z) {
            f3 = this.t0;
            str = "fastMusicPlaybackSpeed";
        } else {
            f3 = this.s0;
            str = "fastPlaybackSpeed";
        }
        putFloat.putFloat(str, f3).commit();
        jn7.e().k(jn7.M4, new Object[0]);
        if (this.U1) {
            return;
        }
        go.B(f);
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        hl.c3(new hl3((Object) this, i, (byte) 20));
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
        r47 r47Var;
        if (this.Q && VoIPService.getSharedInstance() == null) {
            if (sensorEvent.sensor.getType() == 8) {
                if (f11.a) {
                    cc4.b("proximity changed to " + sensorEvent.values[0] + " max value = " + sensorEvent.sensor.getMaximumRange());
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
                                boolean z5 = f11.a;
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
            boolean z6 = (this.y0 || this.v0 != null || !xea.k(z) || !a.w || this.N || !this.O || this.s == null || this.X) ? false : z;
            boolean z7 = (xea.k(false) && (r47Var = this.v0) != null && (r47.Q4(r47Var.k) || this.v0.g4())) ? z : false;
            boolean z8 = this.J;
            boolean z9 = (this.F == 6 || this.w || System.currentTimeMillis() - this.x < 60) ? z : false;
            boolean z10 = (this.M || this.r) ? z : false;
            boolean z11 = ((z9 || z10) && !v() && !VoIPService.isAnyKindOfCallActive() && (z6 || z7) && !PhotoViewer.q0().V0()) ? z : false;
            PowerManager.WakeLock wakeLock = this.d;
            if (wakeLock != null) {
                if (wakeLock.isHeld()) {
                    if (!z11) {
                        if (f11.a) {
                            cc4.b("wake lock releasing (proximityDetected=" + z8 + ", accelerometerDetected=" + z9 + ", alreadyPlaying=" + z10 + ")");
                        }
                        this.d.release();
                    }
                } else if (z11) {
                    if (f11.a) {
                        cc4.b("wake lock acquiring (proximityDetected=" + z8 + ", accelerometerDetected=" + z9 + ", alreadyPlaying=" + z10 + ")");
                    }
                    this.d.acquire();
                }
            }
            if (this.J) {
                if (z11) {
                    if (z6 && this.M1 == null) {
                        if (!this.r) {
                            if (f11.a) {
                                cc4.b("start record");
                            }
                            this.M = z;
                            if (this.g1 == null) {
                                zu1 zu1Var = this.s;
                                ArrayList arrayList2 = zu1Var.M6;
                                nr1 nr1Var = zu1Var.a0;
                                if (nr1Var == null || !nr1Var.X0()) {
                                    int size = arrayList2.size() - 1;
                                    while (true) {
                                        if (size >= 0) {
                                            r47 r47Var2 = (r47) arrayList2.get(size);
                                            if ((r47.Q4(r47Var2.k) || r47Var2.g4()) && r47Var2.k.media_unread && !r47Var2.N3()) {
                                                MediaController z12 = z();
                                                if (z().V(r47Var2)) {
                                                    z3 = true;
                                                    arrayList = zu1Var.j6(r47Var2, true);
                                                } else {
                                                    z3 = true;
                                                    arrayList = null;
                                                }
                                                z12.u0(arrayList, z3);
                                            } else {
                                                size--;
                                            }
                                        } else if (zu1Var.getParentActivity() != null && zu1Var.getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
                                            zu1Var.getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
                                        }
                                    }
                                }
                                if (this.M) {
                                    t0();
                                }
                            }
                            this.r = true;
                            this.M = false;
                            Z(true);
                            if (this.M) {
                            }
                        }
                    } else if (z7 && !this.M) {
                        if (f11.a) {
                            cc4.b("start listen");
                        }
                        t0();
                        y0(false);
                    }
                    this.F = 0;
                    this.y = 0;
                    this.E = (byte) 0;
                    this.G = 0;
                } else if ((this.f == null || this.h == null) && this.n == null && !VoIPService.isAnyKindOfCallActive()) {
                    if (this.v0 != null && !a.x && z7 && !this.M && !this.y0 && !v()) {
                        if (f11.a) {
                            cc4.b("start listen by proximity only");
                        }
                        t0();
                        y0(false);
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
                    if (f11.a) {
                        cc4.b("stop record");
                    }
                    Z(false);
                    this.r = false;
                    this.P = false;
                } else if (this.M) {
                    if (f11.a) {
                        cc4.b("stop listen");
                    }
                    this.M = false;
                    y0(true);
                    this.P = false;
                }
            }
            if (this.H == j) {
            }
        }
    }

    public final void p(n20 n20Var) {
        TLRPC.TL_document tL_document;
        File file = (File) n20Var.b;
        this.k1 = file;
        long j = n20Var.a;
        this.l1 = j;
        byte[] bArr = (byte[]) n20Var.c;
        String str = null;
        K0(file, j, bArr == null ? null : (byte[]) bArr.clone());
        if (this.C1 == 3) {
            this.L1 = n20Var;
            v20 v20Var = this.G1;
            if (v20Var != null) {
                v20Var.b.o();
                v20Var.h = true;
                this.G1 = null;
            }
            b0(false);
            l0(false);
            return;
        }
        ls6.d0(this.i1).D1(this.n1, this.o1, null);
        if (this.C1 == 1) {
            p7a f = p7a.f(this.g1, null, file.getAbsolutePath(), this.n1, this.r1, this.s1, null, null, null, null, this.D1, this.E1, 0, this.F1 ? Integer.MAX_VALUE : 0, null, null, false);
            f.R = this.p1;
            f.T = this.q1;
            f.H = this.t1;
            f.K = this.u1;
            f.Q = 0L;
            r7a.B(this.i1).q0(f);
        }
        jn7 f3 = jn7.f(this.i1);
        Integer valueOf = Integer.valueOf(this.h1);
        if (this.C1 == 2) {
            TLRPC.TL_document tL_document2 = this.g1;
            str = file.getAbsolutePath();
            tL_document = tL_document2;
        } else {
            tL_document = null;
        }
        f3.k(jn7.s2, valueOf, tL_document, str);
        u(true);
    }

    public final void p0() {
        try {
            float f = this.Y != 1 ? 1.0f : 0.2f;
            kfc kfcVar = this.j0;
            if (kfcVar != null) {
                kfcVar.A0(go.w() ? 0.0f : f * this.Q1);
                return;
            }
            kfc kfcVar2 = this.F0;
            if (kfcVar2 != null) {
                if (go.w()) {
                    f = 0.0f;
                }
                kfcVar2.A0(f);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final boolean q0(ArrayList arrayList, r47 r47Var, long j, boolean z, oo6 oo6Var, long j2) {
        HashMap hashMap;
        r47 r47Var2 = this.v0;
        ArrayList arrayList2 = this.S0;
        if (r47Var2 == r47Var) {
            int indexOf = arrayList2.indexOf(r47Var);
            if (indexOf >= 0) {
                this.V0 = indexOf;
            }
            return V(r47Var);
        }
        this.W0 = !z;
        this.Z0 = j;
        this.C0 = !arrayList2.isEmpty();
        n();
        this.D0 = oo6Var;
        this.b1 = j2;
        boolean z2 = false;
        if (!arrayList.isEmpty() && wf3.B(r47.B0(((r47) arrayList.get(0)).k))) {
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
            r47 r47Var3 = (r47) arrayList.get(size);
            if (r47Var3.I3()) {
                int e1 = r47Var3.e1();
                if (e1 > 0 || z2) {
                    i = Math.min(i, e1);
                    i2 = Math.max(i2, e1);
                }
                arrayList2.add(r47Var3);
                hashMap.put(Integer.valueOf(e1), r47Var3);
            }
            size--;
        }
        x0();
        int indexOf2 = arrayList2.indexOf(r47Var);
        this.V0 = indexOf2;
        if (indexOf2 == -1) {
            n();
            this.V0 = arrayList2.size();
            arrayList2.add(r47Var);
            hashMap.put(Integer.valueOf(r47Var.e1()), r47Var);
        }
        if (r47Var.I3() && !r47Var.r1) {
            if (xea.J0) {
                b();
            }
            if (z) {
                if (this.D0 == null) {
                    final ls6 d0 = ls6.d0(r47Var.K1);
                    final long B0 = r47.B0(r47Var.k);
                    final long j3 = this.b1;
                    final long j4 = i;
                    final long j5 = i2;
                    d0.getMessagesStorage().a.c(new Runnable() { // from class: rr6
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
                            rr6 rr6Var = this;
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = new ArrayList();
                            int i3 = 0;
                            while (true) {
                                ls6 ls6Var = ls6.this;
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
                                        SQLiteDatabase sQLiteDatabase = ls6Var.getMessagesStorage().b;
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
                                        cc4.g(e, true);
                                        hl.c3(new hv4(ls6Var, j7, arrayList3, arrayList5, j6));
                                    }
                                } else {
                                    arrayList3 = arrayList4;
                                    if (i4 == 0) {
                                        if (wf3.B(j7)) {
                                            SQLiteDatabase sQLiteDatabase2 = ls6Var.getMessagesStorage().b;
                                            Locale locale2 = Locale.US;
                                            sQLiteCursor2 = sQLiteDatabase2.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j7 + " AND mid > " + j8 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        } else {
                                            SQLiteDatabase sQLiteDatabase3 = ls6Var.getMessagesStorage().b;
                                            Locale locale3 = Locale.US;
                                            sQLiteCursor2 = sQLiteDatabase3.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j7 + " AND mid < " + j8 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        }
                                    } else if (wf3.B(j7)) {
                                        SQLiteDatabase sQLiteDatabase4 = ls6Var.getMessagesStorage().b;
                                        Locale locale4 = Locale.US;
                                        r1 = 0;
                                        sQLiteCursor = sQLiteDatabase4.queryFinalized("SELECT data, mid FROM media_v4 WHERE uid = " + j7 + " AND mid < " + j9 + " AND type = 4 ORDER BY date DESC, mid DESC LIMIT 1000", new Object[0]);
                                        while (sQLiteCursor.next()) {
                                            try {
                                                NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(r1);
                                                if (byteBufferValue != 0) {
                                                    TLRPC.Message TLdeserialize = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r1), r1);
                                                    TLdeserialize.readAttachPath(byteBufferValue, ls6Var.getUserConfig().n);
                                                    byteBufferValue.reuse();
                                                    if (r47.K3(TLdeserialize)) {
                                                        TLdeserialize.id = sQLiteCursor.intValue(1);
                                                        TLdeserialize.dialog_id = j7;
                                                        z3 = false;
                                                        arrayList6.add(0, new r47(ls6Var.currentAccount, TLdeserialize, false, true));
                                                    } else {
                                                        z3 = false;
                                                    }
                                                } else {
                                                    z3 = r1;
                                                }
                                                r1 = z3;
                                            } catch (Exception e3) {
                                                e = e3;
                                                cc4.g(e, true);
                                                hl.c3(new hv4(ls6Var, j7, arrayList3, arrayList5, j6));
                                            }
                                        }
                                        sQLiteCursor.dispose();
                                        i3 = i4 + 1;
                                        rr6Var = this;
                                        arrayList4 = arrayList3;
                                    } else {
                                        SQLiteDatabase sQLiteDatabase5 = ls6Var.getMessagesStorage().b;
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
                                rr6Var = this;
                                arrayList4 = arrayList3;
                                hl.c3(new hv4(ls6Var, j7, arrayList3, arrayList5, j6));
                            }
                            arrayList3 = arrayList4;
                            hl.c3(new hv4(ls6Var, j7, arrayList3, arrayList5, j6));
                        }
                    });
                } else {
                    this.a1 = ConnectionsManager.generateClassGuid();
                }
            }
        }
        return V(r47Var);
    }

    public final void r0(boolean z) {
        xl4 xl4Var;
        io9 io9Var = this.I0;
        if (io9Var == null || (xl4Var = io9Var.a.e) == null || xl4Var.P == z || xl4Var.j == null) {
            return;
        }
        xl4Var.P = z;
        if (z) {
            xl4Var.d();
        }
        AnimatorSet animatorSet = xl4Var.Q;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        xl4Var.Q = animatorSet2;
        animatorSet2.setDuration(150L);
        xl4Var.Q.setInterpolator(k43.f);
        xl4Var.Q.playTogether(ObjectAnimator.ofFloat(xl4Var.j, (Property<wl4, Float>) View.ALPHA, z ? 0.0f : 1.0f), ObjectAnimator.ofFloat(xl4Var.j, (Property<wl4, Float>) View.SCALE_X, z ? 0.8f : 1.0f), ObjectAnimator.ofFloat(xl4Var.j, (Property<wl4, Float>) View.SCALE_Y, z ? 0.8f : 1.0f));
        xl4Var.Q.start();
    }

    public final void s0(TextureView textureView, jx jxVar, FrameLayout frameLayout, boolean z) {
        if (textureView != null) {
            if (!z && this.H0 == textureView) {
                if (this.F0 != null && this.I0 == null) {
                    w0(w());
                }
                E();
                this.H0 = null;
                this.M0 = null;
                this.O0 = null;
                return;
            }
            if (this.F0 == null || textureView == this.H0) {
                return;
            }
            E();
            this.N0 = jxVar != null && jxVar.d;
            this.H0 = textureView;
            if (this.I0 == null) {
                this.F0.z0(textureView);
            }
            this.M0 = jxVar;
            this.O0 = frameLayout;
            if (!this.Q0 || jxVar == null) {
                return;
            }
            jxVar.a(this.P0, 0);
        }
    }

    public final void t0() {
        this.M = true;
        AudioManager audioManager = ip7.p0;
        audioManager.setBluetoothScoOn(false);
        audioManager.setSpeakerphoneOn(false);
    }

    public final void u(boolean z) {
        File file;
        b0(false);
        l0(false);
        v20 v20Var = this.G1;
        if (v20Var != null) {
            v20Var.b.o();
            v20Var.h = true;
            this.G1 = null;
        }
        if (!z && (file = this.k1) != null) {
            u60.b(file);
            this.k1.delete();
        }
        c0();
        this.y0 = false;
        this.r = false;
        this.P = false;
    }

    public final void u0(ArrayList arrayList, boolean z) {
        ArrayList arrayList2 = arrayList != null ? new ArrayList(arrayList) : null;
        this.f0 = arrayList2;
        if (arrayList2 != null) {
            this.e0 = z;
            this.g0 = new SparseArray();
            for (int i = 0; i < this.f0.size(); i++) {
                r47 r47Var = (r47) this.f0.get(i);
                this.g0.put(r47Var.e1(), r47Var);
            }
        }
    }

    public final Bitmap w() {
        jx jxVar;
        if (this.H0 != null && (jxVar = this.M0) != null && jxVar.getParent() != null && this.H0.isAvailable()) {
            try {
                return this.H0.getBitmap();
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
        return null;
    }

    public final void w0(Bitmap bitmap) {
        if (this.F0 != null) {
            io9 io9Var = this.I0;
            if (io9Var != null) {
                io9Var.a.e();
            } else {
                if (this.K0 == null) {
                    return;
                }
                io9 io9Var2 = new io9();
                this.I0 = io9Var2;
                try {
                    io9Var2.b = io9Var2.a.i(this.K0, bitmap, true);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                if (io9Var2.b == null) {
                    this.I0 = null;
                    io9Var2.a();
                    return;
                }
            }
            E();
            this.F0.z0(this.I0.b);
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
    /* JADX WARN: Type inference failed for: r2v4, types: [h00] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final qh2 x() {
        FileOutputStream fileOutputStream;
        nh2 nh2Var;
        nh2 nh2Var2;
        ?? r11;
        r47 r47Var = this.v0;
        FileOutputStream fileOutputStream2 = null;
        String str = null;
        if (r47Var != null) {
            ?? r2 = 1;
            r2 = 1;
            String y1 = r47Var.y1(true);
            String w1 = this.v0.w1(true);
            TLRPC.Document F0 = this.v0.F0();
            if (this.v0.g4() || r47.K4(this.v0.k) || this.v0.I3()) {
                r47 r47Var2 = this.v0;
                File file = (!r47Var2.y0 || r47Var2.k == null) ? null : new File(this.v0.k.attachPath);
                if (file == null || !file.exists()) {
                    xb4.G(this.v0.K1);
                    file = xb4.M(this.v0.k, false, true);
                }
                if (file != null && file.exists()) {
                    String t1 = this.v0.t1();
                    Uri parse = Uri.parse("file://" + file.getAbsolutePath());
                    mt6 mt6Var = new mt6(0);
                    h00 h00Var = this.E0;
                    if (h00Var != null) {
                        if (!TextUtils.isEmpty(h00Var.c)) {
                            mt6Var.b("com.google.android.gms.cast.metadata.TITLE", this.E0.c);
                        }
                        if (!TextUtils.isEmpty(this.E0.d)) {
                            mt6Var.b("com.google.android.gms.cast.metadata.ARTIST", this.E0.d);
                        }
                        if (!TextUtils.isEmpty(this.E0.f)) {
                            mt6Var.b("com.google.android.gms.cast.metadata.ALBUM_TITLE", this.E0.f);
                        }
                        if (!TextUtils.isEmpty(this.E0.e)) {
                            mt6Var.b("com.google.android.gms.cast.metadata.ALBUM_ARTIST", this.E0.e);
                        }
                        if (!TextUtils.isEmpty(this.E0.m)) {
                            mt6Var.b("com.google.android.gms.cast.metadata.COMPOSER", this.E0.m);
                        }
                        short s = this.E0.k;
                        Bundle bundle = mt6Var.b;
                        if (s != 0) {
                            r11 = "com.google.android.gms.cast.metadata.DISC_NUMBER";
                            mt6.c(2, "com.google.android.gms.cast.metadata.DISC_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.DISC_NUMBER", s);
                        }
                        short s2 = this.E0.j;
                        FileOutputStream fileOutputStream3 = r11;
                        if (s2 != 0) {
                            mt6.c(2, "com.google.android.gms.cast.metadata.TRACK_NUMBER");
                            bundle.putInt("com.google.android.gms.cast.metadata.TRACK_NUMBER", s2);
                            fileOutputStream3 = "com.google.android.gms.cast.metadata.TRACK_NUMBER";
                        }
                        h00 h00Var2 = this.E0;
                        if (h00Var2.o != null) {
                            File file2 = h00Var2.q;
                            if (file2 == null || !file2.exists()) {
                                file2 = c8b.w(yac.t0, "jpg");
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
                                                cc4.g(e, true);
                                                fileOutputStream3 = fileOutputStream;
                                            }
                                        } catch (Exception e3) {
                                            e = e3;
                                            cc4.g(e, true);
                                            if (fileOutputStream != null) {
                                                try {
                                                    fileOutputStream.close();
                                                } catch (Exception e4) {
                                                    cc4.g(e4, true);
                                                }
                                            }
                                            file2 = null;
                                            fileOutputStream3 = fileOutputStream;
                                            r2 = this.E0;
                                            r2.q = file2;
                                            if (file2 != null) {
                                                rx6 rx6Var = (rx6) lh2.t().b;
                                                nh2Var = (nh2) rx6Var.b;
                                                if (nh2Var != null) {
                                                }
                                                str = "/file" + Utilities.c.nextLong();
                                                nh2Var2 = (nh2) rx6Var.b;
                                                if (nh2Var2 == null) {
                                                }
                                                nh2Var2.k(file2, str);
                                                mt6Var.a.add(new kxc(Uri.parse(nh2.i(nh2.h(), str)), 0, 0));
                                            }
                                            oh2 oh2Var = new oh2(t1, parse, "/player_" + this.v0.e1());
                                            oh2Var.e = y1;
                                            oh2Var.f = w1;
                                            oh2Var.h = mt6Var;
                                            return new qh2(new ph2(oh2Var));
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        fileOutputStream2 = fileOutputStream3;
                                        if (fileOutputStream2 != null) {
                                            try {
                                                fileOutputStream2.close();
                                            } catch (Exception e5) {
                                                cc4.g(e5, r2);
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
                                rx6 rx6Var2 = (rx6) lh2.t().b;
                                nh2Var = (nh2) rx6Var2.b;
                                if (nh2Var != null) {
                                    Pair pair = nh2Var.i;
                                    if ((pair == null ? null : (File) pair.second) != null) {
                                        if (TextUtils.equals((pair == null ? null : (File) pair.second).getAbsolutePath(), file2.getAbsolutePath())) {
                                            Pair pair2 = ((nh2) rx6Var2.b).i;
                                            if (pair2 != null) {
                                                str = (String) pair2.first;
                                            }
                                            mt6Var.a.add(new kxc(Uri.parse(nh2.i(nh2.h(), str)), 0, 0));
                                        }
                                    }
                                }
                                str = "/file" + Utilities.c.nextLong();
                                nh2Var2 = (nh2) rx6Var2.b;
                                if (nh2Var2 == null) {
                                    nh2Var2 = new nh2();
                                    rx6Var2.b = nh2Var2;
                                }
                                nh2Var2.k(file2, str);
                                mt6Var.a.add(new kxc(Uri.parse(nh2.i(nh2.h(), str)), 0, 0));
                            }
                        }
                    }
                    oh2 oh2Var2 = new oh2(t1, parse, "/player_" + this.v0.e1());
                    oh2Var2.e = y1;
                    oh2Var2.f = w1;
                    oh2Var2.h = mt6Var;
                    return new qh2(new ph2(oh2Var2));
                }
            }
            kfc kfcVar = this.F0;
            if (kfcVar != null) {
                return kfcVar.Q(qu6.p(new StringBuilder(), F0 != null ? F0.id : this.v0.e1(), ""), y1, w1);
            }
            kfc kfcVar2 = this.j0;
            if (kfcVar2 != null) {
                return kfcVar2.Q(qu6.p(new StringBuilder(), F0 != null ? F0.id : this.v0.e1(), ""), y1, w1);
            }
        }
        return null;
    }

    public final void x0() {
        Collections.sort(this.S0, new vk6((byte) 1));
    }

    public final void y0(boolean z) {
        r47 r47Var = this.v0;
        if (r47Var != null) {
            byte b = 1;
            jn7.f(r47Var.K1).k(jn7.u2, Boolean.valueOf(this.M));
            kfc kfcVar = this.F0;
            if (kfcVar != null) {
                kfcVar.w0(this.M ? 0 : 3);
                if (z) {
                    U(this.v0, true);
                    return;
                }
                if (this.F0.S() < 1000) {
                    this.F0.o0(0L);
                }
                this.F0.g0();
                return;
            }
            kfc kfcVar2 = this.j0;
            boolean z2 = kfcVar2 != null;
            r47 r47Var2 = this.v0;
            float f = r47Var2.b0;
            int i = r47Var2.j0;
            if (z || kfcVar2 == null || !kfcVar2.c0() || i * f > 1.0f) {
                r47Var2.b0 = f;
            } else {
                r47Var2.b0 = 0.0f;
            }
            m(false, true, false, false);
            V(r47Var2);
            if (z) {
                if (z2) {
                    hl.d3(new mn6(this, r47Var2, b), 100L);
                } else {
                    U(r47Var2, true);
                }
            }
        }
    }

    public final void z0(r47 r47Var) {
        synchronized (this.A0) {
            Timer timer = this.z0;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.z0 = null;
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
            r47Var.S0();
            Timer timer2 = new Timer();
            this.z0 = timer2;
            timer2.schedule(new iy2(this, r47Var, (byte) 2), 0L, 17L);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }
}
