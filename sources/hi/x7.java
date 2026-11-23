package hi;

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
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.bz;
import org.telegram.messenger.ef;
import org.telegram.messenger.ff;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.messenger.we;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class x7 {
    public String A;
    public int A0;
    public String B;
    public int B0;
    public long C;
    public CharSequence C0;
    public long D;
    public float E;
    public i9 E0;
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
    public c0 S;
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
    public ff a1;
    public long b;
    public boolean b0;
    public Bitmap b1;
    public boolean c;
    public TLRPC.Document c0;
    public boolean c1;
    public long d;
    public bi.j d0;
    public w7 d1;
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
    public we m0;
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
    public final int a = i10.t0;
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
    public boolean y0 = org.telegram.ui.ActionBar.n6.I.q();
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
        if (i10 * i11 * 8 > maxMemory || Math.max(i10, i11) > 4200 || bz.o() <= 0) {
            options.inScaled = true;
            options.inDensity = options.outWidth;
            options.inTargetDensity = i7;
        }
    }

    public static Boolean D(fj fjVar) {
        TLRPC.Peer peer;
        if (fjVar != null) {
            int i7 = fjVar.K1;
            TLRPC.Message message = fjVar.k;
            if (message != null) {
                TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(-org.telegram.messenger.n5.o(message.peer_id)));
                if ((O0 == null || !O0.noforwards) && org.telegram.messenger.v3.V(O0)) {
                    return Boolean.FALSE;
                }
                TLRPC.MessageFwdHeader messageFwdHeader = fjVar.k.fwd_from;
                if (messageFwdHeader != null && (peer = messageFwdHeader.from_id) != null && (messageFwdHeader.flags & 4) != 0) {
                    long o4 = org.telegram.messenger.n5.o(peer);
                    TLRPC.Chat O02 = mp.u1(i7).O0(Long.valueOf(-o4));
                    if (o4 < 0 && ((O02 == null || !O02.noforwards) && org.telegram.messenger.v3.V(O02))) {
                        return Boolean.TRUE;
                    }
                }
                return null;
            }
        }
        return null;
    }

    public static x7 a(c0 c0Var, ArrayList arrayList) {
        x7 x7Var = new x7();
        x7Var.S = c0Var;
        x7Var.T = arrayList;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            x7 x7Var2 = (x7) obj;
            if (x7Var2.K) {
                x7Var.K = true;
                x7Var2.V = 0.0f;
                x7Var2.W = Math.min(1.0f, 59000.0f / x7Var2.h0);
            }
        }
        if (x7Var.K) {
            x7Var.k0 = 720;
            x7Var.l0 = 1280;
            x7Var.i0 = 720;
            x7Var.j0 = 1280;
        } else {
            x7Var.k0 = 1080;
            x7Var.l0 = 1920;
            x7Var.i0 = 1080;
            x7Var.j0 = 1920;
        }
        x7Var.A();
        return x7Var;
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

    public static x7 l(ef efVar) {
        int i7;
        x7 x7Var = new x7();
        x7Var.L = new File(efVar.I);
        x7Var.Q = efVar.J;
        x7Var.R = efVar.K;
        x7Var.K = !efVar.d() && efVar.b;
        x7Var.N = efVar.c;
        long j3 = efVar.E * 1000;
        x7Var.h0 = j3;
        x7Var.Z = 0.0f;
        x7Var.a0 = Math.min(1.0f, 59000.0f / j3);
        if (x7Var.K && x7Var.N == null) {
            x7Var.N = "vthumb://" + efVar.C;
        }
        x7Var.A0 = efVar.T;
        x7Var.B0 = efVar.U;
        x7Var.h(x7Var.L.getAbsolutePath());
        int i10 = efVar.F;
        if (i10 > 0 && (i7 = efVar.G) > 0) {
            x7Var.k0 = i10;
            x7Var.l0 = i7;
        }
        x7Var.A();
        return x7Var;
    }

    public static x7 m(File file, int i7) {
        x7 x7Var = new x7();
        x7Var.L = file;
        x7Var.M = true;
        x7Var.Q = i7;
        x7Var.R = 0;
        x7Var.K = false;
        if (file != null) {
            x7Var.h(file.getAbsolutePath());
        }
        x7Var.A();
        return x7Var;
    }

    public static x7 n(File file, TL_stories.StoryItem storyItem) {
        x7 x7Var = new x7();
        x7Var.g = true;
        x7Var.f = storyItem.id;
        x7Var.L = file;
        x7Var.M = false;
        x7Var.k0 = 720;
        x7Var.l0 = 1280;
        TLRPC.MessageMedia messageMedia = storyItem.media;
        boolean z10 = messageMedia instanceof TLRPC.TL_messageMediaPhoto;
        int i7 = x7Var.a;
        if (z10) {
            x7Var.K = false;
            if (file != null) {
                x7Var.h(file.getAbsolutePath());
            }
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            x7Var.K = true;
            TLRPC.Document document = messageMedia.document;
            if (document != null && document.attributes != null) {
                int i10 = 0;
                while (true) {
                    if (i10 >= storyItem.media.document.attributes.size()) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = storyItem.media.document.attributes.get(i10);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeVideo) {
                        x7Var.k0 = documentAttribute.w;
                        x7Var.l0 = documentAttribute.h;
                        x7Var.i = documentAttribute.duration;
                        break;
                    }
                    i10++;
                }
            }
            TLRPC.Document document2 = storyItem.media.document;
            if (document2 != null) {
                String str = storyItem.firstFramePath;
                if (str != null) {
                    x7Var.N = str;
                } else if (document2.thumbs != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= storyItem.media.document.thumbs.size()) {
                            break;
                        }
                        TLRPC.PhotoSize photoSize = storyItem.media.document.thumbs.get(i11);
                        if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                            x7Var.O = org.telegram.messenger.ec.F(null, photoSize.bytes);
                            break;
                        }
                        org.telegram.messenger.w7.G(i7);
                        File J = org.telegram.messenger.w7.J(photoSize, null, true, true);
                        if (J != null && J.exists()) {
                            x7Var.N = J.getAbsolutePath();
                            break;
                        }
                        i11++;
                    }
                }
            }
        }
        ArrayList arrayList = x7Var.F0;
        arrayList.clear();
        ArrayList<TLRPC.PrivacyRule> arrayList2 = storyItem.privacy;
        mp u12 = mp.u1(i7);
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
                        TLRPC.InputUser s12 = u12.s1(u12.c2(l10));
                        if (!(s12 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueDisallowUsers.users.add(s12);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueDisallowUsers);
                } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                    TLRPC.TL_privacyValueAllowUsers tL_privacyValueAllowUsers = (TLRPC.TL_privacyValueAllowUsers) privacyRule;
                    TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                    for (int i14 = 0; i14 < tL_privacyValueAllowUsers.users.size(); i14++) {
                        Long l11 = tL_privacyValueAllowUsers.users.get(i14);
                        l11.getClass();
                        TLRPC.InputUser s13 = u12.s1(u12.c2(l11));
                        if (!(s13 instanceof TLRPC.TL_inputUserEmpty)) {
                            tL_inputPrivacyValueAllowUsers.users.add(s13);
                        }
                    }
                    arrayList3.add(tL_inputPrivacyValueAllowUsers);
                }
            }
        }
        arrayList.addAll(arrayList3);
        x7Var.I0 = storyItem.expire_date - storyItem.date;
        try {
            CharSequence m10 = org.telegram.messenger.j6.m(new SpannableString(storyItem.caption), org.telegram.ui.ActionBar.n6.o2.getFontMetricsInt(), true, null, 0);
            fj.b(m10, storyItem.entities, true, false, true, false, 0);
            x7Var.C0 = fj.B5(m10, storyItem.entities, org.telegram.ui.ActionBar.n6.o2.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        x7Var.A();
        x7Var.e(storyItem);
        x7Var.m = storyItem.media_areas;
        x7Var.v0 = mp.u1(i7).l1(storyItem.dialogId);
        return x7Var;
    }

    public static x7 o(File file, String str, long j3) {
        x7 x7Var = new x7();
        x7Var.c1 = true;
        x7Var.L = file;
        x7Var.M = true;
        x7Var.Q = 0;
        x7Var.R = 0;
        x7Var.K = true;
        x7Var.h0 = j3;
        x7Var.N = str;
        x7Var.Z = 0.0f;
        x7Var.a0 = Math.min(1.0f, 59500.0f / j3);
        return x7Var;
    }

    public static long p(fj fjVar) {
        Boolean D = D(fjVar);
        if (D == null) {
            return 0L;
        }
        return D.booleanValue() ? org.telegram.messenger.n5.o(fjVar.k.fwd_from.from_id) : fj.B0(fjVar.k);
    }

    public static Bitmap q(v7 v7Var, int i7, int i10, int i11, boolean z10) {
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
        v7Var.b(options);
        options.inJustDecodeBounds = false;
        options.inScaled = false;
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory() - (runtime.totalMemory() - runtime.freeMemory());
        int i14 = options.outWidth;
        int i15 = options.outHeight;
        boolean z11 = ((double) ((((long) (i13 * i12)) * 4) + (((long) (i14 * i15)) * 4))) * 1.1d <= ((double) maxMemory);
        if (i14 <= i13 && i15 <= i12) {
            return v7Var.b(options);
        }
        if (z10 && z11 && bz.o() >= 1) {
            Bitmap b10 = v7Var.b(options);
            float max = Math.max(i13 / b10.getWidth(), i12 / b10.getHeight());
            Bitmap createBitmap = Bitmap.createBitmap((int) (b10.getWidth() * max), (int) (b10.getHeight() * max), Bitmap.Config.ARGB_8888);
            Utilities.y(b10, createBitmap);
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
        return v7Var.b(options);
    }

    public static boolean u(TLRPC.Document document, String str) {
        long j3;
        if (document != null) {
            if (!"video/webm".equals(document.mime_type) && !"video/mp4".equals(document.mime_type)) {
                if (fj.K2(document, true)) {
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
        tL_fileLocationToBeDeprecated.local_id = bz.p();
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
        return org.telegram.messenger.w7.J(tL_videoSize_layer127, str, true, true);
    }

    public static File x(int i7, boolean z10) {
        return w(i7, z10 ? "mp4" : "jpg");
    }

    public static x7 y(ArrayList arrayList) {
        fj fjVar;
        int i7;
        x7 x7Var = new x7();
        x7Var.u = true;
        x7Var.v = arrayList;
        x7Var.i0 = 1080;
        x7Var.j0 = 1920;
        x7Var.z0 = p((fj) arrayList.get(0));
        b20 b20Var = new b20();
        b20Var.a = (byte) 6;
        b20Var.c = 0.5f;
        b20Var.d = 0.5f;
        ArrayList arrayList2 = new ArrayList();
        x7Var.T0 = arrayList2;
        arrayList2.add(b20Var);
        if (arrayList.size() == 1 && (fjVar = (fj) arrayList.get(0)) != null && ((i7 = fjVar.D) == 8 || i7 == 3 || i7 == 5)) {
            TLRPC.Message message = fjVar.k;
            if (message != null && message.attachPath != null) {
                x7Var.L = new File(fjVar.k.attachPath);
            }
            File file = x7Var.L;
            if (file == null || !file.exists()) {
                org.telegram.messenger.w7.G(x7Var.a);
                x7Var.L = org.telegram.messenger.w7.M(fjVar.k, false, true);
            }
            File file2 = x7Var.L;
            if (file2 != null && file2.exists()) {
                x7Var.K = true;
                x7Var.M = false;
                long L0 = (long) (fjVar.L0() * 1000.0d);
                x7Var.h0 = L0;
                x7Var.Z = 0.0f;
                x7Var.a0 = Math.min(1.0f, 59500.0f / L0);
                return x7Var;
            }
            x7Var.L = null;
        }
        return x7Var;
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
        matrix.postTranslate(com.google.android.gms.internal.vision.e2.w(f10, f11, this.i0, 2.0f), com.google.android.gms.internal.vision.e2.w(i10, f11, this.j0, 2.0f));
    }

    public final void B() {
        if (!this.K || v() || this.g || this.n || this.h0 <= 69000 || !i10.i(this.a).q()) {
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
        fj fjVar;
        TLRPC.Message message;
        ArrayList arrayList3 = this.T0;
        if (!this.K && this.y == null && this.o0 == null && ((arrayList = this.v) == null || arrayList.size() != 1 || (fjVar = (fj) this.v.get(0)) == null || (message = fjVar.k) == null || !(message.action instanceof TLRPC.TL_messageActionStarGiftUnique))) {
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                for (int i7 = 0; i7 < arrayList3.size(); i7++) {
                    b20 b20Var = (b20) arrayList3.get(i7);
                    byte b10 = b20Var.a;
                    if (b10 != 0) {
                        if (b10 == 1 && (arrayList2 = b20Var.k) != null && !arrayList2.isEmpty()) {
                            for (int i10 = 0; i10 < b20Var.k.size(); i10++) {
                                a20 a20Var = (a20) b20Var.k.get(i10);
                                if (!u(a20Var.document, a20Var.a)) {
                                }
                            }
                        }
                    } else if (!u(b20Var.B, b20Var.j)) {
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
        boolean z10;
        Paint paint2;
        Bitmap bitmap3;
        int i11;
        boolean z11;
        Matrix matrix = new Matrix();
        Paint paint3 = new Paint(7);
        int i12 = (int) (this.i0 * f10);
        int i13 = (int) (this.j0 * f10);
        Bitmap createBitmap = Bitmap.createBitmap(i12, i13, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        final int i14 = 0;
        if (this.Y0 != null) {
            try {
                Bitmap q10 = q(new v7() { // from class: hi.t7
                    @Override // hi.v7
                    public final Bitmap b(BitmapFactory.Options options) {
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
                        x7 x7Var = (x7) this.T.get(i15);
                        final File file = x7Var.Z0;
                        if (file == null) {
                            file = x7Var.L;
                        }
                        if (file != null) {
                            try {
                                boolean z12 = true;
                                try {
                                    Bitmap q11 = q(new v7() { // from class: hi.u7
                                        @Override // hi.v7
                                        public final Bitmap b(BitmapFactory.Options options) {
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
                                            org.telegram.messenger.a8.g(e, z12);
                                            i15 = i11 + 1;
                                            createBitmap = bitmap3;
                                            paint3 = paint2;
                                            i10 = 0;
                                        }
                                    }
                                    b0 b0Var = (b0) this.S.e.get(i15);
                                    z11 = true;
                                    float f12 = i12;
                                    bitmap3 = createBitmap;
                                    float f13 = i13;
                                    try {
                                        i11 = i15;
                                        try {
                                            paint2 = paint3;
                                            try {
                                                rectF.set(b0Var.a(f12), b0Var.c * (f13 / b0Var.a.c), b0Var.b(f12), (f13 / b0Var.a.c) * (b0Var.c + 1));
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
                                                z12 = z11;
                                                org.telegram.messenger.a8.g(e, z12);
                                                i15 = i11 + 1;
                                                createBitmap = bitmap3;
                                                paint3 = paint2;
                                                i10 = 0;
                                            }
                                        } catch (Exception e15) {
                                            e = e15;
                                            z12 = z11;
                                            org.telegram.messenger.a8.g(e, z12);
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
                                z11 = true;
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
                            Bitmap q12 = q(new v7() { // from class: hi.u7
                                @Override // hi.v7
                                public final Bitmap b(BitmapFactory.Options options) {
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
                                z10 = true;
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
                z10 = true;
                if (this.P0 != null) {
                    try {
                        final int i17 = z10 ? 1 : 0;
                        Bitmap q13 = q(new v7() { // from class: hi.t7
                            @Override // hi.v7
                            public final Bitmap b(BitmapFactory.Options options) {
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
                        }, i12, i13, 0, z10);
                        canvas.save();
                        float width5 = this.i0 / q13.getWidth();
                        canvas.scale(width5, width5);
                        matrix.postScale(f10, f10);
                        canvas.drawBitmap(q13, f11, f11, paint);
                        canvas.restore();
                        q13.recycle();
                        z10 = true;
                    } catch (Exception e21) {
                        z10 = true;
                        org.telegram.messenger.a8.g(e21, true);
                    }
                }
                if (this.W0 != null) {
                    try {
                        final int i18 = i7;
                        Bitmap q14 = q(new v7() { // from class: hi.t7
                            @Override // hi.v7
                            public final Bitmap b(BitmapFactory.Options options) {
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
                        }, i12, i13, 0, z10);
                        canvas.save();
                        float width6 = this.i0 / q14.getWidth();
                        canvas.scale(width6, width6);
                        matrix.postScale(f10, f10);
                        canvas.drawBitmap(q14, f11, f11, paint);
                        canvas.restore();
                        q14.recycle();
                        z10 = true;
                    } catch (Exception e22) {
                        z10 = true;
                        org.telegram.messenger.a8.g(e22, true);
                    }
                }
                if (this.R0 != null) {
                    return bitmap2;
                }
                try {
                    final int i19 = 3;
                    Bitmap q15 = q(new v7() { // from class: hi.t7
                        @Override // hi.v7
                        public final Bitmap b(BitmapFactory.Options options) {
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
                    }, i12, i13, 0, z10);
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
                drawable = f6.e(null, this.a, j3, this.y0);
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
                if (document != null && fj.V2(document)) {
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
                    this.e1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new bi.m2(this, storyItem, tL_messages_getAttachedStickers, new ai.b1(this, 11), 7));
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
                this.e1 = ConnectionsManager.getInstance(this.a).sendRequest(tL_messages_getAttachedStickers, new bi.m2(this, storyItem, tL_messages_getAttachedStickers, new ai.b1(this, 11), 7));
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

    public final x7 g() {
        x7 x7Var = new x7();
        x7Var.b = this.b;
        x7Var.c = this.c;
        x7Var.d = this.d;
        x7Var.e = this.e;
        x7Var.f = this.f;
        x7Var.g = this.g;
        x7Var.h = this.h;
        x7Var.i = this.i;
        x7Var.j = this.j;
        x7Var.k = this.k;
        x7Var.l = this.l;
        x7Var.m = this.m;
        x7Var.w = this.w;
        x7Var.x = this.x;
        x7Var.y = this.y;
        x7Var.z = this.z;
        x7Var.A = this.A;
        x7Var.B = this.B;
        x7Var.C = this.C;
        x7Var.D = this.D;
        x7Var.E = this.E;
        x7Var.F = this.F;
        x7Var.G = this.G;
        x7Var.H = this.H;
        x7Var.I = this.I;
        x7Var.J = this.J;
        x7Var.K = this.K;
        x7Var.L = this.L;
        x7Var.M = this.M;
        boolean z10 = this.M;
        int i7 = this.a;
        if (z10) {
            File w10 = w(i7, k(this.L));
            x7Var.L = w10;
            org.telegram.messenger.g0.F(this.L, w10);
        }
        x7Var.N = this.N;
        x7Var.Y = this.Y;
        x7Var.Z = this.Z;
        x7Var.a0 = this.a0;
        x7Var.h0 = this.h0;
        x7Var.k0 = this.k0;
        x7Var.l0 = this.l0;
        x7Var.i0 = this.i0;
        x7Var.j0 = this.j0;
        x7Var.v0 = this.v0;
        x7Var.R = this.R;
        x7Var.n0.set(this.n0);
        x7Var.A0 = this.A0;
        x7Var.B0 = this.B0;
        x7Var.C0 = this.C0;
        x7Var.D0 = this.D0;
        x7Var.E0 = this.E0;
        ArrayList arrayList = x7Var.F0;
        arrayList.clear();
        arrayList.addAll(this.F0);
        x7Var.G0 = this.G0;
        x7Var.H0 = this.H0;
        x7Var.I0 = this.I0;
        x7Var.M0 = this.M0;
        x7Var.N0 = this.N0;
        x7Var.w0 = this.w0;
        File file = this.N0;
        if (file != null && file.exists()) {
            File w11 = w(i7, k(this.N0));
            x7Var.N0 = w11;
            org.telegram.messenger.g0.F(this.N0, w11);
        }
        x7Var.O0 = this.O0;
        File file2 = this.O0;
        if (file2 != null && file2.exists()) {
            File w12 = w(i7, k(this.O0));
            x7Var.O0 = w12;
            org.telegram.messenger.g0.F(this.O0, w12);
        }
        x7Var.P0 = this.P0;
        File file3 = this.P0;
        if (file3 != null && file3.exists()) {
            File w13 = w(i7, k(this.P0));
            x7Var.P0 = w13;
            org.telegram.messenger.g0.F(this.P0, w13);
        }
        x7Var.W0 = this.W0;
        File file4 = this.W0;
        if (file4 != null && file4.exists()) {
            File w14 = w(i7, k(this.W0));
            x7Var.W0 = w14;
            org.telegram.messenger.g0.F(this.W0, w14);
        }
        x7Var.Y0 = this.Y0;
        File file5 = this.Y0;
        if (file5 != null && file5.exists()) {
            File w15 = w(i7, k(this.Y0));
            x7Var.Y0 = w15;
            org.telegram.messenger.g0.F(this.Y0, w15);
        }
        x7Var.Q0 = this.Q0;
        File file6 = this.Q0;
        if (file6 != null && file6.exists()) {
            File w16 = w(i7, k(this.Q0));
            x7Var.Q0 = w16;
            org.telegram.messenger.g0.F(this.Q0, w16);
        }
        x7Var.R0 = this.R0;
        File file7 = this.R0;
        if (file7 != null && file7.exists()) {
            File w17 = w(i7, k(this.R0));
            x7Var.R0 = w17;
            org.telegram.messenger.g0.F(this.R0, w17);
        }
        x7Var.S0 = this.S0;
        x7Var.T0 = new ArrayList();
        if (this.T0 != null) {
            for (int i10 = 0; i10 < this.T0.size(); i10++) {
                x7Var.T0.add(((b20) this.T0.get(i10)).a());
            }
        }
        x7Var.U0 = this.U0;
        x7Var.V0 = this.V0;
        x7Var.Z0 = this.Z0;
        File file8 = this.Z0;
        if (file8 != null && file8.exists()) {
            File w18 = w(i7, k(this.Z0));
            x7Var.Z0 = w18;
            org.telegram.messenger.g0.F(this.Z0, w18);
        }
        x7Var.a1 = this.a1;
        x7Var.b1 = this.b1;
        x7Var.c1 = this.c1;
        x7Var.O = this.O;
        x7Var.n = this.n;
        x7Var.o = this.o;
        x7Var.o0 = this.o0;
        x7Var.s0 = this.s0;
        x7Var.t0 = this.t0;
        x7Var.q0 = this.q0;
        x7Var.p0 = this.p0;
        x7Var.r0 = this.r0;
        x7Var.u0 = this.u0;
        x7Var.b0 = this.b0;
        x7Var.J0 = this.J0;
        x7Var.K0 = this.K0;
        x7Var.L0 = this.L0;
        x7Var.e0 = this.e0;
        x7Var.T = this.T;
        x7Var.S = this.S;
        x7Var.U = this.U;
        x7Var.X = this.X;
        x7Var.P = this.P;
        return x7Var;
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

    public final void i(boolean z10) {
        if (this.M0 != null) {
            this.M0 = null;
        }
        File file = this.N0;
        if (file != null) {
            file.delete();
            this.N0 = null;
        }
        if (!z10) {
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
                    b20 b20Var = (b20) obj;
                    if (b20Var.a == 2 && !TextUtils.isEmpty(b20Var.t)) {
                        try {
                            new File(b20Var.t).delete();
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        b20Var.t = "";
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
                ((x7) this.T.get(i10)).i(z10);
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

    public final void s(w10 w10Var) {
        int i7;
        if (!E()) {
            w10Var.a(null);
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
        ai.j jVar = new ai.j(this, absolutePath, iArr, w10Var, 21);
        if (!v()) {
            if (this.L == null) {
                jVar.run();
                return;
            } else {
                Utilities.e.c(new di.a8(absolutePath, iArr, jVar, 18));
                return;
            }
        }
        String[] strArr = new String[this.T.size()];
        for (int i10 = 0; i10 < this.T.size(); i10++) {
            strArr[i10] = ((x7) this.T.get(i10)).L == null ? null : ((x7) this.T.get(i10)).L.getAbsolutePath();
            iArr[i10] = new int[11];
        }
        Utilities.e.c(new di.a8(strArr, iArr, jVar, 17));
    }

    public final boolean t() {
        if (v()) {
            for (int i7 = 0; i7 < this.T.size(); i7++) {
                if (((x7) this.T.get(i7)).K) {
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
                    int[] b10 = c8.k0.b(bitmap2, true);
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
                    options.inSampleSize = d(options, ks.P3, ks.P3);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = MediaStore.Video.Thumbnails.getThumbnail(org.telegram.messenger.t0.b.getContentResolver(), parseInt, 1, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(this.N);
                    options.inSampleSize = d(options, ks.P3, ks.P3);
                    options.inJustDecodeBounds = false;
                    options.inPreferredConfig = Bitmap.Config.RGB_565;
                    options.inDither = true;
                    bitmap = BitmapFactory.decodeFile(this.N);
                }
            } catch (Exception unused) {
                bitmap = null;
            }
            if (bitmap != null) {
                int[] b11 = c8.k0.b(bitmap, true);
                this.A0 = b11[0];
                this.B0 = b11[1];
                bitmap.recycle();
                runnable.run();
            }
        }
    }
}
