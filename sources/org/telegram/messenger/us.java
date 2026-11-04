package org.telegram.messenger;

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
import android.graphics.Color;
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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.LaunchActivity;
import org.webrtc.MediaStreamTrack;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class us extends c1 implements cs {
    public static String k0;
    public static e0.j0 m0;
    public static NotificationManager n0;
    public static AudioManager p0;
    public static volatile us[] q0;
    public static final Object[] r0;
    public static final a0.h s0;
    public final ArrayList E;
    public final a0.h F;
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
    public final is V;
    public final PowerManager.WakeLock W;
    public long X;
    public SoundPool Y;
    public int Z;
    public final ArrayList a;
    public int a0;
    public final ArrayList b;
    public boolean b0;
    public final a0.h c;
    public boolean c0;
    public final a0.h d;
    public final AlarmManager d0;
    public final a0.h e;
    public final int e0;
    public final a0.h f;
    public final String f0;
    public final yh.f g0;
    public final a0.h h;
    public final ws h0;
    public final char[] i0;
    public final is j0;
    public final a0.h n;
    public final a0.h r;
    public final HashSet s;
    public final ArrayList w;
    public ArrayList x;
    public final HashSet y;
    public static final p5 l0 = new p5("notificationsQueue");
    public static final long o0 = m5.F(1);

    static {
        m0 = null;
        n0 = null;
        if (Build.VERSION.SDK_INT >= 26 && t0.b != null) {
            m0 = new e0.j0(t0.b);
            n0 = (NotificationManager) t0.b.getSystemService("notification");
            i();
        }
        p0 = (AudioManager) t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        q0 = new us[4];
        r0 = new Object[4];
        for (int i3 = 0; i3 < 4; i3++) {
            r0[i3] = new Object();
        }
        s0 = new a0.h();
    }

    public us(int i3) {
        super(i3);
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new a0.h();
        this.d = new a0.h();
        this.e = new a0.h();
        this.f = new a0.h();
        this.h = new a0.h();
        this.n = new a0.h();
        this.r = new a0.h();
        this.s = new HashSet();
        this.w = new ArrayList();
        this.x = new ArrayList();
        this.y = new HashSet();
        this.E = new ArrayList();
        this.F = new a0.h();
        this.G = 0L;
        this.H = 0L;
        this.I = 5000;
        this.J = 0;
        this.K = 0;
        this.L = false;
        this.M = 0;
        this.O = -1;
        this.g0 = new yh.f();
        this.i0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.j0 = new is(this, 11);
        this.e0 = this.currentAccount + 1;
        StringBuilder sb2 = new StringBuilder("messages");
        int i10 = this.currentAccount;
        sb2.append(i10 == 0 ? "" : Integer.valueOf(i10));
        this.f0 = sb2.toString();
        SharedPreferences c2 = getAccountInstance().c();
        this.N = c2.getBoolean("EnableInChatSound", true);
        this.S = c2.getBoolean("badgeNumber", true);
        this.T = c2.getBoolean("badgeNumberMuted", false);
        this.U = c2.getBoolean("badgeNumberMessages", true);
        m0 = new e0.j0(t0.b);
        n0 = (NotificationManager) t0.b.getSystemService("notification");
        try {
            p0 = (AudioManager) t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        try {
            this.d0 = (AlarmManager) t0.b.getSystemService("alarm");
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) t0.b.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.W = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e12) {
            a8.g(e12, true);
        }
        this.V = new is(this, 12);
        this.h0 = new ws(this.currentAccount);
        g0.h3(new is(this, 13));
    }

    public static boolean E(zi ziVar) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = ziVar.k;
        TLRPC.Peer peer = message.peer_id;
        return (peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || ziVar.J;
    }

    public static Bitmap F(ArrayList arrayList) {
        int i3;
        Bitmap bitmap;
        Paint paint;
        boolean z10;
        float f10;
        char c2;
        float size;
        float size2;
        float f11;
        float f12;
        float f13;
        float f14;
        Object obj;
        ArrayList arrayList2 = arrayList;
        if (Build.VERSION.SDK_INT < 28 || arrayList2.size() == 0) {
            return null;
        }
        int L = g0.L(64.0f);
        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint2 = new Paint(3);
        boolean z11 = true;
        Paint paint3 = new Paint(1);
        Rect rect = new Rect();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        float f15 = arrayList2.size() == 1 ? 1.0f : arrayList2.size() == 2 ? 0.65f : 0.5f;
        int i10 = 0;
        TextPaint textPaint = null;
        while (i10 < arrayList2.size()) {
            float f16 = L;
            float f17 = (1.0f - f15) * f16;
            try {
                size = (f17 / arrayList2.size()) * ((arrayList2.size() - 1) - i10);
                size2 = i10 * (f17 / arrayList2.size());
                f11 = f16 * f15;
                f12 = f11 / 2.0f;
                i3 = L;
                f13 = size + f12;
                bitmap = createBitmap;
                f14 = size2 + f12;
                f10 = f15;
                try {
                    canvas.drawCircle(f13, f14, g0.L(2.0f) + f12, paint3);
                    obj = arrayList2.get(i10);
                    paint = paint3;
                } catch (Throwable unused) {
                    paint = paint3;
                }
            } catch (Throwable unused2) {
                i3 = L;
                bitmap = createBitmap;
                paint = paint3;
                z10 = z11;
                f10 = f15;
            }
            if (obj instanceof File) {
                String absolutePath = ((File) arrayList2.get(i10)).getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                z10 = true;
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(absolutePath, options);
                    int i11 = (int) f11;
                    options.inSampleSize = gi.f7.d(options, i11, i11);
                    try {
                        options.inJustDecodeBounds = false;
                        options.inDither = true;
                        Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                        matrix.reset();
                        matrix.postScale(f11 / decodeFile.getWidth(), f11 / decodeFile.getHeight());
                        matrix.postTranslate(size, size2);
                        bitmapShader.setLocalMatrix(matrix);
                        paint2.setShader(bitmapShader);
                        canvas.drawCircle(f13, f14, f12, paint2);
                        decodeFile.recycle();
                    } catch (Throwable unused3) {
                        c2 = 2;
                    }
                } catch (Throwable unused4) {
                    c2 = 2;
                    i10++;
                    z11 = z10;
                    L = i3;
                    createBitmap = bitmap;
                    f15 = f10;
                    paint3 = paint;
                    arrayList2 = arrayList;
                }
            } else if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                c2 = 2;
                try {
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f11, new int[]{org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.p8[org.telegram.ui.Components.u8.e(user.id)], false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q8[org.telegram.ui.Components.u8.e(user.id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawCircle(f13, f14, f12, paint2);
                    if (textPaint == null) {
                        try {
                            z10 = true;
                            try {
                                TextPaint textPaint2 = new TextPaint(1);
                                try {
                                    textPaint2.setTypeface(g0.o());
                                    textPaint2.setTextSize(f16 * 0.25f);
                                    textPaint2.setColor(-1);
                                    textPaint = textPaint2;
                                } catch (Throwable unused5) {
                                    textPaint = textPaint2;
                                    i10++;
                                    z11 = z10;
                                    L = i3;
                                    createBitmap = bitmap;
                                    f15 = f10;
                                    paint3 = paint;
                                    arrayList2 = arrayList;
                                }
                            } catch (Throwable unused6) {
                            }
                        } catch (Throwable unused7) {
                            z10 = true;
                        }
                    } else {
                        z10 = true;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    org.telegram.ui.Components.u8.a(user.first_name, user.last_name, null, sb2);
                    String sb3 = sb2.toString();
                    try {
                        textPaint.getTextBounds(sb3, 0, sb3.length(), rect);
                        canvas.drawText(sb3, (f13 - (rect.width() / 2.0f)) - rect.left, (f14 - (rect.height() / 2.0f)) - rect.top, textPaint);
                    } catch (Throwable unused8) {
                    }
                } catch (Throwable unused9) {
                }
                i10++;
                z11 = z10;
                L = i3;
                createBitmap = bitmap;
                f15 = f10;
                paint3 = paint;
                arrayList2 = arrayList;
            }
            c2 = 2;
            z10 = true;
            i10++;
            z11 = z10;
            L = i3;
            createBitmap = bitmap;
            f15 = f10;
            paint3 = paint;
            arrayList2 = arrayList;
        }
        return createBitmap;
    }

    public static void W(Notification notification, e0.q qVar, boolean z10) {
        if (z10) {
            qVar.y = k0;
        } else {
            qVar.y = notification.getChannelId();
        }
    }

    public static void a(us usVar, String str, long j10) {
        boolean z10;
        String M0;
        if (usVar.getUserConfig().p()) {
            if (az.Q0 || usVar.currentAccount == h10.t0) {
                try {
                    String str2 = "wallet_tonconnect_" + usVar.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        n0.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    boolean z11 = false;
                    if (!g0.p2(false) && !az.C && usVar.getAccountInstance().c().getBoolean("EnablePreviewAll", true)) {
                        z10 = false;
                        if (!TextUtils.isEmpty(str) && !z10) {
                            M0 = bd.a0(null, null, 2131747933, str);
                            Intent intent = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                            intent.putExtra("currentAccount", usVar.currentAccount);
                            intent.addFlags(67108864);
                            PendingIntent activity = PendingIntent.getActivity(t0.b, usVar.currentAccount, intent, 201326592);
                            e0.q qVar = new e0.q(t0.b, str2);
                            qVar.F.icon = R.drawable.notification;
                            qVar.e = e0.q.d(bd.M0(R.string.AppName, null));
                            qVar.f = e0.q.d(M0);
                            e0.l lVar = new e0.l(z11);
                            lVar.f = e0.q.d(M0);
                            qVar.n(lVar);
                            qVar.u = "event";
                            qVar.x = 0;
                            qVar.F.when = j10;
                            qVar.h(16, true);
                            qVar.g = activity;
                            m0.e("wallet_tonconnect", usVar.currentAccount, qVar.b());
                        }
                        M0 = bd.M0(2131747934, null);
                        Intent intent2 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent2.putExtra("currentAccount", usVar.currentAccount);
                        intent2.addFlags(67108864);
                        PendingIntent activity2 = PendingIntent.getActivity(t0.b, usVar.currentAccount, intent2, 201326592);
                        e0.q qVar2 = new e0.q(t0.b, str2);
                        qVar2.F.icon = R.drawable.notification;
                        qVar2.e = e0.q.d(bd.M0(R.string.AppName, null));
                        qVar2.f = e0.q.d(M0);
                        e0.l lVar2 = new e0.l(z11);
                        lVar2.f = e0.q.d(M0);
                        qVar2.n(lVar2);
                        qVar2.u = "event";
                        qVar2.x = 0;
                        qVar2.F.when = j10;
                        qVar2.h(16, true);
                        qVar2.g = activity2;
                        m0.e("wallet_tonconnect", usVar.currentAccount, qVar2.b());
                    }
                    z10 = true;
                    if (!TextUtils.isEmpty(str)) {
                        M0 = bd.a0(null, null, 2131747933, str);
                        Intent intent22 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                        intent22.setAction("android.intent.action.VIEW");
                        intent22.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent22.putExtra("currentAccount", usVar.currentAccount);
                        intent22.addFlags(67108864);
                        PendingIntent activity22 = PendingIntent.getActivity(t0.b, usVar.currentAccount, intent22, 201326592);
                        e0.q qVar22 = new e0.q(t0.b, str2);
                        qVar22.F.icon = R.drawable.notification;
                        qVar22.e = e0.q.d(bd.M0(R.string.AppName, null));
                        qVar22.f = e0.q.d(M0);
                        e0.l lVar22 = new e0.l(z11);
                        lVar22.f = e0.q.d(M0);
                        qVar22.n(lVar22);
                        qVar22.u = "event";
                        qVar22.x = 0;
                        qVar22.F.when = j10;
                        qVar22.h(16, true);
                        qVar22.g = activity22;
                        m0.e("wallet_tonconnect", usVar.currentAccount, qVar22.b());
                    }
                    M0 = bd.M0(2131747934, null);
                    Intent intent222 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                    intent222.setAction("android.intent.action.VIEW");
                    intent222.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent222.putExtra("currentAccount", usVar.currentAccount);
                    intent222.addFlags(67108864);
                    PendingIntent activity222 = PendingIntent.getActivity(t0.b, usVar.currentAccount, intent222, 201326592);
                    e0.q qVar222 = new e0.q(t0.b, str2);
                    qVar222.F.icon = R.drawable.notification;
                    qVar222.e = e0.q.d(bd.M0(R.string.AppName, null));
                    qVar222.f = e0.q.d(M0);
                    e0.l lVar222 = new e0.l(z11);
                    lVar222.f = e0.q.d(M0);
                    qVar222.n(lVar222);
                    qVar222.u = "event";
                    qVar222.x = 0;
                    qVar222.F.when = j10;
                    qVar222.h(16, true);
                    qVar222.g = activity222;
                    m0.e("wallet_tonconnect", usVar.currentAccount, qVar222.b());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void b(us usVar) {
        try {
            SharedPreferences c2 = usVar.getAccountInstance().c();
            Map<String, ?> all = c2.getAll();
            SharedPreferences.Editor edit = c2.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        n0.deleteNotificationChannel(str);
                        if (r2.a) {
                            a8.b("delete all channel " + str);
                        }
                    }
                    edit.remove(key);
                }
            }
            edit.commit();
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public static void c(us usVar) {
        PowerManager.WakeLock wakeLock = usVar.W;
        m0.b(usVar.currentAccount, "wallet_tonconnect");
        usVar.G = 0L;
        usVar.H = 0L;
        usVar.J = 0;
        usVar.K = 0;
        usVar.a.clear();
        usVar.c.b();
        usVar.d.b();
        usVar.f.b();
        usVar.h.b();
        usVar.n.b();
        usVar.y.clear();
        usVar.b.clear();
        usVar.L = false;
        usVar.O = 0;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        usVar.p();
        usVar.S(usVar.z());
        SharedPreferences.Editor edit = usVar.getAccountInstance().c().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                n0.deleteNotificationChannelGroup("channels" + usVar.currentAccount);
                n0.deleteNotificationChannelGroup("groups" + usVar.currentAccount);
                n0.deleteNotificationChannelGroup("private" + usVar.currentAccount);
                n0.deleteNotificationChannelGroup("stories" + usVar.currentAccount);
                n0.deleteNotificationChannelGroup("other" + usVar.currentAccount);
                String str = usVar.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = n0.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i3 = 0; i3 < size; i3++) {
                    String id2 = notificationChannels.get(i3).getId();
                    if (id2.startsWith(str)) {
                        try {
                            n0.deleteNotificationChannel(id2);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        if (r2.a) {
                            a8.b("delete channel cleanup " + id2);
                        }
                    }
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b9, code lost:
    
        if (org.telegram.messenger.us.p0.getRingerMode() == 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if ((r12 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(us usVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        int i3;
        Integer num;
        long j10;
        int i10;
        boolean z13;
        long j11;
        boolean z14;
        long j12;
        long j13;
        String str;
        long j14;
        String str2;
        SharedPreferences sharedPreferences;
        String str3;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        boolean z15;
        long j20;
        zi ziVar;
        us usVar2;
        SparseArray sparseArray;
        zi ziVar2;
        us usVar3 = usVar;
        a0.h hVar = new a0.h();
        SharedPreferences c2 = usVar3.getAccountInstance().c();
        boolean z16 = true;
        boolean z17 = c2.getBoolean("PinnedMessages", true);
        int i11 = 0;
        boolean z18 = false;
        int i12 = 0;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        while (i11 < arrayList.size()) {
            zi ziVar3 = (zi) arrayList.get(i11);
            if (ziVar3.k != null) {
                if (!ziVar3.z3()) {
                    TLRPC.Message message = ziVar3.k;
                    TLRPC.MessageAction messageAction = message.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL)) {
                        if (message.silent) {
                            if (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp)) {
                            }
                        }
                    }
                }
                if (r2.a) {
                    a8.b("skipped message because 1");
                }
                i10 = i11;
                z14 = z18;
                usVar2 = usVar3;
                z18 = z14;
                i11 = i10 + 1;
                usVar3 = usVar2;
                z16 = true;
            }
            if (!zi.F4(ziVar3)) {
                if (ziVar3.K) {
                    long currentTimeMillis = ziVar3.k == null ? System.currentTimeMillis() : r5.date * 1000;
                    long B0 = zi.B0(ziVar3.k);
                    int f12 = ziVar3.f1();
                    ts tsVar = (ts) usVar3.F.f(B0);
                    if (tsVar != null) {
                        tsVar.c.put(Integer.valueOf(f12), new Pair(Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis + 86400000)));
                        boolean z22 = tsVar.d;
                        boolean z23 = ziVar3.M;
                        if (z22 != z23) {
                            tsVar.d = z23;
                            z21 = z16;
                        }
                        tsVar.e = tsVar.a();
                        qr messagesStorage = usVar3.getMessagesStorage();
                        messagesStorage.a.c(new pq(5, messagesStorage, tsVar));
                        z19 = z16;
                    } else {
                        ts tsVar2 = new ts(ziVar3.b, B0, f12, currentTimeMillis, currentTimeMillis + 86400000);
                        tsVar2.d = ziVar3.M;
                        usVar3.E.add(tsVar2);
                        usVar3.F.k(tsVar2, B0);
                        qr messagesStorage2 = usVar3.getMessagesStorage();
                        messagesStorage2.a.c(new pq(5, messagesStorage2, tsVar2));
                        z18 = z16;
                        z21 = z18;
                    }
                    Collections.sort(usVar3.E, Comparator$-CC.comparingLong(new ik(1)));
                    usVar2 = usVar3;
                    i10 = i11;
                    i11 = i10 + 1;
                    usVar3 = usVar2;
                    z16 = true;
                } else {
                    if (ziVar3.O) {
                        TLRPC.Message message2 = ziVar3.k;
                        if (message2 != null) {
                            int i13 = message2.id;
                            long j21 = message2.date + 60;
                            long currentTime = ConnectionsManager.getInstance(usVar3.currentAccount).getCurrentTime();
                            if (currentTime <= j21) {
                                g0.i3(new os(usVar3, i13, 6), (j21 - currentTime) * 1000);
                            }
                        }
                        i10 = i11;
                        z14 = z18;
                        usVar2 = usVar3;
                        z18 = z14;
                        i11 = i10 + 1;
                        usVar3 = usVar2;
                        z16 = true;
                    }
                    int f13 = ziVar3.f1();
                    long j22 = ziVar3.j3() ? ziVar3.k.random_id : 0L;
                    long B02 = zi.B0(ziVar3.k);
                    if (ziVar3.j3()) {
                        j10 = 0;
                        z13 = ziVar3.f;
                        i10 = i11;
                    } else {
                        j10 = 0;
                        if (m5.z(B02)) {
                            i10 = i11;
                            TLRPC.Chat M0 = usVar3.getMessagesController().M0(Long.valueOf(-B02));
                            z13 = t3.T(M0) && !M0.megagroup;
                        } else {
                            i10 = i11;
                            z13 = false;
                        }
                    }
                    if (ziVar3.J) {
                        j11 = zi.B0(ziVar3.k);
                    } else {
                        long j23 = ziVar3.k.peer_id.channel_id;
                        j11 = j23 != j10 ? -j23 : j10;
                    }
                    SparseArray sparseArray2 = (SparseArray) usVar3.c.f(j11);
                    zi ziVar4 = sparseArray2 != null ? (zi) sparseArray2.get(f13) : null;
                    z14 = z18;
                    if (ziVar4 == null) {
                        j12 = B02;
                        long j24 = ziVar3.k.random_id;
                        if (j24 != j10 && (ziVar4 = (zi) usVar3.d.f(j24)) != null) {
                            usVar3.d.l(ziVar3.k.random_id);
                        }
                    } else {
                        j12 = B02;
                    }
                    zi ziVar5 = ziVar4;
                    if (ziVar5 != null) {
                        if (ziVar5.j3()) {
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                usVar3.c.k(sparseArray2, j11);
                            }
                            sparseArray2.put(f13, ziVar3);
                            int indexOf = usVar3.a.indexOf(ziVar5);
                            if (indexOf >= 0) {
                                usVar3.a.set(indexOf, ziVar3);
                                boolean z24 = z13;
                                ziVar2 = ziVar3;
                                i12 = g(arrayList2, ziVar2, j12, z24, c2);
                            } else {
                                ziVar2 = ziVar3;
                            }
                            if (z10) {
                                boolean z25 = ziVar2.i;
                                if (z25) {
                                    qr messagesStorage3 = usVar3.getMessagesStorage();
                                    messagesStorage3.a.c(new b4(10, messagesStorage3, ziVar2));
                                }
                                z19 = z25;
                            }
                        }
                        if (r2.a) {
                            a8.b("skipped message because old message with same dialog and message ids exist: did=" + j11 + ", mid=" + f13);
                        }
                    } else {
                        boolean z26 = z13;
                        if (!z19) {
                            if (!z10 || ziVar3.O) {
                                j13 = j11;
                            } else {
                                qr messagesStorage4 = usVar3.getMessagesStorage();
                                j13 = j11;
                                messagesStorage4.a.c(new b4(10, messagesStorage4, ziVar3));
                            }
                            long c22 = zi.c2(usVar3.currentAccount, ziVar3.k, usVar3.getMessagesController().u2(ziVar3), false);
                            if (j12 != usVar3.G || !t0.w || ziVar3.J || ziVar3.O) {
                                TLRPC.Message message3 = ziVar3.k;
                                if (!message3.mentioned) {
                                    str = ")";
                                    j14 = j12;
                                } else if (z17 || !(message3.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                    str = ")";
                                    j14 = ziVar3.Z0();
                                } else if (r2.a) {
                                    a8.b("skipped message because message is mention of pinned");
                                }
                                if (E(ziVar3)) {
                                    str2 = str;
                                    usVar3.K++;
                                } else {
                                    str2 = str;
                                }
                                int h = hVar.h(j14);
                                if (h < 0 || c22 != j10) {
                                    int u10 = usVar3.u(j14, c22);
                                    if (u10 == -1) {
                                        long j25 = j14;
                                        String str4 = str2;
                                        sharedPreferences = c2;
                                        str3 = str4;
                                        j15 = c22;
                                        j17 = j22;
                                        j18 = j12;
                                        j19 = j13;
                                        j16 = j25;
                                        boolean D = usVar.D(j16, Boolean.valueOf(z26), ziVar3.I, ziVar3.J);
                                        if (r2.a) {
                                            a8.b("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + j16 + ", " + z26 + ", " + ziVar3.I + ", " + ziVar3.J + ") = " + D);
                                        }
                                        z15 = D;
                                    } else {
                                        String str5 = str2;
                                        sharedPreferences = c2;
                                        str3 = str5;
                                        j15 = c22;
                                        j16 = j14;
                                        j17 = j22;
                                        j18 = j12;
                                        j19 = j13;
                                        z15 = u10 != 2;
                                    }
                                    hVar.k(Boolean.valueOf(z15), j16);
                                } else {
                                    z15 = ((Boolean) hVar.n(h)).booleanValue();
                                    String str6 = str2;
                                    sharedPreferences = c2;
                                    str3 = str6;
                                    j15 = c22;
                                    j16 = j14;
                                    j17 = j22;
                                    j18 = j12;
                                    j19 = j13;
                                }
                                if (r2.a) {
                                    a8.b("NotificationsController: process new messages, value is " + z15 + " (" + j16 + ", " + z26 + ", " + ziVar3.I + ", " + ziVar3.J + str3);
                                }
                                if (z15) {
                                    if (z10) {
                                        j20 = j16;
                                        ziVar = ziVar3;
                                        c2 = sharedPreferences;
                                        usVar2 = usVar;
                                    } else {
                                        long j26 = j16;
                                        ziVar = ziVar3;
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        usVar2 = usVar;
                                        i12 = g(arrayList2, ziVar, j26, z26, sharedPreferences2);
                                        j20 = j26;
                                        c2 = sharedPreferences2;
                                    }
                                    if (!z20) {
                                        z20 = ziVar.k.from_scheduled;
                                    }
                                    usVar2.b.add(ziVar);
                                    usVar2.h(ziVar);
                                    if (f13 != 0) {
                                        if (sparseArray2 == null) {
                                            sparseArray = new SparseArray();
                                            usVar2.c.k(sparseArray, j19);
                                        } else {
                                            sparseArray = sparseArray2;
                                        }
                                        sparseArray.put(f13, ziVar);
                                    } else if (j17 != j10) {
                                        usVar2.d.k(ziVar, j17);
                                    }
                                    long j27 = j18;
                                    if (j27 != j20) {
                                        Integer num2 = (Integer) usVar2.r.f(j27);
                                        usVar2.r.k(Integer.valueOf(num2 == null ? 1 : num2.intValue() + 1), j27);
                                    }
                                } else {
                                    j20 = j16;
                                    ziVar = ziVar3;
                                    c2 = sharedPreferences;
                                    usVar2 = usVar;
                                }
                                if (ziVar.I) {
                                    SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                    sparseBooleanArray.put(f13, true);
                                    usVar2.getMessagesController().P(j20, j15, sparseBooleanArray, true);
                                }
                                z18 = true;
                                i11 = i10 + 1;
                                usVar3 = usVar2;
                                z16 = true;
                            } else {
                                if (!z10 && usVar3.N && !MediaController.B().J()) {
                                    try {
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                }
                                if (r2.a) {
                                    a8.b("skipped message because chat is already opened (openedDialogId = " + usVar3.G + ")");
                                }
                            }
                        } else if (r2.a) {
                            a8.b("skipped message because edited");
                        }
                    }
                    usVar2 = usVar3;
                    z18 = z14;
                    i11 = i10 + 1;
                    usVar3 = usVar2;
                    z16 = true;
                }
            }
            if (r2.a) {
            }
            i10 = i11;
            z14 = z18;
            usVar2 = usVar3;
            z18 = z14;
            i11 = i10 + 1;
            usVar3 = usVar2;
            z16 = true;
        }
        us usVar4 = usVar3;
        boolean z27 = z18;
        if (z27) {
            usVar4.L = z11;
        }
        if (!arrayList2.isEmpty() && !g0.p2(false) && !az.C) {
            g0.h3(new k7(usVar4, arrayList2, i12, 20));
        }
        if (z10 || z20) {
            if (z19) {
                if (r2.a) {
                    a8.b("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + usVar4.L);
                }
                usVar4.b.clear();
                usVar4.Z(usVar4.L);
            } else if (z27) {
                if (r2.a) {
                    a8.b("NotificationsController processNewMessages: added branch");
                }
                zi ziVar6 = (zi) arrayList.get(0);
                long B03 = zi.B0(ziVar6.k);
                long c23 = zi.c2(usVar4.currentAccount, ziVar6.k, usVar4.getMessagesController().t2(B03), false);
                Boolean valueOf = ziVar6.j3() ? Boolean.valueOf(ziVar6.f) : null;
                int i14 = usVar4.J;
                int u11 = usVar4.u(B03, c23);
                boolean D2 = u11 == -1 ? usVar4.D(B03, valueOf, ziVar6.I, ziVar6.J) : u11 != 2;
                Integer num3 = (Integer) usVar4.f.f(B03);
                if (num3 != null) {
                    z12 = true;
                    i3 = num3.intValue() + 1;
                } else {
                    z12 = true;
                    i3 = 1;
                }
                if (usVar4.L && !D2 && (num = (Integer) usVar4.r.f(B03)) != null && num.intValue() != 0) {
                    i3 = num.intValue();
                    D2 = z12;
                }
                if (D2 && !ziVar6.K) {
                    if (!usVar4.getMessagesController().p2(B03)) {
                        if (usVar4.getMessagesController().t2(B03)) {
                            int i15 = usVar4.J - ((num3 == null || num3.intValue() <= 0) ? 0 : z12);
                            usVar4.J = i15;
                            usVar4.J = i15 + (i3 > 0 ? z12 : 0);
                        } else {
                            if (num3 != null) {
                                usVar4.J -= num3.intValue();
                            }
                            usVar4.J += i3;
                        }
                    }
                    usVar4.f.k(Integer.valueOf(i3), B03);
                }
                if (i14 != usVar4.J || z21) {
                    usVar4.b.clear();
                    if (r2.a) {
                        a8.b("NotificationsController processNewMessages: added branch: " + usVar4.L);
                    }
                    usVar4.Z(usVar4.L);
                    g0.h3(new os(usVar4, usVar4.f.m(), 0));
                }
                usVar4.L = false;
                if (usVar4.S) {
                    usVar4.S(usVar4.z());
                }
            }
        }
        if (z21) {
            usVar4.d0();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
            return;
        }
        return;
        try {
            usVar3.getAccountInstance().c();
            if (usVar3.u(usVar3.G, usVar3.H) != 2) {
                l0.c(new is(usVar3, 8));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        if (r2.a) {
        }
        usVar2 = usVar3;
        z18 = z14;
        i11 = i10 + 1;
        usVar3 = usVar2;
        z16 = true;
    }

    public static void f(us usVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        long j10;
        boolean z10;
        long j11;
        boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j12;
        TLRPC.Message message;
        long j13;
        TLRPC.Message message2;
        SparseArray sparseArray;
        zi ziVar;
        long j14;
        boolean z11;
        SparseArray sparseArray2;
        usVar.f.b();
        usVar.a.clear();
        usVar.c.b();
        usVar.E.clear();
        usVar.F.b();
        usVar.J = 0;
        usVar.K = 0;
        usVar.getAccountInstance().c();
        a0.h hVar2 = new a0.h();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i3);
            if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                TLRPC.MessageAction messageAction = message3.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                    long j15 = message3.peer_id.channel_id;
                    long j16 = j15 != 0 ? -j15 : 0L;
                    SparseArray sparseArray3 = (SparseArray) usVar.c.f(j16);
                    if (sparseArray3 == null || sparseArray3.indexOfKey(message3.id) < 0) {
                        zi ziVar2 = new zi(usVar.currentAccount, message3, false, false);
                        if (E(ziVar2)) {
                            usVar.K++;
                        }
                        long B0 = zi.B0(ziVar2.k);
                        long c2 = zi.c2(usVar.currentAccount, ziVar2.k, usVar.getMessagesController().u2(ziVar2), false);
                        if (ziVar2.k.mentioned) {
                            message = message3;
                            j13 = ziVar2.Z0();
                            j12 = j16;
                        } else {
                            j12 = j16;
                            message = message3;
                            j13 = B0;
                        }
                        int h = hVar2.h(j13);
                        if (h < 0 || c2 != 0) {
                            int u10 = usVar.u(j13, c2);
                            if (u10 == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j14 = j12;
                                z11 = usVar.D(j13, null, ziVar2.I, ziVar2.J);
                                ziVar = ziVar2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                ziVar = ziVar2;
                                j14 = j12;
                                z11 = u10 != 2;
                            }
                            hVar2.k(Boolean.valueOf(z11), j13);
                        } else {
                            z11 = ((Boolean) hVar2.n(h)).booleanValue();
                            message2 = message;
                            sparseArray = sparseArray3;
                            ziVar = ziVar2;
                            j14 = j12;
                        }
                        if (z11 && (j13 != usVar.G || !t0.w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                usVar.c.k(sparseArray2, j14);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.id, ziVar);
                            usVar.h(ziVar);
                            if (B0 != j13) {
                                Integer num = (Integer) usVar.r.f(B0);
                                usVar.r.k(Integer.valueOf(num == null ? 1 : num.intValue() + 1), B0);
                            }
                        }
                    }
                }
            }
        }
        long j17 = 0;
        int i10 = 0;
        while (i10 < hVar.m()) {
            long j18 = hVar.j(i10);
            int h7 = hVar2.h(j18);
            if (h7 >= 0) {
                D = ((Boolean) hVar2.n(h7)).booleanValue();
            } else {
                int u11 = usVar.u(j18, j17);
                D = u11 == -1 ? usVar.D(j18, null, false, false) : u11 != 2;
                hVar2.k(Boolean.valueOf(D), j18);
            }
            if (D) {
                Integer num2 = (Integer) hVar.n(i10);
                int intValue = num2.intValue();
                usVar.f.k(num2, j18);
                if (!usVar.getMessagesController().p2(j18)) {
                    if (usVar.getMessagesController().t2(j18)) {
                        usVar.J += intValue > 0 ? 1 : 0;
                    } else {
                        usVar.J += intValue;
                    }
                }
            }
            i10++;
            j17 = 0;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            zi ziVar3 = (zi) arrayList2.get(i11);
            int f12 = ziVar3.f1();
            if (usVar.c.h(f12) < 0) {
                if (E(ziVar3)) {
                    usVar.K++;
                }
                long B02 = zi.B0(ziVar3.k);
                long c22 = zi.c2(usVar.currentAccount, ziVar3.k, usVar.getMessagesController().u2(ziVar3), false);
                TLRPC.Message message4 = ziVar3.k;
                long j19 = message4.random_id;
                long Z0 = message4.mentioned ? ziVar3.Z0() : B02;
                int h10 = hVar2.h(Z0);
                if (h10 < 0 || c22 != 0) {
                    int u12 = usVar.u(Z0, c22);
                    if (u12 == -1) {
                        j10 = Z0;
                        z10 = usVar.D(j10, null, ziVar3.I, ziVar3.J);
                    } else {
                        j10 = Z0;
                        z10 = u12 != 2;
                    }
                    hVar2.k(Boolean.valueOf(z10), j10);
                } else {
                    long j20 = Z0;
                    z10 = ((Boolean) hVar2.n(h10)).booleanValue();
                    j10 = j20;
                }
                if (z10 && (j10 != usVar.G || !t0.w)) {
                    if (f12 != 0) {
                        if (ziVar3.J) {
                            j11 = zi.B0(ziVar3.k);
                        } else {
                            long j21 = ziVar3.k.peer_id.channel_id;
                            j11 = j21 != 0 ? -j21 : 0L;
                        }
                        SparseArray sparseArray4 = (SparseArray) usVar.c.f(j11);
                        if (sparseArray4 == null) {
                            sparseArray4 = new SparseArray();
                            usVar.c.k(sparseArray4, j11);
                        }
                        sparseArray4.put(f12, ziVar3);
                    } else if (j19 != 0) {
                        usVar.d.k(ziVar3, j19);
                    }
                    usVar.h(ziVar3);
                    if (B02 != j10) {
                        Integer num3 = (Integer) usVar.r.f(B02);
                        usVar.r.k(Integer.valueOf(num3 == null ? 1 : num3.intValue() + 1), B02);
                    }
                    Integer num4 = (Integer) usVar.f.f(j10);
                    int intValue2 = num4 != null ? num4.intValue() + 1 : 1;
                    if (!usVar.getMessagesController().p2(j10)) {
                        if (usVar.getMessagesController().t2(j10)) {
                            if (num4 != null) {
                                usVar.J -= num4.intValue() > 0 ? 1 : 0;
                            }
                            usVar.J += intValue2 > 0 ? 1 : 0;
                        } else {
                            if (num4 != null) {
                                usVar.J -= num4.intValue();
                            }
                            usVar.J += intValue2;
                        }
                    }
                    usVar.f.k(Integer.valueOf(intValue2), j10);
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ts tsVar = (ts) it.next();
                long j22 = tsVar.a;
                ts tsVar2 = (ts) usVar.F.f(j22);
                if (tsVar2 != null) {
                    tsVar2.c.putAll(tsVar.c);
                } else {
                    usVar.E.add(tsVar);
                    usVar.F.k(tsVar, j22);
                }
            }
            Collections.sort(usVar.E, Comparator$-CC.comparingLong(new ik(2)));
        }
        g0.h3(new os(usVar, usVar.f.m(), 4));
        usVar.Z(SystemClock.elapsedRealtime() / 1000 < 60);
        if (usVar.S) {
            usVar.S(usVar.z());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0 == 2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(ArrayList arrayList, zi ziVar, long j10, boolean z10, SharedPreferences sharedPreferences) {
        int i3;
        if (ziVar.J) {
            return 0;
        }
        if (!m5.C(j10)) {
            if (k5.w("custom_", j10, sharedPreferences, false)) {
                i3 = sharedPreferences.getInt("popup_" + j10, 0);
            } else {
                i3 = 0;
            }
            if (i3 == 0) {
                if (z10) {
                    i3 = sharedPreferences.getInt("popupChannel", 0);
                } else {
                    i3 = sharedPreferences.getInt(m5.z(j10) ? "popupGroup" : "popupAll", 0);
                }
            } else if (i3 == 1) {
                i3 = 3;
            }
            if (i3 != 0 && ziVar.k.peer_id.channel_id != 0 && !ziVar.B4()) {
                i3 = 0;
            }
            if (i3 != 0) {
                arrayList.add(0, ziVar);
            }
            return i3;
        }
        i3 = 0;
        if (i3 != 0) {
            i3 = 0;
        }
        if (i3 != 0) {
        }
        return i3;
    }

    public static void i() {
        SharedPreferences sharedPreferences;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (k0 == null) {
            sharedPreferences = t0.b.getSharedPreferences("Notifications", 0);
            k0 = sharedPreferences.getString("OtherKey", "Other3");
        } else {
            sharedPreferences = null;
        }
        NotificationChannel notificationChannel = n0.getNotificationChannel(k0);
        if (notificationChannel != null && notificationChannel.getImportance() == 0) {
            try {
                n0.deleteNotificationChannel(k0);
            } catch (Exception e10) {
                a8.g(e10, true);
            }
            k0 = null;
            notificationChannel = null;
        }
        if (k0 == null) {
            if (sharedPreferences == null) {
                sharedPreferences = t0.b.getSharedPreferences("Notifications", 0);
            }
            k0 = "Other" + Utilities.b.nextLong();
            sharedPreferences.edit().putString("OtherKey", k0).commit();
        }
        String M0 = bd.M0(2131749197, null);
        if (notificationChannel != null && !TextUtils.equals(notificationChannel.getName(), M0)) {
            notificationChannel.setName(M0);
            try {
                n0.createNotificationChannel(notificationChannel);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        if (notificationChannel == null) {
            NotificationChannel notificationChannel2 = new NotificationChannel(k0, M0, 3);
            notificationChannel2.enableLights(false);
            notificationChannel2.enableVibration(false);
            notificationChannel2.setSound(null, null);
            try {
                n0.createNotificationChannel(notificationChannel2);
            } catch (Exception e12) {
                a8.g(e12, true);
            }
        }
    }

    public static String k(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(32);
        if (indexOf < 0) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, indexOf));
        sb2.append(str.endsWith("…") ? "…" : "");
        return sb2.toString();
    }

    public static String q(int i3) {
        return i3 == 0 ? "EnableGroup2" : i3 == 1 ? "EnableAll2" : "EnableChannel2";
    }

    public static String r(zi ziVar, String str) {
        TLRPC.Message message = ziVar.k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean A = l10.A(zi.B0(message));
        boolean z10 = (tL_messageActionGramTransfer.comment_encrypted || TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) ? false : true;
        return bd.a0(null, null, A ? z10 ? 2131748043 : 2131748044 : z10 ? 2131748045 : 2131748046, str, org.telegram.ui.Wallet.k0.s(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
    }

    public static TLRPC.NotificationSound s(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j10 = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j10 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j10;
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

    public static us t(int i3) {
        us usVar;
        us usVar2 = q0[i3];
        if (usVar2 != null) {
            return usVar2;
        }
        synchronized (r0[i3]) {
            try {
                usVar = q0[i3];
                if (usVar == null) {
                    us[] usVarArr = q0;
                    us usVar3 = new us(i3);
                    usVarArr[i3] = usVar3;
                    usVar = usVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return usVar;
    }

    public static String v(long j10, long j11, boolean z10) {
        String valueOf;
        if (z10) {
            if (j11 == 0) {
                return String.valueOf(j10);
            }
            Locale locale = Locale.US;
            return j10 + "_" + j11;
        }
        long j12 = (j11 << 12) + j10;
        a0.h hVar = s0;
        int h = hVar.h(j12);
        if (h >= 0) {
            return (String) hVar.n(h);
        }
        if (j11 != 0) {
            Locale locale2 = Locale.US;
            valueOf = j10 + "_" + j11;
        } else {
            valueOf = String.valueOf(j10);
        }
        hVar.k(valueOf, j12);
        return valueOf;
    }

    public final boolean A() {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i3 >= arrayList.size()) {
                return false;
            }
            zi ziVar = (zi) arrayList.get(i3);
            long B0 = zi.B0(ziVar.k);
            if (!ziVar.I) {
                TLRPC.Message message = ziVar.k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !m5.C(B0) && ((ziVar.k.peer_id.channel_id == 0 || ziVar.B4()) && B0 != 489000 && B0 != 489001)) {
                    return true;
                }
            }
            i3++;
        }
    }

    public final boolean B(int i3) {
        return i3 == 4 ? getAccountInstance().c().getBoolean("EnableReactionsMessages", true) : i3 == 5 ? getAccountInstance().c().getBoolean("EnableReactionsStories", true) : i3 == 3 ? getAccountInstance().c().getBoolean("EnableAllStories", true) : getAccountInstance().c().getInt(q(i3), 0) < getConnectionsManager().getCurrentTime();
    }

    public final boolean C(long j10) {
        return D(j10, null, false, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        if (r3.booleanValue() != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0018, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0031, code lost:
    
        if (r1.megagroup == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean D(long j10, Boolean bool, boolean z10, boolean z11) {
        int i3;
        if (z10) {
            i3 = 4;
        } else if (z11) {
            i3 = 5;
        } else if (!m5.z(j10)) {
            i3 = 1;
        } else if (bool == null) {
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j10));
            if (t3.T(M0)) {
            }
            i3 = 0;
        }
        return B(i3);
    }

    public final void G(long j10, long j11, boolean z10) {
        if (z10) {
            t(this.currentAccount).H(j10, ConnectionsManager.DEFAULT_DATACENTER_ID, j11);
            return;
        }
        boolean D = t(this.currentAccount).D(j10, null, false, false);
        boolean z11 = j11 != 0;
        SharedPreferences.Editor edit = hp.s1(this.currentAccount).d7.edit();
        if (!D || z11) {
            edit.putInt("notify2_" + v(j10, j11, false), 0);
        } else {
            edit.remove("notify2_" + v(j10, j11, false));
        }
        if (j11 == 0) {
            getMessagesStorage().E1(j10, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j10);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        c0(j10, j11, true);
    }

    public final void H(long j10, int i3, long j11) {
        long j12 = 0;
        if (j10 != 0) {
            SharedPreferences.Editor edit = hp.s1(this.currentAccount).d7.edit();
            boolean z10 = j11 != 0;
            boolean D = t(this.currentAccount).D(j10, null, false, false);
            String v = v(j10, j11, false);
            if (i3 != Integer.MAX_VALUE) {
                edit.putInt("notify2_" + v, 3);
                edit.putInt("notifyuntil_" + v, getConnectionsManager().getCurrentTime() + i3);
                j12 = (((long) i3) << 32) | 1;
            } else if (D || z10) {
                edit.putInt("notify2_" + v, 2);
                j12 = 1L;
            } else {
                edit.remove("notify2_" + v);
            }
            edit.apply();
            if (j11 == 0) {
                t(this.currentAccount).N(j10);
                qr.a0(this.currentAccount).E1(j10, j12);
                TLRPC.Dialog dialog = (TLRPC.Dialog) hp.s1(this.currentAccount).R.f(j10);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i3 != Integer.MAX_VALUE || D) {
                        tL_peerNotifySettings.mute_until = i3;
                    }
                }
            }
            t(this.currentAccount).c0(j10, j11, true);
        }
    }

    public final Pair I(ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        String str;
        TLRPC.FileLocation fileLocation;
        ArrayList arrayList3 = this.E;
        int min = Math.min(3, arrayList3.size());
        boolean z10 = false;
        int i10 = 0;
        for (0; i3 < min; i3 + 1) {
            ts tsVar = (ts) arrayList3.get(i3);
            HashMap hashMap = tsVar.c;
            long j10 = tsVar.a;
            i10 += hashMap.size();
            z10 |= tsVar.d;
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
            if (a22 == null && (a22 = getMessagesStorage().k0(j10)) != null) {
                getMessagesController().X3(a22, true, false);
            }
            File file = null;
            if (a22 != null) {
                str = l10.p(a22);
                TLRPC.UserProfilePhoto userProfilePhoto = a22.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    w7 fileLoader = getFileLoader();
                    TLRPC.FileLocation fileLocation2 = a22.photo.photo_small;
                    fileLoader.getClass();
                    File K = w7.K(fileLocation2, null, true, true);
                    if (!K.exists()) {
                        if (a22.photo.photo_big != null) {
                            w7 fileLoader2 = getFileLoader();
                            TLRPC.FileLocation fileLocation3 = a22.photo.photo_big;
                            fileLoader2.getClass();
                            K = w7.K(fileLocation3, null, true, true);
                        } else {
                            K = null;
                        }
                        if (K != null && !K.exists()) {
                            K = null;
                        }
                    }
                    if (K != null) {
                        file = K;
                    }
                }
            } else {
                str = tsVar.b;
                i3 = str == null ? i3 + 1 : 0;
            }
            if (str.length() > 50) {
                str = str.substring(0, 25) + "…";
            }
            arrayList.add(str);
            if (file == null && a22 != null) {
                arrayList2.add(a22);
            } else if (file != null) {
                arrayList2.add(file);
            }
        }
        if (z10) {
            arrayList2.clear();
        }
        return new Pair(Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    public final void J(LongSparseIntArray longSparseIntArray) {
        l0.c(new ns(this, longSparseIntArray, new ArrayList(), 0));
    }

    public final void K(ArrayList arrayList, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        boolean z13;
        if (r2.a) {
            StringBuilder sb2 = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            sb2.append(arrayList == null ? "null" : Integer.valueOf(arrayList.size()));
            sb2.append(" isLast=");
            z12 = z10;
            sb2.append(z12);
            sb2.append(" isFcm=");
            z13 = z11;
            sb2.append(z13);
            sb2.append(")");
            a8.b(sb2.toString());
        } else {
            z12 = z10;
            z13 = z11;
        }
        if (arrayList != null) {
            int i3 = 0;
            while (i3 < arrayList.size()) {
                zi ziVar = (zi) arrayList.get(i3);
                if (ziVar != null && ziVar.k != null && !ziVar.Q3()) {
                    TLRPC.MessageAction messageAction = ziVar.k.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed || getConnectionsManager().getCurrentTime() - ziVar.k.date >= getMessagesController().i3 / 1000) {
                            VoIPGroupNotification.hide(t0.b, this.currentAccount, ziVar.f1());
                        } else {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(zi.B0(ziVar.k)));
                            ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                            int size = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size) {
                                TLRPC.Peer peer = arrayList2.get(i10);
                                i10++;
                                hashSet.add(Long.valueOf(m5.o(peer)));
                            }
                            StringBuilder sb3 = new StringBuilder();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                long longValue = ((Long) it.next()).longValue();
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(m5.s(this.currentAccount, longValue));
                            }
                            VoIPGroupNotification.request(t0.b, this.currentAccount, zi.B0(ziVar.k), sb3.toString(), tL_messageActionConferenceCall.call_id, ziVar.f1(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i3);
                            i3--;
                        }
                    }
                }
                i3++;
            }
        }
        if (!arrayList.isEmpty()) {
            l0.c(new dn(this, arrayList, new ArrayList(0), z13, z12, countDownLatch));
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j10, int i3, int i10, boolean z10) {
        l0.c(new hg(this, longSparseIntArray, new ArrayList(0), j10, i10, i3, z10));
    }

    public final void M(a0.h hVar, boolean z10) {
        l0.c(new ci.u8(this, hVar, z10, new ArrayList(0), 22));
    }

    public final void N(long j10) {
        L(null, j10, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j10, 0);
        J(longSparseIntArray);
    }

    public final String O(zi ziVar) {
        String str;
        TLRPC.Message message = ziVar.k;
        if (message == null || (str = message.message) == null || message.entities == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (ziVar.I2) {
            return sb2.toString();
        }
        for (int i3 = 0; i3 < ziVar.k.entities.size(); i3++) {
            if (ziVar.k.entities.get(i3) instanceof TLRPC.TL_messageEntitySpoiler) {
                TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) ziVar.k.entities.get(i3);
                for (int i10 = 0; i10 < tL_messageEntitySpoiler.length; i10++) {
                    int i11 = tL_messageEntitySpoiler.offset + i10;
                    char[] cArr = this.i0;
                    sb2.setCharAt(i11, cArr[i10 % cArr.length]);
                }
            }
        }
        return sb2.toString();
    }

    public final void P(e0.q qVar, long j10, long j11, String str, long[] jArr, int i3, Uri uri, int i10, boolean z10, boolean z11, boolean z12, int i11) {
        a8.b("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 == null || uri == null || TextUtils.equals(uri2.toString(), uri.toString())) {
            return;
        }
        SharedPreferences.Editor edit = getAccountInstance().c().edit();
        String uri3 = uri2.toString();
        String M0 = bd.M0(2131751600, null);
        if (z10) {
            if (i11 == 2) {
                edit.putString("ChannelSound", M0);
            } else if (i11 == 0) {
                edit.putString("GroupSound", M0);
            } else if (i11 == 1) {
                edit.putString("GlobalSound", M0);
            } else if (i11 == 3) {
                edit.putString("StoriesSound", M0);
            } else if (i11 == 4 || i11 == 5) {
                edit.putString("ReactionSound", M0);
            }
            if (i11 == 2) {
                edit.putString("ChannelSoundPath", uri3);
            } else if (i11 == 0) {
                edit.putString("GroupSoundPath", uri3);
            } else if (i11 == 1) {
                edit.putString("GlobalSoundPath", uri3);
            } else if (i11 == 3) {
                edit.putString("StoriesSoundPath", uri3);
            } else if (i11 == 4 || i11 == 5) {
                edit.putString("ReactionSound", uri3);
            }
            getNotificationsController().n(i11);
        } else {
            edit.putString("sound_" + v(j10, j11, false), M0);
            edit.putString("sound_path_" + v(j10, j11, false), uri3);
            o(j10, j11);
        }
        edit.commit();
        qVar.y = e0(j10, j11, str, jArr, i3, uri2, i10, z10, z11, z12, i11);
        m0.e(null, this.e0, qVar.b());
    }

    public final void Q(boolean z10) {
        is isVar = this.V;
        try {
            if (r2.a) {
                a8.b("delay notification start, onlineReason = " + z10);
            }
            this.W.acquire(10000L);
            p5 p5Var = l0;
            p5Var.a(isVar);
            p5Var.e(isVar, z10 ? 3000 : 1000);
        } catch (Exception e10) {
            a8.g(e10, true);
            Z(this.L);
        }
    }

    public final void R() {
        try {
            Intent intent = new Intent(t0.b, (Class<?>) NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(t0.b, 0, intent, 33554432);
            if (getAccountInstance().c().getInt("repeat_messages", 60) <= 0 || this.K <= 0) {
                this.d0.cancel(service);
            } else {
                this.d0.set(2, SystemClock.elapsedRealtime() + (r1 * 60000), service);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void S(int i3) {
        if (this.O == i3) {
            return;
        }
        a8.b("setBadge " + i3);
        this.O = i3;
        try {
            if (wr.c == null && !wr.b) {
                wr.b();
                wr.b = true;
            }
            ur urVar = wr.c;
            if (urVar == null) {
                return;
            }
            urVar.a(i3);
        } catch (Throwable unused) {
        }
    }

    public final void T(long j10, int i3, long j11) {
        SharedPreferences.Editor edit = getAccountInstance().c().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) hp.s1(h10.t0).R.f(j10);
        if (i3 == 4) {
            if (D(j10, null, false, false)) {
                edit.remove("notify2_" + v(j10, j11, false));
            } else {
                edit.putInt("notify2_" + v(j10, j11, false), 0);
            }
            getMessagesStorage().E1(j10, 0L);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        } else {
            int currentTime = ConnectionsManager.getInstance(h10.t0).getCurrentTime();
            if (i3 == 0) {
                currentTime += 3600;
            } else if (i3 == 1) {
                currentTime += 28800;
            } else if (i3 == 2) {
                currentTime += 172800;
            } else if (i3 == 3) {
                currentTime = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            long j12 = 1;
            if (i3 == 3) {
                edit.putInt("notify2_" + v(j10, j11, false), 2);
            } else {
                edit.putInt("notify2_" + v(j10, j11, false), 3);
                edit.putInt("notifyuntil_" + v(j10, j11, false), currentTime);
                j12 = 1 | (((long) currentTime) << 32);
            }
            t(h10.t0).N(j10);
            qr.a0(h10.t0).E1(j10, j12);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        edit.commit();
        c0(j10, j11, true);
    }

    public final void U(int i3, int i10) {
        getAccountInstance().c().edit().putInt(q(i3), i10).commit();
        b0(i3);
        qr messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new hq(messagesStorage, 25));
        m(i3);
    }

    public final void V(int i3) {
        l0.c(new os(this, i3, 7));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(93:51|(2:53|(4:55|56|57|58)(4:59|(2:62|60)|63|64))(1:901)|65|66|(1:68)(2:(1:898)(1:900)|899)|69|(4:72|(2:74|75)(1:77)|76|70)|78|79|(5:81|(2:(1:84)(1:768)|85)(1:769)|(1:767)(2:91|(2:95|96))|766|96)(5:770|(3:(1:882)(1:779)|780|(13:782|(2:784|(1:786)(4:835|(1:837)|838|387))(2:839|(1:847)(2:843|(1:845)))|787|788|(1:790)(2:825|(1:827)(2:828|(1:830)(2:831|(1:833)(7:834|792|793|(1:824)(4:798|(4:800|(1:814)(2:804|(2:808|809))|813|809)(2:815|(2:817|(2:819|(1:821))))|810|(1:812))|823|810|(0)))))|791|792|793|(0)|824|823|810|(0))(9:848|(2:850|(1:852)(4:854|(1:856)|838|387))(9:857|(1:881)(1:861)|862|(1:880)(2:866|(1:868))|879|870|(2:872|(1:874))(1:878)|(1:876)|877)|853|793|(0)|824|823|810|(0)))(3:883|(4:885|(2:887|(1:889))(2:890|(2:892|(1:894)))|838|387)(1:896)|895)|56|57|58)|(1:765)(2:100|(1:102))|103|(3:105|(1:107)(1:763)|108)(1:764)|109|(3:111|(3:113|(1:115)(3:750|751|(3:753|(1:755)(1:757)|756)(1:758))|116)|761)(1:762)|(2:(1:748)(3:123|(1:125)(2:(2:744|745)|743)|126)|127)(1:749)|128|(5:707|(5:709|(4:712|(2:720|721)|722|710)|727|728|(4:730|(1:732)|733|734)(1:740))(1:741)|735|(1:737)(1:739)|738)(2:131|132)|133|(1:135)|136|(1:138)(1:697)|139|(1:696)(1:143)|144|145|(1:695)(3:148|(1:150)|(3:660|661|(60:665|666|667|(6:671|(1:673)(2:(2:685|686)|689)|674|675|676|677)|153|(1:659)(1:157)|(1:658)(1:160)|161|(1:657)|168|(1:656)(1:175)|176|(11:178|(1:180)(2:384|(5:386|387|56|57|58)(2:388|(1:(1:391)(1:392))(2:393|(1:395)(2:396|(1:401)(1:400)))))|181|(2:184|182)|185|186|(1:383)(1:189)|190|(1:192)|(1:194)(1:382)|195)(4:402|(6:404|(1:406)(3:411|(1:413)(2:641|(2:646|(1:648)(2:649|(1:653)))(1:645))|(3:415|(1:417)|418)(17:419|(1:421)|422|(2:637|(1:639)(1:640))(1:428)|429|430|(3:629|(1:(1:632)(2:633|(1:635)))|636)(1:434)|435|(2:(2:438|(1:(2:441|(1:443))(1:623))(2:624|(1:626)))(1:627)|622)(1:628)|(5:552|553|(1:621)(5:559|(2:619|620)(4:562|(1:566)|(1:618)(2:572|(1:576))|617)|(2:581|(2:583|(1:593))(2:594|(1:604)))|(1:606)(2:608|(2:612|613))|607)|616|607)(1:447)|448|(10:450|(1:548)(8:463|(1:547)(3:467|(6:535|536|537|538|539|540)(1:469)|470)|471|(1:473)(1:534)|474|475|(2:529|530)(3:477|(3:525|(1:527)|528)|479)|(9:517|(1:519)|520|(2:522|(1:524))|484|485|(2:490|(2:492|(3:494|(2:499|500)(1:496)|(1:498))(2:503|(2:505|(2:507|508)))))|515|508))|481|482|(5:516|485|(3:488|490|(0))|515|508)|484|485|(0)|515|508)(2:549|(1:551))|509|(2:511|(3:513|514|410))|408|409|410))|407|408|409|410)|654|655)|196|197|(2:351|(44:356|(2:367|(4:369|(2:372|370)|373|374)(2:375|(1:377)(2:378|(1:380)(1:381))))(3:360|(1:362)(2:364|(1:366))|363)|203|(1:205)|206|(1:208)|209|(2:211|(1:213)(1:346))(2:347|(1:349)(1:350))|(1:215)(1:345)|216|(4:218|(2:221|219)|222|223)(1:344)|224|(1:226)(1:343)|227|(1:342)(1:233)|234|235|236|237|(1:239)|(1:243)|244|(1:246)|(2:250|(21:252|(4:255|(2:256|(2:258|(2:261|262)(1:260))(1:335))|(1:265)(1:264)|253)|336|266|(1:268)|269|(2:(1:274)|(1:281))|282|(1:334)(1:288)|289|(1:291)|(1:293)|294|(3:299|(4:301|(3:303|(4:305|(1:307)|308|309)(2:311|312)|310)|313|314)|315)|316|(1:333)(2:319|(2:323|(1:327)))|328|(1:330)|331|332|58))|337|(0)|269|(3:271|(0)|(2:276|281))|282|(1:284)|334|289|(0)|(0)|294|(4:296|299|(0)|315)|316|(0)|333|328|(0)|331|332|58)(1:355))(1:201)|202|203|(0)|206|(0)|209|(0)(0)|(0)(0)|216|(0)(0)|224|(0)(0)|227|(1:229)|342|234|235|236|237|(0)|(2:241|243)|244|(0)|(3:248|250|(0))|337|(0)|269|(0)|282|(0)|334|289|(0)|(0)|294|(0)|316|(0)|333|328|(0)|331|332|58)))|152|153|(1:155)|659|(0)|658|161|(1:163)|657|168|(1:171)|656|176|(0)(0)|196|197|(1:199)|351|(1:353)|356|(1:358)|367|(0)(0)|203|(0)|206|(0)|209|(0)(0)|(0)(0)|216|(0)(0)|224|(0)(0)|227|(0)|342|234|235|236|237|(0)|(0)|244|(0)|(0)|337|(0)|269|(0)|282|(0)|334|289|(0)|(0)|294|(0)|316|(0)|333|328|(0)|331|332|58) */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x13d1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x13f0, code lost:
    
        org.telegram.messenger.a8.f(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:822:0x0566, code lost:
    
        if (r5.local_id != 0) goto L220;
     */
    /* JADX WARN: Code restructure failed: missing block: B:846:0x040a, code lost:
    
        if (r0.local_id != 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x04cf, code lost:
    
        if (r7.local_id != 0) goto L181;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0917 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x092a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0942 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x115f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x1205  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x1225  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x127f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x12d8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x1306  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1367  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x1396  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x13ca A[Catch: Exception -> 0x13d1, TryCatch #12 {Exception -> 0x13d1, blocks: (B:237:0x13ac, B:239:0x13ca, B:241:0x13d5, B:243:0x13d9, B:244:0x13df), top: B:236:0x13ac }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x13d5 A[Catch: Exception -> 0x13d1, TryCatch #12 {Exception -> 0x13d1, blocks: (B:237:0x13ac, B:239:0x13ca, B:241:0x13d5, B:243:0x13d9, B:244:0x13df), top: B:236:0x13ac }] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x13f5  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x13fe  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x1408  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x1455  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x1497  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x149d  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x14be  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x14d6  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x14db  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x14e8  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x14f5  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x1575 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x15ad  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x136e  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x132f  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x12ed  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x12b4  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x1172  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x1188  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x11b0  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x11d6  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x0b13  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0f3a  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0f66  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x1038 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x104c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x10e6  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x1030  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0fc3  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0f47 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0f3e  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x050d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:812:0x0576  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x162a  */
    /* JADX WARN: Removed duplicated region for block: B:916:0x1693  */
    /* JADX WARN: Removed duplicated region for block: B:928:0x16f5  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x1669  */
    /* JADX WARN: Removed duplicated region for block: B:960:0x01bc A[EDGE_INSN: B:960:0x01bc->B:904:0x01bc BREAK  A[LOOP:2: B:48:0x01ae->B:58:0x160c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:961:0x0179  */
    /* JADX WARN: Type inference failed for: r5v121 */
    /* JADX WARN: Type inference failed for: r5v122, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v125 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(e0.q qVar, String str, long j10, long j11, String str2, long[] jArr, int i3, Uri uri, int i10, boolean z10, boolean z11, boolean z12, int i11) {
        boolean z13;
        boolean z14;
        long e10;
        boolean z15;
        a0.h hVar;
        int size;
        ArrayList arrayList;
        boolean z16;
        a0.h hVar2;
        ArrayList arrayList2;
        String str3;
        int i12;
        int size2;
        int i13;
        a0.h hVar3;
        boolean z17;
        int i14;
        boolean z18;
        Notification notification;
        long j12;
        long j13;
        a0.h hVar4;
        int f12;
        zi ziVar;
        ArrayList arrayList3;
        int i15;
        Integer num;
        int i16;
        a0.h hVar5;
        Notification notification2;
        Integer num2;
        int i17;
        int i18;
        ss ssVar;
        long j14;
        String str4;
        String str5;
        TLRPC.User user;
        TLRPC.User user2;
        String L0;
        TLRPC.FileLocation fileLocation;
        TLRPC.Chat chat;
        boolean z19;
        boolean z20;
        boolean z21;
        SharedPreferences sharedPreferences;
        a0.h hVar6;
        ArrayList arrayList4;
        long j15;
        TLRPC.Chat M0;
        TLRPC.FileLocation fileLocation2;
        String str6;
        TLRPC.User user3;
        int i19;
        TLRPC.User user4;
        int i20;
        TLRPC.FileLocation fileLocation3;
        TLRPC.FileLocation fileLocation4;
        TLRPC.FileLocation fileLocation5;
        TLRPC.FileLocation fileLocation6;
        String p10;
        TLRPC.User user5;
        TLRPC.FileLocation fileLocation7;
        String L02;
        Notification notification3;
        int i21;
        String str7;
        TLRPC.FileLocation fileLocation8;
        int i22;
        Bitmap bitmap;
        File file;
        String str8;
        String str9;
        Bitmap bitmap2;
        int i23;
        String str10;
        TLRPC.User user6;
        TLRPC.Chat chat2;
        boolean z22;
        String Z;
        e0.h b10;
        e0.h hVar7;
        long j16;
        e0.x xVar;
        int i24;
        String str11;
        ArrayList arrayList5;
        zi ziVar2;
        Bitmap bitmap3;
        String str12;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList6;
        int i25;
        StringBuilder sb2;
        long j17;
        long j18;
        e0.x xVar2;
        String[] strArr;
        e0.x xVar3;
        int i26;
        int i27;
        long j19;
        String str13;
        boolean[] zArr;
        StringBuilder sb3;
        long j20;
        long j21;
        IconCompat iconCompat;
        char c2;
        int i28;
        int i29;
        File file2;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation9;
        TLRPC.UserProfilePhoto userProfilePhoto;
        TLRPC.FileLocation fileLocation10;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation11;
        a0.h hVar8;
        e0.x xVar4;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList7;
        char c10;
        ArrayList arrayList8;
        Uri uri2;
        ArrayList arrayList9;
        File file3;
        Uri d;
        Bitmap createScaledBitmap;
        Canvas canvas;
        zi ziVar3;
        long j22;
        long j23;
        Bitmap bitmap4;
        e0.h hVar9;
        String str14;
        e0.h hVar10;
        ArrayList arrayList10;
        long j24;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton;
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy;
        long j25;
        TLRPC.User user7;
        int size3;
        int i30;
        TLRPC.Message message;
        TLRPC.ReplyMarkup replyMarkup;
        Intent intent;
        ArrayList arrayList11;
        boolean z23;
        ?? r5;
        String G;
        TLRPC.UserProfilePhoto userProfilePhoto3;
        TLRPC.FileLocation fileLocation12;
        IconCompat iconCompat2;
        IconCompat iconCompat3;
        int i31;
        Bitmap bitmap5;
        String G2;
        TLRPC.UserProfilePhoto userProfilePhoto4;
        TLRPC.FileLocation fileLocation13;
        us usVar = this;
        a8.b("showExtraNotifications pushMessages.size()=" + usVar.a.size());
        if (Build.VERSION.SDK_INT >= 26) {
            z13 = z12;
            qVar.e(usVar.e0(j10, j11, str2, jArr, i3, uri, i10, z10, z11, z13, i11));
        } else {
            z13 = z12;
        }
        qVar.h(8, z13);
        Notification b11 = qVar.b();
        SharedPreferences c11 = usVar.getAccountInstance().c();
        ArrayList arrayList12 = new ArrayList();
        if (!usVar.E.isEmpty()) {
            arrayList12.add(new ss(0L, 0L, true));
        }
        a0.h hVar11 = new a0.h();
        int i32 = 0;
        for (int i33 = 0; i33 < usVar.a.size(); i33++) {
            zi ziVar4 = (zi) usVar.a.get(i33);
            long A0 = ziVar4.A0();
            long b22 = zi.b2(usVar.currentAccount, ziVar4.k, usVar.getMessagesController().u2(ziVar4));
            int i34 = c11.getInt("dismissDate" + A0, 0);
            if (ziVar4.K || ziVar4.k.date > i34) {
                ArrayList arrayList13 = (ArrayList) hVar11.f(A0);
                if (arrayList13 == null) {
                    arrayList13 = k5.j(hVar11, A0);
                    a8.b("showExtraNotifications: sortedDialogs += " + A0);
                    arrayList12.add(new ss(A0, b22, false));
                }
                arrayList13.add(ziVar4);
            } else {
                StringBuilder t10 = a1.g.t(A0, "showExtraNotifications: dialog ", " is skipped, message date (");
                t10.append(ziVar4.k.date);
                t10.append(" <= ");
                t10.append(i34);
                t10.append(")");
                a8.b(t10.toString());
            }
        }
        a0.h hVar12 = new a0.h();
        for (int i35 = 0; i35 < usVar.h.m(); i35++) {
            hVar12.k((Integer) usVar.h.n(i35), usVar.h.j(i35));
        }
        usVar.h.b();
        ArrayList arrayList14 = new ArrayList();
        int i36 = Build.VERSION.SDK_INT;
        if (i36 > 27) {
            if (arrayList12.size() <= (usVar.E.isEmpty() ? 1 : 2)) {
                z14 = false;
                if (z14 && i36 >= 26) {
                    i();
                }
                e10 = usVar.getUserConfig().e();
                z15 = !g0.o2() || az.C;
                a8.b("showExtraNotifications: passcode=" + (az.s.length() <= 0) + " waitingForPasscode=" + z15 + " selfUserId=" + e10 + " useSummaryNotification=" + z14);
                hVar = new a0.h();
                size = arrayList12.size();
                arrayList = arrayList14;
                while (true) {
                    if (i32 >= size) {
                        break;
                    }
                    if (arrayList.size() >= 7) {
                        a8.b("showExtraNotifications: break from holders, count over 7");
                        break;
                    }
                    ss ssVar2 = (ss) arrayList12.get(i32);
                    ArrayList arrayList15 = arrayList12;
                    if (ssVar2.c) {
                        ArrayList arrayList16 = new ArrayList();
                        if (usVar.E.isEmpty()) {
                            StringBuilder sb4 = new StringBuilder("showExtraNotifications: [");
                            z17 = z15;
                            sb4.append(ssVar2.a);
                            sb4.append("] continue; story but storyPushMessages is empty");
                            a8.b(sb4.toString());
                            z18 = z14;
                            notification3 = b11;
                            sharedPreferences = c11;
                            hVar4 = hVar11;
                            i16 = i32;
                            hVar5 = hVar12;
                            hVar6 = hVar;
                            i14 = size;
                            j15 = e10;
                            arrayList4 = arrayList;
                            i32 = i16 + 1;
                            arrayList = arrayList4;
                            arrayList12 = arrayList15;
                            z14 = z18;
                            z15 = z17;
                            size = i14;
                            hVar11 = hVar4;
                            hVar12 = hVar5;
                            c11 = sharedPreferences;
                            e10 = j15;
                            b11 = notification3;
                            hVar = hVar6;
                        } else {
                            z17 = z15;
                            i14 = size;
                            long j26 = ((ts) usVar.E.get(0)).a;
                            int i37 = 0;
                            for (Iterator it = ((ts) usVar.E.get(0)).c.keySet().iterator(); it.hasNext(); it = it) {
                                i37 = Math.max(i37, ((Integer) it.next()).intValue());
                            }
                            z18 = z14;
                            arrayList3 = arrayList16;
                            hVar4 = hVar11;
                            f12 = i37;
                            j12 = j26;
                            j13 = 0;
                            notification = b11;
                            ziVar = null;
                        }
                    } else {
                        z17 = z15;
                        i14 = size;
                        long j27 = ssVar2.a;
                        z18 = z14;
                        notification = b11;
                        long j28 = ssVar2.b;
                        ArrayList arrayList17 = (ArrayList) hVar11.f(j27);
                        j12 = j27;
                        j13 = j28;
                        hVar4 = hVar11;
                        f12 = ((zi) arrayList17.get(0)).f1();
                        ziVar = (zi) arrayList17.get(0);
                        arrayList3 = arrayList17;
                    }
                    long j29 = e10;
                    Integer num3 = (Integer) hVar12.f(ssVar2.a);
                    if (ssVar2.c) {
                        num = 2147483646;
                        i15 = 32;
                    } else {
                        if (num3 == null) {
                            i15 = 32;
                            long j30 = ssVar2.a;
                            num3 = Integer.valueOf(((int) j30) + ((int) (j30 >> 32)));
                        } else {
                            i15 = 32;
                            hVar12.l(ssVar2.a);
                        }
                        num = num3;
                    }
                    i16 = i32;
                    int i38 = 0;
                    for (int i39 = 0; i39 < arrayList3.size(); i39++) {
                        if (i38 < ((zi) arrayList3.get(i39)).k.date) {
                            i38 = ((zi) arrayList3.get(i39)).k.date;
                        }
                    }
                    if (ssVar2.c) {
                        hVar5 = hVar12;
                        TLRPC.User a22 = usVar.getMessagesController().a2(Long.valueOf(j12));
                        notification2 = notification;
                        if (usVar.E.size() == 1) {
                            G2 = a22 != null ? l10.i(a22) : ((ts) usVar.E.get(0)).b;
                            num2 = num;
                        } else {
                            num2 = num;
                            G2 = bd.G(usVar.E.size(), "Stories", new Object[0]);
                        }
                        if (a22 == null || (userProfilePhoto4 = a22.photo) == null || (fileLocation13 = userProfilePhoto4.photo_small) == null) {
                            i17 = i38;
                        } else {
                            i17 = i38;
                            if (fileLocation13.volume_id != 0 && fileLocation13.local_id != 0) {
                                i18 = f12;
                                ssVar = ssVar2;
                                j14 = j12;
                                z19 = false;
                                z20 = false;
                                z21 = false;
                                str4 = "showExtraNotifications: [";
                                str5 = "Stories";
                                fileLocation = fileLocation13;
                                user2 = a22;
                                L0 = G2;
                                chat = null;
                            }
                        }
                        i18 = f12;
                        ssVar = ssVar2;
                        j14 = j12;
                        z19 = false;
                        z20 = false;
                        z21 = false;
                        str4 = "showExtraNotifications: [";
                        str5 = "Stories";
                        fileLocation = null;
                        user2 = a22;
                        L0 = G2;
                        chat = null;
                    } else {
                        hVar5 = hVar12;
                        notification2 = notification;
                        num2 = num;
                        i17 = i38;
                        if (m5.C(j12)) {
                            i18 = f12;
                            ssVar = ssVar2;
                            j14 = j12;
                            str4 = "showExtraNotifications: [";
                            str5 = "Stories";
                            if (j14 != o0) {
                                int h = m5.h(j14);
                                TLRPC.EncryptedChat a12 = usVar.getMessagesController().a1(Integer.valueOf(h));
                                if (a12 != null) {
                                    user = usVar.getMessagesController().a2(Long.valueOf(a12.user_id));
                                    if (user == null) {
                                        if (r2.a) {
                                            a8.l("not found secret chat user to show dialog notification " + a12.user_id);
                                        }
                                    }
                                } else if (r2.a) {
                                    a8.l("not found secret chat to show dialog notification " + h);
                                }
                                sharedPreferences = c11;
                                hVar6 = hVar;
                                arrayList4 = arrayList;
                                j15 = j29;
                                notification3 = notification2;
                            } else {
                                user = null;
                            }
                            user2 = user;
                            L0 = bd.L0(2131745703);
                            fileLocation = null;
                            chat = null;
                            z19 = false;
                            z20 = false;
                            z21 = false;
                        } else {
                            boolean z24 = (ziVar == null || ziVar.I || ziVar.J || j12 == 777000) ? false : true;
                            if (m5.E(j12)) {
                                TLRPC.User a23 = usVar.getMessagesController().a2(Long.valueOf(j12));
                                if (a23 != null) {
                                    j14 = j12;
                                    p10 = l10.p(a23);
                                    z19 = z24;
                                    TLRPC.UserProfilePhoto userProfilePhoto5 = a23.photo;
                                    if (userProfilePhoto5 == null || (fileLocation7 = userProfilePhoto5.photo_small) == null) {
                                        str5 = "Stories";
                                        user5 = a23;
                                    } else {
                                        str5 = "Stories";
                                        user5 = a23;
                                        if (fileLocation7.volume_id != 0) {
                                        }
                                    }
                                } else if (ziVar.j3()) {
                                    p10 = ziVar.b;
                                    user5 = a23;
                                    j14 = j12;
                                    z19 = z24;
                                    str5 = "Stories";
                                } else {
                                    if (r2.a) {
                                        a8.l("not found user to show dialog notification " + j12);
                                    }
                                    sharedPreferences = c11;
                                    hVar6 = hVar;
                                    arrayList4 = arrayList;
                                    j15 = j29;
                                    notification3 = notification2;
                                }
                                fileLocation7 = null;
                                if (j14 == 489001) {
                                    L02 = bd.L0(2131753121);
                                } else if (j14 == 489000) {
                                    L02 = bd.L0(2131743626);
                                } else if (l10.y(j14)) {
                                    L02 = bd.L0(2131746274);
                                } else if (j14 == j29) {
                                    L02 = bd.L0(2131748535);
                                } else {
                                    fileLocation2 = fileLocation7;
                                    i18 = f12;
                                    ssVar = ssVar2;
                                    str6 = p10;
                                    M0 = null;
                                    z21 = false;
                                    str4 = "showExtraNotifications: [";
                                    user3 = user5;
                                    z20 = false;
                                    i19 = (j14 > 489000L ? 1 : (j14 == 489000L ? 0 : -1));
                                    if (i19 == 0 || ziVar == null || ziVar.W0() == null) {
                                        user4 = user3;
                                        i20 = i19;
                                        fileLocation3 = fileLocation2;
                                    } else {
                                        Long W0 = ziVar.W0();
                                        user4 = user3;
                                        i20 = i19;
                                        long longValue = W0.longValue();
                                        if (m5.E(longValue)) {
                                            TLRPC.UserProfilePhoto userProfilePhoto6 = usVar.getMessagesController().a2(W0).photo;
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
                                            TLRPC.ChatPhoto chatPhoto2 = usVar.getMessagesController().M0(Long.valueOf(-longValue)).photo;
                                            if (chatPhoto2 != null) {
                                                fileLocation = chatPhoto2.photo_small;
                                                if (fileLocation != null) {
                                                    if (fileLocation.volume_id != 0) {
                                                    }
                                                }
                                            }
                                        }
                                        String str15 = str6;
                                        chat = M0;
                                        L0 = str15;
                                        user2 = user4;
                                        if (i20 == 0) {
                                            z19 = false;
                                        }
                                    }
                                    fileLocation = fileLocation3;
                                    String str152 = str6;
                                    chat = M0;
                                    L0 = str152;
                                    user2 = user4;
                                    if (i20 == 0) {
                                    }
                                }
                                i18 = f12;
                                str6 = L02;
                                ssVar = ssVar2;
                                z21 = false;
                                fileLocation2 = fileLocation7;
                                str4 = "showExtraNotifications: [";
                                user3 = user5;
                                M0 = null;
                                z20 = false;
                                i19 = (j14 > 489000L ? 1 : (j14 == 489000L ? 0 : -1));
                                if (i19 == 0) {
                                }
                                user4 = user3;
                                i20 = i19;
                                fileLocation3 = fileLocation2;
                                fileLocation = fileLocation3;
                                String str1522 = str6;
                                chat = M0;
                                L0 = str1522;
                                user2 = user4;
                                if (i20 == 0) {
                                }
                            } else {
                                j14 = j12;
                                z19 = z24;
                                str5 = "Stories";
                                M0 = usVar.getMessagesController().M0(Long.valueOf(-j14));
                                if (M0 != null) {
                                    boolean z25 = M0.megagroup;
                                    boolean z26 = t3.T(M0) && !M0.megagroup;
                                    String y9 = usVar.y(M0);
                                    z20 = z25;
                                    TLRPC.ChatPhoto chatPhoto3 = M0.photo;
                                    if (chatPhoto3 == null || (fileLocation2 = chatPhoto3.photo_small) == null) {
                                        z21 = z26;
                                        ssVar = ssVar2;
                                    } else {
                                        z21 = z26;
                                        ssVar = ssVar2;
                                        if (fileLocation2.volume_id != 0) {
                                        }
                                    }
                                    fileLocation2 = null;
                                    if (j13 != 0) {
                                        str4 = "showExtraNotifications: [";
                                        i18 = f12;
                                        TLRPC.TL_forumTopic f10 = usVar.getMessagesController().S1().f(M0.id, j13);
                                        if (f10 != null) {
                                            y9 = org.telegram.ui.Cells.f1.r(f10.title, " in ", y9, new StringBuilder());
                                        }
                                    } else {
                                        str4 = "showExtraNotifications: [";
                                        i18 = f12;
                                    }
                                    if (z19) {
                                        z19 = t3.q(M0);
                                    }
                                    str6 = y9;
                                } else if (ziVar.j3()) {
                                    boolean B4 = ziVar.B4();
                                    str6 = ziVar.b;
                                    i18 = f12;
                                    z20 = B4;
                                    ssVar = ssVar2;
                                    z21 = ziVar.f;
                                    fileLocation2 = null;
                                    z19 = false;
                                    str4 = "showExtraNotifications: [";
                                } else {
                                    if (r2.a) {
                                        a8.l("not found chat to show dialog notification " + j14);
                                    }
                                    sharedPreferences = c11;
                                    hVar6 = hVar;
                                    arrayList4 = arrayList;
                                    j15 = j29;
                                    notification3 = notification2;
                                }
                                user3 = null;
                                i19 = (j14 > 489000L ? 1 : (j14 == 489000L ? 0 : -1));
                                if (i19 == 0) {
                                }
                                user4 = user3;
                                i20 = i19;
                                fileLocation3 = fileLocation2;
                                fileLocation = fileLocation3;
                                String str15222 = str6;
                                chat = M0;
                                L0 = str15222;
                                user2 = user4;
                                if (i20 == 0) {
                                }
                            }
                        }
                        i32 = i16 + 1;
                        arrayList = arrayList4;
                        arrayList12 = arrayList15;
                        z14 = z18;
                        z15 = z17;
                        size = i14;
                        hVar11 = hVar4;
                        hVar12 = hVar5;
                        c11 = sharedPreferences;
                        e10 = j15;
                        b11 = notification3;
                        hVar = hVar6;
                    }
                    if (ziVar == null || !ziVar.J) {
                        i21 = 2131748029;
                    } else {
                        i21 = 2131748029;
                        if (!c11.getBoolean("EnableReactionsPreview", true)) {
                            L0 = bd.L0(2131748029);
                            fileLocation = null;
                            z19 = false;
                        }
                    }
                    if (z17) {
                        str7 = m5.z(j14) ? bd.L0(i21) : bd.L0(2131748026);
                        fileLocation8 = null;
                        z19 = false;
                    } else {
                        TLRPC.FileLocation fileLocation14 = fileLocation;
                        str7 = L0;
                        fileLocation8 = fileLocation14;
                    }
                    if (fileLocation8 != null) {
                        usVar.getFileLoader().getClass();
                        i22 = 2131748026;
                        file = w7.L(fileLocation8, true);
                        if (Build.VERSION.SDK_INT < 28) {
                            BitmapDrawable C = zb.D().C(fileLocation8);
                            if (C != null) {
                                bitmap5 = C.getBitmap();
                            } else {
                                try {
                                    if (file.exists()) {
                                        float L = 160.0f / g0.L(50.0f);
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
                        i22 = 2131748026;
                        bitmap = null;
                        file = null;
                    }
                    if (chat != null) {
                        if (file == null || !file.exists() || (i31 = Build.VERSION.SDK_INT) < 28) {
                            str9 = str4;
                            iconCompat3 = null;
                        } else {
                            if (j14 == 489001) {
                                iconCompat3 = IconCompat.d(t0.b, R.drawable.ic_launcher_dr);
                            } else {
                                if (i31 >= 28) {
                                    try {
                                        iconCompat3 = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new ms()));
                                    } catch (Throwable unused2) {
                                    }
                                }
                                iconCompat3 = null;
                            }
                            str9 = str4;
                        }
                        long j31 = -chat.id;
                        sharedPreferences = c11;
                        e0.k0 k0Var = new e0.k0();
                        k0Var.a = str7;
                        k0Var.b = iconCompat3;
                        str8 = str7;
                        k0Var.c = null;
                        k0Var.d = null;
                        k0Var.e = false;
                        k0Var.f = false;
                        hVar.k(k0Var, j31);
                    } else {
                        sharedPreferences = c11;
                        str8 = str7;
                        str9 = str4;
                    }
                    if ((!z21 || z20) && z19 && !az.C && j29 != j14 && !l10.y(j14) && hp.s1(usVar.currentAccount).N1(j14) <= 0) {
                        bitmap2 = bitmap;
                        Intent intent2 = new Intent(t0.b, (Class<?>) WearReplyReceiver.class);
                        intent2.putExtra("dialog_id", j14);
                        i23 = i18;
                        intent2.putExtra("max_id", i23);
                        intent2.putExtra("topic_id", j13);
                        intent2.putExtra("currentAccount", usVar.currentAccount);
                        if (arrayList3.isEmpty()) {
                            str10 = "max_id";
                            user6 = user2;
                            chat2 = chat;
                        } else {
                            ArrayList arrayList18 = new ArrayList();
                            user6 = user2;
                            chat2 = chat;
                            for (int i40 = 0; i40 < arrayList3.size(); i40++) {
                                zi ziVar5 = (zi) arrayList3.get(i40);
                                if (ziVar5 != null && ziVar5.Q4() && ziVar5.S2() && !ziVar5.O3()) {
                                    arrayList18.add(Integer.valueOf(ziVar5.f1()));
                                }
                            }
                            if (arrayList18.isEmpty()) {
                                str10 = "max_id";
                            } else {
                                int size4 = arrayList18.size();
                                int[] iArr = new int[size4];
                                str10 = "max_id";
                                for (int i41 = 0; i41 < size4; i41++) {
                                    iArr[i41] = ((Integer) arrayList18.get(i41)).intValue();
                                }
                                intent2.putExtra("voice_msg_ids", iArr);
                            }
                        }
                        PendingIntent broadcast = PendingIntent.getBroadcast(t0.b, num2.intValue(), intent2, 167772160);
                        e0.m0 m0Var = new e0.m0(bd.L0(2131746271), new Bundle(), new HashSet());
                        if (m5.z(j14)) {
                            z22 = false;
                            Z = bd.Z(2131746261, str8);
                        } else {
                            z22 = false;
                            Z = bd.Z(2131746254, str8);
                        }
                        e0.g gVar = new e0.g(R.drawable.ic_reply_icon, broadcast, Z);
                        gVar.f();
                        gVar.a = 1;
                        gVar.a(m0Var);
                        gVar.c = z22;
                        b10 = gVar.b();
                    } else {
                        str10 = "max_id";
                        bitmap2 = bitmap;
                        user6 = user2;
                        i23 = i18;
                        chat2 = chat;
                        b10 = null;
                    }
                    Integer num4 = (Integer) usVar.f.f(j14);
                    if (num4 == null) {
                        num4 = 0;
                    }
                    ss ssVar3 = ssVar;
                    int size5 = ssVar3.c ? usVar.E.size() : Math.max(num4.intValue(), arrayList3.size());
                    String format = (size5 <= 1 || Build.VERSION.SDK_INT >= 28) ? str8 : String.format("%1$s (%2$d)", str8, Integer.valueOf(size5));
                    int i42 = i23;
                    e0.k0 k0Var2 = (e0.k0) hVar.f(j29);
                    int i43 = Build.VERSION.SDK_INT;
                    if (i43 < 28 || k0Var2 != null) {
                        hVar7 = b10;
                    } else {
                        hVar7 = b10;
                        TLRPC.User a24 = usVar.getMessagesController().a2(Long.valueOf(j29));
                        if (a24 == null) {
                            a24 = usVar.getUserConfig().f();
                        }
                        if (a24 != null) {
                            try {
                                userProfilePhoto3 = a24.photo;
                            } catch (Throwable th2) {
                                th = th2;
                                j16 = j13;
                            }
                            if (userProfilePhoto3 != null && (fileLocation12 = userProfilePhoto3.photo_small) != null) {
                                j16 = j13;
                                try {
                                    if (fileLocation12.volume_id != 0 && fileLocation12.local_id != 0) {
                                        String L03 = bd.L0(2131750511);
                                        w7 fileLoader = usVar.getFileLoader();
                                        TLRPC.FileLocation fileLocation15 = a24.photo.photo_small;
                                        fileLoader.getClass();
                                        File L2 = w7.L(fileLocation15, true);
                                        if (usVar.getUserConfig().e() == 489001) {
                                            iconCompat2 = IconCompat.d(t0.b, R.drawable.ic_launcher_dr);
                                        } else {
                                            if (L2 != null && i43 >= 28) {
                                                try {
                                                    iconCompat2 = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(L2), new ms()));
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            iconCompat2 = null;
                                        }
                                        e0.k0 k0Var3 = new e0.k0();
                                        k0Var3.a = L03;
                                        k0Var3.b = iconCompat2;
                                        k0Var3.c = null;
                                        k0Var3.d = null;
                                        k0Var3.e = false;
                                        k0Var3.f = false;
                                        try {
                                            hVar.k(k0Var3, j29);
                                            k0Var2 = k0Var3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            k0Var2 = k0Var3;
                                            a8.f(th);
                                            e0.k0 k0Var4 = k0Var2;
                                            if (k0Var4 == null) {
                                            }
                                            i24 = Build.VERSION.SDK_INT;
                                            if (i24 >= 28) {
                                            }
                                            xVar.f(format);
                                            xVar.i = Boolean.valueOf(i24 >= 28 || (!z21 && m5.z(j14)) || l10.y(j14));
                                            StringBuilder sb5 = new StringBuilder();
                                            String[] strArr2 = new String[1];
                                            boolean[] zArr2 = new boolean[1];
                                            if (ssVar3.c) {
                                            }
                                            a0.h hVar13 = hVar;
                                            Intent intent3 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                                            intent3.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            intent3.setFlags(67108864);
                                            intent3.addCategory("android.intent.category.LAUNCHER");
                                            ziVar3 = ziVar2;
                                            if (ziVar2 == null) {
                                            }
                                            if (ziVar3 == null) {
                                            }
                                            if (ziVar3 == null) {
                                            }
                                            j22 = j17;
                                            if (ssVar3.c) {
                                            }
                                            j23 = j18;
                                            k2.p1.r(j23, a1.g.t(j22, "show extra notifications chatId ", " topicId "));
                                            if (j23 != 0) {
                                            }
                                            String str16 = str11;
                                            intent3.putExtra(str16, usVar.currentAccount);
                                            PendingIntent activity = PendingIntent.getActivity(t0.b, 0, intent3, 1140850688);
                                            e0.d0 d0Var = new e0.d0();
                                            e0.h hVar14 = hVar7;
                                            if (hVar7 != null) {
                                            }
                                            int i44 = i25;
                                            Intent intent4 = new Intent(t0.b, (Class<?>) AutoMessageHeardReceiver.class);
                                            intent4.addFlags(i15);
                                            intent4.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                            intent4.putExtra("dialog_id", j22);
                                            intent4.putExtra(str10, i42);
                                            intent4.putExtra(str16, usVar.currentAccount);
                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList19 = arrayList6;
                                            bitmap4 = bitmap3;
                                            e0.g gVar2 = new e0.g(R.drawable.msg_markread, PendingIntent.getBroadcast(t0.b, num2.intValue(), intent4, 167772160), bd.L0(2131748689));
                                            gVar2.a = 2;
                                            gVar2.c = false;
                                            e0.h b12 = gVar2.b();
                                            if (!m5.C(j22)) {
                                            }
                                            if (str14 == null) {
                                            }
                                            StringBuilder sb6 = new StringBuilder("tgaccount");
                                            long j32 = j15;
                                            sb6.append(j32);
                                            d0Var.b(sb6.toString());
                                            if (ssVar3.c) {
                                            }
                                            e0.q qVar2 = new e0.q(t0.b);
                                            qVar2.g(str12);
                                            ArrayList arrayList20 = arrayList10;
                                            qVar2.F.icon = R.drawable.notification;
                                            qVar2.f(sb2.toString());
                                            qVar2.h(16, true);
                                            qVar2.i = !ssVar3.c ? usVar.E.size() : arrayList20.size();
                                            qVar2.w = -15618822;
                                            qVar2.r = false;
                                            qVar2.F.when = j24;
                                            qVar2.k = true;
                                            qVar2.n(xVar2);
                                            qVar2.g = activity;
                                            qVar2.c(d0Var);
                                            qVar2.l(String.valueOf(Long.MAX_VALUE - j24));
                                            qVar2.h(8, (z12 && j22 == j10 && j23 == j11) ? false : true);
                                            qVar2.u = "msg";
                                            intent = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                            intent.putExtra("messageDate", i17);
                                            intent.putExtra("dialogId", j22);
                                            intent.putExtra(str16, usVar.currentAccount);
                                            if (ssVar3.c) {
                                            }
                                            if (ziVar3 != null) {
                                            }
                                            qVar2.F.deleteIntent = PendingIntent.getBroadcast(t0.b, num2.intValue(), intent, 167772160);
                                            if (z18) {
                                            }
                                            if (ziVar3 != null) {
                                            }
                                            keyboardInlineButton = null;
                                            tL_inlineButtonTypeCopy = null;
                                            if (keyboardInlineButton != null) {
                                            }
                                            j25 = ssVar3.a;
                                            if (j25 != 489000) {
                                            }
                                            if (arrayList15.size() != 1) {
                                            }
                                            if (m5.C(j22)) {
                                            }
                                            if (bitmap4 != null) {
                                            }
                                            if (!g0.p2(false)) {
                                            }
                                            if (chat2 == null) {
                                            }
                                            user7 = user6;
                                            boolean z27 = z18;
                                            Notification notification4 = notification2;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                            }
                                            a8.b("showExtraNotifications: holders.add " + j22);
                                            notification3 = notification4;
                                            z18 = z27;
                                            long j33 = j22;
                                            hVar6 = hVar13;
                                            rs rsVar = new rs(usVar, num2.intValue(), j33, ssVar3.c, str12, user7, chat2, qVar2, j11, str2, jArr, i3, uri, i10, z10, z11, z12, i11);
                                            arrayList4 = arrayList;
                                            arrayList4.add(rsVar);
                                            usVar.h.k(num2, j33);
                                            i32 = i16 + 1;
                                            arrayList = arrayList4;
                                            arrayList12 = arrayList15;
                                            z14 = z18;
                                            z15 = z17;
                                            size = i14;
                                            hVar11 = hVar4;
                                            hVar12 = hVar5;
                                            c11 = sharedPreferences;
                                            e10 = j15;
                                            b11 = notification3;
                                            hVar = hVar6;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                e0.k0 k0Var42 = k0Var2;
                                xVar = (k0Var42 == null && (ziVar != null || !(ziVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new e0.x(k0Var42) : new e0.x();
                                i24 = Build.VERSION.SDK_INT;
                                if (i24 >= 28 || ((m5.z(j14) && !z21) || l10.y(j14))) {
                                    xVar.f(format);
                                }
                                xVar.i = Boolean.valueOf(i24 >= 28 || (!z21 && m5.z(j14)) || l10.y(j14));
                                StringBuilder sb52 = new StringBuilder();
                                String[] strArr22 = new String[1];
                                boolean[] zArr22 = new boolean[1];
                                if (ssVar3.c) {
                                    ArrayList arrayList21 = new ArrayList();
                                    ArrayList arrayList22 = new ArrayList();
                                    Pair I = usVar.I(arrayList21, arrayList22);
                                    int intValue = ((Integer) I.first).intValue();
                                    boolean booleanValue = ((Boolean) I.second).booleanValue();
                                    if (booleanValue) {
                                        arrayList11 = arrayList22;
                                        j15 = j29;
                                        z23 = booleanValue;
                                        sb52.append(bd.G(intValue, "StoryNotificationHidden", new Object[0]));
                                    } else {
                                        j15 = j29;
                                        arrayList11 = arrayList22;
                                        z23 = booleanValue;
                                        if (arrayList21.isEmpty()) {
                                            a8.b(str9 + j14 + "] continue; story but names is empty");
                                            hVar6 = hVar;
                                            arrayList4 = arrayList;
                                            notification3 = notification2;
                                            i32 = i16 + 1;
                                            arrayList = arrayList4;
                                            arrayList12 = arrayList15;
                                            z14 = z18;
                                            z15 = z17;
                                            size = i14;
                                            hVar11 = hVar4;
                                            hVar12 = hVar5;
                                            c11 = sharedPreferences;
                                            e10 = j15;
                                            b11 = notification3;
                                            hVar = hVar6;
                                        } else if (arrayList21.size() == 1) {
                                            if (intValue == 1) {
                                                sb52.append(bd.N0("StoryNotificationSingle"));
                                            } else {
                                                sb52.append(bd.G(intValue, "StoryNotification1", arrayList21.get(0)));
                                            }
                                        } else if (arrayList21.size() == 2) {
                                            sb52.append(bd.Z(2131744612, arrayList21.get(0), arrayList21.get(1)));
                                        } else if (arrayList21.size() == 3 && usVar.E.size() == 3) {
                                            sb52.append(bd.Z(2131744611, k((String) arrayList21.get(0)), k((String) arrayList21.get(1)), k((String) arrayList21.get(2))));
                                        } else {
                                            sb52.append(bd.G(usVar.E.size() - 2, "StoryNotification4", k((String) arrayList21.get(0)), k((String) arrayList21.get(1))));
                                        }
                                    }
                                    String str17 = "currentAccount";
                                    long j34 = Long.MAX_VALUE;
                                    int i45 = 0;
                                    while (i45 < usVar.E.size()) {
                                        j34 = Math.min(((ts) usVar.E.get(i45)).e, j34);
                                        i45++;
                                        str17 = str17;
                                    }
                                    str11 = str17;
                                    xVar.i = Boolean.FALSE;
                                    if (arrayList21.size() != 1 || z23) {
                                        r5 = 0;
                                        G = bd.G(intValue, str5, new Object[0]);
                                    } else {
                                        r5 = 0;
                                        G = (String) arrayList21.get(0);
                                    }
                                    e0.k0 k0Var5 = new e0.k0();
                                    k0Var5.a = G;
                                    k0Var5.b = null;
                                    k0Var5.c = null;
                                    k0Var5.d = null;
                                    k0Var5.e = r5;
                                    k0Var5.f = r5;
                                    e0.w wVar = new e0.w(sb52, j34, k0Var5);
                                    ArrayList arrayList23 = xVar.e;
                                    arrayList23.add(wVar);
                                    if (arrayList23.size() > 25) {
                                        arrayList23.remove((int) r5);
                                    }
                                    arrayList5 = arrayList3;
                                    ziVar2 = ziVar;
                                    bitmap3 = !z23 ? F(arrayList11) : null;
                                    i25 = 0;
                                    arrayList6 = null;
                                    str12 = G;
                                    xVar2 = xVar;
                                    sb2 = sb52;
                                    j17 = j14;
                                    j18 = j16;
                                } else {
                                    j15 = j29;
                                    String str18 = str9;
                                    str11 = "currentAccount";
                                    int size6 = arrayList3.size() - 1;
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList24 = null;
                                    int i46 = 0;
                                    while (size6 >= 0) {
                                        int i47 = size6;
                                        zi ziVar6 = (zi) arrayList3.get(size6);
                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList25 = arrayList24;
                                        int i48 = i46;
                                        ArrayList arrayList26 = arrayList3;
                                        zi ziVar7 = ziVar;
                                        long b23 = zi.b2(usVar.currentAccount, ziVar6.k, usVar.getMessagesController().u2(ziVar6));
                                        if (j16 != b23) {
                                            StringBuilder t11 = a1.g.t(j14, str18, "] continue; topic id is not equal: topicId=");
                                            xVar4 = xVar;
                                            long j35 = j16;
                                            t11.append(j35);
                                            t11.append(" messageTopicId=");
                                            t11.append(b23);
                                            t11.append("; selfId=");
                                            t11.append(usVar.getUserConfig().e());
                                            a8.b(t11.toString());
                                            j20 = j35;
                                            sb3 = sb52;
                                            strArr = strArr22;
                                            hVar8 = hVar;
                                            str13 = str18;
                                            zArr = zArr22;
                                            j21 = j14;
                                        } else {
                                            e0.x xVar5 = xVar;
                                            String str19 = str18;
                                            long j36 = j16;
                                            String w10 = usVar.w(ziVar6, strArr22, zArr22);
                                            int i49 = (j14 > 489001L ? 1 : (j14 == 489001L ? 0 : -1));
                                            if (i49 == 0) {
                                                strArr22[0] = bd.L0(2131753121);
                                                strArr = strArr22;
                                                xVar3 = xVar5;
                                                i26 = 2131747970;
                                            } else if (j14 != 489000 || ziVar6.W0() == null) {
                                                strArr = strArr22;
                                                xVar3 = xVar5;
                                                i26 = 2131747970;
                                                if (j14 == j15) {
                                                    strArr[0] = str8;
                                                } else if (m5.z(j14) && ziVar6.k.from_scheduled) {
                                                    strArr[0] = bd.L0(2131747970);
                                                }
                                            } else {
                                                i26 = 2131747970;
                                                strArr = strArr22;
                                                xVar3 = xVar5;
                                                strArr[0] = usVar.getMessagesController().A1(ziVar6.W0().longValue());
                                            }
                                            if (w10 == null) {
                                                if (r2.a) {
                                                    a8.l("message text is null for " + ziVar6.f1() + " did = " + ziVar6.A0());
                                                }
                                                j20 = j36;
                                                sb3 = sb52;
                                                hVar8 = hVar;
                                                str13 = str19;
                                                zArr = zArr22;
                                                j21 = j14;
                                                xVar4 = xVar3;
                                            } else {
                                                if (sb52.length() > 0) {
                                                    sb52.append("\n\n");
                                                }
                                                if (j14 != j15 && ziVar6.k.from_scheduled && m5.E(j14)) {
                                                    String L04 = bd.L0(i26);
                                                    i27 = i49;
                                                    w10 = String.format("%1$s: %2$s", L04, w10);
                                                    sb52.append(w10);
                                                } else {
                                                    i27 = i49;
                                                    String str20 = strArr[0];
                                                    if (str20 != null) {
                                                        sb52.append(String.format("%1$s: %2$s", str20, w10));
                                                    } else {
                                                        sb52.append(w10);
                                                    }
                                                }
                                                String str21 = w10;
                                                int i50 = (j14 > 489000L ? 1 : (j14 == 489000L ? 0 : -1));
                                                if (i50 != 0 || ziVar6.W0() == null) {
                                                    if (!m5.E(j14)) {
                                                        if (z21) {
                                                            j19 = -j14;
                                                        } else if (m5.z(j14)) {
                                                            j19 = ziVar6.S1();
                                                        }
                                                    }
                                                    j19 = j14;
                                                } else {
                                                    j19 = ziVar6.W0().longValue();
                                                }
                                                str13 = str19;
                                                boolean[] zArr3 = zArr22;
                                                e0.k0 k0Var6 = (e0.k0) hVar.f(j19 + (j36 << 16));
                                                String str22 = strArr[0];
                                                zArr = zArr3;
                                                if (str22 == null) {
                                                    if (!z17) {
                                                        sb3 = sb52;
                                                    } else if (!m5.z(j14)) {
                                                        sb3 = sb52;
                                                        if (Build.VERSION.SDK_INT > 27) {
                                                            str22 = bd.L0(i22);
                                                        }
                                                    } else if (z21) {
                                                        sb3 = sb52;
                                                        if (Build.VERSION.SDK_INT > 27) {
                                                            str22 = bd.L0(i21);
                                                        }
                                                    } else {
                                                        sb3 = sb52;
                                                        str22 = bd.L0(2131748028);
                                                    }
                                                    str22 = "";
                                                } else {
                                                    sb3 = sb52;
                                                }
                                                if (k0Var6 == null || !TextUtils.equals(k0Var6.b(), str22)) {
                                                    if (!zArr[0] || m5.C(j14) || (i28 = Build.VERSION.SDK_INT) < 28) {
                                                        j20 = j36;
                                                        j21 = j14;
                                                    } else {
                                                        if (m5.E(j14) || z21) {
                                                            i29 = i50;
                                                            j20 = j36;
                                                            j21 = j14;
                                                            file2 = file;
                                                        } else {
                                                            j20 = j36;
                                                            long S1 = ziVar6.S1();
                                                            i29 = i50;
                                                            TLRPC.User a25 = usVar.getMessagesController().a2(Long.valueOf(S1));
                                                            if (a25 == null && (a25 = usVar.getMessagesStorage().k0(S1)) != null) {
                                                                usVar.getMessagesController().X3(a25, true, false);
                                                            }
                                                            if (a25 == null || (userProfilePhoto2 = a25.photo) == null || (fileLocation11 = userProfilePhoto2.photo_small) == null) {
                                                                j21 = j14;
                                                            } else {
                                                                j21 = j14;
                                                                if (fileLocation11.volume_id != 0 && fileLocation11.local_id != 0) {
                                                                    w7 fileLoader2 = usVar.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation16 = a25.photo.photo_small;
                                                                    fileLoader2.getClass();
                                                                    file2 = w7.L(fileLocation16, true);
                                                                }
                                                            }
                                                            file2 = null;
                                                        }
                                                        if (file2 == null && i29 == 0 && ziVar6.W0() != null) {
                                                            if (j19 >= 0) {
                                                                TLRPC.User a26 = usVar.getMessagesController().a2(Long.valueOf(j19));
                                                                if (a26 != null && (userProfilePhoto = a26.photo) != null && (fileLocation10 = userProfilePhoto.photo_small) != null && fileLocation10.volume_id != 0 && fileLocation10.local_id != 0) {
                                                                    w7 fileLoader3 = usVar.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation17 = a26.photo.photo_small;
                                                                    fileLoader3.getClass();
                                                                    file2 = w7.L(fileLocation17, true);
                                                                }
                                                            } else {
                                                                TLRPC.Chat M02 = usVar.getMessagesController().M0(Long.valueOf(-j19));
                                                                if (M02 != null && (chatPhoto = M02.photo) != null && (fileLocation9 = chatPhoto.photo_small) != null && fileLocation9.volume_id != 0 && fileLocation9.local_id != 0) {
                                                                    w7 fileLoader4 = usVar.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation18 = M02.photo.photo_small;
                                                                    fileLoader4.getClass();
                                                                    file2 = w7.L(fileLocation18, true);
                                                                }
                                                            }
                                                        }
                                                        if (i27 == 0) {
                                                            iconCompat = IconCompat.d(t0.b, R.drawable.ic_launcher_dr);
                                                        } else if (file2 != null && i28 >= 28) {
                                                            try {
                                                                iconCompat = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file2), new ms()));
                                                            } catch (Throwable unused4) {
                                                            }
                                                        }
                                                        k0Var6 = new e0.k0();
                                                        k0Var6.a = str22;
                                                        k0Var6.b = iconCompat;
                                                        k0Var6.c = null;
                                                        k0Var6.d = null;
                                                        c2 = 0;
                                                        k0Var6.e = false;
                                                        k0Var6.f = false;
                                                        hVar.k(k0Var6, j19);
                                                    }
                                                    iconCompat = null;
                                                    k0Var6 = new e0.k0();
                                                    k0Var6.a = str22;
                                                    k0Var6.b = iconCompat;
                                                    k0Var6.c = null;
                                                    k0Var6.d = null;
                                                    c2 = 0;
                                                    k0Var6.e = false;
                                                    k0Var6.f = false;
                                                    hVar.k(k0Var6, j19);
                                                } else {
                                                    j20 = j36;
                                                    j21 = j14;
                                                    c2 = 0;
                                                }
                                                if (m5.C(j21)) {
                                                    hVar8 = hVar;
                                                    xVar4 = xVar3;
                                                    e0.w wVar2 = new e0.w(str21, ziVar6.k.date * 1000, k0Var6);
                                                    ArrayList arrayList27 = xVar4.e;
                                                    arrayList27.add(wVar2);
                                                    if (arrayList27.size() > 25) {
                                                        arrayList27.remove(0);
                                                    }
                                                } else {
                                                    if (!zArr[c2] || Build.VERSION.SDK_INT < 28 || ((ActivityManager) t0.b.getSystemService("activity")).isLowRamDevice() || z17 || ziVar6.m4() || !(ziVar6.D == 1 || ziVar6.u4())) {
                                                        hVar8 = hVar;
                                                    } else {
                                                        w7 fileLoader5 = usVar.getFileLoader();
                                                        TLRPC.Message message2 = ziVar6.k;
                                                        fileLoader5.getClass();
                                                        File M = w7.M(message2);
                                                        if (M.exists() && ziVar6.u2()) {
                                                            File file4 = new File(M.getParentFile(), M.getName() + ".blur.jpg");
                                                            if (file4.exists()) {
                                                                hVar8 = hVar;
                                                            } else {
                                                                try {
                                                                    Bitmap decodeFile = BitmapFactory.decodeFile(M.getAbsolutePath());
                                                                    Bitmap C2 = Utilities.C(decodeFile);
                                                                    decodeFile.recycle();
                                                                    createScaledBitmap = Bitmap.createScaledBitmap(C2, decodeFile.getWidth(), decodeFile.getHeight(), true);
                                                                    Utilities.stackBlurBitmap(createScaledBitmap, 5);
                                                                    C2.recycle();
                                                                    canvas = new Canvas(createScaledBitmap);
                                                                    usVar.g0.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                                                                    hVar8 = hVar;
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                    hVar8 = hVar;
                                                                }
                                                                try {
                                                                    usVar.g0.setBounds(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                                                                    usVar.g0.draw(canvas);
                                                                    FileOutputStream fileOutputStream = new FileOutputStream(file4);
                                                                    createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                                                    fileOutputStream.close();
                                                                    createScaledBitmap.recycle();
                                                                    file3 = file4;
                                                                    M = file3;
                                                                } catch (Exception e12) {
                                                                    e = e12;
                                                                    a8.f(e);
                                                                    file3 = file4;
                                                                    e0.w wVar3 = new e0.w(str21, ziVar6.k.date * 1000, k0Var6);
                                                                    String str23 = !ziVar6.u4() ? "image/webp" : "image/jpeg";
                                                                    if (M.exists()) {
                                                                    }
                                                                    if (d != null) {
                                                                    }
                                                                    xVar4 = xVar3;
                                                                    e0.w wVar4 = new e0.w(str21, ziVar6.k.date * 1000, k0Var6);
                                                                    arrayList9 = xVar4.e;
                                                                    arrayList9.add(wVar4);
                                                                    if (arrayList9.size() > 25) {
                                                                    }
                                                                    c10 = 0;
                                                                    if (zArr[c10]) {
                                                                    }
                                                                    if (j21 == 777000) {
                                                                    }
                                                                    arrayList7 = arrayList25;
                                                                    i46 = i48;
                                                                    size6 = i47 - 1;
                                                                    xVar = xVar4;
                                                                    hVar = hVar8;
                                                                    str18 = str13;
                                                                    arrayList3 = arrayList26;
                                                                    ziVar = ziVar7;
                                                                    strArr22 = strArr;
                                                                    zArr22 = zArr;
                                                                    sb52 = sb3;
                                                                    j16 = j20;
                                                                    j14 = j21;
                                                                    arrayList24 = arrayList7;
                                                                }
                                                            }
                                                            file3 = file4;
                                                        } else {
                                                            hVar8 = hVar;
                                                            file3 = null;
                                                        }
                                                        e0.w wVar32 = new e0.w(str21, ziVar6.k.date * 1000, k0Var6);
                                                        String str232 = !ziVar6.u4() ? "image/webp" : "image/jpeg";
                                                        if (M.exists()) {
                                                            if (usVar.getFileLoader().T(M.getName())) {
                                                                Uri.Builder scheme = new Uri.Builder().scheme("content");
                                                                if (NotificationImageProvider.d == null) {
                                                                    t0.d();
                                                                    NotificationImageProvider.d = "org.telegram.messenger.beta.notification_image_provider";
                                                                }
                                                                d = scheme.authority(NotificationImageProvider.d).appendPath("msg_media_raw").appendPath(usVar.currentAccount + "").appendPath(M.getName()).appendQueryParameter("final_path", M.getAbsolutePath()).build();
                                                            }
                                                            d = null;
                                                        } else {
                                                            try {
                                                                Context context = t0.b;
                                                                StringBuilder sb7 = new StringBuilder();
                                                                t0.d();
                                                                sb7.append("org.telegram.messenger.beta");
                                                                sb7.append(".provider");
                                                                d = FileProvider.d(context, sb7.toString(), M);
                                                            } catch (Exception e13) {
                                                                a8.f(e13);
                                                            }
                                                        }
                                                        if (d != null) {
                                                            wVar32.e = str232;
                                                            wVar32.f = d;
                                                            xVar4 = xVar3;
                                                            ArrayList arrayList28 = xVar4.e;
                                                            arrayList28.add(wVar32);
                                                            if (arrayList28.size() > 25) {
                                                                arrayList28.remove(0);
                                                            }
                                                            t0.b.grantUriPermission("com.android.systemui", d, 1);
                                                            g0.i3(new pq(12, d, file3), 20000L);
                                                            if (!TextUtils.isEmpty(ziVar6.z)) {
                                                                e0.w wVar5 = new e0.w(ziVar6.z, ziVar6.k.date * 1000, k0Var6);
                                                                ArrayList arrayList29 = xVar4.e;
                                                                arrayList29.add(wVar5);
                                                                if (arrayList29.size() > 25) {
                                                                    arrayList29.remove(0);
                                                                }
                                                            }
                                                            c10 = 0;
                                                            if (zArr[c10] && !z17 && ziVar6.Q4()) {
                                                                arrayList8 = (ArrayList) xVar4.d();
                                                                if (!arrayList8.isEmpty()) {
                                                                    w7 fileLoader6 = usVar.getFileLoader();
                                                                    TLRPC.Message message3 = ziVar6.k;
                                                                    fileLoader6.getClass();
                                                                    File M2 = w7.M(message3);
                                                                    if (M2.exists()) {
                                                                        if (Build.VERSION.SDK_INT >= 24) {
                                                                            try {
                                                                                Context context2 = t0.b;
                                                                                StringBuilder sb8 = new StringBuilder();
                                                                                t0.d();
                                                                                sb8.append("org.telegram.messenger.beta");
                                                                                sb8.append(".provider");
                                                                                uri2 = FileProvider.d(context2, sb8.toString(), M2);
                                                                            } catch (Exception unused5) {
                                                                                uri2 = null;
                                                                            }
                                                                        } else {
                                                                            uri2 = Uri.fromFile(M2);
                                                                        }
                                                                        if (uri2 != null) {
                                                                            e0.w wVar6 = (e0.w) k2.p1.h(1, arrayList8);
                                                                            wVar6.e = "audio/ogg";
                                                                            wVar6.f = uri2;
                                                                        }
                                                                    } else if (ziVar6.F0() != null) {
                                                                        String s6 = w7.s(ziVar6.F0());
                                                                        if (!usVar.s.contains(s6)) {
                                                                            usVar.s.add(s6);
                                                                            usVar.getFileLoader().X(ziVar6.F0(), ziVar6, 3, 0);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    xVar4 = xVar3;
                                                    e0.w wVar42 = new e0.w(str21, ziVar6.k.date * 1000, k0Var6);
                                                    arrayList9 = xVar4.e;
                                                    arrayList9.add(wVar42);
                                                    if (arrayList9.size() > 25) {
                                                        c10 = 0;
                                                        arrayList9.remove(0);
                                                        if (zArr[c10]) {
                                                            arrayList8 = (ArrayList) xVar4.d();
                                                            if (!arrayList8.isEmpty()) {
                                                            }
                                                        }
                                                    }
                                                    c10 = 0;
                                                    if (zArr[c10]) {
                                                    }
                                                }
                                                if (j21 == 777000) {
                                                    TLRPC.ReplyMarkup replyMarkup2 = ziVar6.k.reply_markup;
                                                    if (replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) {
                                                        arrayList7 = ((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows;
                                                        i46 = ziVar6.f1();
                                                        size6 = i47 - 1;
                                                        xVar = xVar4;
                                                        hVar = hVar8;
                                                        str18 = str13;
                                                        arrayList3 = arrayList26;
                                                        ziVar = ziVar7;
                                                        strArr22 = strArr;
                                                        zArr22 = zArr;
                                                        sb52 = sb3;
                                                        j16 = j20;
                                                        j14 = j21;
                                                        arrayList24 = arrayList7;
                                                    }
                                                }
                                                arrayList7 = arrayList25;
                                                i46 = i48;
                                                size6 = i47 - 1;
                                                xVar = xVar4;
                                                hVar = hVar8;
                                                str18 = str13;
                                                arrayList3 = arrayList26;
                                                ziVar = ziVar7;
                                                strArr22 = strArr;
                                                zArr22 = zArr;
                                                sb52 = sb3;
                                                j16 = j20;
                                                j14 = j21;
                                                arrayList24 = arrayList7;
                                            }
                                        }
                                        arrayList7 = arrayList25;
                                        i46 = i48;
                                        size6 = i47 - 1;
                                        xVar = xVar4;
                                        hVar = hVar8;
                                        str18 = str13;
                                        arrayList3 = arrayList26;
                                        ziVar = ziVar7;
                                        strArr22 = strArr;
                                        zArr22 = zArr;
                                        sb52 = sb3;
                                        j16 = j20;
                                        j14 = j21;
                                        arrayList24 = arrayList7;
                                    }
                                    arrayList5 = arrayList3;
                                    ziVar2 = ziVar;
                                    bitmap3 = bitmap2;
                                    str12 = str8;
                                    arrayList6 = arrayList24;
                                    i25 = i46;
                                    sb2 = sb52;
                                    j17 = j14;
                                    j18 = j16;
                                    xVar2 = xVar;
                                }
                                a0.h hVar132 = hVar;
                                Intent intent32 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                                intent32.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent32.setFlags(67108864);
                                intent32.addCategory("android.intent.category.LAUNCHER");
                                ziVar3 = ziVar2;
                                if (ziVar2 == null && ziVar3.O) {
                                    intent32.putExtra("oauth_url", ziVar3.b);
                                } else if (ziVar3 == null && ziVar3.J) {
                                    intent32.putExtra("storyId", Math.abs(ziVar3.f1()));
                                } else {
                                    if (ziVar3 == null && ziVar3.N) {
                                        if (j17 < 0) {
                                            j22 = j17;
                                            intent32.putExtra("chatId", -j22);
                                        } else {
                                            j22 = j17;
                                            if (j17 > 0) {
                                                intent32.putExtra("userId", j22);
                                            }
                                        }
                                        intent32.putExtra("storyId", Math.abs(ziVar3.f1()));
                                    } else {
                                        j22 = j17;
                                        if (ssVar3.c) {
                                            long[] jArr2 = new long[usVar.E.size()];
                                            for (int i51 = 0; i51 < usVar.E.size(); i51++) {
                                                jArr2[i51] = ((ts) usVar.E.get(i51)).a;
                                            }
                                            intent32.putExtra("storyDialogIds", jArr2);
                                        } else if (m5.C(j22)) {
                                            intent32.putExtra("encId", m5.h(j22));
                                        } else if (m5.E(j22)) {
                                            intent32.putExtra("userId", j22);
                                        } else {
                                            intent32.putExtra("chatId", -j22);
                                        }
                                    }
                                    j23 = j18;
                                    k2.p1.r(j23, a1.g.t(j22, "show extra notifications chatId ", " topicId "));
                                    if (j23 != 0) {
                                        intent32.putExtra("topicId", j23);
                                    }
                                    String str162 = str11;
                                    intent32.putExtra(str162, usVar.currentAccount);
                                    PendingIntent activity2 = PendingIntent.getActivity(t0.b, 0, intent32, 1140850688);
                                    e0.d0 d0Var2 = new e0.d0();
                                    e0.h hVar142 = hVar7;
                                    if (hVar7 != null) {
                                        d0Var2.a(hVar142);
                                    }
                                    int i442 = i25;
                                    Intent intent42 = new Intent(t0.b, (Class<?>) AutoMessageHeardReceiver.class);
                                    intent42.addFlags(i15);
                                    intent42.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                    intent42.putExtra("dialog_id", j22);
                                    intent42.putExtra(str10, i42);
                                    intent42.putExtra(str162, usVar.currentAccount);
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList192 = arrayList6;
                                    bitmap4 = bitmap3;
                                    e0.g gVar22 = new e0.g(R.drawable.msg_markread, PendingIntent.getBroadcast(t0.b, num2.intValue(), intent42, 167772160), bd.L0(2131748689));
                                    gVar22.a = 2;
                                    gVar22.c = false;
                                    e0.h b122 = gVar22.b();
                                    if (!m5.C(j22)) {
                                        hVar9 = hVar142;
                                        str14 = j22 != o0 ? "tgenc" + m5.h(j22) + "_" + i42 : null;
                                    } else if (m5.E(j22)) {
                                        str14 = "tguser" + j22 + "_" + i42;
                                        hVar9 = hVar142;
                                    } else {
                                        StringBuilder sb9 = new StringBuilder("tgchat");
                                        hVar9 = hVar142;
                                        sb9.append(-j22);
                                        sb9.append("_");
                                        sb9.append(i42);
                                        str14 = sb9.toString();
                                    }
                                    if (str14 == null) {
                                        d0Var2.g = str14;
                                        e0.d0 d0Var3 = new e0.d0();
                                        d0Var3.g = "summary_".concat(str14);
                                        qVar.c(d0Var3);
                                    }
                                    StringBuilder sb62 = new StringBuilder("tgaccount");
                                    long j322 = j15;
                                    sb62.append(j322);
                                    d0Var2.b(sb62.toString());
                                    if (ssVar3.c) {
                                        hVar10 = b122;
                                        j15 = j322;
                                        arrayList10 = arrayList5;
                                        j24 = ((zi) arrayList10.get(0)).k.date * 1000;
                                    } else {
                                        j15 = j322;
                                        j24 = Long.MAX_VALUE;
                                        int i52 = 0;
                                        while (i52 < usVar.E.size()) {
                                            j24 = Math.min(((ts) usVar.E.get(i52)).e, j24);
                                            i52++;
                                            b122 = b122;
                                        }
                                        hVar10 = b122;
                                        arrayList10 = arrayList5;
                                    }
                                    e0.q qVar22 = new e0.q(t0.b);
                                    qVar22.g(str12);
                                    ArrayList arrayList202 = arrayList10;
                                    qVar22.F.icon = R.drawable.notification;
                                    qVar22.f(sb2.toString());
                                    qVar22.h(16, true);
                                    qVar22.i = !ssVar3.c ? usVar.E.size() : arrayList202.size();
                                    qVar22.w = -15618822;
                                    qVar22.r = false;
                                    qVar22.F.when = j24;
                                    qVar22.k = true;
                                    qVar22.n(xVar2);
                                    qVar22.g = activity2;
                                    qVar22.c(d0Var2);
                                    qVar22.l(String.valueOf(Long.MAX_VALUE - j24));
                                    qVar22.h(8, (z12 && j22 == j10 && j23 == j11) ? false : true);
                                    qVar22.u = "msg";
                                    intent = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                    intent.putExtra("messageDate", i17);
                                    intent.putExtra("dialogId", j22);
                                    intent.putExtra(str162, usVar.currentAccount);
                                    if (ssVar3.c) {
                                        intent.putExtra("story", true);
                                    }
                                    if (ziVar3 != null && ziVar3.J) {
                                        intent.putExtra("storyReaction", true);
                                    }
                                    qVar22.F.deleteIntent = PendingIntent.getBroadcast(t0.b, num2.intValue(), intent, 167772160);
                                    if (z18) {
                                        qVar22.q = usVar.f0;
                                        qVar22.i();
                                    }
                                    if (ziVar3 != null && (message = ziVar3.k) != null) {
                                        replyMarkup = message.reply_markup;
                                        if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                            TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                                            tL_inlineButtonTypeCopy = null;
                                            TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = null;
                                            for (int i53 = 0; i53 < tL_replyInlineMarkup.rows.size(); i53++) {
                                                int i54 = 0;
                                                while (true) {
                                                    if (i54 >= tL_replyInlineMarkup.rows.get(i53).buttons.size()) {
                                                        break;
                                                    }
                                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton3 = tL_replyInlineMarkup.rows.get(i53).buttons.get(i54);
                                                    TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy2 = (TL_keyboard.TL_inlineButtonTypeCopy) dg.c.a(keyboardInlineButton3, TL_keyboard.TL_inlineButtonTypeCopy.class);
                                                    if (tL_inlineButtonTypeCopy2 != null) {
                                                        keyboardInlineButton2 = keyboardInlineButton3;
                                                        tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                                                        break;
                                                    } else {
                                                        i54++;
                                                        tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                                                    }
                                                }
                                                if (keyboardInlineButton2 != null) {
                                                    break;
                                                }
                                            }
                                            keyboardInlineButton = keyboardInlineButton2;
                                            if (keyboardInlineButton != null) {
                                                Intent intent5 = new Intent(t0.b, (Class<?>) CopyCodeReceiver.class);
                                                intent5.addFlags(32);
                                                intent5.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                                                intent5.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                                                e0.g gVar3 = new e0.g(R.drawable.msg_copy, PendingIntent.getBroadcast(t0.b, num2.intValue(), intent5, 167772160), keyboardInlineButton.text);
                                                gVar3.c = false;
                                                qVar22.b.add(gVar3.b());
                                            }
                                            j25 = ssVar3.a;
                                            if (j25 != 489000 && j25 != 489001) {
                                                if (hVar9 != null) {
                                                    qVar22.b.add(hVar9);
                                                }
                                                if (!z17 && !ssVar3.c && (ziVar3 == null || !ziVar3.J)) {
                                                    qVar22.b.add(hVar10);
                                                }
                                            }
                                            if (arrayList15.size() != 1 && !TextUtils.isEmpty(str) && !ssVar3.c) {
                                                qVar22.o(str);
                                            }
                                            if (m5.C(j22)) {
                                                qVar22.k();
                                            }
                                            if (bitmap4 != null) {
                                                qVar22.j(bitmap4);
                                            }
                                            if (!g0.p2(false) && !az.C && arrayList192 != null) {
                                                size3 = arrayList192.size();
                                                i30 = 0;
                                                while (i30 < size3) {
                                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList30 = arrayList192;
                                                    TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList30.get(i30);
                                                    int size7 = keyboardInlineButtonRow.buttons.size();
                                                    int i55 = 0;
                                                    while (i55 < size7) {
                                                        TL_keyboard.KeyboardInlineButton keyboardInlineButton4 = keyboardInlineButtonRow.buttons.get(i55);
                                                        int i56 = size3;
                                                        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) dg.c.a(keyboardInlineButton4, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                        int i57 = i55;
                                                        if (tL_inlineButtonTypeCallback != null) {
                                                            Intent intent6 = new Intent(t0.b, (Class<?>) NotificationCallbackReceiver.class);
                                                            intent6.putExtra(str162, usVar.currentAccount);
                                                            intent6.putExtra("did", j22);
                                                            byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                            if (bArr != null) {
                                                                intent6.putExtra("data", bArr);
                                                            }
                                                            intent6.putExtra("mid", i442);
                                                            String str24 = keyboardInlineButton4.text;
                                                            Context context3 = t0.b;
                                                            int i58 = usVar.I;
                                                            usVar.I = i58 + 1;
                                                            qVar22.a(0, PendingIntent.getBroadcast(context3, i58, intent6, 167772160), str24);
                                                        }
                                                        i55 = i57 + 1;
                                                        size3 = i56;
                                                    }
                                                    i30++;
                                                    arrayList192 = arrayList30;
                                                }
                                            }
                                            if (chat2 == null || user6 == null) {
                                                user7 = user6;
                                            } else {
                                                user7 = user6;
                                                String str25 = user7.phone;
                                                if (str25 != null && str25.length() > 0) {
                                                    String str26 = "tel:+" + user7.phone;
                                                    if (str26 != null && !str26.isEmpty()) {
                                                        qVar22.G.add(str26);
                                                    }
                                                }
                                            }
                                            boolean z272 = z18;
                                            Notification notification42 = notification2;
                                            if (Build.VERSION.SDK_INT >= 26) {
                                                W(notification42, qVar22, z272);
                                            }
                                            a8.b("showExtraNotifications: holders.add " + j22);
                                            notification3 = notification42;
                                            z18 = z272;
                                            long j332 = j22;
                                            hVar6 = hVar132;
                                            rs rsVar2 = new rs(usVar, num2.intValue(), j332, ssVar3.c, str12, user7, chat2, qVar22, j11, str2, jArr, i3, uri, i10, z10, z11, z12, i11);
                                            arrayList4 = arrayList;
                                            arrayList4.add(rsVar2);
                                            usVar.h.k(num2, j332);
                                            i32 = i16 + 1;
                                            arrayList = arrayList4;
                                            arrayList12 = arrayList15;
                                            z14 = z18;
                                            z15 = z17;
                                            size = i14;
                                            hVar11 = hVar4;
                                            hVar12 = hVar5;
                                            c11 = sharedPreferences;
                                            e10 = j15;
                                            b11 = notification3;
                                            hVar = hVar6;
                                        }
                                    }
                                    keyboardInlineButton = null;
                                    tL_inlineButtonTypeCopy = null;
                                    if (keyboardInlineButton != null) {
                                    }
                                    j25 = ssVar3.a;
                                    if (j25 != 489000) {
                                        if (hVar9 != null) {
                                        }
                                        if (!z17) {
                                            qVar22.b.add(hVar10);
                                        }
                                    }
                                    if (arrayList15.size() != 1) {
                                    }
                                    if (m5.C(j22)) {
                                    }
                                    if (bitmap4 != null) {
                                    }
                                    if (!g0.p2(false)) {
                                        size3 = arrayList192.size();
                                        i30 = 0;
                                        while (i30 < size3) {
                                        }
                                    }
                                    if (chat2 == null) {
                                    }
                                    user7 = user6;
                                    boolean z2722 = z18;
                                    Notification notification422 = notification2;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                    }
                                    a8.b("showExtraNotifications: holders.add " + j22);
                                    notification3 = notification422;
                                    z18 = z2722;
                                    long j3322 = j22;
                                    hVar6 = hVar132;
                                    rs rsVar22 = new rs(usVar, num2.intValue(), j3322, ssVar3.c, str12, user7, chat2, qVar22, j11, str2, jArr, i3, uri, i10, z10, z11, z12, i11);
                                    arrayList4 = arrayList;
                                    arrayList4.add(rsVar22);
                                    usVar.h.k(num2, j3322);
                                    i32 = i16 + 1;
                                    arrayList = arrayList4;
                                    arrayList12 = arrayList15;
                                    z14 = z18;
                                    z15 = z17;
                                    size = i14;
                                    hVar11 = hVar4;
                                    hVar12 = hVar5;
                                    c11 = sharedPreferences;
                                    e10 = j15;
                                    b11 = notification3;
                                    hVar = hVar6;
                                }
                                j22 = j17;
                                j23 = j18;
                                k2.p1.r(j23, a1.g.t(j22, "show extra notifications chatId ", " topicId "));
                                if (j23 != 0) {
                                }
                                String str1622 = str11;
                                intent32.putExtra(str1622, usVar.currentAccount);
                                PendingIntent activity22 = PendingIntent.getActivity(t0.b, 0, intent32, 1140850688);
                                e0.d0 d0Var22 = new e0.d0();
                                e0.h hVar1422 = hVar7;
                                if (hVar7 != null) {
                                }
                                int i4422 = i25;
                                Intent intent422 = new Intent(t0.b, (Class<?>) AutoMessageHeardReceiver.class);
                                intent422.addFlags(i15);
                                intent422.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                intent422.putExtra("dialog_id", j22);
                                intent422.putExtra(str10, i42);
                                intent422.putExtra(str1622, usVar.currentAccount);
                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList1922 = arrayList6;
                                bitmap4 = bitmap3;
                                e0.g gVar222 = new e0.g(R.drawable.msg_markread, PendingIntent.getBroadcast(t0.b, num2.intValue(), intent422, 167772160), bd.L0(2131748689));
                                gVar222.a = 2;
                                gVar222.c = false;
                                e0.h b1222 = gVar222.b();
                                if (!m5.C(j22)) {
                                }
                                if (str14 == null) {
                                }
                                StringBuilder sb622 = new StringBuilder("tgaccount");
                                long j3222 = j15;
                                sb622.append(j3222);
                                d0Var22.b(sb622.toString());
                                if (ssVar3.c) {
                                }
                                e0.q qVar222 = new e0.q(t0.b);
                                qVar222.g(str12);
                                ArrayList arrayList2022 = arrayList10;
                                qVar222.F.icon = R.drawable.notification;
                                qVar222.f(sb2.toString());
                                qVar222.h(16, true);
                                qVar222.i = !ssVar3.c ? usVar.E.size() : arrayList2022.size();
                                qVar222.w = -15618822;
                                qVar222.r = false;
                                qVar222.F.when = j24;
                                qVar222.k = true;
                                qVar222.n(xVar2);
                                qVar222.g = activity22;
                                qVar222.c(d0Var22);
                                qVar222.l(String.valueOf(Long.MAX_VALUE - j24));
                                qVar222.h(8, (z12 && j22 == j10 && j23 == j11) ? false : true);
                                qVar222.u = "msg";
                                intent = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                intent.putExtra("messageDate", i17);
                                intent.putExtra("dialogId", j22);
                                intent.putExtra(str1622, usVar.currentAccount);
                                if (ssVar3.c) {
                                }
                                if (ziVar3 != null) {
                                    intent.putExtra("storyReaction", true);
                                }
                                qVar222.F.deleteIntent = PendingIntent.getBroadcast(t0.b, num2.intValue(), intent, 167772160);
                                if (z18) {
                                }
                                if (ziVar3 != null) {
                                    replyMarkup = message.reply_markup;
                                    if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                    }
                                }
                                keyboardInlineButton = null;
                                tL_inlineButtonTypeCopy = null;
                                if (keyboardInlineButton != null) {
                                }
                                j25 = ssVar3.a;
                                if (j25 != 489000) {
                                }
                                if (arrayList15.size() != 1) {
                                }
                                if (m5.C(j22)) {
                                }
                                if (bitmap4 != null) {
                                }
                                if (!g0.p2(false)) {
                                }
                                if (chat2 == null) {
                                }
                                user7 = user6;
                                boolean z27222 = z18;
                                Notification notification4222 = notification2;
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                a8.b("showExtraNotifications: holders.add " + j22);
                                notification3 = notification4222;
                                z18 = z27222;
                                long j33222 = j22;
                                hVar6 = hVar132;
                                rs rsVar222 = new rs(usVar, num2.intValue(), j33222, ssVar3.c, str12, user7, chat2, qVar222, j11, str2, jArr, i3, uri, i10, z10, z11, z12, i11);
                                arrayList4 = arrayList;
                                arrayList4.add(rsVar222);
                                usVar.h.k(num2, j33222);
                                i32 = i16 + 1;
                                arrayList = arrayList4;
                                arrayList12 = arrayList15;
                                z14 = z18;
                                z15 = z17;
                                size = i14;
                                hVar11 = hVar4;
                                hVar12 = hVar5;
                                c11 = sharedPreferences;
                                e10 = j15;
                                b11 = notification3;
                                hVar = hVar6;
                            }
                        }
                    }
                    j16 = j13;
                    e0.k0 k0Var422 = k0Var2;
                    if (k0Var422 == null) {
                    }
                    i24 = Build.VERSION.SDK_INT;
                    if (i24 >= 28) {
                    }
                    xVar.f(format);
                    xVar.i = Boolean.valueOf(i24 >= 28 || (!z21 && m5.z(j14)) || l10.y(j14));
                    StringBuilder sb522 = new StringBuilder();
                    String[] strArr222 = new String[1];
                    boolean[] zArr222 = new boolean[1];
                    if (ssVar3.c) {
                    }
                    a0.h hVar1322 = hVar;
                    Intent intent322 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                    intent322.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    intent322.setFlags(67108864);
                    intent322.addCategory("android.intent.category.LAUNCHER");
                    ziVar3 = ziVar2;
                    if (ziVar2 == null) {
                    }
                    if (ziVar3 == null) {
                    }
                    if (ziVar3 == null) {
                    }
                    j22 = j17;
                    if (ssVar3.c) {
                    }
                    j23 = j18;
                    k2.p1.r(j23, a1.g.t(j22, "show extra notifications chatId ", " topicId "));
                    if (j23 != 0) {
                    }
                    String str16222 = str11;
                    intent322.putExtra(str16222, usVar.currentAccount);
                    PendingIntent activity222 = PendingIntent.getActivity(t0.b, 0, intent322, 1140850688);
                    e0.d0 d0Var222 = new e0.d0();
                    e0.h hVar14222 = hVar7;
                    if (hVar7 != null) {
                    }
                    int i44222 = i25;
                    Intent intent4222 = new Intent(t0.b, (Class<?>) AutoMessageHeardReceiver.class);
                    intent4222.addFlags(i15);
                    intent4222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                    intent4222.putExtra("dialog_id", j22);
                    intent4222.putExtra(str10, i42);
                    intent4222.putExtra(str16222, usVar.currentAccount);
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList19222 = arrayList6;
                    bitmap4 = bitmap3;
                    e0.g gVar2222 = new e0.g(R.drawable.msg_markread, PendingIntent.getBroadcast(t0.b, num2.intValue(), intent4222, 167772160), bd.L0(2131748689));
                    gVar2222.a = 2;
                    gVar2222.c = false;
                    e0.h b12222 = gVar2222.b();
                    if (!m5.C(j22)) {
                    }
                    if (str14 == null) {
                    }
                    StringBuilder sb6222 = new StringBuilder("tgaccount");
                    long j32222 = j15;
                    sb6222.append(j32222);
                    d0Var222.b(sb6222.toString());
                    if (ssVar3.c) {
                    }
                    e0.q qVar2222 = new e0.q(t0.b);
                    qVar2222.g(str12);
                    ArrayList arrayList20222 = arrayList10;
                    qVar2222.F.icon = R.drawable.notification;
                    qVar2222.f(sb2.toString());
                    qVar2222.h(16, true);
                    qVar2222.i = !ssVar3.c ? usVar.E.size() : arrayList20222.size();
                    qVar2222.w = -15618822;
                    qVar2222.r = false;
                    qVar2222.F.when = j24;
                    qVar2222.k = true;
                    qVar2222.n(xVar2);
                    qVar2222.g = activity222;
                    qVar2222.c(d0Var222);
                    qVar2222.l(String.valueOf(Long.MAX_VALUE - j24));
                    qVar2222.h(8, (z12 && j22 == j10 && j23 == j11) ? false : true);
                    qVar2222.u = "msg";
                    intent = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                    intent.putExtra("messageDate", i17);
                    intent.putExtra("dialogId", j22);
                    intent.putExtra(str16222, usVar.currentAccount);
                    if (ssVar3.c) {
                    }
                    if (ziVar3 != null) {
                    }
                    qVar2222.F.deleteIntent = PendingIntent.getBroadcast(t0.b, num2.intValue(), intent, 167772160);
                    if (z18) {
                    }
                    if (ziVar3 != null) {
                    }
                    keyboardInlineButton = null;
                    tL_inlineButtonTypeCopy = null;
                    if (keyboardInlineButton != null) {
                    }
                    j25 = ssVar3.a;
                    if (j25 != 489000) {
                    }
                    if (arrayList15.size() != 1) {
                    }
                    if (m5.C(j22)) {
                    }
                    if (bitmap4 != null) {
                    }
                    if (!g0.p2(false)) {
                    }
                    if (chat2 == null) {
                    }
                    user7 = user6;
                    boolean z272222 = z18;
                    Notification notification42222 = notification2;
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    a8.b("showExtraNotifications: holders.add " + j22);
                    notification3 = notification42222;
                    z18 = z272222;
                    long j332222 = j22;
                    hVar6 = hVar1322;
                    rs rsVar2222 = new rs(usVar, num2.intValue(), j332222, ssVar3.c, str12, user7, chat2, qVar2222, j11, str2, jArr, i3, uri, i10, z10, z11, z12, i11);
                    arrayList4 = arrayList;
                    arrayList4.add(rsVar2222);
                    usVar.h.k(num2, j332222);
                    i32 = i16 + 1;
                    arrayList = arrayList4;
                    arrayList12 = arrayList15;
                    z14 = z18;
                    z15 = z17;
                    size = i14;
                    hVar11 = hVar4;
                    hVar12 = hVar5;
                    c11 = sharedPreferences;
                    e10 = j15;
                    b11 = notification3;
                    hVar = hVar6;
                }
                z16 = z14;
                Notification notification5 = b11;
                hVar2 = hVar12;
                a0.h hVar15 = hVar;
                ArrayList arrayList31 = arrayList;
                if (z16) {
                    arrayList2 = arrayList31;
                    if (usVar.y.isEmpty()) {
                        if (r2.a) {
                            k2.p1.q(usVar.e0, new StringBuilder("cancel summary with id "));
                        }
                        str3 = null;
                        m0.b(usVar.e0, null);
                        i12 = 0;
                        while (i12 < hVar2.m()) {
                            a0.h hVar16 = hVar2;
                            if (!usVar.y.contains(Long.valueOf(hVar16.j(i12)))) {
                                Integer num5 = (Integer) hVar16.n(i12);
                                if (r2.a) {
                                    a8.b("cancel notification id " + num5);
                                }
                                m0.b(num5.intValue(), str3);
                            }
                            i12++;
                            hVar2 = hVar16;
                        }
                        ArrayList arrayList32 = new ArrayList(arrayList2.size());
                        a8.b("showExtraNotifications: holders.size()=" + arrayList2.size());
                        size2 = arrayList2.size();
                        i13 = 0;
                        while (i13 < size2) {
                            ArrayList arrayList33 = arrayList2;
                            rs rsVar3 = (rs) arrayList33.get(i13);
                            arrayList32.clear();
                            int i59 = Build.VERSION.SDK_INT;
                            if (i59 < 29 || m5.C(rsVar3.b)) {
                                hVar3 = hVar15;
                            } else {
                                e0.q qVar3 = rsVar3.g;
                                long j37 = rsVar3.b;
                                hVar3 = hVar15;
                                String j38 = usVar.j(qVar3, j37, rsVar3.d, rsVar3.e, rsVar3.f, (e0.k0) hVar3.f(j37), !rsVar3.c);
                                if (j38 != null) {
                                    arrayList32.add(j38);
                                }
                            }
                            a8.b("showExtraNotifications: holders[" + i13 + "].call()");
                            rsVar3.a();
                            if (i59 >= 29 && az.q0 && !arrayList32.isEmpty()) {
                                g0.f.o(t0.b, arrayList32);
                            }
                            i13++;
                            usVar = this;
                            arrayList2 = arrayList33;
                            hVar15 = hVar3;
                        }
                    }
                } else {
                    if (r2.a) {
                        k2.p1.q(usVar.e0, new StringBuilder("show summary with id "));
                    }
                    try {
                        m0.d(usVar.e0, notification5);
                        arrayList2 = arrayList31;
                    } catch (SecurityException e14) {
                        a8.f(e14);
                        arrayList2 = arrayList31;
                        usVar.P(qVar, j10, j11, str2, jArr, i3, uri, i10, z10, z11, z12, i11);
                    }
                }
                str3 = null;
                i12 = 0;
                while (i12 < hVar2.m()) {
                }
                ArrayList arrayList322 = new ArrayList(arrayList2.size());
                a8.b("showExtraNotifications: holders.size()=" + arrayList2.size());
                size2 = arrayList2.size();
                i13 = 0;
                while (i13 < size2) {
                }
            }
        }
        z14 = true;
        if (z14) {
            i();
        }
        e10 = usVar.getUserConfig().e();
        if (g0.o2()) {
        }
        if (az.s.length() <= 0) {
        }
        a8.b("showExtraNotifications: passcode=" + (az.s.length() <= 0) + " waitingForPasscode=" + z15 + " selfUserId=" + e10 + " useSummaryNotification=" + z14);
        hVar = new a0.h();
        size = arrayList12.size();
        arrayList = arrayList14;
        while (true) {
            if (i32 >= size) {
            }
            i32 = i16 + 1;
            arrayList = arrayList4;
            arrayList12 = arrayList15;
            z14 = z18;
            z15 = z17;
            size = i14;
            hVar11 = hVar4;
            hVar12 = hVar5;
            c11 = sharedPreferences;
            e10 = j15;
            b11 = notification3;
            hVar = hVar6;
        }
        z16 = z14;
        Notification notification52 = b11;
        hVar2 = hVar12;
        a0.h hVar152 = hVar;
        ArrayList arrayList312 = arrayList;
        if (z16) {
        }
        str3 = null;
        i12 = 0;
        while (i12 < hVar2.m()) {
        }
        ArrayList arrayList3222 = new ArrayList(arrayList2.size());
        a8.b("showExtraNotifications: holders.size()=" + arrayList2.size());
        size2 = arrayList2.size();
        i13 = 0;
        while (i13 < size2) {
        }
    }

    public final void Y() {
        l0.c(new is(this, 3));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(70:122|123|(4:125|(2:127|(1:129)(1:596))(1:597)|130|(1:132)(3:591|592|(1:594)(1:595)))(1:598)|133|134|(5:567|568|(2:573|(2:575|576)(4:(1:(2:585|(1:587)(1:588))(1:580))(1:589)|581|(1:583)|584))|590|(0)(0))(4:137|(5:139|(2:141|(7:148|(4:150|(2:155|156)|157|156)|158|(1:169)(1:(1:162)(2:165|(1:167)(1:168)))|163|164|147))(1:170)|145|146|147)|171|172)|(62:180|(1:565)(5:185|(1:187)(1:564)|(2:189|(1:191)(2:192|(2:194|195)(2:559|(1:561)(1:562))))|563|195)|(2:197|(53:199|200|(5:202|(1:204)(1:555)|205|(1:207)(1:554)|208)(1:556)|209|210|(6:544|545|(1:547)(1:553)|548|(1:550)(1:552)|551)(1:(2:(3:216|(1:218)(1:520)|219)(3:521|(1:523)(1:525)|524)|220)(2:526|(6:(1:529)(1:542)|530|(1:532)(2:(1:539)(1:541)|540)|533|(1:535)(1:537)|536)(44:543|(1:223)(1:519)|224|(1:518)(1:228)|229|(1:517)(1:232)|(1:236)|(1:516)(1:241)|(6:243|(1:245)|246|(1:248)(1:514)|249|(1:251)(1:513))(1:515)|(3:255|256|(1:260))|(1:265)|266|(1:268)|269|270|(1:272)(3:451|452|(2:(2:455|456)(2:458|(1:460))|457)(2:461|(4:463|(2:466|464)|467|468)(28:469|(5:471|(1:(1:474)(2:475|(1:477)))|478|(21:(3:487|(1:495)|496)(3:497|(2:499|(1:507))|496)|276|(2:283|(1:287))|288|289|290|(1:292)|293|(3:295|296|297)(1:447)|298|(1:300)(1:(2:431|(1:433)(3:434|435|(4:437|(1:439)(1:444)|440|(1:442)))))|301|(4:426|427|(2:429|422)|407)(1:(4:306|307|(1:309)|407)(5:408|(2:410|(1:412)(3:413|(2:415|(1:417))(2:418|(1:420))|407))|423|(1:425)|407))|310|(1:406)(6:(3:401|(1:403)(1:405)|404)|(3:320|321|(6:323|(4:(1:329)(1:385)|(1:331)(1:384)|332|(1:334)(2:372|(1:374)(2:(2:379|(1:381)(1:382))|383)))|386|(0)(0)|332|(0)(0))(2:387|(1:389)(2:(2:391|(2:395|396))|399)))|400|(0)(0)|332|(0)(0))|335|(2:341|(7:343|(4:345|(3:347|(4:349|(1:351)|352|353)(2:355|356)|354)|357|358)|359|360|(1:368)|369|370))|371|(4:362|364|366|368)|369|370)|274)(2:508|(1:512))|275|276|(4:279|281|283|(2:285|287))|288|289|290|(0)|293|(0)(0)|298|(0)(0)|301|(1:303)|426|427|(0)|407|310|(0)|406|335|(4:337|339|341|(0))|371|(0)|369|370)))|273|274|275|276|(0)|288|289|290|(0)|293|(0)(0)|298|(0)(0)|301|(0)|426|427|(0)|407|310|(0)|406|335|(0)|371|(0)|369|370)))|221|(0)(0)|224|(1:226)|518|229|(0)|517|(2:234|236)|(1:238)|516|(0)(0)|(4:253|255|256|(2:258|260))|(0)|266|(0)|269|270|(0)(0)|273|274|275|276|(0)|288|289|290|(0)|293|(0)(0)|298|(0)(0)|301|(0)|426|427|(0)|407|310|(0)|406|335|(0)|371|(0)|369|370))(1:558)|557|200|(0)(0)|209|210|(1:212)|544|545|(0)(0)|548|(0)(0)|551|221|(0)(0)|224|(0)|518|229|(0)|517|(0)|(0)|516|(0)(0)|(0)|(0)|266|(0)|269|270|(0)(0)|273|274|275|276|(0)|288|289|290|(0)|293|(0)(0)|298|(0)(0)|301|(0)|426|427|(0)|407|310|(0)|406|335|(0)|371|(0)|369|370)|566|(1:182)|565|(0)(0)|557|200|(0)(0)|209|210|(0)|544|545|(0)(0)|548|(0)(0)|551|221|(0)(0)|224|(0)|518|229|(0)|517|(0)|(0)|516|(0)(0)|(0)|(0)|266|(0)|269|270|(0)(0)|273|274|275|276|(0)|288|289|290|(0)|293|(0)(0)|298|(0)(0)|301|(0)|426|427|(0)|407|310|(0)|406|335|(0)|371|(0)|369|370) */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0bb4, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0b0e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0b2a, code lost:
    
        org.telegram.messenger.a8.f(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x03aa A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03c6 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x049a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06a6 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x06e0 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0757 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x08ac A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x08be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:234:0x08c6 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x08e1 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0906  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0951 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x095e A[Catch: Exception -> 0x0056, TRY_ENTER, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0abe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0b07 A[Catch: all -> 0x0b0e, TryCatch #4 {all -> 0x0b0e, blocks: (B:290:0x0aec, B:292:0x0b07, B:293:0x0b10, B:297:0x0b17, B:298:0x0b1f), top: B:289:0x0aec }] */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0b2f A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0b89  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0bcd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0cbf A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:334:0x0cdd A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0d2a A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0d41 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0df8 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:372:0x0ce8  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0cd8  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0b35  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0b1e  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x0975 A[Catch: Exception -> 0x0056, TRY_LEAVE, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0902  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x08a5  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0863 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:550:0x0893  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0895  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x086f A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:570:0x057c A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x0588  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x03bd A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:603:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x039f A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:609:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0132 A[Catch: Exception -> 0x0056, TryCatch #3 {Exception -> 0x0056, blocks: (B:12:0x002c, B:13:0x0038, B:15:0x0040, B:19:0x0053, B:23:0x005a, B:25:0x0062, B:27:0x0074, B:29:0x0077, B:37:0x0080, B:40:0x0089, B:41:0x009d, B:43:0x00a5, B:45:0x00d9, B:47:0x00fb, B:49:0x0103, B:51:0x010b, B:54:0x0112, B:57:0x0126, B:58:0x01e5, B:59:0x0216, B:61:0x0228, B:63:0x022e, B:65:0x0232, B:67:0x024e, B:68:0x025b, B:71:0x026e, B:75:0x027a, B:77:0x0286, B:78:0x028c, B:80:0x0297, B:82:0x029d, B:84:0x02a9, B:85:0x02b5, B:86:0x02bf, B:88:0x02cf, B:90:0x02df, B:92:0x02e5, B:94:0x0309, B:96:0x0310, B:99:0x0340, B:101:0x0346, B:102:0x0354, B:104:0x035a, B:108:0x0362, B:111:0x0377, B:117:0x03a6, B:119:0x03aa, B:125:0x03c6, B:127:0x03cf, B:129:0x03d7, B:130:0x0404, B:133:0x0480, B:137:0x04a4, B:139:0x04c8, B:141:0x04da, B:143:0x04e0, B:147:0x055a, B:150:0x04ed, B:152:0x04f3, B:158:0x04fe, B:162:0x050b, B:163:0x0553, B:165:0x0521, B:167:0x0529, B:168:0x053d, B:172:0x0564, B:175:0x05e8, B:185:0x0601, B:187:0x061d, B:189:0x064c, B:191:0x0656, B:192:0x066c, B:194:0x067c, B:197:0x06a6, B:200:0x06ca, B:202:0x06e0, B:204:0x0710, B:205:0x0725, B:207:0x0735, B:210:0x0751, B:212:0x0757, B:216:0x0766, B:218:0x0777, B:219:0x078a, B:224:0x08a6, B:226:0x08ac, B:234:0x08c6, B:236:0x08cc, B:243:0x08e1, B:246:0x08eb, B:249:0x08f6, B:263:0x0917, B:266:0x0920, B:268:0x0951, B:269:0x0958, B:272:0x095e, B:276:0x0a77, B:279:0x0ac0, B:281:0x0ac4, B:283:0x0aca, B:285:0x0adf, B:287:0x0ae5, B:300:0x0b2f, B:307:0x0b91, B:314:0x0bd1, B:318:0x0c10, B:320:0x0c18, B:323:0x0c22, B:325:0x0c2a, B:329:0x0c33, B:331:0x0cbf, B:334:0x0cdd, B:335:0x0d24, B:337:0x0d2a, B:339:0x0d2e, B:341:0x0d39, B:343:0x0d41, B:345:0x0d4d, B:347:0x0d5e, B:349:0x0d70, B:351:0x0d91, B:352:0x0d96, B:354:0x0dc1, B:358:0x0dd0, B:362:0x0df8, B:364:0x0dfe, B:366:0x0e06, B:368:0x0e0c, B:369:0x0e30, B:374:0x0ceb, B:381:0x0cff, B:383:0x0d0c, B:385:0x0c57, B:386:0x0c5c, B:387:0x0c5f, B:389:0x0c65, B:391:0x0c6d, B:393:0x0c75, B:398:0x0cad, B:399:0x0cb5, B:401:0x0bdb, B:403:0x0be3, B:404:0x0c0b, B:406:0x0d15, B:415:0x0ba4, B:420:0x0baf, B:423:0x0bb8, B:427:0x0bc0, B:431:0x0b37, B:433:0x0b41, B:450:0x0b2a, B:451:0x0975, B:456:0x0986, B:457:0x0998, B:460:0x0993, B:461:0x09a8, B:463:0x09b8, B:464:0x09c1, B:466:0x09c9, B:468:0x09d8, B:469:0x09de, B:471:0x09e4, B:474:0x09f1, B:477:0x09fb, B:478:0x09fe, B:480:0x0a04, B:482:0x0a0d, B:484:0x0a16, B:487:0x0a1e, B:489:0x0a24, B:491:0x0a28, B:493:0x0a30, B:499:0x0a3f, B:501:0x0a45, B:503:0x0a49, B:505:0x0a51, B:508:0x0a58, B:510:0x0a67, B:512:0x0a6d, B:520:0x0783, B:521:0x07ae, B:523:0x07bf, B:524:0x07d2, B:525:0x07cb, B:530:0x0805, B:532:0x080d, B:533:0x0825, B:540:0x0820, B:545:0x0857, B:547:0x0863, B:548:0x0876, B:553:0x086f, B:555:0x071d, B:559:0x0688, B:561:0x068c, B:568:0x0570, B:570:0x057c, B:580:0x058e, B:581:0x05d1, B:584:0x05d7, B:585:0x05a2, B:587:0x05a8, B:588:0x05bc, B:591:0x0414, B:594:0x0420, B:595:0x043b, B:596:0x03e4, B:599:0x03b2, B:601:0x03bd, B:604:0x0392, B:606:0x039a, B:607:0x039f, B:612:0x034b, B:613:0x0350, B:620:0x02f0, B:622:0x02f6, B:627:0x026b, B:629:0x0132, B:631:0x0138, B:632:0x013c, B:635:0x0144, B:636:0x014e, B:637:0x0160, B:639:0x0166, B:640:0x017e, B:642:0x0184, B:644:0x018c, B:645:0x01bc, B:646:0x011b, B:648:0x0205, B:396:0x0c80, B:256:0x0909), top: B:11:0x002c, inners: #1, #2 }] */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v81 */
    /* JADX WARN: Type inference failed for: r12v82 */
    /* JADX WARN: Type inference failed for: r12v85 */
    /* JADX WARN: Type inference failed for: r12v89 */
    /* JADX WARN: Type inference failed for: r12v90 */
    /* JADX WARN: Type inference failed for: r53v0, types: [org.telegram.messenger.c1, org.telegram.messenger.us] */
    /* JADX WARN: Type inference failed for: r5v83, types: [org.telegram.messenger.zi] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(boolean z10) {
        long j10;
        long j11;
        zi ziVar;
        Bitmap bitmap;
        String str;
        long j12;
        long j13;
        String str2;
        String str3;
        long j14;
        TLRPC.Chat chat;
        boolean z11;
        long j15;
        long j16;
        long j17;
        long j18;
        TLRPC.Chat chat2;
        boolean z12;
        boolean z13;
        boolean z14;
        String L0;
        boolean z15;
        String str4;
        String L02;
        boolean z16;
        boolean z17;
        Bitmap bitmap2;
        boolean z18;
        String str5;
        SharedPreferences sharedPreferences;
        long j19;
        String x10;
        boolean z19;
        String str6;
        boolean z20;
        String str7;
        boolean z21;
        boolean z22;
        String str8;
        SharedPreferences sharedPreferences2;
        long j20;
        boolean z23;
        boolean z24;
        String str9;
        String str10;
        boolean z25;
        long j21;
        long j22;
        Integer num;
        int i3;
        boolean z26;
        String str11;
        int i10;
        boolean z27;
        long j23;
        String str12;
        long j24;
        String string;
        boolean z28;
        boolean z29;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z30;
        boolean z31;
        boolean z32;
        int i16;
        String str13;
        boolean z33;
        int i17;
        int i18;
        String str14;
        int i19;
        int i20;
        boolean z34;
        boolean z35;
        TLRPC.User user;
        TLRPC.Chat chat3;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        int i21;
        boolean z36;
        int i22;
        int i23;
        long[] jArr;
        Uri uri;
        Uri uri2;
        int i24;
        int i25;
        boolean z37;
        TLRPC.ReplyMarkup replyMarkup;
        Uri uri3;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        String str15;
        String str16;
        int ringerMode;
        String string2;
        boolean z38;
        boolean z39;
        int i31;
        boolean z40;
        int i32;
        boolean[] zArr;
        CharSequence charSequence;
        boolean z41;
        String G;
        if (!getUserConfig().p() || ((this.a.isEmpty() && this.E.isEmpty()) || !(az.Q0 || this.currentAccount == h10.t0))) {
            p();
            return;
        }
        try {
            getConnectionsManager().resumeNetworkMaybe();
            long j25 = 0;
            ts tsVar = null;
            for (int i33 = 0; i33 < this.a.size(); i33++) {
                ?? r5 = (zi) this.a.get(i33);
                long j26 = r5.k.date;
                if (j25 < j26) {
                    tsVar = r5;
                    j25 = j26;
                }
            }
            for (int i34 = 0; i34 < this.E.size(); i34++) {
                ts tsVar2 = (ts) this.E.get(i34);
                long j27 = tsVar2.e;
                if (j25 < j27 / 1000) {
                    tsVar = tsVar2;
                    j25 = j27 / 1000;
                }
            }
            if (tsVar == null) {
                return;
            }
            if (tsVar instanceof ts) {
                ts tsVar3 = tsVar;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                boolean z42 = false;
                int i35 = 0;
                j10 = 1000;
                for (int i36 = 0; i36 < this.E.size(); i36++) {
                    z42 |= ((ts) this.E.get(i36)).d;
                    tL_message.date = Math.min(tL_message.date, (int) (((ts) this.E.get(i36)).e / 1000));
                    i35 += ((ts) this.E.get(i36)).c.size();
                }
                j11 = 0;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                long j28 = tsVar3.a;
                tL_peerUser.user_id = j28;
                tL_message.dialog_id = j28;
                tL_message.peer_id = tL_peerUser;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                I(arrayList, arrayList2);
                Bitmap F = az.o() >= 1 ? F(arrayList2) : null;
                if (!z42 && this.E.size() < 2 && !arrayList.isEmpty()) {
                    G = (String) arrayList.get(0);
                    String str17 = G;
                    if (!z42) {
                        tL_message.message = bd.G(i35, "StoryNotificationHidden", new Object[0]);
                    } else if (arrayList.isEmpty()) {
                        tL_message.message = "";
                    } else if (arrayList.size() == 1) {
                        if (i35 == 1) {
                            tL_message.message = bd.N0("StoryNotificationSingle");
                        } else {
                            tL_message.message = bd.G(i35, "StoryNotification1", arrayList.get(0));
                        }
                    } else if (arrayList.size() == 2) {
                        tL_message.message = bd.Z(2131744612, arrayList.get(0), arrayList.get(1));
                    } else if (arrayList.size() == 3 && this.E.size() == 3) {
                        tL_message.message = bd.Z(2131744611, k((String) arrayList.get(0)), k((String) arrayList.get(1)), k((String) arrayList.get(2)));
                    } else {
                        tL_message.message = bd.G(this.E.size() - 2, "StoryNotification4", k((String) arrayList.get(0)), k((String) arrayList.get(1)));
                    }
                    zi ziVar2 = new zi(this.currentAccount, tL_message, tL_message.message, str17, str17, false, false, false, false);
                    ziVar2.K = true;
                    ziVar = ziVar2;
                    bitmap = F;
                }
                G = bd.G(i35, "Stories", new Object[0]);
                String str172 = G;
                if (!z42) {
                }
                zi ziVar22 = new zi(this.currentAccount, tL_message, tL_message.message, str172, str172, false, false, false, false);
                ziVar22.K = true;
                ziVar = ziVar22;
                bitmap = F;
            } else {
                j10 = 1000;
                j11 = 0;
                ziVar = (zi) this.a.get(0);
                bitmap = null;
            }
            SharedPreferences c2 = getAccountInstance().c();
            int i37 = c2.getInt("dismissDate", 0);
            if (!ziVar.K && ziVar.k.date <= i37) {
                p();
                return;
            }
            long A0 = ziVar.A0();
            long b22 = zi.b2(this.currentAccount, ziVar.k, getMessagesController().u2(ziVar));
            boolean z43 = ziVar.K;
            if (ziVar.k.mentioned) {
                str = "";
                j12 = ziVar.Z0();
            } else {
                str = "";
                j12 = A0;
            }
            ziVar.f1();
            TLRPC.Peer peer = ziVar.k.peer_id;
            long j29 = peer.chat_id;
            if (j29 == j11) {
                j29 = peer.channel_id;
            }
            long j30 = j12;
            long j31 = peer.user_id;
            if (ziVar.q3() && (j31 == j11 || j31 == getUserConfig().e())) {
                j31 = ziVar.k.from_id.user_id;
            }
            if (ziVar.A0() == 489000 && ziVar.W0() != null) {
                if (ziVar.W0().longValue() >= j11) {
                    j31 = ziVar.W0().longValue();
                    j29 = j11;
                } else {
                    j29 = ziVar.W0().longValue();
                    j31 = j11;
                }
            }
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j31));
            if (j29 != j11) {
                j13 = j29;
                chat = getMessagesController().M0(Long.valueOf(j13));
                z11 = (chat == null && ziVar.j3()) ? ziVar.f : t3.T(chat) && !chat.megagroup;
                str2 = "file://";
                str3 = "currentAccount";
                j14 = j30;
            } else {
                j13 = j29;
                str2 = "file://";
                str3 = "currentAccount";
                j14 = j30;
                chat = null;
                z11 = false;
            }
            int u10 = u(j14, b22);
            if (u10 == -1) {
                Boolean valueOf = Boolean.valueOf(z11);
                boolean z44 = ziVar.I;
                j16 = j14;
                j15 = b22;
                j18 = j13;
                chat2 = chat;
                z12 = D(A0, valueOf, z44, z44);
                j17 = A0;
            } else {
                j15 = b22;
                j16 = j14;
                j17 = A0;
                j18 = j13;
                chat2 = chat;
                z12 = u10 != 2;
            }
            String y9 = (((j29 == j11 || chat2 != null) && a22 != null) || !ziVar.j3()) ? chat2 != null ? y(chat2) : l10.p(a22) : ziVar.b;
            if (!g0.o2() && !az.C) {
                z13 = false;
                String str18 = y9;
                boolean equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                if (m5.C(j17)) {
                    if (equalsIgnoreCase) {
                        z14 = equalsIgnoreCase;
                    } else {
                        z14 = equalsIgnoreCase;
                        if (this.f.m() <= 1) {
                        }
                    }
                    if (!z13) {
                        L0 = str18;
                        z15 = true;
                        if (!ziVar.I && !ziVar.J) {
                            str4 = L0;
                            L02 = str4;
                            if (z14) {
                                z16 = z15;
                                if (h10.c() <= 1) {
                                    str5 = str;
                                } else if (this.f.m() == 1) {
                                    str5 = l10.i(getUserConfig().f());
                                } else {
                                    str5 = l10.i(getUserConfig().f()) + "・";
                                }
                                z17 = z12;
                                if (this.f.m() == 1) {
                                    bitmap2 = bitmap;
                                    z18 = z43;
                                } else {
                                    z18 = z43;
                                    if (this.f.m() == 1) {
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(str5);
                                        bitmap2 = bitmap;
                                        sb2.append(bd.G(this.J, "NewMessages", new Object[0]));
                                        str5 = sb2.toString();
                                    } else {
                                        bitmap2 = bitmap;
                                        str5 = str5 + bd.Z(2131747953, bd.G(this.J, "NewMessages", new Object[0]), bd.G(this.f.m(), "FromChats", new Object[0]));
                                    }
                                }
                            } else {
                                z16 = z15;
                                z17 = z12;
                                bitmap2 = bitmap;
                                z18 = z43;
                                str5 = str;
                            }
                            e0.q qVar = new e0.q(t0.b);
                            TLRPC.Chat chat4 = chat2;
                            if (this.a.size() > 1 || z14) {
                                sharedPreferences = c2;
                                j19 = j31;
                                String str19 = str;
                                boolean[] zArr2 = new boolean[1];
                                x10 = x(ziVar, zArr2);
                                if (!ziVar.k.silent && !ziVar.I) {
                                    z19 = false;
                                    if (x10 != null) {
                                        return;
                                    }
                                    if (!z16) {
                                        str6 = x10;
                                    } else if (chat4 != null && !z14) {
                                        str6 = x10.replace(" @ " + L02, str19);
                                    } else if (zArr2[0]) {
                                        str6 = x10.replace(L02 + ": ", str19);
                                    } else {
                                        str6 = x10.replace(L02 + " ", str19);
                                    }
                                    qVar.f(str6);
                                    if (z14) {
                                        str5 = str6;
                                    }
                                    e0.l lVar = new e0.l(0);
                                    lVar.e(str6);
                                    qVar.n(lVar);
                                    z20 = z19;
                                    str7 = str19;
                                }
                                z19 = true;
                                if (x10 != null) {
                                }
                            } else {
                                qVar.f(str5);
                                e0.l lVar2 = new e0.l(1);
                                lVar2.f(L02);
                                j19 = j31;
                                int min = Math.min(10, this.a.size());
                                boolean[] zArr3 = new boolean[1];
                                sharedPreferences = c2;
                                int i38 = 0;
                                ?? r12 = 2;
                                String str20 = null;
                                String str21 = str;
                                while (i38 < min) {
                                    int i39 = min;
                                    zi ziVar3 = (zi) this.a.get(i38);
                                    int i40 = i38;
                                    String x11 = x(ziVar3, zArr3);
                                    if (x11 != null) {
                                        zArr = zArr3;
                                        if (ziVar3.K || ziVar3.k.date > i37) {
                                            r12 = r12;
                                            if (r12 == 2) {
                                                if (!ziVar3.k.silent && !ziVar3.I) {
                                                    z41 = false;
                                                    r12 = z41;
                                                    str20 = x11;
                                                }
                                                z41 = true;
                                                r12 = z41;
                                                str20 = x11;
                                            }
                                            if (this.f.m() != 1 || !z16) {
                                                charSequence = str21;
                                            } else if (chat4 != null) {
                                                charSequence = str21;
                                                x11 = x11.replace(" @ " + L02, charSequence);
                                            } else {
                                                charSequence = str21;
                                                x11 = zArr[0] ? x11.replace(L02 + ": ", charSequence) : x11.replace(L02 + " ", charSequence);
                                            }
                                            lVar2.d(x11);
                                            i38 = i40 + 1;
                                            str21 = charSequence;
                                            min = i39;
                                            zArr3 = zArr;
                                            r12 = r12;
                                        }
                                    } else {
                                        zArr = zArr3;
                                    }
                                    charSequence = str21;
                                    i38 = i40 + 1;
                                    str21 = charSequence;
                                    min = i39;
                                    zArr3 = zArr;
                                    r12 = r12;
                                }
                                str7 = str21;
                                lVar2.g(str5);
                                qVar.n(lVar2);
                                x10 = str20;
                                z20 = r12;
                            }
                            if (z10 && z17 && !MediaController.B().J() && !z20) {
                                z21 = false;
                                if (z21 && j17 == j16 && chat4 != null) {
                                    sharedPreferences2 = sharedPreferences;
                                    boolean z45 = sharedPreferences2.getBoolean("custom_" + j17, false);
                                    int i41 = hs.K2;
                                    if (z45) {
                                        i32 = sharedPreferences2.getInt("smart_max_count_" + j17, 2);
                                        i41 = sharedPreferences2.getInt("smart_delay_" + j17, hs.K2);
                                    } else {
                                        i32 = 2;
                                    }
                                    if (i32 != 0) {
                                        Point point = (Point) this.e.f(j17);
                                        if (point == null) {
                                            this.e.k(new Point(1, (int) (SystemClock.elapsedRealtime() / j10)), j17);
                                        } else {
                                            z22 = z20;
                                            if (point.y + i41 < SystemClock.elapsedRealtime() / j10) {
                                                point.set(1, (int) (SystemClock.elapsedRealtime() / j10));
                                                str8 = str7;
                                            } else {
                                                int i42 = point.x;
                                                if (i42 < i32) {
                                                    str8 = str7;
                                                    point.set(i42 + 1, (int) (SystemClock.elapsedRealtime() / j10));
                                                } else {
                                                    str8 = str7;
                                                    z21 = true;
                                                }
                                            }
                                        }
                                    }
                                    z22 = z20;
                                    str8 = str7;
                                } else {
                                    z22 = z20;
                                    str8 = str7;
                                    sharedPreferences2 = sharedPreferences;
                                }
                                if (z21) {
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("sound_enabled_");
                                    j20 = j15;
                                    sb3.append(v(j17, j20, false));
                                    if (!sharedPreferences2.getBoolean(sb3.toString(), true)) {
                                        z23 = true;
                                        String path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                        z24 = t0.x;
                                        boolean z46 = !z24;
                                        v(j17, j20, false);
                                        if (this.h0.e(j17, j20)) {
                                            long j32 = j17;
                                            z25 = z18;
                                            long j33 = j20;
                                            int c10 = this.h0.c(0, j32, j33, "vibrate_");
                                            int c11 = this.h0.c(3, j32, j33, "priority_");
                                            j22 = j32;
                                            str9 = x10;
                                            str10 = str8;
                                            long d = this.h0.d(j22, j33);
                                            if (d != j11) {
                                                str11 = getMediaDataController().A0.e(d);
                                                z26 = true;
                                            } else {
                                                str11 = this.h0.f(j22, j33);
                                                z26 = false;
                                            }
                                            j21 = j33;
                                            int c12 = this.h0.c(0, j22, j21, "color_");
                                            num = c12 != 0 ? Integer.valueOf(c12) : null;
                                            i10 = c10;
                                            i3 = c11;
                                        } else {
                                            str9 = x10;
                                            str10 = str8;
                                            z25 = z18;
                                            j21 = j20;
                                            j22 = j17;
                                            num = null;
                                            i3 = 3;
                                            z26 = false;
                                            str11 = null;
                                            i10 = 0;
                                        }
                                        String str22 = str5;
                                        if (!ziVar.I || ziVar.J) {
                                            z27 = z23;
                                            j23 = j22;
                                            str12 = L02;
                                            j24 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                            if (j24 != 0) {
                                                string = getMediaDataController().A0.e(j24);
                                                z28 = true;
                                            } else {
                                                string = sharedPreferences2.getString("ReactionSoundPath", path);
                                                z28 = false;
                                            }
                                            int i43 = sharedPreferences2.getInt("vibrate_react", 0);
                                            int i44 = sharedPreferences2.getInt("priority_react", 1);
                                            int i45 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                            z29 = z28;
                                            i11 = ziVar.J ? 5 : 4;
                                            i12 = i45;
                                            i13 = i44;
                                            i14 = i43;
                                        } else if (j29 != j11) {
                                            if (z11) {
                                                z27 = z23;
                                                j23 = j22;
                                                long j34 = j11;
                                                str12 = L02;
                                                long j35 = sharedPreferences2.getLong("ChannelSoundDocId", j34);
                                                if (j35 != j34) {
                                                    string = getMediaDataController().A0.e(j35);
                                                    z40 = true;
                                                } else {
                                                    string = sharedPreferences2.getString("ChannelSoundPath", path);
                                                    z40 = false;
                                                }
                                                int i46 = sharedPreferences2.getInt("vibrate_channel", 0);
                                                int i47 = sharedPreferences2.getInt("priority_channel", 1);
                                                i31 = sharedPreferences2.getInt("ChannelLed", -16776961);
                                                z29 = z40;
                                                i13 = i47;
                                                i14 = i46;
                                                i11 = 2;
                                            } else {
                                                z27 = z23;
                                                j23 = j22;
                                                str12 = L02;
                                                long j36 = sharedPreferences2.getLong("GroupSoundDocId", 0L);
                                                if (j36 != 0) {
                                                    string = getMediaDataController().A0.e(j36);
                                                    z39 = true;
                                                } else {
                                                    string = sharedPreferences2.getString("GroupSoundPath", path);
                                                    z39 = false;
                                                }
                                                int i48 = sharedPreferences2.getInt("vibrate_group", 0);
                                                int i49 = sharedPreferences2.getInt("priority_group", 1);
                                                i31 = sharedPreferences2.getInt("GroupLed", -16776961);
                                                z29 = z39;
                                                i13 = i49;
                                                i14 = i48;
                                                i11 = 0;
                                            }
                                            i12 = i31;
                                        } else {
                                            z27 = z23;
                                            j23 = j22;
                                            long j37 = j11;
                                            str12 = L02;
                                            if (j19 == j37) {
                                                string = null;
                                                i15 = 4;
                                                i12 = -16776961;
                                                i14 = 0;
                                                i13 = 0;
                                                i11 = 1;
                                                z29 = false;
                                                if (i14 != i15) {
                                                    z30 = true;
                                                    i14 = 0;
                                                } else {
                                                    z30 = false;
                                                }
                                                if (!TextUtils.isEmpty(str11) || TextUtils.equals(string, str11)) {
                                                    str11 = string;
                                                    z26 = z29;
                                                    z31 = true;
                                                } else {
                                                    z31 = false;
                                                }
                                                z32 = z30;
                                                if (i3 != 3 || i13 == i3) {
                                                    i16 = i13;
                                                } else {
                                                    i16 = i3;
                                                    z31 = false;
                                                }
                                                if (num != null && num.intValue() != i12) {
                                                    i12 = num.intValue();
                                                    z31 = false;
                                                }
                                                if (i10 != 0 || i10 == 4 || i10 == i14) {
                                                    i10 = i14;
                                                    str13 = str12;
                                                    z33 = z31;
                                                } else {
                                                    str13 = str12;
                                                    z33 = false;
                                                }
                                                if (z24) {
                                                    if (!sharedPreferences2.getBoolean("EnableInAppSounds", true)) {
                                                        str11 = null;
                                                    }
                                                    i18 = !sharedPreferences2.getBoolean("EnableInAppVibrate", true) ? 2 : i10;
                                                    i17 = sharedPreferences2.getBoolean("EnableInAppPopup", true) ? 2 : 0;
                                                } else {
                                                    i17 = i16;
                                                    i18 = i10;
                                                }
                                                if (z32 && i18 != 2) {
                                                    try {
                                                        ringerMode = p0.getRingerMode();
                                                        if (ringerMode != 0 && ringerMode != 1) {
                                                            i18 = 2;
                                                        }
                                                    } catch (Exception e10) {
                                                        a8.f(e10);
                                                    }
                                                }
                                                if (z27) {
                                                    i18 = 0;
                                                    i12 = 0;
                                                    i17 = 0;
                                                    str11 = null;
                                                }
                                                Intent intent = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append("com.tmessages.openchat");
                                                boolean z47 = z33;
                                                sb4.append(Math.random());
                                                sb4.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                intent.setAction(sb4.toString());
                                                intent.setFlags(67108864);
                                                if (ziVar.O) {
                                                    intent.putExtra("oauth_url", ziVar.b);
                                                }
                                                if (ziVar.J) {
                                                    str14 = str13;
                                                    if (ziVar.N) {
                                                        if (j29 != j11) {
                                                            i19 = i18;
                                                            i21 = i12;
                                                            intent.putExtra("chatId", j18);
                                                        } else {
                                                            i19 = i18;
                                                            i21 = i12;
                                                            if (j19 != 0) {
                                                                intent.putExtra("userId", j19);
                                                            }
                                                        }
                                                        intent.putExtra("storyId", Math.abs(ziVar.f1()));
                                                        z34 = z26;
                                                        i20 = i21;
                                                    } else {
                                                        i19 = i18;
                                                        long j38 = j19;
                                                        long j39 = j18;
                                                        i20 = i12;
                                                        z34 = z26;
                                                        if (!ziVar.K) {
                                                            if (m5.C(j23)) {
                                                                z35 = z47;
                                                                user = a22;
                                                                chat3 = chat4;
                                                                if (this.f.m() == 1 && j23 != o0) {
                                                                    intent.putExtra("encId", m5.h(j23));
                                                                }
                                                            } else {
                                                                z35 = z47;
                                                                if (this.f.m() == 1) {
                                                                    if (j29 != j11) {
                                                                        intent.putExtra("chatId", j39);
                                                                    } else if (j38 != 0) {
                                                                        intent.putExtra("userId", j38);
                                                                    }
                                                                }
                                                                if (!g0.o2() && !az.C && this.f.m() == 1 && Build.VERSION.SDK_INT < 28) {
                                                                    if (chat4 != null) {
                                                                        chat3 = chat4;
                                                                        TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                                                        if (chatPhoto != null && (fileLocation2 = chatPhoto.photo_small) != null && fileLocation2.volume_id != 0 && fileLocation2.local_id != 0) {
                                                                            fileLocation = fileLocation2;
                                                                            user = a22;
                                                                        }
                                                                        user = a22;
                                                                    } else {
                                                                        chat3 = chat4;
                                                                        if (a22 != null) {
                                                                            user = a22;
                                                                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                                                            if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                                                            }
                                                                        }
                                                                        user = a22;
                                                                    }
                                                                    String str23 = str3;
                                                                    intent.putExtra(str23, this.currentAccount);
                                                                    PendingIntent activity = PendingIntent.getActivity(t0.b, 0, intent, 1140850688);
                                                                    qVar.g(str14);
                                                                    qVar.F.icon = R.drawable.notification;
                                                                    qVar.h(16, true);
                                                                    qVar.i = this.J;
                                                                    qVar.g = activity;
                                                                    qVar.q = this.f0;
                                                                    qVar.r = true;
                                                                    qVar.k = true;
                                                                    qVar.F.when = ziVar.k.date * j10;
                                                                    qVar.w = -15618822;
                                                                    qVar.u = "msg";
                                                                    if (chat3 == null && user != null && (str15 = user.phone) != null && str15.length() > 0) {
                                                                        str16 = "tel:+" + user.phone;
                                                                        if (str16 != null && !str16.isEmpty()) {
                                                                            qVar.G.add(str16);
                                                                        }
                                                                    }
                                                                    Intent intent2 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                                                    intent2.putExtra("messageDate", ziVar.k.date);
                                                                    intent2.putExtra(str23, this.currentAccount);
                                                                    if (ziVar.K) {
                                                                        intent2.putExtra("story", true);
                                                                    }
                                                                    if (ziVar.J) {
                                                                        i30 = 1;
                                                                    } else {
                                                                        i30 = 1;
                                                                        intent2.putExtra("storyReaction", true);
                                                                    }
                                                                    qVar.F.deleteIntent = PendingIntent.getBroadcast(t0.b, i30, intent2, 167772160);
                                                                    if (bitmap2 == null) {
                                                                        qVar.j(bitmap2);
                                                                    } else if (fileLocation != null) {
                                                                        BitmapDrawable C = zb.D().C(fileLocation);
                                                                        if (C != null) {
                                                                            qVar.j(C.getBitmap());
                                                                        } else {
                                                                            try {
                                                                                getFileLoader().getClass();
                                                                                File L = w7.L(fileLocation, true);
                                                                                if (L.exists()) {
                                                                                    float L2 = 160.0f / g0.L(50.0f);
                                                                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                                                                    options.inSampleSize = L2 < 1.0f ? 1 : (int) L2;
                                                                                    Bitmap decodeFile = BitmapFactory.decodeFile(L.getAbsolutePath(), options);
                                                                                    if (decodeFile != null) {
                                                                                        qVar.j(decodeFile);
                                                                                    }
                                                                                }
                                                                            } catch (Throwable unused) {
                                                                            }
                                                                        }
                                                                    }
                                                                    z36 = z22;
                                                                    if (z10 || z36) {
                                                                        qVar.j = -1;
                                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                                            i22 = 2;
                                                                        }
                                                                        i22 = 0;
                                                                    } else if (i17 == 0) {
                                                                        qVar.j = 0;
                                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                                            i22 = 3;
                                                                        }
                                                                        i22 = 0;
                                                                    } else {
                                                                        int i50 = 1;
                                                                        if (i17 != 1) {
                                                                            if (i17 == 2) {
                                                                                i50 = 1;
                                                                            } else {
                                                                                if (i17 == 4) {
                                                                                    qVar.j = -2;
                                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                                        i22 = 1;
                                                                                    }
                                                                                } else if (i17 == 5) {
                                                                                    qVar.j = -1;
                                                                                }
                                                                                i22 = 0;
                                                                            }
                                                                        }
                                                                        qVar.j = i50;
                                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                                            i22 = 4;
                                                                        }
                                                                        i22 = 0;
                                                                    }
                                                                    if (!z36 || z27) {
                                                                        i23 = i20;
                                                                        long[] jArr2 = {0, 0};
                                                                        qVar.F.vibrate = jArr2;
                                                                        jArr = jArr2;
                                                                        uri = null;
                                                                    } else {
                                                                        if (z24 || (sharedPreferences2.getBoolean("EnableInAppPreview", true) && str9 != null)) {
                                                                            qVar.p(str9.length() > 100 ? str9.substring(0, 100).replace('\n', ' ').trim() + "..." : str9);
                                                                        }
                                                                        if (str11 != null && !str11.equalsIgnoreCase("NoSound")) {
                                                                            int i51 = Build.VERSION.SDK_INT;
                                                                            if (i51 >= 26) {
                                                                                if (!str11.equalsIgnoreCase("Default") && !str11.equals(path)) {
                                                                                    if (z34) {
                                                                                        Context context = t0.b;
                                                                                        StringBuilder sb5 = new StringBuilder();
                                                                                        t0.d();
                                                                                        sb5.append("org.telegram.messenger.beta");
                                                                                        sb5.append(".provider");
                                                                                        uri = FileProvider.d(context, sb5.toString(), new File(str11));
                                                                                        t0.b.grantUriPermission("com.android.systemui", uri, 1);
                                                                                    } else {
                                                                                        uri = Uri.parse(str11);
                                                                                    }
                                                                                    if (i20 != 0) {
                                                                                        Notification notification = qVar.F;
                                                                                        i23 = i20;
                                                                                        notification.ledARGB = i23;
                                                                                        notification.ledOnMS = 1000;
                                                                                        notification.ledOffMS = 1000;
                                                                                        notification.flags = ((-2) & notification.flags) | 1;
                                                                                    } else {
                                                                                        i23 = i20;
                                                                                    }
                                                                                    i29 = i19;
                                                                                    if (i29 == 2) {
                                                                                        jArr = new long[]{0, 0};
                                                                                        qVar.F.vibrate = jArr;
                                                                                    } else if (i29 == 1) {
                                                                                        jArr = new long[]{0, 100, 0, 100};
                                                                                        qVar.F.vibrate = jArr;
                                                                                    } else {
                                                                                        if (i29 != 0 && i29 != 4) {
                                                                                            if (i29 == 3) {
                                                                                                jArr = new long[]{0, 1000};
                                                                                                qVar.F.vibrate = jArr;
                                                                                            } else {
                                                                                                jArr = null;
                                                                                            }
                                                                                        }
                                                                                        qVar.F.defaults = 2;
                                                                                        jArr = new long[0];
                                                                                    }
                                                                                }
                                                                                uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                                                                                if (i20 != 0) {
                                                                                }
                                                                                i29 = i19;
                                                                                if (i29 == 2) {
                                                                                }
                                                                            } else if (str11.equals(path)) {
                                                                                qVar.m(Settings.System.DEFAULT_NOTIFICATION_URI);
                                                                            } else {
                                                                                if (i51 >= 24) {
                                                                                    String str24 = str2;
                                                                                    if (str11.startsWith(str24) && !g0.I1(Uri.parse(str11), 0)) {
                                                                                        try {
                                                                                            Context context2 = t0.b;
                                                                                            StringBuilder sb6 = new StringBuilder();
                                                                                            t0.d();
                                                                                            sb6.append("org.telegram.messenger.beta");
                                                                                            sb6.append(".provider");
                                                                                            Uri d10 = FileProvider.d(context2, sb6.toString(), new File(str11.replace(str24, str10)));
                                                                                            t0.b.grantUriPermission("com.android.systemui", d10, 1);
                                                                                            qVar.m(d10);
                                                                                        } catch (Exception unused2) {
                                                                                            qVar.m(Uri.parse(str11));
                                                                                        }
                                                                                    }
                                                                                }
                                                                                qVar.m(Uri.parse(str11));
                                                                            }
                                                                        }
                                                                        uri = null;
                                                                        if (i20 != 0) {
                                                                        }
                                                                        i29 = i19;
                                                                        if (i29 == 2) {
                                                                        }
                                                                    }
                                                                    if (!g0.o2() && !az.C && ziVar.A0() == 777000) {
                                                                        replyMarkup = ziVar.k.reply_markup;
                                                                        if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                                            int size = arrayList3.size();
                                                                            int i52 = 0;
                                                                            boolean z48 = false;
                                                                            while (i52 < size) {
                                                                                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i52);
                                                                                int size2 = keyboardInlineButtonRow.buttons.size();
                                                                                boolean z49 = z48;
                                                                                int i53 = 0;
                                                                                while (i53 < size2) {
                                                                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow.buttons.get(i53);
                                                                                    TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) dg.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                                                    if (tL_inlineButtonTypeCallback != null) {
                                                                                        uri3 = uri;
                                                                                        i26 = i22;
                                                                                        i27 = size;
                                                                                        Intent intent3 = new Intent(t0.b, (Class<?>) NotificationCallbackReceiver.class);
                                                                                        intent3.putExtra(str23, this.currentAccount);
                                                                                        i28 = i23;
                                                                                        long j40 = j23;
                                                                                        intent3.putExtra("did", j40);
                                                                                        byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                                        if (bArr != null) {
                                                                                            intent3.putExtra("data", bArr);
                                                                                        }
                                                                                        intent3.putExtra("mid", ziVar.f1());
                                                                                        String str25 = keyboardInlineButton.text;
                                                                                        Context context3 = t0.b;
                                                                                        int i54 = this.I;
                                                                                        j23 = j40;
                                                                                        this.I = i54 + 1;
                                                                                        qVar.a(0, PendingIntent.getBroadcast(context3, i54, intent3, 167772160), str25);
                                                                                        z49 = true;
                                                                                    } else {
                                                                                        uri3 = uri;
                                                                                        i26 = i22;
                                                                                        i27 = size;
                                                                                        i28 = i23;
                                                                                    }
                                                                                    i53++;
                                                                                    uri = uri3;
                                                                                    i22 = i26;
                                                                                    size = i27;
                                                                                    i23 = i28;
                                                                                }
                                                                                i52++;
                                                                                z48 = z49;
                                                                                size = size;
                                                                            }
                                                                            uri2 = uri;
                                                                            i24 = i22;
                                                                            i25 = i23;
                                                                            z37 = z48;
                                                                            if (!z37 && Build.VERSION.SDK_INT < 24 && az.s.length() == 0 && A()) {
                                                                                Intent intent4 = new Intent(t0.b, (Class<?>) PopupReplyReceiver.class);
                                                                                intent4.putExtra(str23, this.currentAccount);
                                                                                qVar.a(R.drawable.ic_ab_reply, PendingIntent.getBroadcast(t0.b, 2, intent4, 167772160), bd.L0(2131746271));
                                                                            }
                                                                            X(qVar, str22, j23, j21, str18, jArr, i25, uri2, i24, z35, z46, z27, i11);
                                                                            R();
                                                                            return;
                                                                        }
                                                                    }
                                                                    uri2 = uri;
                                                                    i24 = i22;
                                                                    i25 = i23;
                                                                    z37 = false;
                                                                    if (!z37) {
                                                                        Intent intent42 = new Intent(t0.b, (Class<?>) PopupReplyReceiver.class);
                                                                        intent42.putExtra(str23, this.currentAccount);
                                                                        qVar.a(R.drawable.ic_ab_reply, PendingIntent.getBroadcast(t0.b, 2, intent42, 167772160), bd.L0(2131746271));
                                                                    }
                                                                    X(qVar, str22, j23, j21, str18, jArr, i25, uri2, i24, z35, z46, z27, i11);
                                                                    R();
                                                                    return;
                                                                }
                                                                user = a22;
                                                                chat3 = chat4;
                                                            }
                                                            fileLocation = null;
                                                            String str232 = str3;
                                                            intent.putExtra(str232, this.currentAccount);
                                                            PendingIntent activity2 = PendingIntent.getActivity(t0.b, 0, intent, 1140850688);
                                                            qVar.g(str14);
                                                            qVar.F.icon = R.drawable.notification;
                                                            qVar.h(16, true);
                                                            qVar.i = this.J;
                                                            qVar.g = activity2;
                                                            qVar.q = this.f0;
                                                            qVar.r = true;
                                                            qVar.k = true;
                                                            qVar.F.when = ziVar.k.date * j10;
                                                            qVar.w = -15618822;
                                                            qVar.u = "msg";
                                                            if (chat3 == null) {
                                                                str16 = "tel:+" + user.phone;
                                                                if (str16 != null) {
                                                                    qVar.G.add(str16);
                                                                }
                                                            }
                                                            Intent intent22 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                                            intent22.putExtra("messageDate", ziVar.k.date);
                                                            intent22.putExtra(str232, this.currentAccount);
                                                            if (ziVar.K) {
                                                            }
                                                            if (ziVar.J) {
                                                            }
                                                            qVar.F.deleteIntent = PendingIntent.getBroadcast(t0.b, i30, intent22, 167772160);
                                                            if (bitmap2 == null) {
                                                            }
                                                            z36 = z22;
                                                            if (z10) {
                                                            }
                                                            qVar.j = -1;
                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                            }
                                                            i22 = 0;
                                                            if (!z36) {
                                                            }
                                                            i23 = i20;
                                                            long[] jArr22 = {0, 0};
                                                            qVar.F.vibrate = jArr22;
                                                            jArr = jArr22;
                                                            uri = null;
                                                            if (!g0.o2()) {
                                                                replyMarkup = ziVar.k.reply_markup;
                                                                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                }
                                                            }
                                                            uri2 = uri;
                                                            i24 = i22;
                                                            i25 = i23;
                                                            z37 = false;
                                                            if (!z37) {
                                                            }
                                                            X(qVar, str22, j23, j21, str18, jArr, i25, uri2, i24, z35, z46, z27, i11);
                                                            R();
                                                            return;
                                                        }
                                                        long[] jArr3 = new long[this.E.size()];
                                                        for (int i55 = 0; i55 < this.E.size(); i55++) {
                                                            jArr3[i55] = ((ts) this.E.get(i55)).a;
                                                        }
                                                        intent.putExtra("storyDialogIds", jArr3);
                                                    }
                                                } else {
                                                    intent.putExtra("storyId", Math.abs(ziVar.f1()));
                                                    i19 = i18;
                                                    i20 = i12;
                                                    str14 = str13;
                                                    z34 = z26;
                                                }
                                                z35 = z47;
                                                user = a22;
                                                chat3 = chat4;
                                                fileLocation = null;
                                                String str2322 = str3;
                                                intent.putExtra(str2322, this.currentAccount);
                                                PendingIntent activity22 = PendingIntent.getActivity(t0.b, 0, intent, 1140850688);
                                                qVar.g(str14);
                                                qVar.F.icon = R.drawable.notification;
                                                qVar.h(16, true);
                                                qVar.i = this.J;
                                                qVar.g = activity22;
                                                qVar.q = this.f0;
                                                qVar.r = true;
                                                qVar.k = true;
                                                qVar.F.when = ziVar.k.date * j10;
                                                qVar.w = -15618822;
                                                qVar.u = "msg";
                                                if (chat3 == null) {
                                                }
                                                Intent intent222 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                                intent222.putExtra("messageDate", ziVar.k.date);
                                                intent222.putExtra(str2322, this.currentAccount);
                                                if (ziVar.K) {
                                                }
                                                if (ziVar.J) {
                                                }
                                                qVar.F.deleteIntent = PendingIntent.getBroadcast(t0.b, i30, intent222, 167772160);
                                                if (bitmap2 == null) {
                                                }
                                                z36 = z22;
                                                if (z10) {
                                                }
                                                qVar.j = -1;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                i22 = 0;
                                                if (!z36) {
                                                }
                                                i23 = i20;
                                                long[] jArr222 = {0, 0};
                                                qVar.F.vibrate = jArr222;
                                                jArr = jArr222;
                                                uri = null;
                                                if (!g0.o2()) {
                                                }
                                                uri2 = uri;
                                                i24 = i22;
                                                i25 = i23;
                                                z37 = false;
                                                if (!z37) {
                                                }
                                                X(qVar, str22, j23, j21, str18, jArr, i25, uri2, i24, z35, z46, z27, i11);
                                                R();
                                                return;
                                            }
                                            long j41 = sharedPreferences2.getLong(z25 ? "StoriesSoundDocId" : "GlobalSoundDocId", j37);
                                            if (j41 != j37) {
                                                string2 = getMediaDataController().A0.e(j41);
                                                z38 = true;
                                            } else {
                                                string2 = sharedPreferences2.getString(z25 ? "StoriesSoundPath" : "GlobalSoundPath", path);
                                                z38 = false;
                                            }
                                            i14 = sharedPreferences2.getInt("vibrate_messages", 0);
                                            String str26 = string2;
                                            i13 = sharedPreferences2.getInt("priority_messages", 1);
                                            z29 = z38;
                                            i12 = sharedPreferences2.getInt("MessagesLed", -16776961);
                                            i11 = z25 ? 3 : 1;
                                            string = str26;
                                        }
                                        i15 = 4;
                                        if (i14 != i15) {
                                        }
                                        if (TextUtils.isEmpty(str11)) {
                                        }
                                        str11 = string;
                                        z26 = z29;
                                        z31 = true;
                                        z32 = z30;
                                        if (i3 != 3) {
                                        }
                                        i16 = i13;
                                        if (num != null) {
                                            i12 = num.intValue();
                                            z31 = false;
                                        }
                                        if (i10 != 0) {
                                        }
                                        i10 = i14;
                                        str13 = str12;
                                        z33 = z31;
                                        if (z24) {
                                        }
                                        if (z32) {
                                            ringerMode = p0.getRingerMode();
                                            if (ringerMode != 0) {
                                                i18 = 2;
                                            }
                                        }
                                        if (z27) {
                                        }
                                        Intent intent5 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                                        StringBuilder sb42 = new StringBuilder();
                                        sb42.append("com.tmessages.openchat");
                                        boolean z472 = z33;
                                        sb42.append(Math.random());
                                        sb42.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                        intent5.setAction(sb42.toString());
                                        intent5.setFlags(67108864);
                                        if (ziVar.O) {
                                        }
                                        if (ziVar.J) {
                                        }
                                        z35 = z472;
                                        user = a22;
                                        chat3 = chat4;
                                        fileLocation = null;
                                        String str23222 = str3;
                                        intent5.putExtra(str23222, this.currentAccount);
                                        PendingIntent activity222 = PendingIntent.getActivity(t0.b, 0, intent5, 1140850688);
                                        qVar.g(str14);
                                        qVar.F.icon = R.drawable.notification;
                                        qVar.h(16, true);
                                        qVar.i = this.J;
                                        qVar.g = activity222;
                                        qVar.q = this.f0;
                                        qVar.r = true;
                                        qVar.k = true;
                                        qVar.F.when = ziVar.k.date * j10;
                                        qVar.w = -15618822;
                                        qVar.u = "msg";
                                        if (chat3 == null) {
                                        }
                                        Intent intent2222 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                        intent2222.putExtra("messageDate", ziVar.k.date);
                                        intent2222.putExtra(str23222, this.currentAccount);
                                        if (ziVar.K) {
                                        }
                                        if (ziVar.J) {
                                        }
                                        qVar.F.deleteIntent = PendingIntent.getBroadcast(t0.b, i30, intent2222, 167772160);
                                        if (bitmap2 == null) {
                                        }
                                        z36 = z22;
                                        if (z10) {
                                        }
                                        qVar.j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                        }
                                        i22 = 0;
                                        if (!z36) {
                                        }
                                        i23 = i20;
                                        long[] jArr2222 = {0, 0};
                                        qVar.F.vibrate = jArr2222;
                                        jArr = jArr2222;
                                        uri = null;
                                        if (!g0.o2()) {
                                        }
                                        uri2 = uri;
                                        i24 = i22;
                                        i25 = i23;
                                        z37 = false;
                                        if (!z37) {
                                        }
                                        X(qVar, str22, j23, j21, str18, jArr, i25, uri2, i24, z35, z46, z27, i11);
                                        R();
                                        return;
                                    }
                                } else {
                                    j20 = j15;
                                }
                                z23 = z21;
                                String path2 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                z24 = t0.x;
                                boolean z462 = !z24;
                                v(j17, j20, false);
                                if (this.h0.e(j17, j20)) {
                                }
                                String str222 = str5;
                                if (ziVar.I) {
                                }
                                z27 = z23;
                                j23 = j22;
                                str12 = L02;
                                j24 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                if (j24 != 0) {
                                }
                                int i432 = sharedPreferences2.getInt("vibrate_react", 0);
                                int i442 = sharedPreferences2.getInt("priority_react", 1);
                                int i452 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                z29 = z28;
                                i11 = ziVar.J ? 5 : 4;
                                i12 = i452;
                                i13 = i442;
                                i14 = i432;
                                i15 = 4;
                                if (i14 != i15) {
                                }
                                if (TextUtils.isEmpty(str11)) {
                                }
                                str11 = string;
                                z26 = z29;
                                z31 = true;
                                z32 = z30;
                                if (i3 != 3) {
                                }
                                i16 = i13;
                                if (num != null) {
                                }
                                if (i10 != 0) {
                                }
                                i10 = i14;
                                str13 = str12;
                                z33 = z31;
                                if (z24) {
                                }
                                if (z32) {
                                }
                                if (z27) {
                                }
                                Intent intent52 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                                StringBuilder sb422 = new StringBuilder();
                                sb422.append("com.tmessages.openchat");
                                boolean z4722 = z33;
                                sb422.append(Math.random());
                                sb422.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent52.setAction(sb422.toString());
                                intent52.setFlags(67108864);
                                if (ziVar.O) {
                                }
                                if (ziVar.J) {
                                }
                                z35 = z4722;
                                user = a22;
                                chat3 = chat4;
                                fileLocation = null;
                                String str232222 = str3;
                                intent52.putExtra(str232222, this.currentAccount);
                                PendingIntent activity2222 = PendingIntent.getActivity(t0.b, 0, intent52, 1140850688);
                                qVar.g(str14);
                                qVar.F.icon = R.drawable.notification;
                                qVar.h(16, true);
                                qVar.i = this.J;
                                qVar.g = activity2222;
                                qVar.q = this.f0;
                                qVar.r = true;
                                qVar.k = true;
                                qVar.F.when = ziVar.k.date * j10;
                                qVar.w = -15618822;
                                qVar.u = "msg";
                                if (chat3 == null) {
                                }
                                Intent intent22222 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                intent22222.putExtra("messageDate", ziVar.k.date);
                                intent22222.putExtra(str232222, this.currentAccount);
                                if (ziVar.K) {
                                }
                                if (ziVar.J) {
                                }
                                qVar.F.deleteIntent = PendingIntent.getBroadcast(t0.b, i30, intent22222, 167772160);
                                if (bitmap2 == null) {
                                }
                                z36 = z22;
                                if (z10) {
                                }
                                qVar.j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                i22 = 0;
                                if (!z36) {
                                }
                                i23 = i20;
                                long[] jArr22222 = {0, 0};
                                qVar.F.vibrate = jArr22222;
                                jArr = jArr22222;
                                uri = null;
                                if (!g0.o2()) {
                                }
                                uri2 = uri;
                                i24 = i22;
                                i25 = i23;
                                z37 = false;
                                if (!z37) {
                                }
                                X(qVar, str222, j23, j21, str18, jArr, i25, uri2, i24, z35, z462, z27, i11);
                                R();
                                return;
                            }
                            z21 = true;
                            if (z21) {
                            }
                            z22 = z20;
                            str8 = str7;
                            sharedPreferences2 = sharedPreferences;
                            if (z21) {
                            }
                            z23 = z21;
                            String path22 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                            z24 = t0.x;
                            boolean z4622 = !z24;
                            v(j17, j20, false);
                            if (this.h0.e(j17, j20)) {
                            }
                            String str2222 = str5;
                            if (ziVar.I) {
                            }
                            z27 = z23;
                            j23 = j22;
                            str12 = L02;
                            j24 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                            if (j24 != 0) {
                            }
                            int i4322 = sharedPreferences2.getInt("vibrate_react", 0);
                            int i4422 = sharedPreferences2.getInt("priority_react", 1);
                            int i4522 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                            z29 = z28;
                            i11 = ziVar.J ? 5 : 4;
                            i12 = i4522;
                            i13 = i4422;
                            i14 = i4322;
                            i15 = 4;
                            if (i14 != i15) {
                            }
                            if (TextUtils.isEmpty(str11)) {
                            }
                            str11 = string;
                            z26 = z29;
                            z31 = true;
                            z32 = z30;
                            if (i3 != 3) {
                            }
                            i16 = i13;
                            if (num != null) {
                            }
                            if (i10 != 0) {
                            }
                            i10 = i14;
                            str13 = str12;
                            z33 = z31;
                            if (z24) {
                            }
                            if (z32) {
                            }
                            if (z27) {
                            }
                            Intent intent522 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                            StringBuilder sb4222 = new StringBuilder();
                            sb4222.append("com.tmessages.openchat");
                            boolean z47222 = z33;
                            sb4222.append(Math.random());
                            sb4222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                            intent522.setAction(sb4222.toString());
                            intent522.setFlags(67108864);
                            if (ziVar.O) {
                            }
                            if (ziVar.J) {
                            }
                            z35 = z47222;
                            user = a22;
                            chat3 = chat4;
                            fileLocation = null;
                            String str2322222 = str3;
                            intent522.putExtra(str2322222, this.currentAccount);
                            PendingIntent activity22222 = PendingIntent.getActivity(t0.b, 0, intent522, 1140850688);
                            qVar.g(str14);
                            qVar.F.icon = R.drawable.notification;
                            qVar.h(16, true);
                            qVar.i = this.J;
                            qVar.g = activity22222;
                            qVar.q = this.f0;
                            qVar.r = true;
                            qVar.k = true;
                            qVar.F.when = ziVar.k.date * j10;
                            qVar.w = -15618822;
                            qVar.u = "msg";
                            if (chat3 == null) {
                            }
                            Intent intent222222 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                            intent222222.putExtra("messageDate", ziVar.k.date);
                            intent222222.putExtra(str2322222, this.currentAccount);
                            if (ziVar.K) {
                            }
                            if (ziVar.J) {
                            }
                            qVar.F.deleteIntent = PendingIntent.getBroadcast(t0.b, i30, intent222222, 167772160);
                            if (bitmap2 == null) {
                            }
                            z36 = z22;
                            if (z10) {
                            }
                            qVar.j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                            }
                            i22 = 0;
                            if (!z36) {
                            }
                            i23 = i20;
                            long[] jArr222222 = {0, 0};
                            qVar.F.vibrate = jArr222222;
                            jArr = jArr222222;
                            uri = null;
                            if (!g0.o2()) {
                            }
                            uri2 = uri;
                            i24 = i22;
                            i25 = i23;
                            z37 = false;
                            if (!z37) {
                            }
                            X(qVar, str2222, j23, j21, str18, jArr, i25, uri2, i24, z35, z4622, z27, i11);
                            R();
                            return;
                        }
                        str4 = L0;
                        if (!c2.getBoolean("EnableReactionsPreview", true)) {
                            L02 = bd.L0(2131748026);
                            if (z14) {
                            }
                            e0.q qVar2 = new e0.q(t0.b);
                            TLRPC.Chat chat42 = chat2;
                            if (this.a.size() > 1) {
                            }
                            sharedPreferences = c2;
                            j19 = j31;
                            String str192 = str;
                            boolean[] zArr22 = new boolean[1];
                            x10 = x(ziVar, zArr22);
                            if (!ziVar.k.silent) {
                                z19 = false;
                                if (x10 != null) {
                                }
                            }
                            z19 = true;
                            if (x10 != null) {
                            }
                        }
                        L02 = str4;
                        if (z14) {
                        }
                        e0.q qVar22 = new e0.q(t0.b);
                        TLRPC.Chat chat422 = chat2;
                        if (this.a.size() > 1) {
                        }
                        sharedPreferences = c2;
                        j19 = j31;
                        String str1922 = str;
                        boolean[] zArr222 = new boolean[1];
                        x10 = x(ziVar, zArr222);
                        if (!ziVar.k.silent) {
                        }
                        z19 = true;
                        if (x10 != null) {
                        }
                    }
                } else {
                    z14 = equalsIgnoreCase;
                }
                L0 = !z13 ? j29 != j11 ? bd.L0(2131748029) : bd.L0(2131748026) : bd.L0(R.string.AppName);
                z15 = false;
                if (!ziVar.I) {
                    str4 = L0;
                    L02 = str4;
                    if (z14) {
                    }
                    e0.q qVar222 = new e0.q(t0.b);
                    TLRPC.Chat chat4222 = chat2;
                    if (this.a.size() > 1) {
                    }
                    sharedPreferences = c2;
                    j19 = j31;
                    String str19222 = str;
                    boolean[] zArr2222 = new boolean[1];
                    x10 = x(ziVar, zArr2222);
                    if (!ziVar.k.silent) {
                    }
                    z19 = true;
                    if (x10 != null) {
                    }
                }
                str4 = L0;
                if (!c2.getBoolean("EnableReactionsPreview", true)) {
                }
                L02 = str4;
                if (z14) {
                }
                e0.q qVar2222 = new e0.q(t0.b);
                TLRPC.Chat chat42222 = chat2;
                if (this.a.size() > 1) {
                }
                sharedPreferences = c2;
                j19 = j31;
                String str192222 = str;
                boolean[] zArr22222 = new boolean[1];
                x10 = x(ziVar, zArr22222);
                if (!ziVar.k.silent) {
                }
                z19 = true;
                if (x10 != null) {
                }
            }
            z13 = true;
            String str182 = y9;
            boolean equalsIgnoreCase2 = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
            if (m5.C(j17)) {
            }
            if (!z13) {
            }
            z15 = false;
            if (!ziVar.I) {
            }
            str4 = L0;
            if (!c2.getBoolean("EnableReactionsPreview", true)) {
            }
            L02 = str4;
            if (z14) {
            }
            e0.q qVar22222 = new e0.q(t0.b);
            TLRPC.Chat chat422222 = chat2;
            if (this.a.size() > 1) {
            }
            sharedPreferences = c2;
            j19 = j31;
            String str1922222 = str;
            boolean[] zArr222222 = new boolean[1];
            x10 = x(ziVar, zArr222222);
            if (!ziVar.k.silent) {
            }
            z19 = true;
            if (x10 != null) {
            }
        } catch (Exception e11) {
            a8.f(e11);
        }
    }

    public final void a0(long j10, String str) {
        l0.c(new zq(this, str, j10, 3));
    }

    public final void b0(int i3) {
        SharedPreferences c2 = getAccountInstance().c();
        if (i3 == 4 || i3 == 5) {
            TL_account.setReactionsNotifySettings setreactionsnotifysettings = new TL_account.setReactionsNotifySettings();
            setreactionsnotifysettings.settings = new TL_account.TL_reactionsNotifySettings();
            if (c2.getBoolean("EnableReactionsMessages", true)) {
                setreactionsnotifysettings.settings.flags |= 1;
                if (c2.getBoolean("EnableReactionsMessagesContacts", false)) {
                    setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
                } else {
                    setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromAll();
                }
            }
            if (c2.getBoolean("EnableReactionsStories", true)) {
                setreactionsnotifysettings.settings.flags |= 2;
                if (c2.getBoolean("EnableReactionsStoriesContacts", false)) {
                    setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
                } else {
                    setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromAll();
                }
            }
            setreactionsnotifysettings.settings.show_previews = c2.getBoolean("EnableReactionsPreview", true);
            setreactionsnotifysettings.settings.sound = s(c2, "ReactionSound", "ReactionSoundDocId", "ReactionSoundPath");
            getConnectionsManager().sendRequest(setreactionsnotifysettings, new ei.u5(14));
            return;
        }
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
        updatenotifysettings.settings = tL_inputPeerNotifySettings;
        tL_inputPeerNotifySettings.flags = 5;
        if (i3 == 0) {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
            updatenotifysettings.settings.mute_until = c2.getInt("EnableGroup2", 0);
            updatenotifysettings.settings.show_previews = c2.getBoolean("EnablePreviewGroup", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings2.flags |= 8;
            tL_inputPeerNotifySettings2.sound = s(c2, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
        } else if (i3 == 1 || i3 == 3) {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
            updatenotifysettings.settings.mute_until = c2.getInt("EnableAll2", 0);
            updatenotifysettings.settings.show_previews = c2.getBoolean("EnablePreviewAll", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 128;
            tL_inputPeerNotifySettings3.stories_hide_sender = c2.getBoolean("EnableHideStoriesSenders", false);
            if (c2.contains("EnableAllStories")) {
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings4.flags |= 64;
                tL_inputPeerNotifySettings4.stories_muted = !c2.getBoolean("EnableAllStories", true);
            }
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings5.flags |= 8;
            tL_inputPeerNotifySettings5.sound = s(c2, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings6 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings6.flags |= 256;
            tL_inputPeerNotifySettings6.stories_sound = s(c2, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
        } else {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
            updatenotifysettings.settings.mute_until = c2.getInt("EnableChannel2", 0);
            updatenotifysettings.settings.show_previews = c2.getBoolean("EnablePreviewChannel", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings7.flags |= 8;
            tL_inputPeerNotifySettings7.sound = s(c2, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new ei.u5(14));
    }

    public final void c0(long j10, long j11, boolean z10) {
        if (z10) {
            getNotificationCenter().k(hs.f0, new Object[0]);
        }
        if (m5.C(j10)) {
            return;
        }
        SharedPreferences c2 = getAccountInstance().c();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String v = v(j10, j11, false);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = updatenotifysettings.settings;
        tL_inputPeerNotifySettings.flags |= 1;
        tL_inputPeerNotifySettings.show_previews = c2.getBoolean("content_preview_" + v, true);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings2.flags = tL_inputPeerNotifySettings2.flags | 2;
        tL_inputPeerNotifySettings2.silent = c2.getBoolean("silent_" + v, false);
        if (c2.contains("stories_" + v)) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 64;
            tL_inputPeerNotifySettings3.stories_muted = !c2.getBoolean("stories_" + v, true);
        }
        int i3 = c2.getInt("notify2_" + v(j10, j11, false), -1);
        if (i3 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i3 == 3) {
                tL_inputPeerNotifySettings4.mute_until = c2.getInt("notifyuntil_" + v(j10, j11, false), 0);
            } else {
                tL_inputPeerNotifySettings4.mute_until = i3 != 2 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
        }
        long j12 = c2.getLong("sound_document_id_" + v(j10, j11, false), 0L);
        String string = c2.getString("sound_path_" + v(j10, j11, false), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags = tL_inputPeerNotifySettings5.flags | 8;
        if (j12 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j12;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string == null) {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        } else if (string.equalsIgnoreCase("NoSound")) {
            updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
        } else {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
            tL_notificationSoundLocal.title = c2.getString("sound_" + v(j10, j11, false), null);
            tL_notificationSoundLocal.data = string;
            updatenotifysettings.settings.sound = tL_notificationSoundLocal;
        }
        if (j11 == 0 || j10 == getUserConfig().e()) {
            int i10 = this.currentAccount;
            if (j10 >= 0 || !t3.Y(hp.s1(i10).M0(Long.valueOf(-j10)))) {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().j1(j10);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            } else {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().h1(-j10);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            }
        } else {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().j1(j10);
            tL_inputNotifyForumTopic.top_msg_id = (int) j11;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new ei.u5(14));
    }

    public final void d0() {
        int i3 = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            ArrayList arrayList = this.E;
            if (i3 >= arrayList.size()) {
                break;
            }
            Iterator it = ((ts) arrayList.get(i3)).c.values().iterator();
            while (it.hasNext()) {
                j10 = Math.min(j10, ((Long) ((Pair) it.next()).second).longValue());
            }
            i3++;
        }
        p5 p5Var = l0;
        is isVar = this.j0;
        p5Var.a(isVar);
        long currentTimeMillis = j10 - System.currentTimeMillis();
        if (j10 != Long.MAX_VALUE) {
            p5Var.e(isVar, Math.max(0L, currentTimeMillis));
        }
    }

    @Override // org.telegram.messenger.cs
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == hs.Y1) {
            l0.c(new pq(11, this, (String) objArr[0]));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:359:0x0588, code lost:
    
        r4 = "reactions_ia";
     */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0ae4  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0af9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0aee  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x09db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x09e9 A[LOOP:3: B:141:0x09e6->B:143:0x09e9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0a00  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0a0c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0a1b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x08d9  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0925  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0506 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:440:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x099f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0a41  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x022c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e0(long j10, long j11, String str, long[] jArr, int i3, Uri uri, int i10, boolean z10, boolean z11, boolean z12, int i11) {
        String str2;
        String str3;
        boolean z13;
        String str4;
        int i12;
        int i13;
        SharedPreferences.Editor remove;
        StringBuilder sb2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        boolean z14;
        String a10;
        String a02;
        long j12;
        String str21;
        String string;
        int i15;
        String str22;
        String str23;
        StringBuilder sb3;
        SharedPreferences sharedPreferences;
        String str24;
        String str25;
        String str26;
        boolean z15;
        boolean z16;
        String str27;
        long j13;
        long[] jArr2;
        int i16;
        String str28;
        String str29;
        String str30;
        boolean z17;
        String str31;
        int i17;
        StringBuilder sb4;
        String str32;
        String str33;
        Uri uri2;
        String str34;
        NotificationChannel notificationChannel;
        boolean z18;
        long[] jArr3;
        boolean z19;
        String str35;
        String str36;
        String str37;
        String str38;
        long[] jArr4;
        boolean z20;
        boolean z21;
        String str39;
        int i18;
        SharedPreferences.Editor editor;
        boolean z22;
        boolean z23;
        boolean z24;
        long j14;
        char c2;
        boolean z25;
        String str40;
        SharedPreferences c10 = getAccountInstance().c();
        if (this.Q == null) {
            this.Q = Boolean.valueOf(c10.getBoolean("groupsCreated5", false));
        }
        String str41 = "vibrate_";
        String str42 = "vibrate_react";
        if (this.Q.booleanValue()) {
            str2 = "vibrate_react";
            str3 = "vibrate_";
        } else {
            try {
                String str43 = this.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = n0.getNotificationChannels();
                int size = notificationChannels.size();
                int i19 = 0;
                SharedPreferences.Editor editor2 = null;
                while (i19 < size) {
                    NotificationChannel notificationChannel2 = notificationChannels.get(i19);
                    List<NotificationChannel> list = notificationChannels;
                    String id2 = notificationChannel2.getId();
                    if (id2.startsWith(str43)) {
                        str4 = str43;
                        int importance = notificationChannel2.getImportance();
                        i12 = size;
                        if (importance != 4 && importance != 5 && !id2.contains("_ia_")) {
                            if (id2.contains("_channels_")) {
                                if (editor2 == null) {
                                    editor2 = getAccountInstance().c().edit();
                                }
                                SharedPreferences.Editor editor3 = editor2;
                                editor2 = editor3;
                                editor3.remove("priority_channel").remove("vibrate_channel").remove("ChannelSoundPath").remove("ChannelSound");
                            } else if (id2.contains("_reactions_")) {
                                if (editor2 == null) {
                                    editor2 = getAccountInstance().c().edit();
                                }
                                SharedPreferences.Editor editor4 = editor2;
                                editor2 = editor4;
                                editor4.remove("priority_react").remove(str42).remove("ReactionSoundPath").remove("ReactionSound");
                            } else if (id2.contains("_groups_")) {
                                if (editor2 == null) {
                                    editor2 = getAccountInstance().c().edit();
                                }
                                SharedPreferences.Editor editor5 = editor2;
                                editor2 = editor5;
                                editor5.remove("priority_group").remove("vibrate_group").remove("GroupSoundPath").remove("GroupSound");
                            } else if (id2.contains("_private_")) {
                                if (editor2 == null) {
                                    editor2 = getAccountInstance().c().edit();
                                }
                                SharedPreferences.Editor editor6 = editor2;
                                editor6.remove("priority_messages");
                                editor2 = editor6;
                                editor6.remove("priority_group").remove("vibrate_messages").remove("GlobalSoundPath").remove("GlobalSound");
                            } else {
                                i13 = i19;
                                long longValue = Utilities.A(id2.substring(9, id2.indexOf(95, 9))).longValue();
                                if (longValue != 0) {
                                    if (editor2 == null) {
                                        editor2 = getAccountInstance().c().edit();
                                    }
                                    str2 = str42;
                                    SharedPreferences.Editor editor7 = editor2;
                                    try {
                                        editor2 = editor7;
                                        remove = editor7.remove("priority_" + longValue).remove(str41 + longValue);
                                        sb2 = new StringBuilder();
                                        str3 = str41;
                                    } catch (Exception e10) {
                                        e = e10;
                                        str3 = str41;
                                        z13 = true;
                                        a8.g(e, true);
                                        c10.edit().putBoolean("groupsCreated5", z13).commit();
                                        this.Q = Boolean.TRUE;
                                        if (this.R) {
                                        }
                                        SharedPreferences c11 = getAccountInstance().c();
                                        if (z12) {
                                        }
                                        if (z10) {
                                        }
                                        if (z11) {
                                        }
                                        a10 = Utilities.a(uri == null ? "NoSound2" : uri.toString());
                                        if (a10 != null) {
                                            a10 = a10.substring(0, 5);
                                        }
                                        if (z12) {
                                        }
                                        String C = a1.g.C(str16, "_", a10);
                                        string = c11.getString(C, null);
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(C);
                                        String str44 = "_s";
                                        sb5.append("_s");
                                        String string2 = c11.getString(sb5.toString(), null);
                                        StringBuilder sb6 = new StringBuilder();
                                        if (string != null) {
                                        }
                                        i16 = i10;
                                        str28 = str22;
                                        z14 = z16;
                                        str30 = str23;
                                        str29 = null;
                                        z17 = false;
                                        if (z17) {
                                        }
                                        str31 = str26;
                                        if (!z14) {
                                        }
                                        i17 = 0;
                                        while (i17 < jArr2.length) {
                                        }
                                        boolean z26 = z14;
                                        sb4 = sb3;
                                        sb4.append(i15);
                                        if (uri != null) {
                                        }
                                        sb4.append(i16);
                                        if (!z10) {
                                        }
                                        str29 = Utilities.a(sb4.toString());
                                        if (!z12) {
                                        }
                                        str32 = str29;
                                        str33 = str28;
                                        if (str33 == null) {
                                        }
                                        return str33;
                                    }
                                    try {
                                        sb2.append("sound_path_");
                                        sb2.append(longValue);
                                        remove.remove(sb2.toString()).remove("sound_" + longValue);
                                        n0.deleteNotificationChannel(id2);
                                    } catch (Exception e11) {
                                        e = e11;
                                        z13 = true;
                                        a8.g(e, true);
                                        c10.edit().putBoolean("groupsCreated5", z13).commit();
                                        this.Q = Boolean.TRUE;
                                        if (this.R) {
                                        }
                                        SharedPreferences c112 = getAccountInstance().c();
                                        if (z12) {
                                        }
                                        if (z10) {
                                        }
                                        if (z11) {
                                        }
                                        a10 = Utilities.a(uri == null ? "NoSound2" : uri.toString());
                                        if (a10 != null) {
                                        }
                                        if (z12) {
                                        }
                                        String C2 = a1.g.C(str16, "_", a10);
                                        string = c112.getString(C2, null);
                                        StringBuilder sb52 = new StringBuilder();
                                        sb52.append(C2);
                                        String str442 = "_s";
                                        sb52.append("_s");
                                        String string22 = c112.getString(sb52.toString(), null);
                                        StringBuilder sb62 = new StringBuilder();
                                        if (string != null) {
                                        }
                                        i16 = i10;
                                        str28 = str22;
                                        z14 = z16;
                                        str30 = str23;
                                        str29 = null;
                                        z17 = false;
                                        if (z17) {
                                        }
                                        str31 = str26;
                                        if (!z14) {
                                        }
                                        i17 = 0;
                                        while (i17 < jArr2.length) {
                                        }
                                        boolean z262 = z14;
                                        sb4 = sb3;
                                        sb4.append(i15);
                                        if (uri != null) {
                                        }
                                        sb4.append(i16);
                                        if (!z10) {
                                        }
                                        str29 = Utilities.a(sb4.toString());
                                        if (!z12) {
                                        }
                                        str32 = str29;
                                        str33 = str28;
                                        if (str33 == null) {
                                        }
                                        return str33;
                                    }
                                } else {
                                    str2 = str42;
                                    str3 = str41;
                                    n0.deleteNotificationChannel(id2);
                                }
                            }
                        }
                        str2 = str42;
                        i13 = i19;
                        str3 = str41;
                        n0.deleteNotificationChannel(id2);
                    } else {
                        str4 = str43;
                        str2 = str42;
                        i12 = size;
                        i13 = i19;
                        str3 = str41;
                    }
                    i19 = i13 + 1;
                    size = i12;
                    notificationChannels = list;
                    str43 = str4;
                    str42 = str2;
                    str41 = str3;
                }
                str2 = str42;
                str3 = str41;
                if (editor2 != null) {
                    editor2.commit();
                }
                z13 = true;
            } catch (Exception e12) {
                e = e12;
                str2 = str42;
            }
            c10.edit().putBoolean("groupsCreated5", z13).commit();
            this.Q = Boolean.TRUE;
        }
        if (this.R) {
            str5 = "priority_group";
            str6 = "reactions";
            str7 = "priority_";
            str8 = "priority_channel";
            str9 = "vibrate_channel";
            str10 = "private";
            str11 = "priority_react";
            str12 = "vibrate_messages";
            str13 = "priority_messages";
            str14 = "vibrate_group";
        } else {
            List<NotificationChannelGroup> notificationChannelGroups = n0.getNotificationChannelGroups();
            str12 = "vibrate_messages";
            StringBuilder sb7 = new StringBuilder("channels");
            str14 = "vibrate_group";
            sb7.append(this.currentAccount);
            String sb8 = sb7.toString();
            String str45 = "groups" + this.currentAccount;
            String str46 = "private" + this.currentAccount;
            String str47 = "stories" + this.currentAccount;
            String str48 = "reactions" + this.currentAccount;
            String str49 = "other" + this.currentAccount;
            int size2 = notificationChannelGroups.size();
            str5 = "priority_group";
            String str50 = str46;
            str11 = "priority_react";
            String str51 = str47;
            str13 = "priority_messages";
            String str52 = str48;
            str7 = "priority_";
            String str53 = str45;
            str9 = "vibrate_channel";
            String str54 = sb8;
            str8 = "priority_channel";
            String str55 = str49;
            int i20 = 0;
            while (i20 < size2) {
                List<NotificationChannelGroup> list2 = notificationChannelGroups;
                String id3 = notificationChannelGroups.get(i20).getId();
                if (str54 != null && str54.equals(id3)) {
                    str54 = null;
                } else if (str53 != null && str53.equals(id3)) {
                    str53 = null;
                } else if (str51 != null && str51.equals(id3)) {
                    str51 = null;
                } else if (str52 != null && str52.equals(id3)) {
                    str52 = null;
                } else if (str50 != null && str50.equals(id3)) {
                    str50 = null;
                } else if (str55 != null && str55.equals(id3)) {
                    str55 = null;
                }
                if (str54 == null && str51 == null && str52 == null && str53 == null && str50 == null && str55 == null) {
                    break;
                }
                i20++;
                notificationChannelGroups = list2;
            }
            if (str54 == null && str53 == null && str52 == null && str51 == null && str50 == null && str55 == null) {
                str6 = "reactions";
                str10 = "private";
            } else {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(getUserConfig().e()));
                if (a22 == null) {
                    getUserConfig().f();
                }
                if (a22 != null) {
                    StringBuilder sb9 = new StringBuilder(" (");
                    str6 = "reactions";
                    sb9.append(g5.m(0, a22.first_name, a22.last_name));
                    sb9.append(")");
                    str40 = sb9.toString();
                } else {
                    str6 = "reactions";
                    str40 = "";
                }
                ArrayList arrayList = new ArrayList();
                if (str54 != null) {
                    StringBuilder sb10 = new StringBuilder();
                    str10 = "private";
                    sb10.append(bd.M0(2131747929, null));
                    sb10.append(str40);
                    arrayList.add(new NotificationChannelGroup(str54, sb10.toString()));
                } else {
                    str10 = "private";
                }
                if (str53 != null) {
                    arrayList.add(new NotificationChannelGroup(str53, bd.M0(2131747915, null) + str40));
                }
                if (str51 != null) {
                    arrayList.add(new NotificationChannelGroup(str51, bd.M0(2131747873, null) + str40));
                }
                if (str52 != null) {
                    arrayList.add(new NotificationChannelGroup(str52, bd.M0(2131747885, null) + str40));
                }
                if (str50 != null) {
                    arrayList.add(new NotificationChannelGroup(str50, bd.M0(2131747886, null) + str40));
                }
                if (str55 != null) {
                    arrayList.add(new NotificationChannelGroup(str55, bd.M0(2131747899, null) + str40));
                }
                n0.createNotificationChannelGroups(arrayList);
            }
            this.R = true;
        }
        SharedPreferences c1122 = getAccountInstance().c();
        if (z12) {
            i14 = i11;
            str18 = "other" + this.currentAccount;
            str16 = str6;
            str15 = str10;
            str17 = null;
        } else {
            i14 = i11;
            if (i14 == 2) {
                str19 = "channels" + this.currentAccount;
                str20 = "overwrite_channel";
            } else if (i14 == 0) {
                str19 = "groups" + this.currentAccount;
                str20 = "overwrite_group";
            } else if (i14 == 3) {
                str19 = "stories" + this.currentAccount;
                str20 = "overwrite_stories";
            } else if (i14 == 4 || i14 == 5) {
                str15 = str10;
                str16 = str6;
                str17 = "overwrite_reactions";
                str18 = str16 + this.currentAccount;
            } else {
                str15 = str10;
                str18 = str15 + this.currentAccount;
                str17 = "overwrite_private";
                str16 = str6;
            }
            str18 = str19;
            str17 = str20;
            str16 = str6;
            str15 = str10;
        }
        boolean z27 = z10 && m5.C(j10);
        z14 = z11 && str17 != null && c1122.getBoolean(str17, false);
        a10 = Utilities.a(uri == null ? "NoSound2" : uri.toString());
        if (a10 != null && a10.length() > 5) {
            a10 = a10.substring(0, 5);
        }
        if (z12) {
            str16 = "silent";
            j12 = j10;
            str21 = bd.M0(2131747880, null);
        } else {
            if (z10) {
                a02 = bd.M0(z11 ? 2131747913 : 2131747924, null);
                if (i14 == 2) {
                    j12 = j10;
                    str21 = a02;
                    str16 = z11 ? "channels_ia" : "channels";
                } else if (i14 == 0) {
                    j12 = j10;
                    str21 = a02;
                    str16 = z11 ? "groups_ia" : "groups";
                } else if (i14 == 3) {
                    str21 = a02;
                    str16 = z11 ? "stories_ia" : "stories";
                    j12 = j10;
                } else {
                    if (i14 != 4 && i14 != 5) {
                        if (z11) {
                            str15 = "private_ia";
                        }
                        j12 = j10;
                        str21 = a02;
                        str16 = str15;
                    }
                    j12 = j10;
                }
            } else {
                a02 = z11 ? bd.a0(null, null, 2131747927, str) : str;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(z11 ? "org.telegram.keyia" : "org.telegram.key");
                j12 = j10;
                sb11.append(j12);
                sb11.append("_");
                sb11.append(j11);
                str16 = sb11.toString();
            }
            str21 = a02;
        }
        String C22 = a1.g.C(str16, "_", a10);
        string = c1122.getString(C22, null);
        StringBuilder sb522 = new StringBuilder();
        sb522.append(C22);
        String str4422 = "_s";
        sb522.append("_s");
        String string222 = c1122.getString(sb522.toString(), null);
        StringBuilder sb622 = new StringBuilder();
        if (string != null) {
            NotificationChannel notificationChannel3 = n0.getNotificationChannel(string);
            sharedPreferences = c1122;
            str24 = str21;
            if (r2.a) {
                z15 = z27;
                a8.b("current channel for " + string + " = " + notificationChannel3);
            } else {
                z15 = z27;
            }
            if (notificationChannel3 == null) {
                jArr2 = jArr;
                i15 = i3;
                sb3 = sb622;
                str25 = str18;
                str26 = "_s";
                str27 = "_";
                j13 = 0;
                i16 = i10;
                str30 = null;
                str29 = null;
                str28 = null;
                z17 = false;
                if (z17) {
                }
                str31 = str26;
                if (!z14) {
                }
                i17 = 0;
                while (i17 < jArr2.length) {
                }
                boolean z2622 = z14;
                sb4 = sb3;
                sb4.append(i15);
                if (uri != null) {
                }
                sb4.append(i16);
                if (!z10) {
                    sb4.append("secret");
                }
                str29 = Utilities.a(sb4.toString());
                if (!z12) {
                    n0.deleteNotificationChannel(str28);
                    if (r2.a) {
                    }
                    str32 = str29;
                    str33 = null;
                    if (str33 == null) {
                    }
                    return str33;
                }
                str32 = str29;
                str33 = str28;
                if (str33 == null) {
                }
                return str33;
            }
            if (!z12 && !z14) {
                int importance2 = notificationChannel3.getImportance();
                Uri sound = notificationChannel3.getSound();
                long[] vibrationPattern = notificationChannel3.getVibrationPattern();
                boolean shouldVibrate = notificationChannel3.shouldVibrate();
                if (shouldVibrate || vibrationPattern != null) {
                    notificationChannel = notificationChannel3;
                    z18 = z14;
                    jArr3 = vibrationPattern;
                } else {
                    notificationChannel = notificationChannel3;
                    z18 = z14;
                    jArr3 = new long[]{0, 0};
                }
                str25 = str18;
                int lightColor = notificationChannel.getLightColor();
                str27 = "_";
                if (jArr3 != null) {
                    int i21 = 0;
                    while (i21 < jArr3.length) {
                        sb622.append(jArr3[i21]);
                        i21++;
                        str4422 = str4422;
                        shouldVibrate = shouldVibrate;
                    }
                    str35 = str4422;
                    z19 = shouldVibrate;
                } else {
                    z19 = shouldVibrate;
                    str35 = "_s";
                }
                sb622.append(lightColor);
                if (sound != null) {
                    sb622.append(sound.toString());
                }
                sb622.append(importance2);
                if (!z10 && z15) {
                    sb622.append("secret");
                }
                if (r2.a) {
                    StringBuilder sb12 = new StringBuilder("current channel settings for ");
                    sb12.append(string);
                    sb12.append(" = ");
                    sb12.append((Object) sb622);
                    sb12.append(" old = ");
                    k2.p1.w(string222, sb12);
                }
                String a11 = Utilities.a(sb622.toString());
                sb622.setLength(0);
                i16 = i10;
                if (z11 && i16 != importance2) {
                    jArr4 = jArr;
                    i15 = i3;
                    str36 = string;
                    str37 = string222;
                    sb3 = sb622;
                    str38 = a11;
                    str26 = str35;
                    j13 = 0;
                    z21 = false;
                    z20 = true;
                } else if (a11.equals(string222)) {
                    i15 = i3;
                    str36 = string;
                    str37 = string222;
                    sb3 = sb622;
                    str38 = a11;
                    str26 = str35;
                    j13 = 0;
                    jArr4 = jArr;
                    z20 = z18;
                    z21 = false;
                } else {
                    str36 = string;
                    str37 = string222;
                    if (importance2 == 0) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        if (!z10) {
                            z24 = true;
                            if (i11 == 3) {
                                StringBuilder sb13 = new StringBuilder("stories_");
                                j14 = 0;
                                sb13.append(v(j12, 0L, false));
                                edit.putBoolean(sb13.toString(), false);
                            } else {
                                j14 = 0;
                                edit.putInt("notify2_" + v(j12, 0L, false), 2);
                            }
                            j13 = j14;
                            str38 = a11;
                            c0(j10, 0L, true);
                            j12 = j10;
                        } else if (z11) {
                            str38 = a11;
                            j13 = 0;
                            z24 = true;
                        } else {
                            if (i11 == 3) {
                                edit.putBoolean("EnableAllStories", false);
                                c2 = 4;
                                z25 = true;
                            } else {
                                c2 = 4;
                                if (i11 == 4) {
                                    z25 = true;
                                    edit.putBoolean("EnableReactionsMessages", true);
                                    edit.putBoolean("EnableReactionsStories", true);
                                } else {
                                    z25 = true;
                                    edit.putInt(q(i11), ConnectionsManager.DEFAULT_DATACENTER_ID);
                                }
                            }
                            b0(i11);
                            str38 = a11;
                            z24 = z25;
                            j13 = 0;
                        }
                        editor = edit;
                        jArr4 = jArr3;
                        str26 = str35;
                        z21 = z24;
                        str39 = str2;
                        sb3 = sb622;
                        i18 = i11;
                    } else {
                        str38 = a11;
                        j13 = 0;
                        str39 = str2;
                        sb3 = sb622;
                        if (importance2 != i16) {
                            if (z11) {
                                i18 = i11;
                                jArr4 = jArr3;
                                str26 = str35;
                                editor = null;
                            } else {
                                jArr4 = jArr3;
                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                int i22 = (importance2 == 4 || importance2 == 5) ? 1 : importance2 == 1 ? 4 : importance2 == 2 ? 5 : 0;
                                if (z10) {
                                    i18 = i11;
                                    str26 = str35;
                                    if (i18 == 3) {
                                        edit2.putBoolean("EnableAllStories", true);
                                    } else if (i18 == 4) {
                                        edit2.putBoolean("EnableReactionsMessages", true);
                                        edit2.putBoolean("EnableReactionsStories", true);
                                    } else {
                                        edit2.putInt(q(i18), 0);
                                    }
                                    if (i18 == 2) {
                                        edit2.putInt(str8, i22);
                                    } else if (i18 == 0) {
                                        edit2.putInt(str5, i22);
                                    } else if (i18 == 3) {
                                        edit2.putInt("priority_stories", i22);
                                    } else if (i18 == 4 || i18 == 5) {
                                        edit2.putInt(str11, i22);
                                    } else {
                                        edit2.putInt(str13, i22);
                                    }
                                } else {
                                    i18 = i11;
                                    str26 = str35;
                                    if (i18 == 3) {
                                        edit2.putBoolean("stories_" + j12, true);
                                    } else {
                                        edit2.putInt("notify2_" + j12, 0);
                                        edit2.remove("notifyuntil_" + j12);
                                        edit2.putInt(str7 + j12, i22);
                                    }
                                }
                                editor = edit2;
                            }
                            z21 = true;
                        } else {
                            i18 = i11;
                            jArr4 = jArr3;
                            str26 = str35;
                            z21 = false;
                            editor = null;
                        }
                    }
                    if (jArr != null && jArr.length != 0) {
                        for (long j15 : jArr) {
                            if (j15 == j13) {
                            }
                        }
                        z22 = true;
                        z23 = z19;
                        if ((!z22) == z23) {
                            if (!z11) {
                                if (editor == null) {
                                    editor = sharedPreferences.edit();
                                }
                                if (!z10) {
                                    editor.putInt(a1.g.p(j12, str3), z23 ? 0 : 2);
                                } else if (i18 == 2) {
                                    editor.putInt(str9, z23 ? 0 : 2);
                                } else if (i18 == 0) {
                                    editor.putInt(str14, z23 ? 0 : 2);
                                } else if (i18 == 3) {
                                    editor.putInt("vibrate_stories", z23 ? 0 : 2);
                                } else if (i18 == 4 || i18 == 5) {
                                    editor.putInt(str39, z23 ? 0 : 2);
                                } else {
                                    editor.putInt(str12, z23 ? 0 : 2);
                                }
                            }
                            z21 = true;
                        } else {
                            jArr4 = jArr;
                        }
                        i15 = i3;
                        if (lightColor != i15) {
                            if (!z11) {
                                if (editor == null) {
                                    editor = sharedPreferences.edit();
                                }
                                if (!z10) {
                                    editor.putInt("color_" + j12, lightColor);
                                } else if (i18 == 2) {
                                    editor.putInt("ChannelLed", lightColor);
                                } else if (i18 == 0) {
                                    editor.putInt("GroupLed", lightColor);
                                } else if (i18 == 3) {
                                    editor.putInt("StoriesLed", lightColor);
                                } else if (i18 == 5 || i18 == 4) {
                                    editor.putInt("ReactionsLed", lightColor);
                                } else {
                                    editor.putInt("MessagesLed", lightColor);
                                }
                            }
                            i15 = lightColor;
                            z21 = true;
                        }
                        if (editor != null) {
                            editor.commit();
                        }
                        z20 = z18;
                    }
                    z22 = false;
                    z23 = z19;
                    if ((!z22) == z23) {
                    }
                    i15 = i3;
                    if (lightColor != i15) {
                    }
                    if (editor != null) {
                    }
                    z20 = z18;
                }
                str28 = str36;
                z17 = z21;
                z14 = z20;
                jArr2 = jArr4;
                str30 = str37;
                str29 = str38;
                if (z17 || str29 == null) {
                    str31 = str26;
                    if (!z14 || str29 == null || !z11 || !z10) {
                        i17 = 0;
                        while (i17 < jArr2.length) {
                            sb3.append(jArr2[i17]);
                            i17++;
                            z14 = z14;
                        }
                        boolean z26222 = z14;
                        sb4 = sb3;
                        sb4.append(i15);
                        if (uri != null) {
                            sb4.append(uri.toString());
                        }
                        sb4.append(i16);
                        if (!z10 && z15) {
                            sb4.append("secret");
                        }
                        str29 = Utilities.a(sb4.toString());
                        if (!z12 && str28 != null && (z26222 || !str30.equals(str29))) {
                            try {
                                n0.deleteNotificationChannel(str28);
                            } catch (Exception e13) {
                                a8.g(e13, true);
                            }
                            if (r2.a) {
                                a8.b("delete channel by settings change ".concat(str28));
                            }
                            str32 = str29;
                            str33 = null;
                            if (str33 == null) {
                                str33 = z10 ? this.currentAccount + "channel_" + C22 + str27 + Utilities.b.nextLong() : this.currentAccount + "channel_" + j12 + str27 + Utilities.b.nextLong();
                                if (z15) {
                                    uri2 = null;
                                    str34 = bd.M0(2131745703, null);
                                } else {
                                    uri2 = null;
                                    str34 = str24;
                                }
                                NotificationChannel notificationChannel4 = new NotificationChannel(str33, str34, i16);
                                notificationChannel4.setGroup(str25);
                                if (i15 != 0) {
                                    notificationChannel4.enableLights(true);
                                    notificationChannel4.setLightColor(i15);
                                } else {
                                    notificationChannel4.enableLights(false);
                                }
                                if (jArr2 != null && jArr2.length != 0) {
                                    for (long j16 : jArr2) {
                                        if (j16 == j13) {
                                        }
                                    }
                                    notificationChannel4.enableVibration(false);
                                    AudioAttributes.Builder builder = new AudioAttributes.Builder();
                                    builder.setContentType(4);
                                    builder.setUsage(5);
                                    if (uri == null) {
                                        notificationChannel4.setSound(uri, builder.build());
                                    } else {
                                        notificationChannel4.setSound(uri2, builder.build());
                                    }
                                    if (r2.a) {
                                        a8.b("create new channel " + str33);
                                    }
                                    this.P = SystemClock.elapsedRealtime();
                                    n0.createNotificationChannel(notificationChannel4);
                                    sharedPreferences.edit().putString(C22, str33).putString(C22 + str31, str32).commit();
                                }
                                notificationChannel4.enableVibration(true);
                                if (jArr2.length > 0) {
                                    notificationChannel4.setVibrationPattern(jArr2);
                                }
                                AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
                                builder2.setContentType(4);
                                builder2.setUsage(5);
                                if (uri == null) {
                                }
                                if (r2.a) {
                                }
                                this.P = SystemClock.elapsedRealtime();
                                n0.createNotificationChannel(notificationChannel4);
                                sharedPreferences.edit().putString(C22, str33).putString(C22 + str31, str32).commit();
                            }
                            return str33;
                        }
                    }
                } else {
                    SharedPreferences.Editor putString = sharedPreferences.edit().putString(C22, str28);
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append(C22);
                    str31 = str26;
                    sb14.append(str31);
                    putString.putString(sb14.toString(), str29).commit();
                    if (r2.a) {
                        a8.b("change edited channel " + str28);
                    }
                }
                str32 = str29;
                str33 = str28;
                if (str33 == null) {
                }
                return str33;
            }
            jArr2 = jArr;
            i15 = i3;
            str22 = string;
            str23 = string222;
            sb3 = sb622;
            str25 = str18;
            str26 = "_s";
            z16 = z14;
            str27 = "_";
            j13 = 0;
        } else {
            i15 = i3;
            str22 = string;
            str23 = string222;
            sb3 = sb622;
            sharedPreferences = c1122;
            str24 = str21;
            str25 = str18;
            str26 = "_s";
            z15 = z27;
            z16 = z14;
            str27 = "_";
            j13 = 0;
            jArr2 = jArr;
        }
        i16 = i10;
        str28 = str22;
        z14 = z16;
        str30 = str23;
        str29 = null;
        z17 = false;
        if (z17) {
        }
        str31 = str26;
        if (!z14) {
        }
        i17 = 0;
        while (i17 < jArr2.length) {
        }
        boolean z262222 = z14;
        sb4 = sb3;
        sb4.append(i15);
        if (uri != null) {
        }
        sb4.append(i16);
        if (!z10) {
        }
        str29 = Utilities.a(sb4.toString());
        if (!z12) {
        }
        str32 = str29;
        str33 = str28;
        if (str33 == null) {
        }
        return str33;
    }

    public final void h(zi ziVar) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i3 >= arrayList.size()) {
                arrayList.add(0, ziVar);
                return;
            } else if (((zi) arrayList.get(i3)).f1() == ziVar.f1() && zi.B0(((zi) arrayList.get(i3)).k) == zi.B0(ziVar.k) && ((zi) arrayList.get(i3)).K == ziVar.K) {
                return;
            } else {
                i3++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[Catch: Exception -> 0x0067, TryCatch #0 {Exception -> 0x0067, blocks: (B:13:0x002b, B:16:0x0063, B:17:0x006e, B:20:0x0082, B:22:0x00a1, B:24:0x00ad, B:25:0x00b3, B:27:0x00bb, B:29:0x00bf, B:31:0x00c2, B:33:0x00cf, B:35:0x00d3, B:37:0x00d8, B:38:0x00df, B:40:0x00e3, B:41:0x00e8, B:43:0x010d, B:44:0x0115, B:46:0x011e, B:48:0x0146, B:50:0x0151, B:55:0x015f, B:59:0x017c, B:60:0x0183, B:61:0x0184, B:64:0x0129, B:67:0x0136, B:69:0x013b, B:70:0x0111, B:71:0x0188, B:72:0x018f, B:73:0x0190, B:74:0x0197, B:76:0x007e, B:77:0x006a), top: B:12:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0190 A[Catch: Exception -> 0x0067, TryCatch #0 {Exception -> 0x0067, blocks: (B:13:0x002b, B:16:0x0063, B:17:0x006e, B:20:0x0082, B:22:0x00a1, B:24:0x00ad, B:25:0x00b3, B:27:0x00bb, B:29:0x00bf, B:31:0x00c2, B:33:0x00cf, B:35:0x00d3, B:37:0x00d8, B:38:0x00df, B:40:0x00e3, B:41:0x00e8, B:43:0x010d, B:44:0x0115, B:46:0x011e, B:48:0x0146, B:50:0x0151, B:55:0x015f, B:59:0x017c, B:60:0x0183, B:61:0x0184, B:64:0x0129, B:67:0x0136, B:69:0x013b, B:70:0x0111, B:71:0x0188, B:72:0x018f, B:73:0x0190, B:74:0x0197, B:76:0x007e, B:77:0x006a), top: B:12:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String j(e0.q qVar, long j10, String str, TLRPC.User user, TLRPC.Chat chat, e0.k0 k0Var, boolean z10) {
        Bitmap bitmap;
        IconCompat d;
        if (Build.VERSION.SDK_INT < 29 || !az.q0) {
            return null;
        }
        if (t3.T(chat) && !chat.megagroup) {
            return null;
        }
        try {
            String str2 = "ndid_" + j10;
            Intent intent = new Intent(t0.b, (Class<?>) OpenChatReceiver.class);
            intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
            if (j10 > 0) {
                intent.putExtra("userId", j10);
            } else {
                intent.putExtra("chatId", -j10);
            }
            Context context = t0.b;
            g0.c cVar = new g0.c();
            cVar.a = context;
            cVar.b = str2;
            cVar.e = chat != null ? str : l10.j(user, true);
            cVar.f = str;
            new Intent("android.intent.action.VIEW");
            cVar.c = new Intent[]{intent};
            cVar.l = true;
            cVar.k = new f0.g(str2);
            if (k0Var != null) {
                cVar.i = new e0.k0[]{k0Var};
                IconCompat iconCompat = k0Var.b;
                cVar.h = iconCompat;
                if (iconCompat != null) {
                    bitmap = iconCompat.f();
                    if (!TextUtils.isEmpty(cVar.e)) {
                        throw new IllegalArgumentException("Shortcut must have a non-empty label");
                    }
                    Intent[] intentArr = cVar.c;
                    if (intentArr == null || intentArr.length == 0) {
                        throw new IllegalArgumentException("Shortcut must have an intent");
                    }
                    g0.f.m(t0.b, cVar);
                    String str3 = cVar.b;
                    qVar.z = str3;
                    if (qVar.A == null) {
                        f0.g gVar = cVar.k;
                        if (gVar != null) {
                            qVar.A = gVar;
                        } else if (str3 != null) {
                            qVar.A = new f0.g(str3);
                        }
                    }
                    if (qVar.e == null) {
                        qVar.g(cVar.e);
                    }
                    Intent intent2 = new Intent(t0.b, (Class<?>) BubbleActivity.class);
                    intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    if (m5.E(j10)) {
                        intent2.putExtra("userId", j10);
                    } else {
                        intent2.putExtra("chatId", -j10);
                    }
                    intent2.putExtra("currentAccount", this.currentAccount);
                    if (bitmap != null) {
                        d = new IconCompat(5);
                        d.b = bitmap;
                    } else if (user != null) {
                        d = IconCompat.d(t0.b, user.bot ? R.drawable.book_bot : R.drawable.book_user);
                    } else {
                        d = IconCompat.d(t0.b, R.drawable.book_group);
                    }
                    if (!z10) {
                        qVar.E = null;
                        return str2;
                    }
                    PendingIntent activity = PendingIntent.getActivity(t0.b, 0, intent2, 167772160);
                    if (activity == null) {
                        throw new NullPointerException("Bubble requires non-null pending intent");
                    }
                    int i3 = (this.G > j10 ? 1 : (this.G == j10 ? 0 : -1)) == 0 ? 2 : 0;
                    int max = Math.max(g0.L(640.0f), 0);
                    e0.o oVar = new e0.o();
                    oVar.a = activity;
                    oVar.b = d;
                    oVar.c = max;
                    oVar.d = i3 & (-2);
                    qVar.E = oVar;
                    return str2;
                }
            }
            bitmap = null;
            if (!TextUtils.isEmpty(cVar.e)) {
            }
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public final void l(long j10, long j11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        l0.c(new js(this, j10, j11, 1));
    }

    public final void m(int i3) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        l0.c(new os(this, i3, 8));
    }

    public final void n(int i3) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences c2 = getAccountInstance().c();
            SharedPreferences.Editor edit = c2.edit();
            if (i3 == 2) {
                str = "channels";
            } else if (i3 == 0) {
                str = "groups";
            } else if (i3 == 3) {
                str = "stories";
            } else {
                if (i3 != 4 && i3 != 5) {
                    str = "private";
                }
                str = "reactions";
            }
            String string = c2.getString(str, null);
            if (string != null) {
                edit.remove(str).remove(str.concat("_s"));
                try {
                    n0.deleteNotificationChannel(string);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (r2.a) {
                    a8.b("delete channel global internal ".concat(string));
                }
            }
            if (i3 == 2) {
                str2 = "channels_ia";
            } else if (i3 == 0) {
                str2 = "groups_ia";
            } else if (i3 == 3) {
                str2 = "stories_ia";
            } else {
                if (i3 != 4 && i3 != 5) {
                    str2 = "private_ia";
                }
                str2 = "reactions_ia";
            }
            String string2 = c2.getString(str2, null);
            if (string2 != null) {
                edit.remove(str2).remove(str2.concat("_s"));
                try {
                    n0.deleteNotificationChannel(string2);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                if (r2.a) {
                    a8.b("delete channel global internal ".concat(string2));
                }
            }
            if (i3 == 2) {
                str3 = "overwrite_channel";
            } else if (i3 == 0) {
                str3 = "overwrite_group";
            } else if (i3 == 3) {
                str3 = "overwrite_stories";
            } else {
                if (i3 != 4 && i3 != 5) {
                    str3 = "overwrite_private";
                }
                str3 = "overwrite_reactions";
            }
            edit.remove(str3);
            edit.commit();
        } catch (Exception e12) {
            a8.g(e12, true);
        }
    }

    public final void o(long j10, long j11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences c2 = getAccountInstance().c();
            SharedPreferences.Editor edit = c2.edit();
            String str = "org.telegram.key" + j10;
            if (j11 != 0) {
                str = str + ".topic" + j11;
            }
            String string = c2.getString(str, null);
            if (string != null) {
                edit.remove(str).remove(str + "_s");
                try {
                    n0.deleteNotificationChannel(string);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (r2.a) {
                    a8.b("delete channel internal ".concat(string));
                }
            }
            String str2 = "org.telegram.keyia" + j10;
            String string2 = c2.getString(str2, null);
            if (string2 != null) {
                edit.remove(str2).remove(str2 + "_s");
                try {
                    n0.deleteNotificationChannel(string2);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                if (r2.a) {
                    a8.b("delete channel internal ".concat(string2));
                }
            }
            edit.commit();
        } catch (Exception e12) {
            a8.g(e12, true);
        }
    }

    public final void p() {
        a0.h hVar = this.h;
        a8.b("NotificationsController dismissNotification");
        try {
            m0.b(this.e0, null);
            this.a.clear();
            this.c.b();
            this.n.b();
            for (int i3 = 0; i3 < hVar.m(); i3++) {
                if (!this.y.contains(Long.valueOf(hVar.j(i3)))) {
                    m0.b(((Integer) hVar.n(i3)).intValue(), null);
                }
            }
            hVar.b();
            g0.h3(new hc(9));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final int u(long j10, long j11) {
        int c2 = this.h0.c(-1, j10, j11, "notify2_");
        if (c2 != 3 || this.h0.c(0, j10, j11, "notifyuntil_") < getConnectionsManager().getCurrentTime()) {
            return c2;
        }
        return 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x0210, code lost:
    
        if (r15.getBoolean("EnablePreviewAll", true) == false) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0226, code lost:
    
        r2 = r31.k;
        r7 = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0235, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageService) == false) goto L734;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0237, code lost:
    
        r32[0] = null;
        r2 = r2.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x023d, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGramTransfer) == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0243, code lost:
    
        return r(r31, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0246, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetSameChatWallPaper) == false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x024f, code lost:
    
        return org.telegram.messenger.bd.L0(2131742961);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0252, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatWallPaper) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x025b, code lost:
    
        return org.telegram.messenger.bd.L0(2131742963);
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x025e, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGeoProximityReached) == false) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0266, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0269, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) != false) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x026d, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionContactSignUp) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0274, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserUpdatedPhoto) == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0282, code lost:
    
        return org.telegram.messenger.bd.Z(2131748053, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0286, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionLoginUnknownLocation) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0288, code lost:
    
        r2 = org.telegram.messenger.bd.Z(2131742793, org.telegram.messenger.bd.E0().C0().format(r31.k.date * 1000), org.telegram.messenger.bd.E0().p0().format(r31.k.date * 1000));
        r3 = getUserConfig().f().first_name;
        r1 = r31.k.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02e5, code lost:
    
        return org.telegram.messenger.bd.Z(2131747935, r3, r2, r1.title, r1.address);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x031b, code lost:
    
        if (dg.d.g(r2, org.telegram.tgnet.TLRPC.TL_messageActionGameScore.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSent.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSentMe.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGift.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftPremium.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesPrice.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesRefunded.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftTon.class) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0323, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0324, code lost:
    
        r2 = r31.k;
        r4 = r2.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x032a, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPhoneCall) == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x032e, code lost:
    
        if (r4.video == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0337, code lost:
    
        return org.telegram.messenger.bd.L0(2131752610);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033f, code lost:
    
        return org.telegram.messenger.bd.L0(2131752617);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0342, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionConferenceCall) == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0346, code lost:
    
        if (r4.video == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x034f, code lost:
    
        return org.telegram.messenger.bd.L0(2131752612);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0357, code lost:
    
        return org.telegram.messenger.bd.L0(2131752619);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x035c, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatAddUser) == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x035e, code lost:
    
        r6 = r4.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0362, code lost:
    
        if (r6 != 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x036b, code lost:
    
        if (r4.users.size() != 1) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x036d, code lost:
    
        r6 = r31.k.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0384, code lost:
    
        if (r6 == 0) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x038e, code lost:
    
        if (r31.k.peer_id.channel_id == 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0392, code lost:
    
        if (r5.megagroup != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03aa, code lost:
    
        return org.telegram.messenger.bd.Z(2131752521, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03b2, code lost:
    
        if (r6 != r26) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03c5, code lost:
    
        return org.telegram.messenger.bd.Z(2131748025, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03c6, code lost:
    
        r1 = getMessagesController().a2(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03d2, code lost:
    
        if (r1 != null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03da, code lost:
    
        if (r12 != r1.id) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03de, code lost:
    
        if (r5.megagroup == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03f6, code lost:
    
        return org.telegram.messenger.bd.Z(2131748040, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x040d, code lost:
    
        return org.telegram.messenger.bd.Z(2131748041, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0427, code lost:
    
        return org.telegram.messenger.bd.Z(2131748042, r3, y(r5), org.telegram.messenger.l10.p(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0428, code lost:
    
        r2 = new java.lang.StringBuilder();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0438, code lost:
    
        if (r6 >= r31.k.action.users.size()) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x043a, code lost:
    
        r7 = getMessagesController().a2(r31.k.action.users.get(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x044e, code lost:
    
        if (r7 == null) goto L918;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0450, code lost:
    
        r7 = org.telegram.messenger.l10.p(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0458, code lost:
    
        if (r2.length() == 0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x045a, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x045d, code lost:
    
        r2.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0460, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x047c, code lost:
    
        return org.telegram.messenger.bd.Z(2131748042, r3, y(r5), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0482, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCall) == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0486, code lost:
    
        if (r4.duration == 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0499, code lost:
    
        return org.telegram.messenger.bd.Z(2131748037, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04ab, code lost:
    
        return org.telegram.messenger.bd.Z(2131748038, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04ae, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCallScheduled) == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04b6, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04b9, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionInviteToGroupCall) == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04bb, code lost:
    
        r6 = r4.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04bf, code lost:
    
        if (r6 != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04c8, code lost:
    
        if (r4.users.size() != 1) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04ca, code lost:
    
        r6 = r31.k.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04e0, code lost:
    
        if (r6 == 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04e4, code lost:
    
        if (r6 != r26) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x04fc, code lost:
    
        return org.telegram.messenger.bd.Z(2131748033, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04fd, code lost:
    
        r1 = getMessagesController().a2(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0509, code lost:
    
        if (r1 != null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0528, code lost:
    
        return org.telegram.messenger.bd.Z(2131748034, r3, y(r5), org.telegram.messenger.l10.p(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0529, code lost:
    
        r2 = new java.lang.StringBuilder();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0539, code lost:
    
        if (r6 >= r31.k.action.users.size()) goto L919;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x053b, code lost:
    
        r7 = getMessagesController().a2(r31.k.action.users.get(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x054f, code lost:
    
        if (r7 == null) goto L921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0551, code lost:
    
        r7 = org.telegram.messenger.l10.p(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0559, code lost:
    
        if (r2.length() == 0) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x055b, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x055e, code lost:
    
        r2.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0561, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x057e, code lost:
    
        return org.telegram.messenger.bd.Z(2131748034, r3, y(r5), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0582, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiftCode) == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x058b, code lost:
    
        return org.telegram.messenger.bd.L0(2131753310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x058e, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByLink) == false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05a5, code lost:
    
        return org.telegram.messenger.bd.Z(2131748024, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x05ac, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditTitle) == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x05bd, code lost:
    
        return org.telegram.messenger.bd.Z(2131748051, r3, r4.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x05c0, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditPhoto) != false) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x05c4, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeletePhoto) == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x05ca, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeleteUser) == false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x05cc, code lost:
    
        r6 = r4.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x05d0, code lost:
    
        if (r6 != r26) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x05e8, code lost:
    
        return org.telegram.messenger.bd.Z(2131748031, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x05f0, code lost:
    
        if (r6 != r12) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0603, code lost:
    
        return org.telegram.messenger.bd.Z(2131748030, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0604, code lost:
    
        r1 = getMessagesController().a2(java.lang.Long.valueOf(r31.k.action.user_id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0616, code lost:
    
        if (r1 != null) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0638, code lost:
    
        return org.telegram.messenger.bd.Z(2131748032, r3, y(r5), org.telegram.messenger.l10.p(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x063b, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatCreate) == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0643, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0646, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelCreate) == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x064e, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0654, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatMigrateTo) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0665, code lost:
    
        return org.telegram.messenger.bd.Z(2131754602, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x066b, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0677, code lost:
    
        return org.telegram.messenger.bd.Z(2131754602, r4.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x067a, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionScreenshotTaken) == false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0682, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0685, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayLaunch) == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x068d, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0690, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayResults) == false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0698, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x069b, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSuggestBirthday) == false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x06a3, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x06a6, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPinMessage) == false) goto L671;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06ac, code lost:
    
        if (r5 == null) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06b2, code lost:
    
        if (org.telegram.messenger.t3.T(r5) == false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x06b6, code lost:
    
        if (r5.megagroup == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06bc, code lost:
    
        r1 = r31.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x06c1, code lost:
    
        if (r1 != null) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x06d6, code lost:
    
        return org.telegram.messenger.bd.Z(2131748096, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x06e0, code lost:
    
        if (r1.J3() == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x06f3, code lost:
    
        return org.telegram.messenger.bd.Z(2131748099, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x06fb, code lost:
    
        if (r1.I4() == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0705, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x072d, code lost:
    
        return org.telegram.messenger.bd.Z(2131748075, r3, "📹 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0744, code lost:
    
        return org.telegram.messenger.bd.Z(2131748069, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0749, code lost:
    
        if (r1.r3() == false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0753, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x077b, code lost:
    
        return org.telegram.messenger.bd.Z(2131748075, r3, "🎬 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0792, code lost:
    
        return org.telegram.messenger.bd.Z(2131748105, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x079c, code lost:
    
        if (r1.Q4() == false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x07af, code lost:
    
        return org.telegram.messenger.bd.Z(2131748066, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x07b4, code lost:
    
        if (r1.i4() == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x07c7, code lost:
    
        return org.telegram.messenger.bd.Z(2131748084, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x07cc, code lost:
    
        if (r1.u4() != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x07d2, code lost:
    
        if (r1.K2() == false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x07d8, code lost:
    
        r7 = r1.k;
        r10 = r7.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x07de, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x07e6, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.message) != false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x080e, code lost:
    
        return org.telegram.messenger.bd.Z(2131748075, r3, "📎 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0825, code lost:
    
        return org.telegram.messenger.bd.Z(2131748120, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0828, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x082c, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0835, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x084d, code lost:
    
        return org.telegram.messenger.bd.Z(2131748109, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0850, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0852, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0876, code lost:
    
        return org.telegram.messenger.bd.Z(2131748123, r3, y(r5), org.telegram.messenger.g5.n(r10.first_name, r10.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0879, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x087b, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x0881, code lost:
    
        if (r10.poll.quiz == false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x08a3, code lost:
    
        return org.telegram.messenger.bd.Z(2131748087, r3, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x08c4, code lost:
    
        return org.telegram.messenger.bd.Z(2131748090, r3, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x08c7, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x08eb, code lost:
    
        return org.telegram.messenger.bd.Z(2131748072, r3, y(r5), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r10).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x08ee, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x08f6, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.message) != false) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x091e, code lost:
    
        return org.telegram.messenger.bd.Z(2131748075, r3, "🖼 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0935, code lost:
    
        return org.telegram.messenger.bd.Z(2131748093, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x093d, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0950, code lost:
    
        return org.telegram.messenger.bd.Z(2131748117, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0951, code lost:
    
        r7 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0953, code lost:
    
        if (r7 == null) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0959, code lost:
    
        if (r7.length() <= 0) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x095b, code lost:
    
        r1 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0961, code lost:
    
        if (r1.length() <= 20) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0963, code lost:
    
        r6 = new java.lang.StringBuilder();
        r7 = 0;
        r6.append((java.lang.Object) r1.subSequence(0, 20));
        r6.append("...");
        r1 = r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0979, code lost:
    
        r2 = y(r5);
        r4 = new java.lang.Object[3];
        r4[r7] = r3;
        r4[1] = r1;
        r4[2] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x098c, code lost:
    
        return org.telegram.messenger.bd.Z(2131748075, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0978, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x099e, code lost:
    
        return org.telegram.messenger.bd.Z(2131748096, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x09b0, code lost:
    
        return org.telegram.messenger.bd.Z(2131748111, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x09b1, code lost:
    
        r1 = r1.W1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x09b5, code lost:
    
        if (r1 == null) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x09cc, code lost:
    
        return org.telegram.messenger.bd.Z(2131748079, r3, y(r5), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x09df, code lost:
    
        return org.telegram.messenger.bd.Z(2131748081, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x09e0, code lost:
    
        if (r5 == null) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x09e2, code lost:
    
        r1 = r31.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x09e7, code lost:
    
        if (r1 != null) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x09f7, code lost:
    
        return org.telegram.messenger.bd.Z(2131748095, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x09fe, code lost:
    
        if (r1.J3() == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0a0f, code lost:
    
        return org.telegram.messenger.bd.Z(2131748098, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0a17, code lost:
    
        if (r1.I4() == false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0a21, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0a45, code lost:
    
        return org.telegram.messenger.bd.Z(2131748074, y(r5), "📹 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0a58, code lost:
    
        return org.telegram.messenger.bd.Z(2131748068, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0a5d, code lost:
    
        if (r1.r3() == false) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0a67, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0a8b, code lost:
    
        return org.telegram.messenger.bd.Z(2131748074, y(r5), "🎬 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0a9e, code lost:
    
        return org.telegram.messenger.bd.Z(2131748104, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0aa6, code lost:
    
        if (r1.Q4() == false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0ab7, code lost:
    
        return org.telegram.messenger.bd.Z(2131748065, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0abc, code lost:
    
        if (r1.i4() == false) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0acd, code lost:
    
        return org.telegram.messenger.bd.Z(2131748083, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0ad2, code lost:
    
        if (r1.u4() != false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0ad8, code lost:
    
        if (r1.K2() == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0ade, code lost:
    
        r6 = r1.k;
        r10 = r6.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0ae4, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0aec, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0b10, code lost:
    
        return org.telegram.messenger.bd.Z(2131748074, y(r5), "📎 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0b23, code lost:
    
        return org.telegram.messenger.bd.Z(2131748119, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0b26, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0b2a, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0b32, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0b46, code lost:
    
        return org.telegram.messenger.bd.Z(2131748108, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0b49, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0b4b, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0b6b, code lost:
    
        return org.telegram.messenger.bd.Z(2131748122, y(r5), org.telegram.messenger.g5.n(r10.first_name, r10.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b6e, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b70, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0b76, code lost:
    
        if (r10.poll.quiz == false) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0b94, code lost:
    
        return org.telegram.messenger.bd.Z(2131748086, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0bb1, code lost:
    
        return org.telegram.messenger.bd.Z(2131748089, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0bb4, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0bd4, code lost:
    
        return org.telegram.messenger.bd.Z(2131748071, y(r5), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r10).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0bd7, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0bdf, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0c03, code lost:
    
        return org.telegram.messenger.bd.Z(2131748074, y(r5), "🖼 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0c16, code lost:
    
        return org.telegram.messenger.bd.Z(2131748092, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0c1c, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0c2d, code lost:
    
        return org.telegram.messenger.bd.Z(2131748116, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0c2e, code lost:
    
        r6 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0c30, code lost:
    
        if (r6 == null) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0c36, code lost:
    
        if (r6.length() <= 0) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0c38, code lost:
    
        r1 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0c3e, code lost:
    
        if (r1.length() <= 20) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0c40, code lost:
    
        r3 = new java.lang.StringBuilder();
        r6 = 0;
        r3.append((java.lang.Object) r1.subSequence(0, 20));
        r3.append("...");
        r1 = r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0c56, code lost:
    
        r3 = new java.lang.Object[2];
        r3[r6] = y(r5);
        r3[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0c66, code lost:
    
        return org.telegram.messenger.bd.Z(2131748074, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0c55, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0c75, code lost:
    
        return org.telegram.messenger.bd.Z(2131748095, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0c85, code lost:
    
        return org.telegram.messenger.bd.Z(2131748110, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0c86, code lost:
    
        r1 = r1.W1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0c8a, code lost:
    
        if (r1 == null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0c9e, code lost:
    
        return org.telegram.messenger.bd.Z(2131748078, y(r5), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0cae, code lost:
    
        return org.telegram.messenger.bd.Z(2131748080, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0caf, code lost:
    
        r1 = r31.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0cb5, code lost:
    
        if (r1 != null) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0cbf, code lost:
    
        return org.telegram.messenger.bd.Z(2131748094, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0cc4, code lost:
    
        if (r1.J3() == false) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0cd1, code lost:
    
        return org.telegram.messenger.bd.Z(2131748097, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0cd9, code lost:
    
        if (r1.I4() == false) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0ce3, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0d03, code lost:
    
        return org.telegram.messenger.bd.Z(2131748073, r3, "📹 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0d12, code lost:
    
        return org.telegram.messenger.bd.Z(2131748067, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0d17, code lost:
    
        if (r1.r3() == false) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0d21, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0d41, code lost:
    
        return org.telegram.messenger.bd.Z(2131748073, r3, "🎬 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0d50, code lost:
    
        return org.telegram.messenger.bd.Z(2131748103, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0d58, code lost:
    
        if (r1.Q4() == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0d65, code lost:
    
        return org.telegram.messenger.bd.Z(2131748064, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0d6a, code lost:
    
        if (r1.i4() == false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d77, code lost:
    
        return org.telegram.messenger.bd.Z(2131748082, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0d7c, code lost:
    
        if (r1.u4() != false) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0d82, code lost:
    
        if (r1.K2() == false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0d88, code lost:
    
        r6 = r1.k;
        r10 = r6.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0d8e, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0d96, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0db6, code lost:
    
        return org.telegram.messenger.bd.Z(2131748073, r3, "📎 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0dc5, code lost:
    
        return org.telegram.messenger.bd.Z(2131748118, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0dc8, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0dcc, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0dd4, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0de4, code lost:
    
        return org.telegram.messenger.bd.Z(2131748107, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0de9, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0deb, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0e05, code lost:
    
        return org.telegram.messenger.bd.Z(2131748121, r3, org.telegram.messenger.g5.n(r10.first_name, r10.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0e08, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0e0a, code lost:
    
        r1 = ((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r10).poll;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0e10, code lost:
    
        if (r1.quiz == false) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0e28, code lost:
    
        return org.telegram.messenger.bd.Z(2131748085, r3, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0e3f, code lost:
    
        return org.telegram.messenger.bd.Z(2131748088, r3, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0e42, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0e5e, code lost:
    
        return org.telegram.messenger.bd.Z(2131748070, r3, ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r10).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0e61, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0e69, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0e89, code lost:
    
        return org.telegram.messenger.bd.Z(2131748073, r3, "🖼 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0e98, code lost:
    
        return org.telegram.messenger.bd.Z(2131748091, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0e9e, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0eab, code lost:
    
        return org.telegram.messenger.bd.Z(2131748112, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0eac, code lost:
    
        r6 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0eae, code lost:
    
        if (r6 == null) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0eb4, code lost:
    
        if (r6.length() <= 0) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0eb6, code lost:
    
        r1 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0ebc, code lost:
    
        if (r1.length() <= 20) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0ebe, code lost:
    
        r5 = new java.lang.StringBuilder();
        r6 = 0;
        r5.append((java.lang.Object) r1.subSequence(0, 20));
        r5.append("...");
        r1 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0ed6, code lost:
    
        r2 = new java.lang.Object[2];
        r2[r6] = r3;
        r2[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0ee1, code lost:
    
        return org.telegram.messenger.bd.Z(2131748073, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0ed4, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0eec, code lost:
    
        return org.telegram.messenger.bd.Z(2131748094, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0ef8, code lost:
    
        return org.telegram.messenger.bd.Z(2131748106, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0ef9, code lost:
    
        r1 = r1.W1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0efd, code lost:
    
        if (r1 == null) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0f0d, code lost:
    
        return org.telegram.messenger.bd.Z(2131748077, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0f19, code lost:
    
        return org.telegram.messenger.bd.Z(2131748076, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0f1c, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) == false) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0f1e, code lost:
    
        r1 = dg.d.f(((org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) r4).theme);
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0f2a, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0f2e, code lost:
    
        if (r28 != r26) goto L679;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0f3a, code lost:
    
        return org.telegram.messenger.bd.Z(2131752201, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0f4b, code lost:
    
        return org.telegram.messenger.bd.Z(2131752202, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0f50, code lost:
    
        if (r28 != r26) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0f5d, code lost:
    
        return org.telegram.messenger.bd.Z(2131752204, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0f6c, code lost:
    
        return org.telegram.messenger.bd.Z(2131752205, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0f6f, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByRequest) == false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0f77, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0f7a, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) == false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0f7c, code lost:
    
        r4 = (org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) r4;
        r1 = org.telegram.messenger.m5.o(r4.boost_peer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0f86, code lost:
    
        if (r1 < 0) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0f88, code lost:
    
        r1 = org.telegram.messenger.l10.k(getMessagesController().a2(java.lang.Long.valueOf(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x0fbe, code lost:
    
        return org.telegram.messenger.bd.J((int) r4.stars, "BoostingReceivedStars", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0f99, code lost:
    
        r1 = getMessagesController().M0(java.lang.Long.valueOf(-r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0fa6, code lost:
    
        if (r1 != null) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0fa9, code lost:
    
        r7 = y(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0fad, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0fc1, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPaymentRefunded) == false) goto L707;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0fc9, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0fcc, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoCompletions) == false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0fd4, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0fd7, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoAppendTasks) == false) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0fdf, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0fe7, code lost:
    
        if (r2.peer_id.channel_id == 0) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0feb, code lost:
    
        if (r5.megagroup != false) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x0ff1, code lost:
    
        if (r31.J4() == false) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x1005, code lost:
    
        return org.telegram.messenger.bd.Z(2131752265, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x1018, code lost:
    
        return org.telegram.messenger.bd.Z(2131752331, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x101f, code lost:
    
        if (r31.J4() == false) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x1034, code lost:
    
        return org.telegram.messenger.bd.Z(2131748049, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x1048, code lost:
    
        return org.telegram.messenger.bd.Z(2131748050, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x1054, code lost:
    
        return org.telegram.messenger.bd.Z(2131748054, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x1059, code lost:
    
        if (r31.G3() == false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x1063, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.k.message) != false) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x1069, code lost:
    
        return O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x106e, code lost:
    
        return org.telegram.messenger.bd.L0(2131748611);
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x106f, code lost:
    
        r4 = 2131753948;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1079, code lost:
    
        if (r31.D != 29) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x1081, code lost:
    
        if ((org.telegram.messenger.zi.n1(r31) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x1083, code lost:
    
        r1 = (org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.zi.n1(r31);
        r2 = r1.extended_media.size();
        r3 = 0;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x1091, code lost:
    
        if (r3 >= r2) goto L922;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x1093, code lost:
    
        r8 = r1.extended_media.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x109d, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) == false) goto L756;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x109f, code lost:
    
        r7 = ((org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) r8).media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x10a5, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x10ad, code lost:
    
        if (org.telegram.messenger.zi.L4(r7.document) == false) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x10af, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x10bf, code lost:
    
        if (r7 == false) goto L763;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x10c3, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x10c6, code lost:
    
        if (r2 != 1) goto L769;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x10c8, code lost:
    
        if (r7 == false) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x10ca, code lost:
    
        r4 = 2131753933;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x10cb, code lost:
    
        r1 = org.telegram.messenger.bd.L0(r4);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x10e2, code lost:
    
        r2 = new java.lang.Object[1];
        r2[r4] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x10ed, code lost:
    
        return org.telegram.messenger.bd.Z(2131753949, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x10d2, code lost:
    
        if (r7 == false) goto L772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x10d4, code lost:
    
        r1 = "Media";
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x10d6, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x10db, code lost:
    
        r1 = org.telegram.messenger.bd.G(r2, r1, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x10d8, code lost:
    
        r1 = "Photos";
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x10b1, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x10b5, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) == false) goto L761;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x10bc, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r8).flags & 4) == 0) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x10f2, code lost:
    
        if (r31.T4() == false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x10fb, code lost:
    
        return org.telegram.messenger.bd.L0(2131753951);
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x1100, code lost:
    
        if (r31.h4() == false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x1109, code lost:
    
        return org.telegram.messenger.bd.L0(2131753950);
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x110a, code lost:
    
        r2 = r31.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x1110, code lost:
    
        if ((r2.media instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x1118, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x112a, code lost:
    
        return "🖼 " + O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x1131, code lost:
    
        if (r31.k.media.ttl_seconds == 0) goto L794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x113a, code lost:
    
        return org.telegram.messenger.bd.L0(2131753977);
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x113f, code lost:
    
        return org.telegram.messenger.bd.L0(2131753948);
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1144, code lost:
    
        if (r31.I4() == false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x114e, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.k.message) != false) goto L802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x1160, code lost:
    
        return "📹 " + O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x1167, code lost:
    
        if (r31.k.media.ttl_seconds == 0) goto L806;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x1170, code lost:
    
        return org.telegram.messenger.bd.L0(2131753976);
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x1175, code lost:
    
        return org.telegram.messenger.bd.L0(2131753933);
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x117e, code lost:
    
        if ((org.telegram.messenger.zi.o1(r31.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L812;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x1187, code lost:
    
        return org.telegram.messenger.bd.L0(2131753972);
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x118c, code lost:
    
        if (r31.Q4() == false) goto L816;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x1195, code lost:
    
        return org.telegram.messenger.bd.L0(2131753982);
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x119a, code lost:
    
        if (r31.i4() == false) goto L820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x11a3, code lost:
    
        return org.telegram.messenger.bd.L0(2131753941);
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x11a8, code lost:
    
        if (r31.J3() == false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x11b1, code lost:
    
        return org.telegram.messenger.bd.L0(2131753952);
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x11b2, code lost:
    
        r2 = r31.k;
        r3 = r2.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x11b8, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L828;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x11c1, code lost:
    
        return org.telegram.messenger.bd.L0(2131753979);
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x11c4, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L836;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x11cc, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r3).poll.quiz == false) goto L834;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x11d5, code lost:
    
        return org.telegram.messenger.bd.L0(2131746453);
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x11dd, code lost:
    
        return org.telegram.messenger.bd.L0(2131747193);
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x11e0, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x11e9, code lost:
    
        return org.telegram.messenger.bd.L0(2131744119);
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x11ec, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaWidget) == false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x11f4, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) == false) goto L846;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x11fd, code lost:
    
        return org.telegram.messenger.bd.L0(2131753926);
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x1202, code lost:
    
        return O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x1205, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L852;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x120e, code lost:
    
        return org.telegram.messenger.bd.L0(2131753492);
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x1211, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveawayResults) == false) goto L856;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x121a, code lost:
    
        return org.telegram.messenger.bd.L0(2131753392);
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x121d, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x1221, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L861;
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x1227, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L865;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x1230, code lost:
    
        return org.telegram.messenger.bd.L0(2131753966);
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x1233, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x1239, code lost:
    
        if (r31.u4() != false) goto L886;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x123f, code lost:
    
        if (r31.K2() == false) goto L872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x1246, code lost:
    
        if (r31.r3() == false) goto L880;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x1250, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.k.message) != false) goto L878;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x1262, code lost:
    
        return "🎬 " + O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x126a, code lost:
    
        return org.telegram.messenger.bd.L0(2131753971);
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x1273, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.k.message) != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x1285, code lost:
    
        return "📎 " + O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x128d, code lost:
    
        return org.telegram.messenger.bd.L0(2131753975);
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x128e, code lost:
    
        r1 = r31.W1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x1295, code lost:
    
        if (r1 == null) goto L890;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x1297, code lost:
    
        r1 = t4.c.h(r1, " ");
        r1.append(org.telegram.messenger.bd.L0(2131753936));
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x12a8, code lost:
    
        return r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x12ad, code lost:
    
        return org.telegram.messenger.bd.L0(2131753936);
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x12b0, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaStory) == false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x12b6, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaStory) r3).via_mention == false) goto L902;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x12b8, code lost:
    
        r1 = r32[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x12bc, code lost:
    
        if (r1 != null) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x12cd, code lost:
    
        return org.telegram.messenger.bd.Z(2131744605, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x12c0, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x12d5, code lost:
    
        return org.telegram.messenger.bd.L0(2131744745);
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x12dc, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.v) != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x12e2, code lost:
    
        return O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x12e7, code lost:
    
        return org.telegram.messenger.bd.L0(2131748611);
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x12ef, code lost:
    
        return org.telegram.messenger.bd.L0(2131753961);
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x021c, code lost:
    
        if (r15.getBoolean("EnablePreviewGroup", r7) != false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:888:0x0224, code lost:
    
        if (r15.getBoolean("EnablePreviewChannel", r7) != false) goto L152;
     */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String w(zi ziVar, String[] strArr, boolean[] zArr) {
        boolean z10;
        long j10;
        String y9;
        long j11;
        TLRPC.Chat chat;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer2;
        if (g0.o2() || az.C) {
            return bd.L0(2131748027);
        }
        TLRPC.Message message = ziVar.k;
        boolean z11 = ziVar.f;
        String str = ziVar.b;
        long j12 = message.dialog_id;
        TLRPC.Peer peer3 = message.peer_id;
        long j13 = peer3.chat_id;
        if (j13 == 0) {
            j13 = peer3.channel_id;
        }
        long j14 = peer3.user_id;
        zArr[0] = true;
        SharedPreferences c2 = getAccountInstance().c();
        boolean w10 = k5.w("content_preview_", j12, c2, true);
        if (ziVar.j3()) {
            if (j13 == 0 && j14 != 0) {
                if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = str;
                }
                if (!w10 || !c2.getBoolean("EnablePreviewAll", true)) {
                    zArr[0] = false;
                    return bd.L0(2131748611);
                }
            } else if (j13 != 0) {
                if (ziVar.k.peer_id.channel_id == 0 || ziVar.B4()) {
                    strArr[0] = ziVar.c;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = str;
                }
                if (!w10 || ((!z11 && !c2.getBoolean("EnablePreviewGroup", true)) || (z11 && !c2.getBoolean("EnablePreviewChannel", true)))) {
                    zArr[0] = false;
                    return (ziVar.k.peer_id.channel_id == 0 || ziVar.B4()) ? bd.Z(2131747998, ziVar.c, str) : bd.Z(2131752366, str);
                }
            }
            return O(ziVar);
        }
        long e10 = getUserConfig().e();
        if (j14 == 0) {
            j14 = ziVar.Z0();
            if (j14 == 0) {
                j14 = -j13;
            }
        } else if (j14 == e10) {
            j14 = ziVar.Z0();
        }
        if (j12 == 0) {
            if (j13 != 0) {
                j12 = -j13;
            } else if (j14 != 0) {
                j12 = j14;
            }
        }
        if (l10.y(j12) && (messageFwdHeader2 = ziVar.k.fwd_from) != null && (peer2 = messageFwdHeader2.from_id) != null) {
            j14 = zi.C1(peer2);
        }
        if (j14 > 0) {
            z10 = w10;
            j10 = e10;
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j14));
            if (a22 != null) {
                y9 = l10.p(a22);
                if (j13 != 0) {
                    strArr[0] = y9;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = y9;
                } else {
                    strArr[0] = null;
                }
            }
            y9 = null;
        } else {
            z10 = w10;
            j10 = e10;
            TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-j14));
            if (M0 != null) {
                y9 = y(M0);
                strArr[0] = y9;
            }
            y9 = null;
        }
        if (y9 != null && j14 > 0 && l10.y(j12) && (messageFwdHeader = ziVar.k.fwd_from) != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long C1 = zi.C1(peer);
            if (m5.z(C1)) {
                j11 = j12;
                TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-C1));
                if (M02 != null) {
                    StringBuilder h = t4.c.h(y9, " @ ");
                    h.append(y(M02));
                    y9 = h.toString();
                    if (strArr[0] != null) {
                        strArr[0] = y9;
                    }
                }
                if (y9 != null) {
                    if (j13 != 0) {
                        chat = getMessagesController().M0(Long.valueOf(j13));
                        if (chat != null) {
                            if (t3.T(chat) && !chat.megagroup && Build.VERSION.SDK_INT <= 27) {
                                strArr[0] = null;
                            }
                        }
                    } else {
                        chat = null;
                    }
                    if (m5.C(j11)) {
                        strArr[0] = null;
                        return bd.L0(2131748027);
                    }
                    boolean z12 = t3.T(chat) && !chat.megagroup;
                    TLRPC.Message message2 = ziVar.k;
                    if (message2 != null && message2.rich_message != null) {
                        return ziVar.v.toString();
                    }
                    if (z10) {
                        boolean z13 = (j13 != 0 || j14 == 0) ? true : true;
                        if (j13 != 0) {
                            if (!z12) {
                            }
                            if (z12) {
                            }
                        }
                    }
                    zArr[0] = false;
                    return bd.L0(2131748611);
                }
                return null;
            }
        }
        j11 = j12;
        if (y9 != null) {
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v37 org.telegram.tgnet.TLRPC$Chat, still in use, count: 2, list:
          (r5v37 org.telegram.tgnet.TLRPC$Chat) from 0x0199: IF  (r5v37 org.telegram.tgnet.TLRPC$Chat) == (null org.telegram.tgnet.TLRPC$Chat)  -> B:975:0x17ec A[HIDDEN]
          (r5v37 org.telegram.tgnet.TLRPC$Chat) from 0x019f: PHI (r5v2 org.telegram.tgnet.TLRPC$Chat) = (r5v1 org.telegram.tgnet.TLRPC$Chat), (r5v37 org.telegram.tgnet.TLRPC$Chat) binds: [B:974:0x019d, B:76:0x0199] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:114)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String x(org.telegram.messenger.zi r31, boolean[] r32) {
        /*
            Method dump skipped, instructions count: 6149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.us.x(org.telegram.messenger.zi, boolean[]):java.lang.String");
    }

    public final String y(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        return chat.monoforum ? rg.c.i(this.currentAccount, chat, false) : chat.title;
    }

    public final int z() {
        int i3 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (h10.i(i10).p() && (az.Q0 || h10.t0 == i10)) {
                us t10 = t(i10);
                if (t10.S) {
                    if (t10.U) {
                        if (t10.T) {
                            try {
                                ArrayList arrayList = new ArrayList(hp.s1(i10).y);
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
                                    if (dialog != null && m5.z(dialog.id)) {
                                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(-dialog.id));
                                        if (!t3.r0(M0)) {
                                            if (t3.Y(M0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i3 += hp.s1(i10).V0(dialog);
                                    }
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                        } else {
                            i3 += t10.J;
                        }
                    } else if (t10.T) {
                        try {
                            int size2 = hp.s1(i10).y.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) hp.s1(i10).y.get(i12);
                                if (m5.z(dialog2.id)) {
                                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(-dialog2.id));
                                    if (!t3.r0(M02)) {
                                        if (t3.Y(M02)) {
                                        }
                                    }
                                }
                                if (hp.s1(i10).V0(dialog2) != 0) {
                                    i3++;
                                }
                            }
                        } catch (Exception e11) {
                            a8.g(e11, false);
                        }
                    } else {
                        i3 += t10.f.m();
                    }
                }
            }
        }
        return i3;
    }
}
