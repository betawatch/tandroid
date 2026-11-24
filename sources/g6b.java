// default package

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class g6b {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public y7b E0;
    public long H;
    public boolean H0;
    public long I;
    public long J;
    public long J0;
    public boolean K;
    public File L;
    public TLRPC.InputMedia L0;
    public boolean M;
    public Bitmap M0;
    public String N;
    public File N0;
    public Bitmap O;
    public File O0;
    public File P0;
    public int Q;
    public File Q0;
    public int R;
    public File R0;
    public sl2 S;
    public ArrayList T;
    public ArrayList T0;
    public ArrayList U0;
    public ArrayList V0;
    public File W0;
    public long X;
    public File X0;
    public boolean Y;
    public File Y0;
    public float Z;
    public File Z0;
    public lo6 a1;
    public long b;
    public boolean b0;
    public Bitmap b1;
    public boolean c;
    public TLRPC.Document c0;
    public boolean c1;
    public long d;
    public i48 d0;
    public f6b d1;
    public long e;
    public int f;
    public boolean f0;
    public boolean g;
    public Bitmap g0;
    public boolean h;
    public long h0;
    public boolean j;
    public boolean k;
    public int k0;
    public boolean l;
    public int l0;
    public ArrayList m;
    public ao6 m0;
    public boolean n;
    public boolean o;
    public File o0;
    public SpannableStringBuilder p;
    public String p0;
    public TLRPC.Peer q;
    public long q0;
    public int r;
    public long r0;
    public String s;
    public float s0;
    public TLRPC.MessageMedia t;
    public boolean u;
    public ArrayList v;
    public TLRPC.InputPeer v0;
    public boolean w;
    public HashSet w0;
    public TLRPC.TL_error x;
    public Drawable x0;
    public String y;
    public TLRPC.InputDocument z;
    public final int a = z8c.t0;
    public double i = -1.0d;
    public float F = 1.0f;
    public float G = 1.0f;
    public float P = 1.0f;
    public boolean U = false;
    public float V = 0.0f;
    public float W = 1.0f;
    public float a0 = 1.0f;
    public long e0 = -1;
    public int i0 = 720;
    public int j0 = 1280;
    public final Matrix n0 = new Matrix();
    public float t0 = 1.0f;
    public float u0 = 1.0f;
    public boolean y0 = cmb.I.o();
    public long z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int e1 = 0;

    public static void B(BitmapFactory.Options options, int i) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        if (((i2 * i3) << 3) > maxMemory || Math.max(i2, i3) > 4200 || gda.o() <= 0) {
            options.inScaled = true;
            options.inDensity = options.outWidth;
            options.inTargetDensity = i;
        }
    }

    public static Boolean C(k47 k47Var) {
        TLRPC.Peer peer;
        if (k47Var != null) {
            int i = k47Var.K1;
            TLRPC.Message message = k47Var.k;
            if (message != null) {
                TLRPC.Chat L0 = oc7.r1(i).L0(Long.valueOf(-pg3.n(message.peer_id)));
                if ((L0 == null || !L0.noforwards) && sd2.V(L0)) {
                    return Boolean.FALSE;
                }
                TLRPC.MessageFwdHeader messageFwdHeader = k47Var.k.fwd_from;
                if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
                    long n = pg3.n(peer);
                    TLRPC.Chat L02 = oc7.r1(i).L0(Long.valueOf(-n));
                    if (n < 0 && ((L02 == null || !L02.noforwards) && sd2.V(L02))) {
                        return Boolean.TRUE;
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static g6b a(sl2 sl2Var, ArrayList arrayList) {
        g6b g6bVar = new g6b();
        g6bVar.S = sl2Var;
        g6bVar.T = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g6b g6bVar2 = (g6b) obj;
            if (g6bVar2.K) {
                g6bVar.K = true;
                g6bVar2.V = 0.0f;
                g6bVar2.W = Math.min(1.0f, 59000.0f / g6bVar2.h0);
            }
        }
        if (g6bVar.K) {
            g6bVar.k0 = 720;
            g6bVar.l0 = 1280;
            g6bVar.i0 = 720;
            g6bVar.j0 = 1280;
        } else {
            g6bVar.k0 = 1080;
            g6bVar.l0 = 1920;
            g6bVar.i0 = 1080;
            g6bVar.j0 = 1920;
        }
        g6bVar.z();
        return g6bVar;
    }

    public static int d(BitmapFactory.Options options, int i, int i2) {
        double min = (options.outHeight > i2 || options.outWidth > i) ? Math.min((int) Math.ceil(r0 / i2), (int) Math.ceil(r6 / i)) : 1;
        return Math.max(1, (int) Math.pow(min, Math.floor(Math.log(min) / 0.6931471805599453d)));
    }

    public static void j(Canvas canvas, Drawable drawable, int i, int i2) {
        if (drawable == null) {
            return;
        }
        Rect rect = new Rect(drawable.getBounds());
        Drawable.Callback callback = drawable.getCallback();
        drawable.setCallback(null);
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            float width = bitmapDrawable.getBitmap().getWidth();
            float height = bitmapDrawable.getBitmap().getHeight();
            float max = Math.max(i / width, i2 / height);
            drawable.setBounds(0, 0, (int) (width * max), (int) (height * max));
            drawable.draw(canvas);
        } else {
            drawable.setBounds(0, 0, i, i2);
            drawable.draw(canvas);
        }
        drawable.setBounds(rect);
        drawable.setCallback(callback);
    }

    public static String k(File file) {
        String path;
        int lastIndexOf;
        if (file == null || (lastIndexOf = (path = file.getPath()).lastIndexOf(46)) <= 0) {
            return null;
        }
        return path.substring(lastIndexOf + 1);
    }

    public static g6b l(jo6 jo6Var) {
        int i;
        g6b g6bVar = new g6b();
        g6bVar.L = new File(jo6Var.I);
        g6bVar.Q = jo6Var.J;
        g6bVar.R = jo6Var.K;
        g6bVar.K = !jo6Var.d() && jo6Var.b;
        g6bVar.N = jo6Var.c;
        long j = jo6Var.E * 1000;
        g6bVar.h0 = j;
        g6bVar.Z = 0.0f;
        g6bVar.a0 = Math.min(1.0f, 59000.0f / j);
        if (g6bVar.K && g6bVar.N == null) {
            g6bVar.N = "vthumb://" + jo6Var.C;
        }
        g6bVar.A0 = jo6Var.T;
        g6bVar.B0 = jo6Var.U;
        g6bVar.h(g6bVar.L.getAbsolutePath());
        int i2 = jo6Var.F;
        if (i2 > 0 && (i = jo6Var.G) > 0) {
            g6bVar.k0 = i2;
            g6bVar.l0 = i;
        }
        g6bVar.z();
        return g6bVar;
    }

    public static g6b m(File file, int i) {
        g6b g6bVar = new g6b();
        g6bVar.L = file;
        g6bVar.M = true;
        g6bVar.Q = i;
        g6bVar.R = 0;
        g6bVar.K = false;
        if (file != null) {
            g6bVar.h(file.getAbsolutePath());
        }
        g6bVar.z();
        return g6bVar;
    }

    public static g6b n(File file, TL_stories.StoryItem storyItem) {
        g6b g6bVar = new g6b();
        g6bVar.g = true;
        g6bVar.f = storyItem.id;
        g6bVar.L = file;
        g6bVar.M = false;
        g6bVar.k0 = 720;
        g6bVar.l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i = g6bVar.a;
        if (z) {
            g6bVar.K = false;
            if (file != null) {
                g6bVar.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            g6bVar.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        g6bVar.k0 = documentAttribute.w;
                        g6bVar.l0 = documentAttribute.h;
                        g6bVar.i = documentAttribute.duration;
                        break;
                    }
                    i2++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    g6bVar.N = str;
                } else if (document2.thumbs != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i3);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            g6bVar.O = fn5.B(null, photoSize.bytes);
                            break;
                        }
                        bc4.G(i);
                        File J = bc4.J(photoSize, null, true, true);
                        if (J != null && J.exists()) {
                            g6bVar.N = J.getAbsolutePath();
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        ArrayList arrayList = g6bVar.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        oc7 r1 = oc7.r1(i);
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            TLRPC.PrivacyRule privacyRule = arrayList2.get(i4);
            if (privacyRule != null) {
                if (privacyRule instanceof TLRPC.TL_privacyValueAllowAll) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowCloseFriends) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowCloseFriends());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowContacts) {
                    arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                } else if (privacyRule instanceof TLRPC.TL_privacyValueDisallowUsers) {
                    TLRPC.TL_privacyValueDisallowUsers tL_privacyValueDisallowUsers = (TLRPC.TL_privacyValueDisallowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
                    for (int i5 = 0; i5 < tL_privacyValueDisallowUsers.users.size(); i5++) {
                        Long l = tL_privacyValueDisallowUsers.users.get(i5);
                        l.getClass();
                        TLRPC.InputUser p1 = r1.p1(r1.W1(l));
                        if (!(p1 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(p1);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i6 = 0; i6 < tL_privacyValueAllowUsers.users.size(); i6++) {
                        Long l2 = tL_privacyValueAllowUsers.users.get(i6);
                        l2.getClass();
                        TLRPC.InputUser p12 = r1.p1(r1.W1(l2));
                        if (!(p12 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(p12);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        g6bVar.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence m = gw3.m(new SpannableString(storyItem.caption), cmb.n2.getFontMetricsInt(), true, null, 0);
            k47.b(m, storyItem.entities, true, false, true, false, 0);
            g6bVar.C0 = k47.A5(m, storyItem.entities, cmb.n2.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        g6bVar.z();
        g6bVar.e(storyItem);
        g6bVar.m = storyItem.media_areas;
        g6bVar.v0 = oc7.r1(i).i1(storyItem.dialogId);
        return g6bVar;
    }

    public static g6b o(File file, String str, long j) {
        g6b g6bVar = new g6b();
        g6bVar.c1 = true;
        g6bVar.L = file;
        g6bVar.M = true;
        g6bVar.Q = 0;
        g6bVar.R = 0;
        g6bVar.K = true;
        g6bVar.h0 = j;
        g6bVar.N = str;
        g6bVar.Z = 0.0f;
        g6bVar.a0 = Math.min(1.0f, 59500.0f / j);
        return g6bVar;
    }

    public static long p(k47 k47Var) {
        Boolean C = C(k47Var);
        if (C == null) {
            return 0L;
        }
        return C.booleanValue() ? pg3.n(k47Var.k.fwd_from.from_id) : k47.B0(k47Var.k);
    }

    public static Bitmap q(e6b e6bVar, int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        if (i3 == 90 || i3 == 270) {
            i4 = i;
            i5 = i2;
        } else {
            i5 = i;
            i4 = i2;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        e6bVar.n(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i6 = options.outWidth;
        int i7 = options.outHeight;
        boolean z2 = ((double) ((((long) (i6 * i7)) << 2) + (((long) (i5 * i4)) << 2))) * 1.1d <= ((double) maxMemory);
        if (i6 <= i5 && i7 <= i4) {
            return e6bVar.n(options);
        }
        if (z && z2 && gda.o() >= 1) {
            Bitmap n = e6bVar.n(options);
            float max = Math.max(i5 / n.getWidth(), i4 / n.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (n.getWidth() * max), (int) (n.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.y(n, createBitmap);
            return createBitmap;
        }
        options.inScaled = true;
        int i8 = options.outWidth;
        float f = i5 / i8;
        int i9 = options.outHeight;
        if (f > i4 / i9) {
            options.inDensity = i8;
            options.inTargetDensity = i5;
        } else {
            options.inDensity = i9;
            options.inTargetDensity = i4;
        }
        return e6bVar.n(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (k47.K2(document, true)) {
                    RLottieNative a = RLottieNative.a(str, null, null, null, 0, null);
                    if (a != null) {
                        int i = a.a[0];
                        a.d();
                        j = i;
                    } else {
                        j = 0;
                    }
                    if (j > 1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.tgnet.TLRPC$PhotoSize, org.telegram.tgnet.TLRPC$TL_photoSize_layer127] */
    public static File w(int i, String str) {
        TLRPC.TL_videoSize_layer127 tL_videoSize_layer127;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = TLObject.FLAG_31;
        tL_fileLocationToBeDeprecated.local_id = gda.p();
        tL_fileLocationToBeDeprecated.file_reference = new byte[0];
        if ("mp4".equals(str) || "webm".equals(str)) {
            TLRPC.TL_videoSize_layer127 tL_videoSize_layer1272 = new TLRPC.TL_videoSize_layer127();
            tL_videoSize_layer1272.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_videoSize_layer1272;
        } else {
            ?? tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_videoSize_layer127 = tL_photoSize_layer127;
        }
        bc4.G(i);
        return bc4.J(tL_videoSize_layer127, str, true, true);
    }

    public static g6b x(ArrayList arrayList) {
        k47 k47Var;
        int i;
        g6b g6bVar = new g6b();
        g6bVar.u = true;
        g6bVar.v = arrayList;
        g6bVar.i0 = 1080;
        g6bVar.j0 = 1920;
        g6bVar.z0 = p((k47) arrayList.get(0));
        pcc pccVar = new pcc();
        pccVar.a = (byte) 6;
        pccVar.c = 0.5f;
        pccVar.d = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        g6bVar.T0 = arrayList2;
        arrayList2.add(pccVar);
        if (arrayList.size() == 1 && (k47Var = (k47) arrayList.get(0)) != null && ((i = k47Var.D) == 8 || i == 3 || i == 5)) {
            TLRPC.Message message = k47Var.k;
            if (message != null && message.attachPath != null) {
                g6bVar.L = new File(k47Var.k.attachPath);
            }
            File file = g6bVar.L;
            if (file == null || !file.exists()) {
                bc4.G(g6bVar.a);
                g6bVar.L = bc4.M(k47Var.k, false, true);
            }
            File file2 = g6bVar.L;
            if (file2 != null && file2.exists()) {
                g6bVar.K = true;
                g6bVar.M = false;
                long L0 = (long) (k47Var.L0() * 1000.0d);
                g6bVar.h0 = L0;
                g6bVar.Z = 0.0f;
                g6bVar.a0 = Math.min(1.0f, 59500.0f / L0);
                return g6bVar;
            }
            g6bVar.L = null;
        }
        return g6bVar;
    }

    public final void A() {
        if (!this.K || v() || this.g || this.n || this.h0 <= 69000 || !z8c.h(this.a).p()) {
            return;
        }
        long j = this.h0 - 59000;
        long min = j > 10000 ? Math.min(59000L, j) + 59000 : 59000L;
        long j2 = this.h0 - min;
        if (j2 > 10000) {
            min += Math.min(59000L, j2);
        }
        this.a0 = Math.min(1.0f, min / this.h0);
    }

    public final boolean D() {
        ArrayList arrayList;
        ArrayList arrayList2;
        k47 k47Var;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.y == null && this.o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (k47Var = (k47) this.v.get(0)) == null || (message = k47Var.k) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i = 0; i < arrayList3.size(); i++) {
                    pcc pccVar = (pcc) arrayList3.get(i);
                    byte b = pccVar.a;
                    if (b != 0) {
                        if (b == 1 && (arrayList2 = pccVar.k) != null && !arrayList2.isEmpty()) {
                            for (int i2 = 0; i2 < pccVar.k.size(); i2++) {
                                occ occVar = (occ) pccVar.k.get(i2);
                                if (!u(occVar.document, occVar.a)) {
                                }
                            }
                        }
                    } else if (!u(pccVar.B, pccVar.j)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0274 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0244 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v48, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(float f, Bitmap bitmap) {
        byte b;
        byte b2;
        Bitmap bitmap2;
        float f2;
        Paint paint;
        boolean z;
        Bitmap q;
        Paint paint2;
        Bitmap bitmap3;
        byte b3;
        boolean z2;
        boolean z3;
        Matrix matrix = new Matrix();
        Paint paint3 = new Paint(7);
        int i = (int) (this.i0 * f);
        int i2 = (int) (this.j0 * f);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        final byte b4 = 0;
        if (this.Y0 != null) {
            try {
                Bitmap q2 = q(new e6b(this) { // from class: c6b
                    public final /* synthetic */ g6b b;

                    {
                        this.b = this;
                    }

                    @Override // e6b
                    public final Bitmap n(BitmapFactory.Options options) {
                        byte b5 = b4;
                        g6b g6bVar = this.b;
                        switch (b5) {
                            case 0:
                                return BitmapFactory.decodeFile(g6bVar.Y0.getPath(), options);
                            case 1:
                                return BitmapFactory.decodeFile(g6bVar.P0.getPath(), options);
                            case 2:
                                return BitmapFactory.decodeFile(g6bVar.W0.getPath(), options);
                            default:
                                return BitmapFactory.decodeFile(g6bVar.R0.getPath(), options);
                        }
                    }
                }, i, i2, 0, true);
                canvas.save();
                float width = this.i0 / q2.getWidth();
                canvas.scale(width, width);
                matrix.postScale(f, f);
                canvas.drawBitmap(q2, 0.0f, 0.0f, paint3);
                canvas.restore();
                q2.recycle();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } else {
            long j = this.z0;
            if (j == Long.MIN_VALUE) {
                Paint paint4 = new Paint(1);
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, canvas.getHeight(), new int[]{this.A0, this.B0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                b = 2;
                b2 = 0;
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint4);
                matrix.set(this.n0);
                if (bitmap == null) {
                    float width2 = this.k0 / bitmap.getWidth();
                    matrix.preScale(width2, width2);
                    matrix.postScale(f, f);
                    canvas.drawBitmap(bitmap, matrix, paint3);
                    return createBitmap;
                }
                if (v()) {
                    byte b5 = b2;
                    while (b5 < this.T.size()) {
                        g6b g6bVar = (g6b) this.T.get(b5);
                        File file = g6bVar.Z0;
                        if (file == null) {
                            file = g6bVar.L;
                        }
                        if (file != null) {
                            try {
                                z3 = true;
                            } catch (Exception e2) {
                                e = e2;
                                paint2 = paint3;
                                bitmap3 = createBitmap;
                                b3 = b5;
                                z2 = true;
                            }
                            try {
                                Bitmap q3 = q(new d6b(file, b2), i, i2, b2, true);
                                canvas.save();
                                RectF rectF = new RectF();
                                int width3 = q3.getWidth();
                                int height = q3.getHeight();
                                if ((((Integer) gm.L0(file).first).intValue() / 90) % 2 == 1) {
                                    width3 = q3.getHeight();
                                    height = q3.getWidth();
                                }
                                rl2 rl2Var = (rl2) this.S.e.get(b5);
                                z2 = true;
                                float f3 = i;
                                bitmap3 = createBitmap;
                                float f4 = i2;
                                try {
                                    b3 = b5;
                                    try {
                                        paint2 = paint3;
                                    } catch (Exception e3) {
                                        e = e3;
                                        paint2 = paint3;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    paint2 = paint3;
                                    b3 = b5;
                                }
                                try {
                                    rectF.set(rl2Var.a(f3), rl2Var.c * (f4 / rl2Var.a.c), rl2Var.b(f3), (f4 / rl2Var.a.c) * (rl2Var.c + 1));
                                    canvas.translate(rectF.centerX(), rectF.centerY());
                                    canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                                    float max = Math.max(rectF.width() / width3, rectF.height() / height);
                                    canvas.scale(max, max);
                                    canvas.rotate(((Integer) r3.first).intValue());
                                    canvas.translate((-q3.getWidth()) / 2.0f, (-q3.getHeight()) / 2.0f);
                                    canvas.drawBitmap(q3, 0.0f, 0.0f, (Paint) null);
                                    canvas.restore();
                                } catch (Exception e5) {
                                    e = e5;
                                    z3 = z2;
                                    fc4.g(e, z3);
                                    b5 = b3 + 1;
                                    createBitmap = bitmap3;
                                    paint3 = paint2;
                                    b2 = 0;
                                }
                            } catch (Exception e6) {
                                e = e6;
                                paint2 = paint3;
                                bitmap3 = createBitmap;
                                b3 = b5;
                                fc4.g(e, z3);
                                b5 = b3 + 1;
                                createBitmap = bitmap3;
                                paint3 = paint2;
                                b2 = 0;
                            }
                        } else {
                            paint2 = paint3;
                            bitmap3 = createBitmap;
                            b3 = b5;
                        }
                        b5 = b3 + 1;
                        createBitmap = bitmap3;
                        paint3 = paint2;
                        b2 = 0;
                    }
                    bitmap2 = createBitmap;
                    f2 = 0.0f;
                    paint = paint3;
                } else {
                    bitmap2 = createBitmap;
                    f2 = 0.0f;
                    File file2 = this.Z0;
                    if (file2 == null) {
                        file2 = this.L;
                    }
                    if (file2 != null) {
                        try {
                            q = q(new d6b(file2, (byte) 1), i, i2, this.Q, true);
                            float width4 = this.k0 / q.getWidth();
                            matrix.preScale(width4, width4);
                            matrix.postScale(f, f);
                            paint = paint3;
                        } catch (Exception e7) {
                            e = e7;
                            paint = paint3;
                        }
                        try {
                            canvas.drawBitmap(q, matrix, paint);
                            q.recycle();
                        } catch (Exception e8) {
                            e = e8;
                            z = true;
                            fc4.g(e, true);
                            if (this.P0 != null) {
                            }
                            if (this.W0 != null) {
                            }
                            if (this.R0 != null) {
                            }
                        }
                    } else {
                        paint = paint3;
                    }
                }
                z = true;
                if (this.P0 != null) {
                    try {
                        final byte b6 = z ? (byte) 1 : (byte) 0;
                        Bitmap q4 = q(new e6b(this) { // from class: c6b
                            public final /* synthetic */ g6b b;

                            {
                                this.b = this;
                            }

                            @Override // e6b
                            public final Bitmap n(BitmapFactory.Options options) {
                                byte b52 = b6;
                                g6b g6bVar2 = this.b;
                                switch (b52) {
                                    case 0:
                                        return BitmapFactory.decodeFile(g6bVar2.Y0.getPath(), options);
                                    case 1:
                                        return BitmapFactory.decodeFile(g6bVar2.P0.getPath(), options);
                                    case 2:
                                        return BitmapFactory.decodeFile(g6bVar2.W0.getPath(), options);
                                    default:
                                        return BitmapFactory.decodeFile(g6bVar2.R0.getPath(), options);
                                }
                            }
                        }, i, i2, 0, z);
                        canvas.save();
                        float width5 = this.i0 / q4.getWidth();
                        canvas.scale(width5, width5);
                        matrix.postScale(f, f);
                        canvas.drawBitmap(q4, f2, f2, paint);
                        canvas.restore();
                        q4.recycle();
                        z = true;
                    } catch (Exception e9) {
                        z = true;
                        fc4.g(e9, true);
                    }
                }
                if (this.W0 != null) {
                    try {
                        final byte b7 = b;
                        Bitmap q5 = q(new e6b(this) { // from class: c6b
                            public final /* synthetic */ g6b b;

                            {
                                this.b = this;
                            }

                            @Override // e6b
                            public final Bitmap n(BitmapFactory.Options options) {
                                byte b52 = b7;
                                g6b g6bVar2 = this.b;
                                switch (b52) {
                                    case 0:
                                        return BitmapFactory.decodeFile(g6bVar2.Y0.getPath(), options);
                                    case 1:
                                        return BitmapFactory.decodeFile(g6bVar2.P0.getPath(), options);
                                    case 2:
                                        return BitmapFactory.decodeFile(g6bVar2.W0.getPath(), options);
                                    default:
                                        return BitmapFactory.decodeFile(g6bVar2.R0.getPath(), options);
                                }
                            }
                        }, i, i2, 0, z);
                        canvas.save();
                        float width6 = this.i0 / q5.getWidth();
                        canvas.scale(width6, width6);
                        matrix.postScale(f, f);
                        canvas.drawBitmap(q5, f2, f2, paint);
                        canvas.restore();
                        q5.recycle();
                        z = true;
                    } catch (Exception e10) {
                        z = true;
                        fc4.g(e10, true);
                    }
                }
                if (this.R0 != null) {
                    return bitmap2;
                }
                try {
                    final byte b8 = 3;
                    Bitmap q6 = q(new e6b(this) { // from class: c6b
                        public final /* synthetic */ g6b b;

                        {
                            this.b = this;
                        }

                        @Override // e6b
                        public final Bitmap n(BitmapFactory.Options options) {
                            byte b52 = b8;
                            g6b g6bVar2 = this.b;
                            switch (b52) {
                                case 0:
                                    return BitmapFactory.decodeFile(g6bVar2.Y0.getPath(), options);
                                case 1:
                                    return BitmapFactory.decodeFile(g6bVar2.P0.getPath(), options);
                                case 2:
                                    return BitmapFactory.decodeFile(g6bVar2.W0.getPath(), options);
                                default:
                                    return BitmapFactory.decodeFile(g6bVar2.R0.getPath(), options);
                            }
                        }
                    }, i, i2, 0, z);
                    canvas.save();
                    float width7 = this.i0 / q6.getWidth();
                    canvas.scale(width7, width7);
                    matrix.postScale(f, f);
                    canvas.drawBitmap(q6, f2, f2, paint);
                    canvas.restore();
                    q6.recycle();
                    return bitmap2;
                } catch (Exception e11) {
                    fc4.g(e11, true);
                    return bitmap2;
                }
            }
            Drawable drawable = this.x0;
            if (drawable == null) {
                drawable = cl8.d(null, this.a, j, this.y0);
            }
            j(canvas, drawable, canvas.getWidth(), canvas.getHeight());
        }
        b = 2;
        b2 = 0;
        matrix.set(this.n0);
        if (bitmap == null) {
        }
    }

    public final void c(File file) {
        Bitmap b = b(1.0f, null);
        Bitmap bitmap = this.b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.b1 = null;
        }
        this.b1 = Bitmap.createScaledBitmap(b, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            b.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        b.recycle();
    }

    public final void e(TL_stories.StoryItem storyItem) {
        if (storyItem == null || storyItem.media == null) {
            return;
        }
        TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Photo photo = messageMedia.photo;
        if (photo == null) {
            TLRPC.Document document = messageMedia.document;
            if (document == null || !k47.V2(document)) {
                return;
            }
            TLRPC.TL_inputStickeredMediaDocument tL_inputStickeredMediaDocument = new TLRPC.TL_inputStickeredMediaDocument();
            TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
            tL_inputStickeredMediaDocument.id = tL_inputDocument;
            tL_inputDocument.id = document.id;
            tL_inputDocument.access_hash = document.access_hash;
            byte[] bArr = document.file_reference;
            tL_inputDocument.file_reference = bArr;
            if (bArr == null) {
                tL_inputDocument.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaDocument;
        } else {
            if (!photo.has_stickers) {
                return;
            }
            TLRPC.TL_inputStickeredMediaPhoto tL_inputStickeredMediaPhoto = new TLRPC.TL_inputStickeredMediaPhoto();
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputStickeredMediaPhoto.id = tL_inputPhoto;
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr2 = photo.file_reference;
            tL_inputPhoto.file_reference = bArr2;
            if (bArr2 == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            tL_messages_getAttachedStickers.media = tL_inputStickeredMediaPhoto;
        }
        this.e1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new av0((Object) this, (Object) storyItem, (Object) tL_messages_getAttachedStickers, (Object) new go9(this, (byte) 12), (byte) 26));
    }

    public final void f() {
        File file = this.P0;
        if (file != null) {
            file.delete();
            this.P0 = null;
        }
        File file2 = this.Y0;
        if (file2 != null) {
            file2.delete();
            this.Y0 = null;
        }
        File file3 = this.W0;
        if (file3 != null) {
            file3.delete();
            this.W0 = null;
        }
        File file4 = this.X0;
        if (file4 != null) {
            file4.delete();
            this.X0 = null;
        }
        File file5 = this.R0;
        if (file5 != null) {
            file5.delete();
            this.R0 = null;
        }
    }

    public final g6b g() {
        g6b g6bVar = new g6b();
        g6bVar.b = this.b;
        g6bVar.c = this.c;
        g6bVar.d = this.d;
        g6bVar.e = this.e;
        g6bVar.f = this.f;
        g6bVar.g = this.g;
        g6bVar.h = this.h;
        g6bVar.i = this.i;
        g6bVar.j = this.j;
        g6bVar.k = this.k;
        g6bVar.l = this.l;
        g6bVar.m = this.m;
        g6bVar.w = this.w;
        g6bVar.x = this.x;
        g6bVar.y = this.y;
        g6bVar.z = this.z;
        g6bVar.A = this.A;
        g6bVar.B = this.B;
        g6bVar.C = this.C;
        g6bVar.D = this.D;
        g6bVar.E = this.E;
        g6bVar.F = this.F;
        g6bVar.G = this.G;
        g6bVar.H = this.H;
        g6bVar.I = this.I;
        g6bVar.J = this.J;
        g6bVar.K = this.K;
        g6bVar.L = this.L;
        g6bVar.M = this.M;
        boolean z = this.M;
        int i = this.a;
        if (z) {
            File w = w(i, k(this.L));
            g6bVar.L = w;
            gm.F(this.L, w);
        }
        g6bVar.N = this.N;
        g6bVar.Y = this.Y;
        g6bVar.Z = this.Z;
        g6bVar.a0 = this.a0;
        g6bVar.h0 = this.h0;
        g6bVar.k0 = this.k0;
        g6bVar.l0 = this.l0;
        g6bVar.i0 = this.i0;
        g6bVar.j0 = this.j0;
        g6bVar.v0 = this.v0;
        g6bVar.R = this.R;
        g6bVar.n0.set(this.n0);
        g6bVar.A0 = this.A0;
        g6bVar.B0 = this.B0;
        g6bVar.C0 = this.C0;
        g6bVar.D0 = this.D0;
        g6bVar.E0 = this.E0;
        ArrayList arrayList = g6bVar.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        g6bVar.G0 = this.G0;
        g6bVar.H0 = this.H0;
        g6bVar.I0 = this.I0;
        g6bVar.M0 = this.M0;
        g6bVar.N0 = this.N0;
        g6bVar.w0 = this.w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w2 = w(i, k(this.N0));
            g6bVar.N0 = w2;
            gm.F(this.N0, w2);
        }
        g6bVar.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w3 = w(i, k(this.O0));
            g6bVar.O0 = w3;
            gm.F(this.O0, w3);
        }
        g6bVar.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w4 = w(i, k(this.P0));
            g6bVar.P0 = w4;
            gm.F(this.P0, w4);
        }
        g6bVar.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w5 = w(i, k(this.W0));
            g6bVar.W0 = w5;
            gm.F(this.W0, w5);
        }
        g6bVar.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w6 = w(i, k(this.Y0));
            g6bVar.Y0 = w6;
            gm.F(this.Y0, w6);
        }
        g6bVar.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w7 = w(i, k(this.Q0));
            g6bVar.Q0 = w7;
            gm.F(this.Q0, w7);
        }
        g6bVar.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w8 = w(i, k(this.R0));
            g6bVar.R0 = w8;
            gm.F(this.R0, w8);
        }
        g6bVar.S0 = this.S0;
        g6bVar.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i2 = 0; i2 < this.T0.size(); i2++) {
                g6bVar.T0.add(((pcc) this.T0.get(i2)).a());
            }
        }
        g6bVar.U0 = this.U0;
        g6bVar.V0 = this.V0;
        g6bVar.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w9 = w(i, k(this.Z0));
            g6bVar.Z0 = w9;
            gm.F(this.Z0, w9);
        }
        g6bVar.a1 = this.a1;
        g6bVar.b1 = this.b1;
        g6bVar.c1 = this.c1;
        g6bVar.O = this.O;
        g6bVar.n = this.n;
        g6bVar.o = this.o;
        g6bVar.o0 = this.o0;
        g6bVar.s0 = this.s0;
        g6bVar.t0 = this.t0;
        g6bVar.q0 = this.q0;
        g6bVar.p0 = this.p0;
        g6bVar.r0 = this.r0;
        g6bVar.u0 = this.u0;
        g6bVar.b0 = this.b0;
        g6bVar.J0 = this.J0;
        g6bVar.K0 = this.K0;
        g6bVar.L0 = this.L0;
        g6bVar.e0 = this.e0;
        g6bVar.T = this.T;
        g6bVar.S = this.S;
        g6bVar.U = this.U;
        g6bVar.X = this.X;
        g6bVar.P = this.P;
        return g6bVar;
    }

    public final void h(String str) {
        if (str != null) {
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                this.k0 = options.outWidth;
                this.l0 = options.outHeight;
            } catch (Exception unused) {
            }
        }
        if (this.K) {
            return;
        }
        if (((int) Math.max(this.k0, (this.l0 / 16.0f) * 9.0f)) <= 900) {
            this.i0 = 720;
            this.j0 = 1280;
        } else {
            this.i0 = 1080;
            this.j0 = 1920;
        }
    }

    public final void i(boolean z) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z) {
            f();
            File file2 = this.Z0;
            if (file2 != null) {
                file2.delete();
                this.Z0 = null;
            }
            File file3 = this.L;
            if (file3 != null) {
                if (this.M && (!this.g || this.j)) {
                    file3.delete();
                }
                this.L = null;
            }
            if (this.N != null) {
                if (this.M) {
                    new File(this.N).delete();
                }
                this.N = null;
            }
            ArrayList arrayList = this.T0;
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    pcc pccVar = (pcc) obj;
                    if (pccVar.a == 2 && !TextUtils.isEmpty(pccVar.t)) {
                        try {
                            new File(pccVar.t).delete();
                        } catch (Exception e) {
                            fc4.g(e, true);
                        }
                        pccVar.t = "";
                    }
                }
            }
            File file4 = this.o0;
            if (file4 != null && (!this.g || this.j)) {
                file4.delete();
                this.o0 = null;
            }
            if (this.p0 != null && (!this.g || this.j)) {
                try {
                    new File(this.p0).delete();
                } catch (Exception unused) {
                }
                this.p0 = null;
            }
        }
        this.O = null;
        if (this.T != null) {
            for (int i2 = 0; i2 < this.T.size(); i2++) {
                ((g6b) this.T.get(i2)).i(z);
            }
        }
        if (this.e1 != 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.e1, true);
        }
    }

    public final int r() {
        if (!this.K || v() || this.g) {
            return 1;
        }
        long j = this.h0;
        if (j <= 0 || this.n) {
            return 1;
        }
        if (((long) ((this.a0 - this.Z) * j)) >= 68999) {
            return (int) Math.ceil(r0 / 59000.0f);
        }
        return 1;
    }

    public final void s(qac qacVar) {
        int i;
        if (!D()) {
            qacVar.a(null);
            return;
        }
        if (!this.K && ((i = this.i0) > 720 || this.j0 > 1280)) {
            float f = 720.0f / i;
            this.n0.postScale(f, f, 0.0f, 0.0f);
            this.i0 = 720;
            this.j0 = 1280;
        }
        File file = this.L;
        String absolutePath = file == null ? null : file.getAbsolutePath();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, Math.max(1, v() ? this.T.size() : 0), 11);
        iArr[0] = new int[11];
        hza hzaVar = new hza((Object) this, absolutePath, (Object) iArr, (Object) qacVar, (byte) 8);
        if (!v()) {
            if (this.L == null) {
                hzaVar.run();
                return;
            } else {
                Utilities.e.c(new j2b(absolutePath, iArr, hzaVar, (byte) 7));
                return;
            }
        }
        String[] strArr = new String[this.T.size()];
        for (int i2 = 0; i2 < this.T.size(); i2++) {
            strArr[i2] = ((g6b) this.T.get(i2)).L == null ? null : ((g6b) this.T.get(i2)).L.getAbsolutePath();
            iArr[i2] = new int[11];
        }
        Utilities.e.c(new j2b(strArr, iArr, hzaVar, (byte) 6));
    }

    public final boolean t() {
        if (v()) {
            for (int i = 0; i < this.T.size(); i++) {
                if (((g6b) this.T.get(i)).K) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        return (this.S == null || this.T == null) ? false : true;
    }

    public final void y(Runnable runnable) {
        Bitmap bitmap;
        if (this.K && this.A0 == 0 && this.B0 == 0) {
            if (this.N == null) {
                Bitmap bitmap2 = this.O;
                if (bitmap2 != null) {
                    int[] b = lge.b(bitmap2, true);
                    this.A0 = b[0];
                    this.B0 = b[1];
                    runnable.run();
                    return;
                }
                return;
            }
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.N.startsWith("vthumb://")) {
                    long parseInt = Integer.parseInt(this.N.substring(9));
                    options.inJustDecodeBounds = true;
                    MediaStore.Video.Thumbnails.getThumbnail(a.b.getContentResolver(), parseInt, 1, options);
                    options.inSampleSize = d(options, nm7.O3, nm7.O3);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = MediaStore.Video.Thumbnails.getThumbnail(a.b.getContentResolver(), parseInt, 1, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.N);
                    options.inSampleSize = d(options, nm7.O3, nm7.O3);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = BitmapFactory.decodeFile(this.N);
                }
            } catch (Exception unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                int[] b2 = lge.b(bitmap, true);
                this.A0 = b2[0];
                this.B0 = b2[1];
                bitmap.recycle();
                runnable.run();
            }
        }
    }

    public final void z() {
        Matrix matrix = this.n0;
        matrix.reset();
        int i = this.k0;
        int i2 = this.l0;
        int i3 = this.Q;
        int i4 = this.R;
        matrix.postScale(i4 == 1 ? -1.0f : 1.0f, i4 == 2 ? -1.0f : 1.0f, i / 2.0f, i2 / 2.0f);
        if (i3 != 0) {
            matrix.postTranslate((-i) / 2.0f, (-i2) / 2.0f);
            matrix.postRotate(i3);
            if (i3 == 90 || i3 == 270) {
                i2 = i;
                i = i2;
            }
            matrix.postTranslate(i / 2.0f, i2 / 2.0f);
        }
        float f = i;
        float f2 = this.i0 / f;
        if (this.J0 != 0) {
            f2 = Math.min(f2, this.j0 / i2);
        } else {
            float f3 = i2;
            if (f3 / f > 1.29f) {
                f2 = Math.max(f2, this.j0 / f3);
            }
        }
        matrix.postScale(f2, f2);
        matrix.postTranslate(b10.b(f, f2, this.i0, 2.0f), b10.b(i2, f2, this.j0, 2.0f));
    }
}
