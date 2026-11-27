// default package

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ImageDecoder;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.content.FileProvider;
import androidx.core.graphics.drawable.IconCompat;
import j$.util.Comparator$-CC;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AutoMessageHeardReceiver;
import org.telegram.messenger.CopyCodeReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCallbackReceiver;
import org.telegram.messenger.NotificationDismissReceiver;
import org.telegram.messenger.NotificationImageProvider;
import org.telegram.messenger.NotificationRepeat;
import org.telegram.messenger.OpenChatReceiver;
import org.telegram.messenger.PopupReplyReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WearReplyReceiver;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ip7 extends rf0 implements fn7 {
    public static String k0;
    public static oo7 m0;
    public static NotificationManager n0;
    public static AudioManager p0;
    public static volatile ip7[] q0;
    public static final Object[] r0;
    public static final zh6 s0;
    public final ArrayList E;
    public final zh6 F;
    public long G;
    public long H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public long P;
    public Boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final vo7 V;
    public final PowerManager.WakeLock W;
    public long X;
    public SoundPool Y;
    public int Z;
    public final ArrayList a;
    public int a0;
    public final ArrayList b;
    public boolean b0;
    public final zh6 c;
    public boolean c0;
    public final zh6 d;
    public final AlarmManager d0;
    public final zh6 e;
    public final int e0;
    public final zh6 f;
    public final String f0;
    public final npa g0;
    public final zh6 h;
    public final wp7 h0;
    public final char[] i0;
    public final vo7 j0;
    public final zh6 n;
    public final zh6 r;
    public final HashSet s;
    public final ArrayList w;
    public ArrayList x;
    public final HashSet y;
    public static final to3 l0 = new to3("notificationsQueue");
    public static final long o0 = wf3.E(1);

    static {
        m0 = null;
        n0 = null;
        if (Build.VERSION.SDK_INT >= 26 && a.b != null) {
            m0 = new oo7(a.b);
            n0 = (NotificationManager) a.b.getSystemService("notification");
            c();
        }
        p0 = (AudioManager) a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        q0 = new ip7[4];
        r0 = new Object[4];
        for (int i = 0; i < 4; i++) {
            r0[i] = new Object();
        }
        s0 = new zh6();
    }

    public ip7(int i) {
        super(i);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new zh6();
        this.d = new zh6();
        this.e = new zh6();
        this.f = new zh6();
        this.h = new zh6();
        this.n = new zh6();
        this.r = new zh6();
        this.s = new HashSet();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new HashSet();
        this.E = new ArrayList();
        this.F = new zh6();
        this.G = 0L;
        this.H = 0L;
        this.I = 5000;
        this.J = 0;
        this.K = 0;
        this.L = false;
        this.M = 0;
        this.O = -1;
        this.g0 = new npa();
        this.i0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.j0 = new vo7(this, (byte) 11);
        this.e0 = this.currentAccount + 1;
        StringBuilder sb = new StringBuilder("messages");
        int i2 = this.currentAccount;
        sb.append(i2 == 0 ? "" : Integer.valueOf(i2));
        this.f0 = sb.toString();
        SharedPreferences d = getAccountInstance().d();
        this.N = d.getBoolean("EnableInChatSound", true);
        this.S = d.getBoolean("badgeNumber", true);
        this.T = d.getBoolean("badgeNumberMuted", false);
        this.U = d.getBoolean("badgeNumberMessages", true);
        m0 = new oo7(a.b);
        n0 = (NotificationManager) a.b.getSystemService("notification");
        try {
            p0 = (AudioManager) a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        } catch (Exception e) {
            cc4.g(e, true);
        }
        try {
            this.d0 = (AlarmManager) a.b.getSystemService("alarm");
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) a.b.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.W = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e3) {
            cc4.g(e3, true);
        }
        this.V = new vo7(this, (byte) 12);
        this.h0 = new wp7(this.currentAccount);
        hl.c3(new vo7(this, (byte) 13));
    }

    public static Bitmap F(ArrayList arrayList) {
        int i;
        Bitmap bitmap;
        Paint paint;
        boolean z;
        float f;
        float size;
        float size2;
        float f2;
        float f3;
        float f4;
        float f5;
        Object obj;
        ArrayList arrayList2 = arrayList;
        if (Build.VERSION.SDK_INT < 28 || arrayList2.size() == 0) {
            return null;
        }
        int L = hl.L(64.0f);
        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint2 = new Paint(3);
        boolean z2 = true;
        Paint paint3 = new Paint(1);
        Rect rect = new Rect();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        float f6 = arrayList2.size() == 1 ? 1.0f : arrayList2.size() == 2 ? 0.65f : 0.5f;
        int i2 = 0;
        TextPaint textPaint = null;
        while (i2 < arrayList2.size()) {
            float f7 = L;
            float f8 = (1.0f - f6) * f7;
            try {
                size = (f8 / arrayList2.size()) * ((arrayList2.size() - 1) - i2);
                size2 = i2 * (f8 / arrayList2.size());
                f2 = f7 * f6;
                f3 = f2 / 2.0f;
                i = L;
                f4 = size + f3;
                bitmap = createBitmap;
                f5 = size2 + f3;
                f = f6;
                try {
                    canvas.drawCircle(f4, f5, hl.L(2.0f) + f3, paint3);
                    obj = arrayList2.get(i2);
                    paint = paint3;
                } catch (Throwable unused) {
                    paint = paint3;
                }
            } catch (Throwable unused2) {
                i = L;
                bitmap = createBitmap;
                paint = paint3;
                z = z2;
                f = f6;
            }
            if (obj instanceof File) {
                String absolutePath = ((File) arrayList2.get(i2)).getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                z = true;
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(absolutePath, options);
                    int i3 = (int) f2;
                    options.inSampleSize = c8b.d(options, i3, i3);
                    options.inJustDecodeBounds = false;
                    options.inDither = true;
                    Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                    matrix.reset();
                    matrix.postScale(f2 / decodeFile.getWidth(), f2 / decodeFile.getHeight());
                    matrix.postTranslate(size, size2);
                    bitmapShader.setLocalMatrix(matrix);
                    paint2.setShader(bitmapShader);
                    canvas.drawCircle(f4, f5, f3, paint2);
                    decodeFile.recycle();
                    z = true;
                } catch (Throwable unused3) {
                }
                i2++;
                z2 = z;
                L = i;
                createBitmap = bitmap;
                f6 = f;
                paint3 = paint;
                arrayList2 = arrayList;
            } else {
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f2, new int[]{aob.w0(null, aob.p8[rb0.d(user.id)], false), aob.w0(null, aob.q8[rb0.d(user.id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawCircle(f4, f5, f3, paint2);
                    if (textPaint == null) {
                        z = true;
                        TextPaint textPaint2 = new TextPaint(1);
                        try {
                            textPaint2.setTypeface(hl.o());
                            textPaint2.setTextSize(f7 * 0.25f);
                            textPaint2.setColor(-1);
                            textPaint = textPaint2;
                        } catch (Throwable unused4) {
                            textPaint = textPaint2;
                        }
                    } else {
                        z = true;
                    }
                    StringBuilder sb = new StringBuilder();
                    rb0.a(user.first_name, user.last_name, null, sb);
                    String sb2 = sb.toString();
                    textPaint.getTextBounds(sb2, 0, sb2.length(), rect);
                    canvas.drawText(sb2, (f4 - (rect.width() / 2.0f)) - rect.left, (f5 - (rect.height() / 2.0f)) - rect.top, textPaint);
                    i2++;
                    z2 = z;
                    L = i;
                    createBitmap = bitmap;
                    f6 = f;
                    paint3 = paint;
                    arrayList2 = arrayList;
                }
                z = true;
                i2++;
                z2 = z;
                L = i;
                createBitmap = bitmap;
                f6 = f;
                paint3 = paint;
                arrayList2 = arrayList;
            }
        }
        return createBitmap;
    }

    public static void W(Notification notification, wn7 wn7Var, boolean z) {
        if (z) {
            wn7Var.y = k0;
        } else {
            wn7Var.y = notification.getChannelId();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0 == 2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(ArrayList arrayList, r47 r47Var, long j, boolean z, SharedPreferences sharedPreferences) {
        int i;
        if (r47Var.J) {
            return 0;
        }
        if (!wf3.B(j)) {
            if (qu6.v("custom_", j, sharedPreferences, false)) {
                i = sharedPreferences.getInt("popup_" + j, 0);
            } else {
                i = 0;
            }
            if (i == 0) {
                if (z) {
                    i = sharedPreferences.getInt("popupChannel", 0);
                } else {
                    i = sharedPreferences.getInt(wf3.y(j) ? "popupGroup" : "popupAll", 0);
                }
            } else if (i == 1) {
                i = 3;
            }
            if (i != 0 && r47Var.k.peer_id.channel_id != 0 && !r47Var.z4()) {
                i = 0;
            }
            if (i != 0) {
                arrayList.add(0, r47Var);
            }
            return i;
        }
        i = 0;
        if (i != 0) {
            i = 0;
        }
        if (i != 0) {
        }
        return i;
    }

    public static void c() {
        String str;
        SharedPreferences sharedPreferences;
        if (Build.VERSION.SDK_INT >= 26) {
            String str2 = k0;
            if (str2 == null) {
                sharedPreferences = a.b.getSharedPreferences("Notifications", 0);
                str = sharedPreferences.getString("OtherKey", "Other3");
                k0 = str;
            } else {
                str = str2;
                sharedPreferences = null;
            }
            NotificationChannel notificationChannel = n0.getNotificationChannel(str);
            if (notificationChannel != null && notificationChannel.getImportance() == 0) {
                try {
                    n0.deleteNotificationChannel(k0);
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                k0 = null;
                notificationChannel = null;
            }
            if (k0 == null) {
                if (sharedPreferences == null) {
                    sharedPreferences = a.b.getSharedPreferences("Notifications", 0);
                }
                k0 = "Other" + Utilities.b.nextLong();
                sharedPreferences.edit().putString("OtherKey", k0).commit();
            }
            String M0 = ob6.M0(2131748943, null);
            if (notificationChannel != null && !TextUtils.equals(notificationChannel.getName(), M0)) {
                notificationChannel.setName(M0);
                try {
                    n0.createNotificationChannel(notificationChannel);
                } catch (Exception e2) {
                    cc4.g(e2, true);
                }
            }
            if (notificationChannel == null) {
                gk.g();
                NotificationChannel notificationChannel2 = new NotificationChannel(k0, M0, 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setSound(null, null);
                try {
                    n0.createNotificationChannel(notificationChannel2);
                } catch (Exception e3) {
                    cc4.g(e3, true);
                }
            }
        }
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf >= 0) {
            return str.substring(0, indexOf).concat(str.endsWith("…") ? "…" : "");
        }
        return str;
    }

    public static String k(int i) {
        return i == 0 ? "EnableGroup2" : i == 1 ? "EnableAll2" : "EnableChannel2";
    }

    public static String l(r47 r47Var, String str) {
        TLRPC.Message message = r47Var.k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean C = lbc.C(r47.B0(message));
        if (C && !TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name)) {
            return ob6.a0(null, null, 2131747764, c.w(tL_messageActionGramTransfer.amount, false), s43.d(tL_messageActionGramTransfer.onramp_provider_name, Locale.getDefault()));
        }
        boolean z = (tL_messageActionGramTransfer.comment_encrypted || TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) ? false : true;
        return ob6.a0(null, null, C ? z ? 2131747762 : 2131747763 : z ? 2131747765 : 2131747766, str, c.w(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
    }

    public static TLRPC.NotificationSound m(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j;
            return tL_notificationSoundRingtone;
        }
        if (string == null) {
            return new TLRPC.TL_notificationSoundDefault();
        }
        if (string.equalsIgnoreCase("NoSound")) {
            return new TLRPC.TL_notificationSoundNone();
        }
        TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
        tL_notificationSoundLocal.title = sharedPreferences.getString(str, null);
        tL_notificationSoundLocal.data = string;
        return tL_notificationSoundLocal;
    }

    public static ip7 n(int i) {
        ip7 ip7Var;
        ip7 ip7Var2 = q0[i];
        if (ip7Var2 != null) {
            return ip7Var2;
        }
        synchronized (r0[i]) {
            ip7Var = q0[i];
            if (ip7Var == null) {
                ip7[] ip7VarArr = q0;
                ip7 ip7Var3 = new ip7(i);
                ip7VarArr[i] = ip7Var3;
                ip7Var = ip7Var3;
            }
        }
        return ip7Var;
    }

    public static String p(long j, long j2, boolean z) {
        String valueOf;
        if (z) {
            if (j2 == 0) {
                return String.valueOf(j);
            }
            Locale locale = Locale.US;
            return j + "_" + j2;
        }
        long j3 = (j2 << 12) + j;
        zh6 zh6Var = s0;
        int h = zh6Var.h(j3);
        if (h >= 0) {
            return (String) zh6Var.n(h);
        }
        if (j2 != 0) {
            Locale locale2 = Locale.US;
            valueOf = j + "_" + j2;
        } else {
            valueOf = String.valueOf(j);
        }
        zh6Var.k(j3, valueOf);
        return valueOf;
    }

    public static boolean y(r47 r47Var) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = r47Var.k;
        TLRPC.Peer peer = message.peer_id;
        return (peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || r47Var.J;
    }

    public final void A() {
        try {
            SharedPreferences d = getAccountInstance().d();
            Map<String, ?> all = d.getAll();
            SharedPreferences.Editor edit = d.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        n0.deleteNotificationChannel(str);
                        if (f11.a) {
                            cc4.b("delete all channel " + str);
                        }
                    }
                    edit.remove(key);
                }
            }
            edit.commit();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void C(ArrayList arrayList, zh6 zh6Var, ArrayList arrayList2, Collection collection) {
        long j;
        boolean z;
        long j2;
        boolean x;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j3;
        TLRPC.Message message;
        long j4;
        TLRPC.Message message2;
        SparseArray sparseArray;
        r47 r47Var;
        long j5;
        boolean z2;
        SparseArray sparseArray2;
        this.f.b();
        this.a.clear();
        this.c.b();
        this.E.clear();
        this.F.b();
        this.J = 0;
        this.K = 0;
        getAccountInstance().d();
        zh6 zh6Var2 = new zh6();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i);
            if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                TLRPC.MessageAction messageAction = message3.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                    long j6 = message3.peer_id.channel_id;
                    long j7 = j6 != 0 ? -j6 : 0L;
                    SparseArray sparseArray3 = (SparseArray) this.c.f(j7);
                    if (sparseArray3 == null || sparseArray3.indexOfKey(message3.id) < 0) {
                        r47 r47Var2 = new r47(this.currentAccount, message3, false, false);
                        if (y(r47Var2)) {
                            this.K++;
                        }
                        long B0 = r47.B0(r47Var2.k);
                        long b2 = r47.b2(this.currentAccount, r47Var2.k, getMessagesController().w2(r47Var2), false);
                        if (r47Var2.k.mentioned) {
                            message = message3;
                            j4 = r47Var2.Z0();
                            j3 = j7;
                        } else {
                            j3 = j7;
                            message = message3;
                            j4 = B0;
                        }
                        int h = zh6Var2.h(j4);
                        if (h < 0 || b2 != 0) {
                            int o = o(j4, b2);
                            if (o == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j5 = j3;
                                z2 = x(j4, null, r47Var2.I, r47Var2.J);
                                r47Var = r47Var2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                r47Var = r47Var2;
                                j5 = j3;
                                z2 = o != 2;
                            }
                            zh6Var2.k(j4, Boolean.valueOf(z2));
                        } else {
                            z2 = ((Boolean) zh6Var2.n(h)).booleanValue();
                            message2 = message;
                            sparseArray = sparseArray3;
                            r47Var = r47Var2;
                            j5 = j3;
                        }
                        if (z2 && (j4 != this.G || !a.w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                this.c.k(j5, sparseArray2);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.id, r47Var);
                            b(r47Var);
                            if (B0 != j4) {
                                Integer num = (Integer) this.r.f(B0);
                                this.r.k(B0, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                            }
                        }
                    }
                }
            }
        }
        long j8 = 0;
        int i2 = 0;
        while (i2 < zh6Var.m()) {
            long j9 = zh6Var.j(i2);
            int h2 = zh6Var2.h(j9);
            if (h2 >= 0) {
                x = ((Boolean) zh6Var2.n(h2)).booleanValue();
            } else {
                int o2 = o(j9, j8);
                x = o2 == -1 ? x(j9, null, false, false) : o2 != 2;
                zh6Var2.k(j9, Boolean.valueOf(x));
            }
            if (x) {
                Integer num2 = (Integer) zh6Var.n(i2);
                int intValue = num2.intValue();
                this.f.k(j9, num2);
                if (!getMessagesController().n2(j9)) {
                    boolean v2 = getMessagesController().v2(j9);
                    int i3 = this.J;
                    if (v2) {
                        this.J = i3 + (intValue > 0 ? 1 : 0);
                    } else {
                        this.J = i3 + intValue;
                    }
                }
            }
            i2++;
            j8 = 0;
        }
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            r47 r47Var3 = (r47) arrayList2.get(i4);
            int e1 = r47Var3.e1();
            if (this.c.h(e1) < 0) {
                if (y(r47Var3)) {
                    this.K++;
                }
                long B02 = r47.B0(r47Var3.k);
                long b22 = r47.b2(this.currentAccount, r47Var3.k, getMessagesController().w2(r47Var3), false);
                TLRPC.Message message4 = r47Var3.k;
                long j10 = message4.random_id;
                long Z0 = message4.mentioned ? r47Var3.Z0() : B02;
                int h3 = zh6Var2.h(Z0);
                if (h3 < 0 || b22 != 0) {
                    int o3 = o(Z0, b22);
                    if (o3 == -1) {
                        j = Z0;
                        z = x(j, null, r47Var3.I, r47Var3.J);
                    } else {
                        j = Z0;
                        z = o3 != 2;
                    }
                    zh6Var2.k(j, Boolean.valueOf(z));
                } else {
                    long j11 = Z0;
                    z = ((Boolean) zh6Var2.n(h3)).booleanValue();
                    j = j11;
                }
                if (z && (j != this.G || !a.w)) {
                    if (e1 != 0) {
                        boolean z3 = r47Var3.J;
                        TLRPC.Message message5 = r47Var3.k;
                        if (z3) {
                            j2 = r47.B0(message5);
                        } else {
                            long j12 = message5.peer_id.channel_id;
                            j2 = j12 != 0 ? -j12 : 0L;
                        }
                        SparseArray sparseArray4 = (SparseArray) this.c.f(j2);
                        if (sparseArray4 == null) {
                            sparseArray4 = new SparseArray();
                            this.c.k(j2, sparseArray4);
                        }
                        sparseArray4.put(e1, r47Var3);
                    } else if (j10 != 0) {
                        this.d.k(j10, r47Var3);
                    }
                    b(r47Var3);
                    if (B02 != j) {
                        Integer num3 = (Integer) this.r.f(B02);
                        this.r.k(B02, Integer.valueOf(num3 == null ? 1 : num3.intValue() + 1));
                    }
                    Integer num4 = (Integer) this.f.f(j);
                    int intValue2 = num4 != null ? num4.intValue() + 1 : 1;
                    if (!getMessagesController().n2(j)) {
                        if (getMessagesController().v2(j)) {
                            if (num4 != null) {
                                this.J -= num4.intValue() > 0 ? 1 : 0;
                            }
                            this.J += intValue2 > 0 ? 1 : 0;
                        } else {
                            if (num4 != null) {
                                this.J -= num4.intValue();
                            }
                            this.J += intValue2;
                        }
                    }
                    this.f.k(j, Integer.valueOf(intValue2));
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                hp7 hp7Var = (hp7) it.next();
                long j13 = hp7Var.a;
                hp7 hp7Var2 = (hp7) this.F.f(j13);
                if (hp7Var2 != null) {
                    hp7Var2.c.putAll(hp7Var.c);
                } else {
                    this.E.add(hp7Var);
                    this.F.k(j13, hp7Var);
                }
            }
            Collections.sort(this.E, Comparator$-CC.comparingLong(new fh((byte) 3)));
        }
        hl.c3(new bp7(this, this.f.m(), (byte) 4));
        Z(SystemClock.elapsedRealtime() / 1000 < 60);
        if (this.S) {
            S(t());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c6, code lost:
    
        if (ip7.p0.getRingerMode() == 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if ((r12 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0266  */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void D(ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2, CountDownLatch countDownLatch) {
        boolean z3;
        int i;
        Integer num;
        long j;
        long j2;
        SharedPreferences sharedPreferences;
        boolean z4;
        long j3;
        long j4;
        r47 r47Var;
        int i2;
        boolean z5;
        long j5;
        r47 r47Var2;
        SharedPreferences sharedPreferences2;
        long j6;
        long j7;
        long j8;
        long j9;
        String str;
        SharedPreferences sharedPreferences3;
        SparseArray sparseArray;
        long j10;
        boolean z6;
        ip7 ip7Var;
        int i3;
        SparseArray sparseArray2;
        long j11;
        r47 r47Var3;
        ip7 ip7Var2 = this;
        ArrayList arrayList3 = arrayList;
        zh6 zh6Var = new zh6();
        SharedPreferences d = ip7Var2.getAccountInstance().d();
        boolean z7 = d.getBoolean("PinnedMessages", true);
        int i4 = 0;
        boolean z8 = false;
        int i5 = 0;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            byte b = 2;
            if (i4 >= arrayList3.size()) {
                break;
            }
            r47 r47Var4 = (r47) arrayList3.get(i4);
            if (r47Var4.k != null) {
                if (!r47Var4.y3()) {
                    TLRPC.Message message = r47Var4.k;
                    TLRPC.MessageAction messageAction = message.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL)) {
                        if (message.silent) {
                            if (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp)) {
                            }
                        }
                    }
                }
                if (f11.a) {
                    cc4.b("skipped message because 1");
                }
                i2 = i4;
                z5 = z8;
                sharedPreferences2 = d;
                ip7Var = ip7Var2;
                sharedPreferences3 = sharedPreferences2;
                z8 = z5;
                i4 = i2 + 1;
                ip7Var2 = ip7Var;
                d = sharedPreferences3;
                arrayList3 = arrayList;
            }
            if (!r47.D4(r47Var4)) {
                if (r47Var4.K) {
                    long currentTimeMillis = r47Var4.k == null ? System.currentTimeMillis() : r5.date * 1000;
                    long B0 = r47.B0(r47Var4.k);
                    int e1 = r47Var4.e1();
                    hp7 hp7Var = (hp7) ip7Var2.F.f(B0);
                    byte b2 = 24;
                    if (hp7Var != null) {
                        hp7Var.c.put(Integer.valueOf(e1), new Pair(Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis + 86400000)));
                        boolean z12 = hp7Var.d;
                        boolean z13 = r47Var4.M;
                        if (z12 != z13) {
                            hp7Var.d = z13;
                            z11 = true;
                        }
                        hp7Var.e = hp7Var.a();
                        kf7 messagesStorage = ip7Var2.getMessagesStorage();
                        messagesStorage.a.c(new t87(messagesStorage, hp7Var, b2));
                        z9 = true;
                    } else {
                        hp7 hp7Var2 = new hp7(r47Var4.b, B0, e1, currentTimeMillis, currentTimeMillis + 86400000);
                        hp7Var2.d = r47Var4.M;
                        ip7Var2.E.add(hp7Var2);
                        ip7Var2.F.k(B0, hp7Var2);
                        kf7 messagesStorage2 = ip7Var2.getMessagesStorage();
                        messagesStorage2.a.c(new t87(messagesStorage2, hp7Var2, b2));
                        z8 = true;
                        z11 = true;
                    }
                    Collections.sort(ip7Var2.E, Comparator$-CC.comparingLong(new fh(b)));
                    ip7Var = ip7Var2;
                    i2 = i4;
                    sharedPreferences3 = d;
                } else {
                    if (r47Var4.O) {
                        TLRPC.Message message2 = r47Var4.k;
                        if (message2 != null) {
                            int i6 = message2.id;
                            long j12 = message2.date + 60;
                            long currentTime = ConnectionsManager.getInstance(ip7Var2.currentAccount).getCurrentTime();
                            if (currentTime <= j12) {
                                hl.d3(new bp7(ip7Var2, i6, (byte) 6), (j12 - currentTime) * 1000);
                            }
                        }
                        i2 = i4;
                        z5 = z8;
                        sharedPreferences2 = d;
                        ip7Var = ip7Var2;
                        sharedPreferences3 = sharedPreferences2;
                        z8 = z5;
                    }
                    int e12 = r47Var4.e1();
                    if (r47Var4.i3()) {
                        j = 0;
                        j2 = r47Var4.k.random_id;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    long B02 = r47.B0(r47Var4.k);
                    if (r47Var4.i3()) {
                        z4 = r47Var4.f;
                        sharedPreferences = d;
                    } else if (wf3.y(B02)) {
                        sharedPreferences = d;
                        TLRPC.Chat M0 = ip7Var2.getMessagesController().M0(Long.valueOf(-B02));
                        z4 = xc2.T(M0) && !M0.megagroup;
                    } else {
                        sharedPreferences = d;
                        z4 = false;
                    }
                    boolean z14 = r47Var4.J;
                    TLRPC.Message message3 = r47Var4.k;
                    if (z14) {
                        j3 = j2;
                        j4 = r47.B0(message3);
                    } else {
                        j3 = j2;
                        long j13 = message3.peer_id.channel_id;
                        j4 = j13 != j ? -j13 : j;
                    }
                    SparseArray sparseArray3 = (SparseArray) ip7Var2.c.f(j4);
                    r47 r47Var5 = sparseArray3 != null ? (r47) sparseArray3.get(e12) : null;
                    if (r47Var5 == null) {
                        r47Var = r47Var5;
                        i2 = i4;
                        long j14 = r47Var4.k.random_id;
                        if (j14 != j) {
                            r47Var2 = (r47) ip7Var2.d.f(j14);
                            if (r47Var2 != null) {
                                z5 = z8;
                                j5 = B02;
                                ip7Var2.d.l(r47Var4.k.random_id);
                            } else {
                                z5 = z8;
                                j5 = B02;
                            }
                            byte b3 = 10;
                            if (r47Var2 == null) {
                                if (r47Var2.i3()) {
                                    if (sparseArray3 == null) {
                                        sparseArray3 = new SparseArray();
                                        ip7Var2.c.k(j4, sparseArray3);
                                    }
                                    sparseArray3.put(e12, r47Var4);
                                    int indexOf = ip7Var2.a.indexOf(r47Var2);
                                    if (indexOf >= 0) {
                                        ip7Var2.a.set(indexOf, r47Var4);
                                        j11 = j4;
                                        r47Var3 = r47Var4;
                                        i5 = a(arrayList2, r47Var3, j5, z4, sharedPreferences);
                                    } else {
                                        j11 = j4;
                                        r47Var3 = r47Var4;
                                    }
                                    if (z) {
                                        boolean z15 = r47Var3.i;
                                        if (z15) {
                                            kf7 messagesStorage3 = ip7Var2.getMessagesStorage();
                                            messagesStorage3.a.c(new ve2(messagesStorage3, r47Var3, b3));
                                        }
                                        z9 = z15;
                                    }
                                } else {
                                    j11 = j4;
                                }
                                if (f11.a) {
                                    cc4.b("skipped message because old message with same dialog and message ids exist: did=" + j11 + ", mid=" + e12);
                                }
                                ip7Var = ip7Var2;
                                sharedPreferences3 = sharedPreferences;
                                z8 = z5;
                            } else {
                                long j15 = j4;
                                if (!z9) {
                                    if (z && !r47Var4.O) {
                                        kf7 messagesStorage4 = ip7Var2.getMessagesStorage();
                                        messagesStorage4.a.c(new ve2(messagesStorage4, r47Var4, b3));
                                    }
                                    long b22 = r47.b2(ip7Var2.currentAccount, r47Var4.k, ip7Var2.getMessagesController().w2(r47Var4), false);
                                    if (j5 != ip7Var2.G || !a.w || r47Var4.J || r47Var4.O) {
                                        sharedPreferences2 = sharedPreferences;
                                        long j16 = j5;
                                        TLRPC.Message message4 = r47Var4.k;
                                        if (!message4.mentioned) {
                                            j6 = j15;
                                            j7 = j16;
                                        } else if (z7 || !(message4.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                            j6 = j15;
                                            j7 = r47Var4.Z0();
                                        } else {
                                            if (f11.a) {
                                                cc4.b("skipped message because message is mention of pinned");
                                            }
                                            ip7Var = ip7Var2;
                                            sharedPreferences3 = sharedPreferences2;
                                            z8 = z5;
                                        }
                                        if (y(r47Var4)) {
                                            ip7Var2.K++;
                                        }
                                        int h = zh6Var.h(j7);
                                        if (h < 0 || b22 != j) {
                                            int o = ip7Var2.o(j7, b22);
                                            if (o == -1) {
                                                j8 = b22;
                                                sharedPreferences3 = sharedPreferences2;
                                                sparseArray = sparseArray3;
                                                j10 = j6;
                                                j9 = j7;
                                                boolean x = x(j9, Boolean.valueOf(z4), r47Var4.I, r47Var4.J);
                                                if (f11.a) {
                                                    cc4.b("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + j9 + ", " + z4 + ", " + r47Var4.I + ", " + r47Var4.J + ") = " + x);
                                                }
                                                str = ", ";
                                                z6 = x;
                                            } else {
                                                j8 = b22;
                                                j9 = j7;
                                                str = ", ";
                                                sharedPreferences3 = sharedPreferences2;
                                                sparseArray = sparseArray3;
                                                j10 = j6;
                                                z6 = o != 2;
                                            }
                                            zh6Var.k(j9, Boolean.valueOf(z6));
                                        } else {
                                            z6 = ((Boolean) zh6Var.n(h)).booleanValue();
                                            j8 = b22;
                                            j9 = j7;
                                            str = ", ";
                                            sharedPreferences3 = sharedPreferences2;
                                            sparseArray = sparseArray3;
                                            j10 = j6;
                                        }
                                        if (f11.a) {
                                            cc4.b("NotificationsController: process new messages, value is " + z6 + " (" + j9 + str + z4 + str + r47Var4.I + str + r47Var4.J + ")");
                                        }
                                        ip7Var = this;
                                        if (z6) {
                                            if (!z) {
                                                long j17 = j9;
                                                i5 = a(arrayList2, r47Var4, j17, z4, sharedPreferences3);
                                                j9 = j17;
                                            }
                                            if (!z10) {
                                                z10 = r47Var4.k.from_scheduled;
                                            }
                                            ip7Var.b.add(r47Var4);
                                            ip7Var.b(r47Var4);
                                            if (e12 != 0) {
                                                if (sparseArray == null) {
                                                    SparseArray sparseArray4 = new SparseArray();
                                                    ip7Var.c.k(j10, sparseArray4);
                                                    sparseArray2 = sparseArray4;
                                                } else {
                                                    sparseArray2 = sparseArray;
                                                }
                                                i3 = e12;
                                                sparseArray2.put(i3, r47Var4);
                                            } else {
                                                i3 = e12;
                                                if (j3 != j) {
                                                    ip7Var.d.k(j3, r47Var4);
                                                }
                                            }
                                            if (j16 != j9) {
                                                Integer num2 = (Integer) ip7Var.r.f(j16);
                                                ip7Var.r.k(j16, Integer.valueOf(num2 == null ? 1 : num2.intValue() + 1));
                                            }
                                        } else {
                                            i3 = e12;
                                        }
                                        if (r47Var4.I) {
                                            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                            sparseBooleanArray.put(i3, true);
                                            ip7Var.getMessagesController().N(j9, j8, sparseBooleanArray, true);
                                        }
                                        z8 = true;
                                    } else {
                                        if (!z && ip7Var2.N && !MediaController.z().I()) {
                                            try {
                                            } catch (Exception e) {
                                                cc4.g(e, true);
                                            }
                                        }
                                        if (f11.a) {
                                            cc4.b("skipped message because chat is already opened (openedDialogId = " + ip7Var2.G + ")");
                                        }
                                    }
                                } else if (f11.a) {
                                    cc4.b("skipped message because edited");
                                }
                                sharedPreferences2 = sharedPreferences;
                                ip7Var = ip7Var2;
                                sharedPreferences3 = sharedPreferences2;
                                z8 = z5;
                            }
                        }
                    } else {
                        r47Var = r47Var5;
                        i2 = i4;
                    }
                    z5 = z8;
                    j5 = B02;
                    r47Var2 = r47Var;
                    byte b32 = 10;
                    if (r47Var2 == null) {
                    }
                }
                i4 = i2 + 1;
                ip7Var2 = ip7Var;
                d = sharedPreferences3;
                arrayList3 = arrayList;
            }
            if (f11.a) {
            }
            i2 = i4;
            z5 = z8;
            sharedPreferences2 = d;
            ip7Var = ip7Var2;
            sharedPreferences3 = sharedPreferences2;
            z8 = z5;
            i4 = i2 + 1;
            ip7Var2 = ip7Var;
            d = sharedPreferences3;
            arrayList3 = arrayList;
        }
        ip7 ip7Var3 = ip7Var2;
        boolean z16 = z8;
        byte b4 = 0;
        if (z16) {
            ip7Var3.L = z2;
        }
        if (!arrayList2.isEmpty() && !hl.n2(false) && !xea.B) {
            hl.c3(new l65((Object) ip7Var3, (Object) arrayList2, i5, (byte) 17));
        }
        if (z || z10) {
            if (z9) {
                if (f11.a) {
                    cc4.b("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + ip7Var3.L);
                }
                ip7Var3.b.clear();
                ip7Var3.Z(ip7Var3.L);
            } else if (z16) {
                if (f11.a) {
                    cc4.b("NotificationsController processNewMessages: added branch");
                }
                r47 r47Var6 = (r47) arrayList.get(0);
                long B03 = r47.B0(r47Var6.k);
                long b23 = r47.b2(ip7Var3.currentAccount, r47Var6.k, ip7Var3.getMessagesController().v2(B03), false);
                Boolean valueOf = r47Var6.i3() ? Boolean.valueOf(r47Var6.f) : null;
                int i7 = ip7Var3.J;
                int o2 = ip7Var3.o(B03, b23);
                boolean x2 = o2 == -1 ? ip7Var3.x(B03, valueOf, r47Var6.I, r47Var6.J) : o2 != 2;
                Integer num3 = (Integer) ip7Var3.f.f(B03);
                if (num3 != null) {
                    z3 = true;
                    i = num3.intValue() + 1;
                } else {
                    z3 = true;
                    i = 1;
                }
                if (ip7Var3.L && !x2 && (num = (Integer) ip7Var3.r.f(B03)) != null && num.intValue() != 0) {
                    i = num.intValue();
                    x2 = z3;
                }
                if (x2 && !r47Var6.K) {
                    if (!ip7Var3.getMessagesController().n2(B03)) {
                        if (ip7Var3.getMessagesController().v2(B03)) {
                            int i8 = ip7Var3.J - ((num3 == null || num3.intValue() <= 0) ? 0 : z3);
                            ip7Var3.J = i8;
                            ip7Var3.J = i8 + (i > 0 ? z3 : 0);
                        } else {
                            if (num3 != null) {
                                ip7Var3.J -= num3.intValue();
                            }
                            ip7Var3.J += i;
                        }
                    }
                    ip7Var3.f.k(B03, Integer.valueOf(i));
                }
                if (i7 != ip7Var3.J || z11) {
                    ip7Var3.b.clear();
                    if (f11.a) {
                        cc4.b("NotificationsController processNewMessages: added branch: " + ip7Var3.L);
                    }
                    ip7Var3.Z(ip7Var3.L);
                    hl.c3(new bp7(ip7Var3, ip7Var3.f.m(), b4));
                }
                ip7Var3.L = false;
                if (ip7Var3.S) {
                    ip7Var3.S(ip7Var3.t());
                }
            }
        }
        if (z11) {
            ip7Var3.d0();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
            return;
        }
        return;
        try {
            ip7Var2.getAccountInstance().d();
            if (ip7Var2.o(ip7Var2.G, ip7Var2.H) != 2) {
                l0.c(new vo7(ip7Var2, (byte) 5));
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
        if (f11.a) {
        }
        sharedPreferences2 = sharedPreferences;
        ip7Var = ip7Var2;
        sharedPreferences3 = sharedPreferences2;
        z8 = z5;
        i4 = i2 + 1;
        ip7Var2 = ip7Var;
        d = sharedPreferences3;
        arrayList3 = arrayList;
    }

    public final void E(long j, String str) {
        if (getUserConfig().o()) {
            if (xea.M0 || this.currentAccount == yac.t0) {
                try {
                    String str2 = "wallet_tonconnect_" + this.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        NotificationManager notificationManager = n0;
                        gk.g();
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    String M0 = (TextUtils.isEmpty(str) || (hl.n2(false) || xea.B || !getAccountInstance().d().getBoolean("EnablePreviewAll", true))) ? ob6.M0(2131747653, null) : ob6.a0(null, null, 2131747652, str);
                    Intent intent = new Intent(a.b, (Class<?>) LaunchActivity.class);
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent.putExtra("currentAccount", this.currentAccount);
                    intent.addFlags(67108864);
                    PendingIntent activity = PendingIntent.getActivity(a.b, this.currentAccount, intent, 201326592);
                    wn7 wn7Var = new wn7(a.b, str2);
                    wn7Var.F.icon = R.drawable.notification;
                    wn7Var.e = wn7.c(ob6.M0(R.string.AppName, null));
                    wn7Var.f = wn7.c(M0);
                    rn7 rn7Var = new rn7((byte) 0);
                    rn7Var.f = wn7.c(M0);
                    wn7Var.i(rn7Var);
                    wn7Var.u = "event";
                    wn7Var.x = 0;
                    wn7Var.F.when = j;
                    wn7Var.f(16, true);
                    wn7Var.g = activity;
                    m0.e("wallet_tonconnect", this.currentAccount, wn7Var.b());
                } catch (Exception e) {
                    cc4.g(e, true);
                }
            }
        }
    }

    public final void G(long j, long j2, boolean z) {
        int i = this.currentAccount;
        if (z) {
            n(i).H(j, ConnectionsManager.DEFAULT_DATACENTER_ID, j2);
            return;
        }
        boolean x = n(i).x(j, null, false, false);
        boolean z2 = j2 != 0;
        SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
        if (!x || z2) {
            edit.putInt("notify2_" + p(j, j2, false), 0);
        } else {
            edit.remove("notify2_" + p(j, j2, false));
        }
        if (j2 == 0) {
            getMessagesStorage().G1(j, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        c0(j, j2, true);
    }

    public final void H(long j, int i, long j2) {
        long j3 = 0;
        if (j != 0) {
            SharedPreferences.Editor edit = uc7.s1(this.currentAccount).X3.edit();
            boolean z = j2 != 0;
            boolean x = n(this.currentAccount).x(j, null, false, false);
            String p = p(j, j2, false);
            if (i != Integer.MAX_VALUE) {
                edit.putInt("notify2_" + p, 3);
                edit.putInt("notifyuntil_" + p, getConnectionsManager().getCurrentTime() + i);
                j3 = (((long) i) << 32) | 1;
            } else if (x || z) {
                edit.putInt("notify2_" + p, 2);
                j3 = 1L;
            } else {
                edit.remove("notify2_" + p);
            }
            edit.apply();
            if (j2 == 0) {
                n(this.currentAccount).N(j);
                kf7.a0(this.currentAccount).G1(j, j3);
                TLRPC.Dialog dialog = (TLRPC.Dialog) uc7.s1(this.currentAccount).R.f(j);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i != Integer.MAX_VALUE || x) {
                        tL_peerNotifySettings.mute_until = i;
                    }
                }
            }
            n(this.currentAccount).c0(j, j2, true);
        }
    }

    public final Pair I(ArrayList arrayList, ArrayList arrayList2) {
        int i;
        String str;
        TLRPC.FileLocation fileLocation;
        ArrayList arrayList3 = this.E;
        int min = Math.min(3, arrayList3.size());
        boolean z = false;
        int i2 = 0;
        for (0; i < min; i + 1) {
            hp7 hp7Var = (hp7) arrayList3.get(i);
            HashMap hashMap = hp7Var.c;
            long j = hp7Var.a;
            i2 += hashMap.size();
            z |= hp7Var.d;
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j));
            if (X1 == null && (X1 = getMessagesStorage().j0(j)) != null) {
                getMessagesController().i4(X1, true, false);
            }
            File file = null;
            if (X1 != null) {
                str = lbc.r(X1);
                TLRPC.UserProfilePhoto userProfilePhoto = X1.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    xb4 fileLoader = getFileLoader();
                    TLRPC.FileLocation fileLocation2 = X1.photo.photo_small;
                    fileLoader.getClass();
                    File J = xb4.J(fileLocation2, null, true, true);
                    if (!J.exists()) {
                        if (X1.photo.photo_big != null) {
                            xb4 fileLoader2 = getFileLoader();
                            TLRPC.FileLocation fileLocation3 = X1.photo.photo_big;
                            fileLoader2.getClass();
                            J = xb4.J(fileLocation3, null, true, true);
                        } else {
                            J = null;
                        }
                        if (J != null && !J.exists()) {
                            J = null;
                        }
                    }
                    if (J != null) {
                        file = J;
                    }
                }
            } else {
                str = hp7Var.b;
                i = str == null ? i + 1 : 0;
            }
            if (str.length() > 50) {
                str = str.substring(0, 25).concat("…");
            }
            arrayList.add(str);
            if (file != null) {
                arrayList2.add(file);
            } else if (X1 != null) {
                arrayList2.add(X1);
            }
        }
        if (z) {
            arrayList2.clear();
        }
        return new Pair(Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public final void J(LongSparseIntArray longSparseIntArray) {
        l0.c(new ap7(this, longSparseIntArray, new ArrayList(), (byte) 0));
    }

    public final void K(ArrayList arrayList, boolean z, boolean z2, CountDownLatch countDownLatch) {
        boolean z3;
        boolean z4;
        if (f11.a) {
            StringBuilder sb = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            sb.append(Integer.valueOf(arrayList.size()));
            sb.append(" isLast=");
            z3 = z;
            sb.append(z3);
            sb.append(" isFcm=");
            z4 = z2;
            sb.append(z4);
            sb.append(")");
            cc4.b(sb.toString());
        } else {
            z3 = z;
            z4 = z2;
        }
        int i = 0;
        while (i < arrayList.size()) {
            r47 r47Var = (r47) arrayList.get(i);
            if (r47Var != null && r47Var.k != null && !r47Var.O3()) {
                TLRPC.MessageAction messageAction = r47Var.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                    TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                    if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed || getConnectionsManager().getCurrentTime() - r47Var.k.date >= getMessagesController().a3 / 1000) {
                        VoIPGroupNotification.hide(a.b, this.currentAccount, r47Var.e1());
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(r47.B0(r47Var.k)));
                        ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            TLRPC.Peer peer = arrayList2.get(i2);
                            i2++;
                            hashSet.add(Long.valueOf(wf3.n(peer)));
                        }
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            long longValue = ((Long) it.next()).longValue();
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(wf3.r(this.currentAccount, longValue));
                        }
                        VoIPGroupNotification.request(a.b, this.currentAccount, r47.B0(r47Var.k), sb2.toString(), tL_messageActionConferenceCall.call_id, r47Var.e1(), tL_messageActionConferenceCall.video);
                        arrayList.remove(i);
                        i--;
                    }
                }
            }
            i++;
        }
        if (!arrayList.isEmpty()) {
            l0.c(new ma7(this, arrayList, new ArrayList(0), z4, z3, countDownLatch, (byte) 2));
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j, int i, int i2, boolean z) {
        l0.c(new tp6(this, longSparseIntArray, new ArrayList(0), j, i2, i, z));
    }

    public final void M(zh6 zh6Var, boolean z) {
        l0.c(new lb7((Object) this, (Object) zh6Var, z, (Object) new ArrayList(0), (byte) 3));
    }

    public final void N(long j) {
        L(null, j, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j, 0);
        J(longSparseIntArray);
    }

    public final String O(r47 r47Var) {
        String str;
        TLRPC.Message message = r47Var.k;
        if (message == null || (str = message.message) == null || message.entities == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        if (r47Var.K2) {
            return sb.toString();
        }
        for (int i = 0; i < r47Var.k.entities.size(); i++) {
            if (r47Var.k.entities.get(i) instanceof TLRPC.TL_messageEntitySpoiler) {
                TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) r47Var.k.entities.get(i);
                for (int i2 = 0; i2 < tL_messageEntitySpoiler.length; i2++) {
                    int i3 = tL_messageEntitySpoiler.offset + i2;
                    char[] cArr = this.i0;
                    sb.setCharAt(i3, cArr[i2 % cArr.length]);
                }
            }
        }
        return sb.toString();
    }

    public final void P(wn7 wn7Var, long j, long j2, String str, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        cc4.b("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 == null || uri == null || TextUtils.equals(uri2.toString(), uri.toString())) {
            return;
        }
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        String uri3 = uri2.toString();
        String M0 = ob6.M0(2131751564, null);
        if (z) {
            if (i3 == 2) {
                edit.putString("ChannelSound", M0);
            } else if (i3 == 0) {
                edit.putString("GroupSound", M0);
            } else if (i3 == 1) {
                edit.putString("GlobalSound", M0);
            } else if (i3 == 3) {
                edit.putString("StoriesSound", M0);
            } else if (i3 == 4 || i3 == 5) {
                edit.putString("ReactionSound", M0);
            }
            if (i3 == 2) {
                edit.putString("ChannelSoundPath", uri3);
            } else if (i3 == 0) {
                edit.putString("GroupSoundPath", uri3);
            } else if (i3 == 1) {
                edit.putString("GlobalSoundPath", uri3);
            } else if (i3 == 3) {
                edit.putString("StoriesSoundPath", uri3);
            } else if (i3 == 4 || i3 == 5) {
                edit.putString("ReactionSound", uri3);
            }
            getNotificationsController().h(i3);
        } else {
            edit.putString("sound_" + p(j, j2, false), M0);
            edit.putString("sound_path_" + p(j, j2, false), uri3);
            i(j, j2);
        }
        edit.commit();
        wn7Var.y = e0(j, j2, str, jArr, i, uri2, i2, z, z2, z3, i3);
        m0.e(null, this.e0, wn7Var.b());
    }

    public final void Q(boolean z) {
        vo7 vo7Var = this.V;
        try {
            if (f11.a) {
                cc4.b("delay notification start, onlineReason = " + z);
            }
            this.W.acquire(10000L);
            to3 to3Var = l0;
            to3Var.a(vo7Var);
            to3Var.d(vo7Var, z ? 3000 : 1000);
        } catch (Exception e) {
            cc4.g(e, true);
            Z(this.L);
        }
    }

    public final void R() {
        try {
            Intent intent = new Intent(a.b, (Class<?>) NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(a.b, 0, intent, 33554432);
            if (getAccountInstance().d().getInt("repeat_messages", 60) <= 0 || this.K <= 0) {
                this.d0.cancel(service);
            } else {
                this.d0.set(2, SystemClock.elapsedRealtime() + (r1 * 60000), service);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final void S(int i) {
        if (this.O != i) {
            cc4.b("setBadge " + i);
            this.O = i;
            try {
                if (zm7.c == null && !zm7.b) {
                    zm7.b();
                    zm7.b = true;
                }
                xm7 xm7Var = zm7.c;
                if (xm7Var != null) {
                    xm7Var.a(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void T(long j, int i, long j2) {
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) uc7.s1(yac.t0).R.f(j);
        if (i == 4) {
            if (x(j, null, false, false)) {
                edit.remove("notify2_" + p(j, j2, false));
            } else {
                edit.putInt("notify2_" + p(j, j2, false), 0);
            }
            getMessagesStorage().G1(j, 0L);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        } else {
            int currentTime = ConnectionsManager.getInstance(yac.t0).getCurrentTime();
            if (i == 0) {
                currentTime += 3600;
            } else if (i == 1) {
                currentTime += 28800;
            } else if (i == 2) {
                currentTime += 172800;
            } else if (i == 3) {
                currentTime = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            long j3 = 1;
            if (i == 3) {
                edit.putInt("notify2_" + p(j, j2, false), 2);
            } else {
                edit.putInt("notify2_" + p(j, j2, false), 3);
                edit.putInt("notifyuntil_" + p(j, j2, false), currentTime);
                j3 = 1 | (((long) currentTime) << 32);
            }
            n(yac.t0).N(j);
            kf7.a0(yac.t0).G1(j, j3);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        edit.commit();
        c0(j, j2, true);
    }

    public final void U(int i, int i2) {
        getAccountInstance().d().edit().putInt(k(i), i2).commit();
        b0(i);
        kf7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new hd7(messagesStorage, (byte) 12));
        g(i);
    }

    public final void V(int i) {
        l0.c(new bp7(this, i, (byte) 7));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(90:51|(2:53|(3:55|56|57)(4:58|(2:61|59)|62|63))(1:895)|64|65|(1:67)(3:890|(1:892)(1:894)|893)|68|(4:71|(2:73|74)(1:76)|75|69)|77|78|(5:80|(2:(1:83)(1:761)|84)(1:762)|(1:760)(2:90|(2:94|95))|759|95)(3:763|(3:(1:875)(1:772)|773|(13:775|(2:777|(1:779)(5:828|(1:830)|831|380|381))(2:832|(1:840)(2:836|(1:838)))|780|781|(1:783)(2:818|(1:820)(2:821|(1:823)(2:824|(1:826)(7:827|785|786|(1:817)(4:791|(4:793|(1:807)(2:797|(2:801|802))|806|802)(2:808|(2:810|(2:812|(1:814))))|803|(1:805))|816|803|(0)))))|784|785|786|(0)|817|816|803|(0))(9:841|(2:843|(1:845)(5:847|(1:849)|831|380|381))(9:850|(1:874)(1:854)|855|(1:873)(2:859|(1:861))|872|863|(2:865|(1:867))(1:871)|(1:869)|870)|846|786|(0)|817|816|803|(0)))(3:876|(5:878|(2:880|(1:882))(2:883|(2:885|(1:887)))|831|380|381)(1:889)|888)|57)|(1:758)(2:99|(1:101))|102|(3:104|(1:106)(1:756)|107)(1:757)|108|(3:110|(3:112|(1:114)(3:743|744|(3:746|(1:748)(1:750)|749)(1:751))|115)|754)(1:755)|(2:(1:741)(3:122|(1:124)(2:(2:737|738)|736)|125)|126)(1:742)|127|(5:700|(5:702|(4:705|(2:713|714)|715|703)|720|721|(4:723|(1:725)|726|727)(1:733))(1:734)|728|(1:730)(1:732)|731)(1:130)|131|(1:133)|134|(1:136)(1:690)|137|(1:689)(1:141)|142|143|(1:688)(3:146|(1:148)|(3:653|654|(62:658|659|660|(6:664|(1:666)(2:(2:678|679)|682)|667|668|669|670)|151|(1:652)(1:155)|(1:651)(1:158)|159|(1:650)|166|(1:649)(1:173)|174|(11:176|(1:178)(2:377|(4:379|380|381|57)(2:382|(1:(1:385)(1:386))(2:387|(1:389)(2:390|(1:395)(1:394)))))|179|(2:182|180)|183|184|(1:376)(1:187)|188|(1:190)|(1:192)(1:375)|193)(4:396|(5:398|(1:400)(3:404|(1:406)(2:634|(2:639|(1:641)(2:642|(1:646)))(1:638))|(3:408|(1:410)|411)(14:412|(1:414)|415|(2:630|(1:632)(1:633))(1:421)|422|423|(3:622|(1:(1:625)(2:626|(1:628)))|629)(1:427)|428|(2:(2:431|(1:(2:434|(1:436))(1:616))(2:617|(1:619)))(1:620)|615)(1:621)|(4:548|(1:614)(5:554|(1:613)(4:557|(1:561)|(1:612)(2:567|(1:571))|611)|(2:576|(2:578|(1:588))(2:589|(1:599)))|(1:601)(1:(2:606|607))|602)|610|602)(1:440)|441|(7:443|(1:544)(8:456|(1:543)(3:460|(9:525|526|527|528|529|530|531|532|533)(1:462)|463)|464|(1:466)(1:524)|467|468|(2:519|520)(3:470|(3:515|(1:517)|518)|472)|(7:474|(1:476)|477|(2:479|(1:481))|482|483|(2:488|(2:490|(3:492|(2:497|498)(1:494)|(1:496))(2:501|(2:503|(1:505)))))))|512|(3:514|483|(3:486|488|(0)))|482|483|(0))(2:545|(1:547))|506|(2:508|(3:510|511|403))))|401|402|403)|647|648)|194|195|(47:197|(1:199)(2:349|(1:351)(2:352|(46:354|(1:356)(1:(1:359))|357|201|(1:203)|204|(1:206)|207|(2:209|(1:211)(1:344))(2:345|(1:347)(1:348))|(1:213)|214|(4:216|(2:219|217)|220|221)(1:343)|222|(1:224)(1:342)|225|(1:341)(1:231)|232|233|234|235|236|237|238|(1:240)|(1:244)|245|(1:247)|(2:251|(20:253|(4:256|(2:257|(2:259|(2:262|263)(1:261))(1:332))|(1:265)(1:266)|254)|333|267|(1:269)|270|(2:(1:275)|(1:282))|283|(1:289)|290|(1:292)|(1:294)|295|(3:300|(4:302|(3:304|(4:306|(1:308)|309|310)(2:312|313)|311)|314|315)|316)|(1:331)(2:319|(2:323|(1:325)))|326|(1:328)|329|330|57))|334|(0)|270|(3:272|(0)|(2:277|282))|283|(3:285|287|289)|290|(0)|(0)|295|(4:297|300|(0)|316)|(0)|331|326|(0)|329|330|57)))|200|201|(0)|204|(0)|207|(0)(0)|(0)|214|(0)(0)|222|(0)(0)|225|(1:227)|341|232|233|234|235|236|237|238|(0)|(2:242|244)|245|(0)|(3:249|251|(0))|334|(0)|270|(0)|283|(0)|290|(0)|(0)|295|(0)|(0)|331|326|(0)|329|330|57)|360|(4:362|(2:365|363)|366|367)(2:368|(1:370)(2:371|(1:373)(1:374)))|201|(0)|204|(0)|207|(0)(0)|(0)|214|(0)(0)|222|(0)(0)|225|(0)|341|232|233|234|235|236|237|238|(0)|(0)|245|(0)|(0)|334|(0)|270|(0)|283|(0)|290|(0)|(0)|295|(0)|(0)|331|326|(0)|329|330|57)))|150|151|(1:153)|652|(0)|651|159|(1:161)|650|166|(1:169)|649|174|(0)(0)|194|195|(0)|360|(0)(0)|201|(0)|204|(0)|207|(0)(0)|(0)|214|(0)(0)|222|(0)(0)|225|(0)|341|232|233|234|235|236|237|238|(0)|(0)|245|(0)|(0)|334|(0)|270|(0)|283|(0)|290|(0)|(0)|295|(0)|(0)|331|326|(0)|329|330|57) */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x1386, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x138b, code lost:
    
        cc4.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x1388, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x1389, code lost:
    
        r4 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x054f, code lost:
    
        if (r5.local_id != 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x03f5, code lost:
    
        if (r0.local_id != 0) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x04ba, code lost:
    
        if (r7.local_id != 0) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:153:0x08e6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x08f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x091c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x094a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x110c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x11ab  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x11cd  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1227  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x1284  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x12ab  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1300  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x132e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x1363 A[Catch: Exception -> 0x1386, TryCatch #12 {Exception -> 0x1386, blocks: (B:238:0x135c, B:240:0x1363, B:242:0x136b, B:244:0x136f, B:245:0x1375), top: B:237:0x135c }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x136b A[Catch: Exception -> 0x1386, TryCatch #12 {Exception -> 0x1386, blocks: (B:238:0x135c, B:240:0x1363, B:242:0x136b, B:244:0x136f, B:245:0x1375), top: B:237:0x135c }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x1390  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1399  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x13a3  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x13f0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x1432  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x1438  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x1455  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x146a  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x146f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x147c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x1489  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x1506 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x153c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x1307  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x12cc  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x125f  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x1156  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x117c  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0eee  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0f1a  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x0f75  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0fec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0ffc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x1092  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0efb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0ef2  */
    /* JADX WARN: Removed duplicated region for block: B:788:0x04f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:805:0x055f  */
    /* JADX WARN: Removed duplicated region for block: B:900:0x15a5  */
    /* JADX WARN: Removed duplicated region for block: B:910:0x160e  */
    /* JADX WARN: Removed duplicated region for block: B:922:0x166f  */
    /* JADX WARN: Removed duplicated region for block: B:948:0x15e4  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x01b7 A[EDGE_INSN: B:954:0x01b7->B:898:0x01b7 BREAK  A[LOOP:2: B:48:0x01a9->B:57:0x1589], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:955:0x0174  */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v101 */
    /* JADX WARN: Type inference failed for: r8v102, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v103 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(wn7 wn7Var, String str, long j, long j2, String str2, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        boolean z4;
        zh6 zh6Var;
        boolean z5;
        long e;
        boolean z6;
        zh6 zh6Var2;
        int size;
        ArrayList arrayList;
        boolean z7;
        zh6 zh6Var3;
        ArrayList arrayList2;
        String str3;
        int i4;
        int size2;
        int i5;
        zh6 zh6Var4;
        boolean z8;
        int i6;
        boolean z9;
        Notification notification;
        long j3;
        long j4;
        zh6 zh6Var5;
        int e1;
        r47 r47Var;
        ArrayList arrayList3;
        int i7;
        Integer num;
        int i8;
        zh6 zh6Var6;
        Notification notification2;
        Integer num2;
        int i9;
        int i10;
        gp7 gp7Var;
        long j5;
        String str4;
        String str5;
        TLRPC.User user;
        TLRPC.User user2;
        String L0;
        TLRPC.FileLocation fileLocation;
        TLRPC.Chat chat;
        boolean z10;
        boolean z11;
        boolean z12;
        SharedPreferences sharedPreferences;
        zh6 zh6Var7;
        ArrayList arrayList4;
        long j6;
        TLRPC.Chat M0;
        TLRPC.FileLocation fileLocation2;
        String str6;
        TLRPC.User user3;
        int i11;
        TLRPC.User user4;
        int i12;
        TLRPC.FileLocation fileLocation3;
        TLRPC.FileLocation fileLocation4;
        TLRPC.FileLocation fileLocation5;
        TLRPC.FileLocation fileLocation6;
        String r;
        TLRPC.User user5;
        TLRPC.FileLocation fileLocation7;
        String L02;
        Notification notification3;
        int i13;
        String str7;
        TLRPC.FileLocation fileLocation8;
        int i14;
        Bitmap bitmap;
        File file;
        String str8;
        String str9;
        Bitmap bitmap2;
        String str10;
        TLRPC.User user6;
        TLRPC.Chat chat2;
        ?? r4;
        boolean z13;
        String Z;
        int i15;
        ln7 b;
        ln7 ln7Var;
        long j7;
        eo7 eo7Var;
        int i16;
        StringBuilder sb;
        zh6 zh6Var8;
        long j8;
        gp7 gp7Var2;
        String str11;
        int i17;
        Bitmap bitmap3;
        String str12;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList5;
        int i18;
        String[] strArr;
        boolean[] zArr;
        long j9;
        String str13;
        String str14;
        StringBuilder sb2;
        long j10;
        long j11;
        IconCompat iconCompat;
        char c;
        int i19;
        int i20;
        int i21;
        File file2;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation9;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation10;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation11;
        r47 r47Var2;
        zh6 zh6Var9;
        gp7 gp7Var3;
        ArrayList arrayList6;
        char c2;
        ArrayList arrayList7;
        Uri uri2;
        File file3;
        File file4;
        Uri c3;
        File file5;
        r47 r47Var3;
        int i22;
        long j12;
        long j13;
        Bitmap bitmap4;
        String str15;
        eo7 eo7Var2;
        String str16;
        ArrayList arrayList8;
        long j14;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton;
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy;
        long j15;
        TLRPC.User user7;
        int size3;
        int i23;
        String str17;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList9;
        int i24;
        TLRPC.Message message;
        TLRPC.ReplyMarkup replyMarkup;
        Intent intent;
        ArrayList arrayList10;
        boolean z14;
        ?? r8;
        String G;
        TLRPC.UserProfilePhoto userProfilePhoto3;
        TLRPC.FileLocation fileLocation12;
        IconCompat iconCompat2;
        IconCompat iconCompat3;
        int i25;
        Bitmap bitmap5;
        String G2;
        TLRPC.UserProfilePhoto userProfilePhoto4;
        TLRPC.FileLocation fileLocation13;
        ip7 ip7Var = this;
        cc4.b("showExtraNotifications pushMessages.size()=" + ip7Var.a.size());
        if (Build.VERSION.SDK_INT >= 26) {
            z4 = z3;
            wn7Var.y = ip7Var.e0(j, j2, str2, jArr, i, uri, i2, z, z2, z4, i3);
        } else {
            z4 = z3;
        }
        wn7Var.f(8, z4);
        Notification b2 = wn7Var.b();
        SharedPreferences d = ip7Var.getAccountInstance().d();
        ArrayList arrayList11 = new ArrayList();
        if (!ip7Var.E.isEmpty()) {
            arrayList11.add(new gp7(0L, 0L, true));
        }
        zh6 zh6Var10 = new zh6();
        int i26 = 0;
        for (int i27 = 0; i27 < ip7Var.a.size(); i27++) {
            r47 r47Var4 = (r47) ip7Var.a.get(i27);
            long A0 = r47Var4.A0();
            long a2 = r47.a2(ip7Var.currentAccount, r47Var4.k, ip7Var.getMessagesController().w2(r47Var4));
            int i28 = d.getInt("dismissDate" + A0, 0);
            if (r47Var4.K || r47Var4.k.date > i28) {
                ArrayList arrayList12 = (ArrayList) zh6Var10.f(A0);
                if (arrayList12 == null) {
                    arrayList12 = qd4.s(zh6Var10, A0);
                    cc4.b("showExtraNotifications: sortedDialogs += " + A0);
                    arrayList11.add(new gp7(A0, a2, false));
                }
                arrayList12.add(r47Var4);
            } else {
                StringBuilder o = ik8.o(A0, "showExtraNotifications: dialog ", " is skipped, message date (");
                o.append(r47Var4.k.date);
                o.append(" <= ");
                o.append(i28);
                o.append(")");
                cc4.b(o.toString());
            }
        }
        zh6 zh6Var11 = new zh6();
        int i29 = 0;
        while (true) {
            int m = ip7Var.h.m();
            zh6Var = ip7Var.h;
            if (i29 >= m) {
                break;
            }
            zh6Var11.k(zh6Var.j(i29), (Integer) ip7Var.h.n(i29));
            i29++;
        }
        zh6Var.b();
        ArrayList arrayList13 = new ArrayList();
        int i30 = Build.VERSION.SDK_INT;
        if (i30 > 27) {
            if (arrayList11.size() <= (ip7Var.E.isEmpty() ? 1 : 2)) {
                z5 = false;
                if (z5 && i30 >= 26) {
                    c();
                }
                e = ip7Var.getUserConfig().e();
                z6 = !hl.m2() || xea.B;
                cc4.b("showExtraNotifications: passcode=" + (xea.r.length() <= 0) + " waitingForPasscode=" + z6 + " selfUserId=" + e + " useSummaryNotification=" + z5);
                zh6Var2 = new zh6();
                size = arrayList11.size();
                arrayList = arrayList13;
                while (true) {
                    if (i26 >= size) {
                        break;
                    }
                    if (arrayList.size() >= 7) {
                        cc4.b("showExtraNotifications: break from holders, count over 7");
                        break;
                    }
                    gp7 gp7Var4 = (gp7) arrayList11.get(i26);
                    ArrayList arrayList14 = arrayList11;
                    if (gp7Var4.c) {
                        ArrayList arrayList15 = new ArrayList();
                        if (ip7Var.E.isEmpty()) {
                            StringBuilder sb3 = new StringBuilder("showExtraNotifications: [");
                            z8 = z6;
                            sb3.append(gp7Var4.a);
                            sb3.append("] continue; story but storyPushMessages is empty");
                            cc4.b(sb3.toString());
                            z9 = z5;
                            notification3 = b2;
                            sharedPreferences = d;
                            zh6Var5 = zh6Var10;
                            i8 = i26;
                            zh6Var6 = zh6Var11;
                            zh6Var7 = zh6Var2;
                            i6 = size;
                            j6 = e;
                            arrayList4 = arrayList;
                            i26 = i8 + 1;
                            arrayList = arrayList4;
                            arrayList11 = arrayList14;
                            z5 = z9;
                            z6 = z8;
                            size = i6;
                            zh6Var10 = zh6Var5;
                            zh6Var11 = zh6Var6;
                            d = sharedPreferences;
                            e = j6;
                            b2 = notification3;
                            zh6Var2 = zh6Var7;
                        } else {
                            z8 = z6;
                            i6 = size;
                            long j16 = ((hp7) ip7Var.E.get(0)).a;
                            int i31 = 0;
                            for (Iterator it = ((hp7) ip7Var.E.get(0)).c.keySet().iterator(); it.hasNext(); it = it) {
                                i31 = Math.max(i31, ((Integer) it.next()).intValue());
                            }
                            z9 = z5;
                            arrayList3 = arrayList15;
                            zh6Var5 = zh6Var10;
                            e1 = i31;
                            j3 = j16;
                            j4 = 0;
                            notification = b2;
                            r47Var = null;
                        }
                    } else {
                        z8 = z6;
                        i6 = size;
                        long j17 = gp7Var4.a;
                        z9 = z5;
                        notification = b2;
                        long j18 = gp7Var4.b;
                        ArrayList arrayList16 = (ArrayList) zh6Var10.f(j17);
                        j3 = j17;
                        j4 = j18;
                        zh6Var5 = zh6Var10;
                        e1 = ((r47) arrayList16.get(0)).e1();
                        r47Var = (r47) arrayList16.get(0);
                        arrayList3 = arrayList16;
                    }
                    long j19 = e;
                    Integer num3 = (Integer) zh6Var11.f(gp7Var4.a);
                    if (gp7Var4.c) {
                        num = 2147483646;
                        i7 = 32;
                    } else {
                        i7 = 32;
                        long j20 = gp7Var4.a;
                        if (num3 == null) {
                            num3 = Integer.valueOf(((int) j20) + ((int) (j20 >> 32)));
                        } else {
                            zh6Var11.l(j20);
                        }
                        num = num3;
                    }
                    i8 = i26;
                    int i32 = 0;
                    for (int i33 = 0; i33 < arrayList3.size(); i33++) {
                        if (i32 < ((r47) arrayList3.get(i33)).k.date) {
                            i32 = ((r47) arrayList3.get(i33)).k.date;
                        }
                    }
                    if (gp7Var4.c) {
                        zh6Var6 = zh6Var11;
                        TLRPC.User X1 = ip7Var.getMessagesController().X1(Long.valueOf(j3));
                        notification2 = notification;
                        if (ip7Var.E.size() == 1) {
                            G2 = X1 != null ? lbc.j(X1) : ((hp7) ip7Var.E.get(0)).b;
                            num2 = num;
                        } else {
                            num2 = num;
                            G2 = ob6.G(ip7Var.E.size(), "Stories", new Object[0]);
                        }
                        if (X1 == null || (userProfilePhoto4 = X1.photo) == null || (fileLocation13 = userProfilePhoto4.photo_small) == null) {
                            i9 = i32;
                        } else {
                            i9 = i32;
                            if (fileLocation13.volume_id != 0 && fileLocation13.local_id != 0) {
                                i10 = e1;
                                gp7Var = gp7Var4;
                                j5 = j3;
                                z10 = false;
                                z11 = false;
                                z12 = false;
                                str4 = "showExtraNotifications: [";
                                str5 = "Stories";
                                fileLocation = fileLocation13;
                                user2 = X1;
                                L0 = G2;
                                chat = null;
                            }
                        }
                        i10 = e1;
                        gp7Var = gp7Var4;
                        j5 = j3;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        str4 = "showExtraNotifications: [";
                        str5 = "Stories";
                        fileLocation = null;
                        user2 = X1;
                        L0 = G2;
                        chat = null;
                    } else {
                        zh6Var6 = zh6Var11;
                        notification2 = notification;
                        num2 = num;
                        i9 = i32;
                        if (wf3.B(j3)) {
                            i10 = e1;
                            gp7Var = gp7Var4;
                            j5 = j3;
                            str4 = "showExtraNotifications: [";
                            str5 = "Stories";
                            if (j5 != o0) {
                                int h = wf3.h(j5);
                                TLRPC.EncryptedChat a1 = ip7Var.getMessagesController().a1(Integer.valueOf(h));
                                if (a1 != null) {
                                    user = ip7Var.getMessagesController().X1(Long.valueOf(a1.user_id));
                                    if (user == null) {
                                        if (f11.a) {
                                            cc4.l("not found secret chat user to show dialog notification " + a1.user_id);
                                        }
                                    }
                                } else if (f11.a) {
                                    cc4.l("not found secret chat to show dialog notification " + h);
                                }
                                sharedPreferences = d;
                                zh6Var7 = zh6Var2;
                                arrayList4 = arrayList;
                                j6 = j19;
                                notification3 = notification2;
                            } else {
                                user = null;
                            }
                            user2 = user;
                            L0 = ob6.L0(2131745421);
                            fileLocation = null;
                            chat = null;
                            z10 = false;
                            z11 = false;
                            z12 = false;
                        } else {
                            boolean z15 = (r47Var == null || r47Var.I || r47Var.J || j3 == 777000) ? false : true;
                            if (wf3.D(j3)) {
                                TLRPC.User X12 = ip7Var.getMessagesController().X1(Long.valueOf(j3));
                                if (X12 != null) {
                                    j5 = j3;
                                    r = lbc.r(X12);
                                    z10 = z15;
                                    TLRPC.UserProfilePhoto userProfilePhoto5 = X12.photo;
                                    if (userProfilePhoto5 == null || (fileLocation7 = userProfilePhoto5.photo_small) == null) {
                                        str5 = "Stories";
                                        user5 = X12;
                                    } else {
                                        str5 = "Stories";
                                        user5 = X12;
                                        if (fileLocation7.volume_id != 0) {
                                        }
                                    }
                                } else if (r47Var.i3()) {
                                    r = r47Var.b;
                                    user5 = X12;
                                    j5 = j3;
                                    z10 = z15;
                                    str5 = "Stories";
                                } else {
                                    if (f11.a) {
                                        cc4.l("not found user to show dialog notification " + j3);
                                    }
                                    sharedPreferences = d;
                                    zh6Var7 = zh6Var2;
                                    arrayList4 = arrayList;
                                    j6 = j19;
                                    notification3 = notification2;
                                }
                                fileLocation7 = null;
                                if (j5 == 489001) {
                                    L02 = ob6.L0(2131753114);
                                } else if (j5 == 489000) {
                                    L02 = ob6.L0(2131743271);
                                } else if (lbc.A(j5)) {
                                    L02 = ob6.L0(2131745993);
                                } else if (j5 == j19) {
                                    L02 = ob6.L0(2131748281);
                                } else {
                                    fileLocation2 = fileLocation7;
                                    i10 = e1;
                                    gp7Var = gp7Var4;
                                    str6 = r;
                                    M0 = null;
                                    z12 = false;
                                    str4 = "showExtraNotifications: [";
                                    user3 = user5;
                                    z11 = false;
                                    i11 = (j5 > 489000L ? 1 : (j5 == 489000L ? 0 : -1));
                                    if (i11 == 0 || r47Var == null || r47Var.W0() == null) {
                                        user4 = user3;
                                        i12 = i11;
                                        fileLocation3 = fileLocation2;
                                    } else {
                                        Long W0 = r47Var.W0();
                                        user4 = user3;
                                        i12 = i11;
                                        long longValue = W0.longValue();
                                        if (wf3.D(longValue)) {
                                            TLRPC.UserProfilePhoto userProfilePhoto6 = ip7Var.getMessagesController().X1(W0).photo;
                                            if (userProfilePhoto6 == null || (fileLocation6 = userProfilePhoto6.photo_small) == null) {
                                                fileLocation4 = fileLocation2;
                                            } else {
                                                fileLocation4 = fileLocation2;
                                                if (fileLocation6.volume_id != 0 && fileLocation6.local_id != 0) {
                                                    fileLocation5 = fileLocation6;
                                                    fileLocation = fileLocation5;
                                                }
                                            }
                                            fileLocation5 = fileLocation4;
                                            fileLocation = fileLocation5;
                                        } else {
                                            fileLocation3 = fileLocation2;
                                            TLRPC.ChatPhoto chatPhoto2 = ip7Var.getMessagesController().M0(Long.valueOf(-longValue)).photo;
                                            if (chatPhoto2 != null) {
                                                fileLocation = chatPhoto2.photo_small;
                                                if (fileLocation != null) {
                                                    if (fileLocation.volume_id != 0) {
                                                    }
                                                }
                                            }
                                        }
                                        String str18 = str6;
                                        chat = M0;
                                        L0 = str18;
                                        user2 = user4;
                                        if (i12 == 0) {
                                            z10 = false;
                                        }
                                    }
                                    fileLocation = fileLocation3;
                                    String str182 = str6;
                                    chat = M0;
                                    L0 = str182;
                                    user2 = user4;
                                    if (i12 == 0) {
                                    }
                                }
                                i10 = e1;
                                str6 = L02;
                                gp7Var = gp7Var4;
                                z12 = false;
                                fileLocation2 = fileLocation7;
                                str4 = "showExtraNotifications: [";
                                user3 = user5;
                                M0 = null;
                                z11 = false;
                                i11 = (j5 > 489000L ? 1 : (j5 == 489000L ? 0 : -1));
                                if (i11 == 0) {
                                }
                                user4 = user3;
                                i12 = i11;
                                fileLocation3 = fileLocation2;
                                fileLocation = fileLocation3;
                                String str1822 = str6;
                                chat = M0;
                                L0 = str1822;
                                user2 = user4;
                                if (i12 == 0) {
                                }
                            } else {
                                j5 = j3;
                                z10 = z15;
                                str5 = "Stories";
                                M0 = ip7Var.getMessagesController().M0(Long.valueOf(-j5));
                                if (M0 != null) {
                                    boolean z16 = M0.megagroup;
                                    boolean z17 = xc2.T(M0) && !M0.megagroup;
                                    String s = ip7Var.s(M0);
                                    z11 = z16;
                                    TLRPC.ChatPhoto chatPhoto3 = M0.photo;
                                    if (chatPhoto3 == null || (fileLocation2 = chatPhoto3.photo_small) == null) {
                                        z12 = z17;
                                        gp7Var = gp7Var4;
                                    } else {
                                        z12 = z17;
                                        gp7Var = gp7Var4;
                                        if (fileLocation2.volume_id != 0) {
                                        }
                                    }
                                    fileLocation2 = null;
                                    if (j4 != 0) {
                                        str4 = "showExtraNotifications: [";
                                        i10 = e1;
                                        TLRPC.TL_forumTopic f = ip7Var.getMessagesController().h4.f(M0.id, j4);
                                        if (f != null) {
                                            s = qu6.o(f.title, " in ", s, new StringBuilder());
                                        }
                                    } else {
                                        str4 = "showExtraNotifications: [";
                                        i10 = e1;
                                    }
                                    if (z10) {
                                        z10 = xc2.q(M0);
                                    }
                                    str6 = s;
                                } else if (r47Var.i3()) {
                                    boolean z42 = r47Var.z4();
                                    str6 = r47Var.b;
                                    i10 = e1;
                                    z11 = z42;
                                    gp7Var = gp7Var4;
                                    z12 = r47Var.f;
                                    fileLocation2 = null;
                                    z10 = false;
                                    str4 = "showExtraNotifications: [";
                                } else {
                                    if (f11.a) {
                                        cc4.l("not found chat to show dialog notification " + j5);
                                    }
                                    sharedPreferences = d;
                                    zh6Var7 = zh6Var2;
                                    arrayList4 = arrayList;
                                    j6 = j19;
                                    notification3 = notification2;
                                }
                                user3 = null;
                                i11 = (j5 > 489000L ? 1 : (j5 == 489000L ? 0 : -1));
                                if (i11 == 0) {
                                }
                                user4 = user3;
                                i12 = i11;
                                fileLocation3 = fileLocation2;
                                fileLocation = fileLocation3;
                                String str18222 = str6;
                                chat = M0;
                                L0 = str18222;
                                user2 = user4;
                                if (i12 == 0) {
                                }
                            }
                        }
                        i26 = i8 + 1;
                        arrayList = arrayList4;
                        arrayList11 = arrayList14;
                        z5 = z9;
                        z6 = z8;
                        size = i6;
                        zh6Var10 = zh6Var5;
                        zh6Var11 = zh6Var6;
                        d = sharedPreferences;
                        e = j6;
                        b2 = notification3;
                        zh6Var2 = zh6Var7;
                    }
                    if (r47Var == null || !r47Var.J) {
                        i13 = 2131747748;
                    } else {
                        i13 = 2131747748;
                        if (!d.getBoolean("EnableReactionsPreview", true)) {
                            L0 = ob6.L0(2131747748);
                            fileLocation = null;
                            z10 = false;
                        }
                    }
                    if (z8) {
                        str7 = wf3.y(j5) ? ob6.L0(i13) : ob6.L0(2131747745);
                        fileLocation8 = null;
                        z10 = false;
                    } else {
                        TLRPC.FileLocation fileLocation14 = fileLocation;
                        str7 = L0;
                        fileLocation8 = fileLocation14;
                    }
                    if (fileLocation8 != null) {
                        ip7Var.getFileLoader().getClass();
                        i14 = 2131747745;
                        file = xb4.K(fileLocation8, true);
                        if (Build.VERSION.SDK_INT < 28) {
                            BitmapDrawable y = in5.z().y(fileLocation8);
                            if (y != null) {
                                bitmap5 = y.getBitmap();
                            } else {
                                try {
                                    if (file.exists()) {
                                        float L = 160.0f / hl.L(50.0f);
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inSampleSize = L < 1.0f ? 1 : (int) L;
                                        bitmap5 = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                    } else {
                                        bitmap5 = null;
                                    }
                                } catch (Throwable unused) {
                                }
                            }
                            bitmap = bitmap5;
                        }
                        bitmap = null;
                    } else {
                        i14 = 2131747745;
                        bitmap = null;
                        file = null;
                    }
                    if (chat != null) {
                        if (file == null || !file.exists() || (i25 = Build.VERSION.SDK_INT) < 28) {
                            str9 = str4;
                            iconCompat3 = null;
                        } else {
                            if (j5 == 489001) {
                                iconCompat3 = IconCompat.d(a.b, R.drawable.ic_launcher_dr);
                            } else {
                                if (i25 >= 28) {
                                    try {
                                        iconCompat3 = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new zo7()));
                                    } catch (Throwable unused2) {
                                    }
                                }
                                iconCompat3 = null;
                            }
                            str9 = str4;
                        }
                        long j21 = -chat.id;
                        sharedPreferences = d;
                        b78 b78Var = new b78();
                        b78Var.a = str7;
                        b78Var.b = iconCompat3;
                        str8 = str7;
                        b78Var.c = null;
                        b78Var.d = null;
                        b78Var.e = false;
                        b78Var.f = false;
                        zh6Var2.k(j21, b78Var);
                    } else {
                        sharedPreferences = d;
                        str8 = str7;
                        str9 = str4;
                    }
                    String str19 = "currentAccount";
                    if ((!z12 || z11) && z10 && !xea.B && j19 != j5 && !lbc.A(j5) && uc7.s1(ip7Var.currentAccount).M1(j5) <= 0) {
                        bitmap2 = bitmap;
                        Intent intent2 = new Intent(a.b, (Class<?>) WearReplyReceiver.class);
                        intent2.putExtra("dialog_id", j5);
                        int i34 = i10;
                        intent2.putExtra("max_id", i34);
                        intent2.putExtra("topic_id", j4);
                        intent2.putExtra("currentAccount", ip7Var.currentAccount);
                        if (arrayList3.isEmpty()) {
                            str10 = "max_id";
                            user6 = user2;
                            chat2 = chat;
                        } else {
                            ArrayList arrayList17 = new ArrayList();
                            user6 = user2;
                            chat2 = chat;
                            for (int i35 = 0; i35 < arrayList3.size(); i35++) {
                                r47 r47Var5 = (r47) arrayList3.get(i35);
                                if (r47Var5 != null && r47Var5.O4() && r47Var5.R2() && !r47Var5.N3()) {
                                    arrayList17.add(Integer.valueOf(r47Var5.e1()));
                                }
                            }
                            if (arrayList17.isEmpty()) {
                                str10 = "max_id";
                            } else {
                                int size4 = arrayList17.size();
                                int[] iArr = new int[size4];
                                str10 = "max_id";
                                for (int i36 = 0; i36 < size4; i36++) {
                                    iArr[i36] = ((Integer) arrayList17.get(i36)).intValue();
                                }
                                intent2.putExtra("voice_msg_ids", iArr);
                            }
                        }
                        PendingIntent broadcast = PendingIntent.getBroadcast(a.b, num2.intValue(), intent2, 167772160);
                        t99 t99Var = new t99(ob6.L0(2131745990), new Bundle(), new HashSet());
                        if (wf3.y(j5)) {
                            r4 = 1;
                            z13 = false;
                            Z = ob6.Z(2131745978, str8);
                        } else {
                            r4 = 1;
                            z13 = false;
                            Z = ob6.Z(2131745971, str8);
                        }
                        i15 = i34;
                        kn7 kn7Var = new kn7(R.drawable.ic_reply_icon, broadcast, Z);
                        kn7Var.d = r4;
                        kn7Var.g = r4;
                        kn7Var.a(t99Var);
                        kn7Var.h = z13;
                        b = kn7Var.b();
                    } else {
                        str10 = "max_id";
                        bitmap2 = bitmap;
                        user6 = user2;
                        i15 = i10;
                        chat2 = chat;
                        b = null;
                    }
                    Integer num4 = (Integer) ip7Var.f.f(j5);
                    if (num4 == null) {
                        num4 = 0;
                    }
                    gp7 gp7Var5 = gp7Var;
                    int size5 = gp7Var5.c ? ip7Var.E.size() : Math.max(num4.intValue(), arrayList3.size());
                    String format = (size5 <= 1 || Build.VERSION.SDK_INT >= 28) ? str8 : String.format("%1$s (%2$d)", str8, Integer.valueOf(size5));
                    b78 b78Var2 = (b78) zh6Var2.f(j19);
                    int i37 = Build.VERSION.SDK_INT;
                    if (i37 < 28 || b78Var2 != null) {
                        ln7Var = b;
                    } else {
                        ln7Var = b;
                        TLRPC.User X13 = ip7Var.getMessagesController().X1(Long.valueOf(j19));
                        if (X13 == null) {
                            X13 = ip7Var.getUserConfig().f();
                        }
                        if (X13 != null) {
                            try {
                                userProfilePhoto3 = X13.photo;
                            } catch (Throwable th) {
                                th = th;
                                j7 = j4;
                            }
                            if (userProfilePhoto3 != null && (fileLocation12 = userProfilePhoto3.photo_small) != null) {
                                j7 = j4;
                                try {
                                    if (fileLocation12.volume_id != 0 && fileLocation12.local_id != 0) {
                                        String L03 = ob6.L0(2131750464);
                                        xb4 fileLoader = ip7Var.getFileLoader();
                                        TLRPC.FileLocation fileLocation15 = X13.photo.photo_small;
                                        fileLoader.getClass();
                                        File K = xb4.K(fileLocation15, true);
                                        if (ip7Var.getUserConfig().e() == 489001) {
                                            iconCompat2 = IconCompat.d(a.b, R.drawable.ic_launcher_dr);
                                        } else {
                                            if (K != null && i37 >= 28) {
                                                try {
                                                    iconCompat2 = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(K), new zo7()));
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            iconCompat2 = null;
                                        }
                                        b78 b78Var3 = new b78();
                                        b78Var3.a = L03;
                                        b78Var3.b = iconCompat2;
                                        b78Var3.c = null;
                                        b78Var3.d = null;
                                        b78Var3.e = false;
                                        b78Var3.f = false;
                                        try {
                                            zh6Var2.k(j19, b78Var3);
                                            b78Var2 = b78Var3;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            b78Var2 = b78Var3;
                                            cc4.f(th);
                                            b78 b78Var4 = b78Var2;
                                            if (b78Var4 == null) {
                                            }
                                            i16 = Build.VERSION.SDK_INT;
                                            if (i16 >= 28) {
                                            }
                                            eo7Var.h = format;
                                            eo7Var.i = Boolean.valueOf(i16 >= 28 || (!z12 && wf3.y(j5)) || lbc.A(j5));
                                            StringBuilder sb4 = new StringBuilder();
                                            String[] strArr2 = new String[1];
                                            boolean[] zArr2 = new boolean[1];
                                            if (gp7Var5.c) {
                                            }
                                            ArrayList arrayList18 = arrayList3;
                                            r47Var3 = r47Var;
                                            long j22 = j5;
                                            Intent intent3 = new Intent(a.b, (Class<?>) LaunchActivity.class);
                                            intent3.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            intent3.setFlags(67108864);
                                            intent3.addCategory("android.intent.category.LAUNCHER");
                                            if (r47Var3 != null) {
                                            }
                                            i22 = i17;
                                            j12 = j22;
                                            if (gp7Var2.c) {
                                            }
                                            j13 = j8;
                                            ik8.q(j13, ik8.o(j12, "show extra notifications chatId ", " topicId "));
                                            if (j13 != 0) {
                                            }
                                            String str20 = str11;
                                            intent3.putExtra(str20, ip7Var.currentAccount);
                                            PendingIntent activity = PendingIntent.getActivity(a.b, 0, intent3, 1140850688);
                                            lyc lycVar = new lyc((byte) 10);
                                            ln7 ln7Var2 = ln7Var;
                                            if (ln7Var != null) {
                                            }
                                            int i38 = i22;
                                            Intent intent4 = new Intent(a.b, (Class<?>) AutoMessageHeardReceiver.class);
                                            intent4.addFlags(i7);
                                            intent4.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                            intent4.putExtra("dialog_id", j12);
                                            int i39 = i15;
                                            intent4.putExtra(str10, i39);
                                            intent4.putExtra(str20, ip7Var.currentAccount);
                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList19 = arrayList5;
                                            bitmap4 = bitmap3;
                                            kn7 kn7Var2 = new kn7(R.drawable.msg_markread, PendingIntent.getBroadcast(a.b, num2.intValue(), intent4, 167772160), ob6.L0(2131748435));
                                            kn7Var2.g = (byte) 2;
                                            kn7Var2.h = false;
                                            ln7 b3 = kn7Var2.b();
                                            if (wf3.B(j12)) {
                                            }
                                            if (str16 != null) {
                                            }
                                            eo7 eo7Var3 = eo7Var2;
                                            long j23 = j6;
                                            lycVar.e = qu6.n(j23, "tgaccount");
                                            j6 = j23;
                                            if (gp7Var2.c) {
                                            }
                                            wn7 wn7Var2 = new wn7(a.b);
                                            wn7Var2.e(str12);
                                            ArrayList arrayList20 = arrayList8;
                                            wn7Var2.F.icon = R.drawable.notification;
                                            wn7Var2.d(sb.toString());
                                            wn7Var2.f(16, true);
                                            wn7Var2.i = gp7Var2.c ? ip7Var.E.size() : arrayList20.size();
                                            wn7Var2.w = -15618822;
                                            wn7Var2.r = false;
                                            wn7Var2.F.when = j14;
                                            wn7Var2.k = true;
                                            wn7Var2.i(eo7Var3);
                                            wn7Var2.g = activity;
                                            lycVar.q(wn7Var2);
                                            wn7Var2.s = String.valueOf(Long.MAX_VALUE - j14);
                                            wn7Var2.f(8, (z3 && j12 == j && j13 == j2) ? false : true);
                                            wn7Var2.u = "msg";
                                            intent = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                            intent.putExtra("messageDate", i9);
                                            intent.putExtra("dialogId", j12);
                                            String str21 = str15;
                                            intent.putExtra(str21, ip7Var.currentAccount);
                                            if (gp7Var2.c) {
                                            }
                                            if (r47Var3 != null) {
                                            }
                                            wn7Var2.F.deleteIntent = PendingIntent.getBroadcast(a.b, num2.intValue(), intent, 167772160);
                                            if (z9) {
                                            }
                                            if (r47Var3 != null) {
                                            }
                                            keyboardInlineButton = null;
                                            tL_inlineButtonTypeCopy = null;
                                            if (keyboardInlineButton != null) {
                                            }
                                            j15 = gp7Var2.a;
                                            if (j15 != 489000) {
                                            }
                                            if (arrayList14.size() == 1) {
                                            }
                                            if (wf3.B(j12)) {
                                            }
                                            if (bitmap4 != null) {
                                            }
                                            if (!hl.n2(false)) {
                                            }
                                            if (chat2 == null) {
                                            }
                                            user7 = user6;
                                            boolean z18 = z9;
                                            Notification notification4 = notification2;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                            }
                                            cc4.b("showExtraNotifications: holders.add " + j12);
                                            notification3 = notification4;
                                            z9 = z18;
                                            zh6Var7 = zh6Var8;
                                            long j24 = j12;
                                            arrayList4 = arrayList;
                                            arrayList4.add(new fp7(ip7Var, num2.intValue(), j24, gp7Var2.c, str12, user7, chat2, wn7Var2, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                            ip7Var.h.k(j24, num2);
                                            i26 = i8 + 1;
                                            arrayList = arrayList4;
                                            arrayList11 = arrayList14;
                                            z5 = z9;
                                            z6 = z8;
                                            size = i6;
                                            zh6Var10 = zh6Var5;
                                            zh6Var11 = zh6Var6;
                                            d = sharedPreferences;
                                            e = j6;
                                            b2 = notification3;
                                            zh6Var2 = zh6Var7;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                b78 b78Var42 = b78Var2;
                                eo7Var = (b78Var42 == null && (r47Var != null || !(r47Var.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new eo7(b78Var42) : new eo7();
                                i16 = Build.VERSION.SDK_INT;
                                if (i16 >= 28 || ((wf3.y(j5) && !z12) || lbc.A(j5))) {
                                    eo7Var.h = format;
                                }
                                eo7Var.i = Boolean.valueOf(i16 >= 28 || (!z12 && wf3.y(j5)) || lbc.A(j5));
                                StringBuilder sb42 = new StringBuilder();
                                String[] strArr22 = new String[1];
                                boolean[] zArr22 = new boolean[1];
                                if (gp7Var5.c) {
                                    ArrayList arrayList21 = new ArrayList();
                                    ArrayList arrayList22 = new ArrayList();
                                    Pair I = ip7Var.I(arrayList21, arrayList22);
                                    int intValue = ((Integer) I.first).intValue();
                                    boolean booleanValue = ((Boolean) I.second).booleanValue();
                                    if (booleanValue) {
                                        arrayList10 = arrayList22;
                                        j6 = j19;
                                        z14 = booleanValue;
                                        sb42.append(ob6.G(intValue, "StoryNotificationHidden", new Object[0]));
                                    } else {
                                        j6 = j19;
                                        arrayList10 = arrayList22;
                                        z14 = booleanValue;
                                        if (arrayList21.isEmpty()) {
                                            cc4.b(str9 + j5 + "] continue; story but names is empty");
                                            zh6Var7 = zh6Var2;
                                            arrayList4 = arrayList;
                                            notification3 = notification2;
                                            i26 = i8 + 1;
                                            arrayList = arrayList4;
                                            arrayList11 = arrayList14;
                                            z5 = z9;
                                            z6 = z8;
                                            size = i6;
                                            zh6Var10 = zh6Var5;
                                            zh6Var11 = zh6Var6;
                                            d = sharedPreferences;
                                            e = j6;
                                            b2 = notification3;
                                            zh6Var2 = zh6Var7;
                                        } else if (arrayList21.size() == 1) {
                                            if (intValue == 1) {
                                                sb42.append(ob6.N0("StoryNotificationSingle"));
                                            } else {
                                                sb42.append(ob6.G(intValue, "StoryNotification1", arrayList21.get(0)));
                                            }
                                        } else if (arrayList21.size() == 2) {
                                            sb42.append(ob6.Z(2131744256, arrayList21.get(0), arrayList21.get(1)));
                                        } else if (arrayList21.size() == 3 && ip7Var.E.size() == 3) {
                                            sb42.append(ob6.Z(2131744255, e((String) arrayList21.get(0)), e((String) arrayList21.get(1)), e((String) arrayList21.get(2))));
                                        } else {
                                            sb42.append(ob6.G(ip7Var.E.size() - 2, "StoryNotification4", e((String) arrayList21.get(0)), e((String) arrayList21.get(1))));
                                        }
                                    }
                                    long j25 = Long.MAX_VALUE;
                                    for (int i40 = 0; i40 < ip7Var.E.size(); i40++) {
                                        j25 = Math.min(((hp7) ip7Var.E.get(i40)).e, j25);
                                    }
                                    eo7Var.i = Boolean.FALSE;
                                    if (arrayList21.size() != 1 || z14) {
                                        r8 = 0;
                                        G = ob6.G(intValue, str5, new Object[0]);
                                    } else {
                                        r8 = 0;
                                        G = (String) arrayList21.get(0);
                                    }
                                    b78 b78Var5 = new b78();
                                    b78Var5.a = G;
                                    b78Var5.b = null;
                                    b78Var5.c = null;
                                    b78Var5.d = null;
                                    b78Var5.e = r8;
                                    b78Var5.f = r8;
                                    do7 do7Var = new do7(sb42, j25, b78Var5);
                                    ArrayList arrayList23 = eo7Var.e;
                                    arrayList23.add(do7Var);
                                    if (arrayList23.size() > 25) {
                                        arrayList23.remove((int) r8);
                                    }
                                    bitmap3 = !z14 ? F(arrayList10) : null;
                                    sb = sb42;
                                    zh6Var8 = zh6Var2;
                                    j8 = j7;
                                    arrayList5 = null;
                                    gp7Var2 = gp7Var5;
                                    str11 = "currentAccount";
                                    i17 = 0;
                                    str12 = G;
                                } else {
                                    j6 = j19;
                                    String str22 = str9;
                                    int size6 = arrayList3.size() - 1;
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList24 = null;
                                    int i41 = 0;
                                    while (size6 >= 0) {
                                        int i42 = size6;
                                        r47 r47Var6 = (r47) arrayList3.get(size6);
                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList25 = arrayList24;
                                        ArrayList arrayList26 = arrayList3;
                                        r47 r47Var7 = r47Var;
                                        long a22 = r47.a2(ip7Var.currentAccount, r47Var6.k, ip7Var.getMessagesController().w2(r47Var6));
                                        if (j7 != a22) {
                                            StringBuilder o2 = ik8.o(j5, str22, "] continue; topic id is not equal: topicId=");
                                            o2.append(j7);
                                            o2.append(" messageTopicId=");
                                            o2.append(a22);
                                            o2.append("; selfId=");
                                            o2.append(ip7Var.getUserConfig().e());
                                            cc4.b(o2.toString());
                                            sb2 = sb42;
                                            str13 = str22;
                                            zh6Var9 = zh6Var2;
                                            strArr = strArr22;
                                            zArr = zArr22;
                                            j11 = j5;
                                            j10 = j7;
                                            gp7Var3 = gp7Var5;
                                            str14 = str19;
                                        } else {
                                            long j26 = j7;
                                            String q = ip7Var.q(r47Var6, strArr22, zArr22);
                                            int i43 = (j5 > 489001L ? 1 : (j5 == 489001L ? 0 : -1));
                                            if (i43 == 0) {
                                                strArr22[0] = ob6.L0(2131753114);
                                                i18 = i43;
                                                strArr = strArr22;
                                                zArr = zArr22;
                                            } else if (j5 != 489000 || r47Var6.W0() == null) {
                                                i18 = i43;
                                                strArr = strArr22;
                                                zArr = zArr22;
                                                if (j5 == j6) {
                                                    strArr[0] = str8;
                                                } else if (wf3.y(j5) && r47Var6.k.from_scheduled) {
                                                    strArr[0] = ob6.L0(2131747689);
                                                }
                                            } else {
                                                i18 = i43;
                                                strArr = strArr22;
                                                zArr = zArr22;
                                                strArr[0] = ip7Var.getMessagesController().z1(r47Var6.W0().longValue());
                                            }
                                            if (q == null) {
                                                if (f11.a) {
                                                    cc4.l("message text is null for " + r47Var6.e1() + " did = " + r47Var6.A0());
                                                }
                                                j10 = j26;
                                                sb2 = sb42;
                                                str13 = str22;
                                                str14 = str19;
                                                zh6Var9 = zh6Var2;
                                                j11 = j5;
                                                gp7Var3 = gp7Var5;
                                            } else {
                                                if (sb42.length() > 0) {
                                                    sb42.append("\n\n");
                                                }
                                                if (j5 != j6 && r47Var6.k.from_scheduled && wf3.D(j5)) {
                                                    q = String.format("%1$s: %2$s", ob6.L0(2131747689), q);
                                                    sb42.append(q);
                                                } else {
                                                    String str23 = strArr[0];
                                                    if (str23 != null) {
                                                        sb42.append(String.format("%1$s: %2$s", str23, q));
                                                    } else {
                                                        sb42.append(q);
                                                    }
                                                }
                                                String str24 = q;
                                                int i44 = (j5 > 489000L ? 1 : (j5 == 489000L ? 0 : -1));
                                                if (i44 != 0 || r47Var6.W0() == null) {
                                                    if (!wf3.D(j5)) {
                                                        if (z12) {
                                                            j9 = -j5;
                                                        } else if (wf3.y(j5)) {
                                                            j9 = r47Var6.R1();
                                                        }
                                                    }
                                                    j9 = j5;
                                                } else {
                                                    j9 = r47Var6.W0().longValue();
                                                }
                                                str13 = str22;
                                                str14 = str19;
                                                b78 b78Var6 = (b78) zh6Var2.f(j9 + (j26 << 16));
                                                String str25 = strArr[0];
                                                sb2 = sb42;
                                                if (str25 == null) {
                                                    if (!z8) {
                                                        j10 = j26;
                                                    } else if (!wf3.y(j5)) {
                                                        j10 = j26;
                                                        if (Build.VERSION.SDK_INT > 27) {
                                                            str25 = ob6.L0(i14);
                                                        }
                                                    } else if (z12) {
                                                        j10 = j26;
                                                        if (Build.VERSION.SDK_INT > 27) {
                                                            str25 = ob6.L0(i13);
                                                        }
                                                    } else {
                                                        j10 = j26;
                                                        str25 = ob6.L0(2131747747);
                                                    }
                                                    str25 = "";
                                                } else {
                                                    j10 = j26;
                                                }
                                                if (b78Var6 == null || !TextUtils.equals(b78Var6.a, str25)) {
                                                    if (!zArr[0] || wf3.B(j5) || (i19 = Build.VERSION.SDK_INT) < 28) {
                                                        j11 = j5;
                                                    } else {
                                                        if (wf3.D(j5) || z12) {
                                                            i20 = i44;
                                                            i21 = i19;
                                                            j11 = j5;
                                                            file2 = file;
                                                        } else {
                                                            long R1 = r47Var6.R1();
                                                            i20 = i44;
                                                            i21 = i19;
                                                            TLRPC.User X14 = ip7Var.getMessagesController().X1(Long.valueOf(R1));
                                                            if (X14 == null && (X14 = ip7Var.getMessagesStorage().j0(R1)) != null) {
                                                                ip7Var.getMessagesController().i4(X14, true, false);
                                                            }
                                                            if (X14 == null || (userProfilePhoto2 = X14.photo) == null || (fileLocation11 = userProfilePhoto2.photo_small) == null) {
                                                                j11 = j5;
                                                            } else {
                                                                j11 = j5;
                                                                if (fileLocation11.volume_id != 0 && fileLocation11.local_id != 0) {
                                                                    xb4 fileLoader2 = ip7Var.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation16 = X14.photo.photo_small;
                                                                    fileLoader2.getClass();
                                                                    file2 = xb4.K(fileLocation16, true);
                                                                }
                                                            }
                                                            file2 = null;
                                                        }
                                                        if (file2 == null && i20 == 0 && r47Var6.W0() != null) {
                                                            if (j9 >= 0) {
                                                                TLRPC.User X15 = ip7Var.getMessagesController().X1(Long.valueOf(j9));
                                                                if (X15 != null && (userProfilePhoto = X15.photo) != null && (fileLocation10 = userProfilePhoto.photo_small) != null && fileLocation10.volume_id != 0 && fileLocation10.local_id != 0) {
                                                                    xb4 fileLoader3 = ip7Var.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation17 = X15.photo.photo_small;
                                                                    fileLoader3.getClass();
                                                                    file2 = xb4.K(fileLocation17, true);
                                                                }
                                                            } else {
                                                                TLRPC.Chat M02 = ip7Var.getMessagesController().M0(Long.valueOf(-j9));
                                                                if (M02 != null && (chatPhoto = M02.photo) != null && (fileLocation9 = chatPhoto.photo_small) != null && fileLocation9.volume_id != 0 && fileLocation9.local_id != 0) {
                                                                    xb4 fileLoader4 = ip7Var.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation18 = M02.photo.photo_small;
                                                                    fileLoader4.getClass();
                                                                    file2 = xb4.K(fileLocation18, true);
                                                                }
                                                            }
                                                        }
                                                        if (i18 == 0) {
                                                            iconCompat = IconCompat.d(a.b, R.drawable.ic_launcher_dr);
                                                        } else if (file2 != null && i21 >= 28) {
                                                            try {
                                                                iconCompat = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file2), new zo7()));
                                                            } catch (Throwable unused4) {
                                                            }
                                                        }
                                                        b78Var6 = new b78();
                                                        b78Var6.a = str25;
                                                        b78Var6.b = iconCompat;
                                                        b78Var6.c = null;
                                                        b78Var6.d = null;
                                                        c = 0;
                                                        b78Var6.e = false;
                                                        b78Var6.f = false;
                                                        zh6Var2.k(j9, b78Var6);
                                                    }
                                                    iconCompat = null;
                                                    b78Var6 = new b78();
                                                    b78Var6.a = str25;
                                                    b78Var6.b = iconCompat;
                                                    b78Var6.c = null;
                                                    b78Var6.d = null;
                                                    c = 0;
                                                    b78Var6.e = false;
                                                    b78Var6.f = false;
                                                    zh6Var2.k(j9, b78Var6);
                                                } else {
                                                    j11 = j5;
                                                    c = 0;
                                                }
                                                if (wf3.B(j11)) {
                                                    r47Var2 = r47Var6;
                                                    zh6Var9 = zh6Var2;
                                                    gp7Var3 = gp7Var5;
                                                    do7 do7Var2 = new do7(str24, r47Var2.k.date * 1000, b78Var6);
                                                    ArrayList arrayList27 = eo7Var.e;
                                                    arrayList27.add(do7Var2);
                                                    if (arrayList27.size() > 25) {
                                                        arrayList27.remove(0);
                                                    }
                                                } else {
                                                    if (!zArr[c] || Build.VERSION.SDK_INT < 28 || ((ActivityManager) a.b.getSystemService("activity")).isLowRamDevice() || z8 || r47Var6.k4() || !(r47Var6.D == 1 || r47Var6.s4())) {
                                                        r47Var2 = r47Var6;
                                                        zh6Var9 = zh6Var2;
                                                        gp7Var3 = gp7Var5;
                                                    } else {
                                                        xb4 fileLoader5 = ip7Var.getFileLoader();
                                                        TLRPC.Message message2 = r47Var6.k;
                                                        fileLoader5.getClass();
                                                        File L2 = xb4.L(message2);
                                                        if (L2.exists() && r47Var6.t2()) {
                                                            file4 = new File(L2.getParentFile(), L2.getName() + ".blur.jpg");
                                                            if (file4.exists()) {
                                                                zh6Var9 = zh6Var2;
                                                                file5 = L2;
                                                            } else {
                                                                try {
                                                                    Bitmap decodeFile = BitmapFactory.decodeFile(L2.getAbsolutePath());
                                                                    Bitmap C = Utilities.C(decodeFile);
                                                                    decodeFile.recycle();
                                                                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(C, decodeFile.getWidth(), decodeFile.getHeight(), true);
                                                                    Utilities.stackBlurBitmap(createScaledBitmap, 5);
                                                                    C.recycle();
                                                                    Canvas canvas = new Canvas(createScaledBitmap);
                                                                    zh6Var9 = zh6Var2;
                                                                    try {
                                                                        ip7Var.g0.h(vm2.o(-1, 82));
                                                                        file5 = L2;
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        file5 = L2;
                                                                        cc4.f(e);
                                                                        file3 = file5;
                                                                        gp7Var3 = gp7Var5;
                                                                        r47Var2 = r47Var6;
                                                                        do7 do7Var3 = new do7(str24, r47Var6.k.date * 1000, b78Var6);
                                                                        String str26 = r47Var2.s4() ? "image/webp" : "image/jpeg";
                                                                        if (file3.exists()) {
                                                                        }
                                                                        if (c3 != null) {
                                                                        }
                                                                        do7 do7Var4 = new do7(str24, r47Var2.k.date * 1000, b78Var6);
                                                                        arrayList6 = eo7Var.e;
                                                                        arrayList6.add(do7Var4);
                                                                        if (arrayList6.size() > 25) {
                                                                        }
                                                                        c2 = 0;
                                                                        if (zArr[c2]) {
                                                                        }
                                                                        if (j11 == 777000) {
                                                                        }
                                                                        arrayList24 = arrayList25;
                                                                        size6 = i42 - 1;
                                                                        gp7Var5 = gp7Var3;
                                                                        str19 = str14;
                                                                        arrayList3 = arrayList26;
                                                                        r47Var = r47Var7;
                                                                        str22 = str13;
                                                                        strArr22 = strArr;
                                                                        zArr22 = zArr;
                                                                        sb42 = sb2;
                                                                        j7 = j10;
                                                                        zh6Var2 = zh6Var9;
                                                                        j5 = j11;
                                                                    }
                                                                    try {
                                                                        ip7Var.g0.setBounds(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                                                                        ip7Var.g0.draw(canvas);
                                                                        FileOutputStream fileOutputStream = new FileOutputStream(file4);
                                                                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                                                        fileOutputStream.close();
                                                                        createScaledBitmap.recycle();
                                                                        file3 = file4;
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        cc4.f(e);
                                                                        file3 = file5;
                                                                        gp7Var3 = gp7Var5;
                                                                        r47Var2 = r47Var6;
                                                                        do7 do7Var32 = new do7(str24, r47Var6.k.date * 1000, b78Var6);
                                                                        String str262 = r47Var2.s4() ? "image/webp" : "image/jpeg";
                                                                        if (file3.exists()) {
                                                                        }
                                                                        if (c3 != null) {
                                                                        }
                                                                        do7 do7Var42 = new do7(str24, r47Var2.k.date * 1000, b78Var6);
                                                                        arrayList6 = eo7Var.e;
                                                                        arrayList6.add(do7Var42);
                                                                        if (arrayList6.size() > 25) {
                                                                        }
                                                                        c2 = 0;
                                                                        if (zArr[c2]) {
                                                                        }
                                                                        if (j11 == 777000) {
                                                                        }
                                                                        arrayList24 = arrayList25;
                                                                        size6 = i42 - 1;
                                                                        gp7Var5 = gp7Var3;
                                                                        str19 = str14;
                                                                        arrayList3 = arrayList26;
                                                                        r47Var = r47Var7;
                                                                        str22 = str13;
                                                                        strArr22 = strArr;
                                                                        zArr22 = zArr;
                                                                        sb42 = sb2;
                                                                        j7 = j10;
                                                                        zh6Var2 = zh6Var9;
                                                                        j5 = j11;
                                                                    }
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    zh6Var9 = zh6Var2;
                                                                }
                                                            }
                                                            file3 = file5;
                                                        } else {
                                                            zh6Var9 = zh6Var2;
                                                            file3 = L2;
                                                            file4 = null;
                                                        }
                                                        gp7Var3 = gp7Var5;
                                                        r47Var2 = r47Var6;
                                                        do7 do7Var322 = new do7(str24, r47Var6.k.date * 1000, b78Var6);
                                                        String str2622 = r47Var2.s4() ? "image/webp" : "image/jpeg";
                                                        if (file3.exists()) {
                                                            try {
                                                                Context context = a.b;
                                                                StringBuilder sb5 = new StringBuilder();
                                                                a.d();
                                                                sb5.append("org.telegram.messenger.beta");
                                                                sb5.append(".provider");
                                                                c3 = FileProvider.c(context, sb5.toString(), file3);
                                                            } catch (Exception e5) {
                                                                cc4.f(e5);
                                                            }
                                                        } else {
                                                            if (ip7Var.getFileLoader().S(file3.getName())) {
                                                                Uri.Builder scheme = new Uri.Builder().scheme("content");
                                                                String str27 = NotificationImageProvider.d;
                                                                if (str27 == null) {
                                                                    a.d();
                                                                    str27 = "org.telegram.messenger.beta.notification_image_provider";
                                                                    NotificationImageProvider.d = "org.telegram.messenger.beta.notification_image_provider";
                                                                }
                                                                c3 = scheme.authority(str27).appendPath("msg_media_raw").appendPath(ip7Var.currentAccount + "").appendPath(file3.getName()).appendQueryParameter("final_path", file3.getAbsolutePath()).build();
                                                            }
                                                            c3 = null;
                                                        }
                                                        if (c3 != null) {
                                                            do7Var322.e = str2622;
                                                            do7Var322.f = c3;
                                                            ArrayList arrayList28 = eo7Var.e;
                                                            arrayList28.add(do7Var322);
                                                            if (arrayList28.size() > 25) {
                                                                arrayList28.remove(0);
                                                            }
                                                            a.b.grantUriPermission("com.android.systemui", c3, 1);
                                                            hl.d3(new ql7(c3, file4, (byte) 5), 20000L);
                                                            if (!TextUtils.isEmpty(r47Var2.z)) {
                                                                do7 do7Var5 = new do7(r47Var2.z, r47Var2.k.date * 1000, b78Var6);
                                                                ArrayList arrayList29 = eo7Var.e;
                                                                arrayList29.add(do7Var5);
                                                                if (arrayList29.size() > 25) {
                                                                    arrayList29.remove(0);
                                                                }
                                                            }
                                                            c2 = 0;
                                                            if (zArr[c2] && !z8 && r47Var2.O4()) {
                                                                arrayList7 = eo7Var.e;
                                                                if (!arrayList7.isEmpty()) {
                                                                    xb4 fileLoader6 = ip7Var.getFileLoader();
                                                                    TLRPC.Message message3 = r47Var2.k;
                                                                    fileLoader6.getClass();
                                                                    File L3 = xb4.L(message3);
                                                                    if (L3.exists()) {
                                                                        if (Build.VERSION.SDK_INT >= 24) {
                                                                            try {
                                                                                Context context2 = a.b;
                                                                                StringBuilder sb6 = new StringBuilder();
                                                                                a.d();
                                                                                sb6.append("org.telegram.messenger.beta");
                                                                                sb6.append(".provider");
                                                                                uri2 = FileProvider.c(context2, sb6.toString(), L3);
                                                                            } catch (Exception unused5) {
                                                                                uri2 = null;
                                                                            }
                                                                        } else {
                                                                            uri2 = Uri.fromFile(L3);
                                                                        }
                                                                        if (uri2 != null) {
                                                                            do7 do7Var6 = (do7) c00.g(1, arrayList7);
                                                                            do7Var6.e = "audio/ogg";
                                                                            do7Var6.f = uri2;
                                                                        }
                                                                    } else if (r47Var2.F0() != null) {
                                                                        String s2 = xb4.s(r47Var2.F0());
                                                                        if (!ip7Var.s.contains(s2)) {
                                                                            ip7Var.s.add(s2);
                                                                            ip7Var.getFileLoader().X(r47Var2.F0(), r47Var2, 3, 0);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    do7 do7Var422 = new do7(str24, r47Var2.k.date * 1000, b78Var6);
                                                    arrayList6 = eo7Var.e;
                                                    arrayList6.add(do7Var422);
                                                    if (arrayList6.size() > 25) {
                                                        c2 = 0;
                                                        arrayList6.remove(0);
                                                        if (zArr[c2]) {
                                                            arrayList7 = eo7Var.e;
                                                            if (!arrayList7.isEmpty()) {
                                                            }
                                                        }
                                                    }
                                                    c2 = 0;
                                                    if (zArr[c2]) {
                                                    }
                                                }
                                                if (j11 == 777000) {
                                                    TLRPC.ReplyMarkup replyMarkup2 = r47Var2.k.reply_markup;
                                                    if (replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) {
                                                        arrayList24 = ((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows;
                                                        i41 = r47Var2.e1();
                                                        size6 = i42 - 1;
                                                        gp7Var5 = gp7Var3;
                                                        str19 = str14;
                                                        arrayList3 = arrayList26;
                                                        r47Var = r47Var7;
                                                        str22 = str13;
                                                        strArr22 = strArr;
                                                        zArr22 = zArr;
                                                        sb42 = sb2;
                                                        j7 = j10;
                                                        zh6Var2 = zh6Var9;
                                                        j5 = j11;
                                                    }
                                                }
                                            }
                                        }
                                        arrayList24 = arrayList25;
                                        size6 = i42 - 1;
                                        gp7Var5 = gp7Var3;
                                        str19 = str14;
                                        arrayList3 = arrayList26;
                                        r47Var = r47Var7;
                                        str22 = str13;
                                        strArr22 = strArr;
                                        zArr22 = zArr;
                                        sb42 = sb2;
                                        j7 = j10;
                                        zh6Var2 = zh6Var9;
                                        j5 = j11;
                                    }
                                    sb = sb42;
                                    zh6Var8 = zh6Var2;
                                    j8 = j7;
                                    gp7Var2 = gp7Var5;
                                    str11 = str19;
                                    i17 = i41;
                                    bitmap3 = bitmap2;
                                    str12 = str8;
                                    arrayList5 = arrayList24;
                                }
                                ArrayList arrayList182 = arrayList3;
                                r47Var3 = r47Var;
                                long j222 = j5;
                                Intent intent32 = new Intent(a.b, (Class<?>) LaunchActivity.class);
                                intent32.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent32.setFlags(67108864);
                                intent32.addCategory("android.intent.category.LAUNCHER");
                                if (r47Var3 != null) {
                                    if (r47Var3.O) {
                                        intent32.putExtra("oauth_url", r47Var3.b);
                                    } else if (r47Var3.J) {
                                        intent32.putExtra("storyId", Math.abs(r47Var3.e1()));
                                    } else if (r47Var3.N) {
                                        i22 = i17;
                                        j12 = j222;
                                        if (j222 < 0) {
                                            intent32.putExtra("chatId", -j12);
                                        } else if (j222 > 0) {
                                            intent32.putExtra("userId", j12);
                                        }
                                        intent32.putExtra("storyId", Math.abs(r47Var3.e1()));
                                        j13 = j8;
                                        ik8.q(j13, ik8.o(j12, "show extra notifications chatId ", " topicId "));
                                        if (j13 != 0) {
                                            intent32.putExtra("topicId", j13);
                                        }
                                        String str202 = str11;
                                        intent32.putExtra(str202, ip7Var.currentAccount);
                                        PendingIntent activity2 = PendingIntent.getActivity(a.b, 0, intent32, 1140850688);
                                        lyc lycVar2 = new lyc((byte) 10);
                                        ln7 ln7Var22 = ln7Var;
                                        if (ln7Var != null) {
                                            lycVar2.a(ln7Var22);
                                        }
                                        int i382 = i22;
                                        Intent intent42 = new Intent(a.b, (Class<?>) AutoMessageHeardReceiver.class);
                                        intent42.addFlags(i7);
                                        intent42.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                        intent42.putExtra("dialog_id", j12);
                                        int i392 = i15;
                                        intent42.putExtra(str10, i392);
                                        intent42.putExtra(str202, ip7Var.currentAccount);
                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList192 = arrayList5;
                                        bitmap4 = bitmap3;
                                        kn7 kn7Var22 = new kn7(R.drawable.msg_markread, PendingIntent.getBroadcast(a.b, num2.intValue(), intent42, 167772160), ob6.L0(2131748435));
                                        kn7Var22.g = (byte) 2;
                                        kn7Var22.h = false;
                                        ln7 b32 = kn7Var22.b();
                                        if (wf3.B(j12)) {
                                            str15 = str202;
                                            eo7Var2 = eo7Var;
                                            str16 = j12 != o0 ? "tgenc" + wf3.h(j12) + "_" + i392 : null;
                                        } else if (wf3.D(j12)) {
                                            str15 = str202;
                                            eo7Var2 = eo7Var;
                                            str16 = "tguser" + j12 + "_" + i392;
                                        } else {
                                            StringBuilder sb7 = new StringBuilder("tgchat");
                                            str15 = str202;
                                            eo7Var2 = eo7Var;
                                            sb7.append(-j12);
                                            sb7.append("_");
                                            sb7.append(i392);
                                            str16 = sb7.toString();
                                        }
                                        if (str16 != null) {
                                            lycVar2.d = str16;
                                            lyc lycVar3 = new lyc((byte) 10);
                                            lycVar3.d = "summary_".concat(str16);
                                            lycVar3.q(wn7Var);
                                        }
                                        eo7 eo7Var32 = eo7Var2;
                                        long j232 = j6;
                                        lycVar2.e = qu6.n(j232, "tgaccount");
                                        j6 = j232;
                                        if (gp7Var2.c) {
                                            j14 = Long.MAX_VALUE;
                                            for (int i45 = 0; i45 < ip7Var.E.size(); i45++) {
                                                j14 = Math.min(((hp7) ip7Var.E.get(i45)).e, j14);
                                            }
                                            arrayList8 = arrayList182;
                                        } else {
                                            arrayList8 = arrayList182;
                                            j14 = ((r47) arrayList8.get(0)).k.date * 1000;
                                        }
                                        wn7 wn7Var22 = new wn7(a.b);
                                        wn7Var22.e(str12);
                                        ArrayList arrayList202 = arrayList8;
                                        wn7Var22.F.icon = R.drawable.notification;
                                        wn7Var22.d(sb.toString());
                                        wn7Var22.f(16, true);
                                        wn7Var22.i = gp7Var2.c ? ip7Var.E.size() : arrayList202.size();
                                        wn7Var22.w = -15618822;
                                        wn7Var22.r = false;
                                        wn7Var22.F.when = j14;
                                        wn7Var22.k = true;
                                        wn7Var22.i(eo7Var32);
                                        wn7Var22.g = activity2;
                                        lycVar2.q(wn7Var22);
                                        wn7Var22.s = String.valueOf(Long.MAX_VALUE - j14);
                                        wn7Var22.f(8, (z3 && j12 == j && j13 == j2) ? false : true);
                                        wn7Var22.u = "msg";
                                        intent = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                        intent.putExtra("messageDate", i9);
                                        intent.putExtra("dialogId", j12);
                                        String str212 = str15;
                                        intent.putExtra(str212, ip7Var.currentAccount);
                                        if (gp7Var2.c) {
                                            intent.putExtra("story", true);
                                        }
                                        if (r47Var3 != null && r47Var3.J) {
                                            intent.putExtra("storyReaction", true);
                                        }
                                        wn7Var22.F.deleteIntent = PendingIntent.getBroadcast(a.b, num2.intValue(), intent, 167772160);
                                        if (z9) {
                                            wn7Var22.q = ip7Var.f0;
                                            wn7Var22.C = true;
                                        }
                                        if (r47Var3 != null && (message = r47Var3.k) != null) {
                                            replyMarkup = message.reply_markup;
                                            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                                                tL_inlineButtonTypeCopy = null;
                                                TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = null;
                                                for (int i46 = 0; i46 < tL_replyInlineMarkup.rows.size(); i46++) {
                                                    int i47 = 0;
                                                    while (true) {
                                                        if (i47 >= tL_replyInlineMarkup.rows.get(i46).buttons.size()) {
                                                            break;
                                                        }
                                                        TL_keyboard.KeyboardInlineButton keyboardInlineButton3 = tL_replyInlineMarkup.rows.get(i46).buttons.get(i47);
                                                        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy2 = (TL_keyboard.TL_inlineButtonTypeCopy) ehb.a(keyboardInlineButton3, TL_keyboard.TL_inlineButtonTypeCopy.class);
                                                        if (tL_inlineButtonTypeCopy2 != null) {
                                                            keyboardInlineButton2 = keyboardInlineButton3;
                                                            tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                                                            break;
                                                        } else {
                                                            i47++;
                                                            tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                                                        }
                                                    }
                                                    if (keyboardInlineButton2 != null) {
                                                        break;
                                                    }
                                                }
                                                keyboardInlineButton = keyboardInlineButton2;
                                                if (keyboardInlineButton != null) {
                                                    Intent intent5 = new Intent(a.b, (Class<?>) CopyCodeReceiver.class);
                                                    intent5.addFlags(32);
                                                    intent5.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                                                    intent5.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                                                    kn7 kn7Var3 = new kn7(R.drawable.msg_copy, PendingIntent.getBroadcast(a.b, num2.intValue(), intent5, 167772160), keyboardInlineButton.text);
                                                    kn7Var3.h = false;
                                                    wn7Var22.b.add(kn7Var3.b());
                                                }
                                                j15 = gp7Var2.a;
                                                if (j15 != 489000 && j15 != 489001) {
                                                    if (ln7Var22 != null) {
                                                        wn7Var22.b.add(ln7Var22);
                                                    }
                                                    if (!z8 && !gp7Var2.c && (r47Var3 == null || !r47Var3.J)) {
                                                        wn7Var22.b.add(b32);
                                                    }
                                                }
                                                if (arrayList14.size() == 1 && !TextUtils.isEmpty(str) && !gp7Var2.c) {
                                                    wn7Var22.j(str);
                                                }
                                                if (wf3.B(j12)) {
                                                    wn7Var22.t = true;
                                                }
                                                if (bitmap4 != null) {
                                                    wn7Var22.g(bitmap4);
                                                }
                                                if (!hl.n2(false) && !xea.B && arrayList192 != null) {
                                                    size3 = arrayList192.size();
                                                    i23 = 0;
                                                    while (i23 < size3) {
                                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList30 = arrayList192;
                                                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList30.get(i23);
                                                        int size7 = keyboardInlineButtonRow.buttons.size();
                                                        int i48 = 0;
                                                        while (i48 < size7) {
                                                            TL_keyboard.KeyboardInlineButton keyboardInlineButton4 = keyboardInlineButtonRow.buttons.get(i48);
                                                            TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) ehb.a(keyboardInlineButton4, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                            int i49 = size3;
                                                            if (tL_inlineButtonTypeCallback != null) {
                                                                arrayList9 = arrayList30;
                                                                Intent intent6 = new Intent(a.b, (Class<?>) NotificationCallbackReceiver.class);
                                                                intent6.putExtra(str212, ip7Var.currentAccount);
                                                                intent6.putExtra("did", j12);
                                                                byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                if (bArr != null) {
                                                                    intent6.putExtra("data", bArr);
                                                                }
                                                                i24 = i382;
                                                                intent6.putExtra("mid", i24);
                                                                String str28 = keyboardInlineButton4.text;
                                                                Context context3 = a.b;
                                                                int i50 = ip7Var.I;
                                                                str17 = str212;
                                                                ip7Var.I = i50 + 1;
                                                                wn7Var22.a(0, PendingIntent.getBroadcast(context3, i50, intent6, 167772160), str28);
                                                            } else {
                                                                str17 = str212;
                                                                arrayList9 = arrayList30;
                                                                i24 = i382;
                                                            }
                                                            i48++;
                                                            i382 = i24;
                                                            size3 = i49;
                                                            arrayList30 = arrayList9;
                                                            str212 = str17;
                                                        }
                                                        arrayList192 = arrayList30;
                                                        i23++;
                                                        str212 = str212;
                                                    }
                                                }
                                                if (chat2 == null || user6 == null) {
                                                    user7 = user6;
                                                } else {
                                                    user7 = user6;
                                                    String str29 = user7.phone;
                                                    if (str29 != null && str29.length() > 0) {
                                                        String str30 = "tel:+" + user7.phone;
                                                        if (!str30.isEmpty()) {
                                                            wn7Var22.G.add(str30);
                                                        }
                                                    }
                                                }
                                                boolean z182 = z9;
                                                Notification notification42 = notification2;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                    W(notification42, wn7Var22, z182);
                                                }
                                                cc4.b("showExtraNotifications: holders.add " + j12);
                                                notification3 = notification42;
                                                z9 = z182;
                                                zh6Var7 = zh6Var8;
                                                long j242 = j12;
                                                arrayList4 = arrayList;
                                                arrayList4.add(new fp7(ip7Var, num2.intValue(), j242, gp7Var2.c, str12, user7, chat2, wn7Var22, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                                ip7Var.h.k(j242, num2);
                                                i26 = i8 + 1;
                                                arrayList = arrayList4;
                                                arrayList11 = arrayList14;
                                                z5 = z9;
                                                z6 = z8;
                                                size = i6;
                                                zh6Var10 = zh6Var5;
                                                zh6Var11 = zh6Var6;
                                                d = sharedPreferences;
                                                e = j6;
                                                b2 = notification3;
                                                zh6Var2 = zh6Var7;
                                            }
                                        }
                                        keyboardInlineButton = null;
                                        tL_inlineButtonTypeCopy = null;
                                        if (keyboardInlineButton != null) {
                                        }
                                        j15 = gp7Var2.a;
                                        if (j15 != 489000) {
                                            if (ln7Var22 != null) {
                                            }
                                            if (!z8) {
                                                wn7Var22.b.add(b32);
                                            }
                                        }
                                        if (arrayList14.size() == 1) {
                                            wn7Var22.j(str);
                                        }
                                        if (wf3.B(j12)) {
                                        }
                                        if (bitmap4 != null) {
                                        }
                                        if (!hl.n2(false)) {
                                            size3 = arrayList192.size();
                                            i23 = 0;
                                            while (i23 < size3) {
                                            }
                                        }
                                        if (chat2 == null) {
                                        }
                                        user7 = user6;
                                        boolean z1822 = z9;
                                        Notification notification422 = notification2;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                        }
                                        cc4.b("showExtraNotifications: holders.add " + j12);
                                        notification3 = notification422;
                                        z9 = z1822;
                                        zh6Var7 = zh6Var8;
                                        long j2422 = j12;
                                        arrayList4 = arrayList;
                                        arrayList4.add(new fp7(ip7Var, num2.intValue(), j2422, gp7Var2.c, str12, user7, chat2, wn7Var22, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                        ip7Var.h.k(j2422, num2);
                                        i26 = i8 + 1;
                                        arrayList = arrayList4;
                                        arrayList11 = arrayList14;
                                        z5 = z9;
                                        z6 = z8;
                                        size = i6;
                                        zh6Var10 = zh6Var5;
                                        zh6Var11 = zh6Var6;
                                        d = sharedPreferences;
                                        e = j6;
                                        b2 = notification3;
                                        zh6Var2 = zh6Var7;
                                    }
                                    i22 = i17;
                                    j12 = j222;
                                    j13 = j8;
                                    ik8.q(j13, ik8.o(j12, "show extra notifications chatId ", " topicId "));
                                    if (j13 != 0) {
                                    }
                                    String str2022 = str11;
                                    intent32.putExtra(str2022, ip7Var.currentAccount);
                                    PendingIntent activity22 = PendingIntent.getActivity(a.b, 0, intent32, 1140850688);
                                    lyc lycVar22 = new lyc((byte) 10);
                                    ln7 ln7Var222 = ln7Var;
                                    if (ln7Var != null) {
                                    }
                                    int i3822 = i22;
                                    Intent intent422 = new Intent(a.b, (Class<?>) AutoMessageHeardReceiver.class);
                                    intent422.addFlags(i7);
                                    intent422.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                    intent422.putExtra("dialog_id", j12);
                                    int i3922 = i15;
                                    intent422.putExtra(str10, i3922);
                                    intent422.putExtra(str2022, ip7Var.currentAccount);
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList1922 = arrayList5;
                                    bitmap4 = bitmap3;
                                    kn7 kn7Var222 = new kn7(R.drawable.msg_markread, PendingIntent.getBroadcast(a.b, num2.intValue(), intent422, 167772160), ob6.L0(2131748435));
                                    kn7Var222.g = (byte) 2;
                                    kn7Var222.h = false;
                                    ln7 b322 = kn7Var222.b();
                                    if (wf3.B(j12)) {
                                    }
                                    if (str16 != null) {
                                    }
                                    eo7 eo7Var322 = eo7Var2;
                                    long j2322 = j6;
                                    lycVar22.e = qu6.n(j2322, "tgaccount");
                                    j6 = j2322;
                                    if (gp7Var2.c) {
                                    }
                                    wn7 wn7Var222 = new wn7(a.b);
                                    wn7Var222.e(str12);
                                    ArrayList arrayList2022 = arrayList8;
                                    wn7Var222.F.icon = R.drawable.notification;
                                    wn7Var222.d(sb.toString());
                                    wn7Var222.f(16, true);
                                    wn7Var222.i = gp7Var2.c ? ip7Var.E.size() : arrayList2022.size();
                                    wn7Var222.w = -15618822;
                                    wn7Var222.r = false;
                                    wn7Var222.F.when = j14;
                                    wn7Var222.k = true;
                                    wn7Var222.i(eo7Var322);
                                    wn7Var222.g = activity22;
                                    lycVar22.q(wn7Var222);
                                    wn7Var222.s = String.valueOf(Long.MAX_VALUE - j14);
                                    wn7Var222.f(8, (z3 && j12 == j && j13 == j2) ? false : true);
                                    wn7Var222.u = "msg";
                                    intent = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                    intent.putExtra("messageDate", i9);
                                    intent.putExtra("dialogId", j12);
                                    String str2122 = str15;
                                    intent.putExtra(str2122, ip7Var.currentAccount);
                                    if (gp7Var2.c) {
                                    }
                                    if (r47Var3 != null) {
                                        intent.putExtra("storyReaction", true);
                                    }
                                    wn7Var222.F.deleteIntent = PendingIntent.getBroadcast(a.b, num2.intValue(), intent, 167772160);
                                    if (z9) {
                                    }
                                    if (r47Var3 != null) {
                                        replyMarkup = message.reply_markup;
                                        if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                        }
                                    }
                                    keyboardInlineButton = null;
                                    tL_inlineButtonTypeCopy = null;
                                    if (keyboardInlineButton != null) {
                                    }
                                    j15 = gp7Var2.a;
                                    if (j15 != 489000) {
                                    }
                                    if (arrayList14.size() == 1) {
                                    }
                                    if (wf3.B(j12)) {
                                    }
                                    if (bitmap4 != null) {
                                    }
                                    if (!hl.n2(false)) {
                                    }
                                    if (chat2 == null) {
                                    }
                                    user7 = user6;
                                    boolean z18222 = z9;
                                    Notification notification4222 = notification2;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                    }
                                    cc4.b("showExtraNotifications: holders.add " + j12);
                                    notification3 = notification4222;
                                    z9 = z18222;
                                    zh6Var7 = zh6Var8;
                                    long j24222 = j12;
                                    arrayList4 = arrayList;
                                    arrayList4.add(new fp7(ip7Var, num2.intValue(), j24222, gp7Var2.c, str12, user7, chat2, wn7Var222, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                    ip7Var.h.k(j24222, num2);
                                    i26 = i8 + 1;
                                    arrayList = arrayList4;
                                    arrayList11 = arrayList14;
                                    z5 = z9;
                                    z6 = z8;
                                    size = i6;
                                    zh6Var10 = zh6Var5;
                                    zh6Var11 = zh6Var6;
                                    d = sharedPreferences;
                                    e = j6;
                                    b2 = notification3;
                                    zh6Var2 = zh6Var7;
                                }
                                i22 = i17;
                                j12 = j222;
                                if (gp7Var2.c) {
                                    long[] jArr2 = new long[ip7Var.E.size()];
                                    for (int i51 = 0; i51 < ip7Var.E.size(); i51++) {
                                        jArr2[i51] = ((hp7) ip7Var.E.get(i51)).a;
                                    }
                                    intent32.putExtra("storyDialogIds", jArr2);
                                } else if (wf3.B(j12)) {
                                    intent32.putExtra("encId", wf3.h(j12));
                                } else if (wf3.D(j12)) {
                                    intent32.putExtra("userId", j12);
                                } else {
                                    intent32.putExtra("chatId", -j12);
                                }
                                j13 = j8;
                                ik8.q(j13, ik8.o(j12, "show extra notifications chatId ", " topicId "));
                                if (j13 != 0) {
                                }
                                String str20222 = str11;
                                intent32.putExtra(str20222, ip7Var.currentAccount);
                                PendingIntent activity222 = PendingIntent.getActivity(a.b, 0, intent32, 1140850688);
                                lyc lycVar222 = new lyc((byte) 10);
                                ln7 ln7Var2222 = ln7Var;
                                if (ln7Var != null) {
                                }
                                int i38222 = i22;
                                Intent intent4222 = new Intent(a.b, (Class<?>) AutoMessageHeardReceiver.class);
                                intent4222.addFlags(i7);
                                intent4222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                intent4222.putExtra("dialog_id", j12);
                                int i39222 = i15;
                                intent4222.putExtra(str10, i39222);
                                intent4222.putExtra(str20222, ip7Var.currentAccount);
                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList19222 = arrayList5;
                                bitmap4 = bitmap3;
                                kn7 kn7Var2222 = new kn7(R.drawable.msg_markread, PendingIntent.getBroadcast(a.b, num2.intValue(), intent4222, 167772160), ob6.L0(2131748435));
                                kn7Var2222.g = (byte) 2;
                                kn7Var2222.h = false;
                                ln7 b3222 = kn7Var2222.b();
                                if (wf3.B(j12)) {
                                }
                                if (str16 != null) {
                                }
                                eo7 eo7Var3222 = eo7Var2;
                                long j23222 = j6;
                                lycVar222.e = qu6.n(j23222, "tgaccount");
                                j6 = j23222;
                                if (gp7Var2.c) {
                                }
                                wn7 wn7Var2222 = new wn7(a.b);
                                wn7Var2222.e(str12);
                                ArrayList arrayList20222 = arrayList8;
                                wn7Var2222.F.icon = R.drawable.notification;
                                wn7Var2222.d(sb.toString());
                                wn7Var2222.f(16, true);
                                wn7Var2222.i = gp7Var2.c ? ip7Var.E.size() : arrayList20222.size();
                                wn7Var2222.w = -15618822;
                                wn7Var2222.r = false;
                                wn7Var2222.F.when = j14;
                                wn7Var2222.k = true;
                                wn7Var2222.i(eo7Var3222);
                                wn7Var2222.g = activity222;
                                lycVar222.q(wn7Var2222);
                                wn7Var2222.s = String.valueOf(Long.MAX_VALUE - j14);
                                wn7Var2222.f(8, (z3 && j12 == j && j13 == j2) ? false : true);
                                wn7Var2222.u = "msg";
                                intent = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                intent.putExtra("messageDate", i9);
                                intent.putExtra("dialogId", j12);
                                String str21222 = str15;
                                intent.putExtra(str21222, ip7Var.currentAccount);
                                if (gp7Var2.c) {
                                }
                                if (r47Var3 != null) {
                                }
                                wn7Var2222.F.deleteIntent = PendingIntent.getBroadcast(a.b, num2.intValue(), intent, 167772160);
                                if (z9) {
                                }
                                if (r47Var3 != null) {
                                }
                                keyboardInlineButton = null;
                                tL_inlineButtonTypeCopy = null;
                                if (keyboardInlineButton != null) {
                                }
                                j15 = gp7Var2.a;
                                if (j15 != 489000) {
                                }
                                if (arrayList14.size() == 1) {
                                }
                                if (wf3.B(j12)) {
                                }
                                if (bitmap4 != null) {
                                }
                                if (!hl.n2(false)) {
                                }
                                if (chat2 == null) {
                                }
                                user7 = user6;
                                boolean z182222 = z9;
                                Notification notification42222 = notification2;
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                cc4.b("showExtraNotifications: holders.add " + j12);
                                notification3 = notification42222;
                                z9 = z182222;
                                zh6Var7 = zh6Var8;
                                long j242222 = j12;
                                arrayList4 = arrayList;
                                arrayList4.add(new fp7(ip7Var, num2.intValue(), j242222, gp7Var2.c, str12, user7, chat2, wn7Var2222, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                                ip7Var.h.k(j242222, num2);
                                i26 = i8 + 1;
                                arrayList = arrayList4;
                                arrayList11 = arrayList14;
                                z5 = z9;
                                z6 = z8;
                                size = i6;
                                zh6Var10 = zh6Var5;
                                zh6Var11 = zh6Var6;
                                d = sharedPreferences;
                                e = j6;
                                b2 = notification3;
                                zh6Var2 = zh6Var7;
                            }
                        }
                    }
                    j7 = j4;
                    b78 b78Var422 = b78Var2;
                    if (b78Var422 == null) {
                    }
                    i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 28) {
                    }
                    eo7Var.h = format;
                    eo7Var.i = Boolean.valueOf(i16 >= 28 || (!z12 && wf3.y(j5)) || lbc.A(j5));
                    StringBuilder sb422 = new StringBuilder();
                    String[] strArr222 = new String[1];
                    boolean[] zArr222 = new boolean[1];
                    if (gp7Var5.c) {
                    }
                    ArrayList arrayList1822 = arrayList3;
                    r47Var3 = r47Var;
                    long j2222 = j5;
                    Intent intent322 = new Intent(a.b, (Class<?>) LaunchActivity.class);
                    intent322.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    intent322.setFlags(67108864);
                    intent322.addCategory("android.intent.category.LAUNCHER");
                    if (r47Var3 != null) {
                    }
                    i22 = i17;
                    j12 = j2222;
                    if (gp7Var2.c) {
                    }
                    j13 = j8;
                    ik8.q(j13, ik8.o(j12, "show extra notifications chatId ", " topicId "));
                    if (j13 != 0) {
                    }
                    String str202222 = str11;
                    intent322.putExtra(str202222, ip7Var.currentAccount);
                    PendingIntent activity2222 = PendingIntent.getActivity(a.b, 0, intent322, 1140850688);
                    lyc lycVar2222 = new lyc((byte) 10);
                    ln7 ln7Var22222 = ln7Var;
                    if (ln7Var != null) {
                    }
                    int i382222 = i22;
                    Intent intent42222 = new Intent(a.b, (Class<?>) AutoMessageHeardReceiver.class);
                    intent42222.addFlags(i7);
                    intent42222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                    intent42222.putExtra("dialog_id", j12);
                    int i392222 = i15;
                    intent42222.putExtra(str10, i392222);
                    intent42222.putExtra(str202222, ip7Var.currentAccount);
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList192222 = arrayList5;
                    bitmap4 = bitmap3;
                    kn7 kn7Var22222 = new kn7(R.drawable.msg_markread, PendingIntent.getBroadcast(a.b, num2.intValue(), intent42222, 167772160), ob6.L0(2131748435));
                    kn7Var22222.g = (byte) 2;
                    kn7Var22222.h = false;
                    ln7 b32222 = kn7Var22222.b();
                    if (wf3.B(j12)) {
                    }
                    if (str16 != null) {
                    }
                    eo7 eo7Var32222 = eo7Var2;
                    long j232222 = j6;
                    lycVar2222.e = qu6.n(j232222, "tgaccount");
                    j6 = j232222;
                    if (gp7Var2.c) {
                    }
                    wn7 wn7Var22222 = new wn7(a.b);
                    wn7Var22222.e(str12);
                    ArrayList arrayList202222 = arrayList8;
                    wn7Var22222.F.icon = R.drawable.notification;
                    wn7Var22222.d(sb.toString());
                    wn7Var22222.f(16, true);
                    wn7Var22222.i = gp7Var2.c ? ip7Var.E.size() : arrayList202222.size();
                    wn7Var22222.w = -15618822;
                    wn7Var22222.r = false;
                    wn7Var22222.F.when = j14;
                    wn7Var22222.k = true;
                    wn7Var22222.i(eo7Var32222);
                    wn7Var22222.g = activity2222;
                    lycVar2222.q(wn7Var22222);
                    wn7Var22222.s = String.valueOf(Long.MAX_VALUE - j14);
                    wn7Var22222.f(8, (z3 && j12 == j && j13 == j2) ? false : true);
                    wn7Var22222.u = "msg";
                    intent = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                    intent.putExtra("messageDate", i9);
                    intent.putExtra("dialogId", j12);
                    String str212222 = str15;
                    intent.putExtra(str212222, ip7Var.currentAccount);
                    if (gp7Var2.c) {
                    }
                    if (r47Var3 != null) {
                    }
                    wn7Var22222.F.deleteIntent = PendingIntent.getBroadcast(a.b, num2.intValue(), intent, 167772160);
                    if (z9) {
                    }
                    if (r47Var3 != null) {
                    }
                    keyboardInlineButton = null;
                    tL_inlineButtonTypeCopy = null;
                    if (keyboardInlineButton != null) {
                    }
                    j15 = gp7Var2.a;
                    if (j15 != 489000) {
                    }
                    if (arrayList14.size() == 1) {
                    }
                    if (wf3.B(j12)) {
                    }
                    if (bitmap4 != null) {
                    }
                    if (!hl.n2(false)) {
                    }
                    if (chat2 == null) {
                    }
                    user7 = user6;
                    boolean z1822222 = z9;
                    Notification notification422222 = notification2;
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    cc4.b("showExtraNotifications: holders.add " + j12);
                    notification3 = notification422222;
                    z9 = z1822222;
                    zh6Var7 = zh6Var8;
                    long j2422222 = j12;
                    arrayList4 = arrayList;
                    arrayList4.add(new fp7(ip7Var, num2.intValue(), j2422222, gp7Var2.c, str12, user7, chat2, wn7Var22222, j2, str2, jArr, i, uri, i2, z, z2, z3, i3));
                    ip7Var.h.k(j2422222, num2);
                    i26 = i8 + 1;
                    arrayList = arrayList4;
                    arrayList11 = arrayList14;
                    z5 = z9;
                    z6 = z8;
                    size = i6;
                    zh6Var10 = zh6Var5;
                    zh6Var11 = zh6Var6;
                    d = sharedPreferences;
                    e = j6;
                    b2 = notification3;
                    zh6Var2 = zh6Var7;
                }
                z7 = z5;
                Notification notification5 = b2;
                zh6Var3 = zh6Var11;
                zh6 zh6Var12 = zh6Var2;
                ArrayList arrayList31 = arrayList;
                if (z7) {
                    arrayList2 = arrayList31;
                    if (ip7Var.y.isEmpty()) {
                        if (f11.a) {
                            c00.q(ip7Var.e0, new StringBuilder("cancel summary with id "));
                        }
                        str3 = null;
                        m0.b(ip7Var.e0, null);
                        i4 = 0;
                        while (i4 < zh6Var3.m()) {
                            zh6 zh6Var13 = zh6Var3;
                            if (!ip7Var.y.contains(Long.valueOf(zh6Var13.j(i4)))) {
                                Integer num5 = (Integer) zh6Var13.n(i4);
                                if (f11.a) {
                                    cc4.b("cancel notification id " + num5);
                                }
                                m0.b(num5.intValue(), str3);
                            }
                            i4++;
                            zh6Var3 = zh6Var13;
                        }
                        ArrayList arrayList32 = new ArrayList(arrayList2.size());
                        cc4.b("showExtraNotifications: holders.size()=" + arrayList2.size());
                        size2 = arrayList2.size();
                        i5 = 0;
                        while (i5 < size2) {
                            ArrayList arrayList33 = arrayList2;
                            fp7 fp7Var = (fp7) arrayList33.get(i5);
                            arrayList32.clear();
                            int i52 = Build.VERSION.SDK_INT;
                            if (i52 < 29 || wf3.B(fp7Var.b)) {
                                zh6Var4 = zh6Var12;
                            } else {
                                wn7 wn7Var3 = fp7Var.g;
                                long j27 = fp7Var.b;
                                zh6Var4 = zh6Var12;
                                String d2 = ip7Var.d(wn7Var3, j27, fp7Var.d, fp7Var.e, fp7Var.f, (b78) zh6Var4.f(j27), !fp7Var.c);
                                if (d2 != null) {
                                    arrayList32.add(d2);
                                }
                            }
                            cc4.b("showExtraNotifications: holders[" + i5 + "].call()");
                            fp7Var.a();
                            if (i52 >= 29 && xea.n0 && !arrayList32.isEmpty()) {
                                mka.o(a.b, arrayList32);
                            }
                            i5++;
                            ip7Var = this;
                            arrayList2 = arrayList33;
                            zh6Var12 = zh6Var4;
                        }
                    }
                } else {
                    if (f11.a) {
                        c00.q(ip7Var.e0, new StringBuilder("show summary with id "));
                    }
                    try {
                        m0.d(ip7Var.e0, notification5);
                        arrayList2 = arrayList31;
                    } catch (SecurityException e6) {
                        cc4.f(e6);
                        arrayList2 = arrayList31;
                        ip7Var.P(wn7Var, j, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                    }
                }
                str3 = null;
                i4 = 0;
                while (i4 < zh6Var3.m()) {
                }
                ArrayList arrayList322 = new ArrayList(arrayList2.size());
                cc4.b("showExtraNotifications: holders.size()=" + arrayList2.size());
                size2 = arrayList2.size();
                i5 = 0;
                while (i5 < size2) {
                }
            }
        }
        z5 = true;
        if (z5) {
            c();
        }
        e = ip7Var.getUserConfig().e();
        if (hl.m2()) {
        }
        if (xea.r.length() <= 0) {
        }
        cc4.b("showExtraNotifications: passcode=" + (xea.r.length() <= 0) + " waitingForPasscode=" + z6 + " selfUserId=" + e + " useSummaryNotification=" + z5);
        zh6Var2 = new zh6();
        size = arrayList11.size();
        arrayList = arrayList13;
        while (true) {
            if (i26 >= size) {
            }
            i26 = i8 + 1;
            arrayList = arrayList4;
            arrayList11 = arrayList14;
            z5 = z9;
            z6 = z8;
            size = i6;
            zh6Var10 = zh6Var5;
            zh6Var11 = zh6Var6;
            d = sharedPreferences;
            e = j6;
            b2 = notification3;
            zh6Var2 = zh6Var7;
        }
        z7 = z5;
        Notification notification52 = b2;
        zh6Var3 = zh6Var11;
        zh6 zh6Var122 = zh6Var2;
        ArrayList arrayList312 = arrayList;
        if (z7) {
        }
        str3 = null;
        i4 = 0;
        while (i4 < zh6Var3.m()) {
        }
        ArrayList arrayList3222 = new ArrayList(arrayList2.size());
        cc4.b("showExtraNotifications: holders.size()=" + arrayList2.size());
        size2 = arrayList2.size();
        i5 = 0;
        while (i5 < size2) {
        }
    }

    public final void Y() {
        l0.c(new vo7(this, (byte) 4));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(55:583|(4:120|(2:122|(1:124)(1:578))(1:579)|125|(1:127)(3:573|574|(1:576)(1:577)))(1:580)|128|129|(3:552|(1:572)(1:556)|(4:(1:(2:566|(1:568)(1:569))(1:561))(1:570)|562|(1:564)|565)(1:571))(4:132|(5:134|(2:136|(7:143|(3:145|(1:151)(1:149)|150)|152|(1:163)(1:(1:156)(2:159|(1:161)(1:162)))|157|158|142))(1:164)|140|141|142)|165|166)|(1:551)(1:173)|(1:550)(5:178|(1:180)(1:549)|(2:182|(1:184)(2:185|(2:187|188)(2:544|(1:546)(1:547))))|548|188)|(2:190|(42:192|193|(5:195|(1:197)(1:540)|198|(1:200)(1:539)|201)(1:541)|202|203|(5:530|(1:532)(1:538)|533|(1:535)(1:537)|536)(1:(2:(3:209|(1:211)(1:506)|212)(3:507|(1:509)(1:511)|510)|213)(2:512|(6:(1:515)(1:528)|516|(1:518)(2:(1:525)(1:527)|526)|519|(1:521)(1:523)|522)(33:529|(1:216)(1:505)|217|(1:504)(1:221)|222|(1:503)(1:225)|(1:229)|(1:502)(1:234)|(6:236|(1:238)|239|(1:241)(1:500)|242|(1:244)(1:499))(1:501)|(3:248|249|(1:253))|(1:258)|259|(1:261)|262|263|(1:265)(3:437|438|(2:(2:441|442)(2:444|(1:446))|443)(2:447|(4:449|(2:452|450)|453|454)(17:455|(5:457|(1:(1:460)(2:461|(1:463)))|464|(21:(3:473|(1:481)|482)(3:483|(2:485|(1:493))|482)|269|(2:276|(1:278))|279|280|281|(1:283)|284|(1:286)(1:434)|287|(1:289)(1:(2:418|(1:420)(3:421|422|(4:424|(1:426)(1:431)|427|(1:429)))))|290|(2:414|415)(1:(4:295|296|(1:298)|394)(5:395|(2:397|(1:399)(3:400|(2:402|(1:404))(2:405|(2:407|(2:409|410)))|394))|411|(1:413)|394))|299|(1:393)(6:(3:388|(1:390)(1:392)|391)|(3:309|310|(5:312|(1:373)(1:(1:317)(1:372))|(1:319)(1:371)|320|(1:322)(2:360|(1:362)(1:(1:370)(2:366|(1:368)(1:369)))))(2:374|(1:376)(2:(2:378|(2:382|383))|386)))|387|(0)(0)|320|(0)(0))|323|(2:329|(7:331|(4:333|(3:335|(4:337|(1:339)|340|341)(2:343|344)|342)|345|346)|347|348|(1:356)|357|358))|359|(4:350|352|354|356)|357|358)|267)(2:494|(1:498))|268|269|(4:272|274|276|(0))|279|280|281|(0)|284|(0)(0)|287|(0)(0)|290|(1:292)|414|415)))|266|267|268|269|(0)|279|280|281|(0)|284|(0)(0)|287|(0)(0)|290|(0)|414|415)))|214|(0)(0)|217|(1:219)|504|222|(0)|503|(2:227|229)|(1:231)|502|(0)(0)|(4:246|248|249|(2:251|253))|(0)|259|(0)|262|263|(0)(0)|266|267|268|269|(0)|279|280|281|(0)|284|(0)(0)|287|(0)(0)|290|(0)|414|415))(1:543)|542|193|(0)(0)|202|203|(1:205)|530|(0)(0)|533|(0)(0)|536|214|(0)(0)|217|(0)|504|222|(0)|503|(0)|(0)|502|(0)(0)|(0)|(0)|259|(0)|262|263|(0)(0)|266|267|268|269|(0)|279|280|281|(0)|284|(0)(0)|287|(0)(0)|290|(0)|414|415) */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0b9f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0b05, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0b06, code lost:
    
        cc4.f(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b4 A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0488 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06c8 A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0888  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0892 A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x08a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x08ac A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x08ba  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x08c7 A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x08ec  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0937 A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0944 A[Catch: Exception -> 0x0e15, TRY_ENTER, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0aa1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0ac6 A[Catch: Exception -> 0x0e15, TRY_LEAVE, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0ae8 A[Catch: all -> 0x0b05, TryCatch #1 {all -> 0x0b05, blocks: (B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa), top: B:280:0x0acd, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0af2 A[Catch: all -> 0x0b05, TryCatch #1 {all -> 0x0b05, blocks: (B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa), top: B:280:0x0acd, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0b0b A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0b65  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0c9a A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0cb8 A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0cc2  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0cb3  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x095f A[Catch: Exception -> 0x0e15, TRY_LEAVE, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x088b  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0849 A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0879  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x087b  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0855 A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:541:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0567 A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0570  */
    /* JADX WARN: Removed duplicated region for block: B:571:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:580:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x03ab A[Catch: Exception -> 0x0e15, TryCatch #3 {Exception -> 0x0e15, blocks: (B:12:0x002a, B:13:0x0036, B:15:0x003e, B:19:0x0051, B:23:0x0055, B:25:0x005d, B:27:0x006f, B:29:0x0072, B:34:0x0079, B:37:0x0082, B:38:0x0096, B:40:0x009e, B:42:0x00d0, B:44:0x00f2, B:46:0x00fa, B:48:0x0102, B:50:0x0108, B:53:0x011b, B:55:0x01de, B:56:0x020b, B:58:0x021d, B:60:0x0223, B:63:0x0227, B:65:0x0243, B:66:0x0250, B:68:0x025d, B:69:0x025f, B:73:0x026d, B:75:0x0279, B:76:0x027f, B:78:0x028a, B:80:0x0290, B:82:0x029c, B:83:0x02a8, B:84:0x02b2, B:86:0x02c2, B:88:0x02d2, B:90:0x02d8, B:92:0x02fc, B:94:0x0303, B:97:0x0331, B:99:0x0337, B:100:0x0345, B:102:0x034b, B:105:0x0352, B:108:0x0367, B:113:0x0395, B:115:0x0399, B:120:0x03b4, B:122:0x03bd, B:124:0x03c5, B:125:0x03f2, B:128:0x046e, B:132:0x048a, B:134:0x04ae, B:136:0x04c0, B:138:0x04c6, B:142:0x053f, B:145:0x04d3, B:147:0x04d9, B:152:0x04e3, B:156:0x04f0, B:157:0x0538, B:159:0x0506, B:161:0x050e, B:162:0x0522, B:166:0x0549, B:169:0x05d0, B:178:0x05e8, B:180:0x0604, B:182:0x0633, B:184:0x063d, B:185:0x0650, B:187:0x0660, B:190:0x068e, B:193:0x06b2, B:195:0x06c8, B:197:0x06f8, B:198:0x070d, B:200:0x071d, B:203:0x0739, B:205:0x073f, B:209:0x0747, B:211:0x0758, B:212:0x076b, B:217:0x088c, B:219:0x0892, B:227:0x08ac, B:229:0x08b2, B:236:0x08c7, B:239:0x08d1, B:242:0x08dc, B:256:0x08fd, B:259:0x0906, B:261:0x0937, B:262:0x093e, B:265:0x0944, B:269:0x0a5a, B:272:0x0aa3, B:274:0x0aa7, B:276:0x0aad, B:278:0x0ac6, B:289:0x0b0b, B:296:0x0b6d, B:303:0x0bad, B:307:0x0bec, B:309:0x0bf4, B:312:0x0bfe, B:314:0x0c06, B:317:0x0c0e, B:319:0x0c9a, B:322:0x0cb8, B:323:0x0cfc, B:325:0x0d02, B:327:0x0d06, B:329:0x0d11, B:331:0x0d19, B:333:0x0d25, B:335:0x0d36, B:337:0x0d48, B:339:0x0d69, B:340:0x0d6e, B:342:0x0d98, B:346:0x0da3, B:350:0x0dbf, B:352:0x0dc5, B:354:0x0dcd, B:356:0x0dd3, B:357:0x0df7, B:362:0x0cc5, B:368:0x0cd8, B:370:0x0ce5, B:372:0x0c32, B:373:0x0c37, B:374:0x0c3a, B:376:0x0c40, B:378:0x0c48, B:380:0x0c50, B:385:0x0c88, B:386:0x0c90, B:388:0x0bb7, B:390:0x0bbf, B:391:0x0be7, B:393:0x0cee, B:402:0x0b80, B:407:0x0b8b, B:411:0x0b93, B:415:0x0b9b, B:418:0x0b13, B:420:0x0b1d, B:436:0x0b06, B:437:0x095f, B:442:0x0970, B:443:0x0982, B:446:0x097d, B:447:0x0992, B:449:0x09a2, B:450:0x09ab, B:452:0x09b3, B:454:0x09c2, B:455:0x09c8, B:457:0x09d2, B:460:0x09dd, B:463:0x09e7, B:464:0x09ea, B:466:0x09f0, B:468:0x09f4, B:470:0x09fd, B:473:0x0a05, B:475:0x0a0b, B:477:0x0a0f, B:479:0x0a17, B:485:0x0a23, B:487:0x0a29, B:489:0x0a2d, B:491:0x0a35, B:494:0x0a3d, B:496:0x0a4a, B:498:0x0a50, B:506:0x0764, B:507:0x078f, B:509:0x07a0, B:510:0x07b3, B:511:0x07ac, B:516:0x07e6, B:518:0x07ee, B:519:0x0806, B:526:0x0801, B:530:0x0838, B:532:0x0849, B:533:0x085c, B:538:0x0855, B:540:0x0705, B:544:0x066d, B:546:0x0671, B:552:0x0555, B:554:0x0567, B:561:0x0576, B:562:0x05b9, B:565:0x05bf, B:566:0x058a, B:568:0x0590, B:569:0x05a4, B:573:0x0402, B:576:0x040e, B:577:0x0429, B:578:0x03d2, B:581:0x03a0, B:583:0x03ab, B:586:0x0381, B:588:0x0389, B:589:0x038e, B:594:0x033c, B:595:0x0341, B:602:0x02db, B:604:0x02e1, B:610:0x0127, B:612:0x012d, B:613:0x0133, B:616:0x013b, B:617:0x0145, B:618:0x0157, B:620:0x015d, B:621:0x0175, B:623:0x017b, B:625:0x0183, B:626:0x01b3, B:627:0x010f, B:629:0x01fa, B:249:0x08ef, B:281:0x0acd, B:283:0x0ae8, B:284:0x0aee, B:286:0x0af2, B:287:0x0afa, B:383:0x0c5b), top: B:11:0x002a, inners: #0, #1, #2 }] */
    /* JADX WARN: Type inference failed for: r12v76 */
    /* JADX WARN: Type inference failed for: r12v77 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v82 */
    /* JADX WARN: Type inference failed for: r12v86 */
    /* JADX WARN: Type inference failed for: r12v87 */
    /* JADX WARN: Type inference failed for: r53v0, types: [ip7, rf0] */
    /* JADX WARN: Type inference failed for: r5v82, types: [r47] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(boolean z) {
        long j;
        long j2;
        r47 r47Var;
        Bitmap bitmap;
        String str;
        long j3;
        long j4;
        String str2;
        String str3;
        long j5;
        TLRPC.Chat chat;
        boolean z2;
        long j6;
        long j7;
        long j8;
        long j9;
        TLRPC.Chat chat2;
        boolean z3;
        boolean z4;
        String L0;
        boolean z5;
        String str4;
        String L02;
        boolean z6;
        boolean z7;
        Bitmap bitmap2;
        boolean z8;
        String str5;
        SharedPreferences sharedPreferences;
        long j10;
        String r;
        String str6;
        boolean z9;
        String str7;
        boolean z10;
        String str8;
        SharedPreferences sharedPreferences2;
        long j11;
        boolean z11;
        boolean z12;
        String str9;
        String str10;
        boolean z13;
        long j12;
        long j13;
        Integer num;
        int i;
        boolean z14;
        String str11;
        int i2;
        boolean z15;
        long j14;
        String str12;
        long j15;
        String string;
        boolean z16;
        boolean z17;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z18;
        boolean z19;
        boolean z20;
        int i8;
        String str13;
        boolean z21;
        int i9;
        int i10;
        String str14;
        int i11;
        int i12;
        boolean z22;
        boolean z23;
        TLRPC.User user;
        TLRPC.Chat chat3;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        int i13;
        int i14;
        int i15;
        long[] jArr;
        Uri uri;
        Uri uri2;
        int i16;
        int i17;
        boolean z24;
        Uri uri3;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        String str15;
        String str16;
        int ringerMode;
        String string2;
        boolean z25;
        boolean z26;
        int i23;
        boolean z27;
        int i24;
        boolean[] zArr;
        CharSequence charSequence;
        String G;
        String str17;
        if (!getUserConfig().o() || ((this.a.isEmpty() && this.E.isEmpty()) || !(xea.M0 || this.currentAccount == yac.t0))) {
            j();
            return;
        }
        try {
            getConnectionsManager().resumeNetworkMaybe();
            long j16 = 0;
            hp7 hp7Var = null;
            for (int i25 = 0; i25 < this.a.size(); i25++) {
                ?? r5 = (r47) this.a.get(i25);
                long j17 = r5.k.date;
                if (j16 < j17) {
                    hp7Var = r5;
                    j16 = j17;
                }
            }
            for (int i26 = 0; i26 < this.E.size(); i26++) {
                hp7 hp7Var2 = (hp7) this.E.get(i26);
                long j18 = hp7Var2.e;
                if (j16 < j18 / 1000) {
                    hp7Var = hp7Var2;
                    j16 = j18 / 1000;
                }
            }
            if (hp7Var == null) {
                return;
            }
            if (hp7Var instanceof hp7) {
                hp7 hp7Var3 = hp7Var;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                boolean z28 = false;
                int i27 = 0;
                j = 1000;
                for (int i28 = 0; i28 < this.E.size(); i28++) {
                    z28 |= ((hp7) this.E.get(i28)).d;
                    tL_message.date = Math.min(tL_message.date, (int) (((hp7) this.E.get(i28)).e / 1000));
                    i27 += ((hp7) this.E.get(i28)).c.size();
                }
                j2 = 0;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                long j19 = hp7Var3.a;
                tL_peerUser.user_id = j19;
                tL_message.dialog_id = j19;
                tL_message.peer_id = tL_peerUser;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                I(arrayList, arrayList2);
                Bitmap F = xea.o() >= 1 ? F(arrayList2) : null;
                String G2 = (z28 || this.E.size() >= 2 || arrayList.isEmpty()) ? ob6.G(i27, "Stories", new Object[0]) : (String) arrayList.get(0);
                if (z28) {
                    G = ob6.G(i27, "StoryNotificationHidden", new Object[0]);
                    tL_message.message = G;
                } else if (arrayList.isEmpty()) {
                    tL_message.message = "";
                    str17 = "";
                    r47 r47Var2 = new r47(this.currentAccount, tL_message, str17, G2, G2, false, false, false, false);
                    r47Var2.K = true;
                    r47Var = r47Var2;
                    bitmap = F;
                } else if (arrayList.size() == 1) {
                    if (i27 == 1) {
                        G = ob6.N0("StoryNotificationSingle");
                        tL_message.message = G;
                    } else {
                        G = ob6.G(i27, "StoryNotification1", arrayList.get(0));
                        tL_message.message = G;
                    }
                } else if (arrayList.size() == 2) {
                    G = ob6.Z(2131744256, arrayList.get(0), arrayList.get(1));
                    tL_message.message = G;
                } else if (arrayList.size() == 3 && this.E.size() == 3) {
                    G = ob6.Z(2131744255, e((String) arrayList.get(0)), e((String) arrayList.get(1)), e((String) arrayList.get(2)));
                    tL_message.message = G;
                } else {
                    G = ob6.G(this.E.size() - 2, "StoryNotification4", e((String) arrayList.get(0)), e((String) arrayList.get(1)));
                    tL_message.message = G;
                }
                str17 = G;
                r47 r47Var22 = new r47(this.currentAccount, tL_message, str17, G2, G2, false, false, false, false);
                r47Var22.K = true;
                r47Var = r47Var22;
                bitmap = F;
            } else {
                j = 1000;
                j2 = 0;
                r47Var = (r47) this.a.get(0);
                bitmap = null;
            }
            SharedPreferences d = getAccountInstance().d();
            int i29 = d.getInt("dismissDate", 0);
            if (!r47Var.K && r47Var.k.date <= i29) {
                j();
                return;
            }
            long A0 = r47Var.A0();
            long a2 = r47.a2(this.currentAccount, r47Var.k, getMessagesController().w2(r47Var));
            boolean z29 = r47Var.K;
            if (r47Var.k.mentioned) {
                str = "";
                j3 = r47Var.Z0();
            } else {
                str = "";
                j3 = A0;
            }
            r47Var.e1();
            TLRPC.Peer peer = r47Var.k.peer_id;
            long j20 = peer.chat_id;
            if (j20 == j2) {
                j20 = peer.channel_id;
            }
            long j21 = j3;
            long j22 = peer.user_id;
            if (r47Var.p3() && (j22 == j2 || j22 == getUserConfig().e())) {
                j22 = r47Var.k.from_id.user_id;
            }
            if (r47Var.A0() == 489000 && r47Var.W0() != null) {
                if (r47Var.W0().longValue() >= j2) {
                    j22 = r47Var.W0().longValue();
                    j20 = j2;
                } else {
                    j20 = r47Var.W0().longValue();
                    j22 = j2;
                }
            }
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j22));
            if (j20 != j2) {
                j4 = j20;
                chat = getMessagesController().M0(Long.valueOf(j4));
                z2 = (chat == null && r47Var.i3()) ? r47Var.f : xc2.T(chat) && !chat.megagroup;
                str2 = "file://";
                str3 = "currentAccount";
                j5 = j21;
            } else {
                j4 = j20;
                str2 = "file://";
                str3 = "currentAccount";
                j5 = j21;
                chat = null;
                z2 = false;
            }
            int o = o(j5, a2);
            if (o == -1) {
                Boolean valueOf = Boolean.valueOf(z2);
                boolean z30 = r47Var.I;
                j7 = j5;
                j6 = a2;
                j9 = j4;
                chat2 = chat;
                z3 = x(A0, valueOf, z30, z30);
                j8 = A0;
            } else {
                j6 = a2;
                j7 = j5;
                j8 = A0;
                j9 = j4;
                chat2 = chat;
                z3 = o != 2;
            }
            String s = (((j20 == j2 || chat2 != null) && X1 != null) || !r47Var.i3()) ? chat2 != null ? s(chat2) : lbc.r(X1) : r47Var.b;
            boolean z31 = hl.m2() || xea.B;
            String str18 = s;
            boolean equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
            if (wf3.B(j8)) {
                z4 = equalsIgnoreCase;
            } else {
                if (equalsIgnoreCase) {
                    z4 = equalsIgnoreCase;
                } else {
                    z4 = equalsIgnoreCase;
                    if (this.f.m() <= 1) {
                    }
                }
                if (!z31) {
                    L0 = str18;
                    z5 = true;
                    if (!r47Var.I || r47Var.J) {
                        str4 = L0;
                        if (!d.getBoolean("EnableReactionsPreview", true)) {
                            L02 = ob6.L0(2131747745);
                            if (z4) {
                                z6 = z5;
                                z7 = z3;
                                bitmap2 = bitmap;
                                z8 = z29;
                                str5 = str;
                            } else {
                                z6 = z5;
                                if (yac.c() <= 1) {
                                    str5 = str;
                                } else if (this.f.m() == 1) {
                                    str5 = lbc.j(getUserConfig().f());
                                } else {
                                    str5 = lbc.j(getUserConfig().f()) + "・";
                                }
                                z7 = z3;
                                if (this.f.m() == 1) {
                                    bitmap2 = bitmap;
                                    z8 = z29;
                                } else {
                                    z8 = z29;
                                    if (this.f.m() == 1) {
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(str5);
                                        bitmap2 = bitmap;
                                        sb.append(ob6.G(this.J, "NewMessages", new Object[0]));
                                        str5 = sb.toString();
                                    } else {
                                        bitmap2 = bitmap;
                                        str5 = str5 + ob6.Z(2131747672, ob6.G(this.J, "NewMessages", new Object[0]), ob6.G(this.f.m(), "FromChats", new Object[0]));
                                    }
                                }
                            }
                            wn7 wn7Var = new wn7(a.b);
                            TLRPC.Chat chat4 = chat2;
                            if (this.a.size() > 1 || z4) {
                                sharedPreferences = d;
                                j10 = j22;
                                String str19 = str;
                                boolean[] zArr2 = new boolean[1];
                                r = r(r47Var, zArr2);
                                boolean z32 = !r47Var.k.silent || r47Var.I;
                                if (r == null) {
                                    return;
                                }
                                if (!z6) {
                                    str6 = r;
                                } else if (chat4 != null && !z4) {
                                    str6 = r.replace(" @ " + L02, str19);
                                } else if (zArr2[0]) {
                                    str6 = r.replace(L02 + ": ", str19);
                                } else {
                                    str6 = r.replace(L02 + " ", str19);
                                }
                                wn7Var.d(str6);
                                if (z4) {
                                    str5 = str6;
                                }
                                rn7 rn7Var = new rn7((byte) 0);
                                rn7Var.e(str6);
                                wn7Var.i(rn7Var);
                                z9 = z32;
                                str7 = str19;
                            } else {
                                wn7Var.d(str5);
                                rn7 rn7Var2 = new rn7((byte) 1);
                                rn7Var2.f(L02);
                                j10 = j22;
                                int min = Math.min(10, this.a.size());
                                boolean[] zArr3 = new boolean[1];
                                sharedPreferences = d;
                                int i30 = 0;
                                ?? r12 = 2;
                                String str20 = null;
                                String str21 = str;
                                while (i30 < min) {
                                    int i31 = min;
                                    r47 r47Var3 = (r47) this.a.get(i30);
                                    int i32 = i30;
                                    String r2 = r(r47Var3, zArr3);
                                    if (r2 != null) {
                                        zArr = zArr3;
                                        if (r47Var3.K || r47Var3.k.date > i29) {
                                            r12 = r12;
                                            if (r12 == 2) {
                                                r12 = r47Var3.k.silent || r47Var3.I;
                                                str20 = r2;
                                            }
                                            if (this.f.m() != 1 || !z6) {
                                                charSequence = str21;
                                            } else if (chat4 != null) {
                                                charSequence = str21;
                                                r2 = r2.replace(" @ " + L02, charSequence);
                                            } else {
                                                charSequence = str21;
                                                r2 = zArr[0] ? r2.replace(L02 + ": ", charSequence) : r2.replace(L02 + " ", charSequence);
                                            }
                                            rn7Var2.d(r2);
                                            i30 = i32 + 1;
                                            str21 = charSequence;
                                            min = i31;
                                            zArr3 = zArr;
                                            r12 = r12;
                                        }
                                    } else {
                                        zArr = zArr3;
                                    }
                                    charSequence = str21;
                                    i30 = i32 + 1;
                                    str21 = charSequence;
                                    min = i31;
                                    zArr3 = zArr;
                                    r12 = r12;
                                }
                                str7 = str21;
                                rn7Var2.g(str5);
                                wn7Var.i(rn7Var2);
                                r = str20;
                                z9 = r12;
                            }
                            boolean z33 = !z || !z7 || MediaController.z().I() || z9;
                            if (z33 || j8 != j7 || chat4 == null) {
                                z10 = z9;
                                str8 = str7;
                                sharedPreferences2 = sharedPreferences;
                            } else {
                                sharedPreferences2 = sharedPreferences;
                                boolean z34 = sharedPreferences2.getBoolean("custom_" + j8, false);
                                int i33 = jn7.J2;
                                if (z34) {
                                    i24 = sharedPreferences2.getInt("smart_max_count_" + j8, 2);
                                    i33 = sharedPreferences2.getInt("smart_delay_" + j8, jn7.J2);
                                } else {
                                    i24 = 2;
                                }
                                if (i24 != 0) {
                                    Point point = (Point) this.e.f(j8);
                                    if (point == null) {
                                        this.e.k(j8, new Point(1, (int) (SystemClock.elapsedRealtime() / j)));
                                    } else {
                                        z10 = z9;
                                        if (point.y + i33 < SystemClock.elapsedRealtime() / j) {
                                            point.set(1, (int) (SystemClock.elapsedRealtime() / j));
                                            str8 = str7;
                                        } else {
                                            int i34 = point.x;
                                            if (i34 < i24) {
                                                str8 = str7;
                                                point.set(i34 + 1, (int) (SystemClock.elapsedRealtime() / j));
                                            } else {
                                                str8 = str7;
                                                z33 = true;
                                            }
                                        }
                                    }
                                }
                                z10 = z9;
                                str8 = str7;
                            }
                            if (z33) {
                                j11 = j6;
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("sound_enabled_");
                                j11 = j6;
                                sb2.append(p(j8, j11, false));
                                if (!sharedPreferences2.getBoolean(sb2.toString(), true)) {
                                    z11 = true;
                                    String path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                    z12 = a.x;
                                    boolean z35 = !z12;
                                    p(j8, j11, false);
                                    if (this.h0.e(j8, j11)) {
                                        str9 = r;
                                        str10 = str8;
                                        z13 = z8;
                                        j12 = j11;
                                        j13 = j8;
                                        num = null;
                                        i = 3;
                                        z14 = false;
                                        str11 = null;
                                        i2 = 0;
                                    } else {
                                        long j23 = j8;
                                        z13 = z8;
                                        long j24 = j11;
                                        int c = this.h0.c(0, j23, j24, "vibrate_");
                                        int c2 = this.h0.c(3, j23, j24, "priority_");
                                        j13 = j23;
                                        str9 = r;
                                        str10 = str8;
                                        long d2 = this.h0.d(j13, j24);
                                        if (d2 != j2) {
                                            str11 = getMediaDataController().A0.e(d2);
                                            z14 = true;
                                        } else {
                                            str11 = this.h0.f(j13, j24);
                                            z14 = false;
                                        }
                                        j12 = j24;
                                        int c3 = this.h0.c(0, j13, j12, "color_");
                                        num = c3 != 0 ? Integer.valueOf(c3) : null;
                                        i2 = c;
                                        i = c2;
                                    }
                                    String str22 = str5;
                                    if (!r47Var.I || r47Var.J) {
                                        z15 = z11;
                                        j14 = j13;
                                        str12 = L02;
                                        j15 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                        if (j15 == 0) {
                                            string = getMediaDataController().A0.e(j15);
                                            z16 = true;
                                        } else {
                                            string = sharedPreferences2.getString("ReactionSoundPath", path);
                                            z16 = false;
                                        }
                                        int i35 = sharedPreferences2.getInt("vibrate_react", 0);
                                        int i36 = sharedPreferences2.getInt("priority_react", 1);
                                        int i37 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                        z17 = z16;
                                        i3 = !r47Var.J ? 5 : 4;
                                        i4 = i37;
                                        i5 = i36;
                                        i6 = i35;
                                    } else if (j20 != j2) {
                                        if (z2) {
                                            z15 = z11;
                                            j14 = j13;
                                            long j25 = j2;
                                            str12 = L02;
                                            long j26 = sharedPreferences2.getLong("ChannelSoundDocId", j25);
                                            if (j26 != j25) {
                                                string = getMediaDataController().A0.e(j26);
                                                z27 = true;
                                            } else {
                                                string = sharedPreferences2.getString("ChannelSoundPath", path);
                                                z27 = false;
                                            }
                                            int i38 = sharedPreferences2.getInt("vibrate_channel", 0);
                                            int i39 = sharedPreferences2.getInt("priority_channel", 1);
                                            i23 = sharedPreferences2.getInt("ChannelLed", -16776961);
                                            z17 = z27;
                                            i5 = i39;
                                            i6 = i38;
                                            i3 = 2;
                                        } else {
                                            z15 = z11;
                                            j14 = j13;
                                            str12 = L02;
                                            long j27 = sharedPreferences2.getLong("GroupSoundDocId", 0L);
                                            if (j27 != 0) {
                                                string = getMediaDataController().A0.e(j27);
                                                z26 = true;
                                            } else {
                                                string = sharedPreferences2.getString("GroupSoundPath", path);
                                                z26 = false;
                                            }
                                            int i40 = sharedPreferences2.getInt("vibrate_group", 0);
                                            int i41 = sharedPreferences2.getInt("priority_group", 1);
                                            i23 = sharedPreferences2.getInt("GroupLed", -16776961);
                                            z17 = z26;
                                            i5 = i41;
                                            i6 = i40;
                                            i3 = 0;
                                        }
                                        i4 = i23;
                                    } else {
                                        z15 = z11;
                                        j14 = j13;
                                        long j28 = j2;
                                        str12 = L02;
                                        if (j10 != j28) {
                                            long j29 = sharedPreferences2.getLong(z13 ? "StoriesSoundDocId" : "GlobalSoundDocId", j28);
                                            if (j29 != j28) {
                                                string2 = getMediaDataController().A0.e(j29);
                                                z25 = true;
                                            } else {
                                                string2 = sharedPreferences2.getString(z13 ? "StoriesSoundPath" : "GlobalSoundPath", path);
                                                z25 = false;
                                            }
                                            i6 = sharedPreferences2.getInt("vibrate_messages", 0);
                                            String str23 = string2;
                                            i5 = sharedPreferences2.getInt("priority_messages", 1);
                                            z17 = z25;
                                            i4 = sharedPreferences2.getInt("MessagesLed", -16776961);
                                            i3 = z13 ? 3 : 1;
                                            string = str23;
                                        } else {
                                            string = null;
                                            i7 = 4;
                                            i4 = -16776961;
                                            i6 = 0;
                                            i5 = 0;
                                            i3 = 1;
                                            z17 = false;
                                            if (i6 == i7) {
                                                z18 = true;
                                                i6 = 0;
                                            } else {
                                                z18 = false;
                                            }
                                            if (!TextUtils.isEmpty(str11) || TextUtils.equals(string, str11)) {
                                                str11 = string;
                                                z14 = z17;
                                                z19 = true;
                                            } else {
                                                z19 = false;
                                            }
                                            z20 = z18;
                                            if (i != 3 || i5 == i) {
                                                i8 = i5;
                                            } else {
                                                i8 = i;
                                                z19 = false;
                                            }
                                            if (num != null && num.intValue() != i4) {
                                                i4 = num.intValue();
                                                z19 = false;
                                            }
                                            if (i2 != 0 || i2 == 4 || i2 == i6) {
                                                i2 = i6;
                                                str13 = str12;
                                                z21 = z19;
                                            } else {
                                                str13 = str12;
                                                z21 = false;
                                            }
                                            if (z12) {
                                                i9 = i8;
                                                i10 = i2;
                                            } else {
                                                if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                                                    str11 = null;
                                                }
                                                i10 = !sharedPreferences2.getBoolean("EnableInAppVibrate", true) ? 2 : i2;
                                                i9 = sharedPreferences2.getBoolean("EnableInAppPopup", true) ? 2 : 0;
                                            }
                                            if (z20 && i10 != 2) {
                                                try {
                                                    ringerMode = p0.getRingerMode();
                                                    if (ringerMode != 0 && ringerMode != 1) {
                                                        i10 = 2;
                                                    }
                                                } catch (Exception e) {
                                                    cc4.f(e);
                                                }
                                            }
                                            if (z15) {
                                                i10 = 0;
                                                i4 = 0;
                                                i9 = 0;
                                                str11 = null;
                                            }
                                            Intent intent = new Intent(a.b, (Class<?>) LaunchActivity.class);
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("com.tmessages.openchat");
                                            boolean z36 = z21;
                                            sb3.append(Math.random());
                                            sb3.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            intent.setAction(sb3.toString());
                                            intent.setFlags(67108864);
                                            if (r47Var.O) {
                                                intent.putExtra("oauth_url", r47Var.b);
                                            }
                                            if (r47Var.J) {
                                                intent.putExtra("storyId", Math.abs(r47Var.e1()));
                                                i11 = i10;
                                                i12 = i4;
                                                str14 = str13;
                                                z22 = z14;
                                            } else {
                                                str14 = str13;
                                                if (r47Var.N) {
                                                    if (j20 != j2) {
                                                        i11 = i10;
                                                        i13 = i4;
                                                        intent.putExtra("chatId", j9);
                                                    } else {
                                                        i11 = i10;
                                                        i13 = i4;
                                                        if (j10 != 0) {
                                                            intent.putExtra("userId", j10);
                                                        }
                                                    }
                                                    intent.putExtra("storyId", Math.abs(r47Var.e1()));
                                                    z22 = z14;
                                                    i12 = i13;
                                                } else {
                                                    i11 = i10;
                                                    long j30 = j10;
                                                    long j31 = j9;
                                                    i12 = i4;
                                                    z22 = z14;
                                                    if (r47Var.K) {
                                                        long[] jArr2 = new long[this.E.size()];
                                                        for (int i42 = 0; i42 < this.E.size(); i42++) {
                                                            jArr2[i42] = ((hp7) this.E.get(i42)).a;
                                                        }
                                                        intent.putExtra("storyDialogIds", jArr2);
                                                    } else {
                                                        boolean B = wf3.B(j14);
                                                        zh6 zh6Var = this.f;
                                                        if (B) {
                                                            z23 = z36;
                                                            user = X1;
                                                            chat3 = chat4;
                                                            if (zh6Var.m() == 1 && j14 != o0) {
                                                                intent.putExtra("encId", wf3.h(j14));
                                                            }
                                                        } else {
                                                            z23 = z36;
                                                            if (zh6Var.m() == 1) {
                                                                if (j20 != j2) {
                                                                    intent.putExtra("chatId", j31);
                                                                } else if (j30 != 0) {
                                                                    intent.putExtra("userId", j30);
                                                                }
                                                            }
                                                            if (!hl.m2() && !xea.B && this.f.m() == 1 && Build.VERSION.SDK_INT < 28) {
                                                                if (chat4 != null) {
                                                                    chat3 = chat4;
                                                                    TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                                                    if (chatPhoto != null && (fileLocation2 = chatPhoto.photo_small) != null && fileLocation2.volume_id != 0 && fileLocation2.local_id != 0) {
                                                                        fileLocation = fileLocation2;
                                                                        user = X1;
                                                                    }
                                                                    user = X1;
                                                                } else {
                                                                    chat3 = chat4;
                                                                    if (X1 != null) {
                                                                        user = X1;
                                                                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                                                        if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                                                        }
                                                                    }
                                                                    user = X1;
                                                                }
                                                                String str24 = str3;
                                                                intent.putExtra(str24, this.currentAccount);
                                                                PendingIntent activity = PendingIntent.getActivity(a.b, 0, intent, 1140850688);
                                                                wn7Var.e(str14);
                                                                wn7Var.F.icon = R.drawable.notification;
                                                                wn7Var.f(16, true);
                                                                wn7Var.i = this.J;
                                                                wn7Var.g = activity;
                                                                wn7Var.q = this.f0;
                                                                wn7Var.r = true;
                                                                wn7Var.k = true;
                                                                wn7Var.F.when = r47Var.k.date * j;
                                                                wn7Var.w = -15618822;
                                                                wn7Var.u = "msg";
                                                                if (chat3 == null && user != null && (str15 = user.phone) != null && str15.length() > 0) {
                                                                    str16 = "tel:+" + user.phone;
                                                                    if (!str16.isEmpty()) {
                                                                        wn7Var.G.add(str16);
                                                                    }
                                                                }
                                                                Intent intent2 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                                                intent2.putExtra("messageDate", r47Var.k.date);
                                                                intent2.putExtra(str24, this.currentAccount);
                                                                if (r47Var.K) {
                                                                    intent2.putExtra("story", true);
                                                                }
                                                                if (r47Var.J) {
                                                                    i22 = 1;
                                                                    intent2.putExtra("storyReaction", true);
                                                                } else {
                                                                    i22 = 1;
                                                                }
                                                                wn7Var.F.deleteIntent = PendingIntent.getBroadcast(a.b, i22, intent2, 167772160);
                                                                if (bitmap2 != null) {
                                                                    wn7Var.g(bitmap2);
                                                                } else if (fileLocation != null) {
                                                                    BitmapDrawable y = in5.z().y(fileLocation);
                                                                    if (y != null) {
                                                                        wn7Var.g(y.getBitmap());
                                                                    } else {
                                                                        try {
                                                                            getFileLoader().getClass();
                                                                            File K = xb4.K(fileLocation, true);
                                                                            if (K.exists()) {
                                                                                float L = 160.0f / hl.L(50.0f);
                                                                                BitmapFactory.Options options = new BitmapFactory.Options();
                                                                                options.inSampleSize = L < 1.0f ? 1 : (int) L;
                                                                                Bitmap decodeFile = BitmapFactory.decodeFile(K.getAbsolutePath(), options);
                                                                                if (decodeFile != null) {
                                                                                    wn7Var.g(decodeFile);
                                                                                }
                                                                            }
                                                                        } catch (Throwable unused) {
                                                                        }
                                                                    }
                                                                }
                                                                boolean z37 = z10;
                                                                if (z || z37) {
                                                                    wn7Var.j = -1;
                                                                } else if (i9 == 0) {
                                                                    wn7Var.j = 0;
                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                        i14 = 3;
                                                                    }
                                                                    i14 = 0;
                                                                } else {
                                                                    int i43 = 1;
                                                                    if (i9 != 1) {
                                                                        if (i9 == 2) {
                                                                            i43 = 1;
                                                                        } else {
                                                                            if (i9 == 4) {
                                                                                wn7Var.j = -2;
                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                    i14 = 1;
                                                                                }
                                                                            } else if (i9 == 5) {
                                                                                wn7Var.j = -1;
                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                    i14 = 2;
                                                                                }
                                                                            }
                                                                            i14 = 0;
                                                                        }
                                                                    }
                                                                    wn7Var.j = i43;
                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                        i14 = 4;
                                                                    }
                                                                    i14 = 0;
                                                                }
                                                                if (z37 || z15) {
                                                                    i15 = i12;
                                                                    long[] jArr3 = {0, 0};
                                                                    wn7Var.F.vibrate = jArr3;
                                                                    jArr = jArr3;
                                                                    uri = null;
                                                                } else {
                                                                    if (z12 || (sharedPreferences2.getBoolean("EnableInAppPreview", true) && str9 != null)) {
                                                                        wn7Var.k(str9.length() > 100 ? str9.substring(0, 100).replace('\n', ' ').trim() + "..." : str9);
                                                                    }
                                                                    if (str11 != null && !str11.equalsIgnoreCase("NoSound")) {
                                                                        int i44 = Build.VERSION.SDK_INT;
                                                                        if (i44 >= 26) {
                                                                            if (str11.equalsIgnoreCase("Default") || str11.equals(path)) {
                                                                                uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                                                                            } else if (z22) {
                                                                                Context context = a.b;
                                                                                StringBuilder sb4 = new StringBuilder();
                                                                                a.d();
                                                                                sb4.append("org.telegram.messenger.beta");
                                                                                sb4.append(".provider");
                                                                                uri = FileProvider.c(context, sb4.toString(), new File(str11));
                                                                                a.b.grantUriPermission("com.android.systemui", uri, 1);
                                                                            } else {
                                                                                uri = Uri.parse(str11);
                                                                            }
                                                                            if (i12 == 0) {
                                                                                Notification notification = wn7Var.F;
                                                                                i15 = i12;
                                                                                notification.ledARGB = i15;
                                                                                notification.ledOnMS = 1000;
                                                                                notification.ledOffMS = 1000;
                                                                                notification.flags = (notification.flags & (-2)) | 1;
                                                                            } else {
                                                                                i15 = i12;
                                                                            }
                                                                            i21 = i11;
                                                                            if (i21 != 2) {
                                                                                jArr = new long[]{0, 0};
                                                                                wn7Var.F.vibrate = jArr;
                                                                            } else if (i21 == 1) {
                                                                                jArr = new long[]{0, 100, 0, 100};
                                                                                wn7Var.F.vibrate = jArr;
                                                                            } else if (i21 == 0 || i21 == 4) {
                                                                                wn7Var.F.defaults = 2;
                                                                                jArr = new long[0];
                                                                            } else if (i21 == 3) {
                                                                                jArr = new long[]{0, 1000};
                                                                                wn7Var.F.vibrate = jArr;
                                                                            } else {
                                                                                jArr = null;
                                                                            }
                                                                        } else if (str11.equals(path)) {
                                                                            wn7Var.h(Settings.System.DEFAULT_NOTIFICATION_URI);
                                                                        } else {
                                                                            if (i44 >= 24) {
                                                                                String str25 = str2;
                                                                                if (str11.startsWith(str25) && !hl.G1(Uri.parse(str11), 0)) {
                                                                                    try {
                                                                                        Context context2 = a.b;
                                                                                        StringBuilder sb5 = new StringBuilder();
                                                                                        a.d();
                                                                                        sb5.append("org.telegram.messenger.beta");
                                                                                        sb5.append(".provider");
                                                                                        Uri c4 = FileProvider.c(context2, sb5.toString(), new File(str11.replace(str25, str10)));
                                                                                        a.b.grantUriPermission("com.android.systemui", c4, 1);
                                                                                        wn7Var.h(c4);
                                                                                    } catch (Exception unused2) {
                                                                                        wn7Var.h(Uri.parse(str11));
                                                                                    }
                                                                                }
                                                                            }
                                                                            wn7Var.h(Uri.parse(str11));
                                                                        }
                                                                    }
                                                                    uri = null;
                                                                    if (i12 == 0) {
                                                                    }
                                                                    i21 = i11;
                                                                    if (i21 != 2) {
                                                                    }
                                                                }
                                                                if (!hl.m2() && !xea.B && r47Var.A0() == 777000) {
                                                                    TLRPC.ReplyMarkup replyMarkup = r47Var.k.reply_markup;
                                                                    if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                                        int size = arrayList3.size();
                                                                        int i45 = 0;
                                                                        boolean z38 = false;
                                                                        while (i45 < size) {
                                                                            TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i45);
                                                                            int size2 = keyboardInlineButtonRow.buttons.size();
                                                                            boolean z39 = z38;
                                                                            int i46 = 0;
                                                                            while (i46 < size2) {
                                                                                TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow.buttons.get(i46);
                                                                                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) ehb.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                                                if (tL_inlineButtonTypeCallback != null) {
                                                                                    uri3 = uri;
                                                                                    i18 = i14;
                                                                                    i19 = size;
                                                                                    Intent intent3 = new Intent(a.b, (Class<?>) NotificationCallbackReceiver.class);
                                                                                    intent3.putExtra(str24, this.currentAccount);
                                                                                    i20 = i15;
                                                                                    long j32 = j14;
                                                                                    intent3.putExtra("did", j32);
                                                                                    byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                                    if (bArr != null) {
                                                                                        intent3.putExtra("data", bArr);
                                                                                    }
                                                                                    intent3.putExtra("mid", r47Var.e1());
                                                                                    String str26 = keyboardInlineButton.text;
                                                                                    Context context3 = a.b;
                                                                                    int i47 = this.I;
                                                                                    j14 = j32;
                                                                                    this.I = i47 + 1;
                                                                                    wn7Var.a(0, PendingIntent.getBroadcast(context3, i47, intent3, 167772160), str26);
                                                                                    z39 = true;
                                                                                } else {
                                                                                    uri3 = uri;
                                                                                    i18 = i14;
                                                                                    i19 = size;
                                                                                    i20 = i15;
                                                                                }
                                                                                i46++;
                                                                                uri = uri3;
                                                                                i14 = i18;
                                                                                size = i19;
                                                                                i15 = i20;
                                                                            }
                                                                            i45++;
                                                                            z38 = z39;
                                                                            size = size;
                                                                        }
                                                                        uri2 = uri;
                                                                        i16 = i14;
                                                                        i17 = i15;
                                                                        z24 = z38;
                                                                        if (!z24 && Build.VERSION.SDK_INT < 24 && xea.r.length() == 0 && u()) {
                                                                            Intent intent4 = new Intent(a.b, (Class<?>) PopupReplyReceiver.class);
                                                                            intent4.putExtra(str24, this.currentAccount);
                                                                            wn7Var.a(R.drawable.ic_ab_reply, PendingIntent.getBroadcast(a.b, 2, intent4, 167772160), ob6.L0(2131745990));
                                                                        }
                                                                        X(wn7Var, str22, j14, j12, str18, jArr, i17, uri2, i16, z23, z35, z15, i3);
                                                                        R();
                                                                        return;
                                                                    }
                                                                }
                                                                uri2 = uri;
                                                                i16 = i14;
                                                                i17 = i15;
                                                                z24 = false;
                                                                if (!z24) {
                                                                    Intent intent42 = new Intent(a.b, (Class<?>) PopupReplyReceiver.class);
                                                                    intent42.putExtra(str24, this.currentAccount);
                                                                    wn7Var.a(R.drawable.ic_ab_reply, PendingIntent.getBroadcast(a.b, 2, intent42, 167772160), ob6.L0(2131745990));
                                                                }
                                                                X(wn7Var, str22, j14, j12, str18, jArr, i17, uri2, i16, z23, z35, z15, i3);
                                                                R();
                                                                return;
                                                            }
                                                            user = X1;
                                                            chat3 = chat4;
                                                        }
                                                        fileLocation = null;
                                                        String str242 = str3;
                                                        intent.putExtra(str242, this.currentAccount);
                                                        PendingIntent activity2 = PendingIntent.getActivity(a.b, 0, intent, 1140850688);
                                                        wn7Var.e(str14);
                                                        wn7Var.F.icon = R.drawable.notification;
                                                        wn7Var.f(16, true);
                                                        wn7Var.i = this.J;
                                                        wn7Var.g = activity2;
                                                        wn7Var.q = this.f0;
                                                        wn7Var.r = true;
                                                        wn7Var.k = true;
                                                        wn7Var.F.when = r47Var.k.date * j;
                                                        wn7Var.w = -15618822;
                                                        wn7Var.u = "msg";
                                                        if (chat3 == null) {
                                                            str16 = "tel:+" + user.phone;
                                                            if (!str16.isEmpty()) {
                                                            }
                                                        }
                                                        Intent intent22 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                                        intent22.putExtra("messageDate", r47Var.k.date);
                                                        intent22.putExtra(str242, this.currentAccount);
                                                        if (r47Var.K) {
                                                        }
                                                        if (r47Var.J) {
                                                        }
                                                        wn7Var.F.deleteIntent = PendingIntent.getBroadcast(a.b, i22, intent22, 167772160);
                                                        if (bitmap2 != null) {
                                                        }
                                                        boolean z372 = z10;
                                                        if (z) {
                                                        }
                                                        wn7Var.j = -1;
                                                    }
                                                }
                                            }
                                            z23 = z36;
                                            user = X1;
                                            chat3 = chat4;
                                            fileLocation = null;
                                            String str2422 = str3;
                                            intent.putExtra(str2422, this.currentAccount);
                                            PendingIntent activity22 = PendingIntent.getActivity(a.b, 0, intent, 1140850688);
                                            wn7Var.e(str14);
                                            wn7Var.F.icon = R.drawable.notification;
                                            wn7Var.f(16, true);
                                            wn7Var.i = this.J;
                                            wn7Var.g = activity22;
                                            wn7Var.q = this.f0;
                                            wn7Var.r = true;
                                            wn7Var.k = true;
                                            wn7Var.F.when = r47Var.k.date * j;
                                            wn7Var.w = -15618822;
                                            wn7Var.u = "msg";
                                            if (chat3 == null) {
                                            }
                                            Intent intent222 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                            intent222.putExtra("messageDate", r47Var.k.date);
                                            intent222.putExtra(str2422, this.currentAccount);
                                            if (r47Var.K) {
                                            }
                                            if (r47Var.J) {
                                            }
                                            wn7Var.F.deleteIntent = PendingIntent.getBroadcast(a.b, i22, intent222, 167772160);
                                            if (bitmap2 != null) {
                                            }
                                            boolean z3722 = z10;
                                            if (z) {
                                            }
                                            wn7Var.j = -1;
                                        }
                                    }
                                    i7 = 4;
                                    if (i6 == i7) {
                                    }
                                    if (TextUtils.isEmpty(str11)) {
                                    }
                                    str11 = string;
                                    z14 = z17;
                                    z19 = true;
                                    z20 = z18;
                                    if (i != 3) {
                                    }
                                    i8 = i5;
                                    if (num != null) {
                                        i4 = num.intValue();
                                        z19 = false;
                                    }
                                    if (i2 != 0) {
                                    }
                                    i2 = i6;
                                    str13 = str12;
                                    z21 = z19;
                                    if (z12) {
                                    }
                                    if (z20) {
                                        ringerMode = p0.getRingerMode();
                                        if (ringerMode != 0) {
                                            i10 = 2;
                                        }
                                    }
                                    if (z15) {
                                    }
                                    Intent intent5 = new Intent(a.b, (Class<?>) LaunchActivity.class);
                                    StringBuilder sb32 = new StringBuilder();
                                    sb32.append("com.tmessages.openchat");
                                    boolean z362 = z21;
                                    sb32.append(Math.random());
                                    sb32.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    intent5.setAction(sb32.toString());
                                    intent5.setFlags(67108864);
                                    if (r47Var.O) {
                                    }
                                    if (r47Var.J) {
                                    }
                                    z23 = z362;
                                    user = X1;
                                    chat3 = chat4;
                                    fileLocation = null;
                                    String str24222 = str3;
                                    intent5.putExtra(str24222, this.currentAccount);
                                    PendingIntent activity222 = PendingIntent.getActivity(a.b, 0, intent5, 1140850688);
                                    wn7Var.e(str14);
                                    wn7Var.F.icon = R.drawable.notification;
                                    wn7Var.f(16, true);
                                    wn7Var.i = this.J;
                                    wn7Var.g = activity222;
                                    wn7Var.q = this.f0;
                                    wn7Var.r = true;
                                    wn7Var.k = true;
                                    wn7Var.F.when = r47Var.k.date * j;
                                    wn7Var.w = -15618822;
                                    wn7Var.u = "msg";
                                    if (chat3 == null) {
                                    }
                                    Intent intent2222 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                    intent2222.putExtra("messageDate", r47Var.k.date);
                                    intent2222.putExtra(str24222, this.currentAccount);
                                    if (r47Var.K) {
                                    }
                                    if (r47Var.J) {
                                    }
                                    wn7Var.F.deleteIntent = PendingIntent.getBroadcast(a.b, i22, intent2222, 167772160);
                                    if (bitmap2 != null) {
                                    }
                                    boolean z37222 = z10;
                                    if (z) {
                                    }
                                    wn7Var.j = -1;
                                }
                            }
                            z11 = z33;
                            String path2 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                            z12 = a.x;
                            boolean z352 = !z12;
                            p(j8, j11, false);
                            if (this.h0.e(j8, j11)) {
                            }
                            String str222 = str5;
                            if (r47Var.I) {
                            }
                            z15 = z11;
                            j14 = j13;
                            str12 = L02;
                            j15 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                            if (j15 == 0) {
                            }
                            int i352 = sharedPreferences2.getInt("vibrate_react", 0);
                            int i362 = sharedPreferences2.getInt("priority_react", 1);
                            int i372 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                            z17 = z16;
                            i3 = !r47Var.J ? 5 : 4;
                            i4 = i372;
                            i5 = i362;
                            i6 = i352;
                            i7 = 4;
                            if (i6 == i7) {
                            }
                            if (TextUtils.isEmpty(str11)) {
                            }
                            str11 = string;
                            z14 = z17;
                            z19 = true;
                            z20 = z18;
                            if (i != 3) {
                            }
                            i8 = i5;
                            if (num != null) {
                            }
                            if (i2 != 0) {
                            }
                            i2 = i6;
                            str13 = str12;
                            z21 = z19;
                            if (z12) {
                            }
                            if (z20) {
                            }
                            if (z15) {
                            }
                            Intent intent52 = new Intent(a.b, (Class<?>) LaunchActivity.class);
                            StringBuilder sb322 = new StringBuilder();
                            sb322.append("com.tmessages.openchat");
                            boolean z3622 = z21;
                            sb322.append(Math.random());
                            sb322.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                            intent52.setAction(sb322.toString());
                            intent52.setFlags(67108864);
                            if (r47Var.O) {
                            }
                            if (r47Var.J) {
                            }
                            z23 = z3622;
                            user = X1;
                            chat3 = chat4;
                            fileLocation = null;
                            String str242222 = str3;
                            intent52.putExtra(str242222, this.currentAccount);
                            PendingIntent activity2222 = PendingIntent.getActivity(a.b, 0, intent52, 1140850688);
                            wn7Var.e(str14);
                            wn7Var.F.icon = R.drawable.notification;
                            wn7Var.f(16, true);
                            wn7Var.i = this.J;
                            wn7Var.g = activity2222;
                            wn7Var.q = this.f0;
                            wn7Var.r = true;
                            wn7Var.k = true;
                            wn7Var.F.when = r47Var.k.date * j;
                            wn7Var.w = -15618822;
                            wn7Var.u = "msg";
                            if (chat3 == null) {
                            }
                            Intent intent22222 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                            intent22222.putExtra("messageDate", r47Var.k.date);
                            intent22222.putExtra(str242222, this.currentAccount);
                            if (r47Var.K) {
                            }
                            if (r47Var.J) {
                            }
                            wn7Var.F.deleteIntent = PendingIntent.getBroadcast(a.b, i22, intent22222, 167772160);
                            if (bitmap2 != null) {
                            }
                            boolean z372222 = z10;
                            if (z) {
                            }
                            wn7Var.j = -1;
                        }
                    } else {
                        str4 = L0;
                    }
                    L02 = str4;
                    if (z4) {
                    }
                    wn7 wn7Var2 = new wn7(a.b);
                    TLRPC.Chat chat42 = chat2;
                    if (this.a.size() > 1) {
                    }
                    sharedPreferences = d;
                    j10 = j22;
                    String str192 = str;
                    boolean[] zArr22 = new boolean[1];
                    r = r(r47Var, zArr22);
                    if (r47Var.k.silent) {
                    }
                    if (r == null) {
                    }
                }
            }
            L0 = z31 ? j20 != j2 ? ob6.L0(2131747748) : ob6.L0(2131747745) : ob6.L0(R.string.AppName);
            z5 = false;
            if (r47Var.I) {
            }
            str4 = L0;
            if (!d.getBoolean("EnableReactionsPreview", true)) {
            }
            L02 = str4;
            if (z4) {
            }
            wn7 wn7Var22 = new wn7(a.b);
            TLRPC.Chat chat422 = chat2;
            if (this.a.size() > 1) {
            }
            sharedPreferences = d;
            j10 = j22;
            String str1922 = str;
            boolean[] zArr222 = new boolean[1];
            r = r(r47Var, zArr222);
            if (r47Var.k.silent) {
            }
            if (r == null) {
            }
        } catch (Exception e2) {
            cc4.f(e2);
        }
    }

    public final void a0(long j, String str) {
        l0.c(new cq6((Object) this, (Object) str, j, (byte) 22));
    }

    public final void b(r47 r47Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                arrayList.add(0, r47Var);
                return;
            } else if (((r47) arrayList.get(i)).e1() == r47Var.e1() && r47.B0(((r47) arrayList.get(i)).k) == r47.B0(r47Var.k) && ((r47) arrayList.get(i)).K == r47Var.K) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b0(int i) {
        SharedPreferences d = getAccountInstance().d();
        byte b = 0;
        if (i == 4 || i == 5) {
            TL_account.setReactionsNotifySettings setreactionsnotifysettings = new TL_account.setReactionsNotifySettings();
            setreactionsnotifysettings.settings = new TL_account.TL_reactionsNotifySettings();
            if (d.getBoolean("EnableReactionsMessages", true)) {
                setreactionsnotifysettings.settings.flags |= 1;
                boolean z = d.getBoolean("EnableReactionsMessagesContacts", false);
                TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings = setreactionsnotifysettings.settings;
                if (z) {
                    tL_reactionsNotifySettings.messages_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
                } else {
                    tL_reactionsNotifySettings.messages_notify_from = new TL_account.TL_reactionNotificationsFromAll();
                }
            }
            if (d.getBoolean("EnableReactionsStories", true)) {
                setreactionsnotifysettings.settings.flags |= 2;
                boolean z2 = d.getBoolean("EnableReactionsStoriesContacts", false);
                TL_account.TL_reactionsNotifySettings tL_reactionsNotifySettings2 = setreactionsnotifysettings.settings;
                if (z2) {
                    tL_reactionsNotifySettings2.stories_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
                } else {
                    tL_reactionsNotifySettings2.stories_notify_from = new TL_account.TL_reactionNotificationsFromAll();
                }
            }
            setreactionsnotifysettings.settings.show_previews = d.getBoolean("EnableReactionsPreview", true);
            setreactionsnotifysettings.settings.sound = m(d, "ReactionSound", "ReactionSoundDocId", "ReactionSoundPath");
            getConnectionsManager().sendRequest(setreactionsnotifysettings, new xe2(b));
            return;
        }
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
        updatenotifysettings.settings = tL_inputPeerNotifySettings;
        tL_inputPeerNotifySettings.flags = 5;
        if (i == 0) {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
            updatenotifysettings.settings.mute_until = d.getInt("EnableGroup2", 0);
            updatenotifysettings.settings.show_previews = d.getBoolean("EnablePreviewGroup", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings2.flags |= 8;
            tL_inputPeerNotifySettings2.sound = m(d, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
        } else if (i == 1 || i == 3) {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
            updatenotifysettings.settings.mute_until = d.getInt("EnableAll2", 0);
            updatenotifysettings.settings.show_previews = d.getBoolean("EnablePreviewAll", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 128;
            tL_inputPeerNotifySettings3.stories_hide_sender = d.getBoolean("EnableHideStoriesSenders", false);
            if (d.contains("EnableAllStories")) {
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings4.flags |= 64;
                tL_inputPeerNotifySettings4.stories_muted = !d.getBoolean("EnableAllStories", true);
            }
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings5.flags |= 8;
            tL_inputPeerNotifySettings5.sound = m(d, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings6 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings6.flags |= 256;
            tL_inputPeerNotifySettings6.stories_sound = m(d, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
        } else {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
            updatenotifysettings.settings.mute_until = d.getInt("EnableChannel2", 0);
            updatenotifysettings.settings.show_previews = d.getBoolean("EnablePreviewChannel", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings7.flags |= 8;
            tL_inputPeerNotifySettings7.sound = m(d, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new xe2(b));
    }

    public final void c0(long j, long j2, boolean z) {
        byte b = 0;
        if (z) {
            getNotificationCenter().k(jn7.f0, new Object[0]);
        }
        if (wf3.B(j)) {
            return;
        }
        SharedPreferences d = getAccountInstance().d();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String p = p(j, j2, false);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = updatenotifysettings.settings;
        tL_inputPeerNotifySettings.flags |= 1;
        tL_inputPeerNotifySettings.show_previews = d.getBoolean("content_preview_" + p, true);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings2.flags = tL_inputPeerNotifySettings2.flags | 2;
        tL_inputPeerNotifySettings2.silent = d.getBoolean("silent_" + p, false);
        if (d.contains("stories_" + p)) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 64;
            tL_inputPeerNotifySettings3.stories_muted = !d.getBoolean("stories_" + p, true);
        }
        int i = d.getInt("notify2_" + p(j, j2, false), -1);
        if (i != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i == 3) {
                tL_inputPeerNotifySettings4.mute_until = d.getInt("notifyuntil_" + p(j, j2, false), 0);
            } else {
                tL_inputPeerNotifySettings4.mute_until = i != 2 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
        }
        long j3 = d.getLong("sound_document_id_" + p(j, j2, false), 0L);
        String string = d.getString("sound_path_" + p(j, j2, false), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags = tL_inputPeerNotifySettings5.flags | 8;
        if (j3 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j3;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string == null) {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        } else if (string.equalsIgnoreCase("NoSound")) {
            updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
        } else {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
            tL_notificationSoundLocal.title = d.getString("sound_" + p(j, j2, false), null);
            tL_notificationSoundLocal.data = string;
            updatenotifysettings.settings.sound = tL_notificationSoundLocal;
        }
        if (j2 == 0 || j == getUserConfig().e()) {
            int i2 = this.currentAccount;
            if (j >= 0 || !xc2.Y(uc7.s1(i2).M0(Long.valueOf(-j)))) {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().j1(j);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            } else {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().h1(-j);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            }
        } else {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().j1(j);
            tL_inputNotifyForumTopic.top_msg_id = (int) j2;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new xe2(b));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4 A[Catch: Exception -> 0x0191, TryCatch #0 {Exception -> 0x0191, blocks: (B:13:0x0027, B:16:0x005f, B:17:0x0067, B:20:0x007b, B:22:0x009a, B:24:0x00a6, B:25:0x00ac, B:27:0x00b4, B:29:0x00b8, B:31:0x00bb, B:33:0x00c8, B:35:0x00cc, B:37:0x00d1, B:38:0x00d8, B:40:0x00dc, B:41:0x00e1, B:43:0x0106, B:44:0x010e, B:46:0x0117, B:48:0x013f, B:50:0x014a, B:55:0x0158, B:59:0x0175, B:60:0x017c, B:61:0x017d, B:64:0x0122, B:67:0x012f, B:69:0x0134, B:70:0x010a, B:71:0x0181, B:72:0x0188, B:73:0x0189, B:74:0x0190, B:76:0x0077, B:77:0x0063), top: B:12:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189 A[Catch: Exception -> 0x0191, TryCatch #0 {Exception -> 0x0191, blocks: (B:13:0x0027, B:16:0x005f, B:17:0x0067, B:20:0x007b, B:22:0x009a, B:24:0x00a6, B:25:0x00ac, B:27:0x00b4, B:29:0x00b8, B:31:0x00bb, B:33:0x00c8, B:35:0x00cc, B:37:0x00d1, B:38:0x00d8, B:40:0x00dc, B:41:0x00e1, B:43:0x0106, B:44:0x010e, B:46:0x0117, B:48:0x013f, B:50:0x014a, B:55:0x0158, B:59:0x0175, B:60:0x017c, B:61:0x017d, B:64:0x0122, B:67:0x012f, B:69:0x0134, B:70:0x010a, B:71:0x0181, B:72:0x0188, B:73:0x0189, B:74:0x0190, B:76:0x0077, B:77:0x0063), top: B:12:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String d(wn7 wn7Var, long j, String str, TLRPC.User user, TLRPC.Chat chat, b78 b78Var, boolean z) {
        Bitmap bitmap;
        IconCompat d;
        if (Build.VERSION.SDK_INT < 29 || !xea.n0) {
            return null;
        }
        if (xc2.T(chat) && !chat.megagroup) {
            return null;
        }
        try {
            String str2 = "ndid_" + j;
            Intent intent = new Intent(a.b, (Class<?>) OpenChatReceiver.class);
            intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
            if (j > 0) {
                intent.putExtra("userId", j);
            } else {
                intent.putExtra("chatId", -j);
            }
            Context context = a.b;
            hka hkaVar = new hka();
            hkaVar.a = context;
            hkaVar.b = str2;
            hkaVar.e = chat != null ? str : lbc.k(user, true);
            hkaVar.f = str;
            new Intent("android.intent.action.VIEW");
            hkaVar.c = new Intent[]{intent};
            hkaVar.l = true;
            hkaVar.k = new yd6(str2);
            if (b78Var != null) {
                hkaVar.i = new b78[]{b78Var};
                IconCompat iconCompat = b78Var.b;
                hkaVar.h = iconCompat;
                if (iconCompat != null) {
                    bitmap = iconCompat.f();
                    if (!TextUtils.isEmpty(hkaVar.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = hkaVar.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    mka.m(a.b, hkaVar);
                    String str3 = hkaVar.b;
                    wn7Var.z = str3;
                    if (wn7Var.A == null) {
                        yd6 yd6Var = hkaVar.k;
                        if (yd6Var != null) {
                            wn7Var.A = yd6Var;
                        } else if (str3 != null) {
                            wn7Var.A = new yd6(str3);
                        }
                    }
                    if (wn7Var.e == null) {
                        wn7Var.e(hkaVar.e);
                    }
                    Intent intent2 = new Intent(a.b, (Class<?>) BubbleActivity.class);
                    intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    if (wf3.D(j)) {
                        intent2.putExtra("userId", j);
                    } else {
                        intent2.putExtra("chatId", -j);
                    }
                    intent2.putExtra("currentAccount", this.currentAccount);
                    if (bitmap != null) {
                        d = new IconCompat(5);
                        d.b = bitmap;
                    } else if (user != null) {
                        d = IconCompat.d(a.b, user.bot ? R.drawable.book_bot : R.drawable.book_user);
                    } else {
                        d = IconCompat.d(a.b, R.drawable.book_group);
                    }
                    if (!z) {
                        wn7Var.E = null;
                        return str2;
                    }
                    PendingIntent activity = PendingIntent.getActivity(a.b, 0, intent2, 167772160);
                    if (activity == null) {
                        throw new NullPointerException("Bubble requires non-null pending intent");
                    }
                    int i = (this.G > j ? 1 : (this.G == j ? 0 : -1)) == 0 ? 2 : 0;
                    int max = Math.max(hl.L(640.0f), 0);
                    un7 un7Var = new un7();
                    un7Var.a = activity;
                    un7Var.b = d;
                    un7Var.c = max;
                    un7Var.d = i & (-2);
                    wn7Var.E = un7Var;
                    return str2;
                }
            }
            bitmap = null;
            if (!TextUtils.isEmpty(hkaVar.e)) {
            }
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public final void d0() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            ArrayList arrayList = this.E;
            if (i >= arrayList.size()) {
                break;
            }
            Iterator it = ((hp7) arrayList.get(i)).c.values().iterator();
            while (it.hasNext()) {
                j = Math.min(j, ((Long) ((Pair) it.next()).second).longValue());
            }
            i++;
        }
        to3 to3Var = l0;
        vo7 vo7Var = this.j0;
        to3Var.a(vo7Var);
        long currentTimeMillis = j - System.currentTimeMillis();
        if (j != Long.MAX_VALUE) {
            to3Var.d(vo7Var, Math.max(0L, currentTimeMillis));
        }
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.Y1) {
            l0.c(new ql7(this, (String) objArr[0], (byte) 6));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0a59  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0952 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0961 A[LOOP:3: B:138:0x095e->B:140:0x0961, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0980 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0991 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x09aa  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0858  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0925 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e0(long j, long j2, String str, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        String str2;
        String str3;
        boolean z4;
        String str4;
        int i4;
        int i5;
        SharedPreferences.Editor remove;
        StringBuilder sb;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i6;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        boolean z5;
        String a;
        String a0;
        String str19;
        String string;
        String str20;
        String str21;
        StringBuilder sb2;
        String str22;
        SharedPreferences sharedPreferences;
        String str23;
        String str24;
        boolean z6;
        boolean z7;
        long j3;
        long j4;
        long[] jArr2;
        int i7;
        String str25;
        String str26;
        String str27;
        String str28;
        boolean z8;
        StringBuilder sb3;
        int i8;
        String str29;
        String str30;
        Uri uri2;
        String str31;
        String str32;
        boolean z9;
        Uri uri3;
        long[] jArr3;
        boolean z10;
        String str33;
        String str34;
        String str35;
        boolean z11;
        boolean z12;
        int i9;
        String str36;
        boolean z13;
        long[] jArr4;
        SharedPreferences.Editor editor;
        boolean z14;
        boolean z15;
        SharedPreferences.Editor editor2;
        long j5;
        int i10;
        SharedPreferences.Editor editor3;
        boolean z16;
        boolean z17;
        String sb4;
        String str37;
        SharedPreferences d = getAccountInstance().d();
        Boolean bool = this.Q;
        if (bool == null) {
            bool = Boolean.valueOf(d.getBoolean("groupsCreated5", false));
            this.Q = bool;
        }
        String str38 = "vibrate_";
        String str39 = "vibrate_react";
        if (bool.booleanValue()) {
            str2 = "vibrate_react";
            str3 = "vibrate_";
        } else {
            try {
                String str40 = this.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = n0.getNotificationChannels();
                int size = notificationChannels.size();
                int i11 = 0;
                SharedPreferences.Editor editor4 = null;
                while (i11 < size) {
                    NotificationChannel c = hz6.c(notificationChannels.get(i11));
                    List<NotificationChannel> list = notificationChannels;
                    String id = c.getId();
                    if (id.startsWith(str40)) {
                        str4 = str40;
                        int importance = c.getImportance();
                        i4 = size;
                        if (importance != 4 && importance != 5 && !id.contains("_ia_")) {
                            if (id.contains("_channels_")) {
                                SharedPreferences.Editor edit = editor4 == null ? getAccountInstance().d().edit() : editor4;
                                editor4 = edit;
                                edit.remove("priority_channel").remove("vibrate_channel").remove("ChannelSoundPath").remove("ChannelSound");
                            } else if (id.contains("_reactions_")) {
                                SharedPreferences.Editor edit2 = editor4 == null ? getAccountInstance().d().edit() : editor4;
                                editor4 = edit2;
                                edit2.remove("priority_react").remove(str39).remove("ReactionSoundPath").remove("ReactionSound");
                            } else if (id.contains("_groups_")) {
                                SharedPreferences.Editor edit3 = editor4 == null ? getAccountInstance().d().edit() : editor4;
                                editor4 = edit3;
                                edit3.remove("priority_group").remove("vibrate_group").remove("GroupSoundPath").remove("GroupSound");
                            } else if (id.contains("_private_")) {
                                SharedPreferences.Editor edit4 = editor4 == null ? getAccountInstance().d().edit() : editor4;
                                edit4.remove("priority_messages");
                                editor4 = edit4;
                                edit4.remove("priority_group").remove("vibrate_messages").remove("GlobalSoundPath").remove("GlobalSound");
                            } else {
                                i5 = i11;
                                long longValue = Utilities.A(id.substring(9, id.indexOf(95, 9))).longValue();
                                if (longValue != 0) {
                                    SharedPreferences.Editor edit5 = editor4 == null ? getAccountInstance().d().edit() : editor4;
                                    str2 = str39;
                                    try {
                                        editor4 = edit5;
                                        remove = edit5.remove("priority_" + longValue).remove(str38 + longValue);
                                        sb = new StringBuilder();
                                        str3 = str38;
                                    } catch (Exception e) {
                                        e = e;
                                        str3 = str38;
                                        z4 = true;
                                        cc4.g(e, true);
                                        d.edit().putBoolean("groupsCreated5", z4).commit();
                                        this.Q = Boolean.TRUE;
                                        String str41 = "stories";
                                        if (this.R) {
                                        }
                                        SharedPreferences d2 = getAccountInstance().d();
                                        if (z3) {
                                        }
                                        if (z) {
                                        }
                                        if (z2) {
                                        }
                                        a = Utilities.a(uri == null ? "NoSound2" : uri.toString());
                                        if (a != null) {
                                            a = a.substring(0, 5);
                                        }
                                        if (z3) {
                                        }
                                        String y = qd4.y(str41, "_", a);
                                        string = d2.getString(y, null);
                                        String string2 = d2.getString(y.concat("_s"), null);
                                        StringBuilder sb5 = new StringBuilder();
                                        if (string != null) {
                                        }
                                        str25 = str16;
                                        str26 = str20;
                                        z5 = z7;
                                        str27 = str21;
                                        str28 = null;
                                        z8 = false;
                                        if (!z8) {
                                        }
                                        if (!z5) {
                                        }
                                        while (r3 < jArr2.length) {
                                        }
                                        sb3 = sb2;
                                        sb3.append(i7);
                                        if (uri != null) {
                                        }
                                        i8 = i2;
                                        sb3.append(i8);
                                        if (!z) {
                                        }
                                        str28 = Utilities.a(sb3.toString());
                                        if (!z3) {
                                        }
                                        str29 = str28;
                                        str30 = str26;
                                        if (str30 == null) {
                                        }
                                        return str30;
                                    }
                                    try {
                                        sb.append("sound_path_");
                                        sb.append(longValue);
                                        remove.remove(sb.toString()).remove("sound_" + longValue);
                                        n0.deleteNotificationChannel(id);
                                    } catch (Exception e2) {
                                        e = e2;
                                        z4 = true;
                                        cc4.g(e, true);
                                        d.edit().putBoolean("groupsCreated5", z4).commit();
                                        this.Q = Boolean.TRUE;
                                        String str412 = "stories";
                                        if (this.R) {
                                        }
                                        SharedPreferences d22 = getAccountInstance().d();
                                        if (z3) {
                                        }
                                        if (z) {
                                        }
                                        if (z2) {
                                        }
                                        a = Utilities.a(uri == null ? "NoSound2" : uri.toString());
                                        if (a != null) {
                                        }
                                        if (z3) {
                                        }
                                        String y2 = qd4.y(str412, "_", a);
                                        string = d22.getString(y2, null);
                                        String string22 = d22.getString(y2.concat("_s"), null);
                                        StringBuilder sb52 = new StringBuilder();
                                        if (string != null) {
                                        }
                                        str25 = str16;
                                        str26 = str20;
                                        z5 = z7;
                                        str27 = str21;
                                        str28 = null;
                                        z8 = false;
                                        if (!z8) {
                                        }
                                        if (!z5) {
                                        }
                                        while (r3 < jArr2.length) {
                                        }
                                        sb3 = sb2;
                                        sb3.append(i7);
                                        if (uri != null) {
                                        }
                                        i8 = i2;
                                        sb3.append(i8);
                                        if (!z) {
                                        }
                                        str28 = Utilities.a(sb3.toString());
                                        if (!z3) {
                                        }
                                        str29 = str28;
                                        str30 = str26;
                                        if (str30 == null) {
                                        }
                                        return str30;
                                    }
                                } else {
                                    str2 = str39;
                                    str3 = str38;
                                    n0.deleteNotificationChannel(id);
                                }
                            }
                        }
                        str2 = str39;
                        i5 = i11;
                        str3 = str38;
                        n0.deleteNotificationChannel(id);
                    } else {
                        str4 = str40;
                        str2 = str39;
                        i4 = size;
                        i5 = i11;
                        str3 = str38;
                    }
                    i11 = i5 + 1;
                    size = i4;
                    notificationChannels = list;
                    str40 = str4;
                    str39 = str2;
                    str38 = str3;
                }
                str2 = str39;
                str3 = str38;
                if (editor4 != null) {
                    editor4.commit();
                }
                z4 = true;
            } catch (Exception e3) {
                e = e3;
                str2 = str39;
            }
            d.edit().putBoolean("groupsCreated5", z4).commit();
            this.Q = Boolean.TRUE;
        }
        String str4122 = "stories";
        if (this.R) {
            str5 = "priority_group";
            str6 = "reactions";
            str7 = "priority_";
            str8 = "priority_channel";
            str9 = "vibrate_channel";
            str10 = "priority_react";
            str11 = "vibrate_messages";
            str12 = "priority_messages";
            str13 = "vibrate_group";
        } else {
            List<NotificationChannelGroup> notificationChannelGroups = n0.getNotificationChannelGroups();
            str11 = "vibrate_messages";
            StringBuilder sb6 = new StringBuilder("channels");
            str13 = "vibrate_group";
            sb6.append(this.currentAccount);
            String sb7 = sb6.toString();
            String str42 = "groups" + this.currentAccount;
            String str43 = "private" + this.currentAccount;
            String str44 = "stories" + this.currentAccount;
            String str45 = "reactions" + this.currentAccount;
            String str46 = "other" + this.currentAccount;
            int size2 = notificationChannelGroups.size();
            str5 = "priority_group";
            String str47 = str43;
            str10 = "priority_react";
            String str48 = str44;
            str12 = "priority_messages";
            String str49 = str45;
            str7 = "priority_";
            String str50 = str42;
            str9 = "vibrate_channel";
            String str51 = sb7;
            str8 = "priority_channel";
            String str52 = str46;
            int i12 = 0;
            while (i12 < size2) {
                List<NotificationChannelGroup> list2 = notificationChannelGroups;
                String id2 = notificationChannelGroups.get(i12).getId();
                if (str51 != null && str51.equals(id2)) {
                    str51 = null;
                } else if (str50 != null && str50.equals(id2)) {
                    str50 = null;
                } else if (str48 != null && str48.equals(id2)) {
                    str48 = null;
                } else if (str49 != null && str49.equals(id2)) {
                    str49 = null;
                } else if (str47 != null && str47.equals(id2)) {
                    str47 = null;
                } else if (str52 != null && str52.equals(id2)) {
                    str52 = null;
                }
                if (str51 == null && str48 == null && str49 == null && str50 == null && str47 == null && str52 == null) {
                    break;
                }
                i12++;
                notificationChannelGroups = list2;
            }
            if (str51 == null && str50 == null && str49 == null && str48 == null && str47 == null && str52 == null) {
                str6 = "reactions";
            } else {
                TLRPC.User X1 = getMessagesController().X1(Long.valueOf(getUserConfig().e()));
                if (X1 == null) {
                    getUserConfig().f();
                    sb4 = "";
                    str6 = "reactions";
                } else {
                    StringBuilder sb8 = new StringBuilder(" (");
                    str6 = "reactions";
                    sb8.append(lv2.m(0, X1.first_name, X1.last_name));
                    sb8.append(")");
                    sb4 = sb8.toString();
                }
                ArrayList arrayList = new ArrayList();
                if (str51 != null) {
                    gk.f();
                    arrayList.add(new NotificationChannelGroup(str51, ob6.M0(2131747648, null).concat(sb4)));
                }
                if (str50 != null) {
                    gk.f();
                    str37 = null;
                    arrayList.add(new NotificationChannelGroup(str50, ob6.M0(2131747634, null).concat(sb4)));
                } else {
                    str37 = null;
                }
                if (str48 != null) {
                    gk.f();
                    arrayList.add(new NotificationChannelGroup(str48, ob6.M0(2131747592, str37).concat(sb4)));
                }
                if (str49 != null) {
                    gk.f();
                    arrayList.add(new NotificationChannelGroup(str49, ob6.M0(2131747604, str37).concat(sb4)));
                }
                if (str47 != null) {
                    gk.f();
                    arrayList.add(new NotificationChannelGroup(str47, ob6.M0(2131747605, str37).concat(sb4)));
                }
                if (str52 != null) {
                    gk.f();
                    arrayList.add(new NotificationChannelGroup(str52, ob6.M0(2131747618, str37).concat(sb4)));
                }
                n0.createNotificationChannelGroups(arrayList);
            }
            this.R = true;
        }
        SharedPreferences d222 = getAccountInstance().d();
        if (z3) {
            i6 = i3;
            str16 = "other" + this.currentAccount;
            str14 = str6;
            str15 = null;
        } else {
            i6 = i3;
            if (i6 == 2) {
                str17 = "channels" + this.currentAccount;
                str18 = "overwrite_channel";
            } else if (i6 == 0) {
                str17 = "groups" + this.currentAccount;
                str18 = "overwrite_group";
            } else if (i6 == 3) {
                str17 = "stories" + this.currentAccount;
                str18 = "overwrite_stories";
            } else if (i6 == 4 || i6 == 5) {
                str14 = str6;
                str15 = "overwrite_reactions";
                str16 = str14 + this.currentAccount;
            } else {
                str17 = "private" + this.currentAccount;
                str18 = "overwrite_private";
            }
            str16 = str17;
            str15 = str18;
            str14 = str6;
        }
        boolean z18 = z && wf3.B(j);
        z5 = z2 && str15 != null && d222.getBoolean(str15, false);
        a = Utilities.a(uri == null ? "NoSound2" : uri.toString());
        if (a != null && a.length() > 5) {
            a = a.substring(0, 5);
        }
        if (z3) {
            str4122 = "silent";
            str19 = ob6.M0(2131747599, null);
        } else {
            if (z) {
                a0 = ob6.M0(z2 ? 2131747632 : 2131747643, null);
                if (i6 == 2) {
                    str19 = a0;
                    str4122 = z2 ? "channels_ia" : "channels";
                } else if (i6 == 0) {
                    str19 = a0;
                    str4122 = z2 ? "groups_ia" : "groups";
                } else if (i6 == 3) {
                    if (z2) {
                        str4122 = "stories_ia";
                    }
                } else if (i6 == 4 || i6 == 5) {
                    if (z2) {
                        str14 = "reactions_ia";
                    }
                    str19 = a0;
                    str4122 = str14;
                } else {
                    str19 = a0;
                    str4122 = z2 ? "private_ia" : "private";
                }
            } else {
                a0 = z2 ? ob6.a0(null, null, 2131747646, str) : str;
                str4122 = (z2 ? "org.telegram.keyia" : "org.telegram.key") + j + "_" + j2;
            }
            str19 = a0;
        }
        String y22 = qd4.y(str4122, "_", a);
        string = d222.getString(y22, null);
        String string222 = d222.getString(y22.concat("_s"), null);
        StringBuilder sb522 = new StringBuilder();
        if (string != null) {
            NotificationChannel notificationChannel = n0.getNotificationChannel(string);
            if (f11.a) {
                str32 = "_";
                sharedPreferences = d222;
                cc4.b("current channel for " + string + " = " + notificationChannel);
            } else {
                str32 = "_";
                sharedPreferences = d222;
            }
            if (notificationChannel == null) {
                jArr2 = jArr;
                i7 = i;
                sb2 = sb522;
                str23 = str19;
                z6 = z18;
                j3 = 0;
                str22 = str32;
                j4 = j;
                str24 = "secret";
                str25 = str16;
                str27 = null;
                str26 = null;
                str28 = null;
                z8 = false;
                if (!z8) {
                }
                if (!z5) {
                }
                while (r3 < jArr2.length) {
                }
                sb3 = sb2;
                sb3.append(i7);
                if (uri != null) {
                }
                i8 = i2;
                sb3.append(i8);
                if (!z) {
                    sb3.append(str24);
                }
                str28 = Utilities.a(sb3.toString());
                if (!z3) {
                    n0.deleteNotificationChannel(str26);
                    if (f11.a) {
                    }
                    str29 = str28;
                    str30 = null;
                    if (str30 == null) {
                    }
                    return str30;
                }
                str29 = str28;
                str30 = str26;
                if (str30 == null) {
                }
                return str30;
            }
            if (!z3 && !z5) {
                int importance2 = notificationChannel.getImportance();
                Uri sound = notificationChannel.getSound();
                long[] vibrationPattern = notificationChannel.getVibrationPattern();
                boolean shouldVibrate = notificationChannel.shouldVibrate();
                if (shouldVibrate || vibrationPattern != null) {
                    z9 = shouldVibrate;
                    uri3 = sound;
                    jArr3 = vibrationPattern;
                } else {
                    z9 = shouldVibrate;
                    uri3 = sound;
                    jArr3 = new long[]{0, 0};
                }
                int lightColor = notificationChannel.getLightColor();
                str23 = str19;
                z6 = z18;
                if (jArr3 != null) {
                    int i13 = 0;
                    while (true) {
                        z10 = z5;
                        if (i13 >= jArr3.length) {
                            break;
                        }
                        sb522.append(jArr3[i13]);
                        i13++;
                        z5 = z10;
                    }
                } else {
                    z10 = z5;
                }
                sb522.append(lightColor);
                if (uri3 != null) {
                    sb522.append(uri3.toString());
                }
                sb522.append(importance2);
                if (!z && z6) {
                    sb522.append("secret");
                }
                if (f11.a) {
                    StringBuilder sb9 = new StringBuilder("current channel settings for ");
                    sb9.append(string);
                    sb9.append(" = ");
                    sb9.append((Object) sb522);
                    sb9.append(" old = ");
                    uh9.s(string222, sb9);
                }
                String a2 = Utilities.a(sb522.toString());
                sb522.setLength(0);
                if (z2 && i2 != importance2) {
                    i7 = i;
                    str33 = string;
                    str34 = string222;
                    sb2 = sb522;
                    j3 = 0;
                    str22 = str32;
                    z12 = false;
                    z11 = true;
                    jArr2 = jArr;
                    str35 = a2;
                    str24 = "secret";
                    str25 = str16;
                    j4 = j;
                } else if (a2.equals(string222)) {
                    i7 = i;
                    str33 = string;
                    str34 = string222;
                    sb2 = sb522;
                    j3 = 0;
                    str22 = str32;
                    jArr2 = jArr;
                    str35 = a2;
                    str24 = "secret";
                    str25 = str16;
                    j4 = j;
                    z11 = z10;
                    z12 = false;
                } else {
                    str33 = string;
                    str34 = string222;
                    sb2 = sb522;
                    if (importance2 == 0) {
                        SharedPreferences.Editor edit6 = sharedPreferences.edit();
                        if (z) {
                            if (z2) {
                                z16 = z9;
                                editor3 = edit6;
                                j3 = 0;
                                z15 = true;
                            } else {
                                if (i6 == 3) {
                                    edit6.putBoolean("EnableAllStories", false);
                                    z17 = true;
                                } else {
                                    z17 = true;
                                    if (i6 == 4) {
                                        edit6.putBoolean("EnableReactionsMessages", true);
                                        edit6.putBoolean("EnableReactionsStories", true);
                                    } else {
                                        edit6.putInt(k(i6), ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    }
                                }
                                b0(i6);
                                z16 = z9;
                                editor3 = edit6;
                                z15 = z17;
                                j3 = 0;
                            }
                            i10 = lightColor;
                        } else {
                            z15 = true;
                            if (i6 == 3) {
                                StringBuilder sb10 = new StringBuilder("stories_");
                                j5 = 0;
                                sb10.append(p(j, 0L, false));
                                edit6.putBoolean(sb10.toString(), false);
                                i10 = lightColor;
                                editor2 = edit6;
                            } else {
                                editor2 = edit6;
                                j5 = 0;
                                i10 = lightColor;
                                editor2.putInt("notify2_" + p(j, 0L, false), 2);
                            }
                            editor3 = editor2;
                            j3 = j5;
                            z16 = z9;
                            c0(j, 0L, true);
                        }
                        jArr4 = jArr3;
                        str25 = str16;
                        i9 = i10;
                        str22 = str32;
                        editor = editor3;
                        z13 = z16;
                        str35 = a2;
                        str24 = "secret";
                        z12 = z15;
                        str36 = str2;
                        j4 = j;
                    } else {
                        i9 = lightColor;
                        j3 = 0;
                        str22 = str32;
                        str35 = a2;
                        str24 = "secret";
                        str25 = str16;
                        str36 = str2;
                        z13 = z9;
                        jArr4 = jArr3;
                        j4 = j;
                        if (importance2 != i2) {
                            if (z2) {
                                editor = null;
                            } else {
                                SharedPreferences.Editor edit7 = sharedPreferences.edit();
                                int i14 = (importance2 == 4 || importance2 == 5) ? 1 : importance2 == 1 ? 4 : importance2 == 2 ? 5 : 0;
                                if (z) {
                                    if (i6 == 3) {
                                        edit7.putBoolean("EnableAllStories", true);
                                    } else if (i6 == 4) {
                                        edit7.putBoolean("EnableReactionsMessages", true);
                                        edit7.putBoolean("EnableReactionsStories", true);
                                    } else {
                                        edit7.putInt(k(i6), 0);
                                    }
                                    if (i6 == 2) {
                                        edit7.putInt(str8, i14);
                                    } else if (i6 == 0) {
                                        edit7.putInt(str5, i14);
                                    } else if (i6 == 3) {
                                        edit7.putInt("priority_stories", i14);
                                    } else if (i6 == 4 || i6 == 5) {
                                        edit7.putInt(str10, i14);
                                    } else {
                                        edit7.putInt(str12, i14);
                                    }
                                } else if (i6 == 3) {
                                    edit7.putBoolean("stories_" + j4, true);
                                } else {
                                    edit7.putInt("notify2_" + j4, 0);
                                    edit7.remove("notifyuntil_" + j4);
                                    edit7.putInt(str7 + j4, i14);
                                }
                                editor = edit7;
                            }
                            z12 = true;
                        } else {
                            z12 = false;
                            editor = null;
                        }
                    }
                    jArr2 = jArr;
                    if (jArr != null && jArr2.length != 0) {
                        for (long j6 : jArr2) {
                            if (j6 == j3) {
                            }
                        }
                        z14 = true;
                        if ((!z14) != z13) {
                            if (!z2) {
                                if (editor == null) {
                                    editor = sharedPreferences.edit();
                                }
                                if (!z) {
                                    editor.putInt(qu6.n(j4, str3), z13 ? 0 : 2);
                                } else if (i6 == 2) {
                                    editor.putInt(str9, z13 ? 0 : 2);
                                } else if (i6 == 0) {
                                    editor.putInt(str13, z13 ? 0 : 2);
                                } else if (i6 == 3) {
                                    editor.putInt("vibrate_stories", z13 ? 0 : 2);
                                } else if (i6 == 4 || i6 == 5) {
                                    editor.putInt(str36, z13 ? 0 : 2);
                                } else {
                                    editor.putInt(str11, z13 ? 0 : 2);
                                }
                            }
                            jArr2 = jArr4;
                            z12 = true;
                        }
                        i7 = i;
                        if (i9 != i7) {
                            if (!z2) {
                                if (editor == null) {
                                    editor = sharedPreferences.edit();
                                }
                                if (!z) {
                                    editor.putInt("color_" + j4, i9);
                                } else if (i6 == 2) {
                                    editor.putInt("ChannelLed", i9);
                                } else if (i6 == 0) {
                                    editor.putInt("GroupLed", i9);
                                } else if (i6 == 3) {
                                    editor.putInt("StoriesLed", i9);
                                } else if (i6 == 5 || i6 == 4) {
                                    editor.putInt("ReactionsLed", i9);
                                } else {
                                    editor.putInt("MessagesLed", i9);
                                }
                            }
                            i7 = i9;
                            z12 = true;
                        }
                        if (editor != null) {
                            editor.commit();
                        }
                        z11 = z10;
                    }
                    z14 = false;
                    if ((!z14) != z13) {
                    }
                    i7 = i;
                    if (i9 != i7) {
                    }
                    if (editor != null) {
                    }
                    z11 = z10;
                }
                str26 = str33;
                z8 = z12;
                z5 = z11;
                str28 = str35;
                str27 = str34;
                if (!z8 && str28 != null) {
                    sharedPreferences.edit().putString(y22, str26).putString(y22.concat("_s"), str28).commit();
                    if (f11.a) {
                        cc4.b("change edited channel " + str26);
                    }
                } else if (!z5 || str28 == null || !z2 || !z) {
                    for (long j7 : jArr2) {
                        sb2.append(j7);
                    }
                    sb3 = sb2;
                    sb3.append(i7);
                    if (uri != null) {
                        sb3.append(uri.toString());
                    }
                    i8 = i2;
                    sb3.append(i8);
                    if (!z && z6) {
                        sb3.append(str24);
                    }
                    str28 = Utilities.a(sb3.toString());
                    if (!z3 && str26 != null && (z5 || !str27.equals(str28))) {
                        try {
                            n0.deleteNotificationChannel(str26);
                        } catch (Exception e4) {
                            cc4.g(e4, true);
                        }
                        if (f11.a) {
                            cc4.b("delete channel by settings change ".concat(str26));
                        }
                        str29 = str28;
                        str30 = null;
                        if (str30 == null) {
                            int i15 = this.currentAccount;
                            str30 = z ? i15 + "channel_" + y22 + str22 + Utilities.b.nextLong() : i15 + "channel_" + j4 + str22 + Utilities.b.nextLong();
                            gk.g();
                            if (z6) {
                                uri2 = null;
                                str31 = ob6.M0(2131745421, null);
                            } else {
                                uri2 = null;
                                str31 = str23;
                            }
                            NotificationChannel notificationChannel2 = new NotificationChannel(str30, str31, i8);
                            notificationChannel2.setGroup(str25);
                            if (i7 != 0) {
                                notificationChannel2.enableLights(true);
                                notificationChannel2.setLightColor(i7);
                            } else {
                                notificationChannel2.enableLights(false);
                            }
                            if (jArr2 != null && jArr2.length != 0) {
                                for (long j8 : jArr2) {
                                    if (j8 == j3) {
                                    }
                                }
                                notificationChannel2.enableVibration(false);
                                AudioAttributes.Builder builder = new AudioAttributes.Builder();
                                builder.setContentType(4);
                                builder.setUsage(5);
                                if (uri == null) {
                                    notificationChannel2.setSound(uri, builder.build());
                                } else {
                                    notificationChannel2.setSound(uri2, builder.build());
                                }
                                if (f11.a) {
                                    cc4.b("create new channel ".concat(str30));
                                }
                                this.P = SystemClock.elapsedRealtime();
                                n0.createNotificationChannel(notificationChannel2);
                                sharedPreferences.edit().putString(y22, str30).putString(y22.concat("_s"), str29).commit();
                            }
                            notificationChannel2.enableVibration(true);
                            if (jArr2.length > 0) {
                                notificationChannel2.setVibrationPattern(jArr2);
                            }
                            AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                            builder2.setContentType(4);
                            builder2.setUsage(5);
                            if (uri == null) {
                            }
                            if (f11.a) {
                            }
                            this.P = SystemClock.elapsedRealtime();
                            n0.createNotificationChannel(notificationChannel2);
                            sharedPreferences.edit().putString(y22, str30).putString(y22.concat("_s"), str29).commit();
                        }
                        return str30;
                    }
                    str29 = str28;
                    str30 = str26;
                    if (str30 == null) {
                    }
                    return str30;
                }
                i8 = i2;
                str29 = str28;
                str30 = str26;
                if (str30 == null) {
                }
                return str30;
            }
            i7 = i;
            str20 = string;
            str21 = string222;
            sb2 = sb522;
            str23 = str19;
            z6 = z18;
            z7 = z5;
            j3 = 0;
            str22 = str32;
            j4 = j;
            jArr2 = jArr;
            str24 = "secret";
        } else {
            str20 = string;
            str21 = string222;
            sb2 = sb522;
            str22 = "_";
            sharedPreferences = d222;
            str23 = str19;
            str24 = "secret";
            z6 = z18;
            z7 = z5;
            j3 = 0;
            j4 = j;
            jArr2 = jArr;
            i7 = i;
        }
        str25 = str16;
        str26 = str20;
        z5 = z7;
        str27 = str21;
        str28 = null;
        z8 = false;
        if (!z8) {
        }
        if (!z5) {
        }
        while (r3 < jArr2.length) {
        }
        sb3 = sb2;
        sb3.append(i7);
        if (uri != null) {
        }
        i8 = i2;
        sb3.append(i8);
        if (!z) {
        }
        str28 = Utilities.a(sb3.toString());
        if (!z3) {
        }
        str29 = str28;
        str30 = str26;
        if (str30 == null) {
        }
        return str30;
    }

    public final void f(long j, long j2) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        l0.c(new wo7(this, j, j2, (byte) 1));
    }

    public final void g(int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        l0.c(new bp7(this, i, (byte) 8));
    }

    public final void h(int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences d = getAccountInstance().d();
                SharedPreferences.Editor edit = d.edit();
                String str = i == 2 ? "channels" : i == 0 ? "groups" : i == 3 ? "stories" : (i == 4 || i == 5) ? "reactions" : "private";
                String string = d.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str.concat("_s"));
                    try {
                        n0.deleteNotificationChannel(string);
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    if (f11.a) {
                        cc4.b("delete channel global internal ".concat(string));
                    }
                }
                String str2 = i == 2 ? "channels_ia" : i == 0 ? "groups_ia" : i == 3 ? "stories_ia" : (i == 4 || i == 5) ? "reactions_ia" : "private_ia";
                String string2 = d.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        n0.deleteNotificationChannel(string2);
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                    if (f11.a) {
                        cc4.b("delete channel global internal ".concat(string2));
                    }
                }
                edit.remove(i == 2 ? "overwrite_channel" : i == 0 ? "overwrite_group" : i == 3 ? "overwrite_stories" : (i == 4 || i == 5) ? "overwrite_reactions" : "overwrite_private");
                edit.commit();
            } catch (Exception e3) {
                cc4.g(e3, true);
            }
        }
    }

    public final void i(long j, long j2) {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                SharedPreferences d = getAccountInstance().d();
                SharedPreferences.Editor edit = d.edit();
                String str = "org.telegram.key" + j;
                if (j2 != 0) {
                    str = str + ".topic" + j2;
                }
                String string = d.getString(str, null);
                if (string != null) {
                    edit.remove(str).remove(str.concat("_s"));
                    try {
                        n0.deleteNotificationChannel(string);
                    } catch (Exception e) {
                        cc4.g(e, true);
                    }
                    if (f11.a) {
                        cc4.b("delete channel internal ".concat(string));
                    }
                }
                String str2 = "org.telegram.keyia" + j;
                String string2 = d.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        n0.deleteNotificationChannel(string2);
                    } catch (Exception e2) {
                        cc4.g(e2, true);
                    }
                    if (f11.a) {
                        cc4.b("delete channel internal ".concat(string2));
                    }
                }
                edit.commit();
            } catch (Exception e3) {
                cc4.g(e3, true);
            }
        }
    }

    public final void j() {
        zh6 zh6Var = this.h;
        cc4.b("NotificationsController dismissNotification");
        try {
            m0.b(this.e0, null);
            this.a.clear();
            this.c.b();
            this.n.b();
            for (int i = 0; i < zh6Var.m(); i++) {
                if (!this.y.contains(Long.valueOf(zh6Var.j(i)))) {
                    m0.b(((Integer) zh6Var.n(i)).intValue(), null);
                }
            }
            zh6Var.b();
            hl.c3(new pg6((byte) 8));
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    public final int o(long j, long j2) {
        int c = this.h0.c(-1, j, j2, "notify2_");
        if (c != 3 || this.h0.c(0, j, j2, "notifyuntil_") < getConnectionsManager().getCurrentTime()) {
            return c;
        }
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0200, code lost:
    
        if (r15.getBoolean("EnablePreviewAll", true) == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x108a, code lost:
    
        if (r47.J4(r3.document) != false) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1098, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x1096, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r7).flags & 4) != 0) goto L738;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x020c, code lost:
    
        if (r15.getBoolean("EnablePreviewGroup", r7) == false) goto L890;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0214, code lost:
    
        if (r15.getBoolean("EnablePreviewChannel", r7) != false) goto L146;
     */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String q(r47 r47Var, String[] strArr, boolean[] zArr) {
        long j;
        String s;
        long j2;
        TLRPC.Chat chat;
        char c;
        String G;
        String s2;
        char c2;
        CharSequence charSequence;
        char c3;
        CharSequence charSequence2;
        char c4;
        CharSequence charSequence3;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer2;
        if (hl.m2() || xea.B) {
            return ob6.L0(2131747746);
        }
        TLRPC.Message message = r47Var.k;
        boolean z = r47Var.f;
        String str = r47Var.b;
        long j3 = message.dialog_id;
        TLRPC.Peer peer3 = message.peer_id;
        long j4 = peer3.chat_id;
        if (j4 == 0) {
            j4 = peer3.channel_id;
        }
        long j5 = peer3.user_id;
        zArr[0] = true;
        SharedPreferences d = getAccountInstance().d();
        boolean v = qu6.v("content_preview_", j3, d, true);
        boolean z2 = false;
        if (r47Var.i3()) {
            if (j4 != 0) {
                if (r47Var.k.peer_id.channel_id == 0 || r47Var.z4()) {
                    strArr[0] = r47Var.c;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = str;
                }
                if (!v || (z ? !d.getBoolean("EnablePreviewChannel", true) : !d.getBoolean("EnablePreviewGroup", true))) {
                    zArr[0] = false;
                    return (r47Var.k.peer_id.channel_id == 0 || r47Var.z4()) ? ob6.Z(2131747717, r47Var.c, str) : ob6.Z(2131752338, str);
                }
            } else if (j5 != 0) {
                if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = str;
                }
                if (!v || !d.getBoolean("EnablePreviewAll", true)) {
                    zArr[0] = false;
                    return ob6.L0(2131748357);
                }
            }
            return O(r47Var);
        }
        long e = getUserConfig().e();
        if (j5 == 0) {
            j5 = r47Var.Z0();
            if (j5 == 0) {
                j5 = -j4;
            }
        } else if (j5 == e) {
            j5 = r47Var.Z0();
        }
        if (j3 == 0) {
            if (j4 != 0) {
                j3 = -j4;
            } else if (j5 != 0) {
                j3 = j5;
            }
        }
        if (lbc.A(j3) && (messageFwdHeader2 = r47Var.k.fwd_from) != null && (peer2 = messageFwdHeader2.from_id) != null) {
            j5 = r47.B1(peer2);
        }
        if (j5 > 0) {
            j = e;
            TLRPC.User X1 = getMessagesController().X1(Long.valueOf(j5));
            if (X1 != null) {
                s = lbc.r(X1);
                if (j4 != 0) {
                    strArr[0] = s;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = s;
                } else {
                    strArr[0] = null;
                }
            }
            s = null;
        } else {
            j = e;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j5));
            if (M0 != null) {
                s = s(M0);
                strArr[0] = s;
            }
            s = null;
        }
        if (s != null && j5 > 0 && lbc.A(j3) && (messageFwdHeader = r47Var.k.fwd_from) != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long B1 = r47.B1(peer);
            if (wf3.y(B1)) {
                j2 = j3;
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-B1));
                if (M02 != null) {
                    StringBuilder l = c00.l(s, " @ ");
                    l.append(s(M02));
                    s = l.toString();
                    if (strArr[0] != null) {
                        strArr[0] = s;
                    }
                }
                if (s != null) {
                    if (j4 != 0) {
                        chat = getMessagesController().M0(Long.valueOf(j4));
                        if (chat != null) {
                            if (xc2.T(chat) && !chat.megagroup && Build.VERSION.SDK_INT <= 27) {
                                strArr[0] = null;
                            }
                        }
                    } else {
                        chat = null;
                    }
                    if (wf3.B(j2)) {
                        strArr[0] = null;
                        return ob6.L0(2131747746);
                    }
                    boolean z3 = xc2.T(chat) && !chat.megagroup;
                    TLRPC.Message message2 = r47Var.k;
                    if (message2 != null && message2.rich_message != null) {
                        return r47Var.v.toString();
                    }
                    if (v) {
                        boolean z4 = (j4 != 0 || j5 == 0) ? true : true;
                        if (j4 != 0) {
                            if (!z3) {
                            }
                            TLRPC.Message message3 = r47Var.k;
                            if (!(message3 instanceof TLRPC.TL_messageService)) {
                                if (r47Var.F3()) {
                                    return !TextUtils.isEmpty(r47Var.k.message) ? O(r47Var) : ob6.L0(2131748357);
                                }
                                if (r47Var.D == 29 && (r47.m1(r47Var) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) r47.m1(r47Var);
                                    int size = tL_messageMediaPaidMedia.extended_media.size();
                                    boolean z5 = false;
                                    for (int i = 0; i < size; i++) {
                                        TLRPC.MessageExtendedMedia messageExtendedMedia = tL_messageMediaPaidMedia.extended_media.get(i);
                                        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMedia) {
                                            TLRPC.MessageMedia messageMedia = ((TLRPC.TL_messageExtendedMedia) messageExtendedMedia).media;
                                            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                                            }
                                            z5 = false;
                                        } else if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
                                        }
                                        if (z5) {
                                            break;
                                        }
                                    }
                                    if (size == 1) {
                                        G = ob6.L0(z5 ? 2131753926 : 2131753941);
                                        c = 0;
                                    } else {
                                        c = 0;
                                        G = ob6.G(size, z5 ? "Media" : "Photos", new Object[0]);
                                    }
                                    Object[] objArr = new Object[1];
                                    objArr[c] = G;
                                    return ob6.Z(2131753942, objArr);
                                }
                                if (r47Var.R4()) {
                                    return ob6.L0(2131753944);
                                }
                                if (r47Var.f4()) {
                                    return ob6.L0(2131753943);
                                }
                                TLRPC.Message message4 = r47Var.k;
                                if (message4.media instanceof TLRPC.TL_messageMediaPhoto) {
                                    if (TextUtils.isEmpty(message4.message)) {
                                        return r47Var.k.media.ttl_seconds != 0 ? ob6.L0(2131753970) : ob6.L0(2131753941);
                                    }
                                    return "🖼 " + O(r47Var);
                                }
                                boolean G4 = r47Var.G4();
                                TLRPC.Message message5 = r47Var.k;
                                if (G4) {
                                    if (TextUtils.isEmpty(message5.message)) {
                                        return r47Var.k.media.ttl_seconds != 0 ? ob6.L0(2131753969) : ob6.L0(2131753926);
                                    }
                                    return "📹 " + O(r47Var);
                                }
                                if (r47.n1(message5) instanceof TLRPC.TL_messageMediaGame) {
                                    return ob6.L0(2131753965);
                                }
                                if (r47Var.O4()) {
                                    return ob6.L0(2131753975);
                                }
                                if (r47Var.g4()) {
                                    return ob6.L0(2131753934);
                                }
                                if (r47Var.I3()) {
                                    return ob6.L0(2131753945);
                                }
                                TLRPC.Message message6 = r47Var.k;
                                TLRPC.MessageMedia messageMedia2 = message6.media;
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaContact) {
                                    return ob6.L0(2131753972);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                    return ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.quiz ? ob6.L0(2131746172) : ob6.L0(2131746912);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                    return ob6.L0(2131743762);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaWidget) {
                                    return TextUtils.isEmpty(message6.message) ? ob6.L0(2131753919) : O(r47Var);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                    return ob6.L0(2131753485);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                    return ob6.L0(2131753385);
                                }
                                if ((messageMedia2 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia2 instanceof TLRPC.TL_messageMediaVenue)) {
                                    return ob6.L0(2131753954);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaGeoLive) {
                                    return ob6.L0(2131753959);
                                }
                                if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument)) {
                                    if (!(messageMedia2 instanceof TLRPC.TL_messageMediaStory)) {
                                        return !TextUtils.isEmpty(r47Var.v) ? O(r47Var) : ob6.L0(2131748357);
                                    }
                                    if (!((TLRPC.TL_messageMediaStory) messageMedia2).via_mention) {
                                        return ob6.L0(2131744392);
                                    }
                                    String str2 = strArr[0];
                                    return ob6.Z(2131744249, str2 != null ? str2 : "");
                                }
                                if (r47Var.s4() || r47Var.J2()) {
                                    String V1 = r47Var.V1();
                                    if (V1 == null) {
                                        return ob6.L0(2131753929);
                                    }
                                    StringBuilder l2 = c00.l(V1, " ");
                                    l2.append(ob6.L0(2131753929));
                                    return l2.toString();
                                }
                                boolean q3 = r47Var.q3();
                                TLRPC.Message message7 = r47Var.k;
                                if (q3) {
                                    if (TextUtils.isEmpty(message7.message)) {
                                        return ob6.L0(2131753964);
                                    }
                                    return "🎬 " + O(r47Var);
                                }
                                if (TextUtils.isEmpty(message7.message)) {
                                    return ob6.L0(2131753968);
                                }
                                return "📎 " + O(r47Var);
                            }
                            strArr[0] = null;
                            TLRPC.MessageAction messageAction = message3.action;
                            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                                return l(r47Var, s);
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                                return ob6.L0(2131742582);
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                return ob6.L0(2131742584);
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                return r47Var.v.toString();
                            }
                            if ((messageAction instanceof TLRPC.TL_messageActionUserJoined) || (messageAction instanceof TLRPC.TL_messageActionContactSignUp)) {
                                return ob6.Z(2131747774, s);
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                                return ob6.Z(2131747773, s);
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                                String Z = ob6.Z(2131742414, ob6.D0().B0().format(r47Var.k.date * 1000), ob6.D0().o0().format(r47Var.k.date * 1000));
                                String str3 = getUserConfig().f().first_name;
                                TLRPC.MessageAction messageAction2 = r47Var.k.action;
                                return ob6.Z(2131747654, str3, Z, messageAction2.title, messageAction2.address);
                            }
                            if (atb.g(messageAction, TLRPC.TL_messageActionGameScore.class, TLRPC.TL_messageActionPaymentSent.class, TLRPC.TL_messageActionPaymentSentMe.class, TLRPC.TL_messageActionStarGift.class, TLRPC.TL_messageActionGiftPremium.class, TLRPC.TL_messageActionStarGiftUnique.class, TLRPC.TL_messageActionPaidMessagesPrice.class, TLRPC.TL_messageActionPaidMessagesRefunded.class, TLRPC.TL_messageActionGiftTon.class, TLRPC.TL_messageActionBotInvite.class, TLRPC.TL_messageActionStarGiftOnchainOffer.class)) {
                                return r47Var.v.toString();
                            }
                            TLRPC.Message message8 = r47Var.k;
                            TLRPC.MessageAction messageAction3 = message8.action;
                            if (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) {
                                return messageAction3.video ? ob6.L0(2131752591) : ob6.L0(2131752598);
                            }
                            if (messageAction3 instanceof TLRPC.TL_messageActionConferenceCall) {
                                return messageAction3.video ? ob6.L0(2131752593) : ob6.L0(2131752600);
                            }
                            if (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser) {
                                long j6 = messageAction3.user_id;
                                if (j6 == 0 && messageAction3.users.size() == 1) {
                                    j6 = r47Var.k.action.users.get(0).longValue();
                                }
                                if (j6 == 0) {
                                    StringBuilder sb = new StringBuilder();
                                    for (int i2 = 0; i2 < r47Var.k.action.users.size(); i2++) {
                                        TLRPC.User X12 = getMessagesController().X1(r47Var.k.action.users.get(i2));
                                        if (X12 != null) {
                                            String r = lbc.r(X12);
                                            if (sb.length() != 0) {
                                                sb.append(", ");
                                            }
                                            sb.append(r);
                                        }
                                    }
                                    return ob6.Z(2131747761, s, s(chat), sb.toString());
                                }
                                if (r47Var.k.peer_id.channel_id != 0 && !chat.megagroup) {
                                    return ob6.Z(2131752500, s, s(chat));
                                }
                                if (j6 == j) {
                                    return ob6.Z(2131747744, s, s(chat));
                                }
                                TLRPC.User X13 = getMessagesController().X1(Long.valueOf(j6));
                                if (X13 != null) {
                                    return j5 == X13.id ? chat.megagroup ? ob6.Z(2131747759, s, s(chat)) : ob6.Z(2131747760, s, s(chat)) : ob6.Z(2131747761, s, s(chat), lbc.r(X13));
                                }
                            } else {
                                if (messageAction3 instanceof TLRPC.TL_messageActionGroupCall) {
                                    return messageAction3.duration != 0 ? ob6.Z(2131747756, s, s(chat)) : ob6.Z(2131747757, s, s(chat));
                                }
                                if (messageAction3 instanceof TLRPC.TL_messageActionGroupCallScheduled) {
                                    return r47Var.v.toString();
                                }
                                if (messageAction3 instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                                    long j7 = messageAction3.user_id;
                                    if (j7 == 0 && messageAction3.users.size() == 1) {
                                        j7 = r47Var.k.action.users.get(0).longValue();
                                    }
                                    if (j7 == 0) {
                                        StringBuilder sb2 = new StringBuilder();
                                        for (int i3 = 0; i3 < r47Var.k.action.users.size(); i3++) {
                                            TLRPC.User X14 = getMessagesController().X1(r47Var.k.action.users.get(i3));
                                            if (X14 != null) {
                                                String r2 = lbc.r(X14);
                                                if (sb2.length() != 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(r2);
                                            }
                                        }
                                        return ob6.Z(2131747753, s, s(chat), sb2.toString());
                                    }
                                    if (j7 == j) {
                                        return ob6.Z(2131747752, s, s(chat));
                                    }
                                    TLRPC.User X15 = getMessagesController().X1(Long.valueOf(j7));
                                    if (X15 != null) {
                                        return ob6.Z(2131747753, s, s(chat), lbc.r(X15));
                                    }
                                } else {
                                    if (messageAction3 instanceof TLRPC.TL_messageActionGiftCode) {
                                        return ob6.L0(2131753303);
                                    }
                                    if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                                        return ob6.Z(2131747743, s, s(chat));
                                    }
                                    if (messageAction3 instanceof TLRPC.TL_messageActionChatEditTitle) {
                                        return ob6.Z(2131747771, s, messageAction3.title);
                                    }
                                    if ((messageAction3 instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction3 instanceof TLRPC.TL_messageActionChatDeletePhoto)) {
                                        return (message8.peer_id.channel_id == 0 || chat.megagroup) ? r47Var.H4() ? ob6.Z(2131747769, s, s(chat)) : ob6.Z(2131747770, s, s(chat)) : r47Var.H4() ? ob6.Z(2131752230, s(chat)) : ob6.Z(2131752301, s(chat));
                                    }
                                    if (messageAction3 instanceof TLRPC.TL_messageActionChatDeleteUser) {
                                        long j8 = messageAction3.user_id;
                                        if (j8 == j) {
                                            return ob6.Z(2131747750, s, s(chat));
                                        }
                                        if (j8 == j5) {
                                            return ob6.Z(2131747749, s, s(chat));
                                        }
                                        TLRPC.User X16 = getMessagesController().X1(Long.valueOf(r47Var.k.action.user_id));
                                        if (X16 != null) {
                                            return ob6.Z(2131747751, s, s(chat), lbc.r(X16));
                                        }
                                    } else {
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChatCreate) {
                                            return r47Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChannelCreate) {
                                            return r47Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChatMigrateTo) {
                                            return ob6.Z(2131754595, s(chat));
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChannelMigrateFrom) {
                                            return ob6.Z(2131754595, messageAction3.title);
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionScreenshotTaken) {
                                            return r47Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayLaunch) {
                                            return r47Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayResults) {
                                            return r47Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                            return r47Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) {
                                            if (chat == null) {
                                                r47 r47Var2 = r47Var.C;
                                                if (r47Var2 == null) {
                                                    return ob6.Z(2131747814, s);
                                                }
                                                if (r47Var2.I3()) {
                                                    return ob6.Z(2131747817, s);
                                                }
                                                if (r47Var2.G4()) {
                                                    if (TextUtils.isEmpty(r47Var2.k.message)) {
                                                        return ob6.Z(2131747787, s);
                                                    }
                                                    return ob6.Z(2131747793, s, "📹 " + r47Var2.k.message);
                                                }
                                                if (r47Var2.q3()) {
                                                    if (TextUtils.isEmpty(r47Var2.k.message)) {
                                                        return ob6.Z(2131747823, s);
                                                    }
                                                    return ob6.Z(2131747793, s, "🎬 " + r47Var2.k.message);
                                                }
                                                if (r47Var2.O4()) {
                                                    return ob6.Z(2131747784, s);
                                                }
                                                if (r47Var2.g4()) {
                                                    return ob6.Z(2131747802, s);
                                                }
                                                if (r47Var2.s4() || r47Var2.J2()) {
                                                    String V12 = r47Var2.V1();
                                                    return V12 != null ? ob6.Z(2131747797, s, V12) : ob6.Z(2131747796, s);
                                                }
                                                TLRPC.Message message9 = r47Var2.k;
                                                TLRPC.MessageMedia messageMedia3 = message9.media;
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                                                    if (TextUtils.isEmpty(message9.message)) {
                                                        return ob6.Z(2131747838, s);
                                                    }
                                                    return ob6.Z(2131747793, s, "📎 " + r47Var2.k.message);
                                                }
                                                if ((messageMedia3 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia3 instanceof TLRPC.TL_messageMediaVenue)) {
                                                    return ob6.Z(2131747826, s);
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaGeoLive) {
                                                    return ob6.Z(2131747827, s);
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaContact) {
                                                    TLRPC.TL_messageMediaContact tL_messageMediaContact = (TLRPC.TL_messageMediaContact) messageMedia3;
                                                    return ob6.Z(2131747841, s, lv2.n(tL_messageMediaContact.first_name, tL_messageMediaContact.last_name));
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia3).poll;
                                                    boolean z6 = poll.quiz;
                                                    TLRPC.TL_textWithEntities tL_textWithEntities = poll.question;
                                                    return z6 ? ob6.Z(2131747805, s, tL_textWithEntities.text) : ob6.Z(2131747808, s, tL_textWithEntities.text);
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                                                    return ob6.Z(2131747790, s, ((TLRPC.TL_messageMediaToDo) messageMedia3).todo.title.text);
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                                                    if (TextUtils.isEmpty(message9.message)) {
                                                        return ob6.Z(2131747811, s);
                                                    }
                                                    return ob6.Z(2131747793, s, "🖼 " + r47Var2.k.message);
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaGame) {
                                                    return ob6.Z(2131747832, s);
                                                }
                                                CharSequence charSequence4 = r47Var2.v;
                                                if (charSequence4 == null || charSequence4.length() <= 0) {
                                                    return ob6.Z(2131747814, s);
                                                }
                                                CharSequence charSequence5 = r47Var2.v;
                                                if (charSequence5.length() > 20) {
                                                    StringBuilder sb3 = new StringBuilder();
                                                    c2 = 0;
                                                    sb3.append((Object) charSequence5.subSequence(0, 20));
                                                    sb3.append("...");
                                                    charSequence = sb3.toString();
                                                } else {
                                                    c2 = 0;
                                                    charSequence = charSequence5;
                                                }
                                                Object[] objArr2 = new Object[2];
                                                objArr2[c2] = s;
                                                objArr2[1] = charSequence;
                                                return ob6.Z(2131747793, objArr2);
                                            }
                                            if (xc2.T(chat) && !chat.megagroup) {
                                                r47 r47Var3 = r47Var.C;
                                                if (r47Var3 == null) {
                                                    return ob6.Z(2131747815, s(chat));
                                                }
                                                if (r47Var3.I3()) {
                                                    return ob6.Z(2131747818, s(chat));
                                                }
                                                if (r47Var3.G4()) {
                                                    if (TextUtils.isEmpty(r47Var3.k.message)) {
                                                        return ob6.Z(2131747788, s(chat));
                                                    }
                                                    return ob6.Z(2131747794, s(chat), "📹 " + r47Var3.k.message);
                                                }
                                                if (r47Var3.q3()) {
                                                    if (TextUtils.isEmpty(r47Var3.k.message)) {
                                                        return ob6.Z(2131747824, s(chat));
                                                    }
                                                    return ob6.Z(2131747794, s(chat), "🎬 " + r47Var3.k.message);
                                                }
                                                if (r47Var3.O4()) {
                                                    return ob6.Z(2131747785, s(chat));
                                                }
                                                if (r47Var3.g4()) {
                                                    return ob6.Z(2131747803, s(chat));
                                                }
                                                if (r47Var3.s4() || r47Var3.J2()) {
                                                    String V13 = r47Var3.V1();
                                                    return V13 != null ? ob6.Z(2131747798, s(chat), V13) : ob6.Z(2131747800, s(chat));
                                                }
                                                TLRPC.Message message10 = r47Var3.k;
                                                TLRPC.MessageMedia messageMedia4 = message10.media;
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaDocument) {
                                                    if (TextUtils.isEmpty(message10.message)) {
                                                        return ob6.Z(2131747839, s(chat));
                                                    }
                                                    return ob6.Z(2131747794, s(chat), "📎 " + r47Var3.k.message);
                                                }
                                                if ((messageMedia4 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia4 instanceof TLRPC.TL_messageMediaVenue)) {
                                                    return ob6.Z(2131747830, s(chat));
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaGeoLive) {
                                                    return ob6.Z(2131747828, s(chat));
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaContact) {
                                                    TLRPC.TL_messageMediaContact tL_messageMediaContact2 = (TLRPC.TL_messageMediaContact) messageMedia4;
                                                    return ob6.Z(2131747842, s(chat), lv2.n(tL_messageMediaContact2.first_name, tL_messageMediaContact2.last_name));
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                                                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia4;
                                                    return tL_messageMediaPoll.poll.quiz ? ob6.Z(2131747806, s(chat), tL_messageMediaPoll.poll.question.text) : ob6.Z(2131747809, s(chat), tL_messageMediaPoll.poll.question.text);
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaToDo) {
                                                    return ob6.Z(2131747791, s(chat), ((TLRPC.TL_messageMediaToDo) messageMedia4).todo.title.text);
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaPhoto) {
                                                    if (TextUtils.isEmpty(message10.message)) {
                                                        return ob6.Z(2131747812, s(chat));
                                                    }
                                                    return ob6.Z(2131747794, s(chat), "🖼 " + r47Var3.k.message);
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaGame) {
                                                    return ob6.Z(2131747836, s(chat));
                                                }
                                                CharSequence charSequence6 = r47Var3.v;
                                                if (charSequence6 == null || charSequence6.length() <= 0) {
                                                    return ob6.Z(2131747815, s(chat));
                                                }
                                                CharSequence charSequence7 = r47Var3.v;
                                                if (charSequence7.length() > 20) {
                                                    StringBuilder sb4 = new StringBuilder();
                                                    c4 = 0;
                                                    sb4.append((Object) charSequence7.subSequence(0, 20));
                                                    sb4.append("...");
                                                    charSequence3 = sb4.toString();
                                                } else {
                                                    c4 = 0;
                                                    charSequence3 = charSequence7;
                                                }
                                                Object[] objArr3 = new Object[2];
                                                objArr3[c4] = s(chat);
                                                objArr3[1] = charSequence3;
                                                return ob6.Z(2131747794, objArr3);
                                            }
                                            r47 r47Var4 = r47Var.C;
                                            if (r47Var4 == null) {
                                                return ob6.Z(2131747816, s, s(chat));
                                            }
                                            if (r47Var4.I3()) {
                                                return ob6.Z(2131747819, s, s(chat));
                                            }
                                            if (r47Var4.G4()) {
                                                if (TextUtils.isEmpty(r47Var4.k.message)) {
                                                    return ob6.Z(2131747789, s, s(chat));
                                                }
                                                return ob6.Z(2131747795, s, "📹 " + r47Var4.k.message, s(chat));
                                            }
                                            if (r47Var4.q3()) {
                                                if (TextUtils.isEmpty(r47Var4.k.message)) {
                                                    return ob6.Z(2131747825, s, s(chat));
                                                }
                                                return ob6.Z(2131747795, s, "🎬 " + r47Var4.k.message, s(chat));
                                            }
                                            if (r47Var4.O4()) {
                                                return ob6.Z(2131747786, s, s(chat));
                                            }
                                            if (r47Var4.g4()) {
                                                return ob6.Z(2131747804, s, s(chat));
                                            }
                                            if (r47Var4.s4() || r47Var4.J2()) {
                                                String V14 = r47Var4.V1();
                                                return V14 != null ? ob6.Z(2131747799, s, s(chat), V14) : ob6.Z(2131747801, s, s(chat));
                                            }
                                            TLRPC.Message message11 = r47Var4.k;
                                            TLRPC.MessageMedia messageMedia5 = message11.media;
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaDocument) {
                                                if (TextUtils.isEmpty(message11.message)) {
                                                    return ob6.Z(2131747840, s, s(chat));
                                                }
                                                return ob6.Z(2131747795, s, "📎 " + r47Var4.k.message, s(chat));
                                            }
                                            if ((messageMedia5 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia5 instanceof TLRPC.TL_messageMediaVenue)) {
                                                return ob6.Z(2131747831, s, s(chat));
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaGeoLive) {
                                                return ob6.Z(2131747829, s, s(chat));
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaContact) {
                                                TLRPC.TL_messageMediaContact tL_messageMediaContact3 = (TLRPC.TL_messageMediaContact) messageMedia5;
                                                return ob6.Z(2131747843, s, s(chat), lv2.n(tL_messageMediaContact3.first_name, tL_messageMediaContact3.last_name));
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaPoll) {
                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia5;
                                                return tL_messageMediaPoll2.poll.quiz ? ob6.Z(2131747807, s, s(chat), tL_messageMediaPoll2.poll.question.text) : ob6.Z(2131747810, s, s(chat), tL_messageMediaPoll2.poll.question.text);
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaToDo) {
                                                return ob6.Z(2131747792, s, s(chat), ((TLRPC.TL_messageMediaToDo) messageMedia5).todo.title.text);
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaPhoto) {
                                                if (TextUtils.isEmpty(message11.message)) {
                                                    return ob6.Z(2131747813, s, s(chat));
                                                }
                                                return ob6.Z(2131747795, s, "🖼 " + r47Var4.k.message, s(chat));
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaGame) {
                                                return ob6.Z(2131747837, s, s(chat));
                                            }
                                            CharSequence charSequence8 = r47Var4.v;
                                            if (charSequence8 == null || charSequence8.length() <= 0) {
                                                return ob6.Z(2131747816, s, s(chat));
                                            }
                                            CharSequence charSequence9 = r47Var4.v;
                                            if (charSequence9.length() > 20) {
                                                StringBuilder sb5 = new StringBuilder();
                                                c3 = 0;
                                                sb5.append((Object) charSequence9.subSequence(0, 20));
                                                sb5.append("...");
                                                charSequence2 = sb5.toString();
                                            } else {
                                                c3 = 0;
                                                charSequence2 = charSequence9;
                                            }
                                            String s3 = s(chat);
                                            Object[] objArr4 = new Object[3];
                                            objArr4[c3] = s;
                                            objArr4[1] = charSequence2;
                                            objArr4[2] = s3;
                                            return ob6.Z(2131747795, objArr4);
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                            String f = atb.f(((TLRPC.TL_messageActionSetChatTheme) messageAction3).theme);
                                            return TextUtils.isEmpty(f) ? j2 == j ? ob6.Z(2131752166, new Object[0]) : ob6.Z(2131752167, s, f) : j2 == j ? ob6.Z(2131752169, f) : ob6.Z(2131752170, s, f);
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                                            return r47Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionPrizeStars) {
                                            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) messageAction3;
                                            long n = wf3.n(tL_messageActionPrizeStars.boost_peer);
                                            if (n >= 0) {
                                                s2 = lbc.l(getMessagesController().X1(Long.valueOf(n)));
                                            } else {
                                                TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-n));
                                                s2 = M03 != null ? s(M03) : "";
                                            }
                                            return ob6.J((int) tL_messageActionPrizeStars.stars, "BoostingReceivedStars", s2);
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionPaymentRefunded) {
                                            return r47Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionTodoCompletions) {
                                            return r47Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                                            return r47Var.v.toString();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                    zArr[z2 ? 1 : 0] = z2;
                    return ob6.L0(2131748357);
                }
                return null;
            }
        }
        j2 = j3;
        if (s != null) {
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v47 org.telegram.tgnet.TLRPC$Chat, still in use, count: 2, list:
          (r5v47 org.telegram.tgnet.TLRPC$Chat) from 0x018b: IF  (r5v47 org.telegram.tgnet.TLRPC$Chat) == (null org.telegram.tgnet.TLRPC$Chat)  -> B:964:0x1077 A[HIDDEN]
          (r5v47 org.telegram.tgnet.TLRPC$Chat) from 0x0191: PHI (r5v2 org.telegram.tgnet.TLRPC$Chat) = (r5v1 org.telegram.tgnet.TLRPC$Chat), (r5v47 org.telegram.tgnet.TLRPC$Chat) binds: [B:963:0x018f, B:74:0x018b] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1118)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String r(r47 r30, boolean[] r31) {
        /*
            Method dump skipped, instructions count: 6082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ip7.r(r47, boolean[]):java.lang.String");
    }

    public final String s(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        return chat.monoforum ? ro4.j(this.currentAccount, chat, false) : chat.title;
    }

    public final int t() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (yac.h(i2).o() && (xea.M0 || yac.t0 == i2)) {
                ip7 n = n(i2);
                if (n.S) {
                    boolean z = n.U;
                    boolean z2 = n.T;
                    if (z) {
                        if (z2) {
                            try {
                                ArrayList arrayList = new ArrayList(uc7.s1(i2).y);
                                int size = arrayList.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i3);
                                    if (dialog != null && wf3.y(dialog.id)) {
                                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-dialog.id));
                                        if (!xc2.r0(M0)) {
                                            if (xc2.Y(M0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i += uc7.s1(i2).V0(dialog);
                                    }
                                }
                            } catch (Exception e) {
                                cc4.g(e, true);
                            }
                        } else {
                            i += n.J;
                        }
                    } else if (z2) {
                        try {
                            int size2 = uc7.s1(i2).y.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) uc7.s1(i2).y.get(i4);
                                if (wf3.y(dialog2.id)) {
                                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-dialog2.id));
                                    if (!xc2.r0(M02)) {
                                        if (xc2.Y(M02)) {
                                        }
                                    }
                                }
                                if (uc7.s1(i2).V0(dialog2) != 0) {
                                    i++;
                                }
                            }
                        } catch (Exception e2) {
                            cc4.g(e2, false);
                        }
                    } else {
                        i += n.f.m();
                    }
                }
            }
        }
        return i;
    }

    public final boolean u() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return false;
            }
            r47 r47Var = (r47) arrayList.get(i);
            long B0 = r47.B0(r47Var.k);
            if (!r47Var.I) {
                TLRPC.Message message = r47Var.k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !wf3.B(B0) && ((r47Var.k.peer_id.channel_id == 0 || r47Var.z4()) && B0 != 489000 && B0 != 489001)) {
                    return true;
                }
            }
            i++;
        }
    }

    public final boolean v(int i) {
        return i == 4 ? getAccountInstance().d().getBoolean("EnableReactionsMessages", true) : i == 5 ? getAccountInstance().d().getBoolean("EnableReactionsStories", true) : i == 3 ? getAccountInstance().d().getBoolean("EnableAllStories", true) : getAccountInstance().d().getInt(k(i), 0) < getConnectionsManager().getCurrentTime();
    }

    public final boolean w(long j) {
        return x(j, null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        if (r3.booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r1.megagroup == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(long j, Boolean bool, boolean z, boolean z2) {
        int i;
        if (z) {
            i = 4;
        } else if (z2) {
            i = 5;
        } else if (!wf3.y(j)) {
            i = 1;
        } else if (bool == null) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j));
            if (xc2.T(M0)) {
            }
            i = 0;
        }
        return v(i);
    }

    public final void z() {
        PowerManager.WakeLock wakeLock = this.W;
        m0.b(this.currentAccount, "wallet_tonconnect");
        this.G = 0L;
        this.H = 0L;
        this.J = 0;
        this.K = 0;
        this.a.clear();
        this.c.b();
        this.d.b();
        this.f.b();
        this.h.b();
        this.n.b();
        this.y.clear();
        this.b.clear();
        this.L = false;
        this.O = 0;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
        j();
        S(t());
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                n0.deleteNotificationChannelGroup("channels" + this.currentAccount);
                n0.deleteNotificationChannelGroup("groups" + this.currentAccount);
                n0.deleteNotificationChannelGroup("private" + this.currentAccount);
                n0.deleteNotificationChannelGroup("stories" + this.currentAccount);
                n0.deleteNotificationChannelGroup("other" + this.currentAccount);
                String str = this.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = n0.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i = 0; i < size; i++) {
                    String id = hz6.c(notificationChannels.get(i)).getId();
                    if (id.startsWith(str)) {
                        try {
                            n0.deleteNotificationChannel(id);
                        } catch (Exception e2) {
                            cc4.g(e2, true);
                        }
                        if (f11.a) {
                            cc4.b("delete channel cleanup " + id);
                        }
                    }
                }
            } catch (Throwable th) {
                cc4.g(th, true);
            }
        }
    }
}
