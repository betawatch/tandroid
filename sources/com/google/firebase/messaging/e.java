package com.google.firebase.messaging;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class e {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(75:0|1|(3:2|3|(1:5))|231|7|8|(3:207|208|(73:210|(66:212|(1:214)|11|(1:13)|14|(1:16)|17|(57:19|(1:193)|23|(1:25)|26|(1:28)(2:183|(1:188)(1:187))|29|(1:31)|32|(1:34)(5:171|(1:173)|174|(1:176)(1:182)|(1:178)(2:179|(1:181)))|35|(1:37)(6:153|(4:156|(2:164|165)(1:162)|163|154)|166|167|(1:169)|170)|38|(1:40)(1:152)|(1:42)|43|(39:148|149|(1:49)|50|(1:52)|53|(33:139|(1:143)|(1:57)|58|(29:134|(1:138)|(1:62)|63|(25:131|(1:133)|(1:67)|68|(21:127|128|(1:72)|73|(3:117|118|(18:120|(1:122)|123|(1:77)|78|(4:102|103|104|(2:106|(12:108|(3:82|(1:85)|86)|87|(1:89)|90|(1:92)|93|(1:95)|96|(1:98)|99|100)(2:109|110))(2:111|112))|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(2:124|125))|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|45|(39:144|145|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|194|(2:202|203)|(1:201)|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|215|(69:217|(1:219)|11|(0)|14|(0)|17|(0)|194|(1:196)|202|203|(1:199)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(1:227)|220|(3:222|(1:224)(1:226)|225)|11|(0)|14|(0)|17|(0)|194|(0)|202|203|(0)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100))|10|11|(0)|14|(0)|17|(0)|194|(0)|202|203|(0)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100) */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x015e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x015f, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0434 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0312 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x053a  */
    /* JADX WARN: Type inference failed for: r0v103, types: [int] */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static i a(FirebaseMessagingService firebaseMessagingService, ya.c cVar) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        String S;
        String S2;
        String W;
        int i10;
        String W2;
        Uri defaultUri;
        String W3;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String W4;
        Integer valueOf;
        String W5;
        Integer L;
        Integer L2;
        Integer L3;
        String W6;
        Long valueOf2;
        JSONArray N;
        long[] jArr;
        JSONArray N2;
        int[] iArr;
        ?? r02;
        String W7;
        int i11;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle2 = bundle;
        String W8 = cVar.W("gcm.n.android_channel_id");
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(W8)) {
                    if (notificationManager.getNotificationChannel(W8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + W8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.q qVar = new e0.q(firebaseMessagingService, W8);
                    S = cVar.S(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(S)) {
                        qVar.g(S);
                    }
                    S2 = cVar.S(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(S2)) {
                        qVar.f(S2);
                        e0.l lVar = new e0.l(false);
                        lVar.f = e0.q.d(S2);
                        qVar.n(lVar);
                    }
                    W = cVar.W("gcm.n.icon");
                    if (!TextUtils.isEmpty(W)) {
                        i10 = resources.getIdentifier(W, "drawable", packageName);
                        if ((i10 == 0 || !b(resources, i10)) && ((i10 = resources.getIdentifier(W, "mipmap", packageName)) == 0 || !b(resources, i10))) {
                            Log.w("FirebaseMessaging", "Icon resource " + W + " not found. Notification will use default icon.");
                        }
                        qVar.E.icon = i10;
                        W2 = cVar.W("gcm.n.sound2");
                        if (TextUtils.isEmpty(W2)) {
                            W2 = cVar.W("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(W2)) {
                            defaultUri = null;
                        } else if ("default".equals(W2) || resources.getIdentifier(W2, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + W2);
                        }
                        if (defaultUri != null) {
                            Notification notification = qVar.E;
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = e0.p.a(e0.p.e(e0.p.c(e0.p.b(), 4), 5));
                        }
                        W3 = cVar.W("gcm.n.click_action");
                        if (TextUtils.isEmpty(W3)) {
                            String W9 = cVar.W("gcm.n.link_android");
                            if (TextUtils.isEmpty(W9)) {
                                W9 = cVar.W("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(W9) ? Uri.parse(W9) : null;
                            if (parse != null) {
                                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                                launchIntentForPackage.setPackage(packageName);
                                launchIntentForPackage.setData(parse);
                            } else {
                                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                                if (launchIntentForPackage == null) {
                                    Log.w("FirebaseMessaging", "No activity found to launch app");
                                }
                            }
                        } else {
                            launchIntentForPackage = new Intent(W3);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(TLObject.FLAG_28);
                        }
                        AtomicInteger atomicInteger = a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = (Bundle) cVar.b;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (cVar.K("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", cVar.c0());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
                        qVar.g = activity;
                        broadcast = !cVar.K("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.c0())), 1140850688);
                        if (broadcast != null) {
                            qVar.E.deleteIntent = broadcast;
                        }
                        W4 = cVar.W("gcm.n.color");
                        if (!TextUtils.isEmpty(W4)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(W4));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + W4 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                qVar.w = valueOf.intValue();
                            }
                            qVar.h(16, !cVar.K("gcm.n.sticky"));
                            qVar.t = cVar.K("gcm.n.local_only");
                            W5 = cVar.W("gcm.n.ticker");
                            if (W5 != null) {
                                qVar.p(W5);
                            }
                            L = cVar.L("gcm.n.notification_priority");
                            if (L != null) {
                                if (L.intValue() < -2 || L.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + L + ". Skipping setting notificationPriority.");
                                }
                                if (L != null) {
                                    qVar.j = L.intValue();
                                }
                                L2 = cVar.L("gcm.n.visibility");
                                if (L2 != null) {
                                    if (L2.intValue() < -1 || L2.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + L2 + ". Skipping setting visibility.");
                                    }
                                    if (L2 != null) {
                                        qVar.x = L2.intValue();
                                    }
                                    L3 = cVar.L("gcm.n.notification_count");
                                    if (L3 != null) {
                                        if (L3.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + L3 + ". Skipping setting notificationCount.");
                                        }
                                        if (L3 != null) {
                                            qVar.i = L3.intValue();
                                        }
                                        W6 = cVar.W("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(W6)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(W6));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + ya.c.g0("gcm.n.event_time") + "(" + W6 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                qVar.k = true;
                                                qVar.E.when = valueOf2.longValue();
                                            }
                                            N = cVar.N("gcm.n.vibrate_timings");
                                            if (N != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused3) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + N + ". Skipping setting vibrateTimings.");
                                                }
                                                if (N.length() <= 1) {
                                                    throw new JSONException("vibrateTimings have invalid length");
                                                }
                                                int length = N.length();
                                                jArr = new long[length];
                                                for (int i13 = 0; i13 < length; i13++) {
                                                    jArr[i13] = N.optLong(i13);
                                                }
                                                if (jArr != null) {
                                                    qVar.E.vibrate = jArr;
                                                }
                                                N2 = cVar.N("gcm.n.light_settings");
                                                if (N2 != null) {
                                                    int[] iArr2 = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e7) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + N2 + ". " + e7.getMessage() + ". Skipping setting LightSettings");
                                                    } catch (JSONException unused4) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + N2 + ". Skipping setting LightSettings");
                                                    }
                                                    if (N2.length() != 3) {
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    int parseColor = Color.parseColor(N2.optString(0));
                                                    if (parseColor == -16777216) {
                                                        throw new IllegalArgumentException("Transparent color is invalid");
                                                    }
                                                    iArr2[0] = parseColor;
                                                    iArr2[1] = N2.optInt(1);
                                                    iArr2[2] = N2.optInt(2);
                                                    iArr = iArr2;
                                                    if (iArr != null) {
                                                        int i14 = iArr[0];
                                                        int i15 = iArr[1];
                                                        int i16 = iArr[2];
                                                        Notification notification2 = qVar.E;
                                                        notification2.ledARGB = i14;
                                                        notification2.ledOnMS = i15;
                                                        notification2.ledOffMS = i16;
                                                        if (i15 != 0 && i16 != 0) {
                                                            i12 = 1;
                                                        }
                                                        notification2.flags = (notification2.flags & (-2)) | i12;
                                                    }
                                                    boolean K = cVar.K("gcm.n.default_sound");
                                                    boolean z10 = K;
                                                    if (cVar.K("gcm.n.default_vibrate_timings")) {
                                                        z10 = (K ? 1 : 0) | 2;
                                                    }
                                                    r02 = z10;
                                                    if (cVar.K("gcm.n.default_light_settings")) {
                                                        r02 = (z10 ? 1 : 0) | 4;
                                                    }
                                                    Notification notification3 = qVar.E;
                                                    notification3.defaults = r02;
                                                    if ((r02 & 4) != 0) {
                                                        notification3.flags |= 1;
                                                    }
                                                    W7 = cVar.W("gcm.n.tag");
                                                    if (TextUtils.isEmpty(W7)) {
                                                        W7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    return new i(qVar, W7);
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean K2 = cVar.K("gcm.n.default_sound");
                                                boolean z102 = K2;
                                                if (cVar.K("gcm.n.default_vibrate_timings")) {
                                                }
                                                r02 = z102;
                                                if (cVar.K("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification32 = qVar.E;
                                                notification32.defaults = r02;
                                                if ((r02 & 4) != 0) {
                                                }
                                                W7 = cVar.W("gcm.n.tag");
                                                if (TextUtils.isEmpty(W7)) {
                                                }
                                                return new i(qVar, W7);
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            N2 = cVar.N("gcm.n.light_settings");
                                            if (N2 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean K22 = cVar.K("gcm.n.default_sound");
                                            boolean z1022 = K22;
                                            if (cVar.K("gcm.n.default_vibrate_timings")) {
                                            }
                                            r02 = z1022;
                                            if (cVar.K("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification322 = qVar.E;
                                            notification322.defaults = r02;
                                            if ((r02 & 4) != 0) {
                                            }
                                            W7 = cVar.W("gcm.n.tag");
                                            if (TextUtils.isEmpty(W7)) {
                                            }
                                            return new i(qVar, W7);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        N = cVar.N("gcm.n.vibrate_timings");
                                        if (N != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        N2 = cVar.N("gcm.n.light_settings");
                                        if (N2 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean K222 = cVar.K("gcm.n.default_sound");
                                        boolean z10222 = K222;
                                        if (cVar.K("gcm.n.default_vibrate_timings")) {
                                        }
                                        r02 = z10222;
                                        if (cVar.K("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification3222 = qVar.E;
                                        notification3222.defaults = r02;
                                        if ((r02 & 4) != 0) {
                                        }
                                        W7 = cVar.W("gcm.n.tag");
                                        if (TextUtils.isEmpty(W7)) {
                                        }
                                        return new i(qVar, W7);
                                    }
                                    L3 = null;
                                    if (L3 != null) {
                                    }
                                    W6 = cVar.W("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(W6)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    N = cVar.N("gcm.n.vibrate_timings");
                                    if (N != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    N2 = cVar.N("gcm.n.light_settings");
                                    if (N2 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean K2222 = cVar.K("gcm.n.default_sound");
                                    boolean z102222 = K2222;
                                    if (cVar.K("gcm.n.default_vibrate_timings")) {
                                    }
                                    r02 = z102222;
                                    if (cVar.K("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification32222 = qVar.E;
                                    notification32222.defaults = r02;
                                    if ((r02 & 4) != 0) {
                                    }
                                    W7 = cVar.W("gcm.n.tag");
                                    if (TextUtils.isEmpty(W7)) {
                                    }
                                    return new i(qVar, W7);
                                }
                                L2 = null;
                                if (L2 != null) {
                                }
                                L3 = cVar.L("gcm.n.notification_count");
                                if (L3 != null) {
                                }
                                L3 = null;
                                if (L3 != null) {
                                }
                                W6 = cVar.W("gcm.n.event_time");
                                if (!TextUtils.isEmpty(W6)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                N = cVar.N("gcm.n.vibrate_timings");
                                if (N != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                N2 = cVar.N("gcm.n.light_settings");
                                if (N2 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean K22222 = cVar.K("gcm.n.default_sound");
                                boolean z1022222 = K22222;
                                if (cVar.K("gcm.n.default_vibrate_timings")) {
                                }
                                r02 = z1022222;
                                if (cVar.K("gcm.n.default_light_settings")) {
                                }
                                Notification notification322222 = qVar.E;
                                notification322222.defaults = r02;
                                if ((r02 & 4) != 0) {
                                }
                                W7 = cVar.W("gcm.n.tag");
                                if (TextUtils.isEmpty(W7)) {
                                }
                                return new i(qVar, W7);
                            }
                            L = null;
                            if (L != null) {
                            }
                            L2 = cVar.L("gcm.n.visibility");
                            if (L2 != null) {
                            }
                            L2 = null;
                            if (L2 != null) {
                            }
                            L3 = cVar.L("gcm.n.notification_count");
                            if (L3 != null) {
                            }
                            L3 = null;
                            if (L3 != null) {
                            }
                            W6 = cVar.W("gcm.n.event_time");
                            if (!TextUtils.isEmpty(W6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            N = cVar.N("gcm.n.vibrate_timings");
                            if (N != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            N2 = cVar.N("gcm.n.light_settings");
                            if (N2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean K222222 = cVar.K("gcm.n.default_sound");
                            boolean z10222222 = K222222;
                            if (cVar.K("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z10222222;
                            if (cVar.K("gcm.n.default_light_settings")) {
                            }
                            Notification notification3222222 = qVar.E;
                            notification3222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            W7 = cVar.W("gcm.n.tag");
                            if (TextUtils.isEmpty(W7)) {
                            }
                            return new i(qVar, W7);
                        }
                        i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i11 != 0) {
                            try {
                                valueOf = Integer.valueOf(firebaseMessagingService.getColor(i11));
                            } catch (Resources.NotFoundException unused5) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            qVar.h(16, !cVar.K("gcm.n.sticky"));
                            qVar.t = cVar.K("gcm.n.local_only");
                            W5 = cVar.W("gcm.n.ticker");
                            if (W5 != null) {
                            }
                            L = cVar.L("gcm.n.notification_priority");
                            if (L != null) {
                            }
                            L = null;
                            if (L != null) {
                            }
                            L2 = cVar.L("gcm.n.visibility");
                            if (L2 != null) {
                            }
                            L2 = null;
                            if (L2 != null) {
                            }
                            L3 = cVar.L("gcm.n.notification_count");
                            if (L3 != null) {
                            }
                            L3 = null;
                            if (L3 != null) {
                            }
                            W6 = cVar.W("gcm.n.event_time");
                            if (!TextUtils.isEmpty(W6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            N = cVar.N("gcm.n.vibrate_timings");
                            if (N != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            N2 = cVar.N("gcm.n.light_settings");
                            if (N2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean K2222222 = cVar.K("gcm.n.default_sound");
                            boolean z102222222 = K2222222;
                            if (cVar.K("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z102222222;
                            if (cVar.K("gcm.n.default_light_settings")) {
                            }
                            Notification notification32222222 = qVar.E;
                            notification32222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            W7 = cVar.W("gcm.n.tag");
                            if (TextUtils.isEmpty(W7)) {
                            }
                            return new i(qVar, W7);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        qVar.h(16, !cVar.K("gcm.n.sticky"));
                        qVar.t = cVar.K("gcm.n.local_only");
                        W5 = cVar.W("gcm.n.ticker");
                        if (W5 != null) {
                        }
                        L = cVar.L("gcm.n.notification_priority");
                        if (L != null) {
                        }
                        L = null;
                        if (L != null) {
                        }
                        L2 = cVar.L("gcm.n.visibility");
                        if (L2 != null) {
                        }
                        L2 = null;
                        if (L2 != null) {
                        }
                        L3 = cVar.L("gcm.n.notification_count");
                        if (L3 != null) {
                        }
                        L3 = null;
                        if (L3 != null) {
                        }
                        W6 = cVar.W("gcm.n.event_time");
                        if (!TextUtils.isEmpty(W6)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        N = cVar.N("gcm.n.vibrate_timings");
                        if (N != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        N2 = cVar.N("gcm.n.light_settings");
                        if (N2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean K22222222 = cVar.K("gcm.n.default_sound");
                        boolean z1022222222 = K22222222;
                        if (cVar.K("gcm.n.default_vibrate_timings")) {
                        }
                        r02 = z1022222222;
                        if (cVar.K("gcm.n.default_light_settings")) {
                        }
                        Notification notification322222222 = qVar.E;
                        notification322222222.defaults = r02;
                        if ((r02 & 4) != 0) {
                        }
                        W7 = cVar.W("gcm.n.tag");
                        if (TextUtils.isEmpty(W7)) {
                        }
                        return new i(qVar, W7);
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i10 != 0 || !b(resources, i10)) {
                        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i10 != 0 || !b(resources, i10)) {
                        i10 = 17301651;
                    }
                    qVar.E.icon = i10;
                    W2 = cVar.W("gcm.n.sound2");
                    if (TextUtils.isEmpty(W2)) {
                    }
                    if (TextUtils.isEmpty(W2)) {
                    }
                    if (defaultUri != null) {
                    }
                    W3 = cVar.W("gcm.n.click_action");
                    if (TextUtils.isEmpty(W3)) {
                    }
                    AtomicInteger atomicInteger2 = a;
                    if (launchIntentForPackage == null) {
                    }
                    qVar.g = activity;
                    if (!cVar.K("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    W4 = cVar.W("gcm.n.color");
                    if (!TextUtils.isEmpty(W4)) {
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i11 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    qVar.h(16, !cVar.K("gcm.n.sticky"));
                    qVar.t = cVar.K("gcm.n.local_only");
                    W5 = cVar.W("gcm.n.ticker");
                    if (W5 != null) {
                    }
                    L = cVar.L("gcm.n.notification_priority");
                    if (L != null) {
                    }
                    L = null;
                    if (L != null) {
                    }
                    L2 = cVar.L("gcm.n.visibility");
                    if (L2 != null) {
                    }
                    L2 = null;
                    if (L2 != null) {
                    }
                    L3 = cVar.L("gcm.n.notification_count");
                    if (L3 != null) {
                    }
                    L3 = null;
                    if (L3 != null) {
                    }
                    W6 = cVar.W("gcm.n.event_time");
                    if (!TextUtils.isEmpty(W6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    N = cVar.N("gcm.n.vibrate_timings");
                    if (N != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    N2 = cVar.N("gcm.n.light_settings");
                    if (N2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean K222222222 = cVar.K("gcm.n.default_sound");
                    boolean z10222222222 = K222222222;
                    if (cVar.K("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z10222222222;
                    if (cVar.K("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222222222 = qVar.E;
                    notification3222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    W7 = cVar.W("gcm.n.tag");
                    if (TextUtils.isEmpty(W7)) {
                    }
                    return new i(qVar, W7);
                }
                W8 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(W8)) {
                    if (notificationManager.getNotificationChannel(W8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.q qVar2 = new e0.q(firebaseMessagingService, W8);
                    S = cVar.S(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(S)) {
                    }
                    S2 = cVar.S(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(S2)) {
                    }
                    W = cVar.W("gcm.n.icon");
                    if (!TextUtils.isEmpty(W)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i10 != 0) {
                    }
                    i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i10 != 0) {
                    }
                    i10 = 17301651;
                    qVar2.E.icon = i10;
                    W2 = cVar.W("gcm.n.sound2");
                    if (TextUtils.isEmpty(W2)) {
                    }
                    if (TextUtils.isEmpty(W2)) {
                    }
                    if (defaultUri != null) {
                    }
                    W3 = cVar.W("gcm.n.click_action");
                    if (TextUtils.isEmpty(W3)) {
                    }
                    AtomicInteger atomicInteger22 = a;
                    if (launchIntentForPackage == null) {
                    }
                    qVar2.g = activity;
                    if (!cVar.K("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    W4 = cVar.W("gcm.n.color");
                    if (!TextUtils.isEmpty(W4)) {
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i11 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    qVar2.h(16, !cVar.K("gcm.n.sticky"));
                    qVar2.t = cVar.K("gcm.n.local_only");
                    W5 = cVar.W("gcm.n.ticker");
                    if (W5 != null) {
                    }
                    L = cVar.L("gcm.n.notification_priority");
                    if (L != null) {
                    }
                    L = null;
                    if (L != null) {
                    }
                    L2 = cVar.L("gcm.n.visibility");
                    if (L2 != null) {
                    }
                    L2 = null;
                    if (L2 != null) {
                    }
                    L3 = cVar.L("gcm.n.notification_count");
                    if (L3 != null) {
                    }
                    L3 = null;
                    if (L3 != null) {
                    }
                    W6 = cVar.W("gcm.n.event_time");
                    if (!TextUtils.isEmpty(W6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    N = cVar.N("gcm.n.vibrate_timings");
                    if (N != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    N2 = cVar.N("gcm.n.light_settings");
                    if (N2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean K2222222222 = cVar.K("gcm.n.default_sound");
                    boolean z102222222222 = K2222222222;
                    if (cVar.K("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z102222222222;
                    if (cVar.K("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222222222 = qVar2.E;
                    notification32222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    W7 = cVar.W("gcm.n.tag");
                    if (TextUtils.isEmpty(W7)) {
                    }
                    return new i(qVar2, W7);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                W8 = "fcm_fallback_notification_channel";
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = firebaseMessagingService.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                }
                packageName = firebaseMessagingService.getPackageName();
                Resources resources22 = firebaseMessagingService.getResources();
                packageManager = firebaseMessagingService.getPackageManager();
                e0.q qVar22 = new e0.q(firebaseMessagingService, W8);
                S = cVar.S(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(S)) {
                }
                S2 = cVar.S(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(S2)) {
                }
                W = cVar.W("gcm.n.icon");
                if (!TextUtils.isEmpty(W)) {
                }
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i10 != 0) {
                }
                i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i10 != 0) {
                }
                i10 = 17301651;
                qVar22.E.icon = i10;
                W2 = cVar.W("gcm.n.sound2");
                if (TextUtils.isEmpty(W2)) {
                }
                if (TextUtils.isEmpty(W2)) {
                }
                if (defaultUri != null) {
                }
                W3 = cVar.W("gcm.n.click_action");
                if (TextUtils.isEmpty(W3)) {
                }
                AtomicInteger atomicInteger222 = a;
                if (launchIntentForPackage == null) {
                }
                qVar22.g = activity;
                if (!cVar.K("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                W4 = cVar.W("gcm.n.color");
                if (!TextUtils.isEmpty(W4)) {
                }
                i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i11 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                qVar22.h(16, !cVar.K("gcm.n.sticky"));
                qVar22.t = cVar.K("gcm.n.local_only");
                W5 = cVar.W("gcm.n.ticker");
                if (W5 != null) {
                }
                L = cVar.L("gcm.n.notification_priority");
                if (L != null) {
                }
                L = null;
                if (L != null) {
                }
                L2 = cVar.L("gcm.n.visibility");
                if (L2 != null) {
                }
                L2 = null;
                if (L2 != null) {
                }
                L3 = cVar.L("gcm.n.notification_count");
                if (L3 != null) {
                }
                L3 = null;
                if (L3 != null) {
                }
                W6 = cVar.W("gcm.n.event_time");
                if (!TextUtils.isEmpty(W6)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                N = cVar.N("gcm.n.vibrate_timings");
                if (N != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                N2 = cVar.N("gcm.n.light_settings");
                if (N2 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean K22222222222 = cVar.K("gcm.n.default_sound");
                boolean z1022222222222 = K22222222222;
                if (cVar.K("gcm.n.default_vibrate_timings")) {
                }
                r02 = z1022222222222;
                if (cVar.K("gcm.n.default_light_settings")) {
                }
                Notification notification322222222222 = qVar22.E;
                notification322222222222.defaults = r02;
                if ((r02 & 4) != 0) {
                }
                W7 = cVar.W("gcm.n.tag");
                if (TextUtils.isEmpty(W7)) {
                }
                return new i(qVar22, W7);
            }
        }
        W8 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        e0.q qVar222 = new e0.q(firebaseMessagingService, W8);
        S = cVar.S(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(S)) {
        }
        S2 = cVar.S(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(S2)) {
        }
        W = cVar.W("gcm.n.icon");
        if (!TextUtils.isEmpty(W)) {
        }
        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 != 0) {
        }
        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i10 != 0) {
        }
        i10 = 17301651;
        qVar222.E.icon = i10;
        W2 = cVar.W("gcm.n.sound2");
        if (TextUtils.isEmpty(W2)) {
        }
        if (TextUtils.isEmpty(W2)) {
        }
        if (defaultUri != null) {
        }
        W3 = cVar.W("gcm.n.click_action");
        if (TextUtils.isEmpty(W3)) {
        }
        AtomicInteger atomicInteger2222 = a;
        if (launchIntentForPackage == null) {
        }
        qVar222.g = activity;
        if (!cVar.K("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        W4 = cVar.W("gcm.n.color");
        if (!TextUtils.isEmpty(W4)) {
        }
        i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i11 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        qVar222.h(16, !cVar.K("gcm.n.sticky"));
        qVar222.t = cVar.K("gcm.n.local_only");
        W5 = cVar.W("gcm.n.ticker");
        if (W5 != null) {
        }
        L = cVar.L("gcm.n.notification_priority");
        if (L != null) {
        }
        L = null;
        if (L != null) {
        }
        L2 = cVar.L("gcm.n.visibility");
        if (L2 != null) {
        }
        L2 = null;
        if (L2 != null) {
        }
        L3 = cVar.L("gcm.n.notification_count");
        if (L3 != null) {
        }
        L3 = null;
        if (L3 != null) {
        }
        W6 = cVar.W("gcm.n.event_time");
        if (!TextUtils.isEmpty(W6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        N = cVar.N("gcm.n.vibrate_timings");
        if (N != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        N2 = cVar.N("gcm.n.light_settings");
        if (N2 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean K222222222222 = cVar.K("gcm.n.default_sound");
        boolean z10222222222222 = K222222222222;
        if (cVar.K("gcm.n.default_vibrate_timings")) {
        }
        r02 = z10222222222222;
        if (cVar.K("gcm.n.default_light_settings")) {
        }
        Notification notification3222222222222 = qVar222.E;
        notification3222222222222.defaults = r02;
        if ((r02 & 4) != 0) {
        }
        W7 = cVar.W("gcm.n.tag");
        if (TextUtils.isEmpty(W7)) {
        }
        return new i(qVar222, W7);
    }

    public static boolean b(Resources resources, int i10) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i10, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i10);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i10 + ", treating it as an invalid icon");
            return false;
        }
    }
}
