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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
    /* JADX WARN: Removed duplicated region for block: B:102:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0432 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0310 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02aa  */
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
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0538  */
    /* JADX WARN: Type inference failed for: r0v103, types: [int] */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j a(FirebaseMessagingService firebaseMessagingService, android.support.v4.media.c cVar) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        String d;
        String d10;
        String e7;
        int i10;
        String e10;
        Uri defaultUri;
        String e11;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String e12;
        Integer valueOf;
        String e13;
        Integer b10;
        Integer b11;
        Integer b12;
        String e14;
        Long valueOf2;
        JSONArray c10;
        long[] jArr;
        JSONArray c11;
        int[] iArr;
        ?? r02;
        String e15;
        int i11;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e16) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e16);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle2 = bundle;
        String e17 = cVar.e("gcm.n.android_channel_id");
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(e17)) {
                    if (notificationManager.getNotificationChannel(e17) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + e17 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.r rVar = new e0.r(firebaseMessagingService, e17);
                    d = cVar.d(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d)) {
                        rVar.g(d);
                    }
                    d10 = cVar.d(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d10)) {
                        rVar.f(d10);
                        e0.m mVar = new e0.m(false);
                        mVar.f = e0.r.d(d10);
                        rVar.n(mVar);
                    }
                    e7 = cVar.e("gcm.n.icon");
                    if (!TextUtils.isEmpty(e7)) {
                        i10 = resources.getIdentifier(e7, "drawable", packageName);
                        if ((i10 == 0 || !b(resources, i10)) && ((i10 = resources.getIdentifier(e7, "mipmap", packageName)) == 0 || !b(resources, i10))) {
                            Log.w("FirebaseMessaging", "Icon resource " + e7 + " not found. Notification will use default icon.");
                        }
                        rVar.E.icon = i10;
                        e10 = cVar.e("gcm.n.sound2");
                        if (TextUtils.isEmpty(e10)) {
                            e10 = cVar.e("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(e10)) {
                            defaultUri = null;
                        } else if ("default".equals(e10) || resources.getIdentifier(e10, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + e10);
                        }
                        if (defaultUri != null) {
                            Notification notification = rVar.E;
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = e0.q.a(e0.q.e(e0.q.c(e0.q.b(), 4), 5));
                        }
                        e11 = cVar.e("gcm.n.click_action");
                        if (TextUtils.isEmpty(e11)) {
                            String e18 = cVar.e("gcm.n.link_android");
                            if (TextUtils.isEmpty(e18)) {
                                e18 = cVar.e("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(e18) ? Uri.parse(e18) : null;
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
                            launchIntentForPackage = new Intent(e11);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(TLObject.FLAG_28);
                        }
                        AtomicInteger atomicInteger = a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = cVar.a;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (cVar.a("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", cVar.g());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
                        rVar.g = activity;
                        broadcast = !cVar.a("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.g())), 1140850688);
                        if (broadcast != null) {
                            rVar.E.deleteIntent = broadcast;
                        }
                        e12 = cVar.e("gcm.n.color");
                        if (!TextUtils.isEmpty(e12)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(e12));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + e12 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                rVar.w = valueOf.intValue();
                            }
                            rVar.h(16, !cVar.a("gcm.n.sticky"));
                            rVar.t = cVar.a("gcm.n.local_only");
                            e13 = cVar.e("gcm.n.ticker");
                            if (e13 != null) {
                                rVar.p(e13);
                            }
                            b10 = cVar.b("gcm.n.notification_priority");
                            if (b10 != null) {
                                if (b10.intValue() < -2 || b10.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + b10 + ". Skipping setting notificationPriority.");
                                }
                                if (b10 != null) {
                                    rVar.j = b10.intValue();
                                }
                                b11 = cVar.b("gcm.n.visibility");
                                if (b11 != null) {
                                    if (b11.intValue() < -1 || b11.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + b11 + ". Skipping setting visibility.");
                                    }
                                    if (b11 != null) {
                                        rVar.x = b11.intValue();
                                    }
                                    b12 = cVar.b("gcm.n.notification_count");
                                    if (b12 != null) {
                                        if (b12.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + b12 + ". Skipping setting notificationCount.");
                                        }
                                        if (b12 != null) {
                                            rVar.i = b12.intValue();
                                        }
                                        e14 = cVar.e("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(e14)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(e14));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + android.support.v4.media.c.k("gcm.n.event_time") + "(" + e14 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                rVar.k = true;
                                                rVar.E.when = valueOf2.longValue();
                                            }
                                            c10 = cVar.c("gcm.n.vibrate_timings");
                                            if (c10 != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused3) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + c10 + ". Skipping setting vibrateTimings.");
                                                }
                                                if (c10.length() <= 1) {
                                                    throw new JSONException("vibrateTimings have invalid length");
                                                }
                                                int length = c10.length();
                                                jArr = new long[length];
                                                for (int i13 = 0; i13 < length; i13++) {
                                                    jArr[i13] = c10.optLong(i13);
                                                }
                                                if (jArr != null) {
                                                    rVar.E.vibrate = jArr;
                                                }
                                                c11 = cVar.c("gcm.n.light_settings");
                                                if (c11 != null) {
                                                    int[] iArr2 = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e19) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + c11 + ". " + e19.getMessage() + ". Skipping setting LightSettings");
                                                    } catch (JSONException unused4) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + c11 + ". Skipping setting LightSettings");
                                                    }
                                                    if (c11.length() != 3) {
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    int parseColor = Color.parseColor(c11.optString(0));
                                                    if (parseColor == -16777216) {
                                                        throw new IllegalArgumentException("Transparent color is invalid");
                                                    }
                                                    iArr2[0] = parseColor;
                                                    iArr2[1] = c11.optInt(1);
                                                    iArr2[2] = c11.optInt(2);
                                                    iArr = iArr2;
                                                    if (iArr != null) {
                                                        int i14 = iArr[0];
                                                        int i15 = iArr[1];
                                                        int i16 = iArr[2];
                                                        Notification notification2 = rVar.E;
                                                        notification2.ledARGB = i14;
                                                        notification2.ledOnMS = i15;
                                                        notification2.ledOffMS = i16;
                                                        if (i15 != 0 && i16 != 0) {
                                                            i12 = 1;
                                                        }
                                                        notification2.flags = (notification2.flags & (-2)) | i12;
                                                    }
                                                    boolean a2 = cVar.a("gcm.n.default_sound");
                                                    boolean z10 = a2;
                                                    if (cVar.a("gcm.n.default_vibrate_timings")) {
                                                        z10 = (a2 ? 1 : 0) | 2;
                                                    }
                                                    r02 = z10;
                                                    if (cVar.a("gcm.n.default_light_settings")) {
                                                        r02 = (z10 ? 1 : 0) | 4;
                                                    }
                                                    Notification notification3 = rVar.E;
                                                    notification3.defaults = r02;
                                                    if ((r02 & 4) != 0) {
                                                        notification3.flags |= 1;
                                                    }
                                                    e15 = cVar.e("gcm.n.tag");
                                                    if (TextUtils.isEmpty(e15)) {
                                                        e15 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    return new j(rVar, e15);
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean a22 = cVar.a("gcm.n.default_sound");
                                                boolean z102 = a22;
                                                if (cVar.a("gcm.n.default_vibrate_timings")) {
                                                }
                                                r02 = z102;
                                                if (cVar.a("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification32 = rVar.E;
                                                notification32.defaults = r02;
                                                if ((r02 & 4) != 0) {
                                                }
                                                e15 = cVar.e("gcm.n.tag");
                                                if (TextUtils.isEmpty(e15)) {
                                                }
                                                return new j(rVar, e15);
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            c11 = cVar.c("gcm.n.light_settings");
                                            if (c11 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean a222 = cVar.a("gcm.n.default_sound");
                                            boolean z1022 = a222;
                                            if (cVar.a("gcm.n.default_vibrate_timings")) {
                                            }
                                            r02 = z1022;
                                            if (cVar.a("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification322 = rVar.E;
                                            notification322.defaults = r02;
                                            if ((r02 & 4) != 0) {
                                            }
                                            e15 = cVar.e("gcm.n.tag");
                                            if (TextUtils.isEmpty(e15)) {
                                            }
                                            return new j(rVar, e15);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        c10 = cVar.c("gcm.n.vibrate_timings");
                                        if (c10 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        c11 = cVar.c("gcm.n.light_settings");
                                        if (c11 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean a2222 = cVar.a("gcm.n.default_sound");
                                        boolean z10222 = a2222;
                                        if (cVar.a("gcm.n.default_vibrate_timings")) {
                                        }
                                        r02 = z10222;
                                        if (cVar.a("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification3222 = rVar.E;
                                        notification3222.defaults = r02;
                                        if ((r02 & 4) != 0) {
                                        }
                                        e15 = cVar.e("gcm.n.tag");
                                        if (TextUtils.isEmpty(e15)) {
                                        }
                                        return new j(rVar, e15);
                                    }
                                    b12 = null;
                                    if (b12 != null) {
                                    }
                                    e14 = cVar.e("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(e14)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    c10 = cVar.c("gcm.n.vibrate_timings");
                                    if (c10 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    c11 = cVar.c("gcm.n.light_settings");
                                    if (c11 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean a22222 = cVar.a("gcm.n.default_sound");
                                    boolean z102222 = a22222;
                                    if (cVar.a("gcm.n.default_vibrate_timings")) {
                                    }
                                    r02 = z102222;
                                    if (cVar.a("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification32222 = rVar.E;
                                    notification32222.defaults = r02;
                                    if ((r02 & 4) != 0) {
                                    }
                                    e15 = cVar.e("gcm.n.tag");
                                    if (TextUtils.isEmpty(e15)) {
                                    }
                                    return new j(rVar, e15);
                                }
                                b11 = null;
                                if (b11 != null) {
                                }
                                b12 = cVar.b("gcm.n.notification_count");
                                if (b12 != null) {
                                }
                                b12 = null;
                                if (b12 != null) {
                                }
                                e14 = cVar.e("gcm.n.event_time");
                                if (!TextUtils.isEmpty(e14)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                c10 = cVar.c("gcm.n.vibrate_timings");
                                if (c10 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                c11 = cVar.c("gcm.n.light_settings");
                                if (c11 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean a222222 = cVar.a("gcm.n.default_sound");
                                boolean z1022222 = a222222;
                                if (cVar.a("gcm.n.default_vibrate_timings")) {
                                }
                                r02 = z1022222;
                                if (cVar.a("gcm.n.default_light_settings")) {
                                }
                                Notification notification322222 = rVar.E;
                                notification322222.defaults = r02;
                                if ((r02 & 4) != 0) {
                                }
                                e15 = cVar.e("gcm.n.tag");
                                if (TextUtils.isEmpty(e15)) {
                                }
                                return new j(rVar, e15);
                            }
                            b10 = null;
                            if (b10 != null) {
                            }
                            b11 = cVar.b("gcm.n.visibility");
                            if (b11 != null) {
                            }
                            b11 = null;
                            if (b11 != null) {
                            }
                            b12 = cVar.b("gcm.n.notification_count");
                            if (b12 != null) {
                            }
                            b12 = null;
                            if (b12 != null) {
                            }
                            e14 = cVar.e("gcm.n.event_time");
                            if (!TextUtils.isEmpty(e14)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            c10 = cVar.c("gcm.n.vibrate_timings");
                            if (c10 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c11 = cVar.c("gcm.n.light_settings");
                            if (c11 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a2222222 = cVar.a("gcm.n.default_sound");
                            boolean z10222222 = a2222222;
                            if (cVar.a("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z10222222;
                            if (cVar.a("gcm.n.default_light_settings")) {
                            }
                            Notification notification3222222 = rVar.E;
                            notification3222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            e15 = cVar.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e15)) {
                            }
                            return new j(rVar, e15);
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
                            rVar.h(16, !cVar.a("gcm.n.sticky"));
                            rVar.t = cVar.a("gcm.n.local_only");
                            e13 = cVar.e("gcm.n.ticker");
                            if (e13 != null) {
                            }
                            b10 = cVar.b("gcm.n.notification_priority");
                            if (b10 != null) {
                            }
                            b10 = null;
                            if (b10 != null) {
                            }
                            b11 = cVar.b("gcm.n.visibility");
                            if (b11 != null) {
                            }
                            b11 = null;
                            if (b11 != null) {
                            }
                            b12 = cVar.b("gcm.n.notification_count");
                            if (b12 != null) {
                            }
                            b12 = null;
                            if (b12 != null) {
                            }
                            e14 = cVar.e("gcm.n.event_time");
                            if (!TextUtils.isEmpty(e14)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            c10 = cVar.c("gcm.n.vibrate_timings");
                            if (c10 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            c11 = cVar.c("gcm.n.light_settings");
                            if (c11 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean a22222222 = cVar.a("gcm.n.default_sound");
                            boolean z102222222 = a22222222;
                            if (cVar.a("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z102222222;
                            if (cVar.a("gcm.n.default_light_settings")) {
                            }
                            Notification notification32222222 = rVar.E;
                            notification32222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            e15 = cVar.e("gcm.n.tag");
                            if (TextUtils.isEmpty(e15)) {
                            }
                            return new j(rVar, e15);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        rVar.h(16, !cVar.a("gcm.n.sticky"));
                        rVar.t = cVar.a("gcm.n.local_only");
                        e13 = cVar.e("gcm.n.ticker");
                        if (e13 != null) {
                        }
                        b10 = cVar.b("gcm.n.notification_priority");
                        if (b10 != null) {
                        }
                        b10 = null;
                        if (b10 != null) {
                        }
                        b11 = cVar.b("gcm.n.visibility");
                        if (b11 != null) {
                        }
                        b11 = null;
                        if (b11 != null) {
                        }
                        b12 = cVar.b("gcm.n.notification_count");
                        if (b12 != null) {
                        }
                        b12 = null;
                        if (b12 != null) {
                        }
                        e14 = cVar.e("gcm.n.event_time");
                        if (!TextUtils.isEmpty(e14)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        c10 = cVar.c("gcm.n.vibrate_timings");
                        if (c10 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        c11 = cVar.c("gcm.n.light_settings");
                        if (c11 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean a222222222 = cVar.a("gcm.n.default_sound");
                        boolean z1022222222 = a222222222;
                        if (cVar.a("gcm.n.default_vibrate_timings")) {
                        }
                        r02 = z1022222222;
                        if (cVar.a("gcm.n.default_light_settings")) {
                        }
                        Notification notification322222222 = rVar.E;
                        notification322222222.defaults = r02;
                        if ((r02 & 4) != 0) {
                        }
                        e15 = cVar.e("gcm.n.tag");
                        if (TextUtils.isEmpty(e15)) {
                        }
                        return new j(rVar, e15);
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i10 != 0 || !b(resources, i10)) {
                        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i10 != 0 || !b(resources, i10)) {
                        i10 = 17301651;
                    }
                    rVar.E.icon = i10;
                    e10 = cVar.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e10)) {
                    }
                    if (TextUtils.isEmpty(e10)) {
                    }
                    if (defaultUri != null) {
                    }
                    e11 = cVar.e("gcm.n.click_action");
                    if (TextUtils.isEmpty(e11)) {
                    }
                    AtomicInteger atomicInteger2 = a;
                    if (launchIntentForPackage == null) {
                    }
                    rVar.g = activity;
                    if (!cVar.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e12 = cVar.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e12)) {
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i11 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    rVar.h(16, !cVar.a("gcm.n.sticky"));
                    rVar.t = cVar.a("gcm.n.local_only");
                    e13 = cVar.e("gcm.n.ticker");
                    if (e13 != null) {
                    }
                    b10 = cVar.b("gcm.n.notification_priority");
                    if (b10 != null) {
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    b11 = cVar.b("gcm.n.visibility");
                    if (b11 != null) {
                    }
                    b11 = null;
                    if (b11 != null) {
                    }
                    b12 = cVar.b("gcm.n.notification_count");
                    if (b12 != null) {
                    }
                    b12 = null;
                    if (b12 != null) {
                    }
                    e14 = cVar.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e14)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c10 = cVar.c("gcm.n.vibrate_timings");
                    if (c10 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c11 = cVar.c("gcm.n.light_settings");
                    if (c11 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a2222222222 = cVar.a("gcm.n.default_sound");
                    boolean z10222222222 = a2222222222;
                    if (cVar.a("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z10222222222;
                    if (cVar.a("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222222222 = rVar.E;
                    notification3222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    e15 = cVar.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e15)) {
                    }
                    return new j(rVar, e15);
                }
                e17 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(e17)) {
                    if (notificationManager.getNotificationChannel(e17) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.r rVar2 = new e0.r(firebaseMessagingService, e17);
                    d = cVar.d(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(d)) {
                    }
                    d10 = cVar.d(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(d10)) {
                    }
                    e7 = cVar.e("gcm.n.icon");
                    if (!TextUtils.isEmpty(e7)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i10 != 0) {
                    }
                    i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i10 != 0) {
                    }
                    i10 = 17301651;
                    rVar2.E.icon = i10;
                    e10 = cVar.e("gcm.n.sound2");
                    if (TextUtils.isEmpty(e10)) {
                    }
                    if (TextUtils.isEmpty(e10)) {
                    }
                    if (defaultUri != null) {
                    }
                    e11 = cVar.e("gcm.n.click_action");
                    if (TextUtils.isEmpty(e11)) {
                    }
                    AtomicInteger atomicInteger22 = a;
                    if (launchIntentForPackage == null) {
                    }
                    rVar2.g = activity;
                    if (!cVar.a("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    e12 = cVar.e("gcm.n.color");
                    if (!TextUtils.isEmpty(e12)) {
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i11 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    rVar2.h(16, !cVar.a("gcm.n.sticky"));
                    rVar2.t = cVar.a("gcm.n.local_only");
                    e13 = cVar.e("gcm.n.ticker");
                    if (e13 != null) {
                    }
                    b10 = cVar.b("gcm.n.notification_priority");
                    if (b10 != null) {
                    }
                    b10 = null;
                    if (b10 != null) {
                    }
                    b11 = cVar.b("gcm.n.visibility");
                    if (b11 != null) {
                    }
                    b11 = null;
                    if (b11 != null) {
                    }
                    b12 = cVar.b("gcm.n.notification_count");
                    if (b12 != null) {
                    }
                    b12 = null;
                    if (b12 != null) {
                    }
                    e14 = cVar.e("gcm.n.event_time");
                    if (!TextUtils.isEmpty(e14)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    c10 = cVar.c("gcm.n.vibrate_timings");
                    if (c10 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    c11 = cVar.c("gcm.n.light_settings");
                    if (c11 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean a22222222222 = cVar.a("gcm.n.default_sound");
                    boolean z102222222222 = a22222222222;
                    if (cVar.a("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z102222222222;
                    if (cVar.a("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222222222 = rVar2.E;
                    notification32222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    e15 = cVar.e("gcm.n.tag");
                    if (TextUtils.isEmpty(e15)) {
                    }
                    return new j(rVar2, e15);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                e17 = "fcm_fallback_notification_channel";
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
                e0.r rVar22 = new e0.r(firebaseMessagingService, e17);
                d = cVar.d(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(d)) {
                }
                d10 = cVar.d(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(d10)) {
                }
                e7 = cVar.e("gcm.n.icon");
                if (!TextUtils.isEmpty(e7)) {
                }
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i10 != 0) {
                }
                i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i10 != 0) {
                }
                i10 = 17301651;
                rVar22.E.icon = i10;
                e10 = cVar.e("gcm.n.sound2");
                if (TextUtils.isEmpty(e10)) {
                }
                if (TextUtils.isEmpty(e10)) {
                }
                if (defaultUri != null) {
                }
                e11 = cVar.e("gcm.n.click_action");
                if (TextUtils.isEmpty(e11)) {
                }
                AtomicInteger atomicInteger222 = a;
                if (launchIntentForPackage == null) {
                }
                rVar22.g = activity;
                if (!cVar.a("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                e12 = cVar.e("gcm.n.color");
                if (!TextUtils.isEmpty(e12)) {
                }
                i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i11 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                rVar22.h(16, !cVar.a("gcm.n.sticky"));
                rVar22.t = cVar.a("gcm.n.local_only");
                e13 = cVar.e("gcm.n.ticker");
                if (e13 != null) {
                }
                b10 = cVar.b("gcm.n.notification_priority");
                if (b10 != null) {
                }
                b10 = null;
                if (b10 != null) {
                }
                b11 = cVar.b("gcm.n.visibility");
                if (b11 != null) {
                }
                b11 = null;
                if (b11 != null) {
                }
                b12 = cVar.b("gcm.n.notification_count");
                if (b12 != null) {
                }
                b12 = null;
                if (b12 != null) {
                }
                e14 = cVar.e("gcm.n.event_time");
                if (!TextUtils.isEmpty(e14)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                c10 = cVar.c("gcm.n.vibrate_timings");
                if (c10 != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                c11 = cVar.c("gcm.n.light_settings");
                if (c11 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean a222222222222 = cVar.a("gcm.n.default_sound");
                boolean z1022222222222 = a222222222222;
                if (cVar.a("gcm.n.default_vibrate_timings")) {
                }
                r02 = z1022222222222;
                if (cVar.a("gcm.n.default_light_settings")) {
                }
                Notification notification322222222222 = rVar22.E;
                notification322222222222.defaults = r02;
                if ((r02 & 4) != 0) {
                }
                e15 = cVar.e("gcm.n.tag");
                if (TextUtils.isEmpty(e15)) {
                }
                return new j(rVar22, e15);
            }
        }
        e17 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        e0.r rVar222 = new e0.r(firebaseMessagingService, e17);
        d = cVar.d(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(d)) {
        }
        d10 = cVar.d(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(d10)) {
        }
        e7 = cVar.e("gcm.n.icon");
        if (!TextUtils.isEmpty(e7)) {
        }
        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 != 0) {
        }
        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i10 != 0) {
        }
        i10 = 17301651;
        rVar222.E.icon = i10;
        e10 = cVar.e("gcm.n.sound2");
        if (TextUtils.isEmpty(e10)) {
        }
        if (TextUtils.isEmpty(e10)) {
        }
        if (defaultUri != null) {
        }
        e11 = cVar.e("gcm.n.click_action");
        if (TextUtils.isEmpty(e11)) {
        }
        AtomicInteger atomicInteger2222 = a;
        if (launchIntentForPackage == null) {
        }
        rVar222.g = activity;
        if (!cVar.a("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        e12 = cVar.e("gcm.n.color");
        if (!TextUtils.isEmpty(e12)) {
        }
        i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i11 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        rVar222.h(16, !cVar.a("gcm.n.sticky"));
        rVar222.t = cVar.a("gcm.n.local_only");
        e13 = cVar.e("gcm.n.ticker");
        if (e13 != null) {
        }
        b10 = cVar.b("gcm.n.notification_priority");
        if (b10 != null) {
        }
        b10 = null;
        if (b10 != null) {
        }
        b11 = cVar.b("gcm.n.visibility");
        if (b11 != null) {
        }
        b11 = null;
        if (b11 != null) {
        }
        b12 = cVar.b("gcm.n.notification_count");
        if (b12 != null) {
        }
        b12 = null;
        if (b12 != null) {
        }
        e14 = cVar.e("gcm.n.event_time");
        if (!TextUtils.isEmpty(e14)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        c10 = cVar.c("gcm.n.vibrate_timings");
        if (c10 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        c11 = cVar.c("gcm.n.light_settings");
        if (c11 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean a2222222222222 = cVar.a("gcm.n.default_sound");
        boolean z10222222222222 = a2222222222222;
        if (cVar.a("gcm.n.default_vibrate_timings")) {
        }
        r02 = z10222222222222;
        if (cVar.a("gcm.n.default_light_settings")) {
        }
        Notification notification3222222222222 = rVar222.E;
        notification3222222222222.defaults = r02;
        if ((r02 & 4) != 0) {
        }
        e15 = cVar.e("gcm.n.tag");
        if (TextUtils.isEmpty(e15)) {
        }
        return new j(rVar222, e15);
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
