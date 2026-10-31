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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ot extends f1 implements us {
    public static String j0;
    public static e0.k0 l0;
    public static NotificationManager m0;
    public static AudioManager o0;
    public static volatile ot[] p0;
    public static final Object[] q0;
    public static final a0.h r0;
    public final ArrayList D;
    public final a0.h E;
    public long F;
    public long G;
    public int H;
    public int I;
    public int J;
    public boolean K;
    public int L;
    public boolean M;
    public int N;
    public long O;
    public Boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final at U;
    public final PowerManager.WakeLock V;
    public long W;
    public SoundPool X;
    public int Y;
    public int Z;
    public final ArrayList a;
    public boolean a0;
    public final ArrayList b;
    public boolean b0;
    public final a0.h c;
    public final AlarmManager c0;
    public final a0.h d;
    public final int d0;
    public final a0.h e;
    public final String e0;
    public final a0.h f;
    public final nh.i f0;
    public final pt g0;
    public final a0.h h;
    public final char[] h0;
    public final at i0;
    public final a0.h n;
    public final a0.h r;
    public final HashSet s;
    public final ArrayList w;
    public ArrayList x;
    public final HashSet y;
    public static final r5 k0 = new r5("notificationsQueue");
    public static final long n0 = o5.F(1);

    static {
        l0 = null;
        m0 = null;
        if (Build.VERSION.SDK_INT >= 26 && w0.b != null) {
            l0 = new e0.k0(w0.b);
            m0 = (NotificationManager) w0.b.getSystemService("notification");
            i();
        }
        o0 = (AudioManager) w0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        p0 = new ot[4];
        q0 = new Object[4];
        for (int i10 = 0; i10 < 4; i10++) {
            q0[i10] = new Object();
        }
        r0 = new a0.h();
    }

    public ot(int i10) {
        super(i10);
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
        this.D = new ArrayList();
        this.E = new a0.h();
        this.F = 0L;
        this.G = 0L;
        this.H = 5000;
        int i11 = 0;
        this.I = 0;
        this.J = 0;
        this.K = false;
        this.L = 0;
        this.N = -1;
        this.f0 = new nh.i();
        this.h0 = new char[]{10252, 10338, 10385, 10280, 10277, 10286, 10321};
        this.i0 = new at(this, 12);
        this.d0 = this.currentAccount + 1;
        StringBuilder sb2 = new StringBuilder("messages");
        int i12 = this.currentAccount;
        sb2.append(i12 == 0 ? "" : Integer.valueOf(i12));
        this.e0 = sb2.toString();
        SharedPreferences c10 = getAccountInstance().c();
        this.M = c10.getBoolean("EnableInChatSound", true);
        this.R = c10.getBoolean("badgeNumber", true);
        this.S = c10.getBoolean("badgeNumberMuted", false);
        this.T = c10.getBoolean("badgeNumberMessages", true);
        l0 = new e0.k0(w0.b);
        m0 = (NotificationManager) w0.b.getSystemService("notification");
        try {
            o0 = (AudioManager) w0.b.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        } catch (Exception e) {
            f8.g(e, true);
        }
        try {
            this.c0 = (AlarmManager) w0.b.getSystemService("alarm");
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        try {
            PowerManager.WakeLock newWakeLock = ((PowerManager) w0.b.getSystemService("power")).newWakeLock(1, "telegram:notification_delay_lock");
            this.V = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        } catch (Exception e10) {
            f8.g(e10, true);
        }
        this.U = new at(this, 13);
        this.g0 = new pt(this.currentAccount);
        i0.g3(new at(this, i11));
    }

    public static boolean E(jj jjVar) {
        TLRPC.MessageAction messageAction;
        TLRPC.Message message = jjVar.k;
        TLRPC.Peer peer = message.peer_id;
        return (peer != null && peer.chat_id == 0 && peer.channel_id == 0 && ((messageAction = message.action) == null || (messageAction instanceof TLRPC.TL_messageActionEmpty))) || jjVar.J;
    }

    public static Bitmap F(ArrayList arrayList) {
        int i10;
        Bitmap bitmap;
        Paint paint;
        boolean z10;
        float f7;
        char c10;
        float size;
        float size2;
        float f10;
        float f11;
        float f12;
        float f13;
        Object obj;
        ArrayList arrayList2 = arrayList;
        if (Build.VERSION.SDK_INT < 28 || arrayList2.size() == 0) {
            return null;
        }
        int L = i0.L(64.0f);
        Bitmap createBitmap = Bitmap.createBitmap(L, L, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Matrix matrix = new Matrix();
        Paint paint2 = new Paint(3);
        boolean z11 = true;
        Paint paint3 = new Paint(1);
        Rect rect = new Rect();
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        float f14 = arrayList2.size() == 1 ? 1.0f : arrayList2.size() == 2 ? 0.65f : 0.5f;
        int i11 = 0;
        TextPaint textPaint = null;
        while (i11 < arrayList2.size()) {
            float f15 = L;
            float f16 = (1.0f - f14) * f15;
            try {
                size = (f16 / arrayList2.size()) * ((arrayList2.size() - 1) - i11);
                size2 = i11 * (f16 / arrayList2.size());
                f10 = f15 * f14;
                f11 = f10 / 2.0f;
                i10 = L;
                f12 = size + f11;
                bitmap = createBitmap;
                f13 = size2 + f11;
                f7 = f14;
                try {
                    canvas.drawCircle(f12, f13, i0.L(2.0f) + f11, paint3);
                    obj = arrayList2.get(i11);
                    paint = paint3;
                } catch (Throwable unused) {
                    paint = paint3;
                }
            } catch (Throwable unused2) {
                i10 = L;
                bitmap = createBitmap;
                paint = paint3;
                z10 = z11;
                f7 = f14;
            }
            if (obj instanceof File) {
                String absolutePath = ((File) arrayList2.get(i11)).getAbsolutePath();
                BitmapFactory.Options options = new BitmapFactory.Options();
                z10 = true;
                try {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeFile(absolutePath, options);
                    int i12 = (int) f10;
                    options.inSampleSize = vh.n5.d(options, i12, i12);
                    try {
                        options.inJustDecodeBounds = false;
                        options.inDither = true;
                        Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                        matrix.reset();
                        matrix.postScale(f10 / decodeFile.getWidth(), f10 / decodeFile.getHeight());
                        matrix.postTranslate(size, size2);
                        bitmapShader.setLocalMatrix(matrix);
                        paint2.setShader(bitmapShader);
                        canvas.drawCircle(f12, f13, f11, paint2);
                        decodeFile.recycle();
                    } catch (Throwable unused3) {
                        c10 = 2;
                    }
                } catch (Throwable unused4) {
                    c10 = 2;
                    i11++;
                    z11 = z10;
                    L = i10;
                    createBitmap = bitmap;
                    f14 = f7;
                    paint3 = paint;
                    arrayList2 = arrayList;
                }
            } else if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                c10 = 2;
                try {
                    paint2.setShader(new LinearGradient(size, size2, size, size2 + f10, new int[]{org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.p8[org.telegram.ui.Components.r8.e(user.id)], false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q8[org.telegram.ui.Components.r8.e(user.id)], false)}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                    canvas.drawCircle(f12, f13, f11, paint2);
                    if (textPaint == null) {
                        try {
                            z10 = true;
                            try {
                                TextPaint textPaint2 = new TextPaint(1);
                                try {
                                    textPaint2.setTypeface(i0.o());
                                    textPaint2.setTextSize(f15 * 0.25f);
                                    textPaint2.setColor(-1);
                                    textPaint = textPaint2;
                                } catch (Throwable unused5) {
                                    textPaint = textPaint2;
                                    i11++;
                                    z11 = z10;
                                    L = i10;
                                    createBitmap = bitmap;
                                    f14 = f7;
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
                    org.telegram.ui.Components.r8.a(user.first_name, user.last_name, null, sb2);
                    String sb3 = sb2.toString();
                    try {
                        textPaint.getTextBounds(sb3, 0, sb3.length(), rect);
                        canvas.drawText(sb3, (f12 - (rect.width() / 2.0f)) - rect.left, (f13 - (rect.height() / 2.0f)) - rect.top, textPaint);
                    } catch (Throwable unused8) {
                    }
                } catch (Throwable unused9) {
                }
                i11++;
                z11 = z10;
                L = i10;
                createBitmap = bitmap;
                f14 = f7;
                paint3 = paint;
                arrayList2 = arrayList;
            }
            c10 = 2;
            z10 = true;
            i11++;
            z11 = z10;
            L = i10;
            createBitmap = bitmap;
            f14 = f7;
            paint3 = paint;
            arrayList2 = arrayList;
        }
        return createBitmap;
    }

    public static void W(Notification notification, e0.r rVar, boolean z10) {
        if (z10) {
            rVar.y = j0;
        } else {
            rVar.y = notification.getChannelId();
        }
    }

    public static void a(ot otVar, String str, long j10) {
        boolean z10;
        String L0;
        if (otVar.getUserConfig().p()) {
            if (tz.Q0 || otVar.currentAccount == d20.s0) {
                try {
                    String str2 = "wallet_tonconnect_" + otVar.currentAccount;
                    if (Build.VERSION.SDK_INT >= 26) {
                        m0.createNotificationChannel(new NotificationChannel(str2, "TON Connect", 3));
                    }
                    boolean z11 = false;
                    if (!i0.p2(false) && !tz.C && otVar.getAccountInstance().c().getBoolean("EnablePreviewAll", true)) {
                        z10 = false;
                        if (!TextUtils.isEmpty(str) && !z10) {
                            L0 = cd.a0(null, null, 2131747941, str);
                            Intent intent = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                            intent.setAction("android.intent.action.VIEW");
                            intent.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                            intent.putExtra("currentAccount", otVar.currentAccount);
                            intent.addFlags(67108864);
                            PendingIntent activity = PendingIntent.getActivity(w0.b, otVar.currentAccount, intent, 201326592);
                            e0.r rVar = new e0.r(w0.b, str2);
                            rVar.F.icon = R.drawable.notification;
                            rVar.e = e0.r.d(cd.L0(R.string.AppName, null));
                            rVar.f = e0.r.d(L0);
                            e0.m mVar = new e0.m(z11);
                            mVar.f = e0.r.d(L0);
                            rVar.n(mVar);
                            rVar.u = "event";
                            rVar.x = 0;
                            rVar.F.when = j10;
                            rVar.h(16, true);
                            rVar.g = activity;
                            l0.e("wallet_tonconnect", otVar.currentAccount, rVar.b());
                        }
                        L0 = cd.L0(2131747942, null);
                        Intent intent2 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent2.putExtra("currentAccount", otVar.currentAccount);
                        intent2.addFlags(67108864);
                        PendingIntent activity2 = PendingIntent.getActivity(w0.b, otVar.currentAccount, intent2, 201326592);
                        e0.r rVar2 = new e0.r(w0.b, str2);
                        rVar2.F.icon = R.drawable.notification;
                        rVar2.e = e0.r.d(cd.L0(R.string.AppName, null));
                        rVar2.f = e0.r.d(L0);
                        e0.m mVar2 = new e0.m(z11);
                        mVar2.f = e0.r.d(L0);
                        rVar2.n(mVar2);
                        rVar2.u = "event";
                        rVar2.x = 0;
                        rVar2.F.when = j10;
                        rVar2.h(16, true);
                        rVar2.g = activity2;
                        l0.e("wallet_tonconnect", otVar.currentAccount, rVar2.b());
                    }
                    z10 = true;
                    if (!TextUtils.isEmpty(str)) {
                        L0 = cd.a0(null, null, 2131747941, str);
                        Intent intent22 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                        intent22.setAction("android.intent.action.VIEW");
                        intent22.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                        intent22.putExtra("currentAccount", otVar.currentAccount);
                        intent22.addFlags(67108864);
                        PendingIntent activity22 = PendingIntent.getActivity(w0.b, otVar.currentAccount, intent22, 201326592);
                        e0.r rVar22 = new e0.r(w0.b, str2);
                        rVar22.F.icon = R.drawable.notification;
                        rVar22.e = e0.r.d(cd.L0(R.string.AppName, null));
                        rVar22.f = e0.r.d(L0);
                        e0.m mVar22 = new e0.m(z11);
                        mVar22.f = e0.r.d(L0);
                        rVar22.n(mVar22);
                        rVar22.u = "event";
                        rVar22.x = 0;
                        rVar22.F.when = j10;
                        rVar22.h(16, true);
                        rVar22.g = activity22;
                        l0.e("wallet_tonconnect", otVar.currentAccount, rVar22.b());
                    }
                    L0 = cd.L0(2131747942, null);
                    Intent intent222 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                    intent222.setAction("android.intent.action.VIEW");
                    intent222.setData(Uri.parse("tg://resolve?domain=sendgrams"));
                    intent222.putExtra("currentAccount", otVar.currentAccount);
                    intent222.addFlags(67108864);
                    PendingIntent activity222 = PendingIntent.getActivity(w0.b, otVar.currentAccount, intent222, 201326592);
                    e0.r rVar222 = new e0.r(w0.b, str2);
                    rVar222.F.icon = R.drawable.notification;
                    rVar222.e = e0.r.d(cd.L0(R.string.AppName, null));
                    rVar222.f = e0.r.d(L0);
                    e0.m mVar222 = new e0.m(z11);
                    mVar222.f = e0.r.d(L0);
                    rVar222.n(mVar222);
                    rVar222.u = "event";
                    rVar222.x = 0;
                    rVar222.F.when = j10;
                    rVar222.h(16, true);
                    rVar222.g = activity222;
                    l0.e("wallet_tonconnect", otVar.currentAccount, rVar222.b());
                } catch (Exception e) {
                    f8.g(e, true);
                }
            }
        }
    }

    public static void b(ot otVar) {
        try {
            SharedPreferences c10 = otVar.getAccountInstance().c();
            Map<String, ?> all = c10.getAll();
            SharedPreferences.Editor edit = c10.edit();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                if (key.startsWith("org.telegram.key")) {
                    if (!key.endsWith("_s")) {
                        String str = (String) entry.getValue();
                        m0.deleteNotificationChannel(str);
                        if (v2.a) {
                            f8.b("delete all channel " + str);
                        }
                    }
                    edit.remove(key);
                }
            }
            edit.commit();
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public static void c(ot otVar) {
        PowerManager.WakeLock wakeLock = otVar.V;
        l0.b(otVar.currentAccount, "wallet_tonconnect");
        otVar.F = 0L;
        otVar.G = 0L;
        otVar.I = 0;
        otVar.J = 0;
        otVar.a.clear();
        otVar.c.b();
        otVar.d.b();
        otVar.f.b();
        otVar.h.b();
        otVar.n.b();
        otVar.y.clear();
        otVar.b.clear();
        otVar.K = false;
        otVar.N = 0;
        try {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        otVar.p();
        otVar.S(otVar.z());
        SharedPreferences.Editor edit = otVar.getAccountInstance().c().edit();
        edit.clear();
        edit.commit();
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                m0.deleteNotificationChannelGroup("channels" + otVar.currentAccount);
                m0.deleteNotificationChannelGroup("groups" + otVar.currentAccount);
                m0.deleteNotificationChannelGroup("private" + otVar.currentAccount);
                m0.deleteNotificationChannelGroup("stories" + otVar.currentAccount);
                m0.deleteNotificationChannelGroup("other" + otVar.currentAccount);
                String str = otVar.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = m0.getNotificationChannels();
                int size = notificationChannels.size();
                for (int i10 = 0; i10 < size; i10++) {
                    String id2 = notificationChannels.get(i10).getId();
                    if (id2.startsWith(str)) {
                        try {
                            m0.deleteNotificationChannel(id2);
                        } catch (Exception e7) {
                            f8.g(e7, true);
                        }
                        if (v2.a) {
                            f8.b("delete channel cleanup " + id2);
                        }
                    }
                }
            } catch (Throwable th2) {
                f8.g(th2, true);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02b9, code lost:
    
        if (org.telegram.messenger.ot.o0.getRingerMode() == 0) goto L139;
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
    public static void e(ot otVar, ArrayList arrayList, ArrayList arrayList2, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        int i10;
        Integer num;
        long j10;
        int i11;
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
        jj jjVar;
        ot otVar2;
        SparseArray sparseArray;
        jj jjVar2;
        ot otVar3 = otVar;
        a0.h hVar = new a0.h();
        SharedPreferences c10 = otVar3.getAccountInstance().c();
        boolean z16 = true;
        boolean z17 = c10.getBoolean("PinnedMessages", true);
        int i12 = 0;
        boolean z18 = false;
        int i13 = 0;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        while (i12 < arrayList.size()) {
            jj jjVar3 = (jj) arrayList.get(i12);
            if (jjVar3.k != null) {
                if (!jjVar3.y3()) {
                    TLRPC.Message message = jjVar3.k;
                    TLRPC.MessageAction messageAction = message.action;
                    if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL)) {
                        if (message.silent) {
                            if (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp)) {
                            }
                        }
                    }
                }
                if (v2.a) {
                    f8.b("skipped message because 1");
                }
                i11 = i12;
                z14 = z18;
                otVar2 = otVar3;
                z18 = z14;
                i12 = i11 + 1;
                otVar3 = otVar2;
                z16 = true;
            }
            if (!jj.E4(jjVar3)) {
                if (jjVar3.K) {
                    long currentTimeMillis = jjVar3.k == null ? System.currentTimeMillis() : r5.date * 1000;
                    long B0 = jj.B0(jjVar3.k);
                    int f12 = jjVar3.f1();
                    nt ntVar = (nt) otVar3.E.f(B0);
                    if (ntVar != null) {
                        ntVar.c.put(Integer.valueOf(f12), new Pair(Long.valueOf(currentTimeMillis), Long.valueOf(currentTimeMillis + 86400000)));
                        boolean z22 = ntVar.d;
                        boolean z23 = jjVar3.M;
                        if (z22 != z23) {
                            ntVar.d = z23;
                            z21 = z16;
                        }
                        ntVar.e = ntVar.a();
                        hs messagesStorage = otVar3.getMessagesStorage();
                        messagesStorage.a.c(new hr(4, messagesStorage, ntVar));
                        z19 = z16;
                    } else {
                        nt ntVar2 = new nt(jjVar3.b, B0, f12, currentTimeMillis, currentTimeMillis + 86400000);
                        ntVar2.d = jjVar3.M;
                        otVar3.D.add(ntVar2);
                        otVar3.E.k(ntVar2, B0);
                        hs messagesStorage2 = otVar3.getMessagesStorage();
                        messagesStorage2.a.c(new hr(4, messagesStorage2, ntVar2));
                        z18 = z16;
                        z21 = z18;
                    }
                    Collections.sort(otVar3.D, Comparator$-CC.comparingLong(new uk(1)));
                    otVar2 = otVar3;
                    i11 = i12;
                    i12 = i11 + 1;
                    otVar3 = otVar2;
                    z16 = true;
                } else {
                    if (jjVar3.O) {
                        TLRPC.Message message2 = jjVar3.k;
                        if (message2 != null) {
                            int i14 = message2.id;
                            long j21 = message2.date + 60;
                            long currentTime = ConnectionsManager.getInstance(otVar3.currentAccount).getCurrentTime();
                            if (currentTime <= j21) {
                                i0.h3(new gt(otVar3, i14, 6), (j21 - currentTime) * 1000);
                            }
                        }
                        i11 = i12;
                        z14 = z18;
                        otVar2 = otVar3;
                        z18 = z14;
                        i12 = i11 + 1;
                        otVar3 = otVar2;
                        z16 = true;
                    }
                    int f13 = jjVar3.f1();
                    long j22 = jjVar3.i3() ? jjVar3.k.random_id : 0L;
                    long B02 = jj.B0(jjVar3.k);
                    if (jjVar3.i3()) {
                        j10 = 0;
                        z13 = jjVar3.f;
                        i11 = i12;
                    } else {
                        j10 = 0;
                        if (o5.z(B02)) {
                            i11 = i12;
                            TLRPC.Chat L0 = otVar3.getMessagesController().L0(Long.valueOf(-B02));
                            z13 = w3.T(L0) && !L0.megagroup;
                        } else {
                            i11 = i12;
                            z13 = false;
                        }
                    }
                    if (jjVar3.J) {
                        j11 = jj.B0(jjVar3.k);
                    } else {
                        long j23 = jjVar3.k.peer_id.channel_id;
                        j11 = j23 != j10 ? -j23 : j10;
                    }
                    SparseArray sparseArray2 = (SparseArray) otVar3.c.f(j11);
                    jj jjVar4 = sparseArray2 != null ? (jj) sparseArray2.get(f13) : null;
                    z14 = z18;
                    if (jjVar4 == null) {
                        j12 = B02;
                        long j24 = jjVar3.k.random_id;
                        if (j24 != j10 && (jjVar4 = (jj) otVar3.d.f(j24)) != null) {
                            otVar3.d.l(jjVar3.k.random_id);
                        }
                    } else {
                        j12 = B02;
                    }
                    jj jjVar5 = jjVar4;
                    if (jjVar5 != null) {
                        if (jjVar5.i3()) {
                            if (sparseArray2 == null) {
                                sparseArray2 = new SparseArray();
                                otVar3.c.k(sparseArray2, j11);
                            }
                            sparseArray2.put(f13, jjVar3);
                            int indexOf = otVar3.a.indexOf(jjVar5);
                            if (indexOf >= 0) {
                                otVar3.a.set(indexOf, jjVar3);
                                boolean z24 = z13;
                                jjVar2 = jjVar3;
                                i13 = g(arrayList2, jjVar2, j12, z24, c10);
                            } else {
                                jjVar2 = jjVar3;
                            }
                            if (z10) {
                                boolean z25 = jjVar2.i;
                                if (z25) {
                                    hs messagesStorage3 = otVar3.getMessagesStorage();
                                    messagesStorage3.a.c(new e4(8, messagesStorage3, jjVar2));
                                }
                                z19 = z25;
                            }
                        }
                        if (v2.a) {
                            f8.b("skipped message because old message with same dialog and message ids exist: did=" + j11 + ", mid=" + f13);
                        }
                    } else {
                        boolean z26 = z13;
                        if (!z19) {
                            if (!z10 || jjVar3.O) {
                                j13 = j11;
                            } else {
                                hs messagesStorage4 = otVar3.getMessagesStorage();
                                j13 = j11;
                                messagesStorage4.a.c(new e4(8, messagesStorage4, jjVar3));
                            }
                            long c22 = jj.c2(otVar3.currentAccount, jjVar3.k, otVar3.getMessagesController().t2(jjVar3), false);
                            if (j12 != otVar3.F || !w0.w || jjVar3.J || jjVar3.O) {
                                TLRPC.Message message3 = jjVar3.k;
                                if (!message3.mentioned) {
                                    str = ")";
                                    j14 = j12;
                                } else if (z17 || !(message3.action instanceof TLRPC.TL_messageActionPinMessage)) {
                                    str = ")";
                                    j14 = jjVar3.Z0();
                                } else if (v2.a) {
                                    f8.b("skipped message because message is mention of pinned");
                                }
                                if (E(jjVar3)) {
                                    str2 = str;
                                    otVar3.J++;
                                } else {
                                    str2 = str;
                                }
                                int h = hVar.h(j14);
                                if (h < 0 || c22 != j10) {
                                    int u10 = otVar3.u(j14, c22);
                                    if (u10 == -1) {
                                        long j25 = j14;
                                        String str4 = str2;
                                        sharedPreferences = c10;
                                        str3 = str4;
                                        j15 = c22;
                                        j17 = j22;
                                        j18 = j12;
                                        j19 = j13;
                                        j16 = j25;
                                        boolean D = otVar.D(j16, Boolean.valueOf(z26), jjVar3.I, jjVar3.J);
                                        if (v2.a) {
                                            f8.b("NotificationsController: process new messages, isGlobalNotificationsEnabled(" + j16 + ", " + z26 + ", " + jjVar3.I + ", " + jjVar3.J + ") = " + D);
                                        }
                                        z15 = D;
                                    } else {
                                        String str5 = str2;
                                        sharedPreferences = c10;
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
                                    sharedPreferences = c10;
                                    str3 = str6;
                                    j15 = c22;
                                    j16 = j14;
                                    j17 = j22;
                                    j18 = j12;
                                    j19 = j13;
                                }
                                if (v2.a) {
                                    f8.b("NotificationsController: process new messages, value is " + z15 + " (" + j16 + ", " + z26 + ", " + jjVar3.I + ", " + jjVar3.J + str3);
                                }
                                if (z15) {
                                    if (z10) {
                                        j20 = j16;
                                        jjVar = jjVar3;
                                        c10 = sharedPreferences;
                                        otVar2 = otVar;
                                    } else {
                                        long j26 = j16;
                                        jjVar = jjVar3;
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        otVar2 = otVar;
                                        i13 = g(arrayList2, jjVar, j26, z26, sharedPreferences2);
                                        j20 = j26;
                                        c10 = sharedPreferences2;
                                    }
                                    if (!z20) {
                                        z20 = jjVar.k.from_scheduled;
                                    }
                                    otVar2.b.add(jjVar);
                                    otVar2.h(jjVar);
                                    if (f13 != 0) {
                                        if (sparseArray2 == null) {
                                            sparseArray = new SparseArray();
                                            otVar2.c.k(sparseArray, j19);
                                        } else {
                                            sparseArray = sparseArray2;
                                        }
                                        sparseArray.put(f13, jjVar);
                                    } else if (j17 != j10) {
                                        otVar2.d.k(jjVar, j17);
                                    }
                                    long j27 = j18;
                                    if (j27 != j20) {
                                        Integer num2 = (Integer) otVar2.r.f(j27);
                                        otVar2.r.k(Integer.valueOf(num2 == null ? 1 : num2.intValue() + 1), j27);
                                    }
                                } else {
                                    j20 = j16;
                                    jjVar = jjVar3;
                                    c10 = sharedPreferences;
                                    otVar2 = otVar;
                                }
                                if (jjVar.I) {
                                    SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                                    sparseBooleanArray.put(f13, true);
                                    otVar2.getMessagesController().P(j20, j15, sparseBooleanArray, true);
                                }
                                z18 = true;
                                i12 = i11 + 1;
                                otVar3 = otVar2;
                                z16 = true;
                            } else {
                                if (!z10 && otVar3.M && !MediaController.B().J()) {
                                    try {
                                    } catch (Exception e) {
                                        f8.g(e, true);
                                    }
                                }
                                if (v2.a) {
                                    f8.b("skipped message because chat is already opened (openedDialogId = " + otVar3.F + ")");
                                }
                            }
                        } else if (v2.a) {
                            f8.b("skipped message because edited");
                        }
                    }
                    otVar2 = otVar3;
                    z18 = z14;
                    i12 = i11 + 1;
                    otVar3 = otVar2;
                    z16 = true;
                }
            }
            if (v2.a) {
            }
            i11 = i12;
            z14 = z18;
            otVar2 = otVar3;
            z18 = z14;
            i12 = i11 + 1;
            otVar3 = otVar2;
            z16 = true;
        }
        ot otVar4 = otVar3;
        boolean z27 = z18;
        if (z27) {
            otVar4.K = z11;
        }
        if (!arrayList2.isEmpty() && !i0.p2(false) && !tz.C) {
            i0.g3(new o7(otVar4, arrayList2, i13, 20));
        }
        if (z10 || z20) {
            if (z19) {
                if (v2.a) {
                    f8.b("NotificationsController processNewMessages: edited branch, showOrUpdateNotification " + otVar4.K);
                }
                otVar4.b.clear();
                otVar4.Z(otVar4.K);
            } else if (z27) {
                if (v2.a) {
                    f8.b("NotificationsController processNewMessages: added branch");
                }
                jj jjVar6 = (jj) arrayList.get(0);
                long B03 = jj.B0(jjVar6.k);
                long c23 = jj.c2(otVar4.currentAccount, jjVar6.k, otVar4.getMessagesController().s2(B03), false);
                Boolean valueOf = jjVar6.i3() ? Boolean.valueOf(jjVar6.f) : null;
                int i15 = otVar4.I;
                int u11 = otVar4.u(B03, c23);
                boolean D2 = u11 == -1 ? otVar4.D(B03, valueOf, jjVar6.I, jjVar6.J) : u11 != 2;
                Integer num3 = (Integer) otVar4.f.f(B03);
                if (num3 != null) {
                    z12 = true;
                    i10 = num3.intValue() + 1;
                } else {
                    z12 = true;
                    i10 = 1;
                }
                if (otVar4.K && !D2 && (num = (Integer) otVar4.r.f(B03)) != null && num.intValue() != 0) {
                    i10 = num.intValue();
                    D2 = z12;
                }
                if (D2 && !jjVar6.K) {
                    if (!otVar4.getMessagesController().o2(B03)) {
                        if (otVar4.getMessagesController().s2(B03)) {
                            int i16 = otVar4.I - ((num3 == null || num3.intValue() <= 0) ? 0 : z12);
                            otVar4.I = i16;
                            otVar4.I = i16 + (i10 > 0 ? z12 : 0);
                        } else {
                            if (num3 != null) {
                                otVar4.I -= num3.intValue();
                            }
                            otVar4.I += i10;
                        }
                    }
                    otVar4.f.k(Integer.valueOf(i10), B03);
                }
                if (i15 != otVar4.I || z21) {
                    otVar4.b.clear();
                    if (v2.a) {
                        f8.b("NotificationsController processNewMessages: added branch: " + otVar4.K);
                    }
                    otVar4.Z(otVar4.K);
                    i0.g3(new gt(otVar4, otVar4.f.m(), 0));
                }
                otVar4.K = false;
                if (otVar4.R) {
                    otVar4.S(otVar4.z());
                }
            }
        }
        if (z21) {
            otVar4.d0();
        }
        if (countDownLatch != null) {
            countDownLatch.countDown();
            return;
        }
        return;
        try {
            otVar3.getAccountInstance().c();
            if (otVar3.u(otVar3.F, otVar3.G) != 2) {
                k0.c(new at(otVar3, 9));
            }
        } catch (Exception e7) {
            f8.g(e7, true);
        }
        if (v2.a) {
        }
        otVar2 = otVar3;
        z18 = z14;
        i12 = i11 + 1;
        otVar3 = otVar2;
        z16 = true;
    }

    public static void f(ot otVar, ArrayList arrayList, a0.h hVar, ArrayList arrayList2, Collection collection) {
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
        jj jjVar;
        long j14;
        boolean z11;
        SparseArray sparseArray2;
        otVar.f.b();
        otVar.a.clear();
        otVar.c.b();
        otVar.D.clear();
        otVar.E.b();
        otVar.I = 0;
        otVar.J = 0;
        otVar.getAccountInstance().c();
        a0.h hVar2 = new a0.h();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.Message message3 = (TLRPC.Message) arrayList.get(i10);
            if (message3 != null && ((messageFwdHeader = message3.fwd_from) == null || !messageFwdHeader.imported)) {
                TLRPC.MessageAction messageAction = message3.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionSetMessagesTTL) && (!message3.silent || (!(messageAction instanceof TLRPC.TL_messageActionContactSignUp) && !(messageAction instanceof TLRPC.TL_messageActionUserJoined)))) {
                    long j15 = message3.peer_id.channel_id;
                    long j16 = j15 != 0 ? -j15 : 0L;
                    SparseArray sparseArray3 = (SparseArray) otVar.c.f(j16);
                    if (sparseArray3 == null || sparseArray3.indexOfKey(message3.id) < 0) {
                        jj jjVar2 = new jj(otVar.currentAccount, message3, false, false);
                        if (E(jjVar2)) {
                            otVar.J++;
                        }
                        long B0 = jj.B0(jjVar2.k);
                        long c22 = jj.c2(otVar.currentAccount, jjVar2.k, otVar.getMessagesController().t2(jjVar2), false);
                        if (jjVar2.k.mentioned) {
                            message = message3;
                            j13 = jjVar2.Z0();
                            j12 = j16;
                        } else {
                            j12 = j16;
                            message = message3;
                            j13 = B0;
                        }
                        int h = hVar2.h(j13);
                        if (h < 0 || c22 != 0) {
                            int u10 = otVar.u(j13, c22);
                            if (u10 == -1) {
                                message2 = message;
                                sparseArray = sparseArray3;
                                j14 = j12;
                                z11 = otVar.D(j13, null, jjVar2.I, jjVar2.J);
                                jjVar = jjVar2;
                            } else {
                                message2 = message;
                                sparseArray = sparseArray3;
                                jjVar = jjVar2;
                                j14 = j12;
                                z11 = u10 != 2;
                            }
                            hVar2.k(Boolean.valueOf(z11), j13);
                        } else {
                            z11 = ((Boolean) hVar2.n(h)).booleanValue();
                            message2 = message;
                            sparseArray = sparseArray3;
                            jjVar = jjVar2;
                            j14 = j12;
                        }
                        if (z11 && (j13 != otVar.F || !w0.w)) {
                            if (sparseArray == null) {
                                sparseArray2 = new SparseArray();
                                otVar.c.k(sparseArray2, j14);
                            } else {
                                sparseArray2 = sparseArray;
                            }
                            sparseArray2.put(message2.id, jjVar);
                            otVar.h(jjVar);
                            if (B0 != j13) {
                                Integer num = (Integer) otVar.r.f(B0);
                                otVar.r.k(Integer.valueOf(num == null ? 1 : num.intValue() + 1), B0);
                            }
                        }
                    }
                }
            }
        }
        long j17 = 0;
        int i11 = 0;
        while (i11 < hVar.m()) {
            long j18 = hVar.j(i11);
            int h10 = hVar2.h(j18);
            if (h10 >= 0) {
                D = ((Boolean) hVar2.n(h10)).booleanValue();
            } else {
                int u11 = otVar.u(j18, j17);
                D = u11 == -1 ? otVar.D(j18, null, false, false) : u11 != 2;
                hVar2.k(Boolean.valueOf(D), j18);
            }
            if (D) {
                Integer num2 = (Integer) hVar.n(i11);
                int intValue = num2.intValue();
                otVar.f.k(num2, j18);
                if (!otVar.getMessagesController().o2(j18)) {
                    if (otVar.getMessagesController().s2(j18)) {
                        otVar.I += intValue > 0 ? 1 : 0;
                    } else {
                        otVar.I += intValue;
                    }
                }
            }
            i11++;
            j17 = 0;
        }
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            jj jjVar3 = (jj) arrayList2.get(i12);
            int f12 = jjVar3.f1();
            if (otVar.c.h(f12) < 0) {
                if (E(jjVar3)) {
                    otVar.J++;
                }
                long B02 = jj.B0(jjVar3.k);
                long c23 = jj.c2(otVar.currentAccount, jjVar3.k, otVar.getMessagesController().t2(jjVar3), false);
                TLRPC.Message message4 = jjVar3.k;
                long j19 = message4.random_id;
                long Z0 = message4.mentioned ? jjVar3.Z0() : B02;
                int h11 = hVar2.h(Z0);
                if (h11 < 0 || c23 != 0) {
                    int u12 = otVar.u(Z0, c23);
                    if (u12 == -1) {
                        j10 = Z0;
                        z10 = otVar.D(j10, null, jjVar3.I, jjVar3.J);
                    } else {
                        j10 = Z0;
                        z10 = u12 != 2;
                    }
                    hVar2.k(Boolean.valueOf(z10), j10);
                } else {
                    long j20 = Z0;
                    z10 = ((Boolean) hVar2.n(h11)).booleanValue();
                    j10 = j20;
                }
                if (z10 && (j10 != otVar.F || !w0.w)) {
                    if (f12 != 0) {
                        if (jjVar3.J) {
                            j11 = jj.B0(jjVar3.k);
                        } else {
                            long j21 = jjVar3.k.peer_id.channel_id;
                            j11 = j21 != 0 ? -j21 : 0L;
                        }
                        SparseArray sparseArray4 = (SparseArray) otVar.c.f(j11);
                        if (sparseArray4 == null) {
                            sparseArray4 = new SparseArray();
                            otVar.c.k(sparseArray4, j11);
                        }
                        sparseArray4.put(f12, jjVar3);
                    } else if (j19 != 0) {
                        otVar.d.k(jjVar3, j19);
                    }
                    otVar.h(jjVar3);
                    if (B02 != j10) {
                        Integer num3 = (Integer) otVar.r.f(B02);
                        otVar.r.k(Integer.valueOf(num3 == null ? 1 : num3.intValue() + 1), B02);
                    }
                    Integer num4 = (Integer) otVar.f.f(j10);
                    int intValue2 = num4 != null ? num4.intValue() + 1 : 1;
                    if (!otVar.getMessagesController().o2(j10)) {
                        if (otVar.getMessagesController().s2(j10)) {
                            if (num4 != null) {
                                otVar.I -= num4.intValue() > 0 ? 1 : 0;
                            }
                            otVar.I += intValue2 > 0 ? 1 : 0;
                        } else {
                            if (num4 != null) {
                                otVar.I -= num4.intValue();
                            }
                            otVar.I += intValue2;
                        }
                    }
                    otVar.f.k(Integer.valueOf(intValue2), j10);
                }
            }
        }
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                nt ntVar = (nt) it.next();
                long j22 = ntVar.a;
                nt ntVar2 = (nt) otVar.E.f(j22);
                if (ntVar2 != null) {
                    ntVar2.c.putAll(ntVar.c);
                } else {
                    otVar.D.add(ntVar);
                    otVar.E.k(ntVar, j22);
                }
            }
            Collections.sort(otVar.D, Comparator$-CC.comparingLong(new uk(2)));
        }
        i0.g3(new gt(otVar, otVar.f.m(), 4));
        otVar.Z(SystemClock.elapsedRealtime() / 1000 < 60);
        if (otVar.R) {
            otVar.S(otVar.z());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r0 == 2) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int g(ArrayList arrayList, jj jjVar, long j10, boolean z10, SharedPreferences sharedPreferences) {
        int i10;
        if (jjVar.J) {
            return 0;
        }
        if (!o5.C(j10)) {
            if (m5.w("custom_", j10, sharedPreferences, false)) {
                i10 = sharedPreferences.getInt("popup_" + j10, 0);
            } else {
                i10 = 0;
            }
            if (i10 == 0) {
                if (z10) {
                    i10 = sharedPreferences.getInt("popupChannel", 0);
                } else {
                    i10 = sharedPreferences.getInt(o5.z(j10) ? "popupGroup" : "popupAll", 0);
                }
            } else if (i10 == 1) {
                i10 = 3;
            }
            if (i10 != 0 && jjVar.k.peer_id.channel_id != 0 && !jjVar.A4()) {
                i10 = 0;
            }
            if (i10 != 0) {
                arrayList.add(0, jjVar);
            }
            return i10;
        }
        i10 = 0;
        if (i10 != 0) {
            i10 = 0;
        }
        if (i10 != 0) {
        }
        return i10;
    }

    public static void i() {
        SharedPreferences sharedPreferences;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        if (j0 == null) {
            sharedPreferences = w0.b.getSharedPreferences("Notifications", 0);
            j0 = sharedPreferences.getString("OtherKey", "Other3");
        } else {
            sharedPreferences = null;
        }
        NotificationChannel notificationChannel = m0.getNotificationChannel(j0);
        if (notificationChannel != null && notificationChannel.getImportance() == 0) {
            try {
                m0.deleteNotificationChannel(j0);
            } catch (Exception e) {
                f8.g(e, true);
            }
            j0 = null;
            notificationChannel = null;
        }
        if (j0 == null) {
            if (sharedPreferences == null) {
                sharedPreferences = w0.b.getSharedPreferences("Notifications", 0);
            }
            j0 = "Other" + Utilities.b.nextLong();
            sharedPreferences.edit().putString("OtherKey", j0).commit();
        }
        if (notificationChannel == null) {
            NotificationChannel notificationChannel2 = new NotificationChannel(j0, "Internal notifications", 3);
            notificationChannel2.enableLights(false);
            notificationChannel2.enableVibration(false);
            notificationChannel2.setSound(null, null);
            try {
                m0.createNotificationChannel(notificationChannel2);
            } catch (Exception e7) {
                f8.g(e7, true);
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

    public static String q(int i10) {
        return i10 == 0 ? "EnableGroup2" : i10 == 1 ? "EnableAll2" : "EnableChannel2";
    }

    public static String r(jj jjVar, String str) {
        TLRPC.Message message = jjVar.k;
        TLRPC.TL_messageActionGramTransfer tL_messageActionGramTransfer = (TLRPC.TL_messageActionGramTransfer) message.action;
        boolean A = h20.A(jj.B0(message));
        boolean z10 = (tL_messageActionGramTransfer.comment_encrypted || TextUtils.isEmpty(tL_messageActionGramTransfer.comment)) ? false : true;
        return cd.a0(null, null, A ? z10 ? 2131748051 : 2131748052 : z10 ? 2131748053 : 2131748054, str, org.telegram.ui.Wallet.k0.s(tL_messageActionGramTransfer.amount, false), tL_messageActionGramTransfer.comment);
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

    public static ot t(int i10) {
        ot otVar;
        ot otVar2 = p0[i10];
        if (otVar2 != null) {
            return otVar2;
        }
        synchronized (q0[i10]) {
            try {
                otVar = p0[i10];
                if (otVar == null) {
                    ot[] otVarArr = p0;
                    ot otVar3 = new ot(i10);
                    otVarArr[i10] = otVar3;
                    otVar = otVar3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return otVar;
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
        a0.h hVar = r0;
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
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                return false;
            }
            jj jjVar = (jj) arrayList.get(i10);
            long B0 = jj.B0(jjVar.k);
            if (!jjVar.I) {
                TLRPC.Message message = jjVar.k;
                if ((!message.mentioned || !(message.action instanceof TLRPC.TL_messageActionPinMessage)) && !o5.C(B0) && ((jjVar.k.peer_id.channel_id == 0 || jjVar.A4()) && B0 != 489000 && B0 != 489001)) {
                    return true;
                }
            }
            i10++;
        }
    }

    public final boolean B(int i10) {
        return i10 == 4 ? getAccountInstance().c().getBoolean("EnableReactionsMessages", true) : i10 == 5 ? getAccountInstance().c().getBoolean("EnableReactionsStories", true) : i10 == 3 ? getAccountInstance().c().getBoolean("EnableAllStories", true) : getAccountInstance().c().getInt(q(i10), 0) < getConnectionsManager().getCurrentTime();
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
        int i10;
        if (z10) {
            i10 = 4;
        } else if (z11) {
            i10 = 5;
        } else if (!o5.z(j10)) {
            i10 = 1;
        } else if (bool == null) {
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j10));
            if (w3.T(L0)) {
            }
            i10 = 0;
        }
        return B(i10);
    }

    public final void G(long j10, long j11, boolean z10) {
        if (z10) {
            t(this.currentAccount).H(j10, ConnectionsManager.DEFAULT_DATACENTER_ID, j11);
            return;
        }
        boolean D = t(this.currentAccount).D(j10, null, false, false);
        boolean z11 = j11 != 0;
        SharedPreferences.Editor edit = vp.r1(this.currentAccount).e7.edit();
        if (!D || z11) {
            edit.putInt("notify2_" + v(j10, j11, false), 0);
        } else {
            edit.remove("notify2_" + v(j10, j11, false));
        }
        if (j11 == 0) {
            getMessagesStorage().E1(j10, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().Q.f(j10);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        edit.apply();
        c0(j10, j11, true);
    }

    public final void H(long j10, int i10, long j11) {
        long j12 = 0;
        if (j10 != 0) {
            SharedPreferences.Editor edit = vp.r1(this.currentAccount).e7.edit();
            boolean z10 = j11 != 0;
            boolean D = t(this.currentAccount).D(j10, null, false, false);
            String v = v(j10, j11, false);
            if (i10 != Integer.MAX_VALUE) {
                edit.putInt("notify2_" + v, 3);
                edit.putInt("notifyuntil_" + v, getConnectionsManager().getCurrentTime() + i10);
                j12 = (((long) i10) << 32) | 1;
            } else if (D || z10) {
                edit.putInt("notify2_" + v, 2);
                j12 = 1L;
            } else {
                edit.remove("notify2_" + v);
            }
            edit.apply();
            if (j11 == 0) {
                t(this.currentAccount).N(j10);
                hs.a0(this.currentAccount).E1(j10, j12);
                TLRPC.Dialog dialog = (TLRPC.Dialog) vp.r1(this.currentAccount).Q.f(j10);
                if (dialog != null) {
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                    dialog.notify_settings = tL_peerNotifySettings;
                    if (i10 != Integer.MAX_VALUE || D) {
                        tL_peerNotifySettings.mute_until = i10;
                    }
                }
            }
            t(this.currentAccount).c0(j10, j11, true);
        }
    }

    public final Pair I(ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        String str;
        TLRPC.FileLocation fileLocation;
        ArrayList arrayList3 = this.D;
        int min = Math.min(3, arrayList3.size());
        boolean z10 = false;
        int i11 = 0;
        for (0; i10 < min; i10 + 1) {
            nt ntVar = (nt) arrayList3.get(i10);
            HashMap hashMap = ntVar.c;
            long j10 = ntVar.a;
            i11 += hashMap.size();
            z10 |= ntVar.d;
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
            if (Z1 == null && (Z1 = getMessagesStorage().k0(j10)) != null) {
                getMessagesController().U3(Z1, true, false);
            }
            File file = null;
            if (Z1 != null) {
                str = h20.p(Z1);
                TLRPC.UserProfilePhoto userProfilePhoto = Z1.photo;
                if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                    b8 fileLoader = getFileLoader();
                    TLRPC.FileLocation fileLocation2 = Z1.photo.photo_small;
                    fileLoader.getClass();
                    File K = b8.K(fileLocation2, null, true, true);
                    if (!K.exists()) {
                        if (Z1.photo.photo_big != null) {
                            b8 fileLoader2 = getFileLoader();
                            TLRPC.FileLocation fileLocation3 = Z1.photo.photo_big;
                            fileLoader2.getClass();
                            K = b8.K(fileLocation3, null, true, true);
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
                str = ntVar.b;
                i10 = str == null ? i10 + 1 : 0;
            }
            if (str.length() > 50) {
                str = str.substring(0, 25) + "…";
            }
            arrayList.add(str);
            if (file == null && Z1 != null) {
                arrayList2.add(Z1);
            } else if (file != null) {
                arrayList2.add(file);
            }
        }
        if (z10) {
            arrayList2.clear();
        }
        return new Pair(Integer.valueOf(i11), Boolean.valueOf(z10));
    }

    public final void J(LongSparseIntArray longSparseIntArray) {
        k0.c(new ft(this, longSparseIntArray, new ArrayList(), 0));
    }

    public final void K(ArrayList arrayList, boolean z10, boolean z11, CountDownLatch countDownLatch) {
        boolean z12;
        boolean z13;
        if (v2.a) {
            StringBuilder sb2 = new StringBuilder("NotificationsController: processNewMessages msgs.size()=");
            sb2.append(arrayList == null ? "null" : Integer.valueOf(arrayList.size()));
            sb2.append(" isLast=");
            z12 = z10;
            sb2.append(z12);
            sb2.append(" isFcm=");
            z13 = z11;
            sb2.append(z13);
            sb2.append(")");
            f8.b(sb2.toString());
        } else {
            z12 = z10;
            z13 = z11;
        }
        if (arrayList != null) {
            int i10 = 0;
            while (i10 < arrayList.size()) {
                jj jjVar = (jj) arrayList.get(i10);
                if (jjVar != null && jjVar.k != null && !jjVar.P3()) {
                    TLRPC.MessageAction messageAction = jjVar.k.action;
                    if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                        TLRPC.TL_messageActionConferenceCall tL_messageActionConferenceCall = (TLRPC.TL_messageActionConferenceCall) messageAction;
                        if (tL_messageActionConferenceCall.active || tL_messageActionConferenceCall.missed || getConnectionsManager().getCurrentTime() - jjVar.k.date >= getMessagesController().h3 / 1000) {
                            VoIPGroupNotification.hide(w0.b, this.currentAccount, jjVar.f1());
                        } else {
                            HashSet hashSet = new HashSet();
                            hashSet.add(Long.valueOf(jj.B0(jjVar.k)));
                            ArrayList<TLRPC.Peer> arrayList2 = tL_messageActionConferenceCall.other_participants;
                            int size = arrayList2.size();
                            int i11 = 0;
                            while (i11 < size) {
                                TLRPC.Peer peer = arrayList2.get(i11);
                                i11++;
                                hashSet.add(Long.valueOf(o5.o(peer)));
                            }
                            StringBuilder sb3 = new StringBuilder();
                            Iterator it = hashSet.iterator();
                            while (it.hasNext()) {
                                long longValue = ((Long) it.next()).longValue();
                                if (sb3.length() > 0) {
                                    sb3.append(", ");
                                }
                                sb3.append(o5.s(this.currentAccount, longValue));
                            }
                            VoIPGroupNotification.request(w0.b, this.currentAccount, jj.B0(jjVar.k), sb3.toString(), tL_messageActionConferenceCall.call_id, jjVar.f1(), tL_messageActionConferenceCall.video);
                            arrayList.remove(i10);
                            i10--;
                        }
                    }
                }
                i10++;
            }
        }
        if (!arrayList.isEmpty()) {
            k0.c(new dn(this, arrayList, new ArrayList(0), z13, z12, countDownLatch));
        } else if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public final void L(LongSparseIntArray longSparseIntArray, long j10, int i10, int i11, boolean z10) {
        k0.c(new og(this, longSparseIntArray, new ArrayList(0), j10, i11, i10, z10));
    }

    public final void M(a0.h hVar, boolean z10) {
        k0.c(new bi.n4(this, hVar, z10, new ArrayList(0), 20));
    }

    public final void N(long j10) {
        L(null, j10, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray();
        longSparseIntArray.put(j10, 0);
        J(longSparseIntArray);
    }

    public final String O(jj jjVar) {
        String str;
        TLRPC.Message message = jjVar.k;
        if (message == null || (str = message.message) == null || message.entities == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (jjVar.I2) {
            return sb2.toString();
        }
        for (int i10 = 0; i10 < jjVar.k.entities.size(); i10++) {
            if (jjVar.k.entities.get(i10) instanceof TLRPC.TL_messageEntitySpoiler) {
                TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = (TLRPC.TL_messageEntitySpoiler) jjVar.k.entities.get(i10);
                for (int i11 = 0; i11 < tL_messageEntitySpoiler.length; i11++) {
                    int i12 = tL_messageEntitySpoiler.offset + i11;
                    char[] cArr = this.h0;
                    sb2.setCharAt(i12, cArr[i11 % cArr.length]);
                }
            }
        }
        return sb2.toString();
    }

    public final void P(e0.r rVar, long j10, long j11, String str, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        f8.b("resetNotificationSound");
        Uri uri2 = Settings.System.DEFAULT_RINGTONE_URI;
        if (uri2 == null || uri == null || TextUtils.equals(uri2.toString(), uri.toString())) {
            return;
        }
        SharedPreferences.Editor edit = getAccountInstance().c().edit();
        String uri3 = uri2.toString();
        String L0 = cd.L0(2131751600, null);
        if (z10) {
            if (i12 == 2) {
                edit.putString("ChannelSound", L0);
            } else if (i12 == 0) {
                edit.putString("GroupSound", L0);
            } else if (i12 == 1) {
                edit.putString("GlobalSound", L0);
            } else if (i12 == 3) {
                edit.putString("StoriesSound", L0);
            } else if (i12 == 4 || i12 == 5) {
                edit.putString("ReactionSound", L0);
            }
            if (i12 == 2) {
                edit.putString("ChannelSoundPath", uri3);
            } else if (i12 == 0) {
                edit.putString("GroupSoundPath", uri3);
            } else if (i12 == 1) {
                edit.putString("GlobalSoundPath", uri3);
            } else if (i12 == 3) {
                edit.putString("StoriesSoundPath", uri3);
            } else if (i12 == 4 || i12 == 5) {
                edit.putString("ReactionSound", uri3);
            }
            getNotificationsController().n(i12);
        } else {
            edit.putString("sound_" + v(j10, j11, false), L0);
            edit.putString("sound_path_" + v(j10, j11, false), uri3);
            o(j10, j11);
        }
        edit.commit();
        rVar.y = e0(j10, j11, str, jArr, i10, uri2, i11, z10, z11, z12, i12);
        l0.e(null, this.d0, rVar.b());
    }

    public final void Q(boolean z10) {
        at atVar = this.U;
        try {
            if (v2.a) {
                f8.b("delay notification start, onlineReason = " + z10);
            }
            this.V.acquire(10000L);
            r5 r5Var = k0;
            r5Var.a(atVar);
            r5Var.d(atVar, z10 ? 3000 : 1000);
        } catch (Exception e) {
            f8.g(e, true);
            Z(this.K);
        }
    }

    public final void R() {
        try {
            Intent intent = new Intent(w0.b, (Class<?>) NotificationRepeat.class);
            intent.putExtra("currentAccount", this.currentAccount);
            PendingIntent service = PendingIntent.getService(w0.b, 0, intent, 33554432);
            if (getAccountInstance().c().getInt("repeat_messages", 60) <= 0 || this.J <= 0) {
                this.c0.cancel(service);
            } else {
                this.c0.set(2, SystemClock.elapsedRealtime() + (r1 * 60000), service);
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final void S(int i10) {
        if (this.N == i10) {
            return;
        }
        f8.b("setBadge " + i10);
        this.N = i10;
        try {
            if (os.c == null && !os.b) {
                os.b();
                os.b = true;
            }
            ls lsVar = os.c;
            if (lsVar == null) {
                return;
            }
            lsVar.a(i10);
        } catch (Throwable unused) {
        }
    }

    public final void T(long j10, int i10, long j11) {
        SharedPreferences.Editor edit = getAccountInstance().c().edit();
        TLRPC.Dialog dialog = (TLRPC.Dialog) vp.r1(d20.s0).Q.f(j10);
        if (i10 == 4) {
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
            int currentTime = ConnectionsManager.getInstance(d20.s0).getCurrentTime();
            if (i10 == 0) {
                currentTime += 3600;
            } else if (i10 == 1) {
                currentTime += 28800;
            } else if (i10 == 2) {
                currentTime += 172800;
            } else if (i10 == 3) {
                currentTime = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            long j12 = 1;
            if (i10 == 3) {
                edit.putInt("notify2_" + v(j10, j11, false), 2);
            } else {
                edit.putInt("notify2_" + v(j10, j11, false), 3);
                edit.putInt("notifyuntil_" + v(j10, j11, false), currentTime);
                j12 = 1 | (((long) currentTime) << 32);
            }
            t(d20.s0).N(j10);
            hs.a0(d20.s0).E1(j10, j12);
            if (dialog != null) {
                TLRPC.TL_peerNotifySettings tL_peerNotifySettings = new TLRPC.TL_peerNotifySettings();
                dialog.notify_settings = tL_peerNotifySettings;
                tL_peerNotifySettings.mute_until = currentTime;
            }
        }
        edit.commit();
        c0(j10, j11, true);
    }

    public final void U(int i10, int i11) {
        getAccountInstance().c().edit().putInt(q(i10), i11).commit();
        b0(i10);
        hs messagesStorage = getMessagesStorage();
        messagesStorage.a.c(new br(messagesStorage, 25));
        m(i10);
    }

    public final void V(int i10) {
        k0.c(new gt(this, i10, 7));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(103:51|(2:53|(4:55|56|57|58)(4:59|(2:62|60)|63|64))(1:901)|65|66|(1:68)(2:(1:898)(1:900)|899)|69|(4:72|(2:74|75)(1:77)|76|70)|78|79|(5:81|(2:(1:84)(1:768)|85)(1:769)|(1:767)(2:91|(2:95|96))|766|96)(2:770|(3:(1:882)(1:779)|780|(12:782|(2:784|(1:786)(6:832|(1:834)|835|56|57|58))(3:836|(1:846)(2:840|(10:844|788|(1:790)(2:823|(1:825)(2:826|(1:828)(7:829|(1:831)|792|793|(1:822)(2:798|(1:808))|809|(2:811|812)(1:813))))|791|792|793|(0)|822|809|(0)(0)))|845)|787|788|(0)(0)|791|792|793|(0)|822|809|(0)(0))(7:847|(2:849|(1:851)(6:852|(1:854)|835|56|57|58))(10:855|(1:881)(1:859)|860|861|(1:880)(2:865|(1:867))|879|869|(2:871|(1:873))(1:878)|(1:875)(1:877)|876)|793|(0)|822|809|(0)(0)))(4:883|(6:885|(2:887|(1:889))(2:890|(2:892|(1:894)))|835|56|57|58)(1:896)|895|812))|97|(1:765)(2:101|(91:103|104|(4:106|(1:108)(1:111)|109|110)|112|(3:114|(77:116|(1:118)(3:750|751|(3:753|(1:755)(1:757)|756)(1:758))|119|(3:(1:748)(3:126|(1:128)(2:(2:744|745)|743)|129)|130|131)(1:749)|132|(5:707|(5:709|(4:712|(2:720|721)|722|710)|727|728|(4:730|(1:732)|733|734)(1:740))(1:741)|735|(1:737)(1:739)|738)(2:135|136)|137|(1:139)|140|(1:142)(1:697)|143|(1:696)(1:147)|148|149|(1:695)(4:152|(1:154)|(3:661|662|(4:666|667|668|(57:672|(1:674)(2:(2:684|685)|688)|675|676|677|(1:660)(1:161)|(1:659)(1:164)|165|166|(1:658)|173|(1:657)(1:180)|181|(11:183|(1:185)(2:386|(4:388|56|57|58)(2:389|(1:(1:392)(1:393))(2:394|(1:396)(2:397|(1:402)(1:401)))))|186|(2:189|187)|190|191|(1:385)(1:194)|195|(1:197)|(1:199)(1:384)|200)(4:403|(5:405|(1:407)(3:411|(1:413)(2:642|(2:647|(1:649)(2:650|(1:654)))(1:646))|(3:415|(1:417)|418)(14:419|(1:421)|422|(2:638|(1:640)(1:641))(1:428)|429|430|(3:630|(1:(1:633)(2:634|(1:636)))|637)(1:434)|435|(2:(2:438|(1:(2:441|(1:443))(1:624))(2:625|(1:627)))(1:628)|623)(1:629)|(6:551|552|(1:622)(2:556|(6:558|(2:618|619)(3:561|(1:565)|(1:617)(1:575))|(4:580|(2:582|(2:588|(1:592)))(2:605|(1:615))|(1:594)(3:596|(2:600|601)|604)|595)|616|(0)(0)|595)(1:620))|621|604|595)(1:447)|448|(10:450|(8:463|(1:543)(3:467|(6:531|532|533|534|535|536)(1:469)|470)|471|(1:473)(1:530)|474|475|(2:525|526)(3:477|(3:521|(1:523)|524)|479)|(9:481|(1:483)|484|(2:486|(1:488))|489|490|(2:495|(2:497|(3:499|(2:504|505)(1:501)|(1:503))(2:508|(2:510|(2:512|513)))))|520|513))|544|545|(5:547|490|(3:493|495|(0))|520|513)|489|490|(0)|520|513)(2:548|(1:550))|514|(2:516|(3:518|519|410))))|408|409|410)|655|656)|201|202|(2:353|(41:358|(2:369|(4:371|(2:374|372)|375|376)(2:377|(1:379)(2:380|(1:382)(1:383))))(3:362|(1:364)(2:366|(1:368))|365)|208|(1:210)|211|(1:213)|214|(2:216|(1:218)(1:348))(2:349|(1:351)(1:352))|(1:220)(1:347)|221|(4:223|(2:226|224)|227|228)(1:346)|229|(1:231)(1:345)|232|233|234|(1:236)|(4:238|239|240|(1:242))(1:341)|243|(1:245)|(2:249|(21:251|(4:254|(2:255|(2:257|(2:260|261)(1:259))(1:334))|(1:264)(1:263)|252)|335|265|(1:267)|268|(2:(1:273)|(1:280))|281|(1:333)(1:287)|288|(1:290)|(1:292)|293|(3:298|(4:300|(3:302|(4:304|(1:306)|307|308)(2:310|311)|309)|312|313)|314)|315|(1:332)(2:318|(2:322|(1:326)))|327|(1:329)|330|331|58))|336|(0)|268|(3:270|(0)|(2:275|280))|281|(1:283)|333|288|(0)|(0)|293|(4:295|298|(0)|314)|315|(0)|332|327|(0)|330|331|58)(1:357))(1:206)|207|208|(0)|211|(0)|214|(0)(0)|(0)(0)|221|(0)(0)|229|(0)(0)|232|233|234|(0)|(0)(0)|243|(0)|(3:247|249|(0))|336|(0)|268|(0)|281|(0)|333|288|(0)|(0)|293|(0)|315|(0)|332|327|(0)|330|331|58)))|156)|157|(1:159)|660|(0)|659|165|166|(1:168)|658|173|(1:176)|657|181|(0)(0)|201|202|(1:204)|353|(1:355)|358|(1:360)|369|(0)(0)|208|(0)|211|(0)|214|(0)(0)|(0)(0)|221|(0)(0)|229|(0)(0)|232|233|234|(0)|(0)(0)|243|(0)|(0)|336|(0)|268|(0)|281|(0)|333|288|(0)|(0)|293|(0)|315|(0)|332|327|(0)|330|331|58)|761)(1:763)|762|(0)(0)|132|(0)|699|701|703|705|707|(0)(0)|735|(0)(0)|738|137|(0)|140|(0)(0)|143|(1:145)|696|148|149|(0)|695|157|(0)|660|(0)|659|165|166|(0)|658|173|(0)|657|181|(0)(0)|201|202|(0)|353|(0)|358|(0)|369|(0)(0)|208|(0)|211|(0)|214|(0)(0)|(0)(0)|221|(0)(0)|229|(0)(0)|232|233|234|(0)|(0)(0)|243|(0)|(0)|336|(0)|268|(0)|281|(0)|333|288|(0)|(0)|293|(0)|315|(0)|332|327|(0)|330|331|58))|764|104|(0)|112|(0)(0)|762|(0)(0)|132|(0)|699|701|703|705|707|(0)(0)|735|(0)(0)|738|137|(0)|140|(0)(0)|143|(0)|696|148|149|(0)|695|157|(0)|660|(0)|659|165|166|(0)|658|173|(0)|657|181|(0)(0)|201|202|(0)|353|(0)|358|(0)|369|(0)(0)|208|(0)|211|(0)|214|(0)(0)|(0)(0)|221|(0)(0)|229|(0)(0)|232|233|234|(0)|(0)(0)|243|(0)|(0)|336|(0)|268|(0)|281|(0)|333|288|(0)|(0)|293|(0)|315|(0)|332|327|(0)|330|331|58) */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x13c5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x13c6, code lost:
    
        r4 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x049b, code lost:
    
        if (r3.local_id != 0) goto L179;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0603  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x065c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x07df  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x07eb  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0839 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x08f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0923 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0952  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x115f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x120f  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x122d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x1289  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x12e2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1310  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x136f  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x13be A[Catch: Exception -> 0x13c5, TRY_LEAVE, TryCatch #11 {Exception -> 0x13c5, blocks: (B:234:0x13a0, B:236:0x13be), top: B:233:0x13a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x13cb  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x13f2  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x13fb  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x1405  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x1451  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x1493  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x1499  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x14b8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x14d0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x14d5  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x14e2  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x14ef  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x1583 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x15bb  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x13da  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x1376  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x1339  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x12f7  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x12be  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x1175  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x118b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x11ba  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x11e0  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0aff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x0f40  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x0f6c  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0fc9  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x103e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:497:0x1052  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x10ea  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0f4d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0f44  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x1036  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0dee  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0df8  */
    /* JADX WARN: Removed duplicated region for block: B:697:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:737:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:739:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x076f  */
    /* JADX WARN: Removed duplicated region for block: B:749:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:763:0x0656  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:795:0x04e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:811:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:813:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:823:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:906:0x1633  */
    /* JADX WARN: Removed duplicated region for block: B:916:0x169c  */
    /* JADX WARN: Removed duplicated region for block: B:928:0x16fe  */
    /* JADX WARN: Removed duplicated region for block: B:954:0x1672  */
    /* JADX WARN: Removed duplicated region for block: B:960:0x01b0 A[EDGE_INSN: B:960:0x01b0->B:904:0x01b0 BREAK  A[LOOP:2: B:48:0x01a2->B:58:0x1615], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:961:0x016d  */
    /* JADX WARN: Type inference failed for: r12v100 */
    /* JADX WARN: Type inference failed for: r12v101, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v102 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X(e0.r rVar, String str, long j10, long j11, String str2, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        boolean z13;
        long e;
        boolean z14;
        a0.h hVar;
        int size;
        ArrayList arrayList;
        a0.h hVar2;
        ArrayList arrayList2;
        String str3;
        int i13;
        int size2;
        int i14;
        a0.h hVar3;
        boolean z15;
        int i15;
        boolean z16;
        long j12;
        int i16;
        ArrayList arrayList3;
        a0.h hVar4;
        long j13;
        long j14;
        int f12;
        jj jjVar;
        SharedPreferences sharedPreferences;
        String str4;
        int i17;
        Integer num;
        Integer num2;
        int i18;
        a0.h hVar5;
        String str5;
        mt mtVar;
        TLRPC.User user;
        String K0;
        TLRPC.User user2;
        boolean z17;
        TLRPC.FileLocation fileLocation;
        TLRPC.Chat chat;
        boolean z18;
        a0.h hVar6;
        ArrayList arrayList4;
        long j15;
        Notification notification;
        boolean z19;
        TLRPC.Chat L0;
        TLRPC.FileLocation fileLocation2;
        TLRPC.FileLocation fileLocation3;
        boolean z20;
        String str6;
        TLRPC.User user3;
        TLRPC.Chat chat2;
        String str7;
        TLRPC.ChatPhoto chatPhoto;
        TLRPC.FileLocation fileLocation4;
        TLRPC.UserProfilePhoto userProfilePhoto;
        String str8;
        String K02;
        boolean z21;
        SharedPreferences sharedPreferences2;
        String str9;
        String str10;
        TLRPC.User user4;
        File file;
        Bitmap bitmap;
        File file2;
        long j16;
        Bitmap bitmap2;
        String str11;
        Bitmap bitmap3;
        long j17;
        String str12;
        TLRPC.Chat chat3;
        boolean z22;
        String Z;
        e0.i b10;
        Integer num3;
        mt mtVar2;
        int i19;
        int i20;
        long j18;
        String str13;
        e0.l0 l0Var;
        e0.y yVar;
        int i21;
        long j19;
        long j20;
        e0.i iVar;
        long j21;
        e0.y yVar2;
        ArrayList arrayList5;
        String str14;
        Bitmap bitmap4;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList6;
        int i22;
        String[] strArr;
        e0.y yVar3;
        boolean[] zArr;
        long j22;
        StringBuilder sb2;
        ArrayList arrayList7;
        String str15;
        long j23;
        long j24;
        String str16;
        IconCompat iconCompat;
        char c10;
        e0.l0 l0Var2;
        int i23;
        File file3;
        TLRPC.ChatPhoto chatPhoto2;
        TLRPC.FileLocation fileLocation5;
        TLRPC.UserProfilePhoto userProfilePhoto2;
        TLRPC.FileLocation fileLocation6;
        TLRPC.UserProfilePhoto userProfilePhoto3;
        TLRPC.FileLocation fileLocation7;
        e0.y yVar4;
        int f13;
        ArrayList arrayList8;
        char c11;
        ArrayList arrayList9;
        Uri uri2;
        File file4;
        File file5;
        Uri d;
        File file6;
        Bitmap createScaledBitmap;
        Canvas canvas;
        mt mtVar3;
        long j25;
        int i24;
        long j26;
        mt mtVar4;
        long j27;
        Bitmap bitmap5;
        jj jjVar2;
        String str17;
        e0.i iVar2;
        ArrayList arrayList10;
        long j28;
        jj jjVar3;
        TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy;
        TL_keyboard.KeyboardInlineButton keyboardInlineButton;
        long j29;
        TLRPC.User user5;
        int size3;
        int i25;
        int i26;
        int i27;
        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList11;
        TLRPC.Message message;
        TLRPC.ReplyMarkup replyMarkup;
        ArrayList arrayList12;
        boolean z23;
        ?? r12;
        String G;
        TLRPC.UserProfilePhoto userProfilePhoto4;
        TLRPC.FileLocation fileLocation8;
        IconCompat iconCompat2;
        IconCompat iconCompat3;
        int i28;
        Bitmap bitmap6;
        String G2;
        String str18;
        String str19;
        TLRPC.UserProfilePhoto userProfilePhoto5;
        ot otVar = this;
        f8.b("showExtraNotifications pushMessages.size()=" + otVar.a.size());
        if (Build.VERSION.SDK_INT >= 26) {
            rVar.e(otVar.e0(j10, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12));
        }
        Notification b11 = rVar.b();
        SharedPreferences c12 = otVar.getAccountInstance().c();
        ArrayList arrayList13 = new ArrayList();
        if (!otVar.D.isEmpty()) {
            arrayList13.add(new mt(0L, 0L, true));
        }
        a0.h hVar7 = new a0.h();
        int i29 = 0;
        for (int i30 = 0; i30 < otVar.a.size(); i30++) {
            jj jjVar4 = (jj) otVar.a.get(i30);
            long A0 = jjVar4.A0();
            long b22 = jj.b2(otVar.currentAccount, jjVar4.k, otVar.getMessagesController().t2(jjVar4));
            int i31 = c12.getInt("dismissDate" + A0, 0);
            if (jjVar4.K || jjVar4.k.date > i31) {
                ArrayList arrayList14 = (ArrayList) hVar7.f(A0);
                if (arrayList14 == null) {
                    ArrayList i32 = m5.i(hVar7, A0);
                    f8.b("showExtraNotifications: sortedDialogs += " + A0);
                    arrayList13.add(new mt(A0, b22, false));
                    arrayList14 = i32;
                }
                arrayList14.add(jjVar4);
            } else {
                StringBuilder s10 = a1.g.s(A0, "showExtraNotifications: dialog ", " is skipped, message date (");
                s10.append(jjVar4.k.date);
                s10.append(" <= ");
                s10.append(i31);
                s10.append(")");
                f8.b(s10.toString());
            }
        }
        a0.h hVar8 = new a0.h();
        for (int i33 = 0; i33 < otVar.h.m(); i33++) {
            hVar8.k((Integer) otVar.h.n(i33), otVar.h.j(i33));
        }
        otVar.h.b();
        ArrayList arrayList15 = new ArrayList();
        int i34 = Build.VERSION.SDK_INT;
        if (i34 > 27) {
            if (arrayList13.size() <= (otVar.D.isEmpty() ? 1 : 2)) {
                z13 = false;
                if (z13 && i34 >= 26) {
                    i();
                }
                e = otVar.getUserConfig().e();
                z14 = !i0.o2() || tz.C;
                f8.b("showExtraNotifications: passcode=" + (tz.s.length() <= 0) + " waitingForPasscode=" + z14 + " selfUserId=" + e + " useSummaryNotification=" + z13);
                hVar = new a0.h();
                size = arrayList13.size();
                arrayList = arrayList15;
                while (true) {
                    if (i29 >= size) {
                        break;
                    }
                    if (arrayList.size() >= 7) {
                        f8.b("showExtraNotifications: break from holders, count over 7");
                        break;
                    }
                    mt mtVar5 = (mt) arrayList13.get(i29);
                    ArrayList arrayList16 = arrayList13;
                    if (mtVar5.c) {
                        ArrayList arrayList17 = new ArrayList();
                        if (otVar.D.isEmpty()) {
                            StringBuilder sb3 = new StringBuilder("showExtraNotifications: [");
                            z15 = z14;
                            sb3.append(mtVar5.a);
                            sb3.append("] continue; story but storyPushMessages is empty");
                            f8.b(sb3.toString());
                            notification = b11;
                            sharedPreferences = c12;
                            hVar4 = hVar7;
                            i16 = i29;
                            hVar5 = hVar8;
                            hVar6 = hVar;
                            i15 = size;
                            z16 = z13;
                            j15 = e;
                            arrayList4 = arrayList;
                            i29 = i16 + 1;
                            arrayList = arrayList4;
                            arrayList13 = arrayList16;
                            hVar7 = hVar4;
                            z14 = z15;
                            z13 = z16;
                            size = i15;
                            c12 = sharedPreferences;
                            hVar8 = hVar5;
                            e = j15;
                            b11 = notification;
                            hVar = hVar6;
                        } else {
                            z15 = z14;
                            i15 = size;
                            z16 = z13;
                            long j30 = ((nt) otVar.D.get(0)).a;
                            int i35 = 0;
                            for (Iterator it = ((nt) otVar.D.get(0)).c.keySet().iterator(); it.hasNext(); it = it) {
                                i35 = Math.max(i35, ((Integer) it.next()).intValue());
                            }
                            i16 = i29;
                            j12 = e;
                            j14 = j30;
                            jjVar = null;
                            f12 = i35;
                            arrayList3 = arrayList17;
                            hVar4 = hVar7;
                            j13 = 0;
                        }
                    } else {
                        z15 = z14;
                        i15 = size;
                        z16 = z13;
                        long j31 = mtVar5.a;
                        j12 = e;
                        long j32 = mtVar5.b;
                        ArrayList arrayList18 = (ArrayList) hVar7.f(j31);
                        i16 = i29;
                        arrayList3 = arrayList18;
                        hVar4 = hVar7;
                        j13 = j32;
                        j14 = j31;
                        f12 = ((jj) arrayList18.get(0)).f1();
                        jjVar = (jj) arrayList18.get(0);
                    }
                    Notification notification2 = b11;
                    sharedPreferences = c12;
                    Integer num4 = (Integer) hVar8.f(mtVar5.a);
                    if (mtVar5.c) {
                        num = 2147483646;
                        str4 = "showExtraNotifications: [";
                        i17 = 32;
                    } else {
                        if (num4 == null) {
                            str4 = "showExtraNotifications: [";
                            i17 = 32;
                            long j33 = mtVar5.a;
                            num4 = Integer.valueOf(((int) j33) + ((int) (j33 >> 32)));
                        } else {
                            str4 = "showExtraNotifications: [";
                            i17 = 32;
                            hVar8.l(mtVar5.a);
                        }
                        num = num4;
                    }
                    String str20 = str4;
                    int i36 = 0;
                    for (int i37 = 0; i37 < arrayList3.size(); i37++) {
                        if (i36 < ((jj) arrayList3.get(i37)).k.date) {
                            i36 = ((jj) arrayList3.get(i37)).k.date;
                        }
                    }
                    if (mtVar5.c) {
                        num2 = num;
                        TLRPC.User Z1 = otVar.getMessagesController().Z1(Long.valueOf(j14));
                        hVar5 = hVar8;
                        if (otVar.D.size() == 1) {
                            G2 = Z1 != null ? h20.i(Z1) : ((nt) otVar.D.get(0)).b;
                            i18 = i36;
                        } else {
                            i18 = i36;
                            G2 = cd.G(otVar.D.size(), "Stories", new Object[0]);
                        }
                        if (Z1 == null || (userProfilePhoto5 = Z1.photo) == null || (fileLocation = userProfilePhoto5.photo_small) == null) {
                            str18 = "Stories";
                            str19 = G2;
                        } else {
                            str18 = "Stories";
                            str19 = G2;
                            if (fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                str5 = str18;
                                mtVar = mtVar5;
                                K0 = str19;
                                z17 = false;
                                chat = null;
                                z18 = false;
                                z19 = false;
                                user2 = Z1;
                            }
                        }
                        str5 = str18;
                        mtVar = mtVar5;
                        K0 = str19;
                        z17 = false;
                        fileLocation = null;
                        chat = null;
                        z18 = false;
                        z19 = false;
                        user2 = Z1;
                    } else {
                        num2 = num;
                        i18 = i36;
                        hVar5 = hVar8;
                        if (o5.C(j14)) {
                            str5 = "Stories";
                            mtVar = mtVar5;
                            if (j14 != n0) {
                                int h = o5.h(j14);
                                TLRPC.EncryptedChat Z0 = otVar.getMessagesController().Z0(Integer.valueOf(h));
                                if (Z0 != null) {
                                    user = otVar.getMessagesController().Z1(Long.valueOf(Z0.user_id));
                                    if (user == null) {
                                        if (v2.a) {
                                            f8.l("not found secret chat user to show dialog notification " + Z0.user_id);
                                        }
                                    }
                                } else if (v2.a) {
                                    f8.l("not found secret chat to show dialog notification " + h);
                                }
                                hVar6 = hVar;
                                arrayList4 = arrayList;
                                j15 = j12;
                                notification = notification2;
                                i29 = i16 + 1;
                                arrayList = arrayList4;
                                arrayList13 = arrayList16;
                                hVar7 = hVar4;
                                z14 = z15;
                                z13 = z16;
                                size = i15;
                                c12 = sharedPreferences;
                                hVar8 = hVar5;
                                e = j15;
                                b11 = notification;
                                hVar = hVar6;
                            } else {
                                user = null;
                            }
                            K0 = cd.K0(2131745710);
                            user2 = user;
                            z17 = false;
                            fileLocation = null;
                            chat = null;
                            z18 = false;
                            z19 = false;
                        } else {
                            boolean z24 = (jjVar == null || jjVar.I || jjVar.J || j14 == 777000) ? false : true;
                            if (o5.E(j14)) {
                                TLRPC.User Z12 = otVar.getMessagesController().Z1(Long.valueOf(j14));
                                if (Z12 != null) {
                                    String p5 = h20.p(Z12);
                                    TLRPC.UserProfilePhoto userProfilePhoto6 = Z12.photo;
                                    if (userProfilePhoto6 == null || (fileLocation = userProfilePhoto6.photo_small) == null) {
                                        user3 = Z12;
                                        str8 = p5;
                                    } else {
                                        user3 = Z12;
                                        str8 = p5;
                                        if (fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                            str6 = str8;
                                            if (j14 != 489001) {
                                                K02 = cd.K0(2131753121);
                                            } else if (j14 == 489000) {
                                                K02 = cd.K0(2131743642);
                                            } else if (h20.y(j14)) {
                                                K02 = cd.K0(2131746281);
                                            } else {
                                                if (j14 == j12) {
                                                    K02 = cd.K0(2131748542);
                                                }
                                                str5 = "Stories";
                                                mtVar = mtVar5;
                                                L0 = null;
                                                z20 = false;
                                                z18 = false;
                                                if (j14 == 489000 || jjVar == null || jjVar.W0() == null) {
                                                    z19 = z24;
                                                    chat2 = L0;
                                                    str7 = str6;
                                                } else {
                                                    z19 = z24;
                                                    Long W0 = jjVar.W0();
                                                    chat2 = L0;
                                                    str7 = str6;
                                                    long longValue = W0.longValue();
                                                    if (!o5.E(longValue) ? !((chatPhoto = otVar.getMessagesController().L0(Long.valueOf(-longValue)).photo) == null || (fileLocation4 = chatPhoto.photo_small) == null || fileLocation4.volume_id == 0 || fileLocation4.local_id == 0) : !((userProfilePhoto = otVar.getMessagesController().Z1(W0).photo) == null || (fileLocation4 = userProfilePhoto.photo_small) == null || fileLocation4.volume_id == 0 || fileLocation4.local_id == 0)) {
                                                        fileLocation = fileLocation4;
                                                    }
                                                }
                                                z17 = z20;
                                                if (j14 != 489000) {
                                                    user2 = user3;
                                                    K0 = str7;
                                                    chat = chat2;
                                                    z19 = false;
                                                } else {
                                                    user2 = user3;
                                                    K0 = str7;
                                                    chat = chat2;
                                                }
                                            }
                                            str6 = K02;
                                            str5 = "Stories";
                                            mtVar = mtVar5;
                                            L0 = null;
                                            z20 = false;
                                            z18 = false;
                                            if (j14 == 489000) {
                                            }
                                            z19 = z24;
                                            chat2 = L0;
                                            str7 = str6;
                                            z17 = z20;
                                            if (j14 != 489000) {
                                            }
                                        }
                                    }
                                    str6 = str8;
                                } else if (jjVar.i3()) {
                                    str6 = jjVar.b;
                                    user3 = Z12;
                                } else {
                                    if (v2.a) {
                                        f8.l("not found user to show dialog notification " + j14);
                                    }
                                    hVar6 = hVar;
                                    arrayList4 = arrayList;
                                    j15 = j12;
                                    notification = notification2;
                                    i29 = i16 + 1;
                                    arrayList = arrayList4;
                                    arrayList13 = arrayList16;
                                    hVar7 = hVar4;
                                    z14 = z15;
                                    z13 = z16;
                                    size = i15;
                                    c12 = sharedPreferences;
                                    hVar8 = hVar5;
                                    e = j15;
                                    b11 = notification;
                                    hVar = hVar6;
                                }
                                fileLocation = null;
                                if (j14 != 489001) {
                                }
                                str6 = K02;
                                str5 = "Stories";
                                mtVar = mtVar5;
                                L0 = null;
                                z20 = false;
                                z18 = false;
                                if (j14 == 489000) {
                                }
                                z19 = z24;
                                chat2 = L0;
                                str7 = str6;
                                z17 = z20;
                                if (j14 != 489000) {
                                }
                            } else {
                                L0 = otVar.getMessagesController().L0(Long.valueOf(-j14));
                                if (L0 != null) {
                                    boolean z25 = L0.megagroup;
                                    boolean z26 = w3.T(L0) && !L0.megagroup;
                                    boolean z27 = z24;
                                    String y3 = otVar.y(L0);
                                    z18 = z25;
                                    TLRPC.ChatPhoto chatPhoto3 = L0.photo;
                                    if (chatPhoto3 == null || (fileLocation2 = chatPhoto3.photo_small) == null) {
                                        str5 = "Stories";
                                        mtVar = mtVar5;
                                    } else {
                                        str5 = "Stories";
                                        mtVar = mtVar5;
                                        if (fileLocation2.volume_id != 0) {
                                        }
                                    }
                                    fileLocation2 = null;
                                    if (j13 != 0) {
                                        fileLocation3 = fileLocation2;
                                        z20 = z26;
                                        TLRPC.TL_forumTopic f7 = otVar.getMessagesController().R1().f(L0.id, j13);
                                        if (f7 != null) {
                                            y3 = a1.g.o(f7.title, " in ", y3, new StringBuilder());
                                        }
                                    } else {
                                        fileLocation3 = fileLocation2;
                                        z20 = z26;
                                    }
                                    if (z27) {
                                        str6 = y3;
                                        z24 = w3.q(L0);
                                    } else {
                                        str6 = y3;
                                        z24 = z27;
                                    }
                                    fileLocation = fileLocation3;
                                    user3 = null;
                                } else if (jjVar.i3()) {
                                    boolean A4 = jjVar.A4();
                                    str6 = jjVar.b;
                                    z18 = A4;
                                    str5 = "Stories";
                                    mtVar = mtVar5;
                                    z24 = false;
                                    user3 = null;
                                    z20 = jjVar.f;
                                    fileLocation = null;
                                } else {
                                    if (v2.a) {
                                        f8.l("not found chat to show dialog notification " + j14);
                                    }
                                    hVar6 = hVar;
                                    arrayList4 = arrayList;
                                    j15 = j12;
                                    notification = notification2;
                                    i29 = i16 + 1;
                                    arrayList = arrayList4;
                                    arrayList13 = arrayList16;
                                    hVar7 = hVar4;
                                    z14 = z15;
                                    z13 = z16;
                                    size = i15;
                                    c12 = sharedPreferences;
                                    hVar8 = hVar5;
                                    e = j15;
                                    b11 = notification;
                                    hVar = hVar6;
                                }
                                if (j14 == 489000) {
                                }
                                z19 = z24;
                                chat2 = L0;
                                str7 = str6;
                                z17 = z20;
                                if (j14 != 489000) {
                                }
                            }
                        }
                    }
                    if (jjVar == null || !jjVar.J) {
                        z21 = z17;
                        sharedPreferences2 = sharedPreferences;
                        str9 = K0;
                    } else {
                        z21 = z17;
                        sharedPreferences2 = sharedPreferences;
                        str9 = K0;
                        if (!sharedPreferences2.getBoolean("EnableReactionsPreview", true)) {
                            str10 = cd.K0(2131748037);
                            fileLocation = null;
                            z19 = false;
                            if (z15) {
                                str10 = o5.z(j14) ? cd.K0(2131748037) : cd.K0(2131748034);
                                fileLocation = null;
                                z19 = false;
                            }
                            SharedPreferences sharedPreferences3 = sharedPreferences2;
                            if (fileLocation == null) {
                                otVar.getFileLoader().getClass();
                                File L = b8.L(fileLocation, true);
                                user4 = user2;
                                if (Build.VERSION.SDK_INT < 28) {
                                    BitmapDrawable C = hc.D().C(fileLocation);
                                    if (C != null) {
                                        bitmap6 = C.getBitmap();
                                    } else {
                                        try {
                                            if (L.exists()) {
                                                float L2 = 160.0f / i0.L(50.0f);
                                                BitmapFactory.Options options = new BitmapFactory.Options();
                                                options.inSampleSize = L2 < 1.0f ? 1 : (int) L2;
                                                bitmap6 = BitmapFactory.decodeFile(L.getAbsolutePath(), options);
                                            } else {
                                                bitmap6 = null;
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    bitmap = bitmap6;
                                    file = L;
                                    if (chat != null) {
                                        if (file == null || !file.exists() || (i28 = Build.VERSION.SDK_INT) < 28) {
                                            j16 = j13;
                                            iconCompat3 = null;
                                        } else {
                                            if (j14 == 489001) {
                                                iconCompat3 = IconCompat.d(w0.b, R.drawable.ic_launcher_dr);
                                            } else {
                                                if (i28 >= 28) {
                                                    try {
                                                        iconCompat3 = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new et()));
                                                    } catch (Throwable unused2) {
                                                    }
                                                }
                                                iconCompat3 = null;
                                            }
                                            j16 = j13;
                                        }
                                        bitmap2 = bitmap;
                                        long j34 = -chat.id;
                                        e0.l0 l0Var3 = new e0.l0();
                                        l0Var3.a = str10;
                                        l0Var3.b = iconCompat3;
                                        file2 = file;
                                        l0Var3.c = null;
                                        l0Var3.d = null;
                                        l0Var3.e = false;
                                        l0Var3.f = false;
                                        hVar.k(l0Var3, j34);
                                    } else {
                                        file2 = file;
                                        j16 = j13;
                                        bitmap2 = bitmap;
                                    }
                                    String str21 = "currentAccount";
                                    if ((z21 || z18) && z19 && !tz.C && j12 != j14 && !h20.y(j14) && vp.r1(otVar.currentAccount).M1(j14) <= 0) {
                                        str11 = str10;
                                        Intent intent = new Intent(w0.b, (Class<?>) WearReplyReceiver.class);
                                        intent.putExtra("dialog_id", j14);
                                        intent.putExtra("max_id", f12);
                                        bitmap3 = bitmap2;
                                        j17 = j16;
                                        intent.putExtra("topic_id", j17);
                                        intent.putExtra("currentAccount", otVar.currentAccount);
                                        if (arrayList3.isEmpty()) {
                                            str12 = "max_id";
                                            chat3 = chat;
                                        } else {
                                            ArrayList arrayList19 = new ArrayList();
                                            chat3 = chat;
                                            for (int i38 = 0; i38 < arrayList3.size(); i38++) {
                                                jj jjVar5 = (jj) arrayList3.get(i38);
                                                if (jjVar5 != null && jjVar5.P4() && jjVar5.R2() && !jjVar5.N3()) {
                                                    arrayList19.add(Integer.valueOf(jjVar5.f1()));
                                                }
                                            }
                                            if (arrayList19.isEmpty()) {
                                                str12 = "max_id";
                                            } else {
                                                int size4 = arrayList19.size();
                                                int[] iArr = new int[size4];
                                                str12 = "max_id";
                                                for (int i39 = 0; i39 < size4; i39++) {
                                                    iArr[i39] = ((Integer) arrayList19.get(i39)).intValue();
                                                }
                                                intent.putExtra("voice_msg_ids", iArr);
                                            }
                                        }
                                        PendingIntent broadcast = PendingIntent.getBroadcast(w0.b, num2.intValue(), intent, 167772160);
                                        e0.n0 n0Var = new e0.n0(cd.K0(2131746278), new Bundle(), new HashSet());
                                        if (o5.z(j14)) {
                                            z22 = false;
                                            Z = cd.Z(2131746268, str11);
                                        } else {
                                            z22 = false;
                                            Z = cd.Z(2131746261, str11);
                                        }
                                        e0.h hVar9 = new e0.h(R.drawable.ic_reply_icon, Z, broadcast);
                                        hVar9.f();
                                        hVar9.a = 1;
                                        hVar9.a(n0Var);
                                        hVar9.c = z22;
                                        b10 = hVar9.b();
                                    } else {
                                        str11 = str10;
                                        bitmap3 = bitmap2;
                                        j17 = j16;
                                        str12 = "max_id";
                                        chat3 = chat;
                                        b10 = null;
                                    }
                                    num3 = (Integer) otVar.f.f(j14);
                                    if (num3 == null) {
                                        num3 = 0;
                                    }
                                    mtVar2 = mtVar;
                                    int size5 = mtVar2.c ? otVar.D.size() : Math.max(num3.intValue(), arrayList3.size());
                                    String format = (size5 > 1 || Build.VERSION.SDK_INT >= 28) ? str11 : String.format("%1$s (%2$d)", str11, Integer.valueOf(size5));
                                    long j35 = j12;
                                    long j36 = j17;
                                    e0.l0 l0Var4 = (e0.l0) hVar.f(j35);
                                    i19 = Build.VERSION.SDK_INT;
                                    if (i19 >= 28 || l0Var4 != null) {
                                        i20 = f12;
                                        j18 = j14;
                                        str13 = "dialog_id";
                                    } else {
                                        str13 = "dialog_id";
                                        TLRPC.User Z13 = otVar.getMessagesController().Z1(Long.valueOf(j35));
                                        if (Z13 == null) {
                                            Z13 = otVar.getUserConfig().f();
                                        }
                                        if (Z13 != null) {
                                            try {
                                                userProfilePhoto4 = Z13.photo;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                i20 = f12;
                                                j18 = j14;
                                            }
                                            if (userProfilePhoto4 != null && (fileLocation8 = userProfilePhoto4.photo_small) != null) {
                                                i20 = f12;
                                                j18 = j14;
                                                try {
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    l0Var = l0Var4;
                                                    f8.f(th);
                                                    yVar = (l0Var == null && (jjVar != null || !(jjVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new e0.y(l0Var) : new e0.y();
                                                    i21 = Build.VERSION.SDK_INT;
                                                    if (i21 >= 28) {
                                                    }
                                                    yVar.f(format);
                                                    yVar.i = Boolean.valueOf(i21 >= 28 || (!z21 && o5.z(j18)) || h20.y(j18));
                                                    StringBuilder sb4 = new StringBuilder();
                                                    String[] strArr2 = new String[1];
                                                    boolean[] zArr2 = new boolean[1];
                                                    if (mtVar2.c) {
                                                    }
                                                    mtVar3 = mtVar2;
                                                    String str22 = str21;
                                                    j25 = j19;
                                                    StringBuilder sb5 = sb4;
                                                    Intent intent2 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                                                    intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                    intent2.setFlags(67108864);
                                                    intent2.addCategory("android.intent.category.LAUNCHER");
                                                    if (jjVar == null) {
                                                    }
                                                    if (jjVar == null) {
                                                    }
                                                    if (jjVar == null) {
                                                    }
                                                    i24 = i22;
                                                    j26 = j25;
                                                    mtVar4 = mtVar3;
                                                    if (!mtVar4.c) {
                                                    }
                                                    j27 = j21;
                                                    i0.a.q(j27, a1.g.s(j26, "show extra notifications chatId ", " topicId "));
                                                    if (j27 != 0) {
                                                    }
                                                    intent2.putExtra(str22, otVar.currentAccount);
                                                    PendingIntent activity = PendingIntent.getActivity(w0.b, 0, intent2, 1140850688);
                                                    e0.e0 e0Var = new e0.e0();
                                                    e0.i iVar3 = iVar;
                                                    if (iVar != null) {
                                                    }
                                                    a0.h hVar10 = hVar;
                                                    int i40 = i24;
                                                    Intent intent3 = new Intent(w0.b, (Class<?>) AutoMessageHeardReceiver.class);
                                                    intent3.addFlags(i17);
                                                    intent3.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                    intent3.putExtra(str13, j26);
                                                    int i41 = i20;
                                                    intent3.putExtra(str12, i41);
                                                    intent3.putExtra(str22, otVar.currentAccount);
                                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList20 = arrayList6;
                                                    bitmap5 = bitmap4;
                                                    e0.h hVar11 = new e0.h(R.drawable.msg_markread, cd.K0(2131748696), PendingIntent.getBroadcast(w0.b, num2.intValue(), intent3, 167772160));
                                                    hVar11.a = 2;
                                                    hVar11.c = false;
                                                    e0.i b12 = hVar11.b();
                                                    if (o5.C(j26)) {
                                                    }
                                                    if (str17 != null) {
                                                    }
                                                    StringBuilder sb6 = new StringBuilder("tgaccount");
                                                    long j37 = j20;
                                                    sb6.append(j37);
                                                    e0Var.b(sb6.toString());
                                                    if (mtVar4.c) {
                                                    }
                                                    e0.r rVar2 = new e0.r(w0.b);
                                                    rVar2.g(str14);
                                                    rVar2.F.icon = R.drawable.notification;
                                                    rVar2.f(sb5.toString());
                                                    rVar2.h(16, true);
                                                    rVar2.i = mtVar4.c ? otVar.D.size() : arrayList10.size();
                                                    rVar2.w = -15618822;
                                                    rVar2.r = false;
                                                    rVar2.F.when = j28;
                                                    rVar2.k = true;
                                                    rVar2.n(yVar2);
                                                    rVar2.g = activity;
                                                    rVar2.c(e0Var);
                                                    rVar2.l(String.valueOf(Long.MAX_VALUE - j28));
                                                    rVar2.u = "msg";
                                                    Intent intent4 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                                                    intent4.putExtra("messageDate", i18);
                                                    intent4.putExtra("dialogId", j26);
                                                    intent4.putExtra(str22, otVar.currentAccount);
                                                    if (mtVar4.c) {
                                                    }
                                                    if (jjVar2 != null) {
                                                    }
                                                    rVar2.F.deleteIntent = PendingIntent.getBroadcast(w0.b, num2.intValue(), intent4, 167772160);
                                                    if (z16) {
                                                    }
                                                    if (jjVar3 != null) {
                                                    }
                                                    tL_inlineButtonTypeCopy = null;
                                                    keyboardInlineButton = null;
                                                    if (keyboardInlineButton != null) {
                                                    }
                                                    j29 = mtVar4.a;
                                                    if (j29 != 489000) {
                                                    }
                                                    if (arrayList16.size() != 1) {
                                                    }
                                                    if (o5.C(j26)) {
                                                    }
                                                    if (bitmap5 != null) {
                                                    }
                                                    if (!i0.p2(false)) {
                                                    }
                                                    if (chat3 == null) {
                                                    }
                                                    user5 = user4;
                                                    boolean z28 = z16;
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                    }
                                                    f8.b("showExtraNotifications: holders.add " + j26);
                                                    int intValue = num2.intValue();
                                                    boolean z29 = mtVar4.c;
                                                    z16 = z28;
                                                    long j38 = j26;
                                                    hVar6 = hVar10;
                                                    notification = notification2;
                                                    sharedPreferences = sharedPreferences3;
                                                    lt ltVar = new lt(otVar, intValue, j38, z29, str14, user5, chat3, rVar2, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                    arrayList4 = arrayList;
                                                    arrayList4.add(ltVar);
                                                    otVar.h.k(num2, j38);
                                                    i29 = i16 + 1;
                                                    arrayList = arrayList4;
                                                    arrayList13 = arrayList16;
                                                    hVar7 = hVar4;
                                                    z14 = z15;
                                                    z13 = z16;
                                                    size = i15;
                                                    c12 = sharedPreferences;
                                                    hVar8 = hVar5;
                                                    e = j15;
                                                    b11 = notification;
                                                    hVar = hVar6;
                                                }
                                                if (fileLocation8.volume_id != 0 && fileLocation8.local_id != 0) {
                                                    String K03 = cd.K0(2131750512);
                                                    b8 fileLoader = otVar.getFileLoader();
                                                    TLRPC.FileLocation fileLocation9 = Z13.photo.photo_small;
                                                    fileLoader.getClass();
                                                    File L3 = b8.L(fileLocation9, true);
                                                    if (otVar.getUserConfig().e() == 489001) {
                                                        iconCompat2 = IconCompat.d(w0.b, R.drawable.ic_launcher_dr);
                                                    } else {
                                                        if (L3 != null && i19 >= 28) {
                                                            try {
                                                                iconCompat2 = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(L3), new et()));
                                                            } catch (Throwable unused3) {
                                                            }
                                                        }
                                                        iconCompat2 = null;
                                                    }
                                                    l0Var = new e0.l0();
                                                    l0Var.a = K03;
                                                    l0Var.b = iconCompat2;
                                                    l0Var.c = null;
                                                    l0Var.d = null;
                                                    l0Var.e = false;
                                                    l0Var.f = false;
                                                    try {
                                                        hVar.k(l0Var, j35);
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        f8.f(th);
                                                        yVar = (l0Var == null && (jjVar != null || !(jjVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new e0.y(l0Var) : new e0.y();
                                                        i21 = Build.VERSION.SDK_INT;
                                                        if (i21 >= 28) {
                                                        }
                                                        yVar.f(format);
                                                        yVar.i = Boolean.valueOf(i21 >= 28 || (!z21 && o5.z(j18)) || h20.y(j18));
                                                        StringBuilder sb42 = new StringBuilder();
                                                        String[] strArr22 = new String[1];
                                                        boolean[] zArr22 = new boolean[1];
                                                        if (mtVar2.c) {
                                                        }
                                                        mtVar3 = mtVar2;
                                                        String str222 = str21;
                                                        j25 = j19;
                                                        StringBuilder sb52 = sb42;
                                                        Intent intent22 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                                                        intent22.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                        intent22.setFlags(67108864);
                                                        intent22.addCategory("android.intent.category.LAUNCHER");
                                                        if (jjVar == null) {
                                                        }
                                                        if (jjVar == null) {
                                                        }
                                                        if (jjVar == null) {
                                                        }
                                                        i24 = i22;
                                                        j26 = j25;
                                                        mtVar4 = mtVar3;
                                                        if (!mtVar4.c) {
                                                        }
                                                        j27 = j21;
                                                        i0.a.q(j27, a1.g.s(j26, "show extra notifications chatId ", " topicId "));
                                                        if (j27 != 0) {
                                                        }
                                                        intent22.putExtra(str222, otVar.currentAccount);
                                                        PendingIntent activity2 = PendingIntent.getActivity(w0.b, 0, intent22, 1140850688);
                                                        e0.e0 e0Var2 = new e0.e0();
                                                        e0.i iVar32 = iVar;
                                                        if (iVar != null) {
                                                        }
                                                        a0.h hVar102 = hVar;
                                                        int i402 = i24;
                                                        Intent intent32 = new Intent(w0.b, (Class<?>) AutoMessageHeardReceiver.class);
                                                        intent32.addFlags(i17);
                                                        intent32.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                        intent32.putExtra(str13, j26);
                                                        int i412 = i20;
                                                        intent32.putExtra(str12, i412);
                                                        intent32.putExtra(str222, otVar.currentAccount);
                                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList202 = arrayList6;
                                                        bitmap5 = bitmap4;
                                                        e0.h hVar112 = new e0.h(R.drawable.msg_markread, cd.K0(2131748696), PendingIntent.getBroadcast(w0.b, num2.intValue(), intent32, 167772160));
                                                        hVar112.a = 2;
                                                        hVar112.c = false;
                                                        e0.i b122 = hVar112.b();
                                                        if (o5.C(j26)) {
                                                        }
                                                        if (str17 != null) {
                                                        }
                                                        StringBuilder sb62 = new StringBuilder("tgaccount");
                                                        long j372 = j20;
                                                        sb62.append(j372);
                                                        e0Var2.b(sb62.toString());
                                                        if (mtVar4.c) {
                                                        }
                                                        e0.r rVar22 = new e0.r(w0.b);
                                                        rVar22.g(str14);
                                                        rVar22.F.icon = R.drawable.notification;
                                                        rVar22.f(sb52.toString());
                                                        rVar22.h(16, true);
                                                        rVar22.i = mtVar4.c ? otVar.D.size() : arrayList10.size();
                                                        rVar22.w = -15618822;
                                                        rVar22.r = false;
                                                        rVar22.F.when = j28;
                                                        rVar22.k = true;
                                                        rVar22.n(yVar2);
                                                        rVar22.g = activity2;
                                                        rVar22.c(e0Var2);
                                                        rVar22.l(String.valueOf(Long.MAX_VALUE - j28));
                                                        rVar22.u = "msg";
                                                        Intent intent42 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                                                        intent42.putExtra("messageDate", i18);
                                                        intent42.putExtra("dialogId", j26);
                                                        intent42.putExtra(str222, otVar.currentAccount);
                                                        if (mtVar4.c) {
                                                        }
                                                        if (jjVar2 != null) {
                                                        }
                                                        rVar22.F.deleteIntent = PendingIntent.getBroadcast(w0.b, num2.intValue(), intent42, 167772160);
                                                        if (z16) {
                                                        }
                                                        if (jjVar3 != null) {
                                                        }
                                                        tL_inlineButtonTypeCopy = null;
                                                        keyboardInlineButton = null;
                                                        if (keyboardInlineButton != null) {
                                                        }
                                                        j29 = mtVar4.a;
                                                        if (j29 != 489000) {
                                                        }
                                                        if (arrayList16.size() != 1) {
                                                        }
                                                        if (o5.C(j26)) {
                                                        }
                                                        if (bitmap5 != null) {
                                                        }
                                                        if (!i0.p2(false)) {
                                                        }
                                                        if (chat3 == null) {
                                                        }
                                                        user5 = user4;
                                                        boolean z282 = z16;
                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                        }
                                                        f8.b("showExtraNotifications: holders.add " + j26);
                                                        int intValue2 = num2.intValue();
                                                        boolean z292 = mtVar4.c;
                                                        z16 = z282;
                                                        long j382 = j26;
                                                        hVar6 = hVar102;
                                                        notification = notification2;
                                                        sharedPreferences = sharedPreferences3;
                                                        lt ltVar2 = new lt(otVar, intValue2, j382, z292, str14, user5, chat3, rVar22, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                        arrayList4 = arrayList;
                                                        arrayList4.add(ltVar2);
                                                        otVar.h.k(num2, j382);
                                                        i29 = i16 + 1;
                                                        arrayList = arrayList4;
                                                        arrayList13 = arrayList16;
                                                        hVar7 = hVar4;
                                                        z14 = z15;
                                                        z13 = z16;
                                                        size = i15;
                                                        c12 = sharedPreferences;
                                                        hVar8 = hVar5;
                                                        e = j15;
                                                        b11 = notification;
                                                        hVar = hVar6;
                                                    }
                                                    yVar = (l0Var == null && (jjVar != null || !(jjVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new e0.y(l0Var) : new e0.y();
                                                    i21 = Build.VERSION.SDK_INT;
                                                    if (i21 >= 28 || ((o5.z(j18) && !z21) || h20.y(j18))) {
                                                        yVar.f(format);
                                                    }
                                                    yVar.i = Boolean.valueOf(i21 >= 28 || (!z21 && o5.z(j18)) || h20.y(j18));
                                                    StringBuilder sb422 = new StringBuilder();
                                                    String[] strArr222 = new String[1];
                                                    boolean[] zArr222 = new boolean[1];
                                                    if (mtVar2.c) {
                                                        String str23 = str20;
                                                        j19 = j18;
                                                        j20 = j35;
                                                        int size6 = arrayList3.size() - 1;
                                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList21 = null;
                                                        int i42 = 0;
                                                        while (size6 >= 0) {
                                                            int i43 = size6;
                                                            jj jjVar6 = (jj) arrayList3.get(size6);
                                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList22 = arrayList21;
                                                            int i44 = i42;
                                                            e0.i iVar4 = b10;
                                                            mt mtVar6 = mtVar2;
                                                            long b23 = jj.b2(otVar.currentAccount, jjVar6.k, otVar.getMessagesController().t2(jjVar6));
                                                            if (j36 != b23) {
                                                                StringBuilder s11 = a1.g.s(j19, str23, "] continue; topic id is not equal: topicId=");
                                                                yVar4 = yVar;
                                                                long j39 = j36;
                                                                s11.append(j39);
                                                                s11.append(" messageTopicId=");
                                                                s11.append(b23);
                                                                s11.append("; selfId=");
                                                                s11.append(otVar.getUserConfig().e());
                                                                f8.b(s11.toString());
                                                                j24 = j39;
                                                                str16 = str21;
                                                                arrayList7 = arrayList3;
                                                                zArr = zArr222;
                                                                str15 = str23;
                                                                j23 = j19;
                                                                sb2 = sb422;
                                                                strArr = strArr222;
                                                            } else {
                                                                e0.y yVar5 = yVar;
                                                                long j40 = j36;
                                                                long j41 = j19;
                                                                String w9 = otVar.w(jjVar6, strArr222, zArr222);
                                                                if (j41 == 489001) {
                                                                    strArr222[0] = cd.K0(2131753121);
                                                                    strArr = strArr222;
                                                                    yVar3 = yVar5;
                                                                    zArr = zArr222;
                                                                } else if (j41 != 489000 || jjVar6.W0() == null) {
                                                                    strArr = strArr222;
                                                                    yVar3 = yVar5;
                                                                    zArr = zArr222;
                                                                    if (j41 == j20) {
                                                                        strArr[0] = str11;
                                                                    } else if (o5.z(j41) && jjVar6.k.from_scheduled) {
                                                                        strArr[0] = cd.K0(2131747978);
                                                                    }
                                                                } else {
                                                                    strArr = strArr222;
                                                                    yVar3 = yVar5;
                                                                    zArr = zArr222;
                                                                    strArr[0] = otVar.getMessagesController().z1(jjVar6.W0().longValue());
                                                                }
                                                                if (w9 == null) {
                                                                    if (v2.a) {
                                                                        f8.l("message text is null for " + jjVar6.f1() + " did = " + jjVar6.A0());
                                                                    }
                                                                    j23 = j41;
                                                                    j24 = j40;
                                                                    str16 = str21;
                                                                    sb2 = sb422;
                                                                    arrayList7 = arrayList3;
                                                                    str15 = str23;
                                                                    yVar4 = yVar3;
                                                                } else {
                                                                    if (sb422.length() > 0) {
                                                                        sb422.append("\n\n");
                                                                    }
                                                                    if (j41 != j20 && jjVar6.k.from_scheduled && o5.E(j41)) {
                                                                        w9 = String.format("%1$s: %2$s", cd.K0(2131747978), w9);
                                                                        sb422.append(w9);
                                                                    } else {
                                                                        String str24 = strArr[0];
                                                                        if (str24 != null) {
                                                                            sb422.append(String.format("%1$s: %2$s", str24, w9));
                                                                        } else {
                                                                            sb422.append(w9);
                                                                        }
                                                                    }
                                                                    String str25 = w9;
                                                                    int i45 = (j41 > 489000L ? 1 : (j41 == 489000L ? 0 : -1));
                                                                    if (i45 != 0 || jjVar6.W0() == null) {
                                                                        if (!o5.E(j41)) {
                                                                            if (z21) {
                                                                                j22 = -j41;
                                                                            } else if (o5.z(j41)) {
                                                                                j22 = jjVar6.S1();
                                                                            }
                                                                        }
                                                                        j22 = j41;
                                                                    } else {
                                                                        j22 = jjVar6.W0().longValue();
                                                                    }
                                                                    sb2 = sb422;
                                                                    arrayList7 = arrayList3;
                                                                    e0.l0 l0Var5 = (e0.l0) hVar.f(j22 + (j40 << 16));
                                                                    String str26 = strArr[0];
                                                                    if (str26 == null) {
                                                                        if (!z15) {
                                                                            str15 = str23;
                                                                        } else if (!o5.z(j41)) {
                                                                            str15 = str23;
                                                                            if (Build.VERSION.SDK_INT > 27) {
                                                                                str26 = cd.K0(2131748034);
                                                                            }
                                                                        } else if (z21) {
                                                                            str15 = str23;
                                                                            if (Build.VERSION.SDK_INT > 27) {
                                                                                str26 = cd.K0(2131748037);
                                                                            }
                                                                        } else {
                                                                            str15 = str23;
                                                                            str26 = cd.K0(2131748036);
                                                                        }
                                                                        str26 = "";
                                                                    } else {
                                                                        str15 = str23;
                                                                    }
                                                                    if (l0Var5 == null || !TextUtils.equals(l0Var5.b(), str26)) {
                                                                        if (!zArr[0] || o5.C(j41)) {
                                                                            j23 = j41;
                                                                            j24 = j40;
                                                                            str16 = str21;
                                                                        } else {
                                                                            int i46 = Build.VERSION.SDK_INT;
                                                                            str16 = str21;
                                                                            if (i46 >= 28) {
                                                                                if (o5.E(j41) || z21) {
                                                                                    i23 = i45;
                                                                                    j24 = j40;
                                                                                    file3 = file2;
                                                                                } else {
                                                                                    j24 = j40;
                                                                                    long S1 = jjVar6.S1();
                                                                                    i23 = i45;
                                                                                    TLRPC.User Z14 = otVar.getMessagesController().Z1(Long.valueOf(S1));
                                                                                    if (Z14 == null && (Z14 = otVar.getMessagesStorage().k0(S1)) != null) {
                                                                                        otVar.getMessagesController().U3(Z14, true, false);
                                                                                    }
                                                                                    if (Z14 == null || (userProfilePhoto3 = Z14.photo) == null || (fileLocation7 = userProfilePhoto3.photo_small) == null || fileLocation7.volume_id == 0 || fileLocation7.local_id == 0) {
                                                                                        file3 = null;
                                                                                    } else {
                                                                                        b8 fileLoader2 = otVar.getFileLoader();
                                                                                        TLRPC.FileLocation fileLocation10 = Z14.photo.photo_small;
                                                                                        fileLoader2.getClass();
                                                                                        file3 = b8.L(fileLocation10, true);
                                                                                    }
                                                                                }
                                                                                if (file3 == null && i23 == 0 && jjVar6.W0() != null) {
                                                                                    if (j22 >= 0) {
                                                                                        TLRPC.User Z15 = otVar.getMessagesController().Z1(Long.valueOf(j22));
                                                                                        if (Z15 != null && (userProfilePhoto2 = Z15.photo) != null && (fileLocation6 = userProfilePhoto2.photo_small) != null) {
                                                                                            j23 = j41;
                                                                                            if (fileLocation6.volume_id != 0 && fileLocation6.local_id != 0) {
                                                                                                b8 fileLoader3 = otVar.getFileLoader();
                                                                                                TLRPC.FileLocation fileLocation11 = Z15.photo.photo_small;
                                                                                                fileLoader3.getClass();
                                                                                                file3 = b8.L(fileLocation11, true);
                                                                                            }
                                                                                        }
                                                                                    } else {
                                                                                        j23 = j41;
                                                                                        TLRPC.Chat L02 = otVar.getMessagesController().L0(Long.valueOf(-j22));
                                                                                        if (L02 != null && (chatPhoto2 = L02.photo) != null && (fileLocation5 = chatPhoto2.photo_small) != null && fileLocation5.volume_id != 0 && fileLocation5.local_id != 0) {
                                                                                            b8 fileLoader4 = otVar.getFileLoader();
                                                                                            TLRPC.FileLocation fileLocation12 = L02.photo.photo_small;
                                                                                            fileLoader4.getClass();
                                                                                            file3 = b8.L(fileLocation12, true);
                                                                                        }
                                                                                    }
                                                                                    if (j41 != 489001) {
                                                                                        iconCompat = IconCompat.d(w0.b, R.drawable.ic_launcher_dr);
                                                                                    } else {
                                                                                        if (file3 != null && i46 >= 28) {
                                                                                            try {
                                                                                                iconCompat = IconCompat.c(ImageDecoder.decodeBitmap(ImageDecoder.createSource(file3), new et()));
                                                                                            } catch (Throwable unused4) {
                                                                                            }
                                                                                        }
                                                                                        iconCompat = null;
                                                                                    }
                                                                                    e0.l0 l0Var6 = new e0.l0();
                                                                                    l0Var6.a = str26;
                                                                                    l0Var6.b = iconCompat;
                                                                                    l0Var6.c = null;
                                                                                    l0Var6.d = null;
                                                                                    c10 = 0;
                                                                                    l0Var6.e = false;
                                                                                    l0Var6.f = false;
                                                                                    hVar.k(l0Var6, j22);
                                                                                    l0Var2 = l0Var6;
                                                                                }
                                                                                j23 = j41;
                                                                                if (j41 != 489001) {
                                                                                }
                                                                                e0.l0 l0Var62 = new e0.l0();
                                                                                l0Var62.a = str26;
                                                                                l0Var62.b = iconCompat;
                                                                                l0Var62.c = null;
                                                                                l0Var62.d = null;
                                                                                c10 = 0;
                                                                                l0Var62.e = false;
                                                                                l0Var62.f = false;
                                                                                hVar.k(l0Var62, j22);
                                                                                l0Var2 = l0Var62;
                                                                            } else {
                                                                                j23 = j41;
                                                                                j24 = j40;
                                                                            }
                                                                        }
                                                                        iconCompat = null;
                                                                        e0.l0 l0Var622 = new e0.l0();
                                                                        l0Var622.a = str26;
                                                                        l0Var622.b = iconCompat;
                                                                        l0Var622.c = null;
                                                                        l0Var622.d = null;
                                                                        c10 = 0;
                                                                        l0Var622.e = false;
                                                                        l0Var622.f = false;
                                                                        hVar.k(l0Var622, j22);
                                                                        l0Var2 = l0Var622;
                                                                    } else {
                                                                        j23 = j41;
                                                                        j24 = j40;
                                                                        l0Var2 = l0Var5;
                                                                        c10 = 0;
                                                                        str16 = str21;
                                                                    }
                                                                    if (o5.C(j23)) {
                                                                        yVar4 = yVar3;
                                                                        e0.x xVar = new e0.x(str25, jjVar6.k.date * 1000, l0Var2);
                                                                        ArrayList arrayList23 = yVar4.e;
                                                                        arrayList23.add(xVar);
                                                                        if (arrayList23.size() > 25) {
                                                                            arrayList23.remove(0);
                                                                        }
                                                                    } else {
                                                                        if (zArr[c10] && Build.VERSION.SDK_INT >= 28 && !((ActivityManager) w0.b.getSystemService("activity")).isLowRamDevice() && !z15 && !jjVar6.l4() && (jjVar6.D == 1 || jjVar6.t4())) {
                                                                            b8 fileLoader5 = otVar.getFileLoader();
                                                                            TLRPC.Message message2 = jjVar6.k;
                                                                            fileLoader5.getClass();
                                                                            File M = b8.M(message2);
                                                                            if (M.exists() && jjVar6.t2()) {
                                                                                File file7 = new File(M.getParentFile(), M.getName() + ".blur.jpg");
                                                                                if (file7.exists()) {
                                                                                    file6 = M;
                                                                                } else {
                                                                                    try {
                                                                                        Bitmap decodeFile = BitmapFactory.decodeFile(M.getAbsolutePath());
                                                                                        Bitmap C2 = Utilities.C(decodeFile);
                                                                                        decodeFile.recycle();
                                                                                        createScaledBitmap = Bitmap.createScaledBitmap(C2, decodeFile.getWidth(), decodeFile.getHeight(), true);
                                                                                        Utilities.stackBlurBitmap(createScaledBitmap, 5);
                                                                                        C2.recycle();
                                                                                        canvas = new Canvas(createScaledBitmap);
                                                                                        otVar.f0.h(i0.b.o(-1, (int) (Color.alpha(-1) * 0.325f)));
                                                                                        file6 = M;
                                                                                    } catch (Exception e7) {
                                                                                        e = e7;
                                                                                        file6 = M;
                                                                                    }
                                                                                    try {
                                                                                        otVar.f0.setBounds(0, 0, createScaledBitmap.getWidth(), createScaledBitmap.getHeight());
                                                                                        otVar.f0.draw(canvas);
                                                                                        FileOutputStream fileOutputStream = new FileOutputStream(file7);
                                                                                        createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                                                                                        fileOutputStream.close();
                                                                                        createScaledBitmap.recycle();
                                                                                        file5 = file7;
                                                                                        file4 = file5;
                                                                                    } catch (Exception e10) {
                                                                                        e = e10;
                                                                                        f8.f(e);
                                                                                        file5 = file7;
                                                                                        file4 = file6;
                                                                                        e0.x xVar2 = new e0.x(str25, jjVar6.k.date * 1000, l0Var2);
                                                                                        String str27 = !jjVar6.t4() ? "image/webp" : "image/jpeg";
                                                                                        if (file4.exists()) {
                                                                                        }
                                                                                        if (d != null) {
                                                                                        }
                                                                                        yVar4 = yVar3;
                                                                                        e0.x xVar3 = new e0.x(str25, jjVar6.k.date * 1000, l0Var2);
                                                                                        arrayList8 = yVar4.e;
                                                                                        arrayList8.add(xVar3);
                                                                                        if (arrayList8.size() > 25) {
                                                                                        }
                                                                                        c11 = 0;
                                                                                        if (zArr[c11]) {
                                                                                        }
                                                                                        if (j23 == 777000) {
                                                                                        }
                                                                                        arrayList21 = arrayList22;
                                                                                        f13 = i44;
                                                                                        size6 = i43 - 1;
                                                                                        yVar = yVar4;
                                                                                        arrayList3 = arrayList7;
                                                                                        strArr222 = strArr;
                                                                                        sb422 = sb2;
                                                                                        mtVar2 = mtVar6;
                                                                                        zArr222 = zArr;
                                                                                        str21 = str16;
                                                                                        str23 = str15;
                                                                                        j36 = j24;
                                                                                        j19 = j23;
                                                                                        i42 = f13;
                                                                                        b10 = iVar4;
                                                                                    }
                                                                                }
                                                                                file5 = file7;
                                                                                file4 = file6;
                                                                            } else {
                                                                                file4 = M;
                                                                                file5 = null;
                                                                            }
                                                                            e0.x xVar22 = new e0.x(str25, jjVar6.k.date * 1000, l0Var2);
                                                                            String str272 = !jjVar6.t4() ? "image/webp" : "image/jpeg";
                                                                            if (file4.exists()) {
                                                                                if (otVar.getFileLoader().T(file4.getName())) {
                                                                                    Uri.Builder scheme = new Uri.Builder().scheme("content");
                                                                                    if (NotificationImageProvider.d == null) {
                                                                                        w0.d();
                                                                                        NotificationImageProvider.d = "org.telegram.messenger.beta.notification_image_provider";
                                                                                    }
                                                                                    d = scheme.authority(NotificationImageProvider.d).appendPath("msg_media_raw").appendPath(otVar.currentAccount + "").appendPath(file4.getName()).appendQueryParameter("final_path", file4.getAbsolutePath()).build();
                                                                                }
                                                                                d = null;
                                                                            } else {
                                                                                try {
                                                                                    Context context = w0.b;
                                                                                    StringBuilder sb7 = new StringBuilder();
                                                                                    w0.d();
                                                                                    sb7.append("org.telegram.messenger.beta");
                                                                                    sb7.append(".provider");
                                                                                    d = FileProvider.d(context, sb7.toString(), file4);
                                                                                } catch (Exception e11) {
                                                                                    f8.f(e11);
                                                                                }
                                                                            }
                                                                            if (d != null) {
                                                                                xVar22.e = str272;
                                                                                xVar22.f = d;
                                                                                yVar4 = yVar3;
                                                                                ArrayList arrayList24 = yVar4.e;
                                                                                arrayList24.add(xVar22);
                                                                                if (arrayList24.size() > 25) {
                                                                                    arrayList24.remove(0);
                                                                                }
                                                                                w0.b.grantUriPermission("com.android.systemui", d, 1);
                                                                                i0.h3(new hr(10, d, file5), 20000L);
                                                                                if (!TextUtils.isEmpty(jjVar6.z)) {
                                                                                    e0.x xVar4 = new e0.x(jjVar6.z, jjVar6.k.date * 1000, l0Var2);
                                                                                    ArrayList arrayList25 = yVar4.e;
                                                                                    arrayList25.add(xVar4);
                                                                                    if (arrayList25.size() > 25) {
                                                                                        arrayList25.remove(0);
                                                                                    }
                                                                                }
                                                                                c11 = 0;
                                                                                if (zArr[c11] && !z15 && jjVar6.P4()) {
                                                                                    arrayList9 = (ArrayList) yVar4.d();
                                                                                    if (!arrayList9.isEmpty()) {
                                                                                        b8 fileLoader6 = otVar.getFileLoader();
                                                                                        TLRPC.Message message3 = jjVar6.k;
                                                                                        fileLoader6.getClass();
                                                                                        File M2 = b8.M(message3);
                                                                                        if (M2.exists()) {
                                                                                            if (Build.VERSION.SDK_INT >= 24) {
                                                                                                try {
                                                                                                    Context context2 = w0.b;
                                                                                                    StringBuilder sb8 = new StringBuilder();
                                                                                                    w0.d();
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
                                                                                                e0.x xVar5 = (e0.x) i0.a.g(1, arrayList9);
                                                                                                xVar5.e = "audio/ogg";
                                                                                                xVar5.f = uri2;
                                                                                            }
                                                                                        } else if (jjVar6.F0() != null) {
                                                                                            String s12 = b8.s(jjVar6.F0());
                                                                                            if (!otVar.s.contains(s12)) {
                                                                                                otVar.s.add(s12);
                                                                                                otVar.getFileLoader().X(jjVar6.F0(), jjVar6, 3, 0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        yVar4 = yVar3;
                                                                        e0.x xVar32 = new e0.x(str25, jjVar6.k.date * 1000, l0Var2);
                                                                        arrayList8 = yVar4.e;
                                                                        arrayList8.add(xVar32);
                                                                        if (arrayList8.size() > 25) {
                                                                            c11 = 0;
                                                                            arrayList8.remove(0);
                                                                            if (zArr[c11]) {
                                                                                arrayList9 = (ArrayList) yVar4.d();
                                                                                if (!arrayList9.isEmpty()) {
                                                                                }
                                                                            }
                                                                        }
                                                                        c11 = 0;
                                                                        if (zArr[c11]) {
                                                                        }
                                                                    }
                                                                    if (j23 == 777000) {
                                                                        TLRPC.ReplyMarkup replyMarkup2 = jjVar6.k.reply_markup;
                                                                        if (replyMarkup2 instanceof TLRPC.TL_replyInlineMarkup) {
                                                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList26 = ((TLRPC.TL_replyInlineMarkup) replyMarkup2).rows;
                                                                            f13 = jjVar6.f1();
                                                                            arrayList21 = arrayList26;
                                                                            size6 = i43 - 1;
                                                                            yVar = yVar4;
                                                                            arrayList3 = arrayList7;
                                                                            strArr222 = strArr;
                                                                            sb422 = sb2;
                                                                            mtVar2 = mtVar6;
                                                                            zArr222 = zArr;
                                                                            str21 = str16;
                                                                            str23 = str15;
                                                                            j36 = j24;
                                                                            j19 = j23;
                                                                            i42 = f13;
                                                                            b10 = iVar4;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            arrayList21 = arrayList22;
                                                            f13 = i44;
                                                            size6 = i43 - 1;
                                                            yVar = yVar4;
                                                            arrayList3 = arrayList7;
                                                            strArr222 = strArr;
                                                            sb422 = sb2;
                                                            mtVar2 = mtVar6;
                                                            zArr222 = zArr;
                                                            str21 = str16;
                                                            str23 = str15;
                                                            j36 = j24;
                                                            j19 = j23;
                                                            i42 = f13;
                                                            b10 = iVar4;
                                                        }
                                                        iVar = b10;
                                                        int i47 = i42;
                                                        j21 = j36;
                                                        yVar2 = yVar;
                                                        arrayList5 = arrayList3;
                                                        str14 = str11;
                                                        bitmap4 = bitmap3;
                                                        arrayList6 = arrayList21;
                                                        i22 = i47;
                                                    } else {
                                                        ArrayList arrayList27 = new ArrayList();
                                                        ArrayList arrayList28 = new ArrayList();
                                                        Pair I = otVar.I(arrayList27, arrayList28);
                                                        int intValue3 = ((Integer) I.first).intValue();
                                                        boolean booleanValue = ((Boolean) I.second).booleanValue();
                                                        if (booleanValue) {
                                                            arrayList12 = arrayList28;
                                                            z23 = booleanValue;
                                                            sb422.append(cd.G(intValue3, "StoryNotificationHidden", new Object[0]));
                                                            j19 = j18;
                                                        } else {
                                                            arrayList12 = arrayList28;
                                                            z23 = booleanValue;
                                                            if (arrayList27.isEmpty()) {
                                                                f8.b(str20 + j18 + "] continue; story but names is empty");
                                                                j15 = j35;
                                                                hVar6 = hVar;
                                                                arrayList4 = arrayList;
                                                                notification = notification2;
                                                                sharedPreferences = sharedPreferences3;
                                                                i29 = i16 + 1;
                                                                arrayList = arrayList4;
                                                                arrayList13 = arrayList16;
                                                                hVar7 = hVar4;
                                                                z14 = z15;
                                                                z13 = z16;
                                                                size = i15;
                                                                c12 = sharedPreferences;
                                                                hVar8 = hVar5;
                                                                e = j15;
                                                                b11 = notification;
                                                                hVar = hVar6;
                                                            } else {
                                                                j19 = j18;
                                                                if (arrayList27.size() == 1) {
                                                                    if (intValue3 == 1) {
                                                                        sb422.append(cd.M0("StoryNotificationSingle"));
                                                                    } else {
                                                                        sb422.append(cd.G(intValue3, "StoryNotification1", arrayList27.get(0)));
                                                                    }
                                                                } else if (arrayList27.size() == 2) {
                                                                    sb422.append(cd.Z(2131744621, arrayList27.get(0), arrayList27.get(1)));
                                                                } else if (arrayList27.size() == 3 && otVar.D.size() == 3) {
                                                                    sb422.append(cd.Z(2131744620, k((String) arrayList27.get(0)), k((String) arrayList27.get(1)), k((String) arrayList27.get(2))));
                                                                } else {
                                                                    sb422.append(cd.G(otVar.D.size() - 2, "StoryNotification4", k((String) arrayList27.get(0)), k((String) arrayList27.get(1))));
                                                                }
                                                            }
                                                        }
                                                        j20 = j35;
                                                        long j42 = Long.MAX_VALUE;
                                                        for (int i48 = 0; i48 < otVar.D.size(); i48++) {
                                                            j42 = Math.min(((nt) otVar.D.get(i48)).e, j42);
                                                        }
                                                        yVar.i = Boolean.FALSE;
                                                        if (arrayList27.size() != 1 || z23) {
                                                            r12 = 0;
                                                            G = cd.G(intValue3, str5, new Object[0]);
                                                        } else {
                                                            r12 = 0;
                                                            G = (String) arrayList27.get(0);
                                                        }
                                                        e0.l0 l0Var7 = new e0.l0();
                                                        l0Var7.a = G;
                                                        l0Var7.b = null;
                                                        l0Var7.c = null;
                                                        l0Var7.d = null;
                                                        l0Var7.e = r12;
                                                        l0Var7.f = r12;
                                                        e0.x xVar6 = new e0.x(sb422, j42, l0Var7);
                                                        ArrayList arrayList29 = yVar.e;
                                                        arrayList29.add(xVar6);
                                                        if (arrayList29.size() > 25) {
                                                            arrayList29.remove((int) r12);
                                                        }
                                                        bitmap4 = !z23 ? F(arrayList12) : null;
                                                        iVar = b10;
                                                        yVar2 = yVar;
                                                        j21 = j36;
                                                        arrayList6 = null;
                                                        str14 = G;
                                                        arrayList5 = arrayList3;
                                                        i22 = 0;
                                                    }
                                                    mtVar3 = mtVar2;
                                                    String str2222 = str21;
                                                    j25 = j19;
                                                    StringBuilder sb522 = sb422;
                                                    Intent intent222 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                                                    intent222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                    intent222.setFlags(67108864);
                                                    intent222.addCategory("android.intent.category.LAUNCHER");
                                                    if (jjVar == null && jjVar.O) {
                                                        intent222.putExtra("oauth_url", jjVar.b);
                                                    } else if (jjVar == null && jjVar.J) {
                                                        intent222.putExtra("storyId", Math.abs(jjVar.f1()));
                                                    } else {
                                                        if (jjVar == null && jjVar.N) {
                                                            if (j25 < 0) {
                                                                i24 = i22;
                                                                j26 = j25;
                                                                intent222.putExtra("chatId", -j26);
                                                            } else {
                                                                i24 = i22;
                                                                j26 = j25;
                                                                if (j25 > 0) {
                                                                    intent222.putExtra("userId", j26);
                                                                }
                                                            }
                                                            intent222.putExtra("storyId", Math.abs(jjVar.f1()));
                                                            mtVar4 = mtVar3;
                                                        } else {
                                                            i24 = i22;
                                                            j26 = j25;
                                                            mtVar4 = mtVar3;
                                                            if (!mtVar4.c) {
                                                                long[] jArr2 = new long[otVar.D.size()];
                                                                for (int i49 = 0; i49 < otVar.D.size(); i49++) {
                                                                    jArr2[i49] = ((nt) otVar.D.get(i49)).a;
                                                                }
                                                                intent222.putExtra("storyDialogIds", jArr2);
                                                            } else if (o5.C(j26)) {
                                                                intent222.putExtra("encId", o5.h(j26));
                                                            } else if (o5.E(j26)) {
                                                                intent222.putExtra("userId", j26);
                                                            } else {
                                                                intent222.putExtra("chatId", -j26);
                                                            }
                                                        }
                                                        j27 = j21;
                                                        i0.a.q(j27, a1.g.s(j26, "show extra notifications chatId ", " topicId "));
                                                        if (j27 != 0) {
                                                            intent222.putExtra("topicId", j27);
                                                        }
                                                        intent222.putExtra(str2222, otVar.currentAccount);
                                                        PendingIntent activity22 = PendingIntent.getActivity(w0.b, 0, intent222, 1140850688);
                                                        e0.e0 e0Var22 = new e0.e0();
                                                        e0.i iVar322 = iVar;
                                                        if (iVar != null) {
                                                            e0Var22.a(iVar322);
                                                        }
                                                        a0.h hVar1022 = hVar;
                                                        int i4022 = i24;
                                                        Intent intent322 = new Intent(w0.b, (Class<?>) AutoMessageHeardReceiver.class);
                                                        intent322.addFlags(i17);
                                                        intent322.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                        intent322.putExtra(str13, j26);
                                                        int i4122 = i20;
                                                        intent322.putExtra(str12, i4122);
                                                        intent322.putExtra(str2222, otVar.currentAccount);
                                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList2022 = arrayList6;
                                                        bitmap5 = bitmap4;
                                                        e0.h hVar1122 = new e0.h(R.drawable.msg_markread, cd.K0(2131748696), PendingIntent.getBroadcast(w0.b, num2.intValue(), intent322, 167772160));
                                                        hVar1122.a = 2;
                                                        hVar1122.c = false;
                                                        e0.i b1222 = hVar1122.b();
                                                        if (o5.C(j26)) {
                                                            jjVar2 = jjVar;
                                                            str17 = j26 != n0 ? "tgenc" + o5.h(j26) + "_" + i4122 : null;
                                                        } else if (o5.E(j26)) {
                                                            str17 = "tguser" + j26 + "_" + i4122;
                                                            jjVar2 = jjVar;
                                                        } else {
                                                            StringBuilder sb9 = new StringBuilder("tgchat");
                                                            jjVar2 = jjVar;
                                                            sb9.append(-j26);
                                                            sb9.append("_");
                                                            sb9.append(i4122);
                                                            str17 = sb9.toString();
                                                        }
                                                        if (str17 != null) {
                                                            e0Var22.g = str17;
                                                            e0.e0 e0Var3 = new e0.e0();
                                                            e0Var3.g = "summary_".concat(str17);
                                                            rVar.c(e0Var3);
                                                        }
                                                        StringBuilder sb622 = new StringBuilder("tgaccount");
                                                        long j3722 = j20;
                                                        sb622.append(j3722);
                                                        e0Var22.b(sb622.toString());
                                                        if (mtVar4.c) {
                                                            j15 = j3722;
                                                            j28 = Long.MAX_VALUE;
                                                            int i50 = 0;
                                                            while (i50 < otVar.D.size()) {
                                                                j28 = Math.min(((nt) otVar.D.get(i50)).e, j28);
                                                                i50++;
                                                                iVar322 = iVar322;
                                                            }
                                                            iVar2 = iVar322;
                                                            arrayList10 = arrayList5;
                                                        } else {
                                                            iVar2 = iVar322;
                                                            j15 = j3722;
                                                            arrayList10 = arrayList5;
                                                            j28 = ((jj) arrayList10.get(0)).k.date * 1000;
                                                        }
                                                        e0.r rVar222 = new e0.r(w0.b);
                                                        rVar222.g(str14);
                                                        rVar222.F.icon = R.drawable.notification;
                                                        rVar222.f(sb522.toString());
                                                        rVar222.h(16, true);
                                                        rVar222.i = mtVar4.c ? otVar.D.size() : arrayList10.size();
                                                        rVar222.w = -15618822;
                                                        rVar222.r = false;
                                                        rVar222.F.when = j28;
                                                        rVar222.k = true;
                                                        rVar222.n(yVar2);
                                                        rVar222.g = activity22;
                                                        rVar222.c(e0Var22);
                                                        rVar222.l(String.valueOf(Long.MAX_VALUE - j28));
                                                        rVar222.u = "msg";
                                                        Intent intent422 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                                                        intent422.putExtra("messageDate", i18);
                                                        intent422.putExtra("dialogId", j26);
                                                        intent422.putExtra(str2222, otVar.currentAccount);
                                                        if (mtVar4.c) {
                                                            intent422.putExtra("story", true);
                                                        }
                                                        if (jjVar2 != null) {
                                                            jjVar3 = jjVar2;
                                                            try {
                                                                if (jjVar3.J) {
                                                                    intent422.putExtra("storyReaction", true);
                                                                }
                                                            } catch (Exception e12) {
                                                                e = e12;
                                                                f8.f(e);
                                                                if (z16) {
                                                                }
                                                                if (jjVar3 != null) {
                                                                }
                                                                tL_inlineButtonTypeCopy = null;
                                                                keyboardInlineButton = null;
                                                                if (keyboardInlineButton != null) {
                                                                }
                                                                j29 = mtVar4.a;
                                                                if (j29 != 489000) {
                                                                }
                                                                if (arrayList16.size() != 1) {
                                                                }
                                                                if (o5.C(j26)) {
                                                                }
                                                                if (bitmap5 != null) {
                                                                }
                                                                if (!i0.p2(false)) {
                                                                }
                                                                if (chat3 == null) {
                                                                }
                                                                user5 = user4;
                                                                boolean z2822 = z16;
                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                }
                                                                f8.b("showExtraNotifications: holders.add " + j26);
                                                                int intValue22 = num2.intValue();
                                                                boolean z2922 = mtVar4.c;
                                                                z16 = z2822;
                                                                long j3822 = j26;
                                                                hVar6 = hVar1022;
                                                                notification = notification2;
                                                                sharedPreferences = sharedPreferences3;
                                                                lt ltVar22 = new lt(otVar, intValue22, j3822, z2922, str14, user5, chat3, rVar222, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                                arrayList4 = arrayList;
                                                                arrayList4.add(ltVar22);
                                                                otVar.h.k(num2, j3822);
                                                                i29 = i16 + 1;
                                                                arrayList = arrayList4;
                                                                arrayList13 = arrayList16;
                                                                hVar7 = hVar4;
                                                                z14 = z15;
                                                                z13 = z16;
                                                                size = i15;
                                                                c12 = sharedPreferences;
                                                                hVar8 = hVar5;
                                                                e = j15;
                                                                b11 = notification;
                                                                hVar = hVar6;
                                                            }
                                                        } else {
                                                            jjVar3 = jjVar2;
                                                        }
                                                        rVar222.F.deleteIntent = PendingIntent.getBroadcast(w0.b, num2.intValue(), intent422, 167772160);
                                                        if (z16) {
                                                            rVar222.q = otVar.e0;
                                                            rVar222.i();
                                                        }
                                                        if (jjVar3 != null && (message = jjVar3.k) != null) {
                                                            replyMarkup = message.reply_markup;
                                                            if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                TLRPC.TL_replyInlineMarkup tL_replyInlineMarkup = (TLRPC.TL_replyInlineMarkup) replyMarkup;
                                                                keyboardInlineButton = null;
                                                                TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy2 = null;
                                                                for (int i51 = 0; i51 < tL_replyInlineMarkup.rows.size(); i51++) {
                                                                    int i52 = 0;
                                                                    while (true) {
                                                                        if (i52 >= tL_replyInlineMarkup.rows.get(i51).buttons.size()) {
                                                                            break;
                                                                        }
                                                                        TL_keyboard.KeyboardInlineButton keyboardInlineButton2 = tL_replyInlineMarkup.rows.get(i51).buttons.get(i52);
                                                                        tL_inlineButtonTypeCopy2 = (TL_keyboard.TL_inlineButtonTypeCopy) sf.c.a(keyboardInlineButton2, TL_keyboard.TL_inlineButtonTypeCopy.class);
                                                                        if (tL_inlineButtonTypeCopy2 != null) {
                                                                            keyboardInlineButton = keyboardInlineButton2;
                                                                            break;
                                                                        }
                                                                        i52++;
                                                                    }
                                                                    if (keyboardInlineButton != null) {
                                                                        break;
                                                                    }
                                                                }
                                                                tL_inlineButtonTypeCopy = tL_inlineButtonTypeCopy2;
                                                                if (keyboardInlineButton != null) {
                                                                    Intent intent5 = new Intent(w0.b, (Class<?>) CopyCodeReceiver.class);
                                                                    intent5.addFlags(32);
                                                                    intent5.setAction("org.telegram.messenger.ACTION_COPY_CODE");
                                                                    intent5.putExtra("text", tL_inlineButtonTypeCopy.copy_text);
                                                                    e0.h hVar12 = new e0.h(R.drawable.msg_copy, keyboardInlineButton.text, PendingIntent.getBroadcast(w0.b, num2.intValue(), intent5, 167772160));
                                                                    hVar12.c = false;
                                                                    rVar222.b.add(hVar12.b());
                                                                }
                                                                j29 = mtVar4.a;
                                                                if (j29 != 489000 && j29 != 489001) {
                                                                    if (iVar2 != null) {
                                                                        rVar222.b.add(iVar2);
                                                                    }
                                                                    if (!z15 && !mtVar4.c && (jjVar3 == null || !jjVar3.J)) {
                                                                        rVar222.b.add(b1222);
                                                                    }
                                                                }
                                                                if (arrayList16.size() != 1 && !TextUtils.isEmpty(str) && !mtVar4.c) {
                                                                    rVar222.o(str);
                                                                }
                                                                if (o5.C(j26)) {
                                                                    rVar222.k();
                                                                }
                                                                if (bitmap5 != null) {
                                                                    rVar222.j(bitmap5);
                                                                }
                                                                if (!i0.p2(false) && !tz.C && arrayList2022 != null) {
                                                                    size3 = arrayList2022.size();
                                                                    i25 = 0;
                                                                    while (i25 < size3) {
                                                                        ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList30 = arrayList2022;
                                                                        TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList30.get(i25);
                                                                        int size7 = keyboardInlineButtonRow.buttons.size();
                                                                        int i53 = 0;
                                                                        while (i53 < size7) {
                                                                            TL_keyboard.KeyboardInlineButton keyboardInlineButton3 = keyboardInlineButtonRow.buttons.get(i53);
                                                                            TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) sf.c.a(keyboardInlineButton3, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                                            int i54 = size3;
                                                                            if (tL_inlineButtonTypeCallback != null) {
                                                                                i26 = i25;
                                                                                Intent intent6 = new Intent(w0.b, (Class<?>) NotificationCallbackReceiver.class);
                                                                                intent6.putExtra(str2222, otVar.currentAccount);
                                                                                intent6.putExtra("did", j26);
                                                                                byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                                if (bArr != null) {
                                                                                    intent6.putExtra("data", bArr);
                                                                                }
                                                                                i27 = i4022;
                                                                                intent6.putExtra("mid", i27);
                                                                                String str28 = keyboardInlineButton3.text;
                                                                                Context context3 = w0.b;
                                                                                int i55 = otVar.H;
                                                                                arrayList11 = arrayList30;
                                                                                otVar.H = i55 + 1;
                                                                                rVar222.a(0, str28, PendingIntent.getBroadcast(context3, i55, intent6, 167772160));
                                                                            } else {
                                                                                i26 = i25;
                                                                                i27 = i4022;
                                                                                arrayList11 = arrayList30;
                                                                            }
                                                                            i53++;
                                                                            size3 = i54;
                                                                            arrayList30 = arrayList11;
                                                                            i25 = i26;
                                                                            i4022 = i27;
                                                                        }
                                                                        i25++;
                                                                        size3 = size3;
                                                                        arrayList2022 = arrayList30;
                                                                        i4022 = i4022;
                                                                    }
                                                                }
                                                                if (chat3 == null || user4 == null) {
                                                                    user5 = user4;
                                                                } else {
                                                                    user5 = user4;
                                                                    String str29 = user5.phone;
                                                                    if (str29 != null && str29.length() > 0) {
                                                                        String str30 = "tel:+" + user5.phone;
                                                                        if (str30 != null && !str30.isEmpty()) {
                                                                            rVar222.G.add(str30);
                                                                        }
                                                                    }
                                                                }
                                                                boolean z28222 = z16;
                                                                if (Build.VERSION.SDK_INT >= 26) {
                                                                    W(notification2, rVar222, z28222);
                                                                }
                                                                f8.b("showExtraNotifications: holders.add " + j26);
                                                                int intValue222 = num2.intValue();
                                                                boolean z29222 = mtVar4.c;
                                                                z16 = z28222;
                                                                long j38222 = j26;
                                                                hVar6 = hVar1022;
                                                                notification = notification2;
                                                                sharedPreferences = sharedPreferences3;
                                                                lt ltVar222 = new lt(otVar, intValue222, j38222, z29222, str14, user5, chat3, rVar222, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                                arrayList4 = arrayList;
                                                                arrayList4.add(ltVar222);
                                                                otVar.h.k(num2, j38222);
                                                                i29 = i16 + 1;
                                                                arrayList = arrayList4;
                                                                arrayList13 = arrayList16;
                                                                hVar7 = hVar4;
                                                                z14 = z15;
                                                                z13 = z16;
                                                                size = i15;
                                                                c12 = sharedPreferences;
                                                                hVar8 = hVar5;
                                                                e = j15;
                                                                b11 = notification;
                                                                hVar = hVar6;
                                                            }
                                                        }
                                                        tL_inlineButtonTypeCopy = null;
                                                        keyboardInlineButton = null;
                                                        if (keyboardInlineButton != null) {
                                                        }
                                                        j29 = mtVar4.a;
                                                        if (j29 != 489000) {
                                                            if (iVar2 != null) {
                                                            }
                                                            if (!z15) {
                                                                rVar222.b.add(b1222);
                                                            }
                                                        }
                                                        if (arrayList16.size() != 1) {
                                                        }
                                                        if (o5.C(j26)) {
                                                        }
                                                        if (bitmap5 != null) {
                                                        }
                                                        if (!i0.p2(false)) {
                                                            size3 = arrayList2022.size();
                                                            i25 = 0;
                                                            while (i25 < size3) {
                                                            }
                                                        }
                                                        if (chat3 == null) {
                                                        }
                                                        user5 = user4;
                                                        boolean z282222 = z16;
                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                        }
                                                        f8.b("showExtraNotifications: holders.add " + j26);
                                                        int intValue2222 = num2.intValue();
                                                        boolean z292222 = mtVar4.c;
                                                        z16 = z282222;
                                                        long j382222 = j26;
                                                        hVar6 = hVar1022;
                                                        notification = notification2;
                                                        sharedPreferences = sharedPreferences3;
                                                        lt ltVar2222 = new lt(otVar, intValue2222, j382222, z292222, str14, user5, chat3, rVar222, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                        arrayList4 = arrayList;
                                                        arrayList4.add(ltVar2222);
                                                        otVar.h.k(num2, j382222);
                                                        i29 = i16 + 1;
                                                        arrayList = arrayList4;
                                                        arrayList13 = arrayList16;
                                                        hVar7 = hVar4;
                                                        z14 = z15;
                                                        z13 = z16;
                                                        size = i15;
                                                        c12 = sharedPreferences;
                                                        hVar8 = hVar5;
                                                        e = j15;
                                                        b11 = notification;
                                                        hVar = hVar6;
                                                    }
                                                    i24 = i22;
                                                    mtVar4 = mtVar3;
                                                    j26 = j25;
                                                    j27 = j21;
                                                    i0.a.q(j27, a1.g.s(j26, "show extra notifications chatId ", " topicId "));
                                                    if (j27 != 0) {
                                                    }
                                                    intent222.putExtra(str2222, otVar.currentAccount);
                                                    PendingIntent activity222 = PendingIntent.getActivity(w0.b, 0, intent222, 1140850688);
                                                    e0.e0 e0Var222 = new e0.e0();
                                                    e0.i iVar3222 = iVar;
                                                    if (iVar != null) {
                                                    }
                                                    a0.h hVar10222 = hVar;
                                                    int i40222 = i24;
                                                    Intent intent3222 = new Intent(w0.b, (Class<?>) AutoMessageHeardReceiver.class);
                                                    intent3222.addFlags(i17);
                                                    intent3222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                                    intent3222.putExtra(str13, j26);
                                                    int i41222 = i20;
                                                    intent3222.putExtra(str12, i41222);
                                                    intent3222.putExtra(str2222, otVar.currentAccount);
                                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList20222 = arrayList6;
                                                    bitmap5 = bitmap4;
                                                    e0.h hVar11222 = new e0.h(R.drawable.msg_markread, cd.K0(2131748696), PendingIntent.getBroadcast(w0.b, num2.intValue(), intent3222, 167772160));
                                                    hVar11222.a = 2;
                                                    hVar11222.c = false;
                                                    e0.i b12222 = hVar11222.b();
                                                    if (o5.C(j26)) {
                                                    }
                                                    if (str17 != null) {
                                                    }
                                                    StringBuilder sb6222 = new StringBuilder("tgaccount");
                                                    long j37222 = j20;
                                                    sb6222.append(j37222);
                                                    e0Var222.b(sb6222.toString());
                                                    if (mtVar4.c) {
                                                    }
                                                    e0.r rVar2222 = new e0.r(w0.b);
                                                    rVar2222.g(str14);
                                                    rVar2222.F.icon = R.drawable.notification;
                                                    rVar2222.f(sb522.toString());
                                                    rVar2222.h(16, true);
                                                    rVar2222.i = mtVar4.c ? otVar.D.size() : arrayList10.size();
                                                    rVar2222.w = -15618822;
                                                    rVar2222.r = false;
                                                    rVar2222.F.when = j28;
                                                    rVar2222.k = true;
                                                    rVar2222.n(yVar2);
                                                    rVar2222.g = activity222;
                                                    rVar2222.c(e0Var222);
                                                    rVar2222.l(String.valueOf(Long.MAX_VALUE - j28));
                                                    rVar2222.u = "msg";
                                                    Intent intent4222 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                                                    intent4222.putExtra("messageDate", i18);
                                                    intent4222.putExtra("dialogId", j26);
                                                    intent4222.putExtra(str2222, otVar.currentAccount);
                                                    if (mtVar4.c) {
                                                    }
                                                    if (jjVar2 != null) {
                                                    }
                                                    rVar2222.F.deleteIntent = PendingIntent.getBroadcast(w0.b, num2.intValue(), intent4222, 167772160);
                                                    if (z16) {
                                                    }
                                                    if (jjVar3 != null) {
                                                        replyMarkup = message.reply_markup;
                                                        if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                        }
                                                    }
                                                    tL_inlineButtonTypeCopy = null;
                                                    keyboardInlineButton = null;
                                                    if (keyboardInlineButton != null) {
                                                    }
                                                    j29 = mtVar4.a;
                                                    if (j29 != 489000) {
                                                    }
                                                    if (arrayList16.size() != 1) {
                                                    }
                                                    if (o5.C(j26)) {
                                                    }
                                                    if (bitmap5 != null) {
                                                    }
                                                    if (!i0.p2(false)) {
                                                    }
                                                    if (chat3 == null) {
                                                    }
                                                    user5 = user4;
                                                    boolean z2822222 = z16;
                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                    }
                                                    f8.b("showExtraNotifications: holders.add " + j26);
                                                    int intValue22222 = num2.intValue();
                                                    boolean z2922222 = mtVar4.c;
                                                    z16 = z2822222;
                                                    long j3822222 = j26;
                                                    hVar6 = hVar10222;
                                                    notification = notification2;
                                                    sharedPreferences = sharedPreferences3;
                                                    lt ltVar22222 = new lt(otVar, intValue22222, j3822222, z2922222, str14, user5, chat3, rVar2222, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                                    arrayList4 = arrayList;
                                                    arrayList4.add(ltVar22222);
                                                    otVar.h.k(num2, j3822222);
                                                    i29 = i16 + 1;
                                                    arrayList = arrayList4;
                                                    arrayList13 = arrayList16;
                                                    hVar7 = hVar4;
                                                    z14 = z15;
                                                    z13 = z16;
                                                    size = i15;
                                                    c12 = sharedPreferences;
                                                    hVar8 = hVar5;
                                                    e = j15;
                                                    b11 = notification;
                                                    hVar = hVar6;
                                                }
                                            }
                                        }
                                        i20 = f12;
                                        j18 = j14;
                                    }
                                    l0Var = l0Var4;
                                    yVar = (l0Var == null && (jjVar != null || !(jjVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new e0.y(l0Var) : new e0.y();
                                    i21 = Build.VERSION.SDK_INT;
                                    if (i21 >= 28) {
                                    }
                                    yVar.f(format);
                                    yVar.i = Boolean.valueOf(i21 >= 28 || (!z21 && o5.z(j18)) || h20.y(j18));
                                    StringBuilder sb4222 = new StringBuilder();
                                    String[] strArr2222 = new String[1];
                                    boolean[] zArr2222 = new boolean[1];
                                    if (mtVar2.c) {
                                    }
                                    mtVar3 = mtVar2;
                                    String str22222 = str21;
                                    j25 = j19;
                                    StringBuilder sb5222 = sb4222;
                                    Intent intent2222 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                                    intent2222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                                    intent2222.setFlags(67108864);
                                    intent2222.addCategory("android.intent.category.LAUNCHER");
                                    if (jjVar == null) {
                                    }
                                    if (jjVar == null) {
                                    }
                                    if (jjVar == null) {
                                    }
                                    i24 = i22;
                                    j26 = j25;
                                    mtVar4 = mtVar3;
                                    if (!mtVar4.c) {
                                    }
                                    j27 = j21;
                                    i0.a.q(j27, a1.g.s(j26, "show extra notifications chatId ", " topicId "));
                                    if (j27 != 0) {
                                    }
                                    intent2222.putExtra(str22222, otVar.currentAccount);
                                    PendingIntent activity2222 = PendingIntent.getActivity(w0.b, 0, intent2222, 1140850688);
                                    e0.e0 e0Var2222 = new e0.e0();
                                    e0.i iVar32222 = iVar;
                                    if (iVar != null) {
                                    }
                                    a0.h hVar102222 = hVar;
                                    int i402222 = i24;
                                    Intent intent32222 = new Intent(w0.b, (Class<?>) AutoMessageHeardReceiver.class);
                                    intent32222.addFlags(i17);
                                    intent32222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                                    intent32222.putExtra(str13, j26);
                                    int i412222 = i20;
                                    intent32222.putExtra(str12, i412222);
                                    intent32222.putExtra(str22222, otVar.currentAccount);
                                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList202222 = arrayList6;
                                    bitmap5 = bitmap4;
                                    e0.h hVar112222 = new e0.h(R.drawable.msg_markread, cd.K0(2131748696), PendingIntent.getBroadcast(w0.b, num2.intValue(), intent32222, 167772160));
                                    hVar112222.a = 2;
                                    hVar112222.c = false;
                                    e0.i b122222 = hVar112222.b();
                                    if (o5.C(j26)) {
                                    }
                                    if (str17 != null) {
                                    }
                                    StringBuilder sb62222 = new StringBuilder("tgaccount");
                                    long j372222 = j20;
                                    sb62222.append(j372222);
                                    e0Var2222.b(sb62222.toString());
                                    if (mtVar4.c) {
                                    }
                                    e0.r rVar22222 = new e0.r(w0.b);
                                    rVar22222.g(str14);
                                    rVar22222.F.icon = R.drawable.notification;
                                    rVar22222.f(sb5222.toString());
                                    rVar22222.h(16, true);
                                    rVar22222.i = mtVar4.c ? otVar.D.size() : arrayList10.size();
                                    rVar22222.w = -15618822;
                                    rVar22222.r = false;
                                    rVar22222.F.when = j28;
                                    rVar22222.k = true;
                                    rVar22222.n(yVar2);
                                    rVar22222.g = activity2222;
                                    rVar22222.c(e0Var2222);
                                    rVar22222.l(String.valueOf(Long.MAX_VALUE - j28));
                                    rVar22222.u = "msg";
                                    Intent intent42222 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                                    intent42222.putExtra("messageDate", i18);
                                    intent42222.putExtra("dialogId", j26);
                                    intent42222.putExtra(str22222, otVar.currentAccount);
                                    if (mtVar4.c) {
                                    }
                                    if (jjVar2 != null) {
                                    }
                                    rVar22222.F.deleteIntent = PendingIntent.getBroadcast(w0.b, num2.intValue(), intent42222, 167772160);
                                    if (z16) {
                                    }
                                    if (jjVar3 != null) {
                                    }
                                    tL_inlineButtonTypeCopy = null;
                                    keyboardInlineButton = null;
                                    if (keyboardInlineButton != null) {
                                    }
                                    j29 = mtVar4.a;
                                    if (j29 != 489000) {
                                    }
                                    if (arrayList16.size() != 1) {
                                    }
                                    if (o5.C(j26)) {
                                    }
                                    if (bitmap5 != null) {
                                    }
                                    if (!i0.p2(false)) {
                                    }
                                    if (chat3 == null) {
                                    }
                                    user5 = user4;
                                    boolean z28222222 = z16;
                                    if (Build.VERSION.SDK_INT >= 26) {
                                    }
                                    f8.b("showExtraNotifications: holders.add " + j26);
                                    int intValue222222 = num2.intValue();
                                    boolean z29222222 = mtVar4.c;
                                    z16 = z28222222;
                                    long j38222222 = j26;
                                    hVar6 = hVar102222;
                                    notification = notification2;
                                    sharedPreferences = sharedPreferences3;
                                    lt ltVar222222 = new lt(otVar, intValue222222, j38222222, z29222222, str14, user5, chat3, rVar22222, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                                    arrayList4 = arrayList;
                                    arrayList4.add(ltVar222222);
                                    otVar.h.k(num2, j38222222);
                                    i29 = i16 + 1;
                                    arrayList = arrayList4;
                                    arrayList13 = arrayList16;
                                    hVar7 = hVar4;
                                    z14 = z15;
                                    z13 = z16;
                                    size = i15;
                                    c12 = sharedPreferences;
                                    hVar8 = hVar5;
                                    e = j15;
                                    b11 = notification;
                                    hVar = hVar6;
                                }
                                file = L;
                            } else {
                                user4 = user2;
                                file = null;
                            }
                            bitmap = null;
                            if (chat != null) {
                            }
                            String str212 = "currentAccount";
                            if (z21) {
                            }
                            str11 = str10;
                            Intent intent7 = new Intent(w0.b, (Class<?>) WearReplyReceiver.class);
                            intent7.putExtra("dialog_id", j14);
                            intent7.putExtra("max_id", f12);
                            bitmap3 = bitmap2;
                            j17 = j16;
                            intent7.putExtra("topic_id", j17);
                            intent7.putExtra("currentAccount", otVar.currentAccount);
                            if (arrayList3.isEmpty()) {
                            }
                            PendingIntent broadcast2 = PendingIntent.getBroadcast(w0.b, num2.intValue(), intent7, 167772160);
                            e0.n0 n0Var2 = new e0.n0(cd.K0(2131746278), new Bundle(), new HashSet());
                            if (o5.z(j14)) {
                            }
                            e0.h hVar92 = new e0.h(R.drawable.ic_reply_icon, Z, broadcast2);
                            hVar92.f();
                            hVar92.a = 1;
                            hVar92.a(n0Var2);
                            hVar92.c = z22;
                            b10 = hVar92.b();
                            num3 = (Integer) otVar.f.f(j14);
                            if (num3 == null) {
                            }
                            mtVar2 = mtVar;
                            if (mtVar2.c) {
                            }
                            if (size5 > 1) {
                            }
                            long j352 = j12;
                            long j362 = j17;
                            e0.l0 l0Var42 = (e0.l0) hVar.f(j352);
                            i19 = Build.VERSION.SDK_INT;
                            if (i19 >= 28) {
                            }
                            i20 = f12;
                            j18 = j14;
                            str13 = "dialog_id";
                            l0Var = l0Var42;
                            yVar = (l0Var == null && (jjVar != null || !(jjVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new e0.y(l0Var) : new e0.y();
                            i21 = Build.VERSION.SDK_INT;
                            if (i21 >= 28) {
                            }
                            yVar.f(format);
                            yVar.i = Boolean.valueOf(i21 >= 28 || (!z21 && o5.z(j18)) || h20.y(j18));
                            StringBuilder sb42222 = new StringBuilder();
                            String[] strArr22222 = new String[1];
                            boolean[] zArr22222 = new boolean[1];
                            if (mtVar2.c) {
                            }
                            mtVar3 = mtVar2;
                            String str222222 = str212;
                            j25 = j19;
                            StringBuilder sb52222 = sb42222;
                            Intent intent22222 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                            intent22222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                            intent22222.setFlags(67108864);
                            intent22222.addCategory("android.intent.category.LAUNCHER");
                            if (jjVar == null) {
                            }
                            if (jjVar == null) {
                            }
                            if (jjVar == null) {
                            }
                            i24 = i22;
                            j26 = j25;
                            mtVar4 = mtVar3;
                            if (!mtVar4.c) {
                            }
                            j27 = j21;
                            i0.a.q(j27, a1.g.s(j26, "show extra notifications chatId ", " topicId "));
                            if (j27 != 0) {
                            }
                            intent22222.putExtra(str222222, otVar.currentAccount);
                            PendingIntent activity22222 = PendingIntent.getActivity(w0.b, 0, intent22222, 1140850688);
                            e0.e0 e0Var22222 = new e0.e0();
                            e0.i iVar322222 = iVar;
                            if (iVar != null) {
                            }
                            a0.h hVar1022222 = hVar;
                            int i4022222 = i24;
                            Intent intent322222 = new Intent(w0.b, (Class<?>) AutoMessageHeardReceiver.class);
                            intent322222.addFlags(i17);
                            intent322222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                            intent322222.putExtra(str13, j26);
                            int i4122222 = i20;
                            intent322222.putExtra(str12, i4122222);
                            intent322222.putExtra(str222222, otVar.currentAccount);
                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList2022222 = arrayList6;
                            bitmap5 = bitmap4;
                            e0.h hVar1122222 = new e0.h(R.drawable.msg_markread, cd.K0(2131748696), PendingIntent.getBroadcast(w0.b, num2.intValue(), intent322222, 167772160));
                            hVar1122222.a = 2;
                            hVar1122222.c = false;
                            e0.i b1222222 = hVar1122222.b();
                            if (o5.C(j26)) {
                            }
                            if (str17 != null) {
                            }
                            StringBuilder sb622222 = new StringBuilder("tgaccount");
                            long j3722222 = j20;
                            sb622222.append(j3722222);
                            e0Var22222.b(sb622222.toString());
                            if (mtVar4.c) {
                            }
                            e0.r rVar222222 = new e0.r(w0.b);
                            rVar222222.g(str14);
                            rVar222222.F.icon = R.drawable.notification;
                            rVar222222.f(sb52222.toString());
                            rVar222222.h(16, true);
                            rVar222222.i = mtVar4.c ? otVar.D.size() : arrayList10.size();
                            rVar222222.w = -15618822;
                            rVar222222.r = false;
                            rVar222222.F.when = j28;
                            rVar222222.k = true;
                            rVar222222.n(yVar2);
                            rVar222222.g = activity22222;
                            rVar222222.c(e0Var22222);
                            rVar222222.l(String.valueOf(Long.MAX_VALUE - j28));
                            rVar222222.u = "msg";
                            Intent intent422222 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                            intent422222.putExtra("messageDate", i18);
                            intent422222.putExtra("dialogId", j26);
                            intent422222.putExtra(str222222, otVar.currentAccount);
                            if (mtVar4.c) {
                            }
                            if (jjVar2 != null) {
                            }
                            rVar222222.F.deleteIntent = PendingIntent.getBroadcast(w0.b, num2.intValue(), intent422222, 167772160);
                            if (z16) {
                            }
                            if (jjVar3 != null) {
                            }
                            tL_inlineButtonTypeCopy = null;
                            keyboardInlineButton = null;
                            if (keyboardInlineButton != null) {
                            }
                            j29 = mtVar4.a;
                            if (j29 != 489000) {
                            }
                            if (arrayList16.size() != 1) {
                            }
                            if (o5.C(j26)) {
                            }
                            if (bitmap5 != null) {
                            }
                            if (!i0.p2(false)) {
                            }
                            if (chat3 == null) {
                            }
                            user5 = user4;
                            boolean z282222222 = z16;
                            if (Build.VERSION.SDK_INT >= 26) {
                            }
                            f8.b("showExtraNotifications: holders.add " + j26);
                            int intValue2222222 = num2.intValue();
                            boolean z292222222 = mtVar4.c;
                            z16 = z282222222;
                            long j382222222 = j26;
                            hVar6 = hVar1022222;
                            notification = notification2;
                            sharedPreferences = sharedPreferences3;
                            lt ltVar2222222 = new lt(otVar, intValue2222222, j382222222, z292222222, str14, user5, chat3, rVar222222, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                            arrayList4 = arrayList;
                            arrayList4.add(ltVar2222222);
                            otVar.h.k(num2, j382222222);
                            i29 = i16 + 1;
                            arrayList = arrayList4;
                            arrayList13 = arrayList16;
                            hVar7 = hVar4;
                            z14 = z15;
                            z13 = z16;
                            size = i15;
                            c12 = sharedPreferences;
                            hVar8 = hVar5;
                            e = j15;
                            b11 = notification;
                            hVar = hVar6;
                        }
                    }
                    str10 = str9;
                    if (z15) {
                    }
                    SharedPreferences sharedPreferences32 = sharedPreferences2;
                    if (fileLocation == null) {
                    }
                    bitmap = null;
                    if (chat != null) {
                    }
                    String str2122 = "currentAccount";
                    if (z21) {
                    }
                    str11 = str10;
                    Intent intent72 = new Intent(w0.b, (Class<?>) WearReplyReceiver.class);
                    intent72.putExtra("dialog_id", j14);
                    intent72.putExtra("max_id", f12);
                    bitmap3 = bitmap2;
                    j17 = j16;
                    intent72.putExtra("topic_id", j17);
                    intent72.putExtra("currentAccount", otVar.currentAccount);
                    if (arrayList3.isEmpty()) {
                    }
                    PendingIntent broadcast22 = PendingIntent.getBroadcast(w0.b, num2.intValue(), intent72, 167772160);
                    e0.n0 n0Var22 = new e0.n0(cd.K0(2131746278), new Bundle(), new HashSet());
                    if (o5.z(j14)) {
                    }
                    e0.h hVar922 = new e0.h(R.drawable.ic_reply_icon, Z, broadcast22);
                    hVar922.f();
                    hVar922.a = 1;
                    hVar922.a(n0Var22);
                    hVar922.c = z22;
                    b10 = hVar922.b();
                    num3 = (Integer) otVar.f.f(j14);
                    if (num3 == null) {
                    }
                    mtVar2 = mtVar;
                    if (mtVar2.c) {
                    }
                    if (size5 > 1) {
                    }
                    long j3522 = j12;
                    long j3622 = j17;
                    e0.l0 l0Var422 = (e0.l0) hVar.f(j3522);
                    i19 = Build.VERSION.SDK_INT;
                    if (i19 >= 28) {
                    }
                    i20 = f12;
                    j18 = j14;
                    str13 = "dialog_id";
                    l0Var = l0Var422;
                    yVar = (l0Var == null && (jjVar != null || !(jjVar.k.action instanceof TLRPC.TL_messageActionChatJoinedByRequest))) ? new e0.y(l0Var) : new e0.y();
                    i21 = Build.VERSION.SDK_INT;
                    if (i21 >= 28) {
                    }
                    yVar.f(format);
                    yVar.i = Boolean.valueOf(i21 >= 28 || (!z21 && o5.z(j18)) || h20.y(j18));
                    StringBuilder sb422222 = new StringBuilder();
                    String[] strArr222222 = new String[1];
                    boolean[] zArr222222 = new boolean[1];
                    if (mtVar2.c) {
                    }
                    mtVar3 = mtVar2;
                    String str2222222 = str2122;
                    j25 = j19;
                    StringBuilder sb522222 = sb422222;
                    Intent intent222222 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                    intent222222.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    intent222222.setFlags(67108864);
                    intent222222.addCategory("android.intent.category.LAUNCHER");
                    if (jjVar == null) {
                    }
                    if (jjVar == null) {
                    }
                    if (jjVar == null) {
                    }
                    i24 = i22;
                    j26 = j25;
                    mtVar4 = mtVar3;
                    if (!mtVar4.c) {
                    }
                    j27 = j21;
                    i0.a.q(j27, a1.g.s(j26, "show extra notifications chatId ", " topicId "));
                    if (j27 != 0) {
                    }
                    intent222222.putExtra(str2222222, otVar.currentAccount);
                    PendingIntent activity222222 = PendingIntent.getActivity(w0.b, 0, intent222222, 1140850688);
                    e0.e0 e0Var222222 = new e0.e0();
                    e0.i iVar3222222 = iVar;
                    if (iVar != null) {
                    }
                    a0.h hVar10222222 = hVar;
                    int i40222222 = i24;
                    Intent intent3222222 = new Intent(w0.b, (Class<?>) AutoMessageHeardReceiver.class);
                    intent3222222.addFlags(i17);
                    intent3222222.setAction("org.telegram.messenger.ACTION_MESSAGE_HEARD");
                    intent3222222.putExtra(str13, j26);
                    int i41222222 = i20;
                    intent3222222.putExtra(str12, i41222222);
                    intent3222222.putExtra(str2222222, otVar.currentAccount);
                    ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList20222222 = arrayList6;
                    bitmap5 = bitmap4;
                    e0.h hVar11222222 = new e0.h(R.drawable.msg_markread, cd.K0(2131748696), PendingIntent.getBroadcast(w0.b, num2.intValue(), intent3222222, 167772160));
                    hVar11222222.a = 2;
                    hVar11222222.c = false;
                    e0.i b12222222 = hVar11222222.b();
                    if (o5.C(j26)) {
                    }
                    if (str17 != null) {
                    }
                    StringBuilder sb6222222 = new StringBuilder("tgaccount");
                    long j37222222 = j20;
                    sb6222222.append(j37222222);
                    e0Var222222.b(sb6222222.toString());
                    if (mtVar4.c) {
                    }
                    e0.r rVar2222222 = new e0.r(w0.b);
                    rVar2222222.g(str14);
                    rVar2222222.F.icon = R.drawable.notification;
                    rVar2222222.f(sb522222.toString());
                    rVar2222222.h(16, true);
                    rVar2222222.i = mtVar4.c ? otVar.D.size() : arrayList10.size();
                    rVar2222222.w = -15618822;
                    rVar2222222.r = false;
                    rVar2222222.F.when = j28;
                    rVar2222222.k = true;
                    rVar2222222.n(yVar2);
                    rVar2222222.g = activity222222;
                    rVar2222222.c(e0Var222222);
                    rVar2222222.l(String.valueOf(Long.MAX_VALUE - j28));
                    rVar2222222.u = "msg";
                    Intent intent4222222 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                    intent4222222.putExtra("messageDate", i18);
                    intent4222222.putExtra("dialogId", j26);
                    intent4222222.putExtra(str2222222, otVar.currentAccount);
                    if (mtVar4.c) {
                    }
                    if (jjVar2 != null) {
                    }
                    rVar2222222.F.deleteIntent = PendingIntent.getBroadcast(w0.b, num2.intValue(), intent4222222, 167772160);
                    if (z16) {
                    }
                    if (jjVar3 != null) {
                    }
                    tL_inlineButtonTypeCopy = null;
                    keyboardInlineButton = null;
                    if (keyboardInlineButton != null) {
                    }
                    j29 = mtVar4.a;
                    if (j29 != 489000) {
                    }
                    if (arrayList16.size() != 1) {
                    }
                    if (o5.C(j26)) {
                    }
                    if (bitmap5 != null) {
                    }
                    if (!i0.p2(false)) {
                    }
                    if (chat3 == null) {
                    }
                    user5 = user4;
                    boolean z2822222222 = z16;
                    if (Build.VERSION.SDK_INT >= 26) {
                    }
                    f8.b("showExtraNotifications: holders.add " + j26);
                    int intValue22222222 = num2.intValue();
                    boolean z2922222222 = mtVar4.c;
                    z16 = z2822222222;
                    long j3822222222 = j26;
                    hVar6 = hVar10222222;
                    notification = notification2;
                    sharedPreferences = sharedPreferences32;
                    lt ltVar22222222 = new lt(otVar, intValue22222222, j3822222222, z2922222222, str14, user5, chat3, rVar2222222, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                    arrayList4 = arrayList;
                    arrayList4.add(ltVar22222222);
                    otVar.h.k(num2, j3822222222);
                    i29 = i16 + 1;
                    arrayList = arrayList4;
                    arrayList13 = arrayList16;
                    hVar7 = hVar4;
                    z14 = z15;
                    z13 = z16;
                    size = i15;
                    c12 = sharedPreferences;
                    hVar8 = hVar5;
                    e = j15;
                    b11 = notification;
                    hVar = hVar6;
                }
                Notification notification3 = b11;
                hVar2 = hVar8;
                a0.h hVar13 = hVar;
                ArrayList arrayList31 = arrayList;
                if (z13) {
                    arrayList2 = arrayList31;
                    if (otVar.y.isEmpty()) {
                        if (v2.a) {
                            i0.a.p(otVar.d0, new StringBuilder("cancel summary with id "));
                        }
                        str3 = null;
                        l0.b(otVar.d0, null);
                        i13 = 0;
                        while (i13 < hVar2.m()) {
                            a0.h hVar14 = hVar2;
                            if (!otVar.y.contains(Long.valueOf(hVar14.j(i13)))) {
                                Integer num5 = (Integer) hVar14.n(i13);
                                if (v2.a) {
                                    f8.b("cancel notification id " + num5);
                                }
                                l0.b(num5.intValue(), str3);
                            }
                            i13++;
                            hVar2 = hVar14;
                        }
                        ArrayList arrayList32 = new ArrayList(arrayList2.size());
                        f8.b("showExtraNotifications: holders.size()=" + arrayList2.size());
                        size2 = arrayList2.size();
                        i14 = 0;
                        while (i14 < size2) {
                            ArrayList arrayList33 = arrayList2;
                            lt ltVar3 = (lt) arrayList33.get(i14);
                            arrayList32.clear();
                            int i56 = Build.VERSION.SDK_INT;
                            if (i56 < 29 || o5.C(ltVar3.b)) {
                                hVar3 = hVar13;
                            } else {
                                e0.r rVar3 = ltVar3.g;
                                long j43 = ltVar3.b;
                                hVar3 = hVar13;
                                String j44 = otVar.j(rVar3, j43, ltVar3.d, ltVar3.e, ltVar3.f, (e0.l0) hVar3.f(j43), !ltVar3.c);
                                if (j44 != null) {
                                    arrayList32.add(j44);
                                }
                            }
                            f8.b("showExtraNotifications: holders[" + i14 + "].call()");
                            ltVar3.a();
                            if (i56 >= 29 && tz.q0 && !arrayList32.isEmpty()) {
                                g0.f.o(w0.b, arrayList32);
                            }
                            i14++;
                            otVar = this;
                            arrayList2 = arrayList33;
                            hVar13 = hVar3;
                        }
                    }
                } else {
                    if (v2.a) {
                        i0.a.p(otVar.d0, new StringBuilder("show summary with id "));
                    }
                    try {
                        l0.d(otVar.d0, notification3);
                        arrayList2 = arrayList31;
                    } catch (SecurityException e13) {
                        f8.f(e13);
                        arrayList2 = arrayList31;
                        otVar.P(rVar, j10, j11, str2, jArr, i10, uri, i11, z10, z11, z12, i12);
                    }
                }
                str3 = null;
                i13 = 0;
                while (i13 < hVar2.m()) {
                }
                ArrayList arrayList322 = new ArrayList(arrayList2.size());
                f8.b("showExtraNotifications: holders.size()=" + arrayList2.size());
                size2 = arrayList2.size();
                i14 = 0;
                while (i14 < size2) {
                }
            }
        }
        z13 = true;
        if (z13) {
            i();
        }
        e = otVar.getUserConfig().e();
        if (i0.o2()) {
        }
        if (tz.s.length() <= 0) {
        }
        f8.b("showExtraNotifications: passcode=" + (tz.s.length() <= 0) + " waitingForPasscode=" + z14 + " selfUserId=" + e + " useSummaryNotification=" + z13);
        hVar = new a0.h();
        size = arrayList13.size();
        arrayList = arrayList15;
        while (true) {
            if (i29 >= size) {
            }
            i29 = i16 + 1;
            arrayList = arrayList4;
            arrayList13 = arrayList16;
            hVar7 = hVar4;
            z14 = z15;
            z13 = z16;
            size = i15;
            c12 = sharedPreferences;
            hVar8 = hVar5;
            e = j15;
            b11 = notification;
            hVar = hVar6;
        }
        Notification notification32 = b11;
        hVar2 = hVar8;
        a0.h hVar132 = hVar;
        ArrayList arrayList312 = arrayList;
        if (z13) {
        }
        str3 = null;
        i13 = 0;
        while (i13 < hVar2.m()) {
        }
        ArrayList arrayList3222 = new ArrayList(arrayList2.size());
        f8.b("showExtraNotifications: holders.size()=" + arrayList2.size());
        size2 = arrayList2.size();
        i14 = 0;
        while (i14 < size2) {
        }
    }

    public final void Y() {
        k0.c(new at(this, 4));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(70:122|123|(4:125|(2:127|(1:129)(1:596))(1:597)|130|(1:132)(3:591|592|(1:594)(1:595)))(1:598)|133|134|(5:567|568|(2:573|(2:575|576)(4:(1:(2:585|(1:587)(1:588))(1:580))(1:589)|581|(1:583)|584))|590|(0)(0))(4:137|(5:139|(2:141|(7:148|(4:150|(2:155|156)|157|156)|158|(1:169)(1:(1:162)(2:165|(1:167)(1:168)))|163|164|147))(1:170)|145|146|147)|171|172)|(62:180|(1:565)(5:185|(1:187)(1:564)|(2:189|(1:191)(2:192|(2:194|195)(2:559|(1:561)(1:562))))|563|195)|(2:197|(53:199|200|(5:202|(1:204)(1:555)|205|(1:207)(1:554)|208)(1:556)|209|210|(6:544|545|(1:547)(1:553)|548|(1:550)(1:552)|551)(1:(2:(3:216|(1:218)(1:520)|219)(3:521|(1:523)(1:525)|524)|220)(2:526|(6:(1:529)(1:542)|530|(1:532)(2:(1:539)(1:541)|540)|533|(1:535)(1:537)|536)(44:543|(1:223)(1:519)|224|(1:518)(1:228)|229|(1:517)(1:232)|(1:236)|(1:516)(1:241)|(6:243|(1:245)|246|(1:248)(1:514)|249|(1:251)(1:513))(1:515)|(3:255|256|(1:260))|(1:265)|266|(1:268)|269|270|(1:272)(3:451|452|(2:(2:455|456)(2:458|(1:460))|457)(2:461|(4:463|(2:466|464)|467|468)(28:469|(5:471|(1:(1:474)(2:475|(1:477)))|478|(21:(3:487|(1:495)|496)(3:497|(2:499|(1:507))|496)|276|(2:283|(1:287))|288|289|290|(1:292)|293|(3:295|296|297)(1:447)|298|(1:300)(1:(2:431|(1:433)(3:434|435|(4:437|(1:439)(1:444)|440|(1:442)))))|301|(4:426|427|(2:429|422)|407)(1:(4:306|307|(1:309)|407)(5:408|(2:410|(1:412)(3:413|(2:415|(1:417))(2:418|(1:420))|407))|423|(1:425)|407))|310|(1:406)(6:(3:401|(1:403)(1:405)|404)|(3:320|321|(6:323|(4:(1:329)(1:385)|(1:331)(1:384)|332|(1:334)(2:372|(1:374)(2:(2:379|(1:381)(1:382))|383)))|386|(0)(0)|332|(0)(0))(2:387|(1:389)(2:(2:391|(2:395|396))|399)))|400|(0)(0)|332|(0)(0))|335|(2:341|(7:343|(4:345|(3:347|(4:349|(1:351)|352|353)(2:355|356)|354)|357|358)|359|360|(1:368)|369|370))|371|(4:362|364|366|368)|369|370)|274)(2:508|(1:512))|275|276|(4:279|281|283|(2:285|287))|288|289|290|(0)|293|(0)(0)|298|(0)(0)|301|(1:303)|426|427|(0)|407|310|(0)|406|335|(4:337|339|341|(0))|371|(0)|369|370)))|273|274|275|276|(0)|288|289|290|(0)|293|(0)(0)|298|(0)(0)|301|(0)|426|427|(0)|407|310|(0)|406|335|(0)|371|(0)|369|370)))|221|(0)(0)|224|(1:226)|518|229|(0)|517|(2:234|236)|(1:238)|516|(0)(0)|(4:253|255|256|(2:258|260))|(0)|266|(0)|269|270|(0)(0)|273|274|275|276|(0)|288|289|290|(0)|293|(0)(0)|298|(0)(0)|301|(0)|426|427|(0)|407|310|(0)|406|335|(0)|371|(0)|369|370))(1:558)|557|200|(0)(0)|209|210|(1:212)|544|545|(0)(0)|548|(0)(0)|551|221|(0)(0)|224|(0)|518|229|(0)|517|(0)|(0)|516|(0)(0)|(0)|(0)|266|(0)|269|270|(0)(0)|273|274|275|276|(0)|288|289|290|(0)|293|(0)(0)|298|(0)(0)|301|(0)|426|427|(0)|407|310|(0)|406|335|(0)|371|(0)|369|370)|566|(1:182)|565|(0)(0)|557|200|(0)(0)|209|210|(0)|544|545|(0)(0)|548|(0)(0)|551|221|(0)(0)|224|(0)|518|229|(0)|517|(0)|(0)|516|(0)(0)|(0)|(0)|266|(0)|269|270|(0)(0)|273|274|275|276|(0)|288|289|290|(0)|293|(0)(0)|298|(0)(0)|301|(0)|426|427|(0)|407|310|(0)|406|335|(0)|371|(0)|369|370) */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x0bb4, code lost:
    
        if (android.os.Build.VERSION.SDK_INT >= 26) goto L530;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0b0e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0b2a, code lost:
    
        org.telegram.messenger.f8.f(r0);
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
    /* JADX WARN: Type inference failed for: r53v0, types: [org.telegram.messenger.f1, org.telegram.messenger.ot] */
    /* JADX WARN: Type inference failed for: r5v83, types: [org.telegram.messenger.jj] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z(boolean z10) {
        long j10;
        long j11;
        jj jjVar;
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
        String K0;
        boolean z15;
        String str4;
        String K02;
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
        int i10;
        boolean z26;
        String str11;
        int i11;
        boolean z27;
        long j23;
        String str12;
        long j24;
        String string;
        boolean z28;
        boolean z29;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z30;
        boolean z31;
        boolean z32;
        int i17;
        String str13;
        boolean z33;
        int i18;
        int i19;
        String str14;
        int i20;
        int i21;
        boolean z34;
        boolean z35;
        TLRPC.User user;
        TLRPC.Chat chat3;
        TLRPC.FileLocation fileLocation;
        TLRPC.FileLocation fileLocation2;
        int i22;
        boolean z36;
        int i23;
        int i24;
        long[] jArr;
        Uri uri;
        Uri uri2;
        int i25;
        int i26;
        boolean z37;
        TLRPC.ReplyMarkup replyMarkup;
        Uri uri3;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        String str15;
        String str16;
        int ringerMode;
        String string2;
        boolean z38;
        boolean z39;
        int i32;
        boolean z40;
        int i33;
        boolean[] zArr;
        CharSequence charSequence;
        boolean z41;
        String G;
        if (!getUserConfig().p() || ((this.a.isEmpty() && this.D.isEmpty()) || !(tz.Q0 || this.currentAccount == d20.s0))) {
            p();
            return;
        }
        try {
            getConnectionsManager().resumeNetworkMaybe();
            long j25 = 0;
            nt ntVar = null;
            for (int i34 = 0; i34 < this.a.size(); i34++) {
                ?? r52 = (jj) this.a.get(i34);
                long j26 = r52.k.date;
                if (j25 < j26) {
                    ntVar = r52;
                    j25 = j26;
                }
            }
            for (int i35 = 0; i35 < this.D.size(); i35++) {
                nt ntVar2 = (nt) this.D.get(i35);
                long j27 = ntVar2.e;
                if (j25 < j27 / 1000) {
                    ntVar = ntVar2;
                    j25 = j27 / 1000;
                }
            }
            if (ntVar == null) {
                return;
            }
            if (ntVar instanceof nt) {
                nt ntVar3 = ntVar;
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.date = (int) (System.currentTimeMillis() / 1000);
                boolean z42 = false;
                int i36 = 0;
                j10 = 1000;
                for (int i37 = 0; i37 < this.D.size(); i37++) {
                    z42 |= ((nt) this.D.get(i37)).d;
                    tL_message.date = Math.min(tL_message.date, (int) (((nt) this.D.get(i37)).e / 1000));
                    i36 += ((nt) this.D.get(i37)).c.size();
                }
                j11 = 0;
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                long j28 = ntVar3.a;
                tL_peerUser.user_id = j28;
                tL_message.dialog_id = j28;
                tL_message.peer_id = tL_peerUser;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                I(arrayList, arrayList2);
                Bitmap F = tz.o() >= 1 ? F(arrayList2) : null;
                if (!z42 && this.D.size() < 2 && !arrayList.isEmpty()) {
                    G = (String) arrayList.get(0);
                    String str17 = G;
                    if (!z42) {
                        tL_message.message = cd.G(i36, "StoryNotificationHidden", new Object[0]);
                    } else if (arrayList.isEmpty()) {
                        tL_message.message = "";
                    } else if (arrayList.size() == 1) {
                        if (i36 == 1) {
                            tL_message.message = cd.M0("StoryNotificationSingle");
                        } else {
                            tL_message.message = cd.G(i36, "StoryNotification1", arrayList.get(0));
                        }
                    } else if (arrayList.size() == 2) {
                        tL_message.message = cd.Z(2131744621, arrayList.get(0), arrayList.get(1));
                    } else if (arrayList.size() == 3 && this.D.size() == 3) {
                        tL_message.message = cd.Z(2131744620, k((String) arrayList.get(0)), k((String) arrayList.get(1)), k((String) arrayList.get(2)));
                    } else {
                        tL_message.message = cd.G(this.D.size() - 2, "StoryNotification4", k((String) arrayList.get(0)), k((String) arrayList.get(1)));
                    }
                    jj jjVar2 = new jj(this.currentAccount, tL_message, tL_message.message, str17, str17, false, false, false, false);
                    jjVar2.K = true;
                    jjVar = jjVar2;
                    bitmap = F;
                }
                G = cd.G(i36, "Stories", new Object[0]);
                String str172 = G;
                if (!z42) {
                }
                jj jjVar22 = new jj(this.currentAccount, tL_message, tL_message.message, str172, str172, false, false, false, false);
                jjVar22.K = true;
                jjVar = jjVar22;
                bitmap = F;
            } else {
                j10 = 1000;
                j11 = 0;
                jjVar = (jj) this.a.get(0);
                bitmap = null;
            }
            SharedPreferences c10 = getAccountInstance().c();
            int i38 = c10.getInt("dismissDate", 0);
            if (!jjVar.K && jjVar.k.date <= i38) {
                p();
                return;
            }
            long A0 = jjVar.A0();
            long b22 = jj.b2(this.currentAccount, jjVar.k, getMessagesController().t2(jjVar));
            boolean z43 = jjVar.K;
            if (jjVar.k.mentioned) {
                str = "";
                j12 = jjVar.Z0();
            } else {
                str = "";
                j12 = A0;
            }
            jjVar.f1();
            TLRPC.Peer peer = jjVar.k.peer_id;
            long j29 = peer.chat_id;
            if (j29 == j11) {
                j29 = peer.channel_id;
            }
            long j30 = j12;
            long j31 = peer.user_id;
            if (jjVar.p3() && (j31 == j11 || j31 == getUserConfig().e())) {
                j31 = jjVar.k.from_id.user_id;
            }
            if (jjVar.A0() == 489000 && jjVar.W0() != null) {
                if (jjVar.W0().longValue() >= j11) {
                    j31 = jjVar.W0().longValue();
                    j29 = j11;
                } else {
                    j29 = jjVar.W0().longValue();
                    j31 = j11;
                }
            }
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j31));
            if (j29 != j11) {
                j13 = j29;
                chat = getMessagesController().L0(Long.valueOf(j13));
                z11 = (chat == null && jjVar.i3()) ? jjVar.f : w3.T(chat) && !chat.megagroup;
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
                boolean z44 = jjVar.I;
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
            String y3 = (((j29 == j11 || chat2 != null) && Z1 != null) || !jjVar.i3()) ? chat2 != null ? y(chat2) : h20.p(Z1) : jjVar.b;
            if (!i0.o2() && !tz.C) {
                z13 = false;
                String str18 = y3;
                boolean equalsIgnoreCase = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
                if (o5.C(j17)) {
                    if (equalsIgnoreCase) {
                        z14 = equalsIgnoreCase;
                    } else {
                        z14 = equalsIgnoreCase;
                        if (this.f.m() <= 1) {
                        }
                    }
                    if (!z13) {
                        K0 = str18;
                        z15 = true;
                        if (!jjVar.I && !jjVar.J) {
                            str4 = K0;
                            K02 = str4;
                            if (z14) {
                                z16 = z15;
                                if (d20.c() <= 1) {
                                    str5 = str;
                                } else if (this.f.m() == 1) {
                                    str5 = h20.i(getUserConfig().f());
                                } else {
                                    str5 = h20.i(getUserConfig().f()) + "・";
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
                                        sb2.append(cd.G(this.I, "NewMessages", new Object[0]));
                                        str5 = sb2.toString();
                                    } else {
                                        bitmap2 = bitmap;
                                        str5 = str5 + cd.Z(2131747961, cd.G(this.I, "NewMessages", new Object[0]), cd.G(this.f.m(), "FromChats", new Object[0]));
                                    }
                                }
                            } else {
                                z16 = z15;
                                z17 = z12;
                                bitmap2 = bitmap;
                                z18 = z43;
                                str5 = str;
                            }
                            e0.r rVar = new e0.r(w0.b);
                            TLRPC.Chat chat4 = chat2;
                            if (this.a.size() > 1 || z14) {
                                sharedPreferences = c10;
                                j19 = j31;
                                String str19 = str;
                                boolean[] zArr2 = new boolean[1];
                                x10 = x(jjVar, zArr2);
                                if (!jjVar.k.silent && !jjVar.I) {
                                    z19 = false;
                                    if (x10 != null) {
                                        return;
                                    }
                                    if (!z16) {
                                        str6 = x10;
                                    } else if (chat4 != null && !z14) {
                                        str6 = x10.replace(" @ " + K02, str19);
                                    } else if (zArr2[0]) {
                                        str6 = x10.replace(K02 + ": ", str19);
                                    } else {
                                        str6 = x10.replace(K02 + " ", str19);
                                    }
                                    rVar.f(str6);
                                    if (z14) {
                                        str5 = str6;
                                    }
                                    e0.m mVar = new e0.m(0);
                                    mVar.e(str6);
                                    rVar.n(mVar);
                                    z20 = z19;
                                    str7 = str19;
                                }
                                z19 = true;
                                if (x10 != null) {
                                }
                            } else {
                                rVar.f(str5);
                                e0.m mVar2 = new e0.m(1);
                                mVar2.f(K02);
                                j19 = j31;
                                int min = Math.min(10, this.a.size());
                                boolean[] zArr3 = new boolean[1];
                                sharedPreferences = c10;
                                int i39 = 0;
                                ?? r12 = 2;
                                String str20 = null;
                                String str21 = str;
                                while (i39 < min) {
                                    int i40 = min;
                                    jj jjVar3 = (jj) this.a.get(i39);
                                    int i41 = i39;
                                    String x11 = x(jjVar3, zArr3);
                                    if (x11 != null) {
                                        zArr = zArr3;
                                        if (jjVar3.K || jjVar3.k.date > i38) {
                                            r12 = r12;
                                            if (r12 == 2) {
                                                if (!jjVar3.k.silent && !jjVar3.I) {
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
                                                x11 = x11.replace(" @ " + K02, charSequence);
                                            } else {
                                                charSequence = str21;
                                                x11 = zArr[0] ? x11.replace(K02 + ": ", charSequence) : x11.replace(K02 + " ", charSequence);
                                            }
                                            mVar2.d(x11);
                                            i39 = i41 + 1;
                                            str21 = charSequence;
                                            min = i40;
                                            zArr3 = zArr;
                                            r12 = r12;
                                        }
                                    } else {
                                        zArr = zArr3;
                                    }
                                    charSequence = str21;
                                    i39 = i41 + 1;
                                    str21 = charSequence;
                                    min = i40;
                                    zArr3 = zArr;
                                    r12 = r12;
                                }
                                str7 = str21;
                                mVar2.g(str5);
                                rVar.n(mVar2);
                                x10 = str20;
                                z20 = r12;
                            }
                            if (z10 && z17 && !MediaController.B().J() && !z20) {
                                z21 = false;
                                if (z21 && j17 == j16 && chat4 != null) {
                                    sharedPreferences2 = sharedPreferences;
                                    boolean z45 = sharedPreferences2.getBoolean("custom_" + j17, false);
                                    int i42 = zs.K2;
                                    if (z45) {
                                        i33 = sharedPreferences2.getInt("smart_max_count_" + j17, 2);
                                        i42 = sharedPreferences2.getInt("smart_delay_" + j17, zs.K2);
                                    } else {
                                        i33 = 2;
                                    }
                                    if (i33 != 0) {
                                        Point point = (Point) this.e.f(j17);
                                        if (point == null) {
                                            this.e.k(new Point(1, (int) (SystemClock.elapsedRealtime() / j10)), j17);
                                        } else {
                                            z22 = z20;
                                            if (point.y + i42 < SystemClock.elapsedRealtime() / j10) {
                                                point.set(1, (int) (SystemClock.elapsedRealtime() / j10));
                                                str8 = str7;
                                            } else {
                                                int i43 = point.x;
                                                if (i43 < i33) {
                                                    str8 = str7;
                                                    point.set(i43 + 1, (int) (SystemClock.elapsedRealtime() / j10));
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
                                        z24 = w0.x;
                                        boolean z46 = !z24;
                                        v(j17, j20, false);
                                        if (this.g0.e(j17, j20)) {
                                            long j32 = j17;
                                            z25 = z18;
                                            long j33 = j20;
                                            int c11 = this.g0.c(0, j32, j33, "vibrate_");
                                            int c12 = this.g0.c(3, j32, j33, "priority_");
                                            j22 = j32;
                                            str9 = x10;
                                            str10 = str8;
                                            long d = this.g0.d(j22, j33);
                                            if (d != j11) {
                                                str11 = getMediaDataController().z0.e(d);
                                                z26 = true;
                                            } else {
                                                str11 = this.g0.f(j22, j33);
                                                z26 = false;
                                            }
                                            j21 = j33;
                                            int c13 = this.g0.c(0, j22, j21, "color_");
                                            num = c13 != 0 ? Integer.valueOf(c13) : null;
                                            i11 = c11;
                                            i10 = c12;
                                        } else {
                                            str9 = x10;
                                            str10 = str8;
                                            z25 = z18;
                                            j21 = j20;
                                            j22 = j17;
                                            num = null;
                                            i10 = 3;
                                            z26 = false;
                                            str11 = null;
                                            i11 = 0;
                                        }
                                        String str22 = str5;
                                        if (!jjVar.I || jjVar.J) {
                                            z27 = z23;
                                            j23 = j22;
                                            str12 = K02;
                                            j24 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                            if (j24 != 0) {
                                                string = getMediaDataController().z0.e(j24);
                                                z28 = true;
                                            } else {
                                                string = sharedPreferences2.getString("ReactionSoundPath", path);
                                                z28 = false;
                                            }
                                            int i44 = sharedPreferences2.getInt("vibrate_react", 0);
                                            int i45 = sharedPreferences2.getInt("priority_react", 1);
                                            int i46 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                            z29 = z28;
                                            i12 = jjVar.J ? 5 : 4;
                                            i13 = i46;
                                            i14 = i45;
                                            i15 = i44;
                                        } else if (j29 != j11) {
                                            if (z11) {
                                                z27 = z23;
                                                j23 = j22;
                                                long j34 = j11;
                                                str12 = K02;
                                                long j35 = sharedPreferences2.getLong("ChannelSoundDocId", j34);
                                                if (j35 != j34) {
                                                    string = getMediaDataController().z0.e(j35);
                                                    z40 = true;
                                                } else {
                                                    string = sharedPreferences2.getString("ChannelSoundPath", path);
                                                    z40 = false;
                                                }
                                                int i47 = sharedPreferences2.getInt("vibrate_channel", 0);
                                                int i48 = sharedPreferences2.getInt("priority_channel", 1);
                                                i32 = sharedPreferences2.getInt("ChannelLed", -16776961);
                                                z29 = z40;
                                                i14 = i48;
                                                i15 = i47;
                                                i12 = 2;
                                            } else {
                                                z27 = z23;
                                                j23 = j22;
                                                str12 = K02;
                                                long j36 = sharedPreferences2.getLong("GroupSoundDocId", 0L);
                                                if (j36 != 0) {
                                                    string = getMediaDataController().z0.e(j36);
                                                    z39 = true;
                                                } else {
                                                    string = sharedPreferences2.getString("GroupSoundPath", path);
                                                    z39 = false;
                                                }
                                                int i49 = sharedPreferences2.getInt("vibrate_group", 0);
                                                int i50 = sharedPreferences2.getInt("priority_group", 1);
                                                i32 = sharedPreferences2.getInt("GroupLed", -16776961);
                                                z29 = z39;
                                                i14 = i50;
                                                i15 = i49;
                                                i12 = 0;
                                            }
                                            i13 = i32;
                                        } else {
                                            z27 = z23;
                                            j23 = j22;
                                            long j37 = j11;
                                            str12 = K02;
                                            if (j19 == j37) {
                                                string = null;
                                                i16 = 4;
                                                i13 = -16776961;
                                                i15 = 0;
                                                i14 = 0;
                                                i12 = 1;
                                                z29 = false;
                                                if (i15 != i16) {
                                                    z30 = true;
                                                    i15 = 0;
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
                                                if (i10 != 3 || i14 == i10) {
                                                    i17 = i14;
                                                } else {
                                                    i17 = i10;
                                                    z31 = false;
                                                }
                                                if (num != null && num.intValue() != i13) {
                                                    i13 = num.intValue();
                                                    z31 = false;
                                                }
                                                if (i11 != 0 || i11 == 4 || i11 == i15) {
                                                    i11 = i15;
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
                                                    i19 = !sharedPreferences2.getBoolean("EnableInAppVibrate", true) ? 2 : i11;
                                                    i18 = sharedPreferences2.getBoolean("EnableInAppPopup", true) ? 2 : 0;
                                                } else {
                                                    i18 = i17;
                                                    i19 = i11;
                                                }
                                                if (z32 && i19 != 2) {
                                                    try {
                                                        ringerMode = o0.getRingerMode();
                                                        if (ringerMode != 0 && ringerMode != 1) {
                                                            i19 = 2;
                                                        }
                                                    } catch (Exception e) {
                                                        f8.f(e);
                                                    }
                                                }
                                                if (z27) {
                                                    i19 = 0;
                                                    i13 = 0;
                                                    i18 = 0;
                                                    str11 = null;
                                                }
                                                Intent intent = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append("com.tmessages.openchat");
                                                boolean z47 = z33;
                                                sb4.append(Math.random());
                                                sb4.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                                intent.setAction(sb4.toString());
                                                intent.setFlags(67108864);
                                                if (jjVar.O) {
                                                    intent.putExtra("oauth_url", jjVar.b);
                                                }
                                                if (jjVar.J) {
                                                    str14 = str13;
                                                    if (jjVar.N) {
                                                        if (j29 != j11) {
                                                            i20 = i19;
                                                            i22 = i13;
                                                            intent.putExtra("chatId", j18);
                                                        } else {
                                                            i20 = i19;
                                                            i22 = i13;
                                                            if (j19 != 0) {
                                                                intent.putExtra("userId", j19);
                                                            }
                                                        }
                                                        intent.putExtra("storyId", Math.abs(jjVar.f1()));
                                                        z34 = z26;
                                                        i21 = i22;
                                                    } else {
                                                        i20 = i19;
                                                        long j38 = j19;
                                                        long j39 = j18;
                                                        i21 = i13;
                                                        z34 = z26;
                                                        if (!jjVar.K) {
                                                            if (o5.C(j23)) {
                                                                z35 = z47;
                                                                user = Z1;
                                                                chat3 = chat4;
                                                                if (this.f.m() == 1 && j23 != n0) {
                                                                    intent.putExtra("encId", o5.h(j23));
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
                                                                if (!i0.o2() && !tz.C && this.f.m() == 1 && Build.VERSION.SDK_INT < 28) {
                                                                    if (chat4 != null) {
                                                                        chat3 = chat4;
                                                                        TLRPC.ChatPhoto chatPhoto = chat3.photo;
                                                                        if (chatPhoto != null && (fileLocation2 = chatPhoto.photo_small) != null && fileLocation2.volume_id != 0 && fileLocation2.local_id != 0) {
                                                                            fileLocation = fileLocation2;
                                                                            user = Z1;
                                                                        }
                                                                        user = Z1;
                                                                    } else {
                                                                        chat3 = chat4;
                                                                        if (Z1 != null) {
                                                                            user = Z1;
                                                                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                                                                            if (userProfilePhoto != null && (fileLocation = userProfilePhoto.photo_small) != null && fileLocation.volume_id != 0 && fileLocation.local_id != 0) {
                                                                            }
                                                                        }
                                                                        user = Z1;
                                                                    }
                                                                    String str23 = str3;
                                                                    intent.putExtra(str23, this.currentAccount);
                                                                    PendingIntent activity = PendingIntent.getActivity(w0.b, 0, intent, 1140850688);
                                                                    rVar.g(str14);
                                                                    rVar.F.icon = R.drawable.notification;
                                                                    rVar.h(16, true);
                                                                    rVar.i = this.I;
                                                                    rVar.g = activity;
                                                                    rVar.q = this.e0;
                                                                    rVar.r = true;
                                                                    rVar.k = true;
                                                                    rVar.F.when = jjVar.k.date * j10;
                                                                    rVar.w = -15618822;
                                                                    rVar.u = "msg";
                                                                    if (chat3 == null && user != null && (str15 = user.phone) != null && str15.length() > 0) {
                                                                        str16 = "tel:+" + user.phone;
                                                                        if (str16 != null && !str16.isEmpty()) {
                                                                            rVar.G.add(str16);
                                                                        }
                                                                    }
                                                                    Intent intent2 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                                                                    intent2.putExtra("messageDate", jjVar.k.date);
                                                                    intent2.putExtra(str23, this.currentAccount);
                                                                    if (jjVar.K) {
                                                                        intent2.putExtra("story", true);
                                                                    }
                                                                    if (jjVar.J) {
                                                                        i31 = 1;
                                                                    } else {
                                                                        i31 = 1;
                                                                        intent2.putExtra("storyReaction", true);
                                                                    }
                                                                    rVar.F.deleteIntent = PendingIntent.getBroadcast(w0.b, i31, intent2, 167772160);
                                                                    if (bitmap2 == null) {
                                                                        rVar.j(bitmap2);
                                                                    } else if (fileLocation != null) {
                                                                        BitmapDrawable C = hc.D().C(fileLocation);
                                                                        if (C != null) {
                                                                            rVar.j(C.getBitmap());
                                                                        } else {
                                                                            try {
                                                                                getFileLoader().getClass();
                                                                                File L = b8.L(fileLocation, true);
                                                                                if (L.exists()) {
                                                                                    float L2 = 160.0f / i0.L(50.0f);
                                                                                    BitmapFactory.Options options = new BitmapFactory.Options();
                                                                                    options.inSampleSize = L2 < 1.0f ? 1 : (int) L2;
                                                                                    Bitmap decodeFile = BitmapFactory.decodeFile(L.getAbsolutePath(), options);
                                                                                    if (decodeFile != null) {
                                                                                        rVar.j(decodeFile);
                                                                                    }
                                                                                }
                                                                            } catch (Throwable unused) {
                                                                            }
                                                                        }
                                                                    }
                                                                    z36 = z22;
                                                                    if (z10 || z36) {
                                                                        rVar.j = -1;
                                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                                            i23 = 2;
                                                                        }
                                                                        i23 = 0;
                                                                    } else if (i18 == 0) {
                                                                        rVar.j = 0;
                                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                                            i23 = 3;
                                                                        }
                                                                        i23 = 0;
                                                                    } else {
                                                                        int i51 = 1;
                                                                        if (i18 != 1) {
                                                                            if (i18 == 2) {
                                                                                i51 = 1;
                                                                            } else {
                                                                                if (i18 == 4) {
                                                                                    rVar.j = -2;
                                                                                    if (Build.VERSION.SDK_INT >= 26) {
                                                                                        i23 = 1;
                                                                                    }
                                                                                } else if (i18 == 5) {
                                                                                    rVar.j = -1;
                                                                                }
                                                                                i23 = 0;
                                                                            }
                                                                        }
                                                                        rVar.j = i51;
                                                                        if (Build.VERSION.SDK_INT >= 26) {
                                                                            i23 = 4;
                                                                        }
                                                                        i23 = 0;
                                                                    }
                                                                    if (!z36 || z27) {
                                                                        i24 = i21;
                                                                        long[] jArr2 = {0, 0};
                                                                        rVar.F.vibrate = jArr2;
                                                                        jArr = jArr2;
                                                                        uri = null;
                                                                    } else {
                                                                        if (z24 || (sharedPreferences2.getBoolean("EnableInAppPreview", true) && str9 != null)) {
                                                                            rVar.p(str9.length() > 100 ? str9.substring(0, 100).replace('\n', ' ').trim() + "..." : str9);
                                                                        }
                                                                        if (str11 != null && !str11.equalsIgnoreCase("NoSound")) {
                                                                            int i52 = Build.VERSION.SDK_INT;
                                                                            if (i52 >= 26) {
                                                                                if (!str11.equalsIgnoreCase("Default") && !str11.equals(path)) {
                                                                                    if (z34) {
                                                                                        Context context = w0.b;
                                                                                        StringBuilder sb5 = new StringBuilder();
                                                                                        w0.d();
                                                                                        sb5.append("org.telegram.messenger.beta");
                                                                                        sb5.append(".provider");
                                                                                        uri = FileProvider.d(context, sb5.toString(), new File(str11));
                                                                                        w0.b.grantUriPermission("com.android.systemui", uri, 1);
                                                                                    } else {
                                                                                        uri = Uri.parse(str11);
                                                                                    }
                                                                                    if (i21 != 0) {
                                                                                        Notification notification = rVar.F;
                                                                                        i24 = i21;
                                                                                        notification.ledARGB = i24;
                                                                                        notification.ledOnMS = 1000;
                                                                                        notification.ledOffMS = 1000;
                                                                                        notification.flags = ((-2) & notification.flags) | 1;
                                                                                    } else {
                                                                                        i24 = i21;
                                                                                    }
                                                                                    i30 = i20;
                                                                                    if (i30 == 2) {
                                                                                        jArr = new long[]{0, 0};
                                                                                        rVar.F.vibrate = jArr;
                                                                                    } else if (i30 == 1) {
                                                                                        jArr = new long[]{0, 100, 0, 100};
                                                                                        rVar.F.vibrate = jArr;
                                                                                    } else {
                                                                                        if (i30 != 0 && i30 != 4) {
                                                                                            if (i30 == 3) {
                                                                                                jArr = new long[]{0, 1000};
                                                                                                rVar.F.vibrate = jArr;
                                                                                            } else {
                                                                                                jArr = null;
                                                                                            }
                                                                                        }
                                                                                        rVar.F.defaults = 2;
                                                                                        jArr = new long[0];
                                                                                    }
                                                                                }
                                                                                uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                                                                                if (i21 != 0) {
                                                                                }
                                                                                i30 = i20;
                                                                                if (i30 == 2) {
                                                                                }
                                                                            } else if (str11.equals(path)) {
                                                                                rVar.m(Settings.System.DEFAULT_NOTIFICATION_URI);
                                                                            } else {
                                                                                if (i52 >= 24) {
                                                                                    String str24 = str2;
                                                                                    if (str11.startsWith(str24) && !i0.I1(Uri.parse(str11), 0)) {
                                                                                        try {
                                                                                            Context context2 = w0.b;
                                                                                            StringBuilder sb6 = new StringBuilder();
                                                                                            w0.d();
                                                                                            sb6.append("org.telegram.messenger.beta");
                                                                                            sb6.append(".provider");
                                                                                            Uri d10 = FileProvider.d(context2, sb6.toString(), new File(str11.replace(str24, str10)));
                                                                                            w0.b.grantUriPermission("com.android.systemui", d10, 1);
                                                                                            rVar.m(d10);
                                                                                        } catch (Exception unused2) {
                                                                                            rVar.m(Uri.parse(str11));
                                                                                        }
                                                                                    }
                                                                                }
                                                                                rVar.m(Uri.parse(str11));
                                                                            }
                                                                        }
                                                                        uri = null;
                                                                        if (i21 != 0) {
                                                                        }
                                                                        i30 = i20;
                                                                        if (i30 == 2) {
                                                                        }
                                                                    }
                                                                    if (!i0.o2() && !tz.C && jjVar.A0() == 777000) {
                                                                        replyMarkup = jjVar.k.reply_markup;
                                                                        if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                            ArrayList<TL_keyboard.KeyboardInlineButtonRow> arrayList3 = ((TLRPC.TL_replyInlineMarkup) replyMarkup).rows;
                                                                            int size = arrayList3.size();
                                                                            int i53 = 0;
                                                                            boolean z48 = false;
                                                                            while (i53 < size) {
                                                                                TL_keyboard.KeyboardInlineButtonRow keyboardInlineButtonRow = arrayList3.get(i53);
                                                                                int size2 = keyboardInlineButtonRow.buttons.size();
                                                                                boolean z49 = z48;
                                                                                int i54 = 0;
                                                                                while (i54 < size2) {
                                                                                    TL_keyboard.KeyboardInlineButton keyboardInlineButton = keyboardInlineButtonRow.buttons.get(i54);
                                                                                    TL_keyboard.TL_inlineButtonTypeCallback tL_inlineButtonTypeCallback = (TL_keyboard.TL_inlineButtonTypeCallback) sf.c.a(keyboardInlineButton, TL_keyboard.TL_inlineButtonTypeCallback.class);
                                                                                    if (tL_inlineButtonTypeCallback != null) {
                                                                                        uri3 = uri;
                                                                                        i27 = i23;
                                                                                        i28 = size;
                                                                                        Intent intent3 = new Intent(w0.b, (Class<?>) NotificationCallbackReceiver.class);
                                                                                        intent3.putExtra(str23, this.currentAccount);
                                                                                        i29 = i24;
                                                                                        long j40 = j23;
                                                                                        intent3.putExtra("did", j40);
                                                                                        byte[] bArr = tL_inlineButtonTypeCallback.data;
                                                                                        if (bArr != null) {
                                                                                            intent3.putExtra("data", bArr);
                                                                                        }
                                                                                        intent3.putExtra("mid", jjVar.f1());
                                                                                        String str25 = keyboardInlineButton.text;
                                                                                        Context context3 = w0.b;
                                                                                        int i55 = this.H;
                                                                                        j23 = j40;
                                                                                        this.H = i55 + 1;
                                                                                        rVar.a(0, str25, PendingIntent.getBroadcast(context3, i55, intent3, 167772160));
                                                                                        z49 = true;
                                                                                    } else {
                                                                                        uri3 = uri;
                                                                                        i27 = i23;
                                                                                        i28 = size;
                                                                                        i29 = i24;
                                                                                    }
                                                                                    i54++;
                                                                                    uri = uri3;
                                                                                    i23 = i27;
                                                                                    size = i28;
                                                                                    i24 = i29;
                                                                                }
                                                                                i53++;
                                                                                z48 = z49;
                                                                                size = size;
                                                                            }
                                                                            uri2 = uri;
                                                                            i25 = i23;
                                                                            i26 = i24;
                                                                            z37 = z48;
                                                                            if (!z37 && Build.VERSION.SDK_INT < 24 && tz.s.length() == 0 && A()) {
                                                                                Intent intent4 = new Intent(w0.b, (Class<?>) PopupReplyReceiver.class);
                                                                                intent4.putExtra(str23, this.currentAccount);
                                                                                rVar.a(R.drawable.ic_ab_reply, cd.K0(2131746278), PendingIntent.getBroadcast(w0.b, 2, intent4, 167772160));
                                                                            }
                                                                            X(rVar, str22, j23, j21, str18, jArr, i26, uri2, i25, z35, z46, z27, i12);
                                                                            R();
                                                                            return;
                                                                        }
                                                                    }
                                                                    uri2 = uri;
                                                                    i25 = i23;
                                                                    i26 = i24;
                                                                    z37 = false;
                                                                    if (!z37) {
                                                                        Intent intent42 = new Intent(w0.b, (Class<?>) PopupReplyReceiver.class);
                                                                        intent42.putExtra(str23, this.currentAccount);
                                                                        rVar.a(R.drawable.ic_ab_reply, cd.K0(2131746278), PendingIntent.getBroadcast(w0.b, 2, intent42, 167772160));
                                                                    }
                                                                    X(rVar, str22, j23, j21, str18, jArr, i26, uri2, i25, z35, z46, z27, i12);
                                                                    R();
                                                                    return;
                                                                }
                                                                user = Z1;
                                                                chat3 = chat4;
                                                            }
                                                            fileLocation = null;
                                                            String str232 = str3;
                                                            intent.putExtra(str232, this.currentAccount);
                                                            PendingIntent activity2 = PendingIntent.getActivity(w0.b, 0, intent, 1140850688);
                                                            rVar.g(str14);
                                                            rVar.F.icon = R.drawable.notification;
                                                            rVar.h(16, true);
                                                            rVar.i = this.I;
                                                            rVar.g = activity2;
                                                            rVar.q = this.e0;
                                                            rVar.r = true;
                                                            rVar.k = true;
                                                            rVar.F.when = jjVar.k.date * j10;
                                                            rVar.w = -15618822;
                                                            rVar.u = "msg";
                                                            if (chat3 == null) {
                                                                str16 = "tel:+" + user.phone;
                                                                if (str16 != null) {
                                                                    rVar.G.add(str16);
                                                                }
                                                            }
                                                            Intent intent22 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                                                            intent22.putExtra("messageDate", jjVar.k.date);
                                                            intent22.putExtra(str232, this.currentAccount);
                                                            if (jjVar.K) {
                                                            }
                                                            if (jjVar.J) {
                                                            }
                                                            rVar.F.deleteIntent = PendingIntent.getBroadcast(w0.b, i31, intent22, 167772160);
                                                            if (bitmap2 == null) {
                                                            }
                                                            z36 = z22;
                                                            if (z10) {
                                                            }
                                                            rVar.j = -1;
                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                            }
                                                            i23 = 0;
                                                            if (!z36) {
                                                            }
                                                            i24 = i21;
                                                            long[] jArr22 = {0, 0};
                                                            rVar.F.vibrate = jArr22;
                                                            jArr = jArr22;
                                                            uri = null;
                                                            if (!i0.o2()) {
                                                                replyMarkup = jjVar.k.reply_markup;
                                                                if (replyMarkup instanceof TLRPC.TL_replyInlineMarkup) {
                                                                }
                                                            }
                                                            uri2 = uri;
                                                            i25 = i23;
                                                            i26 = i24;
                                                            z37 = false;
                                                            if (!z37) {
                                                            }
                                                            X(rVar, str22, j23, j21, str18, jArr, i26, uri2, i25, z35, z46, z27, i12);
                                                            R();
                                                            return;
                                                        }
                                                        long[] jArr3 = new long[this.D.size()];
                                                        for (int i56 = 0; i56 < this.D.size(); i56++) {
                                                            jArr3[i56] = ((nt) this.D.get(i56)).a;
                                                        }
                                                        intent.putExtra("storyDialogIds", jArr3);
                                                    }
                                                } else {
                                                    intent.putExtra("storyId", Math.abs(jjVar.f1()));
                                                    i20 = i19;
                                                    i21 = i13;
                                                    str14 = str13;
                                                    z34 = z26;
                                                }
                                                z35 = z47;
                                                user = Z1;
                                                chat3 = chat4;
                                                fileLocation = null;
                                                String str2322 = str3;
                                                intent.putExtra(str2322, this.currentAccount);
                                                PendingIntent activity22 = PendingIntent.getActivity(w0.b, 0, intent, 1140850688);
                                                rVar.g(str14);
                                                rVar.F.icon = R.drawable.notification;
                                                rVar.h(16, true);
                                                rVar.i = this.I;
                                                rVar.g = activity22;
                                                rVar.q = this.e0;
                                                rVar.r = true;
                                                rVar.k = true;
                                                rVar.F.when = jjVar.k.date * j10;
                                                rVar.w = -15618822;
                                                rVar.u = "msg";
                                                if (chat3 == null) {
                                                }
                                                Intent intent222 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                                                intent222.putExtra("messageDate", jjVar.k.date);
                                                intent222.putExtra(str2322, this.currentAccount);
                                                if (jjVar.K) {
                                                }
                                                if (jjVar.J) {
                                                }
                                                rVar.F.deleteIntent = PendingIntent.getBroadcast(w0.b, i31, intent222, 167772160);
                                                if (bitmap2 == null) {
                                                }
                                                z36 = z22;
                                                if (z10) {
                                                }
                                                rVar.j = -1;
                                                if (Build.VERSION.SDK_INT >= 26) {
                                                }
                                                i23 = 0;
                                                if (!z36) {
                                                }
                                                i24 = i21;
                                                long[] jArr222 = {0, 0};
                                                rVar.F.vibrate = jArr222;
                                                jArr = jArr222;
                                                uri = null;
                                                if (!i0.o2()) {
                                                }
                                                uri2 = uri;
                                                i25 = i23;
                                                i26 = i24;
                                                z37 = false;
                                                if (!z37) {
                                                }
                                                X(rVar, str22, j23, j21, str18, jArr, i26, uri2, i25, z35, z46, z27, i12);
                                                R();
                                                return;
                                            }
                                            long j41 = sharedPreferences2.getLong(z25 ? "StoriesSoundDocId" : "GlobalSoundDocId", j37);
                                            if (j41 != j37) {
                                                string2 = getMediaDataController().z0.e(j41);
                                                z38 = true;
                                            } else {
                                                string2 = sharedPreferences2.getString(z25 ? "StoriesSoundPath" : "GlobalSoundPath", path);
                                                z38 = false;
                                            }
                                            i15 = sharedPreferences2.getInt("vibrate_messages", 0);
                                            String str26 = string2;
                                            i14 = sharedPreferences2.getInt("priority_messages", 1);
                                            z29 = z38;
                                            i13 = sharedPreferences2.getInt("MessagesLed", -16776961);
                                            i12 = z25 ? 3 : 1;
                                            string = str26;
                                        }
                                        i16 = 4;
                                        if (i15 != i16) {
                                        }
                                        if (TextUtils.isEmpty(str11)) {
                                        }
                                        str11 = string;
                                        z26 = z29;
                                        z31 = true;
                                        z32 = z30;
                                        if (i10 != 3) {
                                        }
                                        i17 = i14;
                                        if (num != null) {
                                            i13 = num.intValue();
                                            z31 = false;
                                        }
                                        if (i11 != 0) {
                                        }
                                        i11 = i15;
                                        str13 = str12;
                                        z33 = z31;
                                        if (z24) {
                                        }
                                        if (z32) {
                                            ringerMode = o0.getRingerMode();
                                            if (ringerMode != 0) {
                                                i19 = 2;
                                            }
                                        }
                                        if (z27) {
                                        }
                                        Intent intent5 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                                        StringBuilder sb42 = new StringBuilder();
                                        sb42.append("com.tmessages.openchat");
                                        boolean z472 = z33;
                                        sb42.append(Math.random());
                                        sb42.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                        intent5.setAction(sb42.toString());
                                        intent5.setFlags(67108864);
                                        if (jjVar.O) {
                                        }
                                        if (jjVar.J) {
                                        }
                                        z35 = z472;
                                        user = Z1;
                                        chat3 = chat4;
                                        fileLocation = null;
                                        String str23222 = str3;
                                        intent5.putExtra(str23222, this.currentAccount);
                                        PendingIntent activity222 = PendingIntent.getActivity(w0.b, 0, intent5, 1140850688);
                                        rVar.g(str14);
                                        rVar.F.icon = R.drawable.notification;
                                        rVar.h(16, true);
                                        rVar.i = this.I;
                                        rVar.g = activity222;
                                        rVar.q = this.e0;
                                        rVar.r = true;
                                        rVar.k = true;
                                        rVar.F.when = jjVar.k.date * j10;
                                        rVar.w = -15618822;
                                        rVar.u = "msg";
                                        if (chat3 == null) {
                                        }
                                        Intent intent2222 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                                        intent2222.putExtra("messageDate", jjVar.k.date);
                                        intent2222.putExtra(str23222, this.currentAccount);
                                        if (jjVar.K) {
                                        }
                                        if (jjVar.J) {
                                        }
                                        rVar.F.deleteIntent = PendingIntent.getBroadcast(w0.b, i31, intent2222, 167772160);
                                        if (bitmap2 == null) {
                                        }
                                        z36 = z22;
                                        if (z10) {
                                        }
                                        rVar.j = -1;
                                        if (Build.VERSION.SDK_INT >= 26) {
                                        }
                                        i23 = 0;
                                        if (!z36) {
                                        }
                                        i24 = i21;
                                        long[] jArr2222 = {0, 0};
                                        rVar.F.vibrate = jArr2222;
                                        jArr = jArr2222;
                                        uri = null;
                                        if (!i0.o2()) {
                                        }
                                        uri2 = uri;
                                        i25 = i23;
                                        i26 = i24;
                                        z37 = false;
                                        if (!z37) {
                                        }
                                        X(rVar, str22, j23, j21, str18, jArr, i26, uri2, i25, z35, z46, z27, i12);
                                        R();
                                        return;
                                    }
                                } else {
                                    j20 = j15;
                                }
                                z23 = z21;
                                String path2 = Settings.System.DEFAULT_NOTIFICATION_URI.getPath();
                                z24 = w0.x;
                                boolean z462 = !z24;
                                v(j17, j20, false);
                                if (this.g0.e(j17, j20)) {
                                }
                                String str222 = str5;
                                if (jjVar.I) {
                                }
                                z27 = z23;
                                j23 = j22;
                                str12 = K02;
                                j24 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                                if (j24 != 0) {
                                }
                                int i442 = sharedPreferences2.getInt("vibrate_react", 0);
                                int i452 = sharedPreferences2.getInt("priority_react", 1);
                                int i462 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                                z29 = z28;
                                i12 = jjVar.J ? 5 : 4;
                                i13 = i462;
                                i14 = i452;
                                i15 = i442;
                                i16 = 4;
                                if (i15 != i16) {
                                }
                                if (TextUtils.isEmpty(str11)) {
                                }
                                str11 = string;
                                z26 = z29;
                                z31 = true;
                                z32 = z30;
                                if (i10 != 3) {
                                }
                                i17 = i14;
                                if (num != null) {
                                }
                                if (i11 != 0) {
                                }
                                i11 = i15;
                                str13 = str12;
                                z33 = z31;
                                if (z24) {
                                }
                                if (z32) {
                                }
                                if (z27) {
                                }
                                Intent intent52 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                                StringBuilder sb422 = new StringBuilder();
                                sb422.append("com.tmessages.openchat");
                                boolean z4722 = z33;
                                sb422.append(Math.random());
                                sb422.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                                intent52.setAction(sb422.toString());
                                intent52.setFlags(67108864);
                                if (jjVar.O) {
                                }
                                if (jjVar.J) {
                                }
                                z35 = z4722;
                                user = Z1;
                                chat3 = chat4;
                                fileLocation = null;
                                String str232222 = str3;
                                intent52.putExtra(str232222, this.currentAccount);
                                PendingIntent activity2222 = PendingIntent.getActivity(w0.b, 0, intent52, 1140850688);
                                rVar.g(str14);
                                rVar.F.icon = R.drawable.notification;
                                rVar.h(16, true);
                                rVar.i = this.I;
                                rVar.g = activity2222;
                                rVar.q = this.e0;
                                rVar.r = true;
                                rVar.k = true;
                                rVar.F.when = jjVar.k.date * j10;
                                rVar.w = -15618822;
                                rVar.u = "msg";
                                if (chat3 == null) {
                                }
                                Intent intent22222 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                                intent22222.putExtra("messageDate", jjVar.k.date);
                                intent22222.putExtra(str232222, this.currentAccount);
                                if (jjVar.K) {
                                }
                                if (jjVar.J) {
                                }
                                rVar.F.deleteIntent = PendingIntent.getBroadcast(w0.b, i31, intent22222, 167772160);
                                if (bitmap2 == null) {
                                }
                                z36 = z22;
                                if (z10) {
                                }
                                rVar.j = -1;
                                if (Build.VERSION.SDK_INT >= 26) {
                                }
                                i23 = 0;
                                if (!z36) {
                                }
                                i24 = i21;
                                long[] jArr22222 = {0, 0};
                                rVar.F.vibrate = jArr22222;
                                jArr = jArr22222;
                                uri = null;
                                if (!i0.o2()) {
                                }
                                uri2 = uri;
                                i25 = i23;
                                i26 = i24;
                                z37 = false;
                                if (!z37) {
                                }
                                X(rVar, str222, j23, j21, str18, jArr, i26, uri2, i25, z35, z462, z27, i12);
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
                            z24 = w0.x;
                            boolean z4622 = !z24;
                            v(j17, j20, false);
                            if (this.g0.e(j17, j20)) {
                            }
                            String str2222 = str5;
                            if (jjVar.I) {
                            }
                            z27 = z23;
                            j23 = j22;
                            str12 = K02;
                            j24 = sharedPreferences2.getLong("ReactionSoundDocId", 0L);
                            if (j24 != 0) {
                            }
                            int i4422 = sharedPreferences2.getInt("vibrate_react", 0);
                            int i4522 = sharedPreferences2.getInt("priority_react", 1);
                            int i4622 = sharedPreferences2.getInt("ReactionsLed", -16776961);
                            z29 = z28;
                            i12 = jjVar.J ? 5 : 4;
                            i13 = i4622;
                            i14 = i4522;
                            i15 = i4422;
                            i16 = 4;
                            if (i15 != i16) {
                            }
                            if (TextUtils.isEmpty(str11)) {
                            }
                            str11 = string;
                            z26 = z29;
                            z31 = true;
                            z32 = z30;
                            if (i10 != 3) {
                            }
                            i17 = i14;
                            if (num != null) {
                            }
                            if (i11 != 0) {
                            }
                            i11 = i15;
                            str13 = str12;
                            z33 = z31;
                            if (z24) {
                            }
                            if (z32) {
                            }
                            if (z27) {
                            }
                            Intent intent522 = new Intent(w0.b, (Class<?>) LaunchActivity.class);
                            StringBuilder sb4222 = new StringBuilder();
                            sb4222.append("com.tmessages.openchat");
                            boolean z47222 = z33;
                            sb4222.append(Math.random());
                            sb4222.append(ConnectionsManager.DEFAULT_DATACENTER_ID);
                            intent522.setAction(sb4222.toString());
                            intent522.setFlags(67108864);
                            if (jjVar.O) {
                            }
                            if (jjVar.J) {
                            }
                            z35 = z47222;
                            user = Z1;
                            chat3 = chat4;
                            fileLocation = null;
                            String str2322222 = str3;
                            intent522.putExtra(str2322222, this.currentAccount);
                            PendingIntent activity22222 = PendingIntent.getActivity(w0.b, 0, intent522, 1140850688);
                            rVar.g(str14);
                            rVar.F.icon = R.drawable.notification;
                            rVar.h(16, true);
                            rVar.i = this.I;
                            rVar.g = activity22222;
                            rVar.q = this.e0;
                            rVar.r = true;
                            rVar.k = true;
                            rVar.F.when = jjVar.k.date * j10;
                            rVar.w = -15618822;
                            rVar.u = "msg";
                            if (chat3 == null) {
                            }
                            Intent intent222222 = new Intent(w0.b, (Class<?>) NotificationDismissReceiver.class);
                            intent222222.putExtra("messageDate", jjVar.k.date);
                            intent222222.putExtra(str2322222, this.currentAccount);
                            if (jjVar.K) {
                            }
                            if (jjVar.J) {
                            }
                            rVar.F.deleteIntent = PendingIntent.getBroadcast(w0.b, i31, intent222222, 167772160);
                            if (bitmap2 == null) {
                            }
                            z36 = z22;
                            if (z10) {
                            }
                            rVar.j = -1;
                            if (Build.VERSION.SDK_INT >= 26) {
                            }
                            i23 = 0;
                            if (!z36) {
                            }
                            i24 = i21;
                            long[] jArr222222 = {0, 0};
                            rVar.F.vibrate = jArr222222;
                            jArr = jArr222222;
                            uri = null;
                            if (!i0.o2()) {
                            }
                            uri2 = uri;
                            i25 = i23;
                            i26 = i24;
                            z37 = false;
                            if (!z37) {
                            }
                            X(rVar, str2222, j23, j21, str18, jArr, i26, uri2, i25, z35, z4622, z27, i12);
                            R();
                            return;
                        }
                        str4 = K0;
                        if (!c10.getBoolean("EnableReactionsPreview", true)) {
                            K02 = cd.K0(2131748034);
                            if (z14) {
                            }
                            e0.r rVar2 = new e0.r(w0.b);
                            TLRPC.Chat chat42 = chat2;
                            if (this.a.size() > 1) {
                            }
                            sharedPreferences = c10;
                            j19 = j31;
                            String str192 = str;
                            boolean[] zArr22 = new boolean[1];
                            x10 = x(jjVar, zArr22);
                            if (!jjVar.k.silent) {
                                z19 = false;
                                if (x10 != null) {
                                }
                            }
                            z19 = true;
                            if (x10 != null) {
                            }
                        }
                        K02 = str4;
                        if (z14) {
                        }
                        e0.r rVar22 = new e0.r(w0.b);
                        TLRPC.Chat chat422 = chat2;
                        if (this.a.size() > 1) {
                        }
                        sharedPreferences = c10;
                        j19 = j31;
                        String str1922 = str;
                        boolean[] zArr222 = new boolean[1];
                        x10 = x(jjVar, zArr222);
                        if (!jjVar.k.silent) {
                        }
                        z19 = true;
                        if (x10 != null) {
                        }
                    }
                } else {
                    z14 = equalsIgnoreCase;
                }
                K0 = !z13 ? j29 != j11 ? cd.K0(2131748037) : cd.K0(2131748034) : cd.K0(R.string.AppName);
                z15 = false;
                if (!jjVar.I) {
                    str4 = K0;
                    K02 = str4;
                    if (z14) {
                    }
                    e0.r rVar222 = new e0.r(w0.b);
                    TLRPC.Chat chat4222 = chat2;
                    if (this.a.size() > 1) {
                    }
                    sharedPreferences = c10;
                    j19 = j31;
                    String str19222 = str;
                    boolean[] zArr2222 = new boolean[1];
                    x10 = x(jjVar, zArr2222);
                    if (!jjVar.k.silent) {
                    }
                    z19 = true;
                    if (x10 != null) {
                    }
                }
                str4 = K0;
                if (!c10.getBoolean("EnableReactionsPreview", true)) {
                }
                K02 = str4;
                if (z14) {
                }
                e0.r rVar2222 = new e0.r(w0.b);
                TLRPC.Chat chat42222 = chat2;
                if (this.a.size() > 1) {
                }
                sharedPreferences = c10;
                j19 = j31;
                String str192222 = str;
                boolean[] zArr22222 = new boolean[1];
                x10 = x(jjVar, zArr22222);
                if (!jjVar.k.silent) {
                }
                z19 = true;
                if (x10 != null) {
                }
            }
            z13 = true;
            String str182 = y3;
            boolean equalsIgnoreCase2 = "samsung".equalsIgnoreCase(Build.MANUFACTURER);
            if (o5.C(j17)) {
            }
            if (!z13) {
            }
            z15 = false;
            if (!jjVar.I) {
            }
            str4 = K0;
            if (!c10.getBoolean("EnableReactionsPreview", true)) {
            }
            K02 = str4;
            if (z14) {
            }
            e0.r rVar22222 = new e0.r(w0.b);
            TLRPC.Chat chat422222 = chat2;
            if (this.a.size() > 1) {
            }
            sharedPreferences = c10;
            j19 = j31;
            String str1922222 = str;
            boolean[] zArr222222 = new boolean[1];
            x10 = x(jjVar, zArr222222);
            if (!jjVar.k.silent) {
            }
            z19 = true;
            if (x10 != null) {
            }
        } catch (Exception e7) {
            f8.f(e7);
        }
    }

    public final void a0(long j10, String str) {
        k0.c(new or(this, str, j10, 3));
    }

    public final void b0(int i10) {
        SharedPreferences c10 = getAccountInstance().c();
        if (i10 == 4 || i10 == 5) {
            TL_account.setReactionsNotifySettings setreactionsnotifysettings = new TL_account.setReactionsNotifySettings();
            setreactionsnotifysettings.settings = new TL_account.TL_reactionsNotifySettings();
            if (c10.getBoolean("EnableReactionsMessages", true)) {
                setreactionsnotifysettings.settings.flags |= 1;
                if (c10.getBoolean("EnableReactionsMessagesContacts", false)) {
                    setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
                } else {
                    setreactionsnotifysettings.settings.messages_notify_from = new TL_account.TL_reactionNotificationsFromAll();
                }
            }
            if (c10.getBoolean("EnableReactionsStories", true)) {
                setreactionsnotifysettings.settings.flags |= 2;
                if (c10.getBoolean("EnableReactionsStoriesContacts", false)) {
                    setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromContacts();
                } else {
                    setreactionsnotifysettings.settings.stories_notify_from = new TL_account.TL_reactionNotificationsFromAll();
                }
            }
            setreactionsnotifysettings.settings.show_previews = c10.getBoolean("EnableReactionsPreview", true);
            setreactionsnotifysettings.settings.sound = s(c10, "ReactionSound", "ReactionSoundDocId", "ReactionSoundPath");
            getConnectionsManager().sendRequest(setreactionsnotifysettings, new ag.c3(9));
            return;
        }
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = new TLRPC.TL_inputPeerNotifySettings();
        updatenotifysettings.settings = tL_inputPeerNotifySettings;
        tL_inputPeerNotifySettings.flags = 5;
        if (i10 == 0) {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyChats();
            updatenotifysettings.settings.mute_until = c10.getInt("EnableGroup2", 0);
            updatenotifysettings.settings.show_previews = c10.getBoolean("EnablePreviewGroup", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings2.flags |= 8;
            tL_inputPeerNotifySettings2.sound = s(c10, "GroupSound", "GroupSoundDocId", "GroupSoundPath");
        } else if (i10 == 1 || i10 == 3) {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyUsers();
            updatenotifysettings.settings.mute_until = c10.getInt("EnableAll2", 0);
            updatenotifysettings.settings.show_previews = c10.getBoolean("EnablePreviewAll", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 128;
            tL_inputPeerNotifySettings3.stories_hide_sender = c10.getBoolean("EnableHideStoriesSenders", false);
            if (c10.contains("EnableAllStories")) {
                TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
                tL_inputPeerNotifySettings4.flags |= 64;
                tL_inputPeerNotifySettings4.stories_muted = !c10.getBoolean("EnableAllStories", true);
            }
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings5 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings5.flags |= 8;
            tL_inputPeerNotifySettings5.sound = s(c10, "GlobalSound", "GlobalSoundDocId", "GlobalSoundPath");
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings6 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings6.flags |= 256;
            tL_inputPeerNotifySettings6.stories_sound = s(c10, "StoriesSound", "StoriesSoundDocId", "StoriesSoundPath");
        } else {
            updatenotifysettings.peer = new TLRPC.TL_inputNotifyBroadcasts();
            updatenotifysettings.settings.mute_until = c10.getInt("EnableChannel2", 0);
            updatenotifysettings.settings.show_previews = c10.getBoolean("EnablePreviewChannel", true);
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings7 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings7.flags |= 8;
            tL_inputPeerNotifySettings7.sound = s(c10, "ChannelSound", "ChannelSoundDocId", "ChannelSoundPath");
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new ag.c3(9));
    }

    public final void c0(long j10, long j11, boolean z10) {
        if (z10) {
            getNotificationCenter().k(zs.f0, new Object[0]);
        }
        if (o5.C(j10)) {
            return;
        }
        SharedPreferences c10 = getAccountInstance().c();
        TL_account.updateNotifySettings updatenotifysettings = new TL_account.updateNotifySettings();
        updatenotifysettings.settings = new TLRPC.TL_inputPeerNotifySettings();
        String v = v(j10, j11, false);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings = updatenotifysettings.settings;
        tL_inputPeerNotifySettings.flags |= 1;
        tL_inputPeerNotifySettings.show_previews = c10.getBoolean("content_preview_" + v, true);
        TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings2 = updatenotifysettings.settings;
        tL_inputPeerNotifySettings2.flags = tL_inputPeerNotifySettings2.flags | 2;
        tL_inputPeerNotifySettings2.silent = c10.getBoolean("silent_" + v, false);
        if (c10.contains("stories_" + v)) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings3 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings3.flags |= 64;
            tL_inputPeerNotifySettings3.stories_muted = !c10.getBoolean("stories_" + v, true);
        }
        int i10 = c10.getInt("notify2_" + v(j10, j11, false), -1);
        if (i10 != -1) {
            TLRPC.TL_inputPeerNotifySettings tL_inputPeerNotifySettings4 = updatenotifysettings.settings;
            tL_inputPeerNotifySettings4.flags |= 4;
            if (i10 == 3) {
                tL_inputPeerNotifySettings4.mute_until = c10.getInt("notifyuntil_" + v(j10, j11, false), 0);
            } else {
                tL_inputPeerNotifySettings4.mute_until = i10 != 2 ? 0 : ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
        }
        long j12 = c10.getLong("sound_document_id_" + v(j10, j11, false), 0L);
        String string = c10.getString("sound_path_" + v(j10, j11, false), null);
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
            tL_notificationSoundLocal.title = c10.getString("sound_" + v(j10, j11, false), null);
            tL_notificationSoundLocal.data = string;
            updatenotifysettings.settings.sound = tL_notificationSoundLocal;
        }
        if (j11 == 0 || j10 == getUserConfig().e()) {
            int i11 = this.currentAccount;
            if (j10 >= 0 || !w3.Y(vp.r1(i11).L0(Long.valueOf(-j10)))) {
                TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
                tL_inputNotifyPeer.peer = getMessagesController().i1(j10);
                updatenotifysettings.peer = tL_inputNotifyPeer;
            } else {
                TLRPC.TL_inputNotifyCommunity tL_inputNotifyCommunity = new TLRPC.TL_inputNotifyCommunity();
                tL_inputNotifyCommunity.community = getMessagesController().g1(-j10);
                updatenotifysettings.peer = tL_inputNotifyCommunity;
            }
        } else {
            TLRPC.TL_inputNotifyForumTopic tL_inputNotifyForumTopic = new TLRPC.TL_inputNotifyForumTopic();
            tL_inputNotifyForumTopic.peer = getMessagesController().i1(j10);
            tL_inputNotifyForumTopic.top_msg_id = (int) j11;
            updatenotifysettings.peer = tL_inputNotifyForumTopic;
        }
        getConnectionsManager().sendRequest(updatenotifysettings, new ag.c3(9));
    }

    public final void d0() {
        int i10 = 0;
        long j10 = Long.MAX_VALUE;
        while (true) {
            ArrayList arrayList = this.D;
            if (i10 >= arrayList.size()) {
                break;
            }
            Iterator it = ((nt) arrayList.get(i10)).c.values().iterator();
            while (it.hasNext()) {
                j10 = Math.min(j10, ((Long) ((Pair) it.next()).second).longValue());
            }
            i10++;
        }
        r5 r5Var = k0;
        at atVar = this.i0;
        r5Var.a(atVar);
        long currentTimeMillis = j10 - System.currentTimeMillis();
        if (j10 != Long.MAX_VALUE) {
            r5Var.d(atVar, Math.max(0L, currentTimeMillis));
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.Y1) {
            k0.c(new hr(9, this, (String) objArr[0]));
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
    public final String e0(long j10, long j11, String str, long[] jArr, int i10, Uri uri, int i11, boolean z10, boolean z11, boolean z12, int i12) {
        String str2;
        String str3;
        boolean z13;
        String str4;
        int i13;
        int i14;
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
        int i15;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        boolean z14;
        String a2;
        String a02;
        long j12;
        String str21;
        String string;
        int i16;
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
        int i17;
        String str28;
        String str29;
        String str30;
        boolean z17;
        String str31;
        int i18;
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
        int i19;
        SharedPreferences.Editor editor;
        boolean z22;
        boolean z23;
        boolean z24;
        long j14;
        char c10;
        boolean z25;
        String str40;
        SharedPreferences c11 = getAccountInstance().c();
        if (this.P == null) {
            this.P = Boolean.valueOf(c11.getBoolean("groupsCreated5", false));
        }
        String str41 = "vibrate_";
        String str42 = "vibrate_react";
        if (this.P.booleanValue()) {
            str2 = "vibrate_react";
            str3 = "vibrate_";
        } else {
            try {
                String str43 = this.currentAccount + "channel";
                List<NotificationChannel> notificationChannels = m0.getNotificationChannels();
                int size = notificationChannels.size();
                int i20 = 0;
                SharedPreferences.Editor editor2 = null;
                while (i20 < size) {
                    NotificationChannel notificationChannel2 = notificationChannels.get(i20);
                    List<NotificationChannel> list = notificationChannels;
                    String id2 = notificationChannel2.getId();
                    if (id2.startsWith(str43)) {
                        str4 = str43;
                        int importance = notificationChannel2.getImportance();
                        i13 = size;
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
                                i14 = i20;
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
                                    } catch (Exception e) {
                                        e = e;
                                        str3 = str41;
                                        z13 = true;
                                        f8.g(e, true);
                                        c11.edit().putBoolean("groupsCreated5", z13).commit();
                                        this.P = Boolean.TRUE;
                                        if (this.Q) {
                                        }
                                        SharedPreferences c12 = getAccountInstance().c();
                                        if (z12) {
                                        }
                                        if (z10) {
                                        }
                                        if (z11) {
                                        }
                                        a2 = Utilities.a(uri == null ? "NoSound2" : uri.toString());
                                        if (a2 != null) {
                                            a2 = a2.substring(0, 5);
                                        }
                                        if (z12) {
                                        }
                                        String C = a1.g.C(str16, "_", a2);
                                        string = c12.getString(C, null);
                                        StringBuilder sb5 = new StringBuilder();
                                        sb5.append(C);
                                        String str44 = "_s";
                                        sb5.append("_s");
                                        String string2 = c12.getString(sb5.toString(), null);
                                        StringBuilder sb6 = new StringBuilder();
                                        if (string != null) {
                                        }
                                        i17 = i11;
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
                                        i18 = 0;
                                        while (i18 < jArr2.length) {
                                        }
                                        boolean z26 = z14;
                                        sb4 = sb3;
                                        sb4.append(i16);
                                        if (uri != null) {
                                        }
                                        sb4.append(i17);
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
                                        m0.deleteNotificationChannel(id2);
                                    } catch (Exception e7) {
                                        e = e7;
                                        z13 = true;
                                        f8.g(e, true);
                                        c11.edit().putBoolean("groupsCreated5", z13).commit();
                                        this.P = Boolean.TRUE;
                                        if (this.Q) {
                                        }
                                        SharedPreferences c122 = getAccountInstance().c();
                                        if (z12) {
                                        }
                                        if (z10) {
                                        }
                                        if (z11) {
                                        }
                                        a2 = Utilities.a(uri == null ? "NoSound2" : uri.toString());
                                        if (a2 != null) {
                                        }
                                        if (z12) {
                                        }
                                        String C2 = a1.g.C(str16, "_", a2);
                                        string = c122.getString(C2, null);
                                        StringBuilder sb52 = new StringBuilder();
                                        sb52.append(C2);
                                        String str442 = "_s";
                                        sb52.append("_s");
                                        String string22 = c122.getString(sb52.toString(), null);
                                        StringBuilder sb62 = new StringBuilder();
                                        if (string != null) {
                                        }
                                        i17 = i11;
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
                                        i18 = 0;
                                        while (i18 < jArr2.length) {
                                        }
                                        boolean z262 = z14;
                                        sb4 = sb3;
                                        sb4.append(i16);
                                        if (uri != null) {
                                        }
                                        sb4.append(i17);
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
                                    m0.deleteNotificationChannel(id2);
                                }
                            }
                        }
                        str2 = str42;
                        i14 = i20;
                        str3 = str41;
                        m0.deleteNotificationChannel(id2);
                    } else {
                        str4 = str43;
                        str2 = str42;
                        i13 = size;
                        i14 = i20;
                        str3 = str41;
                    }
                    i20 = i14 + 1;
                    size = i13;
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
            } catch (Exception e10) {
                e = e10;
                str2 = str42;
            }
            c11.edit().putBoolean("groupsCreated5", z13).commit();
            this.P = Boolean.TRUE;
        }
        if (this.Q) {
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
            List<NotificationChannelGroup> notificationChannelGroups = m0.getNotificationChannelGroups();
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
            int i21 = 0;
            while (i21 < size2) {
                List<NotificationChannelGroup> list2 = notificationChannelGroups;
                String id3 = notificationChannelGroups.get(i21).getId();
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
                i21++;
                notificationChannelGroups = list2;
            }
            if (str54 == null && str53 == null && str52 == null && str51 == null && str50 == null && str55 == null) {
                str6 = "reactions";
                str10 = "private";
            } else {
                TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(getUserConfig().e()));
                if (Z1 == null) {
                    getUserConfig().f();
                }
                if (Z1 != null) {
                    StringBuilder sb9 = new StringBuilder(" (");
                    str6 = "reactions";
                    sb9.append(i5.m(0, Z1.first_name, Z1.last_name));
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
                    sb10.append(cd.L0(2131747937, null));
                    sb10.append(str40);
                    arrayList.add(new NotificationChannelGroup(str54, sb10.toString()));
                } else {
                    str10 = "private";
                }
                if (str53 != null) {
                    arrayList.add(new NotificationChannelGroup(str53, cd.L0(2131747923, null) + str40));
                }
                if (str51 != null) {
                    arrayList.add(new NotificationChannelGroup(str51, cd.L0(2131747881, null) + str40));
                }
                if (str52 != null) {
                    arrayList.add(new NotificationChannelGroup(str52, cd.L0(2131747893, null) + str40));
                }
                if (str50 != null) {
                    arrayList.add(new NotificationChannelGroup(str50, cd.L0(2131747894, null) + str40));
                }
                if (str55 != null) {
                    arrayList.add(new NotificationChannelGroup(str55, cd.L0(2131747907, null) + str40));
                }
                m0.createNotificationChannelGroups(arrayList);
            }
            this.Q = true;
        }
        SharedPreferences c1222 = getAccountInstance().c();
        if (z12) {
            i15 = i12;
            str18 = "other" + this.currentAccount;
            str16 = str6;
            str15 = str10;
            str17 = null;
        } else {
            i15 = i12;
            if (i15 == 2) {
                str19 = "channels" + this.currentAccount;
                str20 = "overwrite_channel";
            } else if (i15 == 0) {
                str19 = "groups" + this.currentAccount;
                str20 = "overwrite_group";
            } else if (i15 == 3) {
                str19 = "stories" + this.currentAccount;
                str20 = "overwrite_stories";
            } else if (i15 == 4 || i15 == 5) {
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
        boolean z27 = z10 && o5.C(j10);
        z14 = z11 && str17 != null && c1222.getBoolean(str17, false);
        a2 = Utilities.a(uri == null ? "NoSound2" : uri.toString());
        if (a2 != null && a2.length() > 5) {
            a2 = a2.substring(0, 5);
        }
        if (z12) {
            str16 = "silent";
            j12 = j10;
            str21 = cd.L0(2131747888, null);
        } else {
            if (z10) {
                a02 = cd.L0(z11 ? 2131747921 : 2131747932, null);
                if (i15 == 2) {
                    j12 = j10;
                    str21 = a02;
                    str16 = z11 ? "channels_ia" : "channels";
                } else if (i15 == 0) {
                    j12 = j10;
                    str21 = a02;
                    str16 = z11 ? "groups_ia" : "groups";
                } else if (i15 == 3) {
                    str21 = a02;
                    str16 = z11 ? "stories_ia" : "stories";
                    j12 = j10;
                } else {
                    if (i15 != 4 && i15 != 5) {
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
                a02 = z11 ? cd.a0(null, null, 2131747935, str) : str;
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
        String C22 = a1.g.C(str16, "_", a2);
        string = c1222.getString(C22, null);
        StringBuilder sb522 = new StringBuilder();
        sb522.append(C22);
        String str4422 = "_s";
        sb522.append("_s");
        String string222 = c1222.getString(sb522.toString(), null);
        StringBuilder sb622 = new StringBuilder();
        if (string != null) {
            NotificationChannel notificationChannel3 = m0.getNotificationChannel(string);
            sharedPreferences = c1222;
            str24 = str21;
            if (v2.a) {
                z15 = z27;
                f8.b("current channel for " + string + " = " + notificationChannel3);
            } else {
                z15 = z27;
            }
            if (notificationChannel3 == null) {
                jArr2 = jArr;
                i16 = i10;
                sb3 = sb622;
                str25 = str18;
                str26 = "_s";
                str27 = "_";
                j13 = 0;
                i17 = i11;
                str30 = null;
                str29 = null;
                str28 = null;
                z17 = false;
                if (z17) {
                }
                str31 = str26;
                if (!z14) {
                }
                i18 = 0;
                while (i18 < jArr2.length) {
                }
                boolean z2622 = z14;
                sb4 = sb3;
                sb4.append(i16);
                if (uri != null) {
                }
                sb4.append(i17);
                if (!z10) {
                    sb4.append("secret");
                }
                str29 = Utilities.a(sb4.toString());
                if (!z12) {
                    m0.deleteNotificationChannel(str28);
                    if (v2.a) {
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
                    int i22 = 0;
                    while (i22 < jArr3.length) {
                        sb622.append(jArr3[i22]);
                        i22++;
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
                if (v2.a) {
                    StringBuilder sb12 = new StringBuilder("current channel settings for ");
                    sb12.append(string);
                    sb12.append(" = ");
                    sb12.append((Object) sb622);
                    sb12.append(" old = ");
                    a1.g.z(string222, sb12);
                }
                String a10 = Utilities.a(sb622.toString());
                sb622.setLength(0);
                i17 = i11;
                if (z11 && i17 != importance2) {
                    jArr4 = jArr;
                    i16 = i10;
                    str36 = string;
                    str37 = string222;
                    sb3 = sb622;
                    str38 = a10;
                    str26 = str35;
                    j13 = 0;
                    z21 = false;
                    z20 = true;
                } else if (a10.equals(string222)) {
                    i16 = i10;
                    str36 = string;
                    str37 = string222;
                    sb3 = sb622;
                    str38 = a10;
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
                            if (i12 == 3) {
                                StringBuilder sb13 = new StringBuilder("stories_");
                                j14 = 0;
                                sb13.append(v(j12, 0L, false));
                                edit.putBoolean(sb13.toString(), false);
                            } else {
                                j14 = 0;
                                edit.putInt("notify2_" + v(j12, 0L, false), 2);
                            }
                            j13 = j14;
                            str38 = a10;
                            c0(j10, 0L, true);
                            j12 = j10;
                        } else if (z11) {
                            str38 = a10;
                            j13 = 0;
                            z24 = true;
                        } else {
                            if (i12 == 3) {
                                edit.putBoolean("EnableAllStories", false);
                                c10 = 4;
                                z25 = true;
                            } else {
                                c10 = 4;
                                if (i12 == 4) {
                                    z25 = true;
                                    edit.putBoolean("EnableReactionsMessages", true);
                                    edit.putBoolean("EnableReactionsStories", true);
                                } else {
                                    z25 = true;
                                    edit.putInt(q(i12), ConnectionsManager.DEFAULT_DATACENTER_ID);
                                }
                            }
                            b0(i12);
                            str38 = a10;
                            z24 = z25;
                            j13 = 0;
                        }
                        editor = edit;
                        jArr4 = jArr3;
                        str26 = str35;
                        z21 = z24;
                        str39 = str2;
                        sb3 = sb622;
                        i19 = i12;
                    } else {
                        str38 = a10;
                        j13 = 0;
                        str39 = str2;
                        sb3 = sb622;
                        if (importance2 != i17) {
                            if (z11) {
                                i19 = i12;
                                jArr4 = jArr3;
                                str26 = str35;
                                editor = null;
                            } else {
                                jArr4 = jArr3;
                                SharedPreferences.Editor edit2 = sharedPreferences.edit();
                                int i23 = (importance2 == 4 || importance2 == 5) ? 1 : importance2 == 1 ? 4 : importance2 == 2 ? 5 : 0;
                                if (z10) {
                                    i19 = i12;
                                    str26 = str35;
                                    if (i19 == 3) {
                                        edit2.putBoolean("EnableAllStories", true);
                                    } else if (i19 == 4) {
                                        edit2.putBoolean("EnableReactionsMessages", true);
                                        edit2.putBoolean("EnableReactionsStories", true);
                                    } else {
                                        edit2.putInt(q(i19), 0);
                                    }
                                    if (i19 == 2) {
                                        edit2.putInt(str8, i23);
                                    } else if (i19 == 0) {
                                        edit2.putInt(str5, i23);
                                    } else if (i19 == 3) {
                                        edit2.putInt("priority_stories", i23);
                                    } else if (i19 == 4 || i19 == 5) {
                                        edit2.putInt(str11, i23);
                                    } else {
                                        edit2.putInt(str13, i23);
                                    }
                                } else {
                                    i19 = i12;
                                    str26 = str35;
                                    if (i19 == 3) {
                                        edit2.putBoolean("stories_" + j12, true);
                                    } else {
                                        edit2.putInt("notify2_" + j12, 0);
                                        edit2.remove("notifyuntil_" + j12);
                                        edit2.putInt(str7 + j12, i23);
                                    }
                                }
                                editor = edit2;
                            }
                            z21 = true;
                        } else {
                            i19 = i12;
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
                                    editor.putInt(a1.g.l(j12, str3), z23 ? 0 : 2);
                                } else if (i19 == 2) {
                                    editor.putInt(str9, z23 ? 0 : 2);
                                } else if (i19 == 0) {
                                    editor.putInt(str14, z23 ? 0 : 2);
                                } else if (i19 == 3) {
                                    editor.putInt("vibrate_stories", z23 ? 0 : 2);
                                } else if (i19 == 4 || i19 == 5) {
                                    editor.putInt(str39, z23 ? 0 : 2);
                                } else {
                                    editor.putInt(str12, z23 ? 0 : 2);
                                }
                            }
                            z21 = true;
                        } else {
                            jArr4 = jArr;
                        }
                        i16 = i10;
                        if (lightColor != i16) {
                            if (!z11) {
                                if (editor == null) {
                                    editor = sharedPreferences.edit();
                                }
                                if (!z10) {
                                    editor.putInt("color_" + j12, lightColor);
                                } else if (i19 == 2) {
                                    editor.putInt("ChannelLed", lightColor);
                                } else if (i19 == 0) {
                                    editor.putInt("GroupLed", lightColor);
                                } else if (i19 == 3) {
                                    editor.putInt("StoriesLed", lightColor);
                                } else if (i19 == 5 || i19 == 4) {
                                    editor.putInt("ReactionsLed", lightColor);
                                } else {
                                    editor.putInt("MessagesLed", lightColor);
                                }
                            }
                            i16 = lightColor;
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
                    i16 = i10;
                    if (lightColor != i16) {
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
                        i18 = 0;
                        while (i18 < jArr2.length) {
                            sb3.append(jArr2[i18]);
                            i18++;
                            z14 = z14;
                        }
                        boolean z26222 = z14;
                        sb4 = sb3;
                        sb4.append(i16);
                        if (uri != null) {
                            sb4.append(uri.toString());
                        }
                        sb4.append(i17);
                        if (!z10 && z15) {
                            sb4.append("secret");
                        }
                        str29 = Utilities.a(sb4.toString());
                        if (!z12 && str28 != null && (z26222 || !str30.equals(str29))) {
                            try {
                                m0.deleteNotificationChannel(str28);
                            } catch (Exception e11) {
                                f8.g(e11, true);
                            }
                            if (v2.a) {
                                f8.b("delete channel by settings change ".concat(str28));
                            }
                            str32 = str29;
                            str33 = null;
                            if (str33 == null) {
                                str33 = z10 ? this.currentAccount + "channel_" + C22 + str27 + Utilities.b.nextLong() : this.currentAccount + "channel_" + j12 + str27 + Utilities.b.nextLong();
                                if (z15) {
                                    uri2 = null;
                                    str34 = cd.L0(2131745710, null);
                                } else {
                                    uri2 = null;
                                    str34 = str24;
                                }
                                NotificationChannel notificationChannel4 = new NotificationChannel(str33, str34, i17);
                                notificationChannel4.setGroup(str25);
                                if (i16 != 0) {
                                    notificationChannel4.enableLights(true);
                                    notificationChannel4.setLightColor(i16);
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
                                    if (v2.a) {
                                        f8.b("create new channel " + str33);
                                    }
                                    this.O = SystemClock.elapsedRealtime();
                                    m0.createNotificationChannel(notificationChannel4);
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
                                if (v2.a) {
                                }
                                this.O = SystemClock.elapsedRealtime();
                                m0.createNotificationChannel(notificationChannel4);
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
                    if (v2.a) {
                        f8.b("change edited channel " + str28);
                    }
                }
                str32 = str29;
                str33 = str28;
                if (str33 == null) {
                }
                return str33;
            }
            jArr2 = jArr;
            i16 = i10;
            str22 = string;
            str23 = string222;
            sb3 = sb622;
            str25 = str18;
            str26 = "_s";
            z16 = z14;
            str27 = "_";
            j13 = 0;
        } else {
            i16 = i10;
            str22 = string;
            str23 = string222;
            sb3 = sb622;
            sharedPreferences = c1222;
            str24 = str21;
            str25 = str18;
            str26 = "_s";
            z15 = z27;
            z16 = z14;
            str27 = "_";
            j13 = 0;
            jArr2 = jArr;
        }
        i17 = i11;
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
        i18 = 0;
        while (i18 < jArr2.length) {
        }
        boolean z262222 = z14;
        sb4 = sb3;
        sb4.append(i16);
        if (uri != null) {
        }
        sb4.append(i17);
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

    public final void h(jj jjVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i10 >= arrayList.size()) {
                arrayList.add(0, jjVar);
                return;
            } else if (((jj) arrayList.get(i10)).f1() == jjVar.f1() && jj.B0(((jj) arrayList.get(i10)).k) == jj.B0(jjVar.k) && ((jj) arrayList.get(i10)).K == jjVar.K) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[Catch: Exception -> 0x0067, TryCatch #0 {Exception -> 0x0067, blocks: (B:13:0x002b, B:16:0x0063, B:17:0x006e, B:20:0x0082, B:22:0x00a1, B:24:0x00ad, B:25:0x00b3, B:27:0x00bb, B:29:0x00bf, B:31:0x00c2, B:33:0x00cf, B:35:0x00d3, B:37:0x00d8, B:38:0x00df, B:40:0x00e3, B:41:0x00e8, B:43:0x010d, B:44:0x0115, B:46:0x011e, B:48:0x0146, B:50:0x0151, B:55:0x015f, B:59:0x017c, B:60:0x0183, B:61:0x0184, B:64:0x0129, B:67:0x0136, B:69:0x013b, B:70:0x0111, B:71:0x0188, B:72:0x018f, B:73:0x0190, B:74:0x0197, B:76:0x007e, B:77:0x006a), top: B:12:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0190 A[Catch: Exception -> 0x0067, TryCatch #0 {Exception -> 0x0067, blocks: (B:13:0x002b, B:16:0x0063, B:17:0x006e, B:20:0x0082, B:22:0x00a1, B:24:0x00ad, B:25:0x00b3, B:27:0x00bb, B:29:0x00bf, B:31:0x00c2, B:33:0x00cf, B:35:0x00d3, B:37:0x00d8, B:38:0x00df, B:40:0x00e3, B:41:0x00e8, B:43:0x010d, B:44:0x0115, B:46:0x011e, B:48:0x0146, B:50:0x0151, B:55:0x015f, B:59:0x017c, B:60:0x0183, B:61:0x0184, B:64:0x0129, B:67:0x0136, B:69:0x013b, B:70:0x0111, B:71:0x0188, B:72:0x018f, B:73:0x0190, B:74:0x0197, B:76:0x007e, B:77:0x006a), top: B:12:0x002b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String j(e0.r rVar, long j10, String str, TLRPC.User user, TLRPC.Chat chat, e0.l0 l0Var, boolean z10) {
        Bitmap bitmap;
        IconCompat d;
        if (Build.VERSION.SDK_INT < 29 || !tz.q0) {
            return null;
        }
        if (w3.T(chat) && !chat.megagroup) {
            return null;
        }
        try {
            String str2 = "ndid_" + j10;
            Intent intent = new Intent(w0.b, (Class<?>) OpenChatReceiver.class);
            intent.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
            if (j10 > 0) {
                intent.putExtra("userId", j10);
            } else {
                intent.putExtra("chatId", -j10);
            }
            Context context = w0.b;
            g0.c cVar = new g0.c();
            cVar.a = context;
            cVar.b = str2;
            cVar.e = chat != null ? str : h20.j(user, true);
            cVar.f = str;
            new Intent("android.intent.action.VIEW");
            cVar.c = new Intent[]{intent};
            cVar.l = true;
            cVar.k = new f0.f(str2);
            if (l0Var != null) {
                cVar.i = new e0.l0[]{l0Var};
                IconCompat iconCompat = l0Var.b;
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
                    g0.f.m(w0.b, cVar);
                    String str3 = cVar.b;
                    rVar.z = str3;
                    if (rVar.A == null) {
                        f0.f fVar = cVar.k;
                        if (fVar != null) {
                            rVar.A = fVar;
                        } else if (str3 != null) {
                            rVar.A = new f0.f(str3);
                        }
                    }
                    if (rVar.e == null) {
                        rVar.g(cVar.e);
                    }
                    Intent intent2 = new Intent(w0.b, (Class<?>) BubbleActivity.class);
                    intent2.setAction("com.tmessages.openchat" + Math.random() + ConnectionsManager.DEFAULT_DATACENTER_ID);
                    if (o5.E(j10)) {
                        intent2.putExtra("userId", j10);
                    } else {
                        intent2.putExtra("chatId", -j10);
                    }
                    intent2.putExtra("currentAccount", this.currentAccount);
                    if (bitmap != null) {
                        d = new IconCompat(5);
                        d.b = bitmap;
                    } else if (user != null) {
                        d = IconCompat.d(w0.b, user.bot ? R.drawable.book_bot : R.drawable.book_user);
                    } else {
                        d = IconCompat.d(w0.b, R.drawable.book_group);
                    }
                    if (!z10) {
                        rVar.E = null;
                        return str2;
                    }
                    PendingIntent activity = PendingIntent.getActivity(w0.b, 0, intent2, 167772160);
                    if (activity == null) {
                        throw new NullPointerException("Bubble requires non-null pending intent");
                    }
                    int i10 = (this.F > j10 ? 1 : (this.F == j10 ? 0 : -1)) == 0 ? 2 : 0;
                    int max = Math.max(i0.L(640.0f), 0);
                    e0.p pVar = new e0.p();
                    pVar.a = activity;
                    pVar.b = d;
                    pVar.c = max;
                    pVar.d = i10 & (-2);
                    rVar.E = pVar;
                    return str2;
                }
            }
            bitmap = null;
            if (!TextUtils.isEmpty(cVar.e)) {
            }
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public final void l(long j10, long j11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        k0.c(new bt(this, j10, j11, 1));
    }

    public final void m(int i10) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        k0.c(new gt(this, i10, 8));
    }

    public final void n(int i10) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences c10 = getAccountInstance().c();
            SharedPreferences.Editor edit = c10.edit();
            if (i10 == 2) {
                str = "channels";
            } else if (i10 == 0) {
                str = "groups";
            } else if (i10 == 3) {
                str = "stories";
            } else {
                if (i10 != 4 && i10 != 5) {
                    str = "private";
                }
                str = "reactions";
            }
            String string = c10.getString(str, null);
            if (string != null) {
                edit.remove(str).remove(str.concat("_s"));
                try {
                    m0.deleteNotificationChannel(string);
                } catch (Exception e) {
                    f8.g(e, true);
                }
                if (v2.a) {
                    f8.b("delete channel global internal ".concat(string));
                }
            }
            if (i10 == 2) {
                str2 = "channels_ia";
            } else if (i10 == 0) {
                str2 = "groups_ia";
            } else if (i10 == 3) {
                str2 = "stories_ia";
            } else {
                if (i10 != 4 && i10 != 5) {
                    str2 = "private_ia";
                }
                str2 = "reactions_ia";
            }
            String string2 = c10.getString(str2, null);
            if (string2 != null) {
                edit.remove(str2).remove(str2.concat("_s"));
                try {
                    m0.deleteNotificationChannel(string2);
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                if (v2.a) {
                    f8.b("delete channel global internal ".concat(string2));
                }
            }
            if (i10 == 2) {
                str3 = "overwrite_channel";
            } else if (i10 == 0) {
                str3 = "overwrite_group";
            } else if (i10 == 3) {
                str3 = "overwrite_stories";
            } else {
                if (i10 != 4 && i10 != 5) {
                    str3 = "overwrite_private";
                }
                str3 = "overwrite_reactions";
            }
            edit.remove(str3);
            edit.commit();
        } catch (Exception e10) {
            f8.g(e10, true);
        }
    }

    public final void o(long j10, long j11) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        try {
            SharedPreferences c10 = getAccountInstance().c();
            SharedPreferences.Editor edit = c10.edit();
            String str = "org.telegram.key" + j10;
            if (j11 != 0) {
                str = str + ".topic" + j11;
            }
            String string = c10.getString(str, null);
            if (string != null) {
                edit.remove(str).remove(str + "_s");
                try {
                    m0.deleteNotificationChannel(string);
                } catch (Exception e) {
                    f8.g(e, true);
                }
                if (v2.a) {
                    f8.b("delete channel internal ".concat(string));
                }
            }
            String str2 = "org.telegram.keyia" + j10;
            String string2 = c10.getString(str2, null);
            if (string2 != null) {
                edit.remove(str2).remove(str2 + "_s");
                try {
                    m0.deleteNotificationChannel(string2);
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                if (v2.a) {
                    f8.b("delete channel internal ".concat(string2));
                }
            }
            edit.commit();
        } catch (Exception e10) {
            f8.g(e10, true);
        }
    }

    public final void p() {
        a0.h hVar = this.h;
        f8.b("NotificationsController dismissNotification");
        try {
            l0.b(this.d0, null);
            this.a.clear();
            this.c.b();
            this.n.b();
            for (int i10 = 0; i10 < hVar.m(); i10++) {
                if (!this.y.contains(Long.valueOf(hVar.j(i10)))) {
                    l0.b(((Integer) hVar.n(i10)).intValue(), null);
                }
            }
            hVar.b();
            i0.g3(new ag.f3(26));
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    public final int u(long j10, long j11) {
        int c10 = this.g0.c(-1, j10, j11, "notify2_");
        if (c10 != 3 || this.g0.c(0, j10, j11, "notifyuntil_") < getConnectionsManager().getCurrentTime()) {
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
    
        return org.telegram.messenger.cd.K0(2131742977);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0252, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatWallPaper) == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x025b, code lost:
    
        return org.telegram.messenger.cd.K0(2131742979);
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
    
        return org.telegram.messenger.cd.Z(2131748061, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0286, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.TLRPC.TL_messageActionLoginUnknownLocation) == false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0288, code lost:
    
        r2 = org.telegram.messenger.cd.Z(2131742808, org.telegram.messenger.cd.D0().B0().format(r31.k.date * 1000), org.telegram.messenger.cd.D0().o0().format(r31.k.date * 1000));
        r3 = getUserConfig().f().first_name;
        r1 = r31.k.action;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02e5, code lost:
    
        return org.telegram.messenger.cd.Z(2131747943, r3, r2, r1.title, r1.address);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x031b, code lost:
    
        if (sf.d.g(r2, org.telegram.tgnet.TLRPC.TL_messageActionGameScore.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSent.class, org.telegram.tgnet.TLRPC.TL_messageActionPaymentSentMe.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGift.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftPremium.class, org.telegram.tgnet.TLRPC.TL_messageActionStarGiftUnique.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesPrice.class, org.telegram.tgnet.TLRPC.TL_messageActionPaidMessagesRefunded.class, org.telegram.tgnet.TLRPC.TL_messageActionGiftTon.class) == false) goto L187;
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
    
        return org.telegram.messenger.cd.K0(2131752610);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033f, code lost:
    
        return org.telegram.messenger.cd.K0(2131752617);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0342, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionConferenceCall) == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0346, code lost:
    
        if (r4.video == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x034f, code lost:
    
        return org.telegram.messenger.cd.K0(2131752612);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0357, code lost:
    
        return org.telegram.messenger.cd.K0(2131752619);
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
    
        return org.telegram.messenger.cd.Z(2131752521, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03b2, code lost:
    
        if (r6 != r26) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x03c5, code lost:
    
        return org.telegram.messenger.cd.Z(2131748033, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03c6, code lost:
    
        r1 = getMessagesController().Z1(java.lang.Long.valueOf(r6));
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
    
        return org.telegram.messenger.cd.Z(2131748048, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x040d, code lost:
    
        return org.telegram.messenger.cd.Z(2131748049, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0427, code lost:
    
        return org.telegram.messenger.cd.Z(2131748050, r3, y(r5), org.telegram.messenger.h20.p(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0428, code lost:
    
        r2 = new java.lang.StringBuilder();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0438, code lost:
    
        if (r6 >= r31.k.action.users.size()) goto L916;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x043a, code lost:
    
        r7 = getMessagesController().Z1(r31.k.action.users.get(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x044e, code lost:
    
        if (r7 == null) goto L918;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0450, code lost:
    
        r7 = org.telegram.messenger.h20.p(r7);
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
    
        return org.telegram.messenger.cd.Z(2131748050, r3, y(r5), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0482, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGroupCall) == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0486, code lost:
    
        if (r4.duration == 0) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0499, code lost:
    
        return org.telegram.messenger.cd.Z(2131748045, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04ab, code lost:
    
        return org.telegram.messenger.cd.Z(2131748046, r3, y(r5));
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
    
        return org.telegram.messenger.cd.Z(2131748041, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x04fd, code lost:
    
        r1 = getMessagesController().Z1(java.lang.Long.valueOf(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0509, code lost:
    
        if (r1 != null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0528, code lost:
    
        return org.telegram.messenger.cd.Z(2131748042, r3, y(r5), org.telegram.messenger.h20.p(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0529, code lost:
    
        r2 = new java.lang.StringBuilder();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0539, code lost:
    
        if (r6 >= r31.k.action.users.size()) goto L919;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x053b, code lost:
    
        r7 = getMessagesController().Z1(r31.k.action.users.get(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x054f, code lost:
    
        if (r7 == null) goto L921;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0551, code lost:
    
        r7 = org.telegram.messenger.h20.p(r7);
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
    
        return org.telegram.messenger.cd.Z(2131748042, r3, y(r5), r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0582, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionGiftCode) == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x058b, code lost:
    
        return org.telegram.messenger.cd.K0(2131753310);
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x058e, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatJoinedByLink) == false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x05a5, code lost:
    
        return org.telegram.messenger.cd.Z(2131748032, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x05ac, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChatEditTitle) == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x05bd, code lost:
    
        return org.telegram.messenger.cd.Z(2131748059, r3, r4.title);
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
    
        return org.telegram.messenger.cd.Z(2131748039, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x05f0, code lost:
    
        if (r6 != r12) goto L316;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0603, code lost:
    
        return org.telegram.messenger.cd.Z(2131748038, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0604, code lost:
    
        r1 = getMessagesController().Z1(java.lang.Long.valueOf(r31.k.action.user_id));
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0616, code lost:
    
        if (r1 != null) goto L319;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x0638, code lost:
    
        return org.telegram.messenger.cd.Z(2131748040, r3, y(r5), org.telegram.messenger.h20.p(r1));
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
    
        return org.telegram.messenger.cd.Z(2131754602, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x066b, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionChannelMigrateFrom) == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x0677, code lost:
    
        return org.telegram.messenger.cd.Z(2131754602, r4.title);
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
    
        if (org.telegram.messenger.w3.T(r5) == false) goto L363;
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
    
        return org.telegram.messenger.cd.Z(2131748104, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x06e0, code lost:
    
        if (r1.I3() == false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x06f3, code lost:
    
        return org.telegram.messenger.cd.Z(2131748107, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x06fb, code lost:
    
        if (r1.H4() == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0705, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x072d, code lost:
    
        return org.telegram.messenger.cd.Z(2131748083, r3, "📹 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0744, code lost:
    
        return org.telegram.messenger.cd.Z(2131748077, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0749, code lost:
    
        if (r1.q3() == false) goto L387;
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0753, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x077b, code lost:
    
        return org.telegram.messenger.cd.Z(2131748083, r3, "🎬 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0792, code lost:
    
        return org.telegram.messenger.cd.Z(2131748113, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x079c, code lost:
    
        if (r1.P4() == false) goto L391;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x07af, code lost:
    
        return org.telegram.messenger.cd.Z(2131748074, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x07b4, code lost:
    
        if (r1.h4() == false) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x07c7, code lost:
    
        return org.telegram.messenger.cd.Z(2131748092, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x07cc, code lost:
    
        if (r1.t4() != false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x07d2, code lost:
    
        if (r1.J2() == false) goto L400;
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
    
        return org.telegram.messenger.cd.Z(2131748083, r3, "📎 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0825, code lost:
    
        return org.telegram.messenger.cd.Z(2131748128, r3, y(r5));
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
    
        return org.telegram.messenger.cd.Z(2131748117, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0850, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0852, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0876, code lost:
    
        return org.telegram.messenger.cd.Z(2131748131, r3, y(r5), org.telegram.messenger.i5.n(r10.first_name, r10.last_name));
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
    
        return org.telegram.messenger.cd.Z(2131748095, r3, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x08c4, code lost:
    
        return org.telegram.messenger.cd.Z(2131748098, r3, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x08c7, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x08eb, code lost:
    
        return org.telegram.messenger.cd.Z(2131748080, r3, y(r5), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r10).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x08ee, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L441;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x08f6, code lost:
    
        if (android.text.TextUtils.isEmpty(r7.message) != false) goto L439;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x091e, code lost:
    
        return org.telegram.messenger.cd.Z(2131748083, r3, "🖼 " + r1.k.message, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0935, code lost:
    
        return org.telegram.messenger.cd.Z(2131748101, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x093d, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L445;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x0950, code lost:
    
        return org.telegram.messenger.cd.Z(2131748125, r3, y(r5));
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
    
        return org.telegram.messenger.cd.Z(2131748083, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0978, code lost:
    
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x099e, code lost:
    
        return org.telegram.messenger.cd.Z(2131748104, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x09b0, code lost:
    
        return org.telegram.messenger.cd.Z(2131748119, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x09b1, code lost:
    
        r1 = r1.W1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x09b5, code lost:
    
        if (r1 == null) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x09cc, code lost:
    
        return org.telegram.messenger.cd.Z(2131748087, r3, y(r5), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x09df, code lost:
    
        return org.telegram.messenger.cd.Z(2131748089, r3, y(r5));
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
    
        return org.telegram.messenger.cd.Z(2131748103, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x09fe, code lost:
    
        if (r1.I3() == false) goto L474;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0a0f, code lost:
    
        return org.telegram.messenger.cd.Z(2131748106, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0a17, code lost:
    
        if (r1.H4() == false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:449:0x0a21, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L480;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0a45, code lost:
    
        return org.telegram.messenger.cd.Z(2131748082, y(r5), "📹 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0a58, code lost:
    
        return org.telegram.messenger.cd.Z(2131748076, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x0a5d, code lost:
    
        if (r1.q3() == false) goto L490;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x0a67, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L488;
     */
    /* JADX WARN: Code restructure failed: missing block: B:459:0x0a8b, code lost:
    
        return org.telegram.messenger.cd.Z(2131748082, y(r5), "🎬 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:461:0x0a9e, code lost:
    
        return org.telegram.messenger.cd.Z(2131748112, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0aa6, code lost:
    
        if (r1.P4() == false) goto L494;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0ab7, code lost:
    
        return org.telegram.messenger.cd.Z(2131748073, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0abc, code lost:
    
        if (r1.h4() == false) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x0acd, code lost:
    
        return org.telegram.messenger.cd.Z(2131748091, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x0ad2, code lost:
    
        if (r1.t4() != false) goto L502;
     */
    /* JADX WARN: Code restructure failed: missing block: B:473:0x0ad8, code lost:
    
        if (r1.J2() == false) goto L503;
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
    
        return org.telegram.messenger.cd.Z(2131748082, y(r5), "📎 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0b23, code lost:
    
        return org.telegram.messenger.cd.Z(2131748127, y(r5));
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
    
        return org.telegram.messenger.cd.Z(2131748116, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x0b49, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0b4b, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0b6b, code lost:
    
        return org.telegram.messenger.cd.Z(2131748130, y(r5), org.telegram.messenger.i5.n(r10.first_name, r10.last_name));
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
    
        return org.telegram.messenger.cd.Z(2131748094, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0bb1, code lost:
    
        return org.telegram.messenger.cd.Z(2131748097, y(r5), r10.poll.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0bb4, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L536;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0bd4, code lost:
    
        return org.telegram.messenger.cd.Z(2131748079, y(r5), ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r10).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0bd7, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0bdf, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L542;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0c03, code lost:
    
        return org.telegram.messenger.cd.Z(2131748082, y(r5), "🖼 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0c16, code lost:
    
        return org.telegram.messenger.cd.Z(2131748100, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0c1c, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L548;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0c2d, code lost:
    
        return org.telegram.messenger.cd.Z(2131748124, y(r5));
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
    
        return org.telegram.messenger.cd.Z(2131748082, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0c55, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0c75, code lost:
    
        return org.telegram.messenger.cd.Z(2131748103, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0c85, code lost:
    
        return org.telegram.messenger.cd.Z(2131748118, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0c86, code lost:
    
        r1 = r1.W1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0c8a, code lost:
    
        if (r1 == null) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0c9e, code lost:
    
        return org.telegram.messenger.cd.Z(2131748086, y(r5), r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0cae, code lost:
    
        return org.telegram.messenger.cd.Z(2131748088, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0caf, code lost:
    
        r1 = r31.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0cb5, code lost:
    
        if (r1 != null) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0cbf, code lost:
    
        return org.telegram.messenger.cd.Z(2131748102, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0cc4, code lost:
    
        if (r1.I3() == false) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0cd1, code lost:
    
        return org.telegram.messenger.cd.Z(2131748105, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0cd9, code lost:
    
        if (r1.H4() == false) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0ce3, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L582;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0d03, code lost:
    
        return org.telegram.messenger.cd.Z(2131748081, r3, "📹 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0d12, code lost:
    
        return org.telegram.messenger.cd.Z(2131748075, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0d17, code lost:
    
        if (r1.q3() == false) goto L592;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0d21, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.k.message) != false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0d41, code lost:
    
        return org.telegram.messenger.cd.Z(2131748081, r3, "🎬 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0d50, code lost:
    
        return org.telegram.messenger.cd.Z(2131748111, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0d58, code lost:
    
        if (r1.P4() == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0d65, code lost:
    
        return org.telegram.messenger.cd.Z(2131748072, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0d6a, code lost:
    
        if (r1.h4() == false) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0d77, code lost:
    
        return org.telegram.messenger.cd.Z(2131748090, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0d7c, code lost:
    
        if (r1.t4() != false) goto L604;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x0d82, code lost:
    
        if (r1.J2() == false) goto L605;
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
    
        return org.telegram.messenger.cd.Z(2131748081, r3, "📎 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0dc5, code lost:
    
        return org.telegram.messenger.cd.Z(2131748126, r3);
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
    
        return org.telegram.messenger.cd.Z(2131748115, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0de9, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L626;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0deb, code lost:
    
        r10 = (org.telegram.tgnet.TLRPC.TL_messageMediaContact) r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0e05, code lost:
    
        return org.telegram.messenger.cd.Z(2131748129, r3, org.telegram.messenger.i5.n(r10.first_name, r10.last_name));
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
    
        return org.telegram.messenger.cd.Z(2131748093, r3, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0e3f, code lost:
    
        return org.telegram.messenger.cd.Z(2131748096, r3, r1.question.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0e42, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L638;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0e5e, code lost:
    
        return org.telegram.messenger.cd.Z(2131748078, r3, ((org.telegram.tgnet.TLRPC.TL_messageMediaToDo) r10).todo.title.text);
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0e61, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPhoto) == false) goto L646;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0e69, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.message) != false) goto L644;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x0e89, code lost:
    
        return org.telegram.messenger.cd.Z(2131748081, r3, "🖼 " + r1.k.message);
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0e98, code lost:
    
        return org.telegram.messenger.cd.Z(2131748099, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x0e9e, code lost:
    
        if ((r10 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L650;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x0eab, code lost:
    
        return org.telegram.messenger.cd.Z(2131748120, r3);
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
    
        return org.telegram.messenger.cd.Z(2131748081, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x0ed4, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:632:0x0eec, code lost:
    
        return org.telegram.messenger.cd.Z(2131748102, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x0ef8, code lost:
    
        return org.telegram.messenger.cd.Z(2131748114, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x0ef9, code lost:
    
        r1 = r1.W1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:638:0x0efd, code lost:
    
        if (r1 == null) goto L669;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0f0d, code lost:
    
        return org.telegram.messenger.cd.Z(2131748085, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x0f19, code lost:
    
        return org.telegram.messenger.cd.Z(2131748084, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x0f1c, code lost:
    
        if ((r4 instanceof org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) == false) goto L687;
     */
    /* JADX WARN: Code restructure failed: missing block: B:645:0x0f1e, code lost:
    
        r1 = sf.d.f(((org.telegram.tgnet.TLRPC.TL_messageActionSetChatTheme) r4).theme);
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x0f2a, code lost:
    
        if (android.text.TextUtils.isEmpty(r1) == false) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x0f2e, code lost:
    
        if (r28 != r26) goto L679;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x0f3a, code lost:
    
        return org.telegram.messenger.cd.Z(2131752201, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:652:0x0f4b, code lost:
    
        return org.telegram.messenger.cd.Z(2131752202, r3, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:654:0x0f50, code lost:
    
        if (r28 != r26) goto L685;
     */
    /* JADX WARN: Code restructure failed: missing block: B:656:0x0f5d, code lost:
    
        return org.telegram.messenger.cd.Z(2131752204, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0f6c, code lost:
    
        return org.telegram.messenger.cd.Z(2131752205, r3, r1);
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
        r1 = org.telegram.messenger.o5.o(r4.boost_peer);
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x0f86, code lost:
    
        if (r1 < 0) goto L696;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x0f88, code lost:
    
        r1 = org.telegram.messenger.h20.k(getMessagesController().Z1(java.lang.Long.valueOf(r1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x0fbe, code lost:
    
        return org.telegram.messenger.cd.J((int) r4.stars, "BoostingReceivedStars", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:670:0x0f99, code lost:
    
        r1 = getMessagesController().L0(java.lang.Long.valueOf(-r1));
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
    
        if (r31.I4() == false) goto L724;
     */
    /* JADX WARN: Code restructure failed: missing block: B:693:0x1005, code lost:
    
        return org.telegram.messenger.cd.Z(2131752265, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x1018, code lost:
    
        return org.telegram.messenger.cd.Z(2131752331, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:697:0x101f, code lost:
    
        if (r31.I4() == false) goto L730;
     */
    /* JADX WARN: Code restructure failed: missing block: B:699:0x1034, code lost:
    
        return org.telegram.messenger.cd.Z(2131748057, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x1048, code lost:
    
        return org.telegram.messenger.cd.Z(2131748058, r3, y(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x1054, code lost:
    
        return org.telegram.messenger.cd.Z(2131748062, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x1059, code lost:
    
        if (r31.F3() == false) goto L742;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x1063, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.k.message) != false) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x1069, code lost:
    
        return O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x106e, code lost:
    
        return org.telegram.messenger.cd.K0(2131748618);
     */
    /* JADX WARN: Code restructure failed: missing block: B:713:0x106f, code lost:
    
        r4 = 2131753948;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x1079, code lost:
    
        if (r31.D != 29) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x1081, code lost:
    
        if ((org.telegram.messenger.jj.n1(r31) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) == false) goto L776;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x1083, code lost:
    
        r1 = (org.telegram.tgnet.TLRPC.TL_messageMediaPaidMedia) org.telegram.messenger.jj.n1(r31);
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
    
        if (org.telegram.messenger.jj.K4(r7.document) == false) goto L755;
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
    
        r1 = org.telegram.messenger.cd.K0(r4);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x10e2, code lost:
    
        r2 = new java.lang.Object[1];
        r2[r4] = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x10ed, code lost:
    
        return org.telegram.messenger.cd.Z(2131753949, r2);
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
    
        r1 = org.telegram.messenger.cd.G(r2, r1, new java.lang.Object[0]);
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
    
        if (r31.S4() == false) goto L780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x10fb, code lost:
    
        return org.telegram.messenger.cd.K0(2131753951);
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x1100, code lost:
    
        if (r31.g4() == false) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x1109, code lost:
    
        return org.telegram.messenger.cd.K0(2131753950);
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
    
        return org.telegram.messenger.cd.K0(2131753977);
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x113f, code lost:
    
        return org.telegram.messenger.cd.K0(2131753948);
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1144, code lost:
    
        if (r31.H4() == false) goto L808;
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
    
        return org.telegram.messenger.cd.K0(2131753976);
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x1175, code lost:
    
        return org.telegram.messenger.cd.K0(2131753933);
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x117e, code lost:
    
        if ((org.telegram.messenger.jj.o1(r31.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGame) == false) goto L812;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x1187, code lost:
    
        return org.telegram.messenger.cd.K0(2131753972);
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x118c, code lost:
    
        if (r31.P4() == false) goto L816;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x1195, code lost:
    
        return org.telegram.messenger.cd.K0(2131753982);
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x119a, code lost:
    
        if (r31.h4() == false) goto L820;
     */
    /* JADX WARN: Code restructure failed: missing block: B:791:0x11a3, code lost:
    
        return org.telegram.messenger.cd.K0(2131753941);
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x11a8, code lost:
    
        if (r31.I3() == false) goto L824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x11b1, code lost:
    
        return org.telegram.messenger.cd.K0(2131753952);
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x11b2, code lost:
    
        r2 = r31.k;
        r3 = r2.media;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x11b8, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaContact) == false) goto L828;
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x11c1, code lost:
    
        return org.telegram.messenger.cd.K0(2131753979);
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x11c4, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaPoll) == false) goto L836;
     */
    /* JADX WARN: Code restructure failed: missing block: B:803:0x11cc, code lost:
    
        if (((org.telegram.tgnet.TLRPC.TL_messageMediaPoll) r3).poll.quiz == false) goto L834;
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x11d5, code lost:
    
        return org.telegram.messenger.cd.K0(2131746460);
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x11dd, code lost:
    
        return org.telegram.messenger.cd.K0(2131747200);
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x11e0, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaToDo) == false) goto L840;
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x11e9, code lost:
    
        return org.telegram.messenger.cd.K0(2131744134);
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x11ec, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaWidget) == false) goto L848;
     */
    /* JADX WARN: Code restructure failed: missing block: B:815:0x11f4, code lost:
    
        if (android.text.TextUtils.isEmpty(r2.message) == false) goto L846;
     */
    /* JADX WARN: Code restructure failed: missing block: B:817:0x11fd, code lost:
    
        return org.telegram.messenger.cd.K0(2131753926);
     */
    /* JADX WARN: Code restructure failed: missing block: B:819:0x1202, code lost:
    
        return O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:821:0x1205, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveaway) == false) goto L852;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x120e, code lost:
    
        return org.telegram.messenger.cd.K0(2131753492);
     */
    /* JADX WARN: Code restructure failed: missing block: B:825:0x1211, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaGiveawayResults) == false) goto L856;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x121a, code lost:
    
        return org.telegram.messenger.cd.K0(2131753392);
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
    
        return org.telegram.messenger.cd.K0(2131753966);
     */
    /* JADX WARN: Code restructure failed: missing block: B:837:0x1233, code lost:
    
        if ((r3 instanceof org.telegram.tgnet.TLRPC.TL_messageMediaDocument) == false) goto L892;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x1239, code lost:
    
        if (r31.t4() != false) goto L886;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x123f, code lost:
    
        if (r31.J2() == false) goto L872;
     */
    /* JADX WARN: Code restructure failed: missing block: B:843:0x1246, code lost:
    
        if (r31.q3() == false) goto L880;
     */
    /* JADX WARN: Code restructure failed: missing block: B:845:0x1250, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.k.message) != false) goto L878;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x1262, code lost:
    
        return "🎬 " + O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:849:0x126a, code lost:
    
        return org.telegram.messenger.cd.K0(2131753971);
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x1273, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.k.message) != false) goto L884;
     */
    /* JADX WARN: Code restructure failed: missing block: B:853:0x1285, code lost:
    
        return "📎 " + O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:855:0x128d, code lost:
    
        return org.telegram.messenger.cd.K0(2131753975);
     */
    /* JADX WARN: Code restructure failed: missing block: B:856:0x128e, code lost:
    
        r1 = r31.W1();
     */
    /* JADX WARN: Code restructure failed: missing block: B:857:0x1295, code lost:
    
        if (r1 == null) goto L890;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x1297, code lost:
    
        r1 = sc.e.i(r1, " ");
        r1.append(org.telegram.messenger.cd.K0(2131753936));
     */
    /* JADX WARN: Code restructure failed: missing block: B:859:0x12a8, code lost:
    
        return r1.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:861:0x12ad, code lost:
    
        return org.telegram.messenger.cd.K0(2131753936);
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
    
        return org.telegram.messenger.cd.Z(2131744614, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x12c0, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x12d5, code lost:
    
        return org.telegram.messenger.cd.K0(2131744753);
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x12dc, code lost:
    
        if (android.text.TextUtils.isEmpty(r31.v) != false) goto L908;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x12e2, code lost:
    
        return O(r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x12e7, code lost:
    
        return org.telegram.messenger.cd.K0(2131748618);
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x12ef, code lost:
    
        return org.telegram.messenger.cd.K0(2131753961);
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
    public final String w(jj jjVar, String[] strArr, boolean[] zArr) {
        boolean z10;
        long j10;
        String y3;
        long j11;
        TLRPC.Chat chat;
        TLRPC.MessageFwdHeader messageFwdHeader;
        TLRPC.Peer peer;
        TLRPC.MessageFwdHeader messageFwdHeader2;
        TLRPC.Peer peer2;
        if (i0.o2() || tz.C) {
            return cd.K0(2131748035);
        }
        TLRPC.Message message = jjVar.k;
        boolean z11 = jjVar.f;
        String str = jjVar.b;
        long j12 = message.dialog_id;
        TLRPC.Peer peer3 = message.peer_id;
        long j13 = peer3.chat_id;
        if (j13 == 0) {
            j13 = peer3.channel_id;
        }
        long j14 = peer3.user_id;
        zArr[0] = true;
        SharedPreferences c10 = getAccountInstance().c();
        boolean w9 = m5.w("content_preview_", j12, c10, true);
        if (jjVar.i3()) {
            if (j13 == 0 && j14 != 0) {
                if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = str;
                }
                if (!w9 || !c10.getBoolean("EnablePreviewAll", true)) {
                    zArr[0] = false;
                    return cd.K0(2131748618);
                }
            } else if (j13 != 0) {
                if (jjVar.k.peer_id.channel_id == 0 || jjVar.A4()) {
                    strArr[0] = jjVar.c;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = str;
                }
                if (!w9 || ((!z11 && !c10.getBoolean("EnablePreviewGroup", true)) || (z11 && !c10.getBoolean("EnablePreviewChannel", true)))) {
                    zArr[0] = false;
                    return (jjVar.k.peer_id.channel_id == 0 || jjVar.A4()) ? cd.Z(2131748006, jjVar.c, str) : cd.Z(2131752366, str);
                }
            }
            return O(jjVar);
        }
        long e = getUserConfig().e();
        if (j14 == 0) {
            j14 = jjVar.Z0();
            if (j14 == 0) {
                j14 = -j13;
            }
        } else if (j14 == e) {
            j14 = jjVar.Z0();
        }
        if (j12 == 0) {
            if (j13 != 0) {
                j12 = -j13;
            } else if (j14 != 0) {
                j12 = j14;
            }
        }
        if (h20.y(j12) && (messageFwdHeader2 = jjVar.k.fwd_from) != null && (peer2 = messageFwdHeader2.from_id) != null) {
            j14 = jj.C1(peer2);
        }
        if (j14 > 0) {
            z10 = w9;
            j10 = e;
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j14));
            if (Z1 != null) {
                y3 = h20.p(Z1);
                if (j13 != 0) {
                    strArr[0] = y3;
                } else if (Build.VERSION.SDK_INT > 27) {
                    strArr[0] = y3;
                } else {
                    strArr[0] = null;
                }
            }
            y3 = null;
        } else {
            z10 = w9;
            j10 = e;
            TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-j14));
            if (L0 != null) {
                y3 = y(L0);
                strArr[0] = y3;
            }
            y3 = null;
        }
        if (y3 != null && j14 > 0 && h20.y(j12) && (messageFwdHeader = jjVar.k.fwd_from) != null && (peer = messageFwdHeader.saved_from_peer) != null) {
            long C1 = jj.C1(peer);
            if (o5.z(C1)) {
                j11 = j12;
                TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(-C1));
                if (L02 != null) {
                    StringBuilder i10 = sc.e.i(y3, " @ ");
                    i10.append(y(L02));
                    y3 = i10.toString();
                    if (strArr[0] != null) {
                        strArr[0] = y3;
                    }
                }
                if (y3 != null) {
                    if (j13 != 0) {
                        chat = getMessagesController().L0(Long.valueOf(j13));
                        if (chat != null) {
                            if (w3.T(chat) && !chat.megagroup && Build.VERSION.SDK_INT <= 27) {
                                strArr[0] = null;
                            }
                        }
                    } else {
                        chat = null;
                    }
                    if (o5.C(j11)) {
                        strArr[0] = null;
                        return cd.K0(2131748035);
                    }
                    boolean z12 = w3.T(chat) && !chat.megagroup;
                    TLRPC.Message message2 = jjVar.k;
                    if (message2 != null && message2.rich_message != null) {
                        return jjVar.v.toString();
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
                    return cd.K0(2131748618);
                }
                return null;
            }
        }
        j11 = j12;
        if (y3 != null) {
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
    public final java.lang.String x(org.telegram.messenger.jj r31, boolean[] r32) {
        /*
            Method dump skipped, instructions count: 6149
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ot.x(org.telegram.messenger.jj, boolean[]):java.lang.String");
    }

    public final String y(TLRPC.Chat chat) {
        if (chat == null) {
            return null;
        }
        return chat.monoforum ? gg.e.i(this.currentAccount, chat, false) : chat.title;
    }

    public final int z() {
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            if (d20.i(i11).p() && (tz.Q0 || d20.s0 == i11)) {
                ot t10 = t(i11);
                if (t10.R) {
                    if (t10.T) {
                        if (t10.S) {
                            try {
                                ArrayList arrayList = new ArrayList(vp.r1(i11).y);
                                int size = arrayList.size();
                                for (int i12 = 0; i12 < size; i12++) {
                                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i12);
                                    if (dialog != null && o5.z(dialog.id)) {
                                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(-dialog.id));
                                        if (!w3.r0(L0)) {
                                            if (w3.Y(L0)) {
                                            }
                                        }
                                    }
                                    if (dialog != null) {
                                        i10 += vp.r1(i11).U0(dialog);
                                    }
                                }
                            } catch (Exception e) {
                                f8.g(e, true);
                            }
                        } else {
                            i10 += t10.I;
                        }
                    } else if (t10.S) {
                        try {
                            int size2 = vp.r1(i11).y.size();
                            for (int i13 = 0; i13 < size2; i13++) {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) vp.r1(i11).y.get(i13);
                                if (o5.z(dialog2.id)) {
                                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(-dialog2.id));
                                    if (!w3.r0(L02)) {
                                        if (w3.Y(L02)) {
                                        }
                                    }
                                }
                                if (vp.r1(i11).U0(dialog2) != 0) {
                                    i10++;
                                }
                            }
                        } catch (Exception e7) {
                            f8.g(e7, false);
                        }
                    } else {
                        i10 += t10.f.m();
                    }
                }
            }
        }
        return i10;
    }
}
