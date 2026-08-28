package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import f7.o6;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends g {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private t5.a rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.g
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) t.v().e).poll();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x028a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0272 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0256 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f1  */
    @Override // com.google.firebase.messaging.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void handleIntent(Intent intent) {
        String stringExtra;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        boolean z10;
        Bundle extras;
        int parseInt;
        int i9;
        String string;
        String string2;
        String string3;
        long parseLong;
        String str;
        String str2;
        t5.a aVar;
        int i10;
        String action = intent.getAction();
        if (!ACTION_REMOTE_INTENT.equals(action) && !ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(action)) {
            if (ACTION_NEW_TOKEN.equals(action)) {
                onNewToken(intent.getStringExtra(EXTRA_TOKEN));
                return;
            }
            Log.d("FirebaseMessaging", "Unknown intent action: " + intent.getAction());
            return;
        }
        String stringExtra2 = intent.getStringExtra("google.message_id");
        if (!TextUtils.isEmpty(stringExtra2)) {
            Queue<String> queue = recentlyReceivedMessageIds;
            if (queue.contains(stringExtra2)) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received duplicate message: " + stringExtra2);
                }
                if (this.rpc == null) {
                    this.rpc = new t5.a(getApplicationContext());
                }
                aVar = this.rpc;
                if (aVar.c.f() >= 233700000) {
                    Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
                    return;
                }
                Bundle bundle2 = new Bundle();
                String stringExtra3 = intent.getStringExtra("google.message_id");
                if (stringExtra3 == null) {
                    stringExtra3 = intent.getStringExtra("message_id");
                }
                bundle2.putString("google.message_id", stringExtra3);
                Integer valueOf = intent.hasExtra("google.product_id") ? Integer.valueOf(intent.getIntExtra("google.product_id", 0)) : null;
                if (valueOf != null) {
                    bundle2.putInt("google.product_id", valueOf.intValue());
                }
                t5.l b10 = t5.l.b(aVar.b);
                synchronized (b10) {
                    i10 = b10.a;
                    b10.a = i10 + 1;
                }
                b10.c(new t5.k(i10, 3, bundle2, 0));
                return;
            }
            if (queue.size() >= 10) {
                queue.remove();
            }
            queue.add(stringExtra2);
        }
        stringExtra = intent.getStringExtra("message_type");
        if (stringExtra == null) {
            stringExtra = "gcm";
        }
        switch (stringExtra) {
            case "deleted_messages":
                onDeletedMessages();
                break;
            case "gcm":
                if (o6.b(intent)) {
                    o6.a("_nr", intent.getExtras());
                }
                if (!ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) {
                    try {
                        s8.h.c();
                        s8.h c10 = s8.h.c();
                        c10.a();
                        Context context = c10.a;
                        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
                        if (sharedPreferences.contains("export_to_big_query")) {
                            z10 = sharedPreferences.getBoolean("export_to_big_query", false);
                        } else {
                            try {
                                PackageManager packageManager = context.getPackageManager();
                                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                                    z10 = applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
                    } catch (IllegalStateException unused2) {
                        Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
                    }
                    if (z10) {
                        t2.f fVar = FirebaseMessaging.m;
                        if (fVar == null) {
                            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                        } else {
                            Bundle extras2 = intent.getExtras();
                            if (extras2 == null) {
                                extras2 = Bundle.EMPTY;
                            }
                            Object obj = extras2.get("google.ttl");
                            try {
                                if (obj instanceof Integer) {
                                    parseInt = ((Integer) obj).intValue();
                                } else {
                                    if (obj instanceof String) {
                                        try {
                                            parseInt = Integer.parseInt((String) obj);
                                        } catch (NumberFormatException unused3) {
                                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                                        }
                                    }
                                    i9 = 0;
                                    string = extras2.getString("google.to");
                                    if (TextUtils.isEmpty(string)) {
                                        try {
                                            s8.h c11 = s8.h.c();
                                            Object obj2 = y9.c.m;
                                            string = (String) Tasks.await(((y9.c) c11.b(y9.d.class)).d());
                                        } catch (InterruptedException | ExecutionException e10) {
                                            throw new RuntimeException(e10);
                                        }
                                    }
                                    String str3 = string;
                                    s8.h c12 = s8.h.c();
                                    c12.a();
                                    String packageName = c12.a.getPackageName();
                                    ea.b bVar = !k5.i.L(extras2) ? ea.b.c : ea.b.b;
                                    string2 = extras2.getString("google.message_id");
                                    if (string2 == null) {
                                        string2 = extras2.getString("message_id");
                                    }
                                    String str4 = string2 == null ? string2 : "";
                                    string3 = extras2.getString("from");
                                    if (string3 != null || !string3.startsWith("/topics/")) {
                                        string3 = null;
                                    }
                                    String str5 = string3 == null ? string3 : "";
                                    String string4 = extras2.getString("collapse_key");
                                    String str6 = string4 == null ? string4 : "";
                                    String string5 = extras2.getString("google.c.a.m_l");
                                    String str7 = string5 == null ? string5 : "";
                                    String string6 = extras2.getString("google.c.a.c_l");
                                    String str8 = string6 == null ? string6 : "";
                                    if (extras2.containsKey("google.c.sender.id")) {
                                        try {
                                            parseLong = Long.parseLong(extras2.getString("google.c.sender.id"));
                                        } catch (NumberFormatException e11) {
                                            Log.w("FirebaseMessaging", "error parsing project number", e11);
                                        }
                                        ((w2.o) fVar).a("FCM_CLIENT_EVENT_LOGGING", new t2.c("proto"), new a9.b(18)).a(new t2.a(null, new ea.e(new ea.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i9, str5, str7, str8)), t2.d.a, new t2.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new v0.l(1));
                                    }
                                    s8.h c13 = s8.h.c();
                                    s8.j jVar = c13.c;
                                    c13.a();
                                    str = jVar.e;
                                    if (str != null) {
                                        try {
                                            parseLong = Long.parseLong(str);
                                        } catch (NumberFormatException e12) {
                                            Log.w("FirebaseMessaging", "error parsing sender ID", e12);
                                        }
                                        ((w2.o) fVar).a("FCM_CLIENT_EVENT_LOGGING", new t2.c("proto"), new a9.b(18)).a(new t2.a(null, new ea.e(new ea.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i9, str5, str7, str8)), t2.d.a, new t2.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new v0.l(1));
                                    }
                                    c13.a();
                                    str2 = jVar.b;
                                    if (str2.startsWith("1:")) {
                                        try {
                                            parseLong = Long.parseLong(str2);
                                        } catch (NumberFormatException e13) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e13);
                                        }
                                    } else {
                                        String[] split = str2.split(":");
                                        if (split.length >= 2) {
                                            String str9 = split[1];
                                            if (!str9.isEmpty()) {
                                                try {
                                                    parseLong = Long.parseLong(str9);
                                                } catch (NumberFormatException e14) {
                                                    Log.w("FirebaseMessaging", "error parsing app ID", e14);
                                                }
                                            }
                                        }
                                        parseLong = 0;
                                    }
                                    ((w2.o) fVar).a("FCM_CLIENT_EVENT_LOGGING", new t2.c("proto"), new a9.b(18)).a(new t2.a(null, new ea.e(new ea.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i9, str5, str7, str8)), t2.d.a, new t2.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new v0.l(1));
                                }
                                ((w2.o) fVar).a("FCM_CLIENT_EVENT_LOGGING", new t2.c("proto"), new a9.b(18)).a(new t2.a(null, new ea.e(new ea.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i9, str5, str7, str8)), t2.d.a, new t2.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new v0.l(1));
                            } catch (RuntimeException e15) {
                                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e15);
                            }
                            i9 = parseInt;
                            string = extras2.getString("google.to");
                            if (TextUtils.isEmpty(string)) {
                            }
                            String str32 = string;
                            s8.h c122 = s8.h.c();
                            c122.a();
                            String packageName2 = c122.a.getPackageName();
                            ea.b bVar2 = !k5.i.L(extras2) ? ea.b.c : ea.b.b;
                            string2 = extras2.getString("google.message_id");
                            if (string2 == null) {
                            }
                            if (string2 == null) {
                            }
                            string3 = extras2.getString("from");
                            if (string3 != null) {
                            }
                            string3 = null;
                            if (string3 == null) {
                            }
                            String string42 = extras2.getString("collapse_key");
                            if (string42 == null) {
                            }
                            String string52 = extras2.getString("google.c.a.m_l");
                            if (string52 == null) {
                            }
                            String string62 = extras2.getString("google.c.a.c_l");
                            if (string62 == null) {
                            }
                            if (extras2.containsKey("google.c.sender.id")) {
                            }
                            s8.h c132 = s8.h.c();
                            s8.j jVar2 = c132.c;
                            c132.a();
                            str = jVar2.e;
                            if (str != null) {
                            }
                            c132.a();
                            str2 = jVar2.b;
                            if (str2.startsWith("1:")) {
                            }
                        }
                    }
                    extras = intent.getExtras();
                    if (extras == null) {
                        extras = new Bundle();
                    }
                    extras.remove("androidx.content.wakelockid");
                    if (k5.i.L(extras)) {
                        k5.i iVar = new k5.i(extras);
                        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new e9.v("Firebase-Messaging-Network-Io"));
                        try {
                            if (new a5.m(this, iVar, newSingleThreadExecutor).w()) {
                                break;
                            } else {
                                newSingleThreadExecutor.shutdown();
                                if (o6.b(intent)) {
                                    o6.a("_nf", intent.getExtras());
                                }
                            }
                        } finally {
                            newSingleThreadExecutor.shutdown();
                        }
                    }
                    onMessageReceived(new r(extras));
                    break;
                }
                z10 = false;
                if (z10) {
                }
                extras = intent.getExtras();
                if (extras == null) {
                }
                extras.remove("androidx.content.wakelockid");
                if (k5.i.L(extras)) {
                }
                onMessageReceived(new r(extras));
                break;
            case "send_error":
                String stringExtra4 = intent.getStringExtra("google.message_id");
                if (stringExtra4 == null) {
                    stringExtra4 = intent.getStringExtra("message_id");
                }
                String stringExtra5 = intent.getStringExtra("error");
                s sVar = new s(stringExtra5);
                if (stringExtra5 != null) {
                    stringExtra5.toLowerCase(Locale.US).getClass();
                }
                onSendError(stringExtra4, sVar);
                break;
            case "send_event":
                onMessageSent(intent.getStringExtra("google.message_id"));
                break;
            default:
                Log.w("FirebaseMessaging", "Received message with unknown type: ".concat(stringExtra));
                break;
        }
        if (this.rpc == null) {
        }
        aVar = this.rpc;
        if (aVar.c.f() >= 233700000) {
        }
    }

    public void setRpcForTesting(t5.a aVar) {
        this.rpc = aVar;
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(r rVar) {
    }

    public void onMessageSent(String str) {
    }

    public void onNewToken(String str) {
    }

    public void onSendError(String str, Exception exc) {
    }
}
