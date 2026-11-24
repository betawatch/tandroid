// default package

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class e7f {
    public static final ce6 u = new ce6("MediaNotificationProxy", null);
    public final Context a;
    public final NotificationManager b;
    public final tn7 c;
    public final ComponentName d;
    public final ComponentName e;
    public ArrayList f = new ArrayList();
    public int[] g;
    public final long h;
    public final sm2 i;
    public final Resources j;
    public zz0 k;
    public xab l;
    public pm7 m;
    public pm7 n;
    public pm7 o;
    public pm7 p;
    public pm7 q;
    public pm7 r;
    public pm7 s;
    public pm7 t;

    public e7f(Context context) {
        this.a = context;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        this.b = notificationManager;
        ce6 ce6Var = ie1.l;
        ite.e("Must be called from the main thread.");
        ie1 ie1Var = ie1.n;
        ite.h(ie1Var);
        ite.e("Must be called from the main thread.");
        le1 le1Var = ie1Var.e;
        ite.h(le1Var);
        je1 je1Var = le1Var.f;
        ite.h(je1Var);
        tn7 tn7Var = je1Var.d;
        ite.h(tn7Var);
        this.c = tn7Var;
        je1Var.b();
        Resources resources = context.getResources();
        this.j = resources;
        this.d = new ComponentName(context.getApplicationContext(), je1Var.a);
        String str = tn7Var.d;
        if (TextUtils.isEmpty(str)) {
            this.e = null;
        } else {
            this.e = new ComponentName(context.getApplicationContext(), str);
        }
        this.h = tn7Var.c;
        int dimensionPixelSize = resources.getDimensionPixelSize(tn7Var.I);
        this.i = new sm2(context.getApplicationContext(), new em5(1, dimensionPixelSize, dimensionPixelSize));
        if (ate.a() && notificationManager != null) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", context.getResources().getString(R.string.media_notification_channel_name), 2);
            notificationChannel.setShowBadge(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        k7f.a(m3f.v0);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final pm7 a(String str) {
        int i;
        int i2;
        int hashCode = str.hashCode();
        long j = this.h;
        PendingIntent pendingIntent = null;
        Resources resources = this.j;
        Context context = this.a;
        ComponentName componentName = this.d;
        tn7 tn7Var = this.c;
        switch (hashCode) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    pm7 pm7Var = this.r;
                    if (pm7Var != null) {
                        return pm7Var;
                    }
                    Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                    intent.setComponent(componentName);
                    intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intent, 201326592);
                    ce6 ce6Var = yif.a;
                    int i3 = tn7Var.E;
                    if (j == 10000) {
                        i3 = tn7Var.F;
                    } else if (j == 30000) {
                        i3 = tn7Var.G;
                    }
                    int i4 = tn7Var.S;
                    if (j == 10000) {
                        i4 = tn7Var.T;
                    } else if (j == 30000) {
                        i4 = tn7Var.U;
                    }
                    pm7 b = new om7(i3, broadcast, resources.getString(i4)).b();
                    this.r = b;
                    return b;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    boolean z = this.k.c;
                    pm7 pm7Var2 = this.o;
                    if (pm7Var2 != null) {
                        return pm7Var2;
                    }
                    if (z) {
                        Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                        intent2.setComponent(componentName);
                        pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, 67108864);
                    }
                    pm7 b2 = new om7(tn7Var.r, pendingIntent, resources.getString(tn7Var.N)).b();
                    this.o = b2;
                    return b2;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    boolean z2 = this.k.d;
                    pm7 pm7Var3 = this.p;
                    if (pm7Var3 != null) {
                        return pm7Var3;
                    }
                    if (z2) {
                        Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                        intent3.setComponent(componentName);
                        pendingIntent = PendingIntent.getBroadcast(context, 0, intent3, 67108864);
                    }
                    pm7 b3 = new om7(tn7Var.s, pendingIntent, resources.getString(tn7Var.O)).b();
                    this.p = b3;
                    return b3;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    pm7 pm7Var4 = this.t;
                    if (pm7Var4 != null) {
                        return pm7Var4;
                    }
                    Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                    intent4.setComponent(componentName);
                    pm7 b4 = new om7(tn7Var.H, PendingIntent.getBroadcast(context, 0, intent4, 67108864), resources.getString(tn7Var.V)).b();
                    this.t = b4;
                    return b4;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    pm7 pm7Var5 = this.s;
                    if (pm7Var5 != null) {
                        return pm7Var5;
                    }
                    Intent intent5 = new Intent(MediaIntentReceiver.ACTION_DISCONNECT);
                    intent5.setComponent(componentName);
                    pm7 b5 = new om7(tn7Var.H, PendingIntent.getBroadcast(context, 0, intent5, 67108864), resources.getString(tn7Var.V, "")).b();
                    this.s = b5;
                    return b5;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    zz0 zz0Var = this.k;
                    int i5 = zz0Var.b;
                    if (!zz0Var.a) {
                        pm7 pm7Var6 = this.m;
                        if (pm7Var6 != null) {
                            return pm7Var6;
                        }
                        Intent intent6 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                        intent6.setComponent(componentName);
                        pm7 b6 = new om7(tn7Var.n, PendingIntent.getBroadcast(context, 0, intent6, 67108864), resources.getString(tn7Var.M)).b();
                        this.m = b6;
                        return b6;
                    }
                    pm7 pm7Var7 = this.n;
                    if (pm7Var7 != null) {
                        return pm7Var7;
                    }
                    if (i5 == 2) {
                        i = tn7Var.f;
                        i2 = tn7Var.K;
                    } else {
                        i = tn7Var.h;
                        i2 = tn7Var.L;
                    }
                    Intent intent7 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                    intent7.setComponent(componentName);
                    pm7 b7 = new om7(i, PendingIntent.getBroadcast(context, 0, intent7, 67108864), resources.getString(i2)).b();
                    this.n = b7;
                    return b7;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    pm7 pm7Var8 = this.q;
                    if (pm7Var8 != null) {
                        return pm7Var8;
                    }
                    Intent intent8 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                    intent8.setComponent(componentName);
                    intent8.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j);
                    PendingIntent broadcast2 = PendingIntent.getBroadcast(context, 0, intent8, 201326592);
                    ce6 ce6Var2 = yif.a;
                    int i6 = tn7Var.w;
                    if (j == 10000) {
                        i6 = tn7Var.x;
                    } else if (j == 30000) {
                        i6 = tn7Var.y;
                    }
                    int i7 = tn7Var.P;
                    if (j == 10000) {
                        i7 = tn7Var.Q;
                    } else if (j == 30000) {
                        i7 = tn7Var.R;
                    }
                    pm7 b8 = new om7(i6, broadcast2, resources.getString(i7)).b();
                    this.q = b8;
                    return b8;
                }
                break;
        }
        ce6 ce6Var3 = u;
        Log.e(ce6Var3.a, ce6Var3.d("Action: %s is not a pre-defined action.", str));
        return null;
    }

    public final void b() {
        PendingIntent activities;
        pm7 a;
        NotificationManager notificationManager = this.b;
        if (notificationManager == null || this.k == null) {
            return;
        }
        xab xabVar = this.l;
        Bitmap bitmap = xabVar == null ? null : (Bitmap) xabVar.c;
        Context context = this.a;
        an7 an7Var = new an7(context, "cast_media_notification");
        an7Var.g(bitmap);
        tn7 tn7Var = this.c;
        an7Var.F.icon = tn7Var.e;
        an7Var.e = an7.c((String) this.k.f);
        int i = 0;
        an7Var.f = an7.c(this.j.getString(tn7Var.J, (String) this.k.g));
        an7Var.f(2, true);
        an7Var.k = false;
        an7Var.x = 1;
        ComponentName componentName = this.e;
        if (componentName == null) {
            activities = null;
        } else {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", componentName);
            intent.setAction(componentName.flattenToString());
            intent.setComponent(componentName);
            ArrayList arrayList = new ArrayList();
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(context.getPackageManager());
            }
            if (component != null) {
                int size = arrayList.size();
                try {
                    for (Intent a2 = tre.a(context, component); a2 != null; a2 = tre.a(context, a2.getComponent())) {
                        arrayList.add(size, a2);
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e);
                }
            }
            arrayList.add(intent);
            if (arrayList.isEmpty()) {
                dq9.m("No intents added to TaskStackBuilder; cannot getPendingIntent");
                return;
            } else {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                activities = PendingIntent.getActivities(context, 1, intentArr, 201326592, null);
            }
        }
        if (activities != null) {
            an7Var.g = activities;
        }
        hvd hvdVar = tn7Var.W;
        ce6 ce6Var = u;
        if (hvdVar != null) {
            ce6Var.b("actionsProvider != null", new Object[0]);
            int[] b = yif.b(hvdVar);
            this.g = b == null ? null : (int[]) b.clone();
            ArrayList a3 = yif.a(hvdVar);
            this.f = new ArrayList();
            if (a3 != null) {
                int size2 = a3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj = a3.get(i2);
                    i2++;
                    zl7 zl7Var = (zl7) obj;
                    String str = zl7Var.a;
                    if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || str.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || str.equals(MediaIntentReceiver.ACTION_FORWARD) || str.equals(MediaIntentReceiver.ACTION_REWIND) || str.equals(MediaIntentReceiver.ACTION_STOP_CASTING) || str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                        a = a(str);
                    } else {
                        Intent intent2 = new Intent(str);
                        intent2.setComponent(this.d);
                        a = new om7(zl7Var.b, PendingIntent.getBroadcast(context, 0, intent2, 67108864), zl7Var.c).b();
                    }
                    if (a != null) {
                        this.f.add(a);
                    }
                }
            }
        } else {
            ce6Var.b("actionsProvider == null", new Object[0]);
            this.f = new ArrayList();
            ArrayList arrayList2 = tn7Var.a;
            int size3 = arrayList2.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList2.get(i3);
                i3++;
                pm7 a4 = a((String) obj2);
                if (a4 != null) {
                    this.f.add(a4);
                }
            }
            int[] iArr = tn7Var.b;
            this.g = (int[]) Arrays.copyOf(iArr, iArr.length).clone();
        }
        ArrayList arrayList3 = this.f;
        int size4 = arrayList3.size();
        while (i < size4) {
            Object obj3 = arrayList3.get(i);
            i++;
            pm7 pm7Var = (pm7) obj3;
            if (pm7Var != null) {
                an7Var.b.add(pm7Var);
            }
        }
        bn7 bn7Var = new bn7();
        bn7Var.e = null;
        int[] iArr2 = this.g;
        if (iArr2 != null) {
            bn7Var.e = iArr2;
        }
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) this.k.e;
        if (mediaSessionCompat$Token != null) {
            bn7Var.f = mediaSessionCompat$Token;
        }
        an7Var.i(bn7Var);
        notificationManager.notify("castMediaNotification", 1, an7Var.b());
    }
}
