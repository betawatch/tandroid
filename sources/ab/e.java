package ab;

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
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public abstract class e {
    public static final AtomicInteger a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Can't wrap try/catch for region: R(77:0|1|2|3|(1:5)|231|7|8|(3:207|208|(73:210|(66:212|(1:214)|11|(1:13)|14|(1:16)|17|(57:19|(1:193)|23|(1:25)|26|(1:28)(2:183|(1:188)(1:187))|29|(1:31)|32|(1:34)(5:171|(1:173)|174|(1:176)(1:182)|(1:178)(2:179|(1:181)))|35|(1:37)(6:153|(4:156|(2:164|165)(1:162)|163|154)|166|167|(1:169)|170)|38|(1:40)(1:152)|(1:42)|43|(39:148|149|(1:49)|50|(1:52)|53|(33:139|(1:143)|(1:57)|58|(29:134|(1:138)|(1:62)|63|(25:131|(1:133)|(1:67)|68|(21:127|128|(1:72)|73|(3:117|118|(18:120|(1:122)|123|(1:77)|78|(4:102|103|104|(2:106|(12:108|(3:82|(1:85)|86)|87|(1:89)|90|(1:92)|93|(1:95)|96|(1:98)|99|100)(2:109|110))(2:111|112))|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(2:124|125))|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|45|(39:144|145|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|194|(2:202|203)|(1:201)|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)|215|(69:217|(1:219)|11|(0)|14|(0)|17|(0)|194|(1:196)|202|203|(1:199)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100)(1:227)|220|(3:222|(1:224)(1:226)|225)|11|(0)|14|(0)|17|(0)|194|(0)|202|203|(0)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100))|10|11|(0)|14|(0)|17|(0)|194|(0)|202|203|(0)|201|23|(0)|26|(0)(0)|29|(0)|32|(0)(0)|35|(0)(0)|38|(0)(0)|(0)|43|(0)|45|(0)|47|(0)|50|(0)|53|(0)|55|(0)|58|(0)|60|(0)|63|(0)|65|(0)|68|(0)|70|(0)|73|(0)|75|(0)|78|(0)|80|(0)|87|(0)|90|(0)|93|(0)|96|(0)|99|100) */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x015d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x015e, code lost:
    
        android.util.Log.w("FirebaseMessaging", "Couldn't get own application info: " + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r0 != null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0430 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03ee A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0535  */
    /* JADX WARN: Type inference failed for: r0v103, types: [int] */
    /* JADX WARN: Type inference failed for: r0v109 */
    /* JADX WARN: Type inference failed for: r0v149 */
    /* JADX WARN: Type inference failed for: r0v150 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k a(FirebaseMessagingService firebaseMessagingService, d6.i iVar) {
        Bundle bundle;
        String string;
        String packageName;
        PackageManager packageManager;
        String j02;
        String j03;
        String k02;
        int i7;
        String k03;
        Uri defaultUri;
        String k04;
        Intent launchIntentForPackage;
        PendingIntent activity;
        PendingIntent broadcast;
        String k05;
        Integer valueOf;
        String k06;
        Integer h02;
        Integer h03;
        Integer h04;
        String k07;
        Long valueOf2;
        JSONArray i02;
        long[] jArr;
        JSONArray i03;
        int[] iArr;
        ?? r02;
        String k08;
        int i10;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo != null) {
                bundle = applicationInfo.metaData;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e10);
        }
        bundle = Bundle.EMPTY;
        Bundle bundle2 = bundle;
        String k09 = iVar.k0("gcm.n.android_channel_id");
        int i11 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(k09)) {
                    if (notificationManager.getNotificationChannel(k09) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + k09 + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.q qVar = new e0.q(firebaseMessagingService, k09);
                    j02 = iVar.j0(resources, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(j02)) {
                        qVar.g(j02);
                    }
                    j03 = iVar.j0(resources, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(j03)) {
                        qVar.f(j03);
                        e0.l lVar = new e0.l(false);
                        lVar.f = e0.q.d(j03);
                        qVar.n(lVar);
                    }
                    k02 = iVar.k0("gcm.n.icon");
                    if (!TextUtils.isEmpty(k02)) {
                        i7 = resources.getIdentifier(k02, "drawable", packageName);
                        if ((i7 == 0 || !b(resources, i7)) && ((i7 = resources.getIdentifier(k02, "mipmap", packageName)) == 0 || !b(resources, i7))) {
                            Log.w("FirebaseMessaging", "Icon resource " + k02 + " not found. Notification will use default icon.");
                        }
                        qVar.F.icon = i7;
                        k03 = iVar.k0("gcm.n.sound2");
                        if (TextUtils.isEmpty(k03)) {
                            k03 = iVar.k0("gcm.n.sound");
                        }
                        if (TextUtils.isEmpty(k03)) {
                            defaultUri = null;
                        } else if ("default".equals(k03) || resources.getIdentifier(k03, "raw", packageName) == 0) {
                            defaultUri = RingtoneManager.getDefaultUri(2);
                        } else {
                            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + k03);
                        }
                        if (defaultUri != null) {
                            Notification notification = qVar.F;
                            notification.sound = defaultUri;
                            notification.audioStreamType = -1;
                            notification.audioAttributes = e0.p.a(e0.p.e(e0.p.c(e0.p.b(), 4), 5));
                        }
                        k04 = iVar.k0("gcm.n.click_action");
                        if (TextUtils.isEmpty(k04)) {
                            String k010 = iVar.k0("gcm.n.link_android");
                            if (TextUtils.isEmpty(k010)) {
                                k010 = iVar.k0("gcm.n.link");
                            }
                            Uri parse = !TextUtils.isEmpty(k010) ? Uri.parse(k010) : null;
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
                            launchIntentForPackage = new Intent(k04);
                            launchIntentForPackage.setPackage(packageName);
                            launchIntentForPackage.setFlags(TLObject.FLAG_28);
                        }
                        AtomicInteger atomicInteger = a;
                        if (launchIntentForPackage == null) {
                            activity = null;
                        } else {
                            launchIntentForPackage.addFlags(67108864);
                            Bundle bundle3 = (Bundle) iVar.b;
                            Bundle bundle4 = new Bundle(bundle3);
                            for (String str : bundle3.keySet()) {
                                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                                    bundle4.remove(str);
                                }
                            }
                            launchIntentForPackage.putExtras(bundle4);
                            if (iVar.g0("google.c.a.e")) {
                                launchIntentForPackage.putExtra("gcm.n.analytics_data", iVar.m0());
                            }
                            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
                        }
                        qVar.g = activity;
                        broadcast = !iVar.g0("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.android.c2dm.intent.RECEIVE").setPackage(firebaseMessagingService.getPackageName()).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(iVar.m0())), 1140850688);
                        if (broadcast != null) {
                            qVar.F.deleteIntent = broadcast;
                        }
                        k05 = iVar.k0("gcm.n.color");
                        if (!TextUtils.isEmpty(k05)) {
                            try {
                                valueOf = Integer.valueOf(Color.parseColor(k05));
                            } catch (IllegalArgumentException unused) {
                                Log.w("FirebaseMessaging", "Color is invalid: " + k05 + ". Notification will use default color.");
                            }
                            if (valueOf != null) {
                                qVar.w = valueOf.intValue();
                            }
                            qVar.h(16, !iVar.g0("gcm.n.sticky"));
                            qVar.t = iVar.g0("gcm.n.local_only");
                            k06 = iVar.k0("gcm.n.ticker");
                            if (k06 != null) {
                                qVar.p(k06);
                            }
                            h02 = iVar.h0("gcm.n.notification_priority");
                            if (h02 != null) {
                                if (h02.intValue() < -2 || h02.intValue() > 2) {
                                    Log.w("FirebaseMessaging", "notificationPriority is invalid " + h02 + ". Skipping setting notificationPriority.");
                                }
                                if (h02 != null) {
                                    qVar.j = h02.intValue();
                                }
                                h03 = iVar.h0("gcm.n.visibility");
                                if (h03 != null) {
                                    if (h03.intValue() < -1 || h03.intValue() > 1) {
                                        Log.w("NotificationParams", "visibility is invalid: " + h03 + ". Skipping setting visibility.");
                                    }
                                    if (h03 != null) {
                                        qVar.x = h03.intValue();
                                    }
                                    h04 = iVar.h0("gcm.n.notification_count");
                                    if (h04 != null) {
                                        if (h04.intValue() < 0) {
                                            Log.w("FirebaseMessaging", "notificationCount is invalid: " + h04 + ". Skipping setting notificationCount.");
                                        }
                                        if (h04 != null) {
                                            qVar.i = h04.intValue();
                                        }
                                        k07 = iVar.k0("gcm.n.event_time");
                                        if (!TextUtils.isEmpty(k07)) {
                                            try {
                                                valueOf2 = Long.valueOf(Long.parseLong(k07));
                                            } catch (NumberFormatException unused2) {
                                                Log.w("NotificationParams", "Couldn't parse value of " + d6.i.n0("gcm.n.event_time") + "(" + k07 + ") into a long");
                                            }
                                            if (valueOf2 != null) {
                                                qVar.k = true;
                                                qVar.F.when = valueOf2.longValue();
                                            }
                                            i02 = iVar.i0("gcm.n.vibrate_timings");
                                            if (i02 != null) {
                                                try {
                                                } catch (NumberFormatException | JSONException unused3) {
                                                    Log.w("NotificationParams", "User defined vibrateTimings is invalid: " + i02 + ". Skipping setting vibrateTimings.");
                                                }
                                                if (i02.length() <= 1) {
                                                    throw new JSONException("vibrateTimings have invalid length");
                                                }
                                                int length = i02.length();
                                                jArr = new long[length];
                                                for (int i12 = 0; i12 < length; i12++) {
                                                    jArr[i12] = i02.optLong(i12);
                                                }
                                                if (jArr != null) {
                                                    qVar.F.vibrate = jArr;
                                                }
                                                i03 = iVar.i0("gcm.n.light_settings");
                                                if (i03 != null) {
                                                    int[] iArr2 = new int[3];
                                                    try {
                                                    } catch (IllegalArgumentException e11) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + i03 + ". " + e11.getMessage() + ". Skipping setting LightSettings");
                                                    } catch (JSONException unused4) {
                                                        Log.w("NotificationParams", "LightSettings is invalid: " + i03 + ". Skipping setting LightSettings");
                                                    }
                                                    if (i03.length() != 3) {
                                                        throw new JSONException("lightSettings don't have all three fields");
                                                    }
                                                    int parseColor = Color.parseColor(i03.optString(0));
                                                    if (parseColor == -16777216) {
                                                        throw new IllegalArgumentException("Transparent color is invalid");
                                                    }
                                                    iArr2[0] = parseColor;
                                                    iArr2[1] = i03.optInt(1);
                                                    iArr2[2] = i03.optInt(2);
                                                    iArr = iArr2;
                                                    if (iArr != null) {
                                                        int i13 = iArr[0];
                                                        int i14 = iArr[1];
                                                        int i15 = iArr[2];
                                                        Notification notification2 = qVar.F;
                                                        notification2.ledARGB = i13;
                                                        notification2.ledOnMS = i14;
                                                        notification2.ledOffMS = i15;
                                                        if (i14 != 0 && i15 != 0) {
                                                            i11 = 1;
                                                        }
                                                        notification2.flags = (notification2.flags & (-2)) | i11;
                                                    }
                                                    boolean g02 = iVar.g0("gcm.n.default_sound");
                                                    boolean z9 = g02;
                                                    if (iVar.g0("gcm.n.default_vibrate_timings")) {
                                                        z9 = (g02 ? 1 : 0) | 2;
                                                    }
                                                    r02 = z9;
                                                    if (iVar.g0("gcm.n.default_light_settings")) {
                                                        r02 = (z9 ? 1 : 0) | 4;
                                                    }
                                                    Notification notification3 = qVar.F;
                                                    notification3.defaults = r02;
                                                    if ((r02 & 4) != 0) {
                                                        notification3.flags |= 1;
                                                    }
                                                    k08 = iVar.k0("gcm.n.tag");
                                                    if (TextUtils.isEmpty(k08)) {
                                                        k08 = "FCM-Notification:" + SystemClock.uptimeMillis();
                                                    }
                                                    return new k(qVar, k08);
                                                }
                                                iArr = null;
                                                if (iArr != null) {
                                                }
                                                boolean g022 = iVar.g0("gcm.n.default_sound");
                                                boolean z92 = g022;
                                                if (iVar.g0("gcm.n.default_vibrate_timings")) {
                                                }
                                                r02 = z92;
                                                if (iVar.g0("gcm.n.default_light_settings")) {
                                                }
                                                Notification notification32 = qVar.F;
                                                notification32.defaults = r02;
                                                if ((r02 & 4) != 0) {
                                                }
                                                k08 = iVar.k0("gcm.n.tag");
                                                if (TextUtils.isEmpty(k08)) {
                                                }
                                                return new k(qVar, k08);
                                            }
                                            jArr = null;
                                            if (jArr != null) {
                                            }
                                            i03 = iVar.i0("gcm.n.light_settings");
                                            if (i03 != null) {
                                            }
                                            iArr = null;
                                            if (iArr != null) {
                                            }
                                            boolean g0222 = iVar.g0("gcm.n.default_sound");
                                            boolean z922 = g0222;
                                            if (iVar.g0("gcm.n.default_vibrate_timings")) {
                                            }
                                            r02 = z922;
                                            if (iVar.g0("gcm.n.default_light_settings")) {
                                            }
                                            Notification notification322 = qVar.F;
                                            notification322.defaults = r02;
                                            if ((r02 & 4) != 0) {
                                            }
                                            k08 = iVar.k0("gcm.n.tag");
                                            if (TextUtils.isEmpty(k08)) {
                                            }
                                            return new k(qVar, k08);
                                        }
                                        valueOf2 = null;
                                        if (valueOf2 != null) {
                                        }
                                        i02 = iVar.i0("gcm.n.vibrate_timings");
                                        if (i02 != null) {
                                        }
                                        jArr = null;
                                        if (jArr != null) {
                                        }
                                        i03 = iVar.i0("gcm.n.light_settings");
                                        if (i03 != null) {
                                        }
                                        iArr = null;
                                        if (iArr != null) {
                                        }
                                        boolean g02222 = iVar.g0("gcm.n.default_sound");
                                        boolean z9222 = g02222;
                                        if (iVar.g0("gcm.n.default_vibrate_timings")) {
                                        }
                                        r02 = z9222;
                                        if (iVar.g0("gcm.n.default_light_settings")) {
                                        }
                                        Notification notification3222 = qVar.F;
                                        notification3222.defaults = r02;
                                        if ((r02 & 4) != 0) {
                                        }
                                        k08 = iVar.k0("gcm.n.tag");
                                        if (TextUtils.isEmpty(k08)) {
                                        }
                                        return new k(qVar, k08);
                                    }
                                    h04 = null;
                                    if (h04 != null) {
                                    }
                                    k07 = iVar.k0("gcm.n.event_time");
                                    if (!TextUtils.isEmpty(k07)) {
                                    }
                                    valueOf2 = null;
                                    if (valueOf2 != null) {
                                    }
                                    i02 = iVar.i0("gcm.n.vibrate_timings");
                                    if (i02 != null) {
                                    }
                                    jArr = null;
                                    if (jArr != null) {
                                    }
                                    i03 = iVar.i0("gcm.n.light_settings");
                                    if (i03 != null) {
                                    }
                                    iArr = null;
                                    if (iArr != null) {
                                    }
                                    boolean g022222 = iVar.g0("gcm.n.default_sound");
                                    boolean z92222 = g022222;
                                    if (iVar.g0("gcm.n.default_vibrate_timings")) {
                                    }
                                    r02 = z92222;
                                    if (iVar.g0("gcm.n.default_light_settings")) {
                                    }
                                    Notification notification32222 = qVar.F;
                                    notification32222.defaults = r02;
                                    if ((r02 & 4) != 0) {
                                    }
                                    k08 = iVar.k0("gcm.n.tag");
                                    if (TextUtils.isEmpty(k08)) {
                                    }
                                    return new k(qVar, k08);
                                }
                                h03 = null;
                                if (h03 != null) {
                                }
                                h04 = iVar.h0("gcm.n.notification_count");
                                if (h04 != null) {
                                }
                                h04 = null;
                                if (h04 != null) {
                                }
                                k07 = iVar.k0("gcm.n.event_time");
                                if (!TextUtils.isEmpty(k07)) {
                                }
                                valueOf2 = null;
                                if (valueOf2 != null) {
                                }
                                i02 = iVar.i0("gcm.n.vibrate_timings");
                                if (i02 != null) {
                                }
                                jArr = null;
                                if (jArr != null) {
                                }
                                i03 = iVar.i0("gcm.n.light_settings");
                                if (i03 != null) {
                                }
                                iArr = null;
                                if (iArr != null) {
                                }
                                boolean g0222222 = iVar.g0("gcm.n.default_sound");
                                boolean z922222 = g0222222;
                                if (iVar.g0("gcm.n.default_vibrate_timings")) {
                                }
                                r02 = z922222;
                                if (iVar.g0("gcm.n.default_light_settings")) {
                                }
                                Notification notification322222 = qVar.F;
                                notification322222.defaults = r02;
                                if ((r02 & 4) != 0) {
                                }
                                k08 = iVar.k0("gcm.n.tag");
                                if (TextUtils.isEmpty(k08)) {
                                }
                                return new k(qVar, k08);
                            }
                            h02 = null;
                            if (h02 != null) {
                            }
                            h03 = iVar.h0("gcm.n.visibility");
                            if (h03 != null) {
                            }
                            h03 = null;
                            if (h03 != null) {
                            }
                            h04 = iVar.h0("gcm.n.notification_count");
                            if (h04 != null) {
                            }
                            h04 = null;
                            if (h04 != null) {
                            }
                            k07 = iVar.k0("gcm.n.event_time");
                            if (!TextUtils.isEmpty(k07)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            i02 = iVar.i0("gcm.n.vibrate_timings");
                            if (i02 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            i03 = iVar.i0("gcm.n.light_settings");
                            if (i03 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean g02222222 = iVar.g0("gcm.n.default_sound");
                            boolean z9222222 = g02222222;
                            if (iVar.g0("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z9222222;
                            if (iVar.g0("gcm.n.default_light_settings")) {
                            }
                            Notification notification3222222 = qVar.F;
                            notification3222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            k08 = iVar.k0("gcm.n.tag");
                            if (TextUtils.isEmpty(k08)) {
                            }
                            return new k(qVar, k08);
                        }
                        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                        if (i10 != 0) {
                            try {
                                valueOf = Integer.valueOf(firebaseMessagingService.getColor(i10));
                            } catch (Resources.NotFoundException unused5) {
                                Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                            }
                            if (valueOf != null) {
                            }
                            qVar.h(16, !iVar.g0("gcm.n.sticky"));
                            qVar.t = iVar.g0("gcm.n.local_only");
                            k06 = iVar.k0("gcm.n.ticker");
                            if (k06 != null) {
                            }
                            h02 = iVar.h0("gcm.n.notification_priority");
                            if (h02 != null) {
                            }
                            h02 = null;
                            if (h02 != null) {
                            }
                            h03 = iVar.h0("gcm.n.visibility");
                            if (h03 != null) {
                            }
                            h03 = null;
                            if (h03 != null) {
                            }
                            h04 = iVar.h0("gcm.n.notification_count");
                            if (h04 != null) {
                            }
                            h04 = null;
                            if (h04 != null) {
                            }
                            k07 = iVar.k0("gcm.n.event_time");
                            if (!TextUtils.isEmpty(k07)) {
                            }
                            valueOf2 = null;
                            if (valueOf2 != null) {
                            }
                            i02 = iVar.i0("gcm.n.vibrate_timings");
                            if (i02 != null) {
                            }
                            jArr = null;
                            if (jArr != null) {
                            }
                            i03 = iVar.i0("gcm.n.light_settings");
                            if (i03 != null) {
                            }
                            iArr = null;
                            if (iArr != null) {
                            }
                            boolean g022222222 = iVar.g0("gcm.n.default_sound");
                            boolean z92222222 = g022222222;
                            if (iVar.g0("gcm.n.default_vibrate_timings")) {
                            }
                            r02 = z92222222;
                            if (iVar.g0("gcm.n.default_light_settings")) {
                            }
                            Notification notification32222222 = qVar.F;
                            notification32222222.defaults = r02;
                            if ((r02 & 4) != 0) {
                            }
                            k08 = iVar.k0("gcm.n.tag");
                            if (TextUtils.isEmpty(k08)) {
                            }
                            return new k(qVar, k08);
                        }
                        valueOf = null;
                        if (valueOf != null) {
                        }
                        qVar.h(16, !iVar.g0("gcm.n.sticky"));
                        qVar.t = iVar.g0("gcm.n.local_only");
                        k06 = iVar.k0("gcm.n.ticker");
                        if (k06 != null) {
                        }
                        h02 = iVar.h0("gcm.n.notification_priority");
                        if (h02 != null) {
                        }
                        h02 = null;
                        if (h02 != null) {
                        }
                        h03 = iVar.h0("gcm.n.visibility");
                        if (h03 != null) {
                        }
                        h03 = null;
                        if (h03 != null) {
                        }
                        h04 = iVar.h0("gcm.n.notification_count");
                        if (h04 != null) {
                        }
                        h04 = null;
                        if (h04 != null) {
                        }
                        k07 = iVar.k0("gcm.n.event_time");
                        if (!TextUtils.isEmpty(k07)) {
                        }
                        valueOf2 = null;
                        if (valueOf2 != null) {
                        }
                        i02 = iVar.i0("gcm.n.vibrate_timings");
                        if (i02 != null) {
                        }
                        jArr = null;
                        if (jArr != null) {
                        }
                        i03 = iVar.i0("gcm.n.light_settings");
                        if (i03 != null) {
                        }
                        iArr = null;
                        if (iArr != null) {
                        }
                        boolean g0222222222 = iVar.g0("gcm.n.default_sound");
                        boolean z922222222 = g0222222222;
                        if (iVar.g0("gcm.n.default_vibrate_timings")) {
                        }
                        r02 = z922222222;
                        if (iVar.g0("gcm.n.default_light_settings")) {
                        }
                        Notification notification322222222 = qVar.F;
                        notification322222222.defaults = r02;
                        if ((r02 & 4) != 0) {
                        }
                        k08 = iVar.k0("gcm.n.tag");
                        if (TextUtils.isEmpty(k08)) {
                        }
                        return new k(qVar, k08);
                    }
                    i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i7 != 0 || !b(resources, i7)) {
                        i7 = packageManager.getApplicationInfo(packageName, 0).icon;
                    }
                    if (i7 != 0 || !b(resources, i7)) {
                        i7 = 17301651;
                    }
                    qVar.F.icon = i7;
                    k03 = iVar.k0("gcm.n.sound2");
                    if (TextUtils.isEmpty(k03)) {
                    }
                    if (TextUtils.isEmpty(k03)) {
                    }
                    if (defaultUri != null) {
                    }
                    k04 = iVar.k0("gcm.n.click_action");
                    if (TextUtils.isEmpty(k04)) {
                    }
                    AtomicInteger atomicInteger2 = a;
                    if (launchIntentForPackage == null) {
                    }
                    qVar.g = activity;
                    if (!iVar.g0("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    k05 = iVar.k0("gcm.n.color");
                    if (!TextUtils.isEmpty(k05)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i10 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    qVar.h(16, !iVar.g0("gcm.n.sticky"));
                    qVar.t = iVar.g0("gcm.n.local_only");
                    k06 = iVar.k0("gcm.n.ticker");
                    if (k06 != null) {
                    }
                    h02 = iVar.h0("gcm.n.notification_priority");
                    if (h02 != null) {
                    }
                    h02 = null;
                    if (h02 != null) {
                    }
                    h03 = iVar.h0("gcm.n.visibility");
                    if (h03 != null) {
                    }
                    h03 = null;
                    if (h03 != null) {
                    }
                    h04 = iVar.h0("gcm.n.notification_count");
                    if (h04 != null) {
                    }
                    h04 = null;
                    if (h04 != null) {
                    }
                    k07 = iVar.k0("gcm.n.event_time");
                    if (!TextUtils.isEmpty(k07)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    i02 = iVar.i0("gcm.n.vibrate_timings");
                    if (i02 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    i03 = iVar.i0("gcm.n.light_settings");
                    if (i03 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean g02222222222 = iVar.g0("gcm.n.default_sound");
                    boolean z9222222222 = g02222222222;
                    if (iVar.g0("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z9222222222;
                    if (iVar.g0("gcm.n.default_light_settings")) {
                    }
                    Notification notification3222222222 = qVar.F;
                    notification3222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    k08 = iVar.k0("gcm.n.tag");
                    if (TextUtils.isEmpty(k08)) {
                    }
                    return new k(qVar, k08);
                }
                k09 = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (!TextUtils.isEmpty(k09)) {
                    if (notificationManager.getNotificationChannel(k09) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                    }
                    packageName = firebaseMessagingService.getPackageName();
                    Resources resources2 = firebaseMessagingService.getResources();
                    packageManager = firebaseMessagingService.getPackageManager();
                    e0.q qVar2 = new e0.q(firebaseMessagingService, k09);
                    j02 = iVar.j0(resources2, packageName, "gcm.n.title");
                    if (!TextUtils.isEmpty(j02)) {
                    }
                    j03 = iVar.j0(resources2, packageName, "gcm.n.body");
                    if (!TextUtils.isEmpty(j03)) {
                    }
                    k02 = iVar.k0("gcm.n.icon");
                    if (!TextUtils.isEmpty(k02)) {
                    }
                    i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                    if (i7 != 0) {
                    }
                    i7 = packageManager.getApplicationInfo(packageName, 0).icon;
                    if (i7 != 0) {
                    }
                    i7 = 17301651;
                    qVar2.F.icon = i7;
                    k03 = iVar.k0("gcm.n.sound2");
                    if (TextUtils.isEmpty(k03)) {
                    }
                    if (TextUtils.isEmpty(k03)) {
                    }
                    if (defaultUri != null) {
                    }
                    k04 = iVar.k0("gcm.n.click_action");
                    if (TextUtils.isEmpty(k04)) {
                    }
                    AtomicInteger atomicInteger22 = a;
                    if (launchIntentForPackage == null) {
                    }
                    qVar2.g = activity;
                    if (!iVar.g0("google.c.a.e")) {
                    }
                    if (broadcast != null) {
                    }
                    k05 = iVar.k0("gcm.n.color");
                    if (!TextUtils.isEmpty(k05)) {
                    }
                    i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                    if (i10 != 0) {
                    }
                    valueOf = null;
                    if (valueOf != null) {
                    }
                    qVar2.h(16, !iVar.g0("gcm.n.sticky"));
                    qVar2.t = iVar.g0("gcm.n.local_only");
                    k06 = iVar.k0("gcm.n.ticker");
                    if (k06 != null) {
                    }
                    h02 = iVar.h0("gcm.n.notification_priority");
                    if (h02 != null) {
                    }
                    h02 = null;
                    if (h02 != null) {
                    }
                    h03 = iVar.h0("gcm.n.visibility");
                    if (h03 != null) {
                    }
                    h03 = null;
                    if (h03 != null) {
                    }
                    h04 = iVar.h0("gcm.n.notification_count");
                    if (h04 != null) {
                    }
                    h04 = null;
                    if (h04 != null) {
                    }
                    k07 = iVar.k0("gcm.n.event_time");
                    if (!TextUtils.isEmpty(k07)) {
                    }
                    valueOf2 = null;
                    if (valueOf2 != null) {
                    }
                    i02 = iVar.i0("gcm.n.vibrate_timings");
                    if (i02 != null) {
                    }
                    jArr = null;
                    if (jArr != null) {
                    }
                    i03 = iVar.i0("gcm.n.light_settings");
                    if (i03 != null) {
                    }
                    iArr = null;
                    if (iArr != null) {
                    }
                    boolean g022222222222 = iVar.g0("gcm.n.default_sound");
                    boolean z92222222222 = g022222222222;
                    if (iVar.g0("gcm.n.default_vibrate_timings")) {
                    }
                    r02 = z92222222222;
                    if (iVar.g0("gcm.n.default_light_settings")) {
                    }
                    Notification notification32222222222 = qVar2.F;
                    notification32222222222.defaults = r02;
                    if ((r02 & 4) != 0) {
                    }
                    k08 = iVar.k0("gcm.n.tag");
                    if (TextUtils.isEmpty(k08)) {
                    }
                    return new k(qVar2, k08);
                }
                Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                k09 = "fcm_fallback_notification_channel";
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
                e0.q qVar22 = new e0.q(firebaseMessagingService, k09);
                j02 = iVar.j0(resources22, packageName, "gcm.n.title");
                if (!TextUtils.isEmpty(j02)) {
                }
                j03 = iVar.j0(resources22, packageName, "gcm.n.body");
                if (!TextUtils.isEmpty(j03)) {
                }
                k02 = iVar.k0("gcm.n.icon");
                if (!TextUtils.isEmpty(k02)) {
                }
                i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                if (i7 != 0) {
                }
                i7 = packageManager.getApplicationInfo(packageName, 0).icon;
                if (i7 != 0) {
                }
                i7 = 17301651;
                qVar22.F.icon = i7;
                k03 = iVar.k0("gcm.n.sound2");
                if (TextUtils.isEmpty(k03)) {
                }
                if (TextUtils.isEmpty(k03)) {
                }
                if (defaultUri != null) {
                }
                k04 = iVar.k0("gcm.n.click_action");
                if (TextUtils.isEmpty(k04)) {
                }
                AtomicInteger atomicInteger222 = a;
                if (launchIntentForPackage == null) {
                }
                qVar22.g = activity;
                if (!iVar.g0("google.c.a.e")) {
                }
                if (broadcast != null) {
                }
                k05 = iVar.k0("gcm.n.color");
                if (!TextUtils.isEmpty(k05)) {
                }
                i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i10 != 0) {
                }
                valueOf = null;
                if (valueOf != null) {
                }
                qVar22.h(16, !iVar.g0("gcm.n.sticky"));
                qVar22.t = iVar.g0("gcm.n.local_only");
                k06 = iVar.k0("gcm.n.ticker");
                if (k06 != null) {
                }
                h02 = iVar.h0("gcm.n.notification_priority");
                if (h02 != null) {
                }
                h02 = null;
                if (h02 != null) {
                }
                h03 = iVar.h0("gcm.n.visibility");
                if (h03 != null) {
                }
                h03 = null;
                if (h03 != null) {
                }
                h04 = iVar.h0("gcm.n.notification_count");
                if (h04 != null) {
                }
                h04 = null;
                if (h04 != null) {
                }
                k07 = iVar.k0("gcm.n.event_time");
                if (!TextUtils.isEmpty(k07)) {
                }
                valueOf2 = null;
                if (valueOf2 != null) {
                }
                i02 = iVar.i0("gcm.n.vibrate_timings");
                if (i02 != null) {
                }
                jArr = null;
                if (jArr != null) {
                }
                i03 = iVar.i0("gcm.n.light_settings");
                if (i03 != null) {
                }
                iArr = null;
                if (iArr != null) {
                }
                boolean g0222222222222 = iVar.g0("gcm.n.default_sound");
                boolean z922222222222 = g0222222222222;
                if (iVar.g0("gcm.n.default_vibrate_timings")) {
                }
                r02 = z922222222222;
                if (iVar.g0("gcm.n.default_light_settings")) {
                }
                Notification notification322222222222 = qVar22.F;
                notification322222222222.defaults = r02;
                if ((r02 & 4) != 0) {
                }
                k08 = iVar.k0("gcm.n.tag");
                if (TextUtils.isEmpty(k08)) {
                }
                return new k(qVar22, k08);
            }
        }
        k09 = null;
        packageName = firebaseMessagingService.getPackageName();
        Resources resources222 = firebaseMessagingService.getResources();
        packageManager = firebaseMessagingService.getPackageManager();
        e0.q qVar222 = new e0.q(firebaseMessagingService, k09);
        j02 = iVar.j0(resources222, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(j02)) {
        }
        j03 = iVar.j0(resources222, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(j03)) {
        }
        k02 = iVar.k0("gcm.n.icon");
        if (!TextUtils.isEmpty(k02)) {
        }
        i7 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i7 != 0) {
        }
        i7 = packageManager.getApplicationInfo(packageName, 0).icon;
        if (i7 != 0) {
        }
        i7 = 17301651;
        qVar222.F.icon = i7;
        k03 = iVar.k0("gcm.n.sound2");
        if (TextUtils.isEmpty(k03)) {
        }
        if (TextUtils.isEmpty(k03)) {
        }
        if (defaultUri != null) {
        }
        k04 = iVar.k0("gcm.n.click_action");
        if (TextUtils.isEmpty(k04)) {
        }
        AtomicInteger atomicInteger2222 = a;
        if (launchIntentForPackage == null) {
        }
        qVar222.g = activity;
        if (!iVar.g0("google.c.a.e")) {
        }
        if (broadcast != null) {
        }
        k05 = iVar.k0("gcm.n.color");
        if (!TextUtils.isEmpty(k05)) {
        }
        i10 = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i10 != 0) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        qVar222.h(16, !iVar.g0("gcm.n.sticky"));
        qVar222.t = iVar.g0("gcm.n.local_only");
        k06 = iVar.k0("gcm.n.ticker");
        if (k06 != null) {
        }
        h02 = iVar.h0("gcm.n.notification_priority");
        if (h02 != null) {
        }
        h02 = null;
        if (h02 != null) {
        }
        h03 = iVar.h0("gcm.n.visibility");
        if (h03 != null) {
        }
        h03 = null;
        if (h03 != null) {
        }
        h04 = iVar.h0("gcm.n.notification_count");
        if (h04 != null) {
        }
        h04 = null;
        if (h04 != null) {
        }
        k07 = iVar.k0("gcm.n.event_time");
        if (!TextUtils.isEmpty(k07)) {
        }
        valueOf2 = null;
        if (valueOf2 != null) {
        }
        i02 = iVar.i0("gcm.n.vibrate_timings");
        if (i02 != null) {
        }
        jArr = null;
        if (jArr != null) {
        }
        i03 = iVar.i0("gcm.n.light_settings");
        if (i03 != null) {
        }
        iArr = null;
        if (iArr != null) {
        }
        boolean g02222222222222 = iVar.g0("gcm.n.default_sound");
        boolean z9222222222222 = g02222222222222;
        if (iVar.g0("gcm.n.default_vibrate_timings")) {
        }
        r02 = z9222222222222;
        if (iVar.g0("gcm.n.default_light_settings")) {
        }
        Notification notification3222222222222 = qVar222.F;
        notification3222222222222.defaults = r02;
        if ((r02 & 4) != 0) {
        }
        k08 = iVar.k0("gcm.n.tag");
        if (TextUtils.isEmpty(k08)) {
        }
        return new k(qVar222, k08);
    }

    public static boolean b(Resources resources, int i7) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i7, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i7);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i7 + ", treating it as an invalid icon");
            return false;
        }
    }
}
