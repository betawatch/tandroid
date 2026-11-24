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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class im7 extends pf0 implements gk7 {
    public static String k0;
    public static pl7 m0;
    public static NotificationManager n0;
    public static AudioManager p0;
    public static volatile im7[] q0;
    public static final Object[] r0;
    public static final vf6 s0;
    public final ArrayList E;
    public final vf6 F;
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
    public final wl7 V;
    public final PowerManager.WakeLock W;
    public long X;
    public SoundPool Y;
    public int Z;
    public final ArrayList a;
    public int a0;
    public final ArrayList b;
    public boolean b0;
    public final vf6 c;
    public boolean c0;
    public final vf6 d;
    public final AlarmManager d0;
    public final vf6 e;
    public final int e0;
    public final vf6 f;
    public final String f0;
    public final qla g0;
    public final vf6 h;
    public final wm7 h0;
    public final char[] i0;
    public final wl7 j0;
    public final vf6 n;
    public final vf6 r;
    public final HashSet s;
    public final ArrayList w;
    public ArrayList x;
    public final HashSet y;
    public static final co3 l0 = new co3("notificationsQueue");
    public static final long o0 = cf3.E(1);

    static {
        m0 = null;
        n0 = null;
        if (Build.VERSION.SDK_INT >= 26 && a.b != null) {
            m0 = new pl7(a.b);
            n0 = (NotificationManager) a.b.getSystemService("notification");
            c();
        }
        p0 = (AudioManager) a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        q0 = new im7[4];
        r0 = new Object[4];
        for (int i = 0; i < 4; i++) {
            r0[i] = new Object();
        }
        s0 = new vf6();
    }

    public im7(int i) {
        super(i);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new vf6();
        this.d = new vf6();
        this.e = new vf6();
        this.f = new vf6();
        this.h = new vf6();
        this.n = new vf6();
        this.r = new vf6();
        this.s = new HashSet();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new HashSet();
        this.E = new ArrayList();
        this.F = new vf6();
        this.G = 0L;
        this.H = 0L;
        this.I = 5000;
        this.J = 0;
        this.K = 0;
        this.L = false;
        this.M = 0;
        this.O = -1;
        this.g0 = new qla();
        this.i0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.j0 = new wl7(this, (byte) 11);
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
        m0 = new pl7(a.b);
        n0 = (NotificationManager) a.b.getSystemService("notification");
        try {
            p0 = (AudioManager) a.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        } catch (Exception e) {
            fa4.g(e, true);
        }
        try {
            this.d0 = (AlarmManager) a.b.getSystemService("alarm");
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) a.b.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.W = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e3) {
            fa4.g(e3, true);
        }
        this.V = new wl7(this, (byte) 12);
        this.h0 = new wm7(this.currentAccount);
        gl.d3(new wl7(this, (byte) 13));
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
        int L = gl.L(64.0f);
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
                    canvas.drawCircle(f4, f5, gl.L(2.0f) + f3, paint3);
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
                    options.inSampleSize = f4b.d(options, i3, i3);
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
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f2, new int[]{bkb.w0(null, bkb.o8[pb0.d(user.id)], false), bkb.w0(null, bkb.p8[pb0.d(user.id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawCircle(f4, f5, f3, paint2);
                    if (textPaint == null) {
                        z = true;
                        TextPaint textPaint2 = new TextPaint(1);
                        try {
                            textPaint2.setTypeface(gl.o());
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
                    pb0.a(user.first_name, user.last_name, null, sb);
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

    public static void W(Notification notification, xk7 xk7Var, boolean z) {
        if (z) {
            xk7Var.y = k0;
        } else {
            xk7Var.y = notification.getChannelId();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0 == 2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int a(ArrayList arrayList, k27 k27Var, long j, boolean z, SharedPreferences sharedPreferences) {
        int i;
        if (k27Var.J) {
            return 0;
        }
        if (!cf3.B(j)) {
            if (ls6.v("custom_", j, sharedPreferences, false)) {
                i = sharedPreferences.getInt("popup_" + j, 0);
            } else {
                i = 0;
            }
            if (i == 0) {
                if (z) {
                    i = sharedPreferences.getInt("popupChannel", 0);
                } else {
                    i = sharedPreferences.getInt(cf3.y(j) ? "popupGroup" : "popupAll", 0);
                }
            } else if (i == 1) {
                i = 3;
            }
            if (i != 0 && k27Var.k.peer_id.channel_id != 0 && !k27Var.z4()) {
                i = 0;
            }
            if (i != 0) {
                arrayList.add(0, k27Var);
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
                    fa4.g(e, true);
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
            String M0 = k96.M0(2131748997, null);
            if (notificationChannel != null && !TextUtils.equals(notificationChannel.getName(), M0)) {
                notificationChannel.setName(M0);
                try {
                    n0.createNotificationChannel(notificationChannel);
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
            }
            if (notificationChannel == null) {
                fk.g();
                NotificationChannel notificationChannel2 = new NotificationChannel(k0, M0, 3);
                notificationChannel2.enableLights(false);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setSound(null, null);
                try {
                    n0.createNotificationChannel(notificationChannel2);
                } catch (Exception e3) {
                    fa4.g(e3, true);
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

    public static String l(k27 k27Var, String str) {
        TLRPC.Message message = k27Var.k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean B = l7c.B(k27.B0(message));
        if (B && !TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name)) {
            return k96.a0(null, null, 2131747844, c.w(tL_messageActionGramTransfer.amount, false), a43.d(tL_messageActionGramTransfer.onramp_provider_name, Locale.getDefault()));
        }
        boolean z = (tL_messageActionGramTransfer.comment_encrypted || TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) ? false : true;
        return k96.a0(null, null, B ? z ? 2131747842 : 2131747843 : z ? 2131747845 : 2131747846, str, c.w(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
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

    public static im7 n(int i) {
        im7 im7Var;
        im7 im7Var2 = q0[i];
        if (im7Var2 != null) {
            return im7Var2;
        }
        synchronized (r0[i]) {
            im7Var = q0[i];
            if (im7Var == null) {
                im7[] im7VarArr = q0;
                im7 im7Var3 = new im7(i);
                im7VarArr[i] = im7Var3;
                im7Var = im7Var3;
            }
        }
        return im7Var;
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
        vf6 vf6Var = s0;
        int h = vf6Var.h(j3);
        if (h >= 0) {
            return (String) vf6Var.n(h);
        }
        if (j2 != 0) {
            Locale locale2 = Locale.US;
            valueOf = j + "_" + j2;
        } else {
            valueOf = String.valueOf(j);
        }
        vf6Var.k(valueOf, j3);
        return valueOf;
    }

    public static boolean y(k27 k27Var) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = k27Var.k;
        TLRPC.Peer peer = message.peer_id;
        return (peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || k27Var.J;
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
                        if (w01.a) {
                            fa4.b("delete all channel " + str);
                        }
                    }
                    edit.remove(key);
                }
            }
            edit.commit();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public final void C(ArrayList arrayList, vf6 vf6Var, ArrayList arrayList2, Collection collection) {
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
        k27 k27Var;
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
        vf6 vf6Var2 = new vf6();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i);
            if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                TLRPC.MessageAction messageAction = message3.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                    long j6 = message3.peer_id.channel_id;
                    long j7 = j6 != 0 ? -j6 : 0L;
                    SparseArray sparseArray3 = (SparseArray) this.c.f(j7);
                    if (sparseArray3 == null || sparseArray3.indexOfKey(message3.id) < 0) {
                        k27 k27Var2 = new k27(this.currentAccount, message3, false, false);
                        if (y(k27Var2)) {
                            this.K++;
                        }
                        long B0 = k27.B0(k27Var2.k);
                        long b2 = k27.b2(this.currentAccount, k27Var2.k, getMessagesController().s2(k27Var2), false);
                        if (k27Var2.k.mentioned) {
                            message = message3;
                            j4 = k27Var2.Z0();
                            j3 = j7;
                        } else {
                            j3 = j7;
                            message = message3;
                            j4 = B0;
                        }
                        int h = vf6Var2.h(j4);
                        if (h < 0 || b2 != 0) {
                            int o = o(j4, b2);
                            if (o == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j5 = j3;
                                z2 = x(j4, null, k27Var2.I, k27Var2.J);
                                k27Var = k27Var2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                k27Var = k27Var2;
                                j5 = j3;
                                z2 = o != 2;
                            }
                            vf6Var2.k(Boolean.valueOf(z2), j4);
                        } else {
                            z2 = ((Boolean) vf6Var2.n(h)).booleanValue();
                            message2 = message;
                            sparseArray = sparseArray3;
                            k27Var = k27Var2;
                            j5 = j3;
                        }
                        if (z2 && (j4 != this.G || !a.w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                this.c.k(sparseArray2, j5);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.id, k27Var);
                            b(k27Var);
                            if (B0 != j4) {
                                Integer num = (Integer) this.r.f(B0);
                                this.r.k(Integer.valueOf(num == null ? 1 : num.intValue() + 1), B0);
                            }
                        }
                    }
                }
            }
        }
        long j8 = 0;
        int i2 = 0;
        while (i2 < vf6Var.m()) {
            long j9 = vf6Var.j(i2);
            int h2 = vf6Var2.h(j9);
            if (h2 >= 0) {
                x = ((Boolean) vf6Var2.n(h2)).booleanValue();
            } else {
                int o2 = o(j9, j8);
                x = o2 == -1 ? x(j9, null, false, false) : o2 != 2;
                vf6Var2.k(Boolean.valueOf(x), j9);
            }
            if (x) {
                Integer num2 = (Integer) vf6Var.n(i2);
                int intValue = num2.intValue();
                this.f.k(num2, j9);
                if (!getMessagesController().l2(j9)) {
                    boolean r2 = getMessagesController().r2(j9);
                    int i3 = this.J;
                    if (r2) {
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
            k27 k27Var3 = (k27) arrayList2.get(i4);
            int e1 = k27Var3.e1();
            if (this.c.h(e1) < 0) {
                if (y(k27Var3)) {
                    this.K++;
                }
                long B02 = k27.B0(k27Var3.k);
                long b22 = k27.b2(this.currentAccount, k27Var3.k, getMessagesController().s2(k27Var3), false);
                TLRPC.Message message4 = k27Var3.k;
                long j10 = message4.random_id;
                long Z0 = message4.mentioned ? k27Var3.Z0() : B02;
                int h3 = vf6Var2.h(Z0);
                if (h3 < 0 || b22 != 0) {
                    int o3 = o(Z0, b22);
                    if (o3 == -1) {
                        j = Z0;
                        z = x(j, null, k27Var3.I, k27Var3.J);
                    } else {
                        j = Z0;
                        z = o3 != 2;
                    }
                    vf6Var2.k(Boolean.valueOf(z), j);
                } else {
                    long j11 = Z0;
                    z = ((Boolean) vf6Var2.n(h3)).booleanValue();
                    j = j11;
                }
                if (z && (j != this.G || !a.w)) {
                    if (e1 != 0) {
                        boolean z3 = k27Var3.J;
                        TLRPC.Message message5 = k27Var3.k;
                        if (z3) {
                            j2 = k27.B0(message5);
                        } else {
                            long j12 = message5.peer_id.channel_id;
                            j2 = j12 != 0 ? -j12 : 0L;
                        }
                        SparseArray sparseArray4 = (SparseArray) this.c.f(j2);
                        if (sparseArray4 == null) {
                            sparseArray4 = new SparseArray();
                            this.c.k(sparseArray4, j2);
                        }
                        sparseArray4.put(e1, k27Var3);
                    } else if (j10 != 0) {
                        this.d.k(k27Var3, j10);
                    }
                    b(k27Var3);
                    if (B02 != j) {
                        Integer num3 = (Integer) this.r.f(B02);
                        this.r.k(Integer.valueOf(num3 == null ? 1 : num3.intValue() + 1), B02);
                    }
                    Integer num4 = (Integer) this.f.f(j);
                    int intValue2 = num4 != null ? num4.intValue() + 1 : 1;
                    if (!getMessagesController().l2(j)) {
                        if (getMessagesController().r2(j)) {
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
                    this.f.k(Integer.valueOf(intValue2), j);
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                hm7 hm7Var = (hm7) it.next();
                long j13 = hm7Var.a;
                hm7 hm7Var2 = (hm7) this.F.f(j13);
                if (hm7Var2 != null) {
                    hm7Var2.c.putAll(hm7Var.c);
                } else {
                    this.E.add(hm7Var);
                    this.F.k(hm7Var, j13);
                }
            }
            Collections.sort(this.E, Comparator$-CC.comparingLong(new td((byte) 3)));
        }
        gl.d3(new cm7(this, this.f.m(), (byte) 4));
        Z(SystemClock.elapsedRealtime() / 1000 < 60);
        if (this.S) {
            S(t());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x02c6, code lost:
    
        if (im7.p0.getRingerMode() == 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if ((r12 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f6  */
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
        k27 k27Var;
        int i2;
        boolean z5;
        long j5;
        k27 k27Var2;
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
        im7 im7Var;
        int i3;
        SparseArray sparseArray2;
        long j11;
        k27 k27Var3;
        im7 im7Var2 = this;
        ArrayList arrayList3 = arrayList;
        vf6 vf6Var = new vf6();
        SharedPreferences d = im7Var2.getAccountInstance().d();
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
            k27 k27Var4 = (k27) arrayList3.get(i4);
            if (k27Var4.k != null) {
                if (!k27Var4.y3()) {
                    TLRPC.Message message = k27Var4.k;
                    TLRPC.MessageAction messageAction = message.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL)) {
                        if (message.silent) {
                            if (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp)) {
                            }
                        }
                    }
                }
                if (w01.a) {
                    fa4.b("skipped message because 1");
                }
                i2 = i4;
                z5 = z8;
                sharedPreferences2 = d;
                im7Var = im7Var2;
                sharedPreferences3 = sharedPreferences2;
                z8 = z5;
                i4 = i2 + 1;
                im7Var2 = im7Var;
                d = sharedPreferences3;
                arrayList3 = arrayList;
            }
            if (!k27.D4(k27Var4)) {
                if (k27Var4.K) {
                    long currentTimeMillis = k27Var4.k == null ? System.currentTimeMillis() : r5.date * 1000;
                    long B0 = k27.B0(k27Var4.k);
                    int e1 = k27Var4.e1();
                    hm7 hm7Var = (hm7) im7Var2.F.f(B0);
                    byte b2 = 27;
                    if (hm7Var != null) {
                        hm7Var.c.put(Integer.valueOf(e1), new Pair(Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis + 86400000)));
                        boolean z12 = hm7Var.d;
                        boolean z13 = k27Var4.M;
                        if (z12 != z13) {
                            hm7Var.d = z13;
                            z11 = true;
                        }
                        hm7Var.e = hm7Var.a();
                        ad7 messagesStorage = im7Var2.getMessagesStorage();
                        messagesStorage.a.c(new t67(messagesStorage, hm7Var, b2));
                        z9 = true;
                    } else {
                        hm7 hm7Var2 = new hm7(k27Var4.b, B0, e1, currentTimeMillis, currentTimeMillis + 86400000);
                        hm7Var2.d = k27Var4.M;
                        im7Var2.E.add(hm7Var2);
                        im7Var2.F.k(hm7Var2, B0);
                        ad7 messagesStorage2 = im7Var2.getMessagesStorage();
                        messagesStorage2.a.c(new t67(messagesStorage2, hm7Var2, b2));
                        z8 = true;
                        z11 = true;
                    }
                    Collections.sort(im7Var2.E, Comparator$-CC.comparingLong(new td(b)));
                    im7Var = im7Var2;
                    i2 = i4;
                    sharedPreferences3 = d;
                } else {
                    if (k27Var4.O) {
                        TLRPC.Message message2 = k27Var4.k;
                        if (message2 != null) {
                            int i6 = message2.id;
                            long j12 = message2.date + 60;
                            long currentTime = ConnectionsManager.getInstance(im7Var2.currentAccount).getCurrentTime();
                            if (currentTime <= j12) {
                                gl.e3(new cm7(im7Var2, i6, (byte) 6), (j12 - currentTime) * 1000);
                            }
                        }
                        i2 = i4;
                        z5 = z8;
                        sharedPreferences2 = d;
                        im7Var = im7Var2;
                        sharedPreferences3 = sharedPreferences2;
                        z8 = z5;
                    }
                    int e12 = k27Var4.e1();
                    if (k27Var4.i3()) {
                        j = 0;
                        j2 = k27Var4.k.random_id;
                    } else {
                        j = 0;
                        j2 = 0;
                    }
                    long B02 = k27.B0(k27Var4.k);
                    if (k27Var4.i3()) {
                        z4 = k27Var4.f;
                        sharedPreferences = d;
                    } else if (cf3.y(B02)) {
                        sharedPreferences = d;
                        TLRPC.Chat K0 = im7Var2.getMessagesController().K0(Long.valueOf(-B02));
                        z4 = hc2.T(K0) && !K0.megagroup;
                    } else {
                        sharedPreferences = d;
                        z4 = false;
                    }
                    boolean z14 = k27Var4.J;
                    TLRPC.Message message3 = k27Var4.k;
                    if (z14) {
                        j3 = j2;
                        j4 = k27.B0(message3);
                    } else {
                        j3 = j2;
                        long j13 = message3.peer_id.channel_id;
                        j4 = j13 != j ? -j13 : j;
                    }
                    SparseArray sparseArray3 = (SparseArray) im7Var2.c.f(j4);
                    k27 k27Var5 = sparseArray3 != null ? (k27) sparseArray3.get(e12) : null;
                    if (k27Var5 == null) {
                        k27Var = k27Var5;
                        i2 = i4;
                        long j14 = k27Var4.k.random_id;
                        if (j14 != j) {
                            k27Var2 = (k27) im7Var2.d.f(j14);
                            if (k27Var2 != null) {
                                z5 = z8;
                                j5 = B02;
                                im7Var2.d.l(k27Var4.k.random_id);
                            } else {
                                z5 = z8;
                                j5 = B02;
                            }
                            byte b3 = 10;
                            if (k27Var2 == null) {
                                if (k27Var2.i3()) {
                                    if (sparseArray3 == null) {
                                        sparseArray3 = new SparseArray();
                                        im7Var2.c.k(sparseArray3, j4);
                                    }
                                    sparseArray3.put(e12, k27Var4);
                                    int indexOf = im7Var2.a.indexOf(k27Var2);
                                    if (indexOf >= 0) {
                                        im7Var2.a.set(indexOf, k27Var4);
                                        j11 = j4;
                                        k27Var3 = k27Var4;
                                        i5 = a(arrayList2, k27Var3, j5, z4, sharedPreferences);
                                    } else {
                                        j11 = j4;
                                        k27Var3 = k27Var4;
                                    }
                                    if (z) {
                                        boolean z15 = k27Var3.i;
                                        if (z15) {
                                            ad7 messagesStorage3 = im7Var2.getMessagesStorage();
                                            messagesStorage3.a.c(new ee2(messagesStorage3, k27Var3, b3));
                                        }
                                        z9 = z15;
                                    }
                                } else {
                                    j11 = j4;
                                }
                                if (w01.a) {
                                    fa4.b("skipped message because old message with same dialog and message ids exist: did=" + j11 + ", mid=" + e12);
                                }
                                im7Var = im7Var2;
                                sharedPreferences3 = sharedPreferences;
                                z8 = z5;
                            } else {
                                long j15 = j4;
                                if (!z9) {
                                    if (z && !k27Var4.O) {
                                        ad7 messagesStorage4 = im7Var2.getMessagesStorage();
                                        messagesStorage4.a.c(new ee2(messagesStorage4, k27Var4, b3));
                                    }
                                    long b22 = k27.b2(im7Var2.currentAccount, k27Var4.k, im7Var2.getMessagesController().s2(k27Var4), false);
                                    if (j5 != im7Var2.G || !a.w || k27Var4.J || k27Var4.O) {
                                        sharedPreferences2 = sharedPreferences;
                                        long j16 = j5;
                                        TLRPC.Message message4 = k27Var4.k;
                                        if (!message4.mentioned) {
                                            j6 = j15;
                                            j7 = j16;
                                        } else if (z7 || !(message4.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                            j6 = j15;
                                            j7 = k27Var4.Z0();
                                        } else {
                                            if (w01.a) {
                                                fa4.b("skipped message because message is mention of pinned");
                                            }
                                            im7Var = im7Var2;
                                            sharedPreferences3 = sharedPreferences2;
                                            z8 = z5;
                                        }
                                        if (y(k27Var4)) {
                                            im7Var2.K++;
                                        }
                                        int h = vf6Var.h(j7);
                                        if (h < 0 || b22 != j) {
                                            int o = im7Var2.o(j7, b22);
                                            if (o == -1) {
                                                j8 = b22;
                                                sharedPreferences3 = sharedPreferences2;
                                                sparseArray = sparseArray3;
                                                j10 = j6;
                                                j9 = j7;
                                                boolean x = x(j9, Boolean.valueOf(z4), k27Var4.I, k27Var4.J);
                                                if (w01.a) {
                                                    fa4.b("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + j9 + ", " + z4 + ", " + k27Var4.I + ", " + k27Var4.J + ") = " + x);
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
                                            vf6Var.k(Boolean.valueOf(z6), j9);
                                        } else {
                                            z6 = ((Boolean) vf6Var.n(h)).booleanValue();
                                            j8 = b22;
                                            j9 = j7;
                                            str = ", ";
                                            sharedPreferences3 = sharedPreferences2;
                                            sparseArray = sparseArray3;
                                            j10 = j6;
                                        }
                                        if (w01.a) {
                                            fa4.b("NotificationsController: process new messages, value is " + z6 + " (" + j9 + str + z4 + str + k27Var4.I + str + k27Var4.J + ")");
                                        }
                                        im7Var = this;
                                        if (z6) {
                                            if (!z) {
                                                long j17 = j9;
                                                i5 = a(arrayList2, k27Var4, j17, z4, sharedPreferences3);
                                                j9 = j17;
                                            }
                                            if (!z10) {
                                                z10 = k27Var4.k.from_scheduled;
                                            }
                                            im7Var.b.add(k27Var4);
                                            im7Var.b(k27Var4);
                                            if (e12 != 0) {
                                                if (sparseArray == null) {
                                                    SparseArray sparseArray4 = new SparseArray();
                                                    im7Var.c.k(sparseArray4, j10);
                                                    sparseArray2 = sparseArray4;
                                                } else {
                                                    sparseArray2 = sparseArray;
                                                }
                                                i3 = e12;
                                                sparseArray2.put(i3, k27Var4);
                                            } else {
                                                i3 = e12;
                                                if (j3 != j) {
                                                    im7Var.d.k(k27Var4, j3);
                                                }
                                            }
                                            if (j16 != j9) {
                                                Integer num2 = (Integer) im7Var.r.f(j16);
                                                im7Var.r.k(Integer.valueOf(num2 == null ? 1 : num2.intValue() + 1), j16);
                                            }
                                        } else {
                                            i3 = e12;
                                        }
                                        if (k27Var4.I) {
                                            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                            sparseBooleanArray.put(i3, true);
                                            im7Var.getMessagesController().L(j9, j8, sparseBooleanArray, true);
                                        }
                                        z8 = true;
                                    } else {
                                        if (!z && im7Var2.N && !MediaController.w().E()) {
                                            try {
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                            }
                                        }
                                        if (w01.a) {
                                            fa4.b("skipped message because chat is already opened (openedDialogId = " + im7Var2.G + ")");
                                        }
                                    }
                                } else if (w01.a) {
                                    fa4.b("skipped message because edited");
                                }
                                sharedPreferences2 = sharedPreferences;
                                im7Var = im7Var2;
                                sharedPreferences3 = sharedPreferences2;
                                z8 = z5;
                            }
                        }
                    } else {
                        k27Var = k27Var5;
                        i2 = i4;
                    }
                    z5 = z8;
                    j5 = B02;
                    k27Var2 = k27Var;
                    byte b32 = 10;
                    if (k27Var2 == null) {
                    }
                }
                i4 = i2 + 1;
                im7Var2 = im7Var;
                d = sharedPreferences3;
                arrayList3 = arrayList;
            }
            if (w01.a) {
            }
            i2 = i4;
            z5 = z8;
            sharedPreferences2 = d;
            im7Var = im7Var2;
            sharedPreferences3 = sharedPreferences2;
            z8 = z5;
            i4 = i2 + 1;
            im7Var2 = im7Var;
            d = sharedPreferences3;
            arrayList3 = arrayList;
        }
        im7 im7Var3 = im7Var2;
        boolean z16 = z8;
        byte b4 = 0;
        if (z16) {
            im7Var3.L = z2;
        }
        if (!arrayList2.isEmpty() && !gl.n2(false) && !gba.B) {
            gl.d3(new j45((Object) im7Var3, (Object) arrayList2, i5, (byte) 17));
        }
        if (z || z10) {
            if (z9) {
                if (w01.a) {
                    fa4.b("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + im7Var3.L);
                }
                im7Var3.b.clear();
                im7Var3.Z(im7Var3.L);
            } else if (z16) {
                if (w01.a) {
                    fa4.b("NotificationsController processNewMessages: added branch");
                }
                k27 k27Var6 = (k27) arrayList.get(0);
                long B03 = k27.B0(k27Var6.k);
                long b23 = k27.b2(im7Var3.currentAccount, k27Var6.k, im7Var3.getMessagesController().r2(B03), false);
                Boolean valueOf = k27Var6.i3() ? Boolean.valueOf(k27Var6.f) : null;
                int i7 = im7Var3.J;
                int o2 = im7Var3.o(B03, b23);
                boolean x2 = o2 == -1 ? im7Var3.x(B03, valueOf, k27Var6.I, k27Var6.J) : o2 != 2;
                Integer num3 = (Integer) im7Var3.f.f(B03);
                if (num3 != null) {
                    z3 = true;
                    i = num3.intValue() + 1;
                } else {
                    z3 = true;
                    i = 1;
                }
                if (im7Var3.L && !x2 && (num = (Integer) im7Var3.r.f(B03)) != null && num.intValue() != 0) {
                    i = num.intValue();
                    x2 = z3;
                }
                if (x2 && !k27Var6.K) {
                    if (!im7Var3.getMessagesController().l2(B03)) {
                        if (im7Var3.getMessagesController().r2(B03)) {
                            int i8 = im7Var3.J - ((num3 == null || num3.intValue() <= 0) ? 0 : z3);
                            im7Var3.J = i8;
                            im7Var3.J = i8 + (i > 0 ? z3 : 0);
                        } else {
                            if (num3 != null) {
                                im7Var3.J -= num3.intValue();
                            }
                            im7Var3.J += i;
                        }
                    }
                    im7Var3.f.k(Integer.valueOf(i), B03);
                }
                if (i7 != im7Var3.J || z11) {
                    im7Var3.b.clear();
                    if (w01.a) {
                        fa4.b("NotificationsController processNewMessages: added branch: " + im7Var3.L);
                    }
                    im7Var3.Z(im7Var3.L);
                    gl.d3(new cm7(im7Var3, im7Var3.f.m(), b4));
                }
                im7Var3.L = false;
                if (im7Var3.S) {
                    im7Var3.S(im7Var3.t());
                }
            }
        }
        if (z11) {
            im7Var3.d0();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
            return;
        }
        return;
        try {
            im7Var2.getAccountInstance().d();
            if (im7Var2.o(im7Var2.G, im7Var2.H) != 2) {
                l0.c(new wl7(im7Var2, (byte) 8));
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
        }
        if (w01.a) {
        }
        sharedPreferences2 = sharedPreferences;
        im7Var = im7Var2;
        sharedPreferences3 = sharedPreferences2;
        z8 = z5;
        i4 = i2 + 1;
        im7Var2 = im7Var;
        d = sharedPreferences3;
        arrayList3 = arrayList;
    }

    public final void E(long j, String str) {
        if (getUserConfig().o()) {
            if (gba.N0 || this.currentAccount == y6c.t0) {
                try {
                    String str2 = "wallet_tonconnect_" + this.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        NotificationManager notificationManager = n0;
                        fk.g();
                        notificationManager.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    String M0 = (TextUtils.isEmpty(str) || (gl.n2(false) || gba.B || !getAccountInstance().d().getBoolean("EnablePreviewAll", true))) ? k96.M0(2131747733, null) : k96.a0(null, null, 2131747732, str);
                    Intent intent = new Intent(a.b, (Class<?>) LaunchActivity.class);
                    intent.setAction("android.intent.action.VIEW");
                    intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent.putExtra("currentAccount", this.currentAccount);
                    intent.addFlags(67108864);
                    PendingIntent activity = PendingIntent.getActivity(a.b, this.currentAccount, intent, 201326592);
                    xk7 xk7Var = new xk7(a.b, str2);
                    xk7Var.F.icon = R.drawable.notification;
                    xk7Var.e = xk7.c(k96.M0(R.string.AppName, null));
                    xk7Var.f = xk7.c(M0);
                    sk7 sk7Var = new sk7((byte) 0);
                    sk7Var.f = xk7.c(M0);
                    xk7Var.i(sk7Var);
                    xk7Var.u = "event";
                    xk7Var.x = 0;
                    xk7Var.F.when = j;
                    xk7Var.f(16, true);
                    xk7Var.g = activity;
                    m0.e("wallet_tonconnect", this.currentAccount, xk7Var.b());
                } catch (Exception e) {
                    fa4.g(e, true);
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
        SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
        if (!x || z2) {
            edit.putInt("notify2_" + p(j, j2, false), 0);
        } else {
            edit.remove("notify2_" + p(j, j2, false));
        }
        if (j2 == 0) {
            getMessagesStorage().B1(j, 0L);
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
            SharedPreferences.Editor edit = na7.q1(this.currentAccount).W3.edit();
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
                ad7.Y(this.currentAccount).B1(j, j3);
                TLRPC.Dialog dialog = (TLRPC.Dialog) na7.q1(this.currentAccount).R.f(j);
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
            hm7 hm7Var = (hm7) arrayList3.get(i);
            HashMap hashMap = hm7Var.c;
            long j = hm7Var.a;
            i2 += hashMap.size();
            z |= hm7Var.d;
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j));
            if (V1 == null && (V1 = getMessagesStorage().h0(j)) != null) {
                getMessagesController().Z3(V1, true, false);
            }
            File file = null;
            if (V1 != null) {
                str = l7c.q(V1);
                TLRPC.UserProfilePhoto userProfilePhoto = V1.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    ba4 fileLoader = getFileLoader();
                    TLRPC.FileLocation fileLocation2 = V1.photo.photo_small;
                    fileLoader.getClass();
                    File J = ba4.J(fileLocation2, null, true, true);
                    if (!J.exists()) {
                        if (V1.photo.photo_big != null) {
                            ba4 fileLoader2 = getFileLoader();
                            TLRPC.FileLocation fileLocation3 = V1.photo.photo_big;
                            fileLoader2.getClass();
                            J = ba4.J(fileLocation3, null, true, true);
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
                str = hm7Var.b;
                i = str == null ? i + 1 : 0;
            }
            if (str.length() > 50) {
                str = str.substring(0, 25).concat("…");
            }
            arrayList.add(str);
            if (file != null) {
                arrayList2.add(file);
            } else if (V1 != null) {
                arrayList2.add(V1);
            }
        }
        if (z) {
            arrayList2.clear();
        }
        return new Pair(Integer.valueOf(i2), Boolean.valueOf(z));
    }

    public final void J(LongSparseIntArray longSparseIntArray) {
        l0.c(new bm7(this, longSparseIntArray, new ArrayList(), (byte) 0));
    }

    public final void K(ArrayList arrayList, boolean z, boolean z2, CountDownLatch countDownLatch) {
        boolean z3;
        boolean z4;
        if (w01.a) {
            StringBuilder sb = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            sb.append(Integer.valueOf(arrayList.size()));
            sb.append(" isLast=");
            z3 = z;
            sb.append(z3);
            sb.append(" isFcm=");
            z4 = z2;
            sb.append(z4);
            sb.append(")");
            fa4.b(sb.toString());
        } else {
            z3 = z;
            z4 = z2;
        }
        int i = 0;
        while (i < arrayList.size()) {
            k27 k27Var = (k27) arrayList.get(i);
            if (k27Var != null && k27Var.k != null && !k27Var.O3()) {
                TLRPC.MessageAction messageAction = k27Var.k.action;
                if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                    TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                    if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed || getConnectionsManager().getCurrentTime() - k27Var.k.date >= getMessagesController().a3 / 1000) {
                        VoIPGroupNotification.hide(a.b, this.currentAccount, k27Var.e1());
                    } else {
                        HashSet hashSet = new HashSet();
                        hashSet.add(Long.valueOf(k27.B0(k27Var.k)));
                        ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                        int size = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            TLRPC.Peer peer = arrayList2.get(i2);
                            i2++;
                            hashSet.add(Long.valueOf(cf3.n(peer)));
                        }
                        StringBuilder sb2 = new StringBuilder();
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            long longValue = ((Long) it.next()).longValue();
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(cf3.r(this.currentAccount, longValue));
                        }
                        VoIPGroupNotification.request(a.b, this.currentAccount, k27.B0(k27Var.k), sb2.toString(), tL_messageActionConferenceCall.call_id, k27Var.e1(), tL_messageActionConferenceCall.video);
                        arrayList.remove(i);
                        i--;
                    }
                }
            }
            i++;
        }
        if (!arrayList.isEmpty()) {
            l0.c(new d87(this, arrayList, new ArrayList(0), z4, z3, countDownLatch, (byte) 2));
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j, int i, int i2, boolean z) {
        l0.c(new ao6(this, longSparseIntArray, new ArrayList(0), j, i2, i, z));
    }

    public final void M(vf6 vf6Var, boolean z) {
        l0.c(new d97((Object) this, (Object) vf6Var, z, (Object) new ArrayList(0), (byte) 3));
    }

    public final void N(long j) {
        L(null, j, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j, 0);
        J(longSparseIntArray);
    }

    public final String O(k27 k27Var) {
        String str;
        TLRPC.Message message = k27Var.k;
        if (message == null || (str = message.message) == null || message.entities == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(str);
        if (k27Var.K2) {
            return sb.toString();
        }
        for (int i = 0; i < k27Var.k.entities.size(); i++) {
            if (k27Var.k.entities.get(i) instanceof TLRPC.TL_messageEntitySpoiler) {
                TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) k27Var.k.entities.get(i);
                for (int i2 = 0; i2 < tL_messageEntitySpoiler.length; i2++) {
                    int i3 = tL_messageEntitySpoiler.offset + i2;
                    char[] cArr = this.i0;
                    sb.setCharAt(i3, cArr[i2 % cArr.length]);
                }
            }
        }
        return sb.toString();
    }

    public final void P(xk7 xk7Var, long j, long j2, String str, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        fa4.b("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 == null || uri == null || TextUtils.equals(uri2.toString(), uri.toString())) {
            return;
        }
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        String uri3 = uri2.toString();
        String M0 = k96.M0(2131751587, null);
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
        xk7Var.y = e0(j, j2, str, jArr, i, uri2, i2, z, z2, z3, i3);
        m0.e(null, this.e0, xk7Var.b());
    }

    public final void Q(boolean z) {
        wl7 wl7Var = this.V;
        try {
            if (w01.a) {
                fa4.b("delay notification start, onlineReason = " + z);
            }
            this.W.acquire(10000L);
            co3 co3Var = l0;
            co3Var.a(wl7Var);
            co3Var.d(wl7Var, z ? 3000 : 1000);
        } catch (Exception e) {
            fa4.g(e, true);
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
            fa4.g(e, true);
        }
    }

    public final void S(int i) {
        if (this.O != i) {
            fa4.b("setBadge " + i);
            this.O = i;
            try {
                if (ak7.c == null && !ak7.b) {
                    ak7.b();
                    ak7.b = true;
                }
                yj7 yj7Var = ak7.c;
                if (yj7Var != null) {
                    yj7Var.a(i);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public final void T(long j, int i, long j2) {
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) na7.q1(y6c.t0).R.f(j);
        if (i == 4) {
            if (x(j, null, false, false)) {
                edit.remove("notify2_" + p(j, j2, false));
            } else {
                edit.putInt("notify2_" + p(j, j2, false), 0);
            }
            getMessagesStorage().B1(j, 0L);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        } else {
            int currentTime = ConnectionsManager.getInstance(y6c.t0).getCurrentTime();
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
            n(y6c.t0).N(j);
            ad7.Y(y6c.t0).B1(j, j3);
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
        ad7 messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new vb7(messagesStorage, (byte) 26));
        g(i);
    }

    public final void V(int i) {
        l0.c(new cm7(this, i, (byte) 7));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(87:51|(2:53|(3:55|56|57)(4:58|(2:61|59)|62|63))(1:895)|64|65|(1:67)(3:890|(1:892)(1:894)|893)|68|(4:71|(2:73|74)(1:76)|75|69)|77|78|(5:80|(2:(1:83)(1:761)|84)(1:762)|(1:760)(2:90|(2:94|95))|759|95)(3:763|(3:(1:875)(1:772)|773|(13:775|(2:777|(1:779)(5:828|(1:830)|831|380|381))(2:832|(1:840)(2:836|(1:838)))|780|781|(1:783)(2:818|(1:820)(2:821|(1:823)(2:824|(1:826)(7:827|785|786|(1:817)(4:791|(4:793|(1:807)(2:797|(2:801|802))|806|802)(2:808|(2:810|(2:812|(1:814))))|803|(1:805))|816|803|(0)))))|784|785|786|(0)|817|816|803|(0))(9:841|(2:843|(1:845)(5:847|(1:849)|831|380|381))(9:850|(1:874)(1:854)|855|(1:873)(2:859|(1:861))|872|863|(2:865|(1:867))(1:871)|(1:869)|870)|846|786|(0)|817|816|803|(0)))(3:876|(5:878|(2:880|(1:882))(2:883|(2:885|(1:887)))|831|380|381)(1:889)|888)|57)|(1:758)(2:99|(1:101))|102|(3:104|(1:106)(1:756)|107)(1:757)|108|(3:110|(3:112|(1:114)(3:743|744|(3:746|(1:748)(1:750)|749)(1:751))|115)|754)(1:755)|(2:(1:741)(3:122|(1:124)(2:(2:737|738)|736)|125)|126)(1:742)|127|(5:700|(5:702|(4:705|(2:713|714)|715|703)|720|721|(4:723|(1:725)|726|727)(1:733))(1:734)|728|(1:730)(1:732)|731)(1:130)|131|(1:133)|134|(1:136)(1:690)|137|(1:689)(1:141)|142|143|(1:688)(3:146|(1:148)|(3:653|654|(59:658|659|660|(6:664|(1:666)(2:(2:678|679)|682)|667|668|669|670)|151|(1:652)(1:155)|(1:651)(1:158)|159|(1:650)|166|(1:649)(1:173)|174|(11:176|(1:178)(2:377|(4:379|380|381|57)(2:382|(1:(1:385)(1:386))(2:387|(1:389)(2:390|(1:395)(1:394)))))|179|(2:182|180)|183|184|(1:376)(1:187)|188|(1:190)|(1:192)(1:375)|193)(4:396|(5:398|(1:400)(3:404|(1:406)(2:634|(2:639|(1:641)(2:642|(1:646)))(1:638))|(3:408|(1:410)|411)(14:412|(1:414)|415|(2:630|(1:632)(1:633))(1:421)|422|423|(3:622|(1:(1:625)(2:626|(1:628)))|629)(1:427)|428|(2:(2:431|(1:(2:434|(1:436))(1:616))(2:617|(1:619)))(1:620)|615)(1:621)|(4:548|(1:614)(5:554|(1:613)(4:557|(1:561)|(1:612)(2:567|(1:571))|611)|(2:576|(2:578|(1:588))(2:589|(1:599)))|(1:601)(1:(2:606|607))|602)|610|602)(1:440)|441|(7:443|(1:544)(8:456|(1:543)(3:460|(9:525|526|527|528|529|530|531|532|533)(1:462)|463)|464|(1:466)(1:524)|467|468|(2:519|520)(3:470|(3:515|(1:517)|518)|472)|(7:474|(1:476)|477|(2:479|(1:481))|482|483|(2:488|(2:490|(3:492|(2:497|498)(1:494)|(1:496))(2:501|(2:503|(1:505)))))))|512|(3:514|483|(3:486|488|(0)))|482|483|(0))(2:545|(1:547))|506|(2:508|(3:510|511|403))))|401|402|403)|647|648)|194|195|(44:197|(1:199)(2:349|(1:351)(2:352|(43:354|(1:356)(1:(1:359))|357|201|(1:203)|204|(1:206)|207|(2:209|(1:211)(1:344))(2:345|(1:347)(1:348))|(1:213)|214|(4:216|(2:219|217)|220|221)(1:343)|222|(1:224)(1:342)|225|(1:341)(1:231)|232|233|234|235|(1:237)|(4:239|240|241|(1:243))(1:337)|244|(1:246)|(2:250|(20:252|(4:255|(2:256|(2:258|(2:261|262)(1:260))(1:331))|(1:264)(1:265)|253)|332|266|(1:268)|269|(2:(1:274)|(1:281))|282|(1:288)|289|(1:291)|(1:293)|294|(3:299|(4:301|(3:303|(4:305|(1:307)|308|309)(2:311|312)|310)|313|314)|315)|(1:330)(2:318|(2:322|(1:324)))|325|(1:327)|328|329|57))|333|(0)|269|(3:271|(0)|(2:276|281))|282|(3:284|286|288)|289|(0)|(0)|294|(4:296|299|(0)|315)|(0)|330|325|(0)|328|329|57)))|200|201|(0)|204|(0)|207|(0)(0)|(0)|214|(0)(0)|222|(0)(0)|225|(1:227)|341|232|233|234|235|(0)|(0)(0)|244|(0)|(3:248|250|(0))|333|(0)|269|(0)|282|(0)|289|(0)|(0)|294|(0)|(0)|330|325|(0)|328|329|57)|360|(4:362|(2:365|363)|366|367)(2:368|(1:370)(2:371|(1:373)(1:374)))|201|(0)|204|(0)|207|(0)(0)|(0)|214|(0)(0)|222|(0)(0)|225|(0)|341|232|233|234|235|(0)|(0)(0)|244|(0)|(0)|333|(0)|269|(0)|282|(0)|289|(0)|(0)|294|(0)|(0)|330|325|(0)|328|329|57)))|150|151|(1:153)|652|(0)|651|159|(1:161)|650|166|(1:169)|649|174|(0)(0)|194|195|(0)|360|(0)(0)|201|(0)|204|(0)|207|(0)(0)|(0)|214|(0)(0)|222|(0)(0)|225|(0)|341|232|233|234|235|(0)|(0)(0)|244|(0)|(0)|333|(0)|269|(0)|282|(0)|289|(0)|(0)|294|(0)|(0)|330|325|(0)|328|329|57) */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x138b, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x138c, code lost:
    
        r4 = r73;
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
    /* JADX WARN: Removed duplicated region for block: B:203:0x11aa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x11cc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1226  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x127f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x12a3  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x1300  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x132e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x1361 A[Catch: Exception -> 0x138b, TRY_LEAVE, TryCatch #2 {Exception -> 0x138b, blocks: (B:235:0x1343, B:237:0x1361), top: B:234:0x1343 }] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x1369  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x1393  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x139c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x13a6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x13f3  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x1435  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x143b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x145a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x146f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x1474  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x1481  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x148e  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x14ff A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x1535  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x1376  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x1307  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x12ca  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x125b  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x1155  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x117b  */
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
    /* JADX WARN: Removed duplicated region for block: B:900:0x15a3  */
    /* JADX WARN: Removed duplicated region for block: B:910:0x160c  */
    /* JADX WARN: Removed duplicated region for block: B:922:0x166d  */
    /* JADX WARN: Removed duplicated region for block: B:948:0x15e2  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x01b7 A[EDGE_INSN: B:954:0x01b7->B:898:0x01b7 BREAK  A[LOOP:2: B:48:0x01a9->B:57:0x1587], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:955:0x0174  */
    /* JADX WARN: Type inference failed for: r4v10, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r8v111 */
    /* JADX WARN: Type inference failed for: r8v112, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v113 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(xk7 xk7Var, String str, long j, long j2, String str2, long[] jArr, int i, Uri uri, int i2, boolean z, boolean z2, boolean z3, int i3) {
        boolean z4;
        vf6 vf6Var;
        boolean z5;
        long e;
        boolean z6;
        vf6 vf6Var2;
        int size;
        ArrayList arrayList;
        boolean z7;
        vf6 vf6Var3;
        ArrayList arrayList2;
        String str3;
        int i4;
        int size2;
        int i5;
        vf6 vf6Var4;
        boolean z8;
        int i6;
        boolean z9;
        Notification notification;
        long j3;
        long j4;
        vf6 vf6Var5;
        int e1;
        k27 k27Var;
        ArrayList arrayList3;
        int i7;
        Integer num;
        int i8;
        vf6 vf6Var6;
        Notification notification2;
        Integer num2;
        int i9;
        int i10;
        gm7 gm7Var;
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
        vf6 vf6Var7;
        ArrayList arrayList4;
        long j6;
        TLRPC.Chat K0;
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
        String q;
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
        mk7 b;
        mk7 mk7Var;
        long j7;
        fl7 fl7Var;
        int i16;
        k27 k27Var2;
        StringBuilder sb;
        gm7 gm7Var2;
        long j8;
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
        gm7 gm7Var3;
        vf6 vf6Var8;
        k27 k27Var3;
        ArrayList arrayList6;
        char c2;
        ArrayList arrayList7;
        Uri uri2;
        File file3;
        File file4;
        Uri c3;
        File file5;
        long j12;
        long j13;
        Bitmap bitmap4;
        mk7 mk7Var2;
        String str15;
        k27 k27Var4;
        long j14;
        k27 k27Var5;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton;
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy;
        long j15;
        TLRPC.User user7;
        int size3;
        int i22;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList8;
        TLRPC.Message message;
        TLRPC.ReplyMarkup replyMarkup;
        ArrayList arrayList9;
        boolean z14;
        ?? r8;
        String G;
        TLRPC.UserProfilePhoto userProfilePhoto3;
        TLRPC.FileLocation fileLocation12;
        IconCompat iconCompat2;
        IconCompat iconCompat3;
        int i23;
        Bitmap bitmap5;
        String G2;
        TLRPC.UserProfilePhoto userProfilePhoto4;
        TLRPC.FileLocation fileLocation13;
        im7 im7Var = this;
        fa4.b("showExtraNotifications pushMessages.size()=" + im7Var.a.size());
        if (Build.VERSION.SDK_INT >= 26) {
            z4 = z3;
            xk7Var.y = im7Var.e0(j, j2, str2, jArr, i, uri, i2, z, z2, z4, i3);
        } else {
            z4 = z3;
        }
        xk7Var.f(8, z4);
        Notification b2 = xk7Var.b();
        SharedPreferences d = im7Var.getAccountInstance().d();
        ArrayList arrayList10 = new ArrayList();
        if (!im7Var.E.isEmpty()) {
            arrayList10.add(new gm7(0L, 0L, true));
        }
        vf6 vf6Var9 = new vf6();
        int i24 = 0;
        for (int i25 = 0; i25 < im7Var.a.size(); i25++) {
            k27 k27Var6 = (k27) im7Var.a.get(i25);
            long A0 = k27Var6.A0();
            long a2 = k27.a2(im7Var.currentAccount, k27Var6.k, im7Var.getMessagesController().s2(k27Var6));
            int i26 = d.getInt("dismissDate" + A0, 0);
            if (k27Var6.K || k27Var6.k.date > i26) {
                ArrayList arrayList11 = (ArrayList) vf6Var9.f(A0);
                if (arrayList11 == null) {
                    arrayList11 = tb4.s(vf6Var9, A0);
                    fa4.b("showExtraNotifications: sortedDialogs += " + A0);
                    arrayList10.add(new gm7(A0, a2, false));
                }
                arrayList11.add(k27Var6);
            } else {
                StringBuilder o = ug8.o(A0, "showExtraNotifications: dialog ", " is skipped, message date (");
                o.append(k27Var6.k.date);
                o.append(" <= ");
                o.append(i26);
                o.append(")");
                fa4.b(o.toString());
            }
        }
        vf6 vf6Var10 = new vf6();
        int i27 = 0;
        while (true) {
            int m = im7Var.h.m();
            vf6Var = im7Var.h;
            if (i27 >= m) {
                break;
            }
            vf6Var10.k((Integer) im7Var.h.n(i27), vf6Var.j(i27));
            i27++;
        }
        vf6Var.b();
        ArrayList arrayList12 = new ArrayList();
        int i28 = Build.VERSION.SDK_INT;
        if (i28 > 27) {
            if (arrayList10.size() <= (im7Var.E.isEmpty() ? 1 : 2)) {
                z5 = false;
                if (z5 && i28 >= 26) {
                    c();
                }
                e = im7Var.getUserConfig().e();
                z6 = !gl.m2() || gba.B;
                fa4.b("showExtraNotifications: passcode=" + (gba.r.length() <= 0) + " waitingForPasscode=" + z6 + " selfUserId=" + e + " useSummaryNotification=" + z5);
                vf6Var2 = new vf6();
                size = arrayList10.size();
                arrayList = arrayList12;
                while (true) {
                    if (i24 >= size) {
                        break;
                    }
                    if (arrayList.size() >= 7) {
                        fa4.b("showExtraNotifications: break from holders, count over 7");
                        break;
                    }
                    gm7 gm7Var4 = (gm7) arrayList10.get(i24);
                    ArrayList arrayList13 = arrayList10;
                    if (gm7Var4.c) {
                        ArrayList arrayList14 = new ArrayList();
                        if (im7Var.E.isEmpty()) {
                            StringBuilder sb3 = new StringBuilder("showExtraNotifications: [");
                            z8 = z6;
                            sb3.append(gm7Var4.a);
                            sb3.append("] continue; story but storyPushMessages is empty");
                            fa4.b(sb3.toString());
                            z9 = z5;
                            notification3 = b2;
                            sharedPreferences = d;
                            vf6Var5 = vf6Var9;
                            i8 = i24;
                            vf6Var6 = vf6Var10;
                            vf6Var7 = vf6Var2;
                            i6 = size;
                            j6 = e;
                            arrayList4 = arrayList;
                            i24 = i8 + 1;
                            arrayList = arrayList4;
                            arrayList10 = arrayList13;
                            z5 = z9;
                            z6 = z8;
                            size = i6;
                            vf6Var9 = vf6Var5;
                            vf6Var10 = vf6Var6;
                            d = sharedPreferences;
                            e = j6;
                            b2 = notification3;
                            vf6Var2 = vf6Var7;
                        } else {
                            z8 = z6;
                            i6 = size;
                            long j16 = ((hm7) im7Var.E.get(0)).a;
                            int i29 = 0;
                            for (Iterator it = ((hm7) im7Var.E.get(0)).c.keySet().iterator(); it.hasNext(); it = it) {
                                i29 = Math.max(i29, ((Integer) it.next()).intValue());
                            }
                            z9 = z5;
                            arrayList3 = arrayList14;
                            vf6Var5 = vf6Var9;
                            e1 = i29;
                            j3 = j16;
                            j4 = 0;
                            notification = b2;
                            k27Var = null;
                        }
                    } else {
                        z8 = z6;
                        i6 = size;
                        long j17 = gm7Var4.a;
                        z9 = z5;
                        notification = b2;
                        long j18 = gm7Var4.b;
                        ArrayList arrayList15 = (ArrayList) vf6Var9.f(j17);
                        j3 = j17;
                        j4 = j18;
                        vf6Var5 = vf6Var9;
                        e1 = ((k27) arrayList15.get(0)).e1();
                        k27Var = (k27) arrayList15.get(0);
                        arrayList3 = arrayList15;
                    }
                    long j19 = e;
                    Integer num3 = (Integer) vf6Var10.f(gm7Var4.a);
                    if (gm7Var4.c) {
                        num = 2147483646;
                        i7 = 32;
                    } else {
                        i7 = 32;
                        long j20 = gm7Var4.a;
                        if (num3 == null) {
                            num3 = Integer.valueOf(((int) j20) + ((int) (j20 >> 32)));
                        } else {
                            vf6Var10.l(j20);
                        }
                        num = num3;
                    }
                    i8 = i24;
                    int i30 = 0;
                    for (int i31 = 0; i31 < arrayList3.size(); i31++) {
                        if (i30 < ((k27) arrayList3.get(i31)).k.date) {
                            i30 = ((k27) arrayList3.get(i31)).k.date;
                        }
                    }
                    if (gm7Var4.c) {
                        vf6Var6 = vf6Var10;
                        TLRPC.User V1 = im7Var.getMessagesController().V1(Long.valueOf(j3));
                        notification2 = notification;
                        if (im7Var.E.size() == 1) {
                            G2 = V1 != null ? l7c.j(V1) : ((hm7) im7Var.E.get(0)).b;
                            num2 = num;
                        } else {
                            num2 = num;
                            G2 = k96.G(im7Var.E.size(), "Stories", new Object[0]);
                        }
                        if (V1 == null || (userProfilePhoto4 = V1.photo) == null || (fileLocation13 = userProfilePhoto4.photo_small) == null) {
                            i9 = i30;
                        } else {
                            i9 = i30;
                            if (fileLocation13.volume_id != 0 && fileLocation13.local_id != 0) {
                                i10 = e1;
                                gm7Var = gm7Var4;
                                j5 = j3;
                                z10 = false;
                                z11 = false;
                                z12 = false;
                                str4 = "showExtraNotifications: [";
                                str5 = "Stories";
                                fileLocation = fileLocation13;
                                user2 = V1;
                                L0 = G2;
                                chat = null;
                            }
                        }
                        i10 = e1;
                        gm7Var = gm7Var4;
                        j5 = j3;
                        z10 = false;
                        z11 = false;
                        z12 = false;
                        str4 = "showExtraNotifications: [";
                        str5 = "Stories";
                        fileLocation = null;
                        user2 = V1;
                        L0 = G2;
                        chat = null;
                    } else {
                        vf6Var6 = vf6Var10;
                        notification2 = notification;
                        num2 = num;
                        i9 = i30;
                        if (cf3.B(j3)) {
                            i10 = e1;
                            gm7Var = gm7Var4;
                            j5 = j3;
                            str4 = "showExtraNotifications: [";
                            str5 = "Stories";
                            if (j5 != o0) {
                                int h = cf3.h(j5);
                                TLRPC.EncryptedChat Y0 = im7Var.getMessagesController().Y0(Integer.valueOf(h));
                                if (Y0 != null) {
                                    user = im7Var.getMessagesController().V1(Long.valueOf(Y0.user_id));
                                    if (user == null) {
                                        if (w01.a) {
                                            fa4.l("not found secret chat user to show dialog notification " + Y0.user_id);
                                        }
                                    }
                                } else if (w01.a) {
                                    fa4.l("not found secret chat to show dialog notification " + h);
                                }
                                sharedPreferences = d;
                                vf6Var7 = vf6Var2;
                                arrayList4 = arrayList;
                                j6 = j19;
                                notification3 = notification2;
                            } else {
                                user = null;
                            }
                            user2 = user;
                            L0 = k96.L0(2131745501);
                            fileLocation = null;
                            chat = null;
                            z10 = false;
                            z11 = false;
                            z12 = false;
                        } else {
                            boolean z15 = (k27Var == null || k27Var.I || k27Var.J || j3 == 777000) ? false : true;
                            if (cf3.D(j3)) {
                                TLRPC.User V12 = im7Var.getMessagesController().V1(Long.valueOf(j3));
                                if (V12 != null) {
                                    j5 = j3;
                                    q = l7c.q(V12);
                                    z10 = z15;
                                    TLRPC.UserProfilePhoto userProfilePhoto5 = V12.photo;
                                    if (userProfilePhoto5 == null || (fileLocation7 = userProfilePhoto5.photo_small) == null) {
                                        str5 = "Stories";
                                        user5 = V12;
                                    } else {
                                        str5 = "Stories";
                                        user5 = V12;
                                        if (fileLocation7.volume_id != 0) {
                                        }
                                    }
                                } else if (k27Var.i3()) {
                                    q = k27Var.b;
                                    user5 = V12;
                                    j5 = j3;
                                    z10 = z15;
                                    str5 = "Stories";
                                } else {
                                    if (w01.a) {
                                        fa4.l("not found user to show dialog notification " + j3);
                                    }
                                    sharedPreferences = d;
                                    vf6Var7 = vf6Var2;
                                    arrayList4 = arrayList;
                                    j6 = j19;
                                    notification3 = notification2;
                                }
                                fileLocation7 = null;
                                if (j5 == 489001) {
                                    L02 = k96.L0(2131753118);
                                } else if (j5 == 489000) {
                                    L02 = k96.L0(2131743377);
                                } else if (l7c.z(j5)) {
                                    L02 = k96.L0(2131746073);
                                } else if (j5 == j19) {
                                    L02 = k96.L0(2131748335);
                                } else {
                                    fileLocation2 = fileLocation7;
                                    i10 = e1;
                                    gm7Var = gm7Var4;
                                    str6 = q;
                                    K0 = null;
                                    z12 = false;
                                    str4 = "showExtraNotifications: [";
                                    user3 = user5;
                                    z11 = false;
                                    i11 = (j5 > 489000L ? 1 : (j5 == 489000L ? 0 : -1));
                                    if (i11 == 0 || k27Var == null || k27Var.W0() == null) {
                                        user4 = user3;
                                        i12 = i11;
                                        fileLocation3 = fileLocation2;
                                    } else {
                                        Long W0 = k27Var.W0();
                                        user4 = user3;
                                        i12 = i11;
                                        long longValue = W0.longValue();
                                        if (cf3.D(longValue)) {
                                            TLRPC.UserProfilePhoto userProfilePhoto6 = im7Var.getMessagesController().V1(W0).photo;
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
                                            TLRPC.ChatPhoto chatPhoto2 = im7Var.getMessagesController().K0(Long.valueOf(-longValue)).photo;
                                            if (chatPhoto2 != null) {
                                                fileLocation = chatPhoto2.photo_small;
                                                if (fileLocation != null) {
                                                    if (fileLocation.volume_id != 0) {
                                                    }
                                                }
                                            }
                                        }
                                        String str16 = str6;
                                        chat = K0;
                                        L0 = str16;
                                        user2 = user4;
                                        if (i12 == 0) {
                                            z10 = false;
                                        }
                                    }
                                    fileLocation = fileLocation3;
                                    String str162 = str6;
                                    chat = K0;
                                    L0 = str162;
                                    user2 = user4;
                                    if (i12 == 0) {
                                    }
                                }
                                i10 = e1;
                                str6 = L02;
                                gm7Var = gm7Var4;
                                z12 = false;
                                fileLocation2 = fileLocation7;
                                str4 = "showExtraNotifications: [";
                                user3 = user5;
                                K0 = null;
                                z11 = false;
                                i11 = (j5 > 489000L ? 1 : (j5 == 489000L ? 0 : -1));
                                if (i11 == 0) {
                                }
                                user4 = user3;
                                i12 = i11;
                                fileLocation3 = fileLocation2;
                                fileLocation = fileLocation3;
                                String str1622 = str6;
                                chat = K0;
                                L0 = str1622;
                                user2 = user4;
                                if (i12 == 0) {
                                }
                            } else {
                                j5 = j3;
                                z10 = z15;
                                str5 = "Stories";
                                K0 = im7Var.getMessagesController().K0(Long.valueOf(-j5));
                                if (K0 != null) {
                                    boolean z16 = K0.megagroup;
                                    boolean z17 = hc2.T(K0) && !K0.megagroup;
                                    String s = im7Var.s(K0);
                                    z11 = z16;
                                    TLRPC.ChatPhoto chatPhoto3 = K0.photo;
                                    if (chatPhoto3 == null || (fileLocation2 = chatPhoto3.photo_small) == null) {
                                        z12 = z17;
                                        gm7Var = gm7Var4;
                                    } else {
                                        z12 = z17;
                                        gm7Var = gm7Var4;
                                        if (fileLocation2.volume_id != 0) {
                                        }
                                    }
                                    fileLocation2 = null;
                                    if (j4 != 0) {
                                        str4 = "showExtraNotifications: [";
                                        i10 = e1;
                                        TLRPC.TL_forumTopic f = im7Var.getMessagesController().g4.f(K0.id, j4);
                                        if (f != null) {
                                            s = ls6.o(f.title, " in ", s, new StringBuilder());
                                        }
                                    } else {
                                        str4 = "showExtraNotifications: [";
                                        i10 = e1;
                                    }
                                    if (z10) {
                                        z10 = hc2.q(K0);
                                    }
                                    str6 = s;
                                } else if (k27Var.i3()) {
                                    boolean z42 = k27Var.z4();
                                    str6 = k27Var.b;
                                    i10 = e1;
                                    z11 = z42;
                                    gm7Var = gm7Var4;
                                    z12 = k27Var.f;
                                    fileLocation2 = null;
                                    z10 = false;
                                    str4 = "showExtraNotifications: [";
                                } else {
                                    if (w01.a) {
                                        fa4.l("not found chat to show dialog notification " + j5);
                                    }
                                    sharedPreferences = d;
                                    vf6Var7 = vf6Var2;
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
                                String str16222 = str6;
                                chat = K0;
                                L0 = str16222;
                                user2 = user4;
                                if (i12 == 0) {
                                }
                            }
                        }
                        i24 = i8 + 1;
                        arrayList = arrayList4;
                        arrayList10 = arrayList13;
                        z5 = z9;
                        z6 = z8;
                        size = i6;
                        vf6Var9 = vf6Var5;
                        vf6Var10 = vf6Var6;
                        d = sharedPreferences;
                        e = j6;
                        b2 = notification3;
                        vf6Var2 = vf6Var7;
                    }
                    if (k27Var == null || !k27Var.J) {
                        i13 = 2131747828;
                    } else {
                        i13 = 2131747828;
                        if (!d.getBoolean("EnableReactionsPreview", true)) {
                            L0 = k96.L0(2131747828);
                            fileLocation = null;
                            z10 = false;
                        }
                    }
                    if (z8) {
                        str7 = cf3.y(j5) ? k96.L0(i13) : k96.L0(2131747825);
                        fileLocation8 = null;
                        z10 = false;
                    } else {
                        TLRPC.FileLocation fileLocation14 = fileLocation;
                        str7 = L0;
                        fileLocation8 = fileLocation14;
                    }
                    if (fileLocation8 != null) {
                        im7Var.getFileLoader().getClass();
                        i14 = 2131747825;
                        file = ba4.K(fileLocation8, true);
                        if (Build.VERSION.SDK_INT < 28) {
                            BitmapDrawable y = fl5.z().y(fileLocation8);
                            if (y != null) {
                                bitmap5 = y.getBitmap();
                            } else {
                                try {
                                    if (file.exists()) {
                                        float L = 160.0f / gl.L(50.0f);
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
                        i14 = 2131747825;
                        bitmap = null;
                        file = null;
                    }
                    if (chat != null) {
                        if (file == null || !file.exists() || (i23 = Build.VERSION.SDK_INT) < 28) {
                            str9 = str4;
                            iconCompat3 = null;
                        } else {
                            if (j5 == 489001) {
                                iconCompat3 = IconCompat.d(a.b, R.drawable.ic_launcher_dr);
                            } else {
                                if (i23 >= 28) {
                                    try {
                                        iconCompat3 = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new am7()));
                                    } catch (Throwable unused2) {
                                    }
                                }
                                iconCompat3 = null;
                            }
                            str9 = str4;
                        }
                        long j21 = -chat.id;
                        sharedPreferences = d;
                        l38 l38Var = new l38();
                        l38Var.a = str7;
                        l38Var.b = iconCompat3;
                        str8 = str7;
                        l38Var.c = null;
                        l38Var.d = null;
                        l38Var.e = false;
                        l38Var.f = false;
                        vf6Var2.k(l38Var, j21);
                    } else {
                        sharedPreferences = d;
                        str8 = str7;
                        str9 = str4;
                    }
                    String str17 = "currentAccount";
                    if ((!z12 || z11) && z10 && !gba.B && j19 != j5 && !l7c.z(j5) && na7.q1(im7Var.currentAccount).K1(j5) <= 0) {
                        bitmap2 = bitmap;
                        Intent intent = new Intent(a.b, (Class<?>) WearReplyReceiver.class);
                        intent.putExtra("dialog_id", j5);
                        int i32 = i10;
                        intent.putExtra("max_id", i32);
                        intent.putExtra("topic_id", j4);
                        intent.putExtra("currentAccount", im7Var.currentAccount);
                        if (arrayList3.isEmpty()) {
                            str10 = "max_id";
                            user6 = user2;
                            chat2 = chat;
                        } else {
                            ArrayList arrayList16 = new ArrayList();
                            user6 = user2;
                            chat2 = chat;
                            for (int i33 = 0; i33 < arrayList3.size(); i33++) {
                                k27 k27Var7 = (k27) arrayList3.get(i33);
                                if (k27Var7 != null && k27Var7.O4() && k27Var7.R2() && !k27Var7.N3()) {
                                    arrayList16.add(Integer.valueOf(k27Var7.e1()));
                                }
                            }
                            if (arrayList16.isEmpty()) {
                                str10 = "max_id";
                            } else {
                                int size4 = arrayList16.size();
                                int[] iArr = new int[size4];
                                str10 = "max_id";
                                for (int i34 = 0; i34 < size4; i34++) {
                                    iArr[i34] = ((Integer) arrayList16.get(i34)).intValue();
                                }
                                intent.putExtra("voice_msg_ids", iArr);
                            }
                        }
                        PendingIntent broadcast = PendingIntent.getBroadcast(a.b, num2.intValue(), intent, 167772160);
                        g69 g69Var = new g69(k96.L0(2131746070), new Bundle(), new HashSet());
                        if (cf3.y(j5)) {
                            r4 = 1;
                            z13 = false;
                            Z = k96.Z(2131746058, str8);
                        } else {
                            r4 = 1;
                            z13 = false;
                            Z = k96.Z(2131746051, str8);
                        }
                        i15 = i32;
                        lk7 lk7Var = new lk7(R.drawable.ic_reply_icon, broadcast, Z);
                        lk7Var.d = r4;
                        lk7Var.g = r4;
                        lk7Var.a(g69Var);
                        lk7Var.h = z13;
                        b = lk7Var.b();
                    } else {
                        str10 = "max_id";
                        bitmap2 = bitmap;
                        user6 = user2;
                        i15 = i10;
                        chat2 = chat;
                        b = null;
                    }
                    Integer num4 = (Integer) im7Var.f.f(j5);
                    if (num4 == null) {
                        num4 = 0;
                    }
                    gm7 gm7Var5 = gm7Var;
                    int size5 = gm7Var5.c ? im7Var.E.size() : Math.max(num4.intValue(), arrayList3.size());
                    String format = (size5 <= 1 || Build.VERSION.SDK_INT >= 28) ? str8 : String.format("%1$s (%2$d)", str8, Integer.valueOf(size5));
                    l38 l38Var2 = (l38) vf6Var2.f(j19);
                    int i35 = Build.VERSION.SDK_INT;
                    if (i35 < 28 || l38Var2 != null) {
                        mk7Var = b;
                    } else {
                        mk7Var = b;
                        TLRPC.User V13 = im7Var.getMessagesController().V1(Long.valueOf(j19));
                        if (V13 == null) {
                            V13 = im7Var.getUserConfig().f();
                        }
                        if (V13 != null) {
                            try {
                                userProfilePhoto3 = V13.photo;
                            } catch (Throwable th) {
                                th = th;
                                j7 = j4;
                            }
                            if (userProfilePhoto3 != null && (fileLocation12 = userProfilePhoto3.photo_small) != null) {
                                j7 = j4;
                                try {
                                    if (fileLocation12.volume_id != 0 && fileLocation12.local_id != 0) {
                                        String L03 = k96.L0(2131750487);
                                        ba4 fileLoader = im7Var.getFileLoader();
                                        TLRPC.FileLocation fileLocation15 = V13.photo.photo_small;
                                        fileLoader.getClass();
                                        File K = ba4.K(fileLocation15, true);
                                        if (im7Var.getUserConfig().e() == 489001) {
                                            iconCompat2 = IconCompat.d(a.b, R.drawable.ic_launcher_dr);
                                        } else {
                                            if (K != null && i35 >= 28) {
                                                try {
                                                    iconCompat2 = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(K), new am7()));
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            iconCompat2 = null;
                                        }
                                        l38 l38Var3 = new l38();
                                        l38Var3.a = L03;
                                        l38Var3.b = iconCompat2;
                                        l38Var3.c = null;
                                        l38Var3.d = null;
                                        l38Var3.e = false;
                                        l38Var3.f = false;
                                        try {
                                            vf6Var2.k(l38Var3, j19);
                                            l38Var2 = l38Var3;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            l38Var2 = l38Var3;
                                            fa4.f(th);
                                            l38 l38Var4 = l38Var2;
                                            if (l38Var4 == null) {
                                            }
                                            i16 = Build.VERSION.SDK_INT;
                                            if (i16 >= 28) {
                                            }
                                            fl7Var.h = format;
                                            fl7Var.i = Boolean.valueOf(i16 >= 28 || (!z12 && cf3.y(j5)) || l7c.z(j5));
                                            StringBuilder sb4 = new StringBuilder();
                                            String[] strArr2 = new String[1];
                                            boolean[] zArr2 = new boolean[1];
                                            if (gm7Var5.c) {
                                            }
                                            ArrayList arrayList17 = arrayList3;
                                            long j22 = j5;
                                            vf6 vf6Var11 = vf6Var2;
                                            Intent intent2 = new Intent(a.b, (Class<?>) LaunchActivity.class);
                                            intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            intent2.setFlags(67108864);
                                            intent2.addCategory("android.intent.category.LAUNCHER");
                                            k27 k27Var8 = k27Var2;
                                            if (k27Var2 != null) {
                                            }
                                            j12 = j22;
                                            if (gm7Var2.c) {
                                            }
                                            j13 = j8;
                                            ug8.q(j13, ug8.o(j12, "show extra notifications chatId ", " topicId "));
                                            if (j13 != 0) {
                                            }
                                            String str18 = str11;
                                            intent2.putExtra(str18, im7Var.currentAccount);
                                            PendingIntent activity = PendingIntent.getActivity(a.b, 0, intent2, 1140850688);
                                            c5a c5aVar = new c5a((byte) 10);
                                            mk7 mk7Var3 = mk7Var;
                                            if (mk7Var != null) {
                                            }
                                            int i36 = i17;
                                            Intent intent3 = new Intent(a.b, (Class<?>) AutoMessageHeardReceiver.class);
                                            intent3.addFlags(i7);
                                            intent3.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                            intent3.putExtra("dialog_id", j12);
                                            int i37 = i15;
                                            intent3.putExtra(str10, i37);
                                            intent3.putExtra(str18, im7Var.currentAccount);
                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList18 = arrayList5;
                                            bitmap4 = bitmap3;
                                            lk7 lk7Var2 = new lk7(R.drawable.msg_markread, PendingIntent.getBroadcast(a.b, num2.intValue(), intent3, 167772160), k96.L0(2131748489));
                                            lk7Var2.g = (byte) 2;
                                            lk7Var2.h = false;
                                            mk7 b3 = lk7Var2.b();
                                            if (cf3.B(j12)) {
                                            }
                                            if (str15 != null) {
                                            }
                                            long j23 = j6;
                                            c5aVar.e = ls6.n(j23, "tgaccount");
                                            if (gm7Var2.c) {
                                            }
                                            xk7 xk7Var2 = new xk7(a.b);
                                            xk7Var2.e(str12);
                                            xk7Var2.F.icon = R.drawable.notification;
                                            xk7Var2.d(sb.toString());
                                            xk7Var2.f(16, true);
                                            xk7Var2.i = gm7Var2.c ? im7Var.E.size() : arrayList17.size();
                                            xk7Var2.w = -15618822;
                                            xk7Var2.r = false;
                                            xk7Var2.F.when = j14;
                                            xk7Var2.k = true;
                                            xk7Var2.i(fl7Var);
                                            xk7Var2.g = activity;
                                            c5aVar.m(xk7Var2);
                                            xk7Var2.s = String.valueOf(Long.MAX_VALUE - j14);
                                            xk7Var2.f(8, (z3 && j12 == j && j13 == j2) ? false : true);
                                            xk7Var2.u = "msg";
                                            Intent intent4 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                            intent4.putExtra("messageDate", i9);
                                            intent4.putExtra("dialogId", j12);
                                            intent4.putExtra(str18, im7Var.currentAccount);
                                            if (gm7Var2.c) {
                                            }
                                            if (k27Var4 != null) {
                                            }
                                            xk7Var2.F.deleteIntent = PendingIntent.getBroadcast(a.b, num2.intValue(), intent4, 167772160);
                                            if (z9) {
                                            }
                                            if (k27Var5 != null) {
                                            }
                                            keyboardInlineButton = null;
                                            tL_inlineButtonTypeCopy = null;
                                            if (keyboardInlineButton != null) {
                                            }
                                            j15 = gm7Var2.a;
                                            if (j15 != 489000) {
                                            }
                                            if (arrayList13.size() == 1) {
                                            }
                                            if (cf3.B(j12)) {
                                            }
                                            if (bitmap4 != null) {
                                            }
                                            if (!gl.n2(false)) {
                                            }
                                            if (chat2 == null) {
                                            }
                                            user7 = user6;
                                            boolean z18 = z9;
                                            Notification notification4 = notification2;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                            }
                                            fa4.b("showExtraNotifications: holders.add " + j12);
                                            notification3 = notification4;
                                            z9 = z18;
                                            vf6Var7 = vf6Var11;
                                            long j24 = j12;
                                            fm7 fm7Var = new fm7(im7Var, num2.intValue(), j24, gm7Var2.c, str12, user7, chat2, xk7Var2, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                                            arrayList4 = arrayList;
                                            arrayList4.add(fm7Var);
                                            im7Var.h.k(num2, j24);
                                            i24 = i8 + 1;
                                            arrayList = arrayList4;
                                            arrayList10 = arrayList13;
                                            z5 = z9;
                                            z6 = z8;
                                            size = i6;
                                            vf6Var9 = vf6Var5;
                                            vf6Var10 = vf6Var6;
                                            d = sharedPreferences;
                                            e = j6;
                                            b2 = notification3;
                                            vf6Var2 = vf6Var7;
                                        }
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                                l38 l38Var42 = l38Var2;
                                fl7Var = (l38Var42 == null && (k27Var != null || !(k27Var.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new fl7(l38Var42) : new fl7();
                                i16 = Build.VERSION.SDK_INT;
                                if (i16 >= 28 || ((cf3.y(j5) && !z12) || l7c.z(j5))) {
                                    fl7Var.h = format;
                                }
                                fl7Var.i = Boolean.valueOf(i16 >= 28 || (!z12 && cf3.y(j5)) || l7c.z(j5));
                                StringBuilder sb42 = new StringBuilder();
                                String[] strArr22 = new String[1];
                                boolean[] zArr22 = new boolean[1];
                                if (gm7Var5.c) {
                                    ArrayList arrayList19 = new ArrayList();
                                    ArrayList arrayList20 = new ArrayList();
                                    Pair I = im7Var.I(arrayList19, arrayList20);
                                    int intValue = ((Integer) I.first).intValue();
                                    boolean booleanValue = ((Boolean) I.second).booleanValue();
                                    if (booleanValue) {
                                        arrayList9 = arrayList20;
                                        j6 = j19;
                                        z14 = booleanValue;
                                        sb42.append(k96.G(intValue, "StoryNotificationHidden", new Object[0]));
                                    } else {
                                        j6 = j19;
                                        arrayList9 = arrayList20;
                                        z14 = booleanValue;
                                        if (arrayList19.isEmpty()) {
                                            fa4.b(str9 + j5 + "] continue; story but names is empty");
                                            vf6Var7 = vf6Var2;
                                            arrayList4 = arrayList;
                                            notification3 = notification2;
                                            i24 = i8 + 1;
                                            arrayList = arrayList4;
                                            arrayList10 = arrayList13;
                                            z5 = z9;
                                            z6 = z8;
                                            size = i6;
                                            vf6Var9 = vf6Var5;
                                            vf6Var10 = vf6Var6;
                                            d = sharedPreferences;
                                            e = j6;
                                            b2 = notification3;
                                            vf6Var2 = vf6Var7;
                                        } else if (arrayList19.size() == 1) {
                                            if (intValue == 1) {
                                                sb42.append(k96.N0("StoryNotificationSingle"));
                                            } else {
                                                sb42.append(k96.G(intValue, "StoryNotification1", arrayList19.get(0)));
                                            }
                                        } else if (arrayList19.size() == 2) {
                                            sb42.append(k96.Z(2131744362, arrayList19.get(0), arrayList19.get(1)));
                                        } else if (arrayList19.size() == 3 && im7Var.E.size() == 3) {
                                            sb42.append(k96.Z(2131744361, e((String) arrayList19.get(0)), e((String) arrayList19.get(1)), e((String) arrayList19.get(2))));
                                        } else {
                                            sb42.append(k96.G(im7Var.E.size() - 2, "StoryNotification4", e((String) arrayList19.get(0)), e((String) arrayList19.get(1))));
                                        }
                                    }
                                    long j25 = Long.MAX_VALUE;
                                    for (int i38 = 0; i38 < im7Var.E.size(); i38++) {
                                        j25 = Math.min(((hm7) im7Var.E.get(i38)).e, j25);
                                    }
                                    fl7Var.i = Boolean.FALSE;
                                    if (arrayList19.size() != 1 || z14) {
                                        r8 = 0;
                                        G = k96.G(intValue, str5, new Object[0]);
                                    } else {
                                        r8 = 0;
                                        G = (String) arrayList19.get(0);
                                    }
                                    l38 l38Var5 = new l38();
                                    l38Var5.a = G;
                                    l38Var5.b = null;
                                    l38Var5.c = null;
                                    l38Var5.d = null;
                                    l38Var5.e = r8;
                                    l38Var5.f = r8;
                                    el7 el7Var = new el7(sb42, j25, l38Var5);
                                    ArrayList arrayList21 = fl7Var.e;
                                    arrayList21.add(el7Var);
                                    if (arrayList21.size() > 25) {
                                        arrayList21.remove((int) r8);
                                    }
                                    bitmap3 = !z14 ? F(arrayList9) : null;
                                    k27Var2 = k27Var;
                                    sb = sb42;
                                    gm7Var2 = gm7Var5;
                                    j8 = j7;
                                    arrayList5 = null;
                                    str12 = G;
                                    str11 = "currentAccount";
                                    i17 = 0;
                                } else {
                                    j6 = j19;
                                    String str19 = str9;
                                    int size6 = arrayList3.size() - 1;
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList22 = null;
                                    int i39 = 0;
                                    while (size6 >= 0) {
                                        int i40 = size6;
                                        k27 k27Var9 = (k27) arrayList3.get(size6);
                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList23 = arrayList22;
                                        ArrayList arrayList24 = arrayList3;
                                        k27 k27Var10 = k27Var;
                                        long a22 = k27.a2(im7Var.currentAccount, k27Var9.k, im7Var.getMessagesController().s2(k27Var9));
                                        if (j7 != a22) {
                                            StringBuilder o2 = ug8.o(j5, str19, "] continue; topic id is not equal: topicId=");
                                            o2.append(j7);
                                            o2.append(" messageTopicId=");
                                            o2.append(a22);
                                            o2.append("; selfId=");
                                            o2.append(im7Var.getUserConfig().e());
                                            fa4.b(o2.toString());
                                            sb2 = sb42;
                                            gm7Var3 = gm7Var5;
                                            str13 = str19;
                                            strArr = strArr22;
                                            zArr = zArr22;
                                            j11 = j5;
                                            j10 = j7;
                                            str14 = str17;
                                            vf6Var8 = vf6Var2;
                                        } else {
                                            long j26 = j7;
                                            String q2 = im7Var.q(k27Var9, strArr22, zArr22);
                                            int i41 = (j5 > 489001L ? 1 : (j5 == 489001L ? 0 : -1));
                                            if (i41 == 0) {
                                                strArr22[0] = k96.L0(2131753118);
                                                i18 = i41;
                                                strArr = strArr22;
                                                zArr = zArr22;
                                            } else if (j5 != 489000 || k27Var9.W0() == null) {
                                                i18 = i41;
                                                strArr = strArr22;
                                                zArr = zArr22;
                                                if (j5 == j6) {
                                                    strArr[0] = str8;
                                                } else if (cf3.y(j5) && k27Var9.k.from_scheduled) {
                                                    strArr[0] = k96.L0(2131747769);
                                                }
                                            } else {
                                                i18 = i41;
                                                strArr = strArr22;
                                                zArr = zArr22;
                                                strArr[0] = im7Var.getMessagesController().x1(k27Var9.W0().longValue());
                                            }
                                            if (q2 == null) {
                                                if (w01.a) {
                                                    fa4.l("message text is null for " + k27Var9.e1() + " did = " + k27Var9.A0());
                                                }
                                                j10 = j26;
                                                sb2 = sb42;
                                                gm7Var3 = gm7Var5;
                                                str13 = str19;
                                                str14 = str17;
                                                vf6Var8 = vf6Var2;
                                                j11 = j5;
                                            } else {
                                                if (sb42.length() > 0) {
                                                    sb42.append("\n\n");
                                                }
                                                if (j5 != j6 && k27Var9.k.from_scheduled && cf3.D(j5)) {
                                                    q2 = String.format("%1$s: %2$s", k96.L0(2131747769), q2);
                                                    sb42.append(q2);
                                                } else {
                                                    String str20 = strArr[0];
                                                    if (str20 != null) {
                                                        sb42.append(String.format("%1$s: %2$s", str20, q2));
                                                    } else {
                                                        sb42.append(q2);
                                                    }
                                                }
                                                String str21 = q2;
                                                int i42 = (j5 > 489000L ? 1 : (j5 == 489000L ? 0 : -1));
                                                if (i42 != 0 || k27Var9.W0() == null) {
                                                    if (!cf3.D(j5)) {
                                                        if (z12) {
                                                            j9 = -j5;
                                                        } else if (cf3.y(j5)) {
                                                            j9 = k27Var9.R1();
                                                        }
                                                    }
                                                    j9 = j5;
                                                } else {
                                                    j9 = k27Var9.W0().longValue();
                                                }
                                                str13 = str19;
                                                str14 = str17;
                                                l38 l38Var6 = (l38) vf6Var2.f(j9 + (j26 << 16));
                                                String str22 = strArr[0];
                                                sb2 = sb42;
                                                if (str22 == null) {
                                                    if (!z8) {
                                                        j10 = j26;
                                                    } else if (!cf3.y(j5)) {
                                                        j10 = j26;
                                                        if (Build.VERSION.SDK_INT > 27) {
                                                            str22 = k96.L0(i14);
                                                        }
                                                    } else if (z12) {
                                                        j10 = j26;
                                                        if (Build.VERSION.SDK_INT > 27) {
                                                            str22 = k96.L0(i13);
                                                        }
                                                    } else {
                                                        j10 = j26;
                                                        str22 = k96.L0(2131747827);
                                                    }
                                                    str22 = "";
                                                } else {
                                                    j10 = j26;
                                                }
                                                if (l38Var6 == null || !TextUtils.equals(l38Var6.a, str22)) {
                                                    if (!zArr[0] || cf3.B(j5) || (i19 = Build.VERSION.SDK_INT) < 28) {
                                                        j11 = j5;
                                                    } else {
                                                        if (cf3.D(j5) || z12) {
                                                            i20 = i42;
                                                            i21 = i19;
                                                            j11 = j5;
                                                            file2 = file;
                                                        } else {
                                                            long R1 = k27Var9.R1();
                                                            i20 = i42;
                                                            i21 = i19;
                                                            TLRPC.User V14 = im7Var.getMessagesController().V1(Long.valueOf(R1));
                                                            if (V14 == null && (V14 = im7Var.getMessagesStorage().h0(R1)) != null) {
                                                                im7Var.getMessagesController().Z3(V14, true, false);
                                                            }
                                                            if (V14 == null || (userProfilePhoto2 = V14.photo) == null || (fileLocation11 = userProfilePhoto2.photo_small) == null) {
                                                                j11 = j5;
                                                            } else {
                                                                j11 = j5;
                                                                if (fileLocation11.volume_id != 0 && fileLocation11.local_id != 0) {
                                                                    ba4 fileLoader2 = im7Var.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation16 = V14.photo.photo_small;
                                                                    fileLoader2.getClass();
                                                                    file2 = ba4.K(fileLocation16, true);
                                                                }
                                                            }
                                                            file2 = null;
                                                        }
                                                        if (file2 == null && i20 == 0 && k27Var9.W0() != null) {
                                                            if (j9 >= 0) {
                                                                TLRPC.User V15 = im7Var.getMessagesController().V1(Long.valueOf(j9));
                                                                if (V15 != null && (userProfilePhoto = V15.photo) != null && (fileLocation10 = userProfilePhoto.photo_small) != null && fileLocation10.volume_id != 0 && fileLocation10.local_id != 0) {
                                                                    ba4 fileLoader3 = im7Var.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation17 = V15.photo.photo_small;
                                                                    fileLoader3.getClass();
                                                                    file2 = ba4.K(fileLocation17, true);
                                                                }
                                                            } else {
                                                                TLRPC.Chat K02 = im7Var.getMessagesController().K0(Long.valueOf(-j9));
                                                                if (K02 != null && (chatPhoto = K02.photo) != null && (fileLocation9 = chatPhoto.photo_small) != null && fileLocation9.volume_id != 0 && fileLocation9.local_id != 0) {
                                                                    ba4 fileLoader4 = im7Var.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation18 = K02.photo.photo_small;
                                                                    fileLoader4.getClass();
                                                                    file2 = ba4.K(fileLocation18, true);
                                                                }
                                                            }
                                                        }
                                                        if (i18 == 0) {
                                                            iconCompat = IconCompat.d(a.b, R.drawable.ic_launcher_dr);
                                                        } else if (file2 != null && i21 >= 28) {
                                                            try {
                                                                iconCompat = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file2), new am7()));
                                                            } catch (Throwable unused4) {
                                                            }
                                                        }
                                                        l38Var6 = new l38();
                                                        l38Var6.a = str22;
                                                        l38Var6.b = iconCompat;
                                                        l38Var6.c = null;
                                                        l38Var6.d = null;
                                                        c = 0;
                                                        l38Var6.e = false;
                                                        l38Var6.f = false;
                                                        vf6Var2.k(l38Var6, j9);
                                                    }
                                                    iconCompat = null;
                                                    l38Var6 = new l38();
                                                    l38Var6.a = str22;
                                                    l38Var6.b = iconCompat;
                                                    l38Var6.c = null;
                                                    l38Var6.d = null;
                                                    c = 0;
                                                    l38Var6.e = false;
                                                    l38Var6.f = false;
                                                    vf6Var2.k(l38Var6, j9);
                                                } else {
                                                    j11 = j5;
                                                    c = 0;
                                                }
                                                if (cf3.B(j11)) {
                                                    gm7Var3 = gm7Var5;
                                                    vf6Var8 = vf6Var2;
                                                    k27Var3 = k27Var9;
                                                    el7 el7Var2 = new el7(str21, k27Var3.k.date * 1000, l38Var6);
                                                    ArrayList arrayList25 = fl7Var.e;
                                                    arrayList25.add(el7Var2);
                                                    if (arrayList25.size() > 25) {
                                                        arrayList25.remove(0);
                                                    }
                                                } else {
                                                    if (!zArr[c] || Build.VERSION.SDK_INT < 28 || ((ActivityManager) a.b.getSystemService("activity")).isLowRamDevice() || z8 || k27Var9.k4() || !(k27Var9.D == 1 || k27Var9.s4())) {
                                                        gm7Var3 = gm7Var5;
                                                        vf6Var8 = vf6Var2;
                                                        k27Var3 = k27Var9;
                                                    } else {
                                                        ba4 fileLoader5 = im7Var.getFileLoader();
                                                        TLRPC.Message message2 = k27Var9.k;
                                                        fileLoader5.getClass();
                                                        File L2 = ba4.L(message2);
                                                        if (L2.exists() && k27Var9.t2()) {
                                                            file4 = new File(L2.getParentFile(), L2.getName() + ".blur.jpg");
                                                            if (file4.exists()) {
                                                                vf6Var8 = vf6Var2;
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
                                                                    vf6Var8 = vf6Var2;
                                                                    try {
                                                                        im7Var.g0.h(bm2.o(-1, 82));
                                                                        file5 = L2;
                                                                    } catch (Exception e2) {
                                                                        e = e2;
                                                                        file5 = L2;
                                                                        fa4.f(e);
                                                                        file3 = file5;
                                                                        gm7Var3 = gm7Var5;
                                                                        k27Var3 = k27Var9;
                                                                        el7 el7Var3 = new el7(str21, k27Var9.k.date * 1000, l38Var6);
                                                                        String str23 = k27Var3.s4() ? "image/webp" : "image/jpeg";
                                                                        if (file3.exists()) {
                                                                        }
                                                                        if (c3 != null) {
                                                                        }
                                                                        el7 el7Var4 = new el7(str21, k27Var3.k.date * 1000, l38Var6);
                                                                        arrayList6 = fl7Var.e;
                                                                        arrayList6.add(el7Var4);
                                                                        if (arrayList6.size() > 25) {
                                                                        }
                                                                        c2 = 0;
                                                                        if (zArr[c2]) {
                                                                        }
                                                                        if (j11 == 777000) {
                                                                        }
                                                                        arrayList22 = arrayList23;
                                                                        size6 = i40 - 1;
                                                                        gm7Var5 = gm7Var3;
                                                                        str17 = str14;
                                                                        vf6Var2 = vf6Var8;
                                                                        arrayList3 = arrayList24;
                                                                        k27Var = k27Var10;
                                                                        str19 = str13;
                                                                        strArr22 = strArr;
                                                                        zArr22 = zArr;
                                                                        sb42 = sb2;
                                                                        j7 = j10;
                                                                        j5 = j11;
                                                                    }
                                                                    try {
                                                                        im7Var.g0.setBounds(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                                                                        im7Var.g0.draw(canvas);
                                                                        FileOutputStream fileOutputStream = new FileOutputStream(file4);
                                                                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                                                        fileOutputStream.close();
                                                                        createScaledBitmap.recycle();
                                                                        file3 = file4;
                                                                    } catch (Exception e3) {
                                                                        e = e3;
                                                                        fa4.f(e);
                                                                        file3 = file5;
                                                                        gm7Var3 = gm7Var5;
                                                                        k27Var3 = k27Var9;
                                                                        el7 el7Var32 = new el7(str21, k27Var9.k.date * 1000, l38Var6);
                                                                        String str232 = k27Var3.s4() ? "image/webp" : "image/jpeg";
                                                                        if (file3.exists()) {
                                                                        }
                                                                        if (c3 != null) {
                                                                        }
                                                                        el7 el7Var42 = new el7(str21, k27Var3.k.date * 1000, l38Var6);
                                                                        arrayList6 = fl7Var.e;
                                                                        arrayList6.add(el7Var42);
                                                                        if (arrayList6.size() > 25) {
                                                                        }
                                                                        c2 = 0;
                                                                        if (zArr[c2]) {
                                                                        }
                                                                        if (j11 == 777000) {
                                                                        }
                                                                        arrayList22 = arrayList23;
                                                                        size6 = i40 - 1;
                                                                        gm7Var5 = gm7Var3;
                                                                        str17 = str14;
                                                                        vf6Var2 = vf6Var8;
                                                                        arrayList3 = arrayList24;
                                                                        k27Var = k27Var10;
                                                                        str19 = str13;
                                                                        strArr22 = strArr;
                                                                        zArr22 = zArr;
                                                                        sb42 = sb2;
                                                                        j7 = j10;
                                                                        j5 = j11;
                                                                    }
                                                                } catch (Exception e4) {
                                                                    e = e4;
                                                                    vf6Var8 = vf6Var2;
                                                                }
                                                            }
                                                            file3 = file5;
                                                        } else {
                                                            vf6Var8 = vf6Var2;
                                                            file3 = L2;
                                                            file4 = null;
                                                        }
                                                        gm7Var3 = gm7Var5;
                                                        k27Var3 = k27Var9;
                                                        el7 el7Var322 = new el7(str21, k27Var9.k.date * 1000, l38Var6);
                                                        String str2322 = k27Var3.s4() ? "image/webp" : "image/jpeg";
                                                        if (file3.exists()) {
                                                            try {
                                                                Context context = a.b;
                                                                StringBuilder sb5 = new StringBuilder();
                                                                a.d();
                                                                sb5.append("org.telegram.messenger.beta");
                                                                sb5.append(".provider");
                                                                c3 = FileProvider.c(context, sb5.toString(), file3);
                                                            } catch (Exception e5) {
                                                                fa4.f(e5);
                                                            }
                                                        } else {
                                                            if (im7Var.getFileLoader().S(file3.getName())) {
                                                                Uri.Builder scheme = new Uri.Builder().scheme("content");
                                                                String str24 = NotificationImageProvider.d;
                                                                if (str24 == null) {
                                                                    a.d();
                                                                    str24 = "org.telegram.messenger.beta.notification_image_provider";
                                                                    NotificationImageProvider.d = "org.telegram.messenger.beta.notification_image_provider";
                                                                }
                                                                c3 = scheme.authority(str24).appendPath("msg_media_raw").appendPath(im7Var.currentAccount + "").appendPath(file3.getName()).appendQueryParameter("final_path", file3.getAbsolutePath()).build();
                                                            }
                                                            c3 = null;
                                                        }
                                                        if (c3 != null) {
                                                            el7Var322.e = str2322;
                                                            el7Var322.f = c3;
                                                            ArrayList arrayList26 = fl7Var.e;
                                                            arrayList26.add(el7Var322);
                                                            if (arrayList26.size() > 25) {
                                                                arrayList26.remove(0);
                                                            }
                                                            a.b.grantUriPermission("com.android.systemui", c3, 1);
                                                            gl.e3(new bj7(c3, file4, (byte) 7), 20000L);
                                                            if (!TextUtils.isEmpty(k27Var3.z)) {
                                                                el7 el7Var5 = new el7(k27Var3.z, k27Var3.k.date * 1000, l38Var6);
                                                                ArrayList arrayList27 = fl7Var.e;
                                                                arrayList27.add(el7Var5);
                                                                if (arrayList27.size() > 25) {
                                                                    arrayList27.remove(0);
                                                                }
                                                            }
                                                            c2 = 0;
                                                            if (zArr[c2] && !z8 && k27Var3.O4()) {
                                                                arrayList7 = fl7Var.e;
                                                                if (!arrayList7.isEmpty()) {
                                                                    ba4 fileLoader6 = im7Var.getFileLoader();
                                                                    TLRPC.Message message3 = k27Var3.k;
                                                                    fileLoader6.getClass();
                                                                    File L3 = ba4.L(message3);
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
                                                                            el7 el7Var6 = (el7) b00.f(1, arrayList7);
                                                                            el7Var6.e = "audio/ogg";
                                                                            el7Var6.f = uri2;
                                                                        }
                                                                    } else if (k27Var3.F0() != null) {
                                                                        String s2 = ba4.s(k27Var3.F0());
                                                                        if (!im7Var.s.contains(s2)) {
                                                                            im7Var.s.add(s2);
                                                                            im7Var.getFileLoader().X(k27Var3.F0(), k27Var3, 3, 0);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    el7 el7Var422 = new el7(str21, k27Var3.k.date * 1000, l38Var6);
                                                    arrayList6 = fl7Var.e;
                                                    arrayList6.add(el7Var422);
                                                    if (arrayList6.size() > 25) {
                                                        c2 = 0;
                                                        arrayList6.remove(0);
                                                        if (zArr[c2]) {
                                                            arrayList7 = fl7Var.e;
                                                            if (!arrayList7.isEmpty()) {
                                                            }
                                                        }
                                                    }
                                                    c2 = 0;
                                                    if (zArr[c2]) {
                                                    }
                                                }
                                                if (j11 == 777000) {
                                                    TLRPC.ReplyMarkup replyMarkup2 = k27Var3.k.reply_markup;
                                                    if (replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) {
                                                        arrayList22 = ((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows;
                                                        i39 = k27Var3.e1();
                                                        size6 = i40 - 1;
                                                        gm7Var5 = gm7Var3;
                                                        str17 = str14;
                                                        vf6Var2 = vf6Var8;
                                                        arrayList3 = arrayList24;
                                                        k27Var = k27Var10;
                                                        str19 = str13;
                                                        strArr22 = strArr;
                                                        zArr22 = zArr;
                                                        sb42 = sb2;
                                                        j7 = j10;
                                                        j5 = j11;
                                                    }
                                                }
                                            }
                                        }
                                        arrayList22 = arrayList23;
                                        size6 = i40 - 1;
                                        gm7Var5 = gm7Var3;
                                        str17 = str14;
                                        vf6Var2 = vf6Var8;
                                        arrayList3 = arrayList24;
                                        k27Var = k27Var10;
                                        str19 = str13;
                                        strArr22 = strArr;
                                        zArr22 = zArr;
                                        sb42 = sb2;
                                        j7 = j10;
                                        j5 = j11;
                                    }
                                    k27Var2 = k27Var;
                                    sb = sb42;
                                    gm7Var2 = gm7Var5;
                                    j8 = j7;
                                    str11 = str17;
                                    i17 = i39;
                                    bitmap3 = bitmap2;
                                    str12 = str8;
                                    arrayList5 = arrayList22;
                                }
                                ArrayList arrayList172 = arrayList3;
                                long j222 = j5;
                                vf6 vf6Var112 = vf6Var2;
                                Intent intent22 = new Intent(a.b, (Class<?>) LaunchActivity.class);
                                intent22.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent22.setFlags(67108864);
                                intent22.addCategory("android.intent.category.LAUNCHER");
                                k27 k27Var82 = k27Var2;
                                if (k27Var2 != null) {
                                    if (k27Var82.O) {
                                        intent22.putExtra("oauth_url", k27Var82.b);
                                    } else if (k27Var82.J) {
                                        intent22.putExtra("storyId", Math.abs(k27Var82.e1()));
                                    } else if (k27Var82.N) {
                                        gm7 gm7Var6 = gm7Var2;
                                        j12 = j222;
                                        if (j222 < 0) {
                                            intent22.putExtra("chatId", -j12);
                                        } else if (j222 > 0) {
                                            intent22.putExtra("userId", j12);
                                        }
                                        intent22.putExtra("storyId", Math.abs(k27Var82.e1()));
                                        gm7Var2 = gm7Var6;
                                        j13 = j8;
                                        ug8.q(j13, ug8.o(j12, "show extra notifications chatId ", " topicId "));
                                        if (j13 != 0) {
                                            intent22.putExtra("topicId", j13);
                                        }
                                        String str182 = str11;
                                        intent22.putExtra(str182, im7Var.currentAccount);
                                        PendingIntent activity2 = PendingIntent.getActivity(a.b, 0, intent22, 1140850688);
                                        c5a c5aVar2 = new c5a((byte) 10);
                                        mk7 mk7Var32 = mk7Var;
                                        if (mk7Var != null) {
                                            c5aVar2.a(mk7Var32);
                                        }
                                        int i362 = i17;
                                        Intent intent32 = new Intent(a.b, (Class<?>) AutoMessageHeardReceiver.class);
                                        intent32.addFlags(i7);
                                        intent32.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                        intent32.putExtra("dialog_id", j12);
                                        int i372 = i15;
                                        intent32.putExtra(str10, i372);
                                        intent32.putExtra(str182, im7Var.currentAccount);
                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList182 = arrayList5;
                                        bitmap4 = bitmap3;
                                        lk7 lk7Var22 = new lk7(R.drawable.msg_markread, PendingIntent.getBroadcast(a.b, num2.intValue(), intent32, 167772160), k96.L0(2131748489));
                                        lk7Var22.g = (byte) 2;
                                        lk7Var22.h = false;
                                        mk7 b32 = lk7Var22.b();
                                        if (cf3.B(j12)) {
                                            mk7Var2 = mk7Var32;
                                            str15 = j12 != o0 ? "tgenc" + cf3.h(j12) + "_" + i372 : null;
                                        } else if (cf3.D(j12)) {
                                            str15 = "tguser" + j12 + "_" + i372;
                                            mk7Var2 = mk7Var32;
                                        } else {
                                            StringBuilder sb7 = new StringBuilder("tgchat");
                                            mk7Var2 = mk7Var32;
                                            sb7.append(-j12);
                                            sb7.append("_");
                                            sb7.append(i372);
                                            str15 = sb7.toString();
                                        }
                                        if (str15 != null) {
                                            c5aVar2.b = str15;
                                            c5a c5aVar3 = new c5a((byte) 10);
                                            c5aVar3.b = "summary_".concat(str15);
                                            c5aVar3.m(xk7Var);
                                        }
                                        long j232 = j6;
                                        c5aVar2.e = ls6.n(j232, "tgaccount");
                                        if (gm7Var2.c) {
                                            j6 = j232;
                                            j14 = Long.MAX_VALUE;
                                            int i43 = 0;
                                            while (i43 < im7Var.E.size()) {
                                                j14 = Math.min(((hm7) im7Var.E.get(i43)).e, j14);
                                                i43++;
                                                k27Var82 = k27Var82;
                                            }
                                            k27Var4 = k27Var82;
                                        } else {
                                            k27Var4 = k27Var82;
                                            j6 = j232;
                                            j14 = ((k27) arrayList172.get(0)).k.date * 1000;
                                        }
                                        xk7 xk7Var22 = new xk7(a.b);
                                        xk7Var22.e(str12);
                                        xk7Var22.F.icon = R.drawable.notification;
                                        xk7Var22.d(sb.toString());
                                        xk7Var22.f(16, true);
                                        xk7Var22.i = gm7Var2.c ? im7Var.E.size() : arrayList172.size();
                                        xk7Var22.w = -15618822;
                                        xk7Var22.r = false;
                                        xk7Var22.F.when = j14;
                                        xk7Var22.k = true;
                                        xk7Var22.i(fl7Var);
                                        xk7Var22.g = activity2;
                                        c5aVar2.m(xk7Var22);
                                        xk7Var22.s = String.valueOf(Long.MAX_VALUE - j14);
                                        xk7Var22.f(8, (z3 && j12 == j && j13 == j2) ? false : true);
                                        xk7Var22.u = "msg";
                                        Intent intent42 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                        intent42.putExtra("messageDate", i9);
                                        intent42.putExtra("dialogId", j12);
                                        intent42.putExtra(str182, im7Var.currentAccount);
                                        if (gm7Var2.c) {
                                            intent42.putExtra("story", true);
                                        }
                                        if (k27Var4 != null) {
                                            k27Var5 = k27Var4;
                                            try {
                                                if (k27Var5.J) {
                                                    intent42.putExtra("storyReaction", true);
                                                }
                                            } catch (Exception e6) {
                                                e = e6;
                                                fa4.f(e);
                                                if (z9) {
                                                }
                                                if (k27Var5 != null) {
                                                }
                                                keyboardInlineButton = null;
                                                tL_inlineButtonTypeCopy = null;
                                                if (keyboardInlineButton != null) {
                                                }
                                                j15 = gm7Var2.a;
                                                if (j15 != 489000) {
                                                }
                                                if (arrayList13.size() == 1) {
                                                }
                                                if (cf3.B(j12)) {
                                                }
                                                if (bitmap4 != null) {
                                                }
                                                if (!gl.n2(false)) {
                                                }
                                                if (chat2 == null) {
                                                }
                                                user7 = user6;
                                                boolean z182 = z9;
                                                Notification notification42 = notification2;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                fa4.b("showExtraNotifications: holders.add " + j12);
                                                notification3 = notification42;
                                                z9 = z182;
                                                vf6Var7 = vf6Var112;
                                                long j242 = j12;
                                                fm7 fm7Var2 = new fm7(im7Var, num2.intValue(), j242, gm7Var2.c, str12, user7, chat2, xk7Var22, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                                                arrayList4 = arrayList;
                                                arrayList4.add(fm7Var2);
                                                im7Var.h.k(num2, j242);
                                                i24 = i8 + 1;
                                                arrayList = arrayList4;
                                                arrayList10 = arrayList13;
                                                z5 = z9;
                                                z6 = z8;
                                                size = i6;
                                                vf6Var9 = vf6Var5;
                                                vf6Var10 = vf6Var6;
                                                d = sharedPreferences;
                                                e = j6;
                                                b2 = notification3;
                                                vf6Var2 = vf6Var7;
                                            }
                                        } else {
                                            k27Var5 = k27Var4;
                                        }
                                        xk7Var22.F.deleteIntent = PendingIntent.getBroadcast(a.b, num2.intValue(), intent42, 167772160);
                                        if (z9) {
                                            xk7Var22.q = im7Var.f0;
                                            xk7Var22.C = true;
                                        }
                                        if (k27Var5 != null && (message = k27Var5.k) != null) {
                                            replyMarkup = message.reply_markup;
                                            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                                                tL_inlineButtonTypeCopy = null;
                                                TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = null;
                                                for (int i44 = 0; i44 < tL_replyInlineMarkup.rows.size(); i44++) {
                                                    int i45 = 0;
                                                    while (true) {
                                                        if (i45 >= tL_replyInlineMarkup.rows.get(i44).buttons.size()) {
                                                            break;
                                                        }
                                                        TL_keyboard.KeyboardInlineButton keyboardInlineButton3 = tL_replyInlineMarkup.rows.get(i44).buttons.get(i45);
                                                        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy2 = (TL_keyboard.TL_inlineButtonTypeCopy) jdb.a(keyboardInlineButton3, TL_keyboard.TL_inlineButtonTypeCopy.class);
                                                        if (tL_inlineButtonTypeCopy2 != null) {
                                                            keyboardInlineButton2 = keyboardInlineButton3;
                                                            tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                                                            break;
                                                        } else {
                                                            i45++;
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
                                                    lk7 lk7Var3 = new lk7(R.drawable.msg_copy, PendingIntent.getBroadcast(a.b, num2.intValue(), intent5, 167772160), keyboardInlineButton.text);
                                                    lk7Var3.h = false;
                                                    xk7Var22.b.add(lk7Var3.b());
                                                }
                                                j15 = gm7Var2.a;
                                                if (j15 != 489000 && j15 != 489001) {
                                                    if (mk7Var2 != null) {
                                                        xk7Var22.b.add(mk7Var2);
                                                    }
                                                    if (!z8 && !gm7Var2.c && (k27Var5 == null || !k27Var5.J)) {
                                                        xk7Var22.b.add(b32);
                                                    }
                                                }
                                                if (arrayList13.size() == 1 && !TextUtils.isEmpty(str) && !gm7Var2.c) {
                                                    xk7Var22.j(str);
                                                }
                                                if (cf3.B(j12)) {
                                                    xk7Var22.t = true;
                                                }
                                                if (bitmap4 != null) {
                                                    xk7Var22.g(bitmap4);
                                                }
                                                if (!gl.n2(false) && !gba.B && arrayList182 != null) {
                                                    size3 = arrayList182.size();
                                                    for (i22 = 0; i22 < size3; i22++) {
                                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList28 = arrayList182;
                                                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList28.get(i22);
                                                        int size7 = keyboardInlineButtonRow.buttons.size();
                                                        int i46 = 0;
                                                        while (i46 < size7) {
                                                            TL_keyboard.KeyboardInlineButton keyboardInlineButton4 = keyboardInlineButtonRow.buttons.get(i46);
                                                            int i47 = size3;
                                                            TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) jdb.a(keyboardInlineButton4, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                            int i48 = i46;
                                                            if (tL_inlineButtonTypeCallback != null) {
                                                                arrayList8 = arrayList28;
                                                                Intent intent6 = new Intent(a.b, (Class<?>) NotificationCallbackReceiver.class);
                                                                intent6.putExtra(str182, im7Var.currentAccount);
                                                                intent6.putExtra("did", j12);
                                                                byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                if (bArr != null) {
                                                                    intent6.putExtra("data", bArr);
                                                                }
                                                                intent6.putExtra("mid", i362);
                                                                String str25 = keyboardInlineButton4.text;
                                                                Context context3 = a.b;
                                                                int i49 = im7Var.I;
                                                                im7Var.I = i49 + 1;
                                                                xk7Var22.a(0, PendingIntent.getBroadcast(context3, i49, intent6, 167772160), str25);
                                                            } else {
                                                                arrayList8 = arrayList28;
                                                            }
                                                            i46 = i48 + 1;
                                                            size3 = i47;
                                                            arrayList28 = arrayList8;
                                                        }
                                                        arrayList182 = arrayList28;
                                                    }
                                                }
                                                if (chat2 == null || user6 == null) {
                                                    user7 = user6;
                                                } else {
                                                    user7 = user6;
                                                    String str26 = user7.phone;
                                                    if (str26 != null && str26.length() > 0) {
                                                        String str27 = "tel:+" + user7.phone;
                                                        if (!str27.isEmpty()) {
                                                            xk7Var22.G.add(str27);
                                                        }
                                                    }
                                                }
                                                boolean z1822 = z9;
                                                Notification notification422 = notification2;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                    W(notification422, xk7Var22, z1822);
                                                }
                                                fa4.b("showExtraNotifications: holders.add " + j12);
                                                notification3 = notification422;
                                                z9 = z1822;
                                                vf6Var7 = vf6Var112;
                                                long j2422 = j12;
                                                fm7 fm7Var22 = new fm7(im7Var, num2.intValue(), j2422, gm7Var2.c, str12, user7, chat2, xk7Var22, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                                                arrayList4 = arrayList;
                                                arrayList4.add(fm7Var22);
                                                im7Var.h.k(num2, j2422);
                                                i24 = i8 + 1;
                                                arrayList = arrayList4;
                                                arrayList10 = arrayList13;
                                                z5 = z9;
                                                z6 = z8;
                                                size = i6;
                                                vf6Var9 = vf6Var5;
                                                vf6Var10 = vf6Var6;
                                                d = sharedPreferences;
                                                e = j6;
                                                b2 = notification3;
                                                vf6Var2 = vf6Var7;
                                            }
                                        }
                                        keyboardInlineButton = null;
                                        tL_inlineButtonTypeCopy = null;
                                        if (keyboardInlineButton != null) {
                                        }
                                        j15 = gm7Var2.a;
                                        if (j15 != 489000) {
                                            if (mk7Var2 != null) {
                                            }
                                            if (!z8) {
                                                xk7Var22.b.add(b32);
                                            }
                                        }
                                        if (arrayList13.size() == 1) {
                                            xk7Var22.j(str);
                                        }
                                        if (cf3.B(j12)) {
                                        }
                                        if (bitmap4 != null) {
                                        }
                                        if (!gl.n2(false)) {
                                            size3 = arrayList182.size();
                                            while (i22 < size3) {
                                            }
                                        }
                                        if (chat2 == null) {
                                        }
                                        user7 = user6;
                                        boolean z18222 = z9;
                                        Notification notification4222 = notification2;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                        }
                                        fa4.b("showExtraNotifications: holders.add " + j12);
                                        notification3 = notification4222;
                                        z9 = z18222;
                                        vf6Var7 = vf6Var112;
                                        long j24222 = j12;
                                        fm7 fm7Var222 = new fm7(im7Var, num2.intValue(), j24222, gm7Var2.c, str12, user7, chat2, xk7Var22, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                                        arrayList4 = arrayList;
                                        arrayList4.add(fm7Var222);
                                        im7Var.h.k(num2, j24222);
                                        i24 = i8 + 1;
                                        arrayList = arrayList4;
                                        arrayList10 = arrayList13;
                                        z5 = z9;
                                        z6 = z8;
                                        size = i6;
                                        vf6Var9 = vf6Var5;
                                        vf6Var10 = vf6Var6;
                                        d = sharedPreferences;
                                        e = j6;
                                        b2 = notification3;
                                        vf6Var2 = vf6Var7;
                                    }
                                    j12 = j222;
                                    j13 = j8;
                                    ug8.q(j13, ug8.o(j12, "show extra notifications chatId ", " topicId "));
                                    if (j13 != 0) {
                                    }
                                    String str1822 = str11;
                                    intent22.putExtra(str1822, im7Var.currentAccount);
                                    PendingIntent activity22 = PendingIntent.getActivity(a.b, 0, intent22, 1140850688);
                                    c5a c5aVar22 = new c5a((byte) 10);
                                    mk7 mk7Var322 = mk7Var;
                                    if (mk7Var != null) {
                                    }
                                    int i3622 = i17;
                                    Intent intent322 = new Intent(a.b, (Class<?>) AutoMessageHeardReceiver.class);
                                    intent322.addFlags(i7);
                                    intent322.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                    intent322.putExtra("dialog_id", j12);
                                    int i3722 = i15;
                                    intent322.putExtra(str10, i3722);
                                    intent322.putExtra(str1822, im7Var.currentAccount);
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList1822 = arrayList5;
                                    bitmap4 = bitmap3;
                                    lk7 lk7Var222 = new lk7(R.drawable.msg_markread, PendingIntent.getBroadcast(a.b, num2.intValue(), intent322, 167772160), k96.L0(2131748489));
                                    lk7Var222.g = (byte) 2;
                                    lk7Var222.h = false;
                                    mk7 b322 = lk7Var222.b();
                                    if (cf3.B(j12)) {
                                    }
                                    if (str15 != null) {
                                    }
                                    long j2322 = j6;
                                    c5aVar22.e = ls6.n(j2322, "tgaccount");
                                    if (gm7Var2.c) {
                                    }
                                    xk7 xk7Var222 = new xk7(a.b);
                                    xk7Var222.e(str12);
                                    xk7Var222.F.icon = R.drawable.notification;
                                    xk7Var222.d(sb.toString());
                                    xk7Var222.f(16, true);
                                    xk7Var222.i = gm7Var2.c ? im7Var.E.size() : arrayList172.size();
                                    xk7Var222.w = -15618822;
                                    xk7Var222.r = false;
                                    xk7Var222.F.when = j14;
                                    xk7Var222.k = true;
                                    xk7Var222.i(fl7Var);
                                    xk7Var222.g = activity22;
                                    c5aVar22.m(xk7Var222);
                                    xk7Var222.s = String.valueOf(Long.MAX_VALUE - j14);
                                    xk7Var222.f(8, (z3 && j12 == j && j13 == j2) ? false : true);
                                    xk7Var222.u = "msg";
                                    Intent intent422 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                    intent422.putExtra("messageDate", i9);
                                    intent422.putExtra("dialogId", j12);
                                    intent422.putExtra(str1822, im7Var.currentAccount);
                                    if (gm7Var2.c) {
                                    }
                                    if (k27Var4 != null) {
                                    }
                                    xk7Var222.F.deleteIntent = PendingIntent.getBroadcast(a.b, num2.intValue(), intent422, 167772160);
                                    if (z9) {
                                    }
                                    if (k27Var5 != null) {
                                        replyMarkup = message.reply_markup;
                                        if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                        }
                                    }
                                    keyboardInlineButton = null;
                                    tL_inlineButtonTypeCopy = null;
                                    if (keyboardInlineButton != null) {
                                    }
                                    j15 = gm7Var2.a;
                                    if (j15 != 489000) {
                                    }
                                    if (arrayList13.size() == 1) {
                                    }
                                    if (cf3.B(j12)) {
                                    }
                                    if (bitmap4 != null) {
                                    }
                                    if (!gl.n2(false)) {
                                    }
                                    if (chat2 == null) {
                                    }
                                    user7 = user6;
                                    boolean z182222 = z9;
                                    Notification notification42222 = notification2;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                    }
                                    fa4.b("showExtraNotifications: holders.add " + j12);
                                    notification3 = notification42222;
                                    z9 = z182222;
                                    vf6Var7 = vf6Var112;
                                    long j242222 = j12;
                                    fm7 fm7Var2222 = new fm7(im7Var, num2.intValue(), j242222, gm7Var2.c, str12, user7, chat2, xk7Var222, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                                    arrayList4 = arrayList;
                                    arrayList4.add(fm7Var2222);
                                    im7Var.h.k(num2, j242222);
                                    i24 = i8 + 1;
                                    arrayList = arrayList4;
                                    arrayList10 = arrayList13;
                                    z5 = z9;
                                    z6 = z8;
                                    size = i6;
                                    vf6Var9 = vf6Var5;
                                    vf6Var10 = vf6Var6;
                                    d = sharedPreferences;
                                    e = j6;
                                    b2 = notification3;
                                    vf6Var2 = vf6Var7;
                                }
                                j12 = j222;
                                if (gm7Var2.c) {
                                    long[] jArr2 = new long[im7Var.E.size()];
                                    for (int i50 = 0; i50 < im7Var.E.size(); i50++) {
                                        jArr2[i50] = ((hm7) im7Var.E.get(i50)).a;
                                    }
                                    intent22.putExtra("storyDialogIds", jArr2);
                                } else if (cf3.B(j12)) {
                                    intent22.putExtra("encId", cf3.h(j12));
                                } else if (cf3.D(j12)) {
                                    intent22.putExtra("userId", j12);
                                } else {
                                    intent22.putExtra("chatId", -j12);
                                }
                                j13 = j8;
                                ug8.q(j13, ug8.o(j12, "show extra notifications chatId ", " topicId "));
                                if (j13 != 0) {
                                }
                                String str18222 = str11;
                                intent22.putExtra(str18222, im7Var.currentAccount);
                                PendingIntent activity222 = PendingIntent.getActivity(a.b, 0, intent22, 1140850688);
                                c5a c5aVar222 = new c5a((byte) 10);
                                mk7 mk7Var3222 = mk7Var;
                                if (mk7Var != null) {
                                }
                                int i36222 = i17;
                                Intent intent3222 = new Intent(a.b, (Class<?>) AutoMessageHeardReceiver.class);
                                intent3222.addFlags(i7);
                                intent3222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                intent3222.putExtra("dialog_id", j12);
                                int i37222 = i15;
                                intent3222.putExtra(str10, i37222);
                                intent3222.putExtra(str18222, im7Var.currentAccount);
                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList18222 = arrayList5;
                                bitmap4 = bitmap3;
                                lk7 lk7Var2222 = new lk7(R.drawable.msg_markread, PendingIntent.getBroadcast(a.b, num2.intValue(), intent3222, 167772160), k96.L0(2131748489));
                                lk7Var2222.g = (byte) 2;
                                lk7Var2222.h = false;
                                mk7 b3222 = lk7Var2222.b();
                                if (cf3.B(j12)) {
                                }
                                if (str15 != null) {
                                }
                                long j23222 = j6;
                                c5aVar222.e = ls6.n(j23222, "tgaccount");
                                if (gm7Var2.c) {
                                }
                                xk7 xk7Var2222 = new xk7(a.b);
                                xk7Var2222.e(str12);
                                xk7Var2222.F.icon = R.drawable.notification;
                                xk7Var2222.d(sb.toString());
                                xk7Var2222.f(16, true);
                                xk7Var2222.i = gm7Var2.c ? im7Var.E.size() : arrayList172.size();
                                xk7Var2222.w = -15618822;
                                xk7Var2222.r = false;
                                xk7Var2222.F.when = j14;
                                xk7Var2222.k = true;
                                xk7Var2222.i(fl7Var);
                                xk7Var2222.g = activity222;
                                c5aVar222.m(xk7Var2222);
                                xk7Var2222.s = String.valueOf(Long.MAX_VALUE - j14);
                                xk7Var2222.f(8, (z3 && j12 == j && j13 == j2) ? false : true);
                                xk7Var2222.u = "msg";
                                Intent intent4222 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                intent4222.putExtra("messageDate", i9);
                                intent4222.putExtra("dialogId", j12);
                                intent4222.putExtra(str18222, im7Var.currentAccount);
                                if (gm7Var2.c) {
                                }
                                if (k27Var4 != null) {
                                }
                                xk7Var2222.F.deleteIntent = PendingIntent.getBroadcast(a.b, num2.intValue(), intent4222, 167772160);
                                if (z9) {
                                }
                                if (k27Var5 != null) {
                                }
                                keyboardInlineButton = null;
                                tL_inlineButtonTypeCopy = null;
                                if (keyboardInlineButton != null) {
                                }
                                j15 = gm7Var2.a;
                                if (j15 != 489000) {
                                }
                                if (arrayList13.size() == 1) {
                                }
                                if (cf3.B(j12)) {
                                }
                                if (bitmap4 != null) {
                                }
                                if (!gl.n2(false)) {
                                }
                                if (chat2 == null) {
                                }
                                user7 = user6;
                                boolean z1822222 = z9;
                                Notification notification422222 = notification2;
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                fa4.b("showExtraNotifications: holders.add " + j12);
                                notification3 = notification422222;
                                z9 = z1822222;
                                vf6Var7 = vf6Var112;
                                long j2422222 = j12;
                                fm7 fm7Var22222 = new fm7(im7Var, num2.intValue(), j2422222, gm7Var2.c, str12, user7, chat2, xk7Var2222, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                                arrayList4 = arrayList;
                                arrayList4.add(fm7Var22222);
                                im7Var.h.k(num2, j2422222);
                                i24 = i8 + 1;
                                arrayList = arrayList4;
                                arrayList10 = arrayList13;
                                z5 = z9;
                                z6 = z8;
                                size = i6;
                                vf6Var9 = vf6Var5;
                                vf6Var10 = vf6Var6;
                                d = sharedPreferences;
                                e = j6;
                                b2 = notification3;
                                vf6Var2 = vf6Var7;
                            }
                        }
                    }
                    j7 = j4;
                    l38 l38Var422 = l38Var2;
                    if (l38Var422 == null) {
                    }
                    i16 = Build.VERSION.SDK_INT;
                    if (i16 >= 28) {
                    }
                    fl7Var.h = format;
                    fl7Var.i = Boolean.valueOf(i16 >= 28 || (!z12 && cf3.y(j5)) || l7c.z(j5));
                    StringBuilder sb422 = new StringBuilder();
                    String[] strArr222 = new String[1];
                    boolean[] zArr222 = new boolean[1];
                    if (gm7Var5.c) {
                    }
                    ArrayList arrayList1722 = arrayList3;
                    long j2222 = j5;
                    vf6 vf6Var1122 = vf6Var2;
                    Intent intent222 = new Intent(a.b, (Class<?>) LaunchActivity.class);
                    intent222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    intent222.setFlags(67108864);
                    intent222.addCategory("android.intent.category.LAUNCHER");
                    k27 k27Var822 = k27Var2;
                    if (k27Var2 != null) {
                    }
                    j12 = j2222;
                    if (gm7Var2.c) {
                    }
                    j13 = j8;
                    ug8.q(j13, ug8.o(j12, "show extra notifications chatId ", " topicId "));
                    if (j13 != 0) {
                    }
                    String str182222 = str11;
                    intent222.putExtra(str182222, im7Var.currentAccount);
                    PendingIntent activity2222 = PendingIntent.getActivity(a.b, 0, intent222, 1140850688);
                    c5a c5aVar2222 = new c5a((byte) 10);
                    mk7 mk7Var32222 = mk7Var;
                    if (mk7Var != null) {
                    }
                    int i362222 = i17;
                    Intent intent32222 = new Intent(a.b, (Class<?>) AutoMessageHeardReceiver.class);
                    intent32222.addFlags(i7);
                    intent32222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                    intent32222.putExtra("dialog_id", j12);
                    int i372222 = i15;
                    intent32222.putExtra(str10, i372222);
                    intent32222.putExtra(str182222, im7Var.currentAccount);
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList182222 = arrayList5;
                    bitmap4 = bitmap3;
                    lk7 lk7Var22222 = new lk7(R.drawable.msg_markread, PendingIntent.getBroadcast(a.b, num2.intValue(), intent32222, 167772160), k96.L0(2131748489));
                    lk7Var22222.g = (byte) 2;
                    lk7Var22222.h = false;
                    mk7 b32222 = lk7Var22222.b();
                    if (cf3.B(j12)) {
                    }
                    if (str15 != null) {
                    }
                    long j232222 = j6;
                    c5aVar2222.e = ls6.n(j232222, "tgaccount");
                    if (gm7Var2.c) {
                    }
                    xk7 xk7Var22222 = new xk7(a.b);
                    xk7Var22222.e(str12);
                    xk7Var22222.F.icon = R.drawable.notification;
                    xk7Var22222.d(sb.toString());
                    xk7Var22222.f(16, true);
                    xk7Var22222.i = gm7Var2.c ? im7Var.E.size() : arrayList1722.size();
                    xk7Var22222.w = -15618822;
                    xk7Var22222.r = false;
                    xk7Var22222.F.when = j14;
                    xk7Var22222.k = true;
                    xk7Var22222.i(fl7Var);
                    xk7Var22222.g = activity2222;
                    c5aVar2222.m(xk7Var22222);
                    xk7Var22222.s = String.valueOf(Long.MAX_VALUE - j14);
                    xk7Var22222.f(8, (z3 && j12 == j && j13 == j2) ? false : true);
                    xk7Var22222.u = "msg";
                    Intent intent42222 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                    intent42222.putExtra("messageDate", i9);
                    intent42222.putExtra("dialogId", j12);
                    intent42222.putExtra(str182222, im7Var.currentAccount);
                    if (gm7Var2.c) {
                    }
                    if (k27Var4 != null) {
                    }
                    xk7Var22222.F.deleteIntent = PendingIntent.getBroadcast(a.b, num2.intValue(), intent42222, 167772160);
                    if (z9) {
                    }
                    if (k27Var5 != null) {
                    }
                    keyboardInlineButton = null;
                    tL_inlineButtonTypeCopy = null;
                    if (keyboardInlineButton != null) {
                    }
                    j15 = gm7Var2.a;
                    if (j15 != 489000) {
                    }
                    if (arrayList13.size() == 1) {
                    }
                    if (cf3.B(j12)) {
                    }
                    if (bitmap4 != null) {
                    }
                    if (!gl.n2(false)) {
                    }
                    if (chat2 == null) {
                    }
                    user7 = user6;
                    boolean z18222222 = z9;
                    Notification notification4222222 = notification2;
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    fa4.b("showExtraNotifications: holders.add " + j12);
                    notification3 = notification4222222;
                    z9 = z18222222;
                    vf6Var7 = vf6Var1122;
                    long j24222222 = j12;
                    fm7 fm7Var222222 = new fm7(im7Var, num2.intValue(), j24222222, gm7Var2.c, str12, user7, chat2, xk7Var22222, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                    arrayList4 = arrayList;
                    arrayList4.add(fm7Var222222);
                    im7Var.h.k(num2, j24222222);
                    i24 = i8 + 1;
                    arrayList = arrayList4;
                    arrayList10 = arrayList13;
                    z5 = z9;
                    z6 = z8;
                    size = i6;
                    vf6Var9 = vf6Var5;
                    vf6Var10 = vf6Var6;
                    d = sharedPreferences;
                    e = j6;
                    b2 = notification3;
                    vf6Var2 = vf6Var7;
                }
                z7 = z5;
                Notification notification5 = b2;
                vf6Var3 = vf6Var10;
                vf6 vf6Var12 = vf6Var2;
                ArrayList arrayList29 = arrayList;
                if (z7) {
                    arrayList2 = arrayList29;
                    if (im7Var.y.isEmpty()) {
                        if (w01.a) {
                            b00.p(im7Var.e0, new StringBuilder("cancel summary with id "));
                        }
                        str3 = null;
                        m0.b(im7Var.e0, null);
                        i4 = 0;
                        while (i4 < vf6Var3.m()) {
                            vf6 vf6Var13 = vf6Var3;
                            if (!im7Var.y.contains(Long.valueOf(vf6Var13.j(i4)))) {
                                Integer num5 = (Integer) vf6Var13.n(i4);
                                if (w01.a) {
                                    fa4.b("cancel notification id " + num5);
                                }
                                m0.b(num5.intValue(), str3);
                            }
                            i4++;
                            vf6Var3 = vf6Var13;
                        }
                        ArrayList arrayList30 = new ArrayList(arrayList2.size());
                        fa4.b("showExtraNotifications: holders.size()=" + arrayList2.size());
                        size2 = arrayList2.size();
                        i5 = 0;
                        while (i5 < size2) {
                            ArrayList arrayList31 = arrayList2;
                            fm7 fm7Var3 = (fm7) arrayList31.get(i5);
                            arrayList30.clear();
                            int i51 = Build.VERSION.SDK_INT;
                            if (i51 < 29 || cf3.B(fm7Var3.b)) {
                                vf6Var4 = vf6Var12;
                            } else {
                                xk7 xk7Var3 = fm7Var3.g;
                                long j27 = fm7Var3.b;
                                vf6Var4 = vf6Var12;
                                String d2 = im7Var.d(xk7Var3, j27, fm7Var3.d, fm7Var3.e, fm7Var3.f, (l38) vf6Var4.f(j27), !fm7Var3.c);
                                if (d2 != null) {
                                    arrayList30.add(d2);
                                }
                            }
                            fa4.b("showExtraNotifications: holders[" + i5 + "].call()");
                            fm7Var3.a();
                            if (i51 >= 29 && gba.n0 && !arrayList30.isEmpty()) {
                                tga.o(a.b, arrayList30);
                            }
                            i5++;
                            im7Var = this;
                            arrayList2 = arrayList31;
                            vf6Var12 = vf6Var4;
                        }
                    }
                } else {
                    if (w01.a) {
                        b00.p(im7Var.e0, new StringBuilder("show summary with id "));
                    }
                    try {
                        m0.d(im7Var.e0, notification5);
                        arrayList2 = arrayList29;
                    } catch (SecurityException e7) {
                        fa4.f(e7);
                        arrayList2 = arrayList29;
                        im7Var.P(xk7Var, j, j2, str2, jArr, i, uri, i2, z, z2, z3, i3);
                    }
                }
                str3 = null;
                i4 = 0;
                while (i4 < vf6Var3.m()) {
                }
                ArrayList arrayList302 = new ArrayList(arrayList2.size());
                fa4.b("showExtraNotifications: holders.size()=" + arrayList2.size());
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
        e = im7Var.getUserConfig().e();
        if (gl.m2()) {
        }
        if (gba.r.length() <= 0) {
        }
        fa4.b("showExtraNotifications: passcode=" + (gba.r.length() <= 0) + " waitingForPasscode=" + z6 + " selfUserId=" + e + " useSummaryNotification=" + z5);
        vf6Var2 = new vf6();
        size = arrayList10.size();
        arrayList = arrayList12;
        while (true) {
            if (i24 >= size) {
            }
            i24 = i8 + 1;
            arrayList = arrayList4;
            arrayList10 = arrayList13;
            z5 = z9;
            z6 = z8;
            size = i6;
            vf6Var9 = vf6Var5;
            vf6Var10 = vf6Var6;
            d = sharedPreferences;
            e = j6;
            b2 = notification3;
            vf6Var2 = vf6Var7;
        }
        z7 = z5;
        Notification notification52 = b2;
        vf6Var3 = vf6Var10;
        vf6 vf6Var122 = vf6Var2;
        ArrayList arrayList292 = arrayList;
        if (z7) {
        }
        str3 = null;
        i4 = 0;
        while (i4 < vf6Var3.m()) {
        }
        ArrayList arrayList3022 = new ArrayList(arrayList2.size());
        fa4.b("showExtraNotifications: holders.size()=" + arrayList2.size());
        size2 = arrayList2.size();
        i5 = 0;
        while (i5 < size2) {
        }
    }

    public final void Y() {
        l0.c(new wl7(this, (byte) 3));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(55:583|(4:120|(2:122|(1:124)(1:578))(1:579)|125|(1:127)(3:573|574|(1:576)(1:577)))(1:580)|128|129|(3:552|(1:572)(1:556)|(4:(1:(2:566|(1:568)(1:569))(1:561))(1:570)|562|(1:564)|565)(1:571))(4:132|(5:134|(2:136|(7:143|(3:145|(1:151)(1:149)|150)|152|(1:163)(1:(1:156)(2:159|(1:161)(1:162)))|157|158|142))(1:164)|140|141|142)|165|166)|(1:551)(1:173)|(1:550)(5:178|(1:180)(1:549)|(2:182|(1:184)(2:185|(2:187|188)(2:544|(1:546)(1:547))))|548|188)|(2:190|(42:192|193|(5:195|(1:197)(1:540)|198|(1:200)(1:539)|201)(1:541)|202|203|(5:530|(1:532)(1:538)|533|(1:535)(1:537)|536)(1:(2:(3:209|(1:211)(1:506)|212)(3:507|(1:509)(1:511)|510)|213)(2:512|(6:(1:515)(1:528)|516|(1:518)(2:(1:525)(1:527)|526)|519|(1:521)(1:523)|522)(33:529|(1:216)(1:505)|217|(1:504)(1:221)|222|(1:503)(1:225)|(1:229)|(1:502)(1:234)|(6:236|(1:238)|239|(1:241)(1:500)|242|(1:244)(1:499))(1:501)|(3:248|249|(1:253))|(1:258)|259|(1:261)|262|263|(1:265)(3:437|438|(2:(2:441|442)(2:444|(1:446))|443)(2:447|(4:449|(2:452|450)|453|454)(17:455|(5:457|(1:(1:460)(2:461|(1:463)))|464|(21:(3:473|(1:481)|482)(3:483|(2:485|(1:493))|482)|269|(2:276|(1:278))|279|280|281|(1:283)|284|(1:286)(1:434)|287|(1:289)(1:(2:418|(1:420)(3:421|422|(4:424|(1:426)(1:431)|427|(1:429)))))|290|(2:414|415)(1:(4:295|296|(1:298)|394)(5:395|(2:397|(1:399)(3:400|(2:402|(1:404))(2:405|(2:407|(2:409|410)))|394))|411|(1:413)|394))|299|(1:393)(6:(3:388|(1:390)(1:392)|391)|(3:309|310|(5:312|(1:373)(1:(1:317)(1:372))|(1:319)(1:371)|320|(1:322)(2:360|(1:362)(1:(1:370)(2:366|(1:368)(1:369)))))(2:374|(1:376)(2:(2:378|(2:382|383))|386)))|387|(0)(0)|320|(0)(0))|323|(2:329|(7:331|(4:333|(3:335|(4:337|(1:339)|340|341)(2:343|344)|342)|345|346)|347|348|(1:356)|357|358))|359|(4:350|352|354|356)|357|358)|267)(2:494|(1:498))|268|269|(4:272|274|276|(0))|279|280|281|(0)|284|(0)(0)|287|(0)(0)|290|(1:292)|414|415)))|266|267|268|269|(0)|279|280|281|(0)|284|(0)(0)|287|(0)(0)|290|(0)|414|415)))|214|(0)(0)|217|(1:219)|504|222|(0)|503|(2:227|229)|(1:231)|502|(0)(0)|(4:246|248|249|(2:251|253))|(0)|259|(0)|262|263|(0)(0)|266|267|268|269|(0)|279|280|281|(0)|284|(0)(0)|287|(0)(0)|290|(0)|414|415))(1:543)|542|193|(0)(0)|202|203|(1:205)|530|(0)(0)|533|(0)(0)|536|214|(0)(0)|217|(0)|504|222|(0)|503|(0)|(0)|502|(0)(0)|(0)|(0)|259|(0)|262|263|(0)(0)|266|267|268|269|(0)|279|280|281|(0)|284|(0)(0)|287|(0)(0)|290|(0)|414|415) */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0b9f, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0b05, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x0b06, code lost:
    
        fa4.f(r0);
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
    /* JADX WARN: Type inference failed for: r53v0, types: [im7, pf0] */
    /* JADX WARN: Type inference failed for: r5v82, types: [k27] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(boolean z) {
        long j;
        long j2;
        k27 k27Var;
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
        if (!getUserConfig().o() || ((this.a.isEmpty() && this.E.isEmpty()) || !(gba.N0 || this.currentAccount == y6c.t0))) {
            j();
            return;
        }
        try {
            getConnectionsManager().resumeNetworkMaybe();
            long j16 = 0;
            hm7 hm7Var = null;
            for (int i25 = 0; i25 < this.a.size(); i25++) {
                ?? r5 = (k27) this.a.get(i25);
                long j17 = r5.k.date;
                if (j16 < j17) {
                    hm7Var = r5;
                    j16 = j17;
                }
            }
            for (int i26 = 0; i26 < this.E.size(); i26++) {
                hm7 hm7Var2 = (hm7) this.E.get(i26);
                long j18 = hm7Var2.e;
                if (j16 < j18 / 1000) {
                    hm7Var = hm7Var2;
                    j16 = j18 / 1000;
                }
            }
            if (hm7Var == null) {
                return;
            }
            if (hm7Var instanceof hm7) {
                hm7 hm7Var3 = hm7Var;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                boolean z28 = false;
                int i27 = 0;
                j = 1000;
                for (int i28 = 0; i28 < this.E.size(); i28++) {
                    z28 |= ((hm7) this.E.get(i28)).d;
                    tL_message.date = Math.min(tL_message.date, (int) (((hm7) this.E.get(i28)).e / 1000));
                    i27 += ((hm7) this.E.get(i28)).c.size();
                }
                j2 = 0;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                long j19 = hm7Var3.a;
                tL_peerUser.user_id = j19;
                tL_message.dialog_id = j19;
                tL_message.peer_id = tL_peerUser;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                I(arrayList, arrayList2);
                Bitmap F = gba.o() >= 1 ? F(arrayList2) : null;
                String G2 = (z28 || this.E.size() >= 2 || arrayList.isEmpty()) ? k96.G(i27, "Stories", new Object[0]) : (String) arrayList.get(0);
                if (z28) {
                    G = k96.G(i27, "StoryNotificationHidden", new Object[0]);
                    tL_message.message = G;
                } else if (arrayList.isEmpty()) {
                    tL_message.message = "";
                    str17 = "";
                    k27 k27Var2 = new k27(this.currentAccount, tL_message, str17, G2, G2, false, false, false, false);
                    k27Var2.K = true;
                    k27Var = k27Var2;
                    bitmap = F;
                } else if (arrayList.size() == 1) {
                    if (i27 == 1) {
                        G = k96.N0("StoryNotificationSingle");
                        tL_message.message = G;
                    } else {
                        G = k96.G(i27, "StoryNotification1", arrayList.get(0));
                        tL_message.message = G;
                    }
                } else if (arrayList.size() == 2) {
                    G = k96.Z(2131744362, arrayList.get(0), arrayList.get(1));
                    tL_message.message = G;
                } else if (arrayList.size() == 3 && this.E.size() == 3) {
                    G = k96.Z(2131744361, e((String) arrayList.get(0)), e((String) arrayList.get(1)), e((String) arrayList.get(2)));
                    tL_message.message = G;
                } else {
                    G = k96.G(this.E.size() - 2, "StoryNotification4", e((String) arrayList.get(0)), e((String) arrayList.get(1)));
                    tL_message.message = G;
                }
                str17 = G;
                k27 k27Var22 = new k27(this.currentAccount, tL_message, str17, G2, G2, false, false, false, false);
                k27Var22.K = true;
                k27Var = k27Var22;
                bitmap = F;
            } else {
                j = 1000;
                j2 = 0;
                k27Var = (k27) this.a.get(0);
                bitmap = null;
            }
            SharedPreferences d = getAccountInstance().d();
            int i29 = d.getInt("dismissDate", 0);
            if (!k27Var.K && k27Var.k.date <= i29) {
                j();
                return;
            }
            long A0 = k27Var.A0();
            long a2 = k27.a2(this.currentAccount, k27Var.k, getMessagesController().s2(k27Var));
            boolean z29 = k27Var.K;
            if (k27Var.k.mentioned) {
                str = "";
                j3 = k27Var.Z0();
            } else {
                str = "";
                j3 = A0;
            }
            k27Var.e1();
            TLRPC.Peer peer = k27Var.k.peer_id;
            long j20 = peer.chat_id;
            if (j20 == j2) {
                j20 = peer.channel_id;
            }
            long j21 = j3;
            long j22 = peer.user_id;
            if (k27Var.p3() && (j22 == j2 || j22 == getUserConfig().e())) {
                j22 = k27Var.k.from_id.user_id;
            }
            if (k27Var.A0() == 489000 && k27Var.W0() != null) {
                if (k27Var.W0().longValue() >= j2) {
                    j22 = k27Var.W0().longValue();
                    j20 = j2;
                } else {
                    j20 = k27Var.W0().longValue();
                    j22 = j2;
                }
            }
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j22));
            if (j20 != j2) {
                j4 = j20;
                chat = getMessagesController().K0(Long.valueOf(j4));
                z2 = (chat == null && k27Var.i3()) ? k27Var.f : hc2.T(chat) && !chat.megagroup;
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
                boolean z30 = k27Var.I;
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
            String s = (((j20 == j2 || chat2 != null) && V1 != null) || !k27Var.i3()) ? chat2 != null ? s(chat2) : l7c.q(V1) : k27Var.b;
            boolean z31 = gl.m2() || gba.B;
            String str18 = s;
            boolean equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
            if (cf3.B(j8)) {
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
                    if (!k27Var.I || k27Var.J) {
                        str4 = L0;
                        if (!d.getBoolean("EnableReactionsPreview", true)) {
                            L02 = k96.L0(2131747825);
                            if (z4) {
                                z6 = z5;
                                z7 = z3;
                                bitmap2 = bitmap;
                                z8 = z29;
                                str5 = str;
                            } else {
                                z6 = z5;
                                if (y6c.c() <= 1) {
                                    str5 = str;
                                } else if (this.f.m() == 1) {
                                    str5 = l7c.j(getUserConfig().f());
                                } else {
                                    str5 = l7c.j(getUserConfig().f()) + "・";
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
                                        sb.append(k96.G(this.J, "NewMessages", new Object[0]));
                                        str5 = sb.toString();
                                    } else {
                                        bitmap2 = bitmap;
                                        str5 = str5 + k96.Z(2131747752, k96.G(this.J, "NewMessages", new Object[0]), k96.G(this.f.m(), "FromChats", new Object[0]));
                                    }
                                }
                            }
                            xk7 xk7Var = new xk7(a.b);
                            TLRPC.Chat chat4 = chat2;
                            if (this.a.size() > 1 || z4) {
                                sharedPreferences = d;
                                j10 = j22;
                                String str19 = str;
                                boolean[] zArr2 = new boolean[1];
                                r = r(k27Var, zArr2);
                                boolean z32 = !k27Var.k.silent || k27Var.I;
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
                                xk7Var.d(str6);
                                if (z4) {
                                    str5 = str6;
                                }
                                sk7 sk7Var = new sk7((byte) 0);
                                sk7Var.e(str6);
                                xk7Var.i(sk7Var);
                                z9 = z32;
                                str7 = str19;
                            } else {
                                xk7Var.d(str5);
                                sk7 sk7Var2 = new sk7((byte) 1);
                                sk7Var2.f(L02);
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
                                    k27 k27Var3 = (k27) this.a.get(i30);
                                    int i32 = i30;
                                    String r2 = r(k27Var3, zArr3);
                                    if (r2 != null) {
                                        zArr = zArr3;
                                        if (k27Var3.K || k27Var3.k.date > i29) {
                                            r12 = r12;
                                            if (r12 == 2) {
                                                r12 = k27Var3.k.silent || k27Var3.I;
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
                                            sk7Var2.d(r2);
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
                                sk7Var2.g(str5);
                                xk7Var.i(sk7Var2);
                                r = str20;
                                z9 = r12;
                            }
                            boolean z33 = !z || !z7 || MediaController.w().E() || z9;
                            if (z33 || j8 != j7 || chat4 == null) {
                                z10 = z9;
                                str8 = str7;
                                sharedPreferences2 = sharedPreferences;
                            } else {
                                sharedPreferences2 = sharedPreferences;
                                boolean z34 = sharedPreferences2.getBoolean("custom_" + j8, false);
                                int i33 = kk7.J2;
                                if (z34) {
                                    i24 = sharedPreferences2.getInt("smart_max_count_" + j8, 2);
                                    i33 = sharedPreferences2.getInt("smart_delay_" + j8, kk7.J2);
                                } else {
                                    i24 = 2;
                                }
                                if (i24 != 0) {
                                    Point point = (Point) this.e.f(j8);
                                    if (point == null) {
                                        this.e.k(new Point(1, (int) (SystemClock.elapsedRealtime() / j)), j8);
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
                                    if (!k27Var.I || k27Var.J) {
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
                                        i3 = !k27Var.J ? 5 : 4;
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
                                                    fa4.f(e);
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
                                            if (k27Var.O) {
                                                intent.putExtra("oauth_url", k27Var.b);
                                            }
                                            if (k27Var.J) {
                                                intent.putExtra("storyId", Math.abs(k27Var.e1()));
                                                i11 = i10;
                                                i12 = i4;
                                                str14 = str13;
                                                z22 = z14;
                                            } else {
                                                str14 = str13;
                                                if (k27Var.N) {
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
                                                    intent.putExtra("storyId", Math.abs(k27Var.e1()));
                                                    z22 = z14;
                                                    i12 = i13;
                                                } else {
                                                    i11 = i10;
                                                    long j30 = j10;
                                                    long j31 = j9;
                                                    i12 = i4;
                                                    z22 = z14;
                                                    if (k27Var.K) {
                                                        long[] jArr2 = new long[this.E.size()];
                                                        for (int i42 = 0; i42 < this.E.size(); i42++) {
                                                            jArr2[i42] = ((hm7) this.E.get(i42)).a;
                                                        }
                                                        intent.putExtra("storyDialogIds", jArr2);
                                                    } else {
                                                        boolean B = cf3.B(j14);
                                                        vf6 vf6Var = this.f;
                                                        if (B) {
                                                            z23 = z36;
                                                            user = V1;
                                                            chat3 = chat4;
                                                            if (vf6Var.m() == 1 && j14 != o0) {
                                                                intent.putExtra("encId", cf3.h(j14));
                                                            }
                                                        } else {
                                                            z23 = z36;
                                                            if (vf6Var.m() == 1) {
                                                                if (j20 != j2) {
                                                                    intent.putExtra("chatId", j31);
                                                                } else if (j30 != 0) {
                                                                    intent.putExtra("userId", j30);
                                                                }
                                                            }
                                                            if (!gl.m2() && !gba.B && this.f.m() == 1 && Build.VERSION.SDK_INT < 28) {
                                                                if (chat4 != null) {
                                                                    chat3 = chat4;
                                                                    TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                                                    if (chatPhoto != null && (fileLocation2 = chatPhoto.photo_small) != null && fileLocation2.volume_id != 0 && fileLocation2.local_id != 0) {
                                                                        fileLocation = fileLocation2;
                                                                        user = V1;
                                                                    }
                                                                    user = V1;
                                                                } else {
                                                                    chat3 = chat4;
                                                                    if (V1 != null) {
                                                                        user = V1;
                                                                        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                                                        if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                                                        }
                                                                    }
                                                                    user = V1;
                                                                }
                                                                String str24 = str3;
                                                                intent.putExtra(str24, this.currentAccount);
                                                                PendingIntent activity = PendingIntent.getActivity(a.b, 0, intent, 1140850688);
                                                                xk7Var.e(str14);
                                                                xk7Var.F.icon = R.drawable.notification;
                                                                xk7Var.f(16, true);
                                                                xk7Var.i = this.J;
                                                                xk7Var.g = activity;
                                                                xk7Var.q = this.f0;
                                                                xk7Var.r = true;
                                                                xk7Var.k = true;
                                                                xk7Var.F.when = k27Var.k.date * j;
                                                                xk7Var.w = -15618822;
                                                                xk7Var.u = "msg";
                                                                if (chat3 == null && user != null && (str15 = user.phone) != null && str15.length() > 0) {
                                                                    str16 = "tel:+" + user.phone;
                                                                    if (!str16.isEmpty()) {
                                                                        xk7Var.G.add(str16);
                                                                    }
                                                                }
                                                                Intent intent2 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                                                intent2.putExtra("messageDate", k27Var.k.date);
                                                                intent2.putExtra(str24, this.currentAccount);
                                                                if (k27Var.K) {
                                                                    intent2.putExtra("story", true);
                                                                }
                                                                if (k27Var.J) {
                                                                    i22 = 1;
                                                                    intent2.putExtra("storyReaction", true);
                                                                } else {
                                                                    i22 = 1;
                                                                }
                                                                xk7Var.F.deleteIntent = PendingIntent.getBroadcast(a.b, i22, intent2, 167772160);
                                                                if (bitmap2 != null) {
                                                                    xk7Var.g(bitmap2);
                                                                } else if (fileLocation != null) {
                                                                    BitmapDrawable y = fl5.z().y(fileLocation);
                                                                    if (y != null) {
                                                                        xk7Var.g(y.getBitmap());
                                                                    } else {
                                                                        try {
                                                                            getFileLoader().getClass();
                                                                            File K = ba4.K(fileLocation, true);
                                                                            if (K.exists()) {
                                                                                float L = 160.0f / gl.L(50.0f);
                                                                                BitmapFactory.Options options = new BitmapFactory.Options();
                                                                                options.inSampleSize = L < 1.0f ? 1 : (int) L;
                                                                                Bitmap decodeFile = BitmapFactory.decodeFile(K.getAbsolutePath(), options);
                                                                                if (decodeFile != null) {
                                                                                    xk7Var.g(decodeFile);
                                                                                }
                                                                            }
                                                                        } catch (Throwable unused) {
                                                                        }
                                                                    }
                                                                }
                                                                boolean z37 = z10;
                                                                if (z || z37) {
                                                                    xk7Var.j = -1;
                                                                } else if (i9 == 0) {
                                                                    xk7Var.j = 0;
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
                                                                                xk7Var.j = -2;
                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                    i14 = 1;
                                                                                }
                                                                            } else if (i9 == 5) {
                                                                                xk7Var.j = -1;
                                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                                    i14 = 2;
                                                                                }
                                                                            }
                                                                            i14 = 0;
                                                                        }
                                                                    }
                                                                    xk7Var.j = i43;
                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                        i14 = 4;
                                                                    }
                                                                    i14 = 0;
                                                                }
                                                                if (z37 || z15) {
                                                                    i15 = i12;
                                                                    long[] jArr3 = {0, 0};
                                                                    xk7Var.F.vibrate = jArr3;
                                                                    jArr = jArr3;
                                                                    uri = null;
                                                                } else {
                                                                    if (z12 || (sharedPreferences2.getBoolean("EnableInAppPreview", true) && str9 != null)) {
                                                                        xk7Var.k(str9.length() > 100 ? str9.substring(0, 100).replace('\n', ' ').trim() + "..." : str9);
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
                                                                                Notification notification = xk7Var.F;
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
                                                                                xk7Var.F.vibrate = jArr;
                                                                            } else if (i21 == 1) {
                                                                                jArr = new long[]{0, 100, 0, 100};
                                                                                xk7Var.F.vibrate = jArr;
                                                                            } else if (i21 == 0 || i21 == 4) {
                                                                                xk7Var.F.defaults = 2;
                                                                                jArr = new long[0];
                                                                            } else if (i21 == 3) {
                                                                                jArr = new long[]{0, 1000};
                                                                                xk7Var.F.vibrate = jArr;
                                                                            } else {
                                                                                jArr = null;
                                                                            }
                                                                        } else if (str11.equals(path)) {
                                                                            xk7Var.h(Settings.System.DEFAULT_NOTIFICATION_URI);
                                                                        } else {
                                                                            if (i44 >= 24) {
                                                                                String str25 = str2;
                                                                                if (str11.startsWith(str25) && !gl.G1(Uri.parse(str11), 0)) {
                                                                                    try {
                                                                                        Context context2 = a.b;
                                                                                        StringBuilder sb5 = new StringBuilder();
                                                                                        a.d();
                                                                                        sb5.append("org.telegram.messenger.beta");
                                                                                        sb5.append(".provider");
                                                                                        Uri c4 = FileProvider.c(context2, sb5.toString(), new File(str11.replace(str25, str10)));
                                                                                        a.b.grantUriPermission("com.android.systemui", c4, 1);
                                                                                        xk7Var.h(c4);
                                                                                    } catch (Exception unused2) {
                                                                                        xk7Var.h(Uri.parse(str11));
                                                                                    }
                                                                                }
                                                                            }
                                                                            xk7Var.h(Uri.parse(str11));
                                                                        }
                                                                    }
                                                                    uri = null;
                                                                    if (i12 == 0) {
                                                                    }
                                                                    i21 = i11;
                                                                    if (i21 != 2) {
                                                                    }
                                                                }
                                                                if (!gl.m2() && !gba.B && k27Var.A0() == 777000) {
                                                                    TLRPC.ReplyMarkup replyMarkup = k27Var.k.reply_markup;
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
                                                                                TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) jdb.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class);
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
                                                                                    intent3.putExtra("mid", k27Var.e1());
                                                                                    String str26 = keyboardInlineButton.text;
                                                                                    Context context3 = a.b;
                                                                                    int i47 = this.I;
                                                                                    j14 = j32;
                                                                                    this.I = i47 + 1;
                                                                                    xk7Var.a(0, PendingIntent.getBroadcast(context3, i47, intent3, 167772160), str26);
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
                                                                        if (!z24 && Build.VERSION.SDK_INT < 24 && gba.r.length() == 0 && u()) {
                                                                            Intent intent4 = new Intent(a.b, (Class<?>) PopupReplyReceiver.class);
                                                                            intent4.putExtra(str24, this.currentAccount);
                                                                            xk7Var.a(R.drawable.ic_ab_reply, PendingIntent.getBroadcast(a.b, 2, intent4, 167772160), k96.L0(2131746070));
                                                                        }
                                                                        X(xk7Var, str22, j14, j12, str18, jArr, i17, uri2, i16, z23, z35, z15, i3);
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
                                                                    xk7Var.a(R.drawable.ic_ab_reply, PendingIntent.getBroadcast(a.b, 2, intent42, 167772160), k96.L0(2131746070));
                                                                }
                                                                X(xk7Var, str22, j14, j12, str18, jArr, i17, uri2, i16, z23, z35, z15, i3);
                                                                R();
                                                                return;
                                                            }
                                                            user = V1;
                                                            chat3 = chat4;
                                                        }
                                                        fileLocation = null;
                                                        String str242 = str3;
                                                        intent.putExtra(str242, this.currentAccount);
                                                        PendingIntent activity2 = PendingIntent.getActivity(a.b, 0, intent, 1140850688);
                                                        xk7Var.e(str14);
                                                        xk7Var.F.icon = R.drawable.notification;
                                                        xk7Var.f(16, true);
                                                        xk7Var.i = this.J;
                                                        xk7Var.g = activity2;
                                                        xk7Var.q = this.f0;
                                                        xk7Var.r = true;
                                                        xk7Var.k = true;
                                                        xk7Var.F.when = k27Var.k.date * j;
                                                        xk7Var.w = -15618822;
                                                        xk7Var.u = "msg";
                                                        if (chat3 == null) {
                                                            str16 = "tel:+" + user.phone;
                                                            if (!str16.isEmpty()) {
                                                            }
                                                        }
                                                        Intent intent22 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                                        intent22.putExtra("messageDate", k27Var.k.date);
                                                        intent22.putExtra(str242, this.currentAccount);
                                                        if (k27Var.K) {
                                                        }
                                                        if (k27Var.J) {
                                                        }
                                                        xk7Var.F.deleteIntent = PendingIntent.getBroadcast(a.b, i22, intent22, 167772160);
                                                        if (bitmap2 != null) {
                                                        }
                                                        boolean z372 = z10;
                                                        if (z) {
                                                        }
                                                        xk7Var.j = -1;
                                                    }
                                                }
                                            }
                                            z23 = z36;
                                            user = V1;
                                            chat3 = chat4;
                                            fileLocation = null;
                                            String str2422 = str3;
                                            intent.putExtra(str2422, this.currentAccount);
                                            PendingIntent activity22 = PendingIntent.getActivity(a.b, 0, intent, 1140850688);
                                            xk7Var.e(str14);
                                            xk7Var.F.icon = R.drawable.notification;
                                            xk7Var.f(16, true);
                                            xk7Var.i = this.J;
                                            xk7Var.g = activity22;
                                            xk7Var.q = this.f0;
                                            xk7Var.r = true;
                                            xk7Var.k = true;
                                            xk7Var.F.when = k27Var.k.date * j;
                                            xk7Var.w = -15618822;
                                            xk7Var.u = "msg";
                                            if (chat3 == null) {
                                            }
                                            Intent intent222 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                            intent222.putExtra("messageDate", k27Var.k.date);
                                            intent222.putExtra(str2422, this.currentAccount);
                                            if (k27Var.K) {
                                            }
                                            if (k27Var.J) {
                                            }
                                            xk7Var.F.deleteIntent = PendingIntent.getBroadcast(a.b, i22, intent222, 167772160);
                                            if (bitmap2 != null) {
                                            }
                                            boolean z3722 = z10;
                                            if (z) {
                                            }
                                            xk7Var.j = -1;
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
                                    if (k27Var.O) {
                                    }
                                    if (k27Var.J) {
                                    }
                                    z23 = z362;
                                    user = V1;
                                    chat3 = chat4;
                                    fileLocation = null;
                                    String str24222 = str3;
                                    intent5.putExtra(str24222, this.currentAccount);
                                    PendingIntent activity222 = PendingIntent.getActivity(a.b, 0, intent5, 1140850688);
                                    xk7Var.e(str14);
                                    xk7Var.F.icon = R.drawable.notification;
                                    xk7Var.f(16, true);
                                    xk7Var.i = this.J;
                                    xk7Var.g = activity222;
                                    xk7Var.q = this.f0;
                                    xk7Var.r = true;
                                    xk7Var.k = true;
                                    xk7Var.F.when = k27Var.k.date * j;
                                    xk7Var.w = -15618822;
                                    xk7Var.u = "msg";
                                    if (chat3 == null) {
                                    }
                                    Intent intent2222 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                                    intent2222.putExtra("messageDate", k27Var.k.date);
                                    intent2222.putExtra(str24222, this.currentAccount);
                                    if (k27Var.K) {
                                    }
                                    if (k27Var.J) {
                                    }
                                    xk7Var.F.deleteIntent = PendingIntent.getBroadcast(a.b, i22, intent2222, 167772160);
                                    if (bitmap2 != null) {
                                    }
                                    boolean z37222 = z10;
                                    if (z) {
                                    }
                                    xk7Var.j = -1;
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
                            if (k27Var.I) {
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
                            i3 = !k27Var.J ? 5 : 4;
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
                            if (k27Var.O) {
                            }
                            if (k27Var.J) {
                            }
                            z23 = z3622;
                            user = V1;
                            chat3 = chat4;
                            fileLocation = null;
                            String str242222 = str3;
                            intent52.putExtra(str242222, this.currentAccount);
                            PendingIntent activity2222 = PendingIntent.getActivity(a.b, 0, intent52, 1140850688);
                            xk7Var.e(str14);
                            xk7Var.F.icon = R.drawable.notification;
                            xk7Var.f(16, true);
                            xk7Var.i = this.J;
                            xk7Var.g = activity2222;
                            xk7Var.q = this.f0;
                            xk7Var.r = true;
                            xk7Var.k = true;
                            xk7Var.F.when = k27Var.k.date * j;
                            xk7Var.w = -15618822;
                            xk7Var.u = "msg";
                            if (chat3 == null) {
                            }
                            Intent intent22222 = new Intent(a.b, (Class<?>) NotificationDismissReceiver.class);
                            intent22222.putExtra("messageDate", k27Var.k.date);
                            intent22222.putExtra(str242222, this.currentAccount);
                            if (k27Var.K) {
                            }
                            if (k27Var.J) {
                            }
                            xk7Var.F.deleteIntent = PendingIntent.getBroadcast(a.b, i22, intent22222, 167772160);
                            if (bitmap2 != null) {
                            }
                            boolean z372222 = z10;
                            if (z) {
                            }
                            xk7Var.j = -1;
                        }
                    } else {
                        str4 = L0;
                    }
                    L02 = str4;
                    if (z4) {
                    }
                    xk7 xk7Var2 = new xk7(a.b);
                    TLRPC.Chat chat42 = chat2;
                    if (this.a.size() > 1) {
                    }
                    sharedPreferences = d;
                    j10 = j22;
                    String str192 = str;
                    boolean[] zArr22 = new boolean[1];
                    r = r(k27Var, zArr22);
                    if (k27Var.k.silent) {
                    }
                    if (r == null) {
                    }
                }
            }
            L0 = z31 ? j20 != j2 ? k96.L0(2131747828) : k96.L0(2131747825) : k96.L0(R.string.AppName);
            z5 = false;
            if (k27Var.I) {
            }
            str4 = L0;
            if (!d.getBoolean("EnableReactionsPreview", true)) {
            }
            L02 = str4;
            if (z4) {
            }
            xk7 xk7Var22 = new xk7(a.b);
            TLRPC.Chat chat422 = chat2;
            if (this.a.size() > 1) {
            }
            sharedPreferences = d;
            j10 = j22;
            String str1922 = str;
            boolean[] zArr222 = new boolean[1];
            r = r(k27Var, zArr222);
            if (k27Var.k.silent) {
            }
            if (r == null) {
            }
        } catch (Exception e2) {
            fa4.f(e2);
        }
    }

    public final void a0(long j, String str) {
        l0.c(new go6((Object) this, (Object) str, j, (byte) 21));
    }

    public final void b(k27 k27Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                arrayList.add(0, k27Var);
                return;
            } else if (((k27) arrayList.get(i)).e1() == k27Var.e1() && k27.B0(((k27) arrayList.get(i)).k) == k27.B0(k27Var.k) && ((k27) arrayList.get(i)).K == k27Var.K) {
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
            getConnectionsManager().sendRequest(setreactionsnotifysettings, new ce2(b));
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
        getConnectionsManager().sendRequest(updatenotifysettings, new ce2(b));
    }

    public final void c0(long j, long j2, boolean z) {
        byte b = 0;
        if (z) {
            getNotificationCenter().k(kk7.e0, new Object[0]);
        }
        if (cf3.B(j)) {
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
            if (j >= 0 || !hc2.Y(na7.q1(i2).K0(Long.valueOf(-j)))) {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().h1(j);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            } else {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().f1(-j);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            }
        } else {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().h1(j);
            tL_inputNotifyForumTopic.top_msg_id = (int) j2;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new ce2(b));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b4 A[Catch: Exception -> 0x0191, TryCatch #0 {Exception -> 0x0191, blocks: (B:13:0x0027, B:16:0x005f, B:17:0x0067, B:20:0x007b, B:22:0x009a, B:24:0x00a6, B:25:0x00ac, B:27:0x00b4, B:29:0x00b8, B:31:0x00bb, B:33:0x00c8, B:35:0x00cc, B:37:0x00d1, B:38:0x00d8, B:40:0x00dc, B:41:0x00e1, B:43:0x0106, B:44:0x010e, B:46:0x0117, B:48:0x013f, B:50:0x014a, B:55:0x0158, B:59:0x0175, B:60:0x017c, B:61:0x017d, B:64:0x0122, B:67:0x012f, B:69:0x0134, B:70:0x010a, B:71:0x0181, B:72:0x0188, B:73:0x0189, B:74:0x0190, B:76:0x0077, B:77:0x0063), top: B:12:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189 A[Catch: Exception -> 0x0191, TryCatch #0 {Exception -> 0x0191, blocks: (B:13:0x0027, B:16:0x005f, B:17:0x0067, B:20:0x007b, B:22:0x009a, B:24:0x00a6, B:25:0x00ac, B:27:0x00b4, B:29:0x00b8, B:31:0x00bb, B:33:0x00c8, B:35:0x00cc, B:37:0x00d1, B:38:0x00d8, B:40:0x00dc, B:41:0x00e1, B:43:0x0106, B:44:0x010e, B:46:0x0117, B:48:0x013f, B:50:0x014a, B:55:0x0158, B:59:0x0175, B:60:0x017c, B:61:0x017d, B:64:0x0122, B:67:0x012f, B:69:0x0134, B:70:0x010a, B:71:0x0181, B:72:0x0188, B:73:0x0189, B:74:0x0190, B:76:0x0077, B:77:0x0063), top: B:12:0x0027 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String d(xk7 xk7Var, long j, String str, TLRPC.User user, TLRPC.Chat chat, l38 l38Var, boolean z) {
        Bitmap bitmap;
        IconCompat d;
        if (Build.VERSION.SDK_INT < 29 || !gba.n0) {
            return null;
        }
        if (hc2.T(chat) && !chat.megagroup) {
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
            oga ogaVar = new oga();
            ogaVar.a = context;
            ogaVar.b = str2;
            ogaVar.e = chat != null ? str : l7c.k(user, true);
            ogaVar.f = str;
            new Intent("android.intent.action.VIEW");
            ogaVar.c = new Intent[]{intent};
            ogaVar.l = true;
            ogaVar.k = new ub6(str2);
            if (l38Var != null) {
                ogaVar.i = new l38[]{l38Var};
                IconCompat iconCompat = l38Var.b;
                ogaVar.h = iconCompat;
                if (iconCompat != null) {
                    bitmap = iconCompat.f();
                    if (!TextUtils.isEmpty(ogaVar.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = ogaVar.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    tga.m(a.b, ogaVar);
                    String str3 = ogaVar.b;
                    xk7Var.z = str3;
                    if (xk7Var.A == null) {
                        ub6 ub6Var = ogaVar.k;
                        if (ub6Var != null) {
                            xk7Var.A = ub6Var;
                        } else if (str3 != null) {
                            xk7Var.A = new ub6(str3);
                        }
                    }
                    if (xk7Var.e == null) {
                        xk7Var.e(ogaVar.e);
                    }
                    Intent intent2 = new Intent(a.b, (Class<?>) BubbleActivity.class);
                    intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    if (cf3.D(j)) {
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
                        xk7Var.E = null;
                        return str2;
                    }
                    PendingIntent activity = PendingIntent.getActivity(a.b, 0, intent2, 167772160);
                    if (activity == null) {
                        throw new NullPointerException("Bubble requires non-null pending intent");
                    }
                    int i = (this.G > j ? 1 : (this.G == j ? 0 : -1)) == 0 ? 2 : 0;
                    int max = Math.max(gl.L(640.0f), 0);
                    vk7 vk7Var = new vk7();
                    vk7Var.a = activity;
                    vk7Var.b = d;
                    vk7Var.c = max;
                    vk7Var.d = i & (-2);
                    xk7Var.E = vk7Var;
                    return str2;
                }
            }
            bitmap = null;
            if (!TextUtils.isEmpty(ogaVar.e)) {
            }
        } catch (Exception e) {
            fa4.g(e, true);
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
            Iterator it = ((hm7) arrayList.get(i)).c.values().iterator();
            while (it.hasNext()) {
                j = Math.min(j, ((Long) ((Pair) it.next()).second).longValue());
            }
            i++;
        }
        co3 co3Var = l0;
        wl7 wl7Var = this.j0;
        co3Var.a(wl7Var);
        long currentTimeMillis = j - System.currentTimeMillis();
        if (j != Long.MAX_VALUE) {
            co3Var.d(wl7Var, Math.max(0L, currentTimeMillis));
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == kk7.X1) {
            l0.c(new bj7(this, (String) objArr[0], (byte) 6));
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
                    NotificationChannel d2 = fi7.d(notificationChannels.get(i11));
                    List<NotificationChannel> list = notificationChannels;
                    String id = d2.getId();
                    if (id.startsWith(str40)) {
                        str4 = str40;
                        int importance = d2.getImportance();
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
                                        fa4.g(e, true);
                                        d.edit().putBoolean("groupsCreated5", z4).commit();
                                        this.Q = Boolean.TRUE;
                                        String str41 = "stories";
                                        if (this.R) {
                                        }
                                        SharedPreferences d3 = getAccountInstance().d();
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
                                        String y = tb4.y(str41, "_", a);
                                        string = d3.getString(y, null);
                                        String string2 = d3.getString(y.concat("_s"), null);
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
                                        fa4.g(e, true);
                                        d.edit().putBoolean("groupsCreated5", z4).commit();
                                        this.Q = Boolean.TRUE;
                                        String str412 = "stories";
                                        if (this.R) {
                                        }
                                        SharedPreferences d32 = getAccountInstance().d();
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
                                        String y2 = tb4.y(str412, "_", a);
                                        string = d32.getString(y2, null);
                                        String string22 = d32.getString(y2.concat("_s"), null);
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
                TLRPC.User V1 = getMessagesController().V1(Long.valueOf(getUserConfig().e()));
                if (V1 == null) {
                    getUserConfig().f();
                    sb4 = "";
                    str6 = "reactions";
                } else {
                    StringBuilder sb8 = new StringBuilder(" (");
                    str6 = "reactions";
                    sb8.append(qu2.m(0, V1.first_name, V1.last_name));
                    sb8.append(")");
                    sb4 = sb8.toString();
                }
                ArrayList arrayList = new ArrayList();
                if (str51 != null) {
                    fk.f();
                    arrayList.add(new NotificationChannelGroup(str51, k96.M0(2131747728, null).concat(sb4)));
                }
                if (str50 != null) {
                    fk.f();
                    str37 = null;
                    arrayList.add(new NotificationChannelGroup(str50, k96.M0(2131747714, null).concat(sb4)));
                } else {
                    str37 = null;
                }
                if (str48 != null) {
                    fk.f();
                    arrayList.add(new NotificationChannelGroup(str48, k96.M0(2131747672, str37).concat(sb4)));
                }
                if (str49 != null) {
                    fk.f();
                    arrayList.add(new NotificationChannelGroup(str49, k96.M0(2131747684, str37).concat(sb4)));
                }
                if (str47 != null) {
                    fk.f();
                    arrayList.add(new NotificationChannelGroup(str47, k96.M0(2131747685, str37).concat(sb4)));
                }
                if (str52 != null) {
                    fk.f();
                    arrayList.add(new NotificationChannelGroup(str52, k96.M0(2131747698, str37).concat(sb4)));
                }
                n0.createNotificationChannelGroups(arrayList);
            }
            this.R = true;
        }
        SharedPreferences d322 = getAccountInstance().d();
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
        boolean z18 = z && cf3.B(j);
        z5 = z2 && str15 != null && d322.getBoolean(str15, false);
        a = Utilities.a(uri == null ? "NoSound2" : uri.toString());
        if (a != null && a.length() > 5) {
            a = a.substring(0, 5);
        }
        if (z3) {
            str4122 = "silent";
            str19 = k96.M0(2131747679, null);
        } else {
            if (z) {
                a0 = k96.M0(z2 ? 2131747712 : 2131747723, null);
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
                a0 = z2 ? k96.a0(null, null, 2131747726, str) : str;
                str4122 = (z2 ? "org.telegram.keyia" : "org.telegram.key") + j + "_" + j2;
            }
            str19 = a0;
        }
        String y22 = tb4.y(str4122, "_", a);
        string = d322.getString(y22, null);
        String string222 = d322.getString(y22.concat("_s"), null);
        StringBuilder sb522 = new StringBuilder();
        if (string != null) {
            NotificationChannel notificationChannel = n0.getNotificationChannel(string);
            if (w01.a) {
                str32 = "_";
                sharedPreferences = d322;
                fa4.b("current channel for " + string + " = " + notificationChannel);
            } else {
                str32 = "_";
                sharedPreferences = d322;
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
                    if (w01.a) {
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
                if (w01.a) {
                    StringBuilder sb9 = new StringBuilder("current channel settings for ");
                    sb9.append(string);
                    sb9.append(" = ");
                    sb9.append((Object) sb522);
                    sb9.append(" old = ");
                    de9.s(string222, sb9);
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
                                    editor.putInt(ls6.n(j4, str3), z13 ? 0 : 2);
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
                    if (w01.a) {
                        fa4.b("change edited channel " + str26);
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
                            fa4.g(e4, true);
                        }
                        if (w01.a) {
                            fa4.b("delete channel by settings change ".concat(str26));
                        }
                        str29 = str28;
                        str30 = null;
                        if (str30 == null) {
                            int i15 = this.currentAccount;
                            str30 = z ? i15 + "channel_" + y22 + str22 + Utilities.b.nextLong() : i15 + "channel_" + j4 + str22 + Utilities.b.nextLong();
                            fk.g();
                            if (z6) {
                                uri2 = null;
                                str31 = k96.M0(2131745501, null);
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
                                if (w01.a) {
                                    fa4.b("create new channel ".concat(str30));
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
                            if (w01.a) {
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
            sharedPreferences = d322;
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
        l0.c(new xl7(this, j, j2, (byte) 1));
    }

    public final void g(int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        l0.c(new cm7(this, i, (byte) 8));
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
                        fa4.g(e, true);
                    }
                    if (w01.a) {
                        fa4.b("delete channel global internal ".concat(string));
                    }
                }
                String str2 = i == 2 ? "channels_ia" : i == 0 ? "groups_ia" : i == 3 ? "stories_ia" : (i == 4 || i == 5) ? "reactions_ia" : "private_ia";
                String string2 = d.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        n0.deleteNotificationChannel(string2);
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                    if (w01.a) {
                        fa4.b("delete channel global internal ".concat(string2));
                    }
                }
                edit.remove(i == 2 ? "overwrite_channel" : i == 0 ? "overwrite_group" : i == 3 ? "overwrite_stories" : (i == 4 || i == 5) ? "overwrite_reactions" : "overwrite_private");
                edit.commit();
            } catch (Exception e3) {
                fa4.g(e3, true);
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
                        fa4.g(e, true);
                    }
                    if (w01.a) {
                        fa4.b("delete channel internal ".concat(string));
                    }
                }
                String str2 = "org.telegram.keyia" + j;
                String string2 = d.getString(str2, null);
                if (string2 != null) {
                    edit.remove(str2).remove(str2.concat("_s"));
                    try {
                        n0.deleteNotificationChannel(string2);
                    } catch (Exception e2) {
                        fa4.g(e2, true);
                    }
                    if (w01.a) {
                        fa4.b("delete channel internal ".concat(string2));
                    }
                }
                edit.commit();
            } catch (Exception e3) {
                fa4.g(e3, true);
            }
        }
    }

    public final void j() {
        vf6 vf6Var = this.h;
        fa4.b("NotificationsController dismissNotification");
        try {
            m0.b(this.e0, null);
            this.a.clear();
            this.c.b();
            this.n.b();
            for (int i = 0; i < vf6Var.m(); i++) {
                if (!this.y.contains(Long.valueOf(vf6Var.j(i)))) {
                    m0.b(((Integer) vf6Var.n(i)).intValue(), null);
                }
            }
            vf6Var.b();
            gl.d3(new am6((byte) 6));
        } catch (Exception e) {
            fa4.g(e, true);
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
    
        if (k27.J4(r3.document) != false) goto L738;
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
    public final String q(k27 k27Var, String[] strArr, boolean[] zArr) {
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
        if (gl.m2() || gba.B) {
            return k96.L0(2131747826);
        }
        TLRPC.Message message = k27Var.k;
        boolean z = k27Var.f;
        String str = k27Var.b;
        long j3 = message.dialog_id;
        TLRPC.Peer peer3 = message.peer_id;
        long j4 = peer3.chat_id;
        if (j4 == 0) {
            j4 = peer3.channel_id;
        }
        long j5 = peer3.user_id;
        zArr[0] = true;
        SharedPreferences d = getAccountInstance().d();
        boolean v = ls6.v("content_preview_", j3, d, true);
        boolean z2 = false;
        if (k27Var.i3()) {
            if (j4 != 0) {
                if (k27Var.k.peer_id.channel_id == 0 || k27Var.z4()) {
                    strArr[0] = k27Var.c;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = str;
                }
                if (!v || (z ? !d.getBoolean("EnablePreviewChannel", true) : !d.getBoolean("EnablePreviewGroup", true))) {
                    zArr[0] = false;
                    return (k27Var.k.peer_id.channel_id == 0 || k27Var.z4()) ? k96.Z(2131747797, k27Var.c, str) : k96.Z(2131752354, str);
                }
            } else if (j5 != 0) {
                if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = str;
                }
                if (!v || !d.getBoolean("EnablePreviewAll", true)) {
                    zArr[0] = false;
                    return k96.L0(2131748411);
                }
            }
            return O(k27Var);
        }
        long e = getUserConfig().e();
        if (j5 == 0) {
            j5 = k27Var.Z0();
            if (j5 == 0) {
                j5 = -j4;
            }
        } else if (j5 == e) {
            j5 = k27Var.Z0();
        }
        if (j3 == 0) {
            if (j4 != 0) {
                j3 = -j4;
            } else if (j5 != 0) {
                j3 = j5;
            }
        }
        if (l7c.z(j3) && (messageFwdHeader2 = k27Var.k.fwd_from) != null && (peer2 = messageFwdHeader2.from_id) != null) {
            j5 = k27.B1(peer2);
        }
        if (j5 > 0) {
            j = e;
            TLRPC.User V1 = getMessagesController().V1(Long.valueOf(j5));
            if (V1 != null) {
                s = l7c.q(V1);
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
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j5));
            if (K0 != null) {
                s = s(K0);
                strArr[0] = s;
            }
            s = null;
        }
        if (s != null && j5 > 0 && l7c.z(j3) && (messageFwdHeader = k27Var.k.fwd_from) != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long B1 = k27.B1(peer);
            if (cf3.y(B1)) {
                j2 = j3;
                TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(-B1));
                if (K02 != null) {
                    StringBuilder k = b00.k(s, " @ ");
                    k.append(s(K02));
                    s = k.toString();
                    if (strArr[0] != null) {
                        strArr[0] = s;
                    }
                }
                if (s != null) {
                    if (j4 != 0) {
                        chat = getMessagesController().K0(Long.valueOf(j4));
                        if (chat != null) {
                            if (hc2.T(chat) && !chat.megagroup && Build.VERSION.SDK_INT <= 27) {
                                strArr[0] = null;
                            }
                        }
                    } else {
                        chat = null;
                    }
                    if (cf3.B(j2)) {
                        strArr[0] = null;
                        return k96.L0(2131747826);
                    }
                    boolean z3 = hc2.T(chat) && !chat.megagroup;
                    TLRPC.Message message2 = k27Var.k;
                    if (message2 != null && message2.rich_message != null) {
                        return k27Var.v.toString();
                    }
                    if (v) {
                        boolean z4 = (j4 != 0 || j5 == 0) ? true : true;
                        if (j4 != 0) {
                            if (!z3) {
                            }
                            TLRPC.Message message3 = k27Var.k;
                            if (!(message3 instanceof TLRPC.TL_messageService)) {
                                if (k27Var.F3()) {
                                    return !TextUtils.isEmpty(k27Var.k.message) ? O(k27Var) : k96.L0(2131748411);
                                }
                                if (k27Var.D == 29 && (k27.m1(k27Var) instanceof TLRPC.TL_messageMediaPaidMedia)) {
                                    TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) k27.m1(k27Var);
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
                                        G = k96.L0(z5 ? 2131753930 : 2131753945);
                                        c = 0;
                                    } else {
                                        c = 0;
                                        G = k96.G(size, z5 ? "Media" : "Photos", new Object[0]);
                                    }
                                    Object[] objArr = new Object[1];
                                    objArr[c] = G;
                                    return k96.Z(2131753946, objArr);
                                }
                                if (k27Var.R4()) {
                                    return k96.L0(2131753948);
                                }
                                if (k27Var.f4()) {
                                    return k96.L0(2131753947);
                                }
                                TLRPC.Message message4 = k27Var.k;
                                if (message4.media instanceof TLRPC.TL_messageMediaPhoto) {
                                    if (TextUtils.isEmpty(message4.message)) {
                                        return k27Var.k.media.ttl_seconds != 0 ? k96.L0(2131753974) : k96.L0(2131753945);
                                    }
                                    return "🖼 " + O(k27Var);
                                }
                                boolean G4 = k27Var.G4();
                                TLRPC.Message message5 = k27Var.k;
                                if (G4) {
                                    if (TextUtils.isEmpty(message5.message)) {
                                        return k27Var.k.media.ttl_seconds != 0 ? k96.L0(2131753973) : k96.L0(2131753930);
                                    }
                                    return "📹 " + O(k27Var);
                                }
                                if (k27.n1(message5) instanceof TLRPC.TL_messageMediaGame) {
                                    return k96.L0(2131753969);
                                }
                                if (k27Var.O4()) {
                                    return k96.L0(2131753979);
                                }
                                if (k27Var.g4()) {
                                    return k96.L0(2131753938);
                                }
                                if (k27Var.I3()) {
                                    return k96.L0(2131753949);
                                }
                                TLRPC.Message message6 = k27Var.k;
                                TLRPC.MessageMedia messageMedia2 = message6.media;
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaContact) {
                                    return k96.L0(2131753976);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaPoll) {
                                    return ((TLRPC.TL_messageMediaPoll) messageMedia2).poll.quiz ? k96.L0(2131746252) : k96.L0(2131746992);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaToDo) {
                                    return k96.L0(2131743868);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaWidget) {
                                    return TextUtils.isEmpty(message6.message) ? k96.L0(2131753923) : O(k27Var);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveaway) {
                                    return k96.L0(2131753489);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaGiveawayResults) {
                                    return k96.L0(2131753389);
                                }
                                if ((messageMedia2 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia2 instanceof TLRPC.TL_messageMediaVenue)) {
                                    return k96.L0(2131753958);
                                }
                                if (messageMedia2 instanceof TLRPC.TL_messageMediaGeoLive) {
                                    return k96.L0(2131753963);
                                }
                                if (!(messageMedia2 instanceof TLRPC.TL_messageMediaDocument)) {
                                    if (!(messageMedia2 instanceof TLRPC.TL_messageMediaStory)) {
                                        return !TextUtils.isEmpty(k27Var.v) ? O(k27Var) : k96.L0(2131748411);
                                    }
                                    if (!((TLRPC.TL_messageMediaStory) messageMedia2).via_mention) {
                                        return k96.L0(2131744498);
                                    }
                                    String str2 = strArr[0];
                                    return k96.Z(2131744355, str2 != null ? str2 : "");
                                }
                                if (k27Var.s4() || k27Var.J2()) {
                                    String V12 = k27Var.V1();
                                    if (V12 == null) {
                                        return k96.L0(2131753933);
                                    }
                                    StringBuilder k2 = b00.k(V12, " ");
                                    k2.append(k96.L0(2131753933));
                                    return k2.toString();
                                }
                                boolean q3 = k27Var.q3();
                                TLRPC.Message message7 = k27Var.k;
                                if (q3) {
                                    if (TextUtils.isEmpty(message7.message)) {
                                        return k96.L0(2131753968);
                                    }
                                    return "🎬 " + O(k27Var);
                                }
                                if (TextUtils.isEmpty(message7.message)) {
                                    return k96.L0(2131753972);
                                }
                                return "📎 " + O(k27Var);
                            }
                            strArr[0] = null;
                            TLRPC.MessageAction messageAction = message3.action;
                            if (messageAction instanceof TLRPC.TL_messageActionGramTransfer) {
                                return l(k27Var, s);
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionSetSameChatWallPaper) {
                                return k96.L0(2131742688);
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                return k96.L0(2131742690);
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionGeoProximityReached) {
                                return k27Var.v.toString();
                            }
                            if ((messageAction instanceof TLRPC.TL_messageActionUserJoined) || (messageAction instanceof TLRPC.TL_messageActionContactSignUp)) {
                                return k96.Z(2131747854, s);
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionUserUpdatedPhoto) {
                                return k96.Z(2131747853, s);
                            }
                            if (messageAction instanceof TLRPC.TL_messageActionLoginUnknownLocation) {
                                String Z = k96.Z(2131742520, k96.D0().B0().format(k27Var.k.date * 1000), k96.D0().o0().format(k27Var.k.date * 1000));
                                String str3 = getUserConfig().f().first_name;
                                TLRPC.MessageAction messageAction2 = k27Var.k.action;
                                return k96.Z(2131747734, str3, Z, messageAction2.title, messageAction2.address);
                            }
                            if (apb.g(messageAction, TLRPC.TL_messageActionGameScore.class, TLRPC.TL_messageActionPaymentSent.class, TLRPC.TL_messageActionPaymentSentMe.class, TLRPC.TL_messageActionStarGift.class, TLRPC.TL_messageActionGiftPremium.class, TLRPC.TL_messageActionStarGiftUnique.class, TLRPC.TL_messageActionPaidMessagesPrice.class, TLRPC.TL_messageActionPaidMessagesRefunded.class, TLRPC.TL_messageActionGiftTon.class, TLRPC.TL_messageActionBotInvite.class, TLRPC.TL_messageActionStarGiftOnchainOffer.class)) {
                                return k27Var.v.toString();
                            }
                            TLRPC.Message message8 = k27Var.k;
                            TLRPC.MessageAction messageAction3 = message8.action;
                            if (messageAction3 instanceof TLRPC.TL_messageActionPhoneCall) {
                                return messageAction3.video ? k96.L0(2131752598) : k96.L0(2131752605);
                            }
                            if (messageAction3 instanceof TLRPC.TL_messageActionConferenceCall) {
                                return messageAction3.video ? k96.L0(2131752600) : k96.L0(2131752607);
                            }
                            if (messageAction3 instanceof TLRPC.TL_messageActionChatAddUser) {
                                long j6 = messageAction3.user_id;
                                if (j6 == 0 && messageAction3.users.size() == 1) {
                                    j6 = k27Var.k.action.users.get(0).longValue();
                                }
                                if (j6 == 0) {
                                    StringBuilder sb = new StringBuilder();
                                    for (int i2 = 0; i2 < k27Var.k.action.users.size(); i2++) {
                                        TLRPC.User V13 = getMessagesController().V1(k27Var.k.action.users.get(i2));
                                        if (V13 != null) {
                                            String q = l7c.q(V13);
                                            if (sb.length() != 0) {
                                                sb.append(", ");
                                            }
                                            sb.append(q);
                                        }
                                    }
                                    return k96.Z(2131747841, s, s(chat), sb.toString());
                                }
                                if (k27Var.k.peer_id.channel_id != 0 && !chat.megagroup) {
                                    return k96.Z(2131752509, s, s(chat));
                                }
                                if (j6 == j) {
                                    return k96.Z(2131747824, s, s(chat));
                                }
                                TLRPC.User V14 = getMessagesController().V1(Long.valueOf(j6));
                                if (V14 != null) {
                                    return j5 == V14.id ? chat.megagroup ? k96.Z(2131747839, s, s(chat)) : k96.Z(2131747840, s, s(chat)) : k96.Z(2131747841, s, s(chat), l7c.q(V14));
                                }
                            } else {
                                if (messageAction3 instanceof TLRPC.TL_messageActionGroupCall) {
                                    return messageAction3.duration != 0 ? k96.Z(2131747836, s, s(chat)) : k96.Z(2131747837, s, s(chat));
                                }
                                if (messageAction3 instanceof TLRPC.TL_messageActionGroupCallScheduled) {
                                    return k27Var.v.toString();
                                }
                                if (messageAction3 instanceof TLRPC.TL_messageActionInviteToGroupCall) {
                                    long j7 = messageAction3.user_id;
                                    if (j7 == 0 && messageAction3.users.size() == 1) {
                                        j7 = k27Var.k.action.users.get(0).longValue();
                                    }
                                    if (j7 == 0) {
                                        StringBuilder sb2 = new StringBuilder();
                                        for (int i3 = 0; i3 < k27Var.k.action.users.size(); i3++) {
                                            TLRPC.User V15 = getMessagesController().V1(k27Var.k.action.users.get(i3));
                                            if (V15 != null) {
                                                String q2 = l7c.q(V15);
                                                if (sb2.length() != 0) {
                                                    sb2.append(", ");
                                                }
                                                sb2.append(q2);
                                            }
                                        }
                                        return k96.Z(2131747833, s, s(chat), sb2.toString());
                                    }
                                    if (j7 == j) {
                                        return k96.Z(2131747832, s, s(chat));
                                    }
                                    TLRPC.User V16 = getMessagesController().V1(Long.valueOf(j7));
                                    if (V16 != null) {
                                        return k96.Z(2131747833, s, s(chat), l7c.q(V16));
                                    }
                                } else {
                                    if (messageAction3 instanceof TLRPC.TL_messageActionGiftCode) {
                                        return k96.L0(2131753307);
                                    }
                                    if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByLink) {
                                        return k96.Z(2131747823, s, s(chat));
                                    }
                                    if (messageAction3 instanceof TLRPC.TL_messageActionChatEditTitle) {
                                        return k96.Z(2131747851, s, messageAction3.title);
                                    }
                                    if ((messageAction3 instanceof TLRPC.TL_messageActionChatEditPhoto) || (messageAction3 instanceof TLRPC.TL_messageActionChatDeletePhoto)) {
                                        return (message8.peer_id.channel_id == 0 || chat.megagroup) ? k27Var.H4() ? k96.Z(2131747849, s, s(chat)) : k96.Z(2131747850, s, s(chat)) : k27Var.H4() ? k96.Z(2131752253, s(chat)) : k96.Z(2131752319, s(chat));
                                    }
                                    if (messageAction3 instanceof TLRPC.TL_messageActionChatDeleteUser) {
                                        long j8 = messageAction3.user_id;
                                        if (j8 == j) {
                                            return k96.Z(2131747830, s, s(chat));
                                        }
                                        if (j8 == j5) {
                                            return k96.Z(2131747829, s, s(chat));
                                        }
                                        TLRPC.User V17 = getMessagesController().V1(Long.valueOf(k27Var.k.action.user_id));
                                        if (V17 != null) {
                                            return k96.Z(2131747831, s, s(chat), l7c.q(V17));
                                        }
                                    } else {
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChatCreate) {
                                            return k27Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChannelCreate) {
                                            return k27Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChatMigrateTo) {
                                            return k96.Z(2131754599, s(chat));
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChannelMigrateFrom) {
                                            return k96.Z(2131754599, messageAction3.title);
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionScreenshotTaken) {
                                            return k27Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayLaunch) {
                                            return k27Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionGiveawayResults) {
                                            return k27Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionSuggestBirthday) {
                                            return k27Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionPinMessage) {
                                            if (chat == null) {
                                                k27 k27Var2 = k27Var.C;
                                                if (k27Var2 == null) {
                                                    return k96.Z(2131747894, s);
                                                }
                                                if (k27Var2.I3()) {
                                                    return k96.Z(2131747897, s);
                                                }
                                                if (k27Var2.G4()) {
                                                    if (TextUtils.isEmpty(k27Var2.k.message)) {
                                                        return k96.Z(2131747867, s);
                                                    }
                                                    return k96.Z(2131747873, s, "📹 " + k27Var2.k.message);
                                                }
                                                if (k27Var2.q3()) {
                                                    if (TextUtils.isEmpty(k27Var2.k.message)) {
                                                        return k96.Z(2131747903, s);
                                                    }
                                                    return k96.Z(2131747873, s, "🎬 " + k27Var2.k.message);
                                                }
                                                if (k27Var2.O4()) {
                                                    return k96.Z(2131747864, s);
                                                }
                                                if (k27Var2.g4()) {
                                                    return k96.Z(2131747882, s);
                                                }
                                                if (k27Var2.s4() || k27Var2.J2()) {
                                                    String V18 = k27Var2.V1();
                                                    return V18 != null ? k96.Z(2131747877, s, V18) : k96.Z(2131747876, s);
                                                }
                                                TLRPC.Message message9 = k27Var2.k;
                                                TLRPC.MessageMedia messageMedia3 = message9.media;
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaDocument) {
                                                    if (TextUtils.isEmpty(message9.message)) {
                                                        return k96.Z(2131747918, s);
                                                    }
                                                    return k96.Z(2131747873, s, "📎 " + k27Var2.k.message);
                                                }
                                                if ((messageMedia3 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia3 instanceof TLRPC.TL_messageMediaVenue)) {
                                                    return k96.Z(2131747906, s);
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaGeoLive) {
                                                    return k96.Z(2131747907, s);
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaContact) {
                                                    TLRPC.TL_messageMediaContact tL_messageMediaContact = (TLRPC.TL_messageMediaContact) messageMedia3;
                                                    return k96.Z(2131747921, s, qu2.n(tL_messageMediaContact.first_name, tL_messageMediaContact.last_name));
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaPoll) {
                                                    TLRPC.Poll poll = ((TLRPC.TL_messageMediaPoll) messageMedia3).poll;
                                                    boolean z6 = poll.quiz;
                                                    TLRPC.TL_textWithEntities tL_textWithEntities = poll.question;
                                                    return z6 ? k96.Z(2131747885, s, tL_textWithEntities.text) : k96.Z(2131747888, s, tL_textWithEntities.text);
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaToDo) {
                                                    return k96.Z(2131747870, s, ((TLRPC.TL_messageMediaToDo) messageMedia3).todo.title.text);
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaPhoto) {
                                                    if (TextUtils.isEmpty(message9.message)) {
                                                        return k96.Z(2131747891, s);
                                                    }
                                                    return k96.Z(2131747873, s, "🖼 " + k27Var2.k.message);
                                                }
                                                if (messageMedia3 instanceof TLRPC.TL_messageMediaGame) {
                                                    return k96.Z(2131747912, s);
                                                }
                                                CharSequence charSequence4 = k27Var2.v;
                                                if (charSequence4 == null || charSequence4.length() <= 0) {
                                                    return k96.Z(2131747894, s);
                                                }
                                                CharSequence charSequence5 = k27Var2.v;
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
                                                return k96.Z(2131747873, objArr2);
                                            }
                                            if (hc2.T(chat) && !chat.megagroup) {
                                                k27 k27Var3 = k27Var.C;
                                                if (k27Var3 == null) {
                                                    return k96.Z(2131747895, s(chat));
                                                }
                                                if (k27Var3.I3()) {
                                                    return k96.Z(2131747898, s(chat));
                                                }
                                                if (k27Var3.G4()) {
                                                    if (TextUtils.isEmpty(k27Var3.k.message)) {
                                                        return k96.Z(2131747868, s(chat));
                                                    }
                                                    return k96.Z(2131747874, s(chat), "📹 " + k27Var3.k.message);
                                                }
                                                if (k27Var3.q3()) {
                                                    if (TextUtils.isEmpty(k27Var3.k.message)) {
                                                        return k96.Z(2131747904, s(chat));
                                                    }
                                                    return k96.Z(2131747874, s(chat), "🎬 " + k27Var3.k.message);
                                                }
                                                if (k27Var3.O4()) {
                                                    return k96.Z(2131747865, s(chat));
                                                }
                                                if (k27Var3.g4()) {
                                                    return k96.Z(2131747883, s(chat));
                                                }
                                                if (k27Var3.s4() || k27Var3.J2()) {
                                                    String V19 = k27Var3.V1();
                                                    return V19 != null ? k96.Z(2131747878, s(chat), V19) : k96.Z(2131747880, s(chat));
                                                }
                                                TLRPC.Message message10 = k27Var3.k;
                                                TLRPC.MessageMedia messageMedia4 = message10.media;
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaDocument) {
                                                    if (TextUtils.isEmpty(message10.message)) {
                                                        return k96.Z(2131747919, s(chat));
                                                    }
                                                    return k96.Z(2131747874, s(chat), "📎 " + k27Var3.k.message);
                                                }
                                                if ((messageMedia4 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia4 instanceof TLRPC.TL_messageMediaVenue)) {
                                                    return k96.Z(2131747910, s(chat));
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaGeoLive) {
                                                    return k96.Z(2131747908, s(chat));
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaContact) {
                                                    TLRPC.TL_messageMediaContact tL_messageMediaContact2 = (TLRPC.TL_messageMediaContact) messageMedia4;
                                                    return k96.Z(2131747922, s(chat), qu2.n(tL_messageMediaContact2.first_name, tL_messageMediaContact2.last_name));
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaPoll) {
                                                    TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) messageMedia4;
                                                    return tL_messageMediaPoll.poll.quiz ? k96.Z(2131747886, s(chat), tL_messageMediaPoll.poll.question.text) : k96.Z(2131747889, s(chat), tL_messageMediaPoll.poll.question.text);
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaToDo) {
                                                    return k96.Z(2131747871, s(chat), ((TLRPC.TL_messageMediaToDo) messageMedia4).todo.title.text);
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaPhoto) {
                                                    if (TextUtils.isEmpty(message10.message)) {
                                                        return k96.Z(2131747892, s(chat));
                                                    }
                                                    return k96.Z(2131747874, s(chat), "🖼 " + k27Var3.k.message);
                                                }
                                                if (messageMedia4 instanceof TLRPC.TL_messageMediaGame) {
                                                    return k96.Z(2131747916, s(chat));
                                                }
                                                CharSequence charSequence6 = k27Var3.v;
                                                if (charSequence6 == null || charSequence6.length() <= 0) {
                                                    return k96.Z(2131747895, s(chat));
                                                }
                                                CharSequence charSequence7 = k27Var3.v;
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
                                                return k96.Z(2131747874, objArr3);
                                            }
                                            k27 k27Var4 = k27Var.C;
                                            if (k27Var4 == null) {
                                                return k96.Z(2131747896, s, s(chat));
                                            }
                                            if (k27Var4.I3()) {
                                                return k96.Z(2131747899, s, s(chat));
                                            }
                                            if (k27Var4.G4()) {
                                                if (TextUtils.isEmpty(k27Var4.k.message)) {
                                                    return k96.Z(2131747869, s, s(chat));
                                                }
                                                return k96.Z(2131747875, s, "📹 " + k27Var4.k.message, s(chat));
                                            }
                                            if (k27Var4.q3()) {
                                                if (TextUtils.isEmpty(k27Var4.k.message)) {
                                                    return k96.Z(2131747905, s, s(chat));
                                                }
                                                return k96.Z(2131747875, s, "🎬 " + k27Var4.k.message, s(chat));
                                            }
                                            if (k27Var4.O4()) {
                                                return k96.Z(2131747866, s, s(chat));
                                            }
                                            if (k27Var4.g4()) {
                                                return k96.Z(2131747884, s, s(chat));
                                            }
                                            if (k27Var4.s4() || k27Var4.J2()) {
                                                String V110 = k27Var4.V1();
                                                return V110 != null ? k96.Z(2131747879, s, s(chat), V110) : k96.Z(2131747881, s, s(chat));
                                            }
                                            TLRPC.Message message11 = k27Var4.k;
                                            TLRPC.MessageMedia messageMedia5 = message11.media;
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaDocument) {
                                                if (TextUtils.isEmpty(message11.message)) {
                                                    return k96.Z(2131747920, s, s(chat));
                                                }
                                                return k96.Z(2131747875, s, "📎 " + k27Var4.k.message, s(chat));
                                            }
                                            if ((messageMedia5 instanceof TLRPC.TL_messageMediaGeo) || (messageMedia5 instanceof TLRPC.TL_messageMediaVenue)) {
                                                return k96.Z(2131747911, s, s(chat));
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaGeoLive) {
                                                return k96.Z(2131747909, s, s(chat));
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaContact) {
                                                TLRPC.TL_messageMediaContact tL_messageMediaContact3 = (TLRPC.TL_messageMediaContact) messageMedia5;
                                                return k96.Z(2131747923, s, s(chat), qu2.n(tL_messageMediaContact3.first_name, tL_messageMediaContact3.last_name));
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaPoll) {
                                                TLRPC.TL_messageMediaPoll tL_messageMediaPoll2 = (TLRPC.TL_messageMediaPoll) messageMedia5;
                                                return tL_messageMediaPoll2.poll.quiz ? k96.Z(2131747887, s, s(chat), tL_messageMediaPoll2.poll.question.text) : k96.Z(2131747890, s, s(chat), tL_messageMediaPoll2.poll.question.text);
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaToDo) {
                                                return k96.Z(2131747872, s, s(chat), ((TLRPC.TL_messageMediaToDo) messageMedia5).todo.title.text);
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaPhoto) {
                                                if (TextUtils.isEmpty(message11.message)) {
                                                    return k96.Z(2131747893, s, s(chat));
                                                }
                                                return k96.Z(2131747875, s, "🖼 " + k27Var4.k.message, s(chat));
                                            }
                                            if (messageMedia5 instanceof TLRPC.TL_messageMediaGame) {
                                                return k96.Z(2131747917, s, s(chat));
                                            }
                                            CharSequence charSequence8 = k27Var4.v;
                                            if (charSequence8 == null || charSequence8.length() <= 0) {
                                                return k96.Z(2131747896, s, s(chat));
                                            }
                                            CharSequence charSequence9 = k27Var4.v;
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
                                            return k96.Z(2131747875, objArr4);
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionSetChatTheme) {
                                            String f = apb.f(((TLRPC.TL_messageActionSetChatTheme) messageAction3).theme);
                                            return TextUtils.isEmpty(f) ? j2 == j ? k96.Z(2131752189, new Object[0]) : k96.Z(2131752190, s, f) : j2 == j ? k96.Z(2131752192, f) : k96.Z(2131752193, s, f);
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionChatJoinedByRequest) {
                                            return k27Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionPrizeStars) {
                                            TLRPC.TL_messageActionPrizeStars tL_messageActionPrizeStars = (TLRPC.TL_messageActionPrizeStars) messageAction3;
                                            long n = cf3.n(tL_messageActionPrizeStars.boost_peer);
                                            if (n >= 0) {
                                                s2 = l7c.l(getMessagesController().V1(Long.valueOf(n)));
                                            } else {
                                                TLRPC.Chat K03 = getMessagesController().K0(Long.valueOf(-n));
                                                s2 = K03 != null ? s(K03) : "";
                                            }
                                            return k96.J((int) tL_messageActionPrizeStars.stars, "BoostingReceivedStars", s2);
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionPaymentRefunded) {
                                            return k27Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionTodoCompletions) {
                                            return k27Var.v.toString();
                                        }
                                        if (messageAction3 instanceof TLRPC.TL_messageActionTodoAppendTasks) {
                                            return k27Var.v.toString();
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                    zArr[z2 ? 1 : 0] = z2;
                    return k96.L0(2131748411);
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
    public final java.lang.String r(k27 r30, boolean[] r31) {
        /*
            Method dump skipped, instructions count: 6082
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im7.r(k27, boolean[]):java.lang.String");
    }

    public final String s(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        return chat.monoforum ? mm4.j(this.currentAccount, chat, false) : chat.title;
    }

    public final int t() {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            if (y6c.h(i2).o() && (gba.N0 || y6c.t0 == i2)) {
                im7 n = n(i2);
                if (n.S) {
                    boolean z = n.U;
                    boolean z2 = n.T;
                    if (z) {
                        if (z2) {
                            try {
                                ArrayList arrayList = new ArrayList(na7.q1(i2).y);
                                int size = arrayList.size();
                                for (int i3 = 0; i3 < size; i3++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i3);
                                    if (dialog != null && cf3.y(dialog.id)) {
                                        TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-dialog.id));
                                        if (!hc2.r0(K0)) {
                                            if (hc2.Y(K0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i += na7.q1(i2).T0(dialog);
                                    }
                                }
                            } catch (Exception e) {
                                fa4.g(e, true);
                            }
                        } else {
                            i += n.J;
                        }
                    } else if (z2) {
                        try {
                            int size2 = na7.q1(i2).y.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) na7.q1(i2).y.get(i4);
                                if (cf3.y(dialog2.id)) {
                                    TLRPC.Chat K02 = getMessagesController().K0(Long.valueOf(-dialog2.id));
                                    if (!hc2.r0(K02)) {
                                        if (hc2.Y(K02)) {
                                        }
                                    }
                                }
                                if (na7.q1(i2).T0(dialog2) != 0) {
                                    i++;
                                }
                            }
                        } catch (Exception e2) {
                            fa4.g(e2, false);
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
            k27 k27Var = (k27) arrayList.get(i);
            long B0 = k27.B0(k27Var.k);
            if (!k27Var.I) {
                TLRPC.Message message = k27Var.k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !cf3.B(B0) && ((k27Var.k.peer_id.channel_id == 0 || k27Var.z4()) && B0 != 489000 && B0 != 489001)) {
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
        } else if (!cf3.y(j)) {
            i = 1;
        } else if (bool == null) {
            TLRPC.Chat K0 = getMessagesController().K0(Long.valueOf(-j));
            if (hc2.T(K0)) {
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
            fa4.g(e, true);
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
                    String id = fi7.d(notificationChannels.get(i)).getId();
                    if (id.startsWith(str)) {
                        try {
                            n0.deleteNotificationChannel(id);
                        } catch (Exception e2) {
                            fa4.g(e2, true);
                        }
                        if (w01.a) {
                            fa4.b("delete channel cleanup " + id);
                        }
                    }
                }
            } catch (Throwable th) {
                fa4.g(th, true);
            }
        }
    }
}
