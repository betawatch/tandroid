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
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import v7.n6;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class FirebaseMessagingService extends g {
    public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
    static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
    static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
    static final String EXTRA_TOKEN = "token";
    private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
    private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
    private j6.a rpc;

    public static void resetForTesting() {
        recentlyReceivedMessageIds.clear();
    }

    @Override // com.google.firebase.messaging.g
    public Intent getStartCommandIntent(Intent intent) {
        return (Intent) ((ArrayDeque) s.b().e).poll();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0290 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0278 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x025c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f7  */
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
        char c10;
        int parseInt;
        int i10;
        String string;
        String string2;
        String string3;
        long parseLong;
        String str;
        String str2;
        j6.a aVar;
        int i11;
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
                    this.rpc = new j6.a(getApplicationContext());
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
                j6.l l4 = j6.l.l(aVar.b);
                synchronized (l4) {
                    i11 = l4.a;
                    l4.a = i11 + 1;
                }
                l4.m(new j6.k(i11, 3, bundle2, 0));
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
                if (n6.b(intent)) {
                    n6.a("_nr", intent.getExtras());
                }
                if (!ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) {
                    try {
                        k9.h.c();
                        k9.h c11 = k9.h.c();
                        c11.a();
                        Context context = c11.a;
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
                        i5.f fVar = FirebaseMessaging.m;
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
                                            c10 = 1;
                                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                                        }
                                    } else {
                                        c10 = 1;
                                    }
                                    i10 = 0;
                                    string = extras2.getString("google.to");
                                    if (TextUtils.isEmpty(string)) {
                                        try {
                                            k9.h c12 = k9.h.c();
                                            Object obj2 = qa.c.m;
                                            string = (String) Tasks.await(((qa.c) c12.b(qa.d.class)).d());
                                        } catch (InterruptedException | ExecutionException e7) {
                                            throw new RuntimeException(e7);
                                        }
                                    }
                                    String str3 = string;
                                    k9.h c13 = k9.h.c();
                                    c13.a();
                                    String packageName = c13.a.getPackageName();
                                    wa.b bVar = !xa.c.L(extras2) ? wa.b.c : wa.b.b;
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
                                        } catch (NumberFormatException e10) {
                                            Log.w("FirebaseMessaging", "error parsing project number", e10);
                                        }
                                        ((l5.q) fVar).a("FCM_CLIENT_EVENT_LOGGING", new i5.c("proto"), new androidx.emoji2.text.w(26)).a(new i5.a(null, new wa.e(new wa.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, str5, str7, str8)), i5.d.a, new i5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new j2.e(17));
                                    }
                                    k9.h c14 = k9.h.c();
                                    k9.j jVar = c14.c;
                                    c14.a();
                                    str = jVar.e;
                                    if (str != null) {
                                        try {
                                            parseLong = Long.parseLong(str);
                                        } catch (NumberFormatException e11) {
                                            Log.w("FirebaseMessaging", "error parsing sender ID", e11);
                                        }
                                        ((l5.q) fVar).a("FCM_CLIENT_EVENT_LOGGING", new i5.c("proto"), new androidx.emoji2.text.w(26)).a(new i5.a(null, new wa.e(new wa.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, str5, str7, str8)), i5.d.a, new i5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new j2.e(17));
                                    }
                                    c14.a();
                                    str2 = jVar.b;
                                    if (str2.startsWith("1:")) {
                                        try {
                                            parseLong = Long.parseLong(str2);
                                        } catch (NumberFormatException e12) {
                                            Log.w("FirebaseMessaging", "error parsing app ID", e12);
                                        }
                                    } else {
                                        String[] split = str2.split(":");
                                        if (split.length >= 2) {
                                            String str9 = split[c10];
                                            if (!str9.isEmpty()) {
                                                try {
                                                    parseLong = Long.parseLong(str9);
                                                } catch (NumberFormatException e13) {
                                                    Log.w("FirebaseMessaging", "error parsing app ID", e13);
                                                }
                                            }
                                        }
                                        parseLong = 0;
                                    }
                                    ((l5.q) fVar).a("FCM_CLIENT_EVENT_LOGGING", new i5.c("proto"), new androidx.emoji2.text.w(26)).a(new i5.a(null, new wa.e(new wa.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, str5, str7, str8)), i5.d.a, new i5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new j2.e(17));
                                }
                                ((l5.q) fVar).a("FCM_CLIENT_EVENT_LOGGING", new i5.c("proto"), new androidx.emoji2.text.w(26)).a(new i5.a(null, new wa.e(new wa.d(parseLong <= 0 ? parseLong : 0L, str4, str3, bVar, packageName, str6, i10, str5, str7, str8)), i5.d.a, new i5.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new j2.e(17));
                            } catch (RuntimeException e14) {
                                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e14);
                            }
                            i10 = parseInt;
                            c10 = 1;
                            string = extras2.getString("google.to");
                            if (TextUtils.isEmpty(string)) {
                            }
                            String str32 = string;
                            k9.h c132 = k9.h.c();
                            c132.a();
                            String packageName2 = c132.a.getPackageName();
                            wa.b bVar2 = !xa.c.L(extras2) ? wa.b.c : wa.b.b;
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
                            k9.h c142 = k9.h.c();
                            k9.j jVar2 = c142.c;
                            c142.a();
                            str = jVar2.e;
                            if (str != null) {
                            }
                            c142.a();
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
                    if (xa.c.L(extras)) {
                        xa.c cVar = new xa.c(extras);
                        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new c5.w("Firebase-Messaging-Network-Io"));
                        try {
                            if (new aa.a(this, cVar, newSingleThreadExecutor, 11).w()) {
                                break;
                            } else {
                                newSingleThreadExecutor.shutdown();
                                if (n6.b(intent)) {
                                    n6.a("_nf", intent.getExtras());
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
                if (xa.c.L(extras)) {
                }
                onMessageReceived(new r(extras));
                break;
            case "send_error":
                String stringExtra4 = intent.getStringExtra("google.message_id");
                if (stringExtra4 == null) {
                    stringExtra4 = intent.getStringExtra("message_id");
                }
                String stringExtra5 = intent.getStringExtra("error");
                cc.k kVar = new cc.k(stringExtra5);
                if (stringExtra5 != null) {
                    stringExtra5.toLowerCase(Locale.US).getClass();
                }
                onSendError(stringExtra4, kVar);
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

    public void setRpcForTesting(j6.a aVar) {
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
