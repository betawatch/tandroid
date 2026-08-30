package com.google.firebase.messaging;

import android.R;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class e {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(75:0|1|(3:2|3|(1:5))|239|7|8|(3:215|216|(73:218|(66:220|(1:222)|11|(1:13)|14|(1:16)|17|(57:19|(1:201)|23|(1:25)|26|(1:28)(2:191|(1:196)(1:195))|29|(1:31)|32|(1:34)(5:179|(1:181)|182|(1:184)(1:190)|(1:186)(2:187|(1:189)))|35|(1:37)(8:157|(4:160|(2:168|169)(1:166)|167|158)|170|171|(1:173)|174|(1:176)(1:178)|177)|38|(1:40)(3:152|(1:154)(1:156)|155)|(1:42)|43|(39:148|149|(1:49)|50|(1:52)|53|(33:139|(1:143)|(1:57)|58|(29:134|(1:138)|(1:62)|63|(25:131|(1:133)|(1:67)|68|(21:127|128|(1:72)|73|(3:117|118|(18:120|(1:122)|123|(1:77)|78|(4:102|103|104|(2:106|(12:108|(3:82|(1:85)|86)|87|(1:89)|90|(1:92)|93|(1:95)|96|(1:98)|99|100)(2:109|110))(2:111|112))|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(2:124|125))|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|45|(39:144|145|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|202|(2:210|211)|(1:209)|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|223|(69:225|(1:227)|11|(0)|14|(0)|17|(0)|202|(1:204)|210|211|(1:207)|209|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(1:235)|228|(3:230|(1:232)(1:234)|233)|11|(0)|14|(0)|17|(0)|202|(0)|210|211|(0)|209|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100))|10|11|(0)|14|(0)|17|(0)|202|(0)|210|211|(0)|209|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100) */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0162, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0163, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0498  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x044c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x040a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x032a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0303 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0552  */
    /* JADX WARN: Type inference failed for: r0v107, types: [int] */
    /* JADX WARN: Type inference failed for: r0v113 */
    /* JADX WARN: Type inference failed for: r0v153 */
    /* JADX WARN: Type inference failed for: r0v154 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static j a(FirebaseMessagingService firebaseMessagingService, a3.c cVar) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        String L;
        String L2;
        String M;
        int i10;
        String M2;
        Uri defaultUri;
        String M3;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String M4;
        Integer valueOf;
        String M5;
        Integer J;
        Integer J2;
        Integer J3;
        String M6;
        Long valueOf2;
        JSONArray K;
        long[] jArr;
        JSONArray K2;
        int[] iArr;
        ?? r02;
        String M7;
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
        String M8 = cVar.M("gcm.n.android_channel_id");
        int i12 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(M8)) {
                    if (notificationManager.getNotificationChannel(M8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + M8 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.t tVar = new e0.t(firebaseMessagingService, M8);
                    L = cVar.L(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(L)) {
                        tVar.g(L);
                    }
                    L2 = cVar.L(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(L2)) {
                        tVar.f(L2);
                        e0.o oVar = new e0.o(false);
                        oVar.f = e0.t.d(L2);
                        tVar.n(oVar);
                    }
                    M = cVar.M("gcm.n.icon");
                    if (!TextUtils.isEmpty(M)) {
                        i10 = resources.getIdentifier(M, "drawable", packageName);
                        if ((i10 == 0 || !b(resources, i10)) && ((i10 = resources.getIdentifier(M, "mipmap", packageName)) == 0 || !b(resources, i10))) {
                            Log.w("FirebaseMessaging", "Icon resource " + M + " not found. Notification will use default icon.");
                        }
                        tVar.E.icon = i10;
                        M2 = cVar.M("gcm.n.sound2");
                        if (TextUtils.isEmpty(M2)) {
                            M2 = cVar.M("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(M2)) {
                            defaultUri = null;
                        } else if ("default".equals(M2) || resources.getIdentifier(M2, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + M2);
                        }
                        if (defaultUri != null) {
                            Notification notification = tVar.E;
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = e0.s.a(e0.s.e(e0.s.c(e0.s.b(), 4), 5));
                        }
                        M3 = cVar.M("gcm.n.click_action");
                        if (TextUtils.isEmpty(M3)) {
                            String M9 = cVar.M("gcm.n.link_android");
                            if (TextUtils.isEmpty(M9)) {
                                M9 = cVar.M("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(M9) ? Uri.parse(M9) : null;
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
                            launchIntentForPackage = new Intent(M3);
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
                            if (cVar.I("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", cVar.O());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, Build.VERSION.SDK_INT >= 23 ? 1140850688 : TLObject.FLAG_30);
                        }
                        tVar.g = activity;
                        if (cVar.I("google.c.a.e")) {
                            broadcast = PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(cVar.O())), Build.VERSION.SDK_INT >= 23 ? 1140850688 : TLObject.FLAG_30);
                        } else {
                            broadcast = null;
                        }
                        if (broadcast != null) {
                            tVar.E.deleteIntent = broadcast;
                        }
                        M4 = cVar.M("gcm.n.color");
                        if (!TextUtils.isEmpty(M4)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(M4));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + M4 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                tVar.w = valueOf.intValue();
                            }
                            tVar.h(16, !cVar.I("gcm.n.sticky"));
                            tVar.t = cVar.I("gcm.n.local_only");
                            M5 = cVar.M("gcm.n.ticker");
                            if (M5 != null) {
                                tVar.p(M5);
                            }
                            J = cVar.J("gcm.n.notification_priority");
                            if (J != null) {
                                if (J.intValue() < -2 || J.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + J + ". Skipping setting notificationPriority.");
                                }
                                if (J != null) {
                                    tVar.j = J.intValue();
                                }
                                J2 = cVar.J("gcm.n.visibility");
                                if (J2 != null) {
                                    if (J2.intValue() < -1 || J2.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + J2 + ". Skipping setting visibility.");
                                    }
                                    if (J2 != null) {
                                        tVar.x = J2.intValue();
                                    }
                                    J3 = cVar.J("gcm.n.notification_count");
                                    if (J3 != null) {
                                        if (J3.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + J3 + ". Skipping setting notificationCount.");
                                        }
                                        if (J3 != null) {
                                            tVar.i = J3.intValue();
                                        }
                                        M6 = cVar.M("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(M6)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(M6));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + a3.c.Q("gcm.n.event_time") + "(" + M6 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                tVar.k = true;
                                                tVar.E.when = valueOf2.longValue();
                                            }
                                            K = cVar.K("gcm.n.vibrate_timings");
                                            if (K != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused3) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + K + ". Skipping setting vibrateTimings.");
                                                }
                                                if (K.length() <= 1) {
                                                    throw new JSONException("vibrateTimings have invalid length");
                                                }
                                                int length = K.length();
                                                jArr = new long[length];
                                                for (int i13 = 0; i13 < length; i13++) {
                                                    jArr[i13] = K.optLong(i13);
                                                }
                                                if (jArr != null) {
                                                    tVar.E.vibrate = jArr;
                                                }
                                                K2 = cVar.K("gcm.n.light_settings");
                                                if (K2 != null) {
                                                    int[] iArr2 = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e6) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + K2 + ". " + e6.getMessage() + ". Skipping setting LightSettings");
                                                    } catch (JSONException unused4) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + K2 + ". Skipping setting LightSettings");
                                                    }
                                                    if (K2.length() != 3) {
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    int parseColor = Color.parseColor(K2.optString(0));
                                                    if (parseColor == -16777216) {
                                                        throw new IllegalArgumentException("Transparent color is invalid");
                                                    }
                                                    iArr2[0] = parseColor;
                                                    iArr2[1] = K2.optInt(1);
                                                    iArr2[2] = K2.optInt(2);
                                                    iArr = iArr2;
                                                    if (iArr != null) {
                                                        int i14 = iArr[0];
                                                        int i15 = iArr[1];
                                                        int i16 = iArr[2];
                                                        Notification notification2 = tVar.E;
                                                        notification2.ledARGB = i14;
                                                        notification2.ledOnMS = i15;
                                                        notification2.ledOffMS = i16;
                                                        if (i15 != 0 && i16 != 0) {
                                                            i12 = 1;
                                                        }
                                                        notification2.flags = (notification2.flags & (-2)) | i12;
                                                    }
                                                    boolean I = cVar.I("gcm.n.default_sound");
                                                    boolean z4 = I;
                                                    if (cVar.I("gcm.n.default_vibrate_timings")) {
                                                        z4 = (I ? 1 : 0) | 2;
                                                    }
                                                    r02 = z4;
                                                    if (cVar.I("gcm.n.default_light_settings")) {
                                                        r02 = (z4 ? 1 : 0) | 4;
                                                    }
                                                    Notification notification3 = tVar.E;
                                                    notification3.defaults = r02;
                                                    if ((r02 & 4) != 0) {
                                                        notification3.flags |= 1;
                                                    }
                                                    M7 = cVar.M("gcm.n.tag");
                                                    if (TextUtils.isEmpty(M7)) {
                                                        M7 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    return new j(tVar, M7);
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean I2 = cVar.I("gcm.n.default_sound");
                                                boolean z42 = I2;
                                                if (cVar.I("gcm.n.default_vibrate_timings")) {
                                                }
                                                r02 = z42;
                                                if (cVar.I("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification32 = tVar.E;
                                                notification32.defaults = r02;
                                                if ((r02 & 4) != 0) {
                                                }
                                                M7 = cVar.M("gcm.n.tag");
                                                if (TextUtils.isEmpty(M7)) {
                                                }
                                                return new j(tVar, M7);
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            K2 = cVar.K("gcm.n.light_settings");
                                            if (K2 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean I22 = cVar.I("gcm.n.default_sound");
                                            boolean z422 = I22;
                                            if (cVar.I("gcm.n.default_vibrate_timings")) {
                                            }
                                            r02 = z422;
                                            if (cVar.I("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification322 = tVar.E;
                                            notification322.defaults = r02;
                                            if ((r02 & 4) != 0) {
                                            }
                                            M7 = cVar.M("gcm.n.tag");
                                            if (TextUtils.isEmpty(M7)) {
                                            }
                                            return new j(tVar, M7);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        K = cVar.K("gcm.n.vibrate_timings");
                                        if (K != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        K2 = cVar.K("gcm.n.light_settings");
                                        if (K2 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean I222 = cVar.I("gcm.n.default_sound");
                                        boolean z4222 = I222;
                                        if (cVar.I("gcm.n.default_vibrate_timings")) {
                                        }
                                        r02 = z4222;
                                        if (cVar.I("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification3222 = tVar.E;
                                        notification3222.defaults = r02;
                                        if ((r02 & 4) != 0) {
                                        }
                                        M7 = cVar.M("gcm.n.tag");
                                        if (TextUtils.isEmpty(M7)) {
                                        }
                                        return new j(tVar, M7);
                                    }
                                    J3 = null;
                                    if (J3 != null) {
                                    }
                                    M6 = cVar.M("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(M6)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    K = cVar.K("gcm.n.vibrate_timings");
                                    if (K != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    K2 = cVar.K("gcm.n.light_settings");
                                    if (K2 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean I2222 = cVar.I("gcm.n.default_sound");
                                    boolean z42222 = I2222;
                                    if (cVar.I("gcm.n.default_vibrate_timings")) {
                                    }
                                    r02 = z42222;
                                    if (cVar.I("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification32222 = tVar.E;
                                    notification32222.defaults = r02;
                                    if ((r02 & 4) != 0) {
                                    }
                                    M7 = cVar.M("gcm.n.tag");
                                    if (TextUtils.isEmpty(M7)) {
                                    }
                                    return new j(tVar, M7);
                                }
                                J2 = null;
                                if (J2 != null) {
                                }
                                J3 = cVar.J("gcm.n.notification_count");
                                if (J3 != null) {
                                }
                                J3 = null;
                                if (J3 != null) {
                                }
                                M6 = cVar.M("gcm.n.event_time");
                                if (!TextUtils.isEmpty(M6)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                K = cVar.K("gcm.n.vibrate_timings");
                                if (K != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                K2 = cVar.K("gcm.n.light_settings");
                                if (K2 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean I22222 = cVar.I("gcm.n.default_sound");
                                boolean z422222 = I22222;
                                if (cVar.I("gcm.n.default_vibrate_timings")) {
                                }
                                r02 = z422222;
                                if (cVar.I("gcm.n.default_light_settings")) {
                                }
                                Notification notification322222 = tVar.E;
                                notification322222.defaults = r02;
                                if ((r02 & 4) != 0) {
                                }
                                M7 = cVar.M("gcm.n.tag");
                                if (TextUtils.isEmpty(M7)) {
                                }
                                return new j(tVar, M7);
                            }
                            J = null;
                            if (J != null) {
                            }
                            J2 = cVar.J("gcm.n.visibility");
                            if (J2 != null) {
                            }
                            J2 = null;
                            if (J2 != null) {
                            }
                            J3 = cVar.J("gcm.n.notification_count");
                            if (J3 != null) {
                            }
                            J3 = null;
                            if (J3 != null) {
                            }
                            M6 = cVar.M("gcm.n.event_time");
                            if (!TextUtils.isEmpty(M6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            K = cVar.K("gcm.n.vibrate_timings");
                            if (K != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            K2 = cVar.K("gcm.n.light_settings");
                            if (K2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean I222222 = cVar.I("gcm.n.default_sound");
                            boolean z4222222 = I222222;
                            if (cVar.I("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z4222222;
                            if (cVar.I("gcm.n.default_light_settings")) {
                            }
                            Notification notification3222222 = tVar.E;
                            notification3222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            M7 = cVar.M("gcm.n.tag");
                            if (TextUtils.isEmpty(M7)) {
                            }
                            return new j(tVar, M7);
                        }
                        i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i11 != 0) {
                            try {
                                valueOf = Integer.valueOf(f0.f.c(firebaseMessagingService, i11));
                            } catch (Resources.NotFoundException unused5) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            tVar.h(16, !cVar.I("gcm.n.sticky"));
                            tVar.t = cVar.I("gcm.n.local_only");
                            M5 = cVar.M("gcm.n.ticker");
                            if (M5 != null) {
                            }
                            J = cVar.J("gcm.n.notification_priority");
                            if (J != null) {
                            }
                            J = null;
                            if (J != null) {
                            }
                            J2 = cVar.J("gcm.n.visibility");
                            if (J2 != null) {
                            }
                            J2 = null;
                            if (J2 != null) {
                            }
                            J3 = cVar.J("gcm.n.notification_count");
                            if (J3 != null) {
                            }
                            J3 = null;
                            if (J3 != null) {
                            }
                            M6 = cVar.M("gcm.n.event_time");
                            if (!TextUtils.isEmpty(M6)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            K = cVar.K("gcm.n.vibrate_timings");
                            if (K != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            K2 = cVar.K("gcm.n.light_settings");
                            if (K2 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean I2222222 = cVar.I("gcm.n.default_sound");
                            boolean z42222222 = I2222222;
                            if (cVar.I("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z42222222;
                            if (cVar.I("gcm.n.default_light_settings")) {
                            }
                            Notification notification32222222 = tVar.E;
                            notification32222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            M7 = cVar.M("gcm.n.tag");
                            if (TextUtils.isEmpty(M7)) {
                            }
                            return new j(tVar, M7);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        tVar.h(16, !cVar.I("gcm.n.sticky"));
                        tVar.t = cVar.I("gcm.n.local_only");
                        M5 = cVar.M("gcm.n.ticker");
                        if (M5 != null) {
                        }
                        J = cVar.J("gcm.n.notification_priority");
                        if (J != null) {
                        }
                        J = null;
                        if (J != null) {
                        }
                        J2 = cVar.J("gcm.n.visibility");
                        if (J2 != null) {
                        }
                        J2 = null;
                        if (J2 != null) {
                        }
                        J3 = cVar.J("gcm.n.notification_count");
                        if (J3 != null) {
                        }
                        J3 = null;
                        if (J3 != null) {
                        }
                        M6 = cVar.M("gcm.n.event_time");
                        if (!TextUtils.isEmpty(M6)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        K = cVar.K("gcm.n.vibrate_timings");
                        if (K != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        K2 = cVar.K("gcm.n.light_settings");
                        if (K2 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean I22222222 = cVar.I("gcm.n.default_sound");
                        boolean z422222222 = I22222222;
                        if (cVar.I("gcm.n.default_vibrate_timings")) {
                        }
                        r02 = z422222222;
                        if (cVar.I("gcm.n.default_light_settings")) {
                        }
                        Notification notification322222222 = tVar.E;
                        notification322222222.defaults = r02;
                        if ((r02 & 4) != 0) {
                        }
                        M7 = cVar.M("gcm.n.tag");
                        if (TextUtils.isEmpty(M7)) {
                        }
                        return new j(tVar, M7);
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i10 != 0 || !b(resources, i10)) {
                        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i10 != 0 || !b(resources, i10)) {
                        i10 = R.drawable.sym_def_app_icon;
                    }
                    tVar.E.icon = i10;
                    M2 = cVar.M("gcm.n.sound2");
                    if (TextUtils.isEmpty(M2)) {
                    }
                    if (TextUtils.isEmpty(M2)) {
                    }
                    if (defaultUri != null) {
                    }
                    M3 = cVar.M("gcm.n.click_action");
                    if (TextUtils.isEmpty(M3)) {
                    }
                    AtomicInteger atomicInteger2 = a;
                    if (launchIntentForPackage == null) {
                    }
                    tVar.g = activity;
                    if (cVar.I("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    M4 = cVar.M("gcm.n.color");
                    if (!TextUtils.isEmpty(M4)) {
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i11 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    tVar.h(16, !cVar.I("gcm.n.sticky"));
                    tVar.t = cVar.I("gcm.n.local_only");
                    M5 = cVar.M("gcm.n.ticker");
                    if (M5 != null) {
                    }
                    J = cVar.J("gcm.n.notification_priority");
                    if (J != null) {
                    }
                    J = null;
                    if (J != null) {
                    }
                    J2 = cVar.J("gcm.n.visibility");
                    if (J2 != null) {
                    }
                    J2 = null;
                    if (J2 != null) {
                    }
                    J3 = cVar.J("gcm.n.notification_count");
                    if (J3 != null) {
                    }
                    J3 = null;
                    if (J3 != null) {
                    }
                    M6 = cVar.M("gcm.n.event_time");
                    if (!TextUtils.isEmpty(M6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    K = cVar.K("gcm.n.vibrate_timings");
                    if (K != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    K2 = cVar.K("gcm.n.light_settings");
                    if (K2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean I222222222 = cVar.I("gcm.n.default_sound");
                    boolean z4222222222 = I222222222;
                    if (cVar.I("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z4222222222;
                    if (cVar.I("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222222222 = tVar.E;
                    notification3222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    M7 = cVar.M("gcm.n.tag");
                    if (TextUtils.isEmpty(M7)) {
                    }
                    return new j(tVar, M7);
                }
                M8 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(M8)) {
                    if (notificationManager.getNotificationChannel(M8) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.t tVar2 = new e0.t(firebaseMessagingService, M8);
                    L = cVar.L(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(L)) {
                    }
                    L2 = cVar.L(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(L2)) {
                    }
                    M = cVar.M("gcm.n.icon");
                    if (!TextUtils.isEmpty(M)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i10 != 0) {
                    }
                    i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i10 != 0) {
                    }
                    i10 = R.drawable.sym_def_app_icon;
                    tVar2.E.icon = i10;
                    M2 = cVar.M("gcm.n.sound2");
                    if (TextUtils.isEmpty(M2)) {
                    }
                    if (TextUtils.isEmpty(M2)) {
                    }
                    if (defaultUri != null) {
                    }
                    M3 = cVar.M("gcm.n.click_action");
                    if (TextUtils.isEmpty(M3)) {
                    }
                    AtomicInteger atomicInteger22 = a;
                    if (launchIntentForPackage == null) {
                    }
                    tVar2.g = activity;
                    if (cVar.I("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    M4 = cVar.M("gcm.n.color");
                    if (!TextUtils.isEmpty(M4)) {
                    }
                    i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i11 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    tVar2.h(16, !cVar.I("gcm.n.sticky"));
                    tVar2.t = cVar.I("gcm.n.local_only");
                    M5 = cVar.M("gcm.n.ticker");
                    if (M5 != null) {
                    }
                    J = cVar.J("gcm.n.notification_priority");
                    if (J != null) {
                    }
                    J = null;
                    if (J != null) {
                    }
                    J2 = cVar.J("gcm.n.visibility");
                    if (J2 != null) {
                    }
                    J2 = null;
                    if (J2 != null) {
                    }
                    J3 = cVar.J("gcm.n.notification_count");
                    if (J3 != null) {
                    }
                    J3 = null;
                    if (J3 != null) {
                    }
                    M6 = cVar.M("gcm.n.event_time");
                    if (!TextUtils.isEmpty(M6)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    K = cVar.K("gcm.n.vibrate_timings");
                    if (K != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    K2 = cVar.K("gcm.n.light_settings");
                    if (K2 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean I2222222222 = cVar.I("gcm.n.default_sound");
                    boolean z42222222222 = I2222222222;
                    if (cVar.I("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z42222222222;
                    if (cVar.I("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222222222 = tVar2.E;
                    notification32222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    M7 = cVar.M("gcm.n.tag");
                    if (TextUtils.isEmpty(M7)) {
                    }
                    return new j(tVar2, M7);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                M8 = "fcm_fallback_notification_channel";
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
                e0.t tVar22 = new e0.t(firebaseMessagingService, M8);
                L = cVar.L(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(L)) {
                }
                L2 = cVar.L(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(L2)) {
                }
                M = cVar.M("gcm.n.icon");
                if (!TextUtils.isEmpty(M)) {
                }
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i10 != 0) {
                }
                i10 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i10 != 0) {
                }
                i10 = R.drawable.sym_def_app_icon;
                tVar22.E.icon = i10;
                M2 = cVar.M("gcm.n.sound2");
                if (TextUtils.isEmpty(M2)) {
                }
                if (TextUtils.isEmpty(M2)) {
                }
                if (defaultUri != null) {
                }
                M3 = cVar.M("gcm.n.click_action");
                if (TextUtils.isEmpty(M3)) {
                }
                AtomicInteger atomicInteger222 = a;
                if (launchIntentForPackage == null) {
                }
                tVar22.g = activity;
                if (cVar.I("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                M4 = cVar.M("gcm.n.color");
                if (!TextUtils.isEmpty(M4)) {
                }
                i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i11 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                tVar22.h(16, !cVar.I("gcm.n.sticky"));
                tVar22.t = cVar.I("gcm.n.local_only");
                M5 = cVar.M("gcm.n.ticker");
                if (M5 != null) {
                }
                J = cVar.J("gcm.n.notification_priority");
                if (J != null) {
                }
                J = null;
                if (J != null) {
                }
                J2 = cVar.J("gcm.n.visibility");
                if (J2 != null) {
                }
                J2 = null;
                if (J2 != null) {
                }
                J3 = cVar.J("gcm.n.notification_count");
                if (J3 != null) {
                }
                J3 = null;
                if (J3 != null) {
                }
                M6 = cVar.M("gcm.n.event_time");
                if (!TextUtils.isEmpty(M6)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                K = cVar.K("gcm.n.vibrate_timings");
                if (K != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                K2 = cVar.K("gcm.n.light_settings");
                if (K2 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean I22222222222 = cVar.I("gcm.n.default_sound");
                boolean z422222222222 = I22222222222;
                if (cVar.I("gcm.n.default_vibrate_timings")) {
                }
                r02 = z422222222222;
                if (cVar.I("gcm.n.default_light_settings")) {
                }
                Notification notification322222222222 = tVar22.E;
                notification322222222222.defaults = r02;
                if ((r02 & 4) != 0) {
                }
                M7 = cVar.M("gcm.n.tag");
                if (TextUtils.isEmpty(M7)) {
                }
                return new j(tVar22, M7);
            }
        }
        M8 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        e0.t tVar222 = new e0.t(firebaseMessagingService, M8);
        L = cVar.L(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(L)) {
        }
        L2 = cVar.L(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(L2)) {
        }
        M = cVar.M("gcm.n.icon");
        if (!TextUtils.isEmpty(M)) {
        }
        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i10 != 0) {
        }
        i10 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i10 != 0) {
        }
        i10 = R.drawable.sym_def_app_icon;
        tVar222.E.icon = i10;
        M2 = cVar.M("gcm.n.sound2");
        if (TextUtils.isEmpty(M2)) {
        }
        if (TextUtils.isEmpty(M2)) {
        }
        if (defaultUri != null) {
        }
        M3 = cVar.M("gcm.n.click_action");
        if (TextUtils.isEmpty(M3)) {
        }
        AtomicInteger atomicInteger2222 = a;
        if (launchIntentForPackage == null) {
        }
        tVar222.g = activity;
        if (cVar.I("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        M4 = cVar.M("gcm.n.color");
        if (!TextUtils.isEmpty(M4)) {
        }
        i11 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i11 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        tVar222.h(16, !cVar.I("gcm.n.sticky"));
        tVar222.t = cVar.I("gcm.n.local_only");
        M5 = cVar.M("gcm.n.ticker");
        if (M5 != null) {
        }
        J = cVar.J("gcm.n.notification_priority");
        if (J != null) {
        }
        J = null;
        if (J != null) {
        }
        J2 = cVar.J("gcm.n.visibility");
        if (J2 != null) {
        }
        J2 = null;
        if (J2 != null) {
        }
        J3 = cVar.J("gcm.n.notification_count");
        if (J3 != null) {
        }
        J3 = null;
        if (J3 != null) {
        }
        M6 = cVar.M("gcm.n.event_time");
        if (!TextUtils.isEmpty(M6)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        K = cVar.K("gcm.n.vibrate_timings");
        if (K != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        K2 = cVar.K("gcm.n.light_settings");
        if (K2 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean I222222222222 = cVar.I("gcm.n.default_sound");
        boolean z4222222222222 = I222222222222;
        if (cVar.I("gcm.n.default_vibrate_timings")) {
        }
        r02 = z4222222222222;
        if (cVar.I("gcm.n.default_light_settings")) {
        }
        Notification notification3222222222222 = tVar222.E;
        notification3222222222222.defaults = r02;
        if ((r02 & 4) != 0) {
        }
        M7 = cVar.M("gcm.n.tag");
        if (TextUtils.isEmpty(M7)) {
        }
        return new j(tVar222, M7);
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
