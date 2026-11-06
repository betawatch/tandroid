package fi;

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
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.g20;
import org.telegram.messenger.gc;
import org.telegram.messenger.gf;
import org.telegram.messenger.h20;
import org.telegram.messenger.hf;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.ye;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class e7 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public q8 E0;
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
    public t S;
    public ArrayList T;
    public ArrayList T0;
    public List U0;
    public ArrayList V0;
    public File W0;
    public long X;
    public File X0;
    public boolean Y;
    public File Y0;
    public float Z;
    public File Z0;
    public hf a1;
    public long b;
    public boolean b0;
    public Bitmap b1;
    public boolean c;
    public TLRPC.Document c0;
    public boolean c1;
    public long d;
    public bi.v3 d0;
    public d7 d1;
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
    public ye m0;
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
    public final int a = p10.s0;
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
    public boolean y0 = org.telegram.ui.ActionBar.k6.I.q();
    public long z0 = Long.MIN_VALUE;
    public boolean D0 = true;
    public final ArrayList F0 = new ArrayList();
    public boolean G0 = true;
    public int I0 = 86400;
    public String K0 = "";
    public long S0 = 5000;
    public int e1 = 0;

    public static void C(BitmapFactory.Options options, int i7) {
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i10 = options.outWidth;
        int i11 = options.outHeight;
        if (i10 * i11 * 8 > maxMemory || Math.max(i10, i11) > 4200 || iz.o() <= 0) {
            options.inScaled = true;
            options.inDensity = options.outWidth;
            options.inTargetDensity = i7;
        }
    }

    public static Boolean D(ij ijVar) {
        TLRPC.Peer peer;
        if (ijVar != null) {
            int i7 = ijVar.I1;
            TLRPC.Message message = ijVar.k;
            if (message != null) {
                TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(-org.telegram.messenger.m5.o(message.peer_id)));
                if ((M0 == null || !M0.noforwards) && org.telegram.messenger.t3.V(M0)) {
                    return Boolean.FALSE;
                }
                TLRPC.MessageFwdHeader messageFwdHeader = ijVar.k.fwd_from;
                if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
                    long o4 = org.telegram.messenger.m5.o(peer);
                    TLRPC.Chat M02 = qp.s1(i7).M0(Long.valueOf(-o4));
                    if (o4 < 0 && ((M02 == null || !M02.noforwards) && org.telegram.messenger.t3.V(M02))) {
                        return Boolean.TRUE;
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static e7 a(t tVar, ArrayList arrayList) {
        e7 e7Var = new e7();
        e7Var.S = tVar;
        e7Var.T = arrayList;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e7 e7Var2 = (e7) obj;
            if (e7Var2.K) {
                e7Var.K = true;
                e7Var2.V = 0.0f;
                e7Var2.W = Math.min(1.0f, 59000.0f / e7Var2.h0);
            }
        }
        if (e7Var.K) {
            e7Var.k0 = 720;
            e7Var.l0 = 1280;
            e7Var.i0 = 720;
            e7Var.j0 = 1280;
        } else {
            e7Var.k0 = 1080;
            e7Var.l0 = 1920;
            e7Var.i0 = 1080;
            e7Var.j0 = 1920;
        }
        e7Var.A();
        return e7Var;
    }

    public static int d(BitmapFactory.Options options, int i7, int i10) {
        double min = (options.outHeight > i10 || options.outWidth > i7) ? Math.min((int) Math.ceil(r0 / i10), (int) Math.ceil(r6 / i7)) : 1;
        return Math.max(1, (int) Math.pow(min, Math.floor(Math.log(min) / Math.log(2.0d))));
    }

    public static void j(Canvas canvas, Drawable drawable, int i7, int i10) {
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
            float max = Math.max(i7 / width, i10 / height);
            drawable.setBounds(0, 0, (int) (width * max), (int) (height * max));
            drawable.draw(canvas);
        } else {
            drawable.setBounds(0, 0, i7, i10);
            drawable.draw(canvas);
        }
        drawable.setBounds(rect);
        drawable.setCallback(callback);
    }

    public static String k(File file) {
        String path;
        int lastIndexOf;
        if (file != null && (lastIndexOf = (path = file.getPath()).lastIndexOf(46)) > 0) {
            return path.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static e7 l(gf gfVar) {
        int i7;
        e7 e7Var = new e7();
        e7Var.L = new File(gfVar.I);
        e7Var.Q = gfVar.J;
        e7Var.R = gfVar.K;
        e7Var.K = !gfVar.d() && gfVar.b;
        e7Var.N = gfVar.c;
        long j3 = gfVar.E * 1000;
        e7Var.h0 = j3;
        e7Var.Z = 0.0f;
        e7Var.a0 = Math.min(1.0f, 59000.0f / j3);
        if (e7Var.K && e7Var.N == null) {
            e7Var.N = "vthumb://" + gfVar.C;
        }
        e7Var.A0 = gfVar.T;
        e7Var.B0 = gfVar.U;
        e7Var.h(e7Var.L.getAbsolutePath());
        int i10 = gfVar.F;
        if (i10 > 0 && (i7 = gfVar.G) > 0) {
            e7Var.k0 = i10;
            e7Var.l0 = i7;
        }
        e7Var.A();
        return e7Var;
    }

    public static e7 m(File file, int i7) {
        e7 e7Var = new e7();
        e7Var.L = file;
        e7Var.M = true;
        e7Var.Q = i7;
        e7Var.R = 0;
        e7Var.K = false;
        if (file != null) {
            e7Var.h(file.getAbsolutePath());
        }
        e7Var.A();
        return e7Var;
    }

    public static e7 n(File file, TL_stories.StoryItem storyItem) {
        e7 e7Var = new e7();
        e7Var.g = true;
        e7Var.f = storyItem.id;
        e7Var.L = file;
        e7Var.M = false;
        e7Var.k0 = 720;
        e7Var.l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z9 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i7 = e7Var.a;
        if (z9) {
            e7Var.K = false;
            if (file != null) {
                e7Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            e7Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        e7Var.k0 = documentAttribute.w;
                        e7Var.l0 = documentAttribute.h;
                        e7Var.i = documentAttribute.duration;
                        break;
                    }
                    i10++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    e7Var.N = str;
                } else if (document2.thumbs != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i11);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            e7Var.O = gc.F(null, photoSize.bytes);
                            break;
                        }
                        org.telegram.messenger.w7.G(i7);
                        File K = org.telegram.messenger.w7.K(photoSize, null, true, true);
                        if (K != null && K.exists()) {
                            e7Var.N = K.getAbsolutePath();
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        ArrayList arrayList = e7Var.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        qp s12 = qp.s1(i7);
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            TLRPC.PrivacyRule privacyRule = arrayList2.get(i12);
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
                    for (int i13 = 0; i13 < tL_privacyValueDisallowUsers.users.size(); i13++) {
                        Long l10 = tL_privacyValueDisallowUsers.users.get(i13);
                        l10.getClass();
                        TLRPC.InputUser q12 = s12.q1(s12.a2(l10));
                        if (!(q12 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(q12);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i14 = 0; i14 < tL_privacyValueAllowUsers.users.size(); i14++) {
                        Long l11 = tL_privacyValueAllowUsers.users.get(i14);
                        l11.getClass();
                        TLRPC.InputUser q13 = s12.q1(s12.a2(l11));
                        if (!(q13 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(q13);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        e7Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence m10 = org.telegram.messenger.i6.m(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), true, null, 0);
            ij.b(m10, storyItem.entities, true, false, true, false, 0);
            e7Var.C0 = ij.C5(m10, storyItem.entities, org.telegram.ui.ActionBar.k6.o2.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        e7Var.A();
        e7Var.e(storyItem);
        e7Var.m = storyItem.media_areas;
        e7Var.v0 = qp.s1(i7).j1(storyItem.dialogId);
        return e7Var;
    }

    public static e7 o(File file, String str, long j3) {
        e7 e7Var = new e7();
        e7Var.c1 = true;
        e7Var.L = file;
        e7Var.M = true;
        e7Var.Q = 0;
        e7Var.R = 0;
        e7Var.K = true;
        e7Var.h0 = j3;
        e7Var.N = str;
        e7Var.Z = 0.0f;
        e7Var.a0 = Math.min(1.0f, 59500.0f / j3);
        return e7Var;
    }

    public static long p(ij ijVar) {
        Boolean D = D(ijVar);
        if (D == null) {
            return 0L;
        }
        return D.booleanValue() ? org.telegram.messenger.m5.o(ijVar.k.fwd_from.from_id) : ij.B0(ijVar.k);
    }

    public static Bitmap q(c7 c7Var, int i7, int i10, int i11, boolean z9) {
        int i12;
        int i13;
        if (i11 == 90 || i11 == 270) {
            i12 = i7;
            i13 = i10;
        } else {
            i13 = i7;
            i12 = i10;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        c7Var.c(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i14 = options.outWidth;
        int i15 = options.outHeight;
        boolean z10 = ((double) ((((long) (i13 * i12)) * 4) + (((long) (i14 * i15)) * 4))) * 1.1d <= ((double) maxMemory);
        if (i14 <= i13 && i15 <= i12) {
            return c7Var.c(options);
        }
        if (z9 && z10 && iz.o() >= 1) {
            Bitmap c10 = c7Var.c(options);
            float max = Math.max(i13 / c10.getWidth(), i12 / c10.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (c10.getWidth() * max), (int) (c10.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.y(c10, createBitmap);
            Utilities.j(Math.round(1.0f / max), 8, 0);
            return createBitmap;
        }
        options.inScaled = true;
        int i16 = options.outWidth;
        float f10 = i13 / i16;
        int i17 = options.outHeight;
        if (f10 > i12 / i17) {
            options.inDensity = i16;
            options.inTargetDensity = i13;
        } else {
            options.inDensity = i17;
            options.inTargetDensity = i12;
        }
        return c7Var.c(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j3;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (ij.L2(document, true)) {
                    RLottieNative a10 = RLottieNative.a(str, null, null, null, 0, null);
                    if (a10 != null) {
                        int i7 = a10.a[0];
                        a10.d();
                        j3 = i7;
                    } else {
                        j3 = 0;
                    }
                    if (j3 > 1) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [org.telegram.tgnet.TLRPC$PhotoSize, org.telegram.tgnet.TLRPC$TL_photoSize_layer127] */
    public static File w(int i7, String str) {
        TLRPC.TL_videoSize_layer127 tL_videoSize_layer127;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
        tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
        tL_fileLocationToBeDeprecated.dc_id = TLObject.FLAG_31;
        tL_fileLocationToBeDeprecated.local_id = iz.p();
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
        org.telegram.messenger.w7.G(i7);
        return org.telegram.messenger.w7.K(tL_videoSize_layer127, str, true, true);
    }

    public static File x(int i7, boolean z9) {
        return w(i7, z9 ? "mp4" : "jpg");
    }

    public static e7 y(ArrayList arrayList) {
        ij ijVar;
        int i7;
        e7 e7Var = new e7();
        e7Var.u = true;
        e7Var.v = arrayList;
        e7Var.i0 = 1080;
        e7Var.j0 = 1920;
        e7Var.z0 = p((ij) arrayList.get(0));
        h20 h20Var = new h20();
        h20Var.a = (byte) 6;
        h20Var.c = 0.5f;
        h20Var.d = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        e7Var.T0 = arrayList2;
        arrayList2.add(h20Var);
        if (arrayList.size() == 1 && (ijVar = (ij) arrayList.get(0)) != null && ((i7 = ijVar.D) == 8 || i7 == 3 || i7 == 5)) {
            TLRPC.Message message = ijVar.k;
            if (message != null && message.attachPath != null) {
                e7Var.L = new File(ijVar.k.attachPath);
            }
            File file = e7Var.L;
            if (file == null || !file.exists()) {
                org.telegram.messenger.w7.G(e7Var.a);
                e7Var.L = org.telegram.messenger.w7.N(ijVar.k, false, true);
            }
            File file2 = e7Var.L;
            if (file2 != null && file2.exists()) {
                e7Var.K = true;
                e7Var.M = false;
                long L0 = (long) (ijVar.L0() * 1000.0d);
                e7Var.h0 = L0;
                e7Var.Z = 0.0f;
                e7Var.a0 = Math.min(1.0f, 59500.0f / L0);
                return e7Var;
            }
            e7Var.L = null;
        }
        return e7Var;
    }

    public final void A() {
        Matrix matrix = this.n0;
        matrix.reset();
        int i7 = this.k0;
        int i10 = this.l0;
        int i11 = this.Q;
        int i12 = this.R;
        matrix.postScale(i12 == 1 ? -1.0f : 1.0f, i12 == 2 ? -1.0f : 1.0f, i7 / 2.0f, i10 / 2.0f);
        if (i11 != 0) {
            matrix.postTranslate((-i7) / 2.0f, (-i10) / 2.0f);
            matrix.postRotate(i11);
            if (i11 == 90 || i11 == 270) {
                i10 = i7;
                i7 = i10;
            }
            matrix.postTranslate(i7 / 2.0f, i10 / 2.0f);
        }
        float f10 = i7;
        float f11 = this.i0 / f10;
        if (this.J0 != 0) {
            f11 = Math.min(f11, this.j0 / i10);
        } else {
            float f12 = i10;
            if (f12 / f10 > 1.29f) {
                f11 = Math.max(f11, this.j0 / f12);
            }
        }
        matrix.postScale(f11, f11);
        matrix.postTranslate(com.google.android.recaptcha.internal.a.w(f10, f11, this.i0, 2.0f), com.google.android.recaptcha.internal.a.w(i10, f11, this.j0, 2.0f));
    }

    public final void B() {
        if (!this.K || v() || this.g || this.n || this.h0 <= 69000 || !p10.i(this.a).q()) {
            return;
        }
        long j3 = this.h0 - 59000;
        long min = j3 > 10000 ? Math.min(59000L, j3) + 59000 : 59000L;
        long j10 = this.h0 - min;
        if (j10 > 10000) {
            min += Math.min(59000L, j10);
        }
        this.a0 = Math.min(1.0f, min / this.h0);
    }

    public final boolean E() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ij ijVar;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.y == null && this.o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (ijVar = (ij) this.v.get(0)) == null || (message = ijVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    h20 h20Var = (h20) arrayList3.get(i7);
                    byte b10 = h20Var.a;
                    if (b10 != 0) {
                        if (b10 == 1 && (arrayList2 = h20Var.k) != null && !arrayList2.isEmpty()) {
                            for (int i10 = 0; i10 < h20Var.k.size(); i10++) {
                                g20 g20Var = (g20) h20Var.k.get(i10);
                                if (!u(g20Var.document, g20Var.a)) {
                                }
                            }
                        }
                    } else if (!u(h20Var.B, h20Var.j)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0261 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0291 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap b(float f10, Bitmap bitmap) {
        int i7;
        final int i10;
        Bitmap bitmap2;
        float f11;
        Paint paint;
        boolean z9;
        Paint paint2;
        Bitmap bitmap3;
        int i11;
        boolean z10;
        Matrix matrix = new Matrix();
        Paint paint3 = new Paint(7);
        int i12 = (int) (this.i0 * f10);
        int i13 = (int) (this.j0 * f10);
        Bitmap createBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        final int i14 = 0;
        if (this.Y0 != null) {
            try {
                Bitmap q10 = q(new c7() { // from class: fi.a7
                    @Override // fi.c7
                    public final Bitmap c(BitmapFactory.Options options) {
                        switch (i14) {
                            case 0:
                                return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                            case 1:
                                return BitmapFactory.decodeFile(this.P0.getPath(), options);
                            case 2:
                                return BitmapFactory.decodeFile(this.W0.getPath(), options);
                            default:
                                return BitmapFactory.decodeFile(this.R0.getPath(), options);
                        }
                    }
                }, i12, i13, 0, true);
                canvas.save();
                float width = this.i0 / q10.getWidth();
                canvas.scale(width, width);
                matrix.postScale(f10, f10);
                canvas.drawBitmap(q10, 0.0f, 0.0f, paint3);
                canvas.restore();
                q10.recycle();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } else {
            long j3 = this.z0;
            if (j3 == Long.MIN_VALUE) {
                Paint paint4 = new Paint(1);
                paint4.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, canvas.getHeight(), new int[]{this.A0, this.B0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                i7 = 2;
                i10 = 0;
                canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint4);
                matrix.set(this.n0);
                if (bitmap == null) {
                    float width2 = this.k0 / bitmap.getWidth();
                    matrix.preScale(width2, width2);
                    matrix.postScale(f10, f10);
                    canvas.drawBitmap(bitmap, matrix, paint3);
                    return createBitmap;
                }
                if (v()) {
                    int i15 = i10;
                    while (i15 < this.T.size()) {
                        e7 e7Var = (e7) this.T.get(i15);
                        final File file = e7Var.Z0;
                        if (file == null) {
                            file = e7Var.L;
                        }
                        if (file != null) {
                            try {
                                boolean z11 = true;
                                try {
                                    Bitmap q11 = q(new c7() { // from class: fi.b7
                                        @Override // fi.c7
                                        public final Bitmap c(BitmapFactory.Options options) {
                                            switch (i10) {
                                            }
                                            return BitmapFactory.decodeFile(file.getPath(), options);
                                        }
                                    }, i12, i13, i10, true);
                                    canvas.save();
                                    RectF rectF = new RectF();
                                    int width3 = q11.getWidth();
                                    int height = q11.getHeight();
                                    if ((((Integer) org.telegram.messenger.g0.L0(file).first).intValue() / 90) % 2 == 1) {
                                        try {
                                            width3 = q11.getHeight();
                                            height = q11.getWidth();
                                        } catch (Exception e11) {
                                            e = e11;
                                            paint2 = paint3;
                                            bitmap3 = createBitmap;
                                            i11 = i15;
                                            org.telegram.messenger.a8.g(e, z11);
                                            i15 = i11 + 1;
                                            createBitmap = bitmap3;
                                            paint3 = paint2;
                                            i10 = 0;
                                        }
                                    }
                                    s sVar = (s) this.S.e.get(i15);
                                    z10 = true;
                                    float f12 = i12;
                                    bitmap3 = createBitmap;
                                    float f13 = i13;
                                    try {
                                        i11 = i15;
                                        try {
                                            paint2 = paint3;
                                            try {
                                                rectF.set(sVar.a(f12), sVar.c * (f13 / sVar.a.c), sVar.b(f12), (f13 / sVar.a.c) * (sVar.c + 1));
                                            } catch (Exception e12) {
                                                e = e12;
                                            }
                                        } catch (Exception e13) {
                                            e = e13;
                                            paint2 = paint3;
                                        }
                                        try {
                                            canvas.translate(rectF.centerX(), rectF.centerY());
                                            canvas.clipRect((-rectF.width()) / 2.0f, (-rectF.height()) / 2.0f, rectF.width() / 2.0f, rectF.height() / 2.0f);
                                            float max = Math.max(rectF.width() / width3, rectF.height() / height);
                                            canvas.scale(max, max);
                                            canvas.rotate(((Integer) r3.first).intValue());
                                            canvas.translate((-q11.getWidth()) / 2.0f, (-q11.getHeight()) / 2.0f);
                                            try {
                                                canvas.drawBitmap(q11, 0.0f, 0.0f, (Paint) null);
                                                canvas.restore();
                                            } catch (Exception e14) {
                                                e = e14;
                                                z11 = z10;
                                                org.telegram.messenger.a8.g(e, z11);
                                                i15 = i11 + 1;
                                                createBitmap = bitmap3;
                                                paint3 = paint2;
                                                i10 = 0;
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            z11 = z10;
                                            org.telegram.messenger.a8.g(e, z11);
                                            i15 = i11 + 1;
                                            createBitmap = bitmap3;
                                            paint3 = paint2;
                                            i10 = 0;
                                        }
                                    } catch (Exception e16) {
                                        e = e16;
                                        paint2 = paint3;
                                        i11 = i15;
                                    }
                                } catch (Exception e17) {
                                    e = e17;
                                    paint2 = paint3;
                                    bitmap3 = createBitmap;
                                    i11 = i15;
                                }
                            } catch (Exception e18) {
                                e = e18;
                                paint2 = paint3;
                                bitmap3 = createBitmap;
                                i11 = i15;
                                z10 = true;
                            }
                        } else {
                            paint2 = paint3;
                            bitmap3 = createBitmap;
                            i11 = i15;
                        }
                        i15 = i11 + 1;
                        createBitmap = bitmap3;
                        paint3 = paint2;
                        i10 = 0;
                    }
                    bitmap2 = createBitmap;
                    f11 = 0.0f;
                    paint = paint3;
                } else {
                    bitmap2 = createBitmap;
                    f11 = 0.0f;
                    final File file2 = this.Z0;
                    if (file2 == null) {
                        file2 = this.L;
                    }
                    if (file2 != null) {
                        try {
                            final int i16 = 1;
                            Bitmap q12 = q(new c7() { // from class: fi.b7
                                @Override // fi.c7
                                public final Bitmap c(BitmapFactory.Options options) {
                                    switch (i16) {
                                    }
                                    return BitmapFactory.decodeFile(file2.getPath(), options);
                                }
                            }, i12, i13, this.Q, true);
                            float width4 = this.k0 / q12.getWidth();
                            matrix.preScale(width4, width4);
                            matrix.postScale(f10, f10);
                            paint = paint3;
                            try {
                                canvas.drawBitmap(q12, matrix, paint);
                                q12.recycle();
                            } catch (Exception e19) {
                                e = e19;
                                z9 = true;
                                org.telegram.messenger.a8.g(e, true);
                                if (this.P0 != null) {
                                }
                                if (this.W0 != null) {
                                }
                                if (this.R0 != null) {
                                }
                            }
                        } catch (Exception e20) {
                            e = e20;
                            paint = paint3;
                        }
                    } else {
                        paint = paint3;
                    }
                }
                z9 = true;
                if (this.P0 != null) {
                    try {
                        final int i17 = z9 ? 1 : 0;
                        Bitmap q13 = q(new c7() { // from class: fi.a7
                            @Override // fi.c7
                            public final Bitmap c(BitmapFactory.Options options) {
                                switch (i17) {
                                    case 0:
                                        return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                                    case 1:
                                        return BitmapFactory.decodeFile(this.P0.getPath(), options);
                                    case 2:
                                        return BitmapFactory.decodeFile(this.W0.getPath(), options);
                                    default:
                                        return BitmapFactory.decodeFile(this.R0.getPath(), options);
                                }
                            }
                        }, i12, i13, 0, z9);
                        canvas.save();
                        float width5 = this.i0 / q13.getWidth();
                        canvas.scale(width5, width5);
                        matrix.postScale(f10, f10);
                        canvas.drawBitmap(q13, f11, f11, paint);
                        canvas.restore();
                        q13.recycle();
                        z9 = true;
                    } catch (Exception e21) {
                        z9 = true;
                        org.telegram.messenger.a8.g(e21, true);
                    }
                }
                if (this.W0 != null) {
                    try {
                        final int i18 = i7;
                        Bitmap q14 = q(new c7() { // from class: fi.a7
                            @Override // fi.c7
                            public final Bitmap c(BitmapFactory.Options options) {
                                switch (i18) {
                                    case 0:
                                        return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                                    case 1:
                                        return BitmapFactory.decodeFile(this.P0.getPath(), options);
                                    case 2:
                                        return BitmapFactory.decodeFile(this.W0.getPath(), options);
                                    default:
                                        return BitmapFactory.decodeFile(this.R0.getPath(), options);
                                }
                            }
                        }, i12, i13, 0, z9);
                        canvas.save();
                        float width6 = this.i0 / q14.getWidth();
                        canvas.scale(width6, width6);
                        matrix.postScale(f10, f10);
                        canvas.drawBitmap(q14, f11, f11, paint);
                        canvas.restore();
                        q14.recycle();
                        z9 = true;
                    } catch (Exception e22) {
                        z9 = true;
                        org.telegram.messenger.a8.g(e22, true);
                    }
                }
                if (this.R0 != null) {
                    return bitmap2;
                }
                try {
                    final int i19 = 3;
                    Bitmap q15 = q(new c7() { // from class: fi.a7
                        @Override // fi.c7
                        public final Bitmap c(BitmapFactory.Options options) {
                            switch (i19) {
                                case 0:
                                    return BitmapFactory.decodeFile(this.Y0.getPath(), options);
                                case 1:
                                    return BitmapFactory.decodeFile(this.P0.getPath(), options);
                                case 2:
                                    return BitmapFactory.decodeFile(this.W0.getPath(), options);
                                default:
                                    return BitmapFactory.decodeFile(this.R0.getPath(), options);
                            }
                        }
                    }, i12, i13, 0, z9);
                    canvas.save();
                    float width7 = this.i0 / q15.getWidth();
                    canvas.scale(width7, width7);
                    matrix.postScale(f10, f10);
                    canvas.drawBitmap(q15, f11, f11, paint);
                    canvas.restore();
                    q15.recycle();
                    return bitmap2;
                } catch (Exception e23) {
                    org.telegram.messenger.a8.g(e23, true);
                    return bitmap2;
                }
            }
            Drawable drawable = this.x0;
            if (drawable == null) {
                drawable = y5.e(null, this.a, j3, this.y0);
            }
            j(canvas, drawable, canvas.getWidth(), canvas.getHeight());
        }
        i7 = 2;
        i10 = 0;
        matrix.set(this.n0);
        if (bitmap == null) {
        }
    }

    public final void c(File file) {
        Bitmap b10 = b(1.0f, null);
        Bitmap bitmap = this.b1;
        if (bitmap != null) {
            bitmap.recycle();
            this.b1 = null;
        }
        this.b1 = Bitmap.createScaledBitmap(b10, 40, 22, true);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            b10.compress(Bitmap.CompressFormat.JPEG, 95, fileOutputStream);
            fileOutputStream.close();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        b10.recycle();
    }

    public final void e(TL_stories.StoryItem storyItem) {
        if (storyItem != null && storyItem.media != null) {
            TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = new TLRPC.TL_messages_getAttachedStickers();
            TLRPC.MessageMedia messageMedia = storyItem.media;
            TLRPC.Photo photo = messageMedia.photo;
            if (photo == null) {
                TLRPC.Document document = messageMedia.document;
                if (document != null && ij.W2(document)) {
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
                    this.e1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new bi.g2(this, storyItem, tL_messages_getAttachedStickers, new bi.j0(this, 10), 6));
                }
            } else if (photo.has_stickers) {
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
                this.e1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new bi.g2(this, storyItem, tL_messages_getAttachedStickers, new bi.j0(this, 10), 6));
            }
        }
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

    public final e7 g() {
        e7 e7Var = new e7();
        e7Var.b = this.b;
        e7Var.c = this.c;
        e7Var.d = this.d;
        e7Var.e = this.e;
        e7Var.f = this.f;
        e7Var.g = this.g;
        e7Var.h = this.h;
        e7Var.i = this.i;
        e7Var.j = this.j;
        e7Var.k = this.k;
        e7Var.l = this.l;
        e7Var.m = this.m;
        e7Var.w = this.w;
        e7Var.x = this.x;
        e7Var.y = this.y;
        e7Var.z = this.z;
        e7Var.A = this.A;
        e7Var.B = this.B;
        e7Var.C = this.C;
        e7Var.D = this.D;
        e7Var.E = this.E;
        e7Var.F = this.F;
        e7Var.G = this.G;
        e7Var.H = this.H;
        e7Var.I = this.I;
        e7Var.J = this.J;
        e7Var.K = this.K;
        e7Var.L = this.L;
        e7Var.M = this.M;
        boolean z9 = this.M;
        int i7 = this.a;
        if (z9) {
            File w10 = w(i7, k(this.L));
            e7Var.L = w10;
            org.telegram.messenger.g0.F(this.L, w10);
        }
        e7Var.N = this.N;
        e7Var.Y = this.Y;
        e7Var.Z = this.Z;
        e7Var.a0 = this.a0;
        e7Var.h0 = this.h0;
        e7Var.k0 = this.k0;
        e7Var.l0 = this.l0;
        e7Var.i0 = this.i0;
        e7Var.j0 = this.j0;
        e7Var.v0 = this.v0;
        e7Var.R = this.R;
        e7Var.n0.set(this.n0);
        e7Var.A0 = this.A0;
        e7Var.B0 = this.B0;
        e7Var.C0 = this.C0;
        e7Var.D0 = this.D0;
        e7Var.E0 = this.E0;
        ArrayList arrayList = e7Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        e7Var.G0 = this.G0;
        e7Var.H0 = this.H0;
        e7Var.I0 = this.I0;
        e7Var.M0 = this.M0;
        e7Var.N0 = this.N0;
        e7Var.w0 = this.w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w11 = w(i7, k(this.N0));
            e7Var.N0 = w11;
            org.telegram.messenger.g0.F(this.N0, w11);
        }
        e7Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w12 = w(i7, k(this.O0));
            e7Var.O0 = w12;
            org.telegram.messenger.g0.F(this.O0, w12);
        }
        e7Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w13 = w(i7, k(this.P0));
            e7Var.P0 = w13;
            org.telegram.messenger.g0.F(this.P0, w13);
        }
        e7Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w14 = w(i7, k(this.W0));
            e7Var.W0 = w14;
            org.telegram.messenger.g0.F(this.W0, w14);
        }
        e7Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w15 = w(i7, k(this.Y0));
            e7Var.Y0 = w15;
            org.telegram.messenger.g0.F(this.Y0, w15);
        }
        e7Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w16 = w(i7, k(this.Q0));
            e7Var.Q0 = w16;
            org.telegram.messenger.g0.F(this.Q0, w16);
        }
        e7Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w17 = w(i7, k(this.R0));
            e7Var.R0 = w17;
            org.telegram.messenger.g0.F(this.R0, w17);
        }
        e7Var.S0 = this.S0;
        e7Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i10 = 0; i10 < this.T0.size(); i10++) {
                e7Var.T0.add(((h20) this.T0.get(i10)).a());
            }
        }
        e7Var.U0 = this.U0;
        e7Var.V0 = this.V0;
        e7Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w18 = w(i7, k(this.Z0));
            e7Var.Z0 = w18;
            org.telegram.messenger.g0.F(this.Z0, w18);
        }
        e7Var.a1 = this.a1;
        e7Var.b1 = this.b1;
        e7Var.c1 = this.c1;
        e7Var.O = this.O;
        e7Var.n = this.n;
        e7Var.o = this.o;
        e7Var.o0 = this.o0;
        e7Var.s0 = this.s0;
        e7Var.t0 = this.t0;
        e7Var.q0 = this.q0;
        e7Var.p0 = this.p0;
        e7Var.r0 = this.r0;
        e7Var.u0 = this.u0;
        e7Var.b0 = this.b0;
        e7Var.J0 = this.J0;
        e7Var.K0 = this.K0;
        e7Var.L0 = this.L0;
        e7Var.e0 = this.e0;
        e7Var.T = this.T;
        e7Var.S = this.S;
        e7Var.U = this.U;
        e7Var.X = this.X;
        e7Var.P = this.P;
        return e7Var;
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

    public final void i(boolean z9) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z9) {
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
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    h20 h20Var = (h20) obj;
                    if (h20Var.a == 2 && !TextUtils.isEmpty(h20Var.t)) {
                        try {
                            new File(h20Var.t).delete();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        h20Var.t = "";
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
            for (int i10 = 0; i10 < this.T.size(); i10++) {
                ((e7) this.T.get(i10)).i(z9);
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
        long j3 = this.h0;
        if (j3 <= 0 || this.n) {
            return 1;
        }
        if (((long) ((this.a0 - this.Z) * j3)) < 68999) {
            return 1;
        }
        return (int) Math.ceil(r0 / 59000.0f);
    }

    public final void s(c20 c20Var) {
        int i7;
        if (!E()) {
            c20Var.a(null);
            return;
        }
        if (!this.K && ((i7 = this.i0) > 720 || this.j0 > 1280)) {
            float f10 = 720.0f / i7;
            this.n0.postScale(f10, f10, 0.0f, 0.0f);
            this.i0 = 720;
            this.j0 = 1280;
        }
        File file = this.L;
        String absolutePath = file == null ? null : file.getAbsolutePath();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, Math.max(1, v() ? this.T.size() : 0), 11);
        iArr[0] = new int[11];
        ai.d0 d0Var = new ai.d0(this, absolutePath, iArr, c20Var, 16);
        if (!v()) {
            if (this.L == null) {
                d0Var.run();
                return;
            } else {
                Utilities.e.c(new x1(absolutePath, iArr, d0Var));
                return;
            }
        }
        String[] strArr = new String[this.T.size()];
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            strArr[i10] = ((e7) this.T.get(i10)).L == null ? null : ((e7) this.T.get(i10)).L.getAbsolutePath();
            iArr[i10] = new int[11];
        }
        Utilities.e.c(new x1(strArr, iArr, d0Var, 4));
    }

    public final boolean t() {
        if (v()) {
            for (int i7 = 0; i7 < this.T.size(); i7++) {
                if (((e7) this.T.get(i7)).K) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean v() {
        return (this.S == null || this.T == null) ? false : true;
    }

    public final void z(Runnable runnable) {
        Bitmap bitmap;
        if (this.K && this.A0 == 0 && this.B0 == 0) {
            if (this.N == null) {
                Bitmap bitmap2 = this.O;
                if (bitmap2 != null) {
                    int[] b10 = a8.ba.b(bitmap2, true);
                    this.A0 = b10[0];
                    this.B0 = b10[1];
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
                    MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.b.getContentResolver(), parseInt, 1, options);
                    options.inSampleSize = d(options, qs.P3, qs.P3);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.b.getContentResolver(), parseInt, 1, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.N);
                    options.inSampleSize = d(options, qs.P3, qs.P3);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = BitmapFactory.decodeFile(this.N);
                }
            } catch (Exception unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                int[] b11 = a8.ba.b(bitmap, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                bitmap.recycle();
                runnable.run();
            }
        }
    }
}
