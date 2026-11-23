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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class xs extends c1 implements fs {
    public static String k0;
    public static e0.i0 m0;
    public static NotificationManager n0;
    public static AudioManager p0;
    public static volatile xs[] q0;
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
    public final ls V;
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
    public final xh.f g0;
    public final a0.h h;
    public final ys h0;
    public final char[] i0;
    public final ls j0;
    public final a0.h n;
    public final a0.h r;
    public final HashSet s;
    public final ArrayList w;
    public ArrayList x;
    public final HashSet y;
    public static final q5 l0 = new q5("notificationsQueue");
    public static final long o0 = n5.F(1);

    static {
        m0 = null;
        n0 = null;
        if (Build.VERSION.SDK_INT >= 26 && t0.b != null) {
            m0 = new e0.i0(t0.b);
            n0 = (NotificationManager) t0.b.getSystemService("notification");
            i();
        }
        p0 = (AudioManager) t0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        q0 = new xs[4];
        r0 = new Object[4];
        for (int i7 = 0; i7 < 4; i7++) {
            r0[i7] = new Object();
        }
        s0 = new a0.h();
    }

    public xs(int i7) {
        super(i7);
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
        this.g0 = new xh.f();
        this.i0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.j0 = new ls(this, 11);
        this.e0 = this.currentAccount + 1;
        StringBuilder sb2 = new StringBuilder("messages");
        int i10 = this.currentAccount;
        sb2.append(i10 == 0 ? "" : Integer.valueOf(i10));
        this.f0 = sb2.toString();
        SharedPreferences d = getAccountInstance().d();
        this.N = d.getBoolean("EnableInChatSound", true);
        this.S = d.getBoolean("badgeNumber", true);
        this.T = d.getBoolean("badgeNumberMuted", false);
        this.U = d.getBoolean("badgeNumberMessages", true);
        m0 = new e0.i0(t0.b);
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
        this.V = new ls(this, 12);
        this.h0 = new ys(this.currentAccount);
        g0.g3(new ls(this, 13));
    }

    public static boolean E(fj fjVar) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = fjVar.k;
        TLRPC.Peer peer = message.peer_id;
        return (peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || fjVar.J;
    }

    public static Bitmap F(ArrayList arrayList) {
        int i7;
        Bitmap bitmap;
        Paint paint;
        boolean z10;
        float f10;
        char c10;
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
                i7 = L;
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
                i7 = L;
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
                    options.inSampleSize = hi.x7.d(options, i11, i11);
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
                        c10 = 2;
                    }
                } catch (Throwable unused4) {
                    c10 = 2;
                    i10++;
                    z11 = z10;
                    L = i7;
                    createBitmap = bitmap;
                    f15 = f10;
                    paint3 = paint;
                    arrayList2 = arrayList;
                }
            } else if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                c10 = 2;
                try {
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f11, new int[]{org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.p8[org.telegram.ui.Components.a9.e(user.id)], false), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.q8[org.telegram.ui.Components.a9.e(user.id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
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
                                    L = i7;
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
                    org.telegram.ui.Components.a9.a(user.first_name, user.last_name, null, sb2);
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
                L = i7;
                createBitmap = bitmap;
                f15 = f10;
                paint3 = paint;
                arrayList2 = arrayList;
            }
            c10 = 2;
            z10 = true;
            i10++;
            z11 = z10;
            L = i7;
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

    public static void a(xs xsVar, String str, long j3) {
        boolean z10;
        String N0;
        if (xsVar.getUserConfig().p()) {
            if (bz.Q0 || xsVar.currentAccount == i10.t0) {
                try {
                    String str2 = "wallet_tonconnect_" + xsVar.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        n0.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    boolean z11 = false;
                    if (!g0.p2(false) && !bz.C && xsVar.getAccountInstance().d().getBoolean("EnablePreviewAll", true)) {
                        z10 = false;
                        if (!TextUtils.isEmpty(str) && !z10) {
                            N0 = gd.a0(null, null, 2131747731, str);
                            Intent intent = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                            intent.putExtra("currentAccount", xsVar.currentAccount);
                            intent.addFlags(67108864);
                            PendingIntent activity = PendingIntent.getActivity(t0.b, xsVar.currentAccount, intent, 201326592);
                            e0.q qVar = new e0.q(t0.b, str2);
                            qVar.F.icon = R.drawable.notification;
                            qVar.e = e0.q.d(gd.N0(R.string.AppName, null));
                            qVar.f = e0.q.d(N0);
                            e0.l lVar = new e0.l(z11);
                            lVar.f = e0.q.d(N0);
                            qVar.n(lVar);
                            qVar.u = "event";
                            qVar.x = 0;
                            qVar.F.when = j3;
                            qVar.h(16, true);
                            qVar.g = activity;
                            m0.e("wallet_tonconnect", xsVar.currentAccount, qVar.b());
                        }
                        N0 = gd.N0(2131747732, null);
                        Intent intent2 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent2.putExtra("currentAccount", xsVar.currentAccount);
                        intent2.addFlags(67108864);
                        PendingIntent activity2 = PendingIntent.getActivity(t0.b, xsVar.currentAccount, intent2, 201326592);
                        e0.q qVar2 = new e0.q(t0.b, str2);
                        qVar2.F.icon = R.drawable.notification;
                        qVar2.e = e0.q.d(gd.N0(R.string.AppName, null));
                        qVar2.f = e0.q.d(N0);
                        e0.l lVar2 = new e0.l(z11);
                        lVar2.f = e0.q.d(N0);
                        qVar2.n(lVar2);
                        qVar2.u = "event";
                        qVar2.x = 0;
                        qVar2.F.when = j3;
                        qVar2.h(16, true);
                        qVar2.g = activity2;
                        m0.e("wallet_tonconnect", xsVar.currentAccount, qVar2.b());
                    }
                    z10 = true;
                    if (!TextUtils.isEmpty(str)) {
                        N0 = gd.a0(null, null, 2131747731, str);
                        Intent intent22 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                        intent22.setAction("android.intent.action.VIEW");
                        intent22.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent22.putExtra("currentAccount", xsVar.currentAccount);
                        intent22.addFlags(67108864);
                        PendingIntent activity22 = PendingIntent.getActivity(t0.b, xsVar.currentAccount, intent22, 201326592);
                        e0.q qVar22 = new e0.q(t0.b, str2);
                        qVar22.F.icon = R.drawable.notification;
                        qVar22.e = e0.q.d(gd.N0(R.string.AppName, null));
                        qVar22.f = e0.q.d(N0);
                        e0.l lVar22 = new e0.l(z11);
                        lVar22.f = e0.q.d(N0);
                        qVar22.n(lVar22);
                        qVar22.u = "event";
                        qVar22.x = 0;
                        qVar22.F.when = j3;
                        qVar22.h(16, true);
                        qVar22.g = activity22;
                        m0.e("wallet_tonconnect", xsVar.currentAccount, qVar22.b());
                    }
                    N0 = gd.N0(2131747732, null);
                    Intent intent222 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                    intent222.setAction("android.intent.action.VIEW");
                    intent222.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent222.putExtra("currentAccount", xsVar.currentAccount);
                    intent222.addFlags(67108864);
                    PendingIntent activity222 = PendingIntent.getActivity(t0.b, xsVar.currentAccount, intent222, 201326592);
                    e0.q qVar222 = new e0.q(t0.b, str2);
                    qVar222.F.icon = R.drawable.notification;
                    qVar222.e = e0.q.d(gd.N0(R.string.AppName, null));
                    qVar222.f = e0.q.d(N0);
                    e0.l lVar222 = new e0.l(z11);
                    lVar222.f = e0.q.d(N0);
                    qVar222.n(lVar222);
                    qVar222.u = "event";
                    qVar222.x = 0;
                    qVar222.F.when = j3;
                    qVar222.h(16, true);
                    qVar222.g = activity222;
                    m0.e("wallet_tonconnect", xsVar.currentAccount, qVar222.b());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
            }
        }
    }

    public static void b(xs xsVar) {
        try {
            SharedPreferences d = xsVar.getAccountInstance().d();
            Map<String, ?> all = d.getAll();
            SharedPreferences.Editor edit = d.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        n0.deleteNotificationChannel(str);
                        if (s2.a) {
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

    public static void c(xs xsVar) {
        PowerManager.WakeLock wakeLock = xsVar.W;
        m0.b(xsVar.currentAccount, "wallet_tonconnect");
        xsVar.G = 0L;
        xsVar.H = 0L;
        xsVar.J = 0;
        xsVar.K = 0;
        xsVar.a.clear();
        xsVar.c.b();
        xsVar.d.b();
        xsVar.f.b();
        xsVar.h.b();
        xsVar.n.b();
        xsVar.y.clear();
        xsVar.b.clear();
        xsVar.L = false;
        xsVar.O = 0;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
        xsVar.p();
        xsVar.S(xsVar.z());
        SharedPreferences.Editor edit = xsVar.getAccountInstance().d().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                n0.deleteNotificationChannelGroup("channels" + xsVar.currentAccount);
                n0.deleteNotificationChannelGroup("groups" + xsVar.currentAccount);
                n0.deleteNotificationChannelGroup("private" + xsVar.currentAccount);
                n0.deleteNotificationChannelGroup("stories" + xsVar.currentAccount);
                n0.deleteNotificationChannelGroup("other" + xsVar.currentAccount);
                String str = xsVar.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = n0.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i7 = 0; i7 < size; i7++) {
                    String id2 = notificationChannels.get(i7).getId();
                    if (id2.startsWith(str)) {
                        try {
                            n0.deleteNotificationChannel(id2);
                        } catch (Exception e11) {
                            a8.g(e11, true);
                        }
                        if (s2.a) {
                            a8.b("delete channel cleanup " + id2);
                        }
                    }
                }
            } catch (Throwable th2) {
                a8.g(th2, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02bb, code lost:
    
        if (org.telegram.messenger.xs.p0.getRingerMode() == 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if ((r12 instanceof org.telegram.tgnet.TLRPC.TL_messageActionUserJoined) == false) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02ec  */
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
    public static void e(xs xsVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        int i7;
        Integer num;
        long j3;
        int i10;
        boolean z13;
        long j10;
        boolean z14;
        long j11;
        long j12;
        String str;
        long j13;
        String str2;
        SharedPreferences sharedPreferences;
        String str3;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        boolean z15;
        long j19;
        fj fjVar;
        xs xsVar2;
        SparseArray sparseArray;
        fj fjVar2;
        xs xsVar3 = xsVar;
        a0.h hVar = new a0.h();
        SharedPreferences d = xsVar3.getAccountInstance().d();
        boolean z16 = true;
        boolean z17 = d.getBoolean("PinnedMessages", true);
        int i11 = 0;
        boolean z18 = false;
        int i12 = 0;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        while (i11 < arrayList.size()) {
            fj fjVar3 = (fj) arrayList.get(i11);
            if (fjVar3.k != null) {
                if (!fjVar3.y3()) {
                    TLRPC.Message message = fjVar3.k;
                    TLRPC.MessageAction messageAction = message.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL)) {
                        if (message.silent) {
                            if (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp)) {
                            }
                        }
                    }
                }
                if (s2.a) {
                    a8.b("skipped message because 1");
                }
                i10 = i11;
                z14 = z18;
                xsVar2 = xsVar3;
                z18 = z14;
                i11 = i10 + 1;
                xsVar3 = xsVar2;
                z16 = true;
            }
            if (!fj.E4(fjVar3)) {
                if (fjVar3.K) {
                    long currentTimeMillis = fjVar3.k == null ? System.currentTimeMillis() : r5.date * 1000;
                    long B0 = fj.B0(fjVar3.k);
                    int e12 = fjVar3.e1();
                    ws wsVar = (ws) xsVar3.F.f(B0);
                    if (wsVar != null) {
                        wsVar.c.put(Integer.valueOf(e12), new Pair(Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis + 86400000)));
                        boolean z22 = wsVar.d;
                        boolean z23 = fjVar3.M;
                        if (z22 != z23) {
                            wsVar.d = z23;
                            z21 = z16;
                        }
                        wsVar.e = wsVar.a();
                        tr messagesStorage = xsVar3.getMessagesStorage();
                        messagesStorage.a.c(new rq(9, messagesStorage, wsVar));
                        z19 = z16;
                    } else {
                        ws wsVar2 = new ws(fjVar3.b, B0, e12, currentTimeMillis, currentTimeMillis + 86400000);
                        wsVar2.d = fjVar3.M;
                        xsVar3.E.add(wsVar2);
                        xsVar3.F.k(wsVar2, B0);
                        tr messagesStorage2 = xsVar3.getMessagesStorage();
                        messagesStorage2.a.c(new rq(9, messagesStorage2, wsVar2));
                        z18 = z16;
                        z21 = z18;
                    }
                    Collections.sort(xsVar3.E, Comparator$-CC.comparingLong(new ok(1)));
                    xsVar2 = xsVar3;
                    i10 = i11;
                    i11 = i10 + 1;
                    xsVar3 = xsVar2;
                    z16 = true;
                } else {
                    if (fjVar3.O) {
                        TLRPC.Message message2 = fjVar3.k;
                        if (message2 != null) {
                            int i13 = message2.id;
                            long j20 = message2.date + 60;
                            long currentTime = ConnectionsManager.getInstance(xsVar3.currentAccount).getCurrentTime();
                            if (currentTime <= j20) {
                                g0.h3(new rs(xsVar3, i13, 6), (j20 - currentTime) * 1000);
                            }
                        }
                        i10 = i11;
                        z14 = z18;
                        xsVar2 = xsVar3;
                        z18 = z14;
                        i11 = i10 + 1;
                        xsVar3 = xsVar2;
                        z16 = true;
                    }
                    int e13 = fjVar3.e1();
                    long j21 = fjVar3.i3() ? fjVar3.k.random_id : 0L;
                    long B02 = fj.B0(fjVar3.k);
                    if (fjVar3.i3()) {
                        j3 = 0;
                        z13 = fjVar3.f;
                        i10 = i11;
                    } else {
                        j3 = 0;
                        if (n5.z(B02)) {
                            i10 = i11;
                            TLRPC.Chat O0 = xsVar3.getMessagesController().O0(Long.valueOf(-B02));
                            z13 = v3.T(O0) && !O0.megagroup;
                        } else {
                            i10 = i11;
                            z13 = false;
                        }
                    }
                    if (fjVar3.J) {
                        j10 = fj.B0(fjVar3.k);
                    } else {
                        long j22 = fjVar3.k.peer_id.channel_id;
                        j10 = j22 != j3 ? -j22 : j3;
                    }
                    SparseArray sparseArray2 = (SparseArray) xsVar3.c.f(j10);
                    fj fjVar4 = sparseArray2 != null ? (fj) sparseArray2.get(e13) : null;
                    z14 = z18;
                    if (fjVar4 == null) {
                        j11 = B02;
                        long j23 = fjVar3.k.random_id;
                        if (j23 != j3 && (fjVar4 = (fj) xsVar3.d.f(j23)) != null) {
                            xsVar3.d.l(fjVar3.k.random_id);
                        }
                    } else {
                        j11 = B02;
                    }
                    fj fjVar5 = fjVar4;
                    if (fjVar5 != null) {
                        if (fjVar5.i3()) {
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                xsVar3.c.k(sparseArray2, j10);
                            }
                            sparseArray2.put(e13, fjVar3);
                            int indexOf = xsVar3.a.indexOf(fjVar5);
                            if (indexOf >= 0) {
                                xsVar3.a.set(indexOf, fjVar3);
                                boolean z24 = z13;
                                fjVar2 = fjVar3;
                                i12 = g(arrayList2, fjVar2, j11, z24, d);
                            } else {
                                fjVar2 = fjVar3;
                            }
                            if (z10) {
                                boolean z25 = fjVar2.i;
                                if (z25) {
                                    tr messagesStorage3 = xsVar3.getMessagesStorage();
                                    messagesStorage3.a.c(new w3(10, messagesStorage3, fjVar2));
                                }
                                z19 = z25;
                            }
                        }
                        if (s2.a) {
                            a8.b("skipped message because old message with same dialog and message ids exist: did=" + j10 + ", mid=" + e13);
                        }
                    } else {
                        boolean z26 = z13;
                        if (!z19) {
                            if (!z10 || fjVar3.O) {
                                j12 = j10;
                            } else {
                                tr messagesStorage4 = xsVar3.getMessagesStorage();
                                j12 = j10;
                                messagesStorage4.a.c(new w3(10, messagesStorage4, fjVar3));
                            }
                            long b22 = fj.b2(xsVar3.currentAccount, fjVar3.k, xsVar3.getMessagesController().z2(fjVar3), false);
                            if (j11 != xsVar3.G || !t0.w || fjVar3.J || fjVar3.O) {
                                TLRPC.Message message3 = fjVar3.k;
                                if (!message3.mentioned) {
                                    str = ")";
                                    j13 = j11;
                                } else if (z17 || !(message3.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                    str = ")";
                                    j13 = fjVar3.Z0();
                                } else if (s2.a) {
                                    a8.b("skipped message because message is mention of pinned");
                                }
                                if (E(fjVar3)) {
                                    str2 = str;
                                    xsVar3.K++;
                                } else {
                                    str2 = str;
                                }
                                int h = hVar.h(j13);
                                if (h < 0 || b22 != j3) {
                                    int u10 = xsVar3.u(j13, b22);
                                    if (u10 == -1) {
                                        long j24 = j13;
                                        String str4 = str2;
                                        sharedPreferences = d;
                                        str3 = str4;
                                        j14 = b22;
                                        j16 = j21;
                                        j17 = j11;
                                        j18 = j12;
                                        j15 = j24;
                                        boolean D = xsVar.D(j15, Boolean.valueOf(z26), fjVar3.I, fjVar3.J);
                                        if (s2.a) {
                                            a8.b("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + j15 + ", " + z26 + ", " + fjVar3.I + ", " + fjVar3.J + ") = " + D);
                                        }
                                        z15 = D;
                                    } else {
                                        String str5 = str2;
                                        sharedPreferences = d;
                                        str3 = str5;
                                        j14 = b22;
                                        j15 = j13;
                                        j16 = j21;
                                        j17 = j11;
                                        j18 = j12;
                                        z15 = u10 != 2;
                                    }
                                    hVar.k(Boolean.valueOf(z15), j15);
                                } else {
                                    z15 = ((Boolean) hVar.n(h)).booleanValue();
                                    String str6 = str2;
                                    sharedPreferences = d;
                                    str3 = str6;
                                    j14 = b22;
                                    j15 = j13;
                                    j16 = j21;
                                    j17 = j11;
                                    j18 = j12;
                                }
                                if (s2.a) {
                                    a8.b("NotificationsController: process new messages, value is " + z15 + " (" + j15 + ", " + z26 + ", " + fjVar3.I + ", " + fjVar3.J + str3);
                                }
                                if (z15) {
                                    if (z10) {
                                        j19 = j15;
                                        fjVar = fjVar3;
                                        d = sharedPreferences;
                                        xsVar2 = xsVar;
                                    } else {
                                        long j25 = j15;
                                        fjVar = fjVar3;
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        xsVar2 = xsVar;
                                        i12 = g(arrayList2, fjVar, j25, z26, sharedPreferences2);
                                        j19 = j25;
                                        d = sharedPreferences2;
                                    }
                                    if (!z20) {
                                        z20 = fjVar.k.from_scheduled;
                                    }
                                    xsVar2.b.add(fjVar);
                                    xsVar2.h(fjVar);
                                    if (e13 != 0) {
                                        if (sparseArray2 == null) {
                                            sparseArray = new SparseArray();
                                            xsVar2.c.k(sparseArray, j18);
                                        } else {
                                            sparseArray = sparseArray2;
                                        }
                                        sparseArray.put(e13, fjVar);
                                    } else if (j16 != j3) {
                                        xsVar2.d.k(fjVar, j16);
                                    }
                                    long j26 = j17;
                                    if (j26 != j19) {
                                        Integer num2 = (Integer) xsVar2.r.f(j26);
                                        xsVar2.r.k(Integer.valueOf(num2 == null ? 1 : num2.intValue() + 1), j26);
                                    }
                                } else {
                                    j19 = j15;
                                    fjVar = fjVar3;
                                    d = sharedPreferences;
                                    xsVar2 = xsVar;
                                }
                                if (fjVar.I) {
                                    SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                    sparseBooleanArray.put(e13, true);
                                    xsVar2.getMessagesController().P(j19, j14, sparseBooleanArray, true);
                                }
                                z18 = true;
                                i11 = i10 + 1;
                                xsVar3 = xsVar2;
                                z16 = true;
                            } else {
                                if (!z10 && xsVar3.N && !MediaController.B().J()) {
                                    try {
                                    } catch (Exception e10) {
                                        a8.g(e10, true);
                                    }
                                }
                                if (s2.a) {
                                    a8.b("skipped message because chat is already opened (openedDialogId = " + xsVar3.G + ")");
                                }
                            }
                        } else if (s2.a) {
                            a8.b("skipped message because edited");
                        }
                    }
                    xsVar2 = xsVar3;
                    z18 = z14;
                    i11 = i10 + 1;
                    xsVar3 = xsVar2;
                    z16 = true;
                }
            }
            if (s2.a) {
            }
            i10 = i11;
            z14 = z18;
            xsVar2 = xsVar3;
            z18 = z14;
            i11 = i10 + 1;
            xsVar3 = xsVar2;
            z16 = true;
        }
        xs xsVar4 = xsVar3;
        boolean z27 = z18;
        if (z27) {
            xsVar4.L = z11;
        }
        if (!arrayList2.isEmpty() && !g0.p2(false) && !bz.C) {
            g0.g3(new l7(xsVar4, arrayList2, i12, 20));
        }
        if (z10 || z20) {
            if (z19) {
                if (s2.a) {
                    a8.b("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + xsVar4.L);
                }
                xsVar4.b.clear();
                xsVar4.Z(xsVar4.L);
            } else if (z27) {
                if (s2.a) {
                    a8.b("NotificationsController processNewMessages: added branch");
                }
                fj fjVar6 = (fj) arrayList.get(0);
                long B03 = fj.B0(fjVar6.k);
                long b23 = fj.b2(xsVar4.currentAccount, fjVar6.k, xsVar4.getMessagesController().y2(B03), false);
                Boolean valueOf = fjVar6.i3() ? Boolean.valueOf(fjVar6.f) : null;
                int i14 = xsVar4.J;
                int u11 = xsVar4.u(B03, b23);
                boolean D2 = u11 == -1 ? xsVar4.D(B03, valueOf, fjVar6.I, fjVar6.J) : u11 != 2;
                Integer num3 = (Integer) xsVar4.f.f(B03);
                if (num3 != null) {
                    z12 = true;
                    i7 = num3.intValue() + 1;
                } else {
                    z12 = true;
                    i7 = 1;
                }
                if (xsVar4.L && !D2 && (num = (Integer) xsVar4.r.f(B03)) != null && num.intValue() != 0) {
                    i7 = num.intValue();
                    D2 = z12;
                }
                if (D2 && !fjVar6.K) {
                    if (!xsVar4.getMessagesController().s2(B03)) {
                        if (xsVar4.getMessagesController().y2(B03)) {
                            int i15 = xsVar4.J - ((num3 == null || num3.intValue() <= 0) ? 0 : z12);
                            xsVar4.J = i15;
                            xsVar4.J = i15 + (i7 > 0 ? z12 : 0);
                        } else {
                            if (num3 != null) {
                                xsVar4.J -= num3.intValue();
                            }
                            xsVar4.J += i7;
                        }
                    }
                    xsVar4.f.k(Integer.valueOf(i7), B03);
                }
                if (i14 != xsVar4.J || z21) {
                    xsVar4.b.clear();
                    if (s2.a) {
                        a8.b("NotificationsController processNewMessages: added branch: " + xsVar4.L);
                    }
                    xsVar4.Z(xsVar4.L);
                    g0.g3(new rs(xsVar4, xsVar4.f.m(), 0));
                }
                xsVar4.L = false;
                if (xsVar4.S) {
                    xsVar4.S(xsVar4.z());
                }
            }
        }
        if (z21) {
            xsVar4.d0();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
            return;
        }
        return;
        try {
            xsVar3.getAccountInstance().d();
            if (xsVar3.u(xsVar3.G, xsVar3.H) != 2) {
                l0.c(new ls(xsVar3, 8));
            }
        } catch (Exception e11) {
            a8.g(e11, true);
        }
        if (s2.a) {
        }
        xsVar2 = xsVar3;
        z18 = z14;
        i11 = i10 + 1;
        xsVar3 = xsVar2;
        z16 = true;
    }

    public static void f(xs xsVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
        long j3;
        boolean z10;
        long j10;
        boolean D;
        TLRPC.MessageFwdHeader messageFwdHeader;
        long j11;
        TLRPC.Message message;
        long j12;
        TLRPC.Message message2;
        SparseArray sparseArray;
        fj fjVar;
        long j13;
        boolean z11;
        SparseArray sparseArray2;
        xsVar.f.b();
        xsVar.a.clear();
        xsVar.c.b();
        xsVar.E.clear();
        xsVar.F.b();
        xsVar.J = 0;
        xsVar.K = 0;
        xsVar.getAccountInstance().d();
        a0.h hVar2 = new a0.h();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i7);
            if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                TLRPC.MessageAction messageAction = message3.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                    long j14 = message3.peer_id.channel_id;
                    long j15 = j14 != 0 ? -j14 : 0L;
                    SparseArray sparseArray3 = (SparseArray) xsVar.c.f(j15);
                    if (sparseArray3 == null || sparseArray3.indexOfKey(message3.id) < 0) {
                        fj fjVar2 = new fj(xsVar.currentAccount, message3, false, false);
                        if (E(fjVar2)) {
                            xsVar.K++;
                        }
                        long B0 = fj.B0(fjVar2.k);
                        long b22 = fj.b2(xsVar.currentAccount, fjVar2.k, xsVar.getMessagesController().z2(fjVar2), false);
                        if (fjVar2.k.mentioned) {
                            message = message3;
                            j12 = fjVar2.Z0();
                            j11 = j15;
                        } else {
                            j11 = j15;
                            message = message3;
                            j12 = B0;
                        }
                        int h = hVar2.h(j12);
                        if (h < 0 || b22 != 0) {
                            int u10 = xsVar.u(j12, b22);
                            if (u10 == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j13 = j11;
                                z11 = xsVar.D(j12, null, fjVar2.I, fjVar2.J);
                                fjVar = fjVar2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                fjVar = fjVar2;
                                j13 = j11;
                                z11 = u10 != 2;
                            }
                            hVar2.k(Boolean.valueOf(z11), j12);
                        } else {
                            z11 = ((Boolean) hVar2.n(h)).booleanValue();
                            message2 = message;
                            sparseArray = sparseArray3;
                            fjVar = fjVar2;
                            j13 = j11;
                        }
                        if (z11 && (j12 != xsVar.G || !t0.w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                xsVar.c.k(sparseArray2, j13);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.id, fjVar);
                            xsVar.h(fjVar);
                            if (B0 != j12) {
                                Integer num = (Integer) xsVar.r.f(B0);
                                xsVar.r.k(Integer.valueOf(num == null ? 1 : num.intValue() + 1), B0);
                            }
                        }
                    }
                }
            }
        }
        long j16 = 0;
        int i10 = 0;
        while (i10 < hVar.m()) {
            long j17 = hVar.j(i10);
            int h7 = hVar2.h(j17);
            if (h7 >= 0) {
                D = ((Boolean) hVar2.n(h7)).booleanValue();
            } else {
                int u11 = xsVar.u(j17, j16);
                D = u11 == -1 ? xsVar.D(j17, null, false, false) : u11 != 2;
                hVar2.k(Boolean.valueOf(D), j17);
            }
            if (D) {
                Integer num2 = (Integer) hVar.n(i10);
                int intValue = num2.intValue();
                xsVar.f.k(num2, j17);
                if (!xsVar.getMessagesController().s2(j17)) {
                    if (xsVar.getMessagesController().y2(j17)) {
                        xsVar.J += intValue > 0 ? 1 : 0;
                    } else {
                        xsVar.J += intValue;
                    }
                }
            }
            i10++;
            j16 = 0;
        }
        for (int i11 = 0; i11 < arrayList2.size(); i11++) {
            fj fjVar3 = (fj) arrayList2.get(i11);
            int e12 = fjVar3.e1();
            if (xsVar.c.h(e12) < 0) {
                if (E(fjVar3)) {
                    xsVar.K++;
                }
                long B02 = fj.B0(fjVar3.k);
                long b23 = fj.b2(xsVar.currentAccount, fjVar3.k, xsVar.getMessagesController().z2(fjVar3), false);
                TLRPC.Message message4 = fjVar3.k;
                long j18 = message4.random_id;
                long Z0 = message4.mentioned ? fjVar3.Z0() : B02;
                int h10 = hVar2.h(Z0);
                if (h10 < 0 || b23 != 0) {
                    int u12 = xsVar.u(Z0, b23);
                    if (u12 == -1) {
                        j3 = Z0;
                        z10 = xsVar.D(j3, null, fjVar3.I, fjVar3.J);
                    } else {
                        j3 = Z0;
                        z10 = u12 != 2;
                    }
                    hVar2.k(Boolean.valueOf(z10), j3);
                } else {
                    long j19 = Z0;
                    z10 = ((Boolean) hVar2.n(h10)).booleanValue();
                    j3 = j19;
                }
                if (z10 && (j3 != xsVar.G || !t0.w)) {
                    if (e12 != 0) {
                        if (fjVar3.J) {
                            j10 = fj.B0(fjVar3.k);
                        } else {
                            long j20 = fjVar3.k.peer_id.channel_id;
                            j10 = j20 != 0 ? -j20 : 0L;
                        }
                        SparseArray sparseArray4 = (SparseArray) xsVar.c.f(j10);
                        if (sparseArray4 == null) {
                            sparseArray4 = new SparseArray();
                            xsVar.c.k(sparseArray4, j10);
                        }
                        sparseArray4.put(e12, fjVar3);
                    } else if (j18 != 0) {
                        xsVar.d.k(fjVar3, j18);
                    }
                    xsVar.h(fjVar3);
                    if (B02 != j3) {
                        Integer num3 = (Integer) xsVar.r.f(B02);
                        xsVar.r.k(Integer.valueOf(num3 == null ? 1 : num3.intValue() + 1), B02);
                    }
                    Integer num4 = (Integer) xsVar.f.f(j3);
                    int intValue2 = num4 != null ? num4.intValue() + 1 : 1;
                    if (!xsVar.getMessagesController().s2(j3)) {
                        if (xsVar.getMessagesController().y2(j3)) {
                            if (num4 != null) {
                                xsVar.J -= num4.intValue() > 0 ? 1 : 0;
                            }
                            xsVar.J += intValue2 > 0 ? 1 : 0;
                        } else {
                            if (num4 != null) {
                                xsVar.J -= num4.intValue();
                            }
                            xsVar.J += intValue2;
                        }
                    }
                    xsVar.f.k(Integer.valueOf(intValue2), j3);
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ws wsVar = (ws) it.next();
                long j21 = wsVar.a;
                ws wsVar2 = (ws) xsVar.F.f(j21);
                if (wsVar2 != null) {
                    wsVar2.c.putAll(wsVar.c);
                } else {
                    xsVar.E.add(wsVar);
                    xsVar.F.k(wsVar, j21);
                }
            }
            Collections.sort(xsVar.E, Comparator$-CC.comparingLong(new ok(2)));
        }
        g0.g3(new rs(xsVar, xsVar.f.m(), 4));
        xsVar.Z(SystemClock.elapsedRealtime() / 1000 < 60);
        if (xsVar.S) {
            xsVar.S(xsVar.z());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0 == 2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(ArrayList arrayList, fj fjVar, long j3, boolean z10, SharedPreferences sharedPreferences) {
        int i7;
        if (fjVar.J) {
            return 0;
        }
        if (!n5.C(j3)) {
            if (f3.w("custom_", j3, sharedPreferences, false)) {
                i7 = sharedPreferences.getInt("popup_" + j3, 0);
            } else {
                i7 = 0;
            }
            if (i7 == 0) {
                if (z10) {
                    i7 = sharedPreferences.getInt("popupChannel", 0);
                } else {
                    i7 = sharedPreferences.getInt(n5.z(j3) ? "popupGroup" : "popupAll", 0);
                }
            } else if (i7 == 1) {
                i7 = 3;
            }
            if (i7 != 0 && fjVar.k.peer_id.channel_id != 0 && !fjVar.A4()) {
                i7 = 0;
            }
            if (i7 != 0) {
                arrayList.add(0, fjVar);
            }
            return i7;
        }
        i7 = 0;
        if (i7 != 0) {
            i7 = 0;
        }
        if (i7 != 0) {
        }
        return i7;
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
        String N0 = gd.N0(2131748996, null);
        if (notificationChannel != null && !TextUtils.equals(notificationChannel.getName(), N0)) {
            notificationChannel.setName(N0);
            try {
                n0.createNotificationChannel(notificationChannel);
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        if (notificationChannel == null) {
            NotificationChannel notificationChannel2 = new NotificationChannel(k0, N0, 3);
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

    public static String q(int i7) {
        return i7 == 0 ? "EnableGroup2" : i7 == 1 ? "EnableAll2" : "EnableChannel2";
    }

    public static String r(fj fjVar, String str) {
        TLRPC.Message message = fjVar.k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean B = n10.B(fj.B0(message));
        if (B && !TextUtils.isEmpty(tL_messageActionGramTransfer.onramp_provider_name)) {
            return gd.a0(null, null, 2131747843, org.telegram.ui.Wallet.v0.x(tL_messageActionGramTransfer.amount, false), org.telegram.ui.Wallet.g.d(tL_messageActionGramTransfer.onramp_provider_name, Locale.getDefault()));
        }
        boolean z10 = (tL_messageActionGramTransfer.comment_encrypted || TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) ? false : true;
        return gd.a0(null, null, B ? z10 ? 2131747841 : 2131747842 : z10 ? 2131747844 : 2131747845, str, org.telegram.ui.Wallet.v0.x(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
    }

    public static TLRPC.NotificationSound s(SharedPreferences sharedPreferences, String str, String str2, String str3) {
        long j3 = sharedPreferences.getLong(str2, 0L);
        String string = sharedPreferences.getString(str3, "NoSound");
        if (j3 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j3;
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

    public static xs t(int i7) {
        xs xsVar;
        xs xsVar2 = q0[i7];
        if (xsVar2 != null) {
            return xsVar2;
        }
        synchronized (r0[i7]) {
            try {
                xsVar = q0[i7];
                if (xsVar == null) {
                    xs[] xsVarArr = q0;
                    xs xsVar3 = new xs(i7);
                    xsVarArr[i7] = xsVar3;
                    xsVar = xsVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xsVar;
    }

    public static String v(long j3, long j10, boolean z10) {
        String valueOf;
        if (z10) {
            if (j10 == 0) {
                return String.valueOf(j3);
            }
            Locale locale = Locale.US;
            return j3 + "_" + j10;
        }
        long j11 = (j10 << 12) + j3;
        a0.h hVar = s0;
        int h = hVar.h(j11);
        if (h >= 0) {
            return (String) hVar.n(h);
        }
        if (j10 != 0) {
            Locale locale2 = Locale.US;
            valueOf = j3 + "_" + j10;
        } else {
            valueOf = String.valueOf(j3);
        }
        hVar.k(valueOf, j11);
        return valueOf;
    }

    public final boolean A() {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i7 >= arrayList.size()) {
                return false;
            }
            fj fjVar = (fj) arrayList.get(i7);
            long B0 = fj.B0(fjVar.k);
            if (!fjVar.I) {
                TLRPC.Message message = fjVar.k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !n5.C(B0) && ((fjVar.k.peer_id.channel_id == 0 || fjVar.A4()) && B0 != 489000 && B0 != 489001)) {
                    return true;
                }
            }
            i7++;
        }
    }

    public final boolean B(int i7) {
        return i7 == 4 ? getAccountInstance().d().getBoolean("EnableReactionsMessages", true) : i7 == 5 ? getAccountInstance().d().getBoolean("EnableReactionsStories", true) : i7 == 3 ? getAccountInstance().d().getBoolean("EnableAllStories", true) : getAccountInstance().d().getInt(q(i7), 0) < getConnectionsManager().getCurrentTime();
    }

    public final boolean C(long j3) {
        return D(j3, null, false, false);
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
    public final boolean D(long j3, Boolean bool, boolean z10, boolean z11) {
        int i7;
        if (z10) {
            i7 = 4;
        } else if (z11) {
            i7 = 5;
        } else if (!n5.z(j3)) {
            i7 = 1;
        } else if (bool == null) {
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j3));
            if (v3.T(O0)) {
            }
            i7 = 0;
        }
        return B(i7);
    }

    public final void G(long j3, long j10, boolean z10) {
        if (z10) {
            t(this.currentAccount).H(j3, ConnectionsManager.DEFAULT_DATACENTER_ID, j10);
            return;
        }
        boolean D = t(this.currentAccount).D(j3, null, false, false);
        boolean z11 = j10 != 0;
        SharedPreferences.Editor edit = mp.u1(this.currentAccount).g7.edit();
        if (!D || z11) {
            edit.putInt("notify2_" + v(j3, j10, false), 0);
        } else {
            edit.remove("notify2_" + v(j3, j10, false));
        }
        if (j10 == 0) {
            getMessagesStorage().E1(j3, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().R.f(j3);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        c0(j3, j10, true);
    }

    public final void H(long j3, int i7, long j10) {
        long j11 = 0;
        if (j3 != 0) {
            SharedPreferences.Editor edit = mp.u1(this.currentAccount).g7.edit();
            boolean z10 = j10 != 0;
            boolean D = t(this.currentAccount).D(j3, null, false, false);
            String v = v(j3, j10, false);
            if (i7 != Integer.MAX_VALUE) {
                edit.putInt("notify2_" + v, 3);
                edit.putInt("notifyuntil_" + v, getConnectionsManager().getCurrentTime() + i7);
                j11 = (((long) i7) << 32) | 1;
            } else if (D || z10) {
                edit.putInt("notify2_" + v, 2);
                j11 = 1L;
            } else {
                edit.remove("notify2_" + v);
            }
            edit.apply();
            if (j10 == 0) {
                t(this.currentAccount).N(j3);
                tr.a0(this.currentAccount).E1(j3, j11);
                TLRPC.Dialog dialog = (TLRPC.Dialog) mp.u1(this.currentAccount).R.f(j3);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i7 != Integer.MAX_VALUE || D) {
                        tL_peerNotifySettings.mute_until = i7;
                    }
                }
            }
            t(this.currentAccount).c0(j3, j10, true);
        }
    }

    public final Pair I(ArrayList arrayList, ArrayList arrayList2) {
        int i7;
        String str;
        TLRPC.FileLocation fileLocation;
        ArrayList arrayList3 = this.E;
        int min = Math.min(3, arrayList3.size());
        boolean z10 = false;
        int i10 = 0;
        for (0; i7 < min; i7 + 1) {
            ws wsVar = (ws) arrayList3.get(i7);
            HashMap hashMap = wsVar.c;
            long j3 = wsVar.a;
            i10 += hashMap.size();
            z10 |= wsVar.d;
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j3));
            if (c22 == null && (c22 = getMessagesStorage().k0(j3)) != null) {
                getMessagesController().e4(c22, true, false);
            }
            File file = null;
            if (c22 != null) {
                str = n10.q(c22);
                TLRPC.UserProfilePhoto userProfilePhoto = c22.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    w7 fileLoader = getFileLoader();
                    TLRPC.FileLocation fileLocation2 = c22.photo.photo_small;
                    fileLoader.getClass();
                    File J = w7.J(fileLocation2, null, true, true);
                    if (!J.exists()) {
                        if (c22.photo.photo_big != null) {
                            w7 fileLoader2 = getFileLoader();
                            TLRPC.FileLocation fileLocation3 = c22.photo.photo_big;
                            fileLoader2.getClass();
                            J = w7.J(fileLocation3, null, true, true);
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
                str = wsVar.b;
                i7 = str == null ? i7 + 1 : 0;
            }
            if (str.length() > 50) {
                str = str.substring(0, 25) + "…";
            }
            arrayList.add(str);
            if (file == null && c22 != null) {
                arrayList2.add(c22);
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
        l0.c(new qs(this, longSparseIntArray, new ArrayList(), 0));
    }

    public final void K(ArrayList arrayList, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        boolean z13;
        if (s2.a) {
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
            int i7 = 0;
            while (i7 < arrayList.size()) {
                fj fjVar = (fj) arrayList.get(i7);
                if (fjVar != null && fjVar.k != null && !fjVar.P3()) {
                    TLRPC.MessageAction messageAction = fjVar.k.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed || getConnectionsManager().getCurrentTime() - fjVar.k.date >= getMessagesController().k3 / 1000) {
                            VoIPGroupNotification.hide(t0.b, this.currentAccount, fjVar.e1());
                        } else {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(fj.B0(fjVar.k)));
                            ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                            int size = arrayList2.size();
                            int i10 = 0;
                            while (i10 < size) {
                                TLRPC.Peer peer = arrayList2.get(i10);
                                i10++;
                                hashSet.add(Long.valueOf(n5.o(peer)));
                            }
                            StringBuilder sb3 = new StringBuilder();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                long longValue = ((Long) it.next()).longValue();
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(n5.s(this.currentAccount, longValue));
                            }
                            VoIPGroupNotification.request(t0.b, this.currentAccount, fj.B0(fjVar.k), sb3.toString(), tL_messageActionConferenceCall.call_id, fjVar.e1(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i7);
                            i7--;
                        }
                    }
                }
                i7++;
            }
        }
        if (!arrayList.isEmpty()) {
            l0.c(new gn(this, arrayList, new ArrayList(0), z13, z12, countDownLatch));
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j3, int i7, int i10, boolean z10) {
        l0.c(new ng(this, longSparseIntArray, new ArrayList(0), j3, i10, i7, z10));
    }

    public final void M(a0.h hVar, boolean z10) {
        l0.c(new aa.c0(this, hVar, z10, new ArrayList(0), 22));
    }

    public final void N(long j3) {
        L(null, j3, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j3, 0);
        J(longSparseIntArray);
    }

    public final String O(fj fjVar) {
        String str;
        TLRPC.Message message = fjVar.k;
        if (message == null || (str = message.message) == null || message.entities == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (fjVar.K2) {
            return sb2.toString();
        }
        for (int i7 = 0; i7 < fjVar.k.entities.size(); i7++) {
            if (fjVar.k.entities.get(i7) instanceof TLRPC.TL_messageEntitySpoiler) {
                TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) fjVar.k.entities.get(i7);
                for (int i10 = 0; i10 < tL_messageEntitySpoiler.length; i10++) {
                    int i11 = tL_messageEntitySpoiler.offset + i10;
                    char[] cArr = this.i0;
                    sb2.setCharAt(i11, cArr[i10 % cArr.length]);
                }
            }
        }
        return sb2.toString();
    }

    public final void P(e0.q qVar, long j3, long j10, String str, long[] jArr, int i7, Uri uri, int i10, boolean z10, boolean z11, boolean z12, int i11) {
        a8.b("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 == null || uri == null || TextUtils.equals(uri2.toString(), uri.toString())) {
            return;
        }
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        String uri3 = uri2.toString();
        String N0 = gd.N0(2131751587, null);
        if (z10) {
            if (i11 == 2) {
                edit.putString("ChannelSound", N0);
            } else if (i11 == 0) {
                edit.putString("GroupSound", N0);
            } else if (i11 == 1) {
                edit.putString("GlobalSound", N0);
            } else if (i11 == 3) {
                edit.putString("StoriesSound", N0);
            } else if (i11 == 4 || i11 == 5) {
                edit.putString("ReactionSound", N0);
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
            edit.putString("sound_" + v(j3, j10, false), N0);
            edit.putString("sound_path_" + v(j3, j10, false), uri3);
            o(j3, j10);
        }
        edit.commit();
        qVar.y = e0(j3, j10, str, jArr, i7, uri2, i10, z10, z11, z12, i11);
        m0.e(null, this.e0, qVar.b());
    }

    public final void Q(boolean z10) {
        ls lsVar = this.V;
        try {
            if (s2.a) {
                a8.b("delay notification start, onlineReason = " + z10);
            }
            this.W.acquire(10000L);
            q5 q5Var = l0;
            q5Var.a(lsVar);
            q5Var.d(lsVar, z10 ? 3000 : 1000);
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
            if (getAccountInstance().d().getInt("repeat_messages", 60) <= 0 || this.K <= 0) {
                this.d0.cancel(service);
            } else {
                this.d0.set(2, SystemClock.elapsedRealtime() + (r1 * 60000), service);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final void S(int i7) {
        if (this.O == i7) {
            return;
        }
        a8.b("setBadge " + i7);
        this.O = i7;
        try {
            if (zr.c == null && !zr.b) {
                zr.b();
                zr.b = true;
            }
            wr wrVar = zr.c;
            if (wrVar == null) {
                return;
            }
            wrVar.a(i7);
        } catch (Throwable unused) {
        }
    }

    public final void T(long j3, int i7, long j10) {
        SharedPreferences.Editor edit = getAccountInstance().d().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) mp.u1(i10.t0).R.f(j3);
        if (i7 == 4) {
            if (D(j3, null, false, false)) {
                edit.remove("notify2_" + v(j3, j10, false));
            } else {
                edit.putInt("notify2_" + v(j3, j10, false), 0);
            }
            getMessagesStorage().E1(j3, 0L);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        } else {
            int currentTime = ConnectionsManager.getInstance(i10.t0).getCurrentTime();
            if (i7 == 0) {
                currentTime += 3600;
            } else if (i7 == 1) {
                currentTime += 28800;
            } else if (i7 == 2) {
                currentTime += 172800;
            } else if (i7 == 3) {
                currentTime = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            long j11 = 1;
            if (i7 == 3) {
                edit.putInt("notify2_" + v(j3, j10, false), 2);
            } else {
                edit.putInt("notify2_" + v(j3, j10, false), 3);
                edit.putInt("notifyuntil_" + v(j3, j10, false), currentTime);
                j11 = 1 | (((long) currentTime) << 32);
            }
            t(i10.t0).N(j3);
            tr.a0(i10.t0).E1(j3, j11);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        edit.commit();
        c0(j3, j10, true);
    }

    public final void U(int i7, int i10) {
        getAccountInstance().d().edit().putInt(q(i7), i10).commit();
        b0(i7);
        tr messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new pq(messagesStorage, 26));
        m(i7);
    }

    public final void V(int i7) {
        l0.c(new rs(this, i7, 7));
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
    public final void X(e0.q qVar, String str, long j3, long j10, String str2, long[] jArr, int i7, Uri uri, int i10, boolean z10, boolean z11, boolean z12, int i11) {
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
        long j11;
        long j12;
        a0.h hVar4;
        int e12;
        fj fjVar;
        ArrayList arrayList3;
        int i15;
        Integer num;
        int i16;
        a0.h hVar5;
        Notification notification2;
        Integer num2;
        int i17;
        int i18;
        vs vsVar;
        long j13;
        String str4;
        String str5;
        TLRPC.User user;
        TLRPC.User user2;
        String M0;
        TLRPC.FileLocation fileLocation;
        TLRPC.Chat chat;
        boolean z19;
        boolean z20;
        boolean z21;
        SharedPreferences sharedPreferences;
        a0.h hVar6;
        ArrayList arrayList4;
        long j14;
        TLRPC.Chat O0;
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
        String q10;
        TLRPC.User user5;
        TLRPC.FileLocation fileLocation7;
        String M02;
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
        long j15;
        e0.x xVar;
        int i24;
        String str11;
        ArrayList arrayList5;
        fj fjVar2;
        Bitmap bitmap3;
        String str12;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList6;
        int i25;
        StringBuilder sb2;
        long j16;
        long j17;
        e0.x xVar2;
        String[] strArr;
        e0.x xVar3;
        int i26;
        int i27;
        long j18;
        String str13;
        boolean[] zArr;
        StringBuilder sb3;
        long j19;
        long j20;
        IconCompat iconCompat;
        char c10;
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
        char c11;
        ArrayList arrayList8;
        Uri uri2;
        ArrayList arrayList9;
        File file3;
        Uri d;
        Bitmap createScaledBitmap;
        Canvas canvas;
        fj fjVar3;
        long j21;
        long j22;
        Bitmap bitmap4;
        e0.h hVar9;
        String str14;
        e0.h hVar10;
        ArrayList arrayList10;
        long j23;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton;
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy;
        long j24;
        TLRPC.User user7;
        int size3;
        int i30;
        TLRPC.Message message;
        TLRPC.ReplyMarkup replyMarkup;
        Intent intent;
        ArrayList arrayList11;
        boolean z23;
        ?? r52;
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
        xs xsVar = this;
        a8.b("showExtraNotifications pushMessages.size()=" + xsVar.a.size());
        if (Build.VERSION.SDK_INT >= 26) {
            z13 = z12;
            qVar.e(xsVar.e0(j3, j10, str2, jArr, i7, uri, i10, z10, z11, z13, i11));
        } else {
            z13 = z12;
        }
        qVar.h(8, z13);
        Notification b11 = qVar.b();
        SharedPreferences d2 = xsVar.getAccountInstance().d();
        ArrayList arrayList12 = new ArrayList();
        if (!xsVar.E.isEmpty()) {
            arrayList12.add(new vs(0L, 0L, true));
        }
        a0.h hVar11 = new a0.h();
        int i32 = 0;
        for (int i33 = 0; i33 < xsVar.a.size(); i33++) {
            fj fjVar4 = (fj) xsVar.a.get(i33);
            long A0 = fjVar4.A0();
            long a22 = fj.a2(xsVar.currentAccount, fjVar4.k, xsVar.getMessagesController().z2(fjVar4));
            int i34 = d2.getInt("dismissDate" + A0, 0);
            if (fjVar4.K || fjVar4.k.date > i34) {
                ArrayList arrayList13 = (ArrayList) hVar11.f(A0);
                if (arrayList13 == null) {
                    arrayList13 = f3.h(hVar11, A0);
                    a8.b("showExtraNotifications: sortedDialogs += " + A0);
                    arrayList12.add(new vs(A0, a22, false));
                }
                arrayList13.add(fjVar4);
            } else {
                StringBuilder t6 = a8.p0.t(A0, "showExtraNotifications: dialog ", " is skipped, message date (");
                t6.append(fjVar4.k.date);
                t6.append(" <= ");
                t6.append(i34);
                t6.append(")");
                a8.b(t6.toString());
            }
        }
        a0.h hVar12 = new a0.h();
        for (int i35 = 0; i35 < xsVar.h.m(); i35++) {
            hVar12.k((Integer) xsVar.h.n(i35), xsVar.h.j(i35));
        }
        xsVar.h.b();
        ArrayList arrayList14 = new ArrayList();
        int i36 = Build.VERSION.SDK_INT;
        if (i36 > 27) {
            if (arrayList12.size() <= (xsVar.E.isEmpty() ? 1 : 2)) {
                z14 = false;
                if (z14 && i36 >= 26) {
                    i();
                }
                e10 = xsVar.getUserConfig().e();
                z15 = !g0.o2() || bz.C;
                a8.b("showExtraNotifications: passcode=" + (bz.s.length() <= 0) + " waitingForPasscode=" + z15 + " selfUserId=" + e10 + " useSummaryNotification=" + z14);
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
                    vs vsVar2 = (vs) arrayList12.get(i32);
                    ArrayList arrayList15 = arrayList12;
                    if (vsVar2.c) {
                        ArrayList arrayList16 = new ArrayList();
                        if (xsVar.E.isEmpty()) {
                            StringBuilder sb4 = new StringBuilder("showExtraNotifications: [");
                            z17 = z15;
                            sb4.append(vsVar2.a);
                            sb4.append("] continue; story but storyPushMessages is empty");
                            a8.b(sb4.toString());
                            z18 = z14;
                            notification3 = b11;
                            sharedPreferences = d2;
                            hVar4 = hVar11;
                            i16 = i32;
                            hVar5 = hVar12;
                            hVar6 = hVar;
                            i14 = size;
                            j14 = e10;
                            arrayList4 = arrayList;
                            i32 = i16 + 1;
                            arrayList = arrayList4;
                            arrayList12 = arrayList15;
                            z14 = z18;
                            z15 = z17;
                            size = i14;
                            hVar11 = hVar4;
                            hVar12 = hVar5;
                            d2 = sharedPreferences;
                            e10 = j14;
                            b11 = notification3;
                            hVar = hVar6;
                        } else {
                            z17 = z15;
                            i14 = size;
                            long j25 = ((ws) xsVar.E.get(0)).a;
                            int i37 = 0;
                            for (Iterator it = ((ws) xsVar.E.get(0)).c.keySet().iterator(); it.hasNext(); it = it) {
                                i37 = Math.max(i37, ((Integer) it.next()).intValue());
                            }
                            z18 = z14;
                            arrayList3 = arrayList16;
                            hVar4 = hVar11;
                            e12 = i37;
                            j11 = j25;
                            j12 = 0;
                            notification = b11;
                            fjVar = null;
                        }
                    } else {
                        z17 = z15;
                        i14 = size;
                        long j26 = vsVar2.a;
                        z18 = z14;
                        notification = b11;
                        long j27 = vsVar2.b;
                        ArrayList arrayList17 = (ArrayList) hVar11.f(j26);
                        j11 = j26;
                        j12 = j27;
                        hVar4 = hVar11;
                        e12 = ((fj) arrayList17.get(0)).e1();
                        fjVar = (fj) arrayList17.get(0);
                        arrayList3 = arrayList17;
                    }
                    long j28 = e10;
                    Integer num3 = (Integer) hVar12.f(vsVar2.a);
                    if (vsVar2.c) {
                        num = 2147483646;
                        i15 = 32;
                    } else {
                        if (num3 == null) {
                            i15 = 32;
                            long j29 = vsVar2.a;
                            num3 = Integer.valueOf(((int) j29) + ((int) (j29 >> 32)));
                        } else {
                            i15 = 32;
                            hVar12.l(vsVar2.a);
                        }
                        num = num3;
                    }
                    i16 = i32;
                    int i38 = 0;
                    for (int i39 = 0; i39 < arrayList3.size(); i39++) {
                        if (i38 < ((fj) arrayList3.get(i39)).k.date) {
                            i38 = ((fj) arrayList3.get(i39)).k.date;
                        }
                    }
                    if (vsVar2.c) {
                        hVar5 = hVar12;
                        TLRPC.User c22 = xsVar.getMessagesController().c2(Long.valueOf(j11));
                        notification2 = notification;
                        if (xsVar.E.size() == 1) {
                            G2 = c22 != null ? n10.j(c22) : ((ws) xsVar.E.get(0)).b;
                            num2 = num;
                        } else {
                            num2 = num;
                            G2 = gd.G(xsVar.E.size(), "Stories", new Object[0]);
                        }
                        if (c22 == null || (userProfilePhoto4 = c22.photo) == null || (fileLocation13 = userProfilePhoto4.photo_small) == null) {
                            i17 = i38;
                        } else {
                            i17 = i38;
                            if (fileLocation13.volume_id != 0 && fileLocation13.local_id != 0) {
                                i18 = e12;
                                vsVar = vsVar2;
                                j13 = j11;
                                z19 = false;
                                z20 = false;
                                z21 = false;
                                str4 = "showExtraNotifications: [";
                                str5 = "Stories";
                                fileLocation = fileLocation13;
                                user2 = c22;
                                M0 = G2;
                                chat = null;
                            }
                        }
                        i18 = e12;
                        vsVar = vsVar2;
                        j13 = j11;
                        z19 = false;
                        z20 = false;
                        z21 = false;
                        str4 = "showExtraNotifications: [";
                        str5 = "Stories";
                        fileLocation = null;
                        user2 = c22;
                        M0 = G2;
                        chat = null;
                    } else {
                        hVar5 = hVar12;
                        notification2 = notification;
                        num2 = num;
                        i17 = i38;
                        if (n5.C(j11)) {
                            i18 = e12;
                            vsVar = vsVar2;
                            j13 = j11;
                            str4 = "showExtraNotifications: [";
                            str5 = "Stories";
                            if (j13 != o0) {
                                int h = n5.h(j13);
                                TLRPC.EncryptedChat c12 = xsVar.getMessagesController().c1(Integer.valueOf(h));
                                if (c12 != null) {
                                    user = xsVar.getMessagesController().c2(Long.valueOf(c12.user_id));
                                    if (user == null) {
                                        if (s2.a) {
                                            a8.l("not found secret chat user to show dialog notification " + c12.user_id);
                                        }
                                    }
                                } else if (s2.a) {
                                    a8.l("not found secret chat to show dialog notification " + h);
                                }
                                sharedPreferences = d2;
                                hVar6 = hVar;
                                arrayList4 = arrayList;
                                j14 = j28;
                                notification3 = notification2;
                            } else {
                                user = null;
                            }
                            user2 = user;
                            M0 = gd.M0(2131745497);
                            fileLocation = null;
                            chat = null;
                            z19 = false;
                            z20 = false;
                            z21 = false;
                        } else {
                            boolean z24 = (fjVar == null || fjVar.I || fjVar.J || j11 == 777000) ? false : true;
                            if (n5.E(j11)) {
                                TLRPC.User c23 = xsVar.getMessagesController().c2(Long.valueOf(j11));
                                if (c23 != null) {
                                    j13 = j11;
                                    q10 = n10.q(c23);
                                    z19 = z24;
                                    TLRPC.UserProfilePhoto userProfilePhoto5 = c23.photo;
                                    if (userProfilePhoto5 == null || (fileLocation7 = userProfilePhoto5.photo_small) == null) {
                                        str5 = "Stories";
                                        user5 = c23;
                                    } else {
                                        str5 = "Stories";
                                        user5 = c23;
                                        if (fileLocation7.volume_id != 0) {
                                        }
                                    }
                                } else if (fjVar.i3()) {
                                    q10 = fjVar.b;
                                    user5 = c23;
                                    j13 = j11;
                                    z19 = z24;
                                    str5 = "Stories";
                                } else {
                                    if (s2.a) {
                                        a8.l("not found user to show dialog notification " + j11);
                                    }
                                    sharedPreferences = d2;
                                    hVar6 = hVar;
                                    arrayList4 = arrayList;
                                    j14 = j28;
                                    notification3 = notification2;
                                }
                                fileLocation7 = null;
                                if (j13 == 489001) {
                                    M02 = gd.M0(2131753118);
                                } else if (j13 == 489000) {
                                    M02 = gd.M0(2131743369);
                                } else if (n10.z(j13)) {
                                    M02 = gd.M0(2131746070);
                                } else if (j13 == j28) {
                                    M02 = gd.M0(2131748334);
                                } else {
                                    fileLocation2 = fileLocation7;
                                    i18 = e12;
                                    vsVar = vsVar2;
                                    str6 = q10;
                                    O0 = null;
                                    z21 = false;
                                    str4 = "showExtraNotifications: [";
                                    user3 = user5;
                                    z20 = false;
                                    i19 = (j13 > 489000L ? 1 : (j13 == 489000L ? 0 : -1));
                                    if (i19 == 0 || fjVar == null || fjVar.W0() == null) {
                                        user4 = user3;
                                        i20 = i19;
                                        fileLocation3 = fileLocation2;
                                    } else {
                                        Long W0 = fjVar.W0();
                                        user4 = user3;
                                        i20 = i19;
                                        long longValue = W0.longValue();
                                        if (n5.E(longValue)) {
                                            TLRPC.UserProfilePhoto userProfilePhoto6 = xsVar.getMessagesController().c2(W0).photo;
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
                                            TLRPC.ChatPhoto chatPhoto2 = xsVar.getMessagesController().O0(Long.valueOf(-longValue)).photo;
                                            if (chatPhoto2 != null) {
                                                fileLocation = chatPhoto2.photo_small;
                                                if (fileLocation != null) {
                                                    if (fileLocation.volume_id != 0) {
                                                    }
                                                }
                                            }
                                        }
                                        String str15 = str6;
                                        chat = O0;
                                        M0 = str15;
                                        user2 = user4;
                                        if (i20 == 0) {
                                            z19 = false;
                                        }
                                    }
                                    fileLocation = fileLocation3;
                                    String str152 = str6;
                                    chat = O0;
                                    M0 = str152;
                                    user2 = user4;
                                    if (i20 == 0) {
                                    }
                                }
                                i18 = e12;
                                str6 = M02;
                                vsVar = vsVar2;
                                z21 = false;
                                fileLocation2 = fileLocation7;
                                str4 = "showExtraNotifications: [";
                                user3 = user5;
                                O0 = null;
                                z20 = false;
                                i19 = (j13 > 489000L ? 1 : (j13 == 489000L ? 0 : -1));
                                if (i19 == 0) {
                                }
                                user4 = user3;
                                i20 = i19;
                                fileLocation3 = fileLocation2;
                                fileLocation = fileLocation3;
                                String str1522 = str6;
                                chat = O0;
                                M0 = str1522;
                                user2 = user4;
                                if (i20 == 0) {
                                }
                            } else {
                                j13 = j11;
                                z19 = z24;
                                str5 = "Stories";
                                O0 = xsVar.getMessagesController().O0(Long.valueOf(-j13));
                                if (O0 != null) {
                                    boolean z25 = O0.megagroup;
                                    boolean z26 = v3.T(O0) && !O0.megagroup;
                                    String y10 = xsVar.y(O0);
                                    z20 = z25;
                                    TLRPC.ChatPhoto chatPhoto3 = O0.photo;
                                    if (chatPhoto3 == null || (fileLocation2 = chatPhoto3.photo_small) == null) {
                                        z21 = z26;
                                        vsVar = vsVar2;
                                    } else {
                                        z21 = z26;
                                        vsVar = vsVar2;
                                        if (fileLocation2.volume_id != 0) {
                                        }
                                    }
                                    fileLocation2 = null;
                                    if (j12 != 0) {
                                        str4 = "showExtraNotifications: [";
                                        i18 = e12;
                                        TLRPC.TL_forumTopic f10 = xsVar.getMessagesController().U1().f(O0.id, j12);
                                        if (f10 != null) {
                                            y10 = p5.c.m(f10.title, " in ", y10, new StringBuilder());
                                        }
                                    } else {
                                        str4 = "showExtraNotifications: [";
                                        i18 = e12;
                                    }
                                    if (z19) {
                                        z19 = v3.q(O0);
                                    }
                                    str6 = y10;
                                } else if (fjVar.i3()) {
                                    boolean A4 = fjVar.A4();
                                    str6 = fjVar.b;
                                    i18 = e12;
                                    z20 = A4;
                                    vsVar = vsVar2;
                                    z21 = fjVar.f;
                                    fileLocation2 = null;
                                    z19 = false;
                                    str4 = "showExtraNotifications: [";
                                } else {
                                    if (s2.a) {
                                        a8.l("not found chat to show dialog notification " + j13);
                                    }
                                    sharedPreferences = d2;
                                    hVar6 = hVar;
                                    arrayList4 = arrayList;
                                    j14 = j28;
                                    notification3 = notification2;
                                }
                                user3 = null;
                                i19 = (j13 > 489000L ? 1 : (j13 == 489000L ? 0 : -1));
                                if (i19 == 0) {
                                }
                                user4 = user3;
                                i20 = i19;
                                fileLocation3 = fileLocation2;
                                fileLocation = fileLocation3;
                                String str15222 = str6;
                                chat = O0;
                                M0 = str15222;
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
                        d2 = sharedPreferences;
                        e10 = j14;
                        b11 = notification3;
                        hVar = hVar6;
                    }
                    if (fjVar == null || !fjVar.J) {
                        i21 = 2131747827;
                    } else {
                        i21 = 2131747827;
                        if (!d2.getBoolean("EnableReactionsPreview", true)) {
                            M0 = gd.M0(2131747827);
                            fileLocation = null;
                            z19 = false;
                        }
                    }
                    if (z17) {
                        str7 = n5.z(j13) ? gd.M0(i21) : gd.M0(2131747824);
                        fileLocation8 = null;
                        z19 = false;
                    } else {
                        TLRPC.FileLocation fileLocation14 = fileLocation;
                        str7 = M0;
                        fileLocation8 = fileLocation14;
                    }
                    if (fileLocation8 != null) {
                        xsVar.getFileLoader().getClass();
                        i22 = 2131747824;
                        file = w7.K(fileLocation8, true);
                        if (Build.VERSION.SDK_INT < 28) {
                            BitmapDrawable C = ec.D().C(fileLocation8);
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
                        i22 = 2131747824;
                        bitmap = null;
                        file = null;
                    }
                    if (chat != null) {
                        if (file == null || !file.exists() || (i31 = Build.VERSION.SDK_INT) < 28) {
                            str9 = str4;
                            iconCompat3 = null;
                        } else {
                            if (j13 == 489001) {
                                iconCompat3 = IconCompat.d(t0.b, R.drawable.ic_launcher_dr);
                            } else {
                                if (i31 >= 28) {
                                    try {
                                        iconCompat3 = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new ps()));
                                    } catch (Throwable unused2) {
                                    }
                                }
                                iconCompat3 = null;
                            }
                            str9 = str4;
                        }
                        long j30 = -chat.id;
                        sharedPreferences = d2;
                        e0.j0 j0Var = new e0.j0();
                        j0Var.a = str7;
                        j0Var.b = iconCompat3;
                        str8 = str7;
                        j0Var.c = null;
                        j0Var.d = null;
                        j0Var.e = false;
                        j0Var.f = false;
                        hVar.k(j0Var, j30);
                    } else {
                        sharedPreferences = d2;
                        str8 = str7;
                        str9 = str4;
                    }
                    if ((!z21 || z20) && z19 && !bz.C && j28 != j13 && !n10.z(j13) && mp.u1(xsVar.currentAccount).P1(j13) <= 0) {
                        bitmap2 = bitmap;
                        Intent intent2 = new Intent(t0.b, (Class<?>) WearReplyReceiver.class);
                        intent2.putExtra("dialog_id", j13);
                        i23 = i18;
                        intent2.putExtra("max_id", i23);
                        intent2.putExtra("topic_id", j12);
                        intent2.putExtra("currentAccount", xsVar.currentAccount);
                        if (arrayList3.isEmpty()) {
                            str10 = "max_id";
                            user6 = user2;
                            chat2 = chat;
                        } else {
                            ArrayList arrayList18 = new ArrayList();
                            user6 = user2;
                            chat2 = chat;
                            for (int i40 = 0; i40 < arrayList3.size(); i40++) {
                                fj fjVar5 = (fj) arrayList3.get(i40);
                                if (fjVar5 != null && fjVar5.P4() && fjVar5.R2() && !fjVar5.N3()) {
                                    arrayList18.add(Integer.valueOf(fjVar5.e1()));
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
                        e0.l0 l0Var = new e0.l0(gd.M0(2131746067), new Bundle(), new HashSet());
                        if (n5.z(j13)) {
                            z22 = false;
                            Z = gd.Z(2131746055, str8);
                        } else {
                            z22 = false;
                            Z = gd.Z(2131746048, str8);
                        }
                        e0.g gVar = new e0.g(R.drawable.ic_reply_icon, broadcast, Z);
                        gVar.f();
                        gVar.a = 1;
                        gVar.a(l0Var);
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
                    Integer num4 = (Integer) xsVar.f.f(j13);
                    if (num4 == null) {
                        num4 = 0;
                    }
                    vs vsVar3 = vsVar;
                    int size5 = vsVar3.c ? xsVar.E.size() : Math.max(num4.intValue(), arrayList3.size());
                    String format = (size5 <= 1 || Build.VERSION.SDK_INT >= 28) ? str8 : String.format("%1$s (%2$d)", str8, Integer.valueOf(size5));
                    int i42 = i23;
                    e0.j0 j0Var2 = (e0.j0) hVar.f(j28);
                    int i43 = Build.VERSION.SDK_INT;
                    if (i43 < 28 || j0Var2 != null) {
                        hVar7 = b10;
                    } else {
                        hVar7 = b10;
                        TLRPC.User c24 = xsVar.getMessagesController().c2(Long.valueOf(j28));
                        if (c24 == null) {
                            c24 = xsVar.getUserConfig().f();
                        }
                        if (c24 != null) {
                            try {
                                userProfilePhoto3 = c24.photo;
                            } catch (Throwable th2) {
                                th = th2;
                                j15 = j12;
                            }
                            if (userProfilePhoto3 != null && (fileLocation12 = userProfilePhoto3.photo_small) != null) {
                                j15 = j12;
                                try {
                                    if (fileLocation12.volume_id != 0 && fileLocation12.local_id != 0) {
                                        String M03 = gd.M0(2131750486);
                                        w7 fileLoader = xsVar.getFileLoader();
                                        TLRPC.FileLocation fileLocation15 = c24.photo.photo_small;
                                        fileLoader.getClass();
                                        File K = w7.K(fileLocation15, true);
                                        if (xsVar.getUserConfig().e() == 489001) {
                                            iconCompat2 = IconCompat.d(t0.b, R.drawable.ic_launcher_dr);
                                        } else {
                                            if (K != null && i43 >= 28) {
                                                try {
                                                    iconCompat2 = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(K), new ps()));
                                                } catch (Throwable unused3) {
                                                }
                                            }
                                            iconCompat2 = null;
                                        }
                                        e0.j0 j0Var3 = new e0.j0();
                                        j0Var3.a = M03;
                                        j0Var3.b = iconCompat2;
                                        j0Var3.c = null;
                                        j0Var3.d = null;
                                        j0Var3.e = false;
                                        j0Var3.f = false;
                                        try {
                                            hVar.k(j0Var3, j28);
                                            j0Var2 = j0Var3;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            j0Var2 = j0Var3;
                                            a8.f(th);
                                            e0.j0 j0Var4 = j0Var2;
                                            if (j0Var4 == null) {
                                            }
                                            i24 = Build.VERSION.SDK_INT;
                                            if (i24 >= 28) {
                                            }
                                            xVar.f(format);
                                            xVar.i = Boolean.valueOf(i24 >= 28 || (!z21 && n5.z(j13)) || n10.z(j13));
                                            StringBuilder sb5 = new StringBuilder();
                                            String[] strArr2 = new String[1];
                                            boolean[] zArr2 = new boolean[1];
                                            if (vsVar3.c) {
                                            }
                                            a0.h hVar13 = hVar;
                                            Intent intent3 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                                            intent3.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                            intent3.setFlags(67108864);
                                            intent3.addCategory("android.intent.category.LAUNCHER");
                                            fjVar3 = fjVar2;
                                            if (fjVar2 == null) {
                                            }
                                            if (fjVar3 == null) {
                                            }
                                            if (fjVar3 == null) {
                                            }
                                            j21 = j16;
                                            if (vsVar3.c) {
                                            }
                                            j22 = j17;
                                            i5.c.v(j22, a8.p0.t(j21, "show extra notifications chatId ", " topicId "));
                                            if (j22 != 0) {
                                            }
                                            String str16 = str11;
                                            intent3.putExtra(str16, xsVar.currentAccount);
                                            PendingIntent activity = PendingIntent.getActivity(t0.b, 0, intent3, 1140850688);
                                            e0.d0 d0Var = new e0.d0();
                                            e0.h hVar14 = hVar7;
                                            if (hVar7 != null) {
                                            }
                                            int i44 = i25;
                                            Intent intent4 = new Intent(t0.b, (Class<?>) AutoMessageHeardReceiver.class);
                                            intent4.addFlags(i15);
                                            intent4.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                            intent4.putExtra("dialog_id", j21);
                                            intent4.putExtra(str10, i42);
                                            intent4.putExtra(str16, xsVar.currentAccount);
                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList19 = arrayList6;
                                            bitmap4 = bitmap3;
                                            e0.g gVar2 = new e0.g(R.drawable.msg_markread, PendingIntent.getBroadcast(t0.b, num2.intValue(), intent4, 167772160), gd.M0(2131748488));
                                            gVar2.a = 2;
                                            gVar2.c = false;
                                            e0.h b12 = gVar2.b();
                                            if (!n5.C(j21)) {
                                            }
                                            if (str14 == null) {
                                            }
                                            StringBuilder sb6 = new StringBuilder("tgaccount");
                                            long j31 = j14;
                                            sb6.append(j31);
                                            d0Var.b(sb6.toString());
                                            if (vsVar3.c) {
                                            }
                                            e0.q qVar2 = new e0.q(t0.b);
                                            qVar2.g(str12);
                                            ArrayList arrayList20 = arrayList10;
                                            qVar2.F.icon = R.drawable.notification;
                                            qVar2.f(sb2.toString());
                                            qVar2.h(16, true);
                                            qVar2.i = !vsVar3.c ? xsVar.E.size() : arrayList20.size();
                                            qVar2.w = -15618822;
                                            qVar2.r = false;
                                            qVar2.F.when = j23;
                                            qVar2.k = true;
                                            qVar2.n(xVar2);
                                            qVar2.g = activity;
                                            qVar2.c(d0Var);
                                            qVar2.l(String.valueOf(Long.MAX_VALUE - j23));
                                            qVar2.h(8, (z12 && j21 == j3 && j22 == j10) ? false : true);
                                            qVar2.u = "msg";
                                            intent = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                            intent.putExtra("messageDate", i17);
                                            intent.putExtra("dialogId", j21);
                                            intent.putExtra(str16, xsVar.currentAccount);
                                            if (vsVar3.c) {
                                            }
                                            if (fjVar3 != null) {
                                            }
                                            qVar2.F.deleteIntent = PendingIntent.getBroadcast(t0.b, num2.intValue(), intent, 167772160);
                                            if (z18) {
                                            }
                                            if (fjVar3 != null) {
                                            }
                                            keyboardInlineButton = null;
                                            tL_inlineButtonTypeCopy = null;
                                            if (keyboardInlineButton != null) {
                                            }
                                            j24 = vsVar3.a;
                                            if (j24 != 489000) {
                                            }
                                            if (arrayList15.size() != 1) {
                                            }
                                            if (n5.C(j21)) {
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
                                            a8.b("showExtraNotifications: holders.add " + j21);
                                            notification3 = notification4;
                                            z18 = z27;
                                            long j32 = j21;
                                            hVar6 = hVar13;
                                            us usVar = new us(xsVar, num2.intValue(), j32, vsVar3.c, str12, user7, chat2, qVar2, j10, str2, jArr, i7, uri, i10, z10, z11, z12, i11);
                                            arrayList4 = arrayList;
                                            arrayList4.add(usVar);
                                            xsVar.h.k(num2, j32);
                                            i32 = i16 + 1;
                                            arrayList = arrayList4;
                                            arrayList12 = arrayList15;
                                            z14 = z18;
                                            z15 = z17;
                                            size = i14;
                                            hVar11 = hVar4;
                                            hVar12 = hVar5;
                                            d2 = sharedPreferences;
                                            e10 = j14;
                                            b11 = notification3;
                                            hVar = hVar6;
                                        }
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                e0.j0 j0Var42 = j0Var2;
                                xVar = (j0Var42 == null && (fjVar != null || !(fjVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new e0.x(j0Var42) : new e0.x();
                                i24 = Build.VERSION.SDK_INT;
                                if (i24 >= 28 || ((n5.z(j13) && !z21) || n10.z(j13))) {
                                    xVar.f(format);
                                }
                                xVar.i = Boolean.valueOf(i24 >= 28 || (!z21 && n5.z(j13)) || n10.z(j13));
                                StringBuilder sb52 = new StringBuilder();
                                String[] strArr22 = new String[1];
                                boolean[] zArr22 = new boolean[1];
                                if (vsVar3.c) {
                                    ArrayList arrayList21 = new ArrayList();
                                    ArrayList arrayList22 = new ArrayList();
                                    Pair I = xsVar.I(arrayList21, arrayList22);
                                    int intValue = ((Integer) I.first).intValue();
                                    boolean booleanValue = ((Boolean) I.second).booleanValue();
                                    if (booleanValue) {
                                        arrayList11 = arrayList22;
                                        j14 = j28;
                                        z23 = booleanValue;
                                        sb52.append(gd.G(intValue, "StoryNotificationHidden", new Object[0]));
                                    } else {
                                        j14 = j28;
                                        arrayList11 = arrayList22;
                                        z23 = booleanValue;
                                        if (arrayList21.isEmpty()) {
                                            a8.b(str9 + j13 + "] continue; story but names is empty");
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
                                            d2 = sharedPreferences;
                                            e10 = j14;
                                            b11 = notification3;
                                            hVar = hVar6;
                                        } else if (arrayList21.size() == 1) {
                                            if (intValue == 1) {
                                                sb52.append(gd.O0("StoryNotificationSingle"));
                                            } else {
                                                sb52.append(gd.G(intValue, "StoryNotification1", arrayList21.get(0)));
                                            }
                                        } else if (arrayList21.size() == 2) {
                                            sb52.append(gd.Z(2131744358, arrayList21.get(0), arrayList21.get(1)));
                                        } else if (arrayList21.size() == 3 && xsVar.E.size() == 3) {
                                            sb52.append(gd.Z(2131744357, k((String) arrayList21.get(0)), k((String) arrayList21.get(1)), k((String) arrayList21.get(2))));
                                        } else {
                                            sb52.append(gd.G(xsVar.E.size() - 2, "StoryNotification4", k((String) arrayList21.get(0)), k((String) arrayList21.get(1))));
                                        }
                                    }
                                    String str17 = "currentAccount";
                                    long j33 = Long.MAX_VALUE;
                                    int i45 = 0;
                                    while (i45 < xsVar.E.size()) {
                                        j33 = Math.min(((ws) xsVar.E.get(i45)).e, j33);
                                        i45++;
                                        str17 = str17;
                                    }
                                    str11 = str17;
                                    xVar.i = Boolean.FALSE;
                                    if (arrayList21.size() != 1 || z23) {
                                        r52 = 0;
                                        G = gd.G(intValue, str5, new Object[0]);
                                    } else {
                                        r52 = 0;
                                        G = (String) arrayList21.get(0);
                                    }
                                    e0.j0 j0Var5 = new e0.j0();
                                    j0Var5.a = G;
                                    j0Var5.b = null;
                                    j0Var5.c = null;
                                    j0Var5.d = null;
                                    j0Var5.e = r52;
                                    j0Var5.f = r52;
                                    e0.w wVar = new e0.w(sb52, j33, j0Var5);
                                    ArrayList arrayList23 = xVar.e;
                                    arrayList23.add(wVar);
                                    if (arrayList23.size() > 25) {
                                        arrayList23.remove((int) r52);
                                    }
                                    arrayList5 = arrayList3;
                                    fjVar2 = fjVar;
                                    bitmap3 = !z23 ? F(arrayList11) : null;
                                    i25 = 0;
                                    arrayList6 = null;
                                    str12 = G;
                                    xVar2 = xVar;
                                    sb2 = sb52;
                                    j16 = j13;
                                    j17 = j15;
                                } else {
                                    j14 = j28;
                                    String str18 = str9;
                                    str11 = "currentAccount";
                                    int size6 = arrayList3.size() - 1;
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList24 = null;
                                    int i46 = 0;
                                    while (size6 >= 0) {
                                        int i47 = size6;
                                        fj fjVar6 = (fj) arrayList3.get(size6);
                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList25 = arrayList24;
                                        int i48 = i46;
                                        ArrayList arrayList26 = arrayList3;
                                        fj fjVar7 = fjVar;
                                        long a23 = fj.a2(xsVar.currentAccount, fjVar6.k, xsVar.getMessagesController().z2(fjVar6));
                                        if (j15 != a23) {
                                            StringBuilder t10 = a8.p0.t(j13, str18, "] continue; topic id is not equal: topicId=");
                                            xVar4 = xVar;
                                            long j34 = j15;
                                            t10.append(j34);
                                            t10.append(" messageTopicId=");
                                            t10.append(a23);
                                            t10.append("; selfId=");
                                            t10.append(xsVar.getUserConfig().e());
                                            a8.b(t10.toString());
                                            j19 = j34;
                                            sb3 = sb52;
                                            strArr = strArr22;
                                            hVar8 = hVar;
                                            str13 = str18;
                                            zArr = zArr22;
                                            j20 = j13;
                                        } else {
                                            e0.x xVar5 = xVar;
                                            String str19 = str18;
                                            long j35 = j15;
                                            String w10 = xsVar.w(fjVar6, strArr22, zArr22);
                                            int i49 = (j13 > 489001L ? 1 : (j13 == 489001L ? 0 : -1));
                                            if (i49 == 0) {
                                                strArr22[0] = gd.M0(2131753118);
                                                strArr = strArr22;
                                                xVar3 = xVar5;
                                                i26 = 2131747768;
                                            } else if (j13 != 489000 || fjVar6.W0() == null) {
                                                strArr = strArr22;
                                                xVar3 = xVar5;
                                                i26 = 2131747768;
                                                if (j13 == j14) {
                                                    strArr[0] = str8;
                                                } else if (n5.z(j13) && fjVar6.k.from_scheduled) {
                                                    strArr[0] = gd.M0(2131747768);
                                                }
                                            } else {
                                                i26 = 2131747768;
                                                strArr = strArr22;
                                                xVar3 = xVar5;
                                                strArr[0] = xsVar.getMessagesController().C1(fjVar6.W0().longValue());
                                            }
                                            if (w10 == null) {
                                                if (s2.a) {
                                                    a8.l("message text is null for " + fjVar6.e1() + " did = " + fjVar6.A0());
                                                }
                                                j19 = j35;
                                                sb3 = sb52;
                                                hVar8 = hVar;
                                                str13 = str19;
                                                zArr = zArr22;
                                                j20 = j13;
                                                xVar4 = xVar3;
                                            } else {
                                                if (sb52.length() > 0) {
                                                    sb52.append("\n\n");
                                                }
                                                if (j13 != j14 && fjVar6.k.from_scheduled && n5.E(j13)) {
                                                    String M04 = gd.M0(i26);
                                                    i27 = i49;
                                                    w10 = String.format("%1$s: %2$s", M04, w10);
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
                                                int i50 = (j13 > 489000L ? 1 : (j13 == 489000L ? 0 : -1));
                                                if (i50 != 0 || fjVar6.W0() == null) {
                                                    if (!n5.E(j13)) {
                                                        if (z21) {
                                                            j18 = -j13;
                                                        } else if (n5.z(j13)) {
                                                            j18 = fjVar6.R1();
                                                        }
                                                    }
                                                    j18 = j13;
                                                } else {
                                                    j18 = fjVar6.W0().longValue();
                                                }
                                                str13 = str19;
                                                boolean[] zArr3 = zArr22;
                                                e0.j0 j0Var6 = (e0.j0) hVar.f(j18 + (j35 << 16));
                                                String str22 = strArr[0];
                                                zArr = zArr3;
                                                if (str22 == null) {
                                                    if (!z17) {
                                                        sb3 = sb52;
                                                    } else if (!n5.z(j13)) {
                                                        sb3 = sb52;
                                                        if (Build.VERSION.SDK_INT > 27) {
                                                            str22 = gd.M0(i22);
                                                        }
                                                    } else if (z21) {
                                                        sb3 = sb52;
                                                        if (Build.VERSION.SDK_INT > 27) {
                                                            str22 = gd.M0(i21);
                                                        }
                                                    } else {
                                                        sb3 = sb52;
                                                        str22 = gd.M0(2131747826);
                                                    }
                                                    str22 = "";
                                                } else {
                                                    sb3 = sb52;
                                                }
                                                if (j0Var6 == null || !TextUtils.equals(j0Var6.b(), str22)) {
                                                    if (!zArr[0] || n5.C(j13) || (i28 = Build.VERSION.SDK_INT) < 28) {
                                                        j19 = j35;
                                                        j20 = j13;
                                                    } else {
                                                        if (n5.E(j13) || z21) {
                                                            i29 = i50;
                                                            j19 = j35;
                                                            j20 = j13;
                                                            file2 = file;
                                                        } else {
                                                            j19 = j35;
                                                            long R1 = fjVar6.R1();
                                                            i29 = i50;
                                                            TLRPC.User c25 = xsVar.getMessagesController().c2(Long.valueOf(R1));
                                                            if (c25 == null && (c25 = xsVar.getMessagesStorage().k0(R1)) != null) {
                                                                xsVar.getMessagesController().e4(c25, true, false);
                                                            }
                                                            if (c25 == null || (userProfilePhoto2 = c25.photo) == null || (fileLocation11 = userProfilePhoto2.photo_small) == null) {
                                                                j20 = j13;
                                                            } else {
                                                                j20 = j13;
                                                                if (fileLocation11.volume_id != 0 && fileLocation11.local_id != 0) {
                                                                    w7 fileLoader2 = xsVar.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation16 = c25.photo.photo_small;
                                                                    fileLoader2.getClass();
                                                                    file2 = w7.K(fileLocation16, true);
                                                                }
                                                            }
                                                            file2 = null;
                                                        }
                                                        if (file2 == null && i29 == 0 && fjVar6.W0() != null) {
                                                            if (j18 >= 0) {
                                                                TLRPC.User c26 = xsVar.getMessagesController().c2(Long.valueOf(j18));
                                                                if (c26 != null && (userProfilePhoto = c26.photo) != null && (fileLocation10 = userProfilePhoto.photo_small) != null && fileLocation10.volume_id != 0 && fileLocation10.local_id != 0) {
                                                                    w7 fileLoader3 = xsVar.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation17 = c26.photo.photo_small;
                                                                    fileLoader3.getClass();
                                                                    file2 = w7.K(fileLocation17, true);
                                                                }
                                                            } else {
                                                                TLRPC.Chat O02 = xsVar.getMessagesController().O0(Long.valueOf(-j18));
                                                                if (O02 != null && (chatPhoto = O02.photo) != null && (fileLocation9 = chatPhoto.photo_small) != null && fileLocation9.volume_id != 0 && fileLocation9.local_id != 0) {
                                                                    w7 fileLoader4 = xsVar.getFileLoader();
                                                                    TLRPC.FileLocation fileLocation18 = O02.photo.photo_small;
                                                                    fileLoader4.getClass();
                                                                    file2 = w7.K(fileLocation18, true);
                                                                }
                                                            }
                                                        }
                                                        if (i27 == 0) {
                                                            iconCompat = IconCompat.d(t0.b, R.drawable.ic_launcher_dr);
                                                        } else if (file2 != null && i28 >= 28) {
                                                            try {
                                                                iconCompat = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file2), new ps()));
                                                            } catch (Throwable unused4) {
                                                            }
                                                        }
                                                        j0Var6 = new e0.j0();
                                                        j0Var6.a = str22;
                                                        j0Var6.b = iconCompat;
                                                        j0Var6.c = null;
                                                        j0Var6.d = null;
                                                        c10 = 0;
                                                        j0Var6.e = false;
                                                        j0Var6.f = false;
                                                        hVar.k(j0Var6, j18);
                                                    }
                                                    iconCompat = null;
                                                    j0Var6 = new e0.j0();
                                                    j0Var6.a = str22;
                                                    j0Var6.b = iconCompat;
                                                    j0Var6.c = null;
                                                    j0Var6.d = null;
                                                    c10 = 0;
                                                    j0Var6.e = false;
                                                    j0Var6.f = false;
                                                    hVar.k(j0Var6, j18);
                                                } else {
                                                    j19 = j35;
                                                    j20 = j13;
                                                    c10 = 0;
                                                }
                                                if (n5.C(j20)) {
                                                    hVar8 = hVar;
                                                    xVar4 = xVar3;
                                                    e0.w wVar2 = new e0.w(str21, fjVar6.k.date * 1000, j0Var6);
                                                    ArrayList arrayList27 = xVar4.e;
                                                    arrayList27.add(wVar2);
                                                    if (arrayList27.size() > 25) {
                                                        arrayList27.remove(0);
                                                    }
                                                } else {
                                                    if (!zArr[c10] || Build.VERSION.SDK_INT < 28 || ((ActivityManager) t0.b.getSystemService("activity")).isLowRamDevice() || z17 || fjVar6.l4() || !(fjVar6.D == 1 || fjVar6.t4())) {
                                                        hVar8 = hVar;
                                                    } else {
                                                        w7 fileLoader5 = xsVar.getFileLoader();
                                                        TLRPC.Message message2 = fjVar6.k;
                                                        fileLoader5.getClass();
                                                        File L2 = w7.L(message2);
                                                        if (L2.exists() && fjVar6.t2()) {
                                                            File file4 = new File(L2.getParentFile(), L2.getName() + ".blur.jpg");
                                                            if (file4.exists()) {
                                                                hVar8 = hVar;
                                                            } else {
                                                                try {
                                                                    Bitmap decodeFile = BitmapFactory.decodeFile(L2.getAbsolutePath());
                                                                    Bitmap C2 = Utilities.C(decodeFile);
                                                                    decodeFile.recycle();
                                                                    createScaledBitmap = Bitmap.createScaledBitmap(C2, decodeFile.getWidth(), decodeFile.getHeight(), true);
                                                                    Utilities.stackBlurBitmap(createScaledBitmap, 5);
                                                                    C2.recycle();
                                                                    canvas = new Canvas(createScaledBitmap);
                                                                    xsVar.g0.h(i0.a.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                                                                    hVar8 = hVar;
                                                                } catch (Exception e11) {
                                                                    e = e11;
                                                                    hVar8 = hVar;
                                                                }
                                                                try {
                                                                    xsVar.g0.setBounds(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                                                                    xsVar.g0.draw(canvas);
                                                                    FileOutputStream fileOutputStream = new FileOutputStream(file4);
                                                                    createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                                                    fileOutputStream.close();
                                                                    createScaledBitmap.recycle();
                                                                    file3 = file4;
                                                                    L2 = file3;
                                                                } catch (Exception e13) {
                                                                    e = e13;
                                                                    a8.f(e);
                                                                    file3 = file4;
                                                                    e0.w wVar3 = new e0.w(str21, fjVar6.k.date * 1000, j0Var6);
                                                                    String str23 = !fjVar6.t4() ? "image/webp" : "image/jpeg";
                                                                    if (L2.exists()) {
                                                                    }
                                                                    if (d != null) {
                                                                    }
                                                                    xVar4 = xVar3;
                                                                    e0.w wVar4 = new e0.w(str21, fjVar6.k.date * 1000, j0Var6);
                                                                    arrayList9 = xVar4.e;
                                                                    arrayList9.add(wVar4);
                                                                    if (arrayList9.size() > 25) {
                                                                    }
                                                                    c11 = 0;
                                                                    if (zArr[c11]) {
                                                                    }
                                                                    if (j20 == 777000) {
                                                                    }
                                                                    arrayList7 = arrayList25;
                                                                    i46 = i48;
                                                                    size6 = i47 - 1;
                                                                    xVar = xVar4;
                                                                    hVar = hVar8;
                                                                    str18 = str13;
                                                                    arrayList3 = arrayList26;
                                                                    fjVar = fjVar7;
                                                                    strArr22 = strArr;
                                                                    zArr22 = zArr;
                                                                    sb52 = sb3;
                                                                    j15 = j19;
                                                                    j13 = j20;
                                                                    arrayList24 = arrayList7;
                                                                }
                                                            }
                                                            file3 = file4;
                                                        } else {
                                                            hVar8 = hVar;
                                                            file3 = null;
                                                        }
                                                        e0.w wVar32 = new e0.w(str21, fjVar6.k.date * 1000, j0Var6);
                                                        String str232 = !fjVar6.t4() ? "image/webp" : "image/jpeg";
                                                        if (L2.exists()) {
                                                            if (xsVar.getFileLoader().S(L2.getName())) {
                                                                Uri.Builder scheme = new Uri.Builder().scheme("content");
                                                                if (NotificationImageProvider.d == null) {
                                                                    t0.d();
                                                                    NotificationImageProvider.d = "org.telegram.messenger.beta.notification_image_provider";
                                                                }
                                                                d = scheme.authority(NotificationImageProvider.d).appendPath("msg_media_raw").appendPath(xsVar.currentAccount + "").appendPath(L2.getName()).appendQueryParameter("final_path", L2.getAbsolutePath()).build();
                                                            }
                                                            d = null;
                                                        } else {
                                                            try {
                                                                Context context = t0.b;
                                                                StringBuilder sb7 = new StringBuilder();
                                                                t0.d();
                                                                sb7.append("org.telegram.messenger.beta");
                                                                sb7.append(".provider");
                                                                d = FileProvider.d(context, sb7.toString(), L2);
                                                            } catch (Exception e14) {
                                                                a8.f(e14);
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
                                                            g0.h3(new rq(14, d, file3), 20000L);
                                                            if (!TextUtils.isEmpty(fjVar6.z)) {
                                                                e0.w wVar5 = new e0.w(fjVar6.z, fjVar6.k.date * 1000, j0Var6);
                                                                ArrayList arrayList29 = xVar4.e;
                                                                arrayList29.add(wVar5);
                                                                if (arrayList29.size() > 25) {
                                                                    arrayList29.remove(0);
                                                                }
                                                            }
                                                            c11 = 0;
                                                            if (zArr[c11] && !z17 && fjVar6.P4()) {
                                                                arrayList8 = (ArrayList) xVar4.d();
                                                                if (!arrayList8.isEmpty()) {
                                                                    w7 fileLoader6 = xsVar.getFileLoader();
                                                                    TLRPC.Message message3 = fjVar6.k;
                                                                    fileLoader6.getClass();
                                                                    File L3 = w7.L(message3);
                                                                    if (L3.exists()) {
                                                                        if (Build.VERSION.SDK_INT >= 24) {
                                                                            try {
                                                                                Context context2 = t0.b;
                                                                                StringBuilder sb8 = new StringBuilder();
                                                                                t0.d();
                                                                                sb8.append("org.telegram.messenger.beta");
                                                                                sb8.append(".provider");
                                                                                uri2 = FileProvider.d(context2, sb8.toString(), L3);
                                                                            } catch (Exception unused5) {
                                                                                uri2 = null;
                                                                            }
                                                                        } else {
                                                                            uri2 = Uri.fromFile(L3);
                                                                        }
                                                                        if (uri2 != null) {
                                                                            e0.w wVar6 = (e0.w) i5.c.h(1, arrayList8);
                                                                            wVar6.e = "audio/ogg";
                                                                            wVar6.f = uri2;
                                                                        }
                                                                    } else if (fjVar6.F0() != null) {
                                                                        String s5 = w7.s(fjVar6.F0());
                                                                        if (!xsVar.s.contains(s5)) {
                                                                            xsVar.s.add(s5);
                                                                            xsVar.getFileLoader().W(fjVar6.F0(), fjVar6, 3, 0);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    xVar4 = xVar3;
                                                    e0.w wVar42 = new e0.w(str21, fjVar6.k.date * 1000, j0Var6);
                                                    arrayList9 = xVar4.e;
                                                    arrayList9.add(wVar42);
                                                    if (arrayList9.size() > 25) {
                                                        c11 = 0;
                                                        arrayList9.remove(0);
                                                        if (zArr[c11]) {
                                                            arrayList8 = (ArrayList) xVar4.d();
                                                            if (!arrayList8.isEmpty()) {
                                                            }
                                                        }
                                                    }
                                                    c11 = 0;
                                                    if (zArr[c11]) {
                                                    }
                                                }
                                                if (j20 == 777000) {
                                                    TLRPC.ReplyMarkup replyMarkup2 = fjVar6.k.reply_markup;
                                                    if (replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) {
                                                        arrayList7 = ((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows;
                                                        i46 = fjVar6.e1();
                                                        size6 = i47 - 1;
                                                        xVar = xVar4;
                                                        hVar = hVar8;
                                                        str18 = str13;
                                                        arrayList3 = arrayList26;
                                                        fjVar = fjVar7;
                                                        strArr22 = strArr;
                                                        zArr22 = zArr;
                                                        sb52 = sb3;
                                                        j15 = j19;
                                                        j13 = j20;
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
                                                fjVar = fjVar7;
                                                strArr22 = strArr;
                                                zArr22 = zArr;
                                                sb52 = sb3;
                                                j15 = j19;
                                                j13 = j20;
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
                                        fjVar = fjVar7;
                                        strArr22 = strArr;
                                        zArr22 = zArr;
                                        sb52 = sb3;
                                        j15 = j19;
                                        j13 = j20;
                                        arrayList24 = arrayList7;
                                    }
                                    arrayList5 = arrayList3;
                                    fjVar2 = fjVar;
                                    bitmap3 = bitmap2;
                                    str12 = str8;
                                    arrayList6 = arrayList24;
                                    i25 = i46;
                                    sb2 = sb52;
                                    j16 = j13;
                                    j17 = j15;
                                    xVar2 = xVar;
                                }
                                a0.h hVar132 = hVar;
                                Intent intent32 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                                intent32.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent32.setFlags(67108864);
                                intent32.addCategory("android.intent.category.LAUNCHER");
                                fjVar3 = fjVar2;
                                if (fjVar2 == null && fjVar3.O) {
                                    intent32.putExtra("oauth_url", fjVar3.b);
                                } else if (fjVar3 == null && fjVar3.J) {
                                    intent32.putExtra("storyId", Math.abs(fjVar3.e1()));
                                } else {
                                    if (fjVar3 == null && fjVar3.N) {
                                        if (j16 < 0) {
                                            j21 = j16;
                                            intent32.putExtra("chatId", -j21);
                                        } else {
                                            j21 = j16;
                                            if (j16 > 0) {
                                                intent32.putExtra("userId", j21);
                                            }
                                        }
                                        intent32.putExtra("storyId", Math.abs(fjVar3.e1()));
                                    } else {
                                        j21 = j16;
                                        if (vsVar3.c) {
                                            long[] jArr2 = new long[xsVar.E.size()];
                                            for (int i51 = 0; i51 < xsVar.E.size(); i51++) {
                                                jArr2[i51] = ((ws) xsVar.E.get(i51)).a;
                                            }
                                            intent32.putExtra("storyDialogIds", jArr2);
                                        } else if (n5.C(j21)) {
                                            intent32.putExtra("encId", n5.h(j21));
                                        } else if (n5.E(j21)) {
                                            intent32.putExtra("userId", j21);
                                        } else {
                                            intent32.putExtra("chatId", -j21);
                                        }
                                    }
                                    j22 = j17;
                                    i5.c.v(j22, a8.p0.t(j21, "show extra notifications chatId ", " topicId "));
                                    if (j22 != 0) {
                                        intent32.putExtra("topicId", j22);
                                    }
                                    String str162 = str11;
                                    intent32.putExtra(str162, xsVar.currentAccount);
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
                                    intent42.putExtra("dialog_id", j21);
                                    intent42.putExtra(str10, i42);
                                    intent42.putExtra(str162, xsVar.currentAccount);
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList192 = arrayList6;
                                    bitmap4 = bitmap3;
                                    e0.g gVar22 = new e0.g(R.drawable.msg_markread, PendingIntent.getBroadcast(t0.b, num2.intValue(), intent42, 167772160), gd.M0(2131748488));
                                    gVar22.a = 2;
                                    gVar22.c = false;
                                    e0.h b122 = gVar22.b();
                                    if (!n5.C(j21)) {
                                        hVar9 = hVar142;
                                        str14 = j21 != o0 ? "tgenc" + n5.h(j21) + "_" + i42 : null;
                                    } else if (n5.E(j21)) {
                                        str14 = "tguser" + j21 + "_" + i42;
                                        hVar9 = hVar142;
                                    } else {
                                        StringBuilder sb9 = new StringBuilder("tgchat");
                                        hVar9 = hVar142;
                                        sb9.append(-j21);
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
                                    long j312 = j14;
                                    sb62.append(j312);
                                    d0Var2.b(sb62.toString());
                                    if (vsVar3.c) {
                                        hVar10 = b122;
                                        j14 = j312;
                                        arrayList10 = arrayList5;
                                        j23 = ((fj) arrayList10.get(0)).k.date * 1000;
                                    } else {
                                        j14 = j312;
                                        j23 = Long.MAX_VALUE;
                                        int i52 = 0;
                                        while (i52 < xsVar.E.size()) {
                                            j23 = Math.min(((ws) xsVar.E.get(i52)).e, j23);
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
                                    qVar22.i = !vsVar3.c ? xsVar.E.size() : arrayList202.size();
                                    qVar22.w = -15618822;
                                    qVar22.r = false;
                                    qVar22.F.when = j23;
                                    qVar22.k = true;
                                    qVar22.n(xVar2);
                                    qVar22.g = activity2;
                                    qVar22.c(d0Var2);
                                    qVar22.l(String.valueOf(Long.MAX_VALUE - j23));
                                    qVar22.h(8, (z12 && j21 == j3 && j22 == j10) ? false : true);
                                    qVar22.u = "msg";
                                    intent = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                    intent.putExtra("messageDate", i17);
                                    intent.putExtra("dialogId", j21);
                                    intent.putExtra(str162, xsVar.currentAccount);
                                    if (vsVar3.c) {
                                        intent.putExtra("story", true);
                                    }
                                    if (fjVar3 != null && fjVar3.J) {
                                        intent.putExtra("storyReaction", true);
                                    }
                                    qVar22.F.deleteIntent = PendingIntent.getBroadcast(t0.b, num2.intValue(), intent, 167772160);
                                    if (z18) {
                                        qVar22.q = xsVar.f0;
                                        qVar22.i();
                                    }
                                    if (fjVar3 != null && (message = fjVar3.k) != null) {
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
                                                    TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy2 = (TL_keyboard.TL_inlineButtonTypeCopy) cg.c.a(keyboardInlineButton3, TL_keyboard.TL_inlineButtonTypeCopy.class);
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
                                            j24 = vsVar3.a;
                                            if (j24 != 489000 && j24 != 489001) {
                                                if (hVar9 != null) {
                                                    qVar22.b.add(hVar9);
                                                }
                                                if (!z17 && !vsVar3.c && (fjVar3 == null || !fjVar3.J)) {
                                                    qVar22.b.add(hVar10);
                                                }
                                            }
                                            if (arrayList15.size() != 1 && !TextUtils.isEmpty(str) && !vsVar3.c) {
                                                qVar22.o(str);
                                            }
                                            if (n5.C(j21)) {
                                                qVar22.k();
                                            }
                                            if (bitmap4 != null) {
                                                qVar22.j(bitmap4);
                                            }
                                            if (!g0.p2(false) && !bz.C && arrayList192 != null) {
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
                                                        TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) cg.c.a(keyboardInlineButton4, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                        int i57 = i55;
                                                        if (tL_inlineButtonTypeCallback != null) {
                                                            Intent intent6 = new Intent(t0.b, (Class<?>) NotificationCallbackReceiver.class);
                                                            intent6.putExtra(str162, xsVar.currentAccount);
                                                            intent6.putExtra("did", j21);
                                                            byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                            if (bArr != null) {
                                                                intent6.putExtra("data", bArr);
                                                            }
                                                            intent6.putExtra("mid", i442);
                                                            String str24 = keyboardInlineButton4.text;
                                                            Context context3 = t0.b;
                                                            int i58 = xsVar.I;
                                                            xsVar.I = i58 + 1;
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
                                            a8.b("showExtraNotifications: holders.add " + j21);
                                            notification3 = notification42;
                                            z18 = z272;
                                            long j322 = j21;
                                            hVar6 = hVar132;
                                            us usVar2 = new us(xsVar, num2.intValue(), j322, vsVar3.c, str12, user7, chat2, qVar22, j10, str2, jArr, i7, uri, i10, z10, z11, z12, i11);
                                            arrayList4 = arrayList;
                                            arrayList4.add(usVar2);
                                            xsVar.h.k(num2, j322);
                                            i32 = i16 + 1;
                                            arrayList = arrayList4;
                                            arrayList12 = arrayList15;
                                            z14 = z18;
                                            z15 = z17;
                                            size = i14;
                                            hVar11 = hVar4;
                                            hVar12 = hVar5;
                                            d2 = sharedPreferences;
                                            e10 = j14;
                                            b11 = notification3;
                                            hVar = hVar6;
                                        }
                                    }
                                    keyboardInlineButton = null;
                                    tL_inlineButtonTypeCopy = null;
                                    if (keyboardInlineButton != null) {
                                    }
                                    j24 = vsVar3.a;
                                    if (j24 != 489000) {
                                        if (hVar9 != null) {
                                        }
                                        if (!z17) {
                                            qVar22.b.add(hVar10);
                                        }
                                    }
                                    if (arrayList15.size() != 1) {
                                    }
                                    if (n5.C(j21)) {
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
                                    a8.b("showExtraNotifications: holders.add " + j21);
                                    notification3 = notification422;
                                    z18 = z2722;
                                    long j3222 = j21;
                                    hVar6 = hVar132;
                                    us usVar22 = new us(xsVar, num2.intValue(), j3222, vsVar3.c, str12, user7, chat2, qVar22, j10, str2, jArr, i7, uri, i10, z10, z11, z12, i11);
                                    arrayList4 = arrayList;
                                    arrayList4.add(usVar22);
                                    xsVar.h.k(num2, j3222);
                                    i32 = i16 + 1;
                                    arrayList = arrayList4;
                                    arrayList12 = arrayList15;
                                    z14 = z18;
                                    z15 = z17;
                                    size = i14;
                                    hVar11 = hVar4;
                                    hVar12 = hVar5;
                                    d2 = sharedPreferences;
                                    e10 = j14;
                                    b11 = notification3;
                                    hVar = hVar6;
                                }
                                j21 = j16;
                                j22 = j17;
                                i5.c.v(j22, a8.p0.t(j21, "show extra notifications chatId ", " topicId "));
                                if (j22 != 0) {
                                }
                                String str1622 = str11;
                                intent32.putExtra(str1622, xsVar.currentAccount);
                                PendingIntent activity22 = PendingIntent.getActivity(t0.b, 0, intent32, 1140850688);
                                e0.d0 d0Var22 = new e0.d0();
                                e0.h hVar1422 = hVar7;
                                if (hVar7 != null) {
                                }
                                int i4422 = i25;
                                Intent intent422 = new Intent(t0.b, (Class<?>) AutoMessageHeardReceiver.class);
                                intent422.addFlags(i15);
                                intent422.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                intent422.putExtra("dialog_id", j21);
                                intent422.putExtra(str10, i42);
                                intent422.putExtra(str1622, xsVar.currentAccount);
                                ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList1922 = arrayList6;
                                bitmap4 = bitmap3;
                                e0.g gVar222 = new e0.g(R.drawable.msg_markread, PendingIntent.getBroadcast(t0.b, num2.intValue(), intent422, 167772160), gd.M0(2131748488));
                                gVar222.a = 2;
                                gVar222.c = false;
                                e0.h b1222 = gVar222.b();
                                if (!n5.C(j21)) {
                                }
                                if (str14 == null) {
                                }
                                StringBuilder sb622 = new StringBuilder("tgaccount");
                                long j3122 = j14;
                                sb622.append(j3122);
                                d0Var22.b(sb622.toString());
                                if (vsVar3.c) {
                                }
                                e0.q qVar222 = new e0.q(t0.b);
                                qVar222.g(str12);
                                ArrayList arrayList2022 = arrayList10;
                                qVar222.F.icon = R.drawable.notification;
                                qVar222.f(sb2.toString());
                                qVar222.h(16, true);
                                qVar222.i = !vsVar3.c ? xsVar.E.size() : arrayList2022.size();
                                qVar222.w = -15618822;
                                qVar222.r = false;
                                qVar222.F.when = j23;
                                qVar222.k = true;
                                qVar222.n(xVar2);
                                qVar222.g = activity22;
                                qVar222.c(d0Var22);
                                qVar222.l(String.valueOf(Long.MAX_VALUE - j23));
                                qVar222.h(8, (z12 && j21 == j3 && j22 == j10) ? false : true);
                                qVar222.u = "msg";
                                intent = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                intent.putExtra("messageDate", i17);
                                intent.putExtra("dialogId", j21);
                                intent.putExtra(str1622, xsVar.currentAccount);
                                if (vsVar3.c) {
                                }
                                if (fjVar3 != null) {
                                    intent.putExtra("storyReaction", true);
                                }
                                qVar222.F.deleteIntent = PendingIntent.getBroadcast(t0.b, num2.intValue(), intent, 167772160);
                                if (z18) {
                                }
                                if (fjVar3 != null) {
                                    replyMarkup = message.reply_markup;
                                    if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                    }
                                }
                                keyboardInlineButton = null;
                                tL_inlineButtonTypeCopy = null;
                                if (keyboardInlineButton != null) {
                                }
                                j24 = vsVar3.a;
                                if (j24 != 489000) {
                                }
                                if (arrayList15.size() != 1) {
                                }
                                if (n5.C(j21)) {
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
                                a8.b("showExtraNotifications: holders.add " + j21);
                                notification3 = notification4222;
                                z18 = z27222;
                                long j32222 = j21;
                                hVar6 = hVar132;
                                us usVar222 = new us(xsVar, num2.intValue(), j32222, vsVar3.c, str12, user7, chat2, qVar222, j10, str2, jArr, i7, uri, i10, z10, z11, z12, i11);
                                arrayList4 = arrayList;
                                arrayList4.add(usVar222);
                                xsVar.h.k(num2, j32222);
                                i32 = i16 + 1;
                                arrayList = arrayList4;
                                arrayList12 = arrayList15;
                                z14 = z18;
                                z15 = z17;
                                size = i14;
                                hVar11 = hVar4;
                                hVar12 = hVar5;
                                d2 = sharedPreferences;
                                e10 = j14;
                                b11 = notification3;
                                hVar = hVar6;
                            }
                        }
                    }
                    j15 = j12;
                    e0.j0 j0Var422 = j0Var2;
                    if (j0Var422 == null) {
                    }
                    i24 = Build.VERSION.SDK_INT;
                    if (i24 >= 28) {
                    }
                    xVar.f(format);
                    xVar.i = Boolean.valueOf(i24 >= 28 || (!z21 && n5.z(j13)) || n10.z(j13));
                    StringBuilder sb522 = new StringBuilder();
                    String[] strArr222 = new String[1];
                    boolean[] zArr222 = new boolean[1];
                    if (vsVar3.c) {
                    }
                    a0.h hVar1322 = hVar;
                    Intent intent322 = new Intent(t0.b, (Class<?>) LaunchActivity.class);
                    intent322.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    intent322.setFlags(67108864);
                    intent322.addCategory("android.intent.category.LAUNCHER");
                    fjVar3 = fjVar2;
                    if (fjVar2 == null) {
                    }
                    if (fjVar3 == null) {
                    }
                    if (fjVar3 == null) {
                    }
                    j21 = j16;
                    if (vsVar3.c) {
                    }
                    j22 = j17;
                    i5.c.v(j22, a8.p0.t(j21, "show extra notifications chatId ", " topicId "));
                    if (j22 != 0) {
                    }
                    String str16222 = str11;
                    intent322.putExtra(str16222, xsVar.currentAccount);
                    PendingIntent activity222 = PendingIntent.getActivity(t0.b, 0, intent322, 1140850688);
                    e0.d0 d0Var222 = new e0.d0();
                    e0.h hVar14222 = hVar7;
                    if (hVar7 != null) {
                    }
                    int i44222 = i25;
                    Intent intent4222 = new Intent(t0.b, (Class<?>) AutoMessageHeardReceiver.class);
                    intent4222.addFlags(i15);
                    intent4222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                    intent4222.putExtra("dialog_id", j21);
                    intent4222.putExtra(str10, i42);
                    intent4222.putExtra(str16222, xsVar.currentAccount);
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList19222 = arrayList6;
                    bitmap4 = bitmap3;
                    e0.g gVar2222 = new e0.g(R.drawable.msg_markread, PendingIntent.getBroadcast(t0.b, num2.intValue(), intent4222, 167772160), gd.M0(2131748488));
                    gVar2222.a = 2;
                    gVar2222.c = false;
                    e0.h b12222 = gVar2222.b();
                    if (!n5.C(j21)) {
                    }
                    if (str14 == null) {
                    }
                    StringBuilder sb6222 = new StringBuilder("tgaccount");
                    long j31222 = j14;
                    sb6222.append(j31222);
                    d0Var222.b(sb6222.toString());
                    if (vsVar3.c) {
                    }
                    e0.q qVar2222 = new e0.q(t0.b);
                    qVar2222.g(str12);
                    ArrayList arrayList20222 = arrayList10;
                    qVar2222.F.icon = R.drawable.notification;
                    qVar2222.f(sb2.toString());
                    qVar2222.h(16, true);
                    qVar2222.i = !vsVar3.c ? xsVar.E.size() : arrayList20222.size();
                    qVar2222.w = -15618822;
                    qVar2222.r = false;
                    qVar2222.F.when = j23;
                    qVar2222.k = true;
                    qVar2222.n(xVar2);
                    qVar2222.g = activity222;
                    qVar2222.c(d0Var222);
                    qVar2222.l(String.valueOf(Long.MAX_VALUE - j23));
                    qVar2222.h(8, (z12 && j21 == j3 && j22 == j10) ? false : true);
                    qVar2222.u = "msg";
                    intent = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                    intent.putExtra("messageDate", i17);
                    intent.putExtra("dialogId", j21);
                    intent.putExtra(str16222, xsVar.currentAccount);
                    if (vsVar3.c) {
                    }
                    if (fjVar3 != null) {
                    }
                    qVar2222.F.deleteIntent = PendingIntent.getBroadcast(t0.b, num2.intValue(), intent, 167772160);
                    if (z18) {
                    }
                    if (fjVar3 != null) {
                    }
                    keyboardInlineButton = null;
                    tL_inlineButtonTypeCopy = null;
                    if (keyboardInlineButton != null) {
                    }
                    j24 = vsVar3.a;
                    if (j24 != 489000) {
                    }
                    if (arrayList15.size() != 1) {
                    }
                    if (n5.C(j21)) {
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
                    a8.b("showExtraNotifications: holders.add " + j21);
                    notification3 = notification42222;
                    z18 = z272222;
                    long j322222 = j21;
                    hVar6 = hVar1322;
                    us usVar2222 = new us(xsVar, num2.intValue(), j322222, vsVar3.c, str12, user7, chat2, qVar2222, j10, str2, jArr, i7, uri, i10, z10, z11, z12, i11);
                    arrayList4 = arrayList;
                    arrayList4.add(usVar2222);
                    xsVar.h.k(num2, j322222);
                    i32 = i16 + 1;
                    arrayList = arrayList4;
                    arrayList12 = arrayList15;
                    z14 = z18;
                    z15 = z17;
                    size = i14;
                    hVar11 = hVar4;
                    hVar12 = hVar5;
                    d2 = sharedPreferences;
                    e10 = j14;
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
                    if (xsVar.y.isEmpty()) {
                        if (s2.a) {
                            i5.c.t(xsVar.e0, new StringBuilder("cancel summary with id "));
                        }
                        str3 = null;
                        m0.b(xsVar.e0, null);
                        i12 = 0;
                        while (i12 < hVar2.m()) {
                            a0.h hVar16 = hVar2;
                            if (!xsVar.y.contains(Long.valueOf(hVar16.j(i12)))) {
                                Integer num5 = (Integer) hVar16.n(i12);
                                if (s2.a) {
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
                            us usVar3 = (us) arrayList33.get(i13);
                            arrayList32.clear();
                            int i59 = Build.VERSION.SDK_INT;
                            if (i59 < 29 || n5.C(usVar3.b)) {
                                hVar3 = hVar15;
                            } else {
                                e0.q qVar3 = usVar3.g;
                                long j36 = usVar3.b;
                                hVar3 = hVar15;
                                String j37 = xsVar.j(qVar3, j36, usVar3.d, usVar3.e, usVar3.f, (e0.j0) hVar3.f(j36), !usVar3.c);
                                if (j37 != null) {
                                    arrayList32.add(j37);
                                }
                            }
                            a8.b("showExtraNotifications: holders[" + i13 + "].call()");
                            usVar3.a();
                            if (i59 >= 29 && bz.q0 && !arrayList32.isEmpty()) {
                                g0.g.o(t0.b, arrayList32);
                            }
                            i13++;
                            xsVar = this;
                            arrayList2 = arrayList33;
                            hVar15 = hVar3;
                        }
                    }
                } else {
                    if (s2.a) {
                        i5.c.t(xsVar.e0, new StringBuilder("show summary with id "));
                    }
                    try {
                        m0.d(xsVar.e0, notification5);
                        arrayList2 = arrayList31;
                    } catch (SecurityException e15) {
                        a8.f(e15);
                        arrayList2 = arrayList31;
                        xsVar.P(qVar, j3, j10, str2, jArr, i7, uri, i10, z10, z11, z12, i11);
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
        e10 = xsVar.getUserConfig().e();
        if (g0.o2()) {
        }
        if (bz.s.length() <= 0) {
        }
        a8.b("showExtraNotifications: passcode=" + (bz.s.length() <= 0) + " waitingForPasscode=" + z15 + " selfUserId=" + e10 + " useSummaryNotification=" + z14);
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
            d2 = sharedPreferences;
            e10 = j14;
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
        l0.c(new ls(this, 3));
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
    /* JADX WARN: Type inference failed for: r53v0, types: [org.telegram.messenger.c1, org.telegram.messenger.xs] */
    /* JADX WARN: Type inference failed for: r5v83, types: [org.telegram.messenger.fj] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(boolean z10) {
        long j3;
        long j10;
        fj fjVar;
        Bitmap bitmap;
        String str;
        long j11;
        long j12;
        String str2;
        String str3;
        long j13;
        TLRPC.Chat chat;
        boolean z11;
        long j14;
        long j15;
        long j16;
        long j17;
        TLRPC.Chat chat2;
        boolean z12;
        boolean z13;
        boolean z14;
        String M0;
        boolean z15;
        String str4;
        String M02;
        boolean z16;
        boolean z17;
        Bitmap bitmap2;
        boolean z18;
        String str5;
        SharedPreferences sharedPreferences;
        long j18;
        String x10;
        boolean z19;
        String str6;
        boolean z20;
        String str7;
        boolean z21;
        boolean z22;
        String str8;
        SharedPreferences sharedPreferences2;
        long j19;
        boolean z23;
        boolean z24;
        String str9;
        String str10;
        boolean z25;
        long j20;
        long j21;
        Integer num;
        int i7;
        boolean z26;
        String str11;
        int i10;
        boolean z27;
        long j22;
        String str12;
        long j23;
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
        if (!getUserConfig().p() || ((this.a.isEmpty() && this.E.isEmpty()) || !(bz.Q0 || this.currentAccount == i10.t0))) {
            p();
            return;
        }
        try {
            getConnectionsManager().resumeNetworkMaybe();
            long j24 = 0;
            ws wsVar = null;
            for (int i33 = 0; i33 < this.a.size(); i33++) {
                ?? r52 = (fj) this.a.get(i33);
                long j25 = r52.k.date;
                if (j24 < j25) {
                    wsVar = r52;
                    j24 = j25;
                }
            }
            for (int i34 = 0; i34 < this.E.size(); i34++) {
                ws wsVar2 = (ws) this.E.get(i34);
                long j26 = wsVar2.e;
                if (j24 < j26 / 1000) {
                    wsVar = wsVar2;
                    j24 = j26 / 1000;
                }
            }
            if (wsVar == null) {
                return;
            }
            if (wsVar instanceof ws) {
                ws wsVar3 = wsVar;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                boolean z42 = false;
                int i35 = 0;
                j3 = 1000;
                for (int i36 = 0; i36 < this.E.size(); i36++) {
                    z42 |= ((ws) this.E.get(i36)).d;
                    tL_message.date = Math.min(tL_message.date, (int) (((ws) this.E.get(i36)).e / 1000));
                    i35 += ((ws) this.E.get(i36)).c.size();
                }
                j10 = 0;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                long j27 = wsVar3.a;
                tL_peerUser.user_id = j27;
                tL_message.dialog_id = j27;
                tL_message.peer_id = tL_peerUser;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                I(arrayList, arrayList2);
                Bitmap F = bz.o() >= 1 ? F(arrayList2) : null;
                if (!z42 && this.E.size() < 2 && !arrayList.isEmpty()) {
                    G = (String) arrayList.get(0);
                    String str17 = G;
                    if (!z42) {
                        tL_message.message = gd.G(i35, "StoryNotificationHidden", new Object[0]);
                    } else if (arrayList.isEmpty()) {
                        tL_message.message = "";
                    } else if (arrayList.size() == 1) {
                        if (i35 == 1) {
                            tL_message.message = gd.O0("StoryNotificationSingle");
                        } else {
                            tL_message.message = gd.G(i35, "StoryNotification1", arrayList.get(0));
                        }
                    } else if (arrayList.size() == 2) {
                        tL_message.message = gd.Z(2131744358, arrayList.get(0), arrayList.get(1));
                    } else if (arrayList.size() == 3 && this.E.size() == 3) {
                        tL_message.message = gd.Z(2131744357, k((String) arrayList.get(0)), k((String) arrayList.get(1)), k((String) arrayList.get(2)));
                    } else {
                        tL_message.message = gd.G(this.E.size() - 2, "StoryNotification4", k((String) arrayList.get(0)), k((String) arrayList.get(1)));
                    }
                    fj fjVar2 = new fj(this.currentAccount, tL_message, tL_message.message, str17, str17, false, false, false, false);
                    fjVar2.K = true;
                    fjVar = fjVar2;
                    bitmap = F;
                }
                G = gd.G(i35, "Stories", new Object[0]);
                String str172 = G;
                if (!z42) {
                }
                fj fjVar22 = new fj(this.currentAccount, tL_message, tL_message.message, str172, str172, false, false, false, false);
                fjVar22.K = true;
                fjVar = fjVar22;
                bitmap = F;
            } else {
                j3 = 1000;
                j10 = 0;
                fjVar = (fj) this.a.get(0);
                bitmap = null;
            }
            SharedPreferences d = getAccountInstance().d();
            int i37 = d.getInt("dismissDate", 0);
            if (!fjVar.K && fjVar.k.date <= i37) {
                p();
                return;
            }
            long A0 = fjVar.A0();
            long a22 = fj.a2(this.currentAccount, fjVar.k, getMessagesController().z2(fjVar));
            boolean z43 = fjVar.K;
            if (fjVar.k.mentioned) {
                str = "";
                j11 = fjVar.Z0();
            } else {
                str = "";
                j11 = A0;
            }
            fjVar.e1();
            TLRPC.Peer peer = fjVar.k.peer_id;
            long j28 = peer.chat_id;
            if (j28 == j10) {
                j28 = peer.channel_id;
            }
            long j29 = j11;
            long j30 = peer.user_id;
            if (fjVar.p3() && (j30 == j10 || j30 == getUserConfig().e())) {
                j30 = fjVar.k.from_id.user_id;
            }
            if (fjVar.A0() == 489000 && fjVar.W0() != null) {
                if (fjVar.W0().longValue() >= j10) {
                    j30 = fjVar.W0().longValue();
                    j28 = j10;
                } else {
                    j28 = fjVar.W0().longValue();
                    j30 = j10;
                }
            }
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j30));
            if (j28 != j10) {
                j12 = j28;
                chat = getMessagesController().O0(Long.valueOf(j12));
                z11 = (chat == null && fjVar.i3()) ? fjVar.f : v3.T(chat) && !chat.megagroup;
                str2 = "file://";
                str3 = "currentAccount";
                j13 = j29;
            } else {
                j12 = j28;
                str2 = "file://";
                str3 = "currentAccount";
                j13 = j29;
                chat = null;
                z11 = false;
            }
            int u10 = u(j13, a22);
            if (u10 == -1) {
                Boolean valueOf = Boolean.valueOf(z11);
                boolean z44 = fjVar.I;
                j15 = j13;
                j14 = a22;
                j17 = j12;
                chat2 = chat;
                z12 = D(A0, valueOf, z44, z44);
                j16 = A0;
            } else {
                j14 = a22;
                j15 = j13;
                j16 = A0;
                j17 = j12;
                chat2 = chat;
                z12 = u10 != 2;
            }
            String y10 = (((j28 == j10 || chat2 != null) && c22 != null) || !fjVar.i3()) ? chat2 != null ? y(chat2) : n10.q(c22) : fjVar.b;
            if (!g0.o2() && !bz.C) {
                z13 = false;
                String str18 = y10;
                boolean equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                if (n5.C(j16)) {
                    if (equalsIgnoreCase) {
                        z14 = equalsIgnoreCase;
                    } else {
                        z14 = equalsIgnoreCase;
                        if (this.f.m() <= 1) {
                        }
                    }
                    if (!z13) {
                        M0 = str18;
                        z15 = true;
                        if (!fjVar.I && !fjVar.J) {
                            str4 = M0;
                            M02 = str4;
                            if (z14) {
                                z16 = z15;
                                if (i10.c() <= 1) {
                                    str5 = str;
                                } else if (this.f.m() == 1) {
                                    str5 = n10.j(getUserConfig().f());
                                } else {
                                    str5 = n10.j(getUserConfig().f()) + "・";
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
                                        sb2.append(gd.G(this.J, "NewMessages", new Object[0]));
                                        str5 = sb2.toString();
                                    } else {
                                        bitmap2 = bitmap;
                                        str5 = str5 + gd.Z(2131747751, gd.G(this.J, "NewMessages", new Object[0]), gd.G(this.f.m(), "FromChats", new Object[0]));
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
                                sharedPreferences = d;
                                j18 = j30;
                                String str19 = str;
                                boolean[] zArr2 = new boolean[1];
                                x10 = x(fjVar, zArr2);
                                if (!fjVar.k.silent && !fjVar.I) {
                                    z19 = false;
                                    if (x10 != null) {
                                        return;
                                    }
                                    if (!z16) {
                                        str6 = x10;
                                    } else if (chat4 != null && !z14) {
                                        str6 = x10.replace(" @ " + M02, str19);
                                    } else if (zArr2[0]) {
                                        str6 = x10.replace(M02 + ": ", str19);
                                    } else {
                                        str6 = x10.replace(M02 + " ", str19);
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
                                lVar2.f(M02);
                                j18 = j30;
                                int min = Math.min(10, this.a.size());
                                boolean[] zArr3 = new boolean[1];
                                sharedPreferences = d;
                                int i38 = 0;
                                ?? r12 = 2;
                                String str20 = null;
                                String str21 = str;
                                while (i38 < min) {
                                    int i39 = min;
                                    fj fjVar3 = (fj) this.a.get(i38);
                                    int i40 = i38;
                                    String x11 = x(fjVar3, zArr3);
                                    if (x11 != null) {
                                        zArr = zArr3;
                                        if (fjVar3.K || fjVar3.k.date > i37) {
                                            r12 = r12;
                                            if (r12 == 2) {
                                                if (!fjVar3.k.silent && !fjVar3.I) {
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
                                                x11 = x11.replace(" @ " + M02, charSequence);
                                            } else {
                                                charSequence = str21;
                                                x11 = zArr[0] ? x11.replace(M02 + ": ", charSequence) : x11.replace(M02 + " ", charSequence);
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
                                if (z21 && j16 == j15 && chat4 != null) {
                                    sharedPreferences2 = sharedPreferences;
                                    boolean z45 = sharedPreferences2.getBoolean("custom_" + j16, false);
                                    int i41 = ks.K2;
                                    if (z45) {
                                        i32 = sharedPreferences2.getInt("smart_max_count_" + j16, 2);
                                        i41 = sharedPreferences2.getInt("smart_delay_" + j16, ks.K2);
                                    } else {
                                        i32 = 2;
                                    }
                                    if (i32 != 0) {
                                        Point point = (Point) this.e.f(j16);
                                        if (point == null) {
                                            this.e.k(new Point(1, (int) (SystemClock.elapsedRealtime() / j3)), j16);
                                        } else {
                                            z22 = z20;
                                            if (point.y + i41 < SystemClock.elapsedRealtime() / j3) {
                                                point.set(1, (int) (SystemClock.elapsedRealtime() / j3));
                                                str8 = str7;
                                            } else {
                                                int i42 = point.x;
                                                if (i42 < i32) {
                                                    str8 = str7;
                                                    point.set(i42 + 1, (int) (SystemClock.elapsedRealtime() / j3));
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
                                    j19 = j14;
                                    sb3.append(v(j16, j19, false));
                                    if (!sharedPreferences2.getBoolean(sb3.toString(), true)) {
                                        z23 = true;
                                        String path = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                        z24 = t0.x;
                                        boolean z46 = !z24;
                                        v(j16, j19, false);
                                        if (this.h0.e(j16, j19)) {
                                            long j31 = j16;
                                            z25 = z18;
                                            long j32 = j19;
                                            int c10 = this.h0.c(0, j31, j32, "vibrate_");
                                            int c11 = this.h0.c(3, j31, j32, "priority_");
                                            j21 = j31;
                                            str9 = x10;
                                            str10 = str8;
                                            long d2 = this.h0.d(j21, j32);
                                            if (d2 != j10) {
                                                str11 = getMediaDataController().A0.e(d2);
                                                z26 = true;
                                            } else {
                                                str11 = this.h0.f(j21, j32);
                                                z26 = false;
                                            }
                                            j20 = j32;
                                            int c12 = this.h0.c(0, j21, j20, "color_");
                                            num = c12 != 0 ? Integer.valueOf(c12) : null;
                                            i10 = c10;
                                            i7 = c11;
                                        } else {
                                            str9 = x10;
                                            str10 = str8;
                                            z25 = z18;
                                            j20 = j19;
                                            j21 = j16;
                                            num = null;
                                            i7 = 3;
                                            z26 = false;
                                            str11 = null;
                                            i10 = 0;
                                        }
                                        String str22 = str5;
                                        if (!fjVar.I || fjVar.J) {
                                            z27 = z23;
                                            j22 = j21;
                                            str12 = M02;
                                            j23 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                            if (j23 != 0) {
                                                string = getMediaDataController().A0.e(j23);
                                                z28 = true;
                                            } else {
                                                string = sharedPreferences2.getString("ReactionSoundPath", path);
                                                z28 = false;
                                            }
                                            int i43 = sharedPreferences2.getInt("vibrate_react", 0);
                                            int i44 = sharedPreferences2.getInt("priority_react", 1);
                                            int i45 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                            z29 = z28;
                                            i11 = fjVar.J ? 5 : 4;
                                            i12 = i45;
                                            i13 = i44;
                                            i14 = i43;
                                        } else if (j28 != j10) {
                                            if (z11) {
                                                z27 = z23;
                                                j22 = j21;
                                                long j33 = j10;
                                                str12 = M02;
                                                long j34 = sharedPreferences2.getLong("ChannelSoundDocId", j33);
                                                if (j34 != j33) {
                                                    string = getMediaDataController().A0.e(j34);
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
                                                j22 = j21;
                                                str12 = M02;
                                                long j35 = sharedPreferences2.getLong("GroupSoundDocId", 0L);
                                                if (j35 != 0) {
                                                    string = getMediaDataController().A0.e(j35);
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
                                            j22 = j21;
                                            long j36 = j10;
                                            str12 = M02;
                                            if (j18 == j36) {
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
                                                if (i7 != 3 || i13 == i7) {
                                                    i16 = i13;
                                                } else {
                                                    i16 = i7;
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
                                                if (fjVar.O) {
                                                    intent.putExtra("oauth_url", fjVar.b);
                                                }
                                                if (fjVar.J) {
                                                    str14 = str13;
                                                    if (fjVar.N) {
                                                        if (j28 != j10) {
                                                            i19 = i18;
                                                            i21 = i12;
                                                            intent.putExtra("chatId", j17);
                                                        } else {
                                                            i19 = i18;
                                                            i21 = i12;
                                                            if (j18 != 0) {
                                                                intent.putExtra("userId", j18);
                                                            }
                                                        }
                                                        intent.putExtra("storyId", Math.abs(fjVar.e1()));
                                                        z34 = z26;
                                                        i20 = i21;
                                                    } else {
                                                        i19 = i18;
                                                        long j37 = j18;
                                                        long j38 = j17;
                                                        i20 = i12;
                                                        z34 = z26;
                                                        if (!fjVar.K) {
                                                            if (n5.C(j22)) {
                                                                z35 = z47;
                                                                user = c22;
                                                                chat3 = chat4;
                                                                if (this.f.m() == 1 && j22 != o0) {
                                                                    intent.putExtra("encId", n5.h(j22));
                                                                }
                                                            } else {
                                                                z35 = z47;
                                                                if (this.f.m() == 1) {
                                                                    if (j28 != j10) {
                                                                        intent.putExtra("chatId", j38);
                                                                    } else if (j37 != 0) {
                                                                        intent.putExtra("userId", j37);
                                                                    }
                                                                }
                                                                if (!g0.o2() && !bz.C && this.f.m() == 1 && Build.VERSION.SDK_INT < 28) {
                                                                    if (chat4 != null) {
                                                                        chat3 = chat4;
                                                                        TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                                                        if (chatPhoto != null && (fileLocation2 = chatPhoto.photo_small) != null && fileLocation2.volume_id != 0 && fileLocation2.local_id != 0) {
                                                                            fileLocation = fileLocation2;
                                                                            user = c22;
                                                                        }
                                                                        user = c22;
                                                                    } else {
                                                                        chat3 = chat4;
                                                                        if (c22 != null) {
                                                                            user = c22;
                                                                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                                                            if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                                                            }
                                                                        }
                                                                        user = c22;
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
                                                                    qVar.F.when = fjVar.k.date * j3;
                                                                    qVar.w = -15618822;
                                                                    qVar.u = "msg";
                                                                    if (chat3 == null && user != null && (str15 = user.phone) != null && str15.length() > 0) {
                                                                        str16 = "tel:+" + user.phone;
                                                                        if (str16 != null && !str16.isEmpty()) {
                                                                            qVar.G.add(str16);
                                                                        }
                                                                    }
                                                                    Intent intent2 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                                                    intent2.putExtra("messageDate", fjVar.k.date);
                                                                    intent2.putExtra(str23, this.currentAccount);
                                                                    if (fjVar.K) {
                                                                        intent2.putExtra("story", true);
                                                                    }
                                                                    if (fjVar.J) {
                                                                        i30 = 1;
                                                                    } else {
                                                                        i30 = 1;
                                                                        intent2.putExtra("storyReaction", true);
                                                                    }
                                                                    qVar.F.deleteIntent = PendingIntent.getBroadcast(t0.b, i30, intent2, 167772160);
                                                                    if (bitmap2 == null) {
                                                                        qVar.j(bitmap2);
                                                                    } else if (fileLocation != null) {
                                                                        BitmapDrawable C = ec.D().C(fileLocation);
                                                                        if (C != null) {
                                                                            qVar.j(C.getBitmap());
                                                                        } else {
                                                                            try {
                                                                                getFileLoader().getClass();
                                                                                File K = w7.K(fileLocation, true);
                                                                                if (K.exists()) {
                                                                                    float L = 160.0f / g0.L(50.0f);
                                                                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                                                                    options.inSampleSize = L < 1.0f ? 1 : (int) L;
                                                                                    Bitmap decodeFile = BitmapFactory.decodeFile(K.getAbsolutePath(), options);
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
                                                                    if (!g0.o2() && !bz.C && fjVar.A0() == 777000) {
                                                                        replyMarkup = fjVar.k.reply_markup;
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
                                                                                    TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) cg.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                                                    if (tL_inlineButtonTypeCallback != null) {
                                                                                        uri3 = uri;
                                                                                        i26 = i22;
                                                                                        i27 = size;
                                                                                        Intent intent3 = new Intent(t0.b, (Class<?>) NotificationCallbackReceiver.class);
                                                                                        intent3.putExtra(str23, this.currentAccount);
                                                                                        i28 = i23;
                                                                                        long j39 = j22;
                                                                                        intent3.putExtra("did", j39);
                                                                                        byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                                        if (bArr != null) {
                                                                                            intent3.putExtra("data", bArr);
                                                                                        }
                                                                                        intent3.putExtra("mid", fjVar.e1());
                                                                                        String str25 = keyboardInlineButton.text;
                                                                                        Context context3 = t0.b;
                                                                                        int i54 = this.I;
                                                                                        j22 = j39;
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
                                                                            if (!z37 && Build.VERSION.SDK_INT < 24 && bz.s.length() == 0 && A()) {
                                                                                Intent intent4 = new Intent(t0.b, (Class<?>) PopupReplyReceiver.class);
                                                                                intent4.putExtra(str23, this.currentAccount);
                                                                                qVar.a(R.drawable.ic_ab_reply, PendingIntent.getBroadcast(t0.b, 2, intent4, 167772160), gd.M0(2131746067));
                                                                            }
                                                                            X(qVar, str22, j22, j20, str18, jArr, i25, uri2, i24, z35, z46, z27, i11);
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
                                                                        qVar.a(R.drawable.ic_ab_reply, PendingIntent.getBroadcast(t0.b, 2, intent42, 167772160), gd.M0(2131746067));
                                                                    }
                                                                    X(qVar, str22, j22, j20, str18, jArr, i25, uri2, i24, z35, z46, z27, i11);
                                                                    R();
                                                                    return;
                                                                }
                                                                user = c22;
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
                                                            qVar.F.when = fjVar.k.date * j3;
                                                            qVar.w = -15618822;
                                                            qVar.u = "msg";
                                                            if (chat3 == null) {
                                                                str16 = "tel:+" + user.phone;
                                                                if (str16 != null) {
                                                                    qVar.G.add(str16);
                                                                }
                                                            }
                                                            Intent intent22 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                                            intent22.putExtra("messageDate", fjVar.k.date);
                                                            intent22.putExtra(str232, this.currentAccount);
                                                            if (fjVar.K) {
                                                            }
                                                            if (fjVar.J) {
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
                                                                replyMarkup = fjVar.k.reply_markup;
                                                                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                }
                                                            }
                                                            uri2 = uri;
                                                            i24 = i22;
                                                            i25 = i23;
                                                            z37 = false;
                                                            if (!z37) {
                                                            }
                                                            X(qVar, str22, j22, j20, str18, jArr, i25, uri2, i24, z35, z46, z27, i11);
                                                            R();
                                                            return;
                                                        }
                                                        long[] jArr3 = new long[this.E.size()];
                                                        for (int i55 = 0; i55 < this.E.size(); i55++) {
                                                            jArr3[i55] = ((ws) this.E.get(i55)).a;
                                                        }
                                                        intent.putExtra("storyDialogIds", jArr3);
                                                    }
                                                } else {
                                                    intent.putExtra("storyId", Math.abs(fjVar.e1()));
                                                    i19 = i18;
                                                    i20 = i12;
                                                    str14 = str13;
                                                    z34 = z26;
                                                }
                                                z35 = z47;
                                                user = c22;
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
                                                qVar.F.when = fjVar.k.date * j3;
                                                qVar.w = -15618822;
                                                qVar.u = "msg";
                                                if (chat3 == null) {
                                                }
                                                Intent intent222 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                                intent222.putExtra("messageDate", fjVar.k.date);
                                                intent222.putExtra(str2322, this.currentAccount);
                                                if (fjVar.K) {
                                                }
                                                if (fjVar.J) {
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
                                                X(qVar, str22, j22, j20, str18, jArr, i25, uri2, i24, z35, z46, z27, i11);
                                                R();
                                                return;
                                            }
                                            long j40 = sharedPreferences2.getLong(z25 ? "StoriesSoundDocId" : "GlobalSoundDocId", j36);
                                            if (j40 != j36) {
                                                string2 = getMediaDataController().A0.e(j40);
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
                                        if (i7 != 3) {
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
                                        if (fjVar.O) {
                                        }
                                        if (fjVar.J) {
                                        }
                                        z35 = z472;
                                        user = c22;
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
                                        qVar.F.when = fjVar.k.date * j3;
                                        qVar.w = -15618822;
                                        qVar.u = "msg";
                                        if (chat3 == null) {
                                        }
                                        Intent intent2222 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                        intent2222.putExtra("messageDate", fjVar.k.date);
                                        intent2222.putExtra(str23222, this.currentAccount);
                                        if (fjVar.K) {
                                        }
                                        if (fjVar.J) {
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
                                        X(qVar, str22, j22, j20, str18, jArr, i25, uri2, i24, z35, z46, z27, i11);
                                        R();
                                        return;
                                    }
                                } else {
                                    j19 = j14;
                                }
                                z23 = z21;
                                String path2 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                z24 = t0.x;
                                boolean z462 = !z24;
                                v(j16, j19, false);
                                if (this.h0.e(j16, j19)) {
                                }
                                String str222 = str5;
                                if (fjVar.I) {
                                }
                                z27 = z23;
                                j22 = j21;
                                str12 = M02;
                                j23 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                if (j23 != 0) {
                                }
                                int i432 = sharedPreferences2.getInt("vibrate_react", 0);
                                int i442 = sharedPreferences2.getInt("priority_react", 1);
                                int i452 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                z29 = z28;
                                i11 = fjVar.J ? 5 : 4;
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
                                if (i7 != 3) {
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
                                if (fjVar.O) {
                                }
                                if (fjVar.J) {
                                }
                                z35 = z4722;
                                user = c22;
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
                                qVar.F.when = fjVar.k.date * j3;
                                qVar.w = -15618822;
                                qVar.u = "msg";
                                if (chat3 == null) {
                                }
                                Intent intent22222 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                                intent22222.putExtra("messageDate", fjVar.k.date);
                                intent22222.putExtra(str232222, this.currentAccount);
                                if (fjVar.K) {
                                }
                                if (fjVar.J) {
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
                                X(qVar, str222, j22, j20, str18, jArr, i25, uri2, i24, z35, z462, z27, i11);
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
                            v(j16, j19, false);
                            if (this.h0.e(j16, j19)) {
                            }
                            String str2222 = str5;
                            if (fjVar.I) {
                            }
                            z27 = z23;
                            j22 = j21;
                            str12 = M02;
                            j23 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                            if (j23 != 0) {
                            }
                            int i4322 = sharedPreferences2.getInt("vibrate_react", 0);
                            int i4422 = sharedPreferences2.getInt("priority_react", 1);
                            int i4522 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                            z29 = z28;
                            i11 = fjVar.J ? 5 : 4;
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
                            if (i7 != 3) {
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
                            if (fjVar.O) {
                            }
                            if (fjVar.J) {
                            }
                            z35 = z47222;
                            user = c22;
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
                            qVar.F.when = fjVar.k.date * j3;
                            qVar.w = -15618822;
                            qVar.u = "msg";
                            if (chat3 == null) {
                            }
                            Intent intent222222 = new Intent(t0.b, (Class<?>) NotificationDismissReceiver.class);
                            intent222222.putExtra("messageDate", fjVar.k.date);
                            intent222222.putExtra(str2322222, this.currentAccount);
                            if (fjVar.K) {
                            }
                            if (fjVar.J) {
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
                            X(qVar, str2222, j22, j20, str18, jArr, i25, uri2, i24, z35, z4622, z27, i11);
                            R();
                            return;
                        }
                        str4 = M0;
                        if (!d.getBoolean("EnableReactionsPreview", true)) {
                            M02 = gd.M0(2131747824);
                            if (z14) {
                            }
                            e0.q qVar2 = new e0.q(t0.b);
                            TLRPC.Chat chat42 = chat2;
                            if (this.a.size() > 1) {
                            }
                            sharedPreferences = d;
                            j18 = j30;
                            String str192 = str;
                            boolean[] zArr22 = new boolean[1];
                            x10 = x(fjVar, zArr22);
                            if (!fjVar.k.silent) {
                                z19 = false;
                                if (x10 != null) {
                                }
                            }
                            z19 = true;
                            if (x10 != null) {
                            }
                        }
                        M02 = str4;
                        if (z14) {
                        }
                        e0.q qVar22 = new e0.q(t0.b);
                        TLRPC.Chat chat422 = chat2;
                        if (this.a.size() > 1) {
                        }
                        sharedPreferences = d;
                        j18 = j30;
                        String str1922 = str;
                        boolean[] zArr222 = new boolean[1];
                        x10 = x(fjVar, zArr222);
                        if (!fjVar.k.silent) {
                        }
                        z19 = true;
                        if (x10 != null) {
                        }
                    }
                } else {
                    z14 = equalsIgnoreCase;
                }
                M0 = !z13 ? j28 != j10 ? gd.M0(2131747827) : gd.M0(2131747824) : gd.M0(R.string.AppName);
                z15 = false;
                if (!fjVar.I) {
                    str4 = M0;
                    M02 = str4;
                    if (z14) {
                    }
                    e0.q qVar222 = new e0.q(t0.b);
                    TLRPC.Chat chat4222 = chat2;
                    if (this.a.size() > 1) {
                    }
                    sharedPreferences = d;
                    j18 = j30;
                    String str19222 = str;
                    boolean[] zArr2222 = new boolean[1];
                    x10 = x(fjVar, zArr2222);
                    if (!fjVar.k.silent) {
                    }
                    z19 = true;
                    if (x10 != null) {
                    }
                }
                str4 = M0;
                if (!d.getBoolean("EnableReactionsPreview", true)) {
                }
                M02 = str4;
                if (z14) {
                }
                e0.q qVar2222 = new e0.q(t0.b);
                TLRPC.Chat chat42222 = chat2;
                if (this.a.size() > 1) {
                }
                sharedPreferences = d;
                j18 = j30;
                String str192222 = str;
                boolean[] zArr22222 = new boolean[1];
                x10 = x(fjVar, zArr22222);
                if (!fjVar.k.silent) {
                }
                z19 = true;
                if (x10 != null) {
                }
            }
            z13 = true;
            String str182 = y10;
            boolean equalsIgnoreCase2 = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
            if (n5.C(j16)) {
            }
            if (!z13) {
            }
            z15 = false;
            if (!fjVar.I) {
            }
            str4 = M0;
            if (!d.getBoolean("EnableReactionsPreview", true)) {
            }
            M02 = str4;
            if (z14) {
            }
            e0.q qVar22222 = new e0.q(t0.b);
            TLRPC.Chat chat422222 = chat2;
            if (this.a.size() > 1) {
            }
            sharedPreferences = d;
            j18 = j30;
            String str1922222 = str;
            boolean[] zArr222222 = new boolean[1];
            x10 = x(fjVar, zArr222222);
            if (!fjVar.k.silent) {
            }
            z19 = true;
            if (x10 != null) {
            }
        } catch (Exception e11) {
            a8.f(e11);
        }
    }

    public final void a0(long j3, String str) {
        l0.c(new br(this, str, j3, 3));
    }

    public final void b0(int i7) {
        SharedPreferences d = getAccountInstance().d();
        if (i7 == 4 || i7 == 5) {
            TL_account.setReactionsNotifySettings setreactionsnotifysettings = new TL_account.setReactionsNotifySettings();
            setreactionsnotifysettings.settings = new TL_account.TL_reactionsNotifySettings();
            if (d.getBoolean("EnableReactionsMessages", true)) {
                setreactionsnotifysettings.settings.flags |= 1;
                if (d.getBoolean("EnableReactionsMessagesContacts", false)) {
                    setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
                } else {
                    setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromAll();
                }
            }
            if (d.getBoolean("EnableReactionsStories", true)) {
                setreactionsnotifysettings.settings.flags |= 2;
                if (d.getBoolean("EnableReactionsStoriesContacts", false)) {
                    setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
                } else {
                    setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromAll();
                }
            }
            setreactionsnotifysettings.settings.show_previews = d.getBoolean("EnableReactionsPreview", true);
            setreactionsnotifysettings.settings.sound = s(d, "ReactionSound", "ReactionSoundDocId", "ReactionSoundPath");
            getConnectionsManager().sendRequest(setreactionsnotifysettings, new fi.l5(14));
            return;
        }
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
        updatenotifysettings.settings = tL_inputPeerNotifySettings;
        tL_inputPeerNotifySettings.flags = 5;
        if (i7 == 0) {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
            updatenotifysettings.settings.mute_until = d.getInt("EnableGroup2", 0);
            updatenotifysettings.settings.show_previews = d.getBoolean("EnablePreviewGroup", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings2.flags |= 8;
            tL_inputPeerNotifySettings2.sound = s(d, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
        } else if (i7 == 1 || i7 == 3) {
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
            tL_inputPeerNotifySettings5.sound = s(d, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings6 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings6.flags |= 256;
            tL_inputPeerNotifySettings6.stories_sound = s(d, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
        } else {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
            updatenotifysettings.settings.mute_until = d.getInt("EnableChannel2", 0);
            updatenotifysettings.settings.show_previews = d.getBoolean("EnablePreviewChannel", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings7.flags |= 8;
            tL_inputPeerNotifySettings7.sound = s(d, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new fi.l5(14));
    }

    public final void c0(long j3, long j10, boolean z10) {
        if (z10) {
            getNotificationCenter().k(ks.f0, new Object[0]);
        }
        if (n5.C(j3)) {
            return;
        }
        SharedPreferences d = getAccountInstance().d();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String v = v(j3, j10, false);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = updatenotifysettings.settings;
        tL_inputPeerNotifySettings.flags |= 1;
        tL_inputPeerNotifySettings.show_previews = d.getBoolean("content_preview_" + v, true);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings2.flags = tL_inputPeerNotifySettings2.flags | 2;
        tL_inputPeerNotifySettings2.silent = d.getBoolean("silent_" + v, false);
        if (d.contains("stories_" + v)) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 64;
            tL_inputPeerNotifySettings3.stories_muted = !d.getBoolean("stories_" + v, true);
        }
        int i7 = d.getInt("notify2_" + v(j3, j10, false), -1);
        if (i7 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i7 == 3) {
                tL_inputPeerNotifySettings4.mute_until = d.getInt("notifyuntil_" + v(j3, j10, false), 0);
            } else {
                tL_inputPeerNotifySettings4.mute_until = i7 != 2 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
        }
        long j11 = d.getLong("sound_document_id_" + v(j3, j10, false), 0L);
        String string = d.getString("sound_path_" + v(j3, j10, false), null);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings5.flags = tL_inputPeerNotifySettings5.flags | 8;
        if (j11 != 0) {
            TLRPC.TL_notificationSoundRingtone tL_notificationSoundRingtone = new TLRPC.TL_notificationSoundRingtone();
            tL_notificationSoundRingtone.id = j11;
            updatenotifysettings.settings.sound = tL_notificationSoundRingtone;
        } else if (string == null) {
            tL_inputPeerNotifySettings5.sound = new TLRPC.TL_notificationSoundDefault();
        } else if (string.equalsIgnoreCase("NoSound")) {
            updatenotifysettings.settings.sound = new TLRPC.TL_notificationSoundNone();
        } else {
            TLRPC.TL_notificationSoundLocal tL_notificationSoundLocal = new TLRPC.TL_notificationSoundLocal();
            tL_notificationSoundLocal.title = d.getString("sound_" + v(j3, j10, false), null);
            tL_notificationSoundLocal.data = string;
            updatenotifysettings.settings.sound = tL_notificationSoundLocal;
        }
        if (j10 == 0 || j3 == getUserConfig().e()) {
            int i10 = this.currentAccount;
            if (j3 >= 0 || !v3.Y(mp.u1(i10).O0(Long.valueOf(-j3)))) {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().l1(j3);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            } else {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().j1(-j3);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            }
        } else {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().l1(j3);
            tL_inputNotifyForumTopic.top_msg_id = (int) j10;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new fi.l5(14));
    }

    public final void d0() {
        int i7 = 0;
        long j3 = Long.MAX_VALUE;
        while (true) {
            ArrayList arrayList = this.E;
            if (i7 >= arrayList.size()) {
                break;
            }
            Iterator it = ((ws) arrayList.get(i7)).c.values().iterator();
            while (it.hasNext()) {
                j3 = Math.min(j3, ((Long) ((Pair) it.next()).second).longValue());
            }
            i7++;
        }
        q5 q5Var = l0;
        ls lsVar = this.j0;
        q5Var.a(lsVar);
        long currentTimeMillis = j3 - System.currentTimeMillis();
        if (j3 != Long.MAX_VALUE) {
            q5Var.d(lsVar, Math.max(0L, currentTimeMillis));
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == ks.Y1) {
            l0.c(new rq(13, this, (String) objArr[0]));
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
    public final String e0(long j3, long j10, String str, long[] jArr, int i7, Uri uri, int i10, boolean z10, boolean z11, boolean z12, int i11) {
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
        long j11;
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
        long j12;
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
        long j13;
        char c10;
        boolean z25;
        String str40;
        SharedPreferences d = getAccountInstance().d();
        if (this.Q == null) {
            this.Q = Boolean.valueOf(d.getBoolean("groupsCreated5", false));
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
                                    editor2 = getAccountInstance().d().edit();
                                }
                                SharedPreferences.Editor editor3 = editor2;
                                editor2 = editor3;
                                editor3.remove("priority_channel").remove("vibrate_channel").remove("ChannelSoundPath").remove("ChannelSound");
                            } else if (id2.contains("_reactions_")) {
                                if (editor2 == null) {
                                    editor2 = getAccountInstance().d().edit();
                                }
                                SharedPreferences.Editor editor4 = editor2;
                                editor2 = editor4;
                                editor4.remove("priority_react").remove(str42).remove("ReactionSoundPath").remove("ReactionSound");
                            } else if (id2.contains("_groups_")) {
                                if (editor2 == null) {
                                    editor2 = getAccountInstance().d().edit();
                                }
                                SharedPreferences.Editor editor5 = editor2;
                                editor2 = editor5;
                                editor5.remove("priority_group").remove("vibrate_group").remove("GroupSoundPath").remove("GroupSound");
                            } else if (id2.contains("_private_")) {
                                if (editor2 == null) {
                                    editor2 = getAccountInstance().d().edit();
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
                                        editor2 = getAccountInstance().d().edit();
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
                                        d.edit().putBoolean("groupsCreated5", z13).commit();
                                        this.Q = Boolean.TRUE;
                                        if (this.R) {
                                        }
                                        SharedPreferences d2 = getAccountInstance().d();
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
                                        String E = a8.p0.E(str16, "_", a10);
                                        string = d2.getString(E, null);
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(E);
                                        String str44 = "_s";
                                        sb5.append("_s");
                                        String string2 = d2.getString(sb5.toString(), null);
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
                                        d.edit().putBoolean("groupsCreated5", z13).commit();
                                        this.Q = Boolean.TRUE;
                                        if (this.R) {
                                        }
                                        SharedPreferences d22 = getAccountInstance().d();
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
                                        String E2 = a8.p0.E(str16, "_", a10);
                                        string = d22.getString(E2, null);
                                        StringBuilder sb52 = new StringBuilder();
                                        sb52.append(E2);
                                        String str442 = "_s";
                                        sb52.append("_s");
                                        String string22 = d22.getString(sb52.toString(), null);
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
            d.edit().putBoolean("groupsCreated5", z13).commit();
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
                TLRPC.User c22 = getMessagesController().c2(Long.valueOf(getUserConfig().e()));
                if (c22 == null) {
                    getUserConfig().f();
                }
                if (c22 != null) {
                    StringBuilder sb9 = new StringBuilder(" (");
                    str6 = "reactions";
                    sb9.append(i5.m(0, c22.first_name, c22.last_name));
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
                    sb10.append(gd.N0(2131747727, null));
                    sb10.append(str40);
                    arrayList.add(new NotificationChannelGroup(str54, sb10.toString()));
                } else {
                    str10 = "private";
                }
                if (str53 != null) {
                    arrayList.add(new NotificationChannelGroup(str53, gd.N0(2131747713, null) + str40));
                }
                if (str51 != null) {
                    arrayList.add(new NotificationChannelGroup(str51, gd.N0(2131747671, null) + str40));
                }
                if (str52 != null) {
                    arrayList.add(new NotificationChannelGroup(str52, gd.N0(2131747683, null) + str40));
                }
                if (str50 != null) {
                    arrayList.add(new NotificationChannelGroup(str50, gd.N0(2131747684, null) + str40));
                }
                if (str55 != null) {
                    arrayList.add(new NotificationChannelGroup(str55, gd.N0(2131747697, null) + str40));
                }
                n0.createNotificationChannelGroups(arrayList);
            }
            this.R = true;
        }
        SharedPreferences d222 = getAccountInstance().d();
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
        boolean z27 = z10 && n5.C(j3);
        z14 = z11 && str17 != null && d222.getBoolean(str17, false);
        a10 = Utilities.a(uri == null ? "NoSound2" : uri.toString());
        if (a10 != null && a10.length() > 5) {
            a10 = a10.substring(0, 5);
        }
        if (z12) {
            str16 = "silent";
            j11 = j3;
            str21 = gd.N0(2131747678, null);
        } else {
            if (z10) {
                a02 = gd.N0(z11 ? 2131747711 : 2131747722, null);
                if (i14 == 2) {
                    j11 = j3;
                    str21 = a02;
                    str16 = z11 ? "channels_ia" : "channels";
                } else if (i14 == 0) {
                    j11 = j3;
                    str21 = a02;
                    str16 = z11 ? "groups_ia" : "groups";
                } else if (i14 == 3) {
                    str21 = a02;
                    str16 = z11 ? "stories_ia" : "stories";
                    j11 = j3;
                } else {
                    if (i14 != 4 && i14 != 5) {
                        if (z11) {
                            str15 = "private_ia";
                        }
                        j11 = j3;
                        str21 = a02;
                        str16 = str15;
                    }
                    j11 = j3;
                }
            } else {
                a02 = z11 ? gd.a0(null, null, 2131747725, str) : str;
                StringBuilder sb11 = new StringBuilder();
                sb11.append(z11 ? "org.telegram.keyia" : "org.telegram.key");
                j11 = j3;
                sb11.append(j11);
                sb11.append("_");
                sb11.append(j10);
                str16 = sb11.toString();
            }
            str21 = a02;
        }
        String E22 = a8.p0.E(str16, "_", a10);
        string = d222.getString(E22, null);
        StringBuilder sb522 = new StringBuilder();
        sb522.append(E22);
        String str4422 = "_s";
        sb522.append("_s");
        String string222 = d222.getString(sb522.toString(), null);
        StringBuilder sb622 = new StringBuilder();
        if (string != null) {
            NotificationChannel notificationChannel3 = n0.getNotificationChannel(string);
            sharedPreferences = d222;
            str24 = str21;
            if (s2.a) {
                z15 = z27;
                a8.b("current channel for " + string + " = " + notificationChannel3);
            } else {
                z15 = z27;
            }
            if (notificationChannel3 == null) {
                jArr2 = jArr;
                i15 = i7;
                sb3 = sb622;
                str25 = str18;
                str26 = "_s";
                str27 = "_";
                j12 = 0;
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
                    if (s2.a) {
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
                if (s2.a) {
                    StringBuilder sb12 = new StringBuilder("current channel settings for ");
                    sb12.append(string);
                    sb12.append(" = ");
                    sb12.append((Object) sb622);
                    sb12.append(" old = ");
                    p5.c.s(string222, sb12);
                }
                String a11 = Utilities.a(sb622.toString());
                sb622.setLength(0);
                i16 = i10;
                if (z11 && i16 != importance2) {
                    jArr4 = jArr;
                    i15 = i7;
                    str36 = string;
                    str37 = string222;
                    sb3 = sb622;
                    str38 = a11;
                    str26 = str35;
                    j12 = 0;
                    z21 = false;
                    z20 = true;
                } else if (a11.equals(string222)) {
                    i15 = i7;
                    str36 = string;
                    str37 = string222;
                    sb3 = sb622;
                    str38 = a11;
                    str26 = str35;
                    j12 = 0;
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
                                j13 = 0;
                                sb13.append(v(j11, 0L, false));
                                edit.putBoolean(sb13.toString(), false);
                            } else {
                                j13 = 0;
                                edit.putInt("notify2_" + v(j11, 0L, false), 2);
                            }
                            j12 = j13;
                            str38 = a11;
                            c0(j3, 0L, true);
                            j11 = j3;
                        } else if (z11) {
                            str38 = a11;
                            j12 = 0;
                            z24 = true;
                        } else {
                            if (i11 == 3) {
                                edit.putBoolean("EnableAllStories", false);
                                c10 = 4;
                                z25 = true;
                            } else {
                                c10 = 4;
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
                            j12 = 0;
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
                        j12 = 0;
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
                                        edit2.putBoolean("stories_" + j11, true);
                                    } else {
                                        edit2.putInt("notify2_" + j11, 0);
                                        edit2.remove("notifyuntil_" + j11);
                                        edit2.putInt(str7 + j11, i22);
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
                        for (long j14 : jArr) {
                            if (j14 == j12) {
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
                                    editor.putInt(a8.p0.o(j11, str3), z23 ? 0 : 2);
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
                        i15 = i7;
                        if (lightColor != i15) {
                            if (!z11) {
                                if (editor == null) {
                                    editor = sharedPreferences.edit();
                                }
                                if (!z10) {
                                    editor.putInt("color_" + j11, lightColor);
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
                    i15 = i7;
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
                            if (s2.a) {
                                a8.b("delete channel by settings change ".concat(str28));
                            }
                            str32 = str29;
                            str33 = null;
                            if (str33 == null) {
                                str33 = z10 ? this.currentAccount + "channel_" + E22 + str27 + Utilities.b.nextLong() : this.currentAccount + "channel_" + j11 + str27 + Utilities.b.nextLong();
                                if (z15) {
                                    uri2 = null;
                                    str34 = gd.N0(2131745497, null);
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
                                    for (long j15 : jArr2) {
                                        if (j15 == j12) {
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
                                    if (s2.a) {
                                        a8.b("create new channel " + str33);
                                    }
                                    this.P = SystemClock.elapsedRealtime();
                                    n0.createNotificationChannel(notificationChannel4);
                                    sharedPreferences.edit().putString(E22, str33).putString(E22 + str31, str32).commit();
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
                                if (s2.a) {
                                }
                                this.P = SystemClock.elapsedRealtime();
                                n0.createNotificationChannel(notificationChannel4);
                                sharedPreferences.edit().putString(E22, str33).putString(E22 + str31, str32).commit();
                            }
                            return str33;
                        }
                    }
                } else {
                    SharedPreferences.Editor putString = sharedPreferences.edit().putString(E22, str28);
                    StringBuilder sb14 = new StringBuilder();
                    sb14.append(E22);
                    str31 = str26;
                    sb14.append(str31);
                    putString.putString(sb14.toString(), str29).commit();
                    if (s2.a) {
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
            i15 = i7;
            str22 = string;
            str23 = string222;
            sb3 = sb622;
            str25 = str18;
            str26 = "_s";
            z16 = z14;
            str27 = "_";
            j12 = 0;
        } else {
            i15 = i7;
            str22 = string;
            str23 = string222;
            sb3 = sb622;
            sharedPreferences = d222;
            str24 = str21;
            str25 = str18;
            str26 = "_s";
            z15 = z27;
            z16 = z14;
            str27 = "_";
            j12 = 0;
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

    public final void h(fj fjVar) {
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i7 >= arrayList.size()) {
                arrayList.add(0, fjVar);
                return;
            } else if (((fj) arrayList.get(i7)).e1() == fjVar.e1() && fj.B0(((fj) arrayList.get(i7)).k) == fj.B0(fjVar.k) && ((fj) arrayList.get(i7)).K == fjVar.K) {
                return;
            } else {
                i7++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[Catch: Exception -> 0x0067, TryCatch #0 {Exception -> 0x0067, blocks: (B:13:0x002b, B:16:0x0063, B:17:0x006e, B:20:0x0082, B:22:0x00a1, B:24:0x00ad, B:25:0x00b3, B:27:0x00bb, B:29:0x00bf, B:31:0x00c2, B:33:0x00cf, B:35:0x00d3, B:37:0x00d8, B:38:0x00df, B:40:0x00e3, B:41:0x00e8, B:43:0x010d, B:44:0x0115, B:46:0x011e, B:48:0x0146, B:50:0x0151, B:55:0x015f, B:59:0x017c, B:60:0x0183, B:61:0x0184, B:64:0x0129, B:67:0x0136, B:69:0x013b, B:70:0x0111, B:71:0x0188, B:72:0x018f, B:73:0x0190, B:74:0x0197, B:76:0x007e, B:77:0x006a), top: B:12:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0190 A[Catch: Exception -> 0x0067, TryCatch #0 {Exception -> 0x0067, blocks: (B:13:0x002b, B:16:0x0063, B:17:0x006e, B:20:0x0082, B:22:0x00a1, B:24:0x00ad, B:25:0x00b3, B:27:0x00bb, B:29:0x00bf, B:31:0x00c2, B:33:0x00cf, B:35:0x00d3, B:37:0x00d8, B:38:0x00df, B:40:0x00e3, B:41:0x00e8, B:43:0x010d, B:44:0x0115, B:46:0x011e, B:48:0x0146, B:50:0x0151, B:55:0x015f, B:59:0x017c, B:60:0x0183, B:61:0x0184, B:64:0x0129, B:67:0x0136, B:69:0x013b, B:70:0x0111, B:71:0x0188, B:72:0x018f, B:73:0x0190, B:74:0x0197, B:76:0x007e, B:77:0x006a), top: B:12:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String j(e0.q qVar, long j3, String str, TLRPC.User user, TLRPC.Chat chat, e0.j0 j0Var, boolean z10) {
        Bitmap bitmap;
        IconCompat d;
        if (Build.VERSION.SDK_INT < 29 || !bz.q0) {
            return null;
        }
        if (v3.T(chat) && !chat.megagroup) {
            return null;
        }
        try {
            String str2 = "ndid_" + j3;
            Intent intent = new Intent(t0.b, (Class<?>) OpenChatReceiver.class);
            intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
            if (j3 > 0) {
                intent.putExtra("userId", j3);
            } else {
                intent.putExtra("chatId", -j3);
            }
            Context context = t0.b;
            g0.c cVar = new g0.c();
            cVar.a = context;
            cVar.b = str2;
            cVar.e = chat != null ? str : n10.k(user, true);
            cVar.f = str;
            new Intent("android.intent.action.VIEW");
            cVar.c = new Intent[]{intent};
            cVar.l = true;
            cVar.k = new f0.g(str2);
            if (j0Var != null) {
                cVar.i = new e0.j0[]{j0Var};
                IconCompat iconCompat = j0Var.b;
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
                    g0.g.m(t0.b, cVar);
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
                    if (n5.E(j3)) {
                        intent2.putExtra("userId", j3);
                    } else {
                        intent2.putExtra("chatId", -j3);
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
                    int i7 = (this.G > j3 ? 1 : (this.G == j3 ? 0 : -1)) == 0 ? 2 : 0;
                    int max = Math.max(g0.L(640.0f), 0);
                    e0.o oVar = new e0.o();
                    oVar.a = activity;
                    oVar.b = d;
                    oVar.c = max;
                    oVar.d = i7 & (-2);
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

    public final void l(long j3, long j10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        l0.c(new ms(this, j3, j10, 1));
    }

    public final void m(int i7) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        l0.c(new rs(this, i7, 8));
    }

    public final void n(int i7) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences d = getAccountInstance().d();
            SharedPreferences.Editor edit = d.edit();
            if (i7 == 2) {
                str = "channels";
            } else if (i7 == 0) {
                str = "groups";
            } else if (i7 == 3) {
                str = "stories";
            } else {
                if (i7 != 4 && i7 != 5) {
                    str = "private";
                }
                str = "reactions";
            }
            String string = d.getString(str, null);
            if (string != null) {
                edit.remove(str).remove(str.concat("_s"));
                try {
                    n0.deleteNotificationChannel(string);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (s2.a) {
                    a8.b("delete channel global internal ".concat(string));
                }
            }
            if (i7 == 2) {
                str2 = "channels_ia";
            } else if (i7 == 0) {
                str2 = "groups_ia";
            } else if (i7 == 3) {
                str2 = "stories_ia";
            } else {
                if (i7 != 4 && i7 != 5) {
                    str2 = "private_ia";
                }
                str2 = "reactions_ia";
            }
            String string2 = d.getString(str2, null);
            if (string2 != null) {
                edit.remove(str2).remove(str2.concat("_s"));
                try {
                    n0.deleteNotificationChannel(string2);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                if (s2.a) {
                    a8.b("delete channel global internal ".concat(string2));
                }
            }
            if (i7 == 2) {
                str3 = "overwrite_channel";
            } else if (i7 == 0) {
                str3 = "overwrite_group";
            } else if (i7 == 3) {
                str3 = "overwrite_stories";
            } else {
                if (i7 != 4 && i7 != 5) {
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

    public final void o(long j3, long j10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences d = getAccountInstance().d();
            SharedPreferences.Editor edit = d.edit();
            String str = "org.telegram.key" + j3;
            if (j10 != 0) {
                str = str + ".topic" + j10;
            }
            String string = d.getString(str, null);
            if (string != null) {
                edit.remove(str).remove(str + "_s");
                try {
                    n0.deleteNotificationChannel(string);
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (s2.a) {
                    a8.b("delete channel internal ".concat(string));
                }
            }
            String str2 = "org.telegram.keyia" + j3;
            String string2 = d.getString(str2, null);
            if (string2 != null) {
                edit.remove(str2).remove(str2 + "_s");
                try {
                    n0.deleteNotificationChannel(string2);
                } catch (Exception e11) {
                    a8.g(e11, true);
                }
                if (s2.a) {
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
            for (int i7 = 0; i7 < hVar.m(); i7++) {
                if (!this.y.contains(Long.valueOf(hVar.j(i7)))) {
                    m0.b(((Integer) hVar.n(i7)).intValue(), null);
                }
            }
            hVar.b();
            g0.g3(new j2(13));
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final int u(long j3, long j10) {
        int c10 = this.h0.c(-1, j3, j10, "notify2_");
        if (c10 != 3 || this.h0.c(0, j3, j10, "notifyuntil_") < getConnectionsManager().getCurrentTime()) {
            return c10;
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
    
        return org.telegram.messenger.gd.M0(2131742680);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0252, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatWallPaper) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x025b, code lost:
    
        return org.telegram.messenger.gd.M0(2131742682);
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
    
        return org.telegram.messenger.gd.Z(2131747852, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0286, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionLoginUnknownLocation) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0288, code lost:
    
        r2 = org.telegram.messenger.gd.Z(2131742512, org.telegram.messenger.gd.E0().C0().format(r31.k.date * 1000), org.telegram.messenger.gd.E0().p0().format(r31.k.date * 1000));
        r3 = getUserConfig().f().first_name;
        r1 = r31.k.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02e5, code lost:
    
        return org.telegram.messenger.gd.Z(2131747733, r3, r2, r1.title, r1.address);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0327, code lost:
    
        if (cg.d.g(r2, org.telegram.tgnet.TLRPC.TL_messageActionGameScore.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSent.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSentMe.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGift.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftPremium.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesPrice.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesRefunded.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftTon.class, org.telegram.tgnet.TLRPC.TL_messageActionBotInvite.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGiftOnchainOffer.class) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x032f, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0330, code lost:
    
        r2 = r31.k;
        r4 = r2.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0336, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPhoneCall) == false) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x033a, code lost:
    
        if (r4.video == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0343, code lost:
    
        return org.telegram.messenger.gd.M0(2131752598);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x034b, code lost:
    
        return org.telegram.messenger.gd.M0(2131752605);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x034e, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionConferenceCall) == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0352, code lost:
    
        if (r4.video == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x035b, code lost:
    
        return org.telegram.messenger.gd.M0(2131752600);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0363, code lost:
    
        return org.telegram.messenger.gd.M0(2131752607);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0368, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatAddUser) == false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x036a, code lost:
    
        r6 = r4.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x036e, code lost:
    
        if (r6 != 0) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0377, code lost:
    
        if (r4.users.size() != 1) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0379, code lost:
    
        r6 = r31.k.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0390, code lost:
    
        if (r6 == 0) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x039a, code lost:
    
        if (r31.k.peer_id.channel_id == 0) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x039e, code lost:
    
        if (r5.megagroup != false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03b6, code lost:
    
        return org.telegram.messenger.gd.Z(2131752509, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03be, code lost:
    
        if (r6 != r26) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03d1, code lost:
    
        return org.telegram.messenger.gd.Z(2131747823, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03d2, code lost:
    
        r1 = getMessagesController().c2(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x03de, code lost:
    
        if (r1 != null) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03e6, code lost:
    
        if (r12 != r1.id) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03ea, code lost:
    
        if (r5.megagroup == false) goto L231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0402, code lost:
    
        return org.telegram.messenger.gd.Z(2131747838, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0419, code lost:
    
        return org.telegram.messenger.gd.Z(2131747839, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0433, code lost:
    
        return org.telegram.messenger.gd.Z(2131747840, r3, y(r5), org.telegram.messenger.n10.q(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0434, code lost:
    
        r2 = new java.lang.StringBuilder();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0444, code lost:
    
        if (r6 >= r31.k.action.users.size()) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0446, code lost:
    
        r7 = getMessagesController().c2(r31.k.action.users.get(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x045a, code lost:
    
        if (r7 == null) goto L918;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x045c, code lost:
    
        r7 = org.telegram.messenger.n10.q(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x0464, code lost:
    
        if (r2.length() == 0) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0466, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0469, code lost:
    
        r2.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x046c, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0488, code lost:
    
        return org.telegram.messenger.gd.Z(2131747840, r3, y(r5), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x048e, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCall) == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0492, code lost:
    
        if (r4.duration == 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x04a5, code lost:
    
        return org.telegram.messenger.gd.Z(2131747835, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04b7, code lost:
    
        return org.telegram.messenger.gd.Z(2131747836, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x04ba, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCallScheduled) == false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x04c2, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x04c5, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionInviteToGroupCall) == false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x04c7, code lost:
    
        r6 = r4.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x04cb, code lost:
    
        if (r6 != 0) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x04d4, code lost:
    
        if (r4.users.size() != 1) goto L266;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x04d6, code lost:
    
        r6 = r31.k.action.users.get(0).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x04ec, code lost:
    
        if (r6 == 0) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x04f0, code lost:
    
        if (r6 != r26) goto L272;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0508, code lost:
    
        return org.telegram.messenger.gd.Z(2131747831, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0509, code lost:
    
        r1 = getMessagesController().c2(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0515, code lost:
    
        if (r1 != null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0534, code lost:
    
        return org.telegram.messenger.gd.Z(2131747832, r3, y(r5), org.telegram.messenger.n10.q(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0535, code lost:
    
        r2 = new java.lang.StringBuilder();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0545, code lost:
    
        if (r6 >= r31.k.action.users.size()) goto L919;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0547, code lost:
    
        r7 = getMessagesController().c2(r31.k.action.users.get(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x055b, code lost:
    
        if (r7 == null) goto L921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x055d, code lost:
    
        r7 = org.telegram.messenger.n10.q(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0565, code lost:
    
        if (r2.length() == 0) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0567, code lost:
    
        r2.append(", ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x056a, code lost:
    
        r2.append(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x056d, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x058a, code lost:
    
        return org.telegram.messenger.gd.Z(2131747832, r3, y(r5), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x058e, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiftCode) == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0597, code lost:
    
        return org.telegram.messenger.gd.M0(2131753307);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x059a, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByLink) == false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05b1, code lost:
    
        return org.telegram.messenger.gd.Z(2131747822, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x05b8, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditTitle) == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x05c9, code lost:
    
        return org.telegram.messenger.gd.Z(2131747850, r3, r4.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x05cc, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditPhoto) != false) goto L716;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x05d0, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeletePhoto) == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x05d6, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatDeleteUser) == false) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x05d8, code lost:
    
        r6 = r4.user_id;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x05dc, code lost:
    
        if (r6 != r26) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x05f4, code lost:
    
        return org.telegram.messenger.gd.Z(2131747829, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x05fc, code lost:
    
        if (r6 != r12) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x060f, code lost:
    
        return org.telegram.messenger.gd.Z(2131747828, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0610, code lost:
    
        r1 = getMessagesController().c2(java.lang.Long.valueOf(r31.k.action.user_id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0622, code lost:
    
        if (r1 != null) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0644, code lost:
    
        return org.telegram.messenger.gd.Z(2131747830, r3, y(r5), org.telegram.messenger.n10.q(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0647, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatCreate) == false) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x064f, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0652, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelCreate) == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x065a, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0660, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatMigrateTo) == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0671, code lost:
    
        return org.telegram.messenger.gd.Z(2131754599, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0677, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0683, code lost:
    
        return org.telegram.messenger.gd.Z(2131754599, r4.title);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0686, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionScreenshotTaken) == false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x068e, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0691, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayLaunch) == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0699, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x069c, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiveawayResults) == false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x06a4, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x06a7, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSuggestBirthday) == false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x06af, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x06b2, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPinMessage) == false) goto L671;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x06b8, code lost:
    
        if (r5 == null) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x06be, code lost:
    
        if (org.telegram.messenger.v3.T(r5) == false) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x06c2, code lost:
    
        if (r5.megagroup == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x06c8, code lost:
    
        r1 = r31.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x06cd, code lost:
    
        if (r1 != null) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x06e2, code lost:
    
        return org.telegram.messenger.gd.Z(2131747895, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x06ec, code lost:
    
        if (r1.I3() == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x06ff, code lost:
    
        return org.telegram.messenger.gd.Z(2131747898, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0707, code lost:
    
        if (r1.H4() == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0711, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0739, code lost:
    
        return org.telegram.messenger.gd.Z(2131747874, r3, "📹 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0750, code lost:
    
        return org.telegram.messenger.gd.Z(2131747868, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0755, code lost:
    
        if (r1.q3() == false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x075f, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0787, code lost:
    
        return org.telegram.messenger.gd.Z(2131747874, r3, "🎬 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x079e, code lost:
    
        return org.telegram.messenger.gd.Z(2131747904, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x07a8, code lost:
    
        if (r1.P4() == false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x07bb, code lost:
    
        return org.telegram.messenger.gd.Z(2131747865, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x07c0, code lost:
    
        if (r1.h4() == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x07d3, code lost:
    
        return org.telegram.messenger.gd.Z(2131747883, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x07d8, code lost:
    
        if (r1.t4() != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x07de, code lost:
    
        if (r1.J2() == false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x07e4, code lost:
    
        r7 = r1.k;
        r10 = r7.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x07ea, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L408;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x07f2, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.message) != false) goto L406;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x081a, code lost:
    
        return org.telegram.messenger.gd.Z(2131747874, r3, "📎 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0831, code lost:
    
        return org.telegram.messenger.gd.Z(2131747919, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0834, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L412;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0838, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L413;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0841, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0859, code lost:
    
        return org.telegram.messenger.gd.Z(2131747908, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x085c, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x085e, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0882, code lost:
    
        return org.telegram.messenger.gd.Z(2131747922, r3, y(r5), org.telegram.messenger.i5.n(r10.first_name, r10.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x0885, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x0887, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x088d, code lost:
    
        if (r10.poll.quiz == false) goto L427;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x08af, code lost:
    
        return org.telegram.messenger.gd.Z(2131747886, r3, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x08d0, code lost:
    
        return org.telegram.messenger.gd.Z(2131747889, r3, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x08d3, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x08f7, code lost:
    
        return org.telegram.messenger.gd.Z(2131747871, r3, y(r5), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r10).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x08fa, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0902, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.message) != false) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x092a, code lost:
    
        return org.telegram.messenger.gd.Z(2131747874, r3, "🖼 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0941, code lost:
    
        return org.telegram.messenger.gd.Z(2131747892, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0949, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x095c, code lost:
    
        return org.telegram.messenger.gd.Z(2131747916, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x095d, code lost:
    
        r7 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x095f, code lost:
    
        if (r7 == null) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0965, code lost:
    
        if (r7.length() <= 0) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x0967, code lost:
    
        r1 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x096d, code lost:
    
        if (r1.length() <= 20) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x096f, code lost:
    
        r6 = new java.lang.StringBuilder();
        r7 = 0;
        r6.append((java.lang.Object) r1.subSequence(0, 20));
        r6.append("...");
        r1 = r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0985, code lost:
    
        r2 = y(r5);
        r4 = new java.lang.Object[3];
        r4[r7] = r3;
        r4[1] = r1;
        r4[2] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0998, code lost:
    
        return org.telegram.messenger.gd.Z(2131747874, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0984, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x09aa, code lost:
    
        return org.telegram.messenger.gd.Z(2131747895, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x09bc, code lost:
    
        return org.telegram.messenger.gd.Z(2131747910, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x09bd, code lost:
    
        r1 = r1.V1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x09c1, code lost:
    
        if (r1 == null) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x09d8, code lost:
    
        return org.telegram.messenger.gd.Z(2131747878, r3, y(r5), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x09eb, code lost:
    
        return org.telegram.messenger.gd.Z(2131747880, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x09ec, code lost:
    
        if (r5 == null) goto L568;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x09ee, code lost:
    
        r1 = r31.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x09f3, code lost:
    
        if (r1 != null) goto L470;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0a03, code lost:
    
        return org.telegram.messenger.gd.Z(2131747894, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0a0a, code lost:
    
        if (r1.I3() == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0a1b, code lost:
    
        return org.telegram.messenger.gd.Z(2131747897, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0a23, code lost:
    
        if (r1.H4() == false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0a2d, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0a51, code lost:
    
        return org.telegram.messenger.gd.Z(2131747873, y(r5), "📹 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0a64, code lost:
    
        return org.telegram.messenger.gd.Z(2131747867, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0a69, code lost:
    
        if (r1.q3() == false) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0a73, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0a97, code lost:
    
        return org.telegram.messenger.gd.Z(2131747873, y(r5), "🎬 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0aaa, code lost:
    
        return org.telegram.messenger.gd.Z(2131747903, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0ab2, code lost:
    
        if (r1.P4() == false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0ac3, code lost:
    
        return org.telegram.messenger.gd.Z(2131747864, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0ac8, code lost:
    
        if (r1.h4() == false) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0ad9, code lost:
    
        return org.telegram.messenger.gd.Z(2131747882, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0ade, code lost:
    
        if (r1.t4() != false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0ae4, code lost:
    
        if (r1.J2() == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x0aea, code lost:
    
        r6 = r1.k;
        r10 = r6.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0af0, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0af8, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L509;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0b1c, code lost:
    
        return org.telegram.messenger.gd.Z(2131747873, y(r5), "📎 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0b2f, code lost:
    
        return org.telegram.messenger.gd.Z(2131747918, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x0b32, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0b36, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x0b3e, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0b52, code lost:
    
        return org.telegram.messenger.gd.Z(2131747907, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0b55, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0b57, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0b77, code lost:
    
        return org.telegram.messenger.gd.Z(2131747921, y(r5), org.telegram.messenger.i5.n(r10.first_name, r10.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0b7a, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0b7c, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0b82, code lost:
    
        if (r10.poll.quiz == false) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0ba0, code lost:
    
        return org.telegram.messenger.gd.Z(2131747885, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0bbd, code lost:
    
        return org.telegram.messenger.gd.Z(2131747888, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0bc0, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0be0, code lost:
    
        return org.telegram.messenger.gd.Z(2131747870, y(r5), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r10).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0be3, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0beb, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0c0f, code lost:
    
        return org.telegram.messenger.gd.Z(2131747873, y(r5), "🖼 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0c22, code lost:
    
        return org.telegram.messenger.gd.Z(2131747891, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0c28, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0c39, code lost:
    
        return org.telegram.messenger.gd.Z(2131747915, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0c3a, code lost:
    
        r6 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0c3c, code lost:
    
        if (r6 == null) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0c42, code lost:
    
        if (r6.length() <= 0) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0c44, code lost:
    
        r1 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0c4a, code lost:
    
        if (r1.length() <= 20) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0c4c, code lost:
    
        r3 = new java.lang.StringBuilder();
        r6 = 0;
        r3.append((java.lang.Object) r1.subSequence(0, 20));
        r3.append("...");
        r1 = r3.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0c62, code lost:
    
        r3 = new java.lang.Object[2];
        r3[r6] = y(r5);
        r3[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0c72, code lost:
    
        return org.telegram.messenger.gd.Z(2131747873, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0c61, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0c81, code lost:
    
        return org.telegram.messenger.gd.Z(2131747894, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0c91, code lost:
    
        return org.telegram.messenger.gd.Z(2131747909, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0c92, code lost:
    
        r1 = r1.V1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0c96, code lost:
    
        if (r1 == null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0caa, code lost:
    
        return org.telegram.messenger.gd.Z(2131747877, y(r5), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0cba, code lost:
    
        return org.telegram.messenger.gd.Z(2131747879, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0cbb, code lost:
    
        r1 = r31.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0cc1, code lost:
    
        if (r1 != null) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0ccb, code lost:
    
        return org.telegram.messenger.gd.Z(2131747893, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0cd0, code lost:
    
        if (r1.I3() == false) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0cdd, code lost:
    
        return org.telegram.messenger.gd.Z(2131747896, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0ce5, code lost:
    
        if (r1.H4() == false) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0cef, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0d0f, code lost:
    
        return org.telegram.messenger.gd.Z(2131747872, r3, "📹 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0d1e, code lost:
    
        return org.telegram.messenger.gd.Z(2131747866, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0d23, code lost:
    
        if (r1.q3() == false) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0d2d, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0d4d, code lost:
    
        return org.telegram.messenger.gd.Z(2131747872, r3, "🎬 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0d5c, code lost:
    
        return org.telegram.messenger.gd.Z(2131747902, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0d64, code lost:
    
        if (r1.P4() == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0d71, code lost:
    
        return org.telegram.messenger.gd.Z(2131747863, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0d76, code lost:
    
        if (r1.h4() == false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d83, code lost:
    
        return org.telegram.messenger.gd.Z(2131747881, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0d88, code lost:
    
        if (r1.t4() != false) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0d8e, code lost:
    
        if (r1.J2() == false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0d94, code lost:
    
        r6 = r1.k;
        r10 = r6.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0d9a, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0da2, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L611;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0dc2, code lost:
    
        return org.telegram.messenger.gd.Z(2131747872, r3, "📎 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0dd1, code lost:
    
        return org.telegram.messenger.gd.Z(2131747917, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0dd4, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0dd8, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L618;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0de0, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L622;
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0df0, code lost:
    
        return org.telegram.messenger.gd.Z(2131747906, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0df5, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0df7, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0e11, code lost:
    
        return org.telegram.messenger.gd.Z(2131747920, r3, org.telegram.messenger.i5.n(r10.first_name, r10.last_name));
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0e14, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L634;
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0e16, code lost:
    
        r1 = ((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r10).poll;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0e1c, code lost:
    
        if (r1.quiz == false) goto L632;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0e34, code lost:
    
        return org.telegram.messenger.gd.Z(2131747884, r3, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0e4b, code lost:
    
        return org.telegram.messenger.gd.Z(2131747887, r3, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0e4e, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0e6a, code lost:
    
        return org.telegram.messenger.gd.Z(2131747869, r3, ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r10).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0e6d, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0e75, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0e95, code lost:
    
        return org.telegram.messenger.gd.Z(2131747872, r3, "🖼 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0ea4, code lost:
    
        return org.telegram.messenger.gd.Z(2131747890, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0eaa, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0eb7, code lost:
    
        return org.telegram.messenger.gd.Z(2131747911, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x0eb8, code lost:
    
        r6 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:621:0x0eba, code lost:
    
        if (r6 == null) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:623:0x0ec0, code lost:
    
        if (r6.length() <= 0) goto L661;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x0ec2, code lost:
    
        r1 = r1.v;
     */
    /* JADX WARN: Code restructure failed: missing block: B:625:0x0ec8, code lost:
    
        if (r1.length() <= 20) goto L658;
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x0eca, code lost:
    
        r5 = new java.lang.StringBuilder();
        r6 = 0;
        r5.append((java.lang.Object) r1.subSequence(0, 20));
        r5.append("...");
        r1 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0ee2, code lost:
    
        r2 = new java.lang.Object[2];
        r2[r6] = r3;
        r2[1] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0eed, code lost:
    
        return org.telegram.messenger.gd.Z(2131747872, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0ee0, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0ef8, code lost:
    
        return org.telegram.messenger.gd.Z(2131747893, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0f04, code lost:
    
        return org.telegram.messenger.gd.Z(2131747905, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0f05, code lost:
    
        r1 = r1.V1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0f09, code lost:
    
        if (r1 == null) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0f19, code lost:
    
        return org.telegram.messenger.gd.Z(2131747876, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0f25, code lost:
    
        return org.telegram.messenger.gd.Z(2131747875, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0f28, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) == false) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0f2a, code lost:
    
        r1 = cg.d.f(((org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) r4).theme);
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0f36, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0f3a, code lost:
    
        if (r28 != r26) goto L679;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0f46, code lost:
    
        return org.telegram.messenger.gd.Z(2131752189, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0f57, code lost:
    
        return org.telegram.messenger.gd.Z(2131752190, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0f5c, code lost:
    
        if (r28 != r26) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0f69, code lost:
    
        return org.telegram.messenger.gd.Z(2131752192, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0f78, code lost:
    
        return org.telegram.messenger.gd.Z(2131752193, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x0f7b, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByRequest) == false) goto L691;
     */
    /* JADX WARN: Code restructure failed: missing block: B:662:0x0f83, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x0f86, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) == false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x0f88, code lost:
    
        r4 = (org.telegram.tgnet.TLRPC.TL_messageActionPrizeStars) r4;
        r1 = org.telegram.messenger.n5.o(r4.boost_peer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0f92, code lost:
    
        if (r1 < 0) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0f94, code lost:
    
        r1 = org.telegram.messenger.n10.l(getMessagesController().c2(java.lang.Long.valueOf(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x0fca, code lost:
    
        return org.telegram.messenger.gd.J((int) r4.stars, "BoostingReceivedStars", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0fa5, code lost:
    
        r1 = getMessagesController().O0(java.lang.Long.valueOf(-r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x0fb2, code lost:
    
        if (r1 != null) goto L699;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x0fb5, code lost:
    
        r7 = y(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x0fb9, code lost:
    
        r1 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x0fcd, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionPaymentRefunded) == false) goto L707;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x0fd5, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:679:0x0fd8, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoCompletions) == false) goto L711;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x0fe0, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x0fe3, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionTodoAppendTasks) == false) goto L715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x0feb, code lost:
    
        return r31.v.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x0ff3, code lost:
    
        if (r2.peer_id.channel_id == 0) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x0ff7, code lost:
    
        if (r5.megagroup != false) goto L726;
     */
    /* JADX WARN: Code restructure failed: missing block: B:691:0x0ffd, code lost:
    
        if (r31.I4() == false) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x1011, code lost:
    
        return org.telegram.messenger.gd.Z(2131752253, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x1024, code lost:
    
        return org.telegram.messenger.gd.Z(2131752319, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x102b, code lost:
    
        if (r31.I4() == false) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x1040, code lost:
    
        return org.telegram.messenger.gd.Z(2131747848, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x1054, code lost:
    
        return org.telegram.messenger.gd.Z(2131747849, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x1060, code lost:
    
        return org.telegram.messenger.gd.Z(2131747853, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x1065, code lost:
    
        if (r31.F3() == false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x106f, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.k.message) != false) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x1075, code lost:
    
        return O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x107a, code lost:
    
        return org.telegram.messenger.gd.M0(2131748410);
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x107b, code lost:
    
        r4 = 2131753945;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1085, code lost:
    
        if (r31.D != 29) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x108d, code lost:
    
        if ((org.telegram.messenger.fj.m1(r31) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x108f, code lost:
    
        r1 = (org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.fj.m1(r31);
        r2 = r1.extended_media.size();
        r3 = 0;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:718:0x109d, code lost:
    
        if (r3 >= r2) goto L923;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x109f, code lost:
    
        r8 = r1.extended_media.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:720:0x10a9, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) == false) goto L756;
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x10ab, code lost:
    
        r7 = ((org.telegram.tgnet.TLRPC.TL_messageExtendedMedia) r8).media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x10b1, code lost:
    
        if ((r7 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x10b9, code lost:
    
        if (org.telegram.messenger.fj.K4(r7.document) == false) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x10bb, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x10cb, code lost:
    
        if (r7 == false) goto L763;
     */
    /* JADX WARN: Code restructure failed: missing block: B:727:0x10cf, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x10d2, code lost:
    
        if (r2 != 1) goto L769;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x10d4, code lost:
    
        if (r7 == false) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x10d6, code lost:
    
        r4 = 2131753930;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x10d7, code lost:
    
        r1 = org.telegram.messenger.gd.M0(r4);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x10ee, code lost:
    
        r2 = new java.lang.Object[1];
        r2[r4] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x10f9, code lost:
    
        return org.telegram.messenger.gd.Z(2131753946, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x10de, code lost:
    
        if (r7 == false) goto L772;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x10e0, code lost:
    
        r1 = "Media";
     */
    /* JADX WARN: Code restructure failed: missing block: B:739:0x10e2, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x10e7, code lost:
    
        r1 = org.telegram.messenger.gd.G(r2, r1, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x10e4, code lost:
    
        r1 = "Photos";
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x10bd, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x10c1, code lost:
    
        if ((r8 instanceof org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) == false) goto L761;
     */
    /* JADX WARN: Code restructure failed: missing block: B:746:0x10c8, code lost:
    
        if ((((org.telegram.tgnet.TLRPC.TL_messageExtendedMediaPreview) r8).flags & 4) == 0) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x10fe, code lost:
    
        if (r31.S4() == false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x1107, code lost:
    
        return org.telegram.messenger.gd.M0(2131753948);
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x110c, code lost:
    
        if (r31.g4() == false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x1115, code lost:
    
        return org.telegram.messenger.gd.M0(2131753947);
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x1116, code lost:
    
        r2 = r31.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:757:0x111c, code lost:
    
        if ((r2.media instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:759:0x1124, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) != false) goto L790;
     */
    /* JADX WARN: Code restructure failed: missing block: B:761:0x1136, code lost:
    
        return "🖼 " + O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:763:0x113d, code lost:
    
        if (r31.k.media.ttl_seconds == 0) goto L794;
     */
    /* JADX WARN: Code restructure failed: missing block: B:765:0x1146, code lost:
    
        return org.telegram.messenger.gd.M0(2131753974);
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x114b, code lost:
    
        return org.telegram.messenger.gd.M0(2131753945);
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1150, code lost:
    
        if (r31.H4() == false) goto L808;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x115a, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.k.message) != false) goto L802;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x116c, code lost:
    
        return "📹 " + O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x1173, code lost:
    
        if (r31.k.media.ttl_seconds == 0) goto L806;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x117c, code lost:
    
        return org.telegram.messenger.gd.M0(2131753973);
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x1181, code lost:
    
        return org.telegram.messenger.gd.M0(2131753930);
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x118a, code lost:
    
        if ((org.telegram.messenger.fj.n1(r31.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L812;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x1193, code lost:
    
        return org.telegram.messenger.gd.M0(2131753969);
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x1198, code lost:
    
        if (r31.P4() == false) goto L816;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x11a1, code lost:
    
        return org.telegram.messenger.gd.M0(2131753979);
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x11a6, code lost:
    
        if (r31.h4() == false) goto L820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x11af, code lost:
    
        return org.telegram.messenger.gd.M0(2131753938);
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x11b4, code lost:
    
        if (r31.I3() == false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x11bd, code lost:
    
        return org.telegram.messenger.gd.M0(2131753949);
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x11be, code lost:
    
        r2 = r31.k;
        r3 = r2.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x11c4, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L828;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x11cd, code lost:
    
        return org.telegram.messenger.gd.M0(2131753976);
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x11d0, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L836;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x11d8, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r3).poll.quiz == false) goto L834;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x11e1, code lost:
    
        return org.telegram.messenger.gd.M0(2131746249);
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x11e9, code lost:
    
        return org.telegram.messenger.gd.M0(2131746991);
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x11ec, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x11f5, code lost:
    
        return org.telegram.messenger.gd.M0(2131743864);
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x11f8, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaWidget) == false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x1200, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) == false) goto L846;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x1209, code lost:
    
        return org.telegram.messenger.gd.M0(2131753923);
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x120e, code lost:
    
        return O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x1211, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L852;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x121a, code lost:
    
        return org.telegram.messenger.gd.M0(2131753489);
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x121d, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveawayResults) == false) goto L856;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x1226, code lost:
    
        return org.telegram.messenger.gd.M0(2131753389);
     */
    /* JADX WARN: Code restructure failed: missing block: B:829:0x1229, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeo) != false) goto L910;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x122d, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaVenue) == false) goto L861;
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x1233, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGeoLive) == false) goto L865;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x123c, code lost:
    
        return org.telegram.messenger.gd.M0(2131753963);
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x123f, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x1245, code lost:
    
        if (r31.t4() != false) goto L886;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x124b, code lost:
    
        if (r31.J2() == false) goto L872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x1252, code lost:
    
        if (r31.q3() == false) goto L880;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x125c, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.k.message) != false) goto L878;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x126e, code lost:
    
        return "🎬 " + O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x1276, code lost:
    
        return org.telegram.messenger.gd.M0(2131753968);
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x127f, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.k.message) != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x1291, code lost:
    
        return "📎 " + O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x1299, code lost:
    
        return org.telegram.messenger.gd.M0(2131753972);
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x129a, code lost:
    
        r1 = r31.V1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x12a1, code lost:
    
        if (r1 == null) goto L890;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x12a3, code lost:
    
        r1 = p5.c.n(r1, " ");
        r1.append(org.telegram.messenger.gd.M0(2131753933));
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x12b4, code lost:
    
        return r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x12b9, code lost:
    
        return org.telegram.messenger.gd.M0(2131753933);
     */
    /* JADX WARN: Code restructure failed: missing block: B:863:0x12bc, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaStory) == false) goto L904;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x12c2, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaStory) r3).via_mention == false) goto L902;
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x12c4, code lost:
    
        r1 = r32[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x12c8, code lost:
    
        if (r1 != null) goto L899;
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x12d9, code lost:
    
        return org.telegram.messenger.gd.Z(2131744351, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x12cc, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x12e1, code lost:
    
        return org.telegram.messenger.gd.M0(2131744494);
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x12e8, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.v) != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x12ee, code lost:
    
        return O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x12f3, code lost:
    
        return org.telegram.messenger.gd.M0(2131748410);
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x12fb, code lost:
    
        return org.telegram.messenger.gd.M0(2131753958);
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
    public final String w(fj fjVar, String[] strArr, boolean[] zArr) {
        boolean z10;
        long j3;
        String y10;
        long j10;
        TLRPC.Chat chat;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer2;
        if (g0.o2() || bz.C) {
            return gd.M0(2131747825);
        }
        TLRPC.Message message = fjVar.k;
        boolean z11 = fjVar.f;
        String str = fjVar.b;
        long j11 = message.dialog_id;
        TLRPC.Peer peer3 = message.peer_id;
        long j12 = peer3.chat_id;
        if (j12 == 0) {
            j12 = peer3.channel_id;
        }
        long j13 = peer3.user_id;
        zArr[0] = true;
        SharedPreferences d = getAccountInstance().d();
        boolean w10 = f3.w("content_preview_", j11, d, true);
        if (fjVar.i3()) {
            if (j12 == 0 && j13 != 0) {
                if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = str;
                }
                if (!w10 || !d.getBoolean("EnablePreviewAll", true)) {
                    zArr[0] = false;
                    return gd.M0(2131748410);
                }
            } else if (j12 != 0) {
                if (fjVar.k.peer_id.channel_id == 0 || fjVar.A4()) {
                    strArr[0] = fjVar.c;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = str;
                }
                if (!w10 || ((!z11 && !d.getBoolean("EnablePreviewGroup", true)) || (z11 && !d.getBoolean("EnablePreviewChannel", true)))) {
                    zArr[0] = false;
                    return (fjVar.k.peer_id.channel_id == 0 || fjVar.A4()) ? gd.Z(2131747796, fjVar.c, str) : gd.Z(2131752354, str);
                }
            }
            return O(fjVar);
        }
        long e10 = getUserConfig().e();
        if (j13 == 0) {
            j13 = fjVar.Z0();
            if (j13 == 0) {
                j13 = -j12;
            }
        } else if (j13 == e10) {
            j13 = fjVar.Z0();
        }
        if (j11 == 0) {
            if (j12 != 0) {
                j11 = -j12;
            } else if (j13 != 0) {
                j11 = j13;
            }
        }
        if (n10.z(j11) && (messageFwdHeader2 = fjVar.k.fwd_from) != null && (peer2 = messageFwdHeader2.from_id) != null) {
            j13 = fj.B1(peer2);
        }
        if (j13 > 0) {
            z10 = w10;
            j3 = e10;
            TLRPC.User c22 = getMessagesController().c2(Long.valueOf(j13));
            if (c22 != null) {
                y10 = n10.q(c22);
                if (j12 != 0) {
                    strArr[0] = y10;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = y10;
                } else {
                    strArr[0] = null;
                }
            }
            y10 = null;
        } else {
            z10 = w10;
            j3 = e10;
            TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-j13));
            if (O0 != null) {
                y10 = y(O0);
                strArr[0] = y10;
            }
            y10 = null;
        }
        if (y10 != null && j13 > 0 && n10.z(j11) && (messageFwdHeader = fjVar.k.fwd_from) != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long B1 = fj.B1(peer);
            if (n5.z(B1)) {
                j10 = j11;
                TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(-B1));
                if (O02 != null) {
                    StringBuilder n10 = p5.c.n(y10, " @ ");
                    n10.append(y(O02));
                    y10 = n10.toString();
                    if (strArr[0] != null) {
                        strArr[0] = y10;
                    }
                }
                if (y10 != null) {
                    if (j12 != 0) {
                        chat = getMessagesController().O0(Long.valueOf(j12));
                        if (chat != null) {
                            if (v3.T(chat) && !chat.megagroup && Build.VERSION.SDK_INT <= 27) {
                                strArr[0] = null;
                            }
                        }
                    } else {
                        chat = null;
                    }
                    if (n5.C(j10)) {
                        strArr[0] = null;
                        return gd.M0(2131747825);
                    }
                    boolean z12 = v3.T(chat) && !chat.megagroup;
                    TLRPC.Message message2 = fjVar.k;
                    if (message2 != null && message2.rich_message != null) {
                        return fjVar.v.toString();
                    }
                    if (z10) {
                        boolean z13 = (j12 != 0 || j13 == 0) ? true : true;
                        if (j12 != 0) {
                            if (!z12) {
                            }
                            if (z12) {
                            }
                        }
                    }
                    zArr[0] = false;
                    return gd.M0(2131748410);
                }
                return null;
            }
        }
        j10 = j11;
        if (y10 != null) {
        }
        return null;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v37 org.telegram.tgnet.TLRPC$Chat, still in use, count: 2, list:
          (r5v37 org.telegram.tgnet.TLRPC$Chat) from 0x0199: IF  (r5v37 org.telegram.tgnet.TLRPC$Chat) == (null org.telegram.tgnet.TLRPC$Chat)  -> B:979:0x17f6 A[HIDDEN]
          (r5v37 org.telegram.tgnet.TLRPC$Chat) from 0x019f: PHI (r5v2 org.telegram.tgnet.TLRPC$Chat) = (r5v1 org.telegram.tgnet.TLRPC$Chat), (r5v37 org.telegram.tgnet.TLRPC$Chat) binds: [B:978:0x019d, B:76:0x0199] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String x(org.telegram.messenger.fj r31, boolean[] r32) {
        /*
            Method dump skipped, instructions count: 6159
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.xs.x(org.telegram.messenger.fj, boolean[]):java.lang.String");
    }

    public final String y(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        return chat.monoforum ? qg.c.j(this.currentAccount, chat, false) : chat.title;
    }

    public final int z() {
        int i7 = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            if (i10.i(i10).p() && (bz.Q0 || i10.t0 == i10)) {
                xs t6 = t(i10);
                if (t6.S) {
                    if (t6.U) {
                        if (t6.T) {
                            try {
                                ArrayList arrayList = new ArrayList(mp.u1(i10).y);
                                int size = arrayList.size();
                                for (int i11 = 0; i11 < size; i11++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i11);
                                    if (dialog != null && n5.z(dialog.id)) {
                                        TLRPC.Chat O0 = getMessagesController().O0(Long.valueOf(-dialog.id));
                                        if (!v3.r0(O0)) {
                                            if (v3.Y(O0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i7 += mp.u1(i10).X0(dialog);
                                    }
                                }
                            } catch (Exception e10) {
                                a8.g(e10, true);
                            }
                        } else {
                            i7 += t6.J;
                        }
                    } else if (t6.T) {
                        try {
                            int size2 = mp.u1(i10).y.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) mp.u1(i10).y.get(i12);
                                if (n5.z(dialog2.id)) {
                                    TLRPC.Chat O02 = getMessagesController().O0(Long.valueOf(-dialog2.id));
                                    if (!v3.r0(O02)) {
                                        if (v3.Y(O02)) {
                                        }
                                    }
                                }
                                if (mp.u1(i10).X0(dialog2) != 0) {
                                    i7++;
                                }
                            }
                        } catch (Exception e11) {
                            a8.g(e11, false);
                        }
                    } else {
                        i7 += t6.f.m();
                    }
                }
            }
        }
        return i7;
    }
}
